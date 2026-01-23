package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import android.content.res.Resources;
import androidx.compose.p011ui.text.font.FontWeight;
import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p314db.CryptoOrderTradeBonus;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.fee.CryptoFee;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import com.robinhood.shared.crypto.utils.OrderSides3;
import com.robinhood.shared.crypto.utils.TokenizedStocksCalculations;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedTotalCostDto;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rosetta.nummus.order.SideDto;

/* compiled from: BaseCryptoConfirmationState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010!\u001a\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u00020%H\u0002\u001a\u0016\u0010&\u001a\u0004\u0018\u00010\"*\u00020#2\u0006\u0010'\u001a\u00020\u0002H\u0002\u001a\u0016\u0010(\u001a\u0004\u0018\u00010\"*\u00020#2\u0006\u0010$\u001a\u00020%H\u0002\u001a\u0016\u0010)\u001a\u0004\u0018\u00010\"*\u00020#2\u0006\u0010'\u001a\u00020\u0002H\u0002\u001a\u0012\u0010.\u001a\u00020/*\u00020\u00022\u0006\u00100\u001a\u000201\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004\"\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004\"\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004\"\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\"\u0015\u0010\u0019\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004\"\u0015\u0010\u001b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004\"\u0015\u0010\u001d\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0004\"\u0015\u0010\u001f\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u0004\"\u0018\u0010*\u001a\u00020\"*\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b4\u00105¨\u00068"}, m3636d2 = {"dollarBasedAmountString", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getDollarBasedAmountString", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)Lcom/robinhood/utils/resource/StringResource;", "dollarBasedAmountStringWithSellSideQuoteTradeBonus", "getDollarBasedAmountStringWithSellSideQuoteTradeBonus", "quantityString", "getQuantityString", "quantityStringWithSymbol", "getQuantityStringWithSymbol", "quantityStringWithSymbolWithBuySideAssetTradeBonus", "getQuantityStringWithSymbolWithBuySideAssetTradeBonus", "remainingQuantityString", "getRemainingQuantityString", "canceledQuantityString", "getCanceledQuantityString", "cumulativeQuantityString", "getCumulativeQuantityString", "partialQuantityString", "getPartialQuantityString", "partialTotalString", "getPartialTotalString", "averagePriceString", "getAveragePriceString", "estimatedPriceString", "getEstimatedPriceString", "priceString", "getPriceString", "stopPriceString", "getStopPriceString", "orderTypeString", "getOrderTypeString", "sellSideQuoteTradeBonusStartSecondaryTextContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState;", "cryptoOrder", "Lcom/robinhood/models/crypto/db/CryptoOrder;", "sellSideQuoteTradeBonusEndSecondaryTextContent", "uiCryptoOrder", "buySideAssetTradeBonusStartSecondaryTextContent", "buySideAssetTradeBonusEndSecondaryTextContent", "primarySubText", "Lcom/robinhood/models/crypto/db/CryptoOrderTradeBonus;", "getPrimarySubText", "(Lcom/robinhood/models/crypto/db/CryptoOrderTradeBonus;)Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;", "estimatedTotalCostDto", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "resources", "Landroid/content/res/Resources;", "HUNDRED", "Ljava/math/BigDecimal;", "getHUNDRED", "()Ljava/math/BigDecimal;", "HUNDRED$delegate", "Lkotlin/Lazy;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.BaseCryptoConfirmationStateKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class BaseCryptoConfirmationState2 {
    private static final Lazy HUNDRED$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.confirmation.BaseCryptoConfirmationStateKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseCryptoConfirmationState2.HUNDRED_delegate$lambda$3();
        }
    });

    /* compiled from: BaseCryptoConfirmationState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.BaseCryptoConfirmationStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoOrderType.values().length];
            try {
                iArr[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDollarBasedAmountString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getDollarBasedAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public static final StringResource getDollarBasedAmountStringWithSellSideQuoteTradeBonus(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        BigDecimal dollarBasedAmount = uiCryptoOrder.getDollarBasedAmount();
        CryptoOrderTradeBonus quoteTradeBonus = uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus();
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), BigDecimals7.safeAdd(dollarBasedAmount, quoteTradeBonus != null ? quoteTradeBonus.getBonusAmount() : null), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public static final StringResource getQuantityString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrencyForCost(), uiCryptoOrder.getQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null));
    }

    public static final StringResource getQuantityStringWithSymbol(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrencyForCost(), uiCryptoOrder.getQuantity(), true, false, null, 0, null, null, false, false, false, false, 2044, null));
    }

    public static final StringResource getQuantityStringWithSymbolWithBuySideAssetTradeBonus(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        BigDecimal quantity = uiCryptoOrder.getQuantity();
        CryptoOrderTradeBonus assetTradeBonus = uiCryptoOrder.getCryptoOrder().getAssetTradeBonus();
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrencyForCost(), BigDecimals7.safeAdd(quantity, assetTradeBonus != null ? assetTradeBonus.getBonusAmount() : null), true, false, null, 0, null, null, false, false, false, false, 2044, null));
    }

    public static final StringResource getRemainingQuantityString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrencyForCost(), uiCryptoOrder.getRemainingQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null));
    }

    public static final StringResource getCanceledQuantityString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        BigDecimal canceledQuantity = uiCryptoOrder.getCanceledQuantity();
        if (canceledQuantity != null) {
            return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrencyForCost(), canceledQuantity, false, false, null, 0, null, null, false, false, false, false, 2044, null));
        }
        return null;
    }

    public static final StringResource getCumulativeQuantityString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrencyForCost(), uiCryptoOrder.getCumulativeQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null));
    }

    public static final StringResource getPartialQuantityString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_partial_fill_quantity, getCumulativeQuantityString(uiCryptoOrder), getQuantityString(uiCryptoOrder));
    }

    public static final StringResource getPartialTotalString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_partial_fill_quantity, UiCryptoOrders.getTotalNotionalWithFeeText(uiCryptoOrder), UiCryptoOrders.getEstimatedTotalNotionalWithFeeText(uiCryptoOrder));
    }

    public static final StringResource getAveragePriceString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getAveragePriceNotRounded(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public static final StringResource getEstimatedPriceString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getEstimatedPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public static final StringResource getPriceString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getCryptoOrder().getPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public static final StringResource getStopPriceString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        BigDecimal stopPrice = uiCryptoOrder.getStopPrice();
        if (stopPrice == null) {
            throw new IllegalStateException("Should have a stop price");
        }
        return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), stopPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public static final StringResource getOrderTypeString(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
        if (i == 1) {
            if (uiCryptoOrder.getCurrencyPair().isTokenizedStock()) {
                return StringResource.INSTANCE.invoke("");
            }
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_description_order_type_market, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_description_order_type_limit, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_description_order_type_stop_loss, new Object[0]);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_description_order_type_stop_limit, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderConfirmationRowState.TextContent sellSideQuoteTradeBonusStartSecondaryTextContent(BaseCryptoConfirmationState baseCryptoConfirmationState, CryptoOrder cryptoOrder) {
        CryptoOrderTradeBonus quoteTradeBonus;
        if (baseCryptoConfirmationState.isTradeBonusEnabled() && cryptoOrder.getSide() == OrderSide.SELL && (quoteTradeBonus = cryptoOrder.getQuoteTradeBonus()) != null) {
            return getPrimarySubText(quoteTradeBonus);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderConfirmationRowState.TextContent sellSideQuoteTradeBonusEndSecondaryTextContent(BaseCryptoConfirmationState baseCryptoConfirmationState, UiCryptoOrder uiCryptoOrder) {
        CryptoOrderTradeBonus quoteTradeBonus;
        if (baseCryptoConfirmationState.isTradeBonusEnabled() && uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.SELL && (quoteTradeBonus = uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus()) != null) {
            return new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrency(), quoteTradeBonus.getBonusAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null)), CryptoOrderConfirmationRowState.ColorOverride.DAY_PRIME, null, null, null, FontWeight.INSTANCE.getBold(), 28, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderConfirmationRowState.TextContent buySideAssetTradeBonusStartSecondaryTextContent(BaseCryptoConfirmationState baseCryptoConfirmationState, CryptoOrder cryptoOrder) {
        CryptoOrderTradeBonus assetTradeBonus;
        if (baseCryptoConfirmationState.isTradeBonusEnabled() && cryptoOrder.getSide() == OrderSide.BUY && (assetTradeBonus = cryptoOrder.getAssetTradeBonus()) != null) {
            return getPrimarySubText(assetTradeBonus);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderConfirmationRowState.TextContent buySideAssetTradeBonusEndSecondaryTextContent(BaseCryptoConfirmationState baseCryptoConfirmationState, UiCryptoOrder uiCryptoOrder) {
        CryptoOrderTradeBonus assetTradeBonus;
        if (baseCryptoConfirmationState.isTradeBonusEnabled() && uiCryptoOrder.getCryptoOrder().getSide() == OrderSide.BUY && (assetTradeBonus = uiCryptoOrder.getCryptoOrder().getAssetTradeBonus()) != null) {
            return new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrency(), assetTradeBonus.getBonusAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null)), CryptoOrderConfirmationRowState.ColorOverride.DAY_PRIME, null, null, null, FontWeight.INSTANCE.getBold(), 28, null);
        }
        return null;
    }

    private static final CryptoOrderConfirmationRowState.TextContent getPrimarySubText(CryptoOrderTradeBonus cryptoOrderTradeBonus) {
        return new CryptoOrderConfirmationRowState.TextContent(StringResource.INSTANCE.invoke(C38572R.string.crypto_order_confirmation_bonus_percentage, FormatsLocalized.getPercentFormat().format(cryptoOrderTradeBonus.getBonusRatio())), null, new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size12(ServerToBentoAssetMapper2.QUESTION_FILLED_12), CryptoOrderConfirmationRowState.ColorOverride.DAY_PRIME), new CryptoOrderConfirmationRowState.TapAction.ShowTradeBonusBottomSheet(cryptoOrderTradeBonus.isEstimate()), CryptoOrderConfirmationRowState.TextStyleOverride.TEXT_S_TRADE_BONUS_GRADIENT, FontWeight.INSTANCE.getBold(), 2, null);
    }

    public static final TokenizationEstimatedTotalCostDto estimatedTotalCostDto(UiCryptoOrder uiCryptoOrder, Resources resources) {
        IdlDecimal idlDecimal;
        TokenizationEstimatedTotalCostDto.OrderTypeDto orderTypeDto;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String code = uiCryptoOrder.getQuoteCurrency().getCode();
        String string2 = UiCryptoOrders.getSymbolWithTypeSingular(uiCryptoOrder).getText(resources).toString();
        IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(uiCryptoOrder.getCryptoOrder().getQuantity());
        CryptoFee.FixedRateFee.FixedRateFeeData fxFee = uiCryptoOrder.getCryptoOrder().getFxFee();
        if (fxFee == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BigDecimal bigDecimalMultiply = fxFee.getFeeRatio().multiply(getHUNDRED());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        IdlDecimal idlDecimal3 = IdlDecimal2.toIdlDecimal(bigDecimalMultiply);
        Currency quoteCurrency = uiCryptoOrder.getQuoteCurrency();
        OrderSide side = uiCryptoOrder.getCryptoOrder().getSide();
        BigDecimal quantity = uiCryptoOrder.getCryptoOrder().getQuantity();
        BigDecimal displayEstimatedPrice = uiCryptoOrder.getCryptoOrder().getDisplayEstimatedPrice();
        if (displayEstimatedPrice == null) {
            displayEstimatedPrice = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(displayEstimatedPrice);
        CryptoFee.FixedRateFee.FixedRateFeeData fxFee2 = uiCryptoOrder.getCryptoOrder().getFxFee();
        if (fxFee2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BigDecimal bigDecimalMultiply2 = fxFee2.getFeeRatio().multiply(getHUNDRED());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        String currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrency, TokenizedStocksCalculations.calculateTotalEstimatedCostOrCreditWithFeePercentage(side, quantity, displayEstimatedPrice, bigDecimalMultiply2), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        Currency quoteCurrency2 = uiCryptoOrder.getQuoteCurrency();
        BigDecimal quantity2 = uiCryptoOrder.getCryptoOrder().getQuantity();
        BigDecimal displayEstimatedPrice2 = uiCryptoOrder.getCryptoOrder().getDisplayEstimatedPrice();
        if (displayEstimatedPrice2 == null) {
            displayEstimatedPrice2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(displayEstimatedPrice2);
        CryptoFee.FixedRateFee.FixedRateFeeData fxFee3 = uiCryptoOrder.getCryptoOrder().getFxFee();
        if (fxFee3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BigDecimal bigDecimalMultiply3 = fxFee3.getFeeRatio().multiply(getHUNDRED());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        String currency$default2 = CurrencyDefinitions.formatCurrency$default(quoteCurrency2, TokenizedStocksCalculations.calculateExchangeFee(quantity2, displayEstimatedPrice2, bigDecimalMultiply3), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        String currency$default3 = CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrency(), BigDecimals7.safeMultiply(uiCryptoOrder.getCryptoOrder().getPrice(), uiCryptoOrder.getCryptoOrder().getQuantity()), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        Currency quoteCurrency3 = uiCryptoOrder.getQuoteCurrency();
        CryptoFee.FixedRateFee.FixedRateFeeData fxFee4 = uiCryptoOrder.getCryptoOrder().getFxFee();
        if (fxFee4 != null) {
            String currency$default4 = CurrencyDefinitions.formatCurrency$default(quoteCurrency3, fxFee4.getFeeAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
            IdlDecimal idlDecimal4 = new IdlDecimal("0.5");
            if (uiCryptoOrder.getCryptoOrder().getType() == CryptoOrderType.LIMIT) {
                idlDecimal = new IdlDecimal(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET);
            } else {
                idlDecimal = new IdlDecimal("0.5");
            }
            SideDto sideDto = OrderSides3.getSideDto(uiCryptoOrder.getCryptoOrder().getSide());
            int i = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
            if (i == 1) {
                orderTypeDto = TokenizationEstimatedTotalCostDto.OrderTypeDto.MARKET;
            } else if (i == 2) {
                orderTypeDto = TokenizationEstimatedTotalCostDto.OrderTypeDto.LIMIT;
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                orderTypeDto = null;
            }
            return new TokenizationEstimatedTotalCostDto(code, "USD", "", string2, idlDecimal2, idlDecimal3, currency$default, currency$default2, currency$default3, currency$default4, sideDto, idlDecimal4, idlDecimal, orderTypeDto);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal HUNDRED_delegate$lambda$3() {
        return new BigDecimal("100");
    }

    private static final BigDecimal getHUNDRED() {
        return (BigDecimal) HUNDRED$delegate.getValue();
    }
}
