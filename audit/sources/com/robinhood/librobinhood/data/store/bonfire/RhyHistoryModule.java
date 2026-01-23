package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.HistoryLoaderV2;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader2;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyHistoryModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010&\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010'\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010(\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010)\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010+\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010,\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010-\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010.\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006/"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RhyHistoryModule;", "", "<init>", "()V", "provideHistoryLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoaderV2;", "rhyTransactionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTransactionStore;", "provideTaxWithholdingFederalHistoryTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "provideTaxWithholdingStateCaliforniaHistoryTransactionLoader", "provideTaxWithholdingStateMaineHistoryTransactionLoader", "provideTaxWithholdingStateVermontHistoryTransactionLoader", "provideTaxWithholdingNraHistoryTransactionLoader", "provideTaxWithholdingReversalFederalHistoryTransactionLoader", "provideTaxWithholdingReversalStateCaliforniaHistoryTransactionLoader", "provideTaxWithholdingReversalStateMaineHistoryTransactionLoader", "provideTaxWithholdingReversalStateVermontHistoryTransactionLoader", "provideTaxWithholdingReversalNraHistoryTransactionLoader", "provideTaxWithholdingManualAdjustmentHistoryTransactionLoader", "provideTaxWithholdingReversalManualAdjustmentHistoryTransactionLoader", "provideAdjustmentCreditHistoryTransactionLoader", "provideAdjustmentDebitHistoryTransactionLoader", "provideAutopostAdrFeeCreditHistoryTransactionLoader", "provideAutopostGoldFeeCreditHistoryTransactionLoader", "provideAutopostMarginInterestCreditHistoryTransactionLoader", "provideAutopostNegativeEquityRepaymentDebitHistoryTransactionLoader", "provideAutopostNegativeEquityWriteoffHistoryTransactionLoader", "provideAutopostReferralCreditHistoryTransactionLoader", "provideAutopostReversedAchCreditHistoryTransactionLoader", "provideAutopostWriteoffHistoryTransactionLoader", "provideAutoPostCxGoodwillCreditHistoryTransactionLoader", "provideAutopostAcatFeeCreditHistoryTransactionLoader", "provideAutopostOtherHistoryTransactionLoader", "provideAutopostIncomingAcatFeeReimbursementHistoryTransactionLoader", "provideAutopostSettlementAgreementTaxableHistoryTransactionLoader", "provideAutopostSettlementAgreementNonTaxableHistoryTransactionLoader", "provideAutopostOtherTaxableHistoryTransactionLoader", "provideAutopostOtherNonTaxableHistoryTransactionLoader", "provideAutopostCashBackOffersCreditHistoryTransactionLoader", "provideAutopostMerchantOffersCreditHistoryTransactionLoader", "provideAutopostP2pReferralCreditHistoryTransactionLoader", "provideCashBalanceTransferHistoryTransactionLoader", "provideCashBalanceTransferTaxableHistoryTransactionLoader", "provideCashBalanceTransferNonTaxableHistoryTransactionLoader", "provideFeeHistoryTransactionLoader", "provideWireHistoryTransactionLoader", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyHistoryModule {
    public static final RhyHistoryModule INSTANCE = new RhyHistoryModule();

    private RhyHistoryModule() {
    }

    public final HistoryLoaderV2 provideHistoryLoaderCallbacks(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return new HistoryLoaderV2(rhyTransactionStore.getHistoryLoaderCallbacks(), SetsKt.setOf(AppType.TRADER));
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_FEDERAL)
    public final HistoryTransactionLoader provideTaxWithholdingFederalHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_STATE_CALIFORNIA)
    public final HistoryTransactionLoader provideTaxWithholdingStateCaliforniaHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_STATE_MAINE)
    public final HistoryTransactionLoader provideTaxWithholdingStateMaineHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_STATE_VERMONT)
    public final HistoryTransactionLoader provideTaxWithholdingStateVermontHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_NRA)
    public final HistoryTransactionLoader provideTaxWithholdingNraHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_FEDERAL)
    public final HistoryTransactionLoader provideTaxWithholdingReversalFederalHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_CALIFORNIA)
    /* renamed from: provideTaxWithholdingReversalStateCaliforniaHistoryTransactionLoader */
    public final HistoryTransactionLoader m2630x282f7c65(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_MAINE)
    public final HistoryTransactionLoader provideTaxWithholdingReversalStateMaineHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_VERMONT)
    /* renamed from: provideTaxWithholdingReversalStateVermontHistoryTransactionLoader */
    public final HistoryTransactionLoader m2631x9ba40d58(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_NRA)
    public final HistoryTransactionLoader provideTaxWithholdingReversalNraHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_MANUAL_ADJUSTMENT)
    public final HistoryTransactionLoader provideTaxWithholdingManualAdjustmentHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_MANUAL_ADJUSTMENT)
    /* renamed from: provideTaxWithholdingReversalManualAdjustmentHistoryTransactionLoader */
    public final HistoryTransactionLoader m2629x15185471(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.ADJUSTMENT_CREDIT)
    public final HistoryTransactionLoader provideAdjustmentCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.ADJUSTMENT_DEBIT)
    public final HistoryTransactionLoader provideAdjustmentDebitHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_ADR_FEE_CREDIT)
    public final HistoryTransactionLoader provideAutopostAdrFeeCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_GOLD_FEE_CREDIT)
    public final HistoryTransactionLoader provideAutopostGoldFeeCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_MARGIN_INTEREST_CREDIT)
    public final HistoryTransactionLoader provideAutopostMarginInterestCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_REPAYMENT_DEBIT)
    /* renamed from: provideAutopostNegativeEquityRepaymentDebitHistoryTransactionLoader */
    public final HistoryTransactionLoader m2626xbaa25860(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_WRITEOFF)
    public final HistoryTransactionLoader provideAutopostNegativeEquityWriteoffHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_REFERRAL_CREDIT)
    public final HistoryTransactionLoader provideAutopostReferralCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_REVERSED_ACH_CREDIT)
    public final HistoryTransactionLoader provideAutopostReversedAchCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_WRITEOFF)
    public final HistoryTransactionLoader provideAutopostWriteoffHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_CX_GOODWILL_CREDIT)
    public final HistoryTransactionLoader provideAutoPostCxGoodwillCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_ACAT_FEE_CREDIT)
    public final HistoryTransactionLoader provideAutopostAcatFeeCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_OTHER)
    public final HistoryTransactionLoader provideAutopostOtherHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_INCOMING_ACAT_FEE_REIMBURSEMENT)
    /* renamed from: provideAutopostIncomingAcatFeeReimbursementHistoryTransactionLoader */
    public final HistoryTransactionLoader m2625xde5f72ba(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_TAXABLE)
    /* renamed from: provideAutopostSettlementAgreementTaxableHistoryTransactionLoader */
    public final HistoryTransactionLoader m2628x317b4891(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_NON_TAXABLE)
    /* renamed from: provideAutopostSettlementAgreementNonTaxableHistoryTransactionLoader */
    public final HistoryTransactionLoader m2627xb16ef286(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_OTHER_TAXABLE)
    public final HistoryTransactionLoader provideAutopostOtherTaxableHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_OTHER_NON_TAXABLE)
    public final HistoryTransactionLoader provideAutopostOtherNonTaxableHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_CASH_BACK_OFFERS_CREDIT)
    public final HistoryTransactionLoader provideAutopostCashBackOffersCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_MERCHANT_OFFERS_CREDIT)
    public final HistoryTransactionLoader provideAutopostMerchantOffersCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.AUTOPOST_P2P_REFERRAL_CREDIT)
    public final HistoryTransactionLoader provideAutopostP2pReferralCreditHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CASH_BALANCE_TRANSFER)
    public final HistoryTransactionLoader provideCashBalanceTransferHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CASH_BALANCE_TRANSFER_TAXABLE)
    public final HistoryTransactionLoader provideCashBalanceTransferTaxableHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.CASH_BALANCE_TRANSFER_NON_TAXABLE)
    public final HistoryTransactionLoader provideCashBalanceTransferNonTaxableHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.FEE)
    public final HistoryTransactionLoader provideFeeHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }

    @HistoryTransactionLoader2(HistoryTransactionType.WIRE)
    public final HistoryTransactionLoader provideWireHistoryTransactionLoader(RhyTransactionStore rhyTransactionStore) {
        Intrinsics.checkNotNullParameter(rhyTransactionStore, "rhyTransactionStore");
        return rhyTransactionStore.getTransactionLoader();
    }
}
