package com.robinhood.android.prompts;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PromptsHandlingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.prompts.ComposableSingletons$PromptsHandlingComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PromptsHandlingComposable {
    public static final PromptsHandlingComposable INSTANCE = new PromptsHandlingComposable();
    private static Function2<Composer, Integer, Unit> lambda$52790920 = ComposableLambda3.composableLambdaInstance(52790920, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.prompts.ComposableSingletons$PromptsHandlingComposableKt$lambda$52790920$1
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
                ComposerKt.traceEventStart(52790920, i, -1, "com.robinhood.android.prompts.ComposableSingletons$PromptsHandlingComposableKt.lambda$52790920.<anonymous> (PromptsHandlingComposable.kt:312)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.MAPS_24), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$52790920$feature_prompts_externalDebug() {
        return lambda$52790920;
    }
}
