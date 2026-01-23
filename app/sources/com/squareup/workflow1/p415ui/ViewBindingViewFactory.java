package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: ViewBindingViewFactory.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005BY\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012*\u0010\b\u001a&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\r\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0002\u0010\u0011J/\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u001cR2\u0010\b\u001a&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/squareup/workflow1/ui/ViewBindingViewFactory;", "BindingT", "Landroidx/viewbinding/ViewBinding;", "RenderingT", "", "Lcom/squareup/workflow1/ui/ViewFactory;", "type", "Lkotlin/reflect/KClass;", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/squareup/workflow1/ui/ViewBindingInflater;", "runnerConstructor", "Lkotlin/Function1;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "getType", "()Lkotlin/reflect/KClass;", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
@PublishedApi
/* loaded from: classes12.dex */
public final class ViewBindingViewFactory<BindingT extends ViewBinding, RenderingT> implements ViewFactory<RenderingT> {
    private final Function3<LayoutInflater, ViewGroup, Boolean, BindingT> bindingInflater;
    private final Function1<BindingT, LayoutRunner<RenderingT>> runnerConstructor;
    private final KClass<RenderingT> type;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewBindingViewFactory(KClass<RenderingT> type2, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends BindingT> bindingInflater, Function1<? super BindingT, ? extends LayoutRunner<RenderingT>> runnerConstructor) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(bindingInflater, "bindingInflater");
        Intrinsics.checkNotNullParameter(runnerConstructor, "runnerConstructor");
        this.type = type2;
        this.bindingInflater = bindingInflater;
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
        Function3<LayoutInflater, ViewGroup, Boolean, BindingT> function3 = this.bindingInflater;
        LayoutInflater layoutInflaterViewBindingLayoutInflater = LayoutRunner2.viewBindingLayoutInflater(contextForNewView, container);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterViewBindingLayoutInflater, "contextForNewView.viewBi…LayoutInflater(container)");
        BindingT bindingtInvoke = function3.invoke(layoutInflaterViewBindingLayoutInflater, container, Boolean.FALSE);
        final LayoutRunner<RenderingT> layoutRunnerInvoke = this.runnerConstructor.invoke(bindingtInvoke);
        View root = bindingtInvoke.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        ViewShowRendering.bindShowRendering(root, initialRendering, initialViewEnvironment, new Function2<RenderingT, ViewEnvironment, Unit>() { // from class: com.squareup.workflow1.ui.ViewBindingViewFactory$buildView$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
                invoke2((ViewBindingViewFactory2<RenderingT>) obj, viewEnvironment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RenderingT rendering, ViewEnvironment environment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(environment, "environment");
                layoutRunnerInvoke.showRendering(rendering, environment);
            }
        });
        View root2 = bindingtInvoke.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "bindingInflater(contextF…    }\n      }\n      .root");
        return root2;
    }
}
