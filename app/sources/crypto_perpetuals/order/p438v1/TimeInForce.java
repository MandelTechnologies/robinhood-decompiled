package crypto_perpetuals.order.p438v1;

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
import crypto_perpetuals.order.p438v1.TimeInForce;
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
import p479j$.time.Instant;

/* compiled from: TimeInForce.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/TimeInForce;", "Lcom/squareup/wire/Message;", "", "Lcrypto_perpetuals/order/v1/TimeInForce$Type;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "expiration_time", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcrypto_perpetuals/order/v1/TimeInForce$Type;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcrypto_perpetuals/order/v1/TimeInForce$Type;Lj$/time/Instant;Lokio/ByteString;)Lcrypto_perpetuals/order/v1/TimeInForce;", "Lcrypto_perpetuals/order/v1/TimeInForce$Type;", "getType", "()Lcrypto_perpetuals/order/v1/TimeInForce$Type;", "Lj$/time/Instant;", "getExpiration_time", "()Lj$/time/Instant;", "Companion", "Type", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TimeInForce extends Message {

    @JvmField
    public static final ProtoAdapter<TimeInForce> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expirationTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant expiration_time;

    @WireField(adapter = "crypto_perpetuals.order.v1.TimeInForce$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Type type;

    public TimeInForce() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27849newBuilder();
    }

    public final Type getType() {
        return this.type;
    }

    public /* synthetic */ TimeInForce(Type type2, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Type.TIME_IN_FORCE_TYPE_UNSPECIFIED : type2, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getExpiration_time() {
        return this.expiration_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeInForce(Type type2, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.expiration_time = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27849newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TimeInForce)) {
            return false;
        }
        TimeInForce timeInForce = (TimeInForce) other;
        return Intrinsics.areEqual(unknownFields(), timeInForce.unknownFields()) && this.type == timeInForce.type && Intrinsics.areEqual(this.expiration_time, timeInForce.expiration_time);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37;
        Instant instant = this.expiration_time;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        Instant instant = this.expiration_time;
        if (instant != null) {
            arrayList.add("expiration_time=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimeInForce{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TimeInForce copy$default(TimeInForce timeInForce, Type type2, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = timeInForce.type;
        }
        if ((i & 2) != 0) {
            instant = timeInForce.expiration_time;
        }
        if ((i & 4) != 0) {
            byteString = timeInForce.unknownFields();
        }
        return timeInForce.copy(type2, instant, byteString);
    }

    public final TimeInForce copy(Type type2, Instant expiration_time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TimeInForce(type2, expiration_time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimeInForce.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TimeInForce>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.TimeInForce$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TimeInForce value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != TimeInForce.Type.TIME_IN_FORCE_TYPE_UNSPECIFIED) {
                    size += TimeInForce.Type.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                return value.getExpiration_time() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getExpiration_time()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TimeInForce value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != TimeInForce.Type.TIME_IN_FORCE_TYPE_UNSPECIFIED) {
                    TimeInForce.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getExpiration_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getExpiration_time());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TimeInForce value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getExpiration_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getExpiration_time());
                }
                if (value.getType() != TimeInForce.Type.TIME_IN_FORCE_TYPE_UNSPECIFIED) {
                    TimeInForce.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TimeInForce decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TimeInForce.Type typeDecode = TimeInForce.Type.TIME_IN_FORCE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TimeInForce(typeDecode, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            typeDecode = TimeInForce.Type.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TimeInForce redact(TimeInForce value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant expiration_time = value.getExpiration_time();
                return TimeInForce.copy$default(value, null, expiration_time != null ? ProtoAdapter.INSTANT.redact(expiration_time) : null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimeInForce.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/TimeInForce$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TIME_IN_FORCE_TYPE_UNSPECIFIED", "GFD", "GTC", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type GFD;
        public static final Type GTC;
        public static final Type TIME_IN_FORCE_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TIME_IN_FORCE_TYPE_UNSPECIFIED, GFD, GTC};
        }

        @JvmStatic
        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Type type2 = new Type("TIME_IN_FORCE_TYPE_UNSPECIFIED", 0, 0);
            TIME_IN_FORCE_TYPE_UNSPECIFIED = type2;
            GFD = new Type("GFD", 1, 1);
            GTC = new Type("GTC", 2, 2);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: crypto_perpetuals.order.v1.TimeInForce$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TimeInForce.Type fromValue(int value) {
                    return TimeInForce.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TimeInForce.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/TimeInForce$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/order/v1/TimeInForce$Type;", "fromValue", "value", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                if (value == 0) {
                    return Type.TIME_IN_FORCE_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Type.GFD;
                }
                if (value != 2) {
                    return null;
                }
                return Type.GTC;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
