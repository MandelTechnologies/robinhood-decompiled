package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.CryptoOrderContextDto;
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
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.MonetizationModelDto;
import rosetta.order.Side;
import rosetta.order.SideDto;

/* compiled from: CryptoOrderContextDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007NOPQRSTB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÇ\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010#JÄ\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u0010J\b\u0010@\u001a\u00020\u0002H\u0016J\b\u0010A\u001a\u00020\rH\u0016J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0096\u0002J\b\u0010F\u001a\u00020GH\u0016J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020GH\u0016J\b\u0010M\u001a\u00020GH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u0010)R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010)R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b1\u0010,R\u0011\u0010\u0016\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b3\u0010,R\u0011\u0010\u0018\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0011\u0010\u0019\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b5\u0010,R\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b6\u0010,R\u0011\u0010\u001b\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b7\u0010,R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\"\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b>\u0010,¨\u0006U"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Surrogate;)V", "order_type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "order_side", "Lrosetta/order/SideDto;", "currency_pair_id", "", "ref_id", "buying_power", "", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "asset_currency_code", "quote_currency_code", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "buying_selling_power", "amount_entered", "quantity", "total_native_amount", "spread", "new_coin_position", "order_state", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "monetization_model", "Lrosetta/nummus/MonetizationModelDto;", "fee_ratio", "Lcom/robinhood/idl/IdlDecimal;", "limit_price", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;Ljava/lang/String;Ljava/lang/String;DDDDDDDLcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;D)V", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "getOrder_side", "()Lrosetta/order/SideDto;", "getCurrency_pair_id", "()Ljava/lang/String;", "getRef_id", "getBuying_power", "()D", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "getAsset_currency_code", "getQuote_currency_code", "getPrice", "getBuying_selling_power", "getAmount_entered", "getQuantity", "getTotal_native_amount", "getSpread", "getNew_coin_position", "getOrder_state", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getLimit_price", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EntryTypeDto", "CryptoOrderTypeDto", "CryptoOrderStateDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoOrderContextDto implements Dto3<CryptoOrderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoOrderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderContextDto, CryptoOrderContext>> binaryBase64Serializer$delegate;
    private static final CryptoOrderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoOrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoOrderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CryptoOrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final SideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final String getCurrency_pair_id() {
        return this.surrogate.getCurrency_pair_id();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final double getBuying_power() {
        return this.surrogate.getBuying_power();
    }

    public final EntryTypeDto getEntry_type() {
        return this.surrogate.getEntry_type();
    }

    public final String getAsset_currency_code() {
        return this.surrogate.getAsset_currency_code();
    }

    public final String getQuote_currency_code() {
        return this.surrogate.getQuote_currency_code();
    }

    public final double getPrice() {
        return this.surrogate.getPrice();
    }

    public final double getBuying_selling_power() {
        return this.surrogate.getBuying_selling_power();
    }

    public final double getAmount_entered() {
        return this.surrogate.getAmount_entered();
    }

    public final double getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final double getTotal_native_amount() {
        return this.surrogate.getTotal_native_amount();
    }

    public final double getSpread() {
        return this.surrogate.getSpread();
    }

    public final double getNew_coin_position() {
        return this.surrogate.getNew_coin_position();
    }

    public final CryptoOrderStateDto getOrder_state() {
        return this.surrogate.getOrder_state();
    }

    public final MonetizationModelDto getMonetization_model() {
        return this.surrogate.getMonetization_model();
    }

    public final IdlDecimal getFee_ratio() {
        return this.surrogate.getFee_ratio();
    }

    public final double getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public /* synthetic */ CryptoOrderContextDto(CryptoOrderTypeDto cryptoOrderTypeDto, SideDto sideDto, String str, String str2, double d, EntryTypeDto entryTypeDto, String str3, String str4, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderStateDto cryptoOrderStateDto, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, double d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CryptoOrderTypeDto.INSTANCE.getZeroValue() : cryptoOrderTypeDto, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? EntryTypeDto.INSTANCE.getZeroValue() : entryTypeDto, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? 0.0d : d2, (i & 512) != 0 ? 0.0d : d3, (i & 1024) != 0 ? 0.0d : d4, (i & 2048) != 0 ? 0.0d : d5, (i & 4096) != 0 ? 0.0d : d6, (i & 8192) != 0 ? 0.0d : d7, (i & 16384) != 0 ? 0.0d : d8, (32768 & i) != 0 ? CryptoOrderStateDto.INSTANCE.getZeroValue() : cryptoOrderStateDto, (i & 65536) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 131072) != 0 ? new IdlDecimal("") : idlDecimal, (i & 262144) != 0 ? 0.0d : d9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoOrderContextDto(CryptoOrderTypeDto order_type, SideDto order_side, String currency_pair_id, String ref_id, double d, EntryTypeDto entry_type, String asset_currency_code, String quote_currency_code, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderStateDto order_state, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, double d9) {
        this(new Surrogate(order_type, order_side, currency_pair_id, ref_id, d, entry_type, asset_currency_code, quote_currency_code, d2, d3, d4, d5, d6, d7, d8, order_state, monetization_model, fee_ratio, d9));
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
    }

    public static /* synthetic */ CryptoOrderContextDto copy$default(CryptoOrderContextDto cryptoOrderContextDto, CryptoOrderTypeDto cryptoOrderTypeDto, SideDto sideDto, String str, String str2, double d, EntryTypeDto entryTypeDto, String str3, String str4, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderStateDto cryptoOrderStateDto, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, double d9, int i, Object obj) {
        double limit_price;
        IdlDecimal idlDecimal2;
        CryptoOrderTypeDto order_type = (i & 1) != 0 ? cryptoOrderContextDto.surrogate.getOrder_type() : cryptoOrderTypeDto;
        SideDto order_side = (i & 2) != 0 ? cryptoOrderContextDto.surrogate.getOrder_side() : sideDto;
        String currency_pair_id = (i & 4) != 0 ? cryptoOrderContextDto.surrogate.getCurrency_pair_id() : str;
        String ref_id = (i & 8) != 0 ? cryptoOrderContextDto.surrogate.getRef_id() : str2;
        double buying_power = (i & 16) != 0 ? cryptoOrderContextDto.surrogate.getBuying_power() : d;
        EntryTypeDto entry_type = (i & 32) != 0 ? cryptoOrderContextDto.surrogate.getEntry_type() : entryTypeDto;
        String asset_currency_code = (i & 64) != 0 ? cryptoOrderContextDto.surrogate.getAsset_currency_code() : str3;
        String quote_currency_code = (i & 128) != 0 ? cryptoOrderContextDto.surrogate.getQuote_currency_code() : str4;
        double price = (i & 256) != 0 ? cryptoOrderContextDto.surrogate.getPrice() : d2;
        double buying_selling_power = (i & 512) != 0 ? cryptoOrderContextDto.surrogate.getBuying_selling_power() : d3;
        double amount_entered = (i & 1024) != 0 ? cryptoOrderContextDto.surrogate.getAmount_entered() : d4;
        CryptoOrderTypeDto cryptoOrderTypeDto2 = order_type;
        double quantity = (i & 2048) != 0 ? cryptoOrderContextDto.surrogate.getQuantity() : d5;
        double total_native_amount = (i & 4096) != 0 ? cryptoOrderContextDto.surrogate.getTotal_native_amount() : d6;
        double spread = (i & 8192) != 0 ? cryptoOrderContextDto.surrogate.getSpread() : d7;
        double new_coin_position = (i & 16384) != 0 ? cryptoOrderContextDto.surrogate.getNew_coin_position() : d8;
        CryptoOrderStateDto order_state = (32768 & i) != 0 ? cryptoOrderContextDto.surrogate.getOrder_state() : cryptoOrderStateDto;
        MonetizationModelDto monetization_model = (i & 65536) != 0 ? cryptoOrderContextDto.surrogate.getMonetization_model() : monetizationModelDto;
        IdlDecimal fee_ratio = (i & 131072) != 0 ? cryptoOrderContextDto.surrogate.getFee_ratio() : idlDecimal;
        if ((i & 262144) != 0) {
            idlDecimal2 = fee_ratio;
            limit_price = cryptoOrderContextDto.surrogate.getLimit_price();
        } else {
            limit_price = d9;
            idlDecimal2 = fee_ratio;
        }
        return cryptoOrderContextDto.copy(cryptoOrderTypeDto2, order_side, currency_pair_id, ref_id, buying_power, entry_type, asset_currency_code, quote_currency_code, price, buying_selling_power, amount_entered, quantity, total_native_amount, spread, new_coin_position, order_state, monetization_model, idlDecimal2, limit_price);
    }

    public final CryptoOrderContextDto copy(CryptoOrderTypeDto order_type, SideDto order_side, String currency_pair_id, String ref_id, double buying_power, EntryTypeDto entry_type, String asset_currency_code, String quote_currency_code, double price, double buying_selling_power, double amount_entered, double quantity, double total_native_amount, double spread, double new_coin_position, CryptoOrderStateDto order_state, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, double limit_price) {
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        return new CryptoOrderContextDto(new Surrogate(order_type, order_side, currency_pair_id, ref_id, buying_power, entry_type, asset_currency_code, quote_currency_code, price, buying_selling_power, amount_entered, quantity, total_native_amount, spread, new_coin_position, order_state, monetization_model, fee_ratio, limit_price));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoOrderContext toProto() {
        return new CryptoOrderContext((CryptoOrderContext.CryptoOrderType) this.surrogate.getOrder_type().toProto(), (Side) this.surrogate.getOrder_side().toProto(), this.surrogate.getCurrency_pair_id(), this.surrogate.getRef_id(), this.surrogate.getBuying_power(), (CryptoOrderContext.EntryType) this.surrogate.getEntry_type().toProto(), this.surrogate.getAsset_currency_code(), this.surrogate.getQuote_currency_code(), this.surrogate.getPrice(), this.surrogate.getBuying_selling_power(), this.surrogate.getAmount_entered(), this.surrogate.getQuantity(), this.surrogate.getTotal_native_amount(), this.surrogate.getSpread(), this.surrogate.getNew_coin_position(), (CryptoOrderContext.CryptoOrderState) this.surrogate.getOrder_state().toProto(), (MonetizationModel) this.surrogate.getMonetization_model().toProto(), this.surrogate.getFee_ratio().getStringValue(), this.surrogate.getLimit_price(), null, 524288, null);
    }

    public String toString() {
        return "[CryptoOrderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoOrderContextDto) && Intrinsics.areEqual(((CryptoOrderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 y2\u00020\u0001:\u0002xyBÛ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\u001e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001f\u0012\u0017\b\u0002\u0010 \u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b!\u0010\"BÇ\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020$\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\n\u0012\b\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0004\b!\u0010'J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\u0018\u0010[\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010\\\u001a\u00020\u000fHÆ\u0003J\t\u0010]\u001a\u00020\u0007HÆ\u0003J\t\u0010^\u001a\u00020\u0007HÆ\u0003J\u0018\u0010_\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010`\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010a\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010b\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010c\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010d\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010f\u001a\u00020\u001aHÆ\u0003J\t\u0010g\u001a\u00020\u001cHÆ\u0003J\u0018\u0010h\u001a\u00110\u001e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001fHÆ\u0003J\u0018\u0010i\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003JÝ\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u0017\b\u0002\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0015\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\b\u0002\u0010\u001d\u001a\u00110\u001e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001f2\u0017\b\u0002\u0010 \u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001J\u0013\u0010k\u001a\u00020l2\b\u0010m\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010n\u001a\u00020$HÖ\u0001J\t\u0010o\u001a\u00020\u0007HÖ\u0001J%\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\u00002\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020vH\u0001¢\u0006\u0002\bwR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010)\u001a\u0004\b-\u0010.R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010)\u001a\u0004\b0\u00101R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010)\u001a\u0004\b3\u00101R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010)\u001a\u0004\b5\u00106R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010)\u001a\u0004\b8\u00109R\u001c\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010)\u001a\u0004\b;\u00101R\u001c\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010)\u001a\u0004\b=\u00101R+\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010)\u001a\u0004\b?\u00106R+\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010)\u001a\u0004\bA\u00106R+\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010)\u001a\u0004\bC\u00106R+\u0010\u0015\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010)\u001a\u0004\bE\u00106R+\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010)\u001a\u0004\bG\u00106R+\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010)\u001a\u0004\bI\u00106R+\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010)\u001a\u0004\bK\u00106R\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010)\u001a\u0004\bM\u0010NR\u001c\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010)\u001a\u0004\bP\u0010QR+\u0010\u001d\u001a\u00110\u001e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010)\u001a\u0004\bS\u0010TR+\u0010 \u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010)\u001a\u0004\bV\u00106¨\u0006z"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Surrogate;", "", "order_type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "order_side", "Lrosetta/order/SideDto;", "currency_pair_id", "", "ref_id", "buying_power", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "asset_currency_code", "quote_currency_code", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "buying_selling_power", "amount_entered", "quantity", "total_native_amount", "spread", "new_coin_position", "order_state", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "monetization_model", "Lrosetta/nummus/MonetizationModelDto;", "fee_ratio", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "limit_price", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;Ljava/lang/String;Ljava/lang/String;DDDDDDDLcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;Ljava/lang/String;Ljava/lang/String;DDDDDDDLcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;Lrosetta/nummus/MonetizationModelDto;Lcom/robinhood/idl/IdlDecimal;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_type$annotations", "()V", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "getOrder_side$annotations", "getOrder_side", "()Lrosetta/order/SideDto;", "getCurrency_pair_id$annotations", "getCurrency_pair_id", "()Ljava/lang/String;", "getRef_id$annotations", "getRef_id", "getBuying_power$annotations", "getBuying_power", "()D", "getEntry_type$annotations", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "getAsset_currency_code$annotations", "getAsset_currency_code", "getQuote_currency_code$annotations", "getQuote_currency_code", "getPrice$annotations", "getPrice", "getBuying_selling_power$annotations", "getBuying_selling_power", "getAmount_entered$annotations", "getAmount_entered", "getQuantity$annotations", "getQuantity", "getTotal_native_amount$annotations", "getTotal_native_amount", "getSpread$annotations", "getSpread", "getNew_coin_position$annotations", "getNew_coin_position", "getOrder_state$annotations", "getOrder_state", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "getMonetization_model$annotations", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getFee_ratio$annotations", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getLimit_price$annotations", "getLimit_price", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double amount_entered;
        private final String asset_currency_code;
        private final double buying_power;
        private final double buying_selling_power;
        private final String currency_pair_id;
        private final EntryTypeDto entry_type;
        private final IdlDecimal fee_ratio;
        private final double limit_price;
        private final MonetizationModelDto monetization_model;
        private final double new_coin_position;
        private final SideDto order_side;
        private final CryptoOrderStateDto order_state;
        private final CryptoOrderTypeDto order_type;
        private final double price;
        private final double quantity;
        private final String quote_currency_code;
        private final String ref_id;
        private final double spread;
        private final double total_native_amount;

        public Surrogate() {
            this((CryptoOrderTypeDto) null, (SideDto) null, (String) null, (String) null, 0.0d, (EntryTypeDto) null, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (CryptoOrderStateDto) null, (MonetizationModelDto) null, (IdlDecimal) null, 0.0d, 524287, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CryptoOrderTypeDto cryptoOrderTypeDto, SideDto sideDto, String str, String str2, double d, EntryTypeDto entryTypeDto, String str3, String str4, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderStateDto cryptoOrderStateDto, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, double d9, int i, Object obj) {
            double d10;
            IdlDecimal idlDecimal2;
            CryptoOrderTypeDto cryptoOrderTypeDto2 = (i & 1) != 0 ? surrogate.order_type : cryptoOrderTypeDto;
            SideDto sideDto2 = (i & 2) != 0 ? surrogate.order_side : sideDto;
            String str5 = (i & 4) != 0 ? surrogate.currency_pair_id : str;
            String str6 = (i & 8) != 0 ? surrogate.ref_id : str2;
            double d11 = (i & 16) != 0 ? surrogate.buying_power : d;
            EntryTypeDto entryTypeDto2 = (i & 32) != 0 ? surrogate.entry_type : entryTypeDto;
            String str7 = (i & 64) != 0 ? surrogate.asset_currency_code : str3;
            String str8 = (i & 128) != 0 ? surrogate.quote_currency_code : str4;
            double d12 = (i & 256) != 0 ? surrogate.price : d2;
            double d13 = (i & 512) != 0 ? surrogate.buying_selling_power : d3;
            CryptoOrderTypeDto cryptoOrderTypeDto3 = cryptoOrderTypeDto2;
            SideDto sideDto3 = sideDto2;
            double d14 = (i & 1024) != 0 ? surrogate.amount_entered : d4;
            double d15 = (i & 2048) != 0 ? surrogate.quantity : d5;
            double d16 = (i & 4096) != 0 ? surrogate.total_native_amount : d6;
            double d17 = (i & 8192) != 0 ? surrogate.spread : d7;
            double d18 = (i & 16384) != 0 ? surrogate.new_coin_position : d8;
            CryptoOrderStateDto cryptoOrderStateDto2 = (i & 32768) != 0 ? surrogate.order_state : cryptoOrderStateDto;
            MonetizationModelDto monetizationModelDto2 = (i & 65536) != 0 ? surrogate.monetization_model : monetizationModelDto;
            double d19 = d18;
            IdlDecimal idlDecimal3 = (i & 131072) != 0 ? surrogate.fee_ratio : idlDecimal;
            if ((i & 262144) != 0) {
                idlDecimal2 = idlDecimal3;
                d10 = surrogate.limit_price;
            } else {
                d10 = d9;
                idlDecimal2 = idlDecimal3;
            }
            return surrogate.copy(cryptoOrderTypeDto3, sideDto3, str5, str6, d11, entryTypeDto2, str7, str8, d12, d13, d14, d15, d16, d17, d19, cryptoOrderStateDto2, monetizationModelDto2, idlDecimal2, d10);
        }

        @SerialName("amountEntered")
        @JsonAnnotations2(names = {"amount_entered"})
        public static /* synthetic */ void getAmount_entered$annotations() {
        }

        @SerialName("assetCurrencyCode")
        @JsonAnnotations2(names = {"asset_currency_code"})
        public static /* synthetic */ void getAsset_currency_code$annotations() {
        }

        @SerialName("buyingPower")
        @JsonAnnotations2(names = {"buying_power"})
        public static /* synthetic */ void getBuying_power$annotations() {
        }

        @SerialName("buyingSellingPower")
        @JsonAnnotations2(names = {"buying_selling_power"})
        public static /* synthetic */ void getBuying_selling_power$annotations() {
        }

        @SerialName("currencyPairId")
        @JsonAnnotations2(names = {"currency_pair_id"})
        public static /* synthetic */ void getCurrency_pair_id$annotations() {
        }

        @SerialName("entryType")
        @JsonAnnotations2(names = {"entry_type"})
        public static /* synthetic */ void getEntry_type$annotations() {
        }

        @SerialName("feeRatio")
        @JsonAnnotations2(names = {"fee_ratio"})
        public static /* synthetic */ void getFee_ratio$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("monetizationModel")
        @JsonAnnotations2(names = {"monetization_model"})
        public static /* synthetic */ void getMonetization_model$annotations() {
        }

        @SerialName("newCoinPosition")
        @JsonAnnotations2(names = {"new_coin_position"})
        public static /* synthetic */ void getNew_coin_position$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        @SerialName("orderState")
        @JsonAnnotations2(names = {"order_state"})
        public static /* synthetic */ void getOrder_state$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("quoteCurrencyCode")
        @JsonAnnotations2(names = {"quote_currency_code"})
        public static /* synthetic */ void getQuote_currency_code$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("spread")
        @JsonAnnotations2(names = {"spread"})
        public static /* synthetic */ void getSpread$annotations() {
        }

        @SerialName("totalNativeAmount")
        @JsonAnnotations2(names = {"total_native_amount"})
        public static /* synthetic */ void getTotal_native_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component10, reason: from getter */
        public final double getBuying_selling_power() {
            return this.buying_selling_power;
        }

        /* renamed from: component11, reason: from getter */
        public final double getAmount_entered() {
            return this.amount_entered;
        }

        /* renamed from: component12, reason: from getter */
        public final double getQuantity() {
            return this.quantity;
        }

        /* renamed from: component13, reason: from getter */
        public final double getTotal_native_amount() {
            return this.total_native_amount;
        }

        /* renamed from: component14, reason: from getter */
        public final double getSpread() {
            return this.spread;
        }

        /* renamed from: component15, reason: from getter */
        public final double getNew_coin_position() {
            return this.new_coin_position;
        }

        /* renamed from: component16, reason: from getter */
        public final CryptoOrderStateDto getOrder_state() {
            return this.order_state;
        }

        /* renamed from: component17, reason: from getter */
        public final MonetizationModelDto getMonetization_model() {
            return this.monetization_model;
        }

        /* renamed from: component18, reason: from getter */
        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        /* renamed from: component19, reason: from getter */
        public final double getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component2, reason: from getter */
        public final SideDto getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component5, reason: from getter */
        public final double getBuying_power() {
            return this.buying_power;
        }

        /* renamed from: component6, reason: from getter */
        public final EntryTypeDto getEntry_type() {
            return this.entry_type;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        /* renamed from: component8, reason: from getter */
        public final String getQuote_currency_code() {
            return this.quote_currency_code;
        }

        /* renamed from: component9, reason: from getter */
        public final double getPrice() {
            return this.price;
        }

        public final Surrogate copy(CryptoOrderTypeDto order_type, SideDto order_side, String currency_pair_id, String ref_id, double buying_power, EntryTypeDto entry_type, String asset_currency_code, String quote_currency_code, double price, double buying_selling_power, double amount_entered, double quantity, double total_native_amount, double spread, double new_coin_position, CryptoOrderStateDto order_state, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, double limit_price) {
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            return new Surrogate(order_type, order_side, currency_pair_id, ref_id, buying_power, entry_type, asset_currency_code, quote_currency_code, price, buying_selling_power, amount_entered, quantity, total_native_amount, spread, new_coin_position, order_state, monetization_model, fee_ratio, limit_price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.order_type == surrogate.order_type && this.order_side == surrogate.order_side && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Double.compare(this.buying_power, surrogate.buying_power) == 0 && this.entry_type == surrogate.entry_type && Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && Intrinsics.areEqual(this.quote_currency_code, surrogate.quote_currency_code) && Double.compare(this.price, surrogate.price) == 0 && Double.compare(this.buying_selling_power, surrogate.buying_selling_power) == 0 && Double.compare(this.amount_entered, surrogate.amount_entered) == 0 && Double.compare(this.quantity, surrogate.quantity) == 0 && Double.compare(this.total_native_amount, surrogate.total_native_amount) == 0 && Double.compare(this.spread, surrogate.spread) == 0 && Double.compare(this.new_coin_position, surrogate.new_coin_position) == 0 && this.order_state == surrogate.order_state && this.monetization_model == surrogate.monetization_model && Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio) && Double.compare(this.limit_price, surrogate.limit_price) == 0;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((this.order_type.hashCode() * 31) + this.order_side.hashCode()) * 31) + this.currency_pair_id.hashCode()) * 31) + this.ref_id.hashCode()) * 31) + Double.hashCode(this.buying_power)) * 31) + this.entry_type.hashCode()) * 31) + this.asset_currency_code.hashCode()) * 31) + this.quote_currency_code.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.buying_selling_power)) * 31) + Double.hashCode(this.amount_entered)) * 31) + Double.hashCode(this.quantity)) * 31) + Double.hashCode(this.total_native_amount)) * 31) + Double.hashCode(this.spread)) * 31) + Double.hashCode(this.new_coin_position)) * 31) + this.order_state.hashCode()) * 31) + this.monetization_model.hashCode()) * 31) + this.fee_ratio.hashCode()) * 31) + Double.hashCode(this.limit_price);
        }

        public String toString() {
            return "Surrogate(order_type=" + this.order_type + ", order_side=" + this.order_side + ", currency_pair_id=" + this.currency_pair_id + ", ref_id=" + this.ref_id + ", buying_power=" + this.buying_power + ", entry_type=" + this.entry_type + ", asset_currency_code=" + this.asset_currency_code + ", quote_currency_code=" + this.quote_currency_code + ", price=" + this.price + ", buying_selling_power=" + this.buying_selling_power + ", amount_entered=" + this.amount_entered + ", quantity=" + this.quantity + ", total_native_amount=" + this.total_native_amount + ", spread=" + this.spread + ", new_coin_position=" + this.new_coin_position + ", order_state=" + this.order_state + ", monetization_model=" + this.monetization_model + ", fee_ratio=" + this.fee_ratio + ", limit_price=" + this.limit_price + ")";
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoOrderContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CryptoOrderTypeDto cryptoOrderTypeDto, SideDto sideDto, String str, String str2, double d, EntryTypeDto entryTypeDto, String str3, String str4, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderStateDto cryptoOrderStateDto, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, double d9, SerializationConstructorMarker serializationConstructorMarker) {
            this.order_type = (i & 1) == 0 ? CryptoOrderTypeDto.INSTANCE.getZeroValue() : cryptoOrderTypeDto;
            if ((i & 2) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
            if ((i & 4) == 0) {
                this.currency_pair_id = "";
            } else {
                this.currency_pair_id = str;
            }
            if ((i & 8) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str2;
            }
            if ((i & 16) == 0) {
                this.buying_power = 0.0d;
            } else {
                this.buying_power = d;
            }
            if ((i & 32) == 0) {
                this.entry_type = EntryTypeDto.INSTANCE.getZeroValue();
            } else {
                this.entry_type = entryTypeDto;
            }
            if ((i & 64) == 0) {
                this.asset_currency_code = "";
            } else {
                this.asset_currency_code = str3;
            }
            if ((i & 128) == 0) {
                this.quote_currency_code = "";
            } else {
                this.quote_currency_code = str4;
            }
            if ((i & 256) == 0) {
                this.price = 0.0d;
            } else {
                this.price = d2;
            }
            if ((i & 512) == 0) {
                this.buying_selling_power = 0.0d;
            } else {
                this.buying_selling_power = d3;
            }
            if ((i & 1024) == 0) {
                this.amount_entered = 0.0d;
            } else {
                this.amount_entered = d4;
            }
            if ((i & 2048) == 0) {
                this.quantity = 0.0d;
            } else {
                this.quantity = d5;
            }
            if ((i & 4096) == 0) {
                this.total_native_amount = 0.0d;
            } else {
                this.total_native_amount = d6;
            }
            if ((i & 8192) == 0) {
                this.spread = 0.0d;
            } else {
                this.spread = d7;
            }
            if ((i & 16384) == 0) {
                this.new_coin_position = 0.0d;
            } else {
                this.new_coin_position = d8;
            }
            this.order_state = (32768 & i) == 0 ? CryptoOrderStateDto.INSTANCE.getZeroValue() : cryptoOrderStateDto;
            this.monetization_model = (65536 & i) == 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto;
            this.fee_ratio = (131072 & i) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 262144) == 0) {
                this.limit_price = 0.0d;
            } else {
                this.limit_price = d9;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.order_type != CryptoOrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CryptoOrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, self.order_side);
            }
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.currency_pair_id);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.ref_id);
            }
            if (Double.compare(self.buying_power, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.buying_power));
            }
            if (self.entry_type != EntryTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, EntryTypeDto.Serializer.INSTANCE, self.entry_type);
            }
            if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                output.encodeStringElement(serialDesc, 6, self.asset_currency_code);
            }
            if (!Intrinsics.areEqual(self.quote_currency_code, "")) {
                output.encodeStringElement(serialDesc, 7, self.quote_currency_code);
            }
            if (Double.compare(self.price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.price));
            }
            if (Double.compare(self.buying_selling_power, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 9, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.buying_selling_power));
            }
            if (Double.compare(self.amount_entered, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 10, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount_entered));
            }
            if (Double.compare(self.quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 11, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.quantity));
            }
            if (Double.compare(self.total_native_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 12, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_native_amount));
            }
            if (Double.compare(self.spread, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 13, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.spread));
            }
            if (Double.compare(self.new_coin_position, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 14, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.new_coin_position));
            }
            if (self.order_state != CryptoOrderStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 15, CryptoOrderStateDto.Serializer.INSTANCE, self.order_state);
            }
            if (self.monetization_model != MonetizationModelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, MonetizationModelDto.Serializer.INSTANCE, self.monetization_model);
            }
            if (!Intrinsics.areEqual(self.fee_ratio, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 17, IdlDecimalSerializer.INSTANCE, self.fee_ratio);
            }
            if (Double.compare(self.limit_price, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 18, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.limit_price));
            }
        }

        public Surrogate(CryptoOrderTypeDto order_type, SideDto order_side, String currency_pair_id, String ref_id, double d, EntryTypeDto entry_type, String asset_currency_code, String quote_currency_code, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderStateDto order_state, MonetizationModelDto monetization_model, IdlDecimal fee_ratio, double d9) {
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            this.order_type = order_type;
            this.order_side = order_side;
            this.currency_pair_id = currency_pair_id;
            this.ref_id = ref_id;
            this.buying_power = d;
            this.entry_type = entry_type;
            this.asset_currency_code = asset_currency_code;
            this.quote_currency_code = quote_currency_code;
            this.price = d2;
            this.buying_selling_power = d3;
            this.amount_entered = d4;
            this.quantity = d5;
            this.total_native_amount = d6;
            this.spread = d7;
            this.new_coin_position = d8;
            this.order_state = order_state;
            this.monetization_model = monetization_model;
            this.fee_ratio = fee_ratio;
            this.limit_price = d9;
        }

        public final CryptoOrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public /* synthetic */ Surrogate(CryptoOrderTypeDto cryptoOrderTypeDto, SideDto sideDto, String str, String str2, double d, EntryTypeDto entryTypeDto, String str3, String str4, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderStateDto cryptoOrderStateDto, MonetizationModelDto monetizationModelDto, IdlDecimal idlDecimal, double d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CryptoOrderTypeDto.INSTANCE.getZeroValue() : cryptoOrderTypeDto, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? EntryTypeDto.INSTANCE.getZeroValue() : entryTypeDto, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? 0.0d : d2, (i & 512) != 0 ? 0.0d : d3, (i & 1024) != 0 ? 0.0d : d4, (i & 2048) != 0 ? 0.0d : d5, (i & 4096) != 0 ? 0.0d : d6, (i & 8192) != 0 ? 0.0d : d7, (i & 16384) != 0 ? 0.0d : d8, (32768 & i) != 0 ? CryptoOrderStateDto.INSTANCE.getZeroValue() : cryptoOrderStateDto, (i & 65536) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 131072) != 0 ? new IdlDecimal("") : idlDecimal, (i & 262144) != 0 ? 0.0d : d9);
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final double getBuying_power() {
            return this.buying_power;
        }

        public final EntryTypeDto getEntry_type() {
            return this.entry_type;
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public final String getQuote_currency_code() {
            return this.quote_currency_code;
        }

        public final double getPrice() {
            return this.price;
        }

        public final double getBuying_selling_power() {
            return this.buying_selling_power;
        }

        public final double getAmount_entered() {
            return this.amount_entered;
        }

        public final double getQuantity() {
            return this.quantity;
        }

        public final double getTotal_native_amount() {
            return this.total_native_amount;
        }

        public final double getSpread() {
            return this.spread;
        }

        public final double getNew_coin_position() {
            return this.new_coin_position;
        }

        public final CryptoOrderStateDto getOrder_state() {
            return this.order_state;
        }

        public final MonetizationModelDto getMonetization_model() {
            return this.monetization_model;
        }

        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        public final double getLimit_price() {
            return this.limit_price;
        }
    }

    /* compiled from: CryptoOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CryptoOrderContextDto, CryptoOrderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoOrderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoOrderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoOrderContext> getProtoAdapter() {
            return CryptoOrderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderContextDto getZeroValue() {
            return CryptoOrderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderContextDto fromProto(CryptoOrderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CryptoOrderContextDto(new Surrogate(CryptoOrderTypeDto.INSTANCE.fromProto(proto.getOrder_type()), SideDto.INSTANCE.fromProto(proto.getOrder_side()), proto.getCurrency_pair_id(), proto.getRef_id(), proto.getBuying_power(), EntryTypeDto.INSTANCE.fromProto(proto.getEntry_type()), proto.getAsset_currency_code(), proto.getQuote_currency_code(), proto.getPrice(), proto.getBuying_selling_power(), proto.getAmount_entered(), proto.getQuantity(), proto.getTotal_native_amount(), proto.getSpread(), proto.getNew_coin_position(), CryptoOrderStateDto.INSTANCE.fromProto(proto.getOrder_state()), MonetizationModelDto.INSTANCE.fromProto(proto.getMonetization_model()), new IdlDecimal(proto.getFee_ratio()), proto.getLimit_price()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoOrderContextDto(null, null, null, null, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_TYPE_UNSPECIFIED", "ASSET", "QUOTE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryTypeDto implements Dto2<CryptoOrderContext.EntryType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryTypeDto, CryptoOrderContext.EntryType>> binaryBase64Serializer$delegate;
        public static final EntryTypeDto ENTRY_TYPE_UNSPECIFIED = new ENTRY_TYPE_UNSPECIFIED("ENTRY_TYPE_UNSPECIFIED", 0);
        public static final EntryTypeDto ASSET = new ASSET("ASSET", 1);
        public static final EntryTypeDto QUOTE = new QUOTE("QUOTE", 2);

        private static final /* synthetic */ EntryTypeDto[] $values() {
            return new EntryTypeDto[]{ENTRY_TYPE_UNSPECIFIED, ASSET, QUOTE};
        }

        public /* synthetic */ EntryTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntryTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.EntryTypeDto.ENTRY_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_TYPE_UNSPECIFIED extends EntryTypeDto {
            ENTRY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.EntryType toProto() {
                return CryptoOrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED;
            }
        }

        private EntryTypeDto(String str, int i) {
        }

        static {
            EntryTypeDto[] entryTypeDtoArr$values = $values();
            $VALUES = entryTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContextDto$EntryTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderContextDto.EntryTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.EntryTypeDto.ASSET", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSET extends EntryTypeDto {
            ASSET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.EntryType toProto() {
                return CryptoOrderContext.EntryType.ASSET;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.EntryTypeDto.QUOTE", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUOTE extends EntryTypeDto {
            QUOTE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.EntryType toProto() {
                return CryptoOrderContext.EntryType.QUOTE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryTypeDto, CryptoOrderContext.EntryType> {

            /* compiled from: CryptoOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoOrderContext.EntryType.values().length];
                    try {
                        iArr[CryptoOrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoOrderContext.EntryType.ASSET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoOrderContext.EntryType.QUOTE.ordinal()] = 3;
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

            public final KSerializer<EntryTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) EntryTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoOrderContext.EntryType> getProtoAdapter() {
                return CryptoOrderContext.EntryType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryTypeDto getZeroValue() {
                return EntryTypeDto.ENTRY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryTypeDto fromProto(CryptoOrderContext.EntryType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EntryTypeDto.ENTRY_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return EntryTypeDto.ASSET;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return EntryTypeDto.QUOTE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$EntryTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryTypeDto, CryptoOrderContext.EntryType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoOrderContext.EntryType", EntryTypeDto.getEntries(), EntryTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntryTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntryTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntryTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntryTypeDto valueOf(String str) {
            return (EntryTypeDto) Enum.valueOf(EntryTypeDto.class, str);
        }

        public static EntryTypeDto[] values() {
            return (EntryTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_TYPE_UNSPECIFIED", "MARKET", "RECURRING", "LIMIT", "STOP_LOSS", "STOP_LIMIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CryptoOrderTypeDto implements Dto2<CryptoOrderContext.CryptoOrderType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CryptoOrderTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CryptoOrderTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderTypeDto, CryptoOrderContext.CryptoOrderType>> binaryBase64Serializer$delegate;
        public static final CryptoOrderTypeDto ORDER_TYPE_UNSPECIFIED = new ORDER_TYPE_UNSPECIFIED("ORDER_TYPE_UNSPECIFIED", 0);
        public static final CryptoOrderTypeDto MARKET = new MARKET("MARKET", 1);
        public static final CryptoOrderTypeDto RECURRING = new RECURRING("RECURRING", 2);
        public static final CryptoOrderTypeDto LIMIT = new LIMIT("LIMIT", 3);
        public static final CryptoOrderTypeDto STOP_LOSS = new STOP_LOSS("STOP_LOSS", 4);
        public static final CryptoOrderTypeDto STOP_LIMIT = new STOP_LIMIT("STOP_LIMIT", 5);

        private static final /* synthetic */ CryptoOrderTypeDto[] $values() {
            return new CryptoOrderTypeDto[]{ORDER_TYPE_UNSPECIFIED, MARKET, RECURRING, LIMIT, STOP_LOSS, STOP_LIMIT};
        }

        public /* synthetic */ CryptoOrderTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CryptoOrderTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderTypeDto.ORDER_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_TYPE_UNSPECIFIED extends CryptoOrderTypeDto {
            ORDER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderType toProto() {
                return CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED;
            }
        }

        private CryptoOrderTypeDto(String str, int i) {
        }

        static {
            CryptoOrderTypeDto[] cryptoOrderTypeDtoArr$values = $values();
            $VALUES = cryptoOrderTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cryptoOrderTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContextDto$CryptoOrderTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderContextDto.CryptoOrderTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderTypeDto.MARKET", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET extends CryptoOrderTypeDto {
            MARKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderType toProto() {
                return CryptoOrderContext.CryptoOrderType.MARKET;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderTypeDto.RECURRING", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING extends CryptoOrderTypeDto {
            RECURRING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderType toProto() {
                return CryptoOrderContext.CryptoOrderType.RECURRING;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderTypeDto.LIMIT", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIMIT extends CryptoOrderTypeDto {
            LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderType toProto() {
                return CryptoOrderContext.CryptoOrderType.LIMIT;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderTypeDto.STOP_LOSS", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOP_LOSS extends CryptoOrderTypeDto {
            STOP_LOSS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderType toProto() {
                return CryptoOrderContext.CryptoOrderType.STOP_LOSS;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderTypeDto.STOP_LIMIT", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOP_LIMIT extends CryptoOrderTypeDto {
            STOP_LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderType toProto() {
                return CryptoOrderContext.CryptoOrderType.STOP_LIMIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CryptoOrderTypeDto, CryptoOrderContext.CryptoOrderType> {

            /* compiled from: CryptoOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoOrderContext.CryptoOrderType.values().length];
                    try {
                        iArr[CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderType.MARKET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderType.RECURRING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderType.LIMIT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderType.STOP_LOSS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderType.STOP_LIMIT.ordinal()] = 6;
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

            public final KSerializer<CryptoOrderTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CryptoOrderTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoOrderContext.CryptoOrderType> getProtoAdapter() {
                return CryptoOrderContext.CryptoOrderType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderTypeDto getZeroValue() {
                return CryptoOrderTypeDto.ORDER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderTypeDto fromProto(CryptoOrderContext.CryptoOrderType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CryptoOrderTypeDto.ORDER_TYPE_UNSPECIFIED;
                    case 2:
                        return CryptoOrderTypeDto.MARKET;
                    case 3:
                        return CryptoOrderTypeDto.RECURRING;
                    case 4:
                        return CryptoOrderTypeDto.LIMIT;
                    case 5:
                        return CryptoOrderTypeDto.STOP_LOSS;
                    case 6:
                        return CryptoOrderTypeDto.STOP_LIMIT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CryptoOrderTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CryptoOrderTypeDto, CryptoOrderContext.CryptoOrderType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoOrderContext.CryptoOrderType", CryptoOrderTypeDto.getEntries(), CryptoOrderTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CryptoOrderTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CryptoOrderTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CryptoOrderTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CryptoOrderTypeDto valueOf(String str) {
            return (CryptoOrderTypeDto) Enum.valueOf(CryptoOrderTypeDto.class, str);
        }

        public static CryptoOrderTypeDto[] values() {
            return (CryptoOrderTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_STATE_UNSPECIFIED", "CANCELED", "CONFIRMED", "FAILED", "FILLED", "NEW", "PARTIALLY_FILLED", "REJECTED", "UNCONFIRMED", "VOIDED", "QUEUED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CryptoOrderStateDto implements Dto2<CryptoOrderContext.CryptoOrderState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CryptoOrderStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CryptoOrderStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderStateDto, CryptoOrderContext.CryptoOrderState>> binaryBase64Serializer$delegate;
        public static final CryptoOrderStateDto ORDER_STATE_UNSPECIFIED = new ORDER_STATE_UNSPECIFIED("ORDER_STATE_UNSPECIFIED", 0);
        public static final CryptoOrderStateDto CANCELED = new CANCELED("CANCELED", 1);
        public static final CryptoOrderStateDto CONFIRMED = new CONFIRMED("CONFIRMED", 2);
        public static final CryptoOrderStateDto FAILED = new FAILED("FAILED", 3);
        public static final CryptoOrderStateDto FILLED = new FILLED("FILLED", 4);
        public static final CryptoOrderStateDto NEW = new NEW("NEW", 5);
        public static final CryptoOrderStateDto PARTIALLY_FILLED = new PARTIALLY_FILLED("PARTIALLY_FILLED", 6);
        public static final CryptoOrderStateDto REJECTED = new REJECTED("REJECTED", 7);
        public static final CryptoOrderStateDto UNCONFIRMED = new UNCONFIRMED("UNCONFIRMED", 8);
        public static final CryptoOrderStateDto VOIDED = new VOIDED("VOIDED", 9);
        public static final CryptoOrderStateDto QUEUED = new QUEUED("QUEUED", 10);

        private static final /* synthetic */ CryptoOrderStateDto[] $values() {
            return new CryptoOrderStateDto[]{ORDER_STATE_UNSPECIFIED, CANCELED, CONFIRMED, FAILED, FILLED, NEW, PARTIALLY_FILLED, REJECTED, UNCONFIRMED, VOIDED, QUEUED};
        }

        public /* synthetic */ CryptoOrderStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CryptoOrderStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CryptoOrderStateDto(String str, int i) {
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.ORDER_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_STATE_UNSPECIFIED extends CryptoOrderStateDto {
            ORDER_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED;
            }
        }

        static {
            CryptoOrderStateDto[] cryptoOrderStateDtoArr$values = $values();
            $VALUES = cryptoOrderStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cryptoOrderStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContextDto$CryptoOrderStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderContextDto.CryptoOrderStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.CANCELED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED extends CryptoOrderStateDto {
            CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.CANCELED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.CONFIRMED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONFIRMED extends CryptoOrderStateDto {
            CONFIRMED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.CONFIRMED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends CryptoOrderStateDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.FAILED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.FILLED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FILLED extends CryptoOrderStateDto {
            FILLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.FILLED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.NEW", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW extends CryptoOrderStateDto {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.NEW;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.PARTIALLY_FILLED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PARTIALLY_FILLED extends CryptoOrderStateDto {
            PARTIALLY_FILLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.PARTIALLY_FILLED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.REJECTED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REJECTED extends CryptoOrderStateDto {
            REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.REJECTED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.UNCONFIRMED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNCONFIRMED extends CryptoOrderStateDto {
            UNCONFIRMED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.UNCONFIRMED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.VOIDED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VOIDED extends CryptoOrderStateDto {
            VOIDED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.VOIDED;
            }
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CryptoOrderContextDto.CryptoOrderStateDto.QUEUED", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class QUEUED extends CryptoOrderStateDto {
            QUEUED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CryptoOrderContext.CryptoOrderState toProto() {
                return CryptoOrderContext.CryptoOrderState.QUEUED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CryptoOrderStateDto, CryptoOrderContext.CryptoOrderState> {

            /* compiled from: CryptoOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CryptoOrderContext.CryptoOrderState.values().length];
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.CANCELED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.CONFIRMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.FAILED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.FILLED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.NEW.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.PARTIALLY_FILLED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.REJECTED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.UNCONFIRMED.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.VOIDED.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[CryptoOrderContext.CryptoOrderState.QUEUED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CryptoOrderStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoOrderStateDto> getBinaryBase64Serializer() {
                return (KSerializer) CryptoOrderStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CryptoOrderContext.CryptoOrderState> getProtoAdapter() {
                return CryptoOrderContext.CryptoOrderState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderStateDto getZeroValue() {
                return CryptoOrderStateDto.ORDER_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoOrderStateDto fromProto(CryptoOrderContext.CryptoOrderState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CryptoOrderStateDto.ORDER_STATE_UNSPECIFIED;
                    case 2:
                        return CryptoOrderStateDto.CANCELED;
                    case 3:
                        return CryptoOrderStateDto.CONFIRMED;
                    case 4:
                        return CryptoOrderStateDto.FAILED;
                    case 5:
                        return CryptoOrderStateDto.FILLED;
                    case 6:
                        return CryptoOrderStateDto.NEW;
                    case 7:
                        return CryptoOrderStateDto.PARTIALLY_FILLED;
                    case 8:
                        return CryptoOrderStateDto.REJECTED;
                    case 9:
                        return CryptoOrderStateDto.UNCONFIRMED;
                    case 10:
                        return CryptoOrderStateDto.VOIDED;
                    case 11:
                        return CryptoOrderStateDto.QUEUED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CryptoOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$CryptoOrderStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CryptoOrderStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CryptoOrderStateDto, CryptoOrderContext.CryptoOrderState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CryptoOrderContext.CryptoOrderState", CryptoOrderStateDto.getEntries(), CryptoOrderStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CryptoOrderStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CryptoOrderStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CryptoOrderStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CryptoOrderStateDto valueOf(String str) {
            return (CryptoOrderStateDto) Enum.valueOf(CryptoOrderStateDto.class, str);
        }

        public static CryptoOrderStateDto[] values() {
            return (CryptoOrderStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CryptoOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoOrderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoOrderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoOrderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoOrderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoOrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoOrderContextDto";
        }
    }
}
