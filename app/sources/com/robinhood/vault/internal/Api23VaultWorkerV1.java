package com.robinhood.vault.internal;

import android.security.keystore.KeyGenParameterSpec;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.vault.VaultExceptions;
import com.robinhood.vault.VaultExceptions5;
import com.robinhood.vault.VaultExceptions6;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: Api23VaultWorkerV1.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/vault/internal/Api23VaultWorkerV1;", "Lcom/robinhood/vault/internal/VaultWorker;", "<init>", "()V", "keystore", "Ljava/security/KeyStore;", "key", "Ljavax/crypto/SecretKey;", "version", "", "getVersion", "()I", "getSecretKeyFromKeystore", "alias", "", "generateKey", "encrypt", "Lcom/robinhood/vault/internal/VaultCipherText;", "bytes", "Lokio/ByteString;", "decrypt", "ciphertext", AnalyticsStrings.BUTTON_LIST_DELETE, "", "Companion", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class Api23VaultWorkerV1 implements VaultWorker {
    private static final int AES_KEY_SIZE = 256;
    private static final String ALIAS = "robinhoodSecretKey";
    private static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    private static final int GCM_TAG_LENGTH = 128;
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";
    private static final int VERSION = 1;
    private final SecretKey key;
    private final KeyStore keystore;
    private final int version;

    public Api23VaultWorkerV1() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, VaultExceptions6, UnrecoverableEntryException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Intrinsics.checkNotNullExpressionValue(keyStore, "apply(...)");
        this.keystore = keyStore;
        SecretKey secretKeyFromKeystore = getSecretKeyFromKeystore(ALIAS);
        this.key = secretKeyFromKeystore == null ? generateKey(ALIAS) : secretKeyFromKeystore;
        this.version = 1;
    }

    @Override // com.robinhood.vault.internal.VaultWorker
    public int getVersion() {
        return this.version;
    }

    private final SecretKey getSecretKeyFromKeystore(String alias) throws NoSuchAlgorithmException, KeyStoreException, VaultExceptions6, UnrecoverableEntryException {
        KeyStoreException keyStoreException = null;
        if (!this.keystore.containsAlias(alias)) {
            return null;
        }
        try {
            KeyStore.Entry entry = this.keystore.getEntry(alias, null);
            Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type java.security.KeyStore.SecretKeyEntry");
            return ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        } catch (Exception e) {
            try {
                KeyStore.Entry entry2 = this.keystore.getEntry(alias, null);
                Intrinsics.checkNotNull(entry2, "null cannot be cast to non-null type java.security.KeyStore.SecretKeyEntry");
                return ((KeyStore.SecretKeyEntry) entry2).getSecretKey();
            } catch (Exception e2) {
                try {
                    this.keystore.deleteEntry(alias);
                } catch (KeyStoreException e3) {
                    keyStoreException = e3;
                }
                VaultExceptions6 vaultExceptions6 = new VaultExceptions6("Retrieval failed twice.", e2);
                ExceptionsKt.addSuppressed(vaultExceptions6, e);
                if (keyStoreException != null) {
                    vaultExceptions6.addSuppressed(keyStoreException);
                }
                throw vaultExceptions6;
            }
        }
    }

    private final SecretKey generateKey(String alias) throws NoSuchAlgorithmException, VaultExceptions5, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(BiometricChangeManager.ALGORITHM, "AndroidKeyStore");
        Intrinsics.checkNotNullExpressionValue(keyGenerator, "getInstance(...)");
        keyGenerator.init(new KeyGenParameterSpec.Builder(alias, 3).setBlockModes("GCM").setEncryptionPaddings(BiometricChangeManager.ENCRYPTION_PADDING).setKeySize(256).build());
        try {
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generateKey(...)");
            return secretKeyGenerateKey;
        } catch (Exception e) {
            throw new VaultExceptions5(null, e, 1, null);
        }
    }

    @Override // com.robinhood.vault.internal.VaultWorker
    public synchronized VaultCipherText encrypt(ByteString bytes) {
        byte[] bArrDoFinal;
        int version;
        ByteString.Companion companion;
        byte[] iv;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Cipher cipherCreateCipher = CreateCipher.createCipher(TRANSFORMATION, new Function1() { // from class: com.robinhood.vault.internal.Api23VaultWorkerV1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Api23VaultWorkerV1.encrypt$lambda$2(this.f$0, (Cipher) obj);
            }
        });
        bArrDoFinal = cipherCreateCipher.doFinal(bytes.toByteArray());
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        version = getVersion();
        companion = ByteString.INSTANCE;
        iv = cipherCreateCipher.getIV();
        Intrinsics.checkNotNullExpressionValue(iv, "getIV(...)");
        return new VaultCipherText(version, ByteString.Companion.of$default(companion, iv, 0, 0, 3, null), ByteString.Companion.of$default(companion, bArrDoFinal, 0, 0, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encrypt$lambda$2(Api23VaultWorkerV1 api23VaultWorkerV1, Cipher createCipher) throws InvalidKeyException {
        Intrinsics.checkNotNullParameter(createCipher, "$this$createCipher");
        createCipher.init(1, api23VaultWorkerV1.key);
        createCipher.updateAAD(new byte[]{1});
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.vault.internal.VaultWorker
    public synchronized ByteString decrypt(final VaultCipherText ciphertext) {
        ByteString.Companion companion;
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        if (ciphertext.getVersion() != getVersion()) {
            throw new VaultExceptions("VaultCipherText version not supported: " + ciphertext.getVersion() + " (expected " + getVersion() + ")", null, 2, null);
        }
        Cipher cipherCreateCipher = CreateCipher.createCipher(TRANSFORMATION, new Function1() { // from class: com.robinhood.vault.internal.Api23VaultWorkerV1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Api23VaultWorkerV1.decrypt$lambda$3(this.f$0, ciphertext, (Cipher) obj);
            }
        });
        companion = ByteString.INSTANCE;
        bArrDoFinal = cipherCreateCipher.doFinal(ciphertext.getCiphertext().toByteArray());
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return ByteString.Companion.of$default(companion, bArrDoFinal, 0, 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit decrypt$lambda$3(Api23VaultWorkerV1 api23VaultWorkerV1, VaultCipherText vaultCipherText, Cipher createCipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(createCipher, "$this$createCipher");
        createCipher.init(2, api23VaultWorkerV1.key, new GCMParameterSpec(128, vaultCipherText.getIv().toByteArray()));
        createCipher.updateAAD(new byte[]{1});
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.vault.internal.VaultWorker
    public void delete() throws KeyStoreException {
        this.keystore.deleteEntry(ALIAS);
    }
}
