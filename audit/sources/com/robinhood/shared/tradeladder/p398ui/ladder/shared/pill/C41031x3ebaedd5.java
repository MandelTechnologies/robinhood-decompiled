package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PillLoadingPlaceholderModifier.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PillLoadingPlaceholderModifierKt$lambda$-1616995916$1 */
/* loaded from: classes12.dex */
final class C41031x3ebaedd5 implements Function2<Composer, Integer, Unit> {
    public static final C41031x3ebaedd5 INSTANCE = new C41031x3ebaedd5();

    C41031x3ebaedd5() {
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
            ComposerKt.traceEventStart(-1616995916, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PillLoadingPlaceholderModifierKt.lambda$-1616995916.<anonymous> (PillLoadingPlaceholderModifier.kt:172)");
        }
        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
        Modifier modifierM26166pillLoadingPlaceholderdDIYWSk$default = PillLoadingPlaceholderModifierKt.m26166pillLoadingPlaceholderdDIYWSk$default(Modifier.INSTANCE, RoundedCornerShape2.RoundedCornerShape(50), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getPillOutlineGradiantBrush(), 0.0f, 0.0f, 0, 56, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PillLoadingPlaceholderModifierKt$lambda$-1616995916$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "Buy MKT", modifierM26166pillLoadingPlaceholderdDIYWSk$default, null, type2, false, false, Color.m6701boximpl(jM21373getBg30d7_KjU), null, Color.m6701boximpl(jM6725getTransparent0d7_KjU), null, false, null, composer, 805527606, 48, 5448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
