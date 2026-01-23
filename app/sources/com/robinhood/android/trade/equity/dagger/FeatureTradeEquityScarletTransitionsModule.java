package com.robinhood.android.trade.equity.dagger;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.tickerinputview.TickerInputView;
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

/* compiled from: FeatureTradeEquityScarletTransitionsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/dagger/FeatureTradeEquityScarletTransitionsModule;", "", "<init>", "()V", "provideTickerInputViewTextColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "resources", "Landroid/content/res/Resources;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class FeatureTradeEquityScarletTransitionsModule {
    public static final int $stable = 0;
    public static final FeatureTradeEquityScarletTransitionsModule INSTANCE = new FeatureTradeEquityScarletTransitionsModule();

    private FeatureTradeEquityScarletTransitionsModule() {
    }

    public final StylePropertyTransition<?, ?> provideTickerInputViewTextColor(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ColorAttributeTransition(StyleableProperty.INSTANCE.from(TickerInputView.class, new Function1() { // from class: com.robinhood.android.trade.equity.dagger.FeatureTradeEquityScarletTransitionsModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureTradeEquityScarletTransitionsModule.provideTickerInputViewTextColor$lambda$0((TickerInputView) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.trade.equity.dagger.FeatureTradeEquityScarletTransitionsModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FeatureTradeEquityScarletTransitionsModule.provideTickerInputViewTextColor$lambda$1((TickerInputView) obj, (Integer) obj2);
            }
        }, StyleProperty.INSTANCE.from(resources, C11048R.attr.tickerInputViewTextColor, ResourceType.COLOR.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer provideTickerInputViewTextColor$lambda$0(TickerInputView from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Integer.valueOf(from.getTextColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTickerInputViewTextColor$lambda$1(TickerInputView from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setTextColor(num != null ? num.intValue() : -16777216);
        return Unit.INSTANCE;
    }
}
