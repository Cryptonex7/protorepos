package helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: HelloWorld/service.proto")
public final class HelloWorldServiceGrpc {

  private HelloWorldServiceGrpc() {}

  public static final String SERVICE_NAME = "helloworld.HelloWorldService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<helloworld.Service.Request,
      helloworld.Service.Response> getHelloWorldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloWorld",
      requestType = helloworld.Service.Request.class,
      responseType = helloworld.Service.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<helloworld.Service.Request,
      helloworld.Service.Response> getHelloWorldMethod() {
    io.grpc.MethodDescriptor<helloworld.Service.Request, helloworld.Service.Response> getHelloWorldMethod;
    if ((getHelloWorldMethod = HelloWorldServiceGrpc.getHelloWorldMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getHelloWorldMethod = HelloWorldServiceGrpc.getHelloWorldMethod) == null) {
          HelloWorldServiceGrpc.getHelloWorldMethod = getHelloWorldMethod =
              io.grpc.MethodDescriptor.<helloworld.Service.Request, helloworld.Service.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloWorld"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.Service.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.Service.Response.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("HelloWorld"))
              .build();
        }
      }
    }
    return getHelloWorldMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceStub>() {
        @java.lang.Override
        public HelloWorldServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldServiceStub(channel, callOptions);
        }
      };
    return HelloWorldServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceBlockingStub>() {
        @java.lang.Override
        public HelloWorldServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloWorldServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceFutureStub>() {
        @java.lang.Override
        public HelloWorldServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldServiceFutureStub(channel, callOptions);
        }
      };
    return HelloWorldServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloWorldServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void helloWorld(helloworld.Service.Request request,
        io.grpc.stub.StreamObserver<helloworld.Service.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloWorldMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloWorldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                helloworld.Service.Request,
                helloworld.Service.Response>(
                  this, METHODID_HELLO_WORLD)))
          .build();
    }
  }

  /**
   */
  public static final class HelloWorldServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloWorldServiceStub> {
    private HelloWorldServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceStub(channel, callOptions);
    }

    /**
     */
    public void helloWorld(helloworld.Service.Request request,
        io.grpc.stub.StreamObserver<helloworld.Service.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloWorldMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloWorldServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloWorldServiceBlockingStub> {
    private HelloWorldServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public helloworld.Service.Response helloWorld(helloworld.Service.Request request) {
      return blockingUnaryCall(
          getChannel(), getHelloWorldMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloWorldServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloWorldServiceFutureStub> {
    private HelloWorldServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<helloworld.Service.Response> helloWorld(
        helloworld.Service.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloWorldMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO_WORLD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_WORLD:
          serviceImpl.helloWorld((helloworld.Service.Request) request,
              (io.grpc.stub.StreamObserver<helloworld.Service.Response>) responseObserver);
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

  private static abstract class HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return helloworld.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorldService");
    }
  }

  private static final class HelloWorldServiceFileDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier {
    HelloWorldServiceFileDescriptorSupplier() {}
  }

  private static final class HelloWorldServiceMethodDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloWorldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldServiceFileDescriptorSupplier())
              .addMethod(getHelloWorldMethod())
              .build();
        }
      }
    }
    return result;
  }
}
