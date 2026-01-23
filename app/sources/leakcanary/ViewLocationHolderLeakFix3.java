package leakcanary;

import android.annotation.NonNull;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import leakcanary.internal.FragmentExtensions;
import leakcanary.internal.Objects2;

/* compiled from: ViewLocationHolderLeakFix.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0013\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0096\u0001J\u001d\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0096\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0096\u0001¨\u0006\u0010"}, m3636d2 = {"leakcanary/ViewLocationHolderLeakFix$applyFix$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "p0", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "p1", "onActivityStarted", "onActivityStopped", "plumber-android-core_release"}, m3637k = 1, m3638mv = {1, 4, 1})
/* renamed from: leakcanary.ViewLocationHolderLeakFix$applyFix$2, reason: use source file name */
/* loaded from: classes14.dex */
public final class ViewLocationHolderLeakFix3 implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ Application.ActivityLifecycleCallbacks $$delegate_0;
    final /* synthetic */ Application $application;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity p0) {
        Intrinsics.checkParameterIsNotNull(p0, "p0");
        this.$$delegate_0.onActivityDestroyed(p0);
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

    ViewLocationHolderLeakFix3(Application application) throws IllegalArgumentException {
        this.$application = application;
        Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, Objects2.NO_OP_HANDLER);
        if (objNewProxyInstance == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
        }
        this.$$delegate_0 = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        FragmentExtensions.onAndroidXFragmentViewDestroyed(activity, new Function0<Unit>() { // from class: leakcanary.ViewLocationHolderLeakFix$applyFix$2$onActivityCreated$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ViewLocationHolderLeakFix.INSTANCE.uncheckedClearStaticPool(this.this$0.$application);
            }
        });
    }
}
