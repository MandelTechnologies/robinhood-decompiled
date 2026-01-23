package com.robinhood.shared.crypto.trading;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoOrderSubmissionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderSubmissionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderSubmissionManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "billingCryptoOrderStore", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoOrderSubmissionManager_Factory implements Factory<CryptoOrderSubmissionManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BillingCryptoOrderStore> billingCryptoOrderStore;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<CryptoOrderStore> cryptoOrderStore;

    @JvmStatic
    public static final CryptoOrderSubmissionManager_Factory create(Provider<CoroutineScope> provider, Provider<AccountProvider> provider2, Provider<CryptoOrderStore> provider3, Provider<BillingCryptoOrderStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoOrderSubmissionManager newInstance(CoroutineScope coroutineScope, AccountProvider accountProvider, CryptoOrderStore cryptoOrderStore, BillingCryptoOrderStore billingCryptoOrderStore) {
        return INSTANCE.newInstance(coroutineScope, accountProvider, cryptoOrderStore, billingCryptoOrderStore);
    }

    public CryptoOrderSubmissionManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<AccountProvider> accountProvider, Provider<CryptoOrderStore> cryptoOrderStore, Provider<BillingCryptoOrderStore> billingCryptoOrderStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(billingCryptoOrderStore, "billingCryptoOrderStore");
        this.coroutineScope = coroutineScope;
        this.accountProvider = accountProvider;
        this.cryptoOrderStore = cryptoOrderStore;
        this.billingCryptoOrderStore = billingCryptoOrderStore;
    }

    @Override // javax.inject.Provider
    public CryptoOrderSubmissionManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        CryptoOrderStore cryptoOrderStore = this.cryptoOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderStore, "get(...)");
        BillingCryptoOrderStore billingCryptoOrderStore = this.billingCryptoOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(billingCryptoOrderStore, "get(...)");
        return companion.newInstance(coroutineScope, accountProvider, cryptoOrderStore, billingCryptoOrderStore);
    }

    /* compiled from: CryptoOrderSubmissionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/trading/CryptoOrderSubmissionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/trading/CryptoOrderSubmissionManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoOrderStore", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "billingCryptoOrderStore", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderStore;", "newInstance", "Lcom/robinhood/shared/crypto/trading/CryptoOrderSubmissionManager;", "lib-trading_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderSubmissionManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<AccountProvider> accountProvider, Provider<CryptoOrderStore> cryptoOrderStore, Provider<BillingCryptoOrderStore> billingCryptoOrderStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
            Intrinsics.checkNotNullParameter(billingCryptoOrderStore, "billingCryptoOrderStore");
            return new CryptoOrderSubmissionManager_Factory(coroutineScope, accountProvider, cryptoOrderStore, billingCryptoOrderStore);
        }

        @JvmStatic
        public final CryptoOrderSubmissionManager newInstance(CoroutineScope coroutineScope, AccountProvider accountProvider, CryptoOrderStore cryptoOrderStore, BillingCryptoOrderStore billingCryptoOrderStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
            Intrinsics.checkNotNullParameter(billingCryptoOrderStore, "billingCryptoOrderStore");
            return new CryptoOrderSubmissionManager(coroutineScope, accountProvider, cryptoOrderStore, billingCryptoOrderStore);
        }
    }
}
