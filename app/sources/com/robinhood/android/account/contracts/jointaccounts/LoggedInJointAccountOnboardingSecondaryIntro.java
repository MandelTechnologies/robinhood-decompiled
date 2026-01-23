package com.robinhood.android.account.contracts.jointaccounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountKeys.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/jointaccounts/LoggedInJointAccountOnboardingSecondaryIntro;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "invitationId", "", "<init>", "(Ljava/lang/String;)V", "getInvitationId", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LoggedInJointAccountOnboardingSecondaryIntro implements TabFragmentKey {
    public static final Parcelable.Creator<LoggedInJointAccountOnboardingSecondaryIntro> CREATOR = new Creator();
    private final String invitationId;

    /* compiled from: JointAccountKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<LoggedInJointAccountOnboardingSecondaryIntro> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoggedInJointAccountOnboardingSecondaryIntro createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoggedInJointAccountOnboardingSecondaryIntro(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoggedInJointAccountOnboardingSecondaryIntro[] newArray(int i) {
            return new LoggedInJointAccountOnboardingSecondaryIntro[i];
        }
    }

    public static /* synthetic */ LoggedInJointAccountOnboardingSecondaryIntro copy$default(LoggedInJointAccountOnboardingSecondaryIntro loggedInJointAccountOnboardingSecondaryIntro, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loggedInJointAccountOnboardingSecondaryIntro.invitationId;
        }
        return loggedInJointAccountOnboardingSecondaryIntro.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInvitationId() {
        return this.invitationId;
    }

    public final LoggedInJointAccountOnboardingSecondaryIntro copy(String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        return new LoggedInJointAccountOnboardingSecondaryIntro(invitationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoggedInJointAccountOnboardingSecondaryIntro) && Intrinsics.areEqual(this.invitationId, ((LoggedInJointAccountOnboardingSecondaryIntro) other).invitationId);
    }

    public int hashCode() {
        return this.invitationId.hashCode();
    }

    public String toString() {
        return "LoggedInJointAccountOnboardingSecondaryIntro(invitationId=" + this.invitationId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.invitationId);
    }

    public LoggedInJointAccountOnboardingSecondaryIntro(String invitationId) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        this.invitationId = invitationId;
    }

    public final String getInvitationId() {
        return this.invitationId;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
