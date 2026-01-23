package com.robinhood.shared.education.p377ui;

import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationSeriesLessonsCarouselView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.EducationSeriesLessonsCarouselView$Content$1$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EducationSeriesLessonsCarouselView3 extends FunctionReferenceImpl implements Function1<EducationLessonPreview, Unit> {
    EducationSeriesLessonsCarouselView3(Object obj) {
        super(1, obj, EducationSeriesLessonsCarouselView.class, "onLessonCardClick", "onLessonCardClick(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EducationLessonPreview educationLessonPreview) {
        invoke2(educationLessonPreview);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EducationLessonPreview p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EducationSeriesLessonsCarouselView) this.receiver).onLessonCardClick(p0);
    }
}
