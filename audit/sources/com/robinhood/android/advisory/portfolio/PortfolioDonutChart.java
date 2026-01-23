package com.robinhood.android.advisory.portfolio;

import android.os.Build;
import android.view.View;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart7;
import com.robinhood.android.charts.Interactions2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Arrays;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioDonutChart.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0087\u0001\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020\u0007*\u00020 ¢\u0006\u0004\b!\u0010\"\u001a\u0088\u0001\u00100\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010*\u001a\u00020(2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070+2\u001b\b\u0002\u0010/\u001a\u0015\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0007\u0018\u00010$¢\u0006\u0002\b.H\u0007¢\u0006\u0004\b0\u00101\"\u0017\u00102\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0017\u00106\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105\"\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0003088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:\"\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\")\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030?0>8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\")\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030?0>8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010C\"&\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010A\"&\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010A\"\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006R²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010M\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020(8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010P\u001a\u0004\u0018\u00010O8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Q\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/geometry/Size;", "size", "", "cutout-hwW44Og", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/geometry/Rect;JJ)V", "cutout", "Lkotlinx/collections/immutable/ImmutableList;", "", "slices", "", "activeIndex", "gapAngle", "backgroundColor", "Landroidx/compose/ui/geometry/Offset;", "center", "maximumRingSizeRect", "maximumInactiveSizeRect", "Landroidx/compose/ui/unit/Dp;", "chartInnerRadius", "Landroidx/compose/ui/graphics/Brush;", "activeStrokeBrush", "cumulativeGapAngle", "inactiveStrokeBrush", "activeFillBrush", "drawSliceStrokes-Ll2eoaw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;FJJJLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;FLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;)V", "drawSliceStrokes", "Landroid/view/View;", "performSegmentHapticFeedback", "(Landroid/view/View;)V", "values", "Lkotlin/Function1;", "onSliceSelected", "Landroidx/compose/ui/Modifier;", "modifier", "", "showInnerDial", "enforceMinimumTouchSize", "Lkotlin/Function0;", "onActiveSliceTapped", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "centerContent", "PortfolioDonutChart", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SliceStrokeWidth", "F", "getSliceStrokeWidth", "()F", "DonutChartMaxSize", "getDonutChartMaxSize", "", "LightModeGradients", "Ljava/util/List;", "DarkModeGradients", "PieChartCornerColor", "J", "", "Lkotlin/Pair;", "activeSliceFill", "[Lkotlin/Pair;", "getActiveSliceFill", "()[Lkotlin/Pair;", "activeSliceStroke", "getActiveSliceStroke", "DarkInactiveSliceStroke", "LightInactiveSliceStroke", "Landroidx/compose/animation/core/AnimationSpec;", "AdvisoryTween", "Landroidx/compose/animation/core/AnimationSpec;", "getAdvisoryTween", "()Landroidx/compose/animation/core/AnimationSpec;", "userInputOffset", "isActivelyDragging", "Lcom/robinhood/android/advisory/portfolio/UserInputSource;", "lastSource", "dragReleaseTarget", "lib-advisory_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PortfolioDonutChart {
    private static final AnimationSpec<Float> AdvisoryTween;
    private static final Tuples2<Float, Color>[] DarkInactiveSliceStroke;
    private static final Tuples2<Float, Color>[] LightInactiveSliceStroke;
    private static final Tuples2<Float, Color>[] activeSliceFill;
    private static final Tuples2<Float, Color>[] activeSliceStroke;
    private static final float SliceStrokeWidth = C2002Dp.m7995constructorimpl(1);
    private static final float DonutChartMaxSize = C2002Dp.m7995constructorimpl(450);
    private static final List<Color> LightModeGradients = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(3001545471L)), Color.m6701boximpl(Color2.Color(1298754186)), Color.m6701boximpl(Color2.Color(6908554))});
    private static final List<Color> DarkModeGradients = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(6908554)), Color.m6701boximpl(Color2.Color(3001545471L)), Color.m6701boximpl(Color2.Color(6908554)), Color.m6701boximpl(Color2.Color(1307046655))});
    private static final long PieChartCornerColor = Color2.Color(1253693951);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDonutChart$lambda$31(ImmutableList immutableList, Function1 function1, Modifier modifier, boolean z, Integer num, boolean z2, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        PortfolioDonutChart(immutableList, function1, modifier, z, num, z2, function0, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final float getSliceStrokeWidth() {
        return SliceStrokeWidth;
    }

    public static final float getDonutChartMaxSize() {
        return DonutChartMaxSize;
    }

    public static final Tuples2<Float, Color>[] getActiveSliceFill() {
        return activeSliceFill;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PortfolioDonutChart$lambda$10(SnapshotState<Size> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PortfolioDonutChart$lambda$13(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PortfolioDonutChart$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioDonutChart7 PortfolioDonutChart$lambda$19(SnapshotState<PortfolioDonutChart7> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long PortfolioDonutChart$lambda$7(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    public static final Tuples2<Float, Color>[] getActiveSliceStroke() {
        return activeSliceStroke;
    }

    /* compiled from: PortfolioDonutChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2 */
    static final class C91502 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Integer $activeIndex;
        final /* synthetic */ Float $activeSlice;
        final /* synthetic */ Float $adjustedInnerDialAngle;
        final /* synthetic */ long $bg;
        final /* synthetic */ SnapshotState<Offset> $center$delegate;
        final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> $centerContent;
        final /* synthetic */ float $chartInnerRadius;
        final /* synthetic */ float $cumulativeGapAngle;
        final /* synthetic */ float $gapAngle;
        final /* synthetic */ Tuples2<Float, Color>[] $inactiveStroke;
        final /* synthetic */ long $innerCircleIndicatorColor;
        final /* synthetic */ long $innerCircleTickColor;
        final /* synthetic */ SnapshotState<Boolean> $isActivelyDragging$delegate;
        final /* synthetic */ SnapshotState<PortfolioDonutChart7> $lastSource$delegate;
        final /* synthetic */ float $maximumSliceArea;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $showInnerDial;
        final /* synthetic */ SnapshotState<Size> $size$delegate;
        final /* synthetic */ ImmutableList<Float> $slices;
        final /* synthetic */ SnapshotState<Offset> $userInputOffset$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C91502(Modifier modifier, float f, long j, Float f2, ImmutableList<Float> immutableList, Integer num, float f3, float f4, Tuples2<Float, Color>[] tuples2Arr, float f5, boolean z, long j2, long j3, Float f6, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, SnapshotState<Size> snapshotState, SnapshotState<Offset> snapshotState2, SnapshotState<PortfolioDonutChart7> snapshotState3, SnapshotState<Boolean> snapshotState4, SnapshotState<Offset> snapshotState5) {
            this.$modifier = modifier;
            this.$chartInnerRadius = f;
            this.$bg = j;
            this.$activeSlice = f2;
            this.$slices = immutableList;
            this.$activeIndex = num;
            this.$maximumSliceArea = f3;
            this.$gapAngle = f4;
            this.$inactiveStroke = tuples2Arr;
            this.$cumulativeGapAngle = f5;
            this.$showInnerDial = z;
            this.$innerCircleIndicatorColor = j2;
            this.$innerCircleTickColor = j3;
            this.$adjustedInnerDialAngle = f6;
            this.$centerContent = function3;
            this.$size$delegate = snapshotState;
            this.$userInputOffset$delegate = snapshotState2;
            this.$lastSource$delegate = snapshotState3;
            this.$isActivelyDragging$delegate = snapshotState4;
            this.$center$delegate = snapshotState5;
        }

        public final void invoke(Composer composer, int i) {
            Object obj;
            Function3<BoxScope, Composer, Integer, Unit> function3;
            int i2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1786919292, i, -1, "com.robinhood.android.advisory.portfolio.PortfolioDonutChart.<anonymous> (PortfolioDonutChart.kt:351)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier modifier = this.$modifier;
            final float f = this.$chartInnerRadius;
            final long j = this.$bg;
            final Float f2 = this.$activeSlice;
            final ImmutableList<Float> immutableList = this.$slices;
            final Integer num = this.$activeIndex;
            final float f3 = this.$maximumSliceArea;
            final float f4 = this.$gapAngle;
            final Tuples2<Float, Color>[] tuples2Arr = this.$inactiveStroke;
            final float f5 = this.$cumulativeGapAngle;
            final boolean z = this.$showInnerDial;
            final long j2 = this.$innerCircleIndicatorColor;
            final long j3 = this.$innerCircleTickColor;
            final Float f6 = this.$adjustedInnerDialAngle;
            Function3<BoxScope, Composer, Integer, Unit> function32 = this.$centerContent;
            final SnapshotState<Size> snapshotState = this.$size$delegate;
            final SnapshotState<Offset> snapshotState2 = this.$userInputOffset$delegate;
            SnapshotState<PortfolioDonutChart7> snapshotState3 = this.$lastSource$delegate;
            final SnapshotState<Boolean> snapshotState4 = this.$isActivelyDragging$delegate;
            final SnapshotState<Offset> snapshotState5 = this.$center$delegate;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, companion.getTop(), composer, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(companion3, 0.0f, PortfolioDonutChart.getDonutChartMaxSize(), 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAspectRatio$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            List list = bentoTheme.getColors(composer, i3).getIsDay() ? PortfolioDonutChart.LightModeGradients : PortfolioDonutChart.DarkModeGradients;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Brush.Companion companion4 = Brush.INSTANCE;
            BoxKt.Box(Background3.background$default(modifierFillMaxSize$default, AngleTools.m11145linearGradientForCenteredCirclecSwnlzA(companion4, list, PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState)), null, 0.0f, 6, null), composer, 0);
            BoxKt.Box(Background3.background$default(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), f), AngleTools.m11145linearGradientForCenteredCirclecSwnlzA(companion4, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(PortfolioDonutChart.PieChartCornerColor)}), PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState)), null, 0.0f, 6, null), composer, 0);
            Modifier modifierRotate = Rotate.rotate(AspectRatio3.aspectRatio$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), -90.0f);
            composer.startReplaceGroup(-1633490746);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue == companion5.getEmpty()) {
                objRememberedValue = new PortfolioDonutChart2(snapshotState2, snapshotState3);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierRotate, "tap_slices", (PointerInputEventHandler) objRememberedValue);
            composer.startReplaceGroup(-1746271574);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new PortfolioDonutChart3(snapshotState2, snapshotState4, snapshotState3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput, "drag_slices", (PointerInputEventHandler) objRememberedValue2);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(j) | composer.changed(f2) | composer.changed(immutableList) | composer.changed(num) | composer.changed(f3) | composer.changed(f4) | composer.changedInstance(tuples2Arr) | composer.changed(f) | composer.changed(f5) | composer.changed(z) | composer.changed(j2) | composer.changed(j3) | composer.changed(f6);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion5.getEmpty()) {
                function3 = function32;
                i2 = 6;
                obj = new Function1() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PortfolioDonutChart.C91502.invoke$lambda$6$lambda$5$lambda$4$lambda$3(j, f2, immutableList, num, f3, tuples2Arr, f4, f, f5, z, j2, j3, f6, snapshotState5, snapshotState, snapshotState2, snapshotState4, (DrawScope) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue3;
                function3 = function32;
                i2 = 6;
            }
            composer.endReplaceGroup();
            Canvas2.Canvas(modifierPointerInput2, (Function1) obj, composer, 0);
            composer.startReplaceGroup(1378202453);
            if (function3 != null) {
                Modifier modifierClipToBounds = Clip.clipToBounds(SizeKt.m5169size3ABfNKs(boxScopeInstance.align(companion3, companion.getCenter()), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f - InnerDialWithCaret.getCenterRadiusPadding()) * 2)));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierClipToBounds);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                function3.invoke(boxScopeInstance, composer, Integer.valueOf(i2));
                composer.endNode();
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(long j, Float f, ImmutableList immutableList, Integer num, float f2, Tuples2[] tuples2Arr, float f3, float f4, float f5, boolean z, long j2, long j3, Float f6, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, DrawScope Canvas) throws Throwable {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            PortfolioDonutChart.PortfolioDonutChart$lambda$8(snapshotState, Canvas.mo6962getCenterF1C5BW0());
            PortfolioDonutChart.PortfolioDonutChart$lambda$11(snapshotState2, Canvas.mo6963getSizeNHjbRc());
            float fM6581getMaxDimensionimpl = Size.m6581getMaxDimensionimpl(PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2)) * 0.025f;
            float fM6581getMaxDimensionimpl2 = Size.m6581getMaxDimensionimpl(PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2)) / 2;
            Rect rectM6564Rect3MmeM6k = Rect2.m6564Rect3MmeM6k(PortfolioDonutChart.PortfolioDonutChart$lambda$7(snapshotState), fM6581getMaxDimensionimpl2);
            Rect rectM6564Rect3MmeM6k2 = Rect2.m6564Rect3MmeM6k(PortfolioDonutChart.PortfolioDonutChart$lambda$7(snapshotState), fM6581getMaxDimensionimpl2 - fM6581getMaxDimensionimpl);
            PortfolioDonutChart.m11148cutouthwW44Og(Canvas, rectM6564Rect3MmeM6k2, j, PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2));
            if (f != null) {
                Iterator<E> it = immutableList.subList(0, num.intValue()).iterator();
                float fFloatValue = 0.0f;
                while (it.hasNext()) {
                    fFloatValue += (((Number) it.next()).floatValue() * f2) + f3;
                }
                float fFloatValue2 = f.floatValue() * f2;
                Brush.Companion companion = Brush.INSTANCE;
                Tuples2<Float, Color>[] activeSliceFill = PortfolioDonutChart.getActiveSliceFill();
                DrawScope.m6944drawArcillE91I$default(Canvas, Brush.Companion.m6679linearGradientmHitzGk$default(companion, (Tuples2[]) Arrays.copyOf(activeSliceFill, activeSliceFill.length), 0L, 0L, 0, 14, (Object) null), fFloatValue, fFloatValue2, true, 0L, PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2), 0.0f, null, null, 0, 976, null);
            }
            PortfolioDonutChart.m11148cutouthwW44Og(Canvas, rectM6564Rect3MmeM6k, j, PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2));
            Brush.Companion companion2 = Brush.INSTANCE;
            Tuples2<Float, Color>[] activeSliceStroke = PortfolioDonutChart.getActiveSliceStroke();
            PortfolioDonutChart.m11150drawSliceStrokesLl2eoaw$default(Canvas, immutableList, num, f3, j, PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2), PortfolioDonutChart.PortfolioDonutChart$lambda$7(snapshotState), rectM6564Rect3MmeM6k, rectM6564Rect3MmeM6k2, f4, Brush.Companion.m6679linearGradientmHitzGk$default(companion2, (Tuples2[]) Arrays.copyOf(activeSliceStroke, activeSliceStroke.length), (PortfolioDonutChart.PortfolioDonutChart$lambda$13(snapshotState3) & 9223372034707292159L) != 9205357640488583168L ? PortfolioDonutChart.PortfolioDonutChart$lambda$13(snapshotState3) : AngleTools.m11144getTopLeftOffsetForCenteredCircleuvyYCjk(PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2)), PortfolioDonutChart.PortfolioDonutChart$lambda$7(snapshotState), 0, 8, (Object) null), f5, Brush.Companion.m6679linearGradientmHitzGk$default(companion2, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), AngleTools.m11144getTopLeftOffsetForCenteredCircleuvyYCjk(PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2)), AngleTools.m11143getBottomRightOffsetForCenteredCircleuvyYCjk(PortfolioDonutChart.PortfolioDonutChart$lambda$10(snapshotState2)), 0, 8, (Object) null), null, 4096, null);
            if (z) {
                InnerDialWithCaret.m11146innerDialWithCaretlyFE1g(Canvas, PortfolioDonutChart.PortfolioDonutChart$lambda$7(snapshotState), f4, f6, PortfolioDonutChart.PortfolioDonutChart$lambda$16(snapshotState4), new SolidColor(j2, null), new SolidColor(j3, null));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Tuples2 tuples2M3642to = Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(4290877422L)));
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(Float.valueOf(0.19f), Color.m6701boximpl(Color2.Color(4290610411L)));
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(Float.valueOf(0.32f), Color.m6701boximpl(Color2.Color(4290746594L)));
        Tuples2 tuples2M3642to4 = Tuples4.m3642to(Float.valueOf(0.4f), Color.m6701boximpl(Color2.Color(4289951967L)));
        Float fValueOf2 = Float.valueOf(0.5f);
        Tuples2 tuples2M3642to5 = Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(4291801057L)));
        Tuples2 tuples2M3642to6 = Tuples4.m3642to(Float.valueOf(0.56f), Color.m6701boximpl(Color2.Color(4292323824L)));
        Tuples2 tuples2M3642to7 = Tuples4.m3642to(Float.valueOf(0.64f), Color.m6701boximpl(Color2.Color(4288768447L)));
        Float fValueOf3 = Float.valueOf(0.96f);
        Tuples2 tuples2M3642to8 = Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(4290598113L)));
        Float fValueOf4 = Float.valueOf(0.99f);
        activeSliceFill = new Tuples2[]{tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, tuples2M3642to7, tuples2M3642to8, Tuples4.m3642to(fValueOf4, Color.m6701boximpl(Color2.Color(4290806250L)))};
        activeSliceStroke = new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.24f), Color.m6701boximpl(Color2.Color(4294967295L))), Tuples4.m3642to(Float.valueOf(0.7f), Color.m6701boximpl(Color2.Color(0))), Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(3238002687L))), Tuples4.m3642to(fValueOf4, Color.m6701boximpl(Color2.Color(4294967295L)))};
        Tuples2 tuples2M3642to9 = Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(1307046655)));
        Tuples2 tuples2M3642to10 = Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(4283650645L)));
        Float fValueOf5 = Float.valueOf(1.0f);
        DarkInactiveSliceStroke = new Tuples2[]{tuples2M3642to9, tuples2M3642to10, Tuples4.m3642to(fValueOf5, Color.m6701boximpl(Color2.Color(1307046655)))};
        LightInactiveSliceStroke = new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(4283650645L))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(4294967295L))), Tuples4.m3642to(fValueOf5, Color.m6701boximpl(Color2.Color(4283650645L)))};
        AdvisoryTween = AnimationSpecKt.tween$default(0, 0, EasingFunctions.getEaseInOut(), 3, null);
    }

    /* renamed from: cutout-hwW44Og, reason: not valid java name */
    public static final void m11148cutouthwW44Og(DrawScope cutout, Rect rect, long j, long j2) throws Throwable {
        long j3;
        Intrinsics.checkNotNullParameter(cutout, "$this$cutout");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Path Path = AndroidPath_androidKt.Path();
        Path.addOval$default(Path, rect, null, 2, null);
        int iM6699getDifferencertfAjoo = ClipOp.INSTANCE.m6699getDifferencertfAjoo();
        DrawContext drawContext = cutout.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6938clipPathmtrdDE(Path, iM6699getDifferencertfAjoo);
            try {
                DrawScope.m6957drawRectAsUm42w$default(cutout, new SolidColor(j, null), 0L, j2, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            } catch (Throwable th) {
                th = th;
                j3 = jMo6936getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(j3);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j3 = jMo6936getSizeNHjbRc;
        }
    }

    /* renamed from: drawSliceStrokes-Ll2eoaw$default, reason: not valid java name */
    public static /* synthetic */ void m11150drawSliceStrokesLl2eoaw$default(DrawScope drawScope, ImmutableList immutableList, Integer num, float f, long j, long j2, long j3, Rect rect, Rect rect2, float f2, Brush brush, float f3, Brush brush2, Brush brush3, int i, Object obj) {
        m11149drawSliceStrokesLl2eoaw(drawScope, immutableList, num, f, j, j2, j3, rect, rect2, f2, brush, f3, (i & 2048) != 0 ? brush : brush2, (i & 4096) != 0 ? null : brush3);
    }

    /* renamed from: drawSliceStrokes-Ll2eoaw, reason: not valid java name */
    public static final void m11149drawSliceStrokesLl2eoaw(DrawScope drawSliceStrokes, ImmutableList<Float> slices, Integer num, float f, long j, long j2, long j3, Rect maximumRingSizeRect, Rect maximumInactiveSizeRect, float f2, Brush activeStrokeBrush, float f3, Brush inactiveStrokeBrush, Brush brush) {
        float f4;
        int i;
        float f5;
        DrawScope drawScope;
        Intrinsics.checkNotNullParameter(drawSliceStrokes, "$this$drawSliceStrokes");
        Intrinsics.checkNotNullParameter(slices, "slices");
        Intrinsics.checkNotNullParameter(maximumRingSizeRect, "maximumRingSizeRect");
        Intrinsics.checkNotNullParameter(maximumInactiveSizeRect, "maximumInactiveSizeRect");
        Intrinsics.checkNotNullParameter(activeStrokeBrush, "activeStrokeBrush");
        Intrinsics.checkNotNullParameter(inactiveStrokeBrush, "inactiveStrokeBrush");
        float f6 = 360.0f - f3;
        DrawScope.m6946drawCircleV9BoPsw$default(drawSliceStrokes, new SolidColor(j, null), drawSliceStrokes.mo5016toPx0680j_4(f2), j3, 0.0f, null, null, 0, 120, null);
        DefaultConstructorMarker defaultConstructorMarker = null;
        DrawScope.m6944drawArcillE91I$default(drawSliceStrokes, new SolidColor(j, null), 0.0f, -f, true, 0L, j2, 0.0f, DrawScope3.INSTANCE, null, 0, 848, null);
        float f7 = 0.0f;
        boolean z = false;
        int i2 = 0;
        for (Float f8 : slices) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = f8.floatValue() * f6;
            if (i2 != slices.size() - 1) {
                f4 = f7;
                f5 = fFloatValue;
                i = i2;
                drawScope = drawSliceStrokes;
                DrawScope.m6944drawArcillE91I$default(drawScope, new SolidColor(j, defaultConstructorMarker), f7 + fFloatValue, f, true, 0L, j2, 0.0f, DrawScope3.INSTANCE, null, 0, 848, null);
            } else {
                f4 = f7;
                i = i2;
                f5 = fFloatValue;
                drawScope = drawSliceStrokes;
            }
            boolean z2 = num != null && i == num.intValue();
            Path Path = AndroidPath_androidKt.Path();
            float f9 = f4;
            float f10 = f5;
            Path.arcTo(z2 ? maximumRingSizeRect : maximumInactiveSizeRect, f9, f10, false);
            Path.arcTo(Rect2.m6564Rect3MmeM6k(j3, drawScope.mo5016toPx0680j_4(f2)), f9 + f10, -f10, false);
            Path.close();
            if (z2 && brush != null) {
                DrawScope.m6954drawPathGBMwjPU$default(drawScope, Path, brush, 0.0f, DrawScope3.INSTANCE, null, 0, 52, null);
            }
            DrawScope.m6954drawPathGBMwjPU$default(drawScope, Path, z2 ? activeStrokeBrush : inactiveStrokeBrush, 0.0f, new Stroke(drawScope.mo5016toPx0680j_4(SliceStrokeWidth), 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 0, null, 26, null), null, 0, 52, null);
            f7 = f9 + f10 + f;
            z = false;
            i2 = i3;
            defaultConstructorMarker = null;
        }
    }

    public static final void performSegmentHapticFeedback(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            view.performHapticFeedback(26);
        }
    }

    public static final AnimationSpec<Float> getAdvisoryTween() {
        return AdvisoryTween;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDonutChart(final ImmutableList<Float> values, final Function1<? super Integer, Unit> onSliceSelected, Modifier modifier, boolean z, Integer num, boolean z2, Function0<Unit> function0, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        Integer num2;
        int i6;
        boolean z4;
        int i7;
        Function0<Unit> function02;
        int i8;
        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int i9;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        Object objRememberedValue5;
        SnapshotState snapshotState2;
        View view;
        List<SliceWindow> sliceWindows;
        Function0<Unit> function03;
        Float fValueOf;
        PortfolioDonutChart7 portfolioDonutChart7PortfolioDonutChart$lambda$19;
        Composer.Companion companion2;
        float f;
        float f2;
        Composer composer2;
        int i10;
        Float f3;
        final Integer num3;
        boolean zChanged;
        Object objRememberedValue6;
        boolean zChanged2;
        Object portfolioDonutChart5;
        final Function0<Unit> function04;
        Float f4;
        final Modifier modifier3;
        final boolean z5;
        final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function33;
        final boolean z6;
        SliceWindow sliceWindow;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(onSliceSelected, "onSliceSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1575144558);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(values) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSliceSelected) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        num2 = num;
                        i3 |= composerStartRestartGroup.changed(num2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                        function32 = function3;
                    } else {
                        function32 = function3;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z7 = i4 == 0 ? true : z3;
                        Integer num4 = i5 == 0 ? null : num2;
                        boolean z8 = i6 == 0 ? true : z4;
                        if (i7 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function02 = (Function0) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function34 = i8 == 0 ? null : function32;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1575144558, i3, -1, "com.robinhood.android.advisory.portfolio.PortfolioDonutChart (PortfolioDonutChart.kt:267)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Size.m6574boximpl(Size.INSTANCE.m6589getZeroNHjbRc()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                            i9 = 2;
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.INSTANCE.m6552getUnspecifiedF1C5BW0()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i9 = 2;
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i9, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        SnapshotState snapshotState5 = (SnapshotState) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, i9, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        float fMo5012toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (PortfolioDonutChart$lambda$10(snapshotState4) >> 32)) * 0.38f);
                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        ImmutableList<Float> immutableListNormalizeValuesForUiAccessibility = !z8 ? Normalization.normalizeValuesForUiAccessibility(values) : values;
                        float f5 = immutableListNormalizeValuesForUiAccessibility.size() > 1 ? 2.0f : 0.0f;
                        float size = immutableListNormalizeValuesForUiAccessibility.size() * f5;
                        float f6 = 360.0f - size;
                        int i12 = i3;
                        sliceWindows = AngleTools.getSliceWindows(immutableListNormalizeValuesForUiAccessibility, f5, size);
                        Float f7 = num4 == null ? (Float) CollectionsKt.getOrNull(immutableListNormalizeValuesForUiAccessibility, num4.intValue()) : null;
                        Float fValueOf2 = (num4 != null || (sliceWindow = (SliceWindow) CollectionsKt.getOrNull(sliceWindows, num4.intValue())) == null) ? null : Float.valueOf(sliceWindow.getMidPoint());
                        if (Offset.m6540equalsimpl0(PortfolioDonutChart$lambda$13(snapshotState), Offset.INSTANCE.m6552getUnspecifiedF1C5BW0())) {
                            function03 = function02;
                            fValueOf = Float.valueOf(AngleTools.m11140calculateTouchAngleAccordingToCanvas0a9Yr6o(PortfolioDonutChart$lambda$7(snapshotState3), AngleTools.m11142findNormalizedPointFromTouch0a9Yr6o(PortfolioDonutChart$lambda$13(snapshotState), PortfolioDonutChart$lambda$7(snapshotState3))));
                        } else {
                            function03 = function02;
                            fValueOf = fValueOf2;
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i13 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i13).m21371getBg0d7_KjU();
                        long jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i13).m21427getFg30d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i13).m21425getFg0d7_KjU();
                        Tuples2<Float, Color>[] tuples2Arr = !bentoTheme.getColors(composerStartRestartGroup, i13).getIsDay() ? DarkInactiveSliceStroke : LightInactiveSliceStroke;
                        portfolioDonutChart7PortfolioDonutChart$lambda$19 = PortfolioDonutChart$lambda$19(snapshotState2);
                        composerStartRestartGroup.startReplaceGroup(1885498756);
                        if (portfolioDonutChart7PortfolioDonutChart$lambda$19 instanceof PortfolioDonutChart7.DragRelease) {
                            companion2 = companion;
                            f = f5;
                            f2 = size;
                            composer2 = composerStartRestartGroup;
                            i10 = 16384;
                            if (!Intrinsics.areEqual(portfolioDonutChart7PortfolioDonutChart$lambda$19, PortfolioDonutChart7.Tap.INSTANCE)) {
                                if (Intrinsics.areEqual(portfolioDonutChart7PortfolioDonutChart$lambda$19, PortfolioDonutChart7.Drag.INSTANCE)) {
                                    fValueOf2 = fValueOf;
                                } else if (portfolioDonutChart7PortfolioDonutChart$lambda$19 != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        } else {
                            PortfolioDonutChart7.DragRelease dragRelease = (PortfolioDonutChart7.DragRelease) portfolioDonutChart7PortfolioDonutChart$lambda$19;
                            if ((dragRelease.m11155getLastOffsetF1C5BW0() & 9223372034707292159L) == 9205357640488583168L || fValueOf2 == null) {
                                companion2 = companion;
                                f = f5;
                                f2 = size;
                                composer2 = composerStartRestartGroup;
                                i10 = 16384;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue8 == companion.getEmpty()) {
                                    companion2 = companion;
                                    objRememberedValue8 = SnapshotFloatState3.mutableFloatStateOf(AngleTools.m11140calculateTouchAngleAccordingToCanvas0a9Yr6o(PortfolioDonutChart$lambda$7(snapshotState3), AngleTools.m11142findNormalizedPointFromTouch0a9Yr6o(dragRelease.m11155getLastOffsetF1C5BW0(), PortfolioDonutChart$lambda$7(snapshotState3))));
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                } else {
                                    companion2 = companion;
                                }
                                SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue8;
                                composerStartRestartGroup.endReplaceGroup();
                                Unit unit = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChanged3 = composerStartRestartGroup.changed(fValueOf2);
                                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (zChanged3 || objRememberedValue9 == companion2.getEmpty()) {
                                    objRememberedValue9 = new PortfolioDonutChart6(fValueOf2, snapshotFloatState2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 6);
                                f2 = size;
                                f = f5;
                                i10 = 16384;
                                composer2 = composerStartRestartGroup;
                                fValueOf2 = AnimateAsState.animateFloatAsState(snapshotFloatState2.getFloatValue(), AdvisoryTween, 0.0f, null, null, composerStartRestartGroup, 0, 28).getValue();
                            }
                        }
                        composer2.endReplaceGroup();
                        f3 = f7;
                        num3 = num4;
                        Interactions2.ChartViewConfigurationProvider(null, ComposableLambda3.rememberComposableLambda(1786919292, true, new C91502(modifier4, fMo5012toDpu2uoSUM, jM21371getBg0d7_KjU, f7, immutableListNormalizeValuesForUiAccessibility, num4, f6, f, tuples2Arr, f2, z7, jM21425getFg0d7_KjU, jM21427getFg30d7_KjU, fValueOf2 == null ? Float.valueOf((fValueOf2.floatValue() + 90.0f) % 360.0f) : null, function34, snapshotState4, snapshotState, snapshotState2, snapshotState5, snapshotState3), composer2, 54), composer2, 48, 1);
                        composer2.startReplaceGroup(-1633490746);
                        zChanged = composer2.changed(f3) | composer2.changedInstance(view);
                        objRememberedValue6 = composer2.rememberedValue();
                        if (!zChanged || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = new PortfolioDonutChart4(f3, view, null);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(f3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer2, 0);
                        composer2.startReplaceGroup(-1224400529);
                        zChanged2 = composer2.changed(fValueOf) | composer2.changedInstance(sliceWindows) | ((i12 & 57344) != i10) | ((i12 & 112) != 32) | ((i12 & 3670016) == 1048576);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (!zChanged2 || objRememberedValue10 == companion2.getEmpty()) {
                            function04 = function03;
                            f4 = fValueOf;
                            portfolioDonutChart5 = new PortfolioDonutChart5(f4, sliceWindows, num3, onSliceSelected, function04, snapshotState2, null);
                            composer2.updateRememberedValue(portfolioDonutChart5);
                        } else {
                            function04 = function03;
                            portfolioDonutChart5 = objRememberedValue10;
                            f4 = fValueOf;
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(f4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) portfolioDonutChart5, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z5 = z7;
                        function33 = function34;
                        z6 = z8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        function04 = function02;
                        modifier3 = modifier2;
                        z5 = z3;
                        z6 = z4;
                        num3 = num2;
                        function33 = function32;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PortfolioDonutChart.PortfolioDonutChart$lambda$31(values, onSliceSelected, modifier3, z5, num3, z6, function04, function33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                num2 = num;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i11 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState42 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState52 = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    float fMo5012toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (PortfolioDonutChart$lambda$10(snapshotState42) >> 32)) * 0.38f);
                    view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    if (!z8) {
                    }
                    if (immutableListNormalizeValuesForUiAccessibility.size() > 1) {
                    }
                    float size2 = immutableListNormalizeValuesForUiAccessibility.size() * f5;
                    float f62 = 360.0f - size2;
                    int i122 = i3;
                    sliceWindows = AngleTools.getSliceWindows(immutableListNormalizeValuesForUiAccessibility, f5, size2);
                    if (num4 == null) {
                    }
                    if (num4 != null) {
                        if (Offset.m6540equalsimpl0(PortfolioDonutChart$lambda$13(snapshotState), Offset.INSTANCE.m6552getUnspecifiedF1C5BW0())) {
                        }
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i132 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i132).m21371getBg0d7_KjU();
                        long jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i132).m21427getFg30d7_KjU();
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i132).m21425getFg0d7_KjU();
                        Tuples2<Float, Color>[] tuples2Arr2 = !bentoTheme2.getColors(composerStartRestartGroup, i132).getIsDay() ? DarkInactiveSliceStroke : LightInactiveSliceStroke;
                        portfolioDonutChart7PortfolioDonutChart$lambda$19 = PortfolioDonutChart$lambda$19(snapshotState2);
                        composerStartRestartGroup.startReplaceGroup(1885498756);
                        if (portfolioDonutChart7PortfolioDonutChart$lambda$19 instanceof PortfolioDonutChart7.DragRelease) {
                        }
                        composer2.endReplaceGroup();
                        f3 = f7;
                        num3 = num4;
                        Interactions2.ChartViewConfigurationProvider(null, ComposableLambda3.rememberComposableLambda(1786919292, true, new C91502(modifier4, fMo5012toDpu2uoSUM2, jM21371getBg0d7_KjU2, f7, immutableListNormalizeValuesForUiAccessibility, num4, f62, f, tuples2Arr2, f2, z7, jM21425getFg0d7_KjU2, jM21427getFg30d7_KjU2, fValueOf2 == null ? Float.valueOf((fValueOf2.floatValue() + 90.0f) % 360.0f) : null, function34, snapshotState42, snapshotState, snapshotState2, snapshotState52, snapshotState32), composer2, 54), composer2, 48, 1);
                        composer2.startReplaceGroup(-1633490746);
                        zChanged = composer2.changed(f3) | composer2.changedInstance(view);
                        objRememberedValue6 = composer2.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue6 = new PortfolioDonutChart4(f3, view, null);
                            composer2.updateRememberedValue(objRememberedValue6);
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(f3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer2, 0);
                            composer2.startReplaceGroup(-1224400529);
                            zChanged2 = composer2.changed(fValueOf) | composer2.changedInstance(sliceWindows) | ((i122 & 57344) != i10) | ((i122 & 112) != 32) | ((i122 & 3670016) == 1048576);
                            Object objRememberedValue102 = composer2.rememberedValue();
                            if (zChanged2) {
                                function04 = function03;
                                f4 = fValueOf;
                                portfolioDonutChart5 = new PortfolioDonutChart5(f4, sliceWindows, num3, onSliceSelected, function04, snapshotState2, null);
                                composer2.updateRememberedValue(portfolioDonutChart5);
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(f4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) portfolioDonutChart5, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier4;
                                z5 = z7;
                                function33 = function34;
                                z6 = z8;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            num2 = num;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        num2 = num;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioDonutChart$lambda$8(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioDonutChart$lambda$11(SnapshotState<Size> snapshotState, long j) {
        snapshotState.setValue(Size.m6574boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioDonutChart$lambda$14(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioDonutChart$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}
