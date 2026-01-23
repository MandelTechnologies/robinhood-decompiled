package androidx.camera.video.internal.compat;

import android.content.Context;
import android.media.AudioRecord;

/* loaded from: classes4.dex */
public final class Api31Impl {
    public static void setContext(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }
}
