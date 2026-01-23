package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes25.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a */
    ASN1Integer f7157a;

    /* renamed from: b */
    ASN1Integer f7158b;

    /* renamed from: p */
    ASN1Integer f7159p;

    /* renamed from: q */
    ASN1Integer f7160q;

    /* renamed from: x */
    ASN1Integer f7161x;

    /* renamed from: y */
    ASN1Integer f7162y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f7157a = new ASN1Integer(bigInteger);
        this.f7158b = new ASN1Integer(bigInteger2);
        this.f7159p = new ASN1Integer(bigInteger3);
        this.f7160q = new ASN1Integer(bigInteger4);
        this.f7161x = new ASN1Integer(i);
        this.f7162y = new ASN1Integer(bigInteger5);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f7157a = (ASN1Integer) objects.nextElement();
        this.f7158b = (ASN1Integer) objects.nextElement();
        this.f7159p = (ASN1Integer) objects.nextElement();
        this.f7160q = (ASN1Integer) objects.nextElement();
        this.f7161x = (ASN1Integer) objects.nextElement();
        this.f7162y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public BigInteger getA() {
        return this.f7157a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f7159p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f7160q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f7157a);
        aSN1EncodableVector.add(this.f7158b);
        aSN1EncodableVector.add(this.f7159p);
        aSN1EncodableVector.add(this.f7160q);
        aSN1EncodableVector.add(this.f7161x);
        aSN1EncodableVector.add(this.f7162y);
        return new DERSequence(aSN1EncodableVector);
    }
}
