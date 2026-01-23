package io.bitdrift.capture;

import kotlin.Metadata;

/* compiled from: JniRuntime.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0086 J%\u0010\u000b\u001a\u00020\f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\fH\u0086 ¨\u0006\u000e"}, m3636d2 = {"Lio/bitdrift/capture/Jni;", "", "()V", "isRuntimeEnabled", "", "logger", "", "Lio/bitdrift/capture/LoggerId;", "feature", "", "defaultValue", "runtimeValue", "", "variableName", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.Jni, reason: use source file name */
/* loaded from: classes14.dex */
public final class JniRuntime2 {
    public static final JniRuntime2 INSTANCE = new JniRuntime2();

    public final native boolean isRuntimeEnabled(long logger, String feature, boolean defaultValue);

    public final native int runtimeValue(long logger, String variableName, int defaultValue);

    private JniRuntime2() {
    }
}
