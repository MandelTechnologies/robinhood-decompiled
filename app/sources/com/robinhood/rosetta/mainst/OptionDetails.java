package com.robinhood.rosetta.mainst;

import com.robinhood.android.common.util.TransitionReason;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
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
import rosetta.mainst.InstrumentState;
import rosetta.mainst.PutCallCode;
import rosetta.mainst.Tradability;

/* compiled from: OptionDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000207H\u0016J¢\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionDetails;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "chain_pk", "put_call_code", "Lrosetta/mainst/PutCallCode;", "original_expiration_date", "Lcom/robinhood/rosetta/mainst/Time;", GovernmentIdNfcScan.expirationDateName, "state", "Lrosetta/mainst/InstrumentState;", "strike_price", "Lcom/robinhood/rosetta/mainst/Decimal;", "rhs_tradability", "Lrosetta/mainst/Tradability;", "uk_tradability", "sg_tradability", "created_at", "updated_at", TransitionReason.OPTION_TRADE_CHAIN, "Lcom/robinhood/rosetta/mainst/OptionChainDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/PutCallCode;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/InstrumentState;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Tradability;Lrosetta/mainst/Tradability;Lrosetta/mainst/Tradability;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/OptionChainDetails;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getChain_pk", "getPut_call_code", "()Lrosetta/mainst/PutCallCode;", "getOriginal_expiration_date", "()Lcom/robinhood/rosetta/mainst/Time;", "getExpiration_date", "getState", "()Lrosetta/mainst/InstrumentState;", "getStrike_price", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getRhs_tradability", "()Lrosetta/mainst/Tradability;", "getUk_tradability", "getSg_tradability", "getCreated_at", "getUpdated_at", "getChain", "()Lcom/robinhood/rosetta/mainst/OptionChainDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OptionDetails extends Message {

    @JvmField
    public static final ProtoAdapter<OptionDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OptionChainDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 11)
    private final OptionChainDetails chain;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "chainPk", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UUID chain_pk;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 9)
    private final Time created_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "expirationDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time expiration_date;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "originalExpirationDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time original_expiration_date;

    @WireField(adapter = "rosetta.mainst.PutCallCode#ADAPTER", jsonName = "putCallCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PutCallCode put_call_code;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "rhsTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Tradability rhs_tradability;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "sgTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 14)
    private final Tradability sg_tradability;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InstrumentState state;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "strikePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Decimal strike_price;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "ukTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 13)
    private final Tradability uk_tradability;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 10)
    private final Time updated_at;

    public OptionDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24681newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getChain_pk() {
        return this.chain_pk;
    }

    public final PutCallCode getPut_call_code() {
        return this.put_call_code;
    }

    public /* synthetic */ OptionDetails(UUID uuid, UUID uuid2, PutCallCode putCallCode, Time time, Time time2, InstrumentState instrumentState, Decimal decimal, Tradability tradability, Tradability tradability2, Tradability tradability3, Time time3, Time time4, OptionChainDetails optionChainDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uuid2, (i & 4) != 0 ? PutCallCode.PUT_CALL_CODE_UNSPECIFIED : putCallCode, (i & 8) != 0 ? null : time, (i & 16) != 0 ? null : time2, (i & 32) != 0 ? InstrumentState.INSTRUMENT_STATE_UNSPECIFIED : instrumentState, (i & 64) != 0 ? null : decimal, (i & 128) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability, (i & 256) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability2, (i & 512) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability3, (i & 1024) != 0 ? null : time3, (i & 2048) != 0 ? null : time4, (i & 4096) == 0 ? optionChainDetails : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Time getOriginal_expiration_date() {
        return this.original_expiration_date;
    }

    public final Time getExpiration_date() {
        return this.expiration_date;
    }

    public final InstrumentState getState() {
        return this.state;
    }

    public final Decimal getStrike_price() {
        return this.strike_price;
    }

    public final Tradability getRhs_tradability() {
        return this.rhs_tradability;
    }

    public final Tradability getUk_tradability() {
        return this.uk_tradability;
    }

    public final Tradability getSg_tradability() {
        return this.sg_tradability;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getUpdated_at() {
        return this.updated_at;
    }

    public final OptionChainDetails getChain() {
        return this.chain;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionDetails(UUID uuid, UUID uuid2, PutCallCode put_call_code, Time time, Time time2, InstrumentState state, Decimal decimal, Tradability rhs_tradability, Tradability uk_tradability, Tradability sg_tradability, Time time3, Time time4, OptionChainDetails optionChainDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(uk_tradability, "uk_tradability");
        Intrinsics.checkNotNullParameter(sg_tradability, "sg_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.chain_pk = uuid2;
        this.put_call_code = put_call_code;
        this.original_expiration_date = time;
        this.expiration_date = time2;
        this.state = state;
        this.strike_price = decimal;
        this.rhs_tradability = rhs_tradability;
        this.uk_tradability = uk_tradability;
        this.sg_tradability = sg_tradability;
        this.created_at = time3;
        this.updated_at = time4;
        this.chain = optionChainDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24681newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionDetails)) {
            return false;
        }
        OptionDetails optionDetails = (OptionDetails) other;
        return Intrinsics.areEqual(unknownFields(), optionDetails.unknownFields()) && Intrinsics.areEqual(this.id, optionDetails.id) && Intrinsics.areEqual(this.chain_pk, optionDetails.chain_pk) && this.put_call_code == optionDetails.put_call_code && Intrinsics.areEqual(this.original_expiration_date, optionDetails.original_expiration_date) && Intrinsics.areEqual(this.expiration_date, optionDetails.expiration_date) && this.state == optionDetails.state && Intrinsics.areEqual(this.strike_price, optionDetails.strike_price) && this.rhs_tradability == optionDetails.rhs_tradability && this.uk_tradability == optionDetails.uk_tradability && this.sg_tradability == optionDetails.sg_tradability && Intrinsics.areEqual(this.created_at, optionDetails.created_at) && Intrinsics.areEqual(this.updated_at, optionDetails.updated_at) && Intrinsics.areEqual(this.chain, optionDetails.chain);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.chain_pk;
        int iHashCode3 = (((iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.put_call_code.hashCode()) * 37;
        Time time = this.original_expiration_date;
        int iHashCode4 = (iHashCode3 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.expiration_date;
        int iHashCode5 = (((iHashCode4 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.state.hashCode()) * 37;
        Decimal decimal = this.strike_price;
        int iHashCode6 = (((((((iHashCode5 + (decimal != null ? decimal.hashCode() : 0)) * 37) + this.rhs_tradability.hashCode()) * 37) + this.uk_tradability.hashCode()) * 37) + this.sg_tradability.hashCode()) * 37;
        Time time3 = this.created_at;
        int iHashCode7 = (iHashCode6 + (time3 != null ? time3.hashCode() : 0)) * 37;
        Time time4 = this.updated_at;
        int iHashCode8 = (iHashCode7 + (time4 != null ? time4.hashCode() : 0)) * 37;
        OptionChainDetails optionChainDetails = this.chain;
        int iHashCode9 = iHashCode8 + (optionChainDetails != null ? optionChainDetails.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        UUID uuid2 = this.chain_pk;
        if (uuid2 != null) {
            arrayList.add("chain_pk=" + uuid2);
        }
        arrayList.add("put_call_code=" + this.put_call_code);
        Time time = this.original_expiration_date;
        if (time != null) {
            arrayList.add("original_expiration_date=" + time);
        }
        Time time2 = this.expiration_date;
        if (time2 != null) {
            arrayList.add("expiration_date=" + time2);
        }
        arrayList.add("state=" + this.state);
        Decimal decimal = this.strike_price;
        if (decimal != null) {
            arrayList.add("strike_price=" + decimal);
        }
        arrayList.add("rhs_tradability=" + this.rhs_tradability);
        arrayList.add("uk_tradability=" + this.uk_tradability);
        arrayList.add("sg_tradability=" + this.sg_tradability);
        Time time3 = this.created_at;
        if (time3 != null) {
            arrayList.add("created_at=" + time3);
        }
        Time time4 = this.updated_at;
        if (time4 != null) {
            arrayList.add("updated_at=" + time4);
        }
        OptionChainDetails optionChainDetails = this.chain;
        if (optionChainDetails != null) {
            arrayList.add("chain=" + optionChainDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionDetails{", "}", 0, null, null, 56, null);
    }

    public final OptionDetails copy(UUID id, UUID chain_pk, PutCallCode put_call_code, Time original_expiration_date, Time expiration_date, InstrumentState state, Decimal strike_price, Tradability rhs_tradability, Tradability uk_tradability, Tradability sg_tradability, Time created_at, Time updated_at, OptionChainDetails chain, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(uk_tradability, "uk_tradability");
        Intrinsics.checkNotNullParameter(sg_tradability, "sg_tradability");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionDetails(id, chain_pk, put_call_code, original_expiration_date, expiration_date, state, strike_price, rhs_tradability, uk_tradability, sg_tradability, created_at, updated_at, chain, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OptionDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getChain_pk() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(2, value.getChain_pk());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    size += PutCallCode.ADAPTER.encodedSizeWithTag(3, value.getPut_call_code());
                }
                if (value.getOriginal_expiration_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(4, value.getOriginal_expiration_date());
                }
                if (value.getExpiration_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(5, value.getExpiration_date());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    size += InstrumentState.ADAPTER.encodedSizeWithTag(6, value.getState());
                }
                if (value.getStrike_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(7, value.getStrike_price());
                }
                Tradability rhs_tradability = value.getRhs_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (rhs_tradability != tradability) {
                    size += Tradability.ADAPTER.encodedSizeWithTag(8, value.getRhs_tradability());
                }
                if (value.getUk_tradability() != tradability) {
                    size += Tradability.ADAPTER.encodedSizeWithTag(13, value.getUk_tradability());
                }
                if (value.getSg_tradability() != tradability) {
                    size += Tradability.ADAPTER.encodedSizeWithTag(14, value.getSg_tradability());
                }
                if (value.getCreated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(9, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(10, value.getUpdated_at());
                }
                return value.getChain() != null ? size + OptionChainDetails.ADAPTER.encodedSizeWithTag(11, value.getChain()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getChain_pk() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getChain_pk());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 3, (int) value.getPut_call_code());
                }
                if (value.getOriginal_expiration_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getOriginal_expiration_date());
                }
                if (value.getExpiration_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getExpiration_date());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 6, (int) value.getState());
                }
                if (value.getStrike_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getStrike_price());
                }
                Tradability rhs_tradability = value.getRhs_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (rhs_tradability != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 8, (int) value.getRhs_tradability());
                }
                if (value.getUk_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 13, (int) value.getUk_tradability());
                }
                if (value.getSg_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 14, (int) value.getSg_tradability());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                if (value.getChain() != null) {
                    OptionChainDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getChain());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getChain() != null) {
                    OptionChainDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getChain());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                Tradability sg_tradability = value.getSg_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (sg_tradability != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 14, (int) value.getSg_tradability());
                }
                if (value.getUk_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 13, (int) value.getUk_tradability());
                }
                if (value.getRhs_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 8, (int) value.getRhs_tradability());
                }
                if (value.getStrike_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getStrike_price());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 6, (int) value.getState());
                }
                if (value.getExpiration_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getExpiration_date());
                }
                if (value.getOriginal_expiration_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getOriginal_expiration_date());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 3, (int) value.getPut_call_code());
                }
                if (value.getChain_pk() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getChain_pk());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionDetails decode(ProtoReader reader) throws IOException {
                InstrumentState instrumentState;
                Tradability tradability;
                Tradability tradability2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                PutCallCode putCallCode = PutCallCode.PUT_CALL_CODE_UNSPECIFIED;
                InstrumentState instrumentState2 = InstrumentState.INSTRUMENT_STATE_UNSPECIFIED;
                Tradability tradability3 = Tradability.TRADABILITY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PutCallCode putCallCodeDecode = putCallCode;
                Tradability tradabilityDecode = tradability3;
                Tradability tradabilityDecode2 = tradabilityDecode;
                UUID uuidDecode = null;
                UUID uuidDecode2 = null;
                Time timeDecode = null;
                Time timeDecode2 = null;
                Decimal decimalDecode = null;
                Time timeDecode3 = null;
                Time timeDecode4 = null;
                OptionChainDetails optionChainDetailsDecode = null;
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
                                uuidDecode2 = UUID.ADAPTER.decode(reader);
                                break;
                            case 3:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode3;
                                tradability2 = tradabilityDecode;
                                try {
                                    putCallCodeDecode = PutCallCode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                instrumentStateDecode = instrumentState;
                                tradabilityDecode3 = tradability;
                                tradabilityDecode = tradability2;
                                break;
                            case 4:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 5:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                break;
                            case 6:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode3;
                                tradability2 = tradabilityDecode;
                                try {
                                    instrumentStateDecode = InstrumentState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                tradabilityDecode3 = tradability;
                                tradabilityDecode = tradability2;
                                break;
                            case 7:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                break;
                            case 8:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode3;
                                tradability2 = tradabilityDecode;
                                try {
                                    tradabilityDecode3 = Tradability.ADAPTER.decode(reader);
                                    instrumentStateDecode = instrumentState;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                tradabilityDecode = tradability2;
                                break;
                            case 9:
                                timeDecode3 = Time.ADAPTER.decode(reader);
                                break;
                            case 10:
                                timeDecode4 = Time.ADAPTER.decode(reader);
                                break;
                            case 11:
                                optionChainDetailsDecode = OptionChainDetails.ADAPTER.decode(reader);
                                break;
                            case 12:
                            default:
                                reader.readUnknownField(iNextTag);
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode3;
                                tradability2 = tradabilityDecode;
                                instrumentStateDecode = instrumentState;
                                tradabilityDecode3 = tradability;
                                tradabilityDecode = tradability2;
                                break;
                            case 13:
                                instrumentState = instrumentStateDecode;
                                tradability = tradabilityDecode3;
                                tradability2 = tradabilityDecode;
                                try {
                                    tradabilityDecode = Tradability.ADAPTER.decode(reader);
                                    instrumentStateDecode = instrumentState;
                                    tradabilityDecode3 = tradability;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 14:
                                try {
                                    tradabilityDecode2 = Tradability.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    instrumentState = instrumentStateDecode;
                                    tradability = tradabilityDecode3;
                                    tradability2 = tradabilityDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                        }
                    } else {
                        return new OptionDetails(uuidDecode, uuidDecode2, putCallCodeDecode, timeDecode, timeDecode2, instrumentStateDecode, decimalDecode, tradabilityDecode3, tradabilityDecode, tradabilityDecode2, timeDecode3, timeDecode4, optionChainDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionDetails redact(OptionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                UUID chain_pk = value.getChain_pk();
                UUID uuidRedact2 = chain_pk != null ? UUID.ADAPTER.redact(chain_pk) : null;
                Time original_expiration_date = value.getOriginal_expiration_date();
                Time timeRedact = original_expiration_date != null ? Time.ADAPTER.redact(original_expiration_date) : null;
                Time expiration_date = value.getExpiration_date();
                Time timeRedact2 = expiration_date != null ? Time.ADAPTER.redact(expiration_date) : null;
                Decimal strike_price = value.getStrike_price();
                Decimal decimalRedact = strike_price != null ? Decimal.ADAPTER.redact(strike_price) : null;
                Time created_at = value.getCreated_at();
                Time timeRedact3 = created_at != null ? Time.ADAPTER.redact(created_at) : null;
                Time updated_at = value.getUpdated_at();
                Time timeRedact4 = updated_at != null ? Time.ADAPTER.redact(updated_at) : null;
                OptionChainDetails chain = value.getChain();
                return value.copy((932 & 1) != 0 ? value.id : uuidRedact, (932 & 2) != 0 ? value.chain_pk : uuidRedact2, (932 & 4) != 0 ? value.put_call_code : null, (932 & 8) != 0 ? value.original_expiration_date : timeRedact, (932 & 16) != 0 ? value.expiration_date : timeRedact2, (932 & 32) != 0 ? value.state : null, (932 & 64) != 0 ? value.strike_price : decimalRedact, (932 & 128) != 0 ? value.rhs_tradability : null, (932 & 256) != 0 ? value.uk_tradability : null, (932 & 512) != 0 ? value.sg_tradability : null, (932 & 1024) != 0 ? value.created_at : timeRedact3, (932 & 2048) != 0 ? value.updated_at : timeRedact4, (932 & 4096) != 0 ? value.chain : chain != null ? OptionChainDetails.ADAPTER.redact(chain) : null, (932 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
