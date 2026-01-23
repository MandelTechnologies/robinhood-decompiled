package com.salesforce.android.smi.remote.internal.api.sse;

import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.internal.api.sse.ServerSentEvent;
import com.salesforce.android.smi.remote.internal.api.AbstractHttpService;
import com.salesforce.android.smi.remote.internal.api.FibonacciBackoff;
import com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService;
import com.salesforce.android.smi.remote.internal.api.rest.interceptors.RetryInterceptor;
import com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService;
import com.salesforce.android.smi.remote.internal.dto.response.ConversationEntryEventResponse;
import com.squareup.moshi.JsonAdapter;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.EventSources;

/* compiled from: ServerSentEventsService.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 J2\u00020\u0001:\u0001JB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\"\b\u0002\u0010\u0013\u001a\u001c\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJY\u0010#\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u000426\u0010\"\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00150\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J3\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0004\b.\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R8\u0010=\u001a&\u0012\f\u0012\n <*\u0004\u0018\u00010;0; <*\u0012\u0012\f\u0012\n <*\u0004\u0018\u00010;0;\u0018\u00010:0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R8\u0010?\u001a&\u0012\f\u0012\n <*\u0004\u0018\u00010)0) <*\u0012\u0012\f\u0012\n <*\u0004\u0018\u00010)0)\u0018\u00010:0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u001c\u0010A\u001a\n <*\u0004\u0018\u00010@0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010D\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010I\u001a\u0004\bF\u0010G¨\u0006K"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/sse/ServerSentEventsService;", "Lcom/salesforce/android/smi/remote/internal/api/AbstractHttpService;", "Ljava/net/URL;", "baseUrl", "", "orgId", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "authorizationService", "", "retryCeiling", "<init>", "(Ljava/net/URL;Ljava/lang/String;Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;I)V", "lastEventId", "Lokhttp3/Request;", "createRequest", "(Ljava/lang/String;)Lokhttp3/Request;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "readLastEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "createEventSource", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "", "throwable", "", "logSendFailure", "(Ljava/lang/Throwable;)V", "id", WebsocketGatewayConstants.DATA_KEY, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "eventProcessor", "processEvent", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "message", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Error;", "createErrorEvent", "(Ljava/lang/String;)Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Error;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "createUnknownEntryPayload", "(Ljava/lang/String;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/EntryPayload;", "processConversationEntryEvent", "(Ljava/lang/String;Ljava/lang/String;)Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "startStream", "Ljava/net/URL;", "Ljava/lang/String;", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "retryInterceptor", "Lcom/salesforce/android/smi/remote/internal/api/rest/interceptors/RetryInterceptor;", "Lokhttp3/OkHttpClient;", "httpClient", "Lokhttp3/OkHttpClient;", "Lokhttp3/sse/EventSource$Factory;", "eventSourcesFactory", "Lokhttp3/sse/EventSource$Factory;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/salesforce/android/smi/remote/internal/dto/response/ConversationEntryEventResponse;", "kotlin.jvm.PlatformType", "networkConversationEntryEventAdapter", "Lcom/squareup/moshi/JsonAdapter;", "networkConversationEntryPayloadAdapter", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "Lcom/salesforce/android/smi/remote/internal/api/FibonacciBackoff;", "fibonacciBackoff", "Lcom/salesforce/android/smi/remote/internal/api/FibonacciBackoff;", "getFibonacciBackoff", "()Lcom/salesforce/android/smi/remote/internal/api/FibonacciBackoff;", "getFibonacciBackoff$annotations", "()V", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ServerSentEventsService extends AbstractHttpService {
    private static final String TAG;
    private final URL baseUrl;
    private final EventSource.Factory eventSourcesFactory;
    private final FibonacciBackoff fibonacciBackoff;
    private final OkHttpClient httpClient;
    private final Logger logger;
    private final JsonAdapter<ConversationEntryEventResponse> networkConversationEntryEventAdapter;
    private final JsonAdapter<EntryPayload> networkConversationEntryPayloadAdapter;
    private final String orgId;
    private final RetryInterceptor retryInterceptor;

    public /* synthetic */ ServerSentEventsService(URL url, String str, AuthorizationService authorizationService, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, str, authorizationService, (i2 & 8) != 0 ? 5 : i);
    }

    public ServerSentEventsService(URL baseUrl, String orgId, AuthorizationService authorizationService, int i) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(orgId, "orgId");
        Intrinsics.checkNotNullParameter(authorizationService, "authorizationService");
        this.baseUrl = baseUrl;
        this.orgId = orgId;
        RetryInterceptor retryInterceptorCreate = RetryInterceptor.INSTANCE.create(-1, i);
        this.retryInterceptor = retryInterceptorCreate;
        OkHttpClient.Builder builderAddInterceptor = getOkHttpClientBuilder().addInterceptor(authorizationService.getAuthorizationInterceptor()).addInterceptor(retryInterceptorCreate);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderAddInterceptor.connectTimeout(0L, timeUnit).readTimeout(30L, timeUnit).retryOnConnectionFailure(false).followRedirects(true).build();
        this.httpClient = okHttpClientBuild;
        this.eventSourcesFactory = EventSources.createFactory(okHttpClientBuild);
        this.networkConversationEntryEventAdapter = getMoshi().adapter(ConversationEntryEventResponse.class);
        this.networkConversationEntryPayloadAdapter = getMoshi().adapter(EntryPayload.class);
        this.logger = Logger.getLogger(TAG);
        this.fibonacciBackoff = new FibonacciBackoff(-1, i);
    }

    public final FibonacciBackoff getFibonacciBackoff() {
        return this.fibonacciBackoff;
    }

    /* compiled from: ServerSentEventsService.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "cause", "", "<unused var>", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$startStream$1", m3645f = "ServerSentEventsService.kt", m3646l = {61, 65}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$startStream$1 */
    static final class C423501 extends ContinuationImpl7 implements Function4<FlowCollector<? super ServerSentEvent>, Throwable, Long, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C423501(Continuation<? super C423501> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super ServerSentEvent> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
            return invoke(flowCollector, th, l.longValue(), continuation);
        }

        public final Object invoke(FlowCollector<? super ServerSentEvent> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
            C423501 c423501 = ServerSentEventsService.this.new C423501(continuation);
            c423501.L$0 = flowCollector;
            c423501.L$1 = th;
            return c423501.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r4, r9) == r0) goto L18;
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
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown failure";
                }
                ServerSentEvent.Error error = new ServerSentEvent.Error(message, th);
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(error, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(true);
            }
            ResultKt.throwOnFailure(obj);
            int iIncrement = ServerSentEventsService.this.getFibonacciBackoff().increment();
            long jCurrentBackoff = ServerSentEventsService.this.getFibonacciBackoff().currentBackoff();
            ServerSentEventsService.this.logger.log(Level.INFO, "Retrying sse connection [" + iIncrement + "] after [" + jCurrentBackoff + "]ms");
            this.label = 2;
        }
    }

    public final Flow<ServerSentEvent> startStream(Function1<? super Continuation<? super String>, ? extends Object> readLastEvent) {
        Intrinsics.checkNotNullParameter(readLastEvent, "readLastEvent");
        return FlowKt.cancellable(FlowKt.retryWhen(Context7.buffer$default(createEventSource(readLastEvent), Integer.MAX_VALUE, null, 2, null), new C423501(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Request createRequest(String lastEventId) throws Exception {
        HttpUrl.Builder builderNewBuilder;
        HttpUrl.Builder builderAddPathSegments;
        HttpUrl httpUrlBuild;
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(this.baseUrl);
        if (httpUrl == null || (builderNewBuilder = httpUrl.newBuilder()) == null || (builderAddPathSegments = builderNewBuilder.addPathSegments("eventrouter/v1/sse")) == null || (httpUrlBuild = builderAddPathSegments.build()) == null) {
            throw new Exception("Invalid SSE URL: " + this.baseUrl);
        }
        Request.Builder builderHeader = new Request.Builder().url(httpUrlBuild).header("X-Org-ID", this.orgId).header("Accept-Encoding", "").header("Accept", "text/event-stream").header("Cache-Control", "no-cache");
        if (lastEventId == null) {
            lastEventId = "0";
        }
        return builderHeader.header("Last-Event-Id", lastEventId).build();
    }

    /* compiled from: ServerSentEventsService.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$createEventSource$1", m3645f = "ServerSentEventsService.kt", m3646l = {86, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$createEventSource$1 */
    static final class C423471 extends ContinuationImpl7 implements Function2<Produce4<? super ServerSentEvent>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super String>, Object> $readLastEvent;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ServerSentEventsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C423471(Function1<? super Continuation<? super String>, ? extends Object> function1, ServerSentEventsService serverSentEventsService, Continuation<? super C423471> continuation) {
            super(2, continuation);
            this.$readLastEvent = function1;
            this.this$0 = serverSentEventsService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C423471 c423471 = new C423471(this.$readLastEvent, this.this$0, continuation);
            c423471.L$0 = obj;
            return c423471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super ServerSentEvent> produce4, Continuation<? super Unit> continuation) {
            return ((C423471) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r9 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (kotlinx.coroutines.channels.Produce.awaitClose(r1, r5, r8) != r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            final Produce4 produce4;
            final String str;
            Object objMo8337trySendJP2dKIU;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                Function1<Continuation<? super String>, Object> function1 = this.$readLastEvent;
                if (function1 != null) {
                    this.L$0 = produce4;
                    this.label = 1;
                    obj = function1.invoke(this);
                } else {
                    str = null;
                    Request requestCreateRequest = this.this$0.createRequest(str);
                    final ServerSentEventsService serverSentEventsService = this.this$0;
                    EventSourceListener eventSourceListener = new EventSourceListener() { // from class: com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$createEventSource$1$eventSourceListener$1
                        @Override // okhttp3.sse.EventSourceListener
                        public void onOpen(EventSource eventSource, Response response) {
                            Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                            Intrinsics.checkNotNullParameter(response, "response");
                            serverSentEventsService.logger.log(Level.INFO, "Event source opened with id: " + str);
                            serverSentEventsService.getFibonacciBackoff().reset();
                            Object objMo8337trySendJP2dKIU2 = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Open.INSTANCE);
                            ServerSentEventsService serverSentEventsService2 = serverSentEventsService;
                            if (objMo8337trySendJP2dKIU2 instanceof Channel5.Failed) {
                                serverSentEventsService2.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU2));
                            }
                        }

                        @Override // okhttp3.sse.EventSourceListener
                        public void onEvent(EventSource eventSource, String id, String type2, String data) {
                            Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                            Intrinsics.checkNotNullParameter(data, "data");
                            Logger logger = serverSentEventsService.logger;
                            Level level = Level.INFO;
                            logger.log(level, "SSE Event Received: " + (type2 == null ? "Unknown" : type2) + " | id: " + id);
                            Logger logger2 = serverSentEventsService.logger;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SSE Event Data: ");
                            sb.append(data);
                            logger2.log(level, sb.toString());
                            if (!Intrinsics.areEqual(type2, ServerSentEventType.Ping.getType())) {
                                if (!Intrinsics.areEqual(type2, ServerSentEventType.ConversationMessage.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ChoicesResponseMessage.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationParticipantChanged.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationTypingIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationTypingStartedIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationTypingStoppedIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationProgressIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationStreamingToken.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationDeliveryAcknowledgement.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationReadAcknowledgement.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationRoutingWorkResult.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationRoutingResult.getType())) {
                                    Logger logger3 = serverSentEventsService.logger;
                                    Level level2 = Level.WARNING;
                                    if (type2 == null) {
                                        type2 = "Unknown";
                                    }
                                    logger3.log(level2, "Unsupported event received " + type2);
                                    Unit unit = Unit.INSTANCE;
                                    return;
                                }
                                Object objMo8337trySendJP2dKIU2 = produce4.mo8337trySendJP2dKIU(serverSentEventsService.processEvent(id, data, new ServerSentEventsService3(serverSentEventsService)));
                                ServerSentEventsService serverSentEventsService2 = serverSentEventsService;
                                if (objMo8337trySendJP2dKIU2 instanceof Channel5.Failed) {
                                    serverSentEventsService2.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU2));
                                }
                                Channel5.m28802boximpl(objMo8337trySendJP2dKIU2);
                                return;
                            }
                            Object objMo8337trySendJP2dKIU3 = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Ping.INSTANCE);
                            ServerSentEventsService serverSentEventsService3 = serverSentEventsService;
                            if (objMo8337trySendJP2dKIU3 instanceof Channel5.Failed) {
                                serverSentEventsService3.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU3));
                            }
                            Channel5.m28802boximpl(objMo8337trySendJP2dKIU3);
                        }

                        @Override // okhttp3.sse.EventSourceListener
                        public void onClosed(EventSource eventSource) {
                            Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                            serverSentEventsService.logger.log(Level.INFO, "Event source closed");
                            Object objMo8337trySendJP2dKIU2 = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Closed.INSTANCE);
                            ServerSentEventsService serverSentEventsService2 = serverSentEventsService;
                            if (objMo8337trySendJP2dKIU2 instanceof Channel5.Failed) {
                                serverSentEventsService2.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU2));
                            }
                            CoroutineScope2.cancel$default(produce4, "Server closed the connection", null, 2, null);
                        }

                        @Override // okhttp3.sse.EventSourceListener
                        public void onFailure(EventSource eventSource, Throwable t, Response response) {
                            String strValueOf;
                            Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                            if (t == null || (strValueOf = t.getMessage()) == null) {
                                strValueOf = response != null ? Integer.valueOf(response.getCode()) : "Unknown";
                            }
                            String str2 = "Event source failure: " + strValueOf;
                            serverSentEventsService.logger.log(Level.WARNING, str2);
                            CoroutineScope2.cancel(produce4, str2, t);
                        }
                    };
                    this.this$0.logger.log(Level.INFO, "Event source connecting");
                    objMo8337trySendJP2dKIU = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Connecting.INSTANCE);
                    ServerSentEventsService serverSentEventsService2 = this.this$0;
                    if (objMo8337trySendJP2dKIU instanceof Channel5.Failed) {
                        serverSentEventsService2.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU));
                    }
                    final EventSource eventSourceNewEventSource = this.this$0.eventSourcesFactory.newEventSource(requestCreateRequest, eventSourceListener);
                    final ServerSentEventsService serverSentEventsService3 = this.this$0;
                    Function0 function0 = new Function0() { // from class: com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$createEventSource$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ServerSentEventsService.C423471.invokeSuspend$lambda$0(serverSentEventsService3, eventSourceNewEventSource);
                        }
                    };
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
                produce4 = (Produce4) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            str = (String) obj;
            Request requestCreateRequest2 = this.this$0.createRequest(str);
            final ServerSentEventsService serverSentEventsService4 = this.this$0;
            EventSourceListener eventSourceListener2 = new EventSourceListener() { // from class: com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$createEventSource$1$eventSourceListener$1
                @Override // okhttp3.sse.EventSourceListener
                public void onOpen(EventSource eventSource, Response response) {
                    Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                    Intrinsics.checkNotNullParameter(response, "response");
                    serverSentEventsService4.logger.log(Level.INFO, "Event source opened with id: " + str);
                    serverSentEventsService4.getFibonacciBackoff().reset();
                    Object objMo8337trySendJP2dKIU2 = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Open.INSTANCE);
                    ServerSentEventsService serverSentEventsService22 = serverSentEventsService4;
                    if (objMo8337trySendJP2dKIU2 instanceof Channel5.Failed) {
                        serverSentEventsService22.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU2));
                    }
                }

                @Override // okhttp3.sse.EventSourceListener
                public void onEvent(EventSource eventSource, String id, String type2, String data) {
                    Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                    Intrinsics.checkNotNullParameter(data, "data");
                    Logger logger = serverSentEventsService4.logger;
                    Level level = Level.INFO;
                    logger.log(level, "SSE Event Received: " + (type2 == null ? "Unknown" : type2) + " | id: " + id);
                    Logger logger2 = serverSentEventsService4.logger;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SSE Event Data: ");
                    sb.append(data);
                    logger2.log(level, sb.toString());
                    if (!Intrinsics.areEqual(type2, ServerSentEventType.Ping.getType())) {
                        if (!Intrinsics.areEqual(type2, ServerSentEventType.ConversationMessage.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ChoicesResponseMessage.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationParticipantChanged.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationTypingIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationTypingStartedIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationTypingStoppedIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationProgressIndicator.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationStreamingToken.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationDeliveryAcknowledgement.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationReadAcknowledgement.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationRoutingWorkResult.getType()) && !Intrinsics.areEqual(type2, ServerSentEventType.ConversationRoutingResult.getType())) {
                            Logger logger3 = serverSentEventsService4.logger;
                            Level level2 = Level.WARNING;
                            if (type2 == null) {
                                type2 = "Unknown";
                            }
                            logger3.log(level2, "Unsupported event received " + type2);
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        Object objMo8337trySendJP2dKIU2 = produce4.mo8337trySendJP2dKIU(serverSentEventsService4.processEvent(id, data, new ServerSentEventsService3(serverSentEventsService4)));
                        ServerSentEventsService serverSentEventsService22 = serverSentEventsService4;
                        if (objMo8337trySendJP2dKIU2 instanceof Channel5.Failed) {
                            serverSentEventsService22.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU2));
                        }
                        Channel5.m28802boximpl(objMo8337trySendJP2dKIU2);
                        return;
                    }
                    Object objMo8337trySendJP2dKIU3 = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Ping.INSTANCE);
                    ServerSentEventsService serverSentEventsService32 = serverSentEventsService4;
                    if (objMo8337trySendJP2dKIU3 instanceof Channel5.Failed) {
                        serverSentEventsService32.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU3));
                    }
                    Channel5.m28802boximpl(objMo8337trySendJP2dKIU3);
                }

                @Override // okhttp3.sse.EventSourceListener
                public void onClosed(EventSource eventSource) {
                    Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                    serverSentEventsService4.logger.log(Level.INFO, "Event source closed");
                    Object objMo8337trySendJP2dKIU2 = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Closed.INSTANCE);
                    ServerSentEventsService serverSentEventsService22 = serverSentEventsService4;
                    if (objMo8337trySendJP2dKIU2 instanceof Channel5.Failed) {
                        serverSentEventsService22.logSendFailure(Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU2));
                    }
                    CoroutineScope2.cancel$default(produce4, "Server closed the connection", null, 2, null);
                }

                @Override // okhttp3.sse.EventSourceListener
                public void onFailure(EventSource eventSource, Throwable t, Response response) {
                    String strValueOf;
                    Intrinsics.checkNotNullParameter(eventSource, "eventSource");
                    if (t == null || (strValueOf = t.getMessage()) == null) {
                        strValueOf = response != null ? Integer.valueOf(response.getCode()) : "Unknown";
                    }
                    String str2 = "Event source failure: " + strValueOf;
                    serverSentEventsService4.logger.log(Level.WARNING, str2);
                    CoroutineScope2.cancel(produce4, str2, t);
                }
            };
            this.this$0.logger.log(Level.INFO, "Event source connecting");
            objMo8337trySendJP2dKIU = produce4.mo8337trySendJP2dKIU(ServerSentEvent.Connection.Connecting.INSTANCE);
            ServerSentEventsService serverSentEventsService22 = this.this$0;
            if (objMo8337trySendJP2dKIU instanceof Channel5.Failed) {
            }
            final EventSource eventSourceNewEventSource2 = this.this$0.eventSourcesFactory.newEventSource(requestCreateRequest2, eventSourceListener2);
            final ServerSentEventsService serverSentEventsService32 = this.this$0;
            Function0 function02 = new Function0() { // from class: com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService$createEventSource$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ServerSentEventsService.C423471.invokeSuspend$lambda$0(serverSentEventsService32, eventSourceNewEventSource2);
                }
            };
            this.L$0 = null;
            this.label = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ServerSentEventsService serverSentEventsService, EventSource eventSource) {
            serverSentEventsService.logger.log(Level.INFO, "Cancelling event source");
            eventSource.cancel();
            return Unit.INSTANCE;
        }
    }

    private final Flow<ServerSentEvent> createEventSource(Function1<? super Continuation<? super String>, ? extends Object> readLastEvent) {
        return FlowKt.callbackFlow(new C423471(readLastEvent, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logSendFailure(Throwable throwable) {
        this.logger.log(Level.WARNING, "trySend failure: " + (throwable != null ? throwable.getMessage() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ServerSentEvent processEvent(String id, String data, Function2<? super String, ? super String, ? extends ServerSentEvent> eventProcessor) {
        if (id == null) {
            return createErrorEvent("Received null conversation entry event id");
        }
        return eventProcessor.invoke(id, data);
    }

    private final ServerSentEvent.Error createErrorEvent(String message) {
        ServerSentEvent.Error error = new ServerSentEvent.Error(message, null, 2, null);
        this.logger.log(Level.WARNING, error.getMessage());
        return error;
    }

    private final EntryPayload createUnknownEntryPayload(String id) {
        this.logger.log(Level.INFO, "Unknown conversation entry type, emitting an unknown event");
        return new EntryPayload.UnknownEntryPayload(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ServerSentEvent processConversationEntryEvent(String id, String data) {
        try {
            ConversationEntryEventResponse conversationEntryEventResponseFromJson = this.networkConversationEntryEventAdapter.fromJson(data);
            if (conversationEntryEventResponseFromJson != null) {
                try {
                    EntryPayload entryPayloadFromJson = this.networkConversationEntryPayloadAdapter.fromJson(conversationEntryEventResponseFromJson.getConversationEntry().getPayload());
                    if (entryPayloadFromJson == null) {
                        entryPayloadFromJson = createUnknownEntryPayload(conversationEntryEventResponseFromJson.getConversationEntry().getIdentifier());
                    }
                    return new ServerSentEvent.ConversationEntryEvent(id, conversationEntryEventResponseFromJson.getConversationEntry().toCoreConversationEntry$remote_release(conversationEntryEventResponseFromJson.getConversationId(), entryPayloadFromJson));
                } catch (Exception unused) {
                    return new ServerSentEvent.ConversationEntryEvent(id, CoreConversationEntry.copy$default(conversationEntryEventResponseFromJson.getConversationEntry().toCoreConversationEntry$remote_release(conversationEntryEventResponseFromJson.getConversationId(), createUnknownEntryPayload(conversationEntryEventResponseFromJson.getConversationEntry().getIdentifier())), null, null, null, null, ConversationEntryType.UnknownEntry, null, null, 0L, null, null, ErrorCodes.IO_EXCEPTION, null));
                }
            }
            return createErrorEvent("Invalid conversation entry event: failed to deserialize data");
        } catch (Exception unused2) {
            return createErrorEvent("Invalid conversation entry payload: failed to deserialize payload");
        }
    }

    static {
        String name = ServerSentEventsService.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
    }
}
