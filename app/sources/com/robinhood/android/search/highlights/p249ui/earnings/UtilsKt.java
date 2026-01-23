package com.robinhood.android.search.highlights.p249ui.earnings;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.search.highlights.C27914R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.AmPm;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a5\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\"\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Eps;", "eps", "Lcom/robinhood/utils/resource/StringResource;", "getEarningsEpsStatusOrNull", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Eps;)Lcom/robinhood/utils/resource/StringResource;", "getActualEpsOrNull", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Call;", "call", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Report;", "report", "getDisplayDateOfEarnings", "(Landroid/content/res/Resources;Lj$/time/Clock;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Call;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning$Report;)Lcom/robinhood/utils/resource/StringResource;", "j$/time/ZoneId", "kotlin.jvm.PlatformType", "newYorkZoneId", "Lj$/time/ZoneId;", "getNewYorkZoneId", "()Lj$/time/ZoneId;", "", "MIN_EARNINGS_TO_SHOW", "I", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class UtilsKt {
    public static final int MIN_EARNINGS_TO_SHOW = 3;
    private static final ZoneId newYorkZoneId = ZoneId.m3448of("America/New_York");

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AmPm.values().length];
            try {
                iArr[AmPm.AM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmPm.PM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ZoneId getNewYorkZoneId() {
        return newYorkZoneId;
    }

    public static final StringResource getEarningsEpsStatusOrNull(Earning.Eps eps) {
        if (eps == null) {
            return null;
        }
        BigDecimal estimate = eps.getEstimate();
        BigDecimal actual = eps.getActual();
        if (estimate == null && actual != null) {
            return StringResource.INSTANCE.invoke(C27914R.string.eps_released, new Object[0]);
        }
        if (estimate == null || actual == null) {
            return null;
        }
        return estimate.compareTo(actual) > 0 ? StringResource.INSTANCE.invoke(C27914R.string.eps_miss, new Object[0]) : estimate.compareTo(actual) < 0 ? StringResource.INSTANCE.invoke(C27914R.string.eps_beat, new Object[0]) : StringResource.INSTANCE.invoke(C27914R.string.eps_met, new Object[0]);
    }

    public static final StringResource getActualEpsOrNull(Earning.Eps eps) {
        BigDecimal actual;
        String str = (eps == null || (actual = eps.getActual()) == null) ? null : Formats.getPriceFormat().format(actual);
        if (str != null) {
            return StringResource.INSTANCE.invoke(C27914R.string.eps_value, str);
        }
        return null;
    }

    public static final StringResource getDisplayDateOfEarnings(Resources resources, Clock clock, Earning.Call call, Earning.Report report) throws Resources.NotFoundException {
        Instant datetime;
        String string2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        if (call == null || (datetime = call.getDatetime()) == null) {
            return null;
        }
        AmPm timing = report != null ? report.getTiming() : null;
        ZoneId newYorkZoneId2 = newYorkZoneId;
        ZonedDateTime zonedDateTimeAtZone = datetime.atZone(newYorkZoneId2);
        Instant instant = clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        LocalDate localDateMo3459a = Instants.toZonedDateTime$default(instant, null, 1, null).mo3459a();
        Instant instant2 = clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant2, "instant(...)");
        Intrinsics.checkNotNullExpressionValue(newYorkZoneId2, "newYorkZoneId");
        LocalDate localDateMo3459a2 = Instants.toZonedDateTime(instant2, newYorkZoneId2).mo3459a();
        long jBetween = ChronoUnit.DAYS.between(localDateMo3459a2, zonedDateTimeAtZone.mo3459a());
        if (jBetween < 1) {
            boolean zAreEqual = Intrinsics.areEqual(localDateMo3459a2, localDateMo3459a);
            if (zAreEqual && timing == AmPm.AM) {
                return StringResource.INSTANCE.invoke(C27914R.string.eps_report_today_premarket, new Object[0]);
            }
            if (zAreEqual && timing == AmPm.PM) {
                return StringResource.INSTANCE.invoke(C27914R.string.eps_report_today_afterhours, new Object[0]);
            }
            if (zAreEqual) {
                return StringResource.INSTANCE.invoke(C27914R.string.eps_report_today, new Object[0]);
            }
            return timing == AmPm.AM ? StringResource.INSTANCE.invoke(C27914R.string.eps_report_tomorrow_premarket, new Object[0]) : timing == AmPm.PM ? StringResource.INSTANCE.invoke(C27914R.string.eps_report_tomorrow_afterhours, new Object[0]) : StringResource.INSTANCE.invoke(C27914R.string.eps_report_tomorrow, new Object[0]);
        }
        if (jBetween == 1 && Intrinsics.areEqual(localDateMo3459a2, localDateMo3459a)) {
            int i = timing == null ? -1 : WhenMappings.$EnumSwitchMapping$0[timing.ordinal()];
            if (i == -1) {
                return StringResource.INSTANCE.invoke(C27914R.string.eps_report_tomorrow, new Object[0]);
            }
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C27914R.string.eps_report_tomorrow_premarket, new Object[0]);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C27914R.string.eps_report_tomorrow_afterhours, new Object[0]);
        }
        LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM_NO_YEAR;
        LocalDate localDateMo3459a3 = zonedDateTimeAtZone.mo3459a();
        Intrinsics.checkNotNullExpressionValue(localDateMo3459a3, "toLocalDate(...)");
        String str = localDateFormatter.format(localDateMo3459a3);
        if (timing != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[timing.ordinal()];
            if (i2 == 1) {
                string2 = resources.getString(C27914R.string.eps_report_premarket_post_fix);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = resources.getString(C27914R.string.eps_report_afterhours_post_fix);
            }
            Intrinsics.checkNotNull(string2);
            return StringResource.INSTANCE.invoke(C27914R.string.eps_report_date_with_timing, str, string2);
        }
        return StringResource.INSTANCE.invoke(str);
    }
}
