package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoScamSplashScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$CryptoScamSplashScreenKt$lambda$-1246478962$1, reason: use source file name */
/* loaded from: classes10.dex */
final class CryptoScamSplashScreen2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoScamSplashScreen2 INSTANCE = new CryptoScamSplashScreen2();

    CryptoScamSplashScreen2() {
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
            ComposerKt.traceEventStart(-1246478962, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$CryptoScamSplashScreenKt.lambda$-1246478962.<anonymous> (CryptoScamSplashScreen.kt:109)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.ComposableSingletons$CryptoScamSplashScreenKt$lambda$-1246478962$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoScamSplashScreen5.CryptoScamSplashScreen((Function0) objRememberedValue, null, null, composer, 54, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
