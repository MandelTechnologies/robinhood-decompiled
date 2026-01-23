package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import java.util.Collection;

/* loaded from: classes27.dex */
public class AlgorithmSupportMessage {
    private static String itemize(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array2 = collection.toArray();
        for (int i = 0; i < array2.length; i++) {
            if (i != 0) {
                if (i < array2.length - 1) {
                    sb.append(", ");
                } else if (i == array2.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array2[i].toString());
        }
        return sb.toString();
    }

    public static String unsupportedJWSAlgorithm(JWSAlgorithm jWSAlgorithm, Collection<JWSAlgorithm> collection) {
        return "Unsupported JWS algorithm " + jWSAlgorithm + ", must be " + itemize(collection);
    }

    public static String unsupportedJWEAlgorithm(JWEAlgorithm jWEAlgorithm, Collection<JWEAlgorithm> collection) {
        return "Unsupported JWE algorithm " + jWEAlgorithm + ", must be " + itemize(collection);
    }

    public static String unsupportedEncryptionMethod(EncryptionMethod encryptionMethod, Collection<EncryptionMethod> collection) {
        return "Unsupported JWE encryption method " + encryptionMethod + ", must be " + itemize(collection);
    }
}
