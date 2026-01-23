package com.robinhood.shared.equities.instrumentdetail.p378ui;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AnalystRatingsSummary.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"AnalystRatingsSummary", "", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;", "(Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;Landroidx/compose/runtime/Composer;I)V", "AnalystRatingsPercentageTracks", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState$RatingSummary;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-instrument-detail-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsSummaryKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AnalystRatingsSummary {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingsPercentageTracks$lambda$12(AnalystRatingsComposableState.RatingSummary ratingSummary, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AnalystRatingsPercentageTracks(ratingSummary, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingsSummary$lambda$5(AnalystRatingsComposableState.RatingSummary ratingSummary, int i, Composer composer, int i2) {
        AnalystRatingsSummary(ratingSummary, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AnalystRatingsSummary(AnalystRatingsComposableState.RatingSummary summary, Composer composer, final int i) {
        int i2;
        final AnalystRatingsComposableState.RatingSummary ratingSummary;
        Composer composer2;
        Intrinsics.checkNotNullParameter(summary, "summary");
        Composer composerStartRestartGroup = composer.startRestartGroup(1705063186);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(summary) : composerStartRestartGroup.changedInstance(summary) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ratingSummary = summary;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1705063186, i2, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsSummary (AnalystRatingsSummary.kt:32)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final long jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Intrinsic3.height(companion, Intrinsic4.Max), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(jM21456getPositive0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsSummaryKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnalystRatingsSummary.AnalystRatingsSummary$lambda$4$lambda$1$lambda$0(jM21456getPositive0d7_KjU, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(AspectRatio3.aspectRatio(DrawModifierKt.drawBehind(companion, (Function1) objRememberedValue), 1.0f, true), companion2.getCenterVertically(), false, 2, null);
            long jM21456getPositive0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU();
            BentoText2.m20747BentoText38GnDrw(summary.getMainPercentageText(), modifierWrapContentHeight$default, Color.m6701boximpl(jM21456getPositive0d7_KjU2), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8120);
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Row5.weight$default(row6, SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            int i4 = StringResource.$stable;
            int i5 = i2 & 14;
            AnalystRatingsPercentageTracks(summary, modifierM5143paddingVpY3zN4, composerStartRestartGroup, i4 | i5, 0);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getSpaceBetween(), companion2.getEnd(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ratingSummary = summary;
            BentoText2.m20747BentoText38GnDrw(summary.getBuyPercentageText(), null, Color.m6701boximpl(summary.getBuyColor(composerStartRestartGroup, i4 | i5)), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16378);
            BentoText2.m20747BentoText38GnDrw(ratingSummary.getHoldPercentageText(), null, Color.m6701boximpl(ratingSummary.getHoldColor(composerStartRestartGroup, i4 | i5)), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16378);
            BentoText2.m20747BentoText38GnDrw(ratingSummary.getSellPercentageText(), null, Color.m6701boximpl(ratingSummary.getSellColor(composerStartRestartGroup, i4 | i5)), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16378);
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getSpaceBetween(), companion2.getStart(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default2);
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(ratingSummary.getBuyLabelText(), composerStartRestartGroup, i4), null, Color.m6701boximpl(ratingSummary.getBuyColor(composerStartRestartGroup, i4 | i5)), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(ratingSummary.getHoldLabelText(), composer2, i4), null, Color.m6701boximpl(ratingSummary.getSellColor(composer2, i4 | i5)), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(ratingSummary.getSellLabelText(), composer2, i4), null, Color.m6701boximpl(ratingSummary.getHoldColor(composer2, i4 | i5)), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsSummaryKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnalystRatingsSummary.AnalystRatingsSummary$lambda$5(ratingSummary, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingsSummary$lambda$4$lambda$1$lambda$0(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6947drawCircleVaOC9Bg$default(drawBehind, j, 0.0f, 0L, 0.2f, null, null, 0, 118, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AnalystRatingsPercentageTracks(AnalystRatingsComposableState.RatingSummary ratingSummary, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Object obj;
        boolean z;
        boolean zChanged;
        Object objRememberedValue;
        int i6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final AnalystRatingsComposableState.RatingSummary ratingSummary2 = ratingSummary;
        Composer composerStartRestartGroup = composer.startRestartGroup(230433689);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(ratingSummary2) : composerStartRestartGroup.changedInstance(ratingSummary2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(230433689, i4, -1, "com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsPercentageTracks (AnalystRatingsSummary.kt:108)");
                }
                int i8 = StringResource.$stable;
                i5 = i4 & 14;
                final long buyColor = ratingSummary2.getBuyColor(composerStartRestartGroup, i8 | i5);
                final long holdColor = ratingSummary2.getHoldColor(composerStartRestartGroup, i8 | i5);
                final long sellColor = ratingSummary2.getSellColor(composerStartRestartGroup, i8 | i5);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                final long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21372getBg20d7_KjU();
                Modifier modifier5 = modifier4;
                final float fM21597getXxsmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i9).m21597getXxsmallD9Ej5fM();
                final float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChanged2 = composerStartRestartGroup.changed(fM21597getXxsmallD9Ej5fM) | composerStartRestartGroup.changed(fM21593getSmallD9Ej5fM);
                if (i5 == 4) {
                    if ((i4 & 8) != 0) {
                        obj = ratingSummary;
                        if (composerStartRestartGroup.changedInstance(obj)) {
                        }
                        zChanged = z | zChanged2 | composerStartRestartGroup.changed(jM21372getBg20d7_KjU) | composerStartRestartGroup.changed(buyColor) | composerStartRestartGroup.changed(holdColor) | composerStartRestartGroup.changed(sellColor);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            i6 = i4;
                            ratingSummary2 = ratingSummary;
                            modifier3 = modifier5;
                            Function1 function1 = new Function1() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsSummaryKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AnalystRatingsSummary.AnalystRatingsPercentageTracks$lambda$11$lambda$10(fM21597getXxsmallD9Ej5fM, fM21593getSmallD9Ej5fM, ratingSummary2, jM21372getBg20d7_KjU, buyColor, holdColor, sellColor, (DrawScope) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        } else {
                            ratingSummary2 = obj;
                            i6 = i4;
                            modifier3 = modifier5;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifier3, (Function1) objRememberedValue, composerStartRestartGroup, (i6 >> 3) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        obj = ratingSummary;
                    }
                    z = false;
                    zChanged = z | zChanged2 | composerStartRestartGroup.changed(jM21372getBg20d7_KjU) | composerStartRestartGroup.changed(buyColor) | composerStartRestartGroup.changed(holdColor) | composerStartRestartGroup.changed(sellColor);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        i6 = i4;
                        ratingSummary2 = ratingSummary;
                        modifier3 = modifier5;
                        Function1 function12 = new Function1() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsSummaryKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AnalystRatingsSummary.AnalystRatingsPercentageTracks$lambda$11$lambda$10(fM21597getXxsmallD9Ej5fM, fM21593getSmallD9Ej5fM, ratingSummary2, jM21372getBg20d7_KjU, buyColor, holdColor, sellColor, (DrawScope) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function12);
                        objRememberedValue = function12;
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifier3, (Function1) objRememberedValue, composerStartRestartGroup, (i6 >> 3) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                } else {
                    obj = ratingSummary;
                }
                z = true;
                zChanged = z | zChanged2 | composerStartRestartGroup.changed(jM21372getBg20d7_KjU) | composerStartRestartGroup.changed(buyColor) | composerStartRestartGroup.changed(holdColor) | composerStartRestartGroup.changed(sellColor);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.equities.instrumentdetail.ui.AnalystRatingsSummaryKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AnalystRatingsSummary.AnalystRatingsPercentageTracks$lambda$12(ratingSummary2, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i82 = StringResource.$stable;
            i5 = i4 & 14;
            final long buyColor2 = ratingSummary2.getBuyColor(composerStartRestartGroup, i82 | i5);
            final long holdColor2 = ratingSummary2.getHoldColor(composerStartRestartGroup, i82 | i5);
            final long sellColor2 = ratingSummary2.getSellColor(composerStartRestartGroup, i82 | i5);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            final long jM21372getBg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i92).m21372getBg20d7_KjU();
            Modifier modifier52 = modifier4;
            final float fM21597getXxsmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21597getXxsmallD9Ej5fM();
            final float fM21593getSmallD9Ej5fM2 = bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged22 = composerStartRestartGroup.changed(fM21597getXxsmallD9Ej5fM2) | composerStartRestartGroup.changed(fM21593getSmallD9Ej5fM2);
            if (i5 == 4) {
            }
            z = true;
            zChanged = z | zChanged22 | composerStartRestartGroup.changed(jM21372getBg20d7_KjU2) | composerStartRestartGroup.changed(buyColor2) | composerStartRestartGroup.changed(holdColor2) | composerStartRestartGroup.changed(sellColor2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnalystRatingsPercentageTracks$lambda$11$lambda$10(float f, float f2, AnalystRatingsComposableState.RatingSummary ratingSummary, long j, long j2, long j3, long j4, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f);
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(f2);
        long jM6528constructorimpl = CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) & 4294967295L));
        float f3 = (fIntBitsToFloat2 - fMo5016toPx0680j_42) / 2;
        float buyFraction = ratingSummary.getBuyFraction() * fIntBitsToFloat;
        float holdFraction = fIntBitsToFloat * ratingSummary.getHoldFraction();
        float sellFraction = fIntBitsToFloat * ratingSummary.getSellFraction();
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, RoundRect2.m6573RoundRectsniSvfs(Rect2.m6565Recttz77jQw(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32))), jM6528constructorimpl), null, 2, null);
        Path.addRoundRect$default(Path, RoundRect2.m6573RoundRectsniSvfs(Rect2.m6565Recttz77jQw(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r2) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32))), jM6528constructorimpl), null, 2, null);
        Path.addRoundRect$default(Path, RoundRect2.m6573RoundRectsniSvfs(Rect2.m6565Recttz77jQw(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L))), jM6528constructorimpl), null, 2, null);
        Path Path2 = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path2, RoundRect2.m6570RoundRectZAM2FJo(Rect2.m6565Recttz77jQw(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(buyFraction) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L))), (12 & 2) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : jM6528constructorimpl, (12 & 4) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : 0L, (12 & 8) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : 0L, (12 & 16) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : jM6528constructorimpl), null, 2, null);
        Path Path3 = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path3, RoundRect2.m6570RoundRectZAM2FJo(Rect2.m6565Recttz77jQw(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(holdFraction) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L))), (12 & 2) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : jM6528constructorimpl, (12 & 4) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : 0L, (12 & 8) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : 0L, (12 & 16) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : jM6528constructorimpl), null, 2, null);
        Path Path4 = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path4, RoundRect2.m6570RoundRectZAM2FJo(Rect2.m6565Recttz77jQw(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r2) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(sellFraction) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L))), (12 & 2) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : jM6528constructorimpl, (12 & 4) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : 0L, (12 & 8) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : 0L, (12 & 16) != 0 ? CornerRadius.INSTANCE.m6532getZerokKHJgLs() : jM6528constructorimpl), null, 2, null);
        DrawScope.m6955drawPathLG529CI$default(Canvas, Path, j, 0.0f, null, null, 0, 60, null);
        DrawScope.m6955drawPathLG529CI$default(Canvas, Path2, j2, 0.0f, null, null, 0, 60, null);
        DrawScope.m6955drawPathLG529CI$default(Canvas, Path3, j3, 0.0f, null, null, 0, 60, null);
        DrawScope.m6955drawPathLG529CI$default(Canvas, Path4, j4, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}
