package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.ProductDeliveryDto;
import com.robinhood.arsenal.proto.p281v1.idl.ProductFutureSubtypeDto;
import com.robinhood.arsenal.proto.p281v1.idl.ProductUnderlyingAssetDto;
import com.robinhood.arsenal.proto.p281v1.idl.RHDProductGroupDto;
import com.robinhood.arsenal.proto.p281v1.idl.TradingHoursInfoDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ProductDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004PQRSB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bç\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0004\b\u0006\u0010%Jé\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020\u0002H\u0016J\b\u0010E\u001a\u00020\tH\u0016J\u0013\u0010F\u001a\u00020\u00182\b\u0010G\u001a\u0004\u0018\u00010HH\u0096\u0002J\b\u0010I\u001a\u00020\"H\u0016J\u0018\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\"H\u0016J\b\u0010O\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010'R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u00105R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b8\u0010'R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b9\u0010'R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b:\u0010'R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010 \u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b=\u0010'R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006T"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/Product;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Surrogate;)V", "id", "", "combined_commodity_id", "symbol", "display_symbol", "description", PlaceTypes.COUNTRY, "exchange", "currency", "future_sub_type", "Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;", "underlying_asset", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "delivery", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;", "is_standardized", "", "price_increments", "Lcom/robinhood/idl/IdlDecimal;", "active_futures_contract_id", "long_description", "simple_name", "trading_hours_info", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;", "settlement_start_time", "search_rank", "", "rhd_product_group", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;)V", "getId", "()Ljava/lang/String;", "getCombined_commodity_id", "getSymbol", "getDisplay_symbol", "getDescription", "getCountry", "getExchange", "getCurrency", "getFuture_sub_type", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;", "getUnderlying_asset", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "getDelivery", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;", "()Ljava/lang/Boolean;", "getPrice_increments", "()Lcom/robinhood/idl/IdlDecimal;", "getActive_futures_contract_id", "getLong_description", "getSimple_name", "getTrading_hours_info", "()Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;", "getSettlement_start_time", "getSearch_rank", "()Ljava/lang/Integer;", "getRhd_product_group", "()Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;)Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class ProductDto implements Dto3<Product>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ProductDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ProductDto, Product>> binaryBase64Serializer$delegate;
    private static final ProductDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ProductDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ProductDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getCombined_commodity_id() {
        return this.surrogate.getCombined_commodity_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getDisplay_symbol() {
        return this.surrogate.getDisplay_symbol();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getCountry() {
        return this.surrogate.getCountry();
    }

    public final String getExchange() {
        return this.surrogate.getExchange();
    }

    public final String getCurrency() {
        return this.surrogate.getCurrency();
    }

    public final ProductFutureSubtypeDto getFuture_sub_type() {
        return this.surrogate.getFuture_sub_type();
    }

    public final ProductUnderlyingAssetDto getUnderlying_asset() {
        return this.surrogate.getUnderlying_asset();
    }

    public final ProductDeliveryDto getDelivery() {
        return this.surrogate.getDelivery();
    }

    public final Boolean is_standardized() {
        return this.surrogate.is_standardized();
    }

    public final IdlDecimal getPrice_increments() {
        return this.surrogate.getPrice_increments();
    }

    public final String getActive_futures_contract_id() {
        return this.surrogate.getActive_futures_contract_id();
    }

    public final String getLong_description() {
        return this.surrogate.getLong_description();
    }

    public final String getSimple_name() {
        return this.surrogate.getSimple_name();
    }

    public final TradingHoursInfoDto getTrading_hours_info() {
        return this.surrogate.getTrading_hours_info();
    }

    public final String getSettlement_start_time() {
        return this.surrogate.getSettlement_start_time();
    }

    public final Integer getSearch_rank() {
        return this.surrogate.getSearch_rank();
    }

    public final RHDProductGroupDto getRhd_product_group() {
        return this.surrogate.getRhd_product_group();
    }

    public /* synthetic */ ProductDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ProductFutureSubtypeDto productFutureSubtypeDto, ProductUnderlyingAssetDto productUnderlyingAssetDto, ProductDeliveryDto productDeliveryDto, Boolean bool, IdlDecimal idlDecimal, String str9, String str10, String str11, TradingHoursInfoDto tradingHoursInfoDto, String str12, Integer num, RHDProductGroupDto rHDProductGroupDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : productFutureSubtypeDto, (i & 512) != 0 ? null : productUnderlyingAssetDto, (i & 1024) != 0 ? null : productDeliveryDto, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : tradingHoursInfoDto, (i & 131072) != 0 ? null : str12, (i & 262144) != 0 ? null : num, (i & 524288) != 0 ? RHDProductGroupDto.INSTANCE.getZeroValue() : rHDProductGroupDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductDto(String id, String combined_commodity_id, String symbol, String str, String description, String country, String exchange, String currency, ProductFutureSubtypeDto productFutureSubtypeDto, ProductUnderlyingAssetDto productUnderlyingAssetDto, ProductDeliveryDto productDeliveryDto, Boolean bool, IdlDecimal price_increments, String str2, String str3, String str4, TradingHoursInfoDto tradingHoursInfoDto, String str5, Integer num, RHDProductGroupDto rhd_product_group) {
        this(new Surrogate(id, combined_commodity_id, symbol, str, description, country, exchange, currency, productFutureSubtypeDto, productUnderlyingAssetDto, productDeliveryDto, bool, price_increments, str2, str3, str4, tradingHoursInfoDto, str5, num, rhd_product_group));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(combined_commodity_id, "combined_commodity_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(price_increments, "price_increments");
        Intrinsics.checkNotNullParameter(rhd_product_group, "rhd_product_group");
    }

    public static /* synthetic */ ProductDto copy$default(ProductDto productDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ProductFutureSubtypeDto productFutureSubtypeDto, ProductUnderlyingAssetDto productUnderlyingAssetDto, ProductDeliveryDto productDeliveryDto, Boolean bool, IdlDecimal idlDecimal, String str9, String str10, String str11, TradingHoursInfoDto tradingHoursInfoDto, String str12, Integer num, RHDProductGroupDto rHDProductGroupDto, int i, Object obj) {
        RHDProductGroupDto rhd_product_group;
        Integer num2;
        String id = (i & 1) != 0 ? productDto.surrogate.getId() : str;
        String combined_commodity_id = (i & 2) != 0 ? productDto.surrogate.getCombined_commodity_id() : str2;
        String symbol = (i & 4) != 0 ? productDto.surrogate.getSymbol() : str3;
        String display_symbol = (i & 8) != 0 ? productDto.surrogate.getDisplay_symbol() : str4;
        String description = (i & 16) != 0 ? productDto.surrogate.getDescription() : str5;
        String country = (i & 32) != 0 ? productDto.surrogate.getCountry() : str6;
        String exchange = (i & 64) != 0 ? productDto.surrogate.getExchange() : str7;
        String currency = (i & 128) != 0 ? productDto.surrogate.getCurrency() : str8;
        ProductFutureSubtypeDto future_sub_type = (i & 256) != 0 ? productDto.surrogate.getFuture_sub_type() : productFutureSubtypeDto;
        ProductUnderlyingAssetDto underlying_asset = (i & 512) != 0 ? productDto.surrogate.getUnderlying_asset() : productUnderlyingAssetDto;
        ProductDeliveryDto delivery = (i & 1024) != 0 ? productDto.surrogate.getDelivery() : productDeliveryDto;
        Boolean boolIs_standardized = (i & 2048) != 0 ? productDto.surrogate.is_standardized() : bool;
        IdlDecimal price_increments = (i & 4096) != 0 ? productDto.surrogate.getPrice_increments() : idlDecimal;
        String active_futures_contract_id = (i & 8192) != 0 ? productDto.surrogate.getActive_futures_contract_id() : str9;
        String str13 = id;
        String long_description = (i & 16384) != 0 ? productDto.surrogate.getLong_description() : str10;
        String simple_name = (i & 32768) != 0 ? productDto.surrogate.getSimple_name() : str11;
        TradingHoursInfoDto trading_hours_info = (i & 65536) != 0 ? productDto.surrogate.getTrading_hours_info() : tradingHoursInfoDto;
        String settlement_start_time = (i & 131072) != 0 ? productDto.surrogate.getSettlement_start_time() : str12;
        Integer search_rank = (i & 262144) != 0 ? productDto.surrogate.getSearch_rank() : num;
        if ((i & 524288) != 0) {
            num2 = search_rank;
            rhd_product_group = productDto.surrogate.getRhd_product_group();
        } else {
            rhd_product_group = rHDProductGroupDto;
            num2 = search_rank;
        }
        return productDto.copy(str13, combined_commodity_id, symbol, display_symbol, description, country, exchange, currency, future_sub_type, underlying_asset, delivery, boolIs_standardized, price_increments, active_futures_contract_id, long_description, simple_name, trading_hours_info, settlement_start_time, num2, rhd_product_group);
    }

    public final ProductDto copy(String id, String combined_commodity_id, String symbol, String display_symbol, String description, String country, String exchange, String currency, ProductFutureSubtypeDto future_sub_type, ProductUnderlyingAssetDto underlying_asset, ProductDeliveryDto delivery, Boolean is_standardized, IdlDecimal price_increments, String active_futures_contract_id, String long_description, String simple_name, TradingHoursInfoDto trading_hours_info, String settlement_start_time, Integer search_rank, RHDProductGroupDto rhd_product_group) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(combined_commodity_id, "combined_commodity_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(price_increments, "price_increments");
        Intrinsics.checkNotNullParameter(rhd_product_group, "rhd_product_group");
        return new ProductDto(new Surrogate(id, combined_commodity_id, symbol, display_symbol, description, country, exchange, currency, future_sub_type, underlying_asset, delivery, is_standardized, price_increments, active_futures_contract_id, long_description, simple_name, trading_hours_info, settlement_start_time, search_rank, rhd_product_group));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Product toProto() {
        String id = this.surrogate.getId();
        String combined_commodity_id = this.surrogate.getCombined_commodity_id();
        String symbol = this.surrogate.getSymbol();
        String display_symbol = this.surrogate.getDisplay_symbol();
        String description = this.surrogate.getDescription();
        String country = this.surrogate.getCountry();
        String exchange = this.surrogate.getExchange();
        String currency = this.surrogate.getCurrency();
        ProductFutureSubtypeDto future_sub_type = this.surrogate.getFuture_sub_type();
        ProductFutureSubtype productFutureSubtype = future_sub_type != null ? (ProductFutureSubtype) future_sub_type.toProto() : null;
        ProductUnderlyingAssetDto underlying_asset = this.surrogate.getUnderlying_asset();
        ProductUnderlyingAsset productUnderlyingAsset = underlying_asset != null ? (ProductUnderlyingAsset) underlying_asset.toProto() : null;
        ProductDeliveryDto delivery = this.surrogate.getDelivery();
        ProductDelivery productDelivery = delivery != null ? (ProductDelivery) delivery.toProto() : null;
        Boolean boolIs_standardized = this.surrogate.is_standardized();
        String stringValue = this.surrogate.getPrice_increments().getStringValue();
        String active_futures_contract_id = this.surrogate.getActive_futures_contract_id();
        String long_description = this.surrogate.getLong_description();
        String simple_name = this.surrogate.getSimple_name();
        TradingHoursInfoDto trading_hours_info = this.surrogate.getTrading_hours_info();
        return new Product(id, combined_commodity_id, symbol, display_symbol, description, country, exchange, currency, productFutureSubtype, productUnderlyingAsset, productDelivery, boolIs_standardized, stringValue, active_futures_contract_id, long_description, simple_name, trading_hours_info != null ? trading_hours_info.toProto() : null, this.surrogate.getSettlement_start_time(), this.surrogate.getSearch_rank(), (RHDProductGroup) this.surrogate.getRhd_product_group().toProto(), null, 1048576, null);
    }

    public String toString() {
        return "[ProductDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ProductDto) && Intrinsics.areEqual(((ProductDto) other).surrogate, this.surrogate);
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
    /* compiled from: ProductDto.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u007f2\u00020\u0001:\u0002~\u007fB\u0083\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0019\b\u0002\u0010\u001e\u001a\u0013\u0018\u00010\u001f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0 \u0012\b\b\u0002\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$Bã\u0001\b\u0010\u0012\u0006\u0010%\u001a\u00020\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0004\b#\u0010(J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010EJ\u0018\u0010h\u001a\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010n\u001a\u0013\u0018\u00010\u001f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0 HÆ\u0003¢\u0006\u0002\u0010WJ\t\u0010o\u001a\u00020\"HÆ\u0003J\u008a\u0002\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0017\b\u0002\u0010\u0013\u001a\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u001e\u001a\u0013\u0018\u00010\u001f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0 2\b\b\u0002\u0010!\u001a\u00020\"HÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u00122\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020\u001fHÖ\u0001J\t\u0010u\u001a\u00020\u0003HÖ\u0001J%\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\u00002\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|H\u0001¢\u0006\u0002\b}R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010*\u001a\u0004\b8\u0010,R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010*\u001a\u0004\b:\u0010,R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010*\u001a\u0004\b<\u0010=R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010*\u001a\u0004\b?\u0010@R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010*\u001a\u0004\bB\u0010CR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010F\u0012\u0004\bD\u0010*\u001a\u0004\b\u0011\u0010ER+\u0010\u0013\u001a\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010*\u001a\u0004\bH\u0010IR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010*\u001a\u0004\bK\u0010,R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010*\u001a\u0004\bM\u0010,R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010*\u001a\u0004\bO\u0010,R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010*\u001a\u0004\bQ\u0010RR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010*\u001a\u0004\bT\u0010,R/\u0010\u001e\u001a\u0013\u0018\u00010\u001f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0 8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010X\u0012\u0004\bU\u0010*\u001a\u0004\bV\u0010WR\u001c\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010*\u001a\u0004\bZ\u0010[¨\u0006\u0080\u0001"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Surrogate;", "", "id", "", "combined_commodity_id", "symbol", "display_symbol", "description", PlaceTypes.COUNTRY, "exchange", "currency", "future_sub_type", "Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;", "underlying_asset", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "delivery", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;", "is_standardized", "", "price_increments", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "active_futures_contract_id", "long_description", "simple_name", "trading_hours_info", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;", "settlement_start_time", "search_rank", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "rhd_product_group", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getCombined_commodity_id$annotations", "getCombined_commodity_id", "getSymbol$annotations", "getSymbol", "getDisplay_symbol$annotations", "getDisplay_symbol", "getDescription$annotations", "getDescription", "getCountry$annotations", "getCountry", "getExchange$annotations", "getExchange", "getCurrency$annotations", "getCurrency", "getFuture_sub_type$annotations", "getFuture_sub_type", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;", "getUnderlying_asset$annotations", "getUnderlying_asset", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "getDelivery$annotations", "getDelivery", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;", "is_standardized$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrice_increments$annotations", "getPrice_increments", "()Lcom/robinhood/idl/IdlDecimal;", "getActive_futures_contract_id$annotations", "getActive_futures_contract_id", "getLong_description$annotations", "getLong_description", "getSimple_name$annotations", "getSimple_name", "getTrading_hours_info$annotations", "getTrading_hours_info", "()Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;", "getSettlement_start_time$annotations", "getSettlement_start_time", "getSearch_rank$annotations", "getSearch_rank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRhd_product_group$annotations", "getRhd_product_group", "()Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtypeDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;Lcom/robinhood/arsenal/proto/v1/idl/ProductDeliveryDto;Ljava/lang/Boolean;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;)Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String active_futures_contract_id;
        private final String combined_commodity_id;
        private final String country;
        private final String currency;
        private final ProductDeliveryDto delivery;
        private final String description;
        private final String display_symbol;
        private final String exchange;
        private final ProductFutureSubtypeDto future_sub_type;
        private final String id;
        private final Boolean is_standardized;
        private final String long_description;
        private final IdlDecimal price_increments;
        private final RHDProductGroupDto rhd_product_group;
        private final Integer search_rank;
        private final String settlement_start_time;
        private final String simple_name;
        private final String symbol;
        private final TradingHoursInfoDto trading_hours_info;
        private final ProductUnderlyingAssetDto underlying_asset;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ProductFutureSubtypeDto) null, (ProductUnderlyingAssetDto) null, (ProductDeliveryDto) null, (Boolean) null, (IdlDecimal) null, (String) null, (String) null, (String) null, (TradingHoursInfoDto) null, (String) null, (Integer) null, (RHDProductGroupDto) null, 1048575, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ProductFutureSubtypeDto productFutureSubtypeDto, ProductUnderlyingAssetDto productUnderlyingAssetDto, ProductDeliveryDto productDeliveryDto, Boolean bool, IdlDecimal idlDecimal, String str9, String str10, String str11, TradingHoursInfoDto tradingHoursInfoDto, String str12, Integer num, RHDProductGroupDto rHDProductGroupDto, int i, Object obj) {
            RHDProductGroupDto rHDProductGroupDto2;
            Integer num2;
            String str13 = (i & 1) != 0 ? surrogate.id : str;
            String str14 = (i & 2) != 0 ? surrogate.combined_commodity_id : str2;
            String str15 = (i & 4) != 0 ? surrogate.symbol : str3;
            String str16 = (i & 8) != 0 ? surrogate.display_symbol : str4;
            String str17 = (i & 16) != 0 ? surrogate.description : str5;
            String str18 = (i & 32) != 0 ? surrogate.country : str6;
            String str19 = (i & 64) != 0 ? surrogate.exchange : str7;
            String str20 = (i & 128) != 0 ? surrogate.currency : str8;
            ProductFutureSubtypeDto productFutureSubtypeDto2 = (i & 256) != 0 ? surrogate.future_sub_type : productFutureSubtypeDto;
            ProductUnderlyingAssetDto productUnderlyingAssetDto2 = (i & 512) != 0 ? surrogate.underlying_asset : productUnderlyingAssetDto;
            ProductDeliveryDto productDeliveryDto2 = (i & 1024) != 0 ? surrogate.delivery : productDeliveryDto;
            Boolean bool2 = (i & 2048) != 0 ? surrogate.is_standardized : bool;
            IdlDecimal idlDecimal2 = (i & 4096) != 0 ? surrogate.price_increments : idlDecimal;
            String str21 = (i & 8192) != 0 ? surrogate.active_futures_contract_id : str9;
            String str22 = str13;
            String str23 = (i & 16384) != 0 ? surrogate.long_description : str10;
            String str24 = (i & 32768) != 0 ? surrogate.simple_name : str11;
            TradingHoursInfoDto tradingHoursInfoDto2 = (i & 65536) != 0 ? surrogate.trading_hours_info : tradingHoursInfoDto;
            String str25 = (i & 131072) != 0 ? surrogate.settlement_start_time : str12;
            Integer num3 = (i & 262144) != 0 ? surrogate.search_rank : num;
            if ((i & 524288) != 0) {
                num2 = num3;
                rHDProductGroupDto2 = surrogate.rhd_product_group;
            } else {
                rHDProductGroupDto2 = rHDProductGroupDto;
                num2 = num3;
            }
            return surrogate.copy(str22, str14, str15, str16, str17, str18, str19, str20, productFutureSubtypeDto2, productUnderlyingAssetDto2, productDeliveryDto2, bool2, idlDecimal2, str21, str23, str24, tradingHoursInfoDto2, str25, num2, rHDProductGroupDto2);
        }

        @SerialName("activeFuturesContractId")
        @JsonAnnotations2(names = {"active_futures_contract_id"})
        public static /* synthetic */ void getActive_futures_contract_id$annotations() {
        }

        @SerialName("combinedCommodityId")
        @JsonAnnotations2(names = {"combined_commodity_id"})
        public static /* synthetic */ void getCombined_commodity_id$annotations() {
        }

        @SerialName(PlaceTypes.COUNTRY)
        @JsonAnnotations2(names = {PlaceTypes.COUNTRY})
        public static /* synthetic */ void getCountry$annotations() {
        }

        @SerialName("currency")
        @JsonAnnotations2(names = {"currency"})
        public static /* synthetic */ void getCurrency$annotations() {
        }

        @SerialName("delivery")
        @JsonAnnotations2(names = {"delivery"})
        public static /* synthetic */ void getDelivery$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("displaySymbol")
        @JsonAnnotations2(names = {"display_symbol"})
        public static /* synthetic */ void getDisplay_symbol$annotations() {
        }

        @SerialName("exchange")
        @JsonAnnotations2(names = {"exchange"})
        public static /* synthetic */ void getExchange$annotations() {
        }

        @SerialName("futureSubType")
        @JsonAnnotations2(names = {"future_sub_type"})
        public static /* synthetic */ void getFuture_sub_type$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("longDescription")
        @JsonAnnotations2(names = {"long_description"})
        public static /* synthetic */ void getLong_description$annotations() {
        }

        @SerialName("priceIncrements")
        @JsonAnnotations2(names = {"price_increments"})
        public static /* synthetic */ void getPrice_increments$annotations() {
        }

        @SerialName("rhdProductGroup")
        @JsonAnnotations2(names = {"rhd_product_group"})
        public static /* synthetic */ void getRhd_product_group$annotations() {
        }

        @SerialName("searchRank")
        @JsonAnnotations2(names = {"search_rank"})
        public static /* synthetic */ void getSearch_rank$annotations() {
        }

        @SerialName("settlementStartTime")
        @JsonAnnotations2(names = {"settlement_start_time"})
        public static /* synthetic */ void getSettlement_start_time$annotations() {
        }

        @SerialName("simpleName")
        @JsonAnnotations2(names = {"simple_name"})
        public static /* synthetic */ void getSimple_name$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tradingHoursInfo")
        @JsonAnnotations2(names = {"trading_hours_info"})
        public static /* synthetic */ void getTrading_hours_info$annotations() {
        }

        @SerialName("underlyingAsset")
        @JsonAnnotations2(names = {"underlying_asset"})
        public static /* synthetic */ void getUnderlying_asset$annotations() {
        }

        @SerialName("isStandardized")
        @JsonAnnotations2(names = {"is_standardized"})
        public static /* synthetic */ void is_standardized$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final ProductUnderlyingAssetDto getUnderlying_asset() {
            return this.underlying_asset;
        }

        /* renamed from: component11, reason: from getter */
        public final ProductDeliveryDto getDelivery() {
            return this.delivery;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIs_standardized() {
            return this.is_standardized;
        }

        /* renamed from: component13, reason: from getter */
        public final IdlDecimal getPrice_increments() {
            return this.price_increments;
        }

        /* renamed from: component14, reason: from getter */
        public final String getActive_futures_contract_id() {
            return this.active_futures_contract_id;
        }

        /* renamed from: component15, reason: from getter */
        public final String getLong_description() {
            return this.long_description;
        }

        /* renamed from: component16, reason: from getter */
        public final String getSimple_name() {
            return this.simple_name;
        }

        /* renamed from: component17, reason: from getter */
        public final TradingHoursInfoDto getTrading_hours_info() {
            return this.trading_hours_info;
        }

        /* renamed from: component18, reason: from getter */
        public final String getSettlement_start_time() {
            return this.settlement_start_time;
        }

        /* renamed from: component19, reason: from getter */
        public final Integer getSearch_rank() {
            return this.search_rank;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCombined_commodity_id() {
            return this.combined_commodity_id;
        }

        /* renamed from: component20, reason: from getter */
        public final RHDProductGroupDto getRhd_product_group() {
            return this.rhd_product_group;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplay_symbol() {
            return this.display_symbol;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component7, reason: from getter */
        public final String getExchange() {
            return this.exchange;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: component9, reason: from getter */
        public final ProductFutureSubtypeDto getFuture_sub_type() {
            return this.future_sub_type;
        }

        public final Surrogate copy(String id, String combined_commodity_id, String symbol, String display_symbol, String description, String country, String exchange, String currency, ProductFutureSubtypeDto future_sub_type, ProductUnderlyingAssetDto underlying_asset, ProductDeliveryDto delivery, Boolean is_standardized, IdlDecimal price_increments, String active_futures_contract_id, String long_description, String simple_name, TradingHoursInfoDto trading_hours_info, String settlement_start_time, Integer search_rank, RHDProductGroupDto rhd_product_group) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(combined_commodity_id, "combined_commodity_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(exchange, "exchange");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(price_increments, "price_increments");
            Intrinsics.checkNotNullParameter(rhd_product_group, "rhd_product_group");
            return new Surrogate(id, combined_commodity_id, symbol, display_symbol, description, country, exchange, currency, future_sub_type, underlying_asset, delivery, is_standardized, price_increments, active_futures_contract_id, long_description, simple_name, trading_hours_info, settlement_start_time, search_rank, rhd_product_group);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.combined_commodity_id, surrogate.combined_commodity_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.display_symbol, surrogate.display_symbol) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.country, surrogate.country) && Intrinsics.areEqual(this.exchange, surrogate.exchange) && Intrinsics.areEqual(this.currency, surrogate.currency) && this.future_sub_type == surrogate.future_sub_type && this.underlying_asset == surrogate.underlying_asset && this.delivery == surrogate.delivery && Intrinsics.areEqual(this.is_standardized, surrogate.is_standardized) && Intrinsics.areEqual(this.price_increments, surrogate.price_increments) && Intrinsics.areEqual(this.active_futures_contract_id, surrogate.active_futures_contract_id) && Intrinsics.areEqual(this.long_description, surrogate.long_description) && Intrinsics.areEqual(this.simple_name, surrogate.simple_name) && Intrinsics.areEqual(this.trading_hours_info, surrogate.trading_hours_info) && Intrinsics.areEqual(this.settlement_start_time, surrogate.settlement_start_time) && Intrinsics.areEqual(this.search_rank, surrogate.search_rank) && this.rhd_product_group == surrogate.rhd_product_group;
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.combined_commodity_id.hashCode()) * 31) + this.symbol.hashCode()) * 31;
            String str = this.display_symbol;
            int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31) + this.country.hashCode()) * 31) + this.exchange.hashCode()) * 31) + this.currency.hashCode()) * 31;
            ProductFutureSubtypeDto productFutureSubtypeDto = this.future_sub_type;
            int iHashCode3 = (iHashCode2 + (productFutureSubtypeDto == null ? 0 : productFutureSubtypeDto.hashCode())) * 31;
            ProductUnderlyingAssetDto productUnderlyingAssetDto = this.underlying_asset;
            int iHashCode4 = (iHashCode3 + (productUnderlyingAssetDto == null ? 0 : productUnderlyingAssetDto.hashCode())) * 31;
            ProductDeliveryDto productDeliveryDto = this.delivery;
            int iHashCode5 = (iHashCode4 + (productDeliveryDto == null ? 0 : productDeliveryDto.hashCode())) * 31;
            Boolean bool = this.is_standardized;
            int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + this.price_increments.hashCode()) * 31;
            String str2 = this.active_futures_contract_id;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.long_description;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.simple_name;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            TradingHoursInfoDto tradingHoursInfoDto = this.trading_hours_info;
            int iHashCode10 = (iHashCode9 + (tradingHoursInfoDto == null ? 0 : tradingHoursInfoDto.hashCode())) * 31;
            String str5 = this.settlement_start_time;
            int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.search_rank;
            return ((iHashCode11 + (num != null ? num.hashCode() : 0)) * 31) + this.rhd_product_group.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", combined_commodity_id=" + this.combined_commodity_id + ", symbol=" + this.symbol + ", display_symbol=" + this.display_symbol + ", description=" + this.description + ", country=" + this.country + ", exchange=" + this.exchange + ", currency=" + this.currency + ", future_sub_type=" + this.future_sub_type + ", underlying_asset=" + this.underlying_asset + ", delivery=" + this.delivery + ", is_standardized=" + this.is_standardized + ", price_increments=" + this.price_increments + ", active_futures_contract_id=" + this.active_futures_contract_id + ", long_description=" + this.long_description + ", simple_name=" + this.simple_name + ", trading_hours_info=" + this.trading_hours_info + ", settlement_start_time=" + this.settlement_start_time + ", search_rank=" + this.search_rank + ", rhd_product_group=" + this.rhd_product_group + ")";
        }

        /* compiled from: ProductDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ProductDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ProductFutureSubtypeDto productFutureSubtypeDto, ProductUnderlyingAssetDto productUnderlyingAssetDto, ProductDeliveryDto productDeliveryDto, Boolean bool, IdlDecimal idlDecimal, String str9, String str10, String str11, TradingHoursInfoDto tradingHoursInfoDto, String str12, Integer num, RHDProductGroupDto rHDProductGroupDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.combined_commodity_id = "";
            } else {
                this.combined_commodity_id = str2;
            }
            if ((i & 4) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i & 8) == 0) {
                this.display_symbol = null;
            } else {
                this.display_symbol = str4;
            }
            if ((i & 16) == 0) {
                this.description = "";
            } else {
                this.description = str5;
            }
            if ((i & 32) == 0) {
                this.country = "";
            } else {
                this.country = str6;
            }
            if ((i & 64) == 0) {
                this.exchange = "";
            } else {
                this.exchange = str7;
            }
            if ((i & 128) == 0) {
                this.currency = "";
            } else {
                this.currency = str8;
            }
            if ((i & 256) == 0) {
                this.future_sub_type = null;
            } else {
                this.future_sub_type = productFutureSubtypeDto;
            }
            if ((i & 512) == 0) {
                this.underlying_asset = null;
            } else {
                this.underlying_asset = productUnderlyingAssetDto;
            }
            if ((i & 1024) == 0) {
                this.delivery = null;
            } else {
                this.delivery = productDeliveryDto;
            }
            if ((i & 2048) == 0) {
                this.is_standardized = null;
            } else {
                this.is_standardized = bool;
            }
            this.price_increments = (i & 4096) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 8192) == 0) {
                this.active_futures_contract_id = null;
            } else {
                this.active_futures_contract_id = str9;
            }
            if ((i & 16384) == 0) {
                this.long_description = null;
            } else {
                this.long_description = str10;
            }
            if ((32768 & i) == 0) {
                this.simple_name = null;
            } else {
                this.simple_name = str11;
            }
            if ((65536 & i) == 0) {
                this.trading_hours_info = null;
            } else {
                this.trading_hours_info = tradingHoursInfoDto;
            }
            if ((131072 & i) == 0) {
                this.settlement_start_time = null;
            } else {
                this.settlement_start_time = str12;
            }
            if ((262144 & i) == 0) {
                this.search_rank = null;
            } else {
                this.search_rank = num;
            }
            this.rhd_product_group = (i & 524288) == 0 ? RHDProductGroupDto.INSTANCE.getZeroValue() : rHDProductGroupDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.combined_commodity_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.combined_commodity_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 2, self.symbol);
            }
            String str = self.display_symbol;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 4, self.description);
            }
            if (!Intrinsics.areEqual(self.country, "")) {
                output.encodeStringElement(serialDesc, 5, self.country);
            }
            if (!Intrinsics.areEqual(self.exchange, "")) {
                output.encodeStringElement(serialDesc, 6, self.exchange);
            }
            if (!Intrinsics.areEqual(self.currency, "")) {
                output.encodeStringElement(serialDesc, 7, self.currency);
            }
            ProductFutureSubtypeDto productFutureSubtypeDto = self.future_sub_type;
            if (productFutureSubtypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ProductFutureSubtypeDto.Serializer.INSTANCE, productFutureSubtypeDto);
            }
            ProductUnderlyingAssetDto productUnderlyingAssetDto = self.underlying_asset;
            if (productUnderlyingAssetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ProductUnderlyingAssetDto.Serializer.INSTANCE, productUnderlyingAssetDto);
            }
            ProductDeliveryDto productDeliveryDto = self.delivery;
            if (productDeliveryDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ProductDeliveryDto.Serializer.INSTANCE, productDeliveryDto);
            }
            Boolean bool = self.is_standardized;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, BooleanSerializer.INSTANCE, bool);
            }
            if (!Intrinsics.areEqual(self.price_increments, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, self.price_increments);
            }
            String str2 = self.active_futures_contract_id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.long_description;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.simple_name;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, str4);
            }
            TradingHoursInfoDto tradingHoursInfoDto = self.trading_hours_info;
            if (tradingHoursInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, TradingHoursInfoDto.Serializer.INSTANCE, tradingHoursInfoDto);
            }
            String str5 = self.settlement_start_time;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, str5);
            }
            Integer num = self.search_rank;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            if (self.rhd_product_group != RHDProductGroupDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 19, RHDProductGroupDto.Serializer.INSTANCE, self.rhd_product_group);
            }
        }

        public Surrogate(String id, String combined_commodity_id, String symbol, String str, String description, String country, String exchange, String currency, ProductFutureSubtypeDto productFutureSubtypeDto, ProductUnderlyingAssetDto productUnderlyingAssetDto, ProductDeliveryDto productDeliveryDto, Boolean bool, IdlDecimal price_increments, String str2, String str3, String str4, TradingHoursInfoDto tradingHoursInfoDto, String str5, Integer num, RHDProductGroupDto rhd_product_group) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(combined_commodity_id, "combined_commodity_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(exchange, "exchange");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(price_increments, "price_increments");
            Intrinsics.checkNotNullParameter(rhd_product_group, "rhd_product_group");
            this.id = id;
            this.combined_commodity_id = combined_commodity_id;
            this.symbol = symbol;
            this.display_symbol = str;
            this.description = description;
            this.country = country;
            this.exchange = exchange;
            this.currency = currency;
            this.future_sub_type = productFutureSubtypeDto;
            this.underlying_asset = productUnderlyingAssetDto;
            this.delivery = productDeliveryDto;
            this.is_standardized = bool;
            this.price_increments = price_increments;
            this.active_futures_contract_id = str2;
            this.long_description = str3;
            this.simple_name = str4;
            this.trading_hours_info = tradingHoursInfoDto;
            this.settlement_start_time = str5;
            this.search_rank = num;
            this.rhd_product_group = rhd_product_group;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ProductFutureSubtypeDto productFutureSubtypeDto, ProductUnderlyingAssetDto productUnderlyingAssetDto, ProductDeliveryDto productDeliveryDto, Boolean bool, IdlDecimal idlDecimal, String str9, String str10, String str11, TradingHoursInfoDto tradingHoursInfoDto, String str12, Integer num, RHDProductGroupDto rHDProductGroupDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : productFutureSubtypeDto, (i & 512) != 0 ? null : productUnderlyingAssetDto, (i & 1024) != 0 ? null : productDeliveryDto, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : tradingHoursInfoDto, (i & 131072) != 0 ? null : str12, (i & 262144) != 0 ? null : num, (i & 524288) != 0 ? RHDProductGroupDto.INSTANCE.getZeroValue() : rHDProductGroupDto);
        }

        public final String getId() {
            return this.id;
        }

        public final String getCombined_commodity_id() {
            return this.combined_commodity_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getDisplay_symbol() {
            return this.display_symbol;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getExchange() {
            return this.exchange;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final ProductFutureSubtypeDto getFuture_sub_type() {
            return this.future_sub_type;
        }

        public final ProductUnderlyingAssetDto getUnderlying_asset() {
            return this.underlying_asset;
        }

        public final ProductDeliveryDto getDelivery() {
            return this.delivery;
        }

        public final Boolean is_standardized() {
            return this.is_standardized;
        }

        public final IdlDecimal getPrice_increments() {
            return this.price_increments;
        }

        public final String getActive_futures_contract_id() {
            return this.active_futures_contract_id;
        }

        public final String getLong_description() {
            return this.long_description;
        }

        public final String getSimple_name() {
            return this.simple_name;
        }

        public final TradingHoursInfoDto getTrading_hours_info() {
            return this.trading_hours_info;
        }

        public final String getSettlement_start_time() {
            return this.settlement_start_time;
        }

        public final Integer getSearch_rank() {
            return this.search_rank;
        }

        public final RHDProductGroupDto getRhd_product_group() {
            return this.rhd_product_group;
        }
    }

    /* compiled from: ProductDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "Lcom/robinhood/arsenal/proto/v1/idl/Product;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ProductDto, Product> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProductDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProductDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProductDto> getBinaryBase64Serializer() {
            return (KSerializer) ProductDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Product> getProtoAdapter() {
            return Product.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProductDto getZeroValue() {
            return ProductDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProductDto fromProto(Product proto) {
            ProductFutureSubtypeDto productFutureSubtypeDto;
            TradingHoursInfoDto tradingHoursInfoDtoFromProto;
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String combined_commodity_id = proto.getCombined_commodity_id();
            String symbol = proto.getSymbol();
            String display_symbol = proto.getDisplay_symbol();
            String description = proto.getDescription();
            String country = proto.getCountry();
            String exchange = proto.getExchange();
            String currency = proto.getCurrency();
            ProductFutureSubtype future_sub_type = proto.getFuture_sub_type();
            ProductFutureSubtypeDto productFutureSubtypeDtoFromProto = future_sub_type != null ? ProductFutureSubtypeDto.INSTANCE.fromProto(future_sub_type) : null;
            ProductUnderlyingAsset underlying_asset = proto.getUnderlying_asset();
            ProductUnderlyingAssetDto productUnderlyingAssetDtoFromProto = underlying_asset != null ? ProductUnderlyingAssetDto.INSTANCE.fromProto(underlying_asset) : null;
            ProductDelivery delivery = proto.getDelivery();
            ProductDeliveryDto productDeliveryDtoFromProto = delivery != null ? ProductDeliveryDto.INSTANCE.fromProto(delivery) : null;
            Boolean is_standardized = proto.getIs_standardized();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getPrice_increments());
            String active_futures_contract_id = proto.getActive_futures_contract_id();
            String long_description = proto.getLong_description();
            String simple_name = proto.getSimple_name();
            TradingHoursInfo trading_hours_info = proto.getTrading_hours_info();
            if (trading_hours_info != null) {
                ProductFutureSubtypeDto productFutureSubtypeDto2 = productFutureSubtypeDtoFromProto;
                tradingHoursInfoDtoFromProto = TradingHoursInfoDto.INSTANCE.fromProto(trading_hours_info);
                productFutureSubtypeDto = productFutureSubtypeDto2;
            } else {
                productFutureSubtypeDto = productFutureSubtypeDtoFromProto;
                tradingHoursInfoDtoFromProto = null;
            }
            return new ProductDto(new Surrogate(id, combined_commodity_id, symbol, display_symbol, description, country, exchange, currency, productFutureSubtypeDto, productUnderlyingAssetDtoFromProto, productDeliveryDtoFromProto, is_standardized, idlDecimal, active_futures_contract_id, long_description, simple_name, tradingHoursInfoDtoFromProto, proto.getSettlement_start_time(), proto.getSearch_rank(), RHDProductGroupDto.INSTANCE.fromProto(proto.getRhd_product_group())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.ProductDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ProductDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ProductDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ProductDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.Product", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ProductDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ProductDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ProductDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ProductDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.ProductDto";
        }
    }
}
