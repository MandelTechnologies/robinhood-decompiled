package com.robinhood.analytics;

import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/DebugEventLogger;", "", "events", "Lio/reactivex/Observable;", "Lcom/robinhood/analytics/DebugEventLogger$DebugEvent;", "getEvents", "()Lio/reactivex/Observable;", "DebugEvent", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface DebugEventLogger {
    Observable<DebugEvent> getEvents();

    /* compiled from: DebugEventLogger.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/analytics/DebugEventLogger$DebugEvent;", "", "serializedJsonValue", "", "", "timestamp", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getSerializedJsonValue", "()Ljava/util/Map;", "getTimestamp", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-eventlogger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DebugEvent {
        private final Map<String, ?> serializedJsonValue;
        private final String timestamp;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DebugEvent copy$default(DebugEvent debugEvent, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = debugEvent.serializedJsonValue;
            }
            if ((i & 2) != 0) {
                str = debugEvent.timestamp;
            }
            return debugEvent.copy(map, str);
        }

        public final Map<String, ?> component1() {
            return this.serializedJsonValue;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        public final DebugEvent copy(Map<String, ?> serializedJsonValue, String timestamp) {
            Intrinsics.checkNotNullParameter(serializedJsonValue, "serializedJsonValue");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new DebugEvent(serializedJsonValue, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DebugEvent)) {
                return false;
            }
            DebugEvent debugEvent = (DebugEvent) other;
            return Intrinsics.areEqual(this.serializedJsonValue, debugEvent.serializedJsonValue) && Intrinsics.areEqual(this.timestamp, debugEvent.timestamp);
        }

        public int hashCode() {
            return (this.serializedJsonValue.hashCode() * 31) + this.timestamp.hashCode();
        }

        public String toString() {
            return "DebugEvent(serializedJsonValue=" + this.serializedJsonValue + ", timestamp=" + this.timestamp + ")";
        }

        public DebugEvent(Map<String, ?> serializedJsonValue, String timestamp) {
            Intrinsics.checkNotNullParameter(serializedJsonValue, "serializedJsonValue");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.serializedJsonValue = serializedJsonValue;
            this.timestamp = timestamp;
        }

        public final Map<String, ?> getSerializedJsonValue() {
            return this.serializedJsonValue;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }
    }
}
