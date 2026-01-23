package com.robinhood.android.redesigninvesting.store.badges;

import android.annotation.SuppressLint;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.utils.datetime.Instants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: EarningsExt.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0007\u001a!\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;", "", "isPosted", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;)Z", "j$/time/Instant", "now", "isEarningsCallOver", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;Lj$/time/Instant;)Z", "isLive", "isCallToday", "isReportToday", "", "days", "isWithinDaysFromNow", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;ILj$/time/Instant;)Z", "", "earningsCallTimeFormatted", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;)Ljava/lang/String;", "j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "earningsCallTimeFormatter", "Lj$/time/format/DateTimeFormatter;", "lib-store-badges_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.store.badges.EarningsExtKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class EarningsExt {

    @SuppressLint({"ConstantLocale"})
    private static final DateTimeFormatter earningsCallTimeFormatter = DateTimeFormatter.ofPattern("h:mma", Locale.getDefault(Locale.Category.FORMAT));

    public static final boolean isPosted(Earning earning) {
        Intrinsics.checkNotNullParameter(earning, "<this>");
        Earning.Eps eps = earning.getEps();
        return (eps != null ? eps.getActual() : null) != null;
    }

    public static final boolean isEarningsCallOver(Earning earning, Instant now) {
        LocalDate date;
        Intrinsics.checkNotNullParameter(earning, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        Earning.Report report = earning.getReport();
        if (report == null || (date = report.getDate()) == null || !date.isBefore(Instants.toLocalDate$default(now, null, 1, null))) {
            Earning.Call call = earning.getCall();
            String replayUrl = call != null ? call.getReplayUrl() : null;
            if (replayUrl == null || StringsKt.isBlank(replayUrl)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isLive(Earning earning, Instant now) {
        Intrinsics.checkNotNullParameter(earning, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        return earning.shouldShowJoinBtn(now);
    }

    public static final boolean isCallToday(Earning earning, Instant now) {
        Instant datetime;
        Intrinsics.checkNotNullParameter(earning, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        Earning.Call call = earning.getCall();
        return (call == null || (datetime = call.getDatetime()) == null || datetime.until(now, ChronoUnit.DAYS) != 0) ? false : true;
    }

    public static final boolean isReportToday(Earning earning, Instant now) {
        LocalDate date;
        Intrinsics.checkNotNullParameter(earning, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        Earning.Report report = earning.getReport();
        return (report == null || (date = report.getDate()) == null || date.until(Instants.toLocalDate$default(now, null, 1, null), ChronoUnit.DAYS) != 0) ? false : true;
    }

    public static final boolean isWithinDaysFromNow(Earning earning, int i, Instant now) {
        LocalDate date;
        Intrinsics.checkNotNullParameter(earning, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        Earning.Report report = earning.getReport();
        return (report == null || (date = report.getDate()) == null || Instants.daysUntil(now, date) > i) ? false : true;
    }

    public static final String earningsCallTimeFormatted(Earning earning) {
        Instant datetime;
        Intrinsics.checkNotNullParameter(earning, "<this>");
        Earning.Call call = earning.getCall();
        if (call == null || (datetime = call.getDatetime()) == null) {
            return "";
        }
        String str = Instants.toLocalTime$default(datetime, null, 1, null).format(earningsCallTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.replace$default(lowerCase, ":00", "", false, 4, (Object) null);
    }
}
