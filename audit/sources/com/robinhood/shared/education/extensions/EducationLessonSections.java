package com.robinhood.shared.education.extensions;

import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.utils.extensions.Doubles2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonSections.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/LearningSection;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection;", "sectionPosition", "", "sectionsCount", "feature-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.extensions.EducationLessonSectionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationLessonSections {
    public static final LearningSection toProtobuf(EducationLessonSection educationLessonSection, int i, int i2) {
        Intrinsics.checkNotNullParameter(educationLessonSection, "<this>");
        return new LearningSection(educationLessonSection.getId(), educationLessonSection.getTitle(), Doubles2.round(i / i2, 2), null, 8, null);
    }
}
