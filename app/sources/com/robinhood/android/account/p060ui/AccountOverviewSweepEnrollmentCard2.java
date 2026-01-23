package com.robinhood.android.account.p060ui;

import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.p320db.Account;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AccountOverviewSweepEnrollmentCard.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\nH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000bH&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000bH&¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/account/ui/SweepSectionCallbacks;", "", "onSweepLearnMoreClicked", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "interestRate", "Ljava/math/BigDecimal;", "onSweepSwitchToCashAccountClicked", "inputParams", "", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "onPausedInfoClick", "sweepEnrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "isInLeveredMarginRegionGate", "", "onDisableSweepClicked", "account", "Lcom/robinhood/models/db/Account;", "onStartSweepEnrollmentClicked", "accountNumber", "onClickViewCashSweep", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.SweepSectionCallbacks, reason: use source file name */
/* loaded from: classes24.dex */
public interface AccountOverviewSweepEnrollmentCard2 {
    void onClickViewCashSweep(String accountNumber);

    void onDisableSweepClicked(Account account);

    void onPausedInfoClick(SweepEnrollmentData sweepEnrollmentData, boolean isInLeveredMarginRegionGate);

    void onStartSweepEnrollmentClicked(String accountNumber);

    void onSweepLearnMoreClicked(Disclosure disclosure, BigDecimal interestRate);

    void onSweepSwitchToCashAccountClicked(Map<String, ? extends JsonPrimitive<?>> inputParams);
}
