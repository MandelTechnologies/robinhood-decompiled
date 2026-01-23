package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.sdkevents.InterfaceC6275b;
import com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC6930p0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowNextResponse extends GeneratedMessageLite<Workflow$LinkWorkflowNextResponse, C6201a> implements MessageLiteOrBuilder {
    public static final int ADDITIONAL_PANES_FIELD_NUMBER = 3;
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 5;
    private static final Workflow$LinkWorkflowNextResponse DEFAULT_INSTANCE;
    public static final int NEXT_PANE_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowNextResponse> PARSER = null;
    public static final int QUEUED_SDK_EVENTS_FIELD_NUMBER = 6;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Pane$PaneRendering nextPane_;
    private String workflowSessionId_ = "";
    private String continuationToken_ = "";
    private Internal.ProtobufList<Pane$PaneRendering> additionalPanes_ = GeneratedMessageLite.emptyProtobufList();
    private String requestId_ = "";
    private Internal.ProtobufList<SdkEvent$SDKEvent> queuedSdkEvents_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse$a */
    public static final class C6201a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowNextResponse, C6201a> implements MessageLiteOrBuilder {
        public C6201a() {
            super(Workflow$LinkWorkflowNextResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = new Workflow$LinkWorkflowNextResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowNextResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowNextResponse.class, workflow$LinkWorkflowNextResponse);
    }

    private Workflow$LinkWorkflowNextResponse() {
    }

    private void addAdditionalPanes(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(pane$PaneRendering);
    }

    private void addAllAdditionalPanes(Iterable<? extends Pane$PaneRendering> iterable) {
        ensureAdditionalPanesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.additionalPanes_);
    }

    private void addAllQueuedSdkEvents(Iterable<? extends SdkEvent$SDKEvent> iterable) {
        ensureQueuedSdkEventsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.queuedSdkEvents_);
    }

    private void addQueuedSdkEvents(SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        sdkEvent$SDKEvent.getClass();
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.add(sdkEvent$SDKEvent);
    }

    private void clearAdditionalPanes() {
        this.additionalPanes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearNextPane() {
        this.nextPane_ = null;
        this.bitField0_ &= -2;
    }

    private void clearQueuedSdkEvents() {
        this.queuedSdkEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureAdditionalPanesIsMutable() {
        Internal.ProtobufList<Pane$PaneRendering> protobufList = this.additionalPanes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.additionalPanes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureQueuedSdkEventsIsMutable() {
        Internal.ProtobufList<SdkEvent$SDKEvent> protobufList = this.queuedSdkEvents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.queuedSdkEvents_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowNextResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeNextPane(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        Pane$PaneRendering pane$PaneRendering2 = this.nextPane_;
        if (pane$PaneRendering2 == null || pane$PaneRendering2 == Pane$PaneRendering.getDefaultInstance()) {
            this.nextPane_ = pane$PaneRendering;
        } else {
            this.nextPane_ = Pane$PaneRendering.newBuilder(this.nextPane_).mergeFrom((Pane$PaneRendering.C6733a) pane$PaneRendering).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6201a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowNextResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowNextResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdditionalPanes(int i) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.remove(i);
    }

    private void removeQueuedSdkEvents(int i) {
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.remove(i);
    }

    private void setAdditionalPanes(int i, Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.set(i, pane$PaneRendering);
    }

    private void setContinuationToken(String str) {
        str.getClass();
        this.continuationToken_ = str;
    }

    private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setNextPane(Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        this.nextPane_ = pane$PaneRendering;
        this.bitField0_ |= 1;
    }

    private void setQueuedSdkEvents(int i, SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        sdkEvent$SDKEvent.getClass();
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.set(i, sdkEvent$SDKEvent);
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setWorkflowSessionId(String str) {
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
                return new Workflow$LinkWorkflowNextResponse();
            case 2:
                return new C6201a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"bitField0_", "workflowSessionId_", "nextPane_", "additionalPanes_", Pane$PaneRendering.class, "requestId_", "continuationToken_", "queuedSdkEvents_", SdkEvent$SDKEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowNextResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowNextResponse.class) {
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

    public Pane$PaneRendering getAdditionalPanes(int i) {
        return this.additionalPanes_.get(i);
    }

    public int getAdditionalPanesCount() {
        return this.additionalPanes_.size();
    }

    public List<Pane$PaneRendering> getAdditionalPanesList() {
        return this.additionalPanes_;
    }

    public InterfaceC6930p0 getAdditionalPanesOrBuilder(int i) {
        return this.additionalPanes_.get(i);
    }

    public List<? extends InterfaceC6930p0> getAdditionalPanesOrBuilderList() {
        return this.additionalPanes_;
    }

    public String getContinuationToken() {
        return this.continuationToken_;
    }

    public ByteString getContinuationTokenBytes() {
        return ByteString.copyFromUtf8(this.continuationToken_);
    }

    public Pane$PaneRendering getNextPane() {
        Pane$PaneRendering pane$PaneRendering = this.nextPane_;
        return pane$PaneRendering == null ? Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
    }

    public SdkEvent$SDKEvent getQueuedSdkEvents(int i) {
        return this.queuedSdkEvents_.get(i);
    }

    public int getQueuedSdkEventsCount() {
        return this.queuedSdkEvents_.size();
    }

    public List<SdkEvent$SDKEvent> getQueuedSdkEventsList() {
        return this.queuedSdkEvents_;
    }

    public InterfaceC6275b getQueuedSdkEventsOrBuilder(int i) {
        return this.queuedSdkEvents_.get(i);
    }

    public List<? extends InterfaceC6275b> getQueuedSdkEventsOrBuilderList() {
        return this.queuedSdkEvents_;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasNextPane() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6201a newBuilder(Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowNextResponse);
    }

    public static Workflow$LinkWorkflowNextResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addAdditionalPanes(int i, Pane$PaneRendering pane$PaneRendering) {
        pane$PaneRendering.getClass();
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(i, pane$PaneRendering);
    }

    private void addQueuedSdkEvents(int i, SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        sdkEvent$SDKEvent.getClass();
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.add(i, sdkEvent$SDKEvent);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowNextResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
