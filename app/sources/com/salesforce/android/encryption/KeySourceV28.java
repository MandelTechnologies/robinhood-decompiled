package com.salesforce.android.encryption;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.crypto.SecretKey;

/* loaded from: classes12.dex */
class KeySourceV28 extends KeySourceV23 implements KeySource {
    KeySourceV28(KeyStoreProvider keyStoreProvider, KeySourceV19 keySourceV19) {
        super(keyStoreProvider, keySourceV19);
    }

    @Override // com.salesforce.android.encryption.KeySourceV23
    protected SecretKey getKeyFromKeyStore(KeyStore keyStore, String str) throws GeneralSecurityException, IOException {
        return (SecretKey) keyStore.getKey(str, null);
    }

    @Override // com.salesforce.android.encryption.KeySourceV23
    protected boolean isApi19Key(KeyStore keyStore, String str) throws KeyStoreException {
        return keyStore.isKeyEntry(str) && keyStore.isCertificateEntry(str);
    }
}
