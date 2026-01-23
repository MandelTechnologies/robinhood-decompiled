package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.protocol.SdkVersion;
import io.sentry.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes21.dex */
final class ManifestMetadataReader {
    static void applyMetadata(Context context, SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider) {
        Objects.requireNonNull(context, "The application context is required.");
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle metadata = getMetadata(context, sentryAndroidOptions.getLogger(), buildInfoProvider);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (metadata != null) {
                sentryAndroidOptions.setDebug(readBool(metadata, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String string2 = readString(metadata, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (string2 != null) {
                        sentryAndroidOptions.setDiagnosticLevel(SentryLevel.valueOf(string2.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(readBool(metadata, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(readBool(metadata, logger, "io.sentry.auto-session-tracking.enable", readBool(metadata, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double d = readDouble(metadata, logger, "io.sentry.sample-rate");
                    if (d.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(d);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(readBool(metadata, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(readLong(metadata, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                String string3 = readString(metadata, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean bool = readBool(metadata, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!bool || (string3 != null && string3.isEmpty())) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (string3 == null) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(bool);
                sentryAndroidOptions.setDsn(string3);
                sentryAndroidOptions.setEnableNdk(readBool(metadata, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(readBool(metadata, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(readString(metadata, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(readString(metadata, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(readLong(metadata, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(readBool(metadata, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(readBool(metadata, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(readBool(metadata, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(readBool(metadata, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(readBool(metadata, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(readBool(metadata, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(readBool(metadata, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(readBool(metadata, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(readBool(metadata, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(readBool(metadata, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(readBool(metadata, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                sentryAndroidOptions.setCollectAdditionalContext(readBool(metadata, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getEnableTracing() == null) {
                    sentryAndroidOptions.setEnableTracing(readBoolNullable(metadata, logger, "io.sentry.traces.enable", null));
                }
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    Double d2 = readDouble(metadata, logger, "io.sentry.traces.sample-rate");
                    if (d2.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(d2);
                    }
                }
                sentryAndroidOptions.setTraceSampling(readBool(metadata, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(readBool(metadata, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(readBool(metadata, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                sentryAndroidOptions.setProfilingEnabled(readBool(metadata, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    Double d3 = readDouble(metadata, logger, "io.sentry.traces.profiling.sample-rate");
                    if (d3.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(d3);
                    }
                }
                sentryAndroidOptions.setEnableUserInteractionTracing(readBool(metadata, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(readBool(metadata, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long j = readLong(metadata, logger, "io.sentry.traces.idle-timeout", -1L);
                if (j != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(j));
                }
                List<String> list = readList(metadata, logger, "io.sentry.traces.trace-propagation-targets");
                if (!metadata.containsKey("io.sentry.traces.trace-propagation-targets") && (list == null || list.isEmpty())) {
                    list = readList(metadata, logger, "io.sentry.traces.tracing-origins");
                }
                if ((metadata.containsKey("io.sentry.traces.trace-propagation-targets") || metadata.containsKey("io.sentry.traces.tracing-origins")) && list == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (list != null) {
                    sentryAndroidOptions.setTracePropagationTargets(list);
                }
                sentryAndroidOptions.setEnableFramesTracking(readBool(metadata, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(readString(metadata, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                SdkVersion sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new SdkVersion("", "");
                }
                sdkVersion.setName(readStringNotNull(metadata, logger, "io.sentry.sdk.name", sdkVersion.getName()));
                sdkVersion.setVersion(readStringNotNull(metadata, logger, "io.sentry.sdk.version", sdkVersion.getVersion()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(readBool(metadata, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List<String> list2 = readList(metadata, logger, "io.sentry.gradle-plugin-integrations");
                if (list2 != null) {
                    Iterator<String> it = list2.iterator();
                    while (it.hasNext()) {
                        SentryIntegrationPackageStorage.getInstance().addIntegration(it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(readBool(metadata, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(readBool(metadata, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(readBool(metadata, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(readBool(metadata, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(readBool(metadata, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableMetrics(readBool(metadata, logger, "io.sentry.enable-metrics", sentryAndroidOptions.isEnableMetrics()));
                if (sentryAndroidOptions.getExperimental().getSessionReplay().getSessionSampleRate() == null) {
                    Double d4 = readDouble(metadata, logger, "io.sentry.session-replay.session-sample-rate");
                    if (d4.doubleValue() != -1.0d) {
                        sentryAndroidOptions.getExperimental().getSessionReplay().setSessionSampleRate(d4);
                    }
                }
                if (sentryAndroidOptions.getExperimental().getSessionReplay().getErrorSampleRate() == null) {
                    Double d5 = readDouble(metadata, logger, "io.sentry.session-replay.error-sample-rate");
                    if (d5.doubleValue() != -1.0d) {
                        sentryAndroidOptions.getExperimental().getSessionReplay().setErrorSampleRate(d5);
                    }
                }
                sentryAndroidOptions.getExperimental().getSessionReplay().setRedactAllText(readBool(metadata, logger, "io.sentry.session-replay.redact-all-text", sentryAndroidOptions.getExperimental().getSessionReplay().getRedactAllText()));
                sentryAndroidOptions.getExperimental().getSessionReplay().setRedactAllImages(readBool(metadata, logger, "io.sentry.session-replay.redact-all-images", sentryAndroidOptions.getExperimental().getSessionReplay().getRedactAllImages()));
            }
            sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    private static boolean readBool(Bundle bundle, ILogger iLogger, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    private static Boolean readBoolNullable(Bundle bundle, ILogger iLogger, String str, Boolean bool) {
        if (bundle.getSerializable(str) != null) {
            boolean z = bundle.getBoolean(str, bool != null);
            iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, Boolean.valueOf(z));
            return Boolean.valueOf(z);
        }
        iLogger.log(SentryLevel.DEBUG, "%s used default %s", str, bool);
        return bool;
    }

    private static String readString(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string2 = bundle.getString(str, str2);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, string2);
        return string2;
    }

    private static String readStringNotNull(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string2 = bundle.getString(str, str2);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, string2);
        return string2;
    }

    private static List<String> readList(Bundle bundle, ILogger iLogger, String str) {
        String string2 = bundle.getString(str);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, string2);
        if (string2 != null) {
            return Arrays.asList(string2.split(",", -1));
        }
        return null;
    }

    private static Double readDouble(Bundle bundle, ILogger iLogger, String str) {
        Double dValueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, dValueOf);
        return dValueOf;
    }

    private static long readLong(Bundle bundle, ILogger iLogger, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.log(SentryLevel.DEBUG, "%s read: %s", str, Long.valueOf(j2));
        return j2;
    }

    static boolean isAutoInit(Context context, ILogger iLogger) {
        Objects.requireNonNull(context, "The application context is required.");
        try {
            Bundle metadata = getMetadata(context, iLogger, null);
            bool = metadata != null ? readBool(metadata, iLogger, "io.sentry.auto-init", true) : true;
            iLogger.log(SentryLevel.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
            return bool;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Failed to read auto-init from android manifest metadata.", th);
            return bool;
        }
    }

    private static Bundle getMetadata(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) throws PackageManager.NameNotFoundException {
        if (buildInfoProvider == null) {
            buildInfoProvider = new BuildInfoProvider(iLogger);
        }
        return ContextUtils.getApplicationInfo(context, 128L, buildInfoProvider).metaData;
    }
}
