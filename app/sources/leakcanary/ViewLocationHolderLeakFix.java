package leakcanary;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import curtains.Curtains;
import curtains.Listeners;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import leakcanary.internal.Handlers;
import shark.SharkLog;

/* compiled from: ViewLocationHolderLeakFix.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bR4\u0010\u0010\u001a \u0012\u0004\u0012\u00020\f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lleakcanary/ViewLocationHolderLeakFix;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "uncheckedClearStaticPool", "(Landroid/app/Application;)V", "applyFix$plumber_android_core_release", "applyFix", "Lkotlin/Pair;", "Landroid/view/ViewGroup;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "groupAndOutChildren", "Lkotlin/Pair;", "", "failedClearing", "Z", "plumber-android-core_release"}, m3637k = 1, m3638mv = {1, 4, 1})
@SuppressLint({"NewApi"})
/* loaded from: classes23.dex */
public final class ViewLocationHolderLeakFix {
    public static final ViewLocationHolderLeakFix INSTANCE = new ViewLocationHolderLeakFix();
    private static boolean failedClearing;
    private static Tuples2<? extends ViewGroup, ? extends ArrayList<View>> groupAndOutChildren;

    private ViewLocationHolderLeakFix() {
    }

    public final void applyFix$plumber_android_core_release(final Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        if (Build.VERSION.SDK_INT != 28) {
            return;
        }
        Curtains.getOnRootViewsChangedListeners().add(new Listeners() { // from class: leakcanary.ViewLocationHolderLeakFix$applyFix$1
            @Override // curtains.Listeners
            public final void onRootViewRemoved(View it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                if (Handlers.isMainThread()) {
                    ViewLocationHolderLeakFix.INSTANCE.uncheckedClearStaticPool(application);
                } else {
                    Handlers.getMainHandler().post(new Runnable() { // from class: leakcanary.ViewLocationHolderLeakFix$applyFix$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewLocationHolderLeakFix.INSTANCE.uncheckedClearStaticPool(application);
                        }
                    });
                }
            }

            @Override // curtains.Listeners2
            public void onRootViewsChanged(View view, boolean z) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Listeners.DefaultImpls.onRootViewsChanged(this, view, z);
            }
        });
        application.registerActivityLifecycleCallbacks(new ViewLocationHolderLeakFix3(application));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uncheckedClearStaticPool(Application application) {
        if (failedClearing) {
            return;
        }
        try {
            if (groupAndOutChildren == null) {
                FrameLayout frameLayout = new FrameLayout(application);
                for (int i = 0; i < 32; i++) {
                    frameLayout.addView(new View(application));
                }
                groupAndOutChildren = Tuples4.m3642to(frameLayout, new ArrayList());
            }
            Tuples2<? extends ViewGroup, ? extends ArrayList<View>> tuples2 = groupAndOutChildren;
            if (tuples2 == null) {
                Intrinsics.throwNpe();
            }
            tuples2.component1().addChildrenForAccessibility(tuples2.component2());
        } catch (Throwable unused) {
            SharkLog.INSTANCE.getLogger();
            failedClearing = true;
        }
    }
}
