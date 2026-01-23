package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.advisory.projection.C9264R;
import com.robinhood.android.advisory.projection.UtilsKt;
import com.robinhood.android.charts.ChartWithOverlays;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Line;
import com.robinhood.android.charts.model.Point;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.compose.color.LinearGradientColor;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChartComponents.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\f\u001a3\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aO\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010#\u001aS\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/\u001a+\u00100\u001a\b\u0012\u0004\u0012\u0002H201\"\u0004\b\u0000\u001022\u0006\u00103\u001a\u0002H22\b\b\u0002\u00104\u001a\u000205H\u0007¢\u0006\u0002\u00106\u001aQ\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020&0:2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020?0B¢\u0006\u0004\bC\u0010D\u001a-\u0010E\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010G¨\u0006H²\u0006\n\u0010I\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010J\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"ChartGridLines", "", "gridIncrements", "Lkotlinx/collections/immutable/PersistentList;", "", "currency", "Ljava/util/Currency;", "modifier", "Landroidx/compose/ui/Modifier;", "onRowMeasured", "Lkotlin/Function1;", "", "(Lkotlinx/collections/immutable/PersistentList;Ljava/util/Currency;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ProjectionChart", "chartPoints", "Lcom/robinhood/android/advisory/projection/chart/ChartPoints;", "selectedYear", "gap", "Landroidx/compose/ui/unit/Dp;", "ProjectionChart--jt2gSs", "(Lcom/robinhood/android/advisory/projection/chart/ChartPoints;ILandroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "ChartBottomLabels", "numYears", "startPadding", "endPadding", "ChartBottomLabels-djqs-MU", "(IFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChartTopLabels", "topLabel", "Lcom/robinhood/android/advisory/projection/chart/ChartTopLabel;", "userEndOfYearAge", "currentYear", "chartWidthPx", "density", "Landroidx/compose/ui/unit/Density;", "(Lcom/robinhood/android/advisory/projection/chart/ChartTopLabel;IIIIILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GlowingDot", "position", "Lcom/robinhood/android/charts/model/Point;", "dotColor", "Landroidx/compose/ui/graphics/Color;", "dotDiameter", "glowDiameter", "enableHeartbeat", "", "heartbeatDuration", "GlowingDot-NRI76As", "(Lcom/robinhood/android/charts/model/Point;Landroidx/compose/ui/Modifier;JFFZILandroidx/compose/runtime/Composer;II)V", "rememberDebouncedState", "Landroidx/compose/runtime/State;", "T", "value", "debounceMillis", "", "(Ljava/lang/Object;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createDynamicHighlightLine", "Lcom/robinhood/android/charts/model/Line;", "points", "", "highlightedIndex", "baseColor", "highlightColor", "lineWidth", "", "highlightRangeFraction", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "createDynamicHighlightLine-eaDK9VM", "(Ljava/util/List;IJJFDLandroidx/compose/animation/core/AnimationSpec;)Lcom/robinhood/android/charts/model/Line;", "ExtraVerticalPadding", "onPaddingMeasured", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-projected-returns_externalDebug", "textWidthPx", "heightPx"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChartComponentsKt {

    /* compiled from: ChartComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartModels3.values().length];
            try {
                iArr[ChartModels3.AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartModels3.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartBottomLabels_djqs_MU$lambda$13(int i, float f, float f2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m11207ChartBottomLabelsdjqsMU(i, f, f2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGridLines$lambda$7(ImmutableList3 immutableList3, Currency currency, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        ChartGridLines(immutableList3, currency, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTopLabels$lambda$20(ChartModels3 chartModels3, int i, int i2, int i3, int i4, int i5, Density density, Modifier modifier, int i6, int i7, Composer composer, int i8) {
        ChartTopLabels(chartModels3, i, i2, i3, i4, i5, density, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtraVerticalPadding$lambda$38(Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        ExtraVerticalPadding(modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlowingDot_NRI76As$lambda$25(Point point, Modifier modifier, long j, float f, float f2, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        m11208GlowingDotNRI76As(point, modifier, j, f, f2, z, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProjectionChart__jt2gSs$lambda$11(ChartPoints chartPoints, int i, Modifier modifier, float f, int i2, int i3, Composer composer, int i4) {
        m11209ProjectionChartjt2gSs(chartPoints, i, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGridLines$lambda$1$lambda$0(int i) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartGridLines(final ImmutableList3<Double> gridIncrements, final Currency currency, Modifier modifier, Function1<? super Integer, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super Integer, Unit> function12;
        final Function1<? super Integer, Unit> function13;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Iterator it;
        Composer composer2;
        final Modifier modifier3;
        final Function1<? super Integer, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Currency currency2 = currency;
        Intrinsics.checkNotNullParameter(gridIncrements, "gridIncrements");
        Intrinsics.checkNotNullParameter(currency2, "currency");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1622247109);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(gridIncrements) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(currency2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            int i6 = 2048;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function14 = function12;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChartComponentsKt.ChartGridLines$lambda$1$lambda$0(((Integer) obj).intValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function13 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function13 = function12;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1622247109, i3, -1, "com.robinhood.android.advisory.projection.chart.ChartGridLines (ChartComponents.kt:75)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                    ?? r8 = 0;
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1500228201);
                    it = CollectionsKt.reversed(gridIncrements).iterator();
                    while (it.hasNext()) {
                        Money money = new Money(currency2, new BigDecimal(String.valueOf(((Number) it.next()).doubleValue())));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z = (i3 & 7168) == i6 ? true : r8;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChartComponentsKt.ChartGridLines$lambda$6$lambda$5$lambda$3$lambda$2(function13, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r8);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r8);
                        int i7 = r8;
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String compact$default = Money.formatCompact$default(money, null, null, Integer.valueOf(i7), 3, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Composer composer3 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(compact$default, boxScopeInstance.align(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(50)), companion3.getCenterStart()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composer3, 805306368, 0, 7672);
                        BoxKt.Box(boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer3, i8).m21596getXxlargeD9Ej5fM() - bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM()), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), companion3.getCenterStart()).then(UtilsKt.m11197dashedtGfji40(companion2, bentoTheme.getColors(composer3, i8).m21373getBg30d7_KjU(), (56 & 2) != 0 ? Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L)) : Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L)), (56 & 4) != 0 ? Offset.m6535constructorimpl((Float.floatToRawIntBits(0.5f) & 4294967295L) | (Float.floatToRawIntBits(1.0f) << 32)) : Offset.m6535constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L)), (56 & 8) != 0 ? C2002Dp.m7995constructorimpl(1) : 0.0f, (56 & 16) != 0 ? C2002Dp.m7995constructorimpl(2) : 0.0f, (56 & 32) != 0 ? C2002Dp.m7995constructorimpl(2) : 0.0f)), composer3, 0);
                        composer3.endNode();
                        currency2 = currency;
                        function13 = function13;
                        i3 = i3;
                        r8 = 0;
                        composerStartRestartGroup = composer3;
                        it = it;
                        i6 = 2048;
                        modifier4 = modifier4;
                    }
                    Modifier modifier5 = modifier4;
                    Function1<? super Integer, Unit> function15 = function13;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function14 = function15;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChartComponentsKt.ChartGridLines$lambda$7(gridIncrements, currency, modifier3, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            if ((i3 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                ?? r82 = 0;
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1500228201);
                    it = CollectionsKt.reversed(gridIncrements).iterator();
                    while (it.hasNext()) {
                    }
                    Modifier modifier52 = modifier4;
                    Function1<? super Integer, Unit> function152 = function13;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    function14 = function152;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        int i62 = 2048;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartGridLines$lambda$6$lambda$5$lambda$3$lambda$2(Function1 function1, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        function1.invoke(Integer.valueOf((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: ProjectionChart--jt2gSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11209ProjectionChartjt2gSs(final ChartPoints chartPoints, final int i, Modifier modifier, float f, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        float f2;
        TweenSpec tweenSpecTween$default;
        Object objRememberedValue;
        Composer.Companion companion;
        Animatable animatable;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartPoints, "chartPoints");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297138000);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(chartPoints) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                }
                if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    float fM7995constructorimpl = i5 == 0 ? C2002Dp.m7995constructorimpl(2) : f2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1297138000, i4, -1, "com.robinhood.android.advisory.projection.chart.ProjectionChart (ChartComponents.kt:351)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i7).getIsDay();
                    tweenSpecTween$default = AnimationSpecKt.tween$default(3000, 0, null, 6, null);
                    float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    animatable = (Animatable) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    List<Point> medianPoints = chartPoints.getMedianPoints();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ChartComponentsKt$ProjectionChart$1$1(animatable, tweenSpecTween$default, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(medianPoints, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    int i8 = i - 1;
                    Modifier modifier5 = modifier4;
                    ChartWithOverlays.ChartWithOverlays(modifier5, CollectionsKt.listOf((Object[]) new ChartAnnotation[]{new PianoKeysAnnotation(chartPoints.getPercentile5Points(), chartPoints.getPercentile95Points(), chartPoints.getMedianPoints(), fM7995constructorimpl, tweenSpecTween$default, isDay, i8, null, 128, null), new Line(chartPoints.getCurrentPortfolioPoints(), bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), null, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), tweenSpecTween$default, null, 36, null), m11210createDynamicHighlightLineeaDK9VM(chartPoints.getMedianPoints(), i8, AdvisoryChartColorPalette.getMedianLineColor(), AdvisoryChartColorPalette.getMedianLineHighlightColor(), fMo5016toPx0680j_4, 0.7d, tweenSpecTween$default), new GlowingDotFollowingLineAnnotation(CollectionsKt.dropLast(chartPoints.getMedianPoints(), 1), tweenSpecTween$default, ((Number) animatable.getValue()).floatValue() < 1.0f ? new Point(chartPoints.getMedianPoints().get(i8).getX(), chartPoints.getMedianPoints().get(i8).getY()) : null, 0.0f, 0.0f, false, 0, AdvisoryChartColorPalette.getGlowingDotColor(), null, 376, null)}), CollectionsKt.emptyList(), 0L, null, null, false, composerStartRestartGroup, ((i4 >> 6) & 14) | 384, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    f3 = fM7995constructorimpl;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChartComponentsKt.ProjectionChart__jt2gSs$lambda$11(chartPoints, i, modifier3, f3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            f2 = f;
            if ((i4 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                boolean isDay2 = bentoTheme2.getColors(composerStartRestartGroup, i72).getIsDay();
                tweenSpecTween$default = AnimationSpecKt.tween$default(3000, 0, null, 6, null);
                float fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(2));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                List<Point> medianPoints2 = chartPoints.getMedianPoints();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new ChartComponentsKt$ProjectionChart$1$1(animatable, tweenSpecTween$default, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(medianPoints2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    if (((Number) animatable.getValue()).floatValue() < 1.0f) {
                    }
                    int i82 = i - 1;
                    Modifier modifier52 = modifier4;
                    ChartWithOverlays.ChartWithOverlays(modifier52, CollectionsKt.listOf((Object[]) new ChartAnnotation[]{new PianoKeysAnnotation(chartPoints.getPercentile5Points(), chartPoints.getPercentile95Points(), chartPoints.getMedianPoints(), fM7995constructorimpl, tweenSpecTween$default, isDay2, i82, null, 128, null), new Line(chartPoints.getCurrentPortfolioPoints(), bentoTheme2.getColors(composerStartRestartGroup, i72).m21426getFg20d7_KjU(), null, new Stroke(fMo5016toPx0680j_42, 0.0f, 0, 0, null, 30, null), tweenSpecTween$default, null, 36, null), m11210createDynamicHighlightLineeaDK9VM(chartPoints.getMedianPoints(), i82, AdvisoryChartColorPalette.getMedianLineColor(), AdvisoryChartColorPalette.getMedianLineHighlightColor(), fMo5016toPx0680j_42, 0.7d, tweenSpecTween$default), new GlowingDotFollowingLineAnnotation(CollectionsKt.dropLast(chartPoints.getMedianPoints(), 1), tweenSpecTween$default, ((Number) animatable.getValue()).floatValue() < 1.0f ? new Point(chartPoints.getMedianPoints().get(i82).getX(), chartPoints.getMedianPoints().get(i82).getY()) : null, 0.0f, 0.0f, false, 0, AdvisoryChartColorPalette.getGlowingDotColor(), null, 376, null)}), CollectionsKt.emptyList(), 0L, null, null, false, composerStartRestartGroup, ((i4 >> 6) & 14) | 384, 120);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    f3 = fM7995constructorimpl;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i4 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: ChartBottomLabels-djqs-MU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11207ChartBottomLabelsdjqsMU(int i, final float f, final float f2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        float f3;
        float f4;
        int i6;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248537984);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            f3 = f;
        } else {
            f3 = f;
            if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                f4 = f2;
                i5 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1248537984, i5, -1, "com.robinhood.android.advisory.projection.chart.ChartBottomLabels (ChartComponents.kt:425)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    StringResource stringResourceInvoke = companion2.invoke(C9264R.string.projection_chart_year_label, 1);
                    int i7 = StringResource.$stable;
                    String string2 = StringResource2.getString(stringResourceInvoke, composerStartRestartGroup, i7);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU();
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m5146paddingqDBjuR0$default(companion3, f3, 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8184);
                    Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(companion2.invoke(C9264R.string.projection_chart_year_label, Integer.valueOf(i4)), composerStartRestartGroup, i7), PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, f4, 0.0f, 11, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composer2, 0, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i9 = i4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChartComponentsKt.ChartBottomLabels_djqs_MU$lambda$13(i9, f, f2, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            modifier2 = modifier;
            if ((i5 & 1171) == 1170) {
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    StringResource.Companion companion22 = StringResource.INSTANCE;
                    StringResource stringResourceInvoke2 = companion22.invoke(C9264R.string.projection_chart_year_label, 1);
                    int i72 = StringResource.$stable;
                    String string22 = StringResource2.getString(stringResourceInvoke2, composerStartRestartGroup, i72);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i82 = BentoTheme.$stable;
                    long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i82).m21426getFg20d7_KjU();
                    TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i82).getTextM();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(string22, PaddingKt.m5146paddingqDBjuR0$default(companion32, f3, 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 0, 0, 8184);
                    Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(companion22.invoke(C9264R.string.projection_chart_year_label, Integer.valueOf(i4)), composerStartRestartGroup, i72), PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, f4, 0.0f, 11, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i82).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i82).getTextM(), composer2, 0, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f4 = f2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        modifier2 = modifier;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartTopLabels(final ChartModels3 topLabel, final int i, final int i2, final int i3, final int i4, final int i5, final Density density, Modifier modifier, Composer composer, final int i6, final int i7) {
        int i8;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int i9;
        String strValueOf;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        Intrinsics.checkNotNullParameter(density, "density");
        Composer composerStartRestartGroup = composer.startRestartGroup(1515304195);
        if ((i7 & 1) != 0) {
            i8 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(topLabel.ordinal()) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i6 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= 384;
        } else if ((i6 & 384) == 0) {
            i8 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i7 & 8) != 0) {
            i8 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
        }
        if ((i7 & 16) != 0) {
            i8 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(i4) ? 16384 : 8192;
        }
        if ((i7 & 32) != 0) {
            i8 |= 196608;
        } else if ((i6 & 196608) == 0) {
            i8 |= composerStartRestartGroup.changed(i5) ? 131072 : 65536;
        }
        if ((i7 & 64) != 0) {
            i8 |= 1572864;
        } else if ((i6 & 1572864) == 0) {
            i8 |= composerStartRestartGroup.changed(density) ? 1048576 : 524288;
        }
        int i10 = i7 & 128;
        if (i10 == 0) {
            if ((12582912 & i6) == 0) {
                modifier2 = modifier;
                i8 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((4793491 & i8) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1515304195, i8, -1, "com.robinhood.android.advisory.projection.chart.ChartTopLabels (ChartComponents.kt:453)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                float f = i5;
                float fMo5012toDpu2uoSUM = density.mo5012toDpu2uoSUM(RangesKt.coerceIn(((i3 - 0.5f) * (f / i4)) - (snapshotIntState2.getIntValue() / 2.0f), 0.0f, f - snapshotIntState2.getIntValue()));
                i9 = WhenMappings.$EnumSwitchMapping$0[topLabel.ordinal()];
                if (i9 != 1) {
                    strValueOf = "Age " + (i + i3);
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strValueOf = String.valueOf(i2 + i3);
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i11).m21426getFg20d7_KjU();
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i11).getTextM();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChartComponentsKt.ChartTopLabels$lambda$19$lambda$18(snapshotIntState2, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strValueOf, OffsetKt.m5125offsetVpY3zN4$default(OnGloballyPositionedModifier3.onGloballyPositioned(modifier4, (Function1) objRememberedValue2), fMo5012toDpu2uoSUM, 0.0f, 2, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8168);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartComponentsKt.ChartTopLabels$lambda$20(topLabel, i, i2, i3, i4, i5, density, modifier3, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i8 |= 12582912;
        modifier2 = modifier;
        if ((4793491 & i8) == 4793490) {
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            float f2 = i5;
            float fMo5012toDpu2uoSUM2 = density.mo5012toDpu2uoSUM(RangesKt.coerceIn(((i3 - 0.5f) * (f2 / i4)) - (snapshotIntState22.getIntValue() / 2.0f), 0.0f, f2 - snapshotIntState22.getIntValue()));
            i9 = WhenMappings.$EnumSwitchMapping$0[topLabel.ordinal()];
            if (i9 != 1) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i112 = BentoTheme.$stable;
            long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i112).m21426getFg20d7_KjU();
            TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i112).getTextM();
            FontWeight bold2 = FontWeight.INSTANCE.getBold();
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strValueOf, OffsetKt.m5125offsetVpY3zN4$default(OnGloballyPositionedModifier3.onGloballyPositioned(modifier4, (Function1) objRememberedValue2), fMo5012toDpu2uoSUM2, 0.0f, 2, null), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, bold2, null, null, 0, false, 0, 0, null, 0, textM2, composer2, 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTopLabels$lambda$19$lambda$18(SnapshotIntState2 snapshotIntState2, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        snapshotIntState2.setIntValue((int) (layoutCoordinates.mo7241getSizeYbymL2g() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /* renamed from: GlowingDot-NRI76As, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11208GlowingDotNRI76As(final Point position, Modifier modifier, long j, float f, float f2, boolean z, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        long glowingDotColor;
        int i6;
        float fM7995constructorimpl;
        int i7;
        float fM7995constructorimpl2;
        int i8;
        boolean z2;
        int i9;
        int i10;
        Object objRememberedValue;
        Composer.Companion companion;
        final Animatable animatable;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Object obj;
        final float f3;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        float f4;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(position, "position");
        Composer composerStartRestartGroup = composer.startRestartGroup(-472066957);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(position) : composerStartRestartGroup.changedInstance(position) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    glowingDotColor = j;
                    i4 |= composerStartRestartGroup.changed(glowingDotColor) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        fM7995constructorimpl = f;
                        i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 != 0) {
                        if ((i2 & 24576) == 0) {
                            fM7995constructorimpl2 = f2;
                            i4 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i2 & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            i10 = i;
                        } else {
                            i10 = i;
                            if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
                            }
                        }
                        if ((i4 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            f5 = fM7995constructorimpl2;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                glowingDotColor = AdvisoryChartColorPalette.getGlowingDotColor();
                            }
                            if (i6 != 0) {
                                fM7995constructorimpl = C2002Dp.m7995constructorimpl(7);
                            }
                            if (i7 != 0) {
                                fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(36);
                            }
                            if (i8 != 0) {
                                z2 = false;
                            }
                            if (i9 != 0) {
                                i10 = 1200;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-472066957, i4, -1, "com.robinhood.android.advisory.projection.chart.GlowingDot (ChartComponents.kt:539)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = Animatable2.Animatable$default(1.0f, 0.0f, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            animatable = (Animatable) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Boolean boolValueOf = Boolean.valueOf(z2);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance = ((458752 & i4) != 131072) | composerStartRestartGroup.changedInstance(animatable) | ((3670016 & i4) != 1048576);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                obj = null;
                                objRememberedValue2 = new ChartComponentsKt$GlowingDot$1$1(z2, animatable, i10, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                obj = null;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            f3 = fM7995constructorimpl2;
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i4 >> 15) & 14);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, obj);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance2 = ((i4 & 896) != 256) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | composerStartRestartGroup.changedInstance(animatable) | ((i4 & 14) != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(position)));
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                final long j2 = glowingDotColor;
                                final float f6 = fM7995constructorimpl;
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return ChartComponentsKt.GlowingDot_NRI76As$lambda$24$lambda$23(f6, f3, animatable, position, j2, (DrawScope) obj2);
                                    }
                                };
                                f4 = f3;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                f4 = f3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Canvas2.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f5 = f4;
                        }
                        final int i12 = i10;
                        final long j3 = glowingDotColor;
                        final float f7 = fM7995constructorimpl;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final boolean z3 = z2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return ChartComponentsKt.GlowingDot_NRI76As$lambda$25(position, modifier3, j3, f7, f5, z3, i12, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    fM7995constructorimpl2 = f2;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i4 & 599187) == 599186) {
                        if (i11 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        animatable = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf2 = Boolean.valueOf(z2);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = ((458752 & i4) != 131072) | composerStartRestartGroup.changedInstance(animatable) | ((3670016 & i4) != 1048576);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            obj = null;
                            objRememberedValue2 = new ChartComponentsKt$GlowingDot$1$1(z2, animatable, i10, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            f3 = fM7995constructorimpl2;
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i4 >> 15) & 14);
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, obj);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if ((i4 & 14) != 4) {
                                zChangedInstance2 = ((i4 & 896) != 256) | ((i4 & 7168) != 2048) | ((57344 & i4) != 16384) | composerStartRestartGroup.changedInstance(animatable) | ((i4 & 14) != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(position)));
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2) {
                                    final long j22 = glowingDotColor;
                                    final float f62 = fM7995constructorimpl;
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            return ChartComponentsKt.GlowingDot_NRI76As$lambda$24$lambda$23(f62, f3, animatable, position, j22, (DrawScope) obj2);
                                        }
                                    };
                                    f4 = f3;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    Canvas2.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    f5 = f4;
                                }
                            }
                        }
                    }
                    final int i122 = i10;
                    final long j32 = glowingDotColor;
                    final float f72 = fM7995constructorimpl;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fM7995constructorimpl = f;
                i7 = i3 & 16;
                if (i7 != 0) {
                }
                fM7995constructorimpl2 = f2;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i4 & 599187) == 599186) {
                }
                final int i1222 = i10;
                final long j322 = glowingDotColor;
                final float f722 = fM7995constructorimpl;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            glowingDotColor = j;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            fM7995constructorimpl = f;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            fM7995constructorimpl2 = f2;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i4 & 599187) == 599186) {
            }
            final int i12222 = i10;
            final long j3222 = glowingDotColor;
            final float f7222 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        glowingDotColor = j;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        fM7995constructorimpl = f;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        fM7995constructorimpl2 = f2;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        final int i122222 = i10;
        final long j32222 = glowingDotColor;
        final float f72222 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlowingDot_NRI76As$lambda$24$lambda$23(float f, float f2, Animatable animatable, Point point, long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f) / 2.0f;
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(f2) / 2.0f;
        float fFloatValue = ((Number) animatable.getValue()).floatValue();
        float x = point.getX() * Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float y = (1.0f - point.getY()) * Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        float f3 = fFloatValue * fMo5016toPx0680j_42;
        DrawScope.m6946drawCircleV9BoPsw$default(Canvas, Brush.Companion.m6680radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(j, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), Offset.m6535constructorimpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), f3, 0, 8, (Object) null), f3, Offset.m6535constructorimpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, fMo5016toPx0680j_4, Offset.m6535constructorimpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    public static final <T> SnapshotState4<T> rememberDebouncedState(T t, long j, Composer composer, int i, int i2) {
        T t2;
        composer.startReplaceGroup(-20532280);
        if ((i2 & 2) != 0) {
            j = 500;
        }
        long j2 = j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20532280, i, -1, "com.robinhood.android.advisory.projection.chart.rememberDebouncedState (ChartComponents.kt:592)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(j2)) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == companion.getEmpty()) {
            t2 = t;
            ChartComponentsKt$rememberDebouncedState$1$1 chartComponentsKt$rememberDebouncedState$1$1 = new ChartComponentsKt$rememberDebouncedState$1$1(j2, t2, snapshotState, null);
            composer.updateRememberedValue(chartComponentsKt$rememberDebouncedState$1$1);
            objRememberedValue2 = chartComponentsKt$rememberDebouncedState$1$1;
        } else {
            t2 = t;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(t2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState;
    }

    /* renamed from: createDynamicHighlightLine-eaDK9VM, reason: not valid java name */
    public static final Line m11210createDynamicHighlightLineeaDK9VM(List<Point> points, int i, long j, long j2, float f, double d, AnimationSpec<Float> lineRevealAnimationSpec) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(lineRevealAnimationSpec, "lineRevealAnimationSpec");
        if (points.isEmpty() || i < 0 || i >= points.size()) {
            return new Line(points, j, null, new Stroke(f, 0.0f, 0, 0, null, 30, null), lineRevealAnimationSpec, null, 32, null);
        }
        double x = points.get(i).getX();
        double d2 = d / 2;
        double dMax = Math.max(0.0d, x - d2);
        double dCoerceIn = RangesKt.coerceIn(x, 0.0d, 1.0d);
        double dMin = Math.min(1.0d, x + d2);
        return new Line(points, j, new LinearGradientColor(90.0f - ChartUtils.computeTangentAngle(points, i), CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(Float.valueOf((float) dMax), Color.m6701boximpl(j)), Tuples4.m3642to(Float.valueOf((float) dCoerceIn), Color.m6701boximpl(j2)), Tuples4.m3642to(Float.valueOf((float) dMin), Color.m6701boximpl(j))})), new Stroke(f, 0.0f, 0, 0, null, 30, null), lineRevealAnimationSpec, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtraVerticalPadding$lambda$29$lambda$28(C2002Dp c2002Dp) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExtraVerticalPadding(Modifier modifier, Function1<? super C2002Dp, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Function1<? super C2002Dp, Unit> function12;
        final Function1<? super C2002Dp, Unit> function13;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        final Density density;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1824790065);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChartComponentsKt.ExtraVerticalPadding$lambda$29$lambda$28((C2002Dp) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    function13 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1824790065, i3, -1, "com.robinhood.android.advisory.projection.chart.ExtraVerticalPadding (ChartComponents.kt:659)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChartComponentsKt.ExtraVerticalPadding$lambda$34$lambda$33((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifier4, (Function1) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(density) | ((i3 & 112) == 32);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChartComponentsKt.ExtraVerticalPadding$lambda$37$lambda$36(function13, density, snapshotIntState2, (IntSize) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Function1<? super C2002Dp, Unit> function14 = function13;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw("Placeholder", OnRemeasuredModifier2.onSizeChanged(modifierClearAndSetSemantics, (Function1) objRememberedValue3), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composer2, 390, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function14;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartComponentsKt.ExtraVerticalPadding$lambda$38(modifier3, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function12 = function1;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierClearAndSetSemantics2 = SemanticsModifier6.clearAndSetSemantics(modifier4, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = composerStartRestartGroup.changed(density) | ((i3 & 112) == 32);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.ChartComponentsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChartComponentsKt.ExtraVerticalPadding$lambda$37$lambda$36(function13, density, snapshotIntState2, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Function1<? super C2002Dp, Unit> function142 = function13;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw("Placeholder", OnRemeasuredModifier2.onSizeChanged(modifierClearAndSetSemantics2, (Function1) objRememberedValue3), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composer2, 390, 0, 8184);
                if (ComposerKt.isTraceInProgress()) {
                }
                function12 = function142;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtraVerticalPadding$lambda$34$lambda$33(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtraVerticalPadding$lambda$37$lambda$36(Function1 function1, Density density, SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        function1.invoke(C2002Dp.m7993boximpl(density.mo5012toDpu2uoSUM(snapshotIntState2.getIntValue() / 2.0f)));
        return Unit.INSTANCE;
    }
}
