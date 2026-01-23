package com.robinhood.android.investorprofile.p162ui.profile;

import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileAnswers2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiInvestmentProfileSettingsQuestionSummarys.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"title", "", "Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileQuestion;", "answer", "feature-investor-profile_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.profile.UiInvestmentProfileSettingsQuestionSummarysKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UiInvestmentProfileSettingsQuestionSummarys {
    public static final String title(UiInvestmentProfileAnswers2 uiInvestmentProfileAnswers2) {
        Intrinsics.checkNotNullParameter(uiInvestmentProfileAnswers2, "<this>");
        if (uiInvestmentProfileAnswers2 instanceof UiInvestmentProfileAnswers2.SupportedType) {
            return ((UiInvestmentProfileAnswers2.SupportedType) uiInvestmentProfileAnswers2).getTitle();
        }
        if (uiInvestmentProfileAnswers2 instanceof UiInvestmentProfileAnswers2.UnsupportedType) {
            throw new IllegalStateException("Unknown question type");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String answer(UiInvestmentProfileAnswers2 uiInvestmentProfileAnswers2) {
        Intrinsics.checkNotNullParameter(uiInvestmentProfileAnswers2, "<this>");
        if (!(uiInvestmentProfileAnswers2 instanceof UiInvestmentProfileAnswers2.SupportedType)) {
            if (uiInvestmentProfileAnswers2 instanceof UiInvestmentProfileAnswers2.UnsupportedType) {
                throw new IllegalStateException("Unknown question type");
            }
            throw new NoWhenBranchMatchedException();
        }
        UiInvestmentProfileAnswers2.SupportedType.Answer answer = ((UiInvestmentProfileAnswers2.SupportedType) uiInvestmentProfileAnswers2).getAnswer();
        if (answer != null) {
            return answer.getValue();
        }
        return null;
    }
}
