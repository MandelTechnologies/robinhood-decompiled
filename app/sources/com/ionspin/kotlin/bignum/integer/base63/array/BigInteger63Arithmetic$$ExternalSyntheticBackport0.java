package com.ionspin.kotlin.bignum.integer.base63.array;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes27.dex */
public final /* synthetic */ class BigInteger63Arithmetic$$ExternalSyntheticBackport0 {
    /* renamed from: m */
    public static /* synthetic */ long m1068m(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
            j2 = 0;
        }
        return j3 - j2;
    }
}
