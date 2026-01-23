package com.robinhood.api.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.models.api.sheriff.OAuthGrantType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.http.AuthTokens;
import com.robinhood.utils.logging.CrashReporter;
import dagger.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import timber.log.Timber;

/* compiled from: RealAuthTokenManager.kt */
@kotlin.Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BG\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\"R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-¨\u00060"}, m3636d2 = {"Lcom/robinhood/api/utils/RealAuthTokenManager;", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "", "deviceLabel", "Ldagger/Lazy;", "Lcom/robinhood/api/retrofit/Sheriff;", "sheriff", "Lcom/robinhood/targetbackend/Endpoint;", "endpoint", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "oAuthTokenPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "trustedDeviceIdPref", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljava/lang/String;Ldagger/Lazy;Lcom/robinhood/targetbackend/Endpoint;Lcom/robinhood/prefs/MoshiSecurePreference;Lcom/robinhood/prefs/TrustedDeviceIdPref;Lj$/time/Clock;)V", "Landroid/app/Application;", "app", "(Landroid/app/Application;Ldagger/Lazy;Lcom/robinhood/targetbackend/Endpoint;Lcom/robinhood/prefs/MoshiSecurePreference;Lcom/robinhood/prefs/TrustedDeviceIdPref;Lj$/time/Clock;)V", "", "setCachedTokens", "()V", "", "hasAuthToken", "()Z", "getAuthorizationHeader", "()Ljava/lang/String;", "getRawAuthToken", "failedAuthHeader", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager$TokenRefreshResult;", "attemptToRefreshToken", "(Ljava/lang/String;)Lcom/robinhood/shared/security/auth/token/AuthTokenManager$TokenRefreshResult;", "Ljava/lang/String;", "getDeviceLabel", "Ldagger/Lazy;", "Lcom/robinhood/targetbackend/Endpoint;", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "Lj$/time/Clock;", "cachedAuthToken", "cachedFormattedAuthToken", "", "nextRefreshTime", "J", "nextRefreshBackoff", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RealAuthTokenManager implements AuthTokenManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long REFRESH_BACKOFF_MAX_MS = 30000;
    public static final long REFRESH_BACKOFF_MIN_MS = 1000;
    private String cachedAuthToken;
    private String cachedFormattedAuthToken;
    private final Clock clock;
    private final String deviceLabel;
    private final Endpoint endpoint;
    private long nextRefreshBackoff;
    private long nextRefreshTime;
    private final MoshiSecurePreference<OAuthToken> oAuthTokenPref;
    private final Lazy<Sheriff> sheriff;
    private final TrustedDeviceIdPref trustedDeviceIdPref;

    public RealAuthTokenManager(String deviceLabel, Lazy<Sheriff> sheriff, Endpoint endpoint, MoshiSecurePreference<OAuthToken> oAuthTokenPref, TrustedDeviceIdPref trustedDeviceIdPref, Clock clock) {
        Intrinsics.checkNotNullParameter(deviceLabel, "deviceLabel");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.deviceLabel = deviceLabel;
        this.sheriff = sheriff;
        this.endpoint = endpoint;
        this.oAuthTokenPref = oAuthTokenPref;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.clock = clock;
        this.nextRefreshBackoff = 1000L;
    }

    @Override // com.robinhood.shared.security.auth.token.AuthTokenManager
    public String getDeviceLabel() {
        return this.deviceLabel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealAuthTokenManager(Application app, Lazy<Sheriff> sheriff, Endpoint endpoint, MoshiSecurePreference<OAuthToken> oAuthTokenPref, TrustedDeviceIdPref trustedDeviceIdPref, @ElapsedRealtime Clock clock) {
        this(INSTANCE.getDeviceLabel(app), sheriff, endpoint, oAuthTokenPref, trustedDeviceIdPref, clock);
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
    }

    @Override // com.robinhood.shared.security.auth.token.AuthTokenManager
    public boolean hasAuthToken() {
        return this.oAuthTokenPref.mo23850isSet();
    }

    @Override // com.robinhood.shared.security.auth.token.AuthTokenManager
    public String getAuthorizationHeader() {
        setCachedTokens();
        return this.cachedFormattedAuthToken;
    }

    @Override // com.robinhood.shared.security.auth.token.AuthTokenManager
    public String getRawAuthToken() {
        setCachedTokens();
        return this.cachedAuthToken;
    }

    private final synchronized void setCachedTokens() {
        try {
            OAuthToken value = this.oAuthTokenPref.getValue();
            if (value != null) {
                String accessToken = value.getAccessToken();
                Intrinsics.checkNotNull(accessToken);
                if (this.cachedAuthToken != accessToken) {
                    String tokenType = value.getTokenType();
                    Intrinsics.checkNotNull(tokenType);
                    this.cachedFormattedAuthToken = AuthTokens.formatToken(tokenType, accessToken);
                    this.cachedAuthToken = accessToken;
                }
            } else {
                this.cachedAuthToken = null;
                this.cachedFormattedAuthToken = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.robinhood.shared.security.auth.token.AuthTokenManager
    public synchronized AuthTokenManager.TokenRefreshResult attemptToRefreshToken(String failedAuthHeader) {
        if (this.clock.millis() < this.nextRefreshTime) {
            return AuthTokenManager.TokenRefreshResult.DEBOUNCED;
        }
        OAuthToken value = this.oAuthTokenPref.getValue();
        if ((value != null ? value.getRefreshToken() : null) != null && value.getScope() != null) {
            if (StringsKt.equals$default(failedAuthHeader, getAuthorizationHeader(), false, 2, null)) {
                Timber.INSTANCE.mo3350d("Refreshing OAuth token", new Object[0]);
                CrashReporter.INSTANCE.log("Refreshing OAuth token");
                return (AuthTokenManager.TokenRefreshResult) BuildersKt__BuildersKt.runBlocking$default(null, new C316231(value, null), 1, null);
            }
            Timber.INSTANCE.mo3359v("Auth token refresh debounced, another call has refreshed token", new Object[0]);
            return AuthTokenManager.TokenRefreshResult.SUCCESS;
        }
        Timber.INSTANCE.mo3362w("Received 401 with no auth tokens set", new Object[0]);
        return AuthTokenManager.TokenRefreshResult.FORCE_LOGOUT;
    }

    /* compiled from: RealAuthTokenManager.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager$TokenRefreshResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.utils.RealAuthTokenManager$attemptToRefreshToken$1", m3645f = "RealAuthTokenManager.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.utils.RealAuthTokenManager$attemptToRefreshToken$1 */
    /* loaded from: classes16.dex */
    static final class C316231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AuthTokenManager.TokenRefreshResult>, Object> {
        final /* synthetic */ OAuthToken $oAuthToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C316231(OAuthToken oAuthToken, Continuation<? super C316231> continuation) {
            super(2, continuation);
            this.$oAuthToken = oAuthToken;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAuthTokenManager.this.new C316231(this.$oAuthToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AuthTokenManager.TokenRefreshResult> continuation) {
            return ((C316231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C316231 c316231;
            Sheriff sheriff;
            String str;
            String deviceLabel;
            String refreshToken;
            OAuthGrantType oAuthGrantType;
            String scope;
            String brokebackOAuthClientId;
            String releaseChannel;
            Exception exc;
            Exception exc2;
            Integer httpStatusCode;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    sheriff = (Sheriff) RealAuthTokenManager.this.sheriff.get();
                    str = RealAuthTokenManager.this.trustedDeviceIdPref.get();
                    deviceLabel = RealAuthTokenManager.this.getDeviceLabel();
                    refreshToken = this.$oAuthToken.getRefreshToken();
                    Intrinsics.checkNotNull(refreshToken);
                    oAuthGrantType = OAuthGrantType.REFRESH;
                    scope = this.$oAuthToken.getScope();
                    Intrinsics.checkNotNull(scope);
                    brokebackOAuthClientId = RealAuthTokenManager.this.endpoint.getBrokebackOAuthClientId();
                    releaseChannel = BuildVariant.INSTANCE.toReleaseChannel();
                    this.label = 1;
                    c316231 = this;
                } catch (Exception e) {
                    e = e;
                    c316231 = this;
                    exc = e;
                    exc2 = exc;
                    RealAuthTokenManager realAuthTokenManager = RealAuthTokenManager.this;
                    realAuthTokenManager.nextRefreshTime = realAuthTokenManager.clock.millis() + RealAuthTokenManager.this.nextRefreshBackoff;
                    RealAuthTokenManager realAuthTokenManager2 = RealAuthTokenManager.this;
                    realAuthTokenManager2.nextRefreshBackoff = Math.min(realAuthTokenManager2.nextRefreshBackoff * 2, 30000L);
                    httpStatusCode = Throwables.getHttpStatusCode(exc2);
                    if (httpStatusCode != null && httpStatusCode.intValue() == 401) {
                        Timber.INSTANCE.mo3353e("OAuth token refresh returned 401", new Object[0]);
                        CrashReporter.Companion companion = CrashReporter.INSTANCE;
                        companion.log("OAuth token refresh failed");
                        CrashReporter.DefaultImpls.reportNonFatal$default(companion, exc2, false, null, 4, null);
                        return AuthTokenManager.TokenRefreshResult.FORCE_LOGOUT;
                    }
                    return AuthTokenManager.TokenRefreshResult.FAILURE;
                }
                try {
                    obj = sheriff.oAuthRefreshToken(str, deviceLabel, refreshToken, oAuthGrantType, scope, brokebackOAuthClientId, releaseChannel, c316231);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    exc2 = exc;
                    RealAuthTokenManager realAuthTokenManager3 = RealAuthTokenManager.this;
                    realAuthTokenManager3.nextRefreshTime = realAuthTokenManager3.clock.millis() + RealAuthTokenManager.this.nextRefreshBackoff;
                    RealAuthTokenManager realAuthTokenManager22 = RealAuthTokenManager.this;
                    realAuthTokenManager22.nextRefreshBackoff = Math.min(realAuthTokenManager22.nextRefreshBackoff * 2, 30000L);
                    httpStatusCode = Throwables.getHttpStatusCode(exc2);
                    if (httpStatusCode != null) {
                        Timber.INSTANCE.mo3353e("OAuth token refresh returned 401", new Object[0]);
                        CrashReporter.Companion companion2 = CrashReporter.INSTANCE;
                        companion2.log("OAuth token refresh failed");
                        CrashReporter.DefaultImpls.reportNonFatal$default(companion2, exc2, false, null, 4, null);
                        return AuthTokenManager.TokenRefreshResult.FORCE_LOGOUT;
                    }
                    return AuthTokenManager.TokenRefreshResult.FAILURE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c316231 = this;
                } catch (Exception e3) {
                    exc = e3;
                    c316231 = this;
                    exc2 = exc;
                    RealAuthTokenManager realAuthTokenManager32 = RealAuthTokenManager.this;
                    realAuthTokenManager32.nextRefreshTime = realAuthTokenManager32.clock.millis() + RealAuthTokenManager.this.nextRefreshBackoff;
                    RealAuthTokenManager realAuthTokenManager222 = RealAuthTokenManager.this;
                    realAuthTokenManager222.nextRefreshBackoff = Math.min(realAuthTokenManager222.nextRefreshBackoff * 2, 30000L);
                    httpStatusCode = Throwables.getHttpStatusCode(exc2);
                    if (httpStatusCode != null) {
                    }
                    return AuthTokenManager.TokenRefreshResult.FAILURE;
                }
            }
            Timber.INSTANCE.mo3356i("OAuth token refreshed", new Object[0]);
            CrashReporter.INSTANCE.log("OAuth token refreshed");
            RealAuthTokenManager.this.nextRefreshTime = 0L;
            RealAuthTokenManager.this.nextRefreshBackoff = 1000L;
            RealAuthTokenManager.this.oAuthTokenPref.set((MoshiSecurePreference) obj);
            return AuthTokenManager.TokenRefreshResult.SUCCESS;
        }
    }

    /* compiled from: RealAuthTokenManager.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/utils/RealAuthTokenManager$Companion;", "", "<init>", "()V", "REFRESH_BACKOFF_MIN_MS", "", "REFRESH_BACKOFF_MAX_MS", "getDeviceLabel", "", "context", "Landroid/content/Context;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"InlinedApi"})
        public final String getDeviceLabel(Context context) {
            String string2;
            try {
                string2 = Settings.Global.getString(context.getContentResolver(), "device_name");
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, true, null, 4, null);
                string2 = null;
            }
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (!StringsKt.contains((CharSequence) MODEL, (CharSequence) MANUFACTURER, true)) {
                MODEL = MANUFACTURER + PlaceholderUtils.XXShortPlaceholderText + MODEL;
            }
            Intrinsics.checkNotNull(MODEL);
            if (StringsKt.contains((CharSequence) MODEL, (CharSequence) (string2 == null ? "" : string2), true)) {
                return MODEL;
            }
            return string2 + PlaceholderUtils.XXShortPlaceholderText + MODEL;
        }
    }
}
