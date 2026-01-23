package com.robinhood.websocket;

import android.os.SystemClock;
import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.BaseWebsocketSource;
import com.robinhood.websocket.WebsocketConnectionManager;
import com.robinhood.websocket.api.WebsocketConnectionListener;
import com.robinhood.websocket.api.WebsocketConnectionListener2;
import com.robinhood.websocket.api.WebsocketMessageHandler;
import com.robinhood.websocket.api.WebsocketMessageListener;
import com.robinhood.websocket.api.WebsocketSource;
import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.robinhood.websocket.utils.DataFlowManager;
import com.robinhood.websocket.utils.DataFlowManager5;
import com.robinhood.websocket.utils.DataFlowManager6;
import com.singular.sdk.internal.Constants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BaseWebsocketSource.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001LB=\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\b\b\u0002\u0010#*\u00028\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0\u001dH\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\u00020'\"\b\b\u0002\u0010#*\u00028\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0\u001d2\u0006\u0010+\u001a\u00020,H\u0016J\u0014\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d0 H\u0004J\b\u0010.\u001a\u00020'H\u0015J\u0014\u0010/\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020'01J\u000e\u00102\u001a\u00020'2\u0006\u00103\u001a\u00020\u0015J\u000e\u00104\u001a\u00020'2\u0006\u00103\u001a\u00020\u0015J \u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'07J\u0014\u00105\u001a\u00020'2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0014\u00109\u001a\u00020'2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\b\u0010:\u001a\u00020'H\u0002J\u0010\u0010;\u001a\u0004\u0018\u00010<H¤@¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020'H\u0002J\b\u0010?\u001a\u00020'H\u0004J4\u0010@\u001a\u00020'2\u0014\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d\u0018\u00010 2\u0014\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d\u0018\u00010 H\u0014J\b\u0010C\u001a\u00020'H\u0004J\u0010\u0010D\u001a\u00020'2\u0006\u0010E\u001a\u00020<H\u0004J-\u0010F\u001a\u0004\u0018\u00010G2\u001c\u0010H\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0I\u0012\u0006\u0012\u0004\u0018\u00010J07H\u0004¢\u0006\u0002\u0010KR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d0 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, m3636d2 = {"Lcom/robinhood/websocket/BaseWebsocketSource;", "ResponseT", "DataT", "Lcom/robinhood/websocket/api/WebsocketSource;", "Lcom/robinhood/websocket/utils/DataFlowSubscriptionListener;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/websocket/WebsocketConfiguration;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/api/WebsocketMessageHandler;", "connectionManager", "Lcom/robinhood/websocket/WebsocketConnectionManager;", "timeProvider", "Lcom/robinhood/websocket/utils/TimeProvider;", "<init>", "(Lcom/robinhood/websocket/WebsocketConfiguration;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/websocket/api/WebsocketMessageHandler;Lcom/robinhood/websocket/WebsocketConnectionManager;Lcom/robinhood/websocket/utils/TimeProvider;)V", "dataFlowManager", "Lcom/robinhood/websocket/utils/DataFlowManager;", "connectionListeners", "", "Lcom/robinhood/websocket/api/WebsocketConnectionListener;", "messageListeners", "Lcom/robinhood/websocket/api/WebsocketMessageListener;", "preconnectFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "activeSubscriptionState", "", "Lcom/robinhood/websocket/api/WebsocketTopic;", "activeSubscriptions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "stream", "Lkotlinx/coroutines/flow/Flow;", "T", WebsocketGatewayConstants.TOPIC_KEY, "preConnectSocket", "maintainConnection", "", "timeoutMs", "", "onSubscribedChanged", "subscribed", "", "getCurrentActiveSubscriptions", "onActiveSubscriptionsChanged", "addConnectionOpenListener", "onConnectionOpen", "Lkotlin/Function0;", "addConnectionListener", "websocketConnectionListener", "removeConnectionListener", "addMessageListener", "onMessage", "Lkotlin/Function1;", "websocketMessageListener", "removeMessageListener", "observeSubscriptionChanges", "getWebsocketUrl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeWebsocketEvents", "onSocketReady", "onSubscriptionChanged", "addedTopics", "removedTopics", "resetWebsocketConnection", "sendMessage", "message", "launchWithLifecycle", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "SubscriptionChange", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class BaseWebsocketSource<ResponseT, DataT> implements WebsocketSource<DataT>, DataFlowManager5<DataT> {
    private final Set<WebsocketTopic<DataT>> activeSubscriptionState;
    private final StateFlow2<Set<WebsocketTopic<DataT>>> activeSubscriptions;
    private final WebsocketConfiguration configuration;
    private final List<WebsocketConnectionListener> connectionListeners;
    private final WebsocketConnectionManager connectionManager;
    private final CoroutineScope coroutineScope;
    private final DataFlowManager<ResponseT, DataT> dataFlowManager;
    private final WebsocketMessageHandler<ResponseT, DataT> messageHandler;
    private final List<WebsocketMessageListener<ResponseT>> messageListeners;
    private final SharedFlow2 preconnectFlow;
    private final DataFlowManager6 timeProvider;

    protected abstract Object getWebsocketUrl(Continuation<? super String> continuation);

    protected void onSubscriptionChanged(Set<? extends WebsocketTopic<? extends DataT>> addedTopics, Set<? extends WebsocketTopic<? extends DataT>> removedTopics) {
    }

    public BaseWebsocketSource(WebsocketConfiguration configuration, CoroutineScope coroutineScope, WebsocketMessageHandler<ResponseT, DataT> messageHandler, WebsocketConnectionManager connectionManager, DataFlowManager6 timeProvider) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.configuration = configuration;
        this.coroutineScope = coroutineScope;
        this.messageHandler = messageHandler;
        this.connectionManager = connectionManager;
        this.timeProvider = timeProvider;
        DataFlowManager<ResponseT, DataT> dataFlowManager = new DataFlowManager<>(coroutineScope, messageHandler, timeProvider);
        this.dataFlowManager = dataFlowManager;
        this.connectionListeners = new ArrayList();
        this.messageListeners = new ArrayList();
        this.preconnectFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.activeSubscriptionState = new LinkedHashSet();
        this.activeSubscriptions = StateFlow4.MutableStateFlow(SetsKt.emptySet());
        observeSubscriptionChanges();
        observeWebsocketEvents();
        addMessageListener(dataFlowManager);
    }

    public /* synthetic */ BaseWebsocketSource(WebsocketConfiguration websocketConfiguration, CoroutineScope coroutineScope, WebsocketMessageHandler websocketMessageHandler, WebsocketConnectionManager websocketConnectionManager, DataFlowManager6 dataFlowManager6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(websocketConfiguration, coroutineScope, websocketMessageHandler, websocketConnectionManager, (i & 16) != 0 ? new DataFlowManager6() { // from class: com.robinhood.websocket.BaseWebsocketSource.1
            @Override // com.robinhood.websocket.utils.DataFlowManager6
            public long elapsedRealtime() {
                return SystemClock.elapsedRealtime();
            }
        } : dataFlowManager6);
    }

    @Override // com.robinhood.websocket.api.WebsocketSource
    public <T extends DataT> Flow<T> stream(WebsocketTopic<? extends T> topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return this.dataFlowManager.getDataFlow(topic, this.configuration.getDataSubscriptionTimeout(), this);
    }

    @Override // com.robinhood.websocket.api.WebsocketSource
    public Flow preConnectSocket() {
        return this.preconnectFlow;
    }

    @Override // com.robinhood.websocket.api.WebsocketSource
    public void maintainConnection(long timeoutMs) {
        Iterator<T> it = this.activeSubscriptionState.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BaseWebsocketSource2(timeoutMs, FlowKt.launchIn(stream((WebsocketTopic) it.next()), this.coroutineScope), null), 3, null);
        }
    }

    @Override // com.robinhood.websocket.utils.DataFlowManager5
    public <T extends DataT> void onSubscribedChanged(WebsocketTopic<? extends T> topic, boolean subscribed) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        synchronized (this.activeSubscriptionState) {
            try {
                boolean zContains = this.activeSubscriptionState.contains(topic);
                if (subscribed && !zContains) {
                    this.activeSubscriptionState.add(topic);
                    onActiveSubscriptionsChanged();
                } else if (!subscribed && zContains) {
                    this.activeSubscriptionState.remove(topic);
                    onActiveSubscriptionsChanged();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final Set<WebsocketTopic<DataT>> getCurrentActiveSubscriptions() {
        return this.activeSubscriptionState;
    }

    /* compiled from: BaseWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$onActiveSubscriptionsChanged$1", m3645f = "BaseWebsocketSource.kt", m3646l = {125}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.websocket.BaseWebsocketSource$onActiveSubscriptionsChanged$1 */
    static final class C420411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseWebsocketSource<ResponseT, DataT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420411(BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource, Continuation<? super C420411> continuation) {
            super(2, continuation);
            this.this$0 = baseWebsocketSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C420411(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C420411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Set set;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Set set2 = ((BaseWebsocketSource) this.this$0).activeSubscriptionState;
                BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource = this.this$0;
                synchronized (set2) {
                    set = CollectionsKt.toSet(((BaseWebsocketSource) baseWebsocketSource).activeSubscriptionState);
                }
                StateFlow2 stateFlow2 = ((BaseWebsocketSource) this.this$0).activeSubscriptions;
                this.label = 1;
                if (stateFlow2.emit(set, this) == coroutine_suspended) {
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

    protected void onActiveSubscriptionsChanged() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C420411(this, null), 3, null);
    }

    public final WebsocketConnectionListener addConnectionOpenListener(final Function0<Unit> onConnectionOpen) {
        Intrinsics.checkNotNullParameter(onConnectionOpen, "onConnectionOpen");
        WebsocketConnectionListener2 websocketConnectionListener2 = new WebsocketConnectionListener2() { // from class: com.robinhood.websocket.BaseWebsocketSource.addConnectionOpenListener.1
            @Override // com.robinhood.websocket.api.WebsocketConnectionListener2, com.robinhood.websocket.api.WebsocketConnectionListener
            public void onConnectionOpen() {
                onConnectionOpen.invoke();
            }
        };
        addConnectionListener(websocketConnectionListener2);
        return websocketConnectionListener2;
    }

    public final void addConnectionListener(WebsocketConnectionListener websocketConnectionListener) {
        Intrinsics.checkNotNullParameter(websocketConnectionListener, "websocketConnectionListener");
        synchronized (this.connectionListeners) {
            this.connectionListeners.add(websocketConnectionListener);
        }
    }

    public final void removeConnectionListener(WebsocketConnectionListener websocketConnectionListener) {
        Intrinsics.checkNotNullParameter(websocketConnectionListener, "websocketConnectionListener");
        synchronized (this.connectionListeners) {
            this.connectionListeners.remove(websocketConnectionListener);
        }
    }

    public final WebsocketMessageListener<ResponseT> addMessageListener(final Function1<? super ResponseT, Unit> onMessage) {
        Intrinsics.checkNotNullParameter(onMessage, "onMessage");
        WebsocketMessageListener<ResponseT> websocketMessageListener = new WebsocketMessageListener<ResponseT>() { // from class: com.robinhood.websocket.BaseWebsocketSource.addMessageListener.1
            @Override // com.robinhood.websocket.api.WebsocketMessageListener
            public void onMessageReceived(ResponseT message) {
                onMessage.invoke(message);
            }
        };
        addMessageListener(websocketMessageListener);
        return websocketMessageListener;
    }

    public final void addMessageListener(WebsocketMessageListener<ResponseT> websocketMessageListener) {
        Intrinsics.checkNotNullParameter(websocketMessageListener, "websocketMessageListener");
        synchronized (this.messageListeners) {
            this.messageListeners.add(websocketMessageListener);
        }
    }

    public final void removeMessageListener(WebsocketMessageListener<ResponseT> websocketMessageListener) {
        Intrinsics.checkNotNullParameter(websocketMessageListener, "websocketMessageListener");
        synchronized (this.messageListeners) {
            this.messageListeners.remove(websocketMessageListener);
        }
    }

    private final void observeSubscriptionChanges() {
        final StateFlow<Integer> subscriptionCount = this.preconnectFlow.getSubscriptionCount();
        Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = subscriptionCount.collect(new C420302(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$1$2 */
            public static final class C420302<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$1$2", m3645f = "BaseWebsocketSource.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C420302.this.emit(null, this);
                    }
                }

                public C420302(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((Number) obj).intValue() > 0);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
        final SharedFlow sharedFlowAsSharedFlow = FlowKt.asSharedFlow(this.activeSubscriptions);
        Flow<Boolean> flow2 = new Flow<Boolean>() { // from class: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlowAsSharedFlow.collect(new C420312(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$2$2 */
            public static final class C420312<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$2$2", m3645f = "BaseWebsocketSource.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C420312.this.emit(null, this);
                    }
                }

                public C420312(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(!((Set) obj).isEmpty());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Flow flowDrop = FlowKt.drop(FlowKt.combine(flow, flow2, new C420381(null)), 1);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowDrop.collect(new C420322(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$3$2 */
            public static final class C420322<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ BaseWebsocketSource this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$3$2", m3645f = "BaseWebsocketSource.kt", m3646l = {51, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$$inlined$map$3$2$1, reason: invalid class name */
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
                        return C420322.this.emit(null, this);
                    }
                }

                public C420322(FlowCollector flowCollector, BaseWebsocketSource baseWebsocketSource) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = baseWebsocketSource;
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
                
                    if (r9.emit(r8, r0) != r1) goto L27;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    FlowCollector flowCollector;
                    FlowCollector flowCollector2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj3 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj3);
                        FlowCollector flowCollector3 = this.$this_unsafeFlow;
                        if (!((Boolean) obj).booleanValue()) {
                            obj2 = null;
                            flowCollector2 = flowCollector3;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        } else {
                            BaseWebsocketSource baseWebsocketSource = this.this$0;
                            anonymousClass1.L$0 = flowCollector3;
                            anonymousClass1.label = 1;
                            Object websocketUrl = baseWebsocketSource.getWebsocketUrl(anonymousClass1);
                            if (websocketUrl != coroutine_suspended) {
                                obj3 = websocketUrl;
                                flowCollector = flowCollector3;
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        flowCollector = (FlowCollector) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(obj3);
                    }
                    Object obj4 = obj3;
                    flowCollector2 = flowCollector;
                    obj2 = obj4;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }
        }), new C420393(objectRef, this, null)), this.coroutineScope);
    }

    /* compiled from: BaseWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$1", m3645f = "BaseWebsocketSource.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$1 */
    static final class C420381 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        C420381(Continuation<? super C420381> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            C420381 c420381 = new C420381(continuation);
            c420381.Z$0 = z;
            c420381.Z$1 = z2;
            return c420381.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.Z$0 || this.Z$1);
        }
    }

    /* compiled from: BaseWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "websocketUrl", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$3", m3645f = "BaseWebsocketSource.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$3 */
    static final class C420393 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Job> $pendingJob;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseWebsocketSource<ResponseT, DataT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420393(Ref.ObjectRef<Job> objectRef, BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource, Continuation<? super C420393> continuation) {
            super(2, continuation);
            this.$pendingJob = objectRef;
            this.this$0 = baseWebsocketSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C420393 c420393 = new C420393(this.$pendingJob, this.this$0, continuation);
            c420393.L$0 = obj;
            return c420393;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C420393) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r10v4, types: [T, kotlinx.coroutines.Job] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            Job job = this.$pendingJob.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.$pendingJob.element = BuildersKt__Builders_commonKt.launch$default(((BaseWebsocketSource) this.this$0).coroutineScope, null, null, new AnonymousClass1(str, this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: BaseWebsocketSource.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$3$1", m3645f = "BaseWebsocketSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeSubscriptionChanges$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $websocketUrl;
            int label;
            final /* synthetic */ BaseWebsocketSource<ResponseT, DataT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$websocketUrl = str;
                this.this$0 = baseWebsocketSource;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$websocketUrl, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
            
                if (r7.connect(r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$websocketUrl != null) {
                        WebsocketConnectionManager websocketConnectionManager = ((BaseWebsocketSource) this.this$0).connectionManager;
                        String str = this.$websocketUrl;
                        this.label = 1;
                    } else {
                        long disconnectTimeout = ((BaseWebsocketSource) this.this$0).configuration.getDisconnectTimeout();
                        this.label = 2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WebsocketConnectionManager.disconnect$default(((BaseWebsocketSource) this.this$0).connectionManager, false, 1, null);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: BaseWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$observeWebsocketEvents$1", m3645f = "BaseWebsocketSource.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.websocket.BaseWebsocketSource$observeWebsocketEvents$1 */
    static final class C420401 extends ContinuationImpl7 implements Function2<WebsocketConnectionManager.WebSocketEvent, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseWebsocketSource<ResponseT, DataT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420401(BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource, Continuation<? super C420401> continuation) {
            super(2, continuation);
            this.this$0 = baseWebsocketSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C420401 c420401 = new C420401(this.this$0, continuation);
            c420401.L$0 = obj;
            return c420401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WebsocketConnectionManager.WebSocketEvent webSocketEvent, Continuation<? super Unit> continuation) {
            return ((C420401) create(webSocketEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WebsocketConnectionManager.WebSocketEvent webSocketEvent = (WebsocketConnectionManager.WebSocketEvent) this.L$0;
            if (!Intrinsics.areEqual(webSocketEvent, WebsocketConnectionManager.WebSocketEvent.Open.INSTANCE)) {
                if (!Intrinsics.areEqual(webSocketEvent, WebsocketConnectionManager.WebSocketEvent.Closed.INSTANCE)) {
                    if (webSocketEvent instanceof WebsocketConnectionManager.WebSocketEvent.Message) {
                        Object objDeserialize = ((BaseWebsocketSource) this.this$0).messageHandler.deserialize(((WebsocketConnectionManager.WebSocketEvent.Message) webSocketEvent).getMsg());
                        if (objDeserialize == null) {
                            return Unit.INSTANCE;
                        }
                        Iterator it = ((BaseWebsocketSource) this.this$0).messageListeners.iterator();
                        while (it.hasNext()) {
                            ((WebsocketMessageListener) it.next()).onMessageReceived(objDeserialize);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    Iterator it2 = ((BaseWebsocketSource) this.this$0).connectionListeners.iterator();
                    while (it2.hasNext()) {
                        ((WebsocketConnectionListener) it2.next()).onConnectionClosed();
                    }
                }
            } else {
                Iterator it3 = ((BaseWebsocketSource) this.this$0).connectionListeners.iterator();
                while (it3.hasNext()) {
                    ((WebsocketConnectionListener) it3.next()).onConnectionOpen();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void observeWebsocketEvents() {
        FlowKt.launchIn(FlowKt.onEach(this.connectionManager.streamEvents(), new C420401(this, null)), this.coroutineScope);
    }

    /* compiled from: BaseWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1", m3645f = "BaseWebsocketSource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1 */
    static final class C420421 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseWebsocketSource<ResponseT, DataT> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420421(BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource, Continuation<? super C420421> continuation) {
            super(1, continuation);
            this.this$0 = baseWebsocketSource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C420421(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420421) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowRunningFold = FlowKt.runningFold(FlowKt.debounce(((BaseWebsocketSource) this.this$0).activeSubscriptions, 100L), Tuples4.m3642to(SetsKt.emptySet(), new SubscriptionChange(this.this$0, null, null, 3, null)), new AnonymousClass1(this.this$0, null));
                final Flow<BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange> flow = new Flow<BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange>() { // from class: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flowRunningFold.collect(new C420342(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C420342<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$map$1$2", m3645f = "BaseWebsocketSource.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C420342.this.emit(null, this);
                            }
                        }

                        public C420342(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
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
                                Object second = ((Tuples2) obj).getSecond();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(second, anonymousClass1) == coroutine_suspended) {
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
                Flow<BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange> flow2 = new Flow<BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange>() { // from class: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$filter$1$2", m3645f = "BaseWebsocketSource.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
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
                                BaseWebsocketSource.SubscriptionChange subscriptionChange = (BaseWebsocketSource.SubscriptionChange) obj;
                                if (subscriptionChange.getAdd() != null || subscriptionChange.getRemove() != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                final BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource = this.this$0;
                FlowCollector<? super BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange> flowCollector = new FlowCollector() { // from class: com.robinhood.websocket.BaseWebsocketSource.onSocketReady.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SubscriptionChange) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange subscriptionChange, Continuation<? super Unit> continuation) {
                        baseWebsocketSource.onSubscriptionChanged(subscriptionChange.getAdd(), subscriptionChange.getRemove());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow2.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: BaseWebsocketSource.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0002\u0012\u0014\u0012\u00120\u0005R\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00040\u00060\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00072.\u0010\b\u001a*\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0002\u0012\u0014\u0012\u00120\u0005R\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00040\u00060\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/robinhood/websocket/api/WebsocketTopic;", "DataT", "Lcom/robinhood/websocket/BaseWebsocketSource$SubscriptionChange;", "Lcom/robinhood/websocket/BaseWebsocketSource;", "ResponseT", "<destruct>", "current"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$1", m3645f = "BaseWebsocketSource.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.websocket.BaseWebsocketSource$onSocketReady$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Tuples2<? extends Set<? extends WebsocketTopic<? extends DataT>>, ? extends BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange>, Set<? extends WebsocketTopic<? extends DataT>>, Continuation<? super Tuples2<? extends Set<? extends WebsocketTopic<? extends DataT>>, ? extends BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ BaseWebsocketSource<ResponseT, DataT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BaseWebsocketSource<ResponseT, DataT> baseWebsocketSource, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = baseWebsocketSource;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Tuples2<? extends Set<? extends WebsocketTopic<? extends DataT>>, BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange> tuples2, Set<? extends WebsocketTopic<? extends DataT>> set, Continuation<? super Tuples2<? extends Set<? extends WebsocketTopic<? extends DataT>>, BaseWebsocketSource<ResponseT, DataT>.SubscriptionChange>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = tuples2;
                anonymousClass1.L$1 = set;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                Set set = (Set) this.L$1;
                Set set2 = (Set) tuples2.component1();
                Set setMinus = SetsKt.minus(set, (Iterable) set2);
                if (setMinus.isEmpty()) {
                    setMinus = null;
                }
                Set set3 = setMinus;
                Set setMinus2 = SetsKt.minus(set2, (Iterable) set);
                return Tuples4.m3642to(set, this.this$0.new SubscriptionChange(set3, setMinus2.isEmpty() ? null : setMinus2));
            }
        }
    }

    protected final void onSocketReady() {
        this.connectionManager.launchWithLifecycle(new C420421(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseWebsocketSource.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/websocket/BaseWebsocketSource$SubscriptionChange;", "", "add", "", "Lcom/robinhood/websocket/api/WebsocketTopic;", "remove", "<init>", "(Lcom/robinhood/websocket/BaseWebsocketSource;Ljava/util/Set;Ljava/util/Set;)V", "getAdd", "()Ljava/util/Set;", "getRemove", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class SubscriptionChange {
        private final Set<WebsocketTopic<DataT>> add;
        private final Set<WebsocketTopic<DataT>> remove;

        /* JADX WARN: Multi-variable type inference failed */
        public SubscriptionChange(Set<? extends WebsocketTopic<? extends DataT>> set, Set<? extends WebsocketTopic<? extends DataT>> set2) {
            this.add = set;
            this.remove = set2;
        }

        public /* synthetic */ SubscriptionChange(BaseWebsocketSource baseWebsocketSource, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : set, (i & 2) != 0 ? null : set2);
        }

        public final Set<WebsocketTopic<DataT>> getAdd() {
            return this.add;
        }

        public final Set<WebsocketTopic<DataT>> getRemove() {
            return this.remove;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void resetWebsocketConnection() {
        this.connectionManager.disconnect(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sendMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.connectionManager.sendMessage(message);
    }

    protected final Job launchWithLifecycle(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return this.connectionManager.launchWithLifecycle(block);
    }
}
