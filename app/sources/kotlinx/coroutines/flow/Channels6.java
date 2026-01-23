package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow3;

/* compiled from: Channels.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "channel", "", "emitAll", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consume", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "Lkotlinx/coroutines/flow/Flow;", "consumeAsFlow", "(Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "produceIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 48, m3641xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ChannelsKt, reason: use source file name */
/* loaded from: classes23.dex */
final /* synthetic */ class Channels6 {
    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Channel8<? extends T> channel8, Continuation<? super Unit> continuation) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(flowCollector, channel8, true, continuation);
        return objEmitAllImpl$FlowKt__ChannelsKt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmitAllImpl$FlowKt__ChannelsKt : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object emitAllImpl$FlowKt__ChannelsKt(FlowCollector<? super T> flowCollector, Channel8<? extends T> channel8, boolean z, Continuation<? super Unit> continuation) {
        Channels7 channels7;
        Channel3<? extends T> it;
        Channel3<? extends T> channel3;
        ?? r2;
        Object objHasNext;
        if (continuation instanceof Channels7) {
            channels7 = (Channels7) continuation;
            int i = channels7.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                channels7.label = i - Integer.MIN_VALUE;
            } else {
                channels7 = new Channels7(continuation);
            }
        }
        Object obj = channels7.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = channels7.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowKt.ensureActive(flowCollector);
                it = channel8.iterator();
                channels7.L$0 = flowCollector;
                channels7.L$1 = channel8;
                channels7.L$2 = it;
                channels7.Z$0 = z;
                channels7.label = 1;
                objHasNext = it.hasNext(channels7);
                if (objHasNext != coroutine_suspended) {
                }
            } else if (i2 == 1) {
                z = channels7.Z$0;
                channel3 = (Channel3) channels7.L$2;
                channel8 = (Channel8) channels7.L$1;
                FlowCollector flowCollector2 = (FlowCollector) channels7.L$0;
                ResultKt.throwOnFailure(obj);
                r2 = flowCollector2;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = channels7.Z$0;
                channel3 = (Channel3) channels7.L$2;
                channel8 = (Channel8) channels7.L$1;
                FlowCollector<? super T> flowCollector3 = (FlowCollector) channels7.L$0;
                ResultKt.throwOnFailure(obj);
                FlowCollector<? super T> flowCollector4 = flowCollector3;
                it = channel3;
                flowCollector = flowCollector4;
                channels7.L$0 = flowCollector;
                channels7.L$1 = channel8;
                channels7.L$2 = it;
                channels7.Z$0 = z;
                channels7.label = 1;
                objHasNext = it.hasNext(channels7);
                if (objHasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                r2 = flowCollector;
                channel3 = it;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    T next = channel3.next();
                    channels7.L$0 = r2;
                    channels7.L$1 = channel8;
                    channels7.L$2 = channel3;
                    channels7.Z$0 = z;
                    channels7.label = 2;
                    Object objEmit = r2.emit(next, channels7);
                    flowCollector4 = r2;
                } else {
                    if (z) {
                        ChannelsKt.cancelConsumed(channel8, null);
                    }
                    return Unit.INSTANCE;
                }
            }
        } finally {
        }
    }

    public static final <T> Flow<T> consumeAsFlow(Channel8<? extends T> channel8) {
        return new Channels5(channel8, true, null, 0, null, 28, null);
    }

    public static final <T> Channel8<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return ChannelFlow3.asChannelFlow(flow).produceImpl(coroutineScope);
    }
}
