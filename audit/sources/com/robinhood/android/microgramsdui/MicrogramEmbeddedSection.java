package com.robinhood.android.microgramsdui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MicrogramEmbeddedSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.ComposableSingletons$MicrogramEmbeddedSectionKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MicrogramEmbeddedSection {
    public static final MicrogramEmbeddedSection INSTANCE = new MicrogramEmbeddedSection();

    /* renamed from: lambda$-1010926801, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9120lambda$1010926801 = ComposableLambda3.composableLambdaInstance(-1010926801, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.ComposableSingletons$MicrogramEmbeddedSectionKt$lambda$-1010926801$1
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
                ComposerKt.traceEventStart(-1010926801, i, -1, "com.robinhood.android.microgramsdui.ComposableSingletons$MicrogramEmbeddedSectionKt.lambda$-1010926801.<anonymous> (MicrogramEmbeddedSection.kt:43)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), C2002Dp.m7995constructorimpl(80)), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1010926801$lib_microgram_sdui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16540getLambda$1010926801$lib_microgram_sdui_externalDebug() {
        return f9120lambda$1010926801;
    }
}
