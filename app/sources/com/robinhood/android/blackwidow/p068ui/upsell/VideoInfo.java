package com.robinhood.android.blackwidow.p068ui.upsell;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/ui/upsell/VideoInfo;", "", "mediaSource", "Landroidx/media3/exoplayer/source/MediaSource;", "mediaSourceUri", "Landroid/net/Uri;", "mediaItem", "Landroidx/media3/common/MediaItem;", "<init>", "(Landroidx/media3/exoplayer/source/MediaSource;Landroid/net/Uri;Landroidx/media3/common/MediaItem;)V", "getMediaSource", "()Landroidx/media3/exoplayer/source/MediaSource;", "getMediaSourceUri", "()Landroid/net/Uri;", "getMediaItem", "()Landroidx/media3/common/MediaItem;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoInfo {
    public static final int $stable = 8;
    private final MediaItem mediaItem;
    private final MediaSource mediaSource;
    private final Uri mediaSourceUri;

    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, MediaSource mediaSource, Uri uri, MediaItem mediaItem, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaSource = videoInfo.mediaSource;
        }
        if ((i & 2) != 0) {
            uri = videoInfo.mediaSourceUri;
        }
        if ((i & 4) != 0) {
            mediaItem = videoInfo.mediaItem;
        }
        return videoInfo.copy(mediaSource, uri, mediaItem);
    }

    /* renamed from: component1, reason: from getter */
    public final MediaSource getMediaSource() {
        return this.mediaSource;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getMediaSourceUri() {
        return this.mediaSourceUri;
    }

    /* renamed from: component3, reason: from getter */
    public final MediaItem getMediaItem() {
        return this.mediaItem;
    }

    public final VideoInfo copy(MediaSource mediaSource, Uri mediaSourceUri, MediaItem mediaItem) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceUri, "mediaSourceUri");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        return new VideoInfo(mediaSource, mediaSourceUri, mediaItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) other;
        return Intrinsics.areEqual(this.mediaSource, videoInfo.mediaSource) && Intrinsics.areEqual(this.mediaSourceUri, videoInfo.mediaSourceUri) && Intrinsics.areEqual(this.mediaItem, videoInfo.mediaItem);
    }

    public int hashCode() {
        return (((this.mediaSource.hashCode() * 31) + this.mediaSourceUri.hashCode()) * 31) + this.mediaItem.hashCode();
    }

    public String toString() {
        return "VideoInfo(mediaSource=" + this.mediaSource + ", mediaSourceUri=" + this.mediaSourceUri + ", mediaItem=" + this.mediaItem + ")";
    }

    public VideoInfo(MediaSource mediaSource, Uri mediaSourceUri, MediaItem mediaItem) {
        Intrinsics.checkNotNullParameter(mediaSource, "mediaSource");
        Intrinsics.checkNotNullParameter(mediaSourceUri, "mediaSourceUri");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.mediaSource = mediaSource;
        this.mediaSourceUri = mediaSourceUri;
        this.mediaItem = mediaItem;
    }

    public final MediaSource getMediaSource() {
        return this.mediaSource;
    }

    public final Uri getMediaSourceUri() {
        return this.mediaSourceUri;
    }

    public final MediaItem getMediaItem() {
        return this.mediaItem;
    }
}
