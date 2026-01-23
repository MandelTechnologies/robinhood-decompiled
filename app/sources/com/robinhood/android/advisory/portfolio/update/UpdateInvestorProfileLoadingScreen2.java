package com.robinhood.android.advisory.portfolio.update;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpdateInvestorProfileLoadingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt$lambda$-312391102$1, reason: use source file name */
/* loaded from: classes7.dex */
final class UpdateInvestorProfileLoadingScreen2 implements Function2<Composer, Integer, Unit> {
    public static final UpdateInvestorProfileLoadingScreen2 INSTANCE = new UpdateInvestorProfileLoadingScreen2();

    UpdateInvestorProfileLoadingScreen2() {
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
            ComposerKt.traceEventStart(-312391102, i, -1, "com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt.lambda$-312391102.<anonymous> (UpdateInvestorProfileLoadingScreen.kt:82)");
        }
        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.ComposableSingletons$UpdateInvestorProfileLoadingScreenKt$lambda$-312391102$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, "", modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, false, false, null, null, null, null, false, null, composer, 54, 0, 8184);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
