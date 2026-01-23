package androidx.compose.material3;

import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.DateInputFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: DateInput.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u001d\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m3636d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "", "currentStartDateMillis", "currentEndDateMillis", "<init>", "(Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/internal/CalendarDate;", "dateToValidate", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "validate-XivgLIo", "(Landroidx/compose/material3/internal/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "validate", "Lkotlin/ranges/IntRange;", "Landroidx/compose/material3/SelectableDates;", "Landroidx/compose/material3/internal/DateInputFormat;", "Landroidx/compose/material3/DatePickerFormatter;", "Ljava/lang/String;", "Ljava/lang/Long;", "getCurrentStartDateMillis$material3_release", "()Ljava/lang/Long;", "setCurrentStartDateMillis$material3_release", "(Ljava/lang/Long;)V", "getCurrentEndDateMillis$material3_release", "setCurrentEndDateMillis$material3_release", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class DateInputValidator {
    private Long currentEndDateMillis;
    private Long currentStartDateMillis;
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final SelectableDates selectableDates;
    private final PrimitiveRanges2 yearRange;

    public DateInputValidator(PrimitiveRanges2 primitiveRanges2, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l, Long l2) {
        this.yearRange = primitiveRanges2;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
        this.currentStartDateMillis = l;
        this.currentEndDateMillis = l2;
    }

    public /* synthetic */ DateInputValidator(PrimitiveRanges2 primitiveRanges2, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(primitiveRanges2, selectableDates, dateInputFormat, datePickerFormatter, str, str2, str3, str4, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2);
    }

    public final void setCurrentStartDateMillis$material3_release(Long l) {
        this.currentStartDateMillis = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m5816validateXivgLIo(CalendarDate dateToValidate, int inputIdentifier, Locale locale) {
        if (dateToValidate == null) {
            String str = this.errorDatePattern;
            String upperCase = this.dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String str2 = String.format(str, Arrays.copyOf(new Object[]{upperCase}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
            return str2;
        }
        if (!this.yearRange.contains(dateToValidate.getYear())) {
            String str3 = String.format(this.errorDateOutOfYearRange, Arrays.copyOf(new Object[]{CalendarLocale_jvmKt.toLocalString$default(this.yearRange.getFirst(), 0, 0, false, 7, null), CalendarLocale_jvmKt.toLocalString$default(this.yearRange.getLast(), 0, 0, false, 7, null)}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(this, *args)");
            return str3;
        }
        SelectableDates selectableDates = this.selectableDates;
        if (!selectableDates.isSelectableYear(dateToValidate.getYear()) || !selectableDates.isSelectableDate(dateToValidate.getUtcTimeMillis())) {
            String str4 = String.format(this.errorInvalidNotAllowed, Arrays.copyOf(new Object[]{DatePickerFormatter.formatDate$default(this.dateFormatter, Long.valueOf(dateToValidate.getUtcTimeMillis()), locale, false, 4, null)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(this, *args)");
            return str4;
        }
        InputIdentifier.Companion companion = InputIdentifier.INSTANCE;
        if (InputIdentifier.m5875equalsimpl0(inputIdentifier, companion.m5878getStartDateInputJ2x2o4M())) {
            long utcTimeMillis = dateToValidate.getUtcTimeMillis();
            Long l = this.currentEndDateMillis;
            if (utcTimeMillis < (l != null ? l.longValue() : Long.MAX_VALUE)) {
                if (InputIdentifier.m5875equalsimpl0(inputIdentifier, companion.m5876getEndDateInputJ2x2o4M())) {
                    long utcTimeMillis2 = dateToValidate.getUtcTimeMillis();
                    Long l2 = this.currentStartDateMillis;
                    if (utcTimeMillis2 >= (l2 != null ? l2.longValue() : Long.MIN_VALUE)) {
                        return "";
                    }
                } else {
                    return "";
                }
            }
        }
        return this.errorInvalidRangeInput;
    }
}
