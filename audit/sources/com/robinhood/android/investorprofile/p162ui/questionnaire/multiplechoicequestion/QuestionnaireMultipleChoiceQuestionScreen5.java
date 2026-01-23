package com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuestionnaireMultipleChoiceQuestionScreen.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/multiplechoicequestion/Style;", "", "<init>", "(Ljava/lang/String;I)V", "RADIO_BUTTON", "ROW", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.Style, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireMultipleChoiceQuestionScreen5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuestionnaireMultipleChoiceQuestionScreen5[] $VALUES;
    public static final QuestionnaireMultipleChoiceQuestionScreen5 RADIO_BUTTON = new QuestionnaireMultipleChoiceQuestionScreen5("RADIO_BUTTON", 0);
    public static final QuestionnaireMultipleChoiceQuestionScreen5 ROW = new QuestionnaireMultipleChoiceQuestionScreen5("ROW", 1);

    private static final /* synthetic */ QuestionnaireMultipleChoiceQuestionScreen5[] $values() {
        return new QuestionnaireMultipleChoiceQuestionScreen5[]{RADIO_BUTTON, ROW};
    }

    public static EnumEntries<QuestionnaireMultipleChoiceQuestionScreen5> getEntries() {
        return $ENTRIES;
    }

    private QuestionnaireMultipleChoiceQuestionScreen5(String str, int i) {
    }

    static {
        QuestionnaireMultipleChoiceQuestionScreen5[] questionnaireMultipleChoiceQuestionScreen5Arr$values = $values();
        $VALUES = questionnaireMultipleChoiceQuestionScreen5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(questionnaireMultipleChoiceQuestionScreen5Arr$values);
    }

    public static QuestionnaireMultipleChoiceQuestionScreen5 valueOf(String str) {
        return (QuestionnaireMultipleChoiceQuestionScreen5) Enum.valueOf(QuestionnaireMultipleChoiceQuestionScreen5.class, str);
    }

    public static QuestionnaireMultipleChoiceQuestionScreen5[] values() {
        return (QuestionnaireMultipleChoiceQuestionScreen5[]) $VALUES.clone();
    }
}
