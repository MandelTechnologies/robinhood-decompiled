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
public final class Workflow$LinkWorkflowSearchRequest extends GeneratedMessageLite<Workflow$LinkWorkflowSearchRequest, C6220a> implements MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 4;
    private static final Workflow$LinkWorkflowSearchRequest DEFAULT_INSTANCE;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 3;
    public static final int PANE_RENDERING_ID_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowSearchRequest> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private String workflowSessionId_ = "";
    private String paneRenderingId_ = "";
    private String paneNodeId_ = "";
    private String continuationToken_ = "";
    private String query_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest$a */
    public static final class C6220a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowSearchRequest, C6220a> implements MessageLiteOrBuilder {
        public C6220a() {
            super(Workflow$LinkWorkflowSearchRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        Workflow$LinkWorkflowSearchRequest workflow$LinkWorkflowSearchRequest = new Workflow$LinkWorkflowSearchRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowSearchRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowSearchRequest.class, workflow$LinkWorkflowSearchRequest);
    }

    private Workflow$LinkWorkflowSearchRequest() {
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    private void clearPaneRenderingId() {
        this.paneRenderingId_ = getDefaultInstance().getPaneRenderingId();
    }

    private void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static Workflow$LinkWorkflowSearchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6220a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowSearchRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowSearchRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setContinuationToken(String str) {
        str.getClass();
        this.continuationToken_ = str;
    }

    private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setPaneNodeId(String str) {
        str.getClass();
        this.paneNodeId_ = str;
    }

    private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    private void setPaneRenderingId(String str) {
        str.getClass();
        this.paneRenderingId_ = str;
    }

    private void setPaneRenderingIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.paneRenderingId_ = byteString.toStringUtf8();
    }

    private void setQuery(String str) {
        str.getClass();
        this.query_ = str;
    }

    private void setQueryBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.query_ = byteString.toStringUtf8();
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
                return new Workflow$LinkWorkflowSearchRequest();
            case 2:
                return new C6220a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"workflowSessionId_", "paneRenderingId_", "paneNodeId_", "continuationToken_", "query_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowSearchRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowSearchRequest.class) {
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

    public String getContinuationToken() {
        return this.continuationToken_;
    }

    public ByteString getContinuationTokenBytes() {
        return ByteString.copyFromUtf8(this.continuationToken_);
    }

    public String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public ByteString getPaneNodeIdBytes() {
        return ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public String getPaneRenderingId() {
        return this.paneRenderingId_;
    }

    public ByteString getPaneRenderingIdBytes() {
        return ByteString.copyFromUtf8(this.paneRenderingId_);
    }

    public String getQuery() {
        return this.query_;
    }

    public ByteString getQueryBytes() {
        return ByteString.copyFromUtf8(this.query_);
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public static C6220a newBuilder(Workflow$LinkWorkflowSearchRequest workflow$LinkWorkflowSearchRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowSearchRequest);
    }

    public static Workflow$LinkWorkflowSearchRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowSearchRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowSearchRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
