package com.robinhood.android.doc.p109ui.photo;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadReviewPhotoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadReviewPhotoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPhotoFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DocUploadReviewPhotoFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadReviewPhotoBinding> {
    public static final DocUploadReviewPhotoFragment2 INSTANCE = new DocUploadReviewPhotoFragment2();

    DocUploadReviewPhotoFragment2() {
        super(1, FragmentDocUploadReviewPhotoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPhotoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadReviewPhotoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadReviewPhotoBinding.bind(p0);
    }
}
