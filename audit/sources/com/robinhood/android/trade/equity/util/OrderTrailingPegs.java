package com.robinhood.android.trade.equity.util;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTrailingPegs.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, m3636d2 = {"getLabelString", "", "Lcom/robinhood/models/db/OrderTrailingPeg;", "res", "Landroid/content/res/Resources;", "getDisplayString", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.OrderTrailingPegsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderTrailingPegs {

    /* compiled from: OrderTrailingPegs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.util.OrderTrailingPegsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderTrailingPeg.TrailingPegType.values().length];
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PERCENTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTrailingPeg.TrailingPegType.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getLabelString(OrderTrailingPeg orderTrailingPeg, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(orderTrailingPeg, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTrailingPeg.getType().ordinal()];
        if (i == 1) {
            String string2 = res.getString(C29365R.string.order_create_trailing_percentage_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = res.getString(C29365R.string.order_create_trailing_amount_label);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final String getDisplayString(OrderTrailingPeg orderTrailingPeg) {
        Intrinsics.checkNotNullParameter(orderTrailingPeg, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderTrailingPeg.getType().ordinal()];
        if (i == 1) {
            NumberFormatter percentFormat = Formats.getPercentFormat();
            BigDecimal displayPercentage = orderTrailingPeg.getDisplayPercentage();
            Intrinsics.checkNotNull(displayPercentage);
            return percentFormat.format(displayPercentage);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        NumberFormatter currencyFormat = Formats.getCurrencyFormat();
        Money price = orderTrailingPeg.getPrice();
        Intrinsics.checkNotNull(price);
        return currencyFormat.format(price.getDecimalValue());
    }
}
