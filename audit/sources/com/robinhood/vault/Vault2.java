package com.robinhood.vault;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: Vault.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, m3636d2 = {"encrypt", "", "Lcom/robinhood/vault/Vault;", "plaintext", "decrypt", "ciphertext", "lib-vault_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.vault.VaultKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Vault2 {
    public static final String encrypt(Vault vault, String plaintext) {
        Intrinsics.checkNotNullParameter(vault, "<this>");
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        return vault.encrypt(ByteString.INSTANCE.encodeUtf8(plaintext)).base64();
    }

    public static final String decrypt(Vault vault, String ciphertext) throws VaultExceptions3, VaultExceptions6 {
        Intrinsics.checkNotNullParameter(vault, "<this>");
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(ciphertext);
        if (byteStringDecodeBase64 == null) {
            throw new VaultExceptions3("Ciphertext not base-64 encoded", null, 2, null);
        }
        return vault.decrypt(byteStringDecodeBase64).utf8();
    }
}
