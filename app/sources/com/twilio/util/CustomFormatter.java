package com.twilio.util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: CustomFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/twilio/util/CustomFormatter;", "Ljava/util/logging/Formatter;", "()V", "format", "", "record", "Ljava/util/logging/LogRecord;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class CustomFormatter extends Formatter {
    private final String format = "[%1$s][%2$s] %3$s: %4$s%5$s%n";

    @Override // java.util.logging.Formatter
    public synchronized String format(LogRecord record) {
        String str;
        String str2;
        try {
            Intrinsics.checkNotNullParameter(record, "record");
            String string2 = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z").format(new Date(record.getMillis())).toString();
            long id = Thread.currentThread().getId();
            String message = formatMessage(record);
            Throwable thrown = record.getThrown();
            if (thrown != null) {
                str = ":\n" + ExceptionsKt.stackTraceToString(thrown);
                if (str == null) {
                    str = "";
                }
            } else {
                str = "";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str2 = String.format(this.format, Arrays.copyOf(new Object[]{string2, Long.valueOf(id), record.getLevel(), message, str}, 5));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        } catch (Throwable th) {
            throw th;
        }
        return str2;
    }
}
