package com.robinhood.utils.p409ui.view;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.dagger.ViewEntryPoint;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnClickListeners.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u001a \u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¨\u0006\t"}, m3636d2 = {"onClick", "", "Landroid/view/View;", "action", "Lkotlin/Function0;", "onClickView", "Lkotlin/Function1;", "onLongClick", "", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.view.OnClickListenersKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class OnClickListeners {
    public static final void onClick(View view, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (function0 == null) {
            view.setOnClickListener(null);
        } else {
            onClickView(view, new Function1() { // from class: com.robinhood.utils.ui.view.OnClickListenersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OnClickListeners.onClick$lambda$0(function0, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$0(Function0 function0, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void onClickView(final View view, final Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (function1 == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new DebouncingOnClickListener() { // from class: com.robinhood.utils.ui.view.OnClickListenersKt.onClickView.1
                @Override // com.robinhood.utils.p409ui.view.DebouncingOnClickListener
                public void doClick(View v) {
                    ComponentCallbacks2 componentCallbacks2;
                    Intrinsics.checkNotNullParameter(v, "v");
                    Context context = v.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                        Context context2 = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        if (context2 instanceof Application) {
                            componentCallbacks2 = (Application) context2;
                        } else {
                            Context applicationContext = context2.getApplicationContext();
                            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            componentCallbacks2 = (Application) applicationContext;
                        }
                        Iterator<GlobalOnClickListener> it = ((ViewEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getGlobalOnClickListener().iterator();
                        while (it.hasNext()) {
                            it.next().onClick(v);
                        }
                        function1.invoke(v);
                    }
                }
            });
        }
    }

    public static final void onLongClick(View view, final Function1<? super View, Boolean> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (function1 == null) {
            view.setOnLongClickListener(null);
        } else {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.robinhood.utils.ui.view.OnClickListenersKt.onLongClick.1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    Function1<View, Boolean> function12 = function1;
                    Intrinsics.checkNotNull(view2);
                    return function12.invoke(view2).booleanValue();
                }
            });
        }
    }
}
