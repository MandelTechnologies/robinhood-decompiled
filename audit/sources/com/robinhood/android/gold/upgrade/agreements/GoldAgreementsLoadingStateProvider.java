package com.robinhood.android.gold.upgrade.agreements;

import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingState3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldAgreementsLoadingStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDataState;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState;", "<init>", "()V", "reduce", "dataState", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldAgreementsLoadingStateProvider implements StateProvider<GoldAgreementsLoadingDataState, GoldAgreementsLoadingState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public GoldAgreementsLoadingState3 reduce(GoldAgreementsLoadingDataState dataState) {
        MarginSubscription subscription;
        MarginSubscription3 plan;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getFresh()) {
            return GoldAgreementsLoadingState3.Loading.INSTANCE;
        }
        if (dataState.getUnifiedAccount() == null || dataState.getGoldSweepAgreements() == null || ((subscription = dataState.getSubscription()) != null && (plan = subscription.getPlan()) != null && plan.is24Karat())) {
            return GoldAgreementsLoadingState3.Failed.INSTANCE;
        }
        MarginUpgradePlans2 firstPlan = dataState.getFirstPlan();
        if (firstPlan != null && firstPlan.is24KaratGold() && !dataState.getUnifiedAccount().getAccountBuyingPower().isNegative()) {
            MarginUpgradePlans2 firstPlan2 = dataState.getFirstPlan();
            ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements = dataState.getGoldSweepAgreements();
            return new GoldAgreementsLoadingState3.Loaded(new GoldAgreementsContext(firstPlan2, dataState.getPromotion(), dataState.getPostSuccessActionSheet(), goldSweepAgreements, dataState.isTitleCenterAlignment(), dataState.getOnlyShowGoldAgreement(), dataState.getDisableSparkleButtonStyling(), dataState.getTitleProgressBar()));
        }
        return GoldAgreementsLoadingState3.Failed.INSTANCE;
    }
}
