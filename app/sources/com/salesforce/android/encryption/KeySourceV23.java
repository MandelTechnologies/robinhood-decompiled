package com.salesforce.android.encryption;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* loaded from: classes12.dex */
class KeySourceV23 implements KeySource {
    protected KeySourceV19 keySourceV19;
    protected KeyStoreProvider keyStoreProvider;

    KeySourceV23(KeyStoreProvider keyStoreProvider, KeySourceV19 keySourceV19) {
        this.keyStoreProvider = keyStoreProvider;
        this.keySourceV19 = keySourceV19;
    }

    @Override // com.salesforce.android.encryption.KeySource
    public SecretKey getHmacKey(String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = this.keyStoreProvider.getKeyStore();
        if (!keyStore.containsAlias(str)) {
            generateHmacKey(str);
        } else if (isApi19Key(keyStore, str)) {
            return this.keySourceV19.getHmacKey(str);
        }
        return getKeyFromKeyStore(keyStore, str);
    }

    protected SecretKey getKeyFromKeyStore(KeyStore keyStore, String str) throws GeneralSecurityException, IOException {
        return ((KeyStore.SecretKeyEntry) keyStore.getEntry(str, null)).getSecretKey();
    }

    protected boolean isApi19Key(KeyStore keyStore, String str) throws KeyStoreException {
        return keyStore.entryInstanceOf(str, KeyStore.PrivateKeyEntry.class);
    }

    private void generateHmacKey(String str) throws GeneralSecurityException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256", this.keyStoreProvider.getKeyStoreType());
        keyGenerator.init(new KeyGenParameterSpec.Builder(str, 4).build());
        keyGenerator.generateKey();
    }
}
