package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
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
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;
import rosetta.mainst.PositionEffect;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.PutCallCode;
import rosetta.mainst.PutCallCodeDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;

/* compiled from: PinnacleLegDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00049:;<B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u0019Jd\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u000bH\u0016J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u00020\u0012H\u0016J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0012H\u0016J\b\u00108\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Surrogate;)V", "instrument_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "leg_id", "", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "side", "Lrosetta/mainst/SideDto;", "symbol", "ratio_quantity", "", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "trade_value_multiplier", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/PositionEffectDto;Lrosetta/mainst/SideDto;Ljava/lang/String;ILrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;)V", "getInstrument_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getLeg_id", "()Ljava/lang/String;", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getSide", "()Lrosetta/mainst/SideDto;", "getSymbol", "getRatio_quantity", "()I", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getTrade_value_multiplier", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class PinnacleLegDetailsDto implements Dto3<PinnacleLegDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PinnacleLegDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PinnacleLegDetailsDto, PinnacleLegDetails>> binaryBase64Serializer$delegate;
    private static final PinnacleLegDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PinnacleLegDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PinnacleLegDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getLeg_id() {
        return this.surrogate.getLeg_id();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final int getRatio_quantity() {
        return this.surrogate.getRatio_quantity();
    }

    public final PutCallCodeDto getPut_call_code() {
        return this.surrogate.getPut_call_code();
    }

    public final DecimalDto getTrade_value_multiplier() {
        return this.surrogate.getTrade_value_multiplier();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public /* synthetic */ PinnacleLegDetailsDto(UUIDDto uUIDDto, String str, PositionEffectDto positionEffectDto, SideDto sideDto, String str2, int i, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i2 & 8) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i2 & 128) != 0 ? null : decimalDto, (i2 & 256) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnacleLegDetailsDto(UUIDDto uUIDDto, String leg_id, PositionEffectDto position_effect, SideDto side, String symbol, int i, PutCallCodeDto put_call_code, DecimalDto decimalDto, InstrumentTypeDto instrument_type) {
        this(new Surrogate(uUIDDto, leg_id, position_effect, side, symbol, i, put_call_code, decimalDto, instrument_type));
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
    }

    public static /* synthetic */ PinnacleLegDetailsDto copy$default(PinnacleLegDetailsDto pinnacleLegDetailsDto, UUIDDto uUIDDto, String str, PositionEffectDto positionEffectDto, SideDto sideDto, String str2, int i, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uUIDDto = pinnacleLegDetailsDto.surrogate.getInstrument_id();
        }
        if ((i2 & 2) != 0) {
            str = pinnacleLegDetailsDto.surrogate.getLeg_id();
        }
        if ((i2 & 4) != 0) {
            positionEffectDto = pinnacleLegDetailsDto.surrogate.getPosition_effect();
        }
        if ((i2 & 8) != 0) {
            sideDto = pinnacleLegDetailsDto.surrogate.getSide();
        }
        if ((i2 & 16) != 0) {
            str2 = pinnacleLegDetailsDto.surrogate.getSymbol();
        }
        if ((i2 & 32) != 0) {
            i = pinnacleLegDetailsDto.surrogate.getRatio_quantity();
        }
        if ((i2 & 64) != 0) {
            putCallCodeDto = pinnacleLegDetailsDto.surrogate.getPut_call_code();
        }
        if ((i2 & 128) != 0) {
            decimalDto = pinnacleLegDetailsDto.surrogate.getTrade_value_multiplier();
        }
        if ((i2 & 256) != 0) {
            instrumentTypeDto = pinnacleLegDetailsDto.surrogate.getInstrument_type();
        }
        DecimalDto decimalDto2 = decimalDto;
        InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
        int i3 = i;
        PutCallCodeDto putCallCodeDto2 = putCallCodeDto;
        String str3 = str2;
        PositionEffectDto positionEffectDto2 = positionEffectDto;
        return pinnacleLegDetailsDto.copy(uUIDDto, str, positionEffectDto2, sideDto, str3, i3, putCallCodeDto2, decimalDto2, instrumentTypeDto2);
    }

    public final PinnacleLegDetailsDto copy(UUIDDto instrument_id, String leg_id, PositionEffectDto position_effect, SideDto side, String symbol, int ratio_quantity, PutCallCodeDto put_call_code, DecimalDto trade_value_multiplier, InstrumentTypeDto instrument_type) {
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        return new PinnacleLegDetailsDto(new Surrogate(instrument_id, leg_id, position_effect, side, symbol, ratio_quantity, put_call_code, trade_value_multiplier, instrument_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PinnacleLegDetails toProto() {
        UUIDDto instrument_id = this.surrogate.getInstrument_id();
        UUID proto = instrument_id != null ? instrument_id.toProto() : null;
        String leg_id = this.surrogate.getLeg_id();
        PositionEffect positionEffect = (PositionEffect) this.surrogate.getPosition_effect().toProto();
        Side side = (Side) this.surrogate.getSide().toProto();
        String symbol = this.surrogate.getSymbol();
        int ratio_quantity = this.surrogate.getRatio_quantity();
        PutCallCode putCallCode = (PutCallCode) this.surrogate.getPut_call_code().toProto();
        DecimalDto trade_value_multiplier = this.surrogate.getTrade_value_multiplier();
        return new PinnacleLegDetails(proto, leg_id, positionEffect, side, symbol, ratio_quantity, putCallCode, trade_value_multiplier != null ? trade_value_multiplier.toProto() : null, (InstrumentType) this.surrogate.getInstrument_type().toProto(), null, 512, null);
    }

    public String toString() {
        return "[PinnacleLegDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PinnacleLegDetailsDto) && Intrinsics.areEqual(((PinnacleLegDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PinnacleLegDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002NOBt\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017Bs\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u0018\u0010<\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010?\u001a\u00020\u0015HÆ\u0003Jv\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\fHÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001J%\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0001¢\u0006\u0002\bMR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\"R+\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001d\u001a\u0004\b/\u00100R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001d\u001a\u0004\b2\u00103R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001d\u001a\u0004\b5\u00106¨\u0006P"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Surrogate;", "", "instrument_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "leg_id", "", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "side", "Lrosetta/mainst/SideDto;", "symbol", "ratio_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "put_call_code", "Lrosetta/mainst/PutCallCodeDto;", "trade_value_multiplier", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/PositionEffectDto;Lrosetta/mainst/SideDto;Ljava/lang/String;ILrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/PositionEffectDto;Lrosetta/mainst/SideDto;Ljava/lang/String;ILrosetta/mainst/PutCallCodeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInstrument_id$annotations", "()V", "getInstrument_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getLeg_id$annotations", "getLeg_id", "()Ljava/lang/String;", "getPosition_effect$annotations", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getSymbol$annotations", "getSymbol", "getRatio_quantity$annotations", "getRatio_quantity", "()I", "getPut_call_code$annotations", "getPut_call_code", "()Lrosetta/mainst/PutCallCodeDto;", "getTrade_value_multiplier$annotations", "getTrade_value_multiplier", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getInstrument_type$annotations", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UUIDDto instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final String leg_id;
        private final PositionEffectDto position_effect;
        private final PutCallCodeDto put_call_code;
        private final int ratio_quantity;
        private final SideDto side;
        private final String symbol;
        private final DecimalDto trade_value_multiplier;

        public Surrogate() {
            this((UUIDDto) null, (String) null, (PositionEffectDto) null, (SideDto) null, (String) null, 0, (PutCallCodeDto) null, (DecimalDto) null, (InstrumentTypeDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, String str, PositionEffectDto positionEffectDto, SideDto sideDto, String str2, int i, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uUIDDto = surrogate.instrument_id;
            }
            if ((i2 & 2) != 0) {
                str = surrogate.leg_id;
            }
            if ((i2 & 4) != 0) {
                positionEffectDto = surrogate.position_effect;
            }
            if ((i2 & 8) != 0) {
                sideDto = surrogate.side;
            }
            if ((i2 & 16) != 0) {
                str2 = surrogate.symbol;
            }
            if ((i2 & 32) != 0) {
                i = surrogate.ratio_quantity;
            }
            if ((i2 & 64) != 0) {
                putCallCodeDto = surrogate.put_call_code;
            }
            if ((i2 & 128) != 0) {
                decimalDto = surrogate.trade_value_multiplier;
            }
            if ((i2 & 256) != 0) {
                instrumentTypeDto = surrogate.instrument_type;
            }
            DecimalDto decimalDto2 = decimalDto;
            InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
            int i3 = i;
            PutCallCodeDto putCallCodeDto2 = putCallCodeDto;
            String str3 = str2;
            PositionEffectDto positionEffectDto2 = positionEffectDto;
            return surrogate.copy(uUIDDto, str, positionEffectDto2, sideDto, str3, i3, putCallCodeDto2, decimalDto2, instrumentTypeDto2);
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("legId")
        @JsonAnnotations2(names = {"leg_id"})
        public static /* synthetic */ void getLeg_id$annotations() {
        }

        @SerialName("positionEffect")
        @JsonAnnotations2(names = {"position_effect"})
        public static /* synthetic */ void getPosition_effect$annotations() {
        }

        @SerialName("putCallCode")
        @JsonAnnotations2(names = {"put_call_code"})
        public static /* synthetic */ void getPut_call_code$annotations() {
        }

        @SerialName("ratioQuantity")
        @JsonAnnotations2(names = {"ratio_quantity"})
        public static /* synthetic */ void getRatio_quantity$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tradeValueMultiplier")
        @JsonAnnotations2(names = {"trade_value_multiplier"})
        public static /* synthetic */ void getTrade_value_multiplier$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLeg_id() {
            return this.leg_id;
        }

        /* renamed from: component3, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component4, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        /* renamed from: component8, reason: from getter */
        public final DecimalDto getTrade_value_multiplier() {
            return this.trade_value_multiplier;
        }

        /* renamed from: component9, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final Surrogate copy(UUIDDto instrument_id, String leg_id, PositionEffectDto position_effect, SideDto side, String symbol, int ratio_quantity, PutCallCodeDto put_call_code, DecimalDto trade_value_multiplier, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(leg_id, "leg_id");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            return new Surrogate(instrument_id, leg_id, position_effect, side, symbol, ratio_quantity, put_call_code, trade_value_multiplier, instrument_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.leg_id, surrogate.leg_id) && this.position_effect == surrogate.position_effect && this.side == surrogate.side && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.ratio_quantity == surrogate.ratio_quantity && this.put_call_code == surrogate.put_call_code && Intrinsics.areEqual(this.trade_value_multiplier, surrogate.trade_value_multiplier) && this.instrument_type == surrogate.instrument_type;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.instrument_id;
            int iHashCode = (((((((((((((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + this.leg_id.hashCode()) * 31) + this.position_effect.hashCode()) * 31) + this.side.hashCode()) * 31) + this.symbol.hashCode()) * 31) + Integer.hashCode(this.ratio_quantity)) * 31) + this.put_call_code.hashCode()) * 31;
            DecimalDto decimalDto = this.trade_value_multiplier;
            return ((iHashCode + (decimalDto != null ? decimalDto.hashCode() : 0)) * 31) + this.instrument_type.hashCode();
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", leg_id=" + this.leg_id + ", position_effect=" + this.position_effect + ", side=" + this.side + ", symbol=" + this.symbol + ", ratio_quantity=" + this.ratio_quantity + ", put_call_code=" + this.put_call_code + ", trade_value_multiplier=" + this.trade_value_multiplier + ", instrument_type=" + this.instrument_type + ")";
        }

        /* compiled from: PinnacleLegDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PinnacleLegDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, String str, PositionEffectDto positionEffectDto, SideDto sideDto, String str2, int i2, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.instrument_id = null;
            } else {
                this.instrument_id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.leg_id = "";
            } else {
                this.leg_id = str;
            }
            if ((i & 4) == 0) {
                this.position_effect = PositionEffectDto.INSTANCE.getZeroValue();
            } else {
                this.position_effect = positionEffectDto;
            }
            if ((i & 8) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 16) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 32) == 0) {
                this.ratio_quantity = 0;
            } else {
                this.ratio_quantity = i2;
            }
            if ((i & 64) == 0) {
                this.put_call_code = PutCallCodeDto.INSTANCE.getZeroValue();
            } else {
                this.put_call_code = putCallCodeDto;
            }
            if ((i & 128) == 0) {
                this.trade_value_multiplier = null;
            } else {
                this.trade_value_multiplier = decimalDto;
            }
            if ((i & 256) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.instrument_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            if (!Intrinsics.areEqual(self.leg_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.leg_id);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, SideDto.Serializer.INSTANCE, self.side);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 4, self.symbol);
            }
            int i = self.ratio_quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.put_call_code != PutCallCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, PutCallCodeDto.Serializer.INSTANCE, self.put_call_code);
            }
            DecimalDto decimalDto = self.trade_value_multiplier;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
        }

        public Surrogate(UUIDDto uUIDDto, String leg_id, PositionEffectDto position_effect, SideDto side, String symbol, int i, PutCallCodeDto put_call_code, DecimalDto decimalDto, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(leg_id, "leg_id");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            this.instrument_id = uUIDDto;
            this.leg_id = leg_id;
            this.position_effect = position_effect;
            this.side = side;
            this.symbol = symbol;
            this.ratio_quantity = i;
            this.put_call_code = put_call_code;
            this.trade_value_multiplier = decimalDto;
            this.instrument_type = instrument_type;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, String str, PositionEffectDto positionEffectDto, SideDto sideDto, String str2, int i, PutCallCodeDto putCallCodeDto, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i2 & 8) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? PutCallCodeDto.INSTANCE.getZeroValue() : putCallCodeDto, (i2 & 128) != 0 ? null : decimalDto, (i2 & 256) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
        }

        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        public final String getLeg_id() {
            return this.leg_id;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final PutCallCodeDto getPut_call_code() {
            return this.put_call_code;
        }

        public final DecimalDto getTrade_value_multiplier() {
            return this.trade_value_multiplier;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }
    }

    /* compiled from: PinnacleLegDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto;", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PinnacleLegDetailsDto, PinnacleLegDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PinnacleLegDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleLegDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleLegDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PinnacleLegDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PinnacleLegDetails> getProtoAdapter() {
            return PinnacleLegDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleLegDetailsDto getZeroValue() {
            return PinnacleLegDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleLegDetailsDto fromProto(PinnacleLegDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID instrument_id = proto.getInstrument_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = instrument_id != null ? UUIDDto.INSTANCE.fromProto(instrument_id) : null;
            String leg_id = proto.getLeg_id();
            PositionEffectDto positionEffectDtoFromProto = PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect());
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            String symbol = proto.getSymbol();
            int ratio_quantity = proto.getRatio_quantity();
            PutCallCodeDto putCallCodeDtoFromProto = PutCallCodeDto.INSTANCE.fromProto(proto.getPut_call_code());
            Decimal trade_value_multiplier = proto.getTrade_value_multiplier();
            return new PinnacleLegDetailsDto(new Surrogate(uUIDDtoFromProto, leg_id, positionEffectDtoFromProto, sideDtoFromProto, symbol, ratio_quantity, putCallCodeDtoFromProto, trade_value_multiplier != null ? DecimalDto.INSTANCE.fromProto(trade_value_multiplier) : null, InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.PinnacleLegDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinnacleLegDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PinnacleLegDetailsDto(null, null, null, null, null, 0, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PinnacleLegDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PinnacleLegDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.PinnacleLegDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PinnacleLegDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PinnacleLegDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PinnacleLegDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PinnacleLegDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleLegDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.PinnacleLegDetailsDto";
        }
    }
}
