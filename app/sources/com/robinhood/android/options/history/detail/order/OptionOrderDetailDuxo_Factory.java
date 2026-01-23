package com.robinhood.android.options.history.detail.order;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionOrderNomenclatureStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.base.BackupWithholdingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B»\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004¢\u0006\u0004\b0\u00101J\b\u00102\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionRemoveReplaceOrderConfirmationStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOrderDetailDuxo_Factory implements Factory<OptionOrderDetailDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<DocumentStore> documentStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionRemoveReplaceOrderConfirmationStore> optionRemoveReplaceOrderConfirmationStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<ProfitAndLossDetailStore> profitAndLossDetailStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionOrderDetailStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionOrderDetailDuxo_Factory create(Provider<AccountProvider> provider, Provider<BackupWithholdingStore> provider2, Provider<DocumentStore> provider3, Provider<TraderEventLogger> provider4, Provider<ExperimentsStore> provider5, Provider<IndexStore> provider6, Provider<InstrumentStore> provider7, Provider<OptionChainStore> provider8, Provider<OptionInstrumentStore> provider9, Provider<OptionMarketHoursStore> provider10, Provider<OptionOrderNomenclatureStore> provider11, Provider<OptionOrderStore> provider12, Provider<OptionPositionStore> provider13, Provider<OptionQuoteStore> provider14, Provider<OptionRemoveReplaceOrderConfirmationStore> provider15, Provider<OptionSettingsStore> provider16, Provider<PositionStore> provider17, Provider<ProfitAndLossDetailStore> provider18, Provider<UserStore> provider19, Provider<OptionOrderDetailStateProvider> provider20, Provider<DuxoBundle> provider21, Provider<SavedStateHandle> provider22) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22);
    }

    @JvmStatic
    public static final OptionOrderDetailDuxo newInstance(AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, DocumentStore documentStore, TraderEventLogger traderEventLogger, ExperimentsStore experimentsStore, IndexStore indexStore, InstrumentStore instrumentStore, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionOrderStore optionOrderStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore, OptionSettingsStore optionSettingsStore, PositionStore positionStore, ProfitAndLossDetailStore profitAndLossDetailStore, UserStore userStore, OptionOrderDetailStateProvider optionOrderDetailStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, backupWithholdingStore, documentStore, traderEventLogger, experimentsStore, indexStore, instrumentStore, optionChainStore, optionInstrumentStore, optionMarketHoursStore, optionOrderNomenclatureStore, optionOrderStore, optionPositionStore, optionQuoteStore, optionRemoveReplaceOrderConfirmationStore, optionSettingsStore, positionStore, profitAndLossDetailStore, userStore, optionOrderDetailStateProvider, duxoBundle, savedStateHandle);
    }

    public OptionOrderDetailDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<DocumentStore> documentStore, Provider<TraderEventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<IndexStore> indexStore, Provider<InstrumentStore> instrumentStore, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore, Provider<OptionOrderStore> optionOrderStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionRemoveReplaceOrderConfirmationStore> optionRemoveReplaceOrderConfirmationStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<PositionStore> positionStore, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<UserStore> userStore, Provider<OptionOrderDetailStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "optionRemoveReplaceOrderConfirmationStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.documentStore = documentStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.indexStore = indexStore;
        this.instrumentStore = instrumentStore;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionOrderNomenclatureStore = optionOrderNomenclatureStore;
        this.optionOrderStore = optionOrderStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionRemoveReplaceOrderConfirmationStore = optionRemoveReplaceOrderConfirmationStore;
        this.optionSettingsStore = optionSettingsStore;
        this.positionStore = positionStore;
        this.profitAndLossDetailStore = profitAndLossDetailStore;
        this.userStore = userStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionOrderDetailDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        DocumentStore documentStore = this.documentStore.get();
        Intrinsics.checkNotNullExpressionValue(documentStore, "get(...)");
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionOrderNomenclatureStore optionOrderNomenclatureStore = this.optionOrderNomenclatureStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderNomenclatureStore, "get(...)");
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionQuoteStore optionQuoteStore2 = optionQuoteStore;
        OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore = this.optionRemoveReplaceOrderConfirmationStore.get();
        Intrinsics.checkNotNullExpressionValue(optionRemoveReplaceOrderConfirmationStore, "get(...)");
        OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore2 = optionRemoveReplaceOrderConfirmationStore;
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSettingsStore optionSettingsStore2 = optionSettingsStore;
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        PositionStore positionStore2 = positionStore;
        ProfitAndLossDetailStore profitAndLossDetailStore = this.profitAndLossDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossDetailStore, "get(...)");
        ProfitAndLossDetailStore profitAndLossDetailStore2 = profitAndLossDetailStore;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        UserStore userStore2 = userStore;
        OptionOrderDetailStateProvider optionOrderDetailStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderDetailStateProvider, "get(...)");
        OptionOrderDetailStateProvider optionOrderDetailStateProvider2 = optionOrderDetailStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, backupWithholdingStore, documentStore, traderEventLogger, experimentsStore, indexStore, instrumentStore, optionChainStore, optionInstrumentStore, optionMarketHoursStore, optionOrderNomenclatureStore, optionOrderStore, optionPositionStore, optionQuoteStore2, optionRemoveReplaceOrderConfirmationStore2, optionSettingsStore2, positionStore2, profitAndLossDetailStore2, userStore2, optionOrderDetailStateProvider2, duxoBundle2, savedStateHandle);
    }

    /* compiled from: OptionOrderDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¼\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0007H\u0007J¸\u0001\u00103\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionRemoveReplaceOrderConfirmationStore", "Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDuxo;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderDetailDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<DocumentStore> documentStore, Provider<TraderEventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<IndexStore> indexStore, Provider<InstrumentStore> instrumentStore, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore, Provider<OptionOrderStore> optionOrderStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionRemoveReplaceOrderConfirmationStore> optionRemoveReplaceOrderConfirmationStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<PositionStore> positionStore, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<UserStore> userStore, Provider<OptionOrderDetailStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "optionRemoveReplaceOrderConfirmationStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionOrderDetailDuxo_Factory(accountProvider, backupWithholdingStore, documentStore, eventLogger, experimentsStore, indexStore, instrumentStore, optionChainStore, optionInstrumentStore, optionMarketHoursStore, optionOrderNomenclatureStore, optionOrderStore, optionPositionStore, optionQuoteStore, optionRemoveReplaceOrderConfirmationStore, optionSettingsStore, positionStore, profitAndLossDetailStore, userStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final OptionOrderDetailDuxo newInstance(AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, DocumentStore documentStore, TraderEventLogger eventLogger, ExperimentsStore experimentsStore, IndexStore indexStore, InstrumentStore instrumentStore, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionOrderStore optionOrderStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore, OptionSettingsStore optionSettingsStore, PositionStore positionStore, ProfitAndLossDetailStore profitAndLossDetailStore, UserStore userStore, OptionOrderDetailStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionRemoveReplaceOrderConfirmationStore, "optionRemoveReplaceOrderConfirmationStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionOrderDetailDuxo(accountProvider, backupWithholdingStore, documentStore, eventLogger, experimentsStore, indexStore, instrumentStore, optionChainStore, optionInstrumentStore, optionMarketHoursStore, optionOrderNomenclatureStore, optionOrderStore, optionPositionStore, optionQuoteStore, optionRemoveReplaceOrderConfirmationStore, optionSettingsStore, positionStore, profitAndLossDetailStore, userStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
