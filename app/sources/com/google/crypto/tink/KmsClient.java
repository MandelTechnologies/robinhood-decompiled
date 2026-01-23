package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes27.dex */
public interface KmsClient {
    boolean doesSupport(String keyUri);

    Aead getAead(String keyUri) throws GeneralSecurityException;
}
