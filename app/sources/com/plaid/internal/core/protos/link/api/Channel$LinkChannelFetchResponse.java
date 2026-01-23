package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.channel.InterfaceC6269b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Channel$LinkChannelFetchResponse extends GeneratedMessageLite<Channel$LinkChannelFetchResponse, C6083a> implements MessageLiteOrBuilder {
    private static final Channel$LinkChannelFetchResponse DEFAULT_INSTANCE;
    public static final int FETCH_ID_FIELD_NUMBER = 3;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    private static volatile Parser<Channel$LinkChannelFetchResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String requestId_ = "";
    private Internal.ProtobufList<Channel$Message> messages_ = GeneratedMessageLite.emptyProtobufList();
    private String fetchId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse$a */
    public static final class C6083a extends GeneratedMessageLite.Builder<Channel$LinkChannelFetchResponse, C6083a> implements MessageLiteOrBuilder {
        public C6083a() {
            super(Channel$LinkChannelFetchResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse = new Channel$LinkChannelFetchResponse();
        DEFAULT_INSTANCE = channel$LinkChannelFetchResponse;
        GeneratedMessageLite.registerDefaultInstance(Channel$LinkChannelFetchResponse.class, channel$LinkChannelFetchResponse);
    }

    private Channel$LinkChannelFetchResponse() {
    }

    private void addAllMessages(Iterable<? extends Channel$Message> iterable) {
        ensureMessagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.messages_);
    }

    private void addMessages(Channel$Message channel$Message) {
        channel$Message.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(channel$Message);
    }

    private void clearFetchId() {
        this.fetchId_ = getDefaultInstance().getFetchId();
    }

    private void clearMessages() {
        this.messages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void ensureMessagesIsMutable() {
        Internal.ProtobufList<Channel$Message> protobufList = this.messages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.messages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Channel$LinkChannelFetchResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6083a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Channel$LinkChannelFetchResponse parseDelimitedFrom(InputStream inputStream) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(ByteBuffer byteBuffer) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Channel$LinkChannelFetchResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMessages(int i) {
        ensureMessagesIsMutable();
        this.messages_.remove(i);
    }

    private void setFetchId(String str) {
        str.getClass();
        this.fetchId_ = str;
    }

    private void setFetchIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fetchId_ = byteString.toStringUtf8();
    }

    private void setMessages(int i, Channel$Message channel$Message) {
        channel$Message.getClass();
        ensureMessagesIsMutable();
        this.messages_.set(i, channel$Message);
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
                return new Channel$LinkChannelFetchResponse();
            case 2:
                return new C6083a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"requestId_", "messages_", Channel$Message.class, "fetchId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Channel$LinkChannelFetchResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Channel$LinkChannelFetchResponse.class) {
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

    public String getFetchId() {
        return this.fetchId_;
    }

    public ByteString getFetchIdBytes() {
        return ByteString.copyFromUtf8(this.fetchId_);
    }

    public Channel$Message getMessages(int i) {
        return this.messages_.get(i);
    }

    public int getMessagesCount() {
        return this.messages_.size();
    }

    public List<Channel$Message> getMessagesList() {
        return this.messages_;
    }

    public InterfaceC6269b getMessagesOrBuilder(int i) {
        return this.messages_.get(i);
    }

    public List<? extends InterfaceC6269b> getMessagesOrBuilderList() {
        return this.messages_;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public static C6083a newBuilder(Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse) {
        return DEFAULT_INSTANCE.createBuilder(channel$LinkChannelFetchResponse);
    }

    public static Channel$LinkChannelFetchResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(ByteString byteString) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addMessages(int i, Channel$Message channel$Message) {
        channel$Message.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(i, channel$Message);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(byte[] bArr) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(InputStream inputStream) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(CodedInputStream codedInputStream) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Channel$LinkChannelFetchResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelFetchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
