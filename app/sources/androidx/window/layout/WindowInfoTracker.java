package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackend;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: WindowInfoTracker.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m3636d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Landroid/app/Activity;", "activity", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/Flow;", "Companion", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public interface WindowInfoTracker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Flow<WindowLayoutInfo> windowLayoutInfo(Activity activity);

    /* compiled from: WindowInfoTracker.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR#\u0010\u0015\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "(Landroid/content/Context;)Landroidx/window/layout/WindowInfoTracker;", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "Landroidx/window/layout/adapter/WindowBackend;", "extensionBackend$delegate", "Lkotlin/Lazy;", "getExtensionBackend$window_release", "()Landroidx/window/layout/adapter/WindowBackend;", "getExtensionBackend$window_release$annotations", "extensionBackend", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = Reflection.getOrCreateKotlinClass(WindowInfoTracker.class).getSimpleName();

        /* renamed from: extensionBackend$delegate, reason: from kotlin metadata */
        private static final Lazy<WindowBackend> extensionBackend = LazyKt.lazy(new Function0<WindowBackend>() { // from class: androidx.window.layout.WindowInfoTracker$Companion$extensionBackend$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final WindowBackend invoke() {
                WindowLayoutComponent windowLayoutComponent;
                try {
                    ClassLoader classLoader = WindowInfoTracker.class.getClassLoader();
                    SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = classLoader != null ? new SafeWindowLayoutComponentProvider(classLoader, new ConsumerAdapter(classLoader)) : null;
                    if (safeWindowLayoutComponentProvider == null || (windowLayoutComponent = safeWindowLayoutComponentProvider.getWindowLayoutComponent()) == null) {
                        return null;
                    }
                    ExtensionWindowBackend.Companion companion = ExtensionWindowBackend.Companion;
                    Intrinsics.checkNotNull(classLoader);
                    return companion.newInstance(windowLayoutComponent, new ConsumerAdapter(classLoader));
                } catch (Throwable unused) {
                    if (WindowInfoTracker.Companion.DEBUG) {
                        Log.d(WindowInfoTracker.Companion.TAG, "Failed to load WindowExtensions");
                    }
                    return null;
                }
            }
        });
        private static WindowInfoTracker4 decorator = WindowInfoTracker2.INSTANCE;

        private Companion() {
        }

        public final WindowBackend getExtensionBackend$window_release() {
            return extensionBackend.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @JvmName
        public final WindowInfoTracker getOrCreate(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WindowBackend extensionBackend$window_release = getExtensionBackend$window_release();
            if (extensionBackend$window_release == null) {
                extensionBackend$window_release = SidecarWindowBackend.INSTANCE.getInstance(context);
            }
            return decorator.decorate(new WindowInfoTrackerImpl(new WindowMetricsCalculatorCompat(null, 1, 0 == true ? 1 : 0), extensionBackend$window_release, WindowSdkExtensions.INSTANCE.getInstance()));
        }
    }
}
