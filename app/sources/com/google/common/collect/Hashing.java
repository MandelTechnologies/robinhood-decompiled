package com.google.common.collect;

/* loaded from: classes.dex */
final class Hashing {
    static int smear(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }

    static int smearedHash(Object o) {
        return smear(o == null ? 0 : o.hashCode());
    }

    static int closedTableSize(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (loadFactor * iHighestOneBit))) {
            return iHighestOneBit;
        }
        int i = iHighestOneBit << 1;
        if (i > 0) {
            return i;
        }
        return 1073741824;
    }
}
