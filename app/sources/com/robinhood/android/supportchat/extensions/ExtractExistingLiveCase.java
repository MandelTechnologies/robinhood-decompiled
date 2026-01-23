package com.robinhood.android.supportchat.extensions;

import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: ExtractExistingLiveCase.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"tryParseHttpError", "T", "", "expectedCode", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "(Ljava/lang/Throwable;ILcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.extensions.ExtractExistingLiveCaseKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ExtractExistingLiveCase {
    public static /* synthetic */ Object tryParseHttpError$default(Throwable th, int i, JsonAdapter adapter, int i2, Object obj) throws IOException {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        Object objM28550constructorimpl;
        if ((i2 & 1) != 0) {
            i = 400;
        }
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
        if (httpException == null || httpException.code() != i || (response = httpException.response()) == null || (responseBodyErrorBody = response.errorBody()) == null) {
            return null;
        }
        String strString = responseBodyErrorBody.string();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(adapter.fromJson(strString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }

    public static final /* synthetic */ <T> T tryParseHttpError(Throwable th, int i, JsonAdapter<T> adapter) throws IOException {
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
        if (httpException == null || httpException.code() != i || (response = httpException.response()) == null || (responseBodyErrorBody = response.errorBody()) == null) {
            return null;
        }
        String strString = responseBodyErrorBody.string();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(adapter.fromJson(strString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return (T) objM28550constructorimpl;
    }
}
