package com.robinhood.utils.extensions;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.sequences.Sequence;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: Throwables.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0002\u001a+\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0002*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006¢\u0006\u0002\u0010\u0007\u001a\"\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0002*\u0004\u0018\u00010\u0002H\u0086\b¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0002*\u0004\u0018\u00010\u0002H\u0086\b\u001a\u001f\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006H\u0086\u0002\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0002\"\u0017\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u00020\n*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\f\"\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\"\u0017\u0010\u0013\u001a\u00020\n*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f\"\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"causes", "Lkotlin/sequences/Sequence;", "", "findCause", "T", "type", "Ljava/lang/Class;", "(Ljava/lang/Throwable;Ljava/lang/Class;)Ljava/lang/Throwable;", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "contains", "", "isConnectivityException", "(Ljava/lang/Throwable;)Z", "isHttpException", "httpStatusCode", "", "getHttpStatusCode", "(Ljava/lang/Throwable;)Ljava/lang/Integer;", "is4xxHttpException", "isNetworkRelated", "rethrowIfNotNetworkRelated", "", "httpConflictUrl", "Lokhttp3/HttpUrl;", "getHttpConflictUrl", "(Ljava/lang/Throwable;)Lokhttp3/HttpUrl;", "requestUrl", "getRequestUrl", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class Throwables {
    public static final Sequence<Throwable> causes(Throwable th) {
        return kotlin.sequences.SequencesKt.generateSequence(th, (Function1<? super Throwable, ? extends Throwable>) new Function1() { // from class: com.robinhood.utils.extensions.Throwables$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Throwables.causes$lambda$0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable causes$lambda$0(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        return t.getCause();
    }

    public static final <T extends Throwable> T findCause(Throwable th, Class<T> type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return (T) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.filterIsInstance(causes(th), type2));
    }

    public static final /* synthetic */ <T extends Throwable> boolean contains(Throwable th) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return findCause(th, Throwable.class) != null;
    }

    public static final /* synthetic */ <T extends Throwable> T findCause(Throwable th) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) findCause(th, Throwable.class);
    }

    public static final HttpUrl getHttpConflictUrl(Throwable th) {
        Response<?> response;
        Headers headers;
        HttpException httpException = (HttpException) findCause(th, HttpException.class);
        if (httpException == null || httpException.code() != 409 || (response = httpException.response()) == null || (headers = response.headers()) == null) {
            return null;
        }
        HttpUrl url = response.raw().getRequest().getUrl();
        String str = headers.get(com.robinhood.utils.http.Headers.CONFLICTING_RESOURCE);
        if (str == null) {
            return null;
        }
        return url.resolve(str);
    }

    public static final Integer getHttpStatusCode(Throwable th) {
        HttpException httpException = (HttpException) findCause(th, HttpException.class);
        if (httpException != null) {
            return Integer.valueOf(httpException.code());
        }
        return null;
    }

    public static final HttpUrl getRequestUrl(Throwable th) {
        Response<?> response;
        okhttp3.Response responseRaw;
        Request request;
        Intrinsics.checkNotNullParameter(th, "<this>");
        HttpException httpException = (HttpException) findCause(th, HttpException.class);
        if (httpException == null || (response = httpException.response()) == null || (responseRaw = response.raw()) == null || (request = responseRaw.getRequest()) == null) {
            return null;
        }
        return request.getUrl();
    }

    public static final boolean isConnectivityException(Throwable th) {
        return findCause(th, IOException.class) != null;
    }

    public static final boolean isHttpException(Throwable th) {
        return findCause(th, HttpException.class) != null;
    }

    public static final boolean contains(Throwable th, Class<? extends Throwable> type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return findCause(th, type2) != null;
    }

    public static final boolean is4xxHttpException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(400, 499);
        Integer httpStatusCode = getHttpStatusCode(th);
        return httpStatusCode != null && primitiveRanges2.contains(httpStatusCode.intValue());
    }

    public static final boolean isNetworkRelated(Throwable th) {
        return isConnectivityException(th) || isHttpException(th);
    }

    public static final void rethrowIfNotNetworkRelated(Throwable th) throws Throwable {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (!isNetworkRelated(th)) {
            throw th;
        }
    }
}
