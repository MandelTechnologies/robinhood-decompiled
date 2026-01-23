package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$SDKEncryptionMetadata extends GeneratedMessageLite<Common$SDKEncryptionMetadata, C6477a> implements MessageLiteOrBuilder {
    private static final Common$SDKEncryptionMetadata DEFAULT_INSTANCE;
    private static volatile Parser<Common$SDKEncryptionMetadata> PARSER = null;
    public static final int PUBLIC_ENCRYPTION_PEM_KEY_FIELD_NUMBER = 1;
    public static final int SCHEME_FIELD_NUMBER = 2;
    private String publicEncryptionPemKey_ = "";
    private int scheme_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata$a */
    public static final class C6477a extends GeneratedMessageLite.Builder<Common$SDKEncryptionMetadata, C6477a> implements MessageLiteOrBuilder {
        public C6477a() {
            super(Common$SDKEncryptionMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = new Common$SDKEncryptionMetadata();
        DEFAULT_INSTANCE = common$SDKEncryptionMetadata;
        GeneratedMessageLite.registerDefaultInstance(Common$SDKEncryptionMetadata.class, common$SDKEncryptionMetadata);
    }

    private Common$SDKEncryptionMetadata() {
    }

    private void clearPublicEncryptionPemKey() {
        this.publicEncryptionPemKey_ = getDefaultInstance().getPublicEncryptionPemKey();
    }

    private void clearScheme() {
        this.scheme_ = 0;
    }

    public static Common$SDKEncryptionMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6477a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SDKEncryptionMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SDKEncryptionMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPublicEncryptionPemKey(String str) {
        str.getClass();
        this.publicEncryptionPemKey_ = str;
    }

    private void setPublicEncryptionPemKeyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publicEncryptionPemKey_ = byteString.toStringUtf8();
    }

    private void setScheme(EnumC6675L enumC6675L) {
        this.scheme_ = enumC6675L.getNumber();
    }

    private void setSchemeValue(int i) {
        this.scheme_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SDKEncryptionMetadata();
            case 2:
                return new C6477a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"publicEncryptionPemKey_", "scheme_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SDKEncryptionMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SDKEncryptionMetadata.class) {
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

    public String getPublicEncryptionPemKey() {
        return this.publicEncryptionPemKey_;
    }

    public ByteString getPublicEncryptionPemKeyBytes() {
        return ByteString.copyFromUtf8(this.publicEncryptionPemKey_);
    }

    public EnumC6675L getScheme() {
        EnumC6675L enumC6675LForNumber = EnumC6675L.forNumber(this.scheme_);
        return enumC6675LForNumber == null ? EnumC6675L.UNRECOGNIZED : enumC6675LForNumber;
    }

    public int getSchemeValue() {
        return this.scheme_;
    }

    public static C6477a newBuilder(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        return DEFAULT_INSTANCE.createBuilder(common$SDKEncryptionMetadata);
    }

    public static Common$SDKEncryptionMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteString byteString) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$SDKEncryptionMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(byte[] bArr) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SDKEncryptionMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(InputStream inputStream) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKEncryptionMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKEncryptionMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SDKEncryptionMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKEncryptionMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
