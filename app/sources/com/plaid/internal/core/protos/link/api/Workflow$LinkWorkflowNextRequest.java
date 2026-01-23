package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC6928o0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowNextRequest extends GeneratedMessageLite<Workflow$LinkWorkflowNextRequest, C6199a> implements MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 3;
    private static final Workflow$LinkWorkflowNextRequest DEFAULT_INSTANCE;
    public static final int PANE_META_OUTPUTS_FIELD_NUMBER = 4;
    public static final int PANE_OUTPUTS_FIELD_NUMBER = 2;
    private static volatile Parser<Workflow$LinkWorkflowNextRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private String workflowSessionId_ = "";
    private String continuationToken_ = "";
    private Internal.ProtobufList<Pane$PaneOutput> paneOutputs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<PaneMetaOutput> paneMetaOutputs_ = GeneratedMessageLite.emptyProtobufList();

    public static final class PaneMetaOutput extends GeneratedMessageLite<PaneMetaOutput, C6198a> implements InterfaceC6200b {
        private static final PaneMetaOutput DEFAULT_INSTANCE;
        public static final int PANE_NODE_ID_FIELD_NUMBER = 1;
        private static volatile Parser<PaneMetaOutput> PARSER = null;
        public static final int RECAPTCHA_ENTERPRISE_TOKEN_FIELD_NUMBER = 2;
        public static final int TD_REQUEST_ID_FIELD_NUMBER = 4;
        public static final int TD_RESULT_FIELD_NUMBER = 5;
        private String paneNodeId_ = "";
        private String recaptchaEnterpriseToken_ = "";
        private String tdRequestId_ = "";
        private String tdResult_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest$PaneMetaOutput$a */
        public static final class C6198a extends GeneratedMessageLite.Builder<PaneMetaOutput, C6198a> implements InterfaceC6200b {
            public C6198a() {
                super(PaneMetaOutput.DEFAULT_INSTANCE);
            }
        }

        static {
            PaneMetaOutput paneMetaOutput = new PaneMetaOutput();
            DEFAULT_INSTANCE = paneMetaOutput;
            GeneratedMessageLite.registerDefaultInstance(PaneMetaOutput.class, paneMetaOutput);
        }

        private PaneMetaOutput() {
        }

        private void clearPaneNodeId() {
            this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
        }

        private void clearRecaptchaEnterpriseToken() {
            this.recaptchaEnterpriseToken_ = getDefaultInstance().getRecaptchaEnterpriseToken();
        }

        private void clearTdRequestId() {
            this.tdRequestId_ = getDefaultInstance().getTdRequestId();
        }

        private void clearTdResult() {
            this.tdResult_ = getDefaultInstance().getTdResult();
        }

        public static PaneMetaOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6198a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PaneMetaOutput parseDelimitedFrom(InputStream inputStream) {
            return (PaneMetaOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneMetaOutput parseFrom(ByteBuffer byteBuffer) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PaneMetaOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneNodeId(String str) {
            str.getClass();
            this.paneNodeId_ = str;
        }

        private void setPaneNodeIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.paneNodeId_ = byteString.toStringUtf8();
        }

        private void setRecaptchaEnterpriseToken(String str) {
            str.getClass();
            this.recaptchaEnterpriseToken_ = str;
        }

        private void setRecaptchaEnterpriseTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.recaptchaEnterpriseToken_ = byteString.toStringUtf8();
        }

        private void setTdRequestId(String str) {
            str.getClass();
            this.tdRequestId_ = str;
        }

        private void setTdRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.tdRequestId_ = byteString.toStringUtf8();
        }

        private void setTdResult(String str) {
            str.getClass();
            this.tdResult_ = str;
        }

        private void setTdResultBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.tdResult_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PaneMetaOutput();
                case 2:
                    return new C6198a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"paneNodeId_", "recaptchaEnterpriseToken_", "tdRequestId_", "tdResult_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PaneMetaOutput> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PaneMetaOutput.class) {
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

        public String getPaneNodeId() {
            return this.paneNodeId_;
        }

        public ByteString getPaneNodeIdBytes() {
            return ByteString.copyFromUtf8(this.paneNodeId_);
        }

        public String getRecaptchaEnterpriseToken() {
            return this.recaptchaEnterpriseToken_;
        }

        public ByteString getRecaptchaEnterpriseTokenBytes() {
            return ByteString.copyFromUtf8(this.recaptchaEnterpriseToken_);
        }

        public String getTdRequestId() {
            return this.tdRequestId_;
        }

        public ByteString getTdRequestIdBytes() {
            return ByteString.copyFromUtf8(this.tdRequestId_);
        }

        public String getTdResult() {
            return this.tdResult_;
        }

        public ByteString getTdResultBytes() {
            return ByteString.copyFromUtf8(this.tdResult_);
        }

        public static C6198a newBuilder(PaneMetaOutput paneMetaOutput) {
            return DEFAULT_INSTANCE.createBuilder(paneMetaOutput);
        }

        public static PaneMetaOutput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneMetaOutput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneMetaOutput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PaneMetaOutput parseFrom(ByteString byteString) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PaneMetaOutput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PaneMetaOutput parseFrom(byte[] bArr) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PaneMetaOutput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PaneMetaOutput parseFrom(InputStream inputStream) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneMetaOutput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneMetaOutput parseFrom(CodedInputStream codedInputStream) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PaneMetaOutput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneMetaOutput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest$b */
    public interface InterfaceC6200b extends MessageLiteOrBuilder {
    }

    static {
        Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest = new Workflow$LinkWorkflowNextRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowNextRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowNextRequest.class, workflow$LinkWorkflowNextRequest);
    }

    private Workflow$LinkWorkflowNextRequest() {
    }

    private void addAllPaneMetaOutputs(Iterable<? extends PaneMetaOutput> iterable) {
        ensurePaneMetaOutputsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.paneMetaOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaneOutputs(Iterable<? extends Pane$PaneOutput> iterable) {
        ensurePaneOutputsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.paneOutputs_);
    }

    private void addPaneMetaOutputs(PaneMetaOutput paneMetaOutput) {
        paneMetaOutput.getClass();
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.add(paneMetaOutput);
    }

    private void addPaneOutputs(Pane$PaneOutput pane$PaneOutput) {
        pane$PaneOutput.getClass();
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.add(pane$PaneOutput);
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearPaneMetaOutputs() {
        this.paneMetaOutputs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPaneOutputs() {
        this.paneOutputs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensurePaneMetaOutputsIsMutable() {
        Internal.ProtobufList<PaneMetaOutput> protobufList = this.paneMetaOutputs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paneMetaOutputs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePaneOutputsIsMutable() {
        Internal.ProtobufList<Pane$PaneOutput> protobufList = this.paneOutputs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paneOutputs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowNextRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6199a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowNextRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowNextRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePaneMetaOutputs(int i) {
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.remove(i);
    }

    private void removePaneOutputs(int i) {
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuationToken(String str) {
        str.getClass();
        this.continuationToken_ = str;
    }

    private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setPaneMetaOutputs(int i, PaneMetaOutput paneMetaOutput) {
        paneMetaOutput.getClass();
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.set(i, paneMetaOutput);
    }

    private void setPaneOutputs(int i, Pane$PaneOutput pane$PaneOutput) {
        pane$PaneOutput.getClass();
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.set(i, pane$PaneOutput);
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
                return new Workflow$LinkWorkflowNextRequest();
            case 2:
                return new C6199a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004\u001b", new Object[]{"workflowSessionId_", "paneOutputs_", Pane$PaneOutput.class, "continuationToken_", "paneMetaOutputs_", PaneMetaOutput.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowNextRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowNextRequest.class) {
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

    public PaneMetaOutput getPaneMetaOutputs(int i) {
        return this.paneMetaOutputs_.get(i);
    }

    public int getPaneMetaOutputsCount() {
        return this.paneMetaOutputs_.size();
    }

    public List<PaneMetaOutput> getPaneMetaOutputsList() {
        return this.paneMetaOutputs_;
    }

    public InterfaceC6200b getPaneMetaOutputsOrBuilder(int i) {
        return this.paneMetaOutputs_.get(i);
    }

    public List<? extends InterfaceC6200b> getPaneMetaOutputsOrBuilderList() {
        return this.paneMetaOutputs_;
    }

    public Pane$PaneOutput getPaneOutputs(int i) {
        return this.paneOutputs_.get(i);
    }

    public int getPaneOutputsCount() {
        return this.paneOutputs_.size();
    }

    public List<Pane$PaneOutput> getPaneOutputsList() {
        return this.paneOutputs_;
    }

    public InterfaceC6928o0 getPaneOutputsOrBuilder(int i) {
        return this.paneOutputs_.get(i);
    }

    public List<? extends InterfaceC6928o0> getPaneOutputsOrBuilderList() {
        return this.paneOutputs_;
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest$a */
    public static final class C6199a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowNextRequest, C6199a> implements MessageLiteOrBuilder {
        public C6199a() {
            super(Workflow$LinkWorkflowNextRequest.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final void m1415a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowNextRequest) this.instance).setContinuationToken(str);
        }

        /* renamed from: b */
        public final void m1417b(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowNextRequest) this.instance).setWorkflowSessionId(str);
        }

        /* renamed from: a */
        public final void m1416a(List list) {
            copyOnWrite();
            ((Workflow$LinkWorkflowNextRequest) this.instance).addAllPaneOutputs(list);
        }
    }

    public static C6199a newBuilder(Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowNextRequest);
    }

    public static Workflow$LinkWorkflowNextRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addPaneMetaOutputs(int i, PaneMetaOutput paneMetaOutput) {
        paneMetaOutput.getClass();
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.add(i, paneMetaOutput);
    }

    private void addPaneOutputs(int i, Pane$PaneOutput pane$PaneOutput) {
        pane$PaneOutput.getClass();
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.add(i, pane$PaneOutput);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowNextRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowNextRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
