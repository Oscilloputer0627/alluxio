// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_worker.proto

package alluxio.grpc;

public interface SessionFileSystemHeartbeatPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.SessionFileSystemHeartbeatPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** the id of the current session 
   * </pre>
   *
   * <code>optional int64 sessionId = 1;</code>
   */
  boolean hasSessionId();
  /**
   * <pre>
   ** the id of the current session 
   * </pre>
   *
   * <code>optional int64 sessionId = 1;</code>
   */
  long getSessionId();

  /**
   * <pre>
   ** the client metrics. deprecated since 1.3.0 and will be removed in 2.0 
   * </pre>
   *
   * <code>repeated int64 metrics = 2;</code>
   */
  java.util.List<java.lang.Long> getMetricsList();
  /**
   * <pre>
   ** the client metrics. deprecated since 1.3.0 and will be removed in 2.0 
   * </pre>
   *
   * <code>repeated int64 metrics = 2;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   ** the client metrics. deprecated since 1.3.0 and will be removed in 2.0 
   * </pre>
   *
   * <code>repeated int64 metrics = 2;</code>
   */
  long getMetrics(int index);

  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.SessionFileSystemHeartbeatPOptions options = 3;</code>
   */
  boolean hasOptions();
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.SessionFileSystemHeartbeatPOptions options = 3;</code>
   */
  alluxio.grpc.SessionFileSystemHeartbeatPOptions getOptions();
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.SessionFileSystemHeartbeatPOptions options = 3;</code>
   */
  alluxio.grpc.SessionFileSystemHeartbeatPOptionsOrBuilder getOptionsOrBuilder();
}
