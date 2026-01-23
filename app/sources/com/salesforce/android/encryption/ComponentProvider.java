package com.salesforce.android.encryption;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: classes12.dex */
class ComponentProvider {
    private boolean isUsingMarshmallowSecurity() {
        return true;
    }

    ComponentProvider() {
    }

    @SuppressLint({"NewApi"})
    KeySource getKeySource(Context context, KeyStoreProvider keyStoreProvider) {
        KeySourceV19 keySourceV19 = new KeySourceV19(context, getSharedPreferences(context), keyStoreProvider);
        if (isUsingPieSecurity()) {
            return new KeySourceV28(keyStoreProvider, keySourceV19);
        }
        return isUsingMarshmallowSecurity() ? new KeySourceV23(keyStoreProvider, keySourceV19) : keySourceV19;
    }

    Encrypter getEncrypter(KeySource keySource) {
        return new AESEncrypter(keySource);
    }

    private SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("com.salesforce.android.encryption", 0);
    }

    private boolean isUsingPieSecurity() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
