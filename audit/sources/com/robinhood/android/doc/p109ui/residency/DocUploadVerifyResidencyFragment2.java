package com.robinhood.android.doc.p109ui.residency;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadVerifyResidencyBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadVerifyResidencyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.residency.DocUploadVerifyResidencyFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DocUploadVerifyResidencyFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadVerifyResidencyBinding> {
    public static final DocUploadVerifyResidencyFragment2 INSTANCE = new DocUploadVerifyResidencyFragment2();

    DocUploadVerifyResidencyFragment2() {
        super(1, FragmentDocUploadVerifyResidencyBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadVerifyResidencyBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadVerifyResidencyBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadVerifyResidencyBinding.bind(p0);
    }
}
