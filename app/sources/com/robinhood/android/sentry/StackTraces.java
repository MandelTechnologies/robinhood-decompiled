package com.robinhood.android.sentry;

import io.sentry.SentryEvent;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: StackTraces.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"stackTraceToString", "", "Lio/sentry/SentryEvent;", "lib-sentry_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.sentry.StackTracesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class StackTraces {
    public static final String stackTraceToString(SentryEvent sentryEvent) {
        Intrinsics.checkNotNullParameter(sentryEvent, "<this>");
        StringBuilder sb = new StringBuilder();
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions == null) {
            exceptions = CollectionsKt.emptyList();
        }
        int i = 0;
        for (SentryException sentryException : exceptions) {
            int i2 = i + 1;
            if (i != 0) {
                sb.append("Caused by: ");
            }
            sb.append(sentryException.getModule());
            sb.append('.');
            sb.append(sentryException.getType());
            String value = sentryException.getValue();
            if (value != null) {
                if (value.length() <= 0) {
                    value = null;
                }
                if (value != null) {
                    sb.append(": ");
                    sb.append(value);
                }
            }
            sb.append('\n');
            SentryStackTrace stacktrace = sentryException.getStacktrace();
            List<SentryStackFrame> frames = stacktrace != null ? stacktrace.getFrames() : null;
            if (frames == null) {
                frames = CollectionsKt.emptyList();
            }
            for (SentryStackFrame sentryStackFrame : CollectionsKt.asReversed(frames)) {
                sb.append("    at ");
                sb.append(sentryStackFrame.getModule());
                sb.append('.');
                sb.append(sentryStackFrame.getFunction());
                sb.append('(');
                if (Intrinsics.areEqual(sentryStackFrame.isNative(), Boolean.TRUE)) {
                    sb.append("Native Method");
                } else {
                    String filename = sentryStackFrame.getFilename();
                    if (filename == null) {
                        filename = "Unknown Source";
                    }
                    sb.append(filename);
                    Integer lineno = sentryStackFrame.getLineno();
                    if (lineno != null) {
                        if (lineno.intValue() == 0) {
                            lineno = null;
                        }
                        if (lineno != null) {
                            int iIntValue = lineno.intValue();
                            sb.append(':');
                            sb.append(iIntValue);
                        }
                    }
                }
                sb.append(')');
                sb.append('\n');
            }
            i = i2;
        }
        return StringsKt.trim(sb.toString()).toString();
    }
}
