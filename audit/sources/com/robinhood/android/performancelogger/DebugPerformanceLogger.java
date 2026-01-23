package com.robinhood.android.performancelogger;

import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: DebugPerformanceLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u000b2\u00020\u0001:\u0005\u0007\b\t\n\u000bR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/DebugPerformanceLogger;", "", "events", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$Event;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "Event", "MetricEvent", "SpanEvent", "EventState", "Companion", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface DebugPerformanceLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Flow<Event> getEvents();

    /* compiled from: DebugPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$Event;", "", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "getEventState", "()Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "eventState", "j$/time/Instant", "getTimestamp", "()Lj$/time/Instant;", "timestamp", "", "getFormattedName", "()Ljava/lang/String;", "formattedName", "getFormattedContext", "formattedContext", "Ljava/util/UUID;", "getContextualId", "()Ljava/util/UUID;", "contextualId", "getFormattedTimestamp", "formattedTimestamp", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$MetricEvent;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$SpanEvent;", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public interface Event {
        UUID getContextualId();

        EventState getEventState();

        String getFormattedContext();

        String getFormattedName();

        String getFormattedTimestamp();

        Instant getTimestamp();

        /* compiled from: DebugPerformanceLogger.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static UUID getContextualId(Event event) {
                return null;
            }

            public static String getFormattedTimestamp(Event event) {
                String str = Companion.formatter.format(event.getTimestamp());
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }
        }
    }

    /* compiled from: DebugPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017R\u0014\u00100\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0014\u00102\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$MetricEvent;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$Event;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "eventState", "j$/time/Instant", "timestamp", "Ljava/util/UUID;", "contextualId", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "eventName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "context", "<init>", "(Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;Lj$/time/Instant;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;)V", "component1", "()Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/util/UUID;", "component4", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "component5", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "copy", "(Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;Lj$/time/Instant;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;)Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$MetricEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "getEventState", "Lj$/time/Instant;", "getTimestamp", "Ljava/util/UUID;", "getContextualId", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "getEventName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "getContext", "getFormattedName", "formattedName", "getFormattedContext", "formattedContext", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class MetricEvent implements Event {
        private final PerformanceMetricEventData.Context context;
        private final UUID contextualId;
        private final PerformanceMetricEventData.Name eventName;
        private final EventState eventState;
        private final Instant timestamp;

        public static /* synthetic */ MetricEvent copy$default(MetricEvent metricEvent, EventState eventState, Instant instant, UUID uuid, PerformanceMetricEventData.Name name, PerformanceMetricEventData.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                eventState = metricEvent.eventState;
            }
            if ((i & 2) != 0) {
                instant = metricEvent.timestamp;
            }
            if ((i & 4) != 0) {
                uuid = metricEvent.contextualId;
            }
            if ((i & 8) != 0) {
                name = metricEvent.eventName;
            }
            if ((i & 16) != 0) {
                context = metricEvent.context;
            }
            PerformanceMetricEventData.Context context2 = context;
            UUID uuid2 = uuid;
            return metricEvent.copy(eventState, instant, uuid2, name, context2);
        }

        /* renamed from: component1, reason: from getter */
        public final EventState getEventState() {
            return this.eventState;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getContextualId() {
            return this.contextualId;
        }

        /* renamed from: component4, reason: from getter */
        public final PerformanceMetricEventData.Name getEventName() {
            return this.eventName;
        }

        /* renamed from: component5, reason: from getter */
        public final PerformanceMetricEventData.Context getContext() {
            return this.context;
        }

        public final MetricEvent copy(EventState eventState, Instant timestamp, UUID contextualId, PerformanceMetricEventData.Name eventName, PerformanceMetricEventData.Context context) {
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return new MetricEvent(eventState, timestamp, contextualId, eventName, context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetricEvent)) {
                return false;
            }
            MetricEvent metricEvent = (MetricEvent) other;
            return this.eventState == metricEvent.eventState && Intrinsics.areEqual(this.timestamp, metricEvent.timestamp) && Intrinsics.areEqual(this.contextualId, metricEvent.contextualId) && this.eventName == metricEvent.eventName && Intrinsics.areEqual(this.context, metricEvent.context);
        }

        public int hashCode() {
            int iHashCode = ((this.eventState.hashCode() * 31) + this.timestamp.hashCode()) * 31;
            UUID uuid = this.contextualId;
            int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.eventName.hashCode()) * 31;
            PerformanceMetricEventData.Context context = this.context;
            return iHashCode2 + (context != null ? context.hashCode() : 0);
        }

        public String toString() {
            return "MetricEvent(eventState=" + this.eventState + ", timestamp=" + this.timestamp + ", contextualId=" + this.contextualId + ", eventName=" + this.eventName + ", context=" + this.context + ")";
        }

        public MetricEvent(EventState eventState, Instant timestamp, UUID uuid, PerformanceMetricEventData.Name eventName, PerformanceMetricEventData.Context context) {
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.eventState = eventState;
            this.timestamp = timestamp;
            this.contextualId = uuid;
            this.eventName = eventName;
            this.context = context;
        }

        public /* synthetic */ MetricEvent(EventState eventState, Instant instant, UUID uuid, PerformanceMetricEventData.Name name, PerformanceMetricEventData.Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventState, instant, uuid, name, (i & 16) != 0 ? null : context);
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public String getFormattedTimestamp() {
            return Event.DefaultImpls.getFormattedTimestamp(this);
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public EventState getEventState() {
            return this.eventState;
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public Instant getTimestamp() {
            return this.timestamp;
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public UUID getContextualId() {
            return this.contextualId;
        }

        public final PerformanceMetricEventData.Name getEventName() {
            return this.eventName;
        }

        public final PerformanceMetricEventData.Context getContext() {
            return this.context;
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public String getFormattedName() {
            return this.eventName.name();
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public String getFormattedContext() {
            return String.valueOf(this.context);
        }
    }

    /* compiled from: DebugPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R\u0014\u0010(\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0011R\u0014\u0010*\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$SpanEvent;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$Event;", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "eventState", "j$/time/Instant", "timestamp", "", "spanName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "context", "<init>", "(Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;)V", "component1", "()Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "copy", "(Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;)Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$SpanEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "getEventState", "Lj$/time/Instant;", "getTimestamp", "Ljava/lang/String;", "getSpanName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "getContext", "getFormattedName", "formattedName", "getFormattedContext", "formattedContext", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class SpanEvent implements Event {
        private final PerformanceMetricSpanEventData.Context context;
        private final EventState eventState;
        private final String spanName;
        private final Instant timestamp;

        public static /* synthetic */ SpanEvent copy$default(SpanEvent spanEvent, EventState eventState, Instant instant, String str, PerformanceMetricSpanEventData.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                eventState = spanEvent.eventState;
            }
            if ((i & 2) != 0) {
                instant = spanEvent.timestamp;
            }
            if ((i & 4) != 0) {
                str = spanEvent.spanName;
            }
            if ((i & 8) != 0) {
                context = spanEvent.context;
            }
            return spanEvent.copy(eventState, instant, str, context);
        }

        /* renamed from: component1, reason: from getter */
        public final EventState getEventState() {
            return this.eventState;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSpanName() {
            return this.spanName;
        }

        /* renamed from: component4, reason: from getter */
        public final PerformanceMetricSpanEventData.Context getContext() {
            return this.context;
        }

        public final SpanEvent copy(EventState eventState, Instant timestamp, String spanName, PerformanceMetricSpanEventData.Context context) {
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(spanName, "spanName");
            return new SpanEvent(eventState, timestamp, spanName, context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpanEvent)) {
                return false;
            }
            SpanEvent spanEvent = (SpanEvent) other;
            return this.eventState == spanEvent.eventState && Intrinsics.areEqual(this.timestamp, spanEvent.timestamp) && Intrinsics.areEqual(this.spanName, spanEvent.spanName) && Intrinsics.areEqual(this.context, spanEvent.context);
        }

        public int hashCode() {
            int iHashCode = ((((this.eventState.hashCode() * 31) + this.timestamp.hashCode()) * 31) + this.spanName.hashCode()) * 31;
            PerformanceMetricSpanEventData.Context context = this.context;
            return iHashCode + (context == null ? 0 : context.hashCode());
        }

        public String toString() {
            return "SpanEvent(eventState=" + this.eventState + ", timestamp=" + this.timestamp + ", spanName=" + this.spanName + ", context=" + this.context + ")";
        }

        public SpanEvent(EventState eventState, Instant timestamp, String spanName, PerformanceMetricSpanEventData.Context context) {
            Intrinsics.checkNotNullParameter(eventState, "eventState");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(spanName, "spanName");
            this.eventState = eventState;
            this.timestamp = timestamp;
            this.spanName = spanName;
            this.context = context;
        }

        public /* synthetic */ SpanEvent(EventState eventState, Instant instant, String str, PerformanceMetricSpanEventData.Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventState, instant, str, (i & 8) != 0 ? null : context);
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public UUID getContextualId() {
            return Event.DefaultImpls.getContextualId(this);
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public String getFormattedTimestamp() {
            return Event.DefaultImpls.getFormattedTimestamp(this);
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public EventState getEventState() {
            return this.eventState;
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getSpanName() {
            return this.spanName;
        }

        public final PerformanceMetricSpanEventData.Context getContext() {
            return this.context;
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public String getFormattedName() {
            return this.spanName;
        }

        @Override // com.robinhood.android.performancelogger.DebugPerformanceLogger.Event
        public String getFormattedContext() {
            return String.valueOf(this.context);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DebugPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$EventState;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "ALREADY_EXISTS", "METRIC_MISSING", "SKIPPED", "STARTED", "PAUSED", "RESUMED", "ABORTED", "FAILED", "COMPLETED", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class EventState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventState[] $VALUES;
        public static final EventState UNKNOWN = new EventState("UNKNOWN", 0);
        public static final EventState ALREADY_EXISTS = new EventState("ALREADY_EXISTS", 1);
        public static final EventState METRIC_MISSING = new EventState("METRIC_MISSING", 2);
        public static final EventState SKIPPED = new EventState("SKIPPED", 3);
        public static final EventState STARTED = new EventState("STARTED", 4);
        public static final EventState PAUSED = new EventState("PAUSED", 5);
        public static final EventState RESUMED = new EventState("RESUMED", 6);
        public static final EventState ABORTED = new EventState("ABORTED", 7);
        public static final EventState FAILED = new EventState("FAILED", 8);
        public static final EventState COMPLETED = new EventState("COMPLETED", 9);

        private static final /* synthetic */ EventState[] $values() {
            return new EventState[]{UNKNOWN, ALREADY_EXISTS, METRIC_MISSING, SKIPPED, STARTED, PAUSED, RESUMED, ABORTED, FAILED, COMPLETED};
        }

        public static EnumEntries<EventState> getEntries() {
            return $ENTRIES;
        }

        private EventState(String str, int i) {
        }

        static {
            EventState[] eventStateArr$values = $values();
            $VALUES = eventStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventStateArr$values);
        }

        public static EventState valueOf(String str) {
            return (EventState) Enum.valueOf(EventState.class, str);
        }

        public static EventState[] values() {
            return (EventState[]) $VALUES.clone();
        }
    }

    /* compiled from: DebugPerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/DebugPerformanceLogger$Companion;", "", "<init>", "()V", "j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "formatter", "Lj$/time/format/DateTimeFormatter;", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").withLocale(Locale.US).withZone(ZoneOffset.UTC);

        private Companion() {
        }
    }
}
