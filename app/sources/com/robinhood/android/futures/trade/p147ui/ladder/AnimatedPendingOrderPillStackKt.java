package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathMeasure;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.sharedfuturesui.animations.PathMeasures;
import com.robinhood.android.futures.trade.p147ui.ladder.AnimatedPendingOrderPillStackKt;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.PillStackMovementData;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0002\u0010 \u001aA\u0010!\u001a\u00020\"*\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010%\u001a\u00020&2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0003¢\u0006\u0002\u0010+\u001a[\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010%\u001a\u00020&2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0001¢\u0006\u0002\u0010,\u001a\r\u0010/\u001a\u00020\"H\u0003¢\u0006\u0002\u00100\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0.X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u00010\u001f0302X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000209X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020;X\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020=X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002"}, m3636d2 = {"getPositionAtProgress", "Lcom/robinhood/android/futures/trade/ui/ladder/Point;", "Landroidx/compose/ui/graphics/PathMeasure;", "xOffsetSize", "Landroidx/compose/ui/unit/Dp;", "progress", "", "getPositionAtProgress-lG28NQ4", "(Landroidx/compose/ui/graphics/PathMeasure;FF)Lcom/robinhood/android/futures/trade/ui/ladder/Point;", "topPillShuffleRightPath", "Landroidx/compose/ui/graphics/Path;", "topPillShuffleLeftPath", "topPillShuffleRightPathMeasure", "topPillShuffleLeftPathMeasure", "bottomPillShuffleLeftPath", "bottomPillShuffleRightPath", "bottomPillShuffleLeftPathMeasure", "bottomPillShuffleRightPathMeasure", "pillShuffleEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "pillMoveInOutEasing", "rememberPillStackTransitionDataState", "Landroidx/compose/runtime/State;", "Lcom/robinhood/android/futures/trade/ui/ladder/PillStackMovementData;", "orderGroup", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;", "selectedIndex", "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "dragDirection", "Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;Ljava/lang/Integer;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "AnimatedPendingOrderPillStack", "", "Landroidx/compose/foundation/layout/BoxScope;", "movementData", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "alignment", "Landroidx/compose/ui/Alignment;", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/futures/trade/ui/ladder/PillStackMovementData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;Ljava/lang/Integer;Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V", "previewTestQuantities", "", "PreviewAnimatedPendingOrderPill", "(Landroidx/compose/runtime/Composer;I)V", "previewDragDirectionOptions", "Lkotlinx/collections/immutable/PersistentList;", "Lkotlin/Pair;", "", "feature-futures-trade_externalDebug", "stackStateTracker", "Lcom/robinhood/android/futures/trade/ui/ladder/StackStateTracker;", "settings", "Lcom/robinhood/android/futures/trade/ui/ladder/PillStackMovementData$Settings;", "animationState", "Lcom/robinhood/android/futures/trade/ui/ladder/PillStackMovementData$AnimationState;", "isDay", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AnimatedPendingOrderPillStackKt {
    private static final Path bottomPillShuffleLeftPath;
    private static final PathMeasure bottomPillShuffleLeftPathMeasure;
    private static final Path bottomPillShuffleRightPath;
    private static final PathMeasure bottomPillShuffleRightPathMeasure;
    private static final CubicBezierEasing pillMoveInOutEasing;
    private static final CubicBezierEasing pillShuffleEasing;
    private static final ImmutableList3<Tuples2<String, LadderCustomGestureDetector>> previewDragDirectionOptions;
    private static final List<Integer> previewTestQuantities;
    private static final Path topPillShuffleLeftPath;
    private static final PathMeasure topPillShuffleLeftPathMeasure;
    private static final Path topPillShuffleRightPath;
    private static final PathMeasure topPillShuffleRightPathMeasure;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedPendingOrderPillStack$lambda$13(BoxScope boxScope, PillStackMovementData pillStackMovementData, Modifier modifier, Function0 function0, Alignment alignment, int i, int i2, Composer composer, int i3) {
        AnimatedPendingOrderPillStack(boxScope, pillStackMovementData, modifier, function0, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedPendingOrderPillStack$lambda$17(BoxScope boxScope, PillStackMovementData pillStackMovementData, Modifier modifier, Function0 function0, Alignment alignment, int i, int i2, Composer composer, int i3) {
        AnimatedPendingOrderPillStack(boxScope, pillStackMovementData, modifier, function0, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedPendingOrderPillStack$lambda$21(BoxScope boxScope, FuturesOrderSide futuresOrderSide, FuturesLadderViewState.LadderData.PendingOrderRow.Group group, Integer num, LadderCustomGestureDetector ladderCustomGestureDetector, Modifier modifier, Function0 function0, Alignment alignment, int i, int i2, Composer composer, int i3) {
        AnimatedPendingOrderPillStack(boxScope, futuresOrderSide, group, num, ladderCustomGestureDetector, modifier, function0, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAnimatedPendingOrderPill$lambda$25(int i, Composer composer, int i2) {
        PreviewAnimatedPendingOrderPill(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        Path pathM14740buildQuadraticBezierCurvePathr6Wiys = PathMeasures.m14740buildQuadraticBezierCurvePathr6Wiys(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(-1.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(1.1f) << 32) | (Float.floatToRawIntBits(-0.1f) & 4294967295L)));
        topPillShuffleRightPath = pathM14740buildQuadraticBezierCurvePathr6Wiys;
        Path pathM14740buildQuadraticBezierCurvePathr6Wiys2 = PathMeasures.m14740buildQuadraticBezierCurvePathr6Wiys(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(-1.0f) << 32) | (Float.floatToRawIntBits(-1.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(-1.1f) << 32) | (Float.floatToRawIntBits(-0.1f) & 4294967295L)));
        topPillShuffleLeftPath = pathM14740buildQuadraticBezierCurvePathr6Wiys2;
        topPillShuffleRightPathMeasure = PathMeasures.pathMeasure(pathM14740buildQuadraticBezierCurvePathr6Wiys);
        topPillShuffleLeftPathMeasure = PathMeasures.pathMeasure(pathM14740buildQuadraticBezierCurvePathr6Wiys2);
        Path pathM14740buildQuadraticBezierCurvePathr6Wiys3 = PathMeasures.m14740buildQuadraticBezierCurvePathr6Wiys(Offset.m6535constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(-1.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(-0.1f) << 32) | (Float.floatToRawIntBits(-0.9f) & 4294967295L)));
        bottomPillShuffleLeftPath = pathM14740buildQuadraticBezierCurvePathr6Wiys3;
        Path pathM14740buildQuadraticBezierCurvePathr6Wiys4 = PathMeasures.m14740buildQuadraticBezierCurvePathr6Wiys(Offset.m6535constructorimpl((Float.floatToRawIntBits(-1.0f) & 4294967295L) | (Float.floatToRawIntBits(-1.0f) << 32)), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(0.1f) << 32) | (Float.floatToRawIntBits(-0.9f) & 4294967295L)));
        bottomPillShuffleRightPath = pathM14740buildQuadraticBezierCurvePathr6Wiys4;
        bottomPillShuffleLeftPathMeasure = PathMeasures.pathMeasure(pathM14740buildQuadraticBezierCurvePathr6Wiys3);
        bottomPillShuffleRightPathMeasure = PathMeasures.pathMeasure(pathM14740buildQuadraticBezierCurvePathr6Wiys4);
        pillShuffleEasing = new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f);
        pillMoveInOutEasing = new CubicBezierEasing(0.61f, 0.0f, 0.0f, 1.0f);
        previewTestQuantities = CollectionsKt.listOf((Object[]) new Integer[]{2, 5});
        previewDragDirectionOptions = extensions2.persistentListOf(Tuples4.m3642to("null", null), Tuples4.m3642to("Vertical", LadderCustomGestureDetector.VERTICAL), Tuples4.m3642to("Horizontal", LadderCustomGestureDetector.HORIZONTAL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPositionAtProgress-lG28NQ4, reason: not valid java name */
    public static final Point m14753getPositionAtProgresslG28NQ4(PathMeasure pathMeasure, float f, float f2) {
        long offsetAtCurrentProgress = PathMeasures.getOffsetAtCurrentProgress(pathMeasure, f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (offsetAtCurrentProgress >> 32));
        return new Point(C2002Dp.m7995constructorimpl(fIntBitsToFloat * f), Float.intBitsToFloat((int) (offsetAtCurrentProgress & 4294967295L)), null);
    }

    /* compiled from: AnimatedPendingOrderPillStack.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$PreviewAnimatedPendingOrderPill$1 */
    static final class C174821 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $isDay$delegate;

        C174821(SnapshotState<Boolean> snapshotState) {
            this.$isDay$delegate = snapshotState;
        }

        private static final FuturesOrderSide invoke$lambda$1(SnapshotState<FuturesOrderSide> snapshotState) {
            return snapshotState.getValue();
        }

        private static final LadderCustomGestureDetector invoke$lambda$11(SnapshotState<LadderCustomGestureDetector> snapshotState) {
            return snapshotState.getValue();
        }

        private static final FuturesLadderViewState.LadderData.PendingOrderRow.Group invoke$lambda$6(SnapshotState4<FuturesLadderViewState.LadderData.PendingOrderRow.Group> snapshotState4) {
            return snapshotState4.getValue();
        }

        private static final Integer invoke$lambda$8(SnapshotState<Integer> snapshotState) {
            return snapshotState.getValue();
        }

        public final void invoke(Composer composer, int i) {
            int i2;
            final SnapshotState snapshotState;
            final SnapshotState<Boolean> snapshotState2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-354415705, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewAnimatedPendingOrderPill.<anonymous> (AnimatedPendingOrderPillStack.kt:711)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(FuturesOrderSide.BUY, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$PreviewAnimatedPendingOrderPill$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnimatedPendingOrderPillStackKt.C174821.invoke$lambda$5$lambda$4(snapshotState3);
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState6 = (SnapshotState) objRememberedValue4;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            SnapshotState<Boolean> snapshotState7 = this.$isDay$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            FuturesOrderSide futuresOrderSideInvoke$lambda$1 = invoke$lambda$1(snapshotState3);
            FuturesLadderViewState.LadderData.PendingOrderRow.Group groupInvoke$lambda$6 = invoke$lambda$6(snapshotState4);
            Integer numInvoke$lambda$8 = invoke$lambda$8(snapshotState5);
            LadderCustomGestureDetector ladderCustomGestureDetectorInvoke$lambda$11 = invoke$lambda$11(snapshotState6);
            composer.startReplaceGroup(-1746271574);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$PreviewAnimatedPendingOrderPill$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnimatedPendingOrderPillStackKt.C174821.invoke$lambda$26$lambda$15$lambda$14$lambda$13(snapshotState6, snapshotState4, snapshotState5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack(boxScopeInstance, futuresOrderSideInvoke$lambda$1, groupInvoke$lambda$6, numInvoke$lambda$8, ladderCustomGestureDetectorInvoke$lambda$11, null, (Function0) objRememberedValue5, null, composer, 1572870, 80);
            composer.endNode();
            ImmutableList3 immutableList3 = AnimatedPendingOrderPillStackKt.previewDragDirectionOptions;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
            Iterator<E> it = immutableList3.iterator();
            while (it.hasNext()) {
                arrayList.add(new Segment(null, (String) ((Tuples2) it.next()).getFirst(), null, 5, null));
            }
            Iterator<E> it2 = AnimatedPendingOrderPillStackKt.previewDragDirectionOptions.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (((Tuples2) it2.next()).getSecond() == invoke$lambda$11(snapshotState6)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            }
            composer.startReplaceGroup(-1633490746);
            Object objRememberedValue6 = composer.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue6 == companion5.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$PreviewAnimatedPendingOrderPill$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AnimatedPendingOrderPillStackKt.C174821.invoke$lambda$26$lambda$19$lambda$18(snapshotState6, snapshotState5, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            BentoSegmentedControl2.BentoSegmentedControl(arrayList, i2, (Function1) objRememberedValue6, null, false, composer, 384, 24);
            composer.startReplaceGroup(-1633490746);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion5.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$PreviewAnimatedPendingOrderPill$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnimatedPendingOrderPillStackKt.C174821.invoke$lambda$26$lambda$21$lambda$20(snapshotState5, snapshotState6);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue7, "Clear selection", null, null, null, false, false, null, null, null, null, false, null, composer, 54, 0, 8188);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion5.getEmpty()) {
                snapshotState = snapshotState3;
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$PreviewAnimatedPendingOrderPill$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnimatedPendingOrderPillStackKt.C174821.invoke$lambda$26$lambda$23$lambda$22(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            } else {
                snapshotState = snapshotState3;
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue8, "Toggle Side (" + invoke$lambda$1(snapshotState) + ")", null, null, null, false, false, null, null, null, null, false, null, composer, 6, 0, 8188);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue9 = composer.rememberedValue();
            if (objRememberedValue9 == companion5.getEmpty()) {
                snapshotState2 = snapshotState7;
                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$PreviewAnimatedPendingOrderPill$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnimatedPendingOrderPillStackKt.C174821.invoke$lambda$26$lambda$25$lambda$24(snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            } else {
                snapshotState2 = snapshotState7;
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue9, "Toggle isDay (" + AnimatedPendingOrderPillStackKt.PreviewAnimatedPendingOrderPill$lambda$23(snapshotState2) + ")", null, null, null, false, false, null, null, null, null, false, null, composer, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("Selected Index: " + invoke$lambda$8(snapshotState5), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
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
        public static final FuturesLadderViewState.LadderData.PendingOrderRow.Group invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
            List list = AnimatedPendingOrderPillStackKt.previewTestQuantities;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                arrayList.add(new FuturesLadderViewState.LadderData.UiPendingOrder(uuidRandomUUID, 0, invoke$lambda$1(snapshotState), StringResource.INSTANCE.invoke("+" + iIntValue + " LMT"), false));
            }
            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
            StringResource.Companion companion = StringResource.INSTANCE;
            return new FuturesLadderViewState.LadderData.PendingOrderRow.Group(immutableList, companion.invoke("+" + CollectionsKt.sumOfInt(AnimatedPendingOrderPillStackKt.previewTestQuantities) + " LMT"), companion.invoke(""));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$15$lambda$14$lambda$13(SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState snapshotState2) {
            snapshotState.setValue(null);
            snapshotState2.setValue(Integer.valueOf(FuturesLadderViewState.LadderData.UiPendingOrder.INSTANCE.nextIndex(invoke$lambda$6(snapshotState4).getOrders(), invoke$lambda$8(snapshotState2))));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit invoke$lambda$26$lambda$19$lambda$18(SnapshotState snapshotState, SnapshotState snapshotState2, int i) {
            snapshotState.setValue((LadderCustomGestureDetector) ((Tuples2) AnimatedPendingOrderPillStackKt.previewDragDirectionOptions.get(i)).getSecond());
            if (invoke$lambda$11(snapshotState) == null) {
                snapshotState2.setValue(null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$21$lambda$20(SnapshotState snapshotState, SnapshotState snapshotState2) {
            snapshotState.setValue(null);
            snapshotState2.setValue(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$23$lambda$22(SnapshotState snapshotState) {
            FuturesOrderSide futuresOrderSideInvoke$lambda$1 = invoke$lambda$1(snapshotState);
            FuturesOrderSide futuresOrderSide = FuturesOrderSide.BUY;
            if (futuresOrderSideInvoke$lambda$1 == futuresOrderSide) {
                futuresOrderSide = FuturesOrderSide.SELL;
            }
            snapshotState.setValue(futuresOrderSide);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$26$lambda$25$lambda$24(SnapshotState snapshotState) {
            AnimatedPendingOrderPillStackKt.PreviewAnimatedPendingOrderPill$lambda$24(snapshotState, !AnimatedPendingOrderPillStackKt.PreviewAnimatedPendingOrderPill$lambda$23(snapshotState));
            return Unit.INSTANCE;
        }
    }

    private static final PillStackMovementData AnimatedPendingOrderPillStack$lambda$20(SnapshotState4<PillStackMovementData> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PreviewAnimatedPendingOrderPill$lambda$23(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackStateTracker rememberPillStackTransitionDataState$lambda$2(SnapshotState<StackStateTracker> snapshotState) {
        return snapshotState.getValue();
    }

    private static final PillStackMovementData.Settings rememberPillStackTransitionDataState$lambda$5(SnapshotState4<PillStackMovementData.Settings> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final PillStackMovementData.AnimationState rememberPillStackTransitionDataState$lambda$8(SnapshotState4<PillStackMovementData.AnimationState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PillStackMovementData.AnimationState rememberPillStackTransitionDataState$lambda$7$lambda$6(SnapshotState snapshotState) {
        return new PillStackMovementData.AnimationState(rememberPillStackTransitionDataState$lambda$2(snapshotState).isAnimating(), rememberPillStackTransitionDataState$lambda$2(snapshotState).getProgress(), rememberPillStackTransitionDataState$lambda$2(snapshotState).getAnimationType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PillStackMovementData rememberPillStackTransitionDataState$lambda$10$lambda$9(SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        PillStackState currentPillStackState = rememberPillStackTransitionDataState$lambda$2(snapshotState).getCurrentPillStackState();
        if (currentPillStackState == null) {
            return null;
        }
        return new PillStackMovementData(rememberPillStackTransitionDataState$lambda$2(snapshotState).getLastPillStackState(), currentPillStackState, rememberPillStackTransitionDataState$lambda$8(snapshotState42), rememberPillStackTransitionDataState$lambda$5(snapshotState4));
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AnimatedPendingOrderPillStack(final BoxScope boxScope, final PillStackMovementData pillStackMovementData, Modifier modifier, Function0<Unit> function0, Alignment alignment, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Alignment alignment2;
        Modifier modifierAlign;
        Modifier modifier3;
        Alignment alignment3;
        BoxScopeInstance boxScopeInstance;
        final Function0<Unit> function03;
        final Modifier modifier4;
        final Alignment alignment4;
        long j;
        Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1527305721);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(pillStackMovementData) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        alignment2 = alignment;
                        i3 |= composerStartRestartGroup.changed(alignment2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        function03 = function02;
                        alignment4 = alignment2;
                    } else {
                        Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function02 = (Function0) objRememberedValue;
                        }
                        final Alignment alignment5 = i5 == 0 ? null : alignment2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1527305721, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStack (AnimatedPendingOrderPillStack.kt:642)");
                        }
                        if (pillStackMovementData == null) {
                            Modifier modifier6 = modifier5;
                            Alignment alignment6 = alignment5;
                            Function0<Unit> function05 = function02;
                            if (alignment6 == null || (modifierAlign = boxScope.align(modifier6, alignment6)) == null) {
                                modifierAlign = modifier6;
                            }
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1514677447);
                            if (pillStackMovementData.getTopLabel() == null || pillStackMovementData.getTopPillPos() == null) {
                                modifier3 = modifier6;
                                alignment3 = alignment6;
                                boxScopeInstance = boxScopeInstance2;
                            } else {
                                FuturesOrderSide side = pillStackMovementData.getSide();
                                long jM14860getTopPillColor0d7_KjU = pillStackMovementData.getTopPillColor();
                                StringResource topLabel = pillStackMovementData.getTopLabel();
                                boolean showLoadingShimmerForTop = pillStackMovementData.getShowLoadingShimmerForTop();
                                long jM14882getTopLoadingBackgroundColor0d7_KjU = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14882getTopLoadingBackgroundColor0d7_KjU();
                                if (pillStackMovementData.getIsLadderClickable()) {
                                    j = jM14882getTopLoadingBackgroundColor0d7_KjU;
                                    function04 = function05;
                                } else {
                                    j = jM14882getTopLoadingBackgroundColor0d7_KjU;
                                    function04 = null;
                                }
                                modifier3 = modifier6;
                                alignment3 = alignment6;
                                boxScopeInstance = boxScopeInstance2;
                                PendingOrderPillKt.m14856PillnjYn8yo(side, topLabel, jM14860getTopPillColor0d7_KjU, j, OffsetKt.m5125offsetVpY3zN4$default(ZIndexModifier2.zIndex(Modifier.INSTANCE, pillStackMovementData.getTopPillPos().getZ()), pillStackMovementData.getTopPillPos().m14888getXD9Ej5fM(), 0.0f, 2, null), function04, null, showLoadingShimmerForTop, composerStartRestartGroup, StringResource.$stable << 3, 64);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1514698929);
                            if (pillStackMovementData.getBottomLabel() != null && pillStackMovementData.getBottomPillPos() != null) {
                                PendingOrderPillKt.m14856PillnjYn8yo(pillStackMovementData.getSide(), pillStackMovementData.getBottomLabel(), pillStackMovementData.getBottomPillColor(), ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14881getBottomLoadingBackgroundColor0d7_KjU(), ZIndexModifier2.zIndex(OffsetKt.m5125offsetVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, PendingOrderPillKt.getBottomPillLabelAlignment(alignment3)), pillStackMovementData.getBottomPillPos().m14888getXD9Ej5fM(), 0.0f, 2, null), pillStackMovementData.getBottomPillPos().getZ()), null, null, pillStackMovementData.getShowLoadingShimmerForBottom(), composerStartRestartGroup, StringResource.$stable << 3, 96);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function03 = function05;
                            modifier4 = modifier3;
                            alignment4 = alignment3;
                        } else {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup2 != null) {
                                final Modifier modifier7 = modifier5;
                                final Function0<Unit> function06 = function02;
                                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack$lambda$13(boxScope, pillStackMovementData, modifier7, function06, alignment5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack$lambda$17(boxScope, pillStackMovementData, modifier4, function03, alignment4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                alignment2 = alignment;
                if ((i3 & 9363) != 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (pillStackMovementData == null) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            alignment2 = alignment;
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedPendingOrderPillStack(final BoxScope boxScope, final FuturesOrderSide side, final FuturesLadderViewState.LadderData.PendingOrderRow.Group orderGroup, final Integer num, final LadderCustomGestureDetector ladderCustomGestureDetector, Modifier modifier, Function0<Unit> function0, Alignment alignment, Composer composer, final int i, final int i2) {
        int i3;
        Integer num2;
        int i4;
        Modifier modifier2;
        int i5;
        Function0<Unit> function02;
        int i6;
        Alignment alignment2;
        int i7;
        final Modifier modifier3;
        final Function0<Unit> function03;
        final Alignment alignment3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orderGroup, "orderGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(1081760879);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(side.ordinal()) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(orderGroup) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                num2 = num;
                i3 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
            }
            if ((i2 & 8) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(ladderCustomGestureDetector == null ? -1 : ladderCustomGestureDetector.ordinal()) ? 16384 : 8192;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((12582912 & i) == 0) {
                            alignment2 = alignment;
                            i3 |= composerStartRestartGroup.changed(alignment2) ? 8388608 : 4194304;
                        }
                        i7 = i3;
                        if ((4793491 & i7) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue;
                            }
                            if (i6 != 0) {
                                alignment2 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1081760879, i7, -1, "com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStack (AnimatedPendingOrderPillStack.kt:689)");
                            }
                            PillStackMovementData pillStackMovementDataAnimatedPendingOrderPillStack$lambda$20 = AnimatedPendingOrderPillStack$lambda$20(rememberPillStackTransitionDataState(orderGroup, num2, side, ladderCustomGestureDetector, composerStartRestartGroup, ((i7 >> 6) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i7 << 3) & 896) | ((i7 >> 3) & 7168)));
                            int i8 = i7 >> 9;
                            int i9 = (i7 & 14) | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
                            Modifier modifier4 = modifier2;
                            Function0<Unit> function04 = function02;
                            Alignment alignment4 = alignment2;
                            AnimatedPendingOrderPillStack(boxScope, pillStackMovementDataAnimatedPendingOrderPillStack$lambda$20, modifier4, function04, alignment4, composerStartRestartGroup, i9, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            function03 = function04;
                            alignment3 = alignment4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function03 = function02;
                            alignment3 = alignment2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack$lambda$21(boxScope, side, orderGroup, num, ladderCustomGestureDetector, modifier3, function03, alignment3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    alignment2 = alignment;
                    i7 = i3;
                    if ((4793491 & i7) != 4793490) {
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        PillStackMovementData pillStackMovementDataAnimatedPendingOrderPillStack$lambda$202 = AnimatedPendingOrderPillStack$lambda$20(rememberPillStackTransitionDataState(orderGroup, num2, side, ladderCustomGestureDetector, composerStartRestartGroup, ((i7 >> 6) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i7 << 3) & 896) | ((i7 >> 3) & 7168)));
                        int i82 = i7 >> 9;
                        int i92 = (i7 & 14) | (i82 & 896) | (i82 & 7168) | (i82 & 57344);
                        Modifier modifier42 = modifier2;
                        Function0<Unit> function042 = function02;
                        Alignment alignment42 = alignment2;
                        AnimatedPendingOrderPillStack(boxScope, pillStackMovementDataAnimatedPendingOrderPillStack$lambda$202, modifier42, function042, alignment42, composerStartRestartGroup, i92, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        function03 = function042;
                        alignment3 = alignment42;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                alignment2 = alignment;
                i7 = i3;
                if ((4793491 & i7) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            alignment2 = alignment;
            i7 = i3;
            if ((4793491 & i7) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        num2 = num;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        alignment2 = alignment;
        i7 = i3;
        if ((4793491 & i7) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PreviewAnimatedPendingOrderPill(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-40172378);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-40172378, i, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewAnimatedPendingOrderPill (AnimatedPendingOrderPillStack.kt:708)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(PreviewAnimatedPendingOrderPill$lambda$23(snapshotState), ComposableLambda3.rememberComposableLambda(-354415705, true, new C174821(snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AnimatedPendingOrderPillStackKt.PreviewAnimatedPendingOrderPill$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewAnimatedPendingOrderPill$lambda$24(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SnapshotState4<PillStackMovementData> rememberPillStackTransitionDataState(FuturesLadderViewState.LadderData.PendingOrderRow.Group group, Integer num, FuturesOrderSide futuresOrderSide, LadderCustomGestureDetector ladderCustomGestureDetector, Composer composer, int i) {
        final SnapshotState snapshotState;
        composer.startReplaceGroup(668337700);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668337700, i, -1, "com.robinhood.android.futures.trade.ui.ladder.rememberPillStackTransitionDataState (AnimatedPendingOrderPillStack.kt:560)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(new StackStateTracker(null, PillStackState.INSTANCE.from(group, num, ladderCustomGestureDetector), false, 0.0f), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean z = true;
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(group)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(num)) || (i & 48) == 32);
        if (((i & 7168) ^ 3072) > 2048) {
            if (!composer.changed(ladderCustomGestureDetector != null ? ladderCustomGestureDetector.ordinal() : -1)) {
            }
        } else if ((i & 3072) != 2048) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == companion.getEmpty()) {
            C17483xb3a2d7f0 c17483xb3a2d7f0 = new C17483xb3a2d7f0(group, num, ladderCustomGestureDetector, snapshotState2, null);
            snapshotState = snapshotState2;
            composer.updateRememberedValue(c17483xb3a2d7f0);
            objRememberedValue2 = c17483xb3a2d7f0;
        } else {
            snapshotState = snapshotState2;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(group, num, ladderCustomGestureDetector, (Function2) objRememberedValue2, composer, (i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i >> 3) & 896));
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new PillStackMovementData.Settings(((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14884topBackgroundColorvNxB06k(futuresOrderSide), ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14877bottomBackgroundColorvNxB06k(futuresOrderSide), bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), futuresOrderSide, null), composer, 0);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnimatedPendingOrderPillStackKt.rememberPillStackTransitionDataState$lambda$7$lambda$6(snapshotState);
                }
            });
            composer.updateRememberedValue(objRememberedValue3);
        }
        final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnimatedPendingOrderPillStackKt.rememberPillStackTransitionDataState$lambda$10$lambda$9(snapshotState, snapshotState4RememberUpdatedState, snapshotState4);
                }
            });
            composer.updateRememberedValue(objRememberedValue4);
        }
        SnapshotState4<PillStackMovementData> snapshotState42 = (SnapshotState4) objRememberedValue4;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState42;
    }
}
