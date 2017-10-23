package jap.com.util;

import jap.com.utility.ArrayUtil;

public class SimpleQuery implements Query {

  private static final long serialVersionUID = 1L;

  private Object[] parameters = new Object[0];

  private String sqlString = "";

  public SimpleQuery() {
  }

  public SimpleQuery(String query, Object... parameters) {
    this.setSqlString(query);
    this.setParameters(parameters);
  }

  public String getSqlString() {
    return sqlString;
  }

  public void setSqlString(String sqlString) {
    this.sqlString = sqlString;
  }

  public Object[] getParameters() {
    return ArrayUtil.immutableCopy(parameters);
  }

  public void setParameters(Object... parameters) {
    this.parameters = ArrayUtil.immutableCopy(parameters);
  }

}
