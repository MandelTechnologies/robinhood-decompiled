package com.robinhood.shared.education;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationLessonPreviews.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toFragmentKeyOrNull", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "source", "", "lib-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.education.EducationLessonPreviewsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationLessonPreviews {

    /* compiled from: EducationLessonPreviews.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.EducationLessonPreviewsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EducationLesson.LessonTemplateType.values().length];
            try {
                iArr[EducationLesson.LessonTemplateType.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EducationLesson.LessonTemplateType.CARD_STACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FragmentKey toFragmentKeyOrNull(EducationLessonPreview educationLessonPreview, String source) {
        EducationLesson.LessonTemplateType lessonTemplateType;
        Object next;
        Intrinsics.checkNotNullParameter(educationLessonPreview, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (educationLessonPreview.getVersion() != 3) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Education lesson version " + educationLessonPreview.getVersion() + " is not supported"), false, null, 4, null);
            return null;
        }
        List<EducationLesson.LessonTemplateType> templates = educationLessonPreview.getTemplates();
        if (templates != null) {
            Iterator<T> it = templates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((EducationLesson.LessonTemplateType) next) != EducationLesson.LessonTemplateType.UNKNOWN) {
                    break;
                }
            }
            lessonTemplateType = (EducationLesson.LessonTemplateType) next;
        } else {
            lessonTemplateType = null;
        }
        int i = lessonTemplateType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lessonTemplateType.ordinal()];
        if (i == 1) {
            return new EducationLessonFragmentKeys2(educationLessonPreview.getSysId(), source);
        }
        if (i != 2) {
            return null;
        }
        return new EducationLessonFragmentKeys(educationLessonPreview.getSysId(), source);
    }
}
