package com.robinhood.android.doc.p109ui;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadSelectOriginBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadSelectOriginFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DocUploadSelectOriginFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadSelectOriginBinding> {
    public static final DocUploadSelectOriginFragment2 INSTANCE = new DocUploadSelectOriginFragment2();

    DocUploadSelectOriginFragment2() {
        super(1, FragmentDocUploadSelectOriginBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectOriginBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadSelectOriginBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadSelectOriginBinding.bind(p0);
    }
}
