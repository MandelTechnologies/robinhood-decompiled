package com.robinhood.android.investorprofile.p162ui.profile;

import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentProfileSettingsBonfireIdentiFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiFragment$ComposeContent$1$1$1 */
/* loaded from: classes10.dex */
/* synthetic */ class C19695x9fed188b extends FunctionReferenceImpl implements Function1<InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem, Unit> {
    C19695x9fed188b(Object obj) {
        super(1, obj, InvestmentProfileSettingsBonfireIdentiFragment.class, "handleQuestionItemSelected", "handleQuestionItemSelected(Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$QuestionSummaryItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem questionSummaryItem) {
        invoke2(questionSummaryItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvestmentProfileSettingsBonfireIdentiViewState.InvestmentProfileItem.QuestionSummaryItem p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InvestmentProfileSettingsBonfireIdentiFragment) this.receiver).handleQuestionItemSelected(p0);
    }
}
