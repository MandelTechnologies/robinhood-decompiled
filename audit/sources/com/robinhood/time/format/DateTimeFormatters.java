package com.robinhood.time.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeParseException;
import p479j$.time.temporal.TemporalQuery;

/* compiled from: DateTimeFormatters.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"", "T", "j$/time/format/DateTimeFormatter", "", "text", "j$/time/temporal/TemporalQuery", "query", "parseOrNull", "(Lj$/time/format/DateTimeFormatter;Ljava/lang/CharSequence;Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;", "lib-time"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.time.format.DateTimeFormattersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class DateTimeFormatters {
    public static final <T> T parseOrNull(DateTimeFormatter dateTimeFormatter, CharSequence text, TemporalQuery<T> query) {
        Intrinsics.checkNotNullParameter(dateTimeFormatter, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(query, "query");
        try {
            return (T) dateTimeFormatter.parse(text, query);
        } catch (DateTimeParseException unused) {
            return null;
        }
    }
}
