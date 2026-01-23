package com.robinhood.android.trade.options;

import android.content.res.Resources;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTimeInForceHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"getName", "", "Lcom/robinhood/models/db/OrderTimeInForce;", "resources", "Landroid/content/res/Resources;", "getExplanation", "inIndexOptionsCurbHoursExperiment", "", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.OrderTimeInForceHelperKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderTimeInForceHelper {

    /* compiled from: OrderTimeInForceHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.OrderTimeInForceHelperKt$WhenMappings */
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

    public static final String getName(OrderTimeInForce orderTimeInForce, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C29312R.string.order_radio_button_good_for_day_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = resources.getString(C29312R.string.order_radio_button_good_till_cancel_title);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        throw new IllegalStateException("Not supported timeInForce type for options.");
    }

    public static final String getExplanation(OrderTimeInForce orderTimeInForce, Resources resources, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(orderTimeInForce, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
        if (i != 1) {
            if (i == 2) {
                String string2 = resources.getString(C29312R.string.order_radio_button_good_till_cancel_subtitle);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            throw new IllegalStateException("Not supported timeInForce type for options.");
        }
        if (z) {
            String string3 = resources.getString(C29312R.string.order_radio_button_good_for_day_subtitle_with_extended_hours);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        String string4 = resources.getString(C29312R.string.order_radio_button_good_for_day_subtitle);
        Intrinsics.checkNotNull(string4);
        return string4;
    }
}
