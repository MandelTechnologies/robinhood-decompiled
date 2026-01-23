package com.robinhood.android.support.supporthub;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$5$2$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ String $subtitle;

    ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$5$2$3(String str) {
        this.$subtitle = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767609128, i, -1, "com.robinhood.android.support.supporthub.ConciergeWelcomeVideo.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ConciergeOnboardingComposable.kt:810)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoText2.m20747BentoText38GnDrw(this.$subtitle, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
