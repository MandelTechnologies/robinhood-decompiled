package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* renamed from: org.bouncycastle.pqc.crypto.sphincsplus.HT */
/* loaded from: classes25.dex */
class C48000HT {
    SPHINCSPlusEngine engine;
    final byte[] htPubKey;
    private final byte[] pkSeed;
    private final byte[] skSeed;
    WotsPlus wots;

    public C48000HT(SPHINCSPlusEngine sPHINCSPlusEngine, byte[] bArr, byte[] bArr2) {
        this.skSeed = bArr;
        this.pkSeed = bArr2;
        this.engine = sPHINCSPlusEngine;
        this.wots = new WotsPlus(sPHINCSPlusEngine);
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(sPHINCSPlusEngine.f8059D - 1);
        adrs.setTreeAddress(0L);
        if (bArr != null) {
            this.htPubKey = xmss_PKgen(bArr, bArr2, adrs);
        } else {
            this.htPubKey = null;
        }
    }

    byte[] sign(byte[] bArr, long j, int i) {
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        C48000HT c48000ht = this;
        SIG_XMSS sig_xmssXmss_sign = c48000ht.xmss_sign(bArr, this.skSeed, i, this.pkSeed, adrs);
        int i2 = c48000ht.engine.f8059D;
        SIG_XMSS[] sig_xmssArr = new SIG_XMSS[i2];
        sig_xmssArr[0] = sig_xmssXmss_sign;
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        byte[] bArrXmss_pkFromSig = c48000ht.xmss_pkFromSig(i, sig_xmssXmss_sign, bArr, c48000ht.pkSeed, adrs);
        int i3 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = c48000ht.engine;
            if (i3 >= sPHINCSPlusEngine.f8059D) {
                break;
            }
            int i4 = (int) (((1 << r2) - 1) & j);
            j >>>= sPHINCSPlusEngine.H_PRIME;
            adrs.setLayerAddress(i3);
            adrs.setTreeAddress(j);
            SIG_XMSS sig_xmssXmss_sign2 = c48000ht.xmss_sign(bArrXmss_pkFromSig, c48000ht.skSeed, i4, c48000ht.pkSeed, adrs);
            sig_xmssArr[i3] = sig_xmssXmss_sign2;
            if (i3 < c48000ht.engine.f8059D - 1) {
                bArrXmss_pkFromSig = c48000ht.xmss_pkFromSig(i4, sig_xmssXmss_sign2, bArrXmss_pkFromSig, c48000ht.pkSeed, adrs);
            }
            i3++;
            c48000ht = this;
        }
        byte[][] bArr2 = new byte[i2][];
        for (int i5 = 0; i5 != i2; i5++) {
            SIG_XMSS sig_xmss = sig_xmssArr[i5];
            bArr2[i5] = Arrays.concatenate(sig_xmss.sig, Arrays.concatenate(sig_xmss.auth));
        }
        return Arrays.concatenate(bArr2);
    }

    byte[] treehash(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        LinkedList linkedList = new LinkedList();
        int i3 = 1 << i2;
        if (i % i3 != 0) {
            return null;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            adrs2.setType(0);
            int i5 = i + i4;
            adrs2.setKeyPairAddress(i5);
            byte[] bArrPkGen = this.wots.pkGen(bArr, bArr2, adrs2);
            adrs2.setType(2);
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i5);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkGen = this.engine.mo3978H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrPkGen);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(bArrPkGen, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }

    public boolean verify(byte[] bArr, SIG_XMSS[] sig_xmssArr, byte[] bArr2, long j, int i, byte[] bArr3) {
        ADRS adrs = new ADRS();
        SIG_XMSS sig_xmss = sig_xmssArr[0];
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        C48000HT c48000ht = this;
        byte[] bArrXmss_pkFromSig = c48000ht.xmss_pkFromSig(i, sig_xmss, bArr, bArr2, adrs);
        int i2 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = c48000ht.engine;
            if (i2 >= sPHINCSPlusEngine.f8059D) {
                return Arrays.areEqual(bArr3, bArrXmss_pkFromSig);
            }
            int i3 = (int) (((1 << r12) - 1) & j);
            j >>>= sPHINCSPlusEngine.H_PRIME;
            SIG_XMSS sig_xmss2 = sig_xmssArr[i2];
            adrs.setLayerAddress(i2);
            adrs.setTreeAddress(j);
            bArrXmss_pkFromSig = c48000ht.xmss_pkFromSig(i3, sig_xmss2, bArrXmss_pkFromSig, bArr2, adrs);
            i2++;
            c48000ht = this;
        }
    }

    byte[] xmss_PKgen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        return treehash(bArr, 0, this.engine.H_PRIME, bArr2, adrs);
    }

    byte[] xmss_pkFromSig(int i, SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        int i2 = 0;
        adrs2.setType(0);
        adrs2.setKeyPairAddress(i);
        byte[] wOTSSig = sig_xmss.getWOTSSig();
        byte[][] xmssauth = sig_xmss.getXMSSAUTH();
        byte[] bArrPkFromSig = this.wots.pkFromSig(wOTSSig, bArr, bArr2, adrs2);
        adrs2.setType(2);
        adrs2.setTreeIndex(i);
        while (i2 < this.engine.H_PRIME) {
            int i3 = i2 + 1;
            adrs2.setTreeHeight(i3);
            if ((i / (1 << i2)) % 2 == 0) {
                adrs2.setTreeIndex(adrs2.getTreeIndex() / 2);
                bArrPkFromSig = this.engine.mo3978H(bArr2, adrs2, bArrPkFromSig, xmssauth[i2]);
            } else {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkFromSig = this.engine.mo3978H(bArr2, adrs2, xmssauth[i2], bArrPkFromSig);
            }
            i2 = i3;
        }
        return bArrPkFromSig;
    }

    SIG_XMSS xmss_sign(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, ADRS adrs) {
        byte[][] bArr4 = new byte[this.engine.H_PRIME][];
        int i2 = 0;
        while (i2 < this.engine.H_PRIME) {
            int i3 = 1 << i2;
            int i4 = (1 ^ (i / i3)) * i3;
            byte[] bArr5 = bArr2;
            bArr4[i2] = treehash(bArr5, i4, i2, bArr3, adrs);
            i2++;
            bArr2 = bArr5;
        }
        byte[] bArr6 = bArr2;
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(0);
        adrs2.setKeyPairAddress(i);
        return new SIG_XMSS(this.wots.sign(bArr, bArr6, bArr3, adrs2), bArr4);
    }
}
