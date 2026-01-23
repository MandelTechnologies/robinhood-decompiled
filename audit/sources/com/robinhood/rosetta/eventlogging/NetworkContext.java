package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: NetworkContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContext;", "Lcom/squareup/wire/Message;", "", "error_type", "", "isSuccessful", "", "status_code", "", "tag", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZILcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;Lokio/ByteString;)V", "getError_type", "()Ljava/lang/String;", "()Z", "getStatus_code", "()I", "getTag", "()Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "Tag", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NetworkContext extends Message {

    @JvmField
    public static final ProtoAdapter<NetworkContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String error_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 4)
    private final boolean isSuccessful;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "statusCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final int status_code;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkContext$Tag#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final Tag tag;

    public NetworkContext() {
        this(null, false, 0, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24405newBuilder();
    }

    public final String getError_type() {
        return this.error_type;
    }

    public /* synthetic */ NetworkContext(String str, boolean z, int i, Tag tag, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Tag.TAG_TYPE_UNSPECIFIED : tag, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final Tag getTag() {
        return this.tag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkContext(String error_type, boolean z, int i, Tag tag, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.error_type = error_type;
        this.isSuccessful = z;
        this.status_code = i;
        this.tag = tag;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24405newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NetworkContext)) {
            return false;
        }
        NetworkContext networkContext = (NetworkContext) other;
        return Intrinsics.areEqual(unknownFields(), networkContext.unknownFields()) && Intrinsics.areEqual(this.error_type, networkContext.error_type) && this.isSuccessful == networkContext.isSuccessful && this.status_code == networkContext.status_code && this.tag == networkContext.tag;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.error_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.isSuccessful)) * 37) + Integer.hashCode(this.status_code)) * 37) + this.tag.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("error_type=" + Internal.sanitize(this.error_type));
        arrayList.add("isSuccessful=" + this.isSuccessful);
        arrayList.add("status_code=" + this.status_code);
        arrayList.add("tag=" + this.tag);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NetworkContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NetworkContext copy$default(NetworkContext networkContext, String str, boolean z, int i, Tag tag, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkContext.error_type;
        }
        if ((i2 & 2) != 0) {
            z = networkContext.isSuccessful;
        }
        if ((i2 & 4) != 0) {
            i = networkContext.status_code;
        }
        if ((i2 & 8) != 0) {
            tag = networkContext.tag;
        }
        if ((i2 & 16) != 0) {
            byteString = networkContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        return networkContext.copy(str, z, i3, tag, byteString2);
    }

    public final NetworkContext copy(String error_type, boolean isSuccessful, int status_code, Tag tag, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NetworkContext(error_type, isSuccessful, status_code, tag, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NetworkContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NetworkContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NetworkContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NetworkContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getError_type());
                }
                if (value.getIsSuccessful()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, java.lang.Boolean.valueOf(value.getIsSuccessful()));
                }
                if (value.getStatus_code() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getStatus_code()));
                }
                return value.getTag() != NetworkContext.Tag.TAG_TYPE_UNSPECIFIED ? size + NetworkContext.Tag.ADAPTER.encodedSizeWithTag(3, value.getTag()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NetworkContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getError_type());
                }
                if (value.getIsSuccessful()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIsSuccessful()));
                }
                if (value.getStatus_code() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getStatus_code()));
                }
                if (value.getTag() != NetworkContext.Tag.TAG_TYPE_UNSPECIFIED) {
                    NetworkContext.Tag.ADAPTER.encodeWithTag(writer, 3, (int) value.getTag());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NetworkContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTag() != NetworkContext.Tag.TAG_TYPE_UNSPECIFIED) {
                    NetworkContext.Tag.ADAPTER.encodeWithTag(writer, 3, (int) value.getTag());
                }
                if (value.getStatus_code() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getStatus_code()));
                }
                if (value.getIsSuccessful()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) java.lang.Boolean.valueOf(value.getIsSuccessful()));
                }
                if (Intrinsics.areEqual(value.getError_type(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getError_type());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NetworkContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NetworkContext.Tag tagDecode = NetworkContext.Tag.TAG_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode = "";
                while (true) {
                    NetworkContext.Tag tag = tagDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new NetworkContext(strDecode, zBooleanValue, iIntValue, tag, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        } else if (iNextTag == 3) {
                            try {
                                tagDecode = NetworkContext.Tag.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NetworkContext redact(NetworkContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NetworkContext.copy$default(value, null, false, 0, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TAG_TYPE_UNSPECIFIED", "IAV_CONNECT", "IAV_CREATE_RELATIONSHIP", "IAV_LINK_TOKEN", "IAV_EXCHANGE_TOKEN", "SUBMIT_QUEUED_DEPOSIT", "SUBMIT_RECURRING_DEPOSIT", "SKIP_RECURRING_DEPOSIT", "SUBMIT_TRANSFER", "LINK_DEBIT_CARD", "VERIFY_DEBIT_CARD", "DEBIT_CARD_LINKING_PRECHECK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Tag implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tag[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Tag> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Tag DEBIT_CARD_LINKING_PRECHECK;
        public static final Tag IAV_CONNECT;
        public static final Tag IAV_CREATE_RELATIONSHIP;
        public static final Tag IAV_EXCHANGE_TOKEN;
        public static final Tag IAV_LINK_TOKEN;
        public static final Tag LINK_DEBIT_CARD;
        public static final Tag SKIP_RECURRING_DEPOSIT;
        public static final Tag SUBMIT_QUEUED_DEPOSIT;
        public static final Tag SUBMIT_RECURRING_DEPOSIT;
        public static final Tag SUBMIT_TRANSFER;
        public static final Tag TAG_TYPE_UNSPECIFIED;
        public static final Tag VERIFY_DEBIT_CARD;
        private final int value;

        private static final /* synthetic */ Tag[] $values() {
            return new Tag[]{TAG_TYPE_UNSPECIFIED, IAV_CONNECT, IAV_CREATE_RELATIONSHIP, IAV_LINK_TOKEN, IAV_EXCHANGE_TOKEN, SUBMIT_QUEUED_DEPOSIT, SUBMIT_RECURRING_DEPOSIT, SKIP_RECURRING_DEPOSIT, SUBMIT_TRANSFER, LINK_DEBIT_CARD, VERIFY_DEBIT_CARD, DEBIT_CARD_LINKING_PRECHECK};
        }

        @JvmStatic
        public static final Tag fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Tag> getEntries() {
            return $ENTRIES;
        }

        private Tag(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Tag tag = new Tag("TAG_TYPE_UNSPECIFIED", 0, 0);
            TAG_TYPE_UNSPECIFIED = tag;
            IAV_CONNECT = new Tag("IAV_CONNECT", 1, 1);
            IAV_CREATE_RELATIONSHIP = new Tag("IAV_CREATE_RELATIONSHIP", 2, 2);
            IAV_LINK_TOKEN = new Tag("IAV_LINK_TOKEN", 3, 6);
            IAV_EXCHANGE_TOKEN = new Tag("IAV_EXCHANGE_TOKEN", 4, 7);
            SUBMIT_QUEUED_DEPOSIT = new Tag("SUBMIT_QUEUED_DEPOSIT", 5, 3);
            SUBMIT_RECURRING_DEPOSIT = new Tag("SUBMIT_RECURRING_DEPOSIT", 6, 4);
            SKIP_RECURRING_DEPOSIT = new Tag("SKIP_RECURRING_DEPOSIT", 7, 11);
            SUBMIT_TRANSFER = new Tag("SUBMIT_TRANSFER", 8, 5);
            LINK_DEBIT_CARD = new Tag("LINK_DEBIT_CARD", 9, 8);
            VERIFY_DEBIT_CARD = new Tag("VERIFY_DEBIT_CARD", 10, 9);
            DEBIT_CARD_LINKING_PRECHECK = new Tag("DEBIT_CARD_LINKING_PRECHECK", 11, 10);
            Tag[] tagArr$values = $values();
            $VALUES = tagArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tagArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Tag.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Tag>(orCreateKotlinClass, syntax, tag) { // from class: com.robinhood.rosetta.eventlogging.NetworkContext$Tag$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NetworkContext.Tag fromValue(int value) {
                    return NetworkContext.Tag.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NetworkContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Tag fromValue(int value) {
                switch (value) {
                    case 0:
                        return Tag.TAG_TYPE_UNSPECIFIED;
                    case 1:
                        return Tag.IAV_CONNECT;
                    case 2:
                        return Tag.IAV_CREATE_RELATIONSHIP;
                    case 3:
                        return Tag.SUBMIT_QUEUED_DEPOSIT;
                    case 4:
                        return Tag.SUBMIT_RECURRING_DEPOSIT;
                    case 5:
                        return Tag.SUBMIT_TRANSFER;
                    case 6:
                        return Tag.IAV_LINK_TOKEN;
                    case 7:
                        return Tag.IAV_EXCHANGE_TOKEN;
                    case 8:
                        return Tag.LINK_DEBIT_CARD;
                    case 9:
                        return Tag.VERIFY_DEBIT_CARD;
                    case 10:
                        return Tag.DEBIT_CARD_LINKING_PRECHECK;
                    case 11:
                        return Tag.SKIP_RECURRING_DEPOSIT;
                    default:
                        return null;
                }
            }
        }

        public static Tag valueOf(String str) {
            return (Tag) Enum.valueOf(Tag.class, str);
        }

        public static Tag[] values() {
            return (Tag[]) $VALUES.clone();
        }
    }
}
