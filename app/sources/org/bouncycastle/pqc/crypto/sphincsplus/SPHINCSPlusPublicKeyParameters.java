package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* loaded from: classes25.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {

    /* renamed from: pk */
    private final C48001PK f8066pk;

    SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, C48001PK c48001pk) {
        super(false, sPHINCSPlusParameters);
        this.f8066pk = c48001pk;
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int i = sPHINCSPlusParameters.getEngine().f8062N;
        int i2 = i * 2;
        if (bArr.length != i2) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f8066pk = new C48001PK(Arrays.copyOfRange(bArr, 0, i), Arrays.copyOfRange(bArr, i, i2));
    }

    public byte[] getEncoded() {
        C48001PK c48001pk = this.f8066pk;
        return Arrays.concatenate(c48001pk.seed, c48001pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f8066pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f8066pk.seed);
    }
}
