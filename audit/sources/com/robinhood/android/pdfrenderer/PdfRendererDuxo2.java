package com.robinhood.android.pdfrenderer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PdfRendererDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pdfrenderer/PdfRendererDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.PdfRendererDuxo$onCreate$1$1$1$1", m3645f = "PdfRendererDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pdfrenderer.PdfRendererDuxo$onCreate$1$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PdfRendererDuxo2 extends ContinuationImpl7 implements Function2<PdfRendererDataState, Continuation<? super PdfRendererDataState>, Object> {
    final /* synthetic */ RhPdfRenderer $rhPdfRenderer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdfRendererDuxo2(RhPdfRenderer rhPdfRenderer, Continuation<? super PdfRendererDuxo2> continuation) {
        super(2, continuation);
        this.$rhPdfRenderer = rhPdfRenderer;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PdfRendererDuxo2 pdfRendererDuxo2 = new PdfRendererDuxo2(this.$rhPdfRenderer, continuation);
        pdfRendererDuxo2.L$0 = obj;
        return pdfRendererDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PdfRendererDataState pdfRendererDataState, Continuation<? super PdfRendererDataState> continuation) {
        return ((PdfRendererDuxo2) create(pdfRendererDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PdfRendererDataState.copy$default((PdfRendererDataState) this.L$0, null, this.$rhPdfRenderer, 1, null);
    }
}
