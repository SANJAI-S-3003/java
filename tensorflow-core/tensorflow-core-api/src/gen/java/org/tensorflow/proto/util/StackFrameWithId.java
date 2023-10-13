// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.proto.util;

/**
 * <pre>
 * A stack frame with ID.
 * </pre>
 *
 * Protobuf type {@code tensorflow.StackFrameWithId}
 */
public final class StackFrameWithId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.StackFrameWithId)
    StackFrameWithIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StackFrameWithId.newBuilder() to construct.
  private StackFrameWithId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StackFrameWithId() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StackFrameWithId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.util.DebugEventProtos.internal_static_tensorflow_StackFrameWithId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.util.DebugEventProtos.internal_static_tensorflow_StackFrameWithId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.util.StackFrameWithId.class, org.tensorflow.proto.util.StackFrameWithId.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * A unique ID for the stack frame: A UUID-like string.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A unique ID for the stack frame: A UUID-like string.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_LINE_COL_FIELD_NUMBER = 2;
  private org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol fileLineCol_;
  /**
   * <pre>
   * Stack frame, i.e., a frame of a stack trace, containing information
   * regarding the file name, line number, function name, code content
   * of the line, and column number (if available).
   * </pre>
   *
   * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
   * @return Whether the fileLineCol field is set.
   */
  @java.lang.Override
  public boolean hasFileLineCol() {
    return fileLineCol_ != null;
  }
  /**
   * <pre>
   * Stack frame, i.e., a frame of a stack trace, containing information
   * regarding the file name, line number, function name, code content
   * of the line, and column number (if available).
   * </pre>
   *
   * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
   * @return The fileLineCol.
   */
  @java.lang.Override
  public org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol getFileLineCol() {
    return fileLineCol_ == null ? org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.getDefaultInstance() : fileLineCol_;
  }
  /**
   * <pre>
   * Stack frame, i.e., a frame of a stack trace, containing information
   * regarding the file name, line number, function name, code content
   * of the line, and column number (if available).
   * </pre>
   *
   * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.framework.GraphDebugInfo.FileLineColOrBuilder getFileLineColOrBuilder() {
    return getFileLineCol();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (fileLineCol_ != null) {
      output.writeMessage(2, getFileLineCol());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (fileLineCol_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFileLineCol());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.util.StackFrameWithId)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.util.StackFrameWithId other = (org.tensorflow.proto.util.StackFrameWithId) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasFileLineCol() != other.hasFileLineCol()) return false;
    if (hasFileLineCol()) {
      if (!getFileLineCol()
          .equals(other.getFileLineCol())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasFileLineCol()) {
      hash = (37 * hash) + FILE_LINE_COL_FIELD_NUMBER;
      hash = (53 * hash) + getFileLineCol().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.StackFrameWithId parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.util.StackFrameWithId prototype) {
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
   * A stack frame with ID.
   * </pre>
   *
   * Protobuf type {@code tensorflow.StackFrameWithId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.StackFrameWithId)
      org.tensorflow.proto.util.StackFrameWithIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.util.DebugEventProtos.internal_static_tensorflow_StackFrameWithId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.util.DebugEventProtos.internal_static_tensorflow_StackFrameWithId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.util.StackFrameWithId.class, org.tensorflow.proto.util.StackFrameWithId.Builder.class);
    }

    // Construct using org.tensorflow.proto.util.StackFrameWithId.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      if (fileLineColBuilder_ == null) {
        fileLineCol_ = null;
      } else {
        fileLineCol_ = null;
        fileLineColBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.util.DebugEventProtos.internal_static_tensorflow_StackFrameWithId_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.StackFrameWithId getDefaultInstanceForType() {
      return org.tensorflow.proto.util.StackFrameWithId.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.util.StackFrameWithId build() {
      org.tensorflow.proto.util.StackFrameWithId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.StackFrameWithId buildPartial() {
      org.tensorflow.proto.util.StackFrameWithId result = new org.tensorflow.proto.util.StackFrameWithId(this);
      result.id_ = id_;
      if (fileLineColBuilder_ == null) {
        result.fileLineCol_ = fileLineCol_;
      } else {
        result.fileLineCol_ = fileLineColBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.proto.util.StackFrameWithId) {
        return mergeFrom((org.tensorflow.proto.util.StackFrameWithId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.util.StackFrameWithId other) {
      if (other == org.tensorflow.proto.util.StackFrameWithId.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasFileLineCol()) {
        mergeFileLineCol(other.getFileLineCol());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getFileLineColFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * A unique ID for the stack frame: A UUID-like string.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A unique ID for the stack frame: A UUID-like string.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A unique ID for the stack frame: A UUID-like string.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique ID for the stack frame: A UUID-like string.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A unique ID for the stack frame: A UUID-like string.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol fileLineCol_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol, org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.Builder, org.tensorflow.proto.framework.GraphDebugInfo.FileLineColOrBuilder> fileLineColBuilder_;
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     * @return Whether the fileLineCol field is set.
     */
    public boolean hasFileLineCol() {
      return fileLineColBuilder_ != null || fileLineCol_ != null;
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     * @return The fileLineCol.
     */
    public org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol getFileLineCol() {
      if (fileLineColBuilder_ == null) {
        return fileLineCol_ == null ? org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.getDefaultInstance() : fileLineCol_;
      } else {
        return fileLineColBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     */
    public Builder setFileLineCol(org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol value) {
      if (fileLineColBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fileLineCol_ = value;
        onChanged();
      } else {
        fileLineColBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     */
    public Builder setFileLineCol(
        org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.Builder builderForValue) {
      if (fileLineColBuilder_ == null) {
        fileLineCol_ = builderForValue.build();
        onChanged();
      } else {
        fileLineColBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     */
    public Builder mergeFileLineCol(org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol value) {
      if (fileLineColBuilder_ == null) {
        if (fileLineCol_ != null) {
          fileLineCol_ =
            org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.newBuilder(fileLineCol_).mergeFrom(value).buildPartial();
        } else {
          fileLineCol_ = value;
        }
        onChanged();
      } else {
        fileLineColBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     */
    public Builder clearFileLineCol() {
      if (fileLineColBuilder_ == null) {
        fileLineCol_ = null;
        onChanged();
      } else {
        fileLineCol_ = null;
        fileLineColBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     */
    public org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.Builder getFileLineColBuilder() {
      
      onChanged();
      return getFileLineColFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     */
    public org.tensorflow.proto.framework.GraphDebugInfo.FileLineColOrBuilder getFileLineColOrBuilder() {
      if (fileLineColBuilder_ != null) {
        return fileLineColBuilder_.getMessageOrBuilder();
      } else {
        return fileLineCol_ == null ?
            org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.getDefaultInstance() : fileLineCol_;
      }
    }
    /**
     * <pre>
     * Stack frame, i.e., a frame of a stack trace, containing information
     * regarding the file name, line number, function name, code content
     * of the line, and column number (if available).
     * </pre>
     *
     * <code>.tensorflow.GraphDebugInfo.FileLineCol file_line_col = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol, org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.Builder, org.tensorflow.proto.framework.GraphDebugInfo.FileLineColOrBuilder> 
        getFileLineColFieldBuilder() {
      if (fileLineColBuilder_ == null) {
        fileLineColBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol, org.tensorflow.proto.framework.GraphDebugInfo.FileLineCol.Builder, org.tensorflow.proto.framework.GraphDebugInfo.FileLineColOrBuilder>(
                getFileLineCol(),
                getParentForChildren(),
                isClean());
        fileLineCol_ = null;
      }
      return fileLineColBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.StackFrameWithId)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.StackFrameWithId)
  private static final org.tensorflow.proto.util.StackFrameWithId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.util.StackFrameWithId();
  }

  public static org.tensorflow.proto.util.StackFrameWithId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StackFrameWithId>
      PARSER = new com.google.protobuf.AbstractParser<StackFrameWithId>() {
    @java.lang.Override
    public StackFrameWithId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<StackFrameWithId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StackFrameWithId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.util.StackFrameWithId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
