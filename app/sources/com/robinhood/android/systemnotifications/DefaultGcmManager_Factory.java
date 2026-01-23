package com.robinhood.android.systemnotifications;

import android.content.Context;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.retrofit.NotificationsApi;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultGcmManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/DefaultGcmManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/systemnotifications/DefaultGcmManager;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "appContext", "Landroid/content/Context;", "notificationsApi", "Lcom/robinhood/models/api/retrofit/NotificationsApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "registeredDeviceRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "gcmTokenPref", "promptedPushPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DefaultGcmManager_Factory implements Factory<DefaultGcmManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<Context> appContext;
    private final Provider<AppType> appType;
    private final Provider<AuthManager> authManager;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<StringPreference> gcmTokenPref;
    private final Provider<NotificationsApi> notificationsApi;
    private final Provider<BooleanPreference> promptedPushPref;
    private final Provider<StringPreference> registeredDeviceRhIdPref;

    @JvmStatic
    public static final DefaultGcmManager_Factory create(Provider<AnalyticsLogger> provider, Provider<AppType> provider2, Provider<Context> provider3, Provider<NotificationsApi> provider4, Provider<AuthManager> provider5, Provider<StringPreference> provider6, Provider<CoroutineScope> provider7, Provider<StringPreference> provider8, Provider<BooleanPreference> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final DefaultGcmManager newInstance(AnalyticsLogger analyticsLogger, AppType appType, Context context, NotificationsApi notificationsApi, AuthManager authManager, StringPreference stringPreference, CoroutineScope coroutineScope, StringPreference stringPreference2, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(analyticsLogger, appType, context, notificationsApi, authManager, stringPreference, coroutineScope, stringPreference2, booleanPreference);
    }

    public DefaultGcmManager_Factory(Provider<AnalyticsLogger> analytics, Provider<AppType> appType, Provider<Context> appContext, Provider<NotificationsApi> notificationsApi, Provider<AuthManager> authManager, Provider<StringPreference> registeredDeviceRhIdPref, Provider<CoroutineScope> coroutineScope, Provider<StringPreference> gcmTokenPref, Provider<BooleanPreference> promptedPushPref) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(notificationsApi, "notificationsApi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(registeredDeviceRhIdPref, "registeredDeviceRhIdPref");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(gcmTokenPref, "gcmTokenPref");
        Intrinsics.checkNotNullParameter(promptedPushPref, "promptedPushPref");
        this.analytics = analytics;
        this.appType = appType;
        this.appContext = appContext;
        this.notificationsApi = notificationsApi;
        this.authManager = authManager;
        this.registeredDeviceRhIdPref = registeredDeviceRhIdPref;
        this.coroutineScope = coroutineScope;
        this.gcmTokenPref = gcmTokenPref;
        this.promptedPushPref = promptedPushPref;
    }

    @Override // javax.inject.Provider
    public DefaultGcmManager get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        Context context = this.appContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        NotificationsApi notificationsApi = this.notificationsApi.get();
        Intrinsics.checkNotNullExpressionValue(notificationsApi, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        StringPreference stringPreference = this.registeredDeviceRhIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        StringPreference stringPreference2 = this.gcmTokenPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        BooleanPreference booleanPreference = this.promptedPushPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(analyticsLogger, appType, context, notificationsApi, authManager, stringPreference, coroutineScope, stringPreference2, booleanPreference);
    }

    /* compiled from: DefaultGcmManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007H\u0007JP\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/systemnotifications/DefaultGcmManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/systemnotifications/DefaultGcmManager_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "appContext", "Landroid/content/Context;", "notificationsApi", "Lcom/robinhood/models/api/retrofit/NotificationsApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "registeredDeviceRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "gcmTokenPref", "promptedPushPref", "Lcom/robinhood/prefs/BooleanPreference;", "newInstance", "Lcom/robinhood/android/systemnotifications/DefaultGcmManager;", "lib-system-notifications_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DefaultGcmManager_Factory create(Provider<AnalyticsLogger> analytics, Provider<AppType> appType, Provider<Context> appContext, Provider<NotificationsApi> notificationsApi, Provider<AuthManager> authManager, Provider<StringPreference> registeredDeviceRhIdPref, Provider<CoroutineScope> coroutineScope, Provider<StringPreference> gcmTokenPref, Provider<BooleanPreference> promptedPushPref) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(notificationsApi, "notificationsApi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(registeredDeviceRhIdPref, "registeredDeviceRhIdPref");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(gcmTokenPref, "gcmTokenPref");
            Intrinsics.checkNotNullParameter(promptedPushPref, "promptedPushPref");
            return new DefaultGcmManager_Factory(analytics, appType, appContext, notificationsApi, authManager, registeredDeviceRhIdPref, coroutineScope, gcmTokenPref, promptedPushPref);
        }

        @JvmStatic
        public final DefaultGcmManager newInstance(AnalyticsLogger analytics, AppType appType, Context appContext, NotificationsApi notificationsApi, AuthManager authManager, StringPreference registeredDeviceRhIdPref, CoroutineScope coroutineScope, StringPreference gcmTokenPref, BooleanPreference promptedPushPref) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(notificationsApi, "notificationsApi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(registeredDeviceRhIdPref, "registeredDeviceRhIdPref");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(gcmTokenPref, "gcmTokenPref");
            Intrinsics.checkNotNullParameter(promptedPushPref, "promptedPushPref");
            return new DefaultGcmManager(analytics, appType, appContext, notificationsApi, authManager, registeredDeviceRhIdPref, coroutineScope, gcmTokenPref, promptedPushPref);
        }
    }
}
