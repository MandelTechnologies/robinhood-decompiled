package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.AbstractWithDateBuilder;
import kotlinx.datetime.format.AbstractWithTimeBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.internal.format.FormatStructure;

/* compiled from: LocalDateTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/format/AbstractWithDateBuilder;", "Lkotlinx/datetime/format/AbstractWithTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "Lkotlinx/datetime/internal/format/FormatStructure;", "", "structure", "", "addFormatStructureForDateTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.format.AbstractWithDateTimeBuilder, reason: use source file name */
/* loaded from: classes14.dex */
public interface LocalDateTimeFormat2 extends AbstractWithDateBuilder, AbstractWithTimeBuilder, DateTimeFormatBuilder.WithDateTime {
    void addFormatStructureForDateTime(FormatStructure<Object> structure);

    /* compiled from: LocalDateTimeFormat.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.format.AbstractWithDateTimeBuilder$DefaultImpls */
    public static final class DefaultImpls {
        public static void date(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat<LocalDate> format2) {
            Intrinsics.checkNotNullParameter(format2, "format");
            AbstractWithDateBuilder.DefaultImpls.date(localDateTimeFormat2, format2);
        }

        public static void dayOfMonth(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            AbstractWithDateBuilder.DefaultImpls.dayOfMonth(localDateTimeFormat2, padding);
        }

        public static void dayOfWeek(LocalDateTimeFormat2 localDateTimeFormat2, DayOfWeekNames names) {
            Intrinsics.checkNotNullParameter(names, "names");
            AbstractWithDateBuilder.DefaultImpls.dayOfWeek(localDateTimeFormat2, names);
        }

        public static void hour(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            AbstractWithTimeBuilder.DefaultImpls.hour(localDateTimeFormat2, padding);
        }

        public static void minute(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            AbstractWithTimeBuilder.DefaultImpls.minute(localDateTimeFormat2, padding);
        }

        public static void monthName(LocalDateTimeFormat2 localDateTimeFormat2, MonthNames names) {
            Intrinsics.checkNotNullParameter(names, "names");
            AbstractWithDateBuilder.DefaultImpls.monthName(localDateTimeFormat2, names);
        }

        public static void monthNumber(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            AbstractWithDateBuilder.DefaultImpls.monthNumber(localDateTimeFormat2, padding);
        }

        public static void second(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            AbstractWithTimeBuilder.DefaultImpls.second(localDateTimeFormat2, padding);
        }

        public static void secondFraction(LocalDateTimeFormat2 localDateTimeFormat2, int i, int i2) {
            AbstractWithTimeBuilder.DefaultImpls.secondFraction(localDateTimeFormat2, i, i2);
        }

        public static void time(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat<LocalTime> format2) {
            Intrinsics.checkNotNullParameter(format2, "format");
            AbstractWithTimeBuilder.DefaultImpls.time(localDateTimeFormat2, format2);
        }

        public static void year(LocalDateTimeFormat2 localDateTimeFormat2, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            AbstractWithDateBuilder.DefaultImpls.year(localDateTimeFormat2, padding);
        }

        public static void addFormatStructureForDate(LocalDateTimeFormat2 localDateTimeFormat2, FormatStructure<? super DateFieldContainer> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            localDateTimeFormat2.addFormatStructureForDateTime(structure);
        }

        public static void addFormatStructureForTime(LocalDateTimeFormat2 localDateTimeFormat2, FormatStructure<? super TimeFieldContainer> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            localDateTimeFormat2.addFormatStructureForDateTime(structure);
        }
    }
}
