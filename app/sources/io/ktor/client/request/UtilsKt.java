package io.ktor.client.request;

import io.ktor.http.ContentTypes2;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessage2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: utils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/ktor/http/HttpMessageBuilder;", "Lio/ktor/http/ContentType;", "contentType", "", "accept", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class UtilsKt {
    public static final void accept(HttpMessage2 httpMessage2, ContentTypes2 contentType) {
        Intrinsics.checkNotNullParameter(httpMessage2, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        httpMessage2.getHeaders().append(HttpHeaders.INSTANCE.getAccept(), contentType.toString());
    }
}
