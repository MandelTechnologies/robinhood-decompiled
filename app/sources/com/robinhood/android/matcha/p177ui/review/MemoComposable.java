package com.robinhood.android.matcha.p177ui.review;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MemoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.review.ComposableSingletons$MemoComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MemoComposable {
    public static final MemoComposable INSTANCE = new MemoComposable();

    /* renamed from: lambda$-76229013, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9110lambda$76229013 = ComposableLambda3.composableLambdaInstance(-76229013, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.review.ComposableSingletons$MemoComposableKt$lambda$-76229013$1
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
                ComposerKt.traceEventStart(-76229013, i, -1, "com.robinhood.android.matcha.ui.review.ComposableSingletons$MemoComposableKt.lambda$-76229013.<anonymous> (MemoComposable.kt:50)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_add_memo, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-76229013$feature_p2p_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16394getLambda$76229013$feature_p2p_externalDebug() {
        return f9110lambda$76229013;
    }
}
