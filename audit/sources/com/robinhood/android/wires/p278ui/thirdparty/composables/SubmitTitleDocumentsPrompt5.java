package com.robinhood.android.wires.p278ui.thirdparty.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SubmitTitleDocumentsPrompt.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$-694815610$1, reason: use source file name */
/* loaded from: classes16.dex */
final class SubmitTitleDocumentsPrompt5 implements Function2<Composer, Integer, Unit> {
    public static final SubmitTitleDocumentsPrompt5 INSTANCE = new SubmitTitleDocumentsPrompt5();

    SubmitTitleDocumentsPrompt5() {
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
            ComposerKt.traceEventStart(-694815610, i, -1, "com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt.lambda$-694815610.<anonymous> (SubmitTitleDocumentsPrompt.kt:27)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.ComposableSingletons$SubmitTitleDocumentsPromptKt$lambda$-694815610$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SubmitTitleDocumentsPrompt8.SubmitTitleDocumentsPrompt((Function0) objRememberedValue, null, composer, 6, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
