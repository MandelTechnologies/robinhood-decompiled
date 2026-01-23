package com.robinhood.android.acatsin.review;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ReviewAcatsInComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.review.ComposableSingletons$ReviewAcatsInComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class ReviewAcatsInComposable {
    public static final ReviewAcatsInComposable INSTANCE = new ReviewAcatsInComposable();
    private static Function2<Composer, Integer, Unit> lambda$1435422176 = ComposableLambda3.composableLambdaInstance(1435422176, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ComposableSingletons$ReviewAcatsInComposableKt$lambda$1435422176$1
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
                ComposerKt.traceEventStart(1435422176, i, -1, "com.robinhood.android.acatsin.review.ComposableSingletons$ReviewAcatsInComposableKt.lambda$1435422176.<anonymous> (ReviewAcatsInComposable.kt:85)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_review_brokerage_label, composer, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16378);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1435422176$lib_acats_ui_externalDebug() {
        return lambda$1435422176;
    }
}
