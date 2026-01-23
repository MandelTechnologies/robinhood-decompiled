package com.robinhood.android.optionchain.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoSpacing;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: OptionChainListLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"OptionChainListLoadingComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "numberOfRows", "", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "PreviewOptionChainListLoadingComposable", "(Landroidx/compose/runtime/Composer;I)V", "feature-lib-option-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionchain.composable.OptionChainListLoadingComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OptionChainListLoadingComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainListLoadingComposable$lambda$0(Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        OptionChainListLoadingComposable(modifier, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewOptionChainListLoadingComposable$lambda$1(int i, Composer composer, int i2) {
        PreviewOptionChainListLoadingComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionChainListLoadingComposable(final Modifier modifier, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(144050139);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                i = 5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144050139, i4, -1, "com.robinhood.android.optionchain.composable.OptionChainListLoadingComposable (OptionChainListLoadingComposable.kt:22)");
            }
            LocalShowPlaceholder.Loadable(true, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, ComposableLambda3.rememberComposableLambda(-116742069, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionchain.composable.OptionChainListLoadingComposableKt.OptionChainListLoadingComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    Composer composer3 = composer2;
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-116742069, i7, -1, "com.robinhood.android.optionchain.composable.OptionChainListLoadingComposable.<anonymous> (OptionChainListLoadingComposable.kt:27)");
                    }
                    float f = 0.0f;
                    int i8 = 6;
                    int i9 = 1;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1);
                    int i10 = i;
                    int i11 = 0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer3.startReplaceGroup(1455967885);
                    int iCoerceIn = RangesKt.coerceIn(i10, 0, 15);
                    int i12 = 0;
                    while (i12 < iCoerceIn) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, f, i9, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, companion3.getTop(), composer3, i8);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i11);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, i11);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i11);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion2);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        int i13 = iCoerceIn;
                        int i14 = i8;
                        int i15 = i12;
                        BentoText2.m20747BentoText38GnDrw("--- ----", androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, f, BentoSpacing.INSTANCE.m21598default().m21590getDefaultD9Ej5fM(), i9, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getDisplayCapsuleMedium(), composer3, 6, 0, 8188);
                        int i16 = 0;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer3, 0);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, companion2);
                        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                        composer3.startReplaceGroup(1004476376);
                        int i17 = 0;
                        for (int i18 = 2; i17 < i18; i18 = i18) {
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            BentoSpacing.Companion companion6 = BentoSpacing.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, companion6.m21598default().m21590getDefaultD9Ej5fM(), companion6.m21598default().m21590getDefaultD9Ej5fM(), 3, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, i16);
                            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, i16);
                            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor5);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy3, companion7.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion7.getSetModifier());
                            Column6 column63 = Column6.INSTANCE;
                            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion5, 0.0f, companion6.m21598default().m21595getXsmallD9Ej5fM(), 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i19 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw("--------", modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i19).getTextS(), composer3, 6, 0, 8188);
                            BentoText2.m20747BentoText38GnDrw("-------", androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion5, 0.0f, companion6.m21598default().m21595getXsmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i19).getTextS(), composer3, 6, 0, 8188);
                            composer3.endNode();
                            i17++;
                            i16 = i16;
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endNode();
                        Modifier.Companion companion8 = Modifier.INSTANCE;
                        Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion8, 0.0f, BentoSpacing.INSTANCE.m21598default().m21590getDefaultD9Ej5fM(), 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i20 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, modifierM5144paddingVpY3zN4$default2, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i20).getDisplayCapsuleLarge(), composer3, 6, 0, 8188);
                        composer3.endNode();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), bentoTheme2.getColors(composer3, i20).m21373getBg30d7_KjU(), 0.0f, composer3, 6, 4);
                        i12 = i15 + 1;
                        composer3 = composer2;
                        i9 = 1;
                        f = 0.0f;
                        iCoerceIn = i13;
                        i8 = i14;
                        i11 = i16;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionchain.composable.OptionChainListLoadingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainListLoadingComposable3.OptionChainListLoadingComposable$lambda$0(modifier, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewOptionChainListLoadingComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-423798527);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-423798527, i, -1, "com.robinhood.android.optionchain.composable.PreviewOptionChainListLoadingComposable (OptionChainListLoadingComposable.kt:78)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, OptionChainListLoadingComposable.INSTANCE.m16883getLambda$1856985415$feature_lib_option_chain_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionchain.composable.OptionChainListLoadingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainListLoadingComposable3.PreviewOptionChainListLoadingComposable$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
