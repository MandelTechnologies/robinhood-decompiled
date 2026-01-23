package com.robinhood.rosetta.eventlogging;

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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.CryptoOrderContextDto;
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
import p479j$.time.Instant;
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.MonetizationModelDto;
import rosetta.order.InitiatorType;
import rosetta.order.InitiatorTypeDto;
import rosetta.order.OrderType;
import rosetta.order.OrderTypeDto;
import rosetta.order.Side;
import rosetta.order.SideDto;
import rosetta.order.TimeInForce;
import rosetta.order.TimeInForceDto;

/* compiled from: CryptoOrderPayloadDto.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\b\u0007\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004YXZ[B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÙ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\"\u0012\b\b\u0002\u0010&\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010'JÝ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010.H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000202H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000202H\u0016¢\u0006\u0004\b;\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u0010-R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010-R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b?\u0010-R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010-R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bA\u0010-R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bJ\u0010-R\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bK\u0010-R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bL\u0010-R\u0019\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010!\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010#\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010UR\u0011\u0010$\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bV\u0010-R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b%\u0010UR\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bW\u0010-¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;)V", "", "ref_id", "account_id", "currency_pair_id", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "Lrosetta/order/SideDto;", "side", "Lrosetta/order/TimeInForceDto;", "time_in_force", "Lrosetta/order/OrderTypeDto;", "type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "orderType", "entered_amount", "quote_ask_source", "quote_bid_source", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "quote_updated_at", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "Lcom/robinhood/idl/IdlDecimal;", "fee_ratio", "Lrosetta/order/InitiatorTypeDto;", "initiator_type", "", "is_auto_send", "replacing_order_id", "is_replacing_order", "masked_ref_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/InitiatorTypeDto;ZLjava/lang/String;ZLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/InitiatorTypeDto;ZLjava/lang/String;ZLjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;", "getRef_id", "getAccount_id", "getCurrency_pair_id", "getPrice", "getQuantity", "getSide", "()Lrosetta/order/SideDto;", "getTime_in_force", "()Lrosetta/order/TimeInForceDto;", "getType", "()Lrosetta/order/OrderTypeDto;", "getOrderType", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "getEntered_amount", "getQuote_ask_source", "getQuote_bid_source", "getQuote_updated_at", "()Lj$/time/Instant;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getInitiator_type", "()Lrosetta/order/InitiatorTypeDto;", "()Z", "getReplacing_order_id", "getMasked_ref_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoOrderPayloadDto implements Dto3<CryptoOrderPayload>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoOrderPayloadDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderPayloadDto, CryptoOrderPayload>> binaryBase64Serializer$delegate;
    private static final CryptoOrderPayloadDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoOrderPayloadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoOrderPayloadDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getCurrency_pair_id() {
        return this.surrogate.getCurrency_pair_id();
    }

    public final String getPrice() {
        return this.surrogate.getPrice();
    }

    public final String getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final CryptoOrderContextDto.CryptoOrderTypeDto getOrderType() {
        return this.surrogate.getOrderType();
    }

    public final String getEntered_amount() {
        return this.surrogate.getEntered_amount();
    }

    public final String getQuote_ask_source() {
        return this.surrogate.getQuote_ask_source();
    }

    public final String getQuote_bid_source() {
        return this.surrogate.getQuote_bid_source();
    }

    public final Instant getQuote_updated_at() {
        return this.surrogate.getQuote_updated_at();
    }

    public final MonetizationModelDto getMonetization_model() {
        return this.surrogate.getMonetization_model();
    }

    public final IdlDecimal getFee_ratio() {
        return this.surrogate.getFee_ratio();
    }

    public final InitiatorTypeDto getInitiator_type() {
        return this.surrogate.getInitiator_type();
    }

    public final boolean is_auto_send() {
        return this.surrogate.is_auto_send();
    }

    public final String getReplacing_order_id() {
        return this.surrogate.getReplacing_order_id();
    }

    public final boolean is_replacing_order() {
        return this.surrogate.is_replacing_order();
    }

    public final String getMasked_ref_id() {
        return this.surrogate.getMasked_ref_id();
    }

    public /* synthetic */ CryptoOrderPayloadDto(String str, String str2, String str3, String str4, String str5, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, CryptoOrderContextDto.CryptoOrderTypeDto cryptoOrderTypeDto, String str6, String str7, String str8, Instant instant, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, InitiatorTypeDto initiatorTypeDto, boolean z, String str9, boolean z2, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 256) != 0 ? CryptoOrderContextDto.CryptoOrderTypeDto.INSTANCE.getZeroValue() : cryptoOrderTypeDto, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? null : instant, (i & 8192) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 16384) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32768) != 0 ? InitiatorTypeDto.INSTANCE.getZeroValue() : initiatorTypeDto, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? "" : str9, (i & 262144) == 0 ? z2 : false, (i & 524288) != 0 ? "" : str10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoOrderPayloadDto(String ref_id, String account_id, String currency_pair_id, String price, String quantity, SideDto side, TimeInForceDto time_in_force, OrderTypeDto type2, CryptoOrderContextDto.CryptoOrderTypeDto orderType, String entered_amount, String quote_ask_source, String quote_bid_source, Instant instant, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, InitiatorTypeDto initiator_type, boolean z, String replacing_order_id, boolean z2, String masked_ref_id) {
        this(new Surrogate(ref_id, account_id, currency_pair_id, price, quantity, side, time_in_force, type2, orderType, entered_amount, quote_ask_source, quote_bid_source, instant, monetization_model, fee_ratio, initiator_type, z, replacing_order_id, z2, masked_ref_id));
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(quote_ask_source, "quote_ask_source");
        Intrinsics.checkNotNullParameter(quote_bid_source, "quote_bid_source");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
        Intrinsics.checkNotNullParameter(replacing_order_id, "replacing_order_id");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
    }

    public static /* synthetic */ CryptoOrderPayloadDto copy$default(CryptoOrderPayloadDto cryptoOrderPayloadDto, String str, String str2, String str3, String str4, String str5, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, CryptoOrderContextDto.CryptoOrderTypeDto cryptoOrderTypeDto, String str6, String str7, String str8, Instant instant, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, InitiatorTypeDto initiatorTypeDto, boolean z, String str9, boolean z2, String str10, int i, Object obj) {
        String masked_ref_id;
        boolean z3;
        String ref_id = (i & 1) != 0 ? cryptoOrderPayloadDto.surrogate.getRef_id() : str;
        String account_id = (i & 2) != 0 ? cryptoOrderPayloadDto.surrogate.getAccount_id() : str2;
        String currency_pair_id = (i & 4) != 0 ? cryptoOrderPayloadDto.surrogate.getCurrency_pair_id() : str3;
        String price = (i & 8) != 0 ? cryptoOrderPayloadDto.surrogate.getPrice() : str4;
        String quantity = (i & 16) != 0 ? cryptoOrderPayloadDto.surrogate.getQuantity() : str5;
        SideDto side = (i & 32) != 0 ? cryptoOrderPayloadDto.surrogate.getSide() : sideDto;
        TimeInForceDto time_in_force = (i & 64) != 0 ? cryptoOrderPayloadDto.surrogate.getTime_in_force() : timeInForceDto;
        OrderTypeDto type2 = (i & 128) != 0 ? cryptoOrderPayloadDto.surrogate.getType() : orderTypeDto;
        CryptoOrderContextDto.CryptoOrderTypeDto orderType = (i & 256) != 0 ? cryptoOrderPayloadDto.surrogate.getOrderType() : cryptoOrderTypeDto;
        String entered_amount = (i & 512) != 0 ? cryptoOrderPayloadDto.surrogate.getEntered_amount() : str6;
        String quote_ask_source = (i & 1024) != 0 ? cryptoOrderPayloadDto.surrogate.getQuote_ask_source() : str7;
        String quote_bid_source = (i & 2048) != 0 ? cryptoOrderPayloadDto.surrogate.getQuote_bid_source() : str8;
        Instant quote_updated_at = (i & 4096) != 0 ? cryptoOrderPayloadDto.surrogate.getQuote_updated_at() : instant;
        MonetizationModelDto monetization_model = (i & 8192) != 0 ? cryptoOrderPayloadDto.surrogate.getMonetization_model() : monetizationModelDto;
        String str11 = ref_id;
        IdlDecimal fee_ratio = (i & 16384) != 0 ? cryptoOrderPayloadDto.surrogate.getFee_ratio() : idlDecimal;
        InitiatorTypeDto initiator_type = (i & 32768) != 0 ? cryptoOrderPayloadDto.surrogate.getInitiator_type() : initiatorTypeDto;
        boolean zIs_auto_send = (i & 65536) != 0 ? cryptoOrderPayloadDto.surrogate.is_auto_send() : z;
        String replacing_order_id = (i & 131072) != 0 ? cryptoOrderPayloadDto.surrogate.getReplacing_order_id() : str9;
        boolean zIs_replacing_order = (i & 262144) != 0 ? cryptoOrderPayloadDto.surrogate.is_replacing_order() : z2;
        if ((i & 524288) != 0) {
            z3 = zIs_replacing_order;
            masked_ref_id = cryptoOrderPayloadDto.surrogate.getMasked_ref_id();
        } else {
            masked_ref_id = str10;
            z3 = zIs_replacing_order;
        }
        return cryptoOrderPayloadDto.copy(str11, account_id, currency_pair_id, price, quantity, side, time_in_force, type2, orderType, entered_amount, quote_ask_source, quote_bid_source, quote_updated_at, monetization_model, fee_ratio, initiator_type, zIs_auto_send, replacing_order_id, z3, masked_ref_id);
    }

    public final CryptoOrderPayloadDto copy(String ref_id, String account_id, String currency_pair_id, String price, String quantity, SideDto side, TimeInForceDto time_in_force, OrderTypeDto type2, CryptoOrderContextDto.CryptoOrderTypeDto orderType, String entered_amount, String quote_ask_source, String quote_bid_source, Instant quote_updated_at, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, InitiatorTypeDto initiator_type, boolean is_auto_send, String replacing_order_id, boolean is_replacing_order, String masked_ref_id) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(quote_ask_source, "quote_ask_source");
        Intrinsics.checkNotNullParameter(quote_bid_source, "quote_bid_source");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
        Intrinsics.checkNotNullParameter(replacing_order_id, "replacing_order_id");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
        return new CryptoOrderPayloadDto(new Surrogate(ref_id, account_id, currency_pair_id, price, quantity, side, time_in_force, type2, orderType, entered_amount, quote_ask_source, quote_bid_source, quote_updated_at, monetization_model, fee_ratio, initiator_type, is_auto_send, replacing_order_id, is_replacing_order, masked_ref_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoOrderPayload toProto() {
        return new CryptoOrderPayload(this.surrogate.getRef_id(), this.surrogate.getAccount_id(), this.surrogate.getCurrency_pair_id(), this.surrogate.getPrice(), this.surrogate.getQuantity(), (Side) this.surrogate.getSide().toProto(), (TimeInForce) this.surrogate.getTime_in_force().toProto(), (OrderType) this.surrogate.getType().toProto(), (CryptoOrderContext.CryptoOrderType) this.surrogate.getOrderType().toProto(), this.surrogate.getEntered_amount(), this.surrogate.getQuote_ask_source(), this.surrogate.getQuote_bid_source(), this.surrogate.getQuote_updated_at(), (MonetizationModel) this.surrogate.getMonetization_model().toProto(), this.surrogate.getFee_ratio().getStringValue(), (InitiatorType) this.surrogate.getInitiator_type().toProto(), this.surrogate.is_auto_send(), this.surrogate.getReplacing_order_id(), this.surrogate.is_replacing_order(), this.surrogate.getMasked_ref_id(), null, 1048576, null);
    }

    public String toString() {
        return "[CryptoOrderPayloadDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoOrderPayloadDto) && Intrinsics.areEqual(((CryptoOrderPayloadDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b]\b\u0083\b\u0018\u0000 \u008c\u00012\u00020\u0001:\u0004\u008d\u0001\u008c\u0001B\u0084\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020 \u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&Bß\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001a\u00020 \u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b%\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u00106J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u00106J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u00106J\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u00106J6\u0010F\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u001cHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020 HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bP\u00106J\u0010\u0010Q\u001a\u00020 HÆ\u0003¢\u0006\u0004\bQ\u0010OJ\u0010\u0010R\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bR\u00106J\u008d\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0017\b\u0002\u0010\u001d\u001a\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u00106J\u0010\u0010V\u001a\u00020'HÖ\u0001¢\u0006\u0004\bV\u0010WJ\u001a\u0010Y\u001a\u00020 2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bY\u0010ZR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010[\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u00106R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010[\u0012\u0004\b`\u0010^\u001a\u0004\b_\u00106R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010[\u0012\u0004\bb\u0010^\u001a\u0004\ba\u00106R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010[\u0012\u0004\bd\u0010^\u001a\u0004\bc\u00106R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010[\u0012\u0004\bf\u0010^\u001a\u0004\be\u00106R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010g\u0012\u0004\bi\u0010^\u001a\u0004\bh\u0010<R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010j\u0012\u0004\bl\u0010^\u001a\u0004\bk\u0010>R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010m\u0012\u0004\bo\u0010^\u001a\u0004\bn\u0010@R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010p\u0012\u0004\br\u0010^\u001a\u0004\bq\u0010BR \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010[\u0012\u0004\bt\u0010^\u001a\u0004\bs\u00106R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010[\u0012\u0004\bv\u0010^\u001a\u0004\bu\u00106R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010[\u0012\u0004\bx\u0010^\u001a\u0004\bw\u00106RF\u0010\u0018\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010y\u0012\u0004\b{\u0010^\u001a\u0004\bz\u0010GR \u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010|\u0012\u0004\b~\u0010^\u001a\u0004\b}\u0010IR1\u0010\u001d\u001a\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u001c8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010\u007f\u0012\u0005\b\u0081\u0001\u0010^\u001a\u0005\b\u0080\u0001\u0010KR#\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001f\u0010\u0082\u0001\u0012\u0005\b\u0084\u0001\u0010^\u001a\u0005\b\u0083\u0001\u0010MR\"\u0010!\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b!\u0010\u0085\u0001\u0012\u0005\b\u0086\u0001\u0010^\u001a\u0004\b!\u0010OR\"\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\"\u0010[\u0012\u0005\b\u0088\u0001\u0010^\u001a\u0005\b\u0087\u0001\u00106R\"\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b#\u0010\u0085\u0001\u0012\u0005\b\u0089\u0001\u0010^\u001a\u0004\b#\u0010OR\"\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010[\u0012\u0005\b\u008b\u0001\u0010^\u001a\u0005\b\u008a\u0001\u00106¨\u0006\u008e\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;", "", "", "ref_id", "account_id", "currency_pair_id", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "Lrosetta/order/SideDto;", "side", "Lrosetta/order/TimeInForceDto;", "time_in_force", "Lrosetta/order/OrderTypeDto;", "type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "orderType", "entered_amount", "quote_ask_source", "quote_bid_source", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "quote_updated_at", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "fee_ratio", "Lrosetta/order/InitiatorTypeDto;", "initiator_type", "", "is_auto_send", "replacing_order_id", "is_replacing_order", "masked_ref_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/InitiatorTypeDto;ZLjava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/InitiatorTypeDto;ZLjava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lrosetta/order/SideDto;", "component7", "()Lrosetta/order/TimeInForceDto;", "component8", "()Lrosetta/order/OrderTypeDto;", "component9", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "component10", "component11", "component12", "component13", "()Lj$/time/Instant;", "component14", "()Lrosetta/nummus/MonetizationModelDto;", "component15", "()Lcom/robinhood/idl/IdlDecimal;", "component16", "()Lrosetta/order/InitiatorTypeDto;", "component17", "()Z", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/OrderTypeDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/order/InitiatorTypeDto;ZLjava/lang/String;ZLjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRef_id", "getRef_id$annotations", "()V", "getAccount_id", "getAccount_id$annotations", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "getPrice", "getPrice$annotations", "getQuantity", "getQuantity$annotations", "Lrosetta/order/SideDto;", "getSide", "getSide$annotations", "Lrosetta/order/TimeInForceDto;", "getTime_in_force", "getTime_in_force$annotations", "Lrosetta/order/OrderTypeDto;", "getType", "getType$annotations", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "getOrderType", "getOrderType$annotations", "getEntered_amount", "getEntered_amount$annotations", "getQuote_ask_source", "getQuote_ask_source$annotations", "getQuote_bid_source", "getQuote_bid_source$annotations", "Lj$/time/Instant;", "getQuote_updated_at", "getQuote_updated_at$annotations", "Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model", "getMonetization_model$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio", "getFee_ratio$annotations", "Lrosetta/order/InitiatorTypeDto;", "getInitiator_type", "getInitiator_type$annotations", "Z", "is_auto_send$annotations", "getReplacing_order_id", "getReplacing_order_id$annotations", "is_replacing_order$annotations", "getMasked_ref_id", "getMasked_ref_id$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String currency_pair_id;
        private final String entered_amount;
        private final IdlDecimal fee_ratio;
        private final InitiatorTypeDto initiator_type;
        private final boolean is_auto_send;
        private final boolean is_replacing_order;
        private final String masked_ref_id;
        private final MonetizationModelDto monetization_model;
        private final CryptoOrderContextDto.CryptoOrderTypeDto orderType;
        private final String price;
        private final String quantity;
        private final String quote_ask_source;
        private final String quote_bid_source;
        private final Instant quote_updated_at;
        private final String ref_id;
        private final String replacing_order_id;
        private final SideDto side;
        private final TimeInForceDto time_in_force;
        private final OrderTypeDto type;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (SideDto) null, (TimeInForceDto) null, (OrderTypeDto) null, (CryptoOrderContextDto.CryptoOrderTypeDto) null, (String) null, (String) null, (String) null, (Instant) null, (MonetizationModelDto) null, (IdlDecimal) null, (InitiatorTypeDto) null, false, (String) null, false, (String) null, 1048575, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, CryptoOrderContextDto.CryptoOrderTypeDto cryptoOrderTypeDto, String str6, String str7, String str8, Instant instant, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, InitiatorTypeDto initiatorTypeDto, boolean z, String str9, boolean z2, String str10, int i, Object obj) {
            String str11;
            boolean z3;
            String str12 = (i & 1) != 0 ? surrogate.ref_id : str;
            String str13 = (i & 2) != 0 ? surrogate.account_id : str2;
            String str14 = (i & 4) != 0 ? surrogate.currency_pair_id : str3;
            String str15 = (i & 8) != 0 ? surrogate.price : str4;
            String str16 = (i & 16) != 0 ? surrogate.quantity : str5;
            SideDto sideDto2 = (i & 32) != 0 ? surrogate.side : sideDto;
            TimeInForceDto timeInForceDto2 = (i & 64) != 0 ? surrogate.time_in_force : timeInForceDto;
            OrderTypeDto orderTypeDto2 = (i & 128) != 0 ? surrogate.type : orderTypeDto;
            CryptoOrderContextDto.CryptoOrderTypeDto cryptoOrderTypeDto2 = (i & 256) != 0 ? surrogate.orderType : cryptoOrderTypeDto;
            String str17 = (i & 512) != 0 ? surrogate.entered_amount : str6;
            String str18 = (i & 1024) != 0 ? surrogate.quote_ask_source : str7;
            String str19 = (i & 2048) != 0 ? surrogate.quote_bid_source : str8;
            Instant instant2 = (i & 4096) != 0 ? surrogate.quote_updated_at : instant;
            MonetizationModelDto monetizationModelDto2 = (i & 8192) != 0 ? surrogate.monetization_model : monetizationModelDto;
            String str20 = str12;
            IdlDecimal idlDecimal2 = (i & 16384) != 0 ? surrogate.fee_ratio : idlDecimal;
            InitiatorTypeDto initiatorTypeDto2 = (i & 32768) != 0 ? surrogate.initiator_type : initiatorTypeDto;
            boolean z4 = (i & 65536) != 0 ? surrogate.is_auto_send : z;
            String str21 = (i & 131072) != 0 ? surrogate.replacing_order_id : str9;
            boolean z5 = (i & 262144) != 0 ? surrogate.is_replacing_order : z2;
            if ((i & 524288) != 0) {
                z3 = z5;
                str11 = surrogate.masked_ref_id;
            } else {
                str11 = str10;
                z3 = z5;
            }
            return surrogate.copy(str20, str13, str14, str15, str16, sideDto2, timeInForceDto2, orderTypeDto2, cryptoOrderTypeDto2, str17, str18, str19, instant2, monetizationModelDto2, idlDecimal2, initiatorTypeDto2, z4, str21, z3, str11);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("currencyPairId")
        @JsonAnnotations2(names = {"currency_pair_id"})
        public static /* synthetic */ void getCurrency_pair_id$annotations() {
        }

        @SerialName("enteredAmount")
        @JsonAnnotations2(names = {"entered_amount"})
        public static /* synthetic */ void getEntered_amount$annotations() {
        }

        @SerialName("feeRatio")
        @JsonAnnotations2(names = {"fee_ratio"})
        public static /* synthetic */ void getFee_ratio$annotations() {
        }

        @SerialName("initiatorType")
        @JsonAnnotations2(names = {"initiator_type"})
        public static /* synthetic */ void getInitiator_type$annotations() {
        }

        @SerialName("maskedRefId")
        @JsonAnnotations2(names = {"masked_ref_id"})
        public static /* synthetic */ void getMasked_ref_id$annotations() {
        }

        @SerialName("monetizationModel")
        @JsonAnnotations2(names = {"monetization_model"})
        public static /* synthetic */ void getMonetization_model$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"orderType"})
        public static /* synthetic */ void getOrderType$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("quoteAskSource")
        @JsonAnnotations2(names = {"quote_ask_source"})
        public static /* synthetic */ void getQuote_ask_source$annotations() {
        }

        @SerialName("quoteBidSource")
        @JsonAnnotations2(names = {"quote_bid_source"})
        public static /* synthetic */ void getQuote_bid_source$annotations() {
        }

        @SerialName("quoteUpdatedAt")
        @JsonAnnotations2(names = {"quote_updated_at"})
        public static /* synthetic */ void getQuote_updated_at$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("replacingOrderId")
        @JsonAnnotations2(names = {"replacing_order_id"})
        public static /* synthetic */ void getReplacing_order_id$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("isAutoSend")
        @JsonAnnotations2(names = {"is_auto_send"})
        public static /* synthetic */ void is_auto_send$annotations() {
        }

        @SerialName("isReplacingOrder")
        @JsonAnnotations2(names = {"is_replacing_order"})
        public static /* synthetic */ void is_replacing_order$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getEntered_amount() {
            return this.entered_amount;
        }

        /* renamed from: component11, reason: from getter */
        public final String getQuote_ask_source() {
            return this.quote_ask_source;
        }

        /* renamed from: component12, reason: from getter */
        public final String getQuote_bid_source() {
            return this.quote_bid_source;
        }

        /* renamed from: component13, reason: from getter */
        public final Instant getQuote_updated_at() {
            return this.quote_updated_at;
        }

        /* renamed from: component14, reason: from getter */
        public final MonetizationModelDto getMonetization_model() {
            return this.monetization_model;
        }

        /* renamed from: component15, reason: from getter */
        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        /* renamed from: component16, reason: from getter */
        public final InitiatorTypeDto getInitiator_type() {
            return this.initiator_type;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getIs_auto_send() {
            return this.is_auto_send;
        }

        /* renamed from: component18, reason: from getter */
        public final String getReplacing_order_id() {
            return this.replacing_order_id;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getIs_replacing_order() {
            return this.is_replacing_order;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component20, reason: from getter */
        public final String getMasked_ref_id() {
            return this.masked_ref_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component5, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component8, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        /* renamed from: component9, reason: from getter */
        public final CryptoOrderContextDto.CryptoOrderTypeDto getOrderType() {
            return this.orderType;
        }

        public final Surrogate copy(String ref_id, String account_id, String currency_pair_id, String price, String quantity, SideDto side, TimeInForceDto time_in_force, OrderTypeDto type2, CryptoOrderContextDto.CryptoOrderTypeDto orderType, String entered_amount, String quote_ask_source, String quote_bid_source, Instant quote_updated_at, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, InitiatorTypeDto initiator_type, boolean is_auto_send, String replacing_order_id, boolean is_replacing_order, String masked_ref_id) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
            Intrinsics.checkNotNullParameter(quote_ask_source, "quote_ask_source");
            Intrinsics.checkNotNullParameter(quote_bid_source, "quote_bid_source");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
            Intrinsics.checkNotNullParameter(replacing_order_id, "replacing_order_id");
            Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
            return new Surrogate(ref_id, account_id, currency_pair_id, price, quantity, side, time_in_force, type2, orderType, entered_amount, quote_ask_source, quote_bid_source, quote_updated_at, monetization_model, fee_ratio, initiator_type, is_auto_send, replacing_order_id, is_replacing_order, masked_ref_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.side == surrogate.side && this.time_in_force == surrogate.time_in_force && this.type == surrogate.type && this.orderType == surrogate.orderType && Intrinsics.areEqual(this.entered_amount, surrogate.entered_amount) && Intrinsics.areEqual(this.quote_ask_source, surrogate.quote_ask_source) && Intrinsics.areEqual(this.quote_bid_source, surrogate.quote_bid_source) && Intrinsics.areEqual(this.quote_updated_at, surrogate.quote_updated_at) && this.monetization_model == surrogate.monetization_model && Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio) && this.initiator_type == surrogate.initiator_type && this.is_auto_send == surrogate.is_auto_send && Intrinsics.areEqual(this.replacing_order_id, surrogate.replacing_order_id) && this.is_replacing_order == surrogate.is_replacing_order && Intrinsics.areEqual(this.masked_ref_id, surrogate.masked_ref_id);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.ref_id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.currency_pair_id.hashCode()) * 31) + this.price.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.side.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + this.type.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.entered_amount.hashCode()) * 31) + this.quote_ask_source.hashCode()) * 31) + this.quote_bid_source.hashCode()) * 31;
            Instant instant = this.quote_updated_at;
            return ((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.monetization_model.hashCode()) * 31) + this.fee_ratio.hashCode()) * 31) + this.initiator_type.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_auto_send)) * 31) + this.replacing_order_id.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_replacing_order)) * 31) + this.masked_ref_id.hashCode();
        }

        public String toString() {
            return "Surrogate(ref_id=" + this.ref_id + ", account_id=" + this.account_id + ", currency_pair_id=" + this.currency_pair_id + ", price=" + this.price + ", quantity=" + this.quantity + ", side=" + this.side + ", time_in_force=" + this.time_in_force + ", type=" + this.type + ", orderType=" + this.orderType + ", entered_amount=" + this.entered_amount + ", quote_ask_source=" + this.quote_ask_source + ", quote_bid_source=" + this.quote_bid_source + ", quote_updated_at=" + this.quote_updated_at + ", monetization_model=" + this.monetization_model + ", fee_ratio=" + this.fee_ratio + ", initiator_type=" + this.initiator_type + ", is_auto_send=" + this.is_auto_send + ", replacing_order_id=" + this.replacing_order_id + ", is_replacing_order=" + this.is_replacing_order + ", masked_ref_id=" + this.masked_ref_id + ")";
        }

        /* compiled from: CryptoOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoOrderPayloadDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, CryptoOrderContextDto.CryptoOrderTypeDto cryptoOrderTypeDto, String str6, String str7, String str8, Instant instant, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, InitiatorTypeDto initiatorTypeDto, boolean z, String str9, boolean z2, String str10, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.currency_pair_id = "";
            } else {
                this.currency_pair_id = str3;
            }
            if ((i & 8) == 0) {
                this.price = "";
            } else {
                this.price = str4;
            }
            if ((i & 16) == 0) {
                this.quantity = "";
            } else {
                this.quantity = str5;
            }
            if ((i & 32) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 64) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 128) == 0) {
                this.type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = orderTypeDto;
            }
            if ((i & 256) == 0) {
                this.orderType = CryptoOrderContextDto.CryptoOrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.orderType = cryptoOrderTypeDto;
            }
            if ((i & 512) == 0) {
                this.entered_amount = "";
            } else {
                this.entered_amount = str6;
            }
            if ((i & 1024) == 0) {
                this.quote_ask_source = "";
            } else {
                this.quote_ask_source = str7;
            }
            if ((i & 2048) == 0) {
                this.quote_bid_source = "";
            } else {
                this.quote_bid_source = str8;
            }
            this.quote_updated_at = (i & 4096) == 0 ? null : instant;
            this.monetization_model = (i & 8192) == 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto;
            this.fee_ratio = (i & 16384) == 0 ? new IdlDecimal("") : idlDecimal;
            this.initiator_type = (32768 & i) == 0 ? InitiatorTypeDto.INSTANCE.getZeroValue() : initiatorTypeDto;
            if ((65536 & i) == 0) {
                this.is_auto_send = false;
            } else {
                this.is_auto_send = z;
            }
            if ((131072 & i) == 0) {
                this.replacing_order_id = "";
            } else {
                this.replacing_order_id = str9;
            }
            if ((262144 & i) == 0) {
                this.is_replacing_order = false;
            } else {
                this.is_replacing_order = z2;
            }
            if ((i & 524288) == 0) {
                this.masked_ref_id = "";
            } else {
                this.masked_ref_id = str10;
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
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.currency_pair_id);
            }
            if (!Intrinsics.areEqual(self.price, "")) {
                output.encodeStringElement(serialDesc, 3, self.price);
            }
            if (!Intrinsics.areEqual(self.quantity, "")) {
                output.encodeStringElement(serialDesc, 4, self.quantity);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SideDto.Serializer.INSTANCE, self.side);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.orderType != CryptoOrderContextDto.CryptoOrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, CryptoOrderContextDto.CryptoOrderTypeDto.Serializer.INSTANCE, self.orderType);
            }
            if (!Intrinsics.areEqual(self.entered_amount, "")) {
                output.encodeStringElement(serialDesc, 9, self.entered_amount);
            }
            if (!Intrinsics.areEqual(self.quote_ask_source, "")) {
                output.encodeStringElement(serialDesc, 10, self.quote_ask_source);
            }
            if (!Intrinsics.areEqual(self.quote_bid_source, "")) {
                output.encodeStringElement(serialDesc, 11, self.quote_bid_source);
            }
            Instant instant = self.quote_updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.monetization_model != MonetizationModelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, MonetizationModelDto.Serializer.INSTANCE, self.monetization_model);
            }
            if (!Intrinsics.areEqual(self.fee_ratio, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 14, IdlDecimalSerializer.INSTANCE, self.fee_ratio);
            }
            if (self.initiator_type != InitiatorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 15, InitiatorTypeDto.Serializer.INSTANCE, self.initiator_type);
            }
            boolean z = self.is_auto_send;
            if (z) {
                output.encodeBooleanElement(serialDesc, 16, z);
            }
            if (!Intrinsics.areEqual(self.replacing_order_id, "")) {
                output.encodeStringElement(serialDesc, 17, self.replacing_order_id);
            }
            boolean z2 = self.is_replacing_order;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 18, z2);
            }
            if (Intrinsics.areEqual(self.masked_ref_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 19, self.masked_ref_id);
        }

        public Surrogate(String ref_id, String account_id, String currency_pair_id, String price, String quantity, SideDto side, TimeInForceDto time_in_force, OrderTypeDto type2, CryptoOrderContextDto.CryptoOrderTypeDto orderType, String entered_amount, String quote_ask_source, String quote_bid_source, Instant instant, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, InitiatorTypeDto initiator_type, boolean z, String replacing_order_id, boolean z2, String masked_ref_id) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
            Intrinsics.checkNotNullParameter(quote_ask_source, "quote_ask_source");
            Intrinsics.checkNotNullParameter(quote_bid_source, "quote_bid_source");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
            Intrinsics.checkNotNullParameter(replacing_order_id, "replacing_order_id");
            Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
            this.ref_id = ref_id;
            this.account_id = account_id;
            this.currency_pair_id = currency_pair_id;
            this.price = price;
            this.quantity = quantity;
            this.side = side;
            this.time_in_force = time_in_force;
            this.type = type2;
            this.orderType = orderType;
            this.entered_amount = entered_amount;
            this.quote_ask_source = quote_ask_source;
            this.quote_bid_source = quote_bid_source;
            this.quote_updated_at = instant;
            this.monetization_model = monetization_model;
            this.fee_ratio = fee_ratio;
            this.initiator_type = initiator_type;
            this.is_auto_send = z;
            this.replacing_order_id = replacing_order_id;
            this.is_replacing_order = z2;
            this.masked_ref_id = masked_ref_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, SideDto sideDto, TimeInForceDto timeInForceDto, OrderTypeDto orderTypeDto, CryptoOrderContextDto.CryptoOrderTypeDto cryptoOrderTypeDto, String str6, String str7, String str8, Instant instant, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, InitiatorTypeDto initiatorTypeDto, boolean z, String str9, boolean z2, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 256) != 0 ? CryptoOrderContextDto.CryptoOrderTypeDto.INSTANCE.getZeroValue() : cryptoOrderTypeDto, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? null : instant, (i & 8192) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 16384) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32768) != 0 ? InitiatorTypeDto.INSTANCE.getZeroValue() : initiatorTypeDto, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? "" : str9, (i & 262144) == 0 ? z2 : false, (i & 524288) != 0 ? "" : str10);
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public final String getPrice() {
            return this.price;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final CryptoOrderContextDto.CryptoOrderTypeDto getOrderType() {
            return this.orderType;
        }

        public final String getEntered_amount() {
            return this.entered_amount;
        }

        public final String getQuote_ask_source() {
            return this.quote_ask_source;
        }

        public final String getQuote_bid_source() {
            return this.quote_bid_source;
        }

        public final Instant getQuote_updated_at() {
            return this.quote_updated_at;
        }

        public final MonetizationModelDto getMonetization_model() {
            return this.monetization_model;
        }

        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        public final InitiatorTypeDto getInitiator_type() {
            return this.initiator_type;
        }

        public final boolean is_auto_send() {
            return this.is_auto_send;
        }

        public final String getReplacing_order_id() {
            return this.replacing_order_id;
        }

        public final boolean is_replacing_order() {
            return this.is_replacing_order;
        }

        public final String getMasked_ref_id() {
            return this.masked_ref_id;
        }
    }

    /* compiled from: CryptoOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CryptoOrderPayloadDto, CryptoOrderPayload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoOrderPayloadDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderPayloadDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderPayloadDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoOrderPayloadDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoOrderPayload> getProtoAdapter() {
            return CryptoOrderPayload.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderPayloadDto getZeroValue() {
            return CryptoOrderPayloadDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderPayloadDto fromProto(CryptoOrderPayload proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CryptoOrderPayloadDto(new Surrogate(proto.getRef_id(), proto.getAccount_id(), proto.getCurrency_pair_id(), proto.getPrice(), proto.getQuantity(), SideDto.INSTANCE.fromProto(proto.getSide()), TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force()), OrderTypeDto.INSTANCE.fromProto(proto.getType()), CryptoOrderContextDto.CryptoOrderTypeDto.INSTANCE.fromProto(proto.getOrderType()), proto.getEntered_amount(), proto.getQuote_ask_source(), proto.getQuote_bid_source(), proto.getQuote_updated_at(), MonetizationModelDto.INSTANCE.fromProto(proto.getMonetization_model()), new IdlDecimal(proto.getFee_ratio()), InitiatorTypeDto.INSTANCE.fromProto(proto.getInitiator_type()), proto.getIs_auto_send(), proto.getReplacing_order_id(), proto.getIs_replacing_order(), proto.getMasked_ref_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderPayloadDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderPayloadDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoOrderPayloadDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 1048575, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoOrderPayloadDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoOrderPayload", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoOrderPayloadDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoOrderPayloadDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoOrderPayloadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayloadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoOrderPayloadDto";
        }
    }
}
