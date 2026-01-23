package com.robinhood.android.equityadvancedorder.datastate;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderContextFactory;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.LimitPriceBentoNumpadTextInputFormatter;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.ILimit;
import com.robinhood.android.equityadvancedorder.datastate.ITaxLots;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
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
import com.robinhood.models.p320db.Instrument4;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: LimitTaxLots.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0014R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0019\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010-R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020L0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/LimitTaxLots;", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit;", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots;", "Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "limitStandard", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "taxLotsState", "<init>", "(Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;)V", "", "instrumentIs24HourMarketTradable", "alwaysInclude24HourMarketRow", "useUnifiedTradingSessionSettingsSheet", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "getBottomSheetRowStates", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lkotlinx/collections/immutable/ImmutableList;", "component1", "()Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "component2", "()Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "copy", "(Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;)Lcom/robinhood/android/equityadvancedorder/datastate/LimitTaxLots;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "getLimitStandard", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "getTaxLotsState", "Lcom/robinhood/utils/resource/StringResource;", "actionOrderTypeHeaderLabel", "Lcom/robinhood/utils/resource/StringResource;", "getActionOrderTypeHeaderLabel", "()Lcom/robinhood/utils/resource/StringResource;", "showOrderTypeSelectionRow", "Z", "getShowOrderTypeSelectionRow", "()Z", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "taxLotsLimitPriceRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "numberOfSharesInformationRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "getNumberOfSharesInformationRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "getReadyToAdvanceToDetailEdit", "readyToAdvanceToDetailEdit", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "getCommonState", "()Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "commonState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "accountSwitcherState", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "getLimitState", "()Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "limitState", "Lkotlin/Function0;", "Landroidx/compose/ui/text/AnnotatedString;", "getBidAskString", "()Lkotlin/jvm/functions/Function2;", "bidAskString", "getNasdaqPrefix", "()Ljava/lang/Integer;", "nasdaqPrefix", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "getRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "rowStates", "getAdtTradable", "()Ljava/lang/Boolean;", "adtTradable", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "equityOrderContext", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getTradingHourVisualizerArgs", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "tradingHourVisualizerArgs", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class LimitTaxLots implements ILimit, ITaxLots {
    public static final int $stable = 8;
    private final StringResource actionOrderTypeHeaderLabel;
    private final LimitStandard limitStandard;
    private final EquityOrderFormRowState.Information numberOfSharesInformationRow;
    private final boolean showOrderTypeSelectionRow;
    private final EquityOrderFormRowState.EditableValue taxLotsLimitPriceRow;
    private final ITaxLots.TaxLotsState taxLotsState;

    /* compiled from: LimitTaxLots.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[EditingField.values().length];
            try {
                iArr2[EditingField.TRADING_SESSION_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EditingField.TRADING_SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EditingField.TIME_IN_FORCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EditingField.STRATEGY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EditingField.SELECT_LOTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EditingField.ACCOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EditingField.NUMBER_OF_WHOLE_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EditingField.NUMBER_OF_FRACTIONAL_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EditingField.LIMIT_PRICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EditingField.ORDER_TYPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ LimitTaxLots copy$default(LimitTaxLots limitTaxLots, LimitStandard limitStandard, ITaxLots.TaxLotsState taxLotsState, int i, Object obj) {
        if ((i & 1) != 0) {
            limitStandard = limitTaxLots.limitStandard;
        }
        if ((i & 2) != 0) {
            taxLotsState = limitTaxLots.taxLotsState;
        }
        return limitTaxLots.copy(limitStandard, taxLotsState);
    }

    /* renamed from: component1, reason: from getter */
    public final LimitStandard getLimitStandard() {
        return this.limitStandard;
    }

    /* renamed from: component2, reason: from getter */
    public final ITaxLots.TaxLotsState getTaxLotsState() {
        return this.taxLotsState;
    }

    public final LimitTaxLots copy(LimitStandard limitStandard, ITaxLots.TaxLotsState taxLotsState) {
        Intrinsics.checkNotNullParameter(limitStandard, "limitStandard");
        Intrinsics.checkNotNullParameter(taxLotsState, "taxLotsState");
        return new LimitTaxLots(limitStandard, taxLotsState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitTaxLots)) {
            return false;
        }
        LimitTaxLots limitTaxLots = (LimitTaxLots) other;
        return Intrinsics.areEqual(this.limitStandard, limitTaxLots.limitStandard) && Intrinsics.areEqual(this.taxLotsState, limitTaxLots.taxLotsState);
    }

    public int hashCode() {
        return (this.limitStandard.hashCode() * 31) + this.taxLotsState.hashCode();
    }

    public String toString() {
        return "LimitTaxLots(limitStandard=" + this.limitStandard + ", taxLotsState=" + this.taxLotsState + ")";
    }

    public LimitTaxLots(LimitStandard limitStandard, ITaxLots.TaxLotsState taxLotsState) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(limitStandard, "limitStandard");
        Intrinsics.checkNotNullParameter(taxLotsState, "taxLotsState");
        this.limitStandard = limitStandard;
        this.taxLotsState = taxLotsState;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.actionOrderTypeHeaderLabel = companion.invoke(C29312R.string.order_type_tax_lot_title_short, new Object[0]);
        this.showOrderTypeSelectionRow = true;
        StringResource stringResourceInvoke2 = companion.invoke(C15237R.string.order_create_limit_price_row_title, new Object[0]);
        EquityOrderFormRowState.Icon icon = new EquityOrderFormRowState.Icon(ServerToBentoAssetMapper2.QUESTION_16, companion.invoke(C15237R.string.order_create_limit_price_row_info, new Object[0]), EquityOrderFormRowState.Icon.IconId.MARKET_DATA);
        String limitPriceString = getLimitPriceString();
        StringResource stringResourceInvoke3 = limitPriceString != null ? companion.invoke(C15237R.string.dollar_sign_format, limitPriceString) : null;
        String defaultLimitPriceString = getDefaultLimitPriceString();
        this.taxLotsLimitPriceRow = new EquityOrderFormRowState.EditableValue(EquityOrderFormRowState2.LimitPriceRowTestTag, stringResourceInvoke2, false, EditingField.LIMIT_PRICE, getCommonState().getOrderFormState(), stringResourceInvoke3, defaultLimitPriceString != null ? companion.invoke(defaultLimitPriceString) : null, icon, LimitTaxLots2.TAX_LOTS_LIMIT_PRICE_FIELD_ID, limitStandard.getBidAskString(), limitStandard.getFtuxTooltip(), new LimitPriceBentoNumpadTextInputFormatter(0, 0, 2, 8, 3, null), null, null, 12292, null);
        StringResource stringResourceInvoke4 = companion.invoke(C15237R.string.order_create_number_of_shares_row_title, new Object[0]);
        String numberOfSharesString = getCommonState().getNumberOfSharesString();
        this.numberOfSharesInformationRow = getTaxLotsState().getTaxLots().isEmpty() ? null : new EquityOrderFormRowState.Information(EquityOrderFormRowState2.NumberOfSharesInformationRowTestTag, stringResourceInvoke4, (numberOfSharesString == null || (stringResourceInvoke = companion.invoke(numberOfSharesString)) == null) ? companion.invoke("") : stringResourceInvoke, null, true, null, null, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public Account getActiveAccount() {
        return ILimit.DefaultImpls.getActiveAccount(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getAskPrice() {
        return ILimit.DefaultImpls.getAskPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getBidPrice() {
        return ILimit.DefaultImpls.getBidPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityAdvancedOrderBottomSheetState getBottomSheetState(Boolean bool, Boolean bool2) {
        return ILimit.DefaultImpls.getBottomSheetState(this, bool, bool2);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getButtonEnabled() {
        return ILimit.DefaultImpls.getButtonEnabled(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getButtonLoading() {
        return ILimit.DefaultImpls.getButtonLoading(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public boolean getCanShowTooltip() {
        return ILimit.DefaultImpls.getCanShowTooltip(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public AdvancedOrder.LimitComplete getCompletedConfiguration() {
        return ILimit.DefaultImpls.getCompletedConfiguration(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getDefaultLimitPrice() {
        return ILimit.DefaultImpls.getDefaultLimitPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public String getDefaultLimitPriceString() {
        return ILimit.DefaultImpls.getDefaultLimitPriceString(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getEstimateRowTitle() {
        return ILimit.DefaultImpls.getEstimateRowTitle(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityOrderFormRowState getEstimatedCostRow() {
        return ILimit.DefaultImpls.getEstimatedCostRow(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getEstimatedCostString() {
        return ILimit.DefaultImpls.getEstimatedCostString(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public StringResource getGfdTitle() {
        return ILimit.DefaultImpls.getGfdTitle(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public StringResource getGtcTitle() {
        return ILimit.DefaultImpls.getGtcTitle(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getLimitPrice() {
        return ILimit.DefaultImpls.getLimitPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public String getLimitPriceString() {
        return ILimit.DefaultImpls.getLimitPriceString(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public BigDecimal getNumberOfShares() {
        return ILimit.DefaultImpls.getNumberOfShares(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getPrimaryButtonText() {
        return ILimit.DefaultImpls.getPrimaryButtonText(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public OrderRequest2 getQuantityOrAmount() {
        return ILimit.DefaultImpls.getQuantityOrAmount(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getShouldShowBackupWithholdingWarning() {
        return ILimit.DefaultImpls.getShouldShowBackupWithholdingWarning(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getShowTextButton() {
        return ILimit.DefaultImpls.getShowTextButton(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return ILimit.DefaultImpls.getStaticInputs(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getSubtitleStringResource() {
        return ILimit.DefaultImpls.getSubtitleStringResource(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getTitleStringResource() {
        return ILimit.DefaultImpls.getTitleStringResource(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public boolean getTooltipWillBeShown() {
        return ILimit.DefaultImpls.getTooltipWillBeShown(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getUserHasMultipleAccounts() {
        return ILimit.DefaultImpls.getUserHasMultipleAccounts(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public AdvancedOrder.LimitNew getWorkingConfiguration() {
        return ILimit.DefaultImpls.getWorkingConfiguration(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean isCancelNewOrder() {
        return ILimit.DefaultImpls.isCancelNewOrder(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean isShortPosition() {
        return ILimit.DefaultImpls.isShortPosition(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ITaxLots
    public ITaxLots mutateTaxLots(Function1<? super ITaxLots.TaxLotsState, ITaxLots.TaxLotsState> function1) {
        return ITaxLots.DefaultImpls.mutateTaxLots(this, function1);
    }

    public final LimitStandard getLimitStandard() {
        return this.limitStandard;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ITaxLots
    public ITaxLots.TaxLotsState getTaxLotsState() {
        return this.taxLotsState;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getReadyToAdvanceToDetailEdit() {
        if (getTaxLotsState().getTaxLotM1ExperimentMember()) {
            return true;
        }
        BigDecimal numberOfShares = getNumberOfShares();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return numberOfShares.compareTo(bigDecimal) > 0 && getLimitPrice().compareTo(bigDecimal) > 0;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityAdvancedOrderDataState.CommonState getCommonState() {
        return this.limitStandard.getCommonState();
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

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public ILimit.LimitState getLimitState() {
        return this.limitStandard.getLimitState();
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public Function2<Composer, Integer, AnnotatedString> getBidAskString() {
        return this.limitStandard.getBidAskString();
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public Integer getNasdaqPrefix() {
        return this.limitStandard.getNasdaqPrefix();
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getActionOrderTypeHeaderLabel() {
        return this.actionOrderTypeHeaderLabel;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public boolean getShowOrderTypeSelectionRow() {
        return this.showOrderTypeSelectionRow;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityOrderFormRowState> getRowStates() {
        UUID id;
        Instrument instrument = getCommonState().getInstrument();
        EquityOrderFormRowState.TaxLotsSelection taxLotsSelection = (instrument == null || (id = instrument.getId()) == null) ? null : new EquityOrderFormRowState.TaxLotsSelection(getCommonState().getAccountNumber(), id, getTaxLotsState().getOrderId(), getCommonState().getOrderFormState());
        EquityOrderFormRowState.HeaderTitle titleRow = this.limitStandard.getTitleRow();
        EquityOrderFormRowState.Empty emptyRow = this.limitStandard.getEmptyRow();
        EquityOrderFormRowState.FloatingSelection orderTypeSelectionRow = EquityAdvancedOrderDataState2.getOrderTypeSelectionRow(this.limitStandard);
        EquityOrderFormRowState.EditableValue editableValue = this.taxLotsLimitPriceRow;
        ITaxLots.TaxLotsState taxLotsState = getTaxLotsState();
        String numberOfSharesString = getCommonState().getNumberOfSharesString();
        Position position = getCommonState().getPosition();
        EquityOrderFormRowState.EditableValue numberOfSharesRow$default = ITaxLots.TaxLotsState.getNumberOfSharesRow$default(taxLotsState, numberOfSharesString, position != null ? position.getSharesAvailableForSellsTaxLots() : null, getCommonState().getOrderFormState(), OrderType.LIMIT, false, 16, null);
        if (!getTaxLotsState().getTaxLotM1ExperimentMember()) {
            numberOfSharesRow$default = null;
        }
        if (getTaxLotsState().getTaxLotM1ExperimentMember()) {
            taxLotsSelection = null;
        }
        EquityOrderFormRowState.Information information = this.numberOfSharesInformationRow;
        if (getTaxLotsState().getTaxLotM1ExperimentMember()) {
            information = null;
        }
        EquityOrderFormRowState.DropdownEdit strategyRow = getTaxLotsState().getStrategyRow(getCommonState().getOrderFormState());
        if (!getTaxLotsState().getTaxLotM1ExperimentMember()) {
            strategyRow = null;
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new EquityOrderFormRowState[]{titleRow, emptyRow, orderTypeSelectionRow, editableValue, numberOfSharesRow$default, taxLotsSelection, information, strategyRow, getEstimatedCostRow(), (getTaxLotsState().getUserSelectedTaxLot() || getTaxLotsState().getTaxLotM1ExperimentMember()) ? this.limitStandard.getTradingSessionSettingsRow() : null}));
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getBottomSheetRowStates(Boolean instrumentIs24HourMarketTradable, Boolean alwaysInclude24HourMarketRow, boolean useUnifiedTradingSessionSettingsSheet) {
        EditingField editingField = getCommonState().getEditingField();
        switch (editingField == null ? -1 : WhenMappings.$EnumSwitchMapping$1[editingField.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return this.limitStandard.getBottomSheetRowStates(Boolean.FALSE, Boolean.valueOf(Instrument4.isAllDayTradable(getCommonState().getInstrument())), true);
            case 2:
            case 3:
                return this.limitStandard.getBottomSheetRowStates(Boolean.FALSE, alwaysInclude24HourMarketRow, false);
            case 4:
                ITaxLots.TaxLotsState taxLotsState = getTaxLotsState();
                BigDecimal numberOfShares = getNumberOfShares();
                Position position = getCommonState().getPosition();
                return taxLotsState.getStrategyRowStates(numberOfShares, position != null ? position.getSharesAvailableForSellsTaxLots() : null);
        }
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public Boolean getAdtTradable() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
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
        BigDecimal limitPrice = getLimitPrice();
        boolean overrideToExecuteInMarketHoursOnly = commonState.getOverrideToExecuteInMarketHoursOnly();
        OrderMarketHours overrideMarketHours = EquityOrderConfiguration3.getOverrideMarketHours(getWorkingConfiguration());
        boolean overrideFlipIpoAccessShares = commonState.getOverrideFlipIpoAccessShares();
        List<String> checkOverrides = commonState.getCheckOverrides();
        OrderRequest2 quantityOrAmount = getQuantityOrAmount();
        BigDecimal trailAmount = EquityOrderConfiguration3.getTrailAmount(getWorkingConfiguration());
        Integer trailPercentage = EquityOrderConfiguration3.getTrailPercentage(getWorkingConfiguration());
        BigDecimal presetPercentLimit = EquityOrderConfiguration3.getPresetPercentLimit(getWorkingConfiguration());
        OrderTimeInForce timeInForce = getLimitState().getTimeInForce();
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
        boolean marketBuysEnabled = getLimitState().getMarketBuysEnabled();
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
        return equityOrderContextFactory.create(activeAccount, instrument, tradingSession, position, quote, new EquityOrderRequestInputs(staticInputs, accountNumber, id, limitPrice, overrideFlipIpoAccessShares, overrideToExecuteInMarketHoursOnly, overrideMarketHours, checkOverrides, quantityOrAmount, null, trailAmount, trailPercentage, presetPercentLimit, timeInForce, orderConfiguration, totalFeesAndTaxes, fees, bigDecimal, marketBuysEnabled, taxLotSelectionTypeForBrokeback, taxLots, orderPositionEffect, subzeroEnabled), (64 & 64) != 0 ? Instant.now() : null, commonState.getInstrumentBuyingPower(), commonState.getOrderPendingReplacement());
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public SetTradingHourVisualizerArgs getTradingHourVisualizerArgs() {
        return this.limitStandard.getTradingHourVisualizerArgs();
    }

    public final EquityOrderFormRowState.Information getNumberOfSharesInformationRow() {
        return this.numberOfSharesInformationRow;
    }
}
