package io.bitdrift.capture;

import android.util.Log;
import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.bitdrift.capture.Capture3;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.providers.DateProvider;
import io.bitdrift.capture.providers.FieldProvider;
import io.bitdrift.capture.providers.SystemDateProvider;
import io.bitdrift.capture.providers.session.SessionStrategy;
import io.bitdrift.capture.reports.FatalIssueReporter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: Capture.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lio/bitdrift/capture/Capture;", "", "<init>", "()V", "Lio/bitdrift/capture/ILogger;", "logger", "()Lio/bitdrift/capture/ILogger;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/bitdrift/capture/LoggerState;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/bitdrift/capture/reports/FatalIssueReporter;", "fatalIssueReporter", "Lio/bitdrift/capture/reports/FatalIssueReporter;", "Logger", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Capture {
    public static final Capture INSTANCE = new Capture();
    private static final AtomicReference<Capture3> default = new AtomicReference<>(Capture3.NotStarted.INSTANCE);
    private static final FatalIssueReporter fatalIssueReporter = new FatalIssueReporter(null, null, null, 7, null);

    private Capture() {
    }

    public final ILogger logger() {
        Capture3 capture3 = default.get();
        if ((capture3 instanceof Capture3.NotStarted) || (capture3 instanceof Capture3.Starting)) {
            return null;
        }
        if (capture3 instanceof Capture3.Started) {
            return ((Capture3.Started) capture3).getLogger();
        }
        if (capture3 instanceof Capture3.StartFailure) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: Capture.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\f\u0010\rJA\u0010\u000e\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\u000e\u0010\rJO\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJW\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\u0003R\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0003\u001a\u0004\b*\u0010+R\u001c\u00100\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0003\u001a\u0004\b.\u0010+¨\u00061"}, m3636d2 = {"Lio/bitdrift/capture/Capture$Logger;", "", "<init>", "()V", "", "", "fields", "", "throwable", "Lkotlin/Function0;", "message", "", "logError", "(Ljava/util/Map;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "logInfo", "apiKey", "Lio/bitdrift/capture/providers/session/SessionStrategy;", "sessionStrategy", "Lio/bitdrift/capture/Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "Lio/bitdrift/capture/providers/FieldProvider;", "fieldProviders", "Lio/bitdrift/capture/providers/DateProvider;", "dateProvider", "Lokhttp3/HttpUrl;", "apiUrl", "start", "(Ljava/lang/String;Lio/bitdrift/capture/providers/session/SessionStrategy;Lio/bitdrift/capture/Configuration;Ljava/util/List;Lio/bitdrift/capture/providers/DateProvider;Lokhttp3/HttpUrl;)V", "Lio/bitdrift/capture/IBridge;", "bridge", "start$platform_jvm_capture_capture_logger_lib_kt", "(Ljava/lang/String;Lio/bitdrift/capture/providers/session/SessionStrategy;Lio/bitdrift/capture/Configuration;Ljava/util/List;Lio/bitdrift/capture/providers/DateProvider;Lokhttp3/HttpUrl;Lio/bitdrift/capture/IBridge;)V", "startNewSession", "defaultCaptureApiUrl", "Lokhttp3/HttpUrl;", "Lio/bitdrift/capture/common/MainThreadHandler;", "mainThreadHandler$delegate", "Lkotlin/Lazy;", "getMainThreadHandler", "()Lio/bitdrift/capture/common/MainThreadHandler;", "mainThreadHandler", "getSessionId", "()Ljava/lang/String;", "getSessionId$annotations", "sessionId", "getSessionUrl", "getSessionUrl$annotations", "sessionUrl", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Logger {
        public static final Logger INSTANCE = new Logger();
        private static final HttpUrl defaultCaptureApiUrl = new HttpUrl.Builder().scheme(Constants.SCHEME).host("api.bitdrift.io").build();

        /* renamed from: mainThreadHandler$delegate, reason: from kotlin metadata */
        private static final Lazy mainThreadHandler = LazyKt.lazy(new Function0<MainThreadHandler>() { // from class: io.bitdrift.capture.Capture$Logger$mainThreadHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MainThreadHandler invoke() {
                return new MainThreadHandler();
            }
        });

        private Logger() {
        }

        public static /* synthetic */ void start$default(String str, SessionStrategy sessionStrategy, Configuration configuration, List list, DateProvider dateProvider, HttpUrl httpUrl, int i, Object obj) {
            if ((i & 4) != 0) {
                configuration = new Configuration(null, 1, null);
            }
            Configuration configuration2 = configuration;
            if ((i & 8) != 0) {
                list = CollectionsKt.emptyList();
            }
            List list2 = list;
            DateProvider dateProvider2 = (i & 16) != 0 ? null : dateProvider;
            if ((i & 32) != 0) {
                httpUrl = defaultCaptureApiUrl;
            }
            start(str, sessionStrategy, configuration2, list2, dateProvider2, httpUrl);
        }

        @JvmStatic
        @JvmOverloads
        public static final synchronized void start(String apiKey, SessionStrategy sessionStrategy, Configuration configuration, List<? extends FieldProvider> fieldProviders, DateProvider dateProvider, HttpUrl apiUrl) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(sessionStrategy, "sessionStrategy");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(fieldProviders, "fieldProviders");
            Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
            start$platform_jvm_capture_capture_logger_lib_kt(apiKey, sessionStrategy, configuration, fieldProviders, dateProvider, apiUrl, CaptureJniLibrary.INSTANCE);
        }

        @JvmStatic
        @JvmOverloads
        public static final synchronized void start$platform_jvm_capture_capture_logger_lib_kt(String apiKey, SessionStrategy sessionStrategy, Configuration configuration, List<? extends FieldProvider> fieldProviders, DateProvider dateProvider, HttpUrl apiUrl, IBridge bridge) {
            DateProvider systemDateProvider;
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(sessionStrategy, "sessionStrategy");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(fieldProviders, "fieldProviders");
            Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
            Intrinsics.checkNotNullParameter(bridge, "bridge");
            if (ContextHolder.INSTANCE.isInitialized()) {
                if (D8$$SyntheticClass.m3291m(Capture.default, Capture3.NotStarted.INSTANCE, Capture3.Starting.INSTANCE)) {
                    if (dateProvider == null) {
                        try {
                            systemDateProvider = new SystemDateProvider();
                        } catch (Throwable th) {
                            Log.w("BitdriftCapture", "Failed to start Capture", th);
                            Capture.default.set(Capture3.StartFailure.INSTANCE);
                        }
                    } else {
                        systemDateProvider = dateProvider;
                    }
                    Capture.default.set(new Capture3.Started(new LoggerImpl(apiKey, apiUrl, null, configuration, fieldProviders, systemDateProvider, null, sessionStrategy, null, null, null, null, null, null, bridge, null, null, Capture.fatalIssueReporter, 114500, null)));
                } else {
                    Log.w("BitdriftCapture", "Multiple attempts to start Capture");
                }
                return;
            }
            Log.w("BitdriftCapture", "Attempted to initialize Capture before androidx.startup.Initializers are run. Aborting logger initialization.");
        }

        public static final String getSessionId() {
            ILogger iLoggerLogger = Capture.INSTANCE.logger();
            if (iLoggerLogger != null) {
                return iLoggerLogger.getSessionId();
            }
            return null;
        }

        public static final String getSessionUrl() {
            ILogger iLoggerLogger = Capture.INSTANCE.logger();
            if (iLoggerLogger != null) {
                return iLoggerLogger.getSessionUrl();
            }
            return null;
        }

        @JvmStatic
        public static final void startNewSession() {
            ILogger iLoggerLogger = Capture.INSTANCE.logger();
            if (iLoggerLogger != null) {
                iLoggerLogger.startNewSession();
            }
        }

        public static /* synthetic */ void logInfo$default(Map map, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                map = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logInfo(map, th, function0);
        }

        @JvmStatic
        @JvmOverloads
        public static final void logInfo(Map<String, String> fields, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            ILogger iLoggerLogger = Capture.INSTANCE.logger();
            if (iLoggerLogger != null) {
                iLoggerLogger.log(LogLevel.INFO, fields, throwable, message);
            }
        }

        public static /* synthetic */ void logError$default(Map map, Throwable th, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                map = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logError(map, th, function0);
        }

        @JvmStatic
        @JvmOverloads
        public static final void logError(Map<String, String> fields, Throwable throwable, Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            ILogger iLoggerLogger = Capture.INSTANCE.logger();
            if (iLoggerLogger != null) {
                iLoggerLogger.log(LogLevel.ERROR, fields, throwable, message);
            }
        }
    }
}
