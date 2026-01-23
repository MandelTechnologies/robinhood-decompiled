package com.robinhood.shared.user.contracts.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.login.LoginStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/LoginFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "email", "", "launchForgotEmail", "", "<init>", "(Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "getLaunchForgotEmail", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class LoginFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<LoginFragmentKey> CREATOR = new Creator();
    private final String email;
    private final boolean launchForgotEmail;

    /* compiled from: LoginFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/LoginFragmentKey$Callbacks;", "", "onForgotPasswordClicked", "", "onAuthenticated", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "email", "", "password", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public interface Callbacks {
        void onAuthenticated(LoginStatus loginStatus, String email, String password);

        void onForgotPasswordClicked();
    }

    /* compiled from: LoginFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<LoginFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoginFragmentKey(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginFragmentKey[] newArray(int i) {
            return new LoginFragmentKey[i];
        }
    }

    public static /* synthetic */ LoginFragmentKey copy$default(LoginFragmentKey loginFragmentKey, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginFragmentKey.email;
        }
        if ((i & 2) != 0) {
            z = loginFragmentKey.launchForgotEmail;
        }
        return loginFragmentKey.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLaunchForgotEmail() {
        return this.launchForgotEmail;
    }

    public final LoginFragmentKey copy(String email, boolean launchForgotEmail) {
        return new LoginFragmentKey(email, launchForgotEmail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginFragmentKey)) {
            return false;
        }
        LoginFragmentKey loginFragmentKey = (LoginFragmentKey) other;
        return Intrinsics.areEqual(this.email, loginFragmentKey.email) && this.launchForgotEmail == loginFragmentKey.launchForgotEmail;
    }

    public int hashCode() {
        String str = this.email;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.launchForgotEmail);
    }

    public String toString() {
        return "LoginFragmentKey(email=" + this.email + ", launchForgotEmail=" + this.launchForgotEmail + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.email);
        dest.writeInt(this.launchForgotEmail ? 1 : 0);
    }

    public LoginFragmentKey(String str, boolean z) {
        this.email = str;
        this.launchForgotEmail = z;
    }

    public /* synthetic */ LoginFragmentKey(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getLaunchForgotEmail() {
        return this.launchForgotEmail;
    }
}
