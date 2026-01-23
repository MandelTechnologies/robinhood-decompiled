package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes25.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g */
    private GF2Matrix f8034g;

    /* renamed from: n */
    private int f8035n;

    /* renamed from: t */
    private int f8036t;

    public McEliecePublicKeyParameters(int i, int i2, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f8035n = i;
        this.f8036t = i2;
        this.f8034g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f8034g;
    }

    public int getK() {
        return this.f8034g.getNumRows();
    }

    public int getN() {
        return this.f8035n;
    }

    public int getT() {
        return this.f8036t;
    }
}
