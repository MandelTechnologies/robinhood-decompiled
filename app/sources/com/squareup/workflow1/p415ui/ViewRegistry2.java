package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ViewRegistry.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0006\u001a+\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\b*\u00020\u0007*\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aM\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\b*\u00020\u0007*\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"", "Lcom/squareup/workflow1/ui/ViewFactory;", "bindings", "Lcom/squareup/workflow1/ui/ViewRegistry;", "ViewRegistry", "([Lcom/squareup/workflow1/ui/ViewFactory;)Lcom/squareup/workflow1/ui/ViewRegistry;", "()Lcom/squareup/workflow1/ui/ViewRegistry;", "", "RenderingT", "rendering", "getFactoryForRendering", "(Lcom/squareup/workflow1/ui/ViewRegistry;Ljava/lang/Object;)Lcom/squareup/workflow1/ui/ViewFactory;", "initialRendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Lcom/squareup/workflow1/ui/ViewStarter;", "viewStarter", "Landroid/view/View;", "buildView", "(Lcom/squareup/workflow1/ui/ViewRegistry;Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/squareup/workflow1/ui/ViewStarter;)Landroid/view/View;", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.ViewRegistryKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ViewRegistry2 {
    public static final ViewRegistry ViewRegistry(ViewFactory<?>... bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        return new TypedViewRegistry((ViewFactory<?>[]) Arrays.copyOf(bindings, bindings.length));
    }

    public static final ViewRegistry ViewRegistry() {
        return new TypedViewRegistry((ViewFactory<?>[]) new ViewFactory[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <RenderingT> ViewFactory<RenderingT> getFactoryForRendering(ViewRegistry viewRegistry, RenderingT rendering) {
        Intrinsics.checkNotNullParameter(viewRegistry, "<this>");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        ViewFactory<RenderingT> factoryFor = viewRegistry.getFactoryFor(Reflection.getOrCreateKotlinClass(rendering.getClass()));
        if (factoryFor == null) {
            AndroidViewRendering androidViewRendering = rendering instanceof AndroidViewRendering ? (AndroidViewRendering) rendering : null;
            factoryFor = androidViewRendering == null ? null : androidViewRendering.getViewFactory();
            if (factoryFor == null) {
                factoryFor = null;
            }
            if (factoryFor == null) {
                NamedViewFactory namedViewFactory = (rendering instanceof Named ? (Named) rendering : null) != null ? NamedViewFactory.INSTANCE : null;
                if (namedViewFactory != null) {
                    return namedViewFactory;
                }
                throw new IllegalArgumentException("A " + ((Object) Reflection.getOrCreateKotlinClass(ViewFactory.class).getQualifiedName()) + " should have been registered to display " + ((Object) Reflection.getOrCreateKotlinClass(rendering.getClass()).getQualifiedName()) + " instances, or that class should implement " + ((Object) Reflection.getOrCreateKotlinClass(AndroidViewRendering.class).getSimpleName()) + '<' + ((Object) Reflection.getOrCreateKotlinClass(rendering.getClass()).getSimpleName()) + ">.");
            }
        }
        return factoryFor;
    }

    public static /* synthetic */ View buildView$default(ViewRegistry viewRegistry, Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup, ViewRegistry4 viewRegistry4, int i, Object obj2) {
        if ((i & 8) != 0) {
            viewGroup = null;
        }
        if ((i & 16) != 0) {
            viewRegistry4 = null;
        }
        return buildView(viewRegistry, obj, viewEnvironment, context, viewGroup, viewRegistry4);
    }

    public static final <RenderingT> View buildView(ViewRegistry viewRegistry, RenderingT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup, final ViewRegistry4 viewRegistry4) {
        Intrinsics.checkNotNullParameter(viewRegistry, "<this>");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        View viewBuildView = getFactoryForRendering(viewRegistry, initialRendering).buildView(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
        if (WorkflowViewState2.getWorkflowViewStateOrNull(viewBuildView) != null) {
            if (viewRegistry4 == null) {
                return viewBuildView;
            }
            final Function1<View, Unit> starter = ViewShowRendering.getStarter(viewBuildView);
            ViewShowRendering.setStarter(viewBuildView, new Function1<View, Unit>() { // from class: com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final View newView) {
                    Intrinsics.checkNotNullParameter(newView, "newView");
                    ViewRegistry4 viewRegistry42 = viewRegistry4;
                    final Function1<View, Unit> function1 = starter;
                    viewRegistry42.startView(newView, new Function0<Unit>() { // from class: com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            function1.invoke(newView);
                        }
                    });
                }
            });
            return viewBuildView;
        }
        throw new IllegalStateException(("View.bindShowRendering should have been called for " + viewBuildView + ", typically by the " + ((Object) ViewFactory.class.getName()) + " that created it.").toString());
    }
}
