package io.bitdrift.capture.replay;

import com.singular.sdk.internal.Constants;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: IInternalLogger.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&J4\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¨\u0006\f"}, m3636d2 = {"Lio/bitdrift/capture/replay/IInternalLogger;", "", "logDebugInternal", "", "message", "", "fields", "", "logErrorInternal", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "", "logVerboseInternal", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IInternalLogger {
    void logDebugInternal(String message, Map<String, String> fields);

    void logErrorInternal(String message, Throwable e, Map<String, String> fields);

    void logVerboseInternal(String message, Map<String, String> fields);

    /* compiled from: IInternalLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logVerboseInternal$default(IInternalLogger iInternalLogger, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logVerboseInternal");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            iInternalLogger.logVerboseInternal(str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logDebugInternal$default(IInternalLogger iInternalLogger, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDebugInternal");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            iInternalLogger.logDebugInternal(str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logErrorInternal$default(IInternalLogger iInternalLogger, String str, Throwable th, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logErrorInternal");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            iInternalLogger.logErrorInternal(str, th, map);
        }
    }
}
