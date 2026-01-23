package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import io.jsonwebtoken.JwsHeader;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes27.dex */
public abstract class JWK implements Serializable {
    private final Algorithm alg;
    private final KeyStore keyStore;
    private final String kid;
    private final KeyType kty;
    private final Set<KeyOperation> ops;
    private final List<X509Certificate> parsedX5c;
    private final KeyUse use;
    private final List<Base64> x5c;

    @Deprecated
    private final Base64URL x5t;
    private final Base64URL x5t256;
    private final URI x5u;

    public abstract boolean isPrivate();

    protected JWK(KeyType keyType, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        if (keyType == null) {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
        this.kty = keyType;
        if (!KeyUseAndOpsConsistency.areConsistent(keyUse, set)) {
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        this.use = keyUse;
        this.ops = set;
        this.alg = algorithm;
        this.kid = str;
        this.x5u = uri;
        this.x5t = base64URL;
        this.x5t256 = base64URL2;
        if (list != null && list.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.x5c = list;
        try {
            this.parsedX5c = X509CertChainUtils.parse(list);
            this.keyStore = keyStore;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e.getMessage(), e);
        }
    }

    public KeyUse getKeyUse() {
        return this.use;
    }

    public Set<KeyOperation> getKeyOperations() {
        return this.ops;
    }

    public Algorithm getAlgorithm() {
        return this.alg;
    }

    public String getKeyID() {
        return this.kid;
    }

    public URI getX509CertURL() {
        return this.x5u;
    }

    @Deprecated
    public Base64URL getX509CertThumbprint() {
        return this.x5t;
    }

    public Base64URL getX509CertSHA256Thumbprint() {
        return this.x5t256;
    }

    public List<Base64> getX509CertChain() {
        List<Base64> list = this.x5c;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<X509Certificate> getParsedX509CertChain() {
        List<X509Certificate> list = this.parsedX5c;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public KeyStore getKeyStore() {
        return this.keyStore;
    }

    public Map<String, Object> toJSONObject() {
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        mapNewJSONObject.put("kty", this.kty.getValue());
        KeyUse keyUse = this.use;
        if (keyUse != null) {
            mapNewJSONObject.put("use", keyUse.identifier());
        }
        if (this.ops != null) {
            List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
            Iterator<KeyOperation> it = this.ops.iterator();
            while (it.hasNext()) {
                listNewJSONArray.add(it.next().identifier());
            }
            mapNewJSONObject.put("key_ops", listNewJSONArray);
        }
        Algorithm algorithm = this.alg;
        if (algorithm != null) {
            mapNewJSONObject.put(JwsHeader.ALGORITHM, algorithm.getName());
        }
        String str = this.kid;
        if (str != null) {
            mapNewJSONObject.put(JwsHeader.KEY_ID, str);
        }
        URI uri = this.x5u;
        if (uri != null) {
            mapNewJSONObject.put(JwsHeader.X509_URL, uri.toString());
        }
        Base64URL base64URL = this.x5t;
        if (base64URL != null) {
            mapNewJSONObject.put(JwsHeader.X509_CERT_SHA1_THUMBPRINT, base64URL.toString());
        }
        Base64URL base64URL2 = this.x5t256;
        if (base64URL2 != null) {
            mapNewJSONObject.put(JwsHeader.X509_CERT_SHA256_THUMBPRINT, base64URL2.toString());
        }
        if (this.x5c != null) {
            List<Object> listNewJSONArray2 = JSONArrayUtils.newJSONArray();
            Iterator<Base64> it2 = this.x5c.iterator();
            while (it2.hasNext()) {
                listNewJSONArray2.add(it2.next().toString());
            }
            mapNewJSONObject.put(JwsHeader.X509_CERT_CHAIN, listNewJSONArray2);
        }
        return mapNewJSONObject;
    }

    public String toJSONString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }

    public String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }

    public static JWK parse(Map<String, Object> map) throws ParseException {
        String string2 = JSONObjectUtils.getString(map, "kty");
        if (string2 == null) {
            throw new ParseException("Missing key type \"kty\" parameter", 0);
        }
        KeyType keyType = KeyType.parse(string2);
        if (keyType == KeyType.f1189EC) {
            return ECKey.parse(map);
        }
        if (keyType == KeyType.RSA) {
            return RSAKey.parse(map);
        }
        if (keyType == KeyType.OCT) {
            return OctetSequenceKey.parse(map);
        }
        if (keyType == KeyType.OKP) {
            return OctetKeyPair.parse(map);
        }
        throw new ParseException("Unsupported key type \"kty\" parameter: " + keyType, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        JWK jwk = (JWK) obj;
        return Objects.equals(this.kty, jwk.kty) && Objects.equals(this.use, jwk.use) && Objects.equals(this.ops, jwk.ops) && Objects.equals(this.alg, jwk.alg) && Objects.equals(this.kid, jwk.kid) && Objects.equals(this.x5u, jwk.x5u) && Objects.equals(this.x5t, jwk.x5t) && Objects.equals(this.x5t256, jwk.x5t256) && Objects.equals(this.x5c, jwk.x5c) && Objects.equals(this.keyStore, jwk.keyStore);
    }

    public int hashCode() {
        return Objects.hash(this.kty, this.use, this.ops, this.alg, this.kid, this.x5u, this.x5t, this.x5t256, this.x5c, this.keyStore);
    }
}
