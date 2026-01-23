package com.robinhood.shared.crypto.staking.staking.summary;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.summary.CryptoStakingSummaryViewState;
import com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChart4;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: StakingSummaryChart.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"StakingSummaryChart", "", "chartState", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BreakdownRow", AnnotatedPrivateKey.LABEL, "", "legendBrush", "Landroidx/compose/ui/graphics/Brush;", "entry", "Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState$Entry;", "(Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;Lcom/robinhood/shared/crypto/staking/staking/summary/CryptoStakingSummaryViewState$ChartState$Entry;Landroidx/compose/runtime/Composer;I)V", "LoadingChart", "(Landroidx/compose/runtime/Composer;I)V", "ChartPreviewLoading", "ChartPreviewDay", "ChartPreviewNight", "ChartPreviewMinWidth", "ChartPreview", "isDay", "", "percentage", "", "(ZFLandroidx/compose/runtime/Composer;I)V", "ChartHeight", "", "BreakdownLegendSize", "feature-crypto-staking_externalDebug", "animateChart", "stakedPercentage"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class StakingSummaryChart4 {
    private static final int BreakdownLegendSize = 16;
    private static final int ChartHeight = 24;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BreakdownRow$lambda$11(String str, Brush brush, CryptoStakingSummaryViewState.ChartState.Entry entry, int i, Composer composer, int i2) {
        BreakdownRow(str, brush, entry, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartPreview$lambda$18(boolean z, float f, int i, Composer composer, int i2) {
        ChartPreview(z, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartPreviewDay$lambda$15(int i, Composer composer, int i2) {
        ChartPreviewDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartPreviewLoading$lambda$14(int i, Composer composer, int i2) {
        ChartPreviewLoading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartPreviewMinWidth$lambda$17(int i, Composer composer, int i2) {
        ChartPreviewMinWidth(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartPreviewNight$lambda$16(int i, Composer composer, int i2) {
        ChartPreviewNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingChart$lambda$13(int i, Composer composer, int i2) {
        LoadingChart(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StakingSummaryChart$lambda$0(CryptoStakingSummaryViewState.ChartState chartState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StakingSummaryChart(chartState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StakingSummaryChart$lambda$10(CryptoStakingSummaryViewState.ChartState chartState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StakingSummaryChart(chartState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StakingSummaryChart(final CryptoStakingSummaryViewState.ChartState chartState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(42721629);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(chartState) ? 4 : 2) | i;
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
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(42721629, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChart (StakingSummaryChart.kt:43)");
                }
                composerStartRestartGroup.startReplaceGroup(-1894182974);
                if (chartState != null) {
                    LoadingChart(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return StakingSummaryChart4.StakingSummaryChart$lambda$0(chartState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                float stakedPercentage = chartState.getStakedPercentage();
                if (stakedPercentage > 0.0f) {
                    stakedPercentage = RangesKt.coerceAtLeast(stakedPercentage, 0.02f);
                }
                if (!StakingSummaryChart$lambda$2(snapshotState)) {
                    stakedPercentage = 0.0f;
                }
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(stakedPercentage, AnimationSpecKt.tween$default(500, 0, new CubicBezierEasing(0.33f, 0.0f, 0.17f, 1.0f), 2, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                final long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU();
                final long jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                final long neon = bentoTheme.getColors(composerStartRestartGroup, i5).getNeon();
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Modifier modifier4 = modifier3;
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(24));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChanged = composerStartRestartGroup.changed(jM21372getBg20d7_KjU) | composerStartRestartGroup.changed(jM21456getPositive0d7_KjU) | composerStartRestartGroup.changed(neon) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StakingSummaryChart4.StakingSummaryChart$lambda$8$lambda$7$lambda$6(jM21372getBg20d7_KjU, jM21456getPositive0d7_KjU, neon, snapshotState4AnimateFloatAsState, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierM5156height3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                StringResource.Companion companion4 = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion4.invoke(C37760R.string.staking_summary_chart_entry_label_staked, new Object[0]);
                int i6 = StringResource.$stable;
                BreakdownRow(StringResources6.getText(stringResourceInvoke, composerStartRestartGroup, i6).toString(), Brush.Companion.m6677horizontalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getNeon()))}, 0.0f, 0.0f, 0, 14, (Object) null), chartState.getStakedEntry(), composerStartRestartGroup, 0);
                BreakdownRow(StringResources6.getText(companion4.invoke(C37760R.string.staking_summary_chart_entry_label_available_to_stake, new Object[0]), composerStartRestartGroup, i6).toString(), null, chartState.getAvailableToStakeEntry(), composerStartRestartGroup, 48);
                composerStartRestartGroup.endNode();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new StakingSummaryChart5(snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StakingSummaryChart4.StakingSummaryChart$lambda$10(chartState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(-1894182974);
            if (chartState != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StakingSummaryChart$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StakingSummaryChart$lambda$8$lambda$7$lambda$6(long j, long j2, long j3, SnapshotState4 snapshotState4, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, j, 0L, 0L, 0.0f, DrawScope3.INSTANCE, null, 0, 110, null);
        DrawScope.m6957drawRectAsUm42w$default(Canvas, Brush.Companion.m6677horizontalGradient8A3gB4$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j2)), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(j3))}, 0.0f, 0.0f, 0, 14, (Object) null), 0L, Size.m6577copyxjbvk4A$default(Canvas.mo6963getSizeNHjbRc(), Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * StakingSummaryChart$lambda$5(snapshotState4), 0.0f, 2, null), 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        return Unit.INSTANCE;
    }

    private static final boolean StakingSummaryChart$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float StakingSummaryChart$lambda$5(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final void BreakdownRow(final String str, final Brush brush, final CryptoStakingSummaryViewState.ChartState.Entry entry, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(443582400);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(brush) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(entry) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(443582400, i2, -1, "com.robinhood.shared.crypto.staking.staking.summary.BreakdownRow (StakingSummaryChart.kt:121)");
            }
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, ComposableLambda3.rememberComposableLambda(-694290556, true, new C379021(brush, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU()), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(991609379, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt.BreakdownRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(991609379, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.BreakdownRow.<anonymous> (StakingSummaryChart.kt:141)");
                    }
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(68441953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt.BreakdownRow.3
                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(68441953, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.BreakdownRow.<anonymous> (StakingSummaryChart.kt:144)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    CryptoStakingSummaryViewState.ChartState.Entry entry2 = entry;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String amount = entry2.getAmount();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(amount, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16318);
                    String amountInFiat = entry2.getAmountInFiat();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(amountInFiat, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextS(), composer3, 0, 0, 8122);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), null, false, false, false, null, composer2, 200064, 0, 2003);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingSummaryChart4.BreakdownRow$lambda$11(str, brush, entry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: StakingSummaryChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$BreakdownRow$1 */
    static final class C379021 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ long $emptyStateColor;
        final /* synthetic */ Brush $legendBrush;

        C379021(Brush brush, long j) {
            this.$legendBrush = brush;
            this.$emptyStateColor = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-694290556, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.BreakdownRow.<anonymous> (StakingSummaryChart.kt:125)");
            }
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16));
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$legendBrush) | composer.changed(this.$emptyStateColor);
            final Brush brush = this.$legendBrush;
            final long j = this.$emptyStateColor;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$BreakdownRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StakingSummaryChart4.C379021.invoke$lambda$1$lambda$0(brush, j, (DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Canvas2.Canvas(modifierM5169size3ABfNKs, (Function1) objRememberedValue, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Brush brush, long j, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            if (brush == null) {
                DrawScope.m6958drawRectnJ9OG0$default(Canvas, j, 0L, 0L, 0.0f, DrawScope3.INSTANCE, null, 0, 110, null);
            } else {
                DrawScope.m6957drawRectAsUm42w$default(Canvas, brush, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final void LoadingChart(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1697439470);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1697439470, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.LoadingChart (StakingSummaryChart.kt:161)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(24)), true, null, 2, null), composerStartRestartGroup, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            LocalShowPlaceholder.Loadable(true, null, null, StakingSummaryChart.INSTANCE.getLambda$1794886824$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 3078, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingSummaryChart4.LoadingChart$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ChartPreviewLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1622188706);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1622188706, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.ChartPreviewLoading (StakingSummaryChart.kt:189)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, StakingSummaryChart.INSTANCE.m24979getLambda$1878153638$feature_crypto_staking_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingSummaryChart4.ChartPreviewLoading$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ChartPreviewDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-445128446);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-445128446, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.ChartPreviewDay (StakingSummaryChart.kt:205)");
            }
            ChartPreview(true, 0.6f, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingSummaryChart4.ChartPreviewDay$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ChartPreviewNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-384183170);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-384183170, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.ChartPreviewNight (StakingSummaryChart.kt:211)");
            }
            ChartPreview(false, 0.6f, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingSummaryChart4.ChartPreviewNight$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ChartPreviewMinWidth(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-939756374);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-939756374, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.ChartPreviewMinWidth (StakingSummaryChart.kt:217)");
            }
            ChartPreview(false, 0.0123f, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingSummaryChart4.ChartPreviewMinWidth$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ChartPreview(final boolean z, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1795109694);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1795109694, i2, -1, "com.robinhood.shared.crypto.staking.staking.summary.ChartPreview (StakingSummaryChart.kt:222)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1731687178, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt.ChartPreview.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1731687178, i3, -1, "com.robinhood.shared.crypto.staking.staking.summary.ChartPreview.<anonymous> (StakingSummaryChart.kt:224)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 1, null);
                    float f2 = f;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    StakingSummaryChart4.StakingSummaryChart(new CryptoStakingSummaryViewState.ChartState(f2, new CryptoStakingSummaryViewState.ChartState.Entry("5 SOL", "$34,535.43"), new CryptoStakingSummaryViewState.ChartState.Entry("3.5334456 SOL", "$434.24553")), null, composer2, 0, 2);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.summary.StakingSummaryChartKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingSummaryChart4.ChartPreview$lambda$18(z, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
