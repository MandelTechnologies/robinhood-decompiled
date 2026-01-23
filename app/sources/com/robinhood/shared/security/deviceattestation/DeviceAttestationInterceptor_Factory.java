package com.robinhood.shared.security.deviceattestation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.TrustedDeviceIdPref;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceAttestationInterceptor_Factory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB(\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor;", "deviceAttestationManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DeviceAttestationInterceptor_Factory implements Factory<DeviceAttestationInterceptor> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DeviceAttestationManager> deviceAttestationManager;
    private final Provider<TrustedDeviceIdPref> trustedDeviceIdPref;

    @JvmStatic
    public static final DeviceAttestationInterceptor_Factory create(Provider<DeviceAttestationManager> provider, Provider<TrustedDeviceIdPref> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final DeviceAttestationInterceptor newInstance(Lazy<DeviceAttestationManager> lazy, TrustedDeviceIdPref trustedDeviceIdPref) {
        return INSTANCE.newInstance(lazy, trustedDeviceIdPref);
    }

    public DeviceAttestationInterceptor_Factory(Provider<DeviceAttestationManager> deviceAttestationManager, Provider<TrustedDeviceIdPref> trustedDeviceIdPref) {
        Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        this.deviceAttestationManager = deviceAttestationManager;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
    }

    @Override // javax.inject.Provider
    public DeviceAttestationInterceptor get() {
        Companion companion = INSTANCE;
        Lazy<DeviceAttestationManager> lazy = DoubleCheck.lazy(this.deviceAttestationManager);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        TrustedDeviceIdPref trustedDeviceIdPref = this.trustedDeviceIdPref.get();
        Intrinsics.checkNotNullExpressionValue(trustedDeviceIdPref, "get(...)");
        return companion.newInstance(lazy, trustedDeviceIdPref);
    }

    /* compiled from: DeviceAttestationInterceptor_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0007J#\u0010\f\u001a\u00020\r2\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor_Factory;", "deviceAttestationManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "Lkotlin/jvm/JvmSuppressWildcards;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "newInstance", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationInterceptor;", "Ldagger/Lazy;", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeviceAttestationInterceptor_Factory create(Provider<DeviceAttestationManager> deviceAttestationManager, Provider<TrustedDeviceIdPref> trustedDeviceIdPref) {
            Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            return new DeviceAttestationInterceptor_Factory(deviceAttestationManager, trustedDeviceIdPref);
        }

        @JvmStatic
        public final DeviceAttestationInterceptor newInstance(Lazy<DeviceAttestationManager> deviceAttestationManager, TrustedDeviceIdPref trustedDeviceIdPref) {
            Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            return new DeviceAttestationInterceptor(deviceAttestationManager, trustedDeviceIdPref);
        }
    }
}
