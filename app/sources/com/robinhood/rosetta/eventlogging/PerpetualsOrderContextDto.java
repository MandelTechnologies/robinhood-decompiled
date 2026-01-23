package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContext;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* compiled from: PerpetualsOrderContextDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\tXYZ[\\]^_`B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020\u0010\u0012\b\b\u0002\u0010%\u001a\u00020\u0010\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010*J\u0080\u0002\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\tJ\b\u0010L\u001a\u00020\u0002H\u0016J\b\u0010M\u001a\u00020\tH\u0016J\u0013\u0010N\u001a\u00020'2\b\u0010O\u001a\u0004\u0018\u00010PH\u0096\u0002J\b\u0010Q\u001a\u00020\u001eH\u0016J\u0018\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u001eH\u0016J\b\u0010W\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b6\u00103R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010,R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b:\u00103R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010,R\u0011\u0010\u0019\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b<\u00103R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b=\u00103R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u001f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bB\u00103R\u0011\u0010 \u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bC\u00103R\u0011\u0010!\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bD\u00103R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010$\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bG\u00103R\u0011\u0010%\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bH\u00103R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b&\u0010IR\u0011\u0010(\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010IR\u0011\u0010)\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010,¨\u0006a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Surrogate;)V", "order_id", "", "contract_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", BidAskDetails3.BID_PRICE, "", BidAskDetails3.ASK_PRICE, "limit_price", "stop_price", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "quote_currency_code", "order_quantity", "order_currency_code", "avg_executed_price", "total_notional_amount", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "leverage", "", "take_profit", "stop_loss", "fees", "status", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "executed_notional", "executed_quantity", "is_liquidation_order", "", "is_close_position_order", "ref_id", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;DDZZLjava/lang/String;)V", "getOrder_id", "()Ljava/lang/String;", "getContract_id", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "getBid_price", "()D", "getAsk_price", "getLimit_price", "getStop_price", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "getQuote_currency_code", "getOrder_quantity", "getOrder_currency_code", "getAvg_executed_price", "getTotal_notional_amount", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "getLeverage", "()I", "getTake_profit", "getStop_loss", "getFees", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "getExecuted_notional", "getExecuted_quantity", "()Z", "getRef_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "PerpetualsOrderTypeDto", "PerpetualsOrderSideDto", "TimeInForceDto", "MarginModeDto", "OrderStatusDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class PerpetualsOrderContextDto implements Dto3<PerpetualsOrderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerpetualsOrderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerpetualsOrderContextDto, PerpetualsOrderContext>> binaryBase64Serializer$delegate;
    private static final PerpetualsOrderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerpetualsOrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerpetualsOrderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final PerpetualsOrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final PerpetualsOrderSideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final double getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final double getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final double getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final double getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final String getQuote_currency_code() {
        return this.surrogate.getQuote_currency_code();
    }

    public final double getOrder_quantity() {
        return this.surrogate.getOrder_quantity();
    }

    public final String getOrder_currency_code() {
        return this.surrogate.getOrder_currency_code();
    }

    public final double getAvg_executed_price() {
        return this.surrogate.getAvg_executed_price();
    }

    public final double getTotal_notional_amount() {
        return this.surrogate.getTotal_notional_amount();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final int getLeverage() {
        return this.surrogate.getLeverage();
    }

    public final double getTake_profit() {
        return this.surrogate.getTake_profit();
    }

    public final double getStop_loss() {
        return this.surrogate.getStop_loss();
    }

    public final double getFees() {
        return this.surrogate.getFees();
    }

    public final OrderStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final double getExecuted_notional() {
        return this.surrogate.getExecuted_notional();
    }

    public final double getExecuted_quantity() {
        return this.surrogate.getExecuted_quantity();
    }

    public final boolean is_liquidation_order() {
        return this.surrogate.is_liquidation_order();
    }

    public final boolean is_close_position_order() {
        return this.surrogate.is_close_position_order();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public /* synthetic */ PerpetualsOrderContextDto(String str, String str2, PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, TimeInForceDto timeInForceDto, String str3, double d5, String str4, double d6, double d7, MarginModeDto marginModeDto, int i, double d8, double d9, double d10, OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? PerpetualsOrderTypeDto.INSTANCE.getZeroValue() : perpetualsOrderTypeDto, (i2 & 8) != 0 ? PerpetualsOrderSideDto.INSTANCE.getZeroValue() : perpetualsOrderSideDto, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? 0.0d : d2, (i2 & 64) != 0 ? 0.0d : d3, (i2 & 128) != 0 ? 0.0d : d4, (i2 & 256) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 512) != 0 ? "" : str3, (i2 & 1024) != 0 ? 0.0d : d5, (i2 & 2048) != 0 ? "" : str4, (i2 & 4096) != 0 ? 0.0d : d6, (i2 & 8192) != 0 ? 0.0d : d7, (i2 & 16384) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i2 & 32768) != 0 ? 0 : i, (i2 & 65536) != 0 ? 0.0d : d8, (i2 & 131072) != 0 ? 0.0d : d9, (i2 & 262144) != 0 ? 0.0d : d10, (i2 & 524288) != 0 ? OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto, (i2 & 1048576) != 0 ? 0.0d : d11, (i2 & 2097152) != 0 ? 0.0d : d12, (i2 & 4194304) != 0 ? false : z, (i2 & 8388608) == 0 ? z2 : false, (i2 & 16777216) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerpetualsOrderContextDto(String order_id, String contract_id, PerpetualsOrderTypeDto order_type, PerpetualsOrderSideDto order_side, double d, double d2, double d3, double d4, TimeInForceDto time_in_force, String quote_currency_code, double d5, String order_currency_code, double d6, double d7, MarginModeDto margin_mode, int i, double d8, double d9, double d10, OrderStatusDto status, double d11, double d12, boolean z, boolean z2, String ref_id) {
        this(new Surrogate(order_id, contract_id, order_type, order_side, d, d2, d3, d4, time_in_force, quote_currency_code, d5, order_currency_code, d6, d7, margin_mode, i, d8, d9, d10, status, d11, d12, z, z2, ref_id));
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
    }

    public static /* synthetic */ PerpetualsOrderContextDto copy$default(PerpetualsOrderContextDto perpetualsOrderContextDto, String str, String str2, PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, TimeInForceDto timeInForceDto, String str3, double d5, String str4, double d6, double d7, MarginModeDto marginModeDto, int i, double d8, double d9, double d10, OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str5, int i2, Object obj) {
        String ref_id;
        boolean z3;
        String order_id = (i2 & 1) != 0 ? perpetualsOrderContextDto.surrogate.getOrder_id() : str;
        String contract_id = (i2 & 2) != 0 ? perpetualsOrderContextDto.surrogate.getContract_id() : str2;
        PerpetualsOrderTypeDto order_type = (i2 & 4) != 0 ? perpetualsOrderContextDto.surrogate.getOrder_type() : perpetualsOrderTypeDto;
        PerpetualsOrderSideDto order_side = (i2 & 8) != 0 ? perpetualsOrderContextDto.surrogate.getOrder_side() : perpetualsOrderSideDto;
        double bid_price = (i2 & 16) != 0 ? perpetualsOrderContextDto.surrogate.getBid_price() : d;
        double ask_price = (i2 & 32) != 0 ? perpetualsOrderContextDto.surrogate.getAsk_price() : d2;
        double limit_price = (i2 & 64) != 0 ? perpetualsOrderContextDto.surrogate.getLimit_price() : d3;
        double stop_price = (i2 & 128) != 0 ? perpetualsOrderContextDto.surrogate.getStop_price() : d4;
        TimeInForceDto time_in_force = (i2 & 256) != 0 ? perpetualsOrderContextDto.surrogate.getTime_in_force() : timeInForceDto;
        String quote_currency_code = (i2 & 512) != 0 ? perpetualsOrderContextDto.surrogate.getQuote_currency_code() : str3;
        String str6 = order_id;
        double order_quantity = (i2 & 1024) != 0 ? perpetualsOrderContextDto.surrogate.getOrder_quantity() : d5;
        String order_currency_code = (i2 & 2048) != 0 ? perpetualsOrderContextDto.surrogate.getOrder_currency_code() : str4;
        double avg_executed_price = (i2 & 4096) != 0 ? perpetualsOrderContextDto.surrogate.getAvg_executed_price() : d6;
        double total_notional_amount = (i2 & 8192) != 0 ? perpetualsOrderContextDto.surrogate.getTotal_notional_amount() : d7;
        MarginModeDto margin_mode = (i2 & 16384) != 0 ? perpetualsOrderContextDto.surrogate.getMargin_mode() : marginModeDto;
        int leverage = (i2 & 32768) != 0 ? perpetualsOrderContextDto.surrogate.getLeverage() : i;
        double take_profit = (i2 & 65536) != 0 ? perpetualsOrderContextDto.surrogate.getTake_profit() : d8;
        double stop_loss = (i2 & 131072) != 0 ? perpetualsOrderContextDto.surrogate.getStop_loss() : d9;
        double fees = (i2 & 262144) != 0 ? perpetualsOrderContextDto.surrogate.getFees() : d10;
        OrderStatusDto status = (i2 & 524288) != 0 ? perpetualsOrderContextDto.surrogate.getStatus() : orderStatusDto;
        double executed_notional = (i2 & 1048576) != 0 ? perpetualsOrderContextDto.surrogate.getExecuted_notional() : d11;
        double executed_quantity = (i2 & 2097152) != 0 ? perpetualsOrderContextDto.surrogate.getExecuted_quantity() : d12;
        boolean zIs_liquidation_order = (i2 & 4194304) != 0 ? perpetualsOrderContextDto.surrogate.is_liquidation_order() : z;
        boolean zIs_close_position_order = (i2 & 8388608) != 0 ? perpetualsOrderContextDto.surrogate.is_close_position_order() : z2;
        if ((i2 & 16777216) != 0) {
            z3 = zIs_close_position_order;
            ref_id = perpetualsOrderContextDto.surrogate.getRef_id();
        } else {
            ref_id = str5;
            z3 = zIs_close_position_order;
        }
        return perpetualsOrderContextDto.copy(str6, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, zIs_liquidation_order, z3, ref_id);
    }

    public final PerpetualsOrderContextDto copy(String order_id, String contract_id, PerpetualsOrderTypeDto order_type, PerpetualsOrderSideDto order_side, double bid_price, double ask_price, double limit_price, double stop_price, TimeInForceDto time_in_force, String quote_currency_code, double order_quantity, String order_currency_code, double avg_executed_price, double total_notional_amount, MarginModeDto margin_mode, int leverage, double take_profit, double stop_loss, double fees, OrderStatusDto status, double executed_notional, double executed_quantity, boolean is_liquidation_order, boolean is_close_position_order, String ref_id) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        return new PerpetualsOrderContextDto(new Surrogate(order_id, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, is_liquidation_order, is_close_position_order, ref_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PerpetualsOrderContext toProto() {
        return new PerpetualsOrderContext(this.surrogate.getOrder_id(), this.surrogate.getContract_id(), (PerpetualsOrderContext.PerpetualsOrderType) this.surrogate.getOrder_type().toProto(), (PerpetualsOrderContext.PerpetualsOrderSide) this.surrogate.getOrder_side().toProto(), this.surrogate.getBid_price(), this.surrogate.getAsk_price(), this.surrogate.getLimit_price(), this.surrogate.getStop_price(), (PerpetualsOrderContext.TimeInForce) this.surrogate.getTime_in_force().toProto(), this.surrogate.getQuote_currency_code(), this.surrogate.getOrder_quantity(), this.surrogate.getOrder_currency_code(), this.surrogate.getAvg_executed_price(), this.surrogate.getTotal_notional_amount(), (PerpetualsOrderContext.MarginMode) this.surrogate.getMargin_mode().toProto(), this.surrogate.getLeverage(), this.surrogate.getTake_profit(), this.surrogate.getStop_loss(), this.surrogate.getFees(), (PerpetualsOrderContext.OrderStatus) this.surrogate.getStatus().toProto(), this.surrogate.getExecuted_notional(), this.surrogate.getExecuted_quantity(), this.surrogate.is_liquidation_order(), this.surrogate.is_close_position_order(), this.surrogate.getRef_id(), null, 33554432, null);
    }

    public String toString() {
        return "[PerpetualsOrderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerpetualsOrderContextDto) && Intrinsics.areEqual(((PerpetualsOrderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bZ\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u008f\u00012\u00020\u0001:\u0004\u008e\u0001\u008f\u0001BÄ\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\u001b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001c\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u001e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u001f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\u0017\b\u0002\u0010\"\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010#\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)B÷\u0001\b\u0010\u0012\u0006\u0010*\u001a\u00020\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010-J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\u0018\u0010l\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010m\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010n\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010o\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010p\u001a\u00020\u0012HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\u0018\u0010r\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\u0018\u0010t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010u\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010v\u001a\u00020\u0019HÆ\u0003J\u0018\u0010w\u001a\u00110\u001b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001cHÆ\u0003J\u0018\u0010x\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010y\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010z\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010{\u001a\u00020!HÆ\u0003J\u0018\u0010|\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010}\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010~\u001a\u00020%HÆ\u0003J\t\u0010\u007f\u001a\u00020%HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003JÇ\u0003\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0017\b\u0002\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0017\b\u0002\u0010\u001a\u001a\u00110\u001b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001c2\u0017\b\u0002\u0010\u001d\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u001e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u001f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010 \u001a\u00020!2\u0017\b\u0002\u0010\"\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010#\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u0003HÆ\u0001J\u0015\u0010\u0082\u0001\u001a\u00020%2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u001bHÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0001¢\u0006\u0003\b\u008d\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010/\u001a\u0004\b8\u00109R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010/\u001a\u0004\b;\u0010<R+\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010/\u001a\u0004\b>\u0010<R+\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010/\u001a\u0004\b@\u0010<R+\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010/\u001a\u0004\bB\u0010<R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010/\u001a\u0004\bD\u0010ER\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010/\u001a\u0004\bG\u00101R+\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010/\u001a\u0004\bI\u0010<R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010/\u001a\u0004\bK\u00101R+\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010/\u001a\u0004\bM\u0010<R+\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010/\u001a\u0004\bO\u0010<R\u001c\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010/\u001a\u0004\bQ\u0010RR+\u0010\u001a\u001a\u00110\u001b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010/\u001a\u0004\bT\u0010UR+\u0010\u001d\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010/\u001a\u0004\bW\u0010<R+\u0010\u001e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010/\u001a\u0004\bY\u0010<R+\u0010\u001f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010/\u001a\u0004\b[\u0010<R\u001c\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010/\u001a\u0004\b]\u0010^R+\u0010\"\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u0010/\u001a\u0004\b`\u0010<R+\u0010#\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\ba\u0010/\u001a\u0004\bb\u0010<R\u001c\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u0010/\u001a\u0004\b$\u0010dR\u001c\u0010&\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u0010/\u001a\u0004\b&\u0010dR\u001c\u0010'\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010/\u001a\u0004\bg\u00101¨\u0006\u0090\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Surrogate;", "", "order_id", "", "contract_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", BidAskDetails3.BID_PRICE, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", BidAskDetails3.ASK_PRICE, "limit_price", "stop_price", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "quote_currency_code", "order_quantity", "order_currency_code", "avg_executed_price", "total_notional_amount", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "leverage", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "take_profit", "stop_loss", "fees", "status", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "executed_notional", "executed_quantity", "is_liquidation_order", "", "is_close_position_order", "ref_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;DDZZLjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;DDZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Ljava/lang/String;", "getContract_id$annotations", "getContract_id", "getOrder_type$annotations", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "getOrder_side$annotations", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "getBid_price$annotations", "getBid_price", "()D", "getAsk_price$annotations", "getAsk_price", "getLimit_price$annotations", "getLimit_price", "getStop_price$annotations", "getStop_price", "getTime_in_force$annotations", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "getQuote_currency_code$annotations", "getQuote_currency_code", "getOrder_quantity$annotations", "getOrder_quantity", "getOrder_currency_code$annotations", "getOrder_currency_code", "getAvg_executed_price$annotations", "getAvg_executed_price", "getTotal_notional_amount$annotations", "getTotal_notional_amount", "getMargin_mode$annotations", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "getLeverage$annotations", "getLeverage", "()I", "getTake_profit$annotations", "getTake_profit", "getStop_loss$annotations", "getStop_loss", "getFees$annotations", "getFees", "getStatus$annotations", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "getExecuted_notional$annotations", "getExecuted_notional", "getExecuted_quantity$annotations", "getExecuted_quantity", "is_liquidation_order$annotations", "()Z", "is_close_position_order$annotations", "getRef_id$annotations", "getRef_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double ask_price;
        private final double avg_executed_price;
        private final double bid_price;
        private final String contract_id;
        private final double executed_notional;
        private final double executed_quantity;
        private final double fees;
        private final boolean is_close_position_order;
        private final boolean is_liquidation_order;
        private final int leverage;
        private final double limit_price;
        private final MarginModeDto margin_mode;
        private final String order_currency_code;
        private final String order_id;
        private final double order_quantity;
        private final PerpetualsOrderSideDto order_side;
        private final PerpetualsOrderTypeDto order_type;
        private final String quote_currency_code;
        private final String ref_id;
        private final OrderStatusDto status;
        private final double stop_loss;
        private final double stop_price;
        private final double take_profit;
        private final TimeInForceDto time_in_force;
        private final double total_notional_amount;

        public Surrogate() {
            this((String) null, (String) null, (PerpetualsOrderTypeDto) null, (PerpetualsOrderSideDto) null, 0.0d, 0.0d, 0.0d, 0.0d, (TimeInForceDto) null, (String) null, 0.0d, (String) null, 0.0d, 0.0d, (MarginModeDto) null, 0, 0.0d, 0.0d, 0.0d, (OrderStatusDto) null, 0.0d, 0.0d, false, false, (String) null, 33554431, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, TimeInForceDto timeInForceDto, String str3, double d5, String str4, double d6, double d7, MarginModeDto marginModeDto, int i, double d8, double d9, double d10, OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str5, int i2, Object obj) {
            String str6;
            boolean z3;
            String str7 = (i2 & 1) != 0 ? surrogate.order_id : str;
            String str8 = (i2 & 2) != 0 ? surrogate.contract_id : str2;
            PerpetualsOrderTypeDto perpetualsOrderTypeDto2 = (i2 & 4) != 0 ? surrogate.order_type : perpetualsOrderTypeDto;
            PerpetualsOrderSideDto perpetualsOrderSideDto2 = (i2 & 8) != 0 ? surrogate.order_side : perpetualsOrderSideDto;
            double d13 = (i2 & 16) != 0 ? surrogate.bid_price : d;
            double d14 = (i2 & 32) != 0 ? surrogate.ask_price : d2;
            double d15 = (i2 & 64) != 0 ? surrogate.limit_price : d3;
            double d16 = (i2 & 128) != 0 ? surrogate.stop_price : d4;
            TimeInForceDto timeInForceDto2 = (i2 & 256) != 0 ? surrogate.time_in_force : timeInForceDto;
            String str9 = (i2 & 512) != 0 ? surrogate.quote_currency_code : str3;
            String str10 = str7;
            String str11 = str8;
            double d17 = (i2 & 1024) != 0 ? surrogate.order_quantity : d5;
            String str12 = (i2 & 2048) != 0 ? surrogate.order_currency_code : str4;
            double d18 = (i2 & 4096) != 0 ? surrogate.avg_executed_price : d6;
            double d19 = (i2 & 8192) != 0 ? surrogate.total_notional_amount : d7;
            MarginModeDto marginModeDto2 = (i2 & 16384) != 0 ? surrogate.margin_mode : marginModeDto;
            int i3 = (32768 & i2) != 0 ? surrogate.leverage : i;
            MarginModeDto marginModeDto3 = marginModeDto2;
            double d20 = (i2 & 65536) != 0 ? surrogate.take_profit : d8;
            double d21 = (i2 & 131072) != 0 ? surrogate.stop_loss : d9;
            double d22 = (i2 & 262144) != 0 ? surrogate.fees : d10;
            OrderStatusDto orderStatusDto2 = (i2 & 524288) != 0 ? surrogate.status : orderStatusDto;
            double d23 = (i2 & 1048576) != 0 ? surrogate.executed_notional : d11;
            double d24 = (i2 & 2097152) != 0 ? surrogate.executed_quantity : d12;
            boolean z4 = (i2 & 4194304) != 0 ? surrogate.is_liquidation_order : z;
            boolean z5 = (i2 & 8388608) != 0 ? surrogate.is_close_position_order : z2;
            if ((i2 & 16777216) != 0) {
                z3 = z4;
                str6 = surrogate.ref_id;
            } else {
                str6 = str5;
                z3 = z4;
            }
            return surrogate.copy(str10, str11, perpetualsOrderTypeDto2, perpetualsOrderSideDto2, d13, d14, d15, d16, timeInForceDto2, str9, d17, str12, d18, d19, marginModeDto3, i3, d20, d21, d22, orderStatusDto2, d23, d24, z3, z5, str6);
        }

        @SerialName("askPrice")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_PRICE})
        public static /* synthetic */ void getAsk_price$annotations() {
        }

        @SerialName("avgExecutedPrice")
        @JsonAnnotations2(names = {"avg_executed_price"})
        public static /* synthetic */ void getAvg_executed_price$annotations() {
        }

        @SerialName("bidPrice")
        @JsonAnnotations2(names = {BidAskDetails3.BID_PRICE})
        public static /* synthetic */ void getBid_price$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("executedNotional")
        @JsonAnnotations2(names = {"executed_notional"})
        public static /* synthetic */ void getExecuted_notional$annotations() {
        }

        @SerialName("executedQuantity")
        @JsonAnnotations2(names = {"executed_quantity"})
        public static /* synthetic */ void getExecuted_quantity$annotations() {
        }

        @SerialName("fees")
        @JsonAnnotations2(names = {"fees"})
        public static /* synthetic */ void getFees$annotations() {
        }

        @SerialName("leverage")
        @JsonAnnotations2(names = {"leverage"})
        public static /* synthetic */ void getLeverage$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("marginMode")
        @JsonAnnotations2(names = {"margin_mode"})
        public static /* synthetic */ void getMargin_mode$annotations() {
        }

        @SerialName("orderCurrencyCode")
        @JsonAnnotations2(names = {"order_currency_code"})
        public static /* synthetic */ void getOrder_currency_code$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderQuantity")
        @JsonAnnotations2(names = {"order_quantity"})
        public static /* synthetic */ void getOrder_quantity$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("quoteCurrencyCode")
        @JsonAnnotations2(names = {"quote_currency_code"})
        public static /* synthetic */ void getQuote_currency_code$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("stopLoss")
        @JsonAnnotations2(names = {"stop_loss"})
        public static /* synthetic */ void getStop_loss$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("takeProfit")
        @JsonAnnotations2(names = {"take_profit"})
        public static /* synthetic */ void getTake_profit$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("totalNotionalAmount")
        @JsonAnnotations2(names = {"total_notional_amount"})
        public static /* synthetic */ void getTotal_notional_amount$annotations() {
        }

        @SerialName("isClosePositionOrder")
        @JsonAnnotations2(names = {"is_close_position_order"})
        public static /* synthetic */ void is_close_position_order$annotations() {
        }

        @SerialName("isLiquidationOrder")
        @JsonAnnotations2(names = {"is_liquidation_order"})
        public static /* synthetic */ void is_liquidation_order$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getQuote_currency_code() {
            return this.quote_currency_code;
        }

        /* renamed from: component11, reason: from getter */
        public final double getOrder_quantity() {
            return this.order_quantity;
        }

        /* renamed from: component12, reason: from getter */
        public final String getOrder_currency_code() {
            return this.order_currency_code;
        }

        /* renamed from: component13, reason: from getter */
        public final double getAvg_executed_price() {
            return this.avg_executed_price;
        }

        /* renamed from: component14, reason: from getter */
        public final double getTotal_notional_amount() {
            return this.total_notional_amount;
        }

        /* renamed from: component15, reason: from getter */
        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        /* renamed from: component16, reason: from getter */
        public final int getLeverage() {
            return this.leverage;
        }

        /* renamed from: component17, reason: from getter */
        public final double getTake_profit() {
            return this.take_profit;
        }

        /* renamed from: component18, reason: from getter */
        public final double getStop_loss() {
            return this.stop_loss;
        }

        /* renamed from: component19, reason: from getter */
        public final double getFees() {
            return this.fees;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component20, reason: from getter */
        public final OrderStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component21, reason: from getter */
        public final double getExecuted_notional() {
            return this.executed_notional;
        }

        /* renamed from: component22, reason: from getter */
        public final double getExecuted_quantity() {
            return this.executed_quantity;
        }

        /* renamed from: component23, reason: from getter */
        public final boolean getIs_liquidation_order() {
            return this.is_liquidation_order;
        }

        /* renamed from: component24, reason: from getter */
        public final boolean getIs_close_position_order() {
            return this.is_close_position_order;
        }

        /* renamed from: component25, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component3, reason: from getter */
        public final PerpetualsOrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component4, reason: from getter */
        public final PerpetualsOrderSideDto getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component5, reason: from getter */
        public final double getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component6, reason: from getter */
        public final double getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component7, reason: from getter */
        public final double getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component8, reason: from getter */
        public final double getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component9, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final Surrogate copy(String order_id, String contract_id, PerpetualsOrderTypeDto order_type, PerpetualsOrderSideDto order_side, double bid_price, double ask_price, double limit_price, double stop_price, TimeInForceDto time_in_force, String quote_currency_code, double order_quantity, String order_currency_code, double avg_executed_price, double total_notional_amount, MarginModeDto margin_mode, int leverage, double take_profit, double stop_loss, double fees, OrderStatusDto status, double executed_notional, double executed_quantity, boolean is_liquidation_order, boolean is_close_position_order, String ref_id) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            return new Surrogate(order_id, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, is_liquidation_order, is_close_position_order, ref_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.order_type == surrogate.order_type && this.order_side == surrogate.order_side && Double.compare(this.bid_price, surrogate.bid_price) == 0 && Double.compare(this.ask_price, surrogate.ask_price) == 0 && Double.compare(this.limit_price, surrogate.limit_price) == 0 && Double.compare(this.stop_price, surrogate.stop_price) == 0 && this.time_in_force == surrogate.time_in_force && Intrinsics.areEqual(this.quote_currency_code, surrogate.quote_currency_code) && Double.compare(this.order_quantity, surrogate.order_quantity) == 0 && Intrinsics.areEqual(this.order_currency_code, surrogate.order_currency_code) && Double.compare(this.avg_executed_price, surrogate.avg_executed_price) == 0 && Double.compare(this.total_notional_amount, surrogate.total_notional_amount) == 0 && this.margin_mode == surrogate.margin_mode && this.leverage == surrogate.leverage && Double.compare(this.take_profit, surrogate.take_profit) == 0 && Double.compare(this.stop_loss, surrogate.stop_loss) == 0 && Double.compare(this.fees, surrogate.fees) == 0 && this.status == surrogate.status && Double.compare(this.executed_notional, surrogate.executed_notional) == 0 && Double.compare(this.executed_quantity, surrogate.executed_quantity) == 0 && this.is_liquidation_order == surrogate.is_liquidation_order && this.is_close_position_order == surrogate.is_close_position_order && Intrinsics.areEqual(this.ref_id, surrogate.ref_id);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((this.order_id.hashCode() * 31) + this.contract_id.hashCode()) * 31) + this.order_type.hashCode()) * 31) + this.order_side.hashCode()) * 31) + Double.hashCode(this.bid_price)) * 31) + Double.hashCode(this.ask_price)) * 31) + Double.hashCode(this.limit_price)) * 31) + Double.hashCode(this.stop_price)) * 31) + this.time_in_force.hashCode()) * 31) + this.quote_currency_code.hashCode()) * 31) + Double.hashCode(this.order_quantity)) * 31) + this.order_currency_code.hashCode()) * 31) + Double.hashCode(this.avg_executed_price)) * 31) + Double.hashCode(this.total_notional_amount)) * 31) + this.margin_mode.hashCode()) * 31) + Integer.hashCode(this.leverage)) * 31) + Double.hashCode(this.take_profit)) * 31) + Double.hashCode(this.stop_loss)) * 31) + Double.hashCode(this.fees)) * 31) + this.status.hashCode()) * 31) + Double.hashCode(this.executed_notional)) * 31) + Double.hashCode(this.executed_quantity)) * 31) + java.lang.Boolean.hashCode(this.is_liquidation_order)) * 31) + java.lang.Boolean.hashCode(this.is_close_position_order)) * 31) + this.ref_id.hashCode();
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", contract_id=" + this.contract_id + ", order_type=" + this.order_type + ", order_side=" + this.order_side + ", bid_price=" + this.bid_price + ", ask_price=" + this.ask_price + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ", time_in_force=" + this.time_in_force + ", quote_currency_code=" + this.quote_currency_code + ", order_quantity=" + this.order_quantity + ", order_currency_code=" + this.order_currency_code + ", avg_executed_price=" + this.avg_executed_price + ", total_notional_amount=" + this.total_notional_amount + ", margin_mode=" + this.margin_mode + ", leverage=" + this.leverage + ", take_profit=" + this.take_profit + ", stop_loss=" + this.stop_loss + ", fees=" + this.fees + ", status=" + this.status + ", executed_notional=" + this.executed_notional + ", executed_quantity=" + this.executed_quantity + ", is_liquidation_order=" + this.is_liquidation_order + ", is_close_position_order=" + this.is_close_position_order + ", ref_id=" + this.ref_id + ")";
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerpetualsOrderContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, TimeInForceDto timeInForceDto, String str3, double d5, String str4, double d6, double d7, MarginModeDto marginModeDto, int i2, double d8, double d9, double d10, OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 2) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str2;
            }
            if ((i & 4) == 0) {
                this.order_type = PerpetualsOrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_type = perpetualsOrderTypeDto;
            }
            if ((i & 8) == 0) {
                this.order_side = PerpetualsOrderSideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = perpetualsOrderSideDto;
            }
            if ((i & 16) == 0) {
                this.bid_price = 0.0d;
            } else {
                this.bid_price = d;
            }
            if ((i & 32) == 0) {
                this.ask_price = 0.0d;
            } else {
                this.ask_price = d2;
            }
            if ((i & 64) == 0) {
                this.limit_price = 0.0d;
            } else {
                this.limit_price = d3;
            }
            if ((i & 128) == 0) {
                this.stop_price = 0.0d;
            } else {
                this.stop_price = d4;
            }
            this.time_in_force = (i & 256) == 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
            if ((i & 512) == 0) {
                this.quote_currency_code = "";
            } else {
                this.quote_currency_code = str3;
            }
            if ((i & 1024) == 0) {
                this.order_quantity = 0.0d;
            } else {
                this.order_quantity = d5;
            }
            if ((i & 2048) == 0) {
                this.order_currency_code = "";
            } else {
                this.order_currency_code = str4;
            }
            if ((i & 4096) == 0) {
                this.avg_executed_price = 0.0d;
            } else {
                this.avg_executed_price = d6;
            }
            if ((i & 8192) == 0) {
                this.total_notional_amount = 0.0d;
            } else {
                this.total_notional_amount = d7;
            }
            this.margin_mode = (i & 16384) == 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto;
            if ((32768 & i) == 0) {
                this.leverage = 0;
            } else {
                this.leverage = i2;
            }
            if ((65536 & i) == 0) {
                this.take_profit = 0.0d;
            } else {
                this.take_profit = d8;
            }
            if ((131072 & i) == 0) {
                this.stop_loss = 0.0d;
            } else {
                this.stop_loss = d9;
            }
            if ((262144 & i) == 0) {
                this.fees = 0.0d;
            } else {
                this.fees = d10;
            }
            this.status = (524288 & i) == 0 ? OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto;
            if ((1048576 & i) == 0) {
                this.executed_notional = 0.0d;
            } else {
                this.executed_notional = d11;
            }
            if ((2097152 & i) == 0) {
                this.executed_quantity = 0.0d;
            } else {
                this.executed_quantity = d12;
            }
            if ((4194304 & i) == 0) {
                this.is_liquidation_order = false;
            } else {
                this.is_liquidation_order = z;
            }
            if ((8388608 & i) == 0) {
                this.is_close_position_order = false;
            } else {
                this.is_close_position_order = z2;
            }
            if ((i & 16777216) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.contract_id);
            }
            if (self.order_type != PerpetualsOrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PerpetualsOrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_side != PerpetualsOrderSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, PerpetualsOrderSideDto.Serializer.INSTANCE, self.order_side);
            }
            if (Double.compare(self.bid_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.bid_price));
            }
            if (Double.compare(self.ask_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.ask_price));
            }
            if (Double.compare(self.limit_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.limit_price));
            }
            if (Double.compare(self.stop_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.stop_price));
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (!Intrinsics.areEqual(self.quote_currency_code, "")) {
                output.encodeStringElement(serialDesc, 9, self.quote_currency_code);
            }
            if (Double.compare(self.order_quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 10, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.order_quantity));
            }
            if (!Intrinsics.areEqual(self.order_currency_code, "")) {
                output.encodeStringElement(serialDesc, 11, self.order_currency_code);
            }
            if (Double.compare(self.avg_executed_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 12, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.avg_executed_price));
            }
            if (Double.compare(self.total_notional_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 13, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_notional_amount));
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 14, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            int i = self.leverage;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 15, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Double.compare(self.take_profit, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 16, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.take_profit));
            }
            if (Double.compare(self.stop_loss, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 17, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.stop_loss));
            }
            if (Double.compare(self.fees, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 18, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.fees));
            }
            if (self.status != OrderStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 19, OrderStatusDto.Serializer.INSTANCE, self.status);
            }
            if (Double.compare(self.executed_notional, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 20, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.executed_notional));
            }
            if (Double.compare(self.executed_quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 21, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.executed_quantity));
            }
            boolean z = self.is_liquidation_order;
            if (z) {
                output.encodeBooleanElement(serialDesc, 22, z);
            }
            boolean z2 = self.is_close_position_order;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 23, z2);
            }
            if (Intrinsics.areEqual(self.ref_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 24, self.ref_id);
        }

        public Surrogate(String order_id, String contract_id, PerpetualsOrderTypeDto order_type, PerpetualsOrderSideDto order_side, double d, double d2, double d3, double d4, TimeInForceDto time_in_force, String quote_currency_code, double d5, String order_currency_code, double d6, double d7, MarginModeDto margin_mode, int i, double d8, double d9, double d10, OrderStatusDto status, double d11, double d12, boolean z, boolean z2, String ref_id) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            this.order_id = order_id;
            this.contract_id = contract_id;
            this.order_type = order_type;
            this.order_side = order_side;
            this.bid_price = d;
            this.ask_price = d2;
            this.limit_price = d3;
            this.stop_price = d4;
            this.time_in_force = time_in_force;
            this.quote_currency_code = quote_currency_code;
            this.order_quantity = d5;
            this.order_currency_code = order_currency_code;
            this.avg_executed_price = d6;
            this.total_notional_amount = d7;
            this.margin_mode = margin_mode;
            this.leverage = i;
            this.take_profit = d8;
            this.stop_loss = d9;
            this.fees = d10;
            this.status = status;
            this.executed_notional = d11;
            this.executed_quantity = d12;
            this.is_liquidation_order = z;
            this.is_close_position_order = z2;
            this.ref_id = ref_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, TimeInForceDto timeInForceDto, String str3, double d5, String str4, double d6, double d7, MarginModeDto marginModeDto, int i, double d8, double d9, double d10, OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? PerpetualsOrderTypeDto.INSTANCE.getZeroValue() : perpetualsOrderTypeDto, (i2 & 8) != 0 ? PerpetualsOrderSideDto.INSTANCE.getZeroValue() : perpetualsOrderSideDto, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? 0.0d : d2, (i2 & 64) != 0 ? 0.0d : d3, (i2 & 128) != 0 ? 0.0d : d4, (i2 & 256) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 512) != 0 ? "" : str3, (i2 & 1024) != 0 ? 0.0d : d5, (i2 & 2048) != 0 ? "" : str4, (i2 & 4096) != 0 ? 0.0d : d6, (i2 & 8192) != 0 ? 0.0d : d7, (i2 & 16384) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i2 & 32768) != 0 ? 0 : i, (i2 & 65536) != 0 ? 0.0d : d8, (i2 & 131072) != 0 ? 0.0d : d9, (i2 & 262144) != 0 ? 0.0d : d10, (i2 & 524288) != 0 ? OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto, (i2 & 1048576) != 0 ? 0.0d : d11, (i2 & 2097152) != 0 ? 0.0d : d12, (i2 & 4194304) != 0 ? false : z, (i2 & 8388608) == 0 ? z2 : false, (i2 & 16777216) != 0 ? "" : str5);
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final PerpetualsOrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final PerpetualsOrderSideDto getOrder_side() {
            return this.order_side;
        }

        public final double getBid_price() {
            return this.bid_price;
        }

        public final double getAsk_price() {
            return this.ask_price;
        }

        public final double getLimit_price() {
            return this.limit_price;
        }

        public final double getStop_price() {
            return this.stop_price;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final String getQuote_currency_code() {
            return this.quote_currency_code;
        }

        public final double getOrder_quantity() {
            return this.order_quantity;
        }

        public final String getOrder_currency_code() {
            return this.order_currency_code;
        }

        public final double getAvg_executed_price() {
            return this.avg_executed_price;
        }

        public final double getTotal_notional_amount() {
            return this.total_notional_amount;
        }

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final int getLeverage() {
            return this.leverage;
        }

        public final double getTake_profit() {
            return this.take_profit;
        }

        public final double getStop_loss() {
            return this.stop_loss;
        }

        public final double getFees() {
            return this.fees;
        }

        public final OrderStatusDto getStatus() {
            return this.status;
        }

        public final double getExecuted_notional() {
            return this.executed_notional;
        }

        public final double getExecuted_quantity() {
            return this.executed_quantity;
        }

        public final boolean is_liquidation_order() {
            return this.is_liquidation_order;
        }

        public final boolean is_close_position_order() {
            return this.is_close_position_order;
        }

        public final String getRef_id() {
            return this.ref_id;
        }
    }

    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PerpetualsOrderContextDto, PerpetualsOrderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerpetualsOrderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualsOrderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualsOrderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) PerpetualsOrderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerpetualsOrderContext> getProtoAdapter() {
            return PerpetualsOrderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualsOrderContextDto getZeroValue() {
            return PerpetualsOrderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualsOrderContextDto fromProto(PerpetualsOrderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PerpetualsOrderContextDto(new Surrogate(proto.getOrder_id(), proto.getContract_id(), PerpetualsOrderTypeDto.INSTANCE.fromProto(proto.getOrder_type()), PerpetualsOrderSideDto.INSTANCE.fromProto(proto.getOrder_side()), proto.getBid_price(), proto.getAsk_price(), proto.getLimit_price(), proto.getStop_price(), TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force()), proto.getQuote_currency_code(), proto.getOrder_quantity(), proto.getOrder_currency_code(), proto.getAvg_executed_price(), proto.getTotal_notional_amount(), MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode()), proto.getLeverage(), proto.getTake_profit(), proto.getStop_loss(), proto.getFees(), OrderStatusDto.INSTANCE.fromProto(proto.getStatus()), proto.getExecuted_notional(), proto.getExecuted_quantity(), proto.getIs_liquidation_order(), proto.getIs_close_position_order(), proto.getRef_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerpetualsOrderContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerpetualsOrderContextDto(null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, false, false, null, 33554431, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_TYPE_UNSPECIFIED", "MARKET", "LIMIT", "STOP", "TAKE_PROFIT", "STOP_LOSS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PerpetualsOrderTypeDto implements Dto2<PerpetualsOrderContext.PerpetualsOrderType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerpetualsOrderTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PerpetualsOrderTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PerpetualsOrderTypeDto, PerpetualsOrderContext.PerpetualsOrderType>> binaryBase64Serializer$delegate;
        public static final PerpetualsOrderTypeDto ORDER_TYPE_UNSPECIFIED = new ORDER_TYPE_UNSPECIFIED("ORDER_TYPE_UNSPECIFIED", 0);
        public static final PerpetualsOrderTypeDto MARKET = new MARKET("MARKET", 1);
        public static final PerpetualsOrderTypeDto LIMIT = new LIMIT("LIMIT", 2);
        public static final PerpetualsOrderTypeDto STOP = new STOP("STOP", 3);
        public static final PerpetualsOrderTypeDto TAKE_PROFIT = new TAKE_PROFIT("TAKE_PROFIT", 4);
        public static final PerpetualsOrderTypeDto STOP_LOSS = new STOP_LOSS("STOP_LOSS", 5);

        private static final /* synthetic */ PerpetualsOrderTypeDto[] $values() {
            return new PerpetualsOrderTypeDto[]{ORDER_TYPE_UNSPECIFIED, MARKET, LIMIT, STOP, TAKE_PROFIT, STOP_LOSS};
        }

        public /* synthetic */ PerpetualsOrderTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PerpetualsOrderTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PerpetualsOrderTypeDto(String str, int i) {
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderTypeDto.ORDER_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_TYPE_UNSPECIFIED extends PerpetualsOrderTypeDto {
            ORDER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderType toProto() {
                return PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED;
            }
        }

        static {
            PerpetualsOrderTypeDto[] perpetualsOrderTypeDtoArr$values = $values();
            $VALUES = perpetualsOrderTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(perpetualsOrderTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto$PerpetualsOrderTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualsOrderContextDto.PerpetualsOrderTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderTypeDto.MARKET", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET extends PerpetualsOrderTypeDto {
            MARKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderType toProto() {
                return PerpetualsOrderContext.PerpetualsOrderType.MARKET;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderTypeDto.LIMIT", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIMIT extends PerpetualsOrderTypeDto {
            LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderType toProto() {
                return PerpetualsOrderContext.PerpetualsOrderType.LIMIT;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderTypeDto.STOP", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOP extends PerpetualsOrderTypeDto {
            STOP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderType toProto() {
                return PerpetualsOrderContext.PerpetualsOrderType.STOP;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderTypeDto.TAKE_PROFIT", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TAKE_PROFIT extends PerpetualsOrderTypeDto {
            TAKE_PROFIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderType toProto() {
                return PerpetualsOrderContext.PerpetualsOrderType.TAKE_PROFIT;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderTypeDto.STOP_LOSS", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOP_LOSS extends PerpetualsOrderTypeDto {
            STOP_LOSS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderType toProto() {
                return PerpetualsOrderContext.PerpetualsOrderType.STOP_LOSS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PerpetualsOrderTypeDto, PerpetualsOrderContext.PerpetualsOrderType> {

            /* compiled from: PerpetualsOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualsOrderContext.PerpetualsOrderType.values().length];
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderType.MARKET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderType.LIMIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderType.STOP.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderType.TAKE_PROFIT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderType.STOP_LOSS.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PerpetualsOrderTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PerpetualsOrderTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PerpetualsOrderTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) PerpetualsOrderTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualsOrderContext.PerpetualsOrderType> getProtoAdapter() {
                return PerpetualsOrderContext.PerpetualsOrderType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PerpetualsOrderTypeDto getZeroValue() {
                return PerpetualsOrderTypeDto.ORDER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PerpetualsOrderTypeDto fromProto(PerpetualsOrderContext.PerpetualsOrderType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return PerpetualsOrderTypeDto.ORDER_TYPE_UNSPECIFIED;
                    case 2:
                        return PerpetualsOrderTypeDto.MARKET;
                    case 3:
                        return PerpetualsOrderTypeDto.LIMIT;
                    case 4:
                        return PerpetualsOrderTypeDto.STOP;
                    case 5:
                        return PerpetualsOrderTypeDto.TAKE_PROFIT;
                    case 6:
                        return PerpetualsOrderTypeDto.STOP_LOSS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<PerpetualsOrderTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PerpetualsOrderTypeDto, PerpetualsOrderContext.PerpetualsOrderType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualsOrderContext.PerpetualsOrderType", PerpetualsOrderTypeDto.getEntries(), PerpetualsOrderTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PerpetualsOrderTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PerpetualsOrderTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PerpetualsOrderTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PerpetualsOrderTypeDto valueOf(String str) {
            return (PerpetualsOrderTypeDto) Enum.valueOf(PerpetualsOrderTypeDto.class, str);
        }

        public static PerpetualsOrderTypeDto[] values() {
            return (PerpetualsOrderTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_SIDE_UNSPECIFIED", "LONG", "SHORT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PerpetualsOrderSideDto implements Dto2<PerpetualsOrderContext.PerpetualsOrderSide>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerpetualsOrderSideDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PerpetualsOrderSideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PerpetualsOrderSideDto, PerpetualsOrderContext.PerpetualsOrderSide>> binaryBase64Serializer$delegate;
        public static final PerpetualsOrderSideDto ORDER_SIDE_UNSPECIFIED = new ORDER_SIDE_UNSPECIFIED("ORDER_SIDE_UNSPECIFIED", 0);
        public static final PerpetualsOrderSideDto LONG = new LONG("LONG", 1);
        public static final PerpetualsOrderSideDto SHORT = new SHORT("SHORT", 2);

        private static final /* synthetic */ PerpetualsOrderSideDto[] $values() {
            return new PerpetualsOrderSideDto[]{ORDER_SIDE_UNSPECIFIED, LONG, SHORT};
        }

        public /* synthetic */ PerpetualsOrderSideDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PerpetualsOrderSideDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PerpetualsOrderSideDto(String str, int i) {
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderSideDto.ORDER_SIDE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_SIDE_UNSPECIFIED extends PerpetualsOrderSideDto {
            ORDER_SIDE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderSide toProto() {
                return PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED;
            }
        }

        static {
            PerpetualsOrderSideDto[] perpetualsOrderSideDtoArr$values = $values();
            $VALUES = perpetualsOrderSideDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(perpetualsOrderSideDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto$PerpetualsOrderSideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualsOrderContextDto.PerpetualsOrderSideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderSideDto.LONG", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LONG extends PerpetualsOrderSideDto {
            LONG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderSide toProto() {
                return PerpetualsOrderContext.PerpetualsOrderSide.LONG;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.PerpetualsOrderSideDto.SHORT", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHORT extends PerpetualsOrderSideDto {
            SHORT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.PerpetualsOrderSide toProto() {
                return PerpetualsOrderContext.PerpetualsOrderSide.SHORT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PerpetualsOrderSideDto, PerpetualsOrderContext.PerpetualsOrderSide> {

            /* compiled from: PerpetualsOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualsOrderContext.PerpetualsOrderSide.values().length];
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderSide.LONG.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.PerpetualsOrderSide.SHORT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PerpetualsOrderSideDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PerpetualsOrderSideDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PerpetualsOrderSideDto> getBinaryBase64Serializer() {
                return (KSerializer) PerpetualsOrderSideDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualsOrderContext.PerpetualsOrderSide> getProtoAdapter() {
                return PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PerpetualsOrderSideDto getZeroValue() {
                return PerpetualsOrderSideDto.ORDER_SIDE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PerpetualsOrderSideDto fromProto(PerpetualsOrderContext.PerpetualsOrderSide proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return PerpetualsOrderSideDto.ORDER_SIDE_UNSPECIFIED;
                }
                if (i == 2) {
                    return PerpetualsOrderSideDto.LONG;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return PerpetualsOrderSideDto.SHORT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<PerpetualsOrderSideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PerpetualsOrderSideDto, PerpetualsOrderContext.PerpetualsOrderSide> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualsOrderContext.PerpetualsOrderSide", PerpetualsOrderSideDto.getEntries(), PerpetualsOrderSideDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PerpetualsOrderSideDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PerpetualsOrderSideDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PerpetualsOrderSideDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PerpetualsOrderSideDto valueOf(String str) {
            return (PerpetualsOrderSideDto) Enum.valueOf(PerpetualsOrderSideDto.class, str);
        }

        public static PerpetualsOrderSideDto[] values() {
            return (PerpetualsOrderSideDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TIME_IN_FORCE_UNSPECIFIED", "GTC", "IOC", "FOK", "DAY", "GFD", "GFW", "GFM", "OPG", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TimeInForceDto implements Dto2<PerpetualsOrderContext.TimeInForce>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TimeInForceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TimeInForceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TimeInForceDto, PerpetualsOrderContext.TimeInForce>> binaryBase64Serializer$delegate;
        public static final TimeInForceDto TIME_IN_FORCE_UNSPECIFIED = new TIME_IN_FORCE_UNSPECIFIED("TIME_IN_FORCE_UNSPECIFIED", 0);
        public static final TimeInForceDto GTC = new GTC("GTC", 1);
        public static final TimeInForceDto IOC = new IOC("IOC", 2);
        public static final TimeInForceDto FOK = new FOK("FOK", 3);
        public static final TimeInForceDto DAY = new DAY("DAY", 4);
        public static final TimeInForceDto GFD = new GFD("GFD", 5);
        public static final TimeInForceDto GFW = new GFW("GFW", 6);
        public static final TimeInForceDto GFM = new GFM("GFM", 7);
        public static final TimeInForceDto OPG = new OPG("OPG", 8);

        private static final /* synthetic */ TimeInForceDto[] $values() {
            return new TimeInForceDto[]{TIME_IN_FORCE_UNSPECIFIED, GTC, IOC, FOK, DAY, GFD, GFW, GFM, OPG};
        }

        public /* synthetic */ TimeInForceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TimeInForceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TIME_IN_FORCE_UNSPECIFIED extends TimeInForceDto {
            TIME_IN_FORCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
            }
        }

        private TimeInForceDto(String str, int i) {
        }

        static {
            TimeInForceDto[] timeInForceDtoArr$values = $values();
            $VALUES = timeInForceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(timeInForceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto$TimeInForceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualsOrderContextDto.TimeInForceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.GTC", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GTC extends TimeInForceDto {
            GTC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.GTC;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.IOC", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IOC extends TimeInForceDto {
            IOC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.IOC;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.FOK", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FOK extends TimeInForceDto {
            FOK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.FOK;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.DAY", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY extends TimeInForceDto {
            DAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.DAY;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.GFD", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GFD extends TimeInForceDto {
            GFD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.GFD;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.GFW", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GFW extends TimeInForceDto {
            GFW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.GFW;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.GFM", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GFM extends TimeInForceDto {
            GFM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.GFM;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.TimeInForceDto.OPG", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPG extends TimeInForceDto {
            OPG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.TimeInForce toProto() {
                return PerpetualsOrderContext.TimeInForce.OPG;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TimeInForceDto, PerpetualsOrderContext.TimeInForce> {

            /* compiled from: PerpetualsOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualsOrderContext.TimeInForce.values().length];
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.GTC.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.IOC.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.FOK.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.DAY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.GFD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.GFW.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.GFM.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.TimeInForce.OPG.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TimeInForceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TimeInForceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TimeInForceDto> getBinaryBase64Serializer() {
                return (KSerializer) TimeInForceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualsOrderContext.TimeInForce> getProtoAdapter() {
                return PerpetualsOrderContext.TimeInForce.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TimeInForceDto getZeroValue() {
                return TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TimeInForceDto fromProto(PerpetualsOrderContext.TimeInForce proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED;
                    case 2:
                        return TimeInForceDto.GTC;
                    case 3:
                        return TimeInForceDto.IOC;
                    case 4:
                        return TimeInForceDto.FOK;
                    case 5:
                        return TimeInForceDto.DAY;
                    case 6:
                        return TimeInForceDto.GFD;
                    case 7:
                        return TimeInForceDto.GFW;
                    case 8:
                        return TimeInForceDto.GFM;
                    case 9:
                        return TimeInForceDto.OPG;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TimeInForceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TimeInForceDto, PerpetualsOrderContext.TimeInForce> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualsOrderContext.TimeInForce", TimeInForceDto.getEntries(), TimeInForceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TimeInForceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TimeInForceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TimeInForceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TimeInForceDto valueOf(String str) {
            return (TimeInForceDto) Enum.valueOf(TimeInForceDto.class, str);
        }

        public static TimeInForceDto[] values() {
            return (TimeInForceDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MARGIN_MODE_UNSPECIFIED", "ISOLATED", "CROSS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MarginModeDto implements Dto2<PerpetualsOrderContext.MarginMode>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarginModeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MarginModeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MarginModeDto, PerpetualsOrderContext.MarginMode>> binaryBase64Serializer$delegate;
        public static final MarginModeDto MARGIN_MODE_UNSPECIFIED = new MARGIN_MODE_UNSPECIFIED("MARGIN_MODE_UNSPECIFIED", 0);
        public static final MarginModeDto ISOLATED = new ISOLATED("ISOLATED", 1);
        public static final MarginModeDto CROSS = new CROSS("CROSS", 2);

        private static final /* synthetic */ MarginModeDto[] $values() {
            return new MarginModeDto[]{MARGIN_MODE_UNSPECIFIED, ISOLATED, CROSS};
        }

        public /* synthetic */ MarginModeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<MarginModeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.MarginModeDto.MARGIN_MODE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARGIN_MODE_UNSPECIFIED extends MarginModeDto {
            MARGIN_MODE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.MarginMode toProto() {
                return PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED;
            }
        }

        private MarginModeDto(String str, int i) {
        }

        static {
            MarginModeDto[] marginModeDtoArr$values = $values();
            $VALUES = marginModeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marginModeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto$MarginModeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualsOrderContextDto.MarginModeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.MarginModeDto.ISOLATED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ISOLATED extends MarginModeDto {
            ISOLATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.MarginMode toProto() {
                return PerpetualsOrderContext.MarginMode.ISOLATED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.MarginModeDto.CROSS", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CROSS extends MarginModeDto {
            CROSS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.MarginMode toProto() {
                return PerpetualsOrderContext.MarginMode.CROSS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MarginModeDto, PerpetualsOrderContext.MarginMode> {

            /* compiled from: PerpetualsOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualsOrderContext.MarginMode.values().length];
                    try {
                        iArr[PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.MarginMode.ISOLATED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.MarginMode.CROSS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MarginModeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginModeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginModeDto> getBinaryBase64Serializer() {
                return (KSerializer) MarginModeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualsOrderContext.MarginMode> getProtoAdapter() {
                return PerpetualsOrderContext.MarginMode.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginModeDto getZeroValue() {
                return MarginModeDto.MARGIN_MODE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginModeDto fromProto(PerpetualsOrderContext.MarginMode proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return MarginModeDto.MARGIN_MODE_UNSPECIFIED;
                }
                if (i == 2) {
                    return MarginModeDto.ISOLATED;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return MarginModeDto.CROSS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<MarginModeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MarginModeDto, PerpetualsOrderContext.MarginMode> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualsOrderContext.MarginMode", MarginModeDto.getEntries(), MarginModeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public MarginModeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (MarginModeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MarginModeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static MarginModeDto valueOf(String str) {
            return (MarginModeDto) Enum.valueOf(MarginModeDto.class, str);
        }

        public static MarginModeDto[] values() {
            return (MarginModeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_STATUS_UNSPECIFIED", "CANCELED", "CONFIRMED", "FAILED", "FILLED", "NEW", "PARTIALLY_FILLED", "REJECTED", "UNCONFIRMED", "VOIDED", "EXPIRED", "PENDING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderStatusDto implements Dto2<PerpetualsOrderContext.OrderStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderStatusDto, PerpetualsOrderContext.OrderStatus>> binaryBase64Serializer$delegate;
        public static final OrderStatusDto ORDER_STATUS_UNSPECIFIED = new ORDER_STATUS_UNSPECIFIED("ORDER_STATUS_UNSPECIFIED", 0);
        public static final OrderStatusDto CANCELED = new CANCELED("CANCELED", 1);
        public static final OrderStatusDto CONFIRMED = new CONFIRMED("CONFIRMED", 2);
        public static final OrderStatusDto FAILED = new FAILED("FAILED", 3);
        public static final OrderStatusDto FILLED = new FILLED("FILLED", 4);
        public static final OrderStatusDto NEW = new NEW("NEW", 5);
        public static final OrderStatusDto PARTIALLY_FILLED = new PARTIALLY_FILLED("PARTIALLY_FILLED", 6);
        public static final OrderStatusDto REJECTED = new REJECTED("REJECTED", 7);
        public static final OrderStatusDto UNCONFIRMED = new UNCONFIRMED("UNCONFIRMED", 8);
        public static final OrderStatusDto VOIDED = new VOIDED("VOIDED", 9);
        public static final OrderStatusDto EXPIRED = new EXPIRED("EXPIRED", 10);
        public static final OrderStatusDto PENDING = new PENDING("PENDING", 11);

        private static final /* synthetic */ OrderStatusDto[] $values() {
            return new OrderStatusDto[]{ORDER_STATUS_UNSPECIFIED, CANCELED, CONFIRMED, FAILED, FILLED, NEW, PARTIALLY_FILLED, REJECTED, UNCONFIRMED, VOIDED, EXPIRED, PENDING};
        }

        public /* synthetic */ OrderStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.ORDER_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_STATUS_UNSPECIFIED extends OrderStatusDto {
            ORDER_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED;
            }
        }

        private OrderStatusDto(String str, int i) {
        }

        static {
            OrderStatusDto[] orderStatusDtoArr$values = $values();
            $VALUES = orderStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto$OrderStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerpetualsOrderContextDto.OrderStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.CANCELED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED extends OrderStatusDto {
            CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.CANCELED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.CONFIRMED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONFIRMED extends OrderStatusDto {
            CONFIRMED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.CONFIRMED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends OrderStatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.FAILED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.FILLED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FILLED extends OrderStatusDto {
            FILLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.FILLED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.NEW", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW extends OrderStatusDto {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.NEW;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.PARTIALLY_FILLED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PARTIALLY_FILLED extends OrderStatusDto {
            PARTIALLY_FILLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.PARTIALLY_FILLED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.REJECTED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REJECTED extends OrderStatusDto {
            REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.REJECTED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.UNCONFIRMED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNCONFIRMED extends OrderStatusDto {
            UNCONFIRMED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.UNCONFIRMED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.VOIDED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VOIDED extends OrderStatusDto {
            VOIDED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.VOIDED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.EXPIRED", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPIRED extends OrderStatusDto {
            EXPIRED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.EXPIRED;
            }
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto.OrderStatusDto.PENDING", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING extends OrderStatusDto {
            PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PerpetualsOrderContext.OrderStatus toProto() {
                return PerpetualsOrderContext.OrderStatus.PENDING;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderStatusDto, PerpetualsOrderContext.OrderStatus> {

            /* compiled from: PerpetualsOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PerpetualsOrderContext.OrderStatus.values().length];
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.CANCELED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.CONFIRMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.FAILED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.FILLED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.NEW.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.PARTIALLY_FILLED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.REJECTED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.UNCONFIRMED.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.VOIDED.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.EXPIRED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[PerpetualsOrderContext.OrderStatus.PENDING.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PerpetualsOrderContext.OrderStatus> getProtoAdapter() {
                return PerpetualsOrderContext.OrderStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderStatusDto getZeroValue() {
                return OrderStatusDto.ORDER_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderStatusDto fromProto(PerpetualsOrderContext.OrderStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return OrderStatusDto.ORDER_STATUS_UNSPECIFIED;
                    case 2:
                        return OrderStatusDto.CANCELED;
                    case 3:
                        return OrderStatusDto.CONFIRMED;
                    case 4:
                        return OrderStatusDto.FAILED;
                    case 5:
                        return OrderStatusDto.FILLED;
                    case 6:
                        return OrderStatusDto.NEW;
                    case 7:
                        return OrderStatusDto.PARTIALLY_FILLED;
                    case 8:
                        return OrderStatusDto.REJECTED;
                    case 9:
                        return OrderStatusDto.UNCONFIRMED;
                    case 10:
                        return OrderStatusDto.VOIDED;
                    case 11:
                        return OrderStatusDto.EXPIRED;
                    case 12:
                        return OrderStatusDto.PENDING;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PerpetualsOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderStatusDto, PerpetualsOrderContext.OrderStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PerpetualsOrderContext.OrderStatus", OrderStatusDto.getEntries(), OrderStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderStatusDto valueOf(String str) {
            return (OrderStatusDto) Enum.valueOf(OrderStatusDto.class, str);
        }

        public static OrderStatusDto[] values() {
            return (OrderStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PerpetualsOrderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerpetualsOrderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerpetualsOrderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerpetualsOrderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerpetualsOrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerpetualsOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto";
        }
    }
}
