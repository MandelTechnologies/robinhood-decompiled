package com.robinhood.android.redesigninvesting.highlights.p231ui.card;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.LastTradePriceBar5;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EcEventCard.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"EcEventCard", "", "card", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard$RealHighlightCard$EcEventCard;", "(Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard$RealHighlightCard$EcEventCard;Landroidx/compose/runtime/Composer;I)V", "toColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard$RealHighlightCard$EcEventCard$DayNightColor;", "(Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard$RealHighlightCard$EcEventCard$DayNightColor;Landroidx/compose/runtime/Composer;I)J", "EcEventCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-highlights-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.card.EcEventCardKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class EcEventCard4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EcEventCard$lambda$3(HighlightCard.RealHighlightCard.EcEventCard ecEventCard, int i, Composer composer, int i2) {
        EcEventCard(ecEventCard, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EcEventCardPreview$lambda$6(int i, Composer composer, int i2) {
        EcEventCardPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EcEventCard(final HighlightCard.RealHighlightCard.EcEventCard card, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(card, "card");
        Composer composerStartRestartGroup = composer.startRestartGroup(129187347);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(card) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(129187347, i2, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.EcEventCard (EcEventCard.kt:27)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String shortName = card.getLeftContract().getShortName();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            float f = 0;
            BentoText2.m20747BentoText38GnDrw(shortName, Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8168);
            BentoText2.m20747BentoText38GnDrw(card.getStatus(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8186);
            String shortName2 = card.getRightContract().getShortName();
            long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            TextStyle textS2 = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            FontWeight bold = companion4.getBold();
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(shortName2, Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, bold, null, TextAlign.m7912boximpl(companion5.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, 24576, 0, 8104);
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            BentoText2.m20747BentoText38GnDrw(card.getLeftContract().getScore(), Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            LastTradePriceBar5.m14375LastTradePriceBareopBjH0(card.getProgressForPriceBar(), toColor(card.getLeftContract().getColor(), composerStartRestartGroup, 0), toColor(card.getRightContract().getColor(), composerStartRestartGroup, 0), SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(83)), composerStartRestartGroup, 3072, 0);
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(card.getRightContract().getScore(), Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), null, null, companion4.getBold(), null, TextAlign.m7912boximpl(companion5.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composer2, 24576, 0, 8108);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.EcEventCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EcEventCard4.EcEventCard$lambda$3(card, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final long toColor(HighlightCard.RealHighlightCard.EcEventCard.DayNightColor dayNightColor, Composer composer, int i) {
        Color colorM6701boximpl;
        long jM21425getFg0d7_KjU;
        Intrinsics.checkNotNullParameter(dayNightColor, "<this>");
        composer.startReplaceGroup(-1135341457);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1135341457, i, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.toColor (EcEventCard.kt:89)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        if (bentoTheme.getColors(composer, i2).getIsDay()) {
            composer.startReplaceGroup(-89755038);
            String lightHex = dayNightColor.getLightHex();
            colorM6701boximpl = lightHex != null ? Color.m6701boximpl(Color2.Color(android.graphics.Color.parseColor(lightHex))) : null;
            jM21425getFg0d7_KjU = colorM6701boximpl == null ? bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU() : colorM6701boximpl.getValue();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-89668765);
            String darkHex = dayNightColor.getDarkHex();
            colorM6701boximpl = darkHex != null ? Color.m6701boximpl(Color2.Color(android.graphics.Color.parseColor(darkHex))) : null;
            jM21425getFg0d7_KjU = colorM6701boximpl == null ? bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU() : colorM6701boximpl.getValue();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21425getFg0d7_KjU;
    }

    private static final void EcEventCardPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(363141647);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(363141647, i, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.EcEventCardPreview (EcEventCard.kt:98)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, EcEventCard2.INSTANCE.getLambda$1231006663$lib_highlights_ui_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.EcEventCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EcEventCard4.EcEventCardPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
