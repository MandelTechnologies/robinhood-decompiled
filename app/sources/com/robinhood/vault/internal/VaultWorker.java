package com.robinhood.vault.internal;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.vault.VaultExceptions3;
import com.robinhood.vault.VaultExceptions6;
import kotlin.Metadata;
import okio.ByteString;

/* compiled from: VaultWorker.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/vault/internal/VaultWorker;", "", "version", "", "getVersion", "()I", "encrypt", "Lcom/robinhood/vault/internal/VaultCipherText;", "bytes", "Lokio/ByteString;", "decrypt", "ciphertext", AnalyticsStrings.BUTTON_LIST_DELETE, "", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface VaultWorker {
    ByteString decrypt(VaultCipherText ciphertext) throws VaultExceptions3, VaultExceptions6;

    void delete();

    VaultCipherText encrypt(ByteString bytes);

    int getVersion();
}
