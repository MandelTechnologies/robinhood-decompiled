package com.robinhood.android.futures.eventbrackets.screen.tournament;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.contracts.EventsBracketFragmentKey;
import com.robinhood.android.futures.eventbrackets.p141ui.BracketNavigationInfo;
import com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketEvent;
import com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildBracketNavigationInfo;
import com.robinhood.android.futures.eventbrackets.screen.tournament.builders.BuildEventGameDataContext;
import com.robinhood.android.models.event.p186db.arsenal.EventId;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.UiEventBracket;
import com.robinhood.android.models.event.p186db.ceres.EventContractRealizedPnlByContract;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventGameData;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.regiongate.experiment.EventContractsExperiments;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventContractsPnlStore;
import com.robinhood.store.event.EventGameDataContext;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.event.EventTopicsStore;
import com.robinhood.store.experiments.EventBracketExperiment;
import com.robinhood.store.futures.FuturesAccountStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
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
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Clock;

/* compiled from: EventsTournamentBracketDuxo.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001:BY\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020!¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00106R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketViewState;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "Lcom/robinhood/store/event/EventTopicsStore;", "eventTopicsStore", "Lcom/robinhood/store/event/EventStore;", "eventStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketDataStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractsPnlStore;", "eventContractsPnlStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/store/event/EventTopicsStore;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/store/event/EventContractsPnlStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "Lkotlinx/coroutines/CoroutineScope;", "", "runExperimentCheck", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/UUID;", "bracketIdFlow", "getTopicIdFlow", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "onCreate", "()V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "onTabSelected", "(I)V", "topicId", "bracketId", "onTopicSelected", "(Ljava/util/UUID;Ljava/util/UUID;)V", "Lcom/robinhood/experiments/ExperimentsProvider;", "Lcom/robinhood/store/event/EventTopicsStore;", "Lcom/robinhood/store/event/EventStore;", "Lcom/robinhood/store/event/EventMarketdataStore;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "Lcom/robinhood/store/event/EventContractPositionStore;", "Lcom/robinhood/store/event/EventContractsPnlStore;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventsTournamentBracketDuxo extends BaseDuxo3<EventsTournamentBracketDataState, EventsTournamentBracketViewState, EventsTournamentBracketEvent> implements HasSavedState {
    private static final String ARG_RECENT_BRACKET_ID = "CURRENT_BRACKET_ID";
    private static final String ARG_RECENT_TOPIC_ID = "RECENT_TOPIC_ID";
    private static final String EVENTS_TOURNAMENT_BRACKET_SELECTED_TAB_INDEX_KEY = "EVENTS_TOURNAMENT_BRACKET_SELECTED_TAB_INDEX_KEY";
    private final Clock clock;
    private final EventContractPositionStore eventContractPositionStore;
    private final EventContractsPnlStore eventContractsPnlStore;
    private final EventMarketdataStore eventMarketDataStore;
    private final EventStore eventStore;
    private final EventTopicsStore eventTopicsStore;
    private final ExperimentsProvider experimentsProvider;
    private final FuturesAccountStore futuresAccountStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EventsTournamentBracketDuxo(ExperimentsProvider experimentsProvider, EventTopicsStore eventTopicsStore, EventStore eventStore, EventMarketdataStore eventMarketDataStore, FuturesAccountStore futuresAccountStore, EventContractPositionStore eventContractPositionStore, EventContractsPnlStore eventContractsPnlStore, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(eventTopicsStore, "eventTopicsStore");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketDataStore, "eventMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(eventContractsPnlStore, "eventContractsPnlStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        UUID uuid = (UUID) savedStateHandle.get(ARG_RECENT_TOPIC_ID);
        UUID topicId = uuid == null ? ((EventsBracketFragmentKey) INSTANCE.getArgs(savedStateHandle)).getTopicId() : uuid;
        UUID uuid2 = (UUID) savedStateHandle.get(ARG_RECENT_BRACKET_ID);
        UUID bracketId = uuid2 == null ? ((EventsBracketFragmentKey) INSTANCE.getArgs(savedStateHandle)).getBracketId() : uuid2;
        Integer num = (Integer) savedStateHandle.get(EVENTS_TOURNAMENT_BRACKET_SELECTED_TAB_INDEX_KEY);
        super(new EventsTournamentBracketDataState(topicId, bracketId, num != null ? num.intValue() : 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), EventsTournamentBracketStateProvider.INSTANCE, duxoBundle);
        this.experimentsProvider = experimentsProvider;
        this.eventTopicsStore = eventTopicsStore;
        this.eventStore = eventStore;
        this.eventMarketDataStore = eventMarketDataStore;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.eventContractsPnlStore = eventContractsPnlStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C171521(null));
    }

    /* compiled from: EventsTournamentBracketDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1 */
    static final class C171521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C171521(Continuation<? super C171521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171521 c171521 = EventsTournamentBracketDuxo.this.new C171521(continuation);
            c171521.L$0 = obj;
            return c171521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C171521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                EventsTournamentBracketDuxo.this.runExperimentCheck(coroutineScope);
                StateFlow stateFlow = EventsTournamentBracketDuxo.this.getSavedStateHandle().getStateFlow(EventsTournamentBracketDuxo.ARG_RECENT_BRACKET_ID, ((EventsBracketFragmentKey) EventsTournamentBracketDuxo.INSTANCE.getArgs(EventsTournamentBracketDuxo.this.getSavedStateHandle())).getBracketId());
                SharingStarted.Companion companion = SharingStarted.INSTANCE;
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(stateFlow, coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                SharedFlow sharedFlowShareIn2 = FlowKt.shareIn(EventsTournamentBracketDuxo.this.getTopicIdFlow(sharedFlowShareIn), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                final SharedFlow sharedFlowShareIn3 = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(sharedFlowShareIn, new C17147x9a4b6e60(null, EventsTournamentBracketDuxo.this))), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                final SharedFlow sharedFlowShareIn4 = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.transformLatest(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                List<EventId> eventIdList = ((UiEventBracket) obj).getEventIdList();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eventIdList, 10));
                                Iterator<T> it = eventIdList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((EventId) it.next()).getBracketEventId());
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
                    public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                        Object objCollect = sharedFlowShareIn3.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C17148x9a4b6e61(null, EventsTournamentBracketDuxo.this))), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                SharedFlow sharedFlowShareIn5 = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.mapLatest(sharedFlowShareIn4, new EventsTournamentBracketDuxo2(null))), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends EventGameDataContext>>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$2

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                List<EventGameDataContext> listBuildEventGameDataContext = BuildEventGameDataContext.buildEventGameDataContext((Map) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(listBuildEventGameDataContext, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super List<? extends EventGameDataContext>> flowCollector, Continuation continuation) {
                        Object objCollect = sharedFlowShareIn4.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn2, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn3, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn4, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn4, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(sharedFlowShareIn5, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(FlowKt.shareIn(EventsTournamentBracketDuxo.this.futuresAccountStore.streamRhsAccountNumberWithFuturesAccountAllowed(), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1), EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(sharedFlowShareIn4, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(sharedFlowShareIn2, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(flowDistinctUntilChanged, EventsTournamentBracketDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(sharedFlowShareIn5, EventsTournamentBracketDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $topicIdFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UUID> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$topicIdFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$topicIdFlow, this.this$0, continuation);
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
                    SharedFlow<UUID> sharedFlow = this.$topicIdFlow;
                    C501091 c501091 = new C501091(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c501091, this) == coroutine_suspended) {
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "topicId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501091 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501091(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super C501091> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501091 c501091 = new C501091(this.this$0, continuation);
                    c501091.L$0 = obj;
                    return c501091;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
                    return ((C501091) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$1$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501101 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ UUID $topicId;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501101(UUID uuid, Continuation<? super C501101> continuation) {
                        super(2, continuation);
                        this.$topicId = uuid;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501101 c501101 = new C501101(this.$topicId, continuation);
                        c501101.L$0 = obj;
                        return c501101;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((C501101) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, this.$topicId, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501101((UUID) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {120}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiEventBracket> $bracketFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UiEventBracket> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$bracketFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$bracketFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UiEventBracket> sharedFlow = this.$bracketFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "bracket", "Lcom/robinhood/android/models/event/db/arsenal/UiEventBracket;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$2$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiEventBracket, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiEventBracket uiEventBracket, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(uiEventBracket, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$2$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501111 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ UiEventBracket $bracket;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501111(UiEventBracket uiEventBracket, Continuation<? super C501111> continuation) {
                        super(2, continuation);
                        this.$bracket = uiEventBracket;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501111 c501111 = new C501111(this.$bracket, continuation);
                        c501111.L$0 = obj;
                        return c501111;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((C501111) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, this.$bracket, null, null, null, null, null, null, null, null, null, 130943, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501111((UiEventBracket) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Map<UUID, UiEcEvent>> $eventsFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(SharedFlow<? extends Map<UUID, UiEcEvent>> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$eventsFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$eventsFlow, this.this$0, continuation);
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
                    final SharedFlow<Map<UUID, UiEcEvent>> sharedFlow = this.$eventsFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<UiEcEvent>() { // from class: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UiEcEvent> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {54}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                T next;
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
                                    Iterator<T> it = ((Map) obj).values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = (T) null;
                                            break;
                                        }
                                        next = it.next();
                                        if (((UiEcEvent) next).isFinalEvent()) {
                                            break;
                                        }
                                    }
                                    if (next != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
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
                    }, new C17144x32953e71(null, this.this$0));
                    C501123 c501123 = new C501123(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c501123, this) == coroutine_suspended) {
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isNowPastAWeekSinceFinal", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$3", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C501123 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501123(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super C501123> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501123 c501123 = new C501123(this.this$0, continuation);
                    c501123.Z$0 = ((Boolean) obj).booleanValue();
                    return c501123;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C501123) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$3$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ boolean $isNowPastAWeekSinceFinal;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$isNowPastAWeekSinceFinal = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isNowPastAWeekSinceFinal, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((AnonymousClass1) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, boxing.boxBoolean(this.$isNowPastAWeekSinceFinal), Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        boolean z = this.Z$0;
                        this.this$0.applyMutation(new AnonymousClass1(z, null));
                        if (z) {
                            this.this$0.submit(EventsTournamentBracketEvent.NavigateToInvestingTab.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$4", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Map<UUID, UiEcEvent>> $eventsFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(SharedFlow<? extends Map<UUID, UiEcEvent>> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$eventsFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$eventsFlow, this.this$0, continuation);
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
                    SharedFlow<Map<UUID, UiEcEvent>> sharedFlow = this.$eventsFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eventsMap", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$4$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends UiEcEvent>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiEcEvent> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, UiEcEvent>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, UiEcEvent> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$4$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501131 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ Map<UUID, UiEcEvent> $eventsMap;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501131(Map<UUID, UiEcEvent> map, Continuation<? super C501131> continuation) {
                        super(2, continuation);
                        this.$eventsMap = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501131 c501131 = new C501131(this.$eventsMap, continuation);
                        c501131.L$0 = obj;
                        return c501131;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((C501131) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, this.$eventsMap, null, null, null, null, null, null, null, null, 130815, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501131((Map) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$5", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<List<UUID>> $eventContractIdsFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(SharedFlow<? extends List<UUID>> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$eventContractIdsFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$eventContractIdsFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventContractIdsFlow, new C17146xe0d1202f(null, this.this$0));
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contractIdToQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$5$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventQuote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventQuote> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventQuote>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventQuote> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$5$2$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventQuote> $contractIdToQuotes;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<UUID, EventQuote> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$contractIdToQuotes = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contractIdToQuotes, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((AnonymousClass1) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, null, this.$contractIdToQuotes, null, null, null, null, null, null, null, 130559, null);
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

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$6", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<String> $rhsAccountNumberFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(SharedFlow<String> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$rhsAccountNumberFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$rhsAccountNumberFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$6$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
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

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$6$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501141 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ String $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501141(String str, Continuation<? super C501141> continuation) {
                        super(2, continuation);
                        this.$it = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501141 c501141 = new C501141(this.$it, continuation);
                        c501141.L$0 = obj;
                        return c501141;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((C501141) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, this.$it, null, null, 114687, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501141((String) this.L$0, null));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<String> sharedFlow = this.$rhsAccountNumberFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$7", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
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
                    Flow<List<UiEventContractPosition>> flowStreamAllPositions = this.this$0.eventContractPositionStore.streamAllPositions();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamAllPositions, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "positions", "", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$7$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiEventContractPosition>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
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

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$7$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501151 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ List<UiEventContractPosition> $positions;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501151(List<UiEventContractPosition> list, Continuation<? super C501151> continuation) {
                        super(2, continuation);
                        this.$positions = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501151 c501151 = new C501151(this.$positions, continuation);
                        c501151.L$0 = obj;
                        return c501151;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((C501151) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventsTournamentBracketDataState eventsTournamentBracketDataState = (EventsTournamentBracketDataState) this.L$0;
                        List<UiEventContractPosition> list = this.$positions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (Object obj2 : list) {
                            linkedHashMap.put(((UiEventContractPosition) obj2).getContractId(), obj2);
                        }
                        return EventsTournamentBracketDataState.copy$default(eventsTournamentBracketDataState, null, null, 0, false, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, 130047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501151((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {200}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<Map<UUID, UiEcEvent>> $eventsFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass8(SharedFlow<? extends Map<UUID, UiEcEvent>> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$eventsFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$eventsFlow, this.this$0, continuation);
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.mapLatest(this.$eventsFlow, new AnonymousClass1(null)));
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "eventsMap", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends UiEcEvent>, Continuation<? super BracketNavigationInfo>, Object> {
                /* synthetic */ Object L$0;
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
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends UiEcEvent> map, Continuation<? super BracketNavigationInfo> continuation) {
                    return invoke2((Map<UUID, UiEcEvent>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, UiEcEvent> map, Continuation<? super BracketNavigationInfo> continuation) {
                    return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = CollectionsKt.toList(((Map) this.L$0).values());
                    return new BracketNavigationInfo(BuildBracketNavigationInfo.buildNavigationRounds(list), BuildBracketNavigationInfo.buildNavigationRegions(list));
                }
            }

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BracketNavigationInfo, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BracketNavigationInfo bracketNavigationInfo, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(bracketNavigationInfo, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8$2$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$8$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ BracketNavigationInfo $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BracketNavigationInfo bracketNavigationInfo, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = bracketNavigationInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((AnonymousClass1) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, null, null, null, this.$it, null, null, null, null, null, 129023, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BracketNavigationInfo) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$9", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {211, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UUID> $topicIdFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(SharedFlow<UUID> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$topicIdFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.$topicIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<UUID> sharedFlow = this.$topicIdFlow;
                    this.label = 1;
                    obj = FlowKt.first(sharedFlow, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                Flow<List<EventTopic>> flowStreamEventTopicsListByRelevantTopicId = this.this$0.eventTopicsStore.streamEventTopicsListByRelevantTopicId((UUID) obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 2;
            }

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "relevantEventTopics", "", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$9$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends EventTopic>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends EventTopic> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<EventTopic>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<EventTopic> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$9$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C501161 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ List<EventTopic> $relevantEventTopics;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C501161(List<EventTopic> list, Continuation<? super C501161> continuation) {
                        super(2, continuation);
                        this.$relevantEventTopics = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C501161 c501161 = new C501161(this.$relevantEventTopics, continuation);
                        c501161.L$0 = obj;
                        return c501161;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((C501161) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, null, null, null, null, extensions2.toPersistentList(this.$relevantEventTopics), null, null, null, null, 126975, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C501161((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$10", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<List<EventGameDataContext>> $eventIdToHomeAndAwayIdFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass10(Flow<? extends List<EventGameDataContext>> flow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$eventIdToHomeAndAwayIdFlow = flow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$eventIdToHomeAndAwayIdFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventIdToHomeAndAwayIdFlow, new C17142x834eda79(null, this.this$0));
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eventIdToEventGameDataMap", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventGameData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$10$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$10$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventGameData>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventGameData> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventGameData>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventGameData> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$10$2$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$10$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventGameData> $eventIdToEventGameDataMap;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<UUID, EventGameData> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$eventIdToEventGameDataMap = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eventIdToEventGameDataMap, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((AnonymousClass1) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, null, null, null, null, null, this.$eventIdToEventGameDataMap, null, null, null, 122879, null);
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

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$11", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<List<UUID>> $eventContractIdsFlow;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass11(SharedFlow<? extends List<UUID>> sharedFlow, EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.$eventContractIdsFlow = sharedFlow;
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.$eventContractIdsFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventContractIdsFlow, new C17143xda6ccb58(null, this.this$0));
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contractIdToRealizedPnl", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/ceres/EventContractRealizedPnlByContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$11$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$11$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventContractRealizedPnlByContract>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventsTournamentBracketDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventsTournamentBracketDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventContractRealizedPnlByContract> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventContractRealizedPnlByContract>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventContractRealizedPnlByContract> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventsTournamentBracketDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$11$2$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onCreate$1$11$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventContractRealizedPnlByContract> $contractIdToRealizedPnl;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<UUID, EventContractRealizedPnlByContract> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$contractIdToRealizedPnl = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contractIdToRealizedPnl, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                        return ((AnonymousClass1) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, this.$contractIdToRealizedPnl, null, 98303, null);
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
    }

    /* compiled from: EventsTournamentBracketDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$1 */
    static final class C171551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C171551(Continuation<? super C171551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventsTournamentBracketDuxo.this.new C171551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C171551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(EventsTournamentBracketDuxo.this.experimentsProvider, new Experiment[]{EventContractsExperiments.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EventsTournamentBracketDuxo.this, null);
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

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInEcV3Exp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventsTournamentBracketDuxo;
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

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$1$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501171 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                final /* synthetic */ boolean $isInEcV3Exp;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501171(boolean z, Continuation<? super C501171> continuation) {
                    super(2, continuation);
                    this.$isInEcV3Exp = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501171 c501171 = new C501171(this.$isInEcV3Exp, continuation);
                    c501171.L$0 = obj;
                    return c501171;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                    return ((C501171) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, this.$isInEcV3Exp, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501171(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runExperimentCheck(CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C171551(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C171562(null), 3, null);
    }

    /* compiled from: EventsTournamentBracketDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$2", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$2 */
    static final class C171562 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C171562(Continuation<? super C171562> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventsTournamentBracketDuxo.this.new C171562(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C171562) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(EventsTournamentBracketDuxo.this.experimentsProvider, EventBracketExperiment.INSTANCE, EventBracketExperiment.Variants.CONTROL, false, 4, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EventsTournamentBracketDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCoStreamVariant$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: EventsTournamentBracketDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/store/experiments/EventBracketExperiment$Variants;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$2$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventBracketExperiment.Variants, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EventsTournamentBracketDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventsTournamentBracketDuxo eventsTournamentBracketDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventsTournamentBracketDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EventBracketExperiment.Variants variants, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(variants, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EventsTournamentBracketDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$2$1$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$runExperimentCheck$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501181 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
                final /* synthetic */ EventBracketExperiment.Variants $variant;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501181(EventBracketExperiment.Variants variants, Continuation<? super C501181> continuation) {
                    super(2, continuation);
                    this.$variant = variants;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501181 c501181 = new C501181(this.$variant, continuation);
                    c501181.L$0 = obj;
                    return c501181;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
                    return ((C501181) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, 0, false, this.$variant, null, null, null, null, null, null, null, null, null, null, null, null, 131055, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501181((EventBracketExperiment.Variants) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EventsTournamentBracketDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onTabSelected$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onTabSelected$1 */
    static final class C171531 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C171531(int i, Continuation<? super C171531> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171531 c171531 = new C171531(this.$index, continuation);
            c171531.L$0 = obj;
            return c171531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
            return ((C171531) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, null, null, this.$index, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 131067, null);
        }
    }

    public final void onTabSelected(int index) {
        applyMutation(new C171531(index, null));
        getSavedStateHandle().set(EVENTS_TOURNAMENT_BRACKET_SELECTED_TAB_INDEX_KEY, Integer.valueOf(index));
    }

    /* compiled from: EventsTournamentBracketDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onTopicSelected$1", m3645f = "EventsTournamentBracketDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$onTopicSelected$1 */
    static final class C171541 extends ContinuationImpl7 implements Function2<EventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState>, Object> {
        final /* synthetic */ UUID $bracketId;
        final /* synthetic */ UUID $topicId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C171541(UUID uuid, UUID uuid2, Continuation<? super C171541> continuation) {
            super(2, continuation);
            this.$topicId = uuid;
            this.$bracketId = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C171541 c171541 = new C171541(this.$topicId, this.$bracketId, continuation);
            c171541.L$0 = obj;
            return c171541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventsTournamentBracketDataState eventsTournamentBracketDataState, Continuation<? super EventsTournamentBracketDataState> continuation) {
            return ((C171541) create(eventsTournamentBracketDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventsTournamentBracketDataState.copy$default((EventsTournamentBracketDataState) this.L$0, this.$topicId, this.$bracketId, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 131068, null);
        }
    }

    public final void onTopicSelected(UUID topicId, UUID bracketId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        applyMutation(new C171541(topicId, bracketId, null));
        getSavedStateHandle().set(ARG_RECENT_TOPIC_ID, topicId);
        getSavedStateHandle().set(ARG_RECENT_BRACKET_ID, bracketId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<UUID> getTopicIdFlow(Flow<UUID> bracketIdFlow) {
        return EventsTournamentBracketDuxo3.streamTopicIdByTopicIdOrBracketId(this.eventTopicsStore, FlowKt.combine(getSavedStateHandle().getStateFlow(ARG_RECENT_TOPIC_ID, ((EventsBracketFragmentKey) INSTANCE.getArgs(getSavedStateHandle())).getTopicId()), bracketIdFlow, C171513.INSTANCE));
    }

    /* compiled from: EventsTournamentBracketDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.eventbrackets.screen.tournament.EventsTournamentBracketDuxo$getTopicIdFlow$3 */
    /* synthetic */ class C171513 extends AdaptedFunctionReference implements Function3<UUID, UUID, Continuation<? super Tuples2<? extends UUID, ? extends UUID>>, Object>, ContinuationImpl6 {
        public static final C171513 INSTANCE = new C171513();

        C171513() {
            super(3, Tuples2.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(UUID uuid, UUID uuid2, Continuation<? super Tuples2<? extends UUID, ? extends UUID>> continuation) {
            return invoke2(uuid, uuid2, (Continuation<? super Tuples2<UUID, UUID>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(UUID uuid, UUID uuid2, Continuation<? super Tuples2<UUID, UUID>> continuation) {
            return EventsTournamentBracketDuxo.getTopicIdFlow$lambda$0(uuid, uuid2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getTopicIdFlow$lambda$0(UUID uuid, UUID uuid2, Continuation continuation) {
        return new Tuples2(uuid, uuid2);
    }

    /* compiled from: EventsTournamentBracketDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/EventsTournamentBracketDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/EventsBracketFragmentKey;", "<init>", "()V", EventsTournamentBracketDuxo.EVENTS_TOURNAMENT_BRACKET_SELECTED_TAB_INDEX_KEY, "", "ARG_RECENT_TOPIC_ID", "ARG_RECENT_BRACKET_ID", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventsTournamentBracketDuxo, EventsBracketFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventsBracketFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EventsBracketFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventsBracketFragmentKey getArgs(EventsTournamentBracketDuxo eventsTournamentBracketDuxo) {
            return (EventsBracketFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, eventsTournamentBracketDuxo);
        }
    }
}
