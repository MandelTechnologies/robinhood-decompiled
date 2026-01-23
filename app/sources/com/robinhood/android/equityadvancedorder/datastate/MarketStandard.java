package com.robinhood.android.equityadvancedorder.datastate;

import androidx.compose.p011ui.unit.C2002Dp;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderContextFactory;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.BentoNumpadTextInputFormatters3;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.IMarket;
import com.robinhood.android.equityadvancedorder.utils.InstrumentAccountSwitcherUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration3;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiFeeItem;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: MarketStandard.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u0018J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0013\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010K\u001a\u00020\t2\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020QHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020:¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/MarketStandard;", "Lcom/robinhood/android/equityadvancedorder/datastate/IMarket;", "commonState", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "<init>", "(Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;)V", "getCommonState", "()Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "readyToAdvanceToDetailEdit", "", "getReadyToAdvanceToDetailEdit", "()Z", "tradingHourVisualizerArgs", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getTradingHourVisualizerArgs", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "showTextButton", "getShowTextButton", "getBottomSheetRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "instrumentIs24HourMarketTradable", "alwaysInclude24HourMarketRow", "useUnifiedTradingSessionSettingsSheet", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lkotlinx/collections/immutable/ImmutableList;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "actionOrderTypeHeaderLabel", "Lcom/robinhood/utils/resource/StringResource;", "getActionOrderTypeHeaderLabel", "()Lcom/robinhood/utils/resource/StringResource;", "titleRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderTitle;", "getTitleRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderTitle;", "subtitleRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderSubtitle;", "getSubtitleRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderSubtitle;", "emptyRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "getEmptyRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "numberOfSharesRowType", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "getNumberOfSharesRowType", "()Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "numberOfSharesRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "getNumberOfSharesRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "accountRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "getAccountRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "marketPriceRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "getMarketPriceRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "rowStates", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "getRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class MarketStandard implements IMarket {
    public static final int $stable = 8;
    private final EquityOrderFormRowState.DropdownEdit accountRow;
    private final EquityAdvancedOrderDataState.CommonState commonState;
    private final EquityOrderFormRowState.Empty emptyRow;
    private final EquityOrderFormRowState.Information marketPriceRow;
    private final EquityOrderFormRowState.EditableValue numberOfSharesRow;
    private final EquityOrderFormRowState.HeaderSubtitle subtitleRow;
    private final EquityOrderFormRowState.HeaderTitle titleRow;

    public static /* synthetic */ MarketStandard copy$default(MarketStandard marketStandard, EquityAdvancedOrderDataState.CommonState commonState, int i, Object obj) {
        if ((i & 1) != 0) {
            commonState = marketStandard.commonState;
        }
        return marketStandard.copy(commonState);
    }

    /* renamed from: component1, reason: from getter */
    public final EquityAdvancedOrderDataState.CommonState getCommonState() {
        return this.commonState;
    }

    public final MarketStandard copy(EquityAdvancedOrderDataState.CommonState commonState) {
        Intrinsics.checkNotNullParameter(commonState, "commonState");
        return new MarketStandard(commonState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketStandard) && Intrinsics.areEqual(this.commonState, ((MarketStandard) other).commonState);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public SetTradingHourVisualizerArgs getTradingHourVisualizerArgs() {
        return null;
    }

    public int hashCode() {
        return this.commonState.hashCode();
    }

    public String toString() {
        return "MarketStandard(commonState=" + this.commonState + ")";
    }

    public MarketStandard(EquityAdvancedOrderDataState.CommonState commonState) {
        BigDecimal displayPrice;
        String str;
        DisplayName displayName;
        DisplayName.Variants variants;
        Intrinsics.checkNotNullParameter(commonState, "commonState");
        this.commonState = commonState;
        StringResource titleStringResource = getTitleStringResource();
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.titleRow = titleStringResource != null ? new EquityOrderFormRowState.HeaderTitle(titleStringResource) : null;
        StringResource subtitleStringResource = getSubtitleStringResource();
        this.subtitleRow = subtitleStringResource != null ? new EquityOrderFormRowState.HeaderSubtitle(subtitleStringResource) : null;
        this.emptyRow = new EquityOrderFormRowState.Empty(C2002Dp.m7995constructorimpl(16), defaultConstructorMarker);
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C15237R.string.order_create_number_of_shares_row_title, new Object[0]);
        EquityAdvancedOrderDataState.CommonState commonState2 = getCommonState();
        this.numberOfSharesRow = new EquityOrderFormRowState.EditableValue(EquityOrderFormRowState2.NumberOfSharesRowTestTag, stringResourceInvoke, false, getNumberOfSharesRowType(), getCommonState().getOrderFormState(), commonState2.getNumberOfSharesString() != null ? companion.invoke(commonState2.getNumberOfSharesString()) : null, companion.invoke(C15237R.string.order_create_default_number_of_share, new Object[0]), null, EquityAdvancedOrderDataState2.SHARE_QUANTITY_FIELD_ID, null, null, BentoNumpadTextInputFormatters3.INSTANCE, null, null, 13956, null);
        StringResource stringResourceInvoke2 = companion.invoke(C15237R.string.order_create_account_row_title, new Object[0]);
        Account activeAccount = getActiveAccount();
        this.accountRow = (getUserHasMultipleAccounts() && getCommonState().getEditMode() == EquityOrderConfiguration2.DETAIL && !isCancelNewOrder()) ? new EquityOrderFormRowState.DropdownEdit(EquityOrderFormRowState2.AccountRowTestTag, stringResourceInvoke2, null, EditingField.ACCOUNT, getCommonState().getOrderFormState(), (activeAccount == null || (displayName = AccountDisplayNames.getDisplayName(activeAccount)) == null || (variants = displayName.getShort()) == null) ? null : variants.getTitle(), null, null, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, null) : null;
        StringResource stringResourceInvoke3 = companion.invoke(C15237R.string.order_create_market_price_row_title, new Object[0]);
        EquityOrderFormRowState.Icon icon = getEquityOrderContext() != null ? new EquityOrderFormRowState.Icon(ServerToBentoAssetMapper2.QUESTION_16, companion.invoke(C15237R.string.order_create_market_price_row_info, new Object[0]), EquityOrderFormRowState.Icon.IconId.MARKET_DATA) : null;
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        this.marketPriceRow = new EquityOrderFormRowState.Information(EquityOrderFormRowState2.MarketPriceRowTestTag, stringResourceInvoke3, companion.invoke((equityOrderContext == null || (displayPrice = equityOrderContext.getDisplayPrice()) == null || (str = Formats.getPriceFormat().format(displayPrice)) == null) ? "$12.34" : str), icon, true, null, null, getEquityOrderContext() == null, true, 96, null);
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

    @Override // com.robinhood.android.equityadvancedorder.datastate.IMarket, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getEstimatedCostString() {
        return IMarket.DefaultImpls.getEstimatedCostString(this);
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

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityAdvancedOrderDataState.CommonState getCommonState() {
        return this.commonState;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getReadyToAdvanceToDetailEdit() {
        return getNumberOfShares().compareTo(BigDecimal.ZERO) > 0;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getShowTextButton() {
        return getCommonState().isBuyToClose() && getCommonState().getPosition() != null;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getBottomSheetRowStates(Boolean instrumentIs24HourMarketTradable, Boolean alwaysInclude24HourMarketRow, boolean useUnifiedTradingSessionSettingsSheet) {
        return extensions2.toImmutableList(CollectionsKt.emptyList());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EquityOrderContext getEquityOrderContext() {
        BigDecimal totalFeesAndTaxes;
        List<ApiFeeItem> fees;
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
        Order.Configuration configuration = Order.Configuration.MARKET;
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
        return equityOrderContextFactory.create(activeAccount, instrument, tradingSession, position, quote, new EquityOrderRequestInputs(staticInputs, accountNumber, id, null, overrideFlipIpoAccessShares, overrideToExecuteInMarketHoursOnly, overrideMarketHours, checkOverrides, quantityOrAmount, null, trailAmount, trailPercentage, presetPercentLimit, orderTimeInForce, configuration, totalFeesAndTaxes, fees, fee, true, null, CollectionsKt.emptyList(), getCommonState().getPositionEffect(), getCommonState().getSubzeroEnabled()), (64 & 64) != 0 ? Instant.now() : null, commonState.getInstrumentBuyingPower(), commonState.getOrderPendingReplacement());
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getActionOrderTypeHeaderLabel() {
        return StringResource.INSTANCE.invoke(C29312R.string.order_type_market_title, new Object[0]);
    }

    public final EquityOrderFormRowState.HeaderTitle getTitleRow() {
        return this.titleRow;
    }

    public final EquityOrderFormRowState.HeaderSubtitle getSubtitleRow() {
        return this.subtitleRow;
    }

    public final EquityOrderFormRowState.Empty getEmptyRow() {
        return this.emptyRow;
    }

    public final EditingField getNumberOfSharesRowType() {
        Position position;
        BigDecimal displayQuantity;
        if (getCommonState().isBuyToClose() && ((position = getCommonState().getPosition()) == null || (displayQuantity = position.getDisplayQuantity()) == null || !BigDecimals7.isInteger(displayQuantity))) {
            return EditingField.NUMBER_OF_FRACTIONAL_SHARES;
        }
        return EditingField.NUMBER_OF_WHOLE_SHARES;
    }

    public final EquityOrderFormRowState.EditableValue getNumberOfSharesRow() {
        return this.numberOfSharesRow;
    }

    public final EquityOrderFormRowState.DropdownEdit getAccountRow() {
        return this.accountRow;
    }

    public final EquityOrderFormRowState.Information getMarketPriceRow() {
        return this.marketPriceRow;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityOrderFormRowState> getRowStates() {
        if (getCommonState().getSide() == EquityOrderSide.SELL_SHORT || getCommonState().isBuyToClose()) {
            return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new EquityOrderFormRowState[]{this.titleRow, getCommonState().getAccountsWithAccessToMargin().size() == 1 ? this.subtitleRow : null, this.emptyRow, this.numberOfSharesRow, this.marketPriceRow, this.accountRow, getEstimatedCostRow()}));
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new EquityOrderFormRowState[]{this.titleRow, this.subtitleRow, this.emptyRow, getCommonState().getAdvancedMarketOrdersEnabled() ? EquityAdvancedOrderDataState2.getOrderTypeSelectionRow(this) : null, this.marketPriceRow, this.numberOfSharesRow, this.accountRow, getEstimatedCostRow()}));
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public InstrumentAccountSwitcherState getAccountSwitcherState() {
        EquityAdvancedOrderDataState.CommonState commonState = getCommonState();
        return InstrumentAccountSwitcherUtils.INSTANCE.makeAccountSwitcherState(commonState.getAccountSwitcher(), commonState.getAllAccounts(), isCancelNewOrder(), commonState.getSide(), commonState.getPositionEffect(), commonState.getAccountNumber(), commonState.getLoadingAccountSwitcher(), commonState.getUseSduiAccountSwitcher());
    }

    public final Order.Configuration getOrderConfiguration() {
        return Order.Configuration.MARKET;
    }
}
