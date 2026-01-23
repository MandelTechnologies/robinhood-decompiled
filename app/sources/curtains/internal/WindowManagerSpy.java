package curtains.internal;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowManagerSpy.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\u00020\t22\u0010\b\u001a.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcurtains/internal/WindowManagerSpy;", "", "<init>", "()V", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "swap", "", "swapWindowManagerGlobalMViews", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Class;", "windowManagerClass$delegate", "Lkotlin/Lazy;", "getWindowManagerClass", "()Ljava/lang/Class;", "windowManagerClass", "windowManagerInstance$delegate", "getWindowManagerInstance", "()Ljava/lang/Object;", "windowManagerInstance", "Ljava/lang/reflect/Field;", "mViewsField$delegate", "getMViewsField", "()Ljava/lang/reflect/Field;", "mViewsField", "curtains_release"}, m3637k = 1, m3638mv = {1, 4, 1})
/* loaded from: classes18.dex */
public final class WindowManagerSpy {
    public static final WindowManagerSpy INSTANCE = new WindowManagerSpy();

    /* renamed from: mViewsField$delegate, reason: from kotlin metadata */
    private static final Lazy mViewsField;

    /* renamed from: windowManagerClass$delegate, reason: from kotlin metadata */
    private static final Lazy windowManagerClass;

    /* renamed from: windowManagerInstance$delegate, reason: from kotlin metadata */
    private static final Lazy windowManagerInstance;

    private final Field getMViewsField() {
        return (Field) mViewsField.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowManagerClass() {
        return (Class) windowManagerClass.getValue();
    }

    private final Object getWindowManagerInstance() {
        return windowManagerInstance.getValue();
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        windowManagerClass = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Class<?>>() { // from class: curtains.internal.WindowManagerSpy$windowManagerClass$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Class<?> invoke() {
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th) {
                    Log.w("WindowManagerSpy", th);
                    return null;
                }
            }
        });
        windowManagerInstance = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Object>() { // from class: curtains.internal.WindowManagerSpy$windowManagerInstance$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class windowManagerClass2 = WindowManagerSpy.INSTANCE.getWindowManagerClass();
                if (windowManagerClass2 != null) {
                    return windowManagerClass2.getMethod("getInstance", null).invoke(null, null);
                }
                return null;
            }
        });
        mViewsField = LazyKt.lazy(lazyThreadSafetyMode, new Function0<Field>() { // from class: curtains.internal.WindowManagerSpy$mViewsField$2
            @Override // kotlin.jvm.functions.Function0
            public final Field invoke() throws NoSuchFieldException, SecurityException {
                Class windowManagerClass2 = WindowManagerSpy.INSTANCE.getWindowManagerClass();
                if (windowManagerClass2 == null) {
                    return null;
                }
                Field declaredField = windowManagerClass2.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            }
        });
    }

    private WindowManagerSpy() {
    }

    @SuppressLint({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public final void swapWindowManagerGlobalMViews(Function1<? super ArrayList<View>, ? extends ArrayList<View>> swap) {
        Field mViewsField2;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object windowManagerInstance2 = getWindowManagerInstance();
            if (windowManagerInstance2 == null || (mViewsField2 = INSTANCE.getMViewsField()) == null) {
                return;
            }
            Object obj = mViewsField2.get(windowManagerInstance2);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
            }
            mViewsField2.set(windowManagerInstance2, swap.invoke((ArrayList) obj));
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
        }
    }
}
