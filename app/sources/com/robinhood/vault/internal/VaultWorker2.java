package com.robinhood.vault.internal;

import com.robinhood.vault.VaultExceptions3;
import com.robinhood.vault.VaultExceptions6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: VaultWorker.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, m3636d2 = {"encryptUtf8", "Lcom/robinhood/vault/internal/VaultCipherText;", "Lcom/robinhood/vault/internal/VaultWorker;", "plaintext", "", "decryptUtf8", "ciphertext", "lib-vault_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.vault.internal.VaultWorkerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class VaultWorker2 {
    public static final VaultCipherText encryptUtf8(VaultWorker vaultWorker, String plaintext) {
        Intrinsics.checkNotNullParameter(vaultWorker, "<this>");
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        return vaultWorker.encrypt(ByteString.INSTANCE.encodeUtf8(plaintext));
    }

    public static final String decryptUtf8(VaultWorker vaultWorker, VaultCipherText ciphertext) throws VaultExceptions3, VaultExceptions6 {
        Intrinsics.checkNotNullParameter(vaultWorker, "<this>");
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        return vaultWorker.decrypt(ciphertext).utf8();
    }
}
