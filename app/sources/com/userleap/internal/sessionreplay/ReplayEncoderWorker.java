package com.userleap.internal.sessionreplay;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import sprig.graphics.C49013e;
import sprig.graphics.C49027s;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m3636d2 = {"Lcom/userleap/internal/sessionreplay/ReplayEncoderWorker;", "Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsprig/g/a;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Lsprig/g/a;", "logger", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "b", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ReplayEncoderWorker extends CoroutineWorker {

    /* renamed from: a, reason: from kotlin metadata */
    private final C49029a logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayEncoderWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.logger = new C49029a();
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) throws Throwable {
        Object objM28550constructorimpl;
        ListenableWorker.Result resultFailure;
        List list;
        Data inputData = getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
        String strM4171a = C49013e.m4171a(inputData, "directory");
        if (strM4171a == null) {
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure2, "failure()");
            return resultFailure2;
        }
        File file = new File(strM4171a);
        try {
            Result.Companion companion = Result.INSTANCE;
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles()");
                list = ArraysKt.toList(fileArrListFiles);
            } else {
                list = null;
            }
            objM28550constructorimpl = Result.m28550constructorimpl(list);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            C49029a.m4295a(this.logger, "ReplayEncoderWorker: Error loading files", null, "Error loading files: " + thM28553exceptionOrNullimpl, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, 50, null);
        }
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
            objM28550constructorimpl = CollectionsKt.emptyList();
        }
        List<? extends File> list2 = (List) objM28550constructorimpl;
        if (list2 == null || list2.isEmpty()) {
            C49029a.m4295a(this.logger, "ReplayEncoderWorker: No files to encode", null, null, null, null, null, 62, null);
            FilesKt.deleteRecursively(file);
            ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure3, "failure()");
            return resultFailure3;
        }
        File file2 = new File(file, "recording.mp4");
        C49027s c49027s = new C49027s();
        String path = file2.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "output.path");
        Object objM4288a = c49027s.m4288a(path, list2);
        Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM4288a);
        if (thM28553exceptionOrNullimpl2 == null) {
            Tuples2[] tuples2Arr = {Tuples4.m3642to("file name", file2.getPath())};
            Data.Builder builder = new Data.Builder();
            Tuples2 tuples2 = tuples2Arr[0];
            builder.put((String) tuples2.getFirst(), tuples2.getSecond());
            Data dataBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
            resultFailure = ListenableWorker.Result.success(dataBuild);
        } else {
            C49029a.m4295a(this.logger, "ReplayEncoderWorker: Error encoding", null, "Error encoding: " + thM28553exceptionOrNullimpl2, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl2), null, null, 50, null);
            FilesKt.deleteRecursively(file);
            resultFailure = ListenableWorker.Result.failure();
        }
        Intrinsics.checkNotNullExpressionValue(resultFailure, "VideoEncoder().encode(ou…)\n            }\n        )");
        return resultFailure;
    }
}
