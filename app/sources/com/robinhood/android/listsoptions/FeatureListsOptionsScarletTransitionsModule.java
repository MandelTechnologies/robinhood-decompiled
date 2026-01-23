package com.robinhood.android.listsoptions;

import android.content.res.Resources;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistTimeframeLineView;
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

/* compiled from: FeatureListsOptionsScarletTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/FeatureListsOptionsScarletTransitionsModule;", "", "<init>", "()V", "provideLineColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class FeatureListsOptionsScarletTransitionsModule {
    public static final FeatureListsOptionsScarletTransitionsModule INSTANCE = new FeatureListsOptionsScarletTransitionsModule();

    private FeatureListsOptionsScarletTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideLineColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(OptionWatchlistTimeframeLineView.class, new Function1() { // from class: com.robinhood.android.listsoptions.FeatureListsOptionsScarletTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureListsOptionsScarletTransitionsModule.provideLineColor$lambda$0((OptionWatchlistTimeframeLineView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.listsoptions.FeatureListsOptionsScarletTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureListsOptionsScarletTransitionsModule.provideLineColor$lambda$1((OptionWatchlistTimeframeLineView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C20690R.attr.colorForeground1, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideLineColor$lambda$0(OptionWatchlistTimeframeLineView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getLineColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideLineColor$lambda$1(OptionWatchlistTimeframeLineView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setLineColor(num != null ? num.intValue() : -16777216);
        return Unit.INSTANCE;
    }
}
