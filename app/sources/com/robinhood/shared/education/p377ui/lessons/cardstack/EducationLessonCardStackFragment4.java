package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.view.View;
import com.robinhood.shared.education.databinding.FragmentEducationLessonCardStackBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonCardStackFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationLessonCardStackFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentEducationLessonCardStackBinding> {
    public static final EducationLessonCardStackFragment4 INSTANCE = new EducationLessonCardStackFragment4();

    EducationLessonCardStackFragment4() {
        super(1, FragmentEducationLessonCardStackBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/FragmentEducationLessonCardStackBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEducationLessonCardStackBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEducationLessonCardStackBinding.bind(p0);
    }
}
