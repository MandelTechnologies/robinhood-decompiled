package com.robinhood.shared.education.p377ui.overview;

import android.view.View;
import com.robinhood.shared.education.databinding.FragmentEducationOverviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationOverviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationOverviewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEducationOverviewBinding> {
    public static final EducationOverviewFragment2 INSTANCE = new EducationOverviewFragment2();

    EducationOverviewFragment2() {
        super(1, FragmentEducationOverviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/FragmentEducationOverviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEducationOverviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEducationOverviewBinding.bind(p0);
    }
}
