package io.ktor.client.engine;

import java.net.Proxy;
import kotlin.Metadata;

/* compiled from: HttpClientEngineConfig.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "", "<init>", "()V", "", "threadsCount", "I", "getThreadsCount", "()I", "setThreadsCount", "(I)V", "getThreadsCount$annotations", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "proxy", "Ljava/net/Proxy;", "getProxy", "()Ljava/net/Proxy;", "setProxy", "(Ljava/net/Proxy;)V", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public class HttpClientEngineConfig {
    private Proxy proxy;
    private int threadsCount = 4;

    public final Proxy getProxy() {
        return this.proxy;
    }

    public final void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }
}
