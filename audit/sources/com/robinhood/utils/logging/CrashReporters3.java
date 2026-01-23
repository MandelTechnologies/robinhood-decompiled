package com.robinhood.utils.logging;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashReporters.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J,\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/utils/logging/NoopCrashReporter;", "Lcom/robinhood/utils/logging/CrashReporter;", "<init>", "()V", "userIdentifier", "", "getUserIdentifier", "()Ljava/lang/String;", "setUserIdentifier", "(Ljava/lang/String;)V", "log", "", "message", "reportNonFatal", "t", "", "throwIfDebug", "", "metadata", "Lcom/robinhood/utils/logging/EventMetadata;", "reportLeak", "leakTrace", "", "", "addMetadata", "key", "value", "setContext", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.logging.NoopCrashReporter, reason: use source file name */
/* loaded from: classes12.dex */
public final class CrashReporters3 implements CrashReporter {
    public static final CrashReporters3 INSTANCE = new CrashReporters3();
    private static String userIdentifier;

    @Override // com.robinhood.utils.logging.CrashReporter
    public void addMetadata(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void reportLeak(Throwable t, String leakTrace, Map<String, ? extends Object> metadata) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(leakTrace, "leakTrace");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void reportNonFatal(Throwable t, boolean throwIfDebug, EventMetadata metadata) {
        Intrinsics.checkNotNullParameter(t, "t");
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void setContext(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    private CrashReporters3() {
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public String getUserIdentifier() {
        return userIdentifier;
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void setUserIdentifier(String str) {
        userIdentifier = str;
    }
}
