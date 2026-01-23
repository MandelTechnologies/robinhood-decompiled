package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowPreviewResponse extends GeneratedMessageLite<Workflow$LinkWorkflowPreviewResponse, C6218a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowPreviewResponse DEFAULT_INSTANCE;
    private static volatile Parser<Workflow$LinkWorkflowPreviewResponse> PARSER = null;
    public static final int RENDERED_PRESETS_FIELD_NUMBER = 1;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private Internal.ProtobufList<RenderedPreset> renderedPresets_ = GeneratedMessageLite.emptyProtobufList();
    private String requestId_ = "";

    public static final class RenderedPreset extends GeneratedMessageLite<RenderedPreset, C6217a> implements InterfaceC6219b {
        private static final RenderedPreset DEFAULT_INSTANCE;
        public static final int PANE_FIELD_NUMBER = 2;
        private static volatile Parser<RenderedPreset> PARSER = null;
        public static final int PRESET_FIELD_NUMBER = 1;
        public static final int RENDERING_OPTIONS_FIELD_NUMBER = 3;
        private int bitField0_;
        private Pane$PaneRendering pane_;
        private int preset_;
        private PreviewOuterClass$Preview.RenderingOptions renderingOptions_;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse$RenderedPreset$a */
        public static final class C6217a extends GeneratedMessageLite.Builder<RenderedPreset, C6217a> implements InterfaceC6219b {
            public C6217a() {
                super(RenderedPreset.DEFAULT_INSTANCE);
            }
        }

        static {
            RenderedPreset renderedPreset = new RenderedPreset();
            DEFAULT_INSTANCE = renderedPreset;
            GeneratedMessageLite.registerDefaultInstance(RenderedPreset.class, renderedPreset);
        }

        private RenderedPreset() {
        }

        private void clearPane() {
            this.pane_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPreset() {
            this.preset_ = 0;
        }

        private void clearRenderingOptions() {
            this.renderingOptions_ = null;
            this.bitField0_ &= -3;
        }

        public static RenderedPreset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergePane(Pane$PaneRendering pane$PaneRendering) {
            pane$PaneRendering.getClass();
            Pane$PaneRendering pane$PaneRendering2 = this.pane_;
            if (pane$PaneRendering2 == null || pane$PaneRendering2 == Pane$PaneRendering.getDefaultInstance()) {
                this.pane_ = pane$PaneRendering;
            } else {
                this.pane_ = Pane$PaneRendering.newBuilder(this.pane_).mergeFrom((Pane$PaneRendering.C6733a) pane$PaneRendering).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
            renderingOptions.getClass();
            PreviewOuterClass$Preview.RenderingOptions renderingOptions2 = this.renderingOptions_;
            if (renderingOptions2 == null || renderingOptions2 == PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance()) {
                this.renderingOptions_ = renderingOptions;
            } else {
                this.renderingOptions_ = PreviewOuterClass$Preview.RenderingOptions.newBuilder(this.renderingOptions_).mergeFrom((PreviewOuterClass$Preview.RenderingOptions.C6996a) renderingOptions).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static C6217a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RenderedPreset parseDelimitedFrom(InputStream inputStream) {
            return (RenderedPreset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderedPreset parseFrom(ByteBuffer byteBuffer) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RenderedPreset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPane(Pane$PaneRendering pane$PaneRendering) {
            pane$PaneRendering.getClass();
            this.pane_ = pane$PaneRendering;
            this.bitField0_ |= 1;
        }

        private void setPreset(PreviewOuterClass$Preview.EnumC6998b enumC6998b) {
            this.preset_ = enumC6998b.getNumber();
        }

        private void setPresetValue(int i) {
            this.preset_ = i;
        }

        private void setRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
            renderingOptions.getClass();
            this.renderingOptions_ = renderingOptions;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RenderedPreset();
                case 2:
                    return new C6217a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "preset_", "pane_", "renderingOptions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RenderedPreset> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RenderedPreset.class) {
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

        public Pane$PaneRendering getPane() {
            Pane$PaneRendering pane$PaneRendering = this.pane_;
            return pane$PaneRendering == null ? Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
        }

        public PreviewOuterClass$Preview.EnumC6998b getPreset() {
            PreviewOuterClass$Preview.EnumC6998b enumC6998bForNumber = PreviewOuterClass$Preview.EnumC6998b.forNumber(this.preset_);
            return enumC6998bForNumber == null ? PreviewOuterClass$Preview.EnumC6998b.UNRECOGNIZED : enumC6998bForNumber;
        }

        public int getPresetValue() {
            return this.preset_;
        }

        public PreviewOuterClass$Preview.RenderingOptions getRenderingOptions() {
            PreviewOuterClass$Preview.RenderingOptions renderingOptions = this.renderingOptions_;
            return renderingOptions == null ? PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance() : renderingOptions;
        }

        public boolean hasPane() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasRenderingOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C6217a newBuilder(RenderedPreset renderedPreset) {
            return DEFAULT_INSTANCE.createBuilder(renderedPreset);
        }

        public static RenderedPreset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(ByteString byteString) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RenderedPreset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(byte[] bArr) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RenderedPreset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(InputStream inputStream) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderedPreset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderedPreset parseFrom(CodedInputStream codedInputStream) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RenderedPreset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderedPreset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse$a */
    public static final class C6218a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowPreviewResponse, C6218a> implements MessageLiteOrBuilder {
        public C6218a() {
            super(Workflow$LinkWorkflowPreviewResponse.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPreviewResponse$b */
    public interface InterfaceC6219b extends MessageLiteOrBuilder {
    }

    static {
        Workflow$LinkWorkflowPreviewResponse workflow$LinkWorkflowPreviewResponse = new Workflow$LinkWorkflowPreviewResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPreviewResponse;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowPreviewResponse.class, workflow$LinkWorkflowPreviewResponse);
    }

    private Workflow$LinkWorkflowPreviewResponse() {
    }

    private void addAllRenderedPresets(Iterable<? extends RenderedPreset> iterable) {
        ensureRenderedPresetsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.renderedPresets_);
    }

    private void addRenderedPresets(RenderedPreset renderedPreset) {
        renderedPreset.getClass();
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.add(renderedPreset);
    }

    private void clearRenderedPresets() {
        this.renderedPresets_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void ensureRenderedPresetsIsMutable() {
        Internal.ProtobufList<RenderedPreset> protobufList = this.renderedPresets_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.renderedPresets_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowPreviewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6218a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowPreviewResponse parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowPreviewResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRenderedPresets(int i) {
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.remove(i);
    }

    private void setRenderedPresets(int i, RenderedPreset renderedPreset) {
        renderedPreset.getClass();
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.set(i, renderedPreset);
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
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowPreviewResponse();
            case 2:
                return new C6218a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"renderedPresets_", RenderedPreset.class, "requestId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowPreviewResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowPreviewResponse.class) {
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

    public RenderedPreset getRenderedPresets(int i) {
        return this.renderedPresets_.get(i);
    }

    public int getRenderedPresetsCount() {
        return this.renderedPresets_.size();
    }

    public List<RenderedPreset> getRenderedPresetsList() {
        return this.renderedPresets_;
    }

    public InterfaceC6219b getRenderedPresetsOrBuilder(int i) {
        return this.renderedPresets_.get(i);
    }

    public List<? extends InterfaceC6219b> getRenderedPresetsOrBuilderList() {
        return this.renderedPresets_;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public static C6218a newBuilder(Workflow$LinkWorkflowPreviewResponse workflow$LinkWorkflowPreviewResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPreviewResponse);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addRenderedPresets(int i, RenderedPreset renderedPreset) {
        renderedPreset.getClass();
        ensureRenderedPresetsIsMutable();
        this.renderedPresets_.add(i, renderedPreset);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowPreviewResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
