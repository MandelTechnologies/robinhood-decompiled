package org.bouncycastle.asn1.iana;

import com.singular.sdk.internal.Constants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes25.dex */
public interface IANAObjectIdentifiers {
    public static final ASN1ObjectIdentifier SNMPv2;
    public static final ASN1ObjectIdentifier _private;
    public static final ASN1ObjectIdentifier directory;
    public static final ASN1ObjectIdentifier experimental;
    public static final ASN1ObjectIdentifier hmacMD5;
    public static final ASN1ObjectIdentifier hmacRIPEMD160;
    public static final ASN1ObjectIdentifier hmacSHA1;
    public static final ASN1ObjectIdentifier hmacTIGER;
    public static final ASN1ObjectIdentifier internet;
    public static final ASN1ObjectIdentifier ipsec;
    public static final ASN1ObjectIdentifier isakmpOakley;
    public static final ASN1ObjectIdentifier mail;
    public static final ASN1ObjectIdentifier mgmt;
    public static final ASN1ObjectIdentifier pkix;
    public static final ASN1ObjectIdentifier security;
    public static final ASN1ObjectIdentifier security_mechanisms;
    public static final ASN1ObjectIdentifier security_nametypes;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1");
        internet = aSN1ObjectIdentifier;
        directory = aSN1ObjectIdentifier.branch(Constants.SdidMigrationStatusCodes.ALREADY_SDID);
        mgmt = aSN1ObjectIdentifier.branch(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED);
        experimental = aSN1ObjectIdentifier.branch(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
        _private = aSN1ObjectIdentifier.branch(Constants.SdidMigrationStatusCodes.MISSING_PARAMS);
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION);
        security = aSN1ObjectIdentifierBranch;
        SNMPv2 = aSN1ObjectIdentifier.branch("6");
        mail = aSN1ObjectIdentifier.branch("7");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch2 = aSN1ObjectIdentifierBranch.branch(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION);
        security_mechanisms = aSN1ObjectIdentifierBranch2;
        security_nametypes = aSN1ObjectIdentifierBranch.branch("6");
        pkix = aSN1ObjectIdentifierBranch2.branch("6");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch3 = aSN1ObjectIdentifierBranch2.branch("8");
        ipsec = aSN1ObjectIdentifierBranch3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch4 = aSN1ObjectIdentifierBranch3.branch(Constants.SdidMigrationStatusCodes.ALREADY_SDID);
        isakmpOakley = aSN1ObjectIdentifierBranch4;
        hmacMD5 = aSN1ObjectIdentifierBranch4.branch(Constants.SdidMigrationStatusCodes.ALREADY_SDID);
        hmacSHA1 = aSN1ObjectIdentifierBranch4.branch(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED);
        hmacTIGER = aSN1ObjectIdentifierBranch4.branch(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
        hmacRIPEMD160 = aSN1ObjectIdentifierBranch4.branch(Constants.SdidMigrationStatusCodes.MISSING_PARAMS);
    }
}
