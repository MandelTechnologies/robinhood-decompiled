package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes25.dex */
public class HMacDSAKCalculator implements DSAKCalculator {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* renamed from: K */
    private final byte[] f7729K;

    /* renamed from: V */
    private final byte[] f7730V;
    private final HMac hMac;

    /* renamed from: n */
    private BigInteger f7731n;

    public HMacDSAKCalculator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.hMac = hMac;
        this.f7730V = new byte[hMac.getMacSize()];
        this.f7729K = new byte[hMac.getMacSize()];
    }

    private BigInteger bitsToInt(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f7731n.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f7731n.bitLength()) : bigInteger;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f7731n = bigInteger;
        Arrays.fill(this.f7730V, (byte) 1);
        Arrays.fill(this.f7729K, (byte) 0);
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(bigInteger);
        byte[] bArr2 = new byte[unsignedByteLength];
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger2);
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr2, unsignedByteLength - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
        byte[] bArr3 = new byte[unsignedByteLength];
        BigInteger bigIntegerBitsToInt = bitsToInt(bArr);
        if (bigIntegerBitsToInt.compareTo(bigInteger) >= 0) {
            bigIntegerBitsToInt = bigIntegerBitsToInt.subtract(bigInteger);
        }
        byte[] bArrAsUnsignedByteArray2 = BigIntegers.asUnsignedByteArray(bigIntegerBitsToInt);
        System.arraycopy(bArrAsUnsignedByteArray2, 0, bArr3, unsignedByteLength - bArrAsUnsignedByteArray2.length, bArrAsUnsignedByteArray2.length);
        this.hMac.init(new KeyParameter(this.f7729K));
        HMac hMac = this.hMac;
        byte[] bArr4 = this.f7730V;
        hMac.update(bArr4, 0, bArr4.length);
        this.hMac.update((byte) 0);
        this.hMac.update(bArr2, 0, unsignedByteLength);
        this.hMac.update(bArr3, 0, unsignedByteLength);
        this.hMac.doFinal(this.f7729K, 0);
        this.hMac.init(new KeyParameter(this.f7729K));
        HMac hMac2 = this.hMac;
        byte[] bArr5 = this.f7730V;
        hMac2.update(bArr5, 0, bArr5.length);
        this.hMac.doFinal(this.f7730V, 0);
        HMac hMac3 = this.hMac;
        byte[] bArr6 = this.f7730V;
        hMac3.update(bArr6, 0, bArr6.length);
        this.hMac.update((byte) 1);
        this.hMac.update(bArr2, 0, unsignedByteLength);
        this.hMac.update(bArr3, 0, unsignedByteLength);
        this.hMac.doFinal(this.f7729K, 0);
        this.hMac.init(new KeyParameter(this.f7729K));
        HMac hMac4 = this.hMac;
        byte[] bArr7 = this.f7730V;
        hMac4.update(bArr7, 0, bArr7.length);
        this.hMac.doFinal(this.f7730V, 0);
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public boolean isDeterministic() {
        return true;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public BigInteger nextK() {
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(this.f7731n);
        byte[] bArr = new byte[unsignedByteLength];
        while (true) {
            int i = 0;
            while (i < unsignedByteLength) {
                HMac hMac = this.hMac;
                byte[] bArr2 = this.f7730V;
                hMac.update(bArr2, 0, bArr2.length);
                this.hMac.doFinal(this.f7730V, 0);
                int iMin = Math.min(unsignedByteLength - i, this.f7730V.length);
                System.arraycopy(this.f7730V, 0, bArr, i, iMin);
                i += iMin;
            }
            BigInteger bigIntegerBitsToInt = bitsToInt(bArr);
            if (bigIntegerBitsToInt.compareTo(ZERO) > 0 && bigIntegerBitsToInt.compareTo(this.f7731n) < 0) {
                return bigIntegerBitsToInt;
            }
            HMac hMac2 = this.hMac;
            byte[] bArr3 = this.f7730V;
            hMac2.update(bArr3, 0, bArr3.length);
            this.hMac.update((byte) 0);
            this.hMac.doFinal(this.f7729K, 0);
            this.hMac.init(new KeyParameter(this.f7729K));
            HMac hMac3 = this.hMac;
            byte[] bArr4 = this.f7730V;
            hMac3.update(bArr4, 0, bArr4.length);
            this.hMac.doFinal(this.f7730V, 0);
        }
    }
}
