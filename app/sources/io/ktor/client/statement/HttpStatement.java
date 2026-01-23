package io.ktor.client.statement;

import com.plaid.internal.EnumC7081g;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCall;
import io.ktor.client.engine.HttpClientEngineCapability2;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPlugin2;
import io.ktor.client.request.HttpRequest2;
import io.ktor.client.utils.ExceptionUtilsJvm;
import io.ktor.utils.p478io.ByteReadChannel2;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* compiled from: HttpStatement.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJL\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b21\u0010\u0012\u001a-\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0013\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\rH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b*\u00020\rH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b \u0010\n\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m3636d2 = {"Lio/ktor/client/statement/HttpStatement;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V", "", "checkCapabilities", "()V", "T", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "block", "execute", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeUnsafe", "cleanup", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "getClient$annotations", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class HttpStatement {
    private final HttpRequest2 builder;
    private final HttpClient client;

    /* compiled from: HttpStatement.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.statement.HttpStatement", m3645f = "HttpStatement.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "cleanup")
    /* renamed from: io.ktor.client.statement.HttpStatement$cleanup$1 */
    static final class C455881 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C455881(Continuation<? super C455881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.cleanup(null, this);
        }
    }

    /* compiled from: HttpStatement.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.statement.HttpStatement", m3645f = "HttpStatement.kt", m3646l = {47, 50, 52, 52}, m3647m = "execute")
    /* renamed from: io.ktor.client.statement.HttpStatement$execute$1 */
    static final class C455891<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C455891(Continuation<? super C455891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.execute(null, this);
        }
    }

    /* compiled from: HttpStatement.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.statement.HttpStatement", m3645f = "HttpStatement.kt", m3646l = {108}, m3647m = "executeUnsafe")
    /* renamed from: io.ktor.client.statement.HttpStatement$executeUnsafe$1 */
    static final class C455911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C455911(Continuation<? super C455911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.executeUnsafe(this);
        }
    }

    public HttpStatement(HttpRequest2 builder, HttpClient client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.builder = builder;
        this.client = client;
        checkCapabilities();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|53|(1:(1:(1:(1:(2:14|15)(3:16|17|50))(3:21|22|23))(5:24|54|25|42|(2:44|49)(1:45)))(2:29|30))(3:32|33|(2:35|49)(1:36))|37|56|38|(3:41|42|(0)(0))|49|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r2.cleanup(r11, r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object execute(Function2<? super HttpResponse, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        C455891 c455891;
        HttpStatement httpStatement;
        HttpResponse httpResponse;
        HttpResponse httpResponse2;
        if (continuation instanceof C455891) {
            c455891 = (C455891) continuation;
            int i = c455891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455891.label = i - Integer.MIN_VALUE;
            } else {
                c455891 = new C455891(continuation);
            }
        }
        Object objExecuteUnsafe = c455891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455891.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objExecuteUnsafe);
                c455891.L$0 = this;
                c455891.L$1 = function2;
                c455891.label = 1;
                objExecuteUnsafe = executeUnsafe(c455891);
                if (objExecuteUnsafe != coroutine_suspended) {
                    httpStatement = this;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            Object obj = c455891.L$0;
                            ResultKt.throwOnFailure(objExecuteUnsafe);
                            return obj;
                        }
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) c455891.L$0;
                        ResultKt.throwOnFailure(objExecuteUnsafe);
                        throw th;
                    }
                    httpResponse2 = (HttpResponse) c455891.L$1;
                    httpStatement = (HttpStatement) c455891.L$0;
                    try {
                        ResultKt.throwOnFailure(objExecuteUnsafe);
                        c455891.L$0 = objExecuteUnsafe;
                        c455891.L$1 = null;
                        c455891.label = 3;
                    } catch (Throwable th) {
                        httpResponse = httpResponse2;
                        th = th;
                        c455891.L$0 = th;
                        c455891.L$1 = null;
                        c455891.label = 4;
                    }
                    return httpStatement.cleanup(httpResponse2, c455891) != coroutine_suspended ? coroutine_suspended : objExecuteUnsafe;
                }
                function2 = (Function2) c455891.L$1;
                httpStatement = (HttpStatement) c455891.L$0;
                ResultKt.throwOnFailure(objExecuteUnsafe);
            }
            httpResponse = (HttpResponse) objExecuteUnsafe;
            c455891.L$0 = httpStatement;
            c455891.L$1 = httpResponse;
            c455891.label = 2;
            Object objInvoke = function2.invoke(httpResponse, c455891);
            if (objInvoke != coroutine_suspended) {
                objExecuteUnsafe = objInvoke;
                httpResponse2 = httpResponse;
                c455891.L$0 = objExecuteUnsafe;
                c455891.L$1 = null;
                c455891.label = 3;
                if (httpStatement.cleanup(httpResponse2, c455891) != coroutine_suspended) {
                }
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvm.unwrapCancellationException(e);
        }
    }

    /* compiled from: HttpStatement.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lio/ktor/client/statement/HttpResponse;", "it"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.statement.HttpStatement$execute$4", m3645f = "HttpStatement.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: io.ktor.client.statement.HttpStatement$execute$4 */
    static final class C455904 extends ContinuationImpl7 implements Function2<HttpResponse, Continuation<? super HttpResponse>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C455904(Continuation<? super C455904> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C455904 c455904 = new C455904(continuation);
            c455904.L$0 = obj;
            return c455904;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HttpResponse httpResponse, Continuation<? super HttpResponse> continuation) {
            return ((C455904) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpClientCall call = ((HttpResponse) this.L$0).getCall();
                this.label = 1;
                obj = SavedCall.save(call, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((HttpClientCall) obj).getResponse();
        }
    }

    public final Object execute(Continuation<? super HttpResponse> continuation) {
        return execute(new C455904(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeUnsafe(Continuation<? super HttpResponse> continuation) throws Throwable {
        C455911 c455911;
        if (continuation instanceof C455911) {
            c455911 = (C455911) continuation;
            int i = c455911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455911.label = i - Integer.MIN_VALUE;
            } else {
                c455911 = new C455911(continuation);
            }
        }
        Object objExecute$ktor_client_core = c455911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455911.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objExecute$ktor_client_core);
                HttpRequest2 httpRequest2TakeFromWithExecutionContext = new HttpRequest2().takeFromWithExecutionContext(this.builder);
                HttpClient httpClient = this.client;
                c455911.label = 1;
                objExecute$ktor_client_core = httpClient.execute$ktor_client_core(httpRequest2TakeFromWithExecutionContext, c455911);
                if (objExecute$ktor_client_core == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objExecute$ktor_client_core);
            }
            return ((HttpClientCall) objExecute$ktor_client_core).getResponse();
        } catch (CancellationException e) {
            throw ExceptionUtilsJvm.unwrapCancellationException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        C455881 c455881;
        if (continuation instanceof C455881) {
            c455881 = (C455881) continuation;
            int i = c455881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455881.label = i - Integer.MIN_VALUE;
            } else {
                c455881 = new C455881(continuation);
            }
        }
        Object obj = c455881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext.Element element = httpResponse.getCoroutineContext().get(Job.INSTANCE);
            Intrinsics.checkNotNull(element);
            CompletableJob completableJob = (CompletableJob) element;
            completableJob.complete();
            try {
                ByteReadChannel2.cancel(httpResponse.getContent());
            } catch (Throwable unused) {
            }
            c455881.L$0 = completableJob;
            c455881.label = 1;
            if (completableJob.join(c455881) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final void checkCapabilities() {
        Set setKeySet;
        Map map = (Map) this.builder.getAttributes().getOrNull(HttpClientEngineCapability2.getENGINE_CAPABILITIES_KEY());
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<HttpClientPlugin> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof HttpClientPlugin) {
                arrayList.add(obj);
            }
        }
        for (HttpClientPlugin httpClientPlugin : arrayList) {
            if (HttpClientPlugin2.pluginOrNull(this.client, httpClientPlugin) == null) {
                throw new IllegalArgumentException(("Consider installing " + httpClientPlugin + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    public String toString() {
        return "HttpStatement[" + this.builder.getUrl() + ']';
    }
}
