package com.robinhood.android.common.options;

import android.content.res.Resources;
import com.robinhood.models.p320db.OrderDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u000b"}, m3636d2 = {"getMaxCostOrMinCreditLabelString", "", "res", "Landroid/content/res/Resources;", "direction", "Lcom/robinhood/models/db/OrderDirection;", "getTotalCostCreditLabelString", "getEstTotalCostCreditLabelString", "getEstMaxCostMinCreditLabelString", "getEstimatedCostOrCreditLabelString", "getEstCostOrCreditLabelString", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.StringHelperKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class StringHelper {

    /* compiled from: StringHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.StringHelperKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderDirection.values().length];
            try {
                iArr[OrderDirection.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderDirection.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getMaxCostOrMinCreditLabelString(Resources res, OrderDirection orderDirection) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection.ordinal()];
        if (i == -1) {
            String string2 = res.getString(C11303R.string.option_order_ambiguous_total_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 1) {
            String string3 = res.getString(C11303R.string.option_order_max_cost_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = res.getString(C11303R.string.option_order_min_credit_label);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static final String getTotalCostCreditLabelString(Resources res, OrderDirection orderDirection) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection.ordinal()];
        if (i == -1) {
            String string2 = res.getString(C11303R.string.option_order_ambiguous_total_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 1) {
            String string3 = res.getString(C11303R.string.option_order_total_cost_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = res.getString(C11303R.string.option_order_total_credit_label);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static final String getEstTotalCostCreditLabelString(Resources res, OrderDirection orderDirection) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection.ordinal()];
        if (i == -1) {
            String string2 = res.getString(C11303R.string.option_order_est_ambiguous_total_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 1) {
            String string3 = res.getString(C11303R.string.option_order_est_total_cost_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = res.getString(C11303R.string.option_order_est_total_credit_label);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static final String getEstMaxCostMinCreditLabelString(Resources res, OrderDirection orderDirection) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection.ordinal()];
        if (i == -1) {
            String string2 = res.getString(C11303R.string.option_order_est_total);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 1) {
            String string3 = res.getString(C11303R.string.option_order_est_max_cost);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = res.getString(C11303R.string.option_order_est_min_credit);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static final String getEstimatedCostOrCreditLabelString(Resources res, OrderDirection orderDirection) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection.ordinal()];
        if (i == -1) {
            String string2 = res.getString(C11303R.string.option_order_estimated_total);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 1) {
            String string3 = res.getString(C11303R.string.option_order_estimated_cost);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = res.getString(C11303R.string.option_order_estimated_credit);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static final String getEstCostOrCreditLabelString(Resources res, OrderDirection orderDirection) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        int i = orderDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderDirection.ordinal()];
        if (i == -1) {
            String string2 = res.getString(C11303R.string.option_order_est_total);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 1) {
            String string3 = res.getString(C11303R.string.option_order_est_cost);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = res.getString(C11303R.string.option_order_est_credit);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }
}
