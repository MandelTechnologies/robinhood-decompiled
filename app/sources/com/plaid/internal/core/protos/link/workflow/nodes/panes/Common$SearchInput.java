package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$SearchInput extends GeneratedMessageLite<Common$SearchInput, C6492a> implements MessageLiteOrBuilder {
    private static final Common$SearchInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Common$SearchInput> PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 3;
    public static final int STYLE_OVERRIDE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String id_ = "";
    private String initialValue_ = "";
    private Common$LocalizedString placeholder_;
    private Common$SearchInputStyleOverride styleOverride_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput$a */
    public static final class C6492a extends GeneratedMessageLite.Builder<Common$SearchInput, C6492a> implements MessageLiteOrBuilder {
        public C6492a() {
            super(Common$SearchInput.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SearchInput common$SearchInput = new Common$SearchInput();
        DEFAULT_INSTANCE = common$SearchInput;
        GeneratedMessageLite.registerDefaultInstance(Common$SearchInput.class, common$SearchInput);
    }

    private Common$SearchInput() {
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearInitialValue() {
        this.initialValue_ = getDefaultInstance().getInitialValue();
    }

    private void clearPlaceholder() {
        this.placeholder_ = null;
        this.bitField0_ &= -2;
    }

    private void clearStyleOverride() {
        this.styleOverride_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$SearchInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergePlaceholder(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.placeholder_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.placeholder_ = common$LocalizedString;
        } else {
            this.placeholder_ = Common$LocalizedString.newBuilder(this.placeholder_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeStyleOverride(Common$SearchInputStyleOverride common$SearchInputStyleOverride) {
        common$SearchInputStyleOverride.getClass();
        Common$SearchInputStyleOverride common$SearchInputStyleOverride2 = this.styleOverride_;
        if (common$SearchInputStyleOverride2 == null || common$SearchInputStyleOverride2 == Common$SearchInputStyleOverride.getDefaultInstance()) {
            this.styleOverride_ = common$SearchInputStyleOverride;
        } else {
            this.styleOverride_ = Common$SearchInputStyleOverride.newBuilder(this.styleOverride_).mergeFrom((Common$SearchInputStyleOverride.C6493a) common$SearchInputStyleOverride).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6492a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SearchInput parseDelimitedFrom(InputStream inputStream) {
        return (Common$SearchInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SearchInput parseFrom(ByteBuffer byteBuffer) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SearchInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setInitialValue(String str) {
        str.getClass();
        this.initialValue_ = str;
    }

    private void setInitialValueBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.initialValue_ = byteString.toStringUtf8();
    }

    private void setPlaceholder(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.placeholder_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setStyleOverride(Common$SearchInputStyleOverride common$SearchInputStyleOverride) {
        common$SearchInputStyleOverride.getClass();
        this.styleOverride_ = common$SearchInputStyleOverride;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SearchInput();
            case 2:
                return new C6492a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "id_", "initialValue_", "placeholder_", "styleOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SearchInput> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SearchInput.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public String getInitialValue() {
        return this.initialValue_;
    }

    public ByteString getInitialValueBytes() {
        return ByteString.copyFromUtf8(this.initialValue_);
    }

    public Common$LocalizedString getPlaceholder() {
        Common$LocalizedString common$LocalizedString = this.placeholder_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$SearchInputStyleOverride getStyleOverride() {
        Common$SearchInputStyleOverride common$SearchInputStyleOverride = this.styleOverride_;
        return common$SearchInputStyleOverride == null ? Common$SearchInputStyleOverride.getDefaultInstance() : common$SearchInputStyleOverride;
    }

    public boolean hasPlaceholder() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStyleOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6492a newBuilder(Common$SearchInput common$SearchInput) {
        return DEFAULT_INSTANCE.createBuilder(common$SearchInput);
    }

    public static Common$SearchInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SearchInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SearchInput parseFrom(ByteString byteString) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$SearchInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SearchInput parseFrom(byte[] bArr) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SearchInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SearchInput parseFrom(InputStream inputStream) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SearchInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SearchInput parseFrom(CodedInputStream codedInputStream) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SearchInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
