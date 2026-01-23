package com.robinhood.android.pdfrenderer;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PdfRendererStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.PdfRendererStoreImpl", m3645f = "PdfRendererStore.kt", m3646l = {51, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "fetchPdfHelper-0E7RQCE")
/* renamed from: com.robinhood.android.pdfrenderer.PdfRendererStoreImpl$fetchPdfHelper$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PdfRendererStore4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PdfRendererStore2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfRendererStore4(PdfRendererStore2 pdfRendererStore2, Continuation<? super PdfRendererStore4> continuation) {
        super(continuation);
        this.this$0 = pdfRendererStore2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM17603fetchPdfHelper0E7RQCE = this.this$0.m17603fetchPdfHelper0E7RQCE(null, null, this);
        return objM17603fetchPdfHelper0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM17603fetchPdfHelper0E7RQCE : Result.m28549boximpl(objM17603fetchPdfHelper0E7RQCE);
    }
}
