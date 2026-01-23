package com.robinhood.rosetta.nummus;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.nummus.CurrencyPairDetails;
import com.robinhood.rosetta.nummus.CurrencyPairDetailsDto;
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
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CurrencyPairDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\tIJKLMNOPQB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B©\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b\u0006\u0010!J¦\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 J\b\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u00020\rH\u0016J\u0013\u0010>\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010@H\u0096\u0002J\b\u0010A\u001a\u00020BH\u0016J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020BH\u0016J\b\u0010H\u001a\u00020BH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b.\u0010'R\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u0010'R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u0010'R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006R"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Surrogate;)V", "id", "Lokio/ByteString;", "tradability", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "asset_currency_code", "", "asset_currency_name", "asset_currency_id", "asset_currency_increment", "asset_currency_hidden", "", "min_order_quantity_increment", "min_order_price_increment", "min_order_size", "region", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "symbol", "type", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "ncw_upsell_state", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "tokenized_stock_subtype", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "market_cap", "Lcom/robinhood/idl/IdlDecimal;", "(Lokio/ByteString;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;Lcom/robinhood/idl/IdlDecimal;)V", "getId", "()Lokio/ByteString;", "getTradability", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "getAsset_currency_code", "()Ljava/lang/String;", "getAsset_currency_name", "getAsset_currency_id", "getAsset_currency_increment", "getAsset_currency_hidden", "()Z", "getMin_order_quantity_increment", "getMin_order_price_increment", "getMin_order_size", "getRegion", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "getSymbol", "getType", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "getNcw_upsell_state", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "getTokenized_stock_subtype", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "getMarket_cap", "()Lcom/robinhood/idl/IdlDecimal;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TradabilityDto", "RegionDto", "CurrencyPairTypeDto", "NcwUpsellStateDto", "TokenizedStockSubtypeDto", "Serializer", "MultibindingModule", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class CurrencyPairDetailsDto implements Dto3<CurrencyPairDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CurrencyPairDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CurrencyPairDetailsDto, CurrencyPairDetails>> binaryBase64Serializer$delegate;
    private static final CurrencyPairDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CurrencyPairDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CurrencyPairDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ByteString getId() {
        return this.surrogate.getId();
    }

    public final TradabilityDto getTradability() {
        return this.surrogate.getTradability();
    }

    public final String getAsset_currency_code() {
        return this.surrogate.getAsset_currency_code();
    }

    public final String getAsset_currency_name() {
        return this.surrogate.getAsset_currency_name();
    }

    public final ByteString getAsset_currency_id() {
        return this.surrogate.getAsset_currency_id();
    }

    public final String getAsset_currency_increment() {
        return this.surrogate.getAsset_currency_increment();
    }

    public final boolean getAsset_currency_hidden() {
        return this.surrogate.getAsset_currency_hidden();
    }

    public final String getMin_order_quantity_increment() {
        return this.surrogate.getMin_order_quantity_increment();
    }

    public final String getMin_order_price_increment() {
        return this.surrogate.getMin_order_price_increment();
    }

    public final String getMin_order_size() {
        return this.surrogate.getMin_order_size();
    }

    public final RegionDto getRegion() {
        return this.surrogate.getRegion();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final CurrencyPairTypeDto getType() {
        return this.surrogate.getType();
    }

    public final NcwUpsellStateDto getNcw_upsell_state() {
        return this.surrogate.getNcw_upsell_state();
    }

    public final TokenizedStockSubtypeDto getTokenized_stock_subtype() {
        return this.surrogate.getTokenized_stock_subtype();
    }

    public final IdlDecimal getMarket_cap() {
        return this.surrogate.getMarket_cap();
    }

    public /* synthetic */ CurrencyPairDetailsDto(ByteString byteString, TradabilityDto tradabilityDto, String str, String str2, ByteString byteString2, String str3, boolean z, String str4, String str5, String str6, RegionDto regionDto, String str7, CurrencyPairTypeDto currencyPairTypeDto, NcwUpsellStateDto ncwUpsellStateDto, TokenizedStockSubtypeDto tokenizedStockSubtypeDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? RegionDto.INSTANCE.getZeroValue() : regionDto, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? CurrencyPairTypeDto.INSTANCE.getZeroValue() : currencyPairTypeDto, (i & 8192) != 0 ? NcwUpsellStateDto.INSTANCE.getZeroValue() : ncwUpsellStateDto, (i & 16384) != 0 ? TokenizedStockSubtypeDto.INSTANCE.getZeroValue() : tokenizedStockSubtypeDto, (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrencyPairDetailsDto(ByteString id, TradabilityDto tradability, String asset_currency_code, String asset_currency_name, ByteString asset_currency_id, String asset_currency_increment, boolean z, String min_order_quantity_increment, String min_order_price_increment, String min_order_size, RegionDto region, String symbol, CurrencyPairTypeDto type2, NcwUpsellStateDto ncw_upsell_state, TokenizedStockSubtypeDto tokenized_stock_subtype, IdlDecimal market_cap) {
        this(new Surrogate(id, tradability, asset_currency_code, asset_currency_name, asset_currency_id, asset_currency_increment, z, min_order_quantity_increment, min_order_price_increment, min_order_size, region, symbol, type2, ncw_upsell_state, tokenized_stock_subtype, market_cap));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(asset_currency_name, "asset_currency_name");
        Intrinsics.checkNotNullParameter(asset_currency_id, "asset_currency_id");
        Intrinsics.checkNotNullParameter(asset_currency_increment, "asset_currency_increment");
        Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(ncw_upsell_state, "ncw_upsell_state");
        Intrinsics.checkNotNullParameter(tokenized_stock_subtype, "tokenized_stock_subtype");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
    }

    public final CurrencyPairDetailsDto copy(ByteString id, TradabilityDto tradability, String asset_currency_code, String asset_currency_name, ByteString asset_currency_id, String asset_currency_increment, boolean asset_currency_hidden, String min_order_quantity_increment, String min_order_price_increment, String min_order_size, RegionDto region, String symbol, CurrencyPairTypeDto type2, NcwUpsellStateDto ncw_upsell_state, TokenizedStockSubtypeDto tokenized_stock_subtype, IdlDecimal market_cap) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(asset_currency_name, "asset_currency_name");
        Intrinsics.checkNotNullParameter(asset_currency_id, "asset_currency_id");
        Intrinsics.checkNotNullParameter(asset_currency_increment, "asset_currency_increment");
        Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(ncw_upsell_state, "ncw_upsell_state");
        Intrinsics.checkNotNullParameter(tokenized_stock_subtype, "tokenized_stock_subtype");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        return new CurrencyPairDetailsDto(new Surrogate(id, tradability, asset_currency_code, asset_currency_name, asset_currency_id, asset_currency_increment, asset_currency_hidden, min_order_quantity_increment, min_order_price_increment, min_order_size, region, symbol, type2, ncw_upsell_state, tokenized_stock_subtype, market_cap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CurrencyPairDetails toProto() {
        return new CurrencyPairDetails(this.surrogate.getId(), (CurrencyPairDetails.Tradability) this.surrogate.getTradability().toProto(), this.surrogate.getAsset_currency_code(), this.surrogate.getAsset_currency_name(), this.surrogate.getAsset_currency_id(), this.surrogate.getAsset_currency_increment(), this.surrogate.getAsset_currency_hidden(), this.surrogate.getMin_order_quantity_increment(), this.surrogate.getMin_order_price_increment(), this.surrogate.getMin_order_size(), (CurrencyPairDetails.Region) this.surrogate.getRegion().toProto(), this.surrogate.getSymbol(), (CurrencyPairDetails.CurrencyPairType) this.surrogate.getType().toProto(), (CurrencyPairDetails.NcwUpsellState) this.surrogate.getNcw_upsell_state().toProto(), (CurrencyPairDetails.TokenizedStockSubtype) this.surrogate.getTokenized_stock_subtype().toProto(), this.surrogate.getMarket_cap().getStringValue(), null, 65536, null);
    }

    public String toString() {
        return "[CurrencyPairDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CurrencyPairDetailsDto) && Intrinsics.areEqual(((CurrencyPairDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 n2\u00020\u0001:\u0002mnBÔ\u0001\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\u001d¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u001e¢\u0006\u0004\b\u001f\u0010 B¹\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\"\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\u001f\u0010%J\u0018\u0010P\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\u0018\u0010T\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\u000fHÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\t\u0010X\u001a\u00020\nHÆ\u0003J\t\u0010Y\u001a\u00020\nHÆ\u0003J\t\u0010Z\u001a\u00020\u0014HÆ\u0003J\t\u0010[\u001a\u00020\nHÆ\u0003J\t\u0010\\\u001a\u00020\u0017HÆ\u0003J\t\u0010]\u001a\u00020\u0019HÆ\u0003J\t\u0010^\u001a\u00020\u001bHÆ\u0003J\u0018\u0010_\u001a\u00110\u001d¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u001eHÆ\u0003JÖ\u0001\u0010`\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0017\b\u0002\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0017\b\u0002\u0010\u001c\u001a\u00110\u001d¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u001eHÆ\u0001J\u0013\u0010a\u001a\u00020\u000f2\b\u0010b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010c\u001a\u00020\"HÖ\u0001J\t\u0010d\u001a\u00020\nHÖ\u0001J%\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00002\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0001¢\u0006\u0002\blR+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010'\u001a\u0004\b+\u0010,R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010'\u001a\u0004\b.\u0010/R\u001c\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010'\u001a\u0004\b1\u0010/R+\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u001c\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010'\u001a\u0004\b5\u0010/R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010'\u001a\u0004\b7\u00108R\u001c\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010'\u001a\u0004\b:\u0010/R\u001c\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010'\u001a\u0004\b<\u0010/R\u001c\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010'\u001a\u0004\b>\u0010/R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010'\u001a\u0004\b@\u0010AR\u001c\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010'\u001a\u0004\bC\u0010/R\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010'\u001a\u0004\bE\u0010FR\u001c\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010'\u001a\u0004\bH\u0010IR\u001c\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010'\u001a\u0004\bK\u0010LR+\u0010\u001c\u001a\u00110\u001d¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010'\u001a\u0004\bN\u0010O¨\u0006o"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Surrogate;", "", "id", "Lokio/ByteString;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "tradability", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "asset_currency_code", "", "asset_currency_name", "asset_currency_id", "asset_currency_increment", "asset_currency_hidden", "", "min_order_quantity_increment", "min_order_price_increment", "min_order_size", "region", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "symbol", "type", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "ncw_upsell_state", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "tokenized_stock_subtype", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "market_cap", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILokio/ByteString;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lokio/ByteString;", "getTradability$annotations", "getTradability", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "getAsset_currency_code$annotations", "getAsset_currency_code", "()Ljava/lang/String;", "getAsset_currency_name$annotations", "getAsset_currency_name", "getAsset_currency_id$annotations", "getAsset_currency_id", "getAsset_currency_increment$annotations", "getAsset_currency_increment", "getAsset_currency_hidden$annotations", "getAsset_currency_hidden", "()Z", "getMin_order_quantity_increment$annotations", "getMin_order_quantity_increment", "getMin_order_price_increment$annotations", "getMin_order_price_increment", "getMin_order_size$annotations", "getMin_order_size", "getRegion$annotations", "getRegion", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "getSymbol$annotations", "getSymbol", "getType$annotations", "getType", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "getNcw_upsell_state$annotations", "getNcw_upsell_state", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "getTokenized_stock_subtype$annotations", "getTokenized_stock_subtype", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "getMarket_cap$annotations", "getMarket_cap", "()Lcom/robinhood/idl/IdlDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_nummus_nummus_externalRelease", "$serializer", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asset_currency_code;
        private final boolean asset_currency_hidden;
        private final ByteString asset_currency_id;
        private final String asset_currency_increment;
        private final String asset_currency_name;
        private final ByteString id;
        private final IdlDecimal market_cap;
        private final String min_order_price_increment;
        private final String min_order_quantity_increment;
        private final String min_order_size;
        private final NcwUpsellStateDto ncw_upsell_state;
        private final RegionDto region;
        private final String symbol;
        private final TokenizedStockSubtypeDto tokenized_stock_subtype;
        private final TradabilityDto tradability;
        private final CurrencyPairTypeDto type;

        public Surrogate() {
            this((ByteString) null, (TradabilityDto) null, (String) null, (String) null, (ByteString) null, (String) null, false, (String) null, (String) null, (String) null, (RegionDto) null, (String) null, (CurrencyPairTypeDto) null, (NcwUpsellStateDto) null, (TokenizedStockSubtypeDto) null, (IdlDecimal) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        @SerialName("assetCurrencyCode")
        @JsonAnnotations2(names = {"asset_currency_code"})
        public static /* synthetic */ void getAsset_currency_code$annotations() {
        }

        @SerialName("assetCurrencyHidden")
        @JsonAnnotations2(names = {"asset_currency_hidden"})
        public static /* synthetic */ void getAsset_currency_hidden$annotations() {
        }

        @SerialName("assetCurrencyId")
        @JsonAnnotations2(names = {"asset_currency_id"})
        public static /* synthetic */ void getAsset_currency_id$annotations() {
        }

        @SerialName("assetCurrencyIncrement")
        @JsonAnnotations2(names = {"asset_currency_increment"})
        public static /* synthetic */ void getAsset_currency_increment$annotations() {
        }

        @SerialName("assetCurrencyName")
        @JsonAnnotations2(names = {"asset_currency_name"})
        public static /* synthetic */ void getAsset_currency_name$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("marketCap")
        @JsonAnnotations2(names = {"market_cap"})
        public static /* synthetic */ void getMarket_cap$annotations() {
        }

        @SerialName("minOrderPriceIncrement")
        @JsonAnnotations2(names = {"min_order_price_increment"})
        public static /* synthetic */ void getMin_order_price_increment$annotations() {
        }

        @SerialName("minOrderQuantityIncrement")
        @JsonAnnotations2(names = {"min_order_quantity_increment"})
        public static /* synthetic */ void getMin_order_quantity_increment$annotations() {
        }

        @SerialName("minOrderSize")
        @JsonAnnotations2(names = {"min_order_size"})
        public static /* synthetic */ void getMin_order_size$annotations() {
        }

        @SerialName("ncwUpsellState")
        @JsonAnnotations2(names = {"ncw_upsell_state"})
        public static /* synthetic */ void getNcw_upsell_state$annotations() {
        }

        @SerialName("region")
        @JsonAnnotations2(names = {"region"})
        public static /* synthetic */ void getRegion$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tokenizedStockSubtype")
        @JsonAnnotations2(names = {"tokenized_stock_subtype"})
        public static /* synthetic */ void getTokenized_stock_subtype$annotations() {
        }

        @SerialName("tradability")
        @JsonAnnotations2(names = {"tradability"})
        public static /* synthetic */ void getTradability$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ByteString getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getMin_order_size() {
            return this.min_order_size;
        }

        /* renamed from: component11, reason: from getter */
        public final RegionDto getRegion() {
            return this.region;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component13, reason: from getter */
        public final CurrencyPairTypeDto getType() {
            return this.type;
        }

        /* renamed from: component14, reason: from getter */
        public final NcwUpsellStateDto getNcw_upsell_state() {
            return this.ncw_upsell_state;
        }

        /* renamed from: component15, reason: from getter */
        public final TokenizedStockSubtypeDto getTokenized_stock_subtype() {
            return this.tokenized_stock_subtype;
        }

        /* renamed from: component16, reason: from getter */
        public final IdlDecimal getMarket_cap() {
            return this.market_cap;
        }

        /* renamed from: component2, reason: from getter */
        public final TradabilityDto getTradability() {
            return this.tradability;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAsset_currency_name() {
            return this.asset_currency_name;
        }

        /* renamed from: component5, reason: from getter */
        public final ByteString getAsset_currency_id() {
            return this.asset_currency_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAsset_currency_increment() {
            return this.asset_currency_increment;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAsset_currency_hidden() {
            return this.asset_currency_hidden;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMin_order_quantity_increment() {
            return this.min_order_quantity_increment;
        }

        /* renamed from: component9, reason: from getter */
        public final String getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        public final Surrogate copy(ByteString id, TradabilityDto tradability, String asset_currency_code, String asset_currency_name, ByteString asset_currency_id, String asset_currency_increment, boolean asset_currency_hidden, String min_order_quantity_increment, String min_order_price_increment, String min_order_size, RegionDto region, String symbol, CurrencyPairTypeDto type2, NcwUpsellStateDto ncw_upsell_state, TokenizedStockSubtypeDto tokenized_stock_subtype, IdlDecimal market_cap) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(asset_currency_name, "asset_currency_name");
            Intrinsics.checkNotNullParameter(asset_currency_id, "asset_currency_id");
            Intrinsics.checkNotNullParameter(asset_currency_increment, "asset_currency_increment");
            Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
            Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
            Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
            Intrinsics.checkNotNullParameter(region, "region");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(ncw_upsell_state, "ncw_upsell_state");
            Intrinsics.checkNotNullParameter(tokenized_stock_subtype, "tokenized_stock_subtype");
            Intrinsics.checkNotNullParameter(market_cap, "market_cap");
            return new Surrogate(id, tradability, asset_currency_code, asset_currency_name, asset_currency_id, asset_currency_increment, asset_currency_hidden, min_order_quantity_increment, min_order_price_increment, min_order_size, region, symbol, type2, ncw_upsell_state, tokenized_stock_subtype, market_cap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.tradability == surrogate.tradability && Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && Intrinsics.areEqual(this.asset_currency_name, surrogate.asset_currency_name) && Intrinsics.areEqual(this.asset_currency_id, surrogate.asset_currency_id) && Intrinsics.areEqual(this.asset_currency_increment, surrogate.asset_currency_increment) && this.asset_currency_hidden == surrogate.asset_currency_hidden && Intrinsics.areEqual(this.min_order_quantity_increment, surrogate.min_order_quantity_increment) && Intrinsics.areEqual(this.min_order_price_increment, surrogate.min_order_price_increment) && Intrinsics.areEqual(this.min_order_size, surrogate.min_order_size) && this.region == surrogate.region && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.type == surrogate.type && this.ncw_upsell_state == surrogate.ncw_upsell_state && this.tokenized_stock_subtype == surrogate.tokenized_stock_subtype && Intrinsics.areEqual(this.market_cap, surrogate.market_cap);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.tradability.hashCode()) * 31) + this.asset_currency_code.hashCode()) * 31) + this.asset_currency_name.hashCode()) * 31) + this.asset_currency_id.hashCode()) * 31) + this.asset_currency_increment.hashCode()) * 31) + Boolean.hashCode(this.asset_currency_hidden)) * 31) + this.min_order_quantity_increment.hashCode()) * 31) + this.min_order_price_increment.hashCode()) * 31) + this.min_order_size.hashCode()) * 31) + this.region.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.type.hashCode()) * 31) + this.ncw_upsell_state.hashCode()) * 31) + this.tokenized_stock_subtype.hashCode()) * 31) + this.market_cap.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", tradability=" + this.tradability + ", asset_currency_code=" + this.asset_currency_code + ", asset_currency_name=" + this.asset_currency_name + ", asset_currency_id=" + this.asset_currency_id + ", asset_currency_increment=" + this.asset_currency_increment + ", asset_currency_hidden=" + this.asset_currency_hidden + ", min_order_quantity_increment=" + this.min_order_quantity_increment + ", min_order_price_increment=" + this.min_order_price_increment + ", min_order_size=" + this.min_order_size + ", region=" + this.region + ", symbol=" + this.symbol + ", type=" + this.type + ", ncw_upsell_state=" + this.ncw_upsell_state + ", tokenized_stock_subtype=" + this.tokenized_stock_subtype + ", market_cap=" + this.market_cap + ")";
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Surrogate;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CurrencyPairDetailsDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ByteString byteString, TradabilityDto tradabilityDto, String str, String str2, ByteString byteString2, String str3, boolean z, String str4, String str5, String str6, RegionDto regionDto, String str7, CurrencyPairTypeDto currencyPairTypeDto, NcwUpsellStateDto ncwUpsellStateDto, TokenizedStockSubtypeDto tokenizedStockSubtypeDto, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? ByteString.EMPTY : byteString;
            if ((i & 2) == 0) {
                this.tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.tradability = tradabilityDto;
            }
            if ((i & 4) == 0) {
                this.asset_currency_code = "";
            } else {
                this.asset_currency_code = str;
            }
            if ((i & 8) == 0) {
                this.asset_currency_name = "";
            } else {
                this.asset_currency_name = str2;
            }
            if ((i & 16) == 0) {
                this.asset_currency_id = ByteString.EMPTY;
            } else {
                this.asset_currency_id = byteString2;
            }
            if ((i & 32) == 0) {
                this.asset_currency_increment = "";
            } else {
                this.asset_currency_increment = str3;
            }
            if ((i & 64) == 0) {
                this.asset_currency_hidden = false;
            } else {
                this.asset_currency_hidden = z;
            }
            if ((i & 128) == 0) {
                this.min_order_quantity_increment = "";
            } else {
                this.min_order_quantity_increment = str4;
            }
            if ((i & 256) == 0) {
                this.min_order_price_increment = "";
            } else {
                this.min_order_price_increment = str5;
            }
            if ((i & 512) == 0) {
                this.min_order_size = "";
            } else {
                this.min_order_size = str6;
            }
            if ((i & 1024) == 0) {
                this.region = RegionDto.INSTANCE.getZeroValue();
            } else {
                this.region = regionDto;
            }
            if ((i & 2048) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str7;
            }
            if ((i & 4096) == 0) {
                this.type = CurrencyPairTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = currencyPairTypeDto;
            }
            this.ncw_upsell_state = (i & 8192) == 0 ? NcwUpsellStateDto.INSTANCE.getZeroValue() : ncwUpsellStateDto;
            this.tokenized_stock_subtype = (i & 16384) == 0 ? TokenizedStockSubtypeDto.INSTANCE.getZeroValue() : tokenizedStockSubtypeDto;
            this.market_cap = (i & 32768) == 0 ? new IdlDecimal("") : idlDecimal;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_nummus_nummus_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ByteString byteString = self.id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 0, ByteStringSerializer.INSTANCE, self.id);
            }
            if (self.tradability != TradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TradabilityDto.Serializer.INSTANCE, self.tradability);
            }
            if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                output.encodeStringElement(serialDesc, 2, self.asset_currency_code);
            }
            if (!Intrinsics.areEqual(self.asset_currency_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.asset_currency_name);
            }
            if (!Intrinsics.areEqual(self.asset_currency_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 4, ByteStringSerializer.INSTANCE, self.asset_currency_id);
            }
            if (!Intrinsics.areEqual(self.asset_currency_increment, "")) {
                output.encodeStringElement(serialDesc, 5, self.asset_currency_increment);
            }
            boolean z = self.asset_currency_hidden;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            if (!Intrinsics.areEqual(self.min_order_quantity_increment, "")) {
                output.encodeStringElement(serialDesc, 7, self.min_order_quantity_increment);
            }
            if (!Intrinsics.areEqual(self.min_order_price_increment, "")) {
                output.encodeStringElement(serialDesc, 8, self.min_order_price_increment);
            }
            if (!Intrinsics.areEqual(self.min_order_size, "")) {
                output.encodeStringElement(serialDesc, 9, self.min_order_size);
            }
            if (self.region != RegionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, RegionDto.Serializer.INSTANCE, self.region);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 11, self.symbol);
            }
            if (self.type != CurrencyPairTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, CurrencyPairTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.ncw_upsell_state != NcwUpsellStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, NcwUpsellStateDto.Serializer.INSTANCE, self.ncw_upsell_state);
            }
            if (self.tokenized_stock_subtype != TokenizedStockSubtypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 14, TokenizedStockSubtypeDto.Serializer.INSTANCE, self.tokenized_stock_subtype);
            }
            if (Intrinsics.areEqual(self.market_cap, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, self.market_cap);
        }

        public Surrogate(ByteString id, TradabilityDto tradability, String asset_currency_code, String asset_currency_name, ByteString asset_currency_id, String asset_currency_increment, boolean z, String min_order_quantity_increment, String min_order_price_increment, String min_order_size, RegionDto region, String symbol, CurrencyPairTypeDto type2, NcwUpsellStateDto ncw_upsell_state, TokenizedStockSubtypeDto tokenized_stock_subtype, IdlDecimal market_cap) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(asset_currency_name, "asset_currency_name");
            Intrinsics.checkNotNullParameter(asset_currency_id, "asset_currency_id");
            Intrinsics.checkNotNullParameter(asset_currency_increment, "asset_currency_increment");
            Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
            Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
            Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
            Intrinsics.checkNotNullParameter(region, "region");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(ncw_upsell_state, "ncw_upsell_state");
            Intrinsics.checkNotNullParameter(tokenized_stock_subtype, "tokenized_stock_subtype");
            Intrinsics.checkNotNullParameter(market_cap, "market_cap");
            this.id = id;
            this.tradability = tradability;
            this.asset_currency_code = asset_currency_code;
            this.asset_currency_name = asset_currency_name;
            this.asset_currency_id = asset_currency_id;
            this.asset_currency_increment = asset_currency_increment;
            this.asset_currency_hidden = z;
            this.min_order_quantity_increment = min_order_quantity_increment;
            this.min_order_price_increment = min_order_price_increment;
            this.min_order_size = min_order_size;
            this.region = region;
            this.symbol = symbol;
            this.type = type2;
            this.ncw_upsell_state = ncw_upsell_state;
            this.tokenized_stock_subtype = tokenized_stock_subtype;
            this.market_cap = market_cap;
        }

        public final ByteString getId() {
            return this.id;
        }

        public /* synthetic */ Surrogate(ByteString byteString, TradabilityDto tradabilityDto, String str, String str2, ByteString byteString2, String str3, boolean z, String str4, String str5, String str6, RegionDto regionDto, String str7, CurrencyPairTypeDto currencyPairTypeDto, NcwUpsellStateDto ncwUpsellStateDto, TokenizedStockSubtypeDto tokenizedStockSubtypeDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? RegionDto.INSTANCE.getZeroValue() : regionDto, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? CurrencyPairTypeDto.INSTANCE.getZeroValue() : currencyPairTypeDto, (i & 8192) != 0 ? NcwUpsellStateDto.INSTANCE.getZeroValue() : ncwUpsellStateDto, (i & 16384) != 0 ? TokenizedStockSubtypeDto.INSTANCE.getZeroValue() : tokenizedStockSubtypeDto, (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal);
        }

        public final TradabilityDto getTradability() {
            return this.tradability;
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public final String getAsset_currency_name() {
            return this.asset_currency_name;
        }

        public final ByteString getAsset_currency_id() {
            return this.asset_currency_id;
        }

        public final String getAsset_currency_increment() {
            return this.asset_currency_increment;
        }

        public final boolean getAsset_currency_hidden() {
            return this.asset_currency_hidden;
        }

        public final String getMin_order_quantity_increment() {
            return this.min_order_quantity_increment;
        }

        public final String getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        public final String getMin_order_size() {
            return this.min_order_size;
        }

        public final RegionDto getRegion() {
            return this.region;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final CurrencyPairTypeDto getType() {
            return this.type;
        }

        public final NcwUpsellStateDto getNcw_upsell_state() {
            return this.ncw_upsell_state;
        }

        public final TokenizedStockSubtypeDto getTokenized_stock_subtype() {
            return this.tokenized_stock_subtype;
        }

        public final IdlDecimal getMarket_cap() {
            return this.market_cap;
        }
    }

    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CurrencyPairDetailsDto, CurrencyPairDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyPairDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyPairDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyPairDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CurrencyPairDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CurrencyPairDetails> getProtoAdapter() {
            return CurrencyPairDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyPairDetailsDto getZeroValue() {
            return CurrencyPairDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyPairDetailsDto fromProto(CurrencyPairDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CurrencyPairDetailsDto(new Surrogate(proto.getId(), TradabilityDto.INSTANCE.fromProto(proto.getTradability()), proto.getAsset_currency_code(), proto.getAsset_currency_name(), proto.getAsset_currency_id(), proto.getAsset_currency_increment(), proto.getAsset_currency_hidden(), proto.getMin_order_quantity_increment(), proto.getMin_order_price_increment(), proto.getMin_order_size(), RegionDto.INSTANCE.fromProto(proto.getRegion()), proto.getSymbol(), CurrencyPairTypeDto.INSTANCE.fromProto(proto.getType()), NcwUpsellStateDto.INSTANCE.fromProto(proto.getNcw_upsell_state()), TokenizedStockSubtypeDto.INSTANCE.fromProto(proto.getTokenized_stock_subtype()), new IdlDecimal(proto.getMarket_cap())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CurrencyPairDetailsDto(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "BUY_ONLY", "SELL_ONLY", "TRADABLE", "UNTRADABLE", "LIMITED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TradabilityDto implements Dto2<CurrencyPairDetails.Tradability>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TradabilityDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TradabilityDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TradabilityDto, CurrencyPairDetails.Tradability>> binaryBase64Serializer$delegate;
        public static final TradabilityDto BUY_ONLY = new BUY_ONLY("BUY_ONLY", 0);
        public static final TradabilityDto SELL_ONLY = new SELL_ONLY("SELL_ONLY", 1);
        public static final TradabilityDto TRADABLE = new TRADABLE("TRADABLE", 2);
        public static final TradabilityDto UNTRADABLE = new UNTRADABLE("UNTRADABLE", 3);
        public static final TradabilityDto LIMITED = new LIMITED("LIMITED", 4);

        private static final /* synthetic */ TradabilityDto[] $values() {
            return new TradabilityDto[]{BUY_ONLY, SELL_ONLY, TRADABLE, UNTRADABLE, LIMITED};
        }

        public /* synthetic */ TradabilityDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TradabilityDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TradabilityDto.BUY_ONLY", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY_ONLY extends TradabilityDto {
            BUY_ONLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.Tradability toProto() {
                return CurrencyPairDetails.Tradability.BUY_ONLY;
            }
        }

        private TradabilityDto(String str, int i) {
        }

        static {
            TradabilityDto[] tradabilityDtoArr$values = $values();
            $VALUES = tradabilityDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tradabilityDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$TradabilityDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.TradabilityDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TradabilityDto.SELL_ONLY", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELL_ONLY extends TradabilityDto {
            SELL_ONLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.Tradability toProto() {
                return CurrencyPairDetails.Tradability.SELL_ONLY;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TradabilityDto.TRADABLE", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRADABLE extends TradabilityDto {
            TRADABLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.Tradability toProto() {
                return CurrencyPairDetails.Tradability.TRADABLE;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TradabilityDto.UNTRADABLE", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNTRADABLE extends TradabilityDto {
            UNTRADABLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.Tradability toProto() {
                return CurrencyPairDetails.Tradability.UNTRADABLE;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TradabilityDto.LIMITED", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIMITED extends TradabilityDto {
            LIMITED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.Tradability toProto() {
                return CurrencyPairDetails.Tradability.LIMITED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TradabilityDto, CurrencyPairDetails.Tradability> {

            /* compiled from: CurrencyPairDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CurrencyPairDetails.Tradability.values().length];
                    try {
                        iArr[CurrencyPairDetails.Tradability.BUY_ONLY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CurrencyPairDetails.Tradability.SELL_ONLY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CurrencyPairDetails.Tradability.TRADABLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CurrencyPairDetails.Tradability.UNTRADABLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CurrencyPairDetails.Tradability.LIMITED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TradabilityDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TradabilityDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TradabilityDto> getBinaryBase64Serializer() {
                return (KSerializer) TradabilityDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CurrencyPairDetails.Tradability> getProtoAdapter() {
                return CurrencyPairDetails.Tradability.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TradabilityDto getZeroValue() {
                return TradabilityDto.BUY_ONLY;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TradabilityDto fromProto(CurrencyPairDetails.Tradability proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TradabilityDto.BUY_ONLY;
                }
                if (i == 2) {
                    return TradabilityDto.SELL_ONLY;
                }
                if (i == 3) {
                    return TradabilityDto.TRADABLE;
                }
                if (i == 4) {
                    return TradabilityDto.UNTRADABLE;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return TradabilityDto.LIMITED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TradabilityDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TradabilityDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TradabilityDto, CurrencyPairDetails.Tradability> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.CurrencyPairDetails.Tradability", TradabilityDto.getEntries(), TradabilityDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TradabilityDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TradabilityDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TradabilityDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TradabilityDto valueOf(String str) {
            return (TradabilityDto) Enum.valueOf(TradabilityDto.class, str);
        }

        public static TradabilityDto[] values() {
            return (TradabilityDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", CountryCode.COUNTRY_CODE_US, "EU", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RegionDto implements Dto2<CurrencyPairDetails.Region>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RegionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RegionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RegionDto, CurrencyPairDetails.Region>> binaryBase64Serializer$delegate;

        /* renamed from: US */
        public static final RegionDto f6190US = new C37270US(CountryCode.COUNTRY_CODE_US, 0);

        /* renamed from: EU */
        public static final RegionDto f6189EU = new C37269EU("EU", 1);

        private static final /* synthetic */ RegionDto[] $values() {
            return new RegionDto[]{f6190US, f6189EU};
        }

        public /* synthetic */ RegionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RegionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.RegionDto.US", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$RegionDto$US */
        static final class C37270US extends RegionDto {
            C37270US(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.Region toProto() {
                return CurrencyPairDetails.Region.f6188US;
            }
        }

        private RegionDto(String str, int i) {
        }

        static {
            RegionDto[] regionDtoArr$values = $values();
            $VALUES = regionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(regionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$RegionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.RegionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.RegionDto.EU", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$RegionDto$EU */
        static final class C37269EU extends RegionDto {
            C37269EU(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.Region toProto() {
                return CurrencyPairDetails.Region.f6187EU;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RegionDto, CurrencyPairDetails.Region> {

            /* compiled from: CurrencyPairDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CurrencyPairDetails.Region.values().length];
                    try {
                        iArr[CurrencyPairDetails.Region.f6188US.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CurrencyPairDetails.Region.f6187EU.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RegionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RegionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RegionDto> getBinaryBase64Serializer() {
                return (KSerializer) RegionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CurrencyPairDetails.Region> getProtoAdapter() {
                return CurrencyPairDetails.Region.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RegionDto getZeroValue() {
                return RegionDto.f6190US;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RegionDto fromProto(CurrencyPairDetails.Region proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RegionDto.f6190US;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return RegionDto.f6189EU;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$RegionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RegionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RegionDto, CurrencyPairDetails.Region> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.CurrencyPairDetails.Region", RegionDto.getEntries(), RegionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RegionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RegionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RegionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RegionDto valueOf(String str) {
            return (RegionDto) Enum.valueOf(RegionDto.class, str);
        }

        public static RegionDto[] values() {
            return (RegionDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENCY_PAIR_TYPE_UNSPECIFIED", "CURRENCY_PAIR_TYPE_FIAT", "CURRENCY_PAIR_TYPE_CRYPTOCURRENCY", "CURRENCY_PAIR_TYPE_PERPETUAL", "CURRENCY_PAIR_TYPE_TOKENIZED_STOCK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class CurrencyPairTypeDto implements Dto2<CurrencyPairDetails.CurrencyPairType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyPairTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CurrencyPairTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyPairTypeDto, CurrencyPairDetails.CurrencyPairType>> binaryBase64Serializer$delegate;
        public static final CurrencyPairTypeDto CURRENCY_PAIR_TYPE_UNSPECIFIED = new CURRENCY_PAIR_TYPE_UNSPECIFIED("CURRENCY_PAIR_TYPE_UNSPECIFIED", 0);
        public static final CurrencyPairTypeDto CURRENCY_PAIR_TYPE_FIAT = new CURRENCY_PAIR_TYPE_FIAT("CURRENCY_PAIR_TYPE_FIAT", 1);
        public static final CurrencyPairTypeDto CURRENCY_PAIR_TYPE_CRYPTOCURRENCY = new CURRENCY_PAIR_TYPE_CRYPTOCURRENCY("CURRENCY_PAIR_TYPE_CRYPTOCURRENCY", 2);
        public static final CurrencyPairTypeDto CURRENCY_PAIR_TYPE_PERPETUAL = new CURRENCY_PAIR_TYPE_PERPETUAL("CURRENCY_PAIR_TYPE_PERPETUAL", 3);
        public static final CurrencyPairTypeDto CURRENCY_PAIR_TYPE_TOKENIZED_STOCK = new CURRENCY_PAIR_TYPE_TOKENIZED_STOCK("CURRENCY_PAIR_TYPE_TOKENIZED_STOCK", 4);

        private static final /* synthetic */ CurrencyPairTypeDto[] $values() {
            return new CurrencyPairTypeDto[]{CURRENCY_PAIR_TYPE_UNSPECIFIED, CURRENCY_PAIR_TYPE_FIAT, CURRENCY_PAIR_TYPE_CRYPTOCURRENCY, CURRENCY_PAIR_TYPE_PERPETUAL, CURRENCY_PAIR_TYPE_TOKENIZED_STOCK};
        }

        public /* synthetic */ CurrencyPairTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CurrencyPairTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CurrencyPairTypeDto(String str, int i) {
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_TYPE_UNSPECIFIED extends CurrencyPairTypeDto {
            CURRENCY_PAIR_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.CurrencyPairType toProto() {
                return CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED;
            }
        }

        static {
            CurrencyPairTypeDto[] currencyPairTypeDtoArr$values = $values();
            $VALUES = currencyPairTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyPairTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$CurrencyPairTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.CurrencyPairTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_FIAT", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_TYPE_FIAT extends CurrencyPairTypeDto {
            CURRENCY_PAIR_TYPE_FIAT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.CurrencyPairType toProto() {
                return CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_FIAT;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_CRYPTOCURRENCY", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_TYPE_CRYPTOCURRENCY extends CurrencyPairTypeDto {
            CURRENCY_PAIR_TYPE_CRYPTOCURRENCY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.CurrencyPairType toProto() {
                return CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_CRYPTOCURRENCY;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_PERPETUAL", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_TYPE_PERPETUAL extends CurrencyPairTypeDto {
            CURRENCY_PAIR_TYPE_PERPETUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.CurrencyPairType toProto() {
                return CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_PERPETUAL;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_TOKENIZED_STOCK", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_PAIR_TYPE_TOKENIZED_STOCK extends CurrencyPairTypeDto {
            CURRENCY_PAIR_TYPE_TOKENIZED_STOCK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.CurrencyPairType toProto() {
                return CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_TOKENIZED_STOCK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CurrencyPairTypeDto, CurrencyPairDetails.CurrencyPairType> {

            /* compiled from: CurrencyPairDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CurrencyPairDetails.CurrencyPairType.values().length];
                    try {
                        iArr[CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_FIAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_CRYPTOCURRENCY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_PERPETUAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_TOKENIZED_STOCK.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CurrencyPairTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyPairTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyPairTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CurrencyPairDetails.CurrencyPairType> getProtoAdapter() {
                return CurrencyPairDetails.CurrencyPairType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairTypeDto getZeroValue() {
                return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyPairTypeDto fromProto(CurrencyPairDetails.CurrencyPairType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_FIAT;
                }
                if (i == 3) {
                    return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_CRYPTOCURRENCY;
                }
                if (i == 4) {
                    return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_PERPETUAL;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return CurrencyPairTypeDto.CURRENCY_PAIR_TYPE_TOKENIZED_STOCK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$CurrencyPairTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CurrencyPairTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CurrencyPairTypeDto, CurrencyPairDetails.CurrencyPairType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.CurrencyPairDetails.CurrencyPairType", CurrencyPairTypeDto.getEntries(), CurrencyPairTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyPairTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CurrencyPairTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyPairTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CurrencyPairTypeDto valueOf(String str) {
            return (CurrencyPairTypeDto) Enum.valueOf(CurrencyPairTypeDto.class, str);
        }

        public static CurrencyPairTypeDto[] values() {
            return (CurrencyPairTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "ACTIVE", "INACTIVE", "REVIEW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class NcwUpsellStateDto implements Dto2<CurrencyPairDetails.NcwUpsellState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NcwUpsellStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NcwUpsellStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NcwUpsellStateDto, CurrencyPairDetails.NcwUpsellState>> binaryBase64Serializer$delegate;
        public static final NcwUpsellStateDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final NcwUpsellStateDto ACTIVE = new ACTIVE("ACTIVE", 1);
        public static final NcwUpsellStateDto INACTIVE = new INACTIVE("INACTIVE", 2);
        public static final NcwUpsellStateDto REVIEW = new REVIEW("REVIEW", 3);

        private static final /* synthetic */ NcwUpsellStateDto[] $values() {
            return new NcwUpsellStateDto[]{UNSPECIFIED, ACTIVE, INACTIVE, REVIEW};
        }

        public /* synthetic */ NcwUpsellStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NcwUpsellStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.NcwUpsellStateDto.UNSPECIFIED", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends NcwUpsellStateDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.NcwUpsellState toProto() {
                return CurrencyPairDetails.NcwUpsellState.UNSPECIFIED;
            }
        }

        private NcwUpsellStateDto(String str, int i) {
        }

        static {
            NcwUpsellStateDto[] ncwUpsellStateDtoArr$values = $values();
            $VALUES = ncwUpsellStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(ncwUpsellStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$NcwUpsellStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.NcwUpsellStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.NcwUpsellStateDto.ACTIVE", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACTIVE extends NcwUpsellStateDto {
            ACTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.NcwUpsellState toProto() {
                return CurrencyPairDetails.NcwUpsellState.ACTIVE;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.NcwUpsellStateDto.INACTIVE", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INACTIVE extends NcwUpsellStateDto {
            INACTIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.NcwUpsellState toProto() {
                return CurrencyPairDetails.NcwUpsellState.INACTIVE;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.NcwUpsellStateDto.REVIEW", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVIEW extends NcwUpsellStateDto {
            REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.NcwUpsellState toProto() {
                return CurrencyPairDetails.NcwUpsellState.REVIEW;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NcwUpsellStateDto, CurrencyPairDetails.NcwUpsellState> {

            /* compiled from: CurrencyPairDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CurrencyPairDetails.NcwUpsellState.values().length];
                    try {
                        iArr[CurrencyPairDetails.NcwUpsellState.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CurrencyPairDetails.NcwUpsellState.ACTIVE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CurrencyPairDetails.NcwUpsellState.INACTIVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CurrencyPairDetails.NcwUpsellState.REVIEW.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NcwUpsellStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NcwUpsellStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NcwUpsellStateDto> getBinaryBase64Serializer() {
                return (KSerializer) NcwUpsellStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CurrencyPairDetails.NcwUpsellState> getProtoAdapter() {
                return CurrencyPairDetails.NcwUpsellState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NcwUpsellStateDto getZeroValue() {
                return NcwUpsellStateDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NcwUpsellStateDto fromProto(CurrencyPairDetails.NcwUpsellState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return NcwUpsellStateDto.UNSPECIFIED;
                }
                if (i == 2) {
                    return NcwUpsellStateDto.ACTIVE;
                }
                if (i == 3) {
                    return NcwUpsellStateDto.INACTIVE;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return NcwUpsellStateDto.REVIEW;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$NcwUpsellStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<NcwUpsellStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NcwUpsellStateDto, CurrencyPairDetails.NcwUpsellState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.CurrencyPairDetails.NcwUpsellState", NcwUpsellStateDto.getEntries(), NcwUpsellStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NcwUpsellStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NcwUpsellStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NcwUpsellStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NcwUpsellStateDto valueOf(String str) {
            return (NcwUpsellStateDto) Enum.valueOf(NcwUpsellStateDto.class, str);
        }

        public static NcwUpsellStateDto[] values() {
            return (NcwUpsellStateDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED", "TOKENIZED_STOCK_SUBTYPE_STOCK", "TOKENIZED_STOCK_SUBTYPE_ETF", "TOKENIZED_STOCK_SUBTYPE_PRIVATE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes26.dex */
    public static final class TokenizedStockSubtypeDto implements Dto2<CurrencyPairDetails.TokenizedStockSubtype>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TokenizedStockSubtypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TokenizedStockSubtypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TokenizedStockSubtypeDto, CurrencyPairDetails.TokenizedStockSubtype>> binaryBase64Serializer$delegate;
        public static final TokenizedStockSubtypeDto TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED = new TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED("TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED", 0);
        public static final TokenizedStockSubtypeDto TOKENIZED_STOCK_SUBTYPE_STOCK = new TOKENIZED_STOCK_SUBTYPE_STOCK("TOKENIZED_STOCK_SUBTYPE_STOCK", 1);
        public static final TokenizedStockSubtypeDto TOKENIZED_STOCK_SUBTYPE_ETF = new TOKENIZED_STOCK_SUBTYPE_ETF("TOKENIZED_STOCK_SUBTYPE_ETF", 2);
        public static final TokenizedStockSubtypeDto TOKENIZED_STOCK_SUBTYPE_PRIVATE = new TOKENIZED_STOCK_SUBTYPE_PRIVATE("TOKENIZED_STOCK_SUBTYPE_PRIVATE", 3);

        private static final /* synthetic */ TokenizedStockSubtypeDto[] $values() {
            return new TokenizedStockSubtypeDto[]{TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED, TOKENIZED_STOCK_SUBTYPE_STOCK, TOKENIZED_STOCK_SUBTYPE_ETF, TOKENIZED_STOCK_SUBTYPE_PRIVATE};
        }

        public /* synthetic */ TokenizedStockSubtypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TokenizedStockSubtypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TokenizedStockSubtypeDto(String str, int i) {
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED extends TokenizedStockSubtypeDto {
            TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.TokenizedStockSubtype toProto() {
                return CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED;
            }
        }

        static {
            TokenizedStockSubtypeDto[] tokenizedStockSubtypeDtoArr$values = $values();
            $VALUES = tokenizedStockSubtypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tokenizedStockSubtypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetailsDto$TokenizedStockSubtypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.TokenizedStockSubtypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_STOCK", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKENIZED_STOCK_SUBTYPE_STOCK extends TokenizedStockSubtypeDto {
            TOKENIZED_STOCK_SUBTYPE_STOCK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.TokenizedStockSubtype toProto() {
                return CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_STOCK;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_ETF", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKENIZED_STOCK_SUBTYPE_ETF extends TokenizedStockSubtypeDto {
            TOKENIZED_STOCK_SUBTYPE_ETF(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.TokenizedStockSubtype toProto() {
                return CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_ETF;
            }
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/nummus/CurrencyPairDetailsDto.TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_PRIVATE", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "toProto", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKENIZED_STOCK_SUBTYPE_PRIVATE extends TokenizedStockSubtypeDto {
            TOKENIZED_STOCK_SUBTYPE_PRIVATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CurrencyPairDetails.TokenizedStockSubtype toProto() {
                return CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_PRIVATE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TokenizedStockSubtypeDto, CurrencyPairDetails.TokenizedStockSubtype> {

            /* compiled from: CurrencyPairDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CurrencyPairDetails.TokenizedStockSubtype.values().length];
                    try {
                        iArr[CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_STOCK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_ETF.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_PRIVATE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TokenizedStockSubtypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockSubtypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TokenizedStockSubtypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TokenizedStockSubtypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CurrencyPairDetails.TokenizedStockSubtype> getProtoAdapter() {
                return CurrencyPairDetails.TokenizedStockSubtype.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockSubtypeDto getZeroValue() {
                return TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TokenizedStockSubtypeDto fromProto(CurrencyPairDetails.TokenizedStockSubtype proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_STOCK;
                }
                if (i == 3) {
                    return TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_ETF;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return TokenizedStockSubtypeDto.TOKENIZED_STOCK_SUBTYPE_PRIVATE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$TokenizedStockSubtypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TokenizedStockSubtypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TokenizedStockSubtypeDto, CurrencyPairDetails.TokenizedStockSubtype> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.nummus.CurrencyPairDetails.TokenizedStockSubtype", TokenizedStockSubtypeDto.getEntries(), TokenizedStockSubtypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TokenizedStockSubtypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TokenizedStockSubtypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TokenizedStockSubtypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TokenizedStockSubtypeDto valueOf(String str) {
            return (TokenizedStockSubtypeDto) Enum.valueOf(TokenizedStockSubtypeDto.class, str);
        }

        public static TokenizedStockSubtypeDto[] values() {
            return (TokenizedStockSubtypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CurrencyPairDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.nummus.CurrencyPairDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CurrencyPairDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CurrencyPairDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CurrencyPairDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CurrencyPairDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.nummus.CurrencyPairDetailsDto";
        }
    }
}
