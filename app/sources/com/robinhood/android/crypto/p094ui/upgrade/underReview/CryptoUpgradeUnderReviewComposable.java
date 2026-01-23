package com.robinhood.android.crypto.p094ui.upgrade.underReview;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoUpgradeUnderReviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.upgrade.underReview.ComposableSingletons$CryptoUpgradeUnderReviewComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoUpgradeUnderReviewComposable {
    public static final CryptoUpgradeUnderReviewComposable INSTANCE = new CryptoUpgradeUnderReviewComposable();

    /* renamed from: lambda$-1278870120, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8857lambda$1278870120 = ComposableLambda3.composableLambdaInstance(-1278870120, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.upgrade.underReview.ComposableSingletons$CryptoUpgradeUnderReviewComposableKt$lambda$-1278870120$1
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
                ComposerKt.traceEventStart(-1278870120, i, -1, "com.robinhood.android.crypto.ui.upgrade.underReview.ComposableSingletons$CryptoUpgradeUnderReviewComposableKt.lambda$-1278870120.<anonymous> (CryptoUpgradeUnderReviewComposable.kt:46)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12757R.string.crypto_upgrade_under_review_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1278870120$feature_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13164getLambda$1278870120$feature_crypto_externalDebug() {
        return f8857lambda$1278870120;
    }
}
