package com.robinhood.android.advisory.insights.detail;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
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
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.insights.C8770R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryInsightTwoBarChart.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a?\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"AdvisoryInsightTwoBarChart", "", "chartModel", "Lcom/robinhood/android/advisory/insights/detail/TwoBarChartModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/insights/detail/TwoBarChartModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BarView", "image", "Landroidx/compose/ui/graphics/painter/Painter;", "leadingLabel", "", "trailingLabel", "trailingColor", "Landroidx/compose/ui/graphics/Color;", "widthFraction", "", "showBars", "", "BarView-uDo3WH8", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Ljava/lang/String;JFZLandroidx/compose/runtime/Composer;I)V", "feature-advisory-insights_externalDebug", "animatedFraction"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightTwoBarChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightTwoBarChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryInsightTwoBarChart$lambda$5(TwoBarChartModel twoBarChartModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryInsightTwoBarChart(twoBarChartModel, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BarView_uDo3WH8$lambda$8(Painter painter, String str, String str2, long j, float f, boolean z, int i, Composer composer, int i2) {
        m11050BarViewuDo3WH8(painter, str, str2, j, f, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryInsightTwoBarChart(final TwoBarChartModel chartModel, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartModel, "chartModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1105555288);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1105555288, i3, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightTwoBarChart (AdvisoryInsightTwoBarChart.kt:42)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(!isDay ? C8770R.drawable.advisory_insight_gray_bar_light_mode : C8770R.drawable.advisory_insight_gray_bar_dark_mode, composerStartRestartGroup, 0);
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(!isDay ? C8770R.drawable.advisory_insight_purple_bar_light_mode : C8770R.drawable.advisory_insight_purple_bar_dark_mode, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                long jColor = Color2.Color(4290274795L);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(28);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5091spacedByD5KLDUw(fM7995constructorimpl, companion2.getCenterVertically()), companion2.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier4 = modifier3;
                m11050BarViewuDo3WH8(painterPainterResource, chartModel.getChartDetails().getOldLabel(), chartModel.getChartDetails().getOldValueLabel(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), chartModel.getTopBarRatio(), AdvisoryInsightTwoBarChart$lambda$1(snapshotState), composerStartRestartGroup, 0);
                m11050BarViewuDo3WH8(painterPainterResource2, chartModel.getChartDetails().getNewLabel(), chartModel.getChartDetails().getNewValueLabel(), jColor, chartModel.getBottomBarRatio(), AdvisoryInsightTwoBarChart$lambda$1(snapshotState), composerStartRestartGroup, 3072);
                composerStartRestartGroup.endNode();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new AdvisoryInsightTwoBarChart2(snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightTwoBarChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryInsightTwoBarChart.AdvisoryInsightTwoBarChart$lambda$5(chartModel, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            boolean isDay2 = bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay();
            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(!isDay2 ? C8770R.drawable.advisory_insight_gray_bar_light_mode : C8770R.drawable.advisory_insight_gray_bar_dark_mode, composerStartRestartGroup, 0);
            Painter painterPainterResource22 = PainterResources_androidKt.painterResource(!isDay2 ? C8770R.drawable.advisory_insight_purple_bar_light_mode : C8770R.drawable.advisory_insight_purple_bar_dark_mode, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            long jColor2 = Color2.Color(4290274795L);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(28);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.m5091spacedByD5KLDUw(fM7995constructorimpl2, companion22.getCenterVertically()), companion22.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifier42 = modifier3;
                m11050BarViewuDo3WH8(painterPainterResource3, chartModel.getChartDetails().getOldLabel(), chartModel.getChartDetails().getOldValueLabel(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), chartModel.getTopBarRatio(), AdvisoryInsightTwoBarChart$lambda$1(snapshotState2), composerStartRestartGroup, 0);
                m11050BarViewuDo3WH8(painterPainterResource22, chartModel.getChartDetails().getNewLabel(), chartModel.getChartDetails().getNewValueLabel(), jColor2, chartModel.getBottomBarRatio(), AdvisoryInsightTwoBarChart$lambda$1(snapshotState2), composerStartRestartGroup, 3072);
                composerStartRestartGroup.endNode();
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvisoryInsightTwoBarChart$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean AdvisoryInsightTwoBarChart$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float BarView_uDo3WH8$lambda$7$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* renamed from: BarView-uDo3WH8, reason: not valid java name */
    private static final void m11050BarViewuDo3WH8(final Painter painter, final String str, final String str2, final long j, final float f, final boolean z, Composer composer, final int i) {
        Painter painter2;
        int i2;
        String str3;
        String str4;
        float f2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1657185113);
        if ((i & 6) == 0) {
            painter2 = painter;
            i2 = (composerStartRestartGroup.changedInstance(painter2) ? 4 : 2) | i;
        } else {
            painter2 = painter;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f2 = f;
            i2 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1657185113, i2, -1, "com.robinhood.android.advisory.insights.detail.BarView (AdvisoryInsightTwoBarChart.kt:105)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            ImageKt.Image(painter2, (String) null, SizeKt.fillMaxWidth(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(44)), BarView_uDo3WH8$lambda$7$lambda$6(AnimateAsState.animateFloatAsState(z ? f2 : 0.0f, AnimationSpecKt.tween$default(1200, 200, null, 4, null), 0.0f, "bar width fraction", null, composerStartRestartGroup, 3120, 20))), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, (i2 & 14) | 24624, 104);
            composer2 = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer2, 0);
            final String str5 = str3;
            final String str6 = str4;
            final float f3 = f2;
            AnimatedVisibilityKt.AnimatedVisibility(column6, z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(600, 1200, null, 4, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1404908185, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightTwoBarChartKt$BarView$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                    invoke(animatedVisibilityScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1404908185, i3, -1, "com.robinhood.android.advisory.insights.detail.BarView.<anonymous>.<anonymous> (AdvisoryInsightTwoBarChart.kt:133)");
                    }
                    final String str7 = str5;
                    final String str8 = str6;
                    final float f4 = f3;
                    final long j2 = j;
                    BoxWithConstraints.BoxWithConstraints(null, null, false, ComposableLambda3.rememberComposableLambda(-804439421, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightTwoBarChartKt$BarView$1$1.1
                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer4, int i4) {
                            int i5;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i4 & 6) == 0) {
                                i5 = i4 | (composer4.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i5 = i4;
                            }
                            if ((i5 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-804439421, i5, -1, "com.robinhood.android.advisory.insights.detail.BarView.<anonymous>.<anonymous>.<anonymous> (AdvisoryInsightTwoBarChart.kt:134)");
                            }
                            Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                            TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composer4, 0, 1);
                            AnnotatedString annotatedString = new AnnotatedString(str7, null, 2, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            int size = (int) (TextMeasurer.m7624measurexDpz5zY$default(textMeasurerRememberTextMeasurer, annotatedString, bentoTheme.getTypography(composer4, i6).getTextM(), 0, false, 0, null, 0L, null, null, null, false, 2044, null).getSize() >> 32);
                            AnnotatedString annotatedString2 = new AnnotatedString(str8, null, 2, null);
                            TextStyle textM = bentoTheme.getTypography(composer4, i6).getTextM();
                            FontWeight.Companion companion3 = FontWeight.INSTANCE;
                            int size2 = size + ((int) (TextMeasurer.m7624measurexDpz5zY$default(textMeasurerRememberTextMeasurer, annotatedString2, TextStyle.m7655copyp1EtxEg$default(textM, 0L, 0L, companion3.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 0, false, 0, null, 0L, null, null, null, false, 2044, null).getSize() >> 32));
                            composer4.startReplaceGroup(27851333);
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(density.mo5013toDpu2uoSUM(size2) + bentoTheme.getSpacing(composer4, i6).m21593getSmallD9Ej5fM());
                            composer4.endReplaceGroup();
                            float value = ((C2002Dp) ComparisonsKt.maxOf(C2002Dp.m7993boximpl(density.mo5012toDpu2uoSUM(f4 * Constraints.m7975getMaxWidthimpl(BoxWithConstraints.getConstraints()))), C2002Dp.m7993boximpl(fM7995constructorimpl))).getValue();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion4, value);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            String str9 = str7;
                            String str10 = str8;
                            long j3 = j2;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5174width3ABfNKs);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(str9, null, Color.m6701boximpl(bentoTheme.getColors(composer4, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i6).getTextM(), composer4, 805306368, 0, 7674);
                            Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composer4, 0);
                            BentoText2.m20747BentoText38GnDrw(str10, null, Color.m6701boximpl(j3), null, null, null, null, 0, false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer4, i6).getTextM(), 0L, 0L, companion3.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 805306368, 0, 7674);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer4, Integer num) {
                            invoke(boxWithConstraints4, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer3, 54), composer3, 3072, 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 1575942 | ((i2 >> 12) & 112), 26);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightTwoBarChartKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryInsightTwoBarChart.BarView_uDo3WH8$lambda$8(painter, str, str2, j, f, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
