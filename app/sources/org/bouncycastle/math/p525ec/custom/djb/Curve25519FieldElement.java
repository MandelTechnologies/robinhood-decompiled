package org.bouncycastle.math.p525ec.custom.djb;

import java.math.BigInteger;
import org.bouncycastle.math.p525ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* loaded from: classes25.dex */
public class Curve25519FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: x */
    protected int[] f7832x;

    /* renamed from: Q */
    public static final BigInteger f7831Q = Nat256.toBigInteger(Curve25519Field.f7829P);
    private static final int[] PRECOMP_POW2 = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public Curve25519FieldElement() {
        this.f7832x = Nat256.create();
    }

    public Curve25519FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f7831Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f7832x = Curve25519Field.fromBigInteger(bigInteger);
    }

    protected Curve25519FieldElement(int[] iArr) {
        this.f7832x = iArr;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.add(this.f7832x, ((Curve25519FieldElement) eCFieldElement).f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.addOne(this.f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.inv(((Curve25519FieldElement) eCFieldElement).f7832x, iArrCreate);
        Curve25519Field.multiply(iArrCreate, this.f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Curve25519FieldElement) {
            return Nat256.m3967eq(this.f7832x, ((Curve25519FieldElement) obj).f7832x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public String getFieldName() {
        return "Curve25519Field";
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public int getFieldSize() {
        return f7831Q.bitLength();
    }

    public int hashCode() {
        return f7831Q.hashCode() ^ Arrays.hashCode(this.f7832x, 0, 8);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.inv(this.f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f7832x);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f7832x);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.multiply(this.f7832x, ((Curve25519FieldElement) eCFieldElement).f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.negate(this.f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f7832x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        Curve25519Field.square(iArr, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArr, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat256.create();
        Curve25519Field.square(iArrCreate, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat256.create();
        Curve25519Field.squareN(iArrCreate2, 3, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 4, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        Curve25519Field.squareN(iArrCreate, 4, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 15, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        Curve25519Field.squareN(iArrCreate2, 30, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 60, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        Curve25519Field.squareN(iArrCreate2, 11, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 120, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m3967eq(iArr, iArrCreate2)) {
            return new Curve25519FieldElement(iArrCreate);
        }
        Curve25519Field.multiply(iArrCreate, PRECOMP_POW2, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m3967eq(iArr, iArrCreate2)) {
            return new Curve25519FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.square(this.f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.subtract(this.f7832x, ((Curve25519FieldElement) eCFieldElement).f7832x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f7832x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f7832x);
    }
}
