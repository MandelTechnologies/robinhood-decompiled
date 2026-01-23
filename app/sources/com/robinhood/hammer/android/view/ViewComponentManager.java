package com.robinhood.hammer.android.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.robinhood.hammer.android.activity.ActivityComponentManagerHolder;
import com.robinhood.hammer.android.view.ViewComponent;
import com.robinhood.hammer.core.internal.AbstractComponentManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ViewComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/hammer/android/view/ViewComponentManager;", "Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "Lcom/robinhood/hammer/android/view/ViewComponent;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "createComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ViewComponentManager extends AbstractComponentManager<ViewComponent> {
    private final View view;

    public ViewComponentManager(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.hammer.core.internal.AbstractComponentManager
    public ViewComponent createComponent() {
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Sequence sequenceFilter = SequencesKt.filter(ViewComponentManager2.baseContexts(context), new Function1<Object, Boolean>() { // from class: com.robinhood.hammer.android.view.ViewComponentManager$createComponent$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof Activity);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Object obj = (Activity) SequencesKt.firstOrNull(sequenceFilter);
        if (obj == null) {
            throw new IllegalStateException(("View " + this.view + " must be hosted in an Activity to support injection.").toString());
        }
        if (!(obj instanceof ActivityComponentManagerHolder)) {
            throw new IllegalStateException(("Activity " + obj + " must implement ActivityComponentManagerHolder").toString());
        }
        return ((ViewComponent.ParentComponent) ((ActivityComponentManagerHolder) obj).getComponentManager().get()).createViewSubcomponentFactory().build(this.view);
    }
}
