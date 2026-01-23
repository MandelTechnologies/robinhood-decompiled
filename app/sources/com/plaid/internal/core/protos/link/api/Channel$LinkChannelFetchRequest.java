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
public final class Channel$LinkChannelFetchRequest extends GeneratedMessageLite<Channel$LinkChannelFetchRequest, C6082a> implements MessageLiteOrBuilder {
    public static final int CHANNEL_ID_FIELD_NUMBER = 1;
    public static final int CHANNEL_SECRET_FIELD_NUMBER = 2;
    private static final Channel$LinkChannelFetchRequest DEFAULT_INSTANCE;
    private static volatile Parser<Channel$LinkChannelFetchRequest> PARSER = null;
    public static final int PREVIOUS_FETCH_ID_FIELD_NUMBER = 3;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 4;
    private String channelId_ = "";
    private String channelSecret_ = "";
    private String previousFetchId_ = "";
    private String webviewFallbackId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest$a */
    public static final class C6082a extends GeneratedMessageLite.Builder<Channel$LinkChannelFetchRequest, C6082a> implements MessageLiteOrBuilder {
        public C6082a() {
            super(Channel$LinkChannelFetchRequest.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final void m1389a(String str) {
            copyOnWrite();
            ((Channel$LinkChannelFetchRequest) this.instance).setChannelId(str);
        }

        /* renamed from: b */
        public final void m1390b(String str) {
            copyOnWrite();
            ((Channel$LinkChannelFetchRequest) this.instance).setChannelSecret(str);
        }

        /* renamed from: c */
        public final void m1391c(String str) {
            copyOnWrite();
            ((Channel$LinkChannelFetchRequest) this.instance).setPreviousFetchId(str);
        }
    }

    static {
        Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequest = new Channel$LinkChannelFetchRequest();
        DEFAULT_INSTANCE = channel$LinkChannelFetchRequest;
        GeneratedMessageLite.registerDefaultInstance(Channel$LinkChannelFetchRequest.class, channel$LinkChannelFetchRequest);
    }

    private Channel$LinkChannelFetchRequest() {
    }

    private void clearChannelId() {
        this.channelId_ = getDefaultInstance().getChannelId();
    }

    private void clearChannelSecret() {
        this.channelSecret_ = getDefaultInstance().getChannelSecret();
    }

    private void clearPreviousFetchId() {
        this.previousFetchId_ = getDefaultInstance().getPreviousFetchId();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    public static Channel$LinkChannelFetchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6082a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Channel$LinkChannelFetchRequest parseDelimitedFrom(InputStream inputStream) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(ByteBuffer byteBuffer) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Channel$LinkChannelFetchRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelId(String str) {
        str.getClass();
        this.channelId_ = str;
    }

    private void setChannelIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.channelId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelSecret(String str) {
        str.getClass();
        this.channelSecret_ = str;
    }

    private void setChannelSecretBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.channelSecret_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousFetchId(String str) {
        str.getClass();
        this.previousFetchId_ = str;
    }

    private void setPreviousFetchIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.previousFetchId_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackId(String str) {
        str.getClass();
        this.webviewFallbackId_ = str;
    }

    private void setWebviewFallbackIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6255a.f2143a[methodToInvoke.ordinal()]) {
            case 1:
                return new Channel$LinkChannelFetchRequest();
            case 2:
                return new C6082a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"channelId_", "channelSecret_", "previousFetchId_", "webviewFallbackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Channel$LinkChannelFetchRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Channel$LinkChannelFetchRequest.class) {
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

    public String getChannelId() {
        return this.channelId_;
    }

    public ByteString getChannelIdBytes() {
        return ByteString.copyFromUtf8(this.channelId_);
    }

    public String getChannelSecret() {
        return this.channelSecret_;
    }

    public ByteString getChannelSecretBytes() {
        return ByteString.copyFromUtf8(this.channelSecret_);
    }

    public String getPreviousFetchId() {
        return this.previousFetchId_;
    }

    public ByteString getPreviousFetchIdBytes() {
        return ByteString.copyFromUtf8(this.previousFetchId_);
    }

    public String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public ByteString getWebviewFallbackIdBytes() {
        return ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public static C6082a newBuilder(Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequest) {
        return DEFAULT_INSTANCE.createBuilder(channel$LinkChannelFetchRequest);
    }

    public static Channel$LinkChannelFetchRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(ByteString byteString) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(byte[] bArr) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(InputStream inputStream) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(CodedInputStream codedInputStream) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Channel$LinkChannelFetchRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
