package com.robinhood.shared.security.deviceattestation;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.baffi.proto.p282v1.publicservice.BaffiPublicService;
import com.robinhood.prefs.TrustedDeviceIdPref;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceAttestationManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "trustedDeviceIdPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "baffiService", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicService;", "context", "Landroid/content/Context;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DeviceAttestationManager_Factory implements Factory<DeviceAttestationManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BaffiPublicService> baffiService;
    private final Provider<Context> context;
    private final Provider<TrustedDeviceIdPref> trustedDeviceIdPref;

    @JvmStatic
    public static final DeviceAttestationManager_Factory create(Provider<TrustedDeviceIdPref> provider, Provider<BaffiPublicService> provider2, Provider<Context> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final DeviceAttestationManager newInstance(TrustedDeviceIdPref trustedDeviceIdPref, BaffiPublicService baffiPublicService, Context context) {
        return INSTANCE.newInstance(trustedDeviceIdPref, baffiPublicService, context);
    }

    public DeviceAttestationManager_Factory(Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<BaffiPublicService> baffiService, Provider<Context> context) {
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(baffiService, "baffiService");
        Intrinsics.checkNotNullParameter(context, "context");
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.baffiService = baffiService;
        this.context = context;
    }

    @Override // javax.inject.Provider
    public DeviceAttestationManager get() {
        Companion companion = INSTANCE;
        TrustedDeviceIdPref trustedDeviceIdPref = this.trustedDeviceIdPref.get();
        Intrinsics.checkNotNullExpressionValue(trustedDeviceIdPref, "get(...)");
        BaffiPublicService baffiPublicService = this.baffiService.get();
        Intrinsics.checkNotNullExpressionValue(baffiPublicService, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        return companion.newInstance(trustedDeviceIdPref, baffiPublicService, context);
    }

    /* compiled from: DeviceAttestationManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager_Factory;", "trustedDeviceIdPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "baffiService", "Lcom/robinhood/baffi/proto/v1/publicservice/BaffiPublicService;", "context", "Landroid/content/Context;", "newInstance", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "lib-device-attestation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeviceAttestationManager_Factory create(Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<BaffiPublicService> baffiService, Provider<Context> context) {
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            Intrinsics.checkNotNullParameter(baffiService, "baffiService");
            Intrinsics.checkNotNullParameter(context, "context");
            return new DeviceAttestationManager_Factory(trustedDeviceIdPref, baffiService, context);
        }

        @JvmStatic
        public final DeviceAttestationManager newInstance(TrustedDeviceIdPref trustedDeviceIdPref, BaffiPublicService baffiService, Context context) {
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            Intrinsics.checkNotNullParameter(baffiService, "baffiService");
            Intrinsics.checkNotNullParameter(context, "context");
            return new DeviceAttestationManager(trustedDeviceIdPref, baffiService, context);
        }
    }
}
