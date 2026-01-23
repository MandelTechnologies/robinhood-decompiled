package com.robinhood.vault.dagger;

import com.robinhood.vault.Vault;
import kotlin.Metadata;

/* compiled from: LibVaultModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/vault/dagger/LibVaultModule;", "", "<init>", "()V", "provideVault", "Lcom/robinhood/vault/Vault;", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LibVaultModule {
    public static final LibVaultModule INSTANCE = new LibVaultModule();

    private LibVaultModule() {
    }

    public final Vault provideVault() {
        return Vault.INSTANCE.getInstance();
    }
}
