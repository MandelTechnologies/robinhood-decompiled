package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionOnboardingQuestionListAnswerComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007HÆ\u0003J9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionListAnswerViewState;", "T", "", "questionResId", "", "bodyMarkdownResId", "answers", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionListAnswer;", "<init>", "(IILkotlinx/collections/immutable/ImmutableList;)V", "getQuestionResId", "()I", "getBodyMarkdownResId", "getAnswers", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingQuestionListAnswerViewState<T> {
    public static final int $stable = 0;
    private final ImmutableList<OptionOnboardingQuestionListAnswer<T>> answers;
    private final int bodyMarkdownResId;
    private final int questionResId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionOnboardingQuestionListAnswerViewState copy$default(OptionOnboardingQuestionListAnswerViewState optionOnboardingQuestionListAnswerViewState, int i, int i2, ImmutableList immutableList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = optionOnboardingQuestionListAnswerViewState.questionResId;
        }
        if ((i3 & 2) != 0) {
            i2 = optionOnboardingQuestionListAnswerViewState.bodyMarkdownResId;
        }
        if ((i3 & 4) != 0) {
            immutableList = optionOnboardingQuestionListAnswerViewState.answers;
        }
        return optionOnboardingQuestionListAnswerViewState.copy(i, i2, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final int getQuestionResId() {
        return this.questionResId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBodyMarkdownResId() {
        return this.bodyMarkdownResId;
    }

    public final ImmutableList<OptionOnboardingQuestionListAnswer<T>> component3() {
        return this.answers;
    }

    public final OptionOnboardingQuestionListAnswerViewState<T> copy(int questionResId, int bodyMarkdownResId, ImmutableList<OptionOnboardingQuestionListAnswer<T>> answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new OptionOnboardingQuestionListAnswerViewState<>(questionResId, bodyMarkdownResId, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingQuestionListAnswerViewState)) {
            return false;
        }
        OptionOnboardingQuestionListAnswerViewState optionOnboardingQuestionListAnswerViewState = (OptionOnboardingQuestionListAnswerViewState) other;
        return this.questionResId == optionOnboardingQuestionListAnswerViewState.questionResId && this.bodyMarkdownResId == optionOnboardingQuestionListAnswerViewState.bodyMarkdownResId && Intrinsics.areEqual(this.answers, optionOnboardingQuestionListAnswerViewState.answers);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.questionResId) * 31) + Integer.hashCode(this.bodyMarkdownResId)) * 31) + this.answers.hashCode();
    }

    public String toString() {
        return "OptionOnboardingQuestionListAnswerViewState(questionResId=" + this.questionResId + ", bodyMarkdownResId=" + this.bodyMarkdownResId + ", answers=" + this.answers + ")";
    }

    public OptionOnboardingQuestionListAnswerViewState(int i, int i2, ImmutableList<OptionOnboardingQuestionListAnswer<T>> answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.questionResId = i;
        this.bodyMarkdownResId = i2;
        this.answers = answers;
    }

    public final int getQuestionResId() {
        return this.questionResId;
    }

    public final int getBodyMarkdownResId() {
        return this.bodyMarkdownResId;
    }

    public final ImmutableList<OptionOnboardingQuestionListAnswer<T>> getAnswers() {
        return this.answers;
    }
}
