package com.robinhood.shared.education.p377ui.home;

import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationHomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class EducationHomeFragment$ComposeContent$1$1$1$1 extends FunctionReferenceImpl implements Function1<EducationLessonPreview, Unit> {
    EducationHomeFragment$ComposeContent$1$1$1$1(Object obj) {
        super(1, obj, EducationHomeFragment.class, "onLessonCardClick", "onLessonCardClick(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EducationLessonPreview educationLessonPreview) {
        invoke2(educationLessonPreview);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EducationLessonPreview p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EducationHomeFragment) this.receiver).onLessonCardClick(p0);
    }
}
