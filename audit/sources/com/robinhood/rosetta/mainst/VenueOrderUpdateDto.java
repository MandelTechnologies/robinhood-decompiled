package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;
import rosetta.mainst.MarketState;
import rosetta.mainst.MarketStateDto;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.Route;
import rosetta.mainst.RouteDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;
import rosetta.mainst.TimeInForce;
import rosetta.mainst.TimeInForceDto;
import rosetta.order.Agent;
import rosetta.order.AgentDto;
import rosetta.order.MarketHours;
import rosetta.order.MarketHoursDto;
import rosetta.order.ResponseCategory;
import rosetta.order.ResponseCategoryDto;

/* compiled from: VenueOrderUpdateDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 x2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004wxyzB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bß\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u00102\u001a\u000203\u0012\b\b\u0002\u00104\u001a\u000205\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107¢\u0006\u0004\b\u0006\u00108JÜ\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\"2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u0002052\n\b\u0002\u00106\u001a\u0004\u0018\u000107J\b\u0010j\u001a\u00020\u0002H\u0016J\b\u0010k\u001a\u00020\tH\u0016J\u0013\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010oH\u0096\u0002J\b\u0010p\u001a\u000203H\u0016J\u0018\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u000203H\u0016J\b\u0010v\u001a\u000203H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b?\u0010:R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bB\u0010:R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bJ\u0010FR\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bL\u0010FR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bO\u0010<R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010#\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0013\u0010$\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bU\u0010>R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010+\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b\\\u0010SR\u0013\u0010,\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b]\u0010>R\u0013\u0010-\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b^\u0010FR\u0013\u0010.\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b_\u0010>R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u00101\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bb\u0010SR\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u00106\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006{"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/VenueOrderUpdate;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Surrogate;)V", "cl_ord_id", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "venue_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "session_id", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "fix_conn_id", "state", "Lrosetta/mainst/MarketStateDto;", "sent_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "confirmed_at", "cancel_open_agent", "Lrosetta/order/AgentDto;", "cancel_open_time", "cancel_close_agent", "cancel_close_time", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "instrument_id", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "response_text", "response_category", "Lrosetta/order/ResponseCategoryDto;", "trigger", "Lrosetta/mainst/OrderTriggerDto;", "type", "Lrosetta/mainst/OrderTypeDto;", "stop_price", "smart_routing_algorithm", "rejected_at", "routing_metadata", "market_hours", "Lrosetta/order/MarketHoursDto;", "executed_notional", "version", "", "side", "Lrosetta/mainst/SideDto;", "session_date", "Lcom/robinhood/rosetta/common/DateDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Ljava/lang/String;Lrosetta/mainst/MarketStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ILrosetta/mainst/SideDto;Lcom/robinhood/rosetta/common/DateDto;)V", "getCl_ord_id", "()Ljava/lang/String;", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getVenue_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getSession_id", "getRoute", "()Lrosetta/mainst/RouteDto;", "getFix_conn_id", "getState", "()Lrosetta/mainst/MarketStateDto;", "getSent_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getConfirmed_at", "getCancel_open_agent", "()Lrosetta/order/AgentDto;", "getCancel_open_time", "getCancel_close_agent", "getCancel_close_time", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getInstrument_id", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getQuantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getPrice", "getResponse_text", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getTrigger", "()Lrosetta/mainst/OrderTriggerDto;", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getStop_price", "getSmart_routing_algorithm", "getRejected_at", "getRouting_metadata", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getExecuted_notional", "getVersion", "()I", "getSide", "()Lrosetta/mainst/SideDto;", "getSession_date", "()Lcom/robinhood/rosetta/common/DateDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class VenueOrderUpdateDto implements Dto3<VenueOrderUpdate>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<VenueOrderUpdateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<VenueOrderUpdateDto, VenueOrderUpdate>> binaryBase64Serializer$delegate;
    private static final VenueOrderUpdateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ VenueOrderUpdateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private VenueOrderUpdateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCl_ord_id() {
        return this.surrogate.getCl_ord_id();
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final NullableStringDto getVenue_id() {
        return this.surrogate.getVenue_id();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final String getFix_conn_id() {
        return this.surrogate.getFix_conn_id();
    }

    public final MarketStateDto getState() {
        return this.surrogate.getState();
    }

    public final TimeDto getSent_at() {
        return this.surrogate.getSent_at();
    }

    public final TimeDto getConfirmed_at() {
        return this.surrogate.getConfirmed_at();
    }

    public final AgentDto getCancel_open_agent() {
        return this.surrogate.getCancel_open_agent();
    }

    public final TimeDto getCancel_open_time() {
        return this.surrogate.getCancel_open_time();
    }

    public final AgentDto getCancel_close_agent() {
        return this.surrogate.getCancel_close_agent();
    }

    public final TimeDto getCancel_close_time() {
        return this.surrogate.getCancel_close_time();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final UUIDDto getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final NullableStringDto getResponse_text() {
        return this.surrogate.getResponse_text();
    }

    public final ResponseCategoryDto getResponse_category() {
        return this.surrogate.getResponse_category();
    }

    public final OrderTriggerDto getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final DecimalDto getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final NullableStringDto getSmart_routing_algorithm() {
        return this.surrogate.getSmart_routing_algorithm();
    }

    public final TimeDto getRejected_at() {
        return this.surrogate.getRejected_at();
    }

    public final NullableStringDto getRouting_metadata() {
        return this.surrogate.getRouting_metadata();
    }

    public final MarketHoursDto getMarket_hours() {
        return this.surrogate.getMarket_hours();
    }

    public final DecimalDto getExecuted_notional() {
        return this.surrogate.getExecuted_notional();
    }

    public final int getVersion() {
        return this.surrogate.getVersion();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final DateDto getSession_date() {
        return this.surrogate.getSession_date();
    }

    public /* synthetic */ VenueOrderUpdateDto(String str, UUIDDto uUIDDto, NullableStringDto nullableStringDto, String str2, RouteDto routeDto, String str3, MarketStateDto marketStateDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, TimeDto timeDto3, AgentDto agentDto2, TimeDto timeDto4, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto2, TimeInForceDto timeInForceDto, DecimalDto decimalDto, DecimalDto decimalDto2, NullableStringDto nullableStringDto2, ResponseCategoryDto responseCategoryDto, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto3, TimeDto timeDto5, NullableStringDto nullableStringDto4, MarketHoursDto marketHoursDto, DecimalDto decimalDto4, int i, SideDto sideDto, DateDto dateDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : uUIDDto, (i2 & 4) != 0 ? null : nullableStringDto, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 32) == 0 ? str3 : "", (i2 & 64) != 0 ? MarketStateDto.INSTANCE.getZeroValue() : marketStateDto, (i2 & 128) != 0 ? null : timeDto, (i2 & 256) != 0 ? null : timeDto2, (i2 & 512) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i2 & 1024) != 0 ? null : timeDto3, (i2 & 2048) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i2 & 4096) != 0 ? null : timeDto4, (i2 & 8192) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i2 & 16384) != 0 ? null : uUIDDto2, (i2 & 32768) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 65536) != 0 ? null : decimalDto, (i2 & 131072) != 0 ? null : decimalDto2, (i2 & 262144) != 0 ? null : nullableStringDto2, (i2 & 524288) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i2 & 1048576) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i2 & 2097152) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i2 & 4194304) != 0 ? null : decimalDto3, (i2 & 8388608) != 0 ? null : nullableStringDto3, (i2 & 16777216) != 0 ? null : timeDto5, (i2 & 33554432) != 0 ? null : nullableStringDto4, (i2 & 67108864) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i2 & 134217728) != 0 ? null : decimalDto4, (i2 & 268435456) != 0 ? 0 : i, (i2 & 536870912) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 1073741824) != 0 ? null : dateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VenueOrderUpdateDto(String cl_ord_id, UUIDDto uUIDDto, NullableStringDto nullableStringDto, String session_id, RouteDto route, String fix_conn_id, MarketStateDto state, TimeDto timeDto, TimeDto timeDto2, AgentDto cancel_open_agent, TimeDto timeDto3, AgentDto cancel_close_agent, TimeDto timeDto4, InstrumentTypeDto instrument_type, UUIDDto uUIDDto2, TimeInForceDto time_in_force, DecimalDto decimalDto, DecimalDto decimalDto2, NullableStringDto nullableStringDto2, ResponseCategoryDto response_category, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto decimalDto3, NullableStringDto nullableStringDto3, TimeDto timeDto5, NullableStringDto nullableStringDto4, MarketHoursDto market_hours, DecimalDto decimalDto4, int i, SideDto side, DateDto dateDto) {
        this(new Surrogate(cl_ord_id, uUIDDto, nullableStringDto, session_id, route, fix_conn_id, state, timeDto, timeDto2, cancel_open_agent, timeDto3, cancel_close_agent, timeDto4, instrument_type, uUIDDto2, time_in_force, decimalDto, decimalDto2, nullableStringDto2, response_category, trigger, type2, decimalDto3, nullableStringDto3, timeDto5, nullableStringDto4, market_hours, decimalDto4, i, side, dateDto));
        Intrinsics.checkNotNullParameter(cl_ord_id, "cl_ord_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(side, "side");
    }

    public static /* synthetic */ VenueOrderUpdateDto copy$default(VenueOrderUpdateDto venueOrderUpdateDto, String str, UUIDDto uUIDDto, NullableStringDto nullableStringDto, String str2, RouteDto routeDto, String str3, MarketStateDto marketStateDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, TimeDto timeDto3, AgentDto agentDto2, TimeDto timeDto4, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto2, TimeInForceDto timeInForceDto, DecimalDto decimalDto, DecimalDto decimalDto2, NullableStringDto nullableStringDto2, ResponseCategoryDto responseCategoryDto, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto3, TimeDto timeDto5, NullableStringDto nullableStringDto4, MarketHoursDto marketHoursDto, DecimalDto decimalDto4, int i, SideDto sideDto, DateDto dateDto, int i2, Object obj) {
        DateDto session_date;
        SideDto sideDto2;
        String cl_ord_id = (i2 & 1) != 0 ? venueOrderUpdateDto.surrogate.getCl_ord_id() : str;
        UUIDDto order_id = (i2 & 2) != 0 ? venueOrderUpdateDto.surrogate.getOrder_id() : uUIDDto;
        NullableStringDto venue_id = (i2 & 4) != 0 ? venueOrderUpdateDto.surrogate.getVenue_id() : nullableStringDto;
        String session_id = (i2 & 8) != 0 ? venueOrderUpdateDto.surrogate.getSession_id() : str2;
        RouteDto route = (i2 & 16) != 0 ? venueOrderUpdateDto.surrogate.getRoute() : routeDto;
        String fix_conn_id = (i2 & 32) != 0 ? venueOrderUpdateDto.surrogate.getFix_conn_id() : str3;
        MarketStateDto state = (i2 & 64) != 0 ? venueOrderUpdateDto.surrogate.getState() : marketStateDto;
        TimeDto sent_at = (i2 & 128) != 0 ? venueOrderUpdateDto.surrogate.getSent_at() : timeDto;
        TimeDto confirmed_at = (i2 & 256) != 0 ? venueOrderUpdateDto.surrogate.getConfirmed_at() : timeDto2;
        AgentDto cancel_open_agent = (i2 & 512) != 0 ? venueOrderUpdateDto.surrogate.getCancel_open_agent() : agentDto;
        TimeDto cancel_open_time = (i2 & 1024) != 0 ? venueOrderUpdateDto.surrogate.getCancel_open_time() : timeDto3;
        AgentDto cancel_close_agent = (i2 & 2048) != 0 ? venueOrderUpdateDto.surrogate.getCancel_close_agent() : agentDto2;
        TimeDto cancel_close_time = (i2 & 4096) != 0 ? venueOrderUpdateDto.surrogate.getCancel_close_time() : timeDto4;
        InstrumentTypeDto instrument_type = (i2 & 8192) != 0 ? venueOrderUpdateDto.surrogate.getInstrument_type() : instrumentTypeDto;
        String str4 = cl_ord_id;
        UUIDDto instrument_id = (i2 & 16384) != 0 ? venueOrderUpdateDto.surrogate.getInstrument_id() : uUIDDto2;
        TimeInForceDto time_in_force = (i2 & 32768) != 0 ? venueOrderUpdateDto.surrogate.getTime_in_force() : timeInForceDto;
        DecimalDto quantity = (i2 & 65536) != 0 ? venueOrderUpdateDto.surrogate.getQuantity() : decimalDto;
        DecimalDto price = (i2 & 131072) != 0 ? venueOrderUpdateDto.surrogate.getPrice() : decimalDto2;
        NullableStringDto response_text = (i2 & 262144) != 0 ? venueOrderUpdateDto.surrogate.getResponse_text() : nullableStringDto2;
        ResponseCategoryDto response_category = (i2 & 524288) != 0 ? venueOrderUpdateDto.surrogate.getResponse_category() : responseCategoryDto;
        OrderTriggerDto trigger = (i2 & 1048576) != 0 ? venueOrderUpdateDto.surrogate.getTrigger() : orderTriggerDto;
        OrderTypeDto type2 = (i2 & 2097152) != 0 ? venueOrderUpdateDto.surrogate.getType() : orderTypeDto;
        DecimalDto stop_price = (i2 & 4194304) != 0 ? venueOrderUpdateDto.surrogate.getStop_price() : decimalDto3;
        NullableStringDto smart_routing_algorithm = (i2 & 8388608) != 0 ? venueOrderUpdateDto.surrogate.getSmart_routing_algorithm() : nullableStringDto3;
        TimeDto rejected_at = (i2 & 16777216) != 0 ? venueOrderUpdateDto.surrogate.getRejected_at() : timeDto5;
        NullableStringDto routing_metadata = (i2 & 33554432) != 0 ? venueOrderUpdateDto.surrogate.getRouting_metadata() : nullableStringDto4;
        MarketHoursDto market_hours = (i2 & 67108864) != 0 ? venueOrderUpdateDto.surrogate.getMarket_hours() : marketHoursDto;
        DecimalDto executed_notional = (i2 & 134217728) != 0 ? venueOrderUpdateDto.surrogate.getExecuted_notional() : decimalDto4;
        int version = (i2 & 268435456) != 0 ? venueOrderUpdateDto.surrogate.getVersion() : i;
        SideDto side = (i2 & 536870912) != 0 ? venueOrderUpdateDto.surrogate.getSide() : sideDto;
        if ((i2 & 1073741824) != 0) {
            sideDto2 = side;
            session_date = venueOrderUpdateDto.surrogate.getSession_date();
        } else {
            session_date = dateDto;
            sideDto2 = side;
        }
        return venueOrderUpdateDto.copy(str4, order_id, venue_id, session_id, route, fix_conn_id, state, sent_at, confirmed_at, cancel_open_agent, cancel_open_time, cancel_close_agent, cancel_close_time, instrument_type, instrument_id, time_in_force, quantity, price, response_text, response_category, trigger, type2, stop_price, smart_routing_algorithm, rejected_at, routing_metadata, market_hours, executed_notional, version, sideDto2, session_date);
    }

    public final VenueOrderUpdateDto copy(String cl_ord_id, UUIDDto order_id, NullableStringDto venue_id, String session_id, RouteDto route, String fix_conn_id, MarketStateDto state, TimeDto sent_at, TimeDto confirmed_at, AgentDto cancel_open_agent, TimeDto cancel_open_time, AgentDto cancel_close_agent, TimeDto cancel_close_time, InstrumentTypeDto instrument_type, UUIDDto instrument_id, TimeInForceDto time_in_force, DecimalDto quantity, DecimalDto price, NullableStringDto response_text, ResponseCategoryDto response_category, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto stop_price, NullableStringDto smart_routing_algorithm, TimeDto rejected_at, NullableStringDto routing_metadata, MarketHoursDto market_hours, DecimalDto executed_notional, int version, SideDto side, DateDto session_date) {
        Intrinsics.checkNotNullParameter(cl_ord_id, "cl_ord_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(side, "side");
        return new VenueOrderUpdateDto(new Surrogate(cl_ord_id, order_id, venue_id, session_id, route, fix_conn_id, state, sent_at, confirmed_at, cancel_open_agent, cancel_open_time, cancel_close_agent, cancel_close_time, instrument_type, instrument_id, time_in_force, quantity, price, response_text, response_category, trigger, type2, stop_price, smart_routing_algorithm, rejected_at, routing_metadata, market_hours, executed_notional, version, side, session_date));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public VenueOrderUpdate toProto() {
        String cl_ord_id = this.surrogate.getCl_ord_id();
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto = order_id != null ? order_id.toProto() : null;
        NullableStringDto venue_id = this.surrogate.getVenue_id();
        NullableString proto2 = venue_id != null ? venue_id.toProto() : null;
        String session_id = this.surrogate.getSession_id();
        Route route = (Route) this.surrogate.getRoute().toProto();
        String fix_conn_id = this.surrogate.getFix_conn_id();
        MarketState marketState = (MarketState) this.surrogate.getState().toProto();
        TimeDto sent_at = this.surrogate.getSent_at();
        Time proto3 = sent_at != null ? sent_at.toProto() : null;
        TimeDto confirmed_at = this.surrogate.getConfirmed_at();
        Time proto4 = confirmed_at != null ? confirmed_at.toProto() : null;
        Agent agent = (Agent) this.surrogate.getCancel_open_agent().toProto();
        TimeDto cancel_open_time = this.surrogate.getCancel_open_time();
        Time proto5 = cancel_open_time != null ? cancel_open_time.toProto() : null;
        Agent agent2 = (Agent) this.surrogate.getCancel_close_agent().toProto();
        TimeDto cancel_close_time = this.surrogate.getCancel_close_time();
        Time proto6 = cancel_close_time != null ? cancel_close_time.toProto() : null;
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getInstrument_type().toProto();
        UUIDDto instrument_id = this.surrogate.getInstrument_id();
        UUID proto7 = instrument_id != null ? instrument_id.toProto() : null;
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        DecimalDto quantity = this.surrogate.getQuantity();
        Decimal proto8 = quantity != null ? quantity.toProto() : null;
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto9 = price != null ? price.toProto() : null;
        NullableStringDto response_text = this.surrogate.getResponse_text();
        NullableString proto10 = response_text != null ? response_text.toProto() : null;
        ResponseCategory responseCategory = (ResponseCategory) this.surrogate.getResponse_category().toProto();
        OrderTrigger orderTrigger = (OrderTrigger) this.surrogate.getTrigger().toProto();
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        DecimalDto stop_price = this.surrogate.getStop_price();
        Decimal proto11 = stop_price != null ? stop_price.toProto() : null;
        NullableStringDto smart_routing_algorithm = this.surrogate.getSmart_routing_algorithm();
        NullableString proto12 = smart_routing_algorithm != null ? smart_routing_algorithm.toProto() : null;
        TimeDto rejected_at = this.surrogate.getRejected_at();
        Time proto13 = rejected_at != null ? rejected_at.toProto() : null;
        NullableStringDto routing_metadata = this.surrogate.getRouting_metadata();
        NullableString proto14 = routing_metadata != null ? routing_metadata.toProto() : null;
        MarketHours marketHours = (MarketHours) this.surrogate.getMarket_hours().toProto();
        DecimalDto executed_notional = this.surrogate.getExecuted_notional();
        Decimal proto15 = executed_notional != null ? executed_notional.toProto() : null;
        int version = this.surrogate.getVersion();
        Side side = (Side) this.surrogate.getSide().toProto();
        DateDto session_date = this.surrogate.getSession_date();
        return new VenueOrderUpdate(cl_ord_id, proto, proto2, session_id, route, fix_conn_id, marketState, proto3, proto4, agent, proto5, agent2, proto6, instrumentType, proto7, timeInForce, proto8, proto9, proto10, responseCategory, orderTrigger, orderType, proto11, proto12, proto13, proto14, marketHours, proto15, version, side, session_date != null ? session_date.toProto() : null, null, Integer.MIN_VALUE, null);
    }

    public String toString() {
        return "[VenueOrderUpdateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof VenueOrderUpdateDto) && Intrinsics.areEqual(((VenueOrderUpdateDto) other).surrogate, this.surrogate);
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
    /* compiled from: VenueOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\br\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ¹\u00012\u00020\u0001:\u0004¸\u0001¹\u0001Bì\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001c\u0012\u0017\b\u0002\u0010,\u001a\u00110-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\t00\u0012\b\b\u0002\u00101\u001a\u000202\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104¢\u0006\u0004\b5\u00106BÏ\u0002\b\u0010\u0012\u0006\u00107\u001a\u00020-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010,\u001a\u00020-\u0012\b\u00101\u001a\u0004\u0018\u000102\u0012\b\u00103\u001a\u0004\u0018\u000104\u0012\b\u00108\u001a\u0004\u0018\u000109¢\u0006\u0004\b5\u0010:J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0017HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u001aHÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\"HÆ\u0003J\n\u0010 \u0001\u001a\u00020$HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010¥\u0001\u001a\u00020*HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0019\u0010§\u0001\u001a\u00110-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\t00HÆ\u0003J\n\u0010¨\u0001\u001a\u000202HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u000104HÆ\u0003Jï\u0002\u0010ª\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001c2\u0017\b\u0002\u0010,\u001a\u00110-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\t002\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u000104HÆ\u0001J\u0016\u0010«\u0001\u001a\u00030¬\u00012\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010®\u0001\u001a\u00020-HÖ\u0001J\n\u0010¯\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020\u00002\b\u0010³\u0001\u001a\u00030´\u00012\b\u0010µ\u0001\u001a\u00030¶\u0001H\u0001¢\u0006\u0003\b·\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010<\u001a\u0004\b@\u0010AR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010<\u001a\u0004\bC\u0010DR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010<\u001a\u0004\bF\u0010>R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010<\u001a\u0004\bH\u0010IR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010<\u001a\u0004\bK\u0010>R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010<\u001a\u0004\bM\u0010NR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010<\u001a\u0004\bP\u0010QR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010<\u001a\u0004\bS\u0010QR\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010<\u001a\u0004\bU\u0010VR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010<\u001a\u0004\bX\u0010QR\u001c\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010<\u001a\u0004\bZ\u0010VR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010<\u001a\u0004\b\\\u0010QR\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010<\u001a\u0004\b^\u0010_R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010<\u001a\u0004\ba\u0010AR\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u0010<\u001a\u0004\bc\u0010dR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u0010<\u001a\u0004\bf\u0010gR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u0010<\u001a\u0004\bi\u0010gR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bj\u0010<\u001a\u0004\bk\u0010DR\u001c\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bl\u0010<\u001a\u0004\bm\u0010nR\u001c\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bo\u0010<\u001a\u0004\bp\u0010qR\u001c\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010<\u001a\u0004\bs\u0010tR\u001e\u0010%\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010<\u001a\u0004\bv\u0010gR\u001e\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010<\u001a\u0004\bx\u0010DR\u001e\u0010'\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010<\u001a\u0004\bz\u0010QR\u001e\u0010(\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010<\u001a\u0004\b|\u0010DR\u001c\u0010)\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010<\u001a\u0004\b~\u0010\u007fR \u0010+\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0080\u0001\u0010<\u001a\u0005\b\u0081\u0001\u0010gR.\u0010,\u001a\u00110-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\t008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0082\u0001\u0010<\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u00101\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0085\u0001\u0010<\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0088\u0001\u0010<\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006º\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Surrogate;", "", "cl_ord_id", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "venue_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "session_id", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "fix_conn_id", "state", "Lrosetta/mainst/MarketStateDto;", "sent_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "confirmed_at", "cancel_open_agent", "Lrosetta/order/AgentDto;", "cancel_open_time", "cancel_close_agent", "cancel_close_time", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "instrument_id", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "response_text", "response_category", "Lrosetta/order/ResponseCategoryDto;", "trigger", "Lrosetta/mainst/OrderTriggerDto;", "type", "Lrosetta/mainst/OrderTypeDto;", "stop_price", "smart_routing_algorithm", "rejected_at", "routing_metadata", "market_hours", "Lrosetta/order/MarketHoursDto;", "executed_notional", "version", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "side", "Lrosetta/mainst/SideDto;", "session_date", "Lcom/robinhood/rosetta/common/DateDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Ljava/lang/String;Lrosetta/mainst/MarketStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ILrosetta/mainst/SideDto;Lcom/robinhood/rosetta/common/DateDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Ljava/lang/String;Lrosetta/mainst/MarketStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ILrosetta/mainst/SideDto;Lcom/robinhood/rosetta/common/DateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCl_ord_id$annotations", "()V", "getCl_ord_id", "()Ljava/lang/String;", "getOrder_id$annotations", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getVenue_id$annotations", "getVenue_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getSession_id$annotations", "getSession_id", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getFix_conn_id$annotations", "getFix_conn_id", "getState$annotations", "getState", "()Lrosetta/mainst/MarketStateDto;", "getSent_at$annotations", "getSent_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getConfirmed_at$annotations", "getConfirmed_at", "getCancel_open_agent$annotations", "getCancel_open_agent", "()Lrosetta/order/AgentDto;", "getCancel_open_time$annotations", "getCancel_open_time", "getCancel_close_agent$annotations", "getCancel_close_agent", "getCancel_close_time$annotations", "getCancel_close_time", "getInstrument_type$annotations", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getInstrument_id$annotations", "getInstrument_id", "getTime_in_force$annotations", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getQuantity$annotations", "getQuantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getPrice$annotations", "getPrice", "getResponse_text$annotations", "getResponse_text", "getResponse_category$annotations", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getTrigger$annotations", "getTrigger", "()Lrosetta/mainst/OrderTriggerDto;", "getType$annotations", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getStop_price$annotations", "getStop_price", "getSmart_routing_algorithm$annotations", "getSmart_routing_algorithm", "getRejected_at$annotations", "getRejected_at", "getRouting_metadata$annotations", "getRouting_metadata", "getMarket_hours$annotations", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getExecuted_notional$annotations", "getExecuted_notional", "getVersion$annotations", "getVersion", "()I", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getSession_date$annotations", "getSession_date", "()Lcom/robinhood/rosetta/common/DateDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AgentDto cancel_close_agent;
        private final TimeDto cancel_close_time;
        private final AgentDto cancel_open_agent;
        private final TimeDto cancel_open_time;
        private final String cl_ord_id;
        private final TimeDto confirmed_at;
        private final DecimalDto executed_notional;
        private final String fix_conn_id;
        private final UUIDDto instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final MarketHoursDto market_hours;
        private final UUIDDto order_id;
        private final DecimalDto price;
        private final DecimalDto quantity;
        private final TimeDto rejected_at;
        private final ResponseCategoryDto response_category;
        private final NullableStringDto response_text;
        private final RouteDto route;
        private final NullableStringDto routing_metadata;
        private final TimeDto sent_at;
        private final DateDto session_date;
        private final String session_id;
        private final SideDto side;
        private final NullableStringDto smart_routing_algorithm;
        private final MarketStateDto state;
        private final DecimalDto stop_price;
        private final TimeInForceDto time_in_force;
        private final OrderTriggerDto trigger;
        private final OrderTypeDto type;
        private final NullableStringDto venue_id;
        private final int version;

        public Surrogate() {
            this((String) null, (UUIDDto) null, (NullableStringDto) null, (String) null, (RouteDto) null, (String) null, (MarketStateDto) null, (TimeDto) null, (TimeDto) null, (AgentDto) null, (TimeDto) null, (AgentDto) null, (TimeDto) null, (InstrumentTypeDto) null, (UUIDDto) null, (TimeInForceDto) null, (DecimalDto) null, (DecimalDto) null, (NullableStringDto) null, (ResponseCategoryDto) null, (OrderTriggerDto) null, (OrderTypeDto) null, (DecimalDto) null, (NullableStringDto) null, (TimeDto) null, (NullableStringDto) null, (MarketHoursDto) null, (DecimalDto) null, 0, (SideDto) null, (DateDto) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, UUIDDto uUIDDto, NullableStringDto nullableStringDto, String str2, RouteDto routeDto, String str3, MarketStateDto marketStateDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, TimeDto timeDto3, AgentDto agentDto2, TimeDto timeDto4, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto2, TimeInForceDto timeInForceDto, DecimalDto decimalDto, DecimalDto decimalDto2, NullableStringDto nullableStringDto2, ResponseCategoryDto responseCategoryDto, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto3, TimeDto timeDto5, NullableStringDto nullableStringDto4, MarketHoursDto marketHoursDto, DecimalDto decimalDto4, int i, SideDto sideDto, DateDto dateDto, int i2, Object obj) {
            DateDto dateDto2;
            SideDto sideDto2;
            String str4 = (i2 & 1) != 0 ? surrogate.cl_ord_id : str;
            UUIDDto uUIDDto3 = (i2 & 2) != 0 ? surrogate.order_id : uUIDDto;
            NullableStringDto nullableStringDto5 = (i2 & 4) != 0 ? surrogate.venue_id : nullableStringDto;
            String str5 = (i2 & 8) != 0 ? surrogate.session_id : str2;
            RouteDto routeDto2 = (i2 & 16) != 0 ? surrogate.route : routeDto;
            String str6 = (i2 & 32) != 0 ? surrogate.fix_conn_id : str3;
            MarketStateDto marketStateDto2 = (i2 & 64) != 0 ? surrogate.state : marketStateDto;
            TimeDto timeDto6 = (i2 & 128) != 0 ? surrogate.sent_at : timeDto;
            TimeDto timeDto7 = (i2 & 256) != 0 ? surrogate.confirmed_at : timeDto2;
            AgentDto agentDto3 = (i2 & 512) != 0 ? surrogate.cancel_open_agent : agentDto;
            TimeDto timeDto8 = (i2 & 1024) != 0 ? surrogate.cancel_open_time : timeDto3;
            AgentDto agentDto4 = (i2 & 2048) != 0 ? surrogate.cancel_close_agent : agentDto2;
            TimeDto timeDto9 = (i2 & 4096) != 0 ? surrogate.cancel_close_time : timeDto4;
            InstrumentTypeDto instrumentTypeDto2 = (i2 & 8192) != 0 ? surrogate.instrument_type : instrumentTypeDto;
            String str7 = str4;
            UUIDDto uUIDDto4 = (i2 & 16384) != 0 ? surrogate.instrument_id : uUIDDto2;
            TimeInForceDto timeInForceDto2 = (i2 & 32768) != 0 ? surrogate.time_in_force : timeInForceDto;
            DecimalDto decimalDto5 = (i2 & 65536) != 0 ? surrogate.quantity : decimalDto;
            DecimalDto decimalDto6 = (i2 & 131072) != 0 ? surrogate.price : decimalDto2;
            NullableStringDto nullableStringDto6 = (i2 & 262144) != 0 ? surrogate.response_text : nullableStringDto2;
            ResponseCategoryDto responseCategoryDto2 = (i2 & 524288) != 0 ? surrogate.response_category : responseCategoryDto;
            OrderTriggerDto orderTriggerDto2 = (i2 & 1048576) != 0 ? surrogate.trigger : orderTriggerDto;
            OrderTypeDto orderTypeDto2 = (i2 & 2097152) != 0 ? surrogate.type : orderTypeDto;
            DecimalDto decimalDto7 = (i2 & 4194304) != 0 ? surrogate.stop_price : decimalDto3;
            NullableStringDto nullableStringDto7 = (i2 & 8388608) != 0 ? surrogate.smart_routing_algorithm : nullableStringDto3;
            TimeDto timeDto10 = (i2 & 16777216) != 0 ? surrogate.rejected_at : timeDto5;
            NullableStringDto nullableStringDto8 = (i2 & 33554432) != 0 ? surrogate.routing_metadata : nullableStringDto4;
            MarketHoursDto marketHoursDto2 = (i2 & 67108864) != 0 ? surrogate.market_hours : marketHoursDto;
            DecimalDto decimalDto8 = (i2 & 134217728) != 0 ? surrogate.executed_notional : decimalDto4;
            int i3 = (i2 & 268435456) != 0 ? surrogate.version : i;
            SideDto sideDto3 = (i2 & 536870912) != 0 ? surrogate.side : sideDto;
            if ((i2 & 1073741824) != 0) {
                sideDto2 = sideDto3;
                dateDto2 = surrogate.session_date;
            } else {
                dateDto2 = dateDto;
                sideDto2 = sideDto3;
            }
            return surrogate.copy(str7, uUIDDto3, nullableStringDto5, str5, routeDto2, str6, marketStateDto2, timeDto6, timeDto7, agentDto3, timeDto8, agentDto4, timeDto9, instrumentTypeDto2, uUIDDto4, timeInForceDto2, decimalDto5, decimalDto6, nullableStringDto6, responseCategoryDto2, orderTriggerDto2, orderTypeDto2, decimalDto7, nullableStringDto7, timeDto10, nullableStringDto8, marketHoursDto2, decimalDto8, i3, sideDto2, dateDto2);
        }

        @SerialName("cancelCloseAgent")
        @JsonAnnotations2(names = {"cancel_close_agent"})
        public static /* synthetic */ void getCancel_close_agent$annotations() {
        }

        @SerialName("cancelCloseTime")
        @JsonAnnotations2(names = {"cancel_close_time"})
        public static /* synthetic */ void getCancel_close_time$annotations() {
        }

        @SerialName("cancelOpenAgent")
        @JsonAnnotations2(names = {"cancel_open_agent"})
        public static /* synthetic */ void getCancel_open_agent$annotations() {
        }

        @SerialName("cancelOpenTime")
        @JsonAnnotations2(names = {"cancel_open_time"})
        public static /* synthetic */ void getCancel_open_time$annotations() {
        }

        @SerialName("clOrdId")
        @JsonAnnotations2(names = {"cl_ord_id"})
        public static /* synthetic */ void getCl_ord_id$annotations() {
        }

        @SerialName("confirmedAt")
        @JsonAnnotations2(names = {"confirmed_at"})
        public static /* synthetic */ void getConfirmed_at$annotations() {
        }

        @SerialName("executedNotional")
        @JsonAnnotations2(names = {"executed_notional"})
        public static /* synthetic */ void getExecuted_notional$annotations() {
        }

        @SerialName("fixConnId")
        @JsonAnnotations2(names = {"fix_conn_id"})
        public static /* synthetic */ void getFix_conn_id$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("marketHours")
        @JsonAnnotations2(names = {"market_hours"})
        public static /* synthetic */ void getMarket_hours$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("rejectedAt")
        @JsonAnnotations2(names = {"rejected_at"})
        public static /* synthetic */ void getRejected_at$annotations() {
        }

        @SerialName("responseCategory")
        @JsonAnnotations2(names = {"response_category"})
        public static /* synthetic */ void getResponse_category$annotations() {
        }

        @SerialName("responseText")
        @JsonAnnotations2(names = {"response_text"})
        public static /* synthetic */ void getResponse_text$annotations() {
        }

        @SerialName(PlaceTypes.ROUTE)
        @JsonAnnotations2(names = {PlaceTypes.ROUTE})
        public static /* synthetic */ void getRoute$annotations() {
        }

        @SerialName("routingMetadata")
        @JsonAnnotations2(names = {"routing_metadata"})
        public static /* synthetic */ void getRouting_metadata$annotations() {
        }

        @SerialName("sentAt")
        @JsonAnnotations2(names = {"sent_at"})
        public static /* synthetic */ void getSent_at$annotations() {
        }

        @SerialName("sessionDate")
        @JsonAnnotations2(names = {"session_date"})
        public static /* synthetic */ void getSession_date$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("smartRoutingAlgorithm")
        @JsonAnnotations2(names = {"smart_routing_algorithm"})
        public static /* synthetic */ void getSmart_routing_algorithm$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("venueId")
        @JsonAnnotations2(names = {"venue_id"})
        public static /* synthetic */ void getVenue_id$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCl_ord_id() {
            return this.cl_ord_id;
        }

        /* renamed from: component10, reason: from getter */
        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        /* renamed from: component11, reason: from getter */
        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        /* renamed from: component12, reason: from getter */
        public final AgentDto getCancel_close_agent() {
            return this.cancel_close_agent;
        }

        /* renamed from: component13, reason: from getter */
        public final TimeDto getCancel_close_time() {
            return this.cancel_close_time;
        }

        /* renamed from: component14, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        /* renamed from: component15, reason: from getter */
        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component16, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component17, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component18, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component19, reason: from getter */
        public final NullableStringDto getResponse_text() {
            return this.response_text;
        }

        /* renamed from: component2, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component20, reason: from getter */
        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        /* renamed from: component21, reason: from getter */
        public final OrderTriggerDto getTrigger() {
            return this.trigger;
        }

        /* renamed from: component22, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        /* renamed from: component23, reason: from getter */
        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component24, reason: from getter */
        public final NullableStringDto getSmart_routing_algorithm() {
            return this.smart_routing_algorithm;
        }

        /* renamed from: component25, reason: from getter */
        public final TimeDto getRejected_at() {
            return this.rejected_at;
        }

        /* renamed from: component26, reason: from getter */
        public final NullableStringDto getRouting_metadata() {
            return this.routing_metadata;
        }

        /* renamed from: component27, reason: from getter */
        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        /* renamed from: component28, reason: from getter */
        public final DecimalDto getExecuted_notional() {
            return this.executed_notional;
        }

        /* renamed from: component29, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final NullableStringDto getVenue_id() {
            return this.venue_id;
        }

        /* renamed from: component30, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component31, reason: from getter */
        public final DateDto getSession_date() {
            return this.session_date;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component5, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFix_conn_id() {
            return this.fix_conn_id;
        }

        /* renamed from: component7, reason: from getter */
        public final MarketStateDto getState() {
            return this.state;
        }

        /* renamed from: component8, reason: from getter */
        public final TimeDto getSent_at() {
            return this.sent_at;
        }

        /* renamed from: component9, reason: from getter */
        public final TimeDto getConfirmed_at() {
            return this.confirmed_at;
        }

        public final Surrogate copy(String cl_ord_id, UUIDDto order_id, NullableStringDto venue_id, String session_id, RouteDto route, String fix_conn_id, MarketStateDto state, TimeDto sent_at, TimeDto confirmed_at, AgentDto cancel_open_agent, TimeDto cancel_open_time, AgentDto cancel_close_agent, TimeDto cancel_close_time, InstrumentTypeDto instrument_type, UUIDDto instrument_id, TimeInForceDto time_in_force, DecimalDto quantity, DecimalDto price, NullableStringDto response_text, ResponseCategoryDto response_category, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto stop_price, NullableStringDto smart_routing_algorithm, TimeDto rejected_at, NullableStringDto routing_metadata, MarketHoursDto market_hours, DecimalDto executed_notional, int version, SideDto side, DateDto session_date) {
            Intrinsics.checkNotNullParameter(cl_ord_id, "cl_ord_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(side, "side");
            return new Surrogate(cl_ord_id, order_id, venue_id, session_id, route, fix_conn_id, state, sent_at, confirmed_at, cancel_open_agent, cancel_open_time, cancel_close_agent, cancel_close_time, instrument_type, instrument_id, time_in_force, quantity, price, response_text, response_category, trigger, type2, stop_price, smart_routing_algorithm, rejected_at, routing_metadata, market_hours, executed_notional, version, side, session_date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.cl_ord_id, surrogate.cl_ord_id) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.venue_id, surrogate.venue_id) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && this.route == surrogate.route && Intrinsics.areEqual(this.fix_conn_id, surrogate.fix_conn_id) && this.state == surrogate.state && Intrinsics.areEqual(this.sent_at, surrogate.sent_at) && Intrinsics.areEqual(this.confirmed_at, surrogate.confirmed_at) && this.cancel_open_agent == surrogate.cancel_open_agent && Intrinsics.areEqual(this.cancel_open_time, surrogate.cancel_open_time) && this.cancel_close_agent == surrogate.cancel_close_agent && Intrinsics.areEqual(this.cancel_close_time, surrogate.cancel_close_time) && this.instrument_type == surrogate.instrument_type && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && this.time_in_force == surrogate.time_in_force && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.response_text, surrogate.response_text) && this.response_category == surrogate.response_category && this.trigger == surrogate.trigger && this.type == surrogate.type && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.smart_routing_algorithm, surrogate.smart_routing_algorithm) && Intrinsics.areEqual(this.rejected_at, surrogate.rejected_at) && Intrinsics.areEqual(this.routing_metadata, surrogate.routing_metadata) && this.market_hours == surrogate.market_hours && Intrinsics.areEqual(this.executed_notional, surrogate.executed_notional) && this.version == surrogate.version && this.side == surrogate.side && Intrinsics.areEqual(this.session_date, surrogate.session_date);
        }

        public int hashCode() {
            int iHashCode = this.cl_ord_id.hashCode() * 31;
            UUIDDto uUIDDto = this.order_id;
            int iHashCode2 = (iHashCode + (uUIDDto == null ? 0 : uUIDDto.hashCode())) * 31;
            NullableStringDto nullableStringDto = this.venue_id;
            int iHashCode3 = (((((((((iHashCode2 + (nullableStringDto == null ? 0 : nullableStringDto.hashCode())) * 31) + this.session_id.hashCode()) * 31) + this.route.hashCode()) * 31) + this.fix_conn_id.hashCode()) * 31) + this.state.hashCode()) * 31;
            TimeDto timeDto = this.sent_at;
            int iHashCode4 = (iHashCode3 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.confirmed_at;
            int iHashCode5 = (((iHashCode4 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + this.cancel_open_agent.hashCode()) * 31;
            TimeDto timeDto3 = this.cancel_open_time;
            int iHashCode6 = (((iHashCode5 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31) + this.cancel_close_agent.hashCode()) * 31;
            TimeDto timeDto4 = this.cancel_close_time;
            int iHashCode7 = (((iHashCode6 + (timeDto4 == null ? 0 : timeDto4.hashCode())) * 31) + this.instrument_type.hashCode()) * 31;
            UUIDDto uUIDDto2 = this.instrument_id;
            int iHashCode8 = (((iHashCode7 + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.time_in_force.hashCode()) * 31;
            DecimalDto decimalDto = this.quantity;
            int iHashCode9 = (iHashCode8 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            DecimalDto decimalDto2 = this.price;
            int iHashCode10 = (iHashCode9 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            NullableStringDto nullableStringDto2 = this.response_text;
            int iHashCode11 = (((((((iHashCode10 + (nullableStringDto2 == null ? 0 : nullableStringDto2.hashCode())) * 31) + this.response_category.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.type.hashCode()) * 31;
            DecimalDto decimalDto3 = this.stop_price;
            int iHashCode12 = (iHashCode11 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            NullableStringDto nullableStringDto3 = this.smart_routing_algorithm;
            int iHashCode13 = (iHashCode12 + (nullableStringDto3 == null ? 0 : nullableStringDto3.hashCode())) * 31;
            TimeDto timeDto5 = this.rejected_at;
            int iHashCode14 = (iHashCode13 + (timeDto5 == null ? 0 : timeDto5.hashCode())) * 31;
            NullableStringDto nullableStringDto4 = this.routing_metadata;
            int iHashCode15 = (((iHashCode14 + (nullableStringDto4 == null ? 0 : nullableStringDto4.hashCode())) * 31) + this.market_hours.hashCode()) * 31;
            DecimalDto decimalDto4 = this.executed_notional;
            int iHashCode16 = (((((iHashCode15 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31) + Integer.hashCode(this.version)) * 31) + this.side.hashCode()) * 31;
            DateDto dateDto = this.session_date;
            return iHashCode16 + (dateDto != null ? dateDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(cl_ord_id=" + this.cl_ord_id + ", order_id=" + this.order_id + ", venue_id=" + this.venue_id + ", session_id=" + this.session_id + ", route=" + this.route + ", fix_conn_id=" + this.fix_conn_id + ", state=" + this.state + ", sent_at=" + this.sent_at + ", confirmed_at=" + this.confirmed_at + ", cancel_open_agent=" + this.cancel_open_agent + ", cancel_open_time=" + this.cancel_open_time + ", cancel_close_agent=" + this.cancel_close_agent + ", cancel_close_time=" + this.cancel_close_time + ", instrument_type=" + this.instrument_type + ", instrument_id=" + this.instrument_id + ", time_in_force=" + this.time_in_force + ", quantity=" + this.quantity + ", price=" + this.price + ", response_text=" + this.response_text + ", response_category=" + this.response_category + ", trigger=" + this.trigger + ", type=" + this.type + ", stop_price=" + this.stop_price + ", smart_routing_algorithm=" + this.smart_routing_algorithm + ", rejected_at=" + this.rejected_at + ", routing_metadata=" + this.routing_metadata + ", market_hours=" + this.market_hours + ", executed_notional=" + this.executed_notional + ", version=" + this.version + ", side=" + this.side + ", session_date=" + this.session_date + ")";
        }

        /* compiled from: VenueOrderUpdateDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return VenueOrderUpdateDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, UUIDDto uUIDDto, NullableStringDto nullableStringDto, String str2, RouteDto routeDto, String str3, MarketStateDto marketStateDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, TimeDto timeDto3, AgentDto agentDto2, TimeDto timeDto4, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto2, TimeInForceDto timeInForceDto, DecimalDto decimalDto, DecimalDto decimalDto2, NullableStringDto nullableStringDto2, ResponseCategoryDto responseCategoryDto, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto3, TimeDto timeDto5, NullableStringDto nullableStringDto4, MarketHoursDto marketHoursDto, DecimalDto decimalDto4, int i2, SideDto sideDto, DateDto dateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.cl_ord_id = "";
            } else {
                this.cl_ord_id = str;
            }
            if ((i & 2) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto;
            }
            if ((i & 4) == 0) {
                this.venue_id = null;
            } else {
                this.venue_id = nullableStringDto;
            }
            if ((i & 8) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            if ((i & 16) == 0) {
                this.route = RouteDto.INSTANCE.getZeroValue();
            } else {
                this.route = routeDto;
            }
            if ((i & 32) == 0) {
                this.fix_conn_id = "";
            } else {
                this.fix_conn_id = str3;
            }
            if ((i & 64) == 0) {
                this.state = MarketStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = marketStateDto;
            }
            if ((i & 128) == 0) {
                this.sent_at = null;
            } else {
                this.sent_at = timeDto;
            }
            if ((i & 256) == 0) {
                this.confirmed_at = null;
            } else {
                this.confirmed_at = timeDto2;
            }
            if ((i & 512) == 0) {
                this.cancel_open_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.cancel_open_agent = agentDto;
            }
            if ((i & 1024) == 0) {
                this.cancel_open_time = null;
            } else {
                this.cancel_open_time = timeDto3;
            }
            if ((i & 2048) == 0) {
                this.cancel_close_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.cancel_close_agent = agentDto2;
            }
            if ((i & 4096) == 0) {
                this.cancel_close_time = null;
            } else {
                this.cancel_close_time = timeDto4;
            }
            this.instrument_type = (i & 8192) == 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto;
            if ((i & 16384) == 0) {
                this.instrument_id = null;
            } else {
                this.instrument_id = uUIDDto2;
            }
            this.time_in_force = (32768 & i) == 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
            if ((65536 & i) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto;
            }
            if ((131072 & i) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto2;
            }
            if ((262144 & i) == 0) {
                this.response_text = null;
            } else {
                this.response_text = nullableStringDto2;
            }
            this.response_category = (524288 & i) == 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto;
            this.trigger = (1048576 & i) == 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto;
            this.type = (2097152 & i) == 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto;
            if ((4194304 & i) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = decimalDto3;
            }
            if ((8388608 & i) == 0) {
                this.smart_routing_algorithm = null;
            } else {
                this.smart_routing_algorithm = nullableStringDto3;
            }
            if ((16777216 & i) == 0) {
                this.rejected_at = null;
            } else {
                this.rejected_at = timeDto5;
            }
            if ((33554432 & i) == 0) {
                this.routing_metadata = null;
            } else {
                this.routing_metadata = nullableStringDto4;
            }
            this.market_hours = (67108864 & i) == 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto;
            if ((134217728 & i) == 0) {
                this.executed_notional = null;
            } else {
                this.executed_notional = decimalDto4;
            }
            this.version = (268435456 & i) == 0 ? 0 : i2;
            this.side = (536870912 & i) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            if ((i & 1073741824) == 0) {
                this.session_date = null;
            } else {
                this.session_date = dateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.cl_ord_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.cl_ord_id);
            }
            UUIDDto uUIDDto = self.order_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            NullableStringDto nullableStringDto = self.venue_id;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.session_id);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, RouteDto.Serializer.INSTANCE, self.route);
            }
            if (!Intrinsics.areEqual(self.fix_conn_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.fix_conn_id);
            }
            if (self.state != MarketStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, MarketStateDto.Serializer.INSTANCE, self.state);
            }
            TimeDto timeDto = self.sent_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.confirmed_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            AgentDto agentDto = self.cancel_open_agent;
            AgentDto.Companion companion = AgentDto.INSTANCE;
            if (agentDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, AgentDto.Serializer.INSTANCE, self.cancel_open_agent);
            }
            TimeDto timeDto3 = self.cancel_open_time;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            if (self.cancel_close_agent != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, AgentDto.Serializer.INSTANCE, self.cancel_close_agent);
            }
            TimeDto timeDto4 = self.cancel_close_time;
            if (timeDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, TimeDto.Serializer.INSTANCE, timeDto4);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            UUIDDto uUIDDto2 = self.instrument_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 15, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            DecimalDto decimalDto = self.quantity;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.price;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            NullableStringDto nullableStringDto2 = self.response_text;
            if (nullableStringDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, NullableStringDto.Serializer.INSTANCE, nullableStringDto2);
            }
            if (self.response_category != ResponseCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 19, ResponseCategoryDto.Serializer.INSTANCE, self.response_category);
            }
            if (self.trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 20, OrderTriggerDto.Serializer.INSTANCE, self.trigger);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 21, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            DecimalDto decimalDto3 = self.stop_price;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            NullableStringDto nullableStringDto3 = self.smart_routing_algorithm;
            if (nullableStringDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, NullableStringDto.Serializer.INSTANCE, nullableStringDto3);
            }
            TimeDto timeDto5 = self.rejected_at;
            if (timeDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, TimeDto.Serializer.INSTANCE, timeDto5);
            }
            NullableStringDto nullableStringDto4 = self.routing_metadata;
            if (nullableStringDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, NullableStringDto.Serializer.INSTANCE, nullableStringDto4);
            }
            if (self.market_hours != MarketHoursDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 26, MarketHoursDto.Serializer.INSTANCE, self.market_hours);
            }
            DecimalDto decimalDto4 = self.executed_notional;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            int i = self.version;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 28, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 29, SideDto.Serializer.INSTANCE, self.side);
            }
            DateDto dateDto = self.session_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, DateDto.Serializer.INSTANCE, dateDto);
            }
        }

        public Surrogate(String cl_ord_id, UUIDDto uUIDDto, NullableStringDto nullableStringDto, String session_id, RouteDto route, String fix_conn_id, MarketStateDto state, TimeDto timeDto, TimeDto timeDto2, AgentDto cancel_open_agent, TimeDto timeDto3, AgentDto cancel_close_agent, TimeDto timeDto4, InstrumentTypeDto instrument_type, UUIDDto uUIDDto2, TimeInForceDto time_in_force, DecimalDto decimalDto, DecimalDto decimalDto2, NullableStringDto nullableStringDto2, ResponseCategoryDto response_category, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto decimalDto3, NullableStringDto nullableStringDto3, TimeDto timeDto5, NullableStringDto nullableStringDto4, MarketHoursDto market_hours, DecimalDto decimalDto4, int i, SideDto side, DateDto dateDto) {
            Intrinsics.checkNotNullParameter(cl_ord_id, "cl_ord_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(side, "side");
            this.cl_ord_id = cl_ord_id;
            this.order_id = uUIDDto;
            this.venue_id = nullableStringDto;
            this.session_id = session_id;
            this.route = route;
            this.fix_conn_id = fix_conn_id;
            this.state = state;
            this.sent_at = timeDto;
            this.confirmed_at = timeDto2;
            this.cancel_open_agent = cancel_open_agent;
            this.cancel_open_time = timeDto3;
            this.cancel_close_agent = cancel_close_agent;
            this.cancel_close_time = timeDto4;
            this.instrument_type = instrument_type;
            this.instrument_id = uUIDDto2;
            this.time_in_force = time_in_force;
            this.quantity = decimalDto;
            this.price = decimalDto2;
            this.response_text = nullableStringDto2;
            this.response_category = response_category;
            this.trigger = trigger;
            this.type = type2;
            this.stop_price = decimalDto3;
            this.smart_routing_algorithm = nullableStringDto3;
            this.rejected_at = timeDto5;
            this.routing_metadata = nullableStringDto4;
            this.market_hours = market_hours;
            this.executed_notional = decimalDto4;
            this.version = i;
            this.side = side;
            this.session_date = dateDto;
        }

        public /* synthetic */ Surrogate(String str, UUIDDto uUIDDto, NullableStringDto nullableStringDto, String str2, RouteDto routeDto, String str3, MarketStateDto marketStateDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, TimeDto timeDto3, AgentDto agentDto2, TimeDto timeDto4, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto2, TimeInForceDto timeInForceDto, DecimalDto decimalDto, DecimalDto decimalDto2, NullableStringDto nullableStringDto2, ResponseCategoryDto responseCategoryDto, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto3, NullableStringDto nullableStringDto3, TimeDto timeDto5, NullableStringDto nullableStringDto4, MarketHoursDto marketHoursDto, DecimalDto decimalDto4, int i, SideDto sideDto, DateDto dateDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : uUIDDto, (i2 & 4) != 0 ? null : nullableStringDto, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 32) == 0 ? str3 : "", (i2 & 64) != 0 ? MarketStateDto.INSTANCE.getZeroValue() : marketStateDto, (i2 & 128) != 0 ? null : timeDto, (i2 & 256) != 0 ? null : timeDto2, (i2 & 512) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i2 & 1024) != 0 ? null : timeDto3, (i2 & 2048) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i2 & 4096) != 0 ? null : timeDto4, (i2 & 8192) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i2 & 16384) != 0 ? null : uUIDDto2, (i2 & 32768) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 65536) != 0 ? null : decimalDto, (i2 & 131072) != 0 ? null : decimalDto2, (i2 & 262144) != 0 ? null : nullableStringDto2, (i2 & 524288) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i2 & 1048576) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i2 & 2097152) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i2 & 4194304) != 0 ? null : decimalDto3, (i2 & 8388608) != 0 ? null : nullableStringDto3, (i2 & 16777216) != 0 ? null : timeDto5, (i2 & 33554432) != 0 ? null : nullableStringDto4, (i2 & 67108864) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i2 & 134217728) != 0 ? null : decimalDto4, (i2 & 268435456) != 0 ? 0 : i, (i2 & 536870912) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 1073741824) != 0 ? null : dateDto);
        }

        public final String getCl_ord_id() {
            return this.cl_ord_id;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final NullableStringDto getVenue_id() {
            return this.venue_id;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public final String getFix_conn_id() {
            return this.fix_conn_id;
        }

        public final MarketStateDto getState() {
            return this.state;
        }

        public final TimeDto getSent_at() {
            return this.sent_at;
        }

        public final TimeDto getConfirmed_at() {
            return this.confirmed_at;
        }

        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        public final AgentDto getCancel_close_agent() {
            return this.cancel_close_agent;
        }

        public final TimeDto getCancel_close_time() {
            return this.cancel_close_time;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final NullableStringDto getResponse_text() {
            return this.response_text;
        }

        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        public final OrderTriggerDto getTrigger() {
            return this.trigger;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        public final NullableStringDto getSmart_routing_algorithm() {
            return this.smart_routing_algorithm;
        }

        public final TimeDto getRejected_at() {
            return this.rejected_at;
        }

        public final NullableStringDto getRouting_metadata() {
            return this.routing_metadata;
        }

        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        public final DecimalDto getExecuted_notional() {
            return this.executed_notional;
        }

        public final int getVersion() {
            return this.version;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final DateDto getSession_date() {
            return this.session_date;
        }
    }

    /* compiled from: VenueOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto;", "Lcom/robinhood/rosetta/mainst/VenueOrderUpdate;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<VenueOrderUpdateDto, VenueOrderUpdate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VenueOrderUpdateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<VenueOrderUpdateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<VenueOrderUpdateDto> getBinaryBase64Serializer() {
            return (KSerializer) VenueOrderUpdateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<VenueOrderUpdate> getProtoAdapter() {
            return VenueOrderUpdate.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public VenueOrderUpdateDto getZeroValue() {
            return VenueOrderUpdateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public VenueOrderUpdateDto fromProto(VenueOrderUpdate proto) {
            UUIDDto uUIDDto;
            DecimalDto decimalDto;
            NullableStringDto nullableStringDto;
            OrderTriggerDto orderTriggerDto;
            DecimalDto decimalDto2;
            TimeDto timeDto;
            MarketHoursDto marketHoursDto;
            DecimalDto decimalDtoFromProto;
            Intrinsics.checkNotNullParameter(proto, "proto");
            String cl_ord_id = proto.getCl_ord_id();
            UUID order_id = proto.getOrder_id();
            UUIDDto uUIDDtoFromProto = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            NullableString venue_id = proto.getVenue_id();
            NullableStringDto nullableStringDtoFromProto = venue_id != null ? NullableStringDto.INSTANCE.fromProto(venue_id) : null;
            String session_id = proto.getSession_id();
            RouteDto routeDtoFromProto = RouteDto.INSTANCE.fromProto(proto.getRoute());
            String fix_conn_id = proto.getFix_conn_id();
            MarketStateDto marketStateDtoFromProto = MarketStateDto.INSTANCE.fromProto(proto.getState());
            Time sent_at = proto.getSent_at();
            TimeDto timeDtoFromProto = sent_at != null ? TimeDto.INSTANCE.fromProto(sent_at) : null;
            Time confirmed_at = proto.getConfirmed_at();
            TimeDto timeDtoFromProto2 = confirmed_at != null ? TimeDto.INSTANCE.fromProto(confirmed_at) : null;
            AgentDto.Companion companion = AgentDto.INSTANCE;
            AgentDto agentDtoFromProto = companion.fromProto(proto.getCancel_open_agent());
            Time cancel_open_time = proto.getCancel_open_time();
            TimeDto timeDtoFromProto3 = cancel_open_time != null ? TimeDto.INSTANCE.fromProto(cancel_open_time) : null;
            AgentDto agentDtoFromProto2 = companion.fromProto(proto.getCancel_close_agent());
            Time cancel_close_time = proto.getCancel_close_time();
            TimeDto timeDtoFromProto4 = cancel_close_time != null ? TimeDto.INSTANCE.fromProto(cancel_close_time) : null;
            InstrumentTypeDto instrumentTypeDtoFromProto = InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type());
            UUID instrument_id = proto.getInstrument_id();
            UUIDDto uUIDDto2 = uUIDDtoFromProto;
            UUIDDto uUIDDtoFromProto2 = instrument_id != null ? UUIDDto.INSTANCE.fromProto(instrument_id) : null;
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            Decimal quantity = proto.getQuantity();
            DecimalDto decimalDtoFromProto2 = quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null;
            Decimal price = proto.getPrice();
            DecimalDto decimalDto3 = decimalDtoFromProto2;
            DecimalDto decimalDtoFromProto3 = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            NullableString response_text = proto.getResponse_text();
            DecimalDto decimalDto4 = decimalDtoFromProto3;
            NullableStringDto nullableStringDtoFromProto2 = response_text != null ? NullableStringDto.INSTANCE.fromProto(response_text) : null;
            ResponseCategoryDto responseCategoryDtoFromProto = ResponseCategoryDto.INSTANCE.fromProto(proto.getResponse_category());
            OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getTrigger());
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            Decimal stop_price = proto.getStop_price();
            DecimalDto decimalDtoFromProto4 = stop_price != null ? DecimalDto.INSTANCE.fromProto(stop_price) : null;
            NullableString smart_routing_algorithm = proto.getSmart_routing_algorithm();
            DecimalDto decimalDto5 = decimalDtoFromProto4;
            NullableStringDto nullableStringDtoFromProto3 = smart_routing_algorithm != null ? NullableStringDto.INSTANCE.fromProto(smart_routing_algorithm) : null;
            Time rejected_at = proto.getRejected_at();
            NullableStringDto nullableStringDto2 = nullableStringDtoFromProto3;
            TimeDto timeDtoFromProto5 = rejected_at != null ? TimeDto.INSTANCE.fromProto(rejected_at) : null;
            NullableString routing_metadata = proto.getRouting_metadata();
            TimeDto timeDto2 = timeDtoFromProto5;
            NullableStringDto nullableStringDtoFromProto4 = routing_metadata != null ? NullableStringDto.INSTANCE.fromProto(routing_metadata) : null;
            MarketHoursDto marketHoursDtoFromProto = MarketHoursDto.INSTANCE.fromProto(proto.getMarket_hours());
            Decimal executed_notional = proto.getExecuted_notional();
            if (executed_notional != null) {
                decimalDtoFromProto = DecimalDto.INSTANCE.fromProto(executed_notional);
                uUIDDto = uUIDDtoFromProto2;
                decimalDto = decimalDto3;
                nullableStringDto = nullableStringDtoFromProto2;
                orderTriggerDto = orderTriggerDtoFromProto;
                decimalDto2 = decimalDto5;
                timeDto = timeDto2;
                marketHoursDto = marketHoursDtoFromProto;
            } else {
                uUIDDto = uUIDDtoFromProto2;
                decimalDto = decimalDto3;
                nullableStringDto = nullableStringDtoFromProto2;
                orderTriggerDto = orderTriggerDtoFromProto;
                decimalDto2 = decimalDto5;
                timeDto = timeDto2;
                marketHoursDto = marketHoursDtoFromProto;
                decimalDtoFromProto = null;
            }
            int version = proto.getVersion();
            DecimalDto decimalDto6 = decimalDtoFromProto;
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            Date session_date = proto.getSession_date();
            return new VenueOrderUpdateDto(new Surrogate(cl_ord_id, uUIDDto2, nullableStringDtoFromProto, session_id, routeDtoFromProto, fix_conn_id, marketStateDtoFromProto, timeDtoFromProto, timeDtoFromProto2, agentDtoFromProto, timeDtoFromProto3, agentDtoFromProto2, timeDtoFromProto4, instrumentTypeDtoFromProto, uUIDDto, timeInForceDtoFromProto, decimalDto, decimalDto4, nullableStringDto, responseCategoryDtoFromProto, orderTriggerDto, orderTypeDtoFromProto, decimalDto2, nullableStringDto2, timeDto, nullableStringDtoFromProto4, marketHoursDto, decimalDto6, version, sideDtoFromProto, session_date != null ? DateDto.INSTANCE.fromProto(session_date) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.VenueOrderUpdateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VenueOrderUpdateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new VenueOrderUpdateDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, Integer.MAX_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: VenueOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<VenueOrderUpdateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.VenueOrderUpdate", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, VenueOrderUpdateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public VenueOrderUpdateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new VenueOrderUpdateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: VenueOrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/VenueOrderUpdateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.VenueOrderUpdateDto";
        }
    }
}
