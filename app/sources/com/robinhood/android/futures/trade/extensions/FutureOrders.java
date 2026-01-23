package com.robinhood.android.futures.trade.extensions;

import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.FutureOrders2;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderDataState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderState;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.p189db.FeeAmount;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FutureOrders.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a \u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001e\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002\u001a(\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\nH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a \u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0000\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a*\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000\u001a\u001e\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0000¨\u0006("}, m3636d2 = {"getOrderReceiptTitle", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getOrderReceiptDesc", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getOrderReceiptMarketDesc", "orderConfig", "Lcom/robinhood/android/models/futures/db/FuturesOrderConfiguration;", "getOrderReceiptLimitOrStopDesc", "getOrderTypeStr", "getOrderSideStr", "getOrderPriceStr", "", "futuresProduct", "getOrderReceiptQuantityStr", "getOrderReceiptFilledQuantityStr", "getOrderReceiptAvgFilledPriceStr", "getOrderReceiptBuyingPowerEffectStr", "bpe", "Lcom/robinhood/rosetta/common/MoneyDto;", "getOrderReceiptGoldSavingsStr", "getOrderReceiptCommissionAndFeesStr", "fees", "getOrderPillLabel", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "quantity", "Ljava/math/BigDecimal;", "type", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "trigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getOrderPillGroupLabel", "Lcom/robinhood/android/futures/trade/extensions/OrderGroupLabel;", "orders", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.extensions.FutureOrdersKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class FutureOrders {

    /* compiled from: FutureOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.extensions.FutureOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FuturesOrderState.values().length];
            try {
                iArr[FuturesOrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesOrderState.UNCONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FuturesOrderState.TRIGGERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FuturesOrderState.CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FuturesOrderState.PARTIALLY_FILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FuturesOrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FuturesOrderState.FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FuturesOrderState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FuturesOrderState.FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FuturesOrderState.VOIDED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FuturesOrderState.PENDING_CANCELLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FuturesOrderState.CANCELED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesOrderConfiguration.values().length];
            try {
                iArr2[FuturesOrderConfiguration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[FuturesOrderConfiguration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[FuturesOrderConfiguration.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[FuturesOrderConfiguration.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FuturesOrderSide.values().length];
            try {
                iArr3[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final StringResource getOrderReceiptTitle(UiFuturesOrder uiFuturesOrder, FuturesContract futuresContract) {
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_queued_title, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_unconfirmed_title, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 4:
            case 5:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_confirmed_title, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 6:
            case 7:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_partially_filled_title, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 8:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_filled_title, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 9:
            case 10:
            case 11:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_rejected_title, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_canceled_title, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getOrderReceiptDesc(UiFuturesOrder uiFuturesOrder, FuturesContract futuresContract, FuturesProduct futuresProduct) {
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        FuturesOrderConfiguration futuresOrderConfigurationInvoke = FuturesOrderConfiguration.INSTANCE.invoke(uiFuturesOrder.getOrder().getOrderType(), uiFuturesOrder.getOrder().getOrderTrigger());
        if (futuresOrderConfigurationInvoke == FuturesOrderConfiguration.MARKET) {
            return getOrderReceiptMarketDesc(uiFuturesOrder, futuresOrderConfigurationInvoke, futuresContract);
        }
        return getOrderReceiptLimitOrStopDesc(uiFuturesOrder, futuresOrderConfigurationInvoke, futuresContract, futuresProduct);
    }

    private static final StringResource getOrderReceiptMarketDesc(UiFuturesOrder uiFuturesOrder, FuturesOrderConfiguration futuresOrderConfiguration, FuturesContract futuresContract) {
        String displaySymbol;
        switch (WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_queued_market_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_unconfirmed_market_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 4:
            case 5:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_confirmed_market_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 6:
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C17462R.string.futures_order_confirmation_state_partially_filled_desc;
                StringResource orderTypeStr = getOrderTypeStr(futuresOrderConfiguration);
                StringResource orderSideStr = getOrderSideStr(uiFuturesOrder);
                BigDecimal quantity = uiFuturesOrder.getOrder().getQuantity();
                displaySymbol = futuresContract != null ? futuresContract.getDisplaySymbol() : null;
                BigDecimal bigDecimalSubtract = uiFuturesOrder.getOrder().getQuantity().subtract(uiFuturesOrder.getOrder().getFilledQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                return companion.invoke(i, orderTypeStr, orderSideStr, quantity, displaySymbol, bigDecimalSubtract);
            case 7:
                StringResource.Companion companion2 = StringResource.INSTANCE;
                int i2 = C17462R.string.f4161x798b53c0;
                StringResource orderTypeStr2 = getOrderTypeStr(futuresOrderConfiguration);
                StringResource orderSideStr2 = getOrderSideStr(uiFuturesOrder);
                BigDecimal quantity2 = uiFuturesOrder.getOrder().getQuantity();
                displaySymbol = futuresContract != null ? futuresContract.getDisplaySymbol() : null;
                BigDecimal bigDecimalSubtract2 = uiFuturesOrder.getOrder().getQuantity().subtract(uiFuturesOrder.getOrder().getFilledQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                return companion2.invoke(i2, orderTypeStr2, orderSideStr2, quantity2, displaySymbol, bigDecimalSubtract2);
            case 8:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_filled_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 9:
            case 10:
            case 11:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_rejected_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_canceled_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final StringResource getOrderReceiptLimitOrStopDesc(UiFuturesOrder uiFuturesOrder, FuturesOrderConfiguration futuresOrderConfiguration, FuturesContract futuresContract, FuturesProduct futuresProduct) {
        switch (WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_queued_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null, getOrderPriceStr(uiFuturesOrder, futuresOrderConfiguration, futuresProduct));
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_unconfirmed_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null, getOrderPriceStr(uiFuturesOrder, futuresOrderConfiguration, futuresProduct));
            case 4:
            case 5:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_confirmed_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null, getOrderPriceStr(uiFuturesOrder, futuresOrderConfiguration, futuresProduct));
            case 6:
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C17462R.string.futures_order_confirmation_state_partially_filled_desc;
                StringResource orderTypeStr = getOrderTypeStr(futuresOrderConfiguration);
                StringResource orderSideStr = getOrderSideStr(uiFuturesOrder);
                BigDecimal quantity = uiFuturesOrder.getOrder().getQuantity();
                String displaySymbol = futuresContract != null ? futuresContract.getDisplaySymbol() : null;
                BigDecimal bigDecimalSubtract = uiFuturesOrder.getOrder().getQuantity().subtract(uiFuturesOrder.getOrder().getFilledQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                return companion.invoke(i, orderTypeStr, orderSideStr, quantity, displaySymbol, bigDecimalSubtract);
            case 7:
                return StringResource.INSTANCE.invoke(C17462R.string.f4161x798b53c0, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 8:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_filled_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 9:
            case 10:
            case 11:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_rejected_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_confirmation_state_canceled_desc, getOrderTypeStr(futuresOrderConfiguration), getOrderSideStr(uiFuturesOrder), uiFuturesOrder.getOrder().getQuantity(), futuresContract != null ? futuresContract.getDisplaySymbol() : null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final StringResource getOrderTypeStr(FuturesOrderConfiguration futuresOrderConfiguration) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[futuresOrderConfiguration.ordinal()];
        if (i2 == 1) {
            i = C17462R.string.futures_order_market_label;
        } else if (i2 == 2) {
            i = C17462R.string.futures_order_limit_label;
        } else if (i2 == 3) {
            i = C17462R.string.futures_order_stop_loss_label;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = C17462R.string.futures_order_stop_limit_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    private static final StringResource getOrderSideStr(UiFuturesOrder uiFuturesOrder) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$2[uiFuturesOrder.getLegs().get(0).getOrderSide().ordinal()];
        if (i2 == 1) {
            i = C17462R.string.futures_order_confirmation_buy_label;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C17462R.string.futures_order_confirmation_sell_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    private static final String getOrderPriceStr(UiFuturesOrder uiFuturesOrder, FuturesOrderConfiguration futuresOrderConfiguration, FuturesProduct futuresProduct) {
        int i = WhenMappings.$EnumSwitchMapping$1[futuresOrderConfiguration.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return FuturesProduct5.formatNullable$default(futuresProduct, uiFuturesOrder.getOrder().getLimitPrice(), null, 2, null);
            }
            if (i == 3) {
                return FuturesProduct5.formatNullable$default(futuresProduct, uiFuturesOrder.getOrder().getStopPrice(), null, 2, null);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        throw new IllegalStateException(("Unrecognized order config to get order price: " + futuresOrderConfiguration).toString());
    }

    public static final StringResource getOrderReceiptQuantityStr(UiFuturesOrder uiFuturesOrder) {
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                StringResource.Companion companion = StringResource.INSTANCE;
                String string2 = uiFuturesOrder.getOrder().getQuantity().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return companion.invoke(string2);
            case 6:
            case 7:
            case 8:
                return null;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C17462R.string.futures_order_partial_quantity_format, "0", uiFuturesOrder.getOrder().getQuantity());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getOrderReceiptFilledQuantityStr(UiFuturesOrder uiFuturesOrder) {
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        return StringResource.INSTANCE.invoke(C17462R.string.futures_order_partial_quantity_format, uiFuturesOrder.getOrder().getFilledQuantity(), uiFuturesOrder.getOrder().getQuantity());
    }

    public static final StringResource getOrderReceiptAvgFilledPriceStr(UiFuturesOrder uiFuturesOrder, FuturesProduct futuresProduct) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return null;
            case 6:
            case 7:
            case 8:
                String nullable$default = FuturesProduct5.formatNullable$default(futuresProduct, uiFuturesOrder.getOrder().getAverageFilledPrice(), null, 2, null);
                return (nullable$default == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(nullable$default)) == null) ? StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]) : stringResourceInvoke;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getOrderReceiptBuyingPowerEffectStr(UiFuturesOrder uiFuturesOrder, MoneyDto moneyDto) {
        String deltaCurrency;
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (moneyDto == null || (deltaCurrency = Moneys.formatDeltaCurrency(moneyDto)) == null) {
                    return null;
                }
                return StringResource.INSTANCE.invoke(deltaCurrency);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getOrderReceiptGoldSavingsStr(UiFuturesOrder uiFuturesOrder) {
        FeeAmount totalGoldSavings;
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        if (Intrinsics.areEqual(uiFuturesOrder.getOrder().getOrderState().toCommonState().isSuccessful(), Boolean.FALSE) || (totalGoldSavings = uiFuturesOrder.getOrder().getTotalGoldSavings()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C17462R.string.futures_order_gold_savings_label, Formats.getCurrencyFormat().format(totalGoldSavings.getAmount()));
    }

    public static final StringResource getOrderReceiptCommissionAndFeesStr(UiFuturesOrder uiFuturesOrder, MoneyDto moneyDto) {
        String currency;
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[uiFuturesOrder.getOrder().getOrderState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (moneyDto == null || (currency = Moneys.formatCurrency(moneyDto)) == null) {
                    return null;
                }
                return StringResource.INSTANCE.invoke(currency);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getOrderPillLabel(UiFuturesOrder uiFuturesOrder) {
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        return getOrderPillLabel(uiFuturesOrder.getLegs().get(0).getOrderSide(), uiFuturesOrder.getOrder().getQuantity(), uiFuturesOrder.getOrder().getOrderType(), uiFuturesOrder.getOrder().getOrderTrigger());
    }

    public static final StringResource getOrderPillLabel(FuturesOrderSide side, BigDecimal quantity, FuturesOrderType type2, FuturesOrderTrigger trigger) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        int i = WhenMappings.$EnumSwitchMapping$2[side.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            quantity = quantity.negate();
            Intrinsics.checkNotNullExpressionValue(quantity, "negate(...)");
        }
        if (trigger == FuturesOrderTrigger.STOP) {
            return StringResource.INSTANCE.invoke(C17286R.string.futures_ladder_stop_pending_order, Formats.getIntegerDeltaFormat().format(quantity));
        }
        if (type2 == FuturesOrderType.LIMIT && trigger == FuturesOrderTrigger.IMMEDIATE) {
            return StringResource.INSTANCE.invoke(C17286R.string.futures_ladder_limit_pending_order, Formats.getIntegerDeltaFormat().format(quantity));
        }
        return null;
    }

    public static final FutureOrders2 getOrderPillGroupLabel(FuturesOrderSide side, List<? extends FuturesLadderDataState.PendingOrder> orders) {
        boolean z;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orders, "orders");
        List<? extends FuturesLadderDataState.PendingOrder> list = orders;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((FuturesLadderDataState.PendingOrder) it.next()).getQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        int i = WhenMappings.$EnumSwitchMapping$2[side.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalValueOf = bigDecimalValueOf.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "negate(...)");
        }
        String str = Formats.getIntegerDeltaFormat().format(bigDecimalValueOf);
        boolean z3 = list instanceof Collection;
        if (z3 && list.isEmpty()) {
            z = false;
        } else {
            for (FuturesLadderDataState.PendingOrder pendingOrder : list) {
                if (pendingOrder.getOrderType() == FuturesOrderType.LIMIT && pendingOrder.getOrderTrigger() == FuturesOrderTrigger.IMMEDIATE) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z3 && list.isEmpty()) {
            z2 = false;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((FuturesLadderDataState.PendingOrder) it2.next()).getOrderTrigger() == FuturesOrderTrigger.STOP) {
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return new FutureOrders2.LimitOrStop(str);
        }
        if (z) {
            return new FutureOrders2.Limit(str);
        }
        if (z2) {
            return new FutureOrders2.Stop(str);
        }
        return new FutureOrders2.Na(str);
    }
}
