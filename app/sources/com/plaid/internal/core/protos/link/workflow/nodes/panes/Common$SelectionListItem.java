package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.plaid.internal.EnumC7081g;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$SelectionListItem extends GeneratedMessageLite<Common$SelectionListItem, C6497a> implements InterfaceC6720P {
    public static final int CHILDREN_FIELD_NUMBER = 11;
    private static final Common$SelectionListItem DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LEADING_ASSET_FIELD_NUMBER = 12;
    public static final int NOTE_FIELD_NUMBER = 7;
    public static final int ON_SUBMIT_FIELD_NUMBER = 10;
    private static volatile Parser<Common$SelectionListItem> PARSER = null;
    public static final int PRESELECTED_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRAILING_ASSET_FIELD_NUMBER = 13;
    public static final int TRAILING_ICON_FIELD_NUMBER = 6;
    private int bitField0_;
    private Common$LocalizedString detail_;
    private Common$RenderedAsset leadingAsset_;
    private Common$Note note_;
    private Common$SDKEvent onSubmit_;
    private boolean preselected_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;
    private Common$RenderedAsset trailingAsset_;
    private int trailingIcon_;
    private String id_ = "";
    private Internal.ProtobufList<Common$SelectionListItem> children_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem$a */
    public static final class C6497a extends GeneratedMessageLite.Builder<Common$SelectionListItem, C6497a> implements InterfaceC6720P {
        public C6497a() {
            super(Common$SelectionListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SelectionListItem common$SelectionListItem = new Common$SelectionListItem();
        DEFAULT_INSTANCE = common$SelectionListItem;
        GeneratedMessageLite.registerDefaultInstance(Common$SelectionListItem.class, common$SelectionListItem);
    }

    private Common$SelectionListItem() {
    }

    private void addAllChildren(Iterable<? extends Common$SelectionListItem> iterable) {
        ensureChildrenIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.children_);
    }

    private void addChildren(Common$SelectionListItem common$SelectionListItem) {
        common$SelectionListItem.getClass();
        ensureChildrenIsMutable();
        this.children_.add(common$SelectionListItem);
    }

    private void clearChildren() {
        this.children_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDetail() {
        this.detail_ = null;
        this.bitField0_ &= -9;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearLeadingAsset() {
        this.leadingAsset_ = null;
        this.bitField0_ &= -33;
    }

    private void clearNote() {
        this.note_ = null;
        this.bitField0_ &= -3;
    }

    private void clearOnSubmit() {
        this.onSubmit_ = null;
        this.bitField0_ &= -17;
    }

    private void clearPreselected() {
        this.preselected_ = false;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -5;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTrailingAsset() {
        this.trailingAsset_ = null;
        this.bitField0_ &= -65;
    }

    private void clearTrailingIcon() {
        this.trailingIcon_ = 0;
    }

    private void ensureChildrenIsMutable() {
        Internal.ProtobufList<Common$SelectionListItem> protobufList = this.children_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.children_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$SelectionListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDetail(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.detail_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.detail_ = common$LocalizedString;
        } else {
            this.detail_ = Common$LocalizedString.newBuilder(this.detail_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeLeadingAsset(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.leadingAsset_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == Common$RenderedAsset.getDefaultInstance()) {
            this.leadingAsset_ = common$RenderedAsset;
        } else {
            this.leadingAsset_ = Common$RenderedAsset.newBuilder(this.leadingAsset_).mergeFrom((Common$RenderedAsset.C6473a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeNote(Common$Note common$Note) {
        common$Note.getClass();
        Common$Note common$Note2 = this.note_;
        if (common$Note2 == null || common$Note2 == Common$Note.getDefaultInstance()) {
            this.note_ = common$Note;
        } else {
            this.note_ = Common$Note.newBuilder(this.note_).mergeFrom((Common$Note.C6447a) common$Note).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeOnSubmit(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        Common$SDKEvent common$SDKEvent2 = this.onSubmit_;
        if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
            this.onSubmit_ = common$SDKEvent;
        } else {
            this.onSubmit_ = Common$SDKEvent.newBuilder(this.onSubmit_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
        }
        this.bitField0_ |= 16;
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
        this.bitField0_ |= 1;
    }

    private void mergeTrailingAsset(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.trailingAsset_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == Common$RenderedAsset.getDefaultInstance()) {
            this.trailingAsset_ = common$RenderedAsset;
        } else {
            this.trailingAsset_ = Common$RenderedAsset.newBuilder(this.trailingAsset_).mergeFrom((Common$RenderedAsset.C6473a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    public static C6497a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SelectionListItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SelectionListItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SelectionListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeChildren(int i) {
        ensureChildrenIsMutable();
        this.children_.remove(i);
    }

    private void setChildren(int i, Common$SelectionListItem common$SelectionListItem) {
        common$SelectionListItem.getClass();
        ensureChildrenIsMutable();
        this.children_.set(i, common$SelectionListItem);
    }

    private void setDetail(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.detail_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setLeadingAsset(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.leadingAsset_ = common$RenderedAsset;
        this.bitField0_ |= 32;
    }

    private void setNote(Common$Note common$Note) {
        common$Note.getClass();
        this.note_ = common$Note;
        this.bitField0_ |= 2;
    }

    private void setOnSubmit(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        this.onSubmit_ = common$SDKEvent;
        this.bitField0_ |= 16;
    }

    private void setPreselected(boolean z) {
        this.preselected_ = z;
    }

    private void setSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setTrailingAsset(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.trailingAsset_ = common$RenderedAsset;
        this.bitField0_ |= 64;
    }

    private void setTrailingIcon(EnumC7081g enumC7081g) {
        this.trailingIcon_ = enumC7081g.getNumber();
    }

    private void setTrailingIconValue(int i) {
        this.trailingIcon_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SelectionListItem();
            case 2:
                return new C6497a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0007\u0006\f\u0007ဉ\u0001\nဉ\u0004\u000b\u001b\fဉ\u0005\rဉ\u0006", new Object[]{"bitField0_", "id_", "title_", "subtitle_", "detail_", "preselected_", "trailingIcon_", "note_", "onSubmit_", "children_", Common$SelectionListItem.class, "leadingAsset_", "trailingAsset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SelectionListItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SelectionListItem.class) {
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

    public Common$SelectionListItem getChildren(int i) {
        return this.children_.get(i);
    }

    public int getChildrenCount() {
        return this.children_.size();
    }

    public List<Common$SelectionListItem> getChildrenList() {
        return this.children_;
    }

    public InterfaceC6720P getChildrenOrBuilder(int i) {
        return this.children_.get(i);
    }

    public List<? extends InterfaceC6720P> getChildrenOrBuilderList() {
        return this.children_;
    }

    public Common$LocalizedString getDetail() {
        Common$LocalizedString common$LocalizedString = this.detail_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$RenderedAsset getLeadingAsset() {
        Common$RenderedAsset common$RenderedAsset = this.leadingAsset_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public Common$Note getNote() {
        Common$Note common$Note = this.note_;
        return common$Note == null ? Common$Note.getDefaultInstance() : common$Note;
    }

    public Common$SDKEvent getOnSubmit() {
        Common$SDKEvent common$SDKEvent = this.onSubmit_;
        return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public boolean getPreselected() {
        return this.preselected_;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$RenderedAsset getTrailingAsset() {
        Common$RenderedAsset common$RenderedAsset = this.trailingAsset_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public EnumC7081g getTrailingIcon() {
        EnumC7081g enumC7081gForNumber = EnumC7081g.forNumber(this.trailingIcon_);
        return enumC7081gForNumber == null ? EnumC7081g.UNRECOGNIZED : enumC7081gForNumber;
    }

    public int getTrailingIconValue() {
        return this.trailingIcon_;
    }

    public boolean hasDetail() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLeadingAsset() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNote() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOnSubmit() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSubtitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrailingAsset() {
        return (this.bitField0_ & 64) != 0;
    }

    public static C6497a newBuilder(Common$SelectionListItem common$SelectionListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$SelectionListItem);
    }

    public static Common$SelectionListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(ByteString byteString) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addChildren(int i, Common$SelectionListItem common$SelectionListItem) {
        common$SelectionListItem.getClass();
        ensureChildrenIsMutable();
        this.children_.add(i, common$SelectionListItem);
    }

    public static Common$SelectionListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(byte[] bArr) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SelectionListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(InputStream inputStream) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SelectionListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SelectionListItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SelectionListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SelectionListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
