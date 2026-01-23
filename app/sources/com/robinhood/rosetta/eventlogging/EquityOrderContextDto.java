package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.EquityOrderContextDto;
import com.robinhood.rosetta.eventlogging.TaxLotSelectionDto;
import com.robinhood.rosetta.eventlogging.TaxLotsContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;
import rosetta.order.MarketHours;
import rosetta.order.MarketHoursDto;
import rosetta.order.OrderEntryPoint;
import rosetta.order.OrderEntryPointDto;
import rosetta.order.OrderInputFormat;
import rosetta.order.OrderInputFormatDto;
import rosetta.order.OrderType;
import rosetta.order.OrderTypeDto;
import rosetta.order.PositionEffect;
import rosetta.order.PositionEffectDto;
import rosetta.order.Side;
import rosetta.order.SideDto;
import rosetta.order.Trigger;
import rosetta.order.TriggerDto;

/* compiled from: EquityOrderContextDto.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b%\b\u0007\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004^]_`B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bß\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b\u0006\u0010*Jã\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101H\u0096\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000206H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u000206H\u0016¢\u0006\u0004\b?\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bA\u00100R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u00100R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010IR\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010IR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010IR\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bN\u0010MR\u0019\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0019\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8F¢\u0006\u0006\u001a\u0004\bQ\u0010PR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010#\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bV\u0010MR\u0011\u0010%\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010'\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0011\u0010)\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;)V", "", "instrument_id", "symbol", "Lrosetta/order/SideDto;", "side", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/TriggerDto;", "trigger", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_dollar_based_amount", "is_trailing_order", "is_preset_percent_limit_order", "Lrosetta/order/MarketHoursDto;", "market_hours", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "bid_ask_timestamp", "quote_last_cache_timestamp", "", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "tax_lot_selections", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "tax_lots_context", "estimated_total_fees", "Lrosetta/order/PositionEffectDto;", "position_effect", "Lrosetta/order/OrderEntryPointDto;", "order_entry_point", "Lrosetta/order/OrderInputFormatDto;", "order_input_format", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;", "getInstrument_id", "getSymbol", "getSide", "()Lrosetta/order/SideDto;", "getType", "()Lrosetta/order/OrderTypeDto;", "getTrigger", "()Lrosetta/order/TriggerDto;", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getBid_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_price", "getBid_ask_timestamp", "()Lj$/time/Instant;", "getQuote_last_cache_timestamp", "getTax_lot_selections", "()Ljava/util/List;", "getTax_lots_context", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "getEstimated_total_fees", "getPosition_effect", "()Lrosetta/order/PositionEffectDto;", "getOrder_entry_point", "()Lrosetta/order/OrderEntryPointDto;", "getOrder_input_format", "()Lrosetta/order/OrderInputFormatDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class EquityOrderContextDto implements Dto3<EquityOrderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquityOrderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquityOrderContextDto, EquityOrderContext>> binaryBase64Serializer$delegate;
    private static final EquityOrderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquityOrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquityOrderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final TriggerDto getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final BooleanDto is_dollar_based_amount() {
        return this.surrogate.is_dollar_based_amount();
    }

    public final BooleanDto is_trailing_order() {
        return this.surrogate.is_trailing_order();
    }

    public final BooleanDto is_preset_percent_limit_order() {
        return this.surrogate.is_preset_percent_limit_order();
    }

    public final MarketHoursDto getMarket_hours() {
        return this.surrogate.getMarket_hours();
    }

    public final IdlDecimal getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final IdlDecimal getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final Instant getBid_ask_timestamp() {
        return this.surrogate.getBid_ask_timestamp();
    }

    public final Instant getQuote_last_cache_timestamp() {
        return this.surrogate.getQuote_last_cache_timestamp();
    }

    public final java.util.List<TaxLotSelectionDto> getTax_lot_selections() {
        return this.surrogate.getTax_lot_selections();
    }

    public final TaxLotsContextDto getTax_lots_context() {
        return this.surrogate.getTax_lots_context();
    }

    public final IdlDecimal getEstimated_total_fees() {
        return this.surrogate.getEstimated_total_fees();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final OrderEntryPointDto getOrder_entry_point() {
        return this.surrogate.getOrder_entry_point();
    }

    public final OrderInputFormatDto getOrder_input_format() {
        return this.surrogate.getOrder_input_format();
    }

    public /* synthetic */ EquityOrderContextDto(String str, String str2, SideDto sideDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, Instant instant2, java.util.List list, TaxLotsContextDto taxLotsContextDto, IdlDecimal idlDecimal3, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 16) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 128) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3, (i & 256) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 2048) != 0 ? null : instant, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? CollectionsKt.emptyList() : list, (i & 16384) != 0 ? null : taxLotsContextDto, (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 65536) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i & 131072) != 0 ? OrderEntryPointDto.INSTANCE.getZeroValue() : orderEntryPointDto, (i & 262144) != 0 ? OrderInputFormatDto.INSTANCE.getZeroValue() : orderInputFormatDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquityOrderContextDto(String instrument_id, String symbol, SideDto side, OrderTypeDto type2, TriggerDto trigger, BooleanDto is_dollar_based_amount, BooleanDto is_trailing_order, BooleanDto is_preset_percent_limit_order, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant instant, Instant instant2, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotsContextDto taxLotsContextDto, IdlDecimal estimated_total_fees, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
        this(new Surrogate(instrument_id, symbol, side, type2, trigger, is_dollar_based_amount, is_trailing_order, is_preset_percent_limit_order, market_hours, bid_price, ask_price, instant, instant2, tax_lot_selections, taxLotsContextDto, estimated_total_fees, position_effect, order_entry_point, order_input_format));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(is_dollar_based_amount, "is_dollar_based_amount");
        Intrinsics.checkNotNullParameter(is_trailing_order, "is_trailing_order");
        Intrinsics.checkNotNullParameter(is_preset_percent_limit_order, "is_preset_percent_limit_order");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(estimated_total_fees, "estimated_total_fees");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
    }

    public static /* synthetic */ EquityOrderContextDto copy$default(EquityOrderContextDto equityOrderContextDto, String str, String str2, SideDto sideDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, Instant instant2, java.util.List list, TaxLotsContextDto taxLotsContextDto, IdlDecimal idlDecimal3, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i, Object obj) {
        OrderInputFormatDto order_input_format;
        OrderEntryPointDto orderEntryPointDto2;
        String instrument_id = (i & 1) != 0 ? equityOrderContextDto.surrogate.getInstrument_id() : str;
        String symbol = (i & 2) != 0 ? equityOrderContextDto.surrogate.getSymbol() : str2;
        SideDto side = (i & 4) != 0 ? equityOrderContextDto.surrogate.getSide() : sideDto;
        OrderTypeDto type2 = (i & 8) != 0 ? equityOrderContextDto.surrogate.getType() : orderTypeDto;
        TriggerDto trigger = (i & 16) != 0 ? equityOrderContextDto.surrogate.getTrigger() : triggerDto;
        BooleanDto booleanDtoIs_dollar_based_amount = (i & 32) != 0 ? equityOrderContextDto.surrogate.is_dollar_based_amount() : booleanDto;
        BooleanDto booleanDtoIs_trailing_order = (i & 64) != 0 ? equityOrderContextDto.surrogate.is_trailing_order() : booleanDto2;
        BooleanDto booleanDtoIs_preset_percent_limit_order = (i & 128) != 0 ? equityOrderContextDto.surrogate.is_preset_percent_limit_order() : booleanDto3;
        MarketHoursDto market_hours = (i & 256) != 0 ? equityOrderContextDto.surrogate.getMarket_hours() : marketHoursDto;
        IdlDecimal bid_price = (i & 512) != 0 ? equityOrderContextDto.surrogate.getBid_price() : idlDecimal;
        IdlDecimal ask_price = (i & 1024) != 0 ? equityOrderContextDto.surrogate.getAsk_price() : idlDecimal2;
        Instant bid_ask_timestamp = (i & 2048) != 0 ? equityOrderContextDto.surrogate.getBid_ask_timestamp() : instant;
        Instant quote_last_cache_timestamp = (i & 4096) != 0 ? equityOrderContextDto.surrogate.getQuote_last_cache_timestamp() : instant2;
        java.util.List tax_lot_selections = (i & 8192) != 0 ? equityOrderContextDto.surrogate.getTax_lot_selections() : list;
        String str3 = instrument_id;
        TaxLotsContextDto tax_lots_context = (i & 16384) != 0 ? equityOrderContextDto.surrogate.getTax_lots_context() : taxLotsContextDto;
        IdlDecimal estimated_total_fees = (i & 32768) != 0 ? equityOrderContextDto.surrogate.getEstimated_total_fees() : idlDecimal3;
        PositionEffectDto position_effect = (i & 65536) != 0 ? equityOrderContextDto.surrogate.getPosition_effect() : positionEffectDto;
        OrderEntryPointDto order_entry_point = (i & 131072) != 0 ? equityOrderContextDto.surrogate.getOrder_entry_point() : orderEntryPointDto;
        if ((i & 262144) != 0) {
            orderEntryPointDto2 = order_entry_point;
            order_input_format = equityOrderContextDto.surrogate.getOrder_input_format();
        } else {
            order_input_format = orderInputFormatDto;
            orderEntryPointDto2 = order_entry_point;
        }
        return equityOrderContextDto.copy(str3, symbol, side, type2, trigger, booleanDtoIs_dollar_based_amount, booleanDtoIs_trailing_order, booleanDtoIs_preset_percent_limit_order, market_hours, bid_price, ask_price, bid_ask_timestamp, quote_last_cache_timestamp, tax_lot_selections, tax_lots_context, estimated_total_fees, position_effect, orderEntryPointDto2, order_input_format);
    }

    public final EquityOrderContextDto copy(String instrument_id, String symbol, SideDto side, OrderTypeDto type2, TriggerDto trigger, BooleanDto is_dollar_based_amount, BooleanDto is_trailing_order, BooleanDto is_preset_percent_limit_order, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant bid_ask_timestamp, Instant quote_last_cache_timestamp, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotsContextDto tax_lots_context, IdlDecimal estimated_total_fees, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(is_dollar_based_amount, "is_dollar_based_amount");
        Intrinsics.checkNotNullParameter(is_trailing_order, "is_trailing_order");
        Intrinsics.checkNotNullParameter(is_preset_percent_limit_order, "is_preset_percent_limit_order");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(estimated_total_fees, "estimated_total_fees");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
        return new EquityOrderContextDto(new Surrogate(instrument_id, symbol, side, type2, trigger, is_dollar_based_amount, is_trailing_order, is_preset_percent_limit_order, market_hours, bid_price, ask_price, bid_ask_timestamp, quote_last_cache_timestamp, tax_lot_selections, tax_lots_context, estimated_total_fees, position_effect, order_entry_point, order_input_format));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquityOrderContext toProto() {
        String instrument_id = this.surrogate.getInstrument_id();
        String symbol = this.surrogate.getSymbol();
        Side side = (Side) this.surrogate.getSide().toProto();
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        Trigger trigger = (Trigger) this.surrogate.getTrigger().toProto();
        Boolean r8 = (Boolean) this.surrogate.is_dollar_based_amount().toProto();
        Boolean r9 = (Boolean) this.surrogate.is_trailing_order().toProto();
        Boolean r10 = (Boolean) this.surrogate.is_preset_percent_limit_order().toProto();
        MarketHours marketHours = (MarketHours) this.surrogate.getMarket_hours().toProto();
        String stringValue = this.surrogate.getBid_price().getStringValue();
        String stringValue2 = this.surrogate.getAsk_price().getStringValue();
        Instant bid_ask_timestamp = this.surrogate.getBid_ask_timestamp();
        Instant quote_last_cache_timestamp = this.surrogate.getQuote_last_cache_timestamp();
        java.util.List<TaxLotSelectionDto> tax_lot_selections = this.surrogate.getTax_lot_selections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_selections, 10));
        Iterator<T> it = tax_lot_selections.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaxLotSelectionDto) it.next()).toProto());
        }
        TaxLotsContextDto tax_lots_context = this.surrogate.getTax_lots_context();
        return new EquityOrderContext(instrument_id, symbol, side, orderType, trigger, r8, r9, r10, marketHours, stringValue, stringValue2, bid_ask_timestamp, quote_last_cache_timestamp, arrayList, tax_lots_context != null ? tax_lots_context.toProto() : null, this.surrogate.getEstimated_total_fees().getStringValue(), (PositionEffect) this.surrogate.getPosition_effect().toProto(), (OrderEntryPoint) this.surrogate.getOrder_entry_point().toProto(), (OrderInputFormat) this.surrogate.getOrder_input_format().toProto(), null, 524288, null);
    }

    public String toString() {
        return "[EquityOrderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquityOrderContextDto) && Intrinsics.areEqual(((EquityOrderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquityOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b6\b\u0083\b\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0093\u0001\u0092\u0001BÆ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019\u0012.\b\u0002\u0010\u001b\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0017\b\u0002\u0010!\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)Bß\u0001\b\u0010\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u00109J\u0010\u0010;\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0010\u0010D\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bD\u0010BJ\u0010\u0010E\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003¢\u0006\u0004\bI\u0010HJ6\u0010J\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019HÆ\u0003¢\u0006\u0004\bJ\u0010KJ6\u0010L\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019HÆ\u0003¢\u0006\u0004\bL\u0010KJ\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003¢\u0006\u0004\bQ\u0010HJ\u0010\u0010R\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020$HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020&HÆ\u0003¢\u0006\u0004\bV\u0010WJÏ\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\b\u0002\u0010\u0015\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142\u0017\b\u0002\u0010\u0016\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00192.\b\u0002\u0010\u001b\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00192\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0017\b\u0002\u0010!\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&HÆ\u0001¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bZ\u00109J\u0010\u0010[\u001a\u00020*HÖ\u0001¢\u0006\u0004\b[\u0010\\J\u001a\u0010_\u001a\u00020^2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b_\u0010`R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010a\u0012\u0004\bc\u0010d\u001a\u0004\bb\u00109R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010a\u0012\u0004\bf\u0010d\u001a\u0004\be\u00109R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010g\u0012\u0004\bi\u0010d\u001a\u0004\bh\u0010<R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010j\u0012\u0004\bl\u0010d\u001a\u0004\bk\u0010>R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010m\u0012\u0004\bo\u0010d\u001a\u0004\bn\u0010@R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010p\u0012\u0004\bq\u0010d\u001a\u0004\b\f\u0010BR \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010p\u0012\u0004\br\u0010d\u001a\u0004\b\r\u0010BR \u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010p\u0012\u0004\bs\u0010d\u001a\u0004\b\u000e\u0010BR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010t\u0012\u0004\bv\u0010d\u001a\u0004\bu\u0010FR/\u0010\u0015\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010w\u0012\u0004\by\u0010d\u001a\u0004\bx\u0010HR/\u0010\u0016\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010w\u0012\u0004\b{\u0010d\u001a\u0004\bz\u0010HRF\u0010\u001a\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010|\u0012\u0004\b~\u0010d\u001a\u0004\b}\u0010KRG\u0010\u001b\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0019¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u001b\u0010|\u0012\u0005\b\u0080\u0001\u0010d\u001a\u0004\b\u007f\u0010KR)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u0081\u0001\u0012\u0005\b\u0083\u0001\u0010d\u001a\u0005\b\u0082\u0001\u0010NR%\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b \u0010\u0084\u0001\u0012\u0005\b\u0086\u0001\u0010d\u001a\u0005\b\u0085\u0001\u0010PR1\u0010!\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010w\u0012\u0005\b\u0088\u0001\u0010d\u001a\u0005\b\u0087\u0001\u0010HR#\u0010#\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b#\u0010\u0089\u0001\u0012\u0005\b\u008b\u0001\u0010d\u001a\u0005\b\u008a\u0001\u0010SR#\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b%\u0010\u008c\u0001\u0012\u0005\b\u008e\u0001\u0010d\u001a\u0005\b\u008d\u0001\u0010UR#\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b'\u0010\u008f\u0001\u0012\u0005\b\u0091\u0001\u0010d\u001a\u0005\b\u0090\u0001\u0010W¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;", "", "", "instrument_id", "symbol", "Lrosetta/order/SideDto;", "side", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/TriggerDto;", "trigger", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_dollar_based_amount", "is_trailing_order", "is_preset_percent_limit_order", "Lrosetta/order/MarketHoursDto;", "market_hours", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "bid_ask_timestamp", "quote_last_cache_timestamp", "", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "tax_lot_selections", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "tax_lots_context", "estimated_total_fees", "Lrosetta/order/PositionEffectDto;", "position_effect", "Lrosetta/order/OrderEntryPointDto;", "order_entry_point", "Lrosetta/order/OrderInputFormatDto;", "order_input_format", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lrosetta/order/SideDto;", "component4", "()Lrosetta/order/OrderTypeDto;", "component5", "()Lrosetta/order/TriggerDto;", "component6", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component7", "component8", "component9", "()Lrosetta/order/MarketHoursDto;", "component10", "()Lcom/robinhood/idl/IdlDecimal;", "component11", "component12", "()Lj$/time/Instant;", "component13", "component14", "()Ljava/util/List;", "component15", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "component16", "component17", "()Lrosetta/order/PositionEffectDto;", "component18", "()Lrosetta/order/OrderEntryPointDto;", "component19", "()Lrosetta/order/OrderInputFormatDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "()V", "getSymbol", "getSymbol$annotations", "Lrosetta/order/SideDto;", "getSide", "getSide$annotations", "Lrosetta/order/OrderTypeDto;", "getType", "getType$annotations", "Lrosetta/order/TriggerDto;", "getTrigger", "getTrigger$annotations", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "is_dollar_based_amount$annotations", "is_trailing_order$annotations", "is_preset_percent_limit_order$annotations", "Lrosetta/order/MarketHoursDto;", "getMarket_hours", "getMarket_hours$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getBid_price", "getBid_price$annotations", "getAsk_price", "getAsk_price$annotations", "Lj$/time/Instant;", "getBid_ask_timestamp", "getBid_ask_timestamp$annotations", "getQuote_last_cache_timestamp", "getQuote_last_cache_timestamp$annotations", "Ljava/util/List;", "getTax_lot_selections", "getTax_lot_selections$annotations", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContextDto;", "getTax_lots_context", "getTax_lots_context$annotations", "getEstimated_total_fees", "getEstimated_total_fees$annotations", "Lrosetta/order/PositionEffectDto;", "getPosition_effect", "getPosition_effect$annotations", "Lrosetta/order/OrderEntryPointDto;", "getOrder_entry_point", "getOrder_entry_point$annotations", "Lrosetta/order/OrderInputFormatDto;", "getOrder_input_format", "getOrder_input_format$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final IdlDecimal ask_price;
        private final Instant bid_ask_timestamp;
        private final IdlDecimal bid_price;
        private final IdlDecimal estimated_total_fees;
        private final String instrument_id;
        private final BooleanDto is_dollar_based_amount;
        private final BooleanDto is_preset_percent_limit_order;
        private final BooleanDto is_trailing_order;
        private final MarketHoursDto market_hours;
        private final OrderEntryPointDto order_entry_point;
        private final OrderInputFormatDto order_input_format;
        private final PositionEffectDto position_effect;
        private final Instant quote_last_cache_timestamp;
        private final SideDto side;
        private final String symbol;
        private final java.util.List<TaxLotSelectionDto> tax_lot_selections;
        private final TaxLotsContextDto tax_lots_context;
        private final TriggerDto trigger;
        private final OrderTypeDto type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOrderContextDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (SideDto) null, (OrderTypeDto) null, (TriggerDto) null, (BooleanDto) null, (BooleanDto) null, (BooleanDto) null, (MarketHoursDto) null, (IdlDecimal) null, (IdlDecimal) null, (Instant) null, (Instant) null, (java.util.List) null, (TaxLotsContextDto) null, (IdlDecimal) null, (PositionEffectDto) null, (OrderEntryPointDto) null, (OrderInputFormatDto) null, 524287, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLotSelectionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, SideDto sideDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, Instant instant2, java.util.List list, TaxLotsContextDto taxLotsContextDto, IdlDecimal idlDecimal3, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i, Object obj) {
            OrderInputFormatDto orderInputFormatDto2;
            OrderEntryPointDto orderEntryPointDto2;
            String str3 = (i & 1) != 0 ? surrogate.instrument_id : str;
            String str4 = (i & 2) != 0 ? surrogate.symbol : str2;
            SideDto sideDto2 = (i & 4) != 0 ? surrogate.side : sideDto;
            OrderTypeDto orderTypeDto2 = (i & 8) != 0 ? surrogate.type : orderTypeDto;
            TriggerDto triggerDto2 = (i & 16) != 0 ? surrogate.trigger : triggerDto;
            BooleanDto booleanDto4 = (i & 32) != 0 ? surrogate.is_dollar_based_amount : booleanDto;
            BooleanDto booleanDto5 = (i & 64) != 0 ? surrogate.is_trailing_order : booleanDto2;
            BooleanDto booleanDto6 = (i & 128) != 0 ? surrogate.is_preset_percent_limit_order : booleanDto3;
            MarketHoursDto marketHoursDto2 = (i & 256) != 0 ? surrogate.market_hours : marketHoursDto;
            IdlDecimal idlDecimal4 = (i & 512) != 0 ? surrogate.bid_price : idlDecimal;
            IdlDecimal idlDecimal5 = (i & 1024) != 0 ? surrogate.ask_price : idlDecimal2;
            Instant instant3 = (i & 2048) != 0 ? surrogate.bid_ask_timestamp : instant;
            Instant instant4 = (i & 4096) != 0 ? surrogate.quote_last_cache_timestamp : instant2;
            java.util.List list2 = (i & 8192) != 0 ? surrogate.tax_lot_selections : list;
            String str5 = str3;
            TaxLotsContextDto taxLotsContextDto2 = (i & 16384) != 0 ? surrogate.tax_lots_context : taxLotsContextDto;
            IdlDecimal idlDecimal6 = (i & 32768) != 0 ? surrogate.estimated_total_fees : idlDecimal3;
            PositionEffectDto positionEffectDto2 = (i & 65536) != 0 ? surrogate.position_effect : positionEffectDto;
            OrderEntryPointDto orderEntryPointDto3 = (i & 131072) != 0 ? surrogate.order_entry_point : orderEntryPointDto;
            if ((i & 262144) != 0) {
                orderEntryPointDto2 = orderEntryPointDto3;
                orderInputFormatDto2 = surrogate.order_input_format;
            } else {
                orderInputFormatDto2 = orderInputFormatDto;
                orderEntryPointDto2 = orderEntryPointDto3;
            }
            return surrogate.copy(str5, str4, sideDto2, orderTypeDto2, triggerDto2, booleanDto4, booleanDto5, booleanDto6, marketHoursDto2, idlDecimal4, idlDecimal5, instant3, instant4, list2, taxLotsContextDto2, idlDecimal6, positionEffectDto2, orderEntryPointDto2, orderInputFormatDto2);
        }

        @SerialName("askPrice")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_PRICE})
        public static /* synthetic */ void getAsk_price$annotations() {
        }

        @SerialName("bidAskTimestamp")
        @JsonAnnotations2(names = {"bid_ask_timestamp"})
        public static /* synthetic */ void getBid_ask_timestamp$annotations() {
        }

        @SerialName("bidPrice")
        @JsonAnnotations2(names = {BidAskDetails3.BID_PRICE})
        public static /* synthetic */ void getBid_price$annotations() {
        }

        @SerialName("estimatedTotalFees")
        @JsonAnnotations2(names = {"estimated_total_fees"})
        public static /* synthetic */ void getEstimated_total_fees$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("marketHours")
        @JsonAnnotations2(names = {"market_hours"})
        public static /* synthetic */ void getMarket_hours$annotations() {
        }

        @SerialName("orderEntryPoint")
        @JsonAnnotations2(names = {"order_entry_point"})
        public static /* synthetic */ void getOrder_entry_point$annotations() {
        }

        @SerialName("orderInputFormat")
        @JsonAnnotations2(names = {"order_input_format"})
        public static /* synthetic */ void getOrder_input_format$annotations() {
        }

        @SerialName("positionEffect")
        @JsonAnnotations2(names = {"position_effect"})
        public static /* synthetic */ void getPosition_effect$annotations() {
        }

        @SerialName("quoteLastCacheTimestamp")
        @JsonAnnotations2(names = {"quote_last_cache_timestamp"})
        public static /* synthetic */ void getQuote_last_cache_timestamp$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("taxLotSelections")
        @JsonAnnotations2(names = {"tax_lot_selections"})
        public static /* synthetic */ void getTax_lot_selections$annotations() {
        }

        @SerialName("taxLotsContext")
        @JsonAnnotations2(names = {"tax_lots_context"})
        public static /* synthetic */ void getTax_lots_context$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("isDollarBasedAmount")
        @JsonAnnotations2(names = {"is_dollar_based_amount"})
        public static /* synthetic */ void is_dollar_based_amount$annotations() {
        }

        @SerialName("isPresetPercentLimitOrder")
        @JsonAnnotations2(names = {"is_preset_percent_limit_order"})
        public static /* synthetic */ void is_preset_percent_limit_order$annotations() {
        }

        @SerialName("isTrailingOrder")
        @JsonAnnotations2(names = {"is_trailing_order"})
        public static /* synthetic */ void is_trailing_order$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component10, reason: from getter */
        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component11, reason: from getter */
        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component12, reason: from getter */
        public final Instant getBid_ask_timestamp() {
            return this.bid_ask_timestamp;
        }

        /* renamed from: component13, reason: from getter */
        public final Instant getQuote_last_cache_timestamp() {
            return this.quote_last_cache_timestamp;
        }

        public final java.util.List<TaxLotSelectionDto> component14() {
            return this.tax_lot_selections;
        }

        /* renamed from: component15, reason: from getter */
        public final TaxLotsContextDto getTax_lots_context() {
            return this.tax_lots_context;
        }

        /* renamed from: component16, reason: from getter */
        public final IdlDecimal getEstimated_total_fees() {
            return this.estimated_total_fees;
        }

        /* renamed from: component17, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component18, reason: from getter */
        public final OrderEntryPointDto getOrder_entry_point() {
            return this.order_entry_point;
        }

        /* renamed from: component19, reason: from getter */
        public final OrderInputFormatDto getOrder_input_format() {
            return this.order_input_format;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        /* renamed from: component5, reason: from getter */
        public final TriggerDto getTrigger() {
            return this.trigger;
        }

        /* renamed from: component6, reason: from getter */
        public final BooleanDto getIs_dollar_based_amount() {
            return this.is_dollar_based_amount;
        }

        /* renamed from: component7, reason: from getter */
        public final BooleanDto getIs_trailing_order() {
            return this.is_trailing_order;
        }

        /* renamed from: component8, reason: from getter */
        public final BooleanDto getIs_preset_percent_limit_order() {
            return this.is_preset_percent_limit_order;
        }

        /* renamed from: component9, reason: from getter */
        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        public final Surrogate copy(String instrument_id, String symbol, SideDto side, OrderTypeDto type2, TriggerDto trigger, BooleanDto is_dollar_based_amount, BooleanDto is_trailing_order, BooleanDto is_preset_percent_limit_order, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant bid_ask_timestamp, Instant quote_last_cache_timestamp, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotsContextDto tax_lots_context, IdlDecimal estimated_total_fees, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(is_dollar_based_amount, "is_dollar_based_amount");
            Intrinsics.checkNotNullParameter(is_trailing_order, "is_trailing_order");
            Intrinsics.checkNotNullParameter(is_preset_percent_limit_order, "is_preset_percent_limit_order");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
            Intrinsics.checkNotNullParameter(estimated_total_fees, "estimated_total_fees");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
            Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
            return new Surrogate(instrument_id, symbol, side, type2, trigger, is_dollar_based_amount, is_trailing_order, is_preset_percent_limit_order, market_hours, bid_price, ask_price, bid_ask_timestamp, quote_last_cache_timestamp, tax_lot_selections, tax_lots_context, estimated_total_fees, position_effect, order_entry_point, order_input_format);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.side == surrogate.side && this.type == surrogate.type && this.trigger == surrogate.trigger && this.is_dollar_based_amount == surrogate.is_dollar_based_amount && this.is_trailing_order == surrogate.is_trailing_order && this.is_preset_percent_limit_order == surrogate.is_preset_percent_limit_order && this.market_hours == surrogate.market_hours && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.bid_ask_timestamp, surrogate.bid_ask_timestamp) && Intrinsics.areEqual(this.quote_last_cache_timestamp, surrogate.quote_last_cache_timestamp) && Intrinsics.areEqual(this.tax_lot_selections, surrogate.tax_lot_selections) && Intrinsics.areEqual(this.tax_lots_context, surrogate.tax_lots_context) && Intrinsics.areEqual(this.estimated_total_fees, surrogate.estimated_total_fees) && this.position_effect == surrogate.position_effect && this.order_entry_point == surrogate.order_entry_point && this.order_input_format == surrogate.order_input_format;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.instrument_id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.side.hashCode()) * 31) + this.type.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.is_dollar_based_amount.hashCode()) * 31) + this.is_trailing_order.hashCode()) * 31) + this.is_preset_percent_limit_order.hashCode()) * 31) + this.market_hours.hashCode()) * 31) + this.bid_price.hashCode()) * 31) + this.ask_price.hashCode()) * 31;
            Instant instant = this.bid_ask_timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.quote_last_cache_timestamp;
            int iHashCode3 = (((iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.tax_lot_selections.hashCode()) * 31;
            TaxLotsContextDto taxLotsContextDto = this.tax_lots_context;
            return ((((((((iHashCode3 + (taxLotsContextDto != null ? taxLotsContextDto.hashCode() : 0)) * 31) + this.estimated_total_fees.hashCode()) * 31) + this.position_effect.hashCode()) * 31) + this.order_entry_point.hashCode()) * 31) + this.order_input_format.hashCode();
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", symbol=" + this.symbol + ", side=" + this.side + ", type=" + this.type + ", trigger=" + this.trigger + ", is_dollar_based_amount=" + this.is_dollar_based_amount + ", is_trailing_order=" + this.is_trailing_order + ", is_preset_percent_limit_order=" + this.is_preset_percent_limit_order + ", market_hours=" + this.market_hours + ", bid_price=" + this.bid_price + ", ask_price=" + this.ask_price + ", bid_ask_timestamp=" + this.bid_ask_timestamp + ", quote_last_cache_timestamp=" + this.quote_last_cache_timestamp + ", tax_lot_selections=" + this.tax_lot_selections + ", tax_lots_context=" + this.tax_lots_context + ", estimated_total_fees=" + this.estimated_total_fees + ", position_effect=" + this.position_effect + ", order_entry_point=" + this.order_entry_point + ", order_input_format=" + this.order_input_format + ")";
        }

        /* compiled from: EquityOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquityOrderContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, SideDto sideDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, Instant instant2, java.util.List list, TaxLotsContextDto taxLotsContextDto, IdlDecimal idlDecimal3, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 2) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 4) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 8) == 0) {
                this.type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = orderTypeDto;
            }
            if ((i & 16) == 0) {
                this.trigger = TriggerDto.INSTANCE.getZeroValue();
            } else {
                this.trigger = triggerDto;
            }
            if ((i & 32) == 0) {
                this.is_dollar_based_amount = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_dollar_based_amount = booleanDto;
            }
            if ((i & 64) == 0) {
                this.is_trailing_order = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_trailing_order = booleanDto2;
            }
            if ((i & 128) == 0) {
                this.is_preset_percent_limit_order = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_preset_percent_limit_order = booleanDto3;
            }
            if ((i & 256) == 0) {
                this.market_hours = MarketHoursDto.INSTANCE.getZeroValue();
            } else {
                this.market_hours = marketHoursDto;
            }
            if ((i & 512) == 0) {
                this.bid_price = new IdlDecimal("");
            } else {
                this.bid_price = idlDecimal;
            }
            if ((i & 1024) == 0) {
                this.ask_price = new IdlDecimal("");
            } else {
                this.ask_price = idlDecimal2;
            }
            if ((i & 2048) == 0) {
                this.bid_ask_timestamp = null;
            } else {
                this.bid_ask_timestamp = instant;
            }
            if ((i & 4096) == 0) {
                this.quote_last_cache_timestamp = null;
            } else {
                this.quote_last_cache_timestamp = instant2;
            }
            this.tax_lot_selections = (i & 8192) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 16384) == 0) {
                this.tax_lots_context = null;
            } else {
                this.tax_lots_context = taxLotsContextDto;
            }
            this.estimated_total_fees = (32768 & i) == 0 ? new IdlDecimal("") : idlDecimal3;
            this.position_effect = (65536 & i) == 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto;
            this.order_entry_point = (131072 & i) == 0 ? OrderEntryPointDto.INSTANCE.getZeroValue() : orderEntryPointDto;
            this.order_input_format = (i & 262144) == 0 ? OrderInputFormatDto.INSTANCE.getZeroValue() : orderInputFormatDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.symbol);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, SideDto.Serializer.INSTANCE, self.side);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.trigger != TriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, TriggerDto.Serializer.INSTANCE, self.trigger);
            }
            BooleanDto booleanDto = self.is_dollar_based_amount;
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            if (booleanDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, BooleanDto.Serializer.INSTANCE, self.is_dollar_based_amount);
            }
            if (self.is_trailing_order != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, BooleanDto.Serializer.INSTANCE, self.is_trailing_order);
            }
            if (self.is_preset_percent_limit_order != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, BooleanDto.Serializer.INSTANCE, self.is_preset_percent_limit_order);
            }
            if (self.market_hours != MarketHoursDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, MarketHoursDto.Serializer.INSTANCE, self.market_hours);
            }
            if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, self.ask_price);
            }
            Instant instant = self.bid_ask_timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.quote_last_cache_timestamp;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.tax_lot_selections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 13, lazyArr[13].getValue(), self.tax_lot_selections);
            }
            TaxLotsContextDto taxLotsContextDto = self.tax_lots_context;
            if (taxLotsContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, TaxLotsContextDto.Serializer.INSTANCE, taxLotsContextDto);
            }
            if (!Intrinsics.areEqual(self.estimated_total_fees, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, self.estimated_total_fees);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            if (self.order_entry_point != OrderEntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 17, OrderEntryPointDto.Serializer.INSTANCE, self.order_entry_point);
            }
            if (self.order_input_format != OrderInputFormatDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 18, OrderInputFormatDto.Serializer.INSTANCE, self.order_input_format);
            }
        }

        public Surrogate(String instrument_id, String symbol, SideDto side, OrderTypeDto type2, TriggerDto trigger, BooleanDto is_dollar_based_amount, BooleanDto is_trailing_order, BooleanDto is_preset_percent_limit_order, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant instant, Instant instant2, java.util.List<TaxLotSelectionDto> tax_lot_selections, TaxLotsContextDto taxLotsContextDto, IdlDecimal estimated_total_fees, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(is_dollar_based_amount, "is_dollar_based_amount");
            Intrinsics.checkNotNullParameter(is_trailing_order, "is_trailing_order");
            Intrinsics.checkNotNullParameter(is_preset_percent_limit_order, "is_preset_percent_limit_order");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
            Intrinsics.checkNotNullParameter(estimated_total_fees, "estimated_total_fees");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
            Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
            this.instrument_id = instrument_id;
            this.symbol = symbol;
            this.side = side;
            this.type = type2;
            this.trigger = trigger;
            this.is_dollar_based_amount = is_dollar_based_amount;
            this.is_trailing_order = is_trailing_order;
            this.is_preset_percent_limit_order = is_preset_percent_limit_order;
            this.market_hours = market_hours;
            this.bid_price = bid_price;
            this.ask_price = ask_price;
            this.bid_ask_timestamp = instant;
            this.quote_last_cache_timestamp = instant2;
            this.tax_lot_selections = tax_lot_selections;
            this.tax_lots_context = taxLotsContextDto;
            this.estimated_total_fees = estimated_total_fees;
            this.position_effect = position_effect;
            this.order_entry_point = order_entry_point;
            this.order_input_format = order_input_format;
        }

        public /* synthetic */ Surrogate(String str, String str2, SideDto sideDto, OrderTypeDto orderTypeDto, TriggerDto triggerDto, BooleanDto booleanDto, BooleanDto booleanDto2, BooleanDto booleanDto3, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, Instant instant2, java.util.List list, TaxLotsContextDto taxLotsContextDto, IdlDecimal idlDecimal3, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 16) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 128) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto3, (i & 256) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 2048) != 0 ? null : instant, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? CollectionsKt.emptyList() : list, (i & 16384) != 0 ? null : taxLotsContextDto, (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 65536) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i & 131072) != 0 ? OrderEntryPointDto.INSTANCE.getZeroValue() : orderEntryPointDto, (i & 262144) != 0 ? OrderInputFormatDto.INSTANCE.getZeroValue() : orderInputFormatDto);
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final TriggerDto getTrigger() {
            return this.trigger;
        }

        public final BooleanDto is_dollar_based_amount() {
            return this.is_dollar_based_amount;
        }

        public final BooleanDto is_trailing_order() {
            return this.is_trailing_order;
        }

        public final BooleanDto is_preset_percent_limit_order() {
            return this.is_preset_percent_limit_order;
        }

        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        public final Instant getBid_ask_timestamp() {
            return this.bid_ask_timestamp;
        }

        public final Instant getQuote_last_cache_timestamp() {
            return this.quote_last_cache_timestamp;
        }

        public final java.util.List<TaxLotSelectionDto> getTax_lot_selections() {
            return this.tax_lot_selections;
        }

        public final TaxLotsContextDto getTax_lots_context() {
            return this.tax_lots_context;
        }

        public final IdlDecimal getEstimated_total_fees() {
            return this.estimated_total_fees;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final OrderEntryPointDto getOrder_entry_point() {
            return this.order_entry_point;
        }

        public final OrderInputFormatDto getOrder_input_format() {
            return this.order_input_format;
        }
    }

    /* compiled from: EquityOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EquityOrderContextDto, EquityOrderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquityOrderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) EquityOrderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquityOrderContext> getProtoAdapter() {
            return EquityOrderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderContextDto getZeroValue() {
            return EquityOrderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderContextDto fromProto(EquityOrderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String instrument_id = proto.getInstrument_id();
            String symbol = proto.getSymbol();
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            TriggerDto triggerDtoFromProto = TriggerDto.INSTANCE.fromProto(proto.getTrigger());
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            BooleanDto booleanDtoFromProto = companion.fromProto(proto.getIs_dollar_based_amount());
            BooleanDto booleanDtoFromProto2 = companion.fromProto(proto.getIs_trailing_order());
            BooleanDto booleanDtoFromProto3 = companion.fromProto(proto.getIs_preset_percent_limit_order());
            MarketHoursDto marketHoursDtoFromProto = MarketHoursDto.INSTANCE.fromProto(proto.getMarket_hours());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getBid_price());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getAsk_price());
            Instant bid_ask_timestamp = proto.getBid_ask_timestamp();
            Instant quote_last_cache_timestamp = proto.getQuote_last_cache_timestamp();
            java.util.List<TaxLotSelection> tax_lot_selections = proto.getTax_lot_selections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_selections, 10));
            for (Iterator it = tax_lot_selections.iterator(); it.hasNext(); it = it) {
                arrayList.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it.next()));
            }
            TaxLotsContext tax_lots_context = proto.getTax_lots_context();
            return new EquityOrderContextDto(new Surrogate(instrument_id, symbol, sideDtoFromProto, orderTypeDtoFromProto, triggerDtoFromProto, booleanDtoFromProto, booleanDtoFromProto2, booleanDtoFromProto3, marketHoursDtoFromProto, idlDecimal, idlDecimal2, bid_ask_timestamp, quote_last_cache_timestamp, arrayList, tax_lots_context != null ? TaxLotsContextDto.INSTANCE.fromProto(tax_lots_context) : null, new IdlDecimal(proto.getEstimated_total_fees()), PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect()), OrderEntryPointDto.INSTANCE.fromProto(proto.getOrder_entry_point()), OrderInputFormatDto.INSTANCE.fromProto(proto.getOrder_input_format())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOrderContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EquityOrderContextDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquityOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EquityOrderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EquityOrderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquityOrderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquityOrderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquityOrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquityOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EquityOrderContextDto";
        }
    }
}
