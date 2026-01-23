package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.OptionChainDetailsDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
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
import rosetta.mainst.InstrumentState;
import rosetta.mainst.InstrumentStateDto;
import rosetta.mainst.PutCallCode;
import rosetta.mainst.PutCallCodeDto;
import rosetta.mainst.Tradability;
import rosetta.mainst.TradabilityDto;

/* compiled from: OptionDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004ABCDB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u009b\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0006\u0010\u001cJ\u0098\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u000204H\u0016J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020:H\u0016J\b\u0010@\u001a\u00020:H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006E"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OptionDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "chain_pk", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "original_expiration_date", "Lcom/robinhood/rosetta/mainst/TimeDto;", GovernmentIdNfcScan.expirationDateName, "state", "Lrosetta/mainst/InstrumentStateDto;", "strike_price", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "rhs_tradability", "Lrosetta/mainst/TradabilityDto;", "uk_tradability", "sg_tradability", "created_at", "updated_at", TransitionReason.OPTION_TRADE_CHAIN, "Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getChain_pk", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getOriginal_expiration_date", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getExpiration_date", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getStrike_price", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getRhs_tradability", "()Lrosetta/mainst/TradabilityDto;", "getUk_tradability", "getSg_tradability", "getCreated_at", "getUpdated_at", "getChain", "()Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class OptionDetailsDto implements Dto3<OptionDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionDetailsDto, OptionDetails>> binaryBase64Serializer$delegate;
    private static final OptionDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final UUIDDto getChain_pk() {
        return this.surrogate.getChain_pk();
    }

    public final PutCallCodeDto getPut_call_code() {
        return this.surrogate.getPut_call_code();
    }

    public final TimeDto getOriginal_expiration_date() {
        return this.surrogate.getOriginal_expiration_date();
    }

    public final TimeDto getExpiration_date() {
        return this.surrogate.getExpiration_date();
    }

    public final InstrumentStateDto getState() {
        return this.surrogate.getState();
    }

    public final DecimalDto getStrike_price() {
        return this.surrogate.getStrike_price();
    }

    public final TradabilityDto getRhs_tradability() {
        return this.surrogate.getRhs_tradability();
    }

    public final TradabilityDto getUk_tradability() {
        return this.surrogate.getUk_tradability();
    }

    public final TradabilityDto getSg_tradability() {
        return this.surrogate.getSg_tradability();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final OptionChainDetailsDto getChain() {
        return this.surrogate.getChain();
    }

    public /* synthetic */ OptionDetailsDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, PutCallCodeDto putCallCodeDto, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, TradabilityDto tradabilityDto3, TimeDto timeDto3, TimeDto timeDto4, OptionChainDetailsDto optionChainDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : uUIDDto2, (i & 4) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : timeDto2, (i & 32) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 64) != 0 ? null : decimalDto, (i & 128) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 256) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2, (i & 512) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto3, (i & 1024) != 0 ? null : timeDto3, (i & 2048) != 0 ? null : timeDto4, (i & 4096) != 0 ? null : optionChainDetailsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionDetailsDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, PutCallCodeDto put_call_code, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto state, DecimalDto decimalDto, TradabilityDto rhs_tradability, TradabilityDto uk_tradability, TradabilityDto sg_tradability, TimeDto timeDto3, TimeDto timeDto4, OptionChainDetailsDto optionChainDetailsDto) {
        this(new Surrogate(uUIDDto, uUIDDto2, put_call_code, timeDto, timeDto2, state, decimalDto, rhs_tradability, uk_tradability, sg_tradability, timeDto3, timeDto4, optionChainDetailsDto));
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(uk_tradability, "uk_tradability");
        Intrinsics.checkNotNullParameter(sg_tradability, "sg_tradability");
    }

    public static /* synthetic */ OptionDetailsDto copy$default(OptionDetailsDto optionDetailsDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, PutCallCodeDto putCallCodeDto, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, TradabilityDto tradabilityDto3, TimeDto timeDto3, TimeDto timeDto4, OptionChainDetailsDto optionChainDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            uUIDDto = optionDetailsDto.surrogate.getId();
        }
        return optionDetailsDto.copy(uUIDDto, (i & 2) != 0 ? optionDetailsDto.surrogate.getChain_pk() : uUIDDto2, (i & 4) != 0 ? optionDetailsDto.surrogate.getPut_call_code() : putCallCodeDto, (i & 8) != 0 ? optionDetailsDto.surrogate.getOriginal_expiration_date() : timeDto, (i & 16) != 0 ? optionDetailsDto.surrogate.getExpiration_date() : timeDto2, (i & 32) != 0 ? optionDetailsDto.surrogate.getState() : instrumentStateDto, (i & 64) != 0 ? optionDetailsDto.surrogate.getStrike_price() : decimalDto, (i & 128) != 0 ? optionDetailsDto.surrogate.getRhs_tradability() : tradabilityDto, (i & 256) != 0 ? optionDetailsDto.surrogate.getUk_tradability() : tradabilityDto2, (i & 512) != 0 ? optionDetailsDto.surrogate.getSg_tradability() : tradabilityDto3, (i & 1024) != 0 ? optionDetailsDto.surrogate.getCreated_at() : timeDto3, (i & 2048) != 0 ? optionDetailsDto.surrogate.getUpdated_at() : timeDto4, (i & 4096) != 0 ? optionDetailsDto.surrogate.getChain() : optionChainDetailsDto);
    }

    public final OptionDetailsDto copy(UUIDDto id, UUIDDto chain_pk, PutCallCodeDto put_call_code, TimeDto original_expiration_date, TimeDto expiration_date, InstrumentStateDto state, DecimalDto strike_price, TradabilityDto rhs_tradability, TradabilityDto uk_tradability, TradabilityDto sg_tradability, TimeDto created_at, TimeDto updated_at, OptionChainDetailsDto chain) {
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(uk_tradability, "uk_tradability");
        Intrinsics.checkNotNullParameter(sg_tradability, "sg_tradability");
        return new OptionDetailsDto(new Surrogate(id, chain_pk, put_call_code, original_expiration_date, expiration_date, state, strike_price, rhs_tradability, uk_tradability, sg_tradability, created_at, updated_at, chain));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionDetails toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        UUIDDto chain_pk = this.surrogate.getChain_pk();
        UUID proto2 = chain_pk != null ? chain_pk.toProto() : null;
        PutCallCode putCallCode = (PutCallCode) this.surrogate.getPut_call_code().toProto();
        TimeDto original_expiration_date = this.surrogate.getOriginal_expiration_date();
        Time proto3 = original_expiration_date != null ? original_expiration_date.toProto() : null;
        TimeDto expiration_date = this.surrogate.getExpiration_date();
        Time proto4 = expiration_date != null ? expiration_date.toProto() : null;
        InstrumentState instrumentState = (InstrumentState) this.surrogate.getState().toProto();
        DecimalDto strike_price = this.surrogate.getStrike_price();
        Decimal proto5 = strike_price != null ? strike_price.toProto() : null;
        Tradability tradability = (Tradability) this.surrogate.getRhs_tradability().toProto();
        Tradability tradability2 = (Tradability) this.surrogate.getUk_tradability().toProto();
        Tradability tradability3 = (Tradability) this.surrogate.getSg_tradability().toProto();
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto6 = created_at != null ? created_at.toProto() : null;
        TimeDto updated_at = this.surrogate.getUpdated_at();
        Time proto7 = updated_at != null ? updated_at.toProto() : null;
        OptionChainDetailsDto chain = this.surrogate.getChain();
        return new OptionDetails(proto, proto2, putCallCode, proto3, proto4, instrumentState, proto5, tradability, tradability2, tradability3, proto6, proto7, chain != null ? chain.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[OptionDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionDetailsDto) && Intrinsics.areEqual(((OptionDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \\2\u00020\u0001:\u0002[\\B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0016\u0010\u001cJ\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010D\u001a\u00020\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010F\u001a\u00020\u000fHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u000fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u009b\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0019HÖ\u0001J\t\u0010Q\u001a\u00020RHÖ\u0001J%\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0001¢\u0006\u0002\bZR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010(R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010(R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010-R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001e\u001a\u0004\b2\u00103R\u001c\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00103R\u001c\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001e\u001a\u0004\b7\u00103R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010(R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010(R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010>¨\u0006]"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "chain_pk", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "original_expiration_date", "Lcom/robinhood/rosetta/mainst/TimeDto;", GovernmentIdNfcScan.expirationDateName, "state", "Lrosetta/mainst/InstrumentStateDto;", "strike_price", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "rhs_tradability", "Lrosetta/mainst/TradabilityDto;", "uk_tradability", "sg_tradability", "created_at", "updated_at", TransitionReason.OPTION_TRADE_CHAIN, "Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;Lrosetta/mainst/TradabilityDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getChain_pk$annotations", "getChain_pk", "getPut_call_code$annotations", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getOriginal_expiration_date$annotations", "getOriginal_expiration_date", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getExpiration_date$annotations", "getExpiration_date", "getState$annotations", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getStrike_price$annotations", "getStrike_price", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getRhs_tradability$annotations", "getRhs_tradability", "()Lrosetta/mainst/TradabilityDto;", "getUk_tradability$annotations", "getUk_tradability", "getSg_tradability$annotations", "getSg_tradability", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "getChain$annotations", "getChain", "()Lcom/robinhood/rosetta/mainst/OptionChainDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OptionChainDetailsDto chain;
        private final UUIDDto chain_pk;
        private final TimeDto created_at;
        private final TimeDto expiration_date;
        private final UUIDDto id;
        private final TimeDto original_expiration_date;
        private final PutCallCodeDto put_call_code;
        private final TradabilityDto rhs_tradability;
        private final TradabilityDto sg_tradability;
        private final InstrumentStateDto state;
        private final DecimalDto strike_price;
        private final TradabilityDto uk_tradability;
        private final TimeDto updated_at;

        public Surrogate() {
            this((UUIDDto) null, (UUIDDto) null, (PutCallCodeDto) null, (TimeDto) null, (TimeDto) null, (InstrumentStateDto) null, (DecimalDto) null, (TradabilityDto) null, (TradabilityDto) null, (TradabilityDto) null, (TimeDto) null, (TimeDto) null, (OptionChainDetailsDto) null, 8191, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, UUIDDto uUIDDto2, PutCallCodeDto putCallCodeDto, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, TradabilityDto tradabilityDto3, TimeDto timeDto3, TimeDto timeDto4, OptionChainDetailsDto optionChainDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                uUIDDto = surrogate.id;
            }
            return surrogate.copy(uUIDDto, (i & 2) != 0 ? surrogate.chain_pk : uUIDDto2, (i & 4) != 0 ? surrogate.put_call_code : putCallCodeDto, (i & 8) != 0 ? surrogate.original_expiration_date : timeDto, (i & 16) != 0 ? surrogate.expiration_date : timeDto2, (i & 32) != 0 ? surrogate.state : instrumentStateDto, (i & 64) != 0 ? surrogate.strike_price : decimalDto, (i & 128) != 0 ? surrogate.rhs_tradability : tradabilityDto, (i & 256) != 0 ? surrogate.uk_tradability : tradabilityDto2, (i & 512) != 0 ? surrogate.sg_tradability : tradabilityDto3, (i & 1024) != 0 ? surrogate.created_at : timeDto3, (i & 2048) != 0 ? surrogate.updated_at : timeDto4, (i & 4096) != 0 ? surrogate.chain : optionChainDetailsDto);
        }

        @SerialName(TransitionReason.OPTION_TRADE_CHAIN)
        @JsonAnnotations2(names = {TransitionReason.OPTION_TRADE_CHAIN})
        public static /* synthetic */ void getChain$annotations() {
        }

        @SerialName("chainPk")
        @JsonAnnotations2(names = {"chain_pk"})
        public static /* synthetic */ void getChain_pk$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("expirationDate")
        @JsonAnnotations2(names = {GovernmentIdNfcScan.expirationDateName})
        public static /* synthetic */ void getExpiration_date$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("originalExpirationDate")
        @JsonAnnotations2(names = {"original_expiration_date"})
        public static /* synthetic */ void getOriginal_expiration_date$annotations() {
        }

        @SerialName("putCallCode")
        @JsonAnnotations2(names = {"put_call_code"})
        public static /* synthetic */ void getPut_call_code$annotations() {
        }

        @SerialName("rhsTradability")
        @JsonAnnotations2(names = {"rhs_tradability"})
        public static /* synthetic */ void getRhs_tradability$annotations() {
        }

        @SerialName("sgTradability")
        @JsonAnnotations2(names = {"sg_tradability"})
        public static /* synthetic */ void getSg_tradability$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("strikePrice")
        @JsonAnnotations2(names = {"strike_price"})
        public static /* synthetic */ void getStrike_price$annotations() {
        }

        @SerialName("ukTradability")
        @JsonAnnotations2(names = {"uk_tradability"})
        public static /* synthetic */ void getUk_tradability$annotations() {
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
        public final TradabilityDto getSg_tradability() {
            return this.sg_tradability;
        }

        /* renamed from: component11, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component12, reason: from getter */
        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component13, reason: from getter */
        public final OptionChainDetailsDto getChain() {
            return this.chain;
        }

        /* renamed from: component2, reason: from getter */
        public final UUIDDto getChain_pk() {
            return this.chain_pk;
        }

        /* renamed from: component3, reason: from getter */
        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getOriginal_expiration_date() {
            return this.original_expiration_date;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getExpiration_date() {
            return this.expiration_date;
        }

        /* renamed from: component6, reason: from getter */
        public final InstrumentStateDto getState() {
            return this.state;
        }

        /* renamed from: component7, reason: from getter */
        public final DecimalDto getStrike_price() {
            return this.strike_price;
        }

        /* renamed from: component8, reason: from getter */
        public final TradabilityDto getRhs_tradability() {
            return this.rhs_tradability;
        }

        /* renamed from: component9, reason: from getter */
        public final TradabilityDto getUk_tradability() {
            return this.uk_tradability;
        }

        public final Surrogate copy(UUIDDto id, UUIDDto chain_pk, PutCallCodeDto put_call_code, TimeDto original_expiration_date, TimeDto expiration_date, InstrumentStateDto state, DecimalDto strike_price, TradabilityDto rhs_tradability, TradabilityDto uk_tradability, TradabilityDto sg_tradability, TimeDto created_at, TimeDto updated_at, OptionChainDetailsDto chain) {
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
            Intrinsics.checkNotNullParameter(uk_tradability, "uk_tradability");
            Intrinsics.checkNotNullParameter(sg_tradability, "sg_tradability");
            return new Surrogate(id, chain_pk, put_call_code, original_expiration_date, expiration_date, state, strike_price, rhs_tradability, uk_tradability, sg_tradability, created_at, updated_at, chain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.chain_pk, surrogate.chain_pk) && this.put_call_code == surrogate.put_call_code && Intrinsics.areEqual(this.original_expiration_date, surrogate.original_expiration_date) && Intrinsics.areEqual(this.expiration_date, surrogate.expiration_date) && this.state == surrogate.state && Intrinsics.areEqual(this.strike_price, surrogate.strike_price) && this.rhs_tradability == surrogate.rhs_tradability && this.uk_tradability == surrogate.uk_tradability && this.sg_tradability == surrogate.sg_tradability && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.chain, surrogate.chain);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            UUIDDto uUIDDto2 = this.chain_pk;
            int iHashCode2 = (((iHashCode + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.put_call_code.hashCode()) * 31;
            TimeDto timeDto = this.original_expiration_date;
            int iHashCode3 = (iHashCode2 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.expiration_date;
            int iHashCode4 = (((iHashCode3 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + this.state.hashCode()) * 31;
            DecimalDto decimalDto = this.strike_price;
            int iHashCode5 = (((((((iHashCode4 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31) + this.rhs_tradability.hashCode()) * 31) + this.uk_tradability.hashCode()) * 31) + this.sg_tradability.hashCode()) * 31;
            TimeDto timeDto3 = this.created_at;
            int iHashCode6 = (iHashCode5 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31;
            TimeDto timeDto4 = this.updated_at;
            int iHashCode7 = (iHashCode6 + (timeDto4 == null ? 0 : timeDto4.hashCode())) * 31;
            OptionChainDetailsDto optionChainDetailsDto = this.chain;
            return iHashCode7 + (optionChainDetailsDto != null ? optionChainDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", chain_pk=" + this.chain_pk + ", put_call_code=" + this.put_call_code + ", original_expiration_date=" + this.original_expiration_date + ", expiration_date=" + this.expiration_date + ", state=" + this.state + ", strike_price=" + this.strike_price + ", rhs_tradability=" + this.rhs_tradability + ", uk_tradability=" + this.uk_tradability + ", sg_tradability=" + this.sg_tradability + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", chain=" + this.chain + ")";
        }

        /* compiled from: OptionDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, UUIDDto uUIDDto2, PutCallCodeDto putCallCodeDto, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, TradabilityDto tradabilityDto3, TimeDto timeDto3, TimeDto timeDto4, OptionChainDetailsDto optionChainDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.chain_pk = null;
            } else {
                this.chain_pk = uUIDDto2;
            }
            if ((i & 4) == 0) {
                this.put_call_code = PutCallCodeDto.INSTANCE.getZeroValue();
            } else {
                this.put_call_code = putCallCodeDto;
            }
            if ((i & 8) == 0) {
                this.original_expiration_date = null;
            } else {
                this.original_expiration_date = timeDto;
            }
            if ((i & 16) == 0) {
                this.expiration_date = null;
            } else {
                this.expiration_date = timeDto2;
            }
            if ((i & 32) == 0) {
                this.state = InstrumentStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = instrumentStateDto;
            }
            if ((i & 64) == 0) {
                this.strike_price = null;
            } else {
                this.strike_price = decimalDto;
            }
            if ((i & 128) == 0) {
                this.rhs_tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.rhs_tradability = tradabilityDto;
            }
            if ((i & 256) == 0) {
                this.uk_tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.uk_tradability = tradabilityDto2;
            }
            if ((i & 512) == 0) {
                this.sg_tradability = TradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.sg_tradability = tradabilityDto3;
            }
            if ((i & 1024) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto3;
            }
            if ((i & 2048) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = timeDto4;
            }
            if ((i & 4096) == 0) {
                this.chain = null;
            } else {
                this.chain = optionChainDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.chain_pk;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (self.put_call_code != PutCallCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PutCallCodeDto.Serializer.INSTANCE, self.put_call_code);
            }
            TimeDto timeDto = self.original_expiration_date;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.expiration_date;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (self.state != InstrumentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, InstrumentStateDto.Serializer.INSTANCE, self.state);
            }
            DecimalDto decimalDto = self.strike_price;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            TradabilityDto tradabilityDto = self.rhs_tradability;
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            if (tradabilityDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, TradabilityDto.Serializer.INSTANCE, self.rhs_tradability);
            }
            if (self.uk_tradability != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, TradabilityDto.Serializer.INSTANCE, self.uk_tradability);
            }
            if (self.sg_tradability != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, TradabilityDto.Serializer.INSTANCE, self.sg_tradability);
            }
            TimeDto timeDto3 = self.created_at;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            TimeDto timeDto4 = self.updated_at;
            if (timeDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, TimeDto.Serializer.INSTANCE, timeDto4);
            }
            OptionChainDetailsDto optionChainDetailsDto = self.chain;
            if (optionChainDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, OptionChainDetailsDto.Serializer.INSTANCE, optionChainDetailsDto);
            }
        }

        public Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, PutCallCodeDto put_call_code, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto state, DecimalDto decimalDto, TradabilityDto rhs_tradability, TradabilityDto uk_tradability, TradabilityDto sg_tradability, TimeDto timeDto3, TimeDto timeDto4, OptionChainDetailsDto optionChainDetailsDto) {
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
            Intrinsics.checkNotNullParameter(uk_tradability, "uk_tradability");
            Intrinsics.checkNotNullParameter(sg_tradability, "sg_tradability");
            this.id = uUIDDto;
            this.chain_pk = uUIDDto2;
            this.put_call_code = put_call_code;
            this.original_expiration_date = timeDto;
            this.expiration_date = timeDto2;
            this.state = state;
            this.strike_price = decimalDto;
            this.rhs_tradability = rhs_tradability;
            this.uk_tradability = uk_tradability;
            this.sg_tradability = sg_tradability;
            this.created_at = timeDto3;
            this.updated_at = timeDto4;
            this.chain = optionChainDetailsDto;
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final UUIDDto getChain_pk() {
            return this.chain_pk;
        }

        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, PutCallCodeDto putCallCodeDto, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, DecimalDto decimalDto, TradabilityDto tradabilityDto, TradabilityDto tradabilityDto2, TradabilityDto tradabilityDto3, TimeDto timeDto3, TimeDto timeDto4, OptionChainDetailsDto optionChainDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? null : uUIDDto2, (i & 4) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : timeDto2, (i & 32) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 64) != 0 ? null : decimalDto, (i & 128) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto, (i & 256) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto2, (i & 512) != 0 ? TradabilityDto.INSTANCE.getZeroValue() : tradabilityDto3, (i & 1024) != 0 ? null : timeDto3, (i & 2048) != 0 ? null : timeDto4, (i & 4096) != 0 ? null : optionChainDetailsDto);
        }

        public final TimeDto getOriginal_expiration_date() {
            return this.original_expiration_date;
        }

        public final TimeDto getExpiration_date() {
            return this.expiration_date;
        }

        public final InstrumentStateDto getState() {
            return this.state;
        }

        public final DecimalDto getStrike_price() {
            return this.strike_price;
        }

        public final TradabilityDto getRhs_tradability() {
            return this.rhs_tradability;
        }

        public final TradabilityDto getUk_tradability() {
            return this.uk_tradability;
        }

        public final TradabilityDto getSg_tradability() {
            return this.sg_tradability;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        public final OptionChainDetailsDto getChain() {
            return this.chain;
        }
    }

    /* compiled from: OptionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "Lcom/robinhood/rosetta/mainst/OptionDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OptionDetailsDto, OptionDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionDetails> getProtoAdapter() {
            return OptionDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionDetailsDto getZeroValue() {
            return OptionDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionDetailsDto fromProto(OptionDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            UUID chain_pk = proto.getChain_pk();
            UUIDDto uUIDDtoFromProto2 = chain_pk != null ? UUIDDto.INSTANCE.fromProto(chain_pk) : null;
            PutCallCodeDto putCallCodeDtoFromProto = PutCallCodeDto.INSTANCE.fromProto(proto.getPut_call_code());
            Time original_expiration_date = proto.getOriginal_expiration_date();
            TimeDto timeDtoFromProto = original_expiration_date != null ? TimeDto.INSTANCE.fromProto(original_expiration_date) : null;
            Time expiration_date = proto.getExpiration_date();
            TimeDto timeDtoFromProto2 = expiration_date != null ? TimeDto.INSTANCE.fromProto(expiration_date) : null;
            InstrumentStateDto instrumentStateDtoFromProto = InstrumentStateDto.INSTANCE.fromProto(proto.getState());
            Decimal strike_price = proto.getStrike_price();
            DecimalDto decimalDtoFromProto = strike_price != null ? DecimalDto.INSTANCE.fromProto(strike_price) : null;
            TradabilityDto.Companion companion = TradabilityDto.INSTANCE;
            TradabilityDto tradabilityDtoFromProto = companion.fromProto(proto.getRhs_tradability());
            TradabilityDto tradabilityDtoFromProto2 = companion.fromProto(proto.getUk_tradability());
            TradabilityDto tradabilityDtoFromProto3 = companion.fromProto(proto.getSg_tradability());
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto3 = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time updated_at = proto.getUpdated_at();
            TimeDto timeDtoFromProto4 = updated_at != null ? TimeDto.INSTANCE.fromProto(updated_at) : null;
            OptionChainDetails chain = proto.getChain();
            return new OptionDetailsDto(new Surrogate(uUIDDtoFromProto, uUIDDtoFromProto2, putCallCodeDtoFromProto, timeDtoFromProto, timeDtoFromProto2, instrumentStateDtoFromProto, decimalDtoFromProto, tradabilityDtoFromProto, tradabilityDtoFromProto2, tradabilityDtoFromProto3, timeDtoFromProto3, timeDtoFromProto4, chain != null ? OptionChainDetailsDto.INSTANCE.fromProto(chain) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OptionDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OptionDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OptionDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OptionDetailsDto";
        }
    }
}
