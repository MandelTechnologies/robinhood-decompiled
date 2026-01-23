package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$CheckListItem extends GeneratedMessageLite<Common$CheckListItem, C6412a> implements InterfaceC6933r {
    private static final Common$CheckListItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int FIRST_LINE_CONTENT_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int ICON_FIELD_NUMBER = 3;
    private static volatile Parser<Common$CheckListItem> PARSER = null;
    public static final int SECOND_LINE_CONTENT_FIELD_NUMBER = 6;
    private int bitField0_;
    private Common$AttributedLocalizedString description_;
    private Common$TextContent firstLineContent_;
    private Common$LocalizedString header_;
    private Common$RenderedAssetAppearance icon_;
    private Common$TextContent secondLineContent_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem$a */
    public static final class C6412a extends GeneratedMessageLite.Builder<Common$CheckListItem, C6412a> implements InterfaceC6933r {
        public C6412a() {
            super(Common$CheckListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$CheckListItem common$CheckListItem = new Common$CheckListItem();
        DEFAULT_INSTANCE = common$CheckListItem;
        GeneratedMessageLite.registerDefaultInstance(Common$CheckListItem.class, common$CheckListItem);
    }

    private Common$CheckListItem() {
    }

    private void clearDescription() {
        this.description_ = null;
        this.bitField0_ &= -5;
    }

    private void clearFirstLineContent() {
        this.firstLineContent_ = null;
        this.bitField0_ &= -3;
    }

    private void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -17;
    }

    private void clearSecondLineContent() {
        this.secondLineContent_ = null;
        this.bitField0_ &= -9;
    }

    public static Common$CheckListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.description_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.description_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.description_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void mergeFirstLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        Common$TextContent common$TextContent2 = this.firstLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder(this.firstLineContent_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    private void mergeHeader(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.header_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    private void mergeSecondLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        Common$TextContent common$TextContent2 = this.secondLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder(this.secondLineContent_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    public static C6412a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$CheckListItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$CheckListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CheckListItem parseFrom(ByteString byteString) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$CheckListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.description_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void setFirstLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    private void setHeader(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    private void setSecondLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$CheckListItem();
            case 2:
                return new C6412a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0004\u0004ဉ\u0002\u0005ဉ\u0001\u0006ဉ\u0003", new Object[]{"bitField0_", "header_", "icon_", "description_", "firstLineContent_", "secondLineContent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$CheckListItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$CheckListItem.class) {
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

    public Common$AttributedLocalizedString getDescription() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.description_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$TextContent getFirstLineContent() {
        Common$TextContent common$TextContent = this.firstLineContent_;
        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public Common$LocalizedString getHeader() {
        Common$LocalizedString common$LocalizedString = this.header_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$TextContent getSecondLineContent() {
        Common$TextContent common$TextContent = this.secondLineContent_;
        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFirstLineContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSecondLineContent() {
        return (this.bitField0_ & 8) != 0;
    }

    public static C6412a newBuilder(Common$CheckListItem common$CheckListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$CheckListItem);
    }

    public static Common$CheckListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CheckListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$CheckListItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$CheckListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$CheckListItem parseFrom(InputStream inputStream) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CheckListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CheckListItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$CheckListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$CheckListItem parseFrom(byte[] bArr) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$CheckListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
