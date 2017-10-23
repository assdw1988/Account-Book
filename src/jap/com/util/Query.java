package jap.com.util;

import java.io.Serializable;

public interface Query extends Serializable {

  String getSqlString();

  Object[] getParameters();
}
