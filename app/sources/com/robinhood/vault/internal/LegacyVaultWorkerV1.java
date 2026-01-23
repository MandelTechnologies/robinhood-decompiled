package com.robinhood.vault.internal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.vault.VaultExceptions;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* compiled from: LegacyVaultWorkerV1.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/vault/internal/LegacyVaultWorkerV1;", "Lcom/robinhood/vault/internal/VaultWorker;", "<init>", "()V", "value", "", "useEncryption", "getUseEncryption$lib_vault_externalDebug", "()Z", "readCipher", "Ljavax/crypto/Cipher;", "writeCipher", "encrypt", "Lcom/robinhood/vault/internal/VaultCipherText;", "bytes", "Lokio/ByteString;", "decrypt", "ciphertext", AnalyticsStrings.BUTTON_LIST_DELETE, "", "version", "", "getVersion", "()I", "Companion", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LegacyVaultWorkerV1 implements VaultWorker {
    private static final String SECRET_KEY_HASH_TRANSFORMATION = "SHA-256";
    private static final String SECURE_KEY = "hNnS24Qi3b3n8n2owu12EYxrp2ckMvrXL4TVwPzf";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final int VERSION = 1;
    private Cipher readCipher;
    private boolean useEncryption;
    private Cipher writeCipher;

    @Override // com.robinhood.vault.internal.VaultWorker
    public void delete() {
    }

    @Override // com.robinhood.vault.internal.VaultWorker
    public int getVersion() {
        return 1;
    }

    public LegacyVaultWorkerV1() throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            this.readCipher = Cipher.getInstance(TRANSFORMATION);
            this.writeCipher = Cipher.getInstance(TRANSFORMATION);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            SecretKeySpec secretKeySpec = new SecretKeySpec(messageDigest.digest(ByteString.INSTANCE.encodeUtf8(SECURE_KEY).toByteArray()), TRANSFORMATION);
            Cipher cipher = this.writeCipher;
            Cipher cipher2 = null;
            if (cipher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("writeCipher");
                cipher = null;
            }
            byte[] bArr = new byte[cipher.getBlockSize()];
            byte[] bytes = SECURE_KEY.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            Cipher cipher3 = this.writeCipher;
            if (cipher3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("writeCipher");
                cipher3 = null;
            }
            System.arraycopy(bytes, 0, bArr, 0, cipher3.getBlockSize());
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher4 = this.readCipher;
            if (cipher4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readCipher");
                cipher4 = null;
            }
            cipher4.init(2, secretKeySpec, ivParameterSpec);
            Cipher cipher5 = this.writeCipher;
            if (cipher5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("writeCipher");
            } else {
                cipher2 = cipher5;
            }
            cipher2.init(1, secretKeySpec, ivParameterSpec);
            this.useEncryption = true;
        } catch (UnsupportedEncodingException unused) {
            this.useEncryption = false;
        } catch (InvalidAlgorithmParameterException unused2) {
            this.useEncryption = false;
        } catch (InvalidKeyException unused3) {
            this.useEncryption = false;
        } catch (NoSuchAlgorithmException unused4) {
            this.useEncryption = false;
        } catch (NoSuchPaddingException unused5) {
            this.useEncryption = false;
        }
    }

    /* renamed from: getUseEncryption$lib_vault_externalDebug, reason: from getter */
    public final boolean getUseEncryption() {
        return this.useEncryption;
    }

    @Override // com.robinhood.vault.internal.VaultWorker
    public VaultCipherText encrypt(ByteString bytes) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.useEncryption) {
            ByteString.Companion companion = ByteString.INSTANCE;
            Cipher cipher = this.writeCipher;
            if (cipher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("writeCipher");
                cipher = null;
            }
            byte[] bArrDoFinal = cipher.doFinal(bytes.toByteArray());
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            bytes = ByteString.Companion.of$default(companion, bArrDoFinal, 0, 0, 3, null);
        }
        return new VaultCipherText(1, ByteString.EMPTY, bytes);
    }

    @Override // com.robinhood.vault.internal.VaultWorker
    public ByteString decrypt(VaultCipherText ciphertext) throws BadPaddingException, VaultExceptions, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        Cipher cipher = null;
        if (ciphertext.getVersion() != getVersion()) {
            throw new VaultExceptions("VaultCipherText version not supported: " + ciphertext.getVersion() + " (expected " + getVersion() + ")", null, 2, null);
        }
        ByteString ciphertext2 = ciphertext.getCiphertext();
        if (!this.useEncryption) {
            return ciphertext2;
        }
        ByteString.Companion companion = ByteString.INSTANCE;
        Cipher cipher2 = this.readCipher;
        if (cipher2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readCipher");
        } else {
            cipher = cipher2;
        }
        byte[] bArrDoFinal = cipher.doFinal(ciphertext2.toByteArray());
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return ByteString.Companion.of$default(companion, bArrDoFinal, 0, 0, 3, null);
    }
}
