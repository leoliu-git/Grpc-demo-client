package com.citi.leo.account.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.0)",
    comments = "Source: account.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "account.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.citi.leo.account.proto.AccountProto.RegistrationRequest,
      com.citi.leo.account.proto.AccountProto.RegistrationResponse> getRegisterAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerAccount",
      requestType = com.citi.leo.account.proto.AccountProto.RegistrationRequest.class,
      responseType = com.citi.leo.account.proto.AccountProto.RegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.citi.leo.account.proto.AccountProto.RegistrationRequest,
      com.citi.leo.account.proto.AccountProto.RegistrationResponse> getRegisterAccountMethod() {
    io.grpc.MethodDescriptor<com.citi.leo.account.proto.AccountProto.RegistrationRequest, com.citi.leo.account.proto.AccountProto.RegistrationResponse> getRegisterAccountMethod;
    if ((getRegisterAccountMethod = AccountServiceGrpc.getRegisterAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getRegisterAccountMethod = AccountServiceGrpc.getRegisterAccountMethod) == null) {
          AccountServiceGrpc.getRegisterAccountMethod = getRegisterAccountMethod =
              io.grpc.MethodDescriptor.<com.citi.leo.account.proto.AccountProto.RegistrationRequest, com.citi.leo.account.proto.AccountProto.RegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.account.proto.AccountProto.RegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.account.proto.AccountProto.RegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("registerAccount"))
              .build();
        }
      }
    }
    return getRegisterAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.citi.leo.account.proto.AccountProto.RegistrationRequest,
      com.citi.leo.account.proto.AccountProto.RegistrationResponse> getRegisterAndNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerAndNotify",
      requestType = com.citi.leo.account.proto.AccountProto.RegistrationRequest.class,
      responseType = com.citi.leo.account.proto.AccountProto.RegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.citi.leo.account.proto.AccountProto.RegistrationRequest,
      com.citi.leo.account.proto.AccountProto.RegistrationResponse> getRegisterAndNotifyMethod() {
    io.grpc.MethodDescriptor<com.citi.leo.account.proto.AccountProto.RegistrationRequest, com.citi.leo.account.proto.AccountProto.RegistrationResponse> getRegisterAndNotifyMethod;
    if ((getRegisterAndNotifyMethod = AccountServiceGrpc.getRegisterAndNotifyMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getRegisterAndNotifyMethod = AccountServiceGrpc.getRegisterAndNotifyMethod) == null) {
          AccountServiceGrpc.getRegisterAndNotifyMethod = getRegisterAndNotifyMethod =
              io.grpc.MethodDescriptor.<com.citi.leo.account.proto.AccountProto.RegistrationRequest, com.citi.leo.account.proto.AccountProto.RegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerAndNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.account.proto.AccountProto.RegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.account.proto.AccountProto.RegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("registerAndNotify"))
              .build();
        }
      }
    }
    return getRegisterAndNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationRequest> registerAccount(
        io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRegisterAccountMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationRequest> registerAndNotify(
        io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRegisterAndNotifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterAccountMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.citi.leo.account.proto.AccountProto.RegistrationRequest,
                com.citi.leo.account.proto.AccountProto.RegistrationResponse>(
                  this, METHODID_REGISTER_ACCOUNT)))
          .addMethod(
            getRegisterAndNotifyMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.citi.leo.account.proto.AccountProto.RegistrationRequest,
                com.citi.leo.account.proto.AccountProto.RegistrationResponse>(
                  this, METHODID_REGISTER_AND_NOTIFY)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationRequest> registerAccount(
        io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationRequest> registerAndNotify(
        io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRegisterAndNotifyMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REGISTER_ACCOUNT = 0;
  private static final int METHODID_REGISTER_AND_NOTIFY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ACCOUNT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.registerAccount(
              (io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationResponse>) responseObserver);
        case METHODID_REGISTER_AND_NOTIFY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.registerAndNotify(
              (io.grpc.stub.StreamObserver<com.citi.leo.account.proto.AccountProto.RegistrationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.citi.leo.account.proto.AccountProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getRegisterAccountMethod())
              .addMethod(getRegisterAndNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
