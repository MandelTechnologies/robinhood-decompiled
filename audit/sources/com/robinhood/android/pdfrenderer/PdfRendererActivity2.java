package com.robinhood.android.pdfrenderer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PdfRendererActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pdfrenderer.PdfRendererActivity$onCreate$1$1$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PdfRendererActivity2 extends FunctionReferenceImpl implements Function0<Unit> {
    PdfRendererActivity2(Object obj) {
        super(0, obj, PdfRendererActivity.class, "finish", "finish()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PdfRendererActivity) this.receiver).finish();
    }
}
