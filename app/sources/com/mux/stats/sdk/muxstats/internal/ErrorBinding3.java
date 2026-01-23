package com.mux.stats.sdk.muxstats.internal;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.mux.stats.sdk.muxstats.MuxErrorException;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorBinding.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/internal/ErrorPlayerListener;", "Landroidx/media3/common/Player$Listener;", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector", "<init>", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)V", "Landroidx/media3/common/PlaybackException;", "error", "", "onPlayerError", "(Landroidx/media3/common/PlaybackException;)V", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.stats.sdk.muxstats.internal.ErrorPlayerListener, reason: use source file name */
/* loaded from: classes27.dex */
final class ErrorBinding3 implements Player.Listener {
    private final MuxStateCollector collector;

    public ErrorBinding3(MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.collector = collector;
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ExoPlaybackException) {
            ErrorBinding.handleExoPlaybackException(this.collector, error.errorCode, (ExoPlaybackException) error);
            return;
        }
        this.collector.internalError(new MuxErrorException(error.errorCode, error.errorCode + ": " + error.getMessage()));
    }
}
