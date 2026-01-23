package com.mux.stats.sdk.muxstats.bandwidth;

import androidx.media3.common.Format;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.ImmutableList;
import com.mux.android.util.Weak2;
import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.events.playback.RequestCanceled;
import com.mux.stats.sdk.core.events.playback.RequestCompleted;
import com.mux.stats.sdk.core.events.playback.RequestFailed;
import com.mux.stats.sdk.core.model.BandwidthMetricData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import com.mux.stats.sdk.muxstats.PlayerUtils;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import org.json.JSONException;

/* compiled from: BandwidthMetrics.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J2\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010'2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00070)JD\u0010*\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010-2\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00070)J \u0010/\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u000201JT\u00102\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u00105\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u00010'2\b\u00107\u001a\u0004\u0018\u00010'2\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0015J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0007J*\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020!2\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00070)H\u0002J0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u00010?2\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00070)H\u0002J\u0018\u0010@\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\f\u0010A\u001a\u00020'*\u00020BH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricDispatcher;", "", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "collector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "trackedResponseHeaders", "", "Lcom/mux/stats/sdk/muxstats/bandwidth/TrackedHeader;", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Ljava/util/List;)V", "bandwidthMetricHls", "Lcom/mux/stats/sdk/muxstats/bandwidth/BandwidthMetricsHls;", "getCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector$delegate", "Lkotlin/properties/ReadWriteProperty;", "debugModeOn", "", "lastRequestSentAt", "", "maxNumberOfEventsPerSegmentDuration", "", "numberOfRequestCancelBeaconsSentPerSegment", "numberOfRequestCompletedBeaconsSentPerSegment", "numberOfRequestFailedBeaconsSentPerSegment", "getPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "player$delegate", "requestSegmentDuration", "currentBandwidthMetric", "dispatch", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/mux/stats/sdk/core/model/BandwidthMetricData;", "event", "Lcom/mux/stats/sdk/core/events/playback/PlaybackEvent;", "onLoadCanceled", "loadTaskId", "segmentUrl", "", "headers", "", "onLoadCompleted", "bytesLoaded", "trackFormat", "Landroidx/media3/common/Format;", "responseHeaders", "onLoadError", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/io/IOException;", "onLoadStarted", "mediaStartTimeMs", "mediaEndTimeMs", "dataType", "host", "segmentMimeType", "segmentWidth", "segmentHeight", "onTracksChanged", "tracks", "Landroidx/media3/common/Tracks;", "parseHeaders", "loadData", "Ljava/util/Hashtable;", "shouldDispatchEvent", "debugString", "Lcom/mux/stats/sdk/core/model/BandwidthMetricData$Rendition;", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetricDispatcher, reason: use source file name */
/* loaded from: classes27.dex */
public final class BandwidthMetrics2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BandwidthMetrics2.class, "player", "getPlayer()Landroidx/media3/exoplayer/ExoPlayer;", 0)), Reflection.property1(new PropertyReference1Impl(BandwidthMetrics2.class, "collector", "getCollector()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", 0))};
    private final BandwidthMetrics4 bandwidthMetricHls;

    /* renamed from: collector$delegate, reason: from kotlin metadata */
    private final Interfaces3 collector;
    private boolean debugModeOn;
    private long lastRequestSentAt;
    private int maxNumberOfEventsPerSegmentDuration;
    private int numberOfRequestCancelBeaconsSentPerSegment;
    private int numberOfRequestCompletedBeaconsSentPerSegment;
    private int numberOfRequestFailedBeaconsSentPerSegment;

    /* renamed from: player$delegate, reason: from kotlin metadata */
    private final Interfaces3 player;
    private long requestSegmentDuration;
    private final List<BandwidthMetrics5> trackedResponseHeaders;

    /* JADX WARN: Multi-variable type inference failed */
    public BandwidthMetrics2(ExoPlayer player, MuxStateCollector collector, List<? extends BandwidthMetrics5> trackedResponseHeaders) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(trackedResponseHeaders, "trackedResponseHeaders");
        this.trackedResponseHeaders = trackedResponseHeaders;
        this.player = Weak2.weak(player);
        this.collector = Weak2.weak(collector);
        this.bandwidthMetricHls = new BandwidthMetrics4(player, collector);
        this.requestSegmentDuration = 1000L;
        this.lastRequestSentAt = -1L;
        this.maxNumberOfEventsPerSegmentDuration = 10;
    }

    private final ExoPlayer getPlayer() {
        return (ExoPlayer) this.player.getValue(this, $$delegatedProperties[0]);
    }

    private final MuxStateCollector getCollector() {
        return (MuxStateCollector) this.collector.getValue(this, $$delegatedProperties[1]);
    }

    /* renamed from: currentBandwidthMetric, reason: from getter */
    private final BandwidthMetrics4 getBandwidthMetricHls() {
        return this.bandwidthMetricHls;
    }

    public final void onLoadError(long loadTaskId, String segmentUrl, IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (getPlayer() == null || getCollector() == null) {
            return;
        }
        dispatch(getBandwidthMetricHls().onLoadError(loadTaskId, e), new RequestFailed(null));
    }

    public final void onLoadCanceled(long loadTaskId, String segmentUrl, Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (getPlayer() == null || getCollector() == null) {
            return;
        }
        BandwidthMetricData bandwidthMetricDataOnLoadCanceled = getBandwidthMetricHls().onLoadCanceled(loadTaskId);
        parseHeaders(bandwidthMetricDataOnLoadCanceled, headers);
        dispatch(bandwidthMetricDataOnLoadCanceled, new RequestCanceled(null));
    }

    public final void onLoadStarted(long loadTaskId, long mediaStartTimeMs, long mediaEndTimeMs, String segmentUrl, int dataType, String host, String segmentMimeType, int segmentWidth, int segmentHeight) {
        if (getPlayer() == null || getCollector() == null) {
            return;
        }
        getBandwidthMetricHls().onLoadStarted(loadTaskId, mediaStartTimeMs, mediaEndTimeMs, segmentUrl, dataType, host, segmentMimeType, segmentWidth, segmentHeight);
    }

    public final void onLoadCompleted(long loadTaskId, String segmentUrl, long bytesLoaded, Format trackFormat, Map<String, ? extends List<String>> responseHeaders) {
        BandwidthMetricData bandwidthMetricDataOnLoadCompleted;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        if (getPlayer() == null || getCollector() == null || (bandwidthMetricDataOnLoadCompleted = getBandwidthMetricHls().onLoadCompleted(loadTaskId, segmentUrl, bytesLoaded, trackFormat)) == null) {
            return;
        }
        parseHeaders(bandwidthMetricDataOnLoadCompleted, responseHeaders);
        dispatch(bandwidthMetricDataOnLoadCompleted, new RequestCompleted(null));
    }

    private final void parseHeaders(BandwidthMetricData loadData, Map<String, ? extends List<String>> responseHeaders) throws JSONException {
        Hashtable<String, String> headers = parseHeaders(responseHeaders);
        if (headers != null) {
            loadData.setRequestId(headers.get("x-request-id"));
            loadData.setRequestResponseHeaders(headers);
        }
    }

    public final void onTracksChanged(Tracks tracks) {
        ArrayList arrayList;
        List<BandwidthMetricData.Rendition> renditionList;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        MuxLogger.m1117d("BandwidthMetrics", "onTracksChanged: Got " + tracks.getGroups().size() + " tracks");
        BandwidthMetrics4 bandwidthMetricHls = getBandwidthMetricHls();
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Tracks.Group group : groups) {
            if (group.getType() == 2) {
                arrayList2.add(group);
            }
        }
        bandwidthMetricHls.setAvailableTracks(arrayList2);
        if (getPlayer() == null || getCollector() == null) {
            return;
        }
        ImmutableList<Tracks.Group> groups2 = tracks.getGroups();
        Intrinsics.checkNotNullExpressionValue(groups2, "getGroups(...)");
        ArrayList<Tracks.Group> arrayList3 = new ArrayList();
        for (Tracks.Group group2 : groups2) {
            if (group2.getType() == 2) {
                arrayList3.add(group2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Tracks.Group group3 : arrayList3) {
            Intrinsics.checkNotNull(group3);
            CollectionsKt.addAll(arrayList4, PlayerUtils.mapFormats(group3, new Function1<Format, BandwidthMetricData.Rendition>() { // from class: com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetricDispatcher$onTracksChanged$renditions$2$1
                @Override // kotlin.jvm.functions.Function1
                public final BandwidthMetricData.Rendition invoke(Format trackFormat) {
                    Intrinsics.checkNotNullParameter(trackFormat, "trackFormat");
                    BandwidthMetricData.Rendition rendition = new BandwidthMetricData.Rendition();
                    rendition.bitrate = trackFormat.bitrate;
                    rendition.width = trackFormat.width;
                    rendition.height = trackFormat.height;
                    rendition.codec = trackFormat.codecs;
                    rendition.fps = trackFormat.frameRate;
                    rendition.name = trackFormat.width + '_' + trackFormat.height + '_' + trackFormat.bitrate + '_' + trackFormat.codecs + '_' + trackFormat.frameRate;
                    return rendition;
                }
            }));
        }
        MuxStateCollector collector = getCollector();
        if (collector != null) {
            collector.setRenditionList(arrayList4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onTracksChanged: ended function with renditions: ");
        MuxStateCollector collector2 = getCollector();
        if (collector2 == null || (renditionList = collector2.getRenditionList()) == null) {
            arrayList = null;
        } else {
            List<BandwidthMetricData.Rendition> list = renditionList;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(debugString((BandwidthMetricData.Rendition) it.next()));
            }
        }
        sb.append(arrayList);
        MuxLogger.m1117d("BandwidthMetrics", sb.toString());
    }

    private final String debugString(BandwidthMetricData.Rendition rendition) {
        return "{size: [" + rendition.width + 'x' + rendition.height + "], " + rendition.fps + "fps, " + rendition.bitrate + "bps, name: " + rendition.name + " codec " + rendition.codec + '}';
    }

    private final void dispatch(BandwidthMetricData data, PlaybackEvent event) {
        IEventDispatcher dispatcher;
        if (shouldDispatchEvent(data, event)) {
            event.setBandwidthMetricData(data);
            MuxStateCollector collector = getCollector();
            if (collector == null || (dispatcher = collector.getDispatcher()) == null) {
                return;
            }
            dispatcher.dispatch(event);
        }
    }

    private final Hashtable<String, String> parseHeaders(Map<String, ? extends List<String>> responseHeaders) {
        boolean z;
        int i;
        if (responseHeaders.isEmpty()) {
            return null;
        }
        Hashtable<String, String> hashtable = new Hashtable<>();
        for (String str : responseHeaders.keySet()) {
            synchronized (this) {
                try {
                    Iterator<BandwidthMetrics5> it = this.trackedResponseHeaders.iterator();
                    z = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().matches(str)) {
                            z = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                List<String> list = responseHeaders.get(str);
                Intrinsics.checkNotNull(list);
                List<String> list2 = list;
                if (list2.isEmpty()) {
                    hashtable.put(str, "");
                } else if (list2.size() == 1) {
                    hashtable.put(str, list2.get(0));
                } else if (list2.size() > 1) {
                    String str2 = list2.get(0);
                    int size = list2.size();
                    for (i = 1; i < size; i++) {
                        str2 = str2 + ", " + list2.get(i);
                    }
                    hashtable.put(str, str2);
                }
            }
        }
        return hashtable;
    }

    private final boolean shouldDispatchEvent(BandwidthMetricData data, PlaybackEvent event) throws JSONException {
        long jLongValue = 1000;
        if (data.getRequestMediaDuration() != null) {
            Long requestMediaDuration = data.getRequestMediaDuration();
            Intrinsics.checkNotNullExpressionValue(requestMediaDuration, "getRequestMediaDuration(...)");
            if (requestMediaDuration.longValue() >= 1000) {
                Long requestMediaDuration2 = data.getRequestMediaDuration();
                Intrinsics.checkNotNull(requestMediaDuration2);
                jLongValue = requestMediaDuration2.longValue();
            }
        }
        this.requestSegmentDuration = jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.lastRequestSentAt;
        if (jCurrentTimeMillis > this.requestSegmentDuration) {
            this.lastRequestSentAt = System.currentTimeMillis();
            this.numberOfRequestCompletedBeaconsSentPerSegment = 0;
            this.numberOfRequestCancelBeaconsSentPerSegment = 0;
            this.numberOfRequestFailedBeaconsSentPerSegment = 0;
        }
        if (event instanceof RequestCompleted) {
            this.numberOfRequestCompletedBeaconsSentPerSegment++;
        }
        if (event instanceof RequestCanceled) {
            this.numberOfRequestCancelBeaconsSentPerSegment++;
        }
        if (event instanceof RequestFailed) {
            this.numberOfRequestFailedBeaconsSentPerSegment++;
        }
        int i = this.numberOfRequestCompletedBeaconsSentPerSegment;
        int i2 = this.maxNumberOfEventsPerSegmentDuration;
        if (i > i2 || this.numberOfRequestCancelBeaconsSentPerSegment > i2 || this.numberOfRequestFailedBeaconsSentPerSegment > i2) {
            if (this.debugModeOn) {
                MuxLogger.m1117d("BandwidthMetrics", "Dropping event: " + event.getType() + "\nnumberOfRequestCompletedBeaconsSentPerSegment: " + this.numberOfRequestCompletedBeaconsSentPerSegment + "\nnumberOfRequestCancelBeaconsSentPerSegment: " + this.numberOfRequestCancelBeaconsSentPerSegment + "\nnumberOfRequestFailedBeaconsSentPerSegment: " + this.numberOfRequestFailedBeaconsSentPerSegment + "\ntimeDiff: " + jCurrentTimeMillis);
            }
            return false;
        }
        if (this.debugModeOn) {
            MuxLogger.m1117d("BandwidthMetrics", "All good: " + event.getType() + "\nnumberOfRequestCompletedBeaconsSentPerSegment: " + this.numberOfRequestCompletedBeaconsSentPerSegment + "\nnumberOfRequestCancelBeaconsSentPerSegment: " + this.numberOfRequestCancelBeaconsSentPerSegment + "\nnumberOfRequestFailedBeaconsSentPerSegment: " + this.numberOfRequestFailedBeaconsSentPerSegment + "\ntimeDiff: " + jCurrentTimeMillis);
        }
        return true;
    }
}
