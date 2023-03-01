// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iot_service.proto

package io.grpc.examples.iotservice;

/**
 * <pre>
 * The request message containing the user's name.
 * </pre>
 *
 * Protobuf type {@code iot_service.TemperatureRequest}
 */
public  final class TemperatureRequest extends
    com.google.protobuf.GeneratedMessageLite<
        TemperatureRequest, TemperatureRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:iot_service.TemperatureRequest)
    TemperatureRequestOrBuilder {
  private TemperatureRequest() {
  }
  public static final int KEY_FIELD_NUMBER = 1;
  private int key_;
  /**
   * <code>uint32 key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public int getKey() {
    return key_;
  }
  /**
   * <code>uint32 key = 1;</code>
   * @param value The key to set.
   */
  private void setKey(int value) {
    
    key_ = value;
  }
  /**
   * <code>uint32 key = 1;</code>
   */
  private void clearKey() {
    
    key_ = 0;
  }

  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.TemperatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.iotservice.TemperatureRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * The request message containing the user's name.
   * </pre>
   *
   * Protobuf type {@code iot_service.TemperatureRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.grpc.examples.iotservice.TemperatureRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:iot_service.TemperatureRequest)
      io.grpc.examples.iotservice.TemperatureRequestOrBuilder {
    // Construct using io.grpc.examples.iotservice.TemperatureRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>uint32 key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return instance.getKey();
    }
    /**
     * <code>uint32 key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(int value) {
      copyOnWrite();
      instance.setKey(value);
      return this;
    }
    /**
     * <code>uint32 key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      copyOnWrite();
      instance.clearKey();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iot_service.TemperatureRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.grpc.examples.iotservice.TemperatureRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "key_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.grpc.examples.iotservice.TemperatureRequest> parser = PARSER;
        if (parser == null) {
          synchronized (io.grpc.examples.iotservice.TemperatureRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.grpc.examples.iotservice.TemperatureRequest>(
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


  // @@protoc_insertion_point(class_scope:iot_service.TemperatureRequest)
  private static final io.grpc.examples.iotservice.TemperatureRequest DEFAULT_INSTANCE;
  static {
    TemperatureRequest defaultInstance = new TemperatureRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TemperatureRequest.class, defaultInstance);
  }

  public static io.grpc.examples.iotservice.TemperatureRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TemperatureRequest> PARSER;

  public static com.google.protobuf.Parser<TemperatureRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
