package microgram.android.inject;

import com.robinhood.android.tracing.RhTrace6;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.Monitoring5;
import microgram.android.internal.HostPlatformMessageTunnel;

/* compiled from: MicrogramRuntimeModule_ProvideRealMonitorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideRealMonitorFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/RealMonitor;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideRealMonitorFactory implements Factory<Monitoring5> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Monitoring5 provideRealMonitor(HostPlatformMessageTunnel hostPlatformMessageTunnel, RhTrace6 rhTrace6) {
        return INSTANCE.provideRealMonitor(hostPlatformMessageTunnel, rhTrace6);
    }

    /* compiled from: MicrogramRuntimeModule_ProvideRealMonitorFactory.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideRealMonitorFactory$Companion;", "", "<init>", "()V", "Lmicrogram/android/internal/HostPlatformMessageTunnel;", "tunnel", "Lcom/robinhood/android/tracing/TrackTrace;", "instanceTrace", "Lmicrogram/android/RealMonitor;", "provideRealMonitor", "(Lmicrogram/android/internal/HostPlatformMessageTunnel;Lcom/robinhood/android/tracing/TrackTrace;)Lmicrogram/android/RealMonitor;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Monitoring5 provideRealMonitor(HostPlatformMessageTunnel tunnel, RhTrace6 instanceTrace) {
            Intrinsics.checkNotNullParameter(tunnel, "tunnel");
            Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideRealMonitor(tunnel, instanceTrace), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Monitoring5) objCheckNotNull;
        }
    }
}
