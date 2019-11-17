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
public final class RewardsServiceGrpc {

  private RewardsServiceGrpc() {}

  public static final String SERVICE_NAME = "VeriBlock.RewardsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getResetRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetRewards",
      requestType = integration.api.grpc.VeriBlockMessages.EmptyRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getResetRewardsMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getResetRewardsMethod;
    if ((getResetRewardsMethod = RewardsServiceGrpc.getResetRewardsMethod) == null) {
      synchronized (RewardsServiceGrpc.class) {
        if ((getResetRewardsMethod = RewardsServiceGrpc.getResetRewardsMethod) == null) {
          RewardsServiceGrpc.getResetRewardsMethod = getResetRewardsMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new RewardsServiceMethodDescriptorSupplier("ResetRewards"))
              .build();
        }
      }
    }
    return getResetRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GetCalculatorReply> getGetCalculatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCalculator",
      requestType = integration.api.grpc.VeriBlockMessages.EmptyRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GetCalculatorReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GetCalculatorReply> getGetCalculatorMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GetCalculatorReply> getGetCalculatorMethod;
    if ((getGetCalculatorMethod = RewardsServiceGrpc.getGetCalculatorMethod) == null) {
      synchronized (RewardsServiceGrpc.class) {
        if ((getGetCalculatorMethod = RewardsServiceGrpc.getGetCalculatorMethod) == null) {
          RewardsServiceGrpc.getGetCalculatorMethod = getGetCalculatorMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GetCalculatorReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCalculator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GetCalculatorReply.getDefaultInstance()))
              .setSchemaDescriptor(new RewardsServiceMethodDescriptorSupplier("GetCalculator"))
              .build();
        }
      }
    }
    return getGetCalculatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest,
      integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> getRewardsCalculateScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsCalculateScore",
      requestType = integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest,
      integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> getRewardsCalculateScoreMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest, integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> getRewardsCalculateScoreMethod;
    if ((getRewardsCalculateScoreMethod = RewardsServiceGrpc.getRewardsCalculateScoreMethod) == null) {
      synchronized (RewardsServiceGrpc.class) {
        if ((getRewardsCalculateScoreMethod = RewardsServiceGrpc.getRewardsCalculateScoreMethod) == null) {
          RewardsServiceGrpc.getRewardsCalculateScoreMethod = getRewardsCalculateScoreMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest, integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsCalculateScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply.getDefaultInstance()))
              .setSchemaDescriptor(new RewardsServiceMethodDescriptorSupplier("RewardsCalculateScore"))
              .build();
        }
      }
    }
    return getRewardsCalculateScoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest,
      integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply> getRewardsCalculateOutputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsCalculateOutputs",
      requestType = integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest,
      integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply> getRewardsCalculateOutputsMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest, integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply> getRewardsCalculateOutputsMethod;
    if ((getRewardsCalculateOutputsMethod = RewardsServiceGrpc.getRewardsCalculateOutputsMethod) == null) {
      synchronized (RewardsServiceGrpc.class) {
        if ((getRewardsCalculateOutputsMethod = RewardsServiceGrpc.getRewardsCalculateOutputsMethod) == null) {
          RewardsServiceGrpc.getRewardsCalculateOutputsMethod = getRewardsCalculateOutputsMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest, integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsCalculateOutputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply.getDefaultInstance()))
              .setSchemaDescriptor(new RewardsServiceMethodDescriptorSupplier("RewardsCalculateOutputs"))
              .build();
        }
      }
    }
    return getRewardsCalculateOutputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest,
      integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> getRewardsCalculatePopDifficultyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsCalculatePopDifficulty",
      requestType = integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest,
      integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> getRewardsCalculatePopDifficultyMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest, integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> getRewardsCalculatePopDifficultyMethod;
    if ((getRewardsCalculatePopDifficultyMethod = RewardsServiceGrpc.getRewardsCalculatePopDifficultyMethod) == null) {
      synchronized (RewardsServiceGrpc.class) {
        if ((getRewardsCalculatePopDifficultyMethod = RewardsServiceGrpc.getRewardsCalculatePopDifficultyMethod) == null) {
          RewardsServiceGrpc.getRewardsCalculatePopDifficultyMethod = getRewardsCalculatePopDifficultyMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest, integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsCalculatePopDifficulty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply.getDefaultInstance()))
              .setSchemaDescriptor(new RewardsServiceMethodDescriptorSupplier("RewardsCalculatePopDifficulty"))
              .build();
        }
      }
    }
    return getRewardsCalculatePopDifficultyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RewardsServiceStub newStub(io.grpc.Channel channel) {
    return new RewardsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RewardsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RewardsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RewardsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RewardsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RewardsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void resetRewards(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getResetRewardsMethod(), responseObserver);
    }

    /**
     */
    public void getCalculator(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetCalculatorReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCalculatorMethod(), responseObserver);
    }

    /**
     */
    public void rewardsCalculateScore(integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRewardsCalculateScoreMethod(), responseObserver);
    }

    /**
     */
    public void rewardsCalculateOutputs(integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRewardsCalculateOutputsMethod(), responseObserver);
    }

    /**
     */
    public void rewardsCalculatePopDifficulty(integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRewardsCalculatePopDifficultyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getResetRewardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.EmptyRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_RESET_REWARDS)))
          .addMethod(
            getGetCalculatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.EmptyRequest,
                integration.api.grpc.VeriBlockMessages.GetCalculatorReply>(
                  this, METHODID_GET_CALCULATOR)))
          .addMethod(
            getRewardsCalculateScoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest,
                integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply>(
                  this, METHODID_REWARDS_CALCULATE_SCORE)))
          .addMethod(
            getRewardsCalculateOutputsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest,
                integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply>(
                  this, METHODID_REWARDS_CALCULATE_OUTPUTS)))
          .addMethod(
            getRewardsCalculatePopDifficultyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest,
                integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply>(
                  this, METHODID_REWARDS_CALCULATE_POP_DIFFICULTY)))
          .build();
    }
  }

  /**
   */
  public static final class RewardsServiceStub extends io.grpc.stub.AbstractStub<RewardsServiceStub> {
    private RewardsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RewardsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RewardsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RewardsServiceStub(channel, callOptions);
    }

    /**
     */
    public void resetRewards(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCalculator(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetCalculatorReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCalculatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rewardsCalculateScore(integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRewardsCalculateScoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rewardsCalculateOutputs(integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRewardsCalculateOutputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rewardsCalculatePopDifficulty(integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRewardsCalculatePopDifficultyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RewardsServiceBlockingStub extends io.grpc.stub.AbstractStub<RewardsServiceBlockingStub> {
    private RewardsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RewardsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RewardsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RewardsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply resetRewards(integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GetCalculatorReply getCalculator(integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCalculatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply rewardsCalculateScore(integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest request) {
      return blockingUnaryCall(
          getChannel(), getRewardsCalculateScoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply rewardsCalculateOutputs(integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRewardsCalculateOutputsMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply rewardsCalculatePopDifficulty(integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest request) {
      return blockingUnaryCall(
          getChannel(), getRewardsCalculatePopDifficultyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RewardsServiceFutureStub extends io.grpc.stub.AbstractStub<RewardsServiceFutureStub> {
    private RewardsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RewardsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RewardsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RewardsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> resetRewards(
        integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GetCalculatorReply> getCalculator(
        integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCalculatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> rewardsCalculateScore(
        integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRewardsCalculateScoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply> rewardsCalculateOutputs(
        integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRewardsCalculateOutputsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply> rewardsCalculatePopDifficulty(
        integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRewardsCalculatePopDifficultyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESET_REWARDS = 0;
  private static final int METHODID_GET_CALCULATOR = 1;
  private static final int METHODID_REWARDS_CALCULATE_SCORE = 2;
  private static final int METHODID_REWARDS_CALCULATE_OUTPUTS = 3;
  private static final int METHODID_REWARDS_CALCULATE_POP_DIFFICULTY = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RewardsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RewardsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESET_REWARDS:
          serviceImpl.resetRewards((integration.api.grpc.VeriBlockMessages.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_GET_CALCULATOR:
          serviceImpl.getCalculator((integration.api.grpc.VeriBlockMessages.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetCalculatorReply>) responseObserver);
          break;
        case METHODID_REWARDS_CALCULATE_SCORE:
          serviceImpl.rewardsCalculateScore((integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply>) responseObserver);
          break;
        case METHODID_REWARDS_CALCULATE_OUTPUTS:
          serviceImpl.rewardsCalculateOutputs((integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateOutputsReply>) responseObserver);
          break;
        case METHODID_REWARDS_CALCULATE_POP_DIFFICULTY:
          serviceImpl.rewardsCalculatePopDifficulty((integration.api.grpc.VeriBlockMessages.RewardsCalculatePopDifficultyRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.RewardsCalculateScoreReply>) responseObserver);
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

  private static abstract class RewardsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RewardsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return integration.api.grpc.VeriBlockMessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RewardsService");
    }
  }

  private static final class RewardsServiceFileDescriptorSupplier
      extends RewardsServiceBaseDescriptorSupplier {
    RewardsServiceFileDescriptorSupplier() {}
  }

  private static final class RewardsServiceMethodDescriptorSupplier
      extends RewardsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RewardsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RewardsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RewardsServiceFileDescriptorSupplier())
              .addMethod(getResetRewardsMethod())
              .addMethod(getGetCalculatorMethod())
              .addMethod(getRewardsCalculateScoreMethod())
              .addMethod(getRewardsCalculateOutputsMethod())
              .addMethod(getRewardsCalculatePopDifficultyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
