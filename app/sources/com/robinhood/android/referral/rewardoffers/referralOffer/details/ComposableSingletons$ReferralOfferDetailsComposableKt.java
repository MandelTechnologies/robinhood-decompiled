package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ReferralOfferDetailsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ReferralOfferDetailsComposableKt {
    public static final ComposableSingletons$ReferralOfferDetailsComposableKt INSTANCE = new ComposableSingletons$ReferralOfferDetailsComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1661296789 = ComposableLambda3.composableLambdaInstance(1661296789, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ComposableSingletons$ReferralOfferDetailsComposableKt$lambda$1661296789$1
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
                ComposerKt.traceEventStart(1661296789, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ComposableSingletons$ReferralOfferDetailsComposableKt.lambda$1661296789.<anonymous> (ReferralOfferDetailsComposable.kt:325)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "Some primary text", "Some secondary text this", (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLineAndIcon("Some info", ServerToBentoAssetMapper2.PERSON_16, "", (Color) null, 8, (DefaultConstructorMarker) null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer, BentoBaseRowState.$stable << 3, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$433034555 = ComposableLambda3.composableLambdaInstance(433034555, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ComposableSingletons$ReferralOfferDetailsComposableKt$lambda$433034555$1
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
                ComposerKt.traceEventStart(433034555, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ComposableSingletons$ReferralOfferDetailsComposableKt.lambda$433034555.<anonymous> (ReferralOfferDetailsComposable.kt:542)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$324633394 = ComposableLambda3.composableLambdaInstance(324633394, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ComposableSingletons$ReferralOfferDetailsComposableKt$lambda$324633394$1
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
                ComposerKt.traceEventStart(324633394, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ComposableSingletons$ReferralOfferDetailsComposableKt.lambda$324633394.<anonymous> (ReferralOfferDetailsComposable.kt:566)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.HISTORY_24), StringResources_androidKt.stringResource(C11048R.string.general_action_search, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1661296789$feature_referral_externalDebug() {
        return lambda$1661296789;
    }

    public final Function2<Composer, Integer, Unit> getLambda$324633394$feature_referral_externalDebug() {
        return lambda$324633394;
    }

    public final Function2<Composer, Integer, Unit> getLambda$433034555$feature_referral_externalDebug() {
        return lambda$433034555;
    }
}
