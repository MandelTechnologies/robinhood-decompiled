package com.robinhood.shared.education.p377ui.quiz;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationQuizViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationQuizView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.quiz.EducationQuizView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationQuizView2 extends FunctionReferenceImpl implements Function1<View, MergeEducationQuizViewBinding> {
    public static final EducationQuizView2 INSTANCE = new EducationQuizView2();

    EducationQuizView2() {
        super(1, MergeEducationQuizViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationQuizViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationQuizViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationQuizViewBinding.bind(p0);
    }
}
