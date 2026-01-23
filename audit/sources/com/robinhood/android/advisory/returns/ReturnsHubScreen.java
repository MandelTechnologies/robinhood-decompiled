package com.robinhood.android.advisory.returns;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ReturnsHubScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.returns.ComposableSingletons$ReturnsHubScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsHubScreen {
    public static final ReturnsHubScreen INSTANCE = new ReturnsHubScreen();

    /* renamed from: lambda$-1004808524, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8654lambda$1004808524 = ComposableLambda3.composableLambdaInstance(-1004808524, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ComposableSingletons$ReturnsHubScreenKt$lambda$-1004808524$1
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
                ComposerKt.traceEventStart(-1004808524, i, -1, "com.robinhood.android.advisory.returns.ComposableSingletons$ReturnsHubScreenKt.lambda$-1004808524.<anonymous> (ReturnsHubScreen.kt:80)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1676985859, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8655lambda$1676985859 = ComposableLambda3.composableLambdaInstance(-1676985859, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.ComposableSingletons$ReturnsHubScreenKt$lambda$-1676985859$1
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
                ComposerKt.traceEventStart(-1676985859, i, -1, "com.robinhood.android.advisory.returns.ComposableSingletons$ReturnsHubScreenKt.lambda$-1676985859.<anonymous> (ReturnsHubScreen.kt:179)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9338R.string.returns_hub_benchmark_info_tooltip, composer, 0), SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(200), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 48, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1004808524$feature_returns_hub_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11251getLambda$1004808524$feature_returns_hub_externalDebug() {
        return f8654lambda$1004808524;
    }

    /* renamed from: getLambda$-1676985859$feature_returns_hub_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11252getLambda$1676985859$feature_returns_hub_externalDebug() {
        return f8655lambda$1676985859;
    }
}
