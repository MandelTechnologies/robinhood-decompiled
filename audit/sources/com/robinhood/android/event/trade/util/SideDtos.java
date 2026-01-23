package com.robinhood.android.event.trade.util;

import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.SideDto;

/* compiled from: SideDtos.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toFuturesOrderSide", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "Lrosetta/mainst/SideDto;", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.util.SideDtosKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SideDtos {

    /* compiled from: SideDtos.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.event.trade.util.SideDtosKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SideDto.values().length];
            try {
                iArr[SideDto.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SideDto.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SideDto.SELL_SHORT_EXEMPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SideDto.SELL_SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SideDto.SIDE_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FuturesOrderSide toFuturesOrderSide(SideDto sideDto) {
        Intrinsics.checkNotNullParameter(sideDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sideDto.ordinal()];
        if (i == 1) {
            return FuturesOrderSide.BUY;
        }
        if (i == 2) {
            return FuturesOrderSide.SELL;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Invalid side " + sideDto).toString());
    }
}
