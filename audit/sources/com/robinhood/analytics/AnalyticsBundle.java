package com.robinhood.analytics;

import android.content.Context;
import com.robinhood.analytics.api.TraderAnalyticsApi;
import com.robinhood.analytics.dao.SharedEventLogDatabase;
import com.robinhood.analytics.dao.SharedLegacyEventDao;
import com.robinhood.analytics.firebaseappinstanceid.FirebaseAppInstanceIdProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.Installation;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: AnalyticsBundle.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\u0010\u001d\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\u001d\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, m3636d2 = {"Lcom/robinhood/analytics/AnalyticsBundle;", "", "Landroid/content/Context;", "context", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/analytics/AnalyticsPrefs;", "analyticsPrefs", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "dao", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "firebaseAppInstanceIdProvider", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "analytics", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/analytics/AdIdProvider;", "adIdProvider", "", "platform", "versionName", "applicationId", "", "versionCode", "Lcom/robinhood/utils/buildconfig/BuildVariant;", "buildVariant", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "eventLogDatabase", "<init>", "(Landroid/content/Context;Lj$/time/Clock;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/analytics/AnalyticsPrefs;Lcom/robinhood/analytics/dao/SharedLegacyEventDao;Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;Lcom/robinhood/analytics/api/TraderAnalyticsApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/analytics/AdIdProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/robinhood/utils/buildconfig/BuildVariant;Lcom/robinhood/analytics/dao/SharedEventLogDatabase;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "Lcom/robinhood/analytics/AnalyticsPrefs;", "getAnalyticsPrefs", "()Lcom/robinhood/analytics/AnalyticsPrefs;", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "getDao", "()Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "getFirebaseAppInstanceIdProvider", "()Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProvider;", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "getAnalytics", "()Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "Lcom/robinhood/prefs/Installation;", "getInstallation", "()Lcom/robinhood/prefs/Installation;", "Lcom/robinhood/analytics/AdIdProvider;", "getAdIdProvider", "()Lcom/robinhood/analytics/AdIdProvider;", "Ljava/lang/String;", "getPlatform", "()Ljava/lang/String;", "getVersionName", "getApplicationId", "J", "getVersionCode", "()J", "Lcom/robinhood/utils/buildconfig/BuildVariant;", "getBuildVariant", "()Lcom/robinhood/utils/buildconfig/BuildVariant;", "Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "getEventLogDatabase", "()Lcom/robinhood/analytics/dao/SharedEventLogDatabase;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AnalyticsBundle {
    private final AdIdProvider adIdProvider;
    private final TraderAnalyticsApi analytics;
    private final AnalyticsPrefs analyticsPrefs;
    private final String applicationId;
    private final BuildVariant buildVariant;
    private final Clock clock;
    private final Context context;
    private final SharedLegacyEventDao dao;
    private final SharedEventLogDatabase<?, ?> eventLogDatabase;
    private final FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider;
    private final Installation installation;
    private final LazyMoshi moshi;
    private final String platform;
    private final long versionCode;
    private final String versionName;

    public AnalyticsBundle(Context context, Clock clock, LazyMoshi moshi, AnalyticsPrefs analyticsPrefs, SharedLegacyEventDao dao, FirebaseAppInstanceIdProvider firebaseAppInstanceIdProvider, TraderAnalyticsApi analytics, Installation installation, AdIdProvider adIdProvider, String platform, String versionName, String applicationId, long j, BuildVariant buildVariant, SharedEventLogDatabase<?, ?> eventLogDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(analyticsPrefs, "analyticsPrefs");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdProvider, "firebaseAppInstanceIdProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(buildVariant, "buildVariant");
        Intrinsics.checkNotNullParameter(eventLogDatabase, "eventLogDatabase");
        this.context = context;
        this.clock = clock;
        this.moshi = moshi;
        this.analyticsPrefs = analyticsPrefs;
        this.dao = dao;
        this.firebaseAppInstanceIdProvider = firebaseAppInstanceIdProvider;
        this.analytics = analytics;
        this.installation = installation;
        this.adIdProvider = adIdProvider;
        this.platform = platform;
        this.versionName = versionName;
        this.applicationId = applicationId;
        this.versionCode = j;
        this.buildVariant = buildVariant;
        this.eventLogDatabase = eventLogDatabase;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final LazyMoshi getMoshi() {
        return this.moshi;
    }

    public final AnalyticsPrefs getAnalyticsPrefs() {
        return this.analyticsPrefs;
    }

    public final SharedLegacyEventDao getDao() {
        return this.dao;
    }

    public final FirebaseAppInstanceIdProvider getFirebaseAppInstanceIdProvider() {
        return this.firebaseAppInstanceIdProvider;
    }

    public final TraderAnalyticsApi getAnalytics() {
        return this.analytics;
    }

    public final Installation getInstallation() {
        return this.installation;
    }

    public final AdIdProvider getAdIdProvider() {
        return this.adIdProvider;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final BuildVariant getBuildVariant() {
        return this.buildVariant;
    }

    public final SharedEventLogDatabase<?, ?> getEventLogDatabase() {
        return this.eventLogDatabase;
    }
}
