package org.bouncycastle.crypto.params;

/* loaded from: classes25.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c */
    private int f7690c;

    /* renamed from: cL */
    private long f7691cL;

    /* renamed from: x0 */
    private int f7692x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f7692x0 = i;
        this.f7690c = i2;
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f7691cL = j2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f7690c == this.f7690c && gOST3410ValidationParameters.f7692x0 == this.f7692x0 && gOST3410ValidationParameters.f7691cL == this.f7691cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f7690c;
    }

    public long getCL() {
        return this.f7691cL;
    }

    public int getX0() {
        return this.f7692x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f7692x0 ^ this.f7690c;
        long j = this.x0L;
        int i2 = (i ^ ((int) j)) ^ ((int) (j >> 32));
        long j2 = this.f7691cL;
        return (i2 ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }
}
