package com.robinhood.android.gold.rejoin;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldRejoinLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinLoadingFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldRejoinLoadingFragment2 {
    public static final GoldRejoinLoadingFragment2 INSTANCE = new GoldRejoinLoadingFragment2();
    private static Function2<Composer, Integer, Unit> lambda$548810181 = ComposableLambda3.composableLambdaInstance(548810181, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinLoadingFragmentKt$lambda$548810181$1
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
                ComposerKt.traceEventStart(548810181, i, -1, "com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinLoadingFragmentKt.lambda$548810181.<anonymous> (GoldRejoinLoadingFragment.kt:52)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$2122495143 = ComposableLambda3.composableLambdaInstance(2122495143, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinLoadingFragmentKt$lambda$2122495143$1
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
                ComposerKt.traceEventStart(2122495143, i, -1, "com.robinhood.android.gold.rejoin.ComposableSingletons$GoldRejoinLoadingFragmentKt.lambda$2122495143.<anonymous> (GoldRejoinLoadingFragment.kt:61)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), true, true, 0, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$2122495143$feature_gold_rejoin_externalRelease() {
        return lambda$2122495143;
    }

    public final Function2<Composer, Integer, Unit> getLambda$548810181$feature_gold_rejoin_externalRelease() {
        return lambda$548810181;
    }
}
