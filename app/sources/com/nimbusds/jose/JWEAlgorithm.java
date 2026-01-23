package com.nimbusds.jose;

/* loaded from: classes27.dex */
public final class JWEAlgorithm extends Algorithm {
    public static final JWEAlgorithm A128GCMKW;
    public static final JWEAlgorithm A128KW;
    public static final JWEAlgorithm A192GCMKW;
    public static final JWEAlgorithm A192KW;
    public static final JWEAlgorithm A256GCMKW;
    public static final JWEAlgorithm A256KW;
    public static final JWEAlgorithm DIR;
    public static final JWEAlgorithm ECDH_1PU;
    public static final JWEAlgorithm ECDH_1PU_A128KW;
    public static final JWEAlgorithm ECDH_1PU_A192KW;
    public static final JWEAlgorithm ECDH_1PU_A256KW;
    public static final JWEAlgorithm ECDH_ES;
    public static final JWEAlgorithm ECDH_ES_A128KW;
    public static final JWEAlgorithm ECDH_ES_A192KW;
    public static final JWEAlgorithm ECDH_ES_A256KW;
    public static final JWEAlgorithm PBES2_HS256_A128KW;
    public static final JWEAlgorithm PBES2_HS384_A192KW;
    public static final JWEAlgorithm PBES2_HS512_A256KW;

    @Deprecated
    public static final JWEAlgorithm RSA1_5 = new JWEAlgorithm("RSA1_5", Requirement.REQUIRED);

    @Deprecated
    public static final JWEAlgorithm RSA_OAEP;
    public static final JWEAlgorithm RSA_OAEP_256;
    public static final JWEAlgorithm RSA_OAEP_384;
    public static final JWEAlgorithm RSA_OAEP_512;

    static {
        Requirement requirement = Requirement.OPTIONAL;
        RSA_OAEP = new JWEAlgorithm("RSA-OAEP", requirement);
        RSA_OAEP_256 = new JWEAlgorithm("RSA-OAEP-256", requirement);
        RSA_OAEP_384 = new JWEAlgorithm("RSA-OAEP-384", requirement);
        RSA_OAEP_512 = new JWEAlgorithm("RSA-OAEP-512", requirement);
        Requirement requirement2 = Requirement.RECOMMENDED;
        A128KW = new JWEAlgorithm("A128KW", requirement2);
        A192KW = new JWEAlgorithm("A192KW", requirement);
        A256KW = new JWEAlgorithm("A256KW", requirement2);
        DIR = new JWEAlgorithm("dir", requirement2);
        ECDH_ES = new JWEAlgorithm("ECDH-ES", requirement2);
        ECDH_ES_A128KW = new JWEAlgorithm("ECDH-ES+A128KW", requirement2);
        ECDH_ES_A192KW = new JWEAlgorithm("ECDH-ES+A192KW", requirement);
        ECDH_ES_A256KW = new JWEAlgorithm("ECDH-ES+A256KW", requirement2);
        ECDH_1PU = new JWEAlgorithm("ECDH-1PU", requirement);
        ECDH_1PU_A128KW = new JWEAlgorithm("ECDH-1PU+A128KW", requirement);
        ECDH_1PU_A192KW = new JWEAlgorithm("ECDH-1PU+A192KW", requirement);
        ECDH_1PU_A256KW = new JWEAlgorithm("ECDH-1PU+A256KW", requirement);
        A128GCMKW = new JWEAlgorithm("A128GCMKW", requirement);
        A192GCMKW = new JWEAlgorithm("A192GCMKW", requirement);
        A256GCMKW = new JWEAlgorithm("A256GCMKW", requirement);
        PBES2_HS256_A128KW = new JWEAlgorithm("PBES2-HS256+A128KW", requirement);
        PBES2_HS384_A192KW = new JWEAlgorithm("PBES2-HS384+A192KW", requirement);
        PBES2_HS512_A256KW = new JWEAlgorithm("PBES2-HS512+A256KW", requirement);
    }

    public JWEAlgorithm(String str, Requirement requirement) {
        super(str, requirement);
    }

    public JWEAlgorithm(String str) {
        super(str, null);
    }

    public static JWEAlgorithm parse(String str) {
        JWEAlgorithm jWEAlgorithm = RSA1_5;
        if (str.equals(jWEAlgorithm.getName())) {
            return jWEAlgorithm;
        }
        JWEAlgorithm jWEAlgorithm2 = RSA_OAEP;
        if (str.equals(jWEAlgorithm2.getName())) {
            return jWEAlgorithm2;
        }
        JWEAlgorithm jWEAlgorithm3 = RSA_OAEP_256;
        if (str.equals(jWEAlgorithm3.getName())) {
            return jWEAlgorithm3;
        }
        JWEAlgorithm jWEAlgorithm4 = RSA_OAEP_384;
        if (str.equals(jWEAlgorithm4.getName())) {
            return jWEAlgorithm4;
        }
        JWEAlgorithm jWEAlgorithm5 = RSA_OAEP_512;
        if (str.equals(jWEAlgorithm5.getName())) {
            return jWEAlgorithm5;
        }
        JWEAlgorithm jWEAlgorithm6 = A128KW;
        if (str.equals(jWEAlgorithm6.getName())) {
            return jWEAlgorithm6;
        }
        JWEAlgorithm jWEAlgorithm7 = A192KW;
        if (str.equals(jWEAlgorithm7.getName())) {
            return jWEAlgorithm7;
        }
        JWEAlgorithm jWEAlgorithm8 = A256KW;
        if (str.equals(jWEAlgorithm8.getName())) {
            return jWEAlgorithm8;
        }
        JWEAlgorithm jWEAlgorithm9 = DIR;
        if (str.equals(jWEAlgorithm9.getName())) {
            return jWEAlgorithm9;
        }
        JWEAlgorithm jWEAlgorithm10 = ECDH_ES;
        if (str.equals(jWEAlgorithm10.getName())) {
            return jWEAlgorithm10;
        }
        JWEAlgorithm jWEAlgorithm11 = ECDH_ES_A128KW;
        if (str.equals(jWEAlgorithm11.getName())) {
            return jWEAlgorithm11;
        }
        JWEAlgorithm jWEAlgorithm12 = ECDH_ES_A192KW;
        if (str.equals(jWEAlgorithm12.getName())) {
            return jWEAlgorithm12;
        }
        JWEAlgorithm jWEAlgorithm13 = ECDH_ES_A256KW;
        if (str.equals(jWEAlgorithm13.getName())) {
            return jWEAlgorithm13;
        }
        JWEAlgorithm jWEAlgorithm14 = ECDH_1PU;
        if (str.equals(jWEAlgorithm14.getName())) {
            return jWEAlgorithm14;
        }
        JWEAlgorithm jWEAlgorithm15 = ECDH_1PU_A128KW;
        if (str.equals(jWEAlgorithm15.getName())) {
            return jWEAlgorithm15;
        }
        JWEAlgorithm jWEAlgorithm16 = ECDH_1PU_A192KW;
        if (str.equals(jWEAlgorithm16.getName())) {
            return jWEAlgorithm16;
        }
        JWEAlgorithm jWEAlgorithm17 = ECDH_1PU_A256KW;
        if (str.equals(jWEAlgorithm17.getName())) {
            return jWEAlgorithm17;
        }
        JWEAlgorithm jWEAlgorithm18 = A128GCMKW;
        if (str.equals(jWEAlgorithm18.getName())) {
            return jWEAlgorithm18;
        }
        JWEAlgorithm jWEAlgorithm19 = A192GCMKW;
        if (str.equals(jWEAlgorithm19.getName())) {
            return jWEAlgorithm19;
        }
        JWEAlgorithm jWEAlgorithm20 = A256GCMKW;
        if (str.equals(jWEAlgorithm20.getName())) {
            return jWEAlgorithm20;
        }
        JWEAlgorithm jWEAlgorithm21 = PBES2_HS256_A128KW;
        if (str.equals(jWEAlgorithm21.getName())) {
            return jWEAlgorithm21;
        }
        JWEAlgorithm jWEAlgorithm22 = PBES2_HS384_A192KW;
        if (str.equals(jWEAlgorithm22.getName())) {
            return jWEAlgorithm22;
        }
        JWEAlgorithm jWEAlgorithm23 = PBES2_HS512_A256KW;
        return str.equals(jWEAlgorithm23.getName()) ? jWEAlgorithm23 : new JWEAlgorithm(str);
    }
}
