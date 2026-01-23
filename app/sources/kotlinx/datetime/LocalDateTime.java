package kotlinx.datetime;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.format.DateTimeFormat;
import kotlinx.datetime.format.LocalDateTimeFormat4;
import kotlinx.datetime.internal.UtilKt;
import kotlinx.datetime.serializers.LocalDateTimeSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import p479j$.time.DateTimeException;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.format.DateTimeParseException;

/* compiled from: LocalDateTime.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002+,B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BE\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b#\u0010\u001aR\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010\u001aR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0011\u0010\f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, m3636d2 = {"Lkotlinx/datetime/LocalDateTime;", "", "j$/time/LocalDateTime", "value", "<init>", "(Lj$/time/LocalDateTime;)V", "", "year", "monthNumber", "dayOfMonth", "hour", "minute", "second", "nanosecond", "(IIIIIII)V", "Lkotlinx/datetime/LocalDate;", InquiryField.DateField.TYPE, "Lkotlinx/datetime/LocalTime;", "time", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalTime;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDateTime;)I", "Lj$/time/LocalDateTime;", "getValue$kotlinx_datetime", "()Lj$/time/LocalDateTime;", "getYear", "getMonthNumber", "getHour", "getMinute", "getSecond", "getNanosecond", "getDate", "()Lkotlinx/datetime/LocalDate;", "Companion", "Formats", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = LocalDateTimeSerializers.class)
/* loaded from: classes14.dex */
public final class LocalDateTime implements Comparable<LocalDateTime> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LocalDateTime MAX;
    private static final LocalDateTime MIN;
    private final p479j$.time.LocalDateTime value;

    public LocalDateTime(p479j$.time.LocalDateTime value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final p479j$.time.LocalDateTime getValue() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            p479j$.time.LocalDateTime localDateTimeM3392of = p479j$.time.LocalDateTime.m3392of(i, i2, i3, i4, i5, i6, i7);
            Intrinsics.checkNotNull(localDateTimeM3392of);
            this(localDateTimeM3392of);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDateTime(LocalDate date, LocalTime time) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        p479j$.time.LocalDateTime localDateTimeM3393of = p479j$.time.LocalDateTime.m3393of(date.getValue(), time.getValue());
        Intrinsics.checkNotNullExpressionValue(localDateTimeM3393of, "of(...)");
        this(localDateTimeM3393of);
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final LocalDate getDate() {
        p479j$.time.LocalDate localDateMo3394a = this.value.mo3394a();
        Intrinsics.checkNotNullExpressionValue(localDateMo3394a, "toLocalDate(...)");
        return new LocalDate(localDateMo3394a);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalDateTime) && Intrinsics.areEqual(this.value, ((LocalDateTime) other).value);
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
    public int compareTo(LocalDateTime other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo((ChronoLocalDateTime<?>) other.value);
    }

    /* compiled from: LocalDateTime.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/datetime/LocalDateTime$Companion;", "", "<init>", "()V", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocalDateTime> serializer() {
            return LocalDateTimeSerializers.INSTANCE;
        }

        public final LocalDateTime parse(CharSequence input, DateTimeFormat<LocalDateTime> format2) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format2, "format");
            if (format2 == Formats.INSTANCE.getISO()) {
                try {
                    return new LocalDateTime(p479j$.time.LocalDateTime.parse(UtilKt.removeLeadingZerosFromLongYearFormLocalDateTime(input.toString())));
                } catch (DateTimeParseException e) {
                    throw new DateTimeFormatException(e);
                }
            }
            return format2.parse(input);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalDateTime parse$default(Companion companion, CharSequence charSequence, DateTimeFormat dateTimeFormat, int i, Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = LocalDateTime2.getIsoDateTimeFormat();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }
    }

    static {
        p479j$.time.LocalDateTime MIN2 = p479j$.time.LocalDateTime.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN2, "MIN");
        MIN = new LocalDateTime(MIN2);
        p479j$.time.LocalDateTime MAX2 = p479j$.time.LocalDateTime.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX2, "MAX");
        MAX = new LocalDateTime(MAX2);
    }

    /* compiled from: LocalDateTime.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/datetime/LocalDateTime$Formats;", "", "()V", "ISO", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", "getISO", "()Lkotlinx/datetime/format/DateTimeFormat;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Formats {
        public static final Formats INSTANCE = new Formats();
        private static final DateTimeFormat<LocalDateTime> ISO = LocalDateTimeFormat4.getISO_DATETIME();

        private Formats() {
        }

        public final DateTimeFormat<LocalDateTime> getISO() {
            return ISO;
        }
    }
}
