package io.ktor.client.engine;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest2;
import io.ktor.client.request.HttpRequest6;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpRequestPipeline2;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ClientEvents;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.OutgoingContent2;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfoJvm;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVM5;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: HttpClientEngine.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000b\u0010\u001d\u001a\u00020\u001c8BX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m3636d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/HttpRequestData;", WebsocketGatewayConstants.DATA_KEY, "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "", "install", "(Lio/ktor/client/HttpClient;)V", "requestData", "checkExtensions", "(Lio/ktor/client/request/HttpRequestData;)V", "executeWithinCallContext", "(Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpResponseData;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "config", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "supportedCapabilities", "", "closed", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface HttpClientEngine extends CoroutineScope, Closeable {
    Object execute(HttpRequestData httpRequest4, Continuation<? super HttpRequest6> continuation);

    HttpClientEngineConfig getConfig();

    Set<HttpClientEngineCapability<?>> getSupportedCapabilities();

    void install(HttpClient client);

    /* compiled from: HttpClientEngine.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Set<HttpClientEngineCapability<?>> getSupportedCapabilities(HttpClientEngine httpClientEngine) {
            return SetsKt.emptySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean getClosed(HttpClientEngine httpClientEngine) {
            return !(((Job) httpClientEngine.getCoroutineContext().get(Job.INSTANCE)) != null ? r1.isActive() : false);
        }

        public static void install(HttpClientEngine httpClientEngine, HttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            client.getSendPipeline().intercept(HttpRequestPipeline2.INSTANCE.getEngine(), new C455621(client, httpClientEngine, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object executeWithinCallContext(HttpClientEngine httpClientEngine, HttpRequestData httpRequest4, Continuation<? super HttpRequest6> continuation) {
            HttpClientEngine2 httpClientEngine2;
            if (continuation instanceof HttpClientEngine2) {
                httpClientEngine2 = (HttpClientEngine2) continuation;
                int i = httpClientEngine2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    httpClientEngine2.label = i - Integer.MIN_VALUE;
                } else {
                    httpClientEngine2 = new HttpClientEngine2(continuation);
                }
            }
            Object objCreateCallContext = httpClientEngine2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = httpClientEngine2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateCallContext);
                Job executionContext = httpRequest4.getExecutionContext();
                httpClientEngine2.L$0 = httpClientEngine;
                httpClientEngine2.L$1 = httpRequest4;
                httpClientEngine2.label = 1;
                objCreateCallContext = HttpClientEngine5.createCallContext(httpClientEngine, executionContext, httpClientEngine2);
                if (objCreateCallContext != coroutine_suspended) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateCallContext);
                return objCreateCallContext;
            }
            httpRequest4 = (HttpRequestData) httpClientEngine2.L$1;
            httpClientEngine = (HttpClientEngine) httpClientEngine2.L$0;
            ResultKt.throwOnFailure(objCreateCallContext);
            HttpClientEngine httpClientEngine3 = httpClientEngine;
            CoroutineContext coroutineContext = (CoroutineContext) objCreateCallContext;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(httpClientEngine3, coroutineContext.plus(new KtorCallContextElement(coroutineContext)), null, new HttpClientEngine3(httpClientEngine3, httpRequest4, null), 2, null);
            httpClientEngine2.L$0 = null;
            httpClientEngine2.L$1 = null;
            httpClientEngine2.label = 2;
            Object objAwait = deferredAsync$default.await(httpClientEngine2);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void checkExtensions(HttpClientEngine httpClientEngine, HttpRequestData httpRequest4) {
            for (HttpClientEngineCapability<?> httpClientEngineCapability : httpRequest4.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }
    }

    /* compiled from: HttpClientEngine.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.engine.HttpClientEngine$install$1", m3645f = "HttpClientEngine.kt", m3646l = {70, 82}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: io.ktor.client.engine.HttpClientEngine$install$1 */
    static final class C455621 extends ContinuationImpl7 implements Function3<PipelineContext<Object, HttpRequest2>, Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ HttpClient $client;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ HttpClientEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C455621(HttpClient httpClient, HttpClientEngine httpClientEngine, Continuation<? super C455621> continuation) {
            super(3, continuation);
            this.$client = httpClient;
            this.this$0 = httpClientEngine;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PipelineContext<Object, HttpRequest2> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
            C455621 c455621 = new C455621(this.$client, this.this$0, continuation);
            c455621.L$0 = pipelineContext;
            c455621.L$1 = obj;
            return c455621.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00f0, code lost:
        
            if (r3.proceedWith(r5, r9) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            HttpRequestData httpRequest4Build;
            PipelineContext pipelineContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                Object obj2 = this.L$1;
                HttpRequest2 httpRequest2 = new HttpRequest2();
                httpRequest2.takeFromWithExecutionContext((HttpRequest2) pipelineContext2.getContext());
                if (obj2 == null) {
                    httpRequest2.setBody(OutgoingContent2.INSTANCE);
                    KType kTypeTypeOf = Reflection.typeOf(Object.class);
                    httpRequest2.setBodyType(TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(Object.class), kTypeTypeOf));
                } else if (obj2 instanceof OutgoingContent) {
                    httpRequest2.setBody(obj2);
                    httpRequest2.setBodyType(null);
                } else {
                    httpRequest2.setBody(obj2);
                    KType kTypeTypeOf2 = Reflection.typeOf(Object.class);
                    httpRequest2.setBodyType(TypeInfoJvm.typeInfoImpl(TypesJVM5.getJavaType(kTypeTypeOf2), Reflection.getOrCreateKotlinClass(Object.class), kTypeTypeOf2));
                }
                this.$client.getMonitor().raise(ClientEvents.getHttpRequestIsReadyForSending(), httpRequest2);
                httpRequest4Build = httpRequest2.build();
                httpRequest4Build.getAttributes().put(HttpClientEngine5.getCLIENT_CONFIG(), this.$client.getConfig$ktor_client_core());
                HttpClientEngine5.validateHeaders(httpRequest4Build);
                DefaultImpls.checkExtensions(this.this$0, httpRequest4Build);
                HttpClientEngine httpClientEngine = this.this$0;
                this.L$0 = pipelineContext2;
                this.L$1 = httpRequest4Build;
                this.label = 1;
                Object objExecuteWithinCallContext = DefaultImpls.executeWithinCallContext(httpClientEngine, httpRequest4Build, this);
                if (objExecuteWithinCallContext != coroutine_suspended) {
                    pipelineContext = pipelineContext2;
                    obj = objExecuteWithinCallContext;
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
            httpRequest4Build = (HttpRequestData) this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            ResultKt.throwOnFailure(obj);
            HttpClientCall httpClientCall = new HttpClientCall(this.$client, httpRequest4Build, (HttpRequest6) obj);
            final HttpResponse response = httpClientCall.getResponse();
            this.$client.getMonitor().raise(ClientEvents.getHttpResponseReceived(), response);
            Job job = JobKt.getJob(response.getCoroutineContext());
            final HttpClient httpClient = this.$client;
            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.engine.HttpClientEngine.install.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    if (th != null) {
                        httpClient.getMonitor().raise(ClientEvents.getHttpResponseCancelled(), response);
                    }
                }
            });
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
    }
}
