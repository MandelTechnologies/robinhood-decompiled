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
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.PinnacleCorrectionDetailsDto;
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
import rosetta.ledger.trade.TradeType;
import rosetta.ledger.trade.TradeTypeDto;
import rosetta.mainst.PutCallCode;
import rosetta.mainst.PutCallCodeDto;
import rosetta.mainst.Route;
import rosetta.mainst.RouteDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;

/* compiled from: PinnacleExecutionDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004ijklB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bß\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020\u0014\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u00101JÜ\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001d\u001a\u00020\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\u00142\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0016J\b\u0010\\\u001a\u00020\u0002H\u0016J\b\u0010]\u001a\u00020\tH\u0016J\u0013\u0010^\u001a\u00020)2\b\u0010_\u001a\u0004\u0018\u00010`H\u0096\u0002J\b\u0010a\u001a\u00020bH\u0016J\u0018\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020bH\u0016J\b\u0010h\u001a\u00020bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b8\u00107R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u00103R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b;\u00107R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b<\u00103R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bC\u00103R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bD\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bE\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bG\u00103R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010 \u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bJ\u0010@R\u0013\u0010!\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bK\u0010@R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010*\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bT\u00103R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bU\u00103R\u0011\u0010,\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bV\u0010>R\u0013\u0010-\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bW\u0010@R\u0013\u0010.\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bX\u0010@R\u0013\u0010/\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bY\u0010@R\u0013\u00100\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bZ\u0010@¨\u0006m"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Surrogate;)V", "type", "", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "execution_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "order_id", "venue_execution_id", "contra_broker", "instrument_id", "symbol", "side", "Lrosetta/mainst/SideDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "quantity", "rounded_notional", "trade_date", "settlement_date", "broken_at", "commission", "leg_id", "correction_details", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "sec_fee", "taf_fee", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "trade_type", "Lrosetta/ledger/trade/TradeTypeDto;", "executed_on_exchange", "", "offset_account", "trailer", "firm_side", "or_fee", "occ_fee", "non_denominated_currency_traded", "fx_fee_in_bps", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/RouteDto;Lrosetta/mainst/PutCallCodeDto;Lrosetta/ledger/trade/TradeTypeDto;ZLjava/lang/String;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "getType", "()Ljava/lang/String;", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getExecution_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getOrder_id", "getVenue_execution_id", "getContra_broker", "getInstrument_id", "getSymbol", "getSide", "()Lrosetta/mainst/SideDto;", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getQuantity", "getRounded_notional", "getTrade_date", "getSettlement_date", "getBroken_at", "getCommission", "getLeg_id", "getCorrection_details", "()Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "getSec_fee", "getTaf_fee", "getRoute", "()Lrosetta/mainst/RouteDto;", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getTrade_type", "()Lrosetta/ledger/trade/TradeTypeDto;", "getExecuted_on_exchange", "()Z", "getOffset_account", "getTrailer", "getFirm_side", "getOr_fee", "getOcc_fee", "getNon_denominated_currency_traded", "getFx_fee_in_bps", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class PinnacleExecutionDetailsDto implements Dto3<PinnacleExecutionDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PinnacleExecutionDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PinnacleExecutionDetailsDto, PinnacleExecutionDetails>> binaryBase64Serializer$delegate;
    private static final PinnacleExecutionDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PinnacleExecutionDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PinnacleExecutionDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final TimeDto getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final UUIDDto getExecution_id() {
        return this.surrogate.getExecution_id();
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getVenue_execution_id() {
        return this.surrogate.getVenue_execution_id();
    }

    public final String getContra_broker() {
        return this.surrogate.getContra_broker();
    }

    public final UUIDDto getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final DecimalDto getRounded_notional() {
        return this.surrogate.getRounded_notional();
    }

    public final String getTrade_date() {
        return this.surrogate.getTrade_date();
    }

    public final String getSettlement_date() {
        return this.surrogate.getSettlement_date();
    }

    public final TimeDto getBroken_at() {
        return this.surrogate.getBroken_at();
    }

    public final DecimalDto getCommission() {
        return this.surrogate.getCommission();
    }

    public final String getLeg_id() {
        return this.surrogate.getLeg_id();
    }

    public final PinnacleCorrectionDetailsDto getCorrection_details() {
        return this.surrogate.getCorrection_details();
    }

    public final DecimalDto getSec_fee() {
        return this.surrogate.getSec_fee();
    }

    public final DecimalDto getTaf_fee() {
        return this.surrogate.getTaf_fee();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final PutCallCodeDto getPut_call_code() {
        return this.surrogate.getPut_call_code();
    }

    public final TradeTypeDto getTrade_type() {
        return this.surrogate.getTrade_type();
    }

    public final boolean getExecuted_on_exchange() {
        return this.surrogate.getExecuted_on_exchange();
    }

    public final String getOffset_account() {
        return this.surrogate.getOffset_account();
    }

    public final String getTrailer() {
        return this.surrogate.getTrailer();
    }

    public final SideDto getFirm_side() {
        return this.surrogate.getFirm_side();
    }

    public final DecimalDto getOr_fee() {
        return this.surrogate.getOr_fee();
    }

    public final DecimalDto getOcc_fee() {
        return this.surrogate.getOcc_fee();
    }

    public final DecimalDto getNon_denominated_currency_traded() {
        return this.surrogate.getNon_denominated_currency_traded();
    }

    public final DecimalDto getFx_fee_in_bps() {
        return this.surrogate.getFx_fee_in_bps();
    }

    public /* synthetic */ PinnacleExecutionDetailsDto(String str, TimeDto timeDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, String str2, String str3, UUIDDto uUIDDto3, String str4, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, String str5, String str6, TimeDto timeDto2, DecimalDto decimalDto4, String str7, PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, DecimalDto decimalDto5, DecimalDto decimalDto6, RouteDto routeDto, PutCallCodeDto putCallCodeDto, TradeTypeDto tradeTypeDto, boolean z, String str8, String str9, SideDto sideDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, DecimalDto decimalDto10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : timeDto, (i & 4) != 0 ? null : uUIDDto, (i & 8) != 0 ? null : uUIDDto2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : uUIDDto3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 512) != 0 ? null : decimalDto, (i & 1024) != 0 ? null : decimalDto2, (i & 2048) != 0 ? null : decimalDto3, (i & 4096) != 0 ? "" : str5, (i & 8192) != 0 ? "" : str6, (i & 16384) != 0 ? null : timeDto2, (i & 32768) != 0 ? null : decimalDto4, (i & 65536) != 0 ? "" : str7, (i & 131072) != 0 ? null : pinnacleCorrectionDetailsDto, (i & 262144) != 0 ? null : decimalDto5, (i & 524288) != 0 ? null : decimalDto6, (i & 1048576) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i & 2097152) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i & 4194304) != 0 ? TradeTypeDto.INSTANCE.getZeroValue() : tradeTypeDto, (i & 8388608) != 0 ? false : z, (i & 16777216) != 0 ? "" : str8, (i & 33554432) == 0 ? str9 : "", (i & 67108864) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto2, (i & 134217728) != 0 ? null : decimalDto7, (i & 268435456) != 0 ? null : decimalDto8, (i & 536870912) != 0 ? null : decimalDto9, (i & 1073741824) != 0 ? null : decimalDto10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnacleExecutionDetailsDto(String type2, TimeDto timeDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, String venue_execution_id, String contra_broker, UUIDDto uUIDDto3, String symbol, SideDto side, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, String trade_date, String settlement_date, TimeDto timeDto2, DecimalDto decimalDto4, String leg_id, PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, DecimalDto decimalDto5, DecimalDto decimalDto6, RouteDto route, PutCallCodeDto put_call_code, TradeTypeDto trade_type, boolean z, String offset_account, String trailer, SideDto firm_side, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, DecimalDto decimalDto10) {
        this(new Surrogate(type2, timeDto, uUIDDto, uUIDDto2, venue_execution_id, contra_broker, uUIDDto3, symbol, side, decimalDto, decimalDto2, decimalDto3, trade_date, settlement_date, timeDto2, decimalDto4, leg_id, pinnacleCorrectionDetailsDto, decimalDto5, decimalDto6, route, put_call_code, trade_type, z, offset_account, trailer, firm_side, decimalDto7, decimalDto8, decimalDto9, decimalDto10));
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(venue_execution_id, "venue_execution_id");
        Intrinsics.checkNotNullParameter(contra_broker, "contra_broker");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(trade_date, "trade_date");
        Intrinsics.checkNotNullParameter(settlement_date, "settlement_date");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(offset_account, "offset_account");
        Intrinsics.checkNotNullParameter(trailer, "trailer");
        Intrinsics.checkNotNullParameter(firm_side, "firm_side");
    }

    public static /* synthetic */ PinnacleExecutionDetailsDto copy$default(PinnacleExecutionDetailsDto pinnacleExecutionDetailsDto, String str, TimeDto timeDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, String str2, String str3, UUIDDto uUIDDto3, String str4, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, String str5, String str6, TimeDto timeDto2, DecimalDto decimalDto4, String str7, PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, DecimalDto decimalDto5, DecimalDto decimalDto6, RouteDto routeDto, PutCallCodeDto putCallCodeDto, TradeTypeDto tradeTypeDto, boolean z, String str8, String str9, SideDto sideDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, DecimalDto decimalDto10, int i, Object obj) {
        DecimalDto fx_fee_in_bps;
        DecimalDto decimalDto11;
        String type2 = (i & 1) != 0 ? pinnacleExecutionDetailsDto.surrogate.getType() : str;
        TimeDto timestamp = (i & 2) != 0 ? pinnacleExecutionDetailsDto.surrogate.getTimestamp() : timeDto;
        UUIDDto execution_id = (i & 4) != 0 ? pinnacleExecutionDetailsDto.surrogate.getExecution_id() : uUIDDto;
        UUIDDto order_id = (i & 8) != 0 ? pinnacleExecutionDetailsDto.surrogate.getOrder_id() : uUIDDto2;
        String venue_execution_id = (i & 16) != 0 ? pinnacleExecutionDetailsDto.surrogate.getVenue_execution_id() : str2;
        String contra_broker = (i & 32) != 0 ? pinnacleExecutionDetailsDto.surrogate.getContra_broker() : str3;
        UUIDDto instrument_id = (i & 64) != 0 ? pinnacleExecutionDetailsDto.surrogate.getInstrument_id() : uUIDDto3;
        String symbol = (i & 128) != 0 ? pinnacleExecutionDetailsDto.surrogate.getSymbol() : str4;
        SideDto side = (i & 256) != 0 ? pinnacleExecutionDetailsDto.surrogate.getSide() : sideDto;
        DecimalDto price = (i & 512) != 0 ? pinnacleExecutionDetailsDto.surrogate.getPrice() : decimalDto;
        DecimalDto quantity = (i & 1024) != 0 ? pinnacleExecutionDetailsDto.surrogate.getQuantity() : decimalDto2;
        DecimalDto rounded_notional = (i & 2048) != 0 ? pinnacleExecutionDetailsDto.surrogate.getRounded_notional() : decimalDto3;
        String trade_date = (i & 4096) != 0 ? pinnacleExecutionDetailsDto.surrogate.getTrade_date() : str5;
        String settlement_date = (i & 8192) != 0 ? pinnacleExecutionDetailsDto.surrogate.getSettlement_date() : str6;
        String str10 = type2;
        TimeDto broken_at = (i & 16384) != 0 ? pinnacleExecutionDetailsDto.surrogate.getBroken_at() : timeDto2;
        DecimalDto commission = (i & 32768) != 0 ? pinnacleExecutionDetailsDto.surrogate.getCommission() : decimalDto4;
        String leg_id = (i & 65536) != 0 ? pinnacleExecutionDetailsDto.surrogate.getLeg_id() : str7;
        PinnacleCorrectionDetailsDto correction_details = (i & 131072) != 0 ? pinnacleExecutionDetailsDto.surrogate.getCorrection_details() : pinnacleCorrectionDetailsDto;
        DecimalDto sec_fee = (i & 262144) != 0 ? pinnacleExecutionDetailsDto.surrogate.getSec_fee() : decimalDto5;
        DecimalDto taf_fee = (i & 524288) != 0 ? pinnacleExecutionDetailsDto.surrogate.getTaf_fee() : decimalDto6;
        RouteDto route = (i & 1048576) != 0 ? pinnacleExecutionDetailsDto.surrogate.getRoute() : routeDto;
        PutCallCodeDto put_call_code = (i & 2097152) != 0 ? pinnacleExecutionDetailsDto.surrogate.getPut_call_code() : putCallCodeDto;
        TradeTypeDto trade_type = (i & 4194304) != 0 ? pinnacleExecutionDetailsDto.surrogate.getTrade_type() : tradeTypeDto;
        boolean executed_on_exchange = (i & 8388608) != 0 ? pinnacleExecutionDetailsDto.surrogate.getExecuted_on_exchange() : z;
        String offset_account = (i & 16777216) != 0 ? pinnacleExecutionDetailsDto.surrogate.getOffset_account() : str8;
        String trailer = (i & 33554432) != 0 ? pinnacleExecutionDetailsDto.surrogate.getTrailer() : str9;
        SideDto firm_side = (i & 67108864) != 0 ? pinnacleExecutionDetailsDto.surrogate.getFirm_side() : sideDto2;
        DecimalDto or_fee = (i & 134217728) != 0 ? pinnacleExecutionDetailsDto.surrogate.getOr_fee() : decimalDto7;
        DecimalDto occ_fee = (i & 268435456) != 0 ? pinnacleExecutionDetailsDto.surrogate.getOcc_fee() : decimalDto8;
        DecimalDto non_denominated_currency_traded = (i & 536870912) != 0 ? pinnacleExecutionDetailsDto.surrogate.getNon_denominated_currency_traded() : decimalDto9;
        if ((i & 1073741824) != 0) {
            decimalDto11 = non_denominated_currency_traded;
            fx_fee_in_bps = pinnacleExecutionDetailsDto.surrogate.getFx_fee_in_bps();
        } else {
            fx_fee_in_bps = decimalDto10;
            decimalDto11 = non_denominated_currency_traded;
        }
        return pinnacleExecutionDetailsDto.copy(str10, timestamp, execution_id, order_id, venue_execution_id, contra_broker, instrument_id, symbol, side, price, quantity, rounded_notional, trade_date, settlement_date, broken_at, commission, leg_id, correction_details, sec_fee, taf_fee, route, put_call_code, trade_type, executed_on_exchange, offset_account, trailer, firm_side, or_fee, occ_fee, decimalDto11, fx_fee_in_bps);
    }

    public final PinnacleExecutionDetailsDto copy(String type2, TimeDto timestamp, UUIDDto execution_id, UUIDDto order_id, String venue_execution_id, String contra_broker, UUIDDto instrument_id, String symbol, SideDto side, DecimalDto price, DecimalDto quantity, DecimalDto rounded_notional, String trade_date, String settlement_date, TimeDto broken_at, DecimalDto commission, String leg_id, PinnacleCorrectionDetailsDto correction_details, DecimalDto sec_fee, DecimalDto taf_fee, RouteDto route, PutCallCodeDto put_call_code, TradeTypeDto trade_type, boolean executed_on_exchange, String offset_account, String trailer, SideDto firm_side, DecimalDto or_fee, DecimalDto occ_fee, DecimalDto non_denominated_currency_traded, DecimalDto fx_fee_in_bps) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(venue_execution_id, "venue_execution_id");
        Intrinsics.checkNotNullParameter(contra_broker, "contra_broker");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(trade_date, "trade_date");
        Intrinsics.checkNotNullParameter(settlement_date, "settlement_date");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(offset_account, "offset_account");
        Intrinsics.checkNotNullParameter(trailer, "trailer");
        Intrinsics.checkNotNullParameter(firm_side, "firm_side");
        return new PinnacleExecutionDetailsDto(new Surrogate(type2, timestamp, execution_id, order_id, venue_execution_id, contra_broker, instrument_id, symbol, side, price, quantity, rounded_notional, trade_date, settlement_date, broken_at, commission, leg_id, correction_details, sec_fee, taf_fee, route, put_call_code, trade_type, executed_on_exchange, offset_account, trailer, firm_side, or_fee, occ_fee, non_denominated_currency_traded, fx_fee_in_bps));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PinnacleExecutionDetails toProto() {
        String type2 = this.surrogate.getType();
        TimeDto timestamp = this.surrogate.getTimestamp();
        Time proto = timestamp != null ? timestamp.toProto() : null;
        UUIDDto execution_id = this.surrogate.getExecution_id();
        UUID proto2 = execution_id != null ? execution_id.toProto() : null;
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto3 = order_id != null ? order_id.toProto() : null;
        String venue_execution_id = this.surrogate.getVenue_execution_id();
        String contra_broker = this.surrogate.getContra_broker();
        UUIDDto instrument_id = this.surrogate.getInstrument_id();
        UUID proto4 = instrument_id != null ? instrument_id.toProto() : null;
        String symbol = this.surrogate.getSymbol();
        Side side = (Side) this.surrogate.getSide().toProto();
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto5 = price != null ? price.toProto() : null;
        DecimalDto quantity = this.surrogate.getQuantity();
        Decimal proto6 = quantity != null ? quantity.toProto() : null;
        DecimalDto rounded_notional = this.surrogate.getRounded_notional();
        Decimal proto7 = rounded_notional != null ? rounded_notional.toProto() : null;
        String trade_date = this.surrogate.getTrade_date();
        String settlement_date = this.surrogate.getSettlement_date();
        TimeDto broken_at = this.surrogate.getBroken_at();
        Time proto8 = broken_at != null ? broken_at.toProto() : null;
        DecimalDto commission = this.surrogate.getCommission();
        Decimal proto9 = commission != null ? commission.toProto() : null;
        String leg_id = this.surrogate.getLeg_id();
        PinnacleCorrectionDetailsDto correction_details = this.surrogate.getCorrection_details();
        PinnacleCorrectionDetails proto10 = correction_details != null ? correction_details.toProto() : null;
        DecimalDto sec_fee = this.surrogate.getSec_fee();
        Decimal proto11 = sec_fee != null ? sec_fee.toProto() : null;
        DecimalDto taf_fee = this.surrogate.getTaf_fee();
        Decimal proto12 = taf_fee != null ? taf_fee.toProto() : null;
        Route route = (Route) this.surrogate.getRoute().toProto();
        PutCallCode putCallCode = (PutCallCode) this.surrogate.getPut_call_code().toProto();
        TradeType tradeType = (TradeType) this.surrogate.getTrade_type().toProto();
        boolean executed_on_exchange = this.surrogate.getExecuted_on_exchange();
        String offset_account = this.surrogate.getOffset_account();
        String trailer = this.surrogate.getTrailer();
        Side side2 = (Side) this.surrogate.getFirm_side().toProto();
        DecimalDto or_fee = this.surrogate.getOr_fee();
        Decimal proto13 = or_fee != null ? or_fee.toProto() : null;
        DecimalDto occ_fee = this.surrogate.getOcc_fee();
        Decimal proto14 = occ_fee != null ? occ_fee.toProto() : null;
        DecimalDto non_denominated_currency_traded = this.surrogate.getNon_denominated_currency_traded();
        Decimal proto15 = non_denominated_currency_traded != null ? non_denominated_currency_traded.toProto() : null;
        DecimalDto fx_fee_in_bps = this.surrogate.getFx_fee_in_bps();
        return new PinnacleExecutionDetails(type2, proto, proto2, proto3, venue_execution_id, contra_broker, proto4, symbol, side, proto5, proto6, proto7, trade_date, settlement_date, proto8, proto9, leg_id, proto10, proto11, proto12, route, putCallCode, tradeType, executed_on_exchange, offset_account, trailer, side2, proto13, proto14, proto15, fx_fee_in_bps != null ? fx_fee_in_bps.toProto() : null, null, Integer.MIN_VALUE, null);
    }

    public String toString() {
        return "[PinnacleExecutionDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PinnacleExecutionDetailsDto) && Intrinsics.areEqual(((PinnacleExecutionDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PinnacleExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bo\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ¨\u00012\u00020\u0001:\u0004§\u0001¨\u0001BÝ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u000e\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b+\u0010,BÏ\u0002\b\u0010\u0012\u0006\u0010-\u001a\u00020.\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020#\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010/\u001a\u0004\u0018\u000100¢\u0006\u0004\b+\u00101J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020!HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020#HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jà\u0002\u0010\u009a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0015\u0010\u009b\u0001\u001a\u00020#2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u009d\u0001\u001a\u00020.HÖ\u0001J\n\u0010\u009e\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010\u009f\u0001\u001a\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020\u00002\b\u0010¢\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0001¢\u0006\u0003\b¦\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u00103\u001a\u0004\b7\u00108R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u00103\u001a\u0004\b:\u0010;R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u00103\u001a\u0004\b=\u0010;R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u00103\u001a\u0004\b?\u00105R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u00103\u001a\u0004\bA\u00105R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00103\u001a\u0004\bC\u0010;R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u00103\u001a\u0004\bE\u00105R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u00103\u001a\u0004\bG\u0010HR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u00103\u001a\u0004\bJ\u0010KR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u00103\u001a\u0004\bM\u0010KR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u00103\u001a\u0004\bO\u0010KR\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u00103\u001a\u0004\bQ\u00105R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u00103\u001a\u0004\bS\u00105R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u00103\u001a\u0004\bU\u00108R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u00103\u001a\u0004\bW\u0010KR\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u00103\u001a\u0004\bY\u00105R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u00103\u001a\u0004\b[\u0010\\R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u00103\u001a\u0004\b^\u0010KR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u00103\u001a\u0004\b`\u0010KR\u001c\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\ba\u00103\u001a\u0004\bb\u0010cR\u001c\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bd\u00103\u001a\u0004\be\u0010fR\u001c\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bg\u00103\u001a\u0004\bh\u0010iR\u001c\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bj\u00103\u001a\u0004\bk\u0010lR\u001c\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bm\u00103\u001a\u0004\bn\u00105R\u001c\u0010%\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bo\u00103\u001a\u0004\bp\u00105R\u001c\u0010&\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bq\u00103\u001a\u0004\br\u0010HR\u001e\u0010'\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u00103\u001a\u0004\bt\u0010KR\u001e\u0010(\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u00103\u001a\u0004\bv\u0010KR\u001e\u0010)\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u00103\u001a\u0004\bx\u0010KR\u001e\u0010*\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u00103\u001a\u0004\bz\u0010K¨\u0006©\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Surrogate;", "", "type", "", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "execution_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "order_id", "venue_execution_id", "contra_broker", "instrument_id", "symbol", "side", "Lrosetta/mainst/SideDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "quantity", "rounded_notional", "trade_date", "settlement_date", "broken_at", "commission", "leg_id", "correction_details", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "sec_fee", "taf_fee", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "trade_type", "Lrosetta/ledger/trade/TradeTypeDto;", "executed_on_exchange", "", "offset_account", "trailer", "firm_side", "or_fee", "occ_fee", "non_denominated_currency_traded", "fx_fee_in_bps", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/RouteDto;Lrosetta/mainst/PutCallCodeDto;Lrosetta/ledger/trade/TradeTypeDto;ZLjava/lang/String;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/RouteDto;Lrosetta/mainst/PutCallCodeDto;Lrosetta/ledger/trade/TradeTypeDto;ZLjava/lang/String;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getTimestamp$annotations", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getExecution_id$annotations", "getExecution_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getOrder_id$annotations", "getOrder_id", "getVenue_execution_id$annotations", "getVenue_execution_id", "getContra_broker$annotations", "getContra_broker", "getInstrument_id$annotations", "getInstrument_id", "getSymbol$annotations", "getSymbol", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getPrice$annotations", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getQuantity$annotations", "getQuantity", "getRounded_notional$annotations", "getRounded_notional", "getTrade_date$annotations", "getTrade_date", "getSettlement_date$annotations", "getSettlement_date", "getBroken_at$annotations", "getBroken_at", "getCommission$annotations", "getCommission", "getLeg_id$annotations", "getLeg_id", "getCorrection_details$annotations", "getCorrection_details", "()Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "getSec_fee$annotations", "getSec_fee", "getTaf_fee$annotations", "getTaf_fee", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getPut_call_code$annotations", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getTrade_type$annotations", "getTrade_type", "()Lrosetta/ledger/trade/TradeTypeDto;", "getExecuted_on_exchange$annotations", "getExecuted_on_exchange", "()Z", "getOffset_account$annotations", "getOffset_account", "getTrailer$annotations", "getTrailer", "getFirm_side$annotations", "getFirm_side", "getOr_fee$annotations", "getOr_fee", "getOcc_fee$annotations", "getOcc_fee", "getNon_denominated_currency_traded$annotations", "getNon_denominated_currency_traded", "getFx_fee_in_bps$annotations", "getFx_fee_in_bps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TimeDto broken_at;
        private final DecimalDto commission;
        private final String contra_broker;
        private final PinnacleCorrectionDetailsDto correction_details;
        private final boolean executed_on_exchange;
        private final UUIDDto execution_id;
        private final SideDto firm_side;
        private final DecimalDto fx_fee_in_bps;
        private final UUIDDto instrument_id;
        private final String leg_id;
        private final DecimalDto non_denominated_currency_traded;
        private final DecimalDto occ_fee;
        private final String offset_account;
        private final DecimalDto or_fee;
        private final UUIDDto order_id;
        private final DecimalDto price;
        private final PutCallCodeDto put_call_code;
        private final DecimalDto quantity;
        private final DecimalDto rounded_notional;
        private final RouteDto route;
        private final DecimalDto sec_fee;
        private final String settlement_date;
        private final SideDto side;
        private final String symbol;
        private final DecimalDto taf_fee;
        private final TimeDto timestamp;
        private final String trade_date;
        private final TradeTypeDto trade_type;
        private final String trailer;
        private final String type;
        private final String venue_execution_id;

        public Surrogate() {
            this((String) null, (TimeDto) null, (UUIDDto) null, (UUIDDto) null, (String) null, (String) null, (UUIDDto) null, (String) null, (SideDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (String) null, (String) null, (TimeDto) null, (DecimalDto) null, (String) null, (PinnacleCorrectionDetailsDto) null, (DecimalDto) null, (DecimalDto) null, (RouteDto) null, (PutCallCodeDto) null, (TradeTypeDto) null, false, (String) null, (String) null, (SideDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, TimeDto timeDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, String str2, String str3, UUIDDto uUIDDto3, String str4, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, String str5, String str6, TimeDto timeDto2, DecimalDto decimalDto4, String str7, PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, DecimalDto decimalDto5, DecimalDto decimalDto6, RouteDto routeDto, PutCallCodeDto putCallCodeDto, TradeTypeDto tradeTypeDto, boolean z, String str8, String str9, SideDto sideDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, DecimalDto decimalDto10, int i, Object obj) {
            DecimalDto decimalDto11;
            DecimalDto decimalDto12;
            String str10 = (i & 1) != 0 ? surrogate.type : str;
            TimeDto timeDto3 = (i & 2) != 0 ? surrogate.timestamp : timeDto;
            UUIDDto uUIDDto4 = (i & 4) != 0 ? surrogate.execution_id : uUIDDto;
            UUIDDto uUIDDto5 = (i & 8) != 0 ? surrogate.order_id : uUIDDto2;
            String str11 = (i & 16) != 0 ? surrogate.venue_execution_id : str2;
            String str12 = (i & 32) != 0 ? surrogate.contra_broker : str3;
            UUIDDto uUIDDto6 = (i & 64) != 0 ? surrogate.instrument_id : uUIDDto3;
            String str13 = (i & 128) != 0 ? surrogate.symbol : str4;
            SideDto sideDto3 = (i & 256) != 0 ? surrogate.side : sideDto;
            DecimalDto decimalDto13 = (i & 512) != 0 ? surrogate.price : decimalDto;
            DecimalDto decimalDto14 = (i & 1024) != 0 ? surrogate.quantity : decimalDto2;
            DecimalDto decimalDto15 = (i & 2048) != 0 ? surrogate.rounded_notional : decimalDto3;
            String str14 = (i & 4096) != 0 ? surrogate.trade_date : str5;
            String str15 = (i & 8192) != 0 ? surrogate.settlement_date : str6;
            String str16 = str10;
            TimeDto timeDto4 = (i & 16384) != 0 ? surrogate.broken_at : timeDto2;
            DecimalDto decimalDto16 = (i & 32768) != 0 ? surrogate.commission : decimalDto4;
            String str17 = (i & 65536) != 0 ? surrogate.leg_id : str7;
            PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto2 = (i & 131072) != 0 ? surrogate.correction_details : pinnacleCorrectionDetailsDto;
            DecimalDto decimalDto17 = (i & 262144) != 0 ? surrogate.sec_fee : decimalDto5;
            DecimalDto decimalDto18 = (i & 524288) != 0 ? surrogate.taf_fee : decimalDto6;
            RouteDto routeDto2 = (i & 1048576) != 0 ? surrogate.route : routeDto;
            PutCallCodeDto putCallCodeDto2 = (i & 2097152) != 0 ? surrogate.put_call_code : putCallCodeDto;
            TradeTypeDto tradeTypeDto2 = (i & 4194304) != 0 ? surrogate.trade_type : tradeTypeDto;
            boolean z2 = (i & 8388608) != 0 ? surrogate.executed_on_exchange : z;
            String str18 = (i & 16777216) != 0 ? surrogate.offset_account : str8;
            String str19 = (i & 33554432) != 0 ? surrogate.trailer : str9;
            SideDto sideDto4 = (i & 67108864) != 0 ? surrogate.firm_side : sideDto2;
            DecimalDto decimalDto19 = (i & 134217728) != 0 ? surrogate.or_fee : decimalDto7;
            DecimalDto decimalDto20 = (i & 268435456) != 0 ? surrogate.occ_fee : decimalDto8;
            DecimalDto decimalDto21 = (i & 536870912) != 0 ? surrogate.non_denominated_currency_traded : decimalDto9;
            if ((i & 1073741824) != 0) {
                decimalDto12 = decimalDto21;
                decimalDto11 = surrogate.fx_fee_in_bps;
            } else {
                decimalDto11 = decimalDto10;
                decimalDto12 = decimalDto21;
            }
            return surrogate.copy(str16, timeDto3, uUIDDto4, uUIDDto5, str11, str12, uUIDDto6, str13, sideDto3, decimalDto13, decimalDto14, decimalDto15, str14, str15, timeDto4, decimalDto16, str17, pinnacleCorrectionDetailsDto2, decimalDto17, decimalDto18, routeDto2, putCallCodeDto2, tradeTypeDto2, z2, str18, str19, sideDto4, decimalDto19, decimalDto20, decimalDto12, decimalDto11);
        }

        @SerialName("brokenAt")
        @JsonAnnotations2(names = {"broken_at"})
        public static /* synthetic */ void getBroken_at$annotations() {
        }

        @SerialName("commission")
        @JsonAnnotations2(names = {"commission"})
        public static /* synthetic */ void getCommission$annotations() {
        }

        @SerialName("contraBroker")
        @JsonAnnotations2(names = {"contra_broker"})
        public static /* synthetic */ void getContra_broker$annotations() {
        }

        @SerialName("correctionDetails")
        @JsonAnnotations2(names = {"correction_details"})
        public static /* synthetic */ void getCorrection_details$annotations() {
        }

        @SerialName("executedOnExchange")
        @JsonAnnotations2(names = {"executed_on_exchange"})
        public static /* synthetic */ void getExecuted_on_exchange$annotations() {
        }

        @SerialName("executionId")
        @JsonAnnotations2(names = {"execution_id"})
        public static /* synthetic */ void getExecution_id$annotations() {
        }

        @SerialName("firmSide")
        @JsonAnnotations2(names = {"firm_side"})
        public static /* synthetic */ void getFirm_side$annotations() {
        }

        @SerialName("fxFeeInBps")
        @JsonAnnotations2(names = {"fx_fee_in_bps"})
        public static /* synthetic */ void getFx_fee_in_bps$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("legId")
        @JsonAnnotations2(names = {"leg_id"})
        public static /* synthetic */ void getLeg_id$annotations() {
        }

        @SerialName("nonDenominatedCurrencyTraded")
        @JsonAnnotations2(names = {"non_denominated_currency_traded"})
        public static /* synthetic */ void getNon_denominated_currency_traded$annotations() {
        }

        @SerialName("occFee")
        @JsonAnnotations2(names = {"occ_fee"})
        public static /* synthetic */ void getOcc_fee$annotations() {
        }

        @SerialName("offsetAccount")
        @JsonAnnotations2(names = {"offset_account"})
        public static /* synthetic */ void getOffset_account$annotations() {
        }

        @SerialName("orFee")
        @JsonAnnotations2(names = {"or_fee"})
        public static /* synthetic */ void getOr_fee$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("putCallCode")
        @JsonAnnotations2(names = {"put_call_code"})
        public static /* synthetic */ void getPut_call_code$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("roundedNotional")
        @JsonAnnotations2(names = {"rounded_notional"})
        public static /* synthetic */ void getRounded_notional$annotations() {
        }

        @SerialName(PlaceTypes.ROUTE)
        @JsonAnnotations2(names = {PlaceTypes.ROUTE})
        public static /* synthetic */ void getRoute$annotations() {
        }

        @SerialName("secFee")
        @JsonAnnotations2(names = {"sec_fee"})
        public static /* synthetic */ void getSec_fee$annotations() {
        }

        @SerialName("settlementDate")
        @JsonAnnotations2(names = {"settlement_date"})
        public static /* synthetic */ void getSettlement_date$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tafFee")
        @JsonAnnotations2(names = {"taf_fee"})
        public static /* synthetic */ void getTaf_fee$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("tradeDate")
        @JsonAnnotations2(names = {"trade_date"})
        public static /* synthetic */ void getTrade_date$annotations() {
        }

        @SerialName("tradeType")
        @JsonAnnotations2(names = {"trade_type"})
        public static /* synthetic */ void getTrade_type$annotations() {
        }

        @SerialName("trailer")
        @JsonAnnotations2(names = {"trailer"})
        public static /* synthetic */ void getTrailer$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("venueExecutionId")
        @JsonAnnotations2(names = {"venue_execution_id"})
        public static /* synthetic */ void getVenue_execution_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component11, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component12, reason: from getter */
        public final DecimalDto getRounded_notional() {
            return this.rounded_notional;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTrade_date() {
            return this.trade_date;
        }

        /* renamed from: component14, reason: from getter */
        public final String getSettlement_date() {
            return this.settlement_date;
        }

        /* renamed from: component15, reason: from getter */
        public final TimeDto getBroken_at() {
            return this.broken_at;
        }

        /* renamed from: component16, reason: from getter */
        public final DecimalDto getCommission() {
            return this.commission;
        }

        /* renamed from: component17, reason: from getter */
        public final String getLeg_id() {
            return this.leg_id;
        }

        /* renamed from: component18, reason: from getter */
        public final PinnacleCorrectionDetailsDto getCorrection_details() {
            return this.correction_details;
        }

        /* renamed from: component19, reason: from getter */
        public final DecimalDto getSec_fee() {
            return this.sec_fee;
        }

        /* renamed from: component2, reason: from getter */
        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component20, reason: from getter */
        public final DecimalDto getTaf_fee() {
            return this.taf_fee;
        }

        /* renamed from: component21, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component22, reason: from getter */
        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        /* renamed from: component23, reason: from getter */
        public final TradeTypeDto getTrade_type() {
            return this.trade_type;
        }

        /* renamed from: component24, reason: from getter */
        public final boolean getExecuted_on_exchange() {
            return this.executed_on_exchange;
        }

        /* renamed from: component25, reason: from getter */
        public final String getOffset_account() {
            return this.offset_account;
        }

        /* renamed from: component26, reason: from getter */
        public final String getTrailer() {
            return this.trailer;
        }

        /* renamed from: component27, reason: from getter */
        public final SideDto getFirm_side() {
            return this.firm_side;
        }

        /* renamed from: component28, reason: from getter */
        public final DecimalDto getOr_fee() {
            return this.or_fee;
        }

        /* renamed from: component29, reason: from getter */
        public final DecimalDto getOcc_fee() {
            return this.occ_fee;
        }

        /* renamed from: component3, reason: from getter */
        public final UUIDDto getExecution_id() {
            return this.execution_id;
        }

        /* renamed from: component30, reason: from getter */
        public final DecimalDto getNon_denominated_currency_traded() {
            return this.non_denominated_currency_traded;
        }

        /* renamed from: component31, reason: from getter */
        public final DecimalDto getFx_fee_in_bps() {
            return this.fx_fee_in_bps;
        }

        /* renamed from: component4, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getVenue_execution_id() {
            return this.venue_execution_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContra_broker() {
            return this.contra_broker;
        }

        /* renamed from: component7, reason: from getter */
        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component9, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        public final Surrogate copy(String type2, TimeDto timestamp, UUIDDto execution_id, UUIDDto order_id, String venue_execution_id, String contra_broker, UUIDDto instrument_id, String symbol, SideDto side, DecimalDto price, DecimalDto quantity, DecimalDto rounded_notional, String trade_date, String settlement_date, TimeDto broken_at, DecimalDto commission, String leg_id, PinnacleCorrectionDetailsDto correction_details, DecimalDto sec_fee, DecimalDto taf_fee, RouteDto route, PutCallCodeDto put_call_code, TradeTypeDto trade_type, boolean executed_on_exchange, String offset_account, String trailer, SideDto firm_side, DecimalDto or_fee, DecimalDto occ_fee, DecimalDto non_denominated_currency_traded, DecimalDto fx_fee_in_bps) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(venue_execution_id, "venue_execution_id");
            Intrinsics.checkNotNullParameter(contra_broker, "contra_broker");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(trade_date, "trade_date");
            Intrinsics.checkNotNullParameter(settlement_date, "settlement_date");
            Intrinsics.checkNotNullParameter(leg_id, "leg_id");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(trade_type, "trade_type");
            Intrinsics.checkNotNullParameter(offset_account, "offset_account");
            Intrinsics.checkNotNullParameter(trailer, "trailer");
            Intrinsics.checkNotNullParameter(firm_side, "firm_side");
            return new Surrogate(type2, timestamp, execution_id, order_id, venue_execution_id, contra_broker, instrument_id, symbol, side, price, quantity, rounded_notional, trade_date, settlement_date, broken_at, commission, leg_id, correction_details, sec_fee, taf_fee, route, put_call_code, trade_type, executed_on_exchange, offset_account, trailer, firm_side, or_fee, occ_fee, non_denominated_currency_traded, fx_fee_in_bps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.type, surrogate.type) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.execution_id, surrogate.execution_id) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.venue_execution_id, surrogate.venue_execution_id) && Intrinsics.areEqual(this.contra_broker, surrogate.contra_broker) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.side == surrogate.side && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.rounded_notional, surrogate.rounded_notional) && Intrinsics.areEqual(this.trade_date, surrogate.trade_date) && Intrinsics.areEqual(this.settlement_date, surrogate.settlement_date) && Intrinsics.areEqual(this.broken_at, surrogate.broken_at) && Intrinsics.areEqual(this.commission, surrogate.commission) && Intrinsics.areEqual(this.leg_id, surrogate.leg_id) && Intrinsics.areEqual(this.correction_details, surrogate.correction_details) && Intrinsics.areEqual(this.sec_fee, surrogate.sec_fee) && Intrinsics.areEqual(this.taf_fee, surrogate.taf_fee) && this.route == surrogate.route && this.put_call_code == surrogate.put_call_code && this.trade_type == surrogate.trade_type && this.executed_on_exchange == surrogate.executed_on_exchange && Intrinsics.areEqual(this.offset_account, surrogate.offset_account) && Intrinsics.areEqual(this.trailer, surrogate.trailer) && this.firm_side == surrogate.firm_side && Intrinsics.areEqual(this.or_fee, surrogate.or_fee) && Intrinsics.areEqual(this.occ_fee, surrogate.occ_fee) && Intrinsics.areEqual(this.non_denominated_currency_traded, surrogate.non_denominated_currency_traded) && Intrinsics.areEqual(this.fx_fee_in_bps, surrogate.fx_fee_in_bps);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            TimeDto timeDto = this.timestamp;
            int iHashCode2 = (iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            UUIDDto uUIDDto = this.execution_id;
            int iHashCode3 = (iHashCode2 + (uUIDDto == null ? 0 : uUIDDto.hashCode())) * 31;
            UUIDDto uUIDDto2 = this.order_id;
            int iHashCode4 = (((((iHashCode3 + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.venue_execution_id.hashCode()) * 31) + this.contra_broker.hashCode()) * 31;
            UUIDDto uUIDDto3 = this.instrument_id;
            int iHashCode5 = (((((iHashCode4 + (uUIDDto3 == null ? 0 : uUIDDto3.hashCode())) * 31) + this.symbol.hashCode()) * 31) + this.side.hashCode()) * 31;
            DecimalDto decimalDto = this.price;
            int iHashCode6 = (iHashCode5 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            DecimalDto decimalDto2 = this.quantity;
            int iHashCode7 = (iHashCode6 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.rounded_notional;
            int iHashCode8 = (((((iHashCode7 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31) + this.trade_date.hashCode()) * 31) + this.settlement_date.hashCode()) * 31;
            TimeDto timeDto2 = this.broken_at;
            int iHashCode9 = (iHashCode8 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31;
            DecimalDto decimalDto4 = this.commission;
            int iHashCode10 = (((iHashCode9 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31) + this.leg_id.hashCode()) * 31;
            PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto = this.correction_details;
            int iHashCode11 = (iHashCode10 + (pinnacleCorrectionDetailsDto == null ? 0 : pinnacleCorrectionDetailsDto.hashCode())) * 31;
            DecimalDto decimalDto5 = this.sec_fee;
            int iHashCode12 = (iHashCode11 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31;
            DecimalDto decimalDto6 = this.taf_fee;
            int iHashCode13 = (((((((((((((((iHashCode12 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31) + this.route.hashCode()) * 31) + this.put_call_code.hashCode()) * 31) + this.trade_type.hashCode()) * 31) + Boolean.hashCode(this.executed_on_exchange)) * 31) + this.offset_account.hashCode()) * 31) + this.trailer.hashCode()) * 31) + this.firm_side.hashCode()) * 31;
            DecimalDto decimalDto7 = this.or_fee;
            int iHashCode14 = (iHashCode13 + (decimalDto7 == null ? 0 : decimalDto7.hashCode())) * 31;
            DecimalDto decimalDto8 = this.occ_fee;
            int iHashCode15 = (iHashCode14 + (decimalDto8 == null ? 0 : decimalDto8.hashCode())) * 31;
            DecimalDto decimalDto9 = this.non_denominated_currency_traded;
            int iHashCode16 = (iHashCode15 + (decimalDto9 == null ? 0 : decimalDto9.hashCode())) * 31;
            DecimalDto decimalDto10 = this.fx_fee_in_bps;
            return iHashCode16 + (decimalDto10 != null ? decimalDto10.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", timestamp=" + this.timestamp + ", execution_id=" + this.execution_id + ", order_id=" + this.order_id + ", venue_execution_id=" + this.venue_execution_id + ", contra_broker=" + this.contra_broker + ", instrument_id=" + this.instrument_id + ", symbol=" + this.symbol + ", side=" + this.side + ", price=" + this.price + ", quantity=" + this.quantity + ", rounded_notional=" + this.rounded_notional + ", trade_date=" + this.trade_date + ", settlement_date=" + this.settlement_date + ", broken_at=" + this.broken_at + ", commission=" + this.commission + ", leg_id=" + this.leg_id + ", correction_details=" + this.correction_details + ", sec_fee=" + this.sec_fee + ", taf_fee=" + this.taf_fee + ", route=" + this.route + ", put_call_code=" + this.put_call_code + ", trade_type=" + this.trade_type + ", executed_on_exchange=" + this.executed_on_exchange + ", offset_account=" + this.offset_account + ", trailer=" + this.trailer + ", firm_side=" + this.firm_side + ", or_fee=" + this.or_fee + ", occ_fee=" + this.occ_fee + ", non_denominated_currency_traded=" + this.non_denominated_currency_traded + ", fx_fee_in_bps=" + this.fx_fee_in_bps + ")";
        }

        /* compiled from: PinnacleExecutionDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PinnacleExecutionDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TimeDto timeDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, String str2, String str3, UUIDDto uUIDDto3, String str4, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, String str5, String str6, TimeDto timeDto2, DecimalDto decimalDto4, String str7, PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, DecimalDto decimalDto5, DecimalDto decimalDto6, RouteDto routeDto, PutCallCodeDto putCallCodeDto, TradeTypeDto tradeTypeDto, boolean z, String str8, String str9, SideDto sideDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, DecimalDto decimalDto10, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.type = "";
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = timeDto;
            }
            if ((i & 4) == 0) {
                this.execution_id = null;
            } else {
                this.execution_id = uUIDDto;
            }
            if ((i & 8) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto2;
            }
            if ((i & 16) == 0) {
                this.venue_execution_id = "";
            } else {
                this.venue_execution_id = str2;
            }
            if ((i & 32) == 0) {
                this.contra_broker = "";
            } else {
                this.contra_broker = str3;
            }
            if ((i & 64) == 0) {
                this.instrument_id = null;
            } else {
                this.instrument_id = uUIDDto3;
            }
            if ((i & 128) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str4;
            }
            if ((i & 256) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 512) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto;
            }
            if ((i & 1024) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto2;
            }
            if ((i & 2048) == 0) {
                this.rounded_notional = null;
            } else {
                this.rounded_notional = decimalDto3;
            }
            if ((i & 4096) == 0) {
                this.trade_date = "";
            } else {
                this.trade_date = str5;
            }
            if ((i & 8192) == 0) {
                this.settlement_date = "";
            } else {
                this.settlement_date = str6;
            }
            if ((i & 16384) == 0) {
                this.broken_at = null;
            } else {
                this.broken_at = timeDto2;
            }
            if ((32768 & i) == 0) {
                this.commission = null;
            } else {
                this.commission = decimalDto4;
            }
            if ((65536 & i) == 0) {
                this.leg_id = "";
            } else {
                this.leg_id = str7;
            }
            if ((131072 & i) == 0) {
                this.correction_details = null;
            } else {
                this.correction_details = pinnacleCorrectionDetailsDto;
            }
            if ((262144 & i) == 0) {
                this.sec_fee = null;
            } else {
                this.sec_fee = decimalDto5;
            }
            if ((524288 & i) == 0) {
                this.taf_fee = null;
            } else {
                this.taf_fee = decimalDto6;
            }
            this.route = (1048576 & i) == 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto;
            this.put_call_code = (2097152 & i) == 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto;
            this.trade_type = (4194304 & i) == 0 ? TradeTypeDto.INSTANCE.getZeroValue() : tradeTypeDto;
            this.executed_on_exchange = (8388608 & i) == 0 ? false : z;
            if ((16777216 & i) == 0) {
                this.offset_account = "";
            } else {
                this.offset_account = str8;
            }
            if ((33554432 & i) == 0) {
                this.trailer = "";
            } else {
                this.trailer = str9;
            }
            this.firm_side = (67108864 & i) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto2;
            if ((134217728 & i) == 0) {
                this.or_fee = null;
            } else {
                this.or_fee = decimalDto7;
            }
            if ((268435456 & i) == 0) {
                this.occ_fee = null;
            } else {
                this.occ_fee = decimalDto8;
            }
            if ((536870912 & i) == 0) {
                this.non_denominated_currency_traded = null;
            } else {
                this.non_denominated_currency_traded = decimalDto9;
            }
            if ((i & 1073741824) == 0) {
                this.fx_fee_in_bps = null;
            } else {
                this.fx_fee_in_bps = decimalDto10;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 0, self.type);
            }
            TimeDto timeDto = self.timestamp;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TimeDto.Serializer.INSTANCE, timeDto);
            }
            UUIDDto uUIDDto = self.execution_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.order_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (!Intrinsics.areEqual(self.venue_execution_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.venue_execution_id);
            }
            if (!Intrinsics.areEqual(self.contra_broker, "")) {
                output.encodeStringElement(serialDesc, 5, self.contra_broker);
            }
            UUIDDto uUIDDto3 = self.instrument_id;
            if (uUIDDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, UUIDDto.Serializer.INSTANCE, uUIDDto3);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 7, self.symbol);
            }
            SideDto sideDto = self.side;
            SideDto.Companion companion = SideDto.INSTANCE;
            if (sideDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, SideDto.Serializer.INSTANCE, self.side);
            }
            DecimalDto decimalDto = self.price;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.quantity;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.rounded_notional;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            if (!Intrinsics.areEqual(self.trade_date, "")) {
                output.encodeStringElement(serialDesc, 12, self.trade_date);
            }
            if (!Intrinsics.areEqual(self.settlement_date, "")) {
                output.encodeStringElement(serialDesc, 13, self.settlement_date);
            }
            TimeDto timeDto2 = self.broken_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            DecimalDto decimalDto4 = self.commission;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            if (!Intrinsics.areEqual(self.leg_id, "")) {
                output.encodeStringElement(serialDesc, 16, self.leg_id);
            }
            PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto = self.correction_details;
            if (pinnacleCorrectionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, PinnacleCorrectionDetailsDto.Serializer.INSTANCE, pinnacleCorrectionDetailsDto);
            }
            DecimalDto decimalDto5 = self.sec_fee;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            DecimalDto decimalDto6 = self.taf_fee;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 20, RouteDto.Serializer.INSTANCE, self.route);
            }
            if (self.put_call_code != PutCallCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 21, PutCallCodeDto.Serializer.INSTANCE, self.put_call_code);
            }
            if (self.trade_type != TradeTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 22, TradeTypeDto.Serializer.INSTANCE, self.trade_type);
            }
            boolean z = self.executed_on_exchange;
            if (z) {
                output.encodeBooleanElement(serialDesc, 23, z);
            }
            if (!Intrinsics.areEqual(self.offset_account, "")) {
                output.encodeStringElement(serialDesc, 24, self.offset_account);
            }
            if (!Intrinsics.areEqual(self.trailer, "")) {
                output.encodeStringElement(serialDesc, 25, self.trailer);
            }
            if (self.firm_side != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 26, SideDto.Serializer.INSTANCE, self.firm_side);
            }
            DecimalDto decimalDto7 = self.or_fee;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
            DecimalDto decimalDto8 = self.occ_fee;
            if (decimalDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, DecimalDto.Serializer.INSTANCE, decimalDto8);
            }
            DecimalDto decimalDto9 = self.non_denominated_currency_traded;
            if (decimalDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, DecimalDto.Serializer.INSTANCE, decimalDto9);
            }
            DecimalDto decimalDto10 = self.fx_fee_in_bps;
            if (decimalDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, DecimalDto.Serializer.INSTANCE, decimalDto10);
            }
        }

        public Surrogate(String type2, TimeDto timeDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, String venue_execution_id, String contra_broker, UUIDDto uUIDDto3, String symbol, SideDto side, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, String trade_date, String settlement_date, TimeDto timeDto2, DecimalDto decimalDto4, String leg_id, PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, DecimalDto decimalDto5, DecimalDto decimalDto6, RouteDto route, PutCallCodeDto put_call_code, TradeTypeDto trade_type, boolean z, String offset_account, String trailer, SideDto firm_side, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, DecimalDto decimalDto10) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(venue_execution_id, "venue_execution_id");
            Intrinsics.checkNotNullParameter(contra_broker, "contra_broker");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(trade_date, "trade_date");
            Intrinsics.checkNotNullParameter(settlement_date, "settlement_date");
            Intrinsics.checkNotNullParameter(leg_id, "leg_id");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(trade_type, "trade_type");
            Intrinsics.checkNotNullParameter(offset_account, "offset_account");
            Intrinsics.checkNotNullParameter(trailer, "trailer");
            Intrinsics.checkNotNullParameter(firm_side, "firm_side");
            this.type = type2;
            this.timestamp = timeDto;
            this.execution_id = uUIDDto;
            this.order_id = uUIDDto2;
            this.venue_execution_id = venue_execution_id;
            this.contra_broker = contra_broker;
            this.instrument_id = uUIDDto3;
            this.symbol = symbol;
            this.side = side;
            this.price = decimalDto;
            this.quantity = decimalDto2;
            this.rounded_notional = decimalDto3;
            this.trade_date = trade_date;
            this.settlement_date = settlement_date;
            this.broken_at = timeDto2;
            this.commission = decimalDto4;
            this.leg_id = leg_id;
            this.correction_details = pinnacleCorrectionDetailsDto;
            this.sec_fee = decimalDto5;
            this.taf_fee = decimalDto6;
            this.route = route;
            this.put_call_code = put_call_code;
            this.trade_type = trade_type;
            this.executed_on_exchange = z;
            this.offset_account = offset_account;
            this.trailer = trailer;
            this.firm_side = firm_side;
            this.or_fee = decimalDto7;
            this.occ_fee = decimalDto8;
            this.non_denominated_currency_traded = decimalDto9;
            this.fx_fee_in_bps = decimalDto10;
        }

        public /* synthetic */ Surrogate(String str, TimeDto timeDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, String str2, String str3, UUIDDto uUIDDto3, String str4, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, String str5, String str6, TimeDto timeDto2, DecimalDto decimalDto4, String str7, PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, DecimalDto decimalDto5, DecimalDto decimalDto6, RouteDto routeDto, PutCallCodeDto putCallCodeDto, TradeTypeDto tradeTypeDto, boolean z, String str8, String str9, SideDto sideDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, DecimalDto decimalDto10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : timeDto, (i & 4) != 0 ? null : uUIDDto, (i & 8) != 0 ? null : uUIDDto2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : uUIDDto3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 512) != 0 ? null : decimalDto, (i & 1024) != 0 ? null : decimalDto2, (i & 2048) != 0 ? null : decimalDto3, (i & 4096) != 0 ? "" : str5, (i & 8192) != 0 ? "" : str6, (i & 16384) != 0 ? null : timeDto2, (i & 32768) != 0 ? null : decimalDto4, (i & 65536) != 0 ? "" : str7, (i & 131072) != 0 ? null : pinnacleCorrectionDetailsDto, (i & 262144) != 0 ? null : decimalDto5, (i & 524288) != 0 ? null : decimalDto6, (i & 1048576) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i & 2097152) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i & 4194304) != 0 ? TradeTypeDto.INSTANCE.getZeroValue() : tradeTypeDto, (i & 8388608) != 0 ? false : z, (i & 16777216) != 0 ? "" : str8, (i & 33554432) == 0 ? str9 : "", (i & 67108864) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto2, (i & 134217728) != 0 ? null : decimalDto7, (i & 268435456) != 0 ? null : decimalDto8, (i & 536870912) != 0 ? null : decimalDto9, (i & 1073741824) != 0 ? null : decimalDto10);
        }

        public final String getType() {
            return this.type;
        }

        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        public final UUIDDto getExecution_id() {
            return this.execution_id;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final String getVenue_execution_id() {
            return this.venue_execution_id;
        }

        public final String getContra_broker() {
            return this.contra_broker;
        }

        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final DecimalDto getRounded_notional() {
            return this.rounded_notional;
        }

        public final String getTrade_date() {
            return this.trade_date;
        }

        public final String getSettlement_date() {
            return this.settlement_date;
        }

        public final TimeDto getBroken_at() {
            return this.broken_at;
        }

        public final DecimalDto getCommission() {
            return this.commission;
        }

        public final String getLeg_id() {
            return this.leg_id;
        }

        public final PinnacleCorrectionDetailsDto getCorrection_details() {
            return this.correction_details;
        }

        public final DecimalDto getSec_fee() {
            return this.sec_fee;
        }

        public final DecimalDto getTaf_fee() {
            return this.taf_fee;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        public final TradeTypeDto getTrade_type() {
            return this.trade_type;
        }

        public final boolean getExecuted_on_exchange() {
            return this.executed_on_exchange;
        }

        public final String getOffset_account() {
            return this.offset_account;
        }

        public final String getTrailer() {
            return this.trailer;
        }

        public final SideDto getFirm_side() {
            return this.firm_side;
        }

        public final DecimalDto getOr_fee() {
            return this.or_fee;
        }

        public final DecimalDto getOcc_fee() {
            return this.occ_fee;
        }

        public final DecimalDto getNon_denominated_currency_traded() {
            return this.non_denominated_currency_traded;
        }

        public final DecimalDto getFx_fee_in_bps() {
            return this.fx_fee_in_bps;
        }
    }

    /* compiled from: PinnacleExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto;", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PinnacleExecutionDetailsDto, PinnacleExecutionDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PinnacleExecutionDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleExecutionDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleExecutionDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PinnacleExecutionDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PinnacleExecutionDetails> getProtoAdapter() {
            return PinnacleExecutionDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleExecutionDetailsDto getZeroValue() {
            return PinnacleExecutionDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleExecutionDetailsDto fromProto(PinnacleExecutionDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String type2 = proto.getType();
            Time timestamp = proto.getTimestamp();
            TimeDto timeDtoFromProto = timestamp != null ? TimeDto.INSTANCE.fromProto(timestamp) : null;
            UUID execution_id = proto.getExecution_id();
            UUIDDto uUIDDtoFromProto = execution_id != null ? UUIDDto.INSTANCE.fromProto(execution_id) : null;
            UUID order_id = proto.getOrder_id();
            UUIDDto uUIDDtoFromProto2 = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            String venue_execution_id = proto.getVenue_execution_id();
            String contra_broker = proto.getContra_broker();
            UUID instrument_id = proto.getInstrument_id();
            UUIDDto uUIDDtoFromProto3 = instrument_id != null ? UUIDDto.INSTANCE.fromProto(instrument_id) : null;
            String symbol = proto.getSymbol();
            SideDto.Companion companion = SideDto.INSTANCE;
            SideDto sideDtoFromProto = companion.fromProto(proto.getSide());
            Decimal price = proto.getPrice();
            DecimalDto decimalDtoFromProto = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            Decimal quantity = proto.getQuantity();
            DecimalDto decimalDtoFromProto2 = quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null;
            Decimal rounded_notional = proto.getRounded_notional();
            DecimalDto decimalDtoFromProto3 = rounded_notional != null ? DecimalDto.INSTANCE.fromProto(rounded_notional) : null;
            String trade_date = proto.getTrade_date();
            DecimalDto decimalDto = decimalDtoFromProto;
            DecimalDto decimalDto2 = decimalDtoFromProto2;
            DecimalDto decimalDto3 = decimalDtoFromProto3;
            String settlement_date = proto.getSettlement_date();
            Time broken_at = proto.getBroken_at();
            TimeDto timeDto = timeDtoFromProto;
            TimeDto timeDtoFromProto2 = broken_at != null ? TimeDto.INSTANCE.fromProto(broken_at) : null;
            Decimal commission = proto.getCommission();
            TimeDto timeDto2 = timeDtoFromProto2;
            DecimalDto decimalDtoFromProto4 = commission != null ? DecimalDto.INSTANCE.fromProto(commission) : null;
            String leg_id = proto.getLeg_id();
            DecimalDto decimalDto4 = decimalDtoFromProto4;
            PinnacleCorrectionDetails correction_details = proto.getCorrection_details();
            PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDtoFromProto = correction_details != null ? PinnacleCorrectionDetailsDto.INSTANCE.fromProto(correction_details) : null;
            Decimal sec_fee = proto.getSec_fee();
            PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto = pinnacleCorrectionDetailsDtoFromProto;
            DecimalDto decimalDtoFromProto5 = sec_fee != null ? DecimalDto.INSTANCE.fromProto(sec_fee) : null;
            Decimal taf_fee = proto.getTaf_fee();
            DecimalDto decimalDto5 = decimalDtoFromProto5;
            DecimalDto decimalDtoFromProto6 = taf_fee != null ? DecimalDto.INSTANCE.fromProto(taf_fee) : null;
            RouteDto routeDtoFromProto = RouteDto.INSTANCE.fromProto(proto.getRoute());
            PutCallCodeDto putCallCodeDtoFromProto = PutCallCodeDto.INSTANCE.fromProto(proto.getPut_call_code());
            TradeTypeDto tradeTypeDtoFromProto = TradeTypeDto.INSTANCE.fromProto(proto.getTrade_type());
            boolean executed_on_exchange = proto.getExecuted_on_exchange();
            String offset_account = proto.getOffset_account();
            String trailer = proto.getTrailer();
            SideDto sideDtoFromProto2 = companion.fromProto(proto.getFirm_side());
            Decimal or_fee = proto.getOr_fee();
            DecimalDto decimalDtoFromProto7 = or_fee != null ? DecimalDto.INSTANCE.fromProto(or_fee) : null;
            Decimal occ_fee = proto.getOcc_fee();
            DecimalDto decimalDto6 = decimalDtoFromProto7;
            DecimalDto decimalDtoFromProto8 = occ_fee != null ? DecimalDto.INSTANCE.fromProto(occ_fee) : null;
            Decimal non_denominated_currency_traded = proto.getNon_denominated_currency_traded();
            DecimalDto decimalDto7 = decimalDtoFromProto8;
            DecimalDto decimalDtoFromProto9 = non_denominated_currency_traded != null ? DecimalDto.INSTANCE.fromProto(non_denominated_currency_traded) : null;
            Decimal fx_fee_in_bps = proto.getFx_fee_in_bps();
            return new PinnacleExecutionDetailsDto(new Surrogate(type2, timeDto, uUIDDtoFromProto, uUIDDtoFromProto2, venue_execution_id, contra_broker, uUIDDtoFromProto3, symbol, sideDtoFromProto, decimalDto, decimalDto2, decimalDto3, trade_date, settlement_date, timeDto2, decimalDto4, leg_id, pinnacleCorrectionDetailsDto, decimalDto5, decimalDtoFromProto6, routeDtoFromProto, putCallCodeDtoFromProto, tradeTypeDtoFromProto, executed_on_exchange, offset_account, trailer, sideDtoFromProto2, decimalDto6, decimalDto7, decimalDtoFromProto9, fx_fee_in_bps != null ? DecimalDto.INSTANCE.fromProto(fx_fee_in_bps) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.PinnacleExecutionDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinnacleExecutionDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PinnacleExecutionDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PinnacleExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PinnacleExecutionDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.PinnacleExecutionDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PinnacleExecutionDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PinnacleExecutionDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PinnacleExecutionDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PinnacleExecutionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.PinnacleExecutionDetailsDto";
        }
    }
}
