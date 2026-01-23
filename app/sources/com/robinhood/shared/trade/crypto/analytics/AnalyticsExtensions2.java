package com.robinhood.shared.trade.crypto.analytics;

import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.models.history.shared.OrderState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.order.Side;

/* compiled from: AnalyticsExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"cryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getCryptoOrderContext", "(Lcom/robinhood/models/crypto/ui/UiCryptoOrder;)Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "analyticsScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getAnalyticsScreenName", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.analytics.AnalyticsExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AnalyticsExtensions2 {

    /* compiled from: AnalyticsExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.analytics.AnalyticsExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[OrderState.values().length];
            try {
                iArr2[OrderState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderState.UNCONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderState.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderState.PARTIALLY_FILLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderState.FILLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OrderState.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OrderState.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OrderState.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OrderState.VOIDED.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OrderState.QUEUED.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DefaultOrderState.values().length];
            try {
                iArr3[DefaultOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[DefaultOrderState.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final CryptoOrderContext getCryptoOrderContext(UiCryptoOrder uiCryptoOrder) {
        CryptoOrderContext.CryptoOrderType cryptoOrderType;
        CryptoOrderContext.CryptoOrderState cryptoOrderState;
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
        if (i == 1) {
            cryptoOrderType = CryptoOrderContext.CryptoOrderType.MARKET;
        } else if (i == 2) {
            cryptoOrderType = CryptoOrderContext.CryptoOrderType.LIMIT;
        } else if (i == 3) {
            cryptoOrderType = CryptoOrderContext.CryptoOrderType.STOP_LOSS;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            cryptoOrderType = CryptoOrderContext.CryptoOrderType.STOP_LIMIT;
        }
        CryptoOrderContext.CryptoOrderType cryptoOrderType2 = cryptoOrderType;
        Side protobuf = Orders2.toProtobuf(uiCryptoOrder.getCryptoOrder().getSide());
        String string2 = uiCryptoOrder.getCryptoOrder().getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = uiCryptoOrder.getCryptoOrder().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String code = uiCryptoOrder.getAssetCurrency().getCode();
        String code2 = uiCryptoOrder.getQuoteCurrency().getCode();
        double dDoubleValue = uiCryptoOrder.getCryptoOrder().getPrice().doubleValue();
        double dDoubleValue2 = uiCryptoOrder.getCryptoOrder().getQuantity().doubleValue();
        switch (WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getState().ordinal()]) {
            case 1:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.NEW;
                break;
            case 2:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.UNCONFIRMED;
                break;
            case 3:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.CONFIRMED;
                break;
            case 4:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.PARTIALLY_FILLED;
                break;
            case 5:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.FILLED;
                break;
            case 6:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.REJECTED;
                break;
            case 7:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.CANCELED;
                break;
            case 8:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.FAILED;
                break;
            case 9:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.VOIDED;
                break;
            case 10:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.QUEUED;
                break;
            default:
                cryptoOrderState = CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED;
                break;
        }
        return new CryptoOrderContext(cryptoOrderType2, protobuf, string2, string3, 0.0d, null, code, code2, dDoubleValue, 0.0d, 0.0d, dDoubleValue2, 0.0d, 0.0d, 0.0d, cryptoOrderState, null, null, 0.0d, null, 1013296, null);
    }

    public static final Screen.Name getAnalyticsScreenName(DefaultOrderState defaultOrderState) {
        Intrinsics.checkNotNullParameter(defaultOrderState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[defaultOrderState.ordinal()];
        if (i == 1) {
            return Screen.Name.CRYPTO_ORDER_ENTRY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Screen.Name.CRYPTO_ORDER_REVIEW;
    }
}
