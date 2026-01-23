package com.robinhood.api.utils.extensions;

import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.jsonadapter.ErrorResponseJsonAdapterFactory;
import com.robinhood.models.serverdriven.experimental.SDUI_INTERFACE_moshi;
import com.robinhood.models.serverdriven.utils.MoshiBuilders2;
import com.robinhood.utils.Json2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.Charsets;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

/* compiled from: NetworkThrowables.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0004\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u0006\u0012\u0002\b\u00030\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"errorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/ErrorResponse;", "extractErrorResponse", "", "Lretrofit2/Response;", "extractErrorBodyString", "", "lib-api_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class NetworkThrowables {
    private static final JsonAdapter<ErrorResponse> errorResponseAdapter;

    static {
        LazyMoshi lazyMoshi = new LazyMoshi(new Lazy() { // from class: com.robinhood.api.utils.extensions.NetworkThrowables$errorResponseAdapter$1
            @Override // dagger.Lazy
            public final Moshi get() {
                Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
                Json2.addGenericAdapters$default(builderAdd, null, 1, null);
                SDUI_INTERFACE_moshi.addExperimentalServerDrivenUiAdapters(builderAdd);
                MoshiBuilders2.addServerDrivenUiApiAdapters(builderAdd);
                MoshiBuilders2.addServerDrivenUiDbAdapters(builderAdd);
                builderAdd.add((JsonAdapter.Factory) ErrorResponseJsonAdapterFactory.INSTANCE);
                Moshi moshiBuild = builderAdd.build();
                Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
                return moshiBuild;
            }
        });
        Types types = Types.INSTANCE;
        errorResponseAdapter = lazyMoshi.adapter(new TypeToken<ErrorResponse>() { // from class: com.robinhood.api.utils.extensions.NetworkThrowables$special$$inlined$getAdapter$1
        }.getType());
    }

    public static final ErrorResponse extractErrorResponse(Throwable th) {
        Response<?> response;
        Intrinsics.checkNotNullParameter(th, "<this>");
        HttpException httpException = (HttpException) Throwables.findCause(th, HttpException.class);
        if (httpException == null || (response = httpException.response()) == null) {
            return null;
        }
        return extractErrorResponse(response);
    }

    private static final ErrorResponse extractErrorResponse(Response<?> response) {
        try {
            String strExtractErrorBodyString = extractErrorBodyString(response);
            if (strExtractErrorBodyString != null) {
                return errorResponseAdapter.fromJson(strExtractErrorBodyString);
            }
            return null;
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Unable to parse error response", new Object[0]);
            return null;
        }
    }

    public static final String extractErrorBodyString(Response<?> response) {
        BufferedSource bufferedSource;
        Buffer bufferField;
        Buffer bufferClone;
        Intrinsics.checkNotNullParameter(response, "<this>");
        try {
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null && (bufferedSource = responseBodyErrorBody.getSource()) != null && (bufferField = bufferedSource.getBufferField()) != null && (bufferClone = bufferField.clone()) != null) {
                try {
                    String string2 = bufferClone.readString(Charsets.UTF_8);
                    Closeable.closeFinally(bufferClone, null);
                    return string2;
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
