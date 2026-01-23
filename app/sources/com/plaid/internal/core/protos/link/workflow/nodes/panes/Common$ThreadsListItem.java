package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$ThreadsListItem extends GeneratedMessageLite<Common$ThreadsListItem, C6531a> implements MessageLiteOrBuilder {
    private static final Common$ThreadsListItem DEFAULT_INSTANCE;
    public static final int LEADING_CONTENTS_FIELD_NUMBER = 1;
    public static final int LEADING_TEXT_ROWS_FIELD_NUMBER = 2;
    private static volatile Parser<Common$ThreadsListItem> PARSER = null;
    public static final int TRAILING_CONTENTS_COLUMNS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ListItemSection leadingContents_;
    private ListItemSection leadingTextRows_;
    private ListItemSection trailingContentsColumns_;

    public static final class ListItemRow extends GeneratedMessageLite<ListItemRow, C6529a> implements InterfaceC6532b {
        public static final int COMPONENTS_FIELD_NUMBER = 1;
        private static final ListItemRow DEFAULT_INSTANCE;
        private static volatile Parser<ListItemRow> PARSER;
        private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem$ListItemRow$a */
        public static final class C6529a extends GeneratedMessageLite.Builder<ListItemRow, C6529a> implements InterfaceC6532b {
            public C6529a() {
                super(ListItemRow.DEFAULT_INSTANCE);
            }
        }

        static {
            ListItemRow listItemRow = new ListItemRow();
            DEFAULT_INSTANCE = listItemRow;
            GeneratedMessageLite.registerDefaultInstance(ListItemRow.class, listItemRow);
        }

        private ListItemRow() {
        }

        private void addAllComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
            ensureComponentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
        }

        private void addComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureComponentsIsMutable();
            this.components_.add(i, common$FlexibleComponent);
        }

        private void clearComponents() {
            this.components_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureComponentsIsMutable() {
            Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ListItemRow getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6529a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListItemRow parseDelimitedFrom(InputStream inputStream) {
            return (ListItemRow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListItemRow parseFrom(ByteString byteString) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<ListItemRow> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeComponents(int i) {
            ensureComponentsIsMutable();
            this.components_.remove(i);
        }

        private void setComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureComponentsIsMutable();
            this.components_.set(i, common$FlexibleComponent);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListItemRow();
                case 2:
                    return new C6529a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"components_", Common$FlexibleComponent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListItemRow> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ListItemRow.class) {
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

        public Common$FlexibleComponent getComponents(int i) {
            return this.components_.get(i);
        }

        public int getComponentsCount() {
            return this.components_.size();
        }

        public List<Common$FlexibleComponent> getComponentsList() {
            return this.components_;
        }

        public InterfaceC6943w getComponentsOrBuilder(int i) {
            return this.components_.get(i);
        }

        public List<? extends InterfaceC6943w> getComponentsOrBuilderList() {
            return this.components_;
        }

        private void addComponents(Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureComponentsIsMutable();
            this.components_.add(common$FlexibleComponent);
        }

        public static C6529a newBuilder(ListItemRow listItemRow) {
            return DEFAULT_INSTANCE.createBuilder(listItemRow);
        }

        public static ListItemRow parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemRow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListItemRow parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListItemRow parseFrom(CodedInputStream codedInputStream) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListItemRow parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static ListItemRow parseFrom(InputStream inputStream) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListItemRow parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListItemRow parseFrom(ByteBuffer byteBuffer) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ListItemRow parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListItemRow parseFrom(byte[] bArr) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListItemRow parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    public static final class ListItemSection extends GeneratedMessageLite<ListItemSection, C6530a> implements MessageLiteOrBuilder {
        public static final int COMPONENTS_FIELD_NUMBER = 1;
        private static final ListItemSection DEFAULT_INSTANCE;
        private static volatile Parser<ListItemSection> PARSER;
        private Internal.ProtobufList<ListItemRow> components_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem$ListItemSection$a */
        public static final class C6530a extends GeneratedMessageLite.Builder<ListItemSection, C6530a> implements MessageLiteOrBuilder {
            public C6530a() {
                super(ListItemSection.DEFAULT_INSTANCE);
            }
        }

        static {
            ListItemSection listItemSection = new ListItemSection();
            DEFAULT_INSTANCE = listItemSection;
            GeneratedMessageLite.registerDefaultInstance(ListItemSection.class, listItemSection);
        }

        private ListItemSection() {
        }

        private void addAllComponents(Iterable<? extends ListItemRow> iterable) {
            ensureComponentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
        }

        private void addComponents(int i, ListItemRow listItemRow) {
            listItemRow.getClass();
            ensureComponentsIsMutable();
            this.components_.add(i, listItemRow);
        }

        private void clearComponents() {
            this.components_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureComponentsIsMutable() {
            Internal.ProtobufList<ListItemRow> protobufList = this.components_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ListItemSection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6530a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListItemSection parseDelimitedFrom(InputStream inputStream) {
            return (ListItemSection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListItemSection parseFrom(ByteString byteString) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<ListItemSection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeComponents(int i) {
            ensureComponentsIsMutable();
            this.components_.remove(i);
        }

        private void setComponents(int i, ListItemRow listItemRow) {
            listItemRow.getClass();
            ensureComponentsIsMutable();
            this.components_.set(i, listItemRow);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListItemSection();
                case 2:
                    return new C6530a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"components_", ListItemRow.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListItemSection> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ListItemSection.class) {
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

        public ListItemRow getComponents(int i) {
            return this.components_.get(i);
        }

        public int getComponentsCount() {
            return this.components_.size();
        }

        public List<ListItemRow> getComponentsList() {
            return this.components_;
        }

        public InterfaceC6532b getComponentsOrBuilder(int i) {
            return this.components_.get(i);
        }

        public List<? extends InterfaceC6532b> getComponentsOrBuilderList() {
            return this.components_;
        }

        private void addComponents(ListItemRow listItemRow) {
            listItemRow.getClass();
            ensureComponentsIsMutable();
            this.components_.add(listItemRow);
        }

        public static C6530a newBuilder(ListItemSection listItemSection) {
            return DEFAULT_INSTANCE.createBuilder(listItemSection);
        }

        public static ListItemSection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemSection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListItemSection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListItemSection parseFrom(CodedInputStream codedInputStream) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListItemSection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static ListItemSection parseFrom(InputStream inputStream) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListItemSection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListItemSection parseFrom(ByteBuffer byteBuffer) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ListItemSection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListItemSection parseFrom(byte[] bArr) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListItemSection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ListItemSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem$a */
    public static final class C6531a extends GeneratedMessageLite.Builder<Common$ThreadsListItem, C6531a> implements MessageLiteOrBuilder {
        public C6531a() {
            super(Common$ThreadsListItem.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem$b */
    public interface InterfaceC6532b extends MessageLiteOrBuilder {
    }

    static {
        Common$ThreadsListItem common$ThreadsListItem = new Common$ThreadsListItem();
        DEFAULT_INSTANCE = common$ThreadsListItem;
        GeneratedMessageLite.registerDefaultInstance(Common$ThreadsListItem.class, common$ThreadsListItem);
    }

    private Common$ThreadsListItem() {
    }

    private void clearLeadingContents() {
        this.leadingContents_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLeadingTextRows() {
        this.leadingTextRows_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTrailingContentsColumns() {
        this.trailingContentsColumns_ = null;
        this.bitField0_ &= -5;
    }

    public static Common$ThreadsListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLeadingContents(ListItemSection listItemSection) {
        listItemSection.getClass();
        ListItemSection listItemSection2 = this.leadingContents_;
        if (listItemSection2 != null && listItemSection2 != ListItemSection.getDefaultInstance()) {
            listItemSection = ListItemSection.newBuilder(this.leadingContents_).mergeFrom((ListItemSection.C6530a) listItemSection).buildPartial();
        }
        this.leadingContents_ = listItemSection;
        this.bitField0_ |= 1;
    }

    private void mergeLeadingTextRows(ListItemSection listItemSection) {
        listItemSection.getClass();
        ListItemSection listItemSection2 = this.leadingTextRows_;
        if (listItemSection2 != null && listItemSection2 != ListItemSection.getDefaultInstance()) {
            listItemSection = ListItemSection.newBuilder(this.leadingTextRows_).mergeFrom((ListItemSection.C6530a) listItemSection).buildPartial();
        }
        this.leadingTextRows_ = listItemSection;
        this.bitField0_ |= 2;
    }

    private void mergeTrailingContentsColumns(ListItemSection listItemSection) {
        listItemSection.getClass();
        ListItemSection listItemSection2 = this.trailingContentsColumns_;
        if (listItemSection2 != null && listItemSection2 != ListItemSection.getDefaultInstance()) {
            listItemSection = ListItemSection.newBuilder(this.trailingContentsColumns_).mergeFrom((ListItemSection.C6530a) listItemSection).buildPartial();
        }
        this.trailingContentsColumns_ = listItemSection;
        this.bitField0_ |= 4;
    }

    public static C6531a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$ThreadsListItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ThreadsListItem parseFrom(ByteString byteString) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$ThreadsListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLeadingContents(ListItemSection listItemSection) {
        listItemSection.getClass();
        this.leadingContents_ = listItemSection;
        this.bitField0_ |= 1;
    }

    private void setLeadingTextRows(ListItemSection listItemSection) {
        listItemSection.getClass();
        this.leadingTextRows_ = listItemSection;
        this.bitField0_ |= 2;
    }

    private void setTrailingContentsColumns(ListItemSection listItemSection) {
        listItemSection.getClass();
        this.trailingContentsColumns_ = listItemSection;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ThreadsListItem();
            case 2:
                return new C6531a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "leadingContents_", "leadingTextRows_", "trailingContentsColumns_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ThreadsListItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$ThreadsListItem.class) {
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

    public ListItemSection getLeadingContents() {
        ListItemSection listItemSection = this.leadingContents_;
        return listItemSection == null ? ListItemSection.getDefaultInstance() : listItemSection;
    }

    public ListItemSection getLeadingTextRows() {
        ListItemSection listItemSection = this.leadingTextRows_;
        return listItemSection == null ? ListItemSection.getDefaultInstance() : listItemSection;
    }

    public ListItemSection getTrailingContentsColumns() {
        ListItemSection listItemSection = this.trailingContentsColumns_;
        return listItemSection == null ? ListItemSection.getDefaultInstance() : listItemSection;
    }

    public boolean hasLeadingContents() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLeadingTextRows() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrailingContentsColumns() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C6531a newBuilder(Common$ThreadsListItem common$ThreadsListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$ThreadsListItem);
    }

    public static Common$ThreadsListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ThreadsListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ThreadsListItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ThreadsListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$ThreadsListItem parseFrom(InputStream inputStream) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ThreadsListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ThreadsListItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$ThreadsListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ThreadsListItem parseFrom(byte[] bArr) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ThreadsListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ThreadsListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
