package com.robinhood.android.eventcontracts.hub.p134v2.home;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.experiments.AcqPredictionMarketsStreamlinedTradeFlowExperiment;
import com.robinhood.android.eventcontracts.hub.p134v2.root.HubCategoryContentDelegate;
import com.robinhood.android.eventcontracts.hub.p134v2.root.HubCategoryContentDelegate4;
import com.robinhood.android.eventcontracts.sharedeventui.experiments.FormatPriceAsCentsExperiment;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout2;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.store.event.EcHubLayoutStore;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStateStore;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: HubDefaultCategoryContentDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096\u0001J\u0011\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentViewState;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/HubCategoryContentDelegate;", "ecHubLayoutStore", "Lcom/robinhood/store/event/EcHubLayoutStore;", "eventStateStore", "Lcom/robinhood/store/event/EventStateStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventContractPositionStore", "Lcom/robinhood/store/event/EventContractPositionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/event/EcHubLayoutStore;Lcom/robinhood/store/event/EventStateStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/event/EventContractPositionStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "streamNodeId", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/UUID;", "updateNodeId", "nodeId", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class HubDefaultCategoryContentDuxo extends BaseDuxo<HubDefaultCategoryContentDataState, HubDefaultCategoryContentViewState> implements HubCategoryContentDelegate {
    public static final int $stable = 8;
    private final /* synthetic */ HubCategoryContentDelegate4 $$delegate_0;
    private final EcHubLayoutStore ecHubLayoutStore;
    private final EventContractPositionStore eventContractPositionStore;
    private final EventMarketdataStore eventMarketdataStore;
    private final EventStateStore eventStateStore;
    private final ExperimentsStore experimentsStore;

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.root.HubCategoryContentDelegate
    public Flow<UUID> streamNodeId() {
        return this.$$delegate_0.streamNodeId();
    }

    @Override // com.robinhood.android.eventcontracts.hub.p134v2.root.HubCategoryContentDelegate
    public void updateNodeId(UUID nodeId) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        this.$$delegate_0.updateNodeId(nodeId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubDefaultCategoryContentDuxo(EcHubLayoutStore ecHubLayoutStore, EventStateStore eventStateStore, EventMarketdataStore eventMarketdataStore, EventContractPositionStore eventContractPositionStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        super(new HubDefaultCategoryContentDataState(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), HubDefaultCategoryContentStateProvider.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(ecHubLayoutStore, "ecHubLayoutStore");
        Intrinsics.checkNotNullParameter(eventStateStore, "eventStateStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(eventContractPositionStore, "eventContractPositionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.$$delegate_0 = new HubCategoryContentDelegate4();
        this.ecHubLayoutStore = ecHubLayoutStore;
        this.eventStateStore = eventStateStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.eventContractPositionStore = eventContractPositionStore;
        this.experimentsStore = experimentsStore;
    }

    /* compiled from: HubDefaultCategoryContentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1 */
    static final class C165651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C165651(Continuation<? super C165651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C165651 c165651 = HubDefaultCategoryContentDuxo.this.new C165651(continuation);
            c165651.L$0 = obj;
            return c165651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C165651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow<UUID> flowStreamNodeId = HubDefaultCategoryContentDuxo.this.streamNodeId();
            SharingStarted.Companion companion = SharingStarted.INSTANCE;
            final SharedFlow sharedFlowShareIn = FlowKt.shareIn(FlowKt.transformLatest(FlowKt.shareIn(flowStreamNodeId, coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1), new C16563x2f8cb7a9(null, HubDefaultCategoryContentDuxo.this)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, HubDefaultCategoryContentDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(HubDefaultCategoryContentDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            List<UUID> eventIds = EcHubLayout2.getEventIds((List) obj);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(eventIds, anonymousClass1) == coroutine_suspended) {
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
                    Object objCollect = sharedFlowShareIn.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }), HubDefaultCategoryContentDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn, HubDefaultCategoryContentDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(HubDefaultCategoryContentDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(HubDefaultCategoryContentDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: HubDefaultCategoryContentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<List<EcHubLayout>> $layoutComponentStream;
            int label;
            final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(SharedFlow<? extends List<EcHubLayout>> sharedFlow, HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$layoutComponentStream = sharedFlow;
                this.this$0 = hubDefaultCategoryContentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$layoutComponentStream, this.this$0, continuation);
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
                    SharedFlow<List<EcHubLayout>> sharedFlow = this.$layoutComponentStream;
                    C500691 c500691 = new C500691(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c500691, this) == coroutine_suspended) {
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

            /* compiled from: HubDefaultCategoryContentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "layoutComponents", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubLayout;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$1$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500691 extends ContinuationImpl7 implements Function2<List<? extends EcHubLayout>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500691(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super C500691> continuation) {
                    super(2, continuation);
                    this.this$0 = hubDefaultCategoryContentDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500691 c500691 = new C500691(this.this$0, continuation);
                    c500691.L$0 = obj;
                    return c500691;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends EcHubLayout> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<EcHubLayout>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<EcHubLayout> list, Continuation<? super Unit> continuation) {
                    return ((C500691) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HubDefaultCategoryContentDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$1$1$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500701 extends ContinuationImpl7 implements Function2<HubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState>, Object> {
                    final /* synthetic */ List<EcHubLayout> $layoutComponents;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500701(List<EcHubLayout> list, Continuation<? super C500701> continuation) {
                        super(2, continuation);
                        this.$layoutComponents = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500701 c500701 = new C500701(this.$layoutComponents, continuation);
                        c500701.L$0 = obj;
                        return c500701;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState> continuation) {
                        return ((C500701) create(hubDefaultCategoryContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HubDefaultCategoryContentDataState.copy$default((HubDefaultCategoryContentDataState) this.L$0, null, this.$layoutComponents, null, null, null, false, false, 125, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500701((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: HubDefaultCategoryContentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$2", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = hubDefaultCategoryContentDuxo;
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

            /* compiled from: HubDefaultCategoryContentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "positions", "", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$2$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends UiEventContractPosition>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = hubDefaultCategoryContentDuxo;
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

                /* compiled from: HubDefaultCategoryContentDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$2$1$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500711 extends ContinuationImpl7 implements Function2<HubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState>, Object> {
                    final /* synthetic */ List<UiEventContractPosition> $positions;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500711(List<UiEventContractPosition> list, Continuation<? super C500711> continuation) {
                        super(2, continuation);
                        this.$positions = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500711 c500711 = new C500711(this.$positions, continuation);
                        c500711.L$0 = obj;
                        return c500711;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState> continuation) {
                        return ((C500711) create(hubDefaultCategoryContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState = (HubDefaultCategoryContentDataState) this.L$0;
                        List<UiEventContractPosition> list = this.$positions;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (Object obj2 : list) {
                            linkedHashMap.put(((UiEventContractPosition) obj2).getContractId(), obj2);
                        }
                        return HubDefaultCategoryContentDataState.copy$default(hubDefaultCategoryContentDataState, null, null, null, null, linkedHashMap, false, false, 111, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500711((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: HubDefaultCategoryContentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$3", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<List<UUID>> $eventIdsFromComponentStream;
            int label;
            final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Flow<? extends List<UUID>> flow, HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$eventIdsFromComponentStream = flow;
                this.this$0 = hubDefaultCategoryContentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$eventIdsFromComponentStream, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$eventIdsFromComponentStream, new C16560x7ca9597a(null, this.this$0));
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

            /* compiled from: HubDefaultCategoryContentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$3$2", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$3$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends PredictionMarketEventState>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = hubDefaultCategoryContentDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends PredictionMarketEventState> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, PredictionMarketEventState>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, PredictionMarketEventState> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HubDefaultCategoryContentDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$3$2$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$3$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState>, Object> {
                    final /* synthetic */ Map<UUID, PredictionMarketEventState> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<UUID, PredictionMarketEventState> map, Continuation<? super AnonymousClass1> continuation) {
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
                    public final Object invoke(HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState> continuation) {
                        return ((AnonymousClass1) create(hubDefaultCategoryContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HubDefaultCategoryContentDataState.copy$default((HubDefaultCategoryContentDataState) this.L$0, null, null, this.$it, null, null, false, false, 123, null);
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

        /* compiled from: HubDefaultCategoryContentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<List<EcHubLayout>> $layoutComponentStream;
            int label;
            final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(SharedFlow<? extends List<EcHubLayout>> sharedFlow, HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$layoutComponentStream = sharedFlow;
                this.this$0 = hubDefaultCategoryContentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$layoutComponentStream, this.this$0, continuation);
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
                    final SharedFlow<List<EcHubLayout>> sharedFlow = this.$layoutComponentStream;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    List<UUID> contractIds = EcHubLayout2.getContractIds((List) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(contractIds, anonymousClass1) == coroutine_suspended) {
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
                            Object objCollect = sharedFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C16561xd3c74a59(null, this.this$0));
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

            /* compiled from: HubDefaultCategoryContentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$3", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends EventQuote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = hubDefaultCategoryContentDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends EventQuote> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, EventQuote>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, EventQuote> map, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: HubDefaultCategoryContentDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$3$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<HubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState>, Object> {
                    final /* synthetic */ Map<UUID, EventQuote> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Map<UUID, EventQuote> map, Continuation<? super AnonymousClass1> continuation) {
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
                    public final Object invoke(HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState> continuation) {
                        return ((AnonymousClass1) create(hubDefaultCategoryContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HubDefaultCategoryContentDataState.copy$default((HubDefaultCategoryContentDataState) this.L$0, null, null, null, this.$it, null, false, false, 119, null);
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

        /* compiled from: HubDefaultCategoryContentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$5", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = hubDefaultCategoryContentDuxo;
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{FormatPriceAsCentsExperiment.INSTANCE}, false, null, 6, null);
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

            /* compiled from: HubDefaultCategoryContentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$5$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = hubDefaultCategoryContentDuxo;
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

                /* compiled from: HubDefaultCategoryContentDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$5$1$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500721 extends ContinuationImpl7 implements Function2<HubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500721(boolean z, Continuation<? super C500721> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500721 c500721 = new C500721(this.$it, continuation);
                        c500721.L$0 = obj;
                        return c500721;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState> continuation) {
                        return ((C500721) create(hubDefaultCategoryContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HubDefaultCategoryContentDataState.copy$default((HubDefaultCategoryContentDataState) this.L$0, null, null, null, null, null, this.$it, false, 95, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500721(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: HubDefaultCategoryContentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$6", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = hubDefaultCategoryContentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcqPredictionMarketsStreamlinedTradeFlowExperiment.INSTANCE}, false, null, 4, null);
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

            /* compiled from: HubDefaultCategoryContentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$6$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ HubDefaultCategoryContentDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HubDefaultCategoryContentDuxo hubDefaultCategoryContentDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = hubDefaultCategoryContentDuxo;
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

                /* compiled from: HubDefaultCategoryContentDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubDefaultCategoryContentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$6$1$1", m3645f = "HubDefaultCategoryContentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubDefaultCategoryContentDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C500731 extends ContinuationImpl7 implements Function2<HubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C500731(boolean z, Continuation<? super C500731> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C500731 c500731 = new C500731(this.$it, continuation);
                        c500731.L$0 = obj;
                        return c500731;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(HubDefaultCategoryContentDataState hubDefaultCategoryContentDataState, Continuation<? super HubDefaultCategoryContentDataState> continuation) {
                        return ((C500731) create(hubDefaultCategoryContentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return HubDefaultCategoryContentDataState.copy$default((HubDefaultCategoryContentDataState) this.L$0, null, null, null, null, null, false, this.$it, 63, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C500731(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C165651(null));
    }
}
