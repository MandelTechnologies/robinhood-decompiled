package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.WiresContext;
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

/* compiled from: WiresContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WiresContext;", "Lcom/squareup/wire/Message;", "", "direction", "Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;", "entry_point", "Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;", "wire_type", "Lcom/robinhood/rosetta/eventlogging/WiresContext$WireType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;Lcom/robinhood/rosetta/eventlogging/WiresContext$WireType;Lokio/ByteString;)V", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;", "getWire_type", "()Lcom/robinhood/rosetta/eventlogging/WiresContext$WireType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "WiresDirection", "EntryPoint", "WireType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class WiresContext extends Message {

    @JvmField
    public static final ProtoAdapter<WiresContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WiresContext$WiresDirection#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final WiresDirection direction;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WiresContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WiresContext$WireType#ADAPTER", jsonName = "wireType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final WireType wire_type;

    public WiresContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24612newBuilder();
    }

    public final WiresDirection getDirection() {
        return this.direction;
    }

    public /* synthetic */ WiresContext(WiresDirection wiresDirection, EntryPoint entryPoint, WireType wireType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WiresDirection.WIRES_DIRECTION_UNSPECIFIED : wiresDirection, (i & 2) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 4) != 0 ? WireType.WIRE_TYPE_UNSPECIFIED : wireType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final WireType getWire_type() {
        return this.wire_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WiresContext(WiresDirection direction, EntryPoint entry_point, WireType wire_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(wire_type, "wire_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.direction = direction;
        this.entry_point = entry_point;
        this.wire_type = wire_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24612newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WiresContext)) {
            return false;
        }
        WiresContext wiresContext = (WiresContext) other;
        return Intrinsics.areEqual(unknownFields(), wiresContext.unknownFields()) && this.direction == wiresContext.direction && this.entry_point == wiresContext.entry_point && this.wire_type == wiresContext.wire_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.direction.hashCode()) * 37) + this.entry_point.hashCode()) * 37) + this.wire_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("direction=" + this.direction);
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("wire_type=" + this.wire_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "WiresContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WiresContext copy$default(WiresContext wiresContext, WiresDirection wiresDirection, EntryPoint entryPoint, WireType wireType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            wiresDirection = wiresContext.direction;
        }
        if ((i & 2) != 0) {
            entryPoint = wiresContext.entry_point;
        }
        if ((i & 4) != 0) {
            wireType = wiresContext.wire_type;
        }
        if ((i & 8) != 0) {
            byteString = wiresContext.unknownFields();
        }
        return wiresContext.copy(wiresDirection, entryPoint, wireType, byteString);
    }

    public final WiresContext copy(WiresDirection direction, EntryPoint entry_point, WireType wire_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(wire_type, "wire_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WiresContext(direction, entry_point, wire_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WiresContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WiresContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.WiresContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WiresContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDirection() != WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED) {
                    size += WiresContext.WiresDirection.ADAPTER.encodedSizeWithTag(1, value.getDirection());
                }
                if (value.getEntry_point() != WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    size += WiresContext.EntryPoint.ADAPTER.encodedSizeWithTag(2, value.getEntry_point());
                }
                return value.getWire_type() != WiresContext.WireType.WIRE_TYPE_UNSPECIFIED ? size + WiresContext.WireType.ADAPTER.encodedSizeWithTag(3, value.getWire_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WiresContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDirection() != WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED) {
                    WiresContext.WiresDirection.ADAPTER.encodeWithTag(writer, 1, (int) value.getDirection());
                }
                if (value.getEntry_point() != WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    WiresContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
                if (value.getWire_type() != WiresContext.WireType.WIRE_TYPE_UNSPECIFIED) {
                    WiresContext.WireType.ADAPTER.encodeWithTag(writer, 3, (int) value.getWire_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WiresContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getWire_type() != WiresContext.WireType.WIRE_TYPE_UNSPECIFIED) {
                    WiresContext.WireType.ADAPTER.encodeWithTag(writer, 3, (int) value.getWire_type());
                }
                if (value.getEntry_point() != WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    WiresContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
                if (value.getDirection() != WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED) {
                    WiresContext.WiresDirection.ADAPTER.encodeWithTag(writer, 1, (int) value.getDirection());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WiresContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                WiresContext.WiresDirection wiresDirectionDecode = WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED;
                WiresContext.EntryPoint entryPointDecode = WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                WiresContext.WireType wireTypeDecode = WiresContext.WireType.WIRE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WiresContext(wiresDirectionDecode, entryPointDecode, wireTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            wiresDirectionDecode = WiresContext.WiresDirection.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            entryPointDecode = WiresContext.EntryPoint.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            wireTypeDecode = WiresContext.WireType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WiresContext redact(WiresContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return WiresContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WiresContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WIRES_DIRECTION_UNSPECIFIED", "INCOMING", "OUTGOING", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WiresDirection implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WiresDirection[] $VALUES;

        @JvmField
        public static final ProtoAdapter<WiresDirection> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final WiresDirection INCOMING;
        public static final WiresDirection OUTGOING;
        public static final WiresDirection WIRES_DIRECTION_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ WiresDirection[] $values() {
            return new WiresDirection[]{WIRES_DIRECTION_UNSPECIFIED, INCOMING, OUTGOING};
        }

        @JvmStatic
        public static final WiresDirection fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<WiresDirection> getEntries() {
            return $ENTRIES;
        }

        private WiresDirection(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final WiresDirection wiresDirection = new WiresDirection("WIRES_DIRECTION_UNSPECIFIED", 0, 0);
            WIRES_DIRECTION_UNSPECIFIED = wiresDirection;
            INCOMING = new WiresDirection("INCOMING", 1, 1);
            OUTGOING = new WiresDirection("OUTGOING", 2, 2);
            WiresDirection[] wiresDirectionArr$values = $values();
            $VALUES = wiresDirectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(wiresDirectionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WiresDirection.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<WiresDirection>(orCreateKotlinClass, syntax, wiresDirection) { // from class: com.robinhood.rosetta.eventlogging.WiresContext$WiresDirection$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WiresContext.WiresDirection fromValue(int value) {
                    return WiresContext.WiresDirection.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WiresContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WiresContext$WiresDirection;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final WiresDirection fromValue(int value) {
                if (value == 0) {
                    return WiresDirection.WIRES_DIRECTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return WiresDirection.INCOMING;
                }
                if (value != 2) {
                    return null;
                }
                return WiresDirection.OUTGOING;
            }
        }

        public static WiresDirection valueOf(String str) {
            return (WiresDirection) Enum.valueOf(WiresDirection.class, str);
        }

        public static WiresDirection[] values() {
            return (WiresDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WiresContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "TRANSFERS_HUB", "TRANSFER_ACCOUNT_SELECTION", "LIMITS_HUB_ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint LIMITS_HUB_ERROR;
        public static final EntryPoint TRANSFERS_HUB;
        public static final EntryPoint TRANSFER_ACCOUNT_SELECTION;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, TRANSFERS_HUB, TRANSFER_ACCOUNT_SELECTION, LIMITS_HUB_ERROR};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_UNSPECIFIED", 0, 0);
            ENTRY_POINT_UNSPECIFIED = entryPoint;
            TRANSFERS_HUB = new EntryPoint("TRANSFERS_HUB", 1, 1);
            TRANSFER_ACCOUNT_SELECTION = new EntryPoint("TRANSFER_ACCOUNT_SELECTION", 2, 2);
            LIMITS_HUB_ERROR = new EntryPoint("LIMITS_HUB_ERROR", 3, 3);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.WiresContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WiresContext.EntryPoint fromValue(int value) {
                    return WiresContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WiresContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WiresContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                if (value == 0) {
                    return EntryPoint.ENTRY_POINT_UNSPECIFIED;
                }
                if (value == 1) {
                    return EntryPoint.TRANSFERS_HUB;
                }
                if (value == 2) {
                    return EntryPoint.TRANSFER_ACCOUNT_SELECTION;
                }
                if (value != 3) {
                    return null;
                }
                return EntryPoint.LIMITS_HUB_ERROR;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WiresContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WiresContext$WireType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WIRE_TYPE_UNSPECIFIED", "FIRST_PARTY", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WireType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WireType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<WireType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final WireType FIRST_PARTY;
        public static final WireType WIRE_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ WireType[] $values() {
            return new WireType[]{WIRE_TYPE_UNSPECIFIED, FIRST_PARTY};
        }

        @JvmStatic
        public static final WireType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<WireType> getEntries() {
            return $ENTRIES;
        }

        private WireType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final WireType wireType = new WireType("WIRE_TYPE_UNSPECIFIED", 0, 0);
            WIRE_TYPE_UNSPECIFIED = wireType;
            FIRST_PARTY = new WireType("FIRST_PARTY", 1, 1);
            WireType[] wireTypeArr$values = $values();
            $VALUES = wireTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(wireTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WireType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<WireType>(orCreateKotlinClass, syntax, wireType) { // from class: com.robinhood.rosetta.eventlogging.WiresContext$WireType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WiresContext.WireType fromValue(int value) {
                    return WiresContext.WireType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WiresContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WiresContext$WireType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WiresContext$WireType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final WireType fromValue(int value) {
                if (value == 0) {
                    return WireType.WIRE_TYPE_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return WireType.FIRST_PARTY;
            }
        }

        public static WireType valueOf(String str) {
            return (WireType) Enum.valueOf(WireType.class, str);
        }

        public static WireType[] values() {
            return (WireType[]) $VALUES.clone();
        }
    }
}
