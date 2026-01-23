package androidx.paging;

import androidx.paging.PageFetcher;
import androidx.paging.PagingSource;
import androidx.paging.RemoteMediator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: PageFetcher.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PagingData;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.paging.PageFetcher$flow$1", m3645f = "PageFetcher.kt", m3646l = {136}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.paging.PageFetcher$flow$1, reason: use source file name */
/* loaded from: classes4.dex */
final class PageFetcher2<Value> extends ContinuationImpl7 implements Function2<SimpleChannelFlow3<PagingData<Value>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RemoteMediator<Key, Value> $remoteMediator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcher<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher2(RemoteMediator<Key, Value> remoteMediator, PageFetcher<Key, Value> pageFetcher, Continuation<? super PageFetcher2> continuation) {
        super(2, continuation);
        this.$remoteMediator = remoteMediator;
        this.this$0 = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageFetcher2 pageFetcher2 = new PageFetcher2(this.$remoteMediator, this.this$0, continuation);
        pageFetcher2.L$0 = obj;
        return pageFetcher2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SimpleChannelFlow3<PagingData<Value>> simpleChannelFlow3, Continuation<? super Unit> continuation) {
        return ((PageFetcher2) create(simpleChannelFlow3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SimpleChannelFlow3 simpleChannelFlow3 = (SimpleChannelFlow3) this.L$0;
            RemoteMediator<Key, Value> remoteMediator = this.$remoteMediator;
            RemoteMediatorAccessor RemoteMediatorAccessor = remoteMediator != 0 ? RemoteMediatorAccessorKt.RemoteMediatorAccessor(simpleChannelFlow3, remoteMediator) : null;
            Flow flowSimpleTransformLatest = FlowExtKt.simpleTransformLatest(FlowKt.filterNotNull(FlowExtKt.simpleScan(FlowKt.onStart(((PageFetcher) this.this$0).refreshEvents.getFlow(), new C27431(RemoteMediatorAccessor, null)), null, new C27442(RemoteMediatorAccessor, this.this$0, null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this.this$0, RemoteMediatorAccessor));
            C27454 c27454 = new C27454(simpleChannelFlow3);
            this.label = 1;
            if (flowSimpleTransformLatest.collect(c27454, this) == coroutine_suspended) {
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

    /* compiled from: PageFetcher.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcher$flow$1$1", m3645f = "PageFetcher.kt", m3646l = {63, 63}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$flow$1$1 */
    static final class C27431 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27431(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, Continuation<? super C27431> continuation) {
            super(2, continuation);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27431 c27431 = new C27431(this.$remoteMediatorAccessor, continuation);
            c27431.L$0 = obj;
            return c27431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C27431) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            if (r1.emit(r7, r6) != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            RemoteMediator.InitializeAction initializeAction;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor = this.$remoteMediatorAccessor;
                if (remoteMediatorAccessor != 0) {
                    this.L$0 = flowCollector;
                    this.label = 1;
                    obj = remoteMediatorAccessor.initialize(this);
                } else {
                    initializeAction = null;
                    Boolean boolBoxBoolean = boxing.boxBoolean(initializeAction == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH);
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            initializeAction = (RemoteMediator.InitializeAction) obj;
            Boolean boolBoxBoolean2 = boxing.boxBoolean(initializeAction == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Key] */
    /* compiled from: PageFetcher.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/paging/PageFetcher$GenerationInfo;", "Key", "Value", "", "previousGeneration", "triggerRemoteRefresh", ""}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcher$flow$1$2", m3645f = "PageFetcher.kt", m3646l = {73, 77}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcher$flow$1$2 */
    static final class C27442<Key> extends ContinuationImpl7 implements Function3<PageFetcher.GenerationInfo<Key, Value>, Boolean, Continuation<? super PageFetcher.GenerationInfo<Key, Value>>, Object> {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $remoteMediatorAccessor;
        /* synthetic */ Object L$0;
        Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27442(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, PageFetcher<Key, Value> pageFetcher, Continuation<? super C27442> continuation) {
            super(3, continuation);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
            this.this$0 = pageFetcher;
        }

        public final Object invoke(PageFetcher.GenerationInfo<Key, Value> generationInfo, boolean z, Continuation<? super PageFetcher.GenerationInfo<Key, Value>> continuation) {
            C27442 c27442 = new C27442(this.$remoteMediatorAccessor, this.this$0, continuation);
            c27442.L$0 = generationInfo;
            c27442.Z$0 = z;
            return c27442.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return invoke((PageFetcher.GenerationInfo) obj, bool.booleanValue(), (Continuation) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PageFetcher.GenerationInfo generationInfo;
            PageFetcherSnapshot<Key, Value> snapshot;
            RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor;
            PagingSource pagingSource;
            PagingState<Key, Value> state;
            PageFetcherSnapshot<Key, Value> snapshot2;
            PagingSource pagingSource2;
            List<PagingSource.LoadResult.Page<Key, Value>> pages;
            PagingState<Key, Value> state2;
            List<PagingSource.LoadResult.Page<Key, Value>> pages2;
            PagingState<Key, Value> pagingState;
            Object refreshKey;
            Job job;
            PageFetcherSnapshot<Key, Value> snapshot3;
            PagingState<Key, Value> state3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PageFetcher.GenerationInfo generationInfo2 = (PageFetcher.GenerationInfo) this.L$0;
                if (this.Z$0 && (remoteMediatorAccessor = this.$remoteMediatorAccessor) != null) {
                    remoteMediatorAccessor.allowRefresh();
                }
                PageFetcher<Key, Value> pageFetcher = this.this$0;
                PagingSource<Key, Value> pagingSource$paging_common_release = (generationInfo2 == null || (snapshot = generationInfo2.getSnapshot()) == null) ? null : snapshot.getPagingSource$paging_common_release();
                this.L$0 = generationInfo2;
                this.label = 1;
                Object objGenerateNewPagingSource = pageFetcher.generateNewPagingSource(pagingSource$paging_common_release, this);
                if (objGenerateNewPagingSource != coroutine_suspended) {
                    generationInfo = generationInfo2;
                    obj = objGenerateNewPagingSource;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagingSource2 = (PagingSource) this.L$1;
                generationInfo = (PageFetcher.GenerationInfo) this.L$0;
                ResultKt.throwOnFailure(obj);
                state = (PagingState) obj;
                pagingSource = pagingSource2;
                pages = state != null ? state.getPages() : null;
                if ((pages == null || pages.isEmpty()) && generationInfo != null && (state2 = generationInfo.getState()) != null && (pages2 = state2.getPages()) != null && (!pages2.isEmpty())) {
                }
                if ((state != null ? state.getAnchorPosition() : null) == null) {
                    if (((generationInfo == null || (state3 = generationInfo.getState()) == null) ? null : state3.getAnchorPosition()) != null) {
                        state = generationInfo.getState();
                    }
                }
                pagingState = state;
                if (pagingState == null) {
                    refreshKey = ((PageFetcher) this.this$0).initialKey;
                } else {
                    refreshKey = pagingSource.getRefreshKey(pagingState);
                    PagingLogger pagingLogger = PagingLogger.INSTANCE;
                    if (pagingLogger.isLoggable(3)) {
                        pagingLogger.log(3, "Refresh key " + refreshKey + " returned from PagingSource " + pagingSource, null);
                    }
                }
                Object obj2 = refreshKey;
                if (generationInfo != null && (snapshot3 = generationInfo.getSnapshot()) != null) {
                    snapshot3.close();
                }
                if (generationInfo != null && (job = generationInfo.getJob()) != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                return new PageFetcher.GenerationInfo(new PageFetcherSnapshot(obj2, pagingSource, ((PageFetcher) this.this$0).config, ((PageFetcher) this.this$0).retryEvents.getFlow(), this.$remoteMediatorAccessor, pagingState, new AnonymousClass1(this.this$0)), pagingState, Job6.Job$default(null, 1, null));
            }
            generationInfo = (PageFetcher.GenerationInfo) this.L$0;
            ResultKt.throwOnFailure(obj);
            PagingSource pagingSource3 = (PagingSource) obj;
            if (generationInfo == null || (snapshot2 = generationInfo.getSnapshot()) == null) {
                pagingSource = pagingSource3;
                state = null;
                pages = state != null ? state.getPages() : null;
                state = pages == null ? generationInfo.getState() : generationInfo.getState();
                if ((state != null ? state.getAnchorPosition() : null) == null) {
                }
                pagingState = state;
                if (pagingState == null) {
                }
                Object obj22 = refreshKey;
                if (generationInfo != null) {
                    snapshot3.close();
                }
                if (generationInfo != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                return new PageFetcher.GenerationInfo(new PageFetcherSnapshot(obj22, pagingSource, ((PageFetcher) this.this$0).config, ((PageFetcher) this.this$0).retryEvents.getFlow(), this.$remoteMediatorAccessor, pagingState, new AnonymousClass1(this.this$0)), pagingState, Job6.Job$default(null, 1, null));
            }
            this.L$0 = generationInfo;
            this.L$1 = pagingSource3;
            this.label = 2;
            Object objCurrentPagingState = snapshot2.currentPagingState(this);
            if (objCurrentPagingState != coroutine_suspended) {
                pagingSource2 = pagingSource3;
                obj = objCurrentPagingState;
                state = (PagingState) obj;
                pagingSource = pagingSource2;
                pages = state != null ? state.getPages() : null;
                if (pages == null) {
                }
                if ((state != null ? state.getAnchorPosition() : null) == null) {
                }
                pagingState = state;
                if (pagingState == null) {
                }
                Object obj222 = refreshKey;
                if (generationInfo != null) {
                }
                if (generationInfo != null) {
                }
                return new PageFetcher.GenerationInfo(new PageFetcherSnapshot(obj222, pagingSource, ((PageFetcher) this.this$0).config, ((PageFetcher) this.this$0).retryEvents.getFlow(), this.$remoteMediatorAccessor, pagingState, new AnonymousClass1(this.this$0)), pagingState, Job6.Job$default(null, 1, null));
            }
            return coroutine_suspended;
        }

        /* compiled from: PageFetcher.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        /* renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
            AnonymousClass1(Object obj) {
                super(0, obj, PageFetcher.class, "refresh", "refresh()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((PageFetcher) this.receiver).refresh();
            }
        }
    }

    /* compiled from: PageFetcher.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: androidx.paging.PageFetcher$flow$1$4 */
    /* synthetic */ class C27454 implements FlowCollector, FunctionAdapter {
        final /* synthetic */ SimpleChannelFlow3<PagingData<Value>> $tmp0;

        C27454(SimpleChannelFlow3<PagingData<Value>> simpleChannelFlow3) {
            this.$tmp0 = simpleChannelFlow3;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.$tmp0, SimpleChannelFlow3.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Object emit(PagingData<Value> pagingData, Continuation<? super Unit> continuation) {
            Object objSend = this.$tmp0.send(pagingData, continuation);
            return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((PagingData) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
