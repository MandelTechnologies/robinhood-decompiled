package io.bitdrift.capture;

import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime2;
import io.bitdrift.capture.common.Runtime3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JniRuntime.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lio/bitdrift/capture/JniRuntime;", "Lio/bitdrift/capture/common/Runtime;", "logger", "", "Lio/bitdrift/capture/LoggerId;", "(J)V", "getConfigValue", "", "config", "Lio/bitdrift/capture/common/RuntimeConfig;", "isEnabled", "", "feature", "Lio/bitdrift/capture/common/RuntimeFeature;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class JniRuntime implements Runtime {
    private final long logger;

    public JniRuntime(long j) {
        this.logger = j;
    }

    @Override // io.bitdrift.capture.common.Runtime
    public boolean isEnabled(Runtime3 feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return JniRuntime2.INSTANCE.isRuntimeEnabled(this.logger, feature.getFeatureName(), feature.getDefaultValue());
    }

    @Override // io.bitdrift.capture.common.Runtime
    public int getConfigValue(Runtime2 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return JniRuntime2.INSTANCE.runtimeValue(this.logger, config.getConfigName(), config.getDefaultValue());
    }
}
