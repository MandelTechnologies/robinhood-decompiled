package com.mux.stats.sdk.muxstats;

import androidx.media3.exoplayer.ExoPlayer;
import com.mux.stats.sdk.muxstats.MuxPlayerAdapter;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetrics2;
import com.mux.stats.sdk.muxstats.bandwidth.BandwidthMetrics5;
import com.mux.stats.sdk.muxstats.internal.ErrorBinding;
import com.mux.stats.sdk.muxstats.internal.SessionDataBinding;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;

/* compiled from: ExoPlayerBinding.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/ExoPlayerBinding;", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "Landroidx/media3/exoplayer/ExoPlayer;", "()V", "errorBinding", "listener", "Lcom/mux/stats/sdk/muxstats/MuxAnalyticsListener;", "sessionDataBinding", "bindPlayer", "", "player", "collector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "unbindPlayer", "Companion", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public class ExoPlayerBinding implements MuxPlayerAdapter.PlayerBinding<ExoPlayer> {
    private ExoPlayerBinding2 listener;
    private final MuxPlayerAdapter.PlayerBinding<ExoPlayer> sessionDataBinding = SessionDataBinding.createExoSessionDataBinding();
    private final MuxPlayerAdapter.PlayerBinding<ExoPlayer> errorBinding = ErrorBinding.createErrorDataBinding();

    @Override // com.mux.stats.sdk.muxstats.MuxPlayerAdapter.PlayerBinding
    public void bindPlayer(ExoPlayer player, MuxStateCollector collector) throws JSONException {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        PlayerUtils.catchUpPlayState(player, collector);
        PlayerUtils.catchUpStreamData(player, collector);
        BandwidthMetrics5.ExactlyIgnoreCase exactlyIgnoreCase = new BandwidthMetrics5.ExactlyIgnoreCase("x-cdn");
        BandwidthMetrics5.ExactlyIgnoreCase exactlyIgnoreCase2 = new BandwidthMetrics5.ExactlyIgnoreCase("content-type");
        BandwidthMetrics5.ExactlyIgnoreCase exactlyIgnoreCase3 = new BandwidthMetrics5.ExactlyIgnoreCase("x-request-id");
        Pattern patternCompile = Pattern.compile("^x-litix-.*", 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        ExoPlayerBinding2 exoPlayerBinding2 = new ExoPlayerBinding2(player, new BandwidthMetrics2(player, collector, CollectionsKt.listOf((Object[]) new BandwidthMetrics5[]{exactlyIgnoreCase, exactlyIgnoreCase2, exactlyIgnoreCase3, new BandwidthMetrics5.Matching(patternCompile)})), collector);
        player.addAnalyticsListener(exoPlayerBinding2);
        this.listener = exoPlayerBinding2;
        this.errorBinding.bindPlayer(player, collector);
        this.sessionDataBinding.bindPlayer(player, collector);
    }

    @Override // com.mux.stats.sdk.muxstats.MuxPlayerAdapter.PlayerBinding
    public void unbindPlayer(ExoPlayer player, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        ExoPlayerBinding2 exoPlayerBinding2 = this.listener;
        if (exoPlayerBinding2 != null) {
            player.removeAnalyticsListener(exoPlayerBinding2);
        }
        MuxStateCollector.PlayerWatcher<?> playerWatcher = collector.getPlayerWatcher();
        if (playerWatcher != null) {
            playerWatcher.stop("player unbound");
        }
        this.listener = null;
        this.sessionDataBinding.unbindPlayer(player, collector);
        this.errorBinding.unbindPlayer(player, collector);
    }
}
