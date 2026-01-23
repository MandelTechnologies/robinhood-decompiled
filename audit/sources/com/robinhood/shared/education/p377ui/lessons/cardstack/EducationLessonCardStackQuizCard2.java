package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationLessonCardStackQuizCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonCardStackQuizCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackQuizCard$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationLessonCardStackQuizCard2 extends FunctionReferenceImpl implements Function1<View, MergeEducationLessonCardStackQuizCardBinding> {
    public static final EducationLessonCardStackQuizCard2 INSTANCE = new EducationLessonCardStackQuizCard2();

    EducationLessonCardStackQuizCard2() {
        super(1, MergeEducationLessonCardStackQuizCardBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationLessonCardStackQuizCardBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationLessonCardStackQuizCardBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationLessonCardStackQuizCardBinding.bind(p0);
    }
}
