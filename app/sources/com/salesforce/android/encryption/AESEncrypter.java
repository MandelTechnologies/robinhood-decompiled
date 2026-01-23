package com.salesforce.android.encryption;

/* loaded from: classes12.dex */
class AESEncrypter implements Encrypter {
    private final KeySource keySource;

    AESEncrypter(KeySource keySource) {
        this.keySource = keySource;
    }
}
