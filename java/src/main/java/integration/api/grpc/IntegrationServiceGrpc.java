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
public final class IntegrationServiceGrpc {

  private IntegrationServiceGrpc() {}

  public static final String SERVICE_NAME = "VeriBlock.IntegrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getResetSecurityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetSecurity",
      requestType = integration.api.grpc.VeriBlockMessages.EmptyRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getResetSecurityMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getResetSecurityMethod;
    if ((getResetSecurityMethod = IntegrationServiceGrpc.getResetSecurityMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getResetSecurityMethod = IntegrationServiceGrpc.getResetSecurityMethod) == null) {
          IntegrationServiceGrpc.getResetSecurityMethod = getResetSecurityMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetSecurity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("ResetSecurity"))
              .build();
        }
      }
    }
    return getResetSecurityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddGenesisVeriBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGenesisVeriBlock",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddGenesisVeriBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getAddGenesisVeriBlockMethod;
    if ((getAddGenesisVeriBlockMethod = IntegrationServiceGrpc.getAddGenesisVeriBlockMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getAddGenesisVeriBlockMethod = IntegrationServiceGrpc.getAddGenesisVeriBlockMethod) == null) {
          IntegrationServiceGrpc.getAddGenesisVeriBlockMethod = getAddGenesisVeriBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGenesisVeriBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("AddGenesisVeriBlock"))
              .build();
        }
      }
    }
    return getAddGenesisVeriBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddGenesisBitcoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGenesisBitcoin",
      requestType = integration.api.grpc.VeriBlockMessages.BitcoinBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddGenesisBitcoinMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getAddGenesisBitcoinMethod;
    if ((getAddGenesisBitcoinMethod = IntegrationServiceGrpc.getAddGenesisBitcoinMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getAddGenesisBitcoinMethod = IntegrationServiceGrpc.getAddGenesisBitcoinMethod) == null) {
          IntegrationServiceGrpc.getAddGenesisBitcoinMethod = getAddGenesisBitcoinMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGenesisBitcoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("AddGenesisBitcoin"))
              .build();
        }
      }
    }
    return getAddGenesisBitcoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AddPayloadsRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddPayloadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPayloads",
      requestType = integration.api.grpc.VeriBlockMessages.AddPayloadsRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AddPayloadsRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddPayloadsMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AddPayloadsRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getAddPayloadsMethod;
    if ((getAddPayloadsMethod = IntegrationServiceGrpc.getAddPayloadsMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getAddPayloadsMethod = IntegrationServiceGrpc.getAddPayloadsMethod) == null) {
          IntegrationServiceGrpc.getAddPayloadsMethod = getAddPayloadsMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AddPayloadsRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPayloads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AddPayloadsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("AddPayloads"))
              .build();
        }
      }
    }
    return getAddPayloadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getRemovePayloadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePayloads",
      requestType = integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getRemovePayloadsMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getRemovePayloadsMethod;
    if ((getRemovePayloadsMethod = IntegrationServiceGrpc.getRemovePayloadsMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getRemovePayloadsMethod = IntegrationServiceGrpc.getRemovePayloadsMethod) == null) {
          IntegrationServiceGrpc.getRemovePayloadsMethod = getRemovePayloadsMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePayloads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("RemovePayloads"))
              .build();
        }
      }
    }
    return getRemovePayloadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddTemporaryPayloadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTemporaryPayloads",
      requestType = integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getAddTemporaryPayloadsMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getAddTemporaryPayloadsMethod;
    if ((getAddTemporaryPayloadsMethod = IntegrationServiceGrpc.getAddTemporaryPayloadsMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getAddTemporaryPayloadsMethod = IntegrationServiceGrpc.getAddTemporaryPayloadsMethod) == null) {
          IntegrationServiceGrpc.getAddTemporaryPayloadsMethod = getAddTemporaryPayloadsMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTemporaryPayloads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("AddTemporaryPayloads"))
              .build();
        }
      }
    }
    return getAddTemporaryPayloadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getClearTemporaryPayloadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearTemporaryPayloads",
      requestType = integration.api.grpc.VeriBlockMessages.EmptyRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getClearTemporaryPayloadsMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getClearTemporaryPayloadsMethod;
    if ((getClearTemporaryPayloadsMethod = IntegrationServiceGrpc.getClearTemporaryPayloadsMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getClearTemporaryPayloadsMethod = IntegrationServiceGrpc.getClearTemporaryPayloadsMethod) == null) {
          IntegrationServiceGrpc.getClearTemporaryPayloadsMethod = getClearTemporaryPayloadsMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.EmptyRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearTemporaryPayloads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("ClearTemporaryPayloads"))
              .build();
        }
      }
    }
    return getClearTemporaryPayloadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest,
      integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply> getSimplifyVTBsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimplifyVTBs",
      requestType = integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest,
      integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply> getSimplifyVTBsMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest, integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply> getSimplifyVTBsMethod;
    if ((getSimplifyVTBsMethod = IntegrationServiceGrpc.getSimplifyVTBsMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getSimplifyVTBsMethod = IntegrationServiceGrpc.getSimplifyVTBsMethod) == null) {
          IntegrationServiceGrpc.getSimplifyVTBsMethod = getSimplifyVTBsMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest, integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimplifyVTBs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("SimplifyVTBs"))
              .build();
        }
      }
    }
    return getSimplifyVTBsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckATVAgainstViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckATVAgainstView",
      requestType = integration.api.grpc.VeriBlockMessages.AltPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckATVAgainstViewMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckATVAgainstViewMethod;
    if ((getCheckATVAgainstViewMethod = IntegrationServiceGrpc.getCheckATVAgainstViewMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getCheckATVAgainstViewMethod = IntegrationServiceGrpc.getCheckATVAgainstViewMethod) == null) {
          IntegrationServiceGrpc.getCheckATVAgainstViewMethod = getCheckATVAgainstViewMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckATVAgainstView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("CheckATVAgainstView"))
              .build();
        }
      }
    }
    return getCheckATVAgainstViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckVTBInternallyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckVTBInternally",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckVTBInternallyMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckVTBInternallyMethod;
    if ((getCheckVTBInternallyMethod = IntegrationServiceGrpc.getCheckVTBInternallyMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getCheckVTBInternallyMethod = IntegrationServiceGrpc.getCheckVTBInternallyMethod) == null) {
          IntegrationServiceGrpc.getCheckVTBInternallyMethod = getCheckVTBInternallyMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckVTBInternally"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("CheckVTBInternally"))
              .build();
        }
      }
    }
    return getCheckVTBInternallyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckATVInternallyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckATVInternally",
      requestType = integration.api.grpc.VeriBlockMessages.AltPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckATVInternallyMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckATVInternallyMethod;
    if ((getCheckATVInternallyMethod = IntegrationServiceGrpc.getCheckATVInternallyMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getCheckATVInternallyMethod = IntegrationServiceGrpc.getCheckATVInternallyMethod) == null) {
          IntegrationServiceGrpc.getCheckATVInternallyMethod = getCheckATVInternallyMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckATVInternally"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("CheckATVInternally"))
              .build();
        }
      }
    }
    return getCheckATVInternallyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply> getGetMainVBKHeightOfATVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMainVBKHeightOfATV",
      requestType = integration.api.grpc.VeriBlockMessages.AltPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply> getGetMainVBKHeightOfATVMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply> getGetMainVBKHeightOfATVMethod;
    if ((getGetMainVBKHeightOfATVMethod = IntegrationServiceGrpc.getGetMainVBKHeightOfATVMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getGetMainVBKHeightOfATVMethod = IntegrationServiceGrpc.getGetMainVBKHeightOfATVMethod) == null) {
          IntegrationServiceGrpc.getGetMainVBKHeightOfATVMethod = getGetMainVBKHeightOfATVMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMainVBKHeightOfATV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("GetMainVBKHeightOfATV"))
              .build();
        }
      }
    }
    return getGetMainVBKHeightOfATVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltChainConfigRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getSetAltChainParametersConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAltChainParametersConfig",
      requestType = integration.api.grpc.VeriBlockMessages.AltChainConfigRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltChainConfigRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getSetAltChainParametersConfigMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltChainConfigRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getSetAltChainParametersConfigMethod;
    if ((getSetAltChainParametersConfigMethod = IntegrationServiceGrpc.getSetAltChainParametersConfigMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getSetAltChainParametersConfigMethod = IntegrationServiceGrpc.getSetAltChainParametersConfigMethod) == null) {
          IntegrationServiceGrpc.getSetAltChainParametersConfigMethod = getSetAltChainParametersConfigMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltChainConfigRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAltChainParametersConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltChainConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("SetAltChainParametersConfig"))
              .build();
        }
      }
    }
    return getSetAltChainParametersConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest,
      integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply> getGetLastKnownVBKBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastKnownVBKBlocks",
      requestType = integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest,
      integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply> getGetLastKnownVBKBlocksMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest, integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply> getGetLastKnownVBKBlocksMethod;
    if ((getGetLastKnownVBKBlocksMethod = IntegrationServiceGrpc.getGetLastKnownVBKBlocksMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getGetLastKnownVBKBlocksMethod = IntegrationServiceGrpc.getGetLastKnownVBKBlocksMethod) == null) {
          IntegrationServiceGrpc.getGetLastKnownVBKBlocksMethod = getGetLastKnownVBKBlocksMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest, integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastKnownVBKBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("GetLastKnownVBKBlocks"))
              .build();
        }
      }
    }
    return getGetLastKnownVBKBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest,
      integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply> getGetLastKnownBTCBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastKnownBTCBlocks",
      requestType = integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest,
      integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply> getGetLastKnownBTCBlocksMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest, integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply> getGetLastKnownBTCBlocksMethod;
    if ((getGetLastKnownBTCBlocksMethod = IntegrationServiceGrpc.getGetLastKnownBTCBlocksMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getGetLastKnownBTCBlocksMethod = IntegrationServiceGrpc.getGetLastKnownBTCBlocksMethod) == null) {
          IntegrationServiceGrpc.getGetLastKnownBTCBlocksMethod = getGetLastKnownBTCBlocksMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest, integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastKnownBTCBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("GetLastKnownBTCBlocks"))
              .build();
        }
      }
    }
    return getGetLastKnownBTCBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getSavePoPTransactionDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SavePoPTransactionData",
      requestType = integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getSavePoPTransactionDataMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest, integration.api.grpc.VeriBlockMessages.GeneralReply> getSavePoPTransactionDataMethod;
    if ((getSavePoPTransactionDataMethod = IntegrationServiceGrpc.getSavePoPTransactionDataMethod) == null) {
      synchronized (IntegrationServiceGrpc.class) {
        if ((getSavePoPTransactionDataMethod = IntegrationServiceGrpc.getSavePoPTransactionDataMethod) == null) {
          IntegrationServiceGrpc.getSavePoPTransactionDataMethod = getSavePoPTransactionDataMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SavePoPTransactionData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationServiceMethodDescriptorSupplier("SavePoPTransactionData"))
              .build();
        }
      }
    }
    return getSavePoPTransactionDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegrationServiceStub newStub(io.grpc.Channel channel) {
    return new IntegrationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntegrationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntegrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntegrationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IntegrationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void resetSecurity(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getResetSecurityMethod(), responseObserver);
    }

    /**
     */
    public void addGenesisVeriBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGenesisVeriBlockMethod(), responseObserver);
    }

    /**
     */
    public void addGenesisBitcoin(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGenesisBitcoinMethod(), responseObserver);
    }

    /**
     */
    public void addPayloads(integration.api.grpc.VeriBlockMessages.AddPayloadsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPayloadsMethod(), responseObserver);
    }

    /**
     */
    public void removePayloads(integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRemovePayloadsMethod(), responseObserver);
    }

    /**
     */
    public void addTemporaryPayloads(integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTemporaryPayloadsMethod(), responseObserver);
    }

    /**
     */
    public void clearTemporaryPayloads(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getClearTemporaryPayloadsMethod(), responseObserver);
    }

    /**
     */
    public void simplifyVTBs(integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSimplifyVTBsMethod(), responseObserver);
    }

    /**
     */
    public void checkATVAgainstView(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckATVAgainstViewMethod(), responseObserver);
    }

    /**
     */
    public void checkVTBInternally(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckVTBInternallyMethod(), responseObserver);
    }

    /**
     */
    public void checkATVInternally(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckATVInternallyMethod(), responseObserver);
    }

    /**
     */
    public void getMainVBKHeightOfATV(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMainVBKHeightOfATVMethod(), responseObserver);
    }

    /**
     */
    public void setAltChainParametersConfig(integration.api.grpc.VeriBlockMessages.AltChainConfigRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAltChainParametersConfigMethod(), responseObserver);
    }

    /**
     */
    public void getLastKnownVBKBlocks(integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLastKnownVBKBlocksMethod(), responseObserver);
    }

    /**
     */
    public void getLastKnownBTCBlocks(integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLastKnownBTCBlocksMethod(), responseObserver);
    }

    /**
     */
    public void savePoPTransactionData(integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePoPTransactionDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getResetSecurityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.EmptyRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_RESET_SECURITY)))
          .addMethod(
            getAddGenesisVeriBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_ADD_GENESIS_VERI_BLOCK)))
          .addMethod(
            getAddGenesisBitcoinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BitcoinBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_ADD_GENESIS_BITCOIN)))
          .addMethod(
            getAddPayloadsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AddPayloadsRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_ADD_PAYLOADS)))
          .addMethod(
            getRemovePayloadsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_REMOVE_PAYLOADS)))
          .addMethod(
            getAddTemporaryPayloadsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_ADD_TEMPORARY_PAYLOADS)))
          .addMethod(
            getClearTemporaryPayloadsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.EmptyRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CLEAR_TEMPORARY_PAYLOADS)))
          .addMethod(
            getSimplifyVTBsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest,
                integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply>(
                  this, METHODID_SIMPLIFY_VTBS)))
          .addMethod(
            getCheckATVAgainstViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_ATVAGAINST_VIEW)))
          .addMethod(
            getCheckVTBInternallyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_VTBINTERNALLY)))
          .addMethod(
            getCheckATVInternallyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_ATVINTERNALLY)))
          .addMethod(
            getGetMainVBKHeightOfATVMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltPublication,
                integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply>(
                  this, METHODID_GET_MAIN_VBKHEIGHT_OF_ATV)))
          .addMethod(
            getSetAltChainParametersConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltChainConfigRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_SET_ALT_CHAIN_PARAMETERS_CONFIG)))
          .addMethod(
            getGetLastKnownVBKBlocksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest,
                integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply>(
                  this, METHODID_GET_LAST_KNOWN_VBKBLOCKS)))
          .addMethod(
            getGetLastKnownBTCBlocksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest,
                integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply>(
                  this, METHODID_GET_LAST_KNOWN_BTCBLOCKS)))
          .addMethod(
            getSavePoPTransactionDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_SAVE_PO_PTRANSACTION_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class IntegrationServiceStub extends io.grpc.stub.AbstractStub<IntegrationServiceStub> {
    private IntegrationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationServiceStub(channel, callOptions);
    }

    /**
     */
    public void resetSecurity(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetSecurityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGenesisVeriBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGenesisVeriBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addGenesisBitcoin(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGenesisBitcoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPayloads(integration.api.grpc.VeriBlockMessages.AddPayloadsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPayloadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removePayloads(integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemovePayloadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTemporaryPayloads(integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTemporaryPayloadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearTemporaryPayloads(integration.api.grpc.VeriBlockMessages.EmptyRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearTemporaryPayloadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void simplifyVTBs(integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimplifyVTBsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkATVAgainstView(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckATVAgainstViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkVTBInternally(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckVTBInternallyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkATVInternally(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckATVInternallyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMainVBKHeightOfATV(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMainVBKHeightOfATVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAltChainParametersConfig(integration.api.grpc.VeriBlockMessages.AltChainConfigRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAltChainParametersConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastKnownVBKBlocks(integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLastKnownVBKBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastKnownBTCBlocks(integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLastKnownBTCBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void savePoPTransactionData(integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePoPTransactionDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntegrationServiceBlockingStub extends io.grpc.stub.AbstractStub<IntegrationServiceBlockingStub> {
    private IntegrationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply resetSecurity(integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getResetSecurityMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply addGenesisVeriBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return blockingUnaryCall(
          getChannel(), getAddGenesisVeriBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply addGenesisBitcoin(integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return blockingUnaryCall(
          getChannel(), getAddGenesisBitcoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply addPayloads(integration.api.grpc.VeriBlockMessages.AddPayloadsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPayloadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply removePayloads(integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemovePayloadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply addTemporaryPayloads(integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddTemporaryPayloadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply clearTemporaryPayloads(integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearTemporaryPayloadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply simplifyVTBs(integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSimplifyVTBsMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkATVAgainstView(integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return blockingUnaryCall(
          getChannel(), getCheckATVAgainstViewMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkVTBInternally(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return blockingUnaryCall(
          getChannel(), getCheckVTBInternallyMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkATVInternally(integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return blockingUnaryCall(
          getChannel(), getCheckATVInternallyMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply getMainVBKHeightOfATV(integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return blockingUnaryCall(
          getChannel(), getGetMainVBKHeightOfATVMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply setAltChainParametersConfig(integration.api.grpc.VeriBlockMessages.AltChainConfigRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAltChainParametersConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply getLastKnownVBKBlocks(integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLastKnownVBKBlocksMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply getLastKnownBTCBlocks(integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLastKnownBTCBlocksMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply savePoPTransactionData(integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getSavePoPTransactionDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntegrationServiceFutureStub extends io.grpc.stub.AbstractStub<IntegrationServiceFutureStub> {
    private IntegrationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> resetSecurity(
        integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetSecurityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> addGenesisVeriBlock(
        integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGenesisVeriBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> addGenesisBitcoin(
        integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGenesisBitcoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> addPayloads(
        integration.api.grpc.VeriBlockMessages.AddPayloadsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPayloadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> removePayloads(
        integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemovePayloadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> addTemporaryPayloads(
        integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTemporaryPayloadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> clearTemporaryPayloads(
        integration.api.grpc.VeriBlockMessages.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearTemporaryPayloadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply> simplifyVTBs(
        integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSimplifyVTBsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkATVAgainstView(
        integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckATVAgainstViewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkVTBInternally(
        integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckVTBInternallyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkATVInternally(
        integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckATVInternallyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply> getMainVBKHeightOfATV(
        integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMainVBKHeightOfATVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> setAltChainParametersConfig(
        integration.api.grpc.VeriBlockMessages.AltChainConfigRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAltChainParametersConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply> getLastKnownVBKBlocks(
        integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLastKnownVBKBlocksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply> getLastKnownBTCBlocks(
        integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLastKnownBTCBlocksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> savePoPTransactionData(
        integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePoPTransactionDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESET_SECURITY = 0;
  private static final int METHODID_ADD_GENESIS_VERI_BLOCK = 1;
  private static final int METHODID_ADD_GENESIS_BITCOIN = 2;
  private static final int METHODID_ADD_PAYLOADS = 3;
  private static final int METHODID_REMOVE_PAYLOADS = 4;
  private static final int METHODID_ADD_TEMPORARY_PAYLOADS = 5;
  private static final int METHODID_CLEAR_TEMPORARY_PAYLOADS = 6;
  private static final int METHODID_SIMPLIFY_VTBS = 7;
  private static final int METHODID_CHECK_ATVAGAINST_VIEW = 8;
  private static final int METHODID_CHECK_VTBINTERNALLY = 9;
  private static final int METHODID_CHECK_ATVINTERNALLY = 10;
  private static final int METHODID_GET_MAIN_VBKHEIGHT_OF_ATV = 11;
  private static final int METHODID_SET_ALT_CHAIN_PARAMETERS_CONFIG = 12;
  private static final int METHODID_GET_LAST_KNOWN_VBKBLOCKS = 13;
  private static final int METHODID_GET_LAST_KNOWN_BTCBLOCKS = 14;
  private static final int METHODID_SAVE_PO_PTRANSACTION_DATA = 15;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegrationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntegrationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESET_SECURITY:
          serviceImpl.resetSecurity((integration.api.grpc.VeriBlockMessages.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_ADD_GENESIS_VERI_BLOCK:
          serviceImpl.addGenesisVeriBlock((integration.api.grpc.VeriBlockMessages.VeriBlockBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_ADD_GENESIS_BITCOIN:
          serviceImpl.addGenesisBitcoin((integration.api.grpc.VeriBlockMessages.BitcoinBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_ADD_PAYLOADS:
          serviceImpl.addPayloads((integration.api.grpc.VeriBlockMessages.AddPayloadsRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_REMOVE_PAYLOADS:
          serviceImpl.removePayloads((integration.api.grpc.VeriBlockMessages.RemovePayloadsRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_ADD_TEMPORARY_PAYLOADS:
          serviceImpl.addTemporaryPayloads((integration.api.grpc.VeriBlockMessages.AddTemporaryPayloadsRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CLEAR_TEMPORARY_PAYLOADS:
          serviceImpl.clearTemporaryPayloads((integration.api.grpc.VeriBlockMessages.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_SIMPLIFY_VTBS:
          serviceImpl.simplifyVTBs((integration.api.grpc.VeriBlockMessages.SimplifyVTBsRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.SimplifyVTBsReply>) responseObserver);
          break;
        case METHODID_CHECK_ATVAGAINST_VIEW:
          serviceImpl.checkATVAgainstView((integration.api.grpc.VeriBlockMessages.AltPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_VTBINTERNALLY:
          serviceImpl.checkVTBInternally((integration.api.grpc.VeriBlockMessages.VeriBlockPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_ATVINTERNALLY:
          serviceImpl.checkATVInternally((integration.api.grpc.VeriBlockMessages.AltPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_GET_MAIN_VBKHEIGHT_OF_ATV:
          serviceImpl.getMainVBKHeightOfATV((integration.api.grpc.VeriBlockMessages.AltPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetMainVBKHeightOfATVReply>) responseObserver);
          break;
        case METHODID_SET_ALT_CHAIN_PARAMETERS_CONFIG:
          serviceImpl.setAltChainParametersConfig((integration.api.grpc.VeriBlockMessages.AltChainConfigRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_GET_LAST_KNOWN_VBKBLOCKS:
          serviceImpl.getLastKnownVBKBlocks((integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetLastKnownVBKBlocksReply>) responseObserver);
          break;
        case METHODID_GET_LAST_KNOWN_BTCBLOCKS:
          serviceImpl.getLastKnownBTCBlocks((integration.api.grpc.VeriBlockMessages.GetLastKnownBlocksRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GetLastKnownBTCBlocksReply>) responseObserver);
          break;
        case METHODID_SAVE_PO_PTRANSACTION_DATA:
          serviceImpl.savePoPTransactionData((integration.api.grpc.VeriBlockMessages.SavePoPTransactionDataRequest) request,
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

  private static abstract class IntegrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntegrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return integration.api.grpc.VeriBlockMessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntegrationService");
    }
  }

  private static final class IntegrationServiceFileDescriptorSupplier
      extends IntegrationServiceBaseDescriptorSupplier {
    IntegrationServiceFileDescriptorSupplier() {}
  }

  private static final class IntegrationServiceMethodDescriptorSupplier
      extends IntegrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntegrationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntegrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntegrationServiceFileDescriptorSupplier())
              .addMethod(getResetSecurityMethod())
              .addMethod(getAddGenesisVeriBlockMethod())
              .addMethod(getAddGenesisBitcoinMethod())
              .addMethod(getAddPayloadsMethod())
              .addMethod(getRemovePayloadsMethod())
              .addMethod(getAddTemporaryPayloadsMethod())
              .addMethod(getClearTemporaryPayloadsMethod())
              .addMethod(getSimplifyVTBsMethod())
              .addMethod(getCheckATVAgainstViewMethod())
              .addMethod(getCheckVTBInternallyMethod())
              .addMethod(getCheckATVInternallyMethod())
              .addMethod(getGetMainVBKHeightOfATVMethod())
              .addMethod(getSetAltChainParametersConfigMethod())
              .addMethod(getGetLastKnownVBKBlocksMethod())
              .addMethod(getGetLastKnownBTCBlocksMethod())
              .addMethod(getSavePoPTransactionDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
