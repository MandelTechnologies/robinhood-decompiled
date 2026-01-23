package com.robinhood.android.futures.trade.extensions;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderTimeInForce;
import com.robinhood.lib.bigdecimalinterop.BigDecimals6;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiFuturesOrderRequests.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toOrderCheckRequest", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.extensions.UiFuturesOrderRequestsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UiFuturesOrderRequests {

    /* compiled from: UiFuturesOrderRequests.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.trade.extensions.UiFuturesOrderRequestsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[FuturesOrderType.values().length];
            try {
                iArr[FuturesOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesOrderTrigger.values().length];
            try {
                iArr2[FuturesOrderTrigger.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FuturesOrderTrigger.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FuturesTimeInForce.values().length];
            try {
                iArr3[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[FuturesContractType.values().length];
            try {
                iArr4[FuturesContractType.OUTRIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[FuturesContractType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[FuturesContractType.EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[FuturesOrderSide.values().length];
            try {
                iArr5[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final FuturesOrderCheckRequest toOrderCheckRequest(UiFuturesOrderContext uiFuturesOrderContext) {
        com.robinhood.futures.ordercheck.contracts.models.FuturesOrderType futuresOrderType;
        com.robinhood.futures.ordercheck.contracts.models.FuturesOrderTrigger futuresOrderTrigger;
        FuturesOrderTimeInForce futuresOrderTimeInForce;
        com.robinhood.futures.ordercheck.contracts.models.FuturesContractType futuresContractType;
        com.robinhood.futures.ordercheck.contracts.models.FuturesOrderSide futuresOrderSide;
        Intrinsics.checkNotNullParameter(uiFuturesOrderContext, "<this>");
        String strSafeToString = Uuids.safeToString(uiFuturesOrderContext.getRequestContext().getAccount().getId());
        String strSafeToString2 = Uuids.safeToString(uiFuturesOrderContext.getOrderRequest().getRefId());
        int i = WhenMappings.$EnumSwitchMapping$0[uiFuturesOrderContext.getOrderRequest().getOrderType().ordinal()];
        if (i == 1) {
            futuresOrderType = com.robinhood.futures.ordercheck.contracts.models.FuturesOrderType.MARKET;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            futuresOrderType = com.robinhood.futures.ordercheck.contracts.models.FuturesOrderType.LIMIT;
        }
        BigDecimal bignumBigDecimal = BigDecimals6.toBignumBigDecimal(uiFuturesOrderContext.getOrderRequest().getQuantity());
        int i2 = WhenMappings.$EnumSwitchMapping$1[uiFuturesOrderContext.getOrderRequest().getOrderTrigger().ordinal()];
        if (i2 == 1) {
            futuresOrderTrigger = com.robinhood.futures.ordercheck.contracts.models.FuturesOrderTrigger.IMMEDIATE;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            futuresOrderTrigger = com.robinhood.futures.ordercheck.contracts.models.FuturesOrderTrigger.STOP;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$2[uiFuturesOrderContext.getOrderRequest().getTimeInForce().ordinal()];
        int i4 = 3;
        if (i3 == 1) {
            futuresOrderTimeInForce = FuturesOrderTimeInForce.GFD;
        } else if (i3 == 2) {
            futuresOrderTimeInForce = FuturesOrderTimeInForce.GTC;
        } else if (i3 == 3) {
            futuresOrderTimeInForce = FuturesOrderTimeInForce.IOC;
        } else {
            if (i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            futuresOrderTimeInForce = FuturesOrderTimeInForce.GFD;
        }
        List<UiFuturesOrderContext.Leg> legs = uiFuturesOrderContext.getOrderRequest().getLegs();
        com.robinhood.futures.ordercheck.contracts.models.FuturesOrderTrigger futuresOrderTrigger2 = futuresOrderTrigger;
        FuturesOrderTimeInForce futuresOrderTimeInForce2 = futuresOrderTimeInForce;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        for (UiFuturesOrderContext.Leg leg : legs) {
            int i5 = WhenMappings.$EnumSwitchMapping$3[uiFuturesOrderContext.getOrderRequest().getContractType().ordinal()];
            if (i5 == 1) {
                futuresContractType = com.robinhood.futures.ordercheck.contracts.models.FuturesContractType.OUTRIGHT;
            } else if (i5 == 2) {
                futuresContractType = com.robinhood.futures.ordercheck.contracts.models.FuturesContractType.OOF;
            } else {
                if (i5 != i4) {
                    throw new NoWhenBranchMatchedException();
                }
                futuresContractType = com.robinhood.futures.ordercheck.contracts.models.FuturesContractType.EVENTS;
            }
            String strSafeToString3 = Uuids.safeToString(uiFuturesOrderContext.getOrderRequest().getContractId());
            int ratioQuantity = leg.getRatioQuantity();
            int i6 = WhenMappings.$EnumSwitchMapping$4[leg.getOrderSide().ordinal()];
            if (i6 == 1) {
                futuresOrderSide = com.robinhood.futures.ordercheck.contracts.models.FuturesOrderSide.BUY;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                futuresOrderSide = com.robinhood.futures.ordercheck.contracts.models.FuturesOrderSide.SELL;
            }
            arrayList.add(new FuturesOrderCheckRequest.Leg(futuresContractType, strSafeToString3, ratioQuantity, futuresOrderSide));
            i4 = 3;
        }
        java.math.BigDecimal stopPrice = uiFuturesOrderContext.getOrderRequest().getStopPrice();
        BigDecimal bignumBigDecimal2 = stopPrice != null ? BigDecimals6.toBignumBigDecimal(stopPrice) : null;
        java.math.BigDecimal limitPrice = uiFuturesOrderContext.getOrderRequest().getLimitPrice();
        return new FuturesOrderCheckRequest(strSafeToString, strSafeToString2, futuresOrderType, bignumBigDecimal, futuresOrderTrigger2, futuresOrderTimeInForce2, arrayList, bignumBigDecimal2, limitPrice != null ? BigDecimals6.toBignumBigDecimal(limitPrice) : null);
    }
}
