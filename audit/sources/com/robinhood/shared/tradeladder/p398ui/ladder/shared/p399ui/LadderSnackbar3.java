package com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderSnackbar.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u000b\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006\f"}, m3636d2 = {"LADDER_STANDARD_PADDING", "Landroidx/compose/ui/unit/Dp;", "getLADDER_STANDARD_PADDING", "()F", "F", "LadderSnackbar", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderSnackbarVisuals;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderSnackbarVisuals;Landroidx/compose/runtime/Composer;I)V", "PreviewLadderSnackbarLong", "(Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbarKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderSnackbar3 {
    private static final float LADDER_STANDARD_PADDING = C2002Dp.m7995constructorimpl(12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderSnackbar$lambda$7(LadderSnackbarVisuals ladderSnackbarVisuals, int i, Composer composer, int i2) {
        LadderSnackbar(ladderSnackbarVisuals, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderSnackbarLong$lambda$8(int i, Composer composer, int i2) {
        PreviewLadderSnackbarLong(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final float getLADDER_STANDARD_PADDING() {
        return LADDER_STANDARD_PADDING;
    }

    public static final void LadderSnackbar(final LadderSnackbarVisuals data, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        final LadderSnackbarVisuals ladderSnackbarVisuals;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(482535491);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(data) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ladderSnackbarVisuals = data;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(482535491, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbar (LadderSnackbar.kt:28)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null), BentoColor.INSTANCE.m21298getNightElevatedBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), LADDER_STANDARD_PADDING), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            ServerToBentoAssetMapper2 icon = data.getIcon();
            composerStartRestartGroup.startReplaceGroup(-1348565823);
            if (icon == null) {
                i3 = i5;
                z = true;
                z2 = false;
            } else {
                i3 = i5;
                z = true;
                z2 = false;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(icon), null, bentoTheme.getColors(composerStartRestartGroup, i5).getNova(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            StringResource startText = data.getStartText();
            int i6 = StringResource.$stable;
            Modifier.Companion companion3 = companion;
            int i7 = i3;
            int i8 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(startText, composerStartRestartGroup, i6), Row5.weight$default(row6, companion, 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            StringResource actionText = data.getActionText();
            composerStartRestartGroup.startReplaceGroup(-1348547645);
            if (actionText == null) {
                i4 = 5004770;
            } else {
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                companion3 = companion3;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = (i8 & 14) == 4 ? z : z2;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderSnackbar3.LadderSnackbar$lambda$6$lambda$3$lambda$2$lambda$1(data);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null);
                i4 = 5004770;
                BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(actionText, composerStartRestartGroup, i6), modifierM4893clickableXHw0xAI$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21456getPositive0d7_KjU()), null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 221184, 0, 8136);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1348530086);
            if (data.getWithDismissAction()) {
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceGroup(i4);
                boolean z4 = (i8 & 14) == 4 ? z : z2;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    ladderSnackbarVisuals = data;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderSnackbar3.LadderSnackbar$lambda$6$lambda$5$lambda$4(ladderSnackbarVisuals);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    ladderSnackbarVisuals = data;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), null, bentoTheme.getColors(composerStartRestartGroup, i7).getNova(), ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default2, false, null, null, (Function0) objRememberedValue2, 7, null), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 48);
            } else {
                ladderSnackbarVisuals = data;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSnackbar3.LadderSnackbar$lambda$7(ladderSnackbarVisuals, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderSnackbar$lambda$6$lambda$3$lambda$2$lambda$1(LadderSnackbarVisuals ladderSnackbarVisuals) {
        Function0<Unit> onActionClicked = ladderSnackbarVisuals.getOnActionClicked();
        if (onActionClicked != null) {
            onActionClicked.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderSnackbar$lambda$6$lambda$5$lambda$4(LadderSnackbarVisuals ladderSnackbarVisuals) {
        Function0<Unit> onDismissClicked = ladderSnackbarVisuals.getOnDismissClicked();
        if (onDismissClicked != null) {
            onDismissClicked.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void PreviewLadderSnackbarLong(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-756662927);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-756662927, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.PreviewLadderSnackbarLong (LadderSnackbar.kt:95)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, LadderSnackbar.INSTANCE.m26295getLambda$1626262743$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderSnackbarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderSnackbar3.PreviewLadderSnackbarLong$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
