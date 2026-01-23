package com.robinhood.android.crypto.pulse.lib.entry.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPulseSeparateComponentEntryPoint.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.lib.entry.views.ComposableSingletons$CryptoPulseSeparateComponentEntryPointKt$lambda$-1353681560$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoPulseSeparateComponentEntryPoint2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoPulseSeparateComponentEntryPoint2 INSTANCE = new CryptoPulseSeparateComponentEntryPoint2();

    CryptoPulseSeparateComponentEntryPoint2() {
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
            ComposerKt.traceEventStart(-1353681560, i, -1, "com.robinhood.android.crypto.pulse.lib.entry.views.ComposableSingletons$CryptoPulseSeparateComponentEntryPointKt.lambda$-1353681560.<anonymous> (CryptoPulseSeparateComponentEntryPoint.kt:164)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
        CryptoPulseEntryPointViewState.Visible hasSignedAgreementPreviewState = CryptoPulseSeparateComponentEntryPoint4.getHasSignedAgreementPreviewState();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.pulse.lib.entry.views.ComposableSingletons$CryptoPulseSeparateComponentEntryPointKt$lambda$-1353681560$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoPulseSeparateComponentEntryPoint4.CryptoPulseSeparateComponentEntryPoint(hasSignedAgreementPreviewState, (Function0) objRememberedValue, modifierM5142padding3ABfNKs, composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
