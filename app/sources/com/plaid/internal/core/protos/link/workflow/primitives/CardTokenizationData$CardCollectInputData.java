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
public final class CardTokenizationData$CardCollectInputData extends GeneratedMessageLite<CardTokenizationData$CardCollectInputData, C6954a> implements MessageLiteOrBuilder {
    public static final int CARD_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_ID_FIELD_NUMBER = 5;
    private static final CardTokenizationData$CardCollectInputData DEFAULT_INSTANCE;
    public static final int LINK_TOKEN_FIELD_NUMBER = 6;
    private static volatile Parser<CardTokenizationData$CardCollectInputData> PARSER = null;
    public static final int VAULT_CNAME_FIELD_NUMBER = 8;
    public static final int VAULT_ENVIRONMENT_FIELD_NUMBER = 7;
    public static final int VAULT_ID_FIELD_NUMBER = 3;
    public static final int VAULT_INBOUND_PATH_FIELD_NUMBER = 4;
    public static final int VAULT_TYPE_FIELD_NUMBER = 2;
    private int vaultType_;
    private String cardId_ = "";
    private String vaultId_ = "";
    private String vaultInboundPath_ = "";
    private String clientId_ = "";
    private String linkToken_ = "";
    private String vaultEnvironment_ = "";
    private String vaultCname_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData$a */
    public static final class C6954a extends GeneratedMessageLite.Builder<CardTokenizationData$CardCollectInputData, C6954a> implements MessageLiteOrBuilder {
        public C6954a() {
            super(CardTokenizationData$CardCollectInputData.DEFAULT_INSTANCE);
        }
    }

    static {
        CardTokenizationData$CardCollectInputData cardTokenizationData$CardCollectInputData = new CardTokenizationData$CardCollectInputData();
        DEFAULT_INSTANCE = cardTokenizationData$CardCollectInputData;
        GeneratedMessageLite.registerDefaultInstance(CardTokenizationData$CardCollectInputData.class, cardTokenizationData$CardCollectInputData);
    }

    private CardTokenizationData$CardCollectInputData() {
    }

    private void clearCardId() {
        this.cardId_ = getDefaultInstance().getCardId();
    }

    private void clearClientId() {
        this.clientId_ = getDefaultInstance().getClientId();
    }

    private void clearLinkToken() {
        this.linkToken_ = getDefaultInstance().getLinkToken();
    }

    private void clearVaultCname() {
        this.vaultCname_ = getDefaultInstance().getVaultCname();
    }

    private void clearVaultEnvironment() {
        this.vaultEnvironment_ = getDefaultInstance().getVaultEnvironment();
    }

    private void clearVaultId() {
        this.vaultId_ = getDefaultInstance().getVaultId();
    }

    private void clearVaultInboundPath() {
        this.vaultInboundPath_ = getDefaultInstance().getVaultInboundPath();
    }

    private void clearVaultType() {
        this.vaultType_ = 0;
    }

    public static CardTokenizationData$CardCollectInputData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6954a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardTokenizationData$CardCollectInputData parseDelimitedFrom(InputStream inputStream) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(ByteBuffer byteBuffer) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardTokenizationData$CardCollectInputData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCardId(String str) {
        str.getClass();
        this.cardId_ = str;
    }

    private void setCardIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cardId_ = byteString.toStringUtf8();
    }

    private void setClientId(String str) {
        str.getClass();
        this.clientId_ = str;
    }

    private void setClientIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientId_ = byteString.toStringUtf8();
    }

    private void setLinkToken(String str) {
        str.getClass();
        this.linkToken_ = str;
    }

    private void setLinkTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkToken_ = byteString.toStringUtf8();
    }

    private void setVaultCname(String str) {
        str.getClass();
        this.vaultCname_ = str;
    }

    private void setVaultCnameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultCname_ = byteString.toStringUtf8();
    }

    private void setVaultEnvironment(String str) {
        str.getClass();
        this.vaultEnvironment_ = str;
    }

    private void setVaultEnvironmentBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultEnvironment_ = byteString.toStringUtf8();
    }

    private void setVaultId(String str) {
        str.getClass();
        this.vaultId_ = str;
    }

    private void setVaultIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultId_ = byteString.toStringUtf8();
    }

    private void setVaultInboundPath(String str) {
        str.getClass();
        this.vaultInboundPath_ = str;
    }

    private void setVaultInboundPathBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultInboundPath_ = byteString.toStringUtf8();
    }

    private void setVaultType(EnumC7024d enumC7024d) {
        this.vaultType_ = enumC7024d.getNumber();
    }

    private void setVaultTypeValue(int i) {
        this.vaultType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7022b.f2649a[methodToInvoke.ordinal()]) {
            case 1:
                return new CardTokenizationData$CardCollectInputData();
            case 2:
                return new C6954a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"cardId_", "vaultType_", "vaultId_", "vaultInboundPath_", "clientId_", "linkToken_", "vaultEnvironment_", "vaultCname_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardTokenizationData$CardCollectInputData> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CardTokenizationData$CardCollectInputData.class) {
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

    public String getCardId() {
        return this.cardId_;
    }

    public ByteString getCardIdBytes() {
        return ByteString.copyFromUtf8(this.cardId_);
    }

    public String getClientId() {
        return this.clientId_;
    }

    public ByteString getClientIdBytes() {
        return ByteString.copyFromUtf8(this.clientId_);
    }

    public String getLinkToken() {
        return this.linkToken_;
    }

    public ByteString getLinkTokenBytes() {
        return ByteString.copyFromUtf8(this.linkToken_);
    }

    public String getVaultCname() {
        return this.vaultCname_;
    }

    public ByteString getVaultCnameBytes() {
        return ByteString.copyFromUtf8(this.vaultCname_);
    }

    public String getVaultEnvironment() {
        return this.vaultEnvironment_;
    }

    public ByteString getVaultEnvironmentBytes() {
        return ByteString.copyFromUtf8(this.vaultEnvironment_);
    }

    public String getVaultId() {
        return this.vaultId_;
    }

    public ByteString getVaultIdBytes() {
        return ByteString.copyFromUtf8(this.vaultId_);
    }

    public String getVaultInboundPath() {
        return this.vaultInboundPath_;
    }

    public ByteString getVaultInboundPathBytes() {
        return ByteString.copyFromUtf8(this.vaultInboundPath_);
    }

    public EnumC7024d getVaultType() {
        EnumC7024d enumC7024dForNumber = EnumC7024d.forNumber(this.vaultType_);
        return enumC7024dForNumber == null ? EnumC7024d.UNRECOGNIZED : enumC7024dForNumber;
    }

    public int getVaultTypeValue() {
        return this.vaultType_;
    }

    public static C6954a newBuilder(CardTokenizationData$CardCollectInputData cardTokenizationData$CardCollectInputData) {
        return DEFAULT_INSTANCE.createBuilder(cardTokenizationData$CardCollectInputData);
    }

    public static CardTokenizationData$CardCollectInputData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(ByteString byteString) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(byte[] bArr) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(InputStream inputStream) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(CodedInputStream codedInputStream) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardTokenizationData$CardCollectInputData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CardTokenizationData$CardCollectInputData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
