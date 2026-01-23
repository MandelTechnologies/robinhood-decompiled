package com.robinhood.shared.user.contracts.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Login.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/Login;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "username", "", "exitDeeplinkOverride", "Landroid/net/Uri;", "launchForgotEmail", "", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Z)V", "getUsername", "()Ljava/lang/String;", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "getLaunchForgotEmail", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class Login implements IntentKey, Parcelable {
    public static final Parcelable.Creator<Login> CREATOR = new Creator();
    private final Uri exitDeeplinkOverride;
    private final boolean launchForgotEmail;
    private final String username;

    /* compiled from: Login.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<Login> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Login createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Login(parcel.readString(), (Uri) parcel.readParcelable(Login.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Login[] newArray(int i) {
            return new Login[i];
        }
    }

    public Login() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ Login copy$default(Login login, String str, Uri uri, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = login.username;
        }
        if ((i & 2) != 0) {
            uri = login.exitDeeplinkOverride;
        }
        if ((i & 4) != 0) {
            z = login.launchForgotEmail;
        }
        return login.copy(str, uri, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLaunchForgotEmail() {
        return this.launchForgotEmail;
    }

    public final Login copy(String username, Uri exitDeeplinkOverride, boolean launchForgotEmail) {
        return new Login(username, exitDeeplinkOverride, launchForgotEmail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Login)) {
            return false;
        }
        Login login = (Login) other;
        return Intrinsics.areEqual(this.username, login.username) && Intrinsics.areEqual(this.exitDeeplinkOverride, login.exitDeeplinkOverride) && this.launchForgotEmail == login.launchForgotEmail;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.exitDeeplinkOverride;
        return ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + Boolean.hashCode(this.launchForgotEmail);
    }

    public String toString() {
        return "Login(username=" + this.username + ", exitDeeplinkOverride=" + this.exitDeeplinkOverride + ", launchForgotEmail=" + this.launchForgotEmail + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.username);
        dest.writeParcelable(this.exitDeeplinkOverride, flags);
        dest.writeInt(this.launchForgotEmail ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public Login(String str, Uri uri, boolean z) {
        this.username = str;
        this.exitDeeplinkOverride = uri;
        this.launchForgotEmail = z;
    }

    public /* synthetic */ Login(String str, Uri uri, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? false : z);
    }

    public final String getUsername() {
        return this.username;
    }

    public final Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    public final boolean getLaunchForgotEmail() {
        return this.launchForgotEmail;
    }
}
