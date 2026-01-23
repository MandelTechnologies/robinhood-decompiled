package com.robinhood.android.onboarding.p205ui.postsignup.helm;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.util.Money;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelmState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/helm/HelmState;", "Landroid/os/Parcelable;", "hasCompletedBankLinking", "", "completedDepositAmount", "Lcom/robinhood/models/util/Money;", "currentFlowId", "", "<init>", "(ZLcom/robinhood/models/util/Money;Ljava/lang/String;)V", "getHasCompletedBankLinking", "()Z", "getCompletedDepositAmount", "()Lcom/robinhood/models/util/Money;", "getCurrentFlowId", "()Ljava/lang/String;", "getFlowId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HelmState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HelmState> CREATOR = new Creator();
    private final Money completedDepositAmount;
    private final String currentFlowId;
    private final boolean hasCompletedBankLinking;

    /* compiled from: HelmState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<HelmState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelmState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HelmState(parcel.readInt() != 0, (Money) parcel.readParcelable(HelmState.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelmState[] newArray(int i) {
            return new HelmState[i];
        }
    }

    public HelmState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ HelmState copy$default(HelmState helmState, boolean z, Money money, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = helmState.hasCompletedBankLinking;
        }
        if ((i & 2) != 0) {
            money = helmState.completedDepositAmount;
        }
        if ((i & 4) != 0) {
            str = helmState.currentFlowId;
        }
        return helmState.copy(z, money, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasCompletedBankLinking() {
        return this.hasCompletedBankLinking;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getCompletedDepositAmount() {
        return this.completedDepositAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrentFlowId() {
        return this.currentFlowId;
    }

    public final HelmState copy(boolean hasCompletedBankLinking, Money completedDepositAmount, String currentFlowId) {
        return new HelmState(hasCompletedBankLinking, completedDepositAmount, currentFlowId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelmState)) {
            return false;
        }
        HelmState helmState = (HelmState) other;
        return this.hasCompletedBankLinking == helmState.hasCompletedBankLinking && Intrinsics.areEqual(this.completedDepositAmount, helmState.completedDepositAmount) && Intrinsics.areEqual(this.currentFlowId, helmState.currentFlowId);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasCompletedBankLinking) * 31;
        Money money = this.completedDepositAmount;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.currentFlowId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HelmState(hasCompletedBankLinking=" + this.hasCompletedBankLinking + ", completedDepositAmount=" + this.completedDepositAmount + ", currentFlowId=" + this.currentFlowId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hasCompletedBankLinking ? 1 : 0);
        dest.writeParcelable(this.completedDepositAmount, flags);
        dest.writeString(this.currentFlowId);
    }

    public HelmState(boolean z, Money money, String str) {
        this.hasCompletedBankLinking = z;
        this.completedDepositAmount = money;
        this.currentFlowId = str;
    }

    public /* synthetic */ HelmState(boolean z, Money money, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : str);
    }

    public final boolean getHasCompletedBankLinking() {
        return this.hasCompletedBankLinking;
    }

    public final Money getCompletedDepositAmount() {
        return this.completedDepositAmount;
    }

    public final String getCurrentFlowId() {
        return this.currentFlowId;
    }

    public final String getFlowId() {
        String str = this.currentFlowId;
        if (str == null || str.length() == 0) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("currentFlowId is empty"), true, null, 4, null);
        }
        String str2 = this.currentFlowId;
        return str2 == null ? "" : str2;
    }
}
