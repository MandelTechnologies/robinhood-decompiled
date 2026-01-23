package kotlinx.datetime.format;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffsetJvm;

/* compiled from: DateTimeFormatBuilder.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder;", "", "chars", "", "value", "", "WithDate", "WithDateTime", "WithDateTimeComponents", "WithTime", "WithUtcOffset", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface DateTimeFormatBuilder {

    /* compiled from: DateTimeFormatBuilder.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface WithDateTime extends WithDate, WithTime {
    }

    /* compiled from: DateTimeFormatBuilder.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "Lkotlinx/datetime/format/DateTimeComponentsFormat$Builder;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface WithDateTimeComponents extends WithDateTime, WithUtcOffset {
    }

    void chars(String value);

    /* compiled from: DateTimeFormatBuilder.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "Lkotlinx/datetime/format/Padding;", "padding", "", "year", "(Lkotlinx/datetime/format/Padding;)V", "monthNumber", "Lkotlinx/datetime/format/MonthNames;", "names", "monthName", "(Lkotlinx/datetime/format/MonthNames;)V", "dayOfMonth", "Lkotlinx/datetime/format/DayOfWeekNames;", "dayOfWeek", "(Lkotlinx/datetime/format/DayOfWeekNames;)V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "format", InquiryField.DateField.TYPE, "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/AbstractWithDateBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface WithDate extends DateTimeFormatBuilder {
        void date(DateTimeFormat<LocalDate> format2);

        void dayOfMonth(DateTimeFormat3 padding);

        void dayOfWeek(DayOfWeekNames names);

        void monthName(MonthNames names);

        void monthNumber(DateTimeFormat3 padding);

        void year(DateTimeFormat3 padding);

        /* compiled from: DateTimeFormatBuilder.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void year$default(WithDate withDate, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withDate.year(dateTimeFormat3);
            }

            public static /* synthetic */ void monthNumber$default(WithDate withDate, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withDate.monthNumber(dateTimeFormat3);
            }

            public static /* synthetic */ void dayOfMonth$default(WithDate withDate, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfMonth");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withDate.dayOfMonth(dateTimeFormat3);
            }
        }
    }

    /* compiled from: DateTimeFormatBuilder.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J#\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "Lkotlinx/datetime/format/Padding;", "padding", "", "hour", "(Lkotlinx/datetime/format/Padding;)V", "minute", "second", "", "minLength", "maxLength", "secondFraction", "(II)V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalTime;", "format", "time", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/AbstractWithTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface WithTime extends DateTimeFormatBuilder {
        void hour(DateTimeFormat3 padding);

        void minute(DateTimeFormat3 padding);

        void second(DateTimeFormat3 padding);

        void secondFraction(int minLength, int maxLength);

        void time(DateTimeFormat<LocalTime> format2);

        /* compiled from: DateTimeFormatBuilder.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void hour$default(WithTime withTime, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withTime.hour(dateTimeFormat3);
            }

            public static /* synthetic */ void minute$default(WithTime withTime, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withTime.minute(dateTimeFormat3);
            }

            public static /* synthetic */ void second$default(WithTime withTime, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withTime.second(dateTimeFormat3);
            }
        }
    }

    /* compiled from: DateTimeFormatBuilder.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH&\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "offset", "", "format", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/UtcOffset;", "offsetHours", "padding", "Lkotlinx/datetime/format/Padding;", "offsetMinutesOfHour", "offsetSecondsOfMinute", "Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface WithUtcOffset extends DateTimeFormatBuilder {
        void offset(DateTimeFormat<UtcOffsetJvm> format2);

        void offsetHours(DateTimeFormat3 padding);

        void offsetMinutesOfHour(DateTimeFormat3 padding);

        void offsetSecondsOfMinute(DateTimeFormat3 padding);

        /* compiled from: DateTimeFormatBuilder.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void offsetHours$default(WithUtcOffset withUtcOffset, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withUtcOffset.offsetHours(dateTimeFormat3);
            }

            public static /* synthetic */ void offsetMinutesOfHour$default(WithUtcOffset withUtcOffset, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withUtcOffset.offsetMinutesOfHour(dateTimeFormat3);
            }

            public static /* synthetic */ void offsetSecondsOfMinute$default(WithUtcOffset withUtcOffset, DateTimeFormat3 dateTimeFormat3, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
                }
                if ((i & 1) != 0) {
                    dateTimeFormat3 = DateTimeFormat3.ZERO;
                }
                withUtcOffset.offsetSecondsOfMinute(dateTimeFormat3);
            }
        }
    }
}
