package com.robinhood.android.diagnostics.event;

import kotlin.Metadata;

/* compiled from: DiagnosticEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventLogger;", "", "send", "", "event", "Lcom/robinhood/android/diagnostics/event/DiagnosticEvent;", "shutDown", "throwable", "", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface DiagnosticEventLogger {
    void send(DiagnosticEvent event);

    void shutDown(Throwable throwable);
}
