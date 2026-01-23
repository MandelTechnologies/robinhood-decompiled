package com.robinhood.android.portfolio.benchmarkIntro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BenchmarkIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt$lambda$-949055063$1, reason: use source file name */
/* loaded from: classes11.dex */
final class BenchmarkIntroScreen5 implements Function2<Composer, Integer, Unit> {
    public static final BenchmarkIntroScreen5 INSTANCE = new BenchmarkIntroScreen5();

    BenchmarkIntroScreen5() {
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
            ComposerKt.traceEventStart(-949055063, i, -1, "com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt.lambda$-949055063.<anonymous> (BenchmarkIntroScreen.kt:247)");
        }
        AppType appType = AppType.TRADER;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt$lambda$-949055063$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt$lambda$-949055063$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt$lambda$-949055063$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BenchmarkIntroScreen.BenchmarkIntroScreen(appType, function0, function02, (Function0) objRememberedValue3, null, composer, 3510, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
