// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.emsi.tpgrpcbanque.stubs;

/**
 * Protobuf type {@code GetComptesByTypeRequest}
 */
public  final class GetComptesByTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetComptesByTypeRequest)
    GetComptesByTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetComptesByTypeRequest.newBuilder() to construct.
  private GetComptesByTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetComptesByTypeRequest() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetComptesByTypeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetComptesByTypeRequest(
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

            type_ = rawValue;
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
    return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.class, ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.TypeCompte type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.TypeCompte type = 1;</code>
   * @return The type.
   */
  public ma.emsi.tpgrpcbanque.stubs.TypeCompte getType() {
    @SuppressWarnings("deprecation")
    ma.emsi.tpgrpcbanque.stubs.TypeCompte result = ma.emsi.tpgrpcbanque.stubs.TypeCompte.valueOf(type_);
    return result == null ? ma.emsi.tpgrpcbanque.stubs.TypeCompte.UNRECOGNIZED : result;
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
    if (type_ != ma.emsi.tpgrpcbanque.stubs.TypeCompte.COURANT.getNumber()) {
      output.writeEnum(1, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != ma.emsi.tpgrpcbanque.stubs.TypeCompte.COURANT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
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
    if (!(obj instanceof ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest)) {
      return super.equals(obj);
    }
    ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest other = (ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest) obj;

    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parseFrom(
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
  public static Builder newBuilder(ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest prototype) {
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
   * Protobuf type {@code GetComptesByTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetComptesByTypeRequest)
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.class, ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.Builder.class);
    }

    // Construct using ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.newBuilder()
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
      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.emsi.tpgrpcbanque.stubs.CompteServiceOuterClass.internal_static_GetComptesByTypeRequest_descriptor;
    }

    @java.lang.Override
    public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest getDefaultInstanceForType() {
      return ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest build() {
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest buildPartial() {
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest result = new ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest(this);
      result.type_ = type_;
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
      if (other instanceof ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest) {
        return mergeFrom((ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest other) {
      if (other == ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.TypeCompte type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.TypeCompte type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.TypeCompte type = 1;</code>
     * @return The type.
     */
    public ma.emsi.tpgrpcbanque.stubs.TypeCompte getType() {
      @SuppressWarnings("deprecation")
      ma.emsi.tpgrpcbanque.stubs.TypeCompte result = ma.emsi.tpgrpcbanque.stubs.TypeCompte.valueOf(type_);
      return result == null ? ma.emsi.tpgrpcbanque.stubs.TypeCompte.UNRECOGNIZED : result;
    }
    /**
     * <code>.TypeCompte type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(ma.emsi.tpgrpcbanque.stubs.TypeCompte value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.TypeCompte type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:GetComptesByTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:GetComptesByTypeRequest)
  private static final ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest();
  }

  public static ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetComptesByTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetComptesByTypeRequest>() {
    @java.lang.Override
    public GetComptesByTypeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetComptesByTypeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetComptesByTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetComptesByTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.emsi.tpgrpcbanque.stubs.GetComptesByTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

