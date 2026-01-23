package com.robinhood.android.investmentstracker.composables;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.media3.exoplayer.ExoPlayer;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingFirstPageDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingSecondPageDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OnboardingScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001aM\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"OnboardingScreenPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "OnboardingScreen", "viewModel", "Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "showExoPlayer", "", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "secondExoPlayer", "context", "Landroid/content/Context;", "(Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;Landroidx/compose/ui/Modifier;ZLandroidx/media3/exoplayer/ExoPlayer;Landroidx/media3/exoplayer/ExoPlayer;Landroid/content/Context;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.OnboardingScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OnboardingScreen5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingScreen$lambda$10(OnboardingViewModel onboardingViewModel, Modifier modifier, boolean z, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, Context context, int i, int i2, Composer composer, int i3) {
        OnboardingScreen(onboardingViewModel, modifier, z, exoPlayer, exoPlayer2, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingScreenPreview$lambda$0(int i, Composer composer, int i2) {
        OnboardingScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final void OnboardingScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-130850894);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-130850894, i, -1, "com.robinhood.android.investmentstracker.composables.OnboardingScreenPreview (OnboardingScreen.kt:47)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, OnboardingScreen2.INSTANCE.m15562getLambda$1000450710$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.OnboardingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingScreen5.OnboardingScreenPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingScreen(final OnboardingViewModel viewModel, Modifier modifier, boolean z, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, Context context, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        ExoPlayer exoPlayer3;
        int i6;
        ExoPlayer exoPlayer4;
        int i7;
        Context context2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        final boolean z3;
        ExoPlayer exoPlayer5;
        Context context3;
        ExoPlayer exoPlayer6;
        final ExoPlayer exoPlayer7;
        final Context context4;
        final ExoPlayer exoPlayer8;
        final Modifier modifier4;
        ExoPlayer exoPlayer9;
        long jM21427getFg30d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1968025369);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        exoPlayer3 = exoPlayer;
                        i3 |= composerStartRestartGroup.changedInstance(exoPlayer3) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            exoPlayer4 = exoPlayer2;
                            i3 |= composerStartRestartGroup.changedInstance(exoPlayer4) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 == 0) {
                            if ((196608 & i) == 0) {
                                context2 = context;
                                i3 |= composerStartRestartGroup.changedInstance(context2) ? 131072 : 65536;
                            }
                            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                if (i5 != 0) {
                                    exoPlayer3 = null;
                                }
                                if (i6 != 0) {
                                    exoPlayer4 = null;
                                }
                                if (i7 != 0) {
                                    context2 = null;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1968025369, i3, -1, "com.robinhood.android.investmentstracker.composables.OnboardingScreen (OnboardingScreen.kt:86)");
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor);
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                if (viewModel.getCurrentPage() != 0) {
                                    composerStartRestartGroup.startReplaceGroup(-1260823895);
                                    final InvestmentsTrackerOnboardingFirstPageDto first_page = viewModel.getData().getFirst_page();
                                    if (first_page == null) {
                                        modifier3 = modifier5;
                                        z3 = z2;
                                        exoPlayer9 = exoPlayer3;
                                        exoPlayer5 = exoPlayer4;
                                        context3 = context2;
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(first_page);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.OnboardingScreenKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Integer.valueOf(OnboardingScreen5.OnboardingScreen$lambda$9$lambda$6$lambda$2$lambda$1(first_page));
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 3);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion.getCenterHorizontally(), composerStartRestartGroup, 54);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor2);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        modifier3 = modifier5;
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                        final boolean z4 = z2;
                                        final ExoPlayer exoPlayer10 = exoPlayer3;
                                        final ExoPlayer exoPlayer11 = exoPlayer4;
                                        final Context context5 = context2;
                                        Function4<PagerScope, Integer, Composer, Integer, Unit> function4 = new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.OnboardingScreenKt$OnboardingScreen$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                                                invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PagerScope HorizontalPager, int i9, Composer composer2, int i10) {
                                                Screen.Name name;
                                                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(540962939, i10, -1, "com.robinhood.android.investmentstracker.composables.OnboardingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingScreen.kt:105)");
                                                }
                                                if (i9 == 0) {
                                                    name = Screen.Name.INVESTMENTS_TRACKER_FTUX_TRACK_ALL_ASSETS;
                                                } else {
                                                    name = Screen.Name.INVESTMENTS_TRACKER_FTUX_ASSET_ALLOCATION;
                                                }
                                                Screen.Name name2 = name;
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion4, new UserInteractionEventDescriptor(null, new Screen(name2, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                                InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto = first_page;
                                                Context context6 = context5;
                                                boolean z5 = z4;
                                                ExoPlayer exoPlayer12 = exoPlayer10;
                                                ExoPlayer exoPlayer13 = exoPlayer11;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor3);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                                Column6 column62 = Column6.INSTANCE;
                                                composer2.startReplaceGroup(-443879659);
                                                if (investmentsTrackerOnboardingFirstPageDto.getCarousel_items().get(i9).getImage_url().length() > 0 && context6 != null) {
                                                    AnimatedContentKt.AnimatedContent(Boolean.valueOf(z5), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(400)), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), null, null, null, null, ComposableLambda3.rememberComposableLambda(-386002609, true, new OnboardingScreen7(context6, i9, exoPlayer12, exoPlayer13), composer2, 54), composer2, 1572864, 60);
                                                }
                                                composer2.endReplaceGroup();
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i11 = BentoTheme.$stable;
                                                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i11).m21593getSmallD9Ej5fM());
                                                String title = investmentsTrackerOnboardingFirstPageDto.getCarousel_items().get(i9).getTitle();
                                                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer2, i11).getDisplayCapsuleLarge();
                                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i11).m21425getFg0d7_KjU();
                                                TextAlign.Companion companion6 = TextAlign.INSTANCE;
                                                BentoText2.m20747BentoText38GnDrw(title, modifierM5145paddingqDBjuR0, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8120);
                                                BentoText2.m20747BentoText38GnDrw(investmentsTrackerOnboardingFirstPageDto.getCarousel_items().get(i9).getDescription(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), 0.0f, 10, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i11).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i11).getTextM(), composer2, 0, 0, 8120);
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        };
                                        context3 = context5;
                                        z3 = z4;
                                        exoPlayer9 = exoPlayer10;
                                        exoPlayer5 = exoPlayer11;
                                        PagerKt.m5301HorizontalPager8jOkeI(pagerStateRememberPagerState, null, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(540962939, true, function4, composerStartRestartGroup, 54), composerStartRestartGroup, 0, 24576, 16382);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5090spacedByD5KLDUw(bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), companion.getCenterHorizontally()), companion.getTop(), composerStartRestartGroup, 0);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor3);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(380789228);
                                        int pageCount = pagerStateRememberPagerState.getPageCount();
                                        for (int i10 = 0; i10 < pageCount; i10++) {
                                            if (pagerStateRememberPagerState.getCurrentPage() == i10) {
                                                composerStartRestartGroup.startReplaceGroup(-203935872);
                                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                composerStartRestartGroup.startReplaceGroup(-203846561);
                                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                                                composerStartRestartGroup.endReplaceGroup();
                                            }
                                            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(6)), RoundedCornerShape2.getCircleShape()), jM21427getFg30d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endNode();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    exoPlayer6 = exoPlayer9;
                                } else {
                                    modifier3 = modifier5;
                                    z3 = z2;
                                    ExoPlayer exoPlayer12 = exoPlayer3;
                                    exoPlayer5 = exoPlayer4;
                                    context3 = context2;
                                    composerStartRestartGroup.startReplaceGroup(-1255342909);
                                    InvestmentsTrackerOnboardingSecondPageDto second_page = viewModel.getData().getSecond_page();
                                    if (second_page == null) {
                                        exoPlayer6 = exoPlayer12;
                                    } else {
                                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                                        Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor4);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                                        String title = second_page.getTitle();
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i11 = BentoTheme.$stable;
                                        exoPlayer6 = exoPlayer12;
                                        BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i11).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8120);
                                        String disclosure_metadata = second_page.getDisclosure_metadata();
                                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i11).getTextM(), 0, bentoTheme2.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 26);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        BentoMarkdownText2.BentoMarkdownText(disclosure_metadata, SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 24);
                                        composerStartRestartGroup.endNode();
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                exoPlayer7 = exoPlayer6;
                                context4 = context3;
                                exoPlayer8 = exoPlayer5;
                                modifier4 = modifier3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                z3 = z2;
                                exoPlayer7 = exoPlayer3;
                                exoPlayer8 = exoPlayer4;
                                context4 = context2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.OnboardingScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return OnboardingScreen5.OnboardingScreen$lambda$10(viewModel, modifier4, z3, exoPlayer7, exoPlayer8, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        context2 = context;
                        if ((74899 & i3) == 74898) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.Vertical top2 = arrangement2.getTop();
                            Alignment.Companion companion5 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                if (viewModel.getCurrentPage() != 0) {
                                }
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                exoPlayer7 = exoPlayer6;
                                context4 = context3;
                                exoPlayer8 = exoPlayer5;
                                modifier4 = modifier3;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    exoPlayer4 = exoPlayer2;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    context2 = context;
                    if ((74899 & i3) == 74898) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                exoPlayer3 = exoPlayer;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                exoPlayer4 = exoPlayer2;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                context2 = context;
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exoPlayer3 = exoPlayer;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            exoPlayer4 = exoPlayer2;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            context2 = context;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exoPlayer3 = exoPlayer;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        exoPlayer4 = exoPlayer2;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        context2 = context;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OnboardingScreen$lambda$9$lambda$6$lambda$2$lambda$1(InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto) {
        return investmentsTrackerOnboardingFirstPageDto.getCarousel_items().size();
    }
}
