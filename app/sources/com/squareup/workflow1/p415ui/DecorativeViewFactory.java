package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: DecorativeViewFactory.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004Bµ\u0001\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012~\b\u0002\u0010\u000b\u001ax\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012/\u0012-\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\b\u0012\u0004\u0012\u00028\u0001`\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\u0010\u0018BÅ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012$\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u00190\u0011\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012~\b\u0002\u0010\u000b\u001ax\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012/\u0012-\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\b\u0012\u0004\u0012\u00028\u0001`\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\u0010\u001aJ/\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0002\u0010$R\u0084\u0001\u0010\u000b\u001ax\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012/\u0012-\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\b\u0012\u0004\u0012\u00028\u0001`\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u00190\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/squareup/workflow1/ui/DecorativeViewFactory;", "OuterT", "", "InnerT", "Lcom/squareup/workflow1/ui/ViewFactory;", "type", "Lkotlin/reflect/KClass;", "map", "Lkotlin/Function1;", "viewStarter", "Lcom/squareup/workflow1/ui/ViewStarter;", "doShowRendering", "Lkotlin/Function4;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "Lkotlin/Function2;", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "outerRendering", "env", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Lcom/squareup/workflow1/ui/ViewStarter;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Pair;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function2;Lcom/squareup/workflow1/ui/ViewStarter;Lkotlin/jvm/functions/Function4;)V", "getType", "()Lkotlin/reflect/KClass;", "buildView", "initialRendering", "initialViewEnvironment", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DecorativeViewFactory<OuterT, InnerT> implements ViewFactory<OuterT> {
    private final Function4<View, Function2<? super InnerT, ? super ViewEnvironment, Unit>, OuterT, ViewEnvironment, Unit> doShowRendering;
    private final Function2<OuterT, ViewEnvironment, Tuples2<InnerT, ViewEnvironment>> map;
    private final KClass<OuterT> type;
    private final ViewRegistry4 viewStarter;

    /* JADX WARN: Multi-variable type inference failed */
    public DecorativeViewFactory(KClass<OuterT> type2, Function2<? super OuterT, ? super ViewEnvironment, ? extends Tuples2<? extends InnerT, ViewEnvironment>> map, ViewRegistry4 viewRegistry4, Function4<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
        this.type = type2;
        this.map = map;
        this.viewStarter = viewRegistry4;
        this.doShowRendering = doShowRendering;
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public KClass<OuterT> getType() {
        return this.type;
    }

    public /* synthetic */ DecorativeViewFactory(KClass kClass, final Function1 function1, ViewRegistry4 viewRegistry4, Function4 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, function1, (i & 4) != 0 ? null : viewRegistry4, (i & 8) != 0 ? new Function4<View, Function2<? super InnerT, ? super ViewEnvironment, ? extends Unit>, OuterT, ViewEnvironment, Unit>() { // from class: com.squareup.workflow1.ui.DecorativeViewFactory.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(View view, Object obj, Object obj2, ViewEnvironment viewEnvironment) {
                invoke(view, (Function2) obj, (Function2<? super InnerT, ? super ViewEnvironment, Unit>) obj2, viewEnvironment);
                return Unit.INSTANCE;
            }

            public final void invoke(View noName_0, Function2<? super InnerT, ? super ViewEnvironment, Unit> innerShowRendering, OuterT outerRendering, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
                Intrinsics.checkNotNullParameter(innerShowRendering, "innerShowRendering");
                Intrinsics.checkNotNullParameter(outerRendering, "outerRendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                innerShowRendering.invoke(function1.invoke(outerRendering), viewEnvironment);
            }
        } : function4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecorativeViewFactory(KClass<OuterT> type2, final Function1<? super OuterT, ? extends InnerT> map, ViewRegistry4 viewRegistry4, Function4<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> doShowRendering) {
        this(type2, new Function2<OuterT, ViewEnvironment, Tuples2<? extends InnerT, ? extends ViewEnvironment>>() { // from class: com.squareup.workflow1.ui.DecorativeViewFactory.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, ViewEnvironment viewEnvironment) {
                return invoke2((C424843) obj, viewEnvironment);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Tuples2<InnerT, ViewEnvironment> invoke2(OuterT outer, ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(outer, "outer");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                return new Tuples2<>(map.invoke(outer), viewEnvironment);
            }
        }, viewRegistry4, doShowRendering);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(doShowRendering, "doShowRendering");
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public View buildView(OuterT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        Tuples2<InnerT, ViewEnvironment> tuples2Invoke = this.map.invoke(initialRendering, initialViewEnvironment);
        InnerT innertComponent1 = tuples2Invoke.component1();
        ViewEnvironment viewEnvironmentComponent2 = tuples2Invoke.component2();
        final View viewBuildView = ViewRegistry2.buildView((ViewRegistry) viewEnvironmentComponent2.get(ViewRegistry.INSTANCE), innertComponent1, viewEnvironmentComponent2, contextForNewView, container, this.viewStarter);
        final Function2 showRendering = ViewShowRendering.getShowRendering(viewBuildView);
        Intrinsics.checkNotNull(showRendering);
        ViewShowRendering.bindShowRendering(viewBuildView, initialRendering, viewEnvironmentComponent2, new Function2<OuterT, ViewEnvironment, Unit>(this) { // from class: com.squareup.workflow1.ui.DecorativeViewFactory$buildView$1$1
            final /* synthetic */ DecorativeViewFactory<OuterT, InnerT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, ViewEnvironment viewEnvironment) {
                invoke2((DecorativeViewFactory2<OuterT>) obj, viewEnvironment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OuterT rendering, ViewEnvironment env) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(env, "env");
                ((DecorativeViewFactory) this.this$0).doShowRendering.invoke(viewBuildView, showRendering, rendering, env);
            }
        });
        return viewBuildView;
    }
}
