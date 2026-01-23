package com.robinhood.android.moria.p196db.reactor;

import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: Batch.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u001c\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001eH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/moria/db/reactor/Batch;", "P", "", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "batchSize", "", "enableDebugLogging", "", "subscriptionSampleRate", "", "networkFactory", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/flow/Flow;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;IZJLkotlin/jvm/functions/Function1;)V", "subscribers", "", "getSubscribers$lib_moria", "()Ljava/util/Set;", "networkSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "onSubscriptionAdded", "params", "(Ljava/lang/Comparable;)V", "onSubscriptionRemoved", "getChunkedParameters", "", "getChunkedParameters$lib_moria", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Batch<P extends Comparable<? super P>> implements Reactor<P> {
    private final int batchSize;
    private final boolean enableDebugLogging;
    private final Function1<Collection<? extends P>, Flow<?>> networkFactory;
    private final SharedFlow2<Unit> networkSharedFlow;
    private final Set<P> subscribers;

    /* JADX WARN: Multi-variable type inference failed */
    public Batch(CoroutineScope scope, int i, boolean z, long j, Function1<? super Collection<? extends P>, ? extends Flow<?>> networkFactory) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(networkFactory, "networkFactory");
        this.batchSize = i;
        this.enableDebugLogging = z;
        this.networkFactory = networkFactory;
        Set<P> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
        this.subscribers = setNewSetFromMap;
        SharedFlow2<Unit> sharedFlow2MutableSharedFlow = SharedFlow4.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
        this.networkSharedFlow = sharedFlow2MutableSharedFlow;
        FlowKt.launchIn(FlowKt.transformLatest(FlowKt.sample(sharedFlow2MutableSharedFlow, j), new Batch$special$$inlined$flatMapLatest$1(null, this)), scope);
    }

    public /* synthetic */ Batch(CoroutineScope coroutineScope, int i, boolean z, long j, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 100L : j, function1);
    }

    public final Set<P> getSubscribers$lib_moria() {
        return this.subscribers;
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionAdded(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.subscribers.add(params);
        if (!this.networkSharedFlow.tryEmit(Unit.INSTANCE)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionRemoved(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.subscribers.remove(params);
        if (!this.networkSharedFlow.tryEmit(Unit.INSTANCE)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final List<List<P>> getChunkedParameters$lib_moria() {
        return SequencesKt.toList(SequencesKt.chunked(SequencesKt.sorted(CollectionsKt.asSequence(this.subscribers)), this.batchSize));
    }
}
