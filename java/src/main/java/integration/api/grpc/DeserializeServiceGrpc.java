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
public final class DeserializeServiceGrpc {

  private DeserializeServiceGrpc() {}

  public static final String SERVICE_NAME = "VeriBlock.DeserializeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.AltPublicationReply> getParseAltPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseAltPublication",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.AltPublicationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.AltPublicationReply> getParseAltPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.AltPublicationReply> getParseAltPublicationMethod;
    if ((getParseAltPublicationMethod = DeserializeServiceGrpc.getParseAltPublicationMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseAltPublicationMethod = DeserializeServiceGrpc.getParseAltPublicationMethod) == null) {
          DeserializeServiceGrpc.getParseAltPublicationMethod = getParseAltPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.AltPublicationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseAltPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AltPublicationReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseAltPublication"))
              .build();
        }
      }
    }
    return getParseAltPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.PublicationDataReply> getParsePublicationDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParsePublicationData",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.PublicationDataReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.PublicationDataReply> getParsePublicationDataMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.PublicationDataReply> getParsePublicationDataMethod;
    if ((getParsePublicationDataMethod = DeserializeServiceGrpc.getParsePublicationDataMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParsePublicationDataMethod = DeserializeServiceGrpc.getParsePublicationDataMethod) == null) {
          DeserializeServiceGrpc.getParsePublicationDataMethod = getParsePublicationDataMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.PublicationDataReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParsePublicationData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.PublicationDataReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParsePublicationData"))
              .build();
        }
      }
    }
    return getParsePublicationDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply> getParseBitcoinTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseBitcoinTransaction",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply> getParseBitcoinTransactionMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply> getParseBitcoinTransactionMethod;
    if ((getParseBitcoinTransactionMethod = DeserializeServiceGrpc.getParseBitcoinTransactionMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseBitcoinTransactionMethod = DeserializeServiceGrpc.getParseBitcoinTransactionMethod) == null) {
          DeserializeServiceGrpc.getParseBitcoinTransactionMethod = getParseBitcoinTransactionMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseBitcoinTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseBitcoinTransaction"))
              .build();
        }
      }
    }
    return getParseBitcoinTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply> getParseVeriBlockBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseVeriBlockBlock",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply> getParseVeriBlockBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply> getParseVeriBlockBlockMethod;
    if ((getParseVeriBlockBlockMethod = DeserializeServiceGrpc.getParseVeriBlockBlockMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseVeriBlockBlockMethod = DeserializeServiceGrpc.getParseVeriBlockBlockMethod) == null) {
          DeserializeServiceGrpc.getParseVeriBlockBlockMethod = getParseVeriBlockBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseVeriBlockBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseVeriBlockBlock"))
              .build();
        }
      }
    }
    return getParseVeriBlockBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply> getParseVeriBlockTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseVeriBlockTransaction",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply> getParseVeriBlockTransactionMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply> getParseVeriBlockTransactionMethod;
    if ((getParseVeriBlockTransactionMethod = DeserializeServiceGrpc.getParseVeriBlockTransactionMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseVeriBlockTransactionMethod = DeserializeServiceGrpc.getParseVeriBlockTransactionMethod) == null) {
          DeserializeServiceGrpc.getParseVeriBlockTransactionMethod = getParseVeriBlockTransactionMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseVeriBlockTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseVeriBlockTransaction"))
              .build();
        }
      }
    }
    return getParseVeriBlockTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply> getParseVeriBlockPublicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseVeriBlockPublication",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply> getParseVeriBlockPublicationMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply> getParseVeriBlockPublicationMethod;
    if ((getParseVeriBlockPublicationMethod = DeserializeServiceGrpc.getParseVeriBlockPublicationMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseVeriBlockPublicationMethod = DeserializeServiceGrpc.getParseVeriBlockPublicationMethod) == null) {
          DeserializeServiceGrpc.getParseVeriBlockPublicationMethod = getParseVeriBlockPublicationMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseVeriBlockPublication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseVeriBlockPublication"))
              .build();
        }
      }
    }
    return getParseVeriBlockPublicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply> getParseVeriBlockPopTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseVeriBlockPopTx",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply> getParseVeriBlockPopTxMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply> getParseVeriBlockPopTxMethod;
    if ((getParseVeriBlockPopTxMethod = DeserializeServiceGrpc.getParseVeriBlockPopTxMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseVeriBlockPopTxMethod = DeserializeServiceGrpc.getParseVeriBlockPopTxMethod) == null) {
          DeserializeServiceGrpc.getParseVeriBlockPopTxMethod = getParseVeriBlockPopTxMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseVeriBlockPopTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseVeriBlockPopTx"))
              .build();
        }
      }
    }
    return getParseVeriBlockPopTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.OutputReply> getParseOutputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseOutput",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.OutputReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.OutputReply> getParseOutputMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.OutputReply> getParseOutputMethod;
    if ((getParseOutputMethod = DeserializeServiceGrpc.getParseOutputMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseOutputMethod = DeserializeServiceGrpc.getParseOutputMethod) == null) {
          DeserializeServiceGrpc.getParseOutputMethod = getParseOutputMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.OutputReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseOutput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.OutputReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseOutput"))
              .build();
        }
      }
    }
    return getParseOutputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.AddressReply> getParseAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseAddress",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.AddressReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.AddressReply> getParseAddressMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.AddressReply> getParseAddressMethod;
    if ((getParseAddressMethod = DeserializeServiceGrpc.getParseAddressMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseAddressMethod = DeserializeServiceGrpc.getParseAddressMethod) == null) {
          DeserializeServiceGrpc.getParseAddressMethod = getParseAddressMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.AddressReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.AddressReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseAddress"))
              .build();
        }
      }
    }
    return getParseAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.BitcoinBlockReply> getParseBitcoinBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseBitcoinBlock",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.BitcoinBlockReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.BitcoinBlockReply> getParseBitcoinBlockMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.BitcoinBlockReply> getParseBitcoinBlockMethod;
    if ((getParseBitcoinBlockMethod = DeserializeServiceGrpc.getParseBitcoinBlockMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseBitcoinBlockMethod = DeserializeServiceGrpc.getParseBitcoinBlockMethod) == null) {
          DeserializeServiceGrpc.getParseBitcoinBlockMethod = getParseBitcoinBlockMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.BitcoinBlockReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseBitcoinBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BitcoinBlockReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseBitcoinBlock"))
              .build();
        }
      }
    }
    return getParseBitcoinBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply> getParseVeriBlockMerklePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseVeriBlockMerklePath",
      requestType = integration.api.grpc.VeriBlockMessages.BytesArrayRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
      integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply> getParseVeriBlockMerklePathMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply> getParseVeriBlockMerklePathMethod;
    if ((getParseVeriBlockMerklePathMethod = DeserializeServiceGrpc.getParseVeriBlockMerklePathMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseVeriBlockMerklePathMethod = DeserializeServiceGrpc.getParseVeriBlockMerklePathMethod) == null) {
          DeserializeServiceGrpc.getParseVeriBlockMerklePathMethod = getParseVeriBlockMerklePathMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.BytesArrayRequest, integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseVeriBlockMerklePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.BytesArrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseVeriBlockMerklePath"))
              .build();
        }
      }
    }
    return getParseVeriBlockMerklePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.MerklePathRequest,
      integration.api.grpc.VeriBlockMessages.MerklePathReply> getParseMerklePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseMerklePath",
      requestType = integration.api.grpc.VeriBlockMessages.MerklePathRequest.class,
      responseType = integration.api.grpc.VeriBlockMessages.MerklePathReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.MerklePathRequest,
      integration.api.grpc.VeriBlockMessages.MerklePathReply> getParseMerklePathMethod() {
    io.grpc.MethodDescriptor<integration.api.grpc.VeriBlockMessages.MerklePathRequest, integration.api.grpc.VeriBlockMessages.MerklePathReply> getParseMerklePathMethod;
    if ((getParseMerklePathMethod = DeserializeServiceGrpc.getParseMerklePathMethod) == null) {
      synchronized (DeserializeServiceGrpc.class) {
        if ((getParseMerklePathMethod = DeserializeServiceGrpc.getParseMerklePathMethod) == null) {
          DeserializeServiceGrpc.getParseMerklePathMethod = getParseMerklePathMethod =
              io.grpc.MethodDescriptor.<integration.api.grpc.VeriBlockMessages.MerklePathRequest, integration.api.grpc.VeriBlockMessages.MerklePathReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseMerklePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.MerklePathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  integration.api.grpc.VeriBlockMessages.MerklePathReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeserializeServiceMethodDescriptorSupplier("ParseMerklePath"))
              .build();
        }
      }
    }
    return getParseMerklePathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeserializeServiceStub newStub(io.grpc.Channel channel) {
    return new DeserializeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeserializeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeserializeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeserializeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeserializeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DeserializeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void parseAltPublication(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.AltPublicationReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseAltPublicationMethod(), responseObserver);
    }

    /**
     */
    public void parsePublicationData(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.PublicationDataReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParsePublicationDataMethod(), responseObserver);
    }

    /**
     */
    public void parseBitcoinTransaction(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseBitcoinTransactionMethod(), responseObserver);
    }

    /**
     */
    public void parseVeriBlockBlock(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseVeriBlockBlockMethod(), responseObserver);
    }

    /**
     */
    public void parseVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseVeriBlockTransactionMethod(), responseObserver);
    }

    /**
     */
    public void parseVeriBlockPublication(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseVeriBlockPublicationMethod(), responseObserver);
    }

    /**
     */
    public void parseVeriBlockPopTx(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseVeriBlockPopTxMethod(), responseObserver);
    }

    /**
     */
    public void parseOutput(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.OutputReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseOutputMethod(), responseObserver);
    }

    /**
     */
    public void parseAddress(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.AddressReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseAddressMethod(), responseObserver);
    }

    /**
     */
    public void parseBitcoinBlock(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BitcoinBlockReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseBitcoinBlockMethod(), responseObserver);
    }

    /**
     */
    public void parseVeriBlockMerklePath(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseVeriBlockMerklePathMethod(), responseObserver);
    }

    /**
     */
    public void parseMerklePath(integration.api.grpc.VeriBlockMessages.MerklePathRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.MerklePathReply> responseObserver) {
      asyncUnimplementedUnaryCall(getParseMerklePathMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParseAltPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.AltPublicationReply>(
                  this, METHODID_PARSE_ALT_PUBLICATION)))
          .addMethod(
            getParsePublicationDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.PublicationDataReply>(
                  this, METHODID_PARSE_PUBLICATION_DATA)))
          .addMethod(
            getParseBitcoinTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply>(
                  this, METHODID_PARSE_BITCOIN_TRANSACTION)))
          .addMethod(
            getParseVeriBlockBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply>(
                  this, METHODID_PARSE_VERI_BLOCK_BLOCK)))
          .addMethod(
            getParseVeriBlockTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply>(
                  this, METHODID_PARSE_VERI_BLOCK_TRANSACTION)))
          .addMethod(
            getParseVeriBlockPublicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply>(
                  this, METHODID_PARSE_VERI_BLOCK_PUBLICATION)))
          .addMethod(
            getParseVeriBlockPopTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply>(
                  this, METHODID_PARSE_VERI_BLOCK_POP_TX)))
          .addMethod(
            getParseOutputMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.OutputReply>(
                  this, METHODID_PARSE_OUTPUT)))
          .addMethod(
            getParseAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.AddressReply>(
                  this, METHODID_PARSE_ADDRESS)))
          .addMethod(
            getParseBitcoinBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.BitcoinBlockReply>(
                  this, METHODID_PARSE_BITCOIN_BLOCK)))
          .addMethod(
            getParseVeriBlockMerklePathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.BytesArrayRequest,
                integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply>(
                  this, METHODID_PARSE_VERI_BLOCK_MERKLE_PATH)))
          .addMethod(
            getParseMerklePathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                integration.api.grpc.VeriBlockMessages.MerklePathRequest,
                integration.api.grpc.VeriBlockMessages.MerklePathReply>(
                  this, METHODID_PARSE_MERKLE_PATH)))
          .build();
    }
  }

  /**
   */
  public static final class DeserializeServiceStub extends io.grpc.stub.AbstractStub<DeserializeServiceStub> {
    private DeserializeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeserializeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeserializeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeserializeServiceStub(channel, callOptions);
    }

    /**
     */
    public void parseAltPublication(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.AltPublicationReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseAltPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parsePublicationData(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.PublicationDataReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParsePublicationDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseBitcoinTransaction(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseBitcoinTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseVeriBlockBlock(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseVeriBlockBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseVeriBlockTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseVeriBlockPublication(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseVeriBlockPublicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseVeriBlockPopTx(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseVeriBlockPopTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseOutput(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.OutputReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseOutputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseAddress(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.AddressReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseBitcoinBlock(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BitcoinBlockReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseBitcoinBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseVeriBlockMerklePath(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseVeriBlockMerklePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseMerklePath(integration.api.grpc.VeriBlockMessages.MerklePathRequest request,
        io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.MerklePathReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParseMerklePathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeserializeServiceBlockingStub extends io.grpc.stub.AbstractStub<DeserializeServiceBlockingStub> {
    private DeserializeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeserializeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeserializeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeserializeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.AltPublicationReply parseAltPublication(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseAltPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.PublicationDataReply parsePublicationData(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParsePublicationDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply parseBitcoinTransaction(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseBitcoinTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply parseVeriBlockBlock(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseVeriBlockBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply parseVeriBlockTransaction(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseVeriBlockTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply parseVeriBlockPublication(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseVeriBlockPublicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply parseVeriBlockPopTx(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseVeriBlockPopTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.OutputReply parseOutput(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseOutputMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.AddressReply parseAddress(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.BitcoinBlockReply parseBitcoinBlock(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseBitcoinBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply parseVeriBlockMerklePath(integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseVeriBlockMerklePathMethod(), getCallOptions(), request);
    }

    /**
     */
    public integration.api.grpc.VeriBlockMessages.MerklePathReply parseMerklePath(integration.api.grpc.VeriBlockMessages.MerklePathRequest request) {
      return blockingUnaryCall(
          getChannel(), getParseMerklePathMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeserializeServiceFutureStub extends io.grpc.stub.AbstractStub<DeserializeServiceFutureStub> {
    private DeserializeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeserializeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeserializeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeserializeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.AltPublicationReply> parseAltPublication(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseAltPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.PublicationDataReply> parsePublicationData(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParsePublicationDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply> parseBitcoinTransaction(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseBitcoinTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply> parseVeriBlockBlock(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseVeriBlockBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply> parseVeriBlockTransaction(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseVeriBlockTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply> parseVeriBlockPublication(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseVeriBlockPublicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply> parseVeriBlockPopTx(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseVeriBlockPopTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.OutputReply> parseOutput(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseOutputMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.AddressReply> parseAddress(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.BitcoinBlockReply> parseBitcoinBlock(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseBitcoinBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply> parseVeriBlockMerklePath(
        integration.api.grpc.VeriBlockMessages.BytesArrayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseVeriBlockMerklePathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<integration.api.grpc.VeriBlockMessages.MerklePathReply> parseMerklePath(
        integration.api.grpc.VeriBlockMessages.MerklePathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getParseMerklePathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARSE_ALT_PUBLICATION = 0;
  private static final int METHODID_PARSE_PUBLICATION_DATA = 1;
  private static final int METHODID_PARSE_BITCOIN_TRANSACTION = 2;
  private static final int METHODID_PARSE_VERI_BLOCK_BLOCK = 3;
  private static final int METHODID_PARSE_VERI_BLOCK_TRANSACTION = 4;
  private static final int METHODID_PARSE_VERI_BLOCK_PUBLICATION = 5;
  private static final int METHODID_PARSE_VERI_BLOCK_POP_TX = 6;
  private static final int METHODID_PARSE_OUTPUT = 7;
  private static final int METHODID_PARSE_ADDRESS = 8;
  private static final int METHODID_PARSE_BITCOIN_BLOCK = 9;
  private static final int METHODID_PARSE_VERI_BLOCK_MERKLE_PATH = 10;
  private static final int METHODID_PARSE_MERKLE_PATH = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeserializeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeserializeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARSE_ALT_PUBLICATION:
          serviceImpl.parseAltPublication((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.AltPublicationReply>) responseObserver);
          break;
        case METHODID_PARSE_PUBLICATION_DATA:
          serviceImpl.parsePublicationData((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.PublicationDataReply>) responseObserver);
          break;
        case METHODID_PARSE_BITCOIN_TRANSACTION:
          serviceImpl.parseBitcoinTransaction((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BitcoinTransactionReply>) responseObserver);
          break;
        case METHODID_PARSE_VERI_BLOCK_BLOCK:
          serviceImpl.parseVeriBlockBlock((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockBlockReply>) responseObserver);
          break;
        case METHODID_PARSE_VERI_BLOCK_TRANSACTION:
          serviceImpl.parseVeriBlockTransaction((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockTransactionReply>) responseObserver);
          break;
        case METHODID_PARSE_VERI_BLOCK_PUBLICATION:
          serviceImpl.parseVeriBlockPublication((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockPublicationReply>) responseObserver);
          break;
        case METHODID_PARSE_VERI_BLOCK_POP_TX:
          serviceImpl.parseVeriBlockPopTx((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockPoPTransactionReply>) responseObserver);
          break;
        case METHODID_PARSE_OUTPUT:
          serviceImpl.parseOutput((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.OutputReply>) responseObserver);
          break;
        case METHODID_PARSE_ADDRESS:
          serviceImpl.parseAddress((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.AddressReply>) responseObserver);
          break;
        case METHODID_PARSE_BITCOIN_BLOCK:
          serviceImpl.parseBitcoinBlock((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.BitcoinBlockReply>) responseObserver);
          break;
        case METHODID_PARSE_VERI_BLOCK_MERKLE_PATH:
          serviceImpl.parseVeriBlockMerklePath((integration.api.grpc.VeriBlockMessages.BytesArrayRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.VeriBlockMerklePathReply>) responseObserver);
          break;
        case METHODID_PARSE_MERKLE_PATH:
          serviceImpl.parseMerklePath((integration.api.grpc.VeriBlockMessages.MerklePathRequest) request,
              (io.grpc.stub.StreamObserver<integration.api.grpc.VeriBlockMessages.MerklePathReply>) responseObserver);
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

  private static abstract class DeserializeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeserializeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return integration.api.grpc.VeriBlockMessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeserializeService");
    }
  }

  private static final class DeserializeServiceFileDescriptorSupplier
      extends DeserializeServiceBaseDescriptorSupplier {
    DeserializeServiceFileDescriptorSupplier() {}
  }

  private static final class DeserializeServiceMethodDescriptorSupplier
      extends DeserializeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeserializeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeserializeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeserializeServiceFileDescriptorSupplier())
              .addMethod(getParseAltPublicationMethod())
              .addMethod(getParsePublicationDataMethod())
              .addMethod(getParseBitcoinTransactionMethod())
              .addMethod(getParseVeriBlockBlockMethod())
              .addMethod(getParseVeriBlockTransactionMethod())
              .addMethod(getParseVeriBlockPublicationMethod())
              .addMethod(getParseVeriBlockPopTxMethod())
              .addMethod(getParseOutputMethod())
              .addMethod(getParseAddressMethod())
              .addMethod(getParseBitcoinBlockMethod())
              .addMethod(getParseVeriBlockMerklePathMethod())
              .addMethod(getParseMerklePathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
