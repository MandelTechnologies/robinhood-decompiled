package com.robinhood.android.lib.stepupverification;

import com.robinhood.api.utils.extensions.NetworkThrowables;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: VerificationWorkflowGrpcErrorResponses.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0000\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u0005H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"grpcErrorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/lib/stepupverification/VerificationWorkflowGrpcErrorResponse;", "extractGrpcErrorResponse", "", "Lretrofit2/Response;", "lib-step-up-verification_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.stepupverification.VerificationWorkflowGrpcErrorResponsesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class VerificationWorkflowGrpcErrorResponses {
    private static final JsonAdapter<VerificationWorkflowGrpcErrorResponse> grpcErrorResponseAdapter;

    static {
        LazyMoshi lazyMoshi = new LazyMoshi(new Lazy() { // from class: com.robinhood.android.lib.stepupverification.VerificationWorkflowGrpcErrorResponsesKt$grpcErrorResponseAdapter$1
            @Override // dagger.Lazy
            public final Moshi get() {
                Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
                Json2.addGenericAdapters$default(builderAdd, null, 1, null);
                builderAdd.add((JsonAdapter.Factory) VerificationWorkflowGrpcErrorResponse.INSTANCE.getJsonAdapterFactory());
                Moshi moshiBuild = builderAdd.build();
                Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
                return moshiBuild;
            }
        });
        Types types = Types.INSTANCE;
        grpcErrorResponseAdapter = lazyMoshi.adapter(new TypeToken<VerificationWorkflowGrpcErrorResponse>() { // from class: com.robinhood.android.lib.stepupverification.VerificationWorkflowGrpcErrorResponsesKt$special$$inlined$getAdapter$1
        }.getType());
    }

    private static final VerificationWorkflowGrpcErrorResponse extractGrpcErrorResponse(Response<?> response) {
        try {
            String strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response);
            if (strExtractErrorBodyString != null) {
                return grpcErrorResponseAdapter.fromJson(strExtractErrorBodyString);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final VerificationWorkflowGrpcErrorResponse extractGrpcErrorResponse(Throwable th) {
        Response<?> response;
        Intrinsics.checkNotNullParameter(th, "<this>");
        HttpException httpException = (HttpException) Throwables.findCause(th, HttpException.class);
        if (httpException == null || (response = httpException.response()) == null) {
            return null;
        }
        return extractGrpcErrorResponse(response);
    }
}
