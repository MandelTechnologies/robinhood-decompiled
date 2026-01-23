package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.DayOfWeek;

/* compiled from: DayOfWeek.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"", "isoDayNumber", "j$/time/DayOfWeek", "Lkotlinx/datetime/DayOfWeek;", "DayOfWeek", "(I)Lj$/time/DayOfWeek;", "getIsoDayNumber", "(Lj$/time/DayOfWeek;)I", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.DayOfWeekKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class DayOfWeek2 {

    /* compiled from: DayOfWeek.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.DayOfWeekKt$EntriesMappings */
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ EnumEntries<DayOfWeek> entries$0 = EnumEntries2.enumEntries(DayOfWeek.values());
    }

    public static final int getIsoDayNumber(DayOfWeek dayOfWeek) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "<this>");
        return dayOfWeek.ordinal() + 1;
    }

    public static final DayOfWeek DayOfWeek(int i) {
        if (1 > i || i >= 8) {
            throw new IllegalArgumentException(("Expected ISO day-of-week number in 1..7, got " + i).toString());
        }
        return EntriesMappings.entries$0.get(i - 1);
    }
}
