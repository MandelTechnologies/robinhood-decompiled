package com.plaid.internal.core.protos.link.api;

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
public final class SilentNetworkAuth$LinkSNAProveStartResponse extends GeneratedMessageLite<SilentNetworkAuth$LinkSNAProveStartResponse, C6185a> implements MessageLiteOrBuilder {
    private static final SilentNetworkAuth$LinkSNAProveStartResponse DEFAULT_INSTANCE;
    private static volatile Parser<SilentNetworkAuth$LinkSNAProveStartResponse> PARSER = null;
    public static final int REDIRECT_TARGET_URL_FIELD_NUMBER = 1;
    private String redirectTargetUrl_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse$a */
    public static final class C6185a extends GeneratedMessageLite.Builder<SilentNetworkAuth$LinkSNAProveStartResponse, C6185a> implements MessageLiteOrBuilder {
        public C6185a() {
            super(SilentNetworkAuth$LinkSNAProveStartResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        SilentNetworkAuth$LinkSNAProveStartResponse silentNetworkAuth$LinkSNAProveStartResponse = new SilentNetworkAuth$LinkSNAProveStartResponse();
        DEFAULT_INSTANCE = silentNetworkAuth$LinkSNAProveStartResponse;
        GeneratedMessageLite.registerDefaultInstance(SilentNetworkAuth$LinkSNAProveStartResponse.class, silentNetworkAuth$LinkSNAProveStartResponse);
    }

    private SilentNetworkAuth$LinkSNAProveStartResponse() {
    }

    private void clearRedirectTargetUrl() {
        this.redirectTargetUrl_ = getDefaultInstance().getRedirectTargetUrl();
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6185a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseDelimitedFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(ByteBuffer byteBuffer) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SilentNetworkAuth$LinkSNAProveStartResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRedirectTargetUrl(String str) {
        str.getClass();
        this.redirectTargetUrl_ = str;
    }

    private void setRedirectTargetUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.redirectTargetUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6258d.f2145a[methodToInvoke.ordinal()]) {
            case 1:
                return new SilentNetworkAuth$LinkSNAProveStartResponse();
            case 2:
                return new C6185a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"redirectTargetUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SilentNetworkAuth$LinkSNAProveStartResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SilentNetworkAuth$LinkSNAProveStartResponse.class) {
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

    public String getRedirectTargetUrl() {
        return this.redirectTargetUrl_;
    }

    public ByteString getRedirectTargetUrlBytes() {
        return ByteString.copyFromUtf8(this.redirectTargetUrl_);
    }

    public static C6185a newBuilder(SilentNetworkAuth$LinkSNAProveStartResponse silentNetworkAuth$LinkSNAProveStartResponse) {
        return DEFAULT_INSTANCE.createBuilder(silentNetworkAuth$LinkSNAProveStartResponse);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(ByteString byteString) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(byte[] bArr) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(InputStream inputStream) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(CodedInputStream codedInputStream) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SilentNetworkAuth$LinkSNAProveStartResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SilentNetworkAuth$LinkSNAProveStartResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
