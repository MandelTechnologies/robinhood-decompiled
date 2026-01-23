package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FuturesDetailScreenKt {
    public static final ComposableSingletons$FuturesDetailScreenKt INSTANCE = new ComposableSingletons$FuturesDetailScreenKt();
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$394258371 = ComposableLambda3.composableLambdaInstance(394258371, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ComposableSingletons$FuturesDetailScreenKt$lambda$394258371$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues padding, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            if ((i & 6) == 0) {
                i |= composer.changed(padding) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(394258371, i, -1, "com.robinhood.android.futures.detail.ui.ComposableSingletons$FuturesDetailScreenKt.lambda$394258371.<anonymous> (FuturesDetailScreen.kt:92)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, padding), false, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$394258371$feature_futures_detail_externalDebug() {
        return lambda$394258371;
    }
}
