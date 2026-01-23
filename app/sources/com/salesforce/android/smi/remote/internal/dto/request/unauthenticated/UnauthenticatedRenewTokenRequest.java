package com.salesforce.android.smi.remote.internal.dto.request.unauthenticated;

import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnauthenticatedRenewTokenRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/UnauthenticatedRenewTokenRequest;", "", "accessToken", "", "refreshToken", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, Auth.CAPABILITIES_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getDeviceId", "getCapabilitiesVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnauthenticatedRenewTokenRequest {
    private final String accessToken;
    private final String capabilitiesVersion;
    private final String deviceId;
    private final String refreshToken;

    public static /* synthetic */ UnauthenticatedRenewTokenRequest copy$default(UnauthenticatedRenewTokenRequest unauthenticatedRenewTokenRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unauthenticatedRenewTokenRequest.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = unauthenticatedRenewTokenRequest.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = unauthenticatedRenewTokenRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = unauthenticatedRenewTokenRequest.capabilitiesVersion;
        }
        return unauthenticatedRenewTokenRequest.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCapabilitiesVersion() {
        return this.capabilitiesVersion;
    }

    public final UnauthenticatedRenewTokenRequest copy(String accessToken, String refreshToken, String deviceId, String capabilitiesVersion) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(capabilitiesVersion, "capabilitiesVersion");
        return new UnauthenticatedRenewTokenRequest(accessToken, refreshToken, deviceId, capabilitiesVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnauthenticatedRenewTokenRequest)) {
            return false;
        }
        UnauthenticatedRenewTokenRequest unauthenticatedRenewTokenRequest = (UnauthenticatedRenewTokenRequest) other;
        return Intrinsics.areEqual(this.accessToken, unauthenticatedRenewTokenRequest.accessToken) && Intrinsics.areEqual(this.refreshToken, unauthenticatedRenewTokenRequest.refreshToken) && Intrinsics.areEqual(this.deviceId, unauthenticatedRenewTokenRequest.deviceId) && Intrinsics.areEqual(this.capabilitiesVersion, unauthenticatedRenewTokenRequest.capabilitiesVersion);
    }

    public int hashCode() {
        return (((((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.capabilitiesVersion.hashCode();
    }

    public String toString() {
        return "UnauthenticatedRenewTokenRequest(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", deviceId=" + this.deviceId + ", capabilitiesVersion=" + this.capabilitiesVersion + ")";
    }

    public UnauthenticatedRenewTokenRequest(String accessToken, String refreshToken, String deviceId, String capabilitiesVersion) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(capabilitiesVersion, "capabilitiesVersion");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.deviceId = deviceId;
        this.capabilitiesVersion = capabilitiesVersion;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getCapabilitiesVersion() {
        return this.capabilitiesVersion;
    }
}
