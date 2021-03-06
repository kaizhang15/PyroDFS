package org.apache.hadoop.hdfs.server.blockmanagement;

public class ReplicaGroupUtil {
  public static final String SEPARATOR_CHAR = ":";

  public static long getReplicaGroupID(String replicaGroupStr) {
    if (null == replicaGroupStr)
      return -1;
    return Long.parseLong(replicaGroupStr);
  }

  /*
  public static long getReplicaGroupID(String replicaGroupStr) {
    int startIndex = replicaGroupStr.lastIndexOf(SEPARATOR_CHAR);
    String strId = replicaGroupStr.substring(startIndex + 1);
    if (null == strId || strId.isEmpty()) {
       throw new IllegalStateException("Shen Li: Illegal replica "
           + "group id in " + replicaGroupStr);
    }
    return Long.parseLong(strId);
  }
  */

  /*
  public static String getPrefix(String replicaGroupStr) {
    if (null == replicaGroupStr)
      return null;
    int endIndex = replicaGroupStr.lastIndexOf(SEPARATOR_CHAR);
    if (endIndex < 0) {
      throw new IllegalStateException("Shen Li: replica group "
          + replicaGroupStr + " is in invalid form");
    }
    return replicaGroupStr.substring(0, endIndex);
  }
  */

  public static void main(String args[]) {
    System.out.println("decode result: " + getReplicaGroupID(args[0]));
  }

}
