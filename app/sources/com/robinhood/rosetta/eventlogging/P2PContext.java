package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.P2PContext;
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

/* compiled from: P2PContext.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$%&BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\nH\u0016JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContext;", "Lcom/squareup/wire/Message;", "", "direction", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "target_type", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "amount", "", "search_query", "", "target_types", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;FLjava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "getTarget_type", "()Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "getAmount", "()F", "getSearch_query", "()Ljava/lang/String;", "getTarget_types", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Direction", "TargetType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class P2PContext extends Message {

    @JvmField
    public static final ProtoAdapter<P2PContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.P2PContext$Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Direction direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "searchQuery", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String search_query;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.P2PContext$TargetType#ADAPTER", jsonName = "targetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TargetType target_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.P2PContext$TargetType#ADAPTER", jsonName = "targetTypes", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final java.util.List<TargetType> target_types;

    public P2PContext() {
        this(null, null, 0.0f, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24456newBuilder();
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public /* synthetic */ P2PContext(Direction direction, TargetType targetType, float f, String str, java.util.List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 2) != 0 ? TargetType.TARGET_TYPE_UNSPECIFIED : targetType, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TargetType getTarget_type() {
        return this.target_type;
    }

    public final float getAmount() {
        return this.amount;
    }

    public final String getSearch_query() {
        return this.search_query;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PContext(Direction direction, TargetType target_type, float f, String search_query, java.util.List<? extends TargetType> target_types, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(target_type, "target_type");
        Intrinsics.checkNotNullParameter(search_query, "search_query");
        Intrinsics.checkNotNullParameter(target_types, "target_types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.direction = direction;
        this.target_type = target_type;
        this.amount = f;
        this.search_query = search_query;
        this.target_types = Internal.immutableCopyOf("target_types", target_types);
    }

    public final java.util.List<TargetType> getTarget_types() {
        return this.target_types;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24456newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof P2PContext)) {
            return false;
        }
        P2PContext p2PContext = (P2PContext) other;
        return Intrinsics.areEqual(unknownFields(), p2PContext.unknownFields()) && this.direction == p2PContext.direction && this.target_type == p2PContext.target_type && this.amount == p2PContext.amount && Intrinsics.areEqual(this.search_query, p2PContext.search_query) && Intrinsics.areEqual(this.target_types, p2PContext.target_types);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.direction.hashCode()) * 37) + this.target_type.hashCode()) * 37) + Float.hashCode(this.amount)) * 37) + this.search_query.hashCode()) * 37) + this.target_types.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("direction=" + this.direction);
        arrayList.add("target_type=" + this.target_type);
        arrayList.add("amount=" + this.amount);
        arrayList.add("search_query=" + Internal.sanitize(this.search_query));
        if (!this.target_types.isEmpty()) {
            arrayList.add("target_types=" + this.target_types);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2PContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ P2PContext copy$default(P2PContext p2PContext, Direction direction, TargetType targetType, float f, String str, java.util.List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            direction = p2PContext.direction;
        }
        if ((i & 2) != 0) {
            targetType = p2PContext.target_type;
        }
        if ((i & 4) != 0) {
            f = p2PContext.amount;
        }
        if ((i & 8) != 0) {
            str = p2PContext.search_query;
        }
        if ((i & 16) != 0) {
            list = p2PContext.target_types;
        }
        if ((i & 32) != 0) {
            byteString = p2PContext.unknownFields();
        }
        java.util.List list2 = list;
        ByteString byteString2 = byteString;
        return p2PContext.copy(direction, targetType, f, str, list2, byteString2);
    }

    public final P2PContext copy(Direction direction, TargetType target_type, float amount, String search_query, java.util.List<? extends TargetType> target_types, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(target_type, "target_type");
        Intrinsics.checkNotNullParameter(search_query, "search_query");
        Intrinsics.checkNotNullParameter(target_types, "target_types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new P2PContext(direction, target_type, amount, search_query, target_types, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(P2PContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<P2PContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.P2PContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(P2PContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDirection() != P2PContext.Direction.DIRECTION_UNSPECIFIED) {
                    size += P2PContext.Direction.ADAPTER.encodedSizeWithTag(1, value.getDirection());
                }
                if (value.getTarget_type() != P2PContext.TargetType.TARGET_TYPE_UNSPECIFIED) {
                    size += P2PContext.TargetType.ADAPTER.encodedSizeWithTag(2, value.getTarget_type());
                }
                if (!Float.valueOf(value.getAmount()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getSearch_query(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSearch_query());
                }
                return size + P2PContext.TargetType.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getTarget_types());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, P2PContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDirection() != P2PContext.Direction.DIRECTION_UNSPECIFIED) {
                    P2PContext.Direction.ADAPTER.encodeWithTag(writer, 1, (int) value.getDirection());
                }
                if (value.getTarget_type() != P2PContext.TargetType.TARGET_TYPE_UNSPECIFIED) {
                    P2PContext.TargetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTarget_type());
                }
                if (!Float.valueOf(value.getAmount()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getSearch_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSearch_query());
                }
                P2PContext.TargetType.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getTarget_types());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, P2PContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<P2PContext.TargetType> protoAdapter = P2PContext.TargetType.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getTarget_types());
                if (!Intrinsics.areEqual(value.getSearch_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSearch_query());
                }
                if (!Float.valueOf(value.getAmount()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getAmount()));
                }
                if (value.getTarget_type() != P2PContext.TargetType.TARGET_TYPE_UNSPECIFIED) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTarget_type());
                }
                if (value.getDirection() != P2PContext.Direction.DIRECTION_UNSPECIFIED) {
                    P2PContext.Direction.ADAPTER.encodeWithTag(writer, 1, (int) value.getDirection());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public P2PContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                P2PContext.Direction directionDecode = P2PContext.Direction.DIRECTION_UNSPECIFIED;
                P2PContext.TargetType targetType = P2PContext.TargetType.TARGET_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                P2PContext.TargetType targetTypeDecode = targetType;
                while (true) {
                    P2PContext.Direction direction = directionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new P2PContext(direction, targetTypeDecode, fFloatValue, strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                directionDecode = P2PContext.Direction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                targetTypeDecode = P2PContext.TargetType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                P2PContext.TargetType.ADAPTER.tryDecode(reader, arrayList);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public P2PContext redact(P2PContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return P2PContext.copy$default(value, null, null, 0.0f, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: P2PContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECTION_UNSPECIFIED", "PAY", "REQUEST", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Direction> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction DIRECTION_UNSPECIFIED;
        public static final Direction PAY;
        public static final Direction REQUEST;
        private final int value;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{DIRECTION_UNSPECIFIED, PAY, REQUEST};
        }

        @JvmStatic
        public static final Direction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Direction direction = new Direction("DIRECTION_UNSPECIFIED", 0, 0);
            DIRECTION_UNSPECIFIED = direction;
            PAY = new Direction("PAY", 1, 1);
            REQUEST = new Direction("REQUEST", 2, 2);
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Direction.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Direction>(orCreateKotlinClass, syntax, direction) { // from class: com.robinhood.rosetta.eventlogging.P2PContext$Direction$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public P2PContext.Direction fromValue(int value) {
                    return P2PContext.Direction.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: P2PContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Direction fromValue(int value) {
                if (value == 0) {
                    return Direction.DIRECTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return Direction.PAY;
                }
                if (value != 2) {
                    return null;
                }
                return Direction.REQUEST;
            }
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: P2PContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TARGET_TYPE_UNSPECIFIED", "RH_USER", "CONNECTION", "OFF_NETWORK_EMAIL", "OFF_NETWORK_PHONE", "CONTACT_PHONE", "CONTACT_EMAIL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TargetType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TargetType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TargetType> ADAPTER;
        public static final TargetType CONNECTION;
        public static final TargetType CONTACT_EMAIL;
        public static final TargetType CONTACT_PHONE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TargetType OFF_NETWORK_EMAIL;
        public static final TargetType OFF_NETWORK_PHONE;
        public static final TargetType RH_USER;
        public static final TargetType TARGET_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TargetType[] $values() {
            return new TargetType[]{TARGET_TYPE_UNSPECIFIED, RH_USER, CONNECTION, OFF_NETWORK_EMAIL, OFF_NETWORK_PHONE, CONTACT_PHONE, CONTACT_EMAIL};
        }

        @JvmStatic
        public static final TargetType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TargetType> getEntries() {
            return $ENTRIES;
        }

        private TargetType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TargetType targetType = new TargetType("TARGET_TYPE_UNSPECIFIED", 0, 0);
            TARGET_TYPE_UNSPECIFIED = targetType;
            RH_USER = new TargetType("RH_USER", 1, 1);
            CONNECTION = new TargetType("CONNECTION", 2, 2);
            OFF_NETWORK_EMAIL = new TargetType("OFF_NETWORK_EMAIL", 3, 3);
            OFF_NETWORK_PHONE = new TargetType("OFF_NETWORK_PHONE", 4, 4);
            CONTACT_PHONE = new TargetType("CONTACT_PHONE", 5, 5);
            CONTACT_EMAIL = new TargetType("CONTACT_EMAIL", 6, 6);
            TargetType[] targetTypeArr$values = $values();
            $VALUES = targetTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(targetTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TargetType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TargetType>(orCreateKotlinClass, syntax, targetType) { // from class: com.robinhood.rosetta.eventlogging.P2PContext$TargetType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public P2PContext.TargetType fromValue(int value) {
                    return P2PContext.TargetType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: P2PContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TargetType fromValue(int value) {
                switch (value) {
                    case 0:
                        return TargetType.TARGET_TYPE_UNSPECIFIED;
                    case 1:
                        return TargetType.RH_USER;
                    case 2:
                        return TargetType.CONNECTION;
                    case 3:
                        return TargetType.OFF_NETWORK_EMAIL;
                    case 4:
                        return TargetType.OFF_NETWORK_PHONE;
                    case 5:
                        return TargetType.CONTACT_PHONE;
                    case 6:
                        return TargetType.CONTACT_EMAIL;
                    default:
                        return null;
                }
            }
        }

        public static TargetType valueOf(String str) {
            return (TargetType) Enum.valueOf(TargetType.class, str);
        }

        public static TargetType[] values() {
            return (TargetType[]) $VALUES.clone();
        }
    }
}
