package com.robinhood.android.doc.serverdriven.pdfupload;

import android.net.Uri;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.shared.common.utilspdf.PdfReader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SddrPdfUploadDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$onCreate$1$fileSizeAsync$1", m3645f = "SddrPdfUploadDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$onCreate$1$fileSizeAsync$1, reason: use source file name */
/* loaded from: classes7.dex */
final class SddrPdfUploadDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SddrPdfUploadDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SddrPdfUploadDuxo2(SddrPdfUploadDuxo sddrPdfUploadDuxo, Continuation<? super SddrPdfUploadDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = sddrPdfUploadDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SddrPdfUploadDuxo2 sddrPdfUploadDuxo2 = new SddrPdfUploadDuxo2(this.this$0, continuation);
        sddrPdfUploadDuxo2.L$0 = obj;
        return sddrPdfUploadDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((SddrPdfUploadDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SddrPdfUploadDuxo sddrPdfUploadDuxo = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                PdfReader pdfReader = sddrPdfUploadDuxo.pdfReader;
                Uri uri = ((SddrDestination.PdfReview) SddrPdfUploadDuxo.INSTANCE.getArgs((HasSavedState) sddrPdfUploadDuxo)).getPdf().getUri();
                this.label = 1;
                obj = pdfReader.fileSize(uri, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(boxing.boxLong(((Number) obj).longValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        SddrPdfUploadDuxo sddrPdfUploadDuxo2 = this.this$0;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            sddrPdfUploadDuxo2.submit(sddrPdfUploadDuxo2.toErrorEvent(thM28553exceptionOrNullimpl));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }
}
