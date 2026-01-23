package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equities.tradesettings.utils.CheckAdtTradability;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.ILimit;
import com.robinhood.android.equityadvancedorder.datastate.IMarket;
import com.robinhood.android.equityadvancedorder.datastate.MarketStandard;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Instant;

/* compiled from: EquityAdvancedOrderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;", "<init>", "()V", "reduce", "dataState", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderStateProvider implements StateProvider<EquityAdvancedOrderDataState, EquityAdvancedOrderViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EquityAdvancedOrderViewState reduce(EquityAdvancedOrderDataState dataState) {
        OrderMarketHours tradingSession;
        OrderTimeInForce timeInForce;
        boolean z;
        boolean tooltipWillBeShown;
        boolean z2;
        boolean z3;
        MarketHours currentMarketHours;
        Object obj;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        StringResource actionOrderTypeHeaderLabel = dataState.getActionOrderTypeHeaderLabel();
        EquityOrderConfiguration2 editMode = dataState.getCommonState().getEditMode();
        boolean zIsKeyboardVisible = dataState.getCommonState().isKeyboardVisible();
        EditingField editingField = dataState.getCommonState().getEditingField();
        boolean z4 = dataState instanceof ILimit;
        String userLimitPriceString = z4 ? ((ILimit) dataState).getLimitState().getUserLimitPriceString() : null;
        String numberOfSharesString = dataState.getCommonState().getNumberOfSharesString();
        String accountNumber = dataState.getCommonState().getAccountNumber();
        boolean z5 = dataState instanceof IMarket;
        if (z5) {
            tradingSession = OrderMarketHours.REGULAR_HOURS;
        } else {
            if (!z4) {
                throw new NoWhenBranchMatchedException();
            }
            tradingSession = ((ILimit) dataState).getLimitState().getTradingSession();
        }
        OrderMarketHours orderMarketHours = tradingSession;
        if (z5) {
            timeInForce = OrderTimeInForce.GFD;
        } else {
            if (!z4) {
                throw new NoWhenBranchMatchedException();
            }
            timeInForce = ((ILimit) dataState).getLimitState().getTimeInForce();
        }
        OrderTimeInForce orderTimeInForce = timeInForce;
        boolean loadingAccountSwitcher = dataState.getCommonState().getLoadingAccountSwitcher();
        InstrumentAccountSwitcherState accountSwitcherState = dataState.getAccountSwitcherState();
        ImmutableList<EquityOrderFormRowState> rowStates = dataState.getRowStates();
        if (rowStates == null || !rowStates.isEmpty()) {
            for (EquityOrderFormRowState equityOrderFormRowState : rowStates) {
                z = z4;
                EquityOrderFormRowState.DropdownEdit dropdownEdit = equityOrderFormRowState instanceof EquityOrderFormRowState.DropdownEdit ? (EquityOrderFormRowState.DropdownEdit) equityOrderFormRowState : null;
                if ((dropdownEdit != null ? dropdownEdit.getRowType() : null) == EditingField.ACCOUNT) {
                    accountSwitcherState = null;
                    break;
                }
                z4 = z;
            }
            z = z4;
        } else {
            z = z4;
        }
        ImmutableList<EquityOrderFormRowState> rowStates2 = dataState.getRowStates();
        EquityOrderContext equityOrderContext = dataState.getEquityOrderContext();
        List<String> checkOverrides = dataState.getCommonState().getCheckOverrides();
        EquityAdvancedOrderBottomSheetState bottomSheetState$default = EquityAdvancedOrderDataState.DefaultImpls.getBottomSheetState$default(dataState, dataState.getAdtTradable(), null, 2, null);
        if (z5) {
            tooltipWillBeShown = false;
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            tooltipWillBeShown = ((ILimit) dataState).getTooltipWillBeShown();
        }
        boolean buttonEnabled = dataState.getButtonEnabled();
        boolean buttonLoading = dataState.getButtonLoading();
        boolean zIsShortPosition = dataState.isShortPosition();
        boolean zIsCancelNewOrder = dataState.isCancelNewOrder();
        StringResource primaryButtonText = dataState.getPrimaryButtonText();
        boolean advancedOrderSubmissionExperimentMember = dataState.getCommonState().getAdvancedOrderSubmissionExperimentMember();
        OrderForm6 orderFormState = dataState.getCommonState().getOrderFormState();
        OrderPositionEffect positionEffect = dataState.getCommonState().getPositionEffect();
        GenericAlertContent<GenericAction> sessionChangeAlertContent = dataState.getCommonState().getSessionChangeAlertContent();
        boolean showOvernightShortAlert = dataState.getCommonState().getShowOvernightShortAlert();
        boolean disableChangingOrderTypeForShortSaleInExtendedHours = dataState.getCommonState().getDisableChangingOrderTypeForShortSaleInExtendedHours();
        boolean disableChangingOrderTypeForBuyToCloseSubOneSharePosition = dataState.getCommonState().getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition();
        boolean showTextButton = dataState.getShowTextButton();
        StringResource textButtonText = dataState.getCommonState().getTextButtonText();
        if (dataState instanceof MarketStandard) {
            MarketStandard marketStandard = (MarketStandard) dataState;
            TradingSession tradingSession2 = marketStandard.getCommonState().getTradingSession();
            if (tradingSession2 == null || (currentMarketHours = tradingSession2.getCurrentMarketHours()) == null) {
                z2 = tooltipWillBeShown;
            } else {
                Instant instant = marketStandard.getCommonState().getClock().instant();
                Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                if (currentMarketHours.isInAdtSession(instant)) {
                    Instrument instrument = marketStandard.getCommonState().getInstrument();
                    Iterator<T> it = marketStandard.getCommonState().getAllAccounts().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = tooltipWillBeShown;
                            obj = null;
                            break;
                        }
                        Object next = it.next();
                        z2 = tooltipWillBeShown;
                        if (Intrinsics.areEqual(((Account) next).getAccountNumber(), marketStandard.getCommonState().getAccountNumber())) {
                            obj = next;
                            break;
                        }
                        tooltipWillBeShown = z2;
                    }
                    z3 = Intrinsics.areEqual(CheckAdtTradability.checkAdtTradability(instrument, (Account) obj, EquityOrderSide.BUY), Boolean.TRUE);
                }
            }
        }
        return new EquityAdvancedOrderViewState(accountNumber, actionOrderTypeHeaderLabel, zIsKeyboardVisible, numberOfSharesString, userLimitPriceString, editMode, editingField, loadingAccountSwitcher, accountSwitcherState, orderMarketHours, orderTimeInForce, rowStates2, equityOrderContext, checkOverrides, bottomSheetState$default, z2, buttonEnabled, buttonLoading, zIsShortPosition, zIsCancelNewOrder, primaryButtonText, advancedOrderSubmissionExperimentMember, orderFormState, positionEffect, showTextButton, textButtonText, sessionChangeAlertContent, showOvernightShortAlert, disableChangingOrderTypeForBuyToCloseSubOneSharePosition, disableChangingOrderTypeForShortSaleInExtendedHours, z3);
    }
}
