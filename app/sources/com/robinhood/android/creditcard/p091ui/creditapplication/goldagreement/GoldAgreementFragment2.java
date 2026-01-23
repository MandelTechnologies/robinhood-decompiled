package com.robinhood.android.creditcard.p091ui.creditapplication.goldagreement;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.creditcard.C12201R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.ComposableSingletons$GoldAgreementFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class GoldAgreementFragment2 {
    public static final GoldAgreementFragment2 INSTANCE = new GoldAgreementFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1162055904 = ComposableLambda3.composableLambdaInstance(1162055904, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.goldagreement.ComposableSingletons$GoldAgreementFragmentKt$lambda$1162055904$1
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
                ComposerKt.traceEventStart(1162055904, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.goldagreement.ComposableSingletons$GoldAgreementFragmentKt.lambda$1162055904.<anonymous> (GoldAgreementFragment.kt:70)");
            }
            StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_gold_financial_agreement, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1162055904$feature_credit_card_externalDebug() {
        return lambda$1162055904;
    }
}
