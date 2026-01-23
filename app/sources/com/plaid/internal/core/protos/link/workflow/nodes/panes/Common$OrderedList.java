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
public final class Common$OrderedList extends GeneratedMessageLite<Common$OrderedList, C6449a> implements MessageLiteOrBuilder {
    private static final Common$OrderedList DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile Parser<Common$OrderedList> PARSER;
    private String id_ = "";
    private Internal.ProtobufList<Common$OrderedListItem> items_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList$a */
    public static final class C6449a extends GeneratedMessageLite.Builder<Common$OrderedList, C6449a> implements MessageLiteOrBuilder {
        public C6449a() {
            super(Common$OrderedList.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$OrderedList common$OrderedList = new Common$OrderedList();
        DEFAULT_INSTANCE = common$OrderedList;
        GeneratedMessageLite.registerDefaultInstance(Common$OrderedList.class, common$OrderedList);
    }

    private Common$OrderedList() {
    }

    private void addAllItems(Iterable<? extends Common$OrderedListItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    private void addItems(int i, Common$OrderedListItem common$OrderedListItem) {
        common$OrderedListItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, common$OrderedListItem);
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Common$OrderedListItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$OrderedList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6449a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$OrderedList parseDelimitedFrom(InputStream inputStream) {
        return (Common$OrderedList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OrderedList parseFrom(ByteString byteString) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$OrderedList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setItems(int i, Common$OrderedListItem common$OrderedListItem) {
        common$OrderedListItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, common$OrderedListItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$OrderedList();
            case 2:
                return new C6449a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"id_", "items_", Common$OrderedListItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$OrderedList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$OrderedList.class) {
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

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$OrderedListItem getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<Common$OrderedListItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC6632H getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends InterfaceC6632H> getItemsOrBuilderList() {
        return this.items_;
    }

    private void addItems(Common$OrderedListItem common$OrderedListItem) {
        common$OrderedListItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(common$OrderedListItem);
    }

    public static C6449a newBuilder(Common$OrderedList common$OrderedList) {
        return DEFAULT_INSTANCE.createBuilder(common$OrderedList);
    }

    public static Common$OrderedList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OrderedList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$OrderedList parseFrom(CodedInputStream codedInputStream) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$OrderedList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$OrderedList parseFrom(InputStream inputStream) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OrderedList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OrderedList parseFrom(ByteBuffer byteBuffer) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$OrderedList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$OrderedList parseFrom(byte[] bArr) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$OrderedList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
