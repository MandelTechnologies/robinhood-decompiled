package io.bitdrift.capture.network;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: ICaptureNetwork.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/network/ICaptureNetwork;", "", "startStream", "Lio/bitdrift/capture/network/ICaptureStream;", "streamId", "", "headers", "", "", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ICaptureNetwork {
    ICaptureNetwork2 startStream(long streamId, Map<String, String> headers);
}
