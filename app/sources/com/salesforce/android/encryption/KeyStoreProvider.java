package com.salesforce.android.encryption;

import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* loaded from: classes12.dex */
class KeyStoreProvider {
    KeyStoreProvider() {
    }

    KeyStore getKeyStore() throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(BiometricChangeManager.ANDROID_KEY_STORE);
        keyStore.load(null);
        return keyStore;
    }

    String getKeyStoreType() {
        return BiometricChangeManager.ANDROID_KEY_STORE;
    }
}
