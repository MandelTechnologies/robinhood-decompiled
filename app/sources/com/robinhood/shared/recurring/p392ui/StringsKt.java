package com.robinhood.shared.recurring.p392ui;

import android.content.res.Resources;
import com.robinhood.android.common.util.NumberUtils;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.LocalDate;
import p479j$.time.format.TextStyle;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u000e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u000e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"j$/time/LocalDate", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/utils/resource/StringResource;", "nextDateString", "(Lj$/time/LocalDate;Lj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "nextDateStringLowerCase", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "investmentDate", "Landroid/content/res/Resources;", "resources", "", "disclosureText", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Landroid/content/res/Resources;)Ljava/lang/String;", "", "getLabelResIdSimple", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)I", "labelResIdSimple", "getLabelResId", "labelResId", "getLabelResIdLowerCase", "labelResIdLowerCase", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;)Lcom/robinhood/utils/resource/StringResource;", "lib-recurring-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class StringsKt {

    /* compiled from: Strings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int getLabelResIdSimple(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 2) {
            return C39558R.string.recurring_frequency_biweekly;
        }
        if (i == 3) {
            return C39558R.string.recurring_frequency_daily;
        }
        if (i == 4) {
            return C39558R.string.recurring_frequency_monthly;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C39558R.string.recurring_frequency_weekly;
    }

    public static final int getLabelResId(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 2) {
            return C39558R.string.recurring_frequency_label_biweekly;
        }
        if (i == 3) {
            return C39558R.string.recurring_frequency_label_daily;
        }
        if (i == 4) {
            return C39558R.string.recurring_frequency_label_monthly;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C39558R.string.recurring_frequency_label_weekly;
    }

    public static final int getLabelResIdLowerCase(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 2) {
            return C39558R.string.recurring_frequency_label_biweekly_lowercase;
        }
        if (i == 3) {
            return C39558R.string.recurring_frequency_label_daily_lowercase;
        }
        if (i == 4) {
            return C39558R.string.recurring_frequency_label_monthly_lowercase;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C39558R.string.recurring_frequency_label_weekly_lowercase;
    }

    public static final StringResource getLabelResId(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[sourceOfFunds.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39558R.string.recurring_source_of_funds_buying_power, new Object[0]);
        }
        if (i == 2 || i == 3) {
            return StringResource.INSTANCE.invoke("");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final StringResource nextDateString(LocalDate localDate, Clock clock) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        LocalDate localDateNow = LocalDate.now(clock);
        return Intrinsics.areEqual(localDate, localDateNow) ? StringResource.INSTANCE.invoke(C39558R.string.recurring_date_today, new Object[0]) : Intrinsics.areEqual(localDate, localDateNow.plusDays(1L)) ? StringResource.INSTANCE.invoke(C39558R.string.recurring_date_tomorrow, new Object[0]) : StringResource.INSTANCE.invoke(LocalDateFormatter.MEDIUM.format((LocalDateFormatter) localDate));
    }

    public static final StringResource nextDateStringLowerCase(LocalDate localDate, Clock clock) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        LocalDate localDateNow = LocalDate.now(clock);
        return Intrinsics.areEqual(localDate, localDateNow) ? StringResource.INSTANCE.invoke(C39558R.string.recurring_date_today_lower, new Object[0]) : Intrinsics.areEqual(localDate, localDateNow.plusDays(1L)) ? StringResource.INSTANCE.invoke(C39558R.string.recurring_date_tomorrow_lower, new Object[0]) : StringResource.INSTANCE.invoke(LocalDateFormatter.MEDIUM.format((LocalDateFormatter) localDate));
    }

    public static final String disclosureText(ApiInvestmentSchedule.Frequency frequency, LocalDate investmentDate, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        Intrinsics.checkNotNullParameter(investmentDate, "investmentDate");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 2) {
            String string2 = resources.getString(C39558R.string.recurring_disclosure_frequency_biweekly, investmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault(Locale.Category.DISPLAY)));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (i == 3) {
            String string3 = resources.getString(C39558R.string.recurring_disclosure_frequency_daily);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i == 4) {
            String string4 = resources.getString(C39558R.string.recurring_disclosure_frequency_monthly, NumberUtils.getDayOfMonthOrdinalString(investmentDate));
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = resources.getString(C39558R.string.recurring_disclosure_frequency_weekly, investmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault(Locale.Category.DISPLAY)));
        Intrinsics.checkNotNull(string5);
        return string5;
    }
}
