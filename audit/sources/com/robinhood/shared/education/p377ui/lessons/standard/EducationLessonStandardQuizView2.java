package com.robinhood.shared.education.p377ui.lessons.standard;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationLessonStandardSectionQuizViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonStandardQuizView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardQuizView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationLessonStandardQuizView2 extends FunctionReferenceImpl implements Function1<View, MergeEducationLessonStandardSectionQuizViewBinding> {
    public static final EducationLessonStandardQuizView2 INSTANCE = new EducationLessonStandardQuizView2();

    EducationLessonStandardQuizView2() {
        super(1, MergeEducationLessonStandardSectionQuizViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardSectionQuizViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationLessonStandardSectionQuizViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationLessonStandardSectionQuizViewBinding.bind(p0);
    }
}
