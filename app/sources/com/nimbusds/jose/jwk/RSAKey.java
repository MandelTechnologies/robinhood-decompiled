package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.singular.sdk.internal.Constants;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes27.dex */
public final class RSAKey extends JWK {

    /* renamed from: d */
    private final Base64URL f1193d;

    /* renamed from: dp */
    private final Base64URL f1194dp;

    /* renamed from: dq */
    private final Base64URL f1195dq;

    /* renamed from: e */
    private final Base64URL f1196e;

    /* renamed from: n */
    private final Base64URL f1197n;
    private final List<OtherPrimesInfo> oth;

    /* renamed from: p */
    private final Base64URL f1198p;
    private final PrivateKey privateKey;

    /* renamed from: q */
    private final Base64URL f1199q;

    /* renamed from: qi */
    private final Base64URL f1200qi;

    public static class OtherPrimesInfo implements Serializable {

        /* renamed from: d */
        private final Base64URL f1201d;

        /* renamed from: r */
        private final Base64URL f1202r;

        /* renamed from: t */
        private final Base64URL f1203t;

        public OtherPrimesInfo(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            if (base64URL == null) {
                throw new IllegalArgumentException("The prime factor must not be null");
            }
            this.f1202r = base64URL;
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            this.f1201d = base64URL2;
            if (base64URL3 == null) {
                throw new IllegalArgumentException("The factor CRT coefficient must not be null");
            }
            this.f1203t = base64URL3;
        }
    }

    public RSAKey(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, Base64URL base64URL6, Base64URL base64URL7, Base64URL base64URL8, List<OtherPrimesInfo> list, PrivateKey privateKey, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL9, Base64URL base64URL10, List<Base64> list2, KeyStore keyStore) {
        super(KeyType.RSA, keyUse, set, algorithm, str, uri, base64URL9, base64URL10, list2, keyStore);
        if (base64URL == null) {
            throw new IllegalArgumentException("The modulus value must not be null");
        }
        this.f1197n = base64URL;
        if (base64URL2 == null) {
            throw new IllegalArgumentException("The public exponent value must not be null");
        }
        this.f1196e = base64URL2;
        if (getParsedX509CertChain() != null && !matches(getParsedX509CertChain().get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
        this.f1193d = base64URL3;
        if (base64URL4 != null && base64URL5 != null && base64URL6 != null && base64URL7 != null && base64URL8 != null) {
            this.f1198p = base64URL4;
            this.f1199q = base64URL5;
            this.f1194dp = base64URL6;
            this.f1195dq = base64URL7;
            this.f1200qi = base64URL8;
            if (list != null) {
                this.oth = Collections.unmodifiableList(list);
            } else {
                this.oth = Collections.EMPTY_LIST;
            }
        } else if (base64URL4 == null && base64URL5 == null && base64URL6 == null && base64URL7 == null && base64URL8 == null && list == null) {
            this.f1198p = null;
            this.f1199q = null;
            this.f1194dp = null;
            this.f1195dq = null;
            this.f1200qi = null;
            this.oth = Collections.EMPTY_LIST;
        } else {
            if (base64URL4 != null || base64URL5 != null || base64URL6 != null || base64URL7 != null || base64URL8 != null) {
                if (base64URL4 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                }
                if (base64URL5 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                }
                if (base64URL6 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                }
                if (base64URL7 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                }
                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
            }
            this.f1198p = null;
            this.f1199q = null;
            this.f1194dp = null;
            this.f1195dq = null;
            this.f1200qi = null;
            this.oth = Collections.EMPTY_LIST;
        }
        this.privateKey = privateKey;
    }

    public boolean matches(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (this.f1196e.decodeToBigInteger().equals(rSAPublicKey.getPublicExponent())) {
                return this.f1197n.decodeToBigInteger().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.f1193d == null && this.f1198p == null && this.privateKey == null) ? false : true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put(Constants.RequestParamsKeys.APP_NAME_KEY, this.f1197n.toString());
        jSONObject.put(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, this.f1196e.toString());
        Base64URL base64URL = this.f1193d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        Base64URL base64URL2 = this.f1198p;
        if (base64URL2 != null) {
            jSONObject.put(Constants.RequestParamsKeys.PLATFORM_KEY, base64URL2.toString());
        }
        Base64URL base64URL3 = this.f1199q;
        if (base64URL3 != null) {
            jSONObject.put("q", base64URL3.toString());
        }
        Base64URL base64URL4 = this.f1194dp;
        if (base64URL4 != null) {
            jSONObject.put("dp", base64URL4.toString());
        }
        Base64URL base64URL5 = this.f1195dq;
        if (base64URL5 != null) {
            jSONObject.put("dq", base64URL5.toString());
        }
        Base64URL base64URL6 = this.f1200qi;
        if (base64URL6 != null) {
            jSONObject.put("qi", base64URL6.toString());
        }
        List<OtherPrimesInfo> list = this.oth;
        if (list != null && !list.isEmpty()) {
            List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
            for (OtherPrimesInfo otherPrimesInfo : this.oth) {
                Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
                mapNewJSONObject.put(Constants.REVENUE_AMOUNT_KEY, otherPrimesInfo.f1202r.toString());
                mapNewJSONObject.put("d", otherPrimesInfo.f1201d.toString());
                mapNewJSONObject.put("t", otherPrimesInfo.f1203t.toString());
                listNewJSONArray.add(mapNewJSONObject);
            }
            jSONObject.put("oth", listNewJSONArray);
        }
        return jSONObject;
    }

    public static RSAKey parse(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> jSONArray;
        if (!KeyType.RSA.equals(JWKMetadata.parseKeyType(map))) {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
        Base64URL base64URL = JSONObjectUtils.getBase64URL(map, Constants.RequestParamsKeys.APP_NAME_KEY);
        Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, Constants.RequestBody.EXTRA_ATTRIBUTES_KEY);
        Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "d");
        Base64URL base64URL4 = JSONObjectUtils.getBase64URL(map, Constants.RequestParamsKeys.PLATFORM_KEY);
        Base64URL base64URL5 = JSONObjectUtils.getBase64URL(map, "q");
        Base64URL base64URL6 = JSONObjectUtils.getBase64URL(map, "dp");
        Base64URL base64URL7 = JSONObjectUtils.getBase64URL(map, "dq");
        Base64URL base64URL8 = JSONObjectUtils.getBase64URL(map, "qi");
        if (!map.containsKey("oth") || (jSONArray = JSONObjectUtils.getJSONArray(map, "oth")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(jSONArray.size());
            for (Object obj : jSONArray) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    try {
                        arrayList.add(new OtherPrimesInfo(JSONObjectUtils.getBase64URL(map2, Constants.REVENUE_AMOUNT_KEY), JSONObjectUtils.getBase64URL(map2, "dq"), JSONObjectUtils.getBase64URL(map2, "t")));
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                }
            }
        }
        try {
            return new RSAKey(base64URL, base64URL2, base64URL3, base64URL4, base64URL5, base64URL6, base64URL7, base64URL8, arrayList, null, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null);
        } catch (IllegalArgumentException e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RSAKey) || !super.equals(obj)) {
            return false;
        }
        RSAKey rSAKey = (RSAKey) obj;
        return Objects.equals(this.f1197n, rSAKey.f1197n) && Objects.equals(this.f1196e, rSAKey.f1196e) && Objects.equals(this.f1193d, rSAKey.f1193d) && Objects.equals(this.f1198p, rSAKey.f1198p) && Objects.equals(this.f1199q, rSAKey.f1199q) && Objects.equals(this.f1194dp, rSAKey.f1194dp) && Objects.equals(this.f1195dq, rSAKey.f1195dq) && Objects.equals(this.f1200qi, rSAKey.f1200qi) && Objects.equals(this.oth, rSAKey.oth) && Objects.equals(this.privateKey, rSAKey.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f1197n, this.f1196e, this.f1193d, this.f1198p, this.f1199q, this.f1194dp, this.f1195dq, this.f1200qi, this.oth, this.privateKey);
    }
}
