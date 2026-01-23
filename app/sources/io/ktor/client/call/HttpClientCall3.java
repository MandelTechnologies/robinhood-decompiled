package io.ktor.client.call;

import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponse2;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: HttpClientCall.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "response", "Lio/ktor/client/statement/HttpResponse;", "from", "Lkotlin/reflect/KClass;", "to", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V", "message", "", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.call.NoTransformationFoundException, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpClientCall3 extends UnsupportedOperationException {
    private final String message;

    public HttpClientCall3(HttpResponse response, KClass<?> from, KClass<?> to) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        StringBuilder sb = new StringBuilder();
        sb.append("\n        Expected response body of the type '");
        sb.append(to);
        sb.append("' but was '");
        sb.append(from);
        sb.append("'\n        In response from `");
        sb.append(HttpResponse2.getRequest(response).getUrl());
        sb.append("`\n        Response status `");
        sb.append(response.getStatus());
        sb.append("`\n        Response header `ContentType: ");
        Headers headers = response.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        sb.append(headers.get(httpHeaders.getContentType()));
        sb.append("` \n        Request header `Accept: ");
        sb.append(HttpResponse2.getRequest(response).getHeaders().get(httpHeaders.getAccept()));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = StringsKt.trimIndent(sb.toString());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
