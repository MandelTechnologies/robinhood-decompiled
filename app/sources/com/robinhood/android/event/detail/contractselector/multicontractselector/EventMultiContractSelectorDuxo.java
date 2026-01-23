package com.robinhood.android.event.detail.contractselector.multicontractselector;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.detail.EventDetailDuxo7;
import com.robinhood.android.event.detail.builders.ContractListData;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorEvent;
import com.robinhood.android.event.detail.duel.StreamContractListUseCase;
import com.robinhood.android.event.detail.p129ui.bottomsheets.EventDetailDisplayDataBottomSheet;
import com.robinhood.android.eventcontracts.contracts.EventContractSelectorFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.sharedeventui.animation.BuildOpenInterestAggregatedDeltaMapping;
import com.robinhood.android.eventcontracts.sharedeventui.trade.CheckTradabilityUseCase;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.lib.futures.trade.StreamEventMarketSessionChangeStateUseCase;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventViewMode;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.utils.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventMultiContractSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001*BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J \u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001cH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorViewState;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorFullScreenCallbacks;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "contractListUseCase", "Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;", "checkTradabilityUseCase", "Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "streamEventMarketSessionChangeState", "Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/android/event/detail/duel/StreamContractListUseCase;Lcom/robinhood/android/eventcontracts/sharedeventui/trade/CheckTradabilityUseCase;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/lib/futures/trade/StreamEventMarketSessionChangeStateUseCase;Lcom/robinhood/store/event/EventMarketdataStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onTradeClicked", "buttonState", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "anchorYPx", "", "onTrade", "contractId", "Ljava/util/UUID;", "side", "Lrosetta/mainst/SideDto;", "positionEffect", "Lrosetta/mainst/PositionEffectDto;", "onTradeOverlayDialogDismiss", "Companion", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventMultiContractSelectorDuxo extends BaseDuxo3<EventContractSelectorDataState, EventContractSelectorViewState, EventMultiContractSelectorEvent> implements HasSavedState, EventMultiContractSelectorFullScreenContent {
    private final CheckTradabilityUseCase checkTradabilityUseCase;
    private final StreamContractListUseCase contractListUseCase;
    private final EventMarketdataStore eventMarketdataStore;
    private final EventStore eventStore;
    private final FuturesAccountStore futuresAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventMultiContractSelectorDuxo(EventStore eventStore, StreamContractListUseCase contractListUseCase, CheckTradabilityUseCase checkTradabilityUseCase, FuturesAccountStore futuresAccountStore, StreamEventMarketSessionChangeStateUseCase streamEventMarketSessionChangeState, EventMarketdataStore eventMarketdataStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new EventContractSelectorDataState(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), EventMultiContractSelectorStates2.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(contractListUseCase, "contractListUseCase");
        Intrinsics.checkNotNullParameter(checkTradabilityUseCase, "checkTradabilityUseCase");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(streamEventMarketSessionChangeState, "streamEventMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventStore = eventStore;
        this.contractListUseCase = contractListUseCase;
        this.checkTradabilityUseCase = checkTradabilityUseCase;
        this.futuresAccountStore = futuresAccountStore;
        this.streamEventMarketSessionChangeState = streamEventMarketSessionChangeState;
        this.eventMarketdataStore = eventMarketdataStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C161561(null));
    }

    /* compiled from: EventMultiContractSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1 */
    static final class C161561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C161561(Continuation<? super C161561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C161561 c161561 = EventMultiContractSelectorDuxo.this.new C161561(continuation);
            c161561.L$0 = obj;
            return c161561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C161561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                EventStore eventStore = EventMultiContractSelectorDuxo.this.eventStore;
                Companion companion = EventMultiContractSelectorDuxo.INSTANCE;
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(eventStore.streamEvent(((EventContractSelectorFragmentKey) companion.getArgs((HasSavedState) EventMultiContractSelectorDuxo.this)).getEventId()), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, EventMultiContractSelectorDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, EventMultiContractSelectorDuxo.this, null), 3, null);
                final StateFlow<EventContractSelectorViewState> stateFlow = EventMultiContractSelectorDuxo.this.getStateFlow();
                final Flow flowShare = EventDetailDuxo7.share(FlowKt.onStart(EventMultiContractSelectorDuxo.this.contractListUseCase.invoke(((EventContractSelectorFragmentKey) companion.getArgs((HasSavedState) EventMultiContractSelectorDuxo.this)).getEventId(), EventViewMode.MULTI, FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            ArrayList arrayList;
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
                                ImmutableList<ContractSelectorRowTreatmentViewState> contractList = ((EventContractSelectorViewState) obj).getContractList();
                                if (contractList != null) {
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractList, 10));
                                    Iterator<ContractSelectorRowTreatmentViewState> it = contractList.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(it.next().getContractId());
                                    }
                                } else {
                                    arrayList = null;
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
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), FlowKt.flowOf(EventDetailDisplayDataBottomSheet.LAST_YES_PRICE), null), new EventMultiContractSelectorDuxo2(EventMultiContractSelectorDuxo.this, null)), coroutineScope);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(flowShare, EventMultiContractSelectorDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(EventDetailDuxo7.share(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                        Object objCollect = flowShare.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                            Collection collectionEmptyList;
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
                                List list = (List) obj;
                                if (list != null) {
                                    List list2 = list;
                                    collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        collectionEmptyList.add(((ContractListData) it.next()).getContract().getContractId());
                                    }
                                } else {
                                    collectionEmptyList = CollectionsKt.emptyList();
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(collectionEmptyList, anonymousClass1) == coroutine_suspended) {
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
                }), coroutineScope), EventMultiContractSelectorDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(EventMultiContractSelectorDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: EventMultiContractSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiEcEvent> $eventFlow;
            int label;
            final /* synthetic */ EventMultiContractSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiEcEvent> sharedFlow, EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$eventFlow = sharedFlow;
                this.this$0 = eventMultiContractSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$eventFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EventMultiContractSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/models/event/ui/UiEcEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$1$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500141 extends ContinuationImpl7 implements Function2<UiEcEvent, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventMultiContractSelectorDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500141(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super C500141> continuation) {
                    super(2, continuation);
                    this.this$0 = eventMultiContractSelectorDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500141 c500141 = new C500141(this.this$0, continuation);
                    c500141.L$0 = obj;
                    return c500141;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiEcEvent uiEcEvent, Continuation<? super Unit> continuation) {
                    return ((C500141) create(uiEcEvent, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventMultiContractSelectorDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$1$1$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500151 extends ContinuationImpl7 implements Function2<EventContractSelectorDataState, Continuation<? super EventContractSelectorDataState>, Object> {
                    final /* synthetic */ UiEcEvent $event;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500151(UiEcEvent uiEcEvent, Continuation<? super C500151> continuation) {
                        super(2, continuation);
                        this.$event = uiEcEvent;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500151 c500151 = new C500151(this.$event, continuation);
                        c500151.L$0 = obj;
                        return c500151;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventContractSelectorDataState eventContractSelectorDataState, Continuation<? super EventContractSelectorDataState> continuation) {
                        return ((C500151) create(eventContractSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventContractSelectorDataState.copy$default((EventContractSelectorDataState) this.L$0, this.$event, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500151((UiEcEvent) this.L$0, null));
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
                    SharedFlow<UiEcEvent> sharedFlow = this.$eventFlow;
                    C500141 c500141 = new C500141(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c500141, this) == coroutine_suspended) {
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

        /* compiled from: EventMultiContractSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiEcEvent> $eventFlow;
            int label;
            final /* synthetic */ EventMultiContractSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UiEcEvent> sharedFlow, EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$eventFlow = sharedFlow;
                this.this$0 = eventMultiContractSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$eventFlow, this.this$0, continuation);
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
                    final SharedFlow<UiEcEvent> sharedFlow = this.$eventFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<ExchangeSource>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ExchangeSource> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C16150x59e8155c(null, this.this$0));
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

            /* compiled from: EventMultiContractSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketState", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$3", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<MarketSessionChangeDataState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventMultiContractSelectorDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventMultiContractSelectorDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(marketSessionChangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventMultiContractSelectorDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$3$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventContractSelectorDataState, Continuation<? super EventContractSelectorDataState>, Object> {
                    final /* synthetic */ MarketSessionChangeDataState $marketState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(MarketSessionChangeDataState marketSessionChangeDataState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$marketState = marketSessionChangeDataState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$marketState, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventContractSelectorDataState eventContractSelectorDataState, Continuation<? super EventContractSelectorDataState> continuation) {
                        return ((AnonymousClass1) create(eventContractSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventContractSelectorDataState.copy$default((EventContractSelectorDataState) this.L$0, null, null, null, this.$marketState.isOpen(), null, null, null, 119, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((MarketSessionChangeDataState) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventMultiContractSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$3", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<List<ContractListData>> $contractListDataFlow;
            int label;
            final /* synthetic */ EventMultiContractSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Flow<? extends List<ContractListData>> flow, EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$contractListDataFlow = flow;
                this.this$0 = eventMultiContractSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$contractListDataFlow, this.this$0, continuation);
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
                    Flow<List<ContractListData>> flow = this.$contractListDataFlow;
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

            /* compiled from: EventMultiContractSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contractListData", "", "Lcom/robinhood/android/event/detail/builders/ContractListData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$3$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends ContractListData>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventMultiContractSelectorDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventMultiContractSelectorDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends ContractListData> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<ContractListData>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<ContractListData> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventMultiContractSelectorDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$3$1$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500161 extends ContinuationImpl7 implements Function2<EventContractSelectorDataState, Continuation<? super EventContractSelectorDataState>, Object> {
                    final /* synthetic */ List<ContractListData> $contractListData;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500161(List<ContractListData> list, Continuation<? super C500161> continuation) {
                        super(2, continuation);
                        this.$contractListData = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500161 c500161 = new C500161(this.$contractListData, continuation);
                        c500161.L$0 = obj;
                        return c500161;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventContractSelectorDataState eventContractSelectorDataState, Continuation<? super EventContractSelectorDataState> continuation) {
                        return ((C500161) create(eventContractSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        LinkedHashMap linkedHashMap;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventContractSelectorDataState eventContractSelectorDataState = (EventContractSelectorDataState) this.L$0;
                        List<ContractListData> list = this.$contractListData;
                        if (list != null) {
                            List<ContractListData> list2 = list;
                            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                            for (Object obj2 : list2) {
                                linkedHashMap.put(((ContractListData) obj2).getContract().getContractId(), obj2);
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        return EventContractSelectorDataState.copy$default(eventContractSelectorDataState, null, linkedHashMap, null, null, null, null, null, 125, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500161((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventMultiContractSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$4", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {123}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<List<UUID>> $contractIdsFlow;
            int label;
            final /* synthetic */ EventMultiContractSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(Flow<? extends List<UUID>> flow, EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$contractIdsFlow = flow;
                this.this$0 = eventMultiContractSelectorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$contractIdsFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$contractIdsFlow, new C16152x823f71a(null, this.this$0));
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

            /* compiled from: EventMultiContractSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "newFundamentals", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$4$2", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventFundamental>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventMultiContractSelectorDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventMultiContractSelectorDuxo;
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

                /* compiled from: EventMultiContractSelectorDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$4$2$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventContractSelectorDataState, Continuation<? super EventContractSelectorDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventFundamental> $newFundamentals;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<UUID, EventFundamental> map, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$newFundamentals = map;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$newFundamentals, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventContractSelectorDataState eventContractSelectorDataState, Continuation<? super EventContractSelectorDataState> continuation) {
                        return ((AnonymousClass1) create(eventContractSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        EventContractSelectorDataState eventContractSelectorDataState = (EventContractSelectorDataState) this.L$0;
                        return EventContractSelectorDataState.copy$default(eventContractSelectorDataState, null, null, null, null, null, this.$newFundamentals, BuildOpenInterestAggregatedDeltaMapping.buildOpenInterestDeltaMappingWithoutTime(this.$newFundamentals, eventContractSelectorDataState.getContractIdToFundamentals()), 31, null);
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

        /* compiled from: EventMultiContractSelectorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$5", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventMultiContractSelectorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = eventMultiContractSelectorDuxo;
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.futuresAccountStore.streamRhsAccountNumberWithFuturesAccountAllowed(), new C16153x5f41e7f9(null, this.this$0));
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

            /* compiled from: EventMultiContractSelectorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "swapsAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/futures/db/FuturesAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$5$2", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends FuturesAccount>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventMultiContractSelectorDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventMultiContractSelectorDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<FuturesAccount> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends FuturesAccount> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<FuturesAccount>) optional, continuation);
                }

                /* compiled from: EventMultiContractSelectorDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$5$2$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onCreate$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventContractSelectorDataState, Continuation<? super EventContractSelectorDataState>, Object> {
                    final /* synthetic */ Optional<FuturesAccount> $swapsAccount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Optional<FuturesAccount> optional, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$swapsAccount = optional;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$swapsAccount, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventContractSelectorDataState eventContractSelectorDataState, Continuation<? super EventContractSelectorDataState> continuation) {
                        return ((AnonymousClass1) create(eventContractSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventContractSelectorDataState.copy$default((EventContractSelectorDataState) this.L$0, null, null, this.$swapsAccount, null, null, null, null, 123, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Optional) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onTradeClicked(final ContractSelectorButtonViewState buttonState, final int anchorYPx) {
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        final ContractSelectorButtonViewState.PositionState positionState = buttonState.getPositionState();
        if (positionState instanceof ContractSelectorButtonViewState.PositionState.WithPosition) {
            withDataState(new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EventMultiContractSelectorDuxo.onTradeClicked$lambda$0(this.f$0, positionState, buttonState, anchorYPx, (EventContractSelectorDataState) obj);
                }
            });
        } else {
            if (!(positionState instanceof ContractSelectorButtonViewState.PositionState.WithoutPosition)) {
                throw new NoWhenBranchMatchedException();
            }
            ContractSelectorButtonViewState.Metadata metadata = ((ContractSelectorButtonViewState.PositionState.WithoutPosition) positionState).getMetadata();
            if (metadata != null) {
                onTrade(metadata.getContractId(), metadata.getOrderSide(), metadata.getPositionEffect());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTradeClicked$lambda$0(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, ContractSelectorButtonViewState.PositionState positionState, ContractSelectorButtonViewState contractSelectorButtonViewState, int i, EventContractSelectorDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        eventMultiContractSelectorDuxo.applyMutation(new EventMultiContractSelectorDuxo3(ds, positionState, contractSelectorButtonViewState, i, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContent
    public void onTrade(final UUID contractId, final SideDto side, final PositionEffectDto positionEffect) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        withDataState(new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMultiContractSelectorDuxo.onTrade$lambda$5(this.f$0, contractId, side, positionEffect, (EventContractSelectorDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$5(final EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, UUID uuid, SideDto sideDto, PositionEffectDto positionEffectDto, EventContractSelectorDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getSwapsAccount() == null) {
            return Unit.INSTANCE;
        }
        eventMultiContractSelectorDuxo.checkTradabilityUseCase.invoke(uuid, sideDto, positionEffectDto, ds.getUiEvent(), ds.getSwapsAccount(), Intrinsics.areEqual(ds.isMarketOpen(), Boolean.TRUE), new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMultiContractSelectorDuxo.onTrade$lambda$5$lambda$2(this.f$0, (EventTradeOrderContext) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMultiContractSelectorDuxo.onTrade$lambda$5$lambda$3(this.f$0, (UUID) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EventMultiContractSelectorDuxo.onTrade$lambda$5$lambda$4(this.f$0, (String) obj, (EventTradeOrderContext) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$5$lambda$2(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, EventTradeOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        eventMultiContractSelectorDuxo.submit(new EventMultiContractSelectorEvent.StartTrade(orderContext));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$5$lambda$3(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        eventMultiContractSelectorDuxo.submit(new EventMultiContractSelectorEvent.StartOnboarding(eventId));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrade$lambda$5$lambda$4(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, String attestationType, EventTradeOrderContext eventTradeOrderContext) {
        Intrinsics.checkNotNullParameter(attestationType, "attestationType");
        eventMultiContractSelectorDuxo.submit(new EventMultiContractSelectorEvent.ShowAttestation(attestationType, eventTradeOrderContext));
        return Unit.INSTANCE;
    }

    /* compiled from: EventMultiContractSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onTradeOverlayDialogDismiss$1", m3645f = "EventMultiContractSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorDuxo$onTradeOverlayDialogDismiss$1 */
    static final class C161581 extends ContinuationImpl7 implements Function2<EventContractSelectorDataState, Continuation<? super EventContractSelectorDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C161581(Continuation<? super C161581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C161581 c161581 = new C161581(continuation);
            c161581.L$0 = obj;
            return c161581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventContractSelectorDataState eventContractSelectorDataState, Continuation<? super EventContractSelectorDataState> continuation) {
            return ((C161581) create(eventContractSelectorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventContractSelectorDataState.copy$default((EventContractSelectorDataState) this.L$0, null, null, null, null, null, null, null, 111, null);
        }
    }

    @Override // com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContent
    public void onTradeOverlayDialogDismiss() {
        applyMutation(new C161581(null));
    }

    /* compiled from: EventMultiContractSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/EventContractSelectorFragmentKey;", "<init>", "()V", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventMultiContractSelectorDuxo, EventContractSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventContractSelectorFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EventContractSelectorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventContractSelectorFragmentKey getArgs(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo) {
            return (EventContractSelectorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, eventMultiContractSelectorDuxo);
        }
    }
}
