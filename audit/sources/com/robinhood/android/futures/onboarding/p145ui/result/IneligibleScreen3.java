package com.robinhood.android.futures.onboarding.p145ui.result;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IneligibleScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$IneligibleScreenKt$lambda$-2080029779$1, reason: use source file name */
/* loaded from: classes3.dex */
final class IneligibleScreen3 implements Function2<Composer, Integer, Unit> {
    public static final IneligibleScreen3 INSTANCE = new IneligibleScreen3();

    IneligibleScreen3() {
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
            ComposerKt.traceEventStart(-2080029779, i, -1, "com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$IneligibleScreenKt.lambda$-2080029779.<anonymous> (IneligibleScreen.kt:77)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$IneligibleScreenKt$lambda$-2080029779$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        IneligibleScreen5.IneligibleScreen(false, (Function0) objRememberedValue, null, composer, 54, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
