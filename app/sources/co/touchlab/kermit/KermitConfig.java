package co.touchlab.kermit;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KermitConfig.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m3636d2 = {"mutableLoggerConfigInit", "Lco/touchlab/kermit/MutableLoggerConfig;", "logWriters", "", "Lco/touchlab/kermit/LogWriter;", "kermit-core_debug"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: co.touchlab.kermit.KermitConfigKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class KermitConfig {
    public static final MutableLoggerConfig mutableLoggerConfigInit(List<? extends LogWriter> logWriters) {
        Intrinsics.checkNotNullParameter(logWriters, "logWriters");
        return new JvmMutableLoggerConfig(logWriters);
    }
}
