package com.robinhood.crypto.perpetuals.util;

import com.robinhood.models.p320db.OrderTimeInForce;
import crypto_perpetuals.order.p438v1.TimeInForceDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeInForceUtil.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDto", "Lcrypto_perpetuals/order/v1/TimeInForceDto;", "Lcom/robinhood/models/db/OrderTimeInForce;", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.util.TimeInForceUtilKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class TimeInForceUtil {

    /* compiled from: TimeInForceUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.util.TimeInForceUtilKt$WhenMappings */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TimeInForceDto toDto(OrderTimeInForce orderTimeInForce) {
        TimeInForceDto.TypeDto typeDto;
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
        if (i == 1) {
            typeDto = TimeInForceDto.TypeDto.GFD;
        } else if (i == 2) {
            typeDto = TimeInForceDto.TypeDto.GTC;
        } else {
            throw new IllegalStateException("Unsupported time in force");
        }
        return new TimeInForceDto(typeDto, null, 2, null);
    }
}
