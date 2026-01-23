package com.robinhood.android.doc.serverdriven.capture;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadCaptureDocumentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrCaptureFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class SddrCaptureFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadCaptureDocumentBinding> {
    public static final SddrCaptureFragment2 INSTANCE = new SddrCaptureFragment2();

    SddrCaptureFragment2() {
        super(1, FragmentDocUploadCaptureDocumentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadCaptureDocumentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadCaptureDocumentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadCaptureDocumentBinding.bind(p0);
    }
}
