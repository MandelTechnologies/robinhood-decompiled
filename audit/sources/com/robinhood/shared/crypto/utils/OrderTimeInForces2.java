package com.robinhood.shared.crypto.utils;

import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.nummus.order.TimeInForceDto;

/* compiled from: OrderTimeInForces.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"dto", "Lrosetta/nummus/order/TimeInForceDto;", "Lcom/robinhood/models/db/OrderTimeInForce;", "getDto", "(Lcom/robinhood/models/db/OrderTimeInForce;)Lrosetta/nummus/order/TimeInForceDto;", "lib-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.utils.OrderTimeInForcesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTimeInForces2 {

    /* compiled from: OrderTimeInForces.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.utils.OrderTimeInForcesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTimeInForce.values().length];
            try {
                iArr[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderTimeInForce.GFW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderTimeInForce.GFM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderTimeInForce.FOK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderTimeInForce.IOC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderTimeInForce.OPG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TimeInForceDto getDto(OrderTimeInForce orderTimeInForce) {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()]) {
            case 1:
                return TimeInForceDto.TIME_IN_FORCE_GFD;
            case 2:
                return TimeInForceDto.TIME_IN_FORCE_GTC;
            case 3:
                return TimeInForceDto.TIME_IN_FORCE_GFW;
            case 4:
                return TimeInForceDto.TIME_IN_FORCE_GFM;
            case 5:
                throw new IllegalStateException("Unsupported time in force: FOK");
            case 6:
                throw new IllegalStateException("Unsupported time in force: IOC");
            case 7:
                throw new IllegalStateException("Unsupported time in force: OPG");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
