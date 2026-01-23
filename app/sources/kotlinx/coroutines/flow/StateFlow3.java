package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.ChannelFlow6;
import kotlinx.coroutines.flow.internal.NullSurrogate;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: StateFlow.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\"H\u0016J\u001c\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0003H\u0014J\u001d\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030,2\u0006\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0002\u0010.J&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0016R\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u0004R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, m3636d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "<init>", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "sequence", "", "value", "getValue", "()Ljava/lang/Object;", "setValue", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "tryEmit", "(Ljava/lang/Object;)Z", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetReplayCache", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.flow.StateFlowImpl, reason: use source file name */
/* loaded from: classes23.dex */
final class StateFlow3<T> extends AbstractSharedFlow<StateFlow5> implements StateFlow2<T>, Context4<T>, ChannelFlow6<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlow3.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    private int sequence;

    /* compiled from: StateFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.StateFlowImpl", m3645f = "StateFlow.kt", m3646l = {389, 401, 406}, m3647m = "collect")
    /* renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1 */
    static final class C461231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlow3<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C461231(StateFlow3<T> stateFlow3, Continuation<? super C461231> continuation) {
            super(continuation);
            this.this$0 = stateFlow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    private final boolean updateState(Object expectedState, Object newState) {
        int i;
        StateFlow5[] slots;
        synchronized (this) {
            Object obj = _state$volatile$FU.get(this);
            if (expectedState != null && !Intrinsics.areEqual(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.areEqual(obj, newState)) {
                return true;
            }
            _state$volatile$FU.set(this, newState);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            StateFlow5[] slots2 = getSlots();
            Unit unit = Unit.INSTANCE;
            while (true) {
                StateFlow5[] stateFlow5Arr = slots2;
                if (stateFlow5Arr != null) {
                    for (StateFlow5 stateFlow5 : stateFlow5Arr) {
                        if (stateFlow5 != null) {
                            stateFlow5.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return true;
                    }
                    slots = getSlots();
                    Unit unit2 = Unit.INSTANCE;
                }
                slots2 = slots;
                i3 = i;
            }
        }
    }

    public StateFlow3(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.StateFlow2, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        Symbol symbol = NullSurrogate.NULL;
        T t = (T) _state$volatile$FU.get(this);
        if (t == symbol) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.StateFlow2
    public void setValue(T t) {
        if (t == null) {
            t = (T) NullSurrogate.NULL;
        }
        updateState(null, t);
    }

    @Override // kotlinx.coroutines.flow.StateFlow2
    public boolean compareAndSet(T expect, T update) {
        if (expect == null) {
            expect = (T) NullSurrogate.NULL;
        }
        if (update == null) {
            update = (T) NullSurrogate.NULL;
        }
        return updateState(expect, update);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.SharedFlow2
    public boolean tryEmit(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow2, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow2
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (((kotlinx.coroutines.flow.Share8) r11).onSubscription(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, (java.lang.Object) r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x00ac, B:52:0x00e2], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:40:0x00bb, B:42:0x00c1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:40:0x00bb], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:50:0x00dc], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:52:0x00e2, B:36:0x00ac], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) throws Throwable {
        C461231 c461231;
        StateFlow3<T> stateFlow3;
        StateFlow5 stateFlow5;
        FlowCollector flowCollector2;
        Job job;
        Object obj;
        StateFlow5 stateFlow52;
        boolean zTakePending;
        T t;
        if (continuation instanceof C461231) {
            c461231 = (C461231) continuation;
            int i = c461231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461231.label = i - Integer.MIN_VALUE;
            } else {
                c461231 = new C461231(this, continuation);
            }
        }
        Object obj2 = c461231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461231.label;
        ?? r6 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj2);
                StateFlow5 stateFlow5AllocateSlot = allocateSlot();
                try {
                    if (flowCollector instanceof Share8) {
                        c461231.L$0 = this;
                        c461231.L$1 = flowCollector;
                        c461231.L$2 = stateFlow5AllocateSlot;
                        c461231.label = 1;
                    }
                    stateFlow3 = this;
                    stateFlow5 = stateFlow5AllocateSlot;
                } catch (Throwable th) {
                    th = th;
                    stateFlow3 = this;
                    r6 = stateFlow5AllocateSlot;
                    stateFlow3.freeSlot(r6);
                    throw th;
                }
            } else if (i2 == 1) {
                StateFlow5 stateFlow53 = (StateFlow5) c461231.L$2;
                flowCollector = (FlowCollector) c461231.L$1;
                stateFlow3 = (StateFlow3) c461231.L$0;
                ResultKt.throwOnFailure(obj2);
                stateFlow5 = stateFlow53;
            } else if (i2 == 2) {
                obj = c461231.L$4;
                job = (Job) c461231.L$3;
                StateFlow5 stateFlow54 = (StateFlow5) c461231.L$2;
                flowCollector2 = (FlowCollector) c461231.L$1;
                stateFlow3 = (StateFlow3) c461231.L$0;
                ResultKt.throwOnFailure(obj2);
                stateFlow52 = stateFlow54;
                zTakePending = stateFlow52.takePending();
                r6 = stateFlow52;
                if (!zTakePending) {
                }
                ?? r12 = _state$volatile$FU.get(stateFlow3);
                if (job != null) {
                }
                if (obj != null) {
                }
                if (r12 != NullSurrogate.NULL) {
                }
                c461231.L$0 = stateFlow3;
                c461231.L$1 = flowCollector2;
                c461231.L$2 = r6;
                c461231.L$3 = job;
                c461231.L$4 = r12;
                c461231.label = 2;
                if (flowCollector2.emit(t, c461231) != coroutine_suspended) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c461231.L$4;
                job = (Job) c461231.L$3;
                StateFlow5 stateFlow55 = (StateFlow5) c461231.L$2;
                flowCollector2 = (FlowCollector) c461231.L$1;
                stateFlow3 = (StateFlow3) c461231.L$0;
                ResultKt.throwOnFailure(obj2);
                r6 = stateFlow55;
                ?? r122 = _state$volatile$FU.get(stateFlow3);
                if (job != null) {
                    JobKt.ensureActive(job);
                }
                if (obj != null) {
                    stateFlow52 = r6;
                }
                t = r122 != NullSurrogate.NULL ? null : r122;
                c461231.L$0 = stateFlow3;
                c461231.L$1 = flowCollector2;
                c461231.L$2 = r6;
                c461231.L$3 = job;
                c461231.L$4 = r122;
                c461231.label = 2;
                if (flowCollector2.emit(t, c461231) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = r122;
                stateFlow52 = r6;
                zTakePending = stateFlow52.takePending();
                r6 = stateFlow52;
                if (!zTakePending) {
                    c461231.L$0 = stateFlow3;
                    c461231.L$1 = flowCollector2;
                    c461231.L$2 = stateFlow52;
                    c461231.L$3 = job;
                    c461231.L$4 = obj;
                    c461231.label = 3;
                    Object objAwaitPending = stateFlow52.awaitPending(c461231);
                    r6 = stateFlow52;
                    if (objAwaitPending != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                ?? r1222 = _state$volatile$FU.get(stateFlow3);
                if (job != null) {
                }
                if (obj != null) {
                }
                if (r1222 != NullSurrogate.NULL) {
                }
                c461231.L$0 = stateFlow3;
                c461231.L$1 = flowCollector2;
                c461231.L$2 = r6;
                c461231.L$3 = job;
                c461231.L$4 = r1222;
                c461231.label = 2;
                if (flowCollector2.emit(t, c461231) != coroutine_suspended) {
                }
            }
            flowCollector2 = flowCollector;
            job = (Job) c461231.getContext().get(Job.INSTANCE);
            obj = null;
            r6 = stateFlow5;
            ?? r12222 = _state$volatile$FU.get(stateFlow3);
            if (job != null) {
            }
            if (obj != null) {
            }
            if (r12222 != NullSurrogate.NULL) {
            }
            c461231.L$0 = stateFlow3;
            c461231.L$1 = flowCollector2;
            c461231.L$2 = r6;
            c461231.L$3 = job;
            c461231.L$4 = r12222;
            c461231.label = 2;
            if (flowCollector2.emit(t, c461231) != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlow5 createSlot() {
        return new StateFlow5();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlow5[] createSlotArray(int size) {
        return new StateFlow5[size];
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow6
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return StateFlow4.fuseStateFlow(this, context, capacity, onBufferOverflow);
    }
}
