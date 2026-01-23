package com.robinhood.android.event.history.p131ui.order;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.event.history.p131ui.order.EventOrderDetailDuxo;
import com.robinhood.android.event.history.p131ui.order.EventOrderDetailEvent;
import com.robinhood.android.eventcontracts.contracts.EventOrderDetailKey;
import com.robinhood.android.eventcontracts.trade.InstantExt;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.ContractDetailsDisplayStore;
import com.robinhood.store.event.EventOrderStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.datetime.Converters4;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EventOrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailViewState;", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/store/event/EventOrderStore;", "eventOrderStore", "Lcom/robinhood/store/event/EventStore;", "eventStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "contractDetailsDisplayStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/store/event/EventOrderStore;Lcom/robinhood/store/event/EventStore;Lj$/time/Clock;Lcom/robinhood/store/event/ContractDetailsDisplayStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "cancelOrder", "Lcom/robinhood/store/event/EventOrderStore;", "Lcom/robinhood/store/event/EventStore;", "Lj$/time/Clock;", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventOrderDetailDuxo extends BaseDuxo3<EventOrderDetailDataState, EventOrderDetailViewState, EventOrderDetailEvent> implements HasSavedState {
    private final Clock clock;
    private final ContractDetailsDisplayStore contractDetailsDisplayStore;
    private final EventOrderStore eventOrderStore;
    private final EventStore eventStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventOrderDetailDuxo(EventOrderStore eventOrderStore, EventStore eventStore, Clock clock, ContractDetailsDisplayStore contractDetailsDisplayStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new EventOrderDetailDataState(null, null, false, null, null, 31, null), EventOrderDetailStateProvider.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventOrderStore, "eventOrderStore");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventOrderStore = eventOrderStore;
        this.eventStore = eventStore;
        this.clock = clock;
        this.contractDetailsDisplayStore = contractDetailsDisplayStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C164131(null));
    }

    /* compiled from: EventOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1 */
    static final class C164131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164131(Continuation<? super C164131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164131 c164131 = EventOrderDetailDuxo.this.new C164131(continuation);
            c164131.L$0 = obj;
            return c164131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C164131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SharedFlow sharedFlowShareIn = FlowKt.shareIn(EventOrderDetailDuxo.this.eventOrderStore.streamOrder(((EventOrderDetailKey) EventOrderDetailDuxo.INSTANCE.getArgs((HasSavedState) EventOrderDetailDuxo.this)).getOrderId()), EventOrderDetailDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, EventOrderDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, EventOrderDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn, EventOrderDetailDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn, EventOrderDetailDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: EventOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiEventOrder> $orderFlow;
            int label;
            final /* synthetic */ EventOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<UiEventOrder> sharedFlow, EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$orderFlow = sharedFlow;
                this.this$0 = eventOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$orderFlow, this.this$0, continuation);
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
                    SharedFlow<UiEventOrder> sharedFlow = this.$orderFlow;
                    C500471 c500471 = new C500471(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c500471, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", Card.Icon.ORDER, "Lcom/robinhood/android/models/event/db/order/UiEventOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$1$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500471 extends ContinuationImpl7 implements Function2<UiEventOrder, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500471(EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super C500471> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500471 c500471 = new C500471(this.this$0, continuation);
                    c500471.L$0 = obj;
                    return c500471;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiEventOrder uiEventOrder, Continuation<? super Unit> continuation) {
                    return ((C500471) create(uiEventOrder, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$1$1$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500481 extends ContinuationImpl7 implements Function2<EventOrderDetailDataState, Continuation<? super EventOrderDetailDataState>, Object> {
                    final /* synthetic */ UiEventOrder $order;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500481(UiEventOrder uiEventOrder, Continuation<? super C500481> continuation) {
                        super(2, continuation);
                        this.$order = uiEventOrder;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500481 c500481 = new C500481(this.$order, continuation);
                        c500481.L$0 = obj;
                        return c500481;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderDetailDataState eventOrderDetailDataState, Continuation<? super EventOrderDetailDataState> continuation) {
                        return ((C500481) create(eventOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderDetailDataState.copy$default((EventOrderDetailDataState) this.L$0, this.$order, null, false, null, null, 30, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500481((UiEventOrder) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2", m3645f = "EventOrderDetailDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiEventOrder> $orderFlow;
            int label;
            final /* synthetic */ EventOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<UiEventOrder> sharedFlow, EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$orderFlow = sharedFlow;
                this.this$0 = eventOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$orderFlow, this.this$0, continuation);
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
                    final SharedFlow<UiEventOrder> sharedFlow = this.$orderFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C164072<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "EventOrderDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C164072.this.emit(null, this);
                                }
                            }

                            public C164072(FlowCollector flowCollector) {
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
                                    UUID contractId = ((UiEventOrder) obj).getContractId();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(contractId, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new C164072(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C16406x39da64b1(null, this.this$0.eventStore));
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

            /* compiled from: EventOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$3", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<EventContract, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EventContract eventContract, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(eventContract, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$3$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderDetailDataState, Continuation<? super EventOrderDetailDataState>, Object> {
                    final /* synthetic */ EventContract $contract;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(EventContract eventContract, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$contract = eventContract;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contract, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderDetailDataState eventOrderDetailDataState, Continuation<? super EventOrderDetailDataState> continuation) {
                        return ((AnonymousClass1) create(eventOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderDetailDataState.copy$default((EventOrderDetailDataState) this.L$0, null, this.$contract, false, null, null, 29, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((EventContract) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3", m3645f = "EventOrderDetailDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiEventOrder> $orderFlow;
            int label;
            final /* synthetic */ EventOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<UiEventOrder> sharedFlow, EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$orderFlow = sharedFlow;
                this.this$0 = eventOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$orderFlow, this.this$0, continuation);
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
                    final SharedFlow<UiEventOrder> sharedFlow = this.$orderFlow;
                    final Flow<UiEventOrder> flow = new Flow<UiEventOrder>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1$2", m3645f = "EventOrderDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    if (((UiEventOrder) obj).getOrder().getTimeInForce() == FuturesTimeInForce.GTD) {
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
                        public Object collect(FlowCollector<? super UiEventOrder> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Instant>() { // from class: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "EventOrderDetailDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    Instant gtdExpirationTime = ((UiEventOrder) obj).getOrder().getGtdExpirationTime();
                                    if (gtdExpirationTime != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(gtdExpirationTime, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super Instant> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    final EventOrderDetailDuxo eventOrderDetailDuxo = this.this$0;
                    Flow flowCombine = FlowKt.combine(flowDistinctUntilChanged, InstantExt.streamDayChanges$default(new Function0() { // from class: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventOrderDetailDuxo.C164131.AnonymousClass3.invokeSuspend$lambda$2(eventOrderDetailDuxo);
                        }
                    }, null, 2, null), new AnonymousClass4(null));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, anonymousClass5, this) == coroutine_suspended) {
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

            /* compiled from: EventOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"j$/time/Instant", "expirationTime", "Lkotlinx/datetime/Instant;", "now", "Lcom/robinhood/utils/resource/StringResource;", "<anonymous>", "(Lj$/time/Instant;Lkotlinx/datetime/Instant;)Lcom/robinhood/utils/resource/StringResource;"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$4", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function3<Instant, kotlinx.datetime.Instant, Continuation<? super StringResource>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Instant instant, kotlinx.datetime.Instant instant2, Continuation<? super StringResource> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                    anonymousClass4.L$0 = instant;
                    anonymousClass4.L$1 = instant2;
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InstantExt.formatGtdTimeInForce((kotlinx.datetime.Instant) this.L$1, Converters4.toKotlinInstant((Instant) this.L$0));
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kotlinx.datetime.Instant invokeSuspend$lambda$2(EventOrderDetailDuxo eventOrderDetailDuxo) {
                Instant instant = eventOrderDetailDuxo.clock.instant();
                Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                return Converters4.toKotlinInstant(instant);
            }

            /* compiled from: EventOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/resource/StringResource;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$5", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<StringResource, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(StringResource stringResource, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(stringResource, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$5$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$3$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderDetailDataState, Continuation<? super EventOrderDetailDataState>, Object> {
                    final /* synthetic */ StringResource $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(StringResource stringResource, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = stringResource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderDetailDataState eventOrderDetailDataState, Continuation<? super EventOrderDetailDataState> continuation) {
                        return ((AnonymousClass1) create(eventOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderDetailDataState.copy$default((EventOrderDetailDataState) this.L$0, null, null, false, this.$it, null, 23, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((StringResource) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$4", m3645f = "EventOrderDetailDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<UiEventOrder> $orderFlow;
            int label;
            final /* synthetic */ EventOrderDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SharedFlow<UiEventOrder> sharedFlow, EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$orderFlow = sharedFlow;
                this.this$0 = eventOrderDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$orderFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$orderFlow, new C16410xe816466f(null, this.this$0));
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

            /* compiled from: EventOrderDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "displayDetailsUi", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$4$2", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ContractDisplayDetails, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventOrderDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(EventOrderDetailDuxo eventOrderDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = eventOrderDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ContractDisplayDetails contractDisplayDetails, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(contractDisplayDetails, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventOrderDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$4$2$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$onCreate$1$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderDetailDataState, Continuation<? super EventOrderDetailDataState>, Object> {
                    final /* synthetic */ ContractDisplayDetails $displayDetailsUi;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ContractDisplayDetails contractDisplayDetails, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$displayDetailsUi = contractDisplayDetails;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$displayDetailsUi, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventOrderDetailDataState eventOrderDetailDataState, Continuation<? super EventOrderDetailDataState> continuation) {
                        return ((AnonymousClass1) create(eventOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventOrderDetailDataState.copy$default((EventOrderDetailDataState) this.L$0, null, null, false, null, Optional3.asOptional(this.$displayDetailsUi), 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ContractDisplayDetails) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: EventOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$cancelOrder$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$cancelOrder$1 */
    static final class C164111 extends ContinuationImpl7 implements Function2<EventOrderDetailDataState, Continuation<? super EventOrderDetailDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C164111(Continuation<? super C164111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C164111 c164111 = new C164111(continuation);
            c164111.L$0 = obj;
            return c164111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventOrderDetailDataState eventOrderDetailDataState, Continuation<? super EventOrderDetailDataState> continuation) {
            return ((C164111) create(eventOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EventOrderDetailDataState.copy$default((EventOrderDetailDataState) this.L$0, null, null, true, null, null, 27, null);
        }
    }

    public final void cancelOrder() {
        applyMutation(new C164111(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C164122(null), 3, null);
    }

    /* compiled from: EventOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$cancelOrder$2", m3645f = "EventOrderDetailDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$cancelOrder$2 */
    static final class C164122 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C164122(Continuation<? super C164122> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventOrderDetailDuxo.this.new C164122(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C164122) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EventOrderStore eventOrderStore = EventOrderDetailDuxo.this.eventOrderStore;
                    UUID orderId = ((EventOrderDetailKey) EventOrderDetailDuxo.INSTANCE.getArgs((HasSavedState) EventOrderDetailDuxo.this)).getOrderId();
                    this.label = 1;
                    if (eventOrderStore.cancelOrder(orderId, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                EventOrderDetailDuxo.this.submit(new EventOrderDetailEvent.CancelOrderError(e));
            }
            EventOrderDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: EventOrderDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$cancelOrder$2$1", m3645f = "EventOrderDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.event.history.ui.order.EventOrderDetailDuxo$cancelOrder$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EventOrderDetailDataState, Continuation<? super EventOrderDetailDataState>, Object> {
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
            public final Object invoke(EventOrderDetailDataState eventOrderDetailDataState, Continuation<? super EventOrderDetailDataState> continuation) {
                return ((AnonymousClass1) create(eventOrderDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EventOrderDetailDataState.copy$default((EventOrderDetailDataState) this.L$0, null, null, false, null, null, 27, null);
            }
        }
    }

    /* compiled from: EventOrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/history/ui/order/EventOrderDetailDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/EventOrderDetailKey;", "<init>", "()V", "feature-event-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventOrderDetailDuxo, EventOrderDetailKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventOrderDetailKey getArgs(SavedStateHandle savedStateHandle) {
            return (EventOrderDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventOrderDetailKey getArgs(EventOrderDetailDuxo eventOrderDetailDuxo) {
            return (EventOrderDetailKey) DuxoCompanion.DefaultImpls.getArgs(this, eventOrderDetailDuxo);
        }
    }
}
