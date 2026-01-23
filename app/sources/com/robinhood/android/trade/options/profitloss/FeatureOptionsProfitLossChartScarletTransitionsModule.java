package com.robinhood.android.trade.options.profitloss;

import android.content.res.Resources;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import com.robinhood.scarlet.transition.attribute.ColorAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FeatureOptionsProfitLossChartScarletTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/FeatureOptionsProfitLossChartScarletTransitionsModule;", "", "<init>", "()V", "providePrimaryTextColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "provideSecondaryTextColor", "provideLineColor", "provideUnderlyingLineColor", "provideNegativeLineColor", "providePositiveLineColor", "provideNegativeAreaColor", "providePositiveAreaColor", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class FeatureOptionsProfitLossChartScarletTransitionsModule {
    public static final int $stable = 0;
    public static final FeatureOptionsProfitLossChartScarletTransitionsModule INSTANCE = new FeatureOptionsProfitLossChartScarletTransitionsModule();

    private FeatureOptionsProfitLossChartScarletTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> providePrimaryTextColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.providePrimaryTextColor$lambda$0((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.providePrimaryTextColor$lambda$1((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.primaryTextColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer providePrimaryTextColor$lambda$0(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getPrimaryTextColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit providePrimaryTextColor$lambda$1(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPrimaryTextColor(num != null ? num.intValue() : -16777216);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideSecondaryTextColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideSecondaryTextColor$lambda$2((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideSecondaryTextColor$lambda$3((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.secondaryTextColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideSecondaryTextColor$lambda$2(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getSecondaryTextColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSecondaryTextColor$lambda$3(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setSecondaryTextColor(num != null ? num.intValue() : -16777216);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideLineColor$lambda$4((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideLineColor$lambda$5((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.lineColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideLineColor$lambda$4(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getLineColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideLineColor$lambda$5(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setLineColor(num != null ? num.intValue() : -16777216);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideUnderlyingLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideUnderlyingLineColor$lambda$6((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideUnderlyingLineColor$lambda$7((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.underlyingLineColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideUnderlyingLineColor$lambda$6(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getUnderlyingLineColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideUnderlyingLineColor$lambda$7(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setUnderlyingLineColor(num != null ? num.intValue() : -16777216);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideNegativeLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideNegativeLineColor$lambda$8((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideNegativeLineColor$lambda$9((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.negativeColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideNegativeLineColor$lambda$8(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getNegativeLineColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideNegativeLineColor$lambda$9(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setNegativeLineColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> providePositiveLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.providePositiveLineColor$lambda$10((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.providePositiveLineColor$lambda$11((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.positiveColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer providePositiveLineColor$lambda$10(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getPositiveLineColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit providePositiveLineColor$lambda$11(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPositiveLineColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideNegativeAreaColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideNegativeAreaColor$lambda$12((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.provideNegativeAreaColor$lambda$13((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.negativeGhostColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideNegativeAreaColor$lambda$12(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getNegativeAreaColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideNegativeAreaColor$lambda$13(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setNegativeAreaColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> providePositiveAreaColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionsProfitLossChartView.class, new Function1() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.providePositiveAreaColor$lambda$14((OptionsProfitLossChartView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsProfitLossChartScarletTransitionsModule.providePositiveAreaColor$lambda$15((OptionsProfitLossChartView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24771R.attr.positiveGhostColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer providePositiveAreaColor$lambda$14(OptionsProfitLossChartView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getPositiveAreaColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit providePositiveAreaColor$lambda$15(OptionsProfitLossChartView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPositiveAreaColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }
}
