package io.ktor.client.engine;

import io.ktor.client.plugins.HttpTimeout;
import io.ktor.util.Attributes2;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* compiled from: HttpClientEngineCapability.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\"0\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lio/ktor/util/AttributeKey;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "", "ENGINE_CAPABILITIES_KEY", "Lio/ktor/util/AttributeKey;", "getENGINE_CAPABILITIES_KEY", "()Lio/ktor/util/AttributeKey;", "", "Lio/ktor/client/plugins/HttpTimeout$Plugin;", "DEFAULT_CAPABILITIES", "Ljava/util/Set;", "getDEFAULT_CAPABILITIES", "()Ljava/util/Set;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.engine.HttpClientEngineCapabilityKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpClientEngineCapability2 {
    private static final Attributes2<Map<HttpClientEngineCapability<?>, Object>> ENGINE_CAPABILITIES_KEY = new Attributes2<>("EngineCapabilities");
    private static final Set<HttpTimeout.Companion> DEFAULT_CAPABILITIES = SetsKt.setOf(HttpTimeout.INSTANCE);

    public static final Attributes2<Map<HttpClientEngineCapability<?>, Object>> getENGINE_CAPABILITIES_KEY() {
        return ENGINE_CAPABILITIES_KEY;
    }
}
