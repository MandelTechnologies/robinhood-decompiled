package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$Table extends GeneratedMessageLite<Common$Table, C6501a> implements MessageLiteOrBuilder {
    private static final Common$Table DEFAULT_INSTANCE;
    public static final int FLEX_DIRECTION_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Common$Table> PARSER = null;
    public static final int TABLE_ROWS_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int flexDirection_;
    private String id_ = "";
    private Internal.ProtobufList<Common$TableRow> tableRows_ = GeneratedMessageLite.emptyProtobufList();
    private Common$LocalizedString title_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table$a */
    public static final class C6501a extends GeneratedMessageLite.Builder<Common$Table, C6501a> implements MessageLiteOrBuilder {
        public C6501a() {
            super(Common$Table.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Table common$Table = new Common$Table();
        DEFAULT_INSTANCE = common$Table;
        GeneratedMessageLite.registerDefaultInstance(Common$Table.class, common$Table);
    }

    private Common$Table() {
    }

    private void addAllTableRows(Iterable<? extends Common$TableRow> iterable) {
        ensureTableRowsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tableRows_);
    }

    private void addTableRows(int i, Common$TableRow common$TableRow) {
        common$TableRow.getClass();
        ensureTableRowsIsMutable();
        this.tableRows_.add(i, common$TableRow);
    }

    private void clearFlexDirection() {
        this.flexDirection_ = 0;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearTableRows() {
        this.tableRows_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureTableRowsIsMutable() {
        Internal.ProtobufList<Common$TableRow> protobufList = this.tableRows_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tableRows_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$Table getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6501a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Table parseDelimitedFrom(InputStream inputStream) {
        return (Common$Table) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Table parseFrom(ByteString byteString) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Table> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeTableRows(int i) {
        ensureTableRowsIsMutable();
        this.tableRows_.remove(i);
    }

    private void setFlexDirection(EnumC6939u enumC6939u) {
        this.flexDirection_ = enumC6939u.getNumber();
    }

    private void setFlexDirectionValue(int i) {
        this.flexDirection_ = i;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setTableRows(int i, Common$TableRow common$TableRow) {
        common$TableRow.getClass();
        ensureTableRowsIsMutable();
        this.tableRows_.set(i, common$TableRow);
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Table();
            case 2:
                return new C6501a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0004\u001b\u0005\f", new Object[]{"bitField0_", "id_", "title_", "tableRows_", Common$TableRow.class, "flexDirection_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Table> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Table.class) {
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

    public EnumC6939u getFlexDirection() {
        EnumC6939u enumC6939uForNumber = EnumC6939u.forNumber(this.flexDirection_);
        return enumC6939uForNumber == null ? EnumC6939u.UNRECOGNIZED : enumC6939uForNumber;
    }

    public int getFlexDirectionValue() {
        return this.flexDirection_;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$TableRow getTableRows(int i) {
        return this.tableRows_.get(i);
    }

    public int getTableRowsCount() {
        return this.tableRows_.size();
    }

    public List<Common$TableRow> getTableRowsList() {
        return this.tableRows_;
    }

    public InterfaceC6786Q getTableRowsOrBuilder(int i) {
        return this.tableRows_.get(i);
    }

    public List<? extends InterfaceC6786Q> getTableRowsOrBuilderList() {
        return this.tableRows_;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addTableRows(Common$TableRow common$TableRow) {
        common$TableRow.getClass();
        ensureTableRowsIsMutable();
        this.tableRows_.add(common$TableRow);
    }

    public static C6501a newBuilder(Common$Table common$Table) {
        return DEFAULT_INSTANCE.createBuilder(common$Table);
    }

    public static Common$Table parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Table) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Table parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Table parseFrom(CodedInputStream codedInputStream) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Table parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Table parseFrom(InputStream inputStream) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Table parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Table parseFrom(ByteBuffer byteBuffer) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Table parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Table parseFrom(byte[] bArr) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Table parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Table) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
