package com.robinhood.shared.security.authmanager;

import android.content.Context;
import android.content.SharedPreferences;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.database.BaseDbHelper;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.referral.branch.BranchManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.security.authmanager.RealAuthManager_MembersInjector;
import com.robinhood.shared.security.recaptcha.RecaptchaManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.supportchat.ChatCachedImageCleaner;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

/* compiled from: RealAuthManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LBÃ\u0004\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\u0017\u0010 \u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\"0!¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u0010#\u001a\r\u0012\t\u0012\u00070$¢\u0006\u0002\b\u00130\u0004\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0004\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004\u0012\u0011\u0010/\u001a\r\u0012\t\u0012\u000700¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u00101\u001a\r\u0012\t\u0012\u000702¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u00103\u001a\r\u0012\t\u0012\u000704¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u00105\u001a\r\u0012\t\u0012\u000706¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u00107\u001a\r\u0012\t\u0012\u000708¢\u0006\u0002\b\u00130\u0004\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0004\u0012\u0011\u0010;\u001a\r\u0012\t\u0012\u00070<¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u0010=\u001a\r\u0012\t\u0012\u00070>¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u0010?\u001a\r\u0012\t\u0012\u00070@¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u0010A\u001a\r\u0012\t\u0012\u00070B¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u0010C\u001a\r\u0012\t\u0012\u00070D¢\u0006\u0002\b\u00130\u0004\u0012\u0011\u0010E\u001a\r\u0012\t\u0012\u00070F¢\u0006\u0002\b\u00130\u0004\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u0004¢\u0006\u0004\bI\u0010JJ\b\u0010K\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\"0!¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010#\u001a\r\u0012\t\u0012\u00070$¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010/\u001a\r\u0012\t\u0012\u000700¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00101\u001a\r\u0012\t\u0012\u000702¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00103\u001a\r\u0012\t\u0012\u000704¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00105\u001a\r\u0012\t\u0012\u000706¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00107\u001a\r\u0012\t\u0012\u000708¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010;\u001a\r\u0012\t\u0012\u00070<¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010=\u001a\r\u0012\t\u0012\u00070>¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010?\u001a\r\u0012\t\u0012\u00070@¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010A\u001a\r\u0012\t\u0012\u00070B¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010C\u001a\r\u0012\t\u0012\u00070D¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010E\u001a\r\u0012\t\u0012\u00070F¢\u0006\u0002\b\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/RealAuthManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "context", "Landroid/content/Context;", "userLifecycleListeners", "", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "userEmailPref", "userUuidPref", "userLocalityPref", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "crashlyticsUserIdPref", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "hasEverLoggedInPref", "Lcom/robinhood/prefs/BooleanPreference;", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "dbHelper", "Lcom/robinhood/database/BaseDbHelper;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "okHttpCache", "Lokhttp3/Cache;", "okHttpConnectionPool", "Lokhttp3/ConnectionPool;", "okHttpDispatcher", "Lokhttp3/Dispatcher;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RealAuthManager_Factory implements Factory<RealAuthManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AuthTokenManager> authTokenManager;
    private final Provider<BiometricChangeManager> biometricChangeManager;
    private final Provider<BranchManager> branchManager;
    private final Provider<ChatCachedImageCleaner> chatCachedImageCleaner;
    private final Provider<Context> context;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<StringPreference> crashlyticsUserIdPref;
    private final Provider<BaseDbHelper> dbHelper;
    private final Provider<DiscoveryApi> discoveryApi;
    private final Provider<Endpoint> endpoint;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GcmManager> gcmManager;
    private final Provider<BooleanPreference> hasEverLoggedInPref;
    private final Provider<LogoutKillswitch> logoutKillswitch;
    private final Provider<Navigator> navigator;
    private final Provider<NightModeManager> nightModeManager;
    private final Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref;
    private final Provider<Cache> okHttpCache;
    private final Provider<ConnectionPool> okHttpConnectionPool;
    private final Provider<Dispatcher> okHttpDispatcher;
    private final Provider<PersistentCacheManager> persistentCacheManager;
    private final Provider<RecaptchaManager> recaptchaManager;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<RxFactory> rxFactory;
    private final Provider<Sheriff> sheriff;
    private final Provider<TrustedDeviceIdPref> trustedDeviceIdPref;
    private final Provider<StringPreference> userEmailPref;
    private final Provider<Set<UserLifecycleListener>> userLifecycleListeners;
    private final Provider<StringPreference> userLocalityPref;
    private final Provider<SharedPreferences> userPrefs;
    private final Provider<UserStore> userStore;
    private final Provider<StringPreference> userUuidPref;
    private final Provider<StringPreference> usernamePref;

    @JvmStatic
    public static final RealAuthManager_Factory create(Provider<CoroutineScope> provider, Provider<AuthTokenManager> provider2, Provider<UserStore> provider3, Provider<RxFactory> provider4, Provider<RhProcessLifecycleOwner> provider5, Provider<Context> provider6, Provider<Set<UserLifecycleListener>> provider7, Provider<AnalyticsLogger> provider8, Provider<EventLogger> provider9, Provider<StringPreference> provider10, Provider<StringPreference> provider11, Provider<StringPreference> provider12, Provider<StringPreference> provider13, Provider<TrustedDeviceIdPref> provider14, Provider<StringPreference> provider15, Provider<MoshiSecurePreference<OAuthToken>> provider16, Provider<BranchManager> provider17, Provider<ExperimentsStore> provider18, Provider<PersistentCacheManager> provider19, Provider<BooleanPreference> provider20, Provider<BiometricChangeManager> provider21, Provider<RecaptchaManager> provider22, Provider<Sheriff> provider23, Provider<DiscoveryApi> provider24, Provider<SharedPreferences> provider25, Provider<GcmManager> provider26, Provider<BaseDbHelper> provider27, Provider<Endpoint> provider28, Provider<LogoutKillswitch> provider29, Provider<Cache> provider30, Provider<ConnectionPool> provider31, Provider<Dispatcher> provider32, Provider<Navigator> provider33, Provider<ChatCachedImageCleaner> provider34, Provider<NightModeManager> provider35) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35);
    }

    @JvmStatic
    public static final RealAuthManager newInstance(CoroutineScope coroutineScope, AuthTokenManager authTokenManager, UserStore userStore, RxFactory rxFactory, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        return INSTANCE.newInstance(coroutineScope, authTokenManager, userStore, rxFactory, rhProcessLifecycleOwner);
    }

    public RealAuthManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<AuthTokenManager> authTokenManager, Provider<UserStore> userStore, Provider<RxFactory> rxFactory, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<Context> context, Provider<Set<UserLifecycleListener>> userLifecycleListeners, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<StringPreference> usernamePref, Provider<StringPreference> userEmailPref, Provider<StringPreference> userUuidPref, Provider<StringPreference> userLocalityPref, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<StringPreference> crashlyticsUserIdPref, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<BranchManager> branchManager, Provider<ExperimentsStore> experimentsStore, Provider<PersistentCacheManager> persistentCacheManager, Provider<BooleanPreference> hasEverLoggedInPref, Provider<BiometricChangeManager> biometricChangeManager, Provider<RecaptchaManager> recaptchaManager, Provider<Sheriff> sheriff, Provider<DiscoveryApi> discoveryApi, Provider<SharedPreferences> userPrefs, Provider<GcmManager> gcmManager, Provider<BaseDbHelper> dbHelper, Provider<Endpoint> endpoint, Provider<LogoutKillswitch> logoutKillswitch, Provider<Cache> okHttpCache, Provider<ConnectionPool> okHttpConnectionPool, Provider<Dispatcher> okHttpDispatcher, Provider<Navigator> navigator, Provider<ChatCachedImageCleaner> chatCachedImageCleaner, Provider<NightModeManager> nightModeManager) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userLifecycleListeners, "userLifecycleListeners");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
        Intrinsics.checkNotNullParameter(userEmailPref, "userEmailPref");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(crashlyticsUserIdPref, "crashlyticsUserIdPref");
        Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
        Intrinsics.checkNotNullParameter(branchManager, "branchManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(hasEverLoggedInPref, "hasEverLoggedInPref");
        Intrinsics.checkNotNullParameter(biometricChangeManager, "biometricChangeManager");
        Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
        Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(okHttpCache, "okHttpCache");
        Intrinsics.checkNotNullParameter(okHttpConnectionPool, "okHttpConnectionPool");
        Intrinsics.checkNotNullParameter(okHttpDispatcher, "okHttpDispatcher");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(chatCachedImageCleaner, "chatCachedImageCleaner");
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        this.coroutineScope = coroutineScope;
        this.authTokenManager = authTokenManager;
        this.userStore = userStore;
        this.rxFactory = rxFactory;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.context = context;
        this.userLifecycleListeners = userLifecycleListeners;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.usernamePref = usernamePref;
        this.userEmailPref = userEmailPref;
        this.userUuidPref = userUuidPref;
        this.userLocalityPref = userLocalityPref;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.crashlyticsUserIdPref = crashlyticsUserIdPref;
        this.oAuthTokenPref = oAuthTokenPref;
        this.branchManager = branchManager;
        this.experimentsStore = experimentsStore;
        this.persistentCacheManager = persistentCacheManager;
        this.hasEverLoggedInPref = hasEverLoggedInPref;
        this.biometricChangeManager = biometricChangeManager;
        this.recaptchaManager = recaptchaManager;
        this.sheriff = sheriff;
        this.discoveryApi = discoveryApi;
        this.userPrefs = userPrefs;
        this.gcmManager = gcmManager;
        this.dbHelper = dbHelper;
        this.endpoint = endpoint;
        this.logoutKillswitch = logoutKillswitch;
        this.okHttpCache = okHttpCache;
        this.okHttpConnectionPool = okHttpConnectionPool;
        this.okHttpDispatcher = okHttpDispatcher;
        this.navigator = navigator;
        this.chatCachedImageCleaner = chatCachedImageCleaner;
        this.nightModeManager = nightModeManager;
    }

    @Override // javax.inject.Provider
    public RealAuthManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        AuthTokenManager authTokenManager = this.authTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(authTokenManager, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        RealAuthManager realAuthManagerNewInstance = companion.newInstance(coroutineScope, authTokenManager, userStore, rxFactory, rhProcessLifecycleOwner);
        RealAuthManager_MembersInjector.Companion companion2 = RealAuthManager_MembersInjector.INSTANCE;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        companion2.injectContext(realAuthManagerNewInstance, context);
        Set<UserLifecycleListener> set = this.userLifecycleListeners.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        companion2.injectUserLifecycleListeners(realAuthManagerNewInstance, set);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(realAuthManagerNewInstance, analyticsLogger);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(realAuthManagerNewInstance, eventLogger);
        StringPreference stringPreference = this.usernamePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectUsernamePref(realAuthManagerNewInstance, stringPreference);
        StringPreference stringPreference2 = this.userEmailPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        companion2.injectUserEmailPref(realAuthManagerNewInstance, stringPreference2);
        StringPreference stringPreference3 = this.userUuidPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        companion2.injectUserUuidPref(realAuthManagerNewInstance, stringPreference3);
        StringPreference stringPreference4 = this.userLocalityPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference4, "get(...)");
        companion2.injectUserLocalityPref(realAuthManagerNewInstance, stringPreference4);
        TrustedDeviceIdPref trustedDeviceIdPref = this.trustedDeviceIdPref.get();
        Intrinsics.checkNotNullExpressionValue(trustedDeviceIdPref, "get(...)");
        companion2.injectTrustedDeviceIdPref(realAuthManagerNewInstance, trustedDeviceIdPref);
        StringPreference stringPreference5 = this.crashlyticsUserIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference5, "get(...)");
        companion2.injectCrashlyticsUserIdPref(realAuthManagerNewInstance, stringPreference5);
        MoshiSecurePreference<OAuthToken> moshiSecurePreference = this.oAuthTokenPref.get();
        Intrinsics.checkNotNullExpressionValue(moshiSecurePreference, "get(...)");
        companion2.injectOAuthTokenPref(realAuthManagerNewInstance, moshiSecurePreference);
        Lazy<BranchManager> lazy = DoubleCheck.lazy(this.branchManager);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        companion2.injectBranchManager(realAuthManagerNewInstance, lazy);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(realAuthManagerNewInstance, experimentsStore);
        PersistentCacheManager persistentCacheManager = this.persistentCacheManager.get();
        Intrinsics.checkNotNullExpressionValue(persistentCacheManager, "get(...)");
        companion2.injectPersistentCacheManager(realAuthManagerNewInstance, persistentCacheManager);
        BooleanPreference booleanPreference = this.hasEverLoggedInPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectHasEverLoggedInPref(realAuthManagerNewInstance, booleanPreference);
        BiometricChangeManager biometricChangeManager = this.biometricChangeManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricChangeManager, "get(...)");
        companion2.injectBiometricChangeManager(realAuthManagerNewInstance, biometricChangeManager);
        RecaptchaManager recaptchaManager = this.recaptchaManager.get();
        Intrinsics.checkNotNullExpressionValue(recaptchaManager, "get(...)");
        companion2.injectRecaptchaManager(realAuthManagerNewInstance, recaptchaManager);
        Lazy<Sheriff> lazy2 = DoubleCheck.lazy(this.sheriff);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        companion2.injectSheriff(realAuthManagerNewInstance, lazy2);
        Lazy<DiscoveryApi> lazy3 = DoubleCheck.lazy(this.discoveryApi);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        companion2.injectDiscoveryApi(realAuthManagerNewInstance, lazy3);
        Lazy<SharedPreferences> lazy4 = DoubleCheck.lazy(this.userPrefs);
        Intrinsics.checkNotNullExpressionValue(lazy4, "lazy(...)");
        companion2.injectUserPrefs(realAuthManagerNewInstance, lazy4);
        Lazy<GcmManager> lazy5 = DoubleCheck.lazy(this.gcmManager);
        Intrinsics.checkNotNullExpressionValue(lazy5, "lazy(...)");
        companion2.injectGcmManager(realAuthManagerNewInstance, lazy5);
        Lazy<BaseDbHelper> lazy6 = DoubleCheck.lazy(this.dbHelper);
        Intrinsics.checkNotNullExpressionValue(lazy6, "lazy(...)");
        companion2.injectDbHelper(realAuthManagerNewInstance, lazy6);
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        companion2.injectEndpoint(realAuthManagerNewInstance, endpoint);
        Lazy<LogoutKillswitch> lazy7 = DoubleCheck.lazy(this.logoutKillswitch);
        Intrinsics.checkNotNullExpressionValue(lazy7, "lazy(...)");
        companion2.injectLogoutKillswitch(realAuthManagerNewInstance, lazy7);
        Lazy<Cache> lazy8 = DoubleCheck.lazy(this.okHttpCache);
        Intrinsics.checkNotNullExpressionValue(lazy8, "lazy(...)");
        companion2.injectOkHttpCache(realAuthManagerNewInstance, lazy8);
        Lazy<ConnectionPool> lazy9 = DoubleCheck.lazy(this.okHttpConnectionPool);
        Intrinsics.checkNotNullExpressionValue(lazy9, "lazy(...)");
        companion2.injectOkHttpConnectionPool(realAuthManagerNewInstance, lazy9);
        Lazy<Dispatcher> lazy10 = DoubleCheck.lazy(this.okHttpDispatcher);
        Intrinsics.checkNotNullExpressionValue(lazy10, "lazy(...)");
        companion2.injectOkHttpDispatcher(realAuthManagerNewInstance, lazy10);
        Lazy<Navigator> lazy11 = DoubleCheck.lazy(this.navigator);
        Intrinsics.checkNotNullExpressionValue(lazy11, "lazy(...)");
        companion2.injectNavigator(realAuthManagerNewInstance, lazy11);
        Lazy<ChatCachedImageCleaner> lazy12 = DoubleCheck.lazy(this.chatCachedImageCleaner);
        Intrinsics.checkNotNullExpressionValue(lazy12, "lazy(...)");
        companion2.injectChatCachedImageCleaner(realAuthManagerNewInstance, lazy12);
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        companion2.injectNightModeManager(realAuthManagerNewInstance, nightModeManager);
        return realAuthManagerNewInstance;
    }

    /* compiled from: RealAuthManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÄ\u0004\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0017\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0017\u0010#\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020%0$¢\u0006\u0002\b\u00160\u00072\u0011\u0010&\u001a\r\u0012\t\u0012\u00070'¢\u0006\u0002\b\u00160\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00072\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00072\u0011\u00102\u001a\r\u0012\t\u0012\u000703¢\u0006\u0002\b\u00160\u00072\u0011\u00104\u001a\r\u0012\t\u0012\u000705¢\u0006\u0002\b\u00160\u00072\u0011\u00106\u001a\r\u0012\t\u0012\u000707¢\u0006\u0002\b\u00160\u00072\u0011\u00108\u001a\r\u0012\t\u0012\u000709¢\u0006\u0002\b\u00160\u00072\u0011\u0010:\u001a\r\u0012\t\u0012\u00070;¢\u0006\u0002\b\u00160\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00072\u0011\u0010>\u001a\r\u0012\t\u0012\u00070?¢\u0006\u0002\b\u00160\u00072\u0011\u0010@\u001a\r\u0012\t\u0012\u00070A¢\u0006\u0002\b\u00160\u00072\u0011\u0010B\u001a\r\u0012\t\u0012\u00070C¢\u0006\u0002\b\u00160\u00072\u0011\u0010D\u001a\r\u0012\t\u0012\u00070E¢\u0006\u0002\b\u00160\u00072\u0011\u0010F\u001a\r\u0012\t\u0012\u00070G¢\u0006\u0002\b\u00160\u00072\u0011\u0010H\u001a\r\u0012\t\u0012\u00070I¢\u0006\u0002\b\u00160\u00072\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0007H\u0007J0\u0010L\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006N"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/RealAuthManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/authmanager/RealAuthManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "context", "Landroid/content/Context;", "userLifecycleListeners", "", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "userEmailPref", "userUuidPref", "userLocalityPref", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "crashlyticsUserIdPref", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "hasEverLoggedInPref", "Lcom/robinhood/prefs/BooleanPreference;", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "dbHelper", "Lcom/robinhood/database/BaseDbHelper;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "okHttpCache", "Lokhttp3/Cache;", "okHttpConnectionPool", "Lokhttp3/ConnectionPool;", "okHttpDispatcher", "Lokhttp3/Dispatcher;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "newInstance", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealAuthManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<AuthTokenManager> authTokenManager, Provider<UserStore> userStore, Provider<RxFactory> rxFactory, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<Context> context, Provider<Set<UserLifecycleListener>> userLifecycleListeners, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<StringPreference> usernamePref, Provider<StringPreference> userEmailPref, Provider<StringPreference> userUuidPref, Provider<StringPreference> userLocalityPref, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<StringPreference> crashlyticsUserIdPref, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<BranchManager> branchManager, Provider<ExperimentsStore> experimentsStore, Provider<PersistentCacheManager> persistentCacheManager, Provider<BooleanPreference> hasEverLoggedInPref, Provider<BiometricChangeManager> biometricChangeManager, Provider<RecaptchaManager> recaptchaManager, Provider<Sheriff> sheriff, Provider<DiscoveryApi> discoveryApi, Provider<SharedPreferences> userPrefs, Provider<GcmManager> gcmManager, Provider<BaseDbHelper> dbHelper, Provider<Endpoint> endpoint, Provider<LogoutKillswitch> logoutKillswitch, Provider<Cache> okHttpCache, Provider<ConnectionPool> okHttpConnectionPool, Provider<Dispatcher> okHttpDispatcher, Provider<Navigator> navigator, Provider<ChatCachedImageCleaner> chatCachedImageCleaner, Provider<NightModeManager> nightModeManager) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userLifecycleListeners, "userLifecycleListeners");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
            Intrinsics.checkNotNullParameter(userEmailPref, "userEmailPref");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            Intrinsics.checkNotNullParameter(crashlyticsUserIdPref, "crashlyticsUserIdPref");
            Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
            Intrinsics.checkNotNullParameter(branchManager, "branchManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
            Intrinsics.checkNotNullParameter(hasEverLoggedInPref, "hasEverLoggedInPref");
            Intrinsics.checkNotNullParameter(biometricChangeManager, "biometricChangeManager");
            Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
            Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(okHttpCache, "okHttpCache");
            Intrinsics.checkNotNullParameter(okHttpConnectionPool, "okHttpConnectionPool");
            Intrinsics.checkNotNullParameter(okHttpDispatcher, "okHttpDispatcher");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(chatCachedImageCleaner, "chatCachedImageCleaner");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            return new RealAuthManager_Factory(coroutineScope, authTokenManager, userStore, rxFactory, rhProcessLifecycleOwner, context, userLifecycleListeners, analytics, eventLogger, usernamePref, userEmailPref, userUuidPref, userLocalityPref, trustedDeviceIdPref, crashlyticsUserIdPref, oAuthTokenPref, branchManager, experimentsStore, persistentCacheManager, hasEverLoggedInPref, biometricChangeManager, recaptchaManager, sheriff, discoveryApi, userPrefs, gcmManager, dbHelper, endpoint, logoutKillswitch, okHttpCache, okHttpConnectionPool, okHttpDispatcher, navigator, chatCachedImageCleaner, nightModeManager);
        }

        @JvmStatic
        public final RealAuthManager newInstance(CoroutineScope coroutineScope, AuthTokenManager authTokenManager, UserStore userStore, RxFactory rxFactory, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new RealAuthManager(coroutineScope, authTokenManager, userStore, rxFactory, rhProcessLifecycleOwner);
        }
    }
}
