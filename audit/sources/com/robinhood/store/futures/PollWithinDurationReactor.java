package com.robinhood.store.futures;

import com.robinhood.android.moria.p196db.reactor.Reactor;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import p479j$.time.Duration;

/* compiled from: PollWithinDurationReactor.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004BM\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012<\u0010\u000f\u001a8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e0\b¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eRJ\u0010\u000f\u001a8\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00120 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/store/futures/PollWithinDurationReactor;", "", "P", "T", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "Lcom/robinhood/store/futures/ParamsWithDuration;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "params", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "poller", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)V", "", "", "addReference", "(Lj$/time/Duration;)Ljava/util/Map;", "freeReference", "", "onSubscriptionAdded", "(Lcom/robinhood/store/futures/ParamsWithDuration;)V", "onSubscriptionRemoved", "streamSmallestDuration$lib_store_futures_externalDebug", "()Lkotlinx/coroutines/flow/Flow;", "streamSmallestDuration", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "durationKeyedReferenceStates", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PollWithinDurationReactor<P, T> implements Reactor<PollWithinDurationReactor2<P>> {
    private final StateFlow2<Map<Duration, Integer>> durationKeyedReferenceStates;
    private Job job;
    private final Mutex mutex;
    private final Function2<P, Duration, Flow<T>> poller;
    private final CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PollWithinDurationReactor(CoroutineScope scope, Function2<? super P, ? super Duration, ? extends Flow<? extends T>> poller) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(poller, "poller");
        this.scope = scope;
        this.poller = poller;
        this.durationKeyedReferenceStates = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.mutex = Mutex3.Mutex$default(false, 1, null);
    }

    /* compiled from: PollWithinDurationReactor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.PollWithinDurationReactor$onSubscriptionAdded$1", m3645f = "PollWithinDurationReactor.kt", m3646l = {95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.PollWithinDurationReactor$onSubscriptionAdded$1 */
    static final class C414751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PollWithinDurationReactor2<P> $params;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PollWithinDurationReactor<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414751(PollWithinDurationReactor<P, T> pollWithinDurationReactor, PollWithinDurationReactor2<P> pollWithinDurationReactor2, Continuation<? super C414751> continuation) {
            super(2, continuation);
            this.this$0 = pollWithinDurationReactor;
            this.$params = pollWithinDurationReactor2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C414751(this.this$0, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C414751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            PollWithinDurationReactor<P, T> pollWithinDurationReactor;
            PollWithinDurationReactor2<P> pollWithinDurationReactor2;
            Job job;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = ((PollWithinDurationReactor) this.this$0).mutex;
                pollWithinDurationReactor = this.this$0;
                PollWithinDurationReactor2<P> pollWithinDurationReactor22 = this.$params;
                this.L$0 = mutex;
                this.L$1 = pollWithinDurationReactor;
                this.L$2 = pollWithinDurationReactor22;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pollWithinDurationReactor2 = pollWithinDurationReactor22;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pollWithinDurationReactor2 = (PollWithinDurationReactor2) this.L$2;
                pollWithinDurationReactor = (PollWithinDurationReactor) this.L$1;
                mutex = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                pollWithinDurationReactor.addReference(pollWithinDurationReactor2.getDuration());
                if (((PollWithinDurationReactor) pollWithinDurationReactor).job == null || (job = ((PollWithinDurationReactor) pollWithinDurationReactor).job) == null || !job.isActive()) {
                    ((PollWithinDurationReactor) pollWithinDurationReactor).job = BuildersKt__Builders_commonKt.launch$default(((PollWithinDurationReactor) pollWithinDurationReactor).scope, null, null, new PollWithinDurationReactor3(pollWithinDurationReactor, pollWithinDurationReactor2, null), 3, null);
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionAdded(PollWithinDurationReactor2<P> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C414751(this, params, null), 3, null);
    }

    /* compiled from: PollWithinDurationReactor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.PollWithinDurationReactor$onSubscriptionRemoved$1", m3645f = "PollWithinDurationReactor.kt", m3646l = {95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.PollWithinDurationReactor$onSubscriptionRemoved$1 */
    static final class C414771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PollWithinDurationReactor2<P> $params;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PollWithinDurationReactor<P, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414771(PollWithinDurationReactor<P, T> pollWithinDurationReactor, PollWithinDurationReactor2<P> pollWithinDurationReactor2, Continuation<? super C414771> continuation) {
            super(2, continuation);
            this.this$0 = pollWithinDurationReactor;
            this.$params = pollWithinDurationReactor2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C414771(this.this$0, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C414771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            PollWithinDurationReactor<P, T> pollWithinDurationReactor;
            PollWithinDurationReactor2<P> pollWithinDurationReactor2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = ((PollWithinDurationReactor) this.this$0).mutex;
                pollWithinDurationReactor = this.this$0;
                PollWithinDurationReactor2<P> pollWithinDurationReactor22 = this.$params;
                this.L$0 = mutex;
                this.L$1 = pollWithinDurationReactor;
                this.L$2 = pollWithinDurationReactor22;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pollWithinDurationReactor2 = pollWithinDurationReactor22;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pollWithinDurationReactor2 = (PollWithinDurationReactor2) this.L$2;
                pollWithinDurationReactor = (PollWithinDurationReactor) this.L$1;
                mutex = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                Map mapFreeReference = pollWithinDurationReactor.freeReference(pollWithinDurationReactor2.getDuration());
                if (((PollWithinDurationReactor) pollWithinDurationReactor).job != null && mapFreeReference.isEmpty()) {
                    Job job = ((PollWithinDurationReactor) pollWithinDurationReactor).job;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                    }
                    ((PollWithinDurationReactor) pollWithinDurationReactor).job = null;
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionRemoved(PollWithinDurationReactor2<P> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C414771(this, params, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Duration, Integer> addReference(Duration duration) {
        Map<Duration, Integer> value;
        Map<Duration, Integer> mapPlus;
        StateFlow2<Map<Duration, Integer>> stateFlow2 = this.durationKeyedReferenceStates;
        do {
            value = stateFlow2.getValue();
            Map<Duration, Integer> map = value;
            Integer num = map.get(duration);
            mapPlus = MapsKt.plus(map, Tuples4.m3642to(duration, Integer.valueOf((num != null ? num.intValue() : 0) + 1)));
        } while (!stateFlow2.compareAndSet(value, mapPlus));
        return mapPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Duration, Integer> freeReference(Duration duration) {
        Map<Duration, Integer> value;
        Map<Duration, Integer> mapMinus;
        StateFlow2<Map<Duration, Integer>> stateFlow2 = this.durationKeyedReferenceStates;
        do {
            value = stateFlow2.getValue();
            Map<Duration, Integer> map = value;
            Integer num = map.get(duration);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 1) {
                mapMinus = MapsKt.plus(map, Tuples4.m3642to(duration, Integer.valueOf(iIntValue - 1)));
            } else {
                mapMinus = MapsKt.minus(map, duration);
            }
        } while (!stateFlow2.compareAndSet(value, mapMinus));
        return mapMinus;
    }

    public final Flow<Duration> streamSmallestDuration$lib_store_futures_externalDebug() {
        final StateFlow2<Map<Duration, Integer>> stateFlow2 = this.durationKeyedReferenceStates;
        final Flow flowFilterNotNull = FlowKt.filterNotNull(new Flow<Set<? extends Duration>>() { // from class: com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$map$1$2 */
            public static final class C414732<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$map$1$2", m3645f = "PollWithinDurationReactor.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C414732.this.emit(null, this);
                    }
                }

                public C414732(FlowCollector flowCollector) {
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
                        Set setKeySet = ((Map) obj).keySet();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(setKeySet, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Set<? extends Duration>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C414732(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        return FlowKt.distinctUntilChanged(new Flow<Duration>() { // from class: com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$mapNotNull$1$2", m3645f = "PollWithinDurationReactor.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.PollWithinDurationReactor$streamSmallestDuration$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        Comparable comparableMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Comparable>) obj);
                        if (comparableMinOrNull != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(comparableMinOrNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Duration> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}
