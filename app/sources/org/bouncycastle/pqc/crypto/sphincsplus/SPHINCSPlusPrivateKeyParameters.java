package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* loaded from: classes25.dex */
public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {

    /* renamed from: pk */
    final C48001PK f8064pk;

    /* renamed from: sk */
    final C48002SK f8065sk;

    SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, C48002SK c48002sk, C48001PK c48001pk) {
        super(true, sPHINCSPlusParameters);
        this.f8065sk = c48002sk;
        this.f8064pk = c48001pk;
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int i = sPHINCSPlusParameters.getEngine().f8062N;
        int i2 = i * 4;
        if (bArr.length != i2) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i3 = i * 2;
        this.f8065sk = new C48002SK(Arrays.copyOfRange(bArr, 0, i), Arrays.copyOfRange(bArr, i, i3));
        int i4 = i * 3;
        this.f8064pk = new C48001PK(Arrays.copyOfRange(bArr, i3, i4), Arrays.copyOfRange(bArr, i4, i2));
    }

    public byte[] getEncoded() {
        C48002SK c48002sk = this.f8065sk;
        byte[] bArr = c48002sk.seed;
        byte[] bArr2 = c48002sk.prf;
        C48001PK c48001pk = this.f8064pk;
        return Arrays.concatenate(bArr, bArr2, c48001pk.seed, c48001pk.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f8065sk.prf);
    }

    public byte[] getPublicKey() {
        C48001PK c48001pk = this.f8064pk;
        return Arrays.concatenate(c48001pk.seed, c48001pk.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f8064pk.seed);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f8065sk.seed);
    }
}
