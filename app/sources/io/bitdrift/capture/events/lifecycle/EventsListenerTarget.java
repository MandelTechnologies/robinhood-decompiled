package io.bitdrift.capture.events.lifecycle;

import io.bitdrift.capture.IEventsListenerTarget;
import io.bitdrift.capture.events.IEventListenerLogger;
import io.bitdrift.capture.events.SafeEventListenerLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventsListenerTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/events/lifecycle/EventsListenerTarget;", "Lio/bitdrift/capture/IEventsListenerTarget;", "()V", "listeners", "", "Lio/bitdrift/capture/events/IEventListenerLogger;", "add", "", "eventListener", "start", "stop", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class EventsListenerTarget implements IEventsListenerTarget {
    private List<IEventListenerLogger> listeners = new ArrayList();

    public final void add(IEventListenerLogger eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.listeners.add(new SafeEventListenerLogger(eventListener));
    }

    @Override // io.bitdrift.capture.IEventsListenerTarget
    public void start() {
        Iterator<IEventListenerLogger> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    @Override // io.bitdrift.capture.IEventsListenerTarget
    public void stop() {
        Iterator<IEventListenerLogger> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
    }
}
