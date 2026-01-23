package com.robinhood.rosetta.mainst;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.Tradability;

/* compiled from: OptionChainDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010*\u001a\u00020\u0002H\u0017J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\tH\u0016J\u0084\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionChainDetails;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "chain_id", "state", "Lrosetta/mainst/InstrumentState;", "symbol", "", "trade_value_multiplier", "Lcom/robinhood/rosetta/mainst/Decimal;", "underlying_instruments", "", "Lcom/robinhood/rosetta/mainst/UnderlyingInstrument;", "created_at", "Lcom/robinhood/rosetta/mainst/Time;", "updated_at", "tradability_for_late_closing_etfs", "Lrosetta/mainst/Tradability;", "extended_hours_tradability", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/InstrumentState;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Decimal;Ljava/util/List;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/Tradability;Lrosetta/mainst/Tradability;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getChain_id", "getState", "()Lrosetta/mainst/InstrumentState;", "getSymbol", "()Ljava/lang/String;", "getTrade_value_multiplier", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getUpdated_at", "getTradability_for_late_closing_etfs", "()Lrosetta/mainst/Tradability;", "getExtended_hours_tradability", "getUnderlying_instruments", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OptionChainDetails extends Message {

    @JvmField
    public static final ProtoAdapter<OptionChainDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "chainId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UUID chain_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Time created_at;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "extendedHoursTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Tradability extended_hours_tradability;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final InstrumentState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "tradabilityForLateClosingEtfs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Tradability tradability_for_late_closing_etfs;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "tradeValueMultiplier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Decimal trade_value_multiplier;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UnderlyingInstrument#ADAPTER", jsonName = "underlyingInstruments", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<UnderlyingInstrument> underlying_instruments;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Time updated_at;

    public OptionChainDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24679newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getChain_id() {
        return this.chain_id;
    }

    public final InstrumentState getState() {
        return this.state;
    }

    public /* synthetic */ OptionChainDetails(UUID uuid, UUID uuid2, InstrumentState instrumentState, String str, Decimal decimal, List list, Time time, Time time2, Tradability tradability, Tradability tradability2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uuid2, (i & 4) != 0 ? InstrumentState.INSTRUMENT_STATE_UNSPECIFIED : instrumentState, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : decimal, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : time, (i & 128) != 0 ? null : time2, (i & 256) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability, (i & 512) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Decimal getTrade_value_multiplier() {
        return this.trade_value_multiplier;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getUpdated_at() {
        return this.updated_at;
    }

    public final Tradability getTradability_for_late_closing_etfs() {
        return this.tradability_for_late_closing_etfs;
    }

    public final Tradability getExtended_hours_tradability() {
        return this.extended_hours_tradability;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainDetails(UUID uuid, UUID uuid2, InstrumentState state, String symbol, Decimal decimal, List<UnderlyingInstrument> underlying_instruments, Time time, Time time2, Tradability tradability_for_late_closing_etfs, Tradability extended_hours_tradability, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(underlying_instruments, "underlying_instruments");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
        Intrinsics.checkNotNullParameter(extended_hours_tradability, "extended_hours_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.chain_id = uuid2;
        this.state = state;
        this.symbol = symbol;
        this.trade_value_multiplier = decimal;
        this.created_at = time;
        this.updated_at = time2;
        this.tradability_for_late_closing_etfs = tradability_for_late_closing_etfs;
        this.extended_hours_tradability = extended_hours_tradability;
        this.underlying_instruments = Internal.immutableCopyOf("underlying_instruments", underlying_instruments);
    }

    public final List<UnderlyingInstrument> getUnderlying_instruments() {
        return this.underlying_instruments;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24679newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionChainDetails)) {
            return false;
        }
        OptionChainDetails optionChainDetails = (OptionChainDetails) other;
        return Intrinsics.areEqual(unknownFields(), optionChainDetails.unknownFields()) && Intrinsics.areEqual(this.id, optionChainDetails.id) && Intrinsics.areEqual(this.chain_id, optionChainDetails.chain_id) && this.state == optionChainDetails.state && Intrinsics.areEqual(this.symbol, optionChainDetails.symbol) && Intrinsics.areEqual(this.trade_value_multiplier, optionChainDetails.trade_value_multiplier) && Intrinsics.areEqual(this.underlying_instruments, optionChainDetails.underlying_instruments) && Intrinsics.areEqual(this.created_at, optionChainDetails.created_at) && Intrinsics.areEqual(this.updated_at, optionChainDetails.updated_at) && this.tradability_for_late_closing_etfs == optionChainDetails.tradability_for_late_closing_etfs && this.extended_hours_tradability == optionChainDetails.extended_hours_tradability;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.chain_id;
        int iHashCode3 = (((((iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.symbol.hashCode()) * 37;
        Decimal decimal = this.trade_value_multiplier;
        int iHashCode4 = (((iHashCode3 + (decimal != null ? decimal.hashCode() : 0)) * 37) + this.underlying_instruments.hashCode()) * 37;
        Time time = this.created_at;
        int iHashCode5 = (iHashCode4 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.updated_at;
        int iHashCode6 = ((((iHashCode5 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.tradability_for_late_closing_etfs.hashCode()) * 37) + this.extended_hours_tradability.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        UUID uuid2 = this.chain_id;
        if (uuid2 != null) {
            arrayList.add("chain_id=" + uuid2);
        }
        arrayList.add("state=" + this.state);
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        Decimal decimal = this.trade_value_multiplier;
        if (decimal != null) {
            arrayList.add("trade_value_multiplier=" + decimal);
        }
        if (!this.underlying_instruments.isEmpty()) {
            arrayList.add("underlying_instruments=" + this.underlying_instruments);
        }
        Time time = this.created_at;
        if (time != null) {
            arrayList.add("created_at=" + time);
        }
        Time time2 = this.updated_at;
        if (time2 != null) {
            arrayList.add("updated_at=" + time2);
        }
        arrayList.add("tradability_for_late_closing_etfs=" + this.tradability_for_late_closing_etfs);
        arrayList.add("extended_hours_tradability=" + this.extended_hours_tradability);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionChainDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionChainDetails copy$default(OptionChainDetails optionChainDetails, UUID uuid, UUID uuid2, InstrumentState instrumentState, String str, Decimal decimal, List list, Time time, Time time2, Tradability tradability, Tradability tradability2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = optionChainDetails.id;
        }
        if ((i & 2) != 0) {
            uuid2 = optionChainDetails.chain_id;
        }
        if ((i & 4) != 0) {
            instrumentState = optionChainDetails.state;
        }
        if ((i & 8) != 0) {
            str = optionChainDetails.symbol;
        }
        if ((i & 16) != 0) {
            decimal = optionChainDetails.trade_value_multiplier;
        }
        if ((i & 32) != 0) {
            list = optionChainDetails.underlying_instruments;
        }
        if ((i & 64) != 0) {
            time = optionChainDetails.created_at;
        }
        if ((i & 128) != 0) {
            time2 = optionChainDetails.updated_at;
        }
        if ((i & 256) != 0) {
            tradability = optionChainDetails.tradability_for_late_closing_etfs;
        }
        if ((i & 512) != 0) {
            tradability2 = optionChainDetails.extended_hours_tradability;
        }
        if ((i & 1024) != 0) {
            byteString = optionChainDetails.unknownFields();
        }
        Tradability tradability3 = tradability2;
        ByteString byteString2 = byteString;
        Time time3 = time2;
        Tradability tradability4 = tradability;
        List list2 = list;
        Time time4 = time;
        Decimal decimal2 = decimal;
        InstrumentState instrumentState2 = instrumentState;
        return optionChainDetails.copy(uuid, uuid2, instrumentState2, str, decimal2, list2, time4, time3, tradability4, tradability3, byteString2);
    }

    public final OptionChainDetails copy(UUID id, UUID chain_id, InstrumentState state, String symbol, Decimal trade_value_multiplier, List<UnderlyingInstrument> underlying_instruments, Time created_at, Time updated_at, Tradability tradability_for_late_closing_etfs, Tradability extended_hours_tradability, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(underlying_instruments, "underlying_instruments");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
        Intrinsics.checkNotNullParameter(extended_hours_tradability, "extended_hours_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionChainDetails(id, chain_id, state, symbol, trade_value_multiplier, underlying_instruments, created_at, updated_at, tradability_for_late_closing_etfs, extended_hours_tradability, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionChainDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionChainDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OptionChainDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionChainDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getChain_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(2, value.getChain_id());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    size += InstrumentState.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol());
                }
                if (value.getTrade_value_multiplier() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(5, value.getTrade_value_multiplier());
                }
                int iEncodedSizeWithTag = size + UnderlyingInstrument.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getUnderlying_instruments());
                if (value.getCreated_at() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(7, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(8, value.getUpdated_at());
                }
                Tradability tradability_for_late_closing_etfs = value.getTradability_for_late_closing_etfs();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (tradability_for_late_closing_etfs != tradability) {
                    iEncodedSizeWithTag += Tradability.ADAPTER.encodedSizeWithTag(9, value.getTradability_for_late_closing_etfs());
                }
                return value.getExtended_hours_tradability() != tradability ? iEncodedSizeWithTag + Tradability.ADAPTER.encodedSizeWithTag(10, value.getExtended_hours_tradability()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionChainDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getChain_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getChain_id());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (value.getTrade_value_multiplier() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrade_value_multiplier());
                }
                UnderlyingInstrument.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getUnderlying_instruments());
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 8, (int) value.getUpdated_at());
                }
                Tradability tradability_for_late_closing_etfs = value.getTradability_for_late_closing_etfs();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (tradability_for_late_closing_etfs != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 9, (int) value.getTradability_for_late_closing_etfs());
                }
                if (value.getExtended_hours_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getExtended_hours_tradability());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionChainDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Tradability extended_hours_tradability = value.getExtended_hours_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (extended_hours_tradability != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 10, (int) value.getExtended_hours_tradability());
                }
                if (value.getTradability_for_late_closing_etfs() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 9, (int) value.getTradability_for_late_closing_etfs());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 8, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getCreated_at());
                }
                UnderlyingInstrument.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getUnderlying_instruments());
                if (value.getTrade_value_multiplier() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrade_value_multiplier());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getChain_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getChain_id());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionChainDetails decode(ProtoReader reader) throws IOException {
                Tradability tradability;
                Tradability tradability2;
                UUID uuid;
                UUID uuid2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentState instrumentState = InstrumentState.INSTRUMENT_STATE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                Tradability tradability3 = Tradability.TRADABILITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                UUID uuidDecode = null;
                UUID uuidDecode2 = null;
                Decimal decimalDecode = null;
                Time timeDecode = null;
                Time timeDecode2 = null;
                String strDecode = "";
                Tradability tradabilityDecode = tradability3;
                Tradability tradabilityDecode2 = tradabilityDecode;
                InstrumentState instrumentStateDecode = instrumentState;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                break;
                            case 2:
                                tradability = tradabilityDecode2;
                                uuidDecode2 = UUID.ADAPTER.decode(reader);
                                tradabilityDecode2 = tradability;
                                break;
                            case 3:
                                tradability2 = tradabilityDecode;
                                tradability = tradabilityDecode2;
                                uuid = uuidDecode;
                                uuid2 = uuidDecode2;
                                try {
                                    instrumentStateDecode = InstrumentState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                uuidDecode = uuid;
                                uuidDecode2 = uuid2;
                                tradabilityDecode = tradability2;
                                tradabilityDecode2 = tradability;
                                break;
                            case 4:
                                tradability = tradabilityDecode2;
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                tradabilityDecode2 = tradability;
                                break;
                            case 5:
                                tradability = tradabilityDecode2;
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                tradabilityDecode2 = tradability;
                                break;
                            case 6:
                                tradability2 = tradabilityDecode;
                                tradability = tradabilityDecode2;
                                uuid = uuidDecode;
                                uuid2 = uuidDecode2;
                                arrayList.add(UnderlyingInstrument.ADAPTER.decode(reader));
                                uuidDecode = uuid;
                                uuidDecode2 = uuid2;
                                tradabilityDecode = tradability2;
                                tradabilityDecode2 = tradability;
                                break;
                            case 7:
                                tradability = tradabilityDecode2;
                                timeDecode = Time.ADAPTER.decode(reader);
                                tradabilityDecode2 = tradability;
                                break;
                            case 8:
                                tradability = tradabilityDecode2;
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                tradabilityDecode2 = tradability;
                                break;
                            case 9:
                                tradability2 = tradabilityDecode;
                                tradability = tradabilityDecode2;
                                try {
                                    tradabilityDecode = Tradability.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    uuid = uuidDecode;
                                    uuid2 = uuidDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                tradabilityDecode2 = tradability;
                                break;
                            case 10:
                                try {
                                    tradabilityDecode2 = Tradability.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    tradability2 = tradabilityDecode;
                                    tradability = tradabilityDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                tradability2 = tradabilityDecode;
                                tradability = tradabilityDecode2;
                                uuid = uuidDecode;
                                uuid2 = uuidDecode2;
                                uuidDecode = uuid;
                                uuidDecode2 = uuid2;
                                tradabilityDecode = tradability2;
                                tradabilityDecode2 = tradability;
                                break;
                        }
                    } else {
                        return new OptionChainDetails(uuidDecode, uuidDecode2, instrumentStateDecode, strDecode, decimalDecode, arrayList, timeDecode, timeDecode2, tradabilityDecode, tradabilityDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionChainDetails redact(OptionChainDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                UUID chain_id = value.getChain_id();
                UUID uuidRedact2 = chain_id != null ? UUID.ADAPTER.redact(chain_id) : null;
                Decimal trade_value_multiplier = value.getTrade_value_multiplier();
                Decimal decimalRedact = trade_value_multiplier != null ? Decimal.ADAPTER.redact(trade_value_multiplier) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getUnderlying_instruments(), UnderlyingInstrument.ADAPTER);
                Time created_at = value.getCreated_at();
                Time timeRedact = created_at != null ? Time.ADAPTER.redact(created_at) : null;
                Time updated_at = value.getUpdated_at();
                return OptionChainDetails.copy$default(value, uuidRedact, uuidRedact2, null, null, decimalRedact, listM26823redactElements, timeRedact, updated_at != null ? Time.ADAPTER.redact(updated_at) : null, null, null, ByteString.EMPTY, 780, null);
            }
        };
    }
}
