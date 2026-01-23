package com.robinhood.android.indexes.detail.components.tradebar;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountSwitcherStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageTradeBarDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexDetailPageTradeBarDuxo_Factory implements Factory<IndexDetailPageTradeBarDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AccountSwitcherStore> accountSwitcherStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentStore;
    private final Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<IndexDetailPageTradeBarStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndexDetailPageTradeBarDuxo_Factory create(Provider<AccountAccessStore> provider, Provider<AccountProvider> provider2, Provider<AccountSwitcherStore> provider3, Provider<ExperimentsStore> provider4, Provider<IndexStore> provider5, Provider<IndexAccountSwitcherStore> provider6, Provider<OptionChainStore> provider7, Provider<OptionUpgradePromotionStore> provider8, Provider<SavedStateHandle> provider9, Provider<DuxoBundle> provider10, Provider<IndexDetailPageTradeBarStateProvider> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final IndexDetailPageTradeBarDuxo newInstance(AccountAccessStore accountAccessStore, AccountProvider accountProvider, AccountSwitcherStore accountSwitcherStore, ExperimentsStore experimentsStore, IndexStore indexStore, IndexAccountSwitcherStore indexAccountSwitcherStore, OptionChainStore optionChainStore, OptionUpgradePromotionStore optionUpgradePromotionStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageTradeBarStateProvider indexDetailPageTradeBarStateProvider) {
        return INSTANCE.newInstance(accountAccessStore, accountProvider, accountSwitcherStore, experimentsStore, indexStore, indexAccountSwitcherStore, optionChainStore, optionUpgradePromotionStore, savedStateHandle, duxoBundle, indexDetailPageTradeBarStateProvider);
    }

    public IndexDetailPageTradeBarDuxo_Factory(Provider<AccountAccessStore> accountAccessStore, Provider<AccountProvider> accountProvider, Provider<AccountSwitcherStore> accountSwitcherStore, Provider<ExperimentsStore> experimentStore, Provider<IndexStore> indexStore, Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<OptionChainStore> optionChainStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageTradeBarStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountAccessStore = accountAccessStore;
        this.accountProvider = accountProvider;
        this.accountSwitcherStore = accountSwitcherStore;
        this.experimentStore = experimentStore;
        this.indexStore = indexStore;
        this.indexAccountSwitcherStore = indexAccountSwitcherStore;
        this.optionChainStore = optionChainStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public IndexDetailPageTradeBarDuxo get() {
        Companion companion = INSTANCE;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountSwitcherStore accountSwitcherStore = this.accountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(accountSwitcherStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        IndexAccountSwitcherStore indexAccountSwitcherStore = this.indexAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(indexAccountSwitcherStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionUpgradePromotionStore optionUpgradePromotionStore = this.optionUpgradePromotionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUpgradePromotionStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        IndexDetailPageTradeBarStateProvider indexDetailPageTradeBarStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indexDetailPageTradeBarStateProvider, "get(...)");
        return companion.newInstance(accountAccessStore, accountProvider, accountSwitcherStore, experimentsStore, indexStore, indexAccountSwitcherStore, optionChainStore, optionUpgradePromotionStore, savedStateHandle, duxoBundle, indexDetailPageTradeBarStateProvider);
    }

    /* compiled from: IndexDetailPageTradeBarDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007J`\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo_Factory;", "accountAccessStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarStateProvider;", "newInstance", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexDetailPageTradeBarDuxo_Factory create(Provider<AccountAccessStore> accountAccessStore, Provider<AccountProvider> accountProvider, Provider<AccountSwitcherStore> accountSwitcherStore, Provider<ExperimentsStore> experimentStore, Provider<IndexStore> indexStore, Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<OptionChainStore> optionChainStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageTradeBarStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageTradeBarDuxo_Factory(accountAccessStore, accountProvider, accountSwitcherStore, experimentStore, indexStore, indexAccountSwitcherStore, optionChainStore, optionUpgradePromotionStore, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final IndexDetailPageTradeBarDuxo newInstance(AccountAccessStore accountAccessStore, AccountProvider accountProvider, AccountSwitcherStore accountSwitcherStore, ExperimentsStore experimentStore, IndexStore indexStore, IndexAccountSwitcherStore indexAccountSwitcherStore, OptionChainStore optionChainStore, OptionUpgradePromotionStore optionUpgradePromotionStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageTradeBarStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageTradeBarDuxo(accountAccessStore, accountProvider, accountSwitcherStore, experimentStore, indexStore, indexAccountSwitcherStore, optionChainStore, optionUpgradePromotionStore, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}
