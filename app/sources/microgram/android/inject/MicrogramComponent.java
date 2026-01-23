package microgram.android.inject;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.hammer.android.internal.LifecycleCoroutineScope;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramSource;
import microgram.android.Monitoring2;
import microgram.android.extension.ServiceExtension;
import microgram.android.internal.HostCompatibilityFlags;
import microgram.android.internal.guest.ResourceLoader;
import microgram.android.service.ServiceLocator;

/* compiled from: MicrogramComponent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u001aR\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramComponent;", "", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lmicrogram/android/Monitor;", "getMicrogramMonitor", "()Lmicrogram/android/Monitor;", "microgramMonitor", "Lmicrogram/android/internal/guest/ResourceLoader;", "getResourceLoader", "()Lmicrogram/android/internal/guest/ResourceLoader;", "resourceLoader", "Lmicrogram/android/service/ServiceLocator;", "getServiceLocator", "()Lmicrogram/android/service/ServiceLocator;", "serviceLocator", "Lcom/robinhood/android/tracing/TrackTrace;", "getInstanceTrace", "()Lcom/robinhood/android/tracing/TrackTrace;", "instanceTrace", "Lmicrogram/android/internal/HostCompatibilityFlags;", "getHostCompatibilityFlags", "()Lmicrogram/android/internal/HostCompatibilityFlags;", "hostCompatibilityFlags", "Factory", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface MicrogramComponent {
    @LifecycleCoroutineScope
    CoroutineScope getCoroutineScope();

    HostCompatibilityFlags getHostCompatibilityFlags();

    RhTrace6 getInstanceTrace();

    Monitoring2 getMicrogramMonitor();

    ResourceLoader getResourceLoader();

    ServiceLocator getServiceLocator();

    /* compiled from: MicrogramComponent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J>\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0019\b\u0003\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramComponent$Factory;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lmicrogram/android/MicrogramSource;", "source", "", "", "Lmicrogram/android/extension/ServiceExtension$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "extensions", "Lmicrogram/android/inject/MicrogramComponent;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/MicrogramSource;Ljava/util/Map;)Lmicrogram/android/inject/MicrogramComponent;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        MicrogramComponent create(@LifecycleCoroutineScope CoroutineScope coroutineScope, MicrogramSource source, Map<String, ServiceExtension.Factory> extensions);

        /* compiled from: MicrogramComponent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MicrogramComponent create$default(Factory factory, CoroutineScope coroutineScope, MicrogramSource microgramSource, Map map, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
                }
                if ((i & 4) != 0) {
                    map = MapsKt.emptyMap();
                }
                return factory.create(coroutineScope, microgramSource, map);
            }
        }
    }
}
