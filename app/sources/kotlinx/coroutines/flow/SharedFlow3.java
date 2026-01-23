package kotlinx.coroutines.flow;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job4;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow2;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow3;
import kotlinx.coroutines.flow.internal.ChannelFlow6;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: SharedFlow.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\b\u0014\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001uB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 0\u001f2\u0006\u0010\u001e\u001a\u00020\u001aH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0003H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001f2\u0006\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*J-\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u0010\u0016J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b2\u0010\u0016J\u000f\u00103\u001a\u00020\u0017H\u0002¢\u0006\u0004\b3\u0010*J\u0017\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u001aH\u0002¢\u0006\u0004\b5\u00106J\u0019\u00109\u001a\u00020\u00172\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J9\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u001f2\u0010\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u00010\u001f2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b@\u0010\u0019J\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ/\u0010I\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001aH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0017H\u0002¢\u0006\u0004\bK\u0010*J\u0019\u0010M\u001a\u0004\u0018\u0001072\u0006\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020\u0003H\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010R\u001a\u0004\u0018\u0001072\u0006\u0010Q\u001a\u00020\u001aH\u0002¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bT\u0010UJ3\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 0\u001f2\u0014\u0010V\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 0\u001fH\u0002¢\u0006\u0004\bW\u0010XR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010YR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ZR \u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0016\u0010`\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010YR\u0016\u0010a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001a\u0010i\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bh\u0010*\u001a\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u001cR\u0014\u0010n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010mR\u0014\u0010r\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u001cR\u0014\u0010t\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u001c¨\u0006v"}, m3636d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "", AnalyticsStrings.BUTTON_EARNINGS_REPLAY, "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "tryEmit", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "()J", "updateNewCollectorIndexLocked", "oldIndex", "", "Lkotlin/coroutines/Continuation;", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateCollectorIndexLocked", "createSlot", "()Lkotlinx/coroutines/flow/SharedFlowSlot;", "size", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "resetReplayCache", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "tryEmitLocked", "tryEmitNoCollectorsLocked", "dropOldestLocked", "newHead", "correctCollectorIndexesOnDropOldest", "(J)V", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "enqueueLocked", "(Ljava/lang/Object;)V", "curBuffer", "curSize", "newSize", "growBuffer", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "emitSuspend", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "emitter", "cancelEmitter", "(Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateBufferLocked", "(JJJJ)V", "cleanupTailLocked", "slot", "tryTakeValue", "(Lkotlinx/coroutines/flow/SharedFlowSlot;)Ljava/lang/Object;", "tryPeekLocked", "(Lkotlinx/coroutines/flow/SharedFlowSlot;)J", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getPeekedValueLockedAt", "(J)Ljava/lang/Object;", "awaitValue", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumesIn", "findSlotsToResumeLocked", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "I", "Lkotlinx/coroutines/channels/BufferOverflow;", "buffer", "[Ljava/lang/Object;", "replayIndex", "J", "minCollectorIndex", "bufferSize", "queueSize", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "getLastReplayedLocked", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "getHead", "head", "getReplaySize", "()I", "replaySize", "getTotalSize", "totalSize", "getBufferEndIndex", "bufferEndIndex", "getQueueEndIndex", "queueEndIndex", "Emitter", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.flow.SharedFlowImpl, reason: use source file name */
/* loaded from: classes23.dex */
public class SharedFlow3<T> extends AbstractSharedFlow<SharedFlow5> implements SharedFlow2<T>, Context4<T>, ChannelFlow6<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* compiled from: SharedFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.coroutines.flow.SharedFlowImpl", m3645f = "SharedFlow.kt", m3646l = {387, 394, 397}, m3647m = "collect$suspendImpl")
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1 */
    static final class C461191<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlow3<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C461191(SharedFlow3<T> sharedFlow3, Continuation<? super C461191> continuation) {
            super(continuation);
            this.this$0 = sharedFlow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlow3.collect$suspendImpl(this.this$0, null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow2, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return emit$suspendImpl(this, t, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (SharedFlow4.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlow4.setBufferAt(objArr, emitter.index, SharedFlow4.NO_VALUE);
            cleanupTailLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(SharedFlow4.getBufferAt(objArr, this.replayIndex + i));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow2
    public void resetReplayCache() throws Throwable {
        synchronized (this) {
            try {
                try {
                    updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private final void correctCollectorIndexesOnDropOldest(long newHead) {
        AbstractSharedFlow3[] abstractSharedFlow3Arr;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlow3Arr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlow3 abstractSharedFlow3 : abstractSharedFlow3Arr) {
                if (abstractSharedFlow3 != null) {
                    SharedFlow5 sharedFlow5 = (SharedFlow5) abstractSharedFlow3;
                    long j = sharedFlow5.index;
                    if (j >= 0 && j < newHead) {
                        sharedFlow5.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    public SharedFlow3(int i, int i2, BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    protected final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) SharedFlow4.getBufferAt(objArr, (this.replayIndex + getReplaySize()) - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.Share8) r9).onSubscription(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <T> Object collect$suspendImpl(SharedFlow3<T> sharedFlow3, FlowCollector<? super T> flowCollector, Continuation<?> continuation) throws Throwable {
        C461191 c461191;
        SharedFlow3<T> sharedFlow32;
        Throwable th;
        SharedFlow5 sharedFlow5;
        FlowCollector<? super T> flowCollector2;
        Job job;
        FlowCollector flowCollector3;
        if (continuation instanceof C461191) {
            c461191 = (C461191) continuation;
            int i = c461191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461191.label = i - Integer.MIN_VALUE;
            } else {
                c461191 = new C461191(sharedFlow3, continuation);
            }
        }
        Object obj = c461191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461191.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow5 sharedFlow5AllocateSlot = sharedFlow3.allocateSlot();
            try {
                if (flowCollector instanceof Share8) {
                    c461191.L$0 = sharedFlow3;
                    c461191.L$1 = flowCollector;
                    c461191.L$2 = sharedFlow5AllocateSlot;
                    c461191.label = 1;
                }
                flowCollector2 = flowCollector;
                sharedFlow5 = sharedFlow5AllocateSlot;
                job = (Job) c461191.get$context().get(Job.INSTANCE);
                flowCollector3 = flowCollector2;
            } catch (Throwable th2) {
                sharedFlow32 = sharedFlow3;
                th = th2;
                sharedFlow5 = sharedFlow5AllocateSlot;
            }
        } else {
            if (i2 == 1) {
                sharedFlow5 = (SharedFlow5) c461191.L$2;
                FlowCollector<? super T> flowCollector4 = (FlowCollector) c461191.L$1;
                SharedFlow3<T> sharedFlow33 = (SharedFlow3) c461191.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    flowCollector2 = flowCollector4;
                    sharedFlow3 = sharedFlow33;
                    try {
                        job = (Job) c461191.get$context().get(Job.INSTANCE);
                        flowCollector3 = flowCollector2;
                    } catch (Throwable th3) {
                        sharedFlow32 = sharedFlow3;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sharedFlow32 = sharedFlow33;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Job job2 = (Job) c461191.L$3;
                sharedFlow5 = (SharedFlow5) c461191.L$2;
                FlowCollector flowCollector5 = (FlowCollector) c461191.L$1;
                sharedFlow32 = (SharedFlow3) c461191.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    flowCollector3 = flowCollector5;
                    job = job2;
                    sharedFlow3 = sharedFlow32;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            sharedFlow32.freeSlot(sharedFlow5);
            throw th;
        }
        while (true) {
            Object objTryTakeValue = sharedFlow3.tryTakeValue(sharedFlow5);
            if (objTryTakeValue == SharedFlow4.NO_VALUE) {
                c461191.L$0 = sharedFlow3;
                c461191.L$1 = flowCollector3;
                c461191.L$2 = sharedFlow5;
                c461191.L$3 = job;
                c461191.label = 2;
                if (sharedFlow3.awaitValue(sharedFlow5, c461191) == coroutine_suspended) {
                    break;
                }
            } else {
                if (job != null) {
                    JobKt.ensureActive(job);
                }
                c461191.L$0 = sharedFlow3;
                c461191.L$1 = flowCollector3;
                c461191.L$2 = sharedFlow5;
                c461191.L$3 = job;
                c461191.label = 3;
                if (flowCollector3.emit(objTryTakeValue, c461191) == coroutine_suspended) {
                    break;
                }
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow2
    public boolean tryEmit(T value) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked = AbstractSharedFlow2.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(value)) {
                continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrFindSlotsToResumeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    static /* synthetic */ <T> Object emit$suspendImpl(SharedFlow3<T> sharedFlow3, T t, Continuation<? super Unit> continuation) {
        Object objEmitSuspend;
        return (!sharedFlow3.tryEmit(t) && (objEmitSuspend = sharedFlow3.emitSuspend(t, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objEmitSuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T value) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        enqueueLocked(value);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final Object awaitValue(SharedFlow5 sharedFlow5, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlow5) >= 0) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                } else {
                    sharedFlow5.cont = cancellableContinuationImpl;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final Object emitSuspend(T t, Continuation<? super Unit> continuation) throws Throwable {
        Throwable th;
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked2 = AbstractSharedFlow2.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(t)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                        continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                        emitter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        emitter = new Emitter(this, getHead() + getTotalSize(), t, cancellableContinuationImpl);
                        enqueueLocked(emitter);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            continuationArrFindSlotsToResumeLocked2 = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                        }
                        continuationArrFindSlotsToResumeLocked = continuationArrFindSlotsToResumeLocked2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (emitter != null) {
                    CancellableContinuation2.disposeOnCancellation(cancellableContinuationImpl, emitter);
                }
                for (Continuation<Unit> continuation2 : continuationArrFindSlotsToResumeLocked) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                    }
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(continuation);
                }
                return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    private final boolean tryEmitNoCollectorsLocked(T value) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(value);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        SharedFlow4.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object item) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        SharedFlow4.setBufferAt(objArrGrowBuffer, getHead() + totalSize, item);
    }

    private final Object[] growBuffer(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long head = getHead();
            for (int i = 0; i < curSize; i++) {
                long j = i + head;
                SharedFlow4.setBufferAt(objArr, j, SharedFlow4.getBufferAt(curBuffer, j));
            }
        }
        return objArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long oldIndex) {
        int iMin;
        long j;
        long j2;
        long j3;
        AbstractSharedFlow3[] abstractSharedFlow3Arr;
        if (oldIndex > this.minCollectorIndex) {
            return AbstractSharedFlow2.EMPTY_RESUMES;
        }
        long head = getHead();
        long j4 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j4++;
        }
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlow3Arr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlow3 abstractSharedFlow3 : abstractSharedFlow3Arr) {
                if (abstractSharedFlow3 != null) {
                    long j5 = ((SharedFlow5) abstractSharedFlow3).index;
                    if (j5 >= 0 && j5 < j4) {
                        j4 = j5;
                    }
                }
            }
        }
        if (j4 <= this.minCollectorIndex) {
            return AbstractSharedFlow2.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        if (getNCollectors() > 0) {
            iMin = Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j4)));
        } else {
            iMin = this.queueSize;
        }
        Continuation<Unit>[] continuationArr = AbstractSharedFlow2.EMPTY_RESUMES;
        long j6 = this.queueSize + bufferEndIndex;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            j3 = 1;
            long j7 = bufferEndIndex;
            int i = 0;
            while (true) {
                if (bufferEndIndex >= j6) {
                    j = head;
                    j2 = j4;
                    bufferEndIndex = j7;
                    break;
                }
                Object bufferAt = SharedFlow4.getBufferAt(objArr, bufferEndIndex);
                j = head;
                Symbol symbol = SharedFlow4.NO_VALUE;
                if (bufferAt != symbol) {
                    Intrinsics.checkNotNull(bufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) bufferAt;
                    int i2 = i + 1;
                    j2 = j4;
                    continuationArr[i] = emitter.cont;
                    SharedFlow4.setBufferAt(objArr, bufferEndIndex, symbol);
                    SharedFlow4.setBufferAt(objArr, j7, emitter.value);
                    long j8 = j7 + 1;
                    if (i2 >= iMin) {
                        bufferEndIndex = j8;
                        break;
                    }
                    i = i2;
                    j7 = j8;
                } else {
                    j2 = j4;
                }
                bufferEndIndex++;
                head = j;
                j4 = j2;
            }
        } else {
            j = head;
            j2 = j4;
            j3 = 1;
        }
        Continuation<Unit>[] continuationArr2 = continuationArr;
        int i3 = (int) (bufferEndIndex - j);
        long j9 = getNCollectors() == 0 ? bufferEndIndex : j2;
        long jMax = Math.max(this.replayIndex, bufferEndIndex - Math.min(this.replay, i3));
        if (this.bufferCapacity == 0 && jMax < j6) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(SharedFlow4.getBufferAt(objArr2, jMax), SharedFlow4.NO_VALUE)) {
                bufferEndIndex += j3;
                jMax += j3;
            }
        }
        updateBufferLocked(jMax, j9, bufferEndIndex, j6);
        cleanupTailLocked();
        return !(continuationArr2.length == 0) ? findSlotsToResumeLocked(continuationArr2) : continuationArr2;
    }

    private final void updateBufferLocked(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            SharedFlow4.setBufferAt(objArr, head, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && SharedFlow4.getBufferAt(objArr, (getHead() + getTotalSize()) - 1) == SharedFlow4.NO_VALUE) {
                this.queueSize--;
                SharedFlow4.setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    private final Object tryTakeValue(SharedFlow5 slot) {
        Object obj;
        Continuation<Unit>[] continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractSharedFlow2.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long jTryPeekLocked = tryPeekLocked(slot);
                if (jTryPeekLocked < 0) {
                    obj = SharedFlow4.NO_VALUE;
                } else {
                    long j = slot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                    slot.index = jTryPeekLocked + 1;
                    continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlow5 slot) {
        long j = slot.index;
        if (j >= getBufferEndIndex() && (this.bufferCapacity > 0 || j > getHead() || this.queueSize == 0)) {
            return -1L;
        }
        return j;
    }

    private final Object getPeekedValueLockedAt(long index) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object bufferAt = SharedFlow4.getBufferAt(objArr, index);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final Continuation<Unit>[] findSlotsToResumeLocked(Continuation<Unit>[] resumesIn) {
        AbstractSharedFlow3[] abstractSharedFlow3Arr;
        SharedFlow5 sharedFlow5;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlow3Arr = ((AbstractSharedFlow) this).slots) != null) {
            int length2 = abstractSharedFlow3Arr.length;
            int i = 0;
            resumesIn = resumesIn;
            while (i < length2) {
                AbstractSharedFlow3 abstractSharedFlow3 = abstractSharedFlow3Arr[i];
                if (abstractSharedFlow3 != null && (continuation = (sharedFlow5 = (SharedFlow5) abstractSharedFlow3).cont) != null && tryPeekLocked(sharedFlow5) >= 0) {
                    int length3 = resumesIn.length;
                    resumesIn = resumesIn;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(resumesIn, Math.max(2, resumesIn.length * 2));
                        Intrinsics.checkNotNullExpressionValue(CopyOf, "copyOf(...)");
                        resumesIn = CopyOf;
                    }
                    resumesIn[length] = continuation;
                    sharedFlow5.cont = null;
                    length++;
                }
                i++;
                resumesIn = resumesIn;
            }
        }
        return resumesIn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlow5 createSlot() {
        return new SharedFlow5();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlow5[] createSlotArray(int size) {
        return new SharedFlow5[size];
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow6
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return SharedFlow4.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$Emitter */
    private static final class Emitter implements Job4 {

        @JvmField
        public final Continuation<Unit> cont;

        @JvmField
        public final SharedFlow3<?> flow;

        @JvmField
        public long index;

        @JvmField
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlow3<?> sharedFlow3, long j, Object obj, Continuation<? super Unit> continuation) {
            this.flow = sharedFlow3;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.Job4
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }
}
