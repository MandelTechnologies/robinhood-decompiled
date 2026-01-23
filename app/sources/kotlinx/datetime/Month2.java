package kotlinx.datetime;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Month;

/* compiled from: Month.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"", InquiryField.FloatField.TYPE2, "j$/time/Month", "Lkotlinx/datetime/Month;", "Month", "(I)Lj$/time/Month;", "getNumber", "(Lj$/time/Month;)I", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.MonthKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Month2 {

    /* compiled from: Month.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.MonthKt$EntriesMappings */
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ EnumEntries<Month> entries$0 = EnumEntries2.enumEntries(Month.values());
    }

    public static final int getNumber(Month month) {
        Intrinsics.checkNotNullParameter(month, "<this>");
        return month.ordinal() + 1;
    }

    public static final Month Month(int i) {
        if (1 > i || i >= 13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return EntriesMappings.entries$0.get(i - 1);
    }
}
