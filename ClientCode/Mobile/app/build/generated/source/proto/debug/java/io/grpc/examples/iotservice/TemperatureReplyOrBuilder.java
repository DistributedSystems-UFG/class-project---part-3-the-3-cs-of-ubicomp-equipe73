// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iot_service.proto

package io.grpc.examples.iotservice;

public interface TemperatureReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:iot_service.TemperatureReply)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string status = 1;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 1;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string temperature = 2;</code>
   * @return The temperature.
   */
  java.lang.String getTemperature();
  /**
   * <code>string temperature = 2;</code>
   * @return The bytes for temperature.
   */
  com.google.protobuf.ByteString
      getTemperatureBytes();
}
