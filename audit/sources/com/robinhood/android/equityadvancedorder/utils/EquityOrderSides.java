package com.robinhood.android.equityadvancedorder.utils;

import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p320db.OrderPositionEffect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderSides.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getIacAlertSheetLocation", "Lcom/robinhood/models/db/IacAlertSheetLocation;", "Lcom/robinhood/models/db/EquityOrderSide;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.utils.EquityOrderSidesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityOrderSides {

    /* compiled from: EquityOrderSides.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equityadvancedorder.utils.EquityOrderSidesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final IacAlertSheetLocation getIacAlertSheetLocation(EquityOrderSide equityOrderSide, OrderPositionEffect positionEffect) {
        Intrinsics.checkNotNullParameter(equityOrderSide, "<this>");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        int i = WhenMappings.$EnumSwitchMapping$0[equityOrderSide.ordinal()];
        if (i == 1) {
            if (positionEffect == OrderPositionEffect.OPEN) {
                return IacAlertSheetLocation.INVESTING_STOCK_BUY;
            }
            return IacAlertSheetLocation.INVESTING_STOCK_BUY_TO_CLOSE;
        }
        if (i == 2) {
            return IacAlertSheetLocation.INVESTING_STOCK_SELL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return IacAlertSheetLocation.INVESTING_STOCK_SELL_SHORT;
    }
}
