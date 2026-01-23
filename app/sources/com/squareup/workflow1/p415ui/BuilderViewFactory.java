package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: BuilderViewFactory.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003Bw\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012b\u0010\u0006\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\u0002\u0010\u0012J/\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Rj\u0010\u0006\u001a^\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/squareup/workflow1/ui/BuilderViewFactory;", "RenderingT", "", "Lcom/squareup/workflow1/ui/ViewFactory;", "type", "Lkotlin/reflect/KClass;", "viewConstructor", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "initialRendering", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function4;)V", "getType", "()Lkotlin/reflect/KClass;", "buildView", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BuilderViewFactory<RenderingT> implements ViewFactory<RenderingT> {
    private final KClass<RenderingT> type;
    private final Function4<RenderingT, ViewEnvironment, Context, ViewGroup, View> viewConstructor;

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderViewFactory(KClass<RenderingT> type2, Function4<? super RenderingT, ? super ViewEnvironment, ? super Context, ? super ViewGroup, ? extends View> viewConstructor) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(viewConstructor, "viewConstructor");
        this.type = type2;
        this.viewConstructor = viewConstructor;
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
        return this.viewConstructor.invoke(initialRendering, initialViewEnvironment, contextForNewView, container);
    }
}
