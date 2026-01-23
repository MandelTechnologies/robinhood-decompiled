package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.util.Objects;
import java.io.IOException;

/* loaded from: classes21.dex */
public abstract class RRWebEvent {
    private long timestamp;

    /* renamed from: type, reason: collision with root package name */
    private RRWebEventType f10723type;

    protected RRWebEvent(RRWebEventType rRWebEventType) {
        this.f10723type = rRWebEventType;
        this.timestamp = System.currentTimeMillis();
    }

    protected RRWebEvent() {
        this(RRWebEventType.Custom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RRWebEvent)) {
            return false;
        }
        RRWebEvent rRWebEvent = (RRWebEvent) obj;
        return this.timestamp == rRWebEvent.timestamp && this.f10723type == rRWebEvent.f10723type;
    }

    public int hashCode() {
        return Objects.hash(this.f10723type, Long.valueOf(this.timestamp));
    }

    /* loaded from: classes14.dex */
    public static final class Serializer {
        public void serialize(RRWebEvent rRWebEvent, ObjectWriter objectWriter, ILogger iLogger) throws IOException {
            objectWriter.name("type").value(iLogger, rRWebEvent.f10723type);
            objectWriter.name("timestamp").value(rRWebEvent.timestamp);
        }
    }

    /* loaded from: classes14.dex */
    public static final class Deserializer {
        public boolean deserializeValue(RRWebEvent rRWebEvent, String str, ObjectReader objectReader, ILogger iLogger) throws Exception {
            str.getClass();
            if (str.equals("type")) {
                rRWebEvent.f10723type = (RRWebEventType) Objects.requireNonNull((RRWebEventType) objectReader.nextOrNull(iLogger, new RRWebEventType.Deserializer()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            rRWebEvent.timestamp = objectReader.nextLong();
            return true;
        }
    }
}
