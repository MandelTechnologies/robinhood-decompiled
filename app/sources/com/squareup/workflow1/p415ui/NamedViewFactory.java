package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: NamedViewFactory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J1\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0001R\u001e\u0010\u0004\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/squareup/workflow1/ui/NamedViewFactory;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/squareup/workflow1/ui/Named;", "()V", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class NamedViewFactory implements ViewFactory<Named<?>> {
    public static final NamedViewFactory INSTANCE = new NamedViewFactory();
    private final /* synthetic */ DecorativeViewFactory<Named<?>, Object> $$delegate_0 = new DecorativeViewFactory<>(Reflection.getOrCreateKotlinClass(Named.class), new Function1<Named<?>, Object>() { // from class: com.squareup.workflow1.ui.NamedViewFactory.1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Named<?> named) {
            Intrinsics.checkNotNullParameter(named, "named");
            return named.getWrapped();
        }
    }, null, null, 12, null);

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public View buildView(Named<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public KClass<? super Named<?>> getType() {
        return this.$$delegate_0.getType();
    }

    private NamedViewFactory() {
    }
}
