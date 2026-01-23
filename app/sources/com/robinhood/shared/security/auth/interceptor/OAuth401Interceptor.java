package com.robinhood.shared.security.auth.interceptor;

import android.app.Application;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.http.Headers;
import com.robinhood.utils.logging.CrashReporter;
import dagger.Lazy;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import timber.log.Timber;

/* compiled from: OAuth401Interceptor.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor;", "Lokhttp3/Interceptor;", "application", "Landroid/app/Application;", "authTokenManager", "Ldagger/Lazy;", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Landroid/app/Application;Ldagger/Lazy;Ldagger/Lazy;)V", "getApplication", "()Landroid/app/Application;", "getAuthTokenManager", "()Ldagger/Lazy;", "getAuthManager", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "TokenRefreshFailedException", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OAuth401Interceptor implements Interceptor {
    private final Application application;
    private final Lazy<AuthManager> authManager;
    private final Lazy<AuthTokenManager> authTokenManager;

    /* compiled from: OAuth401Interceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthTokenManager.TokenRefreshResult.values().length];
            try {
                iArr[AuthTokenManager.TokenRefreshResult.FORCE_LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthTokenManager.TokenRefreshResult.DEBOUNCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthTokenManager.TokenRefreshResult.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthTokenManager.TokenRefreshResult.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OAuth401Interceptor(Application application, Lazy<AuthTokenManager> authTokenManager, Lazy<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.application = application;
        this.authTokenManager = authTokenManager;
        this.authManager = authManager;
    }

    public final Application getApplication() {
        return this.application;
    }

    public final Lazy<AuthTokenManager> getAuthTokenManager() {
        return this.authTokenManager;
    }

    public final Lazy<AuthManager> getAuthManager() {
        return this.authManager;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (request.header(Headers.DONT_INTERCEPT_FOR_OAUTH_HEADER) == null && responseProceed.getCode() == 401 && !this.authManager.get().isLoggingOut()) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.authTokenManager.get().attemptToRefreshToken(request.header("Authorization")).ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    return responseProceed;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                String authorizationHeader = this.authTokenManager.get().getAuthorizationHeader();
                responseProceed.close();
                Request.Builder builderRemoveHeader = responseProceed.getRequest().newBuilder().removeHeader("Authorization");
                Intrinsics.checkNotNull(authorizationHeader);
                return chain.proceed(builderRemoveHeader.addHeader("Authorization", authorizationHeader).build());
            }
            Timber.INSTANCE.mo3356i("401 Unauthorized, logging user out", new Object[0]);
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new TokenRefreshFailedException("OAuth refresh token request failed - forcing logout due to 401"), false, null, 4, null);
            AuthManager.DefaultImpls.initiateLogout$default(this.authManager.get(), this.application, LogoutType.HTTP_401, null, false, null, "401_interceptor", 28, null);
        }
        return responseProceed;
    }

    /* compiled from: OAuth401Interceptor.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/interceptor/OAuth401Interceptor$TokenRefreshFailedException;", "Ljava/io/IOException;", "message", "", "<init>", "(Ljava/lang/String;)V", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class TokenRefreshFailedException extends IOException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenRefreshFailedException(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }
}
