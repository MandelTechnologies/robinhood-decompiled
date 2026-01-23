package com.truelayer.payments.core.utils;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: RSAEncryptionHelper.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/core/utils/RSAEncryptionHelper;", "", "()V", "CIPHER_TYPE_FOR_RSA", "", "RSA_ALGORITHM", "cipher", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "keyFactory", "Ljava/security/KeyFactory;", "keys", "", "getKeys", "()Ljava/util/Map;", "decryptText", "encryptedText", "privateKey", "Ljava/security/PrivateKey;", "encryptText", "", "plainText", "publicKey", "Ljava/security/PublicKey;", "getPrivateKeyFromString", "privateKeyString", "getPublicKeyFromString", "publicKeyString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RSAEncryptionHelper {
    public static final RSAEncryptionHelper INSTANCE = new RSAEncryptionHelper();
    private static final Map<String, String> keys = MapsKt.mapOf(Tuples4.m3642to("27:25:3a:99:fb:9b:eb:16:3f:b4:f5:e3:29:4b:fa:6a", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1R8Vf7kuf4BovUB6ItA+d5PjgDksRsqC42dMLde0YgrFvIFEe7lSnBFC7s9q2GgHgNRA3Dv2f+aYn7hiQg9nUXHbeYgUaORLNVaXzIPrCBWkPkvnwKch3Ga7MhSaAlZrG0QA8Y+iWjdip6T//KGiaGXgPyMc8BgAGGyPO1qx6YM0xGHuPjm2yTpz4Ao6EqNVeVpQ18Eyu+UIQG4PFTV13YAAve91FoDd4uJusvXHb+RBRMRIsXgqz35Cnv8M+Dt83CjYKgEP8lwvHSOhXds8U81x4wN+VkjC3vW6xlivBPmhrEbojIr5C2+v4RZA/QPl8d2ZwD78VR65ZfgGG1Y+EQIDAQAB"), Tuples4.m3642to("09:ae:62:7d:59:58:31:49:d4:d3:f6:52:59:2b:16:95", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7ZBxi+Xh2Bqp2HvO5ksYj988TlQWWwZ8W1lG3zFWo8Yi2V41VjRr3jdXDPxkknitC6GAk0EIF99AhJWiPxArOBGqo4m38LRxL3MYgTeUfhHEWY+q4jeRhREHCzQu77thaD1LQcAEuB88TPbvPeoaAZuczsoe9frA4l+HC1fR4w/LT2319m/6iStI/tZ2spsygzdggx9LPnlhWs4Zv84If5l4kPNHLdco7LQv+6O0I6NVuuTzNLchRn7+U3uNtKmEw+iszUO3ACM1he1Q1QPfVuT/e8PUJVeK5FveJmaVTekios9cc/TzjDwloAL6eet4H8T4JMXyIUjP9Bg7mOYQ8wIDAQAB"), Tuples4.m3642to("05:54:48:e3:4d:67:3c:87:aa:9e:c8:85:a7:02:54:d1", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyyxwS7Ye5AM0r/TQQWrAro23Wucb7skHxs7rORhiYTdmM1mbZJzC+841k2JS3gCIFphJSfeH3+uEwjf9+TrfNgbddXvuENVje1Rst+lDR0yE1Tz7QB6bGX3hMOqXv/g3CpPqtaRFDQGDWChRQ508cuBM81mhvXRwrpsLc9rhXNqCMiR+ECfxEl50Fj/kQ9VPxAWnweEsbZtEYEU58K4W44NkLI3Y/l868cXUpAC5KhbT5peNEujPxyhxQSkAACizJTiSWgRxyfK77MXynQgahWs13k+uHICLGqDzBkzY6JrqaVEqpIgRoW9bOMOS8gnbfDpNQK4Uglico4Z3BjMWmQIDAQAB"), Tuples4.m3642to("a9:20:3e:53:71:a3:1c:b9:ab:a4:35:ea:7d:79:43:01", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzWX/SkXPZV5TFXbDM0y3agNMKVa7Dt0d1kGR8uffEsLM6++IL6b0+KG7g/6+kPvD8F/fLeyJOQPIlAY/4grSZKcRcsrgTkFstCgLZHs9jpsPt2pReQkzXXhhy0dfX3cVBzs0nBQ9UXbI8QmxAA0tB9Zb9MTSH5Jsehe/vCjswr0oB820w9X9fccibrSzaYV37F7QAn29l0LGk/F+b2/OTFEROjw6H7DuONn6yz2vqZuJ/g020nFh94v8XWXjSEK/+Hqh/20gm7Yd8zdNxXufDcBMHBkJixu9Lf839B6DWBUVOVqLACDEmViLbsTXiuKhCXd/jZADwRFB4f1Bfy9WaQIDAQAB"), Tuples4.m3642to("3f:9b:86:ad:71:a4:98:db:ec:09:d6:8a:22:75:99:7c", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqOanOm910SvbNVLBxp+WwLA27rTQNSwiXB/NvUzgmJKSos73Y0XbNW/JV9Kf+FzyUT1+9cVa37E/N+SJnlhWBhEgos33c9eIgyMDwT1Qzwliob0RdXfg+sVXZAG4UADPT9WKGLdH8plQElK9tLAfBsDFQOq/r6WJ9cXvV5Pz2te+xW/+CY+Qyxv+bDa4k+aQgXdb/ooZCk8BC8qgapJevS+q+HTKbExiNVYPdA+RjDkYWRTkHpfm3gdFOvBYxjP8d2NCDkiQ/pV8krQdlUjyeTBng5SlGxDdYo9m7JfIpYlgwtkMa+HcoQjYl+HNB3EE6wE3hgTPKAzJR/QbyzbX3wIDAQAB"), Tuples4.m3642to("96:43:70:2a:e3:7b:eb:fb:2b:e9:dc:26:83:8f:8e:00", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt8g2LbRIbT0JcN/IitRsqNE2QkbvJHadKaNC2s0OEB0Ds++ZWotLfxx5hh4pFclFt/N6iq3xsFbSmCzbd4RN3MpOm7f6pi7x+ktqgpvsW0jBtZJnJ6gbR5E32q3a/+QjWqr67JR3uAzJJEqGobl8MTavRJjAK6nGI77oduIH+QJkTccwBP9xa9ocjD7XkbKpneMlTY1pCOR2Efh6PjPj4EI0YVMZLC0ESwQvfwd9iSwQiK7ISYNgd4h4CCsZxqQcGFJhkNVHUIakq/KEfWV94hbCRHtZe1HwxT/hy5DCpSK3reZdgoURC8D40/ZJD4k3rwTsSajdVyET9tFFN1l2JQIDAQAB"), Tuples4.m3642to("58:ee:d7:00:57:bf:dc:53:2b:73:1d:06:4c:1d:57:fd", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArjoujb8LC8+G1jvU4DT/jIDuatF7QYicNqVrnhM4+oLZLhCmCRlRnVvXunV/HqglE2JFxqTEJq7IOr9ntCUIbTjOEg8XNx7Xp2caf9qx8AreWdFL1RAnvm0qq9WBa020pMB94chwxXyJ2SpacNo0tFdcJYhQtc5+MmuSL999w5+F4phgb5v0s0zpECd9KAN6YlNe8oErmg47e9ZFkz7bhhZuElnutW0eKHcUDj0M6a0cz/XzVvebcY/+eqjsjQLELUDouN4K0tbkuwrZJ4PHF6pN+OtVbTLcYouur26NDy93MlDvSnHi3NGXjIcfaeBKi9j0WZuAAGfhQQiQehp3MwIDAQAB"), Tuples4.m3642to("14:ce:13:51:a2:03:c0:1e:4d:e7:0c:3d:e8:7f:75:72", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA80aylblSAoR48U6X4ERQ8KVc3cQmLhwxVaUSGGz1Jj4ao3MHpkpHBpP3fLJr8otgx9hIyaAEEUbmDEO/xnJagVgwvJ69VTQ6ln74eeihGhoZLWnLtAS0zMzp8oFfCril6sHBTe7dsBWhflYg2Z8uUGR7xrHyX5aT1+ZACjyNcbwmAaOdiNs4uhgR9Mx9GHrtvSIp/YzxNNC7fvu4w/TCk4Do8pOUXYvcmYCJzfCpSA/QzlQVLewVmlf/41Hn5HPf8B9/s+vNTqdGbMGUmtRIWTVeb1hCuVArgSgVLVdtNpXcgkshiysIV8bvGrQV2OwmmoDQ/LJ/q43KYL3wo+UMWwIDAQAB"), Tuples4.m3642to("5d:36:4c:82:d8:c0:d0:0b:eb:02:c4:6f:3b:d6:ec:95", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx+HelJqVXr9jDTz5+hIACPJlcOdrkJD5ytYk2aDVeI6qICGKIXnt2ui1mzV5NiebJo01ForGXjEn7VBLAhnqp6BP2cQ8maZRoqZKlA8KoP7cxr8aVK2qGzHUSa5VoyGNVYbTDSRTwAFKrGcEbHCFIhNWTlBT9k+1ytzT4LqyFP8z+IXZVIkkAVhOpT0so/7Gf6GsKHk2ucYZCMrzgOjQbtAmvIU7GfyeUO4hR0rLCKajF7Om2/uV/0dfuhsrUB4nLTcL0vOpbmOUXcTz9UzR+NHfW10TBMqsNBEcmPJTOBaNEKKW0U4q/yQSvWtJErDLsaeRROVLE+GbhRYOwUIU/QIDAQAB"), Tuples4.m3642to("ae:46:61:72:9b:f4:d8:4d:69:c7:64:33:3c:bd:0e:d8", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA+8CwjGdBP1Vyd1enZjWTHz2dkoge4mVbX5uVfUbUd+SMZhtPPxLqD0v8RlNWGB41/Afks1JyDYAC4K7Luv0Vhf0fge/PHv7krDr/jpG9vF/xt2YzSfBSbS6GSO+PIbRKGcUkfWtRsXJmuOVhTBAWZimU0c1vg6nvppnRz1TBM3/LwQI8atmE7nn2H+GNY/NLTMp0cx+CKUp2H97t3Rtcj/A9Y83Lf/MG8b9SR3UixdaTJhD857Qi1QLEy4MiOj9dX+1iwf2jkonAh2WPq1wYY0c7JerqpcPmrF0AE+Fjl0od059zrRSgeYB5WLsci01XyAmWuAfjkV0k/y5OAmPp0wIDAQAB"), Tuples4.m3642to("2d:98:eb:eb:ee:c8:9b:3c:a8:b4:c7:23:3b:67:32:48", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtaMwXROvohx9BoPw/H97VmCP/G6UP6vjNNzHvqFmiZj1Z9ZRq+mU/mrQ4g8dutLshyKDkG5nXZXrjJpUGyxPaJX8pwdGf1/5zi4wgVKgE0Ko+Qpog9MXMXvXpaKU69/CdCTxcg0pxnI+K+1A2tgzL0sCO8s88z7a6/wcIhHOcXwMBWh/k9rRuM82pYrHLvPKFIPKeHjWfmjsVjx8fQn21rl9Lo+UJ0srAlEicp2+dSTAjTAAQSrtuoq/+MPi/A4hFN9veaKAJrBl1eeGiO1xi6boUxVgoPzRAUDze34ct5Ha+zeLZks6bnF79f+HjfSzQZwz7fknrNtHCub+lSKe4wIDAQAB"), Tuples4.m3642to("16:1f:88:ce:9f:a0:fa:c0:01:ab:21:37:3e:bf:60:7c", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAshwuPJ6IYLceIHz9jrXBw0P6FaDI83tY09ozo0ygqIzH+kaS8SiCH35T4JU7ts/HuH1Bo7zXGgQQFJbFl3GPOqgomSnM8Hg3RIHoin3qWjjHBC1vhKSIpP8PX71ZXFohMD0gujsiE/mLj0mY25yBea+jnyv3BsDeDSFSFJk1iI/629r05QB0owtiZlAreC6pAsYQEVra1BQImEZaSfjBDITkxVCQwVww6vFNgUQWKp27ZsrxbktGmULEzxq2ZaUh6s5lX0O2Pbi201eOPVTvgA4WI8DOxuNAv+vz+IUwyua/TLN+ZOJjQnuZXNbaU/MQ3Z7oSG5KJe4IHOIOsO7u5QIDAQAB"), Tuples4.m3642to("f1:e1:e5:5a:8c:31:b4:c3:f6:1b:ba:94:4c:9c:a4:e5", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqUOGrGVuxOCNr6tA1MroF1HqX2Ak+r20v1sPngs0nVRjpKFAJOJV0UCdMOZdwKj1pjxttjzOY1u2pSEh0mwkXtllTbQVebO3s0oLiAcchQBHtfWcYb6ecZ1XJcG6//pubgPlX5wROrWzOdEQ2Rrgq+9MRtRAHqKgwAJ6VURnAhb5LqVJKZYuLIJi//HWZ09yv/ryR4ZlD2jE3EoGNp1zTOfiPZPLpKYg/zRbHvfLFG3a6IlRVwu5VQRdz1qy7sxpZAbTz/TBnwzI7ByNNNsJiItLR//SrnajNrVaV5XlAH57fOxyRehE17ffwEJdwbxCBCBmfwZTQEUXMZcVZxFJ+QIDAQAB"));
    private static final String RSA_ALGORITHM = "RSA";
    private static final KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
    private static final String CIPHER_TYPE_FOR_RSA = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    private static final Cipher cipher = Cipher.getInstance(CIPHER_TYPE_FOR_RSA);

    private RSAEncryptionHelper() {
    }

    public final Map<String, String> getKeys() {
        return keys;
    }

    public final PublicKey getPublicKeyFromString(String publicKeyString) {
        Intrinsics.checkNotNullParameter(publicKeyString, "publicKeyString");
        try {
            byte[] bytes = publicKeyString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(bytes, 2)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final PrivateKey getPrivateKeyFromString(String privateKeyString) {
        Intrinsics.checkNotNullParameter(privateKeyString, "privateKeyString");
        try {
            byte[] bytes = privateKeyString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(bytes, 2)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final List<String> encryptText(String plainText, PublicKey publicKey) throws InvalidKeyException {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        try {
            Cipher cipher2 = cipher;
            cipher2.init(1, publicKey);
            byte[] bytes = plainText.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            List<Byte> list = ArraysKt.toList(bytes);
            List listChunked = CollectionsKt.chunked(list, cipher2.getBlockSize() > 0 ? cipher2.getBlockSize() : list.size());
            ArrayList arrayList = new ArrayList();
            Iterator it = listChunked.iterator();
            while (it.hasNext()) {
                String strEncodeToString = Base64.encodeToString(cipher.doFinal(CollectionsKt.toByteArray((List) it.next())), 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
                arrayList.add(strEncodeToString);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final List<String> encryptText(String plainText, String publicKey) {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        try {
            PublicKey publicKeyFromString = getPublicKeyFromString(publicKey);
            if (publicKeyFromString != null) {
                return INSTANCE.encryptText(plainText, publicKeyFromString);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String decryptText(String encryptedText, PrivateKey privateKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(encryptedText, "encryptedText");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        try {
            Cipher cipher2 = cipher;
            cipher2.init(2, privateKey);
            byte[] bArrDoFinal = cipher2.doFinal(Base64.decode(encryptedText, 2));
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new String(bArrDoFinal, Charsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
