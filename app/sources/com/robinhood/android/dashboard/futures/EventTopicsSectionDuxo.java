package com.robinhood.android.dashboard.futures;

import com.robinhood.android.eventcontracts.experiments.AcqPredictionMarketsHomeTabEnhancementExperiment;
import com.robinhood.android.eventcontracts.experiments.AcqPredictionMarketsHomeTabEnhancementExperiment2;
import com.robinhood.android.eventcontracts.experiments.EventContractShimmerExperiment;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic;
import com.robinhood.android.models.event.p186db.arsenal.EventTopic3;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.arsenal.proto.p281v1.idl.EventStateDto;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.HasOpenedEcHubPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.event.EventTopicsStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: EventTopicsSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionViewState;", "eventTopicsStore", "Lcom/robinhood/store/event/EventTopicsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "hasOpenedEcHubPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/event/EventTopicsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "onEcHeaderClicked", "lib-dashboard-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class EventTopicsSectionDuxo extends BaseDuxo<EventTopicsSectionDataState, EventTopicsSectionViewState> {
    public static final int $stable = 8;
    private final EventStore eventStore;
    private final EventTopicsStore eventTopicsStore;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference hasOpenedEcHubPref;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTopicsSectionDuxo(EventTopicsStore eventTopicsStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentsStore, EventStore eventStore, @HasOpenedEcHubPref BooleanPreference hasOpenedEcHubPref, DuxoBundle duxoBundle) {
        super(new EventTopicsSectionDataState(null, false, false, null, null, 31, null), EventTopicsSectionDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(eventTopicsStore, "eventTopicsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(hasOpenedEcHubPref, "hasOpenedEcHubPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.eventTopicsStore = eventTopicsStore;
        this.regionGateProvider = regionGateProvider;
        this.experimentsStore = experimentsStore;
        this.eventStore = eventStore;
        this.hasOpenedEcHubPref = hasOpenedEcHubPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C136701(null));
    }

    /* compiled from: EventTopicsSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1 */
    static final class C136701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C136701(Continuation<? super C136701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C136701 c136701 = EventTopicsSectionDuxo.this.new C136701(continuation);
            c136701.L$0 = obj;
            return c136701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C136701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EventTopicsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventTopicsSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventTopicsSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    Flow flowConnectWhen$default = Operators.connectWhen$default(this.this$0.eventTopicsStore.streamEventTopicsListByLocation(EventTopic3.EVENT_TOPIC_LOCATION_INVESTING_TAB), Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, EventContractsRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null), null, 2, null);
                    C498161 c498161 = new C498161(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowConnectWhen$default, c498161, this) == coroutine_suspended) {
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

            /* compiled from: EventTopicsSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eventTopics", "", "Lcom/robinhood/android/models/event/db/arsenal/EventTopic;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$1$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498161 extends ContinuationImpl7 implements Function2<List<? extends EventTopic>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventTopicsSectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498161(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super C498161> continuation) {
                    super(2, continuation);
                    this.this$0 = eventTopicsSectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498161 c498161 = new C498161(this.this$0, continuation);
                    c498161.L$0 = obj;
                    return c498161;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends EventTopic> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<EventTopic>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<EventTopic> list, Continuation<? super Unit> continuation) {
                    return ((C498161) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventTopicsSectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$1$1$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498171 extends ContinuationImpl7 implements Function2<EventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState>, Object> {
                    final /* synthetic */ List<EventTopic> $eventTopics;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498171(List<EventTopic> list, Continuation<? super C498171> continuation) {
                        super(2, continuation);
                        this.$eventTopics = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498171 c498171 = new C498171(this.$eventTopics, continuation);
                        c498171.L$0 = obj;
                        return c498171;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventTopicsSectionDataState eventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState> continuation) {
                        return ((C498171) create(eventTopicsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventTopicsSectionDataState.copy$default((EventTopicsSectionDataState) this.L$0, this.$eventTopics, false, false, null, null, 30, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498171((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(EventTopicsSectionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(EventTopicsSectionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(EventTopicsSectionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(EventTopicsSectionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(EventTopicsSectionDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: EventTopicsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$2", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventTopicsSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = eventTopicsSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EventContractShimmerExperiment.INSTANCE}, false, null, 6, null);
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

            /* compiled from: EventTopicsSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInEcShimmerExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$2$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventTopicsSectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventTopicsSectionDuxo;
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

                /* compiled from: EventTopicsSectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$2$1$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498181 extends ContinuationImpl7 implements Function2<EventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState>, Object> {
                    final /* synthetic */ boolean $isInEcShimmerExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498181(boolean z, Continuation<? super C498181> continuation) {
                        super(2, continuation);
                        this.$isInEcShimmerExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498181 c498181 = new C498181(this.$isInEcShimmerExperiment, continuation);
                        c498181.L$0 = obj;
                        return c498181;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventTopicsSectionDataState eventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState> continuation) {
                        return ((C498181) create(eventTopicsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventTopicsSectionDataState.copy$default((EventTopicsSectionDataState) this.L$0, null, this.$isInEcShimmerExperiment, false, null, null, 29, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498181(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventTopicsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$3", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventTopicsSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = eventTopicsSectionDuxo;
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.this$0.experimentsStore, AcqPredictionMarketsHomeTabEnhancementExperiment.INSTANCE, AcqPredictionMarketsHomeTabEnhancementExperiment2.CONTROL, false, 4, null));
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

            /* compiled from: EventTopicsSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/android/eventcontracts/experiments/AcqPredictionMarketsHomeTabVariant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$3$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcqPredictionMarketsHomeTabEnhancementExperiment2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventTopicsSectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventTopicsSectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcqPredictionMarketsHomeTabEnhancementExperiment2 acqPredictionMarketsHomeTabEnhancementExperiment2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(acqPredictionMarketsHomeTabEnhancementExperiment2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventTopicsSectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$3$1$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498191 extends ContinuationImpl7 implements Function2<EventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState>, Object> {
                    final /* synthetic */ AcqPredictionMarketsHomeTabEnhancementExperiment2 $variant;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498191(AcqPredictionMarketsHomeTabEnhancementExperiment2 acqPredictionMarketsHomeTabEnhancementExperiment2, Continuation<? super C498191> continuation) {
                        super(2, continuation);
                        this.$variant = acqPredictionMarketsHomeTabEnhancementExperiment2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498191 c498191 = new C498191(this.$variant, continuation);
                        c498191.L$0 = obj;
                        return c498191;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventTopicsSectionDataState eventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState> continuation) {
                        return ((C498191) create(eventTopicsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventTopicsSectionDataState.copy$default((EventTopicsSectionDataState) this.L$0, null, false, false, null, this.$variant, 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498191((AcqPredictionMarketsHomeTabEnhancementExperiment2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventTopicsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$4", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {82}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventTopicsSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = eventTopicsSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.eventStore.streamEventCount(EventStateDto.EVENT_STATE_ACTIVE, boxing.boxBoolean(true)));
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

            /* compiled from: EventTopicsSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eventCount", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$4$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Long, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EventTopicsSectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventTopicsSectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Long l, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(l, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EventTopicsSectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$4$1$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498201 extends ContinuationImpl7 implements Function2<EventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState>, Object> {
                    final /* synthetic */ Long $eventCount;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498201(Long l, Continuation<? super C498201> continuation) {
                        super(2, continuation);
                        this.$eventCount = l;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498201 c498201 = new C498201(this.$eventCount, continuation);
                        c498201.L$0 = obj;
                        return c498201;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventTopicsSectionDataState eventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState> continuation) {
                        return ((C498201) create(eventTopicsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventTopicsSectionDataState.copy$default((EventTopicsSectionDataState) this.L$0, null, false, false, this.$eventCount, null, 23, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498201((Long) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EventTopicsSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$5", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EventTopicsSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = eventTopicsSectionDuxo;
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.hasOpenedEcHubPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: EventTopicsSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasOpenedEcHub", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$5$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EventTopicsSectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EventTopicsSectionDuxo eventTopicsSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = eventTopicsSectionDuxo;
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

                /* compiled from: EventTopicsSectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/dashboard/futures/EventTopicsSectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$5$1$1", m3645f = "EventTopicsSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$onCreate$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498211 extends ContinuationImpl7 implements Function2<EventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState>, Object> {
                    final /* synthetic */ boolean $hasOpenedEcHub;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498211(boolean z, Continuation<? super C498211> continuation) {
                        super(2, continuation);
                        this.$hasOpenedEcHub = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498211 c498211 = new C498211(this.$hasOpenedEcHub, continuation);
                        c498211.L$0 = obj;
                        return c498211;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EventTopicsSectionDataState eventTopicsSectionDataState, Continuation<? super EventTopicsSectionDataState> continuation) {
                        return ((C498211) create(eventTopicsSectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EventTopicsSectionDataState.copy$default((EventTopicsSectionDataState) this.L$0, null, false, this.$hasOpenedEcHub, null, null, 27, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498211(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onEcHeaderClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.dashboard.futures.EventTopicsSectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventTopicsSectionDuxo.onEcHeaderClicked$lambda$0(this.f$0, (EventTopicsSectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEcHeaderClicked$lambda$0(EventTopicsSectionDuxo eventTopicsSectionDuxo, EventTopicsSectionDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.isInEcShimmerExperiment()) {
            eventTopicsSectionDuxo.hasOpenedEcHubPref.set(true);
        }
        return Unit.INSTANCE;
    }
}
