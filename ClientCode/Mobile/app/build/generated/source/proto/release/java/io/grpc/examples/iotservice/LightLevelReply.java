// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iot_service.proto

package io.grpc.examples.iotservice;

/**
 * Protobuf type {@code iot_service.LightLevelReply}
 */
public  final class LightLevelReply extends
    com.google.protobuf.GeneratedMessageLite<
        LightLevelReply, LightLevelReply.Builder> implements
    // @@protoc_insertion_point(message_implements:iot_service.LightLevelReply)
    LightLevelReplyOrBuilder {
  private LightLevelReply() {
    status_ = "";
    lightLevel_ = "";
  }
  public static final int STATUS_FIELD_NUMBER = 1;
  private java.lang.String status_;
  /**
   * <code>string status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    return status_;
  }
  /**
   * <code>string status = 1;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(status_);
  }
  /**
   * <code>string status = 1;</code>
   * @param value The status to set.
   */
  private void setStatus(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    status_ = value;
  }
  /**
   * <code>string status = 1;</code>
   */
  private void clearStatus() {
    
    status_ = getDefaultInstance().getStatus();
  }
  /**
   * <code>string status = 1;</code>
   * @param value The bytes for status to set.
   */
  private void setStatusBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    status_ = value.toStringUtf8();
    
  }

  public static final int LIGHTLEVEL_FIELD_NUMBER = 2;
  private java.lang.String lightLevel_;
  /**
   * <code>string lightLevel = 2;</code>
   * @return The lightLevel.
   */
  @java.lang.Override
  public java.lang.String getLightLevel() {
    return lightLevel_;
  }
  /**
   * <code>string lightLevel = 2;</code>
   * @return The bytes for lightLevel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLightLevelBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(lightLevel_);
  }
  /**
   * <code>string lightLevel = 2;</code>
   * @param value The lightLevel to set.
   */
  private void setLightLevel(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    lightLevel_ = value;
  }
  /**
   * <code>string lightLevel = 2;</code>
   */
  private void clearLightLevel() {
    
    lightLevel_ = getDefaultInstance().getLightLevel();
  }
  /**
   * <code>string lightLevel = 2;</code>
   * @param value The bytes for lightLevel to set.
   */
  private void setLightLevelBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    lightLevel_ = value.toStringUtf8();
    
  }

  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.LightLevelReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.iotservice.LightLevelReply prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code iot_service.LightLevelReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.grpc.examples.iotservice.LightLevelReply, Builder> implements
      // @@protoc_insertion_point(builder_implements:iot_service.LightLevelReply)
      io.grpc.examples.iotservice.LightLevelReplyOrBuilder {
    // Construct using io.grpc.examples.iotservice.LightLevelReply.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public java.lang.String getStatus() {
      return instance.getStatus();
    }
    /**
     * <code>string status = 1;</code>
     * @return The bytes for status.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStatusBytes() {
      return instance.getStatusBytes();
    }
    /**
     * <code>string status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      copyOnWrite();
      instance.setStatus(value);
      return this;
    }
    /**
     * <code>string status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      copyOnWrite();
      instance.clearStatus();
      return this;
    }
    /**
     * <code>string status = 1;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setStatusBytes(value);
      return this;
    }

    /**
     * <code>string lightLevel = 2;</code>
     * @return The lightLevel.
     */
    @java.lang.Override
    public java.lang.String getLightLevel() {
      return instance.getLightLevel();
    }
    /**
     * <code>string lightLevel = 2;</code>
     * @return The bytes for lightLevel.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLightLevelBytes() {
      return instance.getLightLevelBytes();
    }
    /**
     * <code>string lightLevel = 2;</code>
     * @param value The lightLevel to set.
     * @return This builder for chaining.
     */
    public Builder setLightLevel(
        java.lang.String value) {
      copyOnWrite();
      instance.setLightLevel(value);
      return this;
    }
    /**
     * <code>string lightLevel = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLightLevel() {
      copyOnWrite();
      instance.clearLightLevel();
      return this;
    }
    /**
     * <code>string lightLevel = 2;</code>
     * @param value The bytes for lightLevel to set.
     * @return This builder for chaining.
     */
    public Builder setLightLevelBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLightLevelBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iot_service.LightLevelReply)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.grpc.examples.iotservice.LightLevelReply();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "status_",
            "lightLevel_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.grpc.examples.iotservice.LightLevelReply> parser = PARSER;
        if (parser == null) {
          synchronized (io.grpc.examples.iotservice.LightLevelReply.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.grpc.examples.iotservice.LightLevelReply>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:iot_service.LightLevelReply)
  private static final io.grpc.examples.iotservice.LightLevelReply DEFAULT_INSTANCE;
  static {
    LightLevelReply defaultInstance = new LightLevelReply();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LightLevelReply.class, defaultInstance);
  }

  public static io.grpc.examples.iotservice.LightLevelReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LightLevelReply> PARSER;

  public static com.google.protobuf.Parser<LightLevelReply> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
