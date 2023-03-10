// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iot_service.proto

package io.grpc.examples.iotservice;

/**
 * Protobuf type {@code iot_service.UserRequest}
 */
public  final class UserRequest extends
    com.google.protobuf.GeneratedMessageLite<
        UserRequest, UserRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:iot_service.UserRequest)
    UserRequestOrBuilder {
  private UserRequest() {
    login_ = "";
    password_ = "";
  }
  public static final int LOGIN_FIELD_NUMBER = 1;
  private java.lang.String login_;
  /**
   * <code>string login = 1;</code>
   * @return The login.
   */
  @java.lang.Override
  public java.lang.String getLogin() {
    return login_;
  }
  /**
   * <code>string login = 1;</code>
   * @return The bytes for login.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLoginBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(login_);
  }
  /**
   * <code>string login = 1;</code>
   * @param value The login to set.
   */
  private void setLogin(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    login_ = value;
  }
  /**
   * <code>string login = 1;</code>
   */
  private void clearLogin() {
    
    login_ = getDefaultInstance().getLogin();
  }
  /**
   * <code>string login = 1;</code>
   * @param value The bytes for login to set.
   */
  private void setLoginBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    login_ = value.toStringUtf8();
    
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  private java.lang.String password_;
  /**
   * <code>string password = 2;</code>
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    return password_;
  }
  /**
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(password_);
  }
  /**
   * <code>string password = 2;</code>
   * @param value The password to set.
   */
  private void setPassword(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    password_ = value;
  }
  /**
   * <code>string password = 2;</code>
   */
  private void clearPassword() {
    
    password_ = getDefaultInstance().getPassword();
  }
  /**
   * <code>string password = 2;</code>
   * @param value The bytes for password to set.
   */
  private void setPasswordBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    password_ = value.toStringUtf8();
    
  }

  public static final int ACCESS_FIELD_NUMBER = 3;
  private int access_;
  /**
   * <code>uint32 access = 3;</code>
   * @return The access.
   */
  @java.lang.Override
  public int getAccess() {
    return access_;
  }
  /**
   * <code>uint32 access = 3;</code>
   * @param value The access to set.
   */
  private void setAccess(int value) {
    
    access_ = value;
  }
  /**
   * <code>uint32 access = 3;</code>
   */
  private void clearAccess() {
    
    access_ = 0;
  }

  public static final int KEY_FIELD_NUMBER = 4;
  private int key_;
  /**
   * <code>uint32 key = 4;</code>
   * @return The key.
   */
  @java.lang.Override
  public int getKey() {
    return key_;
  }
  /**
   * <code>uint32 key = 4;</code>
   * @param value The key to set.
   */
  private void setKey(int value) {
    
    key_ = value;
  }
  /**
   * <code>uint32 key = 4;</code>
   */
  private void clearKey() {
    
    key_ = 0;
  }

  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.UserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.UserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static io.grpc.examples.iotservice.UserRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.iotservice.UserRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code iot_service.UserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        io.grpc.examples.iotservice.UserRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:iot_service.UserRequest)
      io.grpc.examples.iotservice.UserRequestOrBuilder {
    // Construct using io.grpc.examples.iotservice.UserRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string login = 1;</code>
     * @return The login.
     */
    @java.lang.Override
    public java.lang.String getLogin() {
      return instance.getLogin();
    }
    /**
     * <code>string login = 1;</code>
     * @return The bytes for login.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLoginBytes() {
      return instance.getLoginBytes();
    }
    /**
     * <code>string login = 1;</code>
     * @param value The login to set.
     * @return This builder for chaining.
     */
    public Builder setLogin(
        java.lang.String value) {
      copyOnWrite();
      instance.setLogin(value);
      return this;
    }
    /**
     * <code>string login = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogin() {
      copyOnWrite();
      instance.clearLogin();
      return this;
    }
    /**
     * <code>string login = 1;</code>
     * @param value The bytes for login to set.
     * @return This builder for chaining.
     */
    public Builder setLoginBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLoginBytes(value);
      return this;
    }

    /**
     * <code>string password = 2;</code>
     * @return The password.
     */
    @java.lang.Override
    public java.lang.String getPassword() {
      return instance.getPassword();
    }
    /**
     * <code>string password = 2;</code>
     * @return The bytes for password.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      return instance.getPasswordBytes();
    }
    /**
     * <code>string password = 2;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      copyOnWrite();
      instance.setPassword(value);
      return this;
    }
    /**
     * <code>string password = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      copyOnWrite();
      instance.clearPassword();
      return this;
    }
    /**
     * <code>string password = 2;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPasswordBytes(value);
      return this;
    }

    /**
     * <code>uint32 access = 3;</code>
     * @return The access.
     */
    @java.lang.Override
    public int getAccess() {
      return instance.getAccess();
    }
    /**
     * <code>uint32 access = 3;</code>
     * @param value The access to set.
     * @return This builder for chaining.
     */
    public Builder setAccess(int value) {
      copyOnWrite();
      instance.setAccess(value);
      return this;
    }
    /**
     * <code>uint32 access = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccess() {
      copyOnWrite();
      instance.clearAccess();
      return this;
    }

    /**
     * <code>uint32 key = 4;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return instance.getKey();
    }
    /**
     * <code>uint32 key = 4;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(int value) {
      copyOnWrite();
      instance.setKey(value);
      return this;
    }
    /**
     * <code>uint32 key = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      copyOnWrite();
      instance.clearKey();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:iot_service.UserRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new io.grpc.examples.iotservice.UserRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "login_",
            "password_",
            "access_",
            "key_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u000b\u0004\u000b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<io.grpc.examples.iotservice.UserRequest> parser = PARSER;
        if (parser == null) {
          synchronized (io.grpc.examples.iotservice.UserRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<io.grpc.examples.iotservice.UserRequest>(
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


  // @@protoc_insertion_point(class_scope:iot_service.UserRequest)
  private static final io.grpc.examples.iotservice.UserRequest DEFAULT_INSTANCE;
  static {
    UserRequest defaultInstance = new UserRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UserRequest.class, defaultInstance);
  }

  public static io.grpc.examples.iotservice.UserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UserRequest> PARSER;

  public static com.google.protobuf.Parser<UserRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

