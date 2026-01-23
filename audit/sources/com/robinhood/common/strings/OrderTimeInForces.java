package com.robinhood.common.strings;

import android.content.res.Resources;
import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTimeInForces.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getTimeInForceString", "", "Lcom/robinhood/models/db/OrderTimeInForce;", "res", "Landroid/content/res/Resources;", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.common.strings.OrderTimeInForcesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class OrderTimeInForces {

    /* compiled from: OrderTimeInForces.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.OrderTimeInForcesKt$WhenMappings */
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
                iArr[OrderTimeInForce.FOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderTimeInForce.IOC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderTimeInForce.OPG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderTimeInForce.GFW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderTimeInForce.GFM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getTimeInForceString(OrderTimeInForce orderTimeInForce, Resources res) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        switch (WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()]) {
            case 1:
                i = C32428R.string.order_time_in_force_gfd;
                break;
            case 2:
                i = C32428R.string.order_time_in_force_gtc;
                break;
            case 3:
                i = C32428R.string.order_time_in_force_fok;
                break;
            case 4:
                i = C32428R.string.order_time_in_force_ioc;
                break;
            case 5:
                i = C32428R.string.order_time_in_force_opg;
                break;
            case 6:
                i = C32428R.string.order_time_in_force_gfw;
                break;
            case 7:
                i = C32428R.string.order_time_in_force_gfm;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = res.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
