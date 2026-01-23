package com.robinhood.trader.clearcache;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.authmanager.AuthTokenInjectionManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealCacheClearManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/trader/clearcache/RealCacheClearManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/trader/clearcache/RealCacheClearManager;", "authTokenInjectionManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "applicationContext", "Landroid/content/Context;", "pinPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-clear-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class RealCacheClearManager_Factory implements Factory<RealCacheClearManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Context> applicationContext;
    private final Provider<AuthTokenInjectionManager> authTokenInjectionManager;
    private final Provider<Navigator> navigator;
    private final Provider<StringPreference> pinPref;

    @JvmStatic
    public static final RealCacheClearManager_Factory create(Provider<AuthTokenInjectionManager> provider, Provider<Navigator> provider2, Provider<Context> provider3, Provider<StringPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RealCacheClearManager newInstance(AuthTokenInjectionManager authTokenInjectionManager, Navigator navigator, Context context, StringPreference stringPreference) {
        return INSTANCE.newInstance(authTokenInjectionManager, navigator, context, stringPreference);
    }

    public RealCacheClearManager_Factory(Provider<AuthTokenInjectionManager> authTokenInjectionManager, Provider<Navigator> navigator, Provider<Context> applicationContext, Provider<StringPreference> pinPref) {
        Intrinsics.checkNotNullParameter(authTokenInjectionManager, "authTokenInjectionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(pinPref, "pinPref");
        this.authTokenInjectionManager = authTokenInjectionManager;
        this.navigator = navigator;
        this.applicationContext = applicationContext;
        this.pinPref = pinPref;
    }

    @Override // javax.inject.Provider
    public RealCacheClearManager get() {
        Companion companion = INSTANCE;
        AuthTokenInjectionManager authTokenInjectionManager = this.authTokenInjectionManager.get();
        Intrinsics.checkNotNullExpressionValue(authTokenInjectionManager, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        Context context = this.applicationContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        StringPreference stringPreference = this.pinPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        return companion.newInstance(authTokenInjectionManager, navigator, context, stringPreference);
    }

    /* compiled from: RealCacheClearManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/trader/clearcache/RealCacheClearManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/trader/clearcache/RealCacheClearManager_Factory;", "authTokenInjectionManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "applicationContext", "Landroid/content/Context;", "pinPref", "Lcom/robinhood/prefs/StringPreference;", "newInstance", "Lcom/robinhood/trader/clearcache/RealCacheClearManager;", "lib-clear-cache_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealCacheClearManager_Factory create(Provider<AuthTokenInjectionManager> authTokenInjectionManager, Provider<Navigator> navigator, Provider<Context> applicationContext, Provider<StringPreference> pinPref) {
            Intrinsics.checkNotNullParameter(authTokenInjectionManager, "authTokenInjectionManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(pinPref, "pinPref");
            return new RealCacheClearManager_Factory(authTokenInjectionManager, navigator, applicationContext, pinPref);
        }

        @JvmStatic
        public final RealCacheClearManager newInstance(AuthTokenInjectionManager authTokenInjectionManager, Navigator navigator, Context applicationContext, StringPreference pinPref) {
            Intrinsics.checkNotNullParameter(authTokenInjectionManager, "authTokenInjectionManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(pinPref, "pinPref");
            return new RealCacheClearManager(authTokenInjectionManager, navigator, applicationContext, pinPref);
        }
    }
}
