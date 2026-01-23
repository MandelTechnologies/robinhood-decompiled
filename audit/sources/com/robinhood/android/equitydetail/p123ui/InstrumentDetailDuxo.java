package com.robinhood.android.equitydetail.p123ui;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.data.prefs.HasShownDirectIpoOnboarding;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.compose.ComposeEducationTourManager;
import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.equities.shortinterest.ShortInterestSectionViewState;
import com.robinhood.android.equitydetail.EquityEarningsSduiChart;
import com.robinhood.android.equitydetail.EquityOrdersStopPollAllPagesExperiment;
import com.robinhood.android.equitydetail.GoldUngatingL2DataExperiment;
import com.robinhood.android.equitydetail.MarginHubDiscoverabilityExperiment;
import com.robinhood.android.equitydetail.SdpV2Experiment;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailDuxo;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailFragment;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.store.margin.MarginRequirementDefinitionsStore;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.margin.experiments.MarginRatioIndicator;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.portfolio.pnl.ProfitAndLossAverageCostRetirementExperiment;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.VenturesRegionGate;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.OptionLevel3EntryPointSdpCardImpressionCountPref;
import com.robinhood.librobinhood.data.prefs.OptionLevel3EntryPointSdpCardLastSeenTimePref;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.librobinhood.data.store.AnalystOverviewStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.CollateralStore;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionEventStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.SimilarInstrumentStore;
import com.robinhood.librobinhood.data.store.SlipEligibilityStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.librobinhood.data.store.bonfire.AssetDetailEducationTourStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderEventStore;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsSectionStore;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedAssetElementStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.librobinhood.experiments.EquitiesCefLabels;
import com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase;
import com.robinhood.librobinhood.usecase.CheckOptionUpgradeToLevel3EligibilityUseCase3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AnalystOverview;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListRelatedIndustries;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.MarginRequirements;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.EquityTradingSeenStatus;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.models.p355ui.bonfire.UiStockDetail;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.data.store.iac.IacHeroCardStore;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.InstrumentRatings;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import com.robinhood.shared.equities.models.instrumentdetails.store.InstrumentRatingsStore;
import com.robinhood.shared.equities.models.store.TraderEarningStore;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTourResult;
import com.robinhood.shared.store.lists.store.CuratedListRelatedIndustriesStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.shareholderx.models.p401db.ShareholderEntryPointResponse;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsSection;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: InstrumentDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000ª\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\b\u0007\u0018\u0000 Ú\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002Ú\u0001B\u008f\u0003\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\b\b\u0001\u0010Q\u001a\u00020P\u0012\b\b\u0001\u0010S\u001a\u00020R\u0012\b\b\u0001\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010_\u001a\u00020^\u0012\u0006\u0010a\u001a\u00020`\u0012\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bd\u0010eJ*\u0010j\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020gj\u0002`h¢\u0006\u0002\bi0fH\u0002¢\u0006\u0004\bj\u0010kJ*\u0010l\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020gj\u0002`h¢\u0006\u0002\bi0fH\u0002¢\u0006\u0004\bl\u0010kJ#\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0o0f2\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bq\u0010rJ2\u0010u\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020gj\u0002`h¢\u0006\u0002\bi0f2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\bx\u0010yJÇ\u0001\u0010}\u001a~\u00128\u00126\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 |*\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010gj\u0004\u0018\u0001`h¢\u0006\u0002\bi0gj\u0002`h¢\u0006\u0002\bi |*>\u00128\u00126\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 |*\u001b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010gj\u0004\u0018\u0001`h¢\u0006\u0002\bi0gj\u0002`h¢\u0006\u0002\bi\u0018\u00010f0f\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000f2)\b\u0004\u0010{\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020gj\u0002`h¢\u0006\u0002\bi0gH\u0082\b¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020wH\u0016¢\u0006\u0004\b\u007f\u0010yJ\u0011\u0010\u0080\u0001\u001a\u00020wH\u0016¢\u0006\u0005\b\u0080\u0001\u0010yJ\u001a\u0010\u0083\u0001\u001a\u00020w2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J0\u0010\u008b\u0001\u001a\u00020w2\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008d\u0001\u001a\u00020w2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020w¢\u0006\u0005\b\u008f\u0001\u0010yJ\u000f\u0010\u0090\u0001\u001a\u00020w¢\u0006\u0005\b\u0090\u0001\u0010yJ\u001a\u0010\u0092\u0001\u001a\u00020w2\b\u0010\u0091\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0084\u0001J\u001a\u0010\u0093\u0001\u001a\u00020w2\b\u0010\u0091\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0084\u0001J\u000f\u0010\u0094\u0001\u001a\u00020w¢\u0006\u0005\b\u0094\u0001\u0010yJ<\u0010\u0096\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020gj\u0002`h¢\u0006\u0002\bi0f0\u0095\u00012\u0006\u0010n\u001a\u00020mH\u0007¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u009a\u0001\u001a\u00020w2\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020w¢\u0006\u0005\b\u009c\u0001\u0010yJ\u001a\u0010\u009f\u0001\u001a\u00020w2\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001a\u0010¢\u0001\u001a\u00020w2\b\u0010\u009e\u0001\u001a\u00030¡\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001a\u0010¥\u0001\u001a\u00020w2\b\u0010\u009e\u0001\u001a\u00030¤\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u000f\u0010§\u0001\u001a\u00020w¢\u0006\u0005\b§\u0001\u0010yR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010¨\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010©\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010ª\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010«\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010¬\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u00ad\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010®\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010¯\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010°\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010±\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010²\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010³\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010´\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010µ\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010¶\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010·\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010¸\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010¹\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010º\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010»\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010¼\u0001R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010½\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010¾\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010¿\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010À\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010Á\u0001R\u0015\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010Â\u0001R\u0015\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010Ã\u0001R\u0015\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010Ä\u0001R\u0015\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010Å\u0001R\u0015\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010Æ\u0001R\u0015\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010Ç\u0001R\u0015\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010È\u0001R\u0015\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010É\u0001R\u0015\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010Ê\u0001R\u0015\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010Ë\u0001R\u0015\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010Ì\u0001R\u0015\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010Í\u0001R\u0015\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010Î\u0001R\u0015\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010Ï\u0001R\u0015\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010Ð\u0001R\u0015\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010Ñ\u0001R\u0015\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010Ò\u0001R\u0015\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010Ó\u0001R\u0015\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b]\u0010Ô\u0001R\u0015\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b_\u0010Õ\u0001R\u0015\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010Ö\u0001R\u001d\u0010c\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bc\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001¨\u0006Û\u0001"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "balancesStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "infoBannerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/InstrumentRatingsStore;", "instrumentRatingsStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "fundamentalStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;", "newsFeedAssetElementStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/SimilarInstrumentStore;", "similarInstrumentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "stockDetailStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "earningStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;", "analystOverviewStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "marginSubscriptionStore", "Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;", "curatedListRelatedIndustriesStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AssetDetailEducationTourStore;", "assetDetailEducationTourStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventStore;", "shareholderEventStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsSectionStore;", "shareholderEventsSectionStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginRequirementDefinitionsStore;", "marginRequirementDefinitionsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "instrumentChartStore", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "slipEligibilityStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "assetDigestStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownDirectIpoOnboarding", "Lcom/robinhood/prefs/LongPreference;", "optionLevel3EntryPointCardLastSeenTimePref", "Lcom/robinhood/prefs/IntPreference;", "optionLevel3EntryPointCardImpressionCountPref", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "checkOptionUpgradeToLevel3EligibilityUseCase", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "iacHeroCardStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/shared/equities/models/instrumentdetails/store/InstrumentRatingsStore;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;Lcom/robinhood/librobinhood/data/store/CollateralStore;Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionEventStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/SimilarInstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;Lcom/robinhood/shared/equities/models/store/TraderEarningStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/AssetDetailEducationTourStore;Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventStore;Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsSectionStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/android/lib/store/margin/MarginRequirementDefinitionsStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/shared/store/user/UserStore;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;)V", "Lio/reactivex/Observable;", "Lkotlin/Function1;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailMutation;", "Lkotlin/ExtensionFunctionType;", "dbMutations", "()Lio/reactivex/Observable;", "networkMutations", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/shared/models/db/bonfire/education/tour/EducationTourResult;", "educationTourObs", "(Lcom/robinhood/models/db/Instrument;)Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Account;", "account", "accountMutations", "(Lcom/robinhood/models/db/Account;)Lio/reactivex/Observable;", "", "showIpoAccessOnboardingIfNecessary", "()V", "T", "mapper", "kotlin.jvm.PlatformType", "mapToMutation", "(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "onStart", "onResume", "", "span", "onDisplaySpanChanged", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Ljava/util/UUID;", "receiptUuid", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "action", "tapInfoBanner", "(Landroid/content/Context;Ljava/util/UUID;Lcom/robinhood/models/serverdriven/db/GenericAction;)V", "dismissInfoBanner", "(Ljava/util/UUID;)V", "onShowEducationTour", "onHideEducationTour", "trackingId", "setEducationTourEntryPointCardFirstShown", "setEducationTourEntryPointCardHidden", "incrementEducationTourEntryPointShownCount", "", "revampedSdpCardMutations", "(Lcom/robinhood/models/db/Instrument;)Ljava/util/List;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "sdpMode", "setSdpMode", "(Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;)V", "hideIacHeroCard", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "state", "onTradingTrendsSectionStateUpdated", "(Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;)V", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "onCompanyFinancialsSectionStateUpdated", "(Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;)V", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;", "onShortInterestSectionStateUpdated", "(Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;)V", "onOptionLevel3EntryPointCardSeen", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/InstrumentRatingsStore;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedAssetElementStore;", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/SimilarInstrumentStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "Lcom/robinhood/shared/store/lists/store/CuratedListRelatedIndustriesStore;", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/AssetDetailEducationTourStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderEventsSectionStore;", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "Lcom/robinhood/android/lib/store/margin/MarginRequirementDefinitionsStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/prefs/LongPreference;", "Lcom/robinhood/prefs/IntPreference;", "Lcom/robinhood/librobinhood/usecase/CheckOptionUpgradeToLevel3EligibilityUseCase;", "Lcom/robinhood/android/navigation/Navigator;", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "Lcom/robinhood/shared/store/user/UserStore;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailDuxo extends OldBaseDuxo<InstrumentDetailViewState> implements HasSavedState {
    public static final String KEY_IAC_HERO_CARD = "iacHeroCard";
    public static final String KEY_IAC_HERO_CARD_CONSUMED = "iacHeroCard-consumed";
    public static final String KEY_OPTION_L3_ENTRY_POINT_CARD_CONSUMED = "optionLevel3EntryPointCard-consumed";
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final AggregateOptionQuoteStore aggregateOptionQuoteStore;
    private final AnalystOverviewStore analystOverviewStore;
    private final AssetDetailEducationTourStore assetDetailEducationTourStore;
    private final AssetDigestStore assetDigestStore;
    private final BalancesStore balancesStore;
    private final CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase;
    private final Clock clock;
    private final CollateralStore collateralStore;
    private final CuratedListRelatedIndustriesStore curatedListRelatedIndustriesStore;
    private final CuratedListStore curatedListStore;
    private final TraderEarningStore earningStore;
    private final EquityTradingSeenStatusStore equityTradingSeenStatusStore;
    private final EtpDetailsStore etpDetailsStore;
    private final ExperimentsStore experimentsStore;
    private final FundamentalStore fundamentalStore;
    private final BooleanPreference hasShownDirectIpoOnboarding;
    private final IacHeroCardStore iacHeroCardStore;
    private final IacInfoBannerStore infoBannerStore;
    private final InstrumentAccountSwitcherStore instrumentAccountSwitcherStore;
    private final StockDetailHistoricalChartDataStore instrumentChartStore;
    private final InstrumentRatingsStore instrumentRatingsStore;
    private final TraderRecurringTradabilityStore instrumentRecurringTradabilityStore;
    private final InstrumentStore instrumentStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final MarginRequirementDefinitionsStore marginRequirementDefinitionsStore;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final Navigator navigator;
    private final NewsFeedAssetElementStore newsFeedAssetElementStore;
    private final OptionEventStore optionEventStore;
    private final IntPreference optionLevel3EntryPointCardImpressionCountPref;
    private final LongPreference optionLevel3EntryPointCardLastSeenTimePref;
    private final OrderStore orderStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final ShareholderEventStore shareholderEventStore;
    private final ShareholderEventsSectionStore shareholderEventsSectionStore;
    private final SimilarInstrumentStore similarInstrumentStore;
    private final SlipEligibilityStore slipEligibilityStore;
    private final StockDetailStore stockDetailStore;
    private final UnifiedAccountStore unifiedAccountStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailDuxo(AccountProvider accountProvider, BalancesStore balancesStore, IacInfoBannerStore infoBannerStore, InstrumentStore instrumentStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, InstrumentRatingsStore instrumentRatingsStore, TraderInvestmentScheduleStore investmentScheduleStore, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, CollateralStore collateralStore, EtpDetailsStore etpDetailsStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, FundamentalStore fundamentalStore, NewsFeedAssetElementStore newsFeedAssetElementStore, OrderStore orderStore, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionQuoteStore aggregateOptionQuoteStore, OptionEventStore optionEventStore, PositionStore positionStore, QuoteStore quoteStore, SimilarInstrumentStore similarInstrumentStore, StockDetailStore stockDetailStore, TraderEarningStore earningStore, ExperimentsStore experimentsStore, AnalystOverviewStore analystOverviewStore, MarginSubscriptionStore marginSubscriptionStore, CuratedListRelatedIndustriesStore curatedListRelatedIndustriesStore, CuratedListStore curatedListStore, UnifiedAccountStore unifiedAccountStore, AssetDetailEducationTourStore assetDetailEducationTourStore, ShareholderEventStore shareholderEventStore, ShareholderEventsSectionStore shareholderEventsSectionStore, LeveredMarginSettingsStore marginSettingsStore, MarginRequirementDefinitionsStore marginRequirementDefinitionsStore, StockDetailHistoricalChartDataStore instrumentChartStore, SlipEligibilityStore slipEligibilityStore, AssetDigestStore assetDigestStore, TraderMarketHoursManager marketHoursManager, RegionGateProvider regionGateProvider, @HasShownDirectIpoOnboarding BooleanPreference hasShownDirectIpoOnboarding, @OptionLevel3EntryPointSdpCardLastSeenTimePref LongPreference optionLevel3EntryPointCardLastSeenTimePref, @OptionLevel3EntryPointSdpCardImpressionCountPref IntPreference optionLevel3EntryPointCardImpressionCountPref, CheckOptionUpgradeToLevel3EligibilityUseCase checkOptionUpgradeToLevel3EligibilityUseCase, Navigator navigator, IacHeroCardStore iacHeroCardStore, AccountAccessStore accountAccessStore, UserStore userStore, Clock clock, SavedStateHandle savedStateHandle) {
        super(new InstrumentDetailViewState(null, null, false, null, null, false, ((InstrumentDetailFragment.InstrumentDetailArgs) INSTANCE.getArgs(savedStateHandle)).getInstrument(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -65, 16777215, null), null, 2, null);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(infoBannerStore, "infoBannerStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(instrumentRatingsStore, "instrumentRatingsStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
        Intrinsics.checkNotNullParameter(newsFeedAssetElementStore, "newsFeedAssetElementStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
        Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(similarInstrumentStore, "similarInstrumentStore");
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(earningStore, "earningStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(analystOverviewStore, "analystOverviewStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(curatedListRelatedIndustriesStore, "curatedListRelatedIndustriesStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(assetDetailEducationTourStore, "assetDetailEducationTourStore");
        Intrinsics.checkNotNullParameter(shareholderEventStore, "shareholderEventStore");
        Intrinsics.checkNotNullParameter(shareholderEventsSectionStore, "shareholderEventsSectionStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(marginRequirementDefinitionsStore, "marginRequirementDefinitionsStore");
        Intrinsics.checkNotNullParameter(instrumentChartStore, "instrumentChartStore");
        Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
        Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(hasShownDirectIpoOnboarding, "hasShownDirectIpoOnboarding");
        Intrinsics.checkNotNullParameter(optionLevel3EntryPointCardLastSeenTimePref, "optionLevel3EntryPointCardLastSeenTimePref");
        Intrinsics.checkNotNullParameter(optionLevel3EntryPointCardImpressionCountPref, "optionLevel3EntryPointCardImpressionCountPref");
        Intrinsics.checkNotNullParameter(checkOptionUpgradeToLevel3EligibilityUseCase, "checkOptionUpgradeToLevel3EligibilityUseCase");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.balancesStore = balancesStore;
        this.infoBannerStore = infoBannerStore;
        this.instrumentStore = instrumentStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.instrumentRatingsStore = instrumentRatingsStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.collateralStore = collateralStore;
        this.etpDetailsStore = etpDetailsStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.fundamentalStore = fundamentalStore;
        this.newsFeedAssetElementStore = newsFeedAssetElementStore;
        this.orderStore = orderStore;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.aggregateOptionQuoteStore = aggregateOptionQuoteStore;
        this.optionEventStore = optionEventStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.similarInstrumentStore = similarInstrumentStore;
        this.stockDetailStore = stockDetailStore;
        this.earningStore = earningStore;
        this.experimentsStore = experimentsStore;
        this.analystOverviewStore = analystOverviewStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.curatedListRelatedIndustriesStore = curatedListRelatedIndustriesStore;
        this.curatedListStore = curatedListStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.assetDetailEducationTourStore = assetDetailEducationTourStore;
        this.shareholderEventStore = shareholderEventStore;
        this.shareholderEventsSectionStore = shareholderEventsSectionStore;
        this.marginSettingsStore = marginSettingsStore;
        this.marginRequirementDefinitionsStore = marginRequirementDefinitionsStore;
        this.instrumentChartStore = instrumentChartStore;
        this.slipEligibilityStore = slipEligibilityStore;
        this.assetDigestStore = assetDigestStore;
        this.marketHoursManager = marketHoursManager;
        this.regionGateProvider = regionGateProvider;
        this.hasShownDirectIpoOnboarding = hasShownDirectIpoOnboarding;
        this.optionLevel3EntryPointCardLastSeenTimePref = optionLevel3EntryPointCardLastSeenTimePref;
        this.optionLevel3EntryPointCardImpressionCountPref = optionLevel3EntryPointCardImpressionCountPref;
        this.checkOptionUpgradeToLevel3EligibilityUseCase = checkOptionUpgradeToLevel3EligibilityUseCase;
        this.navigator = navigator;
        this.iacHeroCardStore = iacHeroCardStore;
        this.accountAccessStore = accountAccessStore;
        this.userStore = userStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
        Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> observableMergeWith = networkMutations().mergeWith(dbMutations());
        Intrinsics.checkNotNullExpressionValue(observableMergeWith, "mergeWith(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableMergeWith, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C153551(this));
        Observable observableSwitchMap = this.instrumentAccountSwitcherStore.streamActiveAccountNumber().switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Account>> apply(Optional<String> optional) {
                Observable<Account> observableStreamAccount;
                Observable<R> map;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                return (strComponent1 == null || (observableStreamAccount = InstrumentDetailDuxo.this.accountProvider.streamAccount(strComponent1)) == null || (map = observableStreamAccount.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.onStart.2.2
                    @Override // io.reactivex.functions.Function
                    public final Optional<Account> apply(Account it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(it);
                    }
                })) == null) ? Observable.just(Optional2.INSTANCE) : map;
            }
        }).distinctUntilChanged().switchMap(new C153573());
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C153584(this));
    }

    /* compiled from: InstrumentDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$onStart$1 */
    /* synthetic */ class C153551 extends FunctionReferenceImpl implements Function1<Function1<? super InstrumentDetailViewState, ? extends InstrumentDetailViewState>, Unit> {
        C153551(Object obj) {
            super(1, obj, InstrumentDetailDuxo.class, "applyMutation", "applyMutation(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function1<? super InstrumentDetailViewState, ? extends InstrumentDetailViewState> function1) {
            invoke2((Function1<? super InstrumentDetailViewState, InstrumentDetailViewState>) function1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Function1<? super InstrumentDetailViewState, InstrumentDetailViewState> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InstrumentDetailDuxo) this.receiver).applyMutation(p0);
        }
    }

    /* compiled from: InstrumentDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$onStart$3 */
    static final class C153573<T, R> implements Function {
        C153573() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends Function1<InstrumentDetailViewState, InstrumentDetailViewState>> apply(Optional<Account> optional) {
            Observable observableEmpty;
            Intrinsics.checkNotNullParameter(optional, "<destruct>");
            final Account accountComponent1 = optional.component1();
            InstrumentDetailDuxo.this.getSavedStateHandle().set(InstrumentDetailDuxo.KEY_OPTION_L3_ENTRY_POINT_CARD_CONSUMED, Boolean.FALSE);
            Observable observableJust = Observable.just(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$onStart$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailDuxo.C153573.apply$lambda$0(accountComponent1, (InstrumentDetailViewState) obj);
                }
            });
            if (accountComponent1 != null) {
                observableEmpty = InstrumentDetailDuxo.this.accountMutations(accountComponent1);
            } else {
                observableEmpty = Observable.empty();
            }
            return observableJust.mergeWith(observableEmpty);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstrumentDetailViewState apply$lambda$0(Account account, InstrumentDetailViewState just) {
            Intrinsics.checkNotNullParameter(just, "$this$just");
            return just.reset(account);
        }
    }

    /* compiled from: InstrumentDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$onStart$4 */
    /* synthetic */ class C153584 extends FunctionReferenceImpl implements Function1<Function1<? super InstrumentDetailViewState, ? extends InstrumentDetailViewState>, Unit> {
        C153584(Object obj) {
            super(1, obj, InstrumentDetailDuxo.class, "applyMutation", "applyMutation(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function1<? super InstrumentDetailViewState, ? extends InstrumentDetailViewState> function1) {
            invoke2((Function1<? super InstrumentDetailViewState, InstrumentDetailViewState>) function1);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Function1<? super InstrumentDetailViewState, InstrumentDetailViewState> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InstrumentDetailDuxo) this.receiver).applyMutation(p0);
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.newsFeedAssetElementStore.refresh(((InstrumentDetailFragment.InstrumentDetailArgs) INSTANCE.getArgs((HasSavedState) this)).getInstrument().getId(), false);
        showIpoAccessOnboardingIfNecessary();
    }

    public final void onDisplaySpanChanged(final String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.onDisplaySpanChanged$lambda$0(span, (InstrumentDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState onDisplaySpanChanged$lambda$0(String str, InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, str, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16776703, null);
    }

    public final void tapInfoBanner(Context context, UUID receiptUuid, GenericAction action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        if (action instanceof GenericAction.DeeplinkAction) {
            GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) action;
            Navigator.DefaultImpls.handleDeepLink$default(this.navigator, context, deeplinkAction.getUri(), null, null, false, null, 60, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.infoBannerStore.postTapped(receiptUuid, deeplinkAction.getUri().toString()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        }
    }

    public final void dismissInfoBanner(UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        LifecycleHost.DefaultImpls.bind$default(this, this.infoBannerStore.postDismissed(receiptUuid, IacDismissMethod.PASSIVE), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void onShowEducationTour() {
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.onShowEducationTour$lambda$1((InstrumentDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState onShowEducationTour$lambda$1(InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, true, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -5, 16777215, null);
    }

    public final void onHideEducationTour() {
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.onHideEducationTour$lambda$2((InstrumentDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState onHideEducationTour$lambda$2(InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -5, 16777215, null);
    }

    public final void setEducationTourEntryPointCardFirstShown(String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.assetDetailEducationTourStore.setEntryPointFirstShown(trackingId);
    }

    public final void setEducationTourEntryPointCardHidden(String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.assetDetailEducationTourStore.setEducationTourShouldHide(trackingId, true);
    }

    public final void incrementEducationTourEntryPointShownCount() {
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$incrementEducationTourEntryPointShownCount$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((InstrumentDetailViewState) it).getEducationTourTrackingId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C15333x4f7db255<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.incrementEducationTourEntryPointShownCount$lambda$4(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementEducationTourEntryPointShownCount$lambda$4(InstrumentDetailDuxo instrumentDetailDuxo, String str) {
        AssetDetailEducationTourStore assetDetailEducationTourStore = instrumentDetailDuxo.assetDetailEducationTourStore;
        Intrinsics.checkNotNull(str);
        assetDetailEducationTourStore.incrementEntryPointSeenCount(str);
        return Unit.INSTANCE;
    }

    private final Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> dbMutations() {
        ArrayList arrayList = new ArrayList();
        Companion companion = INSTANCE;
        final Instrument instrument = ((InstrumentDetailFragment.InstrumentDetailArgs) companion.getArgs((HasSavedState) this)).getInstrument();
        if (instrument.isIpoAccess()) {
            arrayList.add(ObservablesKt.connectWhen$default(this.stockDetailStore.stream(instrument.getId()), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, IpoAccessRegionGate.INSTANCE, false, 2, null), null, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$1<T, R>) obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    final UiStockDetail uiStockDetail = (UiStockDetail) it;
                    return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                            Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                            return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, uiStockDetail, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -33554433, 16777215, null);
                        }
                    };
                }
            }));
        }
        arrayList.add(FundamentalStore.streamFundamental$default(this.fundamentalStore, null, 1, null).asObservable(instrument.getId()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$2<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final Fundamental fundamental = (Fundamental) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, fundamental, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -257, 16777215, null);
                    }
                };
            }
        }));
        Observable map = ObservablesKt.connectWhen$default(asObservable(this.instrumentRecurringTradabilityStore.streamRecurringInstrumentTradable(instrument.getId())), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null), null, 2, null).map(new InstrumentDetailDuxoKt$sam$io_reactivex_functions_Function$0(new PropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.dbMutations.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((InstrumentRecurringTradability) obj).isRecurringTradable());
            }
        }));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        arrayList.add(map.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$3<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final Boolean bool = (Boolean) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        Boolean bool2 = bool;
                        Intrinsics.checkNotNull(bool2);
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bool2.booleanValue(), null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -16777217, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(this.earningStore.getEarnings(instrument.getId()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$4<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final UiEarnings uiEarnings = (UiEarnings) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$5$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, uiEarnings, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -131073, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(this.similarInstrumentStore.streamSimilarInstrumentIds(instrument.getId()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$5<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$6$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -524289, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{ProfitAndLossAverageCostRetirementExperiment.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$6<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$7$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, zBooleanValue, false, false, false, false, false, false, false, false, false, null, -1, 16769023, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$7<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$8$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, zBooleanValue, false, false, false, false, false, false, false, false, null, -1, 16760831, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{SdpV2Experiment.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$8<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$9$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, zBooleanValue, false, false, false, false, false, false, false, null, -1, 16744447, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{EquityEarningsSduiChart.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$9<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$10$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, zBooleanValue, false, false, false, false, false, false, null, -1, 16711679, null);
                    }
                };
            }
        }));
        arrayList.add(this.instrumentRatingsStore.stream(instrument.getId()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$10<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final InstrumentRatings instrumentRatings = (InstrumentRatings) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$11$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, instrumentRatings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -513, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(ObservablesKt.connectWhen$default(this.analystOverviewStore.streamAnalystOverview(instrument.getId()), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, GoldRegionGate.INSTANCE, false, 2, null), null, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$11
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$11<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final AnalystOverview analystOverview = (AnalystOverview) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$12$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, analystOverview, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1048577, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(this.marginSubscriptionStore.streamCurrentMarginSubscription().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$12
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$12<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final MarginSubscription marginSubscription = (MarginSubscription) ((Optional) it).component1();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$13$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, marginSubscription, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -3, 16777215, null);
                    }
                };
            }
        }));
        Observable observableSwitchMap = Observable.just(Boolean.valueOf(instrument.isEtpOrCef())).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.dbMutations.14
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.dbMutations.15
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends EtpDetails> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstrumentDetailDuxo.this.etpDetailsStore.getStreamEtpDetails().asObservable(instrument.getId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        arrayList.add(observableSwitchMap.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$13
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$13<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final EtpDetails etpDetails = (EtpDetails) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$16$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, etpDetails, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -134217729, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(StockDetailHistoricalChartDataStore.observeChartTypeWithFallback$default(this.instrumentChartStore, ((InstrumentDetailFragment.InstrumentDetailArgs) companion.getArgs((HasSavedState) this)).getInstrument(), null, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$14
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$14<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final SduiInstrumentChart sduiInstrumentChart = (SduiInstrumentChart) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$17$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, sduiInstrumentChart, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16776959, null);
                    }
                };
            }
        }));
        arrayList.add(this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$15
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$15<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final User user = (User) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$18$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, user.getOrigin().getLocality(), null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777207, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{MarginHubDiscoverabilityExperiment.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$16
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$16<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$19$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, zBooleanValue, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777087, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{GoldUngatingL2DataExperiment.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$17
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$17<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$20$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, zBooleanValue, false, false, false, false, false, null, -1, 16646143, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{EquitiesCefLabels.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$18
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$18<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$21$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, zBooleanValue, false, false, false, false, null, -1, 16515071, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.ReorderOptionsSectionOnSdp.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$19
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$19<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$22$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, zBooleanValue, null, -1, 12582911, null);
                    }
                };
            }
        }));
        arrayList.add(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, VenturesRegionGate.INSTANCE, false, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$20
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$dbMutations$$inlined$mapToMutation$20<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$dbMutations$23$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, zBooleanValue, false, null, -1, 14680063, null);
                    }
                };
            }
        }));
        Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> observableMerge = Observable.merge(arrayList);
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    private final Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> networkMutations() {
        Companion companion = INSTANCE;
        final Instrument instrument = ((InstrumentDetailFragment.InstrumentDetailArgs) companion.getArgs((HasSavedState) this)).getInstrument();
        this.instrumentStore.refresh(true, instrument.getId());
        this.instrumentRatingsStore.refresh(instrument.getId());
        TraderRecurringTradabilityStore.refresh$default(this.instrumentRecurringTradabilityStore, instrument.getId(), false, 2, null);
        this.earningStore.refresh(instrument.getId(), false);
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, revampedSdpCardMutations(instrument));
        Observable<List<NewsFeedElement>> observableSubscribeOn = this.newsFeedAssetElementStore.streamNewsFeedElements(instrument.getId()).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        arrayList.add(observableSubscribeOn.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$1<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, list, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -67108865, 16777215, null);
                    }
                };
            }
        }));
        if (Instrument4.isAllDayTradable(((InstrumentDetailFragment.InstrumentDetailArgs) companion.getArgs((HasSavedState) this)).getInstrument())) {
            Observable observable = this.equityTradingSeenStatusStore.hasSeenStatusForAdtInstrumentInfoSheet().observeOn(Schedulers.m3346io()).flatMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.2
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends Boolean> apply(Boolean hasSeen) {
                    Intrinsics.checkNotNullParameter(hasSeen, "hasSeen");
                    if (!hasSeen.booleanValue()) {
                        EquityTradingSeenStatusStore.refresh$default(InstrumentDetailDuxo.this.equityTradingSeenStatusStore, false, 1, null);
                    }
                    return InstrumentDetailDuxo.this.equityTradingSeenStatusStore.streamSeenStatus().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.2.1
                        @Override // io.reactivex.functions.Function
                        public final Boolean apply(EquityTradingSeenStatus it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Boolean.valueOf(it.getAdtInstrumentInfoSheetSeenOn() == null);
                        }
                    }).first(Boolean.FALSE);
                }
            }).toObservable();
            Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
            arrayList.add(observable.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$2<T, R>) obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    final Boolean bool = (Boolean) it;
                    final InstrumentDetailDuxo instrumentDetailDuxo = this.this$0;
                    return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                            Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                            if (bool.booleanValue()) {
                                return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, new UiEvent(((InstrumentDetailFragment.InstrumentDetailArgs) InstrumentDetailDuxo.INSTANCE.getArgs((HasSavedState) instrumentDetailDuxo)).getInstrument().getId()), null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -9, 16777215, null);
                            }
                            return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777215, null);
                        }
                    };
                }
            }));
        }
        Observable<Boolean> observableTake = this.marketHoursManager.streamIsAdtHours().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        arrayList.add(observableTake.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$3<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final Boolean bool = (Boolean) it;
                final Instrument instrument2 = instrument;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, (bool.booleanValue() && Instrument4.isAllDayTradable(instrument2)) ? new UiEvent(Unit.INSTANCE) : null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777199, null);
                    }
                };
            }
        }));
        Observable observableSwitchMap = asObservable(this.stockDetailStore.isPreIpo(instrument.getId())).switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<IpoQuote>> apply(Boolean isPreIpo) {
                Intrinsics.checkNotNullParameter(isPreIpo, "isPreIpo");
                if (isPreIpo.booleanValue()) {
                    return ObservablesKt.toOptionals(InstrumentDetailDuxo.this.quoteStore.getStreamIpoQuote().asObservable(instrument.getId()));
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        arrayList.add(observableSwitchMap.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$4<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final IpoQuote ipoQuote = (IpoQuote) ((Optional) it).component1();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$6$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, ipoQuote, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -262145, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(this.unifiedAccountStore.poll().toObservable());
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(false);
        arrayList.add(ObservablesKt.connectWhen$default(this.marginSubscriptionStore.streamCurrentMarginSubscription(), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, GoldRegionGate.INSTANCE, false, 2, null), null, 2, null).take(1L).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.7
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Optional<MarginSubscription> optional) {
                MarginSubscription3 plan;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                MarginSubscription marginSubscriptionComponent1 = optional.component1();
                return (marginSubscriptionComponent1 == null || (plan = marginSubscriptionComponent1.getPlan()) == null || !plan.is24Karat()) ? false : true;
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<MarginSubscription> optional) {
                InstrumentDetailDuxo.this.analystOverviewStore.refresh(instrument.getId());
            }
        }).ignoreElements().toObservable());
        this.curatedListRelatedIndustriesStore.refreshListItems(instrument.getId());
        Observable observableSubscribeOn2 = asObservable(this.curatedListRelatedIndustriesStore.streamCuratedListRelatedIndustries(instrument.getId())).switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.9
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CuratedList>> apply(CuratedListRelatedIndustries curatedListIndustries) {
                Intrinsics.checkNotNullParameter(curatedListIndustries, "curatedListIndustries");
                Set set = CollectionsKt.toSet(curatedListIndustries.getRelatedListIds());
                InstrumentDetailDuxo instrumentDetailDuxo = InstrumentDetailDuxo.this;
                return instrumentDetailDuxo.asObservable(instrumentDetailDuxo.curatedListStore.streamCuratedLists()).map(new AnonymousClass1(set));
            }

            /* compiled from: InstrumentDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$9$1, reason: invalid class name */
            static final class AnonymousClass1<T, R> implements Function {
                final /* synthetic */ Set<UUID> $set;

                AnonymousClass1(Set<UUID> set) {
                    this.$set = set;
                }

                @Override // io.reactivex.functions.Function
                public final List<CuratedList> apply(List<CuratedList> curatedLists) {
                    Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
                    Sequence sequenceAsSequence = CollectionsKt.asSequence(curatedLists);
                    final Set<UUID> set = this.$set;
                    return SequencesKt.toList(SequencesKt.filter(sequenceAsSequence, new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$9$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(InstrumentDetailDuxo.C153549.AnonymousClass1.apply$lambda$0(set, (CuratedList) obj));
                        }
                    }));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean apply$lambda$0(Set set, CuratedList curatedList) {
                    Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                    return set.contains(curatedList.getId());
                }
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn2, "subscribeOn(...)");
        arrayList.add(observableSubscribeOn2.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$5<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$10$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        List<CuratedList> list2 = list;
                        Intrinsics.checkNotNull(list2);
                        List<CuratedList> list3 = list2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        for (CuratedList curatedList : list3) {
                            arrayList2.add(new CuratedListChipItem(curatedList.getId(), curatedList.getDisplayName(), curatedList.getOwnerType(), curatedList.getCircleSizedUrlHolder(), null, Integer.valueOf(curatedList.getItemCount()), null, false, false, null, false, 2000, null));
                        }
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList2, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -2097153, 16777215, null);
                    }
                };
            }
        }));
        Observable observableFlatMap = Observable.just(instrument).flatMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.11
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ShareholderEntryPointResponse> apply(Instrument it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstrumentDetailDuxo.this.shareholderEventStore.getStreamEntryPointInfo().asObservable(it.getId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        arrayList.add(observableFlatMap.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$6<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final ShareholderEntryPointResponse shareholderEntryPointResponse = (ShareholderEntryPointResponse) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$12$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, shareholderEntryPointResponse, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -536870913, 16777215, null);
                    }
                };
            }
        }));
        Observable observableFlatMap2 = Observable.just(instrument).flatMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ShareholderEventsSection> apply(Instrument it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstrumentDetailDuxo.this.shareholderEventsSectionStore.getStreamEventsSection().asObservable(it.getId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap2, "flatMap(...)");
        arrayList.add(observableFlatMap2.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$7<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final ShareholderEventsSection shareholderEventsSection = (ShareholderEventsSection) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$14$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, shareholderEventsSection, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1073741825, 16777215, null);
                    }
                };
            }
        }));
        Observable observableFlatMap3 = ObservablesKt.filterIsPresent(ObservablesKt.connectWhen$default(this.instrumentAccountSwitcherStore.streamActiveAccountNumber(), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, LeveredMarginRegionGate.INSTANCE, false, 2, null), null, 2, null)).flatMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.networkMutations.15
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarginRequirements> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return InstrumentDetailDuxo.this.marginRequirementDefinitionsStore.streamMarginDefinitions(instrument.getId(), accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap3, "flatMap(...)");
        arrayList.add(observableFlatMap3.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$8<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final MarginRequirements marginRequirements = (MarginRequirements) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$16$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, marginRequirements, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777214, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, MarginRatioIndicator.INSTANCE, MarginRatioIndicator.Variant.INSTANCE.getDefault(), false, 4, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$networkMutations$$inlined$mapToMutation$9<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final MarginRatioIndicator.Variant variant = (MarginRatioIndicator.Variant) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$networkMutations$17$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, variant, -1, 8388607, null);
                    }
                };
            }
        }));
        Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> observableMerge = Observable.merge(arrayList);
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Optional<EducationTourResult>> educationTourObs(Instrument instrument) {
        this.assetDetailEducationTourStore.refreshEducationTour(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, instrument.getId().toString(), false);
        Observable<Optional<EducationTourResult>> observableShare = this.assetDetailEducationTourStore.streamEducationTour(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, instrument.getId().toString(), false).distinctUntilChanged().share();
        Observable observableDistinctUntilChanged = getStates().map(new InstrumentDetailDuxoKt$sam$io_reactivex_functions_Function$0(new PropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$educationTourObs$isShowingEducationTourObs$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((InstrumentDetailViewState) obj).isShowingEducationTour());
            }
        })).distinctUntilChanged();
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableShare);
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        Observable<Optional<EducationTourResult>> map = observables.combineLatest(observableShare, observableDistinctUntilChanged).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.educationTourObs.1
            @Override // io.reactivex.functions.Function
            public final Optional<EducationTourResult> apply(Tuples2<? extends Optional<EducationTourResult>, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<EducationTourResult> optionalComponent1 = tuples2.component1();
                Boolean boolComponent2 = tuples2.component2();
                EducationTourResult orNull = optionalComponent1.getOrNull();
                ComposeEducationTourManager.INSTANCE.updateShouldTrackElements(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, (orNull != null ? orNull.getTour() : null) != null || boolComponent2.booleanValue());
                return optionalComponent1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final List<Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>>> revampedSdpCardMutations(final Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Observable observableTake = RxFactory.DefaultImpls.rxSingle$default(this, null, new C15359x3929a986(this, instrument, null), 1, null).toObservable().switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$revampedSdpCardMutations$iacHeroCardMutation$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Optional<IacHeroCard>, Optional<EducationTourResult>>> apply(Optional<IacHeroCard> iacHeroCard) {
                Intrinsics.checkNotNullParameter(iacHeroCard, "iacHeroCard");
                IacHeroCard orNull = iacHeroCard.getOrNull();
                if (Intrinsics.areEqual(orNull != null ? Boolean.valueOf(orNull.isEducationTour()) : null, Boolean.TRUE)) {
                    Observables observables = Observables.INSTANCE;
                    Observable observableJust = Observable.just(iacHeroCard);
                    Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                    return observables.combineLatest(observableJust, this.this$0.educationTourObs(instrument));
                }
                Observables observables2 = Observables.INSTANCE;
                Observable observableJust2 = Observable.just(iacHeroCard);
                Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                Observable observableJust3 = Observable.just(Optional.INSTANCE.m2972of(null));
                Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
                return observables2.combineLatest(observableJust2, observableJust3);
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        return CollectionsKt.listOf(observableTake.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$revampedSdpCardMutations$$inlined$mapToMutation$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C15335xd76657f5<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Tuples2 tuples2 = (Tuples2) it;
                final Optional optional = (Optional) tuples2.component1();
                final Optional optional2 = (Optional) tuples2.component2();
                final InstrumentDetailDuxo instrumentDetailDuxo = this.this$0;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$revampedSdpCardMutations$iacHeroCardMutation$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        instrumentDetailDuxo.getSavedStateHandle().set(InstrumentDetailDuxo.KEY_IAC_HERO_CARD, optional.getOrNull());
                        IacHeroCard orNull = optional.getOrNull();
                        EducationTourResult orNull2 = optional2.getOrNull();
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, orNull2 != null ? orNull2.getTour() : null, null, null, false, null, false, null, null, null, orNull, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -268435457, 16777183, null);
                    }
                };
            }
        }));
    }

    public final void setSdpMode(final InstrumentDetailViewState.SdpMode sdpMode) {
        Intrinsics.checkNotNullParameter(sdpMode, "sdpMode");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.setSdpMode$lambda$35(sdpMode, (InstrumentDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState setSdpMode$lambda$35(InstrumentDetailViewState.SdpMode sdpMode, InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, sdpMode, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777151, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> accountMutations(Account account) {
        Observable observableEmpty;
        ArrayList arrayList = new ArrayList();
        final String accountNumber = account.getAccountNumber();
        Companion companion = INSTANCE;
        final UUID id = ((InstrumentDetailFragment.InstrumentDetailArgs) companion.getArgs((HasSavedState) this)).getInstrument().getId();
        arrayList.add(this.unifiedAccountStore.streamAccount(accountNumber).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$1<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) it).component1();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, unifiedAccountV2, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -4194305, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(PositionStore.getPositionForAccountOptional$default(this.positionStore, id, accountNumber, false, 4, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$2<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final Optional optional = (Optional) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, optional.getOrNull(), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -32769, 16777215, null);
                    }
                };
            }
        }));
        this.investmentScheduleStore.refreshAccount(false, accountNumber);
        arrayList.add(ObservablesKt.connectWhen$default(QueryKt.asObservable(this.investmentScheduleStore.getStreamInvestmentSchedulesByInstrumentIdAndAccountNumber(), id, accountNumber), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null), null, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$3<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -65537, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(asObservable(this.balancesStore.streamSelectedAccountUnifiedBalances(account)).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$4<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final UnifiedBalances unifiedBalances = (UnifiedBalances) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, unifiedBalances, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -129, 16777215, null);
                    }
                };
            }
        }));
        Observable observableSwitchMap = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{EquityOrdersStopPollAllPagesExperiment.INSTANCE}, false, null, 6, null).switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.accountMutations.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Order>> apply(Boolean enabled) {
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    return InstrumentDetailDuxo.this.orderStore.getOrdersByInstrument(id, accountNumber);
                }
                return InstrumentDetailDuxo.this.orderStore.streamOrderByInstrument(id, accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        arrayList.add(observableSwitchMap.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$5<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$6$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1025, 16777215, null);
                    }
                };
            }
        }));
        Observable<List<UiOptionEvent>> optionEventsByEquityInstrument = this.optionEventStore.getOptionEventsByEquityInstrument(accountNumber, id);
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        OptionsRegionGate optionsRegionGate = OptionsRegionGate.INSTANCE;
        arrayList.add(ObservablesKt.connectWhen$default(optionEventsByEquityInstrument, RegionGateProvider.DefaultImpls.streamRegionGateState$default(regionGateProvider, optionsRegionGate, false, 2, null), null, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$6<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$7$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -4097, 16777215, null);
                    }
                };
            }
        }));
        UUID tradableChainId = ((InstrumentDetailFragment.InstrumentDetailArgs) companion.getArgs((HasSavedState) this)).getInstrument().getTradableChainId();
        if (tradableChainId != null) {
            this.collateralStore.refreshChainCollateral(false, tradableChainId, accountNumber);
            observableEmpty = ObservablesKt.connectWhen$default(this.collateralStore.getOptionChainCollateral(accountNumber, tradableChainId), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, optionsRegionGate, false, 2, null), null, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$lambda$43$$inlined$mapToMutation$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C15330x2c66a0db<T, R>) obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    final OptionChainCollateral optionChainCollateral = (OptionChainCollateral) it;
                    return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$8$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                            Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                            return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, optionChainCollateral, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -2049, 16777215, null);
                        }
                    };
                }
            });
            if (observableEmpty == null) {
                observableEmpty = Observable.empty();
            }
        }
        arrayList.add(observableEmpty);
        Observable observableShare = ObservablesKt.connectWhen$default(this.aggregateOptionPositionStore.streamUiAggregateOptionPositionsByUnderlyingId(accountNumber, id), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, optionsRegionGate, false, 2, null), null, 2, null).share();
        Intrinsics.checkNotNull(observableShare);
        arrayList.add(observableShare.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$7<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$9$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -8193, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(asObservable(Operators.connectWhen$default(this.aggregateOptionQuoteStore.pollAndStreamMap(Context7.buffer$default(RxConvert.asFlow(observableShare), Integer.MAX_VALUE, null, 2, null)), RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.regionGateProvider, optionsRegionGate, false, 2, null), null, 2, null)).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$8<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final Map map = (Map) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$10$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, map, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -16385, 16777215, null);
                    }
                };
            }
        }));
        Observables observables = Observables.INSTANCE;
        Observable<R> map = this.optionLevel3EntryPointCardLastSeenTimePref.changes().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional((Long) ((Optional) it).getOrNull());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable map2 = observables.combineLatest(ObservablesKt.filterIsPresent(map), this.optionLevel3EntryPointCardImpressionCountPref.getChanges()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.accountMutations.12
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Tuples2<Long, Integer> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                long jLongValue = tuples2.component1().longValue();
                int iIntValue = tuples2.component2().intValue();
                boolean z = true;
                boolean z2 = jLongValue == 0;
                Boolean bool = (Boolean) InstrumentDetailDuxo.this.getSavedStateHandle().get(InstrumentDetailDuxo.KEY_OPTION_L3_ENTRY_POINT_CARD_CONSUMED);
                boolean z3 = Duration.between(Instant.ofEpochMilli(jLongValue), InstrumentDetailDuxo.this.clock.instant()).toDays() >= 90 || (bool != null ? bool.booleanValue() : false);
                if (iIntValue >= 2 || (!z2 && !z3)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable<T> observableAsObservable = asObservable(this.checkOptionUpgradeToLevel3EligibilityUseCase.invoke(accountNumber, CheckOptionUpgradeToLevel3EligibilityUseCase3.SDP));
        Observable observableJust = Observable.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        arrayList.add(ObservablesKt.connectWhen(map2, observableAsObservable, observableJust).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$9<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final Boolean bool = (Boolean) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$13$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        Boolean bool2 = bool;
                        Intrinsics.checkNotNull(bool2);
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, bool2.booleanValue(), false, false, false, null, -1, 16252927, null);
                    }
                };
            }
        }));
        arrayList.add(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsPortfolioRiskAnalyzer.INSTANCE}, false, null, 6, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$10<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$14$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, zBooleanValue, false, false, null, -1, 15728639, null);
                    }
                };
            }
        }));
        arrayList.add(asObservable(FlowKt.transformLatest(this.accountAccessStore.getFeatureAccess(account, AccountFeature.MARGIN), new InstrumentDetailDuxo$accountMutations$$inlined$flatMapLatest$1(null, this, accountNumber))).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$11
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$11<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$15$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, zBooleanValue, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, Integer.MAX_VALUE, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(IacInfoBannerStore.streamBatch$default(this.infoBannerStore, CollectionsKt.listOf((Object[]) new IacInfoBannerLocation[]{IacInfoBannerLocation.INFO_BANNER_STOCK_DETAIL_PAGE_MOBILE_TOP_LEVEL, IacInfoBannerLocation.INFO_BANNER_STOCK_DETAIL_PAGE_MOBILE_BELOW_CHART}), ((InstrumentDetailFragment.InstrumentDetailArgs) companion.getArgs((HasSavedState) this)).getInstrument().getId(), null, null, null, null, null, null, null, account.getAccountNumber(), null, 1532, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$12
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$12<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final List list = (List) it;
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$16$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -8388609, 16777215, null);
                    }
                };
            }
        }));
        arrayList.add(asObservable(this.accountAccessStore.getFeatureAccess(account, AccountFeature.RECURRING)).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$13
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$13<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$17$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, zBooleanValue, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777213, null);
                    }
                };
            }
        }));
        if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
            Observable observableOnErrorReturn = this.slipEligibilityStore.getSlipHubEnrollmentStatus().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.accountMutations.18
                @Override // io.reactivex.functions.Function
                public final Boolean apply(SlipEligibilityStore.SlipHubEnrollmentStatus enrollmentStatus) {
                    Intrinsics.checkNotNullParameter(enrollmentStatus, "enrollmentStatus");
                    return Boolean.valueOf(enrollmentStatus == SlipEligibilityStore.SlipHubEnrollmentStatus.NOT_ENROLLED);
                }
            }).toObservable().filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.accountMutations.19
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Boolean isSlipEligible) {
                    Intrinsics.checkNotNullParameter(isSlipEligible, "isSlipEligible");
                    return isSlipEligible.booleanValue();
                }
            }).onErrorReturn(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.accountMutations.20
                @Override // io.reactivex.functions.Function
                public final Boolean apply(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.FALSE;
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
            arrayList.add(ObservablesKt.connectWhen$default(observableOnErrorReturn, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, SlipRegionGate.INSTANCE, false, 2, null), null, 2, null).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$14
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$14<T, R>) obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    final Boolean bool = (Boolean) it;
                    return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$21$1
                        @Override // kotlin.jvm.functions.Function1
                        public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                            Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                            Boolean bool2 = bool;
                            Intrinsics.checkNotNull(bool2);
                            return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, bool2.booleanValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -33, 16777215, null);
                        }
                    };
                }
            }));
        }
        arrayList.add(asObservable(FlowKt.transformLatest(this.accountAccessStore.getFeatureAccess(account, AccountFeature.COPILOT_DIGESTS), new InstrumentDetailDuxo$accountMutations$$inlined$flatMapLatest$2(null, this, account, id))).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$15
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailDuxo$accountMutations$$inlined$mapToMutation$15<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final boolean zBooleanValue = ((Boolean) it).booleanValue();
                return new Function1<InstrumentDetailViewState, InstrumentDetailViewState>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$accountMutations$23$1
                    @Override // kotlin.jvm.functions.Function1
                    public final InstrumentDetailViewState invoke(InstrumentDetailViewState mapToMutation) {
                        Intrinsics.checkNotNullParameter(mapToMutation, "$this$mapToMutation");
                        return InstrumentDetailViewState.copy$default(mapToMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, Boolean.valueOf(zBooleanValue), null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777211, null);
                    }
                };
            }
        }));
        Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> observableMerge = Observable.merge(arrayList);
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    private final void showIpoAccessOnboardingIfNecessary() {
        if (!((InstrumentDetailFragment.InstrumentDetailArgs) INSTANCE.getArgs((HasSavedState) this)).getInstrument().isIpoAccessPreIpo() || this.hasShownDirectIpoOnboarding.get()) {
            return;
        }
        Observable observableSwitchMapSingle = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, IpoAccessRegionGate.INSTANCE, false, 2, null).take(1L).switchMapSingle(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.showIpoAccessOnboardingIfNecessary.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Boolean isEnabled) {
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                return Single.just(isEnabled).delay(isEnabled.booleanValue() ? 1L : 0L, TimeUnit.SECONDS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.showIpoAccessOnboardingIfNecessary$lambda$59(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showIpoAccessOnboardingIfNecessary$lambda$59(InstrumentDetailDuxo instrumentDetailDuxo, final Boolean bool) {
        instrumentDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.showIpoAccessOnboardingIfNecessary$lambda$59$lambda$58(bool, (InstrumentDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState showIpoAccessOnboardingIfNecessary$lambda$59$lambda$58(Boolean bool, InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, new UiEvent(bool), null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -2, 16777215, null);
    }

    private final <T> Observable<Function1<InstrumentDetailViewState, InstrumentDetailViewState>> mapToMutation(Observable<T> observable, final Function1<? super T, ? extends Function1<? super InstrumentDetailViewState, InstrumentDetailViewState>> function1) {
        return observable.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo.mapToMutation.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C153461<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Function1<InstrumentDetailViewState, InstrumentDetailViewState> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return function1.invoke(it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState hideIacHeroCard$lambda$60(InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16777183, null);
    }

    public final void hideIacHeroCard() {
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.hideIacHeroCard$lambda$60((InstrumentDetailViewState) obj);
            }
        });
        getSavedStateHandle().set(KEY_IAC_HERO_CARD_CONSUMED, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState onTradingTrendsSectionStateUpdated$lambda$61(TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, tradingTrendsChartSectionState3, null, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16776191, null);
    }

    public final void onTradingTrendsSectionStateUpdated(final TradingTrendsChartSectionState3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.onTradingTrendsSectionStateUpdated$lambda$61(state, (InstrumentDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState onCompanyFinancialsSectionStateUpdated$lambda$62(CompanyFinancialsSectionViewState companyFinancialsSectionViewState, InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, companyFinancialsSectionViewState, null, false, false, false, false, false, false, false, false, false, false, null, -1, 16775167, null);
    }

    public final void onCompanyFinancialsSectionStateUpdated(final CompanyFinancialsSectionViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.onCompanyFinancialsSectionStateUpdated$lambda$62(state, (InstrumentDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstrumentDetailViewState onShortInterestSectionStateUpdated$lambda$63(ShortInterestSectionViewState shortInterestSectionViewState, InstrumentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return InstrumentDetailViewState.copy$default(applyMutation, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, false, null, null, null, null, shortInterestSectionViewState, false, false, false, false, false, false, false, false, false, false, null, -1, 16773119, null);
    }

    public final void onShortInterestSectionStateUpdated(final ShortInterestSectionViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailDuxo.onShortInterestSectionStateUpdated$lambda$63(state, (InstrumentDetailViewState) obj);
            }
        });
    }

    public final void onOptionLevel3EntryPointCardSeen() {
        Boolean bool = (Boolean) getSavedStateHandle().get(KEY_OPTION_L3_ENTRY_POINT_CARD_CONSUMED);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        getSavedStateHandle().set(KEY_OPTION_L3_ENTRY_POINT_CARD_CONSUMED, Boolean.TRUE);
        this.optionLevel3EntryPointCardLastSeenTimePref.set(this.clock.instant().toEpochMilli());
        this.optionLevel3EntryPointCardImpressionCountPref.set(this.optionLevel3EntryPointCardImpressionCountPref.get() + 1);
    }

    /* compiled from: InstrumentDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailDuxo;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$InstrumentDetailArgs;", "<init>", "()V", "KEY_IAC_HERO_CARD", "", "KEY_IAC_HERO_CARD_CONSUMED", "KEY_OPTION_L3_ENTRY_POINT_CARD_CONSUMED", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InstrumentDetailDuxo, InstrumentDetailFragment.InstrumentDetailArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InstrumentDetailFragment.InstrumentDetailArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InstrumentDetailFragment.InstrumentDetailArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InstrumentDetailFragment.InstrumentDetailArgs getArgs(InstrumentDetailDuxo instrumentDetailDuxo) {
            return (InstrumentDetailFragment.InstrumentDetailArgs) DuxoCompanion.DefaultImpls.getArgs(this, instrumentDetailDuxo);
        }
    }
}
