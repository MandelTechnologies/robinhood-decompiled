package com.salesforce.android.encryption;

import android.content.Context;
import android.util.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* loaded from: classes12.dex */
public class SalesforceEncryption implements KeySource, Encrypter {
    private final Encrypter encrypter;
    private final KeySource keySource;

    public SalesforceEncryption(Context context) {
        this(context, new KeyStoreProvider(), new ComponentProvider());
    }

    SalesforceEncryption(Context context, KeyStoreProvider keyStoreProvider, ComponentProvider componentProvider) {
        KeySource keySource = componentProvider.getKeySource(context, keyStoreProvider);
        this.keySource = keySource;
        this.encrypter = componentProvider.getEncrypter(keySource);
    }

    @Override // com.salesforce.android.encryption.KeySource
    public SecretKey getHmacKey(String str) throws GeneralSecurityException, IOException {
        return this.keySource.getHmacKey(str);
    }

    public String hashStringWithHmac(String str, String str2) throws GeneralSecurityException, IOException {
        return Base64.encodeToString(computeHmac(getHmacKey(str), str2), 0);
    }

    byte[] computeHmac(Key key, String str) throws GeneralSecurityException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(key);
        return mac.doFinal(str.getBytes());
    }
}
