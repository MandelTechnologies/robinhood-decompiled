package microgram.android.internal;

import kotlin.Metadata;
import microgram.android.internal.RpcListener;

/* compiled from: NoopRpcListenerModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/internal/NoopRpcListenerModule;", "", "<init>", "()V", "provideListener", "Lmicrogram/android/internal/RpcListener;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class NoopRpcListenerModule {
    public static final NoopRpcListenerModule INSTANCE = new NoopRpcListenerModule();

    private NoopRpcListenerModule() {
    }

    public final RpcListener provideListener() {
        return RpcListener.Noop.INSTANCE;
    }
}
