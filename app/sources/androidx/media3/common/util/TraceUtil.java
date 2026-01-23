package androidx.media3.common.util;

import android.os.Trace;

/* loaded from: classes4.dex */
public final class TraceUtil {
    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
