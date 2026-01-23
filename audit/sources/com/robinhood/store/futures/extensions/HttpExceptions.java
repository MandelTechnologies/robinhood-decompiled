package com.robinhood.store.futures.extensions;

import com.robinhood.android.models.futures.api.order.FuturesHardOrderCheckError;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.utils.Json2;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: HttpExceptions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"hardOrderCheckErrorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/models/futures/api/order/FuturesHardOrderCheckError;", "convertToStandardErrorIfPossible", "Lretrofit2/HttpException;", "extractErrorMessage", "", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.store.futures.extensions.HttpExceptionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class HttpExceptions {
    private static final JsonAdapter<FuturesHardOrderCheckError> hardOrderCheckErrorAdapter;

    static {
        LazyMoshi lazyMoshi = new LazyMoshi(new Lazy() { // from class: com.robinhood.store.futures.extensions.HttpExceptionsKt$hardOrderCheckErrorAdapter$1
            @Override // dagger.Lazy
            public final Moshi get() {
                Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
                Json2.addGenericAdapters$default(builderAdd, null, 1, null);
                Moshi moshiBuild = builderAdd.build();
                Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
                return moshiBuild;
            }
        });
        Types types = Types.INSTANCE;
        hardOrderCheckErrorAdapter = lazyMoshi.adapter(new TypeToken<FuturesHardOrderCheckError>() { // from class: com.robinhood.store.futures.extensions.HttpExceptionsKt$special$$inlined$getAdapter$1
        }.getType());
    }

    public static final HttpException convertToStandardErrorIfPossible(HttpException httpException) {
        String strExtractErrorBodyString;
        FuturesHardOrderCheckError futuresHardOrderCheckErrorFromJson;
        Intrinsics.checkNotNullParameter(httpException, "<this>");
        Response<?> response = httpException.response();
        if (response != null && (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) != null) {
            try {
                futuresHardOrderCheckErrorFromJson = hardOrderCheckErrorAdapter.fromJson(strExtractErrorBodyString);
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            String message = futuresHardOrderCheckErrorFromJson != null ? futuresHardOrderCheckErrorFromJson.getMessage() : null;
            if (message != null) {
                ResponseBody responseBodyCreate$default = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, "{\"detail\":\"" + message + "\"}", (MediaType) null, 1, (Object) null);
                return new HttpException(Response.error(responseBodyCreate$default, response.raw().newBuilder().body(responseBodyCreate$default).build()));
            }
        }
        return httpException;
    }

    public static final String extractErrorMessage(HttpException httpException) {
        Intrinsics.checkNotNullParameter(httpException, "<this>");
        Response<?> response = httpException.response();
        if (response == null) {
            String strMessage = httpException.message();
            Intrinsics.checkNotNullExpressionValue(strMessage, "message(...)");
            return strMessage;
        }
        String strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response);
        if (strExtractErrorBodyString == null) {
            String strMessage2 = httpException.message();
            Intrinsics.checkNotNullExpressionValue(strMessage2, "message(...)");
            return strMessage2;
        }
        String message = null;
        try {
            FuturesHardOrderCheckError futuresHardOrderCheckErrorFromJson = hardOrderCheckErrorAdapter.fromJson(strExtractErrorBodyString);
            if (futuresHardOrderCheckErrorFromJson != null) {
                message = futuresHardOrderCheckErrorFromJson.getMessage();
            }
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
        }
        if (message != null) {
            return message;
        }
        String strMessage3 = httpException.message();
        Intrinsics.checkNotNullExpressionValue(strMessage3, "message(...)");
        return strMessage3;
    }
}
