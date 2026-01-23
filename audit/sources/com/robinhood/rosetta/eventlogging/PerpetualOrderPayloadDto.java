package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContext;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: PerpetualOrderPayloadDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004Z[\\]B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020\u0011\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\u0011\u0012\b\b\u0002\u0010&\u001a\u00020\u0011\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010*\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010+J\u008a\u0002\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\tJ\b\u0010N\u001a\u00020\u0002H\u0016J\b\u0010O\u001a\u00020\tH\u0016J\u0013\u0010P\u001a\u00020(2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0096\u0002J\b\u0010S\u001a\u00020\u001fH\u0016J\u0018\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u001fH\u0016J\b\u0010Y\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b6\u00105R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b7\u00105R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b8\u00105R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010-R\u0011\u0010\u0018\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b<\u00105R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b=\u0010-R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b>\u00105R\u0011\u0010\u001b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b?\u00105R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010 \u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bD\u00105R\u0011\u0010!\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bE\u00105R\u0011\u0010\"\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bF\u00105R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010%\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bI\u00105R\u0011\u0010&\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bJ\u00105R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b'\u0010KR\u0011\u0010)\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010KR\u0011\u0010*\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bL\u0010-¨\u0006^"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayload;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Surrogate;)V", "ref_id", "", "account_id", "contract_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", BidAskDetails3.BID_PRICE, "", BidAskDetails3.ASK_PRICE, "limit_price", "stop_price", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "quote_currency_code", "order_quantity", "order_currency_code", "avg_executed_price", "total_notional_amount", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "leverage", "", "take_profit", "stop_loss", "fees", "status", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "executed_notional", "executed_quantity", "is_liquidation_order", "", "is_close_position_order", "masked_ref_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;DDZZLjava/lang/String;)V", "getRef_id", "()Ljava/lang/String;", "getAccount_id", "getContract_id", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "getBid_price", "()D", "getAsk_price", "getLimit_price", "getStop_price", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "getQuote_currency_code", "getOrder_quantity", "getOrder_currency_code", "getAvg_executed_price", "getTotal_notional_amount", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "getLeverage", "()I", "getTake_profit", "getStop_loss", "getFees", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "getExecuted_notional", "getExecuted_quantity", "()Z", "getMasked_ref_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class PerpetualOrderPayloadDto implements Dto3<PerpetualOrderPayload>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerpetualOrderPayloadDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerpetualOrderPayloadDto, PerpetualOrderPayload>> binaryBase64Serializer$delegate;
    private static final PerpetualOrderPayloadDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerpetualOrderPayloadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerpetualOrderPayloadDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final PerpetualsOrderContextDto.PerpetualsOrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final PerpetualsOrderContextDto.PerpetualsOrderSideDto getOrder_side() {
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

    public final PerpetualsOrderContextDto.TimeInForceDto getTime_in_force() {
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

    public final PerpetualsOrderContextDto.MarginModeDto getMargin_mode() {
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

    public final PerpetualsOrderContextDto.OrderStatusDto getStatus() {
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

    public final String getMasked_ref_id() {
        return this.surrogate.getMasked_ref_id();
    }

    public /* synthetic */ PerpetualOrderPayloadDto(String str, String str2, String str3, PerpetualsOrderContextDto.PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderContextDto.PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, PerpetualsOrderContextDto.TimeInForceDto timeInForceDto, String str4, double d5, String str5, double d6, double d7, PerpetualsOrderContextDto.MarginModeDto marginModeDto, int i, double d8, double d9, double d10, PerpetualsOrderContextDto.OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? PerpetualsOrderContextDto.PerpetualsOrderTypeDto.INSTANCE.getZeroValue() : perpetualsOrderTypeDto, (i2 & 16) != 0 ? PerpetualsOrderContextDto.PerpetualsOrderSideDto.INSTANCE.getZeroValue() : perpetualsOrderSideDto, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? 0.0d : d2, (i2 & 128) != 0 ? 0.0d : d3, (i2 & 256) != 0 ? 0.0d : d4, (i2 & 512) != 0 ? PerpetualsOrderContextDto.TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 1024) != 0 ? "" : str4, (i2 & 2048) != 0 ? 0.0d : d5, (i2 & 4096) != 0 ? "" : str5, (i2 & 8192) != 0 ? 0.0d : d6, (i2 & 16384) != 0 ? 0.0d : d7, (32768 & i2) != 0 ? PerpetualsOrderContextDto.MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i2 & 65536) != 0 ? 0 : i, (i2 & 131072) != 0 ? 0.0d : d8, (i2 & 262144) != 0 ? 0.0d : d9, (i2 & 524288) != 0 ? 0.0d : d10, (i2 & 1048576) != 0 ? PerpetualsOrderContextDto.OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto, (i2 & 2097152) != 0 ? 0.0d : d11, (i2 & 4194304) != 0 ? 0.0d : d12, (i2 & 8388608) != 0 ? false : z, (i2 & 16777216) == 0 ? z2 : false, (i2 & 33554432) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerpetualOrderPayloadDto(String ref_id, String account_id, String contract_id, PerpetualsOrderContextDto.PerpetualsOrderTypeDto order_type, PerpetualsOrderContextDto.PerpetualsOrderSideDto order_side, double d, double d2, double d3, double d4, PerpetualsOrderContextDto.TimeInForceDto time_in_force, String quote_currency_code, double d5, String order_currency_code, double d6, double d7, PerpetualsOrderContextDto.MarginModeDto margin_mode, int i, double d8, double d9, double d10, PerpetualsOrderContextDto.OrderStatusDto status, double d11, double d12, boolean z, boolean z2, String masked_ref_id) {
        this(new Surrogate(ref_id, account_id, contract_id, order_type, order_side, d, d2, d3, d4, time_in_force, quote_currency_code, d5, order_currency_code, d6, d7, margin_mode, i, d8, d9, d10, status, d11, d12, z, z2, masked_ref_id));
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
    }

    public static /* synthetic */ PerpetualOrderPayloadDto copy$default(PerpetualOrderPayloadDto perpetualOrderPayloadDto, String str, String str2, String str3, PerpetualsOrderContextDto.PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderContextDto.PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, PerpetualsOrderContextDto.TimeInForceDto timeInForceDto, String str4, double d5, String str5, double d6, double d7, PerpetualsOrderContextDto.MarginModeDto marginModeDto, int i, double d8, double d9, double d10, PerpetualsOrderContextDto.OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str6, int i2, Object obj) {
        String masked_ref_id;
        boolean z3;
        String ref_id = (i2 & 1) != 0 ? perpetualOrderPayloadDto.surrogate.getRef_id() : str;
        String account_id = (i2 & 2) != 0 ? perpetualOrderPayloadDto.surrogate.getAccount_id() : str2;
        String contract_id = (i2 & 4) != 0 ? perpetualOrderPayloadDto.surrogate.getContract_id() : str3;
        PerpetualsOrderContextDto.PerpetualsOrderTypeDto order_type = (i2 & 8) != 0 ? perpetualOrderPayloadDto.surrogate.getOrder_type() : perpetualsOrderTypeDto;
        PerpetualsOrderContextDto.PerpetualsOrderSideDto order_side = (i2 & 16) != 0 ? perpetualOrderPayloadDto.surrogate.getOrder_side() : perpetualsOrderSideDto;
        double bid_price = (i2 & 32) != 0 ? perpetualOrderPayloadDto.surrogate.getBid_price() : d;
        double ask_price = (i2 & 64) != 0 ? perpetualOrderPayloadDto.surrogate.getAsk_price() : d2;
        double limit_price = (i2 & 128) != 0 ? perpetualOrderPayloadDto.surrogate.getLimit_price() : d3;
        double stop_price = (i2 & 256) != 0 ? perpetualOrderPayloadDto.surrogate.getStop_price() : d4;
        PerpetualsOrderContextDto.TimeInForceDto time_in_force = (i2 & 512) != 0 ? perpetualOrderPayloadDto.surrogate.getTime_in_force() : timeInForceDto;
        String str7 = ref_id;
        String quote_currency_code = (i2 & 1024) != 0 ? perpetualOrderPayloadDto.surrogate.getQuote_currency_code() : str4;
        double order_quantity = (i2 & 2048) != 0 ? perpetualOrderPayloadDto.surrogate.getOrder_quantity() : d5;
        String order_currency_code = (i2 & 4096) != 0 ? perpetualOrderPayloadDto.surrogate.getOrder_currency_code() : str5;
        double avg_executed_price = (i2 & 8192) != 0 ? perpetualOrderPayloadDto.surrogate.getAvg_executed_price() : d6;
        double total_notional_amount = (i2 & 16384) != 0 ? perpetualOrderPayloadDto.surrogate.getTotal_notional_amount() : d7;
        PerpetualsOrderContextDto.MarginModeDto margin_mode = (32768 & i2) != 0 ? perpetualOrderPayloadDto.surrogate.getMargin_mode() : marginModeDto;
        int leverage = (i2 & 65536) != 0 ? perpetualOrderPayloadDto.surrogate.getLeverage() : i;
        double take_profit = (i2 & 131072) != 0 ? perpetualOrderPayloadDto.surrogate.getTake_profit() : d8;
        double stop_loss = (i2 & 262144) != 0 ? perpetualOrderPayloadDto.surrogate.getStop_loss() : d9;
        double fees = (i2 & 524288) != 0 ? perpetualOrderPayloadDto.surrogate.getFees() : d10;
        PerpetualsOrderContextDto.OrderStatusDto status = (i2 & 1048576) != 0 ? perpetualOrderPayloadDto.surrogate.getStatus() : orderStatusDto;
        double executed_notional = (i2 & 2097152) != 0 ? perpetualOrderPayloadDto.surrogate.getExecuted_notional() : d11;
        double executed_quantity = (i2 & 4194304) != 0 ? perpetualOrderPayloadDto.surrogate.getExecuted_quantity() : d12;
        boolean zIs_liquidation_order = (i2 & 8388608) != 0 ? perpetualOrderPayloadDto.surrogate.is_liquidation_order() : z;
        boolean zIs_close_position_order = (i2 & 16777216) != 0 ? perpetualOrderPayloadDto.surrogate.is_close_position_order() : z2;
        if ((i2 & 33554432) != 0) {
            z3 = zIs_close_position_order;
            masked_ref_id = perpetualOrderPayloadDto.surrogate.getMasked_ref_id();
        } else {
            masked_ref_id = str6;
            z3 = zIs_close_position_order;
        }
        return perpetualOrderPayloadDto.copy(str7, account_id, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, zIs_liquidation_order, z3, masked_ref_id);
    }

    public final PerpetualOrderPayloadDto copy(String ref_id, String account_id, String contract_id, PerpetualsOrderContextDto.PerpetualsOrderTypeDto order_type, PerpetualsOrderContextDto.PerpetualsOrderSideDto order_side, double bid_price, double ask_price, double limit_price, double stop_price, PerpetualsOrderContextDto.TimeInForceDto time_in_force, String quote_currency_code, double order_quantity, String order_currency_code, double avg_executed_price, double total_notional_amount, PerpetualsOrderContextDto.MarginModeDto margin_mode, int leverage, double take_profit, double stop_loss, double fees, PerpetualsOrderContextDto.OrderStatusDto status, double executed_notional, double executed_quantity, boolean is_liquidation_order, boolean is_close_position_order, String masked_ref_id) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
        return new PerpetualOrderPayloadDto(new Surrogate(ref_id, account_id, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, is_liquidation_order, is_close_position_order, masked_ref_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PerpetualOrderPayload toProto() {
        return new PerpetualOrderPayload(this.surrogate.getRef_id(), this.surrogate.getAccount_id(), this.surrogate.getContract_id(), (PerpetualsOrderContext.PerpetualsOrderType) this.surrogate.getOrder_type().toProto(), (PerpetualsOrderContext.PerpetualsOrderSide) this.surrogate.getOrder_side().toProto(), this.surrogate.getBid_price(), this.surrogate.getAsk_price(), this.surrogate.getLimit_price(), this.surrogate.getStop_price(), (PerpetualsOrderContext.TimeInForce) this.surrogate.getTime_in_force().toProto(), this.surrogate.getQuote_currency_code(), this.surrogate.getOrder_quantity(), this.surrogate.getOrder_currency_code(), this.surrogate.getAvg_executed_price(), this.surrogate.getTotal_notional_amount(), (PerpetualsOrderContext.MarginMode) this.surrogate.getMargin_mode().toProto(), this.surrogate.getLeverage(), this.surrogate.getTake_profit(), this.surrogate.getStop_loss(), this.surrogate.getFees(), (PerpetualsOrderContext.OrderStatus) this.surrogate.getStatus().toProto(), this.surrogate.getExecuted_notional(), this.surrogate.getExecuted_quantity(), this.surrogate.is_liquidation_order(), this.surrogate.is_close_position_order(), this.surrogate.getMasked_ref_id(), null, 67108864, null);
    }

    public String toString() {
        return "[PerpetualOrderPayloadDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerpetualOrderPayloadDto) && Intrinsics.areEqual(((PerpetualOrderPayloadDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerpetualOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u0093\u00012\u00020\u0001:\u0004\u0092\u0001\u0093\u0001BÎ\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\u001c¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u001d\u0012\u0017\b\u0002\u0010\u001e\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u001f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010 \u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\u0017\b\u0002\u0010#\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010$\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*B\u0081\u0002\b\u0010\u0012\u0006\u0010+\u001a\u00020\u001c\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010-¢\u0006\u0004\b)\u0010.J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0007HÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\u0018\u0010p\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u0010q\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u0010r\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u0010s\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\t\u0010t\u001a\u00020\u0013HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\u0018\u0010v\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\u0018\u0010x\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u0010y\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\t\u0010z\u001a\u00020\u001aHÆ\u0003J\u0018\u0010{\u001a\u00110\u001c¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u001dHÆ\u0003J\u0018\u0010|\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u0010}\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u0010~\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\t\u0010\u007f\u001a\u00020\"HÆ\u0003J\u0019\u0010\u0080\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u0081\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020&HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020&HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003JÑ\u0003\u0010\u0085\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0011\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u0017\b\u0002\u0010\u0015\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0017\b\u0002\u0010\u0017\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0018\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0017\b\u0002\u0010\u001b\u001a\u00110\u001c¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u001d2\u0017\b\u0002\u0010\u001e\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u001f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010 \u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010!\u001a\u00020\"2\u0017\b\u0002\u0010#\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010$\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u0003HÆ\u0001J\u0015\u0010\u0086\u0001\u001a\u00020&2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u001cHÖ\u0001J\n\u0010\u0089\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010\u008a\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u00002\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001H\u0001¢\u0006\u0003\b\u0091\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u00100\u001a\u0004\b6\u00102R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u00100\u001a\u0004\b8\u00109R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u00100\u001a\u0004\b;\u0010<R+\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u00100\u001a\u0004\b>\u0010?R+\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u00100\u001a\u0004\bA\u0010?R+\u0010\u0010\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00100\u001a\u0004\bC\u0010?R+\u0010\u0011\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u00100\u001a\u0004\bE\u0010?R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u00100\u001a\u0004\bG\u0010HR\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u00100\u001a\u0004\bJ\u00102R+\u0010\u0015\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u00100\u001a\u0004\bL\u0010?R\u001c\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u00100\u001a\u0004\bN\u00102R+\u0010\u0017\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u00100\u001a\u0004\bP\u0010?R+\u0010\u0018\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u00100\u001a\u0004\bR\u0010?R\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u00100\u001a\u0004\bT\u0010UR+\u0010\u001b\u001a\u00110\u001c¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u00100\u001a\u0004\bW\u0010XR+\u0010\u001e\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u00100\u001a\u0004\bZ\u0010?R+\u0010\u001f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u00100\u001a\u0004\b\\\u0010?R+\u0010 \u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u00100\u001a\u0004\b^\u0010?R\u001c\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u00100\u001a\u0004\b`\u0010aR+\u0010#\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u00100\u001a\u0004\bc\u0010?R+\u0010$\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bd\u00100\u001a\u0004\be\u0010?R\u001c\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u00100\u001a\u0004\b%\u0010gR\u001c\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u00100\u001a\u0004\b'\u0010gR\u001c\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u00100\u001a\u0004\bj\u00102¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Surrogate;", "", "ref_id", "", "account_id", "contract_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", BidAskDetails3.BID_PRICE, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", BidAskDetails3.ASK_PRICE, "limit_price", "stop_price", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "quote_currency_code", "order_quantity", "order_currency_code", "avg_executed_price", "total_notional_amount", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "leverage", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "take_profit", "stop_loss", "fees", "status", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "executed_notional", "executed_quantity", "is_liquidation_order", "", "is_close_position_order", "masked_ref_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;DDZZLjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;DDZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRef_id$annotations", "()V", "getRef_id", "()Ljava/lang/String;", "getAccount_id$annotations", "getAccount_id", "getContract_id$annotations", "getContract_id", "getOrder_type$annotations", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderTypeDto;", "getOrder_side$annotations", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$PerpetualsOrderSideDto;", "getBid_price$annotations", "getBid_price", "()D", "getAsk_price$annotations", "getAsk_price", "getLimit_price$annotations", "getLimit_price", "getStop_price$annotations", "getStop_price", "getTime_in_force$annotations", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$TimeInForceDto;", "getQuote_currency_code$annotations", "getQuote_currency_code", "getOrder_quantity$annotations", "getOrder_quantity", "getOrder_currency_code$annotations", "getOrder_currency_code", "getAvg_executed_price$annotations", "getAvg_executed_price", "getTotal_notional_amount$annotations", "getTotal_notional_amount", "getMargin_mode$annotations", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$MarginModeDto;", "getLeverage$annotations", "getLeverage", "()I", "getTake_profit$annotations", "getTake_profit", "getStop_loss$annotations", "getStop_loss", "getFees$annotations", "getFees", "getStatus$annotations", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContextDto$OrderStatusDto;", "getExecuted_notional$annotations", "getExecuted_notional", "getExecuted_quantity$annotations", "getExecuted_quantity", "is_liquidation_order$annotations", "()Z", "is_close_position_order$annotations", "getMasked_ref_id$annotations", "getMasked_ref_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
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
        private final PerpetualsOrderContextDto.MarginModeDto margin_mode;
        private final String masked_ref_id;
        private final String order_currency_code;
        private final double order_quantity;
        private final PerpetualsOrderContextDto.PerpetualsOrderSideDto order_side;
        private final PerpetualsOrderContextDto.PerpetualsOrderTypeDto order_type;
        private final String quote_currency_code;
        private final String ref_id;
        private final PerpetualsOrderContextDto.OrderStatusDto status;
        private final double stop_loss;
        private final double stop_price;
        private final double take_profit;
        private final PerpetualsOrderContextDto.TimeInForceDto time_in_force;
        private final double total_notional_amount;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (PerpetualsOrderContextDto.PerpetualsOrderTypeDto) null, (PerpetualsOrderContextDto.PerpetualsOrderSideDto) null, 0.0d, 0.0d, 0.0d, 0.0d, (PerpetualsOrderContextDto.TimeInForceDto) null, (String) null, 0.0d, (String) null, 0.0d, 0.0d, (PerpetualsOrderContextDto.MarginModeDto) null, 0, 0.0d, 0.0d, 0.0d, (PerpetualsOrderContextDto.OrderStatusDto) null, 0.0d, 0.0d, false, false, (String) null, 67108863, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, PerpetualsOrderContextDto.PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderContextDto.PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, PerpetualsOrderContextDto.TimeInForceDto timeInForceDto, String str4, double d5, String str5, double d6, double d7, PerpetualsOrderContextDto.MarginModeDto marginModeDto, int i, double d8, double d9, double d10, PerpetualsOrderContextDto.OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str6, int i2, Object obj) {
            String str7;
            boolean z3;
            PerpetualsOrderContextDto.MarginModeDto marginModeDto2;
            double d13;
            int i3;
            double d14;
            double d15;
            double d16;
            double d17;
            double d18;
            boolean z4;
            PerpetualsOrderContextDto.OrderStatusDto orderStatusDto2;
            double d19;
            double d20;
            double d21;
            PerpetualsOrderContextDto.TimeInForceDto timeInForceDto2;
            String str8;
            double d22;
            String str9;
            double d23;
            String str10;
            String str11;
            PerpetualsOrderContextDto.PerpetualsOrderTypeDto perpetualsOrderTypeDto2;
            PerpetualsOrderContextDto.PerpetualsOrderSideDto perpetualsOrderSideDto2;
            double d24;
            String str12 = (i2 & 1) != 0 ? surrogate.ref_id : str;
            String str13 = (i2 & 2) != 0 ? surrogate.account_id : str2;
            String str14 = (i2 & 4) != 0 ? surrogate.contract_id : str3;
            PerpetualsOrderContextDto.PerpetualsOrderTypeDto perpetualsOrderTypeDto3 = (i2 & 8) != 0 ? surrogate.order_type : perpetualsOrderTypeDto;
            PerpetualsOrderContextDto.PerpetualsOrderSideDto perpetualsOrderSideDto3 = (i2 & 16) != 0 ? surrogate.order_side : perpetualsOrderSideDto;
            double d25 = (i2 & 32) != 0 ? surrogate.bid_price : d;
            double d26 = (i2 & 64) != 0 ? surrogate.ask_price : d2;
            double d27 = (i2 & 128) != 0 ? surrogate.limit_price : d3;
            double d28 = (i2 & 256) != 0 ? surrogate.stop_price : d4;
            PerpetualsOrderContextDto.TimeInForceDto timeInForceDto3 = (i2 & 512) != 0 ? surrogate.time_in_force : timeInForceDto;
            String str15 = str12;
            String str16 = (i2 & 1024) != 0 ? surrogate.quote_currency_code : str4;
            String str17 = str13;
            double d29 = (i2 & 2048) != 0 ? surrogate.order_quantity : d5;
            String str18 = (i2 & 4096) != 0 ? surrogate.order_currency_code : str5;
            double d30 = (i2 & 8192) != 0 ? surrogate.avg_executed_price : d6;
            double d31 = (i2 & 16384) != 0 ? surrogate.total_notional_amount : d7;
            PerpetualsOrderContextDto.MarginModeDto marginModeDto3 = (i2 & 32768) != 0 ? surrogate.margin_mode : marginModeDto;
            int i4 = (i2 & 65536) != 0 ? surrogate.leverage : i;
            double d32 = d31;
            double d33 = (i2 & 131072) != 0 ? surrogate.take_profit : d8;
            double d34 = (i2 & 262144) != 0 ? surrogate.stop_loss : d9;
            double d35 = (i2 & 524288) != 0 ? surrogate.fees : d10;
            PerpetualsOrderContextDto.OrderStatusDto orderStatusDto3 = (i2 & 1048576) != 0 ? surrogate.status : orderStatusDto;
            double d36 = d35;
            double d37 = (i2 & 2097152) != 0 ? surrogate.executed_notional : d11;
            double d38 = (i2 & 4194304) != 0 ? surrogate.executed_quantity : d12;
            boolean z5 = (i2 & 8388608) != 0 ? surrogate.is_liquidation_order : z;
            boolean z6 = (i2 & 16777216) != 0 ? surrogate.is_close_position_order : z2;
            if ((i2 & 33554432) != 0) {
                z3 = z5;
                str7 = surrogate.masked_ref_id;
                marginModeDto2 = marginModeDto3;
                i3 = i4;
                d14 = d33;
                d15 = d34;
                d16 = d36;
                d17 = d37;
                d18 = d38;
                z4 = z6;
                orderStatusDto2 = orderStatusDto3;
                d20 = d27;
                d21 = d28;
                timeInForceDto2 = timeInForceDto3;
                str8 = str16;
                d22 = d29;
                str9 = str18;
                d23 = d30;
                d13 = d32;
                str10 = str17;
                str11 = str14;
                perpetualsOrderTypeDto2 = perpetualsOrderTypeDto3;
                perpetualsOrderSideDto2 = perpetualsOrderSideDto3;
                d24 = d25;
                d19 = d26;
            } else {
                str7 = str6;
                z3 = z5;
                marginModeDto2 = marginModeDto3;
                d13 = d32;
                i3 = i4;
                d14 = d33;
                d15 = d34;
                d16 = d36;
                d17 = d37;
                d18 = d38;
                z4 = z6;
                orderStatusDto2 = orderStatusDto3;
                d19 = d26;
                d20 = d27;
                d21 = d28;
                timeInForceDto2 = timeInForceDto3;
                str8 = str16;
                d22 = d29;
                str9 = str18;
                d23 = d30;
                str10 = str17;
                str11 = str14;
                perpetualsOrderTypeDto2 = perpetualsOrderTypeDto3;
                perpetualsOrderSideDto2 = perpetualsOrderSideDto3;
                d24 = d25;
            }
            return surrogate.copy(str15, str10, str11, perpetualsOrderTypeDto2, perpetualsOrderSideDto2, d24, d19, d20, d21, timeInForceDto2, str8, d22, str9, d23, d13, marginModeDto2, i3, d14, d15, d16, orderStatusDto2, d17, d18, z3, z4, str7);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
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

        @SerialName("maskedRefId")
        @JsonAnnotations2(names = {"masked_ref_id"})
        public static /* synthetic */ void getMasked_ref_id$annotations() {
        }

        @SerialName("orderCurrencyCode")
        @JsonAnnotations2(names = {"order_currency_code"})
        public static /* synthetic */ void getOrder_currency_code$annotations() {
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
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component10, reason: from getter */
        public final PerpetualsOrderContextDto.TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component11, reason: from getter */
        public final String getQuote_currency_code() {
            return this.quote_currency_code;
        }

        /* renamed from: component12, reason: from getter */
        public final double getOrder_quantity() {
            return this.order_quantity;
        }

        /* renamed from: component13, reason: from getter */
        public final String getOrder_currency_code() {
            return this.order_currency_code;
        }

        /* renamed from: component14, reason: from getter */
        public final double getAvg_executed_price() {
            return this.avg_executed_price;
        }

        /* renamed from: component15, reason: from getter */
        public final double getTotal_notional_amount() {
            return this.total_notional_amount;
        }

        /* renamed from: component16, reason: from getter */
        public final PerpetualsOrderContextDto.MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        /* renamed from: component17, reason: from getter */
        public final int getLeverage() {
            return this.leverage;
        }

        /* renamed from: component18, reason: from getter */
        public final double getTake_profit() {
            return this.take_profit;
        }

        /* renamed from: component19, reason: from getter */
        public final double getStop_loss() {
            return this.stop_loss;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component20, reason: from getter */
        public final double getFees() {
            return this.fees;
        }

        /* renamed from: component21, reason: from getter */
        public final PerpetualsOrderContextDto.OrderStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component22, reason: from getter */
        public final double getExecuted_notional() {
            return this.executed_notional;
        }

        /* renamed from: component23, reason: from getter */
        public final double getExecuted_quantity() {
            return this.executed_quantity;
        }

        /* renamed from: component24, reason: from getter */
        public final boolean getIs_liquidation_order() {
            return this.is_liquidation_order;
        }

        /* renamed from: component25, reason: from getter */
        public final boolean getIs_close_position_order() {
            return this.is_close_position_order;
        }

        /* renamed from: component26, reason: from getter */
        public final String getMasked_ref_id() {
            return this.masked_ref_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component4, reason: from getter */
        public final PerpetualsOrderContextDto.PerpetualsOrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component5, reason: from getter */
        public final PerpetualsOrderContextDto.PerpetualsOrderSideDto getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component6, reason: from getter */
        public final double getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component7, reason: from getter */
        public final double getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component8, reason: from getter */
        public final double getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component9, reason: from getter */
        public final double getStop_price() {
            return this.stop_price;
        }

        public final Surrogate copy(String ref_id, String account_id, String contract_id, PerpetualsOrderContextDto.PerpetualsOrderTypeDto order_type, PerpetualsOrderContextDto.PerpetualsOrderSideDto order_side, double bid_price, double ask_price, double limit_price, double stop_price, PerpetualsOrderContextDto.TimeInForceDto time_in_force, String quote_currency_code, double order_quantity, String order_currency_code, double avg_executed_price, double total_notional_amount, PerpetualsOrderContextDto.MarginModeDto margin_mode, int leverage, double take_profit, double stop_loss, double fees, PerpetualsOrderContextDto.OrderStatusDto status, double executed_notional, double executed_quantity, boolean is_liquidation_order, boolean is_close_position_order, String masked_ref_id) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
            return new Surrogate(ref_id, account_id, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, is_liquidation_order, is_close_position_order, masked_ref_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.order_type == surrogate.order_type && this.order_side == surrogate.order_side && Double.compare(this.bid_price, surrogate.bid_price) == 0 && Double.compare(this.ask_price, surrogate.ask_price) == 0 && Double.compare(this.limit_price, surrogate.limit_price) == 0 && Double.compare(this.stop_price, surrogate.stop_price) == 0 && this.time_in_force == surrogate.time_in_force && Intrinsics.areEqual(this.quote_currency_code, surrogate.quote_currency_code) && Double.compare(this.order_quantity, surrogate.order_quantity) == 0 && Intrinsics.areEqual(this.order_currency_code, surrogate.order_currency_code) && Double.compare(this.avg_executed_price, surrogate.avg_executed_price) == 0 && Double.compare(this.total_notional_amount, surrogate.total_notional_amount) == 0 && this.margin_mode == surrogate.margin_mode && this.leverage == surrogate.leverage && Double.compare(this.take_profit, surrogate.take_profit) == 0 && Double.compare(this.stop_loss, surrogate.stop_loss) == 0 && Double.compare(this.fees, surrogate.fees) == 0 && this.status == surrogate.status && Double.compare(this.executed_notional, surrogate.executed_notional) == 0 && Double.compare(this.executed_quantity, surrogate.executed_quantity) == 0 && this.is_liquidation_order == surrogate.is_liquidation_order && this.is_close_position_order == surrogate.is_close_position_order && Intrinsics.areEqual(this.masked_ref_id, surrogate.masked_ref_id);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((this.ref_id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.contract_id.hashCode()) * 31) + this.order_type.hashCode()) * 31) + this.order_side.hashCode()) * 31) + Double.hashCode(this.bid_price)) * 31) + Double.hashCode(this.ask_price)) * 31) + Double.hashCode(this.limit_price)) * 31) + Double.hashCode(this.stop_price)) * 31) + this.time_in_force.hashCode()) * 31) + this.quote_currency_code.hashCode()) * 31) + Double.hashCode(this.order_quantity)) * 31) + this.order_currency_code.hashCode()) * 31) + Double.hashCode(this.avg_executed_price)) * 31) + Double.hashCode(this.total_notional_amount)) * 31) + this.margin_mode.hashCode()) * 31) + Integer.hashCode(this.leverage)) * 31) + Double.hashCode(this.take_profit)) * 31) + Double.hashCode(this.stop_loss)) * 31) + Double.hashCode(this.fees)) * 31) + this.status.hashCode()) * 31) + Double.hashCode(this.executed_notional)) * 31) + Double.hashCode(this.executed_quantity)) * 31) + java.lang.Boolean.hashCode(this.is_liquidation_order)) * 31) + java.lang.Boolean.hashCode(this.is_close_position_order)) * 31) + this.masked_ref_id.hashCode();
        }

        public String toString() {
            return "Surrogate(ref_id=" + this.ref_id + ", account_id=" + this.account_id + ", contract_id=" + this.contract_id + ", order_type=" + this.order_type + ", order_side=" + this.order_side + ", bid_price=" + this.bid_price + ", ask_price=" + this.ask_price + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ", time_in_force=" + this.time_in_force + ", quote_currency_code=" + this.quote_currency_code + ", order_quantity=" + this.order_quantity + ", order_currency_code=" + this.order_currency_code + ", avg_executed_price=" + this.avg_executed_price + ", total_notional_amount=" + this.total_notional_amount + ", margin_mode=" + this.margin_mode + ", leverage=" + this.leverage + ", take_profit=" + this.take_profit + ", stop_loss=" + this.stop_loss + ", fees=" + this.fees + ", status=" + this.status + ", executed_notional=" + this.executed_notional + ", executed_quantity=" + this.executed_quantity + ", is_liquidation_order=" + this.is_liquidation_order + ", is_close_position_order=" + this.is_close_position_order + ", masked_ref_id=" + this.masked_ref_id + ")";
        }

        /* compiled from: PerpetualOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerpetualOrderPayloadDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, PerpetualsOrderContextDto.PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderContextDto.PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, PerpetualsOrderContextDto.TimeInForceDto timeInForceDto, String str4, double d5, String str5, double d6, double d7, PerpetualsOrderContextDto.MarginModeDto marginModeDto, int i2, double d8, double d9, double d10, PerpetualsOrderContextDto.OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str3;
            }
            if ((i & 8) == 0) {
                this.order_type = PerpetualsOrderContextDto.PerpetualsOrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_type = perpetualsOrderTypeDto;
            }
            if ((i & 16) == 0) {
                this.order_side = PerpetualsOrderContextDto.PerpetualsOrderSideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = perpetualsOrderSideDto;
            }
            if ((i & 32) == 0) {
                this.bid_price = 0.0d;
            } else {
                this.bid_price = d;
            }
            if ((i & 64) == 0) {
                this.ask_price = 0.0d;
            } else {
                this.ask_price = d2;
            }
            if ((i & 128) == 0) {
                this.limit_price = 0.0d;
            } else {
                this.limit_price = d3;
            }
            if ((i & 256) == 0) {
                this.stop_price = 0.0d;
            } else {
                this.stop_price = d4;
            }
            this.time_in_force = (i & 512) == 0 ? PerpetualsOrderContextDto.TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
            if ((i & 1024) == 0) {
                this.quote_currency_code = "";
            } else {
                this.quote_currency_code = str4;
            }
            if ((i & 2048) == 0) {
                this.order_quantity = 0.0d;
            } else {
                this.order_quantity = d5;
            }
            if ((i & 4096) == 0) {
                this.order_currency_code = "";
            } else {
                this.order_currency_code = str5;
            }
            if ((i & 8192) == 0) {
                this.avg_executed_price = 0.0d;
            } else {
                this.avg_executed_price = d6;
            }
            if ((i & 16384) == 0) {
                this.total_notional_amount = 0.0d;
            } else {
                this.total_notional_amount = d7;
            }
            this.margin_mode = (32768 & i) == 0 ? PerpetualsOrderContextDto.MarginModeDto.INSTANCE.getZeroValue() : marginModeDto;
            if ((65536 & i) == 0) {
                this.leverage = 0;
            } else {
                this.leverage = i2;
            }
            if ((131072 & i) == 0) {
                this.take_profit = 0.0d;
            } else {
                this.take_profit = d8;
            }
            if ((262144 & i) == 0) {
                this.stop_loss = 0.0d;
            } else {
                this.stop_loss = d9;
            }
            if ((524288 & i) == 0) {
                this.fees = 0.0d;
            } else {
                this.fees = d10;
            }
            this.status = (1048576 & i) == 0 ? PerpetualsOrderContextDto.OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto;
            if ((2097152 & i) == 0) {
                this.executed_notional = 0.0d;
            } else {
                this.executed_notional = d11;
            }
            if ((4194304 & i) == 0) {
                this.executed_quantity = 0.0d;
            } else {
                this.executed_quantity = d12;
            }
            if ((8388608 & i) == 0) {
                this.is_liquidation_order = false;
            } else {
                this.is_liquidation_order = z;
            }
            if ((16777216 & i) == 0) {
                this.is_close_position_order = false;
            } else {
                this.is_close_position_order = z2;
            }
            if ((i & 33554432) == 0) {
                this.masked_ref_id = "";
            } else {
                this.masked_ref_id = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.contract_id);
            }
            if (self.order_type != PerpetualsOrderContextDto.PerpetualsOrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, PerpetualsOrderContextDto.PerpetualsOrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_side != PerpetualsOrderContextDto.PerpetualsOrderSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, PerpetualsOrderContextDto.PerpetualsOrderSideDto.Serializer.INSTANCE, self.order_side);
            }
            if (Double.compare(self.bid_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.bid_price));
            }
            if (Double.compare(self.ask_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.ask_price));
            }
            if (Double.compare(self.limit_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.limit_price));
            }
            if (Double.compare(self.stop_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.stop_price));
            }
            if (self.time_in_force != PerpetualsOrderContextDto.TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, PerpetualsOrderContextDto.TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (!Intrinsics.areEqual(self.quote_currency_code, "")) {
                output.encodeStringElement(serialDesc, 10, self.quote_currency_code);
            }
            if (Double.compare(self.order_quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 11, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.order_quantity));
            }
            if (!Intrinsics.areEqual(self.order_currency_code, "")) {
                output.encodeStringElement(serialDesc, 12, self.order_currency_code);
            }
            if (Double.compare(self.avg_executed_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 13, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.avg_executed_price));
            }
            if (Double.compare(self.total_notional_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 14, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_notional_amount));
            }
            if (self.margin_mode != PerpetualsOrderContextDto.MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 15, PerpetualsOrderContextDto.MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            int i = self.leverage;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 16, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Double.compare(self.take_profit, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 17, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.take_profit));
            }
            if (Double.compare(self.stop_loss, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 18, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.stop_loss));
            }
            if (Double.compare(self.fees, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 19, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.fees));
            }
            if (self.status != PerpetualsOrderContextDto.OrderStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 20, PerpetualsOrderContextDto.OrderStatusDto.Serializer.INSTANCE, self.status);
            }
            if (Double.compare(self.executed_notional, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 21, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.executed_notional));
            }
            if (Double.compare(self.executed_quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 22, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.executed_quantity));
            }
            boolean z = self.is_liquidation_order;
            if (z) {
                output.encodeBooleanElement(serialDesc, 23, z);
            }
            boolean z2 = self.is_close_position_order;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 24, z2);
            }
            if (Intrinsics.areEqual(self.masked_ref_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 25, self.masked_ref_id);
        }

        public Surrogate(String ref_id, String account_id, String contract_id, PerpetualsOrderContextDto.PerpetualsOrderTypeDto order_type, PerpetualsOrderContextDto.PerpetualsOrderSideDto order_side, double d, double d2, double d3, double d4, PerpetualsOrderContextDto.TimeInForceDto time_in_force, String quote_currency_code, double d5, String order_currency_code, double d6, double d7, PerpetualsOrderContextDto.MarginModeDto margin_mode, int i, double d8, double d9, double d10, PerpetualsOrderContextDto.OrderStatusDto status, double d11, double d12, boolean z, boolean z2, String masked_ref_id) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
            this.ref_id = ref_id;
            this.account_id = account_id;
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
            this.masked_ref_id = masked_ref_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, PerpetualsOrderContextDto.PerpetualsOrderTypeDto perpetualsOrderTypeDto, PerpetualsOrderContextDto.PerpetualsOrderSideDto perpetualsOrderSideDto, double d, double d2, double d3, double d4, PerpetualsOrderContextDto.TimeInForceDto timeInForceDto, String str4, double d5, String str5, double d6, double d7, PerpetualsOrderContextDto.MarginModeDto marginModeDto, int i, double d8, double d9, double d10, PerpetualsOrderContextDto.OrderStatusDto orderStatusDto, double d11, double d12, boolean z, boolean z2, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? PerpetualsOrderContextDto.PerpetualsOrderTypeDto.INSTANCE.getZeroValue() : perpetualsOrderTypeDto, (i2 & 16) != 0 ? PerpetualsOrderContextDto.PerpetualsOrderSideDto.INSTANCE.getZeroValue() : perpetualsOrderSideDto, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? 0.0d : d2, (i2 & 128) != 0 ? 0.0d : d3, (i2 & 256) != 0 ? 0.0d : d4, (i2 & 512) != 0 ? PerpetualsOrderContextDto.TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 1024) != 0 ? "" : str4, (i2 & 2048) != 0 ? 0.0d : d5, (i2 & 4096) != 0 ? "" : str5, (i2 & 8192) != 0 ? 0.0d : d6, (i2 & 16384) != 0 ? 0.0d : d7, (32768 & i2) != 0 ? PerpetualsOrderContextDto.MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i2 & 65536) != 0 ? 0 : i, (i2 & 131072) != 0 ? 0.0d : d8, (i2 & 262144) != 0 ? 0.0d : d9, (i2 & 524288) != 0 ? 0.0d : d10, (i2 & 1048576) != 0 ? PerpetualsOrderContextDto.OrderStatusDto.INSTANCE.getZeroValue() : orderStatusDto, (i2 & 2097152) != 0 ? 0.0d : d11, (i2 & 4194304) != 0 ? 0.0d : d12, (i2 & 8388608) != 0 ? false : z, (i2 & 16777216) == 0 ? z2 : false, (i2 & 33554432) != 0 ? "" : str6);
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final PerpetualsOrderContextDto.PerpetualsOrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final PerpetualsOrderContextDto.PerpetualsOrderSideDto getOrder_side() {
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

        public final PerpetualsOrderContextDto.TimeInForceDto getTime_in_force() {
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

        public final PerpetualsOrderContextDto.MarginModeDto getMargin_mode() {
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

        public final PerpetualsOrderContextDto.OrderStatusDto getStatus() {
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

        public final String getMasked_ref_id() {
            return this.masked_ref_id;
        }
    }

    /* compiled from: PerpetualOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto;", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayload;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PerpetualOrderPayloadDto, PerpetualOrderPayload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerpetualOrderPayloadDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualOrderPayloadDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualOrderPayloadDto> getBinaryBase64Serializer() {
            return (KSerializer) PerpetualOrderPayloadDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerpetualOrderPayload> getProtoAdapter() {
            return PerpetualOrderPayload.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualOrderPayloadDto getZeroValue() {
            return PerpetualOrderPayloadDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualOrderPayloadDto fromProto(PerpetualOrderPayload proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PerpetualOrderPayloadDto(new Surrogate(proto.getRef_id(), proto.getAccount_id(), proto.getContract_id(), PerpetualsOrderContextDto.PerpetualsOrderTypeDto.INSTANCE.fromProto(proto.getOrder_type()), PerpetualsOrderContextDto.PerpetualsOrderSideDto.INSTANCE.fromProto(proto.getOrder_side()), proto.getBid_price(), proto.getAsk_price(), proto.getLimit_price(), proto.getStop_price(), PerpetualsOrderContextDto.TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force()), proto.getQuote_currency_code(), proto.getOrder_quantity(), proto.getOrder_currency_code(), proto.getAvg_executed_price(), proto.getTotal_notional_amount(), PerpetualsOrderContextDto.MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode()), proto.getLeverage(), proto.getTake_profit(), proto.getStop_loss(), proto.getFees(), PerpetualsOrderContextDto.OrderStatusDto.INSTANCE.fromProto(proto.getStatus()), proto.getExecuted_notional(), proto.getExecuted_quantity(), proto.getIs_liquidation_order(), proto.getIs_close_position_order(), proto.getMasked_ref_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PerpetualOrderPayloadDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerpetualOrderPayloadDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerpetualOrderPayloadDto(null, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, false, false, null, 67108863, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PerpetualOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PerpetualOrderPayloadDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PerpetualOrderPayload", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerpetualOrderPayloadDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerpetualOrderPayloadDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerpetualOrderPayloadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerpetualOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayloadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PerpetualOrderPayloadDto";
        }
    }
}
