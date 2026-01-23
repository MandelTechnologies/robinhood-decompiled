package com.mux.stats.sdk.muxstats.bandwidth;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import com.mux.android.util.Weak2;
import com.mux.stats.sdk.core.model.BandwidthMetricData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.json.JSONException;

/* compiled from: BandwidthMetrics.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ]\u0010\u001d\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ5\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R*\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetrics;", "", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)V", "", "loadTaskId", "Ljava/io/IOException;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lcom/mux/stats/sdk/core/model/BandwidthMetricData;", "onLoadError", "(JLjava/io/IOException;)Lcom/mux/stats/sdk/core/model/BandwidthMetricData;", "onLoadCanceled", "(J)Lcom/mux/stats/sdk/core/model/BandwidthMetricData;", "mediaStartTimeMs", "mediaEndTimeMs", "", "segmentUrl", "", "dataType", "host", "segmentMimeType", "segmentWidth", "segmentHeight", "onLoad", "(JJJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)Lcom/mux/stats/sdk/core/model/BandwidthMetricData;", "onLoadStarted", "bytesLoaded", "Landroidx/media3/common/Format;", "trackFormat", "onLoadCompleted", "(JLjava/lang/String;JLandroidx/media3/common/Format;)Lcom/mux/stats/sdk/core/model/BandwidthMetricData;", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "", "Landroidx/media3/common/Tracks$Group;", "availableTracks", "Ljava/util/List;", "getAvailableTracks", "()Ljava/util/List;", "setAvailableTracks", "(Ljava/util/List;)V", "player$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "Ljava/util/HashMap;", "loadedSegments", "Ljava/util/HashMap;", "Landroidx/media3/common/Timeline$Window;", "currentTimelineWindow", "Landroidx/media3/common/Timeline$Window;", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public class BandwidthMetrics {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BandwidthMetrics.class, "player", "getPlayer()Landroidx/media3/exoplayer/ExoPlayer;", 0))};
    private List<Tracks.Group> availableTracks;
    private final MuxStateCollector collector;
    private Timeline.Window currentTimelineWindow;
    private HashMap<Long, BandwidthMetricData> loadedSegments;

    /* renamed from: player$delegate, reason: from kotlin metadata */
    private final Interfaces3 player;

    public BandwidthMetrics(ExoPlayer player, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.collector = collector;
        this.player = Weak2.weak(player);
        this.loadedSegments = new HashMap<>();
        this.currentTimelineWindow = new Timeline.Window();
    }

    public final void setAvailableTracks(List<Tracks.Group> list) {
        this.availableTracks = list;
    }

    private final ExoPlayer getPlayer() {
        return (ExoPlayer) this.player.getValue(this, $$delegatedProperties[0]);
    }

    public BandwidthMetricData onLoadError(long loadTaskId, IOException e) throws JSONException {
        Intrinsics.checkNotNullParameter(e, "e");
        BandwidthMetricData bandwidthMetricData = this.loadedSegments.get(Long.valueOf(loadTaskId));
        if (bandwidthMetricData == null) {
            bandwidthMetricData = new BandwidthMetricData();
        }
        bandwidthMetricData.setRequestError(e.toString());
        bandwidthMetricData.setRequestErrorCode(-1);
        bandwidthMetricData.setRequestErrorText(e.getMessage());
        bandwidthMetricData.setRequestResponseEnd(Long.valueOf(System.currentTimeMillis()));
        return bandwidthMetricData;
    }

    public BandwidthMetricData onLoadCanceled(long loadTaskId) throws JSONException {
        BandwidthMetricData bandwidthMetricData = this.loadedSegments.get(Long.valueOf(loadTaskId));
        if (bandwidthMetricData == null) {
            bandwidthMetricData = new BandwidthMetricData();
        }
        bandwidthMetricData.setRequestCancel("genericLoadCanceled");
        bandwidthMetricData.setRequestResponseEnd(Long.valueOf(System.currentTimeMillis()));
        return bandwidthMetricData;
    }

    public BandwidthMetricData onLoad(long loadTaskId, long mediaStartTimeMs, long mediaEndTimeMs, String segmentUrl, int dataType, String host, String segmentMimeType, int segmentWidth, int segmentHeight) throws JSONException {
        synchronized (this.currentTimelineWindow) {
            ExoPlayer player = getPlayer();
            if (player != null) {
                try {
                    Intrinsics.checkNotNull(player.getCurrentTimeline().getWindow(player.getCurrentWindowIndex(), this.currentTimelineWindow));
                } catch (Exception e) {
                    MuxLogger.exception(e, "BandwidthMetrics", "Failed to get current timeline");
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        BandwidthMetricData bandwidthMetricData = new BandwidthMetricData();
        bandwidthMetricData.setRequestResponseStart(Long.valueOf(System.currentTimeMillis()));
        bandwidthMetricData.setRequestMediaStartTime(Long.valueOf(mediaStartTimeMs));
        if (segmentWidth != 0 && segmentHeight != 0) {
            bandwidthMetricData.setRequestVideoWidth(Integer.valueOf(segmentWidth));
            bandwidthMetricData.setRequestVideoHeight(Integer.valueOf(segmentHeight));
        } else {
            bandwidthMetricData.setRequestVideoWidth(Integer.valueOf(this.collector.getSourceWidth()));
            bandwidthMetricData.setRequestVideoHeight(Integer.valueOf(this.collector.getSourceHeight()));
        }
        bandwidthMetricData.setRequestUrl(segmentUrl);
        if (segmentMimeType != null) {
            if (dataType == 1) {
                bandwidthMetricData.setRequestType("media");
                bandwidthMetricData.setRequestMediaDuration(Long.valueOf(mediaEndTimeMs - mediaStartTimeMs));
            } else if (dataType != 2) {
                if (dataType == 4) {
                    this.collector.setDetectMimeType(false);
                    bandwidthMetricData.setRequestType("manifest");
                }
            } else if (StringsKt.contains$default((CharSequence) segmentMimeType, (CharSequence) "video", false, 2, (Object) null)) {
                bandwidthMetricData.setRequestType("video_init");
            } else if (StringsKt.contains$default((CharSequence) segmentMimeType, (CharSequence) "audio", false, 2, (Object) null)) {
                bandwidthMetricData.setRequestType("audio_init");
            }
        }
        bandwidthMetricData.setRequestResponseHeaders(null);
        bandwidthMetricData.setRequestHostName(host);
        bandwidthMetricData.setRequestRenditionLists(this.collector.getRenditionList());
        this.loadedSegments.put(Long.valueOf(loadTaskId), bandwidthMetricData);
        return bandwidthMetricData;
    }

    public BandwidthMetricData onLoadStarted(long loadTaskId, long mediaStartTimeMs, long mediaEndTimeMs, String segmentUrl, int dataType, String host, String segmentMimeType, int segmentWidth, int segmentHeight) throws JSONException {
        BandwidthMetricData bandwidthMetricDataOnLoad = onLoad(loadTaskId, mediaStartTimeMs, mediaEndTimeMs, segmentUrl, dataType, host, segmentMimeType, segmentWidth, segmentHeight);
        bandwidthMetricDataOnLoad.setRequestResponseStart(Long.valueOf(System.currentTimeMillis()));
        return bandwidthMetricDataOnLoad;
    }

    public BandwidthMetricData onLoadCompleted(long loadTaskId, String segmentUrl, long bytesLoaded, Format trackFormat) throws JSONException {
        BandwidthMetricData bandwidthMetricData = this.loadedSegments.get(Long.valueOf(loadTaskId));
        if (bandwidthMetricData == null) {
            return null;
        }
        bandwidthMetricData.setRequestBytesLoaded(Long.valueOf(bytesLoaded));
        bandwidthMetricData.setRequestResponseEnd(Long.valueOf(System.currentTimeMillis()));
        List<Tracks.Group> list = this.availableTracks;
        if (trackFormat != null && list != null) {
            for (Tracks.Group group : list) {
                int i = group.length;
                for (int i2 = 0; i2 < i; i2++) {
                    Format trackFormat2 = group.getTrackFormat(i2);
                    Intrinsics.checkNotNullExpressionValue(trackFormat2, "getTrackFormat(...)");
                    if (trackFormat.width == trackFormat2.width && trackFormat.height == trackFormat2.height && trackFormat.bitrate == trackFormat2.bitrate) {
                        bandwidthMetricData.setRequestCurrentLevel(Integer.valueOf(i2));
                        MuxLogger.m1117d("BandwidthMetrics", "onLoadCompleted: found rendition idx " + i2 + "\nwith format " + trackFormat2);
                    }
                }
            }
        }
        this.loadedSegments.remove(Long.valueOf(loadTaskId));
        return bandwidthMetricData;
    }
}
