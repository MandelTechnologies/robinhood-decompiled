package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.ExchangeSourceDto;
import com.robinhood.ceres.p284v1.FeeChargeEventTypeDto;
import com.robinhood.ceres.p284v1.FeeTypeFundingDestinationDto;
import com.robinhood.ceres.p284v1.LocalityDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FeeTypeInfoDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044567B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0017Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010'\u001a\u00020\u0002H\u0016J\b\u0010(\u001a\u00020\tH\u0016J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00068"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FeeTypeInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Surrogate;)V", "fee_type_name", "", "description", "is_active", "", "allow_override_schedules", "funding_destination", "Lcom/robinhood/ceres/v1/FeeTypeFundingDestinationDto;", "fee_charge_event_type", "Lcom/robinhood/ceres/v1/FeeChargeEventTypeDto;", "supports_default_fees", "locality", "Lcom/robinhood/ceres/v1/LocalityDto;", "exchange_source", "Lcom/robinhood/ceres/v1/ExchangeSourceDto;", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/ceres/v1/FeeTypeFundingDestinationDto;Lcom/robinhood/ceres/v1/FeeChargeEventTypeDto;ZLcom/robinhood/ceres/v1/LocalityDto;Lcom/robinhood/ceres/v1/ExchangeSourceDto;)V", "getFee_type_name", "()Ljava/lang/String;", "getDescription", "()Z", "getAllow_override_schedules", "getFunding_destination", "()Lcom/robinhood/ceres/v1/FeeTypeFundingDestinationDto;", "getFee_charge_event_type", "()Lcom/robinhood/ceres/v1/FeeChargeEventTypeDto;", "getSupports_default_fees", "getLocality", "()Lcom/robinhood/ceres/v1/LocalityDto;", "getExchange_source", "()Lcom/robinhood/ceres/v1/ExchangeSourceDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FeeTypeInfoDto implements Dto3<FeeTypeInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeTypeInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeTypeInfoDto, FeeTypeInfo>> binaryBase64Serializer$delegate;
    private static final FeeTypeInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeTypeInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeTypeInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFee_type_name() {
        return this.surrogate.getFee_type_name();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final boolean is_active() {
        return this.surrogate.is_active();
    }

    public final boolean getAllow_override_schedules() {
        return this.surrogate.getAllow_override_schedules();
    }

    public final FeeTypeFundingDestinationDto getFunding_destination() {
        return this.surrogate.getFunding_destination();
    }

    public final FeeChargeEventTypeDto getFee_charge_event_type() {
        return this.surrogate.getFee_charge_event_type();
    }

    public final boolean getSupports_default_fees() {
        return this.surrogate.getSupports_default_fees();
    }

    public final LocalityDto getLocality() {
        return this.surrogate.getLocality();
    }

    public final ExchangeSourceDto getExchange_source() {
        return this.surrogate.getExchange_source();
    }

    public /* synthetic */ FeeTypeInfoDto(String str, String str2, boolean z, boolean z2, FeeTypeFundingDestinationDto feeTypeFundingDestinationDto, FeeChargeEventTypeDto feeChargeEventTypeDto, boolean z3, LocalityDto localityDto, ExchangeSourceDto exchangeSourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? FeeTypeFundingDestinationDto.INSTANCE.getZeroValue() : feeTypeFundingDestinationDto, (i & 32) != 0 ? FeeChargeEventTypeDto.INSTANCE.getZeroValue() : feeChargeEventTypeDto, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : localityDto, (i & 256) != 0 ? null : exchangeSourceDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeTypeInfoDto(String fee_type_name, String description, boolean z, boolean z2, FeeTypeFundingDestinationDto funding_destination, FeeChargeEventTypeDto fee_charge_event_type, boolean z3, LocalityDto localityDto, ExchangeSourceDto exchangeSourceDto) {
        this(new Surrogate(fee_type_name, description, z, z2, funding_destination, fee_charge_event_type, z3, localityDto, exchangeSourceDto));
        Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(funding_destination, "funding_destination");
        Intrinsics.checkNotNullParameter(fee_charge_event_type, "fee_charge_event_type");
    }

    public static /* synthetic */ FeeTypeInfoDto copy$default(FeeTypeInfoDto feeTypeInfoDto, String str, String str2, boolean z, boolean z2, FeeTypeFundingDestinationDto feeTypeFundingDestinationDto, FeeChargeEventTypeDto feeChargeEventTypeDto, boolean z3, LocalityDto localityDto, ExchangeSourceDto exchangeSourceDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeTypeInfoDto.surrogate.getFee_type_name();
        }
        if ((i & 2) != 0) {
            str2 = feeTypeInfoDto.surrogate.getDescription();
        }
        if ((i & 4) != 0) {
            z = feeTypeInfoDto.surrogate.is_active();
        }
        if ((i & 8) != 0) {
            z2 = feeTypeInfoDto.surrogate.getAllow_override_schedules();
        }
        if ((i & 16) != 0) {
            feeTypeFundingDestinationDto = feeTypeInfoDto.surrogate.getFunding_destination();
        }
        if ((i & 32) != 0) {
            feeChargeEventTypeDto = feeTypeInfoDto.surrogate.getFee_charge_event_type();
        }
        if ((i & 64) != 0) {
            z3 = feeTypeInfoDto.surrogate.getSupports_default_fees();
        }
        if ((i & 128) != 0) {
            localityDto = feeTypeInfoDto.surrogate.getLocality();
        }
        if ((i & 256) != 0) {
            exchangeSourceDto = feeTypeInfoDto.surrogate.getExchange_source();
        }
        LocalityDto localityDto2 = localityDto;
        ExchangeSourceDto exchangeSourceDto2 = exchangeSourceDto;
        FeeChargeEventTypeDto feeChargeEventTypeDto2 = feeChargeEventTypeDto;
        boolean z4 = z3;
        FeeTypeFundingDestinationDto feeTypeFundingDestinationDto2 = feeTypeFundingDestinationDto;
        boolean z5 = z;
        return feeTypeInfoDto.copy(str, str2, z5, z2, feeTypeFundingDestinationDto2, feeChargeEventTypeDto2, z4, localityDto2, exchangeSourceDto2);
    }

    public final FeeTypeInfoDto copy(String fee_type_name, String description, boolean is_active, boolean allow_override_schedules, FeeTypeFundingDestinationDto funding_destination, FeeChargeEventTypeDto fee_charge_event_type, boolean supports_default_fees, LocalityDto locality, ExchangeSourceDto exchange_source) {
        Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(funding_destination, "funding_destination");
        Intrinsics.checkNotNullParameter(fee_charge_event_type, "fee_charge_event_type");
        return new FeeTypeInfoDto(new Surrogate(fee_type_name, description, is_active, allow_override_schedules, funding_destination, fee_charge_event_type, supports_default_fees, locality, exchange_source));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FeeTypeInfo toProto() {
        String fee_type_name = this.surrogate.getFee_type_name();
        String description = this.surrogate.getDescription();
        boolean zIs_active = this.surrogate.is_active();
        boolean allow_override_schedules = this.surrogate.getAllow_override_schedules();
        FeeTypeFundingDestination feeTypeFundingDestination = (FeeTypeFundingDestination) this.surrogate.getFunding_destination().toProto();
        FeeChargeEventType feeChargeEventType = (FeeChargeEventType) this.surrogate.getFee_charge_event_type().toProto();
        boolean supports_default_fees = this.surrogate.getSupports_default_fees();
        LocalityDto locality = this.surrogate.getLocality();
        Locality locality2 = locality != null ? (Locality) locality.toProto() : null;
        ExchangeSourceDto exchange_source = this.surrogate.getExchange_source();
        return new FeeTypeInfo(fee_type_name, description, zIs_active, allow_override_schedules, feeTypeFundingDestination, feeChargeEventType, supports_default_fees, locality2, exchange_source != null ? (ExchangeSource) exchange_source.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[FeeTypeInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeTypeInfoDto) && Intrinsics.areEqual(((FeeTypeInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002FGBe\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012Bo\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0014HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J%\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0002\bER\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0005\u0010\u001fR\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001fR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010,R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/¨\u0006H"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Surrogate;", "", "fee_type_name", "", "description", "is_active", "", "allow_override_schedules", "funding_destination", "Lcom/robinhood/ceres/v1/FeeTypeFundingDestinationDto;", "fee_charge_event_type", "Lcom/robinhood/ceres/v1/FeeChargeEventTypeDto;", "supports_default_fees", "locality", "Lcom/robinhood/ceres/v1/LocalityDto;", "exchange_source", "Lcom/robinhood/ceres/v1/ExchangeSourceDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/ceres/v1/FeeTypeFundingDestinationDto;Lcom/robinhood/ceres/v1/FeeChargeEventTypeDto;ZLcom/robinhood/ceres/v1/LocalityDto;Lcom/robinhood/ceres/v1/ExchangeSourceDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZZLcom/robinhood/ceres/v1/FeeTypeFundingDestinationDto;Lcom/robinhood/ceres/v1/FeeChargeEventTypeDto;ZLcom/robinhood/ceres/v1/LocalityDto;Lcom/robinhood/ceres/v1/ExchangeSourceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFee_type_name$annotations", "()V", "getFee_type_name", "()Ljava/lang/String;", "getDescription$annotations", "getDescription", "is_active$annotations", "()Z", "getAllow_override_schedules$annotations", "getAllow_override_schedules", "getFunding_destination$annotations", "getFunding_destination", "()Lcom/robinhood/ceres/v1/FeeTypeFundingDestinationDto;", "getFee_charge_event_type$annotations", "getFee_charge_event_type", "()Lcom/robinhood/ceres/v1/FeeChargeEventTypeDto;", "getSupports_default_fees$annotations", "getSupports_default_fees", "getLocality$annotations", "getLocality", "()Lcom/robinhood/ceres/v1/LocalityDto;", "getExchange_source$annotations", "getExchange_source", "()Lcom/robinhood/ceres/v1/ExchangeSourceDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean allow_override_schedules;
        private final String description;
        private final ExchangeSourceDto exchange_source;
        private final FeeChargeEventTypeDto fee_charge_event_type;
        private final String fee_type_name;
        private final FeeTypeFundingDestinationDto funding_destination;
        private final boolean is_active;
        private final LocalityDto locality;
        private final boolean supports_default_fees;

        public Surrogate() {
            this((String) null, (String) null, false, false, (FeeTypeFundingDestinationDto) null, (FeeChargeEventTypeDto) null, false, (LocalityDto) null, (ExchangeSourceDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, boolean z, boolean z2, FeeTypeFundingDestinationDto feeTypeFundingDestinationDto, FeeChargeEventTypeDto feeChargeEventTypeDto, boolean z3, LocalityDto localityDto, ExchangeSourceDto exchangeSourceDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.fee_type_name;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.description;
            }
            if ((i & 4) != 0) {
                z = surrogate.is_active;
            }
            if ((i & 8) != 0) {
                z2 = surrogate.allow_override_schedules;
            }
            if ((i & 16) != 0) {
                feeTypeFundingDestinationDto = surrogate.funding_destination;
            }
            if ((i & 32) != 0) {
                feeChargeEventTypeDto = surrogate.fee_charge_event_type;
            }
            if ((i & 64) != 0) {
                z3 = surrogate.supports_default_fees;
            }
            if ((i & 128) != 0) {
                localityDto = surrogate.locality;
            }
            if ((i & 256) != 0) {
                exchangeSourceDto = surrogate.exchange_source;
            }
            LocalityDto localityDto2 = localityDto;
            ExchangeSourceDto exchangeSourceDto2 = exchangeSourceDto;
            FeeChargeEventTypeDto feeChargeEventTypeDto2 = feeChargeEventTypeDto;
            boolean z4 = z3;
            FeeTypeFundingDestinationDto feeTypeFundingDestinationDto2 = feeTypeFundingDestinationDto;
            boolean z5 = z;
            return surrogate.copy(str, str2, z5, z2, feeTypeFundingDestinationDto2, feeChargeEventTypeDto2, z4, localityDto2, exchangeSourceDto2);
        }

        @SerialName("allowOverrideSchedules")
        @JsonAnnotations2(names = {"allow_override_schedules"})
        public static /* synthetic */ void getAllow_override_schedules$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("exchangeSource")
        @JsonAnnotations2(names = {"exchange_source"})
        public static /* synthetic */ void getExchange_source$annotations() {
        }

        @SerialName("feeChargeEventType")
        @JsonAnnotations2(names = {"fee_charge_event_type"})
        public static /* synthetic */ void getFee_charge_event_type$annotations() {
        }

        @SerialName("feeTypeName")
        @JsonAnnotations2(names = {"fee_type_name"})
        public static /* synthetic */ void getFee_type_name$annotations() {
        }

        @SerialName("fundingDestination")
        @JsonAnnotations2(names = {"funding_destination"})
        public static /* synthetic */ void getFunding_destination$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("supportsDefaultFees")
        @JsonAnnotations2(names = {"supports_default_fees"})
        public static /* synthetic */ void getSupports_default_fees$annotations() {
        }

        @SerialName("isActive")
        @JsonAnnotations2(names = {"is_active"})
        public static /* synthetic */ void is_active$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFee_type_name() {
            return this.fee_type_name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIs_active() {
            return this.is_active;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAllow_override_schedules() {
            return this.allow_override_schedules;
        }

        /* renamed from: component5, reason: from getter */
        public final FeeTypeFundingDestinationDto getFunding_destination() {
            return this.funding_destination;
        }

        /* renamed from: component6, reason: from getter */
        public final FeeChargeEventTypeDto getFee_charge_event_type() {
            return this.fee_charge_event_type;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getSupports_default_fees() {
            return this.supports_default_fees;
        }

        /* renamed from: component8, reason: from getter */
        public final LocalityDto getLocality() {
            return this.locality;
        }

        /* renamed from: component9, reason: from getter */
        public final ExchangeSourceDto getExchange_source() {
            return this.exchange_source;
        }

        public final Surrogate copy(String fee_type_name, String description, boolean is_active, boolean allow_override_schedules, FeeTypeFundingDestinationDto funding_destination, FeeChargeEventTypeDto fee_charge_event_type, boolean supports_default_fees, LocalityDto locality, ExchangeSourceDto exchange_source) {
            Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(funding_destination, "funding_destination");
            Intrinsics.checkNotNullParameter(fee_charge_event_type, "fee_charge_event_type");
            return new Surrogate(fee_type_name, description, is_active, allow_override_schedules, funding_destination, fee_charge_event_type, supports_default_fees, locality, exchange_source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.fee_type_name, surrogate.fee_type_name) && Intrinsics.areEqual(this.description, surrogate.description) && this.is_active == surrogate.is_active && this.allow_override_schedules == surrogate.allow_override_schedules && this.funding_destination == surrogate.funding_destination && this.fee_charge_event_type == surrogate.fee_charge_event_type && this.supports_default_fees == surrogate.supports_default_fees && this.locality == surrogate.locality && this.exchange_source == surrogate.exchange_source;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.fee_type_name.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.is_active)) * 31) + Boolean.hashCode(this.allow_override_schedules)) * 31) + this.funding_destination.hashCode()) * 31) + this.fee_charge_event_type.hashCode()) * 31) + Boolean.hashCode(this.supports_default_fees)) * 31;
            LocalityDto localityDto = this.locality;
            int iHashCode2 = (iHashCode + (localityDto == null ? 0 : localityDto.hashCode())) * 31;
            ExchangeSourceDto exchangeSourceDto = this.exchange_source;
            return iHashCode2 + (exchangeSourceDto != null ? exchangeSourceDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(fee_type_name=" + this.fee_type_name + ", description=" + this.description + ", is_active=" + this.is_active + ", allow_override_schedules=" + this.allow_override_schedules + ", funding_destination=" + this.funding_destination + ", fee_charge_event_type=" + this.fee_charge_event_type + ", supports_default_fees=" + this.supports_default_fees + ", locality=" + this.locality + ", exchange_source=" + this.exchange_source + ")";
        }

        /* compiled from: FeeTypeInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeTypeInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, boolean z2, FeeTypeFundingDestinationDto feeTypeFundingDestinationDto, FeeChargeEventTypeDto feeChargeEventTypeDto, boolean z3, LocalityDto localityDto, ExchangeSourceDto exchangeSourceDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.fee_type_name = "";
            } else {
                this.fee_type_name = str;
            }
            if ((i & 2) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.is_active = false;
            } else {
                this.is_active = z;
            }
            if ((i & 8) == 0) {
                this.allow_override_schedules = false;
            } else {
                this.allow_override_schedules = z2;
            }
            if ((i & 16) == 0) {
                this.funding_destination = FeeTypeFundingDestinationDto.INSTANCE.getZeroValue();
            } else {
                this.funding_destination = feeTypeFundingDestinationDto;
            }
            if ((i & 32) == 0) {
                this.fee_charge_event_type = FeeChargeEventTypeDto.INSTANCE.getZeroValue();
            } else {
                this.fee_charge_event_type = feeChargeEventTypeDto;
            }
            if ((i & 64) == 0) {
                this.supports_default_fees = false;
            } else {
                this.supports_default_fees = z3;
            }
            if ((i & 128) == 0) {
                this.locality = null;
            } else {
                this.locality = localityDto;
            }
            if ((i & 256) == 0) {
                this.exchange_source = null;
            } else {
                this.exchange_source = exchangeSourceDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.fee_type_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.fee_type_name);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 1, self.description);
            }
            boolean z = self.is_active;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            boolean z2 = self.allow_override_schedules;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
            if (self.funding_destination != FeeTypeFundingDestinationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, FeeTypeFundingDestinationDto.Serializer.INSTANCE, self.funding_destination);
            }
            if (self.fee_charge_event_type != FeeChargeEventTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, FeeChargeEventTypeDto.Serializer.INSTANCE, self.fee_charge_event_type);
            }
            boolean z3 = self.supports_default_fees;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 6, z3);
            }
            LocalityDto localityDto = self.locality;
            if (localityDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, LocalityDto.Serializer.INSTANCE, localityDto);
            }
            ExchangeSourceDto exchangeSourceDto = self.exchange_source;
            if (exchangeSourceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ExchangeSourceDto.Serializer.INSTANCE, exchangeSourceDto);
            }
        }

        public Surrogate(String fee_type_name, String description, boolean z, boolean z2, FeeTypeFundingDestinationDto funding_destination, FeeChargeEventTypeDto fee_charge_event_type, boolean z3, LocalityDto localityDto, ExchangeSourceDto exchangeSourceDto) {
            Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(funding_destination, "funding_destination");
            Intrinsics.checkNotNullParameter(fee_charge_event_type, "fee_charge_event_type");
            this.fee_type_name = fee_type_name;
            this.description = description;
            this.is_active = z;
            this.allow_override_schedules = z2;
            this.funding_destination = funding_destination;
            this.fee_charge_event_type = fee_charge_event_type;
            this.supports_default_fees = z3;
            this.locality = localityDto;
            this.exchange_source = exchangeSourceDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, boolean z2, FeeTypeFundingDestinationDto feeTypeFundingDestinationDto, FeeChargeEventTypeDto feeChargeEventTypeDto, boolean z3, LocalityDto localityDto, ExchangeSourceDto exchangeSourceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? FeeTypeFundingDestinationDto.INSTANCE.getZeroValue() : feeTypeFundingDestinationDto, (i & 32) != 0 ? FeeChargeEventTypeDto.INSTANCE.getZeroValue() : feeChargeEventTypeDto, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : localityDto, (i & 256) != 0 ? null : exchangeSourceDto);
        }

        public final String getFee_type_name() {
            return this.fee_type_name;
        }

        public final String getDescription() {
            return this.description;
        }

        public final boolean is_active() {
            return this.is_active;
        }

        public final boolean getAllow_override_schedules() {
            return this.allow_override_schedules;
        }

        public final FeeTypeFundingDestinationDto getFunding_destination() {
            return this.funding_destination;
        }

        public final FeeChargeEventTypeDto getFee_charge_event_type() {
            return this.fee_charge_event_type;
        }

        public final boolean getSupports_default_fees() {
            return this.supports_default_fees;
        }

        public final LocalityDto getLocality() {
            return this.locality;
        }

        public final ExchangeSourceDto getExchange_source() {
            return this.exchange_source;
        }
    }

    /* compiled from: FeeTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "Lcom/robinhood/ceres/v1/FeeTypeInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeTypeInfoDto, FeeTypeInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeTypeInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTypeInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeTypeInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeTypeInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeTypeInfo> getProtoAdapter() {
            return FeeTypeInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTypeInfoDto getZeroValue() {
            return FeeTypeInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeTypeInfoDto fromProto(FeeTypeInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String fee_type_name = proto.getFee_type_name();
            String description = proto.getDescription();
            boolean is_active = proto.getIs_active();
            boolean allow_override_schedules = proto.getAllow_override_schedules();
            FeeTypeFundingDestinationDto feeTypeFundingDestinationDtoFromProto = FeeTypeFundingDestinationDto.INSTANCE.fromProto(proto.getFunding_destination());
            FeeChargeEventTypeDto feeChargeEventTypeDtoFromProto = FeeChargeEventTypeDto.INSTANCE.fromProto(proto.getFee_charge_event_type());
            boolean supports_default_fees = proto.getSupports_default_fees();
            Locality locality = proto.getLocality();
            DefaultConstructorMarker defaultConstructorMarker = null;
            LocalityDto localityDtoFromProto = locality != null ? LocalityDto.INSTANCE.fromProto(locality) : null;
            ExchangeSource exchange_source = proto.getExchange_source();
            return new FeeTypeInfoDto(new Surrogate(fee_type_name, description, is_active, allow_override_schedules, feeTypeFundingDestinationDtoFromProto, feeChargeEventTypeDtoFromProto, supports_default_fees, localityDtoFromProto, exchange_source != null ? ExchangeSourceDto.INSTANCE.fromProto(exchange_source) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FeeTypeInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeTypeInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeTypeInfoDto(null, null, false, false, null, null, false, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FeeTypeInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeTypeInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FeeTypeInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeTypeInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeTypeInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeTypeInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeTypeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FeeTypeInfoDto";
        }
    }
}
