package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: classes25.dex */
class Fors {
    SPHINCSPlusEngine engine;
    private final WotsPlus wots;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.wots = new WotsPlus(sPHINCSPlusEngine);
    }

    static int[] message_to_idxs(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i4] = iArr[i4] ^ (((bArr[i3 >> 3] >> (i3 & 7)) & 1) << i5);
                i3++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i;
        int i2 = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i3 = sPHINCSPlusEngine.f8061K;
        byte[][] bArr4 = new byte[i3][];
        int i4 = sPHINCSPlusEngine.f8063T;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, i3, sPHINCSPlusEngine.f8058A);
        int i5 = 0;
        while (i5 < this.engine.f8061K) {
            int i6 = iArrMessage_to_idxs[i5];
            byte[] sk = sig_forsArr[i5].getSK();
            adrs.setTreeHeight(0);
            int i7 = (i5 * i4) + i6;
            adrs.setTreeIndex(i7);
            bArr3[0] = this.engine.mo3977F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i5].getAuthPath();
            adrs.setTreeIndex(i7);
            int i8 = 0;
            while (i8 < this.engine.f8058A) {
                int i9 = i8 + 1;
                adrs.setTreeHeight(i9);
                if ((i6 / (1 << i8)) % i2 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i2);
                    i = i2;
                    bArr3[1] = this.engine.mo3978H(bArr2, adrs, bArr3[0], authPath[i8]);
                } else {
                    i = i2;
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.mo3978H(bArr2, adrs, authPath[i8], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i8 = i9;
                i2 = i;
            }
            bArr4[i5] = bArr3[0];
            i5++;
            i2 = i2;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.f8061K][];
        int i = 0;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
            if (i >= sPHINCSPlusEngine.f8061K) {
                adrs2.setType(4);
                adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
                return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
            }
            byte[] bArr4 = bArr;
            bArr3[i] = treehash(bArr4, i * sPHINCSPlusEngine.f8063T, sPHINCSPlusEngine.f8058A, bArr2, adrs);
            i++;
            bArr = bArr4;
        }
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = adrs;
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.f8061K, sPHINCSPlusEngine.f8058A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.f8061K];
        int i = sPHINCSPlusEngine2.f8063T;
        int i2 = 0;
        while (i2 < fors.engine.f8061K) {
            int i3 = iArrMessage_to_idxs[i2];
            adrs2.setTreeHeight(0);
            int i4 = i2 * i;
            adrs2.setTreeIndex(i4 + i3);
            byte[] bArr4 = bArr2;
            byte[] bArrPRF = fors.engine.PRF(bArr4, adrs2);
            byte[][] bArr5 = new byte[fors.engine.f8058A][];
            int i5 = 0;
            while (i5 < fors.engine.f8058A) {
                int i6 = 1 << i5;
                bArr5[i5] = fors.treehash(bArr4, ((1 ^ (i3 / i6)) * i6) + i4, i5, bArr3, adrs2);
                i5++;
                fors = this;
                bArr4 = bArr2;
                adrs2 = adrs;
            }
            sig_forsArr[i2] = new SIG_FORS(bArrPRF, bArr5);
            i2++;
            fors = this;
            adrs2 = adrs;
        }
        return sig_forsArr;
    }

    byte[] treehash(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        LinkedList linkedList = new LinkedList();
        int i3 = 1 << i2;
        if (i % i3 != 0) {
            return null;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            adrs2.setTreeHeight(0);
            int i5 = i + i4;
            adrs2.setTreeIndex(i5);
            byte[] bArrMo3977F = this.engine.mo3977F(bArr2, adrs2, this.engine.PRF(bArr, adrs2));
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i5);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrMo3977F = this.engine.mo3978H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrMo3977F);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(bArrMo3977F, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
