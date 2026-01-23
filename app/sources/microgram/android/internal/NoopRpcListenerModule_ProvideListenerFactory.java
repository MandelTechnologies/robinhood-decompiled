package microgram.android.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoopRpcListenerModule_ProvideListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/NoopRpcListenerModule_ProvideListenerFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/internal/RpcListener;", "<init>", "()V", "provideListener", "()Lmicrogram/android/internal/RpcListener;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class NoopRpcListenerModule_ProvideListenerFactory implements Factory<RpcListener> {
    public static final NoopRpcListenerModule_ProvideListenerFactory INSTANCE = new NoopRpcListenerModule_ProvideListenerFactory();

    private NoopRpcListenerModule_ProvideListenerFactory() {
    }

    @Override // javax.inject.Provider
    public RpcListener get() {
        return provideListener();
    }

    @JvmStatic
    public static final RpcListener provideListener() {
        Object objCheckNotNull = Preconditions.checkNotNull(NoopRpcListenerModule.INSTANCE.provideListener(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (RpcListener) objCheckNotNull;
    }
}
