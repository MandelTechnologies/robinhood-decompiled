package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.api.TrustedAuth$ClientConfig;
import com.plaid.internal.core.protos.link.api.TrustedAuth$InstitutionConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class TrustedAuth$TrustedAuthVerifyResponse extends GeneratedMessageLite<TrustedAuth$TrustedAuthVerifyResponse, C6191a> implements MessageLiteOrBuilder {
    public static final int CLIENT_CONFIG_FIELD_NUMBER = 2;
    private static final TrustedAuth$TrustedAuthVerifyResponse DEFAULT_INSTANCE;
    public static final int INSTITUTION_CONFIG_FIELD_NUMBER = 1;
    private static volatile Parser<TrustedAuth$TrustedAuthVerifyResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private TrustedAuth$ClientConfig clientConfig_;
    private TrustedAuth$InstitutionConfig institutionConfig_;
    private String requestId_ = "";
    private String sessionId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.TrustedAuth$TrustedAuthVerifyResponse$a */
    public static final class C6191a extends GeneratedMessageLite.Builder<TrustedAuth$TrustedAuthVerifyResponse, C6191a> implements MessageLiteOrBuilder {
        public C6191a() {
            super(TrustedAuth$TrustedAuthVerifyResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        TrustedAuth$TrustedAuthVerifyResponse trustedAuth$TrustedAuthVerifyResponse = new TrustedAuth$TrustedAuthVerifyResponse();
        DEFAULT_INSTANCE = trustedAuth$TrustedAuthVerifyResponse;
        GeneratedMessageLite.registerDefaultInstance(TrustedAuth$TrustedAuthVerifyResponse.class, trustedAuth$TrustedAuthVerifyResponse);
    }

    private TrustedAuth$TrustedAuthVerifyResponse() {
    }

    private void clearClientConfig() {
        this.clientConfig_ = null;
        this.bitField0_ &= -3;
    }

    private void clearInstitutionConfig() {
        this.institutionConfig_ = null;
        this.bitField0_ &= -2;
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public static TrustedAuth$TrustedAuthVerifyResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClientConfig(TrustedAuth$ClientConfig trustedAuth$ClientConfig) {
        trustedAuth$ClientConfig.getClass();
        TrustedAuth$ClientConfig trustedAuth$ClientConfig2 = this.clientConfig_;
        if (trustedAuth$ClientConfig2 == null || trustedAuth$ClientConfig2 == TrustedAuth$ClientConfig.getDefaultInstance()) {
            this.clientConfig_ = trustedAuth$ClientConfig;
        } else {
            this.clientConfig_ = TrustedAuth$ClientConfig.newBuilder(this.clientConfig_).mergeFrom((TrustedAuth$ClientConfig.C6188a) trustedAuth$ClientConfig).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeInstitutionConfig(TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig) {
        trustedAuth$InstitutionConfig.getClass();
        TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig2 = this.institutionConfig_;
        if (trustedAuth$InstitutionConfig2 == null || trustedAuth$InstitutionConfig2 == TrustedAuth$InstitutionConfig.getDefaultInstance()) {
            this.institutionConfig_ = trustedAuth$InstitutionConfig;
        } else {
            this.institutionConfig_ = TrustedAuth$InstitutionConfig.newBuilder(this.institutionConfig_).mergeFrom((TrustedAuth$InstitutionConfig.C6189a) trustedAuth$InstitutionConfig).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6191a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseDelimitedFrom(InputStream inputStream) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(ByteBuffer byteBuffer) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TrustedAuth$TrustedAuthVerifyResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientConfig(TrustedAuth$ClientConfig trustedAuth$ClientConfig) {
        trustedAuth$ClientConfig.getClass();
        this.clientConfig_ = trustedAuth$ClientConfig;
        this.bitField0_ |= 2;
    }

    private void setInstitutionConfig(TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig) {
        trustedAuth$InstitutionConfig.getClass();
        this.institutionConfig_ = trustedAuth$InstitutionConfig;
        this.bitField0_ |= 1;
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    private void setSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6259e.f2146a[methodToInvoke.ordinal()]) {
            case 1:
                return new TrustedAuth$TrustedAuthVerifyResponse();
            case 2:
                return new C6191a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "institutionConfig_", "clientConfig_", "requestId_", "sessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TrustedAuth$TrustedAuthVerifyResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TrustedAuth$TrustedAuthVerifyResponse.class) {
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

    public TrustedAuth$ClientConfig getClientConfig() {
        TrustedAuth$ClientConfig trustedAuth$ClientConfig = this.clientConfig_;
        return trustedAuth$ClientConfig == null ? TrustedAuth$ClientConfig.getDefaultInstance() : trustedAuth$ClientConfig;
    }

    public TrustedAuth$InstitutionConfig getInstitutionConfig() {
        TrustedAuth$InstitutionConfig trustedAuth$InstitutionConfig = this.institutionConfig_;
        return trustedAuth$InstitutionConfig == null ? TrustedAuth$InstitutionConfig.getDefaultInstance() : trustedAuth$InstitutionConfig;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public boolean hasClientConfig() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInstitutionConfig() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6191a newBuilder(TrustedAuth$TrustedAuthVerifyResponse trustedAuth$TrustedAuthVerifyResponse) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$TrustedAuthVerifyResponse);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(ByteString byteString) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(byte[] bArr) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(InputStream inputStream) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(CodedInputStream codedInputStream) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TrustedAuth$TrustedAuthVerifyResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
