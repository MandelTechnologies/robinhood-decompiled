package com.robinhood.android.cash.disputes.p070ui.question;

import com.robinhood.models.p355ui.DisputeQuestionnaire;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: QuestionDisplayHeader.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/DefaultQuestionDisplayHeader;", "Lcom/robinhood/android/cash/disputes/ui/question/QuestionDisplayHeader;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question;)V", "titleText", "", "getTitleText", "()Ljava/lang/String;", "subtitleText", "getSubtitleText", "isSubtitleVisible", "", "()Z", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.question.DefaultQuestionDisplayHeader, reason: use source file name */
/* loaded from: classes7.dex */
public final class QuestionDisplayHeader2 implements QuestionDisplayHeader {
    public static final int $stable = 8;
    private final DisputeQuestionnaire.Question question;

    public QuestionDisplayHeader2(DisputeQuestionnaire.Question question) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.question = question;
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public String getTitleText() {
        return this.question.getDisplayTitle();
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public String getSubtitleText() {
        return this.question.getDisplayText();
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public boolean isSubtitleVisible() {
        String subtitleText = getSubtitleText();
        return !(subtitleText == null || StringsKt.isBlank(subtitleText));
    }
}
