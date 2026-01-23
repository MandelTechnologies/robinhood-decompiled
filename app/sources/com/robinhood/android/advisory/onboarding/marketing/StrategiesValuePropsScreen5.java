package com.robinhood.android.advisory.onboarding.marketing;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StrategiesValuePropsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.marketing.ComposableSingletons$StrategiesValuePropsScreenKt$lambda$1234588006$1, reason: use source file name */
/* loaded from: classes7.dex */
final class StrategiesValuePropsScreen5 implements Function2<Composer, Integer, Unit> {
    public static final StrategiesValuePropsScreen5 INSTANCE = new StrategiesValuePropsScreen5();

    StrategiesValuePropsScreen5() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1234588006, i, -1, "com.robinhood.android.advisory.onboarding.marketing.ComposableSingletons$StrategiesValuePropsScreenKt.lambda$1234588006.<anonymous> (StrategiesValuePropsScreen.kt:577)");
        }
        Screen screen = new Screen(Screen.Name.STRATEGIES_VALUE_PROPS, null, null, null, 14, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.marketing.ComposableSingletons$StrategiesValuePropsScreenKt$lambda$1234588006$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.marketing.ComposableSingletons$StrategiesValuePropsScreenKt$lambda$1234588006$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        StrategiesValuePropsScreen7.StrategiesValuePropsBodyContent("--------------- -----------------", "------ ------ ---------- ------------ ---- ------- ----- ----", "------ ------ ----------- -------- ------------ ------------ ---- ------- ----- ----", "----------- ------------", OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, false, screen, function0, (Function0) objRememberedValue2, false, null, composer, 918777270, 0, 1024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
