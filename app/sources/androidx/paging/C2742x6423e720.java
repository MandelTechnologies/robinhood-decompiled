package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: FlowExt.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"T1", "T2", "R", "Landroidx/paging/SimpleProducerScope;", "", "<anonymous>", "(Landroidx/paging/SimpleProducerScope;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
@DebugMetadata(m3644c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", m3645f = "PageFetcher.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 */
/* loaded from: classes4.dex */
public final class C2742x6423e720<Value> extends ContinuationImpl7 implements Function2<SimpleChannelFlow3<PageEvent<Value>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $otherFlow;
    final /* synthetic */ MutableLoadStateCollection $sourceStates$inlined;
    final /* synthetic */ Flow $this_combineWithoutBatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2742x6423e720(Flow flow, Flow flow2, Continuation continuation, MutableLoadStateCollection mutableLoadStateCollection) {
        super(2, continuation);
        this.$this_combineWithoutBatching = flow;
        this.$otherFlow = flow2;
        this.$sourceStates$inlined = mutableLoadStateCollection;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C2742x6423e720 c2742x6423e720 = new C2742x6423e720(this.$this_combineWithoutBatching, this.$otherFlow, continuation, this.$sourceStates$inlined);
        c2742x6423e720.L$0 = obj;
        return c2742x6423e720;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SimpleChannelFlow3<PageEvent<Value>> simpleChannelFlow3, Continuation<? super Unit> continuation) {
        return ((C2742x6423e720) create(simpleChannelFlow3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SimpleChannelFlow3 simpleChannelFlow3 = (SimpleChannelFlow3) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new AnonymousClass1(simpleChannelFlow3, null, this.$sourceStates$inlined));
            final CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
            int i2 = 0;
            Flow[] flowArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i3 = 0;
            while (i3 < 2) {
                SimpleChannelFlow3 simpleChannelFlow32 = simpleChannelFlow3;
                simpleChannelFlow3 = simpleChannelFlow32;
                BuildersKt__Builders_commonKt.launch$default(simpleChannelFlow3, completableJobJob$default, null, new AnonymousClass2(flowArr[i3], atomicInteger, simpleChannelFlow32, unbatchedFlowCombiner, i2, null), 2, null);
                i3++;
                atomicInteger = atomicInteger;
                i2++;
                unbatchedFlowCombiner = unbatchedFlowCombiner;
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Job.DefaultImpls.cancel$default(completableJobJob$default, null, 1, null);
                }
            };
            this.label = 1;
            if (simpleChannelFlow3.awaitClose(function0, this) == coroutine_suspended) {
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

    /* compiled from: FlowExt.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, m3636d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", m3645f = "PageFetcher.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<LoadStates, PageEvent<Value>, CombineSource, Continuation<? super Unit>, Object> {
        final /* synthetic */ SimpleChannelFlow3<PageEvent<Value>> $$this$simpleChannelFlow;
        final /* synthetic */ MutableLoadStateCollection $sourceStates$inlined;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SimpleChannelFlow3 simpleChannelFlow3, Continuation continuation, MutableLoadStateCollection mutableLoadStateCollection) {
            super(4, continuation);
            this.$sourceStates$inlined = mutableLoadStateCollection;
            this.$$this$simpleChannelFlow = simpleChannelFlow3;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(LoadStates loadStates, PageEvent<Value> pageEvent, CombineSource combineSource, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$simpleChannelFlow, continuation, this.$sourceStates$inlined);
            anonymousClass1.L$0 = loadStates;
            anonymousClass1.L$1 = pageEvent;
            anonymousClass1.L$2 = combineSource;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                CombineSource combineSource = (CombineSource) this.L$2;
                SimpleChannelFlow3<PageEvent<Value>> simpleChannelFlow3 = this.$$this$simpleChannelFlow;
                Object loadStateUpdate = (PageEvent) obj3;
                LoadStates loadStates = (LoadStates) obj2;
                if (combineSource != CombineSource.RECEIVER) {
                    if (loadStateUpdate instanceof PageEvent.Insert) {
                        PageEvent.Insert insert = (PageEvent.Insert) loadStateUpdate;
                        this.$sourceStates$inlined.set(insert.getSourceLoadStates());
                        loadStateUpdate = PageEvent.Insert.copy$default(insert, null, null, 0, 0, insert.getSourceLoadStates(), loadStates, 15, null);
                    } else if (loadStateUpdate instanceof PageEvent.Drop) {
                        this.$sourceStates$inlined.set(((PageEvent.Drop) loadStateUpdate).getLoadType(), LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                    } else if (loadStateUpdate instanceof PageEvent.LoadStateUpdate) {
                        PageEvent.LoadStateUpdate loadStateUpdate2 = (PageEvent.LoadStateUpdate) loadStateUpdate;
                        this.$sourceStates$inlined.set(loadStateUpdate2.getSource());
                        loadStateUpdate = new PageEvent.LoadStateUpdate(loadStateUpdate2.getSource(), loadStates);
                    } else {
                        if (loadStateUpdate instanceof PageEvent.StaticList) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    loadStateUpdate = new PageEvent.LoadStateUpdate(this.$sourceStates$inlined.snapshot(), loadStates);
                }
                this.label = 1;
                if (simpleChannelFlow3.send(loadStateUpdate, this) == coroutine_suspended) {
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

    /* compiled from: FlowExt.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", m3645f = "FlowExt.kt", m3646l = {147}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SimpleChannelFlow3<PageEvent<Value>> $$this$simpleChannelFlow;
        final /* synthetic */ Flow $flow;
        final /* synthetic */ AtomicInteger $incompleteFlows;
        final /* synthetic */ int $index;
        final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, AtomicInteger atomicInteger, SimpleChannelFlow3 simpleChannelFlow3, UnbatchedFlowCombiner unbatchedFlowCombiner, int i, Continuation continuation) {
            super(2, continuation);
            this.$flow = flow;
            this.$incompleteFlows = atomicInteger;
            this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
            this.$index = i;
            this.$$this$simpleChannelFlow = simpleChannelFlow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flow = this.$flow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unbatchedFlowCombiner, this.$index);
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Channel9.DefaultImpls.close$default(this.$$this$simpleChannelFlow, null, 1, null);
                }
                return Unit.INSTANCE;
            } finally {
                if (this.$incompleteFlows.decrementAndGet() == 0) {
                    Channel9.DefaultImpls.close$default(this.$$this$simpleChannelFlow, null, 1, null);
                }
            }
        }

        /* compiled from: FlowExt.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"T1", "T2", "R", "", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
        @SourceDebugExtension
        /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ int $index;
            final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner;

            /* compiled from: FlowExt.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C494801 extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;

                C494801(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(UnbatchedFlowCombiner unbatchedFlowCombiner, int i) {
                this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
                this.$index = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
            
                if (kotlinx.coroutines.Yield.yield(r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                C494801 c494801;
                if (continuation instanceof C494801) {
                    c494801 = (C494801) continuation;
                    int i = c494801.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c494801.label = i - Integer.MIN_VALUE;
                    } else {
                        c494801 = new C494801(continuation);
                    }
                }
                Object obj2 = c494801.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c494801.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    UnbatchedFlowCombiner unbatchedFlowCombiner = this.$unbatchedFlowCombiner;
                    int i3 = this.$index;
                    c494801.label = 1;
                    if (unbatchedFlowCombiner.onNext(i3, obj, c494801) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj2);
                c494801.label = 2;
            }
        }
    }
}
