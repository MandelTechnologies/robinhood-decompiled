package com.robinhood.shared.education.p377ui.overview;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationOverviewItemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationOverviewItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.overview.EducationOverviewItemView$bindings$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationOverviewItemView2 extends FunctionReferenceImpl implements Function1<View, MergeEducationOverviewItemBinding> {
    public static final EducationOverviewItemView2 INSTANCE = new EducationOverviewItemView2();

    EducationOverviewItemView2() {
        super(1, MergeEducationOverviewItemBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationOverviewItemBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationOverviewItemBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationOverviewItemBinding.bind(p0);
    }
}
