package com.robinhood.android.options.p208ui.detail;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionEventStore;
import com.robinhood.librobinhood.data.store.OptionHistoricalChartStore;
import com.robinhood.librobinhood.data.store.OptionLateCloseStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRollingStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyDetailStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.librobinhood.data.store.OptionsExtendedHoursEnabledStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.librobinhood.data.store.QuoteHistoricalStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionsDetailPageDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001XBÅ\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0003\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0003\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0003\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0003\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0003\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0003\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0003\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0003\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0003\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u0003\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u0003\u0012\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u0003\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020H0\u0003\u0012\f\u0010K\u001a\b\u0012\u0004\u0012\u00020H0\u0003\u0012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020H0\u0003\u0012\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u0003\u0012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u0003\u0012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u0003¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0002H\u0016¢\u0006\u0004\bU\u0010VR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010WR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010WR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010WR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010WR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010WR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010WR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010WR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010WR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010WR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010WR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010WR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010WR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010WR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010WR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010WR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010WR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010WR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010WR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010WR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010WR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010WR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010WR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010WR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010WR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010WR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010WR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010WR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010WR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010WR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010WR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010WR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010WR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020H0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010WR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020H0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010WR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010WR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010WR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010W¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "brokerageResourceManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "comboOrderStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "iacCrossSellLaunchManager", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "infoBannerStore", "Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;", "lateCloseStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lio/noties/markwon/Markwon;", "markwon", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "optionHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "optionStrategyDetailStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "quoteHistoricalStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "pipSupportStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "showCandlestickChartPref", "showAllHoursChartPref", "showAverageCostRetirementTooltipPrefs", "optionsDetailPageIndexCurbHoursTooltipPref", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionsDetailPageDuxo_Factory implements Factory<OptionsDetailPageDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore;
    private final Provider<BrokerageResourceManager> brokerageResourceManager;
    private final Provider<Clock> clock;
    private final Provider<ComboOrderStore> comboOrderStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<CrossSellLaunchManager> iacCrossSellLaunchManager;
    private final Provider<IndexStore> indexStore;
    private final Provider<IacInfoBannerStore> infoBannerStore;
    private final Provider<OptionLateCloseStore> lateCloseStore;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<Markwon> markwon;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionEventStore> optionEventStore;
    private final Provider<OptionHistoricalChartStore> optionHistoricalChartStore;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionRollingStore> optionRollingStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore;
    private final Provider<OptionStrategyDetailStore> optionStrategyDetailStore;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<OptionTooltipStore> optionTooltipStore;
    private final Provider<BooleanPreference> optionsDetailPageIndexCurbHoursTooltipPref;
    private final Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore;
    private final Provider<OptionsWatchlistStore> optionsWatchlistStore;
    private final Provider<PictureInPictureStore> pipSupportStore;
    private final Provider<QuoteHistoricalStore> quoteHistoricalStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> showAllHoursChartPref;
    private final Provider<BooleanPreference> showAverageCostRetirementTooltipPrefs;
    private final Provider<BooleanPreference> showCandlestickChartPref;
    private final Provider<OptionsDetailPageStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsDetailPageDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<AggregateOptionStrategyQuoteStore> provider3, Provider<BrokerageResourceManager> provider4, Provider<Clock> provider5, Provider<ComboOrderStore> provider6, Provider<EventLogger> provider7, Provider<ExperimentsStore> provider8, Provider<CrossSellLaunchManager> provider9, Provider<IndexStore> provider10, Provider<IacInfoBannerStore> provider11, Provider<OptionLateCloseStore> provider12, Provider<MarketHoursStore> provider13, Provider<Markwon> provider14, Provider<OptionAccountSwitcherStore> provider15, Provider<OptionChainStore> provider16, Provider<OptionEventStore> provider17, Provider<OptionsExtendedHoursEnabledStore> provider18, Provider<OptionHistoricalChartStore> provider19, Provider<OptionOrderStore> provider20, Provider<OptionPositionStore> provider21, Provider<OptionQuoteStore> provider22, Provider<OptionRollingStore> provider23, Provider<OptionSettingsStore> provider24, Provider<OptionSimulatedReturnsStore> provider25, Provider<OptionStrategyDetailStore> provider26, Provider<OptionStrategyInfoStore> provider27, Provider<OptionTooltipStore> provider28, Provider<OptionsWatchlistStore> provider29, Provider<QuoteStore> provider30, Provider<UserStore> provider31, Provider<QuoteHistoricalStore> provider32, Provider<PictureInPictureStore> provider33, Provider<RegionGateProvider> provider34, Provider<BooleanPreference> provider35, Provider<BooleanPreference> provider36, Provider<BooleanPreference> provider37, Provider<BooleanPreference> provider38, Provider<OptionsDetailPageStateProvider> provider39, Provider<DuxoBundle> provider40, Provider<SavedStateHandle> provider41) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35, provider36, provider37, provider38, provider39, provider40, provider41);
    }

    @JvmStatic
    public static final OptionsDetailPageDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, BrokerageResourceManager brokerageResourceManager, Clock clock, ComboOrderStore comboOrderStore, EventLogger eventLogger, ExperimentsStore experimentsStore, CrossSellLaunchManager crossSellLaunchManager, IndexStore indexStore, IacInfoBannerStore iacInfoBannerStore, OptionLateCloseStore optionLateCloseStore, MarketHoursStore marketHoursStore, Markwon markwon, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainStore optionChainStore, OptionEventStore optionEventStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, OptionHistoricalChartStore optionHistoricalChartStore, OptionOrderStore optionOrderStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionRollingStore optionRollingStore, OptionSettingsStore optionSettingsStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionStrategyDetailStore optionStrategyDetailStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionTooltipStore optionTooltipStore, OptionsWatchlistStore optionsWatchlistStore, QuoteStore quoteStore, UserStore userStore, QuoteHistoricalStore quoteHistoricalStore, PictureInPictureStore pictureInPictureStore, RegionGateProvider regionGateProvider, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, BooleanPreference booleanPreference4, OptionsDetailPageStateProvider optionsDetailPageStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, aggregateOptionStrategyQuoteStore, brokerageResourceManager, clock, comboOrderStore, eventLogger, experimentsStore, crossSellLaunchManager, indexStore, iacInfoBannerStore, optionLateCloseStore, marketHoursStore, markwon, optionAccountSwitcherStore, optionChainStore, optionEventStore, optionsExtendedHoursEnabledStore, optionHistoricalChartStore, optionOrderStore, optionPositionStore, optionQuoteStore, optionRollingStore, optionSettingsStore, optionSimulatedReturnsStore, optionStrategyDetailStore, optionStrategyInfoStore, optionTooltipStore, optionsWatchlistStore, quoteStore, userStore, quoteHistoricalStore, pictureInPictureStore, regionGateProvider, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, optionsDetailPageStateProvider, duxoBundle, savedStateHandle);
    }

    public OptionsDetailPageDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<Clock> clock, Provider<ComboOrderStore> comboOrderStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<CrossSellLaunchManager> iacCrossSellLaunchManager, Provider<IndexStore> indexStore, Provider<IacInfoBannerStore> infoBannerStore, Provider<OptionLateCloseStore> lateCloseStore, Provider<MarketHoursStore> marketHoursStore, Provider<Markwon> markwon, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainStore> optionChainStore, Provider<OptionEventStore> optionEventStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<OptionHistoricalChartStore> optionHistoricalChartStore, Provider<OptionOrderStore> optionOrderStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionRollingStore> optionRollingStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionStrategyDetailStore> optionStrategyDetailStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<OptionTooltipStore> optionTooltipStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<QuoteStore> quoteStore, Provider<UserStore> userStore, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<PictureInPictureStore> pipSupportStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showCandlestickChartPref, Provider<BooleanPreference> showAllHoursChartPref, Provider<BooleanPreference> showAverageCostRetirementTooltipPrefs, Provider<BooleanPreference> optionsDetailPageIndexCurbHoursTooltipPref, Provider<OptionsDetailPageStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(iacCrossSellLaunchManager, "iacCrossSellLaunchManager");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(infoBannerStore, "infoBannerStore");
        Intrinsics.checkNotNullParameter(lateCloseStore, "lateCloseStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(optionHistoricalChartStore, "optionHistoricalChartStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
        Intrinsics.checkNotNullParameter(optionStrategyDetailStore, "optionStrategyDetailStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
        Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        Intrinsics.checkNotNullParameter(showAllHoursChartPref, "showAllHoursChartPref");
        Intrinsics.checkNotNullParameter(showAverageCostRetirementTooltipPrefs, "showAverageCostRetirementTooltipPrefs");
        Intrinsics.checkNotNullParameter(optionsDetailPageIndexCurbHoursTooltipPref, "optionsDetailPageIndexCurbHoursTooltipPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
        this.brokerageResourceManager = brokerageResourceManager;
        this.clock = clock;
        this.comboOrderStore = comboOrderStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.iacCrossSellLaunchManager = iacCrossSellLaunchManager;
        this.indexStore = indexStore;
        this.infoBannerStore = infoBannerStore;
        this.lateCloseStore = lateCloseStore;
        this.marketHoursStore = marketHoursStore;
        this.markwon = markwon;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainStore = optionChainStore;
        this.optionEventStore = optionEventStore;
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.optionHistoricalChartStore = optionHistoricalChartStore;
        this.optionOrderStore = optionOrderStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionRollingStore = optionRollingStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSimulatedReturnsStore = optionSimulatedReturnsStore;
        this.optionStrategyDetailStore = optionStrategyDetailStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.optionTooltipStore = optionTooltipStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.quoteStore = quoteStore;
        this.userStore = userStore;
        this.quoteHistoricalStore = quoteHistoricalStore;
        this.pipSupportStore = pipSupportStore;
        this.regionGateProvider = regionGateProvider;
        this.showCandlestickChartPref = showCandlestickChartPref;
        this.showAllHoursChartPref = showAllHoursChartPref;
        this.showAverageCostRetirementTooltipPrefs = showAverageCostRetirementTooltipPrefs;
        this.optionsDetailPageIndexCurbHoursTooltipPref = optionsDetailPageIndexCurbHoursTooltipPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionsDetailPageDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionStrategyQuoteStore, "get(...)");
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager.get();
        Intrinsics.checkNotNullExpressionValue(brokerageResourceManager, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        ComboOrderStore comboOrderStore = this.comboOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(comboOrderStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CrossSellLaunchManager crossSellLaunchManager = this.iacCrossSellLaunchManager.get();
        Intrinsics.checkNotNullExpressionValue(crossSellLaunchManager, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        IacInfoBannerStore iacInfoBannerStore = this.infoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        OptionLateCloseStore optionLateCloseStore = this.lateCloseStore.get();
        Intrinsics.checkNotNullExpressionValue(optionLateCloseStore, "get(...)");
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        Markwon markwon2 = markwon;
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore2 = optionAccountSwitcherStore;
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionChainStore optionChainStore2 = optionChainStore;
        OptionEventStore optionEventStore = this.optionEventStore.get();
        Intrinsics.checkNotNullExpressionValue(optionEventStore, "get(...)");
        OptionEventStore optionEventStore2 = optionEventStore;
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore = this.optionsExtendedHoursEnabledStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsExtendedHoursEnabledStore, "get(...)");
        OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore2 = optionsExtendedHoursEnabledStore;
        OptionHistoricalChartStore optionHistoricalChartStore = this.optionHistoricalChartStore.get();
        Intrinsics.checkNotNullExpressionValue(optionHistoricalChartStore, "get(...)");
        OptionHistoricalChartStore optionHistoricalChartStore2 = optionHistoricalChartStore;
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        OptionOrderStore optionOrderStore2 = optionOrderStore;
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionPositionStore optionPositionStore2 = optionPositionStore;
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionQuoteStore optionQuoteStore2 = optionQuoteStore;
        OptionRollingStore optionRollingStore = this.optionRollingStore.get();
        Intrinsics.checkNotNullExpressionValue(optionRollingStore, "get(...)");
        OptionRollingStore optionRollingStore2 = optionRollingStore;
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSettingsStore optionSettingsStore2 = optionSettingsStore;
        OptionSimulatedReturnsStore optionSimulatedReturnsStore = this.optionSimulatedReturnsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSimulatedReturnsStore, "get(...)");
        OptionSimulatedReturnsStore optionSimulatedReturnsStore2 = optionSimulatedReturnsStore;
        OptionStrategyDetailStore optionStrategyDetailStore = this.optionStrategyDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyDetailStore, "get(...)");
        OptionStrategyDetailStore optionStrategyDetailStore2 = optionStrategyDetailStore;
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        OptionStrategyInfoStore optionStrategyInfoStore2 = optionStrategyInfoStore;
        OptionTooltipStore optionTooltipStore = this.optionTooltipStore.get();
        Intrinsics.checkNotNullExpressionValue(optionTooltipStore, "get(...)");
        OptionTooltipStore optionTooltipStore2 = optionTooltipStore;
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsWatchlistStore, "get(...)");
        OptionsWatchlistStore optionsWatchlistStore2 = optionsWatchlistStore;
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        QuoteStore quoteStore2 = quoteStore;
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        UserStore userStore2 = userStore;
        QuoteHistoricalStore quoteHistoricalStore = this.quoteHistoricalStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteHistoricalStore, "get(...)");
        QuoteHistoricalStore quoteHistoricalStore2 = quoteHistoricalStore;
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore.get();
        Intrinsics.checkNotNullExpressionValue(pictureInPictureStore, "get(...)");
        PictureInPictureStore pictureInPictureStore2 = pictureInPictureStore;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        BooleanPreference booleanPreference = this.showCandlestickChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.showAllHoursChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        BooleanPreference booleanPreference5 = this.showAverageCostRetirementTooltipPrefs.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        BooleanPreference booleanPreference6 = booleanPreference5;
        BooleanPreference booleanPreference7 = this.optionsDetailPageIndexCurbHoursTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference7, "get(...)");
        BooleanPreference booleanPreference8 = booleanPreference7;
        OptionsDetailPageStateProvider optionsDetailPageStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionsDetailPageStateProvider, "get(...)");
        OptionsDetailPageStateProvider optionsDetailPageStateProvider2 = optionsDetailPageStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, aggregateOptionStrategyQuoteStore, brokerageResourceManager, clock, comboOrderStore, eventLogger, experimentsStore, crossSellLaunchManager, indexStore, iacInfoBannerStore, optionLateCloseStore, marketHoursStore, markwon2, optionAccountSwitcherStore2, optionChainStore2, optionEventStore2, optionsExtendedHoursEnabledStore2, optionHistoricalChartStore2, optionOrderStore2, optionPositionStore2, optionQuoteStore2, optionRollingStore2, optionSettingsStore2, optionSimulatedReturnsStore2, optionStrategyDetailStore2, optionStrategyInfoStore2, optionTooltipStore2, optionsWatchlistStore2, quoteStore2, userStore2, quoteHistoricalStore2, pictureInPictureStore2, regionGateProvider2, booleanPreference2, booleanPreference4, booleanPreference6, booleanPreference8, optionsDetailPageStateProvider2, duxoBundle2, savedStateHandle);
    }

    /* compiled from: OptionsDetailPageDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÍ\u0004\u0010U\u001a\u00020T2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00042\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00042\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00042\f\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020I0\u00042\f\u0010M\u001a\b\u0012\u0004\u0012\u00020I0\u00042\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00042\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u0004H\u0007¢\u0006\u0004\bU\u0010VJ×\u0002\u0010X\u001a\u00020W2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020I2\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RH\u0007¢\u0006\u0004\bX\u0010Y¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "brokerageResourceManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "comboOrderStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "iacCrossSellLaunchManager", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "infoBannerStore", "Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;", "lateCloseStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lio/noties/markwon/Markwon;", "markwon", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "optionHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "optionStrategyDetailStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "quoteHistoricalStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "pipSupportStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "showCandlestickChartPref", "showAllHoursChartPref", "showAverageCostRetirementTooltipPrefs", "optionsDetailPageIndexCurbHoursTooltipPref", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo_Factory;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lj$/time/Clock;Lcom/robinhood/android/store/options/combo/ComboOrderStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lio/noties/markwon/Markwon;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionEventStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionRollingStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsDetailPageDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionStrategyQuoteStore> aggregateOptionStrategyQuoteStore, Provider<BrokerageResourceManager> brokerageResourceManager, Provider<Clock> clock, Provider<ComboOrderStore> comboOrderStore, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<CrossSellLaunchManager> iacCrossSellLaunchManager, Provider<IndexStore> indexStore, Provider<IacInfoBannerStore> infoBannerStore, Provider<OptionLateCloseStore> lateCloseStore, Provider<MarketHoursStore> marketHoursStore, Provider<Markwon> markwon, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainStore> optionChainStore, Provider<OptionEventStore> optionEventStore, Provider<OptionsExtendedHoursEnabledStore> optionsExtendedHoursEnabledStore, Provider<OptionHistoricalChartStore> optionHistoricalChartStore, Provider<OptionOrderStore> optionOrderStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionRollingStore> optionRollingStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionStrategyDetailStore> optionStrategyDetailStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<OptionTooltipStore> optionTooltipStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<QuoteStore> quoteStore, Provider<UserStore> userStore, Provider<QuoteHistoricalStore> quoteHistoricalStore, Provider<PictureInPictureStore> pipSupportStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showCandlestickChartPref, Provider<BooleanPreference> showAllHoursChartPref, Provider<BooleanPreference> showAverageCostRetirementTooltipPrefs, Provider<BooleanPreference> optionsDetailPageIndexCurbHoursTooltipPref, Provider<OptionsDetailPageStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(iacCrossSellLaunchManager, "iacCrossSellLaunchManager");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(infoBannerStore, "infoBannerStore");
            Intrinsics.checkNotNullParameter(lateCloseStore, "lateCloseStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(optionHistoricalChartStore, "optionHistoricalChartStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionStrategyDetailStore, "optionStrategyDetailStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            Intrinsics.checkNotNullParameter(showAllHoursChartPref, "showAllHoursChartPref");
            Intrinsics.checkNotNullParameter(showAverageCostRetirementTooltipPrefs, "showAverageCostRetirementTooltipPrefs");
            Intrinsics.checkNotNullParameter(optionsDetailPageIndexCurbHoursTooltipPref, "optionsDetailPageIndexCurbHoursTooltipPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsDetailPageDuxo_Factory(accountProvider, aggregateOptionPositionStore, aggregateOptionStrategyQuoteStore, brokerageResourceManager, clock, comboOrderStore, eventLogger, experimentsStore, iacCrossSellLaunchManager, indexStore, infoBannerStore, lateCloseStore, marketHoursStore, markwon, optionAccountSwitcherStore, optionChainStore, optionEventStore, optionsExtendedHoursEnabledStore, optionHistoricalChartStore, optionOrderStore, optionPositionStore, optionQuoteStore, optionRollingStore, optionSettingsStore, optionSimulatedReturnsStore, optionStrategyDetailStore, optionStrategyInfoStore, optionTooltipStore, optionsWatchlistStore, quoteStore, userStore, quoteHistoricalStore, pipSupportStore, regionGateProvider, showCandlestickChartPref, showAllHoursChartPref, showAverageCostRetirementTooltipPrefs, optionsDetailPageIndexCurbHoursTooltipPref, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final OptionsDetailPageDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, BrokerageResourceManager brokerageResourceManager, Clock clock, ComboOrderStore comboOrderStore, EventLogger eventLogger, ExperimentsStore experimentsStore, CrossSellLaunchManager iacCrossSellLaunchManager, IndexStore indexStore, IacInfoBannerStore infoBannerStore, OptionLateCloseStore lateCloseStore, MarketHoursStore marketHoursStore, Markwon markwon, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainStore optionChainStore, OptionEventStore optionEventStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, OptionHistoricalChartStore optionHistoricalChartStore, OptionOrderStore optionOrderStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionRollingStore optionRollingStore, OptionSettingsStore optionSettingsStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionStrategyDetailStore optionStrategyDetailStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionTooltipStore optionTooltipStore, OptionsWatchlistStore optionsWatchlistStore, QuoteStore quoteStore, UserStore userStore, QuoteHistoricalStore quoteHistoricalStore, PictureInPictureStore pipSupportStore, RegionGateProvider regionGateProvider, BooleanPreference showCandlestickChartPref, BooleanPreference showAllHoursChartPref, BooleanPreference showAverageCostRetirementTooltipPrefs, BooleanPreference optionsDetailPageIndexCurbHoursTooltipPref, OptionsDetailPageStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "aggregateOptionStrategyQuoteStore");
            Intrinsics.checkNotNullParameter(brokerageResourceManager, "brokerageResourceManager");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(iacCrossSellLaunchManager, "iacCrossSellLaunchManager");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(infoBannerStore, "infoBannerStore");
            Intrinsics.checkNotNullParameter(lateCloseStore, "lateCloseStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
            Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
            Intrinsics.checkNotNullParameter(optionHistoricalChartStore, "optionHistoricalChartStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionStrategyDetailStore, "optionStrategyDetailStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(quoteHistoricalStore, "quoteHistoricalStore");
            Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            Intrinsics.checkNotNullParameter(showAllHoursChartPref, "showAllHoursChartPref");
            Intrinsics.checkNotNullParameter(showAverageCostRetirementTooltipPrefs, "showAverageCostRetirementTooltipPrefs");
            Intrinsics.checkNotNullParameter(optionsDetailPageIndexCurbHoursTooltipPref, "optionsDetailPageIndexCurbHoursTooltipPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsDetailPageDuxo(accountProvider, aggregateOptionPositionStore, aggregateOptionStrategyQuoteStore, brokerageResourceManager, clock, comboOrderStore, eventLogger, experimentsStore, iacCrossSellLaunchManager, indexStore, infoBannerStore, lateCloseStore, marketHoursStore, markwon, optionAccountSwitcherStore, optionChainStore, optionEventStore, optionsExtendedHoursEnabledStore, optionHistoricalChartStore, optionOrderStore, optionPositionStore, optionQuoteStore, optionRollingStore, optionSettingsStore, optionSimulatedReturnsStore, optionStrategyDetailStore, optionStrategyInfoStore, optionTooltipStore, optionsWatchlistStore, quoteStore, userStore, quoteHistoricalStore, pipSupportStore, regionGateProvider, showCandlestickChartPref, showAllHoursChartPref, showAverageCostRetirementTooltipPrefs, optionsDetailPageIndexCurbHoursTooltipPref, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
