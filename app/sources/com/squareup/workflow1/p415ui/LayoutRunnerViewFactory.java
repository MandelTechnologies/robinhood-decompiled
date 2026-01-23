package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: LayoutRunnerViewFactory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0002\u0010\fJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/squareup/workflow1/ui/LayoutRunnerViewFactory;", "RenderingT", "", "Lcom/squareup/workflow1/ui/ViewFactory;", "type", "Lkotlin/reflect/KClass;", "layoutId", "", "runnerConstructor", "Lkotlin/Function1;", "Landroid/view/View;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "(Lkotlin/reflect/KClass;ILkotlin/jvm/functions/Function1;)V", "getType", "()Lkotlin/reflect/KClass;", "buildView", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
@PublishedApi
/* loaded from: classes12.dex */
public final class LayoutRunnerViewFactory<RenderingT> implements ViewFactory<RenderingT> {
    private final int layoutId;
    private final Function1<View, LayoutRunner<RenderingT>> runnerConstructor;
    private final KClass<RenderingT> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutRunnerViewFactory(KClass<RenderingT> type2, int i, Function1<? super View, ? extends LayoutRunner<RenderingT>> runnerConstructor) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(runnerConstructor, "runnerConstructor");
        this.type = type2;
        this.layoutId = i;
        this.runnerConstructor = runnerConstructor;
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public KClass<RenderingT> getType() {
        return this.type;
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public View buildView(RenderingT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        View view = LayoutRunner2.viewBindingLayoutInflater(contextForNewView, container).inflate(this.layoutId, container, false);
        Function1<View, LayoutRunner<RenderingT>> function1 = this.runnerConstructor;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        final LayoutRunner<RenderingT> layoutRunnerInvoke = function1.invoke(view);
        ViewShowRendering.bindShowRendering(view, initialRendering, initialViewEnvironment, new Function2<RenderingT, ViewEnvironment, Unit>() { // from class: com.squareup.workflow1.ui.LayoutRunnerViewFactory$buildView$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
                invoke2((LayoutRunnerViewFactory2<RenderingT>) obj, viewEnvironment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RenderingT rendering, ViewEnvironment environment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(environment, "environment");
                layoutRunnerInvoke.showRendering(rendering, environment);
            }
        });
        Intrinsics.checkNotNullExpressionValue(view, "contextForNewView.viewBi…onment)\n        }\n      }");
        return view;
    }
}
