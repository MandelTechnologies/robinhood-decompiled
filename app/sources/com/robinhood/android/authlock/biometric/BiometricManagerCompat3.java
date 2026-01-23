package com.robinhood.android.authlock.biometric;

import com.robinhood.android.authlock.biometric.BiometricManagerCompat;
import kotlin.Metadata;

/* compiled from: BiometricManagerCompat.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BlockedBiometricManager;", "Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat;", "<init>", "()V", "canAuthenticate", "Lcom/robinhood/android/authlock/biometric/BiometricManagerCompat$Status;", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.authlock.biometric.BlockedBiometricManager, reason: use source file name */
/* loaded from: classes7.dex */
final class BiometricManagerCompat3 implements BiometricManagerCompat {
    public static final BiometricManagerCompat3 INSTANCE = new BiometricManagerCompat3();

    private BiometricManagerCompat3() {
    }

    @Override // com.robinhood.android.authlock.biometric.BiometricManagerCompat
    public BiometricManagerCompat.Status canAuthenticate() {
        return BiometricManagerCompat.Status.ERROR_NO_HARDWARE;
    }
}
