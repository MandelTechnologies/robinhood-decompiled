package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.DirectEncrypter;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.crypto.impl.AESCBC;
import com.nimbusds.jose.crypto.impl.AESGCM;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
import com.nimbusds.jose.crypto.impl.DeflateHelper;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionEncrypter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;", "Lcom/nimbusds/jose/crypto/DirectEncrypter;", "key", "", "counter", "", "([BB)V", "encrypt", "Lcom/nimbusds/jose/JWECryptoParts;", "header", "Lcom/nimbusds/jose/JWEHeader;", "clearText", "Crypto", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class TransactionEncrypter extends DirectEncrypter {
    private final byte counter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEncrypter(byte[] key, byte b) throws KeyLengthException {
        super(new SecretKeySpec(key, BiometricChangeManager.ALGORITHM));
        Intrinsics.checkNotNullParameter(key, "key");
        this.counter = b;
    }

    @Override // com.nimbusds.jose.crypto.DirectEncrypter, com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader header, byte[] clearText) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, JOSEException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] gcmIvStoA;
        AuthenticatedCipherText authenticatedCipherTextEncrypt;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(clearText, "clearText");
        JWEAlgorithm algorithm = header.getAlgorithm();
        if (!Intrinsics.areEqual(algorithm, JWEAlgorithm.DIR)) {
            throw new JOSEException("Invalid algorithm " + algorithm);
        }
        EncryptionMethod encryptionMethod = header.getEncryptionMethod();
        if (encryptionMethod.cekBitLength() != ByteUtils.bitLength(getKey().getEncoded())) {
            throw new KeyLengthException(encryptionMethod.cekBitLength(), encryptionMethod);
        }
        if (encryptionMethod.cekBitLength() != ByteUtils.bitLength(getKey().getEncoded())) {
            throw new KeyLengthException("The Content Encryption Key length for " + encryptionMethod + " must be " + encryptionMethod.cekBitLength() + " bits");
        }
        byte[] bArrApplyCompression = DeflateHelper.applyCompression(header, clearText);
        byte[] bArrCompute = AAD.compute(header);
        if (Intrinsics.areEqual(header.getEncryptionMethod(), EncryptionMethod.A128CBC_HS256)) {
            gcmIvStoA = Crypto.INSTANCE.getGcmIvStoA(128, this.counter);
            authenticatedCipherTextEncrypt = AESCBC.encryptAuthenticated(getKey(), gcmIvStoA, bArrApplyCompression, bArrCompute, getJCAContext().getContentEncryptionProvider(), getJCAContext().getMACProvider());
            Intrinsics.checkNotNullExpressionValue(authenticatedCipherTextEncrypt, "encryptAuthenticated(...)");
        } else if (Intrinsics.areEqual(header.getEncryptionMethod(), EncryptionMethod.A128GCM)) {
            gcmIvStoA = Crypto.INSTANCE.getGcmIvStoA(96, this.counter);
            authenticatedCipherTextEncrypt = AESGCM.encrypt(getKey(), new Container(gcmIvStoA), bArrApplyCompression, bArrCompute, null);
            Intrinsics.checkNotNullExpressionValue(authenticatedCipherTextEncrypt, "encrypt(...)");
        } else {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(header.getEncryptionMethod(), DirectCryptoProvider.SUPPORTED_ENCRYPTION_METHODS));
        }
        return new JWECryptoParts(header, null, Base64URL.encode(gcmIvStoA), Base64URL.encode(authenticatedCipherTextEncrypt.getCipherText()), Base64URL.encode(authenticatedCipherTextEncrypt.getAuthenticationTag()));
    }

    /* compiled from: TransactionEncrypter.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter$Crypto;", "", "<init>", "()V", "", "length", "", "pad", "counter", "", "getGcmId", "(IBB)[B", "sdkCounterStoA", "getGcmIvStoA", "(IB)[B", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Crypto {
        public static final Crypto INSTANCE = new Crypto();

        private Crypto() {
        }

        public final byte[] getGcmIvStoA(int length, byte sdkCounterStoA) {
            return getGcmId(length, (byte) 0, sdkCounterStoA);
        }

        private final byte[] getGcmId(int length, byte pad, byte counter) {
            int i = length / 8;
            byte[] bArr = new byte[i];
            Arrays.fill(bArr, pad);
            bArr[i - 1] = counter;
            return bArr;
        }
    }
}
