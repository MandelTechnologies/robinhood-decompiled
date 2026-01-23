package com.robinhood.api.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: Responses.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"header", "", "T", "Lretrofit2/Response;", "lib-api_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.extension.ResponsesKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class Responses {
    public static final <T> String header(Response<T> response, String header) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        return response.headers().get(header);
    }
}
