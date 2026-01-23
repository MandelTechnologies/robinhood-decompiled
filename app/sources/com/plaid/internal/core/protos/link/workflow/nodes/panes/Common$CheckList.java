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
public final class Common$CheckList extends GeneratedMessageLite<Common$CheckList, C6410a> implements MessageLiteOrBuilder {
    public static final int CONTAINER_STYLE_FIELD_NUMBER = 4;
    private static final Common$CheckList DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile Parser<Common$CheckList> PARSER;
    private int bitField0_;
    private int containerStyle_;
    private Common$LocalizedString header_;
    private String id_ = "";
    private Internal.ProtobufList<Common$CheckListItem> items_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList$a */
    public static final class C6410a extends GeneratedMessageLite.Builder<Common$CheckList, C6410a> implements MessageLiteOrBuilder {
        public C6410a() {
            super(Common$CheckList.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList$b */
    public enum EnumC6411b implements Internal.EnumLite {
        CONTAINER_STYLE_UNKNOWN(0),
        CONTAINER_STYLE_BACKGROUND_CARD(1),
        CONTAINER_STYLE_TRANSPARENT(2),
        UNRECOGNIZED(-1);

        public static final int CONTAINER_STYLE_BACKGROUND_CARD_VALUE = 1;
        public static final int CONTAINER_STYLE_TRANSPARENT_VALUE = 2;
        public static final int CONTAINER_STYLE_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2228b = new a();

        /* renamed from: a */
        public final int f2230a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6411b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6411b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2231a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6411b.forNumber(i) != null;
            }
        }

        EnumC6411b(int i) {
            this.f2230a = i;
        }

        public static EnumC6411b forNumber(int i) {
            if (i == 0) {
                return CONTAINER_STYLE_UNKNOWN;
            }
            if (i == 1) {
                return CONTAINER_STYLE_BACKGROUND_CARD;
            }
            if (i != 2) {
                return null;
            }
            return CONTAINER_STYLE_TRANSPARENT;
        }

        public static Internal.EnumLiteMap<EnumC6411b> internalGetValueMap() {
            return f2228b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2231a;
        }

        @Deprecated
        public static EnumC6411b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2230a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$CheckList common$CheckList = new Common$CheckList();
        DEFAULT_INSTANCE = common$CheckList;
        GeneratedMessageLite.registerDefaultInstance(Common$CheckList.class, common$CheckList);
    }

    private Common$CheckList() {
    }

    private void addAllItems(Iterable<? extends Common$CheckListItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    private void addItems(int i, Common$CheckListItem common$CheckListItem) {
        common$CheckListItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, common$CheckListItem);
    }

    private void clearContainerStyle() {
        this.containerStyle_ = 0;
    }

    private void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Common$CheckListItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$CheckList getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static C6410a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$CheckList parseDelimitedFrom(InputStream inputStream) {
        return (Common$CheckList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CheckList parseFrom(ByteString byteString) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$CheckList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    private void setContainerStyle(EnumC6411b enumC6411b) {
        this.containerStyle_ = enumC6411b.getNumber();
    }

    private void setContainerStyleValue(int i) {
        this.containerStyle_ = i;
    }

    private void setHeader(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setItems(int i, Common$CheckListItem common$CheckListItem) {
        common$CheckListItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, common$CheckListItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$CheckList();
            case 2:
                return new C6410a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004\f", new Object[]{"bitField0_", "id_", "items_", Common$CheckListItem.class, "header_", "containerStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$CheckList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$CheckList.class) {
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

    public EnumC6411b getContainerStyle() {
        EnumC6411b enumC6411bForNumber = EnumC6411b.forNumber(this.containerStyle_);
        return enumC6411bForNumber == null ? EnumC6411b.UNRECOGNIZED : enumC6411bForNumber;
    }

    public int getContainerStyleValue() {
        return this.containerStyle_;
    }

    public Common$LocalizedString getHeader() {
        Common$LocalizedString common$LocalizedString = this.header_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$CheckListItem getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<Common$CheckListItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC6933r getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends InterfaceC6933r> getItemsOrBuilderList() {
        return this.items_;
    }

    public boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addItems(Common$CheckListItem common$CheckListItem) {
        common$CheckListItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(common$CheckListItem);
    }

    public static C6410a newBuilder(Common$CheckList common$CheckList) {
        return DEFAULT_INSTANCE.createBuilder(common$CheckList);
    }

    public static Common$CheckList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(CodedInputStream codedInputStream) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$CheckList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(InputStream inputStream) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CheckList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(ByteBuffer byteBuffer) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$CheckList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(byte[] bArr) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$CheckList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
