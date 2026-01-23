package com.robinhood.rosetta.converters.recurring;

import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Recurring.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u0004\u0018\u00010\u0004\u001a\f\u0010\u0000\u001a\u00020\u0005*\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$ScheduleFrequency;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$RecurringFundsSource;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$AssetType;", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.recurring.RecurringKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Recurring2 {

    /* compiled from: Recurring.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.recurring.RecurringKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiAssetType.values().length];
            try {
                iArr3[ApiAssetType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiAssetType.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiAssetType.BROKERAGE_CASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final RecurringContext.ScheduleFrequency toProtobuf(ApiInvestmentSchedule.Frequency frequency) {
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
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
        return RecurringContext.ScheduleFrequency.SCHEDULE_FREQUENCY_UNSPECIFIED;
    }

    public static final RecurringContext.RecurringFundsSource toProtobuf(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds) {
        int i = sourceOfFunds == null ? -1 : WhenMappings.$EnumSwitchMapping$1[sourceOfFunds.ordinal()];
        if (i == -1) {
            return RecurringContext.RecurringFundsSource.RECURRING_FUNDS_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return RecurringContext.RecurringFundsSource.ACH;
        }
        if (i == 2) {
            return RecurringContext.RecurringFundsSource.BUYING_POWER;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return RecurringContext.RecurringFundsSource.DIRECT_DEPOSIT;
    }

    public static final RecurringContext.AssetType toProtobuf(ApiAssetType apiAssetType) {
        int i = apiAssetType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[apiAssetType.ordinal()];
        if (i == 1) {
            return RecurringContext.AssetType.EQUITY;
        }
        if (i == 2) {
            return RecurringContext.AssetType.CRYPTO;
        }
        if (i == 3) {
            return RecurringContext.AssetType.BROKERAGE_CASH;
        }
        return RecurringContext.AssetType.ASSET_TYPE_UNSPECIFIED;
    }
}
