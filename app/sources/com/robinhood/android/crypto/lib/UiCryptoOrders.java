package com.robinhood.android.crypto.lib;

import android.content.res.Resources;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.InitiatorType;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.fee.CryptoFee;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatCache;
import com.robinhood.shared.common.lib.formats.currency.CurrencyFormatModel;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: UiCryptoOrders.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u000e*\u00020\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\u0012\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0018\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\u0012\u0010+\u001a\u00020\t*\u00020\u00022\u0006\u0010,\u001a\u00020&\u001a\u0014\u0010/\u001a\u00020\t*\u00020\u00022\b\b\u0002\u00100\u001a\u000201\u001a\n\u00102\u001a\u00020\t*\u00020\u0002\u001a\u0012\u00109\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004\"\u0015\u0010\u0015\u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u0018\u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\"\u0015\u0010\u001a\u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017\"\u0015\u0010\u001c\u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017\"\u0015\u0010\u001e\u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017\"\u0015\u0010 \u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017\"\u0017\u0010'\u001a\u0004\u0018\u00010(*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0015\u0010-\u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u0017\"\u0017\u00103\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u0010\u0004\"\u0017\u00105\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u0010\u0004\"\u0015\u00107\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u0010\u0004\"\u0018\u0010:\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0004\"\u001a\u0010<\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0004\"\u0015\u0010>\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b?\u0010\u0004\"\u0015\u0010@\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010\u0004¨\u0006B"}, m3636d2 = {"getHistoryTitle", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getGetHistoryTitle", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)Lcom/robinhood/utils/resource/StringResource;", "typeText", "appType", "Lcom/robinhood/shared/app/type/AppType;", "toDisplayValue", "", "Lcom/robinhood/models/api/InitiatorType;", "resources", "Landroid/content/res/Resources;", "getStateText", "", "getPriceText", "getStopPriceText", "getFilledQuantityText", "getCanceledQuantityText", "getFilledQuantityTextWithoutSymbol", "getGetFilledQuantityTextWithoutSymbol", "totalNotionalText", "getTotalNotionalText", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)Ljava/lang/String;", "estimatedTotalNotionalWithFeeText", "getEstimatedTotalNotionalWithFeeText", "totalNotionalWithFeeText", "getTotalNotionalWithFeeText", "totalText", "getTotalText", "signedTotalNotionalWithFeeText", "getSignedTotalNotionalWithFeeText", "signedRoundedEstimatedNotionalWithEstimatedFee", "getSignedRoundedEstimatedNotionalWithEstimatedFee", "getSignedFormattedQuoteAmount", "quoteCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "amount", "Ljava/math/BigDecimal;", "cryptoFee", "Lcom/robinhood/models/crypto/db/fee/CryptoFee;", "getCryptoFee", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)Lcom/robinhood/models/crypto/db/fee/CryptoFee;", "feeAmountText", "feeAmount", "fxFeeAmount", "getFxFeeAmount", "getEnteredAmountAsAssetText", "isWithCurrencySymbol", "", "getEnteredAmountAsQuoteText", "orderEndPrimaryText", "getOrderEndPrimaryText", "orderEndSecondaryText", "getOrderEndSecondaryText", "secondaryTextForHistoryRow", "getSecondaryTextForHistoryRow", "amountTextForHistoryRow", "pendingLimitPriceText", "getPendingLimitPriceText", "pendingStopPriceText", "getPendingStopPriceText", "symbolWithType", "getSymbolWithType", "symbolWithTypeSingular", "getSymbolWithTypeSingular", "feature-lib-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.lib.UiCryptoOrdersKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class UiCryptoOrders {

    /* compiled from: UiCryptoOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.lib.UiCryptoOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

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
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InitiatorType.values().length];
            try {
                iArr3[InitiatorType.RECURRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[InitiatorType.TRADING_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AppType.values().length];
            try {
                iArr4[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ApiCurrency.Type.values().length];
            try {
                iArr5[ApiCurrency.Type.TOKENIZED_STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[ApiCurrency.Type.CRYPTOCURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[ApiCurrency.Type.FIAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[ApiCurrency.Type.PERPETUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[ApiCurrency.Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final StringResource getGetHistoryTitle(UiCryptoOrder uiCryptoOrder) {
        int i;
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        if (uiCryptoOrder.getCurrencyPair().isTokenizedStock()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = C12914R.string.crypto_order_history_title;
            StringResource symbolWithTypeSingular = getSymbolWithTypeSingular(uiCryptoOrder);
            int i3 = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
            if (i3 == 1) {
                int i4 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                if (i4 == 1) {
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_side_buy, new Object[0]);
                } else if (i4 == 2) {
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_type_limit_buy, new Object[0]);
                } else if (i4 == 3) {
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_type_stop_loss_buy, new Object[0]);
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_type_stop_limit_buy, new Object[0]);
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                if (i5 == 1) {
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_side_sell, new Object[0]);
                } else if (i5 == 2) {
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_type_limit_sell, new Object[0]);
                } else if (i5 == 3) {
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_type_stop_loss_sell, new Object[0]);
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = companion.invoke(C12914R.string.crypto_order_history_type_stop_limit_sell, new Object[0]);
                }
            }
            return companion.invoke(i2, symbolWithTypeSingular, stringResourceInvoke);
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i6 = C12914R.string.crypto_order_history_title;
        String code = uiCryptoOrder.getAssetCurrency().getCode();
        int i7 = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
        if (i7 == 1) {
            int i8 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
            if (i8 == 1) {
                if (WhenMappings.$EnumSwitchMapping$2[uiCryptoOrder.getCryptoOrder().getInitiatorType().ordinal()] == 1) {
                    i = C12914R.string.crypto_order_history_type_recurring_buy;
                } else {
                    i = C12914R.string.crypto_order_history_type_market_buy;
                }
            } else if (i8 == 2) {
                i = C12914R.string.crypto_order_history_type_limit_buy;
            } else if (i8 == 3) {
                i = C12914R.string.crypto_order_history_type_stop_loss_buy;
            } else {
                if (i8 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C12914R.string.crypto_order_history_type_stop_limit_buy;
            }
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
            if (i9 == 1) {
                i = C12914R.string.crypto_order_history_type_market_sell;
            } else if (i9 == 2) {
                i = C12914R.string.crypto_order_history_type_limit_sell;
            } else if (i9 == 3) {
                i = C12914R.string.crypto_order_history_type_stop_loss_sell;
            } else {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C12914R.string.crypto_order_history_type_stop_limit_sell;
            }
        }
        return companion2.invoke(i6, code, companion2.invoke(i, new Object[0]));
    }

    public static final StringResource typeText(UiCryptoOrder uiCryptoOrder, AppType appType) {
        int i;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Intrinsics.checkNotNullParameter(appType, "appType");
        StringResource.Companion companion = StringResource.INSTANCE;
        if (uiCryptoOrder.getCurrencyPair().isTokenizedStock()) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
            if (i2 == 1) {
                if (WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()] == 2) {
                    i = C12914R.string.crypto_order_detail_type_limit_buy;
                } else {
                    i = C12914R.string.tokenized_crypto_order_buy;
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()] == 2) {
                    i = C12914R.string.crypto_order_detail_type_limit_sell;
                } else {
                    i = C12914R.string.tokenized_crypto_order_sell;
                }
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
            if (i3 == 1) {
                int i4 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                if (i4 == 1) {
                    int i5 = WhenMappings.$EnumSwitchMapping$3[appType.ordinal()];
                    if (i5 == 1) {
                        if (WhenMappings.$EnumSwitchMapping$2[uiCryptoOrder.getCryptoOrder().getInitiatorType().ordinal()] == 1) {
                            i = C12914R.string.crypto_order_detail_type_recurring_buy;
                        } else {
                            i = C12914R.string.crypto_order_detail_type_market_buy;
                        }
                    } else {
                        if (i5 != 2 && i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = C12914R.string.crypto_order_detail_type_market_buy;
                    }
                } else if (i4 == 2) {
                    i = C12914R.string.crypto_order_detail_type_limit_buy;
                } else if (i4 == 3) {
                    i = C12914R.string.crypto_order_detail_type_stop_loss_buy;
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C12914R.string.crypto_order_detail_type_stop_limit_buy;
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                if (i6 == 1) {
                    i = C12914R.string.crypto_order_detail_type_market_sell;
                } else if (i6 == 2) {
                    i = C12914R.string.crypto_order_detail_type_limit_sell;
                } else if (i6 == 3) {
                    i = C12914R.string.crypto_order_detail_type_stop_loss_sell;
                } else {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C12914R.string.crypto_order_detail_type_stop_limit_sell;
                }
            }
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final String toDisplayValue(InitiatorType initiatorType, Resources resources) {
        Intrinsics.checkNotNullParameter(initiatorType, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (WhenMappings.$EnumSwitchMapping$2[initiatorType.ordinal()] == 2) {
            return resources.getString(C12914R.string.crypto_order_detail_linked_app_trading_view);
        }
        return null;
    }

    public static final CharSequence getStateText(UiCryptoOrder uiCryptoOrder, Resources resources) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OrderStates.getOrderStateString(uiCryptoOrder.getCryptoOrder().getState(), resources);
    }

    public static final CharSequence getPriceText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getCryptoOrder().getPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public static final CharSequence getStopPriceText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Currency quoteCurrencyForPrice = uiCryptoOrder.getQuoteCurrencyForPrice();
        BigDecimal stopPrice = uiCryptoOrder.getCryptoOrder().getStopPrice();
        if (stopPrice != null) {
            return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPrice, stopPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null);
        }
        throw new IllegalArgumentException("Stop price cannot be null");
    }

    public static final CharSequence getFilledQuantityText(UiCryptoOrder uiCryptoOrder, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C12914R.string.crypto_order_detail_filled_quantity, CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrency(), uiCryptoOrder.getFilledQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null) + " " + ((Object) getSymbolWithType(uiCryptoOrder).getText(resources)), CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getAveragePrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final CharSequence getCanceledQuantityText(UiCryptoOrder uiCryptoOrder, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Currency assetCurrency = uiCryptoOrder.getAssetCurrency();
        BigDecimal canceledQuantity = uiCryptoOrder.getCanceledQuantity();
        if (canceledQuantity != null) {
            return CurrencyDefinitions.formatCurrency$default(assetCurrency, canceledQuantity, false, false, null, 0, null, null, false, false, false, false, 2044, null) + " " + ((Object) getSymbolWithType(uiCryptoOrder).getText(resources));
        }
        throw new IllegalArgumentException("Canceled quantity cannot be null");
    }

    public static final StringResource getGetFilledQuantityTextWithoutSymbol(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return StringResource.INSTANCE.invoke(C12914R.string.crypto_order_detail_filled_quantity, CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrency(), uiCryptoOrder.getFilledQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null), CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getAveragePrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public static final String getTotalNotionalText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrency(), uiCryptoOrder.getRoundedExecutedNotional(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public static final String getEstimatedTotalNotionalWithFeeText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrency(), uiCryptoOrder.getCryptoOrder().getRoundedEstimatedNotionalWithEstimatedFee(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public static final String getTotalNotionalWithFeeText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrency(), uiCryptoOrder.getCryptoOrder().getRoundedExecutedNotionalWithFee(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public static final String getTotalText(UiCryptoOrder uiCryptoOrder) {
        BigDecimal roundedExecutedNotionalWithFee;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Currency quoteCurrencyForPrice = uiCryptoOrder.getQuoteCurrencyForPrice();
        if (uiCryptoOrder.getExecutions().isEmpty()) {
            if (!uiCryptoOrder.getCurrencyPair().isTokenizedStock() || (roundedExecutedNotionalWithFee = uiCryptoOrder.getCryptoOrder().getRoundedUncollaredEstimatedNotionalWithEstimatedFee()) == null) {
                roundedExecutedNotionalWithFee = uiCryptoOrder.getCryptoOrder().getRoundedEstimatedNotionalWithEstimatedFee();
            }
        } else {
            roundedExecutedNotionalWithFee = uiCryptoOrder.getCryptoOrder().getRoundedExecutedNotionalWithFee();
        }
        return CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPrice, roundedExecutedNotionalWithFee, false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public static final String getSignedTotalNotionalWithFeeText(UiCryptoOrder uiCryptoOrder) {
        BigDecimal bigDecimalNegate;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Currency quoteCurrency = uiCryptoOrder.getQuoteCurrency();
        int i = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
        if (i == 1) {
            bigDecimalNegate = uiCryptoOrder.getCryptoOrder().getRoundedExecutedNotionalWithFee().negate();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalNegate = uiCryptoOrder.getCryptoOrder().getRoundedExecutedNotionalWithFee();
        }
        Intrinsics.checkNotNull(bigDecimalNegate);
        return getSignedFormattedQuoteAmount(quoteCurrency, bigDecimalNegate);
    }

    public static final String getSignedRoundedEstimatedNotionalWithEstimatedFee(UiCryptoOrder uiCryptoOrder) {
        BigDecimal bigDecimalNegate;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Currency quoteCurrency = uiCryptoOrder.getQuoteCurrency();
        int i = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
        if (i == 1) {
            bigDecimalNegate = uiCryptoOrder.getCryptoOrder().getRoundedEstimatedNotionalWithEstimatedFee().negate();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalNegate = uiCryptoOrder.getCryptoOrder().getRoundedEstimatedNotionalWithEstimatedFee();
        }
        Intrinsics.checkNotNull(bigDecimalNegate);
        return getSignedFormattedQuoteAmount(quoteCurrency, bigDecimalNegate);
    }

    private static final String getSignedFormattedQuoteAmount(Currency currency, BigDecimal bigDecimal) {
        return CurrencyFormatCache.getCurrencyFormat(CurrencyFormatModel.Companion.fromCurrencyAmount$default(CurrencyFormatModel.INSTANCE, currency, bigDecimal, false, false, 2, 2, false, false, null, null, false, Boolean.TRUE, true, true, false, false, 51148, null)).format(bigDecimal);
    }

    public static final CryptoFee getCryptoFee(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return (CryptoFee) CollectionsKt.firstOrNull((List) uiCryptoOrder.getCryptoOrder().getFees());
    }

    public static final String feeAmountText(UiCryptoOrder uiCryptoOrder, BigDecimal feeAmount) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Intrinsics.checkNotNullParameter(feeAmount, "feeAmount");
        return CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrency(), feeAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public static final String getFxFeeAmount(UiCryptoOrder uiCryptoOrder) {
        String currency$default;
        BigDecimal feeAmount;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        CryptoFee.FixedRateFee.FixedRateFeeData fxFee = uiCryptoOrder.getCryptoOrder().getFxFee();
        if (fxFee != null) {
            Currency quoteCurrencyForPrice = uiCryptoOrder.getQuoteCurrencyForPrice();
            if (!uiCryptoOrder.getExecutions().isEmpty() || (feeAmount = fxFee.getUncollaredEstFeeAmount()) == null) {
                feeAmount = fxFee.getFeeAmount();
            }
            currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPrice, feeAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null);
        } else {
            currency$default = null;
        }
        return currency$default == null ? "" : currency$default;
    }

    public static /* synthetic */ String getEnteredAmountAsAssetText$default(UiCryptoOrder uiCryptoOrder, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return getEnteredAmountAsAssetText(uiCryptoOrder, z);
    }

    public static final String getEnteredAmountAsAssetText(UiCryptoOrder uiCryptoOrder, boolean z) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrencyForCost(), uiCryptoOrder.getCryptoOrder().getQuantity(), z, false, null, 0, null, null, false, false, false, false, 2044, null);
    }

    public static final String getEnteredAmountAsQuoteText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        return CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrency(), uiCryptoOrder.getCryptoOrder().getEnteredQuoteAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
    }

    public static final StringResource getOrderEndPrimaryText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED || uiCryptoOrder.getCryptoOrder().getState() == OrderState.FILLED || ((uiCryptoOrder.getCryptoOrder().getState() == OrderState.CANCELED && !Intrinsics.areEqual(uiCryptoOrder.getFilledQuantity(), BigDecimal.ZERO)) || uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED_REST_CANCELLED)) {
            if (uiCryptoOrder.getExecutions().isEmpty()) {
                return StringResource.INSTANCE.invoke(getSignedRoundedEstimatedNotionalWithEstimatedFee(uiCryptoOrder));
            }
            return StringResource.INSTANCE.invoke(getSignedTotalNotionalWithFeeText(uiCryptoOrder));
        }
        if (uiCryptoOrder.getIsPending()) {
            int i = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return getPendingLimitPriceText(uiCryptoOrder);
                }
                if (i == 3 || i == 4) {
                    return getPendingStopPriceText(uiCryptoOrder);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public static final StringResource getOrderEndSecondaryText(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED || uiCryptoOrder.getCryptoOrder().getState() == OrderState.FILLED || ((uiCryptoOrder.getCryptoOrder().getState() == OrderState.CANCELED && !Intrinsics.areEqual(uiCryptoOrder.getFilledQuantity(), BigDecimal.ZERO)) || uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED_REST_CANCELLED)) {
            return getGetFilledQuantityTextWithoutSymbol(uiCryptoOrder);
        }
        if (uiCryptoOrder.getCryptoOrder().getState().isPending()) {
            int i = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (uiCryptoOrder.getCryptoOrder().getStopPrice() != null) {
                    return getPendingLimitPriceText(uiCryptoOrder);
                }
                return null;
            }
        }
        return null;
    }

    public static final StringResource getSecondaryTextForHistoryRow(UiCryptoOrder uiCryptoOrder) {
        int i;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.QUEUED) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
            if (i2 == 1) {
                i = C12914R.string.crypto_order_history_row_secondary_text_buy_quantity;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C12914R.string.crypto_order_history_row_secondary_text_sell_quantity;
            }
            return companion.invoke(i, CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getAssetCurrency(), uiCryptoOrder.getQuantity(), false, false, null, 0, null, null, false, false, false, false, 2044, null));
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        Instant initiatedAt = uiCryptoOrder.getInitiatedAt();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return companion2.invoke(LocalDateFormatter.MEDIUM.format((LocalDateFormatter) Instants.toLocalDate(initiatedAt, zoneIdSystemDefault)));
    }

    public static final CharSequence amountTextForHistoryRow(UiCryptoOrder uiCryptoOrder, Resources resources) {
        CharSequence text;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        StringResource orderEndPrimaryText = getOrderEndPrimaryText(uiCryptoOrder);
        return (orderEndPrimaryText == null || (text = orderEndPrimaryText.getText(resources)) == null) ? "" : text;
    }

    private static final StringResource getPendingLimitPriceText(UiCryptoOrder uiCryptoOrder) {
        Money money;
        if (uiCryptoOrder.getCurrencyPair().isTokenizedStock()) {
            BigDecimal equityInstrumentQuotePrice = uiCryptoOrder.getCryptoOrder().getEquityInstrumentQuotePrice();
            return StringResource.INSTANCE.invoke(C12914R.string.history_row_meta_crypto_pending_limit_price, (equityInstrumentQuotePrice == null || (money = Money3.toMoney(equityInstrumentQuotePrice, Currencies.USD)) == null) ? null : Money.format$default(money, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), false, null, true, 0, null, true, null, false, false, 950, null));
        }
        return StringResource.INSTANCE.invoke(C12914R.string.history_row_meta_crypto_pending_limit_price, CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), uiCryptoOrder.getCryptoOrder().getPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    private static final StringResource getPendingStopPriceText(UiCryptoOrder uiCryptoOrder) {
        BigDecimal stopPrice = uiCryptoOrder.getCryptoOrder().getStopPrice();
        if (stopPrice != null) {
            return StringResource.INSTANCE.invoke(C12914R.string.history_row_meta_crypto_pending_stop_price, CurrencyDefinitions.formatCurrency$default(uiCryptoOrder.getQuoteCurrencyForPrice(), stopPrice, false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        return null;
    }

    public static final StringResource getSymbolWithType(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[uiCryptoOrder.getCurrencyPair().getType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C12914R.plurals.tokenized_label_with_symbol, BigDecimals7.m2977eq(uiCryptoOrder.getQuantity(), BigDecimal.ONE) ? 1 : 9), uiCryptoOrder.getSymbol());
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return StringResource.INSTANCE.invoke(uiCryptoOrder.getSymbol());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StringResource getSymbolWithTypeSingular(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[uiCryptoOrder.getCurrencyPair().getType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C12914R.plurals.tokenized_label_with_symbol, 1), uiCryptoOrder.getSymbol());
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return StringResource.INSTANCE.invoke(uiCryptoOrder.getSymbol());
        }
        throw new NoWhenBranchMatchedException();
    }
}
