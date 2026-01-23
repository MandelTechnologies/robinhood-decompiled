package com.robinhood.shared.transfers.cryptocheckout.store;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoBillingAccountStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore;", "cryptoAccountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoBillingAccountStore_Factory implements Factory<CryptoBillingAccountStore> {
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<StoreBundle> storeBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoBillingAccountStore_Factory create(Provider<CryptoAccountProvider> provider, Provider<BffMoneyMovementService> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoBillingAccountStore newInstance(CryptoAccountProvider cryptoAccountProvider, BffMoneyMovementService bffMoneyMovementService, StoreBundle storeBundle) {
        return INSTANCE.newInstance(cryptoAccountProvider, bffMoneyMovementService, storeBundle);
    }

    public CryptoBillingAccountStore_Factory(Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoBillingAccountStore get() {
        Companion companion = INSTANCE;
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(cryptoAccountProvider, bffMoneyMovementService, storeBundle);
    }

    /* compiled from: CryptoBillingAccountStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore_Factory;", "cryptoAccountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore;", "lib-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoBillingAccountStore_Factory create(Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoBillingAccountStore_Factory(cryptoAccountProvider, bffMoneyMovementService, storeBundle);
        }

        @JvmStatic
        public final CryptoBillingAccountStore newInstance(CryptoAccountProvider cryptoAccountProvider, BffMoneyMovementService bffMoneyMovementService, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new CryptoBillingAccountStore(cryptoAccountProvider, bffMoneyMovementService, storeBundle);
        }
    }
}
