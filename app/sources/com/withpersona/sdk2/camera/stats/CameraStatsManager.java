package com.withpersona.sdk2.camera.stats;

import kotlin.Metadata;

/* compiled from: CameraStatsManager.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "", "", "startRecordingState", "()V", "stopRecordingState", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager$CameraStats;", "getCameraStats", "()Lcom/withpersona/sdk2/camera/stats/CameraStatsManager$CameraStats;", "CameraStats", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface CameraStatsManager {
    CameraStats getCameraStats();

    void startRecordingState();

    void stopRecordingState();

    /* compiled from: CameraStatsManager.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/stats/CameraStatsManager$CameraStats;", "", "", "averageRotation", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getAverageRotation", "()D", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CameraStats {
        private final double averageRotation;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CameraStats) && Double.compare(this.averageRotation, ((CameraStats) other).averageRotation) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.averageRotation);
        }

        public String toString() {
            return "CameraStats(averageRotation=" + this.averageRotation + ")";
        }

        public CameraStats(double d) {
            this.averageRotation = d;
        }

        public final double getAverageRotation() {
            return this.averageRotation;
        }
    }
}
