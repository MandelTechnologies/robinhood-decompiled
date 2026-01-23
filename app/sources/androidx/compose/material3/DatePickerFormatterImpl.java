package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DatePicker.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Landroidx/compose/material3/DatePickerFormatterImpl;", "Landroidx/compose/material3/DatePickerFormatter;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "monthMillis", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "formatMonthYear", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "dateMillis", "", "forContentDescription", "formatDate", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getYearSelectionSkeleton", "()Ljava/lang/String;", "getSelectedDateSkeleton", "getSelectedDateDescriptionSkeleton", "", "formatterCache", "Ljava/util/Map;", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class DatePickerFormatterImpl implements DatePickerFormatter {
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final String selectedDateDescriptionSkeleton;
    private final String selectedDateSkeleton;
    private final String yearSelectionSkeleton;

    public DatePickerFormatterImpl(String str, String str2, String str3) {
        this.yearSelectionSkeleton = str;
        this.selectedDateSkeleton = str2;
        this.selectedDateDescriptionSkeleton = str3;
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatMonthYear(Long monthMillis, Locale locale) {
        if (monthMillis == null) {
            return null;
        }
        return CalendarModel_androidKt.formatWithSkeleton(monthMillis.longValue(), this.yearSelectionSkeleton, locale, this.formatterCache);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public String formatDate(Long dateMillis, Locale locale, boolean forContentDescription) {
        String str;
        if (dateMillis == null) {
            return null;
        }
        long jLongValue = dateMillis.longValue();
        if (forContentDescription) {
            str = this.selectedDateDescriptionSkeleton;
        } else {
            str = this.selectedDateSkeleton;
        }
        return CalendarModel_androidKt.formatWithSkeleton(jLongValue, str, locale, this.formatterCache);
    }

    public boolean equals(Object other) {
        if (!(other instanceof DatePickerFormatterImpl)) {
            return false;
        }
        DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) other;
        return Intrinsics.areEqual(this.yearSelectionSkeleton, datePickerFormatterImpl.yearSelectionSkeleton) && Intrinsics.areEqual(this.selectedDateSkeleton, datePickerFormatterImpl.selectedDateSkeleton) && Intrinsics.areEqual(this.selectedDateDescriptionSkeleton, datePickerFormatterImpl.selectedDateDescriptionSkeleton);
    }

    public int hashCode() {
        return (((this.yearSelectionSkeleton.hashCode() * 31) + this.selectedDateSkeleton.hashCode()) * 31) + this.selectedDateDescriptionSkeleton.hashCode();
    }
}
