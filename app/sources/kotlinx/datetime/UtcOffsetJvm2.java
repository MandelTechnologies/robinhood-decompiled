package kotlinx.datetime;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.DateTimeException;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalQuery;

/* compiled from: UtcOffsetJvm.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\b\u0011\u001a1\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"#\u0010\u0015\u001a\n \r*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"#\u0010\u0018\u001a\n \r*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"", "hours", "minutes", "seconds", "Lkotlinx/datetime/UtcOffset;", "UtcOffset", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/datetime/UtcOffset;", "", "input", "j$/time/format/DateTimeFormatter", "format", "parseWithFormat", "(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lkotlinx/datetime/UtcOffset;", "kotlin.jvm.PlatformType", "isoFormat$delegate", "Lkotlin/Lazy;", "getIsoFormat", "()Lj$/time/format/DateTimeFormatter;", "isoFormat", "isoBasicFormat$delegate", "getIsoBasicFormat", "isoBasicFormat", "fourDigitsFormat$delegate", "getFourDigitsFormat", "fourDigitsFormat", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.UtcOffsetJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class UtcOffsetJvm2 {
    private static final Lazy isoFormat$delegate = LazyKt.lazy(new Function0<DateTimeFormatter>() { // from class: kotlinx.datetime.UtcOffsetJvmKt$isoFormat$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    });
    private static final Lazy isoBasicFormat$delegate = LazyKt.lazy(new Function0<DateTimeFormatter>() { // from class: kotlinx.datetime.UtcOffsetJvmKt$isoBasicFormat$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    });
    private static final Lazy fourDigitsFormat$delegate = LazyKt.lazy(new Function0<DateTimeFormatter>() { // from class: kotlinx.datetime.UtcOffsetJvmKt$fourDigitsFormat$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    });

    public static final UtcOffsetJvm UtcOffset(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                return new UtcOffsetJvm(zoneOffsetOfHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                return new UtcOffsetJvm(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            Intrinsics.checkNotNullExpressionValue(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
            return new UtcOffsetJvm(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter getIsoFormat() {
        return (DateTimeFormatter) isoFormat$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter getIsoBasicFormat() {
        return (DateTimeFormatter) isoBasicFormat$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter getFourDigitsFormat() {
        return (DateTimeFormatter) fourDigitsFormat$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UtcOffsetJvm parseWithFormat(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        try {
            return new UtcOffsetJvm((ZoneOffset) dateTimeFormatter.parse(charSequence, new TemporalQuery() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda0
                @Override // p479j$.time.temporal.TemporalQuery
                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                    return ZoneOffset.from(temporalAccessor);
                }
            }));
        } catch (DateTimeException e) {
            throw new DateTimeFormatException(e);
        }
    }
}
