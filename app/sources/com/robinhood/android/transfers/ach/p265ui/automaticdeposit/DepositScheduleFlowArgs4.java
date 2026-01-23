package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.DepositSchedule;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositScheduleFlowArgs.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;", "Landroid/os/Parcelable;", "depositSchedule", "Lcom/robinhood/models/db/DepositSchedule;", "achRelationshipId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/db/DepositSchedule;Ljava/util/UUID;)V", "getDepositSchedule", "()Lcom/robinhood/models/db/DepositSchedule;", "getAchRelationshipId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.TimelineScreenArgs, reason: use source file name */
/* loaded from: classes9.dex */
public final class DepositScheduleFlowArgs4 implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DepositScheduleFlowArgs4> CREATOR = new Creator();
    private final UUID achRelationshipId;
    private final DepositSchedule depositSchedule;

    /* compiled from: DepositScheduleFlowArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.TimelineScreenArgs$Creator */
    public static final class Creator implements Parcelable.Creator<DepositScheduleFlowArgs4> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositScheduleFlowArgs4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DepositScheduleFlowArgs4((DepositSchedule) parcel.readParcelable(DepositScheduleFlowArgs4.class.getClassLoader()), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositScheduleFlowArgs4[] newArray(int i) {
            return new DepositScheduleFlowArgs4[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.depositSchedule, flags);
        dest.writeSerializable(this.achRelationshipId);
    }

    public DepositScheduleFlowArgs4(DepositSchedule depositSchedule, UUID achRelationshipId) {
        Intrinsics.checkNotNullParameter(depositSchedule, "depositSchedule");
        Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
        this.depositSchedule = depositSchedule;
        this.achRelationshipId = achRelationshipId;
    }

    public final DepositSchedule getDepositSchedule() {
        return this.depositSchedule;
    }

    public final UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }
}
