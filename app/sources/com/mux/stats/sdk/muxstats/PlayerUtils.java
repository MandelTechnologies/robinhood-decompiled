package com.mux.stats.sdk.muxstats;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import com.google.common.collect.ImmutableList;
import com.mux.android.util.UtilKt;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;

/* compiled from: PlayerUtils.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0004*\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u001a\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010\"\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010&\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"Landroidx/media3/common/Tracks;", "", "hasAtLeastOneVideoTrack", "(Landroidx/media3/common/Tracks;)Z", "R", "Landroidx/media3/common/Tracks$Group;", "Lkotlin/Function1;", "Landroidx/media3/common/Format;", "block", "", "mapFormats", "(Landroidx/media3/common/Tracks$Group;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Landroidx/media3/common/Player;", "player", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector", "", "catchUpPlayState", "(Landroidx/media3/common/Player;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)V", "catchUpStreamData", "", "reason", "handlePositionDiscontinuity", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;I)V", "playWhenReady", "playbackState", "handlePlayWhenReady", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;ZI)V", "watchPlayerPos", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Landroidx/media3/common/Player;)V", "handleExoPlaybackState", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;IZ)V", "Landroidx/media3/common/MediaItem;", "mediaItem", "handleMediaItemChanged", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Landroidx/media3/common/MediaItem;)V", "Landroidx/media3/common/MediaMetadata;", "mediaMetadata", "handleMediaMetadata", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Landroidx/media3/common/MediaMetadata;)V", "library_At_latestRelease"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.PlayerUtilsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class PlayerUtils {
    public static final boolean hasAtLeastOneVideoTrack(Tracks tracks) {
        Object obj;
        boolean zContains$default;
        Intrinsics.checkNotNullParameter(tracks, "<this>");
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(groups, 10));
        Iterator<Tracks.Group> it = groups.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getMediaTrackGroup());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TrackGroup) obj2).length > 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((TrackGroup) it2.next()).getFormat(0));
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            obj = null;
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            String str = ((Format) next).sampleMimeType;
            if (str != null) {
                Intrinsics.checkNotNull(str);
                zContains$default = StringsKt.contains$default((CharSequence) str, (CharSequence) "video", false, 2, (Object) null);
            } else {
                zContains$default = false;
            }
            if (zContains$default) {
                obj = next;
                break;
            }
        }
        return ((Format) obj) != null;
    }

    public static final <R> List<R> mapFormats(Tracks.Group group, Function1<? super Format, ? extends R> block) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        int i = group.length;
        for (int i2 = 0; i2 < i; i2++) {
            Format trackFormat = group.getTrackFormat(i2);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            arrayList.add(block.invoke(trackFormat));
        }
        return arrayList;
    }

    public static final /* synthetic */ void catchUpPlayState(Player player, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        MuxLogger.m1117d("PlayerUtils", "catchUpPlayState: Called. pwr is " + player.getPlayWhenReady());
        if (player.getPlayWhenReady()) {
            collector.play();
        }
        if (player.getPlaybackState() != 1) {
            handleExoPlaybackState(collector, player.getPlaybackState(), player.getPlayWhenReady());
        }
    }

    public static final /* synthetic */ void catchUpStreamData(Player player, MuxStateCollector collector) throws JSONException {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.getWindowCount() <= 0) {
            currentTimeline = null;
        }
        if (currentTimeline != null) {
            Timeline.Window window = new Timeline.Window();
            currentTimeline.getWindow(0, window);
            collector.setSourceDurationMs(window.getDurationMs());
        }
        VideoSize videoSize = player.getVideoSize();
        if (videoSize != null) {
            collector.setSourceWidth(videoSize.width);
            collector.setSourceHeight(videoSize.height);
        }
        MediaItem currentMediaItem = player.getCurrentMediaItem();
        if (currentMediaItem != null) {
            handleMediaItemChanged(collector, currentMediaItem);
        }
    }

    public static final /* synthetic */ void handlePositionDiscontinuity(MuxStateCollector muxStateCollector, int i) {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        if (i == 1 || i == 2) {
            muxStateCollector.seeking();
        }
    }

    public static final /* synthetic */ void handlePlayWhenReady(MuxStateCollector muxStateCollector, boolean z, int i) {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        if (z) {
            muxStateCollector.play();
            if (i == 3) {
                muxStateCollector.playing();
                return;
            }
            return;
        }
        if (muxStateCollector.get_playerState() != MuxPlayerState.PAUSED) {
            muxStateCollector.pause();
        }
    }

    public static final /* synthetic */ void watchPlayerPos(MuxStateCollector muxStateCollector, Player player) {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        Intrinsics.checkNotNullParameter(player, "player");
        muxStateCollector.setPlayerWatcher(new MuxStateCollector.PlayerWatcher<>(150L, muxStateCollector, player, new Function2<Player, MuxStateCollector, Long>() { // from class: com.mux.stats.sdk.muxstats.PlayerUtilsKt.watchPlayerPos.1
            @Override // kotlin.jvm.functions.Function2
            public final Long invoke(Player it, MuxStateCollector muxStateCollector2) {
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(muxStateCollector2, "<anonymous parameter 1>");
                return Long.valueOf(it.getCurrentPosition());
            }
        }));
        MuxStateCollector.PlayerWatcher<?> playerWatcher = muxStateCollector.getPlayerWatcher();
        if (playerWatcher != null) {
            playerWatcher.start();
        }
    }

    public static final /* synthetic */ void handleExoPlaybackState(MuxStateCollector muxStateCollector, int i, boolean z) {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        if (muxStateCollector.get_playerState() == MuxPlayerState.PLAYING_ADS) {
            return;
        }
        if (i == 1) {
            MuxLogger.m1117d("PlayerUtils", "entering IDLE");
            if (UtilKt.oneOf(muxStateCollector.get_playerState(), MuxPlayerState.PLAY, MuxPlayerState.PLAYING)) {
                muxStateCollector.pause();
                return;
            }
            return;
        }
        if (i == 2) {
            MuxLogger.m1117d("PlayerUtils", "entering BUFFERING");
            muxStateCollector.buffering();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            MuxLogger.m1117d("PlayerUtils", "entering ENDED");
            muxStateCollector.ended();
            return;
        }
        MuxLogger.m1117d("PlayerUtils", "entering READY");
        if (muxStateCollector.get_playerState() == MuxPlayerState.SEEKING) {
            muxStateCollector.seeked();
        }
        if (z) {
            muxStateCollector.playing();
        } else if (muxStateCollector.get_playerState() != MuxPlayerState.PAUSED) {
            muxStateCollector.pause();
        }
    }

    public static final /* synthetic */ void handleMediaItemChanged(MuxStateCollector muxStateCollector, MediaItem mediaItem) throws JSONException {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration != null) {
            Uri uri = localConfiguration.uri;
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            String authority = uri.getAuthority();
            VideoData videoData = new VideoData();
            videoData.setVideoSourceDomain(authority);
            videoData.setVideoSourceUrl(uri.toString());
            muxStateCollector.videoDataChange(videoData);
        }
        MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        Intrinsics.checkNotNullExpressionValue(mediaMetadata, "mediaMetadata");
        handleMediaMetadata(muxStateCollector, mediaMetadata);
    }

    public static final /* synthetic */ void handleMediaMetadata(MuxStateCollector muxStateCollector, MediaMetadata mediaMetadata) throws JSONException {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        Intrinsics.checkNotNullParameter(mediaMetadata, "mediaMetadata");
        Uri uri = mediaMetadata.artworkUri;
        CharSequence charSequence = mediaMetadata.title;
        VideoData videoData = new VideoData();
        if (uri != null) {
            videoData.setVideoPosterUrl(uri.toString());
        }
        if (charSequence != null) {
            videoData.setVideoTitle(charSequence.toString());
        }
        muxStateCollector.videoDataChange(videoData);
    }
}
