package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldUnifiedValuePropsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedValuePropsComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedValuePropsComposable {
    public static final GoldUnifiedValuePropsComposable INSTANCE = new GoldUnifiedValuePropsComposable();
    private static Function2<Composer, Integer, Unit> lambda$1189253474 = ComposableLambda3.composableLambdaInstance(1189253474, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedValuePropsComposableKt$lambda$1189253474$1
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
                ComposerKt.traceEventStart(1189253474, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedValuePropsComposableKt.lambda$1189253474.<anonymous> (GoldUnifiedValuePropsComposable.kt:124)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1189253474$feature_gold_upgrade_externalRelease() {
        return lambda$1189253474;
    }
}
