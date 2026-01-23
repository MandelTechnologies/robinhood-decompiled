package com.robinhood.android.equitydetail.p123ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroup2;
import androidx.lifecycle.ViewModelStoreOwner;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.assetdetail.EducationTourTickerSymbolView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.educationtour.EducationTourEntryPointCard;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.educationtour.interfaces.EducationTourAdapter;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSectionView;
import com.robinhood.android.equities.shortinterest.p117ui.ShortInterestSectionView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailViewState;
import com.robinhood.android.equitydetail.p123ui.about.p124v2.AboutV2View;
import com.robinhood.android.equitydetail.p123ui.analystoverview.AnalystOverviewComposable;
import com.robinhood.android.equitydetail.p123ui.analystoverview.AnalystOverviewData;
import com.robinhood.android.equitydetail.p123ui.analystoverview.AnalystOverviewView;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpLogger;
import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartView;
import com.robinhood.android.equitydetail.p123ui.closedpnl.ClosedPnlSectionView;
import com.robinhood.android.equitydetail.p123ui.copilot.CopilotDigestPreviewView;
import com.robinhood.android.equitydetail.p123ui.disclosure.InstrumentDisclosureView;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsDataView;
import com.robinhood.android.equitydetail.p123ui.earnings.p125v2.EarningsV2View;
import com.robinhood.android.equitydetail.p123ui.equityeventupdates.EquityEventUpdatesView;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionView;
import com.robinhood.android.equitydetail.p123ui.etp.p126v2.EtpCompositionV2View;
import com.robinhood.android.equitydetail.p123ui.faq.FaqView;
import com.robinhood.android.equitydetail.p123ui.history.UnifiedHistoryType;
import com.robinhood.android.equitydetail.p123ui.history.UnifiedHistoryViewV2;
import com.robinhood.android.equitydetail.p123ui.instrumentratings.p127v2.InstrumentRatingsV2View;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoHeaderView;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoHeaderViewV2;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoResultsSectionView;
import com.robinhood.android.equitydetail.p123ui.ipo.S1SectionView;
import com.robinhood.android.equitydetail.p123ui.margin.MarginDefinitionsView;
import com.robinhood.android.equitydetail.p123ui.milestones.MilestonesComposeView;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionLevel3EntryPointCardView;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionPortfolioRiskAnalyzerView;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionStrategyHeaderView;
import com.robinhood.android.equitydetail.p123ui.options.InstrumentDetailOptionStrategyView;
import com.robinhood.android.equitydetail.p123ui.performance.PerformanceViewSdp;
import com.robinhood.android.equitydetail.p123ui.position.PositionView;
import com.robinhood.android.equitydetail.p123ui.recentpricealert.PriceAlertsBannerView;
import com.robinhood.android.equitydetail.p123ui.recurringinvestmentnux.RecurringInvestmentsEquityNuxComposableView;
import com.robinhood.android.equitydetail.p123ui.relatedlists.RelatedListsView;
import com.robinhood.android.equitydetail.p123ui.shareholderexperience.ShareholderQaEventView;
import com.robinhood.android.equitydetail.p123ui.shareholderexperience.ShareholderQaEventsSectionView;
import com.robinhood.android.equitydetail.p123ui.similarinstruments.SimilarInstrumentsV2View;
import com.robinhood.android.equitydetail.p123ui.similarinstruments.SimilarInstrumentsView;
import com.robinhood.android.equitydetail.p123ui.statistics.InstrumentStatisticsView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.newsfeed.breakingnews.p198ui.BreakingNewsCardView;
import com.robinhood.android.newsfeed.p200ui.AssetNewsFeedView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.slip.lib.view.SlipSdpSectionView;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionView;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.iac.herocards.p383ui.IacHeroCardProvider;
import com.robinhood.shared.iac.herocards.p383ui.IacHeroCardView;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.Preconditions4;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: InstrumentDetailAdapter.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 V2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0006QRSTUVB)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0004H\u0016J\u0018\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00042\u0006\u00105\u001a\u000201H\u0016J\u0010\u00106\u001a\u0002012\u0006\u00105\u001a\u000201H\u0016J\u0006\u00107\u001a\u00020\u0012J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001809H\u0016J\u0016\u0010:\u001a\u0002012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001809H\u0016J\u0011\u0010<\u001a\u000201\"\u0006\b\u0000\u0010=\u0018\u0001H\u0086\bJ$\u0010D\u001a\u00020\u00122\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0003092\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000309H\u0016J1\u0010G\u001a\u0002HH\"\f\b\u0000\u0010H*\u00020\u0011*\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002HH0K2\u0006\u0010.\u001a\u00020/H\u0002¢\u0006\u0002\u0010LJ\u001f\u0010M\u001a\u0002HH\"\b\b\u0000\u0010H*\u00020N2\u0006\u0010O\u001a\u0002HHH\u0002¢\u0006\u0002\u0010PR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R7\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020 0(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020$0(8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u001a\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003090?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003090A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$IdvViewHolder;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$Callbacks;", "sdpLogger", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$Callbacks;Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/ViewModelStoreOwner;)V", "onGraphLayoutPreDrawCallback", "Lkotlin/Function1;", "Landroid/view/View;", "", "getOnGraphLayoutPreDrawCallback", "()Lkotlin/jvm/functions/Function1;", "setOnGraphLayoutPreDrawCallback", "(Lkotlin/jvm/functions/Function1;)V", "onRecurringHubClick", "", "Lkotlin/ParameterName;", "name", "accountNumber", "getOnRecurringHubClick", "setOnRecurringHubClick", "selectionSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/models/ui/GraphSelection;", "kotlin.jvm.PlatformType", "directionStyleRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "colorMapper", "Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "graphSelectionChangedObservable", "Lio/reactivex/Observable;", "getGraphSelectionChangedObservable", "()Lio/reactivex/Observable;", "directionStyleObservable", "getDirectionStyleObservable", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onViewRecycled", "holder", "onBindViewHolder", "position", "getItemViewType", "clear", "getAvailableElementIds", "", "getElementScrollPosition", "elementIds", "getViewDataIndex", "T", "_currentListFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "currentListFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getCurrentListFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "onCurrentListChanged", "previousList", "currentList", "inflateLoggableView", "V", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "(Lcom/robinhood/utils/ui/view/Inflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateLoggableComposeView", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "view", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;)Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "InfoBannerCallbacks", "EtpCompositionCallbacks", "HistoryCallbacks", "Callbacks", "IdvViewHolder", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailAdapter extends TrackedListAdapter<DetailData, IdvViewHolder> implements EducationTourAdapter {
    private final SharedFlow2<List<DetailData>> _currentListFlow;
    private final Callbacks callbacks;
    private final ServerToBentoColorMapper colorMapper;
    private final CoroutineScope coroutineScope;
    private final SharedFlow<List<DetailData>> currentListFlow;
    private final BehaviorRelay<DirectionOverlay> directionStyleRelay;
    private Function1<? super View, Unit> onGraphLayoutPreDrawCallback;
    private Function1<? super String, Unit> onRecurringHubClick;
    private final SdpLogger sdpLogger;
    private final BehaviorSubject<GraphSelection> selectionSubject;
    private final ViewModelStoreOwner viewModelStoreOwner;
    public static final int $stable = 8;
    private static final GraphSelection DEFAULT_GRAPH_SELECTION = GraphSelection.DAY;

    /* compiled from: InstrumentDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$EtpCompositionCallbacks;", "", "onEtpItemClicked", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface EtpCompositionCallbacks {
        void onEtpItemClicked(EtpCompositionItemHolder item);
    }

    /* compiled from: InstrumentDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$HistoryCallbacks;", "", "onHistoryShowMoreClicked", "", "selectedAccount", "Lcom/robinhood/models/db/Account;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface HistoryCallbacks {
        void onHistoryShowMoreClicked(Account selectedAccount);
    }

    /* compiled from: InstrumentDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$InfoBannerCallbacks;", "", "onBindInfoBanner", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/InfoBannerViewData;", "onClickInfoBanner", "onDismissInfoBanner", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface InfoBannerCallbacks {
        void onBindInfoBanner(InfoBannerViewData data);

        void onClickInfoBanner(InfoBannerViewData data);

        void onDismissInfoBanner(InfoBannerViewData data);
    }

    /* compiled from: InstrumentDetailAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.UPCOMING_ACTIVITY_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.HISTORY_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewType.GOLD_HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewType.EDUCATION_TOUR_TICKER_SYMBOL_VIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewType.IPO_GRAPH_LAYOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewType.PRE_IPO_HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewType.PRE_IPO_HEADER_V2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ViewType.MILESTONES_VIEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ViewType.IPO_RESULTS_VIEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ViewType.INFO_BANNER_VIEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ViewType.RECURRING_INVESTMENT_VIEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ViewType.OPTION_STRATEGY_HEADER_VIEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ViewType.OPTION_STRATEGY_ROW_VIEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ViewType.OPTION_ENTRY_POINT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ViewType.OPTION_PORTFOLIO_RISK_ANALYZER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ViewType.POSITION_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ViewType.CLOSED_PNL_VIEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ViewType.MARGIN_DEFINITIONS_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ViewType.NEWS_FEED_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ViewType.TRADING_TRENDS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ViewType.RATINGS_VIEW_V2.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ViewType.STATS_VIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ViewType.EQUITY_EVENT_UPDATES.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ViewType.COMPANY_FINANCIALS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ViewType.EARNINGS_VIEW.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ViewType.EARNINGS_V2_VIEW.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ViewType.ABOUT_V2_VIEW.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ViewType.PERFORMANCE_VIEW.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ViewType.RELATED_INDUSTRY_VIEW.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ViewType.SIMILAR_INSTRUMENTS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ViewType.SIMILAR_INSTRUMENTS_V2.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ViewType.ANALYST_REPORT_VIEW.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ViewType.RECURRING_INVESTMENT_NUX.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ViewType.DISCLOSURE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ViewType.S1_VIEW.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ViewType.ANCHOR_VIEW.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ViewType.ETP_COMPOSITION.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ViewType.ETP_COMPOSITION_V2.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ViewType.SHAREHOLDER_QA_EVENT.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ViewType.SHAREHOLDER_QA_EVENTS_SECTION.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ViewType.SERVER_DRIVEN_CHART.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ViewType.SLIP_ONBOARDING_SECTION.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ViewType.HERO_CARD.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ViewType.BREAKING_NEWS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ViewType.COPILOT_DIGEST_PREVIEW.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ViewType.RECENT_PRICE_ALERT.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ViewType.SHORT_INTEREST_SECTION.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[ViewType.FAQ.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailAdapter(Callbacks callbacks, SdpLogger sdpLogger, CoroutineScope coroutineScope, ViewModelStoreOwner viewModelStoreOwner) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailAdapter._init_$lambda$0((DetailData) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(sdpLogger, "sdpLogger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.callbacks = callbacks;
        this.sdpLogger = sdpLogger;
        this.coroutineScope = coroutineScope;
        this.viewModelStoreOwner = viewModelStoreOwner;
        BehaviorSubject<GraphSelection> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.selectionSubject = behaviorSubjectCreate;
        BehaviorRelay<DirectionOverlay> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.directionStyleRelay = behaviorRelayCreate;
        this.colorMapper = ServerToBentoColorMapper.INSTANCE;
        SharedFlow2<List<DetailData>> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this._currentListFlow = sharedFlow2MutableSharedFlow$default;
        this.currentListFlow = FlowKt.asSharedFlow(sharedFlow2MutableSharedFlow$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(DetailData byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        if (byEquality instanceof HeaderData.FromResource) {
            return Integer.valueOf(((HeaderData.FromResource) byEquality).getTextResId());
        }
        return byEquality.getClass();
    }

    public final Function1<View, Unit> getOnGraphLayoutPreDrawCallback() {
        return this.onGraphLayoutPreDrawCallback;
    }

    public final void setOnGraphLayoutPreDrawCallback(Function1<? super View, Unit> function1) {
        this.onGraphLayoutPreDrawCallback = function1;
    }

    public final Function1<String, Unit> getOnRecurringHubClick() {
        return this.onRecurringHubClick;
    }

    public final void setOnRecurringHubClick(Function1<? super String, Unit> function1) {
        this.onRecurringHubClick = function1;
    }

    public final Observable<GraphSelection> getGraphSelectionChangedObservable() {
        Observable<GraphSelection> observableDistinctUntilChanged = this.selectionSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Observable<DirectionOverlay> getDirectionStyleObservable() {
        Observable<DirectionOverlay> observableDistinctUntilChanged = this.directionStyleRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public IdvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View instrumentDetailOptionLevel3EntryPointCardView;
        View instrumentDetailOptionPortfolioRiskAnalyzerView;
        View instrumentChartView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewType viewType2 = ViewType.INSTANCE.getValues()[viewType];
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = 0;
        switch (iArr[viewType2.ordinal()]) {
            case 1:
            case 2:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                UnifiedHistoryViewV2 unifiedHistoryViewV2 = new UnifiedHistoryViewV2(context, this.viewModelStoreOwner, null, 4, null);
                int i2 = iArr[viewType2.ordinal()];
                if (i2 == 1) {
                    i = C15314R.id.instrument_detail_upcoming_activity;
                } else if (i2 == 2) {
                    i = C15314R.id.instrument_detail_history;
                }
                unifiedHistoryViewV2.setId(i);
                instrumentChartView = inflateLoggableComposeView(unifiedHistoryViewV2);
                return new IdvViewHolder(instrumentChartView);
            case 3:
                View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C15314R.layout.include_instrument_detail_header_text, parent, false);
                Intrinsics.checkNotNull(viewInflate);
                instrumentChartView = viewInflate;
                return new IdvViewHolder(instrumentChartView);
            case 4:
                View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(C15314R.layout.include_instrument_detail_gold_header_text, parent, false);
                Intrinsics.checkNotNull(viewInflate2);
                instrumentChartView = viewInflate2;
                return new IdvViewHolder(instrumentChartView);
            case 5:
                instrumentChartView = EducationTourTickerSymbolView.INSTANCE.inflate(parent);
                return new IdvViewHolder(instrumentChartView);
            case 6:
                instrumentChartView = IpoQuoteGraphLayout.INSTANCE.inflate(parent);
                return new IdvViewHolder(instrumentChartView);
            case 7:
                instrumentChartView = IpoHeaderView.INSTANCE.inflate(parent);
                return new IdvViewHolder(instrumentChartView);
            case 8:
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new IpoHeaderViewV2(context2, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 9:
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new MilestonesComposeView(context3, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 10:
                instrumentChartView = IpoResultsSectionView.INSTANCE.inflate(parent);
                return new IdvViewHolder(instrumentChartView);
            case 11:
                instrumentChartView = ViewGroups.inflate$default(parent, C15314R.layout.include_info_banner_view, false, 2, null);
                return new IdvViewHolder(instrumentChartView);
            case 12:
                InstrumentHistoryView instrumentHistoryViewInflate = InstrumentHistoryView.INSTANCE.inflate(parent);
                instrumentHistoryViewInflate.setId(C15314R.id.instrument_detail_recurring_investments);
                instrumentHistoryViewInflate.setViewType(ViewType.NESTED_HISTORY_ROW_VIEW.ordinal());
                instrumentChartView = instrumentHistoryViewInflate;
                return new IdvViewHolder(instrumentChartView);
            case 13:
                instrumentChartView = InstrumentDetailOptionStrategyHeaderView.INSTANCE.inflate(parent);
                return new IdvViewHolder(instrumentChartView);
            case 14:
                instrumentChartView = InstrumentDetailOptionStrategyView.INSTANCE.inflate(parent);
                return new IdvViewHolder(instrumentChartView);
            case 15:
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                instrumentDetailOptionLevel3EntryPointCardView = new InstrumentDetailOptionLevel3EntryPointCardView(context4, null, 2, null);
                instrumentChartView = instrumentDetailOptionLevel3EntryPointCardView;
                return new IdvViewHolder(instrumentChartView);
            case 16:
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                instrumentDetailOptionPortfolioRiskAnalyzerView = new InstrumentDetailOptionPortfolioRiskAnalyzerView(context5, this.viewModelStoreOwner, null, 4, null);
                instrumentChartView = instrumentDetailOptionPortfolioRiskAnalyzerView;
                return new IdvViewHolder(instrumentChartView);
            case 17:
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new PositionView(context6, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 18:
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new ClosedPnlSectionView(context7, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 19:
                Context context8 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new MarginDefinitionsView(context8, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 20:
                AssetNewsFeedView assetNewsFeedViewInflate = AssetNewsFeedView.INSTANCE.inflate(parent);
                assetNewsFeedViewInflate.setArticleViewType(ViewType.NESTED_NEWS_FEED_ARTICLE_ROW_VIEW.ordinal());
                assetNewsFeedViewInflate.setEmbeddedArticleViewType(ViewType.NESTED_NEWS_FEED_EMBEDDED_ARTICLE_ROW_VIEW.ordinal());
                instrumentChartView = assetNewsFeedViewInflate;
                return new IdvViewHolder(instrumentChartView);
            case 21:
                Context context9 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                instrumentDetailOptionLevel3EntryPointCardView = new TradingTrendsChartSectionView(context9, null, 2, null);
                instrumentChartView = instrumentDetailOptionLevel3EntryPointCardView;
                return new IdvViewHolder(instrumentChartView);
            case 22:
                Context context10 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new InstrumentRatingsV2View(context10, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 23:
                Context context11 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new InstrumentStatisticsView(context11, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 24:
                Context context12 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new EquityEventUpdatesView(context12, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 25:
                Context context13 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new CompanyFinancialsSectionView(context13, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 26:
                instrumentChartView = inflateLoggableView(EarningsDataView.INSTANCE, parent);
                return new IdvViewHolder(instrumentChartView);
            case 27:
                Context context14 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new EarningsV2View(context14, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 28:
                Context context15 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new AboutV2View(context15, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 29:
                instrumentChartView = inflateLoggableView(PerformanceViewSdp.INSTANCE, parent);
                return new IdvViewHolder(instrumentChartView);
            case 30:
                instrumentChartView = inflateLoggableView(RelatedListsView.INSTANCE, parent);
                return new IdvViewHolder(instrumentChartView);
            case 31:
                instrumentChartView = inflateLoggableView(SimilarInstrumentsView.INSTANCE, parent);
                return new IdvViewHolder(instrumentChartView);
            case 32:
                Context context16 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new SimilarInstrumentsV2View(context16, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 33:
                Context context17 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new AnalystOverviewView(context17, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 34:
                Context context18 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new RecurringInvestmentsEquityNuxComposableView(context18, this.viewModelStoreOwner));
                return new IdvViewHolder(instrumentChartView);
            case 35:
                Context context19 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
                instrumentDetailOptionPortfolioRiskAnalyzerView = new InstrumentDisclosureView(context19, null, this.viewModelStoreOwner, 2, null);
                instrumentChartView = instrumentDetailOptionPortfolioRiskAnalyzerView;
                return new IdvViewHolder(instrumentChartView);
            case 36:
                instrumentChartView = S1SectionView.INSTANCE.inflate(parent);
                return new IdvViewHolder(instrumentChartView);
            case 37:
                instrumentChartView = ViewGroups.inflate$default(parent, C11048R.layout.include_anchor_view, false, 2, null);
                return new IdvViewHolder(instrumentChartView);
            case 38:
                instrumentChartView = inflateLoggableView(EtpCompositionView.INSTANCE, parent);
                return new IdvViewHolder(instrumentChartView);
            case 39:
                Context context20 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new EtpCompositionV2View(context20, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 40:
                instrumentChartView = inflateLoggableView(ShareholderQaEventView.INSTANCE, parent);
                return new IdvViewHolder(instrumentChartView);
            case 41:
                Context context21 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new ShareholderQaEventsSectionView(context21, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 42:
                Context context22 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
                instrumentChartView = new InstrumentChartView(context22, this.viewModelStoreOwner, null, 4, null);
                return new IdvViewHolder(instrumentChartView);
            case 43:
                Context context23 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context23, "getContext(...)");
                instrumentChartView = new SlipSdpSectionView(context23, this.viewModelStoreOwner, null, 4, null);
                return new IdvViewHolder(instrumentChartView);
            case 44:
                Context context24 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context24, "getContext(...)");
                instrumentChartView = new IacHeroCardView(context24, this.viewModelStoreOwner, null, 4, null);
                return new IdvViewHolder(instrumentChartView);
            case 45:
                Context context25 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context25, "getContext(...)");
                instrumentDetailOptionPortfolioRiskAnalyzerView = new BreakingNewsCardView(context25, this.viewModelStoreOwner, null, 4, null);
                instrumentChartView = instrumentDetailOptionPortfolioRiskAnalyzerView;
                return new IdvViewHolder(instrumentChartView);
            case 46:
                Context context26 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context26, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new CopilotDigestPreviewView(context26, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 47:
                Context context27 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context27, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new PriceAlertsBannerView(context27, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 48:
                Context context28 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context28, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new ShortInterestSectionView(context28, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            case 49:
                Context context29 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context29, "getContext(...)");
                instrumentChartView = inflateLoggableComposeView(new FaqView(context29, this.viewModelStoreOwner, null, 4, null));
                return new IdvViewHolder(instrumentChartView);
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(IdvViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((InstrumentDetailAdapter) holder);
        holder.clear();
        if (holder.getItemViewType() == ViewType.INFO_BANNER_VIEW.ordinal()) {
            this.callbacks.onBindInfoBanner(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(IdvViewHolder holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final DetailData item = getItem(position);
        if (item instanceof HeaderData) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) itemView;
            if (rdsHeaderRowView.getChildCount() != 0) {
                ViewsKt.setEducationTourId(ViewGroup2.get(rdsHeaderRowView, 0), ((HeaderData) item).getEducationTourId());
            }
            HeaderData headerData = (HeaderData) item;
            if (headerData instanceof HeaderData.FromResource) {
                Resources resources = rdsHeaderRowView.getResources();
                HeaderData.FromResource fromResource = (HeaderData.FromResource) headerData;
                int textResId = fromResource.getTextResId();
                Object[] array2 = fromResource.getFormatArgs().toArray(new Object[0]);
                RdsHeaderRowView.bind$default(rdsHeaderRowView, resources.getString(textResId, Arrays.copyOf(array2, array2.length)), false, true, null, null, 26, null);
                return;
            }
            if (!(headerData instanceof HeaderData.FromCharSequence)) {
                throw new NoWhenBranchMatchedException();
            }
            RdsHeaderRowView.bind$default(rdsHeaderRowView, ((HeaderData.FromCharSequence) headerData).getText(), false, true, null, null, 26, null);
            return;
        }
        if (item instanceof GoldHeaderData) {
            RdsHeaderRowView.bind$default((RdsHeaderRowView) holder.itemView.findViewById(C15314R.id.section_header_txt), holder.itemView.getResources().getString(((GoldHeaderData) item).getTextResId()), false, true, null, null, 26, null);
            return;
        }
        if (item instanceof EducationTourTickerSymbolData) {
            EducationTourTickerSymbolData educationTourTickerSymbolData = (EducationTourTickerSymbolData) item;
            ((EducationTourTickerSymbolView) holder.getCastedItemView()).bind(educationTourTickerSymbolData.getTickerSymbol(), educationTourTickerSymbolData.getShowTickerSymbol());
            return;
        }
        if (item instanceof IpoGraphLayoutData) {
            IpoQuoteGraphLayout ipoQuoteGraphLayout = (IpoQuoteGraphLayout) holder.getCastedItemView();
            IpoGraphLayoutData ipoGraphLayoutData = (IpoGraphLayoutData) item;
            ipoQuoteGraphLayout.setData(ipoGraphLayoutData.getInstrument(), ipoGraphLayoutData.getIpoQuote());
            Function1<? super View, Unit> function1 = this.onGraphLayoutPreDrawCallback;
            if (function1 != null) {
                function1.invoke(ipoQuoteGraphLayout);
                return;
            }
            return;
        }
        if (item instanceof PreIpoHeaderData) {
            this.directionStyleRelay.accept(DirectionOverlay.POSITIVE);
            ((IpoHeaderView) holder.getCastedItemView()).setData(((PreIpoHeaderData) item).getIpoHeader());
            return;
        }
        if (item instanceof PreIpoHeaderDataV2) {
            this.directionStyleRelay.accept(DirectionOverlay.POSITIVE);
            ((IpoHeaderViewV2) holder.getCastedItemView()).setData(((PreIpoHeaderDataV2) item).getIpoHeader(), this.callbacks);
            return;
        }
        if (item instanceof S1SectionViewData) {
            S1SectionViewData s1SectionViewData = (S1SectionViewData) item;
            ((S1SectionView) holder.getCastedItemView()).setData(s1SectionViewData.getInstrumentId(), s1SectionViewData.getS1Section().getTitle(), s1SectionViewData.getS1Section().getDetail(), s1SectionViewData.getS1Section().getButton());
            return;
        }
        if (item instanceof IpoResultsSectionViewData) {
            ((IpoResultsSectionView) holder.getCastedItemView()).setData(((IpoResultsSectionViewData) item).getStockDetailIpoResultsSection());
            return;
        }
        if (item instanceof MilestonesViewData) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.milestones.MilestonesComposeView");
            ((MilestonesComposeView) view).bind((MilestonesViewData) item);
            return;
        }
        if (item instanceof InfoBannerViewData) {
            InfoBannerViewData infoBannerViewData = (InfoBannerViewData) item;
            this.callbacks.onBindInfoBanner(infoBannerViewData);
            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) holder.getCastedItemView();
            ServerToBentoAssetMapper2 icon = infoBannerViewData.getIcon();
            rdsInfoBannerView.setIcon(icon != null ? ContextCompat.getDrawable(rdsInfoBannerView.getContext(), icon.getResourceId()) : null);
            RichText text = infoBannerViewData.getText();
            Context context = rdsInfoBannerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rdsInfoBannerView.setText(RichTexts.toSpannableString$default(text, context, null, false, null, 14, null));
            rdsInfoBannerView.setCtaText(infoBannerViewData.getCtaText());
            if (infoBannerViewData.getCtaAction() != null) {
                OnClickListeners.onClick(rdsInfoBannerView, new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstrumentDetailAdapter.onBindViewHolder$lambda$7$lambda$5(this.f$0, item);
                    }
                });
            }
            if (infoBannerViewData.getCanDismiss()) {
                rdsInfoBannerView.onDismiss(new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstrumentDetailAdapter.onBindViewHolder$lambda$7$lambda$6(this.f$0, item);
                    }
                });
            }
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = this.colorMapper.mapDayNightSelectorServerColor(infoBannerViewData.getStyle().getTextColor().getLight(), infoBannerViewData.getStyle().getTextColor().getDark());
            if (resourceReferences4MapDayNightSelectorServerColor == null) {
                resourceReferences4MapDayNightSelectorServerColor = new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, C13997R.attr.colorForegroundInfoBanner);
            }
            rdsInfoBannerView.setTextColor(resourceReferences4MapDayNightSelectorServerColor);
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor2 = this.colorMapper.mapDayNightSelectorServerColor(infoBannerViewData.getStyle().getBackgroundColor().getLight(), infoBannerViewData.getStyle().getBackgroundColor().getDark());
            if (resourceReferences4MapDayNightSelectorServerColor2 == null) {
                resourceReferences4MapDayNightSelectorServerColor2 = new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, C13997R.attr.colorBackgroundInfoBanner);
            }
            ScarletManager2.overrideAttribute(rdsInfoBannerView, R.attr.backgroundTint, resourceReferences4MapDayNightSelectorServerColor2);
            return;
        }
        if (item instanceof UpcomingActivityViewData) {
            UnifiedHistoryViewV2 unifiedHistoryViewV2 = (UnifiedHistoryViewV2) holder.getCastedItemView();
            UpcomingActivityViewData upcomingActivityViewData = (UpcomingActivityViewData) item;
            unifiedHistoryViewV2.bind(upcomingActivityViewData.getInstrumentId(), upcomingActivityViewData.getAccount().getAccountNumber(), UnifiedHistoryType.PENDING);
            unifiedHistoryViewV2.setCallbacks(new UnifiedHistoryViewV2.Callbacks() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$onBindViewHolder$2$1
                @Override // com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewV2.Callbacks
                public void onRecentHistoryShowAllClicked() {
                    this.this$0.callbacks.onHistoryShowMoreClicked(((UpcomingActivityViewData) item).getAccount());
                }
            });
            return;
        }
        if (item instanceof RecurringInvestmentViewData) {
            RecurringInvestmentViewData recurringInvestmentViewData = (RecurringInvestmentViewData) item;
            ((InstrumentHistoryView) holder.getCastedItemView()).setData(recurringInvestmentViewData.getInstrument(), recurringInvestmentViewData.getInvestmentSchedules(), new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailAdapter.onBindViewHolder$lambda$9(this.f$0, item, (UUID) obj);
                }
            });
            return;
        }
        if (item instanceof OptionStrategyHeaderData) {
            OptionStrategyHeaderData optionStrategyHeaderData = (OptionStrategyHeaderData) item;
            ((InstrumentDetailOptionStrategyHeaderView) holder.getCastedItemView()).bind(optionStrategyHeaderData.getOptionChainCollateral(), optionStrategyHeaderData.getAggregateOptionPositions(), optionStrategyHeaderData.getAggregateOptionQuotes(), optionStrategyHeaderData.getOptionEventsHeldForExercise(), optionStrategyHeaderData.getTotalContracts(), optionStrategyHeaderData.getAccountType(), optionStrategyHeaderData.getInProfitAndLossAverageCostRetirement());
            return;
        }
        if (item instanceof OptionStrategyViewData) {
            OptionStrategyViewData optionStrategyViewData = (OptionStrategyViewData) item;
            ((InstrumentDetailOptionStrategyView) holder.getCastedItemView()).bind(optionStrategyViewData.getAccountNumber(), optionStrategyViewData.getUiAggregateOptionPosition(), optionStrategyViewData.getAggregateOptionPositions(), optionStrategyViewData.getOptionQuote());
            return;
        }
        if (item instanceof OptionEntryPoint) {
            ((InstrumentDetailOptionLevel3EntryPointCardView) holder.getCastedItemView()).bind(((OptionEntryPoint) item).getAccountNumber(), this.callbacks);
            return;
        }
        if (item instanceof OptionsPortfolioRiskAnalyzerEntryPointData) {
            ((InstrumentDetailOptionPortfolioRiskAnalyzerView) holder.getCastedItemView()).bind((OptionsPortfolioRiskAnalyzerEntryPointData) item);
            return;
        }
        if (item instanceof PositionViewData) {
            View view2 = holder.itemView;
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.position.PositionView");
            ((PositionView) view2).bind((PositionViewData) item);
            return;
        }
        if (item instanceof ClosedPnlViewData) {
            ((ClosedPnlSectionView) holder.getCastedItemView()).bind((ClosedPnlViewData) item);
            return;
        }
        if (item instanceof MarginDefinitionsViewData) {
            ((MarginDefinitionsView) holder.getCastedItemView()).bind((MarginDefinitionsViewData) item);
            return;
        }
        if (item instanceof NewsFeedViewData) {
            NewsFeedViewData newsFeedViewData = (NewsFeedViewData) item;
            ((AssetNewsFeedView) holder.getCastedItemView()).bind(newsFeedViewData.getInstrument().getId(), newsFeedViewData.getInstrument().getSymbol(), newsFeedViewData.getNewsFeedContent(), false);
            return;
        }
        if (item instanceof TradingTrendsViewData) {
            TradingTrendsChartSectionView tradingTrendsChartSectionView = (TradingTrendsChartSectionView) holder.getCastedItemView();
            TradingTrendsViewData tradingTrendsViewData = (TradingTrendsViewData) item;
            tradingTrendsChartSectionView.setInstrumentId(tradingTrendsViewData.getInstrumentId());
            tradingTrendsChartSectionView.setState(tradingTrendsViewData.getTradingTrendsState());
            tradingTrendsChartSectionView.setCallbacks(this.callbacks);
            return;
        }
        if (item instanceof RatingsV2ViewData) {
            ((InstrumentRatingsV2View) holder.getCastedItemView()).bind$feature_equity_detail_externalDebug((RatingsV2ViewData) item);
            return;
        }
        if (item instanceof StatsViewData) {
            View view3 = holder.itemView;
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView");
            ((InstrumentStatisticsView) view3).bind((StatsViewData) item, this.callbacks);
            return;
        }
        if (item instanceof EquityEventUpdatesViewData) {
            View view4 = holder.itemView;
            Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.equityeventupdates.EquityEventUpdatesView");
            ((EquityEventUpdatesView) view4).bind((EquityEventUpdatesViewData) item);
            return;
        }
        if (item instanceof CompanyFinancialsViewData) {
            CompanyFinancialsSectionView companyFinancialsSectionView = (CompanyFinancialsSectionView) holder.getCastedItemView();
            CompanyFinancialsViewData companyFinancialsViewData = (CompanyFinancialsViewData) item;
            companyFinancialsSectionView.setInstrumentId(companyFinancialsViewData.getInstrumentId());
            companyFinancialsSectionView.setViewState(companyFinancialsViewData.getCompanyFinancialsState());
            companyFinancialsSectionView.setCallbacks(this.callbacks);
            return;
        }
        if (item instanceof ShortInterestViewData) {
            ((ShortInterestSectionView) holder.getCastedItemView()).setViewState(((ShortInterestViewData) item).getShortInterestState());
            return;
        }
        if (item instanceof EarningsViewData) {
            ((EarningsDataView) holder.getCastedItemView()).bind((EarningsViewData) item);
            return;
        }
        if (item instanceof EarningsV2ViewData) {
            ((EarningsV2View) holder.getCastedItemView()).bind$feature_equity_detail_externalDebug((EarningsV2ViewData) item);
            return;
        }
        if (item instanceof HistoryViewData) {
            UnifiedHistoryViewV2 unifiedHistoryViewV22 = (UnifiedHistoryViewV2) holder.getCastedItemView();
            HistoryViewData historyViewData = (HistoryViewData) item;
            unifiedHistoryViewV22.bind(historyViewData.getInstrumentId(), historyViewData.getAccount().getAccountNumber(), UnifiedHistoryType.ALL);
            unifiedHistoryViewV22.setCallbacks(new UnifiedHistoryViewV2.Callbacks() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$onBindViewHolder$6$1
                @Override // com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewV2.Callbacks
                public void onRecentHistoryShowAllClicked() {
                    this.this$0.callbacks.onHistoryShowMoreClicked(((HistoryViewData) item).getAccount());
                }
            });
            return;
        }
        if (item instanceof AboutV2ViewData) {
            ((AboutV2View) holder.getCastedItemView()).bind((AboutV2ViewData) item);
            return;
        }
        if (item instanceof PerformanceViewData) {
            ((PerformanceViewSdp) holder.getCastedItemView()).bind(((PerformanceViewData) item).getEtpDetails());
            return;
        }
        if (item instanceof RelatedIndustryViewData) {
            ((RelatedListsView) holder.getCastedItemView()).bind((RelatedIndustryViewData) item);
            return;
        }
        if (item instanceof RecurringInvestmentNuxData) {
            ((RecurringInvestmentsEquityNuxComposableView) holder.getCastedItemView()).bind$feature_equity_detail_externalDebug((RecurringInvestmentNuxData) item);
            return;
        }
        if (item instanceof SimilarInstrumentsData) {
            SimilarInstrumentsData similarInstrumentsData = (SimilarInstrumentsData) item;
            ((SimilarInstrumentsView) holder.getCastedItemView()).bind(similarInstrumentsData.getInstrument(), similarInstrumentsData.getSimilarInstrumentIds());
            return;
        }
        if (item instanceof SimilarInstrumentsV2Data) {
            ((SimilarInstrumentsV2View) holder.getCastedItemView()).bind((SimilarInstrumentsV2Data) item);
            return;
        }
        if (item instanceof AnalystReportViewData) {
            AnalystOverviewView analystOverviewView = (AnalystOverviewView) holder.getCastedItemView();
            AnalystReportViewData analystReportViewData = (AnalystReportViewData) item;
            Instrument instrument = analystReportViewData.getInstrument();
            Intrinsics.checkNotNull(instrument);
            analystOverviewView.bind(new AnalystOverviewData(instrument, analystReportViewData.getAnalystOverview()), (AnalystOverviewComposable) this.callbacks);
            return;
        }
        if (item instanceof DisclosureData) {
            DisclosureData disclosureData = (DisclosureData) item;
            ((InstrumentDisclosureView) holder.getCastedItemView()).bind(disclosureData.getInstrumentId(), disclosureData.getAccountNumber());
            return;
        }
        if (item instanceof EtpCompositionViewData) {
            ((EtpCompositionView) holder.getCastedItemView()).bind((EtpCompositionViewData) item, new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailAdapter.onBindViewHolder$lambda$13(this.f$0, (EtpCompositionItemHolder) obj);
                }
            });
            return;
        }
        if (item instanceof EtpCompositionV2Data) {
            ((EtpCompositionV2View) holder.getCastedItemView()).bind$feature_equity_detail_externalDebug((EtpCompositionV2Data) item);
            return;
        }
        if (item instanceof ServerDrivenChartData) {
            InstrumentChartView instrumentChartView = (InstrumentChartView) holder.getCastedItemView();
            ServerDrivenChartData serverDrivenChartData = (ServerDrivenChartData) item;
            ViewsKt.setEducationTourIds(instrumentChartView, serverDrivenChartData.getElementIds());
            instrumentChartView.bind(serverDrivenChartData, this.callbacks);
            return;
        }
        if (item instanceof ShareholderQaEventViewData) {
            ((ShareholderQaEventView) holder.getCastedItemView()).bind((ShareholderQaEventViewData) item);
            return;
        }
        if (item instanceof ShareholderQaEventsSectionViewData) {
            ((ShareholderQaEventsSectionView) holder.getCastedItemView()).bind((ShareholderQaEventsSectionViewData) item, this.callbacks);
            return;
        }
        if (item instanceof AnchorViewData) {
            return;
        }
        if (item instanceof SlipData) {
            SlipSdpSectionView slipSdpSectionView = (SlipSdpSectionView) holder.getCastedItemView();
            SlipData slipData = (SlipData) item;
            slipSdpSectionView.setAccountNumber(slipData.getAccountNumber());
            slipSdpSectionView.setTickerSymbol(slipData.getTickerSymbol());
            slipSdpSectionView.setLocality(slipData.getLocality());
            return;
        }
        if (item instanceof IacHeroCardData) {
            IacHeroCardView iacHeroCardView = (IacHeroCardView) holder.getCastedItemView();
            IacHeroCardData iacHeroCardData = (IacHeroCardData) item;
            IacHeroCardProvider iacHeroCardProviderCreate = IacHeroCardProvider.INSTANCE.create(iacHeroCardData.getCard(), iacHeroCardData.getOptionalEducationCardData());
            Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
            String string2 = iacHeroCardData.getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            iacHeroCardView.bind(iacHeroCardProviderCreate, new Screen(name, null, string2, null, 10, null), this.callbacks);
            return;
        }
        if (item instanceof BreakingNewsData) {
            BreakingNewsData breakingNewsData = (BreakingNewsData) item;
            ((BreakingNewsCardView) holder.getCastedItemView()).bindEquity(breakingNewsData.getAccountNumber(), breakingNewsData.getAssetId());
            return;
        }
        if (item instanceof AssetDigestPreviewData) {
            AssetDigestPreviewData assetDigestPreviewData = (AssetDigestPreviewData) item;
            ((CopilotDigestPreviewView) holder.getCastedItemView()).bind(assetDigestPreviewData.getAccountNumber(), assetDigestPreviewData.getInstrumentId());
        } else if (item instanceof RecentPriceAlertTriggeredData) {
            RecentPriceAlertTriggeredData recentPriceAlertTriggeredData = (RecentPriceAlertTriggeredData) item;
            ((PriceAlertsBannerView) holder.getCastedItemView()).bind(recentPriceAlertTriggeredData.getInstrument(), recentPriceAlertTriggeredData.getAccountNumber());
        } else {
            if (!(item instanceof FaqData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((FaqView) holder.getCastedItemView()).setInstrumentId(((FaqData) item).getInstrumentId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7$lambda$5(InstrumentDetailAdapter instrumentDetailAdapter, DetailData detailData) {
        instrumentDetailAdapter.callbacks.onClickInfoBanner((InfoBannerViewData) detailData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7$lambda$6(InstrumentDetailAdapter instrumentDetailAdapter, DetailData detailData) {
        instrumentDetailAdapter.callbacks.onDismissInfoBanner((InfoBannerViewData) detailData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$9(InstrumentDetailAdapter instrumentDetailAdapter, DetailData detailData, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super String, Unit> function1 = instrumentDetailAdapter.onRecurringHubClick;
        if (function1 != null) {
            function1.invoke(((RecurringInvestmentViewData) detailData).getAccountNumber());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$13(InstrumentDetailAdapter instrumentDetailAdapter, EtpCompositionItemHolder item) {
        Intrinsics.checkNotNullParameter(item, "item");
        instrumentDetailAdapter.callbacks.onEtpItemClicked(item);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ViewType viewType;
        DetailData item = getItem(position);
        if (item instanceof HeaderData) {
            viewType = ViewType.HEADER;
        } else if (item instanceof GoldHeaderData) {
            viewType = ViewType.GOLD_HEADER;
        } else if (item instanceof EducationTourTickerSymbolData) {
            viewType = ViewType.EDUCATION_TOUR_TICKER_SYMBOL_VIEW;
        } else if (item instanceof IpoGraphLayoutData) {
            viewType = ViewType.IPO_GRAPH_LAYOUT;
        } else if (item instanceof PreIpoHeaderData) {
            viewType = ViewType.PRE_IPO_HEADER;
        } else if (item instanceof PreIpoHeaderDataV2) {
            viewType = ViewType.PRE_IPO_HEADER_V2;
        } else if (item instanceof S1SectionViewData) {
            viewType = ViewType.S1_VIEW;
        } else if (item instanceof IpoResultsSectionViewData) {
            viewType = ViewType.IPO_RESULTS_VIEW;
        } else if (item instanceof MilestonesViewData) {
            viewType = ViewType.MILESTONES_VIEW;
        } else if (item instanceof InfoBannerViewData) {
            viewType = ViewType.INFO_BANNER_VIEW;
        } else if (item instanceof OptionStrategyHeaderData) {
            viewType = ViewType.OPTION_STRATEGY_HEADER_VIEW;
        } else if (item instanceof OptionStrategyViewData) {
            viewType = ViewType.OPTION_STRATEGY_ROW_VIEW;
        } else if (item instanceof OptionEntryPoint) {
            viewType = ViewType.OPTION_ENTRY_POINT;
        } else if (item instanceof OptionsPortfolioRiskAnalyzerEntryPointData) {
            viewType = ViewType.OPTION_PORTFOLIO_RISK_ANALYZER;
        } else if (item instanceof PositionViewData) {
            viewType = ViewType.POSITION_VIEW;
        } else if (item instanceof ClosedPnlViewData) {
            viewType = ViewType.CLOSED_PNL_VIEW;
        } else if (item instanceof MarginDefinitionsViewData) {
            viewType = ViewType.MARGIN_DEFINITIONS_VIEW;
        } else if (item instanceof NewsFeedViewData) {
            viewType = ViewType.NEWS_FEED_VIEW;
        } else if (item instanceof TradingTrendsViewData) {
            viewType = ViewType.TRADING_TRENDS;
        } else if (item instanceof RatingsV2ViewData) {
            viewType = ViewType.RATINGS_VIEW_V2;
        } else if (item instanceof StatsViewData) {
            viewType = ViewType.STATS_VIEW;
        } else if (item instanceof EquityEventUpdatesViewData) {
            viewType = ViewType.EQUITY_EVENT_UPDATES;
        } else if (item instanceof AnalystReportViewData) {
            viewType = ViewType.ANALYST_REPORT_VIEW;
        } else if (item instanceof CompanyFinancialsViewData) {
            viewType = ViewType.COMPANY_FINANCIALS;
        } else if (item instanceof ShortInterestViewData) {
            viewType = ViewType.SHORT_INTEREST_SECTION;
        } else if (item instanceof EarningsViewData) {
            viewType = ViewType.EARNINGS_VIEW;
        } else if (item instanceof EarningsV2ViewData) {
            viewType = ViewType.EARNINGS_V2_VIEW;
        } else if (item instanceof HistoryViewData) {
            viewType = ViewType.HISTORY_VIEW;
        } else if (item instanceof AboutV2ViewData) {
            viewType = ViewType.ABOUT_V2_VIEW;
        } else if (item instanceof PerformanceViewData) {
            viewType = ViewType.PERFORMANCE_VIEW;
        } else if (item instanceof RelatedIndustryViewData) {
            viewType = ViewType.RELATED_INDUSTRY_VIEW;
        } else if (item instanceof SimilarInstrumentsData) {
            viewType = ViewType.SIMILAR_INSTRUMENTS;
        } else if (item instanceof SimilarInstrumentsV2Data) {
            viewType = ViewType.SIMILAR_INSTRUMENTS_V2;
        } else if (item instanceof UpcomingActivityViewData) {
            viewType = ViewType.UPCOMING_ACTIVITY_VIEW;
        } else if (item instanceof RecurringInvestmentViewData) {
            viewType = ViewType.RECURRING_INVESTMENT_VIEW;
        } else if (item instanceof RecurringInvestmentNuxData) {
            viewType = ViewType.RECURRING_INVESTMENT_NUX;
        } else if (item instanceof DisclosureData) {
            viewType = ViewType.DISCLOSURE;
        } else if (item instanceof AnchorViewData) {
            viewType = ViewType.ANCHOR_VIEW;
        } else if (item instanceof EtpCompositionViewData) {
            viewType = ViewType.ETP_COMPOSITION;
        } else if (item instanceof EtpCompositionV2Data) {
            viewType = ViewType.ETP_COMPOSITION_V2;
        } else if (item instanceof ServerDrivenChartData) {
            viewType = ViewType.SERVER_DRIVEN_CHART;
        } else if (item instanceof ShareholderQaEventViewData) {
            viewType = ViewType.SHAREHOLDER_QA_EVENT;
        } else if (item instanceof ShareholderQaEventsSectionViewData) {
            viewType = ViewType.SHAREHOLDER_QA_EVENTS_SECTION;
        } else if (item instanceof SlipData) {
            viewType = ViewType.SLIP_ONBOARDING_SECTION;
        } else if (item instanceof IacHeroCardData) {
            viewType = ViewType.HERO_CARD;
        } else if (item instanceof BreakingNewsData) {
            viewType = ViewType.BREAKING_NEWS;
        } else if (item instanceof AssetDigestPreviewData) {
            viewType = ViewType.COPILOT_DIGEST_PREVIEW;
        } else if (item instanceof RecentPriceAlertTriggeredData) {
            viewType = ViewType.RECENT_PRICE_ALERT;
        } else {
            if (!(item instanceof FaqData)) {
                throw new NoWhenBranchMatchedException();
            }
            viewType = ViewType.FAQ;
        }
        return viewType.ordinal();
    }

    public final synchronized void clear() {
        Preconditions4.checkOnMainThread(Preconditions.INSTANCE);
        this.selectionSubject.onNext(DEFAULT_GRAPH_SELECTION);
        submitList(null);
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourAdapter
    public List<String> getAvailableElementIds() {
        List<String> listEmptyList;
        List<DetailData> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : currentList) {
            EducationTourViewData educationTourViewData = obj instanceof EducationTourViewData ? (EducationTourViewData) obj : null;
            if (educationTourViewData == null || (listEmptyList = educationTourViewData.getElementIds()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listEmptyList);
        }
        return arrayList;
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourAdapter
    public int getElementScrollPosition(List<String> elementIds) {
        Intrinsics.checkNotNullParameter(elementIds, "elementIds");
        for (String str : elementIds) {
            List<DetailData> currentList = getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            Iterator<DetailData> it = currentList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object obj = (DetailData) it.next();
                if ((obj instanceof EducationTourViewData) && ((EducationTourViewData) obj).getElementIds().contains(str)) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ <T> int getViewDataIndex() {
        List<DetailData> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        int i = 0;
        for (DetailData detailData : currentList) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (detailData != null) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final SharedFlow<List<DetailData>> getCurrentListFlow() {
        return this.currentListFlow;
    }

    /* compiled from: InstrumentDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$onCurrentListChanged$1", m3645f = "InstrumentDetailAdapter.kt", m3646l = {814}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter$onCurrentListChanged$1 */
    static final class C153291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<DetailData> $currentList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C153291(List<? extends DetailData> list, Continuation<? super C153291> continuation) {
            super(2, continuation);
            this.$currentList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailAdapter.this.new C153291(this.$currentList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C153291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = InstrumentDetailAdapter.this._currentListFlow;
                List<DetailData> list = this.$currentList;
                this.label = 1;
                if (sharedFlow2.emit(list, this) == coroutine_suspended) {
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

    @Override // androidx.recyclerview.widget.ListAdapter
    public void onCurrentListChanged(List<? extends DetailData> previousList, List<? extends DetailData> currentList) {
        Intrinsics.checkNotNullParameter(previousList, "previousList");
        Intrinsics.checkNotNullParameter(currentList, "currentList");
        super.onCurrentListChanged(previousList, currentList);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C153291(currentList, null), 3, null);
    }

    private final <V extends View & LoggableSdpView> V inflateLoggableView(Inflater<? extends V> inflater, ViewGroup parent) {
        V v = (V) inflater.inflate(parent);
        v.setAnalyticsCallbacks(this.sdpLogger);
        v.addOnAttachStateChangeListener((View.OnAttachStateChangeListener) v);
        return v;
    }

    private final <V extends LoggableSdpComposeView> V inflateLoggableComposeView(V view) {
        view.setScreen(this.sdpLogger.provideEventScreen());
        view.setContext(this.sdpLogger.provideEventContext());
        return view;
    }

    /* compiled from: InstrumentDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$InfoBannerCallbacks;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$EtpCompositionCallbacks;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$HistoryCallbacks;", "Lcom/robinhood/android/educationtour/EducationTourEntryPointCard$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartView$Callbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/equitydetail/ui/analystoverview/AnalystOverviewCallbacks;", "Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardView$Callback;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionView$Callback;", "Lcom/robinhood/android/equitydetail/ui/statistics/InstrumentStatisticsView$Callbacks;", "Lcom/robinhood/android/equities/companyfinancials/ui/CompanyFinancialsSectionView$Callback;", "Lcom/robinhood/android/equitydetail/ui/options/InstrumentDetailOptionLevel3EntryPointCardView$Callback;", "setSdpMode", "", "sdpMode", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends InfoBannerCallbacks, EtpCompositionCallbacks, HistoryCallbacks, EducationTourEntryPointCard.Callbacks, InstrumentChartView.Callbacks, SduiActionHandler<GenericAction>, AnalystOverviewComposable, IacHeroCardView.Callback, TradingTrendsChartSectionView.Callback, InstrumentStatisticsView.Callbacks, CompanyFinancialsSectionView.Callback, InstrumentDetailOptionLevel3EntryPointCardView.Callback {
        void setSdpMode(InstrumentDetailViewState.SdpMode sdpMode);

        /* compiled from: InstrumentDetailAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onHeroCardClicked(Callbacks callbacks, IacHeroCardProvider provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                IacHeroCardView.Callback.DefaultImpls.onHeroCardClicked(callbacks, provider);
            }

            public static void onHeroCardDismissed(Callbacks callbacks, IacHeroCardProvider provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                IacHeroCardView.Callback.DefaultImpls.onHeroCardDismissed(callbacks, provider);
            }

            public static void onHeroCardSeen(Callbacks callbacks, IacHeroCardProvider provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                IacHeroCardView.Callback.DefaultImpls.onHeroCardSeen(callbacks, provider);
            }
        }
    }

    /* compiled from: InstrumentDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$IdvViewHolder;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getCastedItemView", "T", "()Ljava/lang/Object;", "clear", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IdvViewHolder extends SimpleViewHolder implements UiCallbacks.Clearable {
        public static final int $stable = SimpleViewHolder.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdvViewHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        public final <T> T getCastedItemView() {
            return (T) this.itemView;
        }

        @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
        public void clear() {
            KeyEvent.Callback itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            if (itemView instanceof UiCallbacks.Clearable) {
                ((UiCallbacks.Clearable) itemView).clear();
            }
        }
    }
}
