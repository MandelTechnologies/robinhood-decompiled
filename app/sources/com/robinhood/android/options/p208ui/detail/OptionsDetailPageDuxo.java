package com.robinhood.android.options.p208ui.detail;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelper;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexHistoricals;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode2;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageDataCell2;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageDataState;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageDuxo;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageEvent;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageFragment;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.portfolio.pnl.ProfitAndLossAverageCostRetirementExperiment;
import com.robinhood.android.portfolio.pnl.prefs.ShowAverageCostRetirementTooltipPref;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.prefs.OptionsDetailPageIndexCurbHoursTooltipPref;
import com.robinhood.librobinhood.data.prefs.OptionsDetailPageShowAllHoursChartPref;
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
import com.robinhood.librobinhood.data.store.prefs.ShowCandlestickChartPref;
import com.robinhood.librobinhood.experiments.BidAskSdpStatsExperiment;
import com.robinhood.models.api.ApiLateCloseAnnouncementCardFlag;
import com.robinhood.models.api.ApiOptionPositionReturnRequest;
import com.robinhood.models.api.ApiOptionPositionReturnRequest3;
import com.robinhood.models.api.ApiOptionPositionReturnRequestLegacy;
import com.robinhood.models.api.ApiOptionPositionsFromIdsRequest;
import com.robinhood.models.api.ApiOptionStrategyBreakeven3;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequest;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequest3;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequestLegacy;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.api.OptionTooltipDisplayBehavior;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.LateCloseAnnouncementCardFlag;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p320db.simulatedreturns.OptionShouldShowSimulatedReturnsResponse;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiAggregateOptionPositionSimple;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionEvent;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.utils.logging.CrashReporter;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;

/* compiled from: OptionsDetailPageDuxo.kt */
@Metadata(m3635d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u0000 Ì\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002Ì\u0001BÙ\u0002\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\b\b\u0001\u0010K\u001a\u00020J\u0012\b\b\u0001\u0010L\u001a\u00020J\u0012\b\b\u0001\u0010M\u001a\u00020J\u0012\b\b\u0001\u0010N\u001a\u00020J\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020WH\u0002¢\u0006\u0004\bZ\u0010YJ\u000f\u0010[\u001a\u00020WH\u0002¢\u0006\u0004\b[\u0010YJ\u000f\u0010\\\u001a\u00020WH\u0002¢\u0006\u0004\b\\\u0010YJ\u001b\u0010`\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010^*\u00020]H\u0002¢\u0006\u0004\b`\u0010aJ+\u0010f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020e0d0c0^*\u00020bH\u0002¢\u0006\u0004\bf\u0010gJ3\u0010i\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020e0d0c0^*\u00020b2\u0006\u0010h\u001a\u00020_H\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020WH\u0002¢\u0006\u0004\bk\u0010YJ\u0017\u0010n\u001a\u00020W2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020W2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bp\u0010oJ\u000f\u0010q\u001a\u00020WH\u0016¢\u0006\u0004\bq\u0010YJ\u0015\u0010s\u001a\u00020W2\u0006\u0010r\u001a\u00020e¢\u0006\u0004\bs\u0010tJ/\u0010{\u001a\u00020W2\u0006\u0010v\u001a\u00020u2\u0006\u0010x\u001a\u00020w2\u0006\u0010r\u001a\u00020e2\b\u0010z\u001a\u0004\u0018\u00010y¢\u0006\u0004\b{\u0010|J\u0015\u0010}\u001a\u00020W2\u0006\u0010r\u001a\u00020e¢\u0006\u0004\b}\u0010tJ\u000f\u0010~\u001a\u00020WH\u0016¢\u0006\u0004\b~\u0010YJ\u000f\u0010\u007f\u001a\u00020WH\u0016¢\u0006\u0004\b\u007f\u0010YJ\u001a\u0010\u0082\u0001\u001a\u00020W2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0085\u0001\u001a\u00020W2\b\u0010\u0084\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0083\u0001J\u001a\u0010\u0087\u0001\u001a\u00020W2\b\u0010\u0086\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0083\u0001J\u001a\u0010\u008a\u0001\u001a\u00020W2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001a\u0010\u008e\u0001\u001a\u00020W2\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0092\u0001\u001a\u00020W2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u000f\u0010\u0094\u0001\u001a\u00020W¢\u0006\u0005\b\u0094\u0001\u0010YJ\u0018\u0010\u0096\u0001\u001a\u00020W2\u0007\u0010\u0095\u0001\u001a\u00020e¢\u0006\u0005\b\u0096\u0001\u0010tJ\u001a\u0010\u0098\u0001\u001a\u00020W2\b\u0010\u0097\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0093\u0001J\u001a\u0010\u009b\u0001\u001a\u00020W2\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020W¢\u0006\u0005\b\u009d\u0001\u0010YJ\u001a\u0010 \u0001\u001a\u00020W2\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001¢\u0006\u0006\b \u0001\u0010¡\u0001J\u000f\u0010¢\u0001\u001a\u00020W¢\u0006\u0005\b¢\u0001\u0010YJ\u0019\u0010¤\u0001\u001a\u00020W2\u0007\u0010£\u0001\u001a\u00020_¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¦\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010§\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¨\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010©\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ª\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010«\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010¬\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u00ad\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010®\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010¯\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010°\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010±\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010²\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010³\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010´\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010µ\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010¶\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010·\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010¸\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010¹\u0001R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010º\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010»\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010¼\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010½\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010¾\u0001R\u0015\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010¿\u0001R\u0015\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010À\u0001R\u0015\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010Á\u0001R\u0015\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010Â\u0001R\u0015\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010Ã\u0001R\u0015\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010Ä\u0001R\u0015\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010Å\u0001R\u0015\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010Æ\u0001R\u0015\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010Ç\u0001R\u0015\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bK\u0010È\u0001R\u0015\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010È\u0001R\u0015\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010È\u0001R\u0015\u0010N\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010È\u0001R\u001d\u0010T\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bT\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001¨\u0006Í\u0001"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageViewState;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "brokerageResourceManager", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "comboOrderStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "iacCrossSellLaunchManager", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "infoBannerStore", "Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;", "lateCloseStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lio/noties/markwon/Markwon;", "markwon", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "optionHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "optionStrategyDetailStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "quoteHistoricalStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "pipSupportStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/BooleanPreference;", "showCandlestickChartPref", "showAllHoursChartPref", "showAverageCostRetirementTooltipPrefs", "optionsDetailPageIndexCurbHoursTooltipPref", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;Lj$/time/Clock;Lcom/robinhood/android/store/options/combo/ComboOrderStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lio/noties/markwon/Markwon;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionEventStore;Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionRollingStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "initializeAccountNumber", "()V", "initializeStrategyCodes", "initializeIsLegContext", "initializeExperiment", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;", "Lio/reactivex/Observable;", "", "getAccountNumberFromInitialIdObs", "(Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;)Lio/reactivex/Observable;", "Lcom/robinhood/android/options/contracts/HasInitialPositionId;", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "streamStrategyCodeToPositionIds", "(Lcom/robinhood/android/options/contracts/HasInitialPositionId;)Lio/reactivex/Observable;", "accountNumber", "streamStrategyCodeToPositionIdsByAccountNumber", "(Lcom/robinhood/android/options/contracts/HasInitialPositionId;Ljava/lang/String;)Lio/reactivex/Observable;", "onUpsellDismissed", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "state", "logAppear", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;)V", "logDisappear", "onCreate", "receiptUuid", "markInfoBannerSeen", "(Ljava/util/UUID;)V", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroid/content/Context;", "context", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "action", "tapInfoBanner", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Ljava/util/UUID;Lcom/robinhood/models/serverdriven/db/GenericAction;)V", "dismissInfoBanner", "onStart", "onStop", "", "isDay", "updateDayNightOverlay", "(Z)V", "showCandlestick", "onCandlestickSwitchClicked", "showAllHours", "onShowAllHoursToggled", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "tooltip", "recordSeenTooltip", "(Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;)V", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "displaySpan", "onSpanChanged", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)V", "", "newIndex", "onCurrentPageUpdated", "(I)V", "onLateCloseUpsellTapped", "chainId", "onLateCloseUpsellDismissed", "newHeight", "onTradebarHeightUpdated", "Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "tooltipState", "onSimulatedReturnTooltipFirstAppear", "(Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;)V", "onSimulatedReturnTooltipClicked", "Lcom/robinhood/android/options/ui/detail/OptionRow;", "optionRow", "onOptionHistoryRowClicked", "(Lcom/robinhood/android/options/ui/detail/OptionRow;)V", "logLateCloseInfoClicked", "sectionIdentifier", "logSectionAppear", "(Ljava/lang/String;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "Lj$/time/Clock;", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "Lcom/robinhood/android/indexes/store/IndexStore;", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "Lcom/robinhood/librobinhood/data/store/OptionLateCloseStore;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Lio/noties/markwon/Markwon;", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalChartStore;", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/prefs/BooleanPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsDetailPageDuxo extends BaseDuxo3<OptionsDetailPageDataState, OptionsDetailPageViewState, OptionsDetailPageEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private final BrokerageResourceManager brokerageResourceManager;
    private final Clock clock;
    private final ComboOrderStore comboOrderStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final CrossSellLaunchManager iacCrossSellLaunchManager;
    private final IndexStore indexStore;
    private final IacInfoBannerStore infoBannerStore;
    private final OptionLateCloseStore lateCloseStore;
    private final MarketHoursStore marketHoursStore;
    private final Markwon markwon;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionChainStore optionChainStore;
    private final OptionEventStore optionEventStore;
    private final OptionHistoricalChartStore optionHistoricalChartStore;
    private final OptionOrderStore optionOrderStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionRollingStore optionRollingStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSimulatedReturnsStore optionSimulatedReturnsStore;
    private final OptionStrategyDetailStore optionStrategyDetailStore;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final OptionTooltipStore optionTooltipStore;
    private final BooleanPreference optionsDetailPageIndexCurbHoursTooltipPref;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final PictureInPictureStore pipSupportStore;
    private final QuoteHistoricalStore quoteHistoricalStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final BooleanPreference showAllHoursChartPref;
    private final BooleanPreference showAverageCostRetirementTooltipPrefs;
    private final BooleanPreference showCandlestickChartPref;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsDetailPageDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore, BrokerageResourceManager brokerageResourceManager, Clock clock, ComboOrderStore comboOrderStore, EventLogger eventLogger, ExperimentsStore experimentsStore, CrossSellLaunchManager iacCrossSellLaunchManager, IndexStore indexStore, IacInfoBannerStore infoBannerStore, OptionLateCloseStore lateCloseStore, MarketHoursStore marketHoursStore, Markwon markwon, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainStore optionChainStore, OptionEventStore optionEventStore, OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, OptionHistoricalChartStore optionHistoricalChartStore, OptionOrderStore optionOrderStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionRollingStore optionRollingStore, OptionSettingsStore optionSettingsStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionStrategyDetailStore optionStrategyDetailStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionTooltipStore optionTooltipStore, OptionsWatchlistStore optionsWatchlistStore, QuoteStore quoteStore, UserStore userStore, QuoteHistoricalStore quoteHistoricalStore, PictureInPictureStore pipSupportStore, RegionGateProvider regionGateProvider, @ShowCandlestickChartPref BooleanPreference showCandlestickChartPref, @OptionsDetailPageShowAllHoursChartPref BooleanPreference showAllHoursChartPref, @ShowAverageCostRetirementTooltipPref BooleanPreference showAverageCostRetirementTooltipPrefs, @OptionsDetailPageIndexCurbHoursTooltipPref BooleanPreference optionsDetailPageIndexCurbHoursTooltipPref, OptionsDetailPageStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionsDetailPageDataState(null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554431, null), stateProvider, duxoBundle);
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
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        initializeAccountNumber();
        initializeStrategyCodes();
        initializeIsLegContext();
        initializeExperiment();
        LifecycleHost.DefaultImpls.bind$default(this, this.showCandlestickChartPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageDuxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C239112(null));
        final StateFlow<OptionsDetailPageViewState> stateFlow = getStateFlow();
        final Flow<List<? extends String>> flow = new Flow<List<? extends String>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C238282(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$map$1$2 */
            public static final class C238282<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C238282.this.emit(null, this);
                    }
                }

                public C238282(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List<String> strategyCodeList = ((OptionsDetailPageViewState) obj).getStrategyCodeList();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(strategyCodeList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(FlowKt.take(new Flow<List<? extends String>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends String>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C238252(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$1$2 */
            public static final class C238252<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C238252.this.emit(null, this);
                    }
                }

                public C238252(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageDuxo.onCreate$lambda$3(this.f$0, (List) obj);
            }
        });
        final boolean zIsLegContext = OptionsDetailPageDuxoKt.isLegContext((OptionsDetailPageFragment.Args) INSTANCE.getArgs((HasSavedState) this));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C239446(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageDuxo.onCreate$lambda$4(this.f$0, (User) obj);
            }
        });
        final StateFlow<OptionsDetailPageViewState> stateFlow2 = getStateFlow();
        Flow<Tuples2<? extends String, ? extends Integer>> flow2 = new Flow<Tuples2<? extends String, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C238292(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$1$2 */
            public static final class C238292<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C238292.this.emit(null, this);
                    }
                }

                public C238292(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Tuples2 tuples2Indexed = OptionsDetailPageViewState3.indexed((OptionsDetailPageViewState) obj, OptionsDetailPageDuxo$onCreate$strategyCodeToIndexFlow$1$1.INSTANCE);
                        if (tuples2Indexed != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2Indexed, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        final Flow<Tuples2<UiOptionStrategyInfo, Integer>> uiStrategyInfoToIndexFlow = OptionsDetailPageDuxoHelper.getUiStrategyInfoToIndexFlow(flow2, this.optionStrategyInfoStore);
        Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> uiOptionUnderlierToIndexFlow = OptionsDetailPageDuxoHelper.getUiOptionUnderlierToIndexFlow(uiStrategyInfoToIndexFlow, this.optionChainStore);
        final StateFlow<OptionsDetailPageViewState> stateFlow3 = getStateFlow();
        Flow<Tuples2<? extends DisplaySpan, ? extends Integer>> flow3 = new Flow<Tuples2<? extends DisplaySpan, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends DisplaySpan, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow3.collect(new C238302(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$2$2 */
            public static final class C238302<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$2$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {58}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C238302.this.emit(null, this);
                    }
                }

                public C238302(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Tuples2 tuples2Indexed = OptionsDetailPageViewState3.indexed((OptionsDetailPageViewState) obj, OptionsDetailPageDuxo$onCreate$activeDisplaySpanFlow$1$1.INSTANCE);
                        if (tuples2Indexed != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2Indexed, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        Flow<Tuples2<Tuples2<Optional<UiOptionUnderlier>, Integer>, Tuples2<DisplaySpan, Integer>>> optionUnderlierWithActiveSpanFlow = OptionsDetailPageDuxoHelper.getOptionUnderlierWithActiveSpanFlow(uiOptionUnderlierToIndexFlow, flow3);
        Flow<Tuples2<Tuples2<OptionUnderlying, Integer>, Tuples2<DisplaySpan, Integer>>> optionUnderlyingWithActiveSpanFlow = OptionsDetailPageDuxoHelper.getOptionUnderlyingWithActiveSpanFlow(uiStrategyInfoToIndexFlow, flow3);
        Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>> flow4 = new Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = uiStrategyInfoToIndexFlow.collect(new C238262(flowCollector, zIsLegContext), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$2$2 */
            public static final class C238262<T> implements FlowCollector {
                final /* synthetic */ boolean $isLegContext$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$2$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C238262.this.emit(null, this);
                    }
                }

                public C238262(FlowCollector flowCollector, boolean z) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$isLegContext$inlined = z;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (!((UiOptionStrategyInfo) ((Tuples2) obj).getFirst()).isSingleLeg() || !this.$isLegContext$inlined) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        final StateFlow<OptionsDetailPageViewState> stateFlow4 = getStateFlow();
        Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> uiAggregateOptionPositionToIndexFlow = OptionsDetailPageDuxoHelper.getUiAggregateOptionPositionToIndexFlow(flow4, new Flow<Tuples2<? extends Tuples2<? extends String, ? extends String>, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Tuples2<? extends Tuples2<? extends String, ? extends String>, ? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow4.collect(new C238312(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3$2 */
            public static final class C238312<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C238312.this.emit(null, this);
                    }
                }

                public C238312(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        final OptionsDetailPageViewState optionsDetailPageViewState = (OptionsDetailPageViewState) obj;
                        Tuples2 tuples2Indexed = OptionsDetailPageViewState3.indexed(optionsDetailPageViewState, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003d: INVOKE (r5v2 'tuples2Indexed' kotlin.Pair) = 
                              (r5v1 'optionsDetailPageViewState' com.robinhood.android.options.ui.detail.OptionsDetailPageViewState)
                              (wrap:kotlin.jvm.functions.Function1<com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>:0x003a: CONSTRUCTOR (r5v1 'optionsDetailPageViewState' com.robinhood.android.options.ui.detail.OptionsDetailPageViewState A[DONT_INLINE]) A[MD:(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState):void (m), WRAPPED] (LINE:51) call: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$uiAggregateOptionPositionFlow$2$1.<init>(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState):void type: CONSTRUCTOR)
                             STATIC call: com.robinhood.android.options.ui.detail.OptionsDetailPageViewStateKt.indexed(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, kotlin.jvm.functions.Function1):kotlin.Pair A[DECLARE_VAR, MD:<T>:(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, kotlin.jvm.functions.Function1<? super com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, ? extends T>):kotlin.Pair<T, java.lang.Integer> (m)] (LINE:51) in method: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes11.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$uiAggregateOptionPositionFlow$2$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            boolean r0 = r6 instanceof com.robinhood.android.options.p208ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3.C238312.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3$2$1 r0 = (com.robinhood.android.options.p208ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3.C238312.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3$2$1 r0 = new com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.ResultKt.throwOnFailure(r6)
                            goto L4c
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.ResultKt.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            com.robinhood.android.options.ui.detail.OptionsDetailPageViewState r5 = (com.robinhood.android.options.p208ui.detail.OptionsDetailPageViewState) r5
                            com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$uiAggregateOptionPositionFlow$2$1 r2 = new com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$uiAggregateOptionPositionFlow$2$1
                            r2.<init>(r5)
                            kotlin.Pair r5 = com.robinhood.android.options.p208ui.detail.OptionsDetailPageViewState3.indexed(r5, r2)
                            if (r5 == 0) goto L4c
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4c
                            return r1
                        L4c:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.options.p208ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$3.C238312.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }
            }, this.aggregateOptionPositionStore);
            Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>> flow5 = new Flow<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$3
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>> flowCollector, Continuation continuation) {
                    Object objCollect = uiStrategyInfoToIndexFlow.collect(new C238272(flowCollector, zIsLegContext), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$3$2 */
                public static final class C238272<T> implements FlowCollector {
                    final /* synthetic */ boolean $isLegContext$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$3$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$filter$3$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C238272.this.emit(null, this);
                        }
                    }

                    public C238272(FlowCollector flowCollector, boolean z) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$isLegContext$inlined = z;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (((UiOptionStrategyInfo) ((Tuples2) obj).getFirst()).isSingleLeg() && this.$isLegContext$inlined) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            final StateFlow<OptionsDetailPageViewState> stateFlow5 = getStateFlow();
            Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> uiOptionInstrumentPositionToIndexFlow = OptionsDetailPageDuxoHelper.getUiOptionInstrumentPositionToIndexFlow(flow5, new Flow<String>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$4
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow5.collect(new C238322(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$4$2 */
                public static final class C238322<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$4$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$4$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C238322.this.emit(null, this);
                        }
                    }

                    public C238322(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            String currentAccountNumber = ((OptionsDetailPageViewState) obj).getCurrentAccountNumber();
                            if (currentAccountNumber != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(currentAccountNumber, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, this.optionPositionStore);
            final StateFlow<OptionsDetailPageViewState> stateFlow6 = getStateFlow();
            Flow<Tuples2<? extends Boolean, ? extends Integer>> flow6 = new Flow<Tuples2<? extends Boolean, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$5
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends Boolean, ? extends Integer>> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow6.collect(new C238332(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$5$2 */
                public static final class C238332<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$5$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$5$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C238332.this.emit(null, this);
                        }
                    }

                    public C238332(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Tuples2 tuples2Indexed = OptionsDetailPageViewState3.indexed((OptionsDetailPageViewState) obj, C23947x982b6050.INSTANCE);
                            if (tuples2Indexed != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2Indexed, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            final StateFlow<OptionsDetailPageViewState> stateFlow7 = getStateFlow();
            Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> curatedListItemToUiStrategyInfoToIndexFlow = OptionsDetailPageDuxoHelper.getCuratedListItemToUiStrategyInfoToIndexFlow(flow6, uiStrategyInfoToIndexFlow, new Flow<Tuples2<? extends Account, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$6
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends Account, ? extends Integer>> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow7.collect(new C238342(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$6$2 */
                public static final class C238342<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$6$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$$inlined$mapNotNull$6$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C238342.this.emit(null, this);
                        }
                    }

                    public C238342(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Tuples2 tuples2Indexed = OptionsDetailPageViewState3.indexed((OptionsDetailPageViewState) obj, C23948x982b6411.INSTANCE);
                            if (tuples2Indexed != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2Indexed, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, this.optionsWatchlistStore);
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C239458(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C239469(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390110(FlowKt.transformLatest(uiStrategyInfoToIndexFlow, new OptionsDetailPageDuxo$onCreate$$inlined$flatMapLatest$1(null, this)), this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390211(uiOptionUnderlierToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390312(uiAggregateOptionPositionToIndexFlow, uiOptionInstrumentPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390413(flow2, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390514(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390615(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390716(uiOptionUnderlierToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390817(uiOptionUnderlierToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2390918(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391019(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391220(optionUnderlierWithActiveSpanFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391321(optionUnderlierWithActiveSpanFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391422(optionUnderlyingWithActiveSpanFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391523(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391624(curatedListItemToUiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391725(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391826(curatedListItemToUiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2391927(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392128(uiAggregateOptionPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392229(uiAggregateOptionPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392330(uiAggregateOptionPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392431(uiAggregateOptionPositionToIndexFlow, uiOptionUnderlierToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392532(uiOptionInstrumentPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392633(uiOptionInstrumentPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392734(uiOptionInstrumentPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392835(uiOptionInstrumentPositionToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2392936(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393037(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393138(curatedListItemToUiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393239(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393340(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393441(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393542(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393643(flow2, this, null));
            getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C2393744(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393845(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2393946(null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2394047(uiStrategyInfoToIndexFlow, this, null));
            getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2394148(null));
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C2394249(null));
            applyMutation(new C2394350(null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCreate$lambda$0(OptionsDetailPageDuxo optionsDetailPageDuxo, boolean z) {
            optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$onCreate$1$1(z, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$2 */
        static final class C239112 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C239112(Continuation<? super C239112> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionsDetailPageDuxo.this.new C239112(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C239112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(OptionsDetailPageDuxo.this.showAllHoursChartPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsDetailPageDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showAllHoursChart", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$2$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503631 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ boolean $showAllHoursChart;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503631(boolean z, Continuation<? super C503631> continuation) {
                        super(2, continuation);
                        this.$showAllHoursChart = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503631 c503631 = new C503631(this.$showAllHoursChart, continuation);
                        c503631.L$0 = obj;
                        return c503631;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503631) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, this.$showAllHoursChart, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33553407, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503631(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCreate$lambda$3(OptionsDetailPageDuxo optionsDetailPageDuxo, List strategyCodes) {
            Intrinsics.checkNotNullParameter(strategyCodes, "strategyCodes");
            OptionStrategyInfoStore.refresh$default(optionsDetailPageDuxo.optionStrategyInfoStore, strategyCodes, false, 2, null);
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$6", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$6 */
        static final class C239446 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C239446(Continuation<? super C239446> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionsDetailPageDuxo.this.new C239446(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C239446) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Observable<String> observableStreamActiveAccountNumber = OptionsDetailPageDuxo.this.optionAccountSwitcherStore.streamActiveAccountNumber();
                    final OptionsDetailPageDuxo optionsDetailPageDuxo = OptionsDetailPageDuxo.this;
                    ObservableSource observableSourceSwitchMap = observableStreamActiveAccountNumber.switchMap(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.onCreate.6.1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Account> apply(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return optionsDetailPageDuxo.accountProvider.streamAccount(it);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap, "switchMap(...)");
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableSourceSwitchMap), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$6$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$6$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$6$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ Account $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, this.$it, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554427, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCreate$lambda$4(OptionsDetailPageDuxo optionsDetailPageDuxo, User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$onCreate$7$1(user, null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8 */
        static final class C239458 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C239458(Continuation<? super C239458> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionsDetailPageDuxo.this.new C239458(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C239458) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Integer currentPage = ((OptionsDetailPageViewState) obj).getCurrentPage();
                                    if (currentPage != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(currentPage, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Integer, Continuation<? super Unit>, Object> {
                /* synthetic */ int I$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.I$0 = ((Number) obj).intValue();
                    return anonymousClass2;
                }

                public final Object invoke(int i, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                    return invoke(num.intValue(), continuation);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$8$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ int $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((OptionsDetailPageDataState) this.L$0).recycle(this.$it);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1(this.I$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$9", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {300}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$9 */
        static final class C239469 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C239469(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C239469> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C239469(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C239469) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow = this.$strategyInfoFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$9$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiOptionStrategyInfo, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UiOptionStrategyInfo, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<UiOptionStrategyInfo, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<UiOptionStrategyInfo, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$9$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503721 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4801$i;
                    final /* synthetic */ UiOptionStrategyInfo $uiStrategyInfo;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503721(int i, UiOptionStrategyInfo uiOptionStrategyInfo, Continuation<? super C503721> continuation) {
                        super(2, continuation);
                        this.f4801$i = i;
                        this.$uiStrategyInfo = uiOptionStrategyInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503721 c503721 = new C503721(this.f4801$i, this.$uiStrategyInfo, continuation);
                        c503721.L$0 = obj;
                        return c503721;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503721) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4801$i;
                        final UiOptionStrategyInfo uiOptionStrategyInfo = this.$uiStrategyInfo;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$9$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C239469.AnonymousClass1.C503721.invokeSuspend$lambda$0(uiOptionStrategyInfo, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(UiOptionStrategyInfo uiOptionStrategyInfo, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, uiOptionStrategyInfo, null, null, null, -268435457, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples2.component1();
                        this.this$0.applyMutation(new C503721(((Number) tuples2.component2()).intValue(), uiOptionStrategyInfo, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$10", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$10 */
        static final class C2390110 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionChain, Integer>> $uiOptionChainToIndexFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2390110(Flow<Tuples2<UiOptionChain, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390110> continuation) {
                super(2, continuation);
                this.$uiOptionChainToIndexFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390110(this.$uiOptionChainToIndexFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390110) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<UiOptionChain, Integer>> flow = this.$uiOptionChainToIndexFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiOptionChain;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$10$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiOptionChain, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UiOptionChain, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<UiOptionChain, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<UiOptionChain, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$10$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503561 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4768$i;
                    final /* synthetic */ UiOptionChain $uiOptionChain;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503561(int i, UiOptionChain uiOptionChain, Continuation<? super C503561> continuation) {
                        super(2, continuation);
                        this.f4768$i = i;
                        this.$uiOptionChain = uiOptionChain;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503561 c503561 = new C503561(this.f4768$i, this.$uiOptionChain, continuation);
                        c503561.L$0 = obj;
                        return c503561;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503561) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4768$i;
                        final UiOptionChain uiOptionChain = this.$uiOptionChain;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$10$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2390110.AnonymousClass1.C503561.invokeSuspend$lambda$0(uiOptionChain, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(UiOptionChain uiOptionChain, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, uiOptionChain, null, null, -536870913, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        UiOptionChain uiOptionChain = (UiOptionChain) tuples2.component1();
                        this.this$0.applyMutation(new C503561(((Number) tuples2.component2()).intValue(), uiOptionChain, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$11", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$11 */
        static final class C2390211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> $optionUnderlierFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2390211(Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390211> continuation) {
                super(2, continuation);
                this.$optionUnderlierFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390211(this.$optionUnderlierFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> flow = this.$optionUnderlierFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionUnderlier;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$11$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiOptionUnderlier>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends UiOptionUnderlier>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<UiOptionUnderlier>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<UiOptionUnderlier>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$11$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503571 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4769$i;
                    final /* synthetic */ Optional<UiOptionUnderlier> $underlier;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503571(int i, Optional<UiOptionUnderlier> optional, Continuation<? super C503571> continuation) {
                        super(2, continuation);
                        this.f4769$i = i;
                        this.$underlier = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503571 c503571 = new C503571(this.f4769$i, this.$underlier, continuation);
                        c503571.L$0 = obj;
                        return c503571;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503571) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4769$i;
                        final Optional<UiOptionUnderlier> optional = this.$underlier;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$11$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2390211.AnonymousClass1.C503571.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, (UiOptionUnderlier) optional.getOrNull(), null, null, null, null, -134217729, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new C503571(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$12", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {333}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$12 */
        static final class C2390312 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2390312(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow2, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390312> continuation) {
                super(2, continuation);
                this.$uiAggregateOptionPositionFlow = flow;
                this.$uiOptionInstrumentPositionFlow = flow2;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390312(this.$uiAggregateOptionPositionFlow, this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Boolean, Integer>> hasRealPositionToIndexFlow = OptionsDetailPageDuxoHelper.getHasRealPositionToIndexFlow(this.$uiAggregateOptionPositionFlow, this.$uiOptionInstrumentPositionFlow);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(hasRealPositionToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$12$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$12$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<Boolean, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<Boolean, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$12$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$12$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503581 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ boolean $hasRealPosition;

                    /* renamed from: $i */
                    final /* synthetic */ int f4770$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503581(int i, boolean z, Continuation<? super C503581> continuation) {
                        super(2, continuation);
                        this.f4770$i = i;
                        this.$hasRealPosition = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503581 c503581 = new C503581(this.f4770$i, this.$hasRealPosition, continuation);
                        c503581.L$0 = obj;
                        return c503581;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503581) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4770$i;
                        final boolean z = this.$hasRealPosition;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$12$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2390312.AnonymousClass1.C503581.invokeSuspend$lambda$0(z, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(boolean z, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, Boolean.valueOf(z), false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -131073, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
                        this.this$0.applyMutation(new C503581(((Number) tuples2.component2()).intValue(), zBooleanValue, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$13", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {345}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$13 */
        static final class C2390413 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<String, Integer>> $strategyCodeToIndexFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2390413(Flow<Tuples2<String, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390413> continuation) {
                super(2, continuation);
                this.$strategyCodeToIndexFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390413(this.$strategyCodeToIndexFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390413) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Boolean, Integer>> isWatchingToIndexFlow = OptionsDetailPageDuxoHelper.getIsWatchingToIndexFlow(this.$strategyCodeToIndexFlow, this.this$0.optionsWatchlistStore);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(isWatchingToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$13$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$13$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<Boolean, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<Boolean, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$13$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$13$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503591 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4771$i;
                    final /* synthetic */ boolean $isWatching;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503591(int i, boolean z, Continuation<? super C503591> continuation) {
                        super(2, continuation);
                        this.f4771$i = i;
                        this.$isWatching = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503591 c503591 = new C503591(this.f4771$i, this.$isWatching, continuation);
                        c503591.L$0 = obj;
                        return c503591;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503591) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4771$i;
                        final boolean z = this.$isWatching;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$13$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2390413.AnonymousClass1.C503591.invokeSuspend$lambda$0(z, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(boolean z, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -2049, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
                        this.this$0.applyMutation(new C503591(((Number) tuples2.component2()).intValue(), zBooleanValue, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$14", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {359}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$14 */
        static final class C2390514 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2390514(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390514> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390514(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390514) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow = this.$strategyInfoFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$14$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C238362(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$14$invokeSuspend$$inlined$map$1$2 */
                        public static final class C238362<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$14$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$14$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C238362.this.emit(null, this);
                                }
                            }

                            public C238362(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    List<UiOptionStrategyLeg> legs = ((UiOptionStrategyInfo) ((Tuples2) obj).getFirst()).getLegs();
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                                    Iterator<T> it = legs.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((UiOptionStrategyLeg) it.next()).getOptionInstrument().getId());
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }), new C23835x4e15d990(null, this.this$0));
                    this.label = 1;
                    if (FlowKt.collect(flowTransformLatest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {371}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15 */
        static final class C2390615 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2390615(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390615> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390615(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390615) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow = this.$strategyInfoFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends List<? extends UUID>, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends List<? extends UUID>, ? extends Integer>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C238382(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$invokeSuspend$$inlined$map$1$2 */
                        public static final class C238382<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C238382.this.emit(null, this);
                                }
                            }

                            public C238382(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Tuples2 tuples2 = (Tuples2) obj;
                                    List<UiOptionStrategyLeg> legs = ((UiOptionStrategyInfo) tuples2.getFirst()).getLegs();
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                                    Iterator<T> it = legs.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((UiOptionStrategyLeg) it.next()).getOptionInstrument().getId());
                                    }
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(arrayList, tuples2.getSecond());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }), new C23837xa533ca6f(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$3", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends Map<UUID, ? extends OptionInstrumentQuote>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Map<UUID, ? extends OptionInstrumentQuote>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Map<UUID, OptionInstrumentQuote>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Map<UUID, OptionInstrumentQuote>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$3$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4772$i;
                    final /* synthetic */ Map<UUID, OptionInstrumentQuote> $optionInstrumentIdToQuoteMap;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, Map<UUID, OptionInstrumentQuote> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4772$i = i;
                        this.$optionInstrumentIdToQuoteMap = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4772$i, this.$optionInstrumentIdToQuoteMap, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4772$i;
                        final Map<UUID, OptionInstrumentQuote> map = this.$optionInstrumentIdToQuoteMap;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$15$3$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2390615.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(map, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Map map, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, map, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -32769, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Map map = (Map) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), map, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$16", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {380}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$16 */
        static final class C2390716 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> $optionUnderlierFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2390716(Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390716> continuation) {
                super(2, continuation);
                this.$optionUnderlierFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390716(this.$optionUnderlierFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390716) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Iterable<Quote>> equityQuotePollingFlow = OptionsDetailPageDuxoHelper.getEquityQuotePollingFlow(this.$optionUnderlierFlow, this.this$0.quoteStore);
                    this.label = 1;
                    if (FlowKt.collect(equityQuotePollingFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$17", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {385}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$17 */
        static final class C2390817 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> $optionUnderlierFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2390817(Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390817> continuation) {
                super(2, continuation);
                this.$optionUnderlierFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390817(this.$optionUnderlierFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390817) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Quote, Integer>> equityQuoteToIndexFlow = OptionsDetailPageDuxoHelper.getEquityQuoteToIndexFlow(this.$optionUnderlierFlow, this.this$0.quoteStore);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(equityQuoteToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Quote;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$17$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$17$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Quote, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Quote, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<Quote, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<Quote, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$17$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$17$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503601 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4773$i;
                    final /* synthetic */ Quote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503601(int i, Quote quote, Continuation<? super C503601> continuation) {
                        super(2, continuation);
                        this.f4773$i = i;
                        this.$quote = quote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503601 c503601 = new C503601(this.f4773$i, this.$quote, continuation);
                        c503601.L$0 = obj;
                        return c503601;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503601) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4773$i;
                        final Quote quote = this.$quote;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$17$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2390817.AnonymousClass1.C503601.invokeSuspend$lambda$0(quote, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Quote quote, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, quote, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -9, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Quote quote = (Quote) tuples2.component1();
                        this.this$0.applyMutation(new C503601(((Number) tuples2.component2()).intValue(), quote, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$18", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {394}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$18 */
        static final class C2390918 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2390918(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2390918> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2390918(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2390918) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<IndexValue, Integer>> indexValueToIndexFlow = OptionsDetailPageDuxoHelper.getIndexValueToIndexFlow(this.$strategyInfoFlow, this.this$0.indexStore);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(indexValueToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/indexes/models/db/IndexValue;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$18$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$18$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends IndexValue, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends IndexValue, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<IndexValue, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<IndexValue, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$18$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$18$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503611 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4774$i;
                    final /* synthetic */ IndexValue $indexValue;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503611(int i, IndexValue indexValue, Continuation<? super C503611> continuation) {
                        super(2, continuation);
                        this.f4774$i = i;
                        this.$indexValue = indexValue;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503611 c503611 = new C503611(this.f4774$i, this.$indexValue, continuation);
                        c503611.L$0 = obj;
                        return c503611;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503611) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4774$i;
                        final IndexValue indexValue = this.$indexValue;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$18$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2390918.AnonymousClass1.C503611.invokeSuspend$lambda$0(indexValue, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(IndexValue indexValue, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, indexValue, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -513, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        IndexValue indexValue = (IndexValue) tuples2.component1();
                        this.this$0.applyMutation(new C503611(((Number) tuples2.component2()).intValue(), indexValue, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$19", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {HttpStatusCode.FORBIDDEN}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$19 */
        static final class C2391019 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2391019(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391019> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391019(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391019) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Optional<Index>, Integer>> indexInstrumentToIndexFlow = OptionsDetailPageDuxoHelper.getIndexInstrumentToIndexFlow(this.$strategyInfoFlow, this.this$0.indexStore);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(indexInstrumentToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/indexes/models/db/Index;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$19$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends Index>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends Index>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<Index>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<Index>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$19$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$19$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503621 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4775$i;
                    final /* synthetic */ Optional<Index> $indexInstrument;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503621(int i, Optional<Index> optional, Continuation<? super C503621> continuation) {
                        super(2, continuation);
                        this.f4775$i = i;
                        this.$indexInstrument = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503621 c503621 = new C503621(this.f4775$i, this.$indexInstrument, continuation);
                        c503621.L$0 = obj;
                        return c503621;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503621) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4775$i;
                        final Optional<Index> optional = this.$indexInstrument;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$19$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391019.AnonymousClass1.C503621.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, (Index) optional.getOrNull(), null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -65, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new C503621(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$20", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {420}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$20 */
        static final class C2391220 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Tuples2<Optional<UiOptionUnderlier>, Integer>, Tuples2<DisplaySpan, Integer>>> $optionUnderlierWithActiveSpanFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2391220(Flow<? extends Tuples2<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>, ? extends Tuples2<? extends DisplaySpan, Integer>>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391220> continuation) {
                super(2, continuation);
                this.$optionUnderlierWithActiveSpanFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391220(this.$optionUnderlierWithActiveSpanFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391220) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$optionUnderlierWithActiveSpanFlow, new C23840x7e3e4115(null, this.this$0));
                    this.label = 1;
                    if (FlowKt.collect(flowTransformLatest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$21", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {434}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$21 */
        static final class C2391321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Tuples2<Optional<UiOptionUnderlier>, Integer>, Tuples2<DisplaySpan, Integer>>> $optionUnderlierWithActiveSpanFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2391321(Flow<? extends Tuples2<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>, ? extends Tuples2<? extends DisplaySpan, Integer>>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391321> continuation) {
                super(2, continuation);
                this.$optionUnderlierWithActiveSpanFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391321(this.$optionUnderlierWithActiveSpanFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$optionUnderlierWithActiveSpanFlow, new C23841xd55c31f4(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0015\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$21$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$21$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiQuoteHistorical, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UiQuoteHistorical, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<UiQuoteHistorical, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<UiQuoteHistorical, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$21$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$21$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ UiQuoteHistorical $historical;

                    /* renamed from: $i */
                    final /* synthetic */ int f4777$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, UiQuoteHistorical uiQuoteHistorical, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4777$i = i;
                        this.$historical = uiQuoteHistorical;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4777$i, this.$historical, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4777$i;
                        final UiQuoteHistorical uiQuoteHistorical = this.$historical;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$21$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391321.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(uiQuoteHistorical, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(UiQuoteHistorical uiQuoteHistorical, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, uiQuoteHistorical, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -17, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Object objComponent1 = tuples2.component1();
                        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), (UiQuoteHistorical) objComponent1, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$22", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {447}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$22 */
        static final class C2391422 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Tuples2<OptionUnderlying, Integer>, Tuples2<DisplaySpan, Integer>>> $optionUnderlyingWithActiveSpanFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2391422(Flow<? extends Tuples2<Tuples2<OptionUnderlying, Integer>, ? extends Tuples2<? extends DisplaySpan, Integer>>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391422> continuation) {
                super(2, continuation);
                this.$optionUnderlyingWithActiveSpanFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391422(this.$optionUnderlyingWithActiveSpanFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391422) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Optional<IndexHistoricals>, Integer>> indexHistoricalToIndexFlow = OptionsDetailPageDuxoHelper.getIndexHistoricalToIndexFlow(this.$optionUnderlyingWithActiveSpanFlow, this.this$0.indexStore, this.this$0.clock);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(indexHistoricalToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$22$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$22$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends IndexHistoricals>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends IndexHistoricals>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<IndexHistoricals>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<IndexHistoricals>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$22$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$22$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503641 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4778$i;
                    final /* synthetic */ Optional<IndexHistoricals> $indexHistoricals;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503641(int i, Optional<IndexHistoricals> optional, Continuation<? super C503641> continuation) {
                        super(2, continuation);
                        this.f4778$i = i;
                        this.$indexHistoricals = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503641 c503641 = new C503641(this.f4778$i, this.$indexHistoricals, continuation);
                        c503641.L$0 = obj;
                        return c503641;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503641) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4778$i;
                        final Optional<IndexHistoricals> optional = this.$indexHistoricals;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$22$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391422.AnonymousClass1.C503641.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, (IndexHistoricals) optional.getOrNull(), null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -257, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new C503641(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$23", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {459}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$23 */
        static final class C2391523 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2391523(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391523> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391523(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391523) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Optional<IndexCloseValue>, Integer>> indexCloseValueToIndexFlow = OptionsDetailPageDuxoHelper.getIndexCloseValueToIndexFlow(this.$strategyInfoFlow, this.this$0.indexStore);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(indexCloseValueToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$23$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$23$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends IndexCloseValue>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends IndexCloseValue>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<IndexCloseValue>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<IndexCloseValue>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$23$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$23$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503651 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4779$i;
                    final /* synthetic */ Optional<IndexCloseValue> $indexCloseValue;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503651(int i, Optional<IndexCloseValue> optional, Continuation<? super C503651> continuation) {
                        super(2, continuation);
                        this.f4779$i = i;
                        this.$indexCloseValue = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503651 c503651 = new C503651(this.f4779$i, this.$indexCloseValue, continuation);
                        c503651.L$0 = obj;
                        return c503651;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503651) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4779$i;
                        final Optional<IndexCloseValue> optional = this.$indexCloseValue;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$23$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391523.AnonymousClass1.C503651.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, (IndexCloseValue) optional.getOrNull(), null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -129, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new C503651(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {469}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24 */
        static final class C2391624 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> $curatedListItemToUiStrategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2391624(Flow<? extends Tuples2<? extends Tuples2<? extends Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391624> continuation) {
                super(2, continuation);
                this.$curatedListItemToUiStrategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391624(this.$curatedListItemToUiStrategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391624) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> flow = this.$curatedListItemToUiStrategyInfoFlow;
                    Flow<Tuples2<? extends Optional<? extends CuratedListItem>, ? extends Integer>> flow2 = new Flow<Tuples2<? extends Optional<? extends CuratedListItem>, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends Optional<? extends CuratedListItem>, ? extends Integer>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C238422(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$invokeSuspend$$inlined$map$1$2 */
                        public static final class C238422<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C238422.this.emit(null, this);
                                }
                            }

                            public C238422(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Tuples2 tuples2 = (Tuples2) obj;
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(((Tuples2) tuples2.getFirst()).getFirst(), tuples2.getSecond());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow2, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/CuratedListItem;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends CuratedListItem>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends CuratedListItem>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<CuratedListItem>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<CuratedListItem>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ Optional<CuratedListItem> $curatedListItem;

                    /* renamed from: $i */
                    final /* synthetic */ int f4780$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, Optional<CuratedListItem> optional, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4780$i = i;
                        this.$curatedListItem = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4780$i, this.$curatedListItem, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4780$i;
                        final Optional<CuratedListItem> optional = this.$curatedListItem;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$24$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391624.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, (CuratedListItem) optional.getOrNull(), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -5, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$25", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {482}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$25 */
        static final class C2391725 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2391725(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391725> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391725(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391725) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$strategyInfoFlow, new C23843x31d3f570(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$25$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$25$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends AggregateOptionStrategyQuote, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends AggregateOptionStrategyQuote, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<AggregateOptionStrategyQuote, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<AggregateOptionStrategyQuote, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$25$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$25$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4781$i;
                    final /* synthetic */ AggregateOptionStrategyQuote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4781$i = i;
                        this.$quote = aggregateOptionStrategyQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4781$i, this.$quote, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4781$i;
                        final AggregateOptionStrategyQuote aggregateOptionStrategyQuote = this.$quote;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$25$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391725.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(aggregateOptionStrategyQuote, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(AggregateOptionStrategyQuote aggregateOptionStrategyQuote, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, aggregateOptionStrategyQuote, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        AggregateOptionStrategyQuote aggregateOptionStrategyQuote = (AggregateOptionStrategyQuote) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), aggregateOptionStrategyQuote, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {512}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26 */
        static final class C2391826 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> $curatedListItemToUiStrategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2391826(Flow<? extends Tuples2<? extends Tuples2<? extends Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2391826> continuation) {
                super(2, continuation);
                this.$curatedListItemToUiStrategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2391826(this.$curatedListItemToUiStrategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391826) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$curatedListItemToUiStrategyInfoFlow, new C23845x88f1e64f(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends ApiOptionTodayTotalReturnResponse2>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends ApiOptionTodayTotalReturnResponse2>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<ApiOptionTodayTotalReturnResponse2>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<ApiOptionTodayTotalReturnResponse2>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4782$i;
                    final /* synthetic */ Optional<ApiOptionTodayTotalReturnResponse2> $returns;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, Optional<ApiOptionTodayTotalReturnResponse2> optional, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4782$i = i;
                        this.$returns = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4782$i, this.$returns, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4782$i;
                        final Optional<ApiOptionTodayTotalReturnResponse2> optional = this.$returns;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391826.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, (ApiOptionTodayTotalReturnResponse2) optional.getOrNull(), 0L, null, null, null, null, null, null, null, null, null, null, -1048577, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {548}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27 */
        static final class C2391927 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C2391927(Continuation<? super C2391927> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionsDetailPageDuxo.this.new C2391927(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2391927) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                    Flow<Tuples2<OptionHistoricalChartModel, Integer>> historicalChartToIndexFlow = OptionsDetailPageDuxoHelper.getHistoricalChartToIndexFlow(new Flow<Tuples2<? extends OptionHistoricalChartStore.Request, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends OptionHistoricalChartStore.Request, ? extends Integer>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {53}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Tuples2 tuples2Indexed = OptionsDetailPageViewState3.indexed((OptionsDetailPageViewState) obj, C23920xd377b666.INSTANCE);
                                    if (tuples2Indexed != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(tuples2Indexed, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, OptionsDetailPageDuxo.this.optionHistoricalChartStore);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsDetailPageDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(historicalChartToIndexFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionHistoricalChartModel, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionHistoricalChartModel, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<OptionHistoricalChartModel, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<OptionHistoricalChartModel, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503661 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ OptionHistoricalChartModel $chart;

                    /* renamed from: $i */
                    final /* synthetic */ int f4783$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503661(int i, OptionHistoricalChartModel optionHistoricalChartModel, Continuation<? super C503661> continuation) {
                        super(2, continuation);
                        this.f4783$i = i;
                        this.$chart = optionHistoricalChartModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503661 c503661 = new C503661(this.f4783$i, this.$chart, continuation);
                        c503661.L$0 = obj;
                        return c503661;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503661) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4783$i;
                        final OptionHistoricalChartModel optionHistoricalChartModel = this.$chart;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$27$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2391927.AnonymousClass1.C503661.invokeSuspend$lambda$0(optionHistoricalChartModel, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(OptionHistoricalChartModel optionHistoricalChartModel, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, optionHistoricalChartModel, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -33, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        OptionHistoricalChartModel optionHistoricalChartModel = (OptionHistoricalChartModel) tuples2.component1();
                        this.this$0.applyMutation(new C503661(((Number) tuples2.component2()).intValue(), optionHistoricalChartModel, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$28", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {557}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$28 */
        static final class C2392128 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392128(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392128> continuation) {
                super(2, continuation);
                this.$uiAggregateOptionPositionFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392128(this.$uiAggregateOptionPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392128) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> flow = this.$uiAggregateOptionPositionFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$28$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$28$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiAggregateOptionPositionFull>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends UiAggregateOptionPositionFull>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$28$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$28$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503671 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4784$i;
                    final /* synthetic */ Optional<UiAggregateOptionPositionFull> $uiPosition;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503671(int i, Optional<UiAggregateOptionPositionFull> optional, Continuation<? super C503671> continuation) {
                        super(2, continuation);
                        this.f4784$i = i;
                        this.$uiPosition = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503671 c503671 = new C503671(this.f4784$i, this.$uiPosition, continuation);
                        c503671.L$0 = obj;
                        return c503671;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503671) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4784$i;
                        final Optional<UiAggregateOptionPositionFull> optional = this.$uiPosition;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$28$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392128.AnonymousClass1.C503671.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, (UiAggregateOptionPositionFull) optional.getOrNull(), null, null, null, null, null, null, null, null, null, -4194305, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new C503671(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$29", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {577}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$29 */
        static final class C2392229 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392229(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392229> continuation) {
                super(2, continuation);
                this.$uiAggregateOptionPositionFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392229(this.$uiAggregateOptionPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392229) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$uiAggregateOptionPositionFlow, new C23849x8e4bb8ec(null, this.this$0)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/ui/UiOptionOrder;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$29$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$29$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends UiOptionOrder>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends UiOptionOrder>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends List<UiOptionOrder>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends List<UiOptionOrder>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$29$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$29$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4785$i;
                    final /* synthetic */ List<UiOptionOrder> $orders;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, List<UiOptionOrder> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4785$i = i;
                        this.$orders = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4785$i, this.$orders, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4785$i;
                        final List<UiOptionOrder> list = this.$orders;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$29$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392229.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(list, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(List list, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, list, null, null, null, null, null, null, -33554433, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        List list = (List) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), list, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$30", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {597}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$30 */
        static final class C2392330 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392330(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392330> continuation) {
                super(2, continuation);
                this.$uiAggregateOptionPositionFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392330(this.$uiAggregateOptionPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392330) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$uiAggregateOptionPositionFlow, new C23851xade6c16(null, this.this$0)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$30$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$30$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends UiComboOrder>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends UiComboOrder>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends List<UiComboOrder>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends List<UiComboOrder>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$30$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$30$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ List<UiComboOrder> $comboOrders;

                    /* renamed from: $i */
                    final /* synthetic */ int f4786$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, List<UiComboOrder> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4786$i = i;
                        this.$comboOrders = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4786$i, this.$comboOrders, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4786$i;
                        final List<UiComboOrder> list = this.$comboOrders;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$30$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392330.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(list, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(List list, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, list, null, null, null, null, null, -67108865, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        List list = (List) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), list, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {630}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31 */
        static final class C2392431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionUnderlier>, Integer>> $optionUnderlierFlow;
            final /* synthetic */ Flow<Tuples2<Optional<UiAggregateOptionPositionFull>, Integer>> $uiAggregateOptionPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392431(Flow<? extends Tuples2<? extends Optional<UiAggregateOptionPositionFull>, Integer>> flow, Flow<? extends Tuples2<? extends Optional<UiOptionUnderlier>, Integer>> flow2, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392431> continuation) {
                super(2, continuation);
                this.$uiAggregateOptionPositionFlow = flow;
                this.$optionUnderlierFlow = flow2;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392431(this.$uiAggregateOptionPositionFlow, this.$optionUnderlierFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowFilterPairSameIndex = OptionsDetailPageDuxoHelper.filterPairSameIndex(Operators.combine(this.$uiAggregateOptionPositionFlow, this.$optionUnderlierFlow), new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Integer.valueOf(OptionsDetailPageDuxo.C2392431.invokeSuspend$lambda$0((Tuples2) obj2));
                        }
                    }, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Integer.valueOf(OptionsDetailPageDuxo.C2392431.invokeSuspend$lambda$1((Tuples2) obj2));
                        }
                    });
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Tuples3<? extends Optional<? extends UiAggregateOptionPositionFull>, ? extends Optional<? extends UiOptionUnderlier>, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples3<? extends Optional<? extends UiAggregateOptionPositionFull>, ? extends Optional<? extends UiOptionUnderlier>, ? extends Integer>> flowCollector, Continuation continuation) {
                            Object objCollect = flowFilterPairSameIndex.collect(new C238542(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$invokeSuspend$$inlined$map$1$2 */
                        public static final class C238542<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C238542.this.emit(null, this);
                                }
                            }

                            public C238542(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Tuples2 tuples2 = (Tuples2) obj;
                                    Tuples2 tuples22 = (Tuples2) tuples2.component1();
                                    Tuples2 tuples23 = (Tuples2) tuples2.component2();
                                    Tuples3 tuples3 = new Tuples3(tuples22.getFirst(), tuples23.getFirst(), tuples23.getSecond());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples3, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, new C23853x61fc5cf5(null, this.this$0));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int invokeSuspend$lambda$0(Tuples2 tuples2) {
                return ((Number) tuples2.getSecond()).intValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int invokeSuspend$lambda$1(Tuples2 tuples2) {
                return ((Number) tuples2.getSecond()).intValue();
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/ui/UiOptionEvent;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$5", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends UiOptionEvent>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends UiOptionEvent>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends List<UiOptionEvent>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends List<UiOptionEvent>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$5$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ List<UiOptionEvent> $events;

                    /* renamed from: $i */
                    final /* synthetic */ int f4787$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, List<UiOptionEvent> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4787$i = i;
                        this.$events = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4787$i, this.$events, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4787$i;
                        final List<UiOptionEvent> list = this.$events;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$31$5$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392431.AnonymousClass5.AnonymousClass1.invokeSuspend$lambda$0(list, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(List list, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, list, null, null, null, null, null, null, null, null, -8388609, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        List list = (List) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), list, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$32", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {639}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$32 */
        static final class C2392532 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392532(Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392532> continuation) {
                super(2, continuation);
                this.$uiOptionInstrumentPositionFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392532(this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> flow = this.$uiOptionInstrumentPositionFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$32$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$32$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends UiOptionInstrumentPosition>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends UiOptionInstrumentPosition>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$32$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$32$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503681 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4788$i;
                    final /* synthetic */ Optional<UiOptionInstrumentPosition> $uiPosition;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503681(int i, Optional<UiOptionInstrumentPosition> optional, Continuation<? super C503681> continuation) {
                        super(2, continuation);
                        this.f4788$i = i;
                        this.$uiPosition = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503681 c503681 = new C503681(this.f4788$i, this.$uiPosition, continuation);
                        c503681.L$0 = obj;
                        return c503681;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((C503681) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4788$i;
                        final Optional<UiOptionInstrumentPosition> optional = this.$uiPosition;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$32$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392532.AnonymousClass1.C503681.invokeSuspend$lambda$0(optional, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(Optional optional, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, (UiOptionInstrumentPosition) optional.getOrNull(), null, null, null, null, null, null, null, -16777217, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Optional optional = (Optional) tuples2.component1();
                        this.this$0.applyMutation(new C503681(((Number) tuples2.component2()).intValue(), optional, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$33", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {659}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$33 */
        static final class C2392633 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392633(Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392633> continuation) {
                super(2, continuation);
                this.$uiOptionInstrumentPositionFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392633(this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392633) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$uiOptionInstrumentPositionFlow, new C23856x10383eb3(null, this.this$0)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/ui/UiOptionOrder;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$33$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$33$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends UiOptionOrder>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends UiOptionOrder>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends List<UiOptionOrder>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends List<UiOptionOrder>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$33$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$33$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4789$i;
                    final /* synthetic */ List<UiOptionOrder> $orders;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, List<UiOptionOrder> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4789$i = i;
                        this.$orders = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4789$i, this.$orders, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4789$i;
                        final List<UiOptionOrder> list = this.$orders;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$33$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392633.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(list, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(List list, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, list, null, null, null, null, null, null, -33554433, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        List list = (List) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), list, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$34", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {679}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$34 */
        static final class C2392734 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392734(Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392734> continuation) {
                super(2, continuation);
                this.$uiOptionInstrumentPositionFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392734(this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392734) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$uiOptionInstrumentPositionFlow, new C23858x67562f92(null, this.this$0)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$34$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$34$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends UiComboOrder>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends UiComboOrder>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends List<UiComboOrder>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends List<UiComboOrder>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$34$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$34$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ List<UiComboOrder> $comboOrders;

                    /* renamed from: $i */
                    final /* synthetic */ int f4790$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, List<UiComboOrder> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4790$i = i;
                        this.$comboOrders = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4790$i, this.$comboOrders, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4790$i;
                        final List<UiComboOrder> list = this.$comboOrders;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$34$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392734.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(list, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(List list, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, list, null, null, null, null, null, -67108865, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        List list = (List) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), list, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$35", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {699}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$35 */
        static final class C2392835 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Optional<UiOptionInstrumentPosition>, Integer>> $uiOptionInstrumentPositionFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2392835(Flow<? extends Tuples2<? extends Optional<UiOptionInstrumentPosition>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392835> continuation) {
                super(2, continuation);
                this.$uiOptionInstrumentPositionFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392835(this.$uiOptionInstrumentPositionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392835) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$uiOptionInstrumentPositionFlow, new C23860xbe742071(null, this.this$0)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/ui/UiOptionEvent;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$35$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$35$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends UiOptionEvent>, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends UiOptionEvent>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<? extends List<UiOptionEvent>, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<? extends List<UiOptionEvent>, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$35$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$35$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ List<UiOptionEvent> $events;

                    /* renamed from: $i */
                    final /* synthetic */ int f4791$i;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, List<UiOptionEvent> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4791$i = i;
                        this.$events = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4791$i, this.$events, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4791$i;
                        final List<UiOptionEvent> list = this.$events;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$35$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392835.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(list, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(List list, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, list, null, null, null, null, null, null, null, null, -8388609, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        List list = (List) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), list, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$36", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {714}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$36 */
        static final class C2392936 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2392936(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2392936> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2392936(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2392936) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$strategyInfoFlow, new C23862x15921150(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0015\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/LateCloseAnnouncementCardFlag;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$36$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$36$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends LateCloseAnnouncementCardFlag, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends LateCloseAnnouncementCardFlag, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<LateCloseAnnouncementCardFlag, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<LateCloseAnnouncementCardFlag, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$36$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$36$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4793$i;
                    final /* synthetic */ LateCloseAnnouncementCardFlag $lateCloseAnnouncementCardFlag;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4793$i = i;
                        this.$lateCloseAnnouncementCardFlag = lateCloseAnnouncementCardFlag;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4793$i, this.$lateCloseAnnouncementCardFlag, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4793$i;
                        final LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag = this.$lateCloseAnnouncementCardFlag;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$36$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2392936.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(lateCloseAnnouncementCardFlag, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(LateCloseAnnouncementCardFlag lateCloseAnnouncementCardFlag, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, lateCloseAnnouncementCardFlag, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -4097, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        Object objComponent1 = tuples2.component1();
                        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), (LateCloseAnnouncementCardFlag) objComponent1, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {727}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37 */
        static final class C2393037 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2393037(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2393037> continuation) {
                super(2, continuation);
                this.$strategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2393037(this.$strategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2393037) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow = this.$strategyInfoFlow;
                    final StateFlow<OptionsDetailPageViewState> stateFlow = this.this$0.getStateFlow();
                    Flow<Tuples2<Boolean, Integer>> showRollingActionItemToIndexFlow = OptionsDetailPageDuxoHelper.getShowRollingActionItemToIndexFlow(flow, new Flow<String>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Account currentAccount = ((OptionsDetailPageViewState) obj).getCurrentAccount();
                                    String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
                                    if (accountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, this.this$0.optionRollingStore);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(showRollingActionItemToIndexFlow, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<Boolean, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<Boolean, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4794$i;
                    final /* synthetic */ boolean $showRollingActionItem;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4794$i = i;
                        this.$showRollingActionItem = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4794$i, this.$showRollingActionItem, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4794$i;
                        final boolean z = this.$showRollingActionItem;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$37$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2393037.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(z, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(boolean z, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, z, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -262145, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), zBooleanValue, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {740}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38 */
        static final class C2393138 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> $curatedListItemToUiStrategyInfoFlow;
            int label;
            final /* synthetic */ OptionsDetailPageDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2393138(Flow<? extends Tuples2<? extends Tuples2<? extends Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2393138> continuation) {
                super(2, continuation);
                this.$curatedListItemToUiStrategyInfoFlow = flow;
                this.this$0 = optionsDetailPageDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2393138(this.$curatedListItemToUiStrategyInfoFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2393138) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer>> flow = this.$curatedListItemToUiStrategyInfoFlow;
                    final StateFlow<OptionsDetailPageViewState> stateFlow = this.this$0.getStateFlow();
                    Flow<Tuples2<OptionInstrumentPosition, Integer>> oppositePositionFromWatchlistToIndexFlow = OptionsDetailPageDuxoHelper.getOppositePositionFromWatchlistToIndexFlow(flow, new Flow<String>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String currentAccountNumber = ((OptionsDetailPageViewState) obj).getCurrentAccountNumber();
                                    if (currentAccountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(currentAccountNumber, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, this.this$0.optionPositionStore);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(oppositePositionFromWatchlistToIndexFlow, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OptionInstrumentPosition;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionInstrumentPosition, ? extends Integer>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionInstrumentPosition, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<OptionInstrumentPosition, Integer>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<OptionInstrumentPosition, Integer> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                    /* renamed from: $i */
                    final /* synthetic */ int f4795$i;
                    final /* synthetic */ OptionInstrumentPosition $oppositePositionFromWatchlist;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(int i, OptionInstrumentPosition optionInstrumentPosition, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.f4795$i = i;
                        this.$oppositePositionFromWatchlist = optionInstrumentPosition;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4795$i, this.$oppositePositionFromWatchlist, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                        int i = this.f4795$i;
                        final OptionInstrumentPosition optionInstrumentPosition = this.$oppositePositionFromWatchlist;
                        return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$38$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return OptionsDetailPageDuxo.C2393138.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(optionInstrumentPosition, (OptionsDetailPageDataState.PageData) obj2);
                            }
                        });
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(OptionInstrumentPosition optionInstrumentPosition, OptionsDetailPageDataState.PageData pageData) {
                        return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, optionInstrumentPosition, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -16385, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        OptionInstrumentPosition optionInstrumentPosition = (OptionInstrumentPosition) tuples2.component1();
                        this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), optionInstrumentPosition, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {752}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39 */
        static final class C2393239 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C2393239(Continuation<? super C2393239> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionsDetailPageDuxo.this.new C2393239(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2393239) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                    Flow<OptionSettings> optionSettingsFlow = OptionsDetailPageDuxoHelper.getOptionSettingsFlow(new Flow<String>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Account currentAccount = ((OptionsDetailPageViewState) obj).getCurrentAccount();
                                    String accountNumber = currentAccount != null ? currentAccount.getAccountNumber() : null;
                                    if (accountNumber != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, OptionsDetailPageDuxo.this.optionSettingsStore);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(optionSettingsFlow, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionSettings, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionSettings optionSettings, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(optionSettings, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$39$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    final /* synthetic */ OptionSettings $optionSettings;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionSettings optionSettings, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$optionSettings = optionSettings;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionSettings, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, this.$optionSettings, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554303, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((OptionSettings) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: OptionsDetailPageDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {765}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40 */
        static final class C2393340 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C2393340(Continuation<? super C2393340> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return OptionsDetailPageDuxo.this.new C2393340(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C2393340) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                    Flow<Tuples2<OptionsAccountSwitcher, Integer>> optionsAccountSwitcherToIndexFlow = OptionsDetailPageDuxoHelper.getOptionsAccountSwitcherToIndexFlow(new Flow<Tuples2<? extends OptionsAccountSwitcherId, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends OptionsAccountSwitcherId, ? extends Integer>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    final OptionsDetailPageViewState optionsDetailPageViewState = (OptionsDetailPageViewState) obj;
                                    Tuples2 tuples2Indexed = OptionsDetailPageViewState3.indexed(optionsDetailPageViewState, 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003d: INVOKE (r5v2 'tuples2Indexed' kotlin.Pair) = 
                                          (r5v1 'optionsDetailPageViewState' com.robinhood.android.options.ui.detail.OptionsDetailPageViewState)
                                          (wrap:kotlin.jvm.functions.Function1<com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId>:0x003a: CONSTRUCTOR (r5v1 'optionsDetailPageViewState' com.robinhood.android.options.ui.detail.OptionsDetailPageViewState A[DONT_INLINE]) A[MD:(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState):void (m), WRAPPED] (LINE:762) call: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$1$1.<init>(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState):void type: CONSTRUCTOR)
                                         STATIC call: com.robinhood.android.options.ui.detail.OptionsDetailPageViewStateKt.indexed(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, kotlin.jvm.functions.Function1):kotlin.Pair A[DECLARE_VAR, MD:<T>:(com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, kotlin.jvm.functions.Function1<? super com.robinhood.android.options.ui.detail.OptionsDetailPageViewState, ? extends T>):kotlin.Pair<T, java.lang.Integer> (m)] (LINE:762) in method: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes11.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$1$1, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 21 more
                                        */
                                    /*
                                        this = this;
                                        boolean r0 = r6 instanceof com.robinhood.android.options.p208ui.detail.C23866x68249a8b.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r6
                                        com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (com.robinhood.android.options.p208ui.detail.C23866x68249a8b.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$invokeSuspend$$inlined$mapNotNull$1$2$1
                                        r0.<init>(r6)
                                    L18:
                                        java.lang.Object r6 = r0.result
                                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                        int r2 = r0.label
                                        r3 = 1
                                        if (r2 == 0) goto L31
                                        if (r2 != r3) goto L29
                                        kotlin.ResultKt.throwOnFailure(r6)
                                        goto L4c
                                    L29:
                                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                        r5.<init>(r6)
                                        throw r5
                                    L31:
                                        kotlin.ResultKt.throwOnFailure(r6)
                                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                                        com.robinhood.android.options.ui.detail.OptionsDetailPageViewState r5 = (com.robinhood.android.options.p208ui.detail.OptionsDetailPageViewState) r5
                                        com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$1$1 r2 = new com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$1$1
                                        r2.<init>(r5)
                                        kotlin.Pair r5 = com.robinhood.android.options.p208ui.detail.OptionsDetailPageViewState3.indexed(r5, r2)
                                        if (r5 == 0) goto L4c
                                        r0.label = r3
                                        java.lang.Object r5 = r6.emit(r5, r0)
                                        if (r5 != r1) goto L4c
                                        return r1
                                    L4c:
                                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                        return r5
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.options.p208ui.detail.C23866x68249a8b.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }
                        }, OptionsDetailPageDuxo.this.optionAccountSwitcherStore);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(optionsAccountSwitcherToIndexFlow, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends OptionsAccountSwitcher, ? extends Integer>, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends OptionsAccountSwitcher, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                        return invoke2((Tuples2<OptionsAccountSwitcher, Integer>) tuples2, continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(Tuples2<OptionsAccountSwitcher, Integer> tuples2, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$2$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                        /* renamed from: $i */
                        final /* synthetic */ int f4796$i;
                        final /* synthetic */ OptionsAccountSwitcher $optionsAccountSwitcher;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(int i, OptionsAccountSwitcher optionsAccountSwitcher, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.f4796$i = i;
                            this.$optionsAccountSwitcher = optionsAccountSwitcher;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4796$i, this.$optionsAccountSwitcher, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                            int i = this.f4796$i;
                            final OptionsAccountSwitcher optionsAccountSwitcher = this.$optionsAccountSwitcher;
                            return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$40$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2393340.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(optionsAccountSwitcher, (OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(OptionsAccountSwitcher optionsAccountSwitcher, OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, optionsAccountSwitcher, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -65537, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            Tuples2 tuples2 = (Tuples2) this.L$0;
                            OptionsAccountSwitcher optionsAccountSwitcher = (OptionsAccountSwitcher) tuples2.component1();
                            this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), optionsAccountSwitcher, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {792}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41 */
            static final class C2393441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C2393441(Continuation<? super C2393441> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C2393441(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2393441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.transformLatest(FlowKt.take(new Flow<Tuples2<? extends String, ? extends Integer>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends Integer>> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageViewState optionsDetailPageViewState = (OptionsDetailPageViewState) obj;
                                        Tuples2 nullable = PairUtils.toNullable(Tuples4.m3642to(optionsDetailPageViewState.getCurrentAccountNumber(), optionsDetailPageViewState.getCurrentPage()));
                                        if (nullable != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(nullable, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, 1), new C23867xee9c87f6(null, OptionsDetailPageDuxo.this)));
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tooltipState", "Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$3", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$3, reason: invalid class name */
                static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OptionsSimulatedReturnTooltipState, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                        anonymousClass3.L$0 = obj;
                        return anonymousClass3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(optionsSimulatedReturnTooltipState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$3$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$41$3$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                        final /* synthetic */ OptionsSimulatedReturnTooltipState $tooltipState;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(OptionsSimulatedReturnTooltipState optionsSimulatedReturnTooltipState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$tooltipState = optionsSimulatedReturnTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tooltipState, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, this.$tooltipState, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554175, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.applyMutation(new AnonymousClass1((OptionsSimulatedReturnTooltipState) this.L$0, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {802}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42 */
            static final class C2393542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C2393542(Continuation<? super C2393542> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C2393542(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2393542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageLoggingState currentLoggingState = ((OptionsDetailPageViewState) obj).getCurrentLoggingState();
                                        if (currentLoggingState != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(currentLoggingState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ((OptionsDetailPageLoggingState) obj2).getStrategyCode();
                            }
                        });
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42$3", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$42$3, reason: invalid class name */
                static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                        anonymousClass3.L$0 = obj;
                        return anonymousClass3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.logAppear((OptionsDetailPageLoggingState) this.L$0);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {810}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43 */
            static final class C2393643 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Flow<Tuples2<String, Integer>> $strategyCodeToIndexFlow;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2393643(Flow<Tuples2<String, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2393643> continuation) {
                    super(2, continuation);
                    this.$strategyCodeToIndexFlow = flow;
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2393643(this.$strategyCodeToIndexFlow, this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2393643) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.$strategyCodeToIndexFlow);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {813}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends Integer>, Continuation<? super Unit>, Object> {
                    int I$0;
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                        return invoke2((Tuples2<String, Integer>) tuples2, continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(Tuples2<String, Integer> tuples2, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        int iIntValue;
                        AnonymousClass1 anonymousClass1;
                        Endpoint<String, OptionShouldShowSimulatedReturnsResponse> getOptionShouldShowSimulatedReturnsEndpoint;
                        Throwable th;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Tuples2 tuples2 = (Tuples2) this.L$0;
                            String str = (String) tuples2.component1();
                            iIntValue = ((Number) tuples2.component2()).intValue();
                            try {
                                getOptionShouldShowSimulatedReturnsEndpoint = this.this$0.optionSimulatedReturnsStore.getGetOptionShouldShowSimulatedReturnsEndpoint();
                                this.I$0 = iIntValue;
                                this.label = 1;
                                anonymousClass1 = this;
                            } catch (Throwable th2) {
                                th = th2;
                                anonymousClass1 = this;
                                th = th;
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                                anonymousClass1.this$0.applyMutation(new AnonymousClass2(iIntValue, null));
                                return Unit.INSTANCE;
                            }
                            try {
                                obj = Endpoint.DefaultImpls.forceFetch$default(getOptionShouldShowSimulatedReturnsEndpoint, str, null, anonymousClass1, 2, null);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                                anonymousClass1.this$0.applyMutation(new AnonymousClass2(iIntValue, null));
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            iIntValue = this.I$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                anonymousClass1 = this;
                            } catch (Throwable th4) {
                                th = th4;
                                anonymousClass1 = this;
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                                anonymousClass1.this$0.applyMutation(new AnonymousClass2(iIntValue, null));
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1.this$0.applyMutation(new C503691(iIntValue, (OptionShouldShowSimulatedReturnsResponse) obj, null));
                        return Unit.INSTANCE;
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C503691 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                        /* renamed from: $i */
                        final /* synthetic */ int f4797$i;
                        final /* synthetic */ OptionShouldShowSimulatedReturnsResponse $response;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C503691(int i, OptionShouldShowSimulatedReturnsResponse optionShouldShowSimulatedReturnsResponse, Continuation<? super C503691> continuation) {
                            super(2, continuation);
                            this.f4797$i = i;
                            this.$response = optionShouldShowSimulatedReturnsResponse;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C503691 c503691 = new C503691(this.f4797$i, this.$response, continuation);
                            c503691.L$0 = obj;
                            return c503691;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((C503691) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                            int i = this.f4797$i;
                            final OptionShouldShowSimulatedReturnsResponse optionShouldShowSimulatedReturnsResponse = this.$response;
                            return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2393643.AnonymousClass1.C503691.invokeSuspend$lambda$0(optionShouldShowSimulatedReturnsResponse, (OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(OptionShouldShowSimulatedReturnsResponse optionShouldShowSimulatedReturnsResponse, OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, optionShouldShowSimulatedReturnsResponse.getShouldShowSimulatedReturns(), null, 0L, null, null, null, null, null, null, null, null, null, null, -524289, null);
                        }
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                        /* renamed from: $i */
                        final /* synthetic */ int f4798$i;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.f4798$i = i;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4798$i, continuation);
                            anonymousClass2.L$0 = obj;
                            return anonymousClass2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass2) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return ((OptionsDetailPageDataState) this.L$0).copyTo(this.f4798$i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$43$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2393643.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0((OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -524289, null);
                        }
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$44", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {839}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$44 */
            static final class C2393744 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2393744(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2393744> continuation) {
                    super(2, continuation);
                    this.$strategyInfoFlow = flow;
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C2393744 c2393744 = new C2393744(this.$strategyInfoFlow, this.this$0, continuation);
                    c2393744.L$0 = obj;
                    return c2393744;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2393744) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.$strategyInfoFlow), new C23870xf3f65a93(null, this.this$0, (CoroutineScope) this.L$0));
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "navigationKey", "Lcom/robinhood/android/navigation/keys/NavigationKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$44$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$44$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<NavigationKey, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(NavigationKey navigationKey, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(navigationKey, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.submit(new OptionsDetailPageEvent.IacBottomSheetEvent((NavigationKey) this.L$0));
                        return Unit.INSTANCE;
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {872}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45 */
            static final class C2393845 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C2393845(Continuation<? super C2393845> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C2393845(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2393845) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends OptionsDetailPagePnlDataState2, ? extends Boolean>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$invokeSuspend$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Tuples2<? extends OptionsDetailPagePnlDataState2, ? extends Boolean>> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new C238722(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$invokeSuspend$$inlined$map$1$2 */
                            public static final class C238722<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return C238722.this.emit(null, this);
                                    }
                                }

                                public C238722(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageViewState optionsDetailPageViewState = (OptionsDetailPageViewState) obj;
                                        Tuples2 tuples2M3642to = Tuples4.m3642to(optionsDetailPageViewState.getPnlDataState(), optionsDetailPageViewState.getCurrentPageHasRealPosition());
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }), new C23871x4b144b72(null, OptionsDetailPageDuxo.this)));
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/CommonApiOptionStrategyBreakevenRequest;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {879, 884}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3, reason: invalid class name */
                static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiOptionStrategyBreakevenRequest3, ? extends Integer>, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                        anonymousClass3.L$0 = obj;
                        return anonymousClass3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOptionStrategyBreakevenRequest3, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                        return invoke2((Tuples2<? extends ApiOptionStrategyBreakevenRequest3, Integer>) tuples2, continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(Tuples2<? extends ApiOptionStrategyBreakevenRequest3, Integer> tuples2, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Integer num;
                        ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Tuples2 tuples2 = (Tuples2) this.L$0;
                            ApiOptionStrategyBreakevenRequest3 apiOptionStrategyBreakevenRequest3 = (ApiOptionStrategyBreakevenRequest3) tuples2.component1();
                            Integer num2 = (Integer) tuples2.component2();
                            if (num2 == null) {
                                return Unit.INSTANCE;
                            }
                            if (apiOptionStrategyBreakevenRequest3 == null) {
                                this.this$0.applyMutation(new AnonymousClass2(num2, null));
                                return Unit.INSTANCE;
                            }
                            if (apiOptionStrategyBreakevenRequest3 instanceof ApiOptionStrategyBreakevenRequestLegacy) {
                                this.L$0 = num2;
                                this.label = 1;
                                Object objFetchOptionStrategyBreakevenLegacy = this.this$0.optionStrategyDetailStore.fetchOptionStrategyBreakevenLegacy((ApiOptionStrategyBreakevenRequestLegacy) apiOptionStrategyBreakevenRequest3, this);
                                if (objFetchOptionStrategyBreakevenLegacy != coroutine_suspended) {
                                    num = num2;
                                    obj = objFetchOptionStrategyBreakevenLegacy;
                                    apiOptionStrategyBreakeven3 = (ApiOptionStrategyBreakeven3) obj;
                                }
                            } else {
                                if (!(apiOptionStrategyBreakevenRequest3 instanceof ApiOptionStrategyBreakevenRequest)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.L$0 = num2;
                                this.label = 2;
                                Object objFetchOptionStrategyBreakeven = this.this$0.optionStrategyDetailStore.fetchOptionStrategyBreakeven((ApiOptionStrategyBreakevenRequest) apiOptionStrategyBreakevenRequest3, this);
                                if (objFetchOptionStrategyBreakeven != coroutine_suspended) {
                                    num = num2;
                                    obj = objFetchOptionStrategyBreakeven;
                                    apiOptionStrategyBreakeven3 = (ApiOptionStrategyBreakeven3) obj;
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i == 1) {
                            num = (Integer) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            apiOptionStrategyBreakeven3 = (ApiOptionStrategyBreakeven3) obj;
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            num = (Integer) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            apiOptionStrategyBreakeven3 = (ApiOptionStrategyBreakeven3) obj;
                        }
                        this.this$0.applyMutation(new AnonymousClass1(num, apiOptionStrategyBreakeven3, null));
                        return Unit.INSTANCE;
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                        final /* synthetic */ ApiOptionStrategyBreakeven3 $breakeven;
                        final /* synthetic */ Integer $index;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Integer num, ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$index = num;
                            this.$breakeven = apiOptionStrategyBreakeven3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$index, this.$breakeven, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                            int iIntValue = this.$index.intValue();
                            final ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3 = this.$breakeven;
                            return optionsDetailPageDataState.copyTo(iIntValue, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2393845.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(apiOptionStrategyBreakeven3, (OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(ApiOptionStrategyBreakeven3 apiOptionStrategyBreakeven3, OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, apiOptionStrategyBreakeven3, null, -1073741825, null);
                        }
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                        final /* synthetic */ Integer $index;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(Integer num, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$index = num;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$index, continuation);
                            anonymousClass2.L$0 = obj;
                            return anonymousClass2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass2) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return ((OptionsDetailPageDataState) this.L$0).copyTo(this.$index.intValue(), new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$45$3$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2393845.AnonymousClass3.AnonymousClass2.invokeSuspend$lambda$0((OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -1073741825, null);
                        }
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {928}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46 */
            static final class C2393946 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C2393946(Continuation<? super C2393946> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C2393946(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2393946) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends OptionsDetailPagePnlDataState2, ? extends Boolean>>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$invokeSuspend$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Tuples2<? extends OptionsDetailPagePnlDataState2, ? extends Boolean>> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new C238762(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$invokeSuspend$$inlined$map$1$2 */
                            public static final class C238762<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$invokeSuspend$$inlined$map$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return C238762.this.emit(null, this);
                                    }
                                }

                                public C238762(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageViewState optionsDetailPageViewState = (OptionsDetailPageViewState) obj;
                                        Tuples2 tuples2M3642to = Tuples4.m3642to(optionsDetailPageViewState.getPnlDataState(), optionsDetailPageViewState.getCurrentPageHasRealPosition());
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }), new C23875xa2323c51(null, OptionsDetailPageDuxo.this)));
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/CommonApiOptionPositionReturnRequest;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {935, 940}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3, reason: invalid class name */
                static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiOptionPositionReturnRequest3, ? extends Integer>, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                        anonymousClass3.L$0 = obj;
                        return anonymousClass3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOptionPositionReturnRequest3, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                        return invoke2((Tuples2<? extends ApiOptionPositionReturnRequest3, Integer>) tuples2, continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(Tuples2<? extends ApiOptionPositionReturnRequest3, Integer> tuples2, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Integer num;
                        ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Tuples2 tuples2 = (Tuples2) this.L$0;
                            ApiOptionPositionReturnRequest3 apiOptionPositionReturnRequest3 = (ApiOptionPositionReturnRequest3) tuples2.component1();
                            Integer num2 = (Integer) tuples2.component2();
                            if (num2 == null) {
                                return Unit.INSTANCE;
                            }
                            if (apiOptionPositionReturnRequest3 == null) {
                                this.this$0.applyMutation(new AnonymousClass2(num2, null));
                                return Unit.INSTANCE;
                            }
                            if (apiOptionPositionReturnRequest3 instanceof ApiOptionPositionReturnRequestLegacy) {
                                this.L$0 = num2;
                                this.label = 1;
                                Object objFetchOptionTodayTotalReturnLegacy = this.this$0.optionStrategyDetailStore.fetchOptionTodayTotalReturnLegacy((ApiOptionPositionReturnRequestLegacy) apiOptionPositionReturnRequest3, this);
                                if (objFetchOptionTodayTotalReturnLegacy != coroutine_suspended) {
                                    num = num2;
                                    obj = objFetchOptionTodayTotalReturnLegacy;
                                    apiOptionTodayTotalReturnResponse3 = (ApiOptionTodayTotalReturnResponse3) obj;
                                }
                            } else {
                                if (!(apiOptionPositionReturnRequest3 instanceof ApiOptionPositionReturnRequest)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.L$0 = num2;
                                this.label = 2;
                                Object objFetchOptionTodayTotalReturn = this.this$0.optionStrategyDetailStore.fetchOptionTodayTotalReturn((ApiOptionPositionReturnRequest) apiOptionPositionReturnRequest3, this);
                                if (objFetchOptionTodayTotalReturn != coroutine_suspended) {
                                    num = num2;
                                    obj = objFetchOptionTodayTotalReturn;
                                    apiOptionTodayTotalReturnResponse3 = (ApiOptionTodayTotalReturnResponse3) obj;
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i == 1) {
                            num = (Integer) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            apiOptionTodayTotalReturnResponse3 = (ApiOptionTodayTotalReturnResponse3) obj;
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            num = (Integer) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            apiOptionTodayTotalReturnResponse3 = (ApiOptionTodayTotalReturnResponse3) obj;
                        }
                        this.this$0.applyMutation(new AnonymousClass1(num, apiOptionTodayTotalReturnResponse3, null));
                        return Unit.INSTANCE;
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                        final /* synthetic */ Integer $index;
                        final /* synthetic */ ApiOptionTodayTotalReturnResponse3 $todayTotalReturn;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Integer num, ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$index = num;
                            this.$todayTotalReturn = apiOptionTodayTotalReturnResponse3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$index, this.$todayTotalReturn, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                            int iIntValue = this.$index.intValue();
                            final ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3 = this.$todayTotalReturn;
                            return optionsDetailPageDataState.copyTo(iIntValue, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2393946.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(apiOptionTodayTotalReturnResponse3, (OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, apiOptionTodayTotalReturnResponse3, Integer.MAX_VALUE, null);
                        }
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                        final /* synthetic */ Integer $index;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(Integer num, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$index = num;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$index, continuation);
                            anonymousClass2.L$0 = obj;
                            return anonymousClass2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass2) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return ((OptionsDetailPageDataState) this.L$0).copyTo(this.$index.intValue(), new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$46$3$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2393946.AnonymousClass3.AnonymousClass2.invokeSuspend$lambda$0((OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
                        }
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {978}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47 */
            static final class C2394047 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Flow<Tuples2<UiOptionStrategyInfo, Integer>> $strategyInfoFlow;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2394047(Flow<Tuples2<UiOptionStrategyInfo, Integer>> flow, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C2394047> continuation) {
                    super(2, continuation);
                    this.$strategyInfoFlow = flow;
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2394047(this.$strategyInfoFlow, this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2394047) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.transformLatest(this.$strategyInfoFlow, new C23879xf9502d30(null, this.this$0)), new C23880xf9502d31(null, this.this$0));
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012<\u0010\u0002\u001a8\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u0007 \b*\u001b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/IacInfoBanner;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$3", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$3, reason: invalid class name */
                static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends IacInfoBanner>, ? extends Integer>, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                        anonymousClass3.L$0 = obj;
                        return anonymousClass3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends IacInfoBanner>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                        return invoke2((Tuples2<? extends List<IacInfoBanner>, Integer>) tuples2, continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(Tuples2<? extends List<IacInfoBanner>, Integer> tuples2, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$3$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$3$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {

                        /* renamed from: $i */
                        final /* synthetic */ int f4800$i;
                        final /* synthetic */ List<IacInfoBanner> $infoBanners;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(int i, List<IacInfoBanner> list, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.f4800$i = i;
                            this.$infoBanners = list;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4800$i, this.$infoBanners, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                            int i = this.f4800$i;
                            final List<IacInfoBanner> list = this.$infoBanners;
                            return optionsDetailPageDataState.copyTo(i, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionsDetailPageDuxo.C2394047.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(list, (OptionsDetailPageDataState.PageData) obj2);
                                }
                            });
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(List list, OptionsDetailPageDataState.PageData pageData) {
                            return OptionsDetailPageDataState.PageData.copy$default(pageData, null, null, null, null, null, null, null, null, null, null, (IacInfoBanner) CollectionsKt.singleOrNull(list), null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -1025, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            Tuples2 tuples2 = (Tuples2) this.L$0;
                            Object objComponent1 = tuples2.component1();
                            Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
                            this.this$0.applyMutation(new AnonymousClass1(((Number) tuples2.component2()).intValue(), (List) objComponent1, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$48", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {987}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$48 */
            static final class C2394148 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C2394148(Continuation<? super C2394148> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C2394148(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2394148) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<Boolean> flowStreamIsInOptionsPipExperiment = OptionsDetailPageDuxo.this.pipSupportStore.streamIsInOptionsPipExperiment();
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowStreamIsInOptionsPipExperiment, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$48$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$48$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    /* synthetic */ boolean Z$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                        anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return invoke(bool.booleanValue(), continuation);
                    }

                    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$48$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$48$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C503701 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                        final /* synthetic */ boolean $it;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C503701(boolean z, Continuation<? super C503701> continuation) {
                            super(2, continuation);
                            this.$it = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C503701 c503701 = new C503701(this.$it, continuation);
                            c503701.L$0 = obj;
                            return c503701;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((C503701) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, this.$it, false, null, null, false, false, null, 33292287, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.applyMutation(new C503701(this.Z$0, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$49", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {996}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$49 */
            static final class C2394249 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C2394249(Continuation<? super C2394249> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C2394249(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C2394249) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(OptionsDetailPageDuxo.this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$49$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$49$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    /* synthetic */ boolean Z$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                        anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return invoke(bool.booleanValue(), continuation);
                    }

                    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$49$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$49$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C503711 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                        final /* synthetic */ boolean $it;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C503711(boolean z, Continuation<? super C503711> continuation) {
                            super(2, continuation);
                            this.$it = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C503711 c503711 = new C503711(this.$it, continuation);
                            c503711.L$0 = obj;
                            return c503711;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                            return ((C503711) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, this.$it, null, 25165823, null);
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.applyMutation(new C503711(this.Z$0, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$50", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$50 */
            static final class C2394350 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C2394350(Continuation<? super C2394350> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C2394350 c2394350 = OptionsDetailPageDuxo.this.new C2394350(continuation);
                    c2394350.L$0 = obj;
                    return c2394350;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C2394350) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, OptionsDetailPageDuxo.this.optionsDetailPageIndexCurbHoursTooltipPref, null, false, false, null, 32505855, null);
                }
            }

            public final void markInfoBannerSeen(UUID receiptUuid) {
                Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
                LifecycleHost.DefaultImpls.bind$default(this, this.infoBannerStore.postSeen(receiptUuid), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
            }

            public final void tapInfoBanner(Navigator navigator, Context context, UUID receiptUuid, GenericAction action) {
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
                if (action instanceof GenericAction.DeeplinkAction) {
                    GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) action;
                    Navigator.DefaultImpls.handleDeepLink$default(navigator, context, deeplinkAction.getUri(), null, null, false, null, 60, null);
                    LifecycleHost.DefaultImpls.bind$default(this, this.infoBannerStore.postTapped(receiptUuid, deeplinkAction.getUri().toString()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
                }
            }

            public final void dismissInfoBanner(UUID receiptUuid) {
                Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
                LifecycleHost.DefaultImpls.bind$default(this, this.infoBannerStore.postDismissed(receiptUuid, IacDismissMethod.PASSIVE), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
            }

            @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
            public void onStart() {
                super.onStart();
                Observable observableDistinctUntilChanged = MarketHoursStore.getAndRefreshNextOpenMarketHours$default(this.marketHoursStore, false, false, 3, null).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.onStart$lambda$15(this.f$0, (MarketHours) obj);
                    }
                });
                LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamAllSelfDirectedAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.onStart$lambda$16(this.f$0, (List) obj);
                    }
                });
                Single map = this.brokerageResourceManager.loadResource(BrokerageDisclosure.OPTIONS_DETAIL_DISCLOSURE_SHORT).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.onStart.3
                    @Override // io.reactivex.functions.Function
                    public final String apply(Disclosure it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Markwons.toSpanned$default(OptionsDetailPageDuxo.this.markwon, it.getContent(), null, 2, null).toString();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.onStart$lambda$17(this.f$0, (String) obj);
                    }
                });
                LifecycleHost.DefaultImpls.bind$default(this, this.showAverageCostRetirementTooltipPrefs.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.onStart$lambda$18(this.f$0, ((Boolean) obj).booleanValue());
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onStart$lambda$15(OptionsDetailPageDuxo optionsDetailPageDuxo, MarketHours marketHours) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$onStart$1$1(marketHours, null));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onStart$lambda$16(OptionsDetailPageDuxo optionsDetailPageDuxo, List accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$onStart$2$1(accounts2, null));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onStart$lambda$17(OptionsDetailPageDuxo optionsDetailPageDuxo, String str) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$onStart$4$1(str, null));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit onStart$lambda$18(OptionsDetailPageDuxo optionsDetailPageDuxo, boolean z) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$onStart$5$1(z, null));
                return Unit.INSTANCE;
            }

            @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
            public void onStop() {
                super.onStop();
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239581(null), 3, null);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1081}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1 */
            static final class C239581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C239581(Continuation<? super C239581> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C239581(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowTake = FlowKt.take(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageLoggingState currentLoggingState = ((OptionsDetailPageViewState) obj).getCurrentLoggingState();
                                        if (currentLoggingState != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(currentLoggingState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onStop$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.logDisappear((OptionsDetailPageLoggingState) this.L$0);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            private final void initializeAccountNumber() {
                OptionsDetailPageLaunchMode launchMode = ((OptionsDetailPageFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getLaunchMode();
                String accountNumber = launchMode.getAccountNumber();
                Observable<String> accountNumberFromInitialIdObs = getAccountNumberFromInitialIdObs(launchMode);
                if (accountNumber != null) {
                    accountNumberFromInitialIdObs = Observable.just(accountNumber);
                    Intrinsics.checkNotNullExpressionValue(accountNumberFromInitialIdObs, "just(...)");
                } else if (accountNumberFromInitialIdObs == null) {
                    accountNumberFromInitialIdObs = this.accountProvider.streamIndividualAccountNumber();
                }
                Single<String> singleFirstOrError = accountNumberFromInitialIdObs.take(1L).firstOrError();
                Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
                LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.initializeAccountNumber$lambda$19(this.f$0, (String) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit initializeAccountNumber$lambda$19(OptionsDetailPageDuxo optionsDetailPageDuxo, String str) {
                optionsDetailPageDuxo.optionAccountSwitcherStore.setActiveAccountNumber(str);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private final void initializeStrategyCodes() {
                Single singleJust;
                Observable observableSwitchMap;
                final OptionsDetailPageLaunchMode launchMode = ((OptionsDetailPageFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getLaunchMode();
                if (launchMode instanceof OptionsDetailPageLaunchMode2) {
                    OptionsDetailPageLaunchMode2 optionsDetailPageLaunchMode2 = (OptionsDetailPageLaunchMode2) launchMode;
                    if (optionsDetailPageLaunchMode2.getPositionIds() != null) {
                        observableSwitchMap = streamStrategyCodeToPositionIds(optionsDetailPageLaunchMode2);
                    } else {
                        Observable<String> accountNumberFromInitialIdObs = getAccountNumberFromInitialIdObs(launchMode);
                        if (accountNumberFromInitialIdObs == null) {
                            final StateFlow stateFlow = getStateFlow();
                            accountNumberFromInitialIdObs = asObservable(new Flow<String>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeStrategyCodes$$inlined$mapNotNull$1
                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeStrategyCodes$$inlined$mapNotNull$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeStrategyCodes$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeStrategyCodes$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector) {
                                        this.$this_unsafeFlow = flowCollector;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i = anonymousClass1.label;
                                            if ((i & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
                                                anonymousClass1 = new AnonymousClass1(continuation);
                                            }
                                        }
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = anonymousClass1.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            String currentAccountNumber = ((OptionsDetailPageViewState) obj).getCurrentAccountNumber();
                                            if (currentAccountNumber != null) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(currentAccountNumber, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i2 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            });
                        }
                        observableSwitchMap = accountNumberFromInitialIdObs.switchMap(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeStrategyCodes$strategyCodeListToCurrentIndexSingle$strategyCodeToPositionIdObs$1
                            @Override // io.reactivex.functions.Function
                            public final ObservableSource<? extends List<Tuples2<String, UUID>>> apply(String accountNumber) {
                                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                                return this.this$0.streamStrategyCodeToPositionIdsByAccountNumber((OptionsDetailPageLaunchMode2) launchMode, accountNumber);
                            }
                        });
                    }
                    singleJust = observableSwitchMap.filter(new Predicate() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeStrategyCodes$strategyCodeListToCurrentIndexSingle$1
                        @Override // io.reactivex.functions.Predicate
                        public final boolean test(List<Tuples2<String, UUID>> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return !it.isEmpty();
                        }
                    }).take(1L).firstOrError().map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeStrategyCodes$strategyCodeListToCurrentIndexSingle$2
                        @Override // io.reactivex.functions.Function
                        public final Tuples2<List<String>, Integer> apply(List<Tuples2<String, UUID>> strategyCodeToIdList) {
                            Intrinsics.checkNotNullParameter(strategyCodeToIdList, "strategyCodeToIdList");
                            List<Tuples2<String, UUID>> list = strategyCodeToIdList;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((String) ((Tuples2) it.next()).getFirst());
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add((UUID) ((Tuples2) it2.next()).getSecond());
                            }
                            return Tuples4.m3642to(arrayList, OptionsDetailPageDuxoKt.defaultIndex(arrayList2, ((OptionsDetailPageLaunchMode2) launchMode).getInitialPositionId()));
                        }
                    });
                } else if (launchMode instanceof OptionsDetailPageLaunchMode.StrategyCode) {
                    OptionsDetailPageLaunchMode.StrategyCode strategyCode = (OptionsDetailPageLaunchMode.StrategyCode) launchMode;
                    singleJust = Single.just(Tuples4.m3642to(strategyCode.getStrategyCodeList(), OptionsDetailPageDuxoKt.defaultIndex(strategyCode.getStrategyCodeList(), strategyCode.getInitialStrategyCode())));
                } else {
                    throw new IllegalStateException(("Unknown launchMode: " + launchMode + "!").toString());
                }
                Intrinsics.checkNotNull(singleJust);
                LifecycleHost.DefaultImpls.bind$default(this, singleJust, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.initializeStrategyCodes$lambda$21(this.f$0, (Tuples2) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit initializeStrategyCodes$lambda$21(OptionsDetailPageDuxo optionsDetailPageDuxo, Tuples2 tuples2) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$initializeStrategyCodes$1$1((Integer) tuples2.component2(), (List) tuples2.component1(), null));
                return Unit.INSTANCE;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeIsLegContext$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$initializeIsLegContext$1 */
            static final class C238951 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C238951(Continuation<? super C238951> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C238951 c238951 = OptionsDetailPageDuxo.this.new C238951(continuation);
                    c238951.L$0 = obj;
                    return c238951;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C238951) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, OptionsDetailPageDuxoKt.isLegContext((OptionsDetailPageFragment.Args) OptionsDetailPageDuxo.INSTANCE.getArgs((HasSavedState) OptionsDetailPageDuxo.this)), null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554399, null);
                }
            }

            private final void initializeIsLegContext() {
                applyMutation(new C238951(null));
            }

            private final void initializeExperiment() {
                Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{ProfitAndLossAverageCostRetirementExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.initializeExperiment$lambda$22(this.f$0, (Boolean) obj);
                    }
                });
                Observable observableDistinctUntilChanged2 = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{BidAskSdpStatsExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.initializeExperiment$lambda$23(this.f$0, (Boolean) obj);
                    }
                });
                Observable observableDistinctUntilChanged3 = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.IndexOptionsExtendedHoursCurb.INSTANCE}, false, null, 6, null).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.initializeExperiment$lambda$24(this.f$0, (Boolean) obj);
                    }
                });
                Observable observableDistinctUntilChanged4 = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsPortfolioRiskAnalyzer.INSTANCE}, false, null, 6, null).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.initializeExperiment$lambda$25(this.f$0, (Boolean) obj);
                    }
                });
                Observable observableDistinctUntilChanged5 = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, Experiments.OptionsMultiLegGreek.INSTANCE, Experiments.OptionsMultiLegGreek.Variant.CONTROL, false, 4, null).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsDetailPageDuxo.initializeExperiment$lambda$26(this.f$0, (Experiments.OptionsMultiLegGreek.Variant) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit initializeExperiment$lambda$22(OptionsDetailPageDuxo optionsDetailPageDuxo, Boolean bool) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$initializeExperiment$1$1(bool, null));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit initializeExperiment$lambda$23(OptionsDetailPageDuxo optionsDetailPageDuxo, Boolean bool) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$initializeExperiment$2$1(bool, null));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit initializeExperiment$lambda$24(OptionsDetailPageDuxo optionsDetailPageDuxo, Boolean bool) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$initializeExperiment$3$1(bool, null));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit initializeExperiment$lambda$25(OptionsDetailPageDuxo optionsDetailPageDuxo, Boolean bool) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$initializeExperiment$4$1(bool, null));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit initializeExperiment$lambda$26(OptionsDetailPageDuxo optionsDetailPageDuxo, Experiments.OptionsMultiLegGreek.Variant variant) {
                optionsDetailPageDuxo.applyMutation(new OptionsDetailPageDuxo$initializeExperiment$5$1(variant, null));
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private final Observable<String> getAccountNumberFromInitialIdObs(OptionsDetailPageLaunchMode optionsDetailPageLaunchMode) {
                UUID initialPositionId;
                if (!(optionsDetailPageLaunchMode instanceof OptionsDetailPageLaunchMode2) || (initialPositionId = ((OptionsDetailPageLaunchMode2) optionsDetailPageLaunchMode).getInitialPositionId()) == null) {
                    return null;
                }
                if (optionsDetailPageLaunchMode instanceof OptionsDetailPageLaunchMode.AggregatePositionId) {
                    return this.aggregateOptionPositionStore.getStreamPositionsFromAggregateIdsIncludingZeroQuantity().asObservable(CollectionsKt.listOf(initialPositionId)).filter(new Predicate() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.getAccountNumberFromInitialIdObs.1
                        @Override // io.reactivex.functions.Predicate
                        public final boolean test(List<AggregateOptionPosition> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return !it.isEmpty();
                        }
                    }).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.getAccountNumberFromInitialIdObs.2
                        @Override // io.reactivex.functions.Function
                        public final String apply(List<AggregateOptionPosition> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return ((AggregateOptionPosition) CollectionsKt.first((List) it)).getAccountNumber();
                        }
                    });
                }
                if (!(optionsDetailPageLaunchMode instanceof OptionsDetailPageLaunchMode.OptionPositionId)) {
                    throw new NoWhenBranchMatchedException();
                }
                return this.optionPositionStore.getStreamUiOptionPositionsFromPositionIds().asObservable(new ApiOptionPositionsFromIdsRequest(CollectionsKt.listOf(initialPositionId), false)).filter(new Predicate() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.getAccountNumberFromInitialIdObs.3
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(List<UiOptionInstrumentPosition> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return !it.isEmpty();
                    }
                }).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.getAccountNumberFromInitialIdObs.4
                    @Override // io.reactivex.functions.Function
                    public final String apply(List<UiOptionInstrumentPosition> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return ((UiOptionInstrumentPosition) CollectionsKt.first((List) it)).getOptionInstrumentPosition().getAccountNumber();
                    }
                });
            }

            private final Observable<List<Tuples2<String, UUID>>> streamStrategyCodeToPositionIds(OptionsDetailPageLaunchMode2 optionsDetailPageLaunchMode2) {
                List<UUID> positionIds = optionsDetailPageLaunchMode2.getPositionIds();
                if (positionIds == null) {
                    Observable<List<Tuples2<String, UUID>>> observableJust = Observable.just(CollectionsKt.emptyList());
                    Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                    return observableJust;
                }
                if (optionsDetailPageLaunchMode2 instanceof OptionsDetailPageLaunchMode.AggregatePositionId) {
                    Observable map = this.aggregateOptionPositionStore.getStreamPositionsFromAggregateIdsIncludingZeroQuantity().asObservable(positionIds).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.streamStrategyCodeToPositionIds.1
                        @Override // io.reactivex.functions.Function
                        public final List<Tuples2<String, UUID>> apply(List<AggregateOptionPosition> list) {
                            Intrinsics.checkNotNullParameter(list, "list");
                            List<AggregateOptionPosition> list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            for (AggregateOptionPosition aggregateOptionPosition : list2) {
                                arrayList.add(Tuples4.m3642to(aggregateOptionPosition.getStrategyCode(), aggregateOptionPosition.getId()));
                            }
                            return arrayList;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    return map;
                }
                if (!(optionsDetailPageLaunchMode2 instanceof OptionsDetailPageLaunchMode.OptionPositionId)) {
                    throw new NoWhenBranchMatchedException();
                }
                Observable map2 = this.optionPositionStore.getStreamUiOptionPositionsFromPositionIds().asObservable(new ApiOptionPositionsFromIdsRequest(positionIds, false)).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.streamStrategyCodeToPositionIds.2
                    @Override // io.reactivex.functions.Function
                    public final List<Tuples2<String, UUID>> apply(List<UiOptionInstrumentPosition> list) {
                        Intrinsics.checkNotNullParameter(list, "list");
                        List<UiOptionInstrumentPosition> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (UiOptionInstrumentPosition uiOptionInstrumentPosition : list2) {
                            arrayList.add(Tuples4.m3642to(uiOptionInstrumentPosition.getStrategyCode(), uiOptionInstrumentPosition.getOptionInstrumentPosition().getId()));
                        }
                        return arrayList;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final Observable<List<Tuples2<String, UUID>>> streamStrategyCodeToPositionIdsByAccountNumber(OptionsDetailPageLaunchMode2 optionsDetailPageLaunchMode2, String str) {
                if (optionsDetailPageLaunchMode2 instanceof OptionsDetailPageLaunchMode.AggregatePositionId) {
                    AggregateOptionPositionStore.refresh$default(this.aggregateOptionPositionStore, false, null, str, 2, null);
                    Observable<List<Tuples2<String, UUID>>> map = AggregateOptionPositionStore.streamUiAggregateOptionPositionsSimple$default(this.aggregateOptionPositionStore, str, null, 2, null).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.streamStrategyCodeToPositionIdsByAccountNumber.1
                        @Override // io.reactivex.functions.Function
                        public final List<Tuples2<String, UUID>> apply(List<UiAggregateOptionPositionSimple> aggregateOptionPositions) {
                            Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
                            List<UiAggregateOptionPositionSimple> list = aggregateOptionPositions;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            for (UiAggregateOptionPositionSimple uiAggregateOptionPositionSimple : list) {
                                arrayList.add(Tuples4.m3642to(uiAggregateOptionPositionSimple.getAggregateOptionPosition().getStrategyCode(), uiAggregateOptionPositionSimple.getId()));
                            }
                            return arrayList;
                        }
                    });
                    Intrinsics.checkNotNull(map);
                    return map;
                }
                if (!(optionsDetailPageLaunchMode2 instanceof OptionsDetailPageLaunchMode.OptionPositionId)) {
                    throw new NoWhenBranchMatchedException();
                }
                OptionPositionStore.refresh$default(this.optionPositionStore, false, (UUID) null, str, 2, (Object) null);
                Observable map2 = this.optionPositionStore.getStreamUiOptionPositions().asObservable(Tuples4.m3642to(str, Optional2.INSTANCE)).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo.streamStrategyCodeToPositionIdsByAccountNumber.2
                    @Override // io.reactivex.functions.Function
                    public final List<Tuples2<String, UUID>> apply(List<UiOptionInstrumentPosition> uiOptionInstrumentPositions) {
                        Intrinsics.checkNotNullParameter(uiOptionInstrumentPositions, "uiOptionInstrumentPositions");
                        List<UiOptionInstrumentPosition> list = uiOptionInstrumentPositions;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (UiOptionInstrumentPosition uiOptionInstrumentPosition : list) {
                            arrayList.add(Tuples4.m3642to(uiOptionInstrumentPosition.getStrategyCode(), uiOptionInstrumentPosition.getOptionInstrumentPosition().getId()));
                        }
                        return arrayList;
                    }
                });
                Intrinsics.checkNotNull(map2);
                return map2;
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$updateDayNightOverlay$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$updateDayNightOverlay$1 */
            static final class C239661 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                final /* synthetic */ boolean $isDay;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239661(boolean z, Continuation<? super C239661> continuation) {
                    super(2, continuation);
                    this.$isDay = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C239661 c239661 = new C239661(this.$isDay, continuation);
                    c239661.L$0 = obj;
                    return c239661;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C239661) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, this.$isDay, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554415, null);
                }
            }

            public final void updateDayNightOverlay(boolean isDay) {
                applyMutation(new C239661(isDay, null));
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1 */
            static final class C239001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $showCandlestick;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239001(boolean z, Continuation<? super C239001> continuation) {
                    super(2, continuation);
                    this.$showCandlestick = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C239001(this.$showCandlestick, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowTake = FlowKt.take(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageLoggingState currentLoggingState = ((OptionsDetailPageViewState) obj).getCurrentLoggingState();
                                        if (currentLoggingState != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(currentLoggingState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, this.$showCandlestick, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCandlestickSwitchClicked$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                    final /* synthetic */ boolean $showCandlestick;
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, boolean z, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                        this.$showCandlestick = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$showCandlestick, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        String str;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageLoggingState optionsDetailPageLoggingState = (OptionsDetailPageLoggingState) this.L$0;
                            EventLogger eventLogger = this.this$0.eventLogger;
                            Component.ComponentType componentType = Component.ComponentType.BUTTON;
                            if (this.$showCandlestick) {
                                str = "candlestick_chart";
                            } else {
                                str = "line_chart";
                            }
                            OptionsDetailPageLoggings.logCandlestickSwitchClicked(eventLogger, optionsDetailPageLoggingState, new Component(componentType, str, null, 4, null));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            public final void onCandlestickSwitchClicked(boolean showCandlestick) {
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239001(showCandlestick, null), 3, null);
                this.showCandlestickChartPref.set(showCandlestick);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1309}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1 */
            static final class C239511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $showAllHours;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239511(boolean z, Continuation<? super C239511> continuation) {
                    super(2, continuation);
                    this.$showAllHours = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C239511(this.$showAllHours, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowTake = FlowKt.take(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageLoggingState currentLoggingState = ((OptionsDetailPageViewState) obj).getCurrentLoggingState();
                                        if (currentLoggingState != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(currentLoggingState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, this.$showAllHours, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onShowAllHoursToggled$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                    final /* synthetic */ boolean $showAllHours;
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, boolean z, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                        this.$showAllHours = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$showAllHours, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        UserInteractionEventData.Action action;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageLoggingState optionsDetailPageLoggingState = (OptionsDetailPageLoggingState) this.L$0;
                            EventLogger eventLogger = this.this$0.eventLogger;
                            Component component = new Component(Component.ComponentType.TOGGLE, "chart_show_all_hours_toggle", null, 4, null);
                            if (this.$showAllHours) {
                                action = UserInteractionEventData.Action.TOGGLE_ON;
                            } else {
                                action = UserInteractionEventData.Action.TOGGLE_OFF;
                            }
                            OptionsDetailPageLoggings.logShowAllHoursToggled(eventLogger, optionsDetailPageLoggingState, component, action);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            public final void onShowAllHoursToggled(boolean showAllHours) {
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239511(showAllHours, null), 3, null);
                this.showAllHoursChartPref.set(showAllHours);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1333}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1 */
            static final class C239611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C239611(Continuation<? super C239611> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C239611(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final Flow flowTake = FlowKt.take(OptionsDetailPageDuxo.this.getStateFlow(), 1);
                        Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                                Object objCollect = flowTake.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    BrokerageAccountType brokerageAccountType;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        Account currentAccount = ((OptionsDetailPageViewState) obj).getCurrentAccount();
                                        Boolean boolBoxBoolean = (currentAccount == null || (brokerageAccountType = currentAccount.getBrokerageAccountType()) == null) ? null : boxing.boxBoolean(brokerageAccountType.isRetirement());
                                        if (boolBoxBoolean != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        };
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isRetirement", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$recordSeenTooltip$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    /* synthetic */ boolean Z$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                        anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return invoke(bool.booleanValue(), continuation);
                    }

                    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (this.Z$0) {
                            this.this$0.showAverageCostRetirementTooltipPrefs.set(false);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            public final void recordSeenTooltip(OptionsDetailPageDataCell2 tooltip) {
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                if (tooltip instanceof OptionsDetailPageDataCell2.AverageCostTooltip) {
                    BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239611(null), 3, null);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSpanChanged$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSpanChanged$1 */
            static final class C239561 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                final /* synthetic */ DisplaySpan $displaySpan;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239561(DisplaySpan displaySpan, Continuation<? super C239561> continuation) {
                    super(2, continuation);
                    this.$displaySpan = displaySpan;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C239561 c239561 = new C239561(this.$displaySpan, continuation);
                    c239561.L$0 = obj;
                    return c239561;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C239561) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                    Integer currentIndex = optionsDetailPageDataState.getCurrentIndex();
                    if (currentIndex == null) {
                        return optionsDetailPageDataState;
                    }
                    int iIntValue = currentIndex.intValue();
                    final DisplaySpan displaySpan = this.$displaySpan;
                    return optionsDetailPageDataState.copyTo(iIntValue, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSpanChanged$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionsDetailPageDuxo.C239561.invokeSuspend$lambda$0(displaySpan, (OptionsDetailPageDataState.PageData) obj2);
                        }
                    });
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionsDetailPageDataState.PageData invokeSuspend$lambda$0(DisplaySpan displaySpan, OptionsDetailPageDataState.PageData pageData) {
                    return OptionsDetailPageDataState.PageData.copy$default(pageData, displaySpan, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, 0L, null, null, null, null, null, null, null, null, null, null, -2, null);
                }
            }

            public final void onSpanChanged(DisplaySpan displaySpan) {
                Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
                applyMutation(new C239561(displaySpan, null));
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1 */
            static final class C239491 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                final /* synthetic */ int $newIndex;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239491(int i, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C239491> continuation) {
                    super(2, continuation);
                    this.$newIndex = i;
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C239491 c239491 = new C239491(this.$newIndex, this.this$0, continuation);
                    c239491.L$0 = obj;
                    return c239491;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C239491) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionsDetailPageDataState optionsDetailPageDataState = (OptionsDetailPageDataState) this.L$0;
                    Integer currentIndex = optionsDetailPageDataState.getCurrentIndex();
                    OptionsDetailPageDataState optionsDetailPageDataStateCopy$default = OptionsDetailPageDataState.copy$default(optionsDetailPageDataState, null, boxing.boxInt(this.$newIndex), null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554429, null);
                    if (currentIndex != null) {
                        if (currentIndex.intValue() != this.$newIndex) {
                            BuildersKt__Builders_commonKt.launch$default(this.this$0.getLifecycleScope(), null, null, new AnonymousClass1(this.this$0, currentIndex, null), 3, null);
                        }
                    }
                    return optionsDetailPageDataStateCopy$default;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1361}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Integer $oldIndex;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionsDetailPageDuxo optionsDetailPageDuxo, Integer num, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                        this.$oldIndex = num;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$oldIndex, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            final StateFlow<OptionsDetailPageViewState> stateFlow = this.this$0.getStateFlow();
                            final Integer num = this.$oldIndex;
                            Flow flowTake = FlowKt.take(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1$invokeSuspend$$inlined$mapNotNull$1
                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, num), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements FlowCollector {
                                    final /* synthetic */ Integer $oldIndex$inlined;
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(FlowCollector flowCollector, Integer num) {
                                        this.$this_unsafeFlow = flowCollector;
                                        this.$oldIndex$inlined = num;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i = anonymousClass1.label;
                                            if ((i & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
                                                anonymousClass1 = new AnonymousClass1(continuation);
                                            }
                                        }
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = anonymousClass1.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            OptionsDetailPageState optionsDetailPageState = (OptionsDetailPageState) CollectionsKt.getOrNull(((OptionsDetailPageViewState) obj).getPageStates(), this.$oldIndex$inlined.intValue());
                                            OptionsDetailPageLoggingState loggingState = optionsDetailPageState != null ? optionsDetailPageState.getLoggingState() : null;
                                            if (loggingState != null) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(loggingState, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i2 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, 1);
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: OptionsDetailPageDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "previousState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCurrentPageUpdated$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                        /* synthetic */ Object L$0;
                        int label;
                        final /* synthetic */ OptionsDetailPageDuxo this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.this$0 = optionsDetailPageDuxo;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                            anonymousClass2.L$0 = obj;
                            return anonymousClass2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.this$0.logDisappear((OptionsDetailPageLoggingState) this.L$0);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
            }

            public final void onCurrentPageUpdated(int newIndex) {
                applyMutation(new C239491(newIndex, this, null));
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onUpsellDismissed$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onUpsellDismissed$1 */
            static final class C239601 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C239601(Continuation<? super C239601> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C239601 c239601 = new C239601(continuation);
                    c239601.L$0 = obj;
                    return c239601;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C239601) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, false, false, null, 0, true, false, false, null, false, false, null, null, false, false, null, 33538047, null);
                }
            }

            private final void onUpsellDismissed() {
                applyMutation(new C239601(null));
            }

            public final void onLateCloseUpsellTapped() {
                OptionsDetailPageLoggings.logLateCloseUpsellTapped(this.eventLogger);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onLateCloseUpsellDismissed$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1381}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onLateCloseUpsellDismissed$1 */
            static final class C239501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UUID $chainId;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239501(UUID uuid, Continuation<? super C239501> continuation) {
                    super(2, continuation);
                    this.$chainId = uuid;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C239501(this.$chainId, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PostEndpoint<UUID, ApiLateCloseAnnouncementCardFlag> recordAnnouncementCardDismissed = OptionsDetailPageDuxo.this.lateCloseStore.getRecordAnnouncementCardDismissed();
                        UUID uuid = this.$chainId;
                        this.label = 1;
                        if (PostEndpoint.DefaultImpls.post$default(recordAnnouncementCardDismissed, uuid, null, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            public final void onLateCloseUpsellDismissed(UUID chainId) {
                Intrinsics.checkNotNullParameter(chainId, "chainId");
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239501(chainId, null), 3, null);
                OptionsDetailPageLoggings.logLateCloseUpsellDismissed(this.eventLogger);
                onUpsellDismissed();
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onTradebarHeightUpdated$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onTradebarHeightUpdated$1 */
            static final class C239591 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                final /* synthetic */ int $newHeight;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239591(int i, Continuation<? super C239591> continuation) {
                    super(2, continuation);
                    this.$newHeight = i;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C239591 c239591 = new C239591(this.$newHeight, continuation);
                    c239591.L$0 = obj;
                    return c239591;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C239591) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, false, false, null, this.$newHeight, false, false, false, null, false, false, null, null, false, false, null, 33546239, null);
                }
            }

            public final void onTradebarHeightUpdated(int newHeight) {
                applyMutation(new C239591(newHeight, null));
            }

            public final void onSimulatedReturnTooltipFirstAppear(OptionsSimulatedReturnTooltipState tooltipState) {
                Intrinsics.checkNotNullParameter(tooltipState, "tooltipState");
                OptionTooltip tooltip = tooltipState.getTooltip();
                this.optionTooltipStore.recordOptionTooltipSeen(tooltip.getReceiptId(), tooltipState.getAccountNumber());
                OptionTooltipDisplayBehavior displayBehavior = tooltip.getDisplayBehavior();
                Long displayMilliseconds = displayBehavior != null ? displayBehavior.getDisplayMilliseconds() : null;
                if (displayMilliseconds != null) {
                    BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239541(displayMilliseconds, this, null), 3, null);
                }
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239552(null), 3, null);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1401}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$1 */
            static final class C239541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Long $displayMilliseconds;
                int label;
                final /* synthetic */ OptionsDetailPageDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C239541(Long l, OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super C239541> continuation) {
                    super(2, continuation);
                    this.$displayMilliseconds = l;
                    this.this$0 = optionsDetailPageDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C239541(this.$displayMilliseconds, this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        long jLongValue = this.$displayMilliseconds.longValue();
                        this.label = 1;
                        if (DelayKt.delay(jLongValue, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$1$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                        return ((AnonymousClass1) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554175, null);
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1409}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2 */
            static final class C239552 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C239552(Continuation<? super C239552> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C239552(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowTake = FlowKt.take(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageLoggingState currentLoggingState = ((OptionsDetailPageViewState) obj).getCurrentLoggingState();
                                        if (currentLoggingState != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(currentLoggingState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipFirstAppear$2$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageLoggings.logOptionsDetailPageSimulatedReturnTooltipAppear(this.this$0.eventLogger, (OptionsDetailPageLoggingState) this.L$0);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$1 */
            static final class C239521 extends ContinuationImpl7 implements Function2<OptionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C239521(Continuation<? super C239521> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C239521 c239521 = new C239521(continuation);
                    c239521.L$0 = obj;
                    return c239521;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionsDetailPageDataState optionsDetailPageDataState, Continuation<? super OptionsDetailPageDataState> continuation) {
                    return ((C239521) create(optionsDetailPageDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionsDetailPageDataState.copy$default((OptionsDetailPageDataState) this.L$0, null, null, null, null, false, false, null, null, null, false, false, false, null, 0, false, false, false, null, false, false, null, null, false, false, null, 33554175, null);
                }
            }

            public final void onSimulatedReturnTooltipClicked() {
                applyMutation(new C239521(null));
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C239532(null), 3, null);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1421}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2 */
            static final class C239532 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;

                C239532(Continuation<? super C239532> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C239532(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C239532) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowTake = FlowKt.take(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageLoggingState currentLoggingState = ((OptionsDetailPageViewState) obj).getCurrentLoggingState();
                                        if (currentLoggingState != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(currentLoggingState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onSimulatedReturnTooltipClicked$2$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageLoggings.logOptionsDetailPageSimulatedReturnTooltipTap(this.this$0.eventLogger, (OptionsDetailPageLoggingState) this.L$0);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            public final void onOptionHistoryRowClicked(OptionRow optionRow) {
                Intrinsics.checkNotNullParameter(optionRow, "optionRow");
                OptionsDetailPageLoggings.logOptionHistoryRowTap(this.eventLogger, optionRow.getOptionRowType(), optionRow.getEventScreen(), optionRow.getEventContext());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void logAppear(OptionsDetailPageLoggingState state) {
                OptionsDetailPageLoggings.logOptionsDetailPageAppear(this.eventLogger, state.getStrategyCode(), state.getEventContext());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void logDisappear(OptionsDetailPageLoggingState state) {
                OptionsDetailPageLoggings.logOptionsDetailPageDisappear(this.eventLogger, state.getStrategyCode(), state.getEventContext());
            }

            public final void logLateCloseInfoClicked() {
                OptionsDetailPageLoggings.logLateCloseInfoClicked(this.eventLogger);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {1463}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1 */
            static final class C238991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $sectionIdentifier;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C238991(String str, Continuation<? super C238991> continuation) {
                    super(2, continuation);
                    this.$sectionIdentifier = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return OptionsDetailPageDuxo.this.new C238991(this.$sectionIdentifier, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C238991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final StateFlow<OptionsDetailPageViewState> stateFlow = OptionsDetailPageDuxo.this.getStateFlow();
                        Flow flowTake = FlowKt.take(new Flow<OptionsDetailPageLoggingState>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1$invokeSuspend$$inlined$mapNotNull$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super OptionsDetailPageLoggingState> flowCollector, Continuation continuation) {
                                Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {52}, m3647m = "emit")
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        OptionsDetailPageLoggingState currentLoggingState = ((OptionsDetailPageViewState) obj).getCurrentLoggingState();
                                        if (currentLoggingState != null) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(currentLoggingState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsDetailPageDuxo.this, this.$sectionIdentifier, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: OptionsDetailPageDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$logSectionAppear$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionsDetailPageLoggingState, Continuation<? super Unit>, Object> {
                    final /* synthetic */ String $sectionIdentifier;
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ OptionsDetailPageDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(OptionsDetailPageDuxo optionsDetailPageDuxo, String str, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = optionsDetailPageDuxo;
                        this.$sectionIdentifier = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$sectionIdentifier, continuation);
                        anonymousClass2.L$0 = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionsDetailPageLoggingState optionsDetailPageLoggingState, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(optionsDetailPageLoggingState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            OptionsDetailPageLoggings.logSectionAppear(this.this$0.eventLogger, this.$sectionIdentifier, (OptionsDetailPageLoggingState) this.L$0);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            public final void logSectionAppear(String sectionIdentifier) {
                Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C238991(sectionIdentifier, null), 3, null);
            }

            /* compiled from: OptionsDetailPageDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Args;", "<init>", "()V", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements DuxoCompanion<OptionsDetailPageDuxo, OptionsDetailPageFragment.Args> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.udf.DuxoCompanion
                public OptionsDetailPageFragment.Args getArgs(SavedStateHandle savedStateHandle) {
                    return (OptionsDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
                }

                @Override // com.robinhood.android.udf.DuxoCompanion
                public OptionsDetailPageFragment.Args getArgs(OptionsDetailPageDuxo optionsDetailPageDuxo) {
                    return (OptionsDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionsDetailPageDuxo);
                }
            }
        }
