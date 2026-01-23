package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;
import org.bouncycastle.math.p525ec.ECPoint;

/* loaded from: classes25.dex */
public interface ECPublicKey extends ECKey, PublicKey {
    ECPoint getQ();
}
