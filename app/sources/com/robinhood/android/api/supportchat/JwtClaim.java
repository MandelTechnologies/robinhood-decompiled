package com.robinhood.android.api.supportchat;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import io.jsonwebtoken.Claims;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JwtClaim.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/JwtClaim;", "", "issuer", "", "subject", "audience", "expirationEpochS", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getIssuer", "()Ljava/lang/String;", "getSubject", "getAudience", "getExpirationEpochS", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class JwtClaim {
    private final String audience;
    private final long expirationEpochS;
    private final String issuer;
    private final String subject;

    public static /* synthetic */ JwtClaim copy$default(JwtClaim jwtClaim, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jwtClaim.issuer;
        }
        if ((i & 2) != 0) {
            str2 = jwtClaim.subject;
        }
        if ((i & 4) != 0) {
            str3 = jwtClaim.audience;
        }
        if ((i & 8) != 0) {
            j = jwtClaim.expirationEpochS;
        }
        String str4 = str3;
        return jwtClaim.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAudience() {
        return this.audience;
    }

    /* renamed from: component4, reason: from getter */
    public final long getExpirationEpochS() {
        return this.expirationEpochS;
    }

    public final JwtClaim copy(@Json(name = Claims.ISSUER) String issuer, @Json(name = Claims.SUBJECT) String subject, @Json(name = Claims.AUDIENCE) String audience, @Json(name = Claims.EXPIRATION) long expirationEpochS) {
        return new JwtClaim(issuer, subject, audience, expirationEpochS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JwtClaim)) {
            return false;
        }
        JwtClaim jwtClaim = (JwtClaim) other;
        return Intrinsics.areEqual(this.issuer, jwtClaim.issuer) && Intrinsics.areEqual(this.subject, jwtClaim.subject) && Intrinsics.areEqual(this.audience, jwtClaim.audience) && this.expirationEpochS == jwtClaim.expirationEpochS;
    }

    public int hashCode() {
        String str = this.issuer;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subject;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.audience;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.expirationEpochS);
    }

    public String toString() {
        return "JwtClaim(issuer=" + this.issuer + ", subject=" + this.subject + ", audience=" + this.audience + ", expirationEpochS=" + this.expirationEpochS + ")";
    }

    public JwtClaim(@Json(name = Claims.ISSUER) String str, @Json(name = Claims.SUBJECT) String str2, @Json(name = Claims.AUDIENCE) String str3, @Json(name = Claims.EXPIRATION) long j) {
        this.issuer = str;
        this.subject = str2;
        this.audience = str3;
        this.expirationEpochS = j;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getAudience() {
        return this.audience;
    }

    public final long getExpirationEpochS() {
        return this.expirationEpochS;
    }
}
