package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageFetcherSnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: PageFetcherSnapshot.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", m3645f = "PageFetcherSnapshot.kt", m3646l = {646, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 657}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1, reason: use source file name */
/* loaded from: classes4.dex */
final class PageFetcherSnapshot3<Value> extends ContinuationImpl7 implements Function2<SimpleChannelFlow3<PageEvent<Value>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot3(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super PageFetcherSnapshot3> continuation) {
        super(2, continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageFetcherSnapshot3 pageFetcherSnapshot3 = new PageFetcherSnapshot3(this.this$0, continuation);
        pageFetcherSnapshot3.L$0 = obj;
        return pageFetcherSnapshot3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SimpleChannelFlow3<PageEvent<Value>> simpleChannelFlow3, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot3) create(simpleChannelFlow3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SimpleChannelFlow3 simpleChannelFlow3;
        RemoteMediatorConnection remoteMediatorConnection;
        PagingState pagingState;
        PageFetcherSnapshotState.Holder holder;
        Mutex mutex;
        SimpleChannelFlow3 simpleChannelFlow32;
        RemoteMediatorConnection remoteMediatorConnection2;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        SimpleChannelFlow3 simpleChannelFlow33;
        Mutex mutex2;
        SimpleChannelFlow3 simpleChannelFlow34;
        PageFetcherSnapshotState.Holder holder2;
        LoadState loadState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                simpleChannelFlow3 = (SimpleChannelFlow3) this.L$0;
                if (((PageFetcherSnapshot) this.this$0).pageEventChCollected.compareAndSet(false, true)) {
                    BuildersKt__Builders_commonKt.launch$default(simpleChannelFlow3, null, null, new C27572(this.this$0, simpleChannelFlow3, null), 3, null);
                    Channel channelChannel$default = Channel4.Channel$default(0, null, null, 6, null);
                    BuildersKt__Builders_commonKt.launch$default(simpleChannelFlow3, null, null, new C27583(this.this$0, channelChannel$default, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(simpleChannelFlow3, null, null, new C27594(channelChannel$default, this.this$0, null), 3, null);
                    remoteMediatorConnection = this.this$0.getRemoteMediatorConnection();
                    if (remoteMediatorConnection != null) {
                        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot2 = this.this$0;
                        pagingState = ((PageFetcherSnapshot) pageFetcherSnapshot2).previousPagingState;
                        if (pagingState == null) {
                            PageFetcherSnapshotState.Holder holder3 = ((PageFetcherSnapshot) pageFetcherSnapshot2).stateHolder;
                            Mutex mutex3 = holder3.lock;
                            this.L$0 = simpleChannelFlow3;
                            this.L$1 = remoteMediatorConnection;
                            this.L$2 = holder3;
                            this.L$3 = mutex3;
                            this.label = 1;
                            if (mutex3.lock(null, this) != coroutine_suspended) {
                                holder = holder3;
                                mutex = mutex3;
                                simpleChannelFlow32 = simpleChannelFlow3;
                                remoteMediatorConnection2 = remoteMediatorConnection;
                            }
                        }
                        remoteMediatorConnection.requestRefreshIfAllowed(pagingState);
                        pageFetcherSnapshot = this.this$0;
                        this.L$0 = simpleChannelFlow3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        if (pageFetcherSnapshot.doInitialLoad(this) != coroutine_suspended) {
                            simpleChannelFlow33 = simpleChannelFlow3;
                            PageFetcherSnapshotState.Holder holder4 = ((PageFetcherSnapshot) this.this$0).stateHolder;
                            mutex2 = holder4.lock;
                            this.L$0 = simpleChannelFlow33;
                            this.L$1 = holder4;
                            this.L$2 = mutex2;
                            this.label = 3;
                            if (mutex2.lock(null, this) != coroutine_suspended) {
                            }
                        }
                    } else {
                        pageFetcherSnapshot = this.this$0;
                        this.L$0 = simpleChannelFlow3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        if (pageFetcherSnapshot.doInitialLoad(this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?");
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex4 = (Mutex) this.L$2;
                    holder2 = (PageFetcherSnapshotState.Holder) this.L$1;
                    simpleChannelFlow34 = (SimpleChannelFlow3) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex2 = mutex4;
                    try {
                        loadState = holder2.state.getSourceLoadStates().get(LoadType.REFRESH);
                        mutex.unlock(null);
                        if (!(loadState instanceof LoadState.Error)) {
                            this.this$0.startConsumingHints(simpleChannelFlow34);
                        }
                        return Unit.INSTANCE;
                    } finally {
                    }
                }
                simpleChannelFlow33 = (SimpleChannelFlow3) this.L$0;
                ResultKt.throwOnFailure(obj);
                PageFetcherSnapshotState.Holder holder42 = ((PageFetcherSnapshot) this.this$0).stateHolder;
                mutex2 = holder42.lock;
                this.L$0 = simpleChannelFlow33;
                this.L$1 = holder42;
                this.L$2 = mutex2;
                this.label = 3;
                if (mutex2.lock(null, this) != coroutine_suspended) {
                    simpleChannelFlow34 = simpleChannelFlow33;
                    holder2 = holder42;
                    loadState = holder2.state.getSourceLoadStates().get(LoadType.REFRESH);
                    mutex.unlock(null);
                    if (!(loadState instanceof LoadState.Error)) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            mutex = (Mutex) this.L$3;
            holder = (PageFetcherSnapshotState.Holder) this.L$2;
            remoteMediatorConnection2 = (RemoteMediatorConnection) this.L$1;
            simpleChannelFlow32 = (SimpleChannelFlow3) this.L$0;
            ResultKt.throwOnFailure(obj);
            PagingState pagingStateCurrentPagingState$paging_common_release = holder.state.currentPagingState$paging_common_release(null);
            mutex.unlock(null);
            SimpleChannelFlow3 simpleChannelFlow35 = simpleChannelFlow32;
            pagingState = pagingStateCurrentPagingState$paging_common_release;
            remoteMediatorConnection = remoteMediatorConnection2;
            simpleChannelFlow3 = simpleChannelFlow35;
            remoteMediatorConnection.requestRefreshIfAllowed(pagingState);
            pageFetcherSnapshot = this.this$0;
            this.L$0 = simpleChannelFlow3;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (pageFetcherSnapshot.doInitialLoad(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", m3645f = "PageFetcherSnapshot.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 */
    static final class C27572 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SimpleChannelFlow3<PageEvent<Value>> $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27572(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, SimpleChannelFlow3<PageEvent<Value>> simpleChannelFlow3, Continuation<? super C27572> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
            this.$$this$cancelableChannelFlow = simpleChannelFlow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27572(this.this$0, this.$$this$cancelableChannelFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PageFetcherSnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/PageEvent;", "emit", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ SimpleChannelFlow3<PageEvent<Value>> $$this$cancelableChannelFlow;

            AnonymousClass1(SimpleChannelFlow3<PageEvent<Value>> simpleChannelFlow3) {
                this.$$this$cancelableChannelFlow = simpleChannelFlow3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(PageEvent<Value> pageEvent, Continuation<? super Unit> continuation) {
                PageFetcherSnapshot4 pageFetcherSnapshot4;
                if (continuation instanceof PageFetcherSnapshot4) {
                    pageFetcherSnapshot4 = (PageFetcherSnapshot4) continuation;
                    int i = pageFetcherSnapshot4.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot4.label = i - Integer.MIN_VALUE;
                    } else {
                        pageFetcherSnapshot4 = new PageFetcherSnapshot4(this, continuation);
                    }
                }
                Object obj = pageFetcherSnapshot4.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = pageFetcherSnapshot4.label;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        SimpleChannelFlow3<PageEvent<Value>> simpleChannelFlow3 = this.$$this$cancelableChannelFlow;
                        pageFetcherSnapshot4.label = 1;
                        if (simpleChannelFlow3.send(pageEvent, pageFetcherSnapshot4) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Channel7 unused) {
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((PageEvent) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(((PageFetcherSnapshot) this.this$0).pageEventCh);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$cancelableChannelFlow);
                this.label = 1;
                if (flowConsumeAsFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", m3645f = "PageFetcherSnapshot.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 */
    static final class C27583 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $retryChannel;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27583(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Channel<Unit> channel, Continuation<? super C27583> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
            this.$retryChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27583(this.this$0, this.$retryChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27583) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = ((PageFetcherSnapshot) this.this$0).retryFlow;
                final Channel<Unit> channel = this.$retryChannel;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.paging.PageFetcherSnapshot.pageEventFlow.1.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Unit) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        channel.mo8337trySendJP2dKIU(unit);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", m3645f = "PageFetcherSnapshot.kt", m3646l = {110}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 */
    static final class C27594 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Unit> $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27594(Channel<Unit> channel, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C27594> continuation) {
            super(2, continuation);
            this.$retryChannel = channel;
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27594 c27594 = new C27594(this.$retryChannel, this.this$0, continuation);
            c27594.L$0 = obj;
            return c27594;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27594) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.$retryChannel);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope);
                this.label = 1;
                if (flowConsumeAsFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PageFetcherSnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            /* compiled from: PageFetcherSnapshot.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[LoadType.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            AnonymousClass1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, CoroutineScope coroutineScope) {
                this.this$0 = pageFetcherSnapshot;
                this.$$this$launch = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Unit) obj, (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:121:0x040a, code lost:
            
                if (r1.lock(null, r13) == r0) goto L168;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x02f6, code lost:
            
                if (r1.lock(null, r13) == r0) goto L168;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:107:0x038d  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0391  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x03e8  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x03f0  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0434 A[PHI: r1 r4 r14
              0x0434: PHI (r1v53 androidx.paging.LoadStates) = (r1v28 androidx.paging.LoadStates), (r1v60 androidx.paging.LoadStates) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]
              0x0434: PHI (r4v52 kotlinx.coroutines.CoroutineScope) = (r4v26 kotlinx.coroutines.CoroutineScope), (r4v55 kotlinx.coroutines.CoroutineScope) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]
              0x0434: PHI (r14v51 androidx.paging.PageFetcherSnapshot) = (r14v28 androidx.paging.PageFetcherSnapshot), (r14v52 androidx.paging.PageFetcherSnapshot) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:136:0x043e  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x047c  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x047e  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x049a  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x049e  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x04f1  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x04f6  */
            /* JADX WARN: Removed duplicated region for block: B:173:0x0529  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x025b  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x026e  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x027c  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0280  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x02d5  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x02dd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x032a  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x036d  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x036f  */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v14, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v39, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v68, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v86 */
            /* JADX WARN: Type inference failed for: r1v87 */
            /* JADX WARN: Type inference failed for: r1v89 */
            /* JADX WARN: Type inference failed for: r1v90 */
            /* JADX WARN: Type inference failed for: r1v92 */
            /* JADX WARN: Type inference failed for: r1v93 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                PageFetcherSnapshot5 pageFetcherSnapshot5;
                PageFetcherSnapshotState.Holder holder;
                PageFetcherSnapshot pageFetcherSnapshot;
                Mutex mutex;
                AnonymousClass1<T> anonymousClass1;
                LoadStates loadStates;
                RemoteMediatorConnection remoteMediatorConnection;
                PageFetcherSnapshot pageFetcherSnapshot2;
                CoroutineScope coroutineScope;
                LoadStates loadStates2;
                CoroutineScope coroutineScope2;
                LoadType loadType;
                PageFetcherSnapshot pageFetcherSnapshot3;
                CoroutineScope coroutineScope3;
                PageFetcherSnapshot pageFetcherSnapshot4;
                LoadStates loadStates3;
                PageFetcherSnapshotState.Holder holder2;
                Mutex mutex2;
                PageFetcherSnapshot pageFetcherSnapshot6;
                LoadType loadType2;
                PageFetcherSnapshot pageFetcherSnapshot7;
                ViewportHint viewportHint;
                LoadType loadType3;
                PageFetcherSnapshot pageFetcherSnapshot8;
                LoadType loadType4;
                CoroutineScope coroutineScope4;
                LoadStates loadStates4;
                PageFetcherSnapshotState.Holder holder3;
                Mutex mutex3;
                LoadType loadType5;
                LoadStates loadStates5;
                CoroutineScope coroutineScope5;
                LoadType loadType6;
                PageFetcherSnapshot pageFetcherSnapshot9;
                LoadStates loadStates6;
                Mutex mutex4;
                CoroutineScope coroutineScope6;
                PageFetcherSnapshotState.Holder holder4;
                PageFetcherSnapshotState pageFetcherSnapshotState;
                CoroutineScope coroutineScope7;
                PageFetcherSnapshot pageFetcherSnapshot10;
                PageFetcherSnapshotState.Holder holder5;
                Mutex mutex5;
                PageFetcherSnapshot pageFetcherSnapshot11;
                LoadType loadType7;
                PageFetcherSnapshot pageFetcherSnapshot12;
                ViewportHint viewportHint2;
                LoadType loadType8;
                PageFetcherSnapshot pageFetcherSnapshot13;
                LoadType loadType9;
                CoroutineScope coroutineScope8;
                LoadStates loadStates7;
                PageFetcherSnapshotState.Holder holder6;
                Mutex mutex6;
                LoadType loadType10;
                PageFetcherSnapshot pageFetcherSnapshot14;
                CoroutineScope coroutineScope9;
                LoadType loadType11;
                PageFetcherSnapshotState.Holder holder7;
                Mutex mutex7;
                CoroutineScope coroutineScope10;
                PageFetcherSnapshotState pageFetcherSnapshotState2;
                CoroutineScope coroutineScope11;
                PageFetcherSnapshot pageFetcherSnapshot15;
                PageFetcherSnapshotState.Holder holder8;
                PageFetcherSnapshot pageFetcherSnapshot16;
                LoadType loadType12;
                LoadType loadType13;
                Mutex mutex8;
                PageFetcherSnapshot pageFetcherSnapshot17;
                ViewportHint viewportHint3;
                LoadType loadType14;
                CoroutineScope coroutineScope12;
                PageFetcherSnapshot pageFetcherSnapshot18;
                Mutex mutex9;
                PageFetcherSnapshotState.Holder holder9;
                LoadState loadState;
                if (continuation instanceof PageFetcherSnapshot5) {
                    pageFetcherSnapshot5 = (PageFetcherSnapshot5) continuation;
                    int i = pageFetcherSnapshot5.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot5.label = i - Integer.MIN_VALUE;
                    } else {
                        pageFetcherSnapshot5 = new PageFetcherSnapshot5(this, continuation);
                    }
                }
                Object obj = pageFetcherSnapshot5.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ?? r1 = pageFetcherSnapshot5.label;
                try {
                    try {
                        try {
                            switch (r1) {
                                case 0:
                                    ResultKt.throwOnFailure(obj);
                                    holder = this.this$0.stateHolder;
                                    pageFetcherSnapshot = this.this$0;
                                    mutex = holder.lock;
                                    pageFetcherSnapshot5.L$0 = this;
                                    pageFetcherSnapshot5.L$1 = holder;
                                    pageFetcherSnapshot5.L$2 = pageFetcherSnapshot;
                                    pageFetcherSnapshot5.L$3 = mutex;
                                    pageFetcherSnapshot5.label = 1;
                                    if (mutex.lock(null, pageFetcherSnapshot5) != coroutine_suspended) {
                                        anonymousClass1 = this;
                                        try {
                                            PageFetcherSnapshotState pageFetcherSnapshotState3 = holder.state;
                                            Tuples2 tuples2M3642to = Tuples4.m3642to(pageFetcherSnapshotState3.getSourceLoadStates().snapshot(), pageFetcherSnapshotState3.currentPagingState$paging_common_release(pageFetcherSnapshot.hintHandler.getLastAccessHint()));
                                            mutex.unlock(null);
                                            loadStates = (LoadStates) tuples2M3642to.component1();
                                            PagingState pagingState = (PagingState) tuples2M3642to.component2();
                                            remoteMediatorConnection = anonymousClass1.this$0.getRemoteMediatorConnection();
                                            if (remoteMediatorConnection != null) {
                                                remoteMediatorConnection.retryFailed(pagingState);
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            pageFetcherSnapshot2 = anonymousClass1.this$0;
                                            coroutineScope = anonymousClass1.$$this$launch;
                                            LoadType loadType15 = LoadType.REFRESH;
                                            if (loadStates.getRefresh() instanceof LoadState.Error) {
                                                loadStates2 = loadStates;
                                                coroutineScope2 = coroutineScope;
                                                loadType = loadType15;
                                                pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                                if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
                                                    pageFetcherSnapshot7 = pageFetcherSnapshot3;
                                                    viewportHint = null;
                                                    loadType3 = loadType;
                                                    pageFetcherSnapshot5.L$0 = loadStates2;
                                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot3;
                                                    pageFetcherSnapshot5.L$2 = coroutineScope2;
                                                    pageFetcherSnapshot5.L$3 = loadType;
                                                    pageFetcherSnapshot5.L$4 = null;
                                                    pageFetcherSnapshot5.L$5 = null;
                                                    pageFetcherSnapshot5.L$6 = null;
                                                    pageFetcherSnapshot5.L$7 = null;
                                                    pageFetcherSnapshot5.label = 5;
                                                    if (pageFetcherSnapshot7.retryLoadError(loadType3, viewportHint, pageFetcherSnapshot5) != coroutine_suspended) {
                                                        pageFetcherSnapshot8 = pageFetcherSnapshot3;
                                                        loadType4 = loadType;
                                                        coroutineScope4 = coroutineScope2;
                                                        loadStates4 = loadStates2;
                                                        if (loadType4 == LoadType.REFRESH) {
                                                            holder3 = pageFetcherSnapshot8.stateHolder;
                                                            mutex3 = holder3.lock;
                                                            pageFetcherSnapshot5.L$0 = loadStates4;
                                                            pageFetcherSnapshot5.L$1 = pageFetcherSnapshot8;
                                                            pageFetcherSnapshot5.L$2 = coroutineScope4;
                                                            pageFetcherSnapshot5.L$3 = holder3;
                                                            pageFetcherSnapshot5.L$4 = mutex3;
                                                            pageFetcherSnapshot5.label = 6;
                                                            break;
                                                        }
                                                        coroutineScope = coroutineScope4;
                                                        pageFetcherSnapshot2 = pageFetcherSnapshot8;
                                                        loadStates = loadStates4;
                                                    }
                                                } else {
                                                    holder2 = pageFetcherSnapshot3.stateHolder;
                                                    mutex2 = holder2.lock;
                                                    pageFetcherSnapshot5.L$0 = loadStates2;
                                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot3;
                                                    pageFetcherSnapshot5.L$2 = coroutineScope2;
                                                    pageFetcherSnapshot5.L$3 = loadType;
                                                    pageFetcherSnapshot5.L$4 = holder2;
                                                    pageFetcherSnapshot5.L$5 = mutex2;
                                                    pageFetcherSnapshot5.L$6 = loadType;
                                                    pageFetcherSnapshot5.L$7 = pageFetcherSnapshot3;
                                                    pageFetcherSnapshot5.label = 4;
                                                    if (mutex2.lock(null, pageFetcherSnapshot5) != coroutine_suspended) {
                                                        pageFetcherSnapshot6 = pageFetcherSnapshot3;
                                                        loadType2 = loadType;
                                                        try {
                                                            viewportHint = holder2.state.getFailedHintsByLoadType$paging_common_release().get(loadType2);
                                                            mutex2.unlock(null);
                                                            pageFetcherSnapshot7 = pageFetcherSnapshot3;
                                                            loadType3 = loadType;
                                                            loadType = loadType2;
                                                            pageFetcherSnapshot3 = pageFetcherSnapshot6;
                                                            pageFetcherSnapshot5.L$0 = loadStates2;
                                                            pageFetcherSnapshot5.L$1 = pageFetcherSnapshot3;
                                                            pageFetcherSnapshot5.L$2 = coroutineScope2;
                                                            pageFetcherSnapshot5.L$3 = loadType;
                                                            pageFetcherSnapshot5.L$4 = null;
                                                            pageFetcherSnapshot5.L$5 = null;
                                                            pageFetcherSnapshot5.L$6 = null;
                                                            pageFetcherSnapshot5.L$7 = null;
                                                            pageFetcherSnapshot5.label = 5;
                                                            if (pageFetcherSnapshot7.retryLoadError(loadType3, viewportHint, pageFetcherSnapshot5) != coroutine_suspended) {
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            }
                                            loadType5 = LoadType.PREPEND;
                                            if (!(loadStates.getPrepend() instanceof LoadState.Error)) {
                                                loadType10 = LoadType.APPEND;
                                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                                    if (loadType10 != LoadType.REFRESH) {
                                                        PageFetcherSnapshotState.Holder holder10 = pageFetcherSnapshot2.stateHolder;
                                                        Mutex mutex10 = holder10.lock;
                                                        pageFetcherSnapshot5.L$0 = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot5.L$1 = coroutineScope;
                                                        pageFetcherSnapshot5.L$2 = loadType10;
                                                        pageFetcherSnapshot5.L$3 = holder10;
                                                        pageFetcherSnapshot5.L$4 = mutex10;
                                                        pageFetcherSnapshot5.label = 12;
                                                        if (mutex10.lock(null, pageFetcherSnapshot5) != coroutine_suspended) {
                                                            CoroutineScope coroutineScope13 = coroutineScope;
                                                            holder7 = holder10;
                                                            mutex7 = mutex10;
                                                            coroutineScope10 = coroutineScope13;
                                                            pageFetcherSnapshotState2 = holder7.state;
                                                            pageFetcherSnapshot5.L$0 = pageFetcherSnapshot2;
                                                            pageFetcherSnapshot5.L$1 = coroutineScope10;
                                                            pageFetcherSnapshot5.L$2 = loadType10;
                                                            pageFetcherSnapshot5.L$3 = mutex7;
                                                            pageFetcherSnapshot5.L$4 = null;
                                                            pageFetcherSnapshot5.label = 13;
                                                            if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState2, loadType10, pageFetcherSnapshot5) == coroutine_suspended) {
                                                                loadType11 = loadType10;
                                                                coroutineScope11 = coroutineScope10;
                                                                pageFetcherSnapshot15 = pageFetcherSnapshot2;
                                                                r1 = mutex7;
                                                                Unit unit3 = Unit.INSTANCE;
                                                                r1.unlock(null);
                                                                coroutineScope9 = coroutineScope11;
                                                                pageFetcherSnapshot14 = pageFetcherSnapshot15;
                                                                if (WhenMappings.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                                    pageFetcherSnapshot17 = pageFetcherSnapshot14;
                                                                    viewportHint3 = null;
                                                                    loadType14 = loadType11;
                                                                    pageFetcherSnapshot5.L$0 = pageFetcherSnapshot14;
                                                                    pageFetcherSnapshot5.L$1 = coroutineScope9;
                                                                    pageFetcherSnapshot5.L$2 = loadType11;
                                                                    pageFetcherSnapshot5.L$3 = null;
                                                                    pageFetcherSnapshot5.L$4 = null;
                                                                    pageFetcherSnapshot5.L$5 = null;
                                                                    pageFetcherSnapshot5.L$6 = null;
                                                                    pageFetcherSnapshot5.label = 15;
                                                                    if (pageFetcherSnapshot17.retryLoadError(loadType14, viewportHint3, pageFetcherSnapshot5) != coroutine_suspended) {
                                                                        coroutineScope12 = coroutineScope9;
                                                                        if (loadType11 == LoadType.REFRESH) {
                                                                            PageFetcherSnapshotState.Holder holder11 = pageFetcherSnapshot14.stateHolder;
                                                                            Mutex mutex11 = holder11.lock;
                                                                            pageFetcherSnapshot5.L$0 = pageFetcherSnapshot14;
                                                                            pageFetcherSnapshot5.L$1 = coroutineScope12;
                                                                            pageFetcherSnapshot5.L$2 = holder11;
                                                                            pageFetcherSnapshot5.L$3 = mutex11;
                                                                            pageFetcherSnapshot5.label = 16;
                                                                            if (mutex11.lock(null, pageFetcherSnapshot5) != coroutine_suspended) {
                                                                                pageFetcherSnapshot18 = pageFetcherSnapshot14;
                                                                                mutex9 = mutex11;
                                                                                holder9 = holder11;
                                                                                try {
                                                                                    loadState = holder9.state.getSourceLoadStates().get(LoadType.REFRESH);
                                                                                    mutex9.unlock(null);
                                                                                    if (!(loadState instanceof LoadState.Error)) {
                                                                                        pageFetcherSnapshot18.startConsumingHints(coroutineScope12);
                                                                                    }
                                                                                } finally {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    holder8 = pageFetcherSnapshot14.stateHolder;
                                                                    Mutex mutex12 = holder8.lock;
                                                                    pageFetcherSnapshot5.L$0 = pageFetcherSnapshot14;
                                                                    pageFetcherSnapshot5.L$1 = coroutineScope9;
                                                                    pageFetcherSnapshot5.L$2 = loadType11;
                                                                    pageFetcherSnapshot5.L$3 = holder8;
                                                                    pageFetcherSnapshot5.L$4 = mutex12;
                                                                    pageFetcherSnapshot5.L$5 = loadType11;
                                                                    pageFetcherSnapshot5.L$6 = pageFetcherSnapshot14;
                                                                    pageFetcherSnapshot5.label = 14;
                                                                    if (mutex12.lock(null, pageFetcherSnapshot5) != coroutine_suspended) {
                                                                        pageFetcherSnapshot16 = pageFetcherSnapshot14;
                                                                        loadType12 = loadType11;
                                                                        loadType13 = loadType12;
                                                                        mutex8 = mutex12;
                                                                        try {
                                                                            viewportHint3 = holder8.state.getFailedHintsByLoadType$paging_common_release().get(loadType13);
                                                                            mutex8.unlock(null);
                                                                            loadType14 = loadType12;
                                                                            loadType11 = loadType13;
                                                                            pageFetcherSnapshot17 = pageFetcherSnapshot14;
                                                                            pageFetcherSnapshot14 = pageFetcherSnapshot16;
                                                                            pageFetcherSnapshot5.L$0 = pageFetcherSnapshot14;
                                                                            pageFetcherSnapshot5.L$1 = coroutineScope9;
                                                                            pageFetcherSnapshot5.L$2 = loadType11;
                                                                            pageFetcherSnapshot5.L$3 = null;
                                                                            pageFetcherSnapshot5.L$4 = null;
                                                                            pageFetcherSnapshot5.L$5 = null;
                                                                            pageFetcherSnapshot5.L$6 = null;
                                                                            pageFetcherSnapshot5.label = 15;
                                                                            if (pageFetcherSnapshot17.retryLoadError(loadType14, viewportHint3, pageFetcherSnapshot5) != coroutine_suspended) {
                                                                            }
                                                                        } finally {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        pageFetcherSnapshot14 = pageFetcherSnapshot2;
                                                        coroutineScope9 = coroutineScope;
                                                        loadType11 = loadType10;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            if (loadType5 != LoadType.REFRESH) {
                                                PageFetcherSnapshotState.Holder holder12 = pageFetcherSnapshot2.stateHolder;
                                                Mutex mutex13 = holder12.lock;
                                                pageFetcherSnapshot5.L$0 = loadStates;
                                                pageFetcherSnapshot5.L$1 = pageFetcherSnapshot2;
                                                pageFetcherSnapshot5.L$2 = coroutineScope;
                                                pageFetcherSnapshot5.L$3 = loadType5;
                                                pageFetcherSnapshot5.L$4 = holder12;
                                                pageFetcherSnapshot5.L$5 = mutex13;
                                                pageFetcherSnapshot5.label = 7;
                                                if (mutex13.lock(null, pageFetcherSnapshot5) != coroutine_suspended) {
                                                    loadStates6 = loadStates;
                                                    mutex4 = mutex13;
                                                    coroutineScope6 = coroutineScope;
                                                    holder4 = holder12;
                                                    pageFetcherSnapshotState = holder4.state;
                                                    pageFetcherSnapshot5.L$0 = loadStates6;
                                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot2;
                                                    pageFetcherSnapshot5.L$2 = coroutineScope6;
                                                    pageFetcherSnapshot5.L$3 = loadType5;
                                                    pageFetcherSnapshot5.L$4 = mutex4;
                                                    pageFetcherSnapshot5.L$5 = null;
                                                    pageFetcherSnapshot5.label = 8;
                                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType5, pageFetcherSnapshot5) == coroutine_suspended) {
                                                        loadType6 = loadType5;
                                                        coroutineScope7 = coroutineScope6;
                                                        pageFetcherSnapshot10 = pageFetcherSnapshot2;
                                                        r1 = mutex4;
                                                        Unit unit4 = Unit.INSTANCE;
                                                        r1.unlock(null);
                                                        coroutineScope5 = coroutineScope7;
                                                        pageFetcherSnapshot9 = pageFetcherSnapshot10;
                                                        loadStates5 = loadStates6;
                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType6.ordinal()] == 1) {
                                                            pageFetcherSnapshot12 = pageFetcherSnapshot9;
                                                            viewportHint2 = null;
                                                            loadType8 = loadType6;
                                                            pageFetcherSnapshot5.L$0 = loadStates5;
                                                            pageFetcherSnapshot5.L$1 = pageFetcherSnapshot9;
                                                            pageFetcherSnapshot5.L$2 = coroutineScope5;
                                                            pageFetcherSnapshot5.L$3 = loadType6;
                                                            pageFetcherSnapshot5.L$4 = null;
                                                            pageFetcherSnapshot5.L$5 = null;
                                                            pageFetcherSnapshot5.L$6 = null;
                                                            pageFetcherSnapshot5.L$7 = null;
                                                            pageFetcherSnapshot5.label = 10;
                                                            if (pageFetcherSnapshot12.retryLoadError(loadType8, viewportHint2, pageFetcherSnapshot5) != coroutine_suspended) {
                                                                pageFetcherSnapshot13 = pageFetcherSnapshot9;
                                                                loadType9 = loadType6;
                                                                coroutineScope8 = coroutineScope5;
                                                                loadStates7 = loadStates5;
                                                                if (loadType9 == LoadType.REFRESH) {
                                                                    holder6 = pageFetcherSnapshot13.stateHolder;
                                                                    mutex6 = holder6.lock;
                                                                    pageFetcherSnapshot5.L$0 = loadStates7;
                                                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot13;
                                                                    pageFetcherSnapshot5.L$2 = coroutineScope8;
                                                                    pageFetcherSnapshot5.L$3 = holder6;
                                                                    pageFetcherSnapshot5.L$4 = mutex6;
                                                                    pageFetcherSnapshot5.label = 11;
                                                                    break;
                                                                }
                                                                coroutineScope = coroutineScope8;
                                                                pageFetcherSnapshot2 = pageFetcherSnapshot13;
                                                                loadStates = loadStates7;
                                                                loadType10 = LoadType.APPEND;
                                                                if (loadStates.getAppend() instanceof LoadState.Error) {
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        } else {
                                                            holder5 = pageFetcherSnapshot9.stateHolder;
                                                            mutex5 = holder5.lock;
                                                            pageFetcherSnapshot5.L$0 = loadStates5;
                                                            pageFetcherSnapshot5.L$1 = pageFetcherSnapshot9;
                                                            pageFetcherSnapshot5.L$2 = coroutineScope5;
                                                            pageFetcherSnapshot5.L$3 = loadType6;
                                                            pageFetcherSnapshot5.L$4 = holder5;
                                                            pageFetcherSnapshot5.L$5 = mutex5;
                                                            pageFetcherSnapshot5.L$6 = loadType6;
                                                            pageFetcherSnapshot5.L$7 = pageFetcherSnapshot9;
                                                            pageFetcherSnapshot5.label = 9;
                                                            if (mutex5.lock(null, pageFetcherSnapshot5) != coroutine_suspended) {
                                                                pageFetcherSnapshot11 = pageFetcherSnapshot9;
                                                                loadType7 = loadType6;
                                                                try {
                                                                    viewportHint2 = holder5.state.getFailedHintsByLoadType$paging_common_release().get(loadType7);
                                                                    mutex5.unlock(null);
                                                                    pageFetcherSnapshot12 = pageFetcherSnapshot9;
                                                                    loadType8 = loadType6;
                                                                    loadType6 = loadType7;
                                                                    pageFetcherSnapshot9 = pageFetcherSnapshot11;
                                                                    pageFetcherSnapshot5.L$0 = loadStates5;
                                                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot9;
                                                                    pageFetcherSnapshot5.L$2 = coroutineScope5;
                                                                    pageFetcherSnapshot5.L$3 = loadType6;
                                                                    pageFetcherSnapshot5.L$4 = null;
                                                                    pageFetcherSnapshot5.L$5 = null;
                                                                    pageFetcherSnapshot5.L$6 = null;
                                                                    pageFetcherSnapshot5.L$7 = null;
                                                                    pageFetcherSnapshot5.label = 10;
                                                                    if (pageFetcherSnapshot12.retryLoadError(loadType8, viewportHint2, pageFetcherSnapshot5) != coroutine_suspended) {
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                loadStates5 = loadStates;
                                                coroutineScope5 = coroutineScope;
                                                loadType6 = loadType5;
                                                pageFetcherSnapshot9 = pageFetcherSnapshot2;
                                                if (WhenMappings.$EnumSwitchMapping$0[loadType6.ordinal()] == 1) {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    return coroutine_suspended;
                                case 1:
                                    mutex = (Mutex) pageFetcherSnapshot5.L$3;
                                    pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot5.L$2;
                                    holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$1;
                                    anonymousClass1 = (AnonymousClass1) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    PageFetcherSnapshotState pageFetcherSnapshotState32 = holder.state;
                                    Tuples2 tuples2M3642to2 = Tuples4.m3642to(pageFetcherSnapshotState32.getSourceLoadStates().snapshot(), pageFetcherSnapshotState32.currentPagingState$paging_common_release(pageFetcherSnapshot.hintHandler.getLastAccessHint()));
                                    mutex.unlock(null);
                                    loadStates = (LoadStates) tuples2M3642to2.component1();
                                    PagingState pagingState2 = (PagingState) tuples2M3642to2.component2();
                                    remoteMediatorConnection = anonymousClass1.this$0.getRemoteMediatorConnection();
                                    if (remoteMediatorConnection != null) {
                                    }
                                    pageFetcherSnapshot2 = anonymousClass1.this$0;
                                    coroutineScope = anonymousClass1.$$this$launch;
                                    LoadType loadType152 = LoadType.REFRESH;
                                    if (loadStates.getRefresh() instanceof LoadState.Error) {
                                    }
                                    loadType5 = LoadType.PREPEND;
                                    if (!(loadStates.getPrepend() instanceof LoadState.Error)) {
                                    }
                                    return coroutine_suspended;
                                case 2:
                                    Mutex mutex14 = (Mutex) pageFetcherSnapshot5.L$5;
                                    PageFetcherSnapshotState.Holder holder13 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$4;
                                    LoadType loadType16 = (LoadType) pageFetcherSnapshot5.L$3;
                                    CoroutineScope coroutineScope14 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    PageFetcherSnapshot pageFetcherSnapshot19 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    LoadStates loadStates8 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    PageFetcherSnapshotState pageFetcherSnapshotState4 = holder13.state;
                                    pageFetcherSnapshot5.L$0 = loadStates8;
                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot19;
                                    pageFetcherSnapshot5.L$2 = coroutineScope14;
                                    pageFetcherSnapshot5.L$3 = loadType16;
                                    pageFetcherSnapshot5.L$4 = mutex14;
                                    pageFetcherSnapshot5.L$5 = null;
                                    pageFetcherSnapshot5.label = 3;
                                    if (pageFetcherSnapshot19.setLoading(pageFetcherSnapshotState4, loadType16, pageFetcherSnapshot5) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    loadType = loadType16;
                                    coroutineScope3 = coroutineScope14;
                                    pageFetcherSnapshot4 = pageFetcherSnapshot19;
                                    loadStates3 = loadStates8;
                                    r1 = mutex14;
                                    Unit unit5 = Unit.INSTANCE;
                                    r1.unlock(null);
                                    coroutineScope2 = coroutineScope3;
                                    pageFetcherSnapshot3 = pageFetcherSnapshot4;
                                    loadStates2 = loadStates3;
                                    if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
                                    }
                                    break;
                                case 3:
                                    Mutex mutex15 = (Mutex) pageFetcherSnapshot5.L$4;
                                    loadType = (LoadType) pageFetcherSnapshot5.L$3;
                                    coroutineScope3 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    loadStates3 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    r1 = mutex15;
                                    Unit unit52 = Unit.INSTANCE;
                                    r1.unlock(null);
                                    coroutineScope2 = coroutineScope3;
                                    pageFetcherSnapshot3 = pageFetcherSnapshot4;
                                    loadStates2 = loadStates3;
                                    if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
                                    }
                                    break;
                                case 4:
                                    pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$7;
                                    loadType = (LoadType) pageFetcherSnapshot5.L$6;
                                    mutex2 = (Mutex) pageFetcherSnapshot5.L$5;
                                    holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$4;
                                    loadType2 = (LoadType) pageFetcherSnapshot5.L$3;
                                    coroutineScope2 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    pageFetcherSnapshot6 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    loadStates2 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    viewportHint = holder2.state.getFailedHintsByLoadType$paging_common_release().get(loadType2);
                                    mutex2.unlock(null);
                                    pageFetcherSnapshot7 = pageFetcherSnapshot3;
                                    loadType3 = loadType;
                                    loadType = loadType2;
                                    pageFetcherSnapshot3 = pageFetcherSnapshot6;
                                    pageFetcherSnapshot5.L$0 = loadStates2;
                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot3;
                                    pageFetcherSnapshot5.L$2 = coroutineScope2;
                                    pageFetcherSnapshot5.L$3 = loadType;
                                    pageFetcherSnapshot5.L$4 = null;
                                    pageFetcherSnapshot5.L$5 = null;
                                    pageFetcherSnapshot5.L$6 = null;
                                    pageFetcherSnapshot5.L$7 = null;
                                    pageFetcherSnapshot5.label = 5;
                                    if (pageFetcherSnapshot7.retryLoadError(loadType3, viewportHint, pageFetcherSnapshot5) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                case 5:
                                    loadType4 = (LoadType) pageFetcherSnapshot5.L$3;
                                    CoroutineScope coroutineScope15 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    PageFetcherSnapshot pageFetcherSnapshot20 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    LoadStates loadStates9 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    loadStates4 = loadStates9;
                                    pageFetcherSnapshot8 = pageFetcherSnapshot20;
                                    coroutineScope4 = coroutineScope15;
                                    if (loadType4 == LoadType.REFRESH) {
                                    }
                                    coroutineScope = coroutineScope4;
                                    pageFetcherSnapshot2 = pageFetcherSnapshot8;
                                    loadStates = loadStates4;
                                    loadType5 = LoadType.PREPEND;
                                    if (!(loadStates.getPrepend() instanceof LoadState.Error)) {
                                    }
                                    return coroutine_suspended;
                                case 6:
                                    mutex3 = (Mutex) pageFetcherSnapshot5.L$4;
                                    holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$3;
                                    coroutineScope4 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    pageFetcherSnapshot8 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    loadStates4 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    try {
                                        LoadState loadState2 = holder3.state.getSourceLoadStates().get(LoadType.REFRESH);
                                        mutex3.unlock(null);
                                        if (!(loadState2 instanceof LoadState.Error)) {
                                            pageFetcherSnapshot8.startConsumingHints(coroutineScope4);
                                        }
                                        coroutineScope = coroutineScope4;
                                        pageFetcherSnapshot2 = pageFetcherSnapshot8;
                                        loadStates = loadStates4;
                                        loadType5 = LoadType.PREPEND;
                                        if (!(loadStates.getPrepend() instanceof LoadState.Error)) {
                                        }
                                        return coroutine_suspended;
                                    } finally {
                                    }
                                case 7:
                                    Mutex mutex16 = (Mutex) pageFetcherSnapshot5.L$5;
                                    holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$4;
                                    loadType5 = (LoadType) pageFetcherSnapshot5.L$3;
                                    coroutineScope6 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    PageFetcherSnapshot pageFetcherSnapshot21 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    LoadStates loadStates10 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    pageFetcherSnapshot2 = pageFetcherSnapshot21;
                                    loadStates6 = loadStates10;
                                    mutex4 = mutex16;
                                    pageFetcherSnapshotState = holder4.state;
                                    pageFetcherSnapshot5.L$0 = loadStates6;
                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot2;
                                    pageFetcherSnapshot5.L$2 = coroutineScope6;
                                    pageFetcherSnapshot5.L$3 = loadType5;
                                    pageFetcherSnapshot5.L$4 = mutex4;
                                    pageFetcherSnapshot5.L$5 = null;
                                    pageFetcherSnapshot5.label = 8;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState, loadType5, pageFetcherSnapshot5) == coroutine_suspended) {
                                    }
                                    break;
                                case 8:
                                    Mutex mutex17 = (Mutex) pageFetcherSnapshot5.L$4;
                                    loadType6 = (LoadType) pageFetcherSnapshot5.L$3;
                                    coroutineScope7 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    pageFetcherSnapshot10 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    loadStates6 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    r1 = mutex17;
                                    Unit unit42 = Unit.INSTANCE;
                                    r1.unlock(null);
                                    coroutineScope5 = coroutineScope7;
                                    pageFetcherSnapshot9 = pageFetcherSnapshot10;
                                    loadStates5 = loadStates6;
                                    if (WhenMappings.$EnumSwitchMapping$0[loadType6.ordinal()] == 1) {
                                    }
                                    break;
                                case 9:
                                    pageFetcherSnapshot9 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$7;
                                    loadType6 = (LoadType) pageFetcherSnapshot5.L$6;
                                    mutex5 = (Mutex) pageFetcherSnapshot5.L$5;
                                    holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$4;
                                    loadType7 = (LoadType) pageFetcherSnapshot5.L$3;
                                    coroutineScope5 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    pageFetcherSnapshot11 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    loadStates5 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    viewportHint2 = holder5.state.getFailedHintsByLoadType$paging_common_release().get(loadType7);
                                    mutex5.unlock(null);
                                    pageFetcherSnapshot12 = pageFetcherSnapshot9;
                                    loadType8 = loadType6;
                                    loadType6 = loadType7;
                                    pageFetcherSnapshot9 = pageFetcherSnapshot11;
                                    pageFetcherSnapshot5.L$0 = loadStates5;
                                    pageFetcherSnapshot5.L$1 = pageFetcherSnapshot9;
                                    pageFetcherSnapshot5.L$2 = coroutineScope5;
                                    pageFetcherSnapshot5.L$3 = loadType6;
                                    pageFetcherSnapshot5.L$4 = null;
                                    pageFetcherSnapshot5.L$5 = null;
                                    pageFetcherSnapshot5.L$6 = null;
                                    pageFetcherSnapshot5.L$7 = null;
                                    pageFetcherSnapshot5.label = 10;
                                    if (pageFetcherSnapshot12.retryLoadError(loadType8, viewportHint2, pageFetcherSnapshot5) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                case 10:
                                    loadType9 = (LoadType) pageFetcherSnapshot5.L$3;
                                    CoroutineScope coroutineScope16 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    PageFetcherSnapshot pageFetcherSnapshot22 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    LoadStates loadStates11 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    loadStates7 = loadStates11;
                                    pageFetcherSnapshot13 = pageFetcherSnapshot22;
                                    coroutineScope8 = coroutineScope16;
                                    if (loadType9 == LoadType.REFRESH) {
                                    }
                                    coroutineScope = coroutineScope8;
                                    pageFetcherSnapshot2 = pageFetcherSnapshot13;
                                    loadStates = loadStates7;
                                    loadType10 = LoadType.APPEND;
                                    if (loadStates.getAppend() instanceof LoadState.Error) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    mutex6 = (Mutex) pageFetcherSnapshot5.L$4;
                                    holder6 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$3;
                                    coroutineScope8 = (CoroutineScope) pageFetcherSnapshot5.L$2;
                                    pageFetcherSnapshot13 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$1;
                                    loadStates7 = (LoadStates) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    try {
                                        LoadState loadState3 = holder6.state.getSourceLoadStates().get(LoadType.REFRESH);
                                        mutex6.unlock(null);
                                        if (!(loadState3 instanceof LoadState.Error)) {
                                            pageFetcherSnapshot13.startConsumingHints(coroutineScope8);
                                        }
                                        coroutineScope = coroutineScope8;
                                        pageFetcherSnapshot2 = pageFetcherSnapshot13;
                                        loadStates = loadStates7;
                                        loadType10 = LoadType.APPEND;
                                        if (loadStates.getAppend() instanceof LoadState.Error) {
                                        }
                                        return Unit.INSTANCE;
                                    } finally {
                                    }
                                case 12:
                                    Mutex mutex18 = (Mutex) pageFetcherSnapshot5.L$4;
                                    holder7 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$3;
                                    loadType10 = (LoadType) pageFetcherSnapshot5.L$2;
                                    coroutineScope10 = (CoroutineScope) pageFetcherSnapshot5.L$1;
                                    PageFetcherSnapshot pageFetcherSnapshot23 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    pageFetcherSnapshot2 = pageFetcherSnapshot23;
                                    mutex7 = mutex18;
                                    pageFetcherSnapshotState2 = holder7.state;
                                    pageFetcherSnapshot5.L$0 = pageFetcherSnapshot2;
                                    pageFetcherSnapshot5.L$1 = coroutineScope10;
                                    pageFetcherSnapshot5.L$2 = loadType10;
                                    pageFetcherSnapshot5.L$3 = mutex7;
                                    pageFetcherSnapshot5.L$4 = null;
                                    pageFetcherSnapshot5.label = 13;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState2, loadType10, pageFetcherSnapshot5) == coroutine_suspended) {
                                    }
                                    break;
                                case 13:
                                    Mutex mutex19 = (Mutex) pageFetcherSnapshot5.L$3;
                                    loadType11 = (LoadType) pageFetcherSnapshot5.L$2;
                                    coroutineScope11 = (CoroutineScope) pageFetcherSnapshot5.L$1;
                                    pageFetcherSnapshot15 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    r1 = mutex19;
                                    Unit unit32 = Unit.INSTANCE;
                                    r1.unlock(null);
                                    coroutineScope9 = coroutineScope11;
                                    pageFetcherSnapshot14 = pageFetcherSnapshot15;
                                    if (WhenMappings.$EnumSwitchMapping$0[loadType11.ordinal()] == 1) {
                                    }
                                    break;
                                case 14:
                                    pageFetcherSnapshot14 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$6;
                                    loadType12 = (LoadType) pageFetcherSnapshot5.L$5;
                                    mutex8 = (Mutex) pageFetcherSnapshot5.L$4;
                                    holder8 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$3;
                                    loadType13 = (LoadType) pageFetcherSnapshot5.L$2;
                                    coroutineScope9 = (CoroutineScope) pageFetcherSnapshot5.L$1;
                                    pageFetcherSnapshot16 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    viewportHint3 = holder8.state.getFailedHintsByLoadType$paging_common_release().get(loadType13);
                                    mutex8.unlock(null);
                                    loadType14 = loadType12;
                                    loadType11 = loadType13;
                                    pageFetcherSnapshot17 = pageFetcherSnapshot14;
                                    pageFetcherSnapshot14 = pageFetcherSnapshot16;
                                    pageFetcherSnapshot5.L$0 = pageFetcherSnapshot14;
                                    pageFetcherSnapshot5.L$1 = coroutineScope9;
                                    pageFetcherSnapshot5.L$2 = loadType11;
                                    pageFetcherSnapshot5.L$3 = null;
                                    pageFetcherSnapshot5.L$4 = null;
                                    pageFetcherSnapshot5.L$5 = null;
                                    pageFetcherSnapshot5.L$6 = null;
                                    pageFetcherSnapshot5.label = 15;
                                    if (pageFetcherSnapshot17.retryLoadError(loadType14, viewportHint3, pageFetcherSnapshot5) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                case 15:
                                    LoadType loadType17 = (LoadType) pageFetcherSnapshot5.L$2;
                                    coroutineScope12 = (CoroutineScope) pageFetcherSnapshot5.L$1;
                                    PageFetcherSnapshot pageFetcherSnapshot24 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    loadType11 = loadType17;
                                    pageFetcherSnapshot14 = pageFetcherSnapshot24;
                                    if (loadType11 == LoadType.REFRESH) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    mutex9 = (Mutex) pageFetcherSnapshot5.L$3;
                                    holder9 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot5.L$2;
                                    coroutineScope12 = (CoroutineScope) pageFetcherSnapshot5.L$1;
                                    pageFetcherSnapshot18 = (PageFetcherSnapshot) pageFetcherSnapshot5.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    loadState = holder9.state.getSourceLoadStates().get(LoadType.REFRESH);
                                    mutex9.unlock(null);
                                    if (!(loadState instanceof LoadState.Error)) {
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
        }
    }
}
