package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import com.robinhood.rosetta.eventlogging.List;
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

/* compiled from: List.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/List;", "Lcom/squareup/wire/Message;", "", "unique_identifier", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "owner_type", "Lcom/robinhood/rosetta/eventlogging/List$OwnerType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/List$OwnerType;Lokio/ByteString;)V", "getUnique_identifier", "()Ljava/lang/String;", "getDisplay_name", "getOwner_type", "()Lcom/robinhood/rosetta/eventlogging/List$OwnerType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OwnerType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class List extends Message {

    @JvmField
    public static final ProtoAdapter<List> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String display_name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.List$OwnerType#ADAPTER", jsonName = "ownerType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OwnerType owner_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uniqueIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String unique_identifier;

    public List() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ List(String str, String str2, OwnerType ownerType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OwnerType.OWNER_TYPE_UNSPECIFIED : ownerType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24342newBuilder();
    }

    public final String getUnique_identifier() {
        return this.unique_identifier;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final OwnerType getOwner_type() {
        return this.owner_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public List(String unique_identifier, String display_name, OwnerType owner_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(owner_type, "owner_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.unique_identifier = unique_identifier;
        this.display_name = display_name;
        this.owner_type = owner_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24342newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof List)) {
            return false;
        }
        List list = (List) other;
        return Intrinsics.areEqual(unknownFields(), list.unknownFields()) && Intrinsics.areEqual(this.unique_identifier, list.unique_identifier) && Intrinsics.areEqual(this.display_name, list.display_name) && this.owner_type == list.owner_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.unique_identifier.hashCode()) * 37) + this.display_name.hashCode()) * 37) + this.owner_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("unique_identifier=" + Internal.sanitize(this.unique_identifier));
        arrayList.add("display_name=" + Internal.sanitize(this.display_name));
        arrayList.add("owner_type=" + this.owner_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "List{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ List copy$default(List list, String str, String str2, OwnerType ownerType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = list.unique_identifier;
        }
        if ((i & 2) != 0) {
            str2 = list.display_name;
        }
        if ((i & 4) != 0) {
            ownerType = list.owner_type;
        }
        if ((i & 8) != 0) {
            byteString = list.unknownFields();
        }
        return list.copy(str, str2, ownerType, byteString);
    }

    public final List copy(String unique_identifier, String display_name, OwnerType owner_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(owner_type, "owner_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new List(unique_identifier, display_name, owner_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(List.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<List>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.List$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(List value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUnique_identifier());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDisplay_name());
                }
                return value.getOwner_type() != List.OwnerType.OWNER_TYPE_UNSPECIFIED ? size + List.OwnerType.ADAPTER.encodedSizeWithTag(3, value.getOwner_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, List value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                }
                if (value.getOwner_type() != List.OwnerType.OWNER_TYPE_UNSPECIFIED) {
                    List.OwnerType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOwner_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, List value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOwner_type() != List.OwnerType.OWNER_TYPE_UNSPECIFIED) {
                    List.OwnerType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOwner_type());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                }
                if (Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public List decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                List.OwnerType ownerTypeDecode = List.OwnerType.OWNER_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new List(strDecode, strDecode2, ownerTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            ownerTypeDecode = List.OwnerType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List redact(List value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return List.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: List.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/List$OwnerType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OWNER_TYPE_UNSPECIFIED", TradingTrendsType.ROBINHOOD, "CUSTOM", "USER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OwnerType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OwnerType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OwnerType> ADAPTER;

        @Deprecated
        public static final OwnerType CUSTOM;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OwnerType OWNER_TYPE_UNSPECIFIED;
        public static final OwnerType ROBINHOOD;
        public static final OwnerType USER;
        private final int value;

        private static final /* synthetic */ OwnerType[] $values() {
            return new OwnerType[]{OWNER_TYPE_UNSPECIFIED, ROBINHOOD, CUSTOM, USER};
        }

        @JvmStatic
        public static final OwnerType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OwnerType> getEntries() {
            return $ENTRIES;
        }

        private OwnerType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OwnerType ownerType = new OwnerType("OWNER_TYPE_UNSPECIFIED", 0, 0);
            OWNER_TYPE_UNSPECIFIED = ownerType;
            ROBINHOOD = new OwnerType(TradingTrendsType.ROBINHOOD, 1, 1);
            CUSTOM = new OwnerType("CUSTOM", 2, 2);
            USER = new OwnerType("USER", 3, 3);
            OwnerType[] ownerTypeArr$values = $values();
            $VALUES = ownerTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(ownerTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OwnerType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OwnerType>(orCreateKotlinClass, syntax, ownerType) { // from class: com.robinhood.rosetta.eventlogging.List$OwnerType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public List.OwnerType fromValue(int value) {
                    return List.OwnerType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: List.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/List$OwnerType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/List$OwnerType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OwnerType fromValue(int value) {
                if (value == 0) {
                    return OwnerType.OWNER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OwnerType.ROBINHOOD;
                }
                if (value == 2) {
                    return OwnerType.CUSTOM;
                }
                if (value != 3) {
                    return null;
                }
                return OwnerType.USER;
            }
        }

        public static OwnerType valueOf(String str) {
            return (OwnerType) Enum.valueOf(OwnerType.class, str);
        }

        public static OwnerType[] values() {
            return (OwnerType[]) $VALUES.clone();
        }
    }
}
