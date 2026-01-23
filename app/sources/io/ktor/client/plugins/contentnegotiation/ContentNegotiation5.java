package io.ktor.client.plugins.contentnegotiation;

import com.plaid.internal.EnumC7081g;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.http.ContentTypes2;
import io.ktor.http.HttpMessageProperties;
import io.ktor.http.Url;
import io.ktor.serialization.ContentConverter3;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ContentNegotiation.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<name for destructuring parameter 0>"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$2", m3645f = "ContentNegotiation.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$2, reason: use source file name */
/* loaded from: classes14.dex */
final class ContentNegotiation5 extends ContinuationImpl7 implements Function3<PipelineContext<HttpResponseContainer, HttpClientCall>, HttpResponseContainer, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContentNegotiation $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentNegotiation5(ContentNegotiation contentNegotiation, Continuation<? super ContentNegotiation5> continuation) {
        super(3, continuation);
        this.$plugin = contentNegotiation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, Continuation<? super Unit> continuation) {
        ContentNegotiation5 contentNegotiation5 = new ContentNegotiation5(this.$plugin, continuation);
        contentNegotiation5.L$0 = pipelineContext;
        contentNegotiation5.L$1 = httpResponseContainer;
        return contentNegotiation5.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r3.proceedWith(r5, r12) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ContentNegotiation5 contentNegotiation5;
        PipelineContext pipelineContext;
        TypeInfo typeInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
            HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.L$1;
            TypeInfo expectedType = httpResponseContainer.getExpectedType();
            Object response = httpResponseContainer.getResponse();
            ContentTypes2 contentTypes2ContentType = HttpMessageProperties.contentType(((HttpClientCall) pipelineContext2.getContext()).getResponse());
            if (contentTypes2ContentType == null) {
                ContentNegotiation9.LOGGER.trace("Response doesn't have \"Content-Type\" header, skipping ContentNegotiation plugin");
                return Unit.INSTANCE;
            }
            Charset charsetSuitableCharset$default = ContentConverter3.suitableCharset$default(((HttpClientCall) pipelineContext2.getContext()).getRequest().getHeaders(), null, 1, null);
            ContentNegotiation contentNegotiation = this.$plugin;
            Url url = ((HttpClientCall) pipelineContext2.getContext()).getRequest().getUrl();
            this.L$0 = pipelineContext2;
            this.L$1 = expectedType;
            this.label = 1;
            contentNegotiation5 = this;
            Object objConvertResponse$ktor_client_content_negotiation = contentNegotiation.convertResponse$ktor_client_content_negotiation(url, expectedType, response, contentTypes2ContentType, charsetSuitableCharset$default, contentNegotiation5);
            if (objConvertResponse$ktor_client_content_negotiation != coroutine_suspended) {
                pipelineContext = pipelineContext2;
                obj = objConvertResponse$ktor_client_content_negotiation;
                typeInfo = expectedType;
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
        typeInfo = (TypeInfo) this.L$1;
        pipelineContext = (PipelineContext) this.L$0;
        ResultKt.throwOnFailure(obj);
        contentNegotiation5 = this;
        if (obj == null) {
            return Unit.INSTANCE;
        }
        HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, obj);
        contentNegotiation5.L$0 = null;
        contentNegotiation5.L$1 = null;
        contentNegotiation5.label = 2;
    }
}
