package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$ChildItemsHeader extends GeneratedMessageLite<Common$ChildItemsHeader, C6413a> implements MessageLiteOrBuilder {
    private static final Common$ChildItemsHeader DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile Parser<Common$ChildItemsHeader> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Common$RenderedAssetAppearance image_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader$a */
    public static final class C6413a extends GeneratedMessageLite.Builder<Common$ChildItemsHeader, C6413a> implements MessageLiteOrBuilder {
        public C6413a() {
            super(Common$ChildItemsHeader.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$ChildItemsHeader common$ChildItemsHeader = new Common$ChildItemsHeader();
        DEFAULT_INSTANCE = common$ChildItemsHeader;
        GeneratedMessageLite.registerDefaultInstance(Common$ChildItemsHeader.class, common$ChildItemsHeader);
    }

    private Common$ChildItemsHeader() {
    }

    private void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -5;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$ChildItemsHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.image_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.image_ = common$RenderedAssetAppearance;
        } else {
            this.image_ = Common$RenderedAssetAppearance.newBuilder(this.image_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.subtitle_ = common$LocalizedString;
        } else {
            this.subtitle_ = Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.title_ = common$LocalizedString;
        } else {
            this.title_ = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6413a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$ChildItemsHeader parseDelimitedFrom(InputStream inputStream) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ChildItemsHeader parseFrom(ByteBuffer byteBuffer) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$ChildItemsHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.image_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ChildItemsHeader();
            case 2:
                return new C6413a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "image_", "title_", "subtitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ChildItemsHeader> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$ChildItemsHeader.class) {
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

    public Common$RenderedAssetAppearance getImage() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.image_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasImage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSubtitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6413a newBuilder(Common$ChildItemsHeader common$ChildItemsHeader) {
        return DEFAULT_INSTANCE.createBuilder(common$ChildItemsHeader);
    }

    public static Common$ChildItemsHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ChildItemsHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ChildItemsHeader parseFrom(ByteString byteString) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$ChildItemsHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ChildItemsHeader parseFrom(byte[] bArr) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ChildItemsHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$ChildItemsHeader parseFrom(InputStream inputStream) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ChildItemsHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ChildItemsHeader parseFrom(CodedInputStream codedInputStream) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ChildItemsHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ChildItemsHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
