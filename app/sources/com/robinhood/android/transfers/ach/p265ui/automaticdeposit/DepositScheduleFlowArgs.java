package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.ApiDepositSchedule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: DepositScheduleFlowArgs.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/EnterAmountArgs;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "<init>", "(Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;Lj$/time/LocalDate;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "getFrequency", "()Lcom/robinhood/models/api/ApiDepositSchedule$Frequency;", "Lj$/time/LocalDate;", "getStartDate", "()Lj$/time/LocalDate;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterAmountArgs, reason: use source file name */
/* loaded from: classes9.dex */
public final class DepositScheduleFlowArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DepositScheduleFlowArgs> CREATOR = new Creator();
    private final ApiDepositSchedule.Frequency frequency;
    private final LocalDate startDate;

    /* compiled from: DepositScheduleFlowArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.EnterAmountArgs$Creator */
    public static final class Creator implements Parcelable.Creator<DepositScheduleFlowArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositScheduleFlowArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DepositScheduleFlowArgs(ApiDepositSchedule.Frequency.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositScheduleFlowArgs[] newArray(int i) {
            return new DepositScheduleFlowArgs[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.frequency.name());
        dest.writeSerializable(this.startDate);
    }

    public DepositScheduleFlowArgs(ApiDepositSchedule.Frequency frequency, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.frequency = frequency;
        this.startDate = startDate;
    }

    public final ApiDepositSchedule.Frequency getFrequency() {
        return this.frequency;
    }

    public final LocalDate getStartDate() {
        return this.startDate;
    }
}
