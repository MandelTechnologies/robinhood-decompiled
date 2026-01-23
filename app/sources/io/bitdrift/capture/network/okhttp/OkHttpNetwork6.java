package io.bitdrift.capture.network.okhttp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;

/* compiled from: OkHttpNetwork.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lokhttp3/MediaType;", "contentType", "Lio/bitdrift/capture/network/okhttp/PipeDuplexRequestBody;", "newDuplexRequestBody", "(Lokhttp3/MediaType;)Lio/bitdrift/capture/network/okhttp/PipeDuplexRequestBody;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.network.okhttp.OkHttpNetworkKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class OkHttpNetwork6 {
    public static final OkHttpNetwork7 newDuplexRequestBody(MediaType contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new OkHttpNetwork7(contentType, 1048576L);
    }
}
