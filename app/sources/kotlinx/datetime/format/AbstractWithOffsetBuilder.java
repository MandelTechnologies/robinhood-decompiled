package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.UtcOffsetJvm;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.internal.format.BasicFormatStructure;
import kotlinx.datetime.internal.format.FormatStructure;
import kotlinx.datetime.internal.format.SignedFormatStructure;

/* compiled from: UtcOffsetFormat.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "structure", "", "addFormatStructureForOffset", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface AbstractWithOffsetBuilder extends DateTimeFormatBuilder.WithUtcOffset {
    void addFormatStructureForOffset(FormatStructure<? super UtcOffsetFieldContainer> structure);

    /* compiled from: UtcOffsetFormat.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void offsetHours(AbstractWithOffsetBuilder abstractWithOffsetBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithOffsetBuilder.addFormatStructureForOffset(new SignedFormatStructure(new BasicFormatStructure(new UtcOffsetWholeHoursDirective(padding)), true));
        }

        public static void offsetMinutesOfHour(AbstractWithOffsetBuilder abstractWithOffsetBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithOffsetBuilder.addFormatStructureForOffset(new BasicFormatStructure(new UtcOffsetMinuteOfHourDirective(padding)));
        }

        public static void offsetSecondsOfMinute(AbstractWithOffsetBuilder abstractWithOffsetBuilder, DateTimeFormat3 padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            abstractWithOffsetBuilder.addFormatStructureForOffset(new BasicFormatStructure(new UtcOffsetSecondOfMinuteDirective(padding)));
        }

        public static void offset(AbstractWithOffsetBuilder abstractWithOffsetBuilder, DateTimeFormat<UtcOffsetJvm> format2) {
            Intrinsics.checkNotNullParameter(format2, "format");
            if (format2 instanceof UtcOffsetFormat) {
                abstractWithOffsetBuilder.addFormatStructureForOffset(((UtcOffsetFormat) format2).getActualFormat());
            }
        }
    }
}
