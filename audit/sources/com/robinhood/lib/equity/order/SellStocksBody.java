package com.robinhood.lib.equity.order;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import kotlin.Deprecated;
import kotlin.Metadata;
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
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: SellStocks.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABB¬\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001d\u0010\u0004\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019B\u0086\u0001\u0012\u0019\u0010\u0004\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0002\u0010\u001aJ\u001c\u0010(\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÂ\u0003J\t\u0010*\u001a\u00020\u0015HÂ\u0003J\t\u0010+\u001a\u00020\u000bHÂ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÂ\u0003J\t\u00101\u001a\u00020\u000bHÂ\u0003J\t\u00102\u001a\u00020\u0003HÂ\u0003J\t\u00103\u001a\u00020\u000bHÂ\u0003J\u0094\u0001\u00104\u001a\u00020\u00002\u001b\b\u0002\u0010\u0004\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000bHÆ\u0001J\u0013\u00105\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001J&\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?HÁ\u0001¢\u0006\u0002\b@R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u001eR$\u0010\u0004\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u001cR\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b'\u0010\u001eR\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/SellStocksBody;", "", "seen1", "", "quantity", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "symbol", "", "account", "instrument", "refId", "type", "trigger", "orderFormVersion", "timeInForce", "marketHours", "extended_hours", "", "side", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "getExtended_hours$annotations", "()V", "getInstrument", "getMarketHours$annotations", "getOrderFormVersion$annotations", "getQuantity", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getRefId$annotations", "getRefId", "getSymbol", "getTimeInForce$annotations", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lib_equity_store", "$serializer", "Companion", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes27.dex */
public final /* data */ class SellStocksBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String account;
    private final boolean extended_hours;
    private final String instrument;
    private final String marketHours;
    private final int orderFormVersion;
    private final BigDecimal quantity;
    private final String refId;
    private final String side;
    private final String symbol;
    private final String timeInForce;
    private final String trigger;
    private final String type;

    /* renamed from: component10, reason: from getter */
    private final String getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getExtended_hours() {
        return this.extended_hours;
    }

    /* renamed from: component12, reason: from getter */
    private final String getSide() {
        return this.side;
    }

    /* renamed from: component6, reason: from getter */
    private final String getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    private final String getTrigger() {
        return this.trigger;
    }

    /* renamed from: component8, reason: from getter */
    private final int getOrderFormVersion() {
        return this.orderFormVersion;
    }

    /* renamed from: component9, reason: from getter */
    private final String getTimeInForce() {
        return this.timeInForce;
    }

    public static /* synthetic */ SellStocksBody copy$default(SellStocksBody sellStocksBody, BigDecimal bigDecimal, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, String str9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = sellStocksBody.quantity;
        }
        if ((i2 & 2) != 0) {
            str = sellStocksBody.symbol;
        }
        if ((i2 & 4) != 0) {
            str2 = sellStocksBody.account;
        }
        if ((i2 & 8) != 0) {
            str3 = sellStocksBody.instrument;
        }
        if ((i2 & 16) != 0) {
            str4 = sellStocksBody.refId;
        }
        if ((i2 & 32) != 0) {
            str5 = sellStocksBody.type;
        }
        if ((i2 & 64) != 0) {
            str6 = sellStocksBody.trigger;
        }
        if ((i2 & 128) != 0) {
            i = sellStocksBody.orderFormVersion;
        }
        if ((i2 & 256) != 0) {
            str7 = sellStocksBody.timeInForce;
        }
        if ((i2 & 512) != 0) {
            str8 = sellStocksBody.marketHours;
        }
        if ((i2 & 1024) != 0) {
            z = sellStocksBody.extended_hours;
        }
        if ((i2 & 2048) != 0) {
            str9 = sellStocksBody.side;
        }
        boolean z2 = z;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str6;
        int i3 = i;
        String str14 = str4;
        String str15 = str5;
        return sellStocksBody.copy(bigDecimal, str, str2, str3, str14, str15, str13, i3, str11, str12, z2, str10);
    }

    @SerialName("extended_hours")
    private static /* synthetic */ void getExtended_hours$annotations() {
    }

    @SerialName("market_hours")
    private static /* synthetic */ void getMarketHours$annotations() {
    }

    @SerialName("order_form_version")
    private static /* synthetic */ void getOrderFormVersion$annotations() {
    }

    @SerialName("ref_id")
    public static /* synthetic */ void getRefId$annotations() {
    }

    @SerialName("time_in_force")
    private static /* synthetic */ void getTimeInForce$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRefId() {
        return this.refId;
    }

    public final SellStocksBody copy(BigDecimal quantity, String symbol, String account, String instrument, String refId, String type2, String trigger, int orderFormVersion, String timeInForce, String marketHours, boolean extended_hours, String side) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        Intrinsics.checkNotNullParameter(side, "side");
        return new SellStocksBody(quantity, symbol, account, instrument, refId, type2, trigger, orderFormVersion, timeInForce, marketHours, extended_hours, side);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellStocksBody)) {
            return false;
        }
        SellStocksBody sellStocksBody = (SellStocksBody) other;
        return Intrinsics.areEqual(this.quantity, sellStocksBody.quantity) && Intrinsics.areEqual(this.symbol, sellStocksBody.symbol) && Intrinsics.areEqual(this.account, sellStocksBody.account) && Intrinsics.areEqual(this.instrument, sellStocksBody.instrument) && Intrinsics.areEqual(this.refId, sellStocksBody.refId) && Intrinsics.areEqual(this.type, sellStocksBody.type) && Intrinsics.areEqual(this.trigger, sellStocksBody.trigger) && this.orderFormVersion == sellStocksBody.orderFormVersion && Intrinsics.areEqual(this.timeInForce, sellStocksBody.timeInForce) && Intrinsics.areEqual(this.marketHours, sellStocksBody.marketHours) && this.extended_hours == sellStocksBody.extended_hours && Intrinsics.areEqual(this.side, sellStocksBody.side);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.quantity.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.account.hashCode()) * 31) + this.instrument.hashCode()) * 31) + this.refId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.trigger.hashCode()) * 31) + Integer.hashCode(this.orderFormVersion)) * 31) + this.timeInForce.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + Boolean.hashCode(this.extended_hours)) * 31) + this.side.hashCode();
    }

    public String toString() {
        return "SellStocksBody(quantity=" + this.quantity + ", symbol=" + this.symbol + ", account=" + this.account + ", instrument=" + this.instrument + ", refId=" + this.refId + ", type=" + this.type + ", trigger=" + this.trigger + ", orderFormVersion=" + this.orderFormVersion + ", timeInForce=" + this.timeInForce + ", marketHours=" + this.marketHours + ", extended_hours=" + this.extended_hours + ", side=" + this.side + ")";
    }

    /* compiled from: SellStocks.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/SellStocksBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/lib/equity/order/SellStocksBody;", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SellStocksBody> serializer() {
            return SellStocks2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SellStocksBody(int i, BigDecimal bigDecimal, String str, String str2, String str3, @SerialName("ref_id") String str4, String str5, String str6, @SerialName("order_form_version") int i2, @SerialName("time_in_force") String str7, @SerialName("market_hours") String str8, @SerialName("extended_hours") boolean z, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, SellStocks2.INSTANCE.getDescriptor());
        }
        this.quantity = bigDecimal;
        this.symbol = str;
        this.account = str2;
        this.instrument = str3;
        this.refId = str4;
        if ((i & 32) == 0) {
            this.type = "market";
        } else {
            this.type = str5;
        }
        if ((i & 64) == 0) {
            this.trigger = "immediate";
        } else {
            this.trigger = str6;
        }
        if ((i & 128) == 0) {
            this.orderFormVersion = 4;
        } else {
            this.orderFormVersion = i2;
        }
        if ((i & 256) == 0) {
            this.timeInForce = "gfd";
        } else {
            this.timeInForce = str7;
        }
        if ((i & 512) == 0) {
            this.marketHours = "regular_hours";
        } else {
            this.marketHours = str8;
        }
        if ((i & 1024) == 0) {
            this.extended_hours = false;
        } else {
            this.extended_hours = z;
        }
        if ((i & 2048) == 0) {
            this.side = "sell";
        } else {
            this.side = str9;
        }
    }

    public SellStocksBody(BigDecimal quantity, String symbol, String account, String instrument, String refId, String type2, String trigger, int i, String timeInForce, String marketHours, boolean z, String side) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
        Intrinsics.checkNotNullParameter(side, "side");
        this.quantity = quantity;
        this.symbol = symbol;
        this.account = account;
        this.instrument = instrument;
        this.refId = refId;
        this.type = type2;
        this.trigger = trigger;
        this.orderFormVersion = i;
        this.timeInForce = timeInForce;
        this.marketHours = marketHours;
        this.extended_hours = z;
        this.side = side;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$lib_equity_store(SellStocksBody self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, BigDecimalSerializer.INSTANCE, self.quantity);
        output.encodeStringElement(serialDesc, 1, self.symbol);
        output.encodeStringElement(serialDesc, 2, self.account);
        output.encodeStringElement(serialDesc, 3, self.instrument);
        output.encodeStringElement(serialDesc, 4, self.refId);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.type, "market")) {
            output.encodeStringElement(serialDesc, 5, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.trigger, "immediate")) {
            output.encodeStringElement(serialDesc, 6, self.trigger);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.orderFormVersion != 4) {
            output.encodeIntElement(serialDesc, 7, self.orderFormVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.timeInForce, "gfd")) {
            output.encodeStringElement(serialDesc, 8, self.timeInForce);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !Intrinsics.areEqual(self.marketHours, "regular_hours")) {
            output.encodeStringElement(serialDesc, 9, self.marketHours);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.extended_hours) {
            output.encodeBooleanElement(serialDesc, 10, self.extended_hours);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && Intrinsics.areEqual(self.side, "sell")) {
            return;
        }
        output.encodeStringElement(serialDesc, 11, self.side);
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getInstrument() {
        return this.instrument;
    }

    public final String getRefId() {
        return this.refId;
    }

    public /* synthetic */ SellStocksBody(BigDecimal bigDecimal, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, boolean z, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, str2, str3, str4, (i2 & 32) != 0 ? "market" : str5, (i2 & 64) != 0 ? "immediate" : str6, (i2 & 128) != 0 ? 4 : i, (i2 & 256) != 0 ? "gfd" : str7, (i2 & 512) != 0 ? "regular_hours" : str8, (i2 & 1024) != 0 ? false : z, (i2 & 2048) != 0 ? "sell" : str9);
    }
}
