package com.robinhood.android.plt.contract;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\f"}, m3636d2 = {"trackLoadingStateForLoadingViews", "", "Landroid/view/View;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "visibilityFlow", "Lkotlinx/coroutines/flow/Flow;", "", "identifier", "", "recordLoadingState", "isLoading", "lib-perceived-loading-time-contract_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ViewsKt {
    public static /* synthetic */ void trackLoadingStateForLoadingViews$default(View view, PltManager pltManager, Flow flow, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = view.getClass().getSimpleName() + "@" + view.hashCode();
        }
        trackLoadingStateForLoadingViews(view, pltManager, flow, str);
    }

    public static final void trackLoadingStateForLoadingViews(View view, PltManager pltManager, Flow<Boolean> visibilityFlow, String identifier) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(pltManager, "pltManager");
        Intrinsics.checkNotNullParameter(visibilityFlow, "visibilityFlow");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (lifecycleOwner != null) {
            final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(lifecycleOwner), null, null, new ViewsKt$trackLoadingStateForLoadingViews$1$job$1(visibilityFlow, view, pltManager, identifier, null), 3, null);
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.plt.contract.ViewsKt$trackLoadingStateForLoadingViews$1$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Job.DefaultImpls.cancel$default(jobLaunch$default, null, 1, null);
                    v.removeOnAttachStateChangeListener(this);
                }
            });
        }
    }

    public static /* synthetic */ void recordLoadingState$default(View view, boolean z, PltManager pltManager, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = view.getClass().getSimpleName() + "@" + view.hashCode();
        }
        recordLoadingState(view, z, pltManager, str);
    }

    public static final void recordLoadingState(View view, boolean z, final PltManager pltManager, final String identifier) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(pltManager, "pltManager");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.plt.contract.ViewsKt$recordLoadingState$attachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                ViewsKt.recordLoadingState(v, false, pltManager, identifier);
                v.removeOnAttachStateChangeListener(this);
            }
        };
        if (z) {
            pltManager.onElementLoadStarted(identifier);
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        } else {
            pltManager.onElementLoadEnded(identifier);
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }
}
