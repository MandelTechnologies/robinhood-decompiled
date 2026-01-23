package com.withpersona.sdk2.inquiry.appdomethreatevents;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreatEventState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/appdomethreatevents/ThreatEventState;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lcom/withpersona/sdk2/inquiry/appdomethreatevents/ThreatEventState$EventMetadata;", "eventsSeen", "Ljava/util/Map;", "getEventsSeen", "()Ljava/util/Map;", "Companion", "EventMetadata", "appdome-threatevents_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ThreatEventState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> knownThreatEventNames = CollectionsKt.listOf((Object[]) new String[]{"RootedDevice", "DebuggerThreatDetected", "AppIsDebuggable", "AppIntegrityError", "EmulatorFound", "GoogleEmulatorDetected", "MagiskManagerDetected", "FridaDetected", "FridaCustomDetected"});
    private final Map<String, EventMetadata> eventsSeen;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThreatEventState) && Intrinsics.areEqual(this.eventsSeen, ((ThreatEventState) other).eventsSeen);
    }

    public int hashCode() {
        return this.eventsSeen.hashCode();
    }

    public String toString() {
        return "ThreatEventState(eventsSeen=" + this.eventsSeen + ")";
    }

    public final Map<String, EventMetadata> getEventsSeen() {
        return this.eventsSeen;
    }

    /* compiled from: ThreatEventState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/appdomethreatevents/ThreatEventState$EventMetadata;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "reasonData", "Ljava/lang/String;", "getReasonData", "timestamp", "getTimestamp", "appdome-threatevents_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class EventMetadata {
        private final String reasonData;
        private final String timestamp;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventMetadata)) {
                return false;
            }
            EventMetadata eventMetadata = (EventMetadata) other;
            return Intrinsics.areEqual(this.reasonData, eventMetadata.reasonData) && Intrinsics.areEqual(this.timestamp, eventMetadata.timestamp);
        }

        public int hashCode() {
            String str = this.reasonData;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.timestamp;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "EventMetadata(reasonData=" + this.reasonData + ", timestamp=" + this.timestamp + ")";
        }

        public final String getReasonData() {
            return this.reasonData;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }
    }

    /* compiled from: ThreatEventState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/appdomethreatevents/ThreatEventState$Companion;", "", "<init>", "()V", "knownThreatEventNames", "", "", "getKnownThreatEventNames", "()Ljava/util/List;", "appdome-threatevents_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getKnownThreatEventNames() {
            return ThreatEventState.knownThreatEventNames;
        }
    }
}
