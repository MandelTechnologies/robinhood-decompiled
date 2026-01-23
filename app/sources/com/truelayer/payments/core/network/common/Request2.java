package com.truelayer.payments.core.network.common;

import android.util.Log;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration2;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.NetworkError;
import com.truelayer.payments.core.utils.ErrorUtils2;
import com.truelayer.payments.core.utils.JsonConverter2;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* compiled from: Request.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a?\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0007\"\u0006\b\u0000\u0010\n\u0018\u0001\"\u0004\b\u0001\u0010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f2\u0006\u0010\u0005\u001a\u00020\u0001H\u0082\b\u001aB\u0010\r\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0007\"\u0004\b\u0000\u0010\b\"\u0006\b\u0001\u0010\n\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\f0\u000fH\u0080H¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"DELAY", "", "MAX_ATTEMPTS", "delayTime", "", "attempts", "handleResponse", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "T", "Lcom/truelayer/payments/core/network/NetworkError;", "E", "response", "Lretrofit2/Response;", "request", "call", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldRetry", "", "status", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.network.common.RequestKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Request2 {
    private static final int DELAY = 500;
    public static final int MAX_ATTEMPTS = 3;

    public static final long delayTime(int i) {
        return i * 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldRetry(int i, int i2) {
        return i < 3 && i2 >= 500;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0132 A[Catch: all -> 0x0038, TryCatch #3 {all -> 0x0038, blocks: (B:4:0x0008, B:6:0x002a, B:45:0x0149, B:9:0x003c, B:11:0x0042, B:13:0x0049, B:15:0x0065, B:16:0x00ae, B:18:0x00b8, B:19:0x00cc, B:21:0x00dd, B:40:0x012a, B:42:0x0132, B:43:0x0138, B:44:0x0144), top: B:82:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138 A[Catch: all -> 0x0038, TryCatch #3 {all -> 0x0038, blocks: (B:4:0x0008, B:6:0x002a, B:45:0x0149, B:9:0x003c, B:11:0x0042, B:13:0x0049, B:15:0x0065, B:16:0x00ae, B:18:0x00b8, B:19:0x00cc, B:21:0x00dd, B:40:0x012a, B:42:0x0132, B:43:0x0138, B:44:0x0144), top: B:82:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150 A[LOOP:0: B:3:0x0006->B:48:0x0150, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ <T, E> Object request(Function0<Response<T>> function0, Continuation<? super Outcome<? extends T, ? extends NetworkError<E>>> continuation) {
        Object validationError;
        Object fail;
        NetworkError.HttpError httpError;
        String str;
        Json jsonDefault;
        SerializersModule serializersModule;
        int i = 0;
        int i2 = 0;
        while (true) {
            String str2 = null;
            try {
                long jDelayTime = delayTime(i2);
                InlineMarker.mark(i);
                DelayKt.delay(jDelayTime, continuation);
                InlineMarker.mark(1);
                int i3 = i2 + 1;
                Response<T> responseInvoke = function0.invoke();
                int iCode = responseInvoke.code();
                if (responseInvoke.isSuccessful()) {
                    T tBody = responseInvoke.body();
                    Intrinsics.checkNotNull(tBody);
                    fail = new Ok(tBody);
                } else {
                    ResponseBody responseBodyErrorBody = responseInvoke.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    String str3 = responseInvoke.headers().get("tl-trace-id");
                    String url = responseInvoke.raw().getRequest().getUrl().getUrl();
                    if (i3 > 0) {
                        TrueLayerAnalytics analytics$payments_core_release = TrueLayerCore.INSTANCE.getAnalytics$payments_core_release();
                        String str4 = strString;
                        AnalyticsEvents.BackgroundError backgroundError = new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i3 + " failed with status " + responseInvoke.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, str4, str3, url, 17, null);
                        strString = str4;
                        str3 = str3;
                        url = url;
                        analytics$payments_core_release.track(backgroundError);
                    }
                    if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                        Log.e("TL-HttpError-Logger", "HttpFailure response \n " + responseInvoke);
                        Unit unit = Unit.INSTANCE;
                    }
                    NetworkError.HttpError httpError2 = new NetworkError.HttpError(responseInvoke.code(), null, null, i3, strString, str3, url, 6, null);
                    if (strString == null || strString.length() == 0) {
                        fail = new Fail(httpError2);
                    } else {
                        try {
                            jsonDefault = JsonConverter2.getJsonDefault();
                            serializersModule = jsonDefault.getSerializersModule();
                            Intrinsics.reifiedOperationMarker(6, "E");
                            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                            try {
                                httpError = httpError2;
                                try {
                                    str = url;
                                } catch (Throwable th) {
                                    th = th;
                                    str = url;
                                    if (responseInvoke.code() < 500) {
                                        fail = new Fail(httpError);
                                    } else {
                                        fail = new Fail(new NetworkError.ValidationError(th, strString, str3, str));
                                    }
                                    if (!shouldRetry(i3, iCode)) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                httpError = httpError2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            httpError = httpError2;
                        }
                        try {
                            fail = new Fail(new NetworkError.HttpError(responseInvoke.code(), null, jsonDefault.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), strString), i3, strString, str3, url, 2, null));
                        } catch (Throwable th4) {
                            th = th4;
                            if (responseInvoke.code() < 500) {
                            }
                            if (!shouldRetry(i3, iCode)) {
                            }
                        }
                    }
                }
                if (!shouldRetry(i3, iCode)) {
                    return fail;
                }
                i2 = i3;
                i = 0;
            } catch (Throwable th5) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
                if (stackTraceElement != null) {
                    str2 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                }
                String str5 = str2;
                if (th5 instanceof CertificateExpiredException ? true : th5 instanceof CertificateException ? true : th5 instanceof SSLHandshakeException ? true : th5 instanceof SSLPeerUnverifiedException) {
                    validationError = new NetworkError.CertificateValidationError(th5, th5.toString(), null, str5, 4, null);
                } else if ((th5 instanceof SocketTimeoutException) || (th5 instanceof IOException)) {
                    validationError = new NetworkError.ConnectionError(th5, th5.toString(), null, str5, 4, null);
                } else {
                    validationError = new NetworkError.ValidationError(th5, th5.toString(), null, str5, 4, null);
                }
                if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
                    Log.e("TL-HttpError-Logger", "HttpFailure response \n " + validationError + " caused by " + th5);
                    Unit unit2 = Unit.INSTANCE;
                }
                return new Fail(validationError);
            }
        }
    }

    private static final /* synthetic */ <E, T> Outcome<T, NetworkError<E>> handleResponse(Response<T> response, int i) {
        Fail fail;
        if (response.isSuccessful()) {
            T tBody = response.body();
            Intrinsics.checkNotNull(tBody);
            return new Ok(tBody);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
        String str = response.headers().get("tl-trace-id");
        String url = response.raw().getRequest().getUrl().getUrl();
        if (i > 0) {
            TrueLayerAnalytics analytics$payments_core_release = TrueLayerCore.INSTANCE.getAnalytics$payments_core_release();
            String str2 = strString;
            AnalyticsEvents.BackgroundError backgroundError = new AnalyticsEvents.BackgroundError(null, "Auto retrying request after attempt " + i + " failed with status " + response.code(), ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, str2, str, url, 17, null);
            strString = str2;
            str = str;
            url = url;
            analytics$payments_core_release.track(backgroundError);
        }
        if (TrueLayerCore.INSTANCE.getLoggingLevel$payments_core_release() != HttpConnectionConfiguration2.None) {
            Log.e("TL-HttpError-Logger", "HttpFailure response \n " + response);
        }
        NetworkError.HttpError httpError = new NetworkError.HttpError(response.code(), null, null, i, strString, str, url, 6, null);
        if (strString == null || strString.length() == 0) {
            return new Fail(httpError);
        }
        try {
            Json jsonDefault = JsonConverter2.getJsonDefault();
            SerializersModule serializersModule = jsonDefault.getSerializersModule();
            Intrinsics.reifiedOperationMarker(6, "E");
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return new Fail(new NetworkError.HttpError(response.code(), null, jsonDefault.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), strString), i, strString, str, url, 2, null));
        } catch (Throwable th) {
            if (response.code() >= 500) {
                fail = new Fail(httpError);
            } else {
                fail = new Fail(new NetworkError.ValidationError(th, strString, str, url));
            }
            return fail;
        }
    }
}
