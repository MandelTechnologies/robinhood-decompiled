package com.google.crypto.tink.prf;

import java.security.GeneralSecurityException;

/* loaded from: classes27.dex */
public interface Prf {
    byte[] compute(byte[] input, int outputLength) throws GeneralSecurityException;
}
