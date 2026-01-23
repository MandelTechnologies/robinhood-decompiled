package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter2;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter;
import com.robinhood.android.equities.historyformatter.AdrFeeFormatter;
import com.robinhood.android.equities.historyformatter.BorrowChargeFormatter;
import com.robinhood.android.options.history.formatters.ComboOrderFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.CheckTransferFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.DebitCardTransferFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.InstantBankTransferFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.RhyInterEntityTransferFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.RhyInternalTransferFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.RhyNonOriginatedAchTransferFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.RhyOriginatedAchTransferFormatter;
import com.robinhood.shared.history.formatters.legacy.rhy.RhyTransactionFormatter;
import com.robinhood.shared.history.formatters.legacy.transfers.RolloverAchTransferFormatter;
import com.robinhood.shared.models.history.AcatsReimbursementTransaction;
import com.robinhood.shared.models.history.AcatsTransaction;
import com.robinhood.shared.models.history.AdrFeeTransaction;
import com.robinhood.shared.models.history.AdvisorTradeTransaction;
import com.robinhood.shared.models.history.AdvisoryFeeTransaction;
import com.robinhood.shared.models.history.BorrowChargeTransaction;
import com.robinhood.shared.models.history.BrokerageCashTransferScheduleTransaction;
import com.robinhood.shared.models.history.CheckPaymentTransaction;
import com.robinhood.shared.models.history.CheckTransferTransaction;
import com.robinhood.shared.models.history.ComboOrderTransaction;
import com.robinhood.shared.models.history.CryptoAcatsTransaction;
import com.robinhood.shared.models.history.CryptoCashInterestPaymentTransaction;
import com.robinhood.shared.models.history.CryptoClawbackTransaction;
import com.robinhood.shared.models.history.CryptoGiftItemTransaction;
import com.robinhood.shared.models.history.CryptoInvestmentScheduleWithAchTransaction;
import com.robinhood.shared.models.history.CryptoInvestmentScheduleWithBuyingPowerTransaction;
import com.robinhood.shared.models.history.CryptoOrderTransaction;
import com.robinhood.shared.models.history.CryptoStakingTransaction;
import com.robinhood.shared.models.history.CryptoTransferTransaction;
import com.robinhood.shared.models.history.DebitCardTransaction;
import com.robinhood.shared.models.history.DividendTransaction;
import com.robinhood.shared.models.history.EquityOrderTransaction;
import com.robinhood.shared.models.history.EventCashSettlementTransaction;
import com.robinhood.shared.models.history.EventOrderTransaction;
import com.robinhood.shared.models.history.FuturesCashCorrectionTransaction;
import com.robinhood.shared.models.history.FuturesCashSettlementTransaction;
import com.robinhood.shared.models.history.FuturesOrderTransaction;
import com.robinhood.shared.models.history.FxOrderTransaction;
import com.robinhood.shared.models.history.GoldDepositBoostAdjustmentTransaction;
import com.robinhood.shared.models.history.GoldDepositBoostPayoutTransaction;
import com.robinhood.shared.models.history.I18nWireTransaction;
import com.robinhood.shared.models.history.IncomingWireTransaction;
import com.robinhood.shared.models.history.InstantBankTransferTransaction;
import com.robinhood.shared.models.history.InstrumentSplitPaymentTransaction;
import com.robinhood.shared.models.history.InternalAssetTransferTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleEventWithAchTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleEventWithBuyingPowerTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleTransaction;
import com.robinhood.shared.models.history.InvestmentScheduleWithAccountTypeTransaction;
import com.robinhood.shared.models.history.IsaCashTransferTransaction;
import com.robinhood.shared.models.history.LegacyAcatsTransaction;
import com.robinhood.shared.models.history.LegacyStockLoanPaymentTransaction;
import com.robinhood.shared.models.history.MarginInterestChargeTransaction;
import com.robinhood.shared.models.history.MarginSubscriptionFeeRefundTransaction;
import com.robinhood.shared.models.history.MarginSubscriptionFeeTransaction;
import com.robinhood.shared.models.history.MatchaIncentiveTransaction;
import com.robinhood.shared.models.history.MatchaTransaction;
import com.robinhood.shared.models.history.MerchantRewardTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.OptionCorporateActionTransaction;
import com.robinhood.shared.models.history.OptionEventTransaction;
import com.robinhood.shared.models.history.OptionOrderTransaction;
import com.robinhood.shared.models.history.OutgoingWireTransaction;
import com.robinhood.shared.models.history.PerpetualsMarginEditTransaction;
import com.robinhood.shared.models.history.PerpetualsOrderTransaction;
import com.robinhood.shared.models.history.PerpetualsSettlementTransaction;
import com.robinhood.shared.models.history.PspGiftItemTransaction;
import com.robinhood.shared.models.history.RetirementFeeTransaction;
import com.robinhood.shared.models.history.RewardItemTransaction;
import com.robinhood.shared.models.history.RhyHistoryTransaction;
import com.robinhood.shared.models.history.RhyInterEntityTransaction;
import com.robinhood.shared.models.history.RhyInternalTransferTransaction;
import com.robinhood.shared.models.history.RhyNonOriginatedAchTransaction;
import com.robinhood.shared.models.history.RhyOriginatedAchTransaction;
import com.robinhood.shared.models.history.RolloverAchTransferTransaction;
import com.robinhood.shared.models.history.RoundupRewardTransaction;
import com.robinhood.shared.models.history.SepaCreditTransaction;
import com.robinhood.shared.models.history.SgBankTransferTransaction;
import com.robinhood.shared.models.history.SlipGroupedPaymentTransaction;
import com.robinhood.shared.models.history.SweepTransaction;
import com.robinhood.shared.models.history.TokenizedCorpActionDividendTransaction;
import com.robinhood.shared.models.history.TokenizedCorpActionSplitPaymentTransaction;
import com.robinhood.shared.models.history.UkBankTransferTransaction;
import com.robinhood.shared.models.history.UkOpenBankingTransferTransaction;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MinervaTransactionFormatters.kt */
@Metadata(m3635d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bý\u0002\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\u0006\u00108\u001a\u000209\u0012\u0006\u0010:\u001a\u00020;\u0012\u0006\u0010<\u001a\u00020=\u0012\u0006\u0010>\u001a\u00020?\u0012\u0006\u0010@\u001a\u00020A\u0012\u0006\u0010B\u001a\u00020C\u0012\u0006\u0010D\u001a\u00020E\u0012\u0006\u0010F\u001a\u00020G\u0012\u0006\u0010H\u001a\u00020I\u0012\u0006\u0010J\u001a\u00020K\u0012\u0006\u0010L\u001a\u00020M\u0012\u0006\u0010N\u001a\u00020O\u0012\u0006\u0010P\u001a\u00020Q\u0012\u0006\u0010R\u001a\u00020S\u0012\u0006\u0010T\u001a\u00020U\u0012\u0006\u0010V\u001a\u00020W\u0012\u0006\u0010X\u001a\u00020Y\u0012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]0[¢\u0006\u0004\b^\u0010_J%\u0010`\u001a\b\u0012\u0004\u0012\u0002Hb0a\"\b\b\u0000\u0010b*\u00020c2\u0006\u0010d\u001a\u0002HbH\u0016¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]0[X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters;", "Lcom/robinhood/android/common/history/ui/format/AbstractAggregatedHistoryTransactionFormatter;", "resources", "Landroid/content/res/Resources;", "acatsFormatter", "Lcom/robinhood/shared/history/formatters/legacy/AcatsFormatter;", "cardTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "checkTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/CheckTransferFormatter;", "checkPaymentTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CheckPaymentTransactionFormatter;", "comboOrderFormatter", "Lcom/robinhood/android/options/history/formatters/ComboOrderFormatter;", "disputeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/DisputeFormatter;", "dividendFormatter", "Lcom/robinhood/shared/history/formatters/legacy/DividendFormatter;", "equityOrderFormatter", "Lcom/robinhood/shared/history/formatters/legacy/EquityOrderFormatter;", "incomingWireTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter;", "outgoingWireTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OutgoingWireTransferFormatter;", "instantBankTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/InstantBankTransferFormatter;", "legacyAcatsFormatter", "Lcom/robinhood/shared/history/formatters/legacy/LegacyAcatsFormatter;", "legacyStockLoanPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/LegacyStockLoanPaymentFormatter;", "marginInterestChargeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginInterestChargeFormatter;", "marginSubscriptionFeeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeFormatter;", "marginSubscriptionFeeRefundFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeRefundFormatter;", "nonOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/NonOriginatedAchTransferFormatter;", "optionCorporateActionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionCorporateActionFormatter;", "optionEventFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionEventFormatter;", "optionOrderFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionOrderFormatter;", "originatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OriginatedAchTransferFormatter;", "matchaTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MatchaTransferFormatter;", "pspGiftItemFormatter", "Lcom/robinhood/shared/history/formatters/legacy/PspGiftItemFormatter;", "slipGroupedPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/SlipGroupedPaymentFormatter;", "sweepFormatter", "Lcom/robinhood/shared/history/formatters/legacy/SweepFormatter;", "instrumentSplitPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/InstrumentSplitPaymentFormatter;", "roundupRewardFormatter", "Lcom/robinhood/shared/history/formatters/legacy/RoundupRewardFormatter;", "merchantRewardFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MerchantRewardFormatter;", "rhyInterEntityTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInterEntityTransferFormatter;", "rhyNonOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyNonOriginatedAchTransferFormatter;", "rhyOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyOriginatedAchTransferFormatter;", "rhyInternalTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInternalTransferFormatter;", "debitCardTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/DebitCardTransferFormatter;", "matchaIncentiveFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MatchaIncentiveFormatter;", "rhyTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyTransactionFormatter;", "ukBankTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/UkBankTransferFormatter;", "ukOpenBankingTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/UkOpenBankingTransferFormatter;", "retirementFormatter", "Lcom/robinhood/shared/history/formatters/legacy/RetirementFormatter;", "goldDepositBoostPayoutFormatter", "Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostPayoutFormatter;", "goldDepositBoostAdjustmentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostAdjustmentFormatter;", "adrFeeFormatter", "Lcom/robinhood/android/equities/historyformatter/AdrFeeFormatter;", "borrowChargeFormatter", "Lcom/robinhood/android/equities/historyformatter/BorrowChargeFormatter;", "rolloverAchTransferTransaction", "Lcom/robinhood/shared/history/formatters/legacy/transfers/RolloverAchTransferFormatter;", "formatters", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/shared/history/formatters/legacy/AcatsFormatter;Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/CheckTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/CheckPaymentTransactionFormatter;Lcom/robinhood/android/options/history/formatters/ComboOrderFormatter;Lcom/robinhood/shared/history/formatters/legacy/DisputeFormatter;Lcom/robinhood/shared/history/formatters/legacy/DividendFormatter;Lcom/robinhood/shared/history/formatters/legacy/EquityOrderFormatter;Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/OutgoingWireTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/InstantBankTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/LegacyAcatsFormatter;Lcom/robinhood/shared/history/formatters/legacy/LegacyStockLoanPaymentFormatter;Lcom/robinhood/shared/history/formatters/legacy/MarginInterestChargeFormatter;Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeFormatter;Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeRefundFormatter;Lcom/robinhood/shared/history/formatters/legacy/NonOriginatedAchTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/OptionCorporateActionFormatter;Lcom/robinhood/shared/history/formatters/legacy/OptionEventFormatter;Lcom/robinhood/shared/history/formatters/legacy/OptionOrderFormatter;Lcom/robinhood/shared/history/formatters/legacy/OriginatedAchTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/MatchaTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/PspGiftItemFormatter;Lcom/robinhood/shared/history/formatters/legacy/SlipGroupedPaymentFormatter;Lcom/robinhood/shared/history/formatters/legacy/SweepFormatter;Lcom/robinhood/shared/history/formatters/legacy/InstrumentSplitPaymentFormatter;Lcom/robinhood/shared/history/formatters/legacy/RoundupRewardFormatter;Lcom/robinhood/shared/history/formatters/legacy/MerchantRewardFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInterEntityTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyNonOriginatedAchTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyOriginatedAchTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInternalTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/DebitCardTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/MatchaIncentiveFormatter;Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyTransactionFormatter;Lcom/robinhood/shared/history/formatters/legacy/UkBankTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/UkOpenBankingTransferFormatter;Lcom/robinhood/shared/history/formatters/legacy/RetirementFormatter;Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostPayoutFormatter;Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostAdjustmentFormatter;Lcom/robinhood/android/equities/historyformatter/AdrFeeFormatter;Lcom/robinhood/android/equities/historyformatter/BorrowChargeFormatter;Lcom/robinhood/shared/history/formatters/legacy/transfers/RolloverAchTransferFormatter;Ljava/util/Map;)V", "get", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "T", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "transaction", "(Lcom/robinhood/shared/models/history/MinervaTransaction;)Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "provisionedViaDagger", "", "minervaTransaction", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MinervaTransactionFormatters extends AggregatedHistoryTransactionFormatter2 {
    private final AcatsFormatter acatsFormatter;
    private final AdrFeeFormatter adrFeeFormatter;
    private final BorrowChargeFormatter borrowChargeFormatter;
    private final CardTransactionFormatter cardTransactionFormatter;
    private final CheckPaymentTransactionFormatter checkPaymentTransactionFormatter;
    private final CheckTransferFormatter checkTransferFormatter;
    private final ComboOrderFormatter comboOrderFormatter;
    private final DebitCardTransferFormatter debitCardTransferFormatter;
    private final DisputeFormatter disputeFormatter;
    private final DividendFormatter dividendFormatter;
    private final EquityOrderFormatter equityOrderFormatter;
    private final Map<HistoryTransactionType, HistoryFormatter> formatters;
    private final GoldDepositBoostAdjustmentFormatter goldDepositBoostAdjustmentFormatter;
    private final GoldDepositBoostPayoutFormatter goldDepositBoostPayoutFormatter;
    private final IncomingWireTransferFormatter incomingWireTransferFormatter;
    private final InstantBankTransferFormatter instantBankTransferFormatter;
    private final InstrumentSplitPaymentFormatter instrumentSplitPaymentFormatter;
    private final LegacyAcatsFormatter legacyAcatsFormatter;
    private final LegacyStockLoanPaymentFormatter legacyStockLoanPaymentFormatter;
    private final MarginInterestChargeFormatter marginInterestChargeFormatter;
    private final MarginSubscriptionFeeFormatter marginSubscriptionFeeFormatter;
    private final MarginSubscriptionFeeRefundFormatter marginSubscriptionFeeRefundFormatter;
    private final MatchaIncentiveFormatter matchaIncentiveFormatter;
    private final MatchaTransferFormatter matchaTransferFormatter;
    private final MerchantRewardFormatter merchantRewardFormatter;
    private final NonOriginatedAchTransferFormatter nonOriginatedAchTransferFormatter;
    private final OptionCorporateActionFormatter optionCorporateActionFormatter;
    private final OptionEventFormatter optionEventFormatter;
    private final OptionOrderFormatter optionOrderFormatter;
    private final OriginatedAchTransferFormatter originatedAchTransferFormatter;
    private final OutgoingWireTransferFormatter outgoingWireTransferFormatter;
    private final PspGiftItemFormatter pspGiftItemFormatter;
    private final RetirementFormatter retirementFormatter;
    private final RhyInterEntityTransferFormatter rhyInterEntityTransferFormatter;
    private final RhyInternalTransferFormatter rhyInternalTransferFormatter;
    private final RhyNonOriginatedAchTransferFormatter rhyNonOriginatedAchTransferFormatter;
    private final RhyOriginatedAchTransferFormatter rhyOriginatedAchTransferFormatter;
    private final RhyTransactionFormatter rhyTransactionFormatter;
    private final RolloverAchTransferFormatter rolloverAchTransferTransaction;
    private final RoundupRewardFormatter roundupRewardFormatter;
    private final SlipGroupedPaymentFormatter slipGroupedPaymentFormatter;
    private final SweepFormatter sweepFormatter;
    private final UkBankTransferFormatter ukBankTransferFormatter;
    private final UkOpenBankingTransferFormatter ukOpenBankingTransferFormatter;

    @Override // com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter
    public /* bridge */ /* synthetic */ HistoryTransactionFormatter get(MinervaTransaction minervaTransaction) {
        return get((MinervaTransactionFormatters) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinervaTransactionFormatters(Resources resources, AcatsFormatter acatsFormatter, CardTransactionFormatter cardTransactionFormatter, CheckTransferFormatter checkTransferFormatter, CheckPaymentTransactionFormatter checkPaymentTransactionFormatter, ComboOrderFormatter comboOrderFormatter, DisputeFormatter disputeFormatter, DividendFormatter dividendFormatter, EquityOrderFormatter equityOrderFormatter, IncomingWireTransferFormatter incomingWireTransferFormatter, OutgoingWireTransferFormatter outgoingWireTransferFormatter, InstantBankTransferFormatter instantBankTransferFormatter, LegacyAcatsFormatter legacyAcatsFormatter, LegacyStockLoanPaymentFormatter legacyStockLoanPaymentFormatter, MarginInterestChargeFormatter marginInterestChargeFormatter, MarginSubscriptionFeeFormatter marginSubscriptionFeeFormatter, MarginSubscriptionFeeRefundFormatter marginSubscriptionFeeRefundFormatter, NonOriginatedAchTransferFormatter nonOriginatedAchTransferFormatter, OptionCorporateActionFormatter optionCorporateActionFormatter, OptionEventFormatter optionEventFormatter, OptionOrderFormatter optionOrderFormatter, OriginatedAchTransferFormatter originatedAchTransferFormatter, MatchaTransferFormatter matchaTransferFormatter, PspGiftItemFormatter pspGiftItemFormatter, SlipGroupedPaymentFormatter slipGroupedPaymentFormatter, SweepFormatter sweepFormatter, InstrumentSplitPaymentFormatter instrumentSplitPaymentFormatter, RoundupRewardFormatter roundupRewardFormatter, MerchantRewardFormatter merchantRewardFormatter, RhyInterEntityTransferFormatter rhyInterEntityTransferFormatter, RhyNonOriginatedAchTransferFormatter rhyNonOriginatedAchTransferFormatter, RhyOriginatedAchTransferFormatter rhyOriginatedAchTransferFormatter, RhyInternalTransferFormatter rhyInternalTransferFormatter, DebitCardTransferFormatter debitCardTransferFormatter, MatchaIncentiveFormatter matchaIncentiveFormatter, RhyTransactionFormatter rhyTransactionFormatter, UkBankTransferFormatter ukBankTransferFormatter, UkOpenBankingTransferFormatter ukOpenBankingTransferFormatter, RetirementFormatter retirementFormatter, GoldDepositBoostPayoutFormatter goldDepositBoostPayoutFormatter, GoldDepositBoostAdjustmentFormatter goldDepositBoostAdjustmentFormatter, AdrFeeFormatter adrFeeFormatter, BorrowChargeFormatter borrowChargeFormatter, RolloverAchTransferFormatter rolloverAchTransferTransaction, Map<HistoryTransactionType, HistoryFormatter> formatters) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(acatsFormatter, "acatsFormatter");
        Intrinsics.checkNotNullParameter(cardTransactionFormatter, "cardTransactionFormatter");
        Intrinsics.checkNotNullParameter(checkTransferFormatter, "checkTransferFormatter");
        Intrinsics.checkNotNullParameter(checkPaymentTransactionFormatter, "checkPaymentTransactionFormatter");
        Intrinsics.checkNotNullParameter(comboOrderFormatter, "comboOrderFormatter");
        Intrinsics.checkNotNullParameter(disputeFormatter, "disputeFormatter");
        Intrinsics.checkNotNullParameter(dividendFormatter, "dividendFormatter");
        Intrinsics.checkNotNullParameter(equityOrderFormatter, "equityOrderFormatter");
        Intrinsics.checkNotNullParameter(incomingWireTransferFormatter, "incomingWireTransferFormatter");
        Intrinsics.checkNotNullParameter(outgoingWireTransferFormatter, "outgoingWireTransferFormatter");
        Intrinsics.checkNotNullParameter(instantBankTransferFormatter, "instantBankTransferFormatter");
        Intrinsics.checkNotNullParameter(legacyAcatsFormatter, "legacyAcatsFormatter");
        Intrinsics.checkNotNullParameter(legacyStockLoanPaymentFormatter, "legacyStockLoanPaymentFormatter");
        Intrinsics.checkNotNullParameter(marginInterestChargeFormatter, "marginInterestChargeFormatter");
        Intrinsics.checkNotNullParameter(marginSubscriptionFeeFormatter, "marginSubscriptionFeeFormatter");
        Intrinsics.checkNotNullParameter(marginSubscriptionFeeRefundFormatter, "marginSubscriptionFeeRefundFormatter");
        Intrinsics.checkNotNullParameter(nonOriginatedAchTransferFormatter, "nonOriginatedAchTransferFormatter");
        Intrinsics.checkNotNullParameter(optionCorporateActionFormatter, "optionCorporateActionFormatter");
        Intrinsics.checkNotNullParameter(optionEventFormatter, "optionEventFormatter");
        Intrinsics.checkNotNullParameter(optionOrderFormatter, "optionOrderFormatter");
        Intrinsics.checkNotNullParameter(originatedAchTransferFormatter, "originatedAchTransferFormatter");
        Intrinsics.checkNotNullParameter(matchaTransferFormatter, "matchaTransferFormatter");
        Intrinsics.checkNotNullParameter(pspGiftItemFormatter, "pspGiftItemFormatter");
        Intrinsics.checkNotNullParameter(slipGroupedPaymentFormatter, "slipGroupedPaymentFormatter");
        Intrinsics.checkNotNullParameter(sweepFormatter, "sweepFormatter");
        Intrinsics.checkNotNullParameter(instrumentSplitPaymentFormatter, "instrumentSplitPaymentFormatter");
        Intrinsics.checkNotNullParameter(roundupRewardFormatter, "roundupRewardFormatter");
        Intrinsics.checkNotNullParameter(merchantRewardFormatter, "merchantRewardFormatter");
        Intrinsics.checkNotNullParameter(rhyInterEntityTransferFormatter, "rhyInterEntityTransferFormatter");
        Intrinsics.checkNotNullParameter(rhyNonOriginatedAchTransferFormatter, "rhyNonOriginatedAchTransferFormatter");
        Intrinsics.checkNotNullParameter(rhyOriginatedAchTransferFormatter, "rhyOriginatedAchTransferFormatter");
        Intrinsics.checkNotNullParameter(rhyInternalTransferFormatter, "rhyInternalTransferFormatter");
        Intrinsics.checkNotNullParameter(debitCardTransferFormatter, "debitCardTransferFormatter");
        Intrinsics.checkNotNullParameter(matchaIncentiveFormatter, "matchaIncentiveFormatter");
        Intrinsics.checkNotNullParameter(rhyTransactionFormatter, "rhyTransactionFormatter");
        Intrinsics.checkNotNullParameter(ukBankTransferFormatter, "ukBankTransferFormatter");
        Intrinsics.checkNotNullParameter(ukOpenBankingTransferFormatter, "ukOpenBankingTransferFormatter");
        Intrinsics.checkNotNullParameter(retirementFormatter, "retirementFormatter");
        Intrinsics.checkNotNullParameter(goldDepositBoostPayoutFormatter, "goldDepositBoostPayoutFormatter");
        Intrinsics.checkNotNullParameter(goldDepositBoostAdjustmentFormatter, "goldDepositBoostAdjustmentFormatter");
        Intrinsics.checkNotNullParameter(adrFeeFormatter, "adrFeeFormatter");
        Intrinsics.checkNotNullParameter(borrowChargeFormatter, "borrowChargeFormatter");
        Intrinsics.checkNotNullParameter(rolloverAchTransferTransaction, "rolloverAchTransferTransaction");
        Intrinsics.checkNotNullParameter(formatters, "formatters");
        this.acatsFormatter = acatsFormatter;
        this.cardTransactionFormatter = cardTransactionFormatter;
        this.checkTransferFormatter = checkTransferFormatter;
        this.checkPaymentTransactionFormatter = checkPaymentTransactionFormatter;
        this.comboOrderFormatter = comboOrderFormatter;
        this.disputeFormatter = disputeFormatter;
        this.dividendFormatter = dividendFormatter;
        this.equityOrderFormatter = equityOrderFormatter;
        this.incomingWireTransferFormatter = incomingWireTransferFormatter;
        this.outgoingWireTransferFormatter = outgoingWireTransferFormatter;
        this.instantBankTransferFormatter = instantBankTransferFormatter;
        this.legacyAcatsFormatter = legacyAcatsFormatter;
        this.legacyStockLoanPaymentFormatter = legacyStockLoanPaymentFormatter;
        this.marginInterestChargeFormatter = marginInterestChargeFormatter;
        this.marginSubscriptionFeeFormatter = marginSubscriptionFeeFormatter;
        this.marginSubscriptionFeeRefundFormatter = marginSubscriptionFeeRefundFormatter;
        this.nonOriginatedAchTransferFormatter = nonOriginatedAchTransferFormatter;
        this.optionCorporateActionFormatter = optionCorporateActionFormatter;
        this.optionEventFormatter = optionEventFormatter;
        this.optionOrderFormatter = optionOrderFormatter;
        this.originatedAchTransferFormatter = originatedAchTransferFormatter;
        this.matchaTransferFormatter = matchaTransferFormatter;
        this.pspGiftItemFormatter = pspGiftItemFormatter;
        this.slipGroupedPaymentFormatter = slipGroupedPaymentFormatter;
        this.sweepFormatter = sweepFormatter;
        this.instrumentSplitPaymentFormatter = instrumentSplitPaymentFormatter;
        this.roundupRewardFormatter = roundupRewardFormatter;
        this.merchantRewardFormatter = merchantRewardFormatter;
        this.rhyInterEntityTransferFormatter = rhyInterEntityTransferFormatter;
        this.rhyNonOriginatedAchTransferFormatter = rhyNonOriginatedAchTransferFormatter;
        this.rhyOriginatedAchTransferFormatter = rhyOriginatedAchTransferFormatter;
        this.rhyInternalTransferFormatter = rhyInternalTransferFormatter;
        this.debitCardTransferFormatter = debitCardTransferFormatter;
        this.matchaIncentiveFormatter = matchaIncentiveFormatter;
        this.rhyTransactionFormatter = rhyTransactionFormatter;
        this.ukBankTransferFormatter = ukBankTransferFormatter;
        this.ukOpenBankingTransferFormatter = ukOpenBankingTransferFormatter;
        this.retirementFormatter = retirementFormatter;
        this.goldDepositBoostPayoutFormatter = goldDepositBoostPayoutFormatter;
        this.goldDepositBoostAdjustmentFormatter = goldDepositBoostAdjustmentFormatter;
        this.adrFeeFormatter = adrFeeFormatter;
        this.borrowChargeFormatter = borrowChargeFormatter;
        this.rolloverAchTransferTransaction = rolloverAchTransferTransaction;
        this.formatters = formatters;
    }

    private static final <T extends MinervaTransaction> Void get$provisionedViaDagger(MinervaTransactionFormatters minervaTransactionFormatters, T t) {
        minervaTransactionFormatters.provisionedViaDagger(t);
        throw new ExceptionsH();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AggregatedHistoryTransactionFormatter
    public <T extends MinervaTransaction> AbstractMinervaTransactionFormatter<T> get(T transaction) {
        AbstractMinervaTransactionFormatter<T> abstractMinervaTransactionFormatter;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        HistoryFormatter orDefault = this.formatters.getOrDefault(transaction.getType(), null);
        if (orDefault != null) {
            HistoryTransactionFormatter<MinervaTransaction> formatter = orDefault.getFormatter();
            Intrinsics.checkNotNull(formatter, "null cannot be cast to non-null type com.robinhood.android.common.history.ui.format.AbstractMinervaTransactionFormatter<T of com.robinhood.shared.history.formatters.legacy.MinervaTransactionFormatters.get>");
            return (AbstractMinervaTransactionFormatter) formatter;
        }
        if ((transaction instanceof AcatsReimbursementTransaction) || (transaction instanceof AdvisorTradeTransaction) || (transaction instanceof AdvisoryFeeTransaction) || (transaction instanceof BrokerageCashTransferScheduleTransaction) || (transaction instanceof CryptoClawbackTransaction) || (transaction instanceof CryptoStakingTransaction) || (transaction instanceof CryptoGiftItemTransaction) || (transaction instanceof CryptoInvestmentScheduleWithAchTransaction) || (transaction instanceof CryptoInvestmentScheduleWithBuyingPowerTransaction) || (transaction instanceof CryptoOrderTransaction) || (transaction instanceof CryptoTransferTransaction) || (transaction instanceof EventCashSettlementTransaction) || (transaction instanceof EventOrderTransaction) || (transaction instanceof FuturesCashCorrectionTransaction) || (transaction instanceof FuturesCashSettlementTransaction) || (transaction instanceof FuturesOrderTransaction) || (transaction instanceof FxOrderTransaction) || (transaction instanceof I18nWireTransaction) || (transaction instanceof InternalAssetTransferTransaction) || (transaction instanceof InvestmentScheduleEventWithAchTransaction) || (transaction instanceof InvestmentScheduleEventWithBuyingPowerTransaction) || (transaction instanceof InvestmentScheduleTransaction) || (transaction instanceof InvestmentScheduleWithAccountTypeTransaction) || (transaction instanceof IsaCashTransferTransaction) || (transaction instanceof PerpetualsOrderTransaction) || (transaction instanceof PerpetualsSettlementTransaction) || (transaction instanceof PerpetualsMarginEditTransaction) || (transaction instanceof RewardItemTransaction) || (transaction instanceof SepaCreditTransaction) || (transaction instanceof SgBankTransferTransaction) || (transaction instanceof TokenizedCorpActionDividendTransaction) || (transaction instanceof TokenizedCorpActionSplitPaymentTransaction) || (transaction instanceof CryptoCashInterestPaymentTransaction) || (transaction instanceof CryptoAcatsTransaction)) {
            get$provisionedViaDagger(this, transaction);
            throw new ExceptionsH();
        }
        if (transaction instanceof AcatsTransaction) {
            abstractMinervaTransactionFormatter = this.acatsFormatter;
        } else if (transaction instanceof AdrFeeTransaction) {
            abstractMinervaTransactionFormatter = this.adrFeeFormatter;
        } else if (transaction instanceof BorrowChargeTransaction) {
            abstractMinervaTransactionFormatter = this.borrowChargeFormatter;
        } else if (transaction instanceof CheckPaymentTransaction) {
            abstractMinervaTransactionFormatter = this.checkPaymentTransactionFormatter;
        } else if (transaction instanceof CheckTransferTransaction) {
            abstractMinervaTransactionFormatter = this.checkTransferFormatter;
        } else if (transaction instanceof DebitCardTransaction) {
            abstractMinervaTransactionFormatter = this.debitCardTransferFormatter;
        } else if (transaction instanceof DividendTransaction) {
            abstractMinervaTransactionFormatter = this.dividendFormatter;
        } else if (transaction instanceof EquityOrderTransaction) {
            abstractMinervaTransactionFormatter = this.equityOrderFormatter;
        } else if (transaction instanceof GoldDepositBoostAdjustmentTransaction) {
            abstractMinervaTransactionFormatter = this.goldDepositBoostAdjustmentFormatter;
        } else if (transaction instanceof GoldDepositBoostPayoutTransaction) {
            abstractMinervaTransactionFormatter = this.goldDepositBoostPayoutFormatter;
        } else if (transaction instanceof IncomingWireTransaction) {
            abstractMinervaTransactionFormatter = this.incomingWireTransferFormatter;
        } else if (transaction instanceof InstantBankTransferTransaction) {
            abstractMinervaTransactionFormatter = this.instantBankTransferFormatter;
        } else if (transaction instanceof InstrumentSplitPaymentTransaction) {
            abstractMinervaTransactionFormatter = this.instrumentSplitPaymentFormatter;
        } else if (transaction instanceof LegacyAcatsTransaction) {
            abstractMinervaTransactionFormatter = this.legacyAcatsFormatter;
        } else if (transaction instanceof LegacyStockLoanPaymentTransaction) {
            abstractMinervaTransactionFormatter = this.legacyStockLoanPaymentFormatter;
        } else if (transaction instanceof MarginInterestChargeTransaction) {
            abstractMinervaTransactionFormatter = this.marginInterestChargeFormatter;
        } else if (transaction instanceof MarginSubscriptionFeeRefundTransaction) {
            abstractMinervaTransactionFormatter = this.marginSubscriptionFeeRefundFormatter;
        } else if (transaction instanceof MarginSubscriptionFeeTransaction) {
            abstractMinervaTransactionFormatter = this.marginSubscriptionFeeFormatter;
        } else if (transaction instanceof MatchaIncentiveTransaction) {
            abstractMinervaTransactionFormatter = this.matchaIncentiveFormatter;
        } else if (transaction instanceof MatchaTransaction) {
            abstractMinervaTransactionFormatter = this.matchaTransferFormatter;
        } else if (transaction instanceof MerchantRewardTransaction) {
            abstractMinervaTransactionFormatter = this.merchantRewardFormatter;
        } else if (transaction instanceof MinervaTransaction.DisputeEvent) {
            abstractMinervaTransactionFormatter = this.disputeFormatter;
        } else if (transaction instanceof MinervaTransaction.FromCard) {
            abstractMinervaTransactionFormatter = this.cardTransactionFormatter;
        } else if (transaction instanceof MinervaTransaction.NonOriginatedAch) {
            abstractMinervaTransactionFormatter = this.nonOriginatedAchTransferFormatter;
        } else if (transaction instanceof MinervaTransaction.OriginatedAch) {
            abstractMinervaTransactionFormatter = this.originatedAchTransferFormatter;
        } else if (transaction instanceof OptionCorporateActionTransaction) {
            abstractMinervaTransactionFormatter = this.optionCorporateActionFormatter;
        } else if (transaction instanceof OptionEventTransaction) {
            abstractMinervaTransactionFormatter = this.optionEventFormatter;
        } else if (transaction instanceof OptionOrderTransaction) {
            abstractMinervaTransactionFormatter = this.optionOrderFormatter;
        } else if (transaction instanceof ComboOrderTransaction) {
            abstractMinervaTransactionFormatter = this.comboOrderFormatter;
        } else if (transaction instanceof OutgoingWireTransaction) {
            abstractMinervaTransactionFormatter = this.outgoingWireTransferFormatter;
        } else if (transaction instanceof PspGiftItemTransaction) {
            abstractMinervaTransactionFormatter = this.pspGiftItemFormatter;
        } else if (transaction instanceof RetirementFeeTransaction) {
            abstractMinervaTransactionFormatter = this.retirementFormatter;
        } else if (transaction instanceof RhyHistoryTransaction) {
            abstractMinervaTransactionFormatter = this.rhyTransactionFormatter;
        } else if (transaction instanceof RhyInterEntityTransaction) {
            abstractMinervaTransactionFormatter = this.rhyInterEntityTransferFormatter;
        } else if (transaction instanceof RhyInternalTransferTransaction) {
            abstractMinervaTransactionFormatter = this.rhyInternalTransferFormatter;
        } else if (transaction instanceof RhyNonOriginatedAchTransaction) {
            abstractMinervaTransactionFormatter = this.rhyNonOriginatedAchTransferFormatter;
        } else if (transaction instanceof RhyOriginatedAchTransaction) {
            abstractMinervaTransactionFormatter = this.rhyOriginatedAchTransferFormatter;
        } else if (transaction instanceof RolloverAchTransferTransaction) {
            abstractMinervaTransactionFormatter = this.rolloverAchTransferTransaction;
        } else if (transaction instanceof RoundupRewardTransaction) {
            abstractMinervaTransactionFormatter = this.roundupRewardFormatter;
        } else if (transaction instanceof SlipGroupedPaymentTransaction) {
            abstractMinervaTransactionFormatter = this.slipGroupedPaymentFormatter;
        } else if (transaction instanceof SweepTransaction) {
            abstractMinervaTransactionFormatter = this.sweepFormatter;
        } else if (transaction instanceof UkBankTransferTransaction) {
            abstractMinervaTransactionFormatter = this.ukBankTransferFormatter;
        } else {
            if (!(transaction instanceof UkOpenBankingTransferTransaction)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractMinervaTransactionFormatter = this.ukOpenBankingTransferFormatter;
        }
        Intrinsics.checkNotNull(abstractMinervaTransactionFormatter, "null cannot be cast to non-null type com.robinhood.android.common.history.ui.format.AbstractMinervaTransactionFormatter<T of com.robinhood.shared.history.formatters.legacy.MinervaTransactionFormatters.get>");
        return abstractMinervaTransactionFormatter;
    }

    private final Void provisionedViaDagger(MinervaTransaction minervaTransaction) {
        throw new IllegalStateException(StringsKt.trimIndent("\n            The formatter for " + minervaTransaction.getType() + " is provided to the MinervaTransactionFormatters via Dagger.\n            This error is occurring because the module containing the provision is not in the apps dependency tree.\n        ").toString());
    }
}
