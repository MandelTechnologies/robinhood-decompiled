package com.robinhood.vault.internal;

import com.robinhood.vault.VaultExceptions4;
import kotlin.Metadata;

/* compiled from: VaultWorkerV1.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/vault/internal/VaultWorkerV1;", "", "<init>", "()V", "getInstance", "Lcom/robinhood/vault/internal/VaultWorker;", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class VaultWorkerV1 {
    public static final VaultWorkerV1 INSTANCE = new VaultWorkerV1();

    private VaultWorkerV1() {
    }

    public final VaultWorker getInstance() {
        try {
            return new Api23VaultWorkerV1();
        } catch (VaultExceptions4 unused) {
            return new LegacyVaultWorkerV1();
        }
    }
}
