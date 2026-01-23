package com.robinhood.shared.education.p377ui.lessons.standard;

import android.view.View;
import com.robinhood.shared.education.databinding.MergeEducationLessonStandardSectionTimelineViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonStandardTimelineView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardTimelineView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationLessonStandardTimelineView2 extends FunctionReferenceImpl implements Function1<View, MergeEducationLessonStandardSectionTimelineViewBinding> {
    public static final EducationLessonStandardTimelineView2 INSTANCE = new EducationLessonStandardTimelineView2();

    EducationLessonStandardTimelineView2() {
        super(1, MergeEducationLessonStandardSectionTimelineViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardSectionTimelineViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEducationLessonStandardSectionTimelineViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEducationLessonStandardSectionTimelineViewBinding.bind(p0);
    }
}
