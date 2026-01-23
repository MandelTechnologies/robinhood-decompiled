package com.robinhood.android.analytics;

import com.robinhood.analytics.Analytics;
import com.robinhood.analytics.AnalyticsBundle;
import com.robinhood.analytics.RealSessionManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/analytics/ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/Analytics;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "sessionManager", "Lcom/robinhood/analytics/RealSessionManager;", "analyticsBundle", "Lcom/robinhood/analytics/AnalyticsBundle;", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "userUuidPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory implements Factory<Analytics> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsBundle> analyticsBundle;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<RealSessionManager> sessionManager;
    private final Provider<StringPreference> userUuidPref;
    private final Provider<StringPreference> usernamePref;

    @JvmStatic
    public static final ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory create(Provider<CoroutineScope> provider, Provider<RealSessionManager> provider2, Provider<AnalyticsBundle> provider3, Provider<StringPreference> provider4, Provider<StringPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final Analytics provideAnalytics(CoroutineScope coroutineScope, RealSessionManager realSessionManager, AnalyticsBundle analyticsBundle, StringPreference stringPreference, StringPreference stringPreference2) {
        return INSTANCE.provideAnalytics(coroutineScope, realSessionManager, analyticsBundle, stringPreference, stringPreference2);
    }

    public ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory(Provider<CoroutineScope> coroutineScope, Provider<RealSessionManager> sessionManager, Provider<AnalyticsBundle> analyticsBundle, Provider<StringPreference> usernamePref, Provider<StringPreference> userUuidPref) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(analyticsBundle, "analyticsBundle");
        Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        this.coroutineScope = coroutineScope;
        this.sessionManager = sessionManager;
        this.analyticsBundle = analyticsBundle;
        this.usernamePref = usernamePref;
        this.userUuidPref = userUuidPref;
    }

    @Override // javax.inject.Provider
    public Analytics get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        RealSessionManager realSessionManager = this.sessionManager.get();
        Intrinsics.checkNotNullExpressionValue(realSessionManager, "get(...)");
        AnalyticsBundle analyticsBundle = this.analyticsBundle.get();
        Intrinsics.checkNotNullExpressionValue(analyticsBundle, "get(...)");
        StringPreference stringPreference = this.usernamePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.userUuidPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        return companion.provideAnalytics(coroutineScope, realSessionManager, analyticsBundle, stringPreference, stringPreference2);
    }

    /* compiled from: ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/analytics/ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/analytics/ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "sessionManager", "Lcom/robinhood/analytics/RealSessionManager;", "analyticsBundle", "Lcom/robinhood/analytics/AnalyticsBundle;", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "userUuidPref", "provideAnalytics", "Lcom/robinhood/analytics/Analytics;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory create(Provider<CoroutineScope> coroutineScope, Provider<RealSessionManager> sessionManager, Provider<AnalyticsBundle> analyticsBundle, Provider<StringPreference> usernamePref, Provider<StringPreference> userUuidPref) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
            Intrinsics.checkNotNullParameter(analyticsBundle, "analyticsBundle");
            Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            return new ExternalReleaseAnalyticsModule_ProvideAnalyticsFactory(coroutineScope, sessionManager, analyticsBundle, usernamePref, userUuidPref);
        }

        @JvmStatic
        public final Analytics provideAnalytics(CoroutineScope coroutineScope, RealSessionManager sessionManager, AnalyticsBundle analyticsBundle, StringPreference usernamePref, StringPreference userUuidPref) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
            Intrinsics.checkNotNullParameter(analyticsBundle, "analyticsBundle");
            Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            Object objCheckNotNull = Preconditions.checkNotNull(ExternalReleaseAnalyticsModule.INSTANCE.provideAnalytics(coroutineScope, sessionManager, analyticsBundle, usernamePref, userUuidPref), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Analytics) objCheckNotNull;
        }
    }
}
