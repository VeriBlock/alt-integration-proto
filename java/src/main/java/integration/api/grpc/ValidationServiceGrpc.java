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
public final class ValidationServiceGrpc {

  private ValidationServiceGrpc() {}

  public static final String SERVICE_NAME = "VeriBlock.ValidationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockPoPTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyVeriBlockPoPTx",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockPoPTxMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockPoPTxMethod;
    if ((getVerifyVeriBlockPoPTxMethod = ValidationServiceGrpc.getVerifyVeriBlockPoPTxMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getVerifyVeriBlockPoPTxMethod = ValidationServiceGrpc.getVerifyVeriBlockPoPTxMethod) == null) {
          ValidationServiceGrpc.getVerifyVeriBlockPoPTxMethod = getVerifyVeriBlockPoPTxMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyVeriBlockPoPTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("VerifyVeriBlockPoPTx"))
              .build();
        }
      }
    }
    return getVerifyVeriBlockPoPTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckSignatureVeriBlockPoPTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckSignatureVeriBlockPoPTx",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckSignatureVeriBlockPoPTxMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckSignatureVeriBlockPoPTxMethod;
    if ((getCheckSignatureVeriBlockPoPTxMethod = ValidationServiceGrpc.getCheckSignatureVeriBlockPoPTxMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckSignatureVeriBlockPoPTxMethod = ValidationServiceGrpc.getCheckSignatureVeriBlockPoPTxMethod) == null) {
          ValidationServiceGrpc.getCheckSignatureVeriBlockPoPTxMethod = getCheckSignatureVeriBlockPoPTxMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckSignatureVeriBlockPoPTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckSignatureVeriBlockPoPTx"))
              .build();
        }
      }
    }
    return getCheckSignatureVeriBlockPoPTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinTransactionForPoPDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckBitcoinTransactionForPoPData",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinTransactionForPoPDataMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinTransactionForPoPDataMethod;
    if ((getCheckBitcoinTransactionForPoPDataMethod = ValidationServiceGrpc.getCheckBitcoinTransactionForPoPDataMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckBitcoinTransactionForPoPDataMethod = ValidationServiceGrpc.getCheckBitcoinTransactionForPoPDataMethod) == null) {
          ValidationServiceGrpc.getCheckBitcoinTransactionForPoPDataMethod = getCheckBitcoinTransactionForPoPDataMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckBitcoinTransactionForPoPData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckBitcoinTransactionForPoPData"))
              .build();
        }
      }
    }
    return getCheckBitcoinTransactionForPoPDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinMerklePathVeriBlockPoPTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckBitcoinMerklePathVeriBlockPoPTx",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinMerklePathVeriBlockPoPTxMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinMerklePathVeriBlockPoPTxMethod;
    if ((getCheckBitcoinMerklePathVeriBlockPoPTxMethod = ValidationServiceGrpc.getCheckBitcoinMerklePathVeriBlockPoPTxMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckBitcoinMerklePathVeriBlockPoPTxMethod = ValidationServiceGrpc.getCheckBitcoinMerklePathVeriBlockPoPTxMethod) == null) {
          ValidationServiceGrpc.getCheckBitcoinMerklePathVeriBlockPoPTxMethod = getCheckBitcoinMerklePathVeriBlockPoPTxMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckBitcoinMerklePathVeriBlockPoPTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckBitcoinMerklePathVeriBlockPoPTx"))
              .build();
        }
      }
    }
    return getCheckBitcoinMerklePathVeriBlockPoPTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinBlocksVeriBlockPoPTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckBitcoinBlocksVeriBlockPoPTx",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinBlocksVeriBlockPoPTxMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBitcoinBlocksVeriBlockPoPTxMethod;
    if ((getCheckBitcoinBlocksVeriBlockPoPTxMethod = ValidationServiceGrpc.getCheckBitcoinBlocksVeriBlockPoPTxMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckBitcoinBlocksVeriBlockPoPTxMethod = ValidationServiceGrpc.getCheckBitcoinBlocksVeriBlockPoPTxMethod) == null) {
          ValidationServiceGrpc.getCheckBitcoinBlocksVeriBlockPoPTxMethod = getCheckBitcoinBlocksVeriBlockPoPTxMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckBitcoinBlocksVeriBlockPoPTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckBitcoinBlocksVeriBlockPoPTx"))
              .build();
        }
      }
    }
    return getCheckBitcoinBlocksVeriBlockPoPTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyVeriBlockPublication",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockPublicationMethod;
    if ((getVerifyVeriBlockPublicationMethod = ValidationServiceGrpc.getVerifyVeriBlockPublicationMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getVerifyVeriBlockPublicationMethod = ValidationServiceGrpc.getVerifyVeriBlockPublicationMethod) == null) {
          ValidationServiceGrpc.getVerifyVeriBlockPublicationMethod = getVerifyVeriBlockPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyVeriBlockPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("VerifyVeriBlockPublication"))
              .build();
        }
      }
    }
    return getVerifyVeriBlockPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBlocksVeriBlockPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckBlocksVeriBlockPublication",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBlocksVeriBlockPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBlocksVeriBlockPublicationMethod;
    if ((getCheckBlocksVeriBlockPublicationMethod = ValidationServiceGrpc.getCheckBlocksVeriBlockPublicationMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckBlocksVeriBlockPublicationMethod = ValidationServiceGrpc.getCheckBlocksVeriBlockPublicationMethod) == null) {
          ValidationServiceGrpc.getCheckBlocksVeriBlockPublicationMethod = getCheckBlocksVeriBlockPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckBlocksVeriBlockPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckBlocksVeriBlockPublication"))
              .build();
        }
      }
    }
    return getCheckBlocksVeriBlockPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMerklePathVeriBlockPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMerklePathVeriBlockPublication",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMerklePathVeriBlockPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMerklePathVeriBlockPublicationMethod;
    if ((getCheckMerklePathVeriBlockPublicationMethod = ValidationServiceGrpc.getCheckMerklePathVeriBlockPublicationMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckMerklePathVeriBlockPublicationMethod = ValidationServiceGrpc.getCheckMerklePathVeriBlockPublicationMethod) == null) {
          ValidationServiceGrpc.getCheckMerklePathVeriBlockPublicationMethod = getCheckMerklePathVeriBlockPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckMerklePathVeriBlockPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckMerklePathVeriBlockPublication"))
              .build();
        }
      }
    }
    return getCheckMerklePathVeriBlockPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyVeriBlockTransaction",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockTransactionMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockTransactionMethod;
    if ((getVerifyVeriBlockTransactionMethod = ValidationServiceGrpc.getVerifyVeriBlockTransactionMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getVerifyVeriBlockTransactionMethod = ValidationServiceGrpc.getVerifyVeriBlockTransactionMethod) == null) {
          ValidationServiceGrpc.getVerifyVeriBlockTransactionMethod = getVerifyVeriBlockTransactionMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyVeriBlockTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("VerifyVeriBlockTransaction"))
              .build();
        }
      }
    }
    return getVerifyVeriBlockTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckSignatureVeriBlockTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckSignatureVeriBlockTransaction",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckSignatureVeriBlockTransactionMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckSignatureVeriBlockTransactionMethod;
    if ((getCheckSignatureVeriBlockTransactionMethod = ValidationServiceGrpc.getCheckSignatureVeriBlockTransactionMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckSignatureVeriBlockTransactionMethod = ValidationServiceGrpc.getCheckSignatureVeriBlockTransactionMethod) == null) {
          ValidationServiceGrpc.getCheckSignatureVeriBlockTransactionMethod = getCheckSignatureVeriBlockTransactionMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckSignatureVeriBlockTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckSignatureVeriBlockTransaction"))
              .build();
        }
      }
    }
    return getCheckSignatureVeriBlockTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyVeriBlockBlock",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyVeriBlockBlockMethod;
    if ((getVerifyVeriBlockBlockMethod = ValidationServiceGrpc.getVerifyVeriBlockBlockMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getVerifyVeriBlockBlockMethod = ValidationServiceGrpc.getVerifyVeriBlockBlockMethod) == null) {
          ValidationServiceGrpc.getVerifyVeriBlockBlockMethod = getVerifyVeriBlockBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyVeriBlockBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("VerifyVeriBlockBlock"))
              .build();
        }
      }
    }
    return getVerifyVeriBlockBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckProofOfWorkVeriBlockBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckProofOfWorkVeriBlockBlock",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckProofOfWorkVeriBlockBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckProofOfWorkVeriBlockBlockMethod;
    if ((getCheckProofOfWorkVeriBlockBlockMethod = ValidationServiceGrpc.getCheckProofOfWorkVeriBlockBlockMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckProofOfWorkVeriBlockBlockMethod = ValidationServiceGrpc.getCheckProofOfWorkVeriBlockBlockMethod) == null) {
          ValidationServiceGrpc.getCheckProofOfWorkVeriBlockBlockMethod = getCheckProofOfWorkVeriBlockBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckProofOfWorkVeriBlockBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckProofOfWorkVeriBlockBlock"))
              .build();
        }
      }
    }
    return getCheckProofOfWorkVeriBlockBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMaximumDriftVeriBlockBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMaximumDriftVeriBlockBlock",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMaximumDriftVeriBlockBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMaximumDriftVeriBlockBlockMethod;
    if ((getCheckMaximumDriftVeriBlockBlockMethod = ValidationServiceGrpc.getCheckMaximumDriftVeriBlockBlockMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckMaximumDriftVeriBlockBlockMethod = ValidationServiceGrpc.getCheckMaximumDriftVeriBlockBlockMethod) == null) {
          ValidationServiceGrpc.getCheckMaximumDriftVeriBlockBlockMethod = getCheckMaximumDriftVeriBlockBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckMaximumDriftVeriBlockBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckMaximumDriftVeriBlockBlock"))
              .build();
        }
      }
    }
    return getCheckMaximumDriftVeriBlockBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyBitcoinBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyBitcoinBlock",
      requestType = integration.api.grpc.VeriBlockMessages.BitcoinBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyBitcoinBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyBitcoinBlockMethod;
    if ((getVerifyBitcoinBlockMethod = ValidationServiceGrpc.getVerifyBitcoinBlockMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getVerifyBitcoinBlockMethod = ValidationServiceGrpc.getVerifyBitcoinBlockMethod) == null) {
          ValidationServiceGrpc.getVerifyBitcoinBlockMethod = getVerifyBitcoinBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyBitcoinBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("VerifyBitcoinBlock"))
              .build();
        }
      }
    }
    return getVerifyBitcoinBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckProofOfWorkBitcoinBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckProofOfWorkBitcoinBlock",
      requestType = integration.api.grpc.VeriBlockMessages.BitcoinBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckProofOfWorkBitcoinBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckProofOfWorkBitcoinBlockMethod;
    if ((getCheckProofOfWorkBitcoinBlockMethod = ValidationServiceGrpc.getCheckProofOfWorkBitcoinBlockMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckProofOfWorkBitcoinBlockMethod = ValidationServiceGrpc.getCheckProofOfWorkBitcoinBlockMethod) == null) {
          ValidationServiceGrpc.getCheckProofOfWorkBitcoinBlockMethod = getCheckProofOfWorkBitcoinBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckProofOfWorkBitcoinBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckProofOfWorkBitcoinBlock"))
              .build();
        }
      }
    }
    return getCheckProofOfWorkBitcoinBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMaximumDriftBitcoinBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMaximumDriftBitcoinBlock",
      requestType = integration.api.grpc.VeriBlockMessages.BitcoinBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMaximumDriftBitcoinBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMaximumDriftBitcoinBlockMethod;
    if ((getCheckMaximumDriftBitcoinBlockMethod = ValidationServiceGrpc.getCheckMaximumDriftBitcoinBlockMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckMaximumDriftBitcoinBlockMethod = ValidationServiceGrpc.getCheckMaximumDriftBitcoinBlockMethod) == null) {
          ValidationServiceGrpc.getCheckMaximumDriftBitcoinBlockMethod = getCheckMaximumDriftBitcoinBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckMaximumDriftBitcoinBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckMaximumDriftBitcoinBlock"))
              .build();
        }
      }
    }
    return getCheckMaximumDriftBitcoinBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyAltPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyAltPublication",
      requestType = integration.api.grpc.VeriBlockMessages.AltPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyAltPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getVerifyAltPublicationMethod;
    if ((getVerifyAltPublicationMethod = ValidationServiceGrpc.getVerifyAltPublicationMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getVerifyAltPublicationMethod = ValidationServiceGrpc.getVerifyAltPublicationMethod) == null) {
          ValidationServiceGrpc.getVerifyAltPublicationMethod = getVerifyAltPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyAltPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("VerifyAltPublication"))
              .build();
        }
      }
    }
    return getVerifyAltPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMerklePathAltPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMerklePathAltPublication",
      requestType = integration.api.grpc.VeriBlockMessages.AltPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMerklePathAltPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckMerklePathAltPublicationMethod;
    if ((getCheckMerklePathAltPublicationMethod = ValidationServiceGrpc.getCheckMerklePathAltPublicationMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckMerklePathAltPublicationMethod = ValidationServiceGrpc.getCheckMerklePathAltPublicationMethod) == null) {
          ValidationServiceGrpc.getCheckMerklePathAltPublicationMethod = getCheckMerklePathAltPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckMerklePathAltPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckMerklePathAltPublication"))
              .build();
        }
      }
    }
    return getCheckMerklePathAltPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBlocksAltPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckBlocksAltPublication",
      requestType = integration.api.grpc.VeriBlockMessages.AltPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.GeneralReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBlocksAltPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply> getCheckBlocksAltPublicationMethod;
    if ((getCheckBlocksAltPublicationMethod = ValidationServiceGrpc.getCheckBlocksAltPublicationMethod) == null) {
      synchronized (ValidationServiceGrpc.class) {
        if ((getCheckBlocksAltPublicationMethod = ValidationServiceGrpc.getCheckBlocksAltPublicationMethod) == null) {
          ValidationServiceGrpc.getCheckBlocksAltPublicationMethod = getCheckBlocksAltPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.GeneralReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckBlocksAltPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.GeneralReply.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationServiceMethodDescriptorSupplier("CheckBlocksAltPublication"))
              .build();
        }
      }
    }
    return getCheckBlocksAltPublicationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValidationServiceStub newStub(io.grpc.Channel channel) {
    return new ValidationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValidationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ValidationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValidationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ValidationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ValidationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void verifyVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyVeriBlockPoPTxMethod(), responseObserver);
    }

    /**
     */
    public void checkSignatureVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckSignatureVeriBlockPoPTxMethod(), responseObserver);
    }

    /**
     */
    public void checkBitcoinTransactionForPoPData(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckBitcoinTransactionForPoPDataMethod(), responseObserver);
    }

    /**
     */
    public void checkBitcoinMerklePathVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckBitcoinMerklePathVeriBlockPoPTxMethod(), responseObserver);
    }

    /**
     */
    public void checkBitcoinBlocksVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckBitcoinBlocksVeriBlockPoPTxMethod(), responseObserver);
    }

    /**
     */
    public void verifyVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyVeriBlockPublicationMethod(), responseObserver);
    }

    /**
     */
    public void checkBlocksVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckBlocksVeriBlockPublicationMethod(), responseObserver);
    }

    /**
     */
    public void checkMerklePathVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMerklePathVeriBlockPublicationMethod(), responseObserver);
    }

    /**
     */
    public void verifyVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyVeriBlockTransactionMethod(), responseObserver);
    }

    /**
     */
    public void checkSignatureVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckSignatureVeriBlockTransactionMethod(), responseObserver);
    }

    /**
     */
    public void verifyVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyVeriBlockBlockMethod(), responseObserver);
    }

    /**
     */
    public void checkProofOfWorkVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckProofOfWorkVeriBlockBlockMethod(), responseObserver);
    }

    /**
     */
    public void checkMaximumDriftVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMaximumDriftVeriBlockBlockMethod(), responseObserver);
    }

    /**
     */
    public void verifyBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyBitcoinBlockMethod(), responseObserver);
    }

    /**
     */
    public void checkProofOfWorkBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckProofOfWorkBitcoinBlockMethod(), responseObserver);
    }

    /**
     */
    public void checkMaximumDriftBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMaximumDriftBitcoinBlockMethod(), responseObserver);
    }

    /**
     */
    public void verifyAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyAltPublicationMethod(), responseObserver);
    }

    /**
     */
    public void checkMerklePathAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMerklePathAltPublicationMethod(), responseObserver);
    }

    /**
     */
    public void checkBlocksAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckBlocksAltPublicationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVerifyVeriBlockPoPTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_VERIFY_VERI_BLOCK_PO_PTX)))
          .addMethod(
            getCheckSignatureVeriBlockPoPTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_SIGNATURE_VERI_BLOCK_PO_PTX)))
          .addMethod(
            getCheckBitcoinTransactionForPoPDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_BITCOIN_TRANSACTION_FOR_PO_PDATA)))
          .addMethod(
            getCheckBitcoinMerklePathVeriBlockPoPTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_BITCOIN_MERKLE_PATH_VERI_BLOCK_PO_PTX)))
          .addMethod(
            getCheckBitcoinBlocksVeriBlockPoPTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_BITCOIN_BLOCKS_VERI_BLOCK_PO_PTX)))
          .addMethod(
            getVerifyVeriBlockPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_VERIFY_VERI_BLOCK_PUBLICATION)))
          .addMethod(
            getCheckBlocksVeriBlockPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_BLOCKS_VERI_BLOCK_PUBLICATION)))
          .addMethod(
            getCheckMerklePathVeriBlockPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_MERKLE_PATH_VERI_BLOCK_PUBLICATION)))
          .addMethod(
            getVerifyVeriBlockTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_VERIFY_VERI_BLOCK_TRANSACTION)))
          .addMethod(
            getCheckSignatureVeriBlockTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_SIGNATURE_VERI_BLOCK_TRANSACTION)))
          .addMethod(
            getVerifyVeriBlockBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_VERIFY_VERI_BLOCK_BLOCK)))
          .addMethod(
            getCheckProofOfWorkVeriBlockBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_PROOF_OF_WORK_VERI_BLOCK_BLOCK)))
          .addMethod(
            getCheckMaximumDriftVeriBlockBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_MAXIMUM_DRIFT_VERI_BLOCK_BLOCK)))
          .addMethod(
            getVerifyBitcoinBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BitcoinBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_VERIFY_BITCOIN_BLOCK)))
          .addMethod(
            getCheckProofOfWorkBitcoinBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BitcoinBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_PROOF_OF_WORK_BITCOIN_BLOCK)))
          .addMethod(
            getCheckMaximumDriftBitcoinBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BitcoinBlock,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_MAXIMUM_DRIFT_BITCOIN_BLOCK)))
          .addMethod(
            getVerifyAltPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_VERIFY_ALT_PUBLICATION)))
          .addMethod(
            getCheckMerklePathAltPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_MERKLE_PATH_ALT_PUBLICATION)))
          .addMethod(
            getCheckBlocksAltPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltPublication,
                integration.api.grpc.VeriBlockMessages.GeneralReply>(
                  this, METHODID_CHECK_BLOCKS_ALT_PUBLICATION)))
          .build();
    }
  }

  /**
   */
  public static final class ValidationServiceStub extends io.grpc.stub.AbstractStub<ValidationServiceStub> {
    private ValidationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidationServiceStub(channel, callOptions);
    }

    /**
     */
    public void verifyVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyVeriBlockPoPTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkSignatureVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckSignatureVeriBlockPoPTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkBitcoinTransactionForPoPData(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckBitcoinTransactionForPoPDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkBitcoinMerklePathVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckBitcoinMerklePathVeriBlockPoPTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkBitcoinBlocksVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckBitcoinBlocksVeriBlockPoPTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyVeriBlockPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkBlocksVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckBlocksVeriBlockPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkMerklePathVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMerklePathVeriBlockPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyVeriBlockTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkSignatureVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckSignatureVeriBlockTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyVeriBlockBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkProofOfWorkVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckProofOfWorkVeriBlockBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkMaximumDriftVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMaximumDriftVeriBlockBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyBitcoinBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkProofOfWorkBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckProofOfWorkBitcoinBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkMaximumDriftBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMaximumDriftBitcoinBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyAltPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkMerklePathAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMerklePathAltPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkBlocksAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckBlocksAltPublicationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ValidationServiceBlockingStub extends io.grpc.stub.AbstractStub<ValidationServiceBlockingStub> {
    private ValidationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply verifyVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return blockingUnaryCall(
          getChannel(), getVerifyVeriBlockPoPTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkSignatureVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return blockingUnaryCall(
          getChannel(), getCheckSignatureVeriBlockPoPTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkBitcoinTransactionForPoPData(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return blockingUnaryCall(
          getChannel(), getCheckBitcoinTransactionForPoPDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkBitcoinMerklePathVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return blockingUnaryCall(
          getChannel(), getCheckBitcoinMerklePathVeriBlockPoPTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkBitcoinBlocksVeriBlockPoPTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return blockingUnaryCall(
          getChannel(), getCheckBitcoinBlocksVeriBlockPoPTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply verifyVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return blockingUnaryCall(
          getChannel(), getVerifyVeriBlockPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkBlocksVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return blockingUnaryCall(
          getChannel(), getCheckBlocksVeriBlockPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkMerklePathVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return blockingUnaryCall(
          getChannel(), getCheckMerklePathVeriBlockPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply verifyVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request) {
      return blockingUnaryCall(
          getChannel(), getVerifyVeriBlockTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkSignatureVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request) {
      return blockingUnaryCall(
          getChannel(), getCheckSignatureVeriBlockTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply verifyVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return blockingUnaryCall(
          getChannel(), getVerifyVeriBlockBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkProofOfWorkVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return blockingUnaryCall(
          getChannel(), getCheckProofOfWorkVeriBlockBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkMaximumDriftVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return blockingUnaryCall(
          getChannel(), getCheckMaximumDriftVeriBlockBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply verifyBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return blockingUnaryCall(
          getChannel(), getVerifyBitcoinBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkProofOfWorkBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return blockingUnaryCall(
          getChannel(), getCheckProofOfWorkBitcoinBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkMaximumDriftBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return blockingUnaryCall(
          getChannel(), getCheckMaximumDriftBitcoinBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply verifyAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return blockingUnaryCall(
          getChannel(), getVerifyAltPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkMerklePathAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return blockingUnaryCall(
          getChannel(), getCheckMerklePathAltPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.GeneralReply checkBlocksAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return blockingUnaryCall(
          getChannel(), getCheckBlocksAltPublicationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ValidationServiceFutureStub extends io.grpc.stub.AbstractStub<ValidationServiceFutureStub> {
    private ValidationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> verifyVeriBlockPoPTx(
        integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyVeriBlockPoPTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkSignatureVeriBlockPoPTx(
        integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckSignatureVeriBlockPoPTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkBitcoinTransactionForPoPData(
        integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckBitcoinTransactionForPoPDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkBitcoinMerklePathVeriBlockPoPTx(
        integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckBitcoinMerklePathVeriBlockPoPTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkBitcoinBlocksVeriBlockPoPTx(
        integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckBitcoinBlocksVeriBlockPoPTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> verifyVeriBlockPublication(
        integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyVeriBlockPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkBlocksVeriBlockPublication(
        integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckBlocksVeriBlockPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkMerklePathVeriBlockPublication(
        integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMerklePathVeriBlockPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> verifyVeriBlockTransaction(
        integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyVeriBlockTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkSignatureVeriBlockTransaction(
        integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckSignatureVeriBlockTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> verifyVeriBlockBlock(
        integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyVeriBlockBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkProofOfWorkVeriBlockBlock(
        integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckProofOfWorkVeriBlockBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkMaximumDriftVeriBlockBlock(
        integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMaximumDriftVeriBlockBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> verifyBitcoinBlock(
        integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyBitcoinBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkProofOfWorkBitcoinBlock(
        integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckProofOfWorkBitcoinBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkMaximumDriftBitcoinBlock(
        integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMaximumDriftBitcoinBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> verifyAltPublication(
        integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyAltPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkMerklePathAltPublication(
        integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMerklePathAltPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.GeneralReply> checkBlocksAltPublication(
        integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckBlocksAltPublicationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERIFY_VERI_BLOCK_PO_PTX = 0;
  private static final int METHODID_CHECK_SIGNATURE_VERI_BLOCK_PO_PTX = 1;
  private static final int METHODID_CHECK_BITCOIN_TRANSACTION_FOR_PO_PDATA = 2;
  private static final int METHODID_CHECK_BITCOIN_MERKLE_PATH_VERI_BLOCK_PO_PTX = 3;
  private static final int METHODID_CHECK_BITCOIN_BLOCKS_VERI_BLOCK_PO_PTX = 4;
  private static final int METHODID_VERIFY_VERI_BLOCK_PUBLICATION = 5;
  private static final int METHODID_CHECK_BLOCKS_VERI_BLOCK_PUBLICATION = 6;
  private static final int METHODID_CHECK_MERKLE_PATH_VERI_BLOCK_PUBLICATION = 7;
  private static final int METHODID_VERIFY_VERI_BLOCK_TRANSACTION = 8;
  private static final int METHODID_CHECK_SIGNATURE_VERI_BLOCK_TRANSACTION = 9;
  private static final int METHODID_VERIFY_VERI_BLOCK_BLOCK = 10;
  private static final int METHODID_CHECK_PROOF_OF_WORK_VERI_BLOCK_BLOCK = 11;
  private static final int METHODID_CHECK_MAXIMUM_DRIFT_VERI_BLOCK_BLOCK = 12;
  private static final int METHODID_VERIFY_BITCOIN_BLOCK = 13;
  private static final int METHODID_CHECK_PROOF_OF_WORK_BITCOIN_BLOCK = 14;
  private static final int METHODID_CHECK_MAXIMUM_DRIFT_BITCOIN_BLOCK = 15;
  private static final int METHODID_VERIFY_ALT_PUBLICATION = 16;
  private static final int METHODID_CHECK_MERKLE_PATH_ALT_PUBLICATION = 17;
  private static final int METHODID_CHECK_BLOCKS_ALT_PUBLICATION = 18;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValidationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValidationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VERIFY_VERI_BLOCK_PO_PTX:
          serviceImpl.verifyVeriBlockPoPTx((integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_SIGNATURE_VERI_BLOCK_PO_PTX:
          serviceImpl.checkSignatureVeriBlockPoPTx((integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_BITCOIN_TRANSACTION_FOR_PO_PDATA:
          serviceImpl.checkBitcoinTransactionForPoPData((integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_BITCOIN_MERKLE_PATH_VERI_BLOCK_PO_PTX:
          serviceImpl.checkBitcoinMerklePathVeriBlockPoPTx((integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_BITCOIN_BLOCKS_VERI_BLOCK_PO_PTX:
          serviceImpl.checkBitcoinBlocksVeriBlockPoPTx((integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_VERIFY_VERI_BLOCK_PUBLICATION:
          serviceImpl.verifyVeriBlockPublication((integration.api.grpc.VeriBlockMessages.VeriBlockPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_BLOCKS_VERI_BLOCK_PUBLICATION:
          serviceImpl.checkBlocksVeriBlockPublication((integration.api.grpc.VeriBlockMessages.VeriBlockPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_MERKLE_PATH_VERI_BLOCK_PUBLICATION:
          serviceImpl.checkMerklePathVeriBlockPublication((integration.api.grpc.VeriBlockMessages.VeriBlockPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_VERIFY_VERI_BLOCK_TRANSACTION:
          serviceImpl.verifyVeriBlockTransaction((integration.api.grpc.VeriBlockMessages.VeriBlockTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_SIGNATURE_VERI_BLOCK_TRANSACTION:
          serviceImpl.checkSignatureVeriBlockTransaction((integration.api.grpc.VeriBlockMessages.VeriBlockTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_VERIFY_VERI_BLOCK_BLOCK:
          serviceImpl.verifyVeriBlockBlock((integration.api.grpc.VeriBlockMessages.VeriBlockBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_PROOF_OF_WORK_VERI_BLOCK_BLOCK:
          serviceImpl.checkProofOfWorkVeriBlockBlock((integration.api.grpc.VeriBlockMessages.VeriBlockBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_MAXIMUM_DRIFT_VERI_BLOCK_BLOCK:
          serviceImpl.checkMaximumDriftVeriBlockBlock((integration.api.grpc.VeriBlockMessages.VeriBlockBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_VERIFY_BITCOIN_BLOCK:
          serviceImpl.verifyBitcoinBlock((integration.api.grpc.VeriBlockMessages.BitcoinBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_PROOF_OF_WORK_BITCOIN_BLOCK:
          serviceImpl.checkProofOfWorkBitcoinBlock((integration.api.grpc.VeriBlockMessages.BitcoinBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_MAXIMUM_DRIFT_BITCOIN_BLOCK:
          serviceImpl.checkMaximumDriftBitcoinBlock((integration.api.grpc.VeriBlockMessages.BitcoinBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_VERIFY_ALT_PUBLICATION:
          serviceImpl.verifyAltPublication((integration.api.grpc.VeriBlockMessages.AltPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_MERKLE_PATH_ALT_PUBLICATION:
          serviceImpl.checkMerklePathAltPublication((integration.api.grpc.VeriBlockMessages.AltPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.GeneralReply>) responseObserver);
          break;
        case METHODID_CHECK_BLOCKS_ALT_PUBLICATION:
          serviceImpl.checkBlocksAltPublication((integration.api.grpc.VeriBlockMessages.AltPublication) request,
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

  private static abstract class ValidationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValidationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return integration.api.grpc.VeriBlockMessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValidationService");
    }
  }

  private static final class ValidationServiceFileDescriptorSupplier
      extends ValidationServiceBaseDescriptorSupplier {
    ValidationServiceFileDescriptorSupplier() {}
  }

  private static final class ValidationServiceMethodDescriptorSupplier
      extends ValidationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValidationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValidationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValidationServiceFileDescriptorSupplier())
              .addMethod(getVerifyVeriBlockPoPTxMethod())
              .addMethod(getCheckSignatureVeriBlockPoPTxMethod())
              .addMethod(getCheckBitcoinTransactionForPoPDataMethod())
              .addMethod(getCheckBitcoinMerklePathVeriBlockPoPTxMethod())
              .addMethod(getCheckBitcoinBlocksVeriBlockPoPTxMethod())
              .addMethod(getVerifyVeriBlockPublicationMethod())
              .addMethod(getCheckBlocksVeriBlockPublicationMethod())
              .addMethod(getCheckMerklePathVeriBlockPublicationMethod())
              .addMethod(getVerifyVeriBlockTransactionMethod())
              .addMethod(getCheckSignatureVeriBlockTransactionMethod())
              .addMethod(getVerifyVeriBlockBlockMethod())
              .addMethod(getCheckProofOfWorkVeriBlockBlockMethod())
              .addMethod(getCheckMaximumDriftVeriBlockBlockMethod())
              .addMethod(getVerifyBitcoinBlockMethod())
              .addMethod(getCheckProofOfWorkBitcoinBlockMethod())
              .addMethod(getCheckMaximumDriftBitcoinBlockMethod())
              .addMethod(getVerifyAltPublicationMethod())
              .addMethod(getCheckMerklePathAltPublicationMethod())
              .addMethod(getCheckBlocksAltPublicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
