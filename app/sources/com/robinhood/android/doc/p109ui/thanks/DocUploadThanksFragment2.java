package com.robinhood.android.doc.p109ui.thanks;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadThanksBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadThanksFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.thanks.DocUploadThanksFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DocUploadThanksFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadThanksBinding> {
    public static final DocUploadThanksFragment2 INSTANCE = new DocUploadThanksFragment2();

    DocUploadThanksFragment2() {
        super(1, FragmentDocUploadThanksBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadThanksBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadThanksBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadThanksBinding.bind(p0);
    }
}
