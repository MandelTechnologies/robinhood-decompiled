package kotlinx.datetime;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.format.DateTimeFormat;

/* compiled from: LocalDate.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "getIsoDateFormat", "()Lkotlinx/datetime/format/DateTimeFormat;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.LocalDateKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class LocalDate3 {
    public static final DateTimeFormat<LocalDate> getIsoDateFormat() {
        return LocalDate.Formats.INSTANCE.getISO();
    }
}
