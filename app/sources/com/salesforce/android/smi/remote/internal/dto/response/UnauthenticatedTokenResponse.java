package com.salesforce.android.smi.remote.internal.dto.response;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnauthenticatedTokenResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/response/UnauthenticatedTokenResponse;", "Lcom/salesforce/android/smi/remote/internal/dto/response/AuthorizationTokenResponse;", "accessToken", "", "refreshToken", "lastEventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getLastEventId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UnauthenticatedTokenResponse implements AuthorizationTokenResponse {
    private final String accessToken;
    private final String lastEventId;
    private final String refreshToken;

    public static /* synthetic */ UnauthenticatedTokenResponse copy$default(UnauthenticatedTokenResponse unauthenticatedTokenResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unauthenticatedTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = unauthenticatedTokenResponse.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = unauthenticatedTokenResponse.lastEventId;
        }
        return unauthenticatedTokenResponse.copy(str, str2, str3);
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
    public final String getLastEventId() {
        return this.lastEventId;
    }

    public final UnauthenticatedTokenResponse copy(String accessToken, String refreshToken, String lastEventId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(lastEventId, "lastEventId");
        return new UnauthenticatedTokenResponse(accessToken, refreshToken, lastEventId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnauthenticatedTokenResponse)) {
            return false;
        }
        UnauthenticatedTokenResponse unauthenticatedTokenResponse = (UnauthenticatedTokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, unauthenticatedTokenResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, unauthenticatedTokenResponse.refreshToken) && Intrinsics.areEqual(this.lastEventId, unauthenticatedTokenResponse.lastEventId);
    }

    public int hashCode() {
        return (((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + this.lastEventId.hashCode();
    }

    public String toString() {
        return "UnauthenticatedTokenResponse(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", lastEventId=" + this.lastEventId + ")";
    }

    public UnauthenticatedTokenResponse(String accessToken, String refreshToken, String lastEventId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(lastEventId, "lastEventId");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.lastEventId = lastEventId;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.response.AuthorizationTokenResponse
    public String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.response.AuthorizationTokenResponse
    public String getLastEventId() {
        return this.lastEventId;
    }
}
