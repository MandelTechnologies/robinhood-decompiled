package com.mux.stats.sdk.muxstats;

import android.view.View;
import com.mux.android.util.Weak2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: MuxPlayerAdapter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001!B3\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R/\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\u0010\u001a\u001a\u0004\u0018\u00018\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter;", "Landroid/view/View;", "PlayerView", "Player", "", "player", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector", "Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "uiDelegate", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "basicMetrics", "<init>", "(Ljava/lang/Object;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;)V", "", "unbindEverything", "()V", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "getUiDelegate", "()Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "getBasicMetrics", "()Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "<set-?>", "player$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPlayer", "()Ljava/lang/Object;", "setPlayer", "(Ljava/lang/Object;)V", "PlayerBinding", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class MuxPlayerAdapter<PlayerView extends View, Player> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MuxPlayerAdapter.class, "player", "getPlayer()Ljava/lang/Object;", 0))};
    private final PlayerBinding<Player> basicMetrics;
    private final MuxStateCollector collector;

    /* renamed from: player$delegate, reason: from kotlin metadata */
    private final Interfaces3 player;
    private final MuxUiDelegate<PlayerView> uiDelegate;

    /* compiled from: MuxPlayerAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "Player", "", "bindPlayer", "", "player", "collector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "(Ljava/lang/Object;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)V", "unbindPlayer", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface PlayerBinding<Player> {
        void bindPlayer(Player player, MuxStateCollector collector);

        void unbindPlayer(Player player, MuxStateCollector collector);
    }

    public MuxPlayerAdapter(Player player, MuxStateCollector collector, MuxUiDelegate<PlayerView> uiDelegate, PlayerBinding<Player> basicMetrics) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(uiDelegate, "uiDelegate");
        Intrinsics.checkNotNullParameter(basicMetrics, "basicMetrics");
        this.collector = collector;
        this.uiDelegate = uiDelegate;
        this.basicMetrics = basicMetrics;
        this.player = Weak2.weak(player);
        basicMetrics.bindPlayer(player, collector);
    }

    public final Player getPlayer() {
        return (Player) this.player.getValue(this, $$delegatedProperties[0]);
    }

    public final void unbindEverything() {
        Player player = getPlayer();
        if (player != null) {
            this.basicMetrics.unbindPlayer(player, this.collector);
        }
    }
}
