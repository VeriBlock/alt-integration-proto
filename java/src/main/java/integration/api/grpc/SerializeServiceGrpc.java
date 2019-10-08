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
public final class SerializeServiceGrpc {

  private SerializeServiceGrpc() {}

  public static final String SERVICE_NAME = "VeriBlock.SerializeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeAltPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeAltPublication",
      requestType = integration.api.grpc.VeriBlockMessages.AltPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeAltPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeAltPublicationMethod;
    if ((getSerializeAltPublicationMethod = SerializeServiceGrpc.getSerializeAltPublicationMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeAltPublicationMethod = SerializeServiceGrpc.getSerializeAltPublicationMethod) == null) {
          SerializeServiceGrpc.getSerializeAltPublicationMethod = getSerializeAltPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.AltPublication, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeAltPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeAltPublication"))
              .build();
        }
      }
    }
    return getSerializeAltPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.PublicationData,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializePublicationDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializePublicationData",
      requestType = integration.api.grpc.VeriBlockMessages.PublicationData.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.PublicationData,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializePublicationDataMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.PublicationData, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializePublicationDataMethod;
    if ((getSerializePublicationDataMethod = SerializeServiceGrpc.getSerializePublicationDataMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializePublicationDataMethod = SerializeServiceGrpc.getSerializePublicationDataMethod) == null) {
          SerializeServiceGrpc.getSerializePublicationDataMethod = getSerializePublicationDataMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.PublicationData, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializePublicationData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.PublicationData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializePublicationData"))
              .build();
        }
      }
    }
    return getSerializePublicationDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinTransaction,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeBitcoinTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeBitcoinTransaction",
      requestType = integration.api.grpc.VeriBlockMessages.BitcoinTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinTransaction,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeBitcoinTransactionMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinTransaction, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeBitcoinTransactionMethod;
    if ((getSerializeBitcoinTransactionMethod = SerializeServiceGrpc.getSerializeBitcoinTransactionMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeBitcoinTransactionMethod = SerializeServiceGrpc.getSerializeBitcoinTransactionMethod) == null) {
          SerializeServiceGrpc.getSerializeBitcoinTransactionMethod = getSerializeBitcoinTransactionMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BitcoinTransaction, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeBitcoinTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeBitcoinTransaction"))
              .build();
        }
      }
    }
    return getSerializeBitcoinTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeVeriBlockBlock",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockBlockMethod;
    if ((getSerializeVeriBlockBlockMethod = SerializeServiceGrpc.getSerializeVeriBlockBlockMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeVeriBlockBlockMethod = SerializeServiceGrpc.getSerializeVeriBlockBlockMethod) == null) {
          SerializeServiceGrpc.getSerializeVeriBlockBlockMethod = getSerializeVeriBlockBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockBlock, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeVeriBlockBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeVeriBlockBlock"))
              .build();
        }
      }
    }
    return getSerializeVeriBlockBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeVeriBlockTransaction",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockTransactionMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockTransactionMethod;
    if ((getSerializeVeriBlockTransactionMethod = SerializeServiceGrpc.getSerializeVeriBlockTransactionMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeVeriBlockTransactionMethod = SerializeServiceGrpc.getSerializeVeriBlockTransactionMethod) == null) {
          SerializeServiceGrpc.getSerializeVeriBlockTransactionMethod = getSerializeVeriBlockTransactionMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockTransaction, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeVeriBlockTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeVeriBlockTransaction"))
              .build();
        }
      }
    }
    return getSerializeVeriBlockTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeVeriBlockPublication",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPublication.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockPublicationMethod;
    if ((getSerializeVeriBlockPublicationMethod = SerializeServiceGrpc.getSerializeVeriBlockPublicationMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeVeriBlockPublicationMethod = SerializeServiceGrpc.getSerializeVeriBlockPublicationMethod) == null) {
          SerializeServiceGrpc.getSerializeVeriBlockPublicationMethod = getSerializeVeriBlockPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPublication, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeVeriBlockPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPublication.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeVeriBlockPublication"))
              .build();
        }
      }
    }
    return getSerializeVeriBlockPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockPopTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeVeriBlockPopTx",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockPopTxMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockPopTxMethod;
    if ((getSerializeVeriBlockPopTxMethod = SerializeServiceGrpc.getSerializeVeriBlockPopTxMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeVeriBlockPopTxMethod = SerializeServiceGrpc.getSerializeVeriBlockPopTxMethod) == null) {
          SerializeServiceGrpc.getSerializeVeriBlockPopTxMethod = getSerializeVeriBlockPopTxMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeVeriBlockPopTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeVeriBlockPopTx"))
              .build();
        }
      }
    }
    return getSerializeVeriBlockPopTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.Output,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeOutputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeOutput",
      requestType = integration.api.grpc.VeriBlockMessages.Output.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.Output,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeOutputMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.Output, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeOutputMethod;
    if ((getSerializeOutputMethod = SerializeServiceGrpc.getSerializeOutputMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeOutputMethod = SerializeServiceGrpc.getSerializeOutputMethod) == null) {
          SerializeServiceGrpc.getSerializeOutputMethod = getSerializeOutputMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.Output, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeOutput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.Output.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeOutput"))
              .build();
        }
      }
    }
    return getSerializeOutputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.Address,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeAddress",
      requestType = integration.api.grpc.VeriBlockMessages.Address.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.Address,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeAddressMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.Address, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeAddressMethod;
    if ((getSerializeAddressMethod = SerializeServiceGrpc.getSerializeAddressMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeAddressMethod = SerializeServiceGrpc.getSerializeAddressMethod) == null) {
          SerializeServiceGrpc.getSerializeAddressMethod = getSerializeAddressMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.Address, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.Address.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeAddress"))
              .build();
        }
      }
    }
    return getSerializeAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeBitcoinBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeBitcoinBlock",
      requestType = integration.api.grpc.VeriBlockMessages.BitcoinBlock.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeBitcoinBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeBitcoinBlockMethod;
    if ((getSerializeBitcoinBlockMethod = SerializeServiceGrpc.getSerializeBitcoinBlockMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeBitcoinBlockMethod = SerializeServiceGrpc.getSerializeBitcoinBlockMethod) == null) {
          SerializeServiceGrpc.getSerializeBitcoinBlockMethod = getSerializeBitcoinBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BitcoinBlock, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeBitcoinBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeBitcoinBlock"))
              .build();
        }
      }
    }
    return getSerializeBitcoinBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockMerklePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeVeriBlockMerklePath",
      requestType = integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockMerklePathMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeVeriBlockMerklePathMethod;
    if ((getSerializeVeriBlockMerklePathMethod = SerializeServiceGrpc.getSerializeVeriBlockMerklePathMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeVeriBlockMerklePathMethod = SerializeServiceGrpc.getSerializeVeriBlockMerklePathMethod) == null) {
          SerializeServiceGrpc.getSerializeVeriBlockMerklePathMethod = getSerializeVeriBlockMerklePathMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeVeriBlockMerklePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeVeriBlockMerklePath"))
              .build();
        }
      }
    }
    return getSerializeVeriBlockMerklePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.MerklePath,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeMerklePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SerializeMerklePath",
      requestType = integration.api.grpc.VeriBlockMessages.MerklePath.class,
      responseType = integration.api.grpc.VeriBlockMessages.BytesArrayReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.MerklePath,
      integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeMerklePathMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.MerklePath, integration.api.grpc.VeriBlockMessages.BytesArrayReply> getSerializeMerklePathMethod;
    if ((getSerializeMerklePathMethod = SerializeServiceGrpc.getSerializeMerklePathMethod) == null) {
      synchronized (SerializeServiceGrpc.class) {
        if ((getSerializeMerklePathMethod = SerializeServiceGrpc.getSerializeMerklePathMethod) == null) {
          SerializeServiceGrpc.getSerializeMerklePathMethod = getSerializeMerklePathMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.MerklePath, integration.api.grpc.VeriBlockMessages.BytesArrayReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SerializeMerklePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.MerklePath.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayReply.getDefaultInstance()))
              .setSchemaDescriptor(new SerializeServiceMethodDescriptorSupplier("SerializeMerklePath"))
              .build();
        }
      }
    }
    return getSerializeMerklePathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SerializeServiceStub newStub(io.grpc.Channel channel) {
    return new SerializeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SerializeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SerializeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SerializeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SerializeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SerializeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void serializeAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeAltPublicationMethod(), responseObserver);
    }

    /**
     */
    public void serializePublicationData(integration.api.grpc.VeriBlockMessages.PublicationData request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializePublicationDataMethod(), responseObserver);
    }

    /**
     */
    public void serializeBitcoinTransaction(integration.api.grpc.VeriBlockMessages.BitcoinTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeBitcoinTransactionMethod(), responseObserver);
    }

    /**
     */
    public void serializeVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeVeriBlockBlockMethod(), responseObserver);
    }

    /**
     */
    public void serializeVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeVeriBlockTransactionMethod(), responseObserver);
    }

    /**
     */
    public void serializeVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeVeriBlockPublicationMethod(), responseObserver);
    }

    /**
     */
    public void serializeVeriBlockPopTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeVeriBlockPopTxMethod(), responseObserver);
    }

    /**
     */
    public void serializeOutput(integration.api.grpc.VeriBlockMessages.Output request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeOutputMethod(), responseObserver);
    }

    /**
     */
    public void serializeAddress(integration.api.grpc.VeriBlockMessages.Address request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeAddressMethod(), responseObserver);
    }

    /**
     */
    public void serializeBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeBitcoinBlockMethod(), responseObserver);
    }

    /**
     */
    public void serializeVeriBlockMerklePath(integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeVeriBlockMerklePathMethod(), responseObserver);
    }

    /**
     */
    public void serializeMerklePath(integration.api.grpc.VeriBlockMessages.MerklePath request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSerializeMerklePathMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSerializeAltPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.AltPublication,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_ALT_PUBLICATION)))
          .addMethod(
            getSerializePublicationDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.PublicationData,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_PUBLICATION_DATA)))
          .addMethod(
            getSerializeBitcoinTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BitcoinTransaction,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_BITCOIN_TRANSACTION)))
          .addMethod(
            getSerializeVeriBlockBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockBlock,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_VERI_BLOCK_BLOCK)))
          .addMethod(
            getSerializeVeriBlockTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockTransaction,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_VERI_BLOCK_TRANSACTION)))
          .addMethod(
            getSerializeVeriBlockPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPublication,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_VERI_BLOCK_PUBLICATION)))
          .addMethod(
            getSerializeVeriBlockPopTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_VERI_BLOCK_POP_TX)))
          .addMethod(
            getSerializeOutputMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.Output,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_OUTPUT)))
          .addMethod(
            getSerializeAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.Address,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_ADDRESS)))
          .addMethod(
            getSerializeBitcoinBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BitcoinBlock,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_BITCOIN_BLOCK)))
          .addMethod(
            getSerializeVeriBlockMerklePathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_VERI_BLOCK_MERKLE_PATH)))
          .addMethod(
            getSerializeMerklePathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.MerklePath,
                integration.api.grpc.VeriBlockMessages.BytesArrayReply>(
                  this, METHODID_SERIALIZE_MERKLE_PATH)))
          .build();
    }
  }

  /**
   */
  public static final class SerializeServiceStub extends io.grpc.stub.AbstractStub<SerializeServiceStub> {
    private SerializeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SerializeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SerializeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SerializeServiceStub(channel, callOptions);
    }

    /**
     */
    public void serializeAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeAltPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializePublicationData(integration.api.grpc.VeriBlockMessages.PublicationData request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializePublicationDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeBitcoinTransaction(integration.api.grpc.VeriBlockMessages.BitcoinTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeBitcoinTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeVeriBlockBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeVeriBlockTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeVeriBlockPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeVeriBlockPopTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeVeriBlockPopTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeOutput(integration.api.grpc.VeriBlockMessages.Output request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeOutputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeAddress(integration.api.grpc.VeriBlockMessages.Address request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeBitcoinBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeVeriBlockMerklePath(integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeVeriBlockMerklePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serializeMerklePath(integration.api.grpc.VeriBlockMessages.MerklePath request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerializeMerklePathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SerializeServiceBlockingStub extends io.grpc.stub.AbstractStub<SerializeServiceBlockingStub> {
    private SerializeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SerializeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SerializeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SerializeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeAltPublication(integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return blockingUnaryCall(
          getChannel(), getSerializeAltPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializePublicationData(integration.api.grpc.VeriBlockMessages.PublicationData request) {
      return blockingUnaryCall(
          getChannel(), getSerializePublicationDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeBitcoinTransaction(integration.api.grpc.VeriBlockMessages.BitcoinTransaction request) {
      return blockingUnaryCall(
          getChannel(), getSerializeBitcoinTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeVeriBlockBlock(integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return blockingUnaryCall(
          getChannel(), getSerializeVeriBlockBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request) {
      return blockingUnaryCall(
          getChannel(), getSerializeVeriBlockTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeVeriBlockPublication(integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return blockingUnaryCall(
          getChannel(), getSerializeVeriBlockPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeVeriBlockPopTx(integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return blockingUnaryCall(
          getChannel(), getSerializeVeriBlockPopTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeOutput(integration.api.grpc.VeriBlockMessages.Output request) {
      return blockingUnaryCall(
          getChannel(), getSerializeOutputMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeAddress(integration.api.grpc.VeriBlockMessages.Address request) {
      return blockingUnaryCall(
          getChannel(), getSerializeAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeBitcoinBlock(integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return blockingUnaryCall(
          getChannel(), getSerializeBitcoinBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeVeriBlockMerklePath(integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath request) {
      return blockingUnaryCall(
          getChannel(), getSerializeVeriBlockMerklePathMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BytesArrayReply serializeMerklePath(integration.api.grpc.VeriBlockMessages.MerklePath request) {
      return blockingUnaryCall(
          getChannel(), getSerializeMerklePathMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SerializeServiceFutureStub extends io.grpc.stub.AbstractStub<SerializeServiceFutureStub> {
    private SerializeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SerializeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SerializeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SerializeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeAltPublication(
        integration.api.grpc.VeriBlockMessages.AltPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeAltPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializePublicationData(
        integration.api.grpc.VeriBlockMessages.PublicationData request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializePublicationDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeBitcoinTransaction(
        integration.api.grpc.VeriBlockMessages.BitcoinTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeBitcoinTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeVeriBlockBlock(
        integration.api.grpc.VeriBlockMessages.VeriBlockBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeVeriBlockBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeVeriBlockTransaction(
        integration.api.grpc.VeriBlockMessages.VeriBlockTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeVeriBlockTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeVeriBlockPublication(
        integration.api.grpc.VeriBlockMessages.VeriBlockPublication request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeVeriBlockPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeVeriBlockPopTx(
        integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeVeriBlockPopTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeOutput(
        integration.api.grpc.VeriBlockMessages.Output request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeOutputMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeAddress(
        integration.api.grpc.VeriBlockMessages.Address request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeBitcoinBlock(
        integration.api.grpc.VeriBlockMessages.BitcoinBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeBitcoinBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeVeriBlockMerklePath(
        integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeVeriBlockMerklePathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BytesArrayReply> serializeMerklePath(
        integration.api.grpc.VeriBlockMessages.MerklePath request) {
      return futureUnaryCall(
          getChannel().newCall(getSerializeMerklePathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SERIALIZE_ALT_PUBLICATION = 0;
  private static final int METHODID_SERIALIZE_PUBLICATION_DATA = 1;
  private static final int METHODID_SERIALIZE_BITCOIN_TRANSACTION = 2;
  private static final int METHODID_SERIALIZE_VERI_BLOCK_BLOCK = 3;
  private static final int METHODID_SERIALIZE_VERI_BLOCK_TRANSACTION = 4;
  private static final int METHODID_SERIALIZE_VERI_BLOCK_PUBLICATION = 5;
  private static final int METHODID_SERIALIZE_VERI_BLOCK_POP_TX = 6;
  private static final int METHODID_SERIALIZE_OUTPUT = 7;
  private static final int METHODID_SERIALIZE_ADDRESS = 8;
  private static final int METHODID_SERIALIZE_BITCOIN_BLOCK = 9;
  private static final int METHODID_SERIALIZE_VERI_BLOCK_MERKLE_PATH = 10;
  private static final int METHODID_SERIALIZE_MERKLE_PATH = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SerializeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SerializeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERIALIZE_ALT_PUBLICATION:
          serviceImpl.serializeAltPublication((integration.api.grpc.VeriBlockMessages.AltPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_PUBLICATION_DATA:
          serviceImpl.serializePublicationData((integration.api.grpc.VeriBlockMessages.PublicationData) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_BITCOIN_TRANSACTION:
          serviceImpl.serializeBitcoinTransaction((integration.api.grpc.VeriBlockMessages.BitcoinTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_VERI_BLOCK_BLOCK:
          serviceImpl.serializeVeriBlockBlock((integration.api.grpc.VeriBlockMessages.VeriBlockBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_VERI_BLOCK_TRANSACTION:
          serviceImpl.serializeVeriBlockTransaction((integration.api.grpc.VeriBlockMessages.VeriBlockTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_VERI_BLOCK_PUBLICATION:
          serviceImpl.serializeVeriBlockPublication((integration.api.grpc.VeriBlockMessages.VeriBlockPublication) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_VERI_BLOCK_POP_TX:
          serviceImpl.serializeVeriBlockPopTx((integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransaction) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_OUTPUT:
          serviceImpl.serializeOutput((integration.api.grpc.VeriBlockMessages.Output) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_ADDRESS:
          serviceImpl.serializeAddress((integration.api.grpc.VeriBlockMessages.Address) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_BITCOIN_BLOCK:
          serviceImpl.serializeBitcoinBlock((integration.api.grpc.VeriBlockMessages.BitcoinBlock) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_VERI_BLOCK_MERKLE_PATH:
          serviceImpl.serializeVeriBlockMerklePath((integration.api.grpc.VeriBlockMessages.VeriBlockMerklePath) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
          break;
        case METHODID_SERIALIZE_MERKLE_PATH:
          serviceImpl.serializeMerklePath((integration.api.grpc.VeriBlockMessages.MerklePath) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BytesArrayReply>) responseObserver);
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

  private static abstract class SerializeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SerializeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return integration.api.grpc.VeriBlockMessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SerializeService");
    }
  }

  private static final class SerializeServiceFileDescriptorSupplier
      extends SerializeServiceBaseDescriptorSupplier {
    SerializeServiceFileDescriptorSupplier() {}
  }

  private static final class SerializeServiceMethodDescriptorSupplier
      extends SerializeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SerializeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SerializeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SerializeServiceFileDescriptorSupplier())
              .addMethod(getSerializeAltPublicationMethod())
              .addMethod(getSerializePublicationDataMethod())
              .addMethod(getSerializeBitcoinTransactionMethod())
              .addMethod(getSerializeVeriBlockBlockMethod())
              .addMethod(getSerializeVeriBlockTransactionMethod())
              .addMethod(getSerializeVeriBlockPublicationMethod())
              .addMethod(getSerializeVeriBlockPopTxMethod())
              .addMethod(getSerializeOutputMethod())
              .addMethod(getSerializeAddressMethod())
              .addMethod(getSerializeBitcoinBlockMethod())
              .addMethod(getSerializeVeriBlockMerklePathMethod())
              .addMethod(getSerializeMerklePathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
