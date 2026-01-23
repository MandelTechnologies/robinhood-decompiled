package com.salesforce.android.encryption;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* loaded from: classes12.dex */
class KeySourceV19 implements KeySource {
    private final Context context;
    private final KeyStoreProvider keyStoreProvider;
    private final SharedPreferences sharedPreferences;

    KeySourceV19(Context context, SharedPreferences sharedPreferences, KeyStoreProvider keyStoreProvider) {
        this.context = context.getApplicationContext();
        this.sharedPreferences = sharedPreferences;
        this.keyStoreProvider = keyStoreProvider;
    }

    @Override // com.salesforce.android.encryption.KeySource
    public SecretKey getHmacKey(String str) throws GeneralSecurityException, IOException {
        SecretKeyWrapper secretKeyWrapper = new SecretKeyWrapper(this.context, this.keyStoreProvider, str);
        byte[] fromStorage = readFromStorage(str);
        if (fromStorage != null) {
            return secretKeyWrapper.unwrap(fromStorage);
        }
        SecretKey secretKeyGenerateHmacKey = generateHmacKey();
        writeToStorage(str, secretKeyWrapper.wrap(secretKeyGenerateHmacKey));
        return secretKeyGenerateHmacKey;
    }

    private byte[] readFromStorage(String str) {
        String string2 = this.sharedPreferences.getString(str, null);
        if (string2 != null) {
            return Base64.decode(string2, 0);
        }
        return null;
    }

    private void writeToStorage(String str, byte[] bArr) {
        this.sharedPreferences.edit().putString(str, Base64.encodeToString(bArr, 0)).apply();
    }

    private SecretKey generateHmacKey() throws GeneralSecurityException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
        keyGenerator.init(new SecureRandom());
        return keyGenerator.generateKey();
    }
}
