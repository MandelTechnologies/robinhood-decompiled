package com.robinhood.android.authlock.biometric;

import androidx.biometric.BiometricManager;
import com.robinhood.android.authlock.biometric.BiometricManagerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BiometricManagerCompat.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/AndroidXBiometricManager;", "Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat;", "biometricManager", "Landroidx/biometric/BiometricManager;", "<init>", "(Landroidx/biometric/BiometricManager;)V", "canAuthenticate", "Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat$Status;", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.authlock.biometric.AndroidXBiometricManager, reason: use source file name */
/* loaded from: classes17.dex */
final class BiometricManagerCompat2 implements BiometricManagerCompat {
    private final BiometricManager biometricManager;

    public BiometricManagerCompat2(BiometricManager biometricManager) {
        Intrinsics.checkNotNullParameter(biometricManager, "biometricManager");
        this.biometricManager = biometricManager;
    }

    @Override // com.robinhood.android.authlock.biometric.BiometricManagerCompat
    public BiometricManagerCompat.Status canAuthenticate() {
        int iCanAuthenticate = this.biometricManager.canAuthenticate(255);
        if (iCanAuthenticate == 0) {
            return BiometricManagerCompat.Status.SUCCESS;
        }
        if (iCanAuthenticate == 1) {
            return BiometricManagerCompat.Status.ERROR_HARDWARE_UNAVAILABLE;
        }
        if (iCanAuthenticate == 11) {
            return BiometricManagerCompat.Status.ERROR_NONE_ENROLLED;
        }
        if (iCanAuthenticate == 12) {
            return BiometricManagerCompat.Status.ERROR_NO_HARDWARE;
        }
        return BiometricManagerCompat.Status.ERROR_NO_HARDWARE;
    }
}
