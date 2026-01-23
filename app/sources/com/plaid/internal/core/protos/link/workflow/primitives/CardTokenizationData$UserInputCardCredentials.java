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
public final class CardTokenizationData$UserInputCardCredentials extends GeneratedMessageLite<CardTokenizationData$UserInputCardCredentials, C6955a> implements MessageLiteOrBuilder {
    public static final int CARD_EXPIRATION_FIELD_NUMBER = 4;
    public static final int CARD_HOLDER_FIELD_NUMBER = 3;
    private static final CardTokenizationData$UserInputCardCredentials DEFAULT_INSTANCE;
    private static volatile Parser<CardTokenizationData$UserInputCardCredentials> PARSER = null;
    public static final int TOKENIZED_CARD_CVC_FIELD_NUMBER = 1;
    public static final int TOKENIZED_CARD_NUMBER_FIELD_NUMBER = 2;
    private String tokenizedCardCvc_ = "";
    private String tokenizedCardNumber_ = "";
    private String cardHolder_ = "";
    private String cardExpiration_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials$a */
    public static final class C6955a extends GeneratedMessageLite.Builder<CardTokenizationData$UserInputCardCredentials, C6955a> implements MessageLiteOrBuilder {
        public C6955a() {
            super(CardTokenizationData$UserInputCardCredentials.DEFAULT_INSTANCE);
        }
    }

    static {
        CardTokenizationData$UserInputCardCredentials cardTokenizationData$UserInputCardCredentials = new CardTokenizationData$UserInputCardCredentials();
        DEFAULT_INSTANCE = cardTokenizationData$UserInputCardCredentials;
        GeneratedMessageLite.registerDefaultInstance(CardTokenizationData$UserInputCardCredentials.class, cardTokenizationData$UserInputCardCredentials);
    }

    private CardTokenizationData$UserInputCardCredentials() {
    }

    private void clearCardExpiration() {
        this.cardExpiration_ = getDefaultInstance().getCardExpiration();
    }

    private void clearCardHolder() {
        this.cardHolder_ = getDefaultInstance().getCardHolder();
    }

    private void clearTokenizedCardCvc() {
        this.tokenizedCardCvc_ = getDefaultInstance().getTokenizedCardCvc();
    }

    private void clearTokenizedCardNumber() {
        this.tokenizedCardNumber_ = getDefaultInstance().getTokenizedCardNumber();
    }

    public static CardTokenizationData$UserInputCardCredentials getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6955a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardTokenizationData$UserInputCardCredentials parseDelimitedFrom(InputStream inputStream) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(ByteBuffer byteBuffer) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardTokenizationData$UserInputCardCredentials> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCardExpiration(String str) {
        str.getClass();
        this.cardExpiration_ = str;
    }

    private void setCardExpirationBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cardExpiration_ = byteString.toStringUtf8();
    }

    private void setCardHolder(String str) {
        str.getClass();
        this.cardHolder_ = str;
    }

    private void setCardHolderBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cardHolder_ = byteString.toStringUtf8();
    }

    private void setTokenizedCardCvc(String str) {
        str.getClass();
        this.tokenizedCardCvc_ = str;
    }

    private void setTokenizedCardCvcBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tokenizedCardCvc_ = byteString.toStringUtf8();
    }

    private void setTokenizedCardNumber(String str) {
        str.getClass();
        this.tokenizedCardNumber_ = str;
    }

    private void setTokenizedCardNumberBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tokenizedCardNumber_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7022b.f2649a[methodToInvoke.ordinal()]) {
            case 1:
                return new CardTokenizationData$UserInputCardCredentials();
            case 2:
                return new C6955a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"tokenizedCardCvc_", "tokenizedCardNumber_", "cardHolder_", "cardExpiration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardTokenizationData$UserInputCardCredentials> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CardTokenizationData$UserInputCardCredentials.class) {
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

    public String getCardExpiration() {
        return this.cardExpiration_;
    }

    public ByteString getCardExpirationBytes() {
        return ByteString.copyFromUtf8(this.cardExpiration_);
    }

    public String getCardHolder() {
        return this.cardHolder_;
    }

    public ByteString getCardHolderBytes() {
        return ByteString.copyFromUtf8(this.cardHolder_);
    }

    public String getTokenizedCardCvc() {
        return this.tokenizedCardCvc_;
    }

    public ByteString getTokenizedCardCvcBytes() {
        return ByteString.copyFromUtf8(this.tokenizedCardCvc_);
    }

    public String getTokenizedCardNumber() {
        return this.tokenizedCardNumber_;
    }

    public ByteString getTokenizedCardNumberBytes() {
        return ByteString.copyFromUtf8(this.tokenizedCardNumber_);
    }

    public static C6955a newBuilder(CardTokenizationData$UserInputCardCredentials cardTokenizationData$UserInputCardCredentials) {
        return DEFAULT_INSTANCE.createBuilder(cardTokenizationData$UserInputCardCredentials);
    }

    public static CardTokenizationData$UserInputCardCredentials parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(ByteString byteString) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(byte[] bArr) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(InputStream inputStream) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(CodedInputStream codedInputStream) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardTokenizationData$UserInputCardCredentials parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$UserInputCardCredentials) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
