package com.robinhood.shared.common.utilspdf;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PdfReader.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J.\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/common/utilspdf/PdfReader;", "", "numPages", "", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileSize", "", "loadPdf", "Landroid/graphics/Bitmap;", "pageIndex", "pageWidth", "pageHeight", "(Landroid/net/Uri;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-utils-pdf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface PdfReader {
    Object fileSize(Uri uri, Continuation<? super Long> continuation);

    Object loadPdf(Uri uri, int i, int i2, int i3, Continuation<? super Bitmap> continuation);

    Object numPages(Uri uri, Continuation<? super Integer> continuation);
}
