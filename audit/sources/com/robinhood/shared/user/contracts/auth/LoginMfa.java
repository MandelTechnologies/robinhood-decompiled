package com.robinhood.shared.user.contracts.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.login.LoginStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginMfa.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/LoginMfa;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "loginStatus", "Lcom/robinhood/login/LoginStatus$MfaRequired;", "username", "", "<init>", "(Lcom/robinhood/login/LoginStatus$MfaRequired;Ljava/lang/String;)V", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus$MfaRequired;", "getUsername", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class LoginMfa implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<LoginMfa> CREATOR = new Creator();
    private final LoginStatus.MfaRequired loginStatus;
    private final String username;

    /* compiled from: LoginMfa.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/LoginMfa$Callbacks;", "", "onMfaAuthenticated", "", "mfaUseBackupCode", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "abortMfaFlow", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public interface Callbacks {
        void abortMfaFlow();

        void mfaUseBackupCode(LoginStatus loginStatus);

        void onMfaAuthenticated();
    }

    /* compiled from: LoginMfa.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<LoginMfa> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginMfa createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoginMfa((LoginStatus.MfaRequired) parcel.readParcelable(LoginMfa.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginMfa[] newArray(int i) {
            return new LoginMfa[i];
        }
    }

    public static /* synthetic */ LoginMfa copy$default(LoginMfa loginMfa, LoginStatus.MfaRequired mfaRequired, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mfaRequired = loginMfa.loginStatus;
        }
        if ((i & 2) != 0) {
            str = loginMfa.username;
        }
        return loginMfa.copy(mfaRequired, str);
    }

    /* renamed from: component1, reason: from getter */
    public final LoginStatus.MfaRequired getLoginStatus() {
        return this.loginStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final LoginMfa copy(LoginStatus.MfaRequired loginStatus, String username) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        return new LoginMfa(loginStatus, username);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginMfa)) {
            return false;
        }
        LoginMfa loginMfa = (LoginMfa) other;
        return Intrinsics.areEqual(this.loginStatus, loginMfa.loginStatus) && Intrinsics.areEqual(this.username, loginMfa.username);
    }

    public int hashCode() {
        int iHashCode = this.loginStatus.hashCode() * 31;
        String str = this.username;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LoginMfa(loginStatus=" + this.loginStatus + ", username=" + this.username + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.loginStatus, flags);
        dest.writeString(this.username);
    }

    public LoginMfa(LoginStatus.MfaRequired loginStatus, String str) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        this.loginStatus = loginStatus;
        this.username = str;
    }

    public /* synthetic */ LoginMfa(LoginStatus.MfaRequired mfaRequired, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mfaRequired, (i & 2) != 0 ? null : str);
    }

    public final LoginStatus.MfaRequired getLoginStatus() {
        return this.loginStatus;
    }

    public final String getUsername() {
        return this.username;
    }
}
