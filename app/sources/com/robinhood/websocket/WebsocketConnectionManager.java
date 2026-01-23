package com.robinhood.websocket;

import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.WebsocketConnectionManager;
import com.robinhood.websocket.utils.WebsocketActiveState;
import com.robinhood.websocket.utils.WebsocketActiveState3;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* compiled from: WebsocketConnectionManager.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u00018B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0014J\u0016\u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020\u001cJ\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001eJ\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\u0012H\u0004J\b\u0010-\u001a\u00020.H\u0014J\u0018\u0010/\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001eH\u0002J.\u00101\u001a\u0004\u0018\u0001022\u001c\u00103\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020%05\u0012\u0006\u0012\u0004\u0018\u00010604H\u0096\u0001¢\u0006\u0002\u00107R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/websocket/WebsocketConnectionManager;", "Lcom/robinhood/websocket/utils/WebsocketLifecycleBinder;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/websocket/WebsocketConfiguration;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "okHttpClient", "Lokhttp3/OkHttpClient;", "websocketActiveState", "Lcom/robinhood/websocket/utils/WebsocketActiveState;", "<init>", "(Lcom/robinhood/websocket/WebsocketConfiguration;Lkotlinx/coroutines/CoroutineScope;Lokhttp3/OkHttpClient;Lcom/robinhood/websocket/utils/WebsocketActiveState;)V", "getConfiguration", "()Lcom/robinhood/websocket/WebsocketConfiguration;", "getRootCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent;", "webSocket", "Lokhttp3/WebSocket;", "getWebSocket", "()Lokhttp3/WebSocket;", "setWebSocket", "(Lokhttp3/WebSocket;)V", "connectingLock", "Lkotlinx/coroutines/sync/Mutex;", "shouldAutoReconnect", "", "reconnectUrl", "", "streamEvents", "Lkotlinx/coroutines/flow/Flow;", "buildRequest", "Lokhttp3/Request;", "url", "connect", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "automaticallyReconnect", "sendMessage", "msg", "emitEvent", "event", "createListener", "Lokhttp3/WebSocketListener;", "attemptReconnection", "source", "launchWithLifecycle", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "WebSocketEvent", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class WebsocketConnectionManager implements WebsocketActiveState3 {
    private final WebsocketConfiguration configuration;
    private final Mutex connectingLock;
    private final SharedFlow2<WebSocketEvent> eventFlow;
    private final OkHttpClient okHttpClient;
    private String reconnectUrl;
    private final CoroutineScope rootCoroutineScope;
    private boolean shouldAutoReconnect;
    private WebSocket webSocket;
    private final WebsocketActiveState websocketActiveState;

    /* compiled from: WebsocketConnectionManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.WebsocketConnectionManager", m3645f = "WebsocketConnectionManager.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, 102, 107}, m3647m = "connect")
    /* renamed from: com.robinhood.websocket.WebsocketConnectionManager$connect$1 */
    static final class C420441 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C420441(Continuation<? super C420441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebsocketConnectionManager.this.connect(null, this);
        }
    }

    @Override // com.robinhood.websocket.utils.WebsocketActiveState3
    public Job launchWithLifecycle(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return this.websocketActiveState.launchWithLifecycle(block);
    }

    public WebsocketConnectionManager(WebsocketConfiguration configuration, CoroutineScope rootCoroutineScope, OkHttpClient okHttpClient, WebsocketActiveState websocketActiveState) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(websocketActiveState, "websocketActiveState");
        this.configuration = configuration;
        this.rootCoroutineScope = rootCoroutineScope;
        this.okHttpClient = okHttpClient;
        this.websocketActiveState = websocketActiveState;
        this.eventFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.connectingLock = Mutex3.Mutex$default(false, 1, null);
    }

    protected final WebsocketConfiguration getConfiguration() {
        return this.configuration;
    }

    protected final CoroutineScope getRootCoroutineScope() {
        return this.rootCoroutineScope;
    }

    public /* synthetic */ WebsocketConnectionManager(WebsocketConfiguration websocketConfiguration, CoroutineScope coroutineScope, OkHttpClient okHttpClient, WebsocketActiveState websocketActiveState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(websocketConfiguration, coroutineScope, okHttpClient, (i & 8) != 0 ? new WebsocketActiveState(coroutineScope, false) : websocketActiveState);
    }

    protected final WebSocket getWebSocket() {
        return this.webSocket;
    }

    protected final void setWebSocket(WebSocket webSocket) {
        this.webSocket = webSocket;
    }

    public final Flow<WebSocketEvent> streamEvents() {
        return FlowKt.distinctUntilChanged(this.eventFlow, new Function2() { // from class: com.robinhood.websocket.WebsocketConnectionManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(WebsocketConnectionManager.streamEvents$lambda$0((WebsocketConnectionManager.WebSocketEvent) obj, (WebsocketConnectionManager.WebSocketEvent) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean streamEvents$lambda$0(WebSocketEvent old, WebSocketEvent webSocketEvent) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(webSocketEvent, "new");
        if ((old instanceof WebSocketEvent.Message) && (webSocketEvent instanceof WebSocketEvent.Message)) {
            return false;
        }
        return Intrinsics.areEqual(old, webSocketEvent);
    }

    protected Request buildRequest(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Request.Builder().url(url).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0127, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r12, r2) == r3) goto L57;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x014f: INVOKE (r11 I:kotlinx.coroutines.sync.Mutex), (r8 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:125), block:B:65:0x014f */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003c, B:58:0x012a, B:39:0x00d0, B:41:0x00d4, B:44:0x00da, B:46:0x00de, B:50:0x010b, B:52:0x0111, B:55:0x0117, B:59:0x0141, B:62:0x0147, B:21:0x0059, B:32:0x008d, B:34:0x0099, B:37:0x009f), top: B:67:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003c, B:58:0x012a, B:39:0x00d0, B:41:0x00d4, B:44:0x00da, B:46:0x00de, B:50:0x010b, B:52:0x0111, B:55:0x0117, B:59:0x0141, B:62:0x0147, B:21:0x0059, B:32:0x008d, B:34:0x0099, B:37:0x009f), top: B:67:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003c, B:58:0x012a, B:39:0x00d0, B:41:0x00d4, B:44:0x00da, B:46:0x00de, B:50:0x010b, B:52:0x0111, B:55:0x0117, B:59:0x0141, B:62:0x0147, B:21:0x0059, B:32:0x008d, B:34:0x0099, B:37:0x009f), top: B:67:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147 A[Catch: all -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003c, B:58:0x012a, B:39:0x00d0, B:41:0x00d4, B:44:0x00da, B:46:0x00de, B:50:0x010b, B:52:0x0111, B:55:0x0117, B:59:0x0141, B:62:0x0147, B:21:0x0059, B:32:0x008d, B:34:0x0099, B:37:0x009f), top: B:67:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0127 -> B:15:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object connect(String str, Continuation<? super Unit> continuation) {
        C420441 c420441;
        Mutex mutexUnlock;
        String str2;
        Mutex mutex;
        Ref.LongRef longRef;
        int reconnectRetryAttempts;
        int i;
        Ref.LongRef longRef2;
        int i2;
        int i3;
        if (continuation instanceof C420441) {
            c420441 = (C420441) continuation;
            int i4 = c420441.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c420441.label = i4 - Integer.MIN_VALUE;
            } else {
                c420441 = new C420441(continuation);
            }
        }
        Object obj = c420441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c420441.label;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.connectingLock.isLocked()) {
                    return Unit.INSTANCE;
                }
                Mutex mutex2 = this.connectingLock;
                str2 = str;
                c420441.L$0 = str2;
                c420441.L$1 = mutex2;
                c420441.label = 1;
                if (mutex2.lock(null, c420441) != coroutine_suspended) {
                    mutex = mutex2;
                }
                return coroutine_suspended;
            }
            if (i5 == 1) {
                Mutex mutex3 = (Mutex) c420441.L$1;
                String str3 = (String) c420441.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                str2 = str3;
            } else if (i5 == 2) {
                i3 = c420441.I$1;
                i2 = c420441.I$0;
                longRef2 = (Ref.LongRef) c420441.L$1;
                mutex = (Mutex) c420441.L$0;
                ResultKt.throwOnFailure(obj);
                if (((WebSocketEvent) obj) instanceof WebSocketEvent.Closed) {
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c420441.I$1;
                i2 = c420441.I$0;
                longRef2 = (Ref.LongRef) c420441.L$1;
                mutex = (Mutex) c420441.L$0;
                ResultKt.throwOnFailure(obj);
                longRef = longRef2;
                longRef.element = RangesKt.coerceAtMost(longRef.element * 2, this.configuration.getReconnectMaxDelay());
                int i6 = i2;
                i = i3 + 1;
                reconnectRetryAttempts = i6;
                if (i >= reconnectRetryAttempts) {
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
                if (!this.shouldAutoReconnect) {
                    Unit unit2 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit2;
                }
                String str4 = this.reconnectUrl;
                if (str4 == null) {
                    Unit unit3 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit3;
                }
                this.webSocket = this.okHttpClient.newWebSocket(buildRequest(str4), createListener());
                SharedFlow2<WebSocketEvent> sharedFlow2 = this.eventFlow;
                c420441.L$0 = mutex;
                c420441.L$1 = longRef;
                c420441.I$0 = reconnectRetryAttempts;
                c420441.I$1 = i;
                c420441.label = 2;
                Object objFirst = FlowKt.first(sharedFlow2, c420441);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                longRef2 = longRef;
                obj = objFirst;
                int i7 = i;
                i2 = reconnectRetryAttempts;
                i3 = i7;
                if (((WebSocketEvent) obj) instanceof WebSocketEvent.Closed) {
                    Unit unit4 = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit4;
                }
                long j = longRef2.element;
                c420441.L$0 = mutex;
                c420441.L$1 = longRef2;
                c420441.I$0 = i2;
                c420441.I$1 = i3;
                c420441.label = 3;
            }
            this.reconnectUrl = str2;
            this.shouldAutoReconnect = true;
            if (this.websocketActiveState.getIsWebsocketActive()) {
                Unit unit5 = Unit.INSTANCE;
                mutex.unlock(null);
                return unit5;
            }
            this.configuration.log("connect lock acquired for [" + str2 + "]");
            longRef = new Ref.LongRef();
            longRef.element = this.configuration.getReconnectInitialDelay();
            reconnectRetryAttempts = this.configuration.getReconnectRetryAttempts();
            i = 0;
            if (i >= reconnectRetryAttempts) {
            }
        } catch (Throwable th) {
            mutexUnlock.unlock(null);
            throw th;
        }
    }

    public static /* synthetic */ void disconnect$default(WebsocketConnectionManager websocketConnectionManager, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        websocketConnectionManager.disconnect(z);
    }

    public final void disconnect(boolean automaticallyReconnect) {
        this.configuration.log("disconnect(automaticallyReconnect=" + automaticallyReconnect + ") called, disconnecting websocket");
        this.shouldAutoReconnect = automaticallyReconnect;
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.cancel();
        }
    }

    public final boolean sendMessage(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!this.websocketActiveState.getIsWebsocketActive()) {
            return false;
        }
        WebsocketConfiguration websocketConfiguration = this.configuration;
        WebSocket webSocket = this.webSocket;
        websocketConfiguration.log("[" + (webSocket != null ? webSocket.hashCode() : 0) + "] --> " + msg);
        WebSocket webSocket2 = this.webSocket;
        if (webSocket2 != null) {
            boolean zSend = webSocket2.send(msg);
            if (!zSend) {
                WebsocketConfiguration websocketConfiguration2 = this.configuration;
                WebSocket webSocket3 = this.webSocket;
                websocketConfiguration2.log("[" + (webSocket3 != null ? webSocket3.hashCode() : 0) + "] --X FAILURE: send message failed");
            }
            if (zSend) {
                return true;
            }
        }
        return false;
    }

    protected final void emitEvent(WebSocketEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event, WebSocketEvent.Open.INSTANCE)) {
            this.websocketActiveState.set(true);
        } else if (Intrinsics.areEqual(event, WebSocketEvent.Closed.INSTANCE)) {
            this.websocketActiveState.set(false);
            this.webSocket = null;
        } else if (!(event instanceof WebSocketEvent.Message)) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C420461(event, null), 3, null);
    }

    /* compiled from: WebsocketConnectionManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.WebsocketConnectionManager$emitEvent$1", m3645f = "WebsocketConnectionManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.websocket.WebsocketConnectionManager$emitEvent$1 */
    static final class C420461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WebSocketEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420461(WebSocketEvent webSocketEvent, Continuation<? super C420461> continuation) {
            super(2, continuation);
            this.$event = webSocketEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebsocketConnectionManager.this.new C420461(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C420461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = WebsocketConnectionManager.this.eventFlow;
                WebSocketEvent webSocketEvent = this.$event;
                this.label = 1;
                if (sharedFlow2.emit(webSocketEvent, this) == coroutine_suspended) {
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

    protected WebSocketListener createListener() {
        return new WebSocketListener() { // from class: com.robinhood.websocket.WebsocketConnectionManager.createListener.1
            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                if (Intrinsics.areEqual(WebsocketConnectionManager.this.getWebSocket(), webSocket)) {
                    WebsocketConnectionManager.this.getConfiguration().log("[" + webSocket.hashCode() + "] websocket opened via listener");
                    WebsocketConnectionManager.this.emitEvent(WebSocketEvent.Open.INSTANCE);
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                onMessage(webSocket, bytes.toString());
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                if (Intrinsics.areEqual(WebsocketConnectionManager.this.getWebSocket(), webSocket)) {
                    WebsocketConnectionManager.this.getConfiguration().log("[" + webSocket.hashCode() + "] <-- " + text);
                    WebsocketConnectionManager.this.emitEvent(new WebSocketEvent.Message(text));
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (Intrinsics.areEqual(WebsocketConnectionManager.this.getWebSocket(), webSocket)) {
                    WebsocketConnectionManager.this.getConfiguration().log("[" + webSocket.hashCode() + "] websocket closing via listener (code=" + code + ", reason=" + reason + ")");
                    WebsocketConnectionManager.this.emitEvent(WebSocketEvent.Closed.INSTANCE);
                    if (WebsocketConnectionManager.this.getConfiguration().getReconnectOnClose()) {
                        WebsocketConnectionManager.this.attemptReconnection(webSocket, "onClosing");
                    }
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int code, String reason) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(reason, "reason");
                if (Intrinsics.areEqual(WebsocketConnectionManager.this.getWebSocket(), webSocket)) {
                    WebsocketConnectionManager.this.getConfiguration().log("[" + webSocket.hashCode() + "] websocket closed via listener (code=" + code + ", reason=" + reason + ")");
                    WebsocketConnectionManager.this.emitEvent(WebSocketEvent.Closed.INSTANCE);
                    if (WebsocketConnectionManager.this.getConfiguration().getReconnectOnClose()) {
                        WebsocketConnectionManager.this.attemptReconnection(webSocket, "onClosed");
                    }
                }
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t, "t");
                if (Intrinsics.areEqual(WebsocketConnectionManager.this.getWebSocket(), webSocket)) {
                    WebsocketConnectionManager.this.getConfiguration().log("[" + webSocket.hashCode() + "] websocket error via listener: " + t.getMessage());
                    WebsocketConnectionManager.this.emitEvent(WebSocketEvent.Closed.INSTANCE);
                    WebsocketConnectionManager.this.attemptReconnection(webSocket, "onFailure");
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptReconnection(WebSocket webSocket, String source) {
        if (!this.shouldAutoReconnect) {
            this.configuration.log("[" + webSocket.hashCode() + "] No reconnection from " + source + " (shouldAutoReconnect is false)");
            return;
        }
        String str = this.reconnectUrl;
        if (str != null) {
            this.configuration.log("[" + webSocket.hashCode() + "] Attempting reconnection from " + source);
            if (BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new WebsocketConnectionManager2(this, str, null), 3, null) != null) {
                return;
            }
        }
        this.configuration.log("[" + webSocket.hashCode() + "] No reconnection from " + source + " (reconnectUrl is null)");
        Unit unit = Unit.INSTANCE;
    }

    /* compiled from: WebsocketConnectionManager.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent;", "", "<init>", "()V", "Open", "Message", "Closed", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent$Closed;", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent$Message;", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent$Open;", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class WebSocketEvent {
        public /* synthetic */ WebSocketEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private WebSocketEvent() {
        }

        /* compiled from: WebsocketConnectionManager.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent$Open;", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Open extends WebSocketEvent {
            public static final Open INSTANCE = new Open();

            public boolean equals(Object other) {
                return this == other || (other instanceof Open);
            }

            public int hashCode() {
                return 233978683;
            }

            public String toString() {
                return "Open";
            }

            private Open() {
                super(null);
            }
        }

        /* compiled from: WebsocketConnectionManager.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent$Message;", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent;", "msg", "", "<init>", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Message extends WebSocketEvent {
            private final String msg;

            public static /* synthetic */ Message copy$default(Message message, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = message.msg;
                }
                return message.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMsg() {
                return this.msg;
            }

            public final Message copy(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                return new Message(msg);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Message) && Intrinsics.areEqual(this.msg, ((Message) other).msg);
            }

            public int hashCode() {
                return this.msg.hashCode();
            }

            public String toString() {
                return "Message(msg=" + this.msg + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Message(String msg) {
                super(null);
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.msg = msg;
            }

            public final String getMsg() {
                return this.msg;
            }
        }

        /* compiled from: WebsocketConnectionManager.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent$Closed;", "Lcom/robinhood/websocket/WebsocketConnectionManager$WebSocketEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Closed extends WebSocketEvent {
            public static final Closed INSTANCE = new Closed();

            public boolean equals(Object other) {
                return this == other || (other instanceof Closed);
            }

            public int hashCode() {
                return 1168277021;
            }

            public String toString() {
                return "Closed";
            }

            private Closed() {
                super(null);
            }
        }
    }
}
