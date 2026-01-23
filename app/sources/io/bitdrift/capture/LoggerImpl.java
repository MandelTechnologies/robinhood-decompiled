package io.bitdrift.capture;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.system.Os;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.adjust.sdk.Constants;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.singular.sdk.internal.Constants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.bitdrift.capture.ContextHolder;
import io.bitdrift.capture.LoggerImpl2;
import io.bitdrift.capture.attributes.ClientAttributes;
import io.bitdrift.capture.attributes.DeviceAttributes;
import io.bitdrift.capture.attributes.NetworkAttributes;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.common.Runtime3;
import io.bitdrift.capture.common.WindowManager;
import io.bitdrift.capture.error.ErrorReporterService;
import io.bitdrift.capture.error.IErrorReporter;
import io.bitdrift.capture.events.AppUpdateListenerLogger;
import io.bitdrift.capture.events.SessionReplayTarget;
import io.bitdrift.capture.events.common.PowerMonitor;
import io.bitdrift.capture.events.device.DeviceStateListenerLogger;
import io.bitdrift.capture.events.lifecycle.AppExitLogger;
import io.bitdrift.capture.events.lifecycle.AppLifecycleListenerLogger;
import io.bitdrift.capture.events.lifecycle.EventsListenerTarget;
import io.bitdrift.capture.events.performance.BatteryMonitor;
import io.bitdrift.capture.events.performance.DiskUsageMonitor;
import io.bitdrift.capture.events.performance.JankStatsMonitor;
import io.bitdrift.capture.events.performance.MemoryMetricsProvider;
import io.bitdrift.capture.events.performance.ResourceUtilizationTarget;
import io.bitdrift.capture.network.HttpRequestInfo;
import io.bitdrift.capture.network.HttpResponseInfo;
import io.bitdrift.capture.network.ICaptureNetwork;
import io.bitdrift.capture.network.okhttp.OkHttpApiClient;
import io.bitdrift.capture.network.okhttp.OkHttpNetwork;
import io.bitdrift.capture.providers.DateProvider;
import io.bitdrift.capture.providers.FieldProvider;
import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.providers.FieldProvider4;
import io.bitdrift.capture.providers.MetadataProvider;
import io.bitdrift.capture.providers.session.SessionStrategy;
import io.bitdrift.capture.reports.IFatalIssueReporter;
import io.bitdrift.capture.threading.CaptureDispatchers;
import io.bitdrift.capture.utils.SdkDirectory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnitJvm;
import kotlin.time.TimeSource;
import okhttp3.HttpUrl;

/* compiled from: LoggerImpl.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u00020-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020-H\u0003¢\u0006\u0004\b3\u00104JC\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`82\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010)2\b\u00107\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010@\u001a\u00020-2\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010C\u001a\u00020-2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020-2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bC\u0010GJE\u0010C\u001a\u00020-2\u0006\u0010I\u001a\u00020H2\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010)2\b\u00107\u001a\u0004\u0018\u0001062\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020JH\u0016¢\u0006\u0004\bC\u0010LJ/\u0010U\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020N2\u0006\u0010R\u001a\u00020QH\u0000¢\u0006\u0004\bS\u0010TJ\u007f\u0010C\u001a\u00020-2\u0006\u0010W\u001a\u00020V2\u0006\u0010I\u001a\u00020H2\u001c\b\u0002\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`82\u001c\b\u0002\u0010X\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`82\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010=\u001a\u00020<2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020JH\u0001¢\u0006\u0004\b[\u0010\\J.\u0010a\u001a\u00020-2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020)2\u0006\u0010^\u001a\u00020]H\u0000ø\u0001\u0000¢\u0006\u0004\b_\u0010`J.\u0010c\u001a\u00020-2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0)2\u0006\u0010^\u001a\u00020]H\u0000ø\u0001\u0000¢\u0006\u0004\bb\u0010`J.\u0010e\u001a\u00020-2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0)2\u0006\u0010^\u001a\u00020]H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010`J\u000f\u0010f\u001a\u00020-H\u0016¢\u0006\u0004\bf\u00104J\u001f\u0010i\u001a\u00020<2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010jR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010kR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010lR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010mR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010nR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010oR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R+\u0010\u0095\u0001\u001a\u00070Nj\u0003`\u0094\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u0012\u0005\b\u0099\u0001\u00104\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009b\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u009e\u0001"}, m3636d2 = {"Lio/bitdrift/capture/LoggerImpl;", "Lio/bitdrift/capture/ILogger;", "", "apiKey", "Lokhttp3/HttpUrl;", "apiUrl", "Lio/bitdrift/capture/error/IErrorReporter;", "errorReporter", "Lio/bitdrift/capture/Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "Lio/bitdrift/capture/providers/FieldProvider;", "fieldProviders", "Lio/bitdrift/capture/providers/DateProvider;", "dateProvider", "Lio/bitdrift/capture/ErrorHandler;", "errorHandler", "Lio/bitdrift/capture/providers/session/SessionStrategy;", "sessionStrategy", "Landroid/content/Context;", "context", "Lio/bitdrift/capture/attributes/ClientAttributes;", "clientAttributes", "Lio/bitdrift/capture/IPreferences;", "preferences", "Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;", "apiClient", "Lio/bitdrift/capture/DeviceCodeService;", "deviceCodeService", "Landroid/app/ActivityManager;", "activityManager", "Lio/bitdrift/capture/IBridge;", "bridge", "Lio/bitdrift/capture/threading/CaptureDispatchers$CommonBackground;", "eventListenerDispatcher", "Lio/bitdrift/capture/common/IWindowManager;", "windowManager", "Lio/bitdrift/capture/reports/IFatalIssueReporter;", "fatalIssueReporter", "<init>", "(Ljava/lang/String;Lokhttp3/HttpUrl;Lio/bitdrift/capture/error/IErrorReporter;Lio/bitdrift/capture/Configuration;Ljava/util/List;Lio/bitdrift/capture/providers/DateProvider;Lio/bitdrift/capture/ErrorHandler;Lio/bitdrift/capture/providers/session/SessionStrategy;Landroid/content/Context;Lio/bitdrift/capture/attributes/ClientAttributes;Lio/bitdrift/capture/IPreferences;Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;Lio/bitdrift/capture/DeviceCodeService;Landroid/app/ActivityManager;Lio/bitdrift/capture/IBridge;Lio/bitdrift/capture/threading/CaptureDispatchers$CommonBackground;Lio/bitdrift/capture/common/IWindowManager;Lio/bitdrift/capture/reports/IFatalIssueReporter;)V", "", "Lio/bitdrift/capture/providers/FieldValue;", "getCaptureSdkFields", "()Ljava/util/Map;", "", "addJankStatsMonitorTarget", "(Lio/bitdrift/capture/common/IWindowManager;Landroid/content/Context;)V", "sessionId", "appExitSaveCurrentSessionId", "(Ljava/lang/String;)V", "setUpInternalLogging", "()V", "fields", "", "throwable", "Lio/bitdrift/capture/InternalFieldsMap;", "extractFields$platform_jvm_capture_capture_logger_lib_kt", "(Ljava/util/Map;Ljava/lang/Throwable;)Ljava/util/Map;", "extractFields", "", "blocking", "flush$platform_jvm_capture_capture_logger_lib_kt", "(Z)V", "flush", "Lio/bitdrift/capture/network/HttpRequestInfo;", "httpRequestInfo", "log", "(Lio/bitdrift/capture/network/HttpRequestInfo;)V", "Lio/bitdrift/capture/network/HttpResponseInfo;", "httpResponseInfo", "(Lio/bitdrift/capture/network/HttpResponseInfo;)V", "Lio/bitdrift/capture/LogLevel;", "level", "Lkotlin/Function0;", "message", "(Lio/bitdrift/capture/LogLevel;Ljava/util/Map;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "appVersion", "", "appVersionCode", "appSizeBytes", "", "durationS", "logAppUpdate$platform_jvm_capture_capture_logger_lib_kt", "(Ljava/lang/String;JJD)V", "logAppUpdate", "Lio/bitdrift/capture/LogType;", "type", "matchingFields", "Lio/bitdrift/capture/LogAttributesOverrides;", "attributesOverrides", "logFields", "(Lio/bitdrift/capture/LogType;Lio/bitdrift/capture/LogLevel;Ljava/util/Map;Ljava/util/Map;Lio/bitdrift/capture/LogAttributesOverrides;ZLkotlin/jvm/functions/Function0;)V", "Lkotlin/time/Duration;", "duration", "logResourceUtilization-HG0u8IE$platform_jvm_capture_capture_logger_lib_kt", "(Ljava/util/Map;J)V", "logResourceUtilization", "logSessionReplayScreen-HG0u8IE$platform_jvm_capture_capture_logger_lib_kt", "logSessionReplayScreen", "logSessionReplayScreenshot-HG0u8IE$platform_jvm_capture_capture_logger_lib_kt", "logSessionReplayScreenshot", "startNewSession", "shouldLogAppUpdate$platform_jvm_capture_capture_logger_lib_kt", "(Ljava/lang/String;J)Z", "shouldLogAppUpdate", "Lio/bitdrift/capture/ErrorHandler;", "Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;", "Lio/bitdrift/capture/DeviceCodeService;", "Landroid/app/ActivityManager;", "Lio/bitdrift/capture/IBridge;", "Lio/bitdrift/capture/threading/CaptureDispatchers$CommonBackground;", "Lio/bitdrift/capture/reports/IFatalIssueReporter;", "Lio/bitdrift/capture/providers/MetadataProvider;", "metadataProvider", "Lio/bitdrift/capture/providers/MetadataProvider;", "Lio/bitdrift/capture/events/performance/BatteryMonitor;", "batteryMonitor", "Lio/bitdrift/capture/events/performance/BatteryMonitor;", "Lio/bitdrift/capture/events/common/PowerMonitor;", "powerMonitor", "Lio/bitdrift/capture/events/common/PowerMonitor;", "Lio/bitdrift/capture/events/performance/DiskUsageMonitor;", "diskUsageMonitor", "Lio/bitdrift/capture/events/performance/DiskUsageMonitor;", "Lio/bitdrift/capture/events/performance/MemoryMetricsProvider;", "memoryMetricsProvider", "Lio/bitdrift/capture/events/performance/MemoryMetricsProvider;", "Lio/bitdrift/capture/events/lifecycle/AppExitLogger;", "appExitLogger", "Lio/bitdrift/capture/events/lifecycle/AppExitLogger;", "Lio/bitdrift/capture/JniRuntime;", "runtime", "Lio/bitdrift/capture/JniRuntime;", "Lio/bitdrift/capture/events/performance/JankStatsMonitor;", "jankStatsMonitor", "Lio/bitdrift/capture/events/performance/JankStatsMonitor;", "sessionUrlBase", "Lokhttp3/HttpUrl;", "Lio/bitdrift/capture/events/performance/ResourceUtilizationTarget;", "resourceUtilizationTarget", "Lio/bitdrift/capture/events/performance/ResourceUtilizationTarget;", "Lio/bitdrift/capture/events/lifecycle/EventsListenerTarget;", "eventsListenerTarget", "Lio/bitdrift/capture/events/lifecycle/EventsListenerTarget;", "Lio/bitdrift/capture/events/SessionReplayTarget;", "sessionReplayTarget", "Lio/bitdrift/capture/events/SessionReplayTarget;", "Lio/bitdrift/capture/LoggerId;", "loggerId", "J", "getLoggerId$platform_jvm_capture_capture_logger_lib_kt", "()J", "getLoggerId$platform_jvm_capture_capture_logger_lib_kt$annotations", "getSessionId", "()Ljava/lang/String;", "getSessionUrl", "sessionUrl", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class LoggerImpl implements ILogger {
    private final ActivityManager activityManager;
    private final OkHttpApiClient apiClient;
    private final AppExitLogger appExitLogger;
    private final BatteryMonitor batteryMonitor;
    private final IBridge bridge;
    private DeviceCodeService deviceCodeService;
    private final DiskUsageMonitor diskUsageMonitor;
    private final ErrorHandler errorHandler;
    private final CaptureDispatchers.CommonBackground eventListenerDispatcher;
    private final EventsListenerTarget eventsListenerTarget;
    private final IFatalIssueReporter fatalIssueReporter;
    private JankStatsMonitor jankStatsMonitor;
    private final long loggerId;
    private final MemoryMetricsProvider memoryMetricsProvider;
    private final MetadataProvider metadataProvider;
    private final PowerMonitor powerMonitor;
    private final ResourceUtilizationTarget resourceUtilizationTarget;
    private final JniRuntime runtime;
    private final SessionReplayTarget sessionReplayTarget;
    private final HttpUrl sessionUrlBase;

    /* JADX WARN: Multi-variable type inference failed */
    public LoggerImpl(String apiKey, HttpUrl apiUrl, IErrorReporter iErrorReporter, Configuration configuration, List<? extends FieldProvider> fieldProviders, DateProvider dateProvider, ErrorHandler errorHandler, SessionStrategy sessionStrategy, Context context, ClientAttributes clientAttributes, IPreferences preferences, OkHttpApiClient apiClient, DeviceCodeService deviceCodeService, ActivityManager activityManager, IBridge bridge, CaptureDispatchers.CommonBackground eventListenerDispatcher, IWindowManager windowManager, IFatalIssueReporter fatalIssueReporter) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(fieldProviders, "fieldProviders");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(sessionStrategy, "sessionStrategy");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientAttributes, "clientAttributes");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(deviceCodeService, "deviceCodeService");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(eventListenerDispatcher, "eventListenerDispatcher");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(fatalIssueReporter, "fatalIssueReporter");
        this.errorHandler = errorHandler;
        this.apiClient = apiClient;
        this.deviceCodeService = deviceCodeService;
        this.activityManager = activityManager;
        this.bridge = bridge;
        this.eventListenerDispatcher = eventListenerDispatcher;
        this.fatalIssueReporter = fatalIssueReporter;
        BatteryMonitor batteryMonitor = new BatteryMonitor(context);
        this.batteryMonitor = batteryMonitor;
        PowerMonitor powerMonitor = new PowerMonitor(context);
        this.powerMonitor = powerMonitor;
        EventsListenerTarget eventsListenerTarget = new EventsListenerTarget();
        this.eventsListenerTarget = eventsListenerTarget;
        long jM28773markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m28773markNowz9LOYto();
        setUpInternalLogging();
        CaptureJniLibrary captureJniLibrary = CaptureJniLibrary.INSTANCE;
        captureJniLibrary.load();
        this.sessionUrlBase = new HttpUrl.Builder().scheme(Constants.SCHEME).host(StringsKt.replaceFirst$default(apiUrl.getHost(), "api.", "timeline.", false, 4, null)).addQueryParameter("utm_source", Constants.RequestParamsKeys.SDK_VERSION_KEY).build();
        ContextHolder.Companion companion = ContextHolder.INSTANCE;
        NetworkAttributes networkAttributes = new NetworkAttributes(companion.getAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt());
        DeviceAttributes deviceAttributes = new DeviceAttributes(companion.getAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt());
        MetadataProvider metadataProvider = new MetadataProvider(dateProvider, CollectionsKt.listOf((Object[]) new FieldProvider[]{clientAttributes, networkAttributes, deviceAttributes}), fieldProviders, errorHandler, null, 16, null);
        this.metadataProvider = metadataProvider;
        ICaptureNetwork okHttpNetwork = new OkHttpNetwork(apiUrl, 0L, null, 6, null);
        String path = SdkDirectory.INSTANCE.getPath(context);
        IErrorReporter errorReporterService = iErrorReporter == null ? new ErrorReporterService(CollectionsKt.listOf(clientAttributes), apiClient) : iErrorReporter;
        DiskUsageMonitor diskUsageMonitor = new DiskUsageMonitor(preferences, context, null, 4, null);
        this.diskUsageMonitor = diskUsageMonitor;
        MemoryMetricsProvider memoryMetricsProvider = new MemoryMetricsProvider(activityManager);
        this.memoryMetricsProvider = memoryMetricsProvider;
        ResourceUtilizationTarget resourceUtilizationTarget = new ResourceUtilizationTarget(memoryMetricsProvider, batteryMonitor, powerMonitor, diskUsageMonitor, errorHandler, this, eventListenerDispatcher.get_executorService(), null, 128, null);
        this.resourceUtilizationTarget = resourceUtilizationTarget;
        SessionReplayTarget sessionReplayTarget = new SessionReplayTarget(configuration.getSessionReplayConfiguration(), errorHandler, context, this, null, windowManager, 16, 0 == true ? 1 : 0);
        this.sessionReplayTarget = sessionReplayTarget;
        long jCreateLogger = bridge.createLogger(path, apiKey, sessionStrategy.m3322xd02edeb1(new Function1<String, Unit>() { // from class: io.bitdrift.capture.LoggerImpl$duration$1$loggerId$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.appExitSaveCurrentSessionId(it);
            }
        }), metadataProvider, resourceUtilizationTarget, sessionReplayTarget, eventsListenerTarget, clientAttributes.getAppId(), clientAttributes.getAppVersion(), deviceAttributes.model(), okHttpNetwork, preferences, errorReporterService);
        if (jCreateLogger == -1) {
            throw new IllegalStateException("initialization of the rust logger failed");
        }
        this.loggerId = jCreateLogger;
        JniRuntime jniRuntime = new JniRuntime(jCreateLogger);
        this.runtime = jniRuntime;
        sessionReplayTarget.setRuntime$platform_jvm_capture_capture_logger_lib_kt(jniRuntime);
        diskUsageMonitor.setRuntime(jniRuntime);
        memoryMetricsProvider.setRuntime(jniRuntime);
        eventsListenerTarget.add(new AppLifecycleListenerLogger(this, ProcessLifecycleOwner.INSTANCE.get(), activityManager, jniRuntime, eventListenerDispatcher.get_executorService(), null, null, 96, null));
        eventsListenerTarget.add(new DeviceStateListenerLogger(this, context, batteryMonitor, powerMonitor, jniRuntime, eventListenerDispatcher.get_executorService()));
        eventsListenerTarget.add(new AppUpdateListenerLogger(this, clientAttributes, context, jniRuntime, eventListenerDispatcher.get_executorService()));
        addJankStatsMonitorTarget(windowManager, context);
        AppExitLogger appExitLogger = new AppExitLogger(this, activityManager, jniRuntime, errorHandler, null, memoryMetricsProvider, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, fatalIssueReporter.getReportingMechanism(), 464, null);
        this.appExitLogger = appExitLogger;
        appExitLogger.installAppExitLogger();
        captureJniLibrary.startLogger(jCreateLogger);
        captureJniLibrary.writeSDKStartLog(jCreateLogger, getCaptureSdkFields(), Duration.m28758toDoubleimpl(TimeSource.Monotonic.ValueTimeMark.m28775elapsedNowUwyO8pc(jM28773markNowz9LOYto), DurationUnitJvm.SECONDS));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoggerImpl(String str, HttpUrl httpUrl, IErrorReporter iErrorReporter, Configuration configuration, List list, DateProvider dateProvider, ErrorHandler errorHandler, SessionStrategy sessionStrategy, Context context, ClientAttributes clientAttributes, IPreferences iPreferences, OkHttpApiClient okHttpApiClient, DeviceCodeService deviceCodeService, ActivityManager activityManager, IBridge iBridge, CaptureDispatchers.CommonBackground commonBackground, IWindowManager iWindowManager, IFatalIssueReporter iFatalIssueReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ActivityManager activityManager2;
        IErrorReporter iErrorReporter2 = (i & 4) != 0 ? null : iErrorReporter;
        ErrorHandler errorHandler2 = (i & 64) != 0 ? new ErrorHandler() : errorHandler;
        Context aPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt = (i & 256) != 0 ? ContextHolder.INSTANCE.getAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt() : context;
        ClientAttributes clientAttributes2 = (i & 512) != 0 ? new ClientAttributes(aPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt, ProcessLifecycleOwner.INSTANCE.get()) : clientAttributes;
        IPreferences preferences = (i & 1024) != 0 ? new Preferences(aPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt) : iPreferences;
        OkHttpApiClient okHttpApiClient2 = (i & 2048) != 0 ? new OkHttpApiClient(httpUrl, str, null, 4, null) : okHttpApiClient;
        DeviceCodeService deviceCodeService2 = (i & 4096) != 0 ? new DeviceCodeService(okHttpApiClient2) : deviceCodeService;
        if ((i & 8192) != 0) {
            Object systemService = aPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            activityManager2 = (ActivityManager) systemService;
        } else {
            activityManager2 = activityManager;
        }
        this(str, httpUrl, iErrorReporter2, configuration, list, dateProvider, errorHandler2, sessionStrategy, aPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt, clientAttributes2, preferences, okHttpApiClient2, deviceCodeService2, activityManager2, (i & 16384) != 0 ? CaptureJniLibrary.INSTANCE : iBridge, (32768 & i) != 0 ? CaptureDispatchers.CommonBackground.INSTANCE : commonBackground, (i & 65536) != 0 ? new WindowManager(errorHandler2) : iWindowManager, iFatalIssueReporter);
    }

    @Override // io.bitdrift.capture.ILogger
    public String getSessionId() {
        String sessionId = CaptureJniLibrary.INSTANCE.getSessionId(this.loggerId);
        return sessionId == null ? "unknown" : sessionId;
    }

    @Override // io.bitdrift.capture.ILogger
    public String getSessionUrl() {
        return this.sessionUrlBase.newBuilder().addPathSegment(Constants.RequestParamsKeys.SESSION_ID_KEY).addPathSegment(getSessionId()).build().getUrl();
    }

    @Override // io.bitdrift.capture.ILogger
    public void startNewSession() {
        CaptureJniLibrary.INSTANCE.startNewSession(this.loggerId);
        appExitSaveCurrentSessionId$default(this, null, 1, null);
    }

    static /* synthetic */ void appExitSaveCurrentSessionId$default(LoggerImpl loggerImpl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        loggerImpl.appExitSaveCurrentSessionId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appExitSaveCurrentSessionId(String sessionId) {
        this.appExitLogger.saveCurrentSessionId(sessionId);
    }

    @Override // io.bitdrift.capture.ILogger
    public void log(final HttpRequestInfo httpRequestInfo) {
        Intrinsics.checkNotNullParameter(httpRequestInfo, "httpRequestInfo");
        logFields$default(this, LogType.SPAN, LogLevel.DEBUG, httpRequestInfo.getFields$platform_jvm_capture_capture_logger_lib_kt(), httpRequestInfo.getMatchingFields$platform_jvm_capture_capture_logger_lib_kt(), null, false, new Function0<String>() { // from class: io.bitdrift.capture.LoggerImpl.log.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return httpRequestInfo.getName();
            }
        }, 48, null);
    }

    @Override // io.bitdrift.capture.ILogger
    public void log(final HttpResponseInfo httpResponseInfo) {
        Intrinsics.checkNotNullParameter(httpResponseInfo, "httpResponseInfo");
        logFields$default(this, LogType.SPAN, LogLevel.DEBUG, httpResponseInfo.getFields$platform_jvm_capture_capture_logger_lib_kt(), httpResponseInfo.getMatchingFields$platform_jvm_capture_capture_logger_lib_kt(), null, false, new Function0<String>() { // from class: io.bitdrift.capture.LoggerImpl.log.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return httpResponseInfo.getName();
            }
        }, 48, null);
    }

    @Override // io.bitdrift.capture.ILogger
    public void log(LogLevel level, Map<String, String> fields, Throwable throwable, Function0<String> message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        logFields(LogType.NORMAL, level, extractFields$platform_jvm_capture_capture_logger_lib_kt(fields, throwable), null, null, false, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logFields$default(LoggerImpl loggerImpl, LogType logType, LogLevel logLevel, Map map, Map map2, LoggerImpl2 loggerImpl2, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        if ((i & 16) != 0) {
            loggerImpl2 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        loggerImpl.logFields(logType, logLevel, map, map2, loggerImpl2, z, function0);
    }

    @JvmName
    public final void logFields(LogType type2, LogLevel level, Map<String, ? extends FieldProvider4> fields, Map<String, ? extends FieldProvider4> matchingFields, LoggerImpl2 attributesOverrides, boolean blocking, Function0<String> message) {
        long occurredAtTimestampMs;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        if (type2 != LogType.INTERNALSDK || this.runtime.isEnabled(Runtime3.INTERNAL_LOGS.INSTANCE)) {
            try {
                String expectedPreviousProcessSessionId = attributesOverrides instanceof LoggerImpl2.SessionID ? ((LoggerImpl2.SessionID) attributesOverrides).getExpectedPreviousProcessSessionId() : null;
                if (attributesOverrides instanceof LoggerImpl2.SessionID) {
                    occurredAtTimestampMs = ((LoggerImpl2.SessionID) attributesOverrides).getOccurredAtTimestampMs();
                } else {
                    occurredAtTimestampMs = attributesOverrides instanceof LoggerImpl2.OccurredAt ? ((LoggerImpl2.OccurredAt) attributesOverrides).getOccurredAtTimestampMs() : 0L;
                }
                CaptureJniLibrary.INSTANCE.writeLog(this.loggerId, type2.getValue(), level.getValue(), message.invoke(), fields == null ? MapsKt.emptyMap() : fields, matchingFields == null ? MapsKt.emptyMap() : matchingFields, expectedPreviousProcessSessionId, occurredAtTimestampMs, blocking);
            } catch (Throwable th) {
                this.errorHandler.handleError("write log", th);
            }
        }
    }

    /* renamed from: logSessionReplayScreen-HG0u8IE$platform_jvm_capture_capture_logger_lib_kt */
    public final void m3295xd379d932(Map<String, ? extends FieldProvider4> fields, long duration) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        CaptureJniLibrary.INSTANCE.writeSessionReplayScreenLog(this.loggerId, fields, Duration.m28758toDoubleimpl(duration, DurationUnitJvm.SECONDS));
    }

    /* renamed from: logSessionReplayScreenshot-HG0u8IE$platform_jvm_capture_capture_logger_lib_kt */
    public final void m3296x64009a78(Map<String, ? extends FieldProvider4> fields, long duration) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        CaptureJniLibrary.INSTANCE.writeSessionReplayScreenshotLog(this.loggerId, fields, Duration.m28758toDoubleimpl(duration, DurationUnitJvm.SECONDS));
    }

    /* renamed from: logResourceUtilization-HG0u8IE$platform_jvm_capture_capture_logger_lib_kt */
    public final void m3294x27ecc707(Map<String, String> fields, long duration) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        CaptureJniLibrary.INSTANCE.writeResourceUtilizationLog(this.loggerId, FieldProvider3.toFields(fields), Duration.m28758toDoubleimpl(duration, DurationUnitJvm.SECONDS));
    }

    public final boolean shouldLogAppUpdate$platform_jvm_capture_capture_logger_lib_kt(String appVersion, long appVersionCode) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return CaptureJniLibrary.INSTANCE.shouldWriteAppUpdateLog(this.loggerId, appVersion, appVersionCode);
    }

    public final void logAppUpdate$platform_jvm_capture_capture_logger_lib_kt(String appVersion, long appVersionCode, long appSizeBytes, double durationS) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        CaptureJniLibrary.INSTANCE.writeAppUpdateLog(this.loggerId, appVersion, appVersionCode, appSizeBytes, durationS);
    }

    public final Map<String, FieldProvider4> extractFields$platform_jvm_capture_capture_logger_lib_kt(Map<String, String> fields, Throwable throwable) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        if (fields != null) {
            mapCreateMapBuilder.putAll(fields);
        }
        if (throwable != null) {
            mapCreateMapBuilder.put("_error", throwable.getClass().getName());
            String message = throwable.getMessage();
            if (message == null) {
                message = "";
            }
            mapCreateMapBuilder.put("_error_details", message);
        }
        return FieldProvider3.toFields(MapsKt.build(mapCreateMapBuilder));
    }

    public final void flush$platform_jvm_capture_capture_logger_lib_kt(boolean blocking) {
        CaptureJniLibrary.INSTANCE.flush(this.loggerId, blocking);
    }

    private final Map<String, FieldProvider4> getCaptureSdkFields() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        mapCreateMapBuilder.putAll(MapsKt.mapOf(Tuples4.m3642to("_capture_start_thread", FieldProvider3.toFieldValue(name))));
        mapCreateMapBuilder.putAll(this.fatalIssueReporter.getLogStatusFieldsMap());
        return MapsKt.build(mapCreateMapBuilder);
    }

    @SuppressLint({"PrivateApi"})
    private final void setUpInternalLogging() {
        Object objM28550constructorimpl;
        if ((ContextHolder.INSTANCE.getAPP_CONTEXT$platform_jvm_capture_capture_logger_lib_kt().getApplicationInfo().flags & 2) != 0) {
            String str = SduiFeatureDiscovery3.INFO_TAG;
            try {
                Result.Companion companion = Result.INSTANCE;
                Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.bitdrift.internal_log_level", SduiFeatureDiscovery3.INFO_TAG);
                objM28550constructorimpl = Result.m28550constructorimpl(objInvoke instanceof String ? (String) objInvoke : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            String str2 = (String) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
            if (str2 != null) {
                str = str2;
            }
            try {
                Os.setenv("RUST_LOG", str, true);
                Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    private final void addJankStatsMonitorTarget(IWindowManager windowManager, Context context) {
        if (context instanceof Application) {
            JankStatsMonitor jankStatsMonitor = new JankStatsMonitor((Application) context, this, ProcessLifecycleOwner.INSTANCE.get(), this.runtime, windowManager, this.errorHandler, null, null, 192, null);
            this.jankStatsMonitor = jankStatsMonitor;
            this.eventsListenerTarget.add(jankStatsMonitor);
            return;
        }
        ErrorHandler.DefaultImpls.handleError$default(this.errorHandler, "Couldn't start JankStatsMonitor. Invalid application provided", null, 2, null);
    }
}
