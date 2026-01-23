package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.List;
import kotlin.Inference;
import kotlin.Inference2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.Produce4;

@Metadata(m3635d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class FlowKt {
    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T> SharedFlow<T> asSharedFlow(SharedFlow2<T> sharedFlow2) {
        return Share3.asSharedFlow(sharedFlow2);
    }

    public static final <T> StateFlow<T> asStateFlow(StateFlow2<T> stateFlow2) {
        return Share3.asStateFlow(stateFlow2);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i, BufferOverflow bufferOverflow) {
        return Context7.buffer(flow, i, bufferOverflow);
    }

    public static final <T> Flow<T> callbackFlow(@Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.callbackFlow(function2);
    }

    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return Context7.cancellable(flow);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m28818catch(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return Errors.m28831catch(flow, function3);
    }

    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, Continuation<? super Throwable> continuation) {
        return Errors.catchImpl(flow, flowCollector, continuation);
    }

    public static final <T> Flow<T> channelFlow(@Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.channelFlow(function2);
    }

    public static final Object collect(Flow<?> flow, Continuation<? super Unit> continuation) {
        return Collect8.collect(flow, continuation);
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return Collect8.collectLatest(flow, function2, continuation);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return Zip.combine(flow, flow2, function3);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, @Inference Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return Zip.combine(flow, flow2, flow3, function4);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return Zip.combine(flow, flow2, flow3, flow4, function5);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return Zip.combine(flow, flow2, flow3, flow4, flow5, function6);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, @Inference Function4<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return Zip.combineTransform(flow, flow2, function4);
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return Context7.conflate(flow);
    }

    public static final <T> Flow<T> consumeAsFlow(Channel8<? extends T> channel8) {
        return Channels6.consumeAsFlow(channel8);
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.debounce(flow, j);
    }

    @Inference2
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Function1<? super T, Long> function1) {
        return FlowKt__DelayKt.debounce(flow, function1);
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m28819debounceHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m28823debounceHG0u8IE(flow, j);
    }

    @Inference2
    @JvmName
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, Function1<? super T, Duration> function1) {
        return FlowKt__DelayKt.debounceDuration(flow, function1);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return Distinct4.distinctUntilChanged(flow);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, Function2<? super T, ? super T, Boolean> function2) {
        return Distinct4.distinctUntilChanged(flow, function2);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, Function1<? super T, ? extends K> function1) {
        return Distinct4.distinctUntilChangedBy(flow, function1);
    }

    public static final <T> Flow<T> drop(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.drop(flow, i);
    }

    public static final <T> Flow<T> dropWhile(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.dropWhile(flow, function2);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Channel8<? extends T> channel8, Continuation<? super Unit> continuation) {
        return Channels6.emitAll(flowCollector, channel8, continuation);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, Continuation<? super Unit> continuation) {
        return Collect8.emitAll(flowCollector, flow, continuation);
    }

    public static final <T> Flow<T> emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final <T> Flow<T> filterNotNull(Flow<? extends T> flow) {
        return Transform2.filterNotNull(flow);
    }

    public static final <T> Object first(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return Reduce2.first(flow, continuation);
    }

    public static final <T> Object first(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        return Reduce2.first(flow, function2, continuation);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return Reduce2.firstOrNull(flow, continuation);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super T> continuation) {
        return Reduce2.firstOrNull(flow, function2, continuation);
    }

    public static final Channel8<Unit> fixedPeriodTicker(CoroutineScope coroutineScope, long j) {
        return FlowKt__DelayKt.fixedPeriodTicker(coroutineScope, j);
    }

    public static final <T, R> Flow<R> flatMapConcat(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.flatMapConcat(flow, function2);
    }

    public static final <T, R> Flow<R> flatMapMerge(Flow<? extends T> flow, int i, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.flatMapMerge(flow, i, function2);
    }

    public static final <T> Flow<T> flattenConcat(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MergeKt.flattenConcat(flow);
    }

    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i) {
        return FlowKt__MergeKt.flattenMerge(flow, i);
    }

    public static final <T> Flow<T> flow(@Inference Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.flow(function2);
    }

    @JvmName
    public static final <T1, T2, R> Flow<R> flowCombine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return Zip.flowCombine(flow, flow2, function3);
    }

    public static final <T> Flow<T> flowOf(T t) {
        return FlowKt__BuildersKt.flowOf(t);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return Context7.flowOn(flow, coroutineContext);
    }

    public static final <T> Object lastOrNull(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return Reduce2.lastOrNull(flow, continuation);
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return Collect8.launchIn(flow, coroutineScope);
    }

    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, @Inference Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__MergeKt.mapLatest(flow, function2);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt__MergeKt.merge(flowArr);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.onCompletion(flow, function3);
    }

    public static final <T> Flow<T> onEach(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return Transform2.onEach(flow, function2);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__EmittersKt.onEmpty(flow, function2);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__EmittersKt.onStart(flow, function2);
    }

    public static final <T> Channel8<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return Channels6.produceIn(flow, coroutineScope);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, Function4<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return Errors.retryWhen(flow, function4);
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r, @Inference Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return Transform2.runningFold(flow, r, function3);
    }

    public static final <T> Flow<T> runningReduce(Flow<? extends T> flow, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return Transform2.runningReduce(flow, function3);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.sample(flow, j);
    }

    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m28820sampleHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m28824sampleHG0u8IE(flow, j);
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r, @Inference Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return Transform2.scan(flow, r, function3);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        return Share3.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final <T> Object single(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return Reduce2.single(flow, continuation);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t) {
        return Share3.stateIn(flow, coroutineScope, sharingStarted, t);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.take(flow, i);
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.takeWhile(flow, function2);
    }

    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m28821timeoutHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt__DelayKt.m28825timeoutHG0u8IE(flow, j);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, C c, Continuation<? super C> continuation) {
        return Collection2.toCollection(flow, c, continuation);
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, Continuation<? super List<? extends T>> continuation) {
        return Collection2.toList(flow, list, continuation);
    }

    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, @Inference Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__MergeKt.transformLatest(flow, function3);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, @Inference Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        return FlowKt__LimitKt.transformWhile(flow, function3);
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return Zip.zip(flow, flow2, function3);
    }
}
