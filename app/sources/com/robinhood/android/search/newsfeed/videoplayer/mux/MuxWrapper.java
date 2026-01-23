package com.robinhood.android.search.newsfeed.videoplayer.mux;

import android.app.Activity;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import com.mux.stats.sdk.core.model.CustomerData;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.muxstats.ExoPlayerBinding;
import com.mux.stats.sdk.muxstats.MuxStatsSdkMedia3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* compiled from: MuxWrapper.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\bR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/videoplayer/mux/MuxWrapper;", "", "<init>", "()V", "mux", "Lcom/mux/stats/sdk/muxstats/MuxStatsSdkMedia3;", "Landroidx/media3/exoplayer/ExoPlayer;", "setPlayer", "", "activity", "Landroid/app/Activity;", "playerName", "", "playerView", "Landroidx/media3/ui/PlayerView;", "updateVideo", "id", "title", "url", "Lokhttp3/HttpUrl;", "release", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MuxWrapper {
    private static final String ENV_KEY = "1ei965u9fpdb61fpmb3rtas34";
    private MuxStatsSdkMedia3<ExoPlayer> mux;
    public static final int $stable = 8;

    public final void setPlayer(Activity activity, String playerName, PlayerView playerView) throws JSONException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerView, "playerView");
        Player player = playerView.getPlayer();
        Intrinsics.checkNotNull(player, "null cannot be cast to non-null type androidx.media3.exoplayer.ExoPlayer");
        ExoPlayer exoPlayer = (ExoPlayer) player;
        CustomerData customerData = new CustomerData();
        CustomerPlayerData customerPlayerData = new CustomerPlayerData();
        customerPlayerData.setPlayerName(playerName);
        customerData.setCustomerPlayerData(customerPlayerData);
        customerData.setCustomerVideoData(new CustomerVideoData());
        MuxStatsSdkMedia3<ExoPlayer> muxStatsSdkMedia3 = new MuxStatsSdkMedia3<>(activity, ENV_KEY, customerData, exoPlayer, null, null, null, null, null, new ExoPlayerBinding(), 496, null);
        muxStatsSdkMedia3.setPlayerView(playerView.getVideoSurfaceView());
        this.mux = muxStatsSdkMedia3;
    }

    public final void updateVideo(String id, String title, HttpUrl url) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        MuxStatsSdkMedia3<ExoPlayer> muxStatsSdkMedia3 = this.mux;
        if (muxStatsSdkMedia3 != null) {
            CustomerVideoData customerVideoData = new CustomerVideoData();
            customerVideoData.setVideoId(id);
            customerVideoData.setVideoTitle(title);
            customerVideoData.setVideoSourceUrl(url.getUrl());
            muxStatsSdkMedia3.videoChange(customerVideoData);
        }
    }

    public final void release() {
        MuxStatsSdkMedia3<ExoPlayer> muxStatsSdkMedia3 = this.mux;
        if (muxStatsSdkMedia3 != null) {
            muxStatsSdkMedia3.release();
        }
        this.mux = null;
    }
}
