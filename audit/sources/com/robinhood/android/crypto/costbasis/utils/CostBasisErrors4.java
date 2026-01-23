package com.robinhood.android.crypto.costbasis.utils;

import com.robinhood.android.common.C11048R;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.utils.Json2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.robinhood.utils.resource.StringResource;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CostBasisErrors.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"lazyMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "errorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorWrapper;", "validationErrorAdapter", "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorResponse;", "extractCostBasisErrorDetails", "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "", "extractCostBasisErrorResponse", "feature-crypto-cost-basis_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CostBasisErrors4 {
    private static final JsonAdapter<CostBasisErrorWrapper> errorAdapter;
    private static final LazyMoshi lazyMoshi;
    private static final JsonAdapter<CostBasisErrorResponse> validationErrorAdapter;

    static {
        LazyMoshi lazyMoshi2 = new LazyMoshi(new Lazy() { // from class: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorsKt$lazyMoshi$1
            @Override // dagger.Lazy
            public final Moshi get() {
                Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
                Json2.addGenericAdapters$default(builderAdd, null, 1, null);
                Moshi moshiBuild = builderAdd.build();
                Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
                return moshiBuild;
            }
        });
        lazyMoshi = lazyMoshi2;
        Types types = Types.INSTANCE;
        errorAdapter = lazyMoshi2.adapter(new TypeToken<CostBasisErrorWrapper>() { // from class: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorsKt$special$$inlined$getAdapter$1
        }.getType());
        validationErrorAdapter = lazyMoshi2.adapter(new TypeToken<CostBasisErrorResponse>() { // from class: com.robinhood.android.crypto.costbasis.utils.CostBasisErrorsKt$special$$inlined$getAdapter$2
        }.getType());
    }

    public static final CostBasisErrorDetails extractCostBasisErrorDetails(Throwable th) {
        CostBasisErrorDetails errorDetails;
        Intrinsics.checkNotNullParameter(th, "<this>");
        CostBasisErrorResponse costBasisErrorResponseExtractCostBasisErrorResponse = extractCostBasisErrorResponse(th);
        if (costBasisErrorResponseExtractCostBasisErrorResponse != null && (errorDetails = costBasisErrorResponseExtractCostBasisErrorResponse.toErrorDetails()) != null) {
            return errorDetails;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new CostBasisErrorDetails(companion.invoke(C11048R.string.general_error_title, new Object[0]), companion.invoke(C11048R.string.general_error_summary, new Object[0]), companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, null, null, 56, null);
    }

    public static final CostBasisErrorResponse extractCostBasisErrorResponse(Throwable th) {
        Response<?> response;
        String strExtractErrorBodyString;
        CostBasisErrorWrapper costBasisErrorWrapperFromJson;
        Intrinsics.checkNotNullParameter(th, "<this>");
        try {
            HttpException httpException = (HttpException) Throwables.findCause(th, HttpException.class);
            if (httpException != null && (response = httpException.response()) != null && (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) != null && (costBasisErrorWrapperFromJson = errorAdapter.fromJson(strExtractErrorBodyString)) != null) {
                return validationErrorAdapter.fromJson(costBasisErrorWrapperFromJson.getMessage());
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
