package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC6293A;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowSearchResponse extends GeneratedMessageLite<Workflow$LinkWorkflowSearchResponse, C6221a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowSearchResponse DEFAULT_INSTANCE;
    public static final int LIST_ITEMS_FIELD_NUMBER = 3;
    private static volatile Parser<Workflow$LinkWorkflowSearchResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private String workflowSessionId_ = "";
    private String requestId_ = "";
    private Internal.ProtobufList<Common$ListItem> listItems_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchResponse$a */
    public static final class C6221a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowSearchResponse, C6221a> implements MessageLiteOrBuilder {
        public C6221a() {
            super(Workflow$LinkWorkflowSearchResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowSearchResponse workflow$LinkWorkflowSearchResponse = new Workflow$LinkWorkflowSearchResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowSearchResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowSearchResponse.class, workflow$LinkWorkflowSearchResponse);
    }

    private Workflow$LinkWorkflowSearchResponse() {
    }

    private void addAllListItems(Iterable<? extends Common$ListItem> iterable) {
        ensureListItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.listItems_);
    }

    private void addListItems(Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureListItemsIsMutable();
        this.listItems_.add(common$ListItem);
    }

    private void clearListItems() {
        this.listItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureListItemsIsMutable() {
        Internal.ProtobufList<Common$ListItem> protobufList = this.listItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.listItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowSearchResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6221a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowSearchResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowSearchResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeListItems(int i) {
        ensureListItemsIsMutable();
        this.listItems_.remove(i);
    }

    private void setListItems(int i, Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureListItemsIsMutable();
        this.listItems_.set(i, common$ListItem);
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
                return new Workflow$LinkWorkflowSearchResponse();
            case 2:
                return new C6221a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"workflowSessionId_", "requestId_", "listItems_", Common$ListItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowSearchResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowSearchResponse.class) {
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

    public Common$ListItem getListItems(int i) {
        return this.listItems_.get(i);
    }

    public int getListItemsCount() {
        return this.listItems_.size();
    }

    public List<Common$ListItem> getListItemsList() {
        return this.listItems_;
    }

    public InterfaceC6293A getListItemsOrBuilder(int i) {
        return this.listItems_.get(i);
    }

    public List<? extends InterfaceC6293A> getListItemsOrBuilderList() {
        return this.listItems_;
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

    public static C6221a newBuilder(Workflow$LinkWorkflowSearchResponse workflow$LinkWorkflowSearchResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowSearchResponse);
    }

    public static Workflow$LinkWorkflowSearchResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addListItems(int i, Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureListItemsIsMutable();
        this.listItems_.add(i, common$ListItem);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowSearchResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
