package com.robinhood.android.inbox.p156ui.messages;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.inbox.p156ui.messages.ThreadListDuxo;
import com.robinhood.android.inbox.p156ui.messages.ThreadListEvent;
import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState2;
import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState4;
import com.robinhood.android.lib.conversations.RxErrorExtensions;
import com.robinhood.android.lib.conversations.TwilioManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.InboxMessageStore;
import com.robinhood.librobinhood.data.store.InboxThreadStore;
import com.robinhood.models.api.ApiMessageResult;
import com.robinhood.models.api.ApiThread;
import com.robinhood.models.api.pathfinder.messaging.ChatCurrentType;
import com.robinhood.models.p320db.InboxThread;
import com.robinhood.models.p355ui.SimpleChatIssue;
import com.robinhood.models.p355ui.SimpleChatIssue2;
import com.robinhood.models.p355ui.pathfinder.messaging.AgentChat;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.store.supportchat.ChatExceptions;
import com.robinhood.store.supportchat.SupportChatStore;
import com.robinhood.store.supportchat.salesforce.SalesforceChatStore;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.observable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: ThreadListDuxo.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020%H\u0082@¢\u0006\u0002\u0010#J\u000e\u0010&\u001a\u00020!H\u0082@¢\u0006\u0002\u0010#J\u000e\u0010'\u001a\u00020!H\u0082@¢\u0006\u0002\u0010#J\u0012\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020+H\u0002J\u0010\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0)H\u0002J\f\u0010.\u001a\u00020%*\u00020/H\u0002J\u000e\u00100\u001a\u00020%H\u0082@¢\u0006\u0002\u0010#J\u000e\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u0010#J\u0014\u00103\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001b05J\u0006\u00106\u001a\u00020!J\u0006\u00107\u001a\u00020!J\u0006\u00108\u001a\u00020!J\u000e\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020\u001bJ\u0006\u0010;\u001a\u00020!J\u0016\u0010<\u001a\u00020!2\u0006\u0010:\u001a\u00020=2\u0006\u0010>\u001a\u00020%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListViewState;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListEvent;", "salesforceChatStore", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "inboxMessageStore", "Lcom/robinhood/librobinhood/data/store/InboxMessageStore;", "inboxThreadStore", "Lcom/robinhood/librobinhood/data/store/InboxThreadStore;", "stateProvider", "Lcom/robinhood/android/inbox/ui/messages/ThreadListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;Lcom/robinhood/android/lib/conversations/TwilioManager;Lcom/robinhood/store/supportchat/SupportChatStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;Lcom/robinhood/librobinhood/data/store/InboxMessageStore;Lcom/robinhood/librobinhood/data/store/InboxThreadStore;Lcom/robinhood/android/inbox/ui/messages/ThreadListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "selectedThreads", "", "", "getSelectedThreads", "()Ljava/util/Set;", "_selectedThreads", "", "onCreate", "", "initialize", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshInboxThread", "", "observeSupportChatRequiredAttention", "observeSupportChatUnreadMessageCount", "streamUnreadMessageCount", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "streamMostRecentAgentChat", "Lcom/robinhood/models/ui/SimpleChatIssue;", "requireAttention", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;", "refreshSupportChatList", "initializeSupportChatStreams", "Lkotlinx/coroutines/Job;", "markThreadsAsRead", "threadIds", "", "postSawBadge", "refreshThreads", "markSelectedThreadsAsRead", "toggleThreadSelection", "id", "clearSelectedThreads", "markChatIssueAsShown", "Ljava/util/UUID;", "canLogImpression", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadListDuxo extends BaseDuxo3<ThreadListDataState, ThreadListViewState, ThreadListEvent> {
    private final Set<String> _selectedThreads;
    private final InboxBadgeStore inboxBadgeStore;
    private final InboxMessageStore inboxMessageStore;
    private final InboxThreadStore inboxThreadStore;
    private final PerformanceLogger performanceLogger;
    private final SalesforceChatStore salesforceChatStore;
    private final SupportChatStore supportChatStore;
    private final TwilioManager twilioManager;

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatCurrentType.values().length];
            try {
                iArr[ChatCurrentType.AGENT_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 388}, m3647m = "refreshInboxThread")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$refreshInboxThread$1 */
    static final class C187421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C187421(Continuation<? super C187421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThreadListDuxo.this.refreshInboxThread(this);
        }
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo", m3645f = "ThreadListDuxo.kt", m3646l = {288}, m3647m = "refreshSupportChatList")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$refreshSupportChatList$1 */
    static final class C187441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C187441(Continuation<? super C187441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThreadListDuxo.this.refreshSupportChatList(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadListDuxo(SalesforceChatStore salesforceChatStore, TwilioManager twilioManager, SupportChatStore supportChatStore, PerformanceLogger performanceLogger, InboxBadgeStore inboxBadgeStore, InboxMessageStore inboxMessageStore, InboxThreadStore inboxThreadStore, ThreadListStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new ThreadListDataState(null, null, null, 0L, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
        Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(inboxMessageStore, "inboxMessageStore");
        Intrinsics.checkNotNullParameter(inboxThreadStore, "inboxThreadStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.salesforceChatStore = salesforceChatStore;
        this.twilioManager = twilioManager;
        this.supportChatStore = supportChatStore;
        this.performanceLogger = performanceLogger;
        this.inboxBadgeStore = inboxBadgeStore;
        this.inboxMessageStore = inboxMessageStore;
        this.inboxThreadStore = inboxThreadStore;
        this._selectedThreads = new LinkedHashSet();
    }

    public final Set<String> getSelectedThreads() {
        return this._selectedThreads;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, asObservable(PaginatedEndpointKt.forceFetchAllPages(this.inboxThreadStore.getGetThreads())), (LifecycleEvent) null, 1, (Object) null), null, new Consumer() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.onCreate.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                PerformanceLogger.DefaultImpls.failMetric$default(ThreadListDuxo.this.performanceLogger, PerformanceMetricEventData.Name.MESSAGE, null, 2, null);
            }
        }, new Action() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.onCreate.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                PerformanceLogger.DefaultImpls.completeMetric$default(ThreadListDuxo.this.performanceLogger, PerformanceMetricEventData.Name.MESSAGE, null, 2, null);
            }
        }, 1, null);
        Observable observableFlatMap = this.inboxThreadStore.streamThreads().take(1L).switchMap(C187363.INSTANCE).flatMap(new Function() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.onCreate.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiMessageResult> apply(InboxThread thread) {
                Intrinsics.checkNotNullParameter(thread, "thread");
                return ObservablesKt.ignoreNetworkExceptions(ThreadListDuxo.this.inboxMessageStore.fetchNewMessages(thread.getId()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null), null, new Consumer() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.onCreate.6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                PerformanceLogger.DefaultImpls.failMetric$default(ThreadListDuxo.this.performanceLogger, PerformanceMetricEventData.Name.MESSAGE, null, 2, null);
            }
        }, new Action() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.onCreate.5
            @Override // io.reactivex.functions.Action
            public final void run() {
                PerformanceLogger.DefaultImpls.completeMetric$default(ThreadListDuxo.this.performanceLogger, PerformanceMetricEventData.Name.MESSAGE, null, 2, null);
            }
        }, 1, null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C187407(null));
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$onCreate$3 */
    static final class C187363<T, R> implements Function {
        public static final C187363<T, R> INSTANCE = new C187363<>();

        C187363() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends InboxThread> apply(List<InboxThread> threads) {
            Intrinsics.checkNotNullParameter(threads, "threads");
            return observable.toObservable(SequencesKt.take(SequencesKt.filter(CollectionsKt.asSequence(threads), new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$onCreate$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ThreadListDuxo.C187363.apply$lambda$0((InboxThread) obj));
                }
            }), 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean apply$lambda$0(InboxThread it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return !it.isRead();
        }
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$onCreate$7", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$onCreate$7 */
    static final class C187407 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187407(Continuation<? super C187407> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187407 c187407 = ThreadListDuxo.this.new C187407(continuation);
            c187407.L$0 = obj;
            return c187407;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187407) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$onCreate$7$1", m3645f = "ThreadListDuxo.kt", m3646l = {110}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ThreadListDuxo threadListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = threadListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ThreadListDuxo threadListDuxo = this.this$0;
                    this.label = 1;
                    if (threadListDuxo.initialize(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(ThreadListDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2 */
    static final class C187282 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        boolean Z$0;
        int label;

        C187282(Continuation<? super C187282> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187282 c187282 = ThreadListDuxo.this.new C187282(continuation);
            c187282.L$0 = obj;
            return c187282;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
                return ((AnonymousClass1) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ThreadListDataState threadListDataState = (ThreadListDataState) this.L$0;
                return ((threadListDataState.getInboxThreadsStatus() instanceof ThreadListViewState2.Failed) && ((threadListDataState.getSupportChatThreadStatus() instanceof ThreadListViewState4.Unsupported) || (threadListDataState.getSupportChatThreadStatus() instanceof ThreadListViewState4.Failed))) ? ThreadListDataState.copy$default(threadListDataState, ThreadListViewState2.Loading.INSTANCE, ThreadListViewState4.Loading.INSTANCE, null, 0L, 12, null) : threadListDataState;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ThreadListDuxo.this.applyMutation(new AnonymousClass1(null));
                ThreadListDuxo threadListDuxo = ThreadListDuxo.this;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objRefreshInboxThread = threadListDuxo.refreshInboxThread(this);
                if (objRefreshInboxThread != coroutine_suspended) {
                    coroutineScope = coroutineScope2;
                    obj = objRefreshInboxThread;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = coroutineScope;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (z && !zBooleanValue) {
                    return Unit.INSTANCE;
                }
                ThreadListDuxo threadListDuxo2 = ThreadListDuxo.this;
                Observable<List<InboxThread>> observableFilter = threadListDuxo2.inboxThreadStore.streamThreads().filter(new Predicate() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.initialize.2.2
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(List<InboxThread> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return !it.isEmpty();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
                ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(threadListDuxo2, observableFilter, (LifecycleEvent) null, 1, (Object) null);
                final ThreadListDuxo threadListDuxo3 = ThreadListDuxo.this;
                scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ThreadListDuxo.C187282.invokeSuspend$lambda$0(threadListDuxo3, (List) obj2);
                    }
                });
                ThreadListDuxo threadListDuxo4 = ThreadListDuxo.this;
                PaginatedEndpoint<Unit, ApiThread> getThreads = threadListDuxo4.inboxThreadStore.getGetThreads();
                Unit unit = Unit.INSTANCE;
                ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(threadListDuxo4, ObservablesKt.ignoreNetworkExceptions(threadListDuxo4.asObservable(PaginatedEndpoint.DefaultImpls.pollAllPages$default(getThreads, unit, null, 2, null))), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass4(ThreadListDuxo.this, null), 3, null);
                return unit;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            ThreadListDuxo threadListDuxo5 = ThreadListDuxo.this;
            this.L$0 = coroutineScope;
            this.Z$0 = zBooleanValue2;
            this.label = 2;
            Object objRefreshSupportChatList = threadListDuxo5.refreshSupportChatList(this);
            if (objRefreshSupportChatList != coroutine_suspended) {
                z = zBooleanValue2;
                obj = objRefreshSupportChatList;
                CoroutineScope coroutineScope32 = coroutineScope;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                if (z) {
                }
                ThreadListDuxo threadListDuxo22 = ThreadListDuxo.this;
                Observable<List<InboxThread>> observableFilter2 = threadListDuxo22.inboxThreadStore.streamThreads().filter(new Predicate() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.initialize.2.2
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(List<InboxThread> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return !it.isEmpty();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableFilter2, "filter(...)");
                ScopedObservable scopedObservableBind$default2 = LifecycleHost.DefaultImpls.bind$default(threadListDuxo22, observableFilter2, (LifecycleEvent) null, 1, (Object) null);
                final ThreadListDuxo threadListDuxo32 = ThreadListDuxo.this;
                scopedObservableBind$default2.subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ThreadListDuxo.C187282.invokeSuspend$lambda$0(threadListDuxo32, (List) obj2);
                    }
                });
                ThreadListDuxo threadListDuxo42 = ThreadListDuxo.this;
                PaginatedEndpoint<Unit, ApiThread> getThreads2 = threadListDuxo42.inboxThreadStore.getGetThreads();
                Unit unit2 = Unit.INSTANCE;
                ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(threadListDuxo42, ObservablesKt.ignoreNetworkExceptions(threadListDuxo42.asObservable(PaginatedEndpoint.DefaultImpls.pollAllPages$default(getThreads2, unit2, null, 2, null))), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope32, null, null, new AnonymousClass4(ThreadListDuxo.this, null), 3, null);
                return unit2;
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ThreadListDuxo threadListDuxo, List list) {
            threadListDuxo.applyMutation(new ThreadListDuxo2(list, null));
            return Unit.INSTANCE;
        }

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$4", m3645f = "ThreadListDuxo.kt", m3646l = {165}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initialize$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ThreadListDuxo threadListDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = threadListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ThreadListDuxo threadListDuxo = this.this$0;
                    this.label = 1;
                    if (threadListDuxo.initializeSupportChatStreams(this) == coroutine_suspended) {
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
    }

    public final Object initialize(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C187282(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (kotlinx.coroutines.rx2.RxAwait3.await(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshInboxThread(Continuation<? super Boolean> continuation) {
        C187421 c187421;
        if (continuation instanceof C187421) {
            c187421 = (C187421) continuation;
            int i = c187421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c187421.label = i - Integer.MIN_VALUE;
            } else {
                c187421 = new C187421(continuation);
            }
        }
        Object threadCount = c187421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c187421.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            if (!Throwables.isNetworkRelated(th)) {
                throw th;
            }
            applyMutation(new C187432(null));
            z = false;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(threadCount);
            InboxThreadStore inboxThreadStore = this.inboxThreadStore;
            c187421.label = 1;
            threadCount = inboxThreadStore.getThreadCount(c187421);
            if (threadCount != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(threadCount);
            return boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(threadCount);
        if (((Number) threadCount).intValue() > 0) {
            return boxing.boxBoolean(true);
        }
        Completable completableFetchThreads = this.inboxThreadStore.fetchThreads(true);
        c187421.label = 2;
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$refreshInboxThread$2", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$refreshInboxThread$2 */
    static final class C187432 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187432(Continuation<? super C187432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187432 c187432 = new C187432(continuation);
            c187432.L$0 = obj;
            return c187432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
            return ((C187432) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ThreadListDataState.copy$default((ThreadListDataState) this.L$0, ThreadListViewState2.Failed.INSTANCE, null, null, 0L, 14, null);
        }
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatRequiredAttention$2", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatRequiredAttention$2 */
    static final class C187322 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C187322(Continuation<? super C187322> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadListDuxo.this.new C187322(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamMostRecentAgentChat = ThreadListDuxo.this.streamMostRecentAgentChat();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ThreadListDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamMostRecentAgentChat, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "nullableChat", "Lcom/robinhood/models/ui/SimpleChatIssue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatRequiredAttention$2$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatRequiredAttention$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SimpleChatIssue, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ThreadListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ThreadListDuxo threadListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = threadListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SimpleChatIssue simpleChatIssue, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(simpleChatIssue, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ThreadListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatRequiredAttention$2$1$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatRequiredAttention$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501841 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
                final /* synthetic */ SimpleChatIssue $nullableChat;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501841(SimpleChatIssue simpleChatIssue, Continuation<? super C501841> continuation) {
                    super(2, continuation);
                    this.$nullableChat = simpleChatIssue;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501841 c501841 = new C501841(this.$nullableChat, continuation);
                    c501841.L$0 = obj;
                    return c501841;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
                    return ((C501841) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ThreadListDataState.copy$default((ThreadListDataState) this.L$0, null, new ThreadListViewState4.Success(this.$nullableChat), null, 0L, 13, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501841((SimpleChatIssue) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeSupportChatRequiredAttention(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C187322(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatUnreadMessageCount$2", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatUnreadMessageCount$2 */
    static final class C187332 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C187332(Continuation<? super C187332> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadListDuxo.this.new C187332(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187332) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(ThreadListDuxo.this.streamMostRecentAgentChat(), new C18724x22698bfa(null, ThreadListDuxo.this)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(ThreadListDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    if (!ChatExceptions.isChatException(th)) {
                        throw th;
                    }
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "count", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatUnreadMessageCount$2$2", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatUnreadMessageCount$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Long, Continuation<? super Unit>, Object> {
            /* synthetic */ long J$0;
            int label;
            final /* synthetic */ ThreadListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ThreadListDuxo threadListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = threadListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.J$0 = ((Number) obj).longValue();
                return anonymousClass2;
            }

            public final Object invoke(long j, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
                return invoke(l.longValue(), continuation);
            }

            /* compiled from: ThreadListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatUnreadMessageCount$2$2$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$observeSupportChatUnreadMessageCount$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
                final /* synthetic */ long $count;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$count = j;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$count, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
                    return ((AnonymousClass1) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ThreadListDataState.copy$default((ThreadListDataState) this.L$0, null, null, null, this.$count, 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(this.J$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeSupportChatUnreadMessageCount(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C187332(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Long> streamUnreadMessageCount(ChatMode chatMode) {
        Flow<Long> flowBuffer$default;
        if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
            UUID conversationId = ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId();
            if (conversationId != null) {
                final Flow<Integer> flowStreamUnreadMessageCount = this.salesforceChatStore.streamUnreadMessageCount(conversationId);
                return new Flow<Long>() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamUnreadMessageCount$lambda$1$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamUnreadMessageCount.collect(new C187262(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamUnreadMessageCount$lambda$1$$inlined$map$1$2 */
                    public static final class C187262<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamUnreadMessageCount$lambda$1$$inlined$map$1$2", m3645f = "ThreadListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamUnreadMessageCount$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C187262.this.emit(null, this);
                            }
                        }

                        public C187262(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Long lBoxLong = boxing.boxLong(((Number) obj).intValue());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(lBoxLong, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
            }
            return FlowKt.flowOf(0L);
        }
        if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
            String conversationSid = ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid();
            return (conversationSid == null || (flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RxErrorExtensions.ignoreChatException(this.twilioManager.streamUnreadMessageCount(conversationSid))), Integer.MAX_VALUE, null, 2, null)) == null) ? FlowKt.flowOf(0L) : flowBuffer$default;
        }
        return FlowKt.flowOf(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<SimpleChatIssue> streamMostRecentAgentChat() {
        final Flow<List<SupportChat>> flowStreamSupportChatList = this.supportChatStore.streamSupportChatList();
        return FlowKt.distinctUntilChanged(new Flow<SimpleChatIssue>() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamMostRecentAgentChat$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SimpleChatIssue> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamSupportChatList.collect(new C187252(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamMostRecentAgentChat$$inlined$map$1$2 */
            public static final class C187252<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ThreadListDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamMostRecentAgentChat$$inlined$map$1$2", m3645f = "ThreadListDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$streamMostRecentAgentChat$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C187252.this.emit(null, this);
                    }
                }

                public C187252(FlowCollector flowCollector, ThreadListDuxo threadListDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = threadListDuxo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (this.this$0.requireAttention((SupportChat) next)) {
                                break;
                            }
                        }
                        SupportChat supportChat = next;
                        SimpleChatIssue simpleUiModel = supportChat != null ? SimpleChatIssue2.toSimpleUiModel(supportChat) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(simpleUiModel, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean requireAttention(SupportChat supportChat) {
        AgentChat agentChat;
        if (WhenMappings.$EnumSwitchMapping$0[supportChat.getCurrentType().ordinal()] != 1 || (agentChat = supportChat.getAgentChat()) == null) {
            return false;
        }
        return agentChat.isActive() || !agentChat.getHasImpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshSupportChatList(Continuation<? super Boolean> continuation) {
        C187441 c187441;
        if (continuation instanceof C187441) {
            c187441 = (C187441) continuation;
            int i = c187441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c187441.label = i - Integer.MIN_VALUE;
            } else {
                c187441 = new C187441(continuation);
            }
        }
        Object obj = c187441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c187441.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SupportChatStore supportChatStore = this.supportChatStore;
                c187441.label = 1;
                if (supportChatStore.refreshSupportChatList(c187441) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable unused) {
            applyMutation(new C187452(null));
            z = false;
        }
        return boxing.boxBoolean(z);
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$refreshSupportChatList$2", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$refreshSupportChatList$2 */
    static final class C187452 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187452(Continuation<? super C187452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187452 c187452 = new C187452(continuation);
            c187452.L$0 = obj;
            return c187452;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
            return ((C187452) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ThreadListDataState.copy$default((ThreadListDataState) this.L$0, null, ThreadListViewState4.Failed.INSTANCE, null, 0L, 13, null);
        }
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2 */
    static final class C187292 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187292(Continuation<? super C187292> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187292 c187292 = ThreadListDuxo.this.new C187292(continuation);
            c187292.L$0 = obj;
            return c187292;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C187292) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$1", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ThreadListDuxo threadListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = threadListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<List<SupportChat>> flowPollSupportChatList = this.this$0.supportChatStore.pollSupportChatList();
                    C501831 c501831 = new C501831(null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowPollSupportChatList, c501831, this) == coroutine_suspended) {
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

            /* compiled from: ThreadListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$1$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501831 extends ContinuationImpl7 implements Function2<List<? extends SupportChat>, Continuation<? super Unit>, Object> {
                int label;

                C501831(Continuation<? super C501831> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C501831(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends SupportChat> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<SupportChat>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<SupportChat> list, Continuation<? super Unit> continuation) {
                    return ((C501831) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ThreadListDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ThreadListDuxo.this, null), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(ThreadListDuxo.this, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$2", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ThreadListDuxo threadListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = threadListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ThreadListDuxo threadListDuxo = this.this$0;
                    this.label = 1;
                    if (threadListDuxo.observeSupportChatRequiredAttention(this) == coroutine_suspended) {
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

        /* compiled from: ThreadListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$3", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$initializeSupportChatStreams$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ThreadListDuxo threadListDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = threadListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ThreadListDuxo threadListDuxo = this.this$0;
                    this.label = 1;
                    if (threadListDuxo.observeSupportChatUnreadMessageCount(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializeSupportChatStreams(Continuation<? super Job> continuation) {
        return CoroutineScope2.coroutineScope(new C187292(null), continuation);
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$markThreadsAsRead$1", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$markThreadsAsRead$1 */
    static final class C187311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $threadIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187311(List<String> list, Continuation<? super C187311> continuation) {
            super(2, continuation);
            this.$threadIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadListDuxo.this.new C187311(this.$threadIds, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InboxThreadStore inboxThreadStore = ThreadListDuxo.this.inboxThreadStore;
                List<String> list = this.$threadIds;
                this.label = 1;
                if (inboxThreadStore.markThreadsAsRead(list, this) == coroutine_suspended) {
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

    public final void markThreadsAsRead(List<String> threadIds) {
        Intrinsics.checkNotNullParameter(threadIds, "threadIds");
        bind(RxFactory.DefaultImpls.rxCompletable$default(this, null, new C187311(threadIds, null), 1, null), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadListDuxo.markThreadsAsRead$lambda$6((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markThreadsAsRead$lambda$6(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$postSawBadge$1", m3645f = "ThreadListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$postSawBadge$1 */
    static final class C187411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C187411(Continuation<? super C187411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadListDuxo.this.new C187411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InboxBadgeStore inboxBadgeStore = ThreadListDuxo.this.inboxBadgeStore;
                this.label = 1;
                if (inboxBadgeStore.postSawBadge(this) == coroutine_suspended) {
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

    public final void postSawBadge() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C187411(null), 3, null);
    }

    public final void refreshThreads() {
        Completable completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(this, null, new ThreadListDuxo5(this, null), 1, null);
        Completable completableOnErrorResumeNext = this.inboxThreadStore.fetchThreads(true).onErrorResumeNext(new Function() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$refreshThreads$refreshInboxThreads$1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Completable.complete();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "onErrorResumeNext(...)");
        Completable completableOnErrorResumeNext2 = Completable.merge(CollectionsKt.listOf((Object[]) new Completable[]{completableRxCompletable$default, completableOnErrorResumeNext})).timeout(10L, TimeUnit.SECONDS).onErrorResumeNext(new Function() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo.refreshThreads.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Completable.complete();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext2, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableOnErrorResumeNext2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListDuxo.refreshThreads$lambda$7(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshThreads$lambda$7(ThreadListDuxo threadListDuxo) {
        threadListDuxo.submit(ThreadListEvent.ManualRefreshComplete.INSTANCE);
        return Unit.INSTANCE;
    }

    public final void markSelectedThreadsAsRead() {
        bind(CompletablesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxCompletable$default(this, null, new C187301(CollectionsKt.toList(this._selectedThreads), null), 1, null)), LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListDuxo.markSelectedThreadsAsRead$lambda$8(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadListDuxo.markSelectedThreadsAsRead$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$markSelectedThreadsAsRead$1", m3645f = "ThreadListDuxo.kt", m3646l = {349}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$markSelectedThreadsAsRead$1 */
    static final class C187301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $selectedThreads;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187301(List<String> list, Continuation<? super C187301> continuation) {
            super(2, continuation);
            this.$selectedThreads = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThreadListDuxo.this.new C187301(this.$selectedThreads, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InboxThreadStore inboxThreadStore = ThreadListDuxo.this.inboxThreadStore;
                List<String> list = this.$selectedThreads;
                this.label = 1;
                if (inboxThreadStore.markThreadsAsRead(list, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markSelectedThreadsAsRead$lambda$8(ThreadListDuxo threadListDuxo) {
        threadListDuxo._selectedThreads.clear();
        threadListDuxo.applyMutation(new ThreadListDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markSelectedThreadsAsRead$lambda$9(ThreadListDuxo threadListDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        threadListDuxo.submit(new ThreadListEvent.MarkSelectedThreadsAsReadError(t));
        return Unit.INSTANCE;
    }

    public final void toggleThreadSelection(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (this._selectedThreads.contains(id)) {
            this._selectedThreads.remove(id);
        } else {
            this._selectedThreads.add(id);
        }
        applyMutation(new C187471(CollectionsKt.toSet(this._selectedThreads), null));
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$toggleThreadSelection$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$toggleThreadSelection$1 */
    static final class C187471 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
        final /* synthetic */ Set<String> $selectedThreads;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187471(Set<String> set, Continuation<? super C187471> continuation) {
            super(2, continuation);
            this.$selectedThreads = set;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187471 c187471 = new C187471(this.$selectedThreads, continuation);
            c187471.L$0 = obj;
            return c187471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
            return ((C187471) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ThreadListDataState.copy$default((ThreadListDataState) this.L$0, null, null, this.$selectedThreads, 0L, 11, null);
        }
    }

    /* compiled from: ThreadListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListDuxo$clearSelectedThreads$1", m3645f = "ThreadListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListDuxo$clearSelectedThreads$1 */
    static final class C187271 extends ContinuationImpl7 implements Function2<ThreadListDataState, Continuation<? super ThreadListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187271(Continuation<? super C187271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187271 c187271 = new C187271(continuation);
            c187271.L$0 = obj;
            return c187271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThreadListDataState threadListDataState, Continuation<? super ThreadListDataState> continuation) {
            return ((C187271) create(threadListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ThreadListDataState.copy$default((ThreadListDataState) this.L$0, null, null, SetsKt.emptySet(), 0L, 11, null);
        }
    }

    public final void clearSelectedThreads() {
        this._selectedThreads.clear();
        applyMutation(new C187271(null));
    }

    public final void markChatIssueAsShown(UUID id, boolean canLogImpression) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (canLogImpression) {
            this.supportChatStore.markSupportChatAsShown(id);
        }
    }
}
