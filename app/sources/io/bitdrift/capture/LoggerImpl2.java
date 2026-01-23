package io.bitdrift.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggerImpl.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/bitdrift/capture/LogAttributesOverrides;", "", "()V", "OccurredAt", "SessionID", "Lio/bitdrift/capture/LogAttributesOverrides$OccurredAt;", "Lio/bitdrift/capture/LogAttributesOverrides$SessionID;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.LogAttributesOverrides, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class LoggerImpl2 {
    public /* synthetic */ LoggerImpl2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LoggerImpl2() {
    }

    /* compiled from: LoggerImpl.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lio/bitdrift/capture/LogAttributesOverrides$SessionID;", "Lio/bitdrift/capture/LogAttributesOverrides;", "", "expectedPreviousProcessSessionId", "", "occurredAtTimestampMs", "<init>", "(Ljava/lang/String;J)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExpectedPreviousProcessSessionId", "J", "getOccurredAtTimestampMs", "()J", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.LogAttributesOverrides$SessionID, reason: from toString */
    public static final /* data */ class SessionID extends LoggerImpl2 {
        private final String expectedPreviousProcessSessionId;
        private final long occurredAtTimestampMs;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionID)) {
                return false;
            }
            SessionID sessionID = (SessionID) other;
            return Intrinsics.areEqual(this.expectedPreviousProcessSessionId, sessionID.expectedPreviousProcessSessionId) && this.occurredAtTimestampMs == sessionID.occurredAtTimestampMs;
        }

        public int hashCode() {
            return (this.expectedPreviousProcessSessionId.hashCode() * 31) + D8$$SyntheticClass3.m3293m(this.occurredAtTimestampMs);
        }

        public String toString() {
            return "SessionID(expectedPreviousProcessSessionId=" + this.expectedPreviousProcessSessionId + ", occurredAtTimestampMs=" + this.occurredAtTimestampMs + ')';
        }

        public final String getExpectedPreviousProcessSessionId() {
            return this.expectedPreviousProcessSessionId;
        }

        public final long getOccurredAtTimestampMs() {
            return this.occurredAtTimestampMs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionID(String expectedPreviousProcessSessionId, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(expectedPreviousProcessSessionId, "expectedPreviousProcessSessionId");
            this.expectedPreviousProcessSessionId = expectedPreviousProcessSessionId;
            this.occurredAtTimestampMs = j;
        }
    }

    /* compiled from: LoggerImpl.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lio/bitdrift/capture/LogAttributesOverrides$OccurredAt;", "Lio/bitdrift/capture/LogAttributesOverrides;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "occurredAtTimestampMs", "J", "getOccurredAtTimestampMs", "()J", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: io.bitdrift.capture.LogAttributesOverrides$OccurredAt, reason: from toString */
    public static final /* data */ class OccurredAt extends LoggerImpl2 {
        private final long occurredAtTimestampMs;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OccurredAt) && this.occurredAtTimestampMs == ((OccurredAt) other).occurredAtTimestampMs;
        }

        public int hashCode() {
            return D8$$SyntheticClass2.m3292m(this.occurredAtTimestampMs);
        }

        public String toString() {
            return "OccurredAt(occurredAtTimestampMs=" + this.occurredAtTimestampMs + ')';
        }

        public final long getOccurredAtTimestampMs() {
            return this.occurredAtTimestampMs;
        }
    }
}
