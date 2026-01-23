package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.models.p320db.OptionOrderType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTypeStrings.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getOrderWithTypeStr", "", "Lcom/robinhood/models/db/OptionOrderType;", "res", "Landroid/content/res/Resources;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.common.OptionOrderTypeStringsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOrderTypeStrings {

    /* compiled from: OptionOrderTypeStrings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.OptionOrderTypeStringsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOrderType.values().length];
            try {
                iArr[OptionOrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderType.STOP_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionOrderType.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionOrderType.STOP_MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getOrderWithTypeStr(OptionOrderType optionOrderType, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionOrderType, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int i = WhenMappings.$EnumSwitchMapping$0[optionOrderType.ordinal()];
        if (i == 1) {
            String string2 = res.getString(C23386R.string.option_order_type_limit_order);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = res.getString(C23386R.string.option_order_type_stop_limit_order);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i == 3) {
            String string4 = res.getString(C23386R.string.option_order_type_market_order);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = res.getString(C23386R.string.option_order_type_stop_market_order);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return string5;
    }
}
