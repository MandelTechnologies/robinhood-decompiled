package com.robinhood.android.optionschain.sbschain.table;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.optionschain.sbschain.logging.OptionSideBySideChainLogger;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainTableDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainLogger", "Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionSbsEduFooterDismissedPref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionSideBySideChainTableDuxo_Factory implements Factory<OptionSideBySideChainTableDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<BooleanPreference> optionSbsEduFooterDismissedPref;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSideBySideChainLogger> optionSideBySideChainLogger;
    private final Provider<OptionSideBySideChainStore> optionSideBySideChainStore;
    private final Provider<OptionsWatchlistStore> optionsWatchlistStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionSideBySideChainTableStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionSideBySideChainTableDuxo_Factory create(Provider<ExperimentsStore> provider, Provider<OptionAccountSwitcherStore> provider2, Provider<OptionMarketHoursStore> provider3, Provider<OptionPositionStore> provider4, Provider<OptionQuoteStore> provider5, Provider<OptionSettingsStore> provider6, Provider<OptionSideBySideChainLogger> provider7, Provider<OptionSideBySideChainStore> provider8, Provider<OptionsWatchlistStore> provider9, Provider<OptionInstrumentStore> provider10, Provider<BooleanPreference> provider11, Provider<SavedStateHandle> provider12, Provider<DuxoBundle> provider13, Provider<OptionSideBySideChainTableStateProvider> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final OptionSideBySideChainTableDuxo newInstance(ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainLogger optionSideBySideChainLogger, OptionSideBySideChainStore optionSideBySideChainStore, OptionsWatchlistStore optionsWatchlistStore, OptionInstrumentStore optionInstrumentStore, BooleanPreference booleanPreference, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, OptionSideBySideChainTableStateProvider optionSideBySideChainTableStateProvider) {
        return INSTANCE.newInstance(experimentsStore, optionAccountSwitcherStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, optionsWatchlistStore, optionInstrumentStore, booleanPreference, savedStateHandle, duxoBundle, optionSideBySideChainTableStateProvider);
    }

    public OptionSideBySideChainTableDuxo_Factory(Provider<ExperimentsStore> experimentsStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainLogger> optionSideBySideChainLogger, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<BooleanPreference> optionSbsEduFooterDismissedPref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<OptionSideBySideChainTableStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.experimentsStore = experimentsStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainLogger = optionSideBySideChainLogger;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionSbsEduFooterDismissedPref = optionSbsEduFooterDismissedPref;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public OptionSideBySideChainTableDuxo get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSideBySideChainLogger optionSideBySideChainLogger = this.optionSideBySideChainLogger.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainLogger, "get(...)");
        OptionSideBySideChainStore optionSideBySideChainStore = this.optionSideBySideChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainStore, "get(...)");
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsWatchlistStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        BooleanPreference booleanPreference = this.optionSbsEduFooterDismissedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OptionSideBySideChainTableStateProvider optionSideBySideChainTableStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainTableStateProvider, "get(...)");
        return companion.newInstance(experimentsStore, optionAccountSwitcherStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, optionsWatchlistStore, optionInstrumentStore, booleanPreference, savedStateHandle, duxoBundle, optionSideBySideChainTableStateProvider);
    }

    /* compiled from: OptionSideBySideChainTableDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainLogger", "Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionSbsEduFooterDismissedPref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableStateProvider;", "newInstance", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionSideBySideChainTableDuxo_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainLogger> optionSideBySideChainLogger, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<BooleanPreference> optionSbsEduFooterDismissedPref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<OptionSideBySideChainTableStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new OptionSideBySideChainTableDuxo_Factory(experimentsStore, optionAccountSwitcherStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, optionsWatchlistStore, optionInstrumentStore, optionSbsEduFooterDismissedPref, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final OptionSideBySideChainTableDuxo newInstance(ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainLogger optionSideBySideChainLogger, OptionSideBySideChainStore optionSideBySideChainStore, OptionsWatchlistStore optionsWatchlistStore, OptionInstrumentStore optionInstrumentStore, BooleanPreference optionSbsEduFooterDismissedPref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, OptionSideBySideChainTableStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new OptionSideBySideChainTableDuxo(experimentsStore, optionAccountSwitcherStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, optionsWatchlistStore, optionInstrumentStore, optionSbsEduFooterDismissedPref, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}
