package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.http.HttpStatusCode;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B{\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\n*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001e\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u001d0\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nH\u0082@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b(\u0010)J7\u0010.\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00018\u00002\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010+H\u0002¢\u0006\u0004\b.\u0010/J(\u00101\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001002\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b1\u00102J0\u00105\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\b5\u00106J9\u00109\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001dH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\n¢\u0006\u0004\b?\u0010<J\u001c\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086@¢\u0006\u0004\b@\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010CR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010KR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010LR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u00060Qj\u0002`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R#\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010V0\t8\u0006¢\u0006\f\n\u0004\b_\u0010H\u001a\u0004\b`\u0010a¨\u0006b"}, m3636d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "initialKey", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingConfig;", "config", "Lkotlinx/coroutines/flow/Flow;", "", "retryFlow", "Landroidx/paging/RemoteMediatorConnection;", "remoteMediatorConnection", "Landroidx/paging/PagingState;", "previousPagingState", "Lkotlin/Function0;", "jumpCallback", "<init>", "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/ViewportHint;", "viewportHint", "retryLoadError", "(Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "startConsumingHints", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "collectAsGenerationalViewportHints", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "Landroidx/paging/PagingSource$LoadParams;", "loadParams", "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "doInitialLoad", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/GenerationalViewportHint;", "generationalHint", "doLoad", "(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadKey", "Landroidx/paging/PagingSource$LoadResult;", "result", "", "loadResultLog", "(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;", "Landroidx/paging/PageFetcherSnapshotState;", "setLoading", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/LoadState$Error;", "error", "setError", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generationId", "presentedItemsBeyondAnchor", "nextLoadKeyOrNull", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "onInvalidLoad", "()V", "accessHint", "(Landroidx/paging/ViewportHint;)V", "close", "currentPagingState", "Ljava/lang/Object;", "getInitialKey$paging_common_release", "()Ljava/lang/Object;", "Landroidx/paging/PagingSource;", "getPagingSource$paging_common_release", "()Landroidx/paging/PagingSource;", "Landroidx/paging/PagingConfig;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/RemoteMediatorConnection;", "getRemoteMediatorConnection", "()Landroidx/paging/RemoteMediatorConnection;", "Landroidx/paging/PagingState;", "Lkotlin/jvm/functions/Function0;", "Landroidx/paging/HintHandler;", "hintHandler", "Landroidx/paging/HintHandler;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/AtomicBoolean;", "pageEventChCollected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/paging/PageEvent;", "pageEventCh", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "stateHolder", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "Lkotlinx/coroutines/CompletableJob;", "pageEventChannelFlowJob", "Lkotlinx/coroutines/CompletableJob;", "pageEventFlow", "getPageEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PageFetcherSnapshot<Key, Value> {
    private final PagingConfig config;
    private final HintHandler hintHandler;
    private final Key initialKey;
    private final Function0<Unit> jumpCallback;
    private final Channel<PageEvent<Value>> pageEventCh;
    private final AtomicBoolean pageEventChCollected;
    private final CompletableJob pageEventChannelFlowJob;
    private final Flow<PageEvent<Value>> pageEventFlow;
    private final PagingSource<Key, Value> pagingSource;
    private final PagingState<Key, Value> previousPagingState;
    private final RemoteMediatorConnection<Key, Value> remoteMediatorConnection;
    private final Flow<Unit> retryFlow;
    private final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot", m3645f = "PageFetcherSnapshot.kt", m3646l = {646}, m3647m = "currentPagingState")
    /* renamed from: androidx.paging.PageFetcherSnapshot$currentPagingState$1 */
    static final class C27541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27541(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C27541> continuation) {
            super(continuation);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.currentPagingState(this);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot", m3645f = "PageFetcherSnapshot.kt", m3646l = {646, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 667, 688, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, 709, 730, 354}, m3647m = "doInitialLoad")
    /* renamed from: androidx.paging.PageFetcherSnapshot$doInitialLoad$1 */
    static final class C27551 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27551(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C27551> continuation) {
            super(continuation);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doInitialLoad(this);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot", m3645f = "PageFetcherSnapshot.kt", m3646l = {647, 658, 415, 424, 679, 720, 472, 741, 495, HttpStatusCode.DOWNTIME_ERROR, 752}, m3647m = "doLoad")
    /* renamed from: androidx.paging.PageFetcherSnapshot$doLoad$1 */
    static final class C27561 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27561(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C27561> continuation) {
            super(continuation);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doLoad(null, null, this);
        }
    }

    public PageFetcherSnapshot(Key key, PagingSource<Key, Value> pagingSource, PagingConfig config, Flow<Unit> retryFlow, RemoteMediatorConnection<Key, Value> remoteMediatorConnection, PagingState<Key, Value> pagingState, Function0<Unit> jumpCallback) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(retryFlow, "retryFlow");
        Intrinsics.checkNotNullParameter(jumpCallback, "jumpCallback");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.remoteMediatorConnection = remoteMediatorConnection;
        this.previousPagingState = pagingState;
        this.jumpCallback = jumpCallback;
        if (config.jumpThreshold != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.hintHandler = new HintHandler();
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = Channel4.Channel$default(-2, null, null, 6, null);
        this.stateHolder = new PageFetcherSnapshotState.Holder<>(config);
        CompletableJob completableJobJob$default = Job6.Job$default(null, 1, null);
        this.pageEventChannelFlowJob = completableJobJob$default;
        this.pageEventFlow = FlowKt.onStart(CancelableChannelFlow.cancelableChannelFlow(completableJobJob$default, new PageFetcherSnapshot3(this, null)), new PageFetcherSnapshot6(this, null));
    }

    public final PagingSource<Key, Value> getPagingSource$paging_common_release() {
        return this.pagingSource;
    }

    public final RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    public final Flow<PageEvent<Value>> getPageEventFlow() {
        return this.pageEventFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectAsGenerationalViewportHints(Flow<Integer> flow, final LoadType loadType, Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.conflate(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(flow, new C2750xe29ec4fd(null, this, loadType)), new C27523(loadType, null))).collect(new FlowCollector(this) { // from class: androidx.paging.PageFetcherSnapshot.collectAsGenerationalViewportHints.4
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((GenerationalViewportHint) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(GenerationalViewportHint generationalViewportHint, Continuation<? super Unit> continuation2) throws Throwable {
                Object objDoLoad = this.this$0.doLoad(loadType, generationalViewportHint, continuation2);
                return objDoLoad == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDoLoad : Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryLoadError(LoadType loadType, ViewportHint viewportHint, Continuation<? super Unit> continuation) throws Throwable {
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object objDoInitialLoad = doInitialLoad(continuation);
            return objDoInitialLoad == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDoInitialLoad : Unit.INSTANCE;
        }
        if (viewportHint == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.hintHandler.forceSetHint(loadType, viewportHint);
        return Unit.INSTANCE;
    }

    public final void accessHint(ViewportHint viewportHint) {
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        this.hintHandler.processHint(viewportHint);
    }

    public final void close() {
        Job.DefaultImpls.cancel$default(this.pageEventChannelFlowJob, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object currentPagingState(Continuation<? super PagingState<Key, Value>> continuation) {
        C27541 c27541;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        Mutex mutex;
        if (continuation instanceof C27541) {
            c27541 = (C27541) continuation;
            int i = c27541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27541.label = i - Integer.MIN_VALUE;
            } else {
                c27541 = new C27541(this, continuation);
            }
        }
        Object obj = c27541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c27541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            holder = this.stateHolder;
            Mutex mutex2 = ((PageFetcherSnapshotState.Holder) holder).lock;
            c27541.L$0 = this;
            c27541.L$1 = holder;
            c27541.L$2 = mutex2;
            c27541.label = 1;
            if (mutex2.lock(null, c27541) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pageFetcherSnapshot = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c27541.L$2;
            holder = (PageFetcherSnapshotState.Holder) c27541.L$1;
            pageFetcherSnapshot = (PageFetcherSnapshot) c27541.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return ((PageFetcherSnapshotState.Holder) holder).state.currentPagingState$paging_common_release(pageFetcherSnapshot.hintHandler.getLastAccessHint());
        } finally {
            mutex.unlock(null);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", m3645f = "PageFetcherSnapshot.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1 */
    static final class C27601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27601(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C27601> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27601(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMerge = FlowKt.merge(((PageFetcherSnapshot) this.this$0).hintHandler.hintFor(LoadType.APPEND), ((PageFetcherSnapshot) this.this$0).hintHandler.hintFor(LoadType.PREPEND));
                PageFetcherSnapshot7 pageFetcherSnapshot7 = new PageFetcherSnapshot7(this.this$0, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowMerge, pageFetcherSnapshot7, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ViewportHint viewportHint = (ViewportHint) obj;
            if (viewportHint != null) {
                PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = this.this$0;
                PagingLogger pagingLogger = PagingLogger.INSTANCE;
                if (pagingLogger.isLoggable(3)) {
                    pagingLogger.log(3, "Jump triggered on PagingSource " + pageFetcherSnapshot.getPagingSource$paging_common_release() + " by " + viewportHint, null);
                }
                ((PageFetcherSnapshot) this.this$0).jumpCallback.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConsumingHints(CoroutineScope coroutineScope) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C27601(this, null), 3, null);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C27612(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C27623(this, null), 3, null);
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", m3645f = "PageFetcherSnapshot.kt", m3646l = {646, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$2 */
    static final class C27612 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27612(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C27612> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27612(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r1.collectAsGenerationalViewportHints(r7, r3, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
            PageFetcherSnapshotState.Holder holder;
            Mutex mutex;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    pageFetcherSnapshot = this.this$0;
                    holder = ((PageFetcherSnapshot) pageFetcherSnapshot).stateHolder;
                    Mutex mutex2 = holder.lock;
                    this.L$0 = holder;
                    this.L$1 = mutex2;
                    this.L$2 = pageFetcherSnapshot;
                    this.label = 1;
                    if (mutex2.lock(null, this) != coroutine_suspended) {
                        mutex = mutex2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                pageFetcherSnapshot = (PageFetcherSnapshot) this.L$2;
                mutex = (Mutex) this.L$1;
                holder = (PageFetcherSnapshotState.Holder) this.L$0;
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowConsumePrependGenerationIdAsFlow = holder.state.consumePrependGenerationIdAsFlow();
                mutex.unlock(null);
                LoadType loadType = LoadType.PREPEND;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", m3645f = "PageFetcherSnapshot.kt", m3646l = {646, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$3 */
    static final class C27623 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27623(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super C27623> continuation) {
            super(2, continuation);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27623(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27623) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r1.collectAsGenerationalViewportHints(r7, r3, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
            PageFetcherSnapshotState.Holder holder;
            Mutex mutex;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    pageFetcherSnapshot = this.this$0;
                    holder = ((PageFetcherSnapshot) pageFetcherSnapshot).stateHolder;
                    Mutex mutex2 = holder.lock;
                    this.L$0 = holder;
                    this.L$1 = mutex2;
                    this.L$2 = pageFetcherSnapshot;
                    this.label = 1;
                    if (mutex2.lock(null, this) != coroutine_suspended) {
                        mutex = mutex2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                pageFetcherSnapshot = (PageFetcherSnapshot) this.L$2;
                mutex = (Mutex) this.L$1;
                holder = (PageFetcherSnapshotState.Holder) this.L$0;
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowConsumeAppendGenerationIdAsFlow = holder.state.consumeAppendGenerationIdAsFlow();
                mutex.unlock(null);
                LoadType loadType = LoadType.APPEND;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/paging/GenerationalViewportHint;", "Key", "", "Value", "previous", "next"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", m3645f = "PageFetcherSnapshot.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3 */
    static final class C27523 extends ContinuationImpl7 implements Function3<GenerationalViewportHint, GenerationalViewportHint, Continuation<? super GenerationalViewportHint>, Object> {
        final /* synthetic */ LoadType $loadType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27523(LoadType loadType, Continuation<? super C27523> continuation) {
            super(3, continuation);
            this.$loadType = loadType;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, Continuation<? super GenerationalViewportHint> continuation) {
            C27523 c27523 = new C27523(this.$loadType, continuation);
            c27523.L$0 = generationalViewportHint;
            c27523.L$1 = generationalViewportHint2;
            return c27523.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.L$0;
            GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.L$1;
            return PageFetcherSnapshot8.shouldPrioritizeOver(generationalViewportHint2, generationalViewportHint, this.$loadType) ? generationalViewportHint2 : generationalViewportHint;
        }
    }

    private final PagingSource.LoadParams<Key> loadParams(LoadType loadType, Key key) {
        return PagingSource.LoadParams.INSTANCE.create(loadType, key, loadType == LoadType.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143 A[PHI: r6 r15
      0x0143: PHI (r6v9 androidx.paging.PageFetcherSnapshot) = (r6v6 androidx.paging.PageFetcherSnapshot), (r6v11 androidx.paging.PageFetcherSnapshot) binds: [B:46:0x013f, B:26:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r15v11 java.lang.Object) = (r15v10 java.lang.Object), (r15v1 java.lang.Object) binds: [B:46:0x013f, B:26:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a A[Catch: all -> 0x0198, TryCatch #4 {all -> 0x0198, blocks: (B:54:0x0166, B:56:0x018a, B:59:0x019b, B:61:0x01a4), top: B:142:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4 A[Catch: all -> 0x0198, TRY_LEAVE, TryCatch #4 {all -> 0x0198, blocks: (B:54:0x0166, B:56:0x018a, B:59:0x019b, B:61:0x01a4), top: B:142:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0278  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v41, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInitialLoad(Continuation<? super Unit> continuation) throws Throwable {
        C27551 c27551;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot pageFetcherSnapshot;
        Mutex mutex;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState;
        LoadType loadType;
        PageFetcherSnapshot pageFetcherSnapshot2;
        PagingLogger pagingLogger;
        PagingSource.LoadResult<Key, Value> loadResult;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        Mutex mutex2;
        PagingSource.LoadResult<Key, Value> loadResult2;
        PageFetcherSnapshot pageFetcherSnapshot3;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        Mutex mutex3;
        PagingSource.LoadResult<Key, Value> loadResult3;
        boolean zInsert;
        PagingSource.LoadResult<Key, Value> loadResult4;
        PageFetcherSnapshot pageFetcherSnapshot4;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        Mutex mutex4;
        PagingSource.LoadResult<Key, Value> loadResult5;
        PageFetcherSnapshot pageFetcherSnapshot5;
        Channel<PageEvent<Value>> channel;
        PageEvent<Value> pageEvent$paging_common_release;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        Mutex mutex5;
        PageFetcherSnapshot pageFetcherSnapshot6;
        PagingSource.LoadResult.Page page;
        Mutex mutex6;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState2;
        LoadState.Error error;
        LoadType loadType2;
        if (continuation instanceof C27551) {
            c27551 = (C27551) continuation;
            int i = c27551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27551.label = i - Integer.MIN_VALUE;
            } else {
                c27551 = new C27551(this, continuation);
            }
        }
        Object objLoad = c27551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c27551.label;
        try {
            try {
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(objLoad);
                        holder = this.stateHolder;
                        Mutex mutex7 = ((PageFetcherSnapshotState.Holder) holder).lock;
                        c27551.L$0 = this;
                        c27551.L$1 = holder;
                        c27551.L$2 = mutex7;
                        c27551.label = 1;
                        if (mutex7.lock(null, c27551) != coroutine_suspended) {
                            pageFetcherSnapshot = this;
                            mutex = mutex7;
                            pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                            loadType = LoadType.REFRESH;
                            c27551.L$0 = pageFetcherSnapshot;
                            c27551.L$1 = mutex;
                            c27551.L$2 = null;
                            c27551.label = 2;
                            if (pageFetcherSnapshot.setLoading(pageFetcherSnapshotState, loadType, c27551) == coroutine_suspended) {
                                pageFetcherSnapshot2 = pageFetcherSnapshot;
                                r2 = mutex;
                                Unit unit = Unit.INSTANCE;
                                r2.unlock(null);
                                PagingSource.LoadParams<Key> loadParams = pageFetcherSnapshot2.loadParams(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                                pagingLogger = PagingLogger.INSTANCE;
                                if (pagingLogger.isLoggable(3)) {
                                    pagingLogger.log(3, "Start REFRESH with loadKey " + pageFetcherSnapshot2.initialKey + " on " + pageFetcherSnapshot2.pagingSource, null);
                                }
                                PagingSource<Key, Value> pagingSource = pageFetcherSnapshot2.pagingSource;
                                c27551.L$0 = pageFetcherSnapshot2;
                                c27551.L$1 = null;
                                c27551.label = 3;
                                objLoad = pagingSource.load(loadParams, c27551);
                                if (objLoad != coroutine_suspended) {
                                    loadResult = (PagingSource.LoadResult) objLoad;
                                    if (!(loadResult instanceof PagingSource.LoadResult.Page)) {
                                        PageFetcherSnapshotState.Holder<Key, Value> holder6 = pageFetcherSnapshot2.stateHolder;
                                        Mutex mutex8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                        c27551.L$0 = pageFetcherSnapshot2;
                                        c27551.L$1 = loadResult;
                                        c27551.L$2 = holder6;
                                        c27551.L$3 = mutex8;
                                        c27551.label = 4;
                                        if (mutex8.lock(null, c27551) != coroutine_suspended) {
                                            pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                            holder3 = holder6;
                                            mutex3 = mutex8;
                                            loadResult3 = loadResult;
                                            try {
                                                PageFetcherSnapshotState pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder3).state;
                                                LoadType loadType3 = LoadType.REFRESH;
                                                zInsert = pageFetcherSnapshotState3.insert(0, loadType3, (PagingSource.LoadResult.Page) loadResult3);
                                                MutableLoadStateCollection sourceLoadStates = pageFetcherSnapshotState3.getSourceLoadStates();
                                                LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
                                                sourceLoadStates.set(loadType3, companion.getIncomplete$paging_common_release());
                                                if (((PagingSource.LoadResult.Page) loadResult3).getPrevKey() == null) {
                                                    pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.PREPEND, companion.getComplete$paging_common_release());
                                                }
                                                if (((PagingSource.LoadResult.Page) loadResult3).getNextKey() == null) {
                                                    pageFetcherSnapshotState3.getSourceLoadStates().set(LoadType.APPEND, companion.getComplete$paging_common_release());
                                                }
                                                if (zInsert) {
                                                    PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                                                    if (pagingLogger2.isLoggable(2)) {
                                                        pagingLogger2.log(2, pageFetcherSnapshot3.loadResultLog(loadType3, pageFetcherSnapshot3.initialKey, null), null);
                                                    }
                                                    loadResult4 = loadResult3;
                                                    pageFetcherSnapshot4 = pageFetcherSnapshot3;
                                                    if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                                                if (pagingLogger3.isLoggable(3)) {
                                                    pagingLogger3.log(3, pageFetcherSnapshot3.loadResultLog(loadType3, pageFetcherSnapshot3.initialKey, loadResult3), null);
                                                }
                                                holder4 = pageFetcherSnapshot3.stateHolder;
                                                Mutex mutex9 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                                                c27551.L$0 = pageFetcherSnapshot3;
                                                c27551.L$1 = loadResult3;
                                                c27551.L$2 = holder4;
                                                c27551.L$3 = mutex9;
                                                c27551.label = 5;
                                                if (mutex9.lock(null, c27551) != coroutine_suspended) {
                                                    mutex4 = mutex9;
                                                    loadResult5 = loadResult3;
                                                    pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                                    PageFetcherSnapshotState pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                                    channel = pageFetcherSnapshot5.pageEventCh;
                                                    pageEvent$paging_common_release = pageFetcherSnapshotState4.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult5, LoadType.REFRESH);
                                                    c27551.L$0 = pageFetcherSnapshot5;
                                                    c27551.L$1 = loadResult5;
                                                    c27551.L$2 = mutex4;
                                                    c27551.L$3 = null;
                                                    c27551.label = 6;
                                                    if (channel.send(pageEvent$paging_common_release, c27551) == coroutine_suspended) {
                                                        loadResult4 = loadResult5;
                                                        pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                                        r2 = mutex4;
                                                        Unit unit2 = Unit.INSTANCE;
                                                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                                            PagingSource.LoadResult.Page page2 = (PagingSource.LoadResult.Page) loadResult4;
                                                            if (page2.getPrevKey() == null || page2.getNextKey() == null) {
                                                                holder5 = pageFetcherSnapshot4.stateHolder;
                                                                Mutex mutex10 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                                                c27551.L$0 = pageFetcherSnapshot4;
                                                                c27551.L$1 = loadResult4;
                                                                c27551.L$2 = holder5;
                                                                c27551.L$3 = mutex10;
                                                                c27551.label = 7;
                                                                if (mutex10.lock(null, c27551) != coroutine_suspended) {
                                                                    mutex5 = mutex10;
                                                                    pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                                                    try {
                                                                        PagingState<Key, Value> pagingStateCurrentPagingState$paging_common_release = ((PageFetcherSnapshotState.Holder) holder5).state.currentPagingState$paging_common_release(pageFetcherSnapshot6.hintHandler.getLastAccessHint());
                                                                        mutex5.unlock(null);
                                                                        page = (PagingSource.LoadResult.Page) loadResult4;
                                                                        if (page.getPrevKey() == null) {
                                                                            pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common_release);
                                                                        }
                                                                        if (page.getNextKey() == null) {
                                                                            pageFetcherSnapshot6.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common_release);
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        if (!(loadResult instanceof PagingSource.LoadResult.Error)) {
                                            if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                                                PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                                                if (pagingLogger4.isLoggable(2)) {
                                                    pagingLogger4.log(2, pageFetcherSnapshot2.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot2.initialKey, loadResult), null);
                                                }
                                                pageFetcherSnapshot2.onInvalidLoad();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        PagingLogger pagingLogger5 = PagingLogger.INSTANCE;
                                        if (pagingLogger5.isLoggable(2)) {
                                            pagingLogger5.log(2, pageFetcherSnapshot2.loadResultLog(LoadType.REFRESH, pageFetcherSnapshot2.initialKey, loadResult), null);
                                        }
                                        holder2 = pageFetcherSnapshot2.stateHolder;
                                        mutex2 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                                        c27551.L$0 = pageFetcherSnapshot2;
                                        c27551.L$1 = loadResult;
                                        c27551.L$2 = holder2;
                                        c27551.L$3 = mutex2;
                                        c27551.label = 8;
                                        if (mutex2.lock(null, c27551) != coroutine_suspended) {
                                            loadResult2 = loadResult;
                                            try {
                                                pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                                error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                                                loadType2 = LoadType.REFRESH;
                                                c27551.L$0 = mutex2;
                                                c27551.L$1 = null;
                                                c27551.L$2 = null;
                                                c27551.L$3 = null;
                                                c27551.label = 9;
                                                if (pageFetcherSnapshot2.setError(pageFetcherSnapshotState2, loadType2, error, c27551) != coroutine_suspended) {
                                                    mutex6 = mutex2;
                                                    Unit unit3 = Unit.INSTANCE;
                                                    mutex6.unlock(null);
                                                    return Unit.INSTANCE;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                mutex6 = mutex2;
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        Mutex mutex11 = (Mutex) c27551.L$2;
                        holder = (PageFetcherSnapshotState.Holder) c27551.L$1;
                        pageFetcherSnapshot = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        mutex = mutex11;
                        pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                        loadType = LoadType.REFRESH;
                        c27551.L$0 = pageFetcherSnapshot;
                        c27551.L$1 = mutex;
                        c27551.L$2 = null;
                        c27551.label = 2;
                        if (pageFetcherSnapshot.setLoading(pageFetcherSnapshotState, loadType, c27551) == coroutine_suspended) {
                        }
                        break;
                    case 2:
                        Mutex mutex12 = (Mutex) c27551.L$1;
                        pageFetcherSnapshot2 = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        r2 = mutex12;
                        Unit unit4 = Unit.INSTANCE;
                        r2.unlock(null);
                        PagingSource.LoadParams<Key> loadParams2 = pageFetcherSnapshot2.loadParams(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                        pagingLogger = PagingLogger.INSTANCE;
                        if (pagingLogger.isLoggable(3)) {
                        }
                        PagingSource<Key, Value> pagingSource2 = pageFetcherSnapshot2.pagingSource;
                        c27551.L$0 = pageFetcherSnapshot2;
                        c27551.L$1 = null;
                        c27551.label = 3;
                        objLoad = pagingSource2.load(loadParams2, c27551);
                        if (objLoad != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        PageFetcherSnapshot pageFetcherSnapshot7 = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        pageFetcherSnapshot2 = pageFetcherSnapshot7;
                        loadResult = (PagingSource.LoadResult) objLoad;
                        if (!(loadResult instanceof PagingSource.LoadResult.Page)) {
                        }
                        return coroutine_suspended;
                    case 4:
                        mutex3 = (Mutex) c27551.L$3;
                        holder3 = (PageFetcherSnapshotState.Holder) c27551.L$2;
                        loadResult3 = (PagingSource.LoadResult) c27551.L$1;
                        pageFetcherSnapshot3 = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        PageFetcherSnapshotState pageFetcherSnapshotState32 = ((PageFetcherSnapshotState.Holder) holder3).state;
                        LoadType loadType32 = LoadType.REFRESH;
                        zInsert = pageFetcherSnapshotState32.insert(0, loadType32, (PagingSource.LoadResult.Page) loadResult3);
                        MutableLoadStateCollection sourceLoadStates2 = pageFetcherSnapshotState32.getSourceLoadStates();
                        LoadState.NotLoading.Companion companion2 = LoadState.NotLoading.INSTANCE;
                        sourceLoadStates2.set(loadType32, companion2.getIncomplete$paging_common_release());
                        if (((PagingSource.LoadResult.Page) loadResult3).getPrevKey() == null) {
                        }
                        if (((PagingSource.LoadResult.Page) loadResult3).getNextKey() == null) {
                        }
                        if (zInsert) {
                        }
                        break;
                    case 5:
                        Mutex mutex13 = (Mutex) c27551.L$3;
                        holder4 = (PageFetcherSnapshotState.Holder) c27551.L$2;
                        loadResult5 = (PagingSource.LoadResult) c27551.L$1;
                        pageFetcherSnapshot5 = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        mutex4 = mutex13;
                        PageFetcherSnapshotState pageFetcherSnapshotState42 = ((PageFetcherSnapshotState.Holder) holder4).state;
                        channel = pageFetcherSnapshot5.pageEventCh;
                        pageEvent$paging_common_release = pageFetcherSnapshotState42.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult5, LoadType.REFRESH);
                        c27551.L$0 = pageFetcherSnapshot5;
                        c27551.L$1 = loadResult5;
                        c27551.L$2 = mutex4;
                        c27551.L$3 = null;
                        c27551.label = 6;
                        if (channel.send(pageEvent$paging_common_release, c27551) == coroutine_suspended) {
                        }
                        break;
                    case 6:
                        Mutex mutex14 = (Mutex) c27551.L$2;
                        loadResult4 = (PagingSource.LoadResult) c27551.L$1;
                        pageFetcherSnapshot4 = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        r2 = mutex14;
                        Unit unit22 = Unit.INSTANCE;
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        mutex5 = (Mutex) c27551.L$3;
                        holder5 = (PageFetcherSnapshotState.Holder) c27551.L$2;
                        loadResult4 = (PagingSource.LoadResult) c27551.L$1;
                        pageFetcherSnapshot6 = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        PagingState<Key, Value> pagingStateCurrentPagingState$paging_common_release2 = ((PageFetcherSnapshotState.Holder) holder5).state.currentPagingState$paging_common_release(pageFetcherSnapshot6.hintHandler.getLastAccessHint());
                        mutex5.unlock(null);
                        page = (PagingSource.LoadResult.Page) loadResult4;
                        if (page.getPrevKey() == null) {
                        }
                        if (page.getNextKey() == null) {
                        }
                        return Unit.INSTANCE;
                    case 8:
                        mutex2 = (Mutex) c27551.L$3;
                        holder2 = (PageFetcherSnapshotState.Holder) c27551.L$2;
                        loadResult2 = (PagingSource.LoadResult) c27551.L$1;
                        pageFetcherSnapshot2 = (PageFetcherSnapshot) c27551.L$0;
                        ResultKt.throwOnFailure(objLoad);
                        pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder2).state;
                        error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                        loadType2 = LoadType.REFRESH;
                        c27551.L$0 = mutex2;
                        c27551.L$1 = null;
                        c27551.L$2 = null;
                        c27551.L$3 = null;
                        c27551.label = 9;
                        if (pageFetcherSnapshot2.setError(pageFetcherSnapshotState2, loadType2, error, c27551) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 9:
                        mutex6 = (Mutex) c27551.L$0;
                        try {
                            ResultKt.throwOnFailure(objLoad);
                            Unit unit32 = Unit.INSTANCE;
                            mutex6.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0357, code lost:
    
        r0 = r8;
        r8 = r9;
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:209:0x0665, B:212:0x0670], limit reached: 255 */
    /* JADX WARN: Path cross not found for [B:215:0x0675, B:218:0x067f], limit reached: 255 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05b6 A[Catch: all -> 0x05e9, TRY_LEAVE, TryCatch #5 {all -> 0x05e9, blocks: (B:182:0x05a8, B:184:0x05b6), top: B:259:0x05a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0606 A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:188:0x05e2, B:193:0x05ef, B:195:0x0606, B:197:0x0612, B:199:0x061a, B:201:0x0627, B:200:0x0621, B:202:0x062a, B:206:0x065b, B:14:0x0087, B:19:0x00bb), top: B:265:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x061a A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:188:0x05e2, B:193:0x05ef, B:195:0x0606, B:197:0x0612, B:199:0x061a, B:201:0x0627, B:200:0x0621, B:202:0x062a, B:206:0x065b, B:14:0x0087, B:19:0x00bb), top: B:265:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0621 A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:188:0x05e2, B:193:0x05ef, B:195:0x0606, B:197:0x0612, B:199:0x061a, B:201:0x0627, B:200:0x0621, B:202:0x062a, B:206:0x065b, B:14:0x0087, B:19:0x00bb), top: B:265:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06f9 A[Catch: all -> 0x0255, TRY_ENTER, TryCatch #3 {all -> 0x0255, blocks: (B:43:0x0221, B:68:0x02d4, B:50:0x0238, B:52:0x0248, B:55:0x0259, B:57:0x0263, B:59:0x027c, B:60:0x027f, B:62:0x029a, B:65:0x02b8, B:67:0x02d1, B:244:0x06f9, B:245:0x06fe), top: B:256:0x0221 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0323 A[Catch: all -> 0x0347, TRY_LEAVE, TryCatch #4 {all -> 0x0347, blocks: (B:73:0x030a, B:75:0x0323), top: B:257:0x030a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c0  */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v49, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v51, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r14v30, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v58, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x06b0 -> B:250:0x06b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doLoad(LoadType loadType, GenerationalViewportHint generationalViewportHint, Continuation<? super Unit> continuation) throws Throwable {
        C27561 c27561;
        Ref.IntRef intRef;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        Mutex mutex;
        GenerationalViewportHint generationalViewportHint2;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        int i;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        Mutex mutex2;
        Ref.IntRef intRef2;
        LoadType loadType2;
        Ref.ObjectRef objectRef;
        PageFetcherSnapshot pageFetcherSnapshot2;
        GenerationalViewportHint generationalViewportHint3;
        Ref.ObjectRef objectRef2;
        Mutex mutex3;
        Object objNextLoadKeyOrNull;
        ?? r2;
        Object obj;
        ?? r12;
        Ref.BooleanRef booleanRef;
        PageFetcherSnapshot pageFetcherSnapshot3;
        GenerationalViewportHint generationalViewportHint4;
        LoadType loadType3;
        ?? r9;
        Ref.ObjectRef objectRef3;
        Ref.IntRef intRef3;
        PagingSource.LoadParams<Key> loadParams;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        Ref.BooleanRef booleanRef2;
        PagingSource.LoadResult loadResult;
        Mutex mutex4;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        PagingSource.LoadResult loadResult2;
        Mutex mutex5;
        C27561 c275612;
        LoadType loadType4;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState;
        Mutex mutex6;
        GenerationalViewportHint generationalViewportHint5;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        LoadType loadType5;
        PageFetcherSnapshot pageFetcherSnapshot4;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef4;
        Ref.IntRef intRef4;
        GenerationalViewportHint generationalViewportHint6;
        LoadType loadType6;
        Mutex mutex7;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState2;
        PagingSource.LoadResult loadResult3;
        LoadType loadType7;
        PageFetcherSnapshot pageFetcherSnapshot5;
        PagingSource.LoadResult loadResult4;
        PagingSource.LoadParams<Key> loadParams2;
        Ref.BooleanRef booleanRef4;
        Ref.ObjectRef objectRef5;
        PageFetcherSnapshot pageFetcherSnapshot6;
        Throwable th;
        PageFetcherSnapshot pageFetcherSnapshot7;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState3;
        LoadState.Error error;
        Mutex mutex8;
        int i2;
        int i3;
        PageFetcherSnapshotState.Holder<Key, Value> holder6;
        Mutex mutex9;
        Ref.BooleanRef booleanRef5;
        Mutex mutex10;
        ?? NextLoadKeyOrNull;
        PageEvent<Value> pageEvent$paging_common_release;
        Channel<PageEvent<Value>> channel;
        PageEvent.Drop<Value> dropDropEventOrNull;
        PageFetcherSnapshot pageFetcherSnapshot8;
        ?? r14;
        Throwable th2;
        Object prevKey;
        Object obj2;
        Object obj3;
        LoadType loadType8 = loadType;
        if (continuation instanceof C27561) {
            c27561 = (C27561) continuation;
            int i4 = c27561.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c27561.label = i4 - Integer.MIN_VALUE;
            } else {
                c27561 = new C27561(this, continuation);
            }
        }
        Object obj4 = c27561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = c27561.label;
        try {
            switch (r5) {
                case 0:
                    ResultKt.throwOnFailure(obj4);
                    if (loadType8 == LoadType.REFRESH) {
                        throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
                    }
                    intRef = new Ref.IntRef();
                    holder = this.stateHolder;
                    mutex = ((PageFetcherSnapshotState.Holder) holder).lock;
                    c27561.L$0 = this;
                    c27561.L$1 = loadType8;
                    generationalViewportHint2 = generationalViewportHint;
                    c27561.L$2 = generationalViewportHint2;
                    c27561.L$3 = intRef;
                    c27561.L$4 = holder;
                    c27561.L$5 = mutex;
                    c27561.label = 1;
                    if (mutex.lock(null, c27561) != coroutine_suspended) {
                        pageFetcherSnapshot = this;
                        try {
                            PageFetcherSnapshotState pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder).state;
                            i = WhenMappings.$EnumSwitchMapping$0[loadType8.ordinal()];
                            if (i != 1) {
                                throw new IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                            }
                            if (i == 2) {
                                int initialPageIndex = (pageFetcherSnapshotState4.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetFirst()) - 1;
                                if (initialPageIndex > CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release())) {
                                    intRef.element += pageFetcherSnapshot.config.pageSize * (initialPageIndex - CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release()));
                                    initialPageIndex = CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release());
                                }
                                if (initialPageIndex >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        intRef.element += pageFetcherSnapshotState4.getPages$paging_common_release().get(i5).getData().size();
                                        if (i5 != initialPageIndex) {
                                            i5++;
                                        }
                                    }
                                }
                            } else if (i == 3) {
                                int initialPageIndex2 = pageFetcherSnapshotState4.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetLast() + 1;
                                if (initialPageIndex2 < 0) {
                                    intRef.element += pageFetcherSnapshot.config.pageSize * (-initialPageIndex2);
                                    initialPageIndex2 = 0;
                                }
                                int lastIndex = CollectionsKt.getLastIndex(pageFetcherSnapshotState4.getPages$paging_common_release());
                                if (initialPageIndex2 <= lastIndex) {
                                    while (true) {
                                        intRef.element += pageFetcherSnapshotState4.getPages$paging_common_release().get(initialPageIndex2).getData().size();
                                        if (initialPageIndex2 != lastIndex) {
                                            initialPageIndex2++;
                                        }
                                    }
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            mutex.unlock(null);
                            Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                            PageFetcherSnapshotState.Holder<Key, Value> holder7 = pageFetcherSnapshot.stateHolder;
                            Mutex mutex11 = ((PageFetcherSnapshotState.Holder) holder7).lock;
                            c27561.L$0 = pageFetcherSnapshot;
                            c27561.L$1 = loadType8;
                            c27561.L$2 = generationalViewportHint2;
                            c27561.L$3 = intRef;
                            c27561.L$4 = objectRef6;
                            c27561.L$5 = holder7;
                            c27561.L$6 = mutex11;
                            c27561.L$7 = objectRef6;
                            c27561.label = 2;
                            if (mutex11.lock(null, c27561) != coroutine_suspended) {
                                Ref.IntRef intRef5 = intRef;
                                holder2 = holder7;
                                mutex2 = mutex11;
                                intRef2 = intRef5;
                                loadType2 = loadType8;
                                objectRef = objectRef6;
                                pageFetcherSnapshot2 = pageFetcherSnapshot;
                                generationalViewportHint3 = generationalViewportHint2;
                                objectRef2 = objectRef;
                                try {
                                    PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState5 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                    objNextLoadKeyOrNull = pageFetcherSnapshot2.nextLoadKeyOrNull(pageFetcherSnapshotState5, loadType2, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType2) + intRef2.element);
                                    if (objNextLoadKeyOrNull != null) {
                                        r2 = 0;
                                        r12 = pageFetcherSnapshot2;
                                        mutex2.unlock(null);
                                        objectRef.element = r2;
                                        booleanRef = new Ref.BooleanRef();
                                        obj2 = objectRef2.element;
                                        if (obj2 != null) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    c27561.L$0 = pageFetcherSnapshot2;
                                    c27561.L$1 = loadType2;
                                    c27561.L$2 = generationalViewportHint3;
                                    c27561.L$3 = intRef2;
                                    c27561.L$4 = objectRef2;
                                    c27561.L$5 = mutex2;
                                    c27561.L$6 = objNextLoadKeyOrNull;
                                    c27561.L$7 = objectRef;
                                    c27561.label = 3;
                                    if (pageFetcherSnapshot2.setLoading(pageFetcherSnapshotState5, loadType2, c27561) != coroutine_suspended) {
                                        mutex3 = mutex2;
                                        obj = objNextLoadKeyOrNull;
                                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                        r2 = obj;
                                        mutex2 = mutex3;
                                        r12 = pageFetcherSnapshot3;
                                        mutex2.unlock(null);
                                        objectRef.element = r2;
                                        booleanRef = new Ref.BooleanRef();
                                        obj2 = objectRef2.element;
                                        if (obj2 != null) {
                                            PagingSource.LoadParams<Key> loadParams3 = r12.loadParams(loadType2, obj2);
                                            PagingLogger pagingLogger = PagingLogger.INSTANCE;
                                            if (pagingLogger.isLoggable(3)) {
                                                obj3 = null;
                                                pagingLogger.log(3, "Start " + loadType2 + " with loadKey " + objectRef2.element + " on " + r12.pagingSource, null);
                                            } else {
                                                obj3 = null;
                                            }
                                            PagingSource<Key, Value> pagingSource = r12.pagingSource;
                                            c27561.L$0 = r12;
                                            c27561.L$1 = loadType2;
                                            c27561.L$2 = generationalViewportHint3;
                                            c27561.L$3 = intRef2;
                                            c27561.L$4 = objectRef2;
                                            c27561.L$5 = booleanRef;
                                            c27561.L$6 = loadParams3;
                                            c27561.L$7 = obj3;
                                            c27561.L$8 = obj3;
                                            c27561.label = 4;
                                            Object objLoad = pagingSource.load(loadParams3, c27561);
                                            if (objLoad != coroutine_suspended) {
                                                loadType3 = loadType2;
                                                intRef3 = intRef2;
                                                r9 = r12;
                                                generationalViewportHint4 = generationalViewportHint3;
                                                objectRef3 = objectRef2;
                                                loadParams = loadParams3;
                                                obj4 = objLoad;
                                                loadResult = (PagingSource.LoadResult) obj4;
                                                if (loadResult instanceof PagingSource.LoadResult.Page) {
                                                    int i6 = WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()];
                                                    if (i6 == 2) {
                                                        prevKey = ((PagingSource.LoadResult.Page) loadResult).getPrevKey();
                                                    } else {
                                                        if (i6 != 3) {
                                                            throw new IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
                                                        }
                                                        prevKey = ((PagingSource.LoadResult.Page) loadResult).getNextKey();
                                                    }
                                                    if (!r9.pagingSource.getKeyReuseSupported() && Intrinsics.areEqual(prevKey, objectRef3.element)) {
                                                        throw new IllegalStateException(StringsKt.trimMargin$default("The same value, " + objectRef3.element + ", was passed as the " + (loadType3 == LoadType.PREPEND ? "prevKey" : "nextKey") + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ", null, 1, null).toString());
                                                    }
                                                    holder3 = r9.stateHolder;
                                                    mutex4 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                                                    c27561.L$0 = r9;
                                                    c27561.L$1 = loadType3;
                                                    c27561.L$2 = generationalViewportHint4;
                                                    c27561.L$3 = intRef3;
                                                    c27561.L$4 = objectRef3;
                                                    c27561.L$5 = booleanRef;
                                                    c27561.L$6 = loadParams;
                                                    c27561.L$7 = loadResult;
                                                    c27561.L$8 = holder3;
                                                    c27561.L$9 = mutex4;
                                                    c27561.label = 5;
                                                    if (mutex4.lock(null, c27561) != coroutine_suspended) {
                                                        r14 = r9;
                                                        booleanRef2 = booleanRef;
                                                        try {
                                                            if (((PageFetcherSnapshotState.Holder) holder3).state.insert(generationalViewportHint4.getGenerationId(), loadType3, (PagingSource.LoadResult.Page) loadResult)) {
                                                                PagingLogger pagingLogger2 = PagingLogger.INSTANCE;
                                                                if (pagingLogger2.isLoggable(2)) {
                                                                    pagingLogger2.log(2, r14.loadResultLog(loadType3, objectRef3.element, th2), th2);
                                                                }
                                                            } else {
                                                                PagingLogger pagingLogger3 = PagingLogger.INSTANCE;
                                                                if (pagingLogger3.isLoggable(3)) {
                                                                    pagingLogger3.log(3, r14.loadResultLog(loadType3, objectRef3.element, loadResult), th2);
                                                                }
                                                                PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) loadResult;
                                                                intRef3.element += page.getData().size();
                                                                if ((loadType3 == LoadType.PREPEND && page.getPrevKey() == null) || (loadType3 == LoadType.APPEND && page.getNextKey() == null)) {
                                                                    booleanRef2.element = true;
                                                                }
                                                                booleanRef = booleanRef2;
                                                                pageFetcherSnapshot8 = r14;
                                                                if (WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()] != 2) {
                                                                }
                                                                holder5 = pageFetcherSnapshot8.stateHolder;
                                                                mutex7 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                                                c27561.L$0 = pageFetcherSnapshot8;
                                                                c27561.L$1 = loadType3;
                                                                c27561.L$2 = generationalViewportHint4;
                                                                c27561.L$3 = intRef3;
                                                                c27561.L$4 = objectRef3;
                                                                c27561.L$5 = booleanRef;
                                                                c27561.L$6 = loadParams;
                                                                c27561.L$7 = loadResult;
                                                                c27561.L$8 = loadType6;
                                                                c27561.L$9 = holder5;
                                                                c27561.L$10 = mutex7;
                                                                c27561.label = 8;
                                                                Ref.BooleanRef booleanRef6 = booleanRef;
                                                                if (mutex7.lock(null, c27561) != coroutine_suspended) {
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                                                    PagingLogger pagingLogger4 = PagingLogger.INSTANCE;
                                                    if (pagingLogger4.isLoggable(2)) {
                                                        pagingLogger4.log(2, r9.loadResultLog(loadType3, objectRef3.element, loadResult), null);
                                                    }
                                                    holder4 = r9.stateHolder;
                                                    Mutex mutex12 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                                                    c27561.L$0 = r9;
                                                    c27561.L$1 = loadType3;
                                                    c27561.L$2 = generationalViewportHint4;
                                                    c27561.L$3 = loadResult;
                                                    c27561.L$4 = holder4;
                                                    c27561.L$5 = mutex12;
                                                    c27561.L$6 = null;
                                                    c27561.label = 6;
                                                    if (mutex12.lock(null, c27561) != coroutine_suspended) {
                                                        loadResult2 = loadResult;
                                                        mutex5 = mutex12;
                                                        c275612 = c27561;
                                                        loadType4 = loadType3;
                                                        pageFetcherSnapshot7 = r9;
                                                        try {
                                                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                                                            c275612.L$0 = loadType4;
                                                            c275612.L$1 = generationalViewportHint4;
                                                            c275612.L$2 = mutex5;
                                                            c275612.L$3 = pageFetcherSnapshotState3;
                                                            c275612.L$4 = null;
                                                            c275612.L$5 = null;
                                                            c275612.label = 7;
                                                            if (pageFetcherSnapshot7.setError(pageFetcherSnapshotState3, loadType4, error, c275612) != coroutine_suspended) {
                                                                mutex6 = mutex5;
                                                                pageFetcherSnapshotState = pageFetcherSnapshotState3;
                                                                generationalViewportHint5 = generationalViewportHint4;
                                                                pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common_release().put(loadType4, generationalViewportHint5.getHint());
                                                                Unit unit2 = Unit.INSTANCE;
                                                                mutex6.unlock(null);
                                                                return Unit.INSTANCE;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            mutex6 = mutex5;
                                                            mutex6.unlock(null);
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    pageFetcherSnapshot8 = r9;
                                                    if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                                                        PagingLogger pagingLogger5 = PagingLogger.INSTANCE;
                                                        if (pagingLogger5.isLoggable(2)) {
                                                            pagingLogger5.log(2, r9.loadResultLog(loadType3, objectRef3.element, loadResult), null);
                                                        }
                                                        r9.onInvalidLoad();
                                                        return Unit.INSTANCE;
                                                    }
                                                    loadType6 = WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()] != 2 ? LoadType.APPEND : LoadType.PREPEND;
                                                    holder5 = pageFetcherSnapshot8.stateHolder;
                                                    mutex7 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                                    c27561.L$0 = pageFetcherSnapshot8;
                                                    c27561.L$1 = loadType3;
                                                    c27561.L$2 = generationalViewportHint4;
                                                    c27561.L$3 = intRef3;
                                                    c27561.L$4 = objectRef3;
                                                    c27561.L$5 = booleanRef;
                                                    c27561.L$6 = loadParams;
                                                    c27561.L$7 = loadResult;
                                                    c27561.L$8 = loadType6;
                                                    c27561.L$9 = holder5;
                                                    c27561.L$10 = mutex7;
                                                    c27561.label = 8;
                                                    Ref.BooleanRef booleanRef62 = booleanRef;
                                                    if (mutex7.lock(null, c27561) != coroutine_suspended) {
                                                        loadType5 = loadType3;
                                                        generationalViewportHint6 = generationalViewportHint4;
                                                        intRef4 = intRef3;
                                                        objectRef4 = objectRef3;
                                                        pageFetcherSnapshot4 = pageFetcherSnapshot8;
                                                        booleanRef3 = booleanRef62;
                                                        try {
                                                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                                            dropDropEventOrNull = pageFetcherSnapshotState2.dropEventOrNull(loadType6, generationalViewportHint6.getHint());
                                                            if (dropDropEventOrNull == null) {
                                                                pageFetcherSnapshotState2.drop(dropDropEventOrNull);
                                                                Channel<PageEvent<Value>> channel2 = pageFetcherSnapshot4.pageEventCh;
                                                                c27561.L$0 = pageFetcherSnapshot4;
                                                                c27561.L$1 = loadType5;
                                                                c27561.L$2 = generationalViewportHint6;
                                                                c27561.L$3 = intRef4;
                                                                c27561.L$4 = objectRef4;
                                                                c27561.L$5 = booleanRef3;
                                                                c27561.L$6 = loadParams;
                                                                c27561.L$7 = loadResult;
                                                                c27561.L$8 = mutex7;
                                                                c27561.L$9 = pageFetcherSnapshotState2;
                                                                c27561.L$10 = null;
                                                                c27561.label = 9;
                                                                if (channel2.send(dropDropEventOrNull, c27561) != coroutine_suspended) {
                                                                    r5 = mutex7;
                                                                    loadType7 = loadType5;
                                                                    loadResult3 = loadResult;
                                                                    pageFetcherSnapshot5 = pageFetcherSnapshot4;
                                                                    Unit unit3 = Unit.INSTANCE;
                                                                    loadResult = loadResult3;
                                                                    pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                                                    loadType5 = loadType7;
                                                                    mutex10 = r5;
                                                                    loadParams2 = loadParams;
                                                                    NextLoadKeyOrNull = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType5) + intRef4.element);
                                                                    objectRef4.element = NextLoadKeyOrNull;
                                                                    if (NextLoadKeyOrNull == 0 && !(pageFetcherSnapshotState2.getSourceLoadStates().get(loadType5) instanceof LoadState.Error)) {
                                                                        pageFetcherSnapshotState2.getSourceLoadStates().set(loadType5, !booleanRef3.element ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                                                    }
                                                                    pageEvent$paging_common_release = pageFetcherSnapshotState2.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult, loadType5);
                                                                    channel = pageFetcherSnapshot4.pageEventCh;
                                                                    c27561.L$0 = pageFetcherSnapshot4;
                                                                    c27561.L$1 = loadType5;
                                                                    c27561.L$2 = generationalViewportHint6;
                                                                    c27561.L$3 = intRef4;
                                                                    c27561.L$4 = objectRef4;
                                                                    c27561.L$5 = booleanRef3;
                                                                    c27561.L$6 = loadParams2;
                                                                    c27561.L$7 = loadResult;
                                                                    c27561.L$8 = mutex10;
                                                                    c27561.L$9 = null;
                                                                    c27561.L$10 = null;
                                                                    c27561.label = 10;
                                                                    if (channel.send(pageEvent$paging_common_release, c27561) != coroutine_suspended) {
                                                                        loadResult4 = loadResult;
                                                                        booleanRef4 = booleanRef3;
                                                                        pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                                                        objectRef5 = objectRef4;
                                                                        generationalViewportHint3 = generationalViewportHint6;
                                                                        loadType2 = loadType5;
                                                                        mutex8 = mutex10;
                                                                        Unit unit4 = Unit.INSTANCE;
                                                                        mutex8.unlock(null);
                                                                        i2 = ((loadParams2 instanceof PagingSource.LoadParams.Prepend) || ((PagingSource.LoadResult.Page) loadResult4).getPrevKey() != null) ? 0 : 1;
                                                                        i3 = ((loadParams2 instanceof PagingSource.LoadParams.Append) || ((PagingSource.LoadResult.Page) loadResult4).getNextKey() != null) ? 0 : 1;
                                                                        if (pageFetcherSnapshot6.remoteMediatorConnection != null || (i2 == 0 && i3 == 0)) {
                                                                            booleanRef = booleanRef4;
                                                                            objectRef2 = objectRef5;
                                                                            intRef2 = intRef4;
                                                                            r12 = pageFetcherSnapshot6;
                                                                            obj2 = objectRef2.element;
                                                                            if (obj2 != null) {
                                                                            }
                                                                        } else {
                                                                            holder6 = pageFetcherSnapshot6.stateHolder;
                                                                            mutex9 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                                                            c27561.L$0 = pageFetcherSnapshot6;
                                                                            c27561.L$1 = loadType2;
                                                                            c27561.L$2 = generationalViewportHint3;
                                                                            c27561.L$3 = intRef4;
                                                                            c27561.L$4 = objectRef5;
                                                                            c27561.L$5 = booleanRef4;
                                                                            c27561.L$6 = holder6;
                                                                            c27561.L$7 = mutex9;
                                                                            c27561.L$8 = null;
                                                                            c27561.I$0 = i2;
                                                                            c27561.I$1 = i3;
                                                                            c27561.label = 11;
                                                                            if (mutex9.lock(null, c27561) != coroutine_suspended) {
                                                                                PageFetcherSnapshot pageFetcherSnapshot9 = pageFetcherSnapshot6;
                                                                                booleanRef5 = booleanRef4;
                                                                                objectRef2 = objectRef5;
                                                                                intRef2 = intRef4;
                                                                                r12 = pageFetcherSnapshot9;
                                                                                try {
                                                                                    PagingState<Key, Value> pagingStateCurrentPagingState$paging_common_release = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common_release(r12.hintHandler.getLastAccessHint());
                                                                                    if (i2 != 0) {
                                                                                        r12.remoteMediatorConnection.requestLoad(LoadType.PREPEND, pagingStateCurrentPagingState$paging_common_release);
                                                                                    }
                                                                                    if (i3 != 0) {
                                                                                        r12.remoteMediatorConnection.requestLoad(LoadType.APPEND, pagingStateCurrentPagingState$paging_common_release);
                                                                                    }
                                                                                    booleanRef = booleanRef5;
                                                                                    obj2 = objectRef2.element;
                                                                                    if (obj2 != null) {
                                                                                    }
                                                                                } finally {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                mutex10 = mutex7;
                                                                loadParams2 = loadParams;
                                                                NextLoadKeyOrNull = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType5) + intRef4.element);
                                                                objectRef4.element = NextLoadKeyOrNull;
                                                                if (NextLoadKeyOrNull == 0) {
                                                                    pageFetcherSnapshotState2.getSourceLoadStates().set(loadType5, !booleanRef3.element ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                                                }
                                                                pageEvent$paging_common_release = pageFetcherSnapshotState2.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult, loadType5);
                                                                channel = pageFetcherSnapshot4.pageEventCh;
                                                                c27561.L$0 = pageFetcherSnapshot4;
                                                                c27561.L$1 = loadType5;
                                                                c27561.L$2 = generationalViewportHint6;
                                                                c27561.L$3 = intRef4;
                                                                c27561.L$4 = objectRef4;
                                                                c27561.L$5 = booleanRef3;
                                                                c27561.L$6 = loadParams2;
                                                                c27561.L$7 = loadResult;
                                                                c27561.L$8 = mutex10;
                                                                c27561.L$9 = null;
                                                                c27561.L$10 = null;
                                                                c27561.label = 10;
                                                                if (channel.send(pageEvent$paging_common_release, c27561) != coroutine_suspended) {
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            r5 = mutex7;
                                                            r5.unlock(null);
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            mutex.unlock(null);
                            throw th6;
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    Mutex mutex13 = (Mutex) c27561.L$5;
                    holder = (PageFetcherSnapshotState.Holder) c27561.L$4;
                    intRef = (Ref.IntRef) c27561.L$3;
                    generationalViewportHint2 = (GenerationalViewportHint) c27561.L$2;
                    LoadType loadType9 = (LoadType) c27561.L$1;
                    pageFetcherSnapshot = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    mutex = mutex13;
                    loadType8 = loadType9;
                    PageFetcherSnapshotState pageFetcherSnapshotState42 = ((PageFetcherSnapshotState.Holder) holder).state;
                    i = WhenMappings.$EnumSwitchMapping$0[loadType8.ordinal()];
                    if (i != 1) {
                    }
                    break;
                case 2:
                    objectRef = (Ref.ObjectRef) c27561.L$7;
                    mutex2 = (Mutex) c27561.L$6;
                    holder2 = (PageFetcherSnapshotState.Holder) c27561.L$5;
                    objectRef2 = (Ref.ObjectRef) c27561.L$4;
                    intRef2 = (Ref.IntRef) c27561.L$3;
                    generationalViewportHint3 = (GenerationalViewportHint) c27561.L$2;
                    loadType2 = (LoadType) c27561.L$1;
                    PageFetcherSnapshot pageFetcherSnapshot10 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    pageFetcherSnapshot2 = pageFetcherSnapshot10;
                    PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState52 = ((PageFetcherSnapshotState.Holder) holder2).state;
                    objNextLoadKeyOrNull = pageFetcherSnapshot2.nextLoadKeyOrNull(pageFetcherSnapshotState52, loadType2, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType2) + intRef2.element);
                    if (objNextLoadKeyOrNull != null) {
                    }
                    break;
                case 3:
                    objectRef = (Ref.ObjectRef) c27561.L$7;
                    obj = c27561.L$6;
                    mutex3 = (Mutex) c27561.L$5;
                    objectRef2 = (Ref.ObjectRef) c27561.L$4;
                    intRef2 = (Ref.IntRef) c27561.L$3;
                    generationalViewportHint3 = (GenerationalViewportHint) c27561.L$2;
                    loadType2 = (LoadType) c27561.L$1;
                    PageFetcherSnapshot pageFetcherSnapshot11 = (PageFetcherSnapshot) c27561.L$0;
                    try {
                        ResultKt.throwOnFailure(obj4);
                        pageFetcherSnapshot3 = pageFetcherSnapshot11;
                        r2 = obj;
                        mutex2 = mutex3;
                        r12 = pageFetcherSnapshot3;
                        mutex2.unlock(null);
                        objectRef.element = r2;
                        booleanRef = new Ref.BooleanRef();
                        obj2 = objectRef2.element;
                        if (obj2 != null) {
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th7) {
                        th = th7;
                        mutex3.unlock(null);
                        throw th;
                    }
                case 4:
                    PagingSource.LoadParams<Key> loadParams4 = (PagingSource.LoadParams) c27561.L$6;
                    Ref.BooleanRef booleanRef7 = (Ref.BooleanRef) c27561.L$5;
                    Ref.ObjectRef objectRef7 = (Ref.ObjectRef) c27561.L$4;
                    Ref.IntRef intRef6 = (Ref.IntRef) c27561.L$3;
                    GenerationalViewportHint generationalViewportHint7 = (GenerationalViewportHint) c27561.L$2;
                    LoadType loadType10 = (LoadType) c27561.L$1;
                    PageFetcherSnapshot pageFetcherSnapshot12 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    generationalViewportHint4 = generationalViewportHint7;
                    loadType3 = loadType10;
                    r9 = pageFetcherSnapshot12;
                    objectRef3 = objectRef7;
                    intRef3 = intRef6;
                    loadParams = loadParams4;
                    booleanRef = booleanRef7;
                    loadResult = (PagingSource.LoadResult) obj4;
                    if (loadResult instanceof PagingSource.LoadResult.Page) {
                    }
                    return coroutine_suspended;
                case 5:
                    Mutex mutex14 = (Mutex) c27561.L$9;
                    holder3 = (PageFetcherSnapshotState.Holder) c27561.L$8;
                    PagingSource.LoadResult loadResult5 = (PagingSource.LoadResult) c27561.L$7;
                    loadParams = (PagingSource.LoadParams) c27561.L$6;
                    booleanRef2 = (Ref.BooleanRef) c27561.L$5;
                    objectRef3 = (Ref.ObjectRef) c27561.L$4;
                    intRef3 = (Ref.IntRef) c27561.L$3;
                    generationalViewportHint4 = (GenerationalViewportHint) c27561.L$2;
                    loadType3 = (LoadType) c27561.L$1;
                    PageFetcherSnapshot pageFetcherSnapshot13 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    loadResult = loadResult5;
                    mutex4 = mutex14;
                    r14 = pageFetcherSnapshot13;
                    if (((PageFetcherSnapshotState.Holder) holder3).state.insert(generationalViewportHint4.getGenerationId(), loadType3, (PagingSource.LoadResult.Page) loadResult)) {
                    }
                    break;
                case 6:
                    Mutex mutex15 = (Mutex) c27561.L$5;
                    holder4 = (PageFetcherSnapshotState.Holder) c27561.L$4;
                    loadResult2 = (PagingSource.LoadResult) c27561.L$3;
                    GenerationalViewportHint generationalViewportHint8 = (GenerationalViewportHint) c27561.L$2;
                    LoadType loadType11 = (LoadType) c27561.L$1;
                    PageFetcherSnapshot pageFetcherSnapshot14 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    mutex5 = mutex15;
                    c275612 = c27561;
                    generationalViewportHint4 = generationalViewportHint8;
                    loadType4 = loadType11;
                    pageFetcherSnapshot7 = pageFetcherSnapshot14;
                    pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder4).state;
                    error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).getThrowable());
                    c275612.L$0 = loadType4;
                    c275612.L$1 = generationalViewportHint4;
                    c275612.L$2 = mutex5;
                    c275612.L$3 = pageFetcherSnapshotState3;
                    c275612.L$4 = null;
                    c275612.L$5 = null;
                    c275612.label = 7;
                    if (pageFetcherSnapshot7.setError(pageFetcherSnapshotState3, loadType4, error, c275612) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 7:
                    pageFetcherSnapshotState = (PageFetcherSnapshotState) c27561.L$3;
                    mutex6 = (Mutex) c27561.L$2;
                    generationalViewportHint5 = (GenerationalViewportHint) c27561.L$1;
                    loadType4 = (LoadType) c27561.L$0;
                    try {
                        ResultKt.throwOnFailure(obj4);
                        pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common_release().put(loadType4, generationalViewportHint5.getHint());
                        Unit unit22 = Unit.INSTANCE;
                        mutex6.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th8) {
                        th = th8;
                        mutex6.unlock(null);
                        throw th;
                    }
                case 8:
                    Mutex mutex16 = (Mutex) c27561.L$10;
                    holder5 = (PageFetcherSnapshotState.Holder) c27561.L$9;
                    LoadType loadType12 = (LoadType) c27561.L$8;
                    PagingSource.LoadResult loadResult6 = (PagingSource.LoadResult) c27561.L$7;
                    PagingSource.LoadParams<Key> loadParams5 = (PagingSource.LoadParams) c27561.L$6;
                    Ref.BooleanRef booleanRef8 = (Ref.BooleanRef) c27561.L$5;
                    Ref.ObjectRef objectRef8 = (Ref.ObjectRef) c27561.L$4;
                    Ref.IntRef intRef7 = (Ref.IntRef) c27561.L$3;
                    GenerationalViewportHint generationalViewportHint9 = (GenerationalViewportHint) c27561.L$2;
                    loadType5 = (LoadType) c27561.L$1;
                    pageFetcherSnapshot4 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    loadResult = loadResult6;
                    loadParams = loadParams5;
                    booleanRef3 = booleanRef8;
                    objectRef4 = objectRef8;
                    intRef4 = intRef7;
                    generationalViewportHint6 = generationalViewportHint9;
                    loadType6 = loadType12;
                    mutex7 = mutex16;
                    pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder5).state;
                    dropDropEventOrNull = pageFetcherSnapshotState2.dropEventOrNull(loadType6, generationalViewportHint6.getHint());
                    if (dropDropEventOrNull == null) {
                    }
                    break;
                case 9:
                    pageFetcherSnapshotState2 = (PageFetcherSnapshotState) c27561.L$9;
                    Mutex mutex17 = (Mutex) c27561.L$8;
                    loadResult3 = (PagingSource.LoadResult) c27561.L$7;
                    loadParams = (PagingSource.LoadParams) c27561.L$6;
                    booleanRef3 = (Ref.BooleanRef) c27561.L$5;
                    objectRef4 = (Ref.ObjectRef) c27561.L$4;
                    intRef4 = (Ref.IntRef) c27561.L$3;
                    generationalViewportHint6 = (GenerationalViewportHint) c27561.L$2;
                    loadType7 = (LoadType) c27561.L$1;
                    pageFetcherSnapshot5 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    r5 = mutex17;
                    Unit unit32 = Unit.INSTANCE;
                    loadResult = loadResult3;
                    pageFetcherSnapshot4 = pageFetcherSnapshot5;
                    loadType5 = loadType7;
                    mutex10 = r5;
                    loadParams2 = loadParams;
                    NextLoadKeyOrNull = pageFetcherSnapshot4.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common_release(loadType5) + intRef4.element);
                    objectRef4.element = NextLoadKeyOrNull;
                    if (NextLoadKeyOrNull == 0) {
                    }
                    pageEvent$paging_common_release = pageFetcherSnapshotState2.toPageEvent$paging_common_release((PagingSource.LoadResult.Page) loadResult, loadType5);
                    channel = pageFetcherSnapshot4.pageEventCh;
                    c27561.L$0 = pageFetcherSnapshot4;
                    c27561.L$1 = loadType5;
                    c27561.L$2 = generationalViewportHint6;
                    c27561.L$3 = intRef4;
                    c27561.L$4 = objectRef4;
                    c27561.L$5 = booleanRef3;
                    c27561.L$6 = loadParams2;
                    c27561.L$7 = loadResult;
                    c27561.L$8 = mutex10;
                    c27561.L$9 = null;
                    c27561.L$10 = null;
                    c27561.label = 10;
                    if (channel.send(pageEvent$paging_common_release, c27561) != coroutine_suspended) {
                    }
                    break;
                case 10:
                    Mutex mutex18 = (Mutex) c27561.L$8;
                    loadResult4 = (PagingSource.LoadResult) c27561.L$7;
                    loadParams2 = (PagingSource.LoadParams) c27561.L$6;
                    booleanRef4 = (Ref.BooleanRef) c27561.L$5;
                    objectRef5 = (Ref.ObjectRef) c27561.L$4;
                    Ref.IntRef intRef8 = (Ref.IntRef) c27561.L$3;
                    GenerationalViewportHint generationalViewportHint10 = (GenerationalViewportHint) c27561.L$2;
                    LoadType loadType13 = (LoadType) c27561.L$1;
                    pageFetcherSnapshot6 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    generationalViewportHint3 = generationalViewportHint10;
                    intRef4 = intRef8;
                    loadType2 = loadType13;
                    mutex8 = mutex18;
                    Unit unit42 = Unit.INSTANCE;
                    mutex8.unlock(null);
                    if (loadParams2 instanceof PagingSource.LoadParams.Prepend) {
                        break;
                    }
                    if (loadParams2 instanceof PagingSource.LoadParams.Append) {
                        break;
                    }
                    if (pageFetcherSnapshot6.remoteMediatorConnection != null) {
                        booleanRef = booleanRef4;
                        objectRef2 = objectRef5;
                        intRef2 = intRef4;
                        r12 = pageFetcherSnapshot6;
                    }
                    obj2 = objectRef2.element;
                    if (obj2 != null) {
                    }
                    return Unit.INSTANCE;
                case 11:
                    i3 = c27561.I$1;
                    i2 = c27561.I$0;
                    Mutex mutex19 = (Mutex) c27561.L$7;
                    holder6 = (PageFetcherSnapshotState.Holder) c27561.L$6;
                    booleanRef5 = (Ref.BooleanRef) c27561.L$5;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) c27561.L$4;
                    Ref.IntRef intRef9 = (Ref.IntRef) c27561.L$3;
                    GenerationalViewportHint generationalViewportHint11 = (GenerationalViewportHint) c27561.L$2;
                    LoadType loadType14 = (LoadType) c27561.L$1;
                    PageFetcherSnapshot pageFetcherSnapshot15 = (PageFetcherSnapshot) c27561.L$0;
                    ResultKt.throwOnFailure(obj4);
                    generationalViewportHint3 = generationalViewportHint11;
                    mutex9 = mutex19;
                    objectRef2 = objectRef9;
                    r12 = pageFetcherSnapshot15;
                    loadType2 = loadType14;
                    intRef2 = intRef9;
                    PagingState<Key, Value> pagingStateCurrentPagingState$paging_common_release2 = ((PageFetcherSnapshotState.Holder) holder6).state.currentPagingState$paging_common_release(r12.hintHandler.getLastAccessHint());
                    if (i2 != 0) {
                    }
                    if (i3 != 0) {
                    }
                    booleanRef = booleanRef5;
                    obj2 = objectRef2.element;
                    if (obj2 != null) {
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    private final String loadResultLog(LoadType loadType, Key loadKey, PagingSource.LoadResult<Key, Value> result) {
        if (result == null) {
            return "End " + loadType + " with loadkey " + loadKey + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + loadKey + ". Returned " + result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setLoading(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, Continuation<? super Unit> continuation) {
        LoadState loadState = pageFetcherSnapshotState.getSourceLoadStates().get(loadType);
        LoadState.Loading loading = LoadState.Loading.INSTANCE;
        if (!Intrinsics.areEqual(loadState, loading)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, loading);
            Object objSend = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final Object setError(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, Continuation<? super Unit> continuation) {
        if (!Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(loadType), error)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, error);
            Object objSend = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final Key nextLoadKeyOrNull(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        if (i != pageFetcherSnapshotState.generationId$paging_common_release(loadType) || (pageFetcherSnapshotState.getSourceLoadStates().get(loadType) instanceof LoadState.Error) || i2 >= this.config.prefetchDistance) {
            return null;
        }
        if (loadType == LoadType.PREPEND) {
            return (Key) ((PagingSource.LoadResult.Page) CollectionsKt.first((List) pageFetcherSnapshotState.getPages$paging_common_release())).getPrevKey();
        }
        return (Key) ((PagingSource.LoadResult.Page) CollectionsKt.last((List) pageFetcherSnapshotState.getPages$paging_common_release())).getNextKey();
    }

    private final void onInvalidLoad() {
        close();
        this.pagingSource.invalidate();
    }
}
