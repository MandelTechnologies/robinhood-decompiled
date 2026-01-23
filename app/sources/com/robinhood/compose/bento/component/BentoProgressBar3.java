package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BentoProgressBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoProgressBarKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoProgressBar3 {
    public static final BentoProgressBar3 INSTANCE = new BentoProgressBar3();
    private static Function2<Composer, Integer, Unit> lambda$608886218 = ComposableLambda3.composableLambdaInstance(608886218, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoProgressBarKt$lambda$608886218$1
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
                ComposerKt.traceEventStart(608886218, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoProgressBarKt.lambda$608886218.<anonymous> (BentoProgressBar.kt:141)");
            }
            BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.6f, null, 1, 0L, 0L, false, composer, 390, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$608886218$lib_compose_bento_externalRelease() {
        return lambda$608886218;
    }
}
