package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.CurrencyPairDetailsDto;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.ThirdPartyRouterCoinSpecDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.CurrencyPairType;
import rosetta.mainst.CurrencyPairTypeDto;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.InstrumentStateDto;
import rosetta.mainst.Tradability;
import rosetta.mainst.TradabilityDto;

/* compiled from: CurrencyPairDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\\]^_B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÙ\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u001d\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\u001d\u0012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'0\u001d\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010*\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010+JÖ\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u001d2\b\b\u0002\u0010#\u001a\u00020$2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\u001d2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'0\u001d2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010*\u001a\u00020\tJ\b\u0010O\u001a\u00020\u0002H\u0016J\b\u0010P\u001a\u00020\tH\u0016J\u0013\u0010Q\u001a\u00020\u001b2\b\u0010R\u001a\u0004\u0018\u00010SH\u0096\u0002J\b\u0010T\u001a\u00020UH\u0016J\u0018\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020UH\u0016J\b\u0010[\u001a\u00020UH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b5\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b6\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b7\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b8\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b9\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b:\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b;\u00102R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d8F¢\u0006\u0006\u001a\u0004\bB\u0010AR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010!\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bE\u0010DR\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u001d8F¢\u0006\u0006\u001a\u0004\bF\u0010AR\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\u001d8F¢\u0006\u0006\u001a\u0004\bI\u0010AR\u001d\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'0\u001d8F¢\u0006\u0006\u001a\u0004\bJ\u0010AR\u0013\u0010(\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bK\u00104R\u0013\u0010)\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bL\u00104R\u0011\u0010*\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bM\u0010-¨\u0006`"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Surrogate;)V", "name", "", "symbol", "state", "Lrosetta/mainst/InstrumentStateDto;", "min_tick_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "asset_currency", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "quote_currency", "min_order_size", "max_order_size", "min_order_price_increment", "min_order_quantity_increment", "min_quote_price_increment", "min_quote_quantity_increment", "rhc_tradability", "Lrosetta/mainst/TradabilityDto;", "fundamentals_enabled", "", "crypto_metadata", "", "venue_symbols", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "updated_at", "state_by_region", "currency_pair_type", "Lrosetta/mainst/CurrencyPairTypeDto;", "tradability_by_region", "third_party_router_coin_spec", "Lcom/robinhood/rosetta/mainst/ThirdPartyRouterCoinSpecDto;", "spot_currency_pair", "underlying_equity_instrument_id", "description", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradabilityDto;ZLjava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/Map;Lrosetta/mainst/CurrencyPairTypeDto;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSymbol", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsset_currency", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getQuote_currency", "getMin_order_size", "getMax_order_size", "getMin_order_price_increment", "getMin_order_quantity_increment", "getMin_quote_price_increment", "getMin_quote_quantity_increment", "getRhc_tradability", "()Lrosetta/mainst/TradabilityDto;", "getFundamentals_enabled", "()Z", "getCrypto_metadata", "()Ljava/util/Map;", "getVenue_symbols", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getUpdated_at", "getState_by_region", "getCurrency_pair_type", "()Lrosetta/mainst/CurrencyPairTypeDto;", "getTradability_by_region", "getThird_party_router_coin_spec", "getSpot_currency_pair", "getUnderlying_equity_instrument_id", "getDescription", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
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

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final InstrumentStateDto getState() {
        return this.surrogate.getState();
    }

    public final DecimalDto getMin_tick_size() {
        return this.surrogate.getMin_tick_size();
    }

    public final UUIDDto getAsset_currency() {
        return this.surrogate.getAsset_currency();
    }

    public final UUIDDto getQuote_currency() {
        return this.surrogate.getQuote_currency();
    }

    public final DecimalDto getMin_order_size() {
        return this.surrogate.getMin_order_size();
    }

    public final DecimalDto getMax_order_size() {
        return this.surrogate.getMax_order_size();
    }

    public final DecimalDto getMin_order_price_increment() {
        return this.surrogate.getMin_order_price_increment();
    }

    public final DecimalDto getMin_order_quantity_increment() {
        return this.surrogate.getMin_order_quantity_increment();
    }

    public final DecimalDto getMin_quote_price_increment() {
        return this.surrogate.getMin_quote_price_increment();
    }

    public final DecimalDto getMin_quote_quantity_increment() {
        return this.surrogate.getMin_quote_quantity_increment();
    }

    public final TradabilityDto getRhc_tradability() {
        return this.surrogate.getRhc_tradability();
    }

    public final boolean getFundamentals_enabled() {
        return this.surrogate.getFundamentals_enabled();
    }

    public final Map<String, String> getCrypto_metadata() {
        return this.surrogate.getCrypto_metadata();
    }

    public final Map<String, String> getVenue_symbols() {
        return this.surrogate.getVenue_symbols();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final Map<String, InstrumentStateDto> getState_by_region() {
        return this.surrogate.getState_by_region();
    }

    public final CurrencyPairTypeDto getCurrency_pair_type() {
        return this.surrogate.getCurrency_pair_type();
    }

    public final Map<String, TradabilityDto> getTradability_by_region() {
        return this.surrogate.getTradability_by_region();
    }

    public final Map<String, ThirdPartyRouterCoinSpecDto> getThird_party_router_coin_spec() {
        return this.surrogate.getThird_party_router_coin_spec();
    }

    public final UUIDDto getSpot_currency_pair() {
        return this.surrogate.getSpot_currency_pair();
    }

    public final UUIDDto getUnderlying_equity_instrument_id() {
        return this.surrogate.getUnderlying_equity_instrument_id();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public /* synthetic */ CurrencyPairDetailsDto(String str, String str2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, TradabilityDto tradabilityDto, boolean z, Map map, Map map2, TimeDto timeDto, TimeDto timeDto2, Map map3, CurrencyPairTypeDto currencyPairTypeDto, Map map4, Map map5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 8) != 0 ? null : decimalDto, (i & 16) != 0 ? null : uUIDDto, (i & 32) != 0 ? null : uUIDDto2, (i & 64) != 0 ? null : decimalDto2, (i & 128) != 0 ? null : decimalDto3, (i & 256) != 0 ? null : decimalDto4, (i & 512) != 0 ? null : decimalDto5, (i & 1024) != 0 ? null : decimalDto6, (i & 2048) != 0 ? null : decimalDto7, (i & 4096) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? MapsKt.emptyMap() : map, (i & 32768) != 0 ? MapsKt.emptyMap() : map2, (i & 65536) != 0 ? null : timeDto, (i & 131072) != 0 ? null : timeDto2, (i & 262144) != 0 ? MapsKt.emptyMap() : map3, (i & 524288) != 0 ? CurrencyPairTypeDto.INSTANCE.getZeroValue() : currencyPairTypeDto, (i & 1048576) != 0 ? MapsKt.emptyMap() : map4, (i & 2097152) != 0 ? MapsKt.emptyMap() : map5, (i & 4194304) != 0 ? null : uUIDDto3, (i & 8388608) != 0 ? null : uUIDDto4, (i & 16777216) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrencyPairDetailsDto(String name, String symbol, InstrumentStateDto state, DecimalDto decimalDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, TradabilityDto rhc_tradability, boolean z, Map<String, String> crypto_metadata, Map<String, String> venue_symbols, TimeDto timeDto, TimeDto timeDto2, Map<String, ? extends InstrumentStateDto> state_by_region, CurrencyPairTypeDto currency_pair_type, Map<String, ? extends TradabilityDto> tradability_by_region, Map<String, ThirdPartyRouterCoinSpecDto> third_party_router_coin_spec, UUIDDto uUIDDto3, UUIDDto uUIDDto4, String description) {
        this(new Surrogate(name, symbol, state, decimalDto, uUIDDto, uUIDDto2, decimalDto2, decimalDto3, decimalDto4, decimalDto5, decimalDto6, decimalDto7, rhc_tradability, z, crypto_metadata, venue_symbols, timeDto, timeDto2, state_by_region, currency_pair_type, tradability_by_region, third_party_router_coin_spec, uUIDDto3, uUIDDto4, description));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhc_tradability, "rhc_tradability");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(venue_symbols, "venue_symbols");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
        Intrinsics.checkNotNullParameter(currency_pair_type, "currency_pair_type");
        Intrinsics.checkNotNullParameter(tradability_by_region, "tradability_by_region");
        Intrinsics.checkNotNullParameter(third_party_router_coin_spec, "third_party_router_coin_spec");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public static /* synthetic */ CurrencyPairDetailsDto copy$default(CurrencyPairDetailsDto currencyPairDetailsDto, String str, String str2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, TradabilityDto tradabilityDto, boolean z, Map map, Map map2, TimeDto timeDto, TimeDto timeDto2, Map map3, CurrencyPairTypeDto currencyPairTypeDto, Map map4, Map map5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, String str3, int i, Object obj) {
        String description;
        UUIDDto uUIDDto5;
        String name = (i & 1) != 0 ? currencyPairDetailsDto.surrogate.getName() : str;
        String symbol = (i & 2) != 0 ? currencyPairDetailsDto.surrogate.getSymbol() : str2;
        InstrumentStateDto state = (i & 4) != 0 ? currencyPairDetailsDto.surrogate.getState() : instrumentStateDto;
        DecimalDto min_tick_size = (i & 8) != 0 ? currencyPairDetailsDto.surrogate.getMin_tick_size() : decimalDto;
        UUIDDto asset_currency = (i & 16) != 0 ? currencyPairDetailsDto.surrogate.getAsset_currency() : uUIDDto;
        UUIDDto quote_currency = (i & 32) != 0 ? currencyPairDetailsDto.surrogate.getQuote_currency() : uUIDDto2;
        DecimalDto min_order_size = (i & 64) != 0 ? currencyPairDetailsDto.surrogate.getMin_order_size() : decimalDto2;
        DecimalDto max_order_size = (i & 128) != 0 ? currencyPairDetailsDto.surrogate.getMax_order_size() : decimalDto3;
        DecimalDto min_order_price_increment = (i & 256) != 0 ? currencyPairDetailsDto.surrogate.getMin_order_price_increment() : decimalDto4;
        DecimalDto min_order_quantity_increment = (i & 512) != 0 ? currencyPairDetailsDto.surrogate.getMin_order_quantity_increment() : decimalDto5;
        DecimalDto min_quote_price_increment = (i & 1024) != 0 ? currencyPairDetailsDto.surrogate.getMin_quote_price_increment() : decimalDto6;
        DecimalDto min_quote_quantity_increment = (i & 2048) != 0 ? currencyPairDetailsDto.surrogate.getMin_quote_quantity_increment() : decimalDto7;
        TradabilityDto rhc_tradability = (i & 4096) != 0 ? currencyPairDetailsDto.surrogate.getRhc_tradability() : tradabilityDto;
        boolean fundamentals_enabled = (i & 8192) != 0 ? currencyPairDetailsDto.surrogate.getFundamentals_enabled() : z;
        String str4 = name;
        Map crypto_metadata = (i & 16384) != 0 ? currencyPairDetailsDto.surrogate.getCrypto_metadata() : map;
        Map venue_symbols = (i & 32768) != 0 ? currencyPairDetailsDto.surrogate.getVenue_symbols() : map2;
        TimeDto created_at = (i & 65536) != 0 ? currencyPairDetailsDto.surrogate.getCreated_at() : timeDto;
        TimeDto updated_at = (i & 131072) != 0 ? currencyPairDetailsDto.surrogate.getUpdated_at() : timeDto2;
        Map state_by_region = (i & 262144) != 0 ? currencyPairDetailsDto.surrogate.getState_by_region() : map3;
        CurrencyPairTypeDto currency_pair_type = (i & 524288) != 0 ? currencyPairDetailsDto.surrogate.getCurrency_pair_type() : currencyPairTypeDto;
        Map tradability_by_region = (i & 1048576) != 0 ? currencyPairDetailsDto.surrogate.getTradability_by_region() : map4;
        Map third_party_router_coin_spec = (i & 2097152) != 0 ? currencyPairDetailsDto.surrogate.getThird_party_router_coin_spec() : map5;
        UUIDDto spot_currency_pair = (i & 4194304) != 0 ? currencyPairDetailsDto.surrogate.getSpot_currency_pair() : uUIDDto3;
        UUIDDto underlying_equity_instrument_id = (i & 8388608) != 0 ? currencyPairDetailsDto.surrogate.getUnderlying_equity_instrument_id() : uUIDDto4;
        if ((i & 16777216) != 0) {
            uUIDDto5 = underlying_equity_instrument_id;
            description = currencyPairDetailsDto.surrogate.getDescription();
        } else {
            description = str3;
            uUIDDto5 = underlying_equity_instrument_id;
        }
        return currencyPairDetailsDto.copy(str4, symbol, state, min_tick_size, asset_currency, quote_currency, min_order_size, max_order_size, min_order_price_increment, min_order_quantity_increment, min_quote_price_increment, min_quote_quantity_increment, rhc_tradability, fundamentals_enabled, crypto_metadata, venue_symbols, created_at, updated_at, state_by_region, currency_pair_type, tradability_by_region, third_party_router_coin_spec, spot_currency_pair, uUIDDto5, description);
    }

    public final CurrencyPairDetailsDto copy(String name, String symbol, InstrumentStateDto state, DecimalDto min_tick_size, UUIDDto asset_currency, UUIDDto quote_currency, DecimalDto min_order_size, DecimalDto max_order_size, DecimalDto min_order_price_increment, DecimalDto min_order_quantity_increment, DecimalDto min_quote_price_increment, DecimalDto min_quote_quantity_increment, TradabilityDto rhc_tradability, boolean fundamentals_enabled, Map<String, String> crypto_metadata, Map<String, String> venue_symbols, TimeDto created_at, TimeDto updated_at, Map<String, ? extends InstrumentStateDto> state_by_region, CurrencyPairTypeDto currency_pair_type, Map<String, ? extends TradabilityDto> tradability_by_region, Map<String, ThirdPartyRouterCoinSpecDto> third_party_router_coin_spec, UUIDDto spot_currency_pair, UUIDDto underlying_equity_instrument_id, String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhc_tradability, "rhc_tradability");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(venue_symbols, "venue_symbols");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
        Intrinsics.checkNotNullParameter(currency_pair_type, "currency_pair_type");
        Intrinsics.checkNotNullParameter(tradability_by_region, "tradability_by_region");
        Intrinsics.checkNotNullParameter(third_party_router_coin_spec, "third_party_router_coin_spec");
        Intrinsics.checkNotNullParameter(description, "description");
        return new CurrencyPairDetailsDto(new Surrogate(name, symbol, state, min_tick_size, asset_currency, quote_currency, min_order_size, max_order_size, min_order_price_increment, min_order_quantity_increment, min_quote_price_increment, min_quote_quantity_increment, rhc_tradability, fundamentals_enabled, crypto_metadata, venue_symbols, created_at, updated_at, state_by_region, currency_pair_type, tradability_by_region, third_party_router_coin_spec, spot_currency_pair, underlying_equity_instrument_id, description));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CurrencyPairDetails toProto() {
        String name = this.surrogate.getName();
        String symbol = this.surrogate.getSymbol();
        InstrumentState instrumentState = (InstrumentState) this.surrogate.getState().toProto();
        DecimalDto min_tick_size = this.surrogate.getMin_tick_size();
        Decimal proto = min_tick_size != null ? min_tick_size.toProto() : null;
        UUIDDto asset_currency = this.surrogate.getAsset_currency();
        UUID proto2 = asset_currency != null ? asset_currency.toProto() : null;
        UUIDDto quote_currency = this.surrogate.getQuote_currency();
        UUID proto3 = quote_currency != null ? quote_currency.toProto() : null;
        DecimalDto min_order_size = this.surrogate.getMin_order_size();
        Decimal proto4 = min_order_size != null ? min_order_size.toProto() : null;
        DecimalDto max_order_size = this.surrogate.getMax_order_size();
        Decimal proto5 = max_order_size != null ? max_order_size.toProto() : null;
        DecimalDto min_order_price_increment = this.surrogate.getMin_order_price_increment();
        Decimal proto6 = min_order_price_increment != null ? min_order_price_increment.toProto() : null;
        DecimalDto min_order_quantity_increment = this.surrogate.getMin_order_quantity_increment();
        Decimal proto7 = min_order_quantity_increment != null ? min_order_quantity_increment.toProto() : null;
        DecimalDto min_quote_price_increment = this.surrogate.getMin_quote_price_increment();
        Decimal proto8 = min_quote_price_increment != null ? min_quote_price_increment.toProto() : null;
        DecimalDto min_quote_quantity_increment = this.surrogate.getMin_quote_quantity_increment();
        Decimal proto9 = min_quote_quantity_increment != null ? min_quote_quantity_increment.toProto() : null;
        Tradability tradability = (Tradability) this.surrogate.getRhc_tradability().toProto();
        boolean fundamentals_enabled = this.surrogate.getFundamentals_enabled();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getCrypto_metadata().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            name = name;
            it = it2;
        }
        String str = name;
        Set<Map.Entry<String, String>> setEntrySet2 = this.surrogate.getVenue_symbols().entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
        Iterator it3 = setEntrySet2.iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            Iterator it4 = it3;
            Tuples2 tuples2M3642to2 = Tuples4.m3642to((String) entry2.getKey(), (String) entry2.getValue());
            linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
            it3 = it4;
        }
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto10 = created_at != null ? created_at.toProto() : null;
        TimeDto updated_at = this.surrogate.getUpdated_at();
        Time proto11 = updated_at != null ? updated_at.toProto() : null;
        Set<Map.Entry<String, InstrumentStateDto>> setEntrySet3 = this.surrogate.getState_by_region().entrySet();
        Time time = proto10;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet3, 10)), 16));
        Iterator it5 = setEntrySet3.iterator();
        while (it5.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it5.next();
            Iterator it6 = it5;
            Tuples2 tuples2M3642to3 = Tuples4.m3642to((String) entry3.getKey(), ((InstrumentStateDto) entry3.getValue()).toProto());
            linkedHashMap3.put(tuples2M3642to3.getFirst(), tuples2M3642to3.getSecond());
            proto11 = proto11;
            it5 = it6;
        }
        Time time2 = proto11;
        CurrencyPairType currencyPairType = (CurrencyPairType) this.surrogate.getCurrency_pair_type().toProto();
        Set<Map.Entry<String, TradabilityDto>> setEntrySet4 = this.surrogate.getTradability_by_region().entrySet();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet4, 10)), 16));
        Iterator it7 = setEntrySet4.iterator();
        while (it7.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it7.next();
            Iterator it8 = it7;
            Tuples2 tuples2M3642to4 = Tuples4.m3642to((String) entry4.getKey(), ((TradabilityDto) entry4.getValue()).toProto());
            linkedHashMap4.put(tuples2M3642to4.getFirst(), tuples2M3642to4.getSecond());
            it7 = it8;
        }
        Set<Map.Entry<String, ThirdPartyRouterCoinSpecDto>> setEntrySet5 = this.surrogate.getThird_party_router_coin_spec().entrySet();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet5, 10)), 16));
        Iterator it9 = setEntrySet5.iterator();
        while (it9.hasNext()) {
            Map.Entry entry5 = (Map.Entry) it9.next();
            Iterator it10 = it9;
            Tuples2 tuples2M3642to5 = Tuples4.m3642to((String) entry5.getKey(), ((ThirdPartyRouterCoinSpecDto) entry5.getValue()).toProto());
            linkedHashMap5.put(tuples2M3642to5.getFirst(), tuples2M3642to5.getSecond());
            linkedHashMap4 = linkedHashMap4;
            it9 = it10;
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        UUIDDto spot_currency_pair = this.surrogate.getSpot_currency_pair();
        UUID proto12 = spot_currency_pair != null ? spot_currency_pair.toProto() : null;
        UUIDDto underlying_equity_instrument_id = this.surrogate.getUnderlying_equity_instrument_id();
        return new CurrencyPairDetails(str, symbol, instrumentState, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, tradability, fundamentals_enabled, linkedHashMap, linkedHashMap2, time, time2, linkedHashMap3, currencyPairType, linkedHashMap6, linkedHashMap5, proto12, underlying_equity_instrument_id != null ? underlying_equity_instrument_id.toProto() : null, this.surrogate.getDescription(), null, 33554432, null);
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
    @kotlin.Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\\\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u008f\u00012\u00020\u0001:\u0004\u008e\u0001\u008f\u0001B×\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0017\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0017\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010$\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&BÏ\u0002\b\u0010\u0012\u0006\u0010'\u001a\u00020(\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0018\u00010\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0004\b%\u0010+J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010t\u001a\u00020\u0013HÆ\u0003J\t\u0010u\u001a\u00020\u0015HÆ\u0003J\u0015\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017HÆ\u0003J\u0015\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0015\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0017HÆ\u0003J\t\u0010{\u001a\u00020\u001eHÆ\u0003J\u0015\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0017HÆ\u0003J\u0015\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0017HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003JÚ\u0002\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00172\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00172\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u00172\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010$\u001a\u00020\u0003HÆ\u0001J\u0015\u0010\u0082\u0001\u001a\u00020\u00152\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0084\u0001\u001a\u00020(HÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0001¢\u0006\u0003\b\u008d\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010-\u001a\u0004\b6\u00107R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010-\u001a\u0004\b9\u0010:R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010-\u001a\u0004\b<\u0010:R\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010-\u001a\u0004\b>\u00107R\u001e\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010-\u001a\u0004\b@\u00107R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010-\u001a\u0004\bB\u00107R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010-\u001a\u0004\bD\u00107R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010-\u001a\u0004\bF\u00107R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010-\u001a\u0004\bH\u00107R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010-\u001a\u0004\bJ\u0010KR\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010-\u001a\u0004\bM\u0010NR(\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010-\u001a\u0004\bP\u0010QR(\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010-\u001a\u0004\bS\u0010QR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010-\u001a\u0004\bU\u0010VR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010-\u001a\u0004\bX\u0010VR(\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010-\u001a\u0004\bZ\u0010QR\u001c\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010-\u001a\u0004\b\\\u0010]R(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010-\u001a\u0004\b_\u0010QR(\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010-\u001a\u0004\ba\u0010QR\u001e\u0010\"\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u0010-\u001a\u0004\bc\u0010:R\u001e\u0010#\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bd\u0010-\u001a\u0004\be\u0010:R\u001c\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010-\u001a\u0004\bg\u0010/¨\u0006\u0090\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Surrogate;", "", "name", "", "symbol", "state", "Lrosetta/mainst/InstrumentStateDto;", "min_tick_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "asset_currency", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "quote_currency", "min_order_size", "max_order_size", "min_order_price_increment", "min_order_quantity_increment", "min_quote_price_increment", "min_quote_quantity_increment", "rhc_tradability", "Lrosetta/mainst/TradabilityDto;", "fundamentals_enabled", "", "crypto_metadata", "", "venue_symbols", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "updated_at", "state_by_region", "currency_pair_type", "Lrosetta/mainst/CurrencyPairTypeDto;", "tradability_by_region", "third_party_router_coin_spec", "Lcom/robinhood/rosetta/mainst/ThirdPartyRouterCoinSpecDto;", "spot_currency_pair", "underlying_equity_instrument_id", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradabilityDto;ZLjava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/Map;Lrosetta/mainst/CurrencyPairTypeDto;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradabilityDto;ZLjava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/Map;Lrosetta/mainst/CurrencyPairTypeDto;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getSymbol$annotations", "getSymbol", "getState$annotations", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getMin_tick_size$annotations", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsset_currency$annotations", "getAsset_currency", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getQuote_currency$annotations", "getQuote_currency", "getMin_order_size$annotations", "getMin_order_size", "getMax_order_size$annotations", "getMax_order_size", "getMin_order_price_increment$annotations", "getMin_order_price_increment", "getMin_order_quantity_increment$annotations", "getMin_order_quantity_increment", "getMin_quote_price_increment$annotations", "getMin_quote_price_increment", "getMin_quote_quantity_increment$annotations", "getMin_quote_quantity_increment", "getRhc_tradability$annotations", "getRhc_tradability", "()Lrosetta/mainst/TradabilityDto;", "getFundamentals_enabled$annotations", "getFundamentals_enabled", "()Z", "getCrypto_metadata$annotations", "getCrypto_metadata", "()Ljava/util/Map;", "getVenue_symbols$annotations", "getVenue_symbols", "getCreated_at$annotations", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getUpdated_at$annotations", "getUpdated_at", "getState_by_region$annotations", "getState_by_region", "getCurrency_pair_type$annotations", "getCurrency_pair_type", "()Lrosetta/mainst/CurrencyPairTypeDto;", "getTradability_by_region$annotations", "getTradability_by_region", "getThird_party_router_coin_spec$annotations", "getThird_party_router_coin_spec", "getSpot_currency_pair$annotations", "getSpot_currency_pair", "getUnderlying_equity_instrument_id$annotations", "getUnderlying_equity_instrument_id", "getDescription$annotations", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UUIDDto asset_currency;
        private final TimeDto created_at;
        private final Map<String, String> crypto_metadata;
        private final CurrencyPairTypeDto currency_pair_type;
        private final String description;
        private final boolean fundamentals_enabled;
        private final DecimalDto max_order_size;
        private final DecimalDto min_order_price_increment;
        private final DecimalDto min_order_quantity_increment;
        private final DecimalDto min_order_size;
        private final DecimalDto min_quote_price_increment;
        private final DecimalDto min_quote_quantity_increment;
        private final DecimalDto min_tick_size;
        private final String name;
        private final UUIDDto quote_currency;
        private final TradabilityDto rhc_tradability;
        private final UUIDDto spot_currency_pair;
        private final InstrumentStateDto state;
        private final Map<String, InstrumentStateDto> state_by_region;
        private final String symbol;
        private final Map<String, ThirdPartyRouterCoinSpecDto> third_party_router_coin_spec;
        private final Map<String, TradabilityDto> tradability_by_region;
        private final UUIDDto underlying_equity_instrument_id;
        private final TimeDto updated_at;
        private final Map<String, String> venue_symbols;

        public Surrogate() {
            this((String) null, (String) null, (InstrumentStateDto) null, (DecimalDto) null, (UUIDDto) null, (UUIDDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (TradabilityDto) null, false, (Map) null, (Map) null, (TimeDto) null, (TimeDto) null, (Map) null, (CurrencyPairTypeDto) null, (Map) null, (Map) null, (UUIDDto) null, (UUIDDto) null, (String) null, 33554431, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, InstrumentStateDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, TradabilityDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, ThirdPartyRouterCoinSpecDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, TradabilityDto tradabilityDto, boolean z, Map map, Map map2, TimeDto timeDto, TimeDto timeDto2, Map map3, CurrencyPairTypeDto currencyPairTypeDto, Map map4, Map map5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, String str3, int i, Object obj) {
            String str4;
            UUIDDto uUIDDto5;
            String str5 = (i & 1) != 0 ? surrogate.name : str;
            String str6 = (i & 2) != 0 ? surrogate.symbol : str2;
            InstrumentStateDto instrumentStateDto2 = (i & 4) != 0 ? surrogate.state : instrumentStateDto;
            DecimalDto decimalDto8 = (i & 8) != 0 ? surrogate.min_tick_size : decimalDto;
            UUIDDto uUIDDto6 = (i & 16) != 0 ? surrogate.asset_currency : uUIDDto;
            UUIDDto uUIDDto7 = (i & 32) != 0 ? surrogate.quote_currency : uUIDDto2;
            DecimalDto decimalDto9 = (i & 64) != 0 ? surrogate.min_order_size : decimalDto2;
            DecimalDto decimalDto10 = (i & 128) != 0 ? surrogate.max_order_size : decimalDto3;
            DecimalDto decimalDto11 = (i & 256) != 0 ? surrogate.min_order_price_increment : decimalDto4;
            DecimalDto decimalDto12 = (i & 512) != 0 ? surrogate.min_order_quantity_increment : decimalDto5;
            DecimalDto decimalDto13 = (i & 1024) != 0 ? surrogate.min_quote_price_increment : decimalDto6;
            DecimalDto decimalDto14 = (i & 2048) != 0 ? surrogate.min_quote_quantity_increment : decimalDto7;
            TradabilityDto tradabilityDto2 = (i & 4096) != 0 ? surrogate.rhc_tradability : tradabilityDto;
            boolean z2 = (i & 8192) != 0 ? surrogate.fundamentals_enabled : z;
            String str7 = str5;
            Map map6 = (i & 16384) != 0 ? surrogate.crypto_metadata : map;
            Map map7 = (i & 32768) != 0 ? surrogate.venue_symbols : map2;
            TimeDto timeDto3 = (i & 65536) != 0 ? surrogate.created_at : timeDto;
            TimeDto timeDto4 = (i & 131072) != 0 ? surrogate.updated_at : timeDto2;
            Map map8 = (i & 262144) != 0 ? surrogate.state_by_region : map3;
            CurrencyPairTypeDto currencyPairTypeDto2 = (i & 524288) != 0 ? surrogate.currency_pair_type : currencyPairTypeDto;
            Map map9 = (i & 1048576) != 0 ? surrogate.tradability_by_region : map4;
            Map map10 = (i & 2097152) != 0 ? surrogate.third_party_router_coin_spec : map5;
            UUIDDto uUIDDto8 = (i & 4194304) != 0 ? surrogate.spot_currency_pair : uUIDDto3;
            UUIDDto uUIDDto9 = (i & 8388608) != 0 ? surrogate.underlying_equity_instrument_id : uUIDDto4;
            if ((i & 16777216) != 0) {
                uUIDDto5 = uUIDDto9;
                str4 = surrogate.description;
            } else {
                str4 = str3;
                uUIDDto5 = uUIDDto9;
            }
            return surrogate.copy(str7, str6, instrumentStateDto2, decimalDto8, uUIDDto6, uUIDDto7, decimalDto9, decimalDto10, decimalDto11, decimalDto12, decimalDto13, decimalDto14, tradabilityDto2, z2, map6, map7, timeDto3, timeDto4, map8, currencyPairTypeDto2, map9, map10, uUIDDto8, uUIDDto5, str4);
        }

        @SerialName("assetCurrency")
        @JsonAnnotations2(names = {"asset_currency"})
        public static /* synthetic */ void getAsset_currency$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("cryptoMetadata")
        @JsonAnnotations2(names = {"crypto_metadata"})
        public static /* synthetic */ void getCrypto_metadata$annotations() {
        }

        @SerialName("currencyPairType")
        @JsonAnnotations2(names = {"currency_pair_type"})
        public static /* synthetic */ void getCurrency_pair_type$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("fundamentalsEnabled")
        @JsonAnnotations2(names = {"fundamentals_enabled"})
        public static /* synthetic */ void getFundamentals_enabled$annotations() {
        }

        @SerialName("maxOrderSize")
        @JsonAnnotations2(names = {"max_order_size"})
        public static /* synthetic */ void getMax_order_size$annotations() {
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

        @SerialName("minQuotePriceIncrement")
        @JsonAnnotations2(names = {"min_quote_price_increment"})
        public static /* synthetic */ void getMin_quote_price_increment$annotations() {
        }

        @SerialName("minQuoteQuantityIncrement")
        @JsonAnnotations2(names = {"min_quote_quantity_increment"})
        public static /* synthetic */ void getMin_quote_quantity_increment$annotations() {
        }

        @SerialName("minTickSize")
        @JsonAnnotations2(names = {"min_tick_size"})
        public static /* synthetic */ void getMin_tick_size$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("quoteCurrency")
        @JsonAnnotations2(names = {"quote_currency"})
        public static /* synthetic */ void getQuote_currency$annotations() {
        }

        @SerialName("rhcTradability")
        @JsonAnnotations2(names = {"rhc_tradability"})
        public static /* synthetic */ void getRhc_tradability$annotations() {
        }

        @SerialName("spotCurrencyPair")
        @JsonAnnotations2(names = {"spot_currency_pair"})
        public static /* synthetic */ void getSpot_currency_pair$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("stateByRegion")
        @JsonAnnotations2(names = {"state_by_region"})
        public static /* synthetic */ void getState_by_region$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("thirdPartyRouterCoinSpec")
        @JsonAnnotations2(names = {"third_party_router_coin_spec"})
        public static /* synthetic */ void getThird_party_router_coin_spec$annotations() {
        }

        @SerialName("tradabilityByRegion")
        @JsonAnnotations2(names = {"tradability_by_region"})
        public static /* synthetic */ void getTradability_by_region$annotations() {
        }

        @SerialName("underlyingEquityInstrumentId")
        @JsonAnnotations2(names = {"underlying_equity_instrument_id"})
        public static /* synthetic */ void getUnderlying_equity_instrument_id$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        @SerialName("venueSymbols")
        @JsonAnnotations2(names = {"venue_symbols"})
        public static /* synthetic */ void getVenue_symbols$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component10, reason: from getter */
        public final DecimalDto getMin_order_quantity_increment() {
            return this.min_order_quantity_increment;
        }

        /* renamed from: component11, reason: from getter */
        public final DecimalDto getMin_quote_price_increment() {
            return this.min_quote_price_increment;
        }

        /* renamed from: component12, reason: from getter */
        public final DecimalDto getMin_quote_quantity_increment() {
            return this.min_quote_quantity_increment;
        }

        /* renamed from: component13, reason: from getter */
        public final TradabilityDto getRhc_tradability() {
            return this.rhc_tradability;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getFundamentals_enabled() {
            return this.fundamentals_enabled;
        }

        public final Map<String, String> component15() {
            return this.crypto_metadata;
        }

        public final Map<String, String> component16() {
            return this.venue_symbols;
        }

        /* renamed from: component17, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component18, reason: from getter */
        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        public final Map<String, InstrumentStateDto> component19() {
            return this.state_by_region;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component20, reason: from getter */
        public final CurrencyPairTypeDto getCurrency_pair_type() {
            return this.currency_pair_type;
        }

        public final Map<String, TradabilityDto> component21() {
            return this.tradability_by_region;
        }

        public final Map<String, ThirdPartyRouterCoinSpecDto> component22() {
            return this.third_party_router_coin_spec;
        }

        /* renamed from: component23, reason: from getter */
        public final UUIDDto getSpot_currency_pair() {
            return this.spot_currency_pair;
        }

        /* renamed from: component24, reason: from getter */
        public final UUIDDto getUnderlying_equity_instrument_id() {
            return this.underlying_equity_instrument_id;
        }

        /* renamed from: component25, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final InstrumentStateDto getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final DecimalDto getMin_tick_size() {
            return this.min_tick_size;
        }

        /* renamed from: component5, reason: from getter */
        public final UUIDDto getAsset_currency() {
            return this.asset_currency;
        }

        /* renamed from: component6, reason: from getter */
        public final UUIDDto getQuote_currency() {
            return this.quote_currency;
        }

        /* renamed from: component7, reason: from getter */
        public final DecimalDto getMin_order_size() {
            return this.min_order_size;
        }

        /* renamed from: component8, reason: from getter */
        public final DecimalDto getMax_order_size() {
            return this.max_order_size;
        }

        /* renamed from: component9, reason: from getter */
        public final DecimalDto getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        public final Surrogate copy(String name, String symbol, InstrumentStateDto state, DecimalDto min_tick_size, UUIDDto asset_currency, UUIDDto quote_currency, DecimalDto min_order_size, DecimalDto max_order_size, DecimalDto min_order_price_increment, DecimalDto min_order_quantity_increment, DecimalDto min_quote_price_increment, DecimalDto min_quote_quantity_increment, TradabilityDto rhc_tradability, boolean fundamentals_enabled, Map<String, String> crypto_metadata, Map<String, String> venue_symbols, TimeDto created_at, TimeDto updated_at, Map<String, ? extends InstrumentStateDto> state_by_region, CurrencyPairTypeDto currency_pair_type, Map<String, ? extends TradabilityDto> tradability_by_region, Map<String, ThirdPartyRouterCoinSpecDto> third_party_router_coin_spec, UUIDDto spot_currency_pair, UUIDDto underlying_equity_instrument_id, String description) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rhc_tradability, "rhc_tradability");
            Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
            Intrinsics.checkNotNullParameter(venue_symbols, "venue_symbols");
            Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
            Intrinsics.checkNotNullParameter(currency_pair_type, "currency_pair_type");
            Intrinsics.checkNotNullParameter(tradability_by_region, "tradability_by_region");
            Intrinsics.checkNotNullParameter(third_party_router_coin_spec, "third_party_router_coin_spec");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Surrogate(name, symbol, state, min_tick_size, asset_currency, quote_currency, min_order_size, max_order_size, min_order_price_increment, min_order_quantity_increment, min_quote_price_increment, min_quote_quantity_increment, rhc_tradability, fundamentals_enabled, crypto_metadata, venue_symbols, created_at, updated_at, state_by_region, currency_pair_type, tradability_by_region, third_party_router_coin_spec, spot_currency_pair, underlying_equity_instrument_id, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.state == surrogate.state && Intrinsics.areEqual(this.min_tick_size, surrogate.min_tick_size) && Intrinsics.areEqual(this.asset_currency, surrogate.asset_currency) && Intrinsics.areEqual(this.quote_currency, surrogate.quote_currency) && Intrinsics.areEqual(this.min_order_size, surrogate.min_order_size) && Intrinsics.areEqual(this.max_order_size, surrogate.max_order_size) && Intrinsics.areEqual(this.min_order_price_increment, surrogate.min_order_price_increment) && Intrinsics.areEqual(this.min_order_quantity_increment, surrogate.min_order_quantity_increment) && Intrinsics.areEqual(this.min_quote_price_increment, surrogate.min_quote_price_increment) && Intrinsics.areEqual(this.min_quote_quantity_increment, surrogate.min_quote_quantity_increment) && this.rhc_tradability == surrogate.rhc_tradability && this.fundamentals_enabled == surrogate.fundamentals_enabled && Intrinsics.areEqual(this.crypto_metadata, surrogate.crypto_metadata) && Intrinsics.areEqual(this.venue_symbols, surrogate.venue_symbols) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.state_by_region, surrogate.state_by_region) && this.currency_pair_type == surrogate.currency_pair_type && Intrinsics.areEqual(this.tradability_by_region, surrogate.tradability_by_region) && Intrinsics.areEqual(this.third_party_router_coin_spec, surrogate.third_party_router_coin_spec) && Intrinsics.areEqual(this.spot_currency_pair, surrogate.spot_currency_pair) && Intrinsics.areEqual(this.underlying_equity_instrument_id, surrogate.underlying_equity_instrument_id) && Intrinsics.areEqual(this.description, surrogate.description);
        }

        public int hashCode() {
            int iHashCode = ((((this.name.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.state.hashCode()) * 31;
            DecimalDto decimalDto = this.min_tick_size;
            int iHashCode2 = (iHashCode + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            UUIDDto uUIDDto = this.asset_currency;
            int iHashCode3 = (iHashCode2 + (uUIDDto == null ? 0 : uUIDDto.hashCode())) * 31;
            UUIDDto uUIDDto2 = this.quote_currency;
            int iHashCode4 = (iHashCode3 + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31;
            DecimalDto decimalDto2 = this.min_order_size;
            int iHashCode5 = (iHashCode4 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.max_order_size;
            int iHashCode6 = (iHashCode5 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            DecimalDto decimalDto4 = this.min_order_price_increment;
            int iHashCode7 = (iHashCode6 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31;
            DecimalDto decimalDto5 = this.min_order_quantity_increment;
            int iHashCode8 = (iHashCode7 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31;
            DecimalDto decimalDto6 = this.min_quote_price_increment;
            int iHashCode9 = (iHashCode8 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31;
            DecimalDto decimalDto7 = this.min_quote_quantity_increment;
            int iHashCode10 = (((((((((iHashCode9 + (decimalDto7 == null ? 0 : decimalDto7.hashCode())) * 31) + this.rhc_tradability.hashCode()) * 31) + Boolean.hashCode(this.fundamentals_enabled)) * 31) + this.crypto_metadata.hashCode()) * 31) + this.venue_symbols.hashCode()) * 31;
            TimeDto timeDto = this.created_at;
            int iHashCode11 = (iHashCode10 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.updated_at;
            int iHashCode12 = (((((((((iHashCode11 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + this.state_by_region.hashCode()) * 31) + this.currency_pair_type.hashCode()) * 31) + this.tradability_by_region.hashCode()) * 31) + this.third_party_router_coin_spec.hashCode()) * 31;
            UUIDDto uUIDDto3 = this.spot_currency_pair;
            int iHashCode13 = (iHashCode12 + (uUIDDto3 == null ? 0 : uUIDDto3.hashCode())) * 31;
            UUIDDto uUIDDto4 = this.underlying_equity_instrument_id;
            return ((iHashCode13 + (uUIDDto4 != null ? uUIDDto4.hashCode() : 0)) * 31) + this.description.hashCode();
        }

        public String toString() {
            return "Surrogate(name=" + this.name + ", symbol=" + this.symbol + ", state=" + this.state + ", min_tick_size=" + this.min_tick_size + ", asset_currency=" + this.asset_currency + ", quote_currency=" + this.quote_currency + ", min_order_size=" + this.min_order_size + ", max_order_size=" + this.max_order_size + ", min_order_price_increment=" + this.min_order_price_increment + ", min_order_quantity_increment=" + this.min_order_quantity_increment + ", min_quote_price_increment=" + this.min_quote_price_increment + ", min_quote_quantity_increment=" + this.min_quote_quantity_increment + ", rhc_tradability=" + this.rhc_tradability + ", fundamentals_enabled=" + this.fundamentals_enabled + ", crypto_metadata=" + this.crypto_metadata + ", venue_symbols=" + this.venue_symbols + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", state_by_region=" + this.state_by_region + ", currency_pair_type=" + this.currency_pair_type + ", tradability_by_region=" + this.tradability_by_region + ", third_party_router_coin_spec=" + this.third_party_router_coin_spec + ", spot_currency_pair=" + this.spot_currency_pair + ", underlying_equity_instrument_id=" + this.underlying_equity_instrument_id + ", description=" + this.description + ")";
        }

        /* compiled from: CurrencyPairDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CurrencyPairDetailsDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetailsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetailsDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetailsDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetailsDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetailsDto$Surrogate$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyPairDetailsDto.Surrogate._childSerializers$_anonymous_$3();
                }
            }), null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, TradabilityDto tradabilityDto, boolean z, Map map, Map map2, TimeDto timeDto, TimeDto timeDto2, Map map3, CurrencyPairTypeDto currencyPairTypeDto, Map map4, Map map5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.name = "";
            } else {
                this.name = str;
            }
            if ((i & 2) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 4) == 0) {
                this.state = InstrumentStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = instrumentStateDto;
            }
            if ((i & 8) == 0) {
                this.min_tick_size = null;
            } else {
                this.min_tick_size = decimalDto;
            }
            if ((i & 16) == 0) {
                this.asset_currency = null;
            } else {
                this.asset_currency = uUIDDto;
            }
            if ((i & 32) == 0) {
                this.quote_currency = null;
            } else {
                this.quote_currency = uUIDDto2;
            }
            if ((i & 64) == 0) {
                this.min_order_size = null;
            } else {
                this.min_order_size = decimalDto2;
            }
            if ((i & 128) == 0) {
                this.max_order_size = null;
            } else {
                this.max_order_size = decimalDto3;
            }
            if ((i & 256) == 0) {
                this.min_order_price_increment = null;
            } else {
                this.min_order_price_increment = decimalDto4;
            }
            if ((i & 512) == 0) {
                this.min_order_quantity_increment = null;
            } else {
                this.min_order_quantity_increment = decimalDto5;
            }
            if ((i & 1024) == 0) {
                this.min_quote_price_increment = null;
            } else {
                this.min_quote_price_increment = decimalDto6;
            }
            if ((i & 2048) == 0) {
                this.min_quote_quantity_increment = null;
            } else {
                this.min_quote_quantity_increment = decimalDto7;
            }
            this.rhc_tradability = (i & 4096) == 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto;
            this.fundamentals_enabled = (i & 8192) == 0 ? false : z;
            this.crypto_metadata = (i & 16384) == 0 ? MapsKt.emptyMap() : map;
            this.venue_symbols = (32768 & i) == 0 ? MapsKt.emptyMap() : map2;
            if ((65536 & i) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto;
            }
            if ((131072 & i) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = timeDto2;
            }
            this.state_by_region = (262144 & i) == 0 ? MapsKt.emptyMap() : map3;
            this.currency_pair_type = (524288 & i) == 0 ? CurrencyPairTypeDto.INSTANCE.getZeroValue() : currencyPairTypeDto;
            this.tradability_by_region = (1048576 & i) == 0 ? MapsKt.emptyMap() : map4;
            this.third_party_router_coin_spec = (2097152 & i) == 0 ? MapsKt.emptyMap() : map5;
            if ((4194304 & i) == 0) {
                this.spot_currency_pair = null;
            } else {
                this.spot_currency_pair = uUIDDto3;
            }
            if ((8388608 & i) == 0) {
                this.underlying_equity_instrument_id = null;
            } else {
                this.underlying_equity_instrument_id = uUIDDto4;
            }
            if ((i & 16777216) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 0, self.name);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.symbol);
            }
            if (self.state != InstrumentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, InstrumentStateDto.Serializer.INSTANCE, self.state);
            }
            DecimalDto decimalDto = self.min_tick_size;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            UUIDDto uUIDDto = self.asset_currency;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.quote_currency;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            DecimalDto decimalDto2 = self.min_order_size;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.max_order_size;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            DecimalDto decimalDto4 = self.min_order_price_increment;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            DecimalDto decimalDto5 = self.min_order_quantity_increment;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            DecimalDto decimalDto6 = self.min_quote_price_increment;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            DecimalDto decimalDto7 = self.min_quote_quantity_increment;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
            if (self.rhc_tradability != TradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, TradabilityDto.Serializer.INSTANCE, self.rhc_tradability);
            }
            boolean z = self.fundamentals_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 13, z);
            }
            if (!Intrinsics.areEqual(self.crypto_metadata, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 14, lazyArr[14].getValue(), self.crypto_metadata);
            }
            if (!Intrinsics.areEqual(self.venue_symbols, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 15, lazyArr[15].getValue(), self.venue_symbols);
            }
            TimeDto timeDto = self.created_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.updated_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (!Intrinsics.areEqual(self.state_by_region, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 18, lazyArr[18].getValue(), self.state_by_region);
            }
            if (self.currency_pair_type != CurrencyPairTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 19, CurrencyPairTypeDto.Serializer.INSTANCE, self.currency_pair_type);
            }
            if (!Intrinsics.areEqual(self.tradability_by_region, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 20, lazyArr[20].getValue(), self.tradability_by_region);
            }
            if (!Intrinsics.areEqual(self.third_party_router_coin_spec, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 21, lazyArr[21].getValue(), self.third_party_router_coin_spec);
            }
            UUIDDto uUIDDto3 = self.spot_currency_pair;
            if (uUIDDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, UUIDDto.Serializer.INSTANCE, uUIDDto3);
            }
            UUIDDto uUIDDto4 = self.underlying_equity_instrument_id;
            if (uUIDDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, UUIDDto.Serializer.INSTANCE, uUIDDto4);
            }
            if (Intrinsics.areEqual(self.description, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 24, self.description);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String name, String symbol, InstrumentStateDto state, DecimalDto decimalDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, TradabilityDto rhc_tradability, boolean z, Map<String, String> crypto_metadata, Map<String, String> venue_symbols, TimeDto timeDto, TimeDto timeDto2, Map<String, ? extends InstrumentStateDto> state_by_region, CurrencyPairTypeDto currency_pair_type, Map<String, ? extends TradabilityDto> tradability_by_region, Map<String, ThirdPartyRouterCoinSpecDto> third_party_router_coin_spec, UUIDDto uUIDDto3, UUIDDto uUIDDto4, String description) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rhc_tradability, "rhc_tradability");
            Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
            Intrinsics.checkNotNullParameter(venue_symbols, "venue_symbols");
            Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
            Intrinsics.checkNotNullParameter(currency_pair_type, "currency_pair_type");
            Intrinsics.checkNotNullParameter(tradability_by_region, "tradability_by_region");
            Intrinsics.checkNotNullParameter(third_party_router_coin_spec, "third_party_router_coin_spec");
            Intrinsics.checkNotNullParameter(description, "description");
            this.name = name;
            this.symbol = symbol;
            this.state = state;
            this.min_tick_size = decimalDto;
            this.asset_currency = uUIDDto;
            this.quote_currency = uUIDDto2;
            this.min_order_size = decimalDto2;
            this.max_order_size = decimalDto3;
            this.min_order_price_increment = decimalDto4;
            this.min_order_quantity_increment = decimalDto5;
            this.min_quote_price_increment = decimalDto6;
            this.min_quote_quantity_increment = decimalDto7;
            this.rhc_tradability = rhc_tradability;
            this.fundamentals_enabled = z;
            this.crypto_metadata = crypto_metadata;
            this.venue_symbols = venue_symbols;
            this.created_at = timeDto;
            this.updated_at = timeDto2;
            this.state_by_region = state_by_region;
            this.currency_pair_type = currency_pair_type;
            this.tradability_by_region = tradability_by_region;
            this.third_party_router_coin_spec = third_party_router_coin_spec;
            this.spot_currency_pair = uUIDDto3;
            this.underlying_equity_instrument_id = uUIDDto4;
            this.description = description;
        }

        public /* synthetic */ Surrogate(String str, String str2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, TradabilityDto tradabilityDto, boolean z, Map map, Map map2, TimeDto timeDto, TimeDto timeDto2, Map map3, CurrencyPairTypeDto currencyPairTypeDto, Map map4, Map map5, UUIDDto uUIDDto3, UUIDDto uUIDDto4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 8) != 0 ? null : decimalDto, (i & 16) != 0 ? null : uUIDDto, (i & 32) != 0 ? null : uUIDDto2, (i & 64) != 0 ? null : decimalDto2, (i & 128) != 0 ? null : decimalDto3, (i & 256) != 0 ? null : decimalDto4, (i & 512) != 0 ? null : decimalDto5, (i & 1024) != 0 ? null : decimalDto6, (i & 2048) != 0 ? null : decimalDto7, (i & 4096) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? MapsKt.emptyMap() : map, (i & 32768) != 0 ? MapsKt.emptyMap() : map2, (i & 65536) != 0 ? null : timeDto, (i & 131072) != 0 ? null : timeDto2, (i & 262144) != 0 ? MapsKt.emptyMap() : map3, (i & 524288) != 0 ? CurrencyPairTypeDto.INSTANCE.getZeroValue() : currencyPairTypeDto, (i & 1048576) != 0 ? MapsKt.emptyMap() : map4, (i & 2097152) != 0 ? MapsKt.emptyMap() : map5, (i & 4194304) != 0 ? null : uUIDDto3, (i & 8388608) != 0 ? null : uUIDDto4, (i & 16777216) != 0 ? "" : str3);
        }

        public final String getName() {
            return this.name;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final InstrumentStateDto getState() {
            return this.state;
        }

        public final DecimalDto getMin_tick_size() {
            return this.min_tick_size;
        }

        public final UUIDDto getAsset_currency() {
            return this.asset_currency;
        }

        public final UUIDDto getQuote_currency() {
            return this.quote_currency;
        }

        public final DecimalDto getMin_order_size() {
            return this.min_order_size;
        }

        public final DecimalDto getMax_order_size() {
            return this.max_order_size;
        }

        public final DecimalDto getMin_order_price_increment() {
            return this.min_order_price_increment;
        }

        public final DecimalDto getMin_order_quantity_increment() {
            return this.min_order_quantity_increment;
        }

        public final DecimalDto getMin_quote_price_increment() {
            return this.min_quote_price_increment;
        }

        public final DecimalDto getMin_quote_quantity_increment() {
            return this.min_quote_quantity_increment;
        }

        public final TradabilityDto getRhc_tradability() {
            return this.rhc_tradability;
        }

        public final boolean getFundamentals_enabled() {
            return this.fundamentals_enabled;
        }

        public final Map<String, String> getCrypto_metadata() {
            return this.crypto_metadata;
        }

        public final Map<String, String> getVenue_symbols() {
            return this.venue_symbols;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        public final Map<String, InstrumentStateDto> getState_by_region() {
            return this.state_by_region;
        }

        public final CurrencyPairTypeDto getCurrency_pair_type() {
            return this.currency_pair_type;
        }

        public final Map<String, TradabilityDto> getTradability_by_region() {
            return this.tradability_by_region;
        }

        public final Map<String, ThirdPartyRouterCoinSpecDto> getThird_party_router_coin_spec() {
            return this.third_party_router_coin_spec;
        }

        public final UUIDDto getSpot_currency_pair() {
            return this.spot_currency_pair;
        }

        public final UUIDDto getUnderlying_equity_instrument_id() {
            return this.underlying_equity_instrument_id;
        }

        public final String getDescription() {
            return this.description;
        }
    }

    /* compiled from: CurrencyPairDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
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
            String name = proto.getName();
            String symbol = proto.getSymbol();
            InstrumentStateDto instrumentStateDtoFromProto = InstrumentStateDto.INSTANCE.fromProto(proto.getState());
            Decimal min_tick_size = proto.getMin_tick_size();
            DecimalDto decimalDtoFromProto = min_tick_size != null ? DecimalDto.INSTANCE.fromProto(min_tick_size) : null;
            UUID asset_currency = proto.getAsset_currency();
            UUIDDto uUIDDtoFromProto = asset_currency != null ? UUIDDto.INSTANCE.fromProto(asset_currency) : null;
            UUID quote_currency = proto.getQuote_currency();
            UUIDDto uUIDDtoFromProto2 = quote_currency != null ? UUIDDto.INSTANCE.fromProto(quote_currency) : null;
            Decimal min_order_size = proto.getMin_order_size();
            DecimalDto decimalDtoFromProto2 = min_order_size != null ? DecimalDto.INSTANCE.fromProto(min_order_size) : null;
            Decimal max_order_size = proto.getMax_order_size();
            DecimalDto decimalDtoFromProto3 = max_order_size != null ? DecimalDto.INSTANCE.fromProto(max_order_size) : null;
            Decimal min_order_price_increment = proto.getMin_order_price_increment();
            DecimalDto decimalDtoFromProto4 = min_order_price_increment != null ? DecimalDto.INSTANCE.fromProto(min_order_price_increment) : null;
            Decimal min_order_quantity_increment = proto.getMin_order_quantity_increment();
            DecimalDto decimalDtoFromProto5 = min_order_quantity_increment != null ? DecimalDto.INSTANCE.fromProto(min_order_quantity_increment) : null;
            Decimal min_quote_price_increment = proto.getMin_quote_price_increment();
            DecimalDto decimalDtoFromProto6 = min_quote_price_increment != null ? DecimalDto.INSTANCE.fromProto(min_quote_price_increment) : null;
            Decimal min_quote_quantity_increment = proto.getMin_quote_quantity_increment();
            DecimalDto decimalDtoFromProto7 = min_quote_quantity_increment != null ? DecimalDto.INSTANCE.fromProto(min_quote_quantity_increment) : null;
            TradabilityDto tradabilityDtoFromProto = TradabilityDto.INSTANCE.fromProto(proto.getRhc_tradability());
            boolean fundamentals_enabled = proto.getFundamentals_enabled();
            Set<Map.Entry<String, String>> setEntrySet = proto.getCrypto_metadata().entrySet();
            DecimalDto decimalDto = decimalDtoFromProto;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Iterator it2 = it;
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                it = it2;
            }
            Set<Map.Entry<String, String>> setEntrySet2 = proto.getVenue_symbols().entrySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
            Iterator<T> it3 = setEntrySet2.iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                LinkedHashMap linkedHashMap3 = linkedHashMap;
                Tuples2 tuples2M3642to2 = Tuples4.m3642to((String) entry2.getKey(), (String) entry2.getValue());
                linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
                name = name;
                linkedHashMap = linkedHashMap3;
            }
            LinkedHashMap linkedHashMap4 = linkedHashMap;
            String str = name;
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time updated_at = proto.getUpdated_at();
            TimeDto timeDtoFromProto2 = updated_at != null ? TimeDto.INSTANCE.fromProto(updated_at) : null;
            Set<Map.Entry<String, InstrumentState>> setEntrySet3 = proto.getState_by_region().entrySet();
            TimeDto timeDto = timeDtoFromProto;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet3, 10)), 16));
            Iterator it4 = setEntrySet3.iterator();
            while (it4.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it4.next();
                Iterator it5 = it4;
                Tuples2 tuples2M3642to3 = Tuples4.m3642to((String) entry3.getKey(), InstrumentStateDto.INSTANCE.fromProto((InstrumentState) entry3.getValue()));
                linkedHashMap5.put(tuples2M3642to3.getFirst(), tuples2M3642to3.getSecond());
                timeDtoFromProto2 = timeDtoFromProto2;
                it4 = it5;
            }
            TimeDto timeDto2 = timeDtoFromProto2;
            CurrencyPairTypeDto currencyPairTypeDtoFromProto = CurrencyPairTypeDto.INSTANCE.fromProto(proto.getCurrency_pair_type());
            Set<Map.Entry<String, Tradability>> setEntrySet4 = proto.getTradability_by_region().entrySet();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet4, 10)), 16));
            Iterator it6 = setEntrySet4.iterator();
            while (it6.hasNext()) {
                Map.Entry entry4 = (Map.Entry) it6.next();
                LinkedHashMap linkedHashMap7 = linkedHashMap5;
                Tuples2 tuples2M3642to4 = Tuples4.m3642to((String) entry4.getKey(), TradabilityDto.INSTANCE.fromProto((Tradability) entry4.getValue()));
                linkedHashMap6.put(tuples2M3642to4.getFirst(), tuples2M3642to4.getSecond());
                it6 = it6;
                linkedHashMap5 = linkedHashMap7;
            }
            LinkedHashMap linkedHashMap8 = linkedHashMap5;
            Set<Map.Entry<String, ThirdPartyRouterCoinSpec>> setEntrySet5 = proto.getThird_party_router_coin_spec().entrySet();
            LinkedHashMap linkedHashMap9 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet5, 10)), 16));
            Iterator it7 = setEntrySet5.iterator();
            while (it7.hasNext()) {
                Map.Entry entry5 = (Map.Entry) it7.next();
                LinkedHashMap linkedHashMap10 = linkedHashMap6;
                Tuples2 tuples2M3642to5 = Tuples4.m3642to((String) entry5.getKey(), ThirdPartyRouterCoinSpecDto.INSTANCE.fromProto((ThirdPartyRouterCoinSpec) entry5.getValue()));
                linkedHashMap9.put(tuples2M3642to5.getFirst(), tuples2M3642to5.getSecond());
                it7 = it7;
                linkedHashMap6 = linkedHashMap10;
            }
            LinkedHashMap linkedHashMap11 = linkedHashMap6;
            UUID spot_currency_pair = proto.getSpot_currency_pair();
            UUIDDto uUIDDtoFromProto3 = spot_currency_pair != null ? UUIDDto.INSTANCE.fromProto(spot_currency_pair) : null;
            UUID underlying_equity_instrument_id = proto.getUnderlying_equity_instrument_id();
            return new CurrencyPairDetailsDto(new Surrogate(str, symbol, instrumentStateDtoFromProto, decimalDto, uUIDDtoFromProto, uUIDDtoFromProto2, decimalDtoFromProto2, decimalDtoFromProto3, decimalDtoFromProto4, decimalDtoFromProto5, decimalDtoFromProto6, decimalDtoFromProto7, tradabilityDtoFromProto, fundamentals_enabled, linkedHashMap4, linkedHashMap2, timeDto, timeDto2, linkedHashMap8, currencyPairTypeDtoFromProto, linkedHashMap11, linkedHashMap9, uUIDDtoFromProto3, underlying_equity_instrument_id != null ? UUIDDto.INSTANCE.fromProto(underlying_equity_instrument_id) : null, proto.getDescription()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyPairDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyPairDetailsDto.binaryBase64Serializer_delegate$lambda$5();
            }
        });
        zeroValue = new CurrencyPairDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$5() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CurrencyPairDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.CurrencyPairDetails", kSerializerSerializer.getDescriptor());
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
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.CurrencyPairDetailsDto";
        }
    }
}
