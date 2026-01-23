package com.robinhood.android.equitydetail.dagger;

import android.content.res.Resources;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsDataView;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsGraph;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoHeaderProgressBar;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FeatureEquityDetailTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/dagger/FeatureEquityDetailTransitionsModule;", "", "<init>", "()V", "provideEarningsDataViewColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "providesEarningsGraphDotColor", "provideIpoHeaderProgressBarTrackColor", "provideIpoHeaderProgressBarProgressBarColor", "provideIpoHeaderProgressBarHighlightColor", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class FeatureEquityDetailTransitionsModule {
    public static final int $stable = 0;
    public static final FeatureEquityDetailTransitionsModule INSTANCE = new FeatureEquityDetailTransitionsModule();

    private FeatureEquityDetailTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideEarningsDataViewColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(EarningsDataView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule.provideEarningsDataViewColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((EarningsDataView) obj).getThemeColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((EarningsDataView) obj).setThemeColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureEquityDetailTransitionsModule.provideEarningsDataViewColor$lambda$0((EarningsDataView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C15314R.attr.edv_color, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideEarningsDataViewColor$lambda$0(EarningsDataView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setThemeColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> providesEarningsGraphDotColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(EarningsGraph.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule.providesEarningsGraphDotColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((EarningsGraph) obj).getDotColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((EarningsGraph) obj).setDotColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureEquityDetailTransitionsModule.providesEarningsGraphDotColor$lambda$1((EarningsGraph) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C15314R.attr.eg_dotColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit providesEarningsGraphDotColor$lambda$1(EarningsGraph from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setDotColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideIpoHeaderProgressBarTrackColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(IpoHeaderProgressBar.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule.provideIpoHeaderProgressBarTrackColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((IpoHeaderProgressBar) obj).getTrackColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((IpoHeaderProgressBar) obj).setTrackColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureEquityDetailTransitionsModule.provideIpoHeaderProgressBarTrackColor$lambda$2((IpoHeaderProgressBar) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C15314R.attr.trackColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideIpoHeaderProgressBarTrackColor$lambda$2(IpoHeaderProgressBar from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setTrackColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideIpoHeaderProgressBarProgressBarColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(IpoHeaderProgressBar.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule.provideIpoHeaderProgressBarProgressBarColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((IpoHeaderProgressBar) obj).getProgressBarColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((IpoHeaderProgressBar) obj).setProgressBarColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureEquityDetailTransitionsModule.provideIpoHeaderProgressBarProgressBarColor$lambda$3((IpoHeaderProgressBar) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C15314R.attr.progressBarColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideIpoHeaderProgressBarProgressBarColor$lambda$3(IpoHeaderProgressBar from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setProgressBarColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideIpoHeaderProgressBarHighlightColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(IpoHeaderProgressBar.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule.provideIpoHeaderProgressBarHighlightColor.1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((IpoHeaderProgressBar) obj).getHighlightColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((IpoHeaderProgressBar) obj).setHighlightColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.equitydetail.dagger.FeatureEquityDetailTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureEquityDetailTransitionsModule.provideIpoHeaderProgressBarHighlightColor$lambda$4((IpoHeaderProgressBar) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C15314R.attr.highlightColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideIpoHeaderProgressBarHighlightColor$lambda$4(IpoHeaderProgressBar from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setHighlightColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }
}
