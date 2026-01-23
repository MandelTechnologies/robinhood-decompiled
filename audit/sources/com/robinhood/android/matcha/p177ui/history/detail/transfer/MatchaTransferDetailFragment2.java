package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import androidx.compose.p011ui.graphics.Color;
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

/* compiled from: MatchaTransferDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.ComposableSingletons$MatchaTransferDetailFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaTransferDetailFragment2 {
    public static final MatchaTransferDetailFragment2 INSTANCE = new MatchaTransferDetailFragment2();

    /* renamed from: lambda$-1165457895, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9107lambda$1165457895 = ComposableLambda3.composableLambdaInstance(-1165457895, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.detail.transfer.ComposableSingletons$MatchaTransferDetailFragmentKt$lambda$-1165457895$1
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
                ComposerKt.traceEventStart(-1165457895, i, -1, "com.robinhood.android.matcha.ui.history.detail.transfer.ComposableSingletons$MatchaTransferDetailFragmentKt.lambda$-1165457895.<anonymous> (MatchaTransferDetailFragment.kt:280)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_transaction_detail_memo, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1165457895$feature_p2p_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16333getLambda$1165457895$feature_p2p_externalDebug() {
        return f9107lambda$1165457895;
    }
}
