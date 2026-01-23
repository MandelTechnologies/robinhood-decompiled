package com.mux.stats.sdk.muxstats.internal;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.mux.stats.sdk.muxstats.MuxErrorException;
import com.mux.stats.sdk.muxstats.MuxPlayerAdapter;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorBinding.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¨\u0006\n"}, m3636d2 = {"createErrorDataBinding", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "Landroidx/media3/exoplayer/ExoPlayer;", "handleExoPlaybackException", "", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "errorCode", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroidx/media3/exoplayer/ExoPlaybackException;", "library-exo_At_latestRelease"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.mux.stats.sdk.muxstats.internal.ErrorBindingKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class ErrorBinding {
    public static final /* synthetic */ MuxPlayerAdapter.PlayerBinding createErrorDataBinding() {
        return new ErrorBinding2();
    }

    public static final /* synthetic */ void handleExoPlaybackException(MuxStateCollector muxStateCollector, int i, ExoPlaybackException e) {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        Intrinsics.checkNotNullParameter(e, "e");
        int i2 = e.f9708type;
        if (i2 == 1) {
            Exception rendererException = e.getRendererException();
            Intrinsics.checkNotNullExpressionValue(rendererException, "getRendererException(...)");
            if (rendererException instanceof MediaCodecRenderer.DecoderInitializationException) {
                if (rendererException.getCause() instanceof MediaCodecUtil.DecoderQueryException) {
                    muxStateCollector.internalError(new MuxErrorException(i, "Unable to query device decoders"));
                    return;
                }
                MediaCodecRenderer.DecoderInitializationException decoderInitializationException = (MediaCodecRenderer.DecoderInitializationException) rendererException;
                if (decoderInitializationException.secureDecoderRequired) {
                    muxStateCollector.internalError(new MuxErrorException(i, "No secure decoder for " + decoderInitializationException.mimeType, decoderInitializationException.diagnosticInfo));
                    return;
                }
                muxStateCollector.internalError(new MuxErrorException(i, "No decoder for " + decoderInitializationException.mimeType, decoderInitializationException.diagnosticInfo));
                return;
            }
            muxStateCollector.internalError(new MuxErrorException(i, rendererException.getClass().getCanonicalName() + " - " + rendererException.getMessage()));
            return;
        }
        if (i2 == 0) {
            IOException sourceException = e.getSourceException();
            Intrinsics.checkNotNullExpressionValue(sourceException, "getSourceException(...)");
            muxStateCollector.internalError(new MuxErrorException(i, sourceException.getClass().getCanonicalName() + " - " + sourceException.getMessage()));
            return;
        }
        if (i2 == 2) {
            RuntimeException unexpectedException = e.getUnexpectedException();
            Intrinsics.checkNotNullExpressionValue(unexpectedException, "getUnexpectedException(...)");
            muxStateCollector.internalError(new MuxErrorException(i, unexpectedException.getClass().getCanonicalName() + " - " + unexpectedException.getMessage()));
            return;
        }
        muxStateCollector.internalError(new MuxErrorException(i, ExoPlaybackException.class.getCanonicalName() + " - " + e.getMessage()));
    }
}
