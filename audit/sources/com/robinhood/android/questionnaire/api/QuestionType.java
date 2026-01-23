package com.robinhood.android.questionnaire.api;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuestionType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/QuestionType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "MULTIPLE_CHOICE", "MULTIPLE_RESPONSE", "INTEGER_QUESTION", "STRING_QUESTION", "OPTIONAL_INTEGER", "HYBRID_STRING_RESPONSE", "Companion", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class QuestionType implements RhEnum<QuestionType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuestionType[] $VALUES;
    private final String serverValue;
    public static final QuestionType MULTIPLE_CHOICE = new QuestionType("MULTIPLE_CHOICE", 0, "multiple_choice");
    public static final QuestionType MULTIPLE_RESPONSE = new QuestionType("MULTIPLE_RESPONSE", 1, "multiple_response");
    public static final QuestionType INTEGER_QUESTION = new QuestionType("INTEGER_QUESTION", 2, "integer_question");
    public static final QuestionType STRING_QUESTION = new QuestionType("STRING_QUESTION", 3, "string_question");
    public static final QuestionType OPTIONAL_INTEGER = new QuestionType("OPTIONAL_INTEGER", 4, "optional_integer_question");
    public static final QuestionType HYBRID_STRING_RESPONSE = new QuestionType("HYBRID_STRING_RESPONSE", 5, "hybrid_string_response");

    private static final /* synthetic */ QuestionType[] $values() {
        return new QuestionType[]{MULTIPLE_CHOICE, MULTIPLE_RESPONSE, INTEGER_QUESTION, STRING_QUESTION, OPTIONAL_INTEGER, HYBRID_STRING_RESPONSE};
    }

    public static EnumEntries<QuestionType> getEntries() {
        return $ENTRIES;
    }

    private QuestionType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        QuestionType[] questionTypeArr$values = $values();
        $VALUES = questionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(questionTypeArr$values);
        INSTANCE = new Companion(null);
    }

    public static QuestionType valueOf(String str) {
        return (QuestionType) Enum.valueOf(QuestionType.class, str);
    }

    public static QuestionType[] values() {
        return (QuestionType[]) $VALUES.clone();
    }
}
