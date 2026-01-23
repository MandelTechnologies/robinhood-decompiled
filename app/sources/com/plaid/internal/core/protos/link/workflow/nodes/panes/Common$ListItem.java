package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$ListItem extends GeneratedMessageLite<Common$ListItem, C6429a> implements InterfaceC6293A {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 10;
    public static final int CHILD_ITEMS_FIELD_NUMBER = 8;
    public static final int CHILD_ITEMS_HEADER_FIELD_NUMBER = 9;
    private static final Common$ListItem DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int IMAGE_MISSING_COLOR_FIELD_NUMBER = 3;
    public static final int ON_SUBMIT_OVERRIDE_FIELD_NUMBER = 11;
    private static volatile Parser<Common$ListItem> PARSER = null;
    public static final int SECONDARY_SUBTITLE_FIELD_NUMBER = 12;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 4;
    private Common$LocalAction actionOverride_;
    private int bitField0_;
    private Common$ChildItemsHeader childItemsHeader_;
    private Common$RenderedAssetAppearance icon_;
    private Common$RenderedAssetAppearance image_;
    private Common$SDKEvent onSubmitOverride_;
    private Common$AttributedLocalizedString secondarySubtitle_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;
    private String id_ = "";
    private String imageMissingColor_ = "";
    private Internal.ProtobufList<Common$ListItem> childItems_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem$a */
    public static final class C6429a extends GeneratedMessageLite.Builder<Common$ListItem, C6429a> implements InterfaceC6293A {
        public C6429a() {
            super(Common$ListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$ListItem common$ListItem = new Common$ListItem();
        DEFAULT_INSTANCE = common$ListItem;
        GeneratedMessageLite.registerDefaultInstance(Common$ListItem.class, common$ListItem);
    }

    private Common$ListItem() {
    }

    private void addAllChildItems(Iterable<? extends Common$ListItem> iterable) {
        ensureChildItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.childItems_);
    }

    private void addChildItems(Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureChildItemsIsMutable();
        this.childItems_.add(common$ListItem);
    }

    private void clearActionOverride() {
        this.actionOverride_ = null;
        this.bitField0_ &= -65;
    }

    private void clearChildItems() {
        this.childItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearChildItemsHeader() {
        this.childItemsHeader_ = null;
        this.bitField0_ &= -33;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -17;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -2;
    }

    private void clearImageMissingColor() {
        this.imageMissingColor_ = getDefaultInstance().getImageMissingColor();
    }

    private void clearOnSubmitOverride() {
        this.onSubmitOverride_ = null;
        this.bitField0_ &= -129;
    }

    private void clearSecondarySubtitle() {
        this.secondarySubtitle_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -5;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureChildItemsIsMutable() {
        Internal.ProtobufList<Common$ListItem> protobufList = this.childItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.childItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$ListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.actionOverride_;
        if (common$LocalAction2 == null || common$LocalAction2 == Common$LocalAction.getDefaultInstance()) {
            this.actionOverride_ = common$LocalAction;
        } else {
            this.actionOverride_ = Common$LocalAction.newBuilder(this.actionOverride_).mergeFrom((Common$LocalAction.C6441b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeChildItemsHeader(Common$ChildItemsHeader common$ChildItemsHeader) {
        common$ChildItemsHeader.getClass();
        Common$ChildItemsHeader common$ChildItemsHeader2 = this.childItemsHeader_;
        if (common$ChildItemsHeader2 == null || common$ChildItemsHeader2 == Common$ChildItemsHeader.getDefaultInstance()) {
            this.childItemsHeader_ = common$ChildItemsHeader;
        } else {
            this.childItemsHeader_ = Common$ChildItemsHeader.newBuilder(this.childItemsHeader_).mergeFrom((Common$ChildItemsHeader.C6413a) common$ChildItemsHeader).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 16;
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

    private void mergeOnSubmitOverride(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        Common$SDKEvent common$SDKEvent2 = this.onSubmitOverride_;
        if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
            this.onSubmitOverride_ = common$SDKEvent;
        } else {
            this.onSubmitOverride_ = Common$SDKEvent.newBuilder(this.onSubmitOverride_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeSecondarySubtitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondarySubtitle_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
            this.secondarySubtitle_ = common$AttributedLocalizedString;
        } else {
            this.secondarySubtitle_ = Common$AttributedLocalizedString.newBuilder(this.secondarySubtitle_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 8;
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

    public static C6429a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$ListItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$ListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ListItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$ListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeChildItems(int i) {
        ensureChildItemsIsMutable();
        this.childItems_.remove(i);
    }

    private void setActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 64;
    }

    private void setChildItems(int i, Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureChildItemsIsMutable();
        this.childItems_.set(i, common$ListItem);
    }

    private void setChildItemsHeader(Common$ChildItemsHeader common$ChildItemsHeader) {
        common$ChildItemsHeader.getClass();
        this.childItemsHeader_ = common$ChildItemsHeader;
        this.bitField0_ |= 32;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.image_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setImageMissingColor(String str) {
        str.getClass();
        this.imageMissingColor_ = str;
    }

    private void setImageMissingColorBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageMissingColor_ = byteString.toStringUtf8();
    }

    private void setOnSubmitOverride(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        this.onSubmitOverride_ = common$SDKEvent;
        this.bitField0_ |= 128;
    }

    private void setSecondarySubtitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.secondarySubtitle_ = common$AttributedLocalizedString;
        this.bitField0_ |= 8;
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
                return new Common$ListItem();
            case 2:
                return new C6429a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002\u0007ဉ\u0004\b\u001b\tဉ\u0005\nဉ\u0006\u000bဉ\u0007\fဉ\u0003", new Object[]{"bitField0_", "id_", "image_", "imageMissingColor_", "title_", "subtitle_", "icon_", "childItems_", Common$ListItem.class, "childItemsHeader_", "actionOverride_", "onSubmitOverride_", "secondarySubtitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ListItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$ListItem.class) {
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

    public Common$LocalAction getActionOverride() {
        Common$LocalAction common$LocalAction = this.actionOverride_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$ListItem getChildItems(int i) {
        return this.childItems_.get(i);
    }

    public int getChildItemsCount() {
        return this.childItems_.size();
    }

    public Common$ChildItemsHeader getChildItemsHeader() {
        Common$ChildItemsHeader common$ChildItemsHeader = this.childItemsHeader_;
        return common$ChildItemsHeader == null ? Common$ChildItemsHeader.getDefaultInstance() : common$ChildItemsHeader;
    }

    public List<Common$ListItem> getChildItemsList() {
        return this.childItems_;
    }

    public InterfaceC6293A getChildItemsOrBuilder(int i) {
        return this.childItems_.get(i);
    }

    public List<? extends InterfaceC6293A> getChildItemsOrBuilderList() {
        return this.childItems_;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$RenderedAssetAppearance getImage() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.image_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public String getImageMissingColor() {
        return this.imageMissingColor_;
    }

    public ByteString getImageMissingColorBytes() {
        return ByteString.copyFromUtf8(this.imageMissingColor_);
    }

    public Common$SDKEvent getOnSubmitOverride() {
        Common$SDKEvent common$SDKEvent = this.onSubmitOverride_;
        return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public Common$AttributedLocalizedString getSecondarySubtitle() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondarySubtitle_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasActionOverride() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasChildItemsHeader() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasImage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOnSubmitOverride() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSecondarySubtitle() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSubtitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6429a newBuilder(Common$ListItem common$ListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$ListItem);
    }

    public static Common$ListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(ByteString byteString) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addChildItems(int i, Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        ensureChildItemsIsMutable();
        this.childItems_.add(i, common$ListItem);
    }

    public static Common$ListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(byte[] bArr) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(InputStream inputStream) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ListItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
