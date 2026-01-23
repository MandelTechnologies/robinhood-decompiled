package io.bitdrift.capture.reports;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: FatalIssueReporterStatus.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, m3636d2 = {"Lio/bitdrift/capture/reports/FatalIssueReporterStatus;", "", "Lio/bitdrift/capture/reports/FatalIssueReporterState;", "state", "Lkotlin/time/Duration;", "duration", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "mechanism", "<init>", "(Lio/bitdrift/capture/reports/FatalIssueReporterState;Lkotlin/time/Duration;Lio/bitdrift/capture/reports/FatalIssueMechanism;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/bitdrift/capture/reports/FatalIssueReporterState;", "getState", "()Lio/bitdrift/capture/reports/FatalIssueReporterState;", "Lkotlin/time/Duration;", "getDuration-FghU774", "()Lkotlin/time/Duration;", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "getMechanism", "()Lio/bitdrift/capture/reports/FatalIssueMechanism;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FatalIssueReporterStatus {
    private final Duration duration;
    private final FatalIssueMechanism mechanism;
    private final FatalIssueReporterState state;

    public /* synthetic */ FatalIssueReporterStatus(FatalIssueReporterState fatalIssueReporterState, Duration duration, FatalIssueMechanism fatalIssueMechanism, DefaultConstructorMarker defaultConstructorMarker) {
        this(fatalIssueReporterState, duration, fatalIssueMechanism);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FatalIssueReporterStatus)) {
            return false;
        }
        FatalIssueReporterStatus fatalIssueReporterStatus = (FatalIssueReporterStatus) other;
        return Intrinsics.areEqual(this.state, fatalIssueReporterStatus.state) && Intrinsics.areEqual(this.duration, fatalIssueReporterStatus.duration) && Intrinsics.areEqual(this.mechanism, fatalIssueReporterStatus.mechanism);
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        Duration duration = this.duration;
        return ((iHashCode + (duration == null ? 0 : Duration.m28747hashCodeimpl(duration.getRawValue()))) * 31) + this.mechanism.hashCode();
    }

    public String toString() {
        return "FatalIssueReporterStatus(state=" + this.state + ", duration=" + this.duration + ", mechanism=" + this.mechanism + ')';
    }

    private FatalIssueReporterStatus(FatalIssueReporterState state, Duration duration, FatalIssueMechanism mechanism) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mechanism, "mechanism");
        this.state = state;
        this.duration = duration;
        this.mechanism = mechanism;
    }

    public /* synthetic */ FatalIssueReporterStatus(FatalIssueReporterState fatalIssueReporterState, Duration duration, FatalIssueMechanism fatalIssueMechanism, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fatalIssueReporterState, (i & 2) != 0 ? null : duration, fatalIssueMechanism, null);
    }

    public final FatalIssueReporterState getState() {
        return this.state;
    }

    /* renamed from: getDuration-FghU774, reason: not valid java name and from getter */
    public final Duration getDuration() {
        return this.duration;
    }

    public final FatalIssueMechanism getMechanism() {
        return this.mechanism;
    }
}
