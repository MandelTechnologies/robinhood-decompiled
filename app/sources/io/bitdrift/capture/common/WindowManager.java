package io.bitdrift.capture.common;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inspector.WindowInspector;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowManager.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR+\u0010\f\u001a\u0012\u0012\u0002\b\u0003 \u0007*\b\u0012\u0002\b\u0003\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m3636d2 = {"Lio/bitdrift/capture/common/WindowManager;", "Lio/bitdrift/capture/common/IWindowManager;", "errorHandler", "Lio/bitdrift/capture/common/ErrorHandler;", "(Lio/bitdrift/capture/common/ErrorHandler;)V", "getWindowViews", "Ljava/lang/reflect/Field;", "kotlin.jvm.PlatformType", "getGetWindowViews", "()Ljava/lang/reflect/Field;", "getWindowViews$delegate", "Lkotlin/Lazy;", "global", "Ljava/lang/Class;", "getGlobal", "()Ljava/lang/Class;", "global$delegate", "tryWindowInspector", "", "windowManagerGlobal", "", "getWindowManagerGlobal", "()Ljava/lang/Object;", "windowManagerGlobal$delegate", "getAllRootViews", "", "Landroid/view/View;", "getCurrentWindow", "Landroid/view/Window;", "getFirstRootView", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class WindowManager implements IWindowManager {
    private final ErrorHandler errorHandler;

    /* renamed from: getWindowViews$delegate, reason: from kotlin metadata */
    private final Lazy getWindowViews;

    /* renamed from: global$delegate, reason: from kotlin metadata */
    private final Lazy global;
    private boolean tryWindowInspector;

    /* renamed from: windowManagerGlobal$delegate, reason: from kotlin metadata */
    private final Lazy windowManagerGlobal;

    public WindowManager(ErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
        this.tryWindowInspector = true;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.global = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Class<?>>() { // from class: io.bitdrift.capture.common.WindowManager$global$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Class<?> invoke() {
                return Class.forName("android.view.WindowManagerGlobal");
            }
        });
        this.windowManagerGlobal = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Object>() { // from class: io.bitdrift.capture.common.WindowManager$windowManagerGlobal$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.this$0.getGlobal().getDeclaredMethod("getInstance", null).invoke(null, null);
            }
        });
        this.getWindowViews = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Field>() { // from class: io.bitdrift.capture.common.WindowManager$getWindowViews$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Field invoke() throws NoSuchFieldException, SecurityException {
                Field declaredField = this.this$0.getGlobal().getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getGlobal() {
        return (Class) this.global.getValue();
    }

    @Override // io.bitdrift.capture.common.IWindowManager
    public Window getCurrentWindow() {
        View firstRootView = getFirstRootView();
        if (firstRootView != null) {
            return Windows4.getPhoneWindow(firstRootView);
        }
        return null;
    }

    @Override // io.bitdrift.capture.common.IWindowManager
    public View getFirstRootView() {
        return (View) CollectionsKt.firstOrNull((List) getAllRootViews());
    }

    private final Object getWindowManagerGlobal() {
        return this.windowManagerGlobal.getValue();
    }

    private final Field getGetWindowViews() {
        return (Field) this.getWindowViews.getValue();
    }

    @Override // io.bitdrift.capture.common.IWindowManager
    public List<View> getAllRootViews() {
        if (Build.VERSION.SDK_INT >= 29 && this.tryWindowInspector) {
            try {
                List<View> globalWindowViews = WindowInspector.getGlobalWindowViews();
                Intrinsics.checkNotNullExpressionValue(globalWindowViews, "getGlobalWindowViews(...)");
                return globalWindowViews;
            } catch (Throwable th) {
                this.errorHandler.handleError("Warning: Failed to retrieve windows using WindowInspector", th);
                this.tryWindowInspector = false;
            }
        }
        try {
            Object obj = getGetWindowViews().get(getWindowManagerGlobal());
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<android.view.View>");
            return (List) obj;
        } catch (Throwable th2) {
            this.errorHandler.handleError("Failed to retrieve windows", th2);
            return CollectionsKt.emptyList();
        }
    }
}
