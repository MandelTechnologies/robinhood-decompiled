package com.salesforce.android.smi.remote.internal.dto.request.userVerification;

import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.network.api.auth.UserVerificationToken;
import com.salesforce.android.smi.network.api.auth.UserVerificationTokenRequest;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.AuthorizationTokensRequest;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserVerificationAuthTokenRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/userVerification/UserVerificationAuthTokenRequest;", "Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/AuthorizationTokensRequest;", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationTokenRequest;", "orgId", "", "developerName", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, Auth.CAPABILITIES_KEY, "userVerificationType", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken$UserVerificationType;", "customerIdentityToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken$UserVerificationType;Ljava/lang/String;)V", "getOrgId", "()Ljava/lang/String;", "getDeveloperName", "getDeviceId", "getCapabilitiesVersion", "getUserVerificationType", "()Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken$UserVerificationType;", "getCustomerIdentityToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserVerificationAuthTokenRequest implements AuthorizationTokensRequest, UserVerificationTokenRequest {
    private final String capabilitiesVersion;
    private final String customerIdentityToken;
    private final String developerName;
    private final String deviceId;
    private final String orgId;
    private final UserVerificationToken.UserVerificationType userVerificationType;

    public static /* synthetic */ UserVerificationAuthTokenRequest copy$default(UserVerificationAuthTokenRequest userVerificationAuthTokenRequest, String str, String str2, String str3, String str4, UserVerificationToken.UserVerificationType userVerificationType, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userVerificationAuthTokenRequest.orgId;
        }
        if ((i & 2) != 0) {
            str2 = userVerificationAuthTokenRequest.developerName;
        }
        if ((i & 4) != 0) {
            str3 = userVerificationAuthTokenRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = userVerificationAuthTokenRequest.capabilitiesVersion;
        }
        if ((i & 16) != 0) {
            userVerificationType = userVerificationAuthTokenRequest.userVerificationType;
        }
        if ((i & 32) != 0) {
            str5 = userVerificationAuthTokenRequest.customerIdentityToken;
        }
        UserVerificationToken.UserVerificationType userVerificationType2 = userVerificationType;
        String str6 = str5;
        return userVerificationAuthTokenRequest.copy(str, str2, str3, str4, userVerificationType2, str6);
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

    /* renamed from: component5, reason: from getter */
    public final UserVerificationToken.UserVerificationType getUserVerificationType() {
        return this.userVerificationType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCustomerIdentityToken() {
        return this.customerIdentityToken;
    }

    public final UserVerificationAuthTokenRequest copy(String orgId, String developerName, String deviceId, String capabilitiesVersion, @Json(name = "authorizationType") UserVerificationToken.UserVerificationType userVerificationType, String customerIdentityToken) {
        Intrinsics.checkNotNullParameter(orgId, "orgId");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(capabilitiesVersion, "capabilitiesVersion");
        Intrinsics.checkNotNullParameter(userVerificationType, "userVerificationType");
        Intrinsics.checkNotNullParameter(customerIdentityToken, "customerIdentityToken");
        return new UserVerificationAuthTokenRequest(orgId, developerName, deviceId, capabilitiesVersion, userVerificationType, customerIdentityToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserVerificationAuthTokenRequest)) {
            return false;
        }
        UserVerificationAuthTokenRequest userVerificationAuthTokenRequest = (UserVerificationAuthTokenRequest) other;
        return Intrinsics.areEqual(this.orgId, userVerificationAuthTokenRequest.orgId) && Intrinsics.areEqual(this.developerName, userVerificationAuthTokenRequest.developerName) && Intrinsics.areEqual(this.deviceId, userVerificationAuthTokenRequest.deviceId) && Intrinsics.areEqual(this.capabilitiesVersion, userVerificationAuthTokenRequest.capabilitiesVersion) && this.userVerificationType == userVerificationAuthTokenRequest.userVerificationType && Intrinsics.areEqual(this.customerIdentityToken, userVerificationAuthTokenRequest.customerIdentityToken);
    }

    public int hashCode() {
        return (((((((((this.orgId.hashCode() * 31) + this.developerName.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.capabilitiesVersion.hashCode()) * 31) + this.userVerificationType.hashCode()) * 31) + this.customerIdentityToken.hashCode();
    }

    public String toString() {
        return "UserVerificationAuthTokenRequest(orgId=" + this.orgId + ", developerName=" + this.developerName + ", deviceId=" + this.deviceId + ", capabilitiesVersion=" + this.capabilitiesVersion + ", userVerificationType=" + this.userVerificationType + ", customerIdentityToken=" + this.customerIdentityToken + ")";
    }

    public UserVerificationAuthTokenRequest(String orgId, String developerName, String deviceId, String capabilitiesVersion, @Json(name = "authorizationType") UserVerificationToken.UserVerificationType userVerificationType, String customerIdentityToken) {
        Intrinsics.checkNotNullParameter(orgId, "orgId");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(capabilitiesVersion, "capabilitiesVersion");
        Intrinsics.checkNotNullParameter(userVerificationType, "userVerificationType");
        Intrinsics.checkNotNullParameter(customerIdentityToken, "customerIdentityToken");
        this.orgId = orgId;
        this.developerName = developerName;
        this.deviceId = deviceId;
        this.capabilitiesVersion = capabilitiesVersion;
        this.userVerificationType = userVerificationType;
        this.customerIdentityToken = customerIdentityToken;
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

    @Override // com.salesforce.android.smi.network.api.auth.UserVerificationTokenRequest
    public UserVerificationToken.UserVerificationType getUserVerificationType() {
        return this.userVerificationType;
    }

    @Override // com.salesforce.android.smi.network.api.auth.UserVerificationTokenRequest
    public String getCustomerIdentityToken() {
        return this.customerIdentityToken;
    }
}
