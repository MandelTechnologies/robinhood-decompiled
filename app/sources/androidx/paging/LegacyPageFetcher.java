package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LegacyPageFetcher.jvm.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002DEBW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020\u0017¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u0017¢\u0006\u0004\b'\u0010#J\r\u0010(\u001a\u00020\u0017¢\u0006\u0004\b(\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0018\u00107\u001a\u000605j\u0002`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R(\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010#\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0011\u0010B\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, m3636d2 = {"Landroidx/paging/LegacyPageFetcher;", "", "K", "V", "Lkotlinx/coroutines/CoroutineScope;", "pagedListScope", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingSource;", "source", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "pageConsumer", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "keyProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/LegacyPageFetcher$PageConsumer;Landroidx/paging/LegacyPageFetcher$KeyProvider;)V", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/PagingSource$LoadParams;", "params", "", "scheduleLoad", "(Landroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadParams;)V", "Landroidx/paging/PagingSource$LoadResult$Page;", "value", "onLoadSuccess", "(Landroidx/paging/LoadType;Landroidx/paging/PagingSource$LoadResult$Page;)V", "", "throwable", "onLoadError", "(Landroidx/paging/LoadType;Ljava/lang/Throwable;)V", "onLoadInvalid", "()V", "schedulePrepend", "scheduleAppend", "trySchedulePrepend", "tryScheduleAppend", "detach", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "Landroidx/paging/PagingSource;", "getSource", "()Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "getPageConsumer", "()Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/AtomicBoolean;", "detached", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/PagedList$LoadStateManager;", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager", "()Landroidx/paging/PagedList$LoadStateManager;", "setLoadStateManager", "(Landroidx/paging/PagedList$LoadStateManager;)V", "getLoadStateManager$annotations", "", "isDetached", "()Z", "KeyProvider", "PageConsumer", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class LegacyPageFetcher<K, V> {
    private final PagedList.Config config;
    private final AtomicBoolean detached;
    private final CoroutineDispatcher fetchDispatcher;
    private final KeyProvider<K> keyProvider;
    private PagedList.LoadStateManager loadStateManager;
    private final CoroutineDispatcher notifyDispatcher;
    private final PageConsumer<V> pageConsumer;
    private final CoroutineScope pagedListScope;
    private final PagingSource<K, V> source;

    /* compiled from: LegacyPageFetcher.jvm.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m3636d2 = {"Landroidx/paging/LegacyPageFetcher$KeyProvider;", "K", "", "nextKey", "getNextKey", "()Ljava/lang/Object;", "prevKey", "getPrevKey", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface KeyProvider<K> {
        K getNextKey();

        K getPrevKey();
    }

    /* compiled from: LegacyPageFetcher.jvm.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m3636d2 = {"Landroidx/paging/LegacyPageFetcher$PageConsumer;", "V", "", "onPageResult", "", "type", "Landroidx/paging/LoadType;", "page", "Landroidx/paging/PagingSource$LoadResult$Page;", "onStateChanged", "", "state", "Landroidx/paging/LoadState;", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface PageConsumer<V> {
        boolean onPageResult(LoadType type2, PagingSource.LoadResult.Page<?, V> page);

        void onStateChanged(LoadType type2, LoadState state);
    }

    /* compiled from: LegacyPageFetcher.jvm.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LegacyPageFetcher(CoroutineScope pagedListScope, PagedList.Config config, PagingSource<K, V> source, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher, PageConsumer<V> pageConsumer, KeyProvider<K> keyProvider) {
        Intrinsics.checkNotNullParameter(pagedListScope, "pagedListScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(pageConsumer, "pageConsumer");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        this.pagedListScope = pagedListScope;
        this.config = config;
        this.source = source;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.pageConsumer = pageConsumer;
        this.keyProvider = keyProvider;
        this.detached = new AtomicBoolean(false);
        this.loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.LegacyPageFetcher$loadStateManager$1
            final /* synthetic */ LegacyPageFetcher<K, V> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type2, LoadState state) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                this.this$0.getPageConsumer().onStateChanged(type2, state);
            }
        };
    }

    public final PagingSource<K, V> getSource() {
        return this.source;
    }

    public final PageConsumer<V> getPageConsumer() {
        return this.pageConsumer;
    }

    public final PagedList.LoadStateManager getLoadStateManager() {
        return this.loadStateManager;
    }

    public final boolean isDetached() {
        return this.detached.get();
    }

    /* compiled from: LegacyPageFetcher.jvm.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "K", "", "V", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", m3645f = "LegacyPageFetcher.jvm.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1 */
    static final class C27361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PagingSource.LoadParams<K> $params;
        final /* synthetic */ LoadType $type;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LegacyPageFetcher<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27361(LegacyPageFetcher<K, V> legacyPageFetcher, PagingSource.LoadParams<K> loadParams, LoadType loadType, Continuation<? super C27361> continuation) {
            super(2, continuation);
            this.this$0 = legacyPageFetcher;
            this.$params = loadParams;
            this.$type = loadType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27361 c27361 = new C27361(this.this$0, this.$params, this.$type, continuation);
            c27361.L$0 = obj;
            return c27361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                PagingSource<K, V> source = this.this$0.getSource();
                PagingSource.LoadParams<K> loadParams = this.$params;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objLoad = source.load(loadParams, this);
                if (objLoad == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objLoad;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
            if (!this.this$0.getSource().getInvalid()) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, ((LegacyPageFetcher) this.this$0).notifyDispatcher, null, new AnonymousClass1(loadResult, this.this$0, this.$type, null), 2, null);
                return Unit.INSTANCE;
            }
            this.this$0.detach();
            return Unit.INSTANCE;
        }

        /* compiled from: LegacyPageFetcher.jvm.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "K", "", "V", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", m3645f = "LegacyPageFetcher.jvm.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LoadType $type;
            final /* synthetic */ PagingSource.LoadResult<K, V> $value;
            int label;
            final /* synthetic */ LegacyPageFetcher<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PagingSource.LoadResult<K, V> loadResult, LegacyPageFetcher<K, V> legacyPageFetcher, LoadType loadType, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$value = loadResult;
                this.this$0 = legacyPageFetcher;
                this.$type = loadType;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$value, this.this$0, this.$type, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PagingSource.LoadResult<K, V> loadResult = this.$value;
                if (loadResult instanceof PagingSource.LoadResult.Page) {
                    this.this$0.onLoadSuccess(this.$type, (PagingSource.LoadResult.Page) loadResult);
                } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                    this.this$0.onLoadError(this.$type, ((PagingSource.LoadResult.Error) loadResult).getThrowable());
                } else if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                    this.this$0.onLoadInvalid();
                }
                return Unit.INSTANCE;
            }
        }
    }

    private final void scheduleLoad(LoadType type2, PagingSource.LoadParams<K> params) {
        BuildersKt__Builders_commonKt.launch$default(this.pagedListScope, this.fetchDispatcher, null, new C27361(this, params, type2, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadSuccess(LoadType type2, PagingSource.LoadResult.Page<K, V> value) {
        if (isDetached()) {
            return;
        }
        if (this.pageConsumer.onPageResult(type2, value)) {
            int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i == 1) {
                schedulePrepend();
                return;
            } else {
                if (i == 2) {
                    scheduleAppend();
                    return;
                }
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
        }
        this.loadStateManager.setState(type2, value.getData().isEmpty() ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadError(LoadType type2, Throwable throwable) {
        if (isDetached()) {
            return;
        }
        this.loadStateManager.setState(type2, new LoadState.Error(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadInvalid() {
        this.source.invalidate();
        detach();
    }

    public final void trySchedulePrepend() {
        LoadState startState = this.loadStateManager.getStartState();
        if (!(startState instanceof LoadState.NotLoading) || startState.getEndOfPaginationReached()) {
            return;
        }
        schedulePrepend();
    }

    public final void tryScheduleAppend() {
        LoadState endState = this.loadStateManager.getEndState();
        if (!(endState instanceof LoadState.NotLoading) || endState.getEndOfPaginationReached()) {
            return;
        }
        scheduleAppend();
    }

    private final void schedulePrepend() {
        K prevKey = this.keyProvider.getPrevKey();
        if (prevKey == null) {
            onLoadSuccess(LoadType.PREPEND, PagingSource.LoadResult.Page.INSTANCE.empty$paging_common_release());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.PREPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Prepend(prevKey, config.pageSize, config.enablePlaceholders));
    }

    private final void scheduleAppend() {
        K nextKey = this.keyProvider.getNextKey();
        if (nextKey == null) {
            onLoadSuccess(LoadType.APPEND, PagingSource.LoadResult.Page.INSTANCE.empty$paging_common_release());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.APPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Append(nextKey, config.pageSize, config.enablePlaceholders));
    }

    public final void detach() {
        this.detached.set(true);
    }
}
