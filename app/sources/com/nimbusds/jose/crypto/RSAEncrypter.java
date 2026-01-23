package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.RSA1_5;
import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
import com.nimbusds.jose.crypto.impl.RSA_OAEP;
import com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2;
import com.nimbusds.jose.util.Base64URL;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes27.dex */
public class RSAEncrypter extends RSACryptoProvider implements JWEEncrypter {
    private final SecretKey contentEncryptionKey;
    private final RSAPublicKey publicKey;

    public RSAEncrypter(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    public RSAEncrypter(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey == null) {
            throw new IllegalArgumentException("The public RSA key must not be null");
        }
        this.publicKey = rSAPublicKey;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(BiometricChangeManager.ALGORITHM, "ChaCha20")));
        if (secretKey != null) {
            if (secretKey.getAlgorithm() == null || !setUnmodifiableSet.contains(secretKey.getAlgorithm())) {
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            }
            this.contentEncryptionKey = secretKey;
            return;
        }
        this.contentEncryptionKey = null;
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        Base64URL base64URLEncode;
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        SecretKey secretKeyGenerateCEK = this.contentEncryptionKey;
        if (secretKeyGenerateCEK == null) {
            secretKeyGenerateCEK = ContentCryptoProvider.generateCEK(encryptionMethod, getJCAContext().getSecureRandom());
        }
        if (algorithm.equals(JWEAlgorithm.RSA1_5)) {
            base64URLEncode = Base64URL.encode(RSA1_5.encryptCEK(this.publicKey, secretKeyGenerateCEK, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP)) {
            base64URLEncode = Base64URL.encode(RSA_OAEP.encryptCEK(this.publicKey, secretKeyGenerateCEK, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
            base64URLEncode = Base64URL.encode(RSA_OAEP_SHA2.encryptCEK(this.publicKey, secretKeyGenerateCEK, 256, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP_384)) {
            base64URLEncode = Base64URL.encode(RSA_OAEP_SHA2.encryptCEK(this.publicKey, secretKeyGenerateCEK, 384, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP_512)) {
            base64URLEncode = Base64URL.encode(RSA_OAEP_SHA2.encryptCEK(this.publicKey, secretKeyGenerateCEK, 512, getJCAContext().getKeyEncryptionProvider()));
        } else {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, RSACryptoProvider.SUPPORTED_ALGORITHMS));
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, secretKeyGenerateCEK, base64URLEncode, getJCAContext());
    }
}
