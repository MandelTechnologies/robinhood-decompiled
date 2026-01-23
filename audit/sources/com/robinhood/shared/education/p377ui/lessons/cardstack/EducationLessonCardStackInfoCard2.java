package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationLessonCardStackInfoCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonCardStackInfoCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackInfoCard$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationLessonCardStackInfoCard2 extends FunctionReferenceImpl implements Function1<View, MergeEducationLessonCardStackInfoCardBinding> {
    public static final EducationLessonCardStackInfoCard2 INSTANCE = new EducationLessonCardStackInfoCard2();

    EducationLessonCardStackInfoCard2() {
        super(1, MergeEducationLessonCardStackInfoCardBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationLessonCardStackInfoCardBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationLessonCardStackInfoCardBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationLessonCardStackInfoCardBinding.bind(p0);
    }
}
