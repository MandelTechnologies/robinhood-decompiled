package com.robinhood.android.common.recurring.bottomsheet.frequency;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecurringFrequencyBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toBottomSheetRow", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Row;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "isCrypto", "", "feature-lib-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringFrequencyBottomSheet4 {

    /* compiled from: RecurringFrequencyBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheetKt$WhenMappings */
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

    public static final RecurringFrequencyBottomSheet.Row toBottomSheetRow(ApiInvestmentSchedule.Frequency frequency, boolean z) {
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            if (z) {
                return RecurringFrequencyBottomSheet.Row.DAILY;
            }
            return RecurringFrequencyBottomSheet.Row.EVERY_MARKET_DAY;
        }
        if (i == 2) {
            return RecurringFrequencyBottomSheet.Row.WEEKLY;
        }
        if (i == 3) {
            return RecurringFrequencyBottomSheet.Row.BIWEEKLY;
        }
        if (i == 4) {
            return RecurringFrequencyBottomSheet.Row.MONTHLY;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Paycheck frequency not supported by bottom sheet");
    }
}
