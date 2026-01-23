package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.ManualCashCorrectionDirectionDto;
import com.robinhood.ceres.p284v1.ManualCashCorrectionReasonDto;
import com.robinhood.ceres.p284v1.ManualCashCorrectionStatusDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FuturesManualCashCorrectionDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004@ABCB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u009d\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u001cJ\u009a\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\tJ\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u00020\tH\u0016J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000209H\u0016J\b\u0010?\u001a\u000209H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001e¨\u0006D"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesManualCashCorrection;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Surrogate;)V", "id", "", "account_id", "amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "reason", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "direction", "Lcom/robinhood/ceres/v1/ManualCashCorrectionDirectionDto;", "employee_alias", "notes", "status", "Lcom/robinhood/ceres/v1/ManualCashCorrectionStatusDto;", "trade_date", "Lcom/robinhood/rosetta/common/DateDto;", "ref_id", "created_at", "updated_at", "account_number", "rhs_account_number", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;Lcom/robinhood/ceres/v1/ManualCashCorrectionDirectionDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ManualCashCorrectionStatusDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAccount_id", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getReason", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "getDirection", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionDirectionDto;", "getEmployee_alias", "getNotes", "getStatus", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionStatusDto;", "getTrade_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getRef_id", "getCreated_at", "getUpdated_at", "getAccount_number", "getRhs_account_number", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesManualCashCorrectionDto implements Dto3<FuturesManualCashCorrection>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesManualCashCorrectionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesManualCashCorrectionDto, FuturesManualCashCorrection>> binaryBase64Serializer$delegate;
    private static final FuturesManualCashCorrectionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesManualCashCorrectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesManualCashCorrectionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final ManualCashCorrectionReasonDto getReason() {
        return this.surrogate.getReason();
    }

    public final ManualCashCorrectionDirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final String getEmployee_alias() {
        return this.surrogate.getEmployee_alias();
    }

    public final String getNotes() {
        return this.surrogate.getNotes();
    }

    public final ManualCashCorrectionStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final DateDto getTrade_date() {
        return this.surrogate.getTrade_date();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public /* synthetic */ FuturesManualCashCorrectionDto(String str, String str2, MoneyDto moneyDto, ManualCashCorrectionReasonDto manualCashCorrectionReasonDto, ManualCashCorrectionDirectionDto manualCashCorrectionDirectionDto, String str3, String str4, ManualCashCorrectionStatusDto manualCashCorrectionStatusDto, DateDto dateDto, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? ManualCashCorrectionReasonDto.INSTANCE.getZeroValue() : manualCashCorrectionReasonDto, (i & 16) != 0 ? ManualCashCorrectionDirectionDto.INSTANCE.getZeroValue() : manualCashCorrectionDirectionDto, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? ManualCashCorrectionStatusDto.INSTANCE.getZeroValue() : manualCashCorrectionStatusDto, (i & 256) != 0 ? null : dateDto, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) == 0 ? str8 : "", (i & 8192) != 0 ? null : str9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesManualCashCorrectionDto(String id, String account_id, MoneyDto moneyDto, ManualCashCorrectionReasonDto reason, ManualCashCorrectionDirectionDto direction, String employee_alias, String str, ManualCashCorrectionStatusDto status, DateDto dateDto, String ref_id, String created_at, String updated_at, String account_number, String str2) {
        this(new Surrogate(id, account_id, moneyDto, reason, direction, employee_alias, str, status, dateDto, ref_id, created_at, updated_at, account_number, str2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
    }

    public final FuturesManualCashCorrectionDto copy(String id, String account_id, MoneyDto amount, ManualCashCorrectionReasonDto reason, ManualCashCorrectionDirectionDto direction, String employee_alias, String notes, ManualCashCorrectionStatusDto status, DateDto trade_date, String ref_id, String created_at, String updated_at, String account_number, String rhs_account_number) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        return new FuturesManualCashCorrectionDto(new Surrogate(id, account_id, amount, reason, direction, employee_alias, notes, status, trade_date, ref_id, created_at, updated_at, account_number, rhs_account_number));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesManualCashCorrection toProto() {
        String id = this.surrogate.getId();
        String account_id = this.surrogate.getAccount_id();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        ManualCashCorrectionReason manualCashCorrectionReason = (ManualCashCorrectionReason) this.surrogate.getReason().toProto();
        ManualCashCorrectionDirection manualCashCorrectionDirection = (ManualCashCorrectionDirection) this.surrogate.getDirection().toProto();
        String employee_alias = this.surrogate.getEmployee_alias();
        String notes = this.surrogate.getNotes();
        ManualCashCorrectionStatus manualCashCorrectionStatus = (ManualCashCorrectionStatus) this.surrogate.getStatus().toProto();
        DateDto trade_date = this.surrogate.getTrade_date();
        return new FuturesManualCashCorrection(id, account_id, proto, manualCashCorrectionReason, manualCashCorrectionDirection, employee_alias, notes, manualCashCorrectionStatus, trade_date != null ? trade_date.toProto() : null, this.surrogate.getRef_id(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), this.surrogate.getAccount_number(), this.surrogate.getRhs_account_number(), null, 16384, null);
    }

    public String toString() {
        return "[FuturesManualCashCorrectionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesManualCashCorrectionDto) && Intrinsics.areEqual(((FuturesManualCashCorrectionDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ]2\u00020\u0001:\u0002\\]B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017B§\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0016\u0010\u001cJ\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u000eHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009d\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u0019HÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001J%\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0001¢\u0006\u0002\b[R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010(R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010+R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010 R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u00102R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001e\u001a\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010 R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001e\u001a\u0004\b;\u0010 R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001e\u001a\u0004\b=\u0010 R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\u001e\u001a\u0004\b?\u0010 ¨\u0006^"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Surrogate;", "", "id", "", "account_id", "amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "reason", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "direction", "Lcom/robinhood/ceres/v1/ManualCashCorrectionDirectionDto;", "employee_alias", "notes", "status", "Lcom/robinhood/ceres/v1/ManualCashCorrectionStatusDto;", "trade_date", "Lcom/robinhood/rosetta/common/DateDto;", "ref_id", "created_at", "updated_at", "account_number", "rhs_account_number", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;Lcom/robinhood/ceres/v1/ManualCashCorrectionDirectionDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ManualCashCorrectionStatusDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;Lcom/robinhood/ceres/v1/ManualCashCorrectionDirectionDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ManualCashCorrectionStatusDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getAccount_id$annotations", "getAccount_id", "getAmount$annotations", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getReason$annotations", "getReason", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionReasonDto;", "getDirection$annotations", "getDirection", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionDirectionDto;", "getEmployee_alias$annotations", "getEmployee_alias", "getNotes$annotations", "getNotes", "getStatus$annotations", "getStatus", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionStatusDto;", "getTrade_date$annotations", "getTrade_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getRef_id$annotations", "getRef_id", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "getAccount_number$annotations", "getAccount_number", "getRhs_account_number$annotations", "getRhs_account_number", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String account_number;
        private final MoneyDto amount;
        private final String created_at;
        private final ManualCashCorrectionDirectionDto direction;
        private final String employee_alias;
        private final String id;
        private final String notes;
        private final ManualCashCorrectionReasonDto reason;
        private final String ref_id;
        private final String rhs_account_number;
        private final ManualCashCorrectionStatusDto status;
        private final DateDto trade_date;
        private final String updated_at;

        public Surrogate() {
            this((String) null, (String) null, (MoneyDto) null, (ManualCashCorrectionReasonDto) null, (ManualCashCorrectionDirectionDto) null, (String) null, (String) null, (ManualCashCorrectionStatusDto) null, (DateDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("employeeAlias")
        @JsonAnnotations2(names = {"employee_alias"})
        public static /* synthetic */ void getEmployee_alias$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("notes")
        @JsonAnnotations2(names = {"notes"})
        public static /* synthetic */ void getNotes$annotations() {
        }

        @SerialName("reason")
        @JsonAnnotations2(names = {"reason"})
        public static /* synthetic */ void getReason$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("tradeDate")
        @JsonAnnotations2(names = {"trade_date"})
        public static /* synthetic */ void getTrade_date$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component12, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component13, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component14, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final ManualCashCorrectionReasonDto getReason() {
            return this.reason;
        }

        /* renamed from: component5, reason: from getter */
        public final ManualCashCorrectionDirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEmployee_alias() {
            return this.employee_alias;
        }

        /* renamed from: component7, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* renamed from: component8, reason: from getter */
        public final ManualCashCorrectionStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component9, reason: from getter */
        public final DateDto getTrade_date() {
            return this.trade_date;
        }

        public final Surrogate copy(String id, String account_id, MoneyDto amount, ManualCashCorrectionReasonDto reason, ManualCashCorrectionDirectionDto direction, String employee_alias, String notes, ManualCashCorrectionStatusDto status, DateDto trade_date, String ref_id, String created_at, String updated_at, String account_number, String rhs_account_number) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            return new Surrogate(id, account_id, amount, reason, direction, employee_alias, notes, status, trade_date, ref_id, created_at, updated_at, account_number, rhs_account_number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.amount, surrogate.amount) && this.reason == surrogate.reason && this.direction == surrogate.direction && Intrinsics.areEqual(this.employee_alias, surrogate.employee_alias) && Intrinsics.areEqual(this.notes, surrogate.notes) && this.status == surrogate.status && Intrinsics.areEqual(this.trade_date, surrogate.trade_date) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.account_id.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (((((((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.reason.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.employee_alias.hashCode()) * 31;
            String str = this.notes;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31;
            DateDto dateDto = this.trade_date;
            int iHashCode4 = (((((((((iHashCode3 + (dateDto == null ? 0 : dateDto.hashCode())) * 31) + this.ref_id.hashCode()) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.account_number.hashCode()) * 31;
            String str2 = this.rhs_account_number;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_id=" + this.account_id + ", amount=" + this.amount + ", reason=" + this.reason + ", direction=" + this.direction + ", employee_alias=" + this.employee_alias + ", notes=" + this.notes + ", status=" + this.status + ", trade_date=" + this.trade_date + ", ref_id=" + this.ref_id + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", account_number=" + this.account_number + ", rhs_account_number=" + this.rhs_account_number + ")";
        }

        /* compiled from: FuturesManualCashCorrectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesManualCashCorrectionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, MoneyDto moneyDto, ManualCashCorrectionReasonDto manualCashCorrectionReasonDto, ManualCashCorrectionDirectionDto manualCashCorrectionDirectionDto, String str3, String str4, ManualCashCorrectionStatusDto manualCashCorrectionStatusDto, DateDto dateDto, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.reason = ManualCashCorrectionReasonDto.INSTANCE.getZeroValue();
            } else {
                this.reason = manualCashCorrectionReasonDto;
            }
            if ((i & 16) == 0) {
                this.direction = ManualCashCorrectionDirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = manualCashCorrectionDirectionDto;
            }
            if ((i & 32) == 0) {
                this.employee_alias = "";
            } else {
                this.employee_alias = str3;
            }
            if ((i & 64) == 0) {
                this.notes = null;
            } else {
                this.notes = str4;
            }
            if ((i & 128) == 0) {
                this.status = ManualCashCorrectionStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = manualCashCorrectionStatusDto;
            }
            if ((i & 256) == 0) {
                this.trade_date = null;
            } else {
                this.trade_date = dateDto;
            }
            if ((i & 512) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str5;
            }
            if ((i & 1024) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str6;
            }
            if ((i & 2048) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str7;
            }
            if ((i & 4096) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str8;
            }
            if ((i & 8192) == 0) {
                this.rhs_account_number = null;
            } else {
                this.rhs_account_number = str9;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.reason != ManualCashCorrectionReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ManualCashCorrectionReasonDto.Serializer.INSTANCE, self.reason);
            }
            if (self.direction != ManualCashCorrectionDirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, ManualCashCorrectionDirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (!Intrinsics.areEqual(self.employee_alias, "")) {
                output.encodeStringElement(serialDesc, 5, self.employee_alias);
            }
            String str = self.notes;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
            if (self.status != ManualCashCorrectionStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, ManualCashCorrectionStatusDto.Serializer.INSTANCE, self.status);
            }
            DateDto dateDto = self.trade_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DateDto.Serializer.INSTANCE, dateDto);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 10, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 11, self.updated_at);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 12, self.account_number);
            }
            String str2 = self.rhs_account_number;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(String id, String account_id, MoneyDto moneyDto, ManualCashCorrectionReasonDto reason, ManualCashCorrectionDirectionDto direction, String employee_alias, String str, ManualCashCorrectionStatusDto status, DateDto dateDto, String ref_id, String created_at, String updated_at, String account_number, String str2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            this.id = id;
            this.account_id = account_id;
            this.amount = moneyDto;
            this.reason = reason;
            this.direction = direction;
            this.employee_alias = employee_alias;
            this.notes = str;
            this.status = status;
            this.trade_date = dateDto;
            this.ref_id = ref_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.account_number = account_number;
            this.rhs_account_number = str2;
        }

        public /* synthetic */ Surrogate(String str, String str2, MoneyDto moneyDto, ManualCashCorrectionReasonDto manualCashCorrectionReasonDto, ManualCashCorrectionDirectionDto manualCashCorrectionDirectionDto, String str3, String str4, ManualCashCorrectionStatusDto manualCashCorrectionStatusDto, DateDto dateDto, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? ManualCashCorrectionReasonDto.INSTANCE.getZeroValue() : manualCashCorrectionReasonDto, (i & 16) != 0 ? ManualCashCorrectionDirectionDto.INSTANCE.getZeroValue() : manualCashCorrectionDirectionDto, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? ManualCashCorrectionStatusDto.INSTANCE.getZeroValue() : manualCashCorrectionStatusDto, (i & 256) != 0 ? null : dateDto, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) == 0 ? str8 : "", (i & 8192) != 0 ? null : str9);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final ManualCashCorrectionReasonDto getReason() {
            return this.reason;
        }

        public final ManualCashCorrectionDirectionDto getDirection() {
            return this.direction;
        }

        public final String getEmployee_alias() {
            return this.employee_alias;
        }

        public final String getNotes() {
            return this.notes;
        }

        public final ManualCashCorrectionStatusDto getStatus() {
            return this.status;
        }

        public final DateDto getTrade_date() {
            return this.trade_date;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }
    }

    /* compiled from: FuturesManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto;", "Lcom/robinhood/ceres/v1/FuturesManualCashCorrection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesManualCashCorrectionDto, FuturesManualCashCorrection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesManualCashCorrectionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesManualCashCorrectionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesManualCashCorrectionDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesManualCashCorrectionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesManualCashCorrection> getProtoAdapter() {
            return FuturesManualCashCorrection.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesManualCashCorrectionDto getZeroValue() {
            return FuturesManualCashCorrectionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesManualCashCorrectionDto fromProto(FuturesManualCashCorrection proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_id = proto.getAccount_id();
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            ManualCashCorrectionReasonDto manualCashCorrectionReasonDtoFromProto = ManualCashCorrectionReasonDto.INSTANCE.fromProto(proto.getReason());
            ManualCashCorrectionDirectionDto manualCashCorrectionDirectionDtoFromProto = ManualCashCorrectionDirectionDto.INSTANCE.fromProto(proto.getDirection());
            String employee_alias = proto.getEmployee_alias();
            String notes = proto.getNotes();
            ManualCashCorrectionStatusDto manualCashCorrectionStatusDtoFromProto = ManualCashCorrectionStatusDto.INSTANCE.fromProto(proto.getStatus());
            Date trade_date = proto.getTrade_date();
            return new FuturesManualCashCorrectionDto(new Surrogate(id, account_id, moneyDtoFromProto, manualCashCorrectionReasonDtoFromProto, manualCashCorrectionDirectionDtoFromProto, employee_alias, notes, manualCashCorrectionStatusDtoFromProto, trade_date != null ? DateDto.INSTANCE.fromProto(trade_date) : null, proto.getRef_id(), proto.getCreated_at(), proto.getUpdated_at(), proto.getAccount_number(), proto.getRhs_account_number()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesManualCashCorrectionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesManualCashCorrectionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesManualCashCorrectionDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesManualCashCorrectionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesManualCashCorrection", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesManualCashCorrectionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesManualCashCorrectionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesManualCashCorrectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesManualCashCorrectionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesManualCashCorrectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesManualCashCorrectionDto";
        }
    }
}
