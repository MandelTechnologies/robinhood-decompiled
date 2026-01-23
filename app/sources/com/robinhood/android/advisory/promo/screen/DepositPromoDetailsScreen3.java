package com.robinhood.android.advisory.promo.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.promo.screen.DepositPromoDetailsViewState;
import com.robinhood.models.advisory.p304db.promo.PromoDetailsScreen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DepositPromoDetailsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt$lambda$48063166$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DepositPromoDetailsScreen3 implements Function2<Composer, Integer, Unit> {
    public static final DepositPromoDetailsScreen3 INSTANCE = new DepositPromoDetailsScreen3();

    DepositPromoDetailsScreen3() {
    }

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
            ComposerKt.traceEventStart(48063166, i, -1, "com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt.lambda$48063166.<anonymous> (DepositPromoDetailsScreen.kt:291)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.promo.screen.ComposableSingletons$DepositPromoDetailsScreenKt$lambda$48063166$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        DepositPromoDetailsScreen5.DepositPromoDetailsScreen((Function0) objRememberedValue, new DepositPromoDetailsViewState.Loaded(new PromoDetailsScreen(null, null, "Get a 1% boost on account transfers", "As a Gold member, you can earn extra on transfers of up to $50K until May 30.", "To keep your boost, hold your funds in Robinhood for 5 years and keep Gold for 1 year. Boost is offered by Robinhood Financial. View terms", "Continue", "", false, PromoDetailsScreen.Background.GRADIENT)), null, composer, 6, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
