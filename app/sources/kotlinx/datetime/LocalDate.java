package kotlinx.datetime;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.format.DateTimeFormat;
import kotlinx.datetime.format.LocalDateFormatKt;
import kotlinx.datetime.internal.UtilKt;
import kotlinx.datetime.internal.math3;
import kotlinx.datetime.serializers.LocalDateSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import p479j$.time.DateTimeException;
import p479j$.time.DayOfWeek;
import p479j$.time.Month;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.format.DateTimeParseException;

/* compiled from: LocalDate.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002)*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nB%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0015\u0010\r\u001a\u00060\u000bj\u0002`\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010\u0015R\u0015\u0010(\u001a\u00060$j\u0002`%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Lkotlinx/datetime/LocalDate;", "", "j$/time/LocalDate", "value", "<init>", "(Lj$/time/LocalDate;)V", "", "year", "monthNumber", "dayOfMonth", "(III)V", "j$/time/Month", "Lkotlinx/datetime/Month;", ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, "(ILj$/time/Month;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDate;)I", "toEpochDays", "Lj$/time/LocalDate;", "getValue$kotlinx_datetime", "()Lj$/time/LocalDate;", "getYear", "getMonthNumber", "getMonth", "()Lj$/time/Month;", "getDayOfMonth", "j$/time/DayOfWeek", "Lkotlinx/datetime/DayOfWeek;", "getDayOfWeek", "()Lj$/time/DayOfWeek;", "dayOfWeek", "Companion", "Formats", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = LocalDateSerializers.class)
/* loaded from: classes14.dex */
public final class LocalDate implements Comparable<LocalDate> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LocalDate MAX;
    private static final LocalDate MIN;
    private final p479j$.time.LocalDate value;

    public LocalDate(p479j$.time.LocalDate value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* compiled from: LocalDate.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/datetime/LocalDate$Companion;", "", "<init>", "()V", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/LocalDate;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocalDate> serializer() {
            return LocalDateSerializers.INSTANCE;
        }

        public final LocalDate parse(CharSequence input, DateTimeFormat<LocalDate> format2) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format2, "format");
            if (format2 == Formats.INSTANCE.getISO()) {
                try {
                    return new LocalDate(p479j$.time.LocalDate.parse(UtilKt.removeLeadingZerosFromLongYearFormLocalDate(input.toString())));
                } catch (DateTimeParseException e) {
                    throw new DateTimeFormatException(e);
                }
            }
            return format2.parse(input);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalDate parse$default(Companion companion, CharSequence charSequence, DateTimeFormat dateTimeFormat, int i, Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = LocalDate3.getIsoDateFormat();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }
    }

    /* renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final p479j$.time.LocalDate getValue() {
        return this.value;
    }

    static {
        p479j$.time.LocalDate MIN2 = p479j$.time.LocalDate.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN2, "MIN");
        MIN = new LocalDate(MIN2);
        p479j$.time.LocalDate MAX2 = p479j$.time.LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX2, "MAX");
        MAX = new LocalDate(MAX2);
    }

    /* compiled from: LocalDate.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\f"}, m3636d2 = {"Lkotlinx/datetime/LocalDate$Formats;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "ISO_BASIC", "Lkotlinx/datetime/format/DateTimeFormat;", "getISO_BASIC", "()Lkotlinx/datetime/format/DateTimeFormat;", "getISO", "ISO", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Formats {
        public static final Formats INSTANCE = new Formats();
        private static final DateTimeFormat<LocalDate> ISO_BASIC = LocalDateFormatKt.getISO_DATE_BASIC();

        private Formats() {
        }

        public final DateTimeFormat<LocalDate> getISO() {
            return LocalDateFormatKt.getISO_DATE();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDate(int i, int i2, int i3) {
        try {
            p479j$.time.LocalDate localDateM3377of = p479j$.time.LocalDate.m3377of(i, i2, i3);
            Intrinsics.checkNotNull(localDateM3377of);
            this(localDateM3377of);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDate(int i, Month month, int i2) {
        this(i, Month2.getNumber(month), i2);
        Intrinsics.checkNotNullParameter(month, "month");
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    public final Month getMonth() {
        Month month = this.value.getMonth();
        Intrinsics.checkNotNullExpressionValue(month, "getMonth(...)");
        return month;
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    public final DayOfWeek getDayOfWeek() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        Intrinsics.checkNotNullExpressionValue(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalDate) && Intrinsics.areEqual(this.value, ((LocalDate) other).value);
        }
        return true;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String string2 = this.value.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalDate other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo((ChronoLocalDate) other.value);
    }

    public final int toEpochDays() {
        return math3.clampToInt(this.value.toEpochDay());
    }
}
