package com.squareup.wire;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: GrpcHttpUrl.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003*\u00020\u0004*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"GrpcHttpUrl", "Lokhttp3/HttpUrl;", "toHttpUrl", "Lcom/squareup/wire/GrpcHttpUrl;", "", "wire-grpc-client"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.GrpcHttpUrlKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class GrpcHttpUrl {
    public static final HttpUrl toHttpUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return HttpUrl.INSTANCE.get(str);
    }
}
