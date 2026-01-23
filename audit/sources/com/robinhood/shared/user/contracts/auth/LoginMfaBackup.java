package com.robinhood.shared.user.contracts.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.login.LoginStatus;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginMfaBackup.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/LoginMfaBackup;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "<init>", "(Lcom/robinhood/login/LoginStatus;)V", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class LoginMfaBackup implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<LoginMfaBackup> CREATOR = new Creator();
    private final LoginStatus loginStatus;

    /* compiled from: LoginMfaBackup.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/LoginMfaBackup$Callbacks;", "", "onBackupAuthenticated", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public interface Callbacks {
        void onBackupAuthenticated(UUID challengeId);
    }

    /* compiled from: LoginMfaBackup.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<LoginMfaBackup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginMfaBackup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoginMfaBackup((LoginStatus) parcel.readParcelable(LoginMfaBackup.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginMfaBackup[] newArray(int i) {
            return new LoginMfaBackup[i];
        }
    }

    public static /* synthetic */ LoginMfaBackup copy$default(LoginMfaBackup loginMfaBackup, LoginStatus loginStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            loginStatus = loginMfaBackup.loginStatus;
        }
        return loginMfaBackup.copy(loginStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final LoginStatus getLoginStatus() {
        return this.loginStatus;
    }

    public final LoginMfaBackup copy(LoginStatus loginStatus) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        return new LoginMfaBackup(loginStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoginMfaBackup) && Intrinsics.areEqual(this.loginStatus, ((LoginMfaBackup) other).loginStatus);
    }

    public int hashCode() {
        return this.loginStatus.hashCode();
    }

    public String toString() {
        return "LoginMfaBackup(loginStatus=" + this.loginStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.loginStatus, flags);
    }

    public LoginMfaBackup(LoginStatus loginStatus) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        this.loginStatus = loginStatus;
    }

    public final LoginStatus getLoginStatus() {
        return this.loginStatus;
    }
}
