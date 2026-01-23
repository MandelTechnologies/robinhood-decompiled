package io.ktor.client.plugins.contentnegotiation;

import com.plaid.internal.EnumC7081g;
import io.ktor.client.request.HttpRequest2;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ContentNegotiation.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$1", m3645f = "ContentNegotiation.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$1, reason: use source file name */
/* loaded from: classes14.dex */
final class ContentNegotiation4 extends ContinuationImpl7 implements Function3<PipelineContext<Object, HttpRequest2>, Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContentNegotiation $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentNegotiation4(ContentNegotiation contentNegotiation, Continuation<? super ContentNegotiation4> continuation) {
        super(3, continuation);
        this.$plugin = contentNegotiation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequest2> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
        ContentNegotiation4 contentNegotiation4 = new ContentNegotiation4(this.$plugin, continuation);
        contentNegotiation4.L$0 = pipelineContext;
        return contentNegotiation4.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r1.proceedWith(r7, r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PipelineContext pipelineContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pipelineContext = (PipelineContext) this.L$0;
            ContentNegotiation contentNegotiation = this.$plugin;
            HttpRequest2 httpRequest2 = (HttpRequest2) pipelineContext.getContext();
            Object subject = pipelineContext.getSubject();
            this.L$0 = pipelineContext;
            this.label = 1;
            obj = contentNegotiation.convertRequest$ktor_client_content_negotiation(httpRequest2, subject, this);
            if (obj != coroutine_suspended) {
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
        pipelineContext = (PipelineContext) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (obj == null) {
            return Unit.INSTANCE;
        }
        this.L$0 = null;
        this.label = 2;
    }
}
