package curtains;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Listeners.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcurtains/OnRootViewRemovedListener;", "Lcurtains/OnRootViewsChangedListener;", "Landroid/view/View;", "view", "", "onRootViewRemoved", "(Landroid/view/View;)V", "curtains_release"}, m3637k = 1, m3638mv = {1, 4, 1})
/* renamed from: curtains.OnRootViewRemovedListener, reason: use source file name */
/* loaded from: classes18.dex */
public interface Listeners extends Listeners2 {
    void onRootViewRemoved(View view);

    /* compiled from: Listeners.kt */
    @Metadata(m3634bv = {1, 0, 3}, m3637k = 3, m3638mv = {1, 4, 1})
    /* renamed from: curtains.OnRootViewRemovedListener$DefaultImpls */
    public static final class DefaultImpls {
        public static void onRootViewsChanged(Listeners listeners, View view, boolean z) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (z) {
                return;
            }
            listeners.onRootViewRemoved(view);
        }
    }
}
