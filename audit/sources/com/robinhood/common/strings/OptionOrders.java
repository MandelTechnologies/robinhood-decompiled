package com.robinhood.common.strings;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrders.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"getOrderPriceString", "", "Lcom/robinhood/models/db/OptionOrder;", "resources", "Landroid/content/res/Resources;", "getAfterHoursSummaryString", "context", "Landroid/content/Context;", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.common.strings.OptionOrdersKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class OptionOrders {

    /* compiled from: OptionOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.OptionOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderType.values().length];
            try {
                iArr[OrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getOrderPriceString(OptionOrder optionOrder, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[optionOrder.getType().ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C32428R.string.order_market_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (optionOrder.getPrice() == null) {
            String string3 = resources.getString(C32428R.string.order_limit_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        NumberFormatter currencyFormat = Formats.getCurrencyFormat();
        BigDecimal price = optionOrder.getPrice();
        Intrinsics.checkNotNull(price);
        return currencyFormat.format(price);
    }

    public static final String getAfterHoursSummaryString(OptionOrder optionOrder, Context context) {
        Intrinsics.checkNotNullParameter(optionOrder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = context.getString(C32428R.string.option_order_summary_after_hours_status_queued, InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) optionOrder.getCreatedAt()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
