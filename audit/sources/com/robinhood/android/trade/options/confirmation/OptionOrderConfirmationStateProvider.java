package com.robinhood.android.trade.options.confirmation;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.options.StringHelper;
import com.robinhood.android.common.options.order.OptionOrderType2;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.margin.contracts.MarginAccountUpsellFragmentKey;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.options.optionsstring.common.UiOptionOrders2;
import com.robinhood.android.options.optionsstring.orderconfirmation.OptionsOrderStatePromptStrings;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.common.strings.C32428R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderAdjustedEstimatedTotalNetAmount;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderFee;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.models.p355ui.UiOptionOrderSalesTax;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderConfirmationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0016\u0010\u000e\u001a\u00020\f*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u0002H\u0002J\f\u0010\u0017\u001a\u00020\t*\u00020\u0018H\u0002J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0001¢\u0006\u0002\b\u001bJ\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\tH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationDataState;", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getIsReplaceOrderBtnVisible", "", "ds", "getOptionStrategyName", "", "Lcom/robinhood/models/ui/UiOptionOrder;", "getOptionNameStr", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "getConfirmationTitle", "getOrderStatePrompt", "getFillPriceRowState", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationRowState;", "getLimitPriceRowState", "getStopPriceRowState", "requiresAdjustedEstimatedTotalNetAmountForIndexOptions", "Lcom/robinhood/shared/models/history/shared/OrderState;", "getAdjustedEstimatedTotalNetAmount", "Lcom/robinhood/models/db/OptionOrderAdjustedEstimatedTotalNetAmount;", "getAdjustedEstimatedTotalNetAmount$feature_trade_options_externalDebug", "getCreditOrCostLabelText", "adjustedEstimatedTotalNetAmount", "getCreditOrCostValueText", "getFeeFooterState", "Lcom/robinhood/android/trade/options/confirmation/FeeFooterState;", "shouldShowGstDisclosure", "getOptionsCancelNewContextData", "Lcom/robinhood/android/trade/options/confirmation/OptionsCancelNewContextData;", "getMarginAccountUpsell", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "reduce", "dataState", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderConfirmationStateProvider implements StateProvider<OptionOrderConfirmationDataState, OptionOrderConfirmationViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    /* compiled from: OptionOrderConfirmationStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderState.values().length];
            try {
                iArr[OrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderState.UNCONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderState.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderState.PARTIALLY_FILLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderState.PENDING_CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr2[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OptionOrderConfirmationStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    private final boolean getIsReplaceOrderBtnVisible(OptionOrderConfirmationDataState ds) {
        OptionOrder optionOrder;
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        if (uiOptionOrder == null || (optionOrder = uiOptionOrder.getOptionOrder()) == null) {
            return false;
        }
        return optionOrder.isReplaceable();
    }

    private final String getOptionStrategyName(UiOptionOrder uiOptionOrder, Resources resources) throws Resources.NotFoundException {
        int i;
        OptionStrategyType openingStrategy = uiOptionOrder.getOptionOrder().getOpeningStrategy();
        OptionStrategyType closingStrategy = uiOptionOrder.getOptionOrder().getClosingStrategy();
        OptionStrategyType rollingStrategy = uiOptionOrder.getRollingStrategy();
        if (rollingStrategy != null) {
            openingStrategy = rollingStrategy;
        } else if (openingStrategy == null || closingStrategy != null) {
            openingStrategy = (openingStrategy != null || closingStrategy == null) ? OptionStrategyType.CUSTOM : closingStrategy;
        }
        CharSequence name = OptionExtensions.getName(openingStrategy, resources, uiOptionOrder.getLegs().size());
        if (rollingStrategy != null) {
            i = C23386R.string.option_strategy_roll_with_symbol;
        } else {
            i = C32428R.string.option_order_symbol_with_strategy;
        }
        String string2 = resources.getString(i, uiOptionOrder.getOptionChain().getSymbol(), name);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getOptionNameStr(UiOptionOrder uiOptionOrder, UiOptionChain uiOptionChain) {
        UiOptionOrderLeg uiOptionOrderLeg = (UiOptionOrderLeg) CollectionsKt.singleOrNull((List) uiOptionOrder.getLegs());
        OptionInstrument optionInstrument = uiOptionOrderLeg != null ? uiOptionOrderLeg.getOptionInstrument() : null;
        if (optionInstrument != null && uiOptionChain != null) {
            return OptionInstruments.getTitleStringWithExpiration(optionInstrument, this.resources, uiOptionChain);
        }
        return getOptionStrategyName(uiOptionOrder, this.resources);
    }

    private final String getConfirmationTitle(OptionOrderConfirmationDataState ds) throws Resources.NotFoundException {
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        if (uiOptionOrder == null) {
            return "";
        }
        String lowerCase = UiOptionOrders2.getStateString(uiOptionOrder, this.resources).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String string2 = this.resources.getString(C29757R.string.options_order_confirmation_title, ds.getUiOptionOrder().getOptionChain().getSymbol(), lowerCase);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getOrderStatePrompt(OptionOrderConfirmationDataState ds) {
        OptionOrder optionOrder;
        OrderState state = null;
        if (ds.getUiOptionOrder() == null) {
            return null;
        }
        Resources resources = this.resources;
        OptionOrderType optionOrderType = OptionOrderType2.toOptionOrderType(ds.getUiOptionOrder().getOptionOrder());
        OrderState state2 = ds.getUiOptionOrder().getOptionOrder().getState();
        String optionNameStr = getOptionNameStr(ds.getUiOptionOrder(), ds.getSingleUiOptionChain());
        UiOptionOrder uiOptionOrderToReplace = ds.getUiOptionOrderToReplace();
        if (uiOptionOrderToReplace != null && (optionOrder = uiOptionOrderToReplace.getOptionOrder()) != null) {
            state = optionOrder.getState();
        }
        return OptionsOrderStatePromptStrings.getOrderStatePromptStr(resources, optionOrderType, state2, optionNameStr, state);
    }

    private final OptionOrderConfirmationRowState getFillPriceRowState(OptionOrderConfirmationDataState ds) throws Resources.NotFoundException {
        OptionOrder optionOrder;
        String string2;
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        if (uiOptionOrder == null || (optionOrder = uiOptionOrder.getOptionOrder()) == null || OptionOrderType2.toOptionOrderType(optionOrder) != OptionOrderType.MARKET || !optionOrder.getState().hasExecutions()) {
            return null;
        }
        BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(optionOrder.getAverageNetPremiumPaid().abs(), ds.getUiOptionOrder().getOptionChain().getTradeValueMultiplier());
        if (optionOrder.getProcessedQuantity().compareTo(BigDecimal.ONE) > 0) {
            string2 = this.resources.getString(C29757R.string.option_order_average_fill_price_label);
        } else {
            string2 = this.resources.getString(C29757R.string.option_order_fill_price_label);
        }
        Intrinsics.checkNotNull(string2);
        return new OptionOrderConfirmationRowState(string2, Formats.getPriceFormat().format(bigDecimalSafeDivide));
    }

    private final OptionOrderConfirmationRowState getLimitPriceRowState(OptionOrderConfirmationDataState ds) throws Resources.NotFoundException {
        BigDecimal price;
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        OptionOrder optionOrder = uiOptionOrder != null ? uiOptionOrder.getOptionOrder() : null;
        if (optionOrder == null || (price = optionOrder.getPrice()) == null || optionOrder.getType() != OrderType.LIMIT) {
            return null;
        }
        String string2 = this.resources.getString(C29757R.string.option_order_confirmation_limit_price_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OptionOrderConfirmationRowState(string2, Formats.getPriceFormat().format(price));
    }

    private final OptionOrderConfirmationRowState getStopPriceRowState(OptionOrderConfirmationDataState ds) throws Resources.NotFoundException {
        OptionOrder optionOrder;
        BigDecimal stopPrice;
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        if (uiOptionOrder == null || (optionOrder = uiOptionOrder.getOptionOrder()) == null || (stopPrice = optionOrder.getStopPrice()) == null || OptionOrderType2.toOptionOrderType(optionOrder) != OptionOrderType.STOP_MARKET) {
            return null;
        }
        String string2 = this.resources.getString(C29757R.string.option_order_confirmation_stop_trigger_price_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OptionOrderConfirmationRowState(string2, Formats.getPriceFormat().format(stopPrice));
    }

    private final boolean requiresAdjustedEstimatedTotalNetAmountForIndexOptions(OrderState orderState) {
        int i = WhenMappings.$EnumSwitchMapping$0[orderState.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    /* renamed from: getAdjustedEstimatedTotalNetAmount$feature_trade_options_externalDebug */
    public final OptionOrderAdjustedEstimatedTotalNetAmount m2511x9b782a28(OptionOrderConfirmationDataState ds) {
        OptionOrder optionOrder;
        OrderDirection orderDirection;
        Intrinsics.checkNotNullParameter(ds, "ds");
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        if (uiOptionOrder == null || (optionOrder = uiOptionOrder.getOptionOrder()) == null) {
            return null;
        }
        UiOptionChain singleUiOptionChain = ds.getSingleUiOptionChain();
        if ((singleUiOptionChain != null ? singleUiOptionChain.getUnderlyingType() : null) == OptionChain.UnderlyingType.INDEX && requiresAdjustedEstimatedTotalNetAmountForIndexOptions(optionOrder.getState()) && ds.getUiOptionOrderFee() != null) {
            BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(optionOrder.getPendingQuantity(), optionOrder.getQuantity());
            BigDecimal bigDecimalAbs = optionOrder.getEstimatedTotalNetAmount().abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            BigDecimal bigDecimalMultiply = bigDecimalAbs.multiply(optionOrder.getEstimatedTotalNetAmountDirection().getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalAdd = ds.getUiOptionOrderFee().getExchangeFee().getFee().add(ds.getUiOptionOrderFee().getContractFee().getFee());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            BigDecimal bigDecimalMultiply2 = bigDecimalAdd.multiply(bigDecimalSafeDivide);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            BigDecimal bigDecimalAdd2 = bigDecimalMultiply.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
            if (bigDecimalAdd2.signum() == 1) {
                orderDirection = OrderDirection.DEBIT;
            } else {
                orderDirection = OrderDirection.CREDIT;
            }
            return new OptionOrderAdjustedEstimatedTotalNetAmount(bigDecimalAdd2, orderDirection);
        }
        return new OptionOrderAdjustedEstimatedTotalNetAmount(optionOrder.getEstimatedTotalNetAmount(), optionOrder.getEstimatedTotalNetAmountDirection());
    }

    private final String getCreditOrCostLabelText(OptionOrderConfirmationDataState ds, OptionOrderAdjustedEstimatedTotalNetAmount adjustedEstimatedTotalNetAmount) {
        Boolean boolValueOf;
        List<UiOptionOrderLeg> legs;
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        if (uiOptionOrder == null || (legs = uiOptionOrder.getLegs()) == null) {
            boolValueOf = null;
        } else {
            List<UiOptionOrderLeg> list = legs;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((UiOptionOrderLeg) it.next()).getLeg().getSide() == OrderSide.SELL) {
                        z = true;
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        UiOptionOrder uiOptionOrder2 = ds.getUiOptionOrder();
        OptionOrder optionOrder = uiOptionOrder2 != null ? uiOptionOrder2.getOptionOrder() : null;
        OrderDirection estimatedTotalNetAmountDirection = adjustedEstimatedTotalNetAmount != null ? adjustedEstimatedTotalNetAmount.getEstimatedTotalNetAmountDirection() : null;
        if (ds.getShouldShowCatFeeNewCopy()) {
            return StringHelper.getEstTotalCostCreditLabelString(this.resources, estimatedTotalNetAmountDirection);
        }
        if (estimatedTotalNetAmountDirection == null || optionOrder == null) {
            return StringHelper.getTotalCostCreditLabelString(this.resources, null);
        }
        OrderDirection orderDirection = OrderDirection.DEBIT;
        if (estimatedTotalNetAmountDirection == orderDirection && !Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return StringHelper.getEstCostOrCreditLabelString(this.resources, orderDirection);
        }
        if (estimatedTotalNetAmountDirection == orderDirection && !optionOrder.getState().isFinal()) {
            return StringHelper.getEstCostOrCreditLabelString(this.resources, orderDirection);
        }
        if (estimatedTotalNetAmountDirection == orderDirection && optionOrder.getState().isFinal()) {
            return StringHelper.getTotalCostCreditLabelString(this.resources, orderDirection);
        }
        OrderDirection orderDirection2 = OrderDirection.CREDIT;
        if (estimatedTotalNetAmountDirection == orderDirection2 && !Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            return StringHelper.getEstCostOrCreditLabelString(this.resources, orderDirection2);
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("It's not possible to receive a credit with no sell leg. UiOptionOrder: " + ds.getUiOptionOrder()), true, null, 4, null);
        return StringHelper.getTotalCostCreditLabelString(this.resources, null);
    }

    private final String getCreditOrCostValueText(OptionOrderAdjustedEstimatedTotalNetAmount adjustedEstimatedTotalNetAmount) {
        BigDecimal estimatedTotalNetAmount;
        return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), (adjustedEstimatedTotalNetAmount == null || (estimatedTotalNetAmount = adjustedEstimatedTotalNetAmount.getEstimatedTotalNetAmount()) == null) ? null : estimatedTotalNetAmount.abs(), null, 2, null);
    }

    static /* synthetic */ FeeFooterState getFeeFooterState$default(OptionOrderConfirmationStateProvider optionOrderConfirmationStateProvider, OptionOrderConfirmationDataState optionOrderConfirmationDataState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return optionOrderConfirmationStateProvider.getFeeFooterState(optionOrderConfirmationDataState, z);
    }

    private final FeeFooterState getFeeFooterState(OptionOrderConfirmationDataState ds, boolean shouldShowGstDisclosure) {
        BigDecimal totalRegFeeRateWithoutCatFee;
        if (Intrinsics.areEqual(ds.getUserLocale(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return new FeeFooterState(ds.getShouldShowCatFeeNewCopy() ? null : this.resources.getString(C29757R.string.uk_option_order_confirmation_fee_footer), this.resources.getString(C29757R.string.uk_option_order_confirmation_fee_footer_inline_link_text), null, this.resources.getString(C29757R.string.uk_option_order_confirmation_fee_footer_url));
        }
        if (shouldShowGstDisclosure) {
            return new FeeFooterState(this.resources.getString(C29757R.string.apac_option_order_confirmation_fee_footer), this.resources.getString(C29757R.string.apac_option_order_confirmation_fee_footer), null, this.resources.getString(C29757R.string.apac_option_order_confirmation_fee_footer_url));
        }
        if (ds.getSingleUiOptionChain() == null || ds.getUiOptionOrderFee() == null) {
            return new FeeFooterState(ds.getShouldShowCatFeeNewCopy() ? null : this.resources.getString(C29757R.string.option_order_confirmation_fee_footer_general), null, null, null);
        }
        OptionChain.UnderlyingType underlyingType = ds.getSingleUiOptionChain().getUnderlyingType();
        if (ds.getShouldIncludeCatFee()) {
            int i = WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
            if (i == 1) {
                totalRegFeeRateWithoutCatFee = ds.getUiOptionOrderFee().getTotalRegFeeRate();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                totalRegFeeRateWithoutCatFee = ds.getUiOptionOrderFee().getTotalIndexOptionFeeRate();
            }
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
            if (i2 == 1) {
                totalRegFeeRateWithoutCatFee = ds.getUiOptionOrderFee().getTotalRegFeeRateWithoutCatFee();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                totalRegFeeRateWithoutCatFee = ds.getUiOptionOrderFee().getTotalIndexOptionFeeRateWithoutCatFee();
            }
        }
        return new FeeFooterState(ds.getShouldShowCatFeeNewCopy() ? null : this.resources.getString(C29757R.string.option_order_confirmation_fee_footer_specific, Formats.getAmountFormat().format(totalRegFeeRateWithoutCatFee)), this.resources.getString(C29757R.string.option_order_confirmation_fee_footer_specific_inline_link_text), (ds.getUiOptionOrderFee().isGold() && underlyingType == OptionChain.UnderlyingType.INDEX) ? this.resources.getString(C29757R.string.gated_gold_index_option_order_confirmation_gold_fee_savings, Formats.getPriceFormat().format(ds.getUiOptionOrderFee().getGoldFeeSavings().getFeeTotalSavings())) : null, this.resources.getString(C29757R.string.option_order_confirmation_trading_fee_link));
    }

    private final OptionsCancelNewContextData getOptionsCancelNewContextData(OptionOrderConfirmationDataState ds) {
        OptionOrder optionOrder;
        UUID id;
        OptionOrder optionOrder2;
        UUID id2;
        UiOptionOrder uiOptionOrderToReplace = ds.getUiOptionOrderToReplace();
        String string2 = null;
        String string3 = (uiOptionOrderToReplace == null || (optionOrder2 = uiOptionOrderToReplace.getOptionOrder()) == null || (id2 = optionOrder2.getId()) == null) ? null : id2.toString();
        UiOptionOrder uiOptionOrder = ds.getUiOptionOrder();
        if (uiOptionOrder != null && (optionOrder = uiOptionOrder.getOptionOrder()) != null && (id = optionOrder.getId()) != null) {
            string2 = id.toString();
        }
        return new OptionsCancelNewContextData(string2, string3);
    }

    private final MarginAccountUpsellFragmentKey getMarginAccountUpsell(OptionOrderConfirmationDataState ds) {
        UiOptionOrder uiOptionOrder;
        OptionOrder optionOrder;
        Account account;
        String accountNumber;
        if (!ds.isEligibleToShowMarginAccountUpsell() || (uiOptionOrder = ds.getUiOptionOrder()) == null || (optionOrder = uiOptionOrder.getOptionOrder()) == null || (account = ds.getAccount()) == null || (accountNumber = account.getAccountNumber()) == null) {
            return null;
        }
        BrokerageAccountType brokerageAccountType = ds.getAccount().getBrokerageAccountType();
        if (optionOrder.getEstimatedTotalNetAmountDirection() != OrderDirection.CREDIT) {
            return null;
        }
        return new MarginAccountUpsellFragmentKey(accountNumber, brokerageAccountType, Money3.toMoney$default(ds.getUiOptionOrder().getOptionOrder().getEstimatedTotalNetAmount(), null, 1, null));
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionOrderConfirmationViewState reduce(OptionOrderConfirmationDataState dataState) throws Resources.NotFoundException {
        DisplayName displayName;
        DisplayName.Variants withInvesting;
        OptionChain optionChain;
        List<UiOptionOrderSalesTax> salesTaxes;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionOrderAdjustedEstimatedTotalNetAmount optionOrderAdjustedEstimatedTotalNetAmountM2511x9b782a28 = m2511x9b782a28(dataState);
        UiOptionOrderFee uiOptionOrderFee = dataState.getUiOptionOrderFee();
        boolean z = false;
        if (uiOptionOrderFee != null && (salesTaxes = uiOptionOrderFee.getSalesTaxes()) != null) {
            List<UiOptionOrderSalesTax> list = salesTaxes;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((UiOptionOrderSalesTax) it.next()).getType(), OptionOrderConfirmationStateProvider2.GST_FEE_TYPE)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        boolean isReplaceOrderBtnVisible = getIsReplaceOrderBtnVisible(dataState);
        UiOptionOrder uiOptionOrder = dataState.getUiOptionOrder();
        StringResource title = null;
        UUID id = (uiOptionOrder == null || (optionChain = uiOptionOrder.getOptionChain()) == null) ? null : optionChain.getId();
        OptionsCancelNewContextData optionsCancelNewContextData = getOptionsCancelNewContextData(dataState);
        String confirmationTitle = getConfirmationTitle(dataState);
        String orderStatePrompt = getOrderStatePrompt(dataState);
        OptionOrderConfirmationRowState fillPriceRowState = getFillPriceRowState(dataState);
        OptionOrderConfirmationRowState limitPriceRowState = getLimitPriceRowState(dataState);
        OptionOrderConfirmationRowState stopPriceRowState = getStopPriceRowState(dataState);
        String creditOrCostLabelText = getCreditOrCostLabelText(dataState, optionOrderAdjustedEstimatedTotalNetAmountM2511x9b782a28);
        String creditOrCostValueText = getCreditOrCostValueText(optionOrderAdjustedEstimatedTotalNetAmountM2511x9b782a28);
        Account account = dataState.getAccount();
        StringResource title2 = (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withInvesting = displayName.getWithInvesting()) == null) ? null : withInvesting.getTitle();
        Account account2 = dataState.getAccount();
        if (account2 != null && account2.getHasNickname()) {
            title = AccountDisplayNames.getDisplayNameWithoutNickname(dataState.getAccount()).getShort().getTitle();
        }
        return new OptionOrderConfirmationViewState(isReplaceOrderBtnVisible, id, optionsCancelNewContextData, confirmationTitle, orderStatePrompt, fillPriceRowState, limitPriceRowState, stopPriceRowState, creditOrCostLabelText, creditOrCostValueText, getFeeFooterState(dataState, z), title2, title, dataState.isEligibleToShowL3EntryPoint(), getMarginAccountUpsell(dataState));
    }
}
