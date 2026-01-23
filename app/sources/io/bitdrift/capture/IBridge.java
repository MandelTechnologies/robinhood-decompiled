package io.bitdrift.capture;

import io.bitdrift.capture.error.IErrorReporter;
import io.bitdrift.capture.network.ICaptureNetwork;
import io.bitdrift.capture.providers.session.SessionStrategyConfiguration;
import kotlin.Metadata;

/* compiled from: IBridge.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001Jp\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, m3636d2 = {"Lio/bitdrift/capture/IBridge;", "", "createLogger", "", "sdkDirectory", "", "apiKey", "sessionStrategy", "Lio/bitdrift/capture/providers/session/SessionStrategyConfiguration;", "metadataProvider", "Lio/bitdrift/capture/IMetadataProvider;", "resourceUtilizationTarget", "Lio/bitdrift/capture/IResourceUtilizationTarget;", "sessionReplayTarget", "Lio/bitdrift/capture/ISessionReplayTarget;", "eventsListenerTarget", "Lio/bitdrift/capture/IEventsListenerTarget;", "applicationId", "applicationVersion", "model", "network", "Lio/bitdrift/capture/network/ICaptureNetwork;", "preferences", "Lio/bitdrift/capture/IPreferences;", "errorReporter", "Lio/bitdrift/capture/error/IErrorReporter;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IBridge {
    long createLogger(String sdkDirectory, String apiKey, SessionStrategyConfiguration sessionStrategy, IMetadataProvider metadataProvider, IResourceUtilizationTarget resourceUtilizationTarget, ISessionReplayTarget sessionReplayTarget, IEventsListenerTarget eventsListenerTarget, String applicationId, String applicationVersion, String model, ICaptureNetwork network, IPreferences preferences, IErrorReporter errorReporter);
}
