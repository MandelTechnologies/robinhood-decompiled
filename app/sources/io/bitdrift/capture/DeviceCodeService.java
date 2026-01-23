package io.bitdrift.capture;

import io.bitdrift.capture.network.okhttp.OkHttpApiClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeviceCodeService.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/bitdrift/capture/DeviceCodeService;", "", "Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;", "apiClient", "<init>", "(Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;)V", "Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DeviceCodeService {
    private final OkHttpApiClient apiClient;

    public DeviceCodeService(OkHttpApiClient apiClient) {
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        this.apiClient = apiClient;
    }
}
