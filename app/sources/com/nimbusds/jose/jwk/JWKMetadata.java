package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import io.jsonwebtoken.JwsHeader;
import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes27.dex */
final class JWKMetadata {
    static KeyType parseKeyType(Map<String, Object> map) throws ParseException {
        try {
            return KeyType.parse(JSONObjectUtils.getString(map, "kty"));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    static KeyUse parseKeyUse(Map<String, Object> map) throws ParseException {
        return KeyUse.parse(JSONObjectUtils.getString(map, "use"));
    }

    static Set<KeyOperation> parseKeyOperations(Map<String, Object> map) throws ParseException {
        return KeyOperation.parse(JSONObjectUtils.getStringList(map, "key_ops"));
    }

    static Algorithm parseAlgorithm(Map<String, Object> map) throws ParseException {
        return Algorithm.parse(JSONObjectUtils.getString(map, JwsHeader.ALGORITHM));
    }

    static String parseKeyID(Map<String, Object> map) throws ParseException {
        return JSONObjectUtils.getString(map, JwsHeader.KEY_ID);
    }

    static URI parseX509CertURL(Map<String, Object> map) throws ParseException {
        return JSONObjectUtils.getURI(map, JwsHeader.X509_URL);
    }

    static Base64URL parseX509CertThumbprint(Map<String, Object> map) throws ParseException {
        return JSONObjectUtils.getBase64URL(map, JwsHeader.X509_CERT_SHA1_THUMBPRINT);
    }

    static Base64URL parseX509CertSHA256Thumbprint(Map<String, Object> map) throws ParseException {
        return JSONObjectUtils.getBase64URL(map, JwsHeader.X509_CERT_SHA256_THUMBPRINT);
    }

    static List<Base64> parseX509CertChain(Map<String, Object> map) throws ParseException {
        List<Base64> base64List = X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(map, JwsHeader.X509_CERT_CHAIN));
        if (base64List == null || !base64List.isEmpty()) {
            return base64List;
        }
        return null;
    }
}
