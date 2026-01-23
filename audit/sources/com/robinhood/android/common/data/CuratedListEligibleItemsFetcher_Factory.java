package com.robinhood.android.common.data;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.store.futures.FuturesPositionStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListEligibleItemsFetcher_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CuratedListEligibleItemsFetcher_Factory implements Factory<CuratedListEligibleItemsFetcher> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<CryptoHoldingStore> cryptoHoldingStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<FuturesPositionStore> futuresPositionStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<RxFactory> rxFactory;

    @JvmStatic
    public static final CuratedListEligibleItemsFetcher_Factory create(Provider<AccountProvider> provider, Provider<CryptoHoldingStore> provider2, Provider<FuturesPositionStore> provider3, Provider<PositionStore> provider4, Provider<OptionPositionStore> provider5, Provider<CuratedListItemsStore> provider6, Provider<OptionStrategyInfoStore> provider7, Provider<IndexStore> provider8, Provider<OptionChainStore> provider9, Provider<RxFactory> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final CuratedListEligibleItemsFetcher newInstance(AccountProvider accountProvider, CryptoHoldingStore cryptoHoldingStore, FuturesPositionStore futuresPositionStore, PositionStore positionStore, OptionPositionStore optionPositionStore, CuratedListItemsStore curatedListItemsStore, OptionStrategyInfoStore optionStrategyInfoStore, IndexStore indexStore, OptionChainStore optionChainStore, RxFactory rxFactory) {
        return INSTANCE.newInstance(accountProvider, cryptoHoldingStore, futuresPositionStore, positionStore, optionPositionStore, curatedListItemsStore, optionStrategyInfoStore, indexStore, optionChainStore, rxFactory);
    }

    public CuratedListEligibleItemsFetcher_Factory(Provider<AccountProvider> accountProvider, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<PositionStore> positionStore, Provider<OptionPositionStore> optionPositionStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<IndexStore> indexStore, Provider<OptionChainStore> optionChainStore, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.accountProvider = accountProvider;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.futuresPositionStore = futuresPositionStore;
        this.positionStore = positionStore;
        this.optionPositionStore = optionPositionStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.indexStore = indexStore;
        this.optionChainStore = optionChainStore;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public CuratedListEligibleItemsFetcher get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingStore, "get(...)");
        FuturesPositionStore futuresPositionStore = this.futuresPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresPositionStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(accountProvider, cryptoHoldingStore, futuresPositionStore, positionStore, optionPositionStore, curatedListItemsStore, optionStrategyInfoStore, indexStore, optionChainStore, rxFactory);
    }

    /* compiled from: CuratedListEligibleItemsFetcher_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CuratedListEligibleItemsFetcher_Factory create(Provider<AccountProvider> accountProvider, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<FuturesPositionStore> futuresPositionStore, Provider<PositionStore> positionStore, Provider<OptionPositionStore> optionPositionStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<IndexStore> indexStore, Provider<OptionChainStore> optionChainStore, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new CuratedListEligibleItemsFetcher_Factory(accountProvider, cryptoHoldingStore, futuresPositionStore, positionStore, optionPositionStore, curatedListItemsStore, optionStrategyInfoStore, indexStore, optionChainStore, rxFactory);
        }

        @JvmStatic
        public final CuratedListEligibleItemsFetcher newInstance(AccountProvider accountProvider, CryptoHoldingStore cryptoHoldingStore, FuturesPositionStore futuresPositionStore, PositionStore positionStore, OptionPositionStore optionPositionStore, CuratedListItemsStore curatedListItemsStore, OptionStrategyInfoStore optionStrategyInfoStore, IndexStore indexStore, OptionChainStore optionChainStore, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new CuratedListEligibleItemsFetcher(accountProvider, cryptoHoldingStore, futuresPositionStore, positionStore, optionPositionStore, curatedListItemsStore, optionStrategyInfoStore, indexStore, optionChainStore, rxFactory);
        }
    }
}
