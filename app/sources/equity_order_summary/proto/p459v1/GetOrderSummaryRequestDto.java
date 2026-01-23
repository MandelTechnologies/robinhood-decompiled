package equity_order_summary.proto.p459v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.squareup.wire.ProtoAdapter;
import equity_order_summary.proto.p459v1.MarketHoursDto;
import equity_order_summary.proto.p459v1.TrailingPegDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rosetta.order.MarketHours;
import rosetta.order.MarketHoursDto;
import rosetta.order.OrderType;
import rosetta.order.OrderTypeDto;
import rosetta.order.PositionEffect;
import rosetta.order.PositionEffectDto;
import rosetta.order.Side;
import rosetta.order.SideDto;
import rosetta.order.TimeInForce;
import rosetta.order.TimeInForceDto;
import rosetta.order.Trigger;
import rosetta.order.TriggerDto;

/* compiled from: GetOrderSummaryRequestDto.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004<;=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÛ\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\u0006\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u000200H\u0016¢\u0006\u0004\b9\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:¨\u0006?"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_order_summary/proto/v1/GetOrderSummaryRequest;", "Landroid/os/Parcelable;", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate;", "surrogate", "<init>", "(Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate;)V", "Lequity_order_summary/proto/v1/MarketHoursDto;", "market_hours", "Lrosetta/order/TimeInForceDto;", "time_in_force", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/TriggerDto;", "trigger", "Lrosetta/order/MarketHoursDto;", "order_market_hours", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "", "symbol", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "last_trade_price", "dollar_based_amount", "preset_percent_limit", "Lrosetta/order/SideDto;", "side", "", "notional_estimated_quantity_decimals", "order_to_replace_id", "Lequity_order_summary/proto/v1/TrailingPegDto;", "trailing_peg", "instrument_id", "Lrosetta/order/PositionEffectDto;", "position_effect", "", "has_sales_taxes", "(Lequity_order_summary/proto/v1/MarketHoursDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/SideDto;JLjava/lang/String;Lequity_order_summary/proto/v1/TrailingPegDto;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Ljava/lang/Boolean;)V", "toProto", "()Lequity_order_summary/proto/v1/GetOrderSummaryRequest;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class GetOrderSummaryRequestDto implements Dto3<GetOrderSummaryRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetOrderSummaryRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetOrderSummaryRequestDto, GetOrderSummaryRequest>> binaryBase64Serializer$delegate;
    private static final GetOrderSummaryRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetOrderSummaryRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetOrderSummaryRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GetOrderSummaryRequestDto(MarketHoursDto marketHoursDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, MarketHoursDto marketHoursDto2, IdlDecimal idlDecimal, String str, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, SideDto sideDto, long j, String str2, TrailingPegDto trailingPegDto, String str3, PositionEffectDto positionEffectDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marketHoursDto, (i & 2) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 4) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 8) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i & 16) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto2, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 256) != 0 ? null : idlDecimal3, (i & 512) != 0 ? null : idlDecimal4, (i & 1024) != 0 ? null : idlDecimal5, (i & 2048) != 0 ? null : idlDecimal6, (i & 4096) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8192) != 0 ? 0L : j, (i & 16384) != 0 ? null : str2, (i & 32768) != 0 ? null : trailingPegDto, (i & 65536) != 0 ? null : str3, (i & 131072) != 0 ? null : positionEffectDto, (i & 262144) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetOrderSummaryRequestDto(MarketHoursDto marketHoursDto, TimeInForceDto time_in_force, OrderTypeDto type2, TriggerDto trigger, MarketHoursDto order_market_hours, IdlDecimal quantity, String symbol, IdlDecimal price, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, SideDto side, long j, String str, TrailingPegDto trailingPegDto, String str2, PositionEffectDto positionEffectDto, Boolean bool) {
        this(new Surrogate(marketHoursDto, time_in_force, type2, trigger, order_market_hours, quantity, symbol, price, idlDecimal, idlDecimal2, idlDecimal3, idlDecimal4, side, j, str, trailingPegDto, str2, positionEffectDto, bool));
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(order_market_hours, "order_market_hours");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(side, "side");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetOrderSummaryRequest toProto() {
        MarketHoursDto market_hours = this.surrogate.getMarket_hours();
        MarketHours proto = market_hours != null ? market_hours.toProto() : null;
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        Trigger trigger = (Trigger) this.surrogate.getTrigger().toProto();
        MarketHours marketHours = (MarketHours) this.surrogate.getOrder_market_hours().toProto();
        String stringValue = this.surrogate.getQuantity().getStringValue();
        String symbol = this.surrogate.getSymbol();
        String stringValue2 = this.surrogate.getPrice().getStringValue();
        IdlDecimal stop_price = this.surrogate.getStop_price();
        String stringValue3 = stop_price != null ? stop_price.getStringValue() : null;
        IdlDecimal last_trade_price = this.surrogate.getLast_trade_price();
        String stringValue4 = last_trade_price != null ? last_trade_price.getStringValue() : null;
        IdlDecimal dollar_based_amount = this.surrogate.getDollar_based_amount();
        String stringValue5 = dollar_based_amount != null ? dollar_based_amount.getStringValue() : null;
        IdlDecimal preset_percent_limit = this.surrogate.getPreset_percent_limit();
        String stringValue6 = preset_percent_limit != null ? preset_percent_limit.getStringValue() : null;
        Side side = (Side) this.surrogate.getSide().toProto();
        long notional_estimated_quantity_decimals = this.surrogate.getNotional_estimated_quantity_decimals();
        String order_to_replace_id = this.surrogate.getOrder_to_replace_id();
        TrailingPegDto trailing_peg = this.surrogate.getTrailing_peg();
        TrailingPeg proto2 = trailing_peg != null ? trailing_peg.toProto() : null;
        String instrument_id = this.surrogate.getInstrument_id();
        PositionEffectDto position_effect = this.surrogate.getPosition_effect();
        return new GetOrderSummaryRequest(proto, timeInForce, orderType, trigger, marketHours, stringValue, symbol, stringValue2, stringValue3, stringValue4, stringValue5, stringValue6, side, notional_estimated_quantity_decimals, order_to_replace_id, proto2, instrument_id, position_effect != null ? (PositionEffect) position_effect.toProto() : null, this.surrogate.getHas_sales_taxes(), null, 524288, null);
    }

    public String toString() {
        return "[GetOrderSummaryRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetOrderSummaryRequestDto) && Intrinsics.areEqual(((GetOrderSummaryRequestDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GetOrderSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bK\b\u0083\b\u0018\u0000 z2\u00020\u0001:\u0002{zBÂ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B×\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b%\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020'HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020#2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010A\u0012\u0004\bD\u0010@\u001a\u0004\bB\u0010CR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010E\u0012\u0004\bH\u0010@\u001a\u0004\bF\u0010GR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010I\u0012\u0004\bL\u0010@\u001a\u0004\bJ\u0010KR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010M\u0012\u0004\bP\u0010@\u001a\u0004\bN\u0010OR/\u0010\u0010\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Q\u0012\u0004\bT\u0010@\u001a\u0004\bR\u0010SR \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010U\u0012\u0004\bW\u0010@\u001a\u0004\bV\u00106R/\u0010\u0013\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010Q\u0012\u0004\bY\u0010@\u001a\u0004\bX\u0010SR1\u0010\u0014\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010Q\u0012\u0004\b[\u0010@\u001a\u0004\bZ\u0010SR1\u0010\u0015\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010Q\u0012\u0004\b]\u0010@\u001a\u0004\b\\\u0010SR1\u0010\u0016\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010Q\u0012\u0004\b_\u0010@\u001a\u0004\b^\u0010SR1\u0010\u0017\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Q\u0012\u0004\ba\u0010@\u001a\u0004\b`\u0010SR \u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010b\u0012\u0004\be\u0010@\u001a\u0004\bc\u0010dR/\u0010\u001c\u001a\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010f\u0012\u0004\bi\u0010@\u001a\u0004\bg\u0010hR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010U\u0012\u0004\bk\u0010@\u001a\u0004\bj\u00106R\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010l\u0012\u0004\bo\u0010@\u001a\u0004\bm\u0010nR\"\u0010 \u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010U\u0012\u0004\bq\u0010@\u001a\u0004\bp\u00106R\"\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010r\u0012\u0004\bu\u0010@\u001a\u0004\bs\u0010tR\"\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010v\u0012\u0004\by\u0010@\u001a\u0004\bw\u0010x¨\u0006|"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate;", "", "Lequity_order_summary/proto/v1/MarketHoursDto;", "market_hours", "Lrosetta/order/TimeInForceDto;", "time_in_force", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/TriggerDto;", "trigger", "Lrosetta/order/MarketHoursDto;", "order_market_hours", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "", "symbol", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "last_trade_price", "dollar_based_amount", "preset_percent_limit", "Lrosetta/order/SideDto;", "side", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "notional_estimated_quantity_decimals", "order_to_replace_id", "Lequity_order_summary/proto/v1/TrailingPegDto;", "trailing_peg", "instrument_id", "Lrosetta/order/PositionEffectDto;", "position_effect", "", "has_sales_taxes", "<init>", "(Lequity_order_summary/proto/v1/MarketHoursDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/SideDto;JLjava/lang/String;Lequity_order_summary/proto/v1/TrailingPegDto;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILequity_order_summary/proto/v1/MarketHoursDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/SideDto;JLjava/lang/String;Lequity_order_summary/proto/v1/TrailingPegDto;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_order_summary_proto_v1_externalRelease", "(Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lequity_order_summary/proto/v1/MarketHoursDto;", "getMarket_hours", "()Lequity_order_summary/proto/v1/MarketHoursDto;", "getMarket_hours$annotations", "()V", "Lrosetta/order/TimeInForceDto;", "getTime_in_force", "()Lrosetta/order/TimeInForceDto;", "getTime_in_force$annotations", "Lrosetta/order/OrderTypeDto;", "getType", "()Lrosetta/order/OrderTypeDto;", "getType$annotations", "Lrosetta/order/TriggerDto;", "getTrigger", "()Lrosetta/order/TriggerDto;", "getTrigger$annotations", "Lrosetta/order/MarketHoursDto;", "getOrder_market_hours", "()Lrosetta/order/MarketHoursDto;", "getOrder_market_hours$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "Ljava/lang/String;", "getSymbol", "getSymbol$annotations", "getPrice", "getPrice$annotations", "getStop_price", "getStop_price$annotations", "getLast_trade_price", "getLast_trade_price$annotations", "getDollar_based_amount", "getDollar_based_amount$annotations", "getPreset_percent_limit", "getPreset_percent_limit$annotations", "Lrosetta/order/SideDto;", "getSide", "()Lrosetta/order/SideDto;", "getSide$annotations", "J", "getNotional_estimated_quantity_decimals", "()J", "getNotional_estimated_quantity_decimals$annotations", "getOrder_to_replace_id", "getOrder_to_replace_id$annotations", "Lequity_order_summary/proto/v1/TrailingPegDto;", "getTrailing_peg", "()Lequity_order_summary/proto/v1/TrailingPegDto;", "getTrailing_peg$annotations", "getInstrument_id", "getInstrument_id$annotations", "Lrosetta/order/PositionEffectDto;", "getPosition_effect", "()Lrosetta/order/PositionEffectDto;", "getPosition_effect$annotations", "Ljava/lang/Boolean;", "getHas_sales_taxes", "()Ljava/lang/Boolean;", "getHas_sales_taxes$annotations", "Companion", "$serializer", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal dollar_based_amount;
        private final Boolean has_sales_taxes;
        private final String instrument_id;
        private final IdlDecimal last_trade_price;
        private final MarketHoursDto market_hours;
        private final long notional_estimated_quantity_decimals;
        private final MarketHoursDto order_market_hours;
        private final String order_to_replace_id;
        private final PositionEffectDto position_effect;
        private final IdlDecimal preset_percent_limit;
        private final IdlDecimal price;
        private final IdlDecimal quantity;
        private final SideDto side;
        private final IdlDecimal stop_price;
        private final String symbol;
        private final TimeInForceDto time_in_force;
        private final TrailingPegDto trailing_peg;
        private final TriggerDto trigger;
        private final OrderTypeDto type;

        public Surrogate() {
            this((MarketHoursDto) null, (TimeInForceDto) null, (OrderTypeDto) null, (TriggerDto) null, (MarketHoursDto) null, (IdlDecimal) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (SideDto) null, 0L, (String) null, (TrailingPegDto) null, (String) null, (PositionEffectDto) null, (Boolean) null, 524287, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.market_hours, surrogate.market_hours) && this.time_in_force == surrogate.time_in_force && this.type == surrogate.type && this.trigger == surrogate.trigger && this.order_market_hours == surrogate.order_market_hours && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.last_trade_price, surrogate.last_trade_price) && Intrinsics.areEqual(this.dollar_based_amount, surrogate.dollar_based_amount) && Intrinsics.areEqual(this.preset_percent_limit, surrogate.preset_percent_limit) && this.side == surrogate.side && this.notional_estimated_quantity_decimals == surrogate.notional_estimated_quantity_decimals && Intrinsics.areEqual(this.order_to_replace_id, surrogate.order_to_replace_id) && Intrinsics.areEqual(this.trailing_peg, surrogate.trailing_peg) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && this.position_effect == surrogate.position_effect && Intrinsics.areEqual(this.has_sales_taxes, surrogate.has_sales_taxes);
        }

        public int hashCode() {
            MarketHoursDto marketHoursDto = this.market_hours;
            int iHashCode = (((((((((((((((marketHoursDto == null ? 0 : marketHoursDto.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + this.type.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.order_market_hours.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.price.hashCode()) * 31;
            IdlDecimal idlDecimal = this.stop_price;
            int iHashCode2 = (iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.last_trade_price;
            int iHashCode3 = (iHashCode2 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.dollar_based_amount;
            int iHashCode4 = (iHashCode3 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31;
            IdlDecimal idlDecimal4 = this.preset_percent_limit;
            int iHashCode5 = (((((iHashCode4 + (idlDecimal4 == null ? 0 : idlDecimal4.hashCode())) * 31) + this.side.hashCode()) * 31) + Long.hashCode(this.notional_estimated_quantity_decimals)) * 31;
            String str = this.order_to_replace_id;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            TrailingPegDto trailingPegDto = this.trailing_peg;
            int iHashCode7 = (iHashCode6 + (trailingPegDto == null ? 0 : trailingPegDto.hashCode())) * 31;
            String str2 = this.instrument_id;
            int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PositionEffectDto positionEffectDto = this.position_effect;
            int iHashCode9 = (iHashCode8 + (positionEffectDto == null ? 0 : positionEffectDto.hashCode())) * 31;
            Boolean bool = this.has_sales_taxes;
            return iHashCode9 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(market_hours=" + this.market_hours + ", time_in_force=" + this.time_in_force + ", type=" + this.type + ", trigger=" + this.trigger + ", order_market_hours=" + this.order_market_hours + ", quantity=" + this.quantity + ", symbol=" + this.symbol + ", price=" + this.price + ", stop_price=" + this.stop_price + ", last_trade_price=" + this.last_trade_price + ", dollar_based_amount=" + this.dollar_based_amount + ", preset_percent_limit=" + this.preset_percent_limit + ", side=" + this.side + ", notional_estimated_quantity_decimals=" + this.notional_estimated_quantity_decimals + ", order_to_replace_id=" + this.order_to_replace_id + ", trailing_peg=" + this.trailing_peg + ", instrument_id=" + this.instrument_id + ", position_effect=" + this.position_effect + ", has_sales_taxes=" + this.has_sales_taxes + ")";
        }

        /* compiled from: GetOrderSummaryRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate;", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetOrderSummaryRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MarketHoursDto marketHoursDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, MarketHoursDto marketHoursDto2, IdlDecimal idlDecimal, String str, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, SideDto sideDto, long j, String str2, TrailingPegDto trailingPegDto, String str3, PositionEffectDto positionEffectDto, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.market_hours = null;
            } else {
                this.market_hours = marketHoursDto;
            }
            if ((i & 2) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 4) == 0) {
                this.type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = orderTypeDto;
            }
            if ((i & 8) == 0) {
                this.trigger = TriggerDto.INSTANCE.getZeroValue();
            } else {
                this.trigger = triggerDto;
            }
            if ((i & 16) == 0) {
                this.order_market_hours = MarketHoursDto.INSTANCE.getZeroValue();
            } else {
                this.order_market_hours = marketHoursDto2;
            }
            if ((i & 32) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 64) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str;
            }
            if ((i & 128) == 0) {
                this.price = new IdlDecimal("");
            } else {
                this.price = idlDecimal2;
            }
            if ((i & 256) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = idlDecimal3;
            }
            if ((i & 512) == 0) {
                this.last_trade_price = null;
            } else {
                this.last_trade_price = idlDecimal4;
            }
            if ((i & 1024) == 0) {
                this.dollar_based_amount = null;
            } else {
                this.dollar_based_amount = idlDecimal5;
            }
            if ((i & 2048) == 0) {
                this.preset_percent_limit = null;
            } else {
                this.preset_percent_limit = idlDecimal6;
            }
            this.side = (i & 4096) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            this.notional_estimated_quantity_decimals = (i & 8192) == 0 ? 0L : j;
            if ((i & 16384) == 0) {
                this.order_to_replace_id = null;
            } else {
                this.order_to_replace_id = str2;
            }
            if ((32768 & i) == 0) {
                this.trailing_peg = null;
            } else {
                this.trailing_peg = trailingPegDto;
            }
            if ((65536 & i) == 0) {
                this.instrument_id = null;
            } else {
                this.instrument_id = str3;
            }
            if ((131072 & i) == 0) {
                this.position_effect = null;
            } else {
                this.position_effect = positionEffectDto;
            }
            if ((i & 262144) == 0) {
                this.has_sales_taxes = null;
            } else {
                this.has_sales_taxes = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_order_summary_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MarketHoursDto marketHoursDto = self.market_hours;
            if (marketHoursDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MarketHoursDto.Serializer.INSTANCE, marketHoursDto);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.trigger != TriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TriggerDto.Serializer.INSTANCE, self.trigger);
            }
            if (self.order_market_hours != rosetta.order.MarketHoursDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, MarketHoursDto.Serializer.INSTANCE, self.order_market_hours);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 6, self.symbol);
            }
            if (!Intrinsics.areEqual(self.price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.price);
            }
            IdlDecimal idlDecimal = self.stop_price;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.last_trade_price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            IdlDecimal idlDecimal3 = self.dollar_based_amount;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            IdlDecimal idlDecimal4 = self.preset_percent_limit;
            if (idlDecimal4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal4);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, SideDto.Serializer.INSTANCE, self.side);
            }
            long j = self.notional_estimated_quantity_decimals;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 13, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            String str = self.order_to_replace_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str);
            }
            TrailingPegDto trailingPegDto = self.trailing_peg;
            if (trailingPegDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, TrailingPegDto.Serializer.INSTANCE, trailingPegDto);
            }
            String str2 = self.instrument_id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, str2);
            }
            PositionEffectDto positionEffectDto = self.position_effect;
            if (positionEffectDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, PositionEffectDto.Serializer.INSTANCE, positionEffectDto);
            }
            Boolean bool = self.has_sales_taxes;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(MarketHoursDto marketHoursDto, TimeInForceDto time_in_force, OrderTypeDto type2, TriggerDto trigger, rosetta.order.MarketHoursDto order_market_hours, IdlDecimal quantity, String symbol, IdlDecimal price, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, SideDto side, long j, String str, TrailingPegDto trailingPegDto, String str2, PositionEffectDto positionEffectDto, Boolean bool) {
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(order_market_hours, "order_market_hours");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(side, "side");
            this.market_hours = marketHoursDto;
            this.time_in_force = time_in_force;
            this.type = type2;
            this.trigger = trigger;
            this.order_market_hours = order_market_hours;
            this.quantity = quantity;
            this.symbol = symbol;
            this.price = price;
            this.stop_price = idlDecimal;
            this.last_trade_price = idlDecimal2;
            this.dollar_based_amount = idlDecimal3;
            this.preset_percent_limit = idlDecimal4;
            this.side = side;
            this.notional_estimated_quantity_decimals = j;
            this.order_to_replace_id = str;
            this.trailing_peg = trailingPegDto;
            this.instrument_id = str2;
            this.position_effect = positionEffectDto;
            this.has_sales_taxes = bool;
        }

        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public /* synthetic */ Surrogate(MarketHoursDto marketHoursDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, rosetta.order.MarketHoursDto marketHoursDto2, IdlDecimal idlDecimal, String str, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, SideDto sideDto, long j, String str2, TrailingPegDto trailingPegDto, String str3, PositionEffectDto positionEffectDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : marketHoursDto, (i & 2) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 4) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 8) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i & 16) != 0 ? rosetta.order.MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto2, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 256) != 0 ? null : idlDecimal3, (i & 512) != 0 ? null : idlDecimal4, (i & 1024) != 0 ? null : idlDecimal5, (i & 2048) != 0 ? null : idlDecimal6, (i & 4096) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8192) != 0 ? 0L : j, (i & 16384) != 0 ? null : str2, (i & 32768) != 0 ? null : trailingPegDto, (i & 65536) != 0 ? null : str3, (i & 131072) != 0 ? null : positionEffectDto, (i & 262144) != 0 ? null : bool);
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final TriggerDto getTrigger() {
            return this.trigger;
        }

        public final rosetta.order.MarketHoursDto getOrder_market_hours() {
            return this.order_market_hours;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final IdlDecimal getPrice() {
            return this.price;
        }

        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final IdlDecimal getLast_trade_price() {
            return this.last_trade_price;
        }

        public final IdlDecimal getDollar_based_amount() {
            return this.dollar_based_amount;
        }

        public final IdlDecimal getPreset_percent_limit() {
            return this.preset_percent_limit;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final long getNotional_estimated_quantity_decimals() {
            return this.notional_estimated_quantity_decimals;
        }

        public final String getOrder_to_replace_id() {
            return this.order_to_replace_id;
        }

        public final TrailingPegDto getTrailing_peg() {
            return this.trailing_peg;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final Boolean getHas_sales_taxes() {
            return this.has_sales_taxes;
        }
    }

    /* compiled from: GetOrderSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;", "Lequity_order_summary/proto/v1/GetOrderSummaryRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetOrderSummaryRequestDto, GetOrderSummaryRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetOrderSummaryRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrderSummaryRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrderSummaryRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetOrderSummaryRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetOrderSummaryRequest> getProtoAdapter() {
            return GetOrderSummaryRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrderSummaryRequestDto getZeroValue() {
            return GetOrderSummaryRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrderSummaryRequestDto fromProto(GetOrderSummaryRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MarketHours market_hours = proto.getMarket_hours();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MarketHoursDto marketHoursDtoFromProto = market_hours != null ? MarketHoursDto.INSTANCE.fromProto(market_hours) : null;
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            TriggerDto triggerDtoFromProto = TriggerDto.INSTANCE.fromProto(proto.getTrigger());
            rosetta.order.MarketHoursDto marketHoursDtoFromProto2 = rosetta.order.MarketHoursDto.INSTANCE.fromProto(proto.getOrder_market_hours());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            String symbol = proto.getSymbol();
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getPrice());
            String stop_price = proto.getStop_price();
            IdlDecimal idlDecimal3 = stop_price != null ? new IdlDecimal(stop_price) : null;
            String last_trade_price = proto.getLast_trade_price();
            IdlDecimal idlDecimal4 = last_trade_price != null ? new IdlDecimal(last_trade_price) : null;
            String dollar_based_amount = proto.getDollar_based_amount();
            IdlDecimal idlDecimal5 = dollar_based_amount != null ? new IdlDecimal(dollar_based_amount) : null;
            String preset_percent_limit = proto.getPreset_percent_limit();
            IdlDecimal idlDecimal6 = preset_percent_limit != null ? new IdlDecimal(preset_percent_limit) : null;
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            long notional_estimated_quantity_decimals = proto.getNotional_estimated_quantity_decimals();
            String order_to_replace_id = proto.getOrder_to_replace_id();
            TrailingPeg trailing_peg = proto.getTrailing_peg();
            TrailingPegDto trailingPegDtoFromProto = trailing_peg != null ? TrailingPegDto.INSTANCE.fromProto(trailing_peg) : null;
            String instrument_id = proto.getInstrument_id();
            PositionEffect position_effect = proto.getPosition_effect();
            return new GetOrderSummaryRequestDto(new Surrogate(marketHoursDtoFromProto, timeInForceDtoFromProto, orderTypeDtoFromProto, triggerDtoFromProto, marketHoursDtoFromProto2, idlDecimal, symbol, idlDecimal2, idlDecimal3, idlDecimal4, idlDecimal5, idlDecimal6, sideDtoFromProto, notional_estimated_quantity_decimals, order_to_replace_id, trailingPegDtoFromProto, instrument_id, position_effect != null ? PositionEffectDto.INSTANCE.fromProto(position_effect) : null, proto.getHas_sales_taxes()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_order_summary.proto.v1.GetOrderSummaryRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetOrderSummaryRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetOrderSummaryRequestDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetOrderSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;", "<init>", "()V", "surrogateSerializer", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<GetOrderSummaryRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_order_summary.proto.v1.GetOrderSummaryRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetOrderSummaryRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetOrderSummaryRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetOrderSummaryRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetOrderSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "equity_order_summary.proto.v1.GetOrderSummaryRequestDto";
        }
    }
}
