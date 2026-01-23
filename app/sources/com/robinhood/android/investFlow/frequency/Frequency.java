package com.robinhood.android.investFlow.frequency;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Frequency.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"BE\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/Frequency;", "", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "apiFrequency", "", "title", "titleLowercase", "description", "", "showForCrypto", "showForEquity", "<init>", "(Ljava/lang/String;ILcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;IIIZZ)V", "j$/time/LocalDate", "nextInvestmentDate", "Lcom/robinhood/utils/resource/StringResource;", "getFormattedDescription", "(Lj$/time/LocalDate;)Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getApiFrequency", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "I", "getTitle", "()I", "getTitleLowercase", "getDescription", "Z", "getShowForCrypto", "()Z", "getShowForEquity", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "getInvestFlowFrequency", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "investFlowFrequency", "Companion", "ONCE", "EVERY_MARKET_DAY", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Frequency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Frequency[] $VALUES;
    public static final Frequency BIWEEKLY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Frequency DAILY;
    public static final Frequency EVERY_MARKET_DAY;
    public static final Frequency MONTHLY;
    public static final Frequency ONCE = new Frequency("ONCE", 0, null, C19349R.string.invest_flow_frequency_once_title_uppercase, C19349R.string.invest_flow_frequency_once_title_lowercase, C19349R.string.invest_flow_frequency_once_description, true, true);
    public static final Frequency WEEKLY;
    private final ApiInvestmentSchedule.Frequency apiFrequency;
    private final int description;
    private final boolean showForCrypto;
    private final boolean showForEquity;
    private final int title;
    private final int titleLowercase;

    /* compiled from: Frequency.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Frequency.values().length];
            try {
                iArr[Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Frequency.EVERY_MARKET_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Frequency.DAILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Frequency.WEEKLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Frequency.BIWEEKLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Frequency.MONTHLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ Frequency[] $values() {
        return new Frequency[]{ONCE, EVERY_MARKET_DAY, DAILY, WEEKLY, BIWEEKLY, MONTHLY};
    }

    public static EnumEntries<Frequency> getEntries() {
        return $ENTRIES;
    }

    private Frequency(String str, int i, ApiInvestmentSchedule.Frequency frequency, int i2, int i3, int i4, boolean z, boolean z2) {
        this.apiFrequency = frequency;
        this.title = i2;
        this.titleLowercase = i3;
        this.description = i4;
        this.showForCrypto = z;
        this.showForEquity = z2;
    }

    /* synthetic */ Frequency(String str, int i, ApiInvestmentSchedule.Frequency frequency, int i2, int i3, int i4, boolean z, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, frequency, i2, i3, i4, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? false : z2);
    }

    public final ApiInvestmentSchedule.Frequency getApiFrequency() {
        return this.apiFrequency;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getTitleLowercase() {
        return this.titleLowercase;
    }

    public final int getDescription() {
        return this.description;
    }

    public final boolean getShowForCrypto() {
        return this.showForCrypto;
    }

    public final boolean getShowForEquity() {
        return this.showForEquity;
    }

    static {
        ApiInvestmentSchedule.Frequency frequency = ApiInvestmentSchedule.Frequency.DAILY;
        EVERY_MARKET_DAY = new Frequency("EVERY_MARKET_DAY", 1, frequency, C11595R.string.investment_schedule_frequency_daily, C11595R.string.investment_schedule_frequency_daily_lowercase, C11595R.string.equity_recurring_schedule_daily_subtitle, false, true);
        DAILY = new Frequency("DAILY", 2, frequency, C11595R.string.investment_schedule_frequency_daily_crypto, C11595R.string.investment_schedule_frequency_daily_lowercase, C11595R.string.equity_recurring_schedule_daily_crypto_subtitle, true, false);
        WEEKLY = new Frequency("WEEKLY", 3, ApiInvestmentSchedule.Frequency.WEEKLY, C11595R.string.investment_schedule_frequency_weekly, C11595R.string.investment_schedule_frequency_weekly_lowercase, C11595R.string.equity_recurring_schedule_weekly_subtitle, true, true);
        BIWEEKLY = new Frequency("BIWEEKLY", 4, ApiInvestmentSchedule.Frequency.BIWEEKLY, C11595R.string.investment_schedule_frequency_biweekly, C11595R.string.investment_schedule_frequency_biweekly_lowercase, C11595R.string.equity_recurring_schedule_biweekly_subtitle, true, true);
        MONTHLY = new Frequency("MONTHLY", 5, ApiInvestmentSchedule.Frequency.MONTHLY, C11595R.string.investment_schedule_frequency_monthly, C11595R.string.investment_schedule_frequency_monthly_lowercase, C11595R.string.equity_recurring_schedule_monthly_subtitle, true, true);
        Frequency[] frequencyArr$values = $values();
        $VALUES = frequencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(frequencyArr$values);
        INSTANCE = new Companion(null);
    }

    public final StringResource getFormattedDescription(LocalDate nextInvestmentDate) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(this.description, new Object[0]);
            case 4:
            case 5:
                return StringResource.INSTANCE.invoke(this.description, LocalDateFormatter.WEEKDAY_ONLY.format(nextInvestmentDate));
            case 6:
                return StringResource.INSTANCE.invoke(this.description, NumberUtils.getDayOfMonthOrdinalString(nextInvestmentDate));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final InvestFlowFrequency getInvestFlowFrequency() {
        ApiInvestmentSchedule.Frequency frequency = this.apiFrequency;
        return frequency != null ? new InvestFlowFrequency.Recurring(frequency, null, 2, null) : InvestFlowFrequency.Once.INSTANCE;
    }

    /* compiled from: Frequency.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/Frequency$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "investFlowFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "isCrypto", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Frequency from(InvestFlowFrequency investFlowFrequency, boolean isCrypto) {
            if (Intrinsics.areEqual(investFlowFrequency, InvestFlowFrequency.Once.INSTANCE)) {
                return Frequency.ONCE;
            }
            if (investFlowFrequency instanceof InvestFlowFrequency.Recurring) {
                return InvestFlowFrequencyDataState3.toFrequencyRow(((InvestFlowFrequency.Recurring) investFlowFrequency).getFrequency(), isCrypto);
            }
            if (investFlowFrequency == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static Frequency valueOf(String str) {
        return (Frequency) Enum.valueOf(Frequency.class, str);
    }

    public static Frequency[] values() {
        return (Frequency[]) $VALUES.clone();
    }
}
