package com.robinhood.android.optionsupgrade;

import android.annotation.SuppressLint;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.optionsupgrade.SplashPageImprovement;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBarState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingUpsellSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002"}, m3636d2 = {"OptionOnboardingUpsellSplashComposable", "", "splashData", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement;", "buttonBarData", "Lcom/robinhood/compose/bento/component/BentoButtonBarState;", "inlineLinkTextOnClick", "Lkotlin/Function0;", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/optionsupgrade/SplashPageImprovement;Lcom/robinhood/compose/bento/component/BentoButtonBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-upgrade_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellSplashComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingUpsellSplashComposable$lambda$0(SplashPageImprovement splashPageImprovement, BentoButtonBarState bentoButtonBarState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionOnboardingUpsellSplashComposable(splashPageImprovement, bentoButtonBarState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOnboardingUpsellSplashComposable(final SplashPageImprovement splashData, final BentoButtonBarState buttonBarData, final Function0<Unit> inlineLinkTextOnClick, final Function0<Unit> onPrimaryButtonClicked, final Function0<Unit> onSecondaryButtonClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(splashData, "splashData");
        Intrinsics.checkNotNullParameter(buttonBarData, "buttonBarData");
        Intrinsics.checkNotNullParameter(inlineLinkTextOnClick, "inlineLinkTextOnClick");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClicked, "onPrimaryButtonClicked");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClicked, "onSecondaryButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1003046479);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(splashData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(buttonBarData) : composerStartRestartGroup.changedInstance(buttonBarData) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(inlineLinkTextOnClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClicked) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1003046479, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposable (OptionOnboardingUpsellSplashComposable.kt:52)");
                }
                final Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL, null, null, null, 14, null), null, null, null, null, 61, null)), null, ComposableLambda3.rememberComposableLambda(1950740812, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt.OptionOnboardingUpsellSplashComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1950740812, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposable.<anonymous> (OptionOnboardingUpsellSplashComposable.kt:55)");
                        }
                        BentoButtonBar2.BentoButtonBar(buttonBarData, WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composer3, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), inlineLinkTextOnClick, onPrimaryButtonClicked, onSecondaryButtonClicked, composer3, BentoButtonBarState.$stable, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1554911934, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt.OptionOnboardingUpsellSplashComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues padding, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(padding, "padding");
                        if ((i5 & 6) == 0) {
                            i5 |= composer3.changed(padding) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1554911934, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposable.<anonymous> (OptionOnboardingUpsellSplashComposable.kt:77)");
                        }
                        Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingKt.m5138PaddingValuesa9UjIt4(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getTop(), ((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getBottom()));
                        Alignment center = Alignment.INSTANCE.getCenter();
                        final SplashPageImprovement splashPageImprovement = splashData;
                        BoxWithConstraints.BoxWithConstraints(modifierPadding, center, false, ComposableLambda3.rememberComposableLambda(-2041823208, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt.OptionOnboardingUpsellSplashComposable.2.1
                            private static final LottieComposition invoke$lambda$2$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                                return lottieCompositionResult.getValue();
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer4, Integer num) {
                                invoke(boxWithConstraints4, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i6 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2041823208, i6, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposable.<anonymous>.<anonymous> (OptionOnboardingUpsellSplashComposable.kt:89)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                SplashPageImprovement splashPageImprovement2 = splashPageImprovement;
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, companion2.getStart(), composer4, 6);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                String title = splashPageImprovement2.getTitle();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i7).getDisplayCapsuleMedium();
                                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, "title_tag"), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer4, 48, 0, 8124);
                                BentoText2.m20747BentoText38GnDrw(splashPageImprovement2.getSummary(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, OptionOnboardingImprovementSplashComposable3.DESCRIPTION_NO_LEARN_MORE_TAG), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composer4, i7).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i7).getTextM(), composer4, 0, 0, 8120);
                                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composer4, i7).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                SplashPageImprovement.Creative creative = splashPageImprovement2.getCreative();
                                composer4.startReplaceGroup(-1865371151);
                                if (creative instanceof SplashPageImprovement.Creative.RemoteLottie) {
                                    LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(((SplashPageImprovement.Creative.RemoteLottie) splashPageImprovement2.getCreative()).getLottieUrl().getUrl().getUrl())), null, null, null, null, null, composer4, 0, 62);
                                    LottieAnimation2.LottieAnimation(invoke$lambda$2$lambda$1$lambda$0(lottieCompositionResultRememberLottieComposition), SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, OptionOnboardingImprovementSplashComposable3.CREATIVE_LOTTIE_TAG), 0.0f, 1, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer4, 1572912, 196608, 0, 2064316);
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306752, 506);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOnboardingUpsellSplashComposable.OptionOnboardingUpsellSplashComposable$lambda$0(splashData, buttonBarData, inlineLinkTextOnClick, onPrimaryButtonClicked, onSecondaryButtonClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL, null, null, null, 14, null), null, null, null, null, 61, null)), null, ComposableLambda3.rememberComposableLambda(1950740812, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt.OptionOnboardingUpsellSplashComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1950740812, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposable.<anonymous> (OptionOnboardingUpsellSplashComposable.kt:55)");
                    }
                    BentoButtonBar2.BentoButtonBar(buttonBarData, WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier52, 0.0f, 1, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composer3, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), inlineLinkTextOnClick, onPrimaryButtonClicked, onSecondaryButtonClicked, composer3, BentoButtonBarState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1554911934, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt.OptionOnboardingUpsellSplashComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues padding, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(padding, "padding");
                    if ((i5 & 6) == 0) {
                        i5 |= composer3.changed(padding) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1554911934, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposable.<anonymous> (OptionOnboardingUpsellSplashComposable.kt:77)");
                    }
                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(modifier52, 0.0f, 1, null), androidx.compose.foundation.layout.PaddingKt.m5138PaddingValuesa9UjIt4(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getTop(), ((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), padding.getBottom()));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    final SplashPageImprovement splashPageImprovement = splashData;
                    BoxWithConstraints.BoxWithConstraints(modifierPadding, center, false, ComposableLambda3.rememberComposableLambda(-2041823208, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposableKt.OptionOnboardingUpsellSplashComposable.2.1
                        private static final LottieComposition invoke$lambda$2$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
                            return lottieCompositionResult.getValue();
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer4, Integer num) {
                            invoke(boxWithConstraints4, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer4, int i6) {
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i6 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2041823208, i6, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellSplashComposable.<anonymous>.<anonymous> (OptionOnboardingUpsellSplashComposable.kt:89)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            SplashPageImprovement splashPageImprovement2 = splashPageImprovement;
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, companion2.getStart(), composer4, 6);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String title = splashPageImprovement2.getTitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i7).getDisplayCapsuleMedium();
                            TextAlign.Companion companion4 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, "title_tag"), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer4, 48, 0, 8124);
                            BentoText2.m20747BentoText38GnDrw(splashPageImprovement2.getSummary(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, OptionOnboardingImprovementSplashComposable3.DESCRIPTION_NO_LEARN_MORE_TAG), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composer4, i7).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i7).getTextM(), composer4, 0, 0, 8120);
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composer4, i7).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            SplashPageImprovement.Creative creative = splashPageImprovement2.getCreative();
                            composer4.startReplaceGroup(-1865371151);
                            if (creative instanceof SplashPageImprovement.Creative.RemoteLottie) {
                                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(((SplashPageImprovement.Creative.RemoteLottie) splashPageImprovement2.getCreative()).getLottieUrl().getUrl().getUrl())), null, null, null, null, null, composer4, 0, 62);
                                LottieAnimation2.LottieAnimation(invoke$lambda$2$lambda$1$lambda$0(lottieCompositionResultRememberLottieComposition), SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, OptionOnboardingImprovementSplashComposable3.CREATIVE_LOTTIE_TAG), 0.0f, 1, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composer4, 1572912, 196608, 0, 2064316);
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306752, 506);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
