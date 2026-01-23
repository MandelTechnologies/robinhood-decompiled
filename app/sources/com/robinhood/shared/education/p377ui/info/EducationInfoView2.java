package com.robinhood.shared.education.p377ui.info;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationInfoViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationInfoView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.info.EducationInfoView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationInfoView2 extends FunctionReferenceImpl implements Function1<View, MergeEducationInfoViewBinding> {
    public static final EducationInfoView2 INSTANCE = new EducationInfoView2();

    EducationInfoView2() {
        super(1, MergeEducationInfoViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationInfoViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationInfoViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationInfoViewBinding.bind(p0);
    }
}
