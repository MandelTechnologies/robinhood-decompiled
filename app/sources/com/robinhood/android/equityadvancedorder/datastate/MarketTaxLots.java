package com.robinhood.android.equityadvancedorder.datastate;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderContextFactory;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.IMarket;
import com.robinhood.android.equityadvancedorder.datastate.ITaxLots;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration3;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiFeeItem;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.api.bonfire.instrument.InstrumentAccountSwitcherType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: MarketTaxLots.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ/\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001a2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000e2\u0006\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0002\u00103J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\u001d\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020AHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010$\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/MarketTaxLots;", "Lcom/robinhood/android/equityadvancedorder/datastate/IMarket;", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots;", "marketStandard", "Lcom/robinhood/android/equityadvancedorder/datastate/MarketStandard;", "taxLotsState", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "<init>", "(Lcom/robinhood/android/equityadvancedorder/datastate/MarketStandard;Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;)V", "getMarketStandard", "()Lcom/robinhood/android/equityadvancedorder/datastate/MarketStandard;", "getTaxLotsState", "()Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "readyToAdvanceToDetailEdit", "", "getReadyToAdvanceToDetailEdit", "()Z", "commonState", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "getCommonState", "()Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "actionOrderTypeHeaderLabel", "Lcom/robinhood/utils/resource/StringResource;", "getActionOrderTypeHeaderLabel", "()Lcom/robinhood/utils/resource/StringResource;", "rowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "getRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "estimatedCostString", "getEstimatedCostString", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "tradingHourVisualizerArgs", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getTradingHourVisualizerArgs", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "showTextButton", "getShowTextButton", "getBottomSheetRowStates", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "instrumentIs24HourMarketTradable", "alwaysInclude24HourMarketRow", "useUnifiedTradingSessionSettingsSheet", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lkotlinx/collections/immutable/ImmutableList;", "numberOfSharesInformationRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "getNumberOfSharesInformationRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class MarketTaxLots implements IMarket, ITaxLots {
    public static final int $stable = 8;
    private final StringResource actionOrderTypeHeaderLabel;
    private final StringResource estimatedCostString;
    private final MarketStandard marketStandard;
    private final EquityOrderFormRowState.Information numberOfSharesInformationRow;
    private final ITaxLots.TaxLotsState taxLotsState;

    /* compiled from: MarketTaxLots.kt */
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

    public static /* synthetic */ MarketTaxLots copy$default(MarketTaxLots marketTaxLots, MarketStandard marketStandard, ITaxLots.TaxLotsState taxLotsState, int i, Object obj) {
        if ((i & 1) != 0) {
            marketStandard = marketTaxLots.marketStandard;
        }
        if ((i & 2) != 0) {
            taxLotsState = marketTaxLots.taxLotsState;
        }
        return marketTaxLots.copy(marketStandard, taxLotsState);
    }

    /* renamed from: component1, reason: from getter */
    public final MarketStandard getMarketStandard() {
        return this.marketStandard;
    }

    /* renamed from: component2, reason: from getter */
    public final ITaxLots.TaxLotsState getTaxLotsState() {
        return this.taxLotsState;
    }

    public final MarketTaxLots copy(MarketStandard marketStandard, ITaxLots.TaxLotsState taxLotsState) {
        Intrinsics.checkNotNullParameter(marketStandard, "marketStandard");
        Intrinsics.checkNotNullParameter(taxLotsState, "taxLotsState");
        return new MarketTaxLots(marketStandard, taxLotsState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketTaxLots)) {
            return false;
        }
        MarketTaxLots marketTaxLots = (MarketTaxLots) other;
        return Intrinsics.areEqual(this.marketStandard, marketTaxLots.marketStandard) && Intrinsics.areEqual(this.taxLotsState, marketTaxLots.taxLotsState);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getShowTextButton() {
        return false;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public SetTradingHourVisualizerArgs getTradingHourVisualizerArgs() {
        return null;
    }

    public int hashCode() {
        return (this.marketStandard.hashCode() * 31) + this.taxLotsState.hashCode();
    }

    public String toString() {
        return "MarketTaxLots(marketStandard=" + this.marketStandard + ", taxLotsState=" + this.taxLotsState + ")";
    }

    public MarketTaxLots(MarketStandard marketStandard, ITaxLots.TaxLotsState taxLotsState) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(marketStandard, "marketStandard");
        Intrinsics.checkNotNullParameter(taxLotsState, "taxLotsState");
        this.marketStandard = marketStandard;
        this.taxLotsState = taxLotsState;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.actionOrderTypeHeaderLabel = companion.invoke(C29312R.string.order_type_tax_lot_title_short, new Object[0]);
        this.estimatedCostString = marketStandard.getEstimatedCostString();
        StringResource stringResourceInvoke2 = companion.invoke(C15237R.string.order_create_number_of_shares_row_title, new Object[0]);
        String numberOfSharesString = getCommonState().getNumberOfSharesString();
        this.numberOfSharesInformationRow = getTaxLotsState().getTaxLots().isEmpty() ? null : new EquityOrderFormRowState.Information(EquityOrderFormRowState2.NumberOfSharesInformationRowTestTag, stringResourceInvoke2, (numberOfSharesString == null || (stringResourceInvoke = companion.invoke(numberOfSharesString)) == null) ? companion.invoke("") : stringResourceInvoke, null, true, null, null, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public Account getActiveAccount() {
        return IMarket.DefaultImpls.getActiveAccount(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public Boolean getAdtTradable() {
        return IMarket.DefaultImpls.getAdtTradable(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityAdvancedOrderBottomSheetState getBottomSheetState(Boolean bool, Boolean bool2) {
        return IMarket.DefaultImpls.getBottomSheetState(this, bool, bool2);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getButtonEnabled() {
        return IMarket.DefaultImpls.getButtonEnabled(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getButtonLoading() {
        return IMarket.DefaultImpls.getButtonLoading(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public AdvancedOrder.MarketComplete getCompletedConfiguration() {
        return IMarket.DefaultImpls.getCompletedConfiguration(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getEstimateRowTitle() {
        return IMarket.DefaultImpls.getEstimateRowTitle(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityOrderFormRowState getEstimatedCostRow() {
        return IMarket.DefaultImpls.getEstimatedCostRow(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public BigDecimal getNumberOfShares() {
        return IMarket.DefaultImpls.getNumberOfShares(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getPrimaryButtonText() {
        return IMarket.DefaultImpls.getPrimaryButtonText(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public OrderRequest2 getQuantityOrAmount() {
        return IMarket.DefaultImpls.getQuantityOrAmount(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getShouldShowBackupWithholdingWarning() {
        return IMarket.DefaultImpls.getShouldShowBackupWithholdingWarning(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return IMarket.DefaultImpls.getStaticInputs(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getSubtitleStringResource() {
        return IMarket.DefaultImpls.getSubtitleStringResource(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getTitleStringResource() {
        return IMarket.DefaultImpls.getTitleStringResource(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getUserHasMultipleAccounts() {
        return IMarket.DefaultImpls.getUserHasMultipleAccounts(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public AdvancedOrder.MarketNew getWorkingConfiguration() {
        return IMarket.DefaultImpls.getWorkingConfiguration(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean isCancelNewOrder() {
        return IMarket.DefaultImpls.isCancelNewOrder(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean isShortPosition() {
        return IMarket.DefaultImpls.isShortPosition(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ITaxLots
    public ITaxLots mutateTaxLots(Function1<? super ITaxLots.TaxLotsState, ITaxLots.TaxLotsState> function1) {
        return ITaxLots.DefaultImpls.mutateTaxLots(this, function1);
    }

    public final MarketStandard getMarketStandard() {
        return this.marketStandard;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ITaxLots
    public ITaxLots.TaxLotsState getTaxLotsState() {
        return this.taxLotsState;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getReadyToAdvanceToDetailEdit() {
        return getTaxLotsState().getTaxLotM1ExperimentMember() || getNumberOfShares().compareTo(BigDecimal.ZERO) > 0;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityAdvancedOrderDataState.CommonState getCommonState() {
        return this.marketStandard.getCommonState();
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getActionOrderTypeHeaderLabel() {
        return this.actionOrderTypeHeaderLabel;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityOrderFormRowState> getRowStates() {
        UUID id;
        Instrument instrument = getCommonState().getInstrument();
        EquityOrderFormRowState.TaxLotsSelection taxLotsSelection = (instrument == null || (id = instrument.getId()) == null) ? null : new EquityOrderFormRowState.TaxLotsSelection(getCommonState().getAccountNumber(), id, getTaxLotsState().getOrderId(), getCommonState().getOrderFormState());
        EquityOrderFormRowState.HeaderTitle titleRow = this.marketStandard.getTitleRow();
        EquityOrderFormRowState.Empty emptyRow = this.marketStandard.getEmptyRow();
        EquityOrderFormRowState.FloatingSelection orderTypeSelectionRow = EquityAdvancedOrderDataState2.getOrderTypeSelectionRow(this);
        EquityOrderFormRowState.Information marketPriceRow = this.marketStandard.getMarketPriceRow();
        if (getTaxLotsState().getTaxLotM1ExperimentMember()) {
            taxLotsSelection = null;
        }
        ITaxLots.TaxLotsState taxLotsState = getTaxLotsState();
        String numberOfSharesString = getCommonState().getNumberOfSharesString();
        Position position = getCommonState().getPosition();
        BigDecimal sharesAvailableForSellsTaxLots = position != null ? position.getSharesAvailableForSellsTaxLots() : null;
        OrderForm6 orderFormState = getCommonState().getOrderFormState();
        OrderType orderType = OrderType.MARKET;
        Instrument instrument2 = getCommonState().getInstrument();
        EquityOrderFormRowState.EditableValue numberOfSharesRow = taxLotsState.getNumberOfSharesRow(numberOfSharesString, sharesAvailableForSellsTaxLots, orderFormState, orderType, instrument2 != null && instrument2.canSellFractional(getCommonState().getPosition()));
        if (!getTaxLotsState().getTaxLotM1ExperimentMember()) {
            numberOfSharesRow = null;
        }
        EquityOrderFormRowState.DropdownEdit strategyRow = getTaxLotsState().getStrategyRow(getCommonState().getOrderFormState());
        if (!getTaxLotsState().getTaxLotM1ExperimentMember()) {
            strategyRow = null;
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new EquityOrderFormRowState[]{titleRow, emptyRow, orderTypeSelectionRow, marketPriceRow, taxLotsSelection, numberOfSharesRow, strategyRow, getTaxLotsState().getTaxLotM1ExperimentMember() ? null : this.numberOfSharesInformationRow, this.marketStandard.getEstimatedCostRow()}));
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public InstrumentAccountSwitcherState getAccountSwitcherState() {
        InstrumentAccountSwitcherType instrumentAccountSwitcherType;
        EquityAdvancedOrderDataState.CommonState commonState = getCommonState();
        InstrumentAccountSwitcher.ViewModel buy = null;
        if (commonState.getAllAccounts().size() <= 1 || isCancelNewOrder()) {
            return null;
        }
        Screen.Name name = Screen.Name.EQUITY_ENTER_LIMIT_PRICE_PAGE;
        EquityOrderSide side = commonState.getSide();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[side.ordinal()];
        if (i == 1) {
            instrumentAccountSwitcherType = InstrumentAccountSwitcherType.BUY;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("tax lots do not support shorting");
            }
            instrumentAccountSwitcherType = InstrumentAccountSwitcherType.SELL_UNITS;
        }
        InstrumentAccountSwitcherType instrumentAccountSwitcherType2 = instrumentAccountSwitcherType;
        String accountNumber = commonState.getAccountNumber();
        List<Account> allAccounts = commonState.getAllAccounts();
        int i2 = iArr[commonState.getSide().ordinal()];
        if (i2 == 1) {
            InstrumentAccountSwitcher accountSwitcher = commonState.getAccountSwitcher();
            if (accountSwitcher != null) {
                buy = accountSwitcher.getBuy();
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("tax lots do not support shorting");
            }
            InstrumentAccountSwitcher accountSwitcher2 = commonState.getAccountSwitcher();
            if (accountSwitcher2 != null) {
                buy = accountSwitcher2.getAccountsOnlySell();
            }
        }
        return new InstrumentAccountSwitcherState(name, commonState.getLoadingAccountSwitcher(), accountNumber, allAccounts, false, commonState.getUseSduiAccountSwitcher(), instrumentAccountSwitcherType2, buy, 16, null);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.IMarket, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getEstimatedCostString() {
        return this.estimatedCostString;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EquityOrderContext getEquityOrderContext() {
        BigDecimal totalFeesAndTaxes;
        List<ApiFeeItem> fees;
        OrderPositionEffect orderPositionEffect;
        EquityAdvancedOrderDataState.CommonState commonState = getCommonState();
        Account activeAccount = getActiveAccount();
        if (activeAccount == null || commonState.getInstrument() == null || commonState.getTradingSession() == null || commonState.getInstrumentBuyingPower() == null) {
            return null;
        }
        EquityOrderContextFactory equityOrderContextFactory = EquityOrderContextFactory.INSTANCE;
        Instrument instrument = commonState.getInstrument();
        TradingSession tradingSession = commonState.getTradingSession();
        Position position = commonState.getPosition();
        BigDecimal fee = null;
        Quote quote = commonState.getQuote();
        EquityOrderRequestInputs.StaticInputs staticInputs = getStaticInputs();
        String accountNumber = activeAccount.getAccountNumber();
        Order orderPendingReplacement = commonState.getOrderPendingReplacement();
        UUID id = orderPendingReplacement != null ? orderPendingReplacement.getId() : null;
        boolean overrideToExecuteInMarketHoursOnly = commonState.getOverrideToExecuteInMarketHoursOnly();
        OrderMarketHours overrideMarketHours = EquityOrderConfiguration3.getOverrideMarketHours(getWorkingConfiguration());
        boolean overrideFlipIpoAccessShares = commonState.getOverrideFlipIpoAccessShares();
        List<String> checkOverrides = commonState.getCheckOverrides();
        OrderRequest2 quantityOrAmount = getQuantityOrAmount();
        BigDecimal trailAmount = EquityOrderConfiguration3.getTrailAmount(getWorkingConfiguration());
        Integer trailPercentage = EquityOrderConfiguration3.getTrailPercentage(getWorkingConfiguration());
        BigDecimal presetPercentLimit = EquityOrderConfiguration3.getPresetPercentLimit(getWorkingConfiguration());
        OrderTimeInForce orderTimeInForce = OrderTimeInForce.GFD;
        Order.Configuration orderConfiguration = getWorkingConfiguration().getOrderConfiguration();
        Result<ApiEstimatedFees> resultM13792getEstimatedFeesxLWZpok = getCommonState().m13792getEstimatedFeesxLWZpok();
        if (resultM13792getEstimatedFeesxLWZpok != null) {
            Object value = resultM13792getEstimatedFeesxLWZpok.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            ApiEstimatedFees apiEstimatedFees = (ApiEstimatedFees) value;
            totalFeesAndTaxes = apiEstimatedFees != null ? apiEstimatedFees.getTotalFeesAndTaxes() : null;
        }
        Result<ApiEstimatedFees> resultM13792getEstimatedFeesxLWZpok2 = getCommonState().m13792getEstimatedFeesxLWZpok();
        if (resultM13792getEstimatedFeesxLWZpok2 != null) {
            Object value2 = resultM13792getEstimatedFeesxLWZpok2.getValue();
            if (Result.m28555isFailureimpl(value2)) {
                value2 = null;
            }
            ApiEstimatedFees apiEstimatedFees2 = (ApiEstimatedFees) value2;
            fees = apiEstimatedFees2 != null ? apiEstimatedFees2.getFees() : null;
        }
        Result<ShortingInfo> resultM13793getShortingInfoxLWZpok = getCommonState().m13793getShortingInfoxLWZpok();
        if (resultM13793getShortingInfoxLWZpok != null) {
            Object value3 = resultM13793getShortingInfoxLWZpok.getValue();
            if (Result.m28555isFailureimpl(value3)) {
                value3 = null;
            }
            ShortingInfo shortingInfo = (ShortingInfo) value3;
            if (shortingInfo != null) {
                fee = shortingInfo.getFee();
            }
        }
        BigDecimal bigDecimal = fee;
        boolean marketBuysEnabled = getCommonState().getMarketBuysEnabled();
        TaxLotSelectionType taxLotSelectionTypeForBrokeback = getTaxLotsState().getTaxLotSelectionTypeForBrokeback();
        List<TaxLotSelection> taxLots = getTaxLotsState().getTaxLots();
        boolean subzeroEnabled = getCommonState().getSubzeroEnabled();
        int i = WhenMappings.$EnumSwitchMapping$0[commonState.getSide().ordinal()];
        if (i == 1) {
            orderPositionEffect = OrderPositionEffect.OPEN;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("tax lots do not support shorting");
            }
            orderPositionEffect = OrderPositionEffect.CLOSE;
        }
        return equityOrderContextFactory.create(activeAccount, instrument, tradingSession, position, quote, new EquityOrderRequestInputs(staticInputs, accountNumber, id, null, overrideFlipIpoAccessShares, overrideToExecuteInMarketHoursOnly, overrideMarketHours, checkOverrides, quantityOrAmount, null, trailAmount, trailPercentage, presetPercentLimit, orderTimeInForce, orderConfiguration, totalFeesAndTaxes, fees, bigDecimal, marketBuysEnabled, taxLotSelectionTypeForBrokeback, taxLots, orderPositionEffect, subzeroEnabled), (64 & 64) != 0 ? Instant.now() : null, commonState.getInstrumentBuyingPower(), commonState.getOrderPendingReplacement());
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getBottomSheetRowStates(Boolean instrumentIs24HourMarketTradable, Boolean alwaysInclude24HourMarketRow, boolean useUnifiedTradingSessionSettingsSheet) {
        ITaxLots.TaxLotsState taxLotsState = getTaxLotsState();
        BigDecimal numberOfShares = getNumberOfShares();
        Position position = getCommonState().getPosition();
        return taxLotsState.getStrategyRowStates(numberOfShares, position != null ? position.getSharesAvailableForSellsTaxLots() : null);
    }

    public final EquityOrderFormRowState.Information getNumberOfSharesInformationRow() {
        return this.numberOfSharesInformationRow;
    }
}
