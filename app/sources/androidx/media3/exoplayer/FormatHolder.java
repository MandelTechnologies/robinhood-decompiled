package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.drm.DrmSession;

/* loaded from: classes4.dex */
public final class FormatHolder {
    public DrmSession drmSession;

    /* renamed from: format, reason: collision with root package name */
    public Format f9709format;

    public void clear() {
        this.drmSession = null;
        this.f9709format = null;
    }
}
