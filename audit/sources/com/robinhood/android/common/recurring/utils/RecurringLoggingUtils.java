package com.robinhood.android.common.recurring.utils;

import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecurringLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"toRecurringContextScheduleFrequency", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.utils.RecurringLoggingUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringLoggingUtils {

    /* compiled from: RecurringLoggingUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.utils.RecurringLoggingUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RecurringContext.ScheduleFrequency toRecurringContextScheduleFrequency(ApiInvestmentSchedule.Frequency frequency) {
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == -1) {
            return RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED;
        }
        if (i == 1) {
            return RecurringContext.ScheduleFrequency.DAILY;
        }
        if (i == 2) {
            return RecurringContext.ScheduleFrequency.WEEKLY;
        }
        if (i == 3) {
            return RecurringContext.ScheduleFrequency.BIWEEKLY;
        }
        if (i == 4) {
            return RecurringContext.ScheduleFrequency.MONTHLY;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return RecurringContext.ScheduleFrequency.PAYCHECK;
    }
}
