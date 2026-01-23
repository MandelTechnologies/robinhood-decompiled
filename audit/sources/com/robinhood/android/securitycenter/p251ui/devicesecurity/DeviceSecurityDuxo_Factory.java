package com.robinhood.android.securitycenter.p251ui.devicesecurity;

import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LockscreenTimeout;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSecurityDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bf\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDuxo;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "Lkotlin/jvm/JvmSuppressWildcards;", "stateProvider", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DeviceSecurityDuxo_Factory implements Factory<DeviceSecurityDuxo> {
    private final Provider<BiometricAuthManager> biometricAuthManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref;
    private final Provider<Navigator> navigator;
    private final Provider<PinManager> pinManager;
    private final Provider<DeviceSecurityStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DeviceSecurityDuxo_Factory create(Provider<Navigator> provider, Provider<BiometricAuthManager> provider2, Provider<PinManager> provider3, Provider<EnumPreference<LockscreenTimeout>> provider4, Provider<DeviceSecurityStateProvider> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final DeviceSecurityDuxo newInstance(Navigator navigator, BiometricAuthManager biometricAuthManager, PinManager pinManager, EnumPreference<LockscreenTimeout> enumPreference, DeviceSecurityStateProvider deviceSecurityStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(navigator, biometricAuthManager, pinManager, enumPreference, deviceSecurityStateProvider, duxoBundle);
    }

    public DeviceSecurityDuxo_Factory(Provider<Navigator> navigator, Provider<BiometricAuthManager> biometricAuthManager, Provider<PinManager> pinManager, Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref, Provider<DeviceSecurityStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.navigator = navigator;
        this.biometricAuthManager = biometricAuthManager;
        this.pinManager = pinManager;
        this.lockscreenTimeoutPref = lockscreenTimeoutPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public DeviceSecurityDuxo get() {
        Companion companion = INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricAuthManager, "get(...)");
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        EnumPreference<LockscreenTimeout> enumPreference = this.lockscreenTimeoutPref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        DeviceSecurityStateProvider deviceSecurityStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(deviceSecurityStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(navigator, biometricAuthManager, pinManager, enumPreference, deviceSecurityStateProvider, duxoBundle);
    }

    /* compiled from: DeviceSecurityDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007JC\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDuxo_Factory;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "lockscreenTimeoutPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/prefs/LockscreenTimeout;", "Lkotlin/jvm/JvmSuppressWildcards;", "stateProvider", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityDuxo;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeviceSecurityDuxo_Factory create(Provider<Navigator> navigator, Provider<BiometricAuthManager> biometricAuthManager, Provider<PinManager> pinManager, Provider<EnumPreference<LockscreenTimeout>> lockscreenTimeoutPref, Provider<DeviceSecurityStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DeviceSecurityDuxo_Factory(navigator, biometricAuthManager, pinManager, lockscreenTimeoutPref, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final DeviceSecurityDuxo newInstance(Navigator navigator, BiometricAuthManager biometricAuthManager, PinManager pinManager, EnumPreference<LockscreenTimeout> lockscreenTimeoutPref, DeviceSecurityStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(lockscreenTimeoutPref, "lockscreenTimeoutPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new DeviceSecurityDuxo(navigator, biometricAuthManager, pinManager, lockscreenTimeoutPref, stateProvider, duxoBundle);
        }
    }
}
