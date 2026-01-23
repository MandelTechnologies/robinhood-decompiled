package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext;
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

/* compiled from: FuturesOrderButtonContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext;", "Lcom/squareup/wire/Message;", "", "side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$Side;", "order_type", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType;", "enabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$Side;Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType;ZLokio/ByteString;)V", "getSide", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$Side;", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType;", "getEnabled", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "OrderType", "Side", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class FuturesOrderButtonContext extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesOrderButtonContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean enabled;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext$OrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderType order_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext$Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Side side;

    public FuturesOrderButtonContext() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24276newBuilder();
    }

    public final Side getSide() {
        return this.side;
    }

    public /* synthetic */ FuturesOrderButtonContext(Side side, OrderType orderType, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 2) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderButtonContext(Side side, OrderType order_type, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.side = side;
        this.order_type = order_type;
        this.enabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24276newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesOrderButtonContext)) {
            return false;
        }
        FuturesOrderButtonContext futuresOrderButtonContext = (FuturesOrderButtonContext) other;
        return Intrinsics.areEqual(unknownFields(), futuresOrderButtonContext.unknownFields()) && this.side == futuresOrderButtonContext.side && this.order_type == futuresOrderButtonContext.order_type && this.enabled == futuresOrderButtonContext.enabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.side.hashCode()) * 37) + this.order_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.enabled);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("side=" + this.side);
        arrayList.add("order_type=" + this.order_type);
        arrayList.add("enabled=" + this.enabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesOrderButtonContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesOrderButtonContext copy$default(FuturesOrderButtonContext futuresOrderButtonContext, Side side, OrderType orderType, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            side = futuresOrderButtonContext.side;
        }
        if ((i & 2) != 0) {
            orderType = futuresOrderButtonContext.order_type;
        }
        if ((i & 4) != 0) {
            z = futuresOrderButtonContext.enabled;
        }
        if ((i & 8) != 0) {
            byteString = futuresOrderButtonContext.unknownFields();
        }
        return futuresOrderButtonContext.copy(side, orderType, z, byteString);
    }

    public final FuturesOrderButtonContext copy(Side side, OrderType order_type, boolean enabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesOrderButtonContext(side, order_type, enabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesOrderButtonContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesOrderButtonContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesOrderButtonContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSide() != FuturesOrderButtonContext.Side.SIDE_UNSPECIFIED) {
                    size += FuturesOrderButtonContext.Side.ADAPTER.encodedSizeWithTag(1, value.getSide());
                }
                if (value.getOrder_type() != FuturesOrderButtonContext.OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += FuturesOrderButtonContext.OrderType.ADAPTER.encodedSizeWithTag(2, value.getOrder_type());
                }
                return value.getEnabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getEnabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesOrderButtonContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSide() != FuturesOrderButtonContext.Side.SIDE_UNSPECIFIED) {
                    FuturesOrderButtonContext.Side.ADAPTER.encodeWithTag(writer, 1, (int) value.getSide());
                }
                if (value.getOrder_type() != FuturesOrderButtonContext.OrderType.ORDER_TYPE_UNSPECIFIED) {
                    FuturesOrderButtonContext.OrderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_type());
                }
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getEnabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesOrderButtonContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getEnabled()));
                }
                if (value.getOrder_type() != FuturesOrderButtonContext.OrderType.ORDER_TYPE_UNSPECIFIED) {
                    FuturesOrderButtonContext.OrderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_type());
                }
                if (value.getSide() != FuturesOrderButtonContext.Side.SIDE_UNSPECIFIED) {
                    FuturesOrderButtonContext.Side.ADAPTER.encodeWithTag(writer, 1, (int) value.getSide());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderButtonContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                FuturesOrderButtonContext.Side sideDecode = FuturesOrderButtonContext.Side.SIDE_UNSPECIFIED;
                FuturesOrderButtonContext.OrderType orderTypeDecode = FuturesOrderButtonContext.OrderType.ORDER_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesOrderButtonContext(sideDecode, orderTypeDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            sideDecode = FuturesOrderButtonContext.Side.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            orderTypeDecode = FuturesOrderButtonContext.OrderType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderButtonContext redact(FuturesOrderButtonContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FuturesOrderButtonContext.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderButtonContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_TYPE_UNSPECIFIED", "MARKET", "LIMIT", "STOP", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderType LIMIT;
        public static final OrderType MARKET;
        public static final OrderType ORDER_TYPE_UNSPECIFIED;
        public static final OrderType STOP;
        private final int value;

        private static final /* synthetic */ OrderType[] $values() {
            return new OrderType[]{ORDER_TYPE_UNSPECIFIED, MARKET, LIMIT, STOP};
        }

        @JvmStatic
        public static final OrderType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderType> getEntries() {
            return $ENTRIES;
        }

        private OrderType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderType orderType = new OrderType("ORDER_TYPE_UNSPECIFIED", 0, 0);
            ORDER_TYPE_UNSPECIFIED = orderType;
            MARKET = new OrderType("MARKET", 1, 1);
            LIMIT = new OrderType("LIMIT", 2, 2);
            STOP = new OrderType("STOP", 3, 3);
            OrderType[] orderTypeArr$values = $values();
            $VALUES = orderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderType>(orCreateKotlinClass, syntax, orderType) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext$OrderType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesOrderButtonContext.OrderType fromValue(int value) {
                    return FuturesOrderButtonContext.OrderType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesOrderButtonContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$OrderType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderType fromValue(int value) {
                if (value == 0) {
                    return OrderType.ORDER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderType.MARKET;
                }
                if (value == 2) {
                    return OrderType.LIMIT;
                }
                if (value != 3) {
                    return null;
                }
                return OrderType.STOP;
            }
        }

        public static OrderType valueOf(String str) {
            return (OrderType) Enum.valueOf(OrderType.class, str);
        }

        public static OrderType[] values() {
            return (OrderType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderButtonContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$Side;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIDE_UNSPECIFIED", "BUY", "SELL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Side implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Side> ADAPTER;
        public static final Side BUY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Side SELL;
        public static final Side SIDE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Side[] $values() {
            return new Side[]{SIDE_UNSPECIFIED, BUY, SELL};
        }

        @JvmStatic
        public static final Side fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Side> getEntries() {
            return $ENTRIES;
        }

        private Side(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Side side = new Side("SIDE_UNSPECIFIED", 0, 0);
            SIDE_UNSPECIFIED = side;
            BUY = new Side("BUY", 1, 1);
            SELL = new Side("SELL", 2, 2);
            Side[] sideArr$values = $values();
            $VALUES = sideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sideArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Side.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Side>(orCreateKotlinClass, syntax, side) { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext$Side$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public FuturesOrderButtonContext.Side fromValue(int value) {
                    return FuturesOrderButtonContext.Side.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: FuturesOrderButtonContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$Side$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderButtonContext$Side;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Side fromValue(int value) {
                if (value == 0) {
                    return Side.SIDE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Side.BUY;
                }
                if (value != 2) {
                    return null;
                }
                return Side.SELL;
            }
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }
}
