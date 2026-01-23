package com.robinhood.android.gold.hub.boost;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$GoldDepositBoostHubComposableKt {
    public static final ComposableSingletons$GoldDepositBoostHubComposableKt INSTANCE = new ComposableSingletons$GoldDepositBoostHubComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1193683841 = ComposableLambda3.composableLambdaInstance(1193683841, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.ComposableSingletons$GoldDepositBoostHubComposableKt$lambda$1193683841$1
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
                ComposerKt.traceEventStart(1193683841, i, -1, "com.robinhood.android.gold.hub.boost.ComposableSingletons$GoldDepositBoostHubComposableKt.lambda$1193683841.<anonymous> (GoldDepositBoostHubComposable.kt:161)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1286100858 = ComposableLambda3.composableLambdaInstance(1286100858, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.ComposableSingletons$GoldDepositBoostHubComposableKt$lambda$1286100858$1
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
                ComposerKt.traceEventStart(1286100858, i, -1, "com.robinhood.android.gold.hub.boost.ComposableSingletons$GoldDepositBoostHubComposableKt.lambda$1286100858.<anonymous> (GoldDepositBoostHubComposable.kt:258)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11183R.string.history_title, composer, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8184);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1193683841$feature_gold_hub_externalDebug() {
        return lambda$1193683841;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1286100858$feature_gold_hub_externalDebug() {
        return lambda$1286100858;
    }
}
