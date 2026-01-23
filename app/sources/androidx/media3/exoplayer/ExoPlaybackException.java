package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ExoPlaybackException extends PlaybackException {
    final boolean isRecoverable;
    public final MediaSource.MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;

    /* renamed from: type, reason: collision with root package name */
    public final int f9708type;
    private static final String FIELD_TYPE = Util.intToStringMaxRadix(1001);
    private static final String FIELD_RENDERER_NAME = Util.intToStringMaxRadix(1002);
    private static final String FIELD_RENDERER_INDEX = Util.intToStringMaxRadix(1003);
    private static final String FIELD_RENDERER_FORMAT = Util.intToStringMaxRadix(1004);
    private static final String FIELD_RENDERER_FORMAT_SUPPORT = Util.intToStringMaxRadix(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);
    private static final String FIELD_IS_RECOVERABLE = Util.intToStringMaxRadix(ErrorCodes.SSL_HANDSHAKE_EXCEPTION);

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format2, int i2, boolean z, int i3) {
        if (format2 == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th, null, i3, str, i, format2, i2, z);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    private ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i, Throwable th, String str, int i2, String str2, int i3, Format format2, int i4, boolean z) {
        this(deriveMessage(i, str, str2, i3, format2, i4), th, i2, i, str2, i3, format2, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, Format format2, int i4, MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        Assertions.checkArgument(!z || i2 == 1);
        Assertions.checkArgument(th != null || i2 == 3);
        this.f9708type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = format2;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z;
    }

    public IOException getSourceException() {
        Assertions.checkState(this.f9708type == 0);
        return (IOException) Assertions.checkNotNull(getCause());
    }

    public Exception getRendererException() {
        Assertions.checkState(this.f9708type == 1);
        return (Exception) Assertions.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        Assertions.checkState(this.f9708type == 2);
        return (RuntimeException) Assertions.checkNotNull(getCause());
    }

    ExoPlaybackException copyWithMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.f9708type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    private static String deriveMessage(int i, String str, String str2, int i2, Format format2, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            str3 = str2 + " error, index=" + i2 + ", format=" + format2 + ", format_supported=" + Util.getFormatSupportString(i3);
        } else if (i == 3) {
            str3 = "Remote error";
        } else {
            str3 = "Unexpected runtime error";
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }
}
