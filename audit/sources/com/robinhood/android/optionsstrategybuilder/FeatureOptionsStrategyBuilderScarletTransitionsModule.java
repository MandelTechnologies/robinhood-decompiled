package com.robinhood.android.optionsstrategybuilder;

import android.content.res.Resources;
import com.robinhood.android.optionsstrategybuilder.pickers.RhNumberPicker;
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

/* compiled from: FeatureOptionsStrategyBuilderScarletTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/FeatureOptionsStrategyBuilderScarletTransitionsModule;", "", "<init>", "()V", "providePrimaryTextColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "provideSolidColor", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class FeatureOptionsStrategyBuilderScarletTransitionsModule {
    public static final int $stable = 0;
    public static final FeatureOptionsStrategyBuilderScarletTransitionsModule INSTANCE = new FeatureOptionsStrategyBuilderScarletTransitionsModule();

    private FeatureOptionsStrategyBuilderScarletTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> providePrimaryTextColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(RhNumberPicker.class, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.FeatureOptionsStrategyBuilderScarletTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsStrategyBuilderScarletTransitionsModule.providePrimaryTextColor$lambda$0((RhNumberPicker) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.optionsstrategybuilder.FeatureOptionsStrategyBuilderScarletTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsStrategyBuilderScarletTransitionsModule.providePrimaryTextColor$lambda$1((RhNumberPicker) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24876R.attr.primaryTextColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer providePrimaryTextColor$lambda$0(RhNumberPicker from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getPrimaryTextColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit providePrimaryTextColor$lambda$1(RhNumberPicker from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPrimaryTextColor(num != null ? num.intValue() : -16777216);
        return Unit.INSTANCE;
    }

    public final StylePropertyTransition<?, ?> provideSolidColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(RhNumberPicker.class, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.FeatureOptionsStrategyBuilderScarletTransitionsModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureOptionsStrategyBuilderScarletTransitionsModule.provideSolidColor$lambda$2((RhNumberPicker) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.optionsstrategybuilder.FeatureOptionsStrategyBuilderScarletTransitionsModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureOptionsStrategyBuilderScarletTransitionsModule.provideSolidColor$lambda$3((RhNumberPicker) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C24876R.attr.solidColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideSolidColor$lambda$2(RhNumberPicker from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getColorBackground());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSolidColor$lambda$3(RhNumberPicker from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setColorBackground(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }
}
