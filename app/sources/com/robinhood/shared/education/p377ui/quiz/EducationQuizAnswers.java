package com.robinhood.shared.education.p377ui.quiz;

import android.content.Context;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer2;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationQuizAnswers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m3636d2 = {"getFeedbackColor", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "context", "Landroid/content/Context;", "feature-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.quiz.EducationQuizAnswersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationQuizAnswers {

    /* compiled from: EducationQuizAnswers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.quiz.EducationQuizAnswersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EducationQuizAnswer2.values().length];
            try {
                iArr[EducationQuizAnswer2.CORRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EducationQuizAnswer2.INCORRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EducationQuizAnswer2.UNSURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getFeedbackColor(EducationQuizAnswer educationQuizAnswer, Context context) {
        Intrinsics.checkNotNullParameter(educationQuizAnswer, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$0[educationQuizAnswer.getCorrectness().ordinal()];
        if (i == 1) {
            return context.getColor(C20690R.color.mobius_prime);
        }
        if (i == 2) {
            return context.getColor(C20690R.color.mobius_joule);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary);
    }
}
