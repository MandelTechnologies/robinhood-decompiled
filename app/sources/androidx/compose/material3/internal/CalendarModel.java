package androidx.compose.material3.internal;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;

/* compiled from: CalendarModel.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0013J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H&¢\u0006\u0004\b\u0010\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0014H&¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b!\u0010\"R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R&\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d02018&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m3636d2 = {"Landroidx/compose/material3/internal/CalendarModel;", "", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Landroidx/compose/material3/internal/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/internal/DateInputFormat;", "", "timeInMillis", "Landroidx/compose/material3/internal/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/internal/CalendarDate;", "Landroidx/compose/material3/internal/CalendarMonth;", "getMonth", "(J)Landroidx/compose/material3/internal/CalendarMonth;", InquiryField.DateField.TYPE, "(Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/internal/CalendarMonth;", "", "year", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "(II)Landroidx/compose/material3/internal/CalendarMonth;", "from", "addedMonthsCount", "plusMonths", "(Landroidx/compose/material3/internal/CalendarMonth;I)Landroidx/compose/material3/internal/CalendarMonth;", "utcTimeMillis", "", "pattern", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/internal/CalendarDate;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "", "formatterCache", "Ljava/util/Map;", "getFormatterCache$material3_release", "()Ljava/util/Map;", "getToday", "()Landroidx/compose/material3/internal/CalendarDate;", "today", "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public abstract class CalendarModel {
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final Locale locale;

    public abstract String formatWithPattern(long utcTimeMillis, String pattern, Locale locale);

    public abstract CalendarDate getCanonicalDate(long timeInMillis);

    public abstract DateInputFormat getDateInputFormat(Locale locale);

    public abstract int getFirstDayOfWeek();

    public abstract CalendarMonth getMonth(int year, int month);

    public abstract CalendarMonth getMonth(long timeInMillis);

    public abstract CalendarMonth getMonth(CalendarDate date);

    public abstract CalendarDate getToday();

    public abstract List<Tuples2<String, String>> getWeekdayNames();

    public abstract CalendarDate parse(String date, String pattern);

    public abstract CalendarMonth plusMonths(CalendarMonth from, int addedMonthsCount);

    public CalendarModel(Locale locale) {
        this.locale = locale;
    }

    public final Map<String, Object> getFormatterCache$material3_release() {
        return this.formatterCache;
    }
}
