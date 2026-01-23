package com.robinhood.android.analytics.provisions;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import com.robinhood.analytics.AdIdProvider;
import com.robinhood.analytics.AnalyticsBundle;
import com.robinhood.analytics.AnalyticsPrefs;
import com.robinhood.analytics.api.TraderAnalyticsApi;
import com.robinhood.analytics.dao.SharedEventLogDatabase;
import com.robinhood.analytics.dao.SharedLegacyEventDao;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.networking.OkHttpClientFactory;
import com.robinhood.networking.annotation.RobinhoodInterceptor;
import com.robinhood.networking.interceptor.GzipRequestInterceptor;
import com.robinhood.networking.util.Retrofits;
import com.robinhood.prefs.Installation;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.Preconditions4;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.dagger.LazyKt;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import dagger.internal.Provider;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p479j$.time.Clock;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.converter.wire.WireConverterFactory;

/* compiled from: AnalyticsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014Jw\u0010-\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u000e\u0010+\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030*H\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/AnalyticsModule;", "", "<init>", "()V", "Lcom/robinhood/targetbackend/Endpoint;", "endpoint", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "clientLazy", "Lretrofit2/Retrofit;", "createRetrofit", "(Lcom/robinhood/targetbackend/Endpoint;Ldagger/Lazy;)Lretrofit2/Retrofit;", "Lcom/robinhood/networking/OkHttpClientFactory;", "clientFactory", "Lokhttp3/Interceptor;", "rhInterceptor", "Lcom/robinhood/networking/interceptor/GzipRequestInterceptor;", "gzipRequestInterceptor", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "provideAnalyticsApi", "(Ldagger/Lazy;Lcom/robinhood/networking/OkHttpClientFactory;Ldagger/Lazy;Lcom/robinhood/networking/interceptor/GzipRequestInterceptor;)Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "Landroid/app/Application;", "app", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/analytics/AdIdProvider;", "adIdProvider", "Lcom/robinhood/analytics/AnalyticsPrefs;", "analyticsPrefs", "analytics", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/utils/ReleaseVersion;", "releaseVersion", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "dao", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "eventLogDatabase", "Lcom/robinhood/analytics/AnalyticsBundle;", "provideAnalyticsBundle", "(Landroid/app/Application;Landroid/content/res/Resources;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/analytics/AdIdProvider;Lcom/robinhood/analytics/AnalyticsPrefs;Lcom/robinhood/analytics/api/TraderAnalyticsApi;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;Lcom/robinhood/prefs/Installation;Lcom/robinhood/utils/ReleaseVersion;Lj$/time/Clock;Lcom/robinhood/analytics/dao/SharedLegacyEventDao;Lcom/robinhood/analytics/dao/SharedEventLogDatabase;)Lcom/robinhood/analytics/AnalyticsBundle;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class AnalyticsModule {
    public static final AnalyticsModule INSTANCE = new AnalyticsModule();

    /* JADX INFO: Access modifiers changed from: private */
    public final Retrofit createRetrofit(Endpoint endpoint, Lazy<OkHttpClient> clientLazy) {
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, clientLazy);
        builder.baseUrl(endpoint.getAnalyticsUrl());
        builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        builder.addConverterFactory(WireConverterFactory.create());
        builder.addConverterFactory(MoshiConverterFactory.create());
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    public final TraderAnalyticsApi provideAnalyticsApi(final Lazy<Endpoint> endpoint, final OkHttpClientFactory clientFactory, @RobinhoodInterceptor final Lazy<Interceptor> rhInterceptor, final GzipRequestInterceptor gzipRequestInterceptor) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
        Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
        Intrinsics.checkNotNullParameter(gzipRequestInterceptor, "gzipRequestInterceptor");
        return (TraderAnalyticsApi) LazyRetrofit3.lazyRetrofitService(TraderAnalyticsApi.class, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.android.analytics.provisions.AnalyticsModule$provideAnalyticsApi$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() throws SecurityException {
                final OkHttpClientFactory okHttpClientFactory = clientFactory;
                final Lazy lazy = rhInterceptor;
                final GzipRequestInterceptor gzipRequestInterceptor2 = gzipRequestInterceptor;
                Lazy lazyDaggerLazy = LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.android.analytics.provisions.AnalyticsModule$provideAnalyticsApi$lambda$1$$inlined$daggerLazy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // javax.inject.Provider
                    public final T get() {
                        Preconditions4.checkNotOnMainThread(Preconditions.INSTANCE);
                        return (T) OkHttpClientFactory.newClient$default(okHttpClientFactory, null, false, CollectionsKt.listOf((Object[]) new Interceptor[]{lazy.get(), gzipRequestInterceptor2}), 3, null);
                    }
                });
                AnalyticsModule analyticsModule = AnalyticsModule.INSTANCE;
                Object obj = endpoint.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Object objCreate = analyticsModule.createRetrofit((Endpoint) obj, lazyDaggerLazy).create(TraderAnalyticsApi.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                return (T) ((TraderAnalyticsApi) objCreate);
            }
        }));
    }

    private AnalyticsModule() {
    }

    public final AnalyticsBundle provideAnalyticsBundle(Application app, Resources resources, LazyMoshi moshi, AdIdProvider adIdProvider, AnalyticsPrefs analyticsPrefs, TraderAnalyticsApi analytics, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, Installation installation, ReleaseVersion releaseVersion, Clock clock, SharedLegacyEventDao dao, SharedEventLogDatabase<?, ?> eventLogDatabase) {
        String str;
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(analyticsPrefs, "analyticsPrefs");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(eventLogDatabase, "eventLogDatabase");
        if (resources.getBoolean(C41827R.bool.is_tablet)) {
            str = "Android-tablet";
        } else {
            str = "Android";
        }
        PackageInfo packageInfo$default = Contexts8.getPackageInfo$default(app, 0, 1, null);
        String versionName = releaseVersion.getVersionName();
        String packageName = packageInfo$default.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new AnalyticsBundle(app, clock, moshi, analyticsPrefs, dao, firebaseAppInstanceIdProvider, analytics, installation, adIdProvider, str, versionName, packageName, releaseVersion.getVersionCode(), BuildVariant.INSTANCE.compute(), eventLogDatabase);
    }
}
