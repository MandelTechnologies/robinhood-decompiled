package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.format.DateTimeFormat;
import kotlinx.datetime.format.LocalTimeFormatKt;
import kotlinx.datetime.serializers.LocalTimeSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import p479j$.time.DateTimeException;
import p479j$.time.format.DateTimeParseException;

/* compiled from: LocalTime.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001c\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B-\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"Lkotlinx/datetime/LocalTime;", "", "j$/time/LocalTime", "value", "<init>", "(Lj$/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "toSecondOfDay", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalTime;)I", "Lj$/time/LocalTime;", "getValue$kotlinx_datetime", "()Lj$/time/LocalTime;", "Companion", "Formats", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = LocalTimeSerializers.class)
/* loaded from: classes14.dex */
public final class LocalTime implements Comparable<LocalTime> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final LocalTime MAX;
    private static final LocalTime MIN;
    private final p479j$.time.LocalTime value;

    public LocalTime(p479j$.time.LocalTime value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final p479j$.time.LocalTime getValue() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalTime(int i, int i2, int i3, int i4) {
        try {
            p479j$.time.LocalTime localTimeM3409of = p479j$.time.LocalTime.m3409of(i, i2, i3, i4);
            Intrinsics.checkNotNull(localTimeM3409of);
            this(localTimeM3409of);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final int toSecondOfDay() {
        return this.value.toSecondOfDay();
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalTime) && Intrinsics.areEqual(this.value, ((LocalTime) other).value);
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
    public int compareTo(LocalTime other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo(other.value);
    }

    /* compiled from: LocalTime.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/datetime/LocalTime$Companion;", "", "<init>", "()V", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalTime;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/LocalTime;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocalTime> serializer() {
            return LocalTimeSerializers.INSTANCE;
        }

        public final LocalTime parse(CharSequence input, DateTimeFormat<LocalTime> format2) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format2, "format");
            if (format2 == Formats.INSTANCE.getISO()) {
                try {
                    return new LocalTime(p479j$.time.LocalTime.parse(input));
                } catch (DateTimeParseException e) {
                    throw new DateTimeFormatException(e);
                }
            }
            return format2.parse(input);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocalTime parse$default(Companion companion, CharSequence charSequence, DateTimeFormat dateTimeFormat, int i, Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = LocalTime2.getIsoTimeFormat();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }
    }

    static {
        p479j$.time.LocalTime MIN2 = p479j$.time.LocalTime.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN2, "MIN");
        MIN = new LocalTime(MIN2);
        p479j$.time.LocalTime MAX2 = p479j$.time.LocalTime.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX2, "MAX");
        MAX = new LocalTime(MAX2);
    }

    /* compiled from: LocalTime.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/datetime/LocalTime$Formats;", "", "()V", "ISO", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalTime;", "getISO", "()Lkotlinx/datetime/format/DateTimeFormat;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Formats {
        public static final Formats INSTANCE = new Formats();

        private Formats() {
        }

        public final DateTimeFormat<LocalTime> getISO() {
            return LocalTimeFormatKt.getISO_TIME();
        }
    }
}
