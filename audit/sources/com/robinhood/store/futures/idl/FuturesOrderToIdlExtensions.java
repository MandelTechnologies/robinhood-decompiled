package com.robinhood.store.futures.idl;

import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.FuturesOrderLeg;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.ceres.p284v1.FuturesOrderLegRequestDto;
import com.robinhood.utils.extensions.Uuids;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.SideDto;
import rosetta.mainst.TimeInForceDto;

/* compiled from: FuturesOrderToIdlExtensions.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f¨\u0006\r"}, m3636d2 = {"toIdlModel", "Lrosetta/mainst/SideDto;", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "Lcom/robinhood/android/models/futures/api/order/FuturesContractType;", "Lrosetta/mainst/OrderTypeDto;", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "Lrosetta/mainst/OrderTriggerDto;", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "Lrosetta/mainst/TimeInForceDto;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "Lcom/robinhood/android/models/futures/db/FuturesOrderLeg;", "lib-store-futures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.idl.FuturesOrderToIdlExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FuturesOrderToIdlExtensions {

    /* compiled from: FuturesOrderToIdlExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.idl.FuturesOrderToIdlExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

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
            int[] iArr2 = new int[FuturesContractType.values().length];
            try {
                iArr2[FuturesContractType.OUTRIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FuturesContractType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FuturesContractType.EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FuturesOrderType.values().length];
            try {
                iArr3[FuturesOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FuturesOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[FuturesOrderTrigger.values().length];
            try {
                iArr4[FuturesOrderTrigger.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[FuturesOrderTrigger.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[FuturesTimeInForce.values().length];
            try {
                iArr5[FuturesTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[FuturesTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[FuturesTimeInForce.IOC.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[FuturesTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[FuturesTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final SideDto toIdlModel(FuturesOrderSide futuresOrderSide) {
        Intrinsics.checkNotNullParameter(futuresOrderSide, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[futuresOrderSide.ordinal()];
        if (i == 1) {
            return SideDto.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return SideDto.SELL;
    }

    public static final FuturesContractTypeDto toIdlModel(FuturesContractType futuresContractType) {
        Intrinsics.checkNotNullParameter(futuresContractType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[futuresContractType.ordinal()];
        if (i == 1) {
            return FuturesContractTypeDto.OUTRIGHT;
        }
        if (i == 2) {
            return FuturesContractTypeDto.OOF;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return FuturesContractTypeDto.EVENT_CONTRACT;
    }

    public static final OrderTypeDto toIdlModel(FuturesOrderType futuresOrderType) {
        Intrinsics.checkNotNullParameter(futuresOrderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[futuresOrderType.ordinal()];
        if (i == 1) {
            return OrderTypeDto.MARKET;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderTypeDto.LIMIT;
    }

    public static final OrderTriggerDto toIdlModel(FuturesOrderTrigger futuresOrderTrigger) {
        Intrinsics.checkNotNullParameter(futuresOrderTrigger, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[futuresOrderTrigger.ordinal()];
        if (i == 1) {
            return OrderTriggerDto.IMMEDIATE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderTriggerDto.STOP;
    }

    public static final TimeInForceDto toIdlModel(FuturesTimeInForce futuresTimeInForce) {
        Intrinsics.checkNotNullParameter(futuresTimeInForce, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[futuresTimeInForce.ordinal()];
        if (i == 1) {
            return TimeInForceDto.GFD;
        }
        if (i == 2) {
            return TimeInForceDto.GTC;
        }
        if (i == 3) {
            return TimeInForceDto.IOC;
        }
        if (i == 4) {
            return TimeInForceDto.GTD;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return TimeInForceDto.FOK;
    }

    public static final FuturesOrderLegRequestDto toIdlModel(FuturesOrderLeg futuresOrderLeg) {
        Intrinsics.checkNotNullParameter(futuresOrderLeg, "<this>");
        return new FuturesOrderLegRequestDto(toIdlModel(futuresOrderLeg.getContractType()), Uuids.safeToString(futuresOrderLeg.getContractId()), futuresOrderLeg.getRatioQuantity(), toIdlModel(futuresOrderLeg.getOrderSide()));
    }
}
