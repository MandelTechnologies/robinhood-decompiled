package com.robinhood.shared.education.p377ui.quiz;

import com.robinhood.shared.education.C38790R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EducationQuizViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/HintViewState;", "", "hintTextRes", "", "isTextVisible", "", "isArrowVisible", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;ZZ)V", "getHintTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "GONE", "SWIPE_TO_REVEAL_ANSWER", "CONTINUE", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.quiz.HintViewState, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationQuizViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EducationQuizViewState2[] $VALUES;
    private final Integer hintTextRes;
    private final boolean isArrowVisible;
    private final boolean isTextVisible;
    public static final EducationQuizViewState2 GONE = new EducationQuizViewState2("GONE", 0, null, false, false);
    public static final EducationQuizViewState2 SWIPE_TO_REVEAL_ANSWER = new EducationQuizViewState2("SWIPE_TO_REVEAL_ANSWER", 1, Integer.valueOf(C38790R.string.education_lesson_quiz_swipe_to_reveal_answer), true, false);
    public static final EducationQuizViewState2 CONTINUE = new EducationQuizViewState2("CONTINUE", 2, Integer.valueOf(C38790R.string.education_lesson_quiz_swipe_to_continue), true, true);

    private static final /* synthetic */ EducationQuizViewState2[] $values() {
        return new EducationQuizViewState2[]{GONE, SWIPE_TO_REVEAL_ANSWER, CONTINUE};
    }

    public static EnumEntries<EducationQuizViewState2> getEntries() {
        return $ENTRIES;
    }

    private EducationQuizViewState2(String str, int i, Integer num, boolean z, boolean z2) {
        this.hintTextRes = num;
        this.isTextVisible = z;
        this.isArrowVisible = z2;
    }

    public final Integer getHintTextRes() {
        return this.hintTextRes;
    }

    /* renamed from: isTextVisible, reason: from getter */
    public final boolean getIsTextVisible() {
        return this.isTextVisible;
    }

    /* renamed from: isArrowVisible, reason: from getter */
    public final boolean getIsArrowVisible() {
        return this.isArrowVisible;
    }

    static {
        EducationQuizViewState2[] educationQuizViewState2Arr$values = $values();
        $VALUES = educationQuizViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(educationQuizViewState2Arr$values);
    }

    public static EducationQuizViewState2 valueOf(String str) {
        return (EducationQuizViewState2) Enum.valueOf(EducationQuizViewState2.class, str);
    }

    public static EducationQuizViewState2[] values() {
        return (EducationQuizViewState2[]) $VALUES.clone();
    }
}
