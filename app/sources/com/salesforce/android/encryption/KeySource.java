package com.salesforce.android.encryption;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;

/* loaded from: classes12.dex */
interface KeySource {
    SecretKey getHmacKey(String str) throws GeneralSecurityException, IOException;
}
