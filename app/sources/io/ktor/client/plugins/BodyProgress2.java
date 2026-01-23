package io.ktor.client.plugins;

import io.ktor.client.plugins.observer.DelegatedCall2;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ByteChannelUtils;
import io.ktor.http.HttpMessageProperties;
import io.ktor.util.Attributes2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BodyProgress.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a^\u0010\u000b\u001a\u00020\u0000*\u00020\u00002F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"]\u0010\u000e\u001aH\u0012D\u0012B\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00010\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"]\u0010\u0010\u001aH\u0012D\u0012B\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00010\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m3636d2 = {"Lio/ktor/client/statement/HttpResponse;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytesSentTotal", "contentLength", "Lkotlin/coroutines/Continuation;", "", "", "listener", "withObservableDownload", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/jvm/functions/Function3;)Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/util/AttributeKey;", "UploadProgressListenerAttributeKey", "Lio/ktor/util/AttributeKey;", "DownloadProgressListenerAttributeKey", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.plugins.BodyProgressKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class BodyProgress2 {
    private static final Attributes2<Function3<Long, Long, Continuation<? super Unit>, Object>> UploadProgressListenerAttributeKey = new Attributes2<>("UploadProgressListenerAttributeKey");
    private static final Attributes2<Function3<Long, Long, Continuation<? super Unit>, Object>> DownloadProgressListenerAttributeKey = new Attributes2<>("DownloadProgressListenerAttributeKey");

    public static final HttpResponse withObservableDownload(HttpResponse httpResponse, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> listener) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return DelegatedCall2.wrapWithContent(httpResponse.getCall(), ByteChannelUtils.observable(httpResponse.getContent(), httpResponse.getCoroutineContext(), HttpMessageProperties.contentLength(httpResponse), listener)).getResponse();
    }
}
