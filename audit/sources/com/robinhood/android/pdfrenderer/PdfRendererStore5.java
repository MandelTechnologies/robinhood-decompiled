package com.robinhood.android.pdfrenderer;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.JvmOkio2;
import okio.Okio;

/* compiled from: PdfRendererStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.PdfRendererStoreImpl$fetchPdfHelper$2$1$1", m3645f = "PdfRendererStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pdfrenderer.PdfRendererStoreImpl$fetchPdfHelper$2$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PdfRendererStore5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ ResponseBody $body;
    final /* synthetic */ File $directory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfRendererStore5(File file, ResponseBody responseBody, Continuation<? super PdfRendererStore5> continuation) {
        super(2, continuation);
        this.$directory = file;
        this.$body = responseBody;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PdfRendererStore5(this.$directory, this.$body, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((PdfRendererStore5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        File fileCreateTempFile = File.createTempFile("download-", ".pdf", this.$directory);
        Intrinsics.checkNotNull(fileCreateTempFile);
        BufferedSink bufferedSinkBuffer = Okio.buffer(JvmOkio2.sink$default(fileCreateTempFile, false, 1, null));
        try {
            bufferedSinkBuffer.writeAll(this.$body.getBodySource());
            Closeable.closeFinally(bufferedSinkBuffer, null);
            return fileCreateTempFile;
        } finally {
        }
    }
}
