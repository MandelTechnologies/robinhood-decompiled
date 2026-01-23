package org.bouncycastle.asn1.p518x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.p525ec.ECFieldElement;

/* loaded from: classes25.dex */
public class X9FieldElement extends ASN1Object {
    private static X9IntegerConverter converter = new X9IntegerConverter();

    /* renamed from: f */
    protected ECFieldElement f7236f;

    public X9FieldElement(ECFieldElement eCFieldElement) {
        this.f7236f = eCFieldElement;
    }

    public ECFieldElement getValue() {
        return this.f7236f;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(converter.integerToBytes(this.f7236f.toBigInteger(), converter.getByteLength(this.f7236f)));
    }
}
