package com.adjust.sdk.sig;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.adjust.sdk.sig.c */
/* loaded from: classes16.dex */
public final class C4751c {

    /* renamed from: a */
    public final int f572a;

    public C4751c(int i) {
        this.f572a = i;
    }

    /* renamed from: a */
    public final void m762a(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance(BiometricChangeManager.ANDROID_KEY_STORE);
        keyStore.load(null);
        keyStore.deleteEntry("key2");
        context.getSharedPreferences("adjust_keys", 0).edit().remove("encrypted_key").apply();
    }

    /* renamed from: b */
    public final void m764b(Context context) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        int i = this.f572a;
        if (i >= 23) {
            KeyStore keyStore = KeyStore.getInstance(BiometricChangeManager.ANDROID_KEY_STORE);
            keyStore.load(null);
            if (keyStore.containsAlias("key2")) {
                return;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256", BiometricChangeManager.ANDROID_KEY_STORE);
            keyGenerator.init(new KeyGenParameterSpec.Builder("key2", 4).build());
            keyGenerator.generateKey();
            return;
        }
        if (i < 18) {
            throw new C4750b();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("adjust_keys", 0);
        if (sharedPreferences.contains("encrypted_key")) {
            return;
        }
        Date time = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, 1);
        KeyPairGeneratorSpec.Builder endDate = new KeyPairGeneratorSpec.Builder(context).setAlias("key2").setSubject(new X500Principal("CN=key2")).setSerialNumber(BigInteger.TEN).setStartDate(time).setEndDate(calendar.getTime());
        if (this.f572a >= 19) {
            endDate.setKeySize(1024);
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", BiometricChangeManager.ANDROID_KEY_STORE);
        keyPairGenerator.initialize(endDate.build());
        keyPairGenerator.genKeyPair();
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        KeyStore keyStore2 = KeyStore.getInstance(BiometricChangeManager.ANDROID_KEY_STORE);
        keyStore2.load(null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore2.getEntry("key2", null);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, privateKeyEntry.getCertificate().getPublicKey());
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(bArr), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("encrypted_key", strEncodeToString);
        editorEdit.apply();
    }

    /* renamed from: a */
    public final byte[] m763a(Context context, byte[] bArr) throws IllegalStateException, NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException {
        Key secretKeySpec;
        Mac mac = Mac.getInstance("HmacSHA256");
        int i = this.f572a;
        if (i >= 23) {
            KeyStore keyStore = KeyStore.getInstance(BiometricChangeManager.ANDROID_KEY_STORE);
            keyStore.load(null);
            secretKeySpec = keyStore.getKey("key2", null);
        } else {
            if (i < 18) {
                throw new RuntimeException("Unsupported version");
            }
            String string2 = context.getSharedPreferences("adjust_keys", 0).getString("encrypted_key", null);
            if (string2 == null) {
                throw new RuntimeException("Failed to find encrypted key in SharedPreferences");
            }
            byte[] bArrDecode = Base64.decode(string2, 0);
            KeyStore keyStore2 = KeyStore.getInstance(BiometricChangeManager.ANDROID_KEY_STORE);
            keyStore2.load(null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore2.getEntry("key2", null);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, privateKeyEntry.getPrivateKey());
            secretKeySpec = new SecretKeySpec(cipher.doFinal(bArrDecode), BiometricChangeManager.ALGORITHM);
        }
        mac.init(secretKeySpec);
        mac.update(bArr);
        return mac.doFinal();
    }
}
