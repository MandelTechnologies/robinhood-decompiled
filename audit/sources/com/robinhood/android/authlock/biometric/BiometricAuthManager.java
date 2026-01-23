package com.robinhood.android.authlock.biometric;

import android.app.Application;
import android.app.KeyguardManager;
import android.widget.Toast;
import com.robinhood.android.authlock.C9622R;
import com.robinhood.android.authlock.biometric.BiometricManagerCompat;
import com.robinhood.android.authlock.prefs.BiometricsAuthEnabledPref;
import com.robinhood.prefs.BooleanPreference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BiometricAuthManager.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "", "app", "Landroid/app/Application;", "biometricsAuthEnabledPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Landroid/app/Application;Lcom/robinhood/prefs/BooleanPreference;)V", "keyguardManager", "Landroid/app/KeyguardManager;", "isBiometricHardwareDetected", "", "isBiometricAvailable", "canAuthenticateForAuthRequiredKeys", "isBiometricsEnrolledOnDevice", "tryToEnableBiometricAuthentication", "shouldShowErrorToast", "enableBiometricAuth", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableBiometricAuth", "isBiometricsAuthEnabled", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BiometricAuthManager {
    public static final int $stable = 8;
    private final Application app;
    private final BooleanPreference biometricsAuthEnabledPref;
    private final KeyguardManager keyguardManager;

    /* compiled from: BiometricAuthManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BiometricManagerCompat.Status.values().length];
            try {
                iArr[BiometricManagerCompat.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BiometricManagerCompat.Status.ERROR_HARDWARE_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BiometricManagerCompat.Status.ERROR_NO_HARDWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BiometricManagerCompat.Status.ERROR_NONE_ENROLLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BiometricAuthManager(Application app, @BiometricsAuthEnabledPref BooleanPreference biometricsAuthEnabledPref) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(biometricsAuthEnabledPref, "biometricsAuthEnabledPref");
        this.app = app;
        this.biometricsAuthEnabledPref = biometricsAuthEnabledPref;
        Object systemService = app.getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.keyguardManager = (KeyguardManager) systemService;
    }

    public final boolean isBiometricHardwareDetected() {
        return BiometricManagerCompat.INSTANCE.from(this.app).canAuthenticate() != BiometricManagerCompat.Status.ERROR_NO_HARDWARE;
    }

    public final boolean isBiometricAvailable() {
        return BiometricManagerCompat.INSTANCE.from(this.app).canAuthenticate() == BiometricManagerCompat.Status.SUCCESS;
    }

    public final boolean canAuthenticateForAuthRequiredKeys() {
        return this.keyguardManager.isDeviceSecure() && BiometricManagerCompat.INSTANCE.from(this.app).canAuthenticate() == BiometricManagerCompat.Status.SUCCESS;
    }

    public final boolean isBiometricsEnrolledOnDevice() {
        return BiometricManagerCompat.INSTANCE.from(this.app).canAuthenticate() != BiometricManagerCompat.Status.ERROR_NONE_ENROLLED;
    }

    public final boolean tryToEnableBiometricAuthentication(boolean shouldShowErrorToast) {
        int i = WhenMappings.$EnumSwitchMapping$0[BiometricManagerCompat.INSTANCE.from(this.app).canAuthenticate().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            if (shouldShowErrorToast) {
                Toast.makeText(this.app, C9622R.string.auth_biometric_error_not_available, 1).show();
            }
            return false;
        }
        if (i == 3) {
            if (shouldShowErrorToast) {
                Toast.makeText(this.app, C9622R.string.auth_biometric_error_not_supported, 1).show();
            }
            return false;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (shouldShowErrorToast) {
            Toast.makeText(this.app, C9622R.string.auth_biometric_error_no_fingerprint_registered, 1).show();
        }
        return false;
    }

    public final Object enableBiometricAuth(Continuation<? super Unit> continuation) {
        Object objCoSet = this.biometricsAuthEnabledPref.coSet(true, continuation);
        return objCoSet == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoSet : Unit.INSTANCE;
    }

    public final void disableBiometricAuth() {
        this.biometricsAuthEnabledPref.set(false);
    }

    public final boolean isBiometricsAuthEnabled() {
        return this.biometricsAuthEnabledPref.get();
    }
}
