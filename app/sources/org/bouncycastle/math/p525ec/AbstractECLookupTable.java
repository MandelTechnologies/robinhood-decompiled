package org.bouncycastle.math.p525ec;

/* loaded from: classes25.dex */
public abstract class AbstractECLookupTable implements ECLookupTable {
    @Override // org.bouncycastle.math.p525ec.ECLookupTable
    public ECPoint lookupVar(int i) {
        return lookup(i);
    }
}
