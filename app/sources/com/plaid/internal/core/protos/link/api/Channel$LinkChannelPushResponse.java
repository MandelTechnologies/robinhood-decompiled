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
public final class Channel$LinkChannelPushResponse extends GeneratedMessageLite<Channel$LinkChannelPushResponse, C6085a> implements MessageLiteOrBuilder {
    private static final Channel$LinkChannelPushResponse DEFAULT_INSTANCE;
    private static volatile Parser<Channel$LinkChannelPushResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String requestId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.Channel$LinkChannelPushResponse$a */
    public static final class C6085a extends GeneratedMessageLite.Builder<Channel$LinkChannelPushResponse, C6085a> implements MessageLiteOrBuilder {
        public C6085a() {
            super(Channel$LinkChannelPushResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Channel$LinkChannelPushResponse channel$LinkChannelPushResponse = new Channel$LinkChannelPushResponse();
        DEFAULT_INSTANCE = channel$LinkChannelPushResponse;
        GeneratedMessageLite.registerDefaultInstance(Channel$LinkChannelPushResponse.class, channel$LinkChannelPushResponse);
    }

    private Channel$LinkChannelPushResponse() {
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    public static Channel$LinkChannelPushResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6085a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Channel$LinkChannelPushResponse parseDelimitedFrom(InputStream inputStream) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelPushResponse parseFrom(ByteBuffer byteBuffer) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Channel$LinkChannelPushResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6255a.f2143a[methodToInvoke.ordinal()]) {
            case 1:
                return new Channel$LinkChannelPushResponse();
            case 2:
                return new C6085a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"requestId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Channel$LinkChannelPushResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Channel$LinkChannelPushResponse.class) {
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

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public static C6085a newBuilder(Channel$LinkChannelPushResponse channel$LinkChannelPushResponse) {
        return DEFAULT_INSTANCE.createBuilder(channel$LinkChannelPushResponse);
    }

    public static Channel$LinkChannelPushResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushResponse parseFrom(ByteString byteString) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Channel$LinkChannelPushResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushResponse parseFrom(byte[] bArr) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Channel$LinkChannelPushResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushResponse parseFrom(InputStream inputStream) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelPushResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushResponse parseFrom(CodedInputStream codedInputStream) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Channel$LinkChannelPushResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
