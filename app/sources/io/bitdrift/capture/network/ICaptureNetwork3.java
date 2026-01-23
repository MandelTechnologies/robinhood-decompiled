package io.bitdrift.capture.network;

import kotlin.Metadata;

/* compiled from: ICaptureNetwork.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086 J\u0019\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086 J\u0011\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 ¨\u0006\u000f"}, m3636d2 = {"Lio/bitdrift/capture/network/Jni;", "", "()V", "onApiChunkReceived", "", "streamId", "", "dataToSend", "", "size", "", "onApiStreamClosed", "reason", "", "releaseApiStream", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.network.Jni, reason: use source file name */
/* loaded from: classes14.dex */
public final class ICaptureNetwork3 {
    public static final ICaptureNetwork3 INSTANCE = new ICaptureNetwork3();

    public final native void onApiChunkReceived(long streamId, byte[] dataToSend, int size);

    public final native void onApiStreamClosed(long streamId, String reason);

    public final native void releaseApiStream(long streamId);

    private ICaptureNetwork3() {
    }
}
