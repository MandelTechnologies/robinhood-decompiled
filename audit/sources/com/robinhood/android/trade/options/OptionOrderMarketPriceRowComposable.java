package com.robinhood.android.trade.options;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderMarketPriceRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"OptionOrderMarketPriceRowComposable", "", "state", "Lcom/robinhood/android/trade/options/OptionOrderMarketPriceRowState;", "modifier", "Landroidx/compose/ui/Modifier;", "onSubtitleTapped", "Lkotlin/Function0;", "(Lcom/robinhood/android/trade/options/OptionOrderMarketPriceRowState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderMarketPriceRowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOrderMarketPriceRowComposable$lambda$7(OptionOrderMarketPriceRowState optionOrderMarketPriceRowState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionOrderMarketPriceRowComposable(optionOrderMarketPriceRowState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0392  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOrderMarketPriceRowComposable(final OptionOrderMarketPriceRowState state, Modifier modifier, final Function0<Unit> onSubtitleTapped, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSubtitleTapped, "onSubtitleTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1827539358);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSubtitleTapped) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1827539358, i3, -1, "com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposable (OptionOrderMarketPriceRowComposable.kt:24)");
                }
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, OptionOrderSmallDeviceUtil.getOptionOrderRowVerticalPadding(composerStartRestartGroup, 0), 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierAlign = row6.align(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), companion2.getCenterVertically());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOrderMarketPriceRowComposable.OptionOrderMarketPriceRowComposable$lambda$6$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierAlign, false, (Function1) objRememberedValue, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String title = state.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                FontWeight.Companion companion5 = FontWeight.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion5.getNormal(), null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 24576, 0, 8170);
                if (state.isSubtitleTappable()) {
                    composerStartRestartGroup.startReplaceGroup(1996099765);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    BentoText2.m20747BentoText38GnDrw(state.getSubtitle(), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1995225596);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i3 & 896) == 256;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionOrderMarketPriceRowComposable.m2500xc6910c91(onSubtitleTapped);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4893clickableXHw0xAI$default(companion4, false, null, null, (Function0) objRememberedValue2, 7, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(state.getSubtitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), 0L, 0L, companion5.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 8186);
                    composer2 = composerStartRestartGroup;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12), null, bentoTheme.getColors(composer2, i5).m21456getPositive0d7_KjU(), PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composer2, i5).m21595getXsmallD9Ej5fM(), 0.0f, 2, null), null, false, composer2, BentoIcon4.Size12.$stable | 48, 48);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                String value = state.getValue();
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(value, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer3, 24576, 0, 8170);
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOrderMarketPriceRowComposable.OptionOrderMarketPriceRowComposable$lambda$7(state, modifier3, onSubtitleTapped, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, OptionOrderSmallDeviceUtil.getOptionOrderRowVerticalPadding(composerStartRestartGroup, 0), 1, null);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierAlign2 = row62.align(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), companion22.getCenterVertically());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierAlign2, false, (Function1) objRememberedValue, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String title2 = state.getTitle();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU3 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                    TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM();
                    FontWeight.Companion companion52 = FontWeight.INSTANCE;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(title2, null, Color.m6701boximpl(jM21425getFg0d7_KjU3), null, companion52.getNormal(), null, null, 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 24576, 0, 8170);
                    if (state.isSubtitleTappable()) {
                    }
                    composer2.endNode();
                    String value2 = state.getValue();
                    long jM21425getFg0d7_KjU22 = bentoTheme2.getColors(composer2, i52).m21425getFg0d7_KjU();
                    composer3 = composer2;
                    BentoText2.m20747BentoText38GnDrw(value2, null, Color.m6701boximpl(jM21425getFg0d7_KjU22), null, companion52.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextM(), composer3, 24576, 0, 8170);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOrderMarketPriceRowComposable$lambda$6$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionOrderMarketPriceRowComposable$lambda$6$lambda$5$lambda$3$lambda$2 */
    public static final Unit m2500xc6910c91(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
