package io.ktor.client.request;

import io.ktor.http.Headers3;
import io.ktor.http.HttpMessage2;
import io.ktor.http.URLParser2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HttpRequest.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lio/ktor/http/HttpMessageBuilder;", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "headers", "(Lio/ktor/http/HttpMessageBuilder;Lkotlin/jvm/functions/Function1;)Lio/ktor/http/HeadersBuilder;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "urlString", "url", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.client.request.HttpRequestKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpRequest5 {
    public static final Headers3 headers(HttpMessage2 httpMessage2, Function1<? super Headers3, Unit> block) {
        Intrinsics.checkNotNullParameter(httpMessage2, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Headers3 headers = httpMessage2.getHeaders();
        block.invoke(headers);
        return headers;
    }

    public static final void url(HttpRequest2 httpRequest2, String urlString) {
        Intrinsics.checkNotNullParameter(httpRequest2, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URLParser2.takeFrom(httpRequest2.getUrl(), urlString);
    }
}
