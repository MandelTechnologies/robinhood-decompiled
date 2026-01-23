package org.bouncycastle.asn1.p518x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.p525ec.ECCurve;
import org.bouncycastle.math.p525ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* loaded from: classes25.dex */
public class X9ECPoint extends ASN1Object {

    /* renamed from: c */
    private ECCurve f7234c;

    /* renamed from: encoding, reason: collision with root package name */
    private final ASN1OctetString f10829encoding;

    /* renamed from: p */
    private ECPoint f7235p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f7234c = eCCurve;
        this.f10829encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint, boolean z) {
        this.f7235p = eCPoint.normalize();
        this.f10829encoding = new DEROctetString(eCPoint.getEncoded(z));
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.f7235p == null) {
                this.f7235p = this.f7234c.decodePoint(this.f10829encoding.getOctets()).normalize();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7235p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.f10829encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b;
        byte[] octets = this.f10829encoding.getOctets();
        return octets != null && octets.length > 0 && ((b = octets[0]) == 2 || b == 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f10829encoding;
    }
}
