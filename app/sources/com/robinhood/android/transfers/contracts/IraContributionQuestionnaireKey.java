package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IraContributionQuestionnaireKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "launchMode", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;", "allowNoAccounts", "", "<init>", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;Ljava/lang/Boolean;)V", "getLaunchMode", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;", "getAllowNoAccounts", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireLaunchMode;Ljava/lang/Boolean;)Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class IraContributionQuestionnaireKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<IraContributionQuestionnaireKey> CREATOR = new Creator();
    private final Boolean allowNoAccounts;
    private final IraContributionQuestionnaireLaunchMode launchMode;

    /* compiled from: IraContributionQuestionnaireKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<IraContributionQuestionnaireKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IraContributionQuestionnaireKey createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IraContributionQuestionnaireLaunchMode iraContributionQuestionnaireLaunchMode = (IraContributionQuestionnaireLaunchMode) parcel.readParcelable(IraContributionQuestionnaireKey.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IraContributionQuestionnaireKey(iraContributionQuestionnaireLaunchMode, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IraContributionQuestionnaireKey[] newArray(int i) {
            return new IraContributionQuestionnaireKey[i];
        }
    }

    public static /* synthetic */ IraContributionQuestionnaireKey copy$default(IraContributionQuestionnaireKey iraContributionQuestionnaireKey, IraContributionQuestionnaireLaunchMode iraContributionQuestionnaireLaunchMode, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            iraContributionQuestionnaireLaunchMode = iraContributionQuestionnaireKey.launchMode;
        }
        if ((i & 2) != 0) {
            bool = iraContributionQuestionnaireKey.allowNoAccounts;
        }
        return iraContributionQuestionnaireKey.copy(iraContributionQuestionnaireLaunchMode, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final IraContributionQuestionnaireLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getAllowNoAccounts() {
        return this.allowNoAccounts;
    }

    public final IraContributionQuestionnaireKey copy(IraContributionQuestionnaireLaunchMode launchMode, Boolean allowNoAccounts) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new IraContributionQuestionnaireKey(launchMode, allowNoAccounts);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IraContributionQuestionnaireKey)) {
            return false;
        }
        IraContributionQuestionnaireKey iraContributionQuestionnaireKey = (IraContributionQuestionnaireKey) other;
        return Intrinsics.areEqual(this.launchMode, iraContributionQuestionnaireKey.launchMode) && Intrinsics.areEqual(this.allowNoAccounts, iraContributionQuestionnaireKey.allowNoAccounts);
    }

    public int hashCode() {
        int iHashCode = this.launchMode.hashCode() * 31;
        Boolean bool = this.allowNoAccounts;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "IraContributionQuestionnaireKey(launchMode=" + this.launchMode + ", allowNoAccounts=" + this.allowNoAccounts + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.launchMode, flags);
        Boolean bool = this.allowNoAccounts;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public IraContributionQuestionnaireKey(IraContributionQuestionnaireLaunchMode launchMode, Boolean bool) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.launchMode = launchMode;
        this.allowNoAccounts = bool;
    }

    public /* synthetic */ IraContributionQuestionnaireKey(IraContributionQuestionnaireLaunchMode iraContributionQuestionnaireLaunchMode, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iraContributionQuestionnaireLaunchMode, (i & 2) != 0 ? null : bool);
    }

    public final IraContributionQuestionnaireLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final Boolean getAllowNoAccounts() {
        return this.allowNoAccounts;
    }
}
