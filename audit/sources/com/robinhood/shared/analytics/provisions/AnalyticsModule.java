package com.robinhood.shared.analytics.provisions;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import com.robinhood.analytics.AdIdProvider;
import com.robinhood.analytics.EventLogBundle;
import com.robinhood.analytics.PeriodicLoggingWorker;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProviderWithCache;
import com.robinhood.analytics.interceptor.HttpCallEventInterceptor;
import com.robinhood.analytics.interceptor.NetworkErrorEventLogInterceptor;
import com.robinhood.analytics.performance.PeriodicPerformanceMetricLoggingWorker;
import com.robinhood.networking.annotation.MonitoringApplicationInterceptors;
import com.robinhood.networking.interceptor.LogBodyInterceptor;
import com.robinhood.prefs.Installation;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.work.PeriodicWorker;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: AnalyticsModule.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020 H\u0007¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/AnalyticsModule;", "", "<init>", "()V", "provideMonitoringApplicationInterceptors", "", "Lokhttp3/Interceptor;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "logBodyInterceptor", "Lcom/robinhood/networking/interceptor/LogBodyInterceptor;", "httpCallEventInterceptor", "Lcom/robinhood/analytics/interceptor/HttpCallEventInterceptor;", "networkErrorEventLogInterceptor", "Lcom/robinhood/analytics/interceptor/NetworkErrorEventLogInterceptor;", "provideEventLogBundle", "Lcom/robinhood/analytics/EventLogBundle;", "app", "Landroid/app/Application;", "resources", "Landroid/content/res/Resources;", "adIdProvider", "Lcom/robinhood/analytics/AdIdProvider;", "installation", "Lcom/robinhood/prefs/Installation;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "provideFirebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "provider", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache;", "providePeriodicPerformanceMetricLoggingWorker", "Lcom/robinhood/work/PeriodicWorker;", "providePeriodicLoggingWorker", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AnalyticsModule {
    public static final AnalyticsModule INSTANCE = new AnalyticsModule();

    public final FirebaseAppInstanceIdProvider provideFirebaseAppInstanceIdProvider(FirebaseAppInstanceIdProviderWithCache provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    private AnalyticsModule() {
    }

    @MonitoringApplicationInterceptors
    public final List<Interceptor> provideMonitoringApplicationInterceptors(HttpLoggingInterceptor loggingInterceptor, LogBodyInterceptor logBodyInterceptor, HttpCallEventInterceptor httpCallEventInterceptor, NetworkErrorEventLogInterceptor networkErrorEventLogInterceptor) {
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(logBodyInterceptor, "logBodyInterceptor");
        Intrinsics.checkNotNullParameter(httpCallEventInterceptor, "httpCallEventInterceptor");
        Intrinsics.checkNotNullParameter(networkErrorEventLogInterceptor, "networkErrorEventLogInterceptor");
        return CollectionsKt.listOf((Object[]) new Interceptor[]{loggingInterceptor, logBodyInterceptor, httpCallEventInterceptor, networkErrorEventLogInterceptor});
    }

    public final EventLogBundle provideEventLogBundle(Application app, Resources resources, AdIdProvider adIdProvider, Installation installation, ReleaseVersion releaseVersion) {
        String str;
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        if (resources.getBoolean(C41827R.bool.is_tablet)) {
            str = "Android-tablet";
        } else {
            str = "Android";
        }
        PackageInfo packageInfo$default = Contexts8.getPackageInfo$default(app, 0, 1, null);
        String versionName = releaseVersion.getVersionName();
        String packageName = packageInfo$default.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new EventLogBundle(app, resources, adIdProvider, installation, str, versionName, packageName, releaseVersion.getVersionCode(), BuildVariant.INSTANCE.compute());
    }

    public final PeriodicWorker providePeriodicPerformanceMetricLoggingWorker() {
        return PeriodicPerformanceMetricLoggingWorker.INSTANCE;
    }

    public final PeriodicWorker providePeriodicLoggingWorker() {
        return PeriodicLoggingWorker.INSTANCE;
    }
}
