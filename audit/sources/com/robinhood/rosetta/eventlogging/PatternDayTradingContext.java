package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.PatternDayTradingContext;
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

/* compiled from: PatternDayTradingContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003&'(BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext;", "Lcom/squareup/wire/Message;", "", "order_id", "", "order_type", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "portfolio_value", "", "order_has_executed", "", "day_trade_count", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;DZILokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "getPortfolio_value", "()D", "getOrder_has_executed", "()Z", "getDay_trade_count", "()I", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "OrderSide", "OrderType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PatternDayTradingContext extends Message {

    @JvmField
    public static final ProtoAdapter<PatternDayTradingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "dayTradeCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int day_trade_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "orderHasExecuted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean order_has_executed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PatternDayTradingContext$OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OrderSide order_side;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PatternDayTradingContext$OrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "portfolioValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double portfolio_value;

    public PatternDayTradingContext() {
        this(null, null, null, 0.0d, false, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24462newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public /* synthetic */ PatternDayTradingContext(String str, OrderType orderType, OrderSide orderSide, double d, boolean z, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? OrderType.TYPE_UNSPECIFIED : orderType, (i2 & 4) != 0 ? OrderSide.SIDE_UNSPECIFIED : orderSide, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final OrderSide getOrder_side() {
        return this.order_side;
    }

    public final double getPortfolio_value() {
        return this.portfolio_value;
    }

    public final boolean getOrder_has_executed() {
        return this.order_has_executed;
    }

    public final int getDay_trade_count() {
        return this.day_trade_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PatternDayTradingContext(String order_id, OrderType order_type, OrderSide order_side, double d, boolean z, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.order_type = order_type;
        this.order_side = order_side;
        this.portfolio_value = d;
        this.order_has_executed = z;
        this.day_trade_count = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24462newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PatternDayTradingContext)) {
            return false;
        }
        PatternDayTradingContext patternDayTradingContext = (PatternDayTradingContext) other;
        return Intrinsics.areEqual(unknownFields(), patternDayTradingContext.unknownFields()) && Intrinsics.areEqual(this.order_id, patternDayTradingContext.order_id) && this.order_type == patternDayTradingContext.order_type && this.order_side == patternDayTradingContext.order_side && this.portfolio_value == patternDayTradingContext.portfolio_value && this.order_has_executed == patternDayTradingContext.order_has_executed && this.day_trade_count == patternDayTradingContext.day_trade_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.order_type.hashCode()) * 37) + this.order_side.hashCode()) * 37) + Double.hashCode(this.portfolio_value)) * 37) + java.lang.Boolean.hashCode(this.order_has_executed)) * 37) + Integer.hashCode(this.day_trade_count);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("order_type=" + this.order_type);
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("portfolio_value=" + this.portfolio_value);
        arrayList.add("order_has_executed=" + this.order_has_executed);
        arrayList.add("day_trade_count=" + this.day_trade_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PatternDayTradingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PatternDayTradingContext copy$default(PatternDayTradingContext patternDayTradingContext, String str, OrderType orderType, OrderSide orderSide, double d, boolean z, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = patternDayTradingContext.order_id;
        }
        if ((i2 & 2) != 0) {
            orderType = patternDayTradingContext.order_type;
        }
        if ((i2 & 4) != 0) {
            orderSide = patternDayTradingContext.order_side;
        }
        if ((i2 & 8) != 0) {
            d = patternDayTradingContext.portfolio_value;
        }
        if ((i2 & 16) != 0) {
            z = patternDayTradingContext.order_has_executed;
        }
        if ((i2 & 32) != 0) {
            i = patternDayTradingContext.day_trade_count;
        }
        if ((i2 & 64) != 0) {
            byteString = patternDayTradingContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        double d2 = d;
        OrderSide orderSide2 = orderSide;
        return patternDayTradingContext.copy(str, orderType, orderSide2, d2, z2, i, byteString2);
    }

    public final PatternDayTradingContext copy(String order_id, OrderType order_type, OrderSide order_side, double portfolio_value, boolean order_has_executed, int day_trade_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PatternDayTradingContext(order_id, order_type, order_side, portfolio_value, order_has_executed, day_trade_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PatternDayTradingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PatternDayTradingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PatternDayTradingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PatternDayTradingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getOrder_type() != PatternDayTradingContext.OrderType.TYPE_UNSPECIFIED) {
                    size += PatternDayTradingContext.OrderType.ADAPTER.encodedSizeWithTag(2, value.getOrder_type());
                }
                if (value.getOrder_side() != PatternDayTradingContext.OrderSide.SIDE_UNSPECIFIED) {
                    size += PatternDayTradingContext.OrderSide.ADAPTER.encodedSizeWithTag(3, value.getOrder_side());
                }
                if (!Double.valueOf(value.getPortfolio_value()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getPortfolio_value()));
                }
                if (value.getOrder_has_executed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, java.lang.Boolean.valueOf(value.getOrder_has_executed()));
                }
                return value.getDay_trade_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getDay_trade_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PatternDayTradingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getOrder_type() != PatternDayTradingContext.OrderType.TYPE_UNSPECIFIED) {
                    PatternDayTradingContext.OrderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_type());
                }
                if (value.getOrder_side() != PatternDayTradingContext.OrderSide.SIDE_UNSPECIFIED) {
                    PatternDayTradingContext.OrderSide.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_side());
                }
                if (!Double.valueOf(value.getPortfolio_value()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getPortfolio_value()));
                }
                if (value.getOrder_has_executed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getOrder_has_executed()));
                }
                if (value.getDay_trade_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getDay_trade_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PatternDayTradingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDay_trade_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getDay_trade_count()));
                }
                if (value.getOrder_has_executed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getOrder_has_executed()));
                }
                if (!Double.valueOf(value.getPortfolio_value()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getPortfolio_value()));
                }
                if (value.getOrder_side() != PatternDayTradingContext.OrderSide.SIDE_UNSPECIFIED) {
                    PatternDayTradingContext.OrderSide.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_side());
                }
                if (value.getOrder_type() != PatternDayTradingContext.OrderType.TYPE_UNSPECIFIED) {
                    PatternDayTradingContext.OrderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_type());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PatternDayTradingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PatternDayTradingContext.OrderType orderTypeDecode = PatternDayTradingContext.OrderType.TYPE_UNSPECIFIED;
                PatternDayTradingContext.OrderSide orderSide = PatternDayTradingContext.OrderSide.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode = "";
                PatternDayTradingContext.OrderSide orderSideDecode = orderSide;
                while (true) {
                    PatternDayTradingContext.OrderType orderType = orderTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        orderTypeDecode = PatternDayTradingContext.OrderType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        orderSideDecode = PatternDayTradingContext.OrderSide.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 5:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 6:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new PatternDayTradingContext(strDecode, orderType, orderSideDecode, dDoubleValue, zBooleanValue, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PatternDayTradingContext redact(PatternDayTradingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PatternDayTradingContext.copy$default(value, null, null, null, 0.0d, false, 0, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PatternDayTradingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIDE_UNSPECIFIED", "BUY", "SELL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderSide implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderSide[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderSide> ADAPTER;
        public static final OrderSide BUY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderSide SELL;
        public static final OrderSide SIDE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderSide[] $values() {
            return new OrderSide[]{SIDE_UNSPECIFIED, BUY, SELL};
        }

        @JvmStatic
        public static final OrderSide fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderSide> getEntries() {
            return $ENTRIES;
        }

        private OrderSide(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderSide orderSide = new OrderSide("SIDE_UNSPECIFIED", 0, 0);
            SIDE_UNSPECIFIED = orderSide;
            BUY = new OrderSide("BUY", 1, 1);
            SELL = new OrderSide("SELL", 2, 2);
            OrderSide[] orderSideArr$values = $values();
            $VALUES = orderSideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderSideArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSide.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderSide>(orCreateKotlinClass, syntax, orderSide) { // from class: com.robinhood.rosetta.eventlogging.PatternDayTradingContext$OrderSide$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PatternDayTradingContext.OrderSide fromValue(int value) {
                    return PatternDayTradingContext.OrderSide.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PatternDayTradingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderSide;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderSide fromValue(int value) {
                if (value == 0) {
                    return OrderSide.SIDE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderSide.BUY;
                }
                if (value != 2) {
                    return null;
                }
                return OrderSide.SELL;
            }
        }

        public static OrderSide valueOf(String str) {
            return (OrderSide) Enum.valueOf(OrderSide.class, str);
        }

        public static OrderSide[] values() {
            return (OrderSide[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PatternDayTradingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "EQUITIES", "OPTIONS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderType EQUITIES;
        public static final OrderType OPTIONS;
        public static final OrderType TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderType[] $values() {
            return new OrderType[]{TYPE_UNSPECIFIED, EQUITIES, OPTIONS};
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
            final OrderType orderType = new OrderType("TYPE_UNSPECIFIED", 0, 0);
            TYPE_UNSPECIFIED = orderType;
            EQUITIES = new OrderType("EQUITIES", 1, 1);
            OPTIONS = new OrderType("OPTIONS", 2, 2);
            OrderType[] orderTypeArr$values = $values();
            $VALUES = orderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderType>(orCreateKotlinClass, syntax, orderType) { // from class: com.robinhood.rosetta.eventlogging.PatternDayTradingContext$OrderType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PatternDayTradingContext.OrderType fromValue(int value) {
                    return PatternDayTradingContext.OrderType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PatternDayTradingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PatternDayTradingContext$OrderType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderType fromValue(int value) {
                if (value == 0) {
                    return OrderType.TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderType.EQUITIES;
                }
                if (value != 2) {
                    return null;
                }
                return OrderType.OPTIONS;
            }
        }

        public static OrderType valueOf(String str) {
            return (OrderType) Enum.valueOf(OrderType.class, str);
        }

        public static OrderType[] values() {
            return (OrderType[]) $VALUES.clone();
        }
    }
}
