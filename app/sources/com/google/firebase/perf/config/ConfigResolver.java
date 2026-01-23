package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Utils;

/* loaded from: classes.dex */
public class ConfigResolver {
    private static volatile ConfigResolver instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private DeviceCacheManager deviceCacheManager;
    private ImmutableBundle metadataBundle;
    private final RemoteConfigManager remoteConfigManager;

    private boolean isEventCountValid(long j) {
        return j >= 0;
    }

    private boolean isGaugeCaptureFrequencyMsValid(long j) {
        return j >= 0;
    }

    private boolean isSamplingRateValid(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    private boolean isSessionsMaxDurationMinutesValid(long j) {
        return j > 0;
    }

    private boolean isTimeRangeSecValid(long j) {
        return j > 0;
    }

    public ConfigResolver(RemoteConfigManager remoteConfigManager, ImmutableBundle immutableBundle, DeviceCacheManager deviceCacheManager) {
        this.remoteConfigManager = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.metadataBundle = immutableBundle == null ? new ImmutableBundle() : immutableBundle;
        this.deviceCacheManager = deviceCacheManager == null ? DeviceCacheManager.getInstance() : deviceCacheManager;
    }

    public static synchronized ConfigResolver getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigResolver(null, null, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    public void setApplicationContext(Context context) {
        logger.setLogcatEnabled(Utils.isDebugLoggingEnabled(context));
        this.deviceCacheManager.setContext(context);
    }

    public void setMetadataBundle(ImmutableBundle immutableBundle) {
        this.metadataBundle = immutableBundle;
    }

    public boolean isPerformanceMonitoringEnabled() {
        Boolean isPerformanceCollectionEnabled = getIsPerformanceCollectionEnabled();
        return (isPerformanceCollectionEnabled == null || isPerformanceCollectionEnabled.booleanValue()) && getIsServiceCollectionEnabled();
    }

    public Boolean getIsPerformanceCollectionEnabled() {
        if (getIsPerformanceCollectionDeactivated().booleanValue()) {
            return Boolean.FALSE;
        }
        ConfigurationConstants$CollectionEnabled configurationConstants$CollectionEnabled = ConfigurationConstants$CollectionEnabled.getInstance();
        Optional<Boolean> deviceCacheBoolean = getDeviceCacheBoolean(configurationConstants$CollectionEnabled);
        if (deviceCacheBoolean.isAvailable()) {
            return deviceCacheBoolean.get();
        }
        Optional<Boolean> metadataBoolean = getMetadataBoolean(configurationConstants$CollectionEnabled);
        if (metadataBoolean.isAvailable()) {
            return metadataBoolean.get();
        }
        return null;
    }

    public Boolean getIsPerformanceCollectionDeactivated() {
        ConfigurationConstants$CollectionDeactivated configurationConstants$CollectionDeactivated = ConfigurationConstants$CollectionDeactivated.getInstance();
        Optional<Boolean> metadataBoolean = getMetadataBoolean(configurationConstants$CollectionDeactivated);
        if (metadataBoolean.isAvailable()) {
            return metadataBoolean.get();
        }
        return configurationConstants$CollectionDeactivated.getDefault();
    }

    public boolean getIsServiceCollectionEnabled() {
        return getIsSdkEnabled() && !getIsSdkVersionDisabled();
    }

    private boolean getIsSdkEnabled() {
        ConfigurationConstants$SdkEnabled configurationConstants$SdkEnabled = ConfigurationConstants$SdkEnabled.getInstance();
        Optional<Boolean> remoteConfigBoolean = getRemoteConfigBoolean(configurationConstants$SdkEnabled);
        if (remoteConfigBoolean.isAvailable()) {
            if (this.remoteConfigManager.isLastFetchFailed()) {
                return false;
            }
            this.deviceCacheManager.setValue(configurationConstants$SdkEnabled.getDeviceCacheFlag(), remoteConfigBoolean.get().booleanValue());
            return remoteConfigBoolean.get().booleanValue();
        }
        Optional<Boolean> deviceCacheBoolean = getDeviceCacheBoolean(configurationConstants$SdkEnabled);
        if (deviceCacheBoolean.isAvailable()) {
            return deviceCacheBoolean.get().booleanValue();
        }
        return configurationConstants$SdkEnabled.getDefault().booleanValue();
    }

    private boolean getIsSdkVersionDisabled() {
        ConfigurationConstants$SdkDisabledVersions configurationConstants$SdkDisabledVersions = ConfigurationConstants$SdkDisabledVersions.getInstance();
        Optional<String> remoteConfigString = getRemoteConfigString(configurationConstants$SdkDisabledVersions);
        if (remoteConfigString.isAvailable()) {
            this.deviceCacheManager.setValue(configurationConstants$SdkDisabledVersions.getDeviceCacheFlag(), remoteConfigString.get());
            return isFireperfSdkVersionInList(remoteConfigString.get());
        }
        Optional<String> deviceCacheString = getDeviceCacheString(configurationConstants$SdkDisabledVersions);
        if (deviceCacheString.isAvailable()) {
            return isFireperfSdkVersionInList(deviceCacheString.get());
        }
        return isFireperfSdkVersionInList(configurationConstants$SdkDisabledVersions.getDefault());
    }

    private boolean isFireperfSdkVersionInList(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(BuildConfig.FIREPERF_VERSION_NAME)) {
                return true;
            }
        }
        return false;
    }

    public double getTraceSamplingRate() {
        ConfigurationConstants$TraceSamplingRate configurationConstants$TraceSamplingRate = ConfigurationConstants$TraceSamplingRate.getInstance();
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(configurationConstants$TraceSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(configurationConstants$TraceSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(configurationConstants$TraceSamplingRate);
        if (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) {
            return deviceCacheDouble.get().doubleValue();
        }
        if (this.remoteConfigManager.isLastFetchFailed()) {
            return configurationConstants$TraceSamplingRate.getDefaultOnRcFetchFail().doubleValue();
        }
        return configurationConstants$TraceSamplingRate.getDefault().doubleValue();
    }

    public double getNetworkRequestSamplingRate() {
        ConfigurationConstants$NetworkRequestSamplingRate configurationConstants$NetworkRequestSamplingRate = ConfigurationConstants$NetworkRequestSamplingRate.getInstance();
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(configurationConstants$NetworkRequestSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(configurationConstants$NetworkRequestSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(configurationConstants$NetworkRequestSamplingRate);
        if (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) {
            return deviceCacheDouble.get().doubleValue();
        }
        if (this.remoteConfigManager.isLastFetchFailed()) {
            return configurationConstants$NetworkRequestSamplingRate.getDefaultOnRcFetchFail().doubleValue();
        }
        return configurationConstants$NetworkRequestSamplingRate.getDefault().doubleValue();
    }

    public double getSessionsSamplingRate() {
        ConfigurationConstants$SessionsSamplingRate configurationConstants$SessionsSamplingRate = ConfigurationConstants$SessionsSamplingRate.getInstance();
        Optional<Double> metadataDouble = getMetadataDouble(configurationConstants$SessionsSamplingRate);
        if (metadataDouble.isAvailable()) {
            double dDoubleValue = metadataDouble.get().doubleValue() / 100.0d;
            if (isSamplingRateValid(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(configurationConstants$SessionsSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(configurationConstants$SessionsSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(configurationConstants$SessionsSamplingRate);
        if (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) {
            return deviceCacheDouble.get().doubleValue();
        }
        if (this.remoteConfigManager.isLastFetchFailed()) {
            return configurationConstants$SessionsSamplingRate.getDefaultOnRcFetchFail().doubleValue();
        }
        return configurationConstants$SessionsSamplingRate.getDefault().doubleValue();
    }

    public long getSessionsCpuCaptureFrequencyForegroundMs() {
        ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs configurationConstants$SessionsCpuCaptureFrequencyForegroundMs = ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getInstance();
        Optional<Long> metadataLong = getMetadataLong(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs);
        if (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        if (this.remoteConfigManager.isLastFetchFailed()) {
            return configurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getDefaultOnRcFetchFail().longValue();
        }
        return configurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getDefault().longValue();
    }

    public long getSessionsCpuCaptureFrequencyBackgroundMs() {
        ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs = ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.getInstance();
        Optional<Long> metadataLong = getMetadataLong(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs);
        if (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.getDefault().longValue();
    }

    public long getSessionsMemoryCaptureFrequencyForegroundMs() {
        C5446xbe24e5c8 c5446xbe24e5c8 = C5446xbe24e5c8.getInstance();
        Optional<Long> metadataLong = getMetadataLong(c5446xbe24e5c8);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(c5446xbe24e5c8);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(c5446xbe24e5c8.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(c5446xbe24e5c8);
        if (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        if (this.remoteConfigManager.isLastFetchFailed()) {
            return c5446xbe24e5c8.getDefaultOnRcFetchFail().longValue();
        }
        return c5446xbe24e5c8.getDefault().longValue();
    }

    public long getSessionsMemoryCaptureFrequencyBackgroundMs() {
        C5445xa42982f3 c5445xa42982f3 = C5445xa42982f3.getInstance();
        Optional<Long> metadataLong = getMetadataLong(c5445xa42982f3);
        if (metadataLong.isAvailable() && isGaugeCaptureFrequencyMsValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(c5445xa42982f3);
        if (remoteConfigLong.isAvailable() && isGaugeCaptureFrequencyMsValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(c5445xa42982f3.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(c5445xa42982f3);
        if (deviceCacheLong.isAvailable() && isGaugeCaptureFrequencyMsValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return c5445xa42982f3.getDefault().longValue();
    }

    public long getSessionsMaxDurationMinutes() {
        ConfigurationConstants$SessionsMaxDurationMinutes configurationConstants$SessionsMaxDurationMinutes = ConfigurationConstants$SessionsMaxDurationMinutes.getInstance();
        Optional<Long> metadataLong = getMetadataLong(configurationConstants$SessionsMaxDurationMinutes);
        if (metadataLong.isAvailable() && isSessionsMaxDurationMinutesValid(metadataLong.get().longValue())) {
            return metadataLong.get().longValue();
        }
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$SessionsMaxDurationMinutes);
        if (remoteConfigLong.isAvailable() && isSessionsMaxDurationMinutesValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$SessionsMaxDurationMinutes.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$SessionsMaxDurationMinutes);
        if (deviceCacheLong.isAvailable() && isSessionsMaxDurationMinutesValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return configurationConstants$SessionsMaxDurationMinutes.getDefault().longValue();
    }

    public long getTraceEventCountForeground() {
        ConfigurationConstants$TraceEventCountForeground configurationConstants$TraceEventCountForeground = ConfigurationConstants$TraceEventCountForeground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$TraceEventCountForeground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$TraceEventCountForeground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$TraceEventCountForeground);
        if (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return configurationConstants$TraceEventCountForeground.getDefault().longValue();
    }

    public long getTraceEventCountBackground() {
        ConfigurationConstants$TraceEventCountBackground configurationConstants$TraceEventCountBackground = ConfigurationConstants$TraceEventCountBackground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$TraceEventCountBackground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$TraceEventCountBackground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$TraceEventCountBackground);
        if (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return configurationConstants$TraceEventCountBackground.getDefault().longValue();
    }

    public long getNetworkEventCountForeground() {
        ConfigurationConstants$NetworkEventCountForeground configurationConstants$NetworkEventCountForeground = ConfigurationConstants$NetworkEventCountForeground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$NetworkEventCountForeground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$NetworkEventCountForeground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$NetworkEventCountForeground);
        if (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return configurationConstants$NetworkEventCountForeground.getDefault().longValue();
    }

    public long getNetworkEventCountBackground() {
        ConfigurationConstants$NetworkEventCountBackground configurationConstants$NetworkEventCountBackground = ConfigurationConstants$NetworkEventCountBackground.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$NetworkEventCountBackground);
        if (remoteConfigLong.isAvailable() && isEventCountValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$NetworkEventCountBackground.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$NetworkEventCountBackground);
        if (deviceCacheLong.isAvailable() && isEventCountValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return configurationConstants$NetworkEventCountBackground.getDefault().longValue();
    }

    public long getRateLimitSec() {
        ConfigurationConstants$RateLimitSec configurationConstants$RateLimitSec = ConfigurationConstants$RateLimitSec.getInstance();
        Optional<Long> remoteConfigLong = getRemoteConfigLong(configurationConstants$RateLimitSec);
        if (remoteConfigLong.isAvailable() && isTimeRangeSecValid(remoteConfigLong.get().longValue())) {
            this.deviceCacheManager.setValue(configurationConstants$RateLimitSec.getDeviceCacheFlag(), remoteConfigLong.get().longValue());
            return remoteConfigLong.get().longValue();
        }
        Optional<Long> deviceCacheLong = getDeviceCacheLong(configurationConstants$RateLimitSec);
        if (deviceCacheLong.isAvailable() && isTimeRangeSecValid(deviceCacheLong.get().longValue())) {
            return deviceCacheLong.get().longValue();
        }
        return configurationConstants$RateLimitSec.getDefault().longValue();
    }

    public String getAndCacheLogSourceName() {
        String logSourceName;
        ConfigurationConstants$LogSourceName configurationConstants$LogSourceName = ConfigurationConstants$LogSourceName.getInstance();
        if (BuildConfig.ENFORCE_DEFAULT_LOG_SRC.booleanValue()) {
            return configurationConstants$LogSourceName.getDefault();
        }
        String remoteConfigFlag = configurationConstants$LogSourceName.getRemoteConfigFlag();
        long jLongValue = remoteConfigFlag != null ? ((Long) this.remoteConfigManager.getRemoteConfigValueOrDefault(remoteConfigFlag, -1L)).longValue() : -1L;
        String deviceCacheFlag = configurationConstants$LogSourceName.getDeviceCacheFlag();
        if (ConfigurationConstants$LogSourceName.isLogSourceKnown(jLongValue) && (logSourceName = ConfigurationConstants$LogSourceName.getLogSourceName(jLongValue)) != null) {
            this.deviceCacheManager.setValue(deviceCacheFlag, logSourceName);
            return logSourceName;
        }
        Optional<String> deviceCacheString = getDeviceCacheString(configurationConstants$LogSourceName);
        if (deviceCacheString.isAvailable()) {
            return deviceCacheString.get();
        }
        return configurationConstants$LogSourceName.getDefault();
    }

    public double getFragmentSamplingRate() {
        ConfigurationConstants$FragmentSamplingRate configurationConstants$FragmentSamplingRate = ConfigurationConstants$FragmentSamplingRate.getInstance();
        Optional<Double> metadataDouble = getMetadataDouble(configurationConstants$FragmentSamplingRate);
        if (metadataDouble.isAvailable()) {
            double dDoubleValue = metadataDouble.get().doubleValue() / 100.0d;
            if (isSamplingRateValid(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Optional<Double> remoteConfigDouble = getRemoteConfigDouble(configurationConstants$FragmentSamplingRate);
        if (remoteConfigDouble.isAvailable() && isSamplingRateValid(remoteConfigDouble.get().doubleValue())) {
            this.deviceCacheManager.setValue(configurationConstants$FragmentSamplingRate.getDeviceCacheFlag(), remoteConfigDouble.get().doubleValue());
            return remoteConfigDouble.get().doubleValue();
        }
        Optional<Double> deviceCacheDouble = getDeviceCacheDouble(configurationConstants$FragmentSamplingRate);
        if (deviceCacheDouble.isAvailable() && isSamplingRateValid(deviceCacheDouble.get().doubleValue())) {
            return deviceCacheDouble.get().doubleValue();
        }
        return configurationConstants$FragmentSamplingRate.getDefault().doubleValue();
    }

    public boolean getIsExperimentTTIDEnabled() {
        ConfigurationConstants$ExperimentTTID configurationConstants$ExperimentTTID = ConfigurationConstants$ExperimentTTID.getInstance();
        Optional<Boolean> metadataBoolean = getMetadataBoolean(configurationConstants$ExperimentTTID);
        if (metadataBoolean.isAvailable()) {
            return metadataBoolean.get().booleanValue();
        }
        Optional<Boolean> remoteConfigBoolean = getRemoteConfigBoolean(configurationConstants$ExperimentTTID);
        if (remoteConfigBoolean.isAvailable()) {
            this.deviceCacheManager.setValue(configurationConstants$ExperimentTTID.getDeviceCacheFlag(), remoteConfigBoolean.get().booleanValue());
            return remoteConfigBoolean.get().booleanValue();
        }
        Optional<Boolean> deviceCacheBoolean = getDeviceCacheBoolean(configurationConstants$ExperimentTTID);
        if (deviceCacheBoolean.isAvailable()) {
            return deviceCacheBoolean.get().booleanValue();
        }
        return configurationConstants$ExperimentTTID.getDefault().booleanValue();
    }

    private Optional<Boolean> getMetadataBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.metadataBundle.getBoolean(configurationFlag.getMetadataFlag());
    }

    private Optional<Double> getMetadataDouble(ConfigurationFlag<Double> configurationFlag) {
        return this.metadataBundle.getDouble(configurationFlag.getMetadataFlag());
    }

    private Optional<Long> getMetadataLong(ConfigurationFlag<Long> configurationFlag) {
        return this.metadataBundle.getLong(configurationFlag.getMetadataFlag());
    }

    private Optional<Double> getRemoteConfigDouble(ConfigurationFlag<Double> configurationFlag) {
        return this.remoteConfigManager.getDouble(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<Long> getRemoteConfigLong(ConfigurationFlag<Long> configurationFlag) {
        return this.remoteConfigManager.getLong(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<Boolean> getRemoteConfigBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.remoteConfigManager.getBoolean(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<String> getRemoteConfigString(ConfigurationFlag<String> configurationFlag) {
        return this.remoteConfigManager.getString(configurationFlag.getRemoteConfigFlag());
    }

    private Optional<Double> getDeviceCacheDouble(ConfigurationFlag<Double> configurationFlag) {
        return this.deviceCacheManager.getDouble(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<Long> getDeviceCacheLong(ConfigurationFlag<Long> configurationFlag) {
        return this.deviceCacheManager.getLong(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<Boolean> getDeviceCacheBoolean(ConfigurationFlag<Boolean> configurationFlag) {
        return this.deviceCacheManager.getBoolean(configurationFlag.getDeviceCacheFlag());
    }

    private Optional<String> getDeviceCacheString(ConfigurationFlag<String> configurationFlag) {
        return this.deviceCacheManager.getString(configurationFlag.getDeviceCacheFlag());
    }
}
