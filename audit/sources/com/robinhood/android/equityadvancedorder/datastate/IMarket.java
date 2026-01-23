package com.robinhood.android.equityadvancedorder.datastate;

import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IMarket.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/IMarket;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "workingConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketNew;", "getWorkingConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketNew;", "completedConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketComplete;", "getCompletedConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$MarketComplete;", "estimatedCostString", "Lcom/robinhood/utils/resource/StringResource;", "getEstimatedCostString", "()Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/equityadvancedorder/datastate/MarketStandard;", "Lcom/robinhood/android/equityadvancedorder/datastate/MarketTaxLots;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface IMarket extends EquityAdvancedOrderDataState {
    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    AdvancedOrder.MarketComplete getCompletedConfiguration();

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    StringResource getEstimatedCostString();

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    AdvancedOrder.MarketNew getWorkingConfiguration();

    /* compiled from: IMarket.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static Account getActiveAccount(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getActiveAccount(iMarket);
        }

        public static Boolean getAdtTradable(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getAdtTradable(iMarket);
        }

        public static EquityAdvancedOrderBottomSheetState getBottomSheetState(IMarket iMarket, Boolean bool, Boolean bool2) {
            return EquityAdvancedOrderDataState.DefaultImpls.getBottomSheetState(iMarket, bool, bool2);
        }

        public static boolean getButtonEnabled(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getButtonEnabled(iMarket);
        }

        public static boolean getButtonLoading(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getButtonLoading(iMarket);
        }

        public static StringResource getEstimateRowTitle(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimateRowTitle(iMarket);
        }

        public static EquityOrderFormRowState getEstimatedCostRow(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimatedCostRow(iMarket);
        }

        public static BigDecimal getNumberOfShares(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getNumberOfShares(iMarket);
        }

        public static StringResource getPrimaryButtonText(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getPrimaryButtonText(iMarket);
        }

        public static OrderRequest2 getQuantityOrAmount(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getQuantityOrAmount(iMarket);
        }

        public static boolean getShouldShowBackupWithholdingWarning(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getShouldShowBackupWithholdingWarning(iMarket);
        }

        public static EquityOrderRequestInputs.StaticInputs getStaticInputs(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getStaticInputs(iMarket);
        }

        public static StringResource getSubtitleStringResource(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getSubtitleStringResource(iMarket);
        }

        public static StringResource getTitleStringResource(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getTitleStringResource(iMarket);
        }

        public static boolean getUserHasMultipleAccounts(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.getUserHasMultipleAccounts(iMarket);
        }

        public static boolean isCancelNewOrder(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.isCancelNewOrder(iMarket);
        }

        public static boolean isShortPosition(IMarket iMarket) {
            return EquityAdvancedOrderDataState.DefaultImpls.isShortPosition(iMarket);
        }

        public static AdvancedOrder.MarketNew getWorkingConfiguration(IMarket iMarket) {
            String accountNumber;
            Account activeAccount = iMarket.getActiveAccount();
            if (activeAccount == null || (accountNumber = activeAccount.getAccountNumber()) == null) {
                accountNumber = iMarket.getCommonState().getAccountNumber();
            }
            return new AdvancedOrder.MarketNew(accountNumber, iMarket.getNumberOfShares(), iMarket instanceof ITaxLots);
        }

        public static AdvancedOrder.MarketComplete getCompletedConfiguration(IMarket iMarket) {
            AdvancedOrder.MarketDraft marketDraftCompletedDraft = iMarket.getWorkingConfiguration().completedDraft();
            if (marketDraftCompletedDraft != null) {
                if (Intrinsics.areEqual(marketDraftCompletedDraft.getShareQuantity(), BigDecimal.ZERO)) {
                    marketDraftCompletedDraft = null;
                }
                if (marketDraftCompletedDraft != null) {
                    return marketDraftCompletedDraft.validated(iMarket.getCommonState().getCheckOverrides(), iMarket.getCommonState().getMicrogramOrderSummary());
                }
            }
            return null;
        }

        public static StringResource getEstimatedCostString(IMarket iMarket) {
            BigDecimal totalCost;
            EquityOrderContext equityOrderContext = iMarket.getEquityOrderContext();
            if (equityOrderContext == null || (totalCost = equityOrderContext.getTotalCost()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(Formats.getAmountFormat().format(totalCost));
        }
    }
}
