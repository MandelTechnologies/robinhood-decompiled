package com.robinhood.android.lib.webview;

import com.robinhood.android.lib.webview.WebError;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Instants;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: WebAuthTokenManager.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "<init>", "(Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lcom/robinhood/prefs/MoshiSecurePreference;)V", "authTokenRefreshed", "", "refreshAuthToken", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "onNewAuthToken", "Lkotlin/Function1;", "", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WebAuthTokenManager {
    private final AuthTokenManager authTokenManager;
    private volatile boolean authTokenRefreshed;
    private final MoshiSecurePreference<OAuthToken> oAuthTokenPref;

    public WebAuthTokenManager(AuthTokenManager authTokenManager, MoshiSecurePreference<OAuthToken> oAuthTokenPref) {
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
        this.authTokenManager = authTokenManager;
        this.oAuthTokenPref = oAuthTokenPref;
    }

    public final Single<Optional<OAuthToken>> refreshAuthToken(final Function1<? super OAuthToken, Unit> onNewAuthToken) {
        Intrinsics.checkNotNullParameter(onNewAuthToken, "onNewAuthToken");
        final OAuthToken value = this.oAuthTokenPref.getValue();
        if (value == null) {
            Single<Optional<OAuthToken>> singleError = Single.error(WebError.MissingAuthToken.INSTANCE);
            Intrinsics.checkNotNull(singleError);
            return singleError;
        }
        if (this.authTokenRefreshed) {
            Instant received = value.getReceived();
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (Instants.daysUntil(received, localDateNow) < 1) {
                Single<Optional<OAuthToken>> singleError2 = Single.error(WebError.AuthTokenRefreshedTooOften.INSTANCE);
                Intrinsics.checkNotNull(singleError2);
                return singleError2;
            }
        }
        Single<Optional<OAuthToken>> map = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.android.lib.webview.WebAuthTokenManager.refreshAuthToken.1
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter<AuthTokenManager.TokenRefreshResult> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                emitter.onSuccess(WebAuthTokenManager.this.authTokenManager.attemptToRefreshToken(WebAuthTokenManager.this.authTokenManager.getAuthorizationHeader()));
            }
        }).map(new Function() { // from class: com.robinhood.android.lib.webview.WebAuthTokenManager.refreshAuthToken.2

            /* compiled from: WebAuthTokenManager.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.lib.webview.WebAuthTokenManager$refreshAuthToken$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AuthTokenManager.TokenRefreshResult.values().length];
                    try {
                        iArr[AuthTokenManager.TokenRefreshResult.SUCCESS.ordinal()] = 1;
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
                        iArr[AuthTokenManager.TokenRefreshResult.FORCE_LOGOUT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final Optional<OAuthToken> apply(AuthTokenManager.TokenRefreshResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                int i = WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return Optional3.asOptional(value);
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Optional2.INSTANCE;
                }
                Object value2 = WebAuthTokenManager.this.oAuthTokenPref.getValue();
                Intrinsics.checkNotNull(value2);
                OAuthToken oAuthToken = (OAuthToken) value2;
                WebAuthTokenManager.this.authTokenRefreshed = true;
                onNewAuthToken.invoke(oAuthToken);
                return Optional3.asOptional(oAuthToken);
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }
}
