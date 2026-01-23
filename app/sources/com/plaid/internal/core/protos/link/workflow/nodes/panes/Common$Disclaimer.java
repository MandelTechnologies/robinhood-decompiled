package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$Disclaimer extends GeneratedMessageLite<Common$Disclaimer, C6416a> implements MessageLiteOrBuilder {
    private static final Common$Disclaimer DEFAULT_INSTANCE;
    public static final int LEADING_ASSET_FIELD_NUMBER = 1;
    private static volatile Parser<Common$Disclaimer> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int bitField0_;
    private Common$RenderedAssetAppearance leadingAsset_;
    private Common$TextContent text_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer$a */
    public static final class C6416a extends GeneratedMessageLite.Builder<Common$Disclaimer, C6416a> implements MessageLiteOrBuilder {
        public C6416a() {
            super(Common$Disclaimer.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Disclaimer common$Disclaimer = new Common$Disclaimer();
        DEFAULT_INSTANCE = common$Disclaimer;
        GeneratedMessageLite.registerDefaultInstance(Common$Disclaimer.class, common$Disclaimer);
    }

    private Common$Disclaimer() {
    }

    private void clearLeadingAsset() {
        this.leadingAsset_ = null;
        this.bitField0_ &= -2;
    }

    private void clearText() {
        this.text_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$Disclaimer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.leadingAsset_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.leadingAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.leadingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void mergeText(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        Common$TextContent common$TextContent2 = this.text_;
        if (common$TextContent2 != null && common$TextContent2 != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder(this.text_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.text_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    public static C6416a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Disclaimer parseDelimitedFrom(InputStream inputStream) {
        return (Common$Disclaimer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Disclaimer parseFrom(ByteString byteString) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Disclaimer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.leadingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setText(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.text_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Disclaimer();
            case 2:
                return new C6416a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "leadingAsset_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Disclaimer> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Disclaimer.class) {
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

    public Common$RenderedAssetAppearance getLeadingAsset() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.leadingAsset_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$TextContent getText() {
        Common$TextContent common$TextContent = this.text_;
        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public boolean hasLeadingAsset() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6416a newBuilder(Common$Disclaimer common$Disclaimer) {
        return DEFAULT_INSTANCE.createBuilder(common$Disclaimer);
    }

    public static Common$Disclaimer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Disclaimer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Disclaimer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Disclaimer parseFrom(CodedInputStream codedInputStream) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Disclaimer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Disclaimer parseFrom(InputStream inputStream) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Disclaimer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Disclaimer parseFrom(ByteBuffer byteBuffer) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Disclaimer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Disclaimer parseFrom(byte[] bArr) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Disclaimer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Disclaimer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
