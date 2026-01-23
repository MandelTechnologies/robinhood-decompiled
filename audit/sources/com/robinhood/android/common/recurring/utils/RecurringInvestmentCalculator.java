package com.robinhood.android.common.recurring.utils;

import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringInvestmentCalculator.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/utils/RecurringInvestmentCalculator;", "", "<init>", "()V", "MARKET_DAYS_IN_MONTH", "", "CRYPTO_DAYS_IN_MONTH", "WEEKS_IN_MONTH", "MARKET_DAYS_IN_YEAR", "CRYPTO_DAYS_IN_YEAR", "WEEKS_IN_YEAR", "PAYCHECK_FREQUENCY_NOT_SUPPORTED", "", "computeTotalInvested", "initialInvestment", "totalMonthsInvested", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "isCrypto", "", "getMonthlyMultiplier", "getYearlyMultiplier", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringInvestmentCalculator {
    public static final int $stable = 0;
    private static final int CRYPTO_DAYS_IN_MONTH = 30;
    private static final int CRYPTO_DAYS_IN_YEAR = 365;
    public static final RecurringInvestmentCalculator INSTANCE = new RecurringInvestmentCalculator();
    private static final int MARKET_DAYS_IN_MONTH = 21;
    private static final int MARKET_DAYS_IN_YEAR = 252;
    public static final String PAYCHECK_FREQUENCY_NOT_SUPPORTED = "Paycheck frequency not supported for RecurringInvestmentCalculator.";
    private static final int WEEKS_IN_MONTH = 4;
    private static final int WEEKS_IN_YEAR = 52;

    /* compiled from: RecurringInvestmentCalculator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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

    private RecurringInvestmentCalculator() {
    }

    public final int computeTotalInvested(int initialInvestment, int totalMonthsInvested, ApiInvestmentSchedule.Frequency frequency, boolean isCrypto) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        if (initialInvestment < 0) {
            throw new IllegalStateException("initialInvestment cannot be negative");
        }
        if (totalMonthsInvested < 0) {
            throw new IllegalStateException("totalMonthsInvested cannot be negative");
        }
        return ((totalMonthsInvested / 12) * initialInvestment * getYearlyMultiplier(frequency, isCrypto)) + (initialInvestment * (totalMonthsInvested % 12) * getMonthlyMultiplier(frequency, isCrypto));
    }

    private final int getMonthlyMultiplier(ApiInvestmentSchedule.Frequency frequency, boolean isCrypto) {
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            throw new IllegalStateException(PAYCHECK_FREQUENCY_NOT_SUPPORTED);
        }
        if (i == 2) {
            return isCrypto ? 30 : 21;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 5) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getYearlyMultiplier(ApiInvestmentSchedule.Frequency frequency, boolean isCrypto) {
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            throw new IllegalStateException(PAYCHECK_FREQUENCY_NOT_SUPPORTED);
        }
        if (i == 2) {
            if (isCrypto) {
                return CRYPTO_DAYS_IN_YEAR;
            }
            return 252;
        }
        if (i == 3) {
            return 52;
        }
        if (i == 4) {
            return 26;
        }
        if (i == 5) {
            return 12;
        }
        throw new NoWhenBranchMatchedException();
    }
}
