package com.robinhood.shared.security.auth.token;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: AuthTokenManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "", "deviceLabel", "", "getDeviceLabel", "()Ljava/lang/String;", "getAuthorizationHeader", "getRawAuthToken", "hasAuthToken", "", "attemptToRefreshToken", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager$TokenRefreshResult;", "failedAuthHeader", "TokenRefreshResult", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AuthTokenManager {
    TokenRefreshResult attemptToRefreshToken(String failedAuthHeader);

    String getAuthorizationHeader();

    String getDeviceLabel();

    String getRawAuthToken();

    boolean hasAuthToken();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthTokenManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/token/AuthTokenManager$TokenRefreshResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "FORCE_LOGOUT", "DEBOUNCED", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TokenRefreshResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TokenRefreshResult[] $VALUES;
        public static final TokenRefreshResult SUCCESS = new TokenRefreshResult("SUCCESS", 0);
        public static final TokenRefreshResult FAILURE = new TokenRefreshResult("FAILURE", 1);
        public static final TokenRefreshResult FORCE_LOGOUT = new TokenRefreshResult("FORCE_LOGOUT", 2);
        public static final TokenRefreshResult DEBOUNCED = new TokenRefreshResult("DEBOUNCED", 3);

        private static final /* synthetic */ TokenRefreshResult[] $values() {
            return new TokenRefreshResult[]{SUCCESS, FAILURE, FORCE_LOGOUT, DEBOUNCED};
        }

        public static EnumEntries<TokenRefreshResult> getEntries() {
            return $ENTRIES;
        }

        private TokenRefreshResult(String str, int i) {
        }

        static {
            TokenRefreshResult[] tokenRefreshResultArr$values = $values();
            $VALUES = tokenRefreshResultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tokenRefreshResultArr$values);
        }

        public static TokenRefreshResult valueOf(String str) {
            return (TokenRefreshResult) Enum.valueOf(TokenRefreshResult.class, str);
        }

        public static TokenRefreshResult[] values() {
            return (TokenRefreshResult[]) $VALUES.clone();
        }
    }
}
