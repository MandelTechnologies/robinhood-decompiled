package com.robinhood.android.optionschain.sbschain;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.optionschain.sbschain.logging.OptionSideBySideChainLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-Bª\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\u0017\u0010\u001e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0002\b!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004¢\u0006\u0004\b*\u0010+J\b\u0010,\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0002\b!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainLogger", "Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "optionChainSimulatedReturnLongPressBannerSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "simulatedReturnChartShownPref", "simulatedReturnSwitchChartTooltipShownPref", "optionChainSettingsPnlChartTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "Lkotlin/jvm/JvmSuppressWildcards;", "optionSbsEduFooterDismissedPref", "optionSbsLottieNuxAnimationSeenPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionSideBySideChainDuxo_Factory implements Factory<OptionSideBySideChainDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<EnumPreference<OptionChainSettingsPnlChartType>> optionChainSettingsPnlChartTypePref;
    private final Provider<BooleanPreference> optionChainSimulatedReturnLongPressBannerSeenPref;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<BooleanPreference> optionSbsEduFooterDismissedPref;
    private final Provider<BooleanPreference> optionSbsLottieNuxAnimationSeenPref;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSideBySideChainLogger> optionSideBySideChainLogger;
    private final Provider<OptionSideBySideChainStore> optionSideBySideChainStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> simulatedReturnChartShownPref;
    private final Provider<BooleanPreference> simulatedReturnSwitchChartTooltipShownPref;
    private final Provider<OptionSideBySideChainStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionSideBySideChainDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<EventLogger> provider3, Provider<ExperimentsStore> provider4, Provider<OptionAccountSwitcherStore> provider5, Provider<OptionInstrumentStore> provider6, Provider<OptionMarketHoursStore> provider7, Provider<OptionSettingsStore> provider8, Provider<OptionSideBySideChainLogger> provider9, Provider<OptionSideBySideChainStore> provider10, Provider<RegionGateProvider> provider11, Provider<BooleanPreference> provider12, Provider<BooleanPreference> provider13, Provider<BooleanPreference> provider14, Provider<EnumPreference<OptionChainSettingsPnlChartType>> provider15, Provider<BooleanPreference> provider16, Provider<BooleanPreference> provider17, Provider<SavedStateHandle> provider18, Provider<OptionSideBySideChainStateProvider> provider19, Provider<DuxoBundle> provider20) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20);
    }

    @JvmStatic
    public static final OptionSideBySideChainDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainLogger optionSideBySideChainLogger, OptionSideBySideChainStore optionSideBySideChainStore, RegionGateProvider regionGateProvider, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, EnumPreference<OptionChainSettingsPnlChartType> enumPreference, BooleanPreference booleanPreference4, BooleanPreference booleanPreference5, SavedStateHandle savedStateHandle, OptionSideBySideChainStateProvider optionSideBySideChainStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, eventLogger, experimentsStore, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, regionGateProvider, booleanPreference, booleanPreference2, booleanPreference3, enumPreference, booleanPreference4, booleanPreference5, savedStateHandle, optionSideBySideChainStateProvider, duxoBundle);
    }

    public OptionSideBySideChainDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainLogger> optionSideBySideChainLogger, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> optionChainSimulatedReturnLongPressBannerSeenPref, Provider<BooleanPreference> simulatedReturnChartShownPref, Provider<BooleanPreference> simulatedReturnSwitchChartTooltipShownPref, Provider<EnumPreference<OptionChainSettingsPnlChartType>> optionChainSettingsPnlChartTypePref, Provider<BooleanPreference> optionSbsEduFooterDismissedPref, Provider<BooleanPreference> optionSbsLottieNuxAnimationSeenPref, Provider<SavedStateHandle> savedStateHandle, Provider<OptionSideBySideChainStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(optionChainSimulatedReturnLongPressBannerSeenPref, "optionChainSimulatedReturnLongPressBannerSeenPref");
        Intrinsics.checkNotNullParameter(simulatedReturnChartShownPref, "simulatedReturnChartShownPref");
        Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
        Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
        Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
        Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainLogger = optionSideBySideChainLogger;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.regionGateProvider = regionGateProvider;
        this.optionChainSimulatedReturnLongPressBannerSeenPref = optionChainSimulatedReturnLongPressBannerSeenPref;
        this.simulatedReturnChartShownPref = simulatedReturnChartShownPref;
        this.simulatedReturnSwitchChartTooltipShownPref = simulatedReturnSwitchChartTooltipShownPref;
        this.optionChainSettingsPnlChartTypePref = optionChainSettingsPnlChartTypePref;
        this.optionSbsEduFooterDismissedPref = optionSbsEduFooterDismissedPref;
        this.optionSbsLottieNuxAnimationSeenPref = optionSbsLottieNuxAnimationSeenPref;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public OptionSideBySideChainDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSideBySideChainLogger optionSideBySideChainLogger = this.optionSideBySideChainLogger.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainLogger, "get(...)");
        OptionSideBySideChainStore optionSideBySideChainStore = this.optionSideBySideChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        BooleanPreference booleanPreference = this.optionChainSimulatedReturnLongPressBannerSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.simulatedReturnChartShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.simulatedReturnSwitchChartTooltipShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        EnumPreference<OptionChainSettingsPnlChartType> enumPreference = this.optionChainSettingsPnlChartTypePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        EnumPreference<OptionChainSettingsPnlChartType> enumPreference2 = enumPreference;
        BooleanPreference booleanPreference5 = this.optionSbsEduFooterDismissedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        BooleanPreference booleanPreference6 = booleanPreference5;
        BooleanPreference booleanPreference7 = this.optionSbsLottieNuxAnimationSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference7, "get(...)");
        BooleanPreference booleanPreference8 = booleanPreference7;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        OptionSideBySideChainStateProvider optionSideBySideChainStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainStateProvider, "get(...)");
        OptionSideBySideChainStateProvider optionSideBySideChainStateProvider2 = optionSideBySideChainStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, eventLogger, experimentsStore, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, regionGateProvider, booleanPreference, booleanPreference2, booleanPreference4, enumPreference2, booleanPreference6, booleanPreference8, savedStateHandle2, optionSideBySideChainStateProvider2, duxoBundle);
    }

    /* compiled from: OptionSideBySideChainDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J«\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u0017\u0010!\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0007H\u0007J³\u0001\u0010-\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\b$2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainLogger", "Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "optionChainSimulatedReturnLongPressBannerSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "simulatedReturnChartShownPref", "simulatedReturnSwitchChartTooltipShownPref", "optionChainSettingsPnlChartTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "Lkotlin/jvm/JvmSuppressWildcards;", "optionSbsEduFooterDismissedPref", "optionSbsLottieNuxAnimationSeenPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDuxo;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionSideBySideChainDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainLogger> optionSideBySideChainLogger, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> optionChainSimulatedReturnLongPressBannerSeenPref, Provider<BooleanPreference> simulatedReturnChartShownPref, Provider<BooleanPreference> simulatedReturnSwitchChartTooltipShownPref, Provider<EnumPreference<OptionChainSettingsPnlChartType>> optionChainSettingsPnlChartTypePref, Provider<BooleanPreference> optionSbsEduFooterDismissedPref, Provider<BooleanPreference> optionSbsLottieNuxAnimationSeenPref, Provider<SavedStateHandle> savedStateHandle, Provider<OptionSideBySideChainStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(optionChainSimulatedReturnLongPressBannerSeenPref, "optionChainSimulatedReturnLongPressBannerSeenPref");
            Intrinsics.checkNotNullParameter(simulatedReturnChartShownPref, "simulatedReturnChartShownPref");
            Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
            Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
            Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
            Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionSideBySideChainDuxo_Factory(accountProvider, aggregateOptionPositionStore, eventLogger, experimentsStore, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, regionGateProvider, optionChainSimulatedReturnLongPressBannerSeenPref, simulatedReturnChartShownPref, simulatedReturnSwitchChartTooltipShownPref, optionChainSettingsPnlChartTypePref, optionSbsEduFooterDismissedPref, optionSbsLottieNuxAnimationSeenPref, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final OptionSideBySideChainDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainLogger optionSideBySideChainLogger, OptionSideBySideChainStore optionSideBySideChainStore, RegionGateProvider regionGateProvider, BooleanPreference optionChainSimulatedReturnLongPressBannerSeenPref, BooleanPreference simulatedReturnChartShownPref, BooleanPreference simulatedReturnSwitchChartTooltipShownPref, EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref, BooleanPreference optionSbsEduFooterDismissedPref, BooleanPreference optionSbsLottieNuxAnimationSeenPref, SavedStateHandle savedStateHandle, OptionSideBySideChainStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "optionSideBySideChainLogger");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(optionChainSimulatedReturnLongPressBannerSeenPref, "optionChainSimulatedReturnLongPressBannerSeenPref");
            Intrinsics.checkNotNullParameter(simulatedReturnChartShownPref, "simulatedReturnChartShownPref");
            Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
            Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
            Intrinsics.checkNotNullParameter(optionSbsEduFooterDismissedPref, "optionSbsEduFooterDismissedPref");
            Intrinsics.checkNotNullParameter(optionSbsLottieNuxAnimationSeenPref, "optionSbsLottieNuxAnimationSeenPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionSideBySideChainDuxo(accountProvider, aggregateOptionPositionStore, eventLogger, experimentsStore, optionAccountSwitcherStore, optionInstrumentStore, optionMarketHoursStore, optionSettingsStore, optionSideBySideChainLogger, optionSideBySideChainStore, regionGateProvider, optionChainSimulatedReturnLongPressBannerSeenPref, simulatedReturnChartShownPref, simulatedReturnSwitchChartTooltipShownPref, optionChainSettingsPnlChartTypePref, optionSbsEduFooterDismissedPref, optionSbsLottieNuxAnimationSeenPref, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
