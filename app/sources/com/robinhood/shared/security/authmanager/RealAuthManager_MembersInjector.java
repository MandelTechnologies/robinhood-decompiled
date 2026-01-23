package com.robinhood.shared.security.authmanager;

import android.content.Context;
import android.content.SharedPreferences;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.common.data.prefs.CrashlyticsUserId;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.database.BaseDbHelper;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.prefs.annotation.HasEverLoggedInPref;
import com.robinhood.prefs.annotation.UserEmailPref;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.prefs.annotation.UsernamePref;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.referral.branch.BranchManager;
import com.robinhood.shared.security.recaptcha.RecaptchaManager;
import com.robinhood.store.supportchat.ChatCachedImageCleaner;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.LogoutKillswitch;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;

/* compiled from: RealAuthManager_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DBý\u0003\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\t0\u0004\u0012\u0011\u0010\u0019\u001a\r\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\t0\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004\u0012\u0011\u0010%\u001a\r\u0012\t\u0012\u00070&¢\u0006\u0002\b\t0\u0004\u0012\u0011\u0010'\u001a\r\u0012\t\u0012\u00070(¢\u0006\u0002\b\t0\u0004\u0012\u0011\u0010)\u001a\r\u0012\t\u0012\u00070*¢\u0006\u0002\b\t0\u0004\u0012\u0011\u0010+\u001a\r\u0012\t\u0012\u00070,¢\u0006\u0002\b\t0\u0004\u0012\u0011\u0010-\u001a\r\u0012\t\u0012\u00070.¢\u0006\u0002\b\t0\u0004\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0004\u0012\u0011\u00101\u001a\r\u0012\t\u0012\u000702¢\u0006\u0002\b\t0\u0004\u0012\u0011\u00103\u001a\r\u0012\t\u0012\u000704¢\u0006\u0002\b\t0\u0004\u0012\u0011\u00105\u001a\r\u0012\t\u0012\u000706¢\u0006\u0002\b\t0\u0004\u0012\u0011\u00107\u001a\r\u0012\t\u0012\u000708¢\u0006\u0002\b\t0\u0004\u0012\u0011\u00109\u001a\r\u0012\t\u0012\u00070:¢\u0006\u0002\b\t0\u0004\u0012\u0011\u0010;\u001a\r\u0012\t\u0012\u00070<¢\u0006\u0002\b\t0\u0004\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0004¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\r\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010%\u001a\r\u0012\t\u0012\u00070&¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010'\u001a\r\u0012\t\u0012\u00070(¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010)\u001a\r\u0012\t\u0012\u00070*¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010+\u001a\r\u0012\t\u0012\u00070,¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010-\u001a\r\u0012\t\u0012\u00070.¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00101\u001a\r\u0012\t\u0012\u000702¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00103\u001a\r\u0012\t\u0012\u000704¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00105\u001a\r\u0012\t\u0012\u000706¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00107\u001a\r\u0012\t\u0012\u000708¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00109\u001a\r\u0012\t\u0012\u00070:¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010;\u001a\r\u0012\t\u0012\u00070<¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/RealAuthManager_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "userLifecycleListeners", "", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "userEmailPref", "userUuidPref", "userLocalityPref", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "crashlyticsUserIdPref", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "hasEverLoggedInPref", "Lcom/robinhood/prefs/BooleanPreference;", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "dbHelper", "Lcom/robinhood/database/BaseDbHelper;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "okHttpCache", "Lokhttp3/Cache;", "okHttpConnectionPool", "Lokhttp3/ConnectionPool;", "okHttpDispatcher", "Lokhttp3/Dispatcher;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RealAuthManager_MembersInjector implements MembersInjector<RealAuthManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BiometricChangeManager> biometricChangeManager;
    private final Provider<BranchManager> branchManager;
    private final Provider<ChatCachedImageCleaner> chatCachedImageCleaner;
    private final Provider<Context> context;
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
    private final Provider<Sheriff> sheriff;
    private final Provider<TrustedDeviceIdPref> trustedDeviceIdPref;
    private final Provider<StringPreference> userEmailPref;
    private final Provider<Set<UserLifecycleListener>> userLifecycleListeners;
    private final Provider<StringPreference> userLocalityPref;
    private final Provider<SharedPreferences> userPrefs;
    private final Provider<StringPreference> userUuidPref;
    private final Provider<StringPreference> usernamePref;

    @JvmStatic
    public static final MembersInjector<RealAuthManager> create(Provider<Context> provider, Provider<Set<UserLifecycleListener>> provider2, Provider<AnalyticsLogger> provider3, Provider<EventLogger> provider4, Provider<StringPreference> provider5, Provider<StringPreference> provider6, Provider<StringPreference> provider7, Provider<StringPreference> provider8, Provider<TrustedDeviceIdPref> provider9, Provider<StringPreference> provider10, Provider<MoshiSecurePreference<OAuthToken>> provider11, Provider<BranchManager> provider12, Provider<ExperimentsStore> provider13, Provider<PersistentCacheManager> provider14, Provider<BooleanPreference> provider15, Provider<BiometricChangeManager> provider16, Provider<RecaptchaManager> provider17, Provider<Sheriff> provider18, Provider<DiscoveryApi> provider19, Provider<SharedPreferences> provider20, Provider<GcmManager> provider21, Provider<BaseDbHelper> provider22, Provider<Endpoint> provider23, Provider<LogoutKillswitch> provider24, Provider<Cache> provider25, Provider<ConnectionPool> provider26, Provider<Dispatcher> provider27, Provider<Navigator> provider28, Provider<ChatCachedImageCleaner> provider29, Provider<NightModeManager> provider30) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30);
    }

    @JvmStatic
    public static final void injectAnalytics(RealAuthManager realAuthManager, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(realAuthManager, analyticsLogger);
    }

    @JvmStatic
    public static final void injectBiometricChangeManager(RealAuthManager realAuthManager, BiometricChangeManager biometricChangeManager) {
        INSTANCE.injectBiometricChangeManager(realAuthManager, biometricChangeManager);
    }

    @JvmStatic
    public static final void injectBranchManager(RealAuthManager realAuthManager, Lazy<BranchManager> lazy) {
        INSTANCE.injectBranchManager(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectChatCachedImageCleaner(RealAuthManager realAuthManager, Lazy<ChatCachedImageCleaner> lazy) {
        INSTANCE.injectChatCachedImageCleaner(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectContext(RealAuthManager realAuthManager, Context context) {
        INSTANCE.injectContext(realAuthManager, context);
    }

    @JvmStatic
    @CrashlyticsUserId
    public static final void injectCrashlyticsUserIdPref(RealAuthManager realAuthManager, StringPreference stringPreference) {
        INSTANCE.injectCrashlyticsUserIdPref(realAuthManager, stringPreference);
    }

    @JvmStatic
    public static final void injectDbHelper(RealAuthManager realAuthManager, Lazy<BaseDbHelper> lazy) {
        INSTANCE.injectDbHelper(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectDiscoveryApi(RealAuthManager realAuthManager, Lazy<DiscoveryApi> lazy) {
        INSTANCE.injectDiscoveryApi(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectEndpoint(RealAuthManager realAuthManager, Endpoint endpoint) {
        INSTANCE.injectEndpoint(realAuthManager, endpoint);
    }

    @JvmStatic
    public static final void injectEventLogger(RealAuthManager realAuthManager, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(realAuthManager, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(RealAuthManager realAuthManager, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(realAuthManager, experimentsStore);
    }

    @JvmStatic
    public static final void injectGcmManager(RealAuthManager realAuthManager, Lazy<GcmManager> lazy) {
        INSTANCE.injectGcmManager(realAuthManager, lazy);
    }

    @JvmStatic
    @HasEverLoggedInPref
    public static final void injectHasEverLoggedInPref(RealAuthManager realAuthManager, BooleanPreference booleanPreference) {
        INSTANCE.injectHasEverLoggedInPref(realAuthManager, booleanPreference);
    }

    @JvmStatic
    public static final void injectLogoutKillswitch(RealAuthManager realAuthManager, Lazy<LogoutKillswitch> lazy) {
        INSTANCE.injectLogoutKillswitch(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectNavigator(RealAuthManager realAuthManager, Lazy<Navigator> lazy) {
        INSTANCE.injectNavigator(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectNightModeManager(RealAuthManager realAuthManager, NightModeManager nightModeManager) {
        INSTANCE.injectNightModeManager(realAuthManager, nightModeManager);
    }

    @JvmStatic
    public static final void injectOAuthTokenPref(RealAuthManager realAuthManager, MoshiSecurePreference<OAuthToken> moshiSecurePreference) {
        INSTANCE.injectOAuthTokenPref(realAuthManager, moshiSecurePreference);
    }

    @JvmStatic
    public static final void injectOkHttpCache(RealAuthManager realAuthManager, Lazy<Cache> lazy) {
        INSTANCE.injectOkHttpCache(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectOkHttpConnectionPool(RealAuthManager realAuthManager, Lazy<ConnectionPool> lazy) {
        INSTANCE.injectOkHttpConnectionPool(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectOkHttpDispatcher(RealAuthManager realAuthManager, Lazy<Dispatcher> lazy) {
        INSTANCE.injectOkHttpDispatcher(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectPersistentCacheManager(RealAuthManager realAuthManager, PersistentCacheManager persistentCacheManager) {
        INSTANCE.injectPersistentCacheManager(realAuthManager, persistentCacheManager);
    }

    @JvmStatic
    public static final void injectRecaptchaManager(RealAuthManager realAuthManager, RecaptchaManager recaptchaManager) {
        INSTANCE.injectRecaptchaManager(realAuthManager, recaptchaManager);
    }

    @JvmStatic
    public static final void injectSheriff(RealAuthManager realAuthManager, Lazy<Sheriff> lazy) {
        INSTANCE.injectSheriff(realAuthManager, lazy);
    }

    @JvmStatic
    public static final void injectTrustedDeviceIdPref(RealAuthManager realAuthManager, TrustedDeviceIdPref trustedDeviceIdPref) {
        INSTANCE.injectTrustedDeviceIdPref(realAuthManager, trustedDeviceIdPref);
    }

    @JvmStatic
    @UserEmailPref
    public static final void injectUserEmailPref(RealAuthManager realAuthManager, StringPreference stringPreference) {
        INSTANCE.injectUserEmailPref(realAuthManager, stringPreference);
    }

    @JvmStatic
    public static final void injectUserLifecycleListeners(RealAuthManager realAuthManager, Set<UserLifecycleListener> set) {
        INSTANCE.injectUserLifecycleListeners(realAuthManager, set);
    }

    @JvmStatic
    @UserLocalityPref
    public static final void injectUserLocalityPref(RealAuthManager realAuthManager, StringPreference stringPreference) {
        INSTANCE.injectUserLocalityPref(realAuthManager, stringPreference);
    }

    @JvmStatic
    @UserPrefs
    public static final void injectUserPrefs(RealAuthManager realAuthManager, Lazy<SharedPreferences> lazy) {
        INSTANCE.injectUserPrefs(realAuthManager, lazy);
    }

    @UserUuidPref
    @JvmStatic
    public static final void injectUserUuidPref(RealAuthManager realAuthManager, StringPreference stringPreference) {
        INSTANCE.injectUserUuidPref(realAuthManager, stringPreference);
    }

    @JvmStatic
    @UsernamePref
    public static final void injectUsernamePref(RealAuthManager realAuthManager, StringPreference stringPreference) {
        INSTANCE.injectUsernamePref(realAuthManager, stringPreference);
    }

    public RealAuthManager_MembersInjector(Provider<Context> context, Provider<Set<UserLifecycleListener>> userLifecycleListeners, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<StringPreference> usernamePref, Provider<StringPreference> userEmailPref, Provider<StringPreference> userUuidPref, Provider<StringPreference> userLocalityPref, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<StringPreference> crashlyticsUserIdPref, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<BranchManager> branchManager, Provider<ExperimentsStore> experimentsStore, Provider<PersistentCacheManager> persistentCacheManager, Provider<BooleanPreference> hasEverLoggedInPref, Provider<BiometricChangeManager> biometricChangeManager, Provider<RecaptchaManager> recaptchaManager, Provider<Sheriff> sheriff, Provider<DiscoveryApi> discoveryApi, Provider<SharedPreferences> userPrefs, Provider<GcmManager> gcmManager, Provider<BaseDbHelper> dbHelper, Provider<Endpoint> endpoint, Provider<LogoutKillswitch> logoutKillswitch, Provider<Cache> okHttpCache, Provider<ConnectionPool> okHttpConnectionPool, Provider<Dispatcher> okHttpDispatcher, Provider<Navigator> navigator, Provider<ChatCachedImageCleaner> chatCachedImageCleaner, Provider<NightModeManager> nightModeManager) {
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

    @Override // dagger.MembersInjector
    public void injectMembers(RealAuthManager instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        companion.injectContext(instance, context);
        Set<UserLifecycleListener> set = this.userLifecycleListeners.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        companion.injectUserLifecycleListeners(instance, set);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
        StringPreference stringPreference = this.usernamePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectUsernamePref(instance, stringPreference);
        StringPreference stringPreference2 = this.userEmailPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        companion.injectUserEmailPref(instance, stringPreference2);
        StringPreference stringPreference3 = this.userUuidPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        companion.injectUserUuidPref(instance, stringPreference3);
        StringPreference stringPreference4 = this.userLocalityPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference4, "get(...)");
        companion.injectUserLocalityPref(instance, stringPreference4);
        TrustedDeviceIdPref trustedDeviceIdPref = this.trustedDeviceIdPref.get();
        Intrinsics.checkNotNullExpressionValue(trustedDeviceIdPref, "get(...)");
        companion.injectTrustedDeviceIdPref(instance, trustedDeviceIdPref);
        StringPreference stringPreference5 = this.crashlyticsUserIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference5, "get(...)");
        companion.injectCrashlyticsUserIdPref(instance, stringPreference5);
        MoshiSecurePreference<OAuthToken> moshiSecurePreference = this.oAuthTokenPref.get();
        Intrinsics.checkNotNullExpressionValue(moshiSecurePreference, "get(...)");
        companion.injectOAuthTokenPref(instance, moshiSecurePreference);
        Lazy<BranchManager> lazy = DoubleCheck.lazy(this.branchManager);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        companion.injectBranchManager(instance, lazy);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion.injectExperimentsStore(instance, experimentsStore);
        PersistentCacheManager persistentCacheManager = this.persistentCacheManager.get();
        Intrinsics.checkNotNullExpressionValue(persistentCacheManager, "get(...)");
        companion.injectPersistentCacheManager(instance, persistentCacheManager);
        BooleanPreference booleanPreference = this.hasEverLoggedInPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion.injectHasEverLoggedInPref(instance, booleanPreference);
        BiometricChangeManager biometricChangeManager = this.biometricChangeManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricChangeManager, "get(...)");
        companion.injectBiometricChangeManager(instance, biometricChangeManager);
        RecaptchaManager recaptchaManager = this.recaptchaManager.get();
        Intrinsics.checkNotNullExpressionValue(recaptchaManager, "get(...)");
        companion.injectRecaptchaManager(instance, recaptchaManager);
        Lazy<Sheriff> lazy2 = DoubleCheck.lazy(this.sheriff);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        companion.injectSheriff(instance, lazy2);
        Lazy<DiscoveryApi> lazy3 = DoubleCheck.lazy(this.discoveryApi);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        companion.injectDiscoveryApi(instance, lazy3);
        Lazy<SharedPreferences> lazy4 = DoubleCheck.lazy(this.userPrefs);
        Intrinsics.checkNotNullExpressionValue(lazy4, "lazy(...)");
        companion.injectUserPrefs(instance, lazy4);
        Lazy<GcmManager> lazy5 = DoubleCheck.lazy(this.gcmManager);
        Intrinsics.checkNotNullExpressionValue(lazy5, "lazy(...)");
        companion.injectGcmManager(instance, lazy5);
        Lazy<BaseDbHelper> lazy6 = DoubleCheck.lazy(this.dbHelper);
        Intrinsics.checkNotNullExpressionValue(lazy6, "lazy(...)");
        companion.injectDbHelper(instance, lazy6);
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        companion.injectEndpoint(instance, endpoint);
        Lazy<LogoutKillswitch> lazy7 = DoubleCheck.lazy(this.logoutKillswitch);
        Intrinsics.checkNotNullExpressionValue(lazy7, "lazy(...)");
        companion.injectLogoutKillswitch(instance, lazy7);
        Lazy<Cache> lazy8 = DoubleCheck.lazy(this.okHttpCache);
        Intrinsics.checkNotNullExpressionValue(lazy8, "lazy(...)");
        companion.injectOkHttpCache(instance, lazy8);
        Lazy<ConnectionPool> lazy9 = DoubleCheck.lazy(this.okHttpConnectionPool);
        Intrinsics.checkNotNullExpressionValue(lazy9, "lazy(...)");
        companion.injectOkHttpConnectionPool(instance, lazy9);
        Lazy<Dispatcher> lazy10 = DoubleCheck.lazy(this.okHttpDispatcher);
        Intrinsics.checkNotNullExpressionValue(lazy10, "lazy(...)");
        companion.injectOkHttpDispatcher(instance, lazy10);
        Lazy<Navigator> lazy11 = DoubleCheck.lazy(this.navigator);
        Intrinsics.checkNotNullExpressionValue(lazy11, "lazy(...)");
        companion.injectNavigator(instance, lazy11);
        Lazy<ChatCachedImageCleaner> lazy12 = DoubleCheck.lazy(this.chatCachedImageCleaner);
        Intrinsics.checkNotNullExpressionValue(lazy12, "lazy(...)");
        companion.injectChatCachedImageCleaner(instance, lazy12);
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        companion.injectNightModeManager(instance, nightModeManager);
    }

    /* compiled from: RealAuthManager_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0084\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0017\u0010\u001a\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\r0\b2\u0011\u0010\u001d\u001a\r\u0012\t\u0012\u00070\u001e¢\u0006\u0002\b\r0\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\b2\u0011\u0010)\u001a\r\u0012\t\u0012\u00070*¢\u0006\u0002\b\r0\b2\u0011\u0010+\u001a\r\u0012\t\u0012\u00070,¢\u0006\u0002\b\r0\b2\u0011\u0010-\u001a\r\u0012\t\u0012\u00070.¢\u0006\u0002\b\r0\b2\u0011\u0010/\u001a\r\u0012\t\u0012\u000700¢\u0006\u0002\b\r0\b2\u0011\u00101\u001a\r\u0012\t\u0012\u000702¢\u0006\u0002\b\r0\b2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\b2\u0011\u00105\u001a\r\u0012\t\u0012\u000706¢\u0006\u0002\b\r0\b2\u0011\u00107\u001a\r\u0012\t\u0012\u000708¢\u0006\u0002\b\r0\b2\u0011\u00109\u001a\r\u0012\t\u0012\u00070:¢\u0006\u0002\b\r0\b2\u0011\u0010;\u001a\r\u0012\t\u0012\u00070<¢\u0006\u0002\b\r0\b2\u0011\u0010=\u001a\r\u0012\t\u0012\u00070>¢\u0006\u0002\b\r0\b2\u0011\u0010?\u001a\r\u0012\t\u0012\u00070@¢\u0006\u0002\b\r0\b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\bH\u0007J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J#\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007J\u0018\u0010G\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010H\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010I\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010J\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0018\u0010K\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0013H\u0007J\u0018\u0010L\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0013H\u0007J\u0018\u0010M\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010N\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0013H\u0007J#\u0010O\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0002\b\rH\u0007J#\u0010P\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010\u001d\u001a\r\u0012\t\u0012\u00070\u001e¢\u0006\u0002\b\r0QH\u0007J\u0018\u0010R\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0018\u0010S\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0007J\u0018\u0010T\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0007J\u0018\u0010U\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&H\u0007J\u0018\u0010V\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H\u0007J#\u0010W\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010)\u001a\r\u0012\t\u0012\u00070*¢\u0006\u0002\b\r0QH\u0007J#\u0010X\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010+\u001a\r\u0012\t\u0012\u00070,¢\u0006\u0002\b\r0QH\u0007J#\u0010Y\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010-\u001a\r\u0012\t\u0012\u00070.¢\u0006\u0002\b\r0QH\u0007J#\u0010Z\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010/\u001a\r\u0012\t\u0012\u000700¢\u0006\u0002\b\r0QH\u0007J#\u0010[\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u00101\u001a\r\u0012\t\u0012\u000702¢\u0006\u0002\b\r0QH\u0007J\u0018\u0010\\\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u00103\u001a\u000204H\u0007J#\u0010]\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u00105\u001a\r\u0012\t\u0012\u000706¢\u0006\u0002\b\r0QH\u0007J#\u0010^\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u00107\u001a\r\u0012\t\u0012\u000708¢\u0006\u0002\b\r0QH\u0007J#\u0010_\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u00109\u001a\r\u0012\t\u0012\u00070:¢\u0006\u0002\b\r0QH\u0007J#\u0010`\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010;\u001a\r\u0012\t\u0012\u00070<¢\u0006\u0002\b\r0QH\u0007J#\u0010a\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010=\u001a\r\u0012\t\u0012\u00070>¢\u0006\u0002\b\r0QH\u0007J#\u0010b\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0011\u0010?\u001a\r\u0012\t\u0012\u00070@¢\u0006\u0002\b\r0QH\u0007J\u0018\u0010c\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010A\u001a\u00020BH\u0007¨\u0006d"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/RealAuthManager_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "userLifecycleListeners", "", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "usernamePref", "Lcom/robinhood/prefs/StringPreference;", "userEmailPref", "userUuidPref", "userLocalityPref", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "crashlyticsUserIdPref", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "branchManager", "Lcom/robinhood/referral/branch/BranchManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "hasEverLoggedInPref", "Lcom/robinhood/prefs/BooleanPreference;", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "recaptchaManager", "Lcom/robinhood/shared/security/recaptcha/RecaptchaManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "discoveryApi", "Lcom/robinhood/android/api/discovery/DiscoveryApi;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "dbHelper", "Lcom/robinhood/database/BaseDbHelper;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "okHttpCache", "Lokhttp3/Cache;", "okHttpConnectionPool", "Lokhttp3/ConnectionPool;", "okHttpDispatcher", "Lokhttp3/Dispatcher;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "chatCachedImageCleaner", "Lcom/robinhood/store/supportchat/ChatCachedImageCleaner;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "injectContext", "", "instance", "injectUserLifecycleListeners", "injectAnalytics", "injectEventLogger", "injectUsernamePref", "injectUserEmailPref", "injectUserUuidPref", "injectUserLocalityPref", "injectTrustedDeviceIdPref", "injectCrashlyticsUserIdPref", "injectOAuthTokenPref", "injectBranchManager", "Ldagger/Lazy;", "injectExperimentsStore", "injectPersistentCacheManager", "injectHasEverLoggedInPref", "injectBiometricChangeManager", "injectRecaptchaManager", "injectSheriff", "injectDiscoveryApi", "injectUserPrefs", "injectGcmManager", "injectDbHelper", "injectEndpoint", "injectLogoutKillswitch", "injectOkHttpCache", "injectOkHttpConnectionPool", "injectOkHttpDispatcher", "injectNavigator", "injectChatCachedImageCleaner", "injectNightModeManager", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RealAuthManager> create(Provider<Context> context, Provider<Set<UserLifecycleListener>> userLifecycleListeners, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<StringPreference> usernamePref, Provider<StringPreference> userEmailPref, Provider<StringPreference> userUuidPref, Provider<StringPreference> userLocalityPref, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<StringPreference> crashlyticsUserIdPref, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<BranchManager> branchManager, Provider<ExperimentsStore> experimentsStore, Provider<PersistentCacheManager> persistentCacheManager, Provider<BooleanPreference> hasEverLoggedInPref, Provider<BiometricChangeManager> biometricChangeManager, Provider<RecaptchaManager> recaptchaManager, Provider<Sheriff> sheriff, Provider<DiscoveryApi> discoveryApi, Provider<SharedPreferences> userPrefs, Provider<GcmManager> gcmManager, Provider<BaseDbHelper> dbHelper, Provider<Endpoint> endpoint, Provider<LogoutKillswitch> logoutKillswitch, Provider<Cache> okHttpCache, Provider<ConnectionPool> okHttpConnectionPool, Provider<Dispatcher> okHttpDispatcher, Provider<Navigator> navigator, Provider<ChatCachedImageCleaner> chatCachedImageCleaner, Provider<NightModeManager> nightModeManager) {
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
            return new RealAuthManager_MembersInjector(context, userLifecycleListeners, analytics, eventLogger, usernamePref, userEmailPref, userUuidPref, userLocalityPref, trustedDeviceIdPref, crashlyticsUserIdPref, oAuthTokenPref, branchManager, experimentsStore, persistentCacheManager, hasEverLoggedInPref, biometricChangeManager, recaptchaManager, sheriff, discoveryApi, userPrefs, gcmManager, dbHelper, endpoint, logoutKillswitch, okHttpCache, okHttpConnectionPool, okHttpDispatcher, navigator, chatCachedImageCleaner, nightModeManager);
        }

        @JvmStatic
        public final void injectContext(RealAuthManager instance, Context context) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(context, "context");
            instance.setContext(context);
        }

        @JvmStatic
        public final void injectUserLifecycleListeners(RealAuthManager instance, Set<UserLifecycleListener> userLifecycleListeners) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLifecycleListeners, "userLifecycleListeners");
            instance.setUserLifecycleListeners(userLifecycleListeners);
        }

        @JvmStatic
        public final void injectAnalytics(RealAuthManager instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectEventLogger(RealAuthManager instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        @UsernamePref
        public final void injectUsernamePref(RealAuthManager instance, StringPreference usernamePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(usernamePref, "usernamePref");
            instance.setUsernamePref(usernamePref);
        }

        @JvmStatic
        @UserEmailPref
        public final void injectUserEmailPref(RealAuthManager instance, StringPreference userEmailPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userEmailPref, "userEmailPref");
            instance.setUserEmailPref(userEmailPref);
        }

        @UserUuidPref
        @JvmStatic
        public final void injectUserUuidPref(RealAuthManager instance, StringPreference userUuidPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            instance.setUserUuidPref(userUuidPref);
        }

        @JvmStatic
        @UserLocalityPref
        public final void injectUserLocalityPref(RealAuthManager instance, StringPreference userLocalityPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
            instance.setUserLocalityPref(userLocalityPref);
        }

        @JvmStatic
        public final void injectTrustedDeviceIdPref(RealAuthManager instance, TrustedDeviceIdPref trustedDeviceIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            instance.setTrustedDeviceIdPref(trustedDeviceIdPref);
        }

        @JvmStatic
        @CrashlyticsUserId
        public final void injectCrashlyticsUserIdPref(RealAuthManager instance, StringPreference crashlyticsUserIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(crashlyticsUserIdPref, "crashlyticsUserIdPref");
            instance.setCrashlyticsUserIdPref(crashlyticsUserIdPref);
        }

        @JvmStatic
        public final void injectOAuthTokenPref(RealAuthManager instance, MoshiSecurePreference<OAuthToken> oAuthTokenPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
            instance.setOAuthTokenPref(oAuthTokenPref);
        }

        @JvmStatic
        public final void injectBranchManager(RealAuthManager instance, Lazy<BranchManager> branchManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(branchManager, "branchManager");
            instance.setBranchManager(branchManager);
        }

        @JvmStatic
        public final void injectExperimentsStore(RealAuthManager instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectPersistentCacheManager(RealAuthManager instance, PersistentCacheManager persistentCacheManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
            instance.setPersistentCacheManager(persistentCacheManager);
        }

        @JvmStatic
        @HasEverLoggedInPref
        public final void injectHasEverLoggedInPref(RealAuthManager instance, BooleanPreference hasEverLoggedInPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(hasEverLoggedInPref, "hasEverLoggedInPref");
            instance.setHasEverLoggedInPref(hasEverLoggedInPref);
        }

        @JvmStatic
        public final void injectBiometricChangeManager(RealAuthManager instance, BiometricChangeManager biometricChangeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(biometricChangeManager, "biometricChangeManager");
            instance.setBiometricChangeManager(biometricChangeManager);
        }

        @JvmStatic
        public final void injectRecaptchaManager(RealAuthManager instance, RecaptchaManager recaptchaManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recaptchaManager, "recaptchaManager");
            instance.setRecaptchaManager(recaptchaManager);
        }

        @JvmStatic
        public final void injectSheriff(RealAuthManager instance, Lazy<Sheriff> sheriff) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            instance.setSheriff(sheriff);
        }

        @JvmStatic
        public final void injectDiscoveryApi(RealAuthManager instance, Lazy<DiscoveryApi> discoveryApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(discoveryApi, "discoveryApi");
            instance.setDiscoveryApi(discoveryApi);
        }

        @JvmStatic
        @UserPrefs
        public final void injectUserPrefs(RealAuthManager instance, Lazy<SharedPreferences> userPrefs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            instance.setUserPrefs(userPrefs);
        }

        @JvmStatic
        public final void injectGcmManager(RealAuthManager instance, Lazy<GcmManager> gcmManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(gcmManager, "gcmManager");
            instance.setGcmManager(gcmManager);
        }

        @JvmStatic
        public final void injectDbHelper(RealAuthManager instance, Lazy<BaseDbHelper> dbHelper) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
            instance.setDbHelper(dbHelper);
        }

        @JvmStatic
        public final void injectEndpoint(RealAuthManager instance, Endpoint endpoint) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            instance.setEndpoint(endpoint);
        }

        @JvmStatic
        public final void injectLogoutKillswitch(RealAuthManager instance, Lazy<LogoutKillswitch> logoutKillswitch) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            instance.setLogoutKillswitch(logoutKillswitch);
        }

        @JvmStatic
        public final void injectOkHttpCache(RealAuthManager instance, Lazy<Cache> okHttpCache) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(okHttpCache, "okHttpCache");
            instance.setOkHttpCache(okHttpCache);
        }

        @JvmStatic
        public final void injectOkHttpConnectionPool(RealAuthManager instance, Lazy<ConnectionPool> okHttpConnectionPool) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(okHttpConnectionPool, "okHttpConnectionPool");
            instance.setOkHttpConnectionPool(okHttpConnectionPool);
        }

        @JvmStatic
        public final void injectOkHttpDispatcher(RealAuthManager instance, Lazy<Dispatcher> okHttpDispatcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(okHttpDispatcher, "okHttpDispatcher");
            instance.setOkHttpDispatcher(okHttpDispatcher);
        }

        @JvmStatic
        public final void injectNavigator(RealAuthManager instance, Lazy<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectChatCachedImageCleaner(RealAuthManager instance, Lazy<ChatCachedImageCleaner> chatCachedImageCleaner) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(chatCachedImageCleaner, "chatCachedImageCleaner");
            instance.setChatCachedImageCleaner(chatCachedImageCleaner);
        }

        @JvmStatic
        public final void injectNightModeManager(RealAuthManager instance, NightModeManager nightModeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            instance.setNightModeManager(nightModeManager);
        }
    }
}
