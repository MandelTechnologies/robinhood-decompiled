package com.robinhood.android.internalassettransfers.review;

import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferReviewDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;", "", "alerts", "", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "timestamp", "", "<init>", "(Ljava/util/List;J)V", "getAlerts", "()Ljava/util/List;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PresubmitAlertsWrapper {
    public static final int $stable = 8;
    private final List<PresubmissionChecksAlertSheet> alerts;
    private final long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PresubmitAlertsWrapper copy$default(PresubmitAlertsWrapper presubmitAlertsWrapper, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = presubmitAlertsWrapper.alerts;
        }
        if ((i & 2) != 0) {
            j = presubmitAlertsWrapper.timestamp;
        }
        return presubmitAlertsWrapper.copy(list, j);
    }

    public final List<PresubmissionChecksAlertSheet> component1() {
        return this.alerts;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final PresubmitAlertsWrapper copy(List<PresubmissionChecksAlertSheet> alerts, long timestamp) {
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        return new PresubmitAlertsWrapper(alerts, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresubmitAlertsWrapper)) {
            return false;
        }
        PresubmitAlertsWrapper presubmitAlertsWrapper = (PresubmitAlertsWrapper) other;
        return Intrinsics.areEqual(this.alerts, presubmitAlertsWrapper.alerts) && this.timestamp == presubmitAlertsWrapper.timestamp;
    }

    public int hashCode() {
        return (this.alerts.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "PresubmitAlertsWrapper(alerts=" + this.alerts + ", timestamp=" + this.timestamp + ")";
    }

    public PresubmitAlertsWrapper(List<PresubmissionChecksAlertSheet> alerts, long j) {
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        this.alerts = alerts;
        this.timestamp = j;
    }

    public final List<PresubmissionChecksAlertSheet> getAlerts() {
        return this.alerts;
    }

    public /* synthetic */ PresubmitAlertsWrapper(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? System.currentTimeMillis() : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
