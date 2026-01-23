package com.robinhood.android.event.detail.routing;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment;
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
import com.singular.sdk.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventDetailParentDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/event/detail/routing/EventDetailParentDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/event/detail/routing/EventDetailParentViewState;", "Lcom/robinhood/android/event/detail/routing/EventDetailParentEvent;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/event/EventStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-event-detail-routing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventDetailParentDuxo extends BaseDuxo5<EventDetailParentDuxo4, EventDetailParentEvent> implements HasSavedState {
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
    public EventDetailParentDuxo(EventStore eventStore, ExperimentsProvider experimentsProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(EventDetailParentDuxo4.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventStore = eventStore;
        this.experimentsProvider = experimentsProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C162101(null));
    }

    /* compiled from: EventDetailParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1", m3645f = "EventDetailParentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1 */
    static final class C162101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: EventDetailParentDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1$WhenMappings */
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

        C162101(Continuation<? super C162101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C162101 c162101 = EventDetailParentDuxo.this.new C162101(continuation);
            c162101.L$0 = obj;
            return c162101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C162101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Companion companion = EventDetailParentDuxo.INSTANCE;
            int i = WhenMappings.$EnumSwitchMapping$0[((EventDetailRoutingFragmentKey) companion.getArgs((HasSavedState) EventDetailParentDuxo.this)).getType().ordinal()];
            if (i == 1) {
                flowFlowOf = FlowKt.flowOf(((EventDetailRoutingFragmentKey) companion.getArgs((HasSavedState) EventDetailParentDuxo.this)).getId());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                flowFlowOf = FlowKt.distinctUntilChanged(FlowKt.mapLatest(EventDetailParentDuxo.this.eventStore.streamEventContract(((EventDetailRoutingFragmentKey) companion.getArgs((HasSavedState) EventDetailParentDuxo.this)).getId()), new EventDetailParentDuxo2(null)));
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flowFlowOf, EventDetailParentDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: EventDetailParentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1$1", m3645f = "EventDetailParentDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $eventIdFlow;
            int label;
            final /* synthetic */ EventDetailParentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<UUID> flow, EventDetailParentDuxo eventDetailParentDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$eventIdFlow = flow;
                this.this$0 = eventDetailParentDuxo;
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
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTake = FlowKt.take(FlowKt.combine(FlowKt.transformLatest(this.$eventIdFlow, new C16209xf5953162(null, this.this$0)), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsProvider, new Experiment[]{GameDetailPageExperiment.INSTANCE}, false, null, 4, null), AnonymousClass4.INSTANCE), 1);
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass5, this) == coroutine_suspended) {
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

            /* compiled from: EventDetailParentDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1$1$4, reason: invalid class name */
            /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function3<UiEcEvent, Boolean, Continuation<? super Tuples2<? extends UiEcEvent, ? extends Boolean>>, Object>, ContinuationImpl6 {
                public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

                AnonymousClass4() {
                    super(3, Tuples2.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                }

                public final Object invoke(UiEcEvent uiEcEvent, boolean z, Continuation<? super Tuples2<UiEcEvent, Boolean>> continuation) {
                    return AnonymousClass1.invokeSuspend$lambda$1(uiEcEvent, z, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(UiEcEvent uiEcEvent, Boolean bool, Continuation<? super Tuples2<? extends UiEcEvent, ? extends Boolean>> continuation) {
                    return invoke(uiEcEvent, bool.booleanValue(), (Continuation<? super Tuples2<UiEcEvent, Boolean>>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$lambda$1(UiEcEvent uiEcEvent, boolean z, Continuation continuation) {
                return new Tuples2(uiEcEvent, boxing.boxBoolean(z));
            }

            /* compiled from: EventDetailParentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "Lkotlin/ParameterName;", "name", Constants.RequestParamsKeys.DEVELOPER_API_KEY, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1$1$5", m3645f = "EventDetailParentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.event.detail.routing.EventDetailParentDuxo$onCreate$1$1$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiEcEvent, ? extends Boolean>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventDetailParentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(EventDetailParentDuxo eventDetailParentDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = eventDetailParentDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UiEcEvent, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<UiEcEvent, Boolean>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<UiEcEvent, Boolean> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    UiEcEvent uiEcEvent = (UiEcEvent) tuples2.component1();
                    boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
                    boolean z = false;
                    boolean z2 = uiEcEvent.getEvent().getPageType() == PageType.PAGE_TYPE_GDP;
                    if (z2) {
                        this.this$0.experimentsProvider.logExposure(GameDetailPageExperiment.INSTANCE);
                    }
                    EventDetailParentDuxo eventDetailParentDuxo = this.this$0;
                    if (z2 && zBooleanValue) {
                        z = true;
                    }
                    eventDetailParentDuxo.submit(new EventDetailParentEvent(z));
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* compiled from: EventDetailParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/routing/EventDetailParentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/detail/routing/EventDetailParentDuxo;", "Lcom/robinhood/android/eventcontracts/contracts/EventDetailRoutingFragmentKey;", "<init>", "()V", "feature-event-detail-routing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventDetailParentDuxo, EventDetailRoutingFragmentKey> {
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
        public EventDetailRoutingFragmentKey getArgs(EventDetailParentDuxo eventDetailParentDuxo) {
            return (EventDetailRoutingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, eventDetailParentDuxo);
        }
    }
}
