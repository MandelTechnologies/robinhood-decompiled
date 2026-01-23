package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingInvestorProfileState3;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes8.dex */
final class UkMarginOnboardingQuestionnaireFragment6 implements PreviewParameterProvider<UkMarginOnboardingInvestorProfileState3> {
    private final Sequence<UkMarginOnboardingInvestorProfileState3> values = SequencesKt.plus(SequencesKt.sequenceOf(UkMarginOnboardingInvestorProfileState3.Loading.INSTANCE), SequencesKt.map(CollectionsKt.asSequence(UkMarginOnboardingQuestionnaireSplashStyle.getEntries()), new Function1() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.ViewStateParameterProvider$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return UkMarginOnboardingQuestionnaireFragment6.values$lambda$0((UkMarginOnboardingQuestionnaireSplashStyle) obj);
        }
    }));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<UkMarginOnboardingInvestorProfileState3> getValues() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UkMarginOnboardingInvestorProfileState3.Questionnaire values$lambda$0(UkMarginOnboardingQuestionnaireSplashStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        return new UkMarginOnboardingInvestorProfileState3.Questionnaire(style, false);
    }
}
