package com.robinhood.android.referral.lib.rewardOfferDetail.p235ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.referral.lib.C26709R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.rewardoffer.AnimatedHeaderData;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RewardOfferDetailAnimatedHeaderComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"RewardOfferDetailAnimatedHeaderComposable", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/rewardoffer/AnimatedHeaderData;", "(Lcom/robinhood/models/api/rewardoffer/AnimatedHeaderData;Landroidx/compose/runtime/Composer;I)V", "animatedHeaderTestTag", "", "feature-lib-referral_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "state", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailAnimatedHeaderComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardOfferDetailAnimatedHeaderComposable {
    public static final String animatedHeaderTestTag = "animatedHeader";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardOfferDetailAnimatedHeaderComposable$lambda$5(AnimatedHeaderData animatedHeaderData, int i, Composer composer, int i2) {
        RewardOfferDetailAnimatedHeaderComposable(animatedHeaderData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RewardOfferDetailAnimatedHeaderComposable(final AnimatedHeaderData data, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(895831216);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(data) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(895831216, i2, -1, "com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailAnimatedHeaderComposable (RewardOfferDetailAnimatedHeaderComposable.kt:30)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Asset.m9150boximpl(LottieCompositionSpec.Asset.m9151constructorimpl(data.getAnimation_name())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(RewardOfferDetailAnimatedHeaderComposable$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            LottieComposition lottieCompositionRewardOfferDetailAnimatedHeaderComposable$lambda$4$lambda$0 = RewardOfferDetailAnimatedHeaderComposable$lambda$4$lambda$0(lottieCompositionResultRememberLottieComposition);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailAnimatedHeaderComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(RewardOfferDetailAnimatedHeaderComposable.RewardOfferDetailAnimatedHeaderComposable$lambda$4$lambda$1(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LottieAnimation2.LottieAnimation(lottieCompositionRewardOfferDetailAnimatedHeaderComposable$lambda$4$lambda$0, (Function0) objRememberedValue, SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, animatedHeaderTestTag), 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)), false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 384, 0, 65528);
            Composer composer3 = composerStartRestartGroup;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i4).m21592getMediumD9Ej5fM()), composer3, 0);
            Instant expiration_date = data.getExpiration_date();
            composer3.startReplaceGroup(-332406472);
            if (!data.getShow_expiration() || expiration_date == null) {
                bentoTheme = bentoTheme2;
                i3 = i4;
            } else {
                bentoTheme = bentoTheme2;
                i3 = i4;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26709R.string.reward_offers_expiration_text, new Object[]{InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) expiration_date)}, composer3, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i4).getTextS(), composer3, 0, 0, 8124);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1);
            String display_title = data.getDisplay_title();
            BentoTheme bentoTheme3 = bentoTheme;
            int i5 = i3;
            TextStyle displayCapsuleMedium = bentoTheme3.getTypography(composer3, i5).getDisplayCapsuleMedium();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            Composer composer4 = composer3;
            BentoText2.m20747BentoText38GnDrw(display_title, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer4, 0, 0, 8124);
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, C2002Dp.m7995constructorimpl(12), 0.0f, composer4, 54, 2);
            String display_subtitle = data.getDisplay_subtitle();
            TextStyle textM = bentoTheme3.getTypography(composer4, i5).getTextM();
            composer2 = composer4;
            BentoText2.m20747BentoText38GnDrw(display_subtitle, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composer2, 0, 0, 8124);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.rewardOfferDetail.ui.RewardOfferDetailAnimatedHeaderComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardOfferDetailAnimatedHeaderComposable.RewardOfferDetailAnimatedHeaderComposable$lambda$5(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final LottieComposition RewardOfferDetailAnimatedHeaderComposable$lambda$4$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RewardOfferDetailAnimatedHeaderComposable$lambda$4$lambda$1(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
