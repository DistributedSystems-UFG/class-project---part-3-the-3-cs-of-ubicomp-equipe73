package io.grpc.examples.iotservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The temperature service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: iot_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IoTServiceGrpc {

  private IoTServiceGrpc() {}

  public static final String SERVICE_NAME = "iot_service.IoTService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.TemperatureRequest,
      io.grpc.examples.iotservice.TemperatureReply> getSayTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayTemperature",
      requestType = io.grpc.examples.iotservice.TemperatureRequest.class,
      responseType = io.grpc.examples.iotservice.TemperatureReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.TemperatureRequest,
      io.grpc.examples.iotservice.TemperatureReply> getSayTemperatureMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.TemperatureRequest, io.grpc.examples.iotservice.TemperatureReply> getSayTemperatureMethod;
    if ((getSayTemperatureMethod = IoTServiceGrpc.getSayTemperatureMethod) == null) {
      synchronized (IoTServiceGrpc.class) {
        if ((getSayTemperatureMethod = IoTServiceGrpc.getSayTemperatureMethod) == null) {
          IoTServiceGrpc.getSayTemperatureMethod = getSayTemperatureMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.TemperatureRequest, io.grpc.examples.iotservice.TemperatureReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.TemperatureReply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSayTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.UserRequest,
      io.grpc.examples.iotservice.StatusReply> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = io.grpc.examples.iotservice.UserRequest.class,
      responseType = io.grpc.examples.iotservice.StatusReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.UserRequest,
      io.grpc.examples.iotservice.StatusReply> getCreateUserMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.UserRequest, io.grpc.examples.iotservice.StatusReply> getCreateUserMethod;
    if ((getCreateUserMethod = IoTServiceGrpc.getCreateUserMethod) == null) {
      synchronized (IoTServiceGrpc.class) {
        if ((getCreateUserMethod = IoTServiceGrpc.getCreateUserMethod) == null) {
          IoTServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.UserRequest, io.grpc.examples.iotservice.StatusReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.StatusReply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LoginRequest,
      io.grpc.examples.iotservice.LoginReply> getUserLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserLogin",
      requestType = io.grpc.examples.iotservice.LoginRequest.class,
      responseType = io.grpc.examples.iotservice.LoginReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LoginRequest,
      io.grpc.examples.iotservice.LoginReply> getUserLoginMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LoginRequest, io.grpc.examples.iotservice.LoginReply> getUserLoginMethod;
    if ((getUserLoginMethod = IoTServiceGrpc.getUserLoginMethod) == null) {
      synchronized (IoTServiceGrpc.class) {
        if ((getUserLoginMethod = IoTServiceGrpc.getUserLoginMethod) == null) {
          IoTServiceGrpc.getUserLoginMethod = getUserLoginMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.LoginRequest, io.grpc.examples.iotservice.LoginReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.LoginReply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUserLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedRequest,
      io.grpc.examples.iotservice.LedReply> getBlinkLedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlinkLed",
      requestType = io.grpc.examples.iotservice.LedRequest.class,
      responseType = io.grpc.examples.iotservice.LedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedRequest,
      io.grpc.examples.iotservice.LedReply> getBlinkLedMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LedRequest, io.grpc.examples.iotservice.LedReply> getBlinkLedMethod;
    if ((getBlinkLedMethod = IoTServiceGrpc.getBlinkLedMethod) == null) {
      synchronized (IoTServiceGrpc.class) {
        if ((getBlinkLedMethod = IoTServiceGrpc.getBlinkLedMethod) == null) {
          IoTServiceGrpc.getBlinkLedMethod = getBlinkLedMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.LedRequest, io.grpc.examples.iotservice.LedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlinkLed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.LedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.LedReply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getBlinkLedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LightLevelRequest,
      io.grpc.examples.iotservice.LightLevelReply> getSayLightLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayLightLevel",
      requestType = io.grpc.examples.iotservice.LightLevelRequest.class,
      responseType = io.grpc.examples.iotservice.LightLevelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LightLevelRequest,
      io.grpc.examples.iotservice.LightLevelReply> getSayLightLevelMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.iotservice.LightLevelRequest, io.grpc.examples.iotservice.LightLevelReply> getSayLightLevelMethod;
    if ((getSayLightLevelMethod = IoTServiceGrpc.getSayLightLevelMethod) == null) {
      synchronized (IoTServiceGrpc.class) {
        if ((getSayLightLevelMethod = IoTServiceGrpc.getSayLightLevelMethod) == null) {
          IoTServiceGrpc.getSayLightLevelMethod = getSayLightLevelMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.iotservice.LightLevelRequest, io.grpc.examples.iotservice.LightLevelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayLightLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.LightLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.grpc.examples.iotservice.LightLevelReply.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSayLightLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IoTServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IoTServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IoTServiceStub>() {
        @java.lang.Override
        public IoTServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IoTServiceStub(channel, callOptions);
        }
      };
    return IoTServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IoTServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IoTServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IoTServiceBlockingStub>() {
        @java.lang.Override
        public IoTServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IoTServiceBlockingStub(channel, callOptions);
        }
      };
    return IoTServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IoTServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IoTServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IoTServiceFutureStub>() {
        @java.lang.Override
        public IoTServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IoTServiceFutureStub(channel, callOptions);
        }
      };
    return IoTServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The temperature service definition.
   * </pre>
   */
  public static abstract class IoTServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Responds with a temperature measurement
     * </pre>
     */
    public void sayTemperature(io.grpc.examples.iotservice.TemperatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.TemperatureReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void createUser(io.grpc.examples.iotservice.UserRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.StatusReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void userLogin(io.grpc.examples.iotservice.LoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LoginReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a command to the led
     * </pre>
     */
    public void blinkLed(io.grpc.examples.iotservice.LedRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlinkLedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Responds with the current reading of a given light sensor
     * </pre>
     */
    public void sayLightLevel(io.grpc.examples.iotservice.LightLevelRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LightLevelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayLightLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayTemperatureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.TemperatureRequest,
                io.grpc.examples.iotservice.TemperatureReply>(
                  this, METHODID_SAY_TEMPERATURE)))
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.UserRequest,
                io.grpc.examples.iotservice.StatusReply>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUserLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.LoginRequest,
                io.grpc.examples.iotservice.LoginReply>(
                  this, METHODID_USER_LOGIN)))
          .addMethod(
            getBlinkLedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.LedRequest,
                io.grpc.examples.iotservice.LedReply>(
                  this, METHODID_BLINK_LED)))
          .addMethod(
            getSayLightLevelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.iotservice.LightLevelRequest,
                io.grpc.examples.iotservice.LightLevelReply>(
                  this, METHODID_SAY_LIGHT_LEVEL)))
          .build();
    }
  }

  /**
   * <pre>
   * The temperature service definition.
   * </pre>
   */
  public static final class IoTServiceStub extends io.grpc.stub.AbstractAsyncStub<IoTServiceStub> {
    private IoTServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IoTServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IoTServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Responds with a temperature measurement
     * </pre>
     */
    public void sayTemperature(io.grpc.examples.iotservice.TemperatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.TemperatureReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(io.grpc.examples.iotservice.UserRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.StatusReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userLogin(io.grpc.examples.iotservice.LoginRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LoginReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a command to the led
     * </pre>
     */
    public void blinkLed(io.grpc.examples.iotservice.LedRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlinkLedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Responds with the current reading of a given light sensor
     * </pre>
     */
    public void sayLightLevel(io.grpc.examples.iotservice.LightLevelRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LightLevelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayLightLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The temperature service definition.
   * </pre>
   */
  public static final class IoTServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IoTServiceBlockingStub> {
    private IoTServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IoTServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IoTServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Responds with a temperature measurement
     * </pre>
     */
    public io.grpc.examples.iotservice.TemperatureReply sayTemperature(io.grpc.examples.iotservice.TemperatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.StatusReply createUser(io.grpc.examples.iotservice.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.iotservice.LoginReply userLogin(io.grpc.examples.iotservice.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a command to the led
     * </pre>
     */
    public io.grpc.examples.iotservice.LedReply blinkLed(io.grpc.examples.iotservice.LedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlinkLedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Responds with the current reading of a given light sensor
     * </pre>
     */
    public io.grpc.examples.iotservice.LightLevelReply sayLightLevel(io.grpc.examples.iotservice.LightLevelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayLightLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The temperature service definition.
   * </pre>
   */
  public static final class IoTServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IoTServiceFutureStub> {
    private IoTServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IoTServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IoTServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Responds with a temperature measurement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.TemperatureReply> sayTemperature(
        io.grpc.examples.iotservice.TemperatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.StatusReply> createUser(
        io.grpc.examples.iotservice.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.LoginReply> userLogin(
        io.grpc.examples.iotservice.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a command to the led
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.LedReply> blinkLed(
        io.grpc.examples.iotservice.LedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlinkLedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Responds with the current reading of a given light sensor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.iotservice.LightLevelReply> sayLightLevel(
        io.grpc.examples.iotservice.LightLevelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayLightLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_TEMPERATURE = 0;
  private static final int METHODID_CREATE_USER = 1;
  private static final int METHODID_USER_LOGIN = 2;
  private static final int METHODID_BLINK_LED = 3;
  private static final int METHODID_SAY_LIGHT_LEVEL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IoTServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IoTServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_TEMPERATURE:
          serviceImpl.sayTemperature((io.grpc.examples.iotservice.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.TemperatureReply>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((io.grpc.examples.iotservice.UserRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.StatusReply>) responseObserver);
          break;
        case METHODID_USER_LOGIN:
          serviceImpl.userLogin((io.grpc.examples.iotservice.LoginRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LoginReply>) responseObserver);
          break;
        case METHODID_BLINK_LED:
          serviceImpl.blinkLed((io.grpc.examples.iotservice.LedRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LedReply>) responseObserver);
          break;
        case METHODID_SAY_LIGHT_LEVEL:
          serviceImpl.sayLightLevel((io.grpc.examples.iotservice.LightLevelRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.iotservice.LightLevelReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IoTServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSayTemperatureMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUserLoginMethod())
              .addMethod(getBlinkLedMethod())
              .addMethod(getSayLightLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
