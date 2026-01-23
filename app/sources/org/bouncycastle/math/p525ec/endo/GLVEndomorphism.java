package org.bouncycastle.math.p525ec.endo;

import java.math.BigInteger;

/* loaded from: classes25.dex */
public interface GLVEndomorphism extends ECEndomorphism {
    BigInteger[] decomposeScalar(BigInteger bigInteger);
}
