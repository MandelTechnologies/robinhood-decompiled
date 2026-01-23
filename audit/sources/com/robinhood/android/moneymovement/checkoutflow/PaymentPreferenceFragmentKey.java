package com.robinhood.android.moneymovement.checkoutflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentPreferenceFragmentKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "autoProceed", "", "isDeficitImprovement", "accountToPreselect", "", "backUpAccountId", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "getAutoProceed", "()Z", "getAccountToPreselect", "()Ljava/lang/String;", "getBackUpAccountId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PaymentPreferenceFragmentKey implements FragmentKey {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PaymentPreferenceFragmentKey> CREATOR = new Creator();
    private final String accountToPreselect;
    private final boolean autoProceed;
    private final String backUpAccountId;
    private final boolean isDeficitImprovement;

    /* compiled from: PaymentPreferenceFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<PaymentPreferenceFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentPreferenceFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentPreferenceFragmentKey(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentPreferenceFragmentKey[] newArray(int i) {
            return new PaymentPreferenceFragmentKey[i];
        }
    }

    public PaymentPreferenceFragmentKey() {
        this(false, false, null, null, 15, null);
    }

    public static /* synthetic */ PaymentPreferenceFragmentKey copy$default(PaymentPreferenceFragmentKey paymentPreferenceFragmentKey, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paymentPreferenceFragmentKey.autoProceed;
        }
        if ((i & 2) != 0) {
            z2 = paymentPreferenceFragmentKey.isDeficitImprovement;
        }
        if ((i & 4) != 0) {
            str = paymentPreferenceFragmentKey.accountToPreselect;
        }
        if ((i & 8) != 0) {
            str2 = paymentPreferenceFragmentKey.backUpAccountId;
        }
        return paymentPreferenceFragmentKey.copy(z, z2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAutoProceed() {
        return this.autoProceed;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDeficitImprovement() {
        return this.isDeficitImprovement;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountToPreselect() {
        return this.accountToPreselect;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackUpAccountId() {
        return this.backUpAccountId;
    }

    public final PaymentPreferenceFragmentKey copy(boolean autoProceed, boolean isDeficitImprovement, String accountToPreselect, String backUpAccountId) {
        return new PaymentPreferenceFragmentKey(autoProceed, isDeficitImprovement, accountToPreselect, backUpAccountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPreferenceFragmentKey)) {
            return false;
        }
        PaymentPreferenceFragmentKey paymentPreferenceFragmentKey = (PaymentPreferenceFragmentKey) other;
        return this.autoProceed == paymentPreferenceFragmentKey.autoProceed && this.isDeficitImprovement == paymentPreferenceFragmentKey.isDeficitImprovement && Intrinsics.areEqual(this.accountToPreselect, paymentPreferenceFragmentKey.accountToPreselect) && Intrinsics.areEqual(this.backUpAccountId, paymentPreferenceFragmentKey.backUpAccountId);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.autoProceed) * 31) + Boolean.hashCode(this.isDeficitImprovement)) * 31;
        String str = this.accountToPreselect;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backUpAccountId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PaymentPreferenceFragmentKey(autoProceed=" + this.autoProceed + ", isDeficitImprovement=" + this.isDeficitImprovement + ", accountToPreselect=" + this.accountToPreselect + ", backUpAccountId=" + this.backUpAccountId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.autoProceed ? 1 : 0);
        dest.writeInt(this.isDeficitImprovement ? 1 : 0);
        dest.writeString(this.accountToPreselect);
        dest.writeString(this.backUpAccountId);
    }

    public PaymentPreferenceFragmentKey(boolean z, boolean z2, String str, String str2) {
        this.autoProceed = z;
        this.isDeficitImprovement = z2;
        this.accountToPreselect = str;
        this.backUpAccountId = str2;
    }

    public /* synthetic */ PaymentPreferenceFragmentKey(boolean z, boolean z2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final boolean getAutoProceed() {
        return this.autoProceed;
    }

    public final boolean isDeficitImprovement() {
        return this.isDeficitImprovement;
    }

    public final String getAccountToPreselect() {
        return this.accountToPreselect;
    }

    public final String getBackUpAccountId() {
        return this.backUpAccountId;
    }
}
