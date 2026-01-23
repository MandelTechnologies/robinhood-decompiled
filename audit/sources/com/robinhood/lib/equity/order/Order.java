package com.robinhood.lib.equity.order;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.datasource.bonfire.models.Money;
import microgram.datasource.bonfire.models.Money7;
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: Order.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002UVBÃ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u001d\u0010\n\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u001f\b\u0001\u0010\u0015\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fB\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001d\u0010\n\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u001d\u0010\u0015\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010 J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010?\u001a\u00020\u001cHÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J \u0010B\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u0011HÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J \u0010F\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017HÆ\u0003Jµ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001f\b\u0002\u0010\n\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u001f\b\u0002\u0010\u0015\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0013\u0010I\u001a\u00020\u001c2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0003HÖ\u0001J\t\u0010L\u001a\u00020\u0005HÖ\u0001J&\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00002\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SHÁ\u0001¢\u0006\u0002\bTR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010*\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001c\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\"\u001a\u0004\b\u001b\u0010+R3\u0010\u0015\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\"\u001a\u0004\b.\u0010/R(\u0010\n\u001a\u0019\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\"\u001a\u0004\b6\u00107R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006W"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/Order;", "", "seen1", "", "id", "", "state", "Lcom/robinhood/lib/equity/order/OrderState;", "side", "Lcom/robinhood/lib/equity/order/OrderSide;", "quantity", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "trigger", "Lcom/robinhood/lib/equity/order/OrderTrigger;", "type", "Lcom/robinhood/lib/equity/order/OrderType;", "instrument", "presetPercentLimit", "trailingPeg", "Lcom/robinhood/lib/equity/order/OrderTrailingPeg;", "dollarBasedAmount", "Lmicrogram/datasource/bonfire/models/Money;", "executedNotional", "isIpoAccessOrder", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/lib/equity/order/OrderState;Lcom/robinhood/lib/equity/order/OrderSide;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/lib/equity/order/OrderTrigger;Lcom/robinhood/lib/equity/order/OrderType;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/lib/equity/order/OrderTrailingPeg;Lmicrogram/datasource/bonfire/models/Money;Lmicrogram/datasource/bonfire/models/Money;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/robinhood/lib/equity/order/OrderState;Lcom/robinhood/lib/equity/order/OrderSide;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/lib/equity/order/OrderTrigger;Lcom/robinhood/lib/equity/order/OrderType;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/lib/equity/order/OrderTrailingPeg;Lmicrogram/datasource/bonfire/models/Money;Lmicrogram/datasource/bonfire/models/Money;Z)V", "getDollarBasedAmount$annotations", "()V", "getDollarBasedAmount", "()Lmicrogram/datasource/bonfire/models/Money;", "getExecutedNotional$annotations", "getExecutedNotional", "getId", "()Ljava/lang/String;", "getInstrument", "isDollarBased", "()Z", "isIpoAccessOrder$annotations", "getPresetPercentLimit$annotations", "getPresetPercentLimit", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getQuantity", "getSide", "()Lcom/robinhood/lib/equity/order/OrderSide;", "getState", "()Lcom/robinhood/lib/equity/order/OrderState;", "getTrailingPeg$annotations", "getTrailingPeg", "()Lcom/robinhood/lib/equity/order/OrderTrailingPeg;", "getTrigger", "()Lcom/robinhood/lib/equity/order/OrderTrigger;", "getType", "()Lcom/robinhood/lib/equity/order/OrderType;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_equity_store", "$serializer", "Companion", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes27.dex */
public final /* data */ class Order {
    private final Money dollarBasedAmount;
    private final Money executedNotional;
    private final String id;
    private final String instrument;
    private final boolean isIpoAccessOrder;
    private final BigDecimal presetPercentLimit;
    private final BigDecimal quantity;
    private final OrderSide side;
    private final OrderState state;
    private final OrderTrailingPeg trailingPeg;
    private final OrderTrigger trigger;
    private final OrderType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, OrderState.INSTANCE.serializer(), OrderSide.INSTANCE.serializer(), null, OrderTrigger.INSTANCE.serializer(), OrderType.INSTANCE.serializer(), null, null, null, null, null, null};

    public static /* synthetic */ Order copy$default(Order order, String str, OrderState orderState, OrderSide orderSide, BigDecimal bigDecimal, OrderTrigger orderTrigger, OrderType orderType, String str2, BigDecimal bigDecimal2, OrderTrailingPeg orderTrailingPeg, Money money, Money money2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = order.id;
        }
        if ((i & 2) != 0) {
            orderState = order.state;
        }
        if ((i & 4) != 0) {
            orderSide = order.side;
        }
        if ((i & 8) != 0) {
            bigDecimal = order.quantity;
        }
        if ((i & 16) != 0) {
            orderTrigger = order.trigger;
        }
        if ((i & 32) != 0) {
            orderType = order.type;
        }
        if ((i & 64) != 0) {
            str2 = order.instrument;
        }
        if ((i & 128) != 0) {
            bigDecimal2 = order.presetPercentLimit;
        }
        if ((i & 256) != 0) {
            orderTrailingPeg = order.trailingPeg;
        }
        if ((i & 512) != 0) {
            money = order.dollarBasedAmount;
        }
        if ((i & 1024) != 0) {
            money2 = order.executedNotional;
        }
        if ((i & 2048) != 0) {
            z = order.isIpoAccessOrder;
        }
        Money money3 = money2;
        boolean z2 = z;
        OrderTrailingPeg orderTrailingPeg2 = orderTrailingPeg;
        Money money4 = money;
        String str3 = str2;
        BigDecimal bigDecimal3 = bigDecimal2;
        OrderTrigger orderTrigger2 = orderTrigger;
        OrderType orderType2 = orderType;
        return order.copy(str, orderState, orderSide, bigDecimal, orderTrigger2, orderType2, str3, bigDecimal3, orderTrailingPeg2, money4, money3, z2);
    }

    @SerialName("dollar_based_amount")
    public static /* synthetic */ void getDollarBasedAmount$annotations() {
    }

    @SerialName("executed_notional")
    public static /* synthetic */ void getExecutedNotional$annotations() {
    }

    @SerialName("preset_percent_limit")
    public static /* synthetic */ void getPresetPercentLimit$annotations() {
    }

    @SerialName("trailing_peg")
    public static /* synthetic */ void getTrailingPeg$annotations() {
    }

    @SerialName("is_ipo_access_order")
    public static /* synthetic */ void isIpoAccessOrder$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Money getDollarBasedAmount() {
        return this.dollarBasedAmount;
    }

    /* renamed from: component11, reason: from getter */
    public final Money getExecutedNotional() {
        return this.executedNotional;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsIpoAccessOrder() {
        return this.isIpoAccessOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderType getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getPresetPercentLimit() {
        return this.presetPercentLimit;
    }

    /* renamed from: component9, reason: from getter */
    public final OrderTrailingPeg getTrailingPeg() {
        return this.trailingPeg;
    }

    public final Order copy(String id, OrderState state, OrderSide side, BigDecimal quantity, OrderTrigger trigger, OrderType type2, String instrument, BigDecimal presetPercentLimit, OrderTrailingPeg trailingPeg, Money dollarBasedAmount, Money executedNotional, boolean isIpoAccessOrder) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new Order(id, state, side, quantity, trigger, type2, instrument, presetPercentLimit, trailingPeg, dollarBasedAmount, executedNotional, isIpoAccessOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order order = (Order) other;
        return Intrinsics.areEqual(this.id, order.id) && this.state == order.state && this.side == order.side && Intrinsics.areEqual(this.quantity, order.quantity) && this.trigger == order.trigger && this.type == order.type && Intrinsics.areEqual(this.instrument, order.instrument) && Intrinsics.areEqual(this.presetPercentLimit, order.presetPercentLimit) && Intrinsics.areEqual(this.trailingPeg, order.trailingPeg) && Intrinsics.areEqual(this.dollarBasedAmount, order.dollarBasedAmount) && Intrinsics.areEqual(this.executedNotional, order.executedNotional) && this.isIpoAccessOrder == order.isIpoAccessOrder;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.side.hashCode()) * 31;
        BigDecimal bigDecimal = this.quantity;
        int iHashCode2 = (((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.trigger.hashCode()) * 31) + this.type.hashCode()) * 31) + this.instrument.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.presetPercentLimit;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        OrderTrailingPeg orderTrailingPeg = this.trailingPeg;
        int iHashCode4 = (iHashCode3 + (orderTrailingPeg == null ? 0 : orderTrailingPeg.hashCode())) * 31;
        Money money = this.dollarBasedAmount;
        int iHashCode5 = (iHashCode4 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.executedNotional;
        return ((iHashCode5 + (money2 != null ? money2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isIpoAccessOrder);
    }

    public String toString() {
        return "Order(id=" + this.id + ", state=" + this.state + ", side=" + this.side + ", quantity=" + this.quantity + ", trigger=" + this.trigger + ", type=" + this.type + ", instrument=" + this.instrument + ", presetPercentLimit=" + this.presetPercentLimit + ", trailingPeg=" + this.trailingPeg + ", dollarBasedAmount=" + this.dollarBasedAmount + ", executedNotional=" + this.executedNotional + ", isIpoAccessOrder=" + this.isIpoAccessOrder + ")";
    }

    /* compiled from: Order.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/Order$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/lib/equity/order/Order;", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Order> serializer() {
            return Order2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ Order(int i, String str, OrderState orderState, OrderSide orderSide, BigDecimal bigDecimal, OrderTrigger orderTrigger, OrderType orderType, String str2, @SerialName("preset_percent_limit") BigDecimal bigDecimal2, @SerialName("trailing_peg") OrderTrailingPeg orderTrailingPeg, @SerialName("dollar_based_amount") Money money, @SerialName("executed_notional") Money money2, @SerialName("is_ipo_access_order") boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & 4095)) {
            PluginExceptions.throwMissingFieldException(i, 4095, Order2.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.state = orderState;
        this.side = orderSide;
        this.quantity = bigDecimal;
        this.trigger = orderTrigger;
        this.type = orderType;
        this.instrument = str2;
        this.presetPercentLimit = bigDecimal2;
        this.trailingPeg = orderTrailingPeg;
        this.dollarBasedAmount = money;
        this.executedNotional = money2;
        this.isIpoAccessOrder = z;
    }

    public Order(String id, OrderState state, OrderSide side, BigDecimal bigDecimal, OrderTrigger trigger, OrderType type2, String instrument, BigDecimal bigDecimal2, OrderTrailingPeg orderTrailingPeg, Money money, Money money2, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.id = id;
        this.state = state;
        this.side = side;
        this.quantity = bigDecimal;
        this.trigger = trigger;
        this.type = type2;
        this.instrument = instrument;
        this.presetPercentLimit = bigDecimal2;
        this.trailingPeg = orderTrailingPeg;
        this.dollarBasedAmount = money;
        this.executedNotional = money2;
        this.isIpoAccessOrder = z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_equity_store(Order self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.state);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.side);
        BigDecimalSerializer bigDecimalSerializer = BigDecimalSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, bigDecimalSerializer, self.quantity);
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.trigger);
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.type);
        output.encodeStringElement(serialDesc, 6, self.instrument);
        output.encodeNullableSerializableElement(serialDesc, 7, bigDecimalSerializer, self.presetPercentLimit);
        output.encodeNullableSerializableElement(serialDesc, 8, OrderTrailingPeg2.INSTANCE, self.trailingPeg);
        Money7 money7 = Money7.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 9, money7, self.dollarBasedAmount);
        output.encodeNullableSerializableElement(serialDesc, 10, money7, self.executedNotional);
        output.encodeBooleanElement(serialDesc, 11, self.isIpoAccessOrder);
    }

    public final String getId() {
        return this.id;
    }

    public final OrderState getState() {
        return this.state;
    }

    public final OrderSide getSide() {
        return this.side;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final String getInstrument() {
        return this.instrument;
    }

    public final BigDecimal getPresetPercentLimit() {
        return this.presetPercentLimit;
    }

    public final OrderTrailingPeg getTrailingPeg() {
        return this.trailingPeg;
    }

    public final Money getDollarBasedAmount() {
        return this.dollarBasedAmount;
    }

    public final Money getExecutedNotional() {
        return this.executedNotional;
    }

    public final boolean isIpoAccessOrder() {
        return this.isIpoAccessOrder;
    }

    public final boolean isDollarBased() {
        return this.dollarBasedAmount != null;
    }
}
