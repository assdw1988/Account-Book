package jap.com.util;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class DatabaseUtil {
	public static Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "zhanyang";
		String password = "g19880520";
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("load oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection create ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeAll(ResultSet rset, Statement stmt, Connection conn) {
		closeResource(rset);
		closeResource(stmt);
		closeResource(conn);
	}

	/**
	 * JDBCデータリソースを開放します。
	 * 
	 * @param rset
	 *            ResultSetオブジェクト
	 */
	public static void closeResource(ResultSet rset) {
		try {
			if (rset != null) {
				rset.close();
			}
		} catch (SQLException e) {
		}
	}

	/**
	 * JDBCデータリソースを開放します。
	 * 
	 * @param stmt
	 *            Statementオブジェクト
	 */
	public static void closeResource(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
		}
	}
	
	/**
	 * JDBCデータリソースを開放します。
	 * 
	 * @param conn
	 *            Connectionオブジェクト
	 */
	public static void closeResource(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
		}
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T getTypedObject(ResultSet rset, int columnIndex, Class type) throws SQLException {
		if (type == null) {
			return (T) rset.getObject(columnIndex);
		} else if (type.equals(Date.class)) {
			Timestamp ts = rset.getTimestamp(columnIndex);
			if (ts != null) {
				return (T) new Date(ts.getTime());
			} else {
				return null;
			}
		} else if (type.equals(Long.class)) {
			BigDecimal bd = rset.getBigDecimal(columnIndex);
			if (bd != null) {
				return (T) Long.valueOf(bd.longValue());
			} else {
				return null;
			}
		} else if (type.equals(Long.class)) {
			return (T) rset.getString(columnIndex);
		} else {
			return (T) rset.getObject(columnIndex);
		}
	}
	
	public static void bindParameters(PreparedStatement pstmt, Object[] parameters) throws SQLException {
		for (int i = 0; i < parameters.length; i++) {
			if (parameters[i] != null) {
			} else {
			}
			Object obj = parameters[i];
			pstmt.setObject(i + 1, adjustValue(obj), getSqlType(parameters[i]));
		}
	}
	
	public static Object adjustValue(Object obj) {
		if (obj instanceof Date) {
			obj = new Timestamp(((Date) obj).getTime());
		}
		return obj;
	}

	public static int getSqlType(Object obj) {
		int result = Types.OTHER;
		if (obj == null) {
			result = Types.NULL;
		} else if (obj instanceof Date) {
			result = Types.TIMESTAMP;
		} else if (obj instanceof Number) {
			result = Types.NUMERIC;
		} else if (obj instanceof String) {
			result = Types.VARCHAR;
		} else {
			result = Types.OTHER;
		}
		return result;
	}
	
	public static List<HashMap<Object, Object>> selectFirst(String sql, Connection conn, Object[] parameters) {
		PreparedStatement stmt = null;
		ResultSet rset = null;

		List <HashMap<Object, Object>> result = new ArrayList<>();

		try {
			stmt = conn.prepareStatement(sql);
			bindParameters(stmt, parameters);
			rset = stmt.executeQuery();
			ResultSetMetaData data= rset.getMetaData();
			
			while(rset.next()) {
				HashMap<Object, Object> hm = new HashMap<Object, Object>();
				
				for(int i=1;i<=data.getColumnCount();i++){
					String columnName = data.getColumnName(i);
					String value = rset.getString(i);
					hm.put(columnName, value);
				}
				result.add(hm);
			}
		} catch (Exception e) {
		  e.printStackTrace();
		  closeAll(rset, stmt, conn);
		} finally {
		  closeAll(rset, stmt, conn);
		}
		return result;
	}
}
