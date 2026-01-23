package io.bitdrift.capture.network;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* compiled from: HTTPHeaders.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"", "", "DISALLOWED_HEADER_KEYS", "Ljava/util/Set;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.network.HTTPHeadersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HTTPHeaders2 {
    private static final Set<String> DISALLOWED_HEADER_KEYS = SetsKt.setOf((Object[]) new String[]{"authorization", "proxy-authorization"});
}
