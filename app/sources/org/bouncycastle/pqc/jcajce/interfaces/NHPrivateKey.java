package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes25.dex */
public interface NHPrivateKey extends NHKey, PrivateKey {
    short[] getSecretData();
}
