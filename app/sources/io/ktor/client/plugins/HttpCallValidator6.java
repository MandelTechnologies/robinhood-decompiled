package io.ktor.client.plugins;

import com.plaid.internal.EnumC7081g;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest2;
import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: HttpCallValidator.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", m3645f = "HttpCallValidator.kt", m3646l = {151, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.HttpCallValidator$Companion$install$3, reason: use source file name */
/* loaded from: classes14.dex */
final class HttpCallValidator6 extends ContinuationImpl7 implements Function3<HttpSend5, HttpRequest2, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ HttpCallValidator $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpCallValidator6(HttpCallValidator httpCallValidator, Continuation<? super HttpCallValidator6> continuation) {
        super(3, continuation);
        this.$plugin = httpCallValidator;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(HttpSend5 httpSend5, HttpRequest2 httpRequest2, Continuation<? super HttpClientCall> continuation) {
        HttpCallValidator6 httpCallValidator6 = new HttpCallValidator6(this.$plugin, continuation);
        httpCallValidator6.L$0 = httpSend5;
        httpCallValidator6.L$1 = httpRequest2;
        return httpCallValidator6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HttpSend5 httpSend5 = (HttpSend5) this.L$0;
            HttpRequest2 httpRequest2 = (HttpRequest2) this.L$1;
            this.L$0 = null;
            this.label = 1;
            obj = httpSend5.execute(httpRequest2, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HttpClientCall httpClientCall = (HttpClientCall) this.L$0;
            ResultKt.throwOnFailure(obj);
            return httpClientCall;
        }
        ResultKt.throwOnFailure(obj);
        HttpClientCall httpClientCall2 = (HttpClientCall) obj;
        HttpCallValidator httpCallValidator = this.$plugin;
        HttpResponse response = httpClientCall2.getResponse();
        this.L$0 = httpClientCall2;
        this.label = 2;
        return httpCallValidator.validateResponse(response, this) == coroutine_suspended ? coroutine_suspended : httpClientCall2;
    }
}
