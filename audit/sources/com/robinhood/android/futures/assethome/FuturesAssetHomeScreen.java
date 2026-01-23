package com.robinhood.android.futures.assethome;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAssetHomeScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.ComposableSingletons$FuturesAssetHomeScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAssetHomeScreen {
    public static final FuturesAssetHomeScreen INSTANCE = new FuturesAssetHomeScreen();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$2071744995 = ComposableLambda3.composableLambdaInstance(2071744995, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.ComposableSingletons$FuturesAssetHomeScreenKt$lambda$2071744995$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2071744995, i, -1, "com.robinhood.android.futures.assethome.ComposableSingletons$FuturesAssetHomeScreenKt.lambda$2071744995.<anonymous> (FuturesAssetHomeScreen.kt:151)");
            }
            BentoText2.m20747BentoText38GnDrw("Unspecified", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$2071744995$feature_futures_asset_home_externalDebug() {
        return lambda$2071744995;
    }
}
