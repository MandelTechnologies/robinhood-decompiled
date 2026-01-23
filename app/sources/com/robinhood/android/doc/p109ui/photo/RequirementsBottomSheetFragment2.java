package com.robinhood.android.doc.p109ui.photo;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadRequirementsBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequirementsBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.photo.RequirementsBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RequirementsBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadRequirementsBottomSheetBinding> {
    public static final RequirementsBottomSheetFragment2 INSTANCE = new RequirementsBottomSheetFragment2();

    RequirementsBottomSheetFragment2() {
        super(1, FragmentDocUploadRequirementsBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadRequirementsBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadRequirementsBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadRequirementsBottomSheetBinding.bind(p0);
    }
}
