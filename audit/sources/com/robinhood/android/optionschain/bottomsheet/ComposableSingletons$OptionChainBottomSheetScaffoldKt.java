package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionChainBottomSheetScaffoldKt {
    public static final ComposableSingletons$OptionChainBottomSheetScaffoldKt INSTANCE = new ComposableSingletons$OptionChainBottomSheetScaffoldKt();
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$1339730988 = ComposableLambda3.composableLambdaInstance(1339730988, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.ComposableSingletons$OptionChainBottomSheetScaffoldKt$lambda$1339730988$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1339730988, i, -1, "com.robinhood.android.optionschain.bottomsheet.ComposableSingletons$OptionChainBottomSheetScaffoldKt.lambda$1339730988.<anonymous> (OptionChainBottomSheetScaffold.kt:68)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$1339730988$feature_options_chain_externalDebug() {
        return lambda$1339730988;
    }
}
