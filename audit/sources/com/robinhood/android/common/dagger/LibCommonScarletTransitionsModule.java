package com.robinhood.android.common.dagger;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.drawerlayout.widget.DrawerLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.common.view.CandlestickChartView;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorAttributeTransition;
import com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition;
import com.robinhood.scarlet.transition.attribute.SimpleAttributeTransition;
import com.robinhood.scarlet.util.resource.RawResource;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LibCommonScarletTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/dagger/LibCommonScarletTransitionsModule;", "", "<init>", "()V", "provideAnimatedTickerTextColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "provideAnimatedTickerShadowColor", "provideCandlestickChartViewBaselineColor", "provideCandlestickChartViewNeutralColor", "provideCandlestickChartViewScrublineColor", "provideCandlestickChartViewWickColor", "provideEarningsDataViewColor", "provideStyleableMapViewStyle", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class LibCommonScarletTransitionsModule {
    public static final int $stable = 0;
    public static final LibCommonScarletTransitionsModule INSTANCE = new LibCommonScarletTransitionsModule();

    private LibCommonScarletTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideAnimatedTickerTextColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorStateListAttributeTransition(StyleableProperty.INSTANCE.from(AnimatedRhTextView.class, C110911.INSTANCE, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideAnimatedTickerTextColor$lambda$0((AnimatedRhTextView) obj, (ColorStateList) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, R.attr.textColor, ResourceType.COLOR_STATE_LIST.INSTANCE)), false, 2, null);
    }

    /* compiled from: LibCommonScarletTransitionsModule.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$provideAnimatedTickerTextColor$1 */
    /* synthetic */ class C110911 extends FunctionReferenceImpl implements Function1<AnimatedRhTextView, ColorStateList> {
        public static final C110911 INSTANCE = new C110911();

        C110911() {
            super(1, AnimatedRhTextView.class, "getTextColors", "getTextColors()Landroid/content/res/ColorStateList;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ColorStateList invoke(AnimatedRhTextView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getColors();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAnimatedTickerTextColor$lambda$0(AnimatedRhTextView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(...)");
        }
        from.setTextColor(colorStateList);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideAnimatedTickerShadowColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(AnimatedRhTextView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule.provideAnimatedTickerShadowColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((AnimatedRhTextView) obj).getShadowColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((AnimatedRhTextView) obj).setShadowColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideAnimatedTickerShadowColor$lambda$1((AnimatedRhTextView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, R.attr.shadowColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideAnimatedTickerShadowColor$lambda$1(AnimatedRhTextView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setShadowColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideCandlestickChartViewBaselineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(CandlestickChartView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule.provideCandlestickChartViewBaselineColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((CandlestickChartView) obj).getBaselineColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((CandlestickChartView) obj).setBaselineColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideCandlestickChartViewBaselineColor$lambda$2((CandlestickChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.baselineColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCandlestickChartViewBaselineColor$lambda$2(CandlestickChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setBaselineColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideCandlestickChartViewNeutralColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(CandlestickChartView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule.provideCandlestickChartViewNeutralColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((CandlestickChartView) obj).getNeutralColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((CandlestickChartView) obj).setNeutralColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideCandlestickChartViewNeutralColor$lambda$3((CandlestickChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.neutralColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCandlestickChartViewNeutralColor$lambda$3(CandlestickChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setNeutralColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideCandlestickChartViewScrublineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(CandlestickChartView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule.provideCandlestickChartViewScrublineColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((CandlestickChartView) obj).getScrublineColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((CandlestickChartView) obj).setScrublineColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideCandlestickChartViewScrublineColor$lambda$4((CandlestickChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.scrublineColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCandlestickChartViewScrublineColor$lambda$4(CandlestickChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setScrublineColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideCandlestickChartViewWickColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(CandlestickChartView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule.provideCandlestickChartViewWickColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((CandlestickChartView) obj).getWickColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((CandlestickChartView) obj).setWickColor((Integer) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideCandlestickChartViewWickColor$lambda$5((CandlestickChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.wickColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCandlestickChartViewWickColor$lambda$5(CandlestickChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (num == null) {
            num = 0;
        }
        from.setWickColor(num);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideEarningsDataViewColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(DrawerLayout.class, new Function1() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LibCommonScarletTransitionsModule.provideEarningsDataViewColor$lambda$6((DrawerLayout) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideEarningsDataViewColor$lambda$7((DrawerLayout) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.statusBarBackgroundColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideEarningsDataViewColor$lambda$6(DrawerLayout from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        Drawable statusBarBackgroundDrawable = from.getStatusBarBackgroundDrawable();
        ColorDrawable colorDrawable = statusBarBackgroundDrawable instanceof ColorDrawable ? (ColorDrawable) statusBarBackgroundDrawable : null;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideEarningsDataViewColor$lambda$7(DrawerLayout from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (num != null) {
            from.setStatusBarBackgroundColor(num.intValue());
        }
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideStyleableMapViewStyle(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new SimpleAttributeTransition(StyleableProperty.INSTANCE.from(StyleableMapView.class, new Function1() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LibCommonScarletTransitionsModule.provideStyleableMapViewStyle$lambda$8((StyleableMapView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.common.dagger.LibCommonScarletTransitionsModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LibCommonScarletTransitionsModule.provideStyleableMapViewStyle$lambda$9((StyleableMapView) obj, (RawResource) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.mapStyleResource, ResourceType.RAW.INSTANCE)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RawResource provideStyleableMapViewStyle$lambda$8(StyleableMapView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return from.getMapStyle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideStyleableMapViewStyle$lambda$9(StyleableMapView from, RawResource rawResource) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (rawResource == null) {
            rawResource = new RawResource(C11048R.raw.google_map_style_standard);
        }
        from.setMapStyle(rawResource);
        return Unit.INSTANCE;
    }
}
