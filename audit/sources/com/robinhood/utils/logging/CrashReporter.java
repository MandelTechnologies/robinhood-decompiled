package com.robinhood.utils.logging;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashReporter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J&\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J,\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014H&J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0001H&J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/utils/logging/CrashReporter;", "", "userIdentifier", "", "getUserIdentifier", "()Ljava/lang/String;", "setUserIdentifier", "(Ljava/lang/String;)V", "log", "", "message", "reportNonFatal", "t", "", "throwIfDebug", "", "metadata", "Lcom/robinhood/utils/logging/EventMetadata;", "reportLeak", "leakTrace", "", "addMetadata", "key", "value", "setContext", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface CrashReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmStatic
    static void init(CrashReporter crashReporter) {
        INSTANCE.init(crashReporter);
    }

    void addMetadata(String key, Object value);

    String getUserIdentifier();

    void log(String message);

    void reportLeak(Throwable t, String leakTrace, Map<String, ? extends Object> metadata);

    void reportNonFatal(Throwable t, boolean throwIfDebug, EventMetadata metadata);

    void setContext(String key, String value);

    void setUserIdentifier(String str);

    /* compiled from: CrashReporter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void reportNonFatal$default(CrashReporter crashReporter, Throwable th, boolean z, EventMetadata eventMetadata, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportNonFatal");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                eventMetadata = null;
            }
            crashReporter.reportNonFatal(th, z, eventMetadata);
        }
    }

    /* compiled from: CrashReporter.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0001H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J,\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001aH\u0016J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/utils/logging/CrashReporter$Companion;", "Lcom/robinhood/utils/logging/CrashReporter;", "<init>", "()V", "instance", "value", "", "userIdentifier", "getUserIdentifier", "()Ljava/lang/String;", "setUserIdentifier", "(Ljava/lang/String;)V", "init", "", "log", "message", "reportNonFatal", "t", "", "throwIfDebug", "", "metadata", "Lcom/robinhood/utils/logging/EventMetadata;", "reportLeak", "leakTrace", "", "", "addMetadata", "key", "setContext", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements CrashReporter {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static CrashReporter instance;

        private Companion() {
        }

        @Override // com.robinhood.utils.logging.CrashReporter
        public String getUserIdentifier() {
            CrashReporter crashReporter = instance;
            if (crashReporter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                crashReporter = null;
            }
            return crashReporter.getUserIdentifier();
        }

        @Override // com.robinhood.utils.logging.CrashReporter
        public void setUserIdentifier(String str) {
            CrashReporter crashReporter = instance;
            if (crashReporter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                crashReporter = null;
            }
            crashReporter.setUserIdentifier(str);
        }

        @JvmStatic
        public final void init(CrashReporter instance2) {
            Intrinsics.checkNotNullParameter(instance2, "instance");
            instance = instance2;
        }

        @Override // com.robinhood.utils.logging.CrashReporter
        public void log(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            CrashReporter crashReporter = instance;
            if (crashReporter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                crashReporter = null;
            }
            crashReporter.log(message);
        }

        @Override // com.robinhood.utils.logging.CrashReporter
        public void reportNonFatal(Throwable t, boolean throwIfDebug, EventMetadata metadata) {
            Intrinsics.checkNotNullParameter(t, "t");
            CrashReporter crashReporter = instance;
            if (crashReporter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                crashReporter = null;
            }
            crashReporter.reportNonFatal(t, throwIfDebug, metadata);
        }

        @Override // com.robinhood.utils.logging.CrashReporter
        public void reportLeak(Throwable t, String leakTrace, Map<String, ? extends Object> metadata) {
            Intrinsics.checkNotNullParameter(t, "t");
            Intrinsics.checkNotNullParameter(leakTrace, "leakTrace");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            CrashReporter crashReporter = instance;
            if (crashReporter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                crashReporter = null;
            }
            crashReporter.reportLeak(t, leakTrace, metadata);
        }

        @Override // com.robinhood.utils.logging.CrashReporter
        public void addMetadata(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            CrashReporter crashReporter = instance;
            if (crashReporter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                crashReporter = null;
            }
            crashReporter.addMetadata(key, value);
        }

        @Override // com.robinhood.utils.logging.CrashReporter
        public void setContext(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            CrashReporter crashReporter = instance;
            if (crashReporter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                crashReporter = null;
            }
            crashReporter.setContext(key, value);
        }
    }
}
