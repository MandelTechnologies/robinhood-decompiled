package com.robinhood.android.futures.onboarding.p145ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuestionnaireFlow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/QuestionnaireFlow;", "", "<init>", "(Ljava/lang/String;I)V", "US_FUTURES_SUITABILITY", "UK_FUTURES_SUITABILITY", "UK_KNOWLEDGE_QUIZ", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class QuestionnaireFlow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuestionnaireFlow[] $VALUES;
    public static final QuestionnaireFlow US_FUTURES_SUITABILITY = new QuestionnaireFlow("US_FUTURES_SUITABILITY", 0);
    public static final QuestionnaireFlow UK_FUTURES_SUITABILITY = new QuestionnaireFlow("UK_FUTURES_SUITABILITY", 1);
    public static final QuestionnaireFlow UK_KNOWLEDGE_QUIZ = new QuestionnaireFlow("UK_KNOWLEDGE_QUIZ", 2);

    private static final /* synthetic */ QuestionnaireFlow[] $values() {
        return new QuestionnaireFlow[]{US_FUTURES_SUITABILITY, UK_FUTURES_SUITABILITY, UK_KNOWLEDGE_QUIZ};
    }

    public static EnumEntries<QuestionnaireFlow> getEntries() {
        return $ENTRIES;
    }

    private QuestionnaireFlow(String str, int i) {
    }

    static {
        QuestionnaireFlow[] questionnaireFlowArr$values = $values();
        $VALUES = questionnaireFlowArr$values;
        $ENTRIES = EnumEntries2.enumEntries(questionnaireFlowArr$values);
    }

    public static QuestionnaireFlow valueOf(String str) {
        return (QuestionnaireFlow) Enum.valueOf(QuestionnaireFlow.class, str);
    }

    public static QuestionnaireFlow[] values() {
        return (QuestionnaireFlow[]) $VALUES.clone();
    }
}
