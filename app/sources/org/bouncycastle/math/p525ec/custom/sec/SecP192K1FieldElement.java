package org.bouncycastle.math.p525ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p525ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes25.dex */
public class SecP192K1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q */
    public static final BigInteger f7858Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: x */
    protected int[] f7859x;

    public SecP192K1FieldElement() {
        this.f7859x = Nat192.create();
    }

    public SecP192K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f7858Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f7859x = SecP192K1Field.fromBigInteger(bigInteger);
    }

    protected SecP192K1FieldElement(int[] iArr) {
        this.f7859x = iArr;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.add(this.f7859x, ((SecP192K1FieldElement) eCFieldElement).f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.addOne(this.f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.inv(((SecP192K1FieldElement) eCFieldElement).f7859x, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, this.f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192K1FieldElement) {
            return Nat192.m3965eq(this.f7859x, ((SecP192K1FieldElement) obj).f7859x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public String getFieldName() {
        return "SecP192K1Field";
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public int getFieldSize() {
        return f7858Q.bitLength();
    }

    public int hashCode() {
        return f7858Q.hashCode() ^ Arrays.hashCode(this.f7859x, 0, 6);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.inv(this.f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f7859x);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f7859x);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.multiply(this.f7859x, ((SecP192K1FieldElement) eCFieldElement).f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.negate(this.f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f7859x;
        if (Nat192.isZero(iArr) || Nat192.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.square(iArr, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat192.create();
        SecP192K1Field.square(iArrCreate, iArrCreate2);
        SecP192K1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat192.create();
        SecP192K1Field.squareN(iArrCreate2, 3, iArrCreate3);
        SecP192K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP192K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP192K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SecP192K1Field.squareN(iArrCreate3, 8, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 3, iArrCreate3);
        SecP192K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        int[] iArrCreate4 = Nat192.create();
        SecP192K1Field.squareN(iArrCreate3, 16, iArrCreate4);
        SecP192K1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SecP192K1Field.squareN(iArrCreate4, 35, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate4, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 70, iArrCreate4);
        SecP192K1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SecP192K1Field.squareN(iArrCreate4, 19, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 20, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate3, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 4, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192K1Field.squareN(iArrCreate, 6, iArrCreate);
        SecP192K1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP192K1Field.square(iArrCreate, iArrCreate);
        SecP192K1Field.square(iArrCreate, iArrCreate2);
        if (Nat192.m3965eq(iArr, iArrCreate2)) {
            return new SecP192K1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.square(this.f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat192.create();
        SecP192K1Field.subtract(this.f7859x, ((SecP192K1FieldElement) eCFieldElement).f7859x, iArrCreate);
        return new SecP192K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f7859x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p525ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f7859x);
    }
}
