package io.ktor.client.plugins;

import com.plaid.internal.EnumC7081g;
import io.ktor.client.request.HttpRequest2;
import io.ktor.http.ContentTypes2;
import io.ktor.http.HttpMessage2;
import io.ktor.http.HttpMessageProperties;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpPlainText.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", m3645f = "HttpPlainText.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.HttpPlainText$Plugin$install$1, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpPlainText2 extends ContinuationImpl7 implements Function3<PipelineContext<Object, HttpRequest2>, Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpPlainText $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpPlainText2(HttpPlainText httpPlainText, Continuation<? super HttpPlainText2> continuation) {
        super(3, continuation);
        this.$plugin = httpPlainText;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequest2> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
        HttpPlainText2 httpPlainText2 = new HttpPlainText2(this.$plugin, continuation);
        httpPlainText2.L$0 = pipelineContext;
        httpPlainText2.L$1 = obj;
        return httpPlainText2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            this.$plugin.addCharsetHeaders$ktor_client_core((HttpRequest2) pipelineContext.getContext());
            if (!(obj2 instanceof String)) {
                return Unit.INSTANCE;
            }
            ContentTypes2 contentTypes2ContentType = HttpMessageProperties.contentType((HttpMessage2) pipelineContext.getContext());
            if (contentTypes2ContentType == null || Intrinsics.areEqual(contentTypes2ContentType.getContentType(), ContentTypes2.Text.INSTANCE.getPlain().getContentType())) {
                Object objWrapContent = this.$plugin.wrapContent((HttpRequest2) pipelineContext.getContext(), (String) obj2, contentTypes2ContentType);
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.proceedWith(objWrapContent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
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
