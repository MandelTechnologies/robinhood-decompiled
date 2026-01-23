package com.robinhood.targetbackend;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m3636d2 = {"atPath", "Lokhttp3/HttpUrl;", "prefix", "", "lib-target-backend_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.targetbackend.EndpointKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Endpoint9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpUrl atPath(HttpUrl httpUrl, String str) {
        HttpUrl httpUrlResolve = httpUrl.resolve(str + "/");
        Intrinsics.checkNotNull(httpUrlResolve);
        return httpUrlResolve;
    }
}
