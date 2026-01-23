package com.robinhood.android.transfers.p271ui.p272v2.alerts;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ValidationAlertArgs.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertArgs;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "alertInfo", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "leavingEditMode", "", "<init>", "(Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;Z)V", "getAlertInfo", "()Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "getLeavingEditMode", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ValidationAlertArgs implements Parcelable, DialogFragmentKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ValidationAlertArgs> CREATOR = new Creator();
    private final TransferValidationErrorDetailsDto alertInfo;
    private final boolean leavingEditMode;

    /* compiled from: ValidationAlertArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<ValidationAlertArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationAlertArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ValidationAlertArgs((TransferValidationErrorDetailsDto) parcel.readParcelable(ValidationAlertArgs.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidationAlertArgs[] newArray(int i) {
            return new ValidationAlertArgs[i];
        }
    }

    public static /* synthetic */ ValidationAlertArgs copy$default(ValidationAlertArgs validationAlertArgs, TransferValidationErrorDetailsDto transferValidationErrorDetailsDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transferValidationErrorDetailsDto = validationAlertArgs.alertInfo;
        }
        if ((i & 2) != 0) {
            z = validationAlertArgs.leavingEditMode;
        }
        return validationAlertArgs.copy(transferValidationErrorDetailsDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferValidationErrorDetailsDto getAlertInfo() {
        return this.alertInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLeavingEditMode() {
        return this.leavingEditMode;
    }

    public final ValidationAlertArgs copy(TransferValidationErrorDetailsDto alertInfo, boolean leavingEditMode) {
        Intrinsics.checkNotNullParameter(alertInfo, "alertInfo");
        return new ValidationAlertArgs(alertInfo, leavingEditMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationAlertArgs)) {
            return false;
        }
        ValidationAlertArgs validationAlertArgs = (ValidationAlertArgs) other;
        return Intrinsics.areEqual(this.alertInfo, validationAlertArgs.alertInfo) && this.leavingEditMode == validationAlertArgs.leavingEditMode;
    }

    public int hashCode() {
        return (this.alertInfo.hashCode() * 31) + Boolean.hashCode(this.leavingEditMode);
    }

    public String toString() {
        return "ValidationAlertArgs(alertInfo=" + this.alertInfo + ", leavingEditMode=" + this.leavingEditMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.alertInfo, flags);
        dest.writeInt(this.leavingEditMode ? 1 : 0);
    }

    public ValidationAlertArgs(TransferValidationErrorDetailsDto alertInfo, boolean z) {
        Intrinsics.checkNotNullParameter(alertInfo, "alertInfo");
        this.alertInfo = alertInfo;
        this.leavingEditMode = z;
    }

    public final TransferValidationErrorDetailsDto getAlertInfo() {
        return this.alertInfo;
    }

    public final boolean getLeavingEditMode() {
        return this.leavingEditMode;
    }
}
