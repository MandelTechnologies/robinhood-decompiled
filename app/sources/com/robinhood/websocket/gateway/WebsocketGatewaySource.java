package com.robinhood.websocket.gateway;

import com.plaid.internal.EnumC7081g;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.BaseWebsocketSource;
import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.gateway.models.WebsocketGatewayData;
import com.robinhood.websocket.gateway.models.WebsocketGatewayMessage;
import com.robinhood.websocket.gateway.models.WebsocketGatewayResponse;
import com.robinhood.websocket.gateway.p412di.WebsocketGatewayMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import p479j$.time.Instant;
import p479j$.util.Base64;

/* compiled from: WebsocketGatewaySource.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0094@¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;", "Lcom/robinhood/websocket/BaseWebsocketSource;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayResponse;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData;", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lkotlinx/coroutines/CoroutineScope;", "rootCoroutineScope", "Lcom/robinhood/websocket/gateway/WebsocketGatewayMessageHandler;", "messageHandler", "Lcom/robinhood/websocket/gateway/WebsocketGatewayConnectionManager;", "connectionManager", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "<init>", "(Lcom/robinhood/targetbackend/TargetBackend;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/websocket/gateway/WebsocketGatewayMessageHandler;Lcom/robinhood/websocket/gateway/WebsocketGatewayConnectionManager;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "", "setupPing", "()V", "scheduleCheckPong", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPongReceived", "", "getWebsocketUrl", "onActiveSubscriptionsChanged", "Lcom/robinhood/targetbackend/TargetBackend;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayMessage;", "messageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "j$/time/Instant", "instantAdapter", "Lcom/robinhood/websocket/gateway/WebsocketGatewayTopic;", "subscribedTopic", "Lcom/robinhood/websocket/gateway/WebsocketGatewayTopic;", "Lkotlinx/coroutines/sync/Mutex;", "pongMutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/Job;", "checkPongJob", "Lkotlinx/coroutines/Job;", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WebsocketGatewaySource extends BaseWebsocketSource<WebsocketGatewayResponse, WebsocketGatewayData> {
    private Job checkPongJob;
    private final JsonAdapter<Instant> instantAdapter;
    private final JsonAdapter<WebsocketGatewayMessage> messageAdapter;
    private final Mutex pongMutex;
    private final CoroutineScope rootCoroutineScope;
    private WebsocketGatewayTopic<WebsocketGatewayData> subscribedTopic;
    private final TargetBackend targetBackend;

    /* compiled from: WebsocketGatewaySource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.gateway.WebsocketGatewaySource", m3645f = "WebsocketGatewaySource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "scheduleCheckPong")
    /* renamed from: com.robinhood.websocket.gateway.WebsocketGatewaySource$scheduleCheckPong$1 */
    static final class C420531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420531(Continuation<? super C420531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebsocketGatewaySource.this.scheduleCheckPong(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketGatewaySource(TargetBackend targetBackend, @RootCoroutineScope CoroutineScope rootCoroutineScope, WebsocketGatewayMessageHandler messageHandler, WebsocketGatewayConnectionManager connectionManager, @WebsocketGatewayMoshi LazyMoshi moshi) {
        super(WebsocketGatewayConstants.INSTANCE.getCONFIGURATION(), rootCoroutineScope, messageHandler, connectionManager, null, 16, null);
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.targetBackend = targetBackend;
        this.rootCoroutineScope = rootCoroutineScope;
        Types types = Types.INSTANCE;
        this.messageAdapter = moshi.adapter(new TypeToken<WebsocketGatewayMessage>() { // from class: com.robinhood.websocket.gateway.WebsocketGatewaySource$special$$inlined$getAdapter$1
        }.getType());
        this.instantAdapter = moshi.adapter(new TypeToken<Instant>() { // from class: com.robinhood.websocket.gateway.WebsocketGatewaySource$special$$inlined$getAdapter$2
        }.getType());
        addConnectionOpenListener(new Function0() { // from class: com.robinhood.websocket.gateway.WebsocketGatewaySource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebsocketGatewaySource._init_$lambda$0(this.f$0);
            }
        });
        addMessageListener(new Function1() { // from class: com.robinhood.websocket.gateway.WebsocketGatewaySource$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebsocketGatewaySource._init_$lambda$1(this.f$0, (WebsocketGatewayResponse) obj);
            }
        });
        this.pongMutex = Mutex3.Mutex$default(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(WebsocketGatewaySource websocketGatewaySource) {
        websocketGatewaySource.setupPing();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(WebsocketGatewaySource websocketGatewaySource, WebsocketGatewayResponse message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof WebsocketGatewayResponse.Pong) {
            websocketGatewaySource.onPongReceived();
        } else if (!(message instanceof WebsocketGatewayResponse.EventResponse)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.websocket.BaseWebsocketSource
    protected Object getWebsocketUrl(Continuation<? super String> continuation) {
        synchronized (this) {
            WebsocketGatewayConstants websocketGatewayConstants = WebsocketGatewayConstants.INSTANCE;
            TargetBackend targetBackend = this.targetBackend;
            WebsocketGatewayTopic<WebsocketGatewayData> websocketGatewayTopic = this.subscribedTopic;
            if (websocketGatewayTopic == null) {
                return null;
            }
            return websocketGatewayConstants.getWebsocketUrl(targetBackend, websocketGatewayTopic);
        }
    }

    @Override // com.robinhood.websocket.BaseWebsocketSource
    protected void onActiveSubscriptionsChanged() {
        synchronized (this) {
            try {
                Set<WebsocketTopic<WebsocketGatewayData>> currentActiveSubscriptions = getCurrentActiveSubscriptions();
                if (currentActiveSubscriptions.size() > 1) {
                    throw new IllegalStateException("Websocket Gateway current does not support subscribing to multiple topics.");
                }
                WebsocketTopic websocketTopic = (WebsocketTopic) CollectionsKt.firstOrNull(currentActiveSubscriptions);
                if (websocketTopic != null && !(websocketTopic instanceof WebsocketGatewayTopic)) {
                    throw new IllegalStateException(("Invalid topic for WebsocketGatewaySource: " + websocketTopic).toString());
                }
                WebsocketGatewayTopic<WebsocketGatewayData> websocketGatewayTopic = this.subscribedTopic;
                if (websocketGatewayTopic != null && websocketTopic != null && !Intrinsics.areEqual(websocketTopic, websocketGatewayTopic)) {
                    throw new IllegalStateException("Websocket Gateway does not currently support changing topics.");
                }
                this.subscribedTopic = (WebsocketGatewayTopic) websocketTopic;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.onActiveSubscriptionsChanged();
    }

    /* compiled from: WebsocketGatewaySource.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.gateway.WebsocketGatewaySource$setupPing$1", m3645f = "WebsocketGatewaySource.kt", m3646l = {103, 106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.websocket.gateway.WebsocketGatewaySource$setupPing$1 */
    static final class C420541 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C420541(Continuation<? super C420541> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return WebsocketGatewaySource.this.new C420541(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420541) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[PHI: r1 r8
          0x0062: PHI (r1v1 byte[]) = (r1v9 byte[]), (r1v11 byte[]) binds: [B:12:0x005f, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
          0x0062: PHI (r8v2 j$.util.Base64$Encoder) = (r8v3 j$.util.Base64$Encoder), (r8v4 j$.util.Base64$Encoder) binds: [B:12:0x005f, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008a -> B:11:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Base64.Encoder encoder;
            byte[] bArrEncode;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                encoder = Base64.getEncoder();
            } else {
                if (i == 1) {
                    bArrEncode = (byte[]) this.L$1;
                    Base64.Encoder encoder2 = (Base64.Encoder) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    encoder = encoder2;
                    WebsocketGatewaySource websocketGatewaySource = WebsocketGatewaySource.this;
                    JsonAdapter jsonAdapter = websocketGatewaySource.messageAdapter;
                    Intrinsics.checkNotNull(bArrEncode);
                    String json = jsonAdapter.toJson(new WebsocketGatewayMessage.Ping(bArrEncode));
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    websocketGatewaySource.sendMessage(json);
                    this.L$0 = encoder;
                    this.L$1 = null;
                    this.label = 2;
                    if (DelayKt.delay(30000L, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Base64.Encoder encoder3 = (Base64.Encoder) this.L$0;
                ResultKt.throwOnFailure(obj);
                encoder = encoder3;
            }
            String json2 = WebsocketGatewaySource.this.instantAdapter.toJson(Instant.now());
            Intrinsics.checkNotNull(json2);
            byte[] bytes = json2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArrEncode = encoder.encode(bytes);
            WebsocketGatewaySource websocketGatewaySource2 = WebsocketGatewaySource.this;
            this.L$0 = encoder;
            this.L$1 = bArrEncode;
            this.label = 1;
            if (websocketGatewaySource2.scheduleCheckPong(this) != coroutine_suspended) {
                WebsocketGatewaySource websocketGatewaySource3 = WebsocketGatewaySource.this;
                JsonAdapter jsonAdapter2 = websocketGatewaySource3.messageAdapter;
                Intrinsics.checkNotNull(bArrEncode);
                String json3 = jsonAdapter2.toJson(new WebsocketGatewayMessage.Ping(bArrEncode));
                Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
                websocketGatewaySource3.sendMessage(json3);
                this.L$0 = encoder;
                this.L$1 = null;
                this.label = 2;
                if (DelayKt.delay(30000L, this) != coroutine_suspended) {
                    String json22 = WebsocketGatewaySource.this.instantAdapter.toJson(Instant.now());
                    Intrinsics.checkNotNull(json22);
                    byte[] bytes2 = json22.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                    bArrEncode = encoder.encode(bytes2);
                    WebsocketGatewaySource websocketGatewaySource22 = WebsocketGatewaySource.this;
                    this.L$0 = encoder;
                    this.L$1 = bArrEncode;
                    this.label = 1;
                    if (websocketGatewaySource22.scheduleCheckPong(this) != coroutine_suspended) {
                    }
                }
            }
            return coroutine_suspended;
        }
    }

    private final void setupPing() {
        launchWithLifecycle(new C420541(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scheduleCheckPong(Continuation<? super Unit> continuation) {
        C420531 c420531;
        Mutex mutex;
        if (continuation instanceof C420531) {
            c420531 = (C420531) continuation;
            int i = c420531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420531.label = i - Integer.MIN_VALUE;
            } else {
                c420531 = new C420531(continuation);
            }
        }
        Object obj = c420531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.pongMutex;
            c420531.L$0 = mutex2;
            c420531.label = 1;
            if (mutex2.lock(null, c420531) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c420531.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            Job job = this.checkPongJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.checkPongJob = launchWithLifecycle(new WebsocketGatewaySource2(this, null));
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* compiled from: WebsocketGatewaySource.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.websocket.gateway.WebsocketGatewaySource$onPongReceived$1", m3645f = "WebsocketGatewaySource.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.websocket.gateway.WebsocketGatewaySource$onPongReceived$1 */
    static final class C420521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C420521(Continuation<? super C420521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebsocketGatewaySource.this.new C420521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C420521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            WebsocketGatewaySource websocketGatewaySource;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = WebsocketGatewaySource.this.pongMutex;
                WebsocketGatewaySource websocketGatewaySource2 = WebsocketGatewaySource.this;
                this.L$0 = mutex;
                this.L$1 = websocketGatewaySource2;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                websocketGatewaySource = websocketGatewaySource2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                websocketGatewaySource = (WebsocketGatewaySource) this.L$1;
                mutex = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                Job job = websocketGatewaySource.checkPongJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    private final void onPongReceived() {
        BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new C420521(null), 3, null);
    }
}
