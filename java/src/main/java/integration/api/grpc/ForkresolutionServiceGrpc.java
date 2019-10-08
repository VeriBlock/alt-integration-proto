package integration.api.grpc;

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
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: integration.proto")
public final class ForkresolutionServiceGrpc {

  private ForkresolutionServiceGrpc() {}

  public static final String SERVICE_NAME = "VeriBlock.ForkresolutionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.TwoBranchesRequest,
      integration.api.grpc.VeriBlockMessages.CompareReply> getCompareTwoBranchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompareTwoBranches",
      requestType = integration.api.grpc.VeriBlockMessages.TwoBranchesRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.CompareReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.TwoBranchesRequest,
      integration.api.grpc.VeriBlockMessages.CompareReply> getCompareTwoBranchesMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.TwoBranchesRequest, integration.api.grpc.VeriBlockMessages.CompareReply> getCompareTwoBranchesMethod;
    if ((getCompareTwoBranchesMethod = ForkresolutionServiceGrpc.getCompareTwoBranchesMethod) == null) {
      synchronized (ForkresolutionServiceGrpc.class) {
        if ((getCompareTwoBranchesMethod = ForkresolutionServiceGrpc.getCompareTwoBranchesMethod) == null) {
          ForkresolutionServiceGrpc.getCompareTwoBranchesMethod = getCompareTwoBranchesMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.TwoBranchesRequest, integration.api.grpc.VeriBlockMessages.CompareReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompareTwoBranches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.TwoBranchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.CompareReply.getDefaultInstance()))
              .setSchemaDescriptor(new ForkresolutionServiceMethodDescriptorSupplier("CompareTwoBranches"))
              .build();
        }
      }
    }
    return getCompareTwoBranchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getSetForkresolutionConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetForkresolutionConfig",
      requestType = integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getSetForkresolutionConfigMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getSetForkresolutionConfigMethod;
    if ((getSetForkresolutionConfigMethod = ForkresolutionServiceGrpc.getSetForkresolutionConfigMethod) == null) {
      synchronized (ForkresolutionServiceGrpc.class) {
        if ((getSetForkresolutionConfigMethod = ForkresolutionServiceGrpc.getSetForkresolutionConfigMethod) == null) {
          ForkresolutionServiceGrpc.getSetForkresolutionConfigMethod = getSetForkresolutionConfigMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetForkresolutionConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ForkresolutionServiceMethodDescriptorSupplier("SetForkresolutionConfig"))
              .build();
        }
      }
    }
    return getSetForkresolutionConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ForkresolutionServiceStub newStub(io.grpc.Channel channel) {
    return new ForkresolutionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ForkresolutionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ForkresolutionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ForkresolutionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ForkresolutionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ForkresolutionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void compareTwoBranches(integration.api.grpc.VeriBlockMessages.TwoBranchesRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.CompareReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCompareTwoBranchesMethod(), responseObserver);
    }

    /**
     */
    public void setForkresolutionConfig(integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSetForkresolutionConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCompareTwoBranchesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.TwoBranchesRequest,
                integration.api.grpc.VeriBlockMessages.CompareReply>(
                  this, METHODID_COMPARE_TWO_BRANCHES)))
          .addMethod(
            getSetForkresolutionConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_SET_FORKRESOLUTION_CONFIG)))
          .build();
    }
  }

  /**
   */
  public static final class ForkresolutionServiceStub extends io.grpc.stub.AbstractStub<ForkresolutionServiceStub> {
    private ForkresolutionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ForkresolutionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForkresolutionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ForkresolutionServiceStub(channel, callOptions);
    }

    /**
     */
    public void compareTwoBranches(integration.api.grpc.VeriBlockMessages.TwoBranchesRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.CompareReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompareTwoBranchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setForkresolutionConfig(integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetForkresolutionConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ForkresolutionServiceBlockingStub extends io.grpc.stub.AbstractStub<ForkresolutionServiceBlockingStub> {
    private ForkresolutionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ForkresolutionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForkresolutionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ForkresolutionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.CompareReply compareTwoBranches(integration.api.grpc.VeriBlockMessages.TwoBranchesRequest request) {
      return blockingUnaryCall(
          getChannel(), getCompareTwoBranchesMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply setForkresolutionConfig(integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetForkresolutionConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ForkresolutionServiceFutureStub extends io.grpc.stub.AbstractStub<ForkresolutionServiceFutureStub> {
    private ForkresolutionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ForkresolutionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ForkresolutionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ForkresolutionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.CompareReply> compareTwoBranches(
        integration.api.grpc.VeriBlockMessages.TwoBranchesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCompareTwoBranchesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> setForkresolutionConfig(
        integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetForkresolutionConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPARE_TWO_BRANCHES = 0;
  private static final int METHODID_SET_FORKRESOLUTION_CONFIG = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ForkresolutionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ForkresolutionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMPARE_TWO_BRANCHES:
          serviceImpl.compareTwoBranches((integration.api.grpc.VeriBlockMessages.TwoBranchesRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.CompareReply>) responseObserver);
          break;
        case METHODID_SET_FORKRESOLUTION_CONFIG:
          serviceImpl.setForkresolutionConfig((integration.api.grpc.VeriBlockMessages.ForkresolutionConfigRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
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

  private static abstract class ForkresolutionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ForkresolutionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return integration.api.grpc.VeriBlockMessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ForkresolutionService");
    }
  }

  private static final class ForkresolutionServiceFileDescriptorSupplier
      extends ForkresolutionServiceBaseDescriptorSupplier {
    ForkresolutionServiceFileDescriptorSupplier() {}
  }

  private static final class ForkresolutionServiceMethodDescriptorSupplier
      extends ForkresolutionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ForkresolutionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ForkresolutionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ForkresolutionServiceFileDescriptorSupplier())
              .addMethod(getCompareTwoBranchesMethod())
              .addMethod(getSetForkresolutionConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
