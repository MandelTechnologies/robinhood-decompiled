package com.robinhood.microgram.sdui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MicrogramScreenFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.ComposableSingletons$MicrogramScreenFragmentKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class MicrogramScreenFragment2 {
    public static final MicrogramScreenFragment2 INSTANCE = new MicrogramScreenFragment2();

    /* renamed from: lambda$-175551207, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9363lambda$175551207 = ComposableLambda3.composableLambdaInstance(-175551207, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.ComposableSingletons$MicrogramScreenFragmentKt$lambda$-175551207$1
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
                ComposerKt.traceEventStart(-175551207, i, -1, "com.robinhood.microgram.sdui.ComposableSingletons$MicrogramScreenFragmentKt.lambda$-175551207.<anonymous> (MicrogramScreenFragment.kt:169)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-175551207$feature_microgram_sdui_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m22938getLambda$175551207$feature_microgram_sdui_externalDebug() {
        return f9363lambda$175551207;
    }
}
