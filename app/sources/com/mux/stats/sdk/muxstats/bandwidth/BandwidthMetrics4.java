package com.mux.stats.sdk.muxstats.bandwidth;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.ExoPlayer;
import com.mux.stats.sdk.core.model.BandwidthMetricData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* compiled from: BandwidthMetrics.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J.\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017¨\u0006\u0011"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricsHls;", "Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetrics;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "collector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)V", "onLoadCanceled", "Lcom/mux/stats/sdk/core/model/BandwidthMetricData;", "loadTaskId", "", "onLoadCompleted", "segmentUrl", "", "bytesLoaded", "trackFormat", "Landroidx/media3/common/Format;", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetricsHls, reason: use source file name */
/* loaded from: classes27.dex */
public final class BandwidthMetrics4 extends BandwidthMetrics {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BandwidthMetrics4(ExoPlayer player, MuxStateCollector collector) {
        super(player, collector);
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
    }

    @Override // com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetrics
    public BandwidthMetricData onLoadCanceled(long loadTaskId) throws JSONException {
        BandwidthMetricData bandwidthMetricDataOnLoadCanceled = super.onLoadCanceled(loadTaskId);
        bandwidthMetricDataOnLoadCanceled.setRequestCancel("FragLoadEmergencyAborted");
        return bandwidthMetricDataOnLoadCanceled;
    }

    @Override // com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetrics
    public BandwidthMetricData onLoadCompleted(long loadTaskId, String segmentUrl, long bytesLoaded, Format trackFormat) throws JSONException {
        BandwidthMetricData bandwidthMetricDataOnLoadCompleted = super.onLoadCompleted(loadTaskId, segmentUrl, bytesLoaded, trackFormat);
        if (trackFormat != null && bandwidthMetricDataOnLoadCompleted != null && trackFormat.bitrate > 0) {
            MuxLogger.m1117d("BandwidthMetrics", "onLoadCompleted: current track bitrate " + trackFormat.bitrate);
            bandwidthMetricDataOnLoadCompleted.setRequestLabeledBitrate(Integer.valueOf(trackFormat.bitrate));
        }
        return bandwidthMetricDataOnLoadCompleted;
    }
}
