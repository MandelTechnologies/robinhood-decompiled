package com.robinhood.android.pdfrenderer;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: PdfRendererStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererStore;", "", "fetchPdf", "Lkotlin/Result;", "Ljava/io/File;", "url", "", "directory", "fetchPdf-0E7RQCE", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PdfRendererStore {
    /* renamed from: fetchPdf-0E7RQCE, reason: not valid java name */
    Object mo17601fetchPdf0E7RQCE(String str, File file, Continuation<? super Result<? extends File>> continuation);
}
