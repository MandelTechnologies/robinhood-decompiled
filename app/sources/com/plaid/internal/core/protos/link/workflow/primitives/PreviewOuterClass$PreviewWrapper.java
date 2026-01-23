package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class PreviewOuterClass$PreviewWrapper extends GeneratedMessageLite<PreviewOuterClass$PreviewWrapper, C7000a> implements MessageLiteOrBuilder {
    private static final PreviewOuterClass$PreviewWrapper DEFAULT_INSTANCE;
    private static volatile Parser<PreviewOuterClass$PreviewWrapper> PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 1;
    public static final int PREVIEW_RENDERING_OPTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private PreviewOuterClass$Preview.RenderingOptions previewRenderingOptions_;
    private PreviewOuterClass$Preview preview_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$PreviewWrapper$a */
    public static final class C7000a extends GeneratedMessageLite.Builder<PreviewOuterClass$PreviewWrapper, C7000a> implements MessageLiteOrBuilder {
        public C7000a() {
            super(PreviewOuterClass$PreviewWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        PreviewOuterClass$PreviewWrapper previewOuterClass$PreviewWrapper = new PreviewOuterClass$PreviewWrapper();
        DEFAULT_INSTANCE = previewOuterClass$PreviewWrapper;
        GeneratedMessageLite.registerDefaultInstance(PreviewOuterClass$PreviewWrapper.class, previewOuterClass$PreviewWrapper);
    }

    private PreviewOuterClass$PreviewWrapper() {
    }

    private void clearPreview() {
        this.preview_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPreviewRenderingOptions() {
        this.previewRenderingOptions_ = null;
        this.bitField0_ &= -3;
    }

    public static PreviewOuterClass$PreviewWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergePreview(PreviewOuterClass$Preview previewOuterClass$Preview) {
        previewOuterClass$Preview.getClass();
        PreviewOuterClass$Preview previewOuterClass$Preview2 = this.preview_;
        if (previewOuterClass$Preview2 == null || previewOuterClass$Preview2 == PreviewOuterClass$Preview.getDefaultInstance()) {
            this.preview_ = previewOuterClass$Preview;
        } else {
            this.preview_ = PreviewOuterClass$Preview.newBuilder(this.preview_).mergeFrom((PreviewOuterClass$Preview.C6997a) previewOuterClass$Preview).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePreviewRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
        renderingOptions.getClass();
        PreviewOuterClass$Preview.RenderingOptions renderingOptions2 = this.previewRenderingOptions_;
        if (renderingOptions2 == null || renderingOptions2 == PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance()) {
            this.previewRenderingOptions_ = renderingOptions;
        } else {
            this.previewRenderingOptions_ = PreviewOuterClass$Preview.RenderingOptions.newBuilder(this.previewRenderingOptions_).mergeFrom((PreviewOuterClass$Preview.RenderingOptions.C6996a) renderingOptions).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C7000a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreviewOuterClass$PreviewWrapper parseDelimitedFrom(InputStream inputStream) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteBuffer byteBuffer) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PreviewOuterClass$PreviewWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPreview(PreviewOuterClass$Preview previewOuterClass$Preview) {
        previewOuterClass$Preview.getClass();
        this.preview_ = previewOuterClass$Preview;
        this.bitField0_ |= 1;
    }

    private void setPreviewRenderingOptions(PreviewOuterClass$Preview.RenderingOptions renderingOptions) {
        renderingOptions.getClass();
        this.previewRenderingOptions_ = renderingOptions;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7036p.f2698a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreviewOuterClass$PreviewWrapper();
            case 2:
                return new C7000a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "preview_", "previewRenderingOptions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PreviewOuterClass$PreviewWrapper> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PreviewOuterClass$PreviewWrapper.class) {
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

    public PreviewOuterClass$Preview getPreview() {
        PreviewOuterClass$Preview previewOuterClass$Preview = this.preview_;
        return previewOuterClass$Preview == null ? PreviewOuterClass$Preview.getDefaultInstance() : previewOuterClass$Preview;
    }

    public PreviewOuterClass$Preview.RenderingOptions getPreviewRenderingOptions() {
        PreviewOuterClass$Preview.RenderingOptions renderingOptions = this.previewRenderingOptions_;
        return renderingOptions == null ? PreviewOuterClass$Preview.RenderingOptions.getDefaultInstance() : renderingOptions;
    }

    public boolean hasPreview() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPreviewRenderingOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C7000a newBuilder(PreviewOuterClass$PreviewWrapper previewOuterClass$PreviewWrapper) {
        return DEFAULT_INSTANCE.createBuilder(previewOuterClass$PreviewWrapper);
    }

    public static PreviewOuterClass$PreviewWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteString byteString) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(byte[] bArr) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(InputStream inputStream) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(CodedInputStream codedInputStream) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PreviewOuterClass$PreviewWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$PreviewWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
