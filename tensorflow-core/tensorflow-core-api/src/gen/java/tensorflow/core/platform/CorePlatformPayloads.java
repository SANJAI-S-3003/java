// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/core_platform_payloads.proto

package tensorflow.core.platform;

public final class CorePlatformPayloads {
  private CorePlatformPayloads() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ErrorSourceProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.core.platform.ErrorSourceProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     */
    int getErrorSourceValue();
    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     */
    tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource getErrorSource();
  }
  /**
   * <pre>
   * If included as a payload, this message contains the error source information
   * where the error was raised.
   * URI: "type.googleapis.com/tensorflow.core.platform.ErrorSourceProto"
   * </pre>
   *
   * Protobuf type {@code tensorflow.core.platform.ErrorSourceProto}
   */
  public  static final class ErrorSourceProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.core.platform.ErrorSourceProto)
      ErrorSourceProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ErrorSourceProto.newBuilder() to construct.
    private ErrorSourceProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ErrorSourceProto() {
      errorSource_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ErrorSourceProto();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorSourceProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              errorSource_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tensorflow.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tensorflow.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.class, tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.Builder.class);
    }

    /**
     * Protobuf enum {@code tensorflow.core.platform.ErrorSourceProto.ErrorSource}
     */
    public enum ErrorSource
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>TPU_COMPILE_OP = 1;</code>
       */
      TPU_COMPILE_OP(1),
      /**
       * <pre>
       * Old bridge.
       * </pre>
       *
       * <code>TF_XLA_BRIDGE = 2;</code>
       */
      TF_XLA_BRIDGE(2),
      /**
       * <pre>
       * TPUBridge.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_1 = 3;</code>
       */
      MLIR_BRIDGE_PHASE_1(3),
      /**
       * <pre>
       * LegalizeToHlo.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_2 = 4;</code>
       */
      MLIR_BRIDGE_PHASE_2(4),
      /**
       * <pre>
       * eager::RemoteMgr.
       * </pre>
       *
       * <code>EAGER_REMOTE_MGR = 5;</code>
       */
      EAGER_REMOTE_MGR(5),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>TPU_COMPILE_OP = 1;</code>
       */
      public static final int TPU_COMPILE_OP_VALUE = 1;
      /**
       * <pre>
       * Old bridge.
       * </pre>
       *
       * <code>TF_XLA_BRIDGE = 2;</code>
       */
      public static final int TF_XLA_BRIDGE_VALUE = 2;
      /**
       * <pre>
       * TPUBridge.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_1 = 3;</code>
       */
      public static final int MLIR_BRIDGE_PHASE_1_VALUE = 3;
      /**
       * <pre>
       * LegalizeToHlo.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_2 = 4;</code>
       */
      public static final int MLIR_BRIDGE_PHASE_2_VALUE = 4;
      /**
       * <pre>
       * eager::RemoteMgr.
       * </pre>
       *
       * <code>EAGER_REMOTE_MGR = 5;</code>
       */
      public static final int EAGER_REMOTE_MGR_VALUE = 5;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ErrorSource valueOf(int value) {
        return forNumber(value);
      }

      public static ErrorSource forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return TPU_COMPILE_OP;
          case 2: return TF_XLA_BRIDGE;
          case 3: return MLIR_BRIDGE_PHASE_1;
          case 4: return MLIR_BRIDGE_PHASE_2;
          case 5: return EAGER_REMOTE_MGR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ErrorSource>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ErrorSource> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ErrorSource>() {
              public ErrorSource findValueByNumber(int number) {
                return ErrorSource.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final ErrorSource[] VALUES = values();

      public static ErrorSource valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private ErrorSource(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:tensorflow.core.platform.ErrorSourceProto.ErrorSource)
    }

    public static final int ERROR_SOURCE_FIELD_NUMBER = 1;
    private int errorSource_;
    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     */
    public int getErrorSourceValue() {
      return errorSource_;
    }
    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     */
    public tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource getErrorSource() {
      @SuppressWarnings("deprecation")
      tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource result = tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.valueOf(errorSource_);
      return result == null ? tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (errorSource_ != tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNKNOWN.getNumber()) {
        output.writeEnum(1, errorSource_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (errorSource_ != tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, errorSource_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto)) {
        return super.equals(obj);
      }
      tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto other = (tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto) obj;

      if (errorSource_ != other.errorSource_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ERROR_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + errorSource_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * If included as a payload, this message contains the error source information
     * where the error was raised.
     * URI: "type.googleapis.com/tensorflow.core.platform.ErrorSourceProto"
     * </pre>
     *
     * Protobuf type {@code tensorflow.core.platform.ErrorSourceProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.core.platform.ErrorSourceProto)
        tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tensorflow.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tensorflow.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.class, tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.Builder.class);
      }

      // Construct using tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        errorSource_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tensorflow.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
      }

      @java.lang.Override
      public tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto getDefaultInstanceForType() {
        return tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.getDefaultInstance();
      }

      @java.lang.Override
      public tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto build() {
        tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto buildPartial() {
        tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto result = new tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto(this);
        result.errorSource_ = errorSource_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto) {
          return mergeFrom((tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto other) {
        if (other == tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.getDefaultInstance()) return this;
        if (other.errorSource_ != 0) {
          setErrorSourceValue(other.getErrorSourceValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int errorSource_ = 0;
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       */
      public int getErrorSourceValue() {
        return errorSource_;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       */
      public Builder setErrorSourceValue(int value) {
        errorSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       */
      public tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource getErrorSource() {
        @SuppressWarnings("deprecation")
        tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource result = tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.valueOf(errorSource_);
        return result == null ? tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       */
      public Builder setErrorSource(tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        errorSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       */
      public Builder clearErrorSource() {
        
        errorSource_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tensorflow.core.platform.ErrorSourceProto)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.core.platform.ErrorSourceProto)
    private static final tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto();
    }

    public static tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ErrorSourceProto>
        PARSER = new com.google.protobuf.AbstractParser<ErrorSourceProto>() {
      @java.lang.Override
      public ErrorSourceProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorSourceProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ErrorSourceProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorSourceProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tensorflow.core.platform.CorePlatformPayloads.ErrorSourceProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5tensorflow/core/protobuf/core_platform" +
      "_payloads.proto\022\030tensorflow.core.platfor" +
      "m\"\354\001\n\020ErrorSourceProto\022L\n\014error_source\030\001" +
      " \001(\01626.tensorflow.core.platform.ErrorSou" +
      "rceProto.ErrorSource\"\211\001\n\013ErrorSource\022\013\n\007" +
      "UNKNOWN\020\000\022\022\n\016TPU_COMPILE_OP\020\001\022\021\n\rTF_XLA_" +
      "BRIDGE\020\002\022\027\n\023MLIR_BRIDGE_PHASE_1\020\003\022\027\n\023MLI" +
      "R_BRIDGE_PHASE_2\020\004\022\024\n\020EAGER_REMOTE_MGR\020\005" +
      "BZZUgithub.com/tensorflow/tensorflow/ten" +
      "sorflow/go/core/protobuf/for_core_protos" +
      "_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor,
        new java.lang.String[] { "ErrorSource", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}