package io.ktor.http;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HttpMessageProperties.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0007¢\u0006\u0004\b\u0004\u0010\b\u001a\u0019\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n*\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lio/ktor/http/HttpMessageBuilder;", "Lio/ktor/http/ContentType;", "type", "", "contentType", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", "(Lio/ktor/http/HttpMessageBuilder;)Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpMessage;", "(Lio/ktor/http/HttpMessage;)Lio/ktor/http/ContentType;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "(Lio/ktor/http/HttpMessage;)Ljava/nio/charset/Charset;", "", "contentLength", "(Lio/ktor/http/HttpMessage;)Ljava/lang/Long;", "ktor-http"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.http.HttpMessagePropertiesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpMessageProperties {
    public static final void contentType(HttpMessage2 httpMessage2, ContentTypes2 type2) {
        Intrinsics.checkNotNullParameter(httpMessage2, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        httpMessage2.getHeaders().set(HttpHeaders.INSTANCE.getContentType(), type2.toString());
    }

    public static final ContentTypes2 contentType(HttpMessage2 httpMessage2) {
        Intrinsics.checkNotNullParameter(httpMessage2, "<this>");
        String str = httpMessage2.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentTypes2.INSTANCE.parse(str);
        }
        return null;
    }

    public static final ContentTypes2 contentType(HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return ContentTypes2.INSTANCE.parse(str);
        }
        return null;
    }

    public static final Charset charset(HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        ContentTypes2 contentTypes2ContentType = contentType(httpMessage);
        if (contentTypes2ContentType != null) {
            return ContentTypes3.charset(contentTypes2ContentType);
        }
        return null;
    }

    public static final Long contentLength(HttpMessage httpMessage) {
        Intrinsics.checkNotNullParameter(httpMessage, "<this>");
        String str = httpMessage.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }
}
