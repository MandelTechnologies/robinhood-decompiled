package com.squareup.workflow1.p415ui.androidx;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.squareup.workflow1.p415ui.androidx.WorkflowLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowLifecycleOwner.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/squareup/workflow1/ui/androidx/WorkflowLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "destroyOnDetach", "", "Companion", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface WorkflowLifecycleOwner extends LifecycleOwner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void destroyOnDetach();

    /* compiled from: WorkflowLifecycleOwner.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006J$\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\f¨\u0006\r"}, m3636d2 = {"Lcom/squareup/workflow1/ui/androidx/WorkflowLifecycleOwner$Companion;", "", "()V", "findParentViewTreeLifecycle", "Landroidx/lifecycle/Lifecycle;", "view", "Landroid/view/View;", "get", "Lcom/squareup/workflow1/ui/androidx/WorkflowLifecycleOwner;", "installOn", "", "findParentLifecycle", "Lkotlin/Function1;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void installOn$default(Companion companion, View view, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                function1 = new Function1<View, Lifecycle>() { // from class: com.squareup.workflow1.ui.androidx.WorkflowLifecycleOwner$Companion$installOn$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Lifecycle invoke(View v) {
                        Intrinsics.checkNotNullParameter(v, "v");
                        return WorkflowLifecycleOwner.Companion.$$INSTANCE.findParentViewTreeLifecycle(v);
                    }
                };
            }
            companion.installOn(view, function1);
        }

        public final void installOn(View view, Function1<? super View, ? extends Lifecycle> findParentLifecycle) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(findParentLifecycle, "findParentLifecycle");
            WorkflowLifecycleOwner2 workflowLifecycleOwner2 = new WorkflowLifecycleOwner2(findParentLifecycle, false, 2, null);
            ViewTreeLifecycleOwner.set(view, workflowLifecycleOwner2);
            view.addOnAttachStateChangeListener(workflowLifecycleOwner2);
        }

        public final WorkflowLifecycleOwner get(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner instanceof WorkflowLifecycleOwner) {
                return (WorkflowLifecycleOwner) lifecycleOwner;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lifecycle findParentViewTreeLifecycle(View view) {
            LifecycleOwner lifecycleOwnerLifecycleOwnerFromViewTreeOrContextOrNull;
            Object parent = view.getParent();
            Lifecycle lifecycle = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null && (lifecycleOwnerLifecycleOwnerFromViewTreeOrContextOrNull = WorkflowAndroidXSupport.INSTANCE.lifecycleOwnerFromViewTreeOrContextOrNull(view2)) != null) {
                lifecycle = lifecycleOwnerLifecycleOwnerFromViewTreeOrContextOrNull.getLifecycle();
            }
            if (lifecycle != null) {
                return lifecycle;
            }
            throw new IllegalStateException(("Expected parent or context of " + view + " to have or be a ViewTreeLifecycleOwner").toString());
        }
    }
}
