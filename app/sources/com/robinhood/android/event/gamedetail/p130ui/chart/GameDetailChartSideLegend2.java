package com.robinhood.android.event.gamedetail.p130ui.chart;

import android.content.res.Configuration;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.robinhood.android.event.gamedetail.builders.BuildChartSideLegend;
import com.robinhood.android.event.gamedetail.p130ui.chart.ChartSideLegendState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailChartSideLegend.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"ExpectedPillWidth", "", "GameDetailChartSideLegend", "", "state", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;", "extraTopPadding", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LegendItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState$ContractItem;", "(Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState$ContractItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-game-detail_externalDebug", "itemHeightPx", "itemWidth", "Landroidx/compose/ui/unit/Dp;", "containerHeight", "itemOffsets", "", "animatedOffset"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailChartSideLegend2 {
    private static final int ExpectedPillWidth = 44;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailChartSideLegend$lambda$21(ChartSideLegendState chartSideLegendState, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        GameDetailChartSideLegend(chartSideLegendState, i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendItem$lambda$25(ChartSideLegendState.ContractItem contractItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LegendItem(contractItem, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121 A[LOOP:0: B:60:0x011b->B:62:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailChartSideLegend(final ChartSideLegendState state, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final Density density;
        final float f;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotState4 snapshotState4;
        boolean zChanged2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotIntState2 snapshotIntState2;
        final ArrayList arrayList;
        Iterator<ChartSideLegendState.ContractItem> it;
        boolean zChanged3;
        Object objRememberedValue4;
        SnapshotState4 snapshotState42;
        Object objRememberedValue5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2084152636);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 == 0) {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2084152636, i4, -1, "com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegend (GameDetailChartSideLegend.kt:50)");
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                f = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(f);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$2$lambda$1(density, f));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(f);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$5$lambda$4(f);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList<ChartSideLegendState.ContractItem> contractItems = state.getContractItems();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractItems, 10));
                it = contractItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(MathKt.roundToInt(it.next().getYPosition() * 100.0f) / 100.0f));
                }
                int intValue = snapshotIntState2.getIntValue();
                int iGameDetailChartSideLegend$lambda$3 = GameDetailChartSideLegend$lambda$3(snapshotState4);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged3 = ((i4 & 112) != 32) | composerStartRestartGroup.changed(intValue) | composerStartRestartGroup.changed(iGameDetailChartSideLegend$lambda$3) | composerStartRestartGroup.changed(arrayList);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$12$lambda$11(arrayList, i, snapshotState4, snapshotIntState2);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState42 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$15$lambda$14(snapshotIntState2, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifier4, (Function1) objRememberedValue5);
                float fGameDetailChartSideLegend$lambda$6 = GameDetailChartSideLegend$lambda$6(snapshotState43);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierOnGloballyPositioned, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fGameDetailChartSideLegend$lambda$6 + bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()) + bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1555363173);
                if (!GameDetailChartSideLegend$lambda$13(snapshotState42).isEmpty()) {
                    int i7 = 0;
                    for (ChartSideLegendState.ContractItem contractItem : state.getContractItems()) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ChartSideLegendState.ContractItem contractItem2 = contractItem;
                        final SnapshotState4<Integer> snapshotState4AnimateIntAsState = AnimateAsState.animateIntAsState(GameDetailChartSideLegend$lambda$13(snapshotState42).get(i7).intValue(), null, "legend_item_offset", null, composerStartRestartGroup, 384, 10);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChanged4 = composerStartRestartGroup.changed(snapshotState4AnimateIntAsState);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GameDetailChartSideLegend2.m2007x1c455396(snapshotState4AnimateIntAsState, (Density) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LegendItem(contractItem2, OffsetKt.offset(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue6), composerStartRestartGroup, 0, 0);
                        i7 = i8;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$21(state, i, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        modifier2 = modifier;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            f = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale;
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(f);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$2$lambda$1(density, f));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                snapshotState4 = (SnapshotState4) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(f);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$5$lambda$4(f);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    SnapshotState4 snapshotState432 = (SnapshotState4) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList<ChartSideLegendState.ContractItem> contractItems2 = state.getContractItems();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractItems2, 10));
                    it = contractItems2.iterator();
                    while (it.hasNext()) {
                    }
                    int intValue2 = snapshotIntState2.getIntValue();
                    int iGameDetailChartSideLegend$lambda$32 = GameDetailChartSideLegend$lambda$3(snapshotState4);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged3 = ((i4 & 112) != 32) | composerStartRestartGroup.changed(intValue2) | composerStartRestartGroup.changed(iGameDetailChartSideLegend$lambda$32) | composerStartRestartGroup.changed(arrayList);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged3) {
                        objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GameDetailChartSideLegend2.GameDetailChartSideLegend$lambda$12$lambda$11(arrayList, i, snapshotState4, snapshotIntState2);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        snapshotState42 = (SnapshotState4) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifier4, (Function1) objRememberedValue5);
                        float fGameDetailChartSideLegend$lambda$62 = GameDetailChartSideLegend$lambda$6(snapshotState432);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(modifierOnGloballyPositioned2, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(fGameDetailChartSideLegend$lambda$62 + bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()) + bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1555363173);
                            if (!GameDetailChartSideLegend$lambda$13(snapshotState42).isEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GameDetailChartSideLegend$lambda$2$lambda$1(Density density, float f) {
        return density.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(MathKt.roundToInt(20 * f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp GameDetailChartSideLegend$lambda$5$lambda$4(float f) {
        return C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(MathKt.roundToInt(44 * f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List GameDetailChartSideLegend$lambda$12$lambda$11(List list, int i, SnapshotState4 snapshotState4, SnapshotIntState2 snapshotIntState2) {
        return BuildChartSideLegend.buildChartSideLegend(list, GameDetailChartSideLegend$lambda$3(snapshotState4), snapshotIntState2.getIntValue(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailChartSideLegend$lambda$15$lambda$14(SnapshotIntState2 snapshotIntState2, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        snapshotIntState2.setIntValue((int) (coords.mo7241getSizeYbymL2g() & 4294967295L));
        return Unit.INSTANCE;
    }

    private static final List<Integer> GameDetailChartSideLegend$lambda$13(SnapshotState4<? extends List<Integer>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final int GameDetailChartSideLegend$lambda$20$lambda$19$lambda$16(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    private static final int GameDetailChartSideLegend$lambda$3(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    private static final float GameDetailChartSideLegend$lambda$6(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float LegendItem$lambda$24(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GameDetailChartSideLegend$lambda$20$lambda$19$lambda$18$lambda$17 */
    public static final IntOffset m2007x1c455396(SnapshotState4 snapshotState4, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((GameDetailChartSideLegend$lambda$20$lambda$19$lambda$16(snapshotState4) & 4294967295L) | (0 << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LegendItem(final ChartSideLegendState.ContractItem contractItem, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final float f;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1807032934);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(contractItem) ? 4 : 2) | i;
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1807032934, i3, -1, "com.robinhood.android.event.gamedetail.ui.chart.LegendItem (GameDetailChartSideLegend.kt:107)");
                }
                f = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(f);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GameDetailChartSideLegend2.LegendItem$lambda$23$lambda$22(f);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                String displayStr = contractItem.getDisplayStr();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                WrappedTickerKt.TickerText(new TickerTextState(displayStr, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), TickerTextState.Style.REGULAR_SMALL_BOLD, null, false, 24, null), PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(AnimationModifier.animateContentSize$default(SizeKt.m5176widthInVpY3zN4$default(modifier3, 0.0f, LegendItem$lambda$24((SnapshotState4) objRememberedValue), 1, null), null, null, 3, null), contractItem.getColor().getColor(composerStartRestartGroup, 0), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(20))), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, TickerTextState.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailChartSideLegend2.LegendItem$lambda$25(contractItem, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            f = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale;
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(f);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.chart.GameDetailChartSideLegendKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailChartSideLegend2.LegendItem$lambda$23$lambda$22(f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                String displayStr2 = contractItem.getDisplayStr();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                WrappedTickerKt.TickerText(new TickerTextState(displayStr2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), TickerTextState.Style.REGULAR_SMALL_BOLD, null, false, 24, null), PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(AnimationModifier.animateContentSize$default(SizeKt.m5176widthInVpY3zN4$default(modifier3, 0.0f, LegendItem$lambda$24((SnapshotState4) objRememberedValue), 1, null), null, null, 3, null), contractItem.getColor().getColor(composerStartRestartGroup, 0), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(20))), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM()), composerStartRestartGroup, TickerTextState.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp LegendItem$lambda$23$lambda$22(float f) {
        return C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(44 * f));
    }
}
