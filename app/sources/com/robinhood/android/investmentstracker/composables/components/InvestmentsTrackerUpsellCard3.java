package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import bff_money_movement.service.p019v1.InvestmentsTrackerActionDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentUpsellCardDto;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponentType;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerUpsellCardViewModel;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestmentsTrackerUpsellCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerUpsellCardKt$lambda$-627705277$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerUpsellCard3 implements Function2<Composer, Integer, Unit> {
    public static final InvestmentsTrackerUpsellCard3 INSTANCE = new InvestmentsTrackerUpsellCard3();

    InvestmentsTrackerUpsellCard3() {
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
            ComposerKt.traceEventStart(-627705277, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerUpsellCardKt.lambda$-627705277.<anonymous> (InvestmentsTrackerUpsellCard.kt:41)");
        }
        InvestmentsTrackerUpsellCardViewModel investmentsTrackerUpsellCardViewModel = new InvestmentsTrackerUpsellCardViewModel(new InvestmentsTrackerComponentUpsellCardDto("Connect your accounts to track your full portfolio, all on Robinhood", "Connect external accounts", InvestmentsTrackerActionDto.CONNECT_ROW_CLICKED, "https://cdn.robinhood.com/app_assets/money-movement/investment-tracker/connect_account_card_banner_illustration.png"), InvestmentsTrackerComponentType.UPSELL_CARD, Constants.SdidMigrationStatusCodes.ALREADY_SDID, new SecurityFilter(false));
        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(150));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerUpsellCardKt$lambda$-627705277$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerUpsellCard3.invoke$lambda$1$lambda$0((InvestmentsTrackerNativeAction) obj, obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerUpsellCard4.InvestmentsTrackerUpsellCard(investmentsTrackerUpsellCardViewModel, (Function2) objRememberedValue, modifierM5156height3ABfNKs, composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InvestmentsTrackerNativeAction investmentsTrackerNativeAction, Object obj) {
        Intrinsics.checkNotNullParameter(investmentsTrackerNativeAction, "<unused var>");
        Intrinsics.checkNotNullParameter(obj, "<unused var>");
        return Unit.INSTANCE;
    }
}
