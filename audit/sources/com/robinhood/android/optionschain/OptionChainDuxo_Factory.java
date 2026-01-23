package com.robinhood.android.optionschain;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionChainLandingStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionOrderFilterStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionChainDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KBî\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0003\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0003\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0003\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\u0017\u0010;\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020908¢\u0006\u0002\b:0\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0003\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0003\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0003\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0003\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u0003¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0002H\u0016¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010JR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010JR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010JR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010JR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010JR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010JR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010JR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010JR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010JR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010JR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010JR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010JR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010JR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010JR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010JR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010JR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010JR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010JR\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010JR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010JR\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010JR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010JR%\u0010;\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020908¢\u0006\u0002\b:0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010JR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010JR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010JR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010JR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010JR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010J¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionschain/OptionChainDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;", "optionOrderFilterStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionChainLandingStore;", "optionChainLandingStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "showMultipleUnderlyingsTooltipPref", "showSettleOnOpenTooltipPref", "optionChainSwitchFocusedToSbsTooltipDismissedPref", "optionPreTradeSimulatedReturnChartShownPref", "simulatedReturnSwitchChartTooltipShownPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "Lkotlin/jvm/JvmSuppressWildcards;", "optionChainSettingsPnlChartTypePref", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/optionschain/OptionChainDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionChainDuxo_Factory implements Factory<OptionChainDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<Clock> clock;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<InstrumentStore> equityInstrumentStore;
    private final Provider<QuoteStore> equityQuoteStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore;
    private final Provider<OptionChainCustomizationStore> optionChainCustomizationStore;
    private final Provider<OptionChainLandingStore> optionChainLandingStore;
    private final Provider<EnumPreference<OptionChainSettingsPnlChartType>> optionChainSettingsPnlChartTypePref;
    private final Provider<BooleanPreference> optionChainSwitchFocusedToSbsTooltipDismissedPref;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionOrderFilterStore> optionOrderFilterStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<BooleanPreference> optionPreTradeSimulatedReturnChartShownPref;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSideBySideChainStore> optionSideBySideChainStore;
    private final Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore;
    private final Provider<OptionTooltipStore> optionTooltipStore;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> showMultipleUnderlyingsTooltipPref;
    private final Provider<BooleanPreference> showSettleOnOpenTooltipPref;
    private final Provider<BooleanPreference> simulatedReturnSwitchChartTooltipShownPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionChainDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<InstrumentStore> provider3, Provider<QuoteStore> provider4, Provider<ExperimentsStore> provider5, Provider<EventLogger> provider6, Provider<IndexStore> provider7, Provider<OptionAccountSwitcherStore> provider8, Provider<OptionChainCustomizationStore> provider9, Provider<OptionChainCustomizationDiscoveryStore> provider10, Provider<OptionMarketHoursStore> provider11, Provider<OptionOrderFilterStore> provider12, Provider<OptionPositionStore> provider13, Provider<OptionQuoteStore> provider14, Provider<OptionSideBySideChainStore> provider15, Provider<OptionSettingsStore> provider16, Provider<OptionStrategyBuilderStore> provider17, Provider<OptionTooltipStore> provider18, Provider<OptionInstrumentStore> provider19, Provider<OptionChainLandingStore> provider20, Provider<OptionsExtendedHoursEnabledStore> provider21, Provider<PerformanceLogger> provider22, Provider<RegionGateProvider> provider23, Provider<BooleanPreference> provider24, Provider<BooleanPreference> provider25, Provider<BooleanPreference> provider26, Provider<BooleanPreference> provider27, Provider<BooleanPreference> provider28, Provider<EnumPreference<OptionChainSettingsPnlChartType>> provider29, Provider<Clock> provider30, Provider<SavedStateHandle> provider31, Provider<DispatcherProvider> provider32, Provider<RxFactory> provider33, Provider<RxGlobalErrorHandler> provider34) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34);
    }

    @JvmStatic
    public static final OptionChainDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, InstrumentStore instrumentStore, QuoteStore quoteStore, ExperimentsStore experimentsStore, EventLogger eventLogger, IndexStore indexStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionMarketHoursStore optionMarketHoursStore, OptionOrderFilterStore optionOrderFilterStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionSettingsStore optionSettingsStore, OptionStrategyBuilderStore optionStrategyBuilderStore, OptionTooltipStore optionTooltipStore, OptionInstrumentStore optionInstrumentStore, OptionChainLandingStore optionChainLandingStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, PerformanceLogger performanceLogger, RegionGateProvider regionGateProvider, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, BooleanPreference booleanPreference4, BooleanPreference booleanPreference5, EnumPreference<OptionChainSettingsPnlChartType> enumPreference, Clock clock, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, instrumentStore, quoteStore, experimentsStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionMarketHoursStore, optionOrderFilterStore, optionPositionStore, optionQuoteStore, optionSideBySideChainStore, optionSettingsStore, optionStrategyBuilderStore, optionTooltipStore, optionInstrumentStore, optionChainLandingStore, optionsExtendedHoursEnabledStore, performanceLogger, regionGateProvider, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, booleanPreference5, enumPreference, clock, savedStateHandle);
    }

    public OptionChainDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<InstrumentStore> equityInstrumentStore, Provider<QuoteStore> equityQuoteStore, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<IndexStore> indexStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionOrderFilterStore> optionOrderFilterStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore, Provider<OptionTooltipStore> optionTooltipStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionChainLandingStore> optionChainLandingStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<PerformanceLogger> performanceLogger, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showMultipleUnderlyingsTooltipPref, Provider<BooleanPreference> showSettleOnOpenTooltipPref, Provider<BooleanPreference> optionChainSwitchFocusedToSbsTooltipDismissedPref, Provider<BooleanPreference> optionPreTradeSimulatedReturnChartShownPref, Provider<BooleanPreference> simulatedReturnSwitchChartTooltipShownPref, Provider<EnumPreference<OptionChainSettingsPnlChartType>> optionChainSettingsPnlChartTypePref, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionOrderFilterStore, "optionOrderFilterStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
        Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionChainLandingStore, "optionChainLandingStore");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(showMultipleUnderlyingsTooltipPref, "showMultipleUnderlyingsTooltipPref");
        Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
        Intrinsics.checkNotNullParameter(optionChainSwitchFocusedToSbsTooltipDismissedPref, "optionChainSwitchFocusedToSbsTooltipDismissedPref");
        Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
        Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
        Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.equityInstrumentStore = equityInstrumentStore;
        this.equityQuoteStore = equityQuoteStore;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.indexStore = indexStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionChainCustomizationDiscoveryStore = optionChainCustomizationDiscoveryStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionOrderFilterStore = optionOrderFilterStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionStrategyBuilderStore = optionStrategyBuilderStore;
        this.optionTooltipStore = optionTooltipStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionChainLandingStore = optionChainLandingStore;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.performanceLogger = performanceLogger;
        this.regionGateProvider = regionGateProvider;
        this.showMultipleUnderlyingsTooltipPref = showMultipleUnderlyingsTooltipPref;
        this.showSettleOnOpenTooltipPref = showSettleOnOpenTooltipPref;
        this.optionChainSwitchFocusedToSbsTooltipDismissedPref = optionChainSwitchFocusedToSbsTooltipDismissedPref;
        this.optionPreTradeSimulatedReturnChartShownPref = optionPreTradeSimulatedReturnChartShownPref;
        this.simulatedReturnSwitchChartTooltipShownPref = simulatedReturnSwitchChartTooltipShownPref;
        this.optionChainSettingsPnlChartTypePref = optionChainSettingsPnlChartTypePref;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public OptionChainDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        InstrumentStore instrumentStore = this.equityInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        QuoteStore quoteStore = this.equityQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionChainCustomizationStore optionChainCustomizationStore = this.optionChainCustomizationStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationStore, "get(...)");
        OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore = this.optionChainCustomizationDiscoveryStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationDiscoveryStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionOrderFilterStore optionOrderFilterStore = this.optionOrderFilterStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderFilterStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionQuoteStore optionQuoteStore2 = optionQuoteStore;
        OptionSideBySideChainStore optionSideBySideChainStore = this.optionSideBySideChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainStore, "get(...)");
        OptionSideBySideChainStore optionSideBySideChainStore2 = optionSideBySideChainStore;
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSettingsStore optionSettingsStore2 = optionSettingsStore;
        OptionStrategyBuilderStore optionStrategyBuilderStore = this.optionStrategyBuilderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyBuilderStore, "get(...)");
        OptionStrategyBuilderStore optionStrategyBuilderStore2 = optionStrategyBuilderStore;
        OptionTooltipStore optionTooltipStore = this.optionTooltipStore.get();
        Intrinsics.checkNotNullExpressionValue(optionTooltipStore, "get(...)");
        OptionTooltipStore optionTooltipStore2 = optionTooltipStore;
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore2 = optionInstrumentStore;
        OptionChainLandingStore optionChainLandingStore = this.optionChainLandingStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainLandingStore, "get(...)");
        OptionChainLandingStore optionChainLandingStore2 = optionChainLandingStore;
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore2 = optionsExtendedHoursEnabledStore;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        BooleanPreference booleanPreference = this.showMultipleUnderlyingsTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.showSettleOnOpenTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        BooleanPreference booleanPreference5 = this.optionChainSwitchFocusedToSbsTooltipDismissedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        BooleanPreference booleanPreference6 = booleanPreference5;
        BooleanPreference booleanPreference7 = this.optionPreTradeSimulatedReturnChartShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference7, "get(...)");
        BooleanPreference booleanPreference8 = booleanPreference7;
        BooleanPreference booleanPreference9 = this.simulatedReturnSwitchChartTooltipShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference9, "get(...)");
        BooleanPreference booleanPreference10 = booleanPreference9;
        EnumPreference<OptionChainSettingsPnlChartType> enumPreference = this.optionChainSettingsPnlChartTypePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        EnumPreference<OptionChainSettingsPnlChartType> enumPreference2 = enumPreference;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        Clock clock2 = clock;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OptionChainDuxo optionChainDuxoNewInstance = companion.newInstance(accountProvider, aggregateOptionPositionStore, instrumentStore, quoteStore, experimentsStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionMarketHoursStore, optionOrderFilterStore, optionPositionStore, optionQuoteStore2, optionSideBySideChainStore2, optionSettingsStore2, optionStrategyBuilderStore2, optionTooltipStore2, optionInstrumentStore2, optionChainLandingStore2, optionsExtendedHoursEnabledStore2, performanceLogger2, regionGateProvider2, booleanPreference2, booleanPreference4, booleanPreference6, booleanPreference8, booleanPreference10, enumPreference2, clock2, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(optionChainDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(optionChainDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(optionChainDuxoNewInstance, rxGlobalErrorHandler);
        return optionChainDuxoNewInstance;
    }

    /* compiled from: OptionChainDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jö\u0003\u0010H\u001a\u00020G2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002030\u00042\u0017\u0010<\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020:09¢\u0006\u0002\b;0\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u0004H\u0007¢\u0006\u0004\bH\u0010IJ\u0092\u0002\u0010K\u001a\u00020J2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u0002032\u0006\u00108\u001a\u0002032\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020:09¢\u0006\u0002\b;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\bK\u0010L¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;", "optionOrderFilterStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionChainLandingStore;", "optionChainLandingStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "showMultipleUnderlyingsTooltipPref", "showSettleOnOpenTooltipPref", "optionChainSwitchFocusedToSbsTooltipDismissedPref", "optionPreTradeSimulatedReturnChartShownPref", "simulatedReturnSwitchChartTooltipShownPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "Lkotlin/jvm/JvmSuppressWildcards;", "optionChainSettingsPnlChartTypePref", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "Lcom/robinhood/android/optionschain/OptionChainDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/optionschain/OptionChainDuxo_Factory;", "Lcom/robinhood/android/optionschain/OptionChainDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionOrderFilterStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionChainLandingStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/EnumPreference;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/optionschain/OptionChainDuxo;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionChainDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<InstrumentStore> equityInstrumentStore, Provider<QuoteStore> equityQuoteStore, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<IndexStore> indexStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionOrderFilterStore> optionOrderFilterStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore, Provider<OptionTooltipStore> optionTooltipStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionChainLandingStore> optionChainLandingStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<PerformanceLogger> performanceLogger, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showMultipleUnderlyingsTooltipPref, Provider<BooleanPreference> showSettleOnOpenTooltipPref, Provider<BooleanPreference> optionChainSwitchFocusedToSbsTooltipDismissedPref, Provider<BooleanPreference> optionPreTradeSimulatedReturnChartShownPref, Provider<BooleanPreference> simulatedReturnSwitchChartTooltipShownPref, Provider<EnumPreference<OptionChainSettingsPnlChartType>> optionChainSettingsPnlChartTypePref, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionOrderFilterStore, "optionOrderFilterStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
            Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionChainLandingStore, "optionChainLandingStore");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showMultipleUnderlyingsTooltipPref, "showMultipleUnderlyingsTooltipPref");
            Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
            Intrinsics.checkNotNullParameter(optionChainSwitchFocusedToSbsTooltipDismissedPref, "optionChainSwitchFocusedToSbsTooltipDismissedPref");
            Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
            Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
            Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OptionChainDuxo_Factory(accountProvider, aggregateOptionPositionStore, equityInstrumentStore, equityQuoteStore, experimentsStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionMarketHoursStore, optionOrderFilterStore, optionPositionStore, optionQuoteStore, optionSideBySideChainStore, optionSettingsStore, optionStrategyBuilderStore, optionTooltipStore, optionInstrumentStore, optionChainLandingStore, optionsExtendedHoursEnabledStore, performanceLogger, regionGateProvider, showMultipleUnderlyingsTooltipPref, showSettleOnOpenTooltipPref, optionChainSwitchFocusedToSbsTooltipDismissedPref, optionPreTradeSimulatedReturnChartShownPref, simulatedReturnSwitchChartTooltipShownPref, optionChainSettingsPnlChartTypePref, clock, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final OptionChainDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, InstrumentStore equityInstrumentStore, QuoteStore equityQuoteStore, ExperimentsStore experimentsStore, EventLogger eventLogger, IndexStore indexStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionMarketHoursStore optionMarketHoursStore, OptionOrderFilterStore optionOrderFilterStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionSettingsStore optionSettingsStore, OptionStrategyBuilderStore optionStrategyBuilderStore, OptionTooltipStore optionTooltipStore, OptionInstrumentStore optionInstrumentStore, OptionChainLandingStore optionChainLandingStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, PerformanceLogger performanceLogger, RegionGateProvider regionGateProvider, BooleanPreference showMultipleUnderlyingsTooltipPref, BooleanPreference showSettleOnOpenTooltipPref, BooleanPreference optionChainSwitchFocusedToSbsTooltipDismissedPref, BooleanPreference optionPreTradeSimulatedReturnChartShownPref, BooleanPreference simulatedReturnSwitchChartTooltipShownPref, EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref, Clock clock, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionOrderFilterStore, "optionOrderFilterStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
            Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionChainLandingStore, "optionChainLandingStore");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showMultipleUnderlyingsTooltipPref, "showMultipleUnderlyingsTooltipPref");
            Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
            Intrinsics.checkNotNullParameter(optionChainSwitchFocusedToSbsTooltipDismissedPref, "optionChainSwitchFocusedToSbsTooltipDismissedPref");
            Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
            Intrinsics.checkNotNullParameter(simulatedReturnSwitchChartTooltipShownPref, "simulatedReturnSwitchChartTooltipShownPref");
            Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionChainDuxo(accountProvider, aggregateOptionPositionStore, equityInstrumentStore, equityQuoteStore, experimentsStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionMarketHoursStore, optionOrderFilterStore, optionPositionStore, optionQuoteStore, optionSideBySideChainStore, optionSettingsStore, optionStrategyBuilderStore, optionTooltipStore, optionInstrumentStore, optionChainLandingStore, optionsExtendedHoursEnabledStore, performanceLogger, regionGateProvider, showMultipleUnderlyingsTooltipPref, showSettleOnOpenTooltipPref, optionChainSwitchFocusedToSbsTooltipDismissedPref, optionPreTradeSimulatedReturnChartShownPref, simulatedReturnSwitchChartTooltipShownPref, optionChainSettingsPnlChartTypePref, clock, savedStateHandle);
        }
    }
}
