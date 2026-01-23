package com.robinhood.android.lib.account.crypto;

import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountInfo;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoAccountProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "", "setSelectedAccountNumber", "", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "accountNumber", "", "streamAccountNumber", "Lkotlinx/coroutines/flow/Flow;", "streamCryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "streamCryptoAccountId", "Ljava/util/UUID;", "streamAccountInfo", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "NotImplemented", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface CryptoAccountProvider {

    /* renamed from: NotImplemented, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: setSelectedAccountNumber */
    void mo15792setSelectedAccountNumber(CryptoAccountSwitcherLocation location, String accountNumber);

    Flow<CryptoAccountInfo> streamAccountInfo(CryptoAccountSwitcherLocation location);

    Flow<String> streamAccountNumber(CryptoAccountSwitcherLocation location);

    Flow<CryptoAccount> streamCryptoAccount(CryptoAccountSwitcherLocation location);

    Flow<UUID> streamCryptoAccountId(CryptoAccountSwitcherLocation location);

    /* compiled from: CryptoAccountProvider.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider$NotImplemented;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "<init>", "()V", "setSelectedAccountNumber", "", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "accountNumber", "", "streamAccountNumber", "Lkotlinx/coroutines/flow/Flow;", "streamCryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "streamCryptoAccountId", "Ljava/util/UUID;", "streamAccountInfo", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.account.crypto.CryptoAccountProvider$NotImplemented, reason: from kotlin metadata */
    public static final class Companion implements CryptoAccountProvider {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
        /* renamed from: setSelectedAccountNumber, reason: merged with bridge method [inline-methods] */
        public Void mo15792setSelectedAccountNumber(CryptoAccountSwitcherLocation location, String accountNumber) {
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            throw new Standard2("Not implemented");
        }

        @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
        public Flow<String> streamAccountNumber(CryptoAccountSwitcherLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            throw new Standard2("Not implemented");
        }

        @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
        public Flow<CryptoAccount> streamCryptoAccount(CryptoAccountSwitcherLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            throw new Standard2("Not implemented");
        }

        @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
        public Flow<UUID> streamCryptoAccountId(CryptoAccountSwitcherLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            throw new Standard2("Not implemented");
        }

        @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
        public Flow<CryptoAccountInfo> streamAccountInfo(CryptoAccountSwitcherLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            throw new Standard2("Not implemented");
        }
    }
}
