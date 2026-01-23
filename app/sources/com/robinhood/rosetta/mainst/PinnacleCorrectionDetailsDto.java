package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
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

/* compiled from: PinnacleCorrectionDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u0013Jn\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fJ\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Surrogate;)V", "previous_venue_execution_id", "", "new_venue_execution_id", "new_price", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "new_quantity", "new_sec_fee", "new_taf_fee", "new_rounded_notional", "new_or_fee", "new_occ_fee", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "getPrevious_venue_execution_id", "()Ljava/lang/String;", "getNew_venue_execution_id", "getNew_price", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getNew_quantity", "getNew_sec_fee", "getNew_taf_fee", "getNew_rounded_notional", "getNew_or_fee", "getNew_occ_fee", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class PinnacleCorrectionDetailsDto implements Dto3<PinnacleCorrectionDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PinnacleCorrectionDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PinnacleCorrectionDetailsDto, PinnacleCorrectionDetails>> binaryBase64Serializer$delegate;
    private static final PinnacleCorrectionDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PinnacleCorrectionDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PinnacleCorrectionDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPrevious_venue_execution_id() {
        return this.surrogate.getPrevious_venue_execution_id();
    }

    public final String getNew_venue_execution_id() {
        return this.surrogate.getNew_venue_execution_id();
    }

    public final DecimalDto getNew_price() {
        return this.surrogate.getNew_price();
    }

    public final DecimalDto getNew_quantity() {
        return this.surrogate.getNew_quantity();
    }

    public final DecimalDto getNew_sec_fee() {
        return this.surrogate.getNew_sec_fee();
    }

    public final DecimalDto getNew_taf_fee() {
        return this.surrogate.getNew_taf_fee();
    }

    public final DecimalDto getNew_rounded_notional() {
        return this.surrogate.getNew_rounded_notional();
    }

    public final DecimalDto getNew_or_fee() {
        return this.surrogate.getNew_or_fee();
    }

    public final DecimalDto getNew_occ_fee() {
        return this.surrogate.getNew_occ_fee();
    }

    public /* synthetic */ PinnacleCorrectionDetailsDto(String str, String str2, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : decimalDto, (i & 8) != 0 ? null : decimalDto2, (i & 16) != 0 ? null : decimalDto3, (i & 32) != 0 ? null : decimalDto4, (i & 64) != 0 ? null : decimalDto5, (i & 128) != 0 ? null : decimalDto6, (i & 256) != 0 ? null : decimalDto7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnacleCorrectionDetailsDto(String previous_venue_execution_id, String new_venue_execution_id, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7) {
        this(new Surrogate(previous_venue_execution_id, new_venue_execution_id, decimalDto, decimalDto2, decimalDto3, decimalDto4, decimalDto5, decimalDto6, decimalDto7));
        Intrinsics.checkNotNullParameter(previous_venue_execution_id, "previous_venue_execution_id");
        Intrinsics.checkNotNullParameter(new_venue_execution_id, "new_venue_execution_id");
    }

    public static /* synthetic */ PinnacleCorrectionDetailsDto copy$default(PinnacleCorrectionDetailsDto pinnacleCorrectionDetailsDto, String str, String str2, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinnacleCorrectionDetailsDto.surrogate.getPrevious_venue_execution_id();
        }
        if ((i & 2) != 0) {
            str2 = pinnacleCorrectionDetailsDto.surrogate.getNew_venue_execution_id();
        }
        if ((i & 4) != 0) {
            decimalDto = pinnacleCorrectionDetailsDto.surrogate.getNew_price();
        }
        if ((i & 8) != 0) {
            decimalDto2 = pinnacleCorrectionDetailsDto.surrogate.getNew_quantity();
        }
        if ((i & 16) != 0) {
            decimalDto3 = pinnacleCorrectionDetailsDto.surrogate.getNew_sec_fee();
        }
        if ((i & 32) != 0) {
            decimalDto4 = pinnacleCorrectionDetailsDto.surrogate.getNew_taf_fee();
        }
        if ((i & 64) != 0) {
            decimalDto5 = pinnacleCorrectionDetailsDto.surrogate.getNew_rounded_notional();
        }
        if ((i & 128) != 0) {
            decimalDto6 = pinnacleCorrectionDetailsDto.surrogate.getNew_or_fee();
        }
        if ((i & 256) != 0) {
            decimalDto7 = pinnacleCorrectionDetailsDto.surrogate.getNew_occ_fee();
        }
        DecimalDto decimalDto8 = decimalDto6;
        DecimalDto decimalDto9 = decimalDto7;
        DecimalDto decimalDto10 = decimalDto4;
        DecimalDto decimalDto11 = decimalDto5;
        DecimalDto decimalDto12 = decimalDto3;
        DecimalDto decimalDto13 = decimalDto;
        return pinnacleCorrectionDetailsDto.copy(str, str2, decimalDto13, decimalDto2, decimalDto12, decimalDto10, decimalDto11, decimalDto8, decimalDto9);
    }

    public final PinnacleCorrectionDetailsDto copy(String previous_venue_execution_id, String new_venue_execution_id, DecimalDto new_price, DecimalDto new_quantity, DecimalDto new_sec_fee, DecimalDto new_taf_fee, DecimalDto new_rounded_notional, DecimalDto new_or_fee, DecimalDto new_occ_fee) {
        Intrinsics.checkNotNullParameter(previous_venue_execution_id, "previous_venue_execution_id");
        Intrinsics.checkNotNullParameter(new_venue_execution_id, "new_venue_execution_id");
        return new PinnacleCorrectionDetailsDto(new Surrogate(previous_venue_execution_id, new_venue_execution_id, new_price, new_quantity, new_sec_fee, new_taf_fee, new_rounded_notional, new_or_fee, new_occ_fee));
    }

    @Override // com.robinhood.idl.Dto
    public PinnacleCorrectionDetails toProto() {
        String previous_venue_execution_id = this.surrogate.getPrevious_venue_execution_id();
        String new_venue_execution_id = this.surrogate.getNew_venue_execution_id();
        DecimalDto new_price = this.surrogate.getNew_price();
        Decimal proto = new_price != null ? new_price.toProto() : null;
        DecimalDto new_quantity = this.surrogate.getNew_quantity();
        Decimal proto2 = new_quantity != null ? new_quantity.toProto() : null;
        DecimalDto new_sec_fee = this.surrogate.getNew_sec_fee();
        Decimal proto3 = new_sec_fee != null ? new_sec_fee.toProto() : null;
        DecimalDto new_taf_fee = this.surrogate.getNew_taf_fee();
        Decimal proto4 = new_taf_fee != null ? new_taf_fee.toProto() : null;
        DecimalDto new_rounded_notional = this.surrogate.getNew_rounded_notional();
        Decimal proto5 = new_rounded_notional != null ? new_rounded_notional.toProto() : null;
        DecimalDto new_or_fee = this.surrogate.getNew_or_fee();
        Decimal proto6 = new_or_fee != null ? new_or_fee.toProto() : null;
        DecimalDto new_occ_fee = this.surrogate.getNew_occ_fee();
        return new PinnacleCorrectionDetails(previous_venue_execution_id, new_venue_execution_id, proto, proto2, proto3, proto4, proto5, proto6, new_occ_fee != null ? new_occ_fee.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[PinnacleCorrectionDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PinnacleCorrectionDetailsDto) && Intrinsics.areEqual(((PinnacleCorrectionDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: PinnacleCorrectionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002@ABo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jq\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0010HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001cR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u001cR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u001c¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Surrogate;", "", "previous_venue_execution_id", "", "new_venue_execution_id", "new_price", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "new_quantity", "new_sec_fee", "new_taf_fee", "new_rounded_notional", "new_or_fee", "new_occ_fee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPrevious_venue_execution_id$annotations", "()V", "getPrevious_venue_execution_id", "()Ljava/lang/String;", "getNew_venue_execution_id$annotations", "getNew_venue_execution_id", "getNew_price$annotations", "getNew_price", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getNew_quantity$annotations", "getNew_quantity", "getNew_sec_fee$annotations", "getNew_sec_fee", "getNew_taf_fee$annotations", "getNew_taf_fee", "getNew_rounded_notional$annotations", "getNew_rounded_notional", "getNew_or_fee$annotations", "getNew_or_fee", "getNew_occ_fee$annotations", "getNew_occ_fee", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto new_occ_fee;
        private final DecimalDto new_or_fee;
        private final DecimalDto new_price;
        private final DecimalDto new_quantity;
        private final DecimalDto new_rounded_notional;
        private final DecimalDto new_sec_fee;
        private final DecimalDto new_taf_fee;
        private final String new_venue_execution_id;
        private final String previous_venue_execution_id;

        public Surrogate() {
            this((String) null, (String) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.previous_venue_execution_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.new_venue_execution_id;
            }
            if ((i & 4) != 0) {
                decimalDto = surrogate.new_price;
            }
            if ((i & 8) != 0) {
                decimalDto2 = surrogate.new_quantity;
            }
            if ((i & 16) != 0) {
                decimalDto3 = surrogate.new_sec_fee;
            }
            if ((i & 32) != 0) {
                decimalDto4 = surrogate.new_taf_fee;
            }
            if ((i & 64) != 0) {
                decimalDto5 = surrogate.new_rounded_notional;
            }
            if ((i & 128) != 0) {
                decimalDto6 = surrogate.new_or_fee;
            }
            if ((i & 256) != 0) {
                decimalDto7 = surrogate.new_occ_fee;
            }
            DecimalDto decimalDto8 = decimalDto6;
            DecimalDto decimalDto9 = decimalDto7;
            DecimalDto decimalDto10 = decimalDto4;
            DecimalDto decimalDto11 = decimalDto5;
            DecimalDto decimalDto12 = decimalDto3;
            DecimalDto decimalDto13 = decimalDto;
            return surrogate.copy(str, str2, decimalDto13, decimalDto2, decimalDto12, decimalDto10, decimalDto11, decimalDto8, decimalDto9);
        }

        @SerialName("newOccFee")
        @JsonAnnotations2(names = {"new_occ_fee"})
        public static /* synthetic */ void getNew_occ_fee$annotations() {
        }

        @SerialName("newOrFee")
        @JsonAnnotations2(names = {"new_or_fee"})
        public static /* synthetic */ void getNew_or_fee$annotations() {
        }

        @SerialName("newPrice")
        @JsonAnnotations2(names = {"new_price"})
        public static /* synthetic */ void getNew_price$annotations() {
        }

        @SerialName("newQuantity")
        @JsonAnnotations2(names = {"new_quantity"})
        public static /* synthetic */ void getNew_quantity$annotations() {
        }

        @SerialName("newRoundedNotional")
        @JsonAnnotations2(names = {"new_rounded_notional"})
        public static /* synthetic */ void getNew_rounded_notional$annotations() {
        }

        @SerialName("newSecFee")
        @JsonAnnotations2(names = {"new_sec_fee"})
        public static /* synthetic */ void getNew_sec_fee$annotations() {
        }

        @SerialName("newTafFee")
        @JsonAnnotations2(names = {"new_taf_fee"})
        public static /* synthetic */ void getNew_taf_fee$annotations() {
        }

        @SerialName("newVenueExecutionId")
        @JsonAnnotations2(names = {"new_venue_execution_id"})
        public static /* synthetic */ void getNew_venue_execution_id$annotations() {
        }

        @SerialName("previousVenueExecutionId")
        @JsonAnnotations2(names = {"previous_venue_execution_id"})
        public static /* synthetic */ void getPrevious_venue_execution_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrevious_venue_execution_id() {
            return this.previous_venue_execution_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNew_venue_execution_id() {
            return this.new_venue_execution_id;
        }

        /* renamed from: component3, reason: from getter */
        public final DecimalDto getNew_price() {
            return this.new_price;
        }

        /* renamed from: component4, reason: from getter */
        public final DecimalDto getNew_quantity() {
            return this.new_quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final DecimalDto getNew_sec_fee() {
            return this.new_sec_fee;
        }

        /* renamed from: component6, reason: from getter */
        public final DecimalDto getNew_taf_fee() {
            return this.new_taf_fee;
        }

        /* renamed from: component7, reason: from getter */
        public final DecimalDto getNew_rounded_notional() {
            return this.new_rounded_notional;
        }

        /* renamed from: component8, reason: from getter */
        public final DecimalDto getNew_or_fee() {
            return this.new_or_fee;
        }

        /* renamed from: component9, reason: from getter */
        public final DecimalDto getNew_occ_fee() {
            return this.new_occ_fee;
        }

        public final Surrogate copy(String previous_venue_execution_id, String new_venue_execution_id, DecimalDto new_price, DecimalDto new_quantity, DecimalDto new_sec_fee, DecimalDto new_taf_fee, DecimalDto new_rounded_notional, DecimalDto new_or_fee, DecimalDto new_occ_fee) {
            Intrinsics.checkNotNullParameter(previous_venue_execution_id, "previous_venue_execution_id");
            Intrinsics.checkNotNullParameter(new_venue_execution_id, "new_venue_execution_id");
            return new Surrogate(previous_venue_execution_id, new_venue_execution_id, new_price, new_quantity, new_sec_fee, new_taf_fee, new_rounded_notional, new_or_fee, new_occ_fee);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.previous_venue_execution_id, surrogate.previous_venue_execution_id) && Intrinsics.areEqual(this.new_venue_execution_id, surrogate.new_venue_execution_id) && Intrinsics.areEqual(this.new_price, surrogate.new_price) && Intrinsics.areEqual(this.new_quantity, surrogate.new_quantity) && Intrinsics.areEqual(this.new_sec_fee, surrogate.new_sec_fee) && Intrinsics.areEqual(this.new_taf_fee, surrogate.new_taf_fee) && Intrinsics.areEqual(this.new_rounded_notional, surrogate.new_rounded_notional) && Intrinsics.areEqual(this.new_or_fee, surrogate.new_or_fee) && Intrinsics.areEqual(this.new_occ_fee, surrogate.new_occ_fee);
        }

        public int hashCode() {
            int iHashCode = ((this.previous_venue_execution_id.hashCode() * 31) + this.new_venue_execution_id.hashCode()) * 31;
            DecimalDto decimalDto = this.new_price;
            int iHashCode2 = (iHashCode + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            DecimalDto decimalDto2 = this.new_quantity;
            int iHashCode3 = (iHashCode2 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.new_sec_fee;
            int iHashCode4 = (iHashCode3 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            DecimalDto decimalDto4 = this.new_taf_fee;
            int iHashCode5 = (iHashCode4 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31;
            DecimalDto decimalDto5 = this.new_rounded_notional;
            int iHashCode6 = (iHashCode5 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31;
            DecimalDto decimalDto6 = this.new_or_fee;
            int iHashCode7 = (iHashCode6 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31;
            DecimalDto decimalDto7 = this.new_occ_fee;
            return iHashCode7 + (decimalDto7 != null ? decimalDto7.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(previous_venue_execution_id=" + this.previous_venue_execution_id + ", new_venue_execution_id=" + this.new_venue_execution_id + ", new_price=" + this.new_price + ", new_quantity=" + this.new_quantity + ", new_sec_fee=" + this.new_sec_fee + ", new_taf_fee=" + this.new_taf_fee + ", new_rounded_notional=" + this.new_rounded_notional + ", new_or_fee=" + this.new_or_fee + ", new_occ_fee=" + this.new_occ_fee + ")";
        }

        /* compiled from: PinnacleCorrectionDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PinnacleCorrectionDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.previous_venue_execution_id = "";
            } else {
                this.previous_venue_execution_id = str;
            }
            if ((i & 2) == 0) {
                this.new_venue_execution_id = "";
            } else {
                this.new_venue_execution_id = str2;
            }
            if ((i & 4) == 0) {
                this.new_price = null;
            } else {
                this.new_price = decimalDto;
            }
            if ((i & 8) == 0) {
                this.new_quantity = null;
            } else {
                this.new_quantity = decimalDto2;
            }
            if ((i & 16) == 0) {
                this.new_sec_fee = null;
            } else {
                this.new_sec_fee = decimalDto3;
            }
            if ((i & 32) == 0) {
                this.new_taf_fee = null;
            } else {
                this.new_taf_fee = decimalDto4;
            }
            if ((i & 64) == 0) {
                this.new_rounded_notional = null;
            } else {
                this.new_rounded_notional = decimalDto5;
            }
            if ((i & 128) == 0) {
                this.new_or_fee = null;
            } else {
                this.new_or_fee = decimalDto6;
            }
            if ((i & 256) == 0) {
                this.new_occ_fee = null;
            } else {
                this.new_occ_fee = decimalDto7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.previous_venue_execution_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.previous_venue_execution_id);
            }
            if (!Intrinsics.areEqual(self.new_venue_execution_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.new_venue_execution_id);
            }
            DecimalDto decimalDto = self.new_price;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.new_quantity;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.new_sec_fee;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            DecimalDto decimalDto4 = self.new_taf_fee;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            DecimalDto decimalDto5 = self.new_rounded_notional;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            DecimalDto decimalDto6 = self.new_or_fee;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            DecimalDto decimalDto7 = self.new_occ_fee;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
        }

        public Surrogate(String previous_venue_execution_id, String new_venue_execution_id, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7) {
            Intrinsics.checkNotNullParameter(previous_venue_execution_id, "previous_venue_execution_id");
            Intrinsics.checkNotNullParameter(new_venue_execution_id, "new_venue_execution_id");
            this.previous_venue_execution_id = previous_venue_execution_id;
            this.new_venue_execution_id = new_venue_execution_id;
            this.new_price = decimalDto;
            this.new_quantity = decimalDto2;
            this.new_sec_fee = decimalDto3;
            this.new_taf_fee = decimalDto4;
            this.new_rounded_notional = decimalDto5;
            this.new_or_fee = decimalDto6;
            this.new_occ_fee = decimalDto7;
        }

        public /* synthetic */ Surrogate(String str, String str2, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : decimalDto, (i & 8) != 0 ? null : decimalDto2, (i & 16) != 0 ? null : decimalDto3, (i & 32) != 0 ? null : decimalDto4, (i & 64) != 0 ? null : decimalDto5, (i & 128) != 0 ? null : decimalDto6, (i & 256) != 0 ? null : decimalDto7);
        }

        public final String getPrevious_venue_execution_id() {
            return this.previous_venue_execution_id;
        }

        public final String getNew_venue_execution_id() {
            return this.new_venue_execution_id;
        }

        public final DecimalDto getNew_price() {
            return this.new_price;
        }

        public final DecimalDto getNew_quantity() {
            return this.new_quantity;
        }

        public final DecimalDto getNew_sec_fee() {
            return this.new_sec_fee;
        }

        public final DecimalDto getNew_taf_fee() {
            return this.new_taf_fee;
        }

        public final DecimalDto getNew_rounded_notional() {
            return this.new_rounded_notional;
        }

        public final DecimalDto getNew_or_fee() {
            return this.new_or_fee;
        }

        public final DecimalDto getNew_occ_fee() {
            return this.new_occ_fee;
        }
    }

    /* compiled from: PinnacleCorrectionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PinnacleCorrectionDetailsDto, PinnacleCorrectionDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PinnacleCorrectionDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleCorrectionDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PinnacleCorrectionDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) PinnacleCorrectionDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PinnacleCorrectionDetails> getProtoAdapter() {
            return PinnacleCorrectionDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleCorrectionDetailsDto getZeroValue() {
            return PinnacleCorrectionDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PinnacleCorrectionDetailsDto fromProto(PinnacleCorrectionDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String previous_venue_execution_id = proto.getPrevious_venue_execution_id();
            String new_venue_execution_id = proto.getNew_venue_execution_id();
            Decimal new_price = proto.getNew_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DecimalDto decimalDtoFromProto = new_price != null ? DecimalDto.INSTANCE.fromProto(new_price) : null;
            Decimal new_quantity = proto.getNew_quantity();
            DecimalDto decimalDtoFromProto2 = new_quantity != null ? DecimalDto.INSTANCE.fromProto(new_quantity) : null;
            Decimal new_sec_fee = proto.getNew_sec_fee();
            DecimalDto decimalDtoFromProto3 = new_sec_fee != null ? DecimalDto.INSTANCE.fromProto(new_sec_fee) : null;
            Decimal new_taf_fee = proto.getNew_taf_fee();
            DecimalDto decimalDtoFromProto4 = new_taf_fee != null ? DecimalDto.INSTANCE.fromProto(new_taf_fee) : null;
            Decimal new_rounded_notional = proto.getNew_rounded_notional();
            DecimalDto decimalDtoFromProto5 = new_rounded_notional != null ? DecimalDto.INSTANCE.fromProto(new_rounded_notional) : null;
            Decimal new_or_fee = proto.getNew_or_fee();
            DecimalDto decimalDtoFromProto6 = new_or_fee != null ? DecimalDto.INSTANCE.fromProto(new_or_fee) : null;
            Decimal new_occ_fee = proto.getNew_occ_fee();
            return new PinnacleCorrectionDetailsDto(new Surrogate(previous_venue_execution_id, new_venue_execution_id, decimalDtoFromProto, decimalDtoFromProto2, decimalDtoFromProto3, decimalDtoFromProto4, decimalDtoFromProto5, decimalDtoFromProto6, new_occ_fee != null ? DecimalDto.INSTANCE.fromProto(new_occ_fee) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.PinnacleCorrectionDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinnacleCorrectionDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PinnacleCorrectionDetailsDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PinnacleCorrectionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PinnacleCorrectionDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.PinnacleCorrectionDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PinnacleCorrectionDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PinnacleCorrectionDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PinnacleCorrectionDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PinnacleCorrectionDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.PinnacleCorrectionDetailsDto";
        }
    }
}
