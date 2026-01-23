package com.robinhood.android.investFlow.frequency;

import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import kotlin.Metadata;

/* compiled from: InvestFlowFrequencyDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toFrequencyRow", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "isCrypto", "", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDataStateKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowFrequencyDataState3 {

    /* compiled from: InvestFlowFrequencyDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDataStateKt$WhenMappings */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Frequency toFrequencyRow(ApiInvestmentSchedule.Frequency frequency, boolean z) {
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            if (z) {
                return Frequency.DAILY;
            }
            return Frequency.EVERY_MARKET_DAY;
        }
        if (i == 2) {
            return Frequency.WEEKLY;
        }
        if (i == 3) {
            return Frequency.BIWEEKLY;
        }
        if (i == 4) {
            return Frequency.MONTHLY;
        }
        throw new IllegalStateException("not supported");
    }
}
