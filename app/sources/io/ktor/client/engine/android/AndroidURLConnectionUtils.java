package io.ktor.client.engine.android;

import io.ktor.client.network.sockets.TimeoutExceptionsCommon;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.HttpTimeout6;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.cio.ByteBufferPool2;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.jvm.javaio.Reading2;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Yield;

/* compiled from: AndroidURLConnectionUtils.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a7\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u0011*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00110\u0013H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m3636d2 = {"content", "Lio/ktor/utils/io/ByteReadChannel;", "Ljava/net/HttpURLConnection;", "callContext", "Lkotlin/coroutines/CoroutineContext;", "request", "Lio/ktor/client/request/HttpRequestData;", "isTimeoutException", "", "", "setupRequestTimeoutAttributes", "", "timeoutAttributes", "Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;", "setupTimeoutAttributes", "requestData", "timeoutAwareConnection", "T", "block", "Lkotlin/Function1;", "(Ljava/net/HttpURLConnection;Lio/ktor/client/request/HttpRequestData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-android"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.client.engine.android.AndroidURLConnectionUtilsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class AndroidURLConnectionUtils {

    /* compiled from: AndroidURLConnectionUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", m3645f = "AndroidURLConnectionUtils.kt", m3646l = {60}, m3647m = "timeoutAwareConnection")
    /* renamed from: io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 */
    static final class C455681<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C455681(Continuation<? super C455681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidURLConnectionUtils.timeoutAwareConnection(null, null, null, this);
        }
    }

    public static final void setupTimeoutAttributes(HttpURLConnection httpURLConnection, HttpRequestData requestData) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) requestData.getCapabilityOrNull(HttpTimeout.INSTANCE);
        if (httpTimeoutCapabilityConfiguration != null) {
            Long l = httpTimeoutCapabilityConfiguration.get_connectTimeoutMillis();
            if (l != null) {
                httpURLConnection.setConnectTimeout(HttpTimeout6.convertLongTimeoutToIntWithInfiniteAsZero(l.longValue()));
            }
            Long l2 = httpTimeoutCapabilityConfiguration.get_socketTimeoutMillis();
            if (l2 != null) {
                httpURLConnection.setReadTimeout(HttpTimeout6.convertLongTimeoutToIntWithInfiniteAsZero(l2.longValue()));
            }
            setupRequestTimeoutAttributes(httpURLConnection, httpTimeoutCapabilityConfiguration);
        }
    }

    private static final void setupRequestTimeoutAttributes(HttpURLConnection httpURLConnection, HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration) {
        Long l = httpTimeoutCapabilityConfiguration.get_requestTimeoutMillis();
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > jLongValue) {
                    httpURLConnection.setConnectTimeout(HttpTimeout6.convertLongTimeoutToIntWithInfiniteAsZero(jLongValue));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object timeoutAwareConnection(HttpURLConnection httpURLConnection, HttpRequestData httpRequestData, Function1<? super HttpURLConnection, ? extends T> function1, Continuation<? super T> continuation) {
        C455681 c455681;
        if (continuation instanceof C455681) {
            c455681 = (C455681) continuation;
            int i = c455681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455681.label = i - Integer.MIN_VALUE;
            } else {
                c455681 = new C455681(continuation);
            }
        }
        Object obj = c455681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c455681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                return function1.invoke(httpURLConnection);
            } catch (Throwable th) {
                th = th;
                c455681.L$0 = httpRequestData;
                c455681.L$1 = th;
                c455681.label = 1;
                if (Yield.yield(c455681) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) c455681.L$1;
            httpRequestData = (HttpRequestData) c455681.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (isTimeoutException(th)) {
            throw HttpTimeout6.ConnectTimeoutException(httpRequestData, th);
        }
        throw th;
    }

    public static final ByteReadChannelJVM content(HttpURLConnection httpURLConnection, CoroutineContext callContext, HttpRequestData request) {
        ByteReadChannelJVM byteReadChannel;
        ByteReadChannelJVM byteReadChannelJVMMapEngineExceptions;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        return (bufferedInputStream == null || (byteReadChannel = Reading2.toByteReadChannel(bufferedInputStream, callContext, ByteBufferPool2.getKtorDefaultPool())) == null || (byteReadChannelJVMMapEngineExceptions = TimeoutExceptionsCommon.mapEngineExceptions(CoroutineScope2.CoroutineScope(callContext), byteReadChannel, request)) == null) ? ByteReadChannelJVM.INSTANCE.getEmpty() : byteReadChannelJVMMapEngineExceptions;
    }

    private static final boolean isTimeoutException(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (th instanceof ConnectException) {
            String message = th.getMessage();
            if (message != null ? StringsKt.contains$default((CharSequence) message, (CharSequence) "timed out", false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }
}
