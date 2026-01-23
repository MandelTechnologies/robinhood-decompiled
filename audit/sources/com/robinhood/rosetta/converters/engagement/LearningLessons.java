package com.robinhood.rosetta.converters.engagement;

import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LearningLessons.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/EducationSeries;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSeries;", "Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson;", "isOnCompletionPage", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.engagement.LearningLessonsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class LearningLessons {
    public static final EducationSeries toProtobuf(com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSeries educationSeries) {
        Intrinsics.checkNotNullParameter(educationSeries, "<this>");
        return new EducationSeries(educationSeries.getAnalyticsId(), educationSeries.getTitle(), null, 4, null);
    }

    public static final LearningLesson toProtobuf(EducationLesson educationLesson, boolean z) {
        Intrinsics.checkNotNullParameter(educationLesson, "<this>");
        return new LearningLesson(educationLesson.getIdentifier(), educationLesson.getTitle(), educationLesson.isCompleted() || z, educationLesson.getVersion(), null, 16, null);
    }

    public static final LearningLesson toProtobuf(EducationLessonPreview educationLessonPreview, boolean z) {
        Intrinsics.checkNotNullParameter(educationLessonPreview, "<this>");
        return new LearningLesson(educationLessonPreview.getIdentifier(), educationLessonPreview.getTitle(), educationLessonPreview.isChecked() || z, educationLessonPreview.getVersion(), null, 16, null);
    }
}
