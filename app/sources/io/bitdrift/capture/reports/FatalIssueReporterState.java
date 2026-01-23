package io.bitdrift.capture.reports;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FatalIssueReporterState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueReporterState;", "", "", "readableType", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getReadableType", "()Ljava/lang/String;", "NotInitialized", "Lio/bitdrift/capture/reports/FatalIssueReporterState$NotInitialized;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public abstract class FatalIssueReporterState {
    private final String readableType;

    public /* synthetic */ FatalIssueReporterState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private FatalIssueReporterState(String str) {
        this.readableType = str;
    }

    public String getReadableType() {
        return this.readableType;
    }

    /* compiled from: FatalIssueReporterState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueReporterState$NotInitialized;", "Lio/bitdrift/capture/reports/FatalIssueReporterState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class NotInitialized extends FatalIssueReporterState {
        public static final NotInitialized INSTANCE = new NotInitialized();

        public boolean equals(Object other) {
            return this == other || (other instanceof NotInitialized);
        }

        public int hashCode() {
            return -744152587;
        }

        public String toString() {
            return "NotInitialized";
        }

        private NotInitialized() {
            super("NOT_INITIALIZED", null);
        }
    }
}
