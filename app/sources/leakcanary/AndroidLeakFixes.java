package leakcanary;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.UserManager;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import com.adjust.sdk.Constants;
import curtains.Curtains;
import curtains.Listeners;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import leakcanary.internal.Handlers;
import leakcanary.internal.Objects2;
import shark.SharkLog;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidLeakFixes.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lleakcanary/AndroidLeakFixes;", "", "(Ljava/lang/String;I)V", "applied", "", "apply", "", "application", "Landroid/app/Application;", "MEDIA_SESSION_LEGACY_HELPER", "TEXT_LINE_POOL", "USER_MANAGER", "FLUSH_HANDLER_THREADS", "ACCESSIBILITY_NODE_INFO", "CONNECTIVITY_MANAGER", "SAMSUNG_CLIPBOARD_MANAGER", "BUBBLE_POPUP", "LAST_HOVERED_VIEW", "ACTIVITY_MANAGER", "VIEW_LOCATION_HOLDER", "IMM_FOCUSED_VIEW", "IMM_CUR_ROOT_VIEW", "SPELL_CHECKER", "PERMISSION_CONTROLLER_MANAGER", "Companion", "plumber-android-core_release"}, m3637k = 1, m3638mv = {1, 4, 1})
@SuppressLint({"NewApi"})
/* loaded from: classes23.dex */
public abstract class AndroidLeakFixes {
    private static final /* synthetic */ AndroidLeakFixes[] $VALUES;
    public static final AndroidLeakFixes ACCESSIBILITY_NODE_INFO;
    public static final AndroidLeakFixes ACTIVITY_MANAGER;
    public static final AndroidLeakFixes BUBBLE_POPUP;
    public static final AndroidLeakFixes CONNECTIVITY_MANAGER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AndroidLeakFixes FLUSH_HANDLER_THREADS;
    public static final AndroidLeakFixes IMM_CUR_ROOT_VIEW;
    public static final AndroidLeakFixes IMM_FOCUSED_VIEW;
    public static final AndroidLeakFixes LAST_HOVERED_VIEW;
    public static final AndroidLeakFixes MEDIA_SESSION_LEGACY_HELPER;
    public static final AndroidLeakFixes PERMISSION_CONTROLLER_MANAGER;
    public static final AndroidLeakFixes SAMSUNG_CLIPBOARD_MANAGER;
    public static final AndroidLeakFixes SPELL_CHECKER;
    public static final AndroidLeakFixes TEXT_LINE_POOL;
    public static final AndroidLeakFixes USER_MANAGER;
    public static final AndroidLeakFixes VIEW_LOCATION_HOLDER;
    private static final Lazy backgroundHandler$delegate;
    private boolean applied;

    public static AndroidLeakFixes valueOf(String str) {
        return (AndroidLeakFixes) Enum.valueOf(AndroidLeakFixes.class, str);
    }

    public static AndroidLeakFixes[] values() {
        return (AndroidLeakFixes[]) $VALUES.clone();
    }

    protected abstract void apply(Application application);

    /* compiled from: AndroidLeakFixes.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u0006*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u0006*\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, m3636d2 = {"Lleakcanary/AndroidLeakFixes$Companion;", "", "<init>", "()V", "Landroid/os/Handler;", "Lkotlin/Function0;", "", "onIdle", "onEachIdle", "(Landroid/os/Handler;Lkotlin/jvm/functions/Function0;)V", "", "Landroid/os/HandlerThread;", "findAllHandlerThreads", "()Ljava/util/List;", "Landroid/app/Application;", "application", "", "Lleakcanary/AndroidLeakFixes;", "fixes", "applyFixes", "(Landroid/app/Application;Ljava/util/Set;)V", "Lkotlin/Function1;", "Landroid/app/Activity;", "block", "onActivityDestroyed$plumber_android_core_release", "(Landroid/app/Application;Lkotlin/jvm/functions/Function1;)V", "onActivityDestroyed", "backgroundHandler$delegate", "Lkotlin/Lazy;", "getBackgroundHandler$plumber_android_core_release", "()Landroid/os/Handler;", "backgroundHandler", "", "LG", "Ljava/lang/String;", "SAMSUNG", "plumber-android-core_release"}, m3637k = 1, m3638mv = {1, 4, 1})
    public static final class Companion {
        public final Handler getBackgroundHandler$plumber_android_core_release() {
            return (Handler) AndroidLeakFixes.backgroundHandler$delegate.getValue();
        }

        public final void applyFixes(Application application, Set<? extends AndroidLeakFixes> fixes) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            Intrinsics.checkParameterIsNotNull(fixes, "fixes");
            Handlers.checkMainThread();
            for (AndroidLeakFixes androidLeakFixes : fixes) {
                if (androidLeakFixes.applied) {
                    SharkLog.INSTANCE.getLogger();
                } else {
                    androidLeakFixes.apply(application);
                    androidLeakFixes.applied = true;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void applyFixes$default(Companion companion, Application application, Set set, int i, Object obj) {
            if ((i & 2) != 0) {
                set = EnumSet.allOf(AndroidLeakFixes.class);
                Intrinsics.checkExpressionValueIsNotNull(set, "EnumSet.allOf(AndroidLeakFixes::class.java)");
            }
            companion.applyFixes(application, set);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onEachIdle(Handler handler, final Function0<Unit> function0) {
            try {
                handler.post(new Runnable() { // from class: leakcanary.AndroidLeakFixes$Companion$onEachIdle$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: leakcanary.AndroidLeakFixes$Companion$onEachIdle$1.1
                            @Override // android.os.MessageQueue.IdleHandler
                            public final boolean queueIdle() {
                                function0.invoke();
                                return true;
                            }
                        });
                    }
                });
            } catch (RuntimeException unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<HandlerThread> findAllHandlerThreads() {
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(threadCurrentThread, "Thread.currentThread()");
            ThreadGroup threadGroup = threadCurrentThread.getThreadGroup();
            if (threadGroup == null) {
                Intrinsics.throwNpe();
            }
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
                Intrinsics.checkExpressionValueIsNotNull(threadGroup, "rootGroup.parent");
            }
            Thread[] threadArr = new Thread[threadGroup.activeCount()];
            while (threadGroup.enumerate(threadArr, true) == threadArr.length) {
                threadArr = new Thread[threadArr.length * 2];
            }
            ArrayList arrayList = new ArrayList();
            for (Thread thread : threadArr) {
                HandlerThread handlerThread = thread instanceof HandlerThread ? (HandlerThread) thread : null;
                if (handlerThread != null) {
                    arrayList.add(handlerThread);
                }
            }
            return arrayList;
        }

        public final void onActivityDestroyed$plumber_android_core_release(Application onActivityDestroyed, final Function1<? super Activity, Unit> block) {
            Intrinsics.checkParameterIsNotNull(onActivityDestroyed, "$this$onActivityDestroyed");
            Intrinsics.checkParameterIsNotNull(block, "block");
            onActivityDestroyed.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: leakcanary.AndroidLeakFixes$Companion$onActivityDestroyed$1
                private final /* synthetic */ Application.ActivityLifecycleCallbacks $$delegate_0;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(@NonNull Activity p0, @Nullable Bundle p1) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    this.$$delegate_0.onActivityCreated(p0, p1);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(@NonNull Activity p0) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    this.$$delegate_0.onActivityPaused(p0);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(@NonNull Activity p0) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    this.$$delegate_0.onActivityResumed(p0);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(@NonNull Activity p0, @NonNull Bundle p1) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    Intrinsics.checkParameterIsNotNull(p1, "p1");
                    this.$$delegate_0.onActivitySaveInstanceState(p0, p1);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(@NonNull Activity p0) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    this.$$delegate_0.onActivityStarted(p0);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(@NonNull Activity p0) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    this.$$delegate_0.onActivityStopped(p0);
                }

                {
                    Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, Objects2.NO_OP_HANDLER);
                    if (objNewProxyInstance == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
                    }
                    this.$$delegate_0 = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    Intrinsics.checkParameterIsNotNull(activity, "activity");
                    block.invoke(activity);
                }
            });
        }
    }

    private AndroidLeakFixes(String str, int i) {
    }

    public /* synthetic */ AndroidLeakFixes(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* compiled from: AndroidLeakFixes.kt */
    @Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, m3636d2 = {"Lleakcanary/AndroidLeakFixes$TEXT_LINE_POOL;", "Lleakcanary/AndroidLeakFixes;", "apply", "", "application", "Landroid/app/Application;", "plumber-android-core_release"}, m3637k = 1, m3638mv = {1, 4, 1})
    static final class TEXT_LINE_POOL extends AndroidLeakFixes {
        TEXT_LINE_POOL(String str, int i) {
            super(str, i, null);
        }

        @Override // leakcanary.AndroidLeakFixes
        protected void apply(final Application application) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AndroidLeakFixes.INSTANCE.getBackgroundHandler$plumber_android_core_release().post(new Runnable() { // from class: leakcanary.AndroidLeakFixes$TEXT_LINE_POOL$apply$1
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
                    try {
                        final Field sCachedField = Class.forName("android.text.TextLine").getDeclaredField("sCached");
                        Intrinsics.checkExpressionValueIsNotNull(sCachedField, "sCachedField");
                        sCachedField.setAccessible(true);
                        Object obj = sCachedField.get(null);
                        if (obj != null && obj.getClass().isArray()) {
                            AndroidLeakFixes.INSTANCE.onActivityDestroyed$plumber_android_core_release(application, new Function1<Activity, Unit>() { // from class: leakcanary.AndroidLeakFixes$TEXT_LINE_POOL$apply$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Activity activity) throws IllegalAccessException, IllegalArgumentException {
                                    invoke2(activity);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Activity it) throws IllegalAccessException, IllegalArgumentException {
                                    Intrinsics.checkParameterIsNotNull(it, "it");
                                    Object sCached = sCachedField.get(null);
                                    Intrinsics.checkExpressionValueIsNotNull(sCached, "sCached");
                                    synchronized (sCached) {
                                        try {
                                            int length = Array.getLength(sCached);
                                            for (int i = 0; i < length; i++) {
                                                Array.set(sCached, i, null);
                                            }
                                            Unit unit = Unit.INSTANCE;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            });
                            return;
                        }
                        SharkLog.INSTANCE.getLogger();
                    } catch (Exception unused) {
                        SharkLog.INSTANCE.getLogger();
                    }
                }
            });
        }
    }

    /* compiled from: AndroidLeakFixes.kt */
    @Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"Lleakcanary/AndroidLeakFixes$IMM_CUR_ROOT_VIEW;", "Lleakcanary/AndroidLeakFixes;", "activityOrNull", "Landroid/app/Activity;", "Landroid/content/Context;", "getActivityOrNull", "(Landroid/content/Context;)Landroid/app/Activity;", "apply", "", "application", "Landroid/app/Application;", "plumber-android-core_release"}, m3637k = 1, m3638mv = {1, 4, 1})
    static final class IMM_CUR_ROOT_VIEW extends AndroidLeakFixes {
        IMM_CUR_ROOT_VIEW(String str, int i) {
            super(str, i, null);
        }

        @Override // leakcanary.AndroidLeakFixes
        protected void apply(Application application) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            if (Build.VERSION.SDK_INT >= 29) {
                return;
            }
            try {
                Object systemService = application.getSystemService("input_method");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                final InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                try {
                    final Field declaredField = InputMethodManager.class.getDeclaredField("mCurRootView");
                    declaredField.setAccessible(true);
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: leakcanary.AndroidLeakFixes$IMM_CUR_ROOT_VIEW$apply$1
                        private final /* synthetic */ Application.ActivityLifecycleCallbacks $$delegate_0;

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityCreated(@NonNull Activity p0, @Nullable Bundle p1) {
                            Intrinsics.checkParameterIsNotNull(p0, "p0");
                            this.$$delegate_0.onActivityCreated(p0, p1);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityPaused(@NonNull Activity p0) {
                            Intrinsics.checkParameterIsNotNull(p0, "p0");
                            this.$$delegate_0.onActivityPaused(p0);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityResumed(@NonNull Activity p0) {
                            Intrinsics.checkParameterIsNotNull(p0, "p0");
                            this.$$delegate_0.onActivityResumed(p0);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivitySaveInstanceState(@NonNull Activity p0, @NonNull Bundle p1) {
                            Intrinsics.checkParameterIsNotNull(p0, "p0");
                            Intrinsics.checkParameterIsNotNull(p1, "p1");
                            this.$$delegate_0.onActivitySaveInstanceState(p0, p1);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityStarted(@NonNull Activity p0) {
                            Intrinsics.checkParameterIsNotNull(p0, "p0");
                            this.$$delegate_0.onActivityStarted(p0);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityStopped(@NonNull Activity p0) {
                            Intrinsics.checkParameterIsNotNull(p0, "p0");
                            this.$$delegate_0.onActivityStopped(p0);
                        }

                        {
                            Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, Objects2.NO_OP_HANDLER);
                            if (objNewProxyInstance == null) {
                                throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
                            }
                            this.$$delegate_0 = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public void onActivityDestroyed(Activity activity) {
                            boolean z;
                            Context context;
                            Intrinsics.checkParameterIsNotNull(activity, "activity");
                            try {
                                View view = (View) declaredField.get(inputMethodManager);
                                if (view == null || activity.getWindow() == null) {
                                    z = false;
                                } else {
                                    Window window = activity.getWindow();
                                    Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
                                    if (window.getDecorView() == view) {
                                        z = true;
                                    }
                                }
                                boolean z2 = ((view == null || (context = view.getContext()) == null) ? null : this.this$0.getActivityOrNull(context)) == activity;
                                if (!z && !z2) {
                                    return;
                                }
                                declaredField.set(inputMethodManager, null);
                            } catch (Throwable unused) {
                                SharkLog.INSTANCE.getLogger();
                            }
                        }
                    });
                    Curtains.getOnRootViewsChangedListeners().add(new Listeners() { // from class: leakcanary.AndroidLeakFixes$IMM_CUR_ROOT_VIEW$apply$2
                        @Override // curtains.Listeners2
                        public void onRootViewsChanged(View view, boolean z) {
                            Intrinsics.checkParameterIsNotNull(view, "view");
                            Listeners.DefaultImpls.onRootViewsChanged(this, view, z);
                        }

                        @Override // curtains.Listeners
                        public final void onRootViewRemoved(View removedRootView) throws IllegalAccessException, IllegalArgumentException {
                            Intrinsics.checkParameterIsNotNull(removedRootView, "removedRootView");
                            if (((View) declaredField.get(inputMethodManager)) == removedRootView) {
                                declaredField.set(inputMethodManager, null);
                            }
                        }
                    });
                } catch (Throwable unused) {
                    SharkLog.INSTANCE.getLogger();
                }
            } catch (Throwable unused2) {
                SharkLog.INSTANCE.getLogger();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Activity getActivityOrNull(Context context) {
            Context baseContext = context;
            while (!(baseContext instanceof Application)) {
                if (baseContext instanceof Activity) {
                    return (Activity) baseContext;
                }
                if (!(baseContext instanceof ContextWrapper) || (baseContext = ((ContextWrapper) baseContext).getBaseContext()) == context) {
                    return null;
                }
                Intrinsics.checkExpressionValueIsNotNull(baseContext, "baseContext");
            }
            return null;
        }
    }

    static {
        AndroidLeakFixes androidLeakFixes = new AndroidLeakFixes("MEDIA_SESSION_LEGACY_HELPER", 0) { // from class: leakcanary.AndroidLeakFixes.MEDIA_SESSION_LEGACY_HELPER
            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
            }

            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }
        };
        MEDIA_SESSION_LEGACY_HELPER = androidLeakFixes;
        TEXT_LINE_POOL text_line_pool = new TEXT_LINE_POOL("TEXT_LINE_POOL", 1);
        TEXT_LINE_POOL = text_line_pool;
        AndroidLeakFixes androidLeakFixes2 = new AndroidLeakFixes("USER_MANAGER", 2) { // from class: leakcanary.AndroidLeakFixes.USER_MANAGER
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            @SuppressLint({"NewApi"})
            protected void apply(Application application) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                Intrinsics.checkParameterIsNotNull(application, "application");
                if (25 < Build.VERSION.SDK_INT) {
                    return;
                }
                try {
                    UserManager.class.getDeclaredMethod("get", Context.class).invoke(null, application);
                } catch (Exception unused) {
                    SharkLog.INSTANCE.getLogger();
                }
            }
        };
        USER_MANAGER = androidLeakFixes2;
        AndroidLeakFixes androidLeakFixes3 = new AndroidLeakFixes("FLUSH_HANDLER_THREADS", 3) { // from class: leakcanary.AndroidLeakFixes.FLUSH_HANDLER_THREADS
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                if (Build.VERSION.SDK_INT >= 31) {
                    return;
                }
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                Companion companion = AndroidLeakFixes.INSTANCE;
                Looper looper = companion.getBackgroundHandler$plumber_android_core_release().getLooper();
                Intrinsics.checkExpressionValueIsNotNull(looper, "backgroundHandler.looper");
                Thread thread = looper.getThread();
                if (thread == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.os.HandlerThread");
                }
                linkedHashSet.add(Integer.valueOf(((HandlerThread) thread).getThreadId()));
                companion.getBackgroundHandler$plumber_android_core_release().postDelayed(new Runnable() { // from class: leakcanary.AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1
                    @Override // java.lang.Runnable
                    public void run() {
                        List<HandlerThread> listFindAllHandlerThreads = AndroidLeakFixes.INSTANCE.findAllHandlerThreads();
                        ArrayList<Tuples2> arrayList = new ArrayList();
                        for (HandlerThread handlerThread : listFindAllHandlerThreads) {
                            int threadId = handlerThread.getThreadId();
                            Tuples2 tuples2M3642to = (threadId == -1 || linkedHashSet.contains(Integer.valueOf(threadId))) ? null : Tuples4.m3642to(Integer.valueOf(threadId), handlerThread);
                            if (tuples2M3642to != null) {
                                arrayList.add(tuples2M3642to);
                            }
                        }
                        for (Tuples2 tuples2 : arrayList) {
                            int iIntValue = ((Number) tuples2.component1()).intValue();
                            HandlerThread handlerThread2 = (HandlerThread) tuples2.component2();
                            Looper looper2 = handlerThread2.getLooper();
                            if (looper2 == null) {
                                SharkLog.INSTANCE.getLogger();
                            } else {
                                linkedHashSet.add(Integer.valueOf(iIntValue));
                                SharkLog.INSTANCE.getLogger();
                                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                                booleanRef.element = true;
                                Handler handler = new Handler(looper2);
                                AndroidLeakFixes.INSTANCE.onEachIdle(handler, new C46188xff5bafd4(handlerThread2, booleanRef, handler));
                            }
                        }
                        AndroidLeakFixes.INSTANCE.getBackgroundHandler$plumber_android_core_release().postDelayed(this, 3000L);
                    }
                }, 2000L);
            }
        };
        FLUSH_HANDLER_THREADS = androidLeakFixes3;
        AndroidLeakFixes androidLeakFixes4 = new AndroidLeakFixes("ACCESSIBILITY_NODE_INFO", 4) { // from class: leakcanary.AndroidLeakFixes.ACCESSIBILITY_NODE_INFO
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                AndroidLeakFixes.INSTANCE.getBackgroundHandler$plumber_android_core_release().postDelayed(new Runnable() { // from class: leakcanary.AndroidLeakFixes$ACCESSIBILITY_NODE_INFO$apply$starvePool$1
                    @Override // java.lang.Runnable
                    public void run() {
                        for (int i = 0; i < 50; i++) {
                            AccessibilityNodeInfo.obtain();
                        }
                        AndroidLeakFixes.INSTANCE.getBackgroundHandler$plumber_android_core_release().postDelayed(this, 5000L);
                    }
                }, 5000L);
            }
        };
        ACCESSIBILITY_NODE_INFO = androidLeakFixes4;
        AndroidLeakFixes androidLeakFixes5 = new AndroidLeakFixes("CONNECTIVITY_MANAGER", 5) { // from class: leakcanary.AndroidLeakFixes.CONNECTIVITY_MANAGER
            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
            }

            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }
        };
        CONNECTIVITY_MANAGER = androidLeakFixes5;
        AndroidLeakFixes androidLeakFixes6 = new AndroidLeakFixes("SAMSUNG_CLIPBOARD_MANAGER", 6) { // from class: leakcanary.AndroidLeakFixes.SAMSUNG_CLIPBOARD_MANAGER
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                Intrinsics.areEqual(Build.MANUFACTURER, Constants.REFERRER_API_SAMSUNG);
            }
        };
        SAMSUNG_CLIPBOARD_MANAGER = androidLeakFixes6;
        AndroidLeakFixes androidLeakFixes7 = new AndroidLeakFixes("BUBBLE_POPUP", 7) { // from class: leakcanary.AndroidLeakFixes.BUBBLE_POPUP
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                Intrinsics.areEqual(Build.MANUFACTURER, "LGE");
            }
        };
        BUBBLE_POPUP = androidLeakFixes7;
        AndroidLeakFixes androidLeakFixes8 = new AndroidLeakFixes("LAST_HOVERED_VIEW", 8) { // from class: leakcanary.AndroidLeakFixes.LAST_HOVERED_VIEW
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                Intrinsics.areEqual(Build.MANUFACTURER, Constants.REFERRER_API_SAMSUNG);
            }
        };
        LAST_HOVERED_VIEW = androidLeakFixes8;
        AndroidLeakFixes androidLeakFixes9 = new AndroidLeakFixes("ACTIVITY_MANAGER", 9) { // from class: leakcanary.AndroidLeakFixes.ACTIVITY_MANAGER
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                Intrinsics.areEqual(Build.MANUFACTURER, Constants.REFERRER_API_SAMSUNG);
            }
        };
        ACTIVITY_MANAGER = androidLeakFixes9;
        AndroidLeakFixes androidLeakFixes10 = new AndroidLeakFixes("VIEW_LOCATION_HOLDER", 10) { // from class: leakcanary.AndroidLeakFixes.VIEW_LOCATION_HOLDER
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                ViewLocationHolderLeakFix.INSTANCE.applyFix$plumber_android_core_release(application);
            }
        };
        VIEW_LOCATION_HOLDER = androidLeakFixes10;
        AndroidLeakFixes androidLeakFixes11 = new AndroidLeakFixes("IMM_FOCUSED_VIEW", 11) { // from class: leakcanary.AndroidLeakFixes.IMM_FOCUSED_VIEW
            @Override // leakcanary.AndroidLeakFixes
            @SuppressLint({"PrivateApi"})
            @TargetApi(23)
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
            }

            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }
        };
        IMM_FOCUSED_VIEW = androidLeakFixes11;
        IMM_CUR_ROOT_VIEW imm_cur_root_view = new IMM_CUR_ROOT_VIEW("IMM_CUR_ROOT_VIEW", 12);
        IMM_CUR_ROOT_VIEW = imm_cur_root_view;
        AndroidLeakFixes androidLeakFixes12 = new AndroidLeakFixes("SPELL_CHECKER", 13) { // from class: leakcanary.AndroidLeakFixes.SPELL_CHECKER
            @Override // leakcanary.AndroidLeakFixes
            @SuppressLint({"PrivateApi"})
            @TargetApi(23)
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
            }

            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }
        };
        SPELL_CHECKER = androidLeakFixes12;
        AndroidLeakFixes androidLeakFixes13 = new AndroidLeakFixes("PERMISSION_CONTROLLER_MANAGER", 14) { // from class: leakcanary.AndroidLeakFixes.PERMISSION_CONTROLLER_MANAGER
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // leakcanary.AndroidLeakFixes
            @SuppressLint({"WrongConstant"})
            protected void apply(Application application) {
                Intrinsics.checkParameterIsNotNull(application, "application");
                if (Build.VERSION.SDK_INT < 29) {
                    return;
                }
                try {
                    application.getSystemService("permission_controller");
                } catch (Exception unused) {
                    SharkLog.INSTANCE.getLogger();
                }
            }
        };
        PERMISSION_CONTROLLER_MANAGER = androidLeakFixes13;
        $VALUES = new AndroidLeakFixes[]{androidLeakFixes, text_line_pool, androidLeakFixes2, androidLeakFixes3, androidLeakFixes4, androidLeakFixes5, androidLeakFixes6, androidLeakFixes7, androidLeakFixes8, androidLeakFixes9, androidLeakFixes10, androidLeakFixes11, imm_cur_root_view, androidLeakFixes12, androidLeakFixes13};
        INSTANCE = new Companion(null);
        backgroundHandler$delegate = LazyKt.lazy(new Function0<Handler>() { // from class: leakcanary.AndroidLeakFixes$Companion$backgroundHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Handler invoke() {
                HandlerThread handlerThread = new HandlerThread("plumber-android-leaks");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }
}
