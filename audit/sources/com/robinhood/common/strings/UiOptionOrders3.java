package com.robinhood.common.strings;

import android.content.res.Resources;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiOptionOrders.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getSideString", "", "resources", "Landroid/content/res/Resources;", "side", "Lcom/robinhood/models/db/OrderSide;", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.common.strings.UiOptionOrdersKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UiOptionOrders3 {

    /* compiled from: UiOptionOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.UiOptionOrdersKt$WhenMappings */
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

    public static final String getSideString(Resources resources, OrderSide side) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C32428R.string.general_label_buy);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = resources.getString(C32428R.string.general_label_sell);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
