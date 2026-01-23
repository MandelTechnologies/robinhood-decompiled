package kotlinx.datetime;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.datetime.format.DateTimeComponents;
import kotlinx.datetime.format.DateTimeFormat;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import p479j$.time.Clock;
import p479j$.time.DateTimeException;

/* compiled from: Instant.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\bR\u0011\u0010%\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m3636d2 = {"Lkotlinx/datetime/Instant;", "", "j$/time/Instant", "value", "<init>", "(Lj$/time/Instant;)V", "", "toEpochMilliseconds", "()J", "Lkotlin/time/Duration;", "duration", "plus-LRDsOJo", "(J)Lkotlinx/datetime/Instant;", "plus", "minus-LRDsOJo", "minus", "other", "minus-5sfh64U", "(Lkotlinx/datetime/Instant;)J", "", "compareTo", "(Lkotlinx/datetime/Instant;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lj$/time/Instant;", "getValue$kotlinx_datetime", "()Lj$/time/Instant;", "getEpochSeconds", "epochSeconds", "getNanosecondsOfSecond", "nanosecondsOfSecond", "Companion", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = InstantSerializers.class)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class Instant implements Comparable<Instant> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Instant DISTANT_FUTURE;
    private static final Instant DISTANT_PAST;
    private static final Instant MAX;
    private static final Instant MIN;
    private final p479j$.time.Instant value;

    public Instant(p479j$.time.Instant value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final p479j$.time.Instant getValue() {
        return this.value;
    }

    public final long getEpochSeconds() {
        return this.value.getEpochSecond();
    }

    public final int getNanosecondsOfSecond() {
        return this.value.getNano();
    }

    public final long toEpochMilliseconds() {
        try {
            return this.value.toEpochMilli();
        } catch (ArithmeticException unused) {
            return this.value.isAfter(p479j$.time.Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m28851minusLRDsOJo(long duration) {
        return m28852plusLRDsOJo(Duration.m28762unaryMinusUwyO8pc(duration));
    }

    /* renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m28850minus5sfh64U(Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m28755plusLRDsOJo(Duration3.toDuration(this.value.getEpochSecond() - other.value.getEpochSecond(), DurationUnitJvm.SECONDS), Duration3.toDuration(this.value.getNano() - other.value.getNano(), DurationUnitJvm.NANOSECONDS));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.value.compareTo(other.value);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof Instant) && Intrinsics.areEqual(this.value, ((Instant) other).value);
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

    /* compiled from: Instant.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0006R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0006R\u001a\u0010 \u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0006R\u001a\u0010\"\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0006¨\u0006$"}, m3636d2 = {"Lkotlinx/datetime/Instant$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/Instant;", "now", "()Lkotlinx/datetime/Instant;", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/Instant;", "", "isoString", "(Ljava/lang/String;)Lkotlinx/datetime/Instant;", "", "epochSeconds", "nanosecondAdjustment", "fromEpochSeconds", "(JJ)Lkotlinx/datetime/Instant;", "", "(JI)Lkotlinx/datetime/Instant;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "DISTANT_PAST", "Lkotlinx/datetime/Instant;", "getDISTANT_PAST", "DISTANT_FUTURE", "getDISTANT_FUTURE", "MIN", "getMIN$kotlinx_datetime", "MAX", "getMAX$kotlinx_datetime", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Instant> serializer() {
            return InstantSerializers.INSTANCE;
        }

        @Deprecated
        public final Instant now() {
            p479j$.time.Instant instant = Clock.systemUTC().instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            return new Instant(instant);
        }

        public final Instant parse(CharSequence input, DateTimeFormat<DateTimeComponents> format2) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(format2, "format");
            try {
                return format2.parse(input).toInstantUsingOffset();
            } catch (IllegalArgumentException e) {
                throw new DateTimeFormatException("Failed to parse an instant from '" + ((Object) input) + '\'', e);
            }
        }

        @Deprecated
        public final /* synthetic */ Instant parse(String isoString) {
            Intrinsics.checkNotNullParameter(isoString, "isoString");
            return parse$default(this, isoString, null, 2, null);
        }

        public static /* synthetic */ Instant fromEpochSeconds$default(Companion companion, long j, long j2, int i, Object obj) {
            if ((i & 2) != 0) {
                j2 = 0;
            }
            return companion.fromEpochSeconds(j, j2);
        }

        public final Instant fromEpochSeconds(long epochSeconds, long nanosecondAdjustment) throws Exception {
            try {
                p479j$.time.Instant instantOfEpochSecond = p479j$.time.Instant.ofEpochSecond(epochSeconds, nanosecondAdjustment);
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                return new Instant(instantOfEpochSecond);
            } catch (Exception e) {
                if ((e instanceof ArithmeticException) || (e instanceof DateTimeException)) {
                    return epochSeconds > 0 ? getMAX$kotlinx_datetime() : getMIN$kotlinx_datetime();
                }
                throw e;
            }
        }

        public final Instant fromEpochSeconds(long epochSeconds, int nanosecondAdjustment) {
            return fromEpochSeconds(epochSeconds, nanosecondAdjustment);
        }

        public final Instant getDISTANT_PAST() {
            return Instant.DISTANT_PAST;
        }

        public final Instant getDISTANT_FUTURE() {
            return Instant.DISTANT_FUTURE;
        }

        public final Instant getMIN$kotlinx_datetime() {
            return Instant.MIN;
        }

        public final Instant getMAX$kotlinx_datetime() {
            return Instant.MAX;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Instant parse$default(Companion companion, CharSequence charSequence, DateTimeFormat dateTimeFormat, int i, Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = DateTimeComponents.Formats.INSTANCE.getISO_DATE_TIME_OFFSET();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }
    }

    static {
        p479j$.time.Instant instantOfEpochSecond = p479j$.time.Instant.ofEpochSecond(-3217862419201L, 999999999L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        DISTANT_PAST = new Instant(instantOfEpochSecond);
        p479j$.time.Instant instantOfEpochSecond2 = p479j$.time.Instant.ofEpochSecond(3093527980800L, 0L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
        DISTANT_FUTURE = new Instant(instantOfEpochSecond2);
        p479j$.time.Instant MIN2 = p479j$.time.Instant.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN2, "MIN");
        MIN = new Instant(MIN2);
        p479j$.time.Instant MAX2 = p479j$.time.Instant.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX2, "MAX");
        MAX = new Instant(MAX2);
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m28852plusLRDsOJo(long duration) throws Exception {
        try {
            p479j$.time.Instant instantPlusNanos = this.value.plusSeconds(Duration.m28741getInWholeSecondsimpl(duration)).plusNanos(Duration.m28743getNanosecondsComponentimpl(duration));
            Intrinsics.checkNotNullExpressionValue(instantPlusNanos, "plusNanos(...)");
            return new Instant(instantPlusNanos);
        } catch (Exception e) {
            if ((e instanceof ArithmeticException) || (e instanceof DateTimeException)) {
                return Duration.m28753isPositiveimpl(duration) ? MAX : MIN;
            }
            throw e;
        }
    }
}
