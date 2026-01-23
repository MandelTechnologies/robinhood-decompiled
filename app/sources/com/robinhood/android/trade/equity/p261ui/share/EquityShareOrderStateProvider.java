package com.robinhood.android.trade.equity.p261ui.share;

import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiSalesTax;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityShareOrderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderViewState;", "<init>", "()V", "reduce", "dataState", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityShareOrderStateProvider implements StateProvider<EquityShareOrderDataState, EquityShareOrderViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EquityShareOrderViewState reduce(EquityShareOrderDataState dataState) {
        Result resultM28549boximpl;
        List<ApiSalesTax> salesTaxes;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Instrument instrument = dataState.getInstrument();
        Account account = dataState.getAccount();
        ShareBasedOrderConfiguration configuration = dataState.getConfiguration();
        MarketHours marketHours = dataState.getMarketHours();
        NbboSummary nbboSummary = dataState.getNbboSummary();
        boolean overrideToExecuteInMarketHoursOnly = dataState.getOverrideToExecuteInMarketHoursOnly();
        List<String> checkOverrides = dataState.getCheckOverrides();
        boolean loadingNbbo = dataState.getLoadingNbbo();
        WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse = dataState.getBackupWithholdingEstimateAmountResponse();
        List<Account> allAccounts = dataState.getAllAccounts();
        boolean zIsCancelPendingCryptoOrdersLoading = dataState.isCancelPendingCryptoOrdersLoading();
        GenericAlertContent<GenericAction> sessionChangeAlertContent = dataState.getSessionChangeAlertContent();
        String accountNumber = dataState.getAccountNumber();
        EquityOrderRequestInputs requestInputs = dataState.getRequestInputs();
        EquityOrderContext equityOrderContext = dataState.getEquityOrderContext();
        boolean loading = dataState.getLoading();
        DefaultOrderState formState = dataState.getFormState();
        boolean reviewing = dataState.getReviewing();
        ValidationState validationState = dataState.getValidationState();
        Integer numM2497xe1ff29cc = dataState.m2497xe1ff29cc();
        Money lastTradePrice = dataState.getLastTradePrice();
        boolean shouldShowBackupWithholdingEstimate = dataState.getShouldShowBackupWithholdingEstimate();
        boolean shouldShowBackupWithholdingWarning = dataState.getShouldShowBackupWithholdingWarning();
        boolean mlpExperimentMember = dataState.getMlpExperimentMember();
        WithholdingStatus withholdingStatus = dataState.getWithholdingStatus();
        ApiCollateral collateral = dataState.getCollateral();
        StringResource accountNameTitle = dataState.getAccountNameTitle();
        StringResource accountNameSubtitle = dataState.getAccountNameSubtitle();
        InstrumentAccountSwitcherState accountSwitcherState = dataState.getAccountSwitcherState();
        boolean showTwentyFourHourMarketButton = dataState.getShowTwentyFourHourMarketButton();
        boolean showTwentyFourHourMarketDialog = dataState.getShowTwentyFourHourMarketDialog();
        boolean showLimitOrdersOnlyDialog = dataState.getShowLimitOrdersOnlyDialog();
        EquityOrderSide side = dataState.getSide();
        Result<ApiEstimatedFees> resultM19350getEstimatedFeesxLWZpok = dataState.m19350getEstimatedFeesxLWZpok();
        ImmutableList immutableList = null;
        if (resultM19350getEstimatedFeesxLWZpok != null) {
            Object value = resultM19350getEstimatedFeesxLWZpok.getValue();
            if (Result.m28556isSuccessimpl(value)) {
                value = ((ApiEstimatedFees) value).getTotalFee();
            }
            resultM28549boximpl = Result.m28549boximpl(Result.m28550constructorimpl(value));
        } else {
            resultM28549boximpl = null;
        }
        Result<ApiEstimatedFees> resultM19350getEstimatedFeesxLWZpok2 = dataState.m19350getEstimatedFeesxLWZpok();
        if (resultM19350getEstimatedFeesxLWZpok2 != null) {
            Object value2 = resultM19350getEstimatedFeesxLWZpok2.getValue();
            if (Result.m28555isFailureimpl(value2)) {
                value2 = null;
            }
            ApiEstimatedFees apiEstimatedFees = (ApiEstimatedFees) value2;
            if (apiEstimatedFees != null && (salesTaxes = apiEstimatedFees.getSalesTaxes()) != null) {
                immutableList = extensions2.toImmutableList(salesTaxes);
            }
        }
        return new EquityShareOrderViewState(instrument, account, marketHours, nbboSummary, overrideToExecuteInMarketHoursOnly, checkOverrides, backupWithholdingEstimateAmountResponse, allAccounts, sessionChangeAlertContent, accountNumber, requestInputs, equityOrderContext, loading, formState, reviewing, validationState, lastTradePrice, resultM28549boximpl, immutableList, shouldShowBackupWithholdingEstimate, shouldShowBackupWithholdingWarning, accountNameTitle, accountNameSubtitle, accountSwitcherState, showTwentyFourHourMarketButton, showTwentyFourHourMarketDialog, showLimitOrdersOnlyDialog, side, dataState.getBackupWithholdingEstimateAmount(), mlpExperimentMember, withholdingStatus, collateral, dataState.getShouldShowAccountSwitcher(), loadingNbbo, dataState.getNextEffectiveMarketHours(), dataState.getSellAllButtonLabelStringResource(), dataState.getAvailableSharesForBuyStringResource(), dataState.getSubzeroDescriptionStringResource(), dataState.getBuyingPowerAvailableStringResource(), numM2497xe1ff29cc, configuration, zIsCancelPendingCryptoOrdersLoading, dataState.isMarketBuysEnabled(), dataState.isShortPosition$feature_trade_equity_externalDebug(), dataState.getMicrogramOrderSummary(), dataState.getMicrogramState(), dataState.getFlowSource(), dataState.isCancelNew(), dataState.getTaxLotsTermStringResource(), dataState.getTaxLotsGainLossStringResource(), dataState.getTaxLotsEstCreditStringResource(), dataState.getTaxLotsM1SecondaryStringResource(), dataState.getTaxLotsM1ExperimentMember(), dataState.getSubzeroEnabled(), dataState.getPositionEffect(), dataState.m19351getShortingInfoxLWZpok(), dataState.getResetTooltipKey());
    }
}
