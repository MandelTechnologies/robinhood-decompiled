package com.robinhood.shared.trading.tradecomponentscompose.traderow;

import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PillLoadingPlaceholderModifier.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.traderow.ComposableSingletons$PillLoadingPlaceholderModifierKt$lambda$-2054269745$1 */
/* loaded from: classes12.dex */
final class C41083x28aea22 implements Function2<Composer, Integer, Unit> {
    public static final C41083x28aea22 INSTANCE = new C41083x28aea22();

    C41083x28aea22() {
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
            ComposerKt.traceEventStart(-2054269745, i, -1, "com.robinhood.shared.trading.tradecomponentscompose.traderow.ComposableSingletons$PillLoadingPlaceholderModifierKt.lambda$-2054269745.<anonymous> (PillLoadingPlaceholderModifier.kt:164)");
        }
        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        Modifier modifierM26318pillLoadingPlaceholderdDIYWSk$default = PillLoadingPlaceholderModifierKt.m26318pillLoadingPlaceholderdDIYWSk$default(Modifier.INSTANCE, RoundedCornerShape2.RoundedCornerShape(50), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), PillLoadingPlaceholderModifierKt.defaultPillOutlineLinearGradiant(composer, 0), 0.0f, 0.0f, 0, 56, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.traderow.ComposableSingletons$PillLoadingPlaceholderModifierKt$lambda$-2054269745$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "Buy MKT", modifierM26318pillLoadingPlaceholderdDIYWSk$default, null, type2, false, false, Color.m6701boximpl(jM21373getBg30d7_KjU), null, Color.m6701boximpl(jM6725getTransparent0d7_KjU), null, false, null, composer, 805527606, 48, 5448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
