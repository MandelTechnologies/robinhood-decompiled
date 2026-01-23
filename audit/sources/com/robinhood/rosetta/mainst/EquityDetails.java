package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.ClearingBroker;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.SecurityType;
import rosetta.mainst.Tradability;

/* compiled from: EquityDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GBÑ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u0010?\u001a\u00020\u0002H\u0017J\u0013\u0010@\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010BH\u0096\u0002J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020\u0006H\u0016JÐ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0016\u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u001c\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006H"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/EquityDetails;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "symbol", "", "cusip", "market", "list_date", "Lcom/robinhood/rosetta/mainst/Time;", "security_type", "Lrosetta/mainst/SecurityType;", PlaceTypes.COUNTRY, "mifid_2_dually_listed", "", "min_tick_size", "Lcom/robinhood/rosetta/mainst/Decimal;", "state", "Lrosetta/mainst/InstrumentState;", "rhs_tradability", "Lrosetta/mainst/Tradability;", "fractional_tradability", "eh_fractional_tradability", "created_at", "updated_at", "halt_details", "Lcom/robinhood/rosetta/mainst/InternalHaltDetails;", "all_day_tradability", "clearing_broker", "Lrosetta/mainst/ClearingBroker;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/SecurityType;Ljava/lang/String;ZLcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/InstrumentState;Lrosetta/mainst/Tradability;Lrosetta/mainst/Tradability;ZLcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/InternalHaltDetails;Lrosetta/mainst/Tradability;Lrosetta/mainst/ClearingBroker;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getSymbol", "()Ljava/lang/String;", "getCusip", "getMarket", "getList_date", "()Lcom/robinhood/rosetta/mainst/Time;", "getSecurity_type", "()Lrosetta/mainst/SecurityType;", "getCountry", "getMifid_2_dually_listed", "()Z", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getState", "()Lrosetta/mainst/InstrumentState;", "getRhs_tradability", "()Lrosetta/mainst/Tradability;", "getFractional_tradability", "getEh_fractional_tradability", "getCreated_at", "getUpdated_at", "getHalt_details", "()Lcom/robinhood/rosetta/mainst/InternalHaltDetails;", "getAll_day_tradability", "getClearing_broker", "()Lrosetta/mainst/ClearingBroker;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class EquityDetails extends Message {

    @JvmField
    public static final ProtoAdapter<EquityDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "allDayTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final Tradability all_day_tradability;

    @WireField(adapter = "rosetta.mainst.ClearingBroker#ADAPTER", jsonName = "clearingBroker", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final ClearingBroker clearing_broker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String country;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final Time created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String cusip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "ehFractionalTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final boolean eh_fractional_tradability;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "fractionalTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Tradability fractional_tradability;

    @WireField(adapter = "com.robinhood.rosetta.mainst.InternalHaltDetails#ADAPTER", jsonName = "haltDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final InternalHaltDetails halt_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "listDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time list_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String market;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "mifid2DuallyListed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean mifid_2_dually_listed;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minTickSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Decimal min_tick_size;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "rhsTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Tradability rhs_tradability;

    @WireField(adapter = "rosetta.mainst.SecurityType#ADAPTER", jsonName = "securityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final SecurityType security_type;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final InstrumentState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String symbol;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Time updated_at;

    public EquityDetails() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, 524287, null);
    }

    public /* synthetic */ EquityDetails(UUID uuid, String str, String str2, String str3, Time time, SecurityType securityType, String str4, boolean z, Decimal decimal, InstrumentState instrumentState, Tradability tradability, Tradability tradability2, boolean z2, Time time2, Time time3, InternalHaltDetails internalHaltDetails, Tradability tradability3, ClearingBroker clearingBroker, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : time, (i & 32) != 0 ? SecurityType.SECURITY_TYPE_UNSPECIFIED : securityType, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : decimal, (i & 512) != 0 ? InstrumentState.INSTRUMENT_STATE_UNSPECIFIED : instrumentState, (i & 1024) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability, (i & 2048) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability2, (i & 4096) == 0 ? z2 : false, (i & 8192) != 0 ? null : time2, (i & 16384) != 0 ? null : time3, (i & 32768) != 0 ? null : internalHaltDetails, (i & 65536) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability3, (i & 131072) != 0 ? ClearingBroker.CLEARING_BROKER_UNSPECIFIED : clearingBroker, (i & 262144) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24652newBuilder();
    }

    public final UUID getId() {
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

    public final Time getList_date() {
        return this.list_date;
    }

    public final SecurityType getSecurity_type() {
        return this.security_type;
    }

    public final String getCountry() {
        return this.country;
    }

    public final boolean getMifid_2_dually_listed() {
        return this.mifid_2_dually_listed;
    }

    public final Decimal getMin_tick_size() {
        return this.min_tick_size;
    }

    public final InstrumentState getState() {
        return this.state;
    }

    public final Tradability getRhs_tradability() {
        return this.rhs_tradability;
    }

    public final Tradability getFractional_tradability() {
        return this.fractional_tradability;
    }

    public final boolean getEh_fractional_tradability() {
        return this.eh_fractional_tradability;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getUpdated_at() {
        return this.updated_at;
    }

    public final InternalHaltDetails getHalt_details() {
        return this.halt_details;
    }

    public final Tradability getAll_day_tradability() {
        return this.all_day_tradability;
    }

    public final ClearingBroker getClearing_broker() {
        return this.clearing_broker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityDetails(UUID uuid, String symbol, String cusip, String market, Time time, SecurityType security_type, String country, boolean z, Decimal decimal, InstrumentState state, Tradability rhs_tradability, Tradability fractional_tradability, boolean z2, Time time2, Time time3, InternalHaltDetails internalHaltDetails, Tradability all_day_tradability, ClearingBroker clearing_broker, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.symbol = symbol;
        this.cusip = cusip;
        this.market = market;
        this.list_date = time;
        this.security_type = security_type;
        this.country = country;
        this.mifid_2_dually_listed = z;
        this.min_tick_size = decimal;
        this.state = state;
        this.rhs_tradability = rhs_tradability;
        this.fractional_tradability = fractional_tradability;
        this.eh_fractional_tradability = z2;
        this.created_at = time2;
        this.updated_at = time3;
        this.halt_details = internalHaltDetails;
        this.all_day_tradability = all_day_tradability;
        this.clearing_broker = clearing_broker;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24652newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquityDetails)) {
            return false;
        }
        EquityDetails equityDetails = (EquityDetails) other;
        return Intrinsics.areEqual(unknownFields(), equityDetails.unknownFields()) && Intrinsics.areEqual(this.id, equityDetails.id) && Intrinsics.areEqual(this.symbol, equityDetails.symbol) && Intrinsics.areEqual(this.cusip, equityDetails.cusip) && Intrinsics.areEqual(this.market, equityDetails.market) && Intrinsics.areEqual(this.list_date, equityDetails.list_date) && this.security_type == equityDetails.security_type && Intrinsics.areEqual(this.country, equityDetails.country) && this.mifid_2_dually_listed == equityDetails.mifid_2_dually_listed && Intrinsics.areEqual(this.min_tick_size, equityDetails.min_tick_size) && this.state == equityDetails.state && this.rhs_tradability == equityDetails.rhs_tradability && this.fractional_tradability == equityDetails.fractional_tradability && this.eh_fractional_tradability == equityDetails.eh_fractional_tradability && Intrinsics.areEqual(this.created_at, equityDetails.created_at) && Intrinsics.areEqual(this.updated_at, equityDetails.updated_at) && Intrinsics.areEqual(this.halt_details, equityDetails.halt_details) && this.all_day_tradability == equityDetails.all_day_tradability && this.clearing_broker == equityDetails.clearing_broker;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (((((((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + this.symbol.hashCode()) * 37) + this.cusip.hashCode()) * 37) + this.market.hashCode()) * 37;
        Time time = this.list_date;
        int iHashCode3 = (((((((iHashCode2 + (time != null ? time.hashCode() : 0)) * 37) + this.security_type.hashCode()) * 37) + this.country.hashCode()) * 37) + Boolean.hashCode(this.mifid_2_dually_listed)) * 37;
        Decimal decimal = this.min_tick_size;
        int iHashCode4 = (((((((((iHashCode3 + (decimal != null ? decimal.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.rhs_tradability.hashCode()) * 37) + this.fractional_tradability.hashCode()) * 37) + Boolean.hashCode(this.eh_fractional_tradability)) * 37;
        Time time2 = this.created_at;
        int iHashCode5 = (iHashCode4 + (time2 != null ? time2.hashCode() : 0)) * 37;
        Time time3 = this.updated_at;
        int iHashCode6 = (iHashCode5 + (time3 != null ? time3.hashCode() : 0)) * 37;
        InternalHaltDetails internalHaltDetails = this.halt_details;
        int iHashCode7 = ((((iHashCode6 + (internalHaltDetails != null ? internalHaltDetails.hashCode() : 0)) * 37) + this.all_day_tradability.hashCode()) * 37) + this.clearing_broker.hashCode();
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("cusip=" + Internal.sanitize(this.cusip));
        arrayList.add("market=" + Internal.sanitize(this.market));
        Time time = this.list_date;
        if (time != null) {
            arrayList.add("list_date=" + time);
        }
        arrayList.add("security_type=" + this.security_type);
        arrayList.add("country=" + Internal.sanitize(this.country));
        arrayList.add("mifid_2_dually_listed=" + this.mifid_2_dually_listed);
        Decimal decimal = this.min_tick_size;
        if (decimal != null) {
            arrayList.add("min_tick_size=" + decimal);
        }
        arrayList.add("state=" + this.state);
        arrayList.add("rhs_tradability=" + this.rhs_tradability);
        arrayList.add("fractional_tradability=" + this.fractional_tradability);
        arrayList.add("eh_fractional_tradability=" + this.eh_fractional_tradability);
        Time time2 = this.created_at;
        if (time2 != null) {
            arrayList.add("created_at=" + time2);
        }
        Time time3 = this.updated_at;
        if (time3 != null) {
            arrayList.add("updated_at=" + time3);
        }
        InternalHaltDetails internalHaltDetails = this.halt_details;
        if (internalHaltDetails != null) {
            arrayList.add("halt_details=" + internalHaltDetails);
        }
        arrayList.add("all_day_tradability=" + this.all_day_tradability);
        arrayList.add("clearing_broker=" + this.clearing_broker);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityDetails{", "}", 0, null, null, 56, null);
    }

    public final EquityDetails copy(UUID id, String symbol, String cusip, String market, Time list_date, SecurityType security_type, String country, boolean mifid_2_dually_listed, Decimal min_tick_size, InstrumentState state, Tradability rhs_tradability, Tradability fractional_tradability, boolean eh_fractional_tradability, Time created_at, Time updated_at, InternalHaltDetails halt_details, Tradability all_day_tradability, ClearingBroker clearing_broker, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquityDetails(id, symbol, cusip, market, list_date, security_type, country, mifid_2_dually_listed, min_tick_size, state, rhs_tradability, fractional_tradability, eh_fractional_tradability, created_at, updated_at, halt_details, all_day_tradability, clearing_broker, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquityDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.EquityDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquityDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getCusip(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCusip());
                }
                if (!Intrinsics.areEqual(value.getMarket(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMarket());
                }
                if (value.getList_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(5, value.getList_date());
                }
                if (value.getSecurity_type() != SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    size += SecurityType.ADAPTER.encodedSizeWithTag(6, value.getSecurity_type());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCountry());
                }
                if (value.getMifid_2_dually_listed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getMifid_2_dually_listed()));
                }
                if (value.getMin_tick_size() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(9, value.getMin_tick_size());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    size += InstrumentState.ADAPTER.encodedSizeWithTag(10, value.getState());
                }
                Tradability rhs_tradability = value.getRhs_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (rhs_tradability != tradability) {
                    size += Tradability.ADAPTER.encodedSizeWithTag(11, value.getRhs_tradability());
                }
                if (value.getFractional_tradability() != tradability) {
                    size += Tradability.ADAPTER.encodedSizeWithTag(12, value.getFractional_tradability());
                }
                if (value.getEh_fractional_tradability()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getEh_fractional_tradability()));
                }
                if (value.getCreated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(14, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(15, value.getUpdated_at());
                }
                if (value.getHalt_details() != null) {
                    size += InternalHaltDetails.ADAPTER.encodedSizeWithTag(16, value.getHalt_details());
                }
                if (value.getAll_day_tradability() != tradability) {
                    size += Tradability.ADAPTER.encodedSizeWithTag(17, value.getAll_day_tradability());
                }
                return value.getClearing_broker() != ClearingBroker.CLEARING_BROKER_UNSPECIFIED ? size + ClearingBroker.ADAPTER.encodedSizeWithTag(18, value.getClearing_broker()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquityDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getCusip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCusip());
                }
                if (!Intrinsics.areEqual(value.getMarket(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMarket());
                }
                if (value.getList_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getList_date());
                }
                if (value.getSecurity_type() != SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    SecurityType.ADAPTER.encodeWithTag(writer, 6, (int) value.getSecurity_type());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCountry());
                }
                if (value.getMifid_2_dually_listed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getMifid_2_dually_listed()));
                }
                if (value.getMin_tick_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getMin_tick_size());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 10, (int) value.getState());
                }
                Tradability rhs_tradability = value.getRhs_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (rhs_tradability != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 11, (int) value.getRhs_tradability());
                }
                if (value.getFractional_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 12, (int) value.getFractional_tradability());
                }
                if (value.getEh_fractional_tradability()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getEh_fractional_tradability()));
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 14, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                if (value.getHalt_details() != null) {
                    InternalHaltDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getHalt_details());
                }
                if (value.getAll_day_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 17, (int) value.getAll_day_tradability());
                }
                if (value.getClearing_broker() != ClearingBroker.CLEARING_BROKER_UNSPECIFIED) {
                    ClearingBroker.ADAPTER.encodeWithTag(writer, 18, (int) value.getClearing_broker());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquityDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getClearing_broker() != ClearingBroker.CLEARING_BROKER_UNSPECIFIED) {
                    ClearingBroker.ADAPTER.encodeWithTag(writer, 18, (int) value.getClearing_broker());
                }
                Tradability all_day_tradability = value.getAll_day_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (all_day_tradability != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 17, (int) value.getAll_day_tradability());
                }
                if (value.getHalt_details() != null) {
                    InternalHaltDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getHalt_details());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 14, (int) value.getCreated_at());
                }
                if (value.getEh_fractional_tradability()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getEh_fractional_tradability()));
                }
                if (value.getFractional_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 12, (int) value.getFractional_tradability());
                }
                if (value.getRhs_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 11, (int) value.getRhs_tradability());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 10, (int) value.getState());
                }
                if (value.getMin_tick_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getMin_tick_size());
                }
                if (value.getMifid_2_dually_listed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getMifid_2_dually_listed()));
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCountry());
                }
                if (value.getSecurity_type() != SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    SecurityType.ADAPTER.encodeWithTag(writer, 6, (int) value.getSecurity_type());
                }
                if (value.getList_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getList_date());
                }
                if (!Intrinsics.areEqual(value.getMarket(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMarket());
                }
                if (!Intrinsics.areEqual(value.getCusip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCusip());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquityDetails decode(ProtoReader reader) throws IOException {
                InstrumentState instrumentState;
                Tradability tradability;
                Tradability tradability2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                SecurityType securityType = SecurityType.SECURITY_TYPE_UNSPECIFIED;
                InstrumentState instrumentState2 = InstrumentState.INSTRUMENT_STATE_UNSPECIFIED;
                Tradability tradability3 = Tradability.TRADABILITY_UNSPECIFIED;
                ClearingBroker clearingBroker = ClearingBroker.CLEARING_BROKER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                SecurityType securityTypeDecode = securityType;
                UUID uuidDecode = null;
                Time timeDecode = null;
                Decimal decimalDecode = null;
                Time timeDecode2 = null;
                Time timeDecode3 = null;
                InternalHaltDetails internalHaltDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                Tradability tradabilityDecode = tradability3;
                Tradability tradabilityDecode2 = tradabilityDecode;
                ClearingBroker clearingBrokerDecode = clearingBroker;
                InstrumentState instrumentStateDecode = instrumentState2;
                Tradability tradabilityDecode3 = tradabilityDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 6:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode;
                                tradability2 = tradabilityDecode2;
                                try {
                                    securityTypeDecode = SecurityType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                instrumentStateDecode = instrumentState;
                                tradabilityDecode = tradability;
                                tradabilityDecode2 = tradability2;
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                break;
                            case 10:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode;
                                tradability2 = tradabilityDecode2;
                                try {
                                    instrumentStateDecode = InstrumentState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                tradabilityDecode = tradability;
                                tradabilityDecode2 = tradability2;
                                break;
                            case 11:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode;
                                tradability2 = tradabilityDecode2;
                                try {
                                    tradabilityDecode3 = Tradability.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                instrumentStateDecode = instrumentState;
                                tradabilityDecode = tradability;
                                tradabilityDecode2 = tradability2;
                                break;
                            case 12:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode;
                                tradability2 = tradabilityDecode2;
                                try {
                                    tradabilityDecode = Tradability.ADAPTER.decode(reader);
                                    instrumentStateDecode = instrumentState;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                                tradabilityDecode2 = tradability2;
                                break;
                            case 13:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 14:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                break;
                            case 15:
                                timeDecode3 = Time.ADAPTER.decode(reader);
                                break;
                            case 16:
                                internalHaltDetailsDecode = InternalHaltDetails.ADAPTER.decode(reader);
                                break;
                            case 17:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode;
                                tradability2 = tradabilityDecode2;
                                try {
                                    tradabilityDecode2 = Tradability.ADAPTER.decode(reader);
                                    instrumentStateDecode = instrumentState;
                                    tradabilityDecode = tradability;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 18:
                                try {
                                    clearingBrokerDecode = ClearingBroker.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    instrumentState = instrumentStateDecode;
                                    tradability = tradabilityDecode;
                                    tradability2 = tradabilityDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode;
                                tradability2 = tradabilityDecode2;
                                instrumentStateDecode = instrumentState;
                                tradabilityDecode = tradability;
                                tradabilityDecode2 = tradability2;
                                break;
                        }
                    } else {
                        return new EquityDetails(uuidDecode, strDecode, strDecode2, strDecode3, timeDecode, securityTypeDecode, strDecode4, zBooleanValue, decimalDecode, instrumentStateDecode, tradabilityDecode3, tradabilityDecode, zBooleanValue2, timeDecode2, timeDecode3, internalHaltDetailsDecode, tradabilityDecode2, clearingBrokerDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquityDetails redact(EquityDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                Time list_date = value.getList_date();
                Time timeRedact = list_date != null ? Time.ADAPTER.redact(list_date) : null;
                Decimal min_tick_size = value.getMin_tick_size();
                Decimal decimalRedact = min_tick_size != null ? Decimal.ADAPTER.redact(min_tick_size) : null;
                Time created_at = value.getCreated_at();
                Time timeRedact2 = created_at != null ? Time.ADAPTER.redact(created_at) : null;
                Time updated_at = value.getUpdated_at();
                Time timeRedact3 = updated_at != null ? Time.ADAPTER.redact(updated_at) : null;
                InternalHaltDetails halt_details = value.getHalt_details();
                return value.copy((204526 & 1) != 0 ? value.id : uuidRedact, (204526 & 2) != 0 ? value.symbol : null, (204526 & 4) != 0 ? value.cusip : null, (204526 & 8) != 0 ? value.market : null, (204526 & 16) != 0 ? value.list_date : timeRedact, (204526 & 32) != 0 ? value.security_type : null, (204526 & 64) != 0 ? value.country : null, (204526 & 128) != 0 ? value.mifid_2_dually_listed : false, (204526 & 256) != 0 ? value.min_tick_size : decimalRedact, (204526 & 512) != 0 ? value.state : null, (204526 & 1024) != 0 ? value.rhs_tradability : null, (204526 & 2048) != 0 ? value.fractional_tradability : null, (204526 & 4096) != 0 ? value.eh_fractional_tradability : false, (204526 & 8192) != 0 ? value.created_at : timeRedact2, (204526 & 16384) != 0 ? value.updated_at : timeRedact3, (204526 & 32768) != 0 ? value.halt_details : halt_details != null ? InternalHaltDetails.ADAPTER.redact(halt_details) : null, (204526 & 65536) != 0 ? value.all_day_tradability : null, (204526 & 131072) != 0 ? value.clearing_broker : null, (204526 & 262144) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
