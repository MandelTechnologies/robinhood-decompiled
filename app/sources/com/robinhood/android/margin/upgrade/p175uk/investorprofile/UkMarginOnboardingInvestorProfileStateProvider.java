package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingInvestorProfileState3;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkMarginOnboardingInvestorProfileStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDataState;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState;", "<init>", "()V", "reduce", "dataState", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UkMarginOnboardingInvestorProfileStateProvider implements StateProvider<UkMarginOnboardingInvestorProfileDataState, UkMarginOnboardingInvestorProfileState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public UkMarginOnboardingInvestorProfileState3 reduce(UkMarginOnboardingInvestorProfileDataState dataState) {
        UkMarginOnboardingQuestionnaireSplashStyle ukMarginOnboardingQuestionnaireSplashStyle;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isQuestionnaireComplete() == null) {
            return UkMarginOnboardingInvestorProfileState3.Loading.INSTANCE;
        }
        String productContext = dataState.getProductContext();
        int iHashCode = productContext.hashCode();
        if (iHashCode == -931256531) {
            if (productContext.equals(QuestionnaireContexts.MARGIN_KNOWLEDGE)) {
                ukMarginOnboardingQuestionnaireSplashStyle = UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_KNOWLEDGE;
                return new UkMarginOnboardingInvestorProfileState3.Questionnaire(ukMarginOnboardingQuestionnaireSplashStyle, dataState.isQuestionnaireComplete().booleanValue());
            }
            throw new IllegalStateException(("Unsupported product context: " + dataState.getProductContext()).toString());
        }
        if (iHashCode == 308375707) {
            if (productContext.equals(QuestionnaireContexts.MARGIN_EXPERIENCE)) {
                ukMarginOnboardingQuestionnaireSplashStyle = UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_INVESTING_EXPERIENCE;
                return new UkMarginOnboardingInvestorProfileState3.Questionnaire(ukMarginOnboardingQuestionnaireSplashStyle, dataState.isQuestionnaireComplete().booleanValue());
            }
            throw new IllegalStateException(("Unsupported product context: " + dataState.getProductContext()).toString());
        }
        if (iHashCode == 584618365 && productContext.equals(QuestionnaireContexts.SUITABILITY)) {
            ukMarginOnboardingQuestionnaireSplashStyle = UkMarginOnboardingQuestionnaireSplashStyle.INVESTOR_PROFILE;
            return new UkMarginOnboardingInvestorProfileState3.Questionnaire(ukMarginOnboardingQuestionnaireSplashStyle, dataState.isQuestionnaireComplete().booleanValue());
        }
        throw new IllegalStateException(("Unsupported product context: " + dataState.getProductContext()).toString());
    }
}
