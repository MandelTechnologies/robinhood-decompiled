package com.robinhood.android.doc.serverdriven.pdfupload;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadReviewPdfBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrPdfUploadFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class SddrPdfUploadFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadReviewPdfBinding> {
    public static final SddrPdfUploadFragment2 INSTANCE = new SddrPdfUploadFragment2();

    SddrPdfUploadFragment2() {
        super(1, FragmentDocUploadReviewPdfBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPdfBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadReviewPdfBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadReviewPdfBinding.bind(p0);
    }
}
