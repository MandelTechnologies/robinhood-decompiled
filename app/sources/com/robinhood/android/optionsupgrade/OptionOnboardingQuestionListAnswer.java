package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingQuestionListAnswerComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionListAnswer;", "T", "", "answerResId", "", "answer", "<init>", "(ILjava/lang/Object;)V", "getAnswerResId", "()I", "getAnswer", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionListAnswer;", "equals", "", "other", "hashCode", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingQuestionListAnswer<T> {
    public static final int $stable = 0;
    private final T answer;
    private final int answerResId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionOnboardingQuestionListAnswer copy$default(OptionOnboardingQuestionListAnswer optionOnboardingQuestionListAnswer, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = optionOnboardingQuestionListAnswer.answerResId;
        }
        if ((i2 & 2) != 0) {
            obj = optionOnboardingQuestionListAnswer.answer;
        }
        return optionOnboardingQuestionListAnswer.copy(i, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAnswerResId() {
        return this.answerResId;
    }

    public final T component2() {
        return this.answer;
    }

    public final OptionOnboardingQuestionListAnswer<T> copy(int answerResId, T answer) {
        return new OptionOnboardingQuestionListAnswer<>(answerResId, answer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingQuestionListAnswer)) {
            return false;
        }
        OptionOnboardingQuestionListAnswer optionOnboardingQuestionListAnswer = (OptionOnboardingQuestionListAnswer) other;
        return this.answerResId == optionOnboardingQuestionListAnswer.answerResId && Intrinsics.areEqual(this.answer, optionOnboardingQuestionListAnswer.answer);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.answerResId) * 31;
        T t = this.answer;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "OptionOnboardingQuestionListAnswer(answerResId=" + this.answerResId + ", answer=" + this.answer + ")";
    }

    public OptionOnboardingQuestionListAnswer(int i, T t) {
        this.answerResId = i;
        this.answer = t;
    }

    public final int getAnswerResId() {
        return this.answerResId;
    }

    public final T getAnswer() {
        return this.answer;
    }
}
