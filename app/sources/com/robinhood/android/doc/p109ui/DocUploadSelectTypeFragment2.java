package com.robinhood.android.doc.p109ui;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadSelectTypeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadSelectTypeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.DocUploadSelectTypeFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DocUploadSelectTypeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadSelectTypeBinding> {
    public static final DocUploadSelectTypeFragment2 INSTANCE = new DocUploadSelectTypeFragment2();

    DocUploadSelectTypeFragment2() {
        super(1, FragmentDocUploadSelectTypeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectTypeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadSelectTypeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadSelectTypeBinding.bind(p0);
    }
}
