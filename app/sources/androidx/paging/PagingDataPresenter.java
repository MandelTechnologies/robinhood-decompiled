package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PagingDataEvent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Yield;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PagingDataPresenter.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001TB#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJX\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00070\u0016¢\u0006\u0002\b\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH¦@¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00070\u0016¢\u0006\u0002\b\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b#\u0010$J\u001c\u0010&\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010%\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0016¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0016¢\u0006\u0004\b-\u0010,J\u001b\u00100\u001a\u00020\u00162\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160.¢\u0006\u0004\b0\u00101R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R0\u0010?\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160.0=j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160.`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0K8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00160Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, m3636d2 = {"Landroidx/paging/PagingDataPresenter;", "", "T", "Lkotlin/coroutines/CoroutineContext;", "mainContext", "Landroidx/paging/PagingData;", "cachedPagingData", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroidx/paging/PagingData;)V", "", "Landroidx/paging/TransformablePage;", "pages", "", "placeholdersBefore", "placeholdersAfter", "", "dispatchLoadStates", "Landroidx/paging/LoadStates;", "sourceLoadStates", "mediatorLoadStates", "Landroidx/paging/HintReceiver;", "newHintReceiver", "", "presentNewList", "(Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/UiReceiver;", "receiver", "setUiReceiver", "(Landroidx/paging/UiReceiver;)V", "Landroidx/paging/PagingDataEvent;", "event", "Lkotlin/jvm/JvmSuppressWildcards;", "presentPagingDataEvent", "(Landroidx/paging/PagingDataEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pagingData", "collectFrom", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "get", "(I)Ljava/lang/Object;", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "()V", "refresh", "Lkotlin/Function0;", "listener", "addOnPagesUpdatedListener", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/coroutines/CoroutineContext;", "hintReceiver", "Landroidx/paging/HintReceiver;", "uiReceiver", "Landroidx/paging/UiReceiver;", "Landroidx/paging/PageStore;", "pageStore", "Landroidx/paging/PageStore;", "Landroidx/paging/MutableCombinedLoadStateCollection;", "combinedLoadStatesCollection", "Landroidx/paging/MutableCombinedLoadStateCollection;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/paging/internal/CopyOnWriteArrayList;", "onPagesUpdatedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/paging/SingleRunner;", "collectFromRunner", "Landroidx/paging/SingleRunner;", "lastAccessedIndexUnfulfilled", "Z", "lastAccessedIndex", "I", "Lkotlinx/coroutines/flow/MutableStateFlow;", "inGetItem", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/CombinedLoadStates;", "loadStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_onPagesUpdatedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "InitialUiReceiver", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class PagingDataPresenter<T> {
    private final SharedFlow2<Unit> _onPagesUpdatedFlow;
    private final SingleRunner collectFromRunner;
    private final MutableCombinedLoadStateCollection combinedLoadStatesCollection;
    private HintReceiver hintReceiver;
    private final StateFlow2<Boolean> inGetItem;
    private volatile int lastAccessedIndex;
    private volatile boolean lastAccessedIndexUnfulfilled;
    private final StateFlow<CombinedLoadStates> loadStateFlow;
    private final CoroutineContext mainContext;
    private final CopyOnWriteArrayList<Function0<Unit>> onPagesUpdatedListeners;
    private PageStore<T> pageStore;
    private UiReceiver uiReceiver;

    /* compiled from: PagingDataPresenter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PagingDataPresenter", m3645f = "PagingDataPresenter.kt", m3646l = {478}, m3647m = "presentNewList")
    /* renamed from: androidx.paging.PagingDataPresenter$presentNewList$1 */
    static final class C27771 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27771(PagingDataPresenter<T> pagingDataPresenter, Continuation<? super C27771> continuation) {
            super(continuation);
            this.this$0 = pagingDataPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.presentNewList(null, 0, 0, false, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagingDataPresenter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public abstract Object presentPagingDataEvent(PagingDataEvent<T> pagingDataEvent, Continuation<Unit> continuation);

    public final void refresh() {
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Refresh signal received", null);
        }
        this.uiReceiver.refresh();
    }

    public final void retry() {
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Retry signal received", null);
        }
        this.uiReceiver.retry();
    }

    public PagingDataPresenter(CoroutineContext mainContext, PagingData<T> pagingData) {
        PageEvent.Insert<T> insertCachedEvent$paging_common_release;
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.mainContext = mainContext;
        this.uiReceiver = new InitialUiReceiver();
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.pageStore = PageStore.INSTANCE.initial$paging_common_release(pagingData != null ? pagingData.cachedEvent$paging_common_release() : null);
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        if (pagingData != null && (insertCachedEvent$paging_common_release = pagingData.cachedEvent$paging_common_release()) != null) {
            mutableCombinedLoadStateCollection.set(insertCachedEvent$paging_common_release.getSourceLoadStates(), insertCachedEvent$paging_common_release.getMediatorLoadStates());
        }
        this.combinedLoadStatesCollection = mutableCombinedLoadStateCollection;
        this.onPagesUpdatedListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new SingleRunner(false, 1, defaultConstructorMarker);
        this.inGetItem = StateFlow4.MutableStateFlow(Boolean.FALSE);
        this.loadStateFlow = mutableCombinedLoadStateCollection.getStateFlow();
        this._onPagesUpdatedFlow = SharedFlow4.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        addOnPagesUpdatedListener(new Function0<Unit>(this) { // from class: androidx.paging.PagingDataPresenter.1
            final /* synthetic */ PagingDataPresenter<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((PagingDataPresenter) this.this$0)._onPagesUpdatedFlow.tryEmit(Unit.INSTANCE);
            }
        });
    }

    public /* synthetic */ PagingDataPresenter(CoroutineContext coroutineContext, PagingData pagingData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getMain() : coroutineContext, (i & 2) != 0 ? null : pagingData);
    }

    /* compiled from: PagingDataPresenter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", ""}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.paging.PagingDataPresenter$collectFrom$2", m3645f = "PagingDataPresenter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2 */
    static final class C27762 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ PagingData<T> $pagingData;
        int label;
        final /* synthetic */ PagingDataPresenter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27762(PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, Continuation<? super C27762> continuation) {
            super(1, continuation);
            this.this$0 = pagingDataPresenter;
            this.$pagingData = pagingData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C27762(this.this$0, this.$pagingData, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C27762) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setUiReceiver(this.$pagingData.getUiReceiver());
                Flow<PageEvent<T>> flow$paging_common_release = this.$pagingData.getFlow$paging_common_release();
                final PagingDataPresenter<T> pagingDataPresenter = this.this$0;
                final PagingData<T> pagingData = this.$pagingData;
                FlowCollector<? super PageEvent<T>> flowCollector = new FlowCollector() { // from class: androidx.paging.PagingDataPresenter.collectFrom.2.1
                    public final Object emit(PageEvent<T> pageEvent, Continuation<? super Unit> continuation) {
                        PagingLogger pagingLogger = PagingLogger.INSTANCE;
                        if (pagingLogger.isLoggable(2)) {
                            pagingLogger.log(2, "Collected " + pageEvent, null);
                        }
                        Object objWithContext = BuildersKt.withContext(((PagingDataPresenter) pagingDataPresenter).mainContext, new AnonymousClass2(pageEvent, pagingDataPresenter, pagingData, null), continuation);
                        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PageEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* compiled from: PagingDataPresenter.kt */
                    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", m3645f = "PagingDataPresenter.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 225, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
                    @SourceDebugExtension
                    /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ PageEvent<T> $event;
                        final /* synthetic */ PagingData<T> $pagingData;
                        int label;
                        final /* synthetic */ PagingDataPresenter<T> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(PageEvent<T> pageEvent, PagingDataPresenter<T> pagingDataPresenter, PagingData<T> pagingData, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$event = pageEvent;
                            this.this$0 = pagingDataPresenter;
                            this.$pagingData = pagingData;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$event, this.this$0, this.$pagingData, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
                        
                            if (r14 == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
                        
                            if (r1.presentNewList(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L91;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L40;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:90:0x0248, code lost:
                        
                            if (r14.presentPagingDataEvent(r1, r13) != r0) goto L92;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:102:0x0293  */
                        /* JADX WARN: Removed duplicated region for block: B:105:0x02a3 A[LOOP:0: B:103:0x029d->B:105:0x02a3, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x00f7 A[PHI: r9
                          0x00f7: PHI (r9v4 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v5 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:33:0x00ea, B:35:0x00f3, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x0235 A[PHI: r9
                          0x0235: PHI (r9v8 androidx.paging.PagingDataPresenter$collectFrom$2$1$2) = 
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v0 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                          (r9v9 androidx.paging.PagingDataPresenter$collectFrom$2$1$2)
                         binds: [B:85:0x0229, B:87:0x0232, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:98:0x028b  */
                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            AnonymousClass2 anonymousClass2;
                            PageEvent<T> pageEvent;
                            Iterator<T> it;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            boolean z = true;
                            switch (this.label) {
                                case 0:
                                    ResultKt.throwOnFailure(obj);
                                    PageEvent<T> pageEvent2 = this.$event;
                                    if (pageEvent2 instanceof PageEvent.StaticList) {
                                        PagingDataPresenter<T> pagingDataPresenter = this.this$0;
                                        List listListOf = CollectionsKt.listOf(new TransformablePage(0, ((PageEvent.StaticList) this.$event).getData()));
                                        boolean z2 = (((PageEvent.StaticList) this.$event).getSourceLoadStates() == null && ((PageEvent.StaticList) this.$event).getMediatorLoadStates() == null) ? false : true;
                                        LoadStates sourceLoadStates = ((PageEvent.StaticList) this.$event).getSourceLoadStates();
                                        LoadStates mediatorLoadStates = ((PageEvent.StaticList) this.$event).getMediatorLoadStates();
                                        HintReceiver hintReceiver = this.$pagingData.getHintReceiver();
                                        this.label = 1;
                                        Object objPresentNewList = pagingDataPresenter.presentNewList(listListOf, 0, 0, z2, sourceLoadStates, mediatorLoadStates, hintReceiver, this);
                                        anonymousClass2 = this;
                                        break;
                                    } else {
                                        anonymousClass2 = this;
                                        if ((pageEvent2 instanceof PageEvent.Insert) && ((PageEvent.Insert) pageEvent2).getLoadType() == LoadType.REFRESH) {
                                            PagingDataPresenter<T> pagingDataPresenter2 = anonymousClass2.this$0;
                                            List<TransformablePage<T>> pages = ((PageEvent.Insert) anonymousClass2.$event).getPages();
                                            int placeholdersBefore = ((PageEvent.Insert) anonymousClass2.$event).getPlaceholdersBefore();
                                            int placeholdersAfter = ((PageEvent.Insert) anonymousClass2.$event).getPlaceholdersAfter();
                                            LoadStates sourceLoadStates2 = ((PageEvent.Insert) anonymousClass2.$event).getSourceLoadStates();
                                            LoadStates mediatorLoadStates2 = ((PageEvent.Insert) anonymousClass2.$event).getMediatorLoadStates();
                                            HintReceiver hintReceiver2 = anonymousClass2.$pagingData.getHintReceiver();
                                            anonymousClass2.label = 2;
                                            break;
                                        } else {
                                            PageEvent<T> pageEvent3 = anonymousClass2.$event;
                                            if (pageEvent3 instanceof PageEvent.Insert) {
                                                if (((Boolean) ((PagingDataPresenter) anonymousClass2.this$0).inGetItem.getValue()).booleanValue()) {
                                                    anonymousClass2.label = 3;
                                                    if (Yield.yield(this) != coroutine_suspended) {
                                                        PagingDataPresenter<T> pagingDataPresenter3 = anonymousClass2.this$0;
                                                        PagingDataEvent<T> pagingDataEventProcessEvent = ((PagingDataPresenter) pagingDataPresenter3).pageStore.processEvent(anonymousClass2.$event);
                                                        anonymousClass2.label = 4;
                                                        break;
                                                    }
                                                }
                                                pageEvent = anonymousClass2.$event;
                                                if (!(pageEvent instanceof PageEvent.Insert) || (pageEvent instanceof PageEvent.Drop) || (pageEvent instanceof PageEvent.StaticList)) {
                                                    it = ((PagingDataPresenter) anonymousClass2.this$0).onPagesUpdatedListeners.iterator();
                                                    while (it.hasNext()) {
                                                        ((Function0) it.next()).invoke();
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            if (pageEvent3 instanceof PageEvent.Drop) {
                                                if (((Boolean) ((PagingDataPresenter) anonymousClass2.this$0).inGetItem.getValue()).booleanValue()) {
                                                    anonymousClass2.label = 5;
                                                    if (Yield.yield(this) != coroutine_suspended) {
                                                        PagingDataPresenter<T> pagingDataPresenter4 = anonymousClass2.this$0;
                                                        PagingDataEvent<T> pagingDataEventProcessEvent2 = ((PagingDataPresenter) pagingDataPresenter4).pageStore.processEvent(anonymousClass2.$event);
                                                        anonymousClass2.label = 6;
                                                        break;
                                                    }
                                                }
                                                pageEvent = anonymousClass2.$event;
                                                if (!(pageEvent instanceof PageEvent.Insert)) {
                                                    it = ((PagingDataPresenter) anonymousClass2.this$0).onPagesUpdatedListeners.iterator();
                                                    while (it.hasNext()) {
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            if (pageEvent3 instanceof PageEvent.LoadStateUpdate) {
                                                ((PagingDataPresenter) anonymousClass2.this$0).combinedLoadStatesCollection.set(((PageEvent.LoadStateUpdate) anonymousClass2.$event).getSource(), ((PageEvent.LoadStateUpdate) anonymousClass2.$event).getMediator());
                                            }
                                            pageEvent = anonymousClass2.$event;
                                            if (!(pageEvent instanceof PageEvent.Insert)) {
                                            }
                                            return Unit.INSTANCE;
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 1:
                                case 2:
                                    ResultKt.throwOnFailure(obj);
                                    anonymousClass2 = this;
                                    pageEvent = anonymousClass2.$event;
                                    if (!(pageEvent instanceof PageEvent.Insert)) {
                                    }
                                    return Unit.INSTANCE;
                                case 3:
                                    ResultKt.throwOnFailure(obj);
                                    anonymousClass2 = this;
                                    PagingDataPresenter<T> pagingDataPresenter32 = anonymousClass2.this$0;
                                    PagingDataEvent<T> pagingDataEventProcessEvent3 = ((PagingDataPresenter) pagingDataPresenter32).pageStore.processEvent(anonymousClass2.$event);
                                    anonymousClass2.label = 4;
                                    break;
                                case 4:
                                    ResultKt.throwOnFailure(obj);
                                    anonymousClass2 = this;
                                    ((PagingDataPresenter) anonymousClass2.this$0).combinedLoadStatesCollection.set(((PageEvent.Insert) anonymousClass2.$event).getSourceLoadStates(), ((PageEvent.Insert) anonymousClass2.$event).getMediatorLoadStates());
                                    CombinedLoadStates value = ((PagingDataPresenter) anonymousClass2.this$0).combinedLoadStatesCollection.getStateFlow().getValue();
                                    LoadStates source = value != null ? value.getSource() : null;
                                    if (source == null) {
                                        throw new IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                                    }
                                    boolean z3 = ((((PageEvent.Insert) anonymousClass2.$event).getLoadType() == LoadType.PREPEND && source.getPrepend().getEndOfPaginationReached()) || (((PageEvent.Insert) anonymousClass2.$event).getLoadType() == LoadType.APPEND && source.getAppend().getEndOfPaginationReached())) ? false : true;
                                    List<TransformablePage<T>> pages2 = ((PageEvent.Insert) anonymousClass2.$event).getPages();
                                    if (!(pages2 instanceof Collection) || !pages2.isEmpty()) {
                                        Iterator<T> it2 = pages2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                if (!((TransformablePage) it2.next()).getData().isEmpty()) {
                                                    z = false;
                                                }
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        ((PagingDataPresenter) anonymousClass2.this$0).lastAccessedIndexUnfulfilled = false;
                                    } else if (((PagingDataPresenter) anonymousClass2.this$0).lastAccessedIndexUnfulfilled || z) {
                                        if (z || ((PagingDataPresenter) anonymousClass2.this$0).lastAccessedIndex < ((PagingDataPresenter) anonymousClass2.this$0).pageStore.getPlaceholdersBefore() || ((PagingDataPresenter) anonymousClass2.this$0).lastAccessedIndex > ((PagingDataPresenter) anonymousClass2.this$0).pageStore.getPlaceholdersBefore() + ((PagingDataPresenter) anonymousClass2.this$0).pageStore.getDataCount()) {
                                            HintReceiver hintReceiver3 = ((PagingDataPresenter) anonymousClass2.this$0).hintReceiver;
                                            if (hintReceiver3 != null) {
                                                hintReceiver3.accessHint(((PagingDataPresenter) anonymousClass2.this$0).pageStore.accessHintForPresenterIndex(((PagingDataPresenter) anonymousClass2.this$0).lastAccessedIndex));
                                            }
                                        } else {
                                            ((PagingDataPresenter) anonymousClass2.this$0).lastAccessedIndexUnfulfilled = false;
                                        }
                                    }
                                    pageEvent = anonymousClass2.$event;
                                    if (!(pageEvent instanceof PageEvent.Insert)) {
                                    }
                                    return Unit.INSTANCE;
                                case 5:
                                    ResultKt.throwOnFailure(obj);
                                    anonymousClass2 = this;
                                    PagingDataPresenter<T> pagingDataPresenter42 = anonymousClass2.this$0;
                                    PagingDataEvent<T> pagingDataEventProcessEvent22 = ((PagingDataPresenter) pagingDataPresenter42).pageStore.processEvent(anonymousClass2.$event);
                                    anonymousClass2.label = 6;
                                    break;
                                case 6:
                                    ResultKt.throwOnFailure(obj);
                                    anonymousClass2 = this;
                                    ((PagingDataPresenter) anonymousClass2.this$0).combinedLoadStatesCollection.set(((PageEvent.Drop) anonymousClass2.$event).getLoadType(), false, LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
                                    ((PagingDataPresenter) anonymousClass2.this$0).lastAccessedIndexUnfulfilled = false;
                                    pageEvent = anonymousClass2.$event;
                                    if (!(pageEvent instanceof PageEvent.Insert)) {
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }
                };
                this.label = 1;
                if (flow$paging_common_release.collect(flowCollector, this) == coroutine_suspended) {
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

    public final Object collectFrom(PagingData<T> pagingData, Continuation<Unit> continuation) {
        Object objRunInIsolation$default = SingleRunner.runInIsolation$default(this.collectFromRunner, 0, new C27762(this, pagingData, null), continuation, 1, null);
        return objRunInIsolation$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunInIsolation$default : Unit.INSTANCE;
    }

    public final T get(int index) {
        Boolean value;
        Boolean value2;
        StateFlow2<Boolean> stateFlow2 = this.inGetItem;
        do {
            value = stateFlow2.getValue();
            value.getClass();
        } while (!stateFlow2.compareAndSet(value, Boolean.TRUE));
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = index;
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            pagingLogger.log(2, "Accessing item index[" + index + ']', null);
        }
        HintReceiver hintReceiver = this.hintReceiver;
        if (hintReceiver != null) {
            hintReceiver.accessHint(this.pageStore.accessHintForPresenterIndex(index));
        }
        T t = this.pageStore.get(index);
        StateFlow2<Boolean> stateFlow22 = this.inGetItem;
        do {
            value2 = stateFlow22.getValue();
            value2.getClass();
        } while (!stateFlow22.compareAndSet(value2, Boolean.FALSE));
        return t;
    }

    public final ItemSnapshotList<T> snapshot() {
        return this.pageStore.snapshot();
    }

    public final StateFlow<CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final void addOnPagesUpdatedListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPagesUpdatedListeners.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object presentNewList(List<TransformablePage<T>> list, int i, int i2, boolean z, LoadStates loadStates, LoadStates loadStates2, HintReceiver hintReceiver, Continuation<? super Unit> continuation) {
        C27771 c27771;
        PageStore<T> pageStore;
        PagingDataPresenter<T> pagingDataPresenter;
        HintReceiver hintReceiver2;
        List<T> data;
        List<T> data2;
        if (continuation instanceof C27771) {
            c27771 = (C27771) continuation;
            int i3 = c27771.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27771.label = i3 - Integer.MIN_VALUE;
            } else {
                c27771 = new C27771(this, continuation);
            }
        }
        Object obj = c27771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c27771.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (z && loadStates == null) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
            }
            this.lastAccessedIndexUnfulfilled = false;
            pageStore = new PageStore<>(list, i, i2);
            PageStore<T> pageStore2 = this.pageStore;
            Intrinsics.checkNotNull(pageStore2, "null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
            this.pageStore = pageStore;
            this.hintReceiver = hintReceiver;
            PagingDataEvent<T> refresh = new PagingDataEvent.Refresh<>(pageStore, pageStore2);
            c27771.L$0 = this;
            c27771.L$1 = list;
            c27771.L$2 = loadStates;
            c27771.L$3 = loadStates2;
            c27771.L$4 = hintReceiver;
            c27771.L$5 = pageStore;
            c27771.I$0 = i;
            c27771.I$1 = i2;
            c27771.Z$0 = z;
            c27771.label = 1;
            if (presentPagingDataEvent(refresh, c27771) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pagingDataPresenter = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c27771.Z$0;
            i2 = c27771.I$1;
            i = c27771.I$0;
            PageStore<T> pageStore3 = (PageStore) c27771.L$5;
            hintReceiver = (HintReceiver) c27771.L$4;
            loadStates2 = (LoadStates) c27771.L$3;
            loadStates = (LoadStates) c27771.L$2;
            List<TransformablePage<T>> list2 = (List) c27771.L$1;
            pagingDataPresenter = (PagingDataPresenter) c27771.L$0;
            ResultKt.throwOnFailure(obj);
            pageStore = pageStore3;
            list = list2;
        }
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Presenting data (\n                            |   first item: ");
            TransformablePage transformablePage = (TransformablePage) CollectionsKt.firstOrNull((List) list);
            sb.append((transformablePage == null || (data2 = transformablePage.getData()) == null) ? null : CollectionsKt.firstOrNull((List) data2));
            sb.append("\n                            |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) CollectionsKt.lastOrNull((List) list);
            sb.append((transformablePage2 == null || (data = transformablePage2.getData()) == null) ? null : CollectionsKt.lastOrNull((List) data));
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(i);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(i2);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(hintReceiver);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(loadStates);
            sb.append("\n                        ");
            String string2 = sb.toString();
            if (loadStates2 != null) {
                string2 = string2 + "|   mediatorLoadStates: " + loadStates2 + '\n';
            }
            pagingLogger.log(3, StringsKt.trimMargin$default(string2 + "|)", null, 1, null), null);
        }
        if (z) {
            MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = pagingDataPresenter.combinedLoadStatesCollection;
            Intrinsics.checkNotNull(loadStates);
            mutableCombinedLoadStateCollection.set(loadStates, loadStates2);
        }
        if (pageStore.getSize() == 0 && (hintReceiver2 = pagingDataPresenter.hintReceiver) != null) {
            hintReceiver2.accessHint(pageStore.initializeHint());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PagingDataPresenter.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m3636d2 = {"Landroidx/paging/PagingDataPresenter$InitialUiReceiver;", "Landroidx/paging/UiReceiver;", "<init>", "()V", "", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "refresh", "", "Z", "getRetry", "()Z", "setRetry", "(Z)V", "getRefresh", "setRefresh", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    private static final class InitialUiReceiver implements UiReceiver {
        private boolean refresh;
        private boolean retry;

        public final boolean getRetry() {
            return this.retry;
        }

        public final boolean getRefresh() {
            return this.refresh;
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
            this.retry = true;
        }

        @Override // androidx.paging.UiReceiver
        public void refresh() {
            this.refresh = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUiReceiver(UiReceiver receiver) {
        UiReceiver uiReceiver = this.uiReceiver;
        this.uiReceiver = receiver;
        if (uiReceiver instanceof InitialUiReceiver) {
            InitialUiReceiver initialUiReceiver = (InitialUiReceiver) uiReceiver;
            if (initialUiReceiver.getRetry()) {
                receiver.retry();
            }
            if (initialUiReceiver.getRefresh()) {
                receiver.refresh();
            }
        }
    }
}
