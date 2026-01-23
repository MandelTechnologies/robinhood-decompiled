package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.advisory.onboarding.AdvisoryOnboardingSharedComponents;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.PromoScreen;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.advisory.api.contribution.PromoViewModel;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PromoScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"PromoScreen", "", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/PromoViewModel;", "onPromoContinueClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/advisory/api/contribution/PromoViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.PromoScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PromoScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoScreen$lambda$0(PromoViewModel promoViewModel, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PromoScreen(promoViewModel, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PromoScreen(final PromoViewModel viewModel, final Function0<Unit> onPromoContinueClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onPromoContinueClicked, "onPromoContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-929310425);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPromoContinueClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-929310425, i3, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.PromoScreen (PromoScreen.kt:38)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1322072508, true, new C88631(modifier, viewModel, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), onPromoContinueClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.PromoScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PromoScreen.PromoScreen$lambda$0(viewModel, onPromoContinueClicked, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PromoScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.PromoScreenKt$PromoScreen$1 */
    static final class C88631 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onPromoContinueClicked;
        final /* synthetic */ PromoViewModel $viewModel;

        C88631(Modifier modifier, PromoViewModel promoViewModel, Context context, Function0<Unit> function0) {
            this.$modifier = modifier;
            this.$viewModel = promoViewModel;
            this.$context = context;
            this.$onPromoContinueClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final LottieComposition invoke$lambda$7$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1322072508, i, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.PromoScreen.<anonymous> (PromoScreen.kt:42)");
            }
            Modifier modifier = this.$modifier;
            final PromoViewModel promoViewModel = this.$viewModel;
            final Context context = this.$context;
            Function0<Unit> function0 = this.$onPromoContinueClicked;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column6, companion3, AdvisoryOnboardingSharedComponents.getHeroAssetContainerWeight(composer, 0), false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            LottieAnimation2.LottieAnimation(invoke$lambda$7$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(bentoTheme.getColors(composer, i2).getIsDay() ? promoViewModel.getLight_mode_lottie_url() : promoViewModel.getDark_mode_lottie_url())), null, null, null, null, null, composer, 0, 62)), AspectRatio3.aspectRatio$default(PaddingKt.m5144paddingVpY3zN4$default(boxScopeInstance.align(companion3, companion.getCenter()), bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer, 0, 0, 0, 2097148);
            composer.endNode();
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getSpaceBetween(), companion.getStart(), composer, 6);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), companion.getStart(), composer, 0);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(promoViewModel.getTitle(), SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, AdvisoryOnboardingSharedComponents.getBookCoverMartinaSmallCompensatingForSmallDevices(bentoTheme.getTypography(composer, i2), composer, 0), composer, 48, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(promoViewModel.getSubtitle(), SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 48, 0, 16380);
            composer.endNode();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
            Screen.Name name = Screen.Name.ADVISORY_ONBOARDING_FEES_PROMO;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion3, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, 45, null), true, false, false, true, false, null, 108, null);
            String label = promoViewModel.getTerms_cta().getLabel();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(context) | composer.changedInstance(promoViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.PromoScreenKt$PromoScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PromoScreen.C88631.invoke$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(context, promoViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, label, modifierAutoLogEvents$default, null, null, false, Color.m6701boximpl(jM21426getFg20d7_KjU), composer, 0, 56);
            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick(function0, composer, 0), promoViewModel.getContinue_cta().getLabel(), SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion3, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 45, null), true, false, false, true, false, null, 108, null), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(Context context, PromoViewModel promoViewModel) {
            WebUtils.viewUrl$default(context, promoViewModel.getTerms_link(), 0, 4, (Object) null);
            return Unit.INSTANCE;
        }
    }
}
