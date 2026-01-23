package com.robinhood.android.optionsrolling.p209ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionsrolling.C24772R;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionRollingNuxComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"OptionRollingNuxComposable", "", "onCloseButtonClicked", "Lkotlin/Function0;", "startRollingButtonClicked", "learnMoreButtonClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-options-rolling_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionRollingNuxComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionRollingNuxComposable$lambda$0(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionRollingNuxComposable(function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionRollingNuxComposable(final Function0<Unit> onCloseButtonClicked, final Function0<Unit> startRollingButtonClicked, final Function0<Unit> learnMoreButtonClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Intrinsics.checkNotNullParameter(startRollingButtonClicked, "startRollingButtonClicked");
        Intrinsics.checkNotNullParameter(learnMoreButtonClicked, "learnMoreButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1769631646);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCloseButtonClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(startRollingButtonClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(learnMoreButtonClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769631646, i3, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable (OptionRollingNuxComposable.kt:37)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1173281062, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.1
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
                            ComposerKt.traceEventStart(1173281062, i5, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous> (OptionRollingNuxComposable.kt:41)");
                        }
                        Function2<Composer, Integer, Unit> function2M17338getLambda$1636095085$feature_options_rolling_externalDebug = OptionRollingNuxComposable.INSTANCE.m17338getLambda$1636095085$feature_options_rolling_externalDebug();
                        final Function0<Unit> function0 = onCloseButtonClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M17338getLambda$1636095085$feature_options_rolling_externalDebug, null, ComposableLambda3.rememberComposableLambda(1966941415, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | ((i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1966941415, i7, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous>.<anonymous> (OptionRollingNuxComposable.kt:44)");
                                }
                                long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU();
                                final Function0<Unit> function02 = function0;
                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21371getBg0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(437534549, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i8) {
                                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(437534549, i8, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous>.<anonymous>.<anonymous> (OptionRollingNuxComposable.kt:47)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer5, BentoAppBarScope.$stable << 12, 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 805306368, 509);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getBiome()), 0L, null, composer3, 390, 0, 1786);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getBiome(), 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-2121480463, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2121480463, i6, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous> (OptionRollingNuxComposable.kt:58)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer3, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                        Function0<Unit> function0 = startRollingButtonClicked;
                        Function0<Unit> function02 = learnMoreButtonClicked;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierWindowInsetsPadding);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(C24772R.drawable.option_rolling_nux_plants, composer3, 0), (String) null, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                        composer3.endNode();
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default2);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 1, null);
                        String strStringResource = StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_title_text, composer3, 0);
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium();
                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 0, 0, 8120);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_subtitle_text, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8120);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_get_started_btn, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, false, null, composer3, 0, 0, 7800);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_learn_more_text, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, BentoButtons.Type.Secondary, false, false, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, false, null, composer3, 24576, 0, 7400);
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, 188);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionRollingNuxComposable3.OptionRollingNuxComposable$lambda$0(onCloseButtonClicked, startRollingButtonClicked, learnMoreButtonClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1173281062, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.1
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
                        ComposerKt.traceEventStart(1173281062, i5, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous> (OptionRollingNuxComposable.kt:41)");
                    }
                    Function2<Composer, Integer, Unit> function2M17338getLambda$1636095085$feature_options_rolling_externalDebug = OptionRollingNuxComposable.INSTANCE.m17338getLambda$1636095085$feature_options_rolling_externalDebug();
                    final Function0<Unit> function0 = onCloseButtonClicked;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M17338getLambda$1636095085$feature_options_rolling_externalDebug, null, ComposableLambda3.rememberComposableLambda(1966941415, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | ((i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1966941415, i7, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous>.<anonymous> (OptionRollingNuxComposable.kt:44)");
                            }
                            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21371getBg0d7_KjU();
                            final Function0<Unit> function02 = function0;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, jM21371getBg0d7_KjU, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(437534549, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i8) {
                                    if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(437534549, i8, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous>.<anonymous>.<anonymous> (OptionRollingNuxComposable.kt:47)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer5, BentoAppBarScope.$stable << 12, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 805306368, 509);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getBiome()), 0L, null, composer3, 390, 0, 1786);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getBiome(), 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-2121480463, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposableKt.OptionRollingNuxComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2121480463, i6, -1, "com.robinhood.android.optionsrolling.ui.OptionRollingNuxComposable.<anonymous> (OptionRollingNuxComposable.kt:58)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer3, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                    Function0<Unit> function0 = startRollingButtonClicked;
                    Function0<Unit> function02 = learnMoreButtonClicked;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierWindowInsetsPadding);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C24772R.drawable.option_rolling_nux_plants, composer3, 0), (String) null, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                    composer3.endNode();
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 7, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_title_text, composer3, 0);
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium();
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 0, 0, 8120);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_subtitle_text, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8120);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_get_started_btn, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU()), null, null, false, null, composer3, 0, 0, 7800);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C24772R.string.options_rolling_nux_learn_more_text, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, BentoButtons.Type.Secondary, false, false, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU()), null, false, null, composer3, 24576, 0, 7400);
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, 188);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
