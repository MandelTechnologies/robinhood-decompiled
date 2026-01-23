package com.mux.stats.sdk.muxstats;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.mux.android.util.Weak2;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetrics2;
import com.mux.stats.sdk.muxstats.internal.HlsUtils;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import org.json.JSONException;

/* compiled from: ExoPlayerBinding.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0003\u0018\u0000 W2\u00020\u0001:\u0001WB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0015J)\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J'\u00106\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u000204H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J7\u0010E\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010A\u001a\u00020@2\u0006\u0010/\u001a\u00020.2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010FJ'\u0010G\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010A\u001a\u00020@2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bG\u0010HJ'\u0010I\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010A\u001a\u00020@2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bI\u0010HJ'\u0010J\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010A\u001a\u00020@2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bJ\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006X"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxAnalyticsListener;", "Landroidx/media3/exoplayer/analytics/AnalyticsListener;", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricDispatcher;", "bandwidthMetrics", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricDispatcher;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)V", "Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;", "eventTime", "", "playWhenReady", "", "reason", "", "onPlayWhenReadyChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;ZI)V", "state", "onPlaybackStateChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;I)V", "Landroidx/media3/common/Player$PositionInfo;", "oldPosition", "newPosition", "onPositionDiscontinuity", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/Player$PositionInfo;Landroidx/media3/common/Player$PositionInfo;I)V", "onTimelineChanged", "Landroidx/media3/common/MediaItem;", "mediaItem", "onMediaItemTransition", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/MediaItem;I)V", "Landroidx/media3/common/MediaMetadata;", "mediaMetadata", "onMediaMetadataChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/MediaMetadata;)V", "Landroidx/media3/common/Format;", "format", "Landroidx/media3/exoplayer/DecoderReuseEvaluation;", "decoderReuseEvaluation", "onVideoInputFormatChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/Format;Landroidx/media3/exoplayer/DecoderReuseEvaluation;)V", "Landroidx/media3/common/Tracks;", "tracks", "onTracksChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/Tracks;)V", "Landroidx/media3/exoplayer/source/MediaLoadData;", "mediaLoadData", "onDownstreamFormatChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/exoplayer/source/MediaLoadData;)V", "", "output", "", "renderTimeMs", "onRenderedFirstFrame", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Ljava/lang/Object;J)V", "droppedFrames", "elapsedMs", "onDroppedVideoFrames", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;IJ)V", "Landroidx/media3/common/VideoSize;", "videoSize", "onVideoSizeChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/common/VideoSize;)V", "Landroidx/media3/exoplayer/source/LoadEventInfo;", "loadEventInfo", "Ljava/io/IOException;", "error", "wasCanceled", "onLoadError", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/exoplayer/source/LoadEventInfo;Landroidx/media3/exoplayer/source/MediaLoadData;Ljava/io/IOException;Z)V", "onLoadCanceled", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;Landroidx/media3/exoplayer/source/LoadEventInfo;Landroidx/media3/exoplayer/source/MediaLoadData;)V", "onLoadStarted", "onLoadCompleted", "Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricDispatcher;", "getBandwidthMetrics", "()Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricDispatcher;", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "player$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "lastVideoFormat", "Landroidx/media3/common/Format;", "Companion", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.MuxAnalyticsListener, reason: use source file name */
/* loaded from: classes27.dex */
final class ExoPlayerBinding2 implements AnalyticsListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ExoPlayerBinding2.class, "player", "getPlayer()Landroidx/media3/exoplayer/ExoPlayer;", 0))};
    private final BandwidthMetrics2 bandwidthMetrics;
    private final MuxStateCollector collector;
    private Format lastVideoFormat;

    /* renamed from: player$delegate, reason: from kotlin metadata */
    private final Interfaces3 player;

    public ExoPlayerBinding2(ExoPlayer player, BandwidthMetrics2 bandwidthMetrics, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(bandwidthMetrics, "bandwidthMetrics");
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.bandwidthMetrics = bandwidthMetrics;
        this.collector = collector;
        this.player = Weak2.weak(player);
        MuxLogger.m1117d("ExoPlayerBinding", "Listening to ExoPlayer " + player);
    }

    private final ExoPlayer getPlayer() {
        return (ExoPlayer) this.player.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean playWhenReady, int reason) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        ExoPlayer player = getPlayer();
        if (player != null) {
            PlayerUtils.handlePlayWhenReady(this.collector, playWhenReady, player.getPlaybackState());
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int state) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        ExoPlayer player = getPlayer();
        if (player != null) {
            PlayerUtils.handleExoPlaybackState(this.collector, state, player.getPlayWhenReady());
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        PlayerUtils.handlePositionDiscontinuity(this.collector, reason);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int reason) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Timeline timeline = eventTime.timeline;
        if (timeline.getWindowCount() <= 0) {
            timeline = null;
        }
        if (timeline != null) {
            Timeline.Window window = new Timeline.Window();
            timeline.getWindow(0, window);
            this.collector.setSourceDurationMs(window.getDurationMs());
            HlsUtils.populateLiveStreamData(this.collector, window);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int reason) throws JSONException {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (mediaItem != null) {
            PlayerUtils.handleMediaItemChanged(this.collector, mediaItem);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) throws JSONException {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(mediaMetadata, "mediaMetadata");
        PlayerUtils.handleMediaMetadata(this.collector, mediaMetadata);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format2, DecoderReuseEvaluation decoderReuseEvaluation) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(format2, "format");
        MuxLogger.m1117d("ExoPlayerBinding", "onVideoInputFormatChanged: new format: bitrate " + format2.bitrate + " and frameRate " + format2.frameRate + ' ');
        Format format3 = this.lastVideoFormat;
        if (format3 == null || !Intrinsics.areEqual(format2, format3)) {
            Integer numValueOf = Integer.valueOf(format2.bitrate);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            Float fValueOf = Float.valueOf(format2.frameRate);
            Float f = fValueOf.floatValue() >= 0.0f ? fValueOf : null;
            this.collector.renditionChange(iIntValue, f != null ? f.floatValue() : 0.0f, format2.width, format2.height);
            this.lastVideoFormat = format2;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        MuxLogger.m1117d("ExoPlayerBinding", "onTracksChanged");
        ExoPlayer player = getPlayer();
        if (player != null) {
            PlayerUtils.watchPlayerPos(this.collector, player);
            this.collector.setMediaHasVideoTrack(Boolean.valueOf(PlayerUtils.hasAtLeastOneVideoTrack(tracks)));
        }
        BandwidthMetrics2 bandwidthMetrics2 = this.bandwidthMetrics;
        if (bandwidthMetrics2 != null) {
            bandwidthMetrics2.onTracksChanged(tracks);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        Format format2;
        String str;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        if (!this.collector.getDetectMimeType() || (format2 = mediaLoadData.trackFormat) == null || (str = format2.containerMimeType) == null) {
            return;
        }
        this.collector.setMimeType(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object output, long renderTimeMs) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(output, "output");
        this.collector.onFirstFrameRendered();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int droppedFrames, long elapsedMs) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        this.collector.incrementDroppedFrames(droppedFrames);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        this.collector.setSourceWidth(videoSize.width);
        this.collector.setSourceHeight(videoSize.height);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        Intrinsics.checkNotNullParameter(error, "error");
        BandwidthMetrics2 bandwidthMetrics2 = this.bandwidthMetrics;
        if (bandwidthMetrics2 != null) {
            bandwidthMetrics2.onLoadError(loadEventInfo.loadTaskId, loadEventInfo.uri.getPath(), error);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        BandwidthMetrics2 bandwidthMetrics2 = this.bandwidthMetrics;
        if (bandwidthMetrics2 != null) {
            long j = loadEventInfo.loadTaskId;
            String path = loadEventInfo.uri.getPath();
            Map<String, List<String>> responseHeaders = loadEventInfo.responseHeaders;
            Intrinsics.checkNotNullExpressionValue(responseHeaders, "responseHeaders");
            bandwidthMetrics2.onLoadCanceled(j, path, responseHeaders);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        int i;
        int i2;
        ExoPlayerBinding2 exoPlayerBinding2;
        String str;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        Format format2 = mediaLoadData.trackFormat;
        String str2 = "unknown";
        if (format2 != null) {
            String str3 = format2.sampleMimeType;
            if (str3 != null) {
                Intrinsics.checkNotNull(str3);
                str2 = str3;
            }
            int i3 = format2.width;
            i2 = format2.height;
            i = i3;
            str = str2;
            exoPlayerBinding2 = this;
        } else {
            i = 0;
            i2 = 0;
            exoPlayerBinding2 = this;
            str = "unknown";
        }
        BandwidthMetrics2 bandwidthMetrics2 = exoPlayerBinding2.bandwidthMetrics;
        if (bandwidthMetrics2 != null) {
            bandwidthMetrics2.onLoadStarted(loadEventInfo.loadTaskId, mediaLoadData.mediaStartTimeMs, mediaLoadData.mediaEndTimeMs, loadEventInfo.uri.getPath(), mediaLoadData.dataType, loadEventInfo.uri.getHost(), str, i, i2);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        BandwidthMetrics2 bandwidthMetrics2;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        Uri uri = loadEventInfo.uri;
        if (uri == null || (bandwidthMetrics2 = this.bandwidthMetrics) == null) {
            return;
        }
        long j = loadEventInfo.loadTaskId;
        String path = uri.getPath();
        long j2 = loadEventInfo.bytesLoaded;
        Format format2 = mediaLoadData.trackFormat;
        Map<String, List<String>> responseHeaders = loadEventInfo.responseHeaders;
        Intrinsics.checkNotNullExpressionValue(responseHeaders, "responseHeaders");
        bandwidthMetrics2.onLoadCompleted(j, path, j2, format2, responseHeaders);
    }
}
