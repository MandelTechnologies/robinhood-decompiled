package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes25.dex */
public interface EdDSAPrivateKey extends EdDSAKey, PrivateKey {
    EdDSAPublicKey getPublicKey();
}
