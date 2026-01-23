package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequest2;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;

/* compiled from: HttpRequestLifecycle.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", m3645f = "HttpRequestLifecycle.kt", m3646l = {38}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpRequestLifecycle2 extends ContinuationImpl7 implements Function3<PipelineContext<Object, HttpRequest2>, Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRequestLifecycle2(HttpClient httpClient, Continuation<? super HttpRequestLifecycle2> continuation) {
        super(3, continuation);
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequest2> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
        HttpRequestLifecycle2 httpRequestLifecycle2 = new HttpRequestLifecycle2(this.$scope, continuation);
        httpRequestLifecycle2.L$0 = pipelineContext;
        return httpRequestLifecycle2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CompletableJob completableJob;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob = (CompletableJob) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                completableJob.complete();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                try {
                    completableJob.completeExceptionally(th);
                    throw th;
                } catch (Throwable th2) {
                    completableJob.complete();
                    throw th2;
                }
            }
        }
        ResultKt.throwOnFailure(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        CompletableJob completableJobSupervisorJob = Supervisor3.SupervisorJob(((HttpRequest2) pipelineContext.getContext()).getExecutionContext());
        CoroutineContext.Element element = this.$scope.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        HttpRequestLifecycle3.attachToClientEngineJob(completableJobSupervisorJob, (Job) element);
        try {
            ((HttpRequest2) pipelineContext.getContext()).setExecutionContext$ktor_client_core(completableJobSupervisorJob);
            this.L$0 = completableJobSupervisorJob;
            this.label = 1;
            if (pipelineContext.proceed(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            completableJob = completableJobSupervisorJob;
            completableJob.complete();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            completableJob = completableJobSupervisorJob;
            completableJob.completeExceptionally(th);
            throw th;
        }
    }
}
