package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingInvestorProfileState3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragment$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class UkMarginOnboardingQuestionnaireFragment4 extends FunctionReferenceImpl implements Function1<UkMarginOnboardingInvestorProfileState3.Questionnaire, Unit> {
    UkMarginOnboardingQuestionnaireFragment4(Object obj) {
        super(1, obj, UkMarginOnboardingQuestionnaireFragment.class, "onPrimaryButtonClicked", "onPrimaryButtonClicked(Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState$Questionnaire;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UkMarginOnboardingInvestorProfileState3.Questionnaire questionnaire) {
        invoke2(questionnaire);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UkMarginOnboardingInvestorProfileState3.Questionnaire p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((UkMarginOnboardingQuestionnaireFragment) this.receiver).onPrimaryButtonClicked(p0);
    }
}
