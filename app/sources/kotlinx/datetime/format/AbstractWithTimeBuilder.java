package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.internal.format.BasicFormatStructure;
import kotlinx.datetime.internal.format.FormatStructure;

/* compiled from: LocalTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/datetime/format/AbstractWithTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/TimeFieldContainer;", "structure", "", "addFormatStructureForTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface AbstractWithTimeBuilder extends DateTimeFormatBuilder.WithTime {
    void addFormatStructureForTime(FormatStructure<? super TimeFieldContainer> structure);

    /* compiled from: LocalTimeFormat.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void hour(AbstractWithTimeBuilder abstractWithTimeBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithTimeBuilder.addFormatStructureForTime(new BasicFormatStructure(new HourDirective(padding)));
        }

        public static void minute(AbstractWithTimeBuilder abstractWithTimeBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithTimeBuilder.addFormatStructureForTime(new BasicFormatStructure(new MinuteDirective(padding)));
        }

        public static void second(AbstractWithTimeBuilder abstractWithTimeBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithTimeBuilder.addFormatStructureForTime(new BasicFormatStructure(new SecondDirective(padding)));
        }

        public static void secondFraction(AbstractWithTimeBuilder abstractWithTimeBuilder, int i, int i2) {
            abstractWithTimeBuilder.addFormatStructureForTime(new BasicFormatStructure(new FractionalSecondDirective(i, i2, null, 4, null)));
        }

        public static void time(AbstractWithTimeBuilder abstractWithTimeBuilder, DateTimeFormat<LocalTime> format2) {
            Intrinsics.checkNotNullParameter(format2, "format");
            if (format2 instanceof LocalTimeFormat) {
                abstractWithTimeBuilder.addFormatStructureForTime(((LocalTimeFormat) format2).getActualFormat());
            }
        }
    }
}
