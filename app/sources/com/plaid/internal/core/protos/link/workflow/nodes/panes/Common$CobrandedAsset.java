package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$CobrandedAsset extends GeneratedMessageLite<Common$CobrandedAsset, C6414a> implements MessageLiteOrBuilder {
    private static final Common$CobrandedAsset DEFAULT_INSTANCE;
    public static final int LEADING_ASSET_FIELD_NUMBER = 2;
    private static volatile Parser<Common$CobrandedAsset> PARSER = null;
    public static final int TRAILING_ASSET_FIELD_NUMBER = 3;
    private int bitField0_;
    private Common$RenderedAssetAppearance leadingAsset_;
    private Common$RenderedAssetAppearance trailingAsset_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset$a */
    public static final class C6414a extends GeneratedMessageLite.Builder<Common$CobrandedAsset, C6414a> implements MessageLiteOrBuilder {
        public C6414a() {
            super(Common$CobrandedAsset.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$CobrandedAsset common$CobrandedAsset = new Common$CobrandedAsset();
        DEFAULT_INSTANCE = common$CobrandedAsset;
        GeneratedMessageLite.registerDefaultInstance(Common$CobrandedAsset.class, common$CobrandedAsset);
    }

    private Common$CobrandedAsset() {
    }

    private void clearLeadingAsset() {
        this.leadingAsset_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTrailingAsset() {
        this.trailingAsset_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$CobrandedAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.leadingAsset_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.leadingAsset_ = common$RenderedAssetAppearance;
        } else {
            this.leadingAsset_ = Common$RenderedAssetAppearance.newBuilder(this.leadingAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeTrailingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.trailingAsset_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.trailingAsset_ = common$RenderedAssetAppearance;
        } else {
            this.trailingAsset_ = Common$RenderedAssetAppearance.newBuilder(this.trailingAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6414a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$CobrandedAsset parseDelimitedFrom(InputStream inputStream) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CobrandedAsset parseFrom(ByteBuffer byteBuffer) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$CobrandedAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.leadingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setTrailingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.trailingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$CobrandedAsset();
            case 2:
                return new C6414a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "leadingAsset_", "trailingAsset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$CobrandedAsset> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$CobrandedAsset.class) {
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

    public Common$RenderedAssetAppearance getTrailingAsset() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.trailingAsset_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public boolean hasLeadingAsset() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrailingAsset() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6414a newBuilder(Common$CobrandedAsset common$CobrandedAsset) {
        return DEFAULT_INSTANCE.createBuilder(common$CobrandedAsset);
    }

    public static Common$CobrandedAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CobrandedAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$CobrandedAsset parseFrom(ByteString byteString) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$CobrandedAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$CobrandedAsset parseFrom(byte[] bArr) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$CobrandedAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$CobrandedAsset parseFrom(InputStream inputStream) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CobrandedAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CobrandedAsset parseFrom(CodedInputStream codedInputStream) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$CobrandedAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
