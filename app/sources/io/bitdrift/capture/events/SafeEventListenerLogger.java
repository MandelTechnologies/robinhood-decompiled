package io.bitdrift.capture.events;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafeEventListenerLogger.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/events/SafeEventListenerLogger;", "Lio/bitdrift/capture/events/IEventListenerLogger;", "listenerLogger", "(Lio/bitdrift/capture/events/IEventListenerLogger;)V", "isListening", "Ljava/util/concurrent/atomic/AtomicBoolean;", "start", "", "stop", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SafeEventListenerLogger implements IEventListenerLogger {
    private final AtomicBoolean isListening;
    private final IEventListenerLogger listenerLogger;

    public SafeEventListenerLogger(IEventListenerLogger listenerLogger) {
        Intrinsics.checkNotNullParameter(listenerLogger, "listenerLogger");
        this.listenerLogger = listenerLogger;
        this.isListening = new AtomicBoolean(false);
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public synchronized void start() {
        if (!this.isListening.getAndSet(true)) {
            this.listenerLogger.start();
        }
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public synchronized void stop() {
        if (this.isListening.getAndSet(false)) {
            this.listenerLogger.stop();
        }
    }
}
