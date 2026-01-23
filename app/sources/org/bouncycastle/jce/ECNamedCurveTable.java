package org.bouncycastle.jce;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.p518x9.X9ECParameters;
import org.bouncycastle.crypto.p519ec.CustomNamedCurves;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

/* loaded from: classes25.dex */
public class ECNamedCurveTable {
    public static Enumeration getNames() {
        return org.bouncycastle.asn1.p518x9.ECNamedCurveTable.getNames();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        r0 = org.bouncycastle.asn1.p518x9.ECNamedCurveTable.getByName(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ECNamedCurveParameterSpec getParameterSpec(String str) {
        X9ECParameters byName = CustomNamedCurves.getByName(str);
        if (byName == null) {
            try {
                byName = CustomNamedCurves.getByOID(new ASN1ObjectIdentifier(str));
            } catch (IllegalArgumentException unused) {
            }
            if (byName == null && byName == null) {
                try {
                    byName = org.bouncycastle.asn1.p518x9.ECNamedCurveTable.getByOID(new ASN1ObjectIdentifier(str));
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        if (byName == null) {
            return null;
        }
        X9ECParameters x9ECParameters = byName;
        return new ECNamedCurveParameterSpec(str, x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }
}
