package com.robinhood.android.lists.p173ui.ipo.video;

import android.net.Uri;
import androidx.media3.common.Player;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.utils.extensions.HttpUrl2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: VideoContainerViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÂ\u0003J\u001f\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0011HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerViewState;", "", "videoViewState", "Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerViewState$VideoViewState;", "audioEnabled", "", "<init>", "(Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerViewState$VideoViewState;Z)V", "videoUri", "Landroid/net/Uri;", "getVideoUri", "()Landroid/net/Uri;", "previewUri", "Lokhttp3/HttpUrl;", "getPreviewUri", "()Lokhttp3/HttpUrl;", "aspectRatio", "", "getAspectRatio", "()Ljava/lang/String;", "showSoundOn", "getShowSoundOn", "()Z", "showSoundOff", "getShowSoundOff", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "", "getVolume", "()F", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "VideoViewState", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VideoContainerViewState {
    public static final int $stable = 8;
    private final boolean audioEnabled;
    private final VideoViewState videoViewState;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoContainerViewState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final VideoViewState getVideoViewState() {
        return this.videoViewState;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getAudioEnabled() {
        return this.audioEnabled;
    }

    public static /* synthetic */ VideoContainerViewState copy$default(VideoContainerViewState videoContainerViewState, VideoViewState videoViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            videoViewState = videoContainerViewState.videoViewState;
        }
        if ((i & 2) != 0) {
            z = videoContainerViewState.audioEnabled;
        }
        return videoContainerViewState.copy(videoViewState, z);
    }

    public final VideoContainerViewState copy(VideoViewState videoViewState, boolean audioEnabled) {
        return new VideoContainerViewState(videoViewState, audioEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoContainerViewState)) {
            return false;
        }
        VideoContainerViewState videoContainerViewState = (VideoContainerViewState) other;
        return Intrinsics.areEqual(this.videoViewState, videoContainerViewState.videoViewState) && this.audioEnabled == videoContainerViewState.audioEnabled;
    }

    public int hashCode() {
        VideoViewState videoViewState = this.videoViewState;
        return ((videoViewState == null ? 0 : videoViewState.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled);
    }

    public String toString() {
        return "VideoContainerViewState(videoViewState=" + this.videoViewState + ", audioEnabled=" + this.audioEnabled + ")";
    }

    public VideoContainerViewState(VideoViewState videoViewState, boolean z) {
        this.videoViewState = videoViewState;
        this.audioEnabled = z;
    }

    public /* synthetic */ VideoContainerViewState(VideoViewState videoViewState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoViewState, (i & 2) != 0 ? false : z);
    }

    public final Uri getVideoUri() {
        VideoViewState videoViewState = this.videoViewState;
        if (videoViewState != null) {
            return videoViewState.getVideoUri();
        }
        return null;
    }

    public final HttpUrl getPreviewUri() {
        Uri previewUri;
        VideoViewState videoViewState = this.videoViewState;
        if (videoViewState == null || (previewUri = videoViewState.getPreviewUri()) == null) {
            return null;
        }
        return HttpUrl2.toHttpUrl(previewUri);
    }

    public final String getAspectRatio() {
        VideoViewState videoViewState = this.videoViewState;
        if (videoViewState != null) {
            return videoViewState.getAspectRatio();
        }
        return null;
    }

    public final boolean getShowSoundOn() {
        return this.audioEnabled;
    }

    public final boolean getShowSoundOff() {
        return !this.audioEnabled;
    }

    public final float getVolume() {
        return this.audioEnabled ? 1.0f : 0.0f;
    }

    /* compiled from: VideoContainerViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/video/VideoContainerViewState$VideoViewState;", "", "videoUri", "Landroid/net/Uri;", "previewUri", "aspectRatio", "", "player", "Landroidx/media3/common/Player;", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;Landroidx/media3/common/Player;)V", "getVideoUri", "()Landroid/net/Uri;", "getPreviewUri", "getAspectRatio", "()Ljava/lang/String;", "getPlayer", "()Landroidx/media3/common/Player;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VideoViewState {
        public static final int $stable = 8;
        private final String aspectRatio;
        private final Player player;
        private final Uri previewUri;
        private final Uri videoUri;

        public static /* synthetic */ VideoViewState copy$default(VideoViewState videoViewState, Uri uri, Uri uri2, String str, Player player, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = videoViewState.videoUri;
            }
            if ((i & 2) != 0) {
                uri2 = videoViewState.previewUri;
            }
            if ((i & 4) != 0) {
                str = videoViewState.aspectRatio;
            }
            if ((i & 8) != 0) {
                player = videoViewState.player;
            }
            return videoViewState.copy(uri, uri2, str, player);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getVideoUri() {
            return this.videoUri;
        }

        /* renamed from: component2, reason: from getter */
        public final Uri getPreviewUri() {
            return this.previewUri;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAspectRatio() {
            return this.aspectRatio;
        }

        /* renamed from: component4, reason: from getter */
        public final Player getPlayer() {
            return this.player;
        }

        public final VideoViewState copy(Uri videoUri, Uri previewUri, String aspectRatio, Player player) {
            Intrinsics.checkNotNullParameter(videoUri, "videoUri");
            Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
            Intrinsics.checkNotNullParameter(player, "player");
            return new VideoViewState(videoUri, previewUri, aspectRatio, player);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoViewState)) {
                return false;
            }
            VideoViewState videoViewState = (VideoViewState) other;
            return Intrinsics.areEqual(this.videoUri, videoViewState.videoUri) && Intrinsics.areEqual(this.previewUri, videoViewState.previewUri) && Intrinsics.areEqual(this.aspectRatio, videoViewState.aspectRatio) && Intrinsics.areEqual(this.player, videoViewState.player);
        }

        public int hashCode() {
            int iHashCode = this.videoUri.hashCode() * 31;
            Uri uri = this.previewUri;
            return ((((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.aspectRatio.hashCode()) * 31) + this.player.hashCode();
        }

        public String toString() {
            return "VideoViewState(videoUri=" + this.videoUri + ", previewUri=" + this.previewUri + ", aspectRatio=" + this.aspectRatio + ", player=" + this.player + ")";
        }

        public VideoViewState(Uri videoUri, Uri uri, String aspectRatio, Player player) {
            Intrinsics.checkNotNullParameter(videoUri, "videoUri");
            Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
            Intrinsics.checkNotNullParameter(player, "player");
            this.videoUri = videoUri;
            this.previewUri = uri;
            this.aspectRatio = aspectRatio;
            this.player = player;
        }

        public final Uri getVideoUri() {
            return this.videoUri;
        }

        public final Uri getPreviewUri() {
            return this.previewUri;
        }

        public final String getAspectRatio() {
            return this.aspectRatio;
        }

        public final Player getPlayer() {
            return this.player;
        }
    }
}
