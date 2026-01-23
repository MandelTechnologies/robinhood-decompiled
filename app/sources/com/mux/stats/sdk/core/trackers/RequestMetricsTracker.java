package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.playback.IPlaybackEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.events.playback.RequestCanceled;
import com.mux.stats.sdk.core.events.playback.RequestCompleted;
import com.mux.stats.sdk.core.events.playback.RequestFailed;
import com.mux.stats.sdk.core.model.BandwidthMetricData;
import com.mux.stats.sdk.core.model.ViewData;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class RequestMetricsTracker extends BaseTracker {
    protected long requestCanceledCount;
    protected long requestCompletedCount;
    protected long requestCount;
    protected long requestFailedCount;
    protected long totalBytes;
    protected double totalLatency;
    protected long totalLoadTime;

    public RequestMetricsTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.requestCount = 0L;
        this.requestCompletedCount = 0L;
        this.requestCanceledCount = 0L;
        this.requestFailedCount = 0L;
        this.totalBytes = 0L;
        this.totalLoadTime = 0L;
        this.totalLatency = 0.0d;
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        IPlaybackEvent iPlaybackEvent;
        ViewData viewData;
        String type2 = playbackEvent.getType();
        type2.getClass();
        switch (type2) {
            case "requestcanceled":
                iPlaybackEvent = (RequestCanceled) playbackEvent;
                this.requestCount++;
                this.requestCanceledCount++;
                viewData = iPlaybackEvent.getViewData();
                viewData.setViewRequestCount(Long.valueOf(this.requestCount));
                viewData.setViewRequestCanceledCount(Long.valueOf(this.requestCanceledCount));
                break;
            case "requestcompleted":
                RequestCompleted requestCompleted = (RequestCompleted) playbackEvent;
                this.requestCount++;
                BandwidthMetricData bandwidthMetricData = requestCompleted.getBandwidthMetricData();
                if (bandwidthMetricData != null) {
                    long jLongValue = bandwidthMetricData.getRequestStart() != null ? bandwidthMetricData.getRequestResponseStart().longValue() - bandwidthMetricData.getRequestStart().longValue() : 0L;
                    long jLongValue2 = bandwidthMetricData.getRequestResponseEnd().longValue() - bandwidthMetricData.getRequestResponseStart().longValue();
                    if (jLongValue2 <= 0 || bandwidthMetricData.getRequestBytesLoaded() == null || bandwidthMetricData.getRequestBytesLoaded().longValue() <= 0) {
                        return;
                    }
                    long jLongValue3 = (bandwidthMetricData.getRequestBytesLoaded().longValue() / jLongValue2) * 8000;
                    this.requestCompletedCount++;
                    this.totalBytes += bandwidthMetricData.getRequestBytesLoaded().longValue();
                    this.totalLoadTime += jLongValue2;
                    ViewData viewData2 = requestCompleted.getViewData();
                    viewData2.setViewMinRequestThroughput(Long.valueOf(Math.min(viewData2.getViewMinRequestThroughput() == null ? Long.MAX_VALUE : viewData2.getViewMinRequestThroughput().longValue(), jLongValue3)));
                    viewData2.setViewAverageRequestThroughput(Long.valueOf((long) ((this.totalBytes / this.totalLoadTime) * 8000.0d)));
                    viewData2.setViewRequestCount(Long.valueOf(this.requestCount));
                    if (jLongValue > 0) {
                        double d = jLongValue;
                        this.totalLatency += d;
                        viewData2.setViewMaxRequestLatency(Double.valueOf(Math.max(viewData2.getViewMaxRequestLatency() == null ? 0.0d : viewData2.getViewMaxRequestLatency().doubleValue(), d)));
                        viewData2.setViewAverageRequestLatency(Double.valueOf(this.totalLatency / this.requestCompletedCount));
                    }
                    requestCompleted.setViewData(viewData2);
                    return;
                }
                return;
            case "requestfailed":
                iPlaybackEvent = (RequestFailed) playbackEvent;
                this.requestCount++;
                this.requestFailedCount++;
                viewData = iPlaybackEvent.getViewData();
                viewData.setViewRequestCount(Long.valueOf(this.requestCount));
                viewData.setViewRequestFailedCount(Long.valueOf(this.requestFailedCount));
                break;
            default:
                return;
        }
        iPlaybackEvent.setViewData(viewData);
    }
}
