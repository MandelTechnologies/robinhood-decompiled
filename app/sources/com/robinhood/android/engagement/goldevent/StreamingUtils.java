package com.robinhood.android.engagement.goldevent;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsManifest;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: StreamingUtils.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u000eH\u0003\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u000eH\u0001\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000eH\u0001\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u000eH\u0001\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m3636d2 = {"LIVE_OFFSET_TARGET_MS", "", "LIVE_OFFSET_WITHIN_TARGET", "SEEK_BACK_INCREMENT_MS", "SEEK_INCREMENT_MS", "VIDEO_ASPECT_RATIO", "", "VIDEO_CONTROL_TOUCH_TARGET", "Landroidx/compose/ui/unit/Dp;", "getVIDEO_CONTROL_TOUCH_TARGET", "()F", "F", "getHlsManifest", "Landroidx/media3/exoplayer/hls/HlsManifest;", "Landroidx/media3/exoplayer/ExoPlayer;", "hasValidHlsStream", "", "hasEndTag", "getDvrWindowSize", "", "getMediaSource", "Landroidx/media3/exoplayer/source/MediaSource;", "videoUrl", "", "createHlsMediaItem", "Landroidx/media3/common/MediaItem;", "uri", "feature-live-event-stream_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.engagement.goldevent.StreamingUtilsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StreamingUtils {
    public static final int LIVE_OFFSET_TARGET_MS = 3000;
    public static final int LIVE_OFFSET_WITHIN_TARGET = 6000;
    public static final int SEEK_BACK_INCREMENT_MS = 1000;
    public static final int SEEK_INCREMENT_MS = 1000;
    public static final float VIDEO_ASPECT_RATIO = 1.7777778f;
    private static final float VIDEO_CONTROL_TOUCH_TARGET = C2002Dp.m7995constructorimpl(48);

    public static final float getVIDEO_CONTROL_TOUCH_TARGET() {
        return VIDEO_CONTROL_TOUCH_TARGET;
    }

    private static final HlsManifest getHlsManifest(ExoPlayer exoPlayer) {
        Object currentManifest = exoPlayer.getCurrentManifest();
        if (currentManifest instanceof HlsManifest) {
            return (HlsManifest) currentManifest;
        }
        return null;
    }

    public static final boolean hasValidHlsStream(ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        return (getHlsManifest(exoPlayer) == null || exoPlayer.getCurrentTimeline().isEmpty()) ? false : true;
    }

    public static final boolean hasEndTag(ExoPlayer exoPlayer) {
        HlsMediaPlaylist hlsMediaPlaylist;
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        HlsManifest hlsManifest = getHlsManifest(exoPlayer);
        return (hlsManifest == null || (hlsMediaPlaylist = hlsManifest.mediaPlaylist) == null || !hlsMediaPlaylist.hasEndTag) ? false : true;
    }

    public static final long getDvrWindowSize(ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        if (!exoPlayer.isCurrentMediaItemLive()) {
            return 0L;
        }
        Timeline currentTimeline = exoPlayer.getCurrentTimeline();
        Intrinsics.checkNotNullExpressionValue(currentTimeline, "getCurrentTimeline(...)");
        Timeline.Window window = new Timeline.Window();
        currentTimeline.getWindow(exoPlayer.getCurrentMediaItemIndex(), window);
        return window.getDefaultPositionMs();
    }

    public static final MediaSource getMediaSource(String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        DefaultHttpDataSource.Factory allowCrossProtocolRedirects = new DefaultHttpDataSource.Factory().setAllowCrossProtocolRedirects(true);
        Intrinsics.checkNotNullExpressionValue(allowCrossProtocolRedirects, "setAllowCrossProtocolRedirects(...)");
        HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(allowCrossProtocolRedirects).setLoadErrorHandlingPolicy((LoadErrorHandlingPolicy) new DefaultLoadErrorHandlingPolicy(Integer.MAX_VALUE)).createMediaSource(MediaItem.fromUri(videoUrl));
        Intrinsics.checkNotNullExpressionValue(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
        return hlsMediaSourceCreateMediaSource;
    }

    public static final MediaItem createHlsMediaItem(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        MediaItem.Builder mimeType = new MediaItem.Builder().setUri(uri).setMimeType("application/x-mpegURL");
        MediaItem.LiveConfiguration.Builder minPlaybackSpeed = new MediaItem.LiveConfiguration.Builder().setMaxPlaybackSpeed(1.02f).setMinPlaybackSpeed(0.97f);
        Duration.Companion companion = Duration.INSTANCE;
        DurationUnitJvm durationUnitJvm = DurationUnitJvm.SECONDS;
        MediaItem mediaItemBuild = mimeType.setLiveConfiguration(minPlaybackSpeed.setMaxOffsetMs(Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(5, durationUnitJvm))).setTargetOffsetMs(Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(3, durationUnitJvm))).setMinOffsetMs(Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(2, durationUnitJvm))).build()).build();
        Intrinsics.checkNotNullExpressionValue(mediaItemBuild, "build(...)");
        return mediaItemBuild;
    }
}
