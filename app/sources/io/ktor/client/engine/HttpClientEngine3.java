package io.ktor.client.engine;

import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.request.HttpRequest6;
import io.ktor.client.request.HttpRequestData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HttpClientEngine.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lio/ktor/client/request/HttpResponseData;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", m3645f = "HttpClientEngine.kt", m3646l = {99}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpClientEngine3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HttpRequest6>, Object> {
    final /* synthetic */ HttpRequestData $requestData;
    int label;
    final /* synthetic */ HttpClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientEngine3(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, Continuation<? super HttpClientEngine3> continuation) {
        super(2, continuation);
        this.this$0 = httpClientEngine;
        this.$requestData = httpRequestData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HttpClientEngine3(this.this$0, this.$requestData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpRequest6> continuation) {
        return ((HttpClientEngine3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        if (HttpClientEngine.DefaultImpls.getClosed(this.this$0)) {
            throw new HttpClientEngineBase2(null, 1, null);
        }
        HttpClientEngine httpClientEngine = this.this$0;
        HttpRequestData httpRequestData = this.$requestData;
        this.label = 1;
        Object objExecute = httpClientEngine.execute(httpRequestData, this);
        return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
    }
}
