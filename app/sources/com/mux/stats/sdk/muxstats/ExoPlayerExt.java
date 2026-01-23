package com.mux.stats.sdk.muxstats;

import android.content.Context;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.mux.stats.sdk.core.CustomOptions;
import com.mux.stats.sdk.core.model.CustomerData;
import com.mux.stats.sdk.muxstats.MuxDataSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExoPlayerExt.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"monitorWithMuxData", "Lcom/mux/stats/sdk/muxstats/MuxStatsSdkMedia3;", "Landroidx/media3/exoplayer/ExoPlayer;", "context", "Landroid/content/Context;", "envKey", "", "customerData", "Lcom/mux/stats/sdk/core/model/CustomerData;", "playerView", "Landroid/view/View;", "customOptions", "Lcom/mux/stats/sdk/core/CustomOptions;", "logLevel", "Lcom/mux/stats/sdk/muxstats/MuxDataSdk$LogcatLevel;", "library-exo_At_latestRelease"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.stats.sdk.muxstats.ExoPlayerExtKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class ExoPlayerExt {
    public static /* synthetic */ MuxStatsSdkMedia3 monitorWithMuxData$default(ExoPlayer exoPlayer, Context context, String str, CustomerData customerData, View view, CustomOptions customOptions, MuxDataSdk.LogcatLevel logcatLevel, int i, Object obj) {
        if ((i & 8) != 0) {
            view = null;
        }
        if ((i & 16) != 0) {
            customOptions = null;
        }
        if ((i & 32) != 0) {
            logcatLevel = MuxDataSdk.LogcatLevel.NONE;
        }
        return monitorWithMuxData(exoPlayer, context, str, customerData, view, customOptions, logcatLevel);
    }

    public static final MuxStatsSdkMedia3<ExoPlayer> monitorWithMuxData(ExoPlayer exoPlayer, Context context, String envKey, CustomerData customerData, View view, CustomOptions customOptions, MuxDataSdk.LogcatLevel logLevel) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(envKey, "envKey");
        Intrinsics.checkNotNullParameter(customerData, "customerData");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return new MuxStatsSdkMedia3<>(context, envKey, customerData, exoPlayer, view, customOptions, null, null, logLevel, new ExoPlayerBinding(), 192, null);
    }
}
