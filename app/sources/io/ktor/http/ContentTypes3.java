package io.ktor.http;

import io.ktor.utils.p478io.charsets.CharsetJVM;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentTypes.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\n\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\n\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002¨\u0006\u0007"}, m3636d2 = {"charset", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "Lio/ktor/http/HeaderValueWithParameters;", "withCharset", "Lio/ktor/http/ContentType;", "withCharsetIfNeeded", "ktor-http"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.http.ContentTypesKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ContentTypes3 {
    public static final ContentTypes2 withCharset(ContentTypes2 contentTypes2, Charset charset) {
        Intrinsics.checkNotNullParameter(contentTypes2, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return contentTypes2.withParameter("charset", CharsetJVM.getName(charset));
    }

    public static final ContentTypes2 withCharsetIfNeeded(ContentTypes2 contentTypes2, Charset charset) {
        Intrinsics.checkNotNullParameter(contentTypes2, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String lowerCase = contentTypes2.getContentType().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return !Intrinsics.areEqual(lowerCase, "text") ? contentTypes2 : contentTypes2.withParameter("charset", CharsetJVM.getName(charset));
    }

    public static final Charset charset(HeaderValueWithParameters headerValueWithParameters) {
        Intrinsics.checkNotNullParameter(headerValueWithParameters, "<this>");
        String strParameter = headerValueWithParameters.parameter("charset");
        if (strParameter == null) {
            return null;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
