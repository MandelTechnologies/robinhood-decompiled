package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashStateProvider.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\"\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashDataState;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashViewState;", "<init>", "()V", "reduce", "dataState", "generateBullets", "", "Lkotlin/Pair;", "Lcom/robinhood/utils/resource/StringResource;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "disclosureIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingSplashStateProvider implements StateProvider<PaycheckRecurringInvestmentsDdOnboardingSplashDataState, PaycheckRecurringInvestmentsDdOnboardingSplashViewState> {
    public static final int $stable = StringResource.$stable;
    private final StringResource disclosure = StringResource.INSTANCE.invoke(C26245R.string.paycheck_investment_intro_retirement_disclosure, new Object[0]);
    private final ServerToBentoAssetMapper2 disclosureIcon = ServerToBentoAssetMapper2.QUESTION_FILLED_16;

    @Override // com.robinhood.android.udf.StateProvider
    public PaycheckRecurringInvestmentsDdOnboardingSplashViewState reduce(PaycheckRecurringInvestmentsDdOnboardingSplashDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new PaycheckRecurringInvestmentsDdOnboardingSplashViewState(generateBullets(dataState), this.disclosure, this.disclosureIcon, dataState.getDisclosureContent());
    }

    private final List<Tuples2<StringResource, StringResource>> generateBullets(PaycheckRecurringInvestmentsDdOnboardingSplashDataState dataState) {
        ArrayList arrayList = new ArrayList();
        if (!dataState.getHasDirectDepositRelationships()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(Tuples4.m3642to(companion.invoke(C26245R.string.paycheck_investment_intro_step_1_title, new Object[0]), companion.invoke(C26245R.string.paycheck_investment_intro_step_1_subtitle, new Object[0])));
        }
        BigDecimal sweepsInterest = dataState.getSweepsInterest();
        RetirementMatchRate retirementMatchRate = dataState.getRetirementMatchRate();
        BigDecimal highestActiveInternalAccountTransferRate = retirementMatchRate != null ? retirementMatchRate.getHighestActiveInternalAccountTransferRate() : null;
        if (sweepsInterest != null && highestActiveInternalAccountTransferRate != null) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            arrayList.add(Tuples4.m3642to(companion2.invoke(C26245R.string.paycheck_investment_intro_step_2_title_retirement, new Object[0]), companion2.invoke(C26245R.string.paycheck_investment_intro_step_2_subtitle_retirement, Formats.getInterestRateFormatShort().format(highestActiveInternalAccountTransferRate), Formats.getInterestRateFormatShort().format(sweepsInterest))));
        } else {
            StringResource.Companion companion3 = StringResource.INSTANCE;
            arrayList.add(Tuples4.m3642to(companion3.invoke(C26245R.string.paycheck_investment_intro_step_2_title_retirement, new Object[0]), companion3.invoke(C26245R.string.paycheck_investment_intro_step_2_subtitle_retirement_no_rates, new Object[0])));
        }
        StringResource.Companion companion4 = StringResource.INSTANCE;
        arrayList.add(Tuples4.m3642to(companion4.invoke(C26245R.string.paycheck_investment_intro_step_3_title, new Object[0]), companion4.invoke(C26245R.string.paycheck_investment_intro_step_3_subtitle, new Object[0])));
        return CollectionsKt.toList(arrayList);
    }
}
