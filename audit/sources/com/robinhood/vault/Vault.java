package com.robinhood.vault;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.vault.internal.RealVault;
import kotlin.Metadata;
import okio.ByteString;

/* compiled from: Vault.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/vault/Vault;", "", "encrypt", "Lokio/ByteString;", "bytes", "decrypt", AnalyticsStrings.BUTTON_LIST_DELETE, "", "Companion", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface Vault {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    ByteString decrypt(ByteString bytes) throws VaultExceptions3, VaultExceptions6;

    void delete();

    ByteString encrypt(ByteString bytes);

    /* compiled from: Vault.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/vault/Vault$Companion;", "", "<init>", "()V", "getInstance", "Lcom/robinhood/vault/Vault;", "lib-vault_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Vault getInstance() {
            return new RealVault(null, 1, 0 == true ? 1 : 0);
        }
    }
}
