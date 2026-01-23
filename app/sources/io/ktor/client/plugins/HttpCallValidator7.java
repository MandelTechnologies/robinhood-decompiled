package io.ktor.client.plugins;

import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpCallValidator;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequest2;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.util.Attributes;
import io.ktor.util.Attributes2;
import io.ktor.util.logging.KtorSimpleLoggerJvm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* compiled from: HttpCallValidator.kt */
@Metadata(m3635d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u000b\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016*`\u0010\u001e\"-\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00172-\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0017*\u008a\u0001\u0010\"\"B\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001f2B\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001f*`\u0010%\"-\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00172-\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0017¨\u0006&"}, m3636d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "builder", "io/ktor/client/plugins/HttpCallValidatorKt$HttpRequest$1", "HttpRequest", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/plugins/HttpCallValidatorKt$HttpRequest$1;", "Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpCallValidator$Config;", "", "Lkotlin/ExtensionFunctionType;", "block", "HttpResponseValidator", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/util/AttributeKey;", "", "ExpectSuccessAttributeKey", "Lio/ktor/util/AttributeKey;", "getExpectSuccessAttributeKey", "()Lio/ktor/util/AttributeKey;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "CallExceptionHandler", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequest;", "request", "CallRequestExceptionHandler", "Lio/ktor/client/statement/HttpResponse;", "response", "ResponseValidator", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.HttpCallValidatorKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpCallValidator7 {
    private static final Logger LOGGER = KtorSimpleLoggerJvm.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final Attributes2<Boolean> ExpectSuccessAttributeKey = new Attributes2<>("ExpectSuccessAttributeKey");

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.ktor.client.plugins.HttpCallValidatorKt$HttpRequest$1] */
    public static final C455821 HttpRequest(HttpRequest2 httpRequest2) {
        return new HttpRequest() { // from class: io.ktor.client.plugins.HttpCallValidatorKt.HttpRequest.1
            private final Attributes attributes;
            private final Headers headers;
            private final HttpMethod method;
            private final Url url;

            {
                this.method = this.$builder.getMethod();
                this.url = this.$builder.getUrl().build();
                this.attributes = this.$builder.getAttributes();
                this.headers = this.$builder.getHeaders().build();
            }

            @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
            public CoroutineContext getCoroutineContext() {
                return HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpClientCall getCall() {
                throw new IllegalStateException("Call is not initialized");
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Url getUrl() {
                return this.url;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.http.HttpMessage
            public Headers getHeaders() {
                return this.headers;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HttpResponseValidator(HttpClientConfig<?> httpClientConfig, Function1<? super HttpCallValidator.Config, Unit> block) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpCallValidator.INSTANCE, block);
    }

    public static final Attributes2<Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }
}
