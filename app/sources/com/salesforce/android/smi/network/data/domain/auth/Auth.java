package com.salesforce.android.smi.network.data.domain.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SigningKeyResolverAdapter;
import java.security.Key;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: Auth.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB;\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018¨\u0006\u001f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/auth/Auth;", "", "header", "Lio/jsonwebtoken/JwsHeader;", "claims", "Lio/jsonwebtoken/Claims;", "rawJwt", "", "refreshToken", "lastEventId", "isAuthenticated", "", "<init>", "(Lio/jsonwebtoken/JwsHeader;Lio/jsonwebtoken/Claims;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getHeader", "()Lio/jsonwebtoken/JwsHeader;", "getClaims", "()Lio/jsonwebtoken/Claims;", "getRawJwt", "()Ljava/lang/String;", "getRefreshToken", "getLastEventId", "setLastEventId", "(Ljava/lang/String;)V", "()Z", "isExpired", "isVersionEqual", "version", "getDeveloperName", "getChannelAddressId", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Auth {
    public static final String CAPABILITIES_KEY = "capabilitiesVersion";
    public static final String CHANNEL_ADD_ID = "channelAddId";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEVELOPER_NAME = "clientId";
    private final Claims claims;
    private final JwsHeader<?> header;
    private final boolean isAuthenticated;
    private String lastEventId;
    private final String rawJwt;
    private final String refreshToken;

    public Auth(JwsHeader<?> header, Claims claims, String rawJwt, String refreshToken, String lastEventId, boolean z) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(claims, "claims");
        Intrinsics.checkNotNullParameter(rawJwt, "rawJwt");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(lastEventId, "lastEventId");
        this.header = header;
        this.claims = claims;
        this.rawJwt = rawJwt;
        this.refreshToken = refreshToken;
        this.lastEventId = lastEventId;
        this.isAuthenticated = z;
    }

    public final JwsHeader<?> getHeader() {
        return this.header;
    }

    public final Claims getClaims() {
        return this.claims;
    }

    public final String getRawJwt() {
        return this.rawJwt;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getLastEventId() {
        return this.lastEventId;
    }

    public final void setLastEventId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastEventId = str;
    }

    /* renamed from: isAuthenticated, reason: from getter */
    public final boolean getIsAuthenticated() {
        return this.isAuthenticated;
    }

    public final boolean isExpired() {
        return this.claims.getExpiration().getTime() < new Date().getTime();
    }

    public final boolean isVersionEqual(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        String str = (String) this.claims.get(CAPABILITIES_KEY, String.class);
        if (str != null) {
            return str.equals(version);
        }
        return false;
    }

    public final String getDeveloperName() {
        List listSplit$default;
        String str;
        String str2 = (String) this.claims.get(DEVELOPER_NAME, String.class);
        return (str2 == null || (listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{"/"}, false, 0, 6, (Object) null)) == null || (str = (String) CollectionsKt.getOrNull(listSplit$default, 1)) == null) ? "Unknown" : str;
    }

    public final String getChannelAddressId() {
        return (String) this.claims.get(CHANNEL_ADD_ID, String.class);
    }

    /* compiled from: Auth.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/auth/Auth$Companion;", "", "<init>", "()V", "parseJwt", "Lcom/salesforce/android/smi/network/data/domain/auth/Auth;", "jwt", "", "refreshToken", "lastEventId", "isAuthenticated", "", "validateHeader", "Lio/jsonwebtoken/JwsHeader;", "header", "validateClaims", "Lio/jsonwebtoken/Claims;", "claims", "CAPABILITIES_KEY", "DEVELOPER_NAME", "CHANNEL_ADD_ID", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Auth parseJwt$default(Companion companion, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = "0";
            }
            return companion.parseJwt(str, str2, str3, z);
        }

        public final Auth parseJwt(String jwt, String refreshToken, String lastEventId, boolean isAuthenticated) throws Exception {
            Intrinsics.checkNotNullParameter(jwt, "jwt");
            Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
            Intrinsics.checkNotNullParameter(lastEventId, "lastEventId");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                Jwts.parserBuilder().setSigningKeyResolver(new SigningKeyResolverAdapter() { // from class: com.salesforce.android.smi.network.data.domain.auth.Auth$Companion$parseJwt$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.jsonwebtoken.SigningKeyResolverAdapter, io.jsonwebtoken.SigningKeyResolver
                    public Key resolveSigningKey(JwsHeader<?> parsedHeader, Claims parsedClaims) {
                        Intrinsics.checkNotNullParameter(parsedHeader, "parsedHeader");
                        objectRef.element = parsedHeader;
                        objectRef2.element = parsedClaims;
                        return null;
                    }
                }).build().parseClaimsJws(jwt);
            } catch (Exception e) {
                if (e instanceof MalformedJwtException) {
                    throw e;
                }
            }
            return new Auth(validateHeader((JwsHeader) objectRef.element), validateClaims((Claims) objectRef2.element), jwt, refreshToken, lastEventId, isAuthenticated);
        }

        private final JwsHeader<?> validateHeader(JwsHeader<?> header) {
            if (header != null) {
                return header;
            }
            throw new IllegalStateException("Failed to parse header");
        }

        private final Claims validateClaims(Claims claims) {
            if (claims == null) {
                throw new IllegalStateException("Failed to parse claims");
            }
            if (claims.getSubject() == null) {
                throw new IllegalStateException("Failed to parse subject");
            }
            String subject = claims.getSubject();
            Intrinsics.checkNotNullExpressionValue(subject, "getSubject(...)");
            if (subject.length() > 0) {
                return claims;
            }
            throw new IllegalStateException("Subject must not be empty");
        }
    }
}
