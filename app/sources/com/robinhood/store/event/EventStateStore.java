package com.robinhood.store.event;

import com.robinhood.android.models.event.p186db.dao.PredictionMarketEventStateDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetEventStateResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.time.Time4;
import p479j$.time.Duration;

/* compiled from: EventStateStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u00120\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R,\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/store/event/EventStateStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/models/event/db/dao/PredictionMarketEventStateDao;", "predictionMarketEventStateDao", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "requestHeaderPlugin", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "layoutService", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/models/event/db/dao/PredictionMarketEventStateDao;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;Lcom/robinhood/store/StoreBundle;)V", "", "Ljava/util/UUID;", "eventIds", "j$/time/Duration", "pollDuration", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "streamEventStates", "(Ljava/util/List;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "eventId", "streamEventState", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "", "streamIsEventCurrentlyHappening", "force", "", "refreshEventState", "(Ljava/util/UUID;Z)V", "Lcom/robinhood/android/models/event/db/dao/PredictionMarketEventStateDao;", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventStateResponseDto;", "getEventStateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EventStateStore extends Store {
    private static final long LIVE_EVENT_STATES_POLLING_DURATION_SECONDS = 2;
    private final Endpoint<List<UUID>, Response<GetEventStateResponseDto>> getEventStateEndpoint;
    private final LayoutService layoutService;
    private final PredictionMarketEventStateDao predictionMarketEventStateDao;
    private final PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventStateStore(PredictionMarketEventStateDao predictionMarketEventStateDao, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, LayoutService layoutService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(predictionMarketEventStateDao, "predictionMarketEventStateDao");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(layoutService, "layoutService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.predictionMarketEventStateDao = predictionMarketEventStateDao;
        this.requestHeaderPlugin = requestHeaderPlugin;
        this.layoutService = layoutService;
        this.getEventStateEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new EventStateStore2(this, null), storeBundle.getLogoutKillswitch(), new EventStateStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public static /* synthetic */ Flow streamEventStates$default(EventStateStore eventStateStore, List list, Duration duration, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = Duration.ofSeconds(2L);
        }
        return eventStateStore.streamEventStates(list, duration);
    }

    /* compiled from: EventStateStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$streamEventStates$1", m3645f = "EventStateStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1 */
    static final class C413921 extends ContinuationImpl7 implements Function2<Produce4<? super Map<UUID, ? extends PredictionMarketEventState>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<UUID> $eventIds;
        final /* synthetic */ Duration $pollDuration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413921(List<UUID> list, Duration duration, Continuation<? super C413921> continuation) {
            super(2, continuation);
            this.$eventIds = list;
            this.$pollDuration = duration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C413921 c413921 = EventStateStore.this.new C413921(this.$eventIds, this.$pollDuration, continuation);
            c413921.L$0 = obj;
            return c413921;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Produce4<? super Map<UUID, ? extends PredictionMarketEventState>> produce4, Continuation<? super Unit> continuation) {
            return invoke2((Produce4<? super Map<UUID, PredictionMarketEventState>>) produce4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Produce4<? super Map<UUID, PredictionMarketEventState>> produce4, Continuation<? super Unit> continuation) {
            return ((C413921) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Produce4 produce4 = (Produce4) this.L$0;
            final Flow flowFilterNotNull = FlowKt.filterNotNull(EventStateStore.this.predictionMarketEventStateDao.getEventState(this.$eventIds));
            final Flow<List<? extends UUID>> flow = new Flow<List<? extends UUID>>() { // from class: com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$map$1$2 */
                public static final class C413902<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$map$1$2", m3645f = "EventStateStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C413902.this.emit(null, this);
                        }
                    }

                    public C413902(FlowCollector flowCollector) {
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
                            Collection collectionValues = ((Map) obj).values();
                            ArrayList arrayList = new ArrayList();
                            for (T t : collectionValues) {
                                if (((PredictionMarketEventState) t).getSupportLiveData()) {
                                    arrayList.add(t);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator<T> it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((PredictionMarketEventState) it.next()).getEventId());
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList2, anonymousClass1) == coroutine_suspended) {
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
                    Object objCollect = flowFilterNotNull.collect(new C413902(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            BuildersKt__Builders_commonKt.launch$default(produce4, null, null, new AnonymousClass1(EventStateStore.this, this.$eventIds, this.$pollDuration, FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<List<? extends UUID>>() { // from class: com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$filter$1$2", m3645f = "EventStateStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                            if (!((List) obj).isEmpty()) {
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
                public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }), new C41389x87f32a0f(null, EventStateStore.this, this.$pollDuration)), null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(produce4, null, null, new AnonymousClass2(flowFilterNotNull, produce4, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: EventStateStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$streamEventStates$1$1", m3645f = "EventStateStore.kt", m3646l = {92, 93, 94}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<UUID> $eventIds;
            final /* synthetic */ Duration $pollDuration;
            final /* synthetic */ Flow<Response<GetEventStateResponseDto>> $pollJob;
            int label;
            final /* synthetic */ EventStateStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventStateStore eventStateStore, List<UUID> list, Duration duration, Flow<Response<GetEventStateResponseDto>> flow, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventStateStore;
                this.$eventIds = list;
                this.$pollDuration = duration;
                this.$pollJob = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$eventIds, this.$pollDuration, this.$pollJob, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collect(r12, r11) != r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass1 anonymousClass1;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Endpoint endpoint = this.this$0.getEventStateEndpoint;
                    List<UUID> list = this.$eventIds;
                    this.label = 1;
                    anonymousClass1 = this;
                    if (Endpoint.DefaultImpls.fetch$default(endpoint, list, null, anonymousClass1, 2, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                    Flow<Response<GetEventStateResponseDto>> flow = anonymousClass1.$pollJob;
                    anonymousClass1.label = 3;
                }
                Duration duration = anonymousClass1.$pollDuration;
                anonymousClass1.label = 2;
                if (Time4.delay(duration, this) != coroutine_suspended) {
                    Flow<Response<GetEventStateResponseDto>> flow2 = anonymousClass1.$pollJob;
                    anonymousClass1.label = 3;
                }
                return coroutine_suspended;
            }
        }

        /* compiled from: EventStateStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$streamEventStates$1$2", m3645f = "EventStateStore.kt", m3646l = {97}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<Map<UUID, PredictionMarketEventState>> $$this$channelFlow;
            final /* synthetic */ Flow<Map<UUID, PredictionMarketEventState>> $allEventFromDbStream;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Flow<? extends Map<UUID, PredictionMarketEventState>> flow, Produce4<? super Map<UUID, PredictionMarketEventState>> produce4, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$allEventFromDbStream = flow;
                this.$$this$channelFlow = produce4;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$allEventFromDbStream, this.$$this$channelFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EventStateStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.store.event.EventStateStore$streamEventStates$1$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Map<UUID, ? extends PredictionMarketEventState>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
                AnonymousClass1(Object obj) {
                    super(2, obj, Produce4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends PredictionMarketEventState> map, Continuation<? super Unit> continuation) {
                    return invoke2((Map<UUID, PredictionMarketEventState>) map, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Map<UUID, PredictionMarketEventState> map, Continuation<? super Unit> continuation) {
                    return ((Produce4) this.receiver).send(map, continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Map<UUID, PredictionMarketEventState>> flow = this.$allEventFromDbStream;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$channelFlow);
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
    }

    public final Flow<Map<UUID, PredictionMarketEventState>> streamEventStates(List<UUID> eventIds, Duration pollDuration) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        Intrinsics.checkNotNullParameter(pollDuration, "pollDuration");
        return eventIds.isEmpty() ? FlowKt.flowOf(MapsKt.emptyMap()) : FlowKt.channelFlow(new C413921(eventIds, pollDuration, null));
    }

    public final Flow<PredictionMarketEventState> streamEventState(final UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        final Flow flowStreamEventStates$default = streamEventStates$default(this, CollectionsKt.listOf(eventId), null, 2, null);
        return new Flow<PredictionMarketEventState>() { // from class: com.robinhood.store.event.EventStateStore$streamEventState$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStateStore$streamEventState$$inlined$mapNotNull$1$2 */
            public static final class C413872<T> implements FlowCollector {
                final /* synthetic */ UUID $eventId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$streamEventState$$inlined$mapNotNull$1$2", m3645f = "EventStateStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStateStore$streamEventState$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C413872.this.emit(null, this);
                    }
                }

                public C413872(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$eventId$inlined = uuid;
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
                        Object obj3 = ((Map) obj).get(this.$eventId$inlined);
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PredictionMarketEventState> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamEventStates$default.collect(new C413872(flowCollector, eventId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<Boolean> streamIsEventCurrentlyHappening(UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        final Flow<PredictionMarketEventState> flowStreamEventState = streamEventState(eventId);
        return new Flow<Boolean>() { // from class: com.robinhood.store.event.EventStateStore$streamIsEventCurrentlyHappening$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStateStore$streamIsEventCurrentlyHappening$$inlined$map$1$2 */
            public static final class C413912<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStateStore$streamIsEventCurrentlyHappening$$inlined$map$1$2", m3645f = "EventStateStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStateStore$streamIsEventCurrentlyHappening$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C413912.this.emit(null, this);
                    }
                }

                public C413912(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((PredictionMarketEventState) obj).getEventStatus().isCurrentlyHappening());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamEventState.collect(new C413912(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static /* synthetic */ void refreshEventState$default(EventStateStore eventStateStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        eventStateStore.refreshEventState(uuid, z);
    }

    public final void refreshEventState(UUID eventId, boolean force) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Endpoint.DefaultImpls.refresh$default(this.getEventStateEndpoint, CollectionsKt.listOf(eventId), force, null, 4, null);
    }
}
