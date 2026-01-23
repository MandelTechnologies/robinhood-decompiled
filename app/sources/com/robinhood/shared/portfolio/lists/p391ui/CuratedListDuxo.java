package com.robinhood.shared.portfolio.lists.p391ui;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.portfolio.unified.DisplayType;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.regiongate.WatchlistPositionsTabSwipeToTradeRegionGate;
import com.robinhood.android.regiongate.experiment.WatchlistRedesignExperiment;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListItemViewMode;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListViewState;
import com.robinhood.shared.portfolio.lists.p391ui.prefs.ExpandedCuratedListIdsPref;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow;
import com.robinhood.shared.portfolio.listsswipenux.SwipeContext;
import com.robinhood.shared.portfolio.listsswipenux.SwipeContextKey;
import com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListsOrderStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0095\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%¢\u0006\u0004\b&\u0010'J\b\u0010+\u001a\u00020,H\u0016J$\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u000204J\u001b\u00105\u001a\u00020.2\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0000¢\u0006\u0002\b9J\u001d\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0000¢\u0006\u0002\b?J?\u0010@\u001a\u00020,2\u0006\u0010=\u001a\u00020>2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010A\u001a\u00020B2\u0016\b\u0002\u0010C\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u00020,0DH\u0000¢\u0006\u0002\bEJ\u001f\u0010F\u001a\u00020,2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010G\u001a\u00020HH\u0000¢\u0006\u0002\bIJ-\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020N072\u0006\u0010O\u001a\u00020)H\u0000¢\u0006\u0004\bP\u0010QJ\u0016\u0010R\u001a\u00020,2\u0006\u0010;\u001a\u00020<2\u0006\u0010S\u001a\u000202J\u0006\u0010T\u001a\u00020,J\u000e\u0010U\u001a\u00020,H\u0086@¢\u0006\u0002\u0010VJ\u0006\u0010W\u001a\u00020,J\u0006\u0010X\u001a\u00020,J\u0006\u0010Y\u001a\u00020,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "listsOrderStore", "Lcom/robinhood/shared/store/lists/store/ListsOrderStore;", "expandedCuratedListIdsPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "swipeNuxProvider", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "curatedListStateProvider", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/ListsOrderStore;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/shared/portfolio/lists/ui/CuratedListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "defaultReorderDelay", "Lkotlin/time/Duration;", "J", "onCreate", "", "bind", "Lkotlinx/coroutines/Job;", "accountNumber", "", "shouldShowListRows", "", "source", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListSource;", "onReorderFinished", "newList", "", "Lcom/robinhood/shared/portfolio/lists/ui/UiCuratedListItem;", "onReorderFinished$lib_lists_ui_externalDebug", "onWatchListItemRemoved", "watchlistId", "Ljava/util/UUID;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "onWatchListItemRemoved$lib_lists_ui_externalDebug", "onWatchListItemBuy", "context", "Landroid/content/Context;", "onShowError", "Lkotlin/Function1;", "onWatchListItemBuy$lib_lists_ui_externalDebug", "onWatchlistViewModeChange", "viewMode", "Lcom/robinhood/android/common/portfolio/unified/DisplayType;", "onWatchlistViewModeChange$lib_lists_ui_externalDebug", "onWatchlistItemsReordered", PortfolioBuyingPower5.IntentKeyEntryPoint, "Lcom/robinhood/models/db/CuratedList;", "reorderedWatchlistItems", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "delay", "onWatchlistItemsReordered-SxA4cEA$lib_lists_ui_externalDebug", "(Lcom/robinhood/models/db/CuratedList;Ljava/util/List;J)Lkotlinx/coroutines/Job;", "onWatchlistExpandToggle", "currentState", "setupSwipeToTradeNux", "setupSwipeToTrade", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSwipe", "onEquitySwipeTooltipShown", "onEquitySwipeTooltipClick", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListDuxo extends BaseDuxo<CuratedListDataState, CuratedListViewState> {
    public static final int $stable = 8;
    private final AccountAccessStore accountAccessStore;
    private final AppType appType;
    private final BuySellStore buySellStore;
    private final CuratedListItemViewModeStore curatedListItemViewModeStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final long defaultReorderDelay;
    private final StringToBooleanMapPreference expandedCuratedListIdsPref;
    private final ExperimentsStore experimentsStore;
    private final ListsOrderStore listsOrderStore;
    private final Navigator navigator;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final PositionsV2Store positionsV2Store;
    private final RegionGateProvider regionGateProvider;
    private final ScreenersStore screenersStore;
    private final SwipeNuxProvider swipeNuxProvider;

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo", m3645f = "CuratedListDuxo.kt", m3646l = {441, 442, 443, 445, 458, 461}, m3647m = "setupSwipeToTrade")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$1 */
    static final class C394121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C394121(Continuation<? super C394121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CuratedListDuxo.this.setupSwipeToTrade(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListDuxo(AppType appType, ScreenersStore screenersStore, CuratedListStore curatedListStore, ListsOrderStore listsOrderStore, @ExpandedCuratedListIdsPref StringToBooleanMapPreference expandedCuratedListIdsPref, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, PositionsV2Store positionsV2Store, OptionStrategyInfoStore optionStrategyInfoStore, ExperimentsStore experimentsStore, BuySellStore buySellStore, Navigator navigator, @SwipeContextKey(context = SwipeContext.EQUITY_WATCHLIST) SwipeNuxProvider swipeNuxProvider, RegionGateProvider regionGateProvider, AccountAccessStore accountAccessStore, CuratedListStateProvider curatedListStateProvider, DuxoBundle duxoBundle) {
        super(new CuratedListDataState(null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null), curatedListStateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(listsOrderStore, "listsOrderStore");
        Intrinsics.checkNotNullParameter(expandedCuratedListIdsPref, "expandedCuratedListIdsPref");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(swipeNuxProvider, "swipeNuxProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(curatedListStateProvider, "curatedListStateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.appType = appType;
        this.screenersStore = screenersStore;
        this.curatedListStore = curatedListStore;
        this.listsOrderStore = listsOrderStore;
        this.expandedCuratedListIdsPref = expandedCuratedListIdsPref;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.positionsV2Store = positionsV2Store;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.experimentsStore = experimentsStore;
        this.buySellStore = buySellStore;
        this.navigator = navigator;
        this.swipeNuxProvider = swipeNuxProvider;
        this.regionGateProvider = regionGateProvider;
        this.accountAccessStore = accountAccessStore;
        Duration.Companion companion = Duration.INSTANCE;
        this.defaultReorderDelay = Duration3.toDuration(3, DurationUnitJvm.SECONDS);
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1", m3645f = "CuratedListDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1 */
    static final class C394091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C394091(Continuation<? super C394091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C394091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CuratedListViewState> stateFlow = CuratedListDuxo.this.getStateFlow();
                final Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "CuratedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                if (obj instanceof CuratedListViewState.Loaded) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final Flow<CuratedListViewState.Loaded> flow2 = new Flow<CuratedListViewState.Loaded>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C393942<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2", m3645f = "CuratedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                return C393942.this.emit(null, this);
                            }
                        }

                        public C393942(FlowCollector flowCollector) {
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
                                if (((CuratedListViewState.Loaded) obj).getImplicitlyOrderedItemsInList()) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CuratedListViewState.Loaded> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C393942(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends ListRecord>>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C393962<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "CuratedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C393962.this.emit(null, this);
                            }
                        }

                        public C393962(FlowCollector flowCollector) {
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
                                ImmutableList<CuratedListDuxo7> curatedList = ((CuratedListViewState.Loaded) obj).getCuratedList();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(curatedList, 10));
                                Iterator<CuratedListDuxo7> it = curatedList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(CuratedListDuxo6.toListRecord(it.next()));
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends ListRecord>> flowCollector, Continuation continuation) {
                        Object objCollect = flow2.collect(new C393962(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CuratedListDuxo.this, null);
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "listRecord", "", "Lcom/robinhood/models/db/bonfire/ListRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$3", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends ListRecord>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends ListRecord> list, Continuation<? super Unit> continuation) {
                return invoke2((List<ListRecord>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<ListRecord> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.listsOrderStore.m25749saveOrderedListWithDelayHG0u8IE(new ListsOrder(0, (List) this.L$0, 1, null), Duration.INSTANCE.m28767getZEROUwyO8pc());
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C394091(null));
    }

    public static /* synthetic */ Job bind$default(CuratedListDuxo curatedListDuxo, String str, boolean z, CuratedListSource curatedListSource, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            curatedListSource = CuratedListSource.UNSPECIFIED;
        }
        return curatedListDuxo.bind(str, z, curatedListSource);
    }

    public final Job bind(String accountNumber, boolean shouldShowListRows, CuratedListSource source) {
        Flow<Boolean> flowFlowOf;
        Intrinsics.checkNotNullParameter(source, "source");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        applyMutation(new C393971(shouldShowListRows, accountNumber, source, null));
        if (this.appType == AppType.TRADER) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C394012(null), 2, null);
        } else {
            applyMutation(new C394023(null));
        }
        this.curatedListStore.refreshFollowedLists(false);
        String strNullIfEmpty = StringsKt.nullIfEmpty(accountNumber);
        if (strNullIfEmpty == null || (flowFlowOf = this.accountAccessStore.getFeatureAccess(strNullIfEmpty, AccountFeature.OPTIONS_SUPPORTED)) == null) {
            flowFlowOf = FlowKt.flowOf(Boolean.TRUE);
        }
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(flowFlowOf, this.curatedListStore.streamFollowedCuratedListsInOrder(), new CuratedListDuxo3(null)));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C394034(flowDistinctUntilChanged, this, null), 2, null);
        Flow flowTransformLatest = FlowKt.transformLatest(new Flow<List<? extends CuratedList>>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends CuratedList>> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C393902(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$$inlined$map$1$2 */
            public static final class C393902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$$inlined$map$1$2", m3645f = "CuratedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C393902.this.emit(null, this);
                    }
                }

                public C393902(FlowCollector flowCollector) {
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
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (!((CuratedList) t).isRobinhoodList()) {
                                arrayList.add(t);
                            }
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
        }, new CuratedListDuxo$bind$$inlined$flatMapLatest$1(null, this));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C394045(flowTransformLatest, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C394056(flowDistinctUntilChanged, flowTransformLatest, this, null), 2, null);
        if (accountNumber != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C394067(flowTransformLatest, this, accountNumber, null), 2, null);
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C394078(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C394089(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C3939810(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C3939911(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), completableJobSupervisorJob$default, null, new C3940012(null), 2, null);
        Observable<Boolean> observableDistinctUntilChanged = ExperimentsKt.streamWithExperiment(this.regionGateProvider, this.experimentsStore, SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, true).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListDuxo.bind$lambda$4(this.f$0, (Boolean) obj);
            }
        });
        return completableJobSupervisorJob$default;
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$1 */
    static final class C393971 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ boolean $shouldShowListRows;
        final /* synthetic */ CuratedListSource $source;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C393971(boolean z, String str, CuratedListSource curatedListSource, Continuation<? super C393971> continuation) {
            super(2, continuation);
            this.$shouldShowListRows = z;
            this.$accountNumber = str;
            this.$source = curatedListSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C393971 c393971 = new C393971(this.$shouldShowListRows, this.$accountNumber, this.$source, continuation);
            c393971.L$0 = obj;
            return c393971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
            return ((C393971) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
            return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : this.$shouldShowListRows, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : this.$accountNumber, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : this.$source, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$2", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$2 */
    static final class C394012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C394012(Continuation<? super C394012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C394012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ScreenersStore.getScreeners$default(CuratedListDuxo.this.screenersStore, false, false, false, 3, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CuratedListDuxo.this, null);
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "screeners", "", "Lcom/robinhood/equityscreener/models/db/Screener;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$2$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends Screener>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Screener> list, Continuation<? super Unit> continuation) {
                return invoke2((List<Screener>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<Screener> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$2$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507391 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ List<Screener> $screeners;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507391(List<Screener> list, Continuation<? super C507391> continuation) {
                    super(2, continuation);
                    this.$screeners = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507391 c507391 = new C507391(this.$screeners, continuation);
                    c507391.L$0 = obj;
                    return c507391;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507391) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : this.$screeners, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507391((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$3", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$3 */
    static final class C394023 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C394023(Continuation<? super C394023> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394023 c394023 = new C394023(continuation);
            c394023.L$0 = obj;
            return c394023;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
            return ((C394023) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
            return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : CollectionsKt.emptyList(), (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$4", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$4 */
    static final class C394034 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<List<CuratedList>> $curatedListFlow;
        int label;
        final /* synthetic */ CuratedListDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C394034(Flow<? extends List<CuratedList>> flow, CuratedListDuxo curatedListDuxo, Continuation<? super C394034> continuation) {
            super(2, continuation);
            this.$curatedListFlow = flow;
            this.this$0 = curatedListDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C394034(this.$curatedListFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394034) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "curatedList", "", "Lcom/robinhood/models/db/CuratedList;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$4$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends CuratedList>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends CuratedList> list, Continuation<? super Unit> continuation) {
                return invoke2((List<CuratedList>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<CuratedList> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$4$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507401 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ List<CuratedList> $curatedList;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507401(List<CuratedList> list, Continuation<? super C507401> continuation) {
                    super(2, continuation);
                    this.$curatedList = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507401 c507401 = new C507401(this.$curatedList, continuation);
                    c507401.L$0 = obj;
                    return c507401;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507401) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : this.$curatedList, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507401((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<CuratedList>> flow = this.$curatedListFlow;
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
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$5", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$5 */
    static final class C394045 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Map<UUID, List<CuratedListItem>>> $curatedListItemsFlow;
        int label;
        final /* synthetic */ CuratedListDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C394045(Flow<? extends Map<UUID, ? extends List<CuratedListItem>>> flow, CuratedListDuxo curatedListDuxo, Continuation<? super C394045> continuation) {
            super(2, continuation);
            this.$curatedListItemsFlow = flow;
            this.this$0 = curatedListDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C394045(this.$curatedListItemsFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394045) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "curatedListsItems", "", "Ljava/util/UUID;", "", "Lcom/robinhood/models/db/CuratedListItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$5$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends List<? extends CuratedListItem>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends List<? extends CuratedListItem>> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<UUID, ? extends List<CuratedListItem>>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<UUID, ? extends List<CuratedListItem>> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$5$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507411 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ Map<UUID, List<CuratedListItem>> $curatedListsItems;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C507411(Map<UUID, ? extends List<CuratedListItem>> map, Continuation<? super C507411> continuation) {
                    super(2, continuation);
                    this.$curatedListsItems = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507411 c507411 = new C507411(this.$curatedListsItems, continuation);
                    c507411.L$0 = obj;
                    return c507411;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507411) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : this.$curatedListsItems, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507411((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Map<UUID, List<CuratedListItem>>> flow = this.$curatedListItemsFlow;
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
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6 */
    static final class C394056 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<List<CuratedList>> $curatedListFlow;
        final /* synthetic */ Flow<Map<UUID, List<CuratedListItem>>> $curatedListItemsFlow;
        int label;
        final /* synthetic */ CuratedListDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C394056(Flow<? extends List<CuratedList>> flow, Flow<? extends Map<UUID, ? extends List<CuratedListItem>>> flow2, CuratedListDuxo curatedListDuxo, Continuation<? super C394056> continuation) {
            super(2, continuation);
            this.$curatedListFlow = flow;
            this.$curatedListItemsFlow = flow2;
            this.this$0 = curatedListDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C394056(this.$curatedListFlow, this.$curatedListItemsFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394056) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<List<CuratedList>> flow = this.$curatedListFlow;
                Flow flowCombine = FlowKt.combine(new Flow<List<? extends CuratedList>>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends CuratedList>> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C393922(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$invokeSuspend$$inlined$map$1$2 */
                    public static final class C393922<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$invokeSuspend$$inlined$map$1$2", m3645f = "CuratedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C393922.this.emit(null, this);
                            }
                        }

                        public C393922(FlowCollector flowCollector) {
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
                                ArrayList arrayList = new ArrayList();
                                for (T t : (List) obj) {
                                    if (((CuratedList) t).isOptionsWatchlist()) {
                                        arrayList.add(t);
                                    }
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
                }, this.$curatedListItemsFlow, new AnonymousClass2(null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00010\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "", "Lcom/robinhood/models/db/CuratedListItem;", "optionWatchlists", "Lcom/robinhood/models/db/CuratedList;", "listItems"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$2", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<List<? extends CuratedList>, Map<UUID, ? extends List<? extends CuratedListItem>>, Continuation<? super List<? extends Tuples2<? extends UUID, ? extends Map<String, ? extends CuratedListItem>>>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(List<? extends CuratedList> list, Map<UUID, ? extends List<? extends CuratedListItem>> map, Continuation<? super List<? extends Tuples2<? extends UUID, ? extends Map<String, ? extends CuratedListItem>>>> continuation) {
                return invoke2((List<CuratedList>) list, (Map<UUID, ? extends List<CuratedListItem>>) map, (Continuation<? super List<? extends Tuples2<UUID, ? extends Map<String, CuratedListItem>>>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<CuratedList> list, Map<UUID, ? extends List<CuratedListItem>> map, Continuation<? super List<? extends Tuples2<UUID, ? extends Map<String, CuratedListItem>>>> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = list;
                anonymousClass2.L$1 = map;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List<CuratedList> list = (List) this.L$0;
                Map map = (Map) this.L$1;
                ArrayList arrayList = new ArrayList();
                for (CuratedList curatedList : list) {
                    List<CuratedListItem> list2 = (List) map.get(curatedList.getId());
                    Tuples2 tuples2M3642to = null;
                    if (list2 != null) {
                        UUID id = curatedList.getId();
                        ArrayList arrayList2 = new ArrayList();
                        for (CuratedListItem curatedListItem : list2) {
                            String strategyCode = curatedListItem.getStrategyCode();
                            Tuples2 tuples2M3642to2 = strategyCode != null ? Tuples4.m3642to(strategyCode, curatedListItem) : null;
                            if (tuples2M3642to2 != null) {
                                arrayList2.add(tuples2M3642to2);
                            }
                        }
                        tuples2M3642to = Tuples4.m3642to(id, MapsKt.toMap(arrayList2));
                    }
                    if (tuples2M3642to != null) {
                        arrayList.add(tuples2M3642to);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionWatchlistToListItemStrategyCodes", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "", "Lcom/robinhood/models/db/CuratedListItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends Tuples2<? extends UUID, ? extends Map<String, ? extends CuratedListItem>>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Tuples2<? extends UUID, ? extends Map<String, ? extends CuratedListItem>>> list, Continuation<? super Unit> continuation) {
                return invoke2((List<? extends Tuples2<UUID, ? extends Map<String, CuratedListItem>>>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<? extends Tuples2<UUID, ? extends Map<String, CuratedListItem>>> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009a -> B:15:0x009b). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CuratedListDuxo curatedListDuxo;
                Collection arrayList;
                Iterator it;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    CuratedListDuxo curatedListDuxo2 = this.this$0;
                    curatedListDuxo = curatedListDuxo2;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (Collection) this.L$3;
                    it = (Iterator) this.L$2;
                    Collection collection = (Collection) this.L$1;
                    curatedListDuxo = (CuratedListDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    arrayList.add((Tuples2) obj);
                    arrayList = collection;
                    if (it.hasNext()) {
                        Tuples2 tuples2 = (Tuples2) it.next();
                        final UUID uuid = (UUID) tuples2.component1();
                        final Map map = (Map) tuples2.component2();
                        List<String> list2 = CollectionsKt.toList(map.keySet());
                        OptionStrategyInfoStore.refresh$default(curatedListDuxo.optionStrategyInfoStore, list2, false, 2, null);
                        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(curatedListDuxo.optionStrategyInfoStore.streamUiStrategyInfo(list2)), Integer.MAX_VALUE, null, 2, null);
                        Flow<Tuples2<? extends UUID, ? extends List<? extends CuratedListItem>>> flow = new Flow<Tuples2<? extends UUID, ? extends List<? extends CuratedListItem>>>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3$invokeSuspend$lambda$4$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Tuples2<? extends UUID, ? extends List<? extends CuratedListItem>>> flowCollector, Continuation continuation) {
                                Object objCollect = flowBuffer$default.collect(new C393912(flowCollector, uuid, map), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3$invokeSuspend$lambda$4$$inlined$map$1$2 */
                            public static final class C393912<T> implements FlowCollector {
                                final /* synthetic */ UUID $optionWatchlistId$inlined;
                                final /* synthetic */ Map $optionWatchlistItems$inlined;
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3$invokeSuspend$lambda$4$$inlined$map$1$2", m3645f = "CuratedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3$invokeSuspend$lambda$4$$inlined$map$1$2$1, reason: invalid class name */
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
                                        return C393912.this.emit(null, this);
                                    }
                                }

                                public C393912(FlowCollector flowCollector, UUID uuid, Map map) {
                                    this.$this_unsafeFlow = flowCollector;
                                    this.$optionWatchlistId$inlined = uuid;
                                    this.$optionWatchlistItems$inlined = map;
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
                                        ArrayList arrayList = new ArrayList();
                                        for (T t : (List) obj) {
                                            if (((UiOptionStrategyInfo) t).getIsActive()) {
                                                arrayList.add(t);
                                            }
                                        }
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                        Iterator<T> it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((UiOptionStrategyInfo) it.next()).getOptionStrategyInfo().getStrategyCode());
                                        }
                                        UUID uuid = this.$optionWatchlistId$inlined;
                                        Map map = this.$optionWatchlistItems$inlined;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Map.Entry entry : map.entrySet()) {
                                            CuratedListItem curatedListItem = arrayList2.contains(entry.getKey()) ? (CuratedListItem) entry.getValue() : null;
                                            if (curatedListItem != null) {
                                                arrayList3.add(curatedListItem);
                                            }
                                        }
                                        Tuples2 tuples2M3642to = Tuples4.m3642to(uuid, arrayList3);
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
                        this.L$0 = curatedListDuxo;
                        this.L$1 = arrayList;
                        this.L$2 = it;
                        this.L$3 = arrayList;
                        this.label = 1;
                        obj = FlowKt.first(flow, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        collection = arrayList;
                        arrayList.add((Tuples2) obj);
                        arrayList = collection;
                        if (it.hasNext()) {
                            this.this$0.applyMutation(new AnonymousClass1((List) arrayList, null));
                            return Unit.INSTANCE;
                        }
                    }
                }
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$6$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ List<Tuples2<UUID, List<CuratedListItem>>> $activeOptionWatchlistItems;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(List<? extends Tuples2<UUID, ? extends List<CuratedListItem>>> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$activeOptionWatchlistItems = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activeOptionWatchlistItems, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((AnonymousClass1) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : MapsKt.toMap(this.$activeOptionWatchlistItems), (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7 */
    static final class C394067 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Flow<Map<UUID, List<CuratedListItem>>> $curatedListItemsFlow;
        int label;
        final /* synthetic */ CuratedListDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C394067(Flow<? extends Map<UUID, ? extends List<CuratedListItem>>> flow, CuratedListDuxo curatedListDuxo, String str, Continuation<? super C394067> continuation) {
            super(2, continuation);
            this.$curatedListItemsFlow = flow;
            this.this$0 = curatedListDuxo;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C394067(this.$curatedListItemsFlow, this.this$0, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394067) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<Map<UUID, List<CuratedListItem>>> flow = this.$curatedListItemsFlow;
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<List<? extends CuratedListObjectType>>() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends CuratedListObjectType>> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C393932(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$invokeSuspend$$inlined$map$1$2 */
                    public static final class C393932<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$invokeSuspend$$inlined$map$1$2", m3645f = "CuratedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C393932.this.emit(null, this);
                            }
                        }

                        public C393932(FlowCollector flowCollector) {
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
                                Collection<List> collectionValues = ((Map) obj).values();
                                ArrayList arrayList = new ArrayList();
                                for (List list : collectionValues) {
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((CuratedListItem) it.next()).getObjectType());
                                    }
                                    CollectionsKt.addAll(arrayList, arrayList2);
                                }
                                Set set = CollectionsKt.toSet(arrayList);
                                ArrayList arrayList3 = new ArrayList();
                                for (T t : set) {
                                    if (((CuratedListObjectType) t) != CuratedListObjectType.OPTION_STRATEGY) {
                                        arrayList3.add(t);
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList3, anonymousClass1) == coroutine_suspended) {
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
                }, new CuratedListDuxo$bind$7$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, this.$accountNumber));
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "positionLists", "", "Lcom/robinhood/android/models/portfolio/PositionsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$3", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends PositionsV2>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends PositionsV2> list, Continuation<? super Unit> continuation) {
                return invoke2((List<PositionsV2>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<PositionsV2> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$3$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$7$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ List<PositionsV2> $positionLists;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<PositionsV2> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$positionLists = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$positionLists, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((AnonymousClass1) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    List<PositionsV2> list = this.$positionLists;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.addAll(arrayList, ((PositionsV2) it.next()).getResults());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
                    for (Object obj2 : arrayList) {
                        linkedHashMap.put(((PositionsV2.PositionListItemV2) obj2).getMetadataId(), obj2);
                    }
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : linkedHashMap, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$8", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$8 */
    static final class C394078 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C394078(Continuation<? super C394078> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C394078(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394078) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(CuratedListDuxo.this.listsOrderStore.getOrderedLists()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CuratedListDuxo.this, null);
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/ListsOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$8$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends ListsOrder>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<ListsOrder> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends ListsOrder> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<ListsOrder>) optional, continuation);
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$8$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$8$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507421 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ ListsOrder $listsOrder;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507421(ListsOrder listsOrder, Continuation<? super C507421> continuation) {
                    super(2, continuation);
                    this.$listsOrder = listsOrder;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507421 c507421 = new C507421(this.$listsOrder, continuation);
                    c507421.L$0 = obj;
                    return c507421;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507421) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    List<ListRecord> listEmptyList;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    ListsOrder listsOrder = this.$listsOrder;
                    if (listsOrder == null || (listEmptyList = listsOrder.getLists()) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : listEmptyList, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507421((ListsOrder) ((Optional) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$9", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$9 */
    static final class C394089 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C394089(Continuation<? super C394089> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C394089(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394089) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(CuratedListDuxo.this.expandedCuratedListIdsPref.streamChanges()), Integer.MAX_VALUE, null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CuratedListDuxo.this, null);
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "expandedIds", "", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$9$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<String, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends Boolean> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<String, Boolean>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<String, Boolean> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$9$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507431 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ Map<String, Boolean> $expandedIds;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507431(Map<String, Boolean> map, Continuation<? super C507431> continuation) {
                    super(2, continuation);
                    this.$expandedIds = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507431 c507431 = new C507431(this.$expandedIds, continuation);
                    c507431.L$0 = obj;
                    return c507431;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507431) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    Map<String, Boolean> map = this.$expandedIds;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                    Iterator<T> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        linkedHashMap.put(StringsKt.toUuid((String) entry.getKey()), entry.getValue());
                    }
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : linkedHashMap, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507431((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$10", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$10 */
    static final class C3939810 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3939810(Continuation<? super C3939810> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C3939810(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3939810) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "listViewModes", "", "Lcom/robinhood/models/db/CuratedListItemViewMode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$10$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends CuratedListItemViewMode>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends CuratedListItemViewMode> list, Continuation<? super Unit> continuation) {
                return invoke2((List<CuratedListItemViewMode>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<CuratedListItemViewMode> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$10$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$10$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507361 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ List<CuratedListItemViewMode> $listViewModes;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507361(List<CuratedListItemViewMode> list, Continuation<? super C507361> continuation) {
                    super(2, continuation);
                    this.$listViewModes = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507361 c507361 = new C507361(this.$listViewModes, continuation);
                    c507361.L$0 = obj;
                    return c507361;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507361) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    List<CuratedListItemViewMode> list = this.$listViewModes;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (CuratedListItemViewMode curatedListItemViewMode : list) {
                        Tuples2 tuples2M3642to = Tuples4.m3642to(curatedListItemViewMode.getCuratedListId(), curatedListItemViewMode.getViewMode());
                        linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                    }
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : linkedHashMap, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507361((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CuratedListDuxo.this.curatedListItemViewModeStore.streamCuratedListItemViewModes()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CuratedListDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$11", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$11 */
    static final class C3939911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3939911(Continuation<? super C3939911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C3939911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3939911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamRegionGateStateFlow = CuratedListDuxo.this.regionGateProvider.streamRegionGateStateFlow(WatchlistPositionsTabSwipeToTradeRegionGate.INSTANCE, false);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CuratedListDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inRegionGate", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$11$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$11$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
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

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$11$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$11$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507371 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ boolean $inRegionGate;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507371(boolean z, Continuation<? super C507371> continuation) {
                    super(2, continuation);
                    this.$inRegionGate = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507371 c507371 = new C507371(this.$inRegionGate, continuation);
                    c507371.L$0 = obj;
                    return c507371;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507371) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : this.$inRegionGate, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507371(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$12", m3645f = "CuratedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$12 */
    static final class C3940012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3940012(Continuation<? super C3940012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C3940012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3940012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(CuratedListDuxo.this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CuratedListDuxo.this, null);
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

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$12$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$12$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CuratedListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CuratedListDuxo curatedListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curatedListDuxo;
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

            /* compiled from: CuratedListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$12$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$12$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507381 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
                final /* synthetic */ boolean $isEnabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507381(boolean z, Continuation<? super C507381> continuation) {
                    super(2, continuation);
                    this.$isEnabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507381 c507381 = new C507381(this.$isEnabled, continuation);
                    c507381.L$0 = obj;
                    return c507381;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                    return ((C507381) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                    return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : this.$isEnabled, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507381(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4(CuratedListDuxo curatedListDuxo, Boolean bool) {
        curatedListDuxo.applyMutation(new CuratedListDuxo2(bool, null));
        return Unit.INSTANCE;
    }

    public final Job onReorderFinished$lib_lists_ui_externalDebug(List<? extends CuratedListDuxo7> newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        ListsOrderStore listsOrderStore = this.listsOrderStore;
        List<? extends CuratedListDuxo7> list = newList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CuratedListDuxo6.toListRecord((CuratedListDuxo7) it.next()));
        }
        return listsOrderStore.m25749saveOrderedListWithDelayHG0u8IE(new ListsOrder(0, arrayList, 1, null), this.defaultReorderDelay);
    }

    public final void onWatchListItemRemoved$lib_lists_ui_externalDebug(UUID watchlistId, CuratedListItem curatedListItem) {
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new CuratedListDuxo5(this, watchlistId, curatedListItem, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWatchListItemBuy$lambda$6(String str) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWatchListItemBuy$lib_lists_ui_externalDebug$default(CuratedListDuxo curatedListDuxo, CuratedListItem curatedListItem, String str, Context context, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CuratedListDuxo.onWatchListItemBuy$lambda$6((String) obj2);
                }
            };
        }
        curatedListDuxo.onWatchListItemBuy$lib_lists_ui_externalDebug(curatedListItem, str, context, function1);
    }

    public final void onWatchListItemBuy$lib_lists_ui_externalDebug(CuratedListItem curatedListItem, String accountNumber, Context context, Function1<? super String, Unit> onShowError) {
        Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onShowError, "onShowError");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new CuratedListDuxo4(this, curatedListItem, accountNumber, context, onShowError, null), 3, null);
    }

    public final void onWatchlistViewModeChange$lib_lists_ui_externalDebug(UUID watchlistId, final DisplayType viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        if (watchlistId == null) {
            withDataState(new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListDuxo.onWatchlistViewModeChange$lambda$7(this.f$0, viewMode, (CuratedListDataState) obj);
                }
            });
        } else {
            this.curatedListItemViewModeStore.updateViewMode(watchlistId, CuratedListDuxo6.toCuratedListViewMode(viewMode));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWatchlistViewModeChange$lambda$7(CuratedListDuxo curatedListDuxo, DisplayType displayType, CuratedListDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CuratedListItemViewModeStore curatedListItemViewModeStore = curatedListDuxo.curatedListItemViewModeStore;
        CuratedListViewMode curatedListViewMode = CuratedListDuxo6.toCuratedListViewMode(displayType);
        List<CuratedList> followedCuratedLists = it.getFollowedCuratedLists();
        if (followedCuratedLists == null) {
            followedCuratedLists = CollectionsKt.emptyList();
        }
        curatedListItemViewModeStore.updateAllViewModes(curatedListViewMode, followedCuratedLists);
        return Unit.INSTANCE;
    }

    /* renamed from: onWatchlistItemsReordered-SxA4cEA$lib_lists_ui_externalDebug, reason: not valid java name */
    public final Job m25596onWatchlistItemsReorderedSxA4cEA$lib_lists_ui_externalDebug(CuratedList watchlist, List<? extends WatchlistItemRow> reorderedWatchlistItems, long delay) {
        Intrinsics.checkNotNullParameter(watchlist, "watchlist");
        Intrinsics.checkNotNullParameter(reorderedWatchlistItems, "reorderedWatchlistItems");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore;
        UUID id = watchlist.getId();
        ApiCuratedList.OwnerType ownerType = watchlist.getOwnerType();
        List<? extends WatchlistItemRow> list = reorderedWatchlistItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WatchlistItemRow) it.next()).getCuratedListItem());
        }
        return curatedListItemsStore.m25744reorderListItemsWithDelayWn2Vu4Y(id, ownerType, arrayList, delay);
    }

    public final void onWatchlistExpandToggle(UUID watchlistId, boolean currentState) {
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        StringToBooleanMapPreference stringToBooleanMapPreference = this.expandedCuratedListIdsPref;
        String string2 = watchlistId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        stringToBooleanMapPreference.set(string2, !currentState);
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTradeNux$1", m3645f = "CuratedListDuxo.kt", m3646l = {436}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTradeNux$1 */
    static final class C394171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C394171(Continuation<? super C394171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C394171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CuratedListDuxo curatedListDuxo = CuratedListDuxo.this;
                this.label = 1;
                if (curatedListDuxo.setupSwipeToTrade(this) == coroutine_suspended) {
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

    public final void setupSwipeToTradeNux() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C394171(null), 3, null);
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$2", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$2 */
    static final class C394132 extends ContinuationImpl7 implements Function2<CuratedListViewState, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C394132(Continuation<? super C394132> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394132 c394132 = new C394132(continuation);
            c394132.L$0 = obj;
            return c394132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CuratedListViewState curatedListViewState, Continuation<? super Boolean> continuation) {
            return ((C394132) create(curatedListViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(((CuratedListViewState) this.L$0) instanceof CuratedListViewState.Loaded);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        if (r15 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[PHI: r15
      0x00ac: PHI (r15v15 java.lang.Object) = (r15v14 java.lang.Object), (r15v1 java.lang.Object) binds: [B:28:0x00a9, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupSwipeToTrade(Continuation<? super Unit> continuation) {
        C394121 c394121;
        long duration;
        Flow flowBuffer$default;
        C394143 c394143;
        boolean zBooleanValue;
        if (continuation instanceof C394121) {
            c394121 = (C394121) continuation;
            int i = c394121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c394121.label = i - Integer.MIN_VALUE;
            } else {
                c394121 = new C394121(continuation);
            }
        }
        Object objFirst = c394121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c394121.label) {
            case 0:
                ResultKt.throwOnFailure(objFirst);
                StateFlow<CuratedListViewState> stateFlow = getStateFlow();
                C394132 c394132 = new C394132(null);
                c394121.label = 1;
                if (FlowKt.first(stateFlow, c394132, c394121) != coroutine_suspended) {
                    Duration.Companion companion = Duration.INSTANCE;
                    duration = Duration3.toDuration(2, DurationUnitJvm.SECONDS);
                    c394121.label = 2;
                    if (DelayKt.m28786delayVtjQ1oo(duration, c394121) != coroutine_suspended) {
                        flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{WatchlistRedesignExperiment.INSTANCE}, true, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                        c394143 = new C394143(null);
                        c394121.label = 3;
                        if (FlowKt.first(flowBuffer$default, c394143, c394121) != coroutine_suspended) {
                            Flow<Boolean> flowShowPeek = this.swipeNuxProvider.showPeek();
                            c394121.label = 4;
                            objFirst = FlowKt.first(flowShowPeek, c394121);
                            if (objFirst != coroutine_suspended) {
                                zBooleanValue = ((Boolean) objFirst).booleanValue();
                                TimberLogger.INSTANCE.mo1679d("CuratedListDuxo: setupSwipeToTradeNux: shouldShowPeek = " + zBooleanValue, new Object[0]);
                                if (zBooleanValue) {
                                    applyMutation(new C394154(null));
                                    this.swipeNuxProvider.onPeekShown();
                                    Duration.Companion companion2 = Duration.INSTANCE;
                                    long duration2 = Duration3.toDuration(3, DurationUnitJvm.SECONDS);
                                    c394121.label = 5;
                                    if (DelayKt.m28786delayVtjQ1oo(duration2, c394121) != coroutine_suspended) {
                                        Flow flowFilterNotNull = FlowKt.filterNotNull(this.swipeNuxProvider.tooltip());
                                        c394121.label = 6;
                                        objFirst = FlowKt.first(flowFilterNotNull, c394121);
                                        break;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                ResultKt.throwOnFailure(objFirst);
                Duration.Companion companion3 = Duration.INSTANCE;
                duration = Duration3.toDuration(2, DurationUnitJvm.SECONDS);
                c394121.label = 2;
                if (DelayKt.m28786delayVtjQ1oo(duration, c394121) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                ResultKt.throwOnFailure(objFirst);
                flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{WatchlistRedesignExperiment.INSTANCE}, true, null, 4, null)), Integer.MAX_VALUE, null, 2, null);
                c394143 = new C394143(null);
                c394121.label = 3;
                if (FlowKt.first(flowBuffer$default, c394143, c394121) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                ResultKt.throwOnFailure(objFirst);
                Flow<Boolean> flowShowPeek2 = this.swipeNuxProvider.showPeek();
                c394121.label = 4;
                objFirst = FlowKt.first(flowShowPeek2, c394121);
                if (objFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                ResultKt.throwOnFailure(objFirst);
                zBooleanValue = ((Boolean) objFirst).booleanValue();
                TimberLogger.INSTANCE.mo1679d("CuratedListDuxo: setupSwipeToTradeNux: shouldShowPeek = " + zBooleanValue, new Object[0]);
                if (zBooleanValue) {
                }
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(objFirst);
                Flow flowFilterNotNull2 = FlowKt.filterNotNull(this.swipeNuxProvider.tooltip());
                c394121.label = 6;
                objFirst = FlowKt.first(flowFilterNotNull2, c394121);
                break;
            case 6:
                ResultKt.throwOnFailure(objFirst);
                applyMutation(new C394165((StringResource) objFirst, null));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$3", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$3 */
    static final class C394143 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        C394143(Continuation<? super C394143> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394143 c394143 = new C394143(continuation);
            c394143.Z$0 = ((Boolean) obj).booleanValue();
            return c394143;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
            return ((C394143) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.Z$0);
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$4", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$4 */
    static final class C394154 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C394154(Continuation<? super C394154> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394154 c394154 = new C394154(continuation);
            c394154.L$0 = obj;
            return c394154;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
            return ((C394154) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
            return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : new SwipeAnimationPreview(new UiEvent(Unit.INSTANCE), new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }), (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$5", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$setupSwipeToTrade$5 */
    static final class C394165 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
        final /* synthetic */ StringResource $tooltip;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C394165(StringResource stringResource, Continuation<? super C394165> continuation) {
            super(2, continuation);
            this.$tooltip = stringResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394165 c394165 = new C394165(this.$tooltip, continuation);
            c394165.L$0 = obj;
            return c394165;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
            return ((C394165) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
            return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : this.$tooltip, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
        }
    }

    public final void onSwipe() {
        this.swipeNuxProvider.onSwipe();
    }

    public final void onEquitySwipeTooltipShown() {
        this.experimentsStore.logExposure(WatchlistRedesignExperiment.INSTANCE);
        this.swipeNuxProvider.onTooltipShown();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C394111(null), 3, null);
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onEquitySwipeTooltipShown$1", m3645f = "CuratedListDuxo.kt", m3646l = {476}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onEquitySwipeTooltipShown$1 */
    static final class C394111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C394111(Continuation<? super C394111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListDuxo.this.new C394111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CuratedListDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CuratedListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onEquitySwipeTooltipShown$1$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onEquitySwipeTooltipShown$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
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
            public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
                return ((AnonymousClass1) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
                return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
            }
        }
    }

    /* compiled from: CuratedListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onEquitySwipeTooltipClick$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$onEquitySwipeTooltipClick$1 */
    static final class C394101 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C394101(Continuation<? super C394101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394101 c394101 = new C394101(continuation);
            c394101.L$0 = obj;
            return c394101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
            return ((C394101) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
            return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : false);
        }
    }

    public final void onEquitySwipeTooltipClick() {
        applyMutation(new C394101(null));
    }
}
