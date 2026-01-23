package com.plaid.internal.core.protos.link.workflow.primitives;

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
public final class CardTokenizationData$CardCollectError extends GeneratedMessageLite<CardTokenizationData$CardCollectError, C6953a> implements MessageLiteOrBuilder {
    private static final CardTokenizationData$CardCollectError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<CardTokenizationData$CardCollectError> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String errorMessage_ = "";
    private int type_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError$a */
    public static final class C6953a extends GeneratedMessageLite.Builder<CardTokenizationData$CardCollectError, C6953a> implements MessageLiteOrBuilder {
        public C6953a() {
            super(CardTokenizationData$CardCollectError.DEFAULT_INSTANCE);
        }
    }

    static {
        CardTokenizationData$CardCollectError cardTokenizationData$CardCollectError = new CardTokenizationData$CardCollectError();
        DEFAULT_INSTANCE = cardTokenizationData$CardCollectError;
        GeneratedMessageLite.registerDefaultInstance(CardTokenizationData$CardCollectError.class, cardTokenizationData$CardCollectError);
    }

    private CardTokenizationData$CardCollectError() {
    }

    private void clearErrorMessage() {
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    private void clearType() {
        this.type_ = 0;
    }

    public static CardTokenizationData$CardCollectError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6953a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardTokenizationData$CardCollectError parseDelimitedFrom(InputStream inputStream) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardTokenizationData$CardCollectError parseFrom(ByteBuffer byteBuffer) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardTokenizationData$CardCollectError> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setErrorMessage(String str) {
        str.getClass();
        this.errorMessage_ = str;
    }

    private void setErrorMessageBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errorMessage_ = byteString.toStringUtf8();
    }

    private void setType(EnumC7023c enumC7023c) {
        this.type_ = enumC7023c.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7022b.f2649a[methodToInvoke.ordinal()]) {
            case 1:
                return new CardTokenizationData$CardCollectError();
            case 2:
                return new C6953a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "errorMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardTokenizationData$CardCollectError> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CardTokenizationData$CardCollectError.class) {
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

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public ByteString getErrorMessageBytes() {
        return ByteString.copyFromUtf8(this.errorMessage_);
    }

    public EnumC7023c getType() {
        EnumC7023c enumC7023cForNumber = EnumC7023c.forNumber(this.type_);
        return enumC7023cForNumber == null ? EnumC7023c.UNRECOGNIZED : enumC7023cForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static C6953a newBuilder(CardTokenizationData$CardCollectError cardTokenizationData$CardCollectError) {
        return DEFAULT_INSTANCE.createBuilder(cardTokenizationData$CardCollectError);
    }

    public static CardTokenizationData$CardCollectError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectError parseFrom(ByteString byteString) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardTokenizationData$CardCollectError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectError parseFrom(byte[] bArr) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardTokenizationData$CardCollectError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectError parseFrom(InputStream inputStream) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardTokenizationData$CardCollectError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectError parseFrom(CodedInputStream codedInputStream) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardTokenizationData$CardCollectError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
