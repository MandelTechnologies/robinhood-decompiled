package com.robinhood.store.achrelationship;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.api.retrofit.Iav;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueuedTransferStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/QueuedTransferStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "hasQueuedDepositPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "iavStore", "Lcom/robinhood/store/achrelationship/IavStore;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "iav", "Lcom/robinhood/api/retrofit/Iav;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class QueuedTransferStore_Factory implements Factory<QueuedTransferStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<Cashier> cashier;
    private final Provider<BooleanPreference> hasQueuedDepositPref;
    private final Provider<Iav> iav;
    private final Provider<IavStore> iavStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<UserStore> userStore;

    @JvmStatic
    public static final QueuedTransferStore_Factory create(Provider<StoreBundle> provider, Provider<BooleanPreference> provider2, Provider<AccountProvider> provider3, Provider<RhyAccountStore> provider4, Provider<IavStore> provider5, Provider<Cashier> provider6, Provider<Iav> provider7, Provider<UserStore> provider8, Provider<BaseSortingHatStore> provider9, Provider<TransfersBonfireApi> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final QueuedTransferStore newInstance(StoreBundle storeBundle, BooleanPreference booleanPreference, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, IavStore iavStore, Cashier cashier, Iav iav, UserStore userStore, BaseSortingHatStore baseSortingHatStore, TransfersBonfireApi transfersBonfireApi) {
        return INSTANCE.newInstance(storeBundle, booleanPreference, accountProvider, rhyAccountStore, iavStore, cashier, iav, userStore, baseSortingHatStore, transfersBonfireApi);
    }

    public QueuedTransferStore_Factory(Provider<StoreBundle> storeBundle, Provider<BooleanPreference> hasQueuedDepositPref, Provider<AccountProvider> accountProvider, Provider<RhyAccountStore> rhyAccountStore, Provider<IavStore> iavStore, Provider<Cashier> cashier, Provider<Iav> iav, Provider<UserStore> userStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<TransfersBonfireApi> transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(iavStore, "iavStore");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(iav, "iav");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        this.storeBundle = storeBundle;
        this.hasQueuedDepositPref = hasQueuedDepositPref;
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.iavStore = iavStore;
        this.cashier = cashier;
        this.iav = iav;
        this.userStore = userStore;
        this.sortingHatStore = sortingHatStore;
        this.transfersBonfireApi = transfersBonfireApi;
    }

    @Override // javax.inject.Provider
    public QueuedTransferStore get() {
        Companion companion = INSTANCE;
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        BooleanPreference booleanPreference = this.hasQueuedDepositPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        IavStore iavStore = this.iavStore.get();
        Intrinsics.checkNotNullExpressionValue(iavStore, "get(...)");
        Cashier cashier = this.cashier.get();
        Intrinsics.checkNotNullExpressionValue(cashier, "get(...)");
        Iav iav = this.iav.get();
        Intrinsics.checkNotNullExpressionValue(iav, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        return companion.newInstance(storeBundle, booleanPreference, accountProvider, rhyAccountStore, iavStore, cashier, iav, userStore, baseSortingHatStore, transfersBonfireApi);
    }

    /* compiled from: QueuedTransferStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/achrelationship/QueuedTransferStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/achrelationship/QueuedTransferStore_Factory;", "storeBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/store/StoreBundle;", "hasQueuedDepositPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "iavStore", "Lcom/robinhood/store/achrelationship/IavStore;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "iav", "Lcom/robinhood/api/retrofit/Iav;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "newInstance", "Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "lib-store-ach-relationship_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final QueuedTransferStore_Factory create(Provider<StoreBundle> storeBundle, Provider<BooleanPreference> hasQueuedDepositPref, Provider<AccountProvider> accountProvider, Provider<RhyAccountStore> rhyAccountStore, Provider<IavStore> iavStore, Provider<Cashier> cashier, Provider<Iav> iav, Provider<UserStore> userStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<TransfersBonfireApi> transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(iavStore, "iavStore");
            Intrinsics.checkNotNullParameter(cashier, "cashier");
            Intrinsics.checkNotNullParameter(iav, "iav");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            return new QueuedTransferStore_Factory(storeBundle, hasQueuedDepositPref, accountProvider, rhyAccountStore, iavStore, cashier, iav, userStore, sortingHatStore, transfersBonfireApi);
        }

        @JvmStatic
        public final QueuedTransferStore newInstance(StoreBundle storeBundle, BooleanPreference hasQueuedDepositPref, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, IavStore iavStore, Cashier cashier, Iav iav, UserStore userStore, BaseSortingHatStore sortingHatStore, TransfersBonfireApi transfersBonfireApi) {
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(hasQueuedDepositPref, "hasQueuedDepositPref");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(iavStore, "iavStore");
            Intrinsics.checkNotNullParameter(cashier, "cashier");
            Intrinsics.checkNotNullParameter(iav, "iav");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            return new QueuedTransferStore(storeBundle, hasQueuedDepositPref, accountProvider, rhyAccountStore, iavStore, cashier, iav, userStore, sortingHatStore, transfersBonfireApi);
        }
    }
}
