package com.robinhood.android.cash.rhy.tab.p077v2;

import com.robinhood.models.p320db.bonfire.RhyAccount;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewV2Duxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$onCreate$minervaAndRhyAccountsObservable$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RhyOverviewV2Duxo2<T> implements Consumer {
    final /* synthetic */ RhyOverviewV2Duxo this$0;

    RhyOverviewV2Duxo2(RhyOverviewV2Duxo rhyOverviewV2Duxo) {
        this.this$0 = rhyOverviewV2Duxo;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(final RhyAccount rhyAccount) {
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$onCreate$minervaAndRhyAccountsObservable$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo2.accept$lambda$0(rhyAccount, (RhyOverviewV2ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState accept$lambda$0(RhyAccount rhyAccount, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : rhyAccount, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }
}
