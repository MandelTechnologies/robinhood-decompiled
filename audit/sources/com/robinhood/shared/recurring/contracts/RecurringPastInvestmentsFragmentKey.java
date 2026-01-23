package com.robinhood.shared.recurring.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringPastInvestmentsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/recurring/contracts/RecurringPastInvestmentsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "investmentScheduleId", "Ljava/util/UUID;", "isCrypto", "", "<init>", "(Ljava/util/UUID;Z)V", "getInvestmentScheduleId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecurringPastInvestmentsFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<RecurringPastInvestmentsFragmentKey> CREATOR = new Creator();
    private final UUID investmentScheduleId;
    private final boolean isCrypto;

    /* compiled from: RecurringPastInvestmentsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringPastInvestmentsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringPastInvestmentsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringPastInvestmentsFragmentKey((UUID) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringPastInvestmentsFragmentKey[] newArray(int i) {
            return new RecurringPastInvestmentsFragmentKey[i];
        }
    }

    public static /* synthetic */ RecurringPastInvestmentsFragmentKey copy$default(RecurringPastInvestmentsFragmentKey recurringPastInvestmentsFragmentKey, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = recurringPastInvestmentsFragmentKey.investmentScheduleId;
        }
        if ((i & 2) != 0) {
            z = recurringPastInvestmentsFragmentKey.isCrypto;
        }
        return recurringPastInvestmentsFragmentKey.copy(uuid, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    public final RecurringPastInvestmentsFragmentKey copy(UUID investmentScheduleId, boolean isCrypto) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        return new RecurringPastInvestmentsFragmentKey(investmentScheduleId, isCrypto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPastInvestmentsFragmentKey)) {
            return false;
        }
        RecurringPastInvestmentsFragmentKey recurringPastInvestmentsFragmentKey = (RecurringPastInvestmentsFragmentKey) other;
        return Intrinsics.areEqual(this.investmentScheduleId, recurringPastInvestmentsFragmentKey.investmentScheduleId) && this.isCrypto == recurringPastInvestmentsFragmentKey.isCrypto;
    }

    public int hashCode() {
        return (this.investmentScheduleId.hashCode() * 31) + Boolean.hashCode(this.isCrypto);
    }

    public String toString() {
        return "RecurringPastInvestmentsFragmentKey(investmentScheduleId=" + this.investmentScheduleId + ", isCrypto=" + this.isCrypto + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.investmentScheduleId);
        dest.writeInt(this.isCrypto ? 1 : 0);
    }

    public RecurringPastInvestmentsFragmentKey(UUID investmentScheduleId, boolean z) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        this.investmentScheduleId = investmentScheduleId;
        this.isCrypto = z;
    }

    public /* synthetic */ RecurringPastInvestmentsFragmentKey(UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? false : z);
    }

    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }
}
