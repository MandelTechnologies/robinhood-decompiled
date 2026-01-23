package com.robinhood.android.pdfrenderer;

import com.robinhood.coroutines.dagger.annotation.IODispatcher;
import com.robinhood.networking.Calls3;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: PdfRendererStore.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererStoreImpl;", "Lcom/robinhood/android/pdfrenderer/PdfRendererStore;", "client", "Lokhttp3/OkHttpClient;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lokhttp3/OkHttpClient;Lkotlinx/coroutines/CoroutineDispatcher;)V", "fetchPdf", "Lkotlin/Result;", "Ljava/io/File;", "url", "", "directory", "fetchPdf-0E7RQCE", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPdfHelper", "fetchPdfHelper-0E7RQCE", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pdfrenderer.PdfRendererStoreImpl, reason: use source file name */
/* loaded from: classes11.dex */
public final class PdfRendererStore2 implements PdfRendererStore {
    public static final int $stable = 8;
    private final OkHttpClient client;
    private final CoroutineDispatcher ioDispatcher;

    public PdfRendererStore2(OkHttpClient client, @IODispatcher CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.client = client;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.pdfrenderer.PdfRendererStore
    /* renamed from: fetchPdf-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo17601fetchPdf0E7RQCE(String str, File file, Continuation<? super Result<? extends File>> continuation) {
        PdfRendererStore3 pdfRendererStore3;
        Object objM17603fetchPdfHelper0E7RQCE;
        if (continuation instanceof PdfRendererStore3) {
            pdfRendererStore3 = (PdfRendererStore3) continuation;
            int i = pdfRendererStore3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdfRendererStore3.label = i - Integer.MIN_VALUE;
            } else {
                pdfRendererStore3 = new PdfRendererStore3(this, continuation);
            }
        }
        Object obj = pdfRendererStore3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pdfRendererStore3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            pdfRendererStore3.label = 1;
            objM17603fetchPdfHelper0E7RQCE = m17603fetchPdfHelper0E7RQCE(str, file, pdfRendererStore3);
            if (objM17603fetchPdfHelper0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM17603fetchPdfHelper0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM17603fetchPdfHelper0E7RQCE);
        if (thM28553exceptionOrNullimpl != null) {
            CrashReporter.INSTANCE.reportNonFatal(thM28553exceptionOrNullimpl, false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
        }
        return objM17603fetchPdfHelper0E7RQCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* renamed from: fetchPdfHelper-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17603fetchPdfHelper0E7RQCE(String str, File file, Continuation<? super Result<? extends File>> continuation) {
        PdfRendererStore4 pdfRendererStore4;
        File file2;
        PdfRendererStore2 pdfRendererStore2;
        Response response;
        ?? r2;
        Throwable th;
        if (continuation instanceof PdfRendererStore4) {
            pdfRendererStore4 = (PdfRendererStore4) continuation;
            int i = pdfRendererStore4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdfRendererStore4.label = i - Integer.MIN_VALUE;
            } else {
                pdfRendererStore4 = new PdfRendererStore4(this, continuation);
            }
        }
        Object objAwait = pdfRendererStore4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pdfRendererStore4.label;
        try {
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(objAwait);
                        Result.Companion companion = Result.INSTANCE;
                        Call callNewCall = this.client.newCall(new Request.Builder().url(str).build());
                        file2 = file;
                        pdfRendererStore4.L$0 = file2;
                        pdfRendererStore4.L$1 = this;
                        pdfRendererStore4.label = 1;
                        objAwait = Calls3.await(callNewCall, pdfRendererStore4);
                        if (objAwait == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pdfRendererStore2 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r2 = (Closeable) pdfRendererStore4.L$0;
                            try {
                                ResultKt.throwOnFailure(objAwait);
                                r2 = r2;
                                File file3 = (File) objAwait;
                                kotlin.p481io.Closeable.closeFinally(r2, null);
                                return Result.m28550constructorimpl(file3);
                            } catch (Throwable th2) {
                                th = th2;
                                response = r2;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    kotlin.p481io.Closeable.closeFinally(response, th);
                                    throw th3;
                                }
                            }
                        }
                        PdfRendererStore2 pdfRendererStore22 = (PdfRendererStore2) pdfRendererStore4.L$1;
                        File file4 = (File) pdfRendererStore4.L$0;
                        ResultKt.throwOnFailure(objAwait);
                        pdfRendererStore2 = pdfRendererStore22;
                        file2 = file4;
                    }
                    ResponseBody body = response.getBody();
                    if (!response.isSuccessful() || body == null) {
                        throw new IOException("Failed to load PDF");
                    }
                    MediaType mediaType = body.get$contentType();
                    if (!Intrinsics.areEqual(mediaType != null ? mediaType.getType() : null, "application") || !Intrinsics.areEqual(mediaType.getSubtype(), "pdf")) {
                        CrashReporter.INSTANCE.reportNonFatal(new IllegalArgumentException("Wrong content type loaded, expected application/pdf"), true, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
                    }
                    CoroutineDispatcher coroutineDispatcher = pdfRendererStore2.ioDispatcher;
                    PdfRendererStore5 pdfRendererStore5 = new PdfRendererStore5(file2, body, null);
                    pdfRendererStore4.L$0 = response;
                    pdfRendererStore4.L$1 = null;
                    pdfRendererStore4.label = 2;
                    objAwait = BuildersKt.withContext(coroutineDispatcher, pdfRendererStore5, pdfRendererStore4);
                    if (objAwait != coroutine_suspended) {
                        r2 = response;
                        File file32 = (File) objAwait;
                        kotlin.p481io.Closeable.closeFinally(r2, null);
                        return Result.m28550constructorimpl(file32);
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    throw th;
                }
                response = (Response) objAwait;
            } catch (Exception e) {
                throw new IOException("Failed to load PDF", e);
            }
        } catch (Throwable th5) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th5));
        }
    }
}
