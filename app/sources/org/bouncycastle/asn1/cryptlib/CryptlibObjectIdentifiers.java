package org.bouncycastle.asn1.cryptlib;

import com.singular.sdk.internal.Constants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes25.dex */
public class CryptlibObjectIdentifiers {
    public static final ASN1ObjectIdentifier cryptlib;
    public static final ASN1ObjectIdentifier curvey25519;
    public static final ASN1ObjectIdentifier ecc;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.4.1.3029");
        cryptlib = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch(Constants.SdidMigrationStatusCodes.ALREADY_SDID).branch(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION);
        ecc = aSN1ObjectIdentifierBranch;
        curvey25519 = aSN1ObjectIdentifierBranch.branch(Constants.SdidMigrationStatusCodes.ALREADY_SDID);
    }
}
