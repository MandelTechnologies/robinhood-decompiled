package com.robinhood.android.common.recurring.intro;

import android.content.res.Resources;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentFrequenciesUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toInvestmentDropdownText", "", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "res", "Landroid/content/res/Resources;", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.intro.InvestmentFrequenciesUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InvestmentFrequenciesUtils {

    /* compiled from: InvestmentFrequenciesUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.intro.InvestmentFrequenciesUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toInvestmentDropdownText(ApiInvestmentSchedule.Frequency frequency, Resources res) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int i2 = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Paycheck frequency not supported.");
        }
        if (i2 == 2) {
            i = C11595R.string.recurring_investment_graph_frequency_daily;
        } else if (i2 == 3) {
            i = C11595R.string.recurring_investment_graph_frequency_weekly;
        } else if (i2 == 4) {
            i = C11595R.string.recurring_investment_graph_frequency_biweekly;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11595R.string.recurring_investment_graph_frequency_monthly;
        }
        String string2 = res.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
