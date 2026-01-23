package bff_crypto_trading.service.p018v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_crypto_trading.service.p018v1.PriceDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetCryptoTokenizedStocksOrderEntryConfigResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00047689B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bã\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\u0006\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001dH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001dH\u0016¢\u0006\u0004\b4\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105¨\u0006:"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponse;", "Landroid/os/Parcelable;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "max_buy_quantity", "max_sell_quantity", "Lbff_crypto_trading/service/v1/PriceDto;", "primary_price", "secondary_price", "buy_price_collar_percentage", "sell_price_collar_percentage", "exchange_collar_percentage", "exchange_fees_percentage", "min_sell_exchange_rate", "max_buy_exchange_rate", "Lcom/robinhood/rosetta/common/MoneyDto;", "buying_power", "sell_exchange_rate", "buy_exchange_rate", "uncollared_buy_quantity", "selling_power", "limit_order_exchange_collar_percentage", "limit_order_min_sell_exchange_rate", "limit_order_max_buy_exchange_rate", "", "limit_order_expiration_days", "limit_order_min_quantity_increment", "", "is_equity_fractional", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lbff_crypto_trading/service/v1/PriceDto;Lbff_crypto_trading/service/v1/PriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ILcom/robinhood/idl/IdlDecimal;Z)V", "toProto", "()Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetCryptoTokenizedStocksOrderEntryConfigResponseDto implements Dto3<GetCryptoTokenizedStocksOrderEntryConfigResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoTokenizedStocksOrderEntryConfigResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoTokenizedStocksOrderEntryConfigResponseDto, GetCryptoTokenizedStocksOrderEntryConfigResponse>> binaryBase64Serializer$delegate;
    private static final GetCryptoTokenizedStocksOrderEntryConfigResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoTokenizedStocksOrderEntryConfigResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoTokenizedStocksOrderEntryConfigResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetCryptoTokenizedStocksOrderEntryConfigResponseDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, PriceDto priceDto, PriceDto priceDto2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, MoneyDto moneyDto, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, MoneyDto moneyDto2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, int i, IdlDecimal idlDecimal15, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        IdlDecimal idlDecimal16 = (i2 & 1) != 0 ? new IdlDecimal("") : idlDecimal;
        this(idlDecimal16, (i2 & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 4) != 0 ? null : priceDto, (i2 & 8) != 0 ? null : priceDto2, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i2 & 32) != 0 ? new IdlDecimal("") : idlDecimal4, (i2 & 64) != 0 ? new IdlDecimal("") : idlDecimal5, (i2 & 128) != 0 ? new IdlDecimal("") : idlDecimal6, (i2 & 256) != 0 ? new IdlDecimal("") : idlDecimal7, (i2 & 512) != 0 ? new IdlDecimal("") : idlDecimal8, (i2 & 1024) != 0 ? null : moneyDto, (i2 & 2048) != 0 ? new IdlDecimal("") : idlDecimal9, (i2 & 4096) != 0 ? new IdlDecimal("") : idlDecimal10, (i2 & 8192) != 0 ? new IdlDecimal("") : idlDecimal11, (i2 & 16384) != 0 ? null : moneyDto2, (i2 & 32768) != 0 ? new IdlDecimal("") : idlDecimal12, (i2 & 65536) != 0 ? new IdlDecimal("") : idlDecimal13, (i2 & 131072) != 0 ? new IdlDecimal("") : idlDecimal14, (i2 & 262144) != 0 ? 0 : i, (i2 & 524288) != 0 ? new IdlDecimal("") : idlDecimal15, (i2 & 1048576) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCryptoTokenizedStocksOrderEntryConfigResponseDto(IdlDecimal max_buy_quantity, IdlDecimal max_sell_quantity, PriceDto priceDto, PriceDto priceDto2, IdlDecimal buy_price_collar_percentage, IdlDecimal sell_price_collar_percentage, IdlDecimal exchange_collar_percentage, IdlDecimal exchange_fees_percentage, IdlDecimal min_sell_exchange_rate, IdlDecimal max_buy_exchange_rate, MoneyDto moneyDto, IdlDecimal sell_exchange_rate, IdlDecimal buy_exchange_rate, IdlDecimal uncollared_buy_quantity, MoneyDto moneyDto2, IdlDecimal limit_order_exchange_collar_percentage, IdlDecimal limit_order_min_sell_exchange_rate, IdlDecimal limit_order_max_buy_exchange_rate, int i, IdlDecimal limit_order_min_quantity_increment, boolean z) {
        this(new Surrogate(max_buy_quantity, max_sell_quantity, priceDto, priceDto2, buy_price_collar_percentage, sell_price_collar_percentage, exchange_collar_percentage, exchange_fees_percentage, min_sell_exchange_rate, max_buy_exchange_rate, moneyDto, sell_exchange_rate, buy_exchange_rate, uncollared_buy_quantity, moneyDto2, limit_order_exchange_collar_percentage, limit_order_min_sell_exchange_rate, limit_order_max_buy_exchange_rate, i, limit_order_min_quantity_increment, z));
        Intrinsics.checkNotNullParameter(max_buy_quantity, "max_buy_quantity");
        Intrinsics.checkNotNullParameter(max_sell_quantity, "max_sell_quantity");
        Intrinsics.checkNotNullParameter(buy_price_collar_percentage, "buy_price_collar_percentage");
        Intrinsics.checkNotNullParameter(sell_price_collar_percentage, "sell_price_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_fees_percentage, "exchange_fees_percentage");
        Intrinsics.checkNotNullParameter(min_sell_exchange_rate, "min_sell_exchange_rate");
        Intrinsics.checkNotNullParameter(max_buy_exchange_rate, "max_buy_exchange_rate");
        Intrinsics.checkNotNullParameter(sell_exchange_rate, "sell_exchange_rate");
        Intrinsics.checkNotNullParameter(buy_exchange_rate, "buy_exchange_rate");
        Intrinsics.checkNotNullParameter(uncollared_buy_quantity, "uncollared_buy_quantity");
        Intrinsics.checkNotNullParameter(limit_order_exchange_collar_percentage, "limit_order_exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(limit_order_min_sell_exchange_rate, "limit_order_min_sell_exchange_rate");
        Intrinsics.checkNotNullParameter(limit_order_max_buy_exchange_rate, "limit_order_max_buy_exchange_rate");
        Intrinsics.checkNotNullParameter(limit_order_min_quantity_increment, "limit_order_min_quantity_increment");
    }

    @Override // com.robinhood.idl.Dto
    public GetCryptoTokenizedStocksOrderEntryConfigResponse toProto() {
        String stringValue = this.surrogate.getMax_buy_quantity().getStringValue();
        String stringValue2 = this.surrogate.getMax_sell_quantity().getStringValue();
        PriceDto primary_price = this.surrogate.getPrimary_price();
        Price proto = primary_price != null ? primary_price.toProto() : null;
        PriceDto secondary_price = this.surrogate.getSecondary_price();
        Price proto2 = secondary_price != null ? secondary_price.toProto() : null;
        String stringValue3 = this.surrogate.getBuy_price_collar_percentage().getStringValue();
        String stringValue4 = this.surrogate.getSell_price_collar_percentage().getStringValue();
        String stringValue5 = this.surrogate.getExchange_collar_percentage().getStringValue();
        String stringValue6 = this.surrogate.getExchange_fees_percentage().getStringValue();
        String stringValue7 = this.surrogate.getMin_sell_exchange_rate().getStringValue();
        String stringValue8 = this.surrogate.getMax_buy_exchange_rate().getStringValue();
        MoneyDto buying_power = this.surrogate.getBuying_power();
        Money proto3 = buying_power != null ? buying_power.toProto() : null;
        String stringValue9 = this.surrogate.getSell_exchange_rate().getStringValue();
        String stringValue10 = this.surrogate.getBuy_exchange_rate().getStringValue();
        String stringValue11 = this.surrogate.getUncollared_buy_quantity().getStringValue();
        MoneyDto selling_power = this.surrogate.getSelling_power();
        return new GetCryptoTokenizedStocksOrderEntryConfigResponse(stringValue, stringValue2, proto, proto2, stringValue3, stringValue4, stringValue5, stringValue6, stringValue7, stringValue8, proto3, stringValue9, stringValue10, stringValue11, selling_power != null ? selling_power.toProto() : null, this.surrogate.getLimit_order_exchange_collar_percentage().getStringValue(), this.surrogate.getLimit_order_min_sell_exchange_rate().getStringValue(), this.surrogate.getLimit_order_max_buy_exchange_rate().getStringValue(), this.surrogate.getLimit_order_expiration_days(), this.surrogate.getLimit_order_min_quantity_increment().getStringValue(), this.surrogate.getIs_equity_fractional(), null, 2097152, null);
    }

    public String toString() {
        return "[GetCryptoTokenizedStocksOrderEntryConfigResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoTokenizedStocksOrderEntryConfigResponseDto) && Intrinsics.areEqual(((GetCryptoTokenizedStocksOrderEntryConfigResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoTokenizedStocksOrderEntryConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b=\b\u0083\b\u0018\u0000 j2\u00020\u0001:\u0002kjBÑ\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\u001a¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u001b\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!Bé\u0001\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u001a\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b=\u0010;\u001a\u0004\b<\u00109R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bA\u0010;\u001a\u0004\b?\u0010@R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010@R/\u0010\u000b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\bE\u0010;\u001a\u0004\bD\u00109R/\u0010\f\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\bG\u0010;\u001a\u0004\bF\u00109R/\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\bI\u0010;\u001a\u0004\bH\u00109R/\u0010\u000e\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u00109R/\u0010\u000f\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\bM\u0010;\u001a\u0004\bL\u00109R/\u0010\u0010\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00107\u0012\u0004\bO\u0010;\u001a\u0004\bN\u00109R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010P\u0012\u0004\bS\u0010;\u001a\u0004\bQ\u0010RR/\u0010\u0013\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00107\u0012\u0004\bU\u0010;\u001a\u0004\bT\u00109R/\u0010\u0014\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u00107\u0012\u0004\bW\u0010;\u001a\u0004\bV\u00109R/\u0010\u0015\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00107\u0012\u0004\bY\u0010;\u001a\u0004\bX\u00109R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010P\u0012\u0004\b[\u0010;\u001a\u0004\bZ\u0010RR/\u0010\u0017\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00107\u0012\u0004\b]\u0010;\u001a\u0004\b\\\u00109R/\u0010\u0018\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00107\u0012\u0004\b_\u0010;\u001a\u0004\b^\u00109R/\u0010\u0019\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00107\u0012\u0004\ba\u0010;\u001a\u0004\b`\u00109R/\u0010\u001c\u001a\u00110\u001a¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010b\u0012\u0004\bd\u0010;\u001a\u0004\bc\u00103R/\u0010\u001d\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00107\u0012\u0004\bf\u0010;\u001a\u0004\be\u00109R \u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010g\u0012\u0004\bi\u0010;\u001a\u0004\b\u001f\u0010h¨\u0006l"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "max_buy_quantity", "max_sell_quantity", "Lbff_crypto_trading/service/v1/PriceDto;", "primary_price", "secondary_price", "buy_price_collar_percentage", "sell_price_collar_percentage", "exchange_collar_percentage", "exchange_fees_percentage", "min_sell_exchange_rate", "max_buy_exchange_rate", "Lcom/robinhood/rosetta/common/MoneyDto;", "buying_power", "sell_exchange_rate", "buy_exchange_rate", "uncollared_buy_quantity", "selling_power", "limit_order_exchange_collar_percentage", "limit_order_min_sell_exchange_rate", "limit_order_max_buy_exchange_rate", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "limit_order_expiration_days", "limit_order_min_quantity_increment", "", "is_equity_fractional", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lbff_crypto_trading/service/v1/PriceDto;Lbff_crypto_trading/service/v1/PriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ILcom/robinhood/idl/IdlDecimal;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lbff_crypto_trading/service/v1/PriceDto;Lbff_crypto_trading/service/v1/PriceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ILcom/robinhood/idl/IdlDecimal;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_crypto_trading_service_v1_externalRelease", "(Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getMax_buy_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getMax_buy_quantity$annotations", "()V", "getMax_sell_quantity", "getMax_sell_quantity$annotations", "Lbff_crypto_trading/service/v1/PriceDto;", "getPrimary_price", "()Lbff_crypto_trading/service/v1/PriceDto;", "getPrimary_price$annotations", "getSecondary_price", "getSecondary_price$annotations", "getBuy_price_collar_percentage", "getBuy_price_collar_percentage$annotations", "getSell_price_collar_percentage", "getSell_price_collar_percentage$annotations", "getExchange_collar_percentage", "getExchange_collar_percentage$annotations", "getExchange_fees_percentage", "getExchange_fees_percentage$annotations", "getMin_sell_exchange_rate", "getMin_sell_exchange_rate$annotations", "getMax_buy_exchange_rate", "getMax_buy_exchange_rate$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getBuying_power", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getBuying_power$annotations", "getSell_exchange_rate", "getSell_exchange_rate$annotations", "getBuy_exchange_rate", "getBuy_exchange_rate$annotations", "getUncollared_buy_quantity", "getUncollared_buy_quantity$annotations", "getSelling_power", "getSelling_power$annotations", "getLimit_order_exchange_collar_percentage", "getLimit_order_exchange_collar_percentage$annotations", "getLimit_order_min_sell_exchange_rate", "getLimit_order_min_sell_exchange_rate$annotations", "getLimit_order_max_buy_exchange_rate", "getLimit_order_max_buy_exchange_rate$annotations", "I", "getLimit_order_expiration_days", "getLimit_order_expiration_days$annotations", "getLimit_order_min_quantity_increment", "getLimit_order_min_quantity_increment$annotations", "Z", "()Z", "is_equity_fractional$annotations", "Companion", "$serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal buy_exchange_rate;
        private final IdlDecimal buy_price_collar_percentage;
        private final MoneyDto buying_power;
        private final IdlDecimal exchange_collar_percentage;
        private final IdlDecimal exchange_fees_percentage;
        private final boolean is_equity_fractional;
        private final IdlDecimal limit_order_exchange_collar_percentage;
        private final int limit_order_expiration_days;
        private final IdlDecimal limit_order_max_buy_exchange_rate;
        private final IdlDecimal limit_order_min_quantity_increment;
        private final IdlDecimal limit_order_min_sell_exchange_rate;
        private final IdlDecimal max_buy_exchange_rate;
        private final IdlDecimal max_buy_quantity;
        private final IdlDecimal max_sell_quantity;
        private final IdlDecimal min_sell_exchange_rate;
        private final PriceDto primary_price;
        private final PriceDto secondary_price;
        private final IdlDecimal sell_exchange_rate;
        private final IdlDecimal sell_price_collar_percentage;
        private final MoneyDto selling_power;
        private final IdlDecimal uncollared_buy_quantity;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (PriceDto) null, (PriceDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 0, (IdlDecimal) null, false, 2097151, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.max_buy_quantity, surrogate.max_buy_quantity) && Intrinsics.areEqual(this.max_sell_quantity, surrogate.max_sell_quantity) && Intrinsics.areEqual(this.primary_price, surrogate.primary_price) && Intrinsics.areEqual(this.secondary_price, surrogate.secondary_price) && Intrinsics.areEqual(this.buy_price_collar_percentage, surrogate.buy_price_collar_percentage) && Intrinsics.areEqual(this.sell_price_collar_percentage, surrogate.sell_price_collar_percentage) && Intrinsics.areEqual(this.exchange_collar_percentage, surrogate.exchange_collar_percentage) && Intrinsics.areEqual(this.exchange_fees_percentage, surrogate.exchange_fees_percentage) && Intrinsics.areEqual(this.min_sell_exchange_rate, surrogate.min_sell_exchange_rate) && Intrinsics.areEqual(this.max_buy_exchange_rate, surrogate.max_buy_exchange_rate) && Intrinsics.areEqual(this.buying_power, surrogate.buying_power) && Intrinsics.areEqual(this.sell_exchange_rate, surrogate.sell_exchange_rate) && Intrinsics.areEqual(this.buy_exchange_rate, surrogate.buy_exchange_rate) && Intrinsics.areEqual(this.uncollared_buy_quantity, surrogate.uncollared_buy_quantity) && Intrinsics.areEqual(this.selling_power, surrogate.selling_power) && Intrinsics.areEqual(this.limit_order_exchange_collar_percentage, surrogate.limit_order_exchange_collar_percentage) && Intrinsics.areEqual(this.limit_order_min_sell_exchange_rate, surrogate.limit_order_min_sell_exchange_rate) && Intrinsics.areEqual(this.limit_order_max_buy_exchange_rate, surrogate.limit_order_max_buy_exchange_rate) && this.limit_order_expiration_days == surrogate.limit_order_expiration_days && Intrinsics.areEqual(this.limit_order_min_quantity_increment, surrogate.limit_order_min_quantity_increment) && this.is_equity_fractional == surrogate.is_equity_fractional;
        }

        public int hashCode() {
            int iHashCode = ((this.max_buy_quantity.hashCode() * 31) + this.max_sell_quantity.hashCode()) * 31;
            PriceDto priceDto = this.primary_price;
            int iHashCode2 = (iHashCode + (priceDto == null ? 0 : priceDto.hashCode())) * 31;
            PriceDto priceDto2 = this.secondary_price;
            int iHashCode3 = (((((((((((((iHashCode2 + (priceDto2 == null ? 0 : priceDto2.hashCode())) * 31) + this.buy_price_collar_percentage.hashCode()) * 31) + this.sell_price_collar_percentage.hashCode()) * 31) + this.exchange_collar_percentage.hashCode()) * 31) + this.exchange_fees_percentage.hashCode()) * 31) + this.min_sell_exchange_rate.hashCode()) * 31) + this.max_buy_exchange_rate.hashCode()) * 31;
            MoneyDto moneyDto = this.buying_power;
            int iHashCode4 = (((((((iHashCode3 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.sell_exchange_rate.hashCode()) * 31) + this.buy_exchange_rate.hashCode()) * 31) + this.uncollared_buy_quantity.hashCode()) * 31;
            MoneyDto moneyDto2 = this.selling_power;
            return ((((((((((((iHashCode4 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.limit_order_exchange_collar_percentage.hashCode()) * 31) + this.limit_order_min_sell_exchange_rate.hashCode()) * 31) + this.limit_order_max_buy_exchange_rate.hashCode()) * 31) + Integer.hashCode(this.limit_order_expiration_days)) * 31) + this.limit_order_min_quantity_increment.hashCode()) * 31) + Boolean.hashCode(this.is_equity_fractional);
        }

        public String toString() {
            return "Surrogate(max_buy_quantity=" + this.max_buy_quantity + ", max_sell_quantity=" + this.max_sell_quantity + ", primary_price=" + this.primary_price + ", secondary_price=" + this.secondary_price + ", buy_price_collar_percentage=" + this.buy_price_collar_percentage + ", sell_price_collar_percentage=" + this.sell_price_collar_percentage + ", exchange_collar_percentage=" + this.exchange_collar_percentage + ", exchange_fees_percentage=" + this.exchange_fees_percentage + ", min_sell_exchange_rate=" + this.min_sell_exchange_rate + ", max_buy_exchange_rate=" + this.max_buy_exchange_rate + ", buying_power=" + this.buying_power + ", sell_exchange_rate=" + this.sell_exchange_rate + ", buy_exchange_rate=" + this.buy_exchange_rate + ", uncollared_buy_quantity=" + this.uncollared_buy_quantity + ", selling_power=" + this.selling_power + ", limit_order_exchange_collar_percentage=" + this.limit_order_exchange_collar_percentage + ", limit_order_min_sell_exchange_rate=" + this.limit_order_min_sell_exchange_rate + ", limit_order_max_buy_exchange_rate=" + this.limit_order_max_buy_exchange_rate + ", limit_order_expiration_days=" + this.limit_order_expiration_days + ", limit_order_min_quantity_increment=" + this.limit_order_min_quantity_increment + ", is_equity_fractional=" + this.is_equity_fractional + ")";
        }

        /* compiled from: GetCryptoTokenizedStocksOrderEntryConfigResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoTokenizedStocksOrderEntryConfigResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, PriceDto priceDto, PriceDto priceDto2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, MoneyDto moneyDto, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, MoneyDto moneyDto2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, int i2, IdlDecimal idlDecimal15, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.max_buy_quantity = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.max_sell_quantity = new IdlDecimal("");
            } else {
                this.max_sell_quantity = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.primary_price = null;
            } else {
                this.primary_price = priceDto;
            }
            if ((i & 8) == 0) {
                this.secondary_price = null;
            } else {
                this.secondary_price = priceDto2;
            }
            if ((i & 16) == 0) {
                this.buy_price_collar_percentage = new IdlDecimal("");
            } else {
                this.buy_price_collar_percentage = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.sell_price_collar_percentage = new IdlDecimal("");
            } else {
                this.sell_price_collar_percentage = idlDecimal4;
            }
            if ((i & 64) == 0) {
                this.exchange_collar_percentage = new IdlDecimal("");
            } else {
                this.exchange_collar_percentage = idlDecimal5;
            }
            if ((i & 128) == 0) {
                this.exchange_fees_percentage = new IdlDecimal("");
            } else {
                this.exchange_fees_percentage = idlDecimal6;
            }
            if ((i & 256) == 0) {
                this.min_sell_exchange_rate = new IdlDecimal("");
            } else {
                this.min_sell_exchange_rate = idlDecimal7;
            }
            if ((i & 512) == 0) {
                this.max_buy_exchange_rate = new IdlDecimal("");
            } else {
                this.max_buy_exchange_rate = idlDecimal8;
            }
            if ((i & 1024) == 0) {
                this.buying_power = null;
            } else {
                this.buying_power = moneyDto;
            }
            if ((i & 2048) == 0) {
                this.sell_exchange_rate = new IdlDecimal("");
            } else {
                this.sell_exchange_rate = idlDecimal9;
            }
            this.buy_exchange_rate = (i & 4096) == 0 ? new IdlDecimal("") : idlDecimal10;
            this.uncollared_buy_quantity = (i & 8192) == 0 ? new IdlDecimal("") : idlDecimal11;
            if ((i & 16384) == 0) {
                this.selling_power = null;
            } else {
                this.selling_power = moneyDto2;
            }
            this.limit_order_exchange_collar_percentage = (32768 & i) == 0 ? new IdlDecimal("") : idlDecimal12;
            this.limit_order_min_sell_exchange_rate = (65536 & i) == 0 ? new IdlDecimal("") : idlDecimal13;
            this.limit_order_max_buy_exchange_rate = (131072 & i) == 0 ? new IdlDecimal("") : idlDecimal14;
            if ((262144 & i) == 0) {
                this.limit_order_expiration_days = 0;
            } else {
                this.limit_order_expiration_days = i2;
            }
            this.limit_order_min_quantity_increment = (524288 & i) == 0 ? new IdlDecimal("") : idlDecimal15;
            if ((i & 1048576) == 0) {
                this.is_equity_fractional = false;
            } else {
                this.is_equity_fractional = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_crypto_trading_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.max_buy_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.max_buy_quantity);
            }
            if (!Intrinsics.areEqual(self.max_sell_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.max_sell_quantity);
            }
            PriceDto priceDto = self.primary_price;
            if (priceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, PriceDto.Serializer.INSTANCE, priceDto);
            }
            PriceDto priceDto2 = self.secondary_price;
            if (priceDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PriceDto.Serializer.INSTANCE, priceDto2);
            }
            if (!Intrinsics.areEqual(self.buy_price_collar_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.buy_price_collar_percentage);
            }
            if (!Intrinsics.areEqual(self.sell_price_collar_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.sell_price_collar_percentage);
            }
            if (!Intrinsics.areEqual(self.exchange_collar_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.exchange_collar_percentage);
            }
            if (!Intrinsics.areEqual(self.exchange_fees_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.exchange_fees_percentage);
            }
            if (!Intrinsics.areEqual(self.min_sell_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.min_sell_exchange_rate);
            }
            if (!Intrinsics.areEqual(self.max_buy_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.max_buy_exchange_rate);
            }
            MoneyDto moneyDto = self.buying_power;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.sell_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, self.sell_exchange_rate);
            }
            if (!Intrinsics.areEqual(self.buy_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, self.buy_exchange_rate);
            }
            if (!Intrinsics.areEqual(self.uncollared_buy_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 13, IdlDecimalSerializer.INSTANCE, self.uncollared_buy_quantity);
            }
            MoneyDto moneyDto2 = self.selling_power;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.limit_order_exchange_collar_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, self.limit_order_exchange_collar_percentage);
            }
            if (!Intrinsics.areEqual(self.limit_order_min_sell_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 16, IdlDecimalSerializer.INSTANCE, self.limit_order_min_sell_exchange_rate);
            }
            if (!Intrinsics.areEqual(self.limit_order_max_buy_exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 17, IdlDecimalSerializer.INSTANCE, self.limit_order_max_buy_exchange_rate);
            }
            int i = self.limit_order_expiration_days;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 18, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.limit_order_min_quantity_increment, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 19, IdlDecimalSerializer.INSTANCE, self.limit_order_min_quantity_increment);
            }
            boolean z = self.is_equity_fractional;
            if (z) {
                output.encodeBooleanElement(serialDesc, 20, z);
            }
        }

        public Surrogate(IdlDecimal max_buy_quantity, IdlDecimal max_sell_quantity, PriceDto priceDto, PriceDto priceDto2, IdlDecimal buy_price_collar_percentage, IdlDecimal sell_price_collar_percentage, IdlDecimal exchange_collar_percentage, IdlDecimal exchange_fees_percentage, IdlDecimal min_sell_exchange_rate, IdlDecimal max_buy_exchange_rate, MoneyDto moneyDto, IdlDecimal sell_exchange_rate, IdlDecimal buy_exchange_rate, IdlDecimal uncollared_buy_quantity, MoneyDto moneyDto2, IdlDecimal limit_order_exchange_collar_percentage, IdlDecimal limit_order_min_sell_exchange_rate, IdlDecimal limit_order_max_buy_exchange_rate, int i, IdlDecimal limit_order_min_quantity_increment, boolean z) {
            Intrinsics.checkNotNullParameter(max_buy_quantity, "max_buy_quantity");
            Intrinsics.checkNotNullParameter(max_sell_quantity, "max_sell_quantity");
            Intrinsics.checkNotNullParameter(buy_price_collar_percentage, "buy_price_collar_percentage");
            Intrinsics.checkNotNullParameter(sell_price_collar_percentage, "sell_price_collar_percentage");
            Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
            Intrinsics.checkNotNullParameter(exchange_fees_percentage, "exchange_fees_percentage");
            Intrinsics.checkNotNullParameter(min_sell_exchange_rate, "min_sell_exchange_rate");
            Intrinsics.checkNotNullParameter(max_buy_exchange_rate, "max_buy_exchange_rate");
            Intrinsics.checkNotNullParameter(sell_exchange_rate, "sell_exchange_rate");
            Intrinsics.checkNotNullParameter(buy_exchange_rate, "buy_exchange_rate");
            Intrinsics.checkNotNullParameter(uncollared_buy_quantity, "uncollared_buy_quantity");
            Intrinsics.checkNotNullParameter(limit_order_exchange_collar_percentage, "limit_order_exchange_collar_percentage");
            Intrinsics.checkNotNullParameter(limit_order_min_sell_exchange_rate, "limit_order_min_sell_exchange_rate");
            Intrinsics.checkNotNullParameter(limit_order_max_buy_exchange_rate, "limit_order_max_buy_exchange_rate");
            Intrinsics.checkNotNullParameter(limit_order_min_quantity_increment, "limit_order_min_quantity_increment");
            this.max_buy_quantity = max_buy_quantity;
            this.max_sell_quantity = max_sell_quantity;
            this.primary_price = priceDto;
            this.secondary_price = priceDto2;
            this.buy_price_collar_percentage = buy_price_collar_percentage;
            this.sell_price_collar_percentage = sell_price_collar_percentage;
            this.exchange_collar_percentage = exchange_collar_percentage;
            this.exchange_fees_percentage = exchange_fees_percentage;
            this.min_sell_exchange_rate = min_sell_exchange_rate;
            this.max_buy_exchange_rate = max_buy_exchange_rate;
            this.buying_power = moneyDto;
            this.sell_exchange_rate = sell_exchange_rate;
            this.buy_exchange_rate = buy_exchange_rate;
            this.uncollared_buy_quantity = uncollared_buy_quantity;
            this.selling_power = moneyDto2;
            this.limit_order_exchange_collar_percentage = limit_order_exchange_collar_percentage;
            this.limit_order_min_sell_exchange_rate = limit_order_min_sell_exchange_rate;
            this.limit_order_max_buy_exchange_rate = limit_order_max_buy_exchange_rate;
            this.limit_order_expiration_days = i;
            this.limit_order_min_quantity_increment = limit_order_min_quantity_increment;
            this.is_equity_fractional = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, PriceDto priceDto, PriceDto priceDto2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, MoneyDto moneyDto, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, IdlDecimal idlDecimal11, MoneyDto moneyDto2, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, int i, IdlDecimal idlDecimal15, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            IdlDecimal idlDecimal16 = (i2 & 1) != 0 ? new IdlDecimal("") : idlDecimal;
            this(idlDecimal16, (i2 & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 4) != 0 ? null : priceDto, (i2 & 8) != 0 ? null : priceDto2, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i2 & 32) != 0 ? new IdlDecimal("") : idlDecimal4, (i2 & 64) != 0 ? new IdlDecimal("") : idlDecimal5, (i2 & 128) != 0 ? new IdlDecimal("") : idlDecimal6, (i2 & 256) != 0 ? new IdlDecimal("") : idlDecimal7, (i2 & 512) != 0 ? new IdlDecimal("") : idlDecimal8, (i2 & 1024) != 0 ? null : moneyDto, (i2 & 2048) != 0 ? new IdlDecimal("") : idlDecimal9, (i2 & 4096) != 0 ? new IdlDecimal("") : idlDecimal10, (i2 & 8192) != 0 ? new IdlDecimal("") : idlDecimal11, (i2 & 16384) != 0 ? null : moneyDto2, (i2 & 32768) != 0 ? new IdlDecimal("") : idlDecimal12, (i2 & 65536) != 0 ? new IdlDecimal("") : idlDecimal13, (i2 & 131072) != 0 ? new IdlDecimal("") : idlDecimal14, (i2 & 262144) != 0 ? 0 : i, (i2 & 524288) != 0 ? new IdlDecimal("") : idlDecimal15, (i2 & 1048576) != 0 ? false : z);
        }

        public final IdlDecimal getMax_buy_quantity() {
            return this.max_buy_quantity;
        }

        public final IdlDecimal getMax_sell_quantity() {
            return this.max_sell_quantity;
        }

        public final PriceDto getPrimary_price() {
            return this.primary_price;
        }

        public final PriceDto getSecondary_price() {
            return this.secondary_price;
        }

        public final IdlDecimal getBuy_price_collar_percentage() {
            return this.buy_price_collar_percentage;
        }

        public final IdlDecimal getSell_price_collar_percentage() {
            return this.sell_price_collar_percentage;
        }

        public final IdlDecimal getExchange_collar_percentage() {
            return this.exchange_collar_percentage;
        }

        public final IdlDecimal getExchange_fees_percentage() {
            return this.exchange_fees_percentage;
        }

        public final IdlDecimal getMin_sell_exchange_rate() {
            return this.min_sell_exchange_rate;
        }

        public final IdlDecimal getMax_buy_exchange_rate() {
            return this.max_buy_exchange_rate;
        }

        public final MoneyDto getBuying_power() {
            return this.buying_power;
        }

        public final IdlDecimal getSell_exchange_rate() {
            return this.sell_exchange_rate;
        }

        public final IdlDecimal getBuy_exchange_rate() {
            return this.buy_exchange_rate;
        }

        public final IdlDecimal getUncollared_buy_quantity() {
            return this.uncollared_buy_quantity;
        }

        public final MoneyDto getSelling_power() {
            return this.selling_power;
        }

        public final IdlDecimal getLimit_order_exchange_collar_percentage() {
            return this.limit_order_exchange_collar_percentage;
        }

        public final IdlDecimal getLimit_order_min_sell_exchange_rate() {
            return this.limit_order_min_sell_exchange_rate;
        }

        public final IdlDecimal getLimit_order_max_buy_exchange_rate() {
            return this.limit_order_max_buy_exchange_rate;
        }

        public final int getLimit_order_expiration_days() {
            return this.limit_order_expiration_days;
        }

        public final IdlDecimal getLimit_order_min_quantity_increment() {
            return this.limit_order_min_quantity_increment;
        }

        /* renamed from: is_equity_fractional, reason: from getter */
        public final boolean getIs_equity_fractional() {
            return this.is_equity_fractional;
        }
    }

    /* compiled from: GetCryptoTokenizedStocksOrderEntryConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoTokenizedStocksOrderEntryConfigResponseDto, GetCryptoTokenizedStocksOrderEntryConfigResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoTokenizedStocksOrderEntryConfigResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoTokenizedStocksOrderEntryConfigResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoTokenizedStocksOrderEntryConfigResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoTokenizedStocksOrderEntryConfigResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoTokenizedStocksOrderEntryConfigResponse> getProtoAdapter() {
            return GetCryptoTokenizedStocksOrderEntryConfigResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoTokenizedStocksOrderEntryConfigResponseDto getZeroValue() {
            return GetCryptoTokenizedStocksOrderEntryConfigResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoTokenizedStocksOrderEntryConfigResponseDto fromProto(GetCryptoTokenizedStocksOrderEntryConfigResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getMax_buy_quantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getMax_sell_quantity());
            Price primary_price = proto.getPrimary_price();
            PriceDto priceDtoFromProto = primary_price != null ? PriceDto.INSTANCE.fromProto(primary_price) : null;
            Price secondary_price = proto.getSecondary_price();
            PriceDto priceDtoFromProto2 = secondary_price != null ? PriceDto.INSTANCE.fromProto(secondary_price) : null;
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getBuy_price_collar_percentage());
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getSell_price_collar_percentage());
            IdlDecimal idlDecimal5 = new IdlDecimal(proto.getExchange_collar_percentage());
            IdlDecimal idlDecimal6 = new IdlDecimal(proto.getExchange_fees_percentage());
            IdlDecimal idlDecimal7 = new IdlDecimal(proto.getMin_sell_exchange_rate());
            IdlDecimal idlDecimal8 = new IdlDecimal(proto.getMax_buy_exchange_rate());
            Money buying_power = proto.getBuying_power();
            MoneyDto moneyDtoFromProto = buying_power != null ? MoneyDto.INSTANCE.fromProto(buying_power) : null;
            IdlDecimal idlDecimal9 = new IdlDecimal(proto.getSell_exchange_rate());
            IdlDecimal idlDecimal10 = new IdlDecimal(proto.getBuy_exchange_rate());
            IdlDecimal idlDecimal11 = new IdlDecimal(proto.getUncollared_buy_quantity());
            Money selling_power = proto.getSelling_power();
            return new GetCryptoTokenizedStocksOrderEntryConfigResponseDto(new Surrogate(idlDecimal, idlDecimal2, priceDtoFromProto, priceDtoFromProto2, idlDecimal3, idlDecimal4, idlDecimal5, idlDecimal6, idlDecimal7, idlDecimal8, moneyDtoFromProto, idlDecimal9, idlDecimal10, idlDecimal11, selling_power != null ? MoneyDto.INSTANCE.fromProto(selling_power) : null, new IdlDecimal(proto.getLimit_order_exchange_collar_percentage()), new IdlDecimal(proto.getLimit_order_min_sell_exchange_rate()), new IdlDecimal(proto.getLimit_order_max_buy_exchange_rate()), proto.getLimit_order_expiration_days(), new IdlDecimal(proto.getLimit_order_min_quantity_increment()), proto.getIs_equity_fractional()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_crypto_trading.service.v1.GetCryptoTokenizedStocksOrderEntryConfigResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoTokenizedStocksOrderEntryConfigResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCryptoTokenizedStocksOrderEntryConfigResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, false, 2097151, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoTokenizedStocksOrderEntryConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetCryptoTokenizedStocksOrderEntryConfigResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_crypto_trading.service.v1.GetCryptoTokenizedStocksOrderEntryConfigResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoTokenizedStocksOrderEntryConfigResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoTokenizedStocksOrderEntryConfigResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoTokenizedStocksOrderEntryConfigResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCryptoTokenizedStocksOrderEntryConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_crypto_trading.service.v1.GetCryptoTokenizedStocksOrderEntryConfigResponseDto";
        }
    }
}
