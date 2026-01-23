package com.robinhood.analytics.firebaseappinstanceid;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FirebaseAppInstanceIdProviderWithCache_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache;", "applicationContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "appInstanceIdPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FirebaseAppInstanceIdProviderWithCache_Factory implements Factory<FirebaseAppInstanceIdProviderWithCache> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<StringPreference> appInstanceIdPref;
    private final Provider<Context> applicationContext;

    @JvmStatic
    public static final FirebaseAppInstanceIdProviderWithCache_Factory create(Provider<Context> provider, Provider<StringPreference> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final FirebaseAppInstanceIdProviderWithCache newInstance(Context context, StringPreference stringPreference) {
        return INSTANCE.newInstance(context, stringPreference);
    }

    public FirebaseAppInstanceIdProviderWithCache_Factory(Provider<Context> applicationContext, Provider<StringPreference> appInstanceIdPref) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(appInstanceIdPref, "appInstanceIdPref");
        this.applicationContext = applicationContext;
        this.appInstanceIdPref = appInstanceIdPref;
    }

    @Override // javax.inject.Provider
    public FirebaseAppInstanceIdProviderWithCache get() {
        Companion companion = INSTANCE;
        Context context = this.applicationContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        StringPreference stringPreference = this.appInstanceIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        return companion.newInstance(context, stringPreference);
    }

    /* compiled from: FirebaseAppInstanceIdProviderWithCache_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache_Factory;", "applicationContext", "Ljavax/inject/Provider;", "Landroid/content/Context;", "appInstanceIdPref", "Lcom/robinhood/prefs/StringPreference;", "newInstance", "Lcom/robinhood/analytics/firebaseappinstanceid/FirebaseAppInstanceIdProviderWithCache;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FirebaseAppInstanceIdProviderWithCache_Factory create(Provider<Context> applicationContext, Provider<StringPreference> appInstanceIdPref) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(appInstanceIdPref, "appInstanceIdPref");
            return new FirebaseAppInstanceIdProviderWithCache_Factory(applicationContext, appInstanceIdPref);
        }

        @JvmStatic
        public final FirebaseAppInstanceIdProviderWithCache newInstance(Context applicationContext, StringPreference appInstanceIdPref) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(appInstanceIdPref, "appInstanceIdPref");
            return new FirebaseAppInstanceIdProviderWithCache(applicationContext, appInstanceIdPref);
        }
    }
}
