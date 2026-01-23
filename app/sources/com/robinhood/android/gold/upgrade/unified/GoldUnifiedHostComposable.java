package com.robinhood.android.gold.upgrade.unified;

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

/* compiled from: GoldUnifiedHostComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedHostComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedHostComposable {
    public static final GoldUnifiedHostComposable INSTANCE = new GoldUnifiedHostComposable();

    /* renamed from: lambda$-1869630305, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9027lambda$1869630305 = ComposableLambda3.composableLambdaInstance(-1869630305, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedHostComposableKt$lambda$-1869630305$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1869630305, i, -1, "com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedHostComposableKt.lambda$-1869630305.<anonymous> (GoldUnifiedHostComposable.kt:287)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, true, true, composer, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1869630305$feature_gold_upgrade_externalRelease, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m15145getLambda$1869630305$feature_gold_upgrade_externalRelease() {
        return f9027lambda$1869630305;
    }
}
