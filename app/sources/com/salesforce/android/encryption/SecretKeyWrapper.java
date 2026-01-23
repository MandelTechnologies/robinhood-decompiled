package com.salesforce.android.encryption;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes12.dex */
class SecretKeyWrapper {
    private final Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    private final KeyPair keyPair;

    SecretKeyWrapper(Context context, KeyStoreProvider keyStoreProvider, String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = keyStoreProvider.getKeyStore();
        if (!keyStore.containsAlias(str)) {
            generateKeyPair(context, keyStoreProvider.getKeyStoreType(), str);
        }
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null);
        this.keyPair = new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
    }

    private static void generateKeyPair(Context context, String str, String str2) throws GeneralSecurityException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.add(1, 100);
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context).setAlias(str2).setSubject(new X500Principal("CN=" + str2)).setSerialNumber(BigInteger.ONE).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", str);
        keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
        keyPairGenerator.generateKeyPair();
    }

    byte[] wrap(SecretKey secretKey) throws GeneralSecurityException {
        this.cipher.init(3, this.keyPair.getPublic());
        return this.cipher.wrap(secretKey);
    }

    SecretKey unwrap(byte[] bArr) throws GeneralSecurityException {
        this.cipher.init(4, this.keyPair.getPrivate());
        return (SecretKey) this.cipher.unwrap(bArr, BiometricChangeManager.ALGORITHM, 3);
    }
}
