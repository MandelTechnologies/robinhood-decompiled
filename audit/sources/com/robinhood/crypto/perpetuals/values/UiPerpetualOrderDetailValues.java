package com.robinhood.crypto.perpetuals.values;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.crypto.models.perpetuals.p288db.OrderSide;
import com.robinhood.crypto.models.perpetuals.p288db.OrderStatus;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualContract;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualCurrencyInput;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualHistoryType;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMoney;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderDetails;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderFees;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualOrderDetails;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.crypto.perpetuals.util.PerpetualMoneyUtil;
import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiPerpetualOrderDetailValues.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\n\u001a\u00020\u0001\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0016\u001a\u00020\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\"\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0015\u0010 \u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001a\"\u0015\u0010\"\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001a\"\u0017\u0010$\u001a\u0004\u0018\u00010\u0004*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u001f\"\u001e\u0010&\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006*"}, m3636d2 = {"getOrderSizeLabel", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "getOrderSizeValue", "", "resources", "Landroid/content/res/Resources;", "getQuantityLabel", "getQuantityValue", "getLeverageText", "getAverageExecutedPriceLabel", "getAverageExecutedPriceValue", "getEstimatedOrderPriceLabel", "getEstimatedOrderPriceValue", "hasAverageExecutedPrice", "", "getHasAverageExecutedPrice", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;)Z", "getTpSlPriceLabel", "getTpSlPriceValue", "getFeesLabel", "getFeesValue", "orderIsPartiallyOrFullyExecuted", "getOrderIsPartiallyOrFullyExecuted", "historyRowLabelText", "getHistoryRowLabelText", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;)Lcom/robinhood/utils/resource/StringResource;", "getHistoryStatusBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "historyRowValueText", "getHistoryRowValueText", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;)Ljava/lang/String;", "historyRowSecondaryValueText", "getHistoryRowSecondaryValueText", "pendingHistoryRowSecondaryLabelText", "getPendingHistoryRowSecondaryLabelText", "pendingHistoryRowSecondaryValueText", "getPendingHistoryRowSecondaryValueText", "historyTypeOrderSideText", "getHistoryTypeOrderSideText$annotations", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;)V", "getHistoryTypeOrderSideText", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.UiPerpetualOrderDetailValuesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UiPerpetualOrderDetailValues {

    /* compiled from: UiPerpetualOrderDetailValues.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.UiPerpetualOrderDetailValuesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderStatus.values().length];
            try {
                iArr[OrderStatus.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStatus.PARTIALLY_FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStatus.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderStatus.PENDING_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderStatus.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderStatus.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OrderStatus.NEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OrderStatus.UNCONFIRMED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OrderStatus.PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OrderStatus.CONFIRMED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PerpetualHistoryType.values().length];
            try {
                iArr2[PerpetualHistoryType.CLOSE_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PerpetualHistoryType.LIQUIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PerpetualHistoryType.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PerpetualHistoryType.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[PerpetualHistoryType.TAKE_PROFIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PerpetualHistoryType.STOP_LOSS.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderSide.values().length];
            try {
                iArr3[OrderSide.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[OrderSide.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ void getHistoryTypeOrderSideText$annotations(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
    }

    public static final StringResource getOrderSizeLabel(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (getOrderIsPartiallyOrFullyExecuted(uiPerpetualOrderDetails)) {
                    return StringResource.INSTANCE.invoke(C33018R.string.order_size_filled_label_text, new Object[0]);
                }
                return StringResource.INSTANCE.invoke(C33018R.string.order_size_label_text, new Object[0]);
            case 8:
            case 9:
            case 10:
            case 11:
                return StringResource.INSTANCE.invoke(C33018R.string.estimated_order_size_label_text, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getOrderSizeValue(UiPerpetualOrderDetails uiPerpetualOrderDetails, Resources resources) {
        CurrencyDefinition quoteCurrencyForCost;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract == null || (quoteCurrencyForCost = perpetualContract.getQuoteCurrencyForCost()) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().ordinal()];
        if (i == 1) {
            return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getExecutedNotional(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForCost), null, null, false, false, false, false, 2026, null);
        }
        if (i == 2) {
            return resources.getString(C33018R.string.order_details_partially_filled_value, CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getExecutedNotional(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForCost), null, null, false, false, false, false, 2026, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalNotionalAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForCost), null, null, false, false, false, false, 2026, null));
        }
        if (getOrderIsPartiallyOrFullyExecuted(uiPerpetualOrderDetails)) {
            return resources.getString(C33018R.string.order_details_partially_filled_value, CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getExecutedNotional(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForCost), null, null, false, false, false, false, 2026, null), CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalNotionalAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForCost), null, null, false, false, false, false, 2026, null));
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalNotionalAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForCost), null, null, false, false, false, false, 2026, null);
    }

    public static final StringResource getQuantityLabel(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (getOrderIsPartiallyOrFullyExecuted(uiPerpetualOrderDetails)) {
                    return StringResource.INSTANCE.invoke(C33018R.string.quantity_filled_label_text, new Object[0]);
                }
                return StringResource.INSTANCE.invoke(C33018R.string.quantity_label_text, new Object[0]);
            case 8:
            case 9:
            case 10:
            case 11:
                return StringResource.INSTANCE.invoke(C33018R.string.estimated_quantity_label_text, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getQuantityValue(UiPerpetualOrderDetails uiPerpetualOrderDetails, Resources resources) {
        CurrencyDefinition assetCurrencyForCost;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract == null || (assetCurrencyForCost = perpetualContract.getAssetCurrencyForCost()) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().ordinal()];
        if (i == 1) {
            return CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getExecutedQuantity(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(assetCurrencyForCost), null, null, false, false, false, false, 2026, null);
        }
        if (i == 2) {
            return resources.getString(C33018R.string.order_details_partially_filled_value, CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getExecutedQuantity(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(assetCurrencyForCost), null, null, false, false, false, false, 2024, null), CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalContractQuantity(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(assetCurrencyForCost), null, null, false, false, false, false, 2026, null));
        }
        if (getOrderIsPartiallyOrFullyExecuted(uiPerpetualOrderDetails)) {
            return resources.getString(C33018R.string.order_details_partially_filled_value, CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getExecutedQuantity(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(assetCurrencyForCost), null, null, false, false, false, false, 2024, null), CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalContractQuantity(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(assetCurrencyForCost), null, null, false, false, false, false, 2026, null));
        }
        return CurrencyDefinitions.formatCurrency$default(assetCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalContractQuantity(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(assetCurrencyForCost), null, null, false, false, false, false, 2026, null);
    }

    public static final String getLeverageText(UiPerpetualOrderDetails uiPerpetualOrderDetails, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C33018R.string.order_details_leverage_value, PerpetualDisplayNames.getShortDisplayName(uiPerpetualOrderDetails.getOrderDetails().getMarginMode()).getText(resources), uiPerpetualOrderDetails.getOrderDetails().getLeverage().toString());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final StringResource getAverageExecutedPriceLabel() {
        return StringResource.INSTANCE.invoke(C33018R.string.order_details_average_executed_price_label, new Object[0]);
    }

    public static final String getAverageExecutedPriceValue(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        PerpetualCurrencyInput quoteCurrencyForPriceDisplay;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract != null && (quoteCurrencyForPriceDisplay = perpetualContract.getQuoteCurrencyForPriceDisplay()) != null) {
            BigDecimal averageExecutedPrice = uiPerpetualOrderDetails.getOrderDetails().getAverageExecutedPrice();
            if (getHasAverageExecutedPrice(uiPerpetualOrderDetails) && averageExecutedPrice != null) {
                return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceDisplay, averageExecutedPrice, false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForPriceDisplay), null, null, false, false, false, false, 2026, null);
            }
        }
        return null;
    }

    public static final StringResource getEstimatedOrderPriceLabel(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        return QuoteTypeDisplayNames.getDisplayName(uiPerpetualOrderDetails.getOrderDetails().getEstimatedOrderPrice().getQuoteType());
    }

    public static final String getEstimatedOrderPriceValue(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        PerpetualCurrencyInput quoteCurrencyForPriceDisplay;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract == null || (quoteCurrencyForPriceDisplay = perpetualContract.getQuoteCurrencyForPriceDisplay()) == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceDisplay, uiPerpetualOrderDetails.getOrderDetails().getEstimatedOrderPrice().getPrice(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForPriceDisplay), null, null, false, false, false, false, 2026, null);
    }

    public static final boolean getHasAverageExecutedPrice(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return getOrderIsPartiallyOrFullyExecuted(uiPerpetualOrderDetails);
    }

    public static final StringResource getTpSlPriceLabel(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        PerpetualOrderDetails.OrderType orderType = uiPerpetualOrderDetails.getOrderDetails().getOrderType();
        if (orderType instanceof PerpetualOrderDetails.OrderType.TakeProfit) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_take_profit_price_label, new Object[0]);
        }
        if (orderType instanceof PerpetualOrderDetails.OrderType.StopLoss) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_details_stop_loss_price_label, new Object[0]);
        }
        return null;
    }

    public static final String getTpSlPriceValue(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        PerpetualCurrencyInput quoteCurrencyForPriceDisplay;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract != null && (quoteCurrencyForPriceDisplay = perpetualContract.getQuoteCurrencyForPriceDisplay()) != null) {
            PerpetualOrderDetails.OrderType orderType = uiPerpetualOrderDetails.getOrderDetails().getOrderType();
            if (orderType instanceof PerpetualOrderDetails.OrderType.TakeProfit) {
                return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceDisplay, ((PerpetualOrderDetails.OrderType.TakeProfit) orderType).getPrice(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForPriceDisplay), null, null, false, false, false, false, 2026, null);
            }
            if (orderType instanceof PerpetualOrderDetails.OrderType.StopLoss) {
                return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceDisplay, ((PerpetualOrderDetails.OrderType.StopLoss) orderType).getPrice(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForPriceDisplay), null, null, false, false, false, false, 2026, null);
            }
        }
        return null;
    }

    public static final StringResource getFeesLabel(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        if (getOrderIsPartiallyOrFullyExecuted(uiPerpetualOrderDetails)) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_fees_label_text, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C33018R.string.order_estimated_fees_label_text, new Object[0]);
    }

    public static final String getFeesValue(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        PerpetualMoney fees;
        PerpetualOrderFees orderFees;
        PerpetualMoney fees2;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
                PerpetualOrderFees orderFees2 = uiPerpetualOrderDetails.getOrderDetails().getOrderFees();
                if (orderFees2 == null || (fees = orderFees2.getFees()) == null) {
                    return null;
                }
                return PerpetualMoneyUtil.getFormattedAmount(fees);
            case 3:
                if (!getOrderIsPartiallyOrFullyExecuted(uiPerpetualOrderDetails) || (orderFees = uiPerpetualOrderDetails.getOrderDetails().getOrderFees()) == null || (fees2 = orderFees.getFees()) == null) {
                    return null;
                }
                return PerpetualMoneyUtil.getFormattedAmount(fees2);
            case 5:
            case 6:
            case 7:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean getOrderIsPartiallyOrFullyExecuted(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return BigDecimals7.isPositive(uiPerpetualOrderDetails.getOrderDetails().getExecutedNotional());
        }
        return false;
    }

    public static final StringResource getHistoryRowLabelText(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        String symbol;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract == null || (symbol = perpetualContract.getSymbol()) == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[uiPerpetualOrderDetails.getOrderDetails().getHistoryType().ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C33018R.string.order_close_position_history_row_label_text, symbol);
            case 2:
                return StringResource.INSTANCE.invoke(C33018R.string.order_liquidation_history_row_label_text, symbol);
            case 3:
            case 4:
                return StringResource.INSTANCE.invoke(C33018R.string.order_history_row_label_text, symbol, PerpetualDisplayNames.getLowercaseDisplayName(uiPerpetualOrderDetails.getOrderDetails().getOrderSide()), uiPerpetualOrderDetails.getOrderDetails().getLeverage());
            case 5:
            case 6:
                return StringResource.INSTANCE.invoke(C33018R.string.order_tpsl_history_row_label_text, symbol, HistoryTypeDisplayNames.getLowercaseDisplayName(uiPerpetualOrderDetails.getOrderDetails().getHistoryType()));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TransactionSummary.Badge getHistoryStatusBadge(UiPerpetualOrderDetails uiPerpetualOrderDetails, Resources resources) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (uiPerpetualOrderDetails.getOrderDetails().getOrderStatus().isPending()) {
            return null;
        }
        OrderStatus orderStatus = uiPerpetualOrderDetails.getOrderDetails().getOrderStatus();
        if (WhenMappings.$EnumSwitchMapping$0[orderStatus.ordinal()] == 1) {
            return null;
        }
        return new TransactionSummary.Badge(OrderStatusDisplayNames.getDisplayName(orderStatus).getText(resources), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
    }

    public static final String getHistoryRowValueText(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        CurrencyDefinition quoteCurrencyForCost;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract == null || (quoteCurrencyForCost = perpetualContract.getQuoteCurrencyForCost()) == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForCost, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalNotionalAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(quoteCurrencyForCost), null, null, false, false, false, false, 2026, null);
    }

    public static final StringResource getHistoryRowSecondaryValueText(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[uiPerpetualOrderDetails.getOrderDetails().getHistoryType().ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
                return StringResource.INSTANCE.invoke(C33018R.string.order_history_margin_mode_leverage_text, PerpetualDisplayNames.getShortDisplayName(uiPerpetualOrderDetails.getOrderDetails().getMarginMode()), uiPerpetualOrderDetails.getOrderDetails().getLeverage());
            case 3:
            case 4:
                return getHistoryTypeOrderSideText(uiPerpetualOrderDetails);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getPendingHistoryRowSecondaryLabelText(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[uiPerpetualOrderDetails.getOrderDetails().getHistoryType().ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
                return StringResource.INSTANCE.invoke(C33018R.string.order_tpsl_pending_history_row_secondary_label_text, PerpetualDisplayNames.getShortDisplayName(uiPerpetualOrderDetails.getOrderDetails().getMarginMode()), PerpetualDisplayNames.getDisplayName(uiPerpetualOrderDetails.getOrderDetails().getOrderSide()), uiPerpetualOrderDetails.getOrderDetails().getLeverage());
            case 3:
            case 4:
                return StringResource.INSTANCE.invoke(C33018R.string.order_pending_history_row_secondary_label_text, PerpetualDisplayNames.getShortDisplayName(uiPerpetualOrderDetails.getOrderDetails().getMarginMode()), getHistoryTypeOrderSideText(uiPerpetualOrderDetails));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getPendingHistoryRowSecondaryValueText(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        CurrencyDefinition assetCurrency;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        PerpetualContract perpetualContract = uiPerpetualOrderDetails.getPerpetualContract();
        if (perpetualContract == null || (assetCurrency = perpetualContract.getAssetCurrency()) == null) {
            return null;
        }
        return CurrencyDefinitions.formatCurrency$default(assetCurrency, uiPerpetualOrderDetails.getOrderDetails().getEstimatedTotalContractQuantity(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(assetCurrency), null, null, false, false, false, false, 2026, null);
    }

    public static final StringResource getHistoryTypeOrderSideText(UiPerpetualOrderDetails uiPerpetualOrderDetails) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(uiPerpetualOrderDetails, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C33018R.string.order_history_type_order_side_text;
        StringResource displayName = HistoryTypeDisplayNames.getDisplayName(uiPerpetualOrderDetails.getOrderDetails().getHistoryType());
        int i2 = WhenMappings.$EnumSwitchMapping$2[uiPerpetualOrderDetails.getOrderDetails().getOrderSide().ordinal()];
        if (i2 == 1) {
            stringResourceInvoke = companion.invoke(C33018R.string.order_side_buy, new Object[0]);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = companion.invoke(C33018R.string.order_side_sell, new Object[0]);
        }
        return companion.invoke(i, displayName, stringResourceInvoke);
    }
}
