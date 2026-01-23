package com.salesforce.android.smi.remote.internal.dto.request.unauthenticated;

import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnauthenticatedTokenRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/UnauthenticatedTokenRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/AuthorizationTokensRequest;", "orgId", "", "developerName", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, Auth.CAPABILITIES_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrgId", "()Ljava/lang/String;", "getDeveloperName", "getDeviceId", "getCapabilitiesVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnauthenticatedTokenRequest implements AuthorizationTokensRequest {
    private final String capabilitiesVersion;
    private final String developerName;
    private final String deviceId;
    private final String orgId;

    public static /* synthetic */ UnauthenticatedTokenRequest copy$default(UnauthenticatedTokenRequest unauthenticatedTokenRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unauthenticatedTokenRequest.orgId;
        }
        if ((i & 2) != 0) {
            str2 = unauthenticatedTokenRequest.developerName;
        }
        if ((i & 4) != 0) {
            str3 = unauthenticatedTokenRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = unauthenticatedTokenRequest.capabilitiesVersion;
        }
        return unauthenticatedTokenRequest.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrgId() {
        return this.orgId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeveloperName() {
        return this.developerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCapabilitiesVersion() {
        return this.capabilitiesVersion;
    }

    public final UnauthenticatedTokenRequest copy(String orgId, String developerName, String deviceId, String capabilitiesVersion) {
        Intrinsics.checkNotNullParameter(orgId, "orgId");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(capabilitiesVersion, "capabilitiesVersion");
        return new UnauthenticatedTokenRequest(orgId, developerName, deviceId, capabilitiesVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnauthenticatedTokenRequest)) {
            return false;
        }
        UnauthenticatedTokenRequest unauthenticatedTokenRequest = (UnauthenticatedTokenRequest) other;
        return Intrinsics.areEqual(this.orgId, unauthenticatedTokenRequest.orgId) && Intrinsics.areEqual(this.developerName, unauthenticatedTokenRequest.developerName) && Intrinsics.areEqual(this.deviceId, unauthenticatedTokenRequest.deviceId) && Intrinsics.areEqual(this.capabilitiesVersion, unauthenticatedTokenRequest.capabilitiesVersion);
    }

    public int hashCode() {
        return (((((this.orgId.hashCode() * 31) + this.developerName.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.capabilitiesVersion.hashCode();
    }

    public String toString() {
        return "UnauthenticatedTokenRequest(orgId=" + this.orgId + ", developerName=" + this.developerName + ", deviceId=" + this.deviceId + ", capabilitiesVersion=" + this.capabilitiesVersion + ")";
    }

    public UnauthenticatedTokenRequest(String orgId, String developerName, String deviceId, String capabilitiesVersion) {
        Intrinsics.checkNotNullParameter(orgId, "orgId");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(capabilitiesVersion, "capabilitiesVersion");
        this.orgId = orgId;
        this.developerName = developerName;
        this.deviceId = deviceId;
        this.capabilitiesVersion = capabilitiesVersion;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.AuthorizationTokensRequest
    public String getOrgId() {
        return this.orgId;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.AuthorizationTokensRequest
    public String getDeveloperName() {
        return this.developerName;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.AuthorizationTokensRequest
    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.AuthorizationTokensRequest
    public String getCapabilitiesVersion() {
        return this.capabilitiesVersion;
    }
}
