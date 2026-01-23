package io.bitdrift.capture.utils;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdkDirectory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/utils/SdkDirectory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "getPath", "(Landroid/content/Context;)Ljava/lang/String;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SdkDirectory {
    public static final SdkDirectory INSTANCE = new SdkDirectory();

    private SdkDirectory() {
    }

    public final String getPath(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String absolutePath = new File(context.getApplicationContext().getFilesDir().getAbsolutePath(), "bitdrift_capture").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }
}
