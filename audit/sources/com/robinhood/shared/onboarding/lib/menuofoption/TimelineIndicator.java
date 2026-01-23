package com.robinhood.shared.onboarding.lib.menuofoption;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TimelineIndicator.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$TimelineIndicatorKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TimelineIndicator {
    public static final TimelineIndicator INSTANCE = new TimelineIndicator();
    private static Function2<Composer, Integer, Unit> lambda$438375961 = ComposableLambda3.composableLambdaInstance(438375961, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$TimelineIndicatorKt$lambda$438375961$1
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
                ComposerKt.traceEventStart(438375961, i, -1, "com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$TimelineIndicatorKt.lambda$438375961.<anonymous> (TimelineIndicator.kt:62)");
            }
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24));
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(120);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TimelineIndicator3.m25558TimelineIndicatorSk5a5R4(fM7995constructorimpl, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), modifierM5156height3ABfNKs, composer, 3078, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$438375961$lib_menu_of_options_externalDebug() {
        return lambda$438375961;
    }
}
