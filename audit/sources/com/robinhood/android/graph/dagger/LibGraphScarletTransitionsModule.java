package com.robinhood.android.graph.dagger;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.graph.IntervalSelectorLayout;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorAttributeTransition;
import com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LibGraphScarletTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/graph/dagger/LibGraphScarletTransitionsModule;", "", "<init>", "()V", "provideGraphViewBaseLineColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "provideGraphViewLineColor", "provideGraphViewScrubLineColor", "provideGraphViewGlowColor", "provideGraphViewScreenBackgroundColor", "provideIntervalSelectorLivePulseTint", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class LibGraphScarletTransitionsModule {
    public static final int $stable = 0;
    public static final LibGraphScarletTransitionsModule INSTANCE = new LibGraphScarletTransitionsModule();

    private LibGraphScarletTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideGraphViewBaseLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(GraphView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule.provideGraphViewBaseLineColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((GraphView) obj).getBaseLineColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((GraphView) obj).setBaseLineColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibGraphScarletTransitionsModule.provideGraphViewBaseLineColor$lambda$0((GraphView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.baseLineColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideGraphViewBaseLineColor$lambda$0(GraphView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setBaseLineColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideGraphViewLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(GraphView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule.provideGraphViewLineColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((GraphView) obj).getLineColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((GraphView) obj).setLineColor((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibGraphScarletTransitionsModule.provideGraphViewLineColor$lambda$1((GraphView) obj, (ColorStateList) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.lineColor, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideGraphViewLineColor$lambda$1(GraphView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(...)");
        }
        from.setLineColor(colorStateList);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideGraphViewScrubLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(GraphView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule.provideGraphViewScrubLineColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((GraphView) obj).getScrubLineColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((GraphView) obj).setScrubLineColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibGraphScarletTransitionsModule.provideGraphViewScrubLineColor$lambda$2((GraphView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.scrubLineColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideGraphViewScrubLineColor$lambda$2(GraphView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setScrubLineColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideGraphViewGlowColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(GraphView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule.provideGraphViewGlowColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((GraphView) obj).getGlowColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((GraphView) obj).setGlowColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibGraphScarletTransitionsModule.provideGraphViewGlowColor$lambda$3((GraphView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.glowColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideGraphViewGlowColor$lambda$3(GraphView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setGlowColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideGraphViewScreenBackgroundColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(GraphView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule.provideGraphViewScreenBackgroundColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((GraphView) obj).getScreenBackgroundColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((GraphView) obj).setScreenBackgroundColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibGraphScarletTransitionsModule.provideGraphViewScreenBackgroundColor$lambda$4((GraphView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.screenBackgroundColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideGraphViewScreenBackgroundColor$lambda$4(GraphView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setScreenBackgroundColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideIntervalSelectorLivePulseTint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(IntervalSelectorLayout.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.graph.dagger.LibGraphScarletTransitionsModule.provideIntervalSelectorLivePulseTint.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((IntervalSelectorLayout) obj).getLivePulseTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((IntervalSelectorLayout) obj).setLivePulseTint((ColorStateList) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.livePulseTint, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }
}
