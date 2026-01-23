package com.robinhood.shared.crypto.utils;

import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.nummus.order.SideDto;

/* compiled from: OrderSides.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"sideDto", "Lrosetta/nummus/order/SideDto;", "Lcom/robinhood/models/db/OrderSide;", "getSideDto", "(Lcom/robinhood/models/db/OrderSide;)Lrosetta/nummus/order/SideDto;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.OrderSidesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderSides3 {

    /* compiled from: OrderSides.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.OrderSidesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public static final SideDto getSideDto(OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i == 1) {
            return SideDto.SIDE_BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return SideDto.SIDE_SELL;
    }
}
