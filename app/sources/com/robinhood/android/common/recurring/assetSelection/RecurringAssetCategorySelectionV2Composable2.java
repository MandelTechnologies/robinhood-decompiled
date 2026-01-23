package com.robinhood.android.common.recurring.assetSelection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RecurringAssetCategorySelectionV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringAssetCategorySelectionV2Composable2 {
    public static final RecurringAssetCategorySelectionV2Composable2 INSTANCE = new RecurringAssetCategorySelectionV2Composable2();

    /* renamed from: lambda$-625531293, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8733lambda$625531293 = ComposableLambda3.composableLambdaInstance(-625531293, false, RecurringAssetCategorySelectionV2Composable4.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$622798168 = ComposableLambda3.composableLambdaInstance(622798168, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt$lambda$622798168$1
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
                ComposerKt.traceEventStart(622798168, i, -1, "com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt.lambda$622798168.<anonymous> (RecurringAssetCategorySelectionV2Composable.kt:445)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(RecurringAssetCategorySelectionV2Composable2.INSTANCE.m12355getLambda$625531293$feature_lib_recurring_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1634650689 = ComposableLambda3.composableLambdaInstance(1634650689, false, RecurringAssetCategorySelectionV2Composable5.INSTANCE);

    /* renamed from: lambda$-1872176020, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8732lambda$1872176020 = ComposableLambda3.composableLambdaInstance(-1872176020, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt$lambda$-1872176020$1
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
                ComposerKt.traceEventStart(-1872176020, i, -1, "com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt.lambda$-1872176020.<anonymous> (RecurringAssetCategorySelectionV2Composable.kt:479)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(RecurringAssetCategorySelectionV2Composable2.INSTANCE.getLambda$1634650689$feature_lib_recurring_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1872176020$feature_lib_recurring_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12354getLambda$1872176020$feature_lib_recurring_externalDebug() {
        return f8732lambda$1872176020;
    }

    /* renamed from: getLambda$-625531293$feature_lib_recurring_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12355getLambda$625531293$feature_lib_recurring_externalDebug() {
        return f8733lambda$625531293;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1634650689$feature_lib_recurring_externalDebug() {
        return lambda$1634650689;
    }

    public final Function2<Composer, Integer, Unit> getLambda$622798168$feature_lib_recurring_externalDebug() {
        return lambda$622798168;
    }
}
