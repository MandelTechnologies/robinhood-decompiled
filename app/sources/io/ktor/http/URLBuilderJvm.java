package io.ktor.http;

import io.ktor.http.URLBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: URLBuilderJvm.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lio/ktor/http/URLBuilder$Companion;", "", "getOrigin", "(Lio/ktor/http/URLBuilder$Companion;)Ljava/lang/String;", "origin", "ktor-http"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.http.URLBuilderJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class URLBuilderJvm {
    public static final String getOrigin(URLBuilder.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return "http://localhost";
    }
}
