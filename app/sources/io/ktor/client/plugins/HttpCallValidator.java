package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.Attributes2;
import io.ktor.util.pipeline.Phase;
import io.ktor.util.pipeline.PipelinePhase2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HttpCallValidator.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019BY\b\u0000\u00127\u0010\u0002\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0002\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m3636d2 = {"Lio/ktor/client/plugins/HttpCallValidator;", "", "responseValidators", "", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "", "callExceptionHandlers", "Lio/ktor/client/plugins/HandlerWrapper;", "expectSuccess", "", "(Ljava/util/List;Ljava/util/List;Z)V", "processException", "cause", "", "request", "Lio/ktor/client/request/HttpRequest;", "(Ljava/lang/Throwable;Lio/ktor/client/request/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateResponse", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Config", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class HttpCallValidator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Attributes2<HttpCallValidator> key = new Attributes2<>("HttpResponseValidator");
    private final List<HttpCallValidator3> callExceptionHandlers;
    private final boolean expectSuccess;
    private final List<Function2<HttpResponse, Continuation<? super Unit>, Object>> responseValidators;

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.plugins.HttpCallValidator", m3645f = "HttpCallValidator.kt", m3646l = {58, 59}, m3647m = "processException")
    /* renamed from: io.ktor.client.plugins.HttpCallValidator$processException$1 */
    static final class C455801 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C455801(Continuation<? super C455801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCallValidator.this.processException(null, null, this);
        }
    }

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.plugins.HttpCallValidator", m3645f = "HttpCallValidator.kt", m3646l = {51}, m3647m = "validateResponse")
    /* renamed from: io.ktor.client.plugins.HttpCallValidator$validateResponse$1 */
    static final class C455811 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C455811(Continuation<? super C455811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCallValidator.this.validateResponse(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidator(List<? extends Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object>> responseValidators, List<? extends HttpCallValidator3> callExceptionHandlers, boolean z) {
        Intrinsics.checkNotNullParameter(responseValidators, "responseValidators");
        Intrinsics.checkNotNullParameter(callExceptionHandlers, "callExceptionHandlers");
        this.responseValidators = responseValidators;
        this.callExceptionHandlers = callExceptionHandlers;
        this.expectSuccess = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateResponse(HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        C455811 c455811;
        HttpResponse httpResponse2;
        Iterator it;
        if (continuation instanceof C455811) {
            c455811 = (C455811) continuation;
            int i = c455811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455811.label = i - Integer.MIN_VALUE;
            } else {
                c455811 = new C455811(continuation);
            }
        }
        Object obj = c455811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpCallValidator7.LOGGER.trace("Validating response for request " + httpResponse.getCall().getRequest().getUrl());
            httpResponse2 = httpResponse;
            it = this.responseValidators.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c455811.L$1;
            HttpResponse httpResponse3 = (HttpResponse) c455811.L$0;
            ResultKt.throwOnFailure(obj);
            httpResponse2 = httpResponse3;
        }
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            c455811.L$0 = httpResponse2;
            c455811.L$1 = it;
            c455811.label = 1;
            if (function2.invoke(httpResponse2, c455811) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r2.invoke(r9, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        r2 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processException(Throwable th, HttpRequest httpRequest, Continuation<? super Unit> continuation) {
        C455801 c455801;
        Throwable th2;
        Iterator it;
        HttpRequest httpRequest2;
        if (continuation instanceof C455801) {
            c455801 = (C455801) continuation;
            int i = c455801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455801.label = i - Integer.MIN_VALUE;
            } else {
                c455801 = new C455801(continuation);
            }
        }
        Object obj = c455801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpCallValidator7.LOGGER.trace("Processing exception " + th + " for request " + httpRequest.getUrl());
            th2 = th;
            it = this.callExceptionHandlers.iterator();
            httpRequest2 = httpRequest;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) c455801.L$2;
        HttpRequest httpRequest3 = (HttpRequest) c455801.L$1;
        Throwable th3 = (Throwable) c455801.L$0;
        ResultKt.throwOnFailure(obj);
        httpRequest2 = httpRequest3;
        th2 = th3;
        while (it.hasNext()) {
            HttpCallValidator3 httpCallValidator3 = (HttpCallValidator3) it.next();
            if (httpCallValidator3 instanceof HttpCallValidator2) {
                Function2<Throwable, Continuation<? super Unit>, Object> handler = ((HttpCallValidator2) httpCallValidator3).getHandler();
                c455801.L$0 = th2;
                c455801.L$1 = httpRequest2;
                c455801.L$2 = it;
                c455801.label = 1;
                if (handler.invoke(th2, c455801) != coroutine_suspended) {
                    th3 = th2;
                    httpRequest3 = httpRequest2;
                    httpRequest2 = httpRequest3;
                    th2 = th3;
                }
                return coroutine_suspended;
            }
            if (httpCallValidator3 instanceof HttpCallValidator8) {
                Function3<Throwable, HttpRequest, Continuation<? super Unit>, Object> handler2 = ((HttpCallValidator8) httpCallValidator3).getHandler();
                c455801.L$0 = th2;
                c455801.L$1 = httpRequest2;
                c455801.L$2 = it;
                c455801.label = 2;
            }
            while (it.hasNext()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\f\u001a\u00020\n21\u0010\u000b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rRN\u0010\u000f\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u000e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m3636d2 = {"Lio/ktor/client/plugins/HttpCallValidator$Config;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "", "block", "validateResponse", "(Lkotlin/jvm/functions/Function2;)V", "", "responseValidators", "Ljava/util/List;", "getResponseValidators$ktor_client_core", "()Ljava/util/List;", "Lio/ktor/client/plugins/HandlerWrapper;", "responseExceptionHandlers", "getResponseExceptionHandlers$ktor_client_core", "", "expectSuccess", "Z", "getExpectSuccess", "()Z", "setExpectSuccess", "(Z)V", "getExpectSuccess$annotations", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Config {
        private final List<Function2<HttpResponse, Continuation<? super Unit>, Object>> responseValidators = new ArrayList();
        private final List<HttpCallValidator3> responseExceptionHandlers = new ArrayList();
        private boolean expectSuccess = true;

        public final List<Function2<HttpResponse, Continuation<? super Unit>, Object>> getResponseValidators$ktor_client_core() {
            return this.responseValidators;
        }

        public final List<HttpCallValidator3> getResponseExceptionHandlers$ktor_client_core() {
            return this.responseExceptionHandlers;
        }

        public final boolean getExpectSuccess() {
            return this.expectSuccess;
        }

        public final void setExpectSuccess(boolean z) {
            this.expectSuccess = z;
        }

        public final void validateResponse(Function2<? super HttpResponse, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.responseValidators.add(block);
        }
    }

    /* compiled from: HttpCallValidator.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lio/ktor/client/plugins/HttpCallValidator$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpCallValidator$Config;", "Lio/ktor/client/plugins/HttpCallValidator;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", "scope", "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion implements HttpClientPlugin<Config, HttpCallValidator> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public Attributes2<HttpCallValidator> getKey() {
            return HttpCallValidator.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCallValidator prepare(Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new HttpCallValidator(CollectionsKt.reversed(config.getResponseValidators$ktor_client_core()), CollectionsKt.reversed(config.getResponseExceptionHandlers$ktor_client_core()), config.getExpectSuccess());
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCallValidator plugin, HttpClient scope) throws PipelinePhase2 {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getBefore(), new HttpCallValidator4(plugin, null));
            Phase phase = new Phase("BeforeReceive");
            scope.getResponsePipeline().insertPhaseBefore(HttpResponsePipeline.INSTANCE.getReceive(), phase);
            scope.getResponsePipeline().intercept(phase, new HttpCallValidator5(plugin, null));
            ((HttpSend) HttpClientPlugin2.plugin(scope, HttpSend.INSTANCE)).intercept(new HttpCallValidator6(plugin, null));
        }
    }
}
