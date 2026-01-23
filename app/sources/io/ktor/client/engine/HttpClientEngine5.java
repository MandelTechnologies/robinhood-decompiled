package io.ktor.client.engine;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.request.HttpRequestData;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpHeaders5;
import io.ktor.util.Attributes2;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job4;
import kotlinx.coroutines.JobKt;

/* compiled from: HttpClientEngine.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"$\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m3636d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/Job;", "parentJob", "Lkotlin/coroutines/CoroutineContext;", "createCallContext", "(Lio/ktor/client/engine/HttpClientEngine;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestData;", "request", "", "validateHeaders", "(Lio/ktor/client/request/HttpRequestData;)V", "Lkotlinx/coroutines/CoroutineName;", "CALL_COROUTINE", "Lkotlinx/coroutines/CoroutineName;", "getCALL_COROUTINE", "()Lkotlinx/coroutines/CoroutineName;", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClientConfig;", "CLIENT_CONFIG", "Lio/ktor/util/AttributeKey;", "getCLIENT_CONFIG", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.client.engine.HttpClientEngineKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpClientEngine5 {
    private static final CoroutineName CALL_COROUTINE = new CoroutineName("call-context");
    private static final Attributes2<HttpClientConfig<?>> CLIENT_CONFIG = new Attributes2<>("client-config");

    public static final Attributes2<HttpClientConfig<?>> getCLIENT_CONFIG() {
        return CLIENT_CONFIG;
    }

    public static final Object createCallContext(HttpClientEngine httpClientEngine, Job job, Continuation<? super CoroutineContext> continuation) {
        final CompletableJob completableJobJob = JobKt.Job(job);
        CoroutineContext coroutineContextPlus = httpClientEngine.getCoroutineContext().plus(completableJobJob).plus(CALL_COROUTINE);
        Job job2 = (Job) continuation.getContext().get(Job.INSTANCE);
        if (job2 == null) {
            return coroutineContextPlus;
        }
        final Job4 job4InvokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new Function1<Throwable, Unit>() { // from class: io.ktor.client.engine.UtilsKt$attachToUserJob$cleanupHandler$1
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
                if (th == null) {
                    return;
                }
                completableJobJob.cancel(new CancellationException(th.getMessage()));
            }
        }, 2, null);
        completableJobJob.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.client.engine.UtilsKt$attachToUserJob$2
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
                job4InvokeOnCompletion$default.dispose();
            }
        });
        return coroutineContextPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateHeaders(HttpRequestData httpRequest4) {
        Set<String> setNames = httpRequest4.getHeaders().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (HttpHeaders.INSTANCE.getUnsafeHeadersList().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new HttpHeaders5(arrayList.toString());
        }
    }
}
