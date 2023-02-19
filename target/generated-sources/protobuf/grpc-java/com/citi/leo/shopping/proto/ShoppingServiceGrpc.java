package com.citi.leo.shopping.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.0)",
    comments = "Source: shopping.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShoppingServiceGrpc {

  private ShoppingServiceGrpc() {}

  public static final String SERVICE_NAME = "shopping.ShoppingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest,
      com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest.class,
      responseType = com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest,
      com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest, com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> getSearchMethod;
    if ((getSearchMethod = ShoppingServiceGrpc.getSearchMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getSearchMethod = ShoppingServiceGrpc.getSearchMethod) == null) {
          ShoppingServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest, com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests,
      com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests.class,
      responseType = com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests,
      com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests, com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> getListMethod;
    if ((getListMethod = ShoppingServiceGrpc.getListMethod) == null) {
      synchronized (ShoppingServiceGrpc.class) {
        if ((getListMethod = ShoppingServiceGrpc.getListMethod) == null) {
          ShoppingServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests, com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShoppingServiceMethodDescriptorSupplier("list"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShoppingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceStub>() {
        @java.lang.Override
        public ShoppingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingServiceStub(channel, callOptions);
        }
      };
    return ShoppingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShoppingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceBlockingStub>() {
        @java.lang.Override
        public ShoppingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingServiceBlockingStub(channel, callOptions);
        }
      };
    return ShoppingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShoppingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShoppingServiceFutureStub>() {
        @java.lang.Override
        public ShoppingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShoppingServiceFutureStub(channel, callOptions);
        }
      };
    return ShoppingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ShoppingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest request,
        io.grpc.stub.StreamObserver<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void list(com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests request,
        io.grpc.stub.StreamObserver<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest,
                com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests,
                com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class ShoppingServiceStub extends io.grpc.stub.AbstractAsyncStub<ShoppingServiceStub> {
    private ShoppingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest request,
        io.grpc.stub.StreamObserver<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests request,
        io.grpc.stub.StreamObserver<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShoppingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ShoppingServiceBlockingStub> {
    private ShoppingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse search(com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> list(
        com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShoppingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ShoppingServiceFutureStub> {
    private ShoppingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShoppingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShoppingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse> search(
        com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShoppingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShoppingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequest) request,
              (io.grpc.stub.StreamObserver<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.citi.leo.shopping.proto.ShoppingProto.ShoppingRequests) request,
              (io.grpc.stub.StreamObserver<com.citi.leo.shopping.proto.ShoppingProto.ShoppingResponse>) responseObserver);
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

  private static abstract class ShoppingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShoppingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.citi.leo.shopping.proto.ShoppingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShoppingService");
    }
  }

  private static final class ShoppingServiceFileDescriptorSupplier
      extends ShoppingServiceBaseDescriptorSupplier {
    ShoppingServiceFileDescriptorSupplier() {}
  }

  private static final class ShoppingServiceMethodDescriptorSupplier
      extends ShoppingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShoppingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShoppingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShoppingServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
