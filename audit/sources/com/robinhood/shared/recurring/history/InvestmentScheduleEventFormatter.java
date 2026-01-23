package com.robinhood.shared.recurring.history;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.crypto.lib.UiCurrencyPairs;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.app.keys.data.DetailErrorType;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleEventState;
import com.robinhood.recurring.models.TradeSkippedReason;
import com.robinhood.recurring.models.p365db.InvestmentScheduleEvent;
import com.robinhood.recurring.models.p366ui.UiInvestmentScheduleEvent;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.history.BrokerageCashTransferScheduleTransaction;
import com.robinhood.shared.models.history.CryptoInvestmentScheduleWithAchTransaction;
import com.robinhood.shared.models.history.CryptoInvestmentScheduleWithBuyingPowerTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.gold.ApiGoldDepositBoostTransferDetail;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: InvestmentScheduleEventFormatter.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/recurring/history/InvestmentScheduleEventFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/MinervaTransaction;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getCryptoPrimaryText", "targetCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getAmountText", "getSecondaryText", "getSecondarySummaryRows", "", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$SecondarySummary;", "getCryptoSecondarySummary", "cryptoOrder", "Lcom/robinhood/models/crypto/db/CryptoOrder;", "event", "Lcom/robinhood/recurring/models/ui/UiInvestmentScheduleEvent;", "getBrokerageCashSecondarySummary", "investmentScheduleEvent", "Lcom/robinhood/recurring/models/db/InvestmentScheduleEvent;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getLineItems", "", "transformTransactionReference", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class InvestmentScheduleEventFormatter extends AbstractMinervaTransactionFormatter<MinervaTransaction> {
    private final AppType appType;

    /* compiled from: InvestmentScheduleEventFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppType.values().length];
            try {
                iArr2[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems(minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentScheduleEventFormatter(AppType appType, Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.appType = appType;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(MinervaTransaction transaction) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i2 = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i2 == 2) {
            String string2 = getResources().getString(C39555R.string.investment_schedule_history_item_title_rhc, UiCurrencyPairs.getSymbolWithTypeSingular(((CryptoInvestmentScheduleWithBuyingPowerTransaction) transaction).getTargetCurrencyPair()).getText(getResources()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (transaction instanceof BrokerageCashTransferScheduleTransaction) {
            BrokerageAccountType brokerageAccountType = ((BrokerageCashTransferScheduleTransaction) transaction).getEvent().getBrokerageAccountType();
            int i3 = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()];
            if (i3 == 1) {
                i = C39555R.string.investment_schedule_history_item_title_roth_ira_transfer;
            } else if (i3 == 2) {
                i = C39555R.string.investment_schedule_history_item_title_traditional_ira_transfer;
            } else {
                i = C39555R.string.investment_schedule_history_item_title_transfer;
            }
            String string3 = getResources().getString(i);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (transaction instanceof CryptoInvestmentScheduleWithBuyingPowerTransaction) {
            return getCryptoPrimaryText(((CryptoInvestmentScheduleWithBuyingPowerTransaction) transaction).getTargetCurrencyPair());
        }
        if (transaction instanceof CryptoInvestmentScheduleWithAchTransaction) {
            return getCryptoPrimaryText(((CryptoInvestmentScheduleWithAchTransaction) transaction).getTargetCurrencyPair());
        }
        HistoryEvent event = transaction.getEvent();
        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.recurring.models.ui.UiInvestmentScheduleEvent");
        String string4 = getResources().getString(C39555R.string.investment_schedule_history_item_title, ((UiInvestmentScheduleEvent) event).getInvestmentScheduleEvent().getAssetSymbol());
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    private final CharSequence getCryptoPrimaryText(UiCurrencyPair targetCurrencyPair) throws Resources.NotFoundException {
        String string2 = getResources().getString(C39555R.string.investment_schedule_history_item_title, targetCurrencyPair.getAssetCurrency().getCode());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 2) {
            HistoryEvent event = transaction.getEvent();
            Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.recurring.models.ui.UiInvestmentScheduleEvent");
            UiInvestmentScheduleEvent uiInvestmentScheduleEvent = (UiInvestmentScheduleEvent) event;
            String feeAdjustmentString = uiInvestmentScheduleEvent.getInvestmentScheduleEvent().getFeeAdjustmentString();
            return feeAdjustmentString == null ? uiInvestmentScheduleEvent.getInvestmentScheduleEvent().getAdjustmentString() : feeAdjustmentString;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        HistoryEvent event2 = transaction.getEvent();
        Intrinsics.checkNotNull(event2, "null cannot be cast to non-null type com.robinhood.recurring.models.ui.UiInvestmentScheduleEvent");
        UiInvestmentScheduleEvent uiInvestmentScheduleEvent2 = (UiInvestmentScheduleEvent) event2;
        return uiInvestmentScheduleEvent2.getIsBrokerageCashTransfer() ? uiInvestmentScheduleEvent2.getInvestmentScheduleEvent().getAdjustmentString() : "";
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return super.getSecondaryText((InvestmentScheduleEventFormatter) transaction);
        }
        Instant initiatedAt = transaction.getEvent().getInitiatedAt();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return LocalDateFormatter.MEDIUM.format((LocalDateFormatter) Instants.toLocalDate(initiatedAt, zoneIdSystemDefault));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public List<TransactionSummary.SecondarySummary> getSecondarySummaryRows(MinervaTransaction transaction) throws Resources.NotFoundException {
        TransactionSummary.SecondarySummaryState secondarySummaryState;
        TransactionSummary.SecondarySummaryState secondarySummaryState2;
        TransactionSummary.SecondarySummaryState secondarySummaryState3;
        String adjustmentString;
        Money.Adjustment adjustment;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (this.appType == AppType.RHC) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        HistoryEvent event = transaction.getEvent();
        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.recurring.models.ui.UiInvestmentScheduleEvent");
        UiInvestmentScheduleEvent uiInvestmentScheduleEvent = (UiInvestmentScheduleEvent) event;
        InvestmentScheduleEvent investmentScheduleEvent = uiInvestmentScheduleEvent.getInvestmentScheduleEvent();
        PaymentTransfer paymentTransfer = uiInvestmentScheduleEvent.getPaymentTransfer();
        ApiPaymentTransferDetails details = paymentTransfer != null ? paymentTransfer.getDetails() : null;
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = details instanceof ApiPaymentTransferDetails.ApiAchTransfer ? (ApiPaymentTransferDetails.ApiAchTransfer) details : null;
        Money enoki_amount = apiAchTransfer != null ? apiAchTransfer.getEnoki_amount() : null;
        ApiPaymentTransferDetails details2 = paymentTransfer != null ? paymentTransfer.getDetails() : null;
        ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer apiGoldDepositBoostTransfer = details2 instanceof ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer ? (ApiPaymentTransferDetails.ApiGoldDepositBoostTransfer) details2 : null;
        ApiGoldDepositBoostTransferDetail gold_deposit_boost = apiGoldDepositBoostTransfer != null ? apiGoldDepositBoostTransfer.getGold_deposit_boost() : null;
        if (enoki_amount != null) {
            TransactionSummary.SecondarySummaryState transactionSummarySecondaryState = InvestmentScheduleEventFormatter2.getTransactionSummarySecondaryState(paymentTransfer.getState());
            String string2 = getResources().getString(C39555R.string.investment_schedule_history_item_ach_with_enoki_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new TransactionSummary.SecondarySummary(transactionSummarySecondaryState, (CharSequence) string2, (CharSequence) Money.Adjustment.format$default(paymentTransfer.getAdjustment(), false, null, 3, null), (CharSequence) Money.Adjustment.format$default(enoki_amount.toCreditAdjustment(), false, null, 3, null), new TransactionSummary.Icon(ServerToBentoAssetMapper2.RETIREMENT_12, TransactionSummary.Tint.POSITIVE), false, paymentTransfer.getTransactionReference(), (DetailErrorType) null, 128, (DefaultConstructorMarker) null));
        } else if (gold_deposit_boost != null) {
            if (paymentTransfer.getIsPending()) {
                secondarySummaryState2 = TransactionSummary.SecondarySummaryState.PENDING;
            } else if (paymentTransfer.isSuccess()) {
                secondarySummaryState2 = TransactionSummary.SecondarySummaryState.COMPLETED;
            } else {
                if (!paymentTransfer.isError()) {
                    throw new IllegalStateException("Should be either pending, success or error");
                }
                secondarySummaryState2 = TransactionSummary.SecondarySummaryState.ERROR;
            }
            TransactionSummary.SecondarySummaryState secondarySummaryState4 = secondarySummaryState2;
            String string3 = getResources().getString(C39555R.string.investment_schedule_history_item_ach_title);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String str = Money.Adjustment.format$default(paymentTransfer.getAdjustment(), false, null, 3, null);
            String badge_text = gold_deposit_boost.getBadge_text();
            ServerToBentoAssetMapper2 icon_asset = gold_deposit_boost.getIcon_asset();
            arrayList.add(new TransactionSummary.SecondarySummary(secondarySummaryState4, string3, str, badge_text, icon_asset != null ? new TransactionSummary.Icon(icon_asset, TransactionSummary.Tint.SOL_LIGHT) : null, paymentTransfer.isError(), paymentTransfer.getTransactionReference(), (DetailErrorType) null, 128, (DefaultConstructorMarker) null));
        } else if (paymentTransfer != null) {
            if (paymentTransfer.getIsPending()) {
                secondarySummaryState = TransactionSummary.SecondarySummaryState.PENDING;
            } else if (paymentTransfer.isSuccess()) {
                secondarySummaryState = TransactionSummary.SecondarySummaryState.COMPLETED;
            } else {
                if (!paymentTransfer.isError()) {
                    throw new IllegalStateException("Should be either pending, success or error");
                }
                secondarySummaryState = TransactionSummary.SecondarySummaryState.ERROR;
            }
            TransactionSummary.SecondarySummaryState secondarySummaryState5 = secondarySummaryState;
            String string4 = getResources().getString(C39555R.string.investment_schedule_history_item_ach_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList.add(new TransactionSummary.SecondarySummary(secondarySummaryState5, string4, Money.Adjustment.format$default(paymentTransfer.getAdjustment(), false, null, 3, null), (CharSequence) null, (TransactionSummary.Icon) null, paymentTransfer.isError(), paymentTransfer.getTransactionReference(), (DetailErrorType) null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, (DefaultConstructorMarker) null));
        }
        CryptoOrder cryptoOrder = uiInvestmentScheduleEvent.getCryptoOrder();
        if (uiInvestmentScheduleEvent.getIsCrypto() && cryptoOrder != null) {
            arrayList.add(getCryptoSecondarySummary(cryptoOrder, uiInvestmentScheduleEvent));
            return arrayList;
        }
        Order order = uiInvestmentScheduleEvent.getOrder();
        String string5 = getResources().getString(C39555R.string.investment_schedule_history_item_order_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        if (uiInvestmentScheduleEvent.getIsBrokerageCashTransfer()) {
            arrayList.add(getBrokerageCashSecondarySummary(investmentScheduleEvent, order != null ? order.getTransactionReference() : null, uiInvestmentScheduleEvent.getBrokerageAccountType()));
            return arrayList;
        }
        if (order != null) {
            if (order.getIsPending()) {
                secondarySummaryState3 = TransactionSummary.SecondarySummaryState.PENDING;
            } else if (order.isSuccess()) {
                secondarySummaryState3 = TransactionSummary.SecondarySummaryState.COMPLETED;
            } else {
                if (!order.isError()) {
                    throw new IllegalStateException("Should be either pending, success or error");
                }
                secondarySummaryState3 = TransactionSummary.SecondarySummaryState.ERROR;
            }
            TransactionSummary.SecondarySummaryState secondarySummaryState6 = secondarySummaryState3;
            Money dollarBasedAmount = order.getDollarBasedAmount();
            if (dollarBasedAmount == null || (adjustment = dollarBasedAmount.toAdjustment(order.getSide().getAdjustmentDirection())) == null || (adjustmentString = Money.Adjustment.format$default(adjustment, false, null, 3, null)) == null) {
                adjustmentString = investmentScheduleEvent.getAdjustmentString();
            }
            arrayList.add(new TransactionSummary.SecondarySummary(secondarySummaryState6, string5, adjustmentString, (CharSequence) null, (TransactionSummary.Icon) null, order.isError(), order.getTransactionReference(), (DetailErrorType) null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, (DefaultConstructorMarker) null));
            return arrayList;
        }
        arrayList.add(new TransactionSummary.SecondarySummary(TransactionSummary.SecondarySummaryState.ERROR, (CharSequence) string5, (CharSequence) investmentScheduleEvent.getAdjustmentString(), (CharSequence) null, (TransactionSummary.Icon) null, true, (TransactionReference) null, (DetailErrorType) new DetailErrorType.RecurringPausedError(investmentScheduleEvent.getTradeSkippedReason()), 88, (DefaultConstructorMarker) null));
        return arrayList;
    }

    private final TransactionSummary.SecondarySummary getCryptoSecondarySummary(CryptoOrder cryptoOrder, UiInvestmentScheduleEvent event) throws Resources.NotFoundException {
        TransactionSummary.SecondarySummaryState secondarySummaryState;
        if (cryptoOrder.getIsPending()) {
            secondarySummaryState = TransactionSummary.SecondarySummaryState.PENDING;
        } else {
            secondarySummaryState = cryptoOrder.isSuccessful() ? TransactionSummary.SecondarySummaryState.COMPLETED : TransactionSummary.SecondarySummaryState.ERROR;
        }
        String string2 = getResources().getString(C39555R.string.investment_schedule_history_item_order_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String feeAdjustmentString = event.getInvestmentScheduleEvent().getFeeAdjustmentString();
        if (feeAdjustmentString == null) {
            feeAdjustmentString = event.getInvestmentScheduleEvent().getAdjustmentString();
        }
        return new TransactionSummary.SecondarySummary(secondarySummaryState, string2, feeAdjustmentString, (CharSequence) null, (TransactionSummary.Icon) null, cryptoOrder.isError(), cryptoOrder.getTransactionReference(), (DetailErrorType) null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, (DefaultConstructorMarker) null);
    }

    private final TransactionSummary.SecondarySummary getBrokerageCashSecondarySummary(InvestmentScheduleEvent investmentScheduleEvent, TransactionReference transactionReference, BrokerageAccountType brokerageAccountType) throws Resources.NotFoundException {
        int i;
        int i2 = brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = C39555R.string.contribution_schedule_history_item_order_title;
        } else {
            i = C39555R.string.transfer_schedule_history_item_order_title;
        }
        TradeSkippedReason tradeSkippedReason = investmentScheduleEvent.getTradeSkippedReason();
        TransactionSummary.SecondarySummaryState transactionSummarySecondaryState = InvestmentScheduleEventFormatter2.getTransactionSummarySecondaryState(investmentScheduleEvent.getState());
        String string2 = getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new TransactionSummary.SecondarySummary(transactionSummarySecondaryState, (CharSequence) string2, (CharSequence) investmentScheduleEvent.getAdjustmentString(), (CharSequence) null, (TransactionSummary.Icon) null, true, transactionReference, (DetailErrorType) (tradeSkippedReason != null ? new DetailErrorType.RecurringPausedError(tradeSkippedReason) : null), 24, (DefaultConstructorMarker) null);
    }

    public Void getLineItems(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Investment schedule events currently have their own history detail");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionReference transformTransactionReference(MinervaTransaction transaction) {
        TransactionReference transactionReference;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return super.transformTransactionReference(transaction);
        }
        HistoryEvent event = transaction.getEvent();
        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.recurring.models.ui.UiInvestmentScheduleEvent");
        CryptoOrder cryptoOrder = ((UiInvestmentScheduleEvent) event).getCryptoOrder();
        return (cryptoOrder == null || (transactionReference = cryptoOrder.getTransactionReference()) == null) ? super.transformTransactionReference(transaction) : transactionReference;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(MinervaTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = WhenMappings.$EnumSwitchMapping$1[this.appType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return super.getSummaryBadge(transaction);
        }
        HistoryEvent event = transaction.getEvent();
        Intrinsics.checkNotNull(event, "null cannot be cast to non-null type com.robinhood.recurring.models.ui.UiInvestmentScheduleEvent");
        if (((UiInvestmentScheduleEvent) event).getInvestmentScheduleEvent().getState() == InvestmentScheduleEventState.FAILED) {
            return new TransactionSummary.Badge(getString(C32428R.string.order_state_failed), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        return super.getSummaryBadge(transaction);
    }
}
