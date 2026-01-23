package com.robinhood.android.trade.equity.util;

import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSides.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0006"}, m3636d2 = {"getEstimatedCostCreditLabel", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/OrderSide;", "Lcom/robinhood/models/db/EquityOrderSide;", "getTotalCostCreditLabel", "getPendingCostCreditLabel", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.OrderSidesKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderSides {

    /* compiled from: OrderSides.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.util.OrderSidesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderSide.values().length];
            try {
                iArr2[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderSide.SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final StringResource getEstimatedCostCreditLabel(OrderSide orderSide) {
        int i;
        Intrinsics.checkNotNullParameter(orderSide, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i2 == 1) {
            i = C29365R.string.order_confirmation_estimated_cost_label;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C29365R.string.order_confirmation_estimated_credit_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final StringResource getEstimatedCostCreditLabel(EquityOrderSide equityOrderSide) {
        int i;
        Intrinsics.checkNotNullParameter(equityOrderSide, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[equityOrderSide.ordinal()];
        if (i2 == 1) {
            i = C29365R.string.order_confirmation_estimated_cost_label;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C29365R.string.order_confirmation_estimated_credit_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final StringResource getTotalCostCreditLabel(EquityOrderSide equityOrderSide) {
        int i;
        Intrinsics.checkNotNullParameter(equityOrderSide, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[equityOrderSide.ordinal()];
        if (i2 == 1) {
            i = C20649R.string.order_confirmation_total_cost_label;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C20649R.string.order_confirmation_total_credit_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final StringResource getPendingCostCreditLabel(EquityOrderSide equityOrderSide) {
        int i;
        Intrinsics.checkNotNullParameter(equityOrderSide, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[equityOrderSide.ordinal()];
        if (i2 == 1) {
            i = C29365R.string.order_confirmation_pending_cost_label;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C29365R.string.order_confirmation_pending_credit_label;
        }
        return companion.invoke(i, new Object[0]);
    }
}
