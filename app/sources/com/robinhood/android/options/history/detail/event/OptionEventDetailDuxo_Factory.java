package com.robinhood.android.options.history.detail.event;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionEventStore;
import com.robinhood.librobinhood.data.store.OptionExerciseStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionEventDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionEventDetailDuxo_Factory implements Factory<OptionEventDetailDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionEventStore> optionEventStore;
    private final Provider<OptionExerciseStore> optionExerciseStore;
    private final Provider<ProfitAndLossDetailStore> profitAndLossDetailStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionEventDetailStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionEventDetailDuxo_Factory create(Provider<AccountProvider> provider, Provider<IndexStore> provider2, Provider<InstrumentStore> provider3, Provider<OptionEventStore> provider4, Provider<OptionExerciseStore> provider5, Provider<ExperimentsStore> provider6, Provider<ProfitAndLossDetailStore> provider7, Provider<MarketHoursStore> provider8, Provider<OptionChainStore> provider9, Provider<DuxoBundle> provider10, Provider<OptionEventDetailStateProvider> provider11, Provider<SavedStateHandle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final OptionEventDetailDuxo newInstance(AccountProvider accountProvider, IndexStore indexStore, InstrumentStore instrumentStore, OptionEventStore optionEventStore, OptionExerciseStore optionExerciseStore, ExperimentsStore experimentsStore, ProfitAndLossDetailStore profitAndLossDetailStore, MarketHoursStore marketHoursStore, OptionChainStore optionChainStore, DuxoBundle duxoBundle, OptionEventDetailStateProvider optionEventDetailStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, indexStore, instrumentStore, optionEventStore, optionExerciseStore, experimentsStore, profitAndLossDetailStore, marketHoursStore, optionChainStore, duxoBundle, optionEventDetailStateProvider, savedStateHandle);
    }

    public OptionEventDetailDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<IndexStore> indexStore, Provider<InstrumentStore> instrumentStore, Provider<OptionEventStore> optionEventStore, Provider<OptionExerciseStore> optionExerciseStore, Provider<ExperimentsStore> experimentsStore, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<MarketHoursStore> marketHoursStore, Provider<OptionChainStore> optionChainStore, Provider<DuxoBundle> duxoBundle, Provider<OptionEventDetailStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
        Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.optionEventStore = optionEventStore;
        this.optionExerciseStore = optionExerciseStore;
        this.experimentsStore = experimentsStore;
        this.profitAndLossDetailStore = profitAndLossDetailStore;
        this.marketHoursStore = marketHoursStore;
        this.optionChainStore = optionChainStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionEventDetailDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        OptionEventStore optionEventStore = this.optionEventStore.get();
        Intrinsics.checkNotNullExpressionValue(optionEventStore, "get(...)");
        OptionExerciseStore optionExerciseStore = this.optionExerciseStore.get();
        Intrinsics.checkNotNullExpressionValue(optionExerciseStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ProfitAndLossDetailStore profitAndLossDetailStore = this.profitAndLossDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossDetailStore, "get(...)");
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OptionEventDetailStateProvider optionEventDetailStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionEventDetailStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, indexStore, instrumentStore, optionEventStore, optionExerciseStore, experimentsStore, profitAndLossDetailStore, marketHoursStore, optionChainStore, duxoBundle, optionEventDetailStateProvider, savedStateHandle);
    }

    /* compiled from: OptionEventDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/options/history/detail/event/OptionEventDetailDuxo;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionEventDetailDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<IndexStore> indexStore, Provider<InstrumentStore> instrumentStore, Provider<OptionEventStore> optionEventStore, Provider<OptionExerciseStore> optionExerciseStore, Provider<ExperimentsStore> experimentsStore, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<MarketHoursStore> marketHoursStore, Provider<OptionChainStore> optionChainStore, Provider<DuxoBundle> duxoBundle, Provider<OptionEventDetailStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
            Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionEventDetailDuxo_Factory(accountProvider, indexStore, instrumentStore, optionEventStore, optionExerciseStore, experimentsStore, profitAndLossDetailStore, marketHoursStore, optionChainStore, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final OptionEventDetailDuxo newInstance(AccountProvider accountProvider, IndexStore indexStore, InstrumentStore instrumentStore, OptionEventStore optionEventStore, OptionExerciseStore optionExerciseStore, ExperimentsStore experimentsStore, ProfitAndLossDetailStore profitAndLossDetailStore, MarketHoursStore marketHoursStore, OptionChainStore optionChainStore, DuxoBundle duxoBundle, OptionEventDetailStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
            Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionEventDetailDuxo(accountProvider, indexStore, instrumentStore, optionEventStore, optionExerciseStore, experimentsStore, profitAndLossDetailStore, marketHoursStore, optionChainStore, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
