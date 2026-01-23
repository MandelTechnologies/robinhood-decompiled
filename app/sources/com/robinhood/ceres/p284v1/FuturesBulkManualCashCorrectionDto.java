package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FuturesBulkManualCashCorrectionDto.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0014Jp\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tJ\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\u000fH\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000fH\u0016J\b\u0010.\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0016¨\u00063"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrection;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Surrogate;)V", "id", "", "file_id", "employee_alias", "ref_id", "notes", "num_cash_corrections_pending", "", "num_cash_corrections_confirmed", "num_cash_corrections_rejected", "detailed_report_file_url", "last_generated_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFile_id", "getEmployee_alias", "getRef_id", "getNotes", "getNum_cash_corrections_pending", "()I", "getNum_cash_corrections_confirmed", "getNum_cash_corrections_rejected", "getDetailed_report_file_url", "getLast_generated_at", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesBulkManualCashCorrectionDto implements Dto3<FuturesBulkManualCashCorrection>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesBulkManualCashCorrectionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesBulkManualCashCorrectionDto, FuturesBulkManualCashCorrection>> binaryBase64Serializer$delegate;
    private static final FuturesBulkManualCashCorrectionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesBulkManualCashCorrectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesBulkManualCashCorrectionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getFile_id() {
        return this.surrogate.getFile_id();
    }

    public final String getEmployee_alias() {
        return this.surrogate.getEmployee_alias();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getNotes() {
        return this.surrogate.getNotes();
    }

    public final int getNum_cash_corrections_pending() {
        return this.surrogate.getNum_cash_corrections_pending();
    }

    public final int getNum_cash_corrections_confirmed() {
        return this.surrogate.getNum_cash_corrections_confirmed();
    }

    public final int getNum_cash_corrections_rejected() {
        return this.surrogate.getNum_cash_corrections_rejected();
    }

    public final String getDetailed_report_file_url() {
        return this.surrogate.getDetailed_report_file_url();
    }

    public final String getLast_generated_at() {
        return this.surrogate.getLast_generated_at();
    }

    public /* synthetic */ FuturesBulkManualCashCorrectionDto(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? null : str6, (i4 & 512) != 0 ? null : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesBulkManualCashCorrectionDto(String id, String file_id, String employee_alias, String ref_id, String str, int i, int i2, int i3, String str2, String str3) {
        this(new Surrogate(id, file_id, employee_alias, ref_id, str, i, i2, i3, str2, str3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
    }

    public static /* synthetic */ FuturesBulkManualCashCorrectionDto copy$default(FuturesBulkManualCashCorrectionDto futuresBulkManualCashCorrectionDto, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = futuresBulkManualCashCorrectionDto.surrogate.getId();
        }
        if ((i4 & 2) != 0) {
            str2 = futuresBulkManualCashCorrectionDto.surrogate.getFile_id();
        }
        if ((i4 & 4) != 0) {
            str3 = futuresBulkManualCashCorrectionDto.surrogate.getEmployee_alias();
        }
        if ((i4 & 8) != 0) {
            str4 = futuresBulkManualCashCorrectionDto.surrogate.getRef_id();
        }
        if ((i4 & 16) != 0) {
            str5 = futuresBulkManualCashCorrectionDto.surrogate.getNotes();
        }
        if ((i4 & 32) != 0) {
            i = futuresBulkManualCashCorrectionDto.surrogate.getNum_cash_corrections_pending();
        }
        if ((i4 & 64) != 0) {
            i2 = futuresBulkManualCashCorrectionDto.surrogate.getNum_cash_corrections_confirmed();
        }
        if ((i4 & 128) != 0) {
            i3 = futuresBulkManualCashCorrectionDto.surrogate.getNum_cash_corrections_rejected();
        }
        if ((i4 & 256) != 0) {
            str6 = futuresBulkManualCashCorrectionDto.surrogate.getDetailed_report_file_url();
        }
        if ((i4 & 512) != 0) {
            str7 = futuresBulkManualCashCorrectionDto.surrogate.getLast_generated_at();
        }
        String str8 = str6;
        String str9 = str7;
        int i5 = i2;
        int i6 = i3;
        String str10 = str5;
        int i7 = i;
        return futuresBulkManualCashCorrectionDto.copy(str, str2, str3, str4, str10, i7, i5, i6, str8, str9);
    }

    public final FuturesBulkManualCashCorrectionDto copy(String id, String file_id, String employee_alias, String ref_id, String notes, int num_cash_corrections_pending, int num_cash_corrections_confirmed, int num_cash_corrections_rejected, String detailed_report_file_url, String last_generated_at) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        return new FuturesBulkManualCashCorrectionDto(new Surrogate(id, file_id, employee_alias, ref_id, notes, num_cash_corrections_pending, num_cash_corrections_confirmed, num_cash_corrections_rejected, detailed_report_file_url, last_generated_at));
    }

    @Override // com.robinhood.idl.Dto
    public FuturesBulkManualCashCorrection toProto() {
        return new FuturesBulkManualCashCorrection(this.surrogate.getId(), this.surrogate.getFile_id(), this.surrogate.getEmployee_alias(), this.surrogate.getRef_id(), this.surrogate.getNotes(), this.surrogate.getNum_cash_corrections_pending(), this.surrogate.getNum_cash_corrections_confirmed(), this.surrogate.getNum_cash_corrections_rejected(), this.surrogate.getDetailed_report_file_url(), this.surrogate.getLast_generated_at(), null, 1024, null);
    }

    public String toString() {
        return "[FuturesBulkManualCashCorrectionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesBulkManualCashCorrectionDto) && Intrinsics.areEqual(((FuturesBulkManualCashCorrectionDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesBulkManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002FGB\u009e\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012By\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0018\u00103\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\u0018\u00104\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\u0018\u00105\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J \u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\u0017\b\u0002\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\tHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J%\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0002\bER\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R+\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010%R+\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010%R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001a¨\u0006H"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Surrogate;", "", "id", "", "file_id", "employee_alias", "ref_id", "notes", "num_cash_corrections_pending", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "num_cash_corrections_confirmed", "num_cash_corrections_rejected", "detailed_report_file_url", "last_generated_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getFile_id$annotations", "getFile_id", "getEmployee_alias$annotations", "getEmployee_alias", "getRef_id$annotations", "getRef_id", "getNotes$annotations", "getNotes", "getNum_cash_corrections_pending$annotations", "getNum_cash_corrections_pending", "()I", "getNum_cash_corrections_confirmed$annotations", "getNum_cash_corrections_confirmed", "getNum_cash_corrections_rejected$annotations", "getNum_cash_corrections_rejected", "getDetailed_report_file_url$annotations", "getDetailed_report_file_url", "getLast_generated_at$annotations", "getLast_generated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String detailed_report_file_url;
        private final String employee_alias;
        private final String file_id;
        private final String id;
        private final String last_generated_at;
        private final String notes;
        private final int num_cash_corrections_confirmed;
        private final int num_cash_corrections_pending;
        private final int num_cash_corrections_rejected;
        private final String ref_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = surrogate.id;
            }
            if ((i4 & 2) != 0) {
                str2 = surrogate.file_id;
            }
            if ((i4 & 4) != 0) {
                str3 = surrogate.employee_alias;
            }
            if ((i4 & 8) != 0) {
                str4 = surrogate.ref_id;
            }
            if ((i4 & 16) != 0) {
                str5 = surrogate.notes;
            }
            if ((i4 & 32) != 0) {
                i = surrogate.num_cash_corrections_pending;
            }
            if ((i4 & 64) != 0) {
                i2 = surrogate.num_cash_corrections_confirmed;
            }
            if ((i4 & 128) != 0) {
                i3 = surrogate.num_cash_corrections_rejected;
            }
            if ((i4 & 256) != 0) {
                str6 = surrogate.detailed_report_file_url;
            }
            if ((i4 & 512) != 0) {
                str7 = surrogate.last_generated_at;
            }
            String str8 = str6;
            String str9 = str7;
            int i5 = i2;
            int i6 = i3;
            String str10 = str5;
            int i7 = i;
            return surrogate.copy(str, str2, str3, str4, str10, i7, i5, i6, str8, str9);
        }

        @SerialName("detailedReportFileUrl")
        @JsonAnnotations2(names = {"detailed_report_file_url"})
        public static /* synthetic */ void getDetailed_report_file_url$annotations() {
        }

        @SerialName("employeeAlias")
        @JsonAnnotations2(names = {"employee_alias"})
        public static /* synthetic */ void getEmployee_alias$annotations() {
        }

        @SerialName("fileId")
        @JsonAnnotations2(names = {"file_id"})
        public static /* synthetic */ void getFile_id$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("lastGeneratedAt")
        @JsonAnnotations2(names = {"last_generated_at"})
        public static /* synthetic */ void getLast_generated_at$annotations() {
        }

        @SerialName("notes")
        @JsonAnnotations2(names = {"notes"})
        public static /* synthetic */ void getNotes$annotations() {
        }

        @SerialName("numCashCorrectionsConfirmed")
        @JsonAnnotations2(names = {"num_cash_corrections_confirmed"})
        public static /* synthetic */ void getNum_cash_corrections_confirmed$annotations() {
        }

        @SerialName("numCashCorrectionsPending")
        @JsonAnnotations2(names = {"num_cash_corrections_pending"})
        public static /* synthetic */ void getNum_cash_corrections_pending$annotations() {
        }

        @SerialName("numCashCorrectionsRejected")
        @JsonAnnotations2(names = {"num_cash_corrections_rejected"})
        public static /* synthetic */ void getNum_cash_corrections_rejected$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getLast_generated_at() {
            return this.last_generated_at;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFile_id() {
            return this.file_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmployee_alias() {
            return this.employee_alias;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* renamed from: component6, reason: from getter */
        public final int getNum_cash_corrections_pending() {
            return this.num_cash_corrections_pending;
        }

        /* renamed from: component7, reason: from getter */
        public final int getNum_cash_corrections_confirmed() {
            return this.num_cash_corrections_confirmed;
        }

        /* renamed from: component8, reason: from getter */
        public final int getNum_cash_corrections_rejected() {
            return this.num_cash_corrections_rejected;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDetailed_report_file_url() {
            return this.detailed_report_file_url;
        }

        public final Surrogate copy(String id, String file_id, String employee_alias, String ref_id, String notes, int num_cash_corrections_pending, int num_cash_corrections_confirmed, int num_cash_corrections_rejected, String detailed_report_file_url, String last_generated_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(file_id, "file_id");
            Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            return new Surrogate(id, file_id, employee_alias, ref_id, notes, num_cash_corrections_pending, num_cash_corrections_confirmed, num_cash_corrections_rejected, detailed_report_file_url, last_generated_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.file_id, surrogate.file_id) && Intrinsics.areEqual(this.employee_alias, surrogate.employee_alias) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.notes, surrogate.notes) && this.num_cash_corrections_pending == surrogate.num_cash_corrections_pending && this.num_cash_corrections_confirmed == surrogate.num_cash_corrections_confirmed && this.num_cash_corrections_rejected == surrogate.num_cash_corrections_rejected && Intrinsics.areEqual(this.detailed_report_file_url, surrogate.detailed_report_file_url) && Intrinsics.areEqual(this.last_generated_at, surrogate.last_generated_at);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.file_id.hashCode()) * 31) + this.employee_alias.hashCode()) * 31) + this.ref_id.hashCode()) * 31;
            String str = this.notes;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.num_cash_corrections_pending)) * 31) + Integer.hashCode(this.num_cash_corrections_confirmed)) * 31) + Integer.hashCode(this.num_cash_corrections_rejected)) * 31;
            String str2 = this.detailed_report_file_url;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last_generated_at;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", file_id=" + this.file_id + ", employee_alias=" + this.employee_alias + ", ref_id=" + this.ref_id + ", notes=" + this.notes + ", num_cash_corrections_pending=" + this.num_cash_corrections_pending + ", num_cash_corrections_confirmed=" + this.num_cash_corrections_confirmed + ", num_cash_corrections_rejected=" + this.num_cash_corrections_rejected + ", detailed_report_file_url=" + this.detailed_report_file_url + ", last_generated_at=" + this.last_generated_at + ")";
        }

        /* compiled from: FuturesBulkManualCashCorrectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesBulkManualCashCorrectionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.file_id = "";
            } else {
                this.file_id = str2;
            }
            if ((i & 4) == 0) {
                this.employee_alias = "";
            } else {
                this.employee_alias = str3;
            }
            if ((i & 8) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str4;
            }
            if ((i & 16) == 0) {
                this.notes = null;
            } else {
                this.notes = str5;
            }
            if ((i & 32) == 0) {
                this.num_cash_corrections_pending = 0;
            } else {
                this.num_cash_corrections_pending = i2;
            }
            if ((i & 64) == 0) {
                this.num_cash_corrections_confirmed = 0;
            } else {
                this.num_cash_corrections_confirmed = i3;
            }
            if ((i & 128) == 0) {
                this.num_cash_corrections_rejected = 0;
            } else {
                this.num_cash_corrections_rejected = i4;
            }
            if ((i & 256) == 0) {
                this.detailed_report_file_url = null;
            } else {
                this.detailed_report_file_url = str6;
            }
            if ((i & 512) == 0) {
                this.last_generated_at = null;
            } else {
                this.last_generated_at = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.file_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.file_id);
            }
            if (!Intrinsics.areEqual(self.employee_alias, "")) {
                output.encodeStringElement(serialDesc, 2, self.employee_alias);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.ref_id);
            }
            String str = self.notes;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            int i = self.num_cash_corrections_pending;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.num_cash_corrections_confirmed;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.num_cash_corrections_rejected;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            String str2 = self.detailed_report_file_url;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.last_generated_at;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str3);
            }
        }

        public Surrogate(String id, String file_id, String employee_alias, String ref_id, String str, int i, int i2, int i3, String str2, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(file_id, "file_id");
            Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            this.id = id;
            this.file_id = file_id;
            this.employee_alias = employee_alias;
            this.ref_id = ref_id;
            this.notes = str;
            this.num_cash_corrections_pending = i;
            this.num_cash_corrections_confirmed = i2;
            this.num_cash_corrections_rejected = i3;
            this.detailed_report_file_url = str2;
            this.last_generated_at = str3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? null : str6, (i4 & 512) != 0 ? null : str7);
        }

        public final String getId() {
            return this.id;
        }

        public final String getFile_id() {
            return this.file_id;
        }

        public final String getEmployee_alias() {
            return this.employee_alias;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getNotes() {
            return this.notes;
        }

        public final int getNum_cash_corrections_pending() {
            return this.num_cash_corrections_pending;
        }

        public final int getNum_cash_corrections_confirmed() {
            return this.num_cash_corrections_confirmed;
        }

        public final int getNum_cash_corrections_rejected() {
            return this.num_cash_corrections_rejected;
        }

        public final String getDetailed_report_file_url() {
            return this.detailed_report_file_url;
        }

        public final String getLast_generated_at() {
            return this.last_generated_at;
        }
    }

    /* compiled from: FuturesBulkManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto;", "Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FuturesBulkManualCashCorrectionDto, FuturesBulkManualCashCorrection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesBulkManualCashCorrectionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesBulkManualCashCorrectionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesBulkManualCashCorrectionDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesBulkManualCashCorrectionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesBulkManualCashCorrection> getProtoAdapter() {
            return FuturesBulkManualCashCorrection.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesBulkManualCashCorrectionDto getZeroValue() {
            return FuturesBulkManualCashCorrectionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesBulkManualCashCorrectionDto fromProto(FuturesBulkManualCashCorrection proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FuturesBulkManualCashCorrectionDto(new Surrogate(proto.getId(), proto.getFile_id(), proto.getEmployee_alias(), proto.getRef_id(), proto.getNotes(), proto.getNum_cash_corrections_pending(), proto.getNum_cash_corrections_confirmed(), proto.getNum_cash_corrections_rejected(), proto.getDetailed_report_file_url(), proto.getLast_generated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesBulkManualCashCorrectionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesBulkManualCashCorrectionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesBulkManualCashCorrectionDto(null, null, null, null, null, 0, 0, 0, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesBulkManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesBulkManualCashCorrectionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesBulkManualCashCorrection", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesBulkManualCashCorrectionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesBulkManualCashCorrectionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesBulkManualCashCorrectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesBulkManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesBulkManualCashCorrectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesBulkManualCashCorrectionDto";
        }
    }
}
