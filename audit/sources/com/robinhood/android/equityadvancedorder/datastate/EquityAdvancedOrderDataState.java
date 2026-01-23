package com.robinhood.android.equityadvancedorder.datastate;

import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equities.tradesettings.utils.CheckAdtTradability;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.utils.OrderCreateDescriptionTextUtil;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiSalesTax;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.TradingSession2;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.equities.subzero.ShortingInfo2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;

/* compiled from: EquityAdvancedOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001_J5\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010-\u001a\u00020\u0014H&¢\u0006\u0002\u0010.J%\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u00102R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0012\u0010'\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u000b\u00103\u001a\u00020\u00078BX\u0082\u0004R\u0014\u00104\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\tR\u0016\u00106\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0016R\u0014\u0010<\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0016R\u0014\u0010=\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u0004\u0018\u00010BX¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0016R\u0014\u0010O\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\tR\u0016\u0010Q\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\tR\u0016\u0010S\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010V\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010W8BX\u0082\u0004R\u0014\u0010X\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0016R\u0014\u0010Y\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0016R\u0014\u0010[\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0016R\u0016\u00101\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0001\u0003`ab¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "", "commonState", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "getCommonState", "()Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "actionOrderTypeHeaderLabel", "Lcom/robinhood/utils/resource/StringResource;", "getActionOrderTypeHeaderLabel", "()Lcom/robinhood/utils/resource/StringResource;", "titleStringResource", "getTitleStringResource", "subtitleStringResource", "getSubtitleStringResource", "rowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "getRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "readyToAdvanceToDetailEdit", "", "getReadyToAdvanceToDetailEdit", "()Z", "workingConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "getWorkingConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder;", "completedConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "getCompletedConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/AdvancedOrder$Complete;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "tradingHourVisualizerArgs", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getTradingHourVisualizerArgs", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "showTextButton", "getShowTextButton", "getBottomSheetRowStates", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "instrumentIs24HourMarketTradable", "alwaysInclude24HourMarketRow", "useUnifiedTradingSessionSettingsSheet", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lkotlinx/collections/immutable/ImmutableList;", "getBottomSheetState", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;", "adtTradable", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;", "bottomSheetHeaderTitleText", "primaryButtonText", "getPrimaryButtonText", "activeAccount", "Lcom/robinhood/models/db/Account;", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "userHasMultipleAccounts", "getUserHasMultipleAccounts", "isShortPosition", "numberOfShares", "Ljava/math/BigDecimal;", "getNumberOfShares", "()Ljava/math/BigDecimal;", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "staticInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "getStaticInputs", "()Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "quantityOrAmount", "Lcom/robinhood/models/api/QuantityOrAmount;", "getQuantityOrAmount", "()Lcom/robinhood/models/api/QuantityOrAmount;", "shouldShowBackupWithholdingWarning", "getShouldShowBackupWithholdingWarning", "estimateRowTitle", "getEstimateRowTitle", "estimatedCostString", "getEstimatedCostString", "estimatedCostRow", "getEstimatedCostRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "estimatedTotalDailyBorrowFee", "Lkotlin/Result;", "isCancelNewOrder", "buttonLoading", "getButtonLoading", "buttonEnabled", "getButtonEnabled", "getAdtTradable", "()Ljava/lang/Boolean;", "CommonState", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit;", "Lcom/robinhood/android/equityadvancedorder/datastate/IMarket;", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityAdvancedOrderDataState {

    /* compiled from: EquityAdvancedOrderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EditingField.values().length];
            try {
                iArr[EditingField.TRADING_SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditingField.TIME_IN_FORCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditingField.STRATEGY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderConfiguration2.values().length];
            try {
                iArr2[EquityOrderConfiguration2.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderConfiguration2.DETAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EquityOrderSide.values().length];
            try {
                iArr3[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EquityOrderSide.SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    InstrumentAccountSwitcherState getAccountSwitcherState();

    StringResource getActionOrderTypeHeaderLabel();

    Account getActiveAccount();

    Boolean getAdtTradable();

    ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getBottomSheetRowStates(Boolean instrumentIs24HourMarketTradable, Boolean alwaysInclude24HourMarketRow, boolean useUnifiedTradingSessionSettingsSheet);

    EquityAdvancedOrderBottomSheetState getBottomSheetState(Boolean adtTradable, Boolean alwaysInclude24HourMarketRow);

    boolean getButtonEnabled();

    boolean getButtonLoading();

    CommonState getCommonState();

    AdvancedOrder.Complete getCompletedConfiguration();

    EquityOrderContext getEquityOrderContext();

    StringResource getEstimateRowTitle();

    EquityOrderFormRowState getEstimatedCostRow();

    StringResource getEstimatedCostString();

    BigDecimal getNumberOfShares();

    StringResource getPrimaryButtonText();

    OrderRequest2 getQuantityOrAmount();

    boolean getReadyToAdvanceToDetailEdit();

    ImmutableList<EquityOrderFormRowState> getRowStates();

    boolean getShouldShowBackupWithholdingWarning();

    boolean getShowTextButton();

    EquityOrderRequestInputs.StaticInputs getStaticInputs();

    StringResource getSubtitleStringResource();

    StringResource getTitleStringResource();

    SetTradingHourVisualizerArgs getTradingHourVisualizerArgs();

    boolean getUserHasMultipleAccounts();

    AdvancedOrder getWorkingConfiguration();

    boolean isCancelNewOrder();

    boolean isShortPosition();

    /* compiled from: EquityAdvancedOrderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static StringResource getTitleStringResource(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            Instrument instrument = equityAdvancedOrderDataState.getCommonState().getInstrument();
            if (instrument == null) {
                return null;
            }
            if (equityAdvancedOrderDataState.getCommonState().isBuyToClose()) {
                return StringResource.INSTANCE.invoke(C15237R.string.order_create_buy_to_close, instrument.getSymbol());
            }
            return StringResource.INSTANCE.invoke(C15237R.string.order_create_title, EquityAdvancedOrderDataState2.getSideString(equityAdvancedOrderDataState.getCommonState().getSide()), instrument.getSymbol());
        }

        public static StringResource getSubtitleStringResource(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            CommonState commonState = equityAdvancedOrderDataState.getCommonState();
            OrderCreateDescriptionTextUtil orderCreateDescriptionTextUtil = OrderCreateDescriptionTextUtil.INSTANCE;
            Position position = commonState.getPosition();
            EquityOrderSide side = commonState.getSide();
            boolean z = equityAdvancedOrderDataState.getUserHasMultipleAccounts() && !equityAdvancedOrderDataState.isCancelNewOrder();
            InstrumentBuyingPower instrumentBuyingPower = commonState.getInstrumentBuyingPower();
            Account activeAccount = equityAdvancedOrderDataState.getActiveAccount();
            Instrument instrument = commonState.getInstrument();
            Order orderPendingReplacement = commonState.getOrderPendingReplacement();
            OrderPositionEffect positionEffect = commonState.getPositionEffect();
            if (!equityAdvancedOrderDataState.getCommonState().getSubzeroEnabled()) {
                positionEffect = null;
            }
            return orderCreateDescriptionTextUtil.getDescriptionText(position, side, positionEffect, z, null, instrumentBuyingPower, activeAccount, instrument, orderPendingReplacement);
        }

        public static /* synthetic */ ImmutableList getBottomSheetRowStates$default(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Boolean bool, Boolean bool2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBottomSheetRowStates");
            }
            if ((i & 2) != 0) {
                bool2 = Boolean.FALSE;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return equityAdvancedOrderDataState.getBottomSheetRowStates(bool, bool2, z);
        }

        public static /* synthetic */ EquityAdvancedOrderBottomSheetState getBottomSheetState$default(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Boolean bool, Boolean bool2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBottomSheetState");
            }
            if ((i & 2) != 0) {
                bool2 = Boolean.FALSE;
            }
            return equityAdvancedOrderDataState.getBottomSheetState(bool, bool2);
        }

        public static EquityAdvancedOrderBottomSheetState getBottomSheetState(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Boolean bool, Boolean bool2) {
            ImmutableList bottomSheetRowStates$default = getBottomSheetRowStates$default(equityAdvancedOrderDataState, bool, bool2, false, 4, null);
            if (bottomSheetRowStates$default != null) {
                return new EquityAdvancedOrderBottomSheetState(getBottomSheetHeaderTitleText(equityAdvancedOrderDataState), bottomSheetRowStates$default);
            }
            return null;
        }

        private static StringResource getBottomSheetHeaderTitleText(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            EditingField editingField = equityAdvancedOrderDataState.getCommonState().getEditingField();
            int i = editingField == null ? -1 : WhenMappings.$EnumSwitchMapping$0[editingField.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_trading_session_header_title, new Object[0]);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_time_in_force_header_title, new Object[0]);
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C15237R.string.tax_lot_strategy_row_title, new Object[0]);
            }
            return StringResource.INSTANCE.invoke("");
        }

        public static StringResource getPrimaryButtonText(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            if (equityAdvancedOrderDataState instanceof ITaxLots) {
                if (((ITaxLots) equityAdvancedOrderDataState).getTaxLotsState().getTaxLotM1ExperimentMember()) {
                    if (equityAdvancedOrderDataState.getCommonState().isKeyboardVisible()) {
                        return StringResource.INSTANCE.invoke(C11048R.string.general_label_done, new Object[0]);
                    }
                    return StringResource.INSTANCE.invoke(C15237R.string.tax_lots_m1_order_form_button_text, new Object[0]);
                }
                return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
            }
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitStandard)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
            int i = WhenMappings.$EnumSwitchMapping$1[limitStandard.getCommonState().getEditMode().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (limitStandard.getCommonState().isKeyboardVisible()) {
                return StringResource.INSTANCE.invoke(C11048R.string.general_label_done, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
        }

        public static Account getActiveAccount(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            Object next;
            CommonState commonState = equityAdvancedOrderDataState.getCommonState();
            Iterator<T> it = commonState.getAllAccounts().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Account) next).getAccountNumber(), commonState.getAccountNumber())) {
                    break;
                }
            }
            return (Account) next;
        }

        public static boolean getUserHasMultipleAccounts(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            return equityAdvancedOrderDataState.getCommonState().getAllAccounts().size() > 1;
        }

        public static boolean isShortPosition(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            return Position5.isShortPosition(equityAdvancedOrderDataState.getCommonState().getPosition());
        }

        public static BigDecimal getNumberOfShares(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            BigDecimal bigDecimalOrNull;
            String numberOfSharesString = equityAdvancedOrderDataState.getCommonState().getNumberOfSharesString();
            if (numberOfSharesString != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(numberOfSharesString)) != null) {
                return bigDecimalOrNull;
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }

        public static EquityOrderRequestInputs.StaticInputs getStaticInputs(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            CommonState commonState = equityAdvancedOrderDataState.getCommonState();
            Instrument instrument = commonState.getInstrument();
            UUID id = instrument != null ? instrument.getId() : null;
            if (id == null) {
                throw new IllegalStateException("Required value was null.");
            }
            EquityOrderSide side = commonState.getSide();
            EquityOrderFlowSource flowSource = commonState.getFlowSource();
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            return new EquityOrderRequestInputs.StaticInputs(id, false, side, flowSource, uuidRandomUUID);
        }

        public static OrderRequest2 getQuantityOrAmount(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            return new OrderRequest2.ShareQuantity(equityAdvancedOrderDataState.getNumberOfShares());
        }

        public static boolean getShouldShowBackupWithholdingWarning(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            return equityAdvancedOrderDataState.getCommonState().isBackupWithheld() && equityAdvancedOrderDataState.getCommonState().getSide().isSell();
        }

        public static StringResource getEstimateRowTitle(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            if (equityAdvancedOrderDataState.getCommonState().getSide() == EquityOrderSide.BUY) {
                return StringResource.INSTANCE.invoke(C15237R.string.order_create_estimated_cost_row_title, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C15237R.string.order_create_estimated_credit_row_title, new Object[0]);
        }

        public static StringResource getEstimatedCostString(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            BigDecimal totalCost;
            EquityOrderContext equityOrderContext = equityAdvancedOrderDataState.getEquityOrderContext();
            if (equityOrderContext == null || (totalCost = equityOrderContext.getTotalCost()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(Formats.getAmountFormat().format(totalCost));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static EquityOrderFormRowState getEstimatedCostRow(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            ImmutableList immutableList;
            boolean subzeroEnabled;
            List<ApiSalesTax> salesTaxes;
            StringResource estimatedCostString = equityAdvancedOrderDataState.getEstimatedCostString();
            Result resultM28549boximpl = null;
            if (estimatedCostString == null) {
                return null;
            }
            Result<ApiEstimatedFees> resultM13792getEstimatedFeesxLWZpok = equityAdvancedOrderDataState.getCommonState().m13792getEstimatedFeesxLWZpok();
            if (resultM13792getEstimatedFeesxLWZpok != null) {
                Object value = resultM13792getEstimatedFeesxLWZpok.getValue();
                if (Result.m28555isFailureimpl(value)) {
                    value = null;
                }
                ApiEstimatedFees apiEstimatedFees = (ApiEstimatedFees) value;
                immutableList = (apiEstimatedFees == null || (salesTaxes = apiEstimatedFees.getSalesTaxes()) == null) ? null : extensions2.toImmutableList(salesTaxes);
            }
            int i = WhenMappings.$EnumSwitchMapping$2[equityAdvancedOrderDataState.getCommonState().getSide().ordinal()];
            if (i == 1) {
                subzeroEnabled = true;
            } else if (i == 2) {
                subzeroEnabled = equityAdvancedOrderDataState.getCommonState().getSubzeroEnabled();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (immutableList == null || !(!immutableList.isEmpty())) {
                    subzeroEnabled = false;
                }
            }
            if (subzeroEnabled) {
                StringResource estimateRowTitle = equityAdvancedOrderDataState.getEstimateRowTitle();
                BigDecimal bigDecimalOrZero = BigDecimals7.orZero(equityAdvancedOrderDataState.getQuantityOrAmount().shareQuantityOrNull());
                EquityOrderContext equityOrderContext = equityAdvancedOrderDataState.getEquityOrderContext();
                BigDecimal estimatedCost = equityOrderContext != null ? equityOrderContext.getEstimatedCost() : null;
                Result<ApiEstimatedFees> resultM13792getEstimatedFeesxLWZpok2 = equityAdvancedOrderDataState.getCommonState().m13792getEstimatedFeesxLWZpok();
                if (resultM13792getEstimatedFeesxLWZpok2 != null) {
                    Object value2 = resultM13792getEstimatedFeesxLWZpok2.getValue();
                    if (Result.m28556isSuccessimpl(value2)) {
                        value2 = ((ApiEstimatedFees) value2).getTotalFee();
                    }
                    resultM28549boximpl = Result.m28549boximpl(Result.m28550constructorimpl(value2));
                }
                return new EquityOrderFormRowState.ExpandableEstimatedCost(estimateRowTitle, estimatedCostString, bigDecimalOrZero, estimatedCost, resultM28549boximpl, immutableList, equityAdvancedOrderDataState.getCommonState().getSide() == EquityOrderSide.SELL_SHORT, m13794getEstimatedTotalDailyBorrowFeexLWZpok(equityAdvancedOrderDataState), 0, 256, null);
            }
            StringResource estimateRowTitle2 = equityAdvancedOrderDataState.getEstimateRowTitle();
            StringResource.Companion companion = StringResource.INSTANCE;
            return new EquityOrderFormRowState.Information(EquityOrderFormRowState2.EstimatedCostRowTestTag, estimateRowTitle2, estimatedCostString, null, true, equityAdvancedOrderDataState.getShouldShowBackupWithholdingWarning() ? companion.invoke(C15237R.string.order_create_backup_withholding_warning, new Object[0]) : null, equityAdvancedOrderDataState.getShouldShowBackupWithholdingWarning() ? new EquityOrderFormRowState.Icon(ServerToBentoAssetMapper2.QUESTION_16, companion.invoke(C15237R.string.order_create_backup_withholding_info, new Object[0]), EquityOrderFormRowState.Icon.IconId.BACKUP_WITHHOLDING) : null, false, true, 136, null);
        }

        /* renamed from: getEstimatedTotalDailyBorrowFee-xLWZpok, reason: not valid java name */
        private static Result<BigDecimal> m13794getEstimatedTotalDailyBorrowFeexLWZpok(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            Object objM28550constructorimpl;
            Result<ShortingInfo> resultM13793getShortingInfoxLWZpok = equityAdvancedOrderDataState.getCommonState().m13793getShortingInfoxLWZpok();
            if (resultM13793getShortingInfoxLWZpok != null) {
                Object value = resultM13793getShortingInfoxLWZpok.getValue();
                if (Result.m28555isFailureimpl(value)) {
                    value = null;
                }
                ShortingInfo shortingInfo = (ShortingInfo) value;
                if (shortingInfo != null && shortingInfo.getFee() != null) {
                    Result<ShortingInfo> resultM13793getShortingInfoxLWZpok2 = equityAdvancedOrderDataState.getCommonState().m13793getShortingInfoxLWZpok();
                    if (resultM13793getShortingInfoxLWZpok2 == null) {
                        return null;
                    }
                    Object value2 = resultM13793getShortingInfoxLWZpok2.getValue();
                    if (Result.m28556isSuccessimpl(value2)) {
                        ShortingInfo shortingInfo2 = (ShortingInfo) value2;
                        BigDecimal numberOfShares = equityAdvancedOrderDataState.getNumberOfShares();
                        EquityOrderContext equityOrderContext = equityAdvancedOrderDataState.getEquityOrderContext();
                        objM28550constructorimpl = Result.m28550constructorimpl(ShortingInfo2.calculateTradeFlowDailyFee(shortingInfo2, numberOfShares, BigDecimals7.orZero(equityOrderContext != null ? equityOrderContext.getEstimatedCost() : null)));
                    } else {
                        objM28550constructorimpl = Result.m28550constructorimpl(value2);
                    }
                    return Result.m28549boximpl(objM28550constructorimpl);
                }
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(new Exception("Null fee"))));
        }

        public static boolean isCancelNewOrder(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            return equityAdvancedOrderDataState.getCommonState().getOrderToReplaceId() != null;
        }

        public static boolean getButtonLoading(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            return equityAdvancedOrderDataState.getCommonState().getValidationState() instanceof ValidationState.Validating;
        }

        public static boolean getButtonEnabled(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            return equityAdvancedOrderDataState.getReadyToAdvanceToDetailEdit();
        }

        public static Boolean getAdtTradable(EquityAdvancedOrderDataState equityAdvancedOrderDataState) {
            CommonState commonState = equityAdvancedOrderDataState.getCommonState();
            return CheckAdtTradability.checkAdtTradability(commonState.getInstrument(), equityAdvancedOrderDataState.getActiveAccount(), commonState.getSide());
        }
    }

    /* compiled from: EquityAdvancedOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\b\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001c\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\b\b\u0002\u00102\u001a\u00020\n\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020\n\u0012\b\b\u0002\u00108\u001a\u00020\n\u0012\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;09\u0012\u0006\u0010=\u001a\u000203\u0012\b\b\u0002\u0010>\u001a\u00020\n\u0012\b\b\u0002\u0010@\u001a\u00020?\u0012\b\b\u0002\u0010A\u001a\u00020\n\u0012\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u0015\u0012\u0006\u0010E\u001a\u00020D\u0012\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\b\b\u0002\u0010G\u001a\u00020\n\u0012\b\b\u0002\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bX\u0010OJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0018\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0010\u0010b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bb\u0010UJ\u0010\u0010c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bc\u0010UJ\u0012\u0010d\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0016\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020!HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020#0\u001cHÆ\u0003¢\u0006\u0004\bl\u0010gJ\u0012\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bm\u0010OJ\u0010\u0010n\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bn\u0010UJ\u0010\u0010o\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bo\u0010UJ\u0016\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cHÆ\u0003¢\u0006\u0004\bp\u0010gJ\u0010\u0010q\u001a\u00020)HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0012\u0010s\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bs\u0010tJ\u0012\u0010u\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bu\u0010vJ\u0018\u0010w\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\nHÆ\u0003¢\u0006\u0004\by\u0010UJ\u0012\u0010z\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0012\u0010|\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0004\b|\u0010}J\u0010\u0010~\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b~\u0010UJ\u0010\u0010\u007f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u007f\u0010UJ\u001f\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;09HÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u000203HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010{J\u0012\u0010\u0083\u0001\u001a\u00020\nHÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010UJ\u0013\u0010\u0084\u0001\u001a\u00020?HÆ\u0003¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0012\u0010\u0086\u0001\u001a\u00020\nHÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010UJ\u001a\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u0015HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010`J\u0013\u0010\u0089\u0001\u001a\u00020DHÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0018\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010gJ\u0012\u0010\u008c\u0001\u001a\u00020\nHÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010UJ\u0013\u0010\u008d\u0001\u001a\u00020HHÆ\u0003¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0083\u0004\u0010\u008f\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\n2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\b\b\u0002\u00102\u001a\u00020\n2\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u00107\u001a\u00020\n2\b\b\u0002\u00108\u001a\u00020\n2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;092\b\b\u0002\u0010=\u001a\u0002032\b\b\u0002\u0010>\u001a\u00020\n2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020\n2\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u00152\b\b\u0002\u0010E\u001a\u00020D2\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010G\u001a\u00020\n2\b\b\u0002\u0010I\u001a\u00020HHÆ\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\u0004HÖ\u0001¢\u0006\u0005\b\u0091\u0001\u0010OJ\u0014\u0010\u0093\u0001\u001a\u00030\u0092\u0001HÖ\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\n2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010MR\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010OR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010QR\u0019\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010SR\u0018\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\r\n\u0005\b\u000b\u0010 \u0001\u001a\u0004\b\u000b\u0010UR\u001b\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\r\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010WR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u009a\u0001\u001a\u0005\b£\u0001\u0010OR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010ZR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010¦\u0001\u001a\u0005\b§\u0001\u0010\\R\u0019\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010¨\u0001\u001a\u0005\b©\u0001\u0010^R!\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010ª\u0001\u001a\u0005\b«\u0001\u0010`R\u0018\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\r\n\u0005\b\u0018\u0010 \u0001\u001a\u0004\b\u0018\u0010UR\u0019\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010 \u0001\u001a\u0005\b¬\u0001\u0010UR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010eR\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010¯\u0001\u001a\u0005\b°\u0001\u0010gR\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010±\u0001\u001a\u0005\b²\u0001\u0010iR\u0019\u0010\"\u001a\u00020!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010³\u0001\u001a\u0005\b´\u0001\u0010kR\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001c8\u0006¢\u0006\u000e\n\u0005\b$\u0010¯\u0001\u001a\u0005\bµ\u0001\u0010gR\u001b\u0010%\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b%\u0010\u009a\u0001\u001a\u0005\b¶\u0001\u0010OR\u0019\u0010&\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b&\u0010 \u0001\u001a\u0005\b·\u0001\u0010UR\u0019\u0010'\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b'\u0010 \u0001\u001a\u0005\b¸\u0001\u0010UR\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0006¢\u0006\u000e\n\u0005\b(\u0010¯\u0001\u001a\u0005\b¹\u0001\u0010gR\u0019\u0010*\u001a\u00020)8\u0006¢\u0006\u000e\n\u0005\b*\u0010º\u0001\u001a\u0005\b»\u0001\u0010rR\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010¼\u0001\u001a\u0005\b½\u0001\u0010tR\u001b\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\u000e\n\u0005\b.\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010vR!\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006¢\u0006\u000e\n\u0005\b1\u0010À\u0001\u001a\u0005\bÁ\u0001\u0010xR\u0019\u00102\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b2\u0010 \u0001\u001a\u0005\bÂ\u0001\u0010UR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\b4\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010{R\u001b\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\u000e\n\u0005\b6\u0010Å\u0001\u001a\u0005\bÆ\u0001\u0010}R\u0019\u00107\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b7\u0010 \u0001\u001a\u0005\bÇ\u0001\u0010UR\u0019\u00108\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b8\u0010 \u0001\u001a\u0005\bÈ\u0001\u0010UR&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;098\u0006¢\u0006\u000f\n\u0005\b<\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010\u0081\u0001R\u0019\u0010=\u001a\u0002038\u0006¢\u0006\u000e\n\u0005\b=\u0010Ã\u0001\u001a\u0005\bË\u0001\u0010{R\u0019\u0010>\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b>\u0010 \u0001\u001a\u0005\bÌ\u0001\u0010UR\u001a\u0010@\u001a\u00020?8\u0006¢\u0006\u000f\n\u0005\b@\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010\u0085\u0001R\u0019\u0010A\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bA\u0010 \u0001\u001a\u0005\bÏ\u0001\u0010UR!\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\bC\u0010ª\u0001\u001a\u0005\bÐ\u0001\u0010`R\u001a\u0010E\u001a\u00020D8\u0006¢\u0006\u000f\n\u0005\bE\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010\u008a\u0001R\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\u000e\n\u0005\bF\u0010¯\u0001\u001a\u0005\bÓ\u0001\u0010gR\u0019\u0010G\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bG\u0010 \u0001\u001a\u0005\bÔ\u0001\u0010UR\u001a\u0010I\u001a\u00020H8\u0006¢\u0006\u000f\n\u0005\bI\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010\u008e\u0001R\u0015\u0010Ú\u0001\u001a\u00030×\u00018F¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0013\u0010Û\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010UR\u0015\u0010ß\u0001\u001a\u00030Ü\u00018F¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0013\u0010á\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\bà\u0001\u0010UR\u0013\u0010ã\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010U¨\u0006ä\u0001"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "", "Lcom/robinhood/models/db/Instrument;", "instrument", "", "accountNumber", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "nbboSummary", "Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "editMode", "", "isKeyboardVisible", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "editingField", "numberOfSharesString", "Lcom/robinhood/models/db/Quote;", "quote", "Lcom/robinhood/models/db/Position;", "position", "Lcom/robinhood/models/db/EquityOrderSide;", "side", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiEstimatedFees;", "estimatedFees", "isBackupWithheld", "loadingAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "accountSwitcher", "", "Lcom/robinhood/models/db/Account;", "allAccounts", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "instrumentBuyingPower", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "validationState", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "silentActionsTaken", "microgramOrderSummary", "overrideFlipIpoAccessShares", "overrideToExecuteInMarketHoursOnly", "checkOverrides", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "flowSource", "Lcom/robinhood/models/db/TradingSession;", "tradingSession", "Lcom/robinhood/models/db/MarketHours;", "nextMarketHours", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "sessionChangeAlertContent", "showOvernightShortAlert", "Ljava/util/UUID;", "orderToReplaceId", "Lcom/robinhood/models/db/Order;", "orderPendingReplacement", "advancedMarketOrdersEnabled", "marketBuysEnabled", "Lkotlin/Function1;", "Lcom/robinhood/models/db/Order$Configuration;", "", "onSwitchOrderConfiguration", "refId", "advancedOrderSubmissionExperimentMember", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "orderFormState", "subzeroEnabled", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "shortingInfo", "j$/time/Clock", Card.Icon.CLOCK, "accountsWithAccessToMargin", "useSduiAccountSwitcher", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "experimentVariant", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;Lcom/robinhood/nbbo/models/db/NbboSummary;Lcom/robinhood/android/trading/contracts/configuration/EditMode;ZLcom/robinhood/android/advancedorderbottomsheet/EditingField;Ljava/lang/String;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/EquityOrderSide;Lkotlin/Result;ZZLcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;Ljava/util/List;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/android/equity/ordercheck/ValidationState;Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;ZLjava/util/UUID;Lcom/robinhood/models/db/Order;ZZLkotlin/jvm/functions/Function1;Ljava/util/UUID;ZLcom/robinhood/shared/trading/tradeflow/OrderFormState;ZLkotlin/Result;Lj$/time/Clock;Ljava/util/List;ZLcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;)V", "component1", "()Lcom/robinhood/models/db/Instrument;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "component4", "()Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "component5", "()Z", "component6", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "component7", "component8", "()Lcom/robinhood/models/db/Quote;", "component9", "()Lcom/robinhood/models/db/Position;", "component10", "()Lcom/robinhood/models/db/EquityOrderSide;", "component11-xLWZpok", "()Lkotlin/Result;", "component11", "component12", "component13", "component14", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "component15", "()Ljava/util/List;", "component16", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "component17", "()Lcom/robinhood/android/equity/ordercheck/ValidationState;", "component18", "component19", "component20", "component21", "component22", "component23", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "component24", "()Lcom/robinhood/models/db/TradingSession;", "component25", "()Lcom/robinhood/models/db/MarketHours;", "component26", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component27", "component28", "()Ljava/util/UUID;", "component29", "()Lcom/robinhood/models/db/Order;", "component30", "component31", "component32", "()Lkotlin/jvm/functions/Function1;", "component33", "component34", "component35", "()Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "component36", "component37-xLWZpok", "component37", "component38", "()Lj$/time/Clock;", "component39", "component40", "component41", "()Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "copy", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;Lcom/robinhood/nbbo/models/db/NbboSummary;Lcom/robinhood/android/trading/contracts/configuration/EditMode;ZLcom/robinhood/android/advancedorderbottomsheet/EditingField;Ljava/lang/String;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/EquityOrderSide;Lkotlin/Result;ZZLcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;Ljava/util/List;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/android/equity/ordercheck/ValidationState;Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;ZLjava/util/UUID;Lcom/robinhood/models/db/Order;ZZLkotlin/jvm/functions/Function1;Ljava/util/UUID;ZLcom/robinhood/shared/trading/tradeflow/OrderFormState;ZLkotlin/Result;Lj$/time/Clock;Ljava/util/List;ZLcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;)Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "getNbboSummary", "Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "getEditMode", "Z", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getEditingField", "getNumberOfSharesString", "Lcom/robinhood/models/db/Quote;", "getQuote", "Lcom/robinhood/models/db/Position;", "getPosition", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "Lkotlin/Result;", "getEstimatedFees-xLWZpok", "getLoadingAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "getAccountSwitcher", "Ljava/util/List;", "getAllAccounts", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "getInstrumentBuyingPower", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "getValidationState", "getSilentActionsTaken", "getMicrogramOrderSummary", "getOverrideFlipIpoAccessShares", "getOverrideToExecuteInMarketHoursOnly", "getCheckOverrides", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getFlowSource", "Lcom/robinhood/models/db/TradingSession;", "getTradingSession", "Lcom/robinhood/models/db/MarketHours;", "getNextMarketHours", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getSessionChangeAlertContent", "getShowOvernightShortAlert", "Ljava/util/UUID;", "getOrderToReplaceId", "Lcom/robinhood/models/db/Order;", "getOrderPendingReplacement", "getAdvancedMarketOrdersEnabled", "getMarketBuysEnabled", "Lkotlin/jvm/functions/Function1;", "getOnSwitchOrderConfiguration", "getRefId", "getAdvancedOrderSubmissionExperimentMember", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getOrderFormState", "getSubzeroEnabled", "getShortingInfo-xLWZpok", "Lj$/time/Clock;", "getClock", "getAccountsWithAccessToMargin", "getUseSduiAccountSwitcher", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;", "getExperimentVariant", "Lcom/robinhood/models/db/OrderPositionEffect;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "positionEffect", "isBuyToClose", "Lcom/robinhood/utils/resource/StringResource;", "getTextButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "textButtonText", "getDisableChangingOrderTypeForShortSaleInExtendedHours", "disableChangingOrderTypeForShortSaleInExtendedHours", "getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition", "disableChangingOrderTypeForBuyToCloseSubOneSharePosition", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CommonState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final InstrumentAccountSwitcher accountSwitcher;
        private final List<Account> accountsWithAccessToMargin;
        private final boolean advancedMarketOrdersEnabled;
        private final boolean advancedOrderSubmissionExperimentMember;
        private final List<Account> allAccounts;
        private final List<String> checkOverrides;
        private final Clock clock;
        private final EquityOrderConfiguration2 editMode;
        private final EditingField editingField;
        private final Result<ApiEstimatedFees> estimatedFees;
        private final TradingSessionSubtitleExperiment.Variant experimentVariant;
        private final EquityOrderFlowSource flowSource;
        private final Instrument instrument;
        private final InstrumentBuyingPower instrumentBuyingPower;
        private final boolean isBackupWithheld;
        private final boolean isKeyboardVisible;
        private final boolean loadingAccountSwitcher;
        private final boolean marketBuysEnabled;
        private final String microgramOrderSummary;
        private final NbboSummary nbboSummary;
        private final MarketHours nextMarketHours;
        private final String numberOfSharesString;
        private final Function1<Order.Configuration, Unit> onSwitchOrderConfiguration;
        private final OrderForm6 orderFormState;
        private final Order orderPendingReplacement;
        private final UUID orderToReplaceId;
        private final boolean overrideFlipIpoAccessShares;
        private final boolean overrideToExecuteInMarketHoursOnly;
        private final Position position;
        private final Quote quote;
        private final UUID refId;
        private final GenericAlertContent<GenericAction> sessionChangeAlertContent;
        private final Result<ShortingInfo> shortingInfo;
        private final boolean showOvernightShortAlert;
        private final EquityOrderSide side;
        private final List<GenericOrderCheckAction> silentActionsTaken;
        private final boolean subzeroEnabled;
        private final TradingSession tradingSession;
        private final boolean useSduiAccountSwitcher;
        private final ValidationState validationState;

        /* compiled from: EquityAdvancedOrderDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component10, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component11-xLWZpok, reason: not valid java name */
        public final Result<ApiEstimatedFees> m13790component11xLWZpok() {
            return this.estimatedFees;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsBackupWithheld() {
            return this.isBackupWithheld;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getLoadingAccountSwitcher() {
            return this.loadingAccountSwitcher;
        }

        /* renamed from: component14, reason: from getter */
        public final InstrumentAccountSwitcher getAccountSwitcher() {
            return this.accountSwitcher;
        }

        public final List<Account> component15() {
            return this.allAccounts;
        }

        /* renamed from: component16, reason: from getter */
        public final InstrumentBuyingPower getInstrumentBuyingPower() {
            return this.instrumentBuyingPower;
        }

        /* renamed from: component17, reason: from getter */
        public final ValidationState getValidationState() {
            return this.validationState;
        }

        public final List<GenericOrderCheckAction> component18() {
            return this.silentActionsTaken;
        }

        /* renamed from: component19, reason: from getter */
        public final String getMicrogramOrderSummary() {
            return this.microgramOrderSummary;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getOverrideFlipIpoAccessShares() {
            return this.overrideFlipIpoAccessShares;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getOverrideToExecuteInMarketHoursOnly() {
            return this.overrideToExecuteInMarketHoursOnly;
        }

        public final List<String> component22() {
            return this.checkOverrides;
        }

        /* renamed from: component23, reason: from getter */
        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /* renamed from: component24, reason: from getter */
        public final TradingSession getTradingSession() {
            return this.tradingSession;
        }

        /* renamed from: component25, reason: from getter */
        public final MarketHours getNextMarketHours() {
            return this.nextMarketHours;
        }

        public final GenericAlertContent<GenericAction> component26() {
            return this.sessionChangeAlertContent;
        }

        /* renamed from: component27, reason: from getter */
        public final boolean getShowOvernightShortAlert() {
            return this.showOvernightShortAlert;
        }

        /* renamed from: component28, reason: from getter */
        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }

        /* renamed from: component29, reason: from getter */
        public final Order getOrderPendingReplacement() {
            return this.orderPendingReplacement;
        }

        /* renamed from: component3, reason: from getter */
        public final NbboSummary getNbboSummary() {
            return this.nbboSummary;
        }

        /* renamed from: component30, reason: from getter */
        public final boolean getAdvancedMarketOrdersEnabled() {
            return this.advancedMarketOrdersEnabled;
        }

        /* renamed from: component31, reason: from getter */
        public final boolean getMarketBuysEnabled() {
            return this.marketBuysEnabled;
        }

        public final Function1<Order.Configuration, Unit> component32() {
            return this.onSwitchOrderConfiguration;
        }

        /* renamed from: component33, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        /* renamed from: component34, reason: from getter */
        public final boolean getAdvancedOrderSubmissionExperimentMember() {
            return this.advancedOrderSubmissionExperimentMember;
        }

        /* renamed from: component35, reason: from getter */
        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        /* renamed from: component36, reason: from getter */
        public final boolean getSubzeroEnabled() {
            return this.subzeroEnabled;
        }

        /* renamed from: component37-xLWZpok, reason: not valid java name */
        public final Result<ShortingInfo> m13791component37xLWZpok() {
            return this.shortingInfo;
        }

        /* renamed from: component38, reason: from getter */
        public final Clock getClock() {
            return this.clock;
        }

        public final List<Account> component39() {
            return this.accountsWithAccessToMargin;
        }

        /* renamed from: component4, reason: from getter */
        public final EquityOrderConfiguration2 getEditMode() {
            return this.editMode;
        }

        /* renamed from: component40, reason: from getter */
        public final boolean getUseSduiAccountSwitcher() {
            return this.useSduiAccountSwitcher;
        }

        /* renamed from: component41, reason: from getter */
        public final TradingSessionSubtitleExperiment.Variant getExperimentVariant() {
            return this.experimentVariant;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsKeyboardVisible() {
            return this.isKeyboardVisible;
        }

        /* renamed from: component6, reason: from getter */
        public final EditingField getEditingField() {
            return this.editingField;
        }

        /* renamed from: component7, reason: from getter */
        public final String getNumberOfSharesString() {
            return this.numberOfSharesString;
        }

        /* renamed from: component8, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        /* renamed from: component9, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        public final CommonState copy(Instrument instrument, String accountNumber, NbboSummary nbboSummary, EquityOrderConfiguration2 editMode, boolean isKeyboardVisible, EditingField editingField, String numberOfSharesString, Quote quote, Position position, EquityOrderSide side, Result<ApiEstimatedFees> estimatedFees, boolean isBackupWithheld, boolean loadingAccountSwitcher, InstrumentAccountSwitcher accountSwitcher, List<Account> allAccounts, InstrumentBuyingPower instrumentBuyingPower, ValidationState validationState, List<? extends GenericOrderCheckAction> silentActionsTaken, String microgramOrderSummary, boolean overrideFlipIpoAccessShares, boolean overrideToExecuteInMarketHoursOnly, List<String> checkOverrides, EquityOrderFlowSource flowSource, TradingSession tradingSession, MarketHours nextMarketHours, GenericAlertContent<? extends GenericAction> sessionChangeAlertContent, boolean showOvernightShortAlert, UUID orderToReplaceId, Order orderPendingReplacement, boolean advancedMarketOrdersEnabled, boolean marketBuysEnabled, Function1<? super Order.Configuration, Unit> onSwitchOrderConfiguration, UUID refId, boolean advancedOrderSubmissionExperimentMember, OrderForm6 orderFormState, boolean subzeroEnabled, Result<ShortingInfo> shortingInfo, Clock clock, List<Account> accountsWithAccessToMargin, boolean useSduiAccountSwitcher, TradingSessionSubtitleExperiment.Variant experimentVariant) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(editMode, "editMode");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
            Intrinsics.checkNotNullParameter(validationState, "validationState");
            Intrinsics.checkNotNullParameter(silentActionsTaken, "silentActionsTaken");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(onSwitchOrderConfiguration, "onSwitchOrderConfiguration");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(accountsWithAccessToMargin, "accountsWithAccessToMargin");
            Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
            return new CommonState(instrument, accountNumber, nbboSummary, editMode, isKeyboardVisible, editingField, numberOfSharesString, quote, position, side, estimatedFees, isBackupWithheld, loadingAccountSwitcher, accountSwitcher, allAccounts, instrumentBuyingPower, validationState, silentActionsTaken, microgramOrderSummary, overrideFlipIpoAccessShares, overrideToExecuteInMarketHoursOnly, checkOverrides, flowSource, tradingSession, nextMarketHours, sessionChangeAlertContent, showOvernightShortAlert, orderToReplaceId, orderPendingReplacement, advancedMarketOrdersEnabled, marketBuysEnabled, onSwitchOrderConfiguration, refId, advancedOrderSubmissionExperimentMember, orderFormState, subzeroEnabled, shortingInfo, clock, accountsWithAccessToMargin, useSduiAccountSwitcher, experimentVariant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonState)) {
                return false;
            }
            CommonState commonState = (CommonState) other;
            return Intrinsics.areEqual(this.instrument, commonState.instrument) && Intrinsics.areEqual(this.accountNumber, commonState.accountNumber) && Intrinsics.areEqual(this.nbboSummary, commonState.nbboSummary) && this.editMode == commonState.editMode && this.isKeyboardVisible == commonState.isKeyboardVisible && this.editingField == commonState.editingField && Intrinsics.areEqual(this.numberOfSharesString, commonState.numberOfSharesString) && Intrinsics.areEqual(this.quote, commonState.quote) && Intrinsics.areEqual(this.position, commonState.position) && this.side == commonState.side && Intrinsics.areEqual(this.estimatedFees, commonState.estimatedFees) && this.isBackupWithheld == commonState.isBackupWithheld && this.loadingAccountSwitcher == commonState.loadingAccountSwitcher && Intrinsics.areEqual(this.accountSwitcher, commonState.accountSwitcher) && Intrinsics.areEqual(this.allAccounts, commonState.allAccounts) && Intrinsics.areEqual(this.instrumentBuyingPower, commonState.instrumentBuyingPower) && Intrinsics.areEqual(this.validationState, commonState.validationState) && Intrinsics.areEqual(this.silentActionsTaken, commonState.silentActionsTaken) && Intrinsics.areEqual(this.microgramOrderSummary, commonState.microgramOrderSummary) && this.overrideFlipIpoAccessShares == commonState.overrideFlipIpoAccessShares && this.overrideToExecuteInMarketHoursOnly == commonState.overrideToExecuteInMarketHoursOnly && Intrinsics.areEqual(this.checkOverrides, commonState.checkOverrides) && this.flowSource == commonState.flowSource && Intrinsics.areEqual(this.tradingSession, commonState.tradingSession) && Intrinsics.areEqual(this.nextMarketHours, commonState.nextMarketHours) && Intrinsics.areEqual(this.sessionChangeAlertContent, commonState.sessionChangeAlertContent) && this.showOvernightShortAlert == commonState.showOvernightShortAlert && Intrinsics.areEqual(this.orderToReplaceId, commonState.orderToReplaceId) && Intrinsics.areEqual(this.orderPendingReplacement, commonState.orderPendingReplacement) && this.advancedMarketOrdersEnabled == commonState.advancedMarketOrdersEnabled && this.marketBuysEnabled == commonState.marketBuysEnabled && Intrinsics.areEqual(this.onSwitchOrderConfiguration, commonState.onSwitchOrderConfiguration) && Intrinsics.areEqual(this.refId, commonState.refId) && this.advancedOrderSubmissionExperimentMember == commonState.advancedOrderSubmissionExperimentMember && this.orderFormState == commonState.orderFormState && this.subzeroEnabled == commonState.subzeroEnabled && Intrinsics.areEqual(this.shortingInfo, commonState.shortingInfo) && Intrinsics.areEqual(this.clock, commonState.clock) && Intrinsics.areEqual(this.accountsWithAccessToMargin, commonState.accountsWithAccessToMargin) && this.useSduiAccountSwitcher == commonState.useSduiAccountSwitcher && this.experimentVariant == commonState.experimentVariant;
        }

        public int hashCode() {
            Instrument instrument = this.instrument;
            int iHashCode = (((instrument == null ? 0 : instrument.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
            NbboSummary nbboSummary = this.nbboSummary;
            int iHashCode2 = (((((iHashCode + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + this.editMode.hashCode()) * 31) + Boolean.hashCode(this.isKeyboardVisible)) * 31;
            EditingField editingField = this.editingField;
            int iHashCode3 = (iHashCode2 + (editingField == null ? 0 : editingField.hashCode())) * 31;
            String str = this.numberOfSharesString;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Quote quote = this.quote;
            int iHashCode5 = (iHashCode4 + (quote == null ? 0 : quote.hashCode())) * 31;
            Position position = this.position;
            int iHashCode6 = (((iHashCode5 + (position == null ? 0 : position.hashCode())) * 31) + this.side.hashCode()) * 31;
            Result<ApiEstimatedFees> result = this.estimatedFees;
            int iM28554hashCodeimpl = (((((iHashCode6 + (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue()))) * 31) + Boolean.hashCode(this.isBackupWithheld)) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31;
            InstrumentAccountSwitcher instrumentAccountSwitcher = this.accountSwitcher;
            int iHashCode7 = (((iM28554hashCodeimpl + (instrumentAccountSwitcher == null ? 0 : instrumentAccountSwitcher.hashCode())) * 31) + this.allAccounts.hashCode()) * 31;
            InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
            int iHashCode8 = (((((iHashCode7 + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31) + this.validationState.hashCode()) * 31) + this.silentActionsTaken.hashCode()) * 31;
            String str2 = this.microgramOrderSummary;
            int iHashCode9 = (((((((((iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.overrideFlipIpoAccessShares)) * 31) + Boolean.hashCode(this.overrideToExecuteInMarketHoursOnly)) * 31) + this.checkOverrides.hashCode()) * 31) + this.flowSource.hashCode()) * 31;
            TradingSession tradingSession = this.tradingSession;
            int iHashCode10 = (iHashCode9 + (tradingSession == null ? 0 : tradingSession.hashCode())) * 31;
            MarketHours marketHours = this.nextMarketHours;
            int iHashCode11 = (iHashCode10 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
            GenericAlertContent<GenericAction> genericAlertContent = this.sessionChangeAlertContent;
            int iHashCode12 = (((iHashCode11 + (genericAlertContent == null ? 0 : genericAlertContent.hashCode())) * 31) + Boolean.hashCode(this.showOvernightShortAlert)) * 31;
            UUID uuid = this.orderToReplaceId;
            int iHashCode13 = (iHashCode12 + (uuid == null ? 0 : uuid.hashCode())) * 31;
            Order order = this.orderPendingReplacement;
            int iHashCode14 = (((((((((((((((iHashCode13 + (order == null ? 0 : order.hashCode())) * 31) + Boolean.hashCode(this.advancedMarketOrdersEnabled)) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31) + this.onSwitchOrderConfiguration.hashCode()) * 31) + this.refId.hashCode()) * 31) + Boolean.hashCode(this.advancedOrderSubmissionExperimentMember)) * 31) + this.orderFormState.hashCode()) * 31) + Boolean.hashCode(this.subzeroEnabled)) * 31;
            Result<ShortingInfo> result2 = this.shortingInfo;
            return ((((((((iHashCode14 + (result2 != null ? Result.m28554hashCodeimpl(result2.getValue()) : 0)) * 31) + this.clock.hashCode()) * 31) + this.accountsWithAccessToMargin.hashCode()) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher)) * 31) + this.experimentVariant.hashCode();
        }

        public String toString() {
            return "CommonState(instrument=" + this.instrument + ", accountNumber=" + this.accountNumber + ", nbboSummary=" + this.nbboSummary + ", editMode=" + this.editMode + ", isKeyboardVisible=" + this.isKeyboardVisible + ", editingField=" + this.editingField + ", numberOfSharesString=" + this.numberOfSharesString + ", quote=" + this.quote + ", position=" + this.position + ", side=" + this.side + ", estimatedFees=" + this.estimatedFees + ", isBackupWithheld=" + this.isBackupWithheld + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", accountSwitcher=" + this.accountSwitcher + ", allAccounts=" + this.allAccounts + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", validationState=" + this.validationState + ", silentActionsTaken=" + this.silentActionsTaken + ", microgramOrderSummary=" + this.microgramOrderSummary + ", overrideFlipIpoAccessShares=" + this.overrideFlipIpoAccessShares + ", overrideToExecuteInMarketHoursOnly=" + this.overrideToExecuteInMarketHoursOnly + ", checkOverrides=" + this.checkOverrides + ", flowSource=" + this.flowSource + ", tradingSession=" + this.tradingSession + ", nextMarketHours=" + this.nextMarketHours + ", sessionChangeAlertContent=" + this.sessionChangeAlertContent + ", showOvernightShortAlert=" + this.showOvernightShortAlert + ", orderToReplaceId=" + this.orderToReplaceId + ", orderPendingReplacement=" + this.orderPendingReplacement + ", advancedMarketOrdersEnabled=" + this.advancedMarketOrdersEnabled + ", marketBuysEnabled=" + this.marketBuysEnabled + ", onSwitchOrderConfiguration=" + this.onSwitchOrderConfiguration + ", refId=" + this.refId + ", advancedOrderSubmissionExperimentMember=" + this.advancedOrderSubmissionExperimentMember + ", orderFormState=" + this.orderFormState + ", subzeroEnabled=" + this.subzeroEnabled + ", shortingInfo=" + this.shortingInfo + ", clock=" + this.clock + ", accountsWithAccessToMargin=" + this.accountsWithAccessToMargin + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ", experimentVariant=" + this.experimentVariant + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CommonState(Instrument instrument, String accountNumber, NbboSummary nbboSummary, EquityOrderConfiguration2 editMode, boolean z, EditingField editingField, String str, Quote quote, Position position, EquityOrderSide side, Result<ApiEstimatedFees> result, boolean z2, boolean z3, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, InstrumentBuyingPower instrumentBuyingPower, ValidationState validationState, List<? extends GenericOrderCheckAction> silentActionsTaken, String str2, boolean z4, boolean z5, List<String> checkOverrides, EquityOrderFlowSource flowSource, TradingSession tradingSession, MarketHours marketHours, GenericAlertContent<? extends GenericAction> genericAlertContent, boolean z6, UUID uuid, Order order, boolean z7, boolean z8, Function1<? super Order.Configuration, Unit> onSwitchOrderConfiguration, UUID refId, boolean z9, OrderForm6 orderFormState, boolean z10, Result<ShortingInfo> result2, Clock clock, List<Account> accountsWithAccessToMargin, boolean z11, TradingSessionSubtitleExperiment.Variant experimentVariant) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(editMode, "editMode");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
            Intrinsics.checkNotNullParameter(validationState, "validationState");
            Intrinsics.checkNotNullParameter(silentActionsTaken, "silentActionsTaken");
            Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(onSwitchOrderConfiguration, "onSwitchOrderConfiguration");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(accountsWithAccessToMargin, "accountsWithAccessToMargin");
            Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
            this.instrument = instrument;
            this.accountNumber = accountNumber;
            this.nbboSummary = nbboSummary;
            this.editMode = editMode;
            this.isKeyboardVisible = z;
            this.editingField = editingField;
            this.numberOfSharesString = str;
            this.quote = quote;
            this.position = position;
            this.side = side;
            this.estimatedFees = result;
            this.isBackupWithheld = z2;
            this.loadingAccountSwitcher = z3;
            this.accountSwitcher = instrumentAccountSwitcher;
            this.allAccounts = allAccounts;
            this.instrumentBuyingPower = instrumentBuyingPower;
            this.validationState = validationState;
            this.silentActionsTaken = silentActionsTaken;
            this.microgramOrderSummary = str2;
            this.overrideFlipIpoAccessShares = z4;
            this.overrideToExecuteInMarketHoursOnly = z5;
            this.checkOverrides = checkOverrides;
            this.flowSource = flowSource;
            this.tradingSession = tradingSession;
            this.nextMarketHours = marketHours;
            this.sessionChangeAlertContent = genericAlertContent;
            this.showOvernightShortAlert = z6;
            this.orderToReplaceId = uuid;
            this.orderPendingReplacement = order;
            this.advancedMarketOrdersEnabled = z7;
            this.marketBuysEnabled = z8;
            this.onSwitchOrderConfiguration = onSwitchOrderConfiguration;
            this.refId = refId;
            this.advancedOrderSubmissionExperimentMember = z9;
            this.orderFormState = orderFormState;
            this.subzeroEnabled = z10;
            this.shortingInfo = result2;
            this.clock = clock;
            this.accountsWithAccessToMargin = accountsWithAccessToMargin;
            this.useSduiAccountSwitcher = z11;
            this.experimentVariant = experimentVariant;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final NbboSummary getNbboSummary() {
            return this.nbboSummary;
        }

        public /* synthetic */ CommonState(Instrument instrument, String str, NbboSummary nbboSummary, EquityOrderConfiguration2 equityOrderConfiguration2, boolean z, EditingField editingField, String str2, Quote quote, Position position, EquityOrderSide equityOrderSide, Result result, boolean z2, boolean z3, InstrumentAccountSwitcher instrumentAccountSwitcher, List list, InstrumentBuyingPower instrumentBuyingPower, ValidationState validationState, List list2, String str3, boolean z4, boolean z5, List list3, EquityOrderFlowSource equityOrderFlowSource, TradingSession tradingSession, MarketHours marketHours, GenericAlertContent genericAlertContent, boolean z6, UUID uuid, Order order, boolean z7, boolean z8, Function1 function1, UUID uuid2, boolean z9, OrderForm6 orderForm6, boolean z10, Result result2, Clock clock, List list4, boolean z11, TradingSessionSubtitleExperiment.Variant variant, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : instrument, str, (i & 4) != 0 ? null : nbboSummary, (i & 8) != 0 ? EquityOrderConfiguration2.SIMPLE : equityOrderConfiguration2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : editingField, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : quote, (i & 256) != 0 ? null : position, equityOrderSide, (i & 1024) != 0 ? null : result, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? null : instrumentAccountSwitcher, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (32768 & i) != 0 ? null : instrumentBuyingPower, (65536 & i) != 0 ? ValidationState.Initial.INSTANCE : validationState, (131072 & i) != 0 ? CollectionsKt.emptyList() : list2, (262144 & i) != 0 ? null : str3, (524288 & i) != 0 ? false : z4, (1048576 & i) != 0 ? false : z5, (2097152 & i) != 0 ? CollectionsKt.emptyList() : list3, equityOrderFlowSource, (8388608 & i) != 0 ? null : tradingSession, (16777216 & i) != 0 ? null : marketHours, (33554432 & i) != 0 ? null : genericAlertContent, (67108864 & i) != 0 ? false : z6, uuid, (268435456 & i) != 0 ? null : order, (536870912 & i) != 0 ? false : z7, (1073741824 & i) != 0 ? false : z8, (i & Integer.MIN_VALUE) != 0 ? new Function1() { // from class: com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState$CommonState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityAdvancedOrderDataState.CommonState._init_$lambda$0((Order.Configuration) obj);
                }
            } : function1, uuid2, (i2 & 2) != 0 ? false : z9, (i2 & 4) != 0 ? OrderForm6.EDITING : orderForm6, (i2 & 8) != 0 ? false : z10, (i2 & 16) != 0 ? null : result2, clock, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list4, (i2 & 128) != 0 ? false : z11, (i2 & 256) != 0 ? TradingSessionSubtitleExperiment.Variant.CONTROL : variant);
        }

        public final EquityOrderConfiguration2 getEditMode() {
            return this.editMode;
        }

        public final boolean isKeyboardVisible() {
            return this.isKeyboardVisible;
        }

        public final EditingField getEditingField() {
            return this.editingField;
        }

        public final String getNumberOfSharesString() {
            return this.numberOfSharesString;
        }

        public final Quote getQuote() {
            return this.quote;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: getEstimatedFees-xLWZpok, reason: not valid java name */
        public final Result<ApiEstimatedFees> m13792getEstimatedFeesxLWZpok() {
            return this.estimatedFees;
        }

        public final boolean isBackupWithheld() {
            return this.isBackupWithheld;
        }

        public final boolean getLoadingAccountSwitcher() {
            return this.loadingAccountSwitcher;
        }

        public final InstrumentAccountSwitcher getAccountSwitcher() {
            return this.accountSwitcher;
        }

        public final List<Account> getAllAccounts() {
            return this.allAccounts;
        }

        public final InstrumentBuyingPower getInstrumentBuyingPower() {
            return this.instrumentBuyingPower;
        }

        public final ValidationState getValidationState() {
            return this.validationState;
        }

        public final List<GenericOrderCheckAction> getSilentActionsTaken() {
            return this.silentActionsTaken;
        }

        public final String getMicrogramOrderSummary() {
            return this.microgramOrderSummary;
        }

        public final boolean getOverrideFlipIpoAccessShares() {
            return this.overrideFlipIpoAccessShares;
        }

        public final boolean getOverrideToExecuteInMarketHoursOnly() {
            return this.overrideToExecuteInMarketHoursOnly;
        }

        public final List<String> getCheckOverrides() {
            return this.checkOverrides;
        }

        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        public final TradingSession getTradingSession() {
            return this.tradingSession;
        }

        public final MarketHours getNextMarketHours() {
            return this.nextMarketHours;
        }

        public final GenericAlertContent<GenericAction> getSessionChangeAlertContent() {
            return this.sessionChangeAlertContent;
        }

        public final boolean getShowOvernightShortAlert() {
            return this.showOvernightShortAlert;
        }

        public final UUID getOrderToReplaceId() {
            return this.orderToReplaceId;
        }

        public final Order getOrderPendingReplacement() {
            return this.orderPendingReplacement;
        }

        public final boolean getAdvancedMarketOrdersEnabled() {
            return this.advancedMarketOrdersEnabled;
        }

        public final boolean getMarketBuysEnabled() {
            return this.marketBuysEnabled;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(Order.Configuration it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public final Function1<Order.Configuration, Unit> getOnSwitchOrderConfiguration() {
            return this.onSwitchOrderConfiguration;
        }

        public final UUID getRefId() {
            return this.refId;
        }

        public final boolean getAdvancedOrderSubmissionExperimentMember() {
            return this.advancedOrderSubmissionExperimentMember;
        }

        public final OrderForm6 getOrderFormState() {
            return this.orderFormState;
        }

        public final boolean getSubzeroEnabled() {
            return this.subzeroEnabled;
        }

        /* renamed from: getShortingInfo-xLWZpok, reason: not valid java name */
        public final Result<ShortingInfo> m13793getShortingInfoxLWZpok() {
            return this.shortingInfo;
        }

        public final Clock getClock() {
            return this.clock;
        }

        public final List<Account> getAccountsWithAccessToMargin() {
            return this.accountsWithAccessToMargin;
        }

        public final boolean getUseSduiAccountSwitcher() {
            return this.useSduiAccountSwitcher;
        }

        public final TradingSessionSubtitleExperiment.Variant getExperimentVariant() {
            return this.experimentVariant;
        }

        public final OrderPositionEffect getPositionEffect() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return OrderPositionEffect.CLOSE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderPositionEffect.OPEN;
            }
            Position position = this.position;
            if (position != null && Position5.isShortPosition(position) && this.subzeroEnabled) {
                return OrderPositionEffect.CLOSE;
            }
            return OrderPositionEffect.OPEN;
        }

        public final boolean isBuyToClose() {
            return this.side == EquityOrderSide.BUY && getPositionEffect() == OrderPositionEffect.CLOSE;
        }

        public final StringResource getTextButtonText() {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C15237R.string.order_create_buy_to_close_all;
            Instrument instrument = this.instrument;
            return companion.invoke(i, instrument != null ? instrument.getSymbol() : null);
        }

        public final boolean getDisableChangingOrderTypeForShortSaleInExtendedHours() {
            if (!this.subzeroEnabled || this.side != EquityOrderSide.SELL_SHORT) {
                return false;
            }
            TradingSession tradingSession = this.tradingSession;
            return (tradingSession instanceof TradingSession.Extended) && !TradingSession2.allowsRegularHoursShorting(tradingSession);
        }

        public final boolean getDisableChangingOrderTypeForBuyToCloseSubOneSharePosition() {
            Position position;
            return isBuyToClose() && (position = this.position) != null && position.getQuantity().compareTo(BigDecimal.ONE.negate()) > 0 && this.position.getQuantity().compareTo(BigDecimal.ZERO) < 0;
        }
    }
}
