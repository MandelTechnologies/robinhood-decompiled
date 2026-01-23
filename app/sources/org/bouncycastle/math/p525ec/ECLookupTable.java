package org.bouncycastle.math.p525ec;

/* loaded from: classes25.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i);

    ECPoint lookupVar(int i);
}
