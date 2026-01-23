package com.userleap.internal.sessionreplay;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.singular.sdk.internal.Constants;
import com.userleap.SprigIdlingResource;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.FilesKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONException;
import sprig.graphics.C49013e;
import sprig.graphics.C49026r;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0004B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m3636d2 = {"Lcom/userleap/internal/sessionreplay/UploadWorker;", "Landroidx/work/CoroutineWorker;", "Lkotlin/Result;", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()Ljava/lang/Object;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsprig/g/a;", "Lsprig/g/a;", "logger", "Lsprig/e/r;", "b", "Lsprig/e/r;", "uploadUrlManager", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "c", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class UploadWorker extends CoroutineWorker {

    /* renamed from: a, reason: from kotlin metadata */
    private C49029a logger;

    /* renamed from: b, reason: from kotlin metadata */
    private C49026r uploadUrlManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.logger = new C49029a();
        this.uploadUrlManager = new C49026r();
    }

    /* renamed from: a */
    private final Object m3207a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Data inputData = getInputData();
            Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
            String strM4171a = C49013e.m4171a(inputData, "directory");
            return Result.m28550constructorimpl(strM4171a != null ? Boolean.valueOf(FilesKt.deleteRecursively(new File(strM4171a))) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) throws JSONException {
        Object objM28550constructorimpl;
        Data inputData = getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
        String strM4171a = C49013e.m4171a(inputData, "file name");
        if (strM4171a == null) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure, "failure()");
            return resultFailure;
        }
        Data inputData2 = getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData2, "inputData");
        String strM4171a2 = C49013e.m4171a(inputData2, "upload URL");
        if (strM4171a2 == null) {
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure2, "failure()");
            return resultFailure2;
        }
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("sprig_upload_data", 0);
        int i = sharedPreferences.getInt(strM4171a2, 1);
        if (i > 5) {
            m3207a();
            C49029a.m4295a(this.logger, "UploadWorker: Invalid URL or too many attempts", null, "URL payload: " + strM4171a2 + ", attempt: " + i, null, null, null, 58, null);
            ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure3, "failure()");
            return resultFailure3;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (!new File(strM4171a).exists()) {
            C49029a.m4295a(this.logger, "UploadWorker: File does not exist", null, "File does not exist at path " + strM4171a, null, null, null, 58, null);
            ListenableWorker.Result resultFailure4 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure4, "failure()");
            return resultFailure4;
        }
        objM28550constructorimpl = Result.m28550constructorimpl(RequestBody.INSTANCE.create(new File(strM4171a), MediaType.INSTANCE.get("video/mp4")));
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        RequestBody requestBody = (RequestBody) objM28550constructorimpl;
        if (requestBody == null) {
            m3207a();
            C49029a.m4295a(this.logger, "UploadWorker: Failed to prepare upload", null, "Failed to prepare upload for file at path " + strM4171a, null, null, null, 58, null);
            ListenableWorker.Result resultFailure5 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure5, "failure()");
            return resultFailure5;
        }
        if (!new OkHttpClient().newCall(new Request.Builder().url(this.uploadUrlManager.m4277a(strM4171a2)).put(requestBody).build()).execute().isSuccessful()) {
            sharedPreferences.edit().putInt(strM4171a2, i + 1).apply();
            ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
            Intrinsics.checkNotNullExpressionValue(resultRetry, "{\n            prefs.edit…        retry()\n        }");
            return resultRetry;
        }
        m3207a();
        SprigIdlingResource sprigIdlingResource = SprigIdlingResource.INSTANCE;
        if (!sprigIdlingResource.getSessionReplayExportIdlingResource().isIdleNow()) {
            sprigIdlingResource.getSessionReplayExportIdlingResource().decrement();
        }
        Log.i("UploadWorker", "!! UPLOAD FILE SUCCESS !!");
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "{\n            deleteReco…      success()\n        }");
        return resultSuccess;
    }
}
