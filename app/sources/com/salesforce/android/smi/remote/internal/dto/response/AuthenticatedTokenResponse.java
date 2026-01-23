package com.salesforce.android.smi.remote.internal.dto.response;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthenticatedTokenResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/response/AuthenticatedTokenResponse;", "Lcom/salesforce/android/smi/remote/internal/dto/response/AuthorizationTokenResponse;", "accessToken", "", "lastEventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getLastEventId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AuthenticatedTokenResponse implements AuthorizationTokenResponse {
    private final String accessToken;
    private final String lastEventId;

    public static /* synthetic */ AuthenticatedTokenResponse copy$default(AuthenticatedTokenResponse authenticatedTokenResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authenticatedTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = authenticatedTokenResponse.lastEventId;
        }
        return authenticatedTokenResponse.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastEventId() {
        return this.lastEventId;
    }

    public final AuthenticatedTokenResponse copy(String accessToken, String lastEventId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(lastEventId, "lastEventId");
        return new AuthenticatedTokenResponse(accessToken, lastEventId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticatedTokenResponse)) {
            return false;
        }
        AuthenticatedTokenResponse authenticatedTokenResponse = (AuthenticatedTokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, authenticatedTokenResponse.accessToken) && Intrinsics.areEqual(this.lastEventId, authenticatedTokenResponse.lastEventId);
    }

    public int hashCode() {
        return (this.accessToken.hashCode() * 31) + this.lastEventId.hashCode();
    }

    public String toString() {
        return "AuthenticatedTokenResponse(accessToken=" + this.accessToken + ", lastEventId=" + this.lastEventId + ")";
    }

    public AuthenticatedTokenResponse(String accessToken, String lastEventId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(lastEventId, "lastEventId");
        this.accessToken = accessToken;
        this.lastEventId = lastEventId;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.response.AuthorizationTokenResponse
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override // com.salesforce.android.smi.remote.internal.dto.response.AuthorizationTokenResponse
    public String getLastEventId() {
        return this.lastEventId;
    }
}
