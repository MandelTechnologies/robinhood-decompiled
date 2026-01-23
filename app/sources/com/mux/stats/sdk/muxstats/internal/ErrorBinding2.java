package com.mux.stats.sdk.muxstats.internal;

import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.mux.android.util.Weak2;
import com.mux.stats.sdk.muxstats.MuxPlayerAdapter;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ErrorBinding.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/internal/ErrorBindings;", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "Landroidx/media3/exoplayer/ExoPlayer;", "()V", "<set-?>", "Landroidx/media3/common/Player$Listener;", "playerListener", "getPlayerListener", "()Landroidx/media3/common/Player$Listener;", "setPlayerListener", "(Landroidx/media3/common/Player$Listener;)V", "playerListener$delegate", "Lkotlin/properties/ReadWriteProperty;", "bindPlayer", "", "player", "collector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "newListener", "Lcom/mux/stats/sdk/muxstats/internal/ErrorPlayerListener;", "unbindPlayer", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.internal.ErrorBindings, reason: use source file name */
/* loaded from: classes27.dex */
public final class ErrorBinding2 implements MuxPlayerAdapter.PlayerBinding<ExoPlayer> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ErrorBinding2.class, "playerListener", "getPlayerListener()Landroidx/media3/common/Player$Listener;", 0))};

    /* renamed from: playerListener$delegate, reason: from kotlin metadata */
    private final Interfaces3 playerListener = Weak2.weak(null);

    private final Player.Listener getPlayerListener() {
        return (Player.Listener) this.playerListener.getValue(this, $$delegatedProperties[0]);
    }

    private final void setPlayerListener(Player.Listener listener) {
        this.playerListener.setValue(this, $$delegatedProperties[0], listener);
    }

    @Override // com.mux.stats.sdk.muxstats.MuxPlayerAdapter.PlayerBinding
    public void bindPlayer(ExoPlayer player, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        ErrorBinding3 errorBinding3NewListener = newListener(collector);
        player.addListener(errorBinding3NewListener);
        setPlayerListener(errorBinding3NewListener);
    }

    @Override // com.mux.stats.sdk.muxstats.MuxPlayerAdapter.PlayerBinding
    public void unbindPlayer(ExoPlayer player, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        MuxStateCollector.PlayerWatcher<?> playerWatcher = collector.getPlayerWatcher();
        if (playerWatcher != null) {
            playerWatcher.stop("player unbound");
        }
        collector.setPlayerWatcher(null);
        Player.Listener playerListener = getPlayerListener();
        if (playerListener != null) {
            player.removeListener(playerListener);
        }
    }

    private final ErrorBinding3 newListener(MuxStateCollector collector) {
        return new ErrorBinding3(collector);
    }
}
