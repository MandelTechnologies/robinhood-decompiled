package com.robinhood.shared.common.instrumentratings;

import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentRatingsV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.instrumentratings.ComposableSingletons$InstrumentRatingsV2Kt, reason: use source file name */
/* loaded from: classes26.dex */
public final class InstrumentRatingsV2 {
    public static final InstrumentRatingsV2 INSTANCE = new InstrumentRatingsV2();
    private static Function2<Composer, Integer, Unit> lambda$758547510 = ComposableLambda3.composableLambdaInstance(758547510, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.instrumentratings.ComposableSingletons$InstrumentRatingsV2Kt$lambda$758547510$1
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
                ComposerKt.traceEventStart(758547510, i, -1, "com.robinhood.shared.common.instrumentratings.ComposableSingletons$InstrumentRatingsV2Kt.lambda$758547510.<anonymous> (InstrumentRatingsV2.kt:129)");
            }
            InstrumentRatingsV24.InstrumentRatingsV2(InstrumentRatingsV24.buildState(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, AnalystRatingsComposableState.$stable | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2090285806 = ComposableLambda3.composableLambdaInstance(2090285806, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.instrumentratings.ComposableSingletons$InstrumentRatingsV2Kt$lambda$2090285806$1
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
                ComposerKt.traceEventStart(2090285806, i, -1, "com.robinhood.shared.common.instrumentratings.ComposableSingletons$InstrumentRatingsV2Kt.lambda$2090285806.<anonymous> (InstrumentRatingsV2.kt:128)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composer, 0)), null, null, null, null, null, null, null, InstrumentRatingsV2.INSTANCE.getLambda$758547510$lib_instrument_ratings_externalDebug(), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2090285806$lib_instrument_ratings_externalDebug() {
        return lambda$2090285806;
    }

    public final Function2<Composer, Integer, Unit> getLambda$758547510$lib_instrument_ratings_externalDebug() {
        return lambda$758547510;
    }
}
