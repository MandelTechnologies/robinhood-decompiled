package com.robinhood.android.data.store.logging.utils;

import com.robinhood.rosetta.eventlogging.NetworkContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: LoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, m3636d2 = {"toNetworkContext", "Lcom/robinhood/rosetta/eventlogging/NetworkContext;", "Lretrofit2/Response;", "tag", "Lcom/robinhood/rosetta/eventlogging/NetworkContext$Tag;", "", "lib-store-logging-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.data.store.logging.utils.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LoggingUtils4 {
    public static final NetworkContext toNetworkContext(Response<?> response, NetworkContext.Tag tag) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new NetworkContext(null, true, response.code(), tag, null, 17, null);
    }

    public static final NetworkContext toNetworkContext(Throwable th, NetworkContext.Tag tag) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        String string2 = Reflection.getOrCreateKotlinClass(th.getClass()).toString();
        HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
        return new NetworkContext(string2, false, httpException != null ? httpException.code() : 0, tag, null, 16, null);
    }
}
