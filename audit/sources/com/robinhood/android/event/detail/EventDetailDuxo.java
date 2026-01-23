package com.robinhood.android.event.detail;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.EventDetailDuxo;
import com.robinhood.android.event.detail.EventDetailDuxo2;
import com.robinhood.android.event.detail.EventDetailScreenEvent;
import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.event.detail.duel.StreamContractListUseCase;
import com.robinhood.android.event.detail.duel.StreamLiveEventStateUseCase;
import com.robinhood.android.event.detail.experiments.LiveActivityExperimentVariant;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailFragmentKeyInternalOnly;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.experiments.AcqPredictionMarketsStreamlinedTradeFlowExperiment;
import com.robinhood.android.eventcontracts.experiments.EventContractsSportsExperiment;
import com.robinhood.android.eventcontracts.sharedeventui.animation.BuildOpenInterestAggregatedDeltaMapping;
import com.robinhood.android.eventcontracts.sharedeventui.experiments.DefaultSpanExperiment;
import com.robinhood.android.eventcontracts.sharedeventui.experiments.FormatPriceAsCentsExperiment;
import com.robinhood.android.eventcontracts.sharedeventui.trade.CheckTradabilityUseCase;
import com.robinhood.android.futures.charts.EventContractChartArg;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContractTradability;
import com.robinhood.android.models.event.p186db.arsenal.EventTimeline;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStateStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.math.BigDecimals7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Clock;
import p479j$.time.Instant;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0007\u0018\u0000 _2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001_B\u0081\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J/\u00106\u001a\u00020'2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\b\b\u0002\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020'2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020'2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020'2\u0006\u0010@\u001a\u000204H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010G\u001a\u00020'2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020'H\u0016¢\u0006\u0004\bI\u0010)J\u000f\u0010J\u001a\u00020'H\u0016¢\u0006\u0004\bJ\u0010)J\u0017\u0010L\u001a\u00020'2\u0006\u0010K\u001a\u00020.H\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020'2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bN\u0010MR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010OR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010PR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010QR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010RR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010TR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010UR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010VR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010WR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010YR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010ZR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010[R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\\\u001a\u0004\b]\u0010^¨\u0006`"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;", "Lcom/robinhood/android/event/detail/EventDetailViewState;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/event/detail/EventDetailContentCallbacks;", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "futuresChartsServiceManager", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventStateStore;", "eventStateStore", "Lcom/robinhood/store/event/EventOrderStore;", "eventOrderStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "streamEventMarketSessionChangeState", "Lcom/robinhood/android/event/detail/duel/StreamLiveEventStateUseCase;", "streamLiveEventStateUseCase", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;", "contractListUseCase", "Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;", "checkTradabilityUseCase", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/event/EventStateStore;Lcom/robinhood/store/event/EventOrderStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;Lcom/robinhood/android/event/detail/duel/StreamLiveEventStateUseCase;Lcom/robinhood/experiments/ExperimentsProvider;Lj$/time/Clock;Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "span", "onSpanSelected", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)V", "Ljava/util/UUID;", "contractId", "Lrosetta/mainst/SideDto;", "side", "Lrosetta/mainst/PositionEffectDto;", "positionEffect", "", "isFromHubPill", "onTrade", "(Ljava/util/UUID;Lrosetta/mainst/SideDto;Lrosetta/mainst/PositionEffectDto;Z)V", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;", "displayMode", "onDisplayModeChange", "(Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;)V", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "point", "onScrub", "(Lcom/robinhood/models/serverdriven/experimental/api/Point;)V", "visible", "onHeaderVisibilityChange", "(Z)V", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "buttonState", "", "anchorYPx", "onTradeButtonClicked", "(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;I)V", "onTradeOverlayDialogDismiss", "onEventFaqClick", "eventId", "onViewAllClick", "(Ljava/util/UUID;)V", "onContractSelected", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "Lcom/robinhood/store/event/EventStore;", "Lcom/robinhood/store/event/EventMarketdataStore;", "Lcom/robinhood/store/event/EventStateStore;", "Lcom/robinhood/store/event/EventOrderStore;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "Lcom/robinhood/store/event/EventContractPositionStore;", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "Lcom/robinhood/android/event/detail/duel/StreamLiveEventStateUseCase;", "Lcom/robinhood/experiments/ExperimentsProvider;", "Lj$/time/Clock;", "Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;", "Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventDetailDuxo extends BaseDuxo3<EventDetailDuelDataState, EventDetailViewState, EventDetailScreenEvent> implements HasSavedState, EventDetailContentCallbacks {
    private static final String ARGS_CONTRACT_SELECTION = "contract_selection";
    private static final String ARGS_SELECTED_DISPLAY_MODE = "selected_display_mode";
    private static final String ARGS_START_ONBOARDING_TRADE_FROM_PILL = "start_onboarding_trade_from_pill";
    private final CheckTradabilityUseCase checkTradabilityUseCase;
    private final Clock clock;
    private final StreamContractListUseCase contractListUseCase;
    private final EventContractPositionStore eventContractPositionStore;
    private final EventMarketdataStore eventMarketdataStore;
    private final EventOrderStore eventOrderStore;
    private final EventStateStore eventStateStore;
    private final EventStore eventStore;
    private final ExperimentsProvider experimentsProvider;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesChartsServiceManager futuresChartsServiceManager;
    private final SavedStateHandle savedStateHandle;
    private final StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState;
    private final StreamLiveEventStateUseCase streamLiveEventStateUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EventDetailDuxo(FuturesChartsServiceManager futuresChartsServiceManager, EventStore eventStore, EventMarketdataStore eventMarketdataStore, EventStateStore eventStateStore, EventOrderStore eventOrderStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState, StreamLiveEventStateUseCase streamLiveEventStateUseCase, ExperimentsProvider experimentsProvider, Clock clock, StreamContractListUseCase contractListUseCase, CheckTradabilityUseCase checkTradabilityUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(streamLiveEventStateUseCase, "streamLiveEventStateUseCase");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(contractListUseCase, "contractListUseCase");
        Intrinsics.checkNotNullParameter(checkTradabilityUseCase, "checkTradabilityUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet = (EventDetailDisplayDataBottomSheet) savedStateHandle.get(ARGS_SELECTED_DISPLAY_MODE);
        EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet2 = eventDetailDisplayDataBottomSheet == null ? EventDetailDisplayDataBottomSheet.LAST_YES_PRICE : eventDetailDisplayDataBottomSheet;
        EventDetailDuxo2 eventDetailDuxo2 = (EventDetailDuxo2) savedStateHandle.get(ARGS_CONTRACT_SELECTION);
        super(new EventDetailDuelDataState(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, eventDetailDuxo2 == null ? EventDetailDuxo2.Loading.INSTANCE : eventDetailDuxo2, eventDetailDisplayDataBottomSheet2, false, null, null, false, 3997695, null), EventDetailDuxo8.INSTANCE, duxoBundle);
        this.futuresChartsServiceManager = futuresChartsServiceManager;
        this.eventStore = eventStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventStateStore = eventStateStore;
        this.eventOrderStore = eventOrderStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.streamEventMarketSessionChangeState = streamEventMarketSessionChangeState;
        this.streamLiveEventStateUseCase = streamLiveEventStateUseCase;
        this.experimentsProvider = experimentsProvider;
        this.clock = clock;
        this.contractListUseCase = contractListUseCase;
        this.checkTradabilityUseCase = checkTradabilityUseCase;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C160681(null));
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1 */
    static final class C160681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EcUuidType.values().length];
                try {
                    iArr[EcUuidType.EVENT_ID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EcUuidType.CONTRACT_ID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C160681(Continuation<? super C160681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160681 c160681 = EventDetailDuxo.this.new C160681(continuation);
            c160681.L$0 = obj;
            return c160681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C160681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow flowFlowOf;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(EventDetailDuxo.this, null), 3, null);
            Companion companion = EventDetailDuxo.INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$0[((EventDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) EventDetailDuxo.this)).getType().ordinal()];
            if (i == 1) {
                flowFlowOf = FlowKt.flowOf(((EventDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) EventDetailDuxo.this)).getId());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                flowFlowOf = FlowKt.distinctUntilChanged(FlowKt.mapLatest(EventDetailDuxo.this.eventStore.streamEventContract(((EventDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) EventDetailDuxo.this)).getId()), new EventDetailDuxo5(null)));
            }
            Flow flowShare = EventDetailDuxo7.share(flowFlowOf, coroutineScope);
            final Flow flowShare2 = EventDetailDuxo7.share(FlowKt.transformLatest(flowShare, new C16061xf0a35c5(null, EventDetailDuxo.this)), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(flowShare2, EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(flowShare, EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(EventDetailDuxo.this, null), 3, null);
            final StateFlow<EventDetailViewState> stateFlow = EventDetailDuxo.this.getStateFlow();
            Flow flowShare3 = EventDetailDuxo7.share(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new C160662(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2 */
                public static final class C160662<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {56}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            return C160662.this.emit(null, this);
                        }
                    }

                    public C160662(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        ArrayList arrayList;
                        SortedMap<Integer, EventContract> orderedContracts;
                        Collection<EventContract> collectionValues;
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
                            UiEcEvent uiEvent = ((EventDetailViewState) obj).getUiEvent();
                            if (uiEvent == null || (orderedContracts = uiEvent.getOrderedContracts()) == null || (collectionValues = orderedContracts.values()) == null) {
                                arrayList = null;
                            } else {
                                Collection<EventContract> collection = collectionValues;
                                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
                                Iterator<T> it = collection.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((EventContract) it.next()).getContractId());
                                }
                            }
                            if (arrayList != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
            }), coroutineScope);
            Flow flowShare4 = EventDetailDuxo7.share(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<ExchangeSource>() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super ExchangeSource> flowCollector, Continuation continuation) {
                    Object objCollect = flowShare2.collect(new C160652(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                public static final class C160652<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C160652.this.emit(null, this);
                        }
                    }

                    public C160652(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        ExchangeSource exchangeSource;
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
                            Collection<EventContract> collectionValues = ((UiEcEvent) obj).getOrderedContracts().values();
                            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                            EventContract eventContract = (EventContract) CollectionsKt.firstOrNull(collectionValues);
                            if (eventContract == null || (exchangeSource = eventContract.getExchangeSource()) == null) {
                                exchangeSource = ExchangeSource.UNKNOWN;
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(exchangeSource, anonymousClass1) == coroutine_suspended) {
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
            }), new C16062xf0a35c6(null, EventDetailDuxo.this)), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(flowShare3, EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(flowShare4, EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(flowShare2, EventDetailDuxo.this, null), 3, null);
            Flow flowShare5 = EventDetailDuxo7.share(EventDetailDuxo.this.futuresAccountStore.streamRhsAccountNumberWithFuturesAccountAllowed(), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(flowShare5, EventDetailDuxo.this, null), 3, null);
            Flow flowShare6 = EventDetailDuxo7.share(FlowKt.transformLatest(flowShare5, new C16063xf0a35c7(null, EventDetailDuxo.this)), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(flowShare6, EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(EventDetailDuxo7.share(FlowKt.transformLatest(flowShare3, new C16064xf0a35c8(null, EventDetailDuxo.this)), coroutineScope), EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(flowShare6, flowShare, EventDetailDuxo.this, null), 3, null);
            Flow flowShare7 = EventDetailDuxo7.share(EventDetailDuxo.this.eventContractPositionStore.streamAllPositions(), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(flowShare7, EventDetailDuxo.this, null), 3, null);
            Flow flowShare8 = EventDetailDuxo7.share(EventDetailDuxo.this.getSavedStateHandle().getStateFlow(EventDetailDuxo.ARGS_SELECTED_DISPLAY_MODE, EventDetailDisplayDataBottomSheet.LAST_YES_PRICE), coroutineScope);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(flowShare2, EventDetailDuxo.this, flowShare8, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(flowShare8, EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass16(EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass17(EventDetailDuxo.this, flowShare, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass18(EventDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass19(flowShare, EventDetailDuxo.this, null), 3, null);
            if (((EventDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) EventDetailDuxo.this)).isFromHubPill()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass20(EventDetailDuxo.this, flowShare6, flowShare2, flowShare4, flowShare7, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500031 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C500031(Continuation<? super C500031> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500031 c500031 = new C500031(continuation);
                    c500031.L$0 = obj;
                    return c500031;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                    return ((C500031) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4161535, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C500031(null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {165}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<UiEcEvent> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/models/event/ui/UiEcEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$2$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiEcEvent, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiEcEvent uiEcEvent, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uiEcEvent, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$2$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500101 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ UiEcEvent $event;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500101(UiEcEvent uiEcEvent, Continuation<? super C500101> continuation) {
                        super(2, continuation);
                        this.$event = uiEcEvent;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500101 c500101 = new C500101(this.$event, continuation);
                        c500101.L$0 = obj;
                        return c500101;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500101) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, this.$event, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194302, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500101((UiEcEvent) this.L$0, null));
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
                    Flow<UiEcEvent> flow = this.$eventFlow;
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

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$3", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{LiveActivityExperimentVariant.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hide", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$3$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
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

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$3$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500111 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ boolean $hide;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500111(boolean z, Continuation<? super C500111> continuation) {
                        super(2, continuation);
                        this.$hide = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500111 c500111 = new C500111(this.$hide, continuation);
                        c500111.L$0 = obj;
                        return c500111;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500111) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, !this.$hide, null, null, null, false, null, null, false, 4177919, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500111(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$4", m3645f = "EventDetailDuxo.kt", m3646l = {182}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Flow<UUID> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventIdFlow, new C16053xc9ddb175(null, this.this$0));
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "timeline", "Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$4$2", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EventTimeline, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventTimeline eventTimeline, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(eventTimeline, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$4$2$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ EventTimeline $timeline;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(EventTimeline eventTimeline, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$timeline = eventTimeline;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeline, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((AnonymousClass1) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, this.$timeline, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194287, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((EventTimeline) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<EventDetailViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<EventContractChartArg>() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super EventContractChartArg> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C160552(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1$2 */
                        public static final class C160552<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    return C160552.this.emit(null, this);
                                }
                            }

                            public C160552(FlowCollector flowCollector) {
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
                                    EventContractChartArg eventContractChartArg = ((EventDetailViewState) obj).getEventContractChartArg();
                                    if (eventContractChartArg != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(eventContractChartArg, anonymousClass1) == coroutine_suspended) {
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
                    }), new C16054x20fba254(null, this.this$0));
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/futures/charts/FuturesChartResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$3", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FuturesChartResult, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FuturesChartResult futuresChartResult, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(futuresChartResult, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$3$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$5$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ FuturesChartResult $response;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(FuturesChartResult futuresChartResult, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$response = futuresChartResult;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((AnonymousClass1) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventDetailDuelDataState eventDetailDuelDataState = (EventDetailDuelDataState) this.L$0;
                        FuturesChartResult futuresChartResult = this.$response;
                        return EventDetailDuelDataState.copy$default(eventDetailDuelDataState, null, null, null, futuresChartResult != null ? futuresChartResult.getChart() : null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194295, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((FuturesChartResult) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$6", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<List<UUID>> $contractIdsFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass6(Flow<? extends List<UUID>> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$contractIdsFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$contractIdsFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$contractIdsFlow, new C16057x78199333(null, this.this$0));
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "newContractIdToFundamentals", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$6$2", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$6$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventFundamental>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventFundamental> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventFundamental>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventFundamental> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$6$2$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$6$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventFundamental> $newContractIdToFundamentals;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ EventDetailDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(EventDetailDuxo eventDetailDuxo, Map<UUID, EventFundamental> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = eventDetailDuxo;
                        this.$newContractIdToFundamentals = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$newContractIdToFundamentals, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((AnonymousClass1) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            EventDetailDuelDataState eventDetailDuelDataState = (EventDetailDuelDataState) this.L$0;
                            Instant instantNow = Instant.now(this.this$0.clock);
                            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                            return EventDetailDuelDataState.copy$default(eventDetailDuelDataState, null, null, null, null, null, null, null, null, null, BuildOpenInterestAggregatedDeltaMapping.buildOpenInterestDeltaMapping$default(instantNow, this.$newContractIdToFundamentals, eventDetailDuelDataState.getContractIdToFundamentals(), eventDetailDuelDataState.getContractIdToOpenInterestDeltas(), null, 16, null), this.$newContractIdToFundamentals, null, null, false, false, null, null, null, false, null, null, false, 4192767, null);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Map map = (Map) this.L$0;
                    EventDetailDuxo eventDetailDuxo = this.this$0;
                    eventDetailDuxo.applyMutation(new AnonymousClass1(eventDetailDuxo, map, null));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$7", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<MarketSessionChangeDataState> $marketSessionFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(Flow<MarketSessionChangeDataState> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$marketSessionFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$marketSessionFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<MarketSessionChangeDataState> flow = this.$marketSessionFlow;
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$7$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketSessionChangeDataState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(marketSessionChangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$7$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500121 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ MarketSessionChangeDataState $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500121(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super C500121> continuation) {
                        super(2, continuation);
                        this.$it = marketSessionChangeDataState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500121 c500121 = new C500121(this.$it, continuation);
                        c500121.L$0 = obj;
                        return c500121;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500121) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, this.$it, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500121((MarketSessionChangeDataState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(Flow<UiEcEvent> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.$eventFlow, this.this$0, continuation);
                anonymousClass8.L$0 = obj;
                return anonymousClass8;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    final Flow<UiEcEvent> flow = this.$eventFlow;
                    final Flow<UiEcEvent> flow2 = new Flow<UiEcEvent>() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UiEcEvent> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C160582(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C160582<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$filter$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    return C160582.this.emit(null, this);
                                }
                            }

                            public C160582(FlowCollector flowCollector) {
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
                                    UiEcEvent uiEcEvent = (UiEcEvent) obj;
                                    if (uiEcEvent.getEvent().getViewMode() == EventViewMode.PAIR && uiEcEvent.getOrderedContracts().size() >= 2) {
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
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends UUID, ? extends List<? extends EventContract>>>() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends UUID, ? extends List<? extends EventContract>>> flowCollector, Continuation continuation) {
                            Object objCollect = flow2.collect(new C160602(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$map$1$2 */
                        public static final class C160602<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$map$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C160602.this.emit(null, this);
                                }
                            }

                            public C160602(FlowCollector flowCollector) {
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
                                    UiEcEvent uiEcEvent = (UiEcEvent) obj;
                                    UUID eventId = uiEcEvent.getEvent().getEventId();
                                    SortedMap<Integer, EventContract> orderedContracts = uiEcEvent.getOrderedContracts();
                                    ArrayList arrayList = new ArrayList(orderedContracts.size());
                                    Iterator<Map.Entry<Integer, EventContract>> it = orderedContracts.entrySet().iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(it.next().getValue());
                                    }
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(eventId, arrayList);
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
                    }), new C16059x265574f1(null, this.this$0, coroutineScope));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/event/detail/EventDetailLiveDataSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$4", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<EventDetailLiveDataSectionViewState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(eventDetailLiveDataSectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$4$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$8$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ EventDetailLiveDataSectionViewState $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = eventDetailLiveDataSectionViewState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((AnonymousClass1) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, this.$it, null, false, 3670015, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((EventDetailLiveDataSectionViewState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$9", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $rhsAccountNumberFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(Flow<String> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$rhsAccountNumberFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.$rhsAccountNumberFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<String> flow = this.$rhsAccountNumberFlow;
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "individualAccountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$9$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$9$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500131 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ String $individualAccountNumber;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500131(String str, Continuation<? super C500131> continuation) {
                        super(2, continuation);
                        this.$individualAccountNumber = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500131 c500131 = new C500131(this.$individualAccountNumber, continuation);
                        c500131.L$0 = obj;
                        return c500131;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500131) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, this.$individualAccountNumber, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194301, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500131((String) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$10", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass10(Flow<? extends Optional<FuturesAccount>> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$optionalSwapAccountFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$optionalSwapAccountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Optional<FuturesAccount>> flow = this.$optionalSwapAccountFlow;
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "swapAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$10$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends FuturesAccount>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<FuturesAccount> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends FuturesAccount> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<FuturesAccount>) optional, continuation);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$10$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500041 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ Optional<FuturesAccount> $swapAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500041(Optional<FuturesAccount> optional, Continuation<? super C500041> continuation) {
                        super(2, continuation);
                        this.$swapAccount = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500041 c500041 = new C500041(this.$swapAccount, continuation);
                        c500041.L$0 = obj;
                        return c500041;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500041) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, this.$swapAccount, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194299, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500041((Optional) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$11", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Map<UUID, EventQuote>> $quotesFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass11(Flow<? extends Map<UUID, EventQuote>> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.$quotesFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.$quotesFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Map<UUID, EventQuote>> flow = this.$quotesFlow;
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contractIdToQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$11$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventQuote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventQuote> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventQuote>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventQuote> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$11$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500051 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventQuote> $contractIdToQuotes;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500051(Map<UUID, EventQuote> map, Continuation<? super C500051> continuation) {
                        super(2, continuation);
                        this.$contractIdToQuotes = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500051 c500051 = new C500051(this.$contractIdToQuotes, continuation);
                        c500051.L$0 = obj;
                        return c500051;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500051) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, this.$contractIdToQuotes, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194271, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500051((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12", m3645f = "EventDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass12(Flow<? extends Optional<FuturesAccount>> flow, Flow<UUID> flow2, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.$optionalSwapAccountFlow = flow;
                this.$eventIdFlow = flow2;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.$optionalSwapAccountFlow, this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Optional<FuturesAccount>> flow = this.$optionalSwapAccountFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(FlowKt.combine(new Flow<FuturesAccount>() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super FuturesAccount> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                            /* JADX WARN: Multi-variable type inference failed */
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
                                    Object orNull = ((Optional) obj).getOrNull();
                                    if (orNull != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                    }, this.$eventIdFlow, new AnonymousClass2(null))), new C16045xf6b07eb2(null, this.this$0));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/UUID;", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "eventId"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$2", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FuturesAccount, UUID, Continuation<? super Tuples2<? extends UUID, ? extends UUID>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FuturesAccount futuresAccount, UUID uuid, Continuation<? super Tuples2<UUID, UUID>> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = futuresAccount;
                    anonymousClass2.L$1 = uuid;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FuturesAccount futuresAccount, UUID uuid, Continuation<? super Tuples2<? extends UUID, ? extends UUID>> continuation) {
                    return invoke2(futuresAccount, uuid, (Continuation<? super Tuples2<UUID, UUID>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    FuturesAccount futuresAccount = (FuturesAccount) this.L$0;
                    return Tuples4.m3642to(futuresAccount.getId(), (UUID) this.L$1);
                }
            }

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$4", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends List<? extends UiEventOrder>>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends List<? extends UiEventOrder>> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, ? extends List<UiEventOrder>>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, ? extends List<UiEventOrder>> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$4$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$12$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ Map<UUID, List<UiEventOrder>> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Map<UUID, ? extends List<UiEventOrder>> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((AnonymousClass1) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, this.$it, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194175, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$13", m3645f = "EventDetailDuxo.kt", m3646l = {335}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<List<UiEventContractPosition>> $positionsFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass13(Flow<? extends List<UiEventContractPosition>> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.$positionsFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.$positionsFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<List<UiEventContractPosition>> flow = this.$positionsFlow;
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "positions", "", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$13$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$13$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiEventContractPosition>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends UiEventContractPosition> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<UiEventContractPosition>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<UiEventContractPosition> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$13$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$13$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500061 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ List<UiEventContractPosition> $positions;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500061(List<UiEventContractPosition> list, Continuation<? super C500061> continuation) {
                        super(2, continuation);
                        this.$positions = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500061 c500061 = new C500061(this.$positions, continuation);
                        c500061.L$0 = obj;
                        return c500061;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500061) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventDetailDuelDataState eventDetailDuelDataState = (EventDetailDuelDataState) this.L$0;
                        List<UiEventContractPosition> list = this.$positions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (Object obj2 : list) {
                            linkedHashMap.put(((UiEventContractPosition) obj2).getContractId(), obj2);
                        }
                        return EventDetailDuelDataState.copy$default(eventDetailDuelDataState, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 4194239, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500061((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14", m3645f = "EventDetailDuxo.kt", m3646l = {379}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<EventDetailDisplayDataBottomSheet> $displayModeFlow;
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EcUuidType.values().length];
                    try {
                        iArr[EcUuidType.CONTRACT_ID.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EcUuidType.EVENT_ID.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass14(Flow<UiEcEvent> flow, EventDetailDuxo eventDetailDuxo, Flow<? extends EventDetailDisplayDataBottomSheet> flow2, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.$eventFlow = flow;
                this.this$0 = eventDetailDuxo;
                this.$displayModeFlow = flow2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.$eventFlow, this.this$0, this.$displayModeFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventFlow, new C16047xa4ec6070(null, this.this$0, this.$displayModeFlow));
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "listData", "", "Lcom/robinhood/android/event/detail/builders/ContractListData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14$2", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends ContractListData>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends ContractListData> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<ContractListData>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<ContractListData> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14$2$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ List<ContractListData> $listData;
                    private /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ EventDetailDuxo this$0;

                    /* compiled from: EventDetailDuxo.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$14$2$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EcUuidType.values().length];
                            try {
                                iArr[EcUuidType.CONTRACT_ID.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[EcUuidType.EVENT_ID.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(EventDetailDuxo eventDetailDuxo, List<ContractListData> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = eventDetailDuxo;
                        this.$listData = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$listData, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((AnonymousClass1) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        EventDetailDuxo2 contractSelection;
                        UUID id;
                        Object next;
                        EventContract contract;
                        ContractListData contractListData;
                        EventContract contract2;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventDetailDuelDataState eventDetailDuelDataState = (EventDetailDuelDataState) this.L$0;
                        if (Intrinsics.areEqual(eventDetailDuelDataState.getContractSelection(), EventDetailDuxo2.Loading.INSTANCE)) {
                            Companion companion = EventDetailDuxo.INSTANCE;
                            int i = WhenMappings.$EnumSwitchMapping$0[((EventDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) this.this$0)).getType().ordinal()];
                            if (i == 1) {
                                id = ((EventDetailFragmentKeyInternalOnly) companion.getArgs((HasSavedState) this.this$0)).getId();
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                List<ContractListData> list = this.$listData;
                                id = (list == null || (contractListData = (ContractListData) CollectionsKt.firstOrNull((List) list)) == null || (contract2 = contractListData.getContract()) == null) ? null : contract2.getContractId();
                            }
                            List<ContractListData> list2 = this.$listData;
                            if (list2 != null) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (Intrinsics.areEqual(((ContractListData) next).getContract().getContractId(), id)) {
                                        break;
                                    }
                                }
                                ContractListData contractListData2 = (ContractListData) next;
                                EventContractTradability tradability = (contractListData2 == null || (contract = contractListData2.getContract()) == null) ? null : contract.getTradability();
                                if (tradability != EventContractTradability.UNTRADABLE && id != null) {
                                    contractSelection = new EventDetailDuxo2.Selected(id);
                                } else {
                                    contractSelection = EventDetailDuxo2.Loading.INSTANCE;
                                }
                            }
                        } else {
                            contractSelection = eventDetailDuelDataState.getContractSelection();
                        }
                        EventDetailDuxo2 eventDetailDuxo2 = contractSelection;
                        List<ContractListData> list3 = this.$listData;
                        return EventDetailDuelDataState.copy$default(eventDetailDuelDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, list3 != null ? extensions2.toPersistentList(list3) : null, eventDetailDuxo2, null, false, null, null, false, 4095999, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    EventDetailDuxo eventDetailDuxo = this.this$0;
                    eventDetailDuxo.applyMutation(new AnonymousClass1(eventDetailDuxo, list, null));
                    return Unit.INSTANCE;
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$15", m3645f = "EventDetailDuxo.kt", m3646l = {408}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<EventDetailDisplayDataBottomSheet> $displayModeFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass15(Flow<? extends EventDetailDisplayDataBottomSheet> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.$displayModeFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.$displayModeFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<EventDetailDisplayDataBottomSheet> flow = this.$displayModeFlow;
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "selectedDisplayMode", "Lcom/robinhood/android/event/detail/ui/bottomsheets/EventDetailContractDisplayMode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$15$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$15$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDisplayDataBottomSheet, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(eventDetailDisplayDataBottomSheet, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$15$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$15$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500071 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ EventDetailDisplayDataBottomSheet $selectedDisplayMode;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500071(EventDetailDisplayDataBottomSheet eventDetailDisplayDataBottomSheet, Continuation<? super C500071> continuation) {
                        super(2, continuation);
                        this.$selectedDisplayMode = eventDetailDisplayDataBottomSheet;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500071 c500071 = new C500071(this.$selectedDisplayMode, continuation);
                        c500071.L$0 = obj;
                        return c500071;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500071) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, this.$selectedDisplayMode, false, null, null, false, 4063231, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500071((EventDetailDisplayDataBottomSheet) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$16", m3645f = "EventDetailDuxo.kt", m3646l = {417}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$16, reason: invalid class name */
        static final class AnonymousClass16 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass16(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{EventContractsSportsExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$16$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$16$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
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

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$16$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$16$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500081 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ boolean $isInExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500081(boolean z, Continuation<? super C500081> continuation) {
                        super(2, continuation);
                        this.$isInExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500081 c500081 = new C500081(this.$isInExperiment, continuation);
                        c500081.L$0 = obj;
                        return c500081;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500081) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, this.$isInExperiment, null, null, false, 3932159, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500081(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$17", m3645f = "EventDetailDuxo.kt", m3646l = {441}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$17, reason: invalid class name */
        static final class AnonymousClass17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass17(EventDetailDuxo eventDetailDuxo, Flow<UUID> flow, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.this$0 = eventDetailDuxo;
                this.$eventIdFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass17(this.this$0, this.$eventIdFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.getStateFlow().getValue().getChartState().getActiveSpan() == null) {
                        Flow flowTake = FlowKt.take(FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{DefaultSpanExperiment.INSTANCE}, false, null, 6, null), new C16049xaa46330d(null, this.$eventIdFlow, this.this$0)), 1);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$17$2", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$17$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DisplaySpan, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DisplaySpan displaySpan, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(displaySpan, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$17$2$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$17$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ DisplaySpan $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DisplaySpan displaySpan, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = displaySpan;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((AnonymousClass1) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, this.$it, null, false, false, null, null, null, false, null, null, false, 4192255, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((DisplaySpan) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$18", m3645f = "EventDetailDuxo.kt", m3646l = {451}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$18, reason: invalid class name */
        static final class AnonymousClass18 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass18(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass18) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{FormatPriceAsCentsExperiment.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$18$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$18$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
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

                /* compiled from: EventDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$18$1$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$18$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500091 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500091(boolean z, Continuation<? super C500091> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500091 c500091 = new C500091(this.$it, continuation);
                        c500091.L$0 = obj;
                        return c500091;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
                        return ((C500091) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, this.$it, 2097151, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500091(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$19", m3645f = "EventDetailDuxo.kt", m3646l = {459}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$19, reason: invalid class name */
        static final class AnonymousClass19 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(Flow<UUID> flow, EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = eventDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass19(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$19$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new EventDetailScreenEvent.PollBottomSheet((UUID) this.L$0));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<UUID> flow = this.$eventIdFlow;
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

        /* compiled from: EventDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20", m3645f = "EventDetailDuxo.kt", m3646l = {479}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20, reason: invalid class name */
        static final class AnonymousClass20 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UiEcEvent> $eventFlow;
            final /* synthetic */ Flow<MarketSessionChangeDataState> $marketSessionFlow;
            final /* synthetic */ Flow<Optional<FuturesAccount>> $optionalSwapAccountFlow;
            final /* synthetic */ Flow<List<UiEventContractPosition>> $positionsFlow;
            int label;
            final /* synthetic */ EventDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass20(EventDetailDuxo eventDetailDuxo, Flow<? extends Optional<FuturesAccount>> flow, Flow<UiEcEvent> flow2, Flow<MarketSessionChangeDataState> flow3, Flow<? extends List<UiEventContractPosition>> flow4, Continuation<? super AnonymousClass20> continuation) {
                super(2, continuation);
                this.this$0 = eventDetailDuxo;
                this.$optionalSwapAccountFlow = flow;
                this.$eventFlow = flow2;
                this.$marketSessionFlow = flow3;
                this.$positionsFlow = flow4;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass20(this.this$0, this.$optionalSwapAccountFlow, this.$eventFlow, this.$marketSessionFlow, this.$positionsFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowCombine = FlowKt.combine(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{AcqPredictionMarketsStreamlinedTradeFlowExperiment.INSTANCE}, false, null, 6, null), this.$optionalSwapAccountFlow, this.$eventFlow, this.$marketSessionFlow, this.$positionsFlow, new AnonymousClass1(null));
                    Flow flowTake = FlowKt.take(new Flow<Boolean>() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = flowCombine.collect(new C160522(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C160522<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$invokeSuspend$$inlined$filter$1$2", m3645f = "EventDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    return C160522.this.emit(null, this);
                                }
                            }

                            public C160522(FlowCollector flowCollector) {
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
                                    if (((Boolean) obj).booleanValue()) {
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
                    }, 1);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\bH\n"}, m3636d2 = {"<anonymous>", "", "isInExperiment", "<unused var>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function6<Boolean, Optional<? extends FuturesAccount>, UiEcEvent, MarketSessionChangeDataState, List<? extends UiEventContractPosition>, Continuation<? super Boolean>, Object> {
                /* synthetic */ boolean Z$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(6, continuation);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Optional<? extends FuturesAccount> optional, UiEcEvent uiEcEvent, MarketSessionChangeDataState marketSessionChangeDataState, List<? extends UiEventContractPosition> list, Continuation<? super Boolean> continuation) {
                    return invoke(bool.booleanValue(), (Optional<FuturesAccount>) optional, uiEcEvent, marketSessionChangeDataState, (List<UiEventContractPosition>) list, continuation);
                }

                public final Object invoke(boolean z, Optional<FuturesAccount> optional, UiEcEvent uiEcEvent, MarketSessionChangeDataState marketSessionChangeDataState, List<UiEventContractPosition> list, Continuation<? super Boolean> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.Z$0 = z;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
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

            /* compiled from: EventDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$3", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ EventDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventDetailDuxo eventDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(this.this$0.getSavedStateHandle().get(EventDetailDuxo.ARGS_START_ONBOARDING_TRADE_FROM_PILL), boxing.boxBoolean(true))) {
                        return Unit.INSTANCE;
                    }
                    final EventDetailDuxo eventDetailDuxo = this.this$0;
                    eventDetailDuxo.withDataState(new Function1() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$onCreate$1$20$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return EventDetailDuxo.C160681.AnonymousClass20.AnonymousClass3.invokeSuspend$lambda$1(eventDetailDuxo, (EventDetailDuelDataState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$1(EventDetailDuxo eventDetailDuxo, EventDetailDuelDataState eventDetailDuelDataState) {
                    Map<UUID, UiEventContractPosition> contractIdToPositions = eventDetailDuelDataState.getContractIdToPositions();
                    if (contractIdToPositions != null && !contractIdToPositions.isEmpty()) {
                        Iterator<Map.Entry<UUID, UiEventContractPosition>> it = contractIdToPositions.entrySet().iterator();
                        while (it.hasNext()) {
                            if (!BigDecimals7.isZero(it.next().getValue().getQuantity())) {
                                break;
                            }
                        }
                        eventDetailDuxo.onTrade(((EventDetailFragmentKeyInternalOnly) EventDetailDuxo.INSTANCE.getArgs((HasSavedState) eventDetailDuxo)).getId(), SideDto.BUY, PositionEffectDto.OPEN, true);
                        eventDetailDuxo.getSavedStateHandle().set(EventDetailDuxo.ARGS_START_ONBOARDING_TRADE_FROM_PILL, Boolean.TRUE);
                    } else {
                        eventDetailDuxo.onTrade(((EventDetailFragmentKeyInternalOnly) EventDetailDuxo.INSTANCE.getArgs((HasSavedState) eventDetailDuxo)).getId(), SideDto.BUY, PositionEffectDto.OPEN, true);
                        eventDetailDuxo.getSavedStateHandle().set(EventDetailDuxo.ARGS_START_ONBOARDING_TRADE_FROM_PILL, Boolean.TRUE);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onSpanSelected$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onSpanSelected$1 */
    static final class C160711 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
        final /* synthetic */ DisplaySpan $span;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C160711(DisplaySpan displaySpan, Continuation<? super C160711> continuation) {
            super(2, continuation);
            this.$span = displaySpan;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160711 c160711 = new C160711(this.$span, continuation);
            c160711.L$0 = obj;
            return c160711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
            return ((C160711) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, this.$span, null, false, false, null, null, null, false, null, null, false, 4192255, null);
        }
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onSpanSelected(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        applyMutation(new C160711(span, null));
    }

    public static /* synthetic */ void onTrade$default(EventDetailDuxo eventDetailDuxo, UUID uuid, SideDto sideDto, PositionEffectDto positionEffectDto, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        eventDetailDuxo.onTrade(uuid, sideDto, positionEffectDto, z);
    }

    public final void onTrade(final UUID contractId, final SideDto side, final PositionEffectDto positionEffect, final boolean isFromHubPill) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        withDataState(new Function1() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventDetailDuxo.onTrade$lambda$3(this.f$0, contractId, side, positionEffect, isFromHubPill, (EventDetailDuelDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$3(final EventDetailDuxo eventDetailDuxo, final UUID uuid, final SideDto sideDto, final PositionEffectDto positionEffectDto, final boolean z, final EventDetailDuelDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Optional<FuturesAccount> swapAccount = ds.getSwapAccount();
        if (swapAccount == null) {
            return Unit.INSTANCE;
        }
        eventDetailDuxo.checkTradabilityUseCase.invoke(uuid, sideDto, positionEffectDto, ds.getUiEvent(), swapAccount, ds.getMarketOpen(), new Function1() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventDetailDuxo.onTrade$lambda$3$lambda$0(z, ds, eventDetailDuxo, (EventTradeOrderContext) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventDetailDuxo.onTrade$lambda$3$lambda$1(z, eventDetailDuxo, uuid, sideDto, positionEffectDto, (UUID) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EventDetailDuxo.onTrade$lambda$3$lambda$2(this.f$0, (String) obj, (EventTradeOrderContext) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$3$lambda$0(boolean z, EventDetailDuelDataState eventDetailDuelDataState, EventDetailDuxo eventDetailDuxo, EventTradeOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        if (!z || eventDetailDuelDataState.getMarketOpen()) {
            eventDetailDuxo.submit(new EventDetailScreenEvent.StartTrade(orderContext));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$3$lambda$1(boolean z, EventDetailDuxo eventDetailDuxo, UUID uuid, SideDto sideDto, PositionEffectDto positionEffectDto, UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (z) {
            eventDetailDuxo.submit(new EventDetailScreenEvent.StartOnboarding(eventId, new EventTradeOrderContext(uuid, sideDto, positionEffectDto)));
        } else {
            eventDetailDuxo.submit(new EventDetailScreenEvent.StartOnboarding(eventId, null, 2, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$3$lambda$2(EventDetailDuxo eventDetailDuxo, String attestationType, EventTradeOrderContext eventTradeOrderContext) {
        Intrinsics.checkNotNullParameter(attestationType, "attestationType");
        eventDetailDuxo.submit(new EventDetailScreenEvent.ShowAttestation(attestationType, eventTradeOrderContext));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onDisplayModeChange(EventDetailDisplayDataBottomSheet displayMode) {
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        getSavedStateHandle().set(ARGS_SELECTED_DISPLAY_MODE, displayMode);
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onScrub$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onScrub$1 */
    static final class C160701 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
        final /* synthetic */ Point $point;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C160701(Point point, Continuation<? super C160701> continuation) {
            super(2, continuation);
            this.$point = point;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160701 c160701 = new C160701(this.$point, continuation);
            c160701.L$0 = obj;
            return c160701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
            return ((C160701) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, this.$point, false, false, null, null, null, false, null, null, false, 4190207, null);
        }
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onScrub(Point point) {
        applyMutation(new C160701(point, null));
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onHeaderVisibilityChange$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onHeaderVisibilityChange$1 */
    static final class C160691 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
        final /* synthetic */ boolean $visible;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C160691(boolean z, Continuation<? super C160691> continuation) {
            super(2, continuation);
            this.$visible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160691 c160691 = new C160691(this.$visible, continuation);
            c160691.L$0 = obj;
            return c160691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
            return ((C160691) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$visible, false, null, null, null, false, null, null, false, 4186111, null);
        }
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onHeaderVisibilityChange(boolean visible) {
        applyMutation(new C160691(visible, null));
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onTradeButtonClicked(final ContractSelectorButtonViewState buttonState, final int anchorYPx) {
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        final ContractSelectorButtonViewState.PositionState positionState = buttonState.getPositionState();
        if (positionState instanceof ContractSelectorButtonViewState.PositionState.WithPosition) {
            withDataState(new Function1() { // from class: com.robinhood.android.event.detail.EventDetailDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EventDetailDuxo.onTradeButtonClicked$lambda$4(this.f$0, buttonState, anchorYPx, positionState, (EventDetailDuelDataState) obj);
                }
            });
        } else {
            if (!(positionState instanceof ContractSelectorButtonViewState.PositionState.WithoutPosition)) {
                throw new NoWhenBranchMatchedException();
            }
            ContractSelectorButtonViewState.Metadata metadata = ((ContractSelectorButtonViewState.PositionState.WithoutPosition) positionState).getMetadata();
            if (metadata != null) {
                onTrade$default(this, metadata.getContractId(), metadata.getOrderSide(), metadata.getPositionEffect(), false, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTradeButtonClicked$lambda$4(EventDetailDuxo eventDetailDuxo, ContractSelectorButtonViewState contractSelectorButtonViewState, int i, ContractSelectorButtonViewState.PositionState positionState, EventDetailDuelDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        eventDetailDuxo.applyMutation(new EventDetailDuxo6(ds, contractSelectorButtonViewState, i, positionState, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onTradeOverlayDialogDismiss$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onTradeOverlayDialogDismiss$1 */
    static final class C160721 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C160721(Continuation<? super C160721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160721 c160721 = new C160721(continuation);
            c160721.L$0 = obj;
            return c160721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
            return ((C160721) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventDetailDuelDataState.copy$default((EventDetailDuelDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, 3145727, null);
        }
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onTradeOverlayDialogDismiss() {
        applyMutation(new C160721(null));
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onEventFaqClick() {
        submit(EventDetailScreenEvent.ShowEventFaq.INSTANCE);
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onViewAllClick(UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        submit(new EventDetailScreenEvent.ShowViewAll(eventId));
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/EventDetailDuelDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.EventDetailDuxo$onContractSelected$1", m3645f = "EventDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.EventDetailDuxo$onContractSelected$1 */
    static final class C160671 extends ContinuationImpl7 implements Function2<EventDetailDuelDataState, Continuation<? super EventDetailDuelDataState>, Object> {
        final /* synthetic */ UUID $contractId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EventDetailDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C160671(UUID uuid, EventDetailDuxo eventDetailDuxo, Continuation<? super C160671> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
            this.this$0 = eventDetailDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C160671 c160671 = new C160671(this.$contractId, this.this$0, continuation);
            c160671.L$0 = obj;
            return c160671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventDetailDuelDataState eventDetailDuelDataState, Continuation<? super EventDetailDuelDataState> continuation) {
            return ((C160671) create(eventDetailDuelDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EventDetailDuxo2 selected;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventDetailDuelDataState eventDetailDuelDataState = (EventDetailDuelDataState) this.L$0;
            if (Intrinsics.areEqual(eventDetailDuelDataState.getSelectedContractId(), this.$contractId)) {
                selected = EventDetailDuxo2.Unselected.INSTANCE;
            } else {
                selected = new EventDetailDuxo2.Selected(this.$contractId);
            }
            this.this$0.getSavedStateHandle().set(EventDetailDuxo.ARGS_CONTRACT_SELECTION, selected);
            return EventDetailDuelDataState.copy$default(eventDetailDuelDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, selected, null, false, null, null, false, 4128767, null);
        }
    }

    @Override // com.robinhood.android.event.detail.EventDetailContentCallbacks
    public void onContractSelected(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        applyMutation(new C160671(contractId, this, null));
    }

    /* compiled from: EventDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/detail/EventDetailDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/EventDetailFragmentKeyInternalOnly;", "<init>", "()V", "ARGS_SELECTED_DISPLAY_MODE", "", "ARGS_CONTRACT_SELECTION", "ARGS_START_ONBOARDING_TRADE_FROM_PILL", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventDetailDuxo, EventDetailFragmentKeyInternalOnly> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventDetailFragmentKeyInternalOnly getArgs(SavedStateHandle savedStateHandle) {
            return (EventDetailFragmentKeyInternalOnly) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventDetailFragmentKeyInternalOnly getArgs(EventDetailDuxo eventDetailDuxo) {
            return (EventDetailFragmentKeyInternalOnly) DuxoCompanion.DefaultImpls.getArgs(this, eventDetailDuxo);
        }
    }
}
