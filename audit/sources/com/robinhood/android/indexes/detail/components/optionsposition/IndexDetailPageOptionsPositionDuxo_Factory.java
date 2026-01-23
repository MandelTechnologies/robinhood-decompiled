package com.robinhood.android.indexes.detail.components.optionsposition;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.librobinhood.data.store.CollateralStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageOptionsPositionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class IndexDetailPageOptionsPositionDuxo_Factory implements Factory<IndexDetailPageOptionsPositionDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore;
    private final Provider<CollateralStore> collateralStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<IndexDetailPageOptionsPositionStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final IndexDetailPageOptionsPositionDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<AggregateOptionQuoteStore> provider3, Provider<CollateralStore> provider4, Provider<ExperimentsStore> provider5, Provider<IndexStore> provider6, Provider<IndexAccountSwitcherStore> provider7, Provider<SavedStateHandle> provider8, Provider<DuxoBundle> provider9, Provider<IndexDetailPageOptionsPositionStateProvider> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final IndexDetailPageOptionsPositionDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionQuoteStore aggregateOptionQuoteStore, CollateralStore collateralStore, ExperimentsStore experimentsStore, IndexStore indexStore, IndexAccountSwitcherStore indexAccountSwitcherStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageOptionsPositionStateProvider indexDetailPageOptionsPositionStateProvider) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, collateralStore, experimentsStore, indexStore, indexAccountSwitcherStore, savedStateHandle, duxoBundle, indexDetailPageOptionsPositionStateProvider);
    }

    public IndexDetailPageOptionsPositionDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore, Provider<CollateralStore> collateralStore, Provider<ExperimentsStore> experimentsStore, Provider<IndexStore> indexStore, Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageOptionsPositionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
        Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.aggregateOptionQuoteStore = aggregateOptionQuoteStore;
        this.collateralStore = collateralStore;
        this.experimentsStore = experimentsStore;
        this.indexStore = indexStore;
        this.indexAccountSwitcherStore = indexAccountSwitcherStore;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public IndexDetailPageOptionsPositionDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        AggregateOptionQuoteStore aggregateOptionQuoteStore = this.aggregateOptionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionQuoteStore, "get(...)");
        CollateralStore collateralStore = this.collateralStore.get();
        Intrinsics.checkNotNullExpressionValue(collateralStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        IndexAccountSwitcherStore indexAccountSwitcherStore = this.indexAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(indexAccountSwitcherStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        IndexDetailPageOptionsPositionStateProvider indexDetailPageOptionsPositionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(indexDetailPageOptionsPositionStateProvider, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, collateralStore, experimentsStore, indexStore, indexAccountSwitcherStore, savedStateHandle, duxoBundle, indexDetailPageOptionsPositionStateProvider);
    }

    /* compiled from: IndexDetailPageOptionsPositionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionStateProvider;", "newInstance", "Lcom/robinhood/android/indexes/detail/components/optionsposition/IndexDetailPageOptionsPositionDuxo;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndexDetailPageOptionsPositionDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore, Provider<CollateralStore> collateralStore, Provider<ExperimentsStore> experimentsStore, Provider<IndexStore> indexStore, Provider<IndexAccountSwitcherStore> indexAccountSwitcherStore, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<IndexDetailPageOptionsPositionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
            Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageOptionsPositionDuxo_Factory(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, collateralStore, experimentsStore, indexStore, indexAccountSwitcherStore, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final IndexDetailPageOptionsPositionDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionQuoteStore aggregateOptionQuoteStore, CollateralStore collateralStore, ExperimentsStore experimentsStore, IndexStore indexStore, IndexAccountSwitcherStore indexAccountSwitcherStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageOptionsPositionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
            Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new IndexDetailPageOptionsPositionDuxo(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, collateralStore, experimentsStore, indexStore, indexAccountSwitcherStore, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}
