package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.HistoryFormatter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MinervaTransactionFormatters_Factory.kt */
@Metadata(m3635d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001dB\u008e\u0005\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0004\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0004\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0004\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0004\u0012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0004\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0004\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0004\u0012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0004\u0012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0004\u0012\f\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0004\u0012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0004\u0012\f\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0004\u0012\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u0004\u0012\f\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u0004\u0012\f\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u0004\u0012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0004\u0012\u001d\u0010\\\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020_0]¢\u0006\u0002\b`0\u0004¢\u0006\u0004\ba\u0010bJ\b\u0010c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\\\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020_0]¢\u0006\u0002\b`0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "acatsFormatter", "Lcom/robinhood/shared/history/formatters/legacy/AcatsFormatter;", "cardTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "checkTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/CheckTransferFormatter;", "checkPaymentTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CheckPaymentTransactionFormatter;", "comboOrderFormatter", "Lcom/robinhood/android/options/history/formatters/ComboOrderFormatter;", "disputeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/DisputeFormatter;", "dividendFormatter", "Lcom/robinhood/shared/history/formatters/legacy/DividendFormatter;", "equityOrderFormatter", "Lcom/robinhood/shared/history/formatters/legacy/EquityOrderFormatter;", "incomingWireTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter;", "outgoingWireTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OutgoingWireTransferFormatter;", "instantBankTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/InstantBankTransferFormatter;", "legacyAcatsFormatter", "Lcom/robinhood/shared/history/formatters/legacy/LegacyAcatsFormatter;", "legacyStockLoanPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/LegacyStockLoanPaymentFormatter;", "marginInterestChargeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginInterestChargeFormatter;", "marginSubscriptionFeeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeFormatter;", "marginSubscriptionFeeRefundFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeRefundFormatter;", "nonOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/NonOriginatedAchTransferFormatter;", "optionCorporateActionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionCorporateActionFormatter;", "optionEventFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionEventFormatter;", "optionOrderFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionOrderFormatter;", "originatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OriginatedAchTransferFormatter;", "matchaTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MatchaTransferFormatter;", "pspGiftItemFormatter", "Lcom/robinhood/shared/history/formatters/legacy/PspGiftItemFormatter;", "slipGroupedPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/SlipGroupedPaymentFormatter;", "sweepFormatter", "Lcom/robinhood/shared/history/formatters/legacy/SweepFormatter;", "instrumentSplitPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/InstrumentSplitPaymentFormatter;", "roundupRewardFormatter", "Lcom/robinhood/shared/history/formatters/legacy/RoundupRewardFormatter;", "merchantRewardFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MerchantRewardFormatter;", "rhyInterEntityTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInterEntityTransferFormatter;", "rhyNonOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyNonOriginatedAchTransferFormatter;", "rhyOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyOriginatedAchTransferFormatter;", "rhyInternalTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInternalTransferFormatter;", "debitCardTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/DebitCardTransferFormatter;", "matchaIncentiveFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MatchaIncentiveFormatter;", "rhyTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyTransactionFormatter;", "ukBankTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/UkBankTransferFormatter;", "ukOpenBankingTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/UkOpenBankingTransferFormatter;", "retirementFormatter", "Lcom/robinhood/shared/history/formatters/legacy/RetirementFormatter;", "goldDepositBoostPayoutFormatter", "Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostPayoutFormatter;", "goldDepositBoostAdjustmentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostAdjustmentFormatter;", "adrFeeFormatter", "Lcom/robinhood/android/equities/historyformatter/AdrFeeFormatter;", "borrowChargeFormatter", "Lcom/robinhood/android/equities/historyformatter/BorrowChargeFormatter;", "rolloverAchTransferTransaction", "Lcom/robinhood/shared/history/formatters/legacy/transfers/RolloverAchTransferFormatter;", "formatters", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MinervaTransactionFormatters_Factory implements Factory<MinervaTransactionFormatters> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AcatsFormatter> acatsFormatter;
    private final Provider<AdrFeeFormatter> adrFeeFormatter;
    private final Provider<BorrowChargeFormatter> borrowChargeFormatter;
    private final Provider<CardTransactionFormatter> cardTransactionFormatter;
    private final Provider<CheckPaymentTransactionFormatter> checkPaymentTransactionFormatter;
    private final Provider<CheckTransferFormatter> checkTransferFormatter;
    private final Provider<ComboOrderFormatter> comboOrderFormatter;
    private final Provider<DebitCardTransferFormatter> debitCardTransferFormatter;
    private final Provider<DisputeFormatter> disputeFormatter;
    private final Provider<DividendFormatter> dividendFormatter;
    private final Provider<EquityOrderFormatter> equityOrderFormatter;
    private final Provider<Map<HistoryTransactionType, HistoryFormatter>> formatters;
    private final Provider<GoldDepositBoostAdjustmentFormatter> goldDepositBoostAdjustmentFormatter;
    private final Provider<GoldDepositBoostPayoutFormatter> goldDepositBoostPayoutFormatter;
    private final Provider<IncomingWireTransferFormatter> incomingWireTransferFormatter;
    private final Provider<InstantBankTransferFormatter> instantBankTransferFormatter;
    private final Provider<InstrumentSplitPaymentFormatter> instrumentSplitPaymentFormatter;
    private final Provider<LegacyAcatsFormatter> legacyAcatsFormatter;
    private final Provider<LegacyStockLoanPaymentFormatter> legacyStockLoanPaymentFormatter;
    private final Provider<MarginInterestChargeFormatter> marginInterestChargeFormatter;
    private final Provider<MarginSubscriptionFeeFormatter> marginSubscriptionFeeFormatter;
    private final Provider<MarginSubscriptionFeeRefundFormatter> marginSubscriptionFeeRefundFormatter;
    private final Provider<MatchaIncentiveFormatter> matchaIncentiveFormatter;
    private final Provider<MatchaTransferFormatter> matchaTransferFormatter;
    private final Provider<MerchantRewardFormatter> merchantRewardFormatter;
    private final Provider<NonOriginatedAchTransferFormatter> nonOriginatedAchTransferFormatter;
    private final Provider<OptionCorporateActionFormatter> optionCorporateActionFormatter;
    private final Provider<OptionEventFormatter> optionEventFormatter;
    private final Provider<OptionOrderFormatter> optionOrderFormatter;
    private final Provider<OriginatedAchTransferFormatter> originatedAchTransferFormatter;
    private final Provider<OutgoingWireTransferFormatter> outgoingWireTransferFormatter;
    private final Provider<PspGiftItemFormatter> pspGiftItemFormatter;
    private final Provider<Resources> resources;
    private final Provider<RetirementFormatter> retirementFormatter;
    private final Provider<RhyInterEntityTransferFormatter> rhyInterEntityTransferFormatter;
    private final Provider<RhyInternalTransferFormatter> rhyInternalTransferFormatter;
    private final Provider<RhyNonOriginatedAchTransferFormatter> rhyNonOriginatedAchTransferFormatter;
    private final Provider<RhyOriginatedAchTransferFormatter> rhyOriginatedAchTransferFormatter;
    private final Provider<RhyTransactionFormatter> rhyTransactionFormatter;
    private final Provider<RolloverAchTransferFormatter> rolloverAchTransferTransaction;
    private final Provider<RoundupRewardFormatter> roundupRewardFormatter;
    private final Provider<SlipGroupedPaymentFormatter> slipGroupedPaymentFormatter;
    private final Provider<SweepFormatter> sweepFormatter;
    private final Provider<UkBankTransferFormatter> ukBankTransferFormatter;
    private final Provider<UkOpenBankingTransferFormatter> ukOpenBankingTransferFormatter;

    @JvmStatic
    public static final MinervaTransactionFormatters_Factory create(Provider<Resources> provider, Provider<AcatsFormatter> provider2, Provider<CardTransactionFormatter> provider3, Provider<CheckTransferFormatter> provider4, Provider<CheckPaymentTransactionFormatter> provider5, Provider<ComboOrderFormatter> provider6, Provider<DisputeFormatter> provider7, Provider<DividendFormatter> provider8, Provider<EquityOrderFormatter> provider9, Provider<IncomingWireTransferFormatter> provider10, Provider<OutgoingWireTransferFormatter> provider11, Provider<InstantBankTransferFormatter> provider12, Provider<LegacyAcatsFormatter> provider13, Provider<LegacyStockLoanPaymentFormatter> provider14, Provider<MarginInterestChargeFormatter> provider15, Provider<MarginSubscriptionFeeFormatter> provider16, Provider<MarginSubscriptionFeeRefundFormatter> provider17, Provider<NonOriginatedAchTransferFormatter> provider18, Provider<OptionCorporateActionFormatter> provider19, Provider<OptionEventFormatter> provider20, Provider<OptionOrderFormatter> provider21, Provider<OriginatedAchTransferFormatter> provider22, Provider<MatchaTransferFormatter> provider23, Provider<PspGiftItemFormatter> provider24, Provider<SlipGroupedPaymentFormatter> provider25, Provider<SweepFormatter> provider26, Provider<InstrumentSplitPaymentFormatter> provider27, Provider<RoundupRewardFormatter> provider28, Provider<MerchantRewardFormatter> provider29, Provider<RhyInterEntityTransferFormatter> provider30, Provider<RhyNonOriginatedAchTransferFormatter> provider31, Provider<RhyOriginatedAchTransferFormatter> provider32, Provider<RhyInternalTransferFormatter> provider33, Provider<DebitCardTransferFormatter> provider34, Provider<MatchaIncentiveFormatter> provider35, Provider<RhyTransactionFormatter> provider36, Provider<UkBankTransferFormatter> provider37, Provider<UkOpenBankingTransferFormatter> provider38, Provider<RetirementFormatter> provider39, Provider<GoldDepositBoostPayoutFormatter> provider40, Provider<GoldDepositBoostAdjustmentFormatter> provider41, Provider<AdrFeeFormatter> provider42, Provider<BorrowChargeFormatter> provider43, Provider<RolloverAchTransferFormatter> provider44, Provider<Map<HistoryTransactionType, HistoryFormatter>> provider45) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35, provider36, provider37, provider38, provider39, provider40, provider41, provider42, provider43, provider44, provider45);
    }

    @JvmStatic
    public static final MinervaTransactionFormatters newInstance(Resources resources, AcatsFormatter acatsFormatter, CardTransactionFormatter cardTransactionFormatter, CheckTransferFormatter checkTransferFormatter, CheckPaymentTransactionFormatter checkPaymentTransactionFormatter, ComboOrderFormatter comboOrderFormatter, DisputeFormatter disputeFormatter, DividendFormatter dividendFormatter, EquityOrderFormatter equityOrderFormatter, IncomingWireTransferFormatter incomingWireTransferFormatter, OutgoingWireTransferFormatter outgoingWireTransferFormatter, InstantBankTransferFormatter instantBankTransferFormatter, LegacyAcatsFormatter legacyAcatsFormatter, LegacyStockLoanPaymentFormatter legacyStockLoanPaymentFormatter, MarginInterestChargeFormatter marginInterestChargeFormatter, MarginSubscriptionFeeFormatter marginSubscriptionFeeFormatter, MarginSubscriptionFeeRefundFormatter marginSubscriptionFeeRefundFormatter, NonOriginatedAchTransferFormatter nonOriginatedAchTransferFormatter, OptionCorporateActionFormatter optionCorporateActionFormatter, OptionEventFormatter optionEventFormatter, OptionOrderFormatter optionOrderFormatter, OriginatedAchTransferFormatter originatedAchTransferFormatter, MatchaTransferFormatter matchaTransferFormatter, PspGiftItemFormatter pspGiftItemFormatter, SlipGroupedPaymentFormatter slipGroupedPaymentFormatter, SweepFormatter sweepFormatter, InstrumentSplitPaymentFormatter instrumentSplitPaymentFormatter, RoundupRewardFormatter roundupRewardFormatter, MerchantRewardFormatter merchantRewardFormatter, RhyInterEntityTransferFormatter rhyInterEntityTransferFormatter, RhyNonOriginatedAchTransferFormatter rhyNonOriginatedAchTransferFormatter, RhyOriginatedAchTransferFormatter rhyOriginatedAchTransferFormatter, RhyInternalTransferFormatter rhyInternalTransferFormatter, DebitCardTransferFormatter debitCardTransferFormatter, MatchaIncentiveFormatter matchaIncentiveFormatter, RhyTransactionFormatter rhyTransactionFormatter, UkBankTransferFormatter ukBankTransferFormatter, UkOpenBankingTransferFormatter ukOpenBankingTransferFormatter, RetirementFormatter retirementFormatter, GoldDepositBoostPayoutFormatter goldDepositBoostPayoutFormatter, GoldDepositBoostAdjustmentFormatter goldDepositBoostAdjustmentFormatter, AdrFeeFormatter adrFeeFormatter, BorrowChargeFormatter borrowChargeFormatter, RolloverAchTransferFormatter rolloverAchTransferFormatter, Map<HistoryTransactionType, HistoryFormatter> map) {
        return INSTANCE.newInstance(resources, acatsFormatter, cardTransactionFormatter, checkTransferFormatter, checkPaymentTransactionFormatter, comboOrderFormatter, disputeFormatter, dividendFormatter, equityOrderFormatter, incomingWireTransferFormatter, outgoingWireTransferFormatter, instantBankTransferFormatter, legacyAcatsFormatter, legacyStockLoanPaymentFormatter, marginInterestChargeFormatter, marginSubscriptionFeeFormatter, marginSubscriptionFeeRefundFormatter, nonOriginatedAchTransferFormatter, optionCorporateActionFormatter, optionEventFormatter, optionOrderFormatter, originatedAchTransferFormatter, matchaTransferFormatter, pspGiftItemFormatter, slipGroupedPaymentFormatter, sweepFormatter, instrumentSplitPaymentFormatter, roundupRewardFormatter, merchantRewardFormatter, rhyInterEntityTransferFormatter, rhyNonOriginatedAchTransferFormatter, rhyOriginatedAchTransferFormatter, rhyInternalTransferFormatter, debitCardTransferFormatter, matchaIncentiveFormatter, rhyTransactionFormatter, ukBankTransferFormatter, ukOpenBankingTransferFormatter, retirementFormatter, goldDepositBoostPayoutFormatter, goldDepositBoostAdjustmentFormatter, adrFeeFormatter, borrowChargeFormatter, rolloverAchTransferFormatter, map);
    }

    public MinervaTransactionFormatters_Factory(Provider<Resources> resources, Provider<AcatsFormatter> acatsFormatter, Provider<CardTransactionFormatter> cardTransactionFormatter, Provider<CheckTransferFormatter> checkTransferFormatter, Provider<CheckPaymentTransactionFormatter> checkPaymentTransactionFormatter, Provider<ComboOrderFormatter> comboOrderFormatter, Provider<DisputeFormatter> disputeFormatter, Provider<DividendFormatter> dividendFormatter, Provider<EquityOrderFormatter> equityOrderFormatter, Provider<IncomingWireTransferFormatter> incomingWireTransferFormatter, Provider<OutgoingWireTransferFormatter> outgoingWireTransferFormatter, Provider<InstantBankTransferFormatter> instantBankTransferFormatter, Provider<LegacyAcatsFormatter> legacyAcatsFormatter, Provider<LegacyStockLoanPaymentFormatter> legacyStockLoanPaymentFormatter, Provider<MarginInterestChargeFormatter> marginInterestChargeFormatter, Provider<MarginSubscriptionFeeFormatter> marginSubscriptionFeeFormatter, Provider<MarginSubscriptionFeeRefundFormatter> marginSubscriptionFeeRefundFormatter, Provider<NonOriginatedAchTransferFormatter> nonOriginatedAchTransferFormatter, Provider<OptionCorporateActionFormatter> optionCorporateActionFormatter, Provider<OptionEventFormatter> optionEventFormatter, Provider<OptionOrderFormatter> optionOrderFormatter, Provider<OriginatedAchTransferFormatter> originatedAchTransferFormatter, Provider<MatchaTransferFormatter> matchaTransferFormatter, Provider<PspGiftItemFormatter> pspGiftItemFormatter, Provider<SlipGroupedPaymentFormatter> slipGroupedPaymentFormatter, Provider<SweepFormatter> sweepFormatter, Provider<InstrumentSplitPaymentFormatter> instrumentSplitPaymentFormatter, Provider<RoundupRewardFormatter> roundupRewardFormatter, Provider<MerchantRewardFormatter> merchantRewardFormatter, Provider<RhyInterEntityTransferFormatter> rhyInterEntityTransferFormatter, Provider<RhyNonOriginatedAchTransferFormatter> rhyNonOriginatedAchTransferFormatter, Provider<RhyOriginatedAchTransferFormatter> rhyOriginatedAchTransferFormatter, Provider<RhyInternalTransferFormatter> rhyInternalTransferFormatter, Provider<DebitCardTransferFormatter> debitCardTransferFormatter, Provider<MatchaIncentiveFormatter> matchaIncentiveFormatter, Provider<RhyTransactionFormatter> rhyTransactionFormatter, Provider<UkBankTransferFormatter> ukBankTransferFormatter, Provider<UkOpenBankingTransferFormatter> ukOpenBankingTransferFormatter, Provider<RetirementFormatter> retirementFormatter, Provider<GoldDepositBoostPayoutFormatter> goldDepositBoostPayoutFormatter, Provider<GoldDepositBoostAdjustmentFormatter> goldDepositBoostAdjustmentFormatter, Provider<AdrFeeFormatter> adrFeeFormatter, Provider<BorrowChargeFormatter> borrowChargeFormatter, Provider<RolloverAchTransferFormatter> rolloverAchTransferTransaction, Provider<Map<HistoryTransactionType, HistoryFormatter>> formatters) {
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
        this.resources = resources;
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

    @Override // javax.inject.Provider
    public MinervaTransactionFormatters get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        AcatsFormatter acatsFormatter = this.acatsFormatter.get();
        Intrinsics.checkNotNullExpressionValue(acatsFormatter, "get(...)");
        CardTransactionFormatter cardTransactionFormatter = this.cardTransactionFormatter.get();
        Intrinsics.checkNotNullExpressionValue(cardTransactionFormatter, "get(...)");
        CheckTransferFormatter checkTransferFormatter = this.checkTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(checkTransferFormatter, "get(...)");
        CheckPaymentTransactionFormatter checkPaymentTransactionFormatter = this.checkPaymentTransactionFormatter.get();
        Intrinsics.checkNotNullExpressionValue(checkPaymentTransactionFormatter, "get(...)");
        ComboOrderFormatter comboOrderFormatter = this.comboOrderFormatter.get();
        Intrinsics.checkNotNullExpressionValue(comboOrderFormatter, "get(...)");
        DisputeFormatter disputeFormatter = this.disputeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(disputeFormatter, "get(...)");
        DividendFormatter dividendFormatter = this.dividendFormatter.get();
        Intrinsics.checkNotNullExpressionValue(dividendFormatter, "get(...)");
        EquityOrderFormatter equityOrderFormatter = this.equityOrderFormatter.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderFormatter, "get(...)");
        IncomingWireTransferFormatter incomingWireTransferFormatter = this.incomingWireTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(incomingWireTransferFormatter, "get(...)");
        OutgoingWireTransferFormatter outgoingWireTransferFormatter = this.outgoingWireTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(outgoingWireTransferFormatter, "get(...)");
        InstantBankTransferFormatter instantBankTransferFormatter = this.instantBankTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(instantBankTransferFormatter, "get(...)");
        LegacyAcatsFormatter legacyAcatsFormatter = this.legacyAcatsFormatter.get();
        Intrinsics.checkNotNullExpressionValue(legacyAcatsFormatter, "get(...)");
        LegacyStockLoanPaymentFormatter legacyStockLoanPaymentFormatter = this.legacyStockLoanPaymentFormatter.get();
        Intrinsics.checkNotNullExpressionValue(legacyStockLoanPaymentFormatter, "get(...)");
        LegacyStockLoanPaymentFormatter legacyStockLoanPaymentFormatter2 = legacyStockLoanPaymentFormatter;
        MarginInterestChargeFormatter marginInterestChargeFormatter = this.marginInterestChargeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(marginInterestChargeFormatter, "get(...)");
        MarginInterestChargeFormatter marginInterestChargeFormatter2 = marginInterestChargeFormatter;
        MarginSubscriptionFeeFormatter marginSubscriptionFeeFormatter = this.marginSubscriptionFeeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionFeeFormatter, "get(...)");
        MarginSubscriptionFeeFormatter marginSubscriptionFeeFormatter2 = marginSubscriptionFeeFormatter;
        MarginSubscriptionFeeRefundFormatter marginSubscriptionFeeRefundFormatter = this.marginSubscriptionFeeRefundFormatter.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionFeeRefundFormatter, "get(...)");
        MarginSubscriptionFeeRefundFormatter marginSubscriptionFeeRefundFormatter2 = marginSubscriptionFeeRefundFormatter;
        NonOriginatedAchTransferFormatter nonOriginatedAchTransferFormatter = this.nonOriginatedAchTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(nonOriginatedAchTransferFormatter, "get(...)");
        NonOriginatedAchTransferFormatter nonOriginatedAchTransferFormatter2 = nonOriginatedAchTransferFormatter;
        OptionCorporateActionFormatter optionCorporateActionFormatter = this.optionCorporateActionFormatter.get();
        Intrinsics.checkNotNullExpressionValue(optionCorporateActionFormatter, "get(...)");
        OptionCorporateActionFormatter optionCorporateActionFormatter2 = optionCorporateActionFormatter;
        OptionEventFormatter optionEventFormatter = this.optionEventFormatter.get();
        Intrinsics.checkNotNullExpressionValue(optionEventFormatter, "get(...)");
        OptionEventFormatter optionEventFormatter2 = optionEventFormatter;
        OptionOrderFormatter optionOrderFormatter = this.optionOrderFormatter.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderFormatter, "get(...)");
        OptionOrderFormatter optionOrderFormatter2 = optionOrderFormatter;
        OriginatedAchTransferFormatter originatedAchTransferFormatter = this.originatedAchTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(originatedAchTransferFormatter, "get(...)");
        OriginatedAchTransferFormatter originatedAchTransferFormatter2 = originatedAchTransferFormatter;
        MatchaTransferFormatter matchaTransferFormatter = this.matchaTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(matchaTransferFormatter, "get(...)");
        MatchaTransferFormatter matchaTransferFormatter2 = matchaTransferFormatter;
        PspGiftItemFormatter pspGiftItemFormatter = this.pspGiftItemFormatter.get();
        Intrinsics.checkNotNullExpressionValue(pspGiftItemFormatter, "get(...)");
        PspGiftItemFormatter pspGiftItemFormatter2 = pspGiftItemFormatter;
        SlipGroupedPaymentFormatter slipGroupedPaymentFormatter = this.slipGroupedPaymentFormatter.get();
        Intrinsics.checkNotNullExpressionValue(slipGroupedPaymentFormatter, "get(...)");
        SlipGroupedPaymentFormatter slipGroupedPaymentFormatter2 = slipGroupedPaymentFormatter;
        SweepFormatter sweepFormatter = this.sweepFormatter.get();
        Intrinsics.checkNotNullExpressionValue(sweepFormatter, "get(...)");
        SweepFormatter sweepFormatter2 = sweepFormatter;
        InstrumentSplitPaymentFormatter instrumentSplitPaymentFormatter = this.instrumentSplitPaymentFormatter.get();
        Intrinsics.checkNotNullExpressionValue(instrumentSplitPaymentFormatter, "get(...)");
        InstrumentSplitPaymentFormatter instrumentSplitPaymentFormatter2 = instrumentSplitPaymentFormatter;
        RoundupRewardFormatter roundupRewardFormatter = this.roundupRewardFormatter.get();
        Intrinsics.checkNotNullExpressionValue(roundupRewardFormatter, "get(...)");
        RoundupRewardFormatter roundupRewardFormatter2 = roundupRewardFormatter;
        MerchantRewardFormatter merchantRewardFormatter = this.merchantRewardFormatter.get();
        Intrinsics.checkNotNullExpressionValue(merchantRewardFormatter, "get(...)");
        MerchantRewardFormatter merchantRewardFormatter2 = merchantRewardFormatter;
        RhyInterEntityTransferFormatter rhyInterEntityTransferFormatter = this.rhyInterEntityTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(rhyInterEntityTransferFormatter, "get(...)");
        RhyInterEntityTransferFormatter rhyInterEntityTransferFormatter2 = rhyInterEntityTransferFormatter;
        RhyNonOriginatedAchTransferFormatter rhyNonOriginatedAchTransferFormatter = this.rhyNonOriginatedAchTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(rhyNonOriginatedAchTransferFormatter, "get(...)");
        RhyNonOriginatedAchTransferFormatter rhyNonOriginatedAchTransferFormatter2 = rhyNonOriginatedAchTransferFormatter;
        RhyOriginatedAchTransferFormatter rhyOriginatedAchTransferFormatter = this.rhyOriginatedAchTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(rhyOriginatedAchTransferFormatter, "get(...)");
        RhyOriginatedAchTransferFormatter rhyOriginatedAchTransferFormatter2 = rhyOriginatedAchTransferFormatter;
        RhyInternalTransferFormatter rhyInternalTransferFormatter = this.rhyInternalTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(rhyInternalTransferFormatter, "get(...)");
        RhyInternalTransferFormatter rhyInternalTransferFormatter2 = rhyInternalTransferFormatter;
        DebitCardTransferFormatter debitCardTransferFormatter = this.debitCardTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(debitCardTransferFormatter, "get(...)");
        DebitCardTransferFormatter debitCardTransferFormatter2 = debitCardTransferFormatter;
        MatchaIncentiveFormatter matchaIncentiveFormatter = this.matchaIncentiveFormatter.get();
        Intrinsics.checkNotNullExpressionValue(matchaIncentiveFormatter, "get(...)");
        MatchaIncentiveFormatter matchaIncentiveFormatter2 = matchaIncentiveFormatter;
        RhyTransactionFormatter rhyTransactionFormatter = this.rhyTransactionFormatter.get();
        Intrinsics.checkNotNullExpressionValue(rhyTransactionFormatter, "get(...)");
        RhyTransactionFormatter rhyTransactionFormatter2 = rhyTransactionFormatter;
        UkBankTransferFormatter ukBankTransferFormatter = this.ukBankTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(ukBankTransferFormatter, "get(...)");
        UkBankTransferFormatter ukBankTransferFormatter2 = ukBankTransferFormatter;
        UkOpenBankingTransferFormatter ukOpenBankingTransferFormatter = this.ukOpenBankingTransferFormatter.get();
        Intrinsics.checkNotNullExpressionValue(ukOpenBankingTransferFormatter, "get(...)");
        UkOpenBankingTransferFormatter ukOpenBankingTransferFormatter2 = ukOpenBankingTransferFormatter;
        RetirementFormatter retirementFormatter = this.retirementFormatter.get();
        Intrinsics.checkNotNullExpressionValue(retirementFormatter, "get(...)");
        RetirementFormatter retirementFormatter2 = retirementFormatter;
        GoldDepositBoostPayoutFormatter goldDepositBoostPayoutFormatter = this.goldDepositBoostPayoutFormatter.get();
        Intrinsics.checkNotNullExpressionValue(goldDepositBoostPayoutFormatter, "get(...)");
        GoldDepositBoostPayoutFormatter goldDepositBoostPayoutFormatter2 = goldDepositBoostPayoutFormatter;
        GoldDepositBoostAdjustmentFormatter goldDepositBoostAdjustmentFormatter = this.goldDepositBoostAdjustmentFormatter.get();
        Intrinsics.checkNotNullExpressionValue(goldDepositBoostAdjustmentFormatter, "get(...)");
        GoldDepositBoostAdjustmentFormatter goldDepositBoostAdjustmentFormatter2 = goldDepositBoostAdjustmentFormatter;
        AdrFeeFormatter adrFeeFormatter = this.adrFeeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(adrFeeFormatter, "get(...)");
        AdrFeeFormatter adrFeeFormatter2 = adrFeeFormatter;
        BorrowChargeFormatter borrowChargeFormatter = this.borrowChargeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(borrowChargeFormatter, "get(...)");
        BorrowChargeFormatter borrowChargeFormatter2 = borrowChargeFormatter;
        RolloverAchTransferFormatter rolloverAchTransferFormatter = this.rolloverAchTransferTransaction.get();
        Intrinsics.checkNotNullExpressionValue(rolloverAchTransferFormatter, "get(...)");
        RolloverAchTransferFormatter rolloverAchTransferFormatter2 = rolloverAchTransferFormatter;
        Map<HistoryTransactionType, HistoryFormatter> map = this.formatters.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        return companion.newInstance(resources, acatsFormatter, cardTransactionFormatter, checkTransferFormatter, checkPaymentTransactionFormatter, comboOrderFormatter, disputeFormatter, dividendFormatter, equityOrderFormatter, incomingWireTransferFormatter, outgoingWireTransferFormatter, instantBankTransferFormatter, legacyAcatsFormatter, legacyStockLoanPaymentFormatter2, marginInterestChargeFormatter2, marginSubscriptionFeeFormatter2, marginSubscriptionFeeRefundFormatter2, nonOriginatedAchTransferFormatter2, optionCorporateActionFormatter2, optionEventFormatter2, optionOrderFormatter2, originatedAchTransferFormatter2, matchaTransferFormatter2, pspGiftItemFormatter2, slipGroupedPaymentFormatter2, sweepFormatter2, instrumentSplitPaymentFormatter2, roundupRewardFormatter2, merchantRewardFormatter2, rhyInterEntityTransferFormatter2, rhyNonOriginatedAchTransferFormatter2, rhyOriginatedAchTransferFormatter2, rhyInternalTransferFormatter2, debitCardTransferFormatter2, matchaIncentiveFormatter2, rhyTransactionFormatter2, ukBankTransferFormatter2, ukOpenBankingTransferFormatter2, retirementFormatter2, goldDepositBoostPayoutFormatter2, goldDepositBoostAdjustmentFormatter2, adrFeeFormatter2, borrowChargeFormatter2, rolloverAchTransferFormatter2, map);
    }

    /* compiled from: MinervaTransactionFormatters_Factory.kt */
    @Metadata(m3635d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008f\u0005\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00072\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00072\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00072\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00072\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00072\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00072\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00072\f\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u00072\f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00072\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00072\f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u00072\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u00072\f\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u00072\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u00072\f\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u00072\u001d\u0010_\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b0`¢\u0006\u0002\bc0\u0007H\u0007J\u0081\u0003\u0010d\u001a\u00020e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0017\u0010_\u001a\u0013\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b0`¢\u0006\u0002\bcH\u0007¨\u0006f"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters_Factory;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "acatsFormatter", "Lcom/robinhood/shared/history/formatters/legacy/AcatsFormatter;", "cardTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "checkTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/CheckTransferFormatter;", "checkPaymentTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/CheckPaymentTransactionFormatter;", "comboOrderFormatter", "Lcom/robinhood/android/options/history/formatters/ComboOrderFormatter;", "disputeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/DisputeFormatter;", "dividendFormatter", "Lcom/robinhood/shared/history/formatters/legacy/DividendFormatter;", "equityOrderFormatter", "Lcom/robinhood/shared/history/formatters/legacy/EquityOrderFormatter;", "incomingWireTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/IncomingWireTransferFormatter;", "outgoingWireTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OutgoingWireTransferFormatter;", "instantBankTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/InstantBankTransferFormatter;", "legacyAcatsFormatter", "Lcom/robinhood/shared/history/formatters/legacy/LegacyAcatsFormatter;", "legacyStockLoanPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/LegacyStockLoanPaymentFormatter;", "marginInterestChargeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginInterestChargeFormatter;", "marginSubscriptionFeeFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeFormatter;", "marginSubscriptionFeeRefundFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MarginSubscriptionFeeRefundFormatter;", "nonOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/NonOriginatedAchTransferFormatter;", "optionCorporateActionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionCorporateActionFormatter;", "optionEventFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionEventFormatter;", "optionOrderFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OptionOrderFormatter;", "originatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/OriginatedAchTransferFormatter;", "matchaTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MatchaTransferFormatter;", "pspGiftItemFormatter", "Lcom/robinhood/shared/history/formatters/legacy/PspGiftItemFormatter;", "slipGroupedPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/SlipGroupedPaymentFormatter;", "sweepFormatter", "Lcom/robinhood/shared/history/formatters/legacy/SweepFormatter;", "instrumentSplitPaymentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/InstrumentSplitPaymentFormatter;", "roundupRewardFormatter", "Lcom/robinhood/shared/history/formatters/legacy/RoundupRewardFormatter;", "merchantRewardFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MerchantRewardFormatter;", "rhyInterEntityTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInterEntityTransferFormatter;", "rhyNonOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyNonOriginatedAchTransferFormatter;", "rhyOriginatedAchTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyOriginatedAchTransferFormatter;", "rhyInternalTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyInternalTransferFormatter;", "debitCardTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/DebitCardTransferFormatter;", "matchaIncentiveFormatter", "Lcom/robinhood/shared/history/formatters/legacy/MatchaIncentiveFormatter;", "rhyTransactionFormatter", "Lcom/robinhood/shared/history/formatters/legacy/rhy/RhyTransactionFormatter;", "ukBankTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/UkBankTransferFormatter;", "ukOpenBankingTransferFormatter", "Lcom/robinhood/shared/history/formatters/legacy/UkOpenBankingTransferFormatter;", "retirementFormatter", "Lcom/robinhood/shared/history/formatters/legacy/RetirementFormatter;", "goldDepositBoostPayoutFormatter", "Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostPayoutFormatter;", "goldDepositBoostAdjustmentFormatter", "Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostAdjustmentFormatter;", "adrFeeFormatter", "Lcom/robinhood/android/equities/historyformatter/AdrFeeFormatter;", "borrowChargeFormatter", "Lcom/robinhood/android/equities/historyformatter/BorrowChargeFormatter;", "rolloverAchTransferTransaction", "Lcom/robinhood/shared/history/formatters/legacy/transfers/RolloverAchTransferFormatter;", "formatters", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "Lcom/robinhood/android/common/history/ui/format/HistoryFormatter;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/shared/history/formatters/legacy/MinervaTransactionFormatters;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MinervaTransactionFormatters_Factory create(Provider<Resources> resources, Provider<AcatsFormatter> acatsFormatter, Provider<CardTransactionFormatter> cardTransactionFormatter, Provider<CheckTransferFormatter> checkTransferFormatter, Provider<CheckPaymentTransactionFormatter> checkPaymentTransactionFormatter, Provider<ComboOrderFormatter> comboOrderFormatter, Provider<DisputeFormatter> disputeFormatter, Provider<DividendFormatter> dividendFormatter, Provider<EquityOrderFormatter> equityOrderFormatter, Provider<IncomingWireTransferFormatter> incomingWireTransferFormatter, Provider<OutgoingWireTransferFormatter> outgoingWireTransferFormatter, Provider<InstantBankTransferFormatter> instantBankTransferFormatter, Provider<LegacyAcatsFormatter> legacyAcatsFormatter, Provider<LegacyStockLoanPaymentFormatter> legacyStockLoanPaymentFormatter, Provider<MarginInterestChargeFormatter> marginInterestChargeFormatter, Provider<MarginSubscriptionFeeFormatter> marginSubscriptionFeeFormatter, Provider<MarginSubscriptionFeeRefundFormatter> marginSubscriptionFeeRefundFormatter, Provider<NonOriginatedAchTransferFormatter> nonOriginatedAchTransferFormatter, Provider<OptionCorporateActionFormatter> optionCorporateActionFormatter, Provider<OptionEventFormatter> optionEventFormatter, Provider<OptionOrderFormatter> optionOrderFormatter, Provider<OriginatedAchTransferFormatter> originatedAchTransferFormatter, Provider<MatchaTransferFormatter> matchaTransferFormatter, Provider<PspGiftItemFormatter> pspGiftItemFormatter, Provider<SlipGroupedPaymentFormatter> slipGroupedPaymentFormatter, Provider<SweepFormatter> sweepFormatter, Provider<InstrumentSplitPaymentFormatter> instrumentSplitPaymentFormatter, Provider<RoundupRewardFormatter> roundupRewardFormatter, Provider<MerchantRewardFormatter> merchantRewardFormatter, Provider<RhyInterEntityTransferFormatter> rhyInterEntityTransferFormatter, Provider<RhyNonOriginatedAchTransferFormatter> rhyNonOriginatedAchTransferFormatter, Provider<RhyOriginatedAchTransferFormatter> rhyOriginatedAchTransferFormatter, Provider<RhyInternalTransferFormatter> rhyInternalTransferFormatter, Provider<DebitCardTransferFormatter> debitCardTransferFormatter, Provider<MatchaIncentiveFormatter> matchaIncentiveFormatter, Provider<RhyTransactionFormatter> rhyTransactionFormatter, Provider<UkBankTransferFormatter> ukBankTransferFormatter, Provider<UkOpenBankingTransferFormatter> ukOpenBankingTransferFormatter, Provider<RetirementFormatter> retirementFormatter, Provider<GoldDepositBoostPayoutFormatter> goldDepositBoostPayoutFormatter, Provider<GoldDepositBoostAdjustmentFormatter> goldDepositBoostAdjustmentFormatter, Provider<AdrFeeFormatter> adrFeeFormatter, Provider<BorrowChargeFormatter> borrowChargeFormatter, Provider<RolloverAchTransferFormatter> rolloverAchTransferTransaction, Provider<Map<HistoryTransactionType, HistoryFormatter>> formatters) {
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
            return new MinervaTransactionFormatters_Factory(resources, acatsFormatter, cardTransactionFormatter, checkTransferFormatter, checkPaymentTransactionFormatter, comboOrderFormatter, disputeFormatter, dividendFormatter, equityOrderFormatter, incomingWireTransferFormatter, outgoingWireTransferFormatter, instantBankTransferFormatter, legacyAcatsFormatter, legacyStockLoanPaymentFormatter, marginInterestChargeFormatter, marginSubscriptionFeeFormatter, marginSubscriptionFeeRefundFormatter, nonOriginatedAchTransferFormatter, optionCorporateActionFormatter, optionEventFormatter, optionOrderFormatter, originatedAchTransferFormatter, matchaTransferFormatter, pspGiftItemFormatter, slipGroupedPaymentFormatter, sweepFormatter, instrumentSplitPaymentFormatter, roundupRewardFormatter, merchantRewardFormatter, rhyInterEntityTransferFormatter, rhyNonOriginatedAchTransferFormatter, rhyOriginatedAchTransferFormatter, rhyInternalTransferFormatter, debitCardTransferFormatter, matchaIncentiveFormatter, rhyTransactionFormatter, ukBankTransferFormatter, ukOpenBankingTransferFormatter, retirementFormatter, goldDepositBoostPayoutFormatter, goldDepositBoostAdjustmentFormatter, adrFeeFormatter, borrowChargeFormatter, rolloverAchTransferTransaction, formatters);
        }

        @JvmStatic
        public final MinervaTransactionFormatters newInstance(Resources resources, AcatsFormatter acatsFormatter, CardTransactionFormatter cardTransactionFormatter, CheckTransferFormatter checkTransferFormatter, CheckPaymentTransactionFormatter checkPaymentTransactionFormatter, ComboOrderFormatter comboOrderFormatter, DisputeFormatter disputeFormatter, DividendFormatter dividendFormatter, EquityOrderFormatter equityOrderFormatter, IncomingWireTransferFormatter incomingWireTransferFormatter, OutgoingWireTransferFormatter outgoingWireTransferFormatter, InstantBankTransferFormatter instantBankTransferFormatter, LegacyAcatsFormatter legacyAcatsFormatter, LegacyStockLoanPaymentFormatter legacyStockLoanPaymentFormatter, MarginInterestChargeFormatter marginInterestChargeFormatter, MarginSubscriptionFeeFormatter marginSubscriptionFeeFormatter, MarginSubscriptionFeeRefundFormatter marginSubscriptionFeeRefundFormatter, NonOriginatedAchTransferFormatter nonOriginatedAchTransferFormatter, OptionCorporateActionFormatter optionCorporateActionFormatter, OptionEventFormatter optionEventFormatter, OptionOrderFormatter optionOrderFormatter, OriginatedAchTransferFormatter originatedAchTransferFormatter, MatchaTransferFormatter matchaTransferFormatter, PspGiftItemFormatter pspGiftItemFormatter, SlipGroupedPaymentFormatter slipGroupedPaymentFormatter, SweepFormatter sweepFormatter, InstrumentSplitPaymentFormatter instrumentSplitPaymentFormatter, RoundupRewardFormatter roundupRewardFormatter, MerchantRewardFormatter merchantRewardFormatter, RhyInterEntityTransferFormatter rhyInterEntityTransferFormatter, RhyNonOriginatedAchTransferFormatter rhyNonOriginatedAchTransferFormatter, RhyOriginatedAchTransferFormatter rhyOriginatedAchTransferFormatter, RhyInternalTransferFormatter rhyInternalTransferFormatter, DebitCardTransferFormatter debitCardTransferFormatter, MatchaIncentiveFormatter matchaIncentiveFormatter, RhyTransactionFormatter rhyTransactionFormatter, UkBankTransferFormatter ukBankTransferFormatter, UkOpenBankingTransferFormatter ukOpenBankingTransferFormatter, RetirementFormatter retirementFormatter, GoldDepositBoostPayoutFormatter goldDepositBoostPayoutFormatter, GoldDepositBoostAdjustmentFormatter goldDepositBoostAdjustmentFormatter, AdrFeeFormatter adrFeeFormatter, BorrowChargeFormatter borrowChargeFormatter, RolloverAchTransferFormatter rolloverAchTransferTransaction, Map<HistoryTransactionType, HistoryFormatter> formatters) {
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
            return new MinervaTransactionFormatters(resources, acatsFormatter, cardTransactionFormatter, checkTransferFormatter, checkPaymentTransactionFormatter, comboOrderFormatter, disputeFormatter, dividendFormatter, equityOrderFormatter, incomingWireTransferFormatter, outgoingWireTransferFormatter, instantBankTransferFormatter, legacyAcatsFormatter, legacyStockLoanPaymentFormatter, marginInterestChargeFormatter, marginSubscriptionFeeFormatter, marginSubscriptionFeeRefundFormatter, nonOriginatedAchTransferFormatter, optionCorporateActionFormatter, optionEventFormatter, optionOrderFormatter, originatedAchTransferFormatter, matchaTransferFormatter, pspGiftItemFormatter, slipGroupedPaymentFormatter, sweepFormatter, instrumentSplitPaymentFormatter, roundupRewardFormatter, merchantRewardFormatter, rhyInterEntityTransferFormatter, rhyNonOriginatedAchTransferFormatter, rhyOriginatedAchTransferFormatter, rhyInternalTransferFormatter, debitCardTransferFormatter, matchaIncentiveFormatter, rhyTransactionFormatter, ukBankTransferFormatter, ukOpenBankingTransferFormatter, retirementFormatter, goldDepositBoostPayoutFormatter, goldDepositBoostAdjustmentFormatter, adrFeeFormatter, borrowChargeFormatter, rolloverAchTransferTransaction, formatters);
        }
    }
}
