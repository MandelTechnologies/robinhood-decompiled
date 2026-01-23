package com.robinhood.android.event.detail.routing;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment4;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.PageType;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.store.event.EventStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventDetailInitialLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/event/detail/routing/EventDetailInitialLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/event/detail/routing/EventDetailInitialLoadingViewState;", "Lcom/robinhood/android/event/detail/routing/EventDetailInitialLoadingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-event-detail-routing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventDetailInitialLoadingDuxo extends BaseDuxo5<EventDetailInitialLoadingViewState, EventDetailInitialLoadingEvent> implements HasSavedState {
    private final EventStore eventStore;
    private final ExperimentsProvider experimentsProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventDetailInitialLoadingDuxo(EventStore eventStore, ExperimentsProvider experimentsProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(EventDetailInitialLoadingViewState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventStore = eventStore;
        this.experimentsProvider = experimentsProvider;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: EventDetailInitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1", m3645f = "EventDetailInitialLoadingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1 */
    static final class C162031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: EventDetailInitialLoadingDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$WhenMappings */
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

        C162031(Continuation<? super C162031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162031 c162031 = EventDetailInitialLoadingDuxo.this.new C162031(continuation);
            c162031.L$0 = obj;
            return c162031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C162031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Companion companion = EventDetailInitialLoadingDuxo.INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$0[((EventDetailRoutingFragmentKey) companion.getArgs((HasSavedState) EventDetailInitialLoadingDuxo.this)).getType().ordinal()];
            if (i == 1) {
                flowFlowOf = FlowKt.flowOf(((EventDetailRoutingFragmentKey) companion.getArgs((HasSavedState) EventDetailInitialLoadingDuxo.this)).getId());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                final Flow<EventContract> flowStreamEventContract = EventDetailInitialLoadingDuxo.this.eventStore.streamEventContract(((EventDetailRoutingFragmentKey) companion.getArgs((HasSavedState) EventDetailInitialLoadingDuxo.this)).getId());
                flowFlowOf = FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "EventDetailInitialLoadingDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                EventContract eventContract = (EventContract) obj;
                                UUID parentEventId = eventContract.getParentEventId();
                                if (parentEventId == null) {
                                    parentEventId = eventContract.getEventId();
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(parentEventId, anonymousClass1) == coroutine_suspended) {
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
                        Object objCollect = flowStreamEventContract.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flowFlowOf, EventDetailInitialLoadingDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: EventDetailInitialLoadingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$1", m3645f = "EventDetailInitialLoadingDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ EventDetailInitialLoadingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<UUID> flow, EventDetailInitialLoadingDuxo eventDetailInitialLoadingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = eventDetailInitialLoadingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$eventIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                boolean z = false;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.combine(FlowKt.transformLatest(this.$eventIdFlow, new C16201xd3af910(null, this.this$0)), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{GameDetailPageExperiment.INSTANCE}, false, null, 4, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{GameDetailPageExperiment4.INSTANCE}, false, null, 4, null), AnonymousClass4.INSTANCE);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowCombine, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Tuples3 tuples3 = (Tuples3) obj;
                if (tuples3 != null) {
                    EventDetailInitialLoadingDuxo eventDetailInitialLoadingDuxo = this.this$0;
                    UiEcEvent uiEcEvent = (UiEcEvent) tuples3.component1();
                    boolean zBooleanValue = ((Boolean) tuples3.component2()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) tuples3.component3()).booleanValue();
                    boolean z2 = uiEcEvent.getEvent().getPageType() == PageType.PAGE_TYPE_GDP;
                    if (z2) {
                        eventDetailInitialLoadingDuxo.experimentsProvider.logExposure(GameDetailPageExperiment.INSTANCE);
                    }
                    boolean z3 = z2 && zBooleanValue && uiEcEvent.getEvent().getSupportCombos();
                    if (z3) {
                        eventDetailInitialLoadingDuxo.experimentsProvider.logExposure(GameDetailPageExperiment4.INSTANCE);
                    }
                    boolean z4 = z2 && zBooleanValue;
                    if (z3 && zBooleanValue2) {
                        z = true;
                    }
                    eventDetailInitialLoadingDuxo.submit(new EventDetailInitialLoadingEvent(z4, z));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: EventDetailInitialLoadingDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.event.detail.routing.EventDetailInitialLoadingDuxo$onCreate$1$1$4, reason: invalid class name */
            /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function4<UiEcEvent, Boolean, Boolean, Continuation<? super Tuples3<? extends UiEcEvent, ? extends Boolean, ? extends Boolean>>, Object>, ContinuationImpl6 {
                public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

                AnonymousClass4() {
                    super(4, Tuples3.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                }

                public final Object invoke(UiEcEvent uiEcEvent, boolean z, boolean z2, Continuation<? super Tuples3<UiEcEvent, Boolean, Boolean>> continuation) {
                    return AnonymousClass1.invokeSuspend$lambda$1(uiEcEvent, z, z2, continuation);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Object invoke(UiEcEvent uiEcEvent, Boolean bool, Boolean bool2, Continuation<? super Tuples3<? extends UiEcEvent, ? extends Boolean, ? extends Boolean>> continuation) {
                    return invoke(uiEcEvent, bool.booleanValue(), bool2.booleanValue(), (Continuation<? super Tuples3<UiEcEvent, Boolean, Boolean>>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$lambda$1(UiEcEvent uiEcEvent, boolean z, boolean z2, Continuation continuation) {
                return new Tuples3(uiEcEvent, boxing.boxBoolean(z), boxing.boxBoolean(z2));
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C162031(null));
    }

    /* compiled from: EventDetailInitialLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/routing/EventDetailInitialLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/detail/routing/EventDetailInitialLoadingDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/EventDetailRoutingFragmentKey;", "<init>", "()V", "feature-event-detail-routing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventDetailInitialLoadingDuxo, EventDetailRoutingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventDetailRoutingFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EventDetailRoutingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventDetailRoutingFragmentKey getArgs(EventDetailInitialLoadingDuxo eventDetailInitialLoadingDuxo) {
            return (EventDetailRoutingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, eventDetailInitialLoadingDuxo);
        }
    }
}
