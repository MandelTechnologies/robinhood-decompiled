package com.robinhood.android.lib.screener;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayScreenerCells.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$DisplayScreenerCellsKt {
    public static final ComposableSingletons$DisplayScreenerCellsKt INSTANCE = new ComposableSingletons$DisplayScreenerCellsKt();
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$1178009663 = ComposableLambda3.composableLambdaInstance(1178009663, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.screener.ComposableSingletons$DisplayScreenerCellsKt$lambda$1178009663$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope ScreenerBaseCell, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ScreenerBaseCell, "$this$ScreenerBaseCell");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1178009663, i, -1, "com.robinhood.android.lib.screener.ComposableSingletons$DisplayScreenerCellsKt.lambda$1178009663.<anonymous> (DisplayScreenerCells.kt:205)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<BoxScope, Composer, Integer, Unit> getLambda$1178009663$feature_lib_screener_externalDebug() {
        return lambda$1178009663;
    }
}
