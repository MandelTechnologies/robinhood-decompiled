package com.robinhood.android.futures.history.extensions;

import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.p189db.FuturesOrderConfiguration;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.common.strings.C32428R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiFutureOrders.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"getLabel", "", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "feature-futures-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.extensions.UiFutureOrdersKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class UiFutureOrders {

    /* compiled from: UiFutureOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.history.extensions.UiFutureOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FuturesOrderSide.values().length];
            try {
                iArr[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesOrderConfiguration.values().length];
            try {
                iArr2[FuturesOrderConfiguration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FuturesOrderConfiguration.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FuturesOrderConfiguration.STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FuturesOrderConfiguration.STOP_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getLabel(UiFuturesOrder uiFuturesOrder) {
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "<this>");
        FuturesOrderSide orderSide = uiFuturesOrder.getLegs().get(0).getOrderSide();
        int i = WhenMappings.$EnumSwitchMapping$1[uiFuturesOrder.getOrder().getOrderConfiguration().ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i2 == 1) {
                return C32428R.string.order_description_market_buy;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C32428R.string.order_description_market_sell;
        }
        if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i3 == 1) {
                return C32428R.string.order_description_limit_buy;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C32428R.string.order_description_limit_sell;
        }
        if (i == 3) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i4 == 1) {
                return C32428R.string.order_description_stop_limit_buy;
            }
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C32428R.string.order_description_stop_limit_sell;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i5 == 1) {
            return C32428R.string.order_description_stop_loss_buy;
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C32428R.string.order_description_stop_loss_sell;
    }
}
