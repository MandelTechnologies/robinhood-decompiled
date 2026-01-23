package io.bitdrift.capture.providers;

import java.util.Date;
import kotlin.Metadata;

/* compiled from: SystemDateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0005"}, m3636d2 = {"Lio/bitdrift/capture/providers/SystemDateProvider;", "Lio/bitdrift/capture/providers/DateProvider;", "()V", "invoke", "Ljava/util/Date;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SystemDateProvider implements DateProvider {
    @Override // io.bitdrift.capture.providers.DateProvider, kotlin.jvm.functions.Function0
    public Date invoke() {
        return new Date();
    }
}
