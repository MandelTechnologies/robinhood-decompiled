package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HorizontalStaggeredGrid.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$HorizontalStaggeredGridKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class HorizontalStaggeredGrid {
    public static final HorizontalStaggeredGrid INSTANCE = new HorizontalStaggeredGrid();
    private static Function2<Composer, Integer, Unit> lambda$315354614 = ComposableLambda3.composableLambdaInstance(315354614, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$HorizontalStaggeredGridKt$lambda$315354614$1
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
                ComposerKt.traceEventStart(315354614, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$HorizontalStaggeredGridKt.lambda$315354614.<anonymous> (HorizontalStaggeredGrid.kt:94)");
            }
            for (int i2 = 0; i2 < 11; i2++) {
                BentoText2.m20747BentoText38GnDrw("Hello " + i2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$60517716 = ComposableLambda3.composableLambdaInstance(60517716, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$HorizontalStaggeredGridKt$lambda$60517716$1
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
                ComposerKt.traceEventStart(60517716, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$HorizontalStaggeredGridKt.lambda$60517716.<anonymous> (HorizontalStaggeredGrid.kt:93)");
            }
            HorizontalStaggeredGrid4.m20813HorizontalStaggeredGridnSlTg7c(null, 0, null, 0.0f, 0.0f, HorizontalStaggeredGrid.INSTANCE.getLambda$315354614$lib_compose_bento_externalRelease(), composer, 196608, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$315354614$lib_compose_bento_externalRelease() {
        return lambda$315354614;
    }

    public final Function2<Composer, Integer, Unit> getLambda$60517716$lib_compose_bento_externalRelease() {
        return lambda$60517716;
    }
}
