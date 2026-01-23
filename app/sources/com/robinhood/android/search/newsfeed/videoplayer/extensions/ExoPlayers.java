package com.robinhood.android.search.newsfeed.videoplayer.extensions;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MergingMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExoPlayers.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007\u001a@\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\"\u0010\u000b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\fH\u0007\u001a.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0003¨\u0006\u0014"}, m3636d2 = {"prepareNewsFeedVideo", "", "Landroidx/media3/exoplayer/ExoPlayer;", "context", "Landroid/content/Context;", "userAgent", "", "videoUrl", "Landroid/net/Uri;", "captionsUrl", "prepareNewsFeedVideos", "videosAndCaptionsUrlsAndTags", "", "Lkotlin/Triple;", "", "createMediaSource", "Landroidx/media3/exoplayer/source/BaseMediaSource;", "dataSourceFactory", "Landroidx/media3/datasource/DataSource$Factory;", "tag", "feature-search_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.videoplayer.extensions.ExoPlayersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ExoPlayers {
    public static /* synthetic */ void prepareNewsFeedVideo$default(ExoPlayer exoPlayer, Context context, String str, Uri uri, Uri uri2, int i, Object obj) {
        if ((i & 8) != 0) {
            uri2 = null;
        }
        prepareNewsFeedVideo(exoPlayer, context, str, uri, uri2);
    }

    public static final void prepareNewsFeedVideo(ExoPlayer exoPlayer, Context context, String userAgent, Uri videoUrl, Uri uri) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        exoPlayer.setMediaSource(createMediaSource$default(new DefaultDataSource.Factory(context, new DefaultHttpDataSource.Factory().setUserAgent(userAgent)), videoUrl, uri, null, 8, null));
        exoPlayer.prepare();
    }

    public static final void prepareNewsFeedVideos(ExoPlayer exoPlayer, Context context, String userAgent, List<? extends Tuples3<? extends Uri, ? extends Uri, ? extends Object>> videosAndCaptionsUrlsAndTags) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(videosAndCaptionsUrlsAndTags, "videosAndCaptionsUrlsAndTags");
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context, new DefaultHttpDataSource.Factory().setUserAgent(userAgent));
        ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource(new MediaSource[0]);
        for (Tuples3<? extends Uri, ? extends Uri, ? extends Object> tuples3 : videosAndCaptionsUrlsAndTags) {
            concatenatingMediaSource.addMediaSource(createMediaSource(factory, tuples3.component1(), tuples3.component2(), tuples3.component3()));
        }
        exoPlayer.setMediaSource(concatenatingMediaSource);
        exoPlayer.prepare();
    }

    static /* synthetic */ BaseMediaSource createMediaSource$default(DataSource.Factory factory, Uri uri, Uri uri2, Object obj, int i, Object obj2) {
        if ((i & 8) != 0) {
            obj = null;
        }
        return createMediaSource(factory, uri, uri2, obj);
    }

    private static final BaseMediaSource createMediaSource(DataSource.Factory factory, Uri uri, Uri uri2, Object obj) {
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(uri).setTag(obj).build();
        Intrinsics.checkNotNullExpressionValue(mediaItemBuild, "build(...)");
        HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(factory).setAllowChunklessPreparation(true).createMediaSource(mediaItemBuild);
        Intrinsics.checkNotNullExpressionValue(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
        if (uri2 == null) {
            return hlsMediaSourceCreateMediaSource;
        }
        MediaItem.SubtitleConfiguration subtitleConfigurationBuild = new MediaItem.SubtitleConfiguration.Builder(uri2).setMimeType("application/ttml+xml").setLanguage("en").setSelectionFlags(1).build();
        Intrinsics.checkNotNullExpressionValue(subtitleConfigurationBuild, "build(...)");
        SingleSampleMediaSource singleSampleMediaSourceCreateMediaSource = new SingleSampleMediaSource.Factory(factory).setTreatLoadErrorsAsEndOfStream(true).createMediaSource(subtitleConfigurationBuild, -9223372036854775807L);
        Intrinsics.checkNotNullExpressionValue(singleSampleMediaSourceCreateMediaSource, "createMediaSource(...)");
        return new MergingMediaSource(hlsMediaSourceCreateMediaSource, singleSampleMediaSourceCreateMediaSource);
    }
}
