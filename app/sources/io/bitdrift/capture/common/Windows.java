package io.bitdrift.capture.common;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Windows.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R!\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lio/bitdrift/capture/common/WindowSpy;", "", "()V", "decorViewClass", "Ljava/lang/Class;", "getDecorViewClass", "()Ljava/lang/Class;", "decorViewClass$delegate", "Lkotlin/Lazy;", "windowField", "Ljava/lang/reflect/Field;", "getWindowField", "()Ljava/lang/reflect/Field;", "windowField$delegate", "pullWindow", "Landroid/view/Window;", "maybeDecorView", "Landroid/view/View;", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.common.WindowSpy, reason: use source file name */
/* loaded from: classes14.dex */
public final class Windows {
    public static final Windows INSTANCE = new Windows();

    /* renamed from: decorViewClass$delegate, reason: from kotlin metadata */
    private static final Lazy decorViewClass;

    /* renamed from: windowField$delegate, reason: from kotlin metadata */
    private static final Lazy windowField;

    private Windows() {
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        decorViewClass = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Class<?>>() { // from class: io.bitdrift.capture.common.WindowSpy$decorViewClass$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Class<?> invoke() {
                int i = Build.VERSION.SDK_INT;
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable th) {
                    Log.d("WindowSpy", "Unexpected exception loading com.android.internal.policy.DecorView on API " + i, th);
                    return null;
                }
            }
        });
        windowField = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Field>() { // from class: io.bitdrift.capture.common.WindowSpy$windowField$2
            @Override // kotlin.jvm.functions.Function0
            public final Field invoke() throws NoSuchFieldException, SecurityException {
                Class decorViewClass2 = Windows.INSTANCE.getDecorViewClass();
                if (decorViewClass2 == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                try {
                    Field declaredField = decorViewClass2.getDeclaredField("mWindow");
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (NoSuchFieldException e) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + decorViewClass2 + "#mWindow on API " + i, e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getDecorViewClass() {
        return (Class) decorViewClass.getValue();
    }

    private final Field getWindowField() {
        return (Field) windowField.getValue();
    }

    public final Window pullWindow(View maybeDecorView) throws IllegalAccessException, IllegalArgumentException {
        Field windowField2;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class<?> decorViewClass2 = getDecorViewClass();
        if (decorViewClass2 == null || !decorViewClass2.isInstance(maybeDecorView) || (windowField2 = INSTANCE.getWindowField()) == null) {
            return null;
        }
        Object obj = windowField2.get(maybeDecorView);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
