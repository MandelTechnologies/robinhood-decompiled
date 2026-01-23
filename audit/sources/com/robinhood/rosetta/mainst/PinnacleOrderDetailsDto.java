package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarComposable5;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.CancelLogDto;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.PinnacleLegDetailsDto;
import com.robinhood.rosetta.mainst.PinnacleOrderDetailsDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderStateDto;
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
import rosetta.order.ResponseCategory;
import rosetta.order.ResponseCategoryDto;

/* compiled from: PinnacleOrderDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004]^_`B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bç\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010(\u001a\u00020$\u0012\b\b\u0002\u0010)\u001a\u00020*¢\u0006\u0004\b\u0006\u0010+Jä\u0001\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020*J\b\u0010O\u001a\u00020\u0002H\u0016J\b\u0010P\u001a\u00020$H\u0016J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0096\u0002J\b\u0010U\u001a\u00020VH\u0016J\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020VH\u0016J\b\u0010\\\u001a\u00020VH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b?\u00108R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b@\u00108R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bE\u00108R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bJ\u0010GR\u0011\u0010(\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bK\u0010GR\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Surrogate;)V", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "Lrosetta/mainst/OrderStateDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "last_sent_at", "created_agent", "Lrosetta/order/AgentDto;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "latest_cancel_log", "Lcom/robinhood/rosetta/mainst/CancelLogDto;", "response_category", "Lrosetta/order/ResponseCategoryDto;", "legs", "", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "side", "Lrosetta/mainst/SideDto;", "type", "Lrosetta/mainst/OrderTypeDto;", "quantity", "symbol", "", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "clearing_firm", "response_text", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/CancelLogDto;Lrosetta/order/ResponseCategoryDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/TimeInForceDto;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getOrder_status", "()Lrosetta/mainst/OrderStateDto;", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getLast_sent_at", "getCreated_agent", "()Lrosetta/order/AgentDto;", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getLatest_cancel_log", "()Lcom/robinhood/rosetta/mainst/CancelLogDto;", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getLegs", "()Ljava/util/List;", "getPrice", "getStop_price", "getSide", "()Lrosetta/mainst/SideDto;", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getQuantity", "getSymbol", "()Ljava/lang/String;", "getRoute", "()Lrosetta/mainst/RouteDto;", "getClearing_firm", "getResponse_text", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class PinnacleOrderDetailsDto implements Dto3<PinnacleOrderDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PinnacleOrderDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PinnacleOrderDetailsDto, PinnacleOrderDetails>> binaryBase64Serializer$delegate;
    private static final PinnacleOrderDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PinnacleOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PinnacleOrderDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final OrderStateDto getOrder_status() {
        return this.surrogate.getOrder_status();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getLast_sent_at() {
        return this.surrogate.getLast_sent_at();
    }

    public final AgentDto getCreated_agent() {
        return this.surrogate.getCreated_agent();
    }

    public final DecimalDto getCancelled_quantity() {
        return this.surrogate.getCancelled_quantity();
    }

    public final CancelLogDto getLatest_cancel_log() {
        return this.surrogate.getLatest_cancel_log();
    }

    public final ResponseCategoryDto getResponse_category() {
        return this.surrogate.getResponse_category();
    }

    public final List<PinnacleLegDetailsDto> getLegs() {
        return this.surrogate.getLegs();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final DecimalDto getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final String getClearing_firm() {
        return this.surrogate.getClearing_firm();
    }

    public final String getResponse_text() {
        return this.surrogate.getResponse_text();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public /* synthetic */ PinnacleOrderDetailsDto(UUIDDto uUIDDto, OrderStateDto orderStateDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, DecimalDto decimalDto, CancelLogDto cancelLogDto, ResponseCategoryDto responseCategoryDto, List list, DecimalDto decimalDto2, DecimalDto decimalDto3, SideDto sideDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto4, String str, RouteDto routeDto, String str2, String str3, TimeInForceDto timeInForceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i & 4) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : timeDto2, (i & 32) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 64) != 0 ? null : decimalDto, (i & 128) != 0 ? null : cancelLogDto, (i & 256) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i & 512) != 0 ? CollectionsKt.emptyList() : list, (i & 1024) != 0 ? null : decimalDto2, (i & 2048) != 0 ? null : decimalDto3, (i & 4096) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8192) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 16384) != 0 ? null : decimalDto4, (i & 32768) != 0 ? "" : str, (i & 65536) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i & 131072) != 0 ? "" : str2, (i & 262144) == 0 ? str3 : "", (i & 524288) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnacleOrderDetailsDto(UUIDDto uUIDDto, OrderStateDto order_status, InstrumentTypeDto instrument_type, TimeDto timeDto, TimeDto timeDto2, AgentDto created_agent, DecimalDto decimalDto, CancelLogDto cancelLogDto, ResponseCategoryDto response_category, List<PinnacleLegDetailsDto> legs, DecimalDto decimalDto2, DecimalDto decimalDto3, SideDto side, OrderTypeDto type2, DecimalDto decimalDto4, String symbol, RouteDto route, String clearing_firm, String response_text, TimeInForceDto time_in_force) {
        this(new Surrogate(uUIDDto, order_status, instrument_type, timeDto, timeDto2, created_agent, decimalDto, cancelLogDto, response_category, legs, decimalDto2, decimalDto3, side, type2, decimalDto4, symbol, route, clearing_firm, response_text, time_in_force));
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(clearing_firm, "clearing_firm");
        Intrinsics.checkNotNullParameter(response_text, "response_text");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
    }

    public static /* synthetic */ PinnacleOrderDetailsDto copy$default(PinnacleOrderDetailsDto pinnacleOrderDetailsDto, UUIDDto uUIDDto, OrderStateDto orderStateDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, DecimalDto decimalDto, CancelLogDto cancelLogDto, ResponseCategoryDto responseCategoryDto, List list, DecimalDto decimalDto2, DecimalDto decimalDto3, SideDto sideDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto4, String str, RouteDto routeDto, String str2, String str3, TimeInForceDto timeInForceDto, int i, Object obj) {
        TimeInForceDto time_in_force;
        String str4;
        UUIDDto order_id = (i & 1) != 0 ? pinnacleOrderDetailsDto.surrogate.getOrder_id() : uUIDDto;
        OrderStateDto order_status = (i & 2) != 0 ? pinnacleOrderDetailsDto.surrogate.getOrder_status() : orderStateDto;
        InstrumentTypeDto instrument_type = (i & 4) != 0 ? pinnacleOrderDetailsDto.surrogate.getInstrument_type() : instrumentTypeDto;
        TimeDto created_at = (i & 8) != 0 ? pinnacleOrderDetailsDto.surrogate.getCreated_at() : timeDto;
        TimeDto last_sent_at = (i & 16) != 0 ? pinnacleOrderDetailsDto.surrogate.getLast_sent_at() : timeDto2;
        AgentDto created_agent = (i & 32) != 0 ? pinnacleOrderDetailsDto.surrogate.getCreated_agent() : agentDto;
        DecimalDto cancelled_quantity = (i & 64) != 0 ? pinnacleOrderDetailsDto.surrogate.getCancelled_quantity() : decimalDto;
        CancelLogDto latest_cancel_log = (i & 128) != 0 ? pinnacleOrderDetailsDto.surrogate.getLatest_cancel_log() : cancelLogDto;
        ResponseCategoryDto response_category = (i & 256) != 0 ? pinnacleOrderDetailsDto.surrogate.getResponse_category() : responseCategoryDto;
        List legs = (i & 512) != 0 ? pinnacleOrderDetailsDto.surrogate.getLegs() : list;
        DecimalDto price = (i & 1024) != 0 ? pinnacleOrderDetailsDto.surrogate.getPrice() : decimalDto2;
        DecimalDto stop_price = (i & 2048) != 0 ? pinnacleOrderDetailsDto.surrogate.getStop_price() : decimalDto3;
        SideDto side = (i & 4096) != 0 ? pinnacleOrderDetailsDto.surrogate.getSide() : sideDto;
        OrderTypeDto type2 = (i & 8192) != 0 ? pinnacleOrderDetailsDto.surrogate.getType() : orderTypeDto;
        UUIDDto uUIDDto2 = order_id;
        DecimalDto quantity = (i & 16384) != 0 ? pinnacleOrderDetailsDto.surrogate.getQuantity() : decimalDto4;
        String symbol = (i & 32768) != 0 ? pinnacleOrderDetailsDto.surrogate.getSymbol() : str;
        RouteDto route = (i & 65536) != 0 ? pinnacleOrderDetailsDto.surrogate.getRoute() : routeDto;
        String clearing_firm = (i & 131072) != 0 ? pinnacleOrderDetailsDto.surrogate.getClearing_firm() : str2;
        String response_text = (i & 262144) != 0 ? pinnacleOrderDetailsDto.surrogate.getResponse_text() : str3;
        if ((i & 524288) != 0) {
            str4 = response_text;
            time_in_force = pinnacleOrderDetailsDto.surrogate.getTime_in_force();
        } else {
            time_in_force = timeInForceDto;
            str4 = response_text;
        }
        return pinnacleOrderDetailsDto.copy(uUIDDto2, order_status, instrument_type, created_at, last_sent_at, created_agent, cancelled_quantity, latest_cancel_log, response_category, legs, price, stop_price, side, type2, quantity, symbol, route, clearing_firm, str4, time_in_force);
    }

    public final PinnacleOrderDetailsDto copy(UUIDDto order_id, OrderStateDto order_status, InstrumentTypeDto instrument_type, TimeDto created_at, TimeDto last_sent_at, AgentDto created_agent, DecimalDto cancelled_quantity, CancelLogDto latest_cancel_log, ResponseCategoryDto response_category, List<PinnacleLegDetailsDto> legs, DecimalDto price, DecimalDto stop_price, SideDto side, OrderTypeDto type2, DecimalDto quantity, String symbol, RouteDto route, String clearing_firm, String response_text, TimeInForceDto time_in_force) {
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(clearing_firm, "clearing_firm");
        Intrinsics.checkNotNullParameter(response_text, "response_text");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        return new PinnacleOrderDetailsDto(new Surrogate(order_id, order_status, instrument_type, created_at, last_sent_at, created_agent, cancelled_quantity, latest_cancel_log, response_category, legs, price, stop_price, side, type2, quantity, symbol, route, clearing_firm, response_text, time_in_force));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PinnacleOrderDetails toProto() {
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto = order_id != null ? order_id.toProto() : null;
        OrderState orderState = (OrderState) this.surrogate.getOrder_status().toProto();
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getInstrument_type().toProto();
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto2 = created_at != null ? created_at.toProto() : null;
        TimeDto last_sent_at = this.surrogate.getLast_sent_at();
        Time proto3 = last_sent_at != null ? last_sent_at.toProto() : null;
        Agent agent = (Agent) this.surrogate.getCreated_agent().toProto();
        DecimalDto cancelled_quantity = this.surrogate.getCancelled_quantity();
        Decimal proto4 = cancelled_quantity != null ? cancelled_quantity.toProto() : null;
        CancelLogDto latest_cancel_log = this.surrogate.getLatest_cancel_log();
        CancelLog proto5 = latest_cancel_log != null ? latest_cancel_log.toProto() : null;
        ResponseCategory responseCategory = (ResponseCategory) this.surrogate.getResponse_category().toProto();
        List<PinnacleLegDetailsDto> legs = this.surrogate.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((PinnacleLegDetailsDto) it.next()).toProto());
        }
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto6 = price != null ? price.toProto() : null;
        DecimalDto stop_price = this.surrogate.getStop_price();
        Decimal proto7 = stop_price != null ? stop_price.toProto() : null;
        Side side = (Side) this.surrogate.getSide().toProto();
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        DecimalDto quantity = this.surrogate.getQuantity();
        return new PinnacleOrderDetails(proto, orderState, instrumentType, proto2, proto3, agent, proto4, proto5, responseCategory, arrayList, proto6, proto7, side, orderType, quantity != null ? quantity.toProto() : null, this.surrogate.getSymbol(), (Route) this.surrogate.getRoute().toProto(), this.surrogate.getClearing_firm(), this.surrogate.getResponse_text(), (TimeInForce) this.surrogate.getTime_in_force().toProto(), null, 1048576, null);
    }

    public String toString() {
        return "[PinnacleOrderDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PinnacleOrderDetailsDto) && Intrinsics.areEqual(((PinnacleOrderDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PinnacleOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u0004\u0085\u0001\u0086\u0001Bå\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010\"\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0004\b%\u0010&Bé\u0001\b\u0010\u0012\u0006\u0010'\u001a\u00020(\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0004\b%\u0010+J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010h\u001a\u00020\fHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010k\u001a\u00020\u0012HÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010o\u001a\u00020\u0019HÆ\u0003J\t\u0010p\u001a\u00020\u001bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010r\u001a\u00020\u001eHÆ\u0003J\t\u0010s\u001a\u00020 HÆ\u0003J\t\u0010t\u001a\u00020\u001eHÆ\u0003J\t\u0010u\u001a\u00020\u001eHÆ\u0003J\t\u0010v\u001a\u00020$HÆ\u0003Jç\u0001\u0010w\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020$HÆ\u0001J\u0013\u0010x\u001a\u00020y2\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010{\u001a\u00020(HÖ\u0001J\t\u0010|\u001a\u00020\u001eHÖ\u0001J*\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u00002\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0001¢\u0006\u0003\b\u0084\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010-\u001a\u0004\b1\u00102R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010-\u001a\u0004\b4\u00105R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010-\u001a\u0004\b7\u00108R\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010-\u001a\u0004\b:\u00108R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010-\u001a\u0004\b<\u0010=R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010-\u001a\u0004\b?\u0010@R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010-\u001a\u0004\bB\u0010CR\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010-\u001a\u0004\bE\u0010FR\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010-\u001a\u0004\bH\u0010IR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010-\u001a\u0004\bK\u0010@R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010-\u001a\u0004\bM\u0010@R\u001c\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010-\u001a\u0004\bO\u0010PR\u001c\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010-\u001a\u0004\bR\u0010SR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010-\u001a\u0004\bU\u0010@R\u001c\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010-\u001a\u0004\bW\u0010XR\u001c\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010-\u001a\u0004\bZ\u0010[R\u001c\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010-\u001a\u0004\b]\u0010XR\u001c\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010-\u001a\u0004\b_\u0010XR\u001c\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010-\u001a\u0004\ba\u0010b¨\u0006\u0087\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Surrogate;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "Lrosetta/mainst/OrderStateDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "last_sent_at", "created_agent", "Lrosetta/order/AgentDto;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "latest_cancel_log", "Lcom/robinhood/rosetta/mainst/CancelLogDto;", "response_category", "Lrosetta/order/ResponseCategoryDto;", "legs", "", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "side", "Lrosetta/mainst/SideDto;", "type", "Lrosetta/mainst/OrderTypeDto;", "quantity", "symbol", "", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "clearing_firm", "response_text", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/CancelLogDto;Lrosetta/order/ResponseCategoryDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/TimeInForceDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/CancelLogDto;Lrosetta/order/ResponseCategoryDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/TimeInForceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getOrder_status$annotations", "getOrder_status", "()Lrosetta/mainst/OrderStateDto;", "getInstrument_type$annotations", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getCreated_at$annotations", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getLast_sent_at$annotations", "getLast_sent_at", "getCreated_agent$annotations", "getCreated_agent", "()Lrosetta/order/AgentDto;", "getCancelled_quantity$annotations", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getLatest_cancel_log$annotations", "getLatest_cancel_log", "()Lcom/robinhood/rosetta/mainst/CancelLogDto;", "getResponse_category$annotations", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getLegs$annotations", "getLegs", "()Ljava/util/List;", "getPrice$annotations", "getPrice", "getStop_price$annotations", "getStop_price", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getType$annotations", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getQuantity$annotations", "getQuantity", "getSymbol$annotations", "getSymbol", "()Ljava/lang/String;", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getClearing_firm$annotations", "getClearing_firm", "getResponse_text$annotations", "getResponse_text", "getTime_in_force$annotations", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final DecimalDto cancelled_quantity;
        private final String clearing_firm;
        private final AgentDto created_agent;
        private final TimeDto created_at;
        private final InstrumentTypeDto instrument_type;
        private final TimeDto last_sent_at;
        private final CancelLogDto latest_cancel_log;
        private final List<PinnacleLegDetailsDto> legs;
        private final UUIDDto order_id;
        private final OrderStateDto order_status;
        private final DecimalDto price;
        private final DecimalDto quantity;
        private final ResponseCategoryDto response_category;
        private final String response_text;
        private final RouteDto route;
        private final SideDto side;
        private final DecimalDto stop_price;
        private final String symbol;
        private final TimeInForceDto time_in_force;
        private final OrderTypeDto type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.mainst.PinnacleOrderDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinnacleOrderDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((UUIDDto) null, (OrderStateDto) null, (InstrumentTypeDto) null, (TimeDto) null, (TimeDto) null, (AgentDto) null, (DecimalDto) null, (CancelLogDto) null, (ResponseCategoryDto) null, (List) null, (DecimalDto) null, (DecimalDto) null, (SideDto) null, (OrderTypeDto) null, (DecimalDto) null, (String) null, (RouteDto) null, (String) null, (String) null, (TimeInForceDto) null, 1048575, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PinnacleLegDetailsDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, OrderStateDto orderStateDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, DecimalDto decimalDto, CancelLogDto cancelLogDto, ResponseCategoryDto responseCategoryDto, List list, DecimalDto decimalDto2, DecimalDto decimalDto3, SideDto sideDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto4, String str, RouteDto routeDto, String str2, String str3, TimeInForceDto timeInForceDto, int i, Object obj) {
            TimeInForceDto timeInForceDto2;
            String str4;
            UUIDDto uUIDDto2 = (i & 1) != 0 ? surrogate.order_id : uUIDDto;
            OrderStateDto orderStateDto2 = (i & 2) != 0 ? surrogate.order_status : orderStateDto;
            InstrumentTypeDto instrumentTypeDto2 = (i & 4) != 0 ? surrogate.instrument_type : instrumentTypeDto;
            TimeDto timeDto3 = (i & 8) != 0 ? surrogate.created_at : timeDto;
            TimeDto timeDto4 = (i & 16) != 0 ? surrogate.last_sent_at : timeDto2;
            AgentDto agentDto2 = (i & 32) != 0 ? surrogate.created_agent : agentDto;
            DecimalDto decimalDto5 = (i & 64) != 0 ? surrogate.cancelled_quantity : decimalDto;
            CancelLogDto cancelLogDto2 = (i & 128) != 0 ? surrogate.latest_cancel_log : cancelLogDto;
            ResponseCategoryDto responseCategoryDto2 = (i & 256) != 0 ? surrogate.response_category : responseCategoryDto;
            List list2 = (i & 512) != 0 ? surrogate.legs : list;
            DecimalDto decimalDto6 = (i & 1024) != 0 ? surrogate.price : decimalDto2;
            DecimalDto decimalDto7 = (i & 2048) != 0 ? surrogate.stop_price : decimalDto3;
            SideDto sideDto2 = (i & 4096) != 0 ? surrogate.side : sideDto;
            OrderTypeDto orderTypeDto2 = (i & 8192) != 0 ? surrogate.type : orderTypeDto;
            UUIDDto uUIDDto3 = uUIDDto2;
            DecimalDto decimalDto8 = (i & 16384) != 0 ? surrogate.quantity : decimalDto4;
            String str5 = (i & 32768) != 0 ? surrogate.symbol : str;
            RouteDto routeDto2 = (i & 65536) != 0 ? surrogate.route : routeDto;
            String str6 = (i & 131072) != 0 ? surrogate.clearing_firm : str2;
            String str7 = (i & 262144) != 0 ? surrogate.response_text : str3;
            if ((i & 524288) != 0) {
                str4 = str7;
                timeInForceDto2 = surrogate.time_in_force;
            } else {
                timeInForceDto2 = timeInForceDto;
                str4 = str7;
            }
            return surrogate.copy(uUIDDto3, orderStateDto2, instrumentTypeDto2, timeDto3, timeDto4, agentDto2, decimalDto5, cancelLogDto2, responseCategoryDto2, list2, decimalDto6, decimalDto7, sideDto2, orderTypeDto2, decimalDto8, str5, routeDto2, str6, str4, timeInForceDto2);
        }

        @SerialName("cancelledQuantity")
        @JsonAnnotations2(names = {"cancelled_quantity"})
        public static /* synthetic */ void getCancelled_quantity$annotations() {
        }

        @SerialName("clearingFirm")
        @JsonAnnotations2(names = {"clearing_firm"})
        public static /* synthetic */ void getClearing_firm$annotations() {
        }

        @SerialName("createdAgent")
        @JsonAnnotations2(names = {"created_agent"})
        public static /* synthetic */ void getCreated_agent$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("lastSentAt")
        @JsonAnnotations2(names = {"last_sent_at"})
        public static /* synthetic */ void getLast_sent_at$annotations() {
        }

        @SerialName("latestCancelLog")
        @JsonAnnotations2(names = {"latest_cancel_log"})
        public static /* synthetic */ void getLatest_cancel_log$annotations() {
        }

        @SerialName("legs")
        @JsonAnnotations2(names = {"legs"})
        public static /* synthetic */ void getLegs$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderStatus")
        @JsonAnnotations2(names = {ComboOrderDetailTopbarComposable5.ORDER_STATUS})
        public static /* synthetic */ void getOrder_status$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
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

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final List<PinnacleLegDetailsDto> component10() {
            return this.legs;
        }

        /* renamed from: component11, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component12, reason: from getter */
        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component13, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component14, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        /* renamed from: component15, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component16, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component17, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component18, reason: from getter */
        public final String getClearing_firm() {
            return this.clearing_firm;
        }

        /* renamed from: component19, reason: from getter */
        public final String getResponse_text() {
            return this.response_text;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderStateDto getOrder_status() {
            return this.order_status;
        }

        /* renamed from: component20, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component3, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getLast_sent_at() {
            return this.last_sent_at;
        }

        /* renamed from: component6, reason: from getter */
        public final AgentDto getCreated_agent() {
            return this.created_agent;
        }

        /* renamed from: component7, reason: from getter */
        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        /* renamed from: component8, reason: from getter */
        public final CancelLogDto getLatest_cancel_log() {
            return this.latest_cancel_log;
        }

        /* renamed from: component9, reason: from getter */
        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        public final Surrogate copy(UUIDDto order_id, OrderStateDto order_status, InstrumentTypeDto instrument_type, TimeDto created_at, TimeDto last_sent_at, AgentDto created_agent, DecimalDto cancelled_quantity, CancelLogDto latest_cancel_log, ResponseCategoryDto response_category, List<PinnacleLegDetailsDto> legs, DecimalDto price, DecimalDto stop_price, SideDto side, OrderTypeDto type2, DecimalDto quantity, String symbol, RouteDto route, String clearing_firm, String response_text, TimeInForceDto time_in_force) {
            Intrinsics.checkNotNullParameter(order_status, "order_status");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(created_agent, "created_agent");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(clearing_firm, "clearing_firm");
            Intrinsics.checkNotNullParameter(response_text, "response_text");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            return new Surrogate(order_id, order_status, instrument_type, created_at, last_sent_at, created_agent, cancelled_quantity, latest_cancel_log, response_category, legs, price, stop_price, side, type2, quantity, symbol, route, clearing_firm, response_text, time_in_force);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.order_status == surrogate.order_status && this.instrument_type == surrogate.instrument_type && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.last_sent_at, surrogate.last_sent_at) && this.created_agent == surrogate.created_agent && Intrinsics.areEqual(this.cancelled_quantity, surrogate.cancelled_quantity) && Intrinsics.areEqual(this.latest_cancel_log, surrogate.latest_cancel_log) && this.response_category == surrogate.response_category && Intrinsics.areEqual(this.legs, surrogate.legs) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && this.side == surrogate.side && this.type == surrogate.type && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.route == surrogate.route && Intrinsics.areEqual(this.clearing_firm, surrogate.clearing_firm) && Intrinsics.areEqual(this.response_text, surrogate.response_text) && this.time_in_force == surrogate.time_in_force;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.order_id;
            int iHashCode = (((((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + this.order_status.hashCode()) * 31) + this.instrument_type.hashCode()) * 31;
            TimeDto timeDto = this.created_at;
            int iHashCode2 = (iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.last_sent_at;
            int iHashCode3 = (((iHashCode2 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + this.created_agent.hashCode()) * 31;
            DecimalDto decimalDto = this.cancelled_quantity;
            int iHashCode4 = (iHashCode3 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            CancelLogDto cancelLogDto = this.latest_cancel_log;
            int iHashCode5 = (((((iHashCode4 + (cancelLogDto == null ? 0 : cancelLogDto.hashCode())) * 31) + this.response_category.hashCode()) * 31) + this.legs.hashCode()) * 31;
            DecimalDto decimalDto2 = this.price;
            int iHashCode6 = (iHashCode5 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.stop_price;
            int iHashCode7 = (((((iHashCode6 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31) + this.side.hashCode()) * 31) + this.type.hashCode()) * 31;
            DecimalDto decimalDto4 = this.quantity;
            return ((((((((((iHashCode7 + (decimalDto4 != null ? decimalDto4.hashCode() : 0)) * 31) + this.symbol.hashCode()) * 31) + this.route.hashCode()) * 31) + this.clearing_firm.hashCode()) * 31) + this.response_text.hashCode()) * 31) + this.time_in_force.hashCode();
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", order_status=" + this.order_status + ", instrument_type=" + this.instrument_type + ", created_at=" + this.created_at + ", last_sent_at=" + this.last_sent_at + ", created_agent=" + this.created_agent + ", cancelled_quantity=" + this.cancelled_quantity + ", latest_cancel_log=" + this.latest_cancel_log + ", response_category=" + this.response_category + ", legs=" + this.legs + ", price=" + this.price + ", stop_price=" + this.stop_price + ", side=" + this.side + ", type=" + this.type + ", quantity=" + this.quantity + ", symbol=" + this.symbol + ", route=" + this.route + ", clearing_firm=" + this.clearing_firm + ", response_text=" + this.response_text + ", time_in_force=" + this.time_in_force + ")";
        }

        /* compiled from: PinnacleOrderDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PinnacleOrderDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, OrderStateDto orderStateDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, DecimalDto decimalDto, CancelLogDto cancelLogDto, ResponseCategoryDto responseCategoryDto, List list, DecimalDto decimalDto2, DecimalDto decimalDto3, SideDto sideDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto4, String str, RouteDto routeDto, String str2, String str3, TimeInForceDto timeInForceDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.order_status = OrderStateDto.INSTANCE.getZeroValue();
            } else {
                this.order_status = orderStateDto;
            }
            if ((i & 4) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
            if ((i & 8) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto;
            }
            if ((i & 16) == 0) {
                this.last_sent_at = null;
            } else {
                this.last_sent_at = timeDto2;
            }
            if ((i & 32) == 0) {
                this.created_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.created_agent = agentDto;
            }
            if ((i & 64) == 0) {
                this.cancelled_quantity = null;
            } else {
                this.cancelled_quantity = decimalDto;
            }
            if ((i & 128) == 0) {
                this.latest_cancel_log = null;
            } else {
                this.latest_cancel_log = cancelLogDto;
            }
            if ((i & 256) == 0) {
                this.response_category = ResponseCategoryDto.INSTANCE.getZeroValue();
            } else {
                this.response_category = responseCategoryDto;
            }
            if ((i & 512) == 0) {
                this.legs = CollectionsKt.emptyList();
            } else {
                this.legs = list;
            }
            if ((i & 1024) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto2;
            }
            if ((i & 2048) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = decimalDto3;
            }
            this.side = (i & 4096) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            this.type = (i & 8192) == 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto;
            if ((i & 16384) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto4;
            }
            if ((32768 & i) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str;
            }
            this.route = (65536 & i) == 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto;
            if ((131072 & i) == 0) {
                this.clearing_firm = "";
            } else {
                this.clearing_firm = str2;
            }
            if ((262144 & i) == 0) {
                this.response_text = "";
            } else {
                this.response_text = str3;
            }
            this.time_in_force = (i & 524288) == 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            UUIDDto uUIDDto = self.order_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            if (self.order_status != OrderStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderStateDto.Serializer.INSTANCE, self.order_status);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            TimeDto timeDto = self.created_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.last_sent_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (self.created_agent != AgentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, AgentDto.Serializer.INSTANCE, self.created_agent);
            }
            DecimalDto decimalDto = self.cancelled_quantity;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            CancelLogDto cancelLogDto = self.latest_cancel_log;
            if (cancelLogDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, CancelLogDto.Serializer.INSTANCE, cancelLogDto);
            }
            if (self.response_category != ResponseCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, ResponseCategoryDto.Serializer.INSTANCE, self.response_category);
            }
            if (!Intrinsics.areEqual(self.legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.legs);
            }
            DecimalDto decimalDto2 = self.price;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.stop_price;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, SideDto.Serializer.INSTANCE, self.side);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            DecimalDto decimalDto4 = self.quantity;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 15, self.symbol);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, RouteDto.Serializer.INSTANCE, self.route);
            }
            if (!Intrinsics.areEqual(self.clearing_firm, "")) {
                output.encodeStringElement(serialDesc, 17, self.clearing_firm);
            }
            if (!Intrinsics.areEqual(self.response_text, "")) {
                output.encodeStringElement(serialDesc, 18, self.response_text);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 19, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
        }

        public Surrogate(UUIDDto uUIDDto, OrderStateDto order_status, InstrumentTypeDto instrument_type, TimeDto timeDto, TimeDto timeDto2, AgentDto created_agent, DecimalDto decimalDto, CancelLogDto cancelLogDto, ResponseCategoryDto response_category, List<PinnacleLegDetailsDto> legs, DecimalDto decimalDto2, DecimalDto decimalDto3, SideDto side, OrderTypeDto type2, DecimalDto decimalDto4, String symbol, RouteDto route, String clearing_firm, String response_text, TimeInForceDto time_in_force) {
            Intrinsics.checkNotNullParameter(order_status, "order_status");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(created_agent, "created_agent");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(clearing_firm, "clearing_firm");
            Intrinsics.checkNotNullParameter(response_text, "response_text");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            this.order_id = uUIDDto;
            this.order_status = order_status;
            this.instrument_type = instrument_type;
            this.created_at = timeDto;
            this.last_sent_at = timeDto2;
            this.created_agent = created_agent;
            this.cancelled_quantity = decimalDto;
            this.latest_cancel_log = cancelLogDto;
            this.response_category = response_category;
            this.legs = legs;
            this.price = decimalDto2;
            this.stop_price = decimalDto3;
            this.side = side;
            this.type = type2;
            this.quantity = decimalDto4;
            this.symbol = symbol;
            this.route = route;
            this.clearing_firm = clearing_firm;
            this.response_text = response_text;
            this.time_in_force = time_in_force;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final OrderStateDto getOrder_status() {
            return this.order_status;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, OrderStateDto orderStateDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto, TimeDto timeDto2, AgentDto agentDto, DecimalDto decimalDto, CancelLogDto cancelLogDto, ResponseCategoryDto responseCategoryDto, List list, DecimalDto decimalDto2, DecimalDto decimalDto3, SideDto sideDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto4, String str, RouteDto routeDto, String str2, String str3, TimeInForceDto timeInForceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i & 4) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : timeDto2, (i & 32) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 64) != 0 ? null : decimalDto, (i & 128) != 0 ? null : cancelLogDto, (i & 256) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i & 512) != 0 ? CollectionsKt.emptyList() : list, (i & 1024) != 0 ? null : decimalDto2, (i & 2048) != 0 ? null : decimalDto3, (i & 4096) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8192) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 16384) != 0 ? null : decimalDto4, (i & 32768) != 0 ? "" : str, (i & 65536) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i & 131072) != 0 ? "" : str2, (i & 262144) == 0 ? str3 : "", (i & 524288) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto);
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getLast_sent_at() {
            return this.last_sent_at;
        }

        public final AgentDto getCreated_agent() {
            return this.created_agent;
        }

        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        public final CancelLogDto getLatest_cancel_log() {
            return this.latest_cancel_log;
        }

        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        public final List<PinnacleLegDetailsDto> getLegs() {
            return this.legs;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public final String getClearing_firm() {
            return this.clearing_firm;
        }

        public final String getResponse_text() {
            return this.response_text;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }
    }

    /* compiled from: PinnacleOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PinnacleOrderDetailsDto, PinnacleOrderDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PinnacleOrderDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleOrderDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleOrderDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PinnacleOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PinnacleOrderDetails> getProtoAdapter() {
            return PinnacleOrderDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleOrderDetailsDto getZeroValue() {
            return PinnacleOrderDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleOrderDetailsDto fromProto(PinnacleOrderDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID order_id = proto.getOrder_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            OrderStateDto orderStateDtoFromProto = OrderStateDto.INSTANCE.fromProto(proto.getOrder_status());
            InstrumentTypeDto instrumentTypeDtoFromProto = InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type());
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time last_sent_at = proto.getLast_sent_at();
            TimeDto timeDtoFromProto2 = last_sent_at != null ? TimeDto.INSTANCE.fromProto(last_sent_at) : null;
            AgentDto agentDtoFromProto = AgentDto.INSTANCE.fromProto(proto.getCreated_agent());
            Decimal cancelled_quantity = proto.getCancelled_quantity();
            DecimalDto decimalDtoFromProto = cancelled_quantity != null ? DecimalDto.INSTANCE.fromProto(cancelled_quantity) : null;
            CancelLog latest_cancel_log = proto.getLatest_cancel_log();
            CancelLogDto cancelLogDtoFromProto = latest_cancel_log != null ? CancelLogDto.INSTANCE.fromProto(latest_cancel_log) : null;
            ResponseCategoryDto responseCategoryDtoFromProto = ResponseCategoryDto.INSTANCE.fromProto(proto.getResponse_category());
            List<PinnacleLegDetails> legs = proto.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(PinnacleLegDetailsDto.INSTANCE.fromProto((PinnacleLegDetails) it.next()));
            }
            Decimal price = proto.getPrice();
            DecimalDto decimalDtoFromProto2 = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            Decimal stop_price = proto.getStop_price();
            DecimalDto decimalDtoFromProto3 = stop_price != null ? DecimalDto.INSTANCE.fromProto(stop_price) : null;
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            Decimal quantity = proto.getQuantity();
            return new PinnacleOrderDetailsDto(new Surrogate(uUIDDtoFromProto, orderStateDtoFromProto, instrumentTypeDtoFromProto, timeDtoFromProto, timeDtoFromProto2, agentDtoFromProto, decimalDtoFromProto, cancelLogDtoFromProto, responseCategoryDtoFromProto, arrayList, decimalDtoFromProto2, decimalDtoFromProto3, sideDtoFromProto, orderTypeDtoFromProto, quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null, proto.getSymbol(), RouteDto.INSTANCE.fromProto(proto.getRoute()), proto.getClearing_firm(), proto.getResponse_text(), TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.PinnacleOrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinnacleOrderDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PinnacleOrderDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PinnacleOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PinnacleOrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.PinnacleOrderDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PinnacleOrderDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PinnacleOrderDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PinnacleOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PinnacleOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.PinnacleOrderDetailsDto";
        }
    }
}
