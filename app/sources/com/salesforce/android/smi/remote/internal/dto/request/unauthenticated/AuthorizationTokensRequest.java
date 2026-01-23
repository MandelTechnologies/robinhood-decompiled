package com.salesforce.android.smi.remote.internal.dto.request.unauthenticated;

import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import kotlin.Metadata;

/* compiled from: AuthorizationTokensRequest.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/AuthorizationTokensRequest;", "", "orgId", "", "getOrgId", "()Ljava/lang/String;", "developerName", "getDeveloperName", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "getDeviceId", Auth.CAPABILITIES_KEY, "getCapabilitiesVersion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface AuthorizationTokensRequest {
    String getCapabilitiesVersion();

    String getDeveloperName();

    String getDeviceId();

    String getOrgId();
}
