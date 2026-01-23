package androidx.paging;

import androidx.paging.AccessorState;
import androidx.paging.LoadState;
import androidx.paging.RemoteMediator;
import com.plaid.internal.EnumC7081g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RemoteMediatorAccessor.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 !*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001!B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u001c\u0010 \u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J4\u0010\u001a\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, m3636d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "Key", "", "Value", "Landroidx/paging/RemoteMediatorAccessor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "remoteMediator", "Landroidx/paging/RemoteMediator;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/RemoteMediator;)V", "accessorState", "Landroidx/paging/AccessorStateHolder;", "isolationRunner", "Landroidx/paging/SingleRunner;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/LoadStates;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "allowRefresh", "", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchBoundary", "launchRefresh", "requestLoad", "loadType", "Landroidx/paging/LoadType;", "pagingState", "Landroidx/paging/PagingState;", "requestRefreshIfAllowed", "retryFailed", "Companion", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {
    private final AccessorStateHolder<Key, Value> accessorState;
    private final SingleRunner isolationRunner;
    private final RemoteMediator<Key, Value> remoteMediator;
    private final CoroutineScope scope;

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
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

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.RemoteMediatorAccessImpl", m3645f = "RemoteMediatorAccessor.kt", m3646l = {445}, m3647m = "initialize")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$initialize$1 */
    static final class C27791 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27791(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C27791> continuation) {
            super(continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initialize(this);
        }
    }

    public RemoteMediatorAccessImpl(CoroutineScope scope, RemoteMediator<Key, Value> remoteMediator) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new AccessorStateHolder<>();
        this.isolationRunner = new SingleRunner(false);
    }

    @Override // androidx.paging.RemoteMediatorAccessor
    public StateFlow<LoadStates> getState() {
        return this.accessorState.getLoadStates();
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestRefreshIfAllowed(final PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>(this) { // from class: androidx.paging.RemoteMediatorAccessImpl.requestRefreshIfAllowed.1
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getRefreshAllowed()) {
                    it.setRefreshAllowed(false);
                    RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl = this.this$0;
                    remoteMediatorAccessImpl.requestLoad(((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState, LoadType.REFRESH, pagingState);
                }
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void allowRefresh() {
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.allowRefresh.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setRefreshAllowed(true);
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestLoad(LoadType loadType, PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        requestLoad(this.accessorState, loadType, pagingState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLoad(AccessorStateHolder<Key, Value> accessorStateHolder, final LoadType loadType, final PagingState<Key, Value> pagingState) {
        if (((Boolean) accessorStateHolder.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestLoad$newRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.add(loadType, pagingState));
            }
        })).booleanValue()) {
            if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
                launchRefresh();
            } else {
                launchBoundary();
            }
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", m3645f = "RemoteMediatorAccessor.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1 */
    static final class C27811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27811(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C27811> continuation) {
            super(2, continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27811(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, booleanRef2, null);
                this.L$0 = booleanRef2;
                this.label = 1;
                if (singleRunner.runInIsolation(2, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (booleanRef.element) {
                this.this$0.launchBoundary();
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RemoteMediatorAccessor.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", m3645f = "RemoteMediatorAccessor.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $launchAppendPrepend;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = remoteMediatorAccessImpl;
                this.$launchAppendPrepend = booleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$launchAppendPrepend, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
                Ref.BooleanRef booleanRef;
                boolean zBooleanValue;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PagingState<Key, Value> pagingState = (PagingState) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, PagingState<Key, Value>>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1
                        @Override // kotlin.jvm.functions.Function1
                        public final PagingState<Key, Value> invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getPendingRefresh();
                        }
                    });
                    if (pagingState != null) {
                        remoteMediatorAccessImpl = this.this$0;
                        Ref.BooleanRef booleanRef2 = this.$launchAppendPrepend;
                        RemoteMediator remoteMediator = ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).remoteMediator;
                        LoadType loadType = LoadType.REFRESH;
                        this.L$0 = remoteMediatorAccessImpl;
                        this.L$1 = booleanRef2;
                        this.label = 1;
                        obj = remoteMediator.load(loadType, pagingState, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef = booleanRef2;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$1;
                remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) this.L$0;
                ResultKt.throwOnFailure(obj);
                final RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
                if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            if (((RemoteMediator.MediatorResult.Success) mediatorResult).getEndOfPaginationReached()) {
                                AccessorState.BlockState blockState = AccessorState.BlockState.COMPLETED;
                                it.setBlockState(loadType2, blockState);
                                it.setBlockState(LoadType.PREPEND, blockState);
                                it.setBlockState(LoadType.APPEND, blockState);
                                it.clearPendingRequests();
                            } else {
                                LoadType loadType3 = LoadType.PREPEND;
                                AccessorState.BlockState blockState2 = AccessorState.BlockState.UNBLOCKED;
                                it.setBlockState(loadType3, blockState2);
                                it.setBlockState(LoadType.APPEND, blockState2);
                            }
                            it.setError(LoadType.PREPEND, null);
                            it.setError(LoadType.APPEND, null);
                            return Boolean.valueOf(it.getPendingBoundary() != null);
                        }
                    })).booleanValue();
                } else if (mediatorResult instanceof RemoteMediator.MediatorResult.Error) {
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            it.setError(loadType2, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                            return Boolean.valueOf(it.getPendingBoundary() != null);
                        }
                    })).booleanValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                booleanRef.element = zBooleanValue;
                return Unit.INSTANCE;
            }
        }
    }

    private final void launchRefresh() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C27811(this, null), 3, null);
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", m3645f = "RemoteMediatorAccessor.kt", m3646l = {386}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 */
    static final class C27801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27801(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C27801> continuation) {
            super(2, continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27801(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (singleRunner.runInIsolation(1, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: RemoteMediatorAccessor.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", m3645f = "RemoteMediatorAccessor.kt", m3646l = {393}, m3647m = "invokeSuspend")
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = remoteMediatorAccessImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004b -> B:16:0x004e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Tuples2 tuples2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    tuples2 = (Tuples2) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, Tuples2<? extends LoadType, ? extends PagingState<Key, Value>>>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Tuples2<LoadType, PagingState<Key, Value>> invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getPendingBoundary();
                        }
                    });
                    if (tuples2 != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final LoadType loadType = (LoadType) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    final RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
                    if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                        ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                                invoke((AccessorState) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AccessorState<Key, Value> it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                it.clearPendingRequest(loadType);
                                if (((RemoteMediator.MediatorResult.Success) mediatorResult).getEndOfPaginationReached()) {
                                    it.setBlockState(loadType, AccessorState.BlockState.COMPLETED);
                                }
                            }
                        });
                    } else if (mediatorResult instanceof RemoteMediator.MediatorResult.Error) {
                        ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                                invoke((AccessorState) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AccessorState<Key, Value> it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                it.clearPendingRequest(loadType);
                                it.setError(loadType, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                            }
                        });
                    }
                    tuples2 = (Tuples2) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, Tuples2<? extends LoadType, ? extends PagingState<Key, Value>>>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final Tuples2<LoadType, PagingState<Key, Value>> invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getPendingBoundary();
                        }
                    });
                    if (tuples2 != null) {
                        loadType = (LoadType) tuples2.component1();
                        PagingState<Key, Value> pagingState = (PagingState) tuples2.component2();
                        RemoteMediator remoteMediator = ((RemoteMediatorAccessImpl) this.this$0).remoteMediator;
                        this.L$0 = loadType;
                        this.label = 1;
                        obj = remoteMediator.load(loadType, pagingState, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        final RemoteMediator.MediatorResult mediatorResult2 = (RemoteMediator.MediatorResult) obj;
                        if (mediatorResult2 instanceof RemoteMediator.MediatorResult.Success) {
                        }
                        tuples2 = (Tuples2) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, Tuples2<? extends LoadType, ? extends PagingState<Key, Value>>>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                            @Override // kotlin.jvm.functions.Function1
                            public final Tuples2<LoadType, PagingState<Key, Value>> invoke(AccessorState<Key, Value> it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return it.getPendingBoundary();
                            }
                        });
                        if (tuples2 != null) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBoundary() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C27801(this, null), 3, null);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void retryFailed(PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        final ArrayList arrayList = new ArrayList();
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.retryFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AccessorState<Key, Value> accessorState) {
                Intrinsics.checkNotNullParameter(accessorState, "accessorState");
                LoadStates loadStatesComputeLoadStates = accessorState.computeLoadStates();
                boolean z = loadStatesComputeLoadStates.getRefresh() instanceof LoadState.Error;
                accessorState.clearErrors();
                if (z) {
                    List<LoadType> list = arrayList;
                    LoadType loadType = LoadType.REFRESH;
                    list.add(loadType);
                    accessorState.setBlockState(loadType, AccessorState.BlockState.UNBLOCKED);
                }
                if (loadStatesComputeLoadStates.getAppend() instanceof LoadState.Error) {
                    if (!z) {
                        arrayList.add(LoadType.APPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.APPEND);
                }
                if (loadStatesComputeLoadStates.getPrepend() instanceof LoadState.Error) {
                    if (!z) {
                        arrayList.add(LoadType.PREPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.PREPEND);
                }
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            requestLoad((LoadType) it.next(), pagingState);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediatorAccessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initialize(Continuation<? super RemoteMediator.InitializeAction> continuation) {
        C27791 c27791;
        RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
        if (continuation instanceof C27791) {
            c27791 = (C27791) continuation;
            int i = c27791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27791.label = i - Integer.MIN_VALUE;
            } else {
                c27791 = new C27791(this, continuation);
            }
        }
        Object objInitialize = c27791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInitialize);
            RemoteMediator<Key, Value> remoteMediator = this.remoteMediator;
            c27791.L$0 = this;
            c27791.label = 1;
            objInitialize = remoteMediator.initialize(c27791);
            if (objInitialize == coroutine_suspended) {
                return coroutine_suspended;
            }
            remoteMediatorAccessImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) c27791.L$0;
            ResultKt.throwOnFailure(objInitialize);
        }
        if (((RemoteMediator.InitializeAction) objInitialize) == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH) {
            remoteMediatorAccessImpl.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((AccessorState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(AccessorState<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    LoadType loadType = LoadType.APPEND;
                    AccessorState.BlockState blockState = AccessorState.BlockState.REQUIRES_REFRESH;
                    it.setBlockState(loadType, blockState);
                    it.setBlockState(LoadType.PREPEND, blockState);
                }
            });
        }
        return objInitialize;
    }
}
