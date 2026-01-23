package com.robinhood.android.common.recurring.sourceoffunds;

import android.os.Parcelable;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment;
import com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentSchedulesFrequencies.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¨\u0006\u000f"}, m3636d2 = {"getSourceOfFundsFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "actionType", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "amount", "Lcom/robinhood/models/util/Money;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "", "fromInsights", "", "accountNumber", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.recurring.sourceoffunds.InvestmentSchedulesFrequenciesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InvestmentSchedulesFrequencies {

    /* compiled from: InvestmentSchedulesFrequencies.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.sourceoffunds.InvestmentSchedulesFrequenciesKt$WhenMappings */
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

    public static /* synthetic */ BaseFragment getSourceOfFundsFragment$default(ApiInvestmentSchedule.Frequency frequency, RecurringOrderActionType recurringOrderActionType, InvestmentTarget investmentTarget, Money money, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            money = null;
        }
        Money money2 = money;
        if ((i & 16) != 0) {
            str = "";
        }
        String str3 = str;
        if ((i & 32) != 0) {
            z = false;
        }
        return getSourceOfFundsFragment(frequency, recurringOrderActionType, investmentTarget, money2, str3, z, str2);
    }

    public static final BaseFragment getSourceOfFundsFragment(ApiInvestmentSchedule.Frequency frequency, RecurringOrderActionType actionType, InvestmentTarget investmentTarget, Money money, String loggingSource, boolean z, String str) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(loggingSource, "loggingSource");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            return (BaseFragment) RecurringOrderPaycheckSourceFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderPaycheckSourceFragment.Args(actionType, null, investmentTarget, money, loggingSource, 2, null));
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return (BaseFragment) RecurringOrderSourceOfFundsFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderSourceOfFundsFragment.Args(actionType, investmentTarget, money != null ? new InvestmentScheduleAmount.Dollar(money) : null, loggingSource, z, str));
        }
        throw new NoWhenBranchMatchedException();
    }
}
