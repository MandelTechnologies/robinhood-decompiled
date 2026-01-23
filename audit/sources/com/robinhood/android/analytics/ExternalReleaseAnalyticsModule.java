package com.robinhood.android.analytics;

import com.robinhood.analytics.Analytics;
import com.robinhood.analytics.AnalyticsBundle;
import com.robinhood.analytics.RealSessionManager;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.prefs.annotation.UsernamePref;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExternalReleaseAnalyticsModule.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/analytics/ExternalReleaseAnalyticsModule;", "", "<init>", "()V", "provideAnalytics", "Lcom/robinhood/analytics/Analytics;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "sessionManager", "Lcom/robinhood/analytics/RealSessionManager;", "analyticsBundle", "Lcom/robinhood/analytics/AnalyticsBundle;", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "userUuidPref", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ExternalReleaseAnalyticsModule {
    public static final ExternalReleaseAnalyticsModule INSTANCE = new ExternalReleaseAnalyticsModule();

    private ExternalReleaseAnalyticsModule() {
    }

    public final Analytics provideAnalytics(@RootCoroutineScope CoroutineScope coroutineScope, RealSessionManager sessionManager, AnalyticsBundle analyticsBundle, @UsernamePref StringPreference usernamePref, @UserUuidPref StringPreference userUuidPref) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(analyticsBundle, "analyticsBundle");
        Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        return new Analytics(coroutineScope, sessionManager, analyticsBundle, usernamePref.get(), userUuidPref.get());
    }
}
