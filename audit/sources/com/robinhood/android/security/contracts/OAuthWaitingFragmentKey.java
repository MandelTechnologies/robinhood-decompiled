package com.robinhood.android.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OAuthWaitingFragmentKey.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/OAuthWaitingFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", Auth.DEVELOPER_NAME, "", "redirectUri", "referenceId", "scope", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getRedirectUri", "getReferenceId", "getScope", "getState", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class OAuthWaitingFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<OAuthWaitingFragmentKey> CREATOR = new Creator();
    private final String clientId;
    private final String redirectUri;
    private final String referenceId;
    private final String scope;
    private final String state;

    /* compiled from: OAuthWaitingFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<OAuthWaitingFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OAuthWaitingFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OAuthWaitingFragmentKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OAuthWaitingFragmentKey[] newArray(int i) {
            return new OAuthWaitingFragmentKey[i];
        }
    }

    public static /* synthetic */ OAuthWaitingFragmentKey copy$default(OAuthWaitingFragmentKey oAuthWaitingFragmentKey, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuthWaitingFragmentKey.clientId;
        }
        if ((i & 2) != 0) {
            str2 = oAuthWaitingFragmentKey.redirectUri;
        }
        if ((i & 4) != 0) {
            str3 = oAuthWaitingFragmentKey.referenceId;
        }
        if ((i & 8) != 0) {
            str4 = oAuthWaitingFragmentKey.scope;
        }
        if ((i & 16) != 0) {
            str5 = oAuthWaitingFragmentKey.state;
        }
        String str6 = str5;
        String str7 = str3;
        return oAuthWaitingFragmentKey.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: component5, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final OAuthWaitingFragmentKey copy(String clientId, String redirectUri, String referenceId, String scope, String state) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new OAuthWaitingFragmentKey(clientId, redirectUri, referenceId, scope, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OAuthWaitingFragmentKey)) {
            return false;
        }
        OAuthWaitingFragmentKey oAuthWaitingFragmentKey = (OAuthWaitingFragmentKey) other;
        return Intrinsics.areEqual(this.clientId, oAuthWaitingFragmentKey.clientId) && Intrinsics.areEqual(this.redirectUri, oAuthWaitingFragmentKey.redirectUri) && Intrinsics.areEqual(this.referenceId, oAuthWaitingFragmentKey.referenceId) && Intrinsics.areEqual(this.scope, oAuthWaitingFragmentKey.scope) && Intrinsics.areEqual(this.state, oAuthWaitingFragmentKey.state);
    }

    public int hashCode() {
        int iHashCode = ((((((this.clientId.hashCode() * 31) + this.redirectUri.hashCode()) * 31) + this.referenceId.hashCode()) * 31) + this.scope.hashCode()) * 31;
        String str = this.state;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OAuthWaitingFragmentKey(clientId=" + this.clientId + ", redirectUri=" + this.redirectUri + ", referenceId=" + this.referenceId + ", scope=" + this.scope + ", state=" + this.state + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.clientId);
        dest.writeString(this.redirectUri);
        dest.writeString(this.referenceId);
        dest.writeString(this.scope);
        dest.writeString(this.state);
    }

    public OAuthWaitingFragmentKey(String clientId, String redirectUri, String referenceId, String scope, String str) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.clientId = clientId;
        this.redirectUri = redirectUri;
        this.referenceId = referenceId;
        this.scope = scope;
        this.state = str;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getState() {
        return this.state;
    }
}
