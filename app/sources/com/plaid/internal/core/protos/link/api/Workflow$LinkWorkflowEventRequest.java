package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowEventRequest extends GeneratedMessageLite<Workflow$LinkWorkflowEventRequest, C6196a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowEventRequest DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 3;
    private static volatile Parser<Workflow$LinkWorkflowEventRequest> PARSER = null;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 27;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 2;
    private String workflowSessionId_ = "";
    private String webviewFallbackId_ = "";
    private Internal.ProtobufList<ClientEventOuterClass$ClientEvent> events_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest = new Workflow$LinkWorkflowEventRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEventRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowEventRequest.class, workflow$LinkWorkflowEventRequest);
    }

    private Workflow$LinkWorkflowEventRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends ClientEventOuterClass$ClientEvent> iterable) {
        ensureEventsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
        clientEventOuterClass$ClientEvent.getClass();
        ensureEventsIsMutable();
        this.events_.add(clientEventOuterClass$ClientEvent);
    }

    private void clearEvents() {
        this.events_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureEventsIsMutable() {
        Internal.ProtobufList<ClientEventOuterClass$ClientEvent> protobufList = this.events_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowEventRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6196a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowEventRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowEventRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeEvents(int i) {
        ensureEventsIsMutable();
        this.events_.remove(i);
    }

    private void setEvents(int i, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
        clientEventOuterClass$ClientEvent.getClass();
        ensureEventsIsMutable();
        this.events_.set(i, clientEventOuterClass$ClientEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallbackId(String str) {
        str.getClass();
        this.webviewFallbackId_ = str;
    }

    private void setWebviewFallbackIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionId(String str) {
        str.getClass();
        this.workflowSessionId_ = str;
    }

    private void setWorkflowSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowEventRequest();
            case 2:
                return new C6196a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u001b\u0003\u0000\u0001\u0000\u0002Ȉ\u0003\u001b\u001bȈ", new Object[]{"workflowSessionId_", "events_", ClientEventOuterClass$ClientEvent.class, "webviewFallbackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowEventRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowEventRequest.class) {
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

    public ClientEventOuterClass$ClientEvent getEvents(int i) {
        return this.events_.get(i);
    }

    public int getEventsCount() {
        return this.events_.size();
    }

    public List<ClientEventOuterClass$ClientEvent> getEventsList() {
        return this.events_;
    }

    public InterfaceC6257c getEventsOrBuilder(int i) {
        return this.events_.get(i);
    }

    public List<? extends InterfaceC6257c> getEventsOrBuilderList() {
        return this.events_;
    }

    public String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public ByteString getWebviewFallbackIdBytes() {
        return ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest$a */
    public static final class C6196a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowEventRequest, C6196a> implements MessageLiteOrBuilder {
        public C6196a() {
            super(Workflow$LinkWorkflowEventRequest.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final void m1413a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowEventRequest) this.instance).setWebviewFallbackId(str);
        }

        /* renamed from: b */
        public final void m1414b(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowEventRequest) this.instance).setWorkflowSessionId(str);
        }

        /* renamed from: a */
        public final C6196a m1411a(ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
            copyOnWrite();
            ((Workflow$LinkWorkflowEventRequest) this.instance).addEvents(clientEventOuterClass$ClientEvent);
            return this;
        }

        /* renamed from: a */
        public final void m1412a(Iterable iterable) {
            copyOnWrite();
            ((Workflow$LinkWorkflowEventRequest) this.instance).addAllEvents(iterable);
        }
    }

    public static C6196a newBuilder(Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEventRequest);
    }

    public static Workflow$LinkWorkflowEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addEvents(int i, ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
        clientEventOuterClass$ClientEvent.getClass();
        ensureEventsIsMutable();
        this.events_.add(i, clientEventOuterClass$ClientEvent);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
