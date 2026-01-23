package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.InstrumentInfoDto;
import com.robinhood.rosetta.mainst.NullableCurrencyDetailsDto;
import com.robinhood.rosetta.mainst.NullableCurrencyPairDetailsDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
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
import rosetta.mainst.InstrumentState;
import rosetta.mainst.InstrumentStateDto;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;
import rosetta.mainst.PutCallCode;
import rosetta.mainst.PutCallCodeDto;
import rosetta.mainst.SecurityType;
import rosetta.mainst.SecurityTypeDto;
import rosetta.mainst.Tradability;
import rosetta.mainst.TradabilityDto;

/* compiled from: InstrumentInfoDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004_`abB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0002\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010+\u001a\u00020\u001b¢\u0006\u0004\b\u0006\u0010,Jþ\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020\u001bJ\b\u0010R\u001a\u00020\u0002H\u0016J\b\u0010S\u001a\u00020\u000bH\u0016J\u0013\u0010T\u001a\u00020&2\b\u0010U\u001a\u0004\u0018\u00010VH\u0096\u0002J\b\u0010W\u001a\u00020XH\u0016J\u0018\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020XH\u0016J\b\u0010^\u001a\u00020XH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b8\u00103R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b;\u00105R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b<\u00105R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00198F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010 \u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bE\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bF\u0010.R\u0011\u0010\"\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bG\u00100R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010+\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bP\u0010@¨\u0006c"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/InstrumentInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "symbol", "", "market", "ipo_date", "Lcom/robinhood/rosetta/mainst/TimeDto;", "min_tick_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "type", "Lrosetta/mainst/InstrumentTypeDto;", "maturity_date", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "strike_price", "trade_value_multiplier", "underlying_instrument_ids", "", "rhs_tradability", "Lrosetta/mainst/TradabilityDto;", "cusip", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "state", "Lrosetta/mainst/InstrumentStateDto;", "updated_at", "chain_pk", PlaceTypes.COUNTRY, "security_type", "Lrosetta/mainst/SecurityTypeDto;", "mifid_2_dually_listed", "", "currency_details", "Lcom/robinhood/rosetta/mainst/NullableCurrencyDetailsDto;", "currency_pair_details", "Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetailsDto;", "tradability_for_late_closing_etfs", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/List;Lrosetta/mainst/TradabilityDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/SecurityTypeDto;ZLcom/robinhood/rosetta/mainst/NullableCurrencyDetailsDto;Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetailsDto;Lrosetta/mainst/TradabilityDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getSymbol", "()Ljava/lang/String;", "getMarket", "getIpo_date", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getType", "()Lrosetta/mainst/InstrumentTypeDto;", "getMaturity_date", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getStrike_price", "getTrade_value_multiplier", "getUnderlying_instrument_ids", "()Ljava/util/List;", "getRhs_tradability", "()Lrosetta/mainst/TradabilityDto;", "getCusip", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getUpdated_at", "getChain_pk", "getCountry", "getSecurity_type", "()Lrosetta/mainst/SecurityTypeDto;", "getMifid_2_dually_listed", "()Z", "getCurrency_details", "()Lcom/robinhood/rosetta/mainst/NullableCurrencyDetailsDto;", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetailsDto;", "getTradability_for_late_closing_etfs", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class InstrumentInfoDto implements Dto3<InstrumentInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InstrumentInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InstrumentInfoDto, InstrumentInfo>> binaryBase64Serializer$delegate;
    private static final InstrumentInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InstrumentInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InstrumentInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getMarket() {
        return this.surrogate.getMarket();
    }

    public final TimeDto getIpo_date() {
        return this.surrogate.getIpo_date();
    }

    public final DecimalDto getMin_tick_size() {
        return this.surrogate.getMin_tick_size();
    }

    public final InstrumentTypeDto getType() {
        return this.surrogate.getType();
    }

    public final TimeDto getMaturity_date() {
        return this.surrogate.getMaturity_date();
    }

    public final PutCallCodeDto getPut_call_code() {
        return this.surrogate.getPut_call_code();
    }

    public final DecimalDto getStrike_price() {
        return this.surrogate.getStrike_price();
    }

    public final DecimalDto getTrade_value_multiplier() {
        return this.surrogate.getTrade_value_multiplier();
    }

    public final List<UUIDDto> getUnderlying_instrument_ids() {
        return this.surrogate.getUnderlying_instrument_ids();
    }

    public final TradabilityDto getRhs_tradability() {
        return this.surrogate.getRhs_tradability();
    }

    public final NullableStringDto getCusip() {
        return this.surrogate.getCusip();
    }

    public final InstrumentStateDto getState() {
        return this.surrogate.getState();
    }

    public final TimeDto getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final UUIDDto getChain_pk() {
        return this.surrogate.getChain_pk();
    }

    public final String getCountry() {
        return this.surrogate.getCountry();
    }

    public final SecurityTypeDto getSecurity_type() {
        return this.surrogate.getSecurity_type();
    }

    public final boolean getMifid_2_dually_listed() {
        return this.surrogate.getMifid_2_dually_listed();
    }

    public final NullableCurrencyDetailsDto getCurrency_details() {
        return this.surrogate.getCurrency_details();
    }

    public final NullableCurrencyPairDetailsDto getCurrency_pair_details() {
        return this.surrogate.getCurrency_pair_details();
    }

    public final TradabilityDto getTradability_for_late_closing_etfs() {
        return this.surrogate.getTradability_for_late_closing_etfs();
    }

    public /* synthetic */ InstrumentInfoDto(UUIDDto uUIDDto, String str, String str2, TimeDto timeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto2, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto2, DecimalDto decimalDto3, List list, TradabilityDto tradabilityDto, NullableStringDto nullableStringDto, InstrumentStateDto instrumentStateDto, TimeDto timeDto3, UUIDDto uUIDDto2, String str3, SecurityTypeDto securityTypeDto, boolean z, NullableCurrencyDetailsDto nullableCurrencyDetailsDto, NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto, TradabilityDto tradabilityDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : decimalDto, (i & 32) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 64) != 0 ? null : timeDto2, (i & 128) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i & 256) != 0 ? null : decimalDto2, (i & 512) != 0 ? null : decimalDto3, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 4096) != 0 ? null : nullableStringDto, (i & 8192) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 16384) != 0 ? null : timeDto3, (i & 32768) != 0 ? null : uUIDDto2, (i & 65536) == 0 ? str3 : "", (i & 131072) != 0 ? SecurityTypeDto.INSTANCE.getZeroValue() : securityTypeDto, (i & 262144) != 0 ? false : z, (i & 524288) != 0 ? null : nullableCurrencyDetailsDto, (i & 1048576) != 0 ? null : nullableCurrencyPairDetailsDto, (i & 2097152) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstrumentInfoDto(UUIDDto uUIDDto, String symbol, String market, TimeDto timeDto, DecimalDto decimalDto, InstrumentTypeDto type2, TimeDto timeDto2, PutCallCodeDto put_call_code, DecimalDto decimalDto2, DecimalDto decimalDto3, List<UUIDDto> underlying_instrument_ids, TradabilityDto rhs_tradability, NullableStringDto nullableStringDto, InstrumentStateDto state, TimeDto timeDto3, UUIDDto uUIDDto2, String country, SecurityTypeDto security_type, boolean z, NullableCurrencyDetailsDto nullableCurrencyDetailsDto, NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto, TradabilityDto tradability_for_late_closing_etfs) {
        this(new Surrogate(uUIDDto, symbol, market, timeDto, decimalDto, type2, timeDto2, put_call_code, decimalDto2, decimalDto3, underlying_instrument_ids, rhs_tradability, nullableStringDto, state, timeDto3, uUIDDto2, country, security_type, z, nullableCurrencyDetailsDto, nullableCurrencyPairDetailsDto, tradability_for_late_closing_etfs));
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(underlying_instrument_ids, "underlying_instrument_ids");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(security_type, "security_type");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
    }

    public static /* synthetic */ InstrumentInfoDto copy$default(InstrumentInfoDto instrumentInfoDto, UUIDDto uUIDDto, String str, String str2, TimeDto timeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto2, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto2, DecimalDto decimalDto3, List list, TradabilityDto tradabilityDto, NullableStringDto nullableStringDto, InstrumentStateDto instrumentStateDto, TimeDto timeDto3, UUIDDto uUIDDto2, String str3, SecurityTypeDto securityTypeDto, boolean z, NullableCurrencyDetailsDto nullableCurrencyDetailsDto, NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto, TradabilityDto tradabilityDto2, int i, Object obj) {
        TradabilityDto tradability_for_late_closing_etfs;
        NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto2;
        UUIDDto id = (i & 1) != 0 ? instrumentInfoDto.surrogate.getId() : uUIDDto;
        String symbol = (i & 2) != 0 ? instrumentInfoDto.surrogate.getSymbol() : str;
        String market = (i & 4) != 0 ? instrumentInfoDto.surrogate.getMarket() : str2;
        TimeDto ipo_date = (i & 8) != 0 ? instrumentInfoDto.surrogate.getIpo_date() : timeDto;
        DecimalDto min_tick_size = (i & 16) != 0 ? instrumentInfoDto.surrogate.getMin_tick_size() : decimalDto;
        InstrumentTypeDto type2 = (i & 32) != 0 ? instrumentInfoDto.surrogate.getType() : instrumentTypeDto;
        TimeDto maturity_date = (i & 64) != 0 ? instrumentInfoDto.surrogate.getMaturity_date() : timeDto2;
        PutCallCodeDto put_call_code = (i & 128) != 0 ? instrumentInfoDto.surrogate.getPut_call_code() : putCallCodeDto;
        DecimalDto strike_price = (i & 256) != 0 ? instrumentInfoDto.surrogate.getStrike_price() : decimalDto2;
        DecimalDto trade_value_multiplier = (i & 512) != 0 ? instrumentInfoDto.surrogate.getTrade_value_multiplier() : decimalDto3;
        List underlying_instrument_ids = (i & 1024) != 0 ? instrumentInfoDto.surrogate.getUnderlying_instrument_ids() : list;
        TradabilityDto rhs_tradability = (i & 2048) != 0 ? instrumentInfoDto.surrogate.getRhs_tradability() : tradabilityDto;
        NullableStringDto cusip = (i & 4096) != 0 ? instrumentInfoDto.surrogate.getCusip() : nullableStringDto;
        InstrumentStateDto state = (i & 8192) != 0 ? instrumentInfoDto.surrogate.getState() : instrumentStateDto;
        UUIDDto uUIDDto3 = id;
        TimeDto updated_at = (i & 16384) != 0 ? instrumentInfoDto.surrogate.getUpdated_at() : timeDto3;
        UUIDDto chain_pk = (i & 32768) != 0 ? instrumentInfoDto.surrogate.getChain_pk() : uUIDDto2;
        String country = (i & 65536) != 0 ? instrumentInfoDto.surrogate.getCountry() : str3;
        SecurityTypeDto security_type = (i & 131072) != 0 ? instrumentInfoDto.surrogate.getSecurity_type() : securityTypeDto;
        boolean mifid_2_dually_listed = (i & 262144) != 0 ? instrumentInfoDto.surrogate.getMifid_2_dually_listed() : z;
        NullableCurrencyDetailsDto currency_details = (i & 524288) != 0 ? instrumentInfoDto.surrogate.getCurrency_details() : nullableCurrencyDetailsDto;
        NullableCurrencyPairDetailsDto currency_pair_details = (i & 1048576) != 0 ? instrumentInfoDto.surrogate.getCurrency_pair_details() : nullableCurrencyPairDetailsDto;
        if ((i & 2097152) != 0) {
            nullableCurrencyPairDetailsDto2 = currency_pair_details;
            tradability_for_late_closing_etfs = instrumentInfoDto.surrogate.getTradability_for_late_closing_etfs();
        } else {
            tradability_for_late_closing_etfs = tradabilityDto2;
            nullableCurrencyPairDetailsDto2 = currency_pair_details;
        }
        return instrumentInfoDto.copy(uUIDDto3, symbol, market, ipo_date, min_tick_size, type2, maturity_date, put_call_code, strike_price, trade_value_multiplier, underlying_instrument_ids, rhs_tradability, cusip, state, updated_at, chain_pk, country, security_type, mifid_2_dually_listed, currency_details, nullableCurrencyPairDetailsDto2, tradability_for_late_closing_etfs);
    }

    public final InstrumentInfoDto copy(UUIDDto id, String symbol, String market, TimeDto ipo_date, DecimalDto min_tick_size, InstrumentTypeDto type2, TimeDto maturity_date, PutCallCodeDto put_call_code, DecimalDto strike_price, DecimalDto trade_value_multiplier, List<UUIDDto> underlying_instrument_ids, TradabilityDto rhs_tradability, NullableStringDto cusip, InstrumentStateDto state, TimeDto updated_at, UUIDDto chain_pk, String country, SecurityTypeDto security_type, boolean mifid_2_dually_listed, NullableCurrencyDetailsDto currency_details, NullableCurrencyPairDetailsDto currency_pair_details, TradabilityDto tradability_for_late_closing_etfs) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(underlying_instrument_ids, "underlying_instrument_ids");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(security_type, "security_type");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
        return new InstrumentInfoDto(new Surrogate(id, symbol, market, ipo_date, min_tick_size, type2, maturity_date, put_call_code, strike_price, trade_value_multiplier, underlying_instrument_ids, rhs_tradability, cusip, state, updated_at, chain_pk, country, security_type, mifid_2_dually_listed, currency_details, currency_pair_details, tradability_for_late_closing_etfs));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InstrumentInfo toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        String symbol = this.surrogate.getSymbol();
        String market = this.surrogate.getMarket();
        TimeDto ipo_date = this.surrogate.getIpo_date();
        Time proto2 = ipo_date != null ? ipo_date.toProto() : null;
        DecimalDto min_tick_size = this.surrogate.getMin_tick_size();
        Decimal proto3 = min_tick_size != null ? min_tick_size.toProto() : null;
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getType().toProto();
        TimeDto maturity_date = this.surrogate.getMaturity_date();
        Time proto4 = maturity_date != null ? maturity_date.toProto() : null;
        PutCallCode putCallCode = (PutCallCode) this.surrogate.getPut_call_code().toProto();
        DecimalDto strike_price = this.surrogate.getStrike_price();
        Decimal proto5 = strike_price != null ? strike_price.toProto() : null;
        DecimalDto trade_value_multiplier = this.surrogate.getTrade_value_multiplier();
        Decimal proto6 = trade_value_multiplier != null ? trade_value_multiplier.toProto() : null;
        List<UUIDDto> underlying_instrument_ids = this.surrogate.getUnderlying_instrument_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(underlying_instrument_ids, 10));
        Iterator<T> it = underlying_instrument_ids.iterator();
        while (it.hasNext()) {
            arrayList.add(((UUIDDto) it.next()).toProto());
        }
        Tradability tradability = (Tradability) this.surrogate.getRhs_tradability().toProto();
        NullableStringDto cusip = this.surrogate.getCusip();
        NullableString proto7 = cusip != null ? cusip.toProto() : null;
        InstrumentState instrumentState = (InstrumentState) this.surrogate.getState().toProto();
        TimeDto updated_at = this.surrogate.getUpdated_at();
        Time proto8 = updated_at != null ? updated_at.toProto() : null;
        UUIDDto chain_pk = this.surrogate.getChain_pk();
        UUID proto9 = chain_pk != null ? chain_pk.toProto() : null;
        String country = this.surrogate.getCountry();
        SecurityType securityType = (SecurityType) this.surrogate.getSecurity_type().toProto();
        boolean mifid_2_dually_listed = this.surrogate.getMifid_2_dually_listed();
        NullableCurrencyDetailsDto currency_details = this.surrogate.getCurrency_details();
        NullableCurrencyDetails proto10 = currency_details != null ? currency_details.toProto() : null;
        NullableCurrencyPairDetailsDto currency_pair_details = this.surrogate.getCurrency_pair_details();
        return new InstrumentInfo(proto, symbol, market, proto2, proto3, instrumentType, proto4, putCallCode, proto5, proto6, arrayList, tradability, proto7, instrumentState, proto8, proto9, country, securityType, mifid_2_dually_listed, proto10, currency_pair_details != null ? currency_pair_details.toProto() : null, (Tradability) this.surrogate.getTradability_for_late_closing_etfs().toProto(), null, 4194304, null);
    }

    public String toString() {
        return "[InstrumentInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InstrumentInfoDto) && Intrinsics.areEqual(((InstrumentInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: InstrumentInfoDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u008c\u00012\u00020\u0001:\u0004\u008b\u0001\u008c\u0001Bÿ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'Bû\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0004\b&\u0010,J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010m\u001a\u00020\fHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010o\u001a\u00020\u000fHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0003J\t\u0010s\u001a\u00020\u0015HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010u\u001a\u00020\u0019HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u001eHÆ\u0003J\t\u0010z\u001a\u00020 HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010$HÆ\u0003J\t\u0010}\u001a\u00020\u0015HÆ\u0003J\u0081\u0002\u0010~\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\u0015HÆ\u0001J\u0014\u0010\u007f\u001a\u00020 2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0081\u0001\u001a\u00020)HÖ\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0005HÖ\u0001J-\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00002\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0001¢\u0006\u0003\b\u008a\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010.\u001a\u0004\b2\u00103R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010.\u001a\u0004\b5\u00103R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010.\u001a\u0004\b7\u00108R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010.\u001a\u0004\b:\u0010;R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010.\u001a\u0004\b=\u0010>R\u001e\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010.\u001a\u0004\b@\u00108R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010.\u001a\u0004\bB\u0010CR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010.\u001a\u0004\bE\u0010;R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010.\u001a\u0004\bG\u0010;R\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010.\u001a\u0004\bI\u0010JR\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010.\u001a\u0004\bL\u0010MR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010.\u001a\u0004\bO\u0010PR\u001c\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010.\u001a\u0004\bR\u0010SR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010.\u001a\u0004\bU\u00108R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010.\u001a\u0004\bW\u00100R\u001c\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010.\u001a\u0004\bY\u00103R\u001c\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010.\u001a\u0004\b[\u0010\\R\u001c\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010.\u001a\u0004\b^\u0010_R\u001e\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010.\u001a\u0004\ba\u0010bR\u001e\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u0010.\u001a\u0004\bd\u0010eR\u001c\u0010%\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010.\u001a\u0004\bg\u0010M¨\u0006\u008d\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "symbol", "", "market", "ipo_date", "Lcom/robinhood/rosetta/mainst/TimeDto;", "min_tick_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "type", "Lrosetta/mainst/InstrumentTypeDto;", "maturity_date", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "strike_price", "trade_value_multiplier", "underlying_instrument_ids", "", "rhs_tradability", "Lrosetta/mainst/TradabilityDto;", "cusip", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "state", "Lrosetta/mainst/InstrumentStateDto;", "updated_at", "chain_pk", PlaceTypes.COUNTRY, "security_type", "Lrosetta/mainst/SecurityTypeDto;", "mifid_2_dually_listed", "", "currency_details", "Lcom/robinhood/rosetta/mainst/NullableCurrencyDetailsDto;", "currency_pair_details", "Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetailsDto;", "tradability_for_late_closing_etfs", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/List;Lrosetta/mainst/TradabilityDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/SecurityTypeDto;ZLcom/robinhood/rosetta/mainst/NullableCurrencyDetailsDto;Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetailsDto;Lrosetta/mainst/TradabilityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/List;Lrosetta/mainst/TradabilityDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/SecurityTypeDto;ZLcom/robinhood/rosetta/mainst/NullableCurrencyDetailsDto;Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetailsDto;Lrosetta/mainst/TradabilityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getSymbol$annotations", "getSymbol", "()Ljava/lang/String;", "getMarket$annotations", "getMarket", "getIpo_date$annotations", "getIpo_date", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getMin_tick_size$annotations", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getType$annotations", "getType", "()Lrosetta/mainst/InstrumentTypeDto;", "getMaturity_date$annotations", "getMaturity_date", "getPut_call_code$annotations", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getStrike_price$annotations", "getStrike_price", "getTrade_value_multiplier$annotations", "getTrade_value_multiplier", "getUnderlying_instrument_ids$annotations", "getUnderlying_instrument_ids", "()Ljava/util/List;", "getRhs_tradability$annotations", "getRhs_tradability", "()Lrosetta/mainst/TradabilityDto;", "getCusip$annotations", "getCusip", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getState$annotations", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getUpdated_at$annotations", "getUpdated_at", "getChain_pk$annotations", "getChain_pk", "getCountry$annotations", "getCountry", "getSecurity_type$annotations", "getSecurity_type", "()Lrosetta/mainst/SecurityTypeDto;", "getMifid_2_dually_listed$annotations", "getMifid_2_dually_listed", "()Z", "getCurrency_details$annotations", "getCurrency_details", "()Lcom/robinhood/rosetta/mainst/NullableCurrencyDetailsDto;", "getCurrency_pair_details$annotations", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetailsDto;", "getTradability_for_late_closing_etfs$annotations", "getTradability_for_late_closing_etfs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final UUIDDto chain_pk;
        private final String country;
        private final NullableCurrencyDetailsDto currency_details;
        private final NullableCurrencyPairDetailsDto currency_pair_details;
        private final NullableStringDto cusip;
        private final UUIDDto id;
        private final TimeDto ipo_date;
        private final String market;
        private final TimeDto maturity_date;
        private final boolean mifid_2_dually_listed;
        private final DecimalDto min_tick_size;
        private final PutCallCodeDto put_call_code;
        private final TradabilityDto rhs_tradability;
        private final SecurityTypeDto security_type;
        private final InstrumentStateDto state;
        private final DecimalDto strike_price;
        private final String symbol;
        private final TradabilityDto tradability_for_late_closing_etfs;
        private final DecimalDto trade_value_multiplier;
        private final InstrumentTypeDto type;
        private final List<UUIDDto> underlying_instrument_ids;
        private final TimeDto updated_at;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.mainst.InstrumentInfoDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentInfoDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((UUIDDto) null, (String) null, (String) null, (TimeDto) null, (DecimalDto) null, (InstrumentTypeDto) null, (TimeDto) null, (PutCallCodeDto) null, (DecimalDto) null, (DecimalDto) null, (List) null, (TradabilityDto) null, (NullableStringDto) null, (InstrumentStateDto) null, (TimeDto) null, (UUIDDto) null, (String) null, (SecurityTypeDto) null, false, (NullableCurrencyDetailsDto) null, (NullableCurrencyPairDetailsDto) null, (TradabilityDto) null, 4194303, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(UUIDDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, String str, String str2, TimeDto timeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto2, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto2, DecimalDto decimalDto3, List list, TradabilityDto tradabilityDto, NullableStringDto nullableStringDto, InstrumentStateDto instrumentStateDto, TimeDto timeDto3, UUIDDto uUIDDto2, String str3, SecurityTypeDto securityTypeDto, boolean z, NullableCurrencyDetailsDto nullableCurrencyDetailsDto, NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto, TradabilityDto tradabilityDto2, int i, Object obj) {
            TradabilityDto tradabilityDto3;
            NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto2;
            UUIDDto uUIDDto3 = (i & 1) != 0 ? surrogate.id : uUIDDto;
            String str4 = (i & 2) != 0 ? surrogate.symbol : str;
            String str5 = (i & 4) != 0 ? surrogate.market : str2;
            TimeDto timeDto4 = (i & 8) != 0 ? surrogate.ipo_date : timeDto;
            DecimalDto decimalDto4 = (i & 16) != 0 ? surrogate.min_tick_size : decimalDto;
            InstrumentTypeDto instrumentTypeDto2 = (i & 32) != 0 ? surrogate.type : instrumentTypeDto;
            TimeDto timeDto5 = (i & 64) != 0 ? surrogate.maturity_date : timeDto2;
            PutCallCodeDto putCallCodeDto2 = (i & 128) != 0 ? surrogate.put_call_code : putCallCodeDto;
            DecimalDto decimalDto5 = (i & 256) != 0 ? surrogate.strike_price : decimalDto2;
            DecimalDto decimalDto6 = (i & 512) != 0 ? surrogate.trade_value_multiplier : decimalDto3;
            List list2 = (i & 1024) != 0 ? surrogate.underlying_instrument_ids : list;
            TradabilityDto tradabilityDto4 = (i & 2048) != 0 ? surrogate.rhs_tradability : tradabilityDto;
            NullableStringDto nullableStringDto2 = (i & 4096) != 0 ? surrogate.cusip : nullableStringDto;
            InstrumentStateDto instrumentStateDto2 = (i & 8192) != 0 ? surrogate.state : instrumentStateDto;
            UUIDDto uUIDDto4 = uUIDDto3;
            TimeDto timeDto6 = (i & 16384) != 0 ? surrogate.updated_at : timeDto3;
            UUIDDto uUIDDto5 = (i & 32768) != 0 ? surrogate.chain_pk : uUIDDto2;
            String str6 = (i & 65536) != 0 ? surrogate.country : str3;
            SecurityTypeDto securityTypeDto2 = (i & 131072) != 0 ? surrogate.security_type : securityTypeDto;
            boolean z2 = (i & 262144) != 0 ? surrogate.mifid_2_dually_listed : z;
            NullableCurrencyDetailsDto nullableCurrencyDetailsDto2 = (i & 524288) != 0 ? surrogate.currency_details : nullableCurrencyDetailsDto;
            NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto3 = (i & 1048576) != 0 ? surrogate.currency_pair_details : nullableCurrencyPairDetailsDto;
            if ((i & 2097152) != 0) {
                nullableCurrencyPairDetailsDto2 = nullableCurrencyPairDetailsDto3;
                tradabilityDto3 = surrogate.tradability_for_late_closing_etfs;
            } else {
                tradabilityDto3 = tradabilityDto2;
                nullableCurrencyPairDetailsDto2 = nullableCurrencyPairDetailsDto3;
            }
            return surrogate.copy(uUIDDto4, str4, str5, timeDto4, decimalDto4, instrumentTypeDto2, timeDto5, putCallCodeDto2, decimalDto5, decimalDto6, list2, tradabilityDto4, nullableStringDto2, instrumentStateDto2, timeDto6, uUIDDto5, str6, securityTypeDto2, z2, nullableCurrencyDetailsDto2, nullableCurrencyPairDetailsDto2, tradabilityDto3);
        }

        @SerialName("chainPk")
        @JsonAnnotations2(names = {"chain_pk"})
        public static /* synthetic */ void getChain_pk$annotations() {
        }

        @SerialName(PlaceTypes.COUNTRY)
        @JsonAnnotations2(names = {PlaceTypes.COUNTRY})
        public static /* synthetic */ void getCountry$annotations() {
        }

        @SerialName("currencyDetails")
        @JsonAnnotations2(names = {"currency_details"})
        public static /* synthetic */ void getCurrency_details$annotations() {
        }

        @SerialName("currencyPairDetails")
        @JsonAnnotations2(names = {"currency_pair_details"})
        public static /* synthetic */ void getCurrency_pair_details$annotations() {
        }

        @SerialName("cusip")
        @JsonAnnotations2(names = {"cusip"})
        public static /* synthetic */ void getCusip$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("ipoDate")
        @JsonAnnotations2(names = {"ipo_date"})
        public static /* synthetic */ void getIpo_date$annotations() {
        }

        @SerialName("market")
        @JsonAnnotations2(names = {"market"})
        public static /* synthetic */ void getMarket$annotations() {
        }

        @SerialName("maturityDate")
        @JsonAnnotations2(names = {"maturity_date"})
        public static /* synthetic */ void getMaturity_date$annotations() {
        }

        @SerialName("mifid2DuallyListed")
        @JsonAnnotations2(names = {"mifid_2_dually_listed"})
        public static /* synthetic */ void getMifid_2_dually_listed$annotations() {
        }

        @SerialName("minTickSize")
        @JsonAnnotations2(names = {"min_tick_size"})
        public static /* synthetic */ void getMin_tick_size$annotations() {
        }

        @SerialName("putCallCode")
        @JsonAnnotations2(names = {"put_call_code"})
        public static /* synthetic */ void getPut_call_code$annotations() {
        }

        @SerialName("rhsTradability")
        @JsonAnnotations2(names = {"rhs_tradability"})
        public static /* synthetic */ void getRhs_tradability$annotations() {
        }

        @SerialName("securityType")
        @JsonAnnotations2(names = {"security_type"})
        public static /* synthetic */ void getSecurity_type$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("strikePrice")
        @JsonAnnotations2(names = {"strike_price"})
        public static /* synthetic */ void getStrike_price$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tradabilityForLateClosingEtfs")
        @JsonAnnotations2(names = {"tradability_for_late_closing_etfs"})
        public static /* synthetic */ void getTradability_for_late_closing_etfs$annotations() {
        }

        @SerialName("tradeValueMultiplier")
        @JsonAnnotations2(names = {"trade_value_multiplier"})
        public static /* synthetic */ void getTrade_value_multiplier$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("underlyingInstrumentIds")
        @JsonAnnotations2(names = {"underlying_instrument_ids"})
        public static /* synthetic */ void getUnderlying_instrument_ids$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final DecimalDto getTrade_value_multiplier() {
            return this.trade_value_multiplier;
        }

        public final List<UUIDDto> component11() {
            return this.underlying_instrument_ids;
        }

        /* renamed from: component12, reason: from getter */
        public final TradabilityDto getRhs_tradability() {
            return this.rhs_tradability;
        }

        /* renamed from: component13, reason: from getter */
        public final NullableStringDto getCusip() {
            return this.cusip;
        }

        /* renamed from: component14, reason: from getter */
        public final InstrumentStateDto getState() {
            return this.state;
        }

        /* renamed from: component15, reason: from getter */
        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component16, reason: from getter */
        public final UUIDDto getChain_pk() {
            return this.chain_pk;
        }

        /* renamed from: component17, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component18, reason: from getter */
        public final SecurityTypeDto getSecurity_type() {
            return this.security_type;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getMifid_2_dually_listed() {
            return this.mifid_2_dually_listed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component20, reason: from getter */
        public final NullableCurrencyDetailsDto getCurrency_details() {
            return this.currency_details;
        }

        /* renamed from: component21, reason: from getter */
        public final NullableCurrencyPairDetailsDto getCurrency_pair_details() {
            return this.currency_pair_details;
        }

        /* renamed from: component22, reason: from getter */
        public final TradabilityDto getTradability_for_late_closing_etfs() {
            return this.tradability_for_late_closing_etfs;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMarket() {
            return this.market;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getIpo_date() {
            return this.ipo_date;
        }

        /* renamed from: component5, reason: from getter */
        public final DecimalDto getMin_tick_size() {
            return this.min_tick_size;
        }

        /* renamed from: component6, reason: from getter */
        public final InstrumentTypeDto getType() {
            return this.type;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeDto getMaturity_date() {
            return this.maturity_date;
        }

        /* renamed from: component8, reason: from getter */
        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        /* renamed from: component9, reason: from getter */
        public final DecimalDto getStrike_price() {
            return this.strike_price;
        }

        public final Surrogate copy(UUIDDto id, String symbol, String market, TimeDto ipo_date, DecimalDto min_tick_size, InstrumentTypeDto type2, TimeDto maturity_date, PutCallCodeDto put_call_code, DecimalDto strike_price, DecimalDto trade_value_multiplier, List<UUIDDto> underlying_instrument_ids, TradabilityDto rhs_tradability, NullableStringDto cusip, InstrumentStateDto state, TimeDto updated_at, UUIDDto chain_pk, String country, SecurityTypeDto security_type, boolean mifid_2_dually_listed, NullableCurrencyDetailsDto currency_details, NullableCurrencyPairDetailsDto currency_pair_details, TradabilityDto tradability_for_late_closing_etfs) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(market, "market");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(underlying_instrument_ids, "underlying_instrument_ids");
            Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(security_type, "security_type");
            Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
            return new Surrogate(id, symbol, market, ipo_date, min_tick_size, type2, maturity_date, put_call_code, strike_price, trade_value_multiplier, underlying_instrument_ids, rhs_tradability, cusip, state, updated_at, chain_pk, country, security_type, mifid_2_dually_listed, currency_details, currency_pair_details, tradability_for_late_closing_etfs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.market, surrogate.market) && Intrinsics.areEqual(this.ipo_date, surrogate.ipo_date) && Intrinsics.areEqual(this.min_tick_size, surrogate.min_tick_size) && this.type == surrogate.type && Intrinsics.areEqual(this.maturity_date, surrogate.maturity_date) && this.put_call_code == surrogate.put_call_code && Intrinsics.areEqual(this.strike_price, surrogate.strike_price) && Intrinsics.areEqual(this.trade_value_multiplier, surrogate.trade_value_multiplier) && Intrinsics.areEqual(this.underlying_instrument_ids, surrogate.underlying_instrument_ids) && this.rhs_tradability == surrogate.rhs_tradability && Intrinsics.areEqual(this.cusip, surrogate.cusip) && this.state == surrogate.state && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.chain_pk, surrogate.chain_pk) && Intrinsics.areEqual(this.country, surrogate.country) && this.security_type == surrogate.security_type && this.mifid_2_dually_listed == surrogate.mifid_2_dually_listed && Intrinsics.areEqual(this.currency_details, surrogate.currency_details) && Intrinsics.areEqual(this.currency_pair_details, surrogate.currency_pair_details) && this.tradability_for_late_closing_etfs == surrogate.tradability_for_late_closing_etfs;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (((((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.market.hashCode()) * 31;
            TimeDto timeDto = this.ipo_date;
            int iHashCode2 = (iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            DecimalDto decimalDto = this.min_tick_size;
            int iHashCode3 = (((iHashCode2 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31) + this.type.hashCode()) * 31;
            TimeDto timeDto2 = this.maturity_date;
            int iHashCode4 = (((iHashCode3 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + this.put_call_code.hashCode()) * 31;
            DecimalDto decimalDto2 = this.strike_price;
            int iHashCode5 = (iHashCode4 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.trade_value_multiplier;
            int iHashCode6 = (((((iHashCode5 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31) + this.underlying_instrument_ids.hashCode()) * 31) + this.rhs_tradability.hashCode()) * 31;
            NullableStringDto nullableStringDto = this.cusip;
            int iHashCode7 = (((iHashCode6 + (nullableStringDto == null ? 0 : nullableStringDto.hashCode())) * 31) + this.state.hashCode()) * 31;
            TimeDto timeDto3 = this.updated_at;
            int iHashCode8 = (iHashCode7 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31;
            UUIDDto uUIDDto2 = this.chain_pk;
            int iHashCode9 = (((((((iHashCode8 + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.country.hashCode()) * 31) + this.security_type.hashCode()) * 31) + Boolean.hashCode(this.mifid_2_dually_listed)) * 31;
            NullableCurrencyDetailsDto nullableCurrencyDetailsDto = this.currency_details;
            int iHashCode10 = (iHashCode9 + (nullableCurrencyDetailsDto == null ? 0 : nullableCurrencyDetailsDto.hashCode())) * 31;
            NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto = this.currency_pair_details;
            return ((iHashCode10 + (nullableCurrencyPairDetailsDto != null ? nullableCurrencyPairDetailsDto.hashCode() : 0)) * 31) + this.tradability_for_late_closing_etfs.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", symbol=" + this.symbol + ", market=" + this.market + ", ipo_date=" + this.ipo_date + ", min_tick_size=" + this.min_tick_size + ", type=" + this.type + ", maturity_date=" + this.maturity_date + ", put_call_code=" + this.put_call_code + ", strike_price=" + this.strike_price + ", trade_value_multiplier=" + this.trade_value_multiplier + ", underlying_instrument_ids=" + this.underlying_instrument_ids + ", rhs_tradability=" + this.rhs_tradability + ", cusip=" + this.cusip + ", state=" + this.state + ", updated_at=" + this.updated_at + ", chain_pk=" + this.chain_pk + ", country=" + this.country + ", security_type=" + this.security_type + ", mifid_2_dually_listed=" + this.mifid_2_dually_listed + ", currency_details=" + this.currency_details + ", currency_pair_details=" + this.currency_pair_details + ", tradability_for_late_closing_etfs=" + this.tradability_for_late_closing_etfs + ")";
        }

        /* compiled from: InstrumentInfoDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InstrumentInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, String str, String str2, TimeDto timeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto2, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto2, DecimalDto decimalDto3, List list, TradabilityDto tradabilityDto, NullableStringDto nullableStringDto, InstrumentStateDto instrumentStateDto, TimeDto timeDto3, UUIDDto uUIDDto2, String str3, SecurityTypeDto securityTypeDto, boolean z, NullableCurrencyDetailsDto nullableCurrencyDetailsDto, NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto, TradabilityDto tradabilityDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str;
            }
            if ((i & 4) == 0) {
                this.market = "";
            } else {
                this.market = str2;
            }
            if ((i & 8) == 0) {
                this.ipo_date = null;
            } else {
                this.ipo_date = timeDto;
            }
            if ((i & 16) == 0) {
                this.min_tick_size = null;
            } else {
                this.min_tick_size = decimalDto;
            }
            if ((i & 32) == 0) {
                this.type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = instrumentTypeDto;
            }
            if ((i & 64) == 0) {
                this.maturity_date = null;
            } else {
                this.maturity_date = timeDto2;
            }
            if ((i & 128) == 0) {
                this.put_call_code = PutCallCodeDto.INSTANCE.getZeroValue();
            } else {
                this.put_call_code = putCallCodeDto;
            }
            if ((i & 256) == 0) {
                this.strike_price = null;
            } else {
                this.strike_price = decimalDto2;
            }
            if ((i & 512) == 0) {
                this.trade_value_multiplier = null;
            } else {
                this.trade_value_multiplier = decimalDto3;
            }
            if ((i & 1024) == 0) {
                this.underlying_instrument_ids = CollectionsKt.emptyList();
            } else {
                this.underlying_instrument_ids = list;
            }
            if ((i & 2048) == 0) {
                this.rhs_tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.rhs_tradability = tradabilityDto;
            }
            if ((i & 4096) == 0) {
                this.cusip = null;
            } else {
                this.cusip = nullableStringDto;
            }
            this.state = (i & 8192) == 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto;
            if ((i & 16384) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = timeDto3;
            }
            if ((32768 & i) == 0) {
                this.chain_pk = null;
            } else {
                this.chain_pk = uUIDDto2;
            }
            if ((65536 & i) == 0) {
                this.country = "";
            } else {
                this.country = str3;
            }
            this.security_type = (131072 & i) == 0 ? SecurityTypeDto.INSTANCE.getZeroValue() : securityTypeDto;
            this.mifid_2_dually_listed = (262144 & i) == 0 ? false : z;
            if ((524288 & i) == 0) {
                this.currency_details = null;
            } else {
                this.currency_details = nullableCurrencyDetailsDto;
            }
            if ((1048576 & i) == 0) {
                this.currency_pair_details = null;
            } else {
                this.currency_pair_details = nullableCurrencyPairDetailsDto;
            }
            this.tradability_for_late_closing_etfs = (i & 2097152) == 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.symbol);
            }
            if (!Intrinsics.areEqual(self.market, "")) {
                output.encodeStringElement(serialDesc, 2, self.market);
            }
            TimeDto timeDto = self.ipo_date;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto);
            }
            DecimalDto decimalDto = self.min_tick_size;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            if (self.type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, InstrumentTypeDto.Serializer.INSTANCE, self.type);
            }
            TimeDto timeDto2 = self.maturity_date;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (self.put_call_code != PutCallCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, PutCallCodeDto.Serializer.INSTANCE, self.put_call_code);
            }
            DecimalDto decimalDto2 = self.strike_price;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.trade_value_multiplier;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            if (!Intrinsics.areEqual(self.underlying_instrument_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.underlying_instrument_ids);
            }
            TradabilityDto tradabilityDto = self.rhs_tradability;
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            if (tradabilityDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, TradabilityDto.Serializer.INSTANCE, self.rhs_tradability);
            }
            NullableStringDto nullableStringDto = self.cusip;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
            if (self.state != InstrumentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, InstrumentStateDto.Serializer.INSTANCE, self.state);
            }
            TimeDto timeDto3 = self.updated_at;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            UUIDDto uUIDDto2 = self.chain_pk;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (!Intrinsics.areEqual(self.country, "")) {
                output.encodeStringElement(serialDesc, 16, self.country);
            }
            if (self.security_type != SecurityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 17, SecurityTypeDto.Serializer.INSTANCE, self.security_type);
            }
            boolean z = self.mifid_2_dually_listed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 18, z);
            }
            NullableCurrencyDetailsDto nullableCurrencyDetailsDto = self.currency_details;
            if (nullableCurrencyDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, NullableCurrencyDetailsDto.Serializer.INSTANCE, nullableCurrencyDetailsDto);
            }
            NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto = self.currency_pair_details;
            if (nullableCurrencyPairDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, NullableCurrencyPairDetailsDto.Serializer.INSTANCE, nullableCurrencyPairDetailsDto);
            }
            if (self.tradability_for_late_closing_etfs != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 21, TradabilityDto.Serializer.INSTANCE, self.tradability_for_late_closing_etfs);
            }
        }

        public Surrogate(UUIDDto uUIDDto, String symbol, String market, TimeDto timeDto, DecimalDto decimalDto, InstrumentTypeDto type2, TimeDto timeDto2, PutCallCodeDto put_call_code, DecimalDto decimalDto2, DecimalDto decimalDto3, List<UUIDDto> underlying_instrument_ids, TradabilityDto rhs_tradability, NullableStringDto nullableStringDto, InstrumentStateDto state, TimeDto timeDto3, UUIDDto uUIDDto2, String country, SecurityTypeDto security_type, boolean z, NullableCurrencyDetailsDto nullableCurrencyDetailsDto, NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto, TradabilityDto tradability_for_late_closing_etfs) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(market, "market");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(underlying_instrument_ids, "underlying_instrument_ids");
            Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(security_type, "security_type");
            Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
            this.id = uUIDDto;
            this.symbol = symbol;
            this.market = market;
            this.ipo_date = timeDto;
            this.min_tick_size = decimalDto;
            this.type = type2;
            this.maturity_date = timeDto2;
            this.put_call_code = put_call_code;
            this.strike_price = decimalDto2;
            this.trade_value_multiplier = decimalDto3;
            this.underlying_instrument_ids = underlying_instrument_ids;
            this.rhs_tradability = rhs_tradability;
            this.cusip = nullableStringDto;
            this.state = state;
            this.updated_at = timeDto3;
            this.chain_pk = uUIDDto2;
            this.country = country;
            this.security_type = security_type;
            this.mifid_2_dually_listed = z;
            this.currency_details = nullableCurrencyDetailsDto;
            this.currency_pair_details = nullableCurrencyPairDetailsDto;
            this.tradability_for_late_closing_etfs = tradability_for_late_closing_etfs;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, String str, String str2, TimeDto timeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, TimeDto timeDto2, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto2, DecimalDto decimalDto3, List list, TradabilityDto tradabilityDto, NullableStringDto nullableStringDto, InstrumentStateDto instrumentStateDto, TimeDto timeDto3, UUIDDto uUIDDto2, String str3, SecurityTypeDto securityTypeDto, boolean z, NullableCurrencyDetailsDto nullableCurrencyDetailsDto, NullableCurrencyPairDetailsDto nullableCurrencyPairDetailsDto, TradabilityDto tradabilityDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : decimalDto, (i & 32) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 64) != 0 ? null : timeDto2, (i & 128) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i & 256) != 0 ? null : decimalDto2, (i & 512) != 0 ? null : decimalDto3, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 4096) != 0 ? null : nullableStringDto, (i & 8192) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 16384) != 0 ? null : timeDto3, (i & 32768) != 0 ? null : uUIDDto2, (i & 65536) == 0 ? str3 : "", (i & 131072) != 0 ? SecurityTypeDto.INSTANCE.getZeroValue() : securityTypeDto, (i & 262144) != 0 ? false : z, (i & 524288) != 0 ? null : nullableCurrencyDetailsDto, (i & 1048576) != 0 ? null : nullableCurrencyPairDetailsDto, (i & 2097152) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2);
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getMarket() {
            return this.market;
        }

        public final TimeDto getIpo_date() {
            return this.ipo_date;
        }

        public final DecimalDto getMin_tick_size() {
            return this.min_tick_size;
        }

        public final InstrumentTypeDto getType() {
            return this.type;
        }

        public final TimeDto getMaturity_date() {
            return this.maturity_date;
        }

        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        public final DecimalDto getStrike_price() {
            return this.strike_price;
        }

        public final DecimalDto getTrade_value_multiplier() {
            return this.trade_value_multiplier;
        }

        public final List<UUIDDto> getUnderlying_instrument_ids() {
            return this.underlying_instrument_ids;
        }

        public final TradabilityDto getRhs_tradability() {
            return this.rhs_tradability;
        }

        public final NullableStringDto getCusip() {
            return this.cusip;
        }

        public final InstrumentStateDto getState() {
            return this.state;
        }

        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        public final UUIDDto getChain_pk() {
            return this.chain_pk;
        }

        public final String getCountry() {
            return this.country;
        }

        public final SecurityTypeDto getSecurity_type() {
            return this.security_type;
        }

        public final boolean getMifid_2_dually_listed() {
            return this.mifid_2_dually_listed;
        }

        public final NullableCurrencyDetailsDto getCurrency_details() {
            return this.currency_details;
        }

        public final NullableCurrencyPairDetailsDto getCurrency_pair_details() {
            return this.currency_pair_details;
        }

        public final TradabilityDto getTradability_for_late_closing_etfs() {
            return this.tradability_for_late_closing_etfs;
        }
    }

    /* compiled from: InstrumentInfoDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoDto;", "Lcom/robinhood/rosetta/mainst/InstrumentInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/InstrumentInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InstrumentInfoDto, InstrumentInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InstrumentInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) InstrumentInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InstrumentInfo> getProtoAdapter() {
            return InstrumentInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentInfoDto getZeroValue() {
            return InstrumentInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentInfoDto fromProto(InstrumentInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            String symbol = proto.getSymbol();
            String market = proto.getMarket();
            Time ipo_date = proto.getIpo_date();
            TimeDto timeDtoFromProto = ipo_date != null ? TimeDto.INSTANCE.fromProto(ipo_date) : null;
            Decimal min_tick_size = proto.getMin_tick_size();
            DecimalDto decimalDtoFromProto = min_tick_size != null ? DecimalDto.INSTANCE.fromProto(min_tick_size) : null;
            InstrumentTypeDto instrumentTypeDtoFromProto = InstrumentTypeDto.INSTANCE.fromProto(proto.getType());
            Time maturity_date = proto.getMaturity_date();
            TimeDto timeDtoFromProto2 = maturity_date != null ? TimeDto.INSTANCE.fromProto(maturity_date) : null;
            PutCallCodeDto putCallCodeDtoFromProto = PutCallCodeDto.INSTANCE.fromProto(proto.getPut_call_code());
            Decimal strike_price = proto.getStrike_price();
            DecimalDto decimalDtoFromProto2 = strike_price != null ? DecimalDto.INSTANCE.fromProto(strike_price) : null;
            Decimal trade_value_multiplier = proto.getTrade_value_multiplier();
            DecimalDto decimalDtoFromProto3 = trade_value_multiplier != null ? DecimalDto.INSTANCE.fromProto(trade_value_multiplier) : null;
            List<UUID> underlying_instrument_ids = proto.getUnderlying_instrument_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(underlying_instrument_ids, 10));
            Iterator<T> it = underlying_instrument_ids.iterator();
            while (it.hasNext()) {
                arrayList.add(UUIDDto.INSTANCE.fromProto((UUID) it.next()));
            }
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            TradabilityDto tradabilityDtoFromProto = companion.fromProto(proto.getRhs_tradability());
            NullableString cusip = proto.getCusip();
            NullableStringDto nullableStringDtoFromProto = cusip != null ? NullableStringDto.INSTANCE.fromProto(cusip) : null;
            InstrumentStateDto instrumentStateDtoFromProto = InstrumentStateDto.INSTANCE.fromProto(proto.getState());
            Time updated_at = proto.getUpdated_at();
            TimeDto timeDtoFromProto3 = updated_at != null ? TimeDto.INSTANCE.fromProto(updated_at) : null;
            UUID chain_pk = proto.getChain_pk();
            UUIDDto uUIDDtoFromProto2 = chain_pk != null ? UUIDDto.INSTANCE.fromProto(chain_pk) : null;
            String country = proto.getCountry();
            SecurityTypeDto securityTypeDtoFromProto = SecurityTypeDto.INSTANCE.fromProto(proto.getSecurity_type());
            boolean mifid_2_dually_listed = proto.getMifid_2_dually_listed();
            NullableCurrencyDetails currency_details = proto.getCurrency_details();
            NullableCurrencyDetailsDto nullableCurrencyDetailsDtoFromProto = currency_details != null ? NullableCurrencyDetailsDto.INSTANCE.fromProto(currency_details) : null;
            NullableCurrencyPairDetails currency_pair_details = proto.getCurrency_pair_details();
            return new InstrumentInfoDto(new Surrogate(uUIDDtoFromProto, symbol, market, timeDtoFromProto, decimalDtoFromProto, instrumentTypeDtoFromProto, timeDtoFromProto2, putCallCodeDtoFromProto, decimalDtoFromProto2, decimalDtoFromProto3, arrayList, tradabilityDtoFromProto, nullableStringDtoFromProto, instrumentStateDtoFromProto, timeDtoFromProto3, uUIDDtoFromProto2, country, securityTypeDtoFromProto, mifid_2_dually_listed, nullableCurrencyDetailsDtoFromProto, currency_pair_details != null ? NullableCurrencyPairDetailsDto.INSTANCE.fromProto(currency_pair_details) : null, companion.fromProto(proto.getTradability_for_late_closing_etfs())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.InstrumentInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentInfoDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new InstrumentInfoDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InstrumentInfoDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InstrumentInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.InstrumentInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InstrumentInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InstrumentInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InstrumentInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InstrumentInfoDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.InstrumentInfoDto";
        }
    }
}
