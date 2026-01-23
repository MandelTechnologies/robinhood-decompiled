package com.robinhood.android.optionsupgrade.p210uk;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: UkReviewInvestorProfileFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.uk.ComposableSingletons$UkReviewInvestorProfileFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UkReviewInvestorProfileFragment2 {
    public static final UkReviewInvestorProfileFragment2 INSTANCE = new UkReviewInvestorProfileFragment2();

    /* renamed from: lambda$-541460476, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9165lambda$541460476 = ComposableLambda3.composableLambdaInstance(-541460476, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.ComposableSingletons$UkReviewInvestorProfileFragmentKt$lambda$-541460476$1
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
                ComposerKt.traceEventStart(-541460476, i, -1, "com.robinhood.android.optionsupgrade.uk.ComposableSingletons$UkReviewInvestorProfileFragmentKt.lambda$-541460476.<anonymous> (UkReviewInvestorProfileFragment.kt:135)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25121R.string.option_upgrade_toolbar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-541460476$feature_options_upgrade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17472getLambda$541460476$feature_options_upgrade_externalDebug() {
        return f9165lambda$541460476;
    }
}
