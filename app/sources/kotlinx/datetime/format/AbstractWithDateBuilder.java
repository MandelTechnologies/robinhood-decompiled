package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.internal.format.BasicFormatStructure;
import kotlinx.datetime.internal.format.FormatStructure;

/* compiled from: LocalDateFormat.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/datetime/format/AbstractWithDateBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/DateFieldContainer;", "structure", "", "addFormatStructureForDate", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface AbstractWithDateBuilder extends DateTimeFormatBuilder.WithDate {
    void addFormatStructureForDate(FormatStructure<? super DateFieldContainer> structure);

    /* compiled from: LocalDateFormat.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void year(AbstractWithDateBuilder abstractWithDateBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithDateBuilder.addFormatStructureForDate(new BasicFormatStructure(new YearDirective(padding, false, 2, null)));
        }

        public static void monthNumber(AbstractWithDateBuilder abstractWithDateBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithDateBuilder.addFormatStructureForDate(new BasicFormatStructure(new MonthDirective(padding)));
        }

        public static void monthName(AbstractWithDateBuilder abstractWithDateBuilder, MonthNames names) {
            Intrinsics.checkNotNullParameter(names, "names");
            abstractWithDateBuilder.addFormatStructureForDate(new BasicFormatStructure(new MonthNameDirective(names)));
        }

        public static void dayOfMonth(AbstractWithDateBuilder abstractWithDateBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithDateBuilder.addFormatStructureForDate(new BasicFormatStructure(new DayDirective(padding)));
        }

        public static void dayOfWeek(AbstractWithDateBuilder abstractWithDateBuilder, DayOfWeekNames names) {
            Intrinsics.checkNotNullParameter(names, "names");
            abstractWithDateBuilder.addFormatStructureForDate(new BasicFormatStructure(new DayOfWeekDirective(names)));
        }

        public static void date(AbstractWithDateBuilder abstractWithDateBuilder, DateTimeFormat<LocalDate> format2) {
            Intrinsics.checkNotNullParameter(format2, "format");
            if (format2 instanceof LocalDateFormat) {
                abstractWithDateBuilder.addFormatStructureForDate(((LocalDateFormat) format2).getActualFormat());
            }
        }
    }
}
