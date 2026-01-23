package com.robinhood.android.util;

import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LockscreenTimeout;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LockscreenManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¬\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/util/LockscreenManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/util/LockscreenManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "Lkotlin/jvm/JvmSuppressWildcards;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "biometricsChangedPref", "Lcom/robinhood/prefs/StringPreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LockscreenManager_Factory implements Factory<LockscreenManager> {
    private final Provider<AuthManager> authManager;
    private final Provider<BiometricAuthManager> biometricAuthManager;
    private final Provider<BiometricChangeManager> biometricChangeManager;
    private final Provider<StringPreference> biometricsChangedPref;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref;
    private final Provider<Navigator> navigator;
    private final Provider<PinManager> pinManager;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<Sheriff> sheriff;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LockscreenManager_Factory create(Provider<CoroutineScope> provider, Provider<PinManager> provider2, Provider<BiometricAuthManager> provider3, Provider<EnumPreference<LockscreenTimeout>> provider4, Provider<RhProcessLifecycleOwner> provider5, Provider<BiometricChangeManager> provider6, Provider<AuthManager> provider7, Provider<Sheriff> provider8, Provider<StringPreference> provider9, Provider<ExperimentsStore> provider10, Provider<Navigator> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final LockscreenManager newInstance(CoroutineScope coroutineScope, PinManager pinManager, BiometricAuthManager biometricAuthManager, EnumPreference<LockscreenTimeout> enumPreference, RhProcessLifecycleOwner rhProcessLifecycleOwner, BiometricChangeManager biometricChangeManager, AuthManager authManager, Sheriff sheriff, StringPreference stringPreference, ExperimentsStore experimentsStore, Navigator navigator) {
        return INSTANCE.newInstance(coroutineScope, pinManager, biometricAuthManager, enumPreference, rhProcessLifecycleOwner, biometricChangeManager, authManager, sheriff, stringPreference, experimentsStore, navigator);
    }

    public LockscreenManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<PinManager> pinManager, Provider<BiometricAuthManager> biometricAuthManager, Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<BiometricChangeManager> biometricChangeManager, Provider<AuthManager> authManager, Provider<Sheriff> sheriff, Provider<StringPreference> biometricsChangedPref, Provider<ExperimentsStore> experimentsStore, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(biometricChangeManager, "biometricChangeManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(biometricsChangedPref, "biometricsChangedPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.coroutineScope = coroutineScope;
        this.pinManager = pinManager;
        this.biometricAuthManager = biometricAuthManager;
        this.lockscreenTimeoutPref = lockscreenTimeoutPref;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.biometricChangeManager = biometricChangeManager;
        this.authManager = authManager;
        this.sheriff = sheriff;
        this.biometricsChangedPref = biometricsChangedPref;
        this.experimentsStore = experimentsStore;
        this.navigator = navigator;
    }

    @Override // javax.inject.Provider
    public LockscreenManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricAuthManager, "get(...)");
        EnumPreference<LockscreenTimeout> enumPreference = this.lockscreenTimeoutPref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        BiometricChangeManager biometricChangeManager = this.biometricChangeManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricChangeManager, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        Sheriff sheriff = this.sheriff.get();
        Intrinsics.checkNotNullExpressionValue(sheriff, "get(...)");
        StringPreference stringPreference = this.biometricsChangedPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        return companion.newInstance(coroutineScope, pinManager, biometricAuthManager, enumPreference, rhProcessLifecycleOwner, biometricChangeManager, authManager, sheriff, stringPreference, experimentsStore, navigator);
    }

    /* compiled from: LockscreenManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u00ad\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jk\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/util/LockscreenManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/util/LockscreenManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "Lkotlin/jvm/JvmSuppressWildcards;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "biometricsChangedPref", "Lcom/robinhood/prefs/StringPreference;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "newInstance", "Lcom/robinhood/android/util/LockscreenManager;", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LockscreenManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<PinManager> pinManager, Provider<BiometricAuthManager> biometricAuthManager, Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<BiometricChangeManager> biometricChangeManager, Provider<AuthManager> authManager, Provider<Sheriff> sheriff, Provider<StringPreference> biometricsChangedPref, Provider<ExperimentsStore> experimentsStore, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            Intrinsics.checkNotNullParameter(biometricChangeManager, "biometricChangeManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(biometricsChangedPref, "biometricsChangedPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new LockscreenManager_Factory(coroutineScope, pinManager, biometricAuthManager, lockscreenTimeoutPref, rhProcessLifecycleOwner, biometricChangeManager, authManager, sheriff, biometricsChangedPref, experimentsStore, navigator);
        }

        @JvmStatic
        public final LockscreenManager newInstance(CoroutineScope coroutineScope, PinManager pinManager, BiometricAuthManager biometricAuthManager, EnumPreference<LockscreenTimeout> lockscreenTimeoutPref, RhProcessLifecycleOwner rhProcessLifecycleOwner, BiometricChangeManager biometricChangeManager, AuthManager authManager, Sheriff sheriff, StringPreference biometricsChangedPref, ExperimentsStore experimentsStore, Navigator navigator) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            Intrinsics.checkNotNullParameter(biometricChangeManager, "biometricChangeManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(biometricsChangedPref, "biometricsChangedPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new LockscreenManager(coroutineScope, pinManager, biometricAuthManager, lockscreenTimeoutPref, rhProcessLifecycleOwner, biometricChangeManager, authManager, sheriff, biometricsChangedPref, experimentsStore, navigator);
        }
    }
}
