package com.squareup.workflow1.p415ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: BackButtonScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0003B)\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/squareup/workflow1/ui/BackButtonScreen;", "W", "", "Lcom/squareup/workflow1/ui/AndroidViewRendering;", "wrapped", "shadow", "", "onBackPressed", "Lkotlin/Function0;", "", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function0;)V", "getOnBackPressed", "()Lkotlin/jvm/functions/Function0;", "getShadow", "()Z", "viewFactory", "Lcom/squareup/workflow1/ui/ViewFactory;", "getViewFactory", "()Lcom/squareup/workflow1/ui/ViewFactory;", "getWrapped", "()Ljava/lang/Object;", "Ljava/lang/Object;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BackButtonScreen<W> implements AndroidViewRendering<BackButtonScreen<?>> {
    private final Function0<Unit> onBackPressed;
    private final boolean shadow;
    private final ViewFactory<BackButtonScreen<?>> viewFactory;
    private final W wrapped;

    public BackButtonScreen(W wrapped, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.wrapped = wrapped;
        this.shadow = z;
        this.onBackPressed = function0;
        this.viewFactory = new DecorativeViewFactory(Reflection.getOrCreateKotlinClass(BackButtonScreen.class), new Function1<BackButtonScreen<?>, Object>() { // from class: com.squareup.workflow1.ui.BackButtonScreen$viewFactory$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(BackButtonScreen<?> outer) {
                Intrinsics.checkNotNullParameter(outer, "outer");
                return outer.getWrapped();
            }
        }, null, new Function4<View, Function2<? super Object, ? super ViewEnvironment, ? extends Unit>, BackButtonScreen<?>, ViewEnvironment, Unit>() { // from class: com.squareup.workflow1.ui.BackButtonScreen$viewFactory$2
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(View view, Function2<? super Object, ? super ViewEnvironment, ? extends Unit> function2, BackButtonScreen<?> backButtonScreen, ViewEnvironment viewEnvironment) {
                invoke2(view, (Function2<Object, ? super ViewEnvironment, Unit>) function2, backButtonScreen, viewEnvironment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View view, Function2<Object, ? super ViewEnvironment, Unit> innerShowRendering, BackButtonScreen<?> outerRendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(innerShowRendering, "innerShowRendering");
                Intrinsics.checkNotNullParameter(outerRendering, "outerRendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                if (!outerRendering.getShadow()) {
                    BackPressHandler.setBackPressedHandler(view, outerRendering.getOnBackPressed());
                }
                innerShowRendering.invoke(outerRendering.getWrapped(), viewEnvironment);
                if (outerRendering.getShadow()) {
                    BackPressHandler.setBackPressedHandler(view, outerRendering.getOnBackPressed());
                }
            }
        }, 4, null);
    }

    public /* synthetic */ BackButtonScreen(Object obj, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : function0);
    }

    public final W getWrapped() {
        return this.wrapped;
    }

    public final boolean getShadow() {
        return this.shadow;
    }

    public final Function0<Unit> getOnBackPressed() {
        return this.onBackPressed;
    }

    @Override // com.squareup.workflow1.p415ui.AndroidViewRendering
    public ViewFactory<BackButtonScreen<?>> getViewFactory() {
        return this.viewFactory;
    }
}
