package com.robinhood.android.authlock.biometric;

import android.security.keystore.KeyGenParameterSpec;
import com.robinhood.utils.logging.CrashReporter;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BiometricChangeManager.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\f\u001a\u00020\u0007J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "<init>", "(Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;)V", "generateSecretKey", "", "canAuthenticate", "", "getSecretKey", "Ljavax/crypto/SecretKey;", "deleteSecretKey", "getCipher", "Ljavax/crypto/Cipher;", "getBiometricChange", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager$BiometricEnrollmentChange;", "checkIfAllBiometricsAreRemoved", "BiometricEnrollmentChange", "Companion", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public class BiometricChangeManager {
    public static final int AES_KEY_SIZE = 256;
    public static final String ALGORITHM = "AES";
    public static final String ALIAS = "robinhood_biometric_change_keystore_alias";
    public static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    public static final String BLOCK_MODE = "CBC";
    private static final String CIPHER_TRANSFORMATION = "AES/CBC/NoPadding";
    public static final String ENCRYPTION_PADDING = "NoPadding";
    private final BiometricAuthManager biometricAuthManager;
    public static final int $stable = 8;

    public BiometricChangeManager(BiometricAuthManager biometricAuthManager) {
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        this.biometricAuthManager = biometricAuthManager;
    }

    public final void generateSecretKey() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(ALIAS, 3);
            builder.setBlockModes(BLOCK_MODE);
            builder.setEncryptionPaddings(ENCRYPTION_PADDING);
            builder.setKeySize(256);
            builder.setUserAuthenticationRequired(true);
            builder.setInvalidatedByBiometricEnrollment(true);
            KeyGenParameterSpec keyGenParameterSpecBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
            KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM, ANDROID_KEY_STORE);
            keyGenerator.init(keyGenParameterSpecBuild);
            keyGenerator.generateKey();
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
        }
    }

    public final boolean canAuthenticate() {
        return this.biometricAuthManager.canAuthenticateForAuthRequiredKeys();
    }

    private final SecretKey getSecretKey() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE);
        keyStore.load(null);
        Key key = keyStore.getKey(ALIAS, null);
        if (key instanceof SecretKey) {
            return (SecretKey) key;
        }
        return null;
    }

    public final void deleteSecretKey() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE);
            keyStore.load(null);
            if (getBiometricChange().doesKeyExist()) {
                keyStore.deleteEntry(ALIAS);
            }
        } catch (KeyStoreException e) {
            CrashReporter.Companion companion = CrashReporter.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                message = "KeyStoreException: Failed to delete secret key";
            }
            companion.log(message);
            CrashReporter.DefaultImpls.reportNonFatal$default(companion, new Exception(e), false, null, 4, null);
        }
    }

    private final Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance(CIPHER_TRANSFORMATION);
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
        return cipher;
    }

    public final BiometricEnrollmentChange getBiometricChange() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = getCipher();
        try {
            SecretKey secretKey = getSecretKey();
            if (secretKey == null) {
                return BiometricEnrollmentChange.KEY_NOT_INITIALIZED;
            }
            cipher.init(1, secretKey);
            return BiometricEnrollmentChange.CHANGE_NOT_DETECTED;
        } catch (Exception unused) {
            return BiometricEnrollmentChange.CHANGE_DETECTED;
        }
    }

    public final boolean checkIfAllBiometricsAreRemoved() {
        return getBiometricChange().doesKeyExist() && !this.biometricAuthManager.isBiometricsEnrolledOnDevice();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BiometricChangeManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/authlock/biometric/BiometricChangeManager$BiometricEnrollmentChange;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_DETECTED", "KEY_NOT_INITIALIZED", "CHANGE_NOT_DETECTED", "doesKeyExist", "", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BiometricEnrollmentChange {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BiometricEnrollmentChange[] $VALUES;
        public static final BiometricEnrollmentChange CHANGE_DETECTED = new BiometricEnrollmentChange("CHANGE_DETECTED", 0);
        public static final BiometricEnrollmentChange KEY_NOT_INITIALIZED = new BiometricEnrollmentChange("KEY_NOT_INITIALIZED", 1);
        public static final BiometricEnrollmentChange CHANGE_NOT_DETECTED = new BiometricEnrollmentChange("CHANGE_NOT_DETECTED", 2);

        private static final /* synthetic */ BiometricEnrollmentChange[] $values() {
            return new BiometricEnrollmentChange[]{CHANGE_DETECTED, KEY_NOT_INITIALIZED, CHANGE_NOT_DETECTED};
        }

        public static EnumEntries<BiometricEnrollmentChange> getEntries() {
            return $ENTRIES;
        }

        private BiometricEnrollmentChange(String str, int i) {
        }

        static {
            BiometricEnrollmentChange[] biometricEnrollmentChangeArr$values = $values();
            $VALUES = biometricEnrollmentChangeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(biometricEnrollmentChangeArr$values);
        }

        public final boolean doesKeyExist() {
            return this != KEY_NOT_INITIALIZED;
        }

        public static BiometricEnrollmentChange valueOf(String str) {
            return (BiometricEnrollmentChange) Enum.valueOf(BiometricEnrollmentChange.class, str);
        }

        public static BiometricEnrollmentChange[] values() {
            return (BiometricEnrollmentChange[]) $VALUES.clone();
        }
    }
}
