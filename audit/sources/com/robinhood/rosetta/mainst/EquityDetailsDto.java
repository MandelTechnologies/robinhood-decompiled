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
import com.robinhood.rosetta.mainst.InternalHaltDetailsDto;
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
import rosetta.mainst.ClearingBroker;
import rosetta.mainst.ClearingBrokerDto;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.InstrumentStateDto;
import rosetta.mainst.SecurityType;
import rosetta.mainst.SecurityTypeDto;
import rosetta.mainst.Tradability;
import rosetta.mainst.TradabilityDto;

/* compiled from: EquityDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004OPQRB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÉ\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\u001a\u0012\b\b\u0002\u0010\"\u001a\u00020#¢\u0006\u0004\b\u0006\u0010$JÆ\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020#J\b\u0010B\u001a\u00020\u0002H\u0016J\b\u0010C\u001a\u00020\u000bH\u0016J\u0013\u0010D\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010FH\u0096\u0002J\b\u0010G\u001a\u00020HH\u0016J\u0018\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020HH\u0016J\b\u0010N\u001a\u00020HH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010(R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u001b\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b8\u00107R\u0011\u0010\u001c\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b9\u00101R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010,R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b;\u0010,R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010!\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b>\u00107R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006S"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/EquityDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "symbol", "", "cusip", "market", "list_date", "Lcom/robinhood/rosetta/mainst/TimeDto;", "security_type", "Lrosetta/mainst/SecurityTypeDto;", PlaceTypes.COUNTRY, "mifid_2_dually_listed", "", "min_tick_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "state", "Lrosetta/mainst/InstrumentStateDto;", "rhs_tradability", "Lrosetta/mainst/TradabilityDto;", "fractional_tradability", "eh_fractional_tradability", "created_at", "updated_at", "halt_details", "Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "all_day_tradability", "clearing_broker", "Lrosetta/mainst/ClearingBrokerDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/SecurityTypeDto;Ljava/lang/String;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentStateDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;ZLcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/ClearingBrokerDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getSymbol", "()Ljava/lang/String;", "getCusip", "getMarket", "getList_date", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getSecurity_type", "()Lrosetta/mainst/SecurityTypeDto;", "getCountry", "getMifid_2_dually_listed", "()Z", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getRhs_tradability", "()Lrosetta/mainst/TradabilityDto;", "getFractional_tradability", "getEh_fractional_tradability", "getCreated_at", "getUpdated_at", "getHalt_details", "()Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "getAll_day_tradability", "getClearing_broker", "()Lrosetta/mainst/ClearingBrokerDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class EquityDetailsDto implements Dto3<EquityDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquityDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquityDetailsDto, EquityDetails>> binaryBase64Serializer$delegate;
    private static final EquityDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquityDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquityDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getCusip() {
        return this.surrogate.getCusip();
    }

    public final String getMarket() {
        return this.surrogate.getMarket();
    }

    public final TimeDto getList_date() {
        return this.surrogate.getList_date();
    }

    public final SecurityTypeDto getSecurity_type() {
        return this.surrogate.getSecurity_type();
    }

    public final String getCountry() {
        return this.surrogate.getCountry();
    }

    public final boolean getMifid_2_dually_listed() {
        return this.surrogate.getMifid_2_dually_listed();
    }

    public final DecimalDto getMin_tick_size() {
        return this.surrogate.getMin_tick_size();
    }

    public final InstrumentStateDto getState() {
        return this.surrogate.getState();
    }

    public final TradabilityDto getRhs_tradability() {
        return this.surrogate.getRhs_tradability();
    }

    public final TradabilityDto getFractional_tradability() {
        return this.surrogate.getFractional_tradability();
    }

    public final boolean getEh_fractional_tradability() {
        return this.surrogate.getEh_fractional_tradability();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final InternalHaltDetailsDto getHalt_details() {
        return this.surrogate.getHalt_details();
    }

    public final TradabilityDto getAll_day_tradability() {
        return this.surrogate.getAll_day_tradability();
    }

    public final ClearingBrokerDto getClearing_broker() {
        return this.surrogate.getClearing_broker();
    }

    public /* synthetic */ EquityDetailsDto(UUIDDto uUIDDto, String str, String str2, String str3, TimeDto timeDto, SecurityTypeDto securityTypeDto, String str4, boolean z, DecimalDto decimalDto, InstrumentStateDto instrumentStateDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, boolean z2, TimeDto timeDto2, TimeDto timeDto3, InternalHaltDetailsDto internalHaltDetailsDto, TradabilityDto tradabilityDto3, ClearingBrokerDto clearingBrokerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : timeDto, (i & 32) != 0 ? SecurityTypeDto.INSTANCE.getZeroValue() : securityTypeDto, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : decimalDto, (i & 512) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 1024) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 2048) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2, (i & 4096) == 0 ? z2 : false, (i & 8192) != 0 ? null : timeDto2, (i & 16384) != 0 ? null : timeDto3, (i & 32768) != 0 ? null : internalHaltDetailsDto, (i & 65536) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto3, (i & 131072) != 0 ? ClearingBrokerDto.INSTANCE.getZeroValue() : clearingBrokerDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquityDetailsDto(UUIDDto uUIDDto, String symbol, String cusip, String market, TimeDto timeDto, SecurityTypeDto security_type, String country, boolean z, DecimalDto decimalDto, InstrumentStateDto state, TradabilityDto rhs_tradability, TradabilityDto fractional_tradability, boolean z2, TimeDto timeDto2, TimeDto timeDto3, InternalHaltDetailsDto internalHaltDetailsDto, TradabilityDto all_day_tradability, ClearingBrokerDto clearing_broker) {
        this(new Surrogate(uUIDDto, symbol, cusip, market, timeDto, security_type, country, z, decimalDto, state, rhs_tradability, fractional_tradability, z2, timeDto2, timeDto3, internalHaltDetailsDto, all_day_tradability, clearing_broker));
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(cusip, "cusip");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(security_type, "security_type");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(fractional_tradability, "fractional_tradability");
        Intrinsics.checkNotNullParameter(all_day_tradability, "all_day_tradability");
        Intrinsics.checkNotNullParameter(clearing_broker, "clearing_broker");
    }

    public static /* synthetic */ EquityDetailsDto copy$default(EquityDetailsDto equityDetailsDto, UUIDDto uUIDDto, String str, String str2, String str3, TimeDto timeDto, SecurityTypeDto securityTypeDto, String str4, boolean z, DecimalDto decimalDto, InstrumentStateDto instrumentStateDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, boolean z2, TimeDto timeDto2, TimeDto timeDto3, InternalHaltDetailsDto internalHaltDetailsDto, TradabilityDto tradabilityDto3, ClearingBrokerDto clearingBrokerDto, int i, Object obj) {
        ClearingBrokerDto clearing_broker;
        TradabilityDto tradabilityDto4;
        UUIDDto id = (i & 1) != 0 ? equityDetailsDto.surrogate.getId() : uUIDDto;
        String symbol = (i & 2) != 0 ? equityDetailsDto.surrogate.getSymbol() : str;
        String cusip = (i & 4) != 0 ? equityDetailsDto.surrogate.getCusip() : str2;
        String market = (i & 8) != 0 ? equityDetailsDto.surrogate.getMarket() : str3;
        TimeDto list_date = (i & 16) != 0 ? equityDetailsDto.surrogate.getList_date() : timeDto;
        SecurityTypeDto security_type = (i & 32) != 0 ? equityDetailsDto.surrogate.getSecurity_type() : securityTypeDto;
        String country = (i & 64) != 0 ? equityDetailsDto.surrogate.getCountry() : str4;
        boolean mifid_2_dually_listed = (i & 128) != 0 ? equityDetailsDto.surrogate.getMifid_2_dually_listed() : z;
        DecimalDto min_tick_size = (i & 256) != 0 ? equityDetailsDto.surrogate.getMin_tick_size() : decimalDto;
        InstrumentStateDto state = (i & 512) != 0 ? equityDetailsDto.surrogate.getState() : instrumentStateDto;
        TradabilityDto rhs_tradability = (i & 1024) != 0 ? equityDetailsDto.surrogate.getRhs_tradability() : tradabilityDto;
        TradabilityDto fractional_tradability = (i & 2048) != 0 ? equityDetailsDto.surrogate.getFractional_tradability() : tradabilityDto2;
        boolean eh_fractional_tradability = (i & 4096) != 0 ? equityDetailsDto.surrogate.getEh_fractional_tradability() : z2;
        TimeDto created_at = (i & 8192) != 0 ? equityDetailsDto.surrogate.getCreated_at() : timeDto2;
        UUIDDto uUIDDto2 = id;
        TimeDto updated_at = (i & 16384) != 0 ? equityDetailsDto.surrogate.getUpdated_at() : timeDto3;
        InternalHaltDetailsDto halt_details = (i & 32768) != 0 ? equityDetailsDto.surrogate.getHalt_details() : internalHaltDetailsDto;
        TradabilityDto all_day_tradability = (i & 65536) != 0 ? equityDetailsDto.surrogate.getAll_day_tradability() : tradabilityDto3;
        if ((i & 131072) != 0) {
            tradabilityDto4 = all_day_tradability;
            clearing_broker = equityDetailsDto.surrogate.getClearing_broker();
        } else {
            clearing_broker = clearingBrokerDto;
            tradabilityDto4 = all_day_tradability;
        }
        return equityDetailsDto.copy(uUIDDto2, symbol, cusip, market, list_date, security_type, country, mifid_2_dually_listed, min_tick_size, state, rhs_tradability, fractional_tradability, eh_fractional_tradability, created_at, updated_at, halt_details, tradabilityDto4, clearing_broker);
    }

    public final EquityDetailsDto copy(UUIDDto id, String symbol, String cusip, String market, TimeDto list_date, SecurityTypeDto security_type, String country, boolean mifid_2_dually_listed, DecimalDto min_tick_size, InstrumentStateDto state, TradabilityDto rhs_tradability, TradabilityDto fractional_tradability, boolean eh_fractional_tradability, TimeDto created_at, TimeDto updated_at, InternalHaltDetailsDto halt_details, TradabilityDto all_day_tradability, ClearingBrokerDto clearing_broker) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(cusip, "cusip");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(security_type, "security_type");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(fractional_tradability, "fractional_tradability");
        Intrinsics.checkNotNullParameter(all_day_tradability, "all_day_tradability");
        Intrinsics.checkNotNullParameter(clearing_broker, "clearing_broker");
        return new EquityDetailsDto(new Surrogate(id, symbol, cusip, market, list_date, security_type, country, mifid_2_dually_listed, min_tick_size, state, rhs_tradability, fractional_tradability, eh_fractional_tradability, created_at, updated_at, halt_details, all_day_tradability, clearing_broker));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquityDetails toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        String symbol = this.surrogate.getSymbol();
        String cusip = this.surrogate.getCusip();
        String market = this.surrogate.getMarket();
        TimeDto list_date = this.surrogate.getList_date();
        Time proto2 = list_date != null ? list_date.toProto() : null;
        SecurityType securityType = (SecurityType) this.surrogate.getSecurity_type().toProto();
        String country = this.surrogate.getCountry();
        boolean mifid_2_dually_listed = this.surrogate.getMifid_2_dually_listed();
        DecimalDto min_tick_size = this.surrogate.getMin_tick_size();
        Decimal proto3 = min_tick_size != null ? min_tick_size.toProto() : null;
        InstrumentState instrumentState = (InstrumentState) this.surrogate.getState().toProto();
        Tradability tradability = (Tradability) this.surrogate.getRhs_tradability().toProto();
        Tradability tradability2 = (Tradability) this.surrogate.getFractional_tradability().toProto();
        boolean eh_fractional_tradability = this.surrogate.getEh_fractional_tradability();
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto4 = created_at != null ? created_at.toProto() : null;
        TimeDto updated_at = this.surrogate.getUpdated_at();
        Time proto5 = updated_at != null ? updated_at.toProto() : null;
        InternalHaltDetailsDto halt_details = this.surrogate.getHalt_details();
        return new EquityDetails(proto, symbol, cusip, market, proto2, securityType, country, mifid_2_dually_listed, proto3, instrumentState, tradability, tradability2, eh_fractional_tradability, proto4, proto5, halt_details != null ? halt_details.toProto() : null, (Tradability) this.surrogate.getAll_day_tradability().toProto(), (ClearingBroker) this.surrogate.getClearing_broker().toProto(), null, 262144, null);
    }

    public String toString() {
        return "[EquityDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquityDetailsDto) && Intrinsics.areEqual(((EquityDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquityDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 t2\u00020\u0001:\u0002stBÇ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fBË\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001e\u0010$J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010Y\u001a\u00020\u000bHÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010]\u001a\u00020\u0012HÆ\u0003J\t\u0010^\u001a\u00020\u0014HÆ\u0003J\t\u0010_\u001a\u00020\u0014HÆ\u0003J\t\u0010`\u001a\u00020\u000eHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010d\u001a\u00020\u0014HÆ\u0003J\t\u0010e\u001a\u00020\u001dHÆ\u0003JÉ\u0001\u0010f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010g\u001a\u00020\u000e2\b\u0010h\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010i\u001a\u00020!HÖ\u0001J\t\u0010j\u001a\u00020\u0005HÖ\u0001J%\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u00002\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020qH\u0001¢\u0006\u0002\brR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b*\u0010+R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010&\u001a\u0004\b-\u0010+R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010&\u001a\u0004\b/\u0010+R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010&\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010&\u001a\u0004\b4\u00105R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010&\u001a\u0004\b7\u0010+R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010&\u001a\u0004\b9\u0010:R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010&\u001a\u0004\b<\u0010=R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010&\u001a\u0004\b?\u0010@R\u001c\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010&\u001a\u0004\bB\u0010CR\u001c\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010&\u001a\u0004\bE\u0010CR\u001c\u0010\u0016\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010&\u001a\u0004\bG\u0010:R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010&\u001a\u0004\bI\u00102R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010&\u001a\u0004\bK\u00102R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010&\u001a\u0004\bM\u0010NR\u001c\u0010\u001b\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010&\u001a\u0004\bP\u0010CR\u001c\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010&\u001a\u0004\bR\u0010S¨\u0006u"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "symbol", "", "cusip", "market", "list_date", "Lcom/robinhood/rosetta/mainst/TimeDto;", "security_type", "Lrosetta/mainst/SecurityTypeDto;", PlaceTypes.COUNTRY, "mifid_2_dually_listed", "", "min_tick_size", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "state", "Lrosetta/mainst/InstrumentStateDto;", "rhs_tradability", "Lrosetta/mainst/TradabilityDto;", "fractional_tradability", "eh_fractional_tradability", "created_at", "updated_at", "halt_details", "Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "all_day_tradability", "clearing_broker", "Lrosetta/mainst/ClearingBrokerDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/SecurityTypeDto;Ljava/lang/String;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentStateDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;ZLcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/ClearingBrokerDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/SecurityTypeDto;Ljava/lang/String;ZLcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentStateDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;ZLcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/ClearingBrokerDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getSymbol$annotations", "getSymbol", "()Ljava/lang/String;", "getCusip$annotations", "getCusip", "getMarket$annotations", "getMarket", "getList_date$annotations", "getList_date", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getSecurity_type$annotations", "getSecurity_type", "()Lrosetta/mainst/SecurityTypeDto;", "getCountry$annotations", "getCountry", "getMifid_2_dually_listed$annotations", "getMifid_2_dually_listed", "()Z", "getMin_tick_size$annotations", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getState$annotations", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getRhs_tradability$annotations", "getRhs_tradability", "()Lrosetta/mainst/TradabilityDto;", "getFractional_tradability$annotations", "getFractional_tradability", "getEh_fractional_tradability$annotations", "getEh_fractional_tradability", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "getHalt_details$annotations", "getHalt_details", "()Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "getAll_day_tradability$annotations", "getAll_day_tradability", "getClearing_broker$annotations", "getClearing_broker", "()Lrosetta/mainst/ClearingBrokerDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TradabilityDto all_day_tradability;
        private final ClearingBrokerDto clearing_broker;
        private final String country;
        private final TimeDto created_at;
        private final String cusip;
        private final boolean eh_fractional_tradability;
        private final TradabilityDto fractional_tradability;
        private final InternalHaltDetailsDto halt_details;
        private final UUIDDto id;
        private final TimeDto list_date;
        private final String market;
        private final boolean mifid_2_dually_listed;
        private final DecimalDto min_tick_size;
        private final TradabilityDto rhs_tradability;
        private final SecurityTypeDto security_type;
        private final InstrumentStateDto state;
        private final String symbol;
        private final TimeDto updated_at;

        public Surrogate() {
            this((UUIDDto) null, (String) null, (String) null, (String) null, (TimeDto) null, (SecurityTypeDto) null, (String) null, false, (DecimalDto) null, (InstrumentStateDto) null, (TradabilityDto) null, (TradabilityDto) null, false, (TimeDto) null, (TimeDto) null, (InternalHaltDetailsDto) null, (TradabilityDto) null, (ClearingBrokerDto) null, 262143, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, String str, String str2, String str3, TimeDto timeDto, SecurityTypeDto securityTypeDto, String str4, boolean z, DecimalDto decimalDto, InstrumentStateDto instrumentStateDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, boolean z2, TimeDto timeDto2, TimeDto timeDto3, InternalHaltDetailsDto internalHaltDetailsDto, TradabilityDto tradabilityDto3, ClearingBrokerDto clearingBrokerDto, int i, Object obj) {
            ClearingBrokerDto clearingBrokerDto2;
            TradabilityDto tradabilityDto4;
            UUIDDto uUIDDto2 = (i & 1) != 0 ? surrogate.id : uUIDDto;
            String str5 = (i & 2) != 0 ? surrogate.symbol : str;
            String str6 = (i & 4) != 0 ? surrogate.cusip : str2;
            String str7 = (i & 8) != 0 ? surrogate.market : str3;
            TimeDto timeDto4 = (i & 16) != 0 ? surrogate.list_date : timeDto;
            SecurityTypeDto securityTypeDto2 = (i & 32) != 0 ? surrogate.security_type : securityTypeDto;
            String str8 = (i & 64) != 0 ? surrogate.country : str4;
            boolean z3 = (i & 128) != 0 ? surrogate.mifid_2_dually_listed : z;
            DecimalDto decimalDto2 = (i & 256) != 0 ? surrogate.min_tick_size : decimalDto;
            InstrumentStateDto instrumentStateDto2 = (i & 512) != 0 ? surrogate.state : instrumentStateDto;
            TradabilityDto tradabilityDto5 = (i & 1024) != 0 ? surrogate.rhs_tradability : tradabilityDto;
            TradabilityDto tradabilityDto6 = (i & 2048) != 0 ? surrogate.fractional_tradability : tradabilityDto2;
            boolean z4 = (i & 4096) != 0 ? surrogate.eh_fractional_tradability : z2;
            TimeDto timeDto5 = (i & 8192) != 0 ? surrogate.created_at : timeDto2;
            UUIDDto uUIDDto3 = uUIDDto2;
            TimeDto timeDto6 = (i & 16384) != 0 ? surrogate.updated_at : timeDto3;
            InternalHaltDetailsDto internalHaltDetailsDto2 = (i & 32768) != 0 ? surrogate.halt_details : internalHaltDetailsDto;
            TradabilityDto tradabilityDto7 = (i & 65536) != 0 ? surrogate.all_day_tradability : tradabilityDto3;
            if ((i & 131072) != 0) {
                tradabilityDto4 = tradabilityDto7;
                clearingBrokerDto2 = surrogate.clearing_broker;
            } else {
                clearingBrokerDto2 = clearingBrokerDto;
                tradabilityDto4 = tradabilityDto7;
            }
            return surrogate.copy(uUIDDto3, str5, str6, str7, timeDto4, securityTypeDto2, str8, z3, decimalDto2, instrumentStateDto2, tradabilityDto5, tradabilityDto6, z4, timeDto5, timeDto6, internalHaltDetailsDto2, tradabilityDto4, clearingBrokerDto2);
        }

        @SerialName("allDayTradability")
        @JsonAnnotations2(names = {"all_day_tradability"})
        public static /* synthetic */ void getAll_day_tradability$annotations() {
        }

        @SerialName("clearingBroker")
        @JsonAnnotations2(names = {"clearing_broker"})
        public static /* synthetic */ void getClearing_broker$annotations() {
        }

        @SerialName(PlaceTypes.COUNTRY)
        @JsonAnnotations2(names = {PlaceTypes.COUNTRY})
        public static /* synthetic */ void getCountry$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("cusip")
        @JsonAnnotations2(names = {"cusip"})
        public static /* synthetic */ void getCusip$annotations() {
        }

        @SerialName("ehFractionalTradability")
        @JsonAnnotations2(names = {"eh_fractional_tradability"})
        public static /* synthetic */ void getEh_fractional_tradability$annotations() {
        }

        @SerialName("fractionalTradability")
        @JsonAnnotations2(names = {"fractional_tradability"})
        public static /* synthetic */ void getFractional_tradability$annotations() {
        }

        @SerialName("haltDetails")
        @JsonAnnotations2(names = {"halt_details"})
        public static /* synthetic */ void getHalt_details$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("listDate")
        @JsonAnnotations2(names = {"list_date"})
        public static /* synthetic */ void getList_date$annotations() {
        }

        @SerialName("market")
        @JsonAnnotations2(names = {"market"})
        public static /* synthetic */ void getMarket$annotations() {
        }

        @SerialName("mifid2DuallyListed")
        @JsonAnnotations2(names = {"mifid_2_dually_listed"})
        public static /* synthetic */ void getMifid_2_dually_listed$annotations() {
        }

        @SerialName("minTickSize")
        @JsonAnnotations2(names = {"min_tick_size"})
        public static /* synthetic */ void getMin_tick_size$annotations() {
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

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
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
        public final InstrumentStateDto getState() {
            return this.state;
        }

        /* renamed from: component11, reason: from getter */
        public final TradabilityDto getRhs_tradability() {
            return this.rhs_tradability;
        }

        /* renamed from: component12, reason: from getter */
        public final TradabilityDto getFractional_tradability() {
            return this.fractional_tradability;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getEh_fractional_tradability() {
            return this.eh_fractional_tradability;
        }

        /* renamed from: component14, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component15, reason: from getter */
        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component16, reason: from getter */
        public final InternalHaltDetailsDto getHalt_details() {
            return this.halt_details;
        }

        /* renamed from: component17, reason: from getter */
        public final TradabilityDto getAll_day_tradability() {
            return this.all_day_tradability;
        }

        /* renamed from: component18, reason: from getter */
        public final ClearingBrokerDto getClearing_broker() {
            return this.clearing_broker;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCusip() {
            return this.cusip;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMarket() {
            return this.market;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getList_date() {
            return this.list_date;
        }

        /* renamed from: component6, reason: from getter */
        public final SecurityTypeDto getSecurity_type() {
            return this.security_type;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getMifid_2_dually_listed() {
            return this.mifid_2_dually_listed;
        }

        /* renamed from: component9, reason: from getter */
        public final DecimalDto getMin_tick_size() {
            return this.min_tick_size;
        }

        public final Surrogate copy(UUIDDto id, String symbol, String cusip, String market, TimeDto list_date, SecurityTypeDto security_type, String country, boolean mifid_2_dually_listed, DecimalDto min_tick_size, InstrumentStateDto state, TradabilityDto rhs_tradability, TradabilityDto fractional_tradability, boolean eh_fractional_tradability, TimeDto created_at, TimeDto updated_at, InternalHaltDetailsDto halt_details, TradabilityDto all_day_tradability, ClearingBrokerDto clearing_broker) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(cusip, "cusip");
            Intrinsics.checkNotNullParameter(market, "market");
            Intrinsics.checkNotNullParameter(security_type, "security_type");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
            Intrinsics.checkNotNullParameter(fractional_tradability, "fractional_tradability");
            Intrinsics.checkNotNullParameter(all_day_tradability, "all_day_tradability");
            Intrinsics.checkNotNullParameter(clearing_broker, "clearing_broker");
            return new Surrogate(id, symbol, cusip, market, list_date, security_type, country, mifid_2_dually_listed, min_tick_size, state, rhs_tradability, fractional_tradability, eh_fractional_tradability, created_at, updated_at, halt_details, all_day_tradability, clearing_broker);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.cusip, surrogate.cusip) && Intrinsics.areEqual(this.market, surrogate.market) && Intrinsics.areEqual(this.list_date, surrogate.list_date) && this.security_type == surrogate.security_type && Intrinsics.areEqual(this.country, surrogate.country) && this.mifid_2_dually_listed == surrogate.mifid_2_dually_listed && Intrinsics.areEqual(this.min_tick_size, surrogate.min_tick_size) && this.state == surrogate.state && this.rhs_tradability == surrogate.rhs_tradability && this.fractional_tradability == surrogate.fractional_tradability && this.eh_fractional_tradability == surrogate.eh_fractional_tradability && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.halt_details, surrogate.halt_details) && this.all_day_tradability == surrogate.all_day_tradability && this.clearing_broker == surrogate.clearing_broker;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (((((((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.cusip.hashCode()) * 31) + this.market.hashCode()) * 31;
            TimeDto timeDto = this.list_date;
            int iHashCode2 = (((((((iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31) + this.security_type.hashCode()) * 31) + this.country.hashCode()) * 31) + Boolean.hashCode(this.mifid_2_dually_listed)) * 31;
            DecimalDto decimalDto = this.min_tick_size;
            int iHashCode3 = (((((((((iHashCode2 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31) + this.state.hashCode()) * 31) + this.rhs_tradability.hashCode()) * 31) + this.fractional_tradability.hashCode()) * 31) + Boolean.hashCode(this.eh_fractional_tradability)) * 31;
            TimeDto timeDto2 = this.created_at;
            int iHashCode4 = (iHashCode3 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31;
            TimeDto timeDto3 = this.updated_at;
            int iHashCode5 = (iHashCode4 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31;
            InternalHaltDetailsDto internalHaltDetailsDto = this.halt_details;
            return ((((iHashCode5 + (internalHaltDetailsDto != null ? internalHaltDetailsDto.hashCode() : 0)) * 31) + this.all_day_tradability.hashCode()) * 31) + this.clearing_broker.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", symbol=" + this.symbol + ", cusip=" + this.cusip + ", market=" + this.market + ", list_date=" + this.list_date + ", security_type=" + this.security_type + ", country=" + this.country + ", mifid_2_dually_listed=" + this.mifid_2_dually_listed + ", min_tick_size=" + this.min_tick_size + ", state=" + this.state + ", rhs_tradability=" + this.rhs_tradability + ", fractional_tradability=" + this.fractional_tradability + ", eh_fractional_tradability=" + this.eh_fractional_tradability + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", halt_details=" + this.halt_details + ", all_day_tradability=" + this.all_day_tradability + ", clearing_broker=" + this.clearing_broker + ")";
        }

        /* compiled from: EquityDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquityDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, String str, String str2, String str3, TimeDto timeDto, SecurityTypeDto securityTypeDto, String str4, boolean z, DecimalDto decimalDto, InstrumentStateDto instrumentStateDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, boolean z2, TimeDto timeDto2, TimeDto timeDto3, InternalHaltDetailsDto internalHaltDetailsDto, TradabilityDto tradabilityDto3, ClearingBrokerDto clearingBrokerDto, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.cusip = "";
            } else {
                this.cusip = str2;
            }
            if ((i & 8) == 0) {
                this.market = "";
            } else {
                this.market = str3;
            }
            if ((i & 16) == 0) {
                this.list_date = null;
            } else {
                this.list_date = timeDto;
            }
            if ((i & 32) == 0) {
                this.security_type = SecurityTypeDto.INSTANCE.getZeroValue();
            } else {
                this.security_type = securityTypeDto;
            }
            if ((i & 64) == 0) {
                this.country = "";
            } else {
                this.country = str4;
            }
            if ((i & 128) == 0) {
                this.mifid_2_dually_listed = false;
            } else {
                this.mifid_2_dually_listed = z;
            }
            if ((i & 256) == 0) {
                this.min_tick_size = null;
            } else {
                this.min_tick_size = decimalDto;
            }
            if ((i & 512) == 0) {
                this.state = InstrumentStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = instrumentStateDto;
            }
            if ((i & 1024) == 0) {
                this.rhs_tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.rhs_tradability = tradabilityDto;
            }
            if ((i & 2048) == 0) {
                this.fractional_tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.fractional_tradability = tradabilityDto2;
            }
            if ((i & 4096) == 0) {
                this.eh_fractional_tradability = false;
            } else {
                this.eh_fractional_tradability = z2;
            }
            if ((i & 8192) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto2;
            }
            if ((i & 16384) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = timeDto3;
            }
            if ((32768 & i) == 0) {
                this.halt_details = null;
            } else {
                this.halt_details = internalHaltDetailsDto;
            }
            this.all_day_tradability = (65536 & i) == 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto3;
            this.clearing_broker = (i & 131072) == 0 ? ClearingBrokerDto.INSTANCE.getZeroValue() : clearingBrokerDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.symbol);
            }
            if (!Intrinsics.areEqual(self.cusip, "")) {
                output.encodeStringElement(serialDesc, 2, self.cusip);
            }
            if (!Intrinsics.areEqual(self.market, "")) {
                output.encodeStringElement(serialDesc, 3, self.market);
            }
            TimeDto timeDto = self.list_date;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto);
            }
            if (self.security_type != SecurityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SecurityTypeDto.Serializer.INSTANCE, self.security_type);
            }
            if (!Intrinsics.areEqual(self.country, "")) {
                output.encodeStringElement(serialDesc, 6, self.country);
            }
            boolean z = self.mifid_2_dually_listed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            DecimalDto decimalDto = self.min_tick_size;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            if (self.state != InstrumentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, InstrumentStateDto.Serializer.INSTANCE, self.state);
            }
            TradabilityDto tradabilityDto = self.rhs_tradability;
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            if (tradabilityDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, TradabilityDto.Serializer.INSTANCE, self.rhs_tradability);
            }
            if (self.fractional_tradability != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, TradabilityDto.Serializer.INSTANCE, self.fractional_tradability);
            }
            boolean z2 = self.eh_fractional_tradability;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 12, z2);
            }
            TimeDto timeDto2 = self.created_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            TimeDto timeDto3 = self.updated_at;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            InternalHaltDetailsDto internalHaltDetailsDto = self.halt_details;
            if (internalHaltDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, InternalHaltDetailsDto.Serializer.INSTANCE, internalHaltDetailsDto);
            }
            if (self.all_day_tradability != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, TradabilityDto.Serializer.INSTANCE, self.all_day_tradability);
            }
            if (self.clearing_broker != ClearingBrokerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 17, ClearingBrokerDto.Serializer.INSTANCE, self.clearing_broker);
            }
        }

        public Surrogate(UUIDDto uUIDDto, String symbol, String cusip, String market, TimeDto timeDto, SecurityTypeDto security_type, String country, boolean z, DecimalDto decimalDto, InstrumentStateDto state, TradabilityDto rhs_tradability, TradabilityDto fractional_tradability, boolean z2, TimeDto timeDto2, TimeDto timeDto3, InternalHaltDetailsDto internalHaltDetailsDto, TradabilityDto all_day_tradability, ClearingBrokerDto clearing_broker) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(cusip, "cusip");
            Intrinsics.checkNotNullParameter(market, "market");
            Intrinsics.checkNotNullParameter(security_type, "security_type");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
            Intrinsics.checkNotNullParameter(fractional_tradability, "fractional_tradability");
            Intrinsics.checkNotNullParameter(all_day_tradability, "all_day_tradability");
            Intrinsics.checkNotNullParameter(clearing_broker, "clearing_broker");
            this.id = uUIDDto;
            this.symbol = symbol;
            this.cusip = cusip;
            this.market = market;
            this.list_date = timeDto;
            this.security_type = security_type;
            this.country = country;
            this.mifid_2_dually_listed = z;
            this.min_tick_size = decimalDto;
            this.state = state;
            this.rhs_tradability = rhs_tradability;
            this.fractional_tradability = fractional_tradability;
            this.eh_fractional_tradability = z2;
            this.created_at = timeDto2;
            this.updated_at = timeDto3;
            this.halt_details = internalHaltDetailsDto;
            this.all_day_tradability = all_day_tradability;
            this.clearing_broker = clearing_broker;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, String str, String str2, String str3, TimeDto timeDto, SecurityTypeDto securityTypeDto, String str4, boolean z, DecimalDto decimalDto, InstrumentStateDto instrumentStateDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, boolean z2, TimeDto timeDto2, TimeDto timeDto3, InternalHaltDetailsDto internalHaltDetailsDto, TradabilityDto tradabilityDto3, ClearingBrokerDto clearingBrokerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : timeDto, (i & 32) != 0 ? SecurityTypeDto.INSTANCE.getZeroValue() : securityTypeDto, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : decimalDto, (i & 512) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 1024) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 2048) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2, (i & 4096) == 0 ? z2 : false, (i & 8192) != 0 ? null : timeDto2, (i & 16384) != 0 ? null : timeDto3, (i & 32768) != 0 ? null : internalHaltDetailsDto, (i & 65536) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto3, (i & 131072) != 0 ? ClearingBrokerDto.INSTANCE.getZeroValue() : clearingBrokerDto);
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getCusip() {
            return this.cusip;
        }

        public final String getMarket() {
            return this.market;
        }

        public final TimeDto getList_date() {
            return this.list_date;
        }

        public final SecurityTypeDto getSecurity_type() {
            return this.security_type;
        }

        public final String getCountry() {
            return this.country;
        }

        public final boolean getMifid_2_dually_listed() {
            return this.mifid_2_dually_listed;
        }

        public final DecimalDto getMin_tick_size() {
            return this.min_tick_size;
        }

        public final InstrumentStateDto getState() {
            return this.state;
        }

        public final TradabilityDto getRhs_tradability() {
            return this.rhs_tradability;
        }

        public final TradabilityDto getFractional_tradability() {
            return this.fractional_tradability;
        }

        public final boolean getEh_fractional_tradability() {
            return this.eh_fractional_tradability;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        public final InternalHaltDetailsDto getHalt_details() {
            return this.halt_details;
        }

        public final TradabilityDto getAll_day_tradability() {
            return this.all_day_tradability;
        }

        public final ClearingBrokerDto getClearing_broker() {
            return this.clearing_broker;
        }
    }

    /* compiled from: EquityDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "Lcom/robinhood/rosetta/mainst/EquityDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EquityDetailsDto, EquityDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquityDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) EquityDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquityDetails> getProtoAdapter() {
            return EquityDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityDetailsDto getZeroValue() {
            return EquityDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityDetailsDto fromProto(EquityDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            String symbol = proto.getSymbol();
            String cusip = proto.getCusip();
            String market = proto.getMarket();
            Time list_date = proto.getList_date();
            TimeDto timeDtoFromProto = list_date != null ? TimeDto.INSTANCE.fromProto(list_date) : null;
            SecurityTypeDto securityTypeDtoFromProto = SecurityTypeDto.INSTANCE.fromProto(proto.getSecurity_type());
            String country = proto.getCountry();
            boolean mifid_2_dually_listed = proto.getMifid_2_dually_listed();
            Decimal min_tick_size = proto.getMin_tick_size();
            DecimalDto decimalDtoFromProto = min_tick_size != null ? DecimalDto.INSTANCE.fromProto(min_tick_size) : null;
            InstrumentStateDto instrumentStateDtoFromProto = InstrumentStateDto.INSTANCE.fromProto(proto.getState());
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            TradabilityDto tradabilityDtoFromProto = companion.fromProto(proto.getRhs_tradability());
            TradabilityDto tradabilityDtoFromProto2 = companion.fromProto(proto.getFractional_tradability());
            boolean eh_fractional_tradability = proto.getEh_fractional_tradability();
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto2 = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time updated_at = proto.getUpdated_at();
            TimeDto timeDtoFromProto3 = updated_at != null ? TimeDto.INSTANCE.fromProto(updated_at) : null;
            InternalHaltDetails halt_details = proto.getHalt_details();
            return new EquityDetailsDto(new Surrogate(uUIDDtoFromProto, symbol, cusip, market, timeDtoFromProto, securityTypeDtoFromProto, country, mifid_2_dually_listed, decimalDtoFromProto, instrumentStateDtoFromProto, tradabilityDtoFromProto, tradabilityDtoFromProto2, eh_fractional_tradability, timeDtoFromProto2, timeDtoFromProto3, halt_details != null ? InternalHaltDetailsDto.INSTANCE.fromProto(halt_details) : null, companion.fromProto(proto.getAll_day_tradability()), ClearingBrokerDto.INSTANCE.fromProto(proto.getClearing_broker())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.EquityDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EquityDetailsDto(null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, 262143, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquityDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EquityDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.EquityDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquityDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquityDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquityDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquityDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/EquityDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.EquityDetailsDto";
        }
    }
}
